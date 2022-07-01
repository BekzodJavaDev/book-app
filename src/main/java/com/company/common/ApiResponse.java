package com.company.common;

import java.time.LocalDateTime;

public record ApiResponse(boolean success, String message) {
	public String getTimestamp() {
		return LocalDateTime.now().toString();
	}
}
