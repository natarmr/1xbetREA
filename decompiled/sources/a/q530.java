package a;

/* JADX INFO: loaded from: classes4.dex */
public final class q530 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n530 f28131a;

    public q530(n530 n530Var) {
        n530Var.getClass();
        this.f28131a = n530Var;
    }

    public final gmq a(long j) {
        n530 n530Var = this.f28131a;
        qoj0 qoj0Var = n530Var.c;
        l87 l87Var = new l87(n530Var, j, null);
        int i = aoq.f1214a;
        a1g a1gVar = new a1g(qoj0Var, l87Var, (byte) 21);
        if (i > 0) {
            return i == 1 ? new i89(a1gVar, (byte) 21) : new ptb(a1gVar, i, kotlin.coroutines.g.f46065a, -2, i99.f14377a);
        }
        c99.s(twn.m(i, "Expected positive concurrency level, but had "));
        return null;
    }
}
