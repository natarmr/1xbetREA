package a;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class dtn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f6664a = 1;
    public final td40 b;
    public td40 c;
    public td40 d;
    public int e;
    public int f;

    public dtn(td40 td40Var) {
        this.b = td40Var;
        this.c = td40Var;
    }

    public final void a() {
        this.f6664a = (byte) 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        nd40 nd40VarB = this.c.b.b();
        int iA = nd40VarB.a(6);
        return !(iA == 0 || ((ByteBuffer) nd40VarB.d).get(iA + nd40VarB.f15098a) == 0) || this.e == 65039;
    }
}
