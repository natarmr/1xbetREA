package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class t5n0 extends dr30 {
    public final ym40 b;
    public final swq c;

    public t5n0(ym40 ym40Var, swq swqVar) {
        ym40Var.getClass();
        swqVar.getClass();
        this.b = ym40Var;
        this.c = swqVar;
    }

    @Override // a.dr30, a.cr30
    public final Collection b(cek cekVar, Function1 function1) {
        cekVar.getClass();
        if (!cekVar.a(cek.h)) {
            return iun.f15405a;
        }
        swq swqVar = this.c;
        if (swqVar.f32934a.c() && cekVar.f4217a.contains(ydk.f42443a)) {
            return iun.f15405a;
        }
        ym40 ym40Var = this.b;
        Collection collectionN = ym40Var.n(swqVar, function1);
        ArrayList arrayList = new ArrayList(collectionN.size());
        Iterator it = collectionN.iterator();
        while (it.hasNext()) {
            g950 g950VarG = ((swq) it.next()).f32934a.g();
            if (((Boolean) function1.invoke(g950VarG)).booleanValue()) {
                g950VarG.getClass();
                gdz gdzVar = null;
                if (!g950VarG.b) {
                    gdz gdzVarC0 = ym40Var.c0(swqVar.a(g950VarG));
                    if (!((Boolean) yqm0.s(gdzVarC0.g, gdz.i[1])).booleanValue()) {
                        gdzVar = gdzVarC0;
                    }
                }
                if (gdzVar != null) {
                    arrayList.add(gdzVar);
                }
            }
        }
        return arrayList;
    }

    @Override // a.dr30, a.cr30
    public final Set e() {
        return xun.f41520a;
    }

    public final String toString() {
        return "subpackages of " + this.c + " from " + this.b;
    }
}
