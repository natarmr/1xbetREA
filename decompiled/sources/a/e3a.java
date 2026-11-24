package a;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class e3a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7123a;

    public e3a(List list) {
        list.getClass();
        this.f7123a = list;
        gf80 gf80Var = (gf80) CollectionsKt.U(list);
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((gf80) it.next()).b != gf80Var.b) {
                jf4.n("All outputs must have the same format!");
                throw null;
            }
        }
    }

    public final String toString() {
        return dw9.r(new StringBuilder("CameraStream.Config(outputs="), this.f7123a, ", imageSourceConfig=null)");
    }
}
