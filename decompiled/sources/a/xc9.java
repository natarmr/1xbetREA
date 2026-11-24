package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class xc9 implements klc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eu00 f40634a;
    public final ym40 b;

    public xc9(eu00 eu00Var, zm40 zm40Var) {
        zm40Var.getClass();
        this.f40634a = eu00Var;
        this.b = zm40Var;
    }

    @Override // a.klc
    public final boolean a(swq swqVar, g950 g950Var) {
        swqVar.getClass();
        g950Var.getClass();
        String strB = g950Var.b();
        strB.getClass();
        return (kotlin.text.c.x(strB, "Function", false) || kotlin.text.c.x(strB, "KFunction", false) || kotlin.text.c.x(strB, "SuspendFunction", false) || kotlin.text.c.x(strB, "KSuspendFunction", false)) && yer.c.a(swqVar, strB) != null;
    }

    @Override // a.klc
    public final wm40 b(qlc qlcVar) {
        swq swqVar;
        xer xerVarA;
        qlcVar.getClass();
        if (!qlcVar.c && !qlcVar.g()) {
            String str = qlcVar.b.f32934a.f34663a;
            if (StringsKt.O(str, "Function", false) && (xerVarA = yer.c.a((swqVar = qlcVar.f28927a), str)) != null) {
                wer werVar = xerVarA.f40756a;
                int i = xerVarA.b;
                List list = (List) yqm0.s(this.b.c0(swqVar).f, gdz.i[0]);
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof ed9) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                if (CollectionsKt.firstOrNull(arrayList2) == null) {
                    return new ier(this.f40634a, (ed9) CollectionsKt.U(arrayList), werVar, i);
                }
                hny.b();
            }
        }
        return null;
    }

    @Override // a.klc
    public final Collection c(swq swqVar) {
        swqVar.getClass();
        return xun.f41520a;
    }
}
