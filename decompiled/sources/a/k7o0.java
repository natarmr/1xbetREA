package a;

import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class k7o0 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i7o0 f17833a;
    public final ctf0 b;
    public final g2v c;
    public final long d;
    public final n0o0 e;
    public final n0o0 f;

    public k7o0(i7o0 i7o0Var, ctf0 ctf0Var, g2v g2vVar, long j) {
        ctf0Var.getClass();
        this.f17833a = i7o0Var;
        this.b = ctf0Var;
        this.c = g2vVar;
        this.d = j;
        this.e = maz.b(new yw9(i7o0Var, new rgn0((byte) 19), (byte) 20));
        this.f = maz.b(new yw9(i7o0Var, new ttn0(this, (byte) 4), (byte) 20));
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        a4x a4xVarO0;
        i7o0 i7o0Var = (i7o0) obj;
        i7o0Var.getClass();
        n0o0 n0o0Var = this.e;
        ((fee) n0o0Var.getValue()).d(i7o0Var);
        n0o0 n0o0Var2 = this.f;
        ((fee) n0o0Var2.getValue()).d(i7o0Var);
        boolean z = i7o0Var.f;
        List list = i7o0Var.d;
        if (z) {
            v5l0 v5l0Var = this.f17833a.g.g.y;
            ArrayList arrayList = new ArrayList(5);
            for (int i = 0; i < 5; i++) {
                arrayList.add(new f7o0(twn.m(i, "RESULTS_SHIMMER"), pzw.I(v5l0Var), true));
            }
            a4xVarO0 = dyb.o0(arrayList);
        } else {
            a4xVarO0 = list != null ? dyb.o0((Iterable) ((fee) n0o0Var2.getValue()).b()) : lak0.c;
        }
        long j = this.d;
        g2v g2vVar = this.c;
        return new j7o0((y6o0) ((fee) n0o0Var.getValue()).b(), (list != null || z) ? a4xVarO0.isEmpty() ? new a7o0(g2v.b(g2vVar, ozb.L(j, pb10.v), null, null, 0, 0, R.string.empty_results, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE)) : z6o0.f43880a : new a7o0(g2v.b(g2vVar, ozb.L(j, pb10.v), null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE)), a4xVarO0, z);
    }
}
