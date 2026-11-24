package a;

import android.gov.nist.core.Separators;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class rnk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public tnk0 f30792a;
    public snk0 b;
    public final Fragment c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final ArrayList j;
    public final ArrayList k;
    public final androidx.fragment.app.f l;

    public rnk0(tnk0 tnk0Var, snk0 snk0Var, androidx.fragment.app.f fVar) {
        Fragment fragment = fVar.c;
        this.f30792a = tnk0Var;
        this.b = snk0Var;
        this.c = fragment;
        this.d = new ArrayList();
        this.i = true;
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        this.k = arrayList;
        this.l = fVar;
    }

    public final void a(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.h = false;
        if (this.e) {
            return;
        }
        this.e = true;
        if (this.j.isEmpty()) {
            b();
            return;
        }
        for (qnk0 qnk0Var : CollectionsKt.L0(this.k)) {
            qnk0Var.getClass();
            if (!qnk0Var.b) {
                qnk0Var.a(viewGroup);
            }
            qnk0Var.b = true;
        }
    }

    public final void b() {
        this.h = false;
        if (!this.f) {
            if (androidx.fragment.app.e.V(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.c.n = false;
        this.l.k();
    }

    public final void c(qnk0 qnk0Var) {
        qnk0Var.getClass();
        ArrayList arrayList = this.j;
        if (arrayList.remove(qnk0Var) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(tnk0 tnk0Var, snk0 snk0Var) {
        int iOrdinal = snk0Var.ordinal();
        Fragment fragment = this.c;
        if (iOrdinal == 0) {
            if (this.f30792a != tnk0.b) {
                if (androidx.fragment.app.e.V(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + this.f30792a + " -> " + tnk0Var + Separators.DOT);
                }
                this.f30792a = tnk0Var;
                return;
            }
            return;
        }
        if (iOrdinal == 1) {
            if (this.f30792a == tnk0.b) {
                if (androidx.fragment.app.e.V(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.b + " to ADDING.");
                }
                this.f30792a = tnk0.c;
                this.b = snk0.b;
                this.i = true;
                return;
            }
            return;
        }
        if (iOrdinal != 2) {
            t9f.b();
            return;
        }
        if (androidx.fragment.app.e.V(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + fragment + " mFinalState = " + this.f30792a + " -> REMOVED. mLifecycleImpact  = " + this.b + " to REMOVING.");
        }
        this.f30792a = tnk0.b;
        this.b = snk0.c;
        this.i = true;
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {finalState = " + this.f30792a + " lifecycleImpact = " + this.b + " fragment = " + this.c + "}";
    }
}
