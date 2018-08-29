package org.metaborg.lang.tiger.ninterpreter;

import com.github.krukow.clj_lang.IPersistentMap;
import com.github.krukow.clj_lang.PersistentHashMap;

public class TigerPersistentHeap implements TigerHeap {

	@SuppressWarnings("unchecked")
	private IPersistentMap<Integer, TigerObject> heap = PersistentHashMap.EMPTY;

	private int nextAddress = Integer.MIN_VALUE;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.metaborg.lang.tiger.ninterpreter.TigerHeap#allocate(org.metaborg.lang.
	 * tiger.ninterpreter.TigerObject)
	 */
	@Override
	public int allocate(TigerObject v) {
		heap = heap.assoc(nextAddress, v);
		return nextAddress++;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.metaborg.lang.tiger.ninterpreter.TigerHeap#write(int,
	 * org.metaborg.lang.tiger.ninterpreter.TigerObject)
	 */
	@Override
	public void write(int a, TigerObject v) {
		heap = heap.assoc(a, v);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.metaborg.lang.tiger.ninterpreter.TigerHeap#read(int)
	 */
	@Override
	public TigerObject read(int a) {
		return heap.valAt(a);
	}

}