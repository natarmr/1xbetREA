package a;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes2.dex */
public final class jow0 extends cow0 {
    public final /* synthetic */ kow0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jow0(kow0 kow0Var) {
        super((byte) 2);
        this.f = kow0Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        mow0 mow0Var = this.f.g;
        return new AbstractMap.SimpleImmutableEntry(mow0Var.c.i.get(i), mow0Var.d.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f.g.d.size();
    }
}
