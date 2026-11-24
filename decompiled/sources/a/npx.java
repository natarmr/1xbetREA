package a;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class npx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final es f23932a;

    public /* synthetic */ npx(es esVar) {
        this.f23932a = esVar;
    }

    public boolean a(long j) {
        List listI = this.f23932a.i();
        if (listI != null && listI.isEmpty()) {
            return false;
        }
        Iterator it = listI.iterator();
        while (it.hasNext()) {
            if (j == ((pln) it.next()).c) {
                return true;
            }
        }
        return false;
    }
}
