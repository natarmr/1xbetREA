package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class vcf0 extends b4x {
    public final transient Object[] c;
    public final transient boolean d;
    public final transient int e;

    /* JADX WARN: Multi-variable type inference failed */
    public vcf0(Object[] objArr, int i, int i2) {
        this.c = objArr;
        this.d = i;
        this.e = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        x0x.D(i, this.e);
        Object obj = this.c[(i * 2) + (this.d ? 1 : 0)];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // a.s3x
    public final boolean i() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
