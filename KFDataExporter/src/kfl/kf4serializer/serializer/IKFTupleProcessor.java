package kfl.kf4serializer.serializer;

import org.zoolib.ZID;
import org.zoolib.ZTuple;

public interface IKFTupleProcessor {
	public void processOne(ZID id, ZTuple tuple) throws Exception;
}
