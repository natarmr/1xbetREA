package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class hcc implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f12815a;
    public final /* synthetic */ vxl b;
    public final /* synthetic */ syl c;
    public final /* synthetic */ jyl d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ Function1 g;

    public hcc(List list, vxl vxlVar, syl sylVar, jyl jylVar, boolean z, Function1 function1, Function1 function2) {
        this.f12815a = list;
        this.b = vxlVar;
        this.c = sylVar;
        this.d = jylVar;
        this.e = z;
        this.f = function1;
        this.g = function2;
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
            lxl lxlVar = (lxl) this.f12815a.get(iIntValue);
            fetVar.e0(-1437265714);
            lcc.c(this.b, lcc.g(lxlVar, fetVar), this.c, this.d, this.e, this.f, this.g, fetVar, 0);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }
}
