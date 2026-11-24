package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class ebm implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f7525a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Function2 d;
    public final /* synthetic */ jbm e;

    public ebm(List list, boolean z, long j, Function2 function2, jbm jbmVar) {
        this.f7525a = list;
        this.b = z;
        this.c = j;
        this.d = function2;
        this.e = jbmVar;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        g9z g9zVar = (g9z) obj;
        int iIntValue = ((Number) obj2).intValue();
        fet fetVar = (fet) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (fetVar.g(g9zVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= fetVar.e(iIntValue) ? 32 : 16;
        }
        if (fetVar.U(i & 1, (i & 147) != 146)) {
            ibm ibmVar = (ibm) this.f7525a.get(iIntValue);
            fetVar.e0(-585316645);
            Function2 function2 = this.d;
            boolean zG = fetVar.g(function2);
            jbm jbmVar = this.e;
            boolean zG2 = zG | fetVar.g(jbmVar);
            Object objP = fetVar.P();
            if (zG2 || objP == ukd.f35823a) {
                objP = new dbm(function2, jbmVar, (byte) 1);
                fetVar.o0(objP);
            }
            x4d0.B(ibmVar, this.b, this.c, (Function1) objP, fetVar, 0);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }
}
