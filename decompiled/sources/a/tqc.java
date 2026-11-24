package a;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class tqc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g45 f34374a;

    public /* synthetic */ tqc(g45 g45Var) {
        this.f34374a = g45Var;
    }

    public double a(int i) {
        Object next;
        g45 g45Var = this.f34374a;
        if (((ave) g45Var.c).f1521a != q4f.m) {
            return ((lye) g45Var.f10647a).f20858a.c;
        }
        Iterator it = ((m0f) g45Var.b).f20951a.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            List list = ((g0f) next).b;
            if (list == null || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((hf6) it2.next()).f12958a == i) {
                        break loop0;
                    }
                }
            }
        }
        g0f g0fVar = (g0f) next;
        if (g0fVar != null) {
            return g0fVar.c;
        }
        return 0.0d;
    }

    public Object b(boolean z, bnn0 bnn0Var) {
        Object objA = ((ave) this.f34374a.c).q.a(Boolean.valueOf(z), bnn0Var);
        wne wneVar = wne.f39444a;
        if (objA != wneVar) {
            objA = Unit.f46060a;
        }
        if (objA != wneVar) {
            objA = Unit.f46060a;
        }
        return objA == wneVar ? objA : Unit.f46060a;
    }

    public boolean c(int i) {
        Object next;
        g45 g45Var = this.f34374a;
        if (((ave) g45Var.c).f1521a != q4f.m) {
            return ((lye) g45Var.f10647a).f20858a.i;
        }
        Iterator it = ((m0f) g45Var.b).f20951a.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            List list = ((g0f) next).b;
            if (list == null || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((hf6) it2.next()).f12958a == i) {
                        break loop0;
                    }
                }
            }
        }
        g0f g0fVar = (g0f) next;
        if (g0fVar != null) {
            return g0fVar.i;
        }
        return false;
    }
}
