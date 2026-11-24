package a;

import java.util.AbstractCollection;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d4 extends AbstractCollection implements Collection, lhy {
    public abstract int b();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return b();
    }
}
