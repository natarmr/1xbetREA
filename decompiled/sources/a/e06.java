package a;

import android.net.Uri;
import android.os.Looper;
import androidx.media3.common.MediaItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class e06 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f6974a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final zhl c;
    public final zhl d;
    public Looper e;
    public bmq0 f;
    public a4a0 g;
    public rsj h;

    public e06() {
        int i = 0;
        vn30 vn30Var = null;
        this.c = new zhl(new CopyOnWriteArrayList(), i, vn30Var);
        this.d = new zhl(new CopyOnWriteArrayList(), i, vn30Var);
    }

    public abstract mn30 a(vn30 vn30Var, lhf0 lhf0Var, long j);

    public final void b(wn30 wn30Var) {
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(wn30Var);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        c();
    }

    public final void d(wn30 wn30Var) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(wn30Var);
        if (zIsEmpty) {
            e();
        }
    }

    public bmq0 f() {
        return null;
    }

    public abstract MediaItem g();

    public boolean h() {
        return true;
    }

    public final void j(wn30 wn30Var, a4a0 a4a0Var, rsj rsjVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.e;
        x0x.A(looper == null || looper == looperMyLooper);
        this.g = a4a0Var;
        this.h = rsjVar;
        bmq0 bmq0Var = this.f;
        this.f6974a.add(wn30Var);
        if (this.e == null) {
            this.e = looperMyLooper;
            this.b.add(wn30Var);
            rsjVar.getClass();
            k(rsjVar);
            return;
        }
        if (bmq0Var != null) {
            d(wn30Var);
            wn30Var.a(this, bmq0Var);
        }
    }

    public abstract void k(rsj rsjVar);

    public final void l(bmq0 bmq0Var) {
        this.f = bmq0Var;
        Iterator it = this.f6974a.iterator();
        while (it.hasNext()) {
            ((wn30) it.next()).a(this, bmq0Var);
        }
    }

    public void m(mn30 mn30Var) {
        zaw zawVar = (zaw) mn30Var;
        zawVar.b.e.remove(zawVar);
        for (ybw ybwVar : zawVar.t) {
            if (ybwVar.Z) {
                for (xbw xbwVar : ybwVar.v) {
                    xbwVar.j();
                    ivn ivnVar = xbwVar.h;
                    if (ivnVar != null) {
                        ivnVar.m(xbwVar.e);
                        xbwVar.h = null;
                        xbwVar.g = null;
                    }
                }
            }
            waw wawVar = ybwVar.d;
            int iQ = wawVar.s.q();
            vuj vujVar = wawVar.g;
            Uri uriB = wawVar.e[iQ].b();
            uuj uujVar = (uuj) vujVar.d.get(uriB);
            if (uujVar != null) {
                HashMap map = uujVar.b;
                x0x.K(map.containsKey(uriB));
                tuj tujVar = (tuj) map.get(uriB);
                tujVar.getClass();
                tujVar.l = false;
            }
            wawVar.o = null;
            ybwVar.j.F(ybwVar);
            ybwVar.r.removeCallbacksAndMessages(null);
            ybwVar.i1 = true;
            ybwVar.s.clear();
        }
        zawVar.q = null;
    }

    public final void n(wn30 wn30Var) {
        ArrayList arrayList = this.f6974a;
        arrayList.remove(wn30Var);
        if (!arrayList.isEmpty()) {
            b(wn30Var);
            return;
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.b.clear();
        o();
    }

    public abstract void o();

    public final void p(ail ailVar) {
        CopyOnWriteArrayList<yhl> copyOnWriteArrayList = this.d.c;
        for (yhl yhlVar : copyOnWriteArrayList) {
            if (yhlVar.f42642a == ailVar) {
                copyOnWriteArrayList.remove(yhlVar);
            }
        }
    }

    public final void q(bo30 bo30Var) {
        CopyOnWriteArrayList<ao30> copyOnWriteArrayList = this.c.c;
        for (ao30 ao30Var : copyOnWriteArrayList) {
            if (ao30Var.b == bo30Var) {
                copyOnWriteArrayList.remove(ao30Var);
            }
        }
    }

    public abstract void r(MediaItem mediaItem);

    public void c() {
    }

    public void e() {
    }

    public void i() {
    }
}
