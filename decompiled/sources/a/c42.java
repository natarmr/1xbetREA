package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public final class c42 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3704a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ c42(Function0 function0, byte b) {
        this.f3704a = b;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f3704a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                function0.invoke();
                break;
            default:
                fet fetVar = (fet) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarN = o7k0.n(jm40Var, 56.0f);
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (objP == cl5Var) {
                        objP = dw9.j(fetVar);
                    }
                    gy40 gy40Var = (gy40) objP;
                    boolean zG = fetVar.g(function0);
                    Object objP2 = fetVar.P();
                    if (zG || objP2 == cl5Var) {
                        objP2 = new lfk(function0, (byte) 1);
                        fetVar.o0(objP2);
                    }
                    mm40 mm40VarW = y860.W(mm40VarN, gy40Var, null, false, null, (Function0) objP2, 28);
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    dww.c(a8k0.F(R.drawable.ic_glyph_arrow_left, 0, fetVar), null, s5x0.J(o7k0.n(jm40Var, 36.0f), 6.0f), ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU(), fetVar, 56, 0);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
