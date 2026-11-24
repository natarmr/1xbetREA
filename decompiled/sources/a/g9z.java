package a;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g9z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public cgk0 f10940a;
    public cgk0 b;

    public static /* synthetic */ mm40 b(g9z g9zVar, mm40 mm40Var, nul0 nul0Var, int i) {
        nul0 nul0VarG0 = ro4.g0(0.0f, 400.0f, null, 5);
        if ((i & 2) != 0) {
            Map map = quu0.f29360a;
            nul0Var = ro4.g0(0.0f, 400.0f, new ikx(4294967297L), 1);
        }
        return g9zVar.a(mm40Var, nul0VarG0, nul0Var, ro4.g0(0.0f, 400.0f, null, 5));
    }

    public static mm40 c(g9z g9zVar) {
        return new lp80(1.0f, g9zVar.f10940a, g9zVar.b);
    }

    public final mm40 a(mm40 mm40Var, cfq cfqVar, cfq cfqVar2, cfq cfqVar3) {
        return (cfqVar == null && cfqVar2 == null && cfqVar3 == null) ? mm40Var : mm40Var.e(new naz(cfqVar, cfqVar2, cfqVar3));
    }

    public final mm40 d(float f) {
        return new lp80(f, this.f10940a, null, 4);
    }
}
