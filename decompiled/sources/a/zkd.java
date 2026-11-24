package a;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public class zkd extends j {
    public final List e;

    /* JADX WARN: Illegal instructions before constructor call */
    public zkd(ar20 ar20Var, List list) {
        ar20Var.getClass();
        list.getClass();
        j jVar = (j) CollectionsKt.firstOrNull(list);
        int i = jVar != null ? jVar.b : 0;
        j jVar2 = (j) CollectionsKt.f0(list);
        super(ar20Var, i, jVar2 != null ? jVar2.c : 0);
        this.e = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j jVar3 = (j) it.next();
            if (jVar3 != null) {
                jVar3.d = this;
            }
        }
    }

    @Override // a.j
    public final List a() {
        return this.e;
    }
}
