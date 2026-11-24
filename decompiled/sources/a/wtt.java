package a;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wtt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pbt f39758a;

    public wtt(pbt pbtVar, byte b) {
        pbtVar.getClass();
        switch (b) {
            case 1:
                this.f39758a = pbtVar;
                break;
            default:
                this.f39758a = pbtVar;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002e  */
    public boolean a() {
        boolean z;
        Object next;
        pbt pbtVar = this.f39758a;
        List listA = pbtVar.d.a();
        if (listA != null) {
            Iterator it = listA.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((rq60) next).f30917a != 2);
            rq60 rq60Var = (rq60) next;
            if (rq60Var == null || !rq60Var.d) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        uub0 uub0Var = pbtVar.e;
        uub0Var.getClass();
        nh70 nh70Var = sub0.b;
        int i = uub0Var.f36291a.a().getInt("PreviewServiceStatusLocalDataSource.ACTIONS_KEY", 1);
        nh70Var.getClass();
        return z || (nh70.g(i) == sub0.SERVER_ERROR);
    }
}
