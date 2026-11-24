package a;

import android.graphics.Rect;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface n0a extends j0a {
    default void D(nhf0 nhf0Var) {
        nhf0Var.getClass();
        osm0.f25789a = nhf0Var;
    }

    Set G();

    boolean M();

    Set a();

    @Override // a.j0a
    default n2a c() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new gz9() { // from class: a.m0a
            @Override // a.gz9
            public final List a(List list) {
                String strE = this.b.e();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    j0a j0aVar = (j0a) it.next();
                    z1x.u(j0aVar instanceof n0a);
                    if (((n0a) j0aVar).e().equals(strE)) {
                        return Collections.singletonList(j0aVar);
                    }
                }
                jf4.n(kng0.l("Unable to find camera with id ", strE, " from list of available cameras."));
                return null;
            }
        });
        linkedHashSet.add(new akz(h()));
        return new n2a(linkedHashSet);
    }

    String e();

    void f(vx9 vx9Var);

    Rect g();

    List i(int i);

    Object j();

    kpd0 o();

    List p(int i);

    Set s();

    boolean t();

    void z(Executor executor, yub0 yub0Var);

    default n0a u() {
        return this;
    }
}
