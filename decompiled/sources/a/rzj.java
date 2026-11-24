package a;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class rzj implements pot0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o5d0 f31364a;
    public final tpt0 b;
    public volatile xot0 c;
    public final AtomicBoolean d;

    public rzj(o5d0 o5d0Var, tpt0 tpt0Var) {
        o5d0Var.getClass();
        tpt0Var.getClass();
        this.f31364a = o5d0Var;
        this.b = tpt0Var;
        this.d = new AtomicBoolean(false);
    }

    @Override // a.pot0
    public final List a(int i, int i2, int i3, ArrayList arrayList) {
        int size = arrayList.size();
        xot0 xot0Var = this.c;
        if (xot0Var != null) {
            return xot0Var.a(i, i2, i3, arrayList);
        }
        sje sjeVar = this.b.f;
        pzj pzjVar = new pzj(this, null, arrayList, i, i2, i3);
        yje yjeVar = null;
        kzj kzjVarM = qjj.M(sjeVar, null, pzjVar, 3);
        ArrayList arrayList2 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            arrayList2.add(qjj.M(this.b.f, null, new defpackage.e(kzjVarM, i4, yjeVar, (byte) 2), 3));
        }
        return arrayList2;
    }

    @Override // a.pot0
    public final jzj b(LinkedHashSet linkedHashSet, boolean z) {
        xot0 xot0Var = this.c;
        return xot0Var != null ? xot0Var.b(linkedHashSet, z) : qjj.M(this.b.f, null, new ys8(this, (yje) null, z, linkedHashSet), 3);
    }

    @Override // a.pot0
    public final void close() {
        if (this.d.getAndSet(true)) {
            return;
        }
        qjj.W(this.b.f, null, null, new wib((yje) null, this), 3);
    }

    @Override // a.pot0
    public final jzj d() {
        xot0 xot0Var = this.c;
        if (xot0Var != null) {
            return xot0Var.d();
        }
        return qjj.M(this.b.f, null, new ozj(this, null, (byte) 1), 3);
    }

    @Override // a.pot0
    public final jzj e() {
        xot0 xot0Var = this.c;
        if (xot0Var != null) {
            return xot0Var.e();
        }
        return qjj.M(this.b.f, null, new ozj(this, null, (byte) 2), 3);
    }

    @Override // a.pot0
    public final jzj f(List list, List list2, List list3) {
        xot0 xot0Var = this.c;
        return xot0Var != null ? xot0Var.f(list, list2, list3) : qjj.M(this.b.f, null, new ic1(this, (yje) null, list, list2, list3, (byte) 23), 3);
    }

    @Override // a.pot0
    public final jzj g(hx9 hx9Var, Map map) {
        map.getClass();
        xot0 xot0Var = this.c;
        return xot0Var != null ? xot0Var.g(hx9Var, map) : qjj.M(this.b.f, null, new xsj(this, (yje) null, hx9Var, map), 3);
    }

    @Override // a.pot0
    public final jzj h(Map map, oot0 oot0Var, crd crdVar) {
        oot0Var.getClass();
        crdVar.getClass();
        xot0 xot0Var = this.c;
        return xot0Var != null ? xot0Var.h(map, oot0Var, crdVar) : qjj.M(this.b.f, null, new ic1(this, (yje) null, map, oot0Var, crdVar, (byte) 22), 3);
    }

    @Override // a.pot0
    public final jzj i(int i) {
        xot0 xot0Var = this.c;
        return xot0Var != null ? xot0Var.i(i) : qjj.M(this.b.f, null, new u52(this, (yje) null, i), 3);
    }

    @Override // a.pot0
    public final jzj j(List list) {
        oot0 oot0Var = oot0.f25610a;
        list.getClass();
        xot0 xot0Var = this.c;
        return xot0Var != null ? xot0Var.j(list) : qjj.M(this.b.f, null, new b1f(this, (yje) null, list), 3);
    }

    @Override // a.pot0
    public final Object k(bnn0 bnn0Var) {
        xot0 xot0Var = this.c;
        return xot0Var != null ? xot0Var.k(bnn0Var) : qjj.d0(obb.Y(this.b.e), new ozj(this, null, (byte) 0), bnn0Var);
    }

    @Override // a.pot0
    public final jzj l(List list, List list2, List list3, vt00 vt00Var, z40 z40Var, long j) {
        xot0 xot0Var = this.c;
        return xot0Var != null ? xot0Var.l(list, list2, list3, vt00Var, z40Var, j) : qjj.M(this.b.f, null, new qzj(this, null, list, list2, list3, vt00Var, z40Var, j), 3);
    }

    @Override // a.pot0
    public final jzj m(Map map, crd crdVar) {
        oot0 oot0Var = oot0.f25610a;
        map.getClass();
        crdVar.getClass();
        xot0 xot0Var = this.c;
        return xot0Var != null ? xot0Var.m(map, crdVar) : qjj.M(this.b.f, null, new xsj(this, (yje) null, map, crdVar), 3);
    }

    public final xot0 n() {
        if (this.d.get()) {
            throw new CancellationException("UseCaseCameraRequestControl is closed");
        }
        xot0 xot0Var = this.c;
        if (xot0Var != null) {
            return xot0Var;
        }
        xot0 xot0Var2 = (xot0) this.f31364a.get();
        if (this.d.get()) {
            xot0Var2.close();
            throw new CancellationException("UseCaseCameraRequestControl closed during initialization");
        }
        this.c = xot0Var2;
        xot0Var2.getClass();
        return xot0Var2;
    }
}
