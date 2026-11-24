package a;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class scf0 extends b4x {
    public final /* synthetic */ tcf0 c;

    public scf0(tcf0 tcf0Var) {
        this.c = tcf0Var;
    }

    @Override // java.util.List
    public final Object get(int i) {
        tcf0 tcf0Var = this.c;
        x0x.D(i, tcf0Var.f);
        Object[] objArr = tcf0Var.e;
        int i2 = i * 2;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // a.s3x
    public final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.f;
    }
}
