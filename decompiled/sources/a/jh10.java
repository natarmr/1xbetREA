package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class jh10 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16505a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ l7m0 d;

    public /* synthetic */ jh10(Function1 function1, l7m0 l7m0Var, l7m0 l7m0Var2, byte b) {
        this.f16505a = b;
        this.b = function1;
        this.c = l7m0Var;
        this.d = l7m0Var2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f16505a;
        pcy pcyVar = e7z.u1;
        l7m0 l7m0Var = this.d;
        l7m0 l7m0Var2 = this.c;
        jm40 jm40Var = jm40.b;
        Function1 function1 = this.b;
        cl5 cl5Var = ukd.f35823a;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = o7k0.n(jm40Var, 56.0f);
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new cnn(function1, (byte) 15);
                        fetVar.o0(objP);
                    }
                    mm40 mm40VarW = y860.W(mm40VarN, null, null, false, null, (Function0) objP, 28);
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    mm40 mm40VarN2 = o7k0.n(jm40Var, 36.0f);
                    boolean zG2 = fetVar.g(l7m0Var2);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new eb3(l7m0Var2, (byte) 7);
                        fetVar.o0(objP2);
                    }
                    dww.b(jpm0.t(R.drawable.ic_glyph_arrow_left, 6, fetVar), null, s5x0.J(rq8.K(mm40VarN2, (Function1) objP2), 6.0f), ((y3d) l7m0Var.getValue()).f41946a, fetVar, 48, 0);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarN3 = o7k0.n(jm40Var, 56.0f);
                    boolean zG3 = fetVar2.g(function1);
                    Object objP3 = fetVar2.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new cnn(function1, (byte) 16);
                        fetVar2.o0(objP3);
                    }
                    mm40 mm40VarW2 = y860.W(mm40VarN3, null, null, false, null, (Function0) objP3, 28);
                    tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarW2);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC2, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM2, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, gqw0.v);
                    mm40 mm40VarN4 = o7k0.n(jm40Var, 36.0f);
                    boolean zG4 = fetVar2.g(l7m0Var2);
                    Object objP4 = fetVar2.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new eb3(l7m0Var2, (byte) 10);
                        fetVar2.o0(objP4);
                    }
                    dww.b(jpm0.t(R.drawable.ic_glyph_info_circle, 6, fetVar2), null, s5x0.J(rq8.K(mm40VarN4, (Function1) objP4), 6.0f), ((y3d) l7m0Var.getValue()).f41946a, fetVar2, 48, 0);
                    fetVar2.r(true);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
