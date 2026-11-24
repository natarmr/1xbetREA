package a;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class kpd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f18669a;

    public kpd0(ArrayList arrayList) {
        this.f18669a = new ArrayList(arrayList);
    }

    public static String d(kpd0 kpd0Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = kpd0Var.f18669a.iterator();
        while (it.hasNext()) {
            arrayList.add(((gpd0) it.next()).getClass().getSimpleName());
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            while (true) {
                sb.append((CharSequence) it2.next());
                if (!it2.hasNext()) {
                    break;
                }
                sb.append((CharSequence) " | ");
            }
        }
        return sb.toString();
    }

    public final boolean a(Class cls) {
        Iterator it = this.f18669a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((gpd0) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public final gpd0 b(Class cls) {
        for (gpd0 gpd0Var : this.f18669a) {
            if (gpd0Var.getClass() == cls) {
                return gpd0Var;
            }
        }
        return null;
    }

    public final ArrayList c(Class cls) {
        ArrayList arrayList = new ArrayList();
        for (gpd0 gpd0Var : this.f18669a) {
            if (cls.isAssignableFrom(gpd0Var.getClass())) {
                arrayList.add(gpd0Var);
            }
        }
        return arrayList;
    }
}
