package a;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class nxj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f24286a;
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;
    public boolean e;
    public boolean f;

    public nxj(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.f24286a = viewGroup;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public static final nxj i(ViewGroup viewGroup, androidx.fragment.app.e eVar) {
        viewGroup.getClass();
        eVar.getClass();
        eVar.T().getClass();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof nxj) {
            return (nxj) tag;
        }
        nxj nxjVar = new nxj(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, nxjVar);
        return nxjVar;
    }

    public static boolean j(ArrayList arrayList) {
        boolean z;
        qnk0 qnk0Var;
        Iterator it = arrayList.iterator();
        loop0: while (true) {
            z = true;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                rnk0 rnk0Var = (rnk0) it.next();
                if (!rnk0Var.k.isEmpty()) {
                    ArrayList arrayList2 = rnk0Var.k;
                    if (!arrayList2.isEmpty()) {
                        Iterator it2 = arrayList2.iterator();
                        do {
                            if (!it2.hasNext()) {
                                break;
                            }
                            qnk0Var = (qnk0) it2.next();
                            qnk0Var.getClass();
                        } while (qnk0Var instanceof lxj);
                    } else {
                        break;
                    }
                }
                z = false;
            }
        }
        if (z) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                w3d.u(arrayList3, ((rnk0) it3.next()).k);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void a(rnk0 rnk0Var) {
        rnk0Var.getClass();
        if (rnk0Var.i) {
            rnk0Var.f30792a.a(rnk0Var.c.q0(), this.f24286a);
            rnk0Var.i = false;
        }
    }

    public final void b(ArrayList arrayList, boolean z) {
        Object obj;
        Object next;
        if (androidx.fragment.app.e.V(2)) {
            Log.v("FragmentManager", "Collecting Effects");
        }
        Iterator it = arrayList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            rnk0 rnk0Var = (rnk0) next;
            cge0 cge0Var = tnk0.f34240a;
            View view = rnk0Var.c.l1;
            view.getClass();
            cge0Var.getClass();
            tnk0 tnk0VarC = cge0.c(view);
            tnk0 tnk0Var = tnk0.c;
            if (tnk0VarC == tnk0Var && rnk0Var.f30792a != tnk0Var) {
                break;
            }
        }
        rnk0 rnk0Var2 = (rnk0) next;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (listIterator.hasPrevious()) {
            Object objPrevious = listIterator.previous();
            rnk0 rnk0Var3 = (rnk0) objPrevious;
            cge0 cge0Var2 = tnk0.f34240a;
            View view2 = rnk0Var3.c.l1;
            view2.getClass();
            cge0Var2.getClass();
            tnk0 tnk0VarC2 = cge0.c(view2);
            tnk0 tnk0Var2 = tnk0.c;
            if (tnk0VarC2 != tnk0Var2 && rnk0Var3.f30792a == tnk0Var2) {
                obj = objPrevious;
                break;
            }
        }
        rnk0 rnk0Var4 = (rnk0) obj;
        if (androidx.fragment.app.e.V(2)) {
            Log.v("FragmentManager", "Executing operations from " + rnk0Var2 + " to " + rnk0Var4);
        }
        ArrayList<jxj> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Fragment fragment = ((rnk0) CollectionsKt.d0(arrayList)).c;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            cxq cxqVar = ((rnk0) it2.next()).c.o1;
            cxq cxqVar2 = fragment.o1;
            cxqVar.b = cxqVar2.b;
            cxqVar.c = cxqVar2.c;
            cxqVar.d = cxqVar2.d;
            cxqVar.e = cxqVar2.e;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            rnk0 rnk0Var5 = (rnk0) it3.next();
            arrayList2.add(new jxj(rnk0Var5, z));
            mxj mxjVar = new mxj(rnk0Var5);
            cge0 cge0Var3 = tnk0.f34240a;
            arrayList3.add(mxjVar);
            rnk0Var5.d.add(new gxj(this, rnk0Var5, (byte) 0));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (!((mxj) obj2).C0()) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            ((mxj) it4.next()).getClass();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((mxj) it5.next()).getClass();
        }
        ArrayList<jxj> arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            w3d.u(arrayList7, ((rnk0) ((jxj) it6.next()).b).k);
        }
        boolean zIsEmpty = arrayList7.isEmpty();
        boolean z2 = false;
        for (jxj jxjVar : arrayList2) {
            Context context = this.f24286a.getContext();
            rnk0 rnk0Var6 = (rnk0) jxjVar.b;
            context.getClass();
            iqi iqiVarN1 = jxjVar.n1(context);
            if (iqiVarN1 != null) {
                if (((AnimatorSet) iqiVarN1.b) == null) {
                    arrayList6.add(jxjVar);
                } else {
                    Fragment fragment2 = rnk0Var6.c;
                    if (rnk0Var6.k.isEmpty()) {
                        if (rnk0Var6.f30792a == tnk0.d) {
                            rnk0Var6.i = false;
                        }
                        rnk0Var6.j.add(new lxj(jxjVar));
                        z2 = true;
                    } else if (androidx.fragment.app.e.V(2)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + fragment2 + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        for (jxj jxjVar2 : arrayList6) {
            rnk0 rnk0Var7 = (rnk0) jxjVar2.b;
            Fragment fragment3 = rnk0Var7.c;
            if (zIsEmpty) {
                if (!z2) {
                    rnk0Var7.j.add(new ixj(jxjVar2));
                } else if (androidx.fragment.app.e.V(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragment3 + " as Animations cannot run alongside Animators.");
                }
            } else if (androidx.fragment.app.e.V(2)) {
                Log.v("FragmentManager", "Ignoring Animation set on " + fragment3 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    public final void c(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            w3d.u(arrayList2, ((rnk0) it.next()).k);
        }
        List listL0 = CollectionsKt.L0(CollectionsKt.P0(arrayList2));
        int size = listL0.size();
        for (int i = 0; i < size; i++) {
            ((qnk0) listL0.get(i)).b(this.f24286a);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            a((rnk0) arrayList.get(i2));
        }
        List listL1 = CollectionsKt.L0(arrayList);
        int size3 = listL1.size();
        for (int i3 = 0; i3 < size3; i3++) {
            rnk0 rnk0Var = (rnk0) listL1.get(i3);
            if (rnk0Var.k.isEmpty()) {
                rnk0Var.b();
            }
        }
    }

    public final void d(tnk0 tnk0Var, snk0 snk0Var, androidx.fragment.app.f fVar) {
        synchronized (this.b) {
            try {
                rnk0 rnk0VarF = f(fVar.c);
                if (rnk0VarF == null) {
                    Fragment fragment = fVar.c;
                    rnk0VarF = (fragment.n || fragment.m) ? g(fragment) : null;
                }
                if (rnk0VarF != null) {
                    rnk0VarF.d(tnk0Var, snk0Var);
                    return;
                }
                rnk0 rnk0Var = new rnk0(tnk0Var, snk0Var, fVar);
                this.b.add(rnk0Var);
                rnk0Var.d.add(new gxj(this, rnk0Var, (byte) 1));
                rnk0Var.d.add(new gxj(this, rnk0Var, (byte) 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        boolean z;
        if (this.f) {
            return;
        }
        if (!this.f24286a.isAttachedToWindow()) {
            h();
            this.e = false;
            return;
        }
        synchronized (this.b) {
            try {
                ArrayList<rnk0> arrayList = new ArrayList(this.c);
                this.c.clear();
                Iterator it = arrayList.iterator();
                while (true) {
                    z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    rnk0 rnk0Var = (rnk0) it.next();
                    if (this.b.isEmpty() || !rnk0Var.c.n) {
                        z = false;
                    }
                    rnk0Var.g = z;
                }
                for (rnk0 rnk0Var2 : arrayList) {
                    if (this.d) {
                        if (androidx.fragment.app.e.V(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + rnk0Var2);
                        }
                        rnk0Var2.b();
                    } else {
                        if (androidx.fragment.app.e.V(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + rnk0Var2);
                        }
                        rnk0Var2.a(this.f24286a);
                    }
                    this.d = false;
                    if (!rnk0Var2.f) {
                        this.c.add(rnk0Var2);
                    }
                }
                if (!this.b.isEmpty()) {
                    l();
                    ArrayList arrayList2 = new ArrayList(this.b);
                    if (arrayList2.isEmpty()) {
                        return;
                    }
                    this.b.clear();
                    this.c.addAll(arrayList2);
                    if (androidx.fragment.app.e.V(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(arrayList2, this.e);
                    boolean zJ = j(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    boolean z2 = true;
                    while (it2.hasNext()) {
                        if (!((rnk0) it2.next()).c.n) {
                            z2 = false;
                        }
                    }
                    if (!z2 || zJ) {
                        z = false;
                    }
                    this.d = z;
                    if (androidx.fragment.app.e.V(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + zJ + " \ntransition = " + z2);
                    }
                    if (!z2) {
                        k(arrayList2);
                        c(arrayList2);
                    } else if (zJ) {
                        k(arrayList2);
                        int size = arrayList2.size();
                        for (int i = 0; i < size; i++) {
                            a((rnk0) arrayList2.get(i));
                        }
                    }
                    this.e = false;
                    if (androidx.fragment.app.e.V(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final rnk0 f(Fragment fragment) {
        Object next;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            next = it.next();
            rnk0 rnk0Var = (rnk0) next;
            if (rnk0Var.c.equals(fragment) && !rnk0Var.e) {
                return (rnk0) next;
            }
        }
        next = null;
        return (rnk0) next;
    }

    public final rnk0 g(Fragment fragment) {
        Object next;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            next = it.next();
            rnk0 rnk0Var = (rnk0) next;
            if (rnk0Var.c.equals(fragment) && !rnk0Var.e) {
                return (rnk0) next;
            }
        }
        next = null;
        return (rnk0) next;
    }

    public final void h() {
        if (androidx.fragment.app.e.V(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.f24286a.isAttachedToWindow();
        synchronized (this.b) {
            try {
                l();
                k(this.b);
                ArrayList<rnk0> arrayList = new ArrayList(this.c);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((rnk0) it.next()).g = false;
                }
                for (rnk0 rnk0Var : arrayList) {
                    if (androidx.fragment.app.e.V(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f24286a + " is not attached to window. ") + "Cancelling running operation " + rnk0Var);
                    }
                    rnk0Var.a(this.f24286a);
                }
                ArrayList<rnk0> arrayList2 = new ArrayList(this.b);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((rnk0) it2.next()).g = false;
                }
                for (rnk0 rnk0Var2 : arrayList2) {
                    if (androidx.fragment.app.e.V(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? "" : "Container " + this.f24286a + " is not attached to window. ") + "Cancelling pending operation " + rnk0Var2);
                    }
                    rnk0Var2.a(this.f24286a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            rnk0 rnk0Var = (rnk0) arrayList.get(i);
            androidx.fragment.app.f fVar = rnk0Var.l;
            Fragment fragment = fVar.c;
            if (!rnk0Var.h) {
                rnk0Var.h = true;
                snk0 snk0Var = rnk0Var.b;
                if (snk0Var == snk0.b) {
                    View viewFindFocus = fragment.l1.findFocus();
                    if (viewFindFocus != null) {
                        fragment.A().k = viewFindFocus;
                        if (androidx.fragment.app.e.V(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment);
                        }
                    }
                    View viewQ0 = rnk0Var.c.q0();
                    if (viewQ0.getParent() == null) {
                        if (androidx.fragment.app.e.V(2)) {
                            Log.v("FragmentManager", "Adding fragment " + fragment + " view " + viewQ0 + " to container in onStart");
                        }
                        fVar.b();
                        viewQ0.setAlpha(0.0f);
                    }
                    if (viewQ0.getAlpha() == 0.0f && viewQ0.getVisibility() == 0) {
                        if (androidx.fragment.app.e.V(2)) {
                            Log.v("FragmentManager", "Making view " + viewQ0 + " INVISIBLE in onStart");
                        }
                        viewQ0.setVisibility(4);
                    }
                    cxq cxqVar = fragment.o1;
                    viewQ0.setAlpha(cxqVar == null ? 1.0f : cxqVar.j);
                    if (androidx.fragment.app.e.V(2)) {
                        cxq cxqVar2 = fragment.o1;
                        Log.v("FragmentManager", "Setting view alpha to " + (cxqVar2 != null ? cxqVar2.j : 1.0f) + " in onStart");
                    }
                } else if (snk0Var == snk0.c) {
                    View viewQ1 = fragment.q0();
                    if (androidx.fragment.app.e.V(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewQ1.findFocus() + " on view " + viewQ1 + " for Fragment " + fragment);
                    }
                    viewQ1.clearFocus();
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            w3d.u(arrayList2, ((rnk0) it.next()).k);
        }
        List listL0 = CollectionsKt.L0(CollectionsKt.P0(arrayList2));
        int size2 = listL0.size();
        for (int i2 = 0; i2 < size2; i2++) {
            qnk0 qnk0Var = (qnk0) listL0.get(i2);
            qnk0Var.getClass();
            ViewGroup viewGroup = this.f24286a;
            viewGroup.getClass();
            if (!qnk0Var.f29033a) {
                qnk0Var.d(viewGroup);
            }
            qnk0Var.f29033a = true;
        }
    }

    public final void l() {
        for (rnk0 rnk0Var : this.b) {
            if (rnk0Var.b == snk0.b) {
                View viewQ0 = rnk0Var.c.q0();
                cge0 cge0Var = tnk0.f34240a;
                int visibility = viewQ0.getVisibility();
                cge0Var.getClass();
                rnk0Var.d(cge0.f(visibility), snk0.f32499a);
            }
        }
    }
}
