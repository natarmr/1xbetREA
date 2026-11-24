package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class lvo implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20724a;
    public final /* synthetic */ List b;
    public final /* synthetic */ List c;

    public /* synthetic */ lvo(List list, List list2, byte b) {
        this.f20724a = b;
        this.b = list;
        this.c = list2;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        byte b = this.f20724a;
        jm40 jm40Var = jm40.b;
        List list = this.c;
        List list2 = this.b;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar.g(g9zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar.e(iIntValue) ? 32 : 16;
                }
                if (fetVar.U(i & 1, (i & 147) != 146)) {
                    String str = (String) list2.get(iIntValue);
                    fetVar.e0(203732666);
                    l8x.u(0, 11, fetVar, null, null, str);
                    if (iIntValue == q3d.i(list)) {
                        fetVar.e0(203829726);
                        zcl zclVar = qmk.f28987a;
                        rz4.t(jm40Var, 28.0f, fetVar, false);
                    } else {
                        fetVar.e0(203908528);
                        fetVar.r(false);
                    }
                    fetVar.r(false);
                } else {
                    fetVar.X();
                }
                break;
            default:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar2.g(g9zVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar2.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
                    String str2 = (String) list2.get(iIntValue3);
                    fetVar2.e0(1366568306);
                    q5x.l(str2, fetVar2, 0);
                    if (iIntValue3 == q3d.i(list)) {
                        fetVar2.e0(1366624043);
                        zcl zclVar2 = qmk.f28987a;
                        rz4.t(jm40Var, 28.0f, fetVar2, false);
                    } else {
                        fetVar2.e0(1366702845);
                        fetVar2.r(false);
                    }
                    fetVar2.r(false);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
