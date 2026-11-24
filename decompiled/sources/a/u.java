package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class u implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34828a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ u(l0 l0Var, byte b) {
        this.f34828a = b;
        this.b = l0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f34828a;
        l0 l0Var = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ay3.I(u1c.M(-2062314830, new u(l0Var, b2), fetVar), fetVar, 6);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    String str = l0Var.f19173a;
                    k0 k0Var = l0Var.e;
                    ay3.z(str, fetVar2, 0);
                    List listJ = q3d.j(new Pair(Integer.valueOf(R.string.cyber_champ_dates_new), l0Var.b), new Pair(Integer.valueOf(R.string.cyber_champ_type), l0Var.c), new Pair(Integer.valueOf(R.string.cyber_champ_location), l0Var.d));
                    ArrayList<Pair> arrayList = new ArrayList();
                    for (Object obj4 : listJ) {
                        if (((CharSequence) ((Pair) obj4).b).length() > 0) {
                            arrayList.add(obj4);
                        }
                    }
                    zcl zclVar = qmk.f28987a;
                    x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(e7z.u1);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    fetVar2.e0(-1883245587);
                    for (Pair pair : arrayList) {
                        ay3.t(((Number) pair.f46059a).intValue(), 0, fetVar2, (String) pair.b);
                    }
                    fetVar2.r(false);
                    fetVar2.r(true);
                    if (k0Var.getValue().length() > 0) {
                        fetVar2.e0(1086747652);
                        v8q0.a(k0Var.getValue(), hp4.B(jm40Var), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar2, 0, 0, 131064);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(1087023056);
                        fetVar2.r(false);
                    }
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
