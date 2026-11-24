package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class dtl implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f6660a;
    public final /* synthetic */ lq5 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Integer d;
    public final /* synthetic */ Function2 e;

    public dtl(List list, lq5 lq5Var, int i, Integer num, Function2 function2) {
        this.f6660a = list;
        this.b = lq5Var;
        this.c = i;
        this.d = num;
        this.e = function2;
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
            fr5 fr5Var = (fr5) this.f6660a.get(iIntValue);
            fetVar.e0(-385279250);
            q0x.z(null, fr5Var, ((jq5) this.b).f16933a, this.c, this.d, this.e, fetVar, 0);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }
}
