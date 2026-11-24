package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class tq30 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34362a;
    public final xq30 b;
    public final p3d0 c;
    public final rfk d;

    public /* synthetic */ tq30(xq30 xq30Var, p3d0 p3d0Var, rfk rfkVar, byte b) {
        this.f34362a = b;
        this.b = xq30Var;
        this.c = p3d0Var;
        this.d = rfkVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f34362a;
        rfk rfkVar = this.d;
        p3d0 p3d0Var = this.c;
        xq30 xq30Var = this.b;
        switch (b) {
            case 0:
                eu00 eu00Var = (eu00) ((f6i) xq30Var.f41296a.f10647a).e;
                tq30 tq30Var = new tq30(xq30Var, p3d0Var, rfkVar, (byte) 2);
                eu00Var.getClass();
                return new bu00(eu00Var, tq30Var);
            case 1:
                eu00 eu00Var2 = (eu00) ((f6i) xq30Var.f41296a.f10647a).e;
                tq30 tq30Var2 = new tq30(xq30Var, p3d0Var, rfkVar, (byte) 3);
                eu00Var2.getClass();
                return new bu00(eu00Var2, tq30Var2);
            case 2:
                g45 g45Var = xq30Var.f41296a;
                v0 v0VarA = xq30Var.a((vjj) g45Var.c);
                v0VarA.getClass();
                m83 m83Var = (m83) ((f6i) g45Var.f10647a).g;
                wsy returnType = rfkVar.getReturnType();
                returnType.getClass();
                return (r2e) m83Var.c(v0VarA, p3d0Var, returnType);
            default:
                g45 g45Var2 = xq30Var.f41296a;
                v0 v0VarA2 = xq30Var.a((vjj) g45Var2.c);
                v0VarA2.getClass();
                m83 m83Var2 = (m83) ((f6i) g45Var2.f10647a).g;
                wsy returnType2 = rfkVar.getReturnType();
                returnType2.getClass();
                return (r2e) m83Var2.i(v0VarA2, p3d0Var, returnType2);
        }
    }
}
