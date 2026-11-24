package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xplatform.statistic.tennis.impl.summary.domain.models.TennisSurfaceType;

/* JADX INFO: loaded from: classes6.dex */
public final class osc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xyp0 f25776a;

    public osc(xyp0 xyp0Var, byte b) {
        xyp0Var.getClass();
        switch (b) {
            case 1:
                this.f25776a = xyp0Var;
                break;
            default:
                this.f25776a = xyp0Var;
                break;
        }
    }

    public List a(String str) {
        str.getClass();
        List list = (List) this.f25776a.c.f34767a.f22569a.get(str);
        if (list == null) {
            return iun.f15405a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((uyp0) obj).b != TennisSurfaceType.UNKNOWN) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((uyp0) it.next()).b);
        }
        return arrayList2;
    }
}
