package a;

import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class oid0 implements iu5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25305a;
    public final String b;
    public final /* synthetic */ qid0 c;

    public oid0(qid0 qid0Var, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.c = qid0Var;
        this.f25305a = str;
        this.b = str2;
    }

    @Override // a.iu5
    public final void b(lu5 lu5Var) {
        i0g0 i0g0Var = lu5Var.f20658a;
        rl70 rl70Var = qid0.V1;
        qid0 qid0Var = this.c;
        qid0Var.G0().c.d();
        ((kb6) qid0Var.R1.getValue()).a();
        String str = i0g0Var.f13947a;
        if (str == null || str.length() == 0) {
            return;
        }
        qid0Var.n0().r().t0(i120.V(new Pair(this.b, str)), this.f25305a);
        ((sid0) qid0Var.N1.getValue()).w();
    }
}
