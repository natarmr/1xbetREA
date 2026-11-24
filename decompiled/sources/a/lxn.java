package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lxn implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20823a = 0;
    public final /* synthetic */ t33 b;
    public final /* synthetic */ gzc c;
    public final /* synthetic */ s4u0 d;

    public /* synthetic */ lxn(t33 t33Var, gzc gzcVar, s4u0 s4u0Var) {
        this.b = t33Var;
        this.c = gzcVar;
        this.d = s4u0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f20823a;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        gzc gzcVar = this.c;
        t33 t33Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    s4u0 s4u0Var = this.d;
                    if (s4u0Var == null) {
                        fetVar.e0(1345401451);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(1345401452);
                        boolean zI = fetVar.i(t33Var);
                        Object objP = fetVar.P();
                        if (zI || objP == cl5Var) {
                            objP = new m53(t33Var, (byte) 12);
                            fetVar.o0(objP);
                        }
                        dww.c(s4u0Var, null, s5x0.J(i120.Q(o7k0.n(i4w0.T(jm40Var, (Function1) objP), gzcVar.f), gzcVar.c, vgg0.a(gzcVar.d)), gzcVar.e), gzcVar.b, fetVar, 56, 0);
                        fetVar.r(false);
                    }
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zI2 = fetVar2.i(t33Var);
                    Object objP2 = fetVar2.P();
                    if (zI2 || objP2 == cl5Var) {
                        objP2 = new m53(t33Var, (byte) 11);
                        fetVar2.o0(objP2);
                    }
                    dww.c(this.d, null, s5x0.J(i120.Q(o7k0.n(i4w0.T(jm40Var, (Function1) objP2), gzcVar.f), gzcVar.c, vgg0.a(gzcVar.d)), gzcVar.e), gzcVar.b, fetVar2, 56, 0);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ lxn(s4u0 s4u0Var, t33 t33Var, gzc gzcVar) {
        this.d = s4u0Var;
        this.b = t33Var;
        this.c = gzcVar;
    }
}
