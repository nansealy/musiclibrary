package com.netcracker.musiclibrary.data;

import java.io.Serializable;
import java.time.Duration;

/**
 * Record Track containing fields: name ,singer ,album, recordLength
 * @param name - Name of Track
 * @param  singer - Singer's nickname
 * @param  album - Name of Album
 * @param recordLength - Track recording length
 * @see Genre
 */
public record Track (String name, String singer, String album, Duration recordLength, Genre genre) implements Serializable {

}
