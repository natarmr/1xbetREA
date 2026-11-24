package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class dom implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6421a;
    public final /* synthetic */ List b;
    public final /* synthetic */ mm40 c;
    public final /* synthetic */ hzc0 d;
    public final /* synthetic */ Integer e;
    public final /* synthetic */ Function2 f;

    public /* synthetic */ dom(List list, mm40 mm40Var, hzc0 hzc0Var, Integer num, Function2 function2, byte b) {
        this.f6421a = b;
        this.b = list;
        this.c = mm40Var;
        this.d = hzc0Var;
        this.e = num;
        this.f = function2;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        byte b = this.f6421a;
        List list = this.b;
        switch (b) {
            case 0:
                k8z k8zVar = (k8z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar.g(k8zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar.e(iIntValue) ? 32 : 16;
                }
                if (fetVar.U(i & 1, (i & 147) != 146)) {
                    kzc0 kzc0Var = (kzc0) list.get(iIntValue);
                    fetVar.e0(-1851545536);
                    uzb.t(this.c, kzc0Var, this.d, this.e, this.f, fetVar, 0);
                    fetVar.r(false);
                } else {
                    fetVar.X();
                }
                break;
            default:
                g9z g9zVar = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar2.g(g9zVar) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar2.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
                    kzc0 kzc0Var2 = (kzc0) list.get(iIntValue3);
                    fetVar2.e0(755607779);
                    uzb.t(this.c, kzc0Var2, this.d, this.e, this.f, fetVar2, 6);
                    fetVar2.r(false);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
