package kotlinx.coroutines.test.internal;

import a.dh40;
import a.i1q0;
import a.vs10;
import a.xs10;
import a.yip0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/test/internal/TestMainDispatcherFactory;", "La/xs10;", "kotlinx-coroutines-test"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TestMainDispatcherFactory implements xs10 {
    @Override // a.xs10
    public final vs10 a(List list) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((xs10) obj2) != this) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int iB = ((xs10) next).b();
                do {
                    Object next2 = it.next();
                    int iB2 = ((xs10) next2).b();
                    if (iB < iB2) {
                        next = next2;
                        iB = iB2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        xs10 xs10Var = (xs10) obj;
        if (xs10Var == null) {
            xs10Var = dh40.f6076a;
        }
        return new i1q0(new yip0(xs10Var, arrayList, this));
    }

    @Override // a.xs10
    public final int b() {
        return Integer.MAX_VALUE;
    }
}
