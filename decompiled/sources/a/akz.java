package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class akz implements gz9 {
    public final int b;

    public akz(int i) {
        this.b = i;
    }

    @Override // a.gz9
    public final List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j0a j0aVar = (j0a) it.next();
            z1x.t("The camera info doesn't contain internal implementation.", j0aVar instanceof n0a);
            if (j0aVar.h() == this.b) {
                arrayList.add(j0aVar);
            }
        }
        return arrayList;
    }
}
