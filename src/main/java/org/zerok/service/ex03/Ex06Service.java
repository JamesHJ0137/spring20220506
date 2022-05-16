package org.zerok.service.ex03;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerok.domain.ex02.ReplyDto;
import org.zerok.mapper.ex03.Ex04Mapper;

@Service
public class Ex06Service {

	@Autowired
	private Ex04Mapper mapper;
	
	public boolean addReply(ReplyDto reply) {
		reply.setInserted(LocalDateTime.now());
		
		int cnt = mapper.insertReply(reply);
		return cnt == 1;
	}

	public List<ReplyDto> listReplyByBoardId(int boardId) {
		return mapper.selectReplyByBoardId(boardId);
	}

	public boolean removeReplyById(int id) {

		int cnt = mapper.deleteReplyById(id);
		return cnt == 1;
	}

	public boolean modifyReply(ReplyDto reply) {

		int cnt = mapper.updateReply(reply);
		return cnt == 1;
	}
	
}