package org.nanotek;

import java.util.Collection;
import java.util.Optional;
import java.util.function.Supplier;

import org.nanotek.Base;

public interface Transferable {

	static <S extends Base<?> ,  SOURCE extends Collection<S>, DEST extends Collection<S>>
	DEST transferElements(
			SOURCE sourceCollection,
			Supplier<DEST> collectionFactory) {

		DEST result = collectionFactory.get();
		
		sourceCollection.stream().forEach(p -> result.add(Optional.of(p).filter(t -> t.getId() !=null).get()));
		
		return result;
	}
}
