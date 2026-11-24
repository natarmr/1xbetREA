package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class iio implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14837a;
    public final /* synthetic */ i3w b;

    public /* synthetic */ iio(i3w i3wVar, byte b) {
        this.f14837a = b;
        this.b = i3wVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f14837a;
        i3w i3wVar = this.b;
        byte b2 = 2;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarK0 = mrv.k0(jm40Var, "TITLE_TEXT");
                    zcl zclVar = qmk.f28987a;
                    thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK0);
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
                    dww.c(a8k0.F(R.drawable.ic_glyph_multievent, 0, fetVar), null, o7k0.n(jm40Var, 16.0f), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), fetVar, 56, 0);
                    obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1747406215, new iio(i3wVar, b2), fetVar), fetVar, 56);
                    v8q0.a(i3wVar.b, jm40Var, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 0, 0, qmk.G, 16646109), fetVar), fetVar, 48, 0, 131068);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    mm40 mm40VarK1 = mrv.k0(jm40.b, "DESCRIPTION_TEXT");
                    String str = i3wVar.c;
                    long j = qmk.q;
                    long j2 = qmk.s;
                    aad.e(str, mm40VarK1, y9q0.a(ibm0.t(new y9q0(0L, j2, null, j1t0.b, 0L, null, 0, 0, qmk.G, 16646109), fetVar2), 0L, 0L, null, null, null, 0L, null, null, 6, 0, 0L, null, null, 16744447), null, 2, false, 1, 0, null, new n05(j, j2, qmk.n), fetVar2, 1597488, 424);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
                    String str2 = i3wVar.f14117a;
                    long j3 = qmk.q;
                    long j4 = qmk.s;
                    aad.e(str2, x7zVar, ibm0.t(new y9q0(0L, j4, null, j1t0.b, 0L, null, 0, 0, qmk.G, 16646109), fetVar3), null, 2, false, 1, 0, null, new n05(j3, j4, qmk.n), fetVar3, 1597440, 424);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
