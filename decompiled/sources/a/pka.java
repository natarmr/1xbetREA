package a;

import kotlin.Unit;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pka implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27127a;
    public final /* synthetic */ wka b;

    public /* synthetic */ pka(wka wkaVar, byte b) {
        this.f27127a = b;
        this.b = wkaVar;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        byte b = this.f27127a;
        wka wkaVar = this.b;
        switch (b) {
            case 0:
                mm40 mm40Var = (mm40) obj2;
                fet fetVar = (fet) obj3;
                int iD = dw9.d((Integer) obj4, (y5d) obj, mm40Var);
                if ((iD & 48) == 0) {
                    iD |= fetVar.g(mm40Var) ? 32 : 16;
                }
                if (fetVar.U(iD & 1, (iD & 145) != 144)) {
                    zcl zclVar = qmk.f28987a;
                    ahy.k(o7k0.e(mm40Var, 24.0f), wkaVar.f39298a, fetVar);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                y5d y5dVar = (y5d) obj;
                mm40 mm40Var2 = (mm40) obj2;
                fet fetVar2 = (fet) obj3;
                int iD2 = dw9.d((Integer) obj4, y5dVar, mm40Var2);
                if ((iD2 & 6) == 0) {
                    i = (fetVar2.g(y5dVar) ? 4 : 2) | iD2;
                } else {
                    i = iD2;
                }
                if ((iD2 & 48) == 0) {
                    i |= fetVar2.g(mm40Var2) ? 32 : 16;
                }
                if (fetVar2.U(i & 1, (i & 147) != 146)) {
                    zcl zclVar2 = qmk.f28987a;
                    wdx.m(y5dVar.a(o7k0.s(jm40.b, 80.0f), gqw0.n), wkaVar.d, fetVar2, 0);
                    String str = wkaVar.e;
                    ((g1t0) fetVar2.k(j1t0.e)).getClass();
                    v8q0.a(str, mm40Var2, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar2, i & 112, 24960, 109560);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                mm40 mm40Var3 = (mm40) obj2;
                fet fetVar3 = (fet) obj3;
                int iD3 = dw9.d((Integer) obj4, (y5d) obj, mm40Var3);
                if ((iD3 & 48) == 0) {
                    iD3 |= fetVar3.g(mm40Var3) ? 32 : 16;
                }
                if (fetVar3.U(iD3 & 1, (iD3 & 145) != 144)) {
                    ccq0.e(mm40Var3, wkaVar.h, fetVar3);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
