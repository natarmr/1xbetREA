package androidx.fragment.app;

import a.a7q;
import a.axq;
import a.bc0;
import a.cge0;
import a.cxq;
import a.dxq;
import a.fhj;
import a.gnk0;
import a.h0q0;
import a.h2r;
import a.i5r;
import a.ige0;
import a.iin0;
import a.j5r;
import a.jf4;
import a.jxq;
import a.k5r;
import a.lkz;
import a.m1r;
import a.mrv0;
import a.n6r;
import a.nrv0;
import a.nw20;
import a.nxj;
import a.ny9;
import a.piu0;
import a.pmi;
import a.pq00;
import a.rgu0;
import a.rnk0;
import a.rq00;
import a.rz4;
import a.sgy;
import a.snk0;
import a.sre0;
import a.tnk0;
import a.unk0;
import a.v1r;
import a.vbf;
import a.vwq;
import a.w1r;
import a.wwq;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fhj f45380a;
    public final pmi b;
    public final Fragment c;
    public boolean d = false;
    public int e = -1;

    public f(fhj fhjVar, pmi pmiVar, ClassLoader classLoader, m1r m1rVar, Bundle bundle) {
        this.f45380a = fhjVar;
        this.b = pmiVar;
        Fragment fragmentA = ((FragmentState) bundle.getParcelable(CommonConstant.ReqAccessTokenParam.STATE_LABEL)).a(m1rVar);
        this.c = fragmentA;
        fragmentA.b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fragmentA.s0(bundle2);
        if (e.V(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentA);
        }
    }

    public final void a() {
        boolean zV = e.V(3);
        Fragment fragment = this.c;
        if (zV) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + fragment);
        }
        Bundle bundle = fragment.b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        fragment.x.c0();
        fragment.f45370a = 3;
        fragment.j1 = false;
        a7q a7qVar = fragment.B1;
        a7qVar.g(new vwq(fragment, bundle2), "Fragment#onActivityCreated");
        if (!fragment.j1) {
            throw new iin0(axq.k("Fragment ", fragment, " did not call through to super.onActivityCreated()"));
        }
        if (e.V(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + fragment);
        }
        if (fragment.l1 != null) {
            Bundle bundle3 = fragment.b;
            Bundle bundle4 = bundle3 != null ? bundle3.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = fragment.c;
            if (sparseArray != null) {
                fragment.l1.restoreHierarchyState(sparseArray);
                fragment.c = null;
            }
            fragment.j1 = false;
            a7qVar.g(new wwq(fragment, bundle4, (byte) 2), "Fragment#onViewStateRestored");
            if (!fragment.j1) {
                throw new iin0(axq.k("Fragment ", fragment, " did not call through to super.onViewStateRestored()"));
            }
            if (fragment.l1 != null) {
                a7qVar.g(new vwq(fragment, (byte) 14), "FragmentViewLifecycle#handleLifecycleEvent(ON_CREATE)");
            }
        }
        fragment.b = null;
        v1r v1rVar = fragment.x;
        v1rVar.I = false;
        v1rVar.J = false;
        v1rVar.P.g = false;
        v1rVar.x(4);
        this.f45380a.b(fragment, false);
    }

    public final void b() {
        View view;
        View view2;
        Fragment fragment = this.c;
        Fragment fragmentL = e.L(fragment.k1);
        Fragment fragment2 = fragment.y;
        if (fragmentL != null && fragmentL != fragment2) {
            int i = fragment.A;
            j5r j5rVar = k5r.f17734a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(fragment);
            sb.append(" within the view of parent fragment ");
            sb.append(fragmentL);
            sb.append(" via container with ID ");
            nrv0 nrv0Var = new nrv0(fragment, rz4.j(i, " without using parent's childFragmentManager", sb));
            k5r.c(nrv0Var);
            j5r j5rVarA = k5r.a(fragment);
            if (j5rVarA.f15946a.contains(i5r.e) && k5r.e(j5rVarA, fragment.getClass(), nrv0.class)) {
                k5r.b(j5rVarA, nrv0Var);
            }
        }
        ArrayList arrayList = (ArrayList) this.b.b;
        ViewGroup viewGroup = fragment.k1;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(fragment);
            for (int i2 = iIndexOf - 1; i2 >= 0; i2--) {
                Fragment fragment3 = (Fragment) arrayList.get(i2);
                if (fragment3.k1 == viewGroup && (view2 = fragment3.l1) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                Fragment fragment4 = (Fragment) arrayList.get(iIndexOf);
                if (fragment4.k1 == viewGroup && (view = fragment4.l1) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        fragment.k1.addView(fragment.l1, iIndexOfChild);
    }

    public final void c() {
        boolean zV = e.V(3);
        Fragment fragment = this.c;
        if (zV) {
            Log.d("FragmentManager", "moveto ATTACHED: " + fragment);
        }
        Fragment fragment2 = fragment.h;
        f fVar = null;
        pmi pmiVar = this.b;
        if (fragment2 != null) {
            f fVar2 = (f) ((HashMap) pmiVar.c).get(fragment2.f);
            if (fVar2 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(fragment);
                Fragment fragment3 = fragment.h;
                sb.append(" declared target fragment ");
                sb.append(fragment3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            fragment.i = fragment.h.f;
            fragment.h = null;
            fVar = fVar2;
        } else {
            String str = fragment.i;
            if (str != null && (fVar = (f) ((HashMap) pmiVar.c).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(fragment);
                sb2.append(" declared target fragment ");
                jf4.n(axq.n(sb2, fragment.i, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (fVar != null) {
            fVar.k();
        }
        e eVar = fragment.v;
        fragment.w = eVar.x;
        fragment.y = eVar.z;
        fhj fhjVar = this.f45380a;
        fhjVar.h(fragment, false);
        ArrayList arrayList = fragment.D1;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((dxq) it.next()).a();
        }
        arrayList.clear();
        fragment.x.b(fragment.w, fragment.y(), fragment);
        fragment.f45370a = 0;
        fragment.j1 = false;
        fragment.B1.g(new vwq(fragment, (byte) 20), "Fragment#onAttach");
        if (!fragment.j1) {
            throw new iin0(axq.k("Fragment ", fragment, " did not call through to super.onAttach()"));
        }
        e eVar2 = fragment.v;
        Iterator it2 = eVar2.q.iterator();
        while (it2.hasNext()) {
            ((h2r) it2.next()).a(eVar2, fragment);
        }
        v1r v1rVar = fragment.x;
        v1rVar.I = false;
        v1rVar.J = false;
        v1rVar.P.g = false;
        v1rVar.x(0);
        fhjVar.c(fragment, false);
    }

    public final int d() {
        Fragment fragment = this.c;
        if (fragment.v == null) {
            return fragment.f45370a;
        }
        int iMin = this.e;
        int iOrdinal = fragment.t1.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (fragment.p) {
            boolean z = fragment.q;
            int i = this.e;
            if (z) {
                iMin = Math.max(i, 2);
                View view = fragment.l1;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = i < 4 ? Math.min(iMin, fragment.f45370a) : Math.min(iMin, 1);
            }
        }
        if (fragment.r && fragment.k1 == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!fragment.l) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = fragment.k1;
        snk0 snk0Var = null;
        if (viewGroup != null) {
            nxj nxjVarI = nxj.i(viewGroup, fragment.F());
            rnk0 rnk0VarF = nxjVarI.f(fragment);
            snk0 snk0Var2 = rnk0VarF != null ? rnk0VarF.b : null;
            rnk0 rnk0VarG = nxjVarI.g(fragment);
            snk0Var = rnk0VarG != null ? rnk0VarG.b : null;
            int i2 = snk0Var2 == null ? -1 : unk0.f35967a[snk0Var2.ordinal()];
            if (i2 != -1 && i2 != 1) {
                snk0Var = snk0Var2;
            }
        }
        if (snk0Var == snk0.b) {
            iMin = Math.min(iMin, 6);
        } else if (snk0Var == snk0.c) {
            iMin = Math.max(iMin, 3);
        } else if (fragment.m) {
            iMin = fragment.P() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (fragment.m1 && fragment.f45370a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (fragment.n) {
            iMin = Math.max(iMin, 3);
        }
        if (e.V(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + fragment);
        }
        return iMin;
    }

    public final void e() {
        Bundle bundle;
        byte b = 3;
        boolean zV = e.V(3);
        Fragment fragment = this.c;
        if (zV) {
            Log.d("FragmentManager", "moveto CREATED: " + fragment);
        }
        Bundle bundle2 = fragment.b;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (fragment.r1) {
            fragment.f45370a = 1;
            Bundle bundle4 = fragment.b;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            fragment.x.o0(bundle);
            v1r v1rVar = fragment.x;
            v1rVar.I = false;
            v1rVar.J = false;
            v1rVar.P.g = false;
            v1rVar.x(1);
            return;
        }
        fhj fhjVar = this.f45380a;
        fhjVar.i(fragment, false);
        fragment.x.c0();
        fragment.f45370a = 1;
        fragment.j1 = false;
        fragment.u1.a(new ige0(fragment, b));
        a7q a7qVar = fragment.B1;
        a7qVar.g(new wwq(fragment, bundle3, (byte) 1), "Fragment#onCreate");
        fragment.r1 = true;
        if (!fragment.j1) {
            throw new iin0(axq.k("Fragment ", fragment, " did not call through to super.onCreate()"));
        }
        a7qVar.g(new vwq(fragment, (byte) 12), "FragmentLifecycle#handleLifecycleEvent(ON_CREATE)");
        fhjVar.d(fragment, false);
    }

    public final void f() {
        String resourceName;
        Fragment fragment = this.c;
        if (fragment.p) {
            return;
        }
        if (e.V(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
        }
        Bundle bundle = fragment.b;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterB0 = fragment.b0(bundle2);
        fragment.q1 = layoutInflaterB0;
        ViewGroup viewGroup2 = fragment.k1;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = fragment.A;
            if (i != 0) {
                if (i == -1) {
                    jf4.o(axq.k("Cannot create fragment ", fragment, " for a container view with no id"));
                    return;
                }
                viewGroup = (ViewGroup) fragment.v.y.b0(i);
                if (viewGroup == null) {
                    if (!fragment.s && !fragment.r) {
                        try {
                            resourceName = fragment.G().getResourceName(fragment.A);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.A) + " (" + resourceName + ") for fragment " + fragment);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    j5r j5rVar = k5r.f17734a;
                    mrv0 mrv0Var = new mrv0(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
                    k5r.c(mrv0Var);
                    j5r j5rVarA = k5r.a(fragment);
                    if (j5rVarA.f15946a.contains(i5r.g) && k5r.e(j5rVarA, fragment.getClass(), mrv0.class)) {
                        k5r.b(j5rVarA, mrv0Var);
                    }
                }
            }
        }
        fragment.k1 = viewGroup;
        fragment.k0(layoutInflaterB0, viewGroup, bundle2);
        if (fragment.l1 != null) {
            if (e.V(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + fragment);
            }
            fragment.l1.setSaveFromParentEnabled(false);
            fragment.l1.setTag(R.id.fragment_container_view_tag, fragment);
            if (viewGroup != null) {
                b();
            }
            if (fragment.Y) {
                fragment.l1.setVisibility(8);
            }
            boolean zIsAttachedToWindow = fragment.l1.isAttachedToWindow();
            View view = fragment.l1;
            if (zIsAttachedToWindow) {
                WeakHashMap weakHashMap = rgu0.f30456a;
                view.requestApplyInsets();
            } else {
                view.addOnAttachStateChangeListener(new bc0(view, (byte) 6));
            }
            fragment.l0();
            this.f45380a.n(fragment, fragment.l1, bundle2, false);
            int visibility = fragment.l1.getVisibility();
            fragment.A().j = fragment.l1.getAlpha();
            if (fragment.k1 != null && visibility == 0) {
                View viewFindFocus = fragment.l1.findFocus();
                if (viewFindFocus != null) {
                    fragment.A().k = viewFindFocus;
                    if (e.V(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment);
                    }
                }
                fragment.l1.setAlpha(0.0f);
            }
        }
        fragment.f45370a = 2;
    }

    public final void g() {
        Fragment fragmentJ;
        byte b = 3;
        boolean zV = e.V(3);
        Fragment fragment = this.c;
        if (zV) {
            Log.d("FragmentManager", "movefrom CREATED: " + fragment);
        }
        boolean zIsChangingConfigurations = true;
        boolean z = fragment.m && !fragment.P();
        pmi pmiVar = this.b;
        if (z && !fragment.o) {
            pmiVar.G(null, fragment.f);
        }
        if (!z) {
            w1r w1rVar = (w1r) pmiVar.e;
            if (!((w1rVar.b.containsKey(fragment.f) && w1rVar.e) ? w1rVar.f : true)) {
                String str = fragment.i;
                if (str != null && (fragmentJ = pmiVar.j(str)) != null && fragmentJ.f1) {
                    fragment.h = fragmentJ;
                }
                fragment.f45370a = 0;
                return;
            }
        }
        jxq jxqVar = fragment.w;
        if (jxqVar != null) {
            zIsChangingConfigurations = ((w1r) pmiVar.e).f;
        } else {
            Context context = jxqVar.b;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if ((z && !fragment.o) || zIsChangingConfigurations) {
            ((w1r) pmiVar.e).x(fragment, false);
        }
        fragment.x.o();
        a7q a7qVar = fragment.B1;
        a7qVar.g(new vwq(fragment, b), "FragmentLifecycle#handleLifecycleEvent(ON_DESTROY)");
        fragment.f45370a = 0;
        fragment.j1 = false;
        fragment.r1 = false;
        a7qVar.g(new vwq(fragment, (byte) 4), "Fragment#onDestroy");
        if (!fragment.j1) {
            throw new iin0(axq.k("Fragment ", fragment, " did not call through to super.onDestroy()"));
        }
        this.f45380a.e(fragment, false);
        for (f fVar : pmiVar.m()) {
            if (fVar != null) {
                Fragment fragment2 = fVar.c;
                if (fragment.f.equals(fragment2.i)) {
                    fragment2.h = fragment;
                    fragment2.i = null;
                }
            }
        }
        String str2 = fragment.i;
        if (str2 != null) {
            fragment.h = pmiVar.j(str2);
        }
        pmiVar.D(this);
    }

    public final void h() {
        View view;
        boolean zV = e.V(3);
        Fragment fragment = this.c;
        if (zV) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + fragment);
        }
        ViewGroup viewGroup = fragment.k1;
        if (viewGroup != null && (view = fragment.l1) != null) {
            viewGroup.removeView(view);
        }
        a7q a7qVar = fragment.B1;
        fragment.x.x(1);
        if (fragment.l1 != null) {
            n6r n6rVar = fragment.w1;
            n6rVar.b();
            if (n6rVar.c.i.compareTo(lkz.c) >= 0) {
                a7qVar.g(new vwq(fragment, (byte) 9), "FragmentViewLifecycle#handleLifecycleEvent(ON_DESTROY)");
            }
        }
        fragment.f45370a = 1;
        fragment.j1 = false;
        a7qVar.g(new vwq(fragment, (byte) 11), "Fragment#onDestroyView");
        if (!fragment.j1) {
            throw new iin0(axq.k("Fragment ", fragment, " did not call through to super.onDestroyView()"));
        }
        piu0 piu0VarG = fragment.g();
        piu0VarG.getClass();
        vbf vbfVar = vbf.b;
        vbfVar.getClass();
        h0q0 h0q0Var = new h0q0(piu0VarG, rq00.d, vbfVar);
        sgy sgyVarB = sre0.f32672a.b(rq00.class);
        String strT = ny9.T(sgyVarB);
        if (strT == null) {
            jf4.o("Local and anonymous classes can not be ViewModels");
            return;
        }
        gnk0 gnk0Var = ((rq00) h0q0Var.t(sgyVarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strT))).b;
        int i = gnk0Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((pq00) gnk0Var.d(i2)).m();
        }
        fragment.t = false;
        this.f45380a.o(fragment, false);
        fragment.k1 = null;
        fragment.l1 = null;
        fragment.w1 = null;
        fragment.x1.l(null);
        fragment.q = false;
    }

    public final void i() {
        if (e.V(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.c);
        }
        Fragment fragment = this.c;
        fragment.f45370a = -1;
        fragment.j1 = false;
        fragment.B1.g(new vwq(fragment, (byte) 5), "Fragment#onDetach");
        fragment.q1 = null;
        if (!fragment.j1) {
            throw new iin0(axq.k("Fragment ", fragment, " did not call through to super.onDetach()"));
        }
        v1r v1rVar = fragment.x;
        if (!v1rVar.K) {
            v1rVar.o();
            fragment.x = new v1r();
        }
        this.f45380a.f(this.c, false);
        Fragment fragment2 = this.c;
        fragment2.f45370a = -1;
        fragment2.w = null;
        fragment2.v1.b = null;
        Fragment fragment3 = this.c;
        fragment3.y = null;
        fragment3.v = null;
        if (!fragment3.m || fragment3.P()) {
            w1r w1rVar = (w1r) this.b.e;
            if (!((w1rVar.b.containsKey(this.c.f) && w1rVar.e) ? w1rVar.f : true)) {
                return;
            }
        }
        if (e.V(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.c);
        }
        this.c.M();
    }

    public final void j() {
        Fragment fragment = this.c;
        if (fragment.p && fragment.q && !fragment.t) {
            if (e.V(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
            }
            Bundle bundle = fragment.b;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            LayoutInflater layoutInflaterB0 = fragment.b0(bundle2);
            fragment.q1 = layoutInflaterB0;
            fragment.k0(layoutInflaterB0, null, bundle2);
            View view = fragment.l1;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.l1.setTag(R.id.fragment_container_view_tag, fragment);
                if (fragment.Y) {
                    fragment.l1.setVisibility(8);
                }
                fragment.l0();
                this.f45380a.n(fragment, fragment.l1, bundle2, false);
                fragment.f45370a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z = this.d;
        Fragment fragment = this.c;
        if (z) {
            if (e.V(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + fragment);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int iD = d();
                int i = fragment.f45370a;
                pmi pmiVar = this.b;
                if (iD == i) {
                    if (!z2 && i == -1 && fragment.m && !fragment.P() && !fragment.o) {
                        if (e.V(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + fragment);
                        }
                        ((w1r) pmiVar.e).x(fragment, true);
                        pmiVar.D(this);
                        if (e.V(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + fragment);
                        }
                        fragment.M();
                    }
                    if (fragment.p1) {
                        if (fragment.l1 != null && (viewGroup = fragment.k1) != null) {
                            nxj nxjVarI = nxj.i(viewGroup, fragment.F());
                            if (fragment.Y) {
                                if (e.V(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragment);
                                }
                                nxjVarI.d(tnk0.d, snk0.f32499a, this);
                            } else {
                                if (e.V(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragment);
                                }
                                nxjVarI.d(tnk0.c, snk0.f32499a, this);
                            }
                        }
                        e eVar = fragment.v;
                        if (eVar != null && fragment.l && e.W(fragment)) {
                            eVar.H = true;
                        }
                        fragment.p1 = false;
                        fragment.c0();
                        fragment.x.r();
                    }
                    return;
                }
                if (iD <= i) {
                    switch (i - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (fragment.o) {
                                if (((Bundle) ((HashMap) pmiVar.d).get(fragment.f)) == null) {
                                    pmiVar.G(o(), fragment.f);
                                }
                            }
                            g();
                            break;
                        case 1:
                            h();
                            fragment.f45370a = 1;
                            break;
                        case 2:
                            fragment.q = false;
                            fragment.f45370a = 2;
                            break;
                        case 3:
                            if (e.V(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + fragment);
                            }
                            if (fragment.o) {
                                pmiVar.G(o(), fragment.f);
                            } else if (fragment.l1 != null && fragment.c == null) {
                                p();
                            }
                            if (fragment.l1 != null && (viewGroup2 = fragment.k1) != null) {
                                nxj nxjVarI2 = nxj.i(viewGroup2, fragment.F());
                                if (e.V(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragment);
                                }
                                nxjVarI2.d(tnk0.b, snk0.c, this);
                            }
                            fragment.f45370a = 3;
                            break;
                        case 4:
                            r();
                            break;
                        case 5:
                            fragment.f45370a = 5;
                            break;
                        case 6:
                            l();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fragment.l1 != null && (viewGroup3 = fragment.k1) != null) {
                                nxj nxjVarI3 = nxj.i(viewGroup3, fragment.F());
                                int visibility = fragment.l1.getVisibility();
                                tnk0.f34240a.getClass();
                                tnk0 tnk0VarF = cge0.f(visibility);
                                if (e.V(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragment);
                                }
                                nxjVarI3.d(tnk0VarF, snk0.b, this);
                            }
                            fragment.f45370a = 4;
                            break;
                        case 5:
                            q();
                            break;
                        case 6:
                            fragment.f45370a = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z2 = true;
            }
        } finally {
            this.d = false;
        }
    }

    public final void l() {
        boolean zV = e.V(3);
        Fragment fragment = this.c;
        if (zV) {
            Log.d("FragmentManager", "movefrom RESUMED: " + fragment);
        }
        a7q a7qVar = fragment.B1;
        v1r v1rVar = fragment.x;
        if (v1rVar.h != null) {
            v1rVar.d();
        }
        v1rVar.x(5);
        if (fragment.l1 != null) {
            a7qVar.g(new vwq(fragment, (byte) 21), "FragmentViewLifecycle#handleLifecycleEvent(ON_PAUSE)");
        }
        a7qVar.g(new vwq(fragment, (byte) 1), "FragmentLifecycle#handleLifecycleEvent(ON_PAUSE)");
        fragment.f45370a = 6;
        fragment.j1 = false;
        a7qVar.g(new vwq(fragment, (byte) 2), "Fragment#onPause");
        if (!fragment.j1) {
            throw new iin0(axq.k("Fragment ", fragment, " did not call through to super.onPause()"));
        }
        this.f45380a.g(fragment, false);
    }

    public final void m(ClassLoader classLoader) {
        Fragment fragment = this.c;
        Bundle bundle = fragment.b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (fragment.b.getBundle("savedInstanceState") == null) {
            fragment.b.putBundle("savedInstanceState", new Bundle());
        }
        try {
            fragment.c = fragment.b.getSparseParcelableArray("viewState");
            fragment.d = fragment.b.getBundle("viewRegistryState");
            FragmentState fragmentState = (FragmentState) fragment.b.getParcelable(CommonConstant.ReqAccessTokenParam.STATE_LABEL);
            if (fragmentState != null) {
                fragment.i = fragmentState.m;
                fragment.j = fragmentState.n;
                Boolean bool = fragment.e;
                if (bool != null) {
                    fragment.n1 = bool.booleanValue();
                    fragment.e = null;
                } else {
                    fragment.n1 = fragmentState.o;
                }
            }
            if (fragment.n1) {
                return;
            }
            fragment.m1 = true;
        } catch (BadParcelableException e) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + fragment, e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    public final void n() {
        boolean zRequestFocus;
        String str;
        boolean zV = e.V(3);
        Fragment fragment = this.c;
        if (zV) {
            Log.d("FragmentManager", "moveto RESUMED: " + fragment);
        }
        cxq cxqVar = fragment.o1;
        View view = cxqVar == null ? null : cxqVar.k;
        if (view != null) {
            if (view == fragment.l1) {
                zRequestFocus = view.requestFocus();
                if (e.V(2)) {
                    StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                    sb.append(view);
                    sb.append(Separators.SP);
                    if (zRequestFocus) {
                        str = "succeeded";
                    } else {
                        str = "failed";
                    }
                    sb.append(str);
                    sb.append(" on Fragment ");
                    sb.append(fragment);
                    sb.append(" resulting in focused view ");
                    sb.append(fragment.l1.findFocus());
                    Log.v("FragmentManager", sb.toString());
                }
            } else {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == fragment.l1) {
                            zRequestFocus = view.requestFocus();
                            if (e.V(2)) {
                                StringBuilder sb2 = new StringBuilder("requestFocus: Restoring focused view ");
                                sb2.append(view);
                                sb2.append(Separators.SP);
                                if (zRequestFocus) {
                                    str = "succeeded";
                                } else {
                                    str = "failed";
                                }
                                sb2.append(str);
                                sb2.append(" on Fragment ");
                                sb2.append(fragment);
                                sb2.append(" resulting in focused view ");
                                sb2.append(fragment.l1.findFocus());
                                Log.v("FragmentManager", sb2.toString());
                            }
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
            }
        }
        fragment.A().k = null;
        fragment.x.c0();
        fragment.x.C(true);
        byte b = 7;
        fragment.f45370a = 7;
        fragment.j1 = false;
        a7q a7qVar = fragment.B1;
        a7qVar.g(new vwq(fragment, (byte) 6), "Fragment#onResume");
        if (!fragment.j1) {
            throw new iin0(axq.k("Fragment ", fragment, " did not call through to super.onResume()"));
        }
        a7qVar.g(new vwq(fragment, b), "FragmentLifecycle#handleLifecycleEvent(ON_RESUME)");
        if (fragment.l1 != null) {
            a7qVar.g(new vwq(fragment, (byte) 8), "FragmentViewLifecycle#handleLifecycleEvent(ON_RESUME)");
        }
        v1r v1rVar = fragment.x;
        v1rVar.I = false;
        v1rVar.J = false;
        v1rVar.P.g = false;
        v1rVar.x(7);
        this.f45380a.j(fragment, false);
        this.b.G(null, fragment.f);
        fragment.b = null;
        fragment.c = null;
        fragment.d = null;
    }

    public final Bundle o() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.c;
        if (fragment.f45370a == -1 && (bundle = fragment.b) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable(CommonConstant.ReqAccessTokenParam.STATE_LABEL, new FragmentState(fragment));
        if (fragment.f45370a > 0) {
            Bundle bundle3 = new Bundle();
            fragment.B1.g(new wwq(fragment, bundle3, (byte) 0), "Fragment#onSaveInstanceState");
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f45380a.k(fragment, bundle3, false);
            Bundle bundle4 = new Bundle();
            fragment.z1.q(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleP0 = fragment.x.p0();
            if (!bundleP0.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleP0);
            }
            if (fragment.l1 != null) {
                p();
            }
            SparseArray<? extends Parcelable> sparseArray = fragment.c;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = fragment.d;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = fragment.g;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void p() {
        Fragment fragment = this.c;
        if (fragment.l1 == null) {
            return;
        }
        if (e.V(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + fragment + " with view " + fragment.l1);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.l1.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.c = sparseArray;
        }
        Bundle bundle = new Bundle();
        ((nw20) fragment.w1.g).q(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        fragment.d = bundle;
    }

    public final void q() {
        boolean zV = e.V(3);
        Fragment fragment = this.c;
        if (zV) {
            Log.d("FragmentManager", "moveto STARTED: " + fragment);
        }
        fragment.x.c0();
        fragment.x.C(true);
        fragment.f45370a = 5;
        fragment.j1 = false;
        a7q a7qVar = fragment.B1;
        a7qVar.g(new vwq(fragment, (byte) 17), "Fragment#onStart");
        if (!fragment.j1) {
            throw new iin0(axq.k("Fragment ", fragment, " did not call through to super.onStart()"));
        }
        a7qVar.g(new vwq(fragment, (byte) 18), "FragmentLifecycle#handleLifecycleEvent(ON_START)");
        if (fragment.l1 != null) {
            a7qVar.g(new vwq(fragment, (byte) 19), "FragmentViewLifecycle#handleLifecycleEvent(ON_START)");
        }
        v1r v1rVar = fragment.x;
        v1rVar.I = false;
        v1rVar.J = false;
        v1rVar.P.g = false;
        v1rVar.x(5);
        this.f45380a.l(fragment, false);
    }

    public final void r() {
        boolean zV = e.V(3);
        Fragment fragment = this.c;
        if (zV) {
            Log.d("FragmentManager", "movefrom STARTED: " + fragment);
        }
        a7q a7qVar = fragment.B1;
        v1r v1rVar = fragment.x;
        v1rVar.J = true;
        v1rVar.P.g = true;
        v1rVar.x(4);
        byte b = 0;
        if (fragment.l1 != null) {
            a7qVar.g(new vwq(fragment, b), "FragmentViewLifecycle#handleLifecycleEvent(ON_STOP)");
        }
        a7qVar.g(new vwq(fragment, (byte) 10), "FragmentLifecycle#handleLifecycleEvent(ON_STOP)");
        fragment.f45370a = 4;
        fragment.j1 = false;
        a7qVar.g(new vwq(fragment, (byte) 15), "Fragment#onStop");
        if (!fragment.j1) {
            throw new iin0(axq.k("Fragment ", fragment, " did not call through to super.onStop()"));
        }
        this.f45380a.m(fragment, false);
    }

    public f(fhj fhjVar, pmi pmiVar, Fragment fragment) {
        this.f45380a = fhjVar;
        this.b = pmiVar;
        this.c = fragment;
    }

    public f(fhj fhjVar, pmi pmiVar, Fragment fragment, Bundle bundle) {
        this.f45380a = fhjVar;
        this.b = pmiVar;
        this.c = fragment;
        fragment.c = null;
        fragment.d = null;
        fragment.u = 0;
        fragment.q = false;
        fragment.l = false;
        Fragment fragment2 = fragment.h;
        fragment.i = fragment2 != null ? fragment2.f : null;
        fragment.h = null;
        fragment.b = bundle;
        fragment.g = bundle.getBundle("arguments");
    }
}
