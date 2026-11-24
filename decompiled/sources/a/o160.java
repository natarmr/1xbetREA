package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class o160 implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f24464a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function1 e;

    public o160(List list, mm40 mm40Var, boolean z, boolean z2, Function1 function1) {
        this.f24464a = list;
        this.b = mm40Var;
        this.c = z;
        this.d = z2;
        this.e = function1;
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
            a2n a2nVar = (a2n) this.f24464a.get(iIntValue);
            fetVar.e0(-1802676099);
            boolean z = this.d;
            boolean zH = fetVar.h(z);
            Function1 function1 = this.e;
            boolean zG = zH | fetVar.g(function1);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new n160(function1, z);
                fetVar.o0(objP);
            }
            nia0.x(this.b, a2nVar, this.c, (Function1) objP, fetVar, 6);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }
}
