package a;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class q03 implements m9a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qcq0 f27875a;
    public final tz9 b;
    public final lrm0 c;

    public q03(qcq0 qcq0Var, tz9 tz9Var, lrm0 lrm0Var) {
        qcq0Var.getClass();
        this.f27875a = qcq0Var;
        this.b = tz9Var;
        this.c = lrm0Var;
    }

    @Override // a.m9a
    public final l9a a(yy9 yy9Var, Map map, r9a r9aVar) {
        int i;
        ArrayList arrayList;
        m2a m2aVar = m2a.g;
        yy9Var.getClass();
        map.getClass();
        r9aVar.getClass();
        tz9 tz9Var = this.b;
        int i2 = tz9Var.h;
        if (i2 == 0) {
            i = 0;
        } else if (i2 == 1) {
            i = 1;
        } else {
            if (i2 == 2) {
                ohq.k(dwi0.S(i2), "Unsupported session mode: ");
                return null;
            }
            i = i2;
        }
        te80 te80VarH = j2e.H(tz9Var, this.c, map);
        ArrayList arrayList2 = te80VarH.f33807a;
        if (arrayList2.isEmpty()) {
            Log.w("CXCP", "Failed to create OutputConfigurations for " + tz9Var);
            r9aVar.a();
            return m2aVar;
        }
        ArrayList arrayList3 = tz9Var.d;
        if (arrayList3 != null) {
            arrayList = new ArrayList(r3d.q(arrayList3, 10));
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                gf80 gf80Var = (gf80) CollectionsKt.v0(((ffx) it.next()).f9465a.f7123a);
                arrayList.add(new kex(gf80Var.f11196a.getWidth(), gf80Var.f11196a.getHeight(), gf80Var.b));
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((kex) it2.next()).c != ((kex) arrayList.get(0)).c) {
                    jf4.n("All InputStream.Config objects must have the same format for multi resolution");
                    return null;
                }
            }
        }
        if (yy9Var.r(new aji0(i, arrayList, arrayList2, (Executor) this.f27875a.j.getValue(), r9aVar, tz9Var.f, tz9Var.g))) {
            return new k9a(te80VarH.b, te80VarH.d);
        }
        Log.w("CXCP", "Failed to create capture session from " + yy9Var + " for " + r9aVar + '!');
        r9aVar.a();
        return m2aVar;
    }
}
