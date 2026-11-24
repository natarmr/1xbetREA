package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ a0(boolean z, Function0 function0, byte b) {
        this.f2a = b;
        this.b = z;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long separator60;
        byte b = this.f2a;
        Function0 function0 = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ay3.b(z, function0, (fet) obj, x8x.L(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ay3.i(z, function0, (fet) obj, x8x.L(1));
                break;
            case 2:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarN = o7k0.n(jm40Var, 48.0f);
                    boolean z2 = this.b;
                    mm40 mm40VarW = y860.W(mm40VarN, null, null, z2, null, this.c, 24);
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
                    pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_refresh, 0, fetVar);
                    if (z2) {
                        fetVar.e0(1297768229);
                        separator60 = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                    } else {
                        fetVar.e0(1297769287);
                        separator60 = ((ThemeColors) fetVar.k(zaq0.b)).getSeparator60();
                    }
                    fetVar.r(false);
                    dww.c(pm80VarF, null, o7k0.n(jm40Var, 24.0f), separator60, fetVar, 56, 0);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            case 3:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    qzb.n(null, new wul(qul.e, oe9.c, new te9(R.drawable.ic_glyph_chevron_right_small), this.b, false, false), this.c, fetVar2, 0, 1);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                rsr0.v(z, function0, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ a0(boolean z, Function0 function0, int i, byte b) {
        this.f2a = b;
        this.b = z;
        this.c = function0;
    }
}
