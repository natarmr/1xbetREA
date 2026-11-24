package a;

import java.net.UnknownHostException;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class tpe0 extends w46 {
    public final hnu b;
    public final abu c;
    public final s5k d;
    public final rne0 e;
    public final pzu f;
    public final duj g;
    public final sa10 h;
    public final p7m0 i;
    public final p7m0 j;
    public final int k;
    public int l;

    public tpe0(hnu hnuVar, abu abuVar, s5k s5kVar, rne0 rne0Var, pzu pzuVar, duj dujVar, sa10 sa10Var) {
        this.b = hnuVar;
        this.c = abuVar;
        this.d = s5kVar;
        this.e = rne0Var;
        this.f = pzuVar;
        this.g = dujVar;
        this.h = sa10Var;
        p7m0 p7m0VarA = q7m0.a(vpe0.f37800a);
        this.i = p7m0VarA;
        this.j = q7m0.a(Boolean.FALSE);
        this.k = (int) (System.currentTimeMillis() / 1000);
        p7m0VarA.o(null, vpe0.b);
        sac.V(jiu0.a(this), new d8e0(1, dujVar, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 16), null, null, new d7a0(this, null, (byte) 22), 14);
    }

    public final void w() {
        sac.i0(jiu0.a(this), tpe0.class.getName().concat(".loadData"), 3, 5L, kotlin.collections.a.c(oqt0.class), null, new spe0(this, null, (byte) 0), new tie0(this, (byte) 7), null, new d8e0(1, this, tpe0.class, "localHandleError", "localHandleError(Ljava/lang/Throwable;)V", 0, (byte) 17), null, 656);
    }

    public final void x(Throwable th) {
        if (!(th instanceof UnknownHostException) && !(th instanceof zhi0)) {
            this.g.a(th);
            return;
        }
        upe0 upe0Var = new upe0(sa10.b(this.h, pb10.g, R.string.data_retrieval_error, 0, null, 28));
        p7m0 p7m0Var = this.i;
        p7m0Var.getClass();
        p7m0Var.o(null, upe0Var);
    }
}
