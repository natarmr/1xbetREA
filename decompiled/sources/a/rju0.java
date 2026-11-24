package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class rju0 implements jju0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function1 f30615a;
    public xdr b;
    public Function1 c;

    @Override // a.jju0
    public final void a(int i, float f, int i2) {
        this.b.F(Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2));
    }

    @Override // a.jju0
    public final void b(int i) {
        this.f30615a.invoke(Integer.valueOf(i));
    }

    @Override // a.jju0
    public final void c(int i) {
        this.c.invoke(Integer.valueOf(i));
    }
}
