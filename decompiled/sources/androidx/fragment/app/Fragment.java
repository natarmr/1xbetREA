package androidx.fragment.app;

import a.a7g0;
import a.a7q;
import a.axq;
import a.bsi0;
import a.bsr0;
import a.bxq;
import a.by40;
import a.clz;
import a.cxq;
import a.fbv;
import a.glz;
import a.h0h0;
import a.hy40;
import a.i0h0;
import a.i5r;
import a.j5r;
import a.jf4;
import a.jxq;
import a.k5r;
import a.kd30;
import a.kxq;
import a.liu0;
import a.lkz;
import a.miu0;
import a.mx2;
import a.n6r;
import a.nw20;
import a.piu0;
import a.qx9;
import a.r0h0;
import a.riu0;
import a.s7n0;
import a.uyn;
import a.v1r;
import a.vbc;
import a.vwq;
import a.wmv;
import a.wn;
import a.wwq;
import a.xwq;
import a.ywq;
import a.zpu;
import a.zwq;
import a.zzg0;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, clz, riu0, wmv, i0h0 {
    public static final Object G1 = new Object();
    public int A;
    public final int A1;
    public String B;
    public final a7q B1;
    public final AtomicInteger C1;
    public final ArrayList D1;
    public final zwq E1;
    public final zwq F1;
    public boolean Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45370a;
    public Bundle b;
    public SparseArray c;
    public Bundle d;
    public Boolean e;
    public String f;
    public boolean f1;
    public Bundle g;
    public boolean g1;
    public Fragment h;
    public boolean h1;
    public String i;
    public boolean i1;
    public int j;
    public boolean j1;
    public Boolean k;
    public ViewGroup k1;
    public boolean l;
    public View l1;
    public boolean m;
    public boolean m1;
    public boolean n;
    public boolean n1;
    public boolean o;
    public cxq o1;
    public boolean p;
    public boolean p1;
    public boolean q;
    public LayoutInflater q1;
    public boolean r;
    public boolean r1;
    public boolean s;
    public String s1;
    public boolean t;
    public lkz t1;
    public int u;
    public glz u1;
    public e v;
    public final fbv v1;
    public jxq w;
    public n6r w1;
    public v1r x;
    public final hy40 x1;
    public Fragment y;
    public r0h0 y1;
    public int z;
    public nw20 z1;

    public Fragment() {
        this.f45370a = -1;
        this.f = UUID.randomUUID().toString();
        this.i = null;
        this.k = null;
        this.x = new v1r();
        this.i1 = true;
        this.n1 = true;
        new mx2(this, (byte) 12);
        this.t1 = lkz.e;
        this.v1 = new fbv();
        this.x1 = new hy40();
        this.B1 = new a7q(this);
        this.C1 = new AtomicInteger();
        this.D1 = new ArrayList();
        this.E1 = new zwq(this, (byte) 0);
        this.F1 = new zwq(this, (byte) 1);
        L();
    }

    public final cxq A() {
        cxq cxqVar = this.o1;
        if (cxqVar != null) {
            return cxqVar;
        }
        cxq cxqVar2 = new cxq();
        Object obj = G1;
        cxqVar2.g = obj;
        cxqVar2.h = obj;
        cxqVar2.i = obj;
        cxqVar2.j = 1.0f;
        cxqVar2.k = null;
        this.o1 = cxqVar2;
        return cxqVar2;
    }

    public final kxq B() {
        jxq jxqVar = this.w;
        if (jxqVar == null) {
            return null;
        }
        return (kxq) jxqVar.f17320a;
    }

    public final e C() {
        if (this.w != null) {
            return this.x;
        }
        jf4.n(axq.k("Fragment ", this, " has not been attached yet."));
        return null;
    }

    public final Context D() {
        jxq jxqVar = this.w;
        if (jxqVar == null) {
            return null;
        }
        return jxqVar.b;
    }

    public final int E() {
        lkz lkzVar = this.t1;
        return (lkzVar == lkz.b || this.y == null) ? lkzVar.ordinal() : Math.min(lkzVar.ordinal(), this.y.E());
    }

    public final e F() {
        e eVar = this.v;
        if (eVar != null) {
            return eVar;
        }
        jf4.n(axq.k("Fragment ", this, " not associated with a fragment manager."));
        return null;
    }

    public final Resources G() {
        return o0().getResources();
    }

    public final String H(int i) {
        return G().getString(i);
    }

    public final String I(int i, Object... objArr) {
        return G().getString(i, objArr);
    }

    public View J() {
        return this.l1;
    }

    public final n6r K() {
        n6r n6rVar = this.w1;
        if (n6rVar != null) {
            return n6rVar;
        }
        jf4.n(axq.k("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
        return null;
    }

    public final void L() {
        this.u1 = new glz(this, true);
        this.z1 = new nw20(new h0h0(this, new a7g0(this, (byte) 12)));
        this.y1 = null;
        ArrayList arrayList = this.D1;
        zwq zwqVar = this.E1;
        if (!arrayList.contains(zwqVar)) {
            if (this.f45370a >= 0) {
                zwqVar.a();
            } else {
                arrayList.add(zwqVar);
            }
        }
        zwq zwqVar2 = this.F1;
        if (arrayList.contains(zwqVar2)) {
            return;
        }
        if (this.f45370a >= 0) {
            zwqVar2.a();
        } else {
            arrayList.add(zwqVar2);
        }
    }

    final void M() {
        L();
        this.s1 = this.f;
        this.f = UUID.randomUUID().toString();
        this.l = false;
        this.m = false;
        this.p = false;
        this.q = false;
        this.s = false;
        this.u = 0;
        this.v = null;
        this.x = new v1r();
        this.w = null;
        this.z = 0;
        this.A = 0;
        this.B = null;
        this.Y = false;
        this.Z = false;
    }

    public final boolean N() {
        return this.w != null && this.l;
    }

    public final boolean O() {
        if (this.Y) {
            return true;
        }
        e eVar = this.v;
        if (eVar != null) {
            Fragment fragment = this.y;
            eVar.getClass();
            if (fragment == null ? false : fragment.O()) {
                return true;
            }
        }
        return false;
    }

    public final boolean P() {
        return this.u > 0;
    }

    public final boolean Q() {
        return this.f45370a >= 7;
    }

    public final boolean R() {
        e eVar = this.v;
        if (eVar == null) {
            return false;
        }
        return eVar.a0();
    }

    public final boolean S() {
        View view;
        return (!N() || O() || (view = this.l1) == null || view.getWindowToken() == null || this.l1.getVisibility() != 0) ? false : true;
    }

    public void T() {
        this.j1 = true;
    }

    public void U(int i, int i2, Intent intent) {
        if (e.V(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void V(Context context) {
        this.j1 = true;
        jxq jxqVar = this.w;
        if ((jxqVar == null ? null : jxqVar.f17320a) != null) {
            this.j1 = true;
        }
    }

    public void W(Bundle bundle) {
        Bundle bundle2;
        this.j1 = true;
        Bundle bundle3 = this.b;
        if (bundle3 != null && (bundle2 = bundle3.getBundle("childFragmentManager")) != null) {
            this.x.o0(bundle2);
            v1r v1rVar = this.x;
            v1rVar.I = false;
            v1rVar.J = false;
            v1rVar.P.g = false;
            v1rVar.x(1);
        }
        v1r v1rVar2 = this.x;
        if (v1rVar2.w >= 1) {
            return;
        }
        v1rVar2.I = false;
        v1rVar2.J = false;
        v1rVar2.P.g = false;
        v1rVar2.x(1);
    }

    public View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.A1;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void Y() {
        this.j1 = true;
    }

    public void Z() {
        this.j1 = true;
    }

    public void a0() {
        this.j1 = true;
    }

    public LayoutInflater b0(Bundle bundle) {
        jxq jxqVar = this.w;
        if (jxqVar == null) {
            jf4.n("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        kxq kxqVar = jxqVar.e;
        LayoutInflater layoutInflaterCloneInContext = kxqVar.getLayoutInflater().cloneInContext(kxqVar);
        layoutInflaterCloneInContext.setFactory2(this.x.f);
        return layoutInflaterCloneInContext;
    }

    public void d0() {
        this.j1 = true;
    }

    public void e0() {
        this.j1 = true;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public void f0(Bundle bundle) {
    }

    @Override // a.riu0
    public final piu0 g() {
        if (this.v == null) {
            jf4.n("Can't access ViewModels from detached fragment");
            return null;
        }
        int iE = E();
        lkz lkzVar = lkz.f20223a;
        if (iE == 1) {
            jf4.n("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap map = this.v.P.d;
        piu0 piu0Var = (piu0) map.get(this.f);
        if (piu0Var != null) {
            return piu0Var;
        }
        piu0 piu0Var2 = new piu0();
        map.put(this.f, piu0Var2);
        return piu0Var2;
    }

    public void g0() {
        this.j1 = true;
    }

    @Override // a.i0h0
    public final kd30 h() {
        return (kd30) this.z1.b;
    }

    public void h0() {
        this.j1 = true;
    }

    public void i0(View view, Bundle bundle) {
    }

    public void j0(Bundle bundle) {
        this.j1 = true;
    }

    public void k0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.x.c0();
        this.t = true;
        this.w1 = new n6r(this, g(), new vwq(this, (byte) 13));
        this.B1.g(new qx9((Object) this, (Object) layoutInflater, (Object) viewGroup, (Object) bundle, (byte) 5), "Fragment#onCreateView");
        View view = this.l1;
        n6r n6rVar = this.w1;
        if (view == null) {
            if (n6rVar.c == null) {
                this.w1 = null;
                return;
            } else {
                jf4.n("Called getViewLifecycleOwner() but onCreateView() returned null");
                return;
            }
        }
        n6rVar.b();
        if (e.V(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.l1 + " for Fragment " + this);
        }
        s7n0.x(this.l1, this.w1);
        View view2 = this.l1;
        n6r n6rVar2 = this.w1;
        view2.getClass();
        view2.setTag(R.id.view_tree_view_model_store_owner, n6rVar2);
        View view3 = this.l1;
        n6r n6rVar3 = this.w1;
        view3.getClass();
        view3.setTag(R.id.view_tree_saved_state_registry_owner, n6rVar3);
        this.x1.l(this.w1);
    }

    public final void l0() {
        Bundle bundle = this.b;
        this.B1.g(new wwq(this, bundle != null ? bundle.getBundle("savedInstanceState") : null, (byte) 3), "Fragment#onViewCreated");
        this.x.x(2);
    }

    public final ywq m0(wn wnVar, bsr0 bsr0Var) {
        uyn uynVar = new uyn(this);
        if (this.f45370a > 1) {
            jf4.n(axq.k("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
            return null;
        }
        AtomicReference atomicReference = new AtomicReference();
        xwq xwqVar = new xwq(this, uynVar, atomicReference, bsr0Var, wnVar);
        if (this.f45370a >= 0) {
            xwqVar.a();
        } else {
            this.D1.add(xwqVar);
        }
        return new ywq(atomicReference);
    }

    @Override // a.wmv
    public final miu0 n() {
        Application application = null;
        if (this.v == null) {
            jf4.n("Can't access ViewModels from detached fragment");
            return null;
        }
        r0h0 r0h0Var = this.y1;
        if (r0h0Var != null) {
            return r0h0Var;
        }
        for (Context applicationContext = o0().getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
        }
        if (application == null && e.V(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + o0().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        r0h0 r0h0Var2 = new r0h0(application, this, this.g);
        this.y1 = r0h0Var2;
        return r0h0Var2;
    }

    public final kxq n0() {
        kxq kxqVarB = B();
        if (kxqVarB != null) {
            return kxqVarB;
        }
        jf4.n(axq.k("Fragment ", this, " not attached to an activity."));
        return null;
    }

    @Override // a.wmv
    public final by40 o() {
        Application application;
        Context applicationContext = o0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && e.V(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + o0().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        by40 by40Var = new by40(0);
        LinkedHashMap linkedHashMap = by40Var.f38875a;
        if (application != null) {
            linkedHashMap.put(liu0.d, application);
        }
        linkedHashMap.put(zzg0.f45252a, this);
        linkedHashMap.put(zzg0.b, this);
        Bundle bundle = this.g;
        if (bundle != null) {
            linkedHashMap.put(zzg0.c, bundle);
        }
        return by40Var;
    }

    public final Context o0() {
        Context contextD = D();
        if (contextD != null) {
            return contextD;
        }
        jf4.n(axq.k("Fragment ", this, " not attached to a context."));
        return null;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.j1 = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        n0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.j1 = true;
    }

    public final Fragment p0() {
        Fragment fragment = this.y;
        if (fragment != null) {
            return fragment;
        }
        if (D() == null) {
            jf4.n(axq.k("Fragment ", this, " is not attached to any Fragment or host"));
            return null;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        Context contextD = D();
        sb.append(" is not a child Fragment, it is directly attached to ");
        sb.append(contextD);
        throw new IllegalStateException(sb.toString());
    }

    public final View q0() {
        View viewJ = J();
        if (viewJ != null) {
            return viewJ;
        }
        jf4.n(axq.k("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
        return null;
    }

    public Activity r() {
        return B();
    }

    public final void r0(int i, int i2, int i3, int i4) {
        if (this.o1 == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        A().b = i;
        A().c = i2;
        A().d = i3;
        A().e = i4;
    }

    public final void s0(Bundle bundle) {
        if (this.v == null || !R()) {
            this.g = bundle;
        } else {
            jf4.n("Fragment already added and state has been saved");
        }
    }

    public final void startActivityForResult(Intent intent, int i) {
        if (this.w == null) {
            jf4.n(axq.k("Fragment ", this, " not attached to Activity"));
            return;
        }
        e eVarF = F();
        if (eVarF.D != null) {
            String str = this.f;
            FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = new FragmentManager$LaunchedFragmentInfo();
            fragmentManager$LaunchedFragmentInfo.f45373a = str;
            fragmentManager$LaunchedFragmentInfo.b = i;
            eVarF.G.addLast(fragmentManager$LaunchedFragmentInfo);
            eVarF.D.a(intent);
            return;
        }
        jxq jxqVar = eVarF.x;
        jxqVar.getClass();
        intent.getClass();
        if (i == -1) {
            jxqVar.b.startActivity(intent, null);
        } else {
            jf4.n("Starting activity with a requestCode requires a FragmentActivity host");
        }
    }

    public final void t0(SavedState savedState) {
        Bundle bundle;
        if (this.v != null) {
            jf4.n("Fragment already added");
            return;
        }
        if (savedState == null || (bundle = savedState.f45371a) == null) {
            bundle = null;
        }
        this.b = bundle;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f);
        if (this.z != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.z));
        }
        if (this.B != null) {
            sb.append(" tag=");
            sb.append(this.B);
        }
        sb.append(Separators.RPAREN);
        return sb.toString();
    }

    public final void u0(boolean z) {
        if (this.i1 != z) {
            this.i1 = z;
            if (this.h1 && N() && !O()) {
                this.w.e.invalidateOptionsMenu();
            }
        }
    }

    public final void v0() {
        j5r j5rVar = k5r.f17734a;
        bsi0 bsi0Var = new bsi0(this, "Attempting to set retain instance for fragment " + this);
        k5r.c(bsi0Var);
        j5r j5rVarA = k5r.a(this);
        if (j5rVarA.f15946a.contains(i5r.f) && k5r.e(j5rVarA, getClass(), bsi0.class)) {
            k5r.b(j5rVarA, bsi0Var);
        }
        this.f1 = true;
        e eVar = this.v;
        if (eVar != null) {
            eVar.P.w(this);
        } else {
            this.g1 = true;
        }
    }

    public final void w0(Intent intent) {
        jxq jxqVar = this.w;
        if (jxqVar == null) {
            jf4.n(axq.k("Fragment ", this, " not attached to Activity"));
        } else {
            intent.getClass();
            jxqVar.b.startActivity(intent, null);
        }
    }

    @Override // a.clz
    public final glz x() {
        return this.u1;
    }

    public vbc y() {
        return new bxq(this);
    }

    public void z(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.z));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.A));
        printWriter.print(" mTag=");
        printWriter.println(this.B);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f45370a);
        printWriter.print(" mWho=");
        printWriter.print(this.f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.u);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.p);
        printWriter.print(" mInLayout=");
        printWriter.println(this.q);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.Y);
        printWriter.print(" mDetached=");
        printWriter.print(this.Z);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.i1);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.h1);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f1);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.n1);
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.v);
        }
        if (this.w != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.w);
        }
        if (this.y != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.y);
        }
        if (this.g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.g);
        }
        if (this.b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.b);
        }
        if (this.c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.c);
        }
        if (this.d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.d);
        }
        Fragment fragmentJ = this.h;
        if (fragmentJ == null) {
            e eVar = this.v;
            fragmentJ = (eVar == null || (str2 = this.i) == null) ? null : eVar.c.j(str2);
        }
        if (fragmentJ != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(fragmentJ);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.j);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        cxq cxqVar = this.o1;
        printWriter.println(cxqVar == null ? false : cxqVar.f5134a);
        cxq cxqVar2 = this.o1;
        if ((cxqVar2 == null ? 0 : cxqVar2.b) != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            cxq cxqVar3 = this.o1;
            printWriter.println(cxqVar3 == null ? 0 : cxqVar3.b);
        }
        cxq cxqVar4 = this.o1;
        if ((cxqVar4 == null ? 0 : cxqVar4.c) != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            cxq cxqVar5 = this.o1;
            printWriter.println(cxqVar5 == null ? 0 : cxqVar5.c);
        }
        cxq cxqVar6 = this.o1;
        if ((cxqVar6 == null ? 0 : cxqVar6.d) != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            cxq cxqVar7 = this.o1;
            printWriter.println(cxqVar7 == null ? 0 : cxqVar7.d);
        }
        cxq cxqVar8 = this.o1;
        if ((cxqVar8 == null ? 0 : cxqVar8.e) != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            cxq cxqVar9 = this.o1;
            printWriter.println(cxqVar9 != null ? cxqVar9.e : 0);
        }
        if (this.k1 != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.k1);
        }
        if (this.l1 != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.l1);
        }
        if (D() != null) {
            new zpu(this, g()).c(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.x + Separators.COLON);
        this.x.y(str.concat("  "), fileDescriptor, printWriter, strArr);
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Bundle f45371a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.f45371a = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f45371a);
        }

        public SavedState(Bundle bundle) {
            this.f45371a = bundle;
        }
    }

    public void c0() {
    }

    public Fragment(int i) {
        this();
        this.A1 = i;
    }
}
