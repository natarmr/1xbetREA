package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class ynl implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42947a;
    public final /* synthetic */ List b;
    public final /* synthetic */ b0i c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function2 e;

    public /* synthetic */ ynl(List list, b0i b0iVar, Function1 function1, Function2 function2, byte b) {
        this.f42947a = b;
        this.b = list;
        this.c = b0iVar;
        this.d = function1;
        this.e = function2;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        byte b = this.f42947a;
        List list = this.b;
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
                    gol golVar = (gol) list.get(iIntValue);
                    fetVar.e0(-780730561);
                    wvb.j(null, golVar, this.c, this.d, this.e, fetVar, 0, 1);
                    fetVar.r(false);
                } else {
                    fetVar.X();
                }
                break;
            default:
                k8z k8zVar = (k8z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar2.g(k8zVar) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar2.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
                    gol golVar2 = (gol) list.get(iIntValue3);
                    fetVar2.e0(-689900155);
                    wvb.j(null, golVar2, this.c, this.d, this.e, fetVar2, 0, 1);
                    fetVar2.r(false);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
