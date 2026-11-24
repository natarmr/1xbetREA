package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vts0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38023a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ wts0 c;

    public /* synthetic */ vts0(mm40 mm40Var, wts0 wts0Var) {
        this.b = mm40Var;
        this.c = wts0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f38023a;
        wts0 wts0Var = this.c;
        mm40 mm40Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(o7k0.e(mm40Var, 32.0f), 0.0f, 1.0f, 0.0f, 0.0f, 13);
                    thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar, 54);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarE0 = o2e.e0(jm40Var, "TWENTY_ONE_TIMER_TITLE");
                    String str = wts0Var.f39757a;
                    wnq0 wnq0Var = wts0Var.b;
                    v8q0.a(str, mm40VarE0, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 48, 24576, 114680);
                    if (wnq0Var.f39460a) {
                        fetVar.e0(-1011044542);
                        q5x.f(wnq0Var, s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), fetVar, 0);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(-1010874445);
                        fetVar.r(false);
                    }
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                hxm0.a(mm40Var, wts0Var, (fet) obj, x8x.L(7));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ vts0(mm40 mm40Var, wts0 wts0Var, int i) {
        this.b = mm40Var;
        this.c = wts0Var;
    }
}
