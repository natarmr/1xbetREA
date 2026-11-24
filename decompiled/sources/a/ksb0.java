package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ksb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pys0 f18806a;
    public final List b;
    public final String c;
    public final ksb0 d;

    public ksb0(pys0 pys0Var, List list, String str) {
        list.getClass();
        this.f18806a = pys0Var;
        this.b = list;
        this.c = str;
        ksb0 ksb0Var = null;
        if (str != null) {
            pys0 pys0VarA = pys0Var != null ? pys0Var.a() : null;
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                pys0 pys0Var2 = (pys0) it.next();
                arrayList.add(pys0Var2 != null ? pys0Var2.a() : null);
            }
            ksb0Var = new ksb0(pys0VarA, arrayList, null);
        }
        this.d = ksb0Var;
    }
}
