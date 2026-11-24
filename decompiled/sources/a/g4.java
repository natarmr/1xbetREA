package a;

import java.util.AbstractSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g4 extends AbstractSet implements Set, vhy {
    public abstract int b();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return b();
    }
}
