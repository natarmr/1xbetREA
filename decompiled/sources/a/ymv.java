package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ymv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oif0 f42910a;

    public /* synthetic */ ymv(oif0 oif0Var) {
        this.f42910a = oif0Var;
    }

    public boolean a() {
        List listN = this.f42910a.n();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listN) {
            if (!((hf6) obj).c.isEmpty()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((hf6) it.next()).e) {
                return true;
            }
        }
        return false;
    }
}
