package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m5m0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21227a = 1;
    public final /* synthetic */ s4u0 b;
    public final /* synthetic */ t33 c;
    public final /* synthetic */ t33 d;
    public final /* synthetic */ gzc e;

    public /* synthetic */ m5m0(t33 t33Var, t33 t33Var2, gzc gzcVar, s4u0 s4u0Var) {
        this.c = t33Var;
        this.d = t33Var2;
        this.e = gzcVar;
        this.b = s4u0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f21227a;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        gzc gzcVar = this.e;
        t33 t33Var = this.d;
        t33 t33Var2 = this.c;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(1 & iIntValue, (iIntValue & 3) != 2)) {
                    boolean zI = fetVar.i(t33Var2) | fetVar.i(t33Var);
                    Object objP = fetVar.P();
                    if (zI || objP == cl5Var) {
                        objP = new o5m0(t33Var2, t33Var, (byte) 0);
                        fetVar.o0(objP);
                    }
                    dww.c(this.b, null, s5x0.J(i120.Q(o7k0.n(i4w0.T(jm40Var, (Function1) objP), gzcVar.f), gzcVar.c, vgg0.a(gzcVar.d)), gzcVar.e), gzcVar.b, fetVar, 56, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    s4u0 s4u0Var = this.b;
                    if (s4u0Var == null) {
                        fetVar2.e0(232429146);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(232429147);
                        boolean zI2 = fetVar2.i(t33Var2) | fetVar2.i(t33Var);
                        Object objP2 = fetVar2.P();
                        if (zI2 || objP2 == cl5Var) {
                            objP2 = new o5m0(t33Var2, t33Var, (byte) 2);
                            fetVar2.o0(objP2);
                        }
                        dww.c(s4u0Var, null, s5x0.J(i120.Q(o7k0.n(i4w0.T(jm40Var, (Function1) objP2), gzcVar.f), gzcVar.c, vgg0.a(gzcVar.d)), gzcVar.e), gzcVar.b, fetVar2, 56, 0);
                        fetVar2.r(false);
                    }
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ m5m0(s4u0 s4u0Var, t33 t33Var, t33 t33Var2, gzc gzcVar) {
        this.b = s4u0Var;
        this.c = t33Var;
        this.d = t33Var2;
        this.e = gzcVar;
    }
}
