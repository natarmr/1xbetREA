package a;

import android.util.Log;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class v62 extends eg60 {
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v62(Object obj, byte b) {
        super(true);
        this.d = b;
        this.e = obj;
    }

    @Override // a.eg60
    public void a() {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 4:
                ((c2) obj).x();
                break;
            case 10:
                androidx.fragment.app.e eVar = (androidx.fragment.app.e) obj;
                if (androidx.fragment.app.e.V(3)) {
                    Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + eVar);
                }
                eVar.d();
                break;
        }
    }

    @Override // a.eg60
    public final void b() {
        byte b = this.d;
        kzl0 kzl0Var = kzl0.f19158a;
        Object obj = this.e;
        switch (b) {
            case 0:
                pek0 pek0Var = w62.Q1;
                ((w62) obj).G0().x(e62.f7260a);
                return;
            case 1:
                rek0 rek0Var = ia2.Q1;
                ((ia2) obj).G0().x(u92.f35261a);
                return;
            case 2:
                gfk0 gfk0Var = vd2.R1;
                ((k3t0) ((vd2) obj).N1.getValue()).x(md2.f21576a);
                return;
            case 3:
                hfk0 hfk0Var = ef2.V1;
                ((ef2) obj).L0().x(pe2.f26829a);
                return;
            case 4:
                ((c2) obj).y();
                return;
            case 5:
                bj5 bj5Var = ut9.s2;
                ((ut9) obj).P0().x(lt9.f20621a);
                return;
            case 6:
                hgb hgbVar = (hgb) obj;
                jk3 jk3Var = hgbVar.X1;
                if ((jk3Var == null || ((FrameLayout) jk3Var.e).getVisibility() != 0) && hgbVar.G0().d.d.k.getVisibility() == 0) {
                    hgbVar.H0().z();
                    return;
                } else {
                    e();
                    hgbVar.n0().k().c().a();
                    return;
                }
            case 7:
                cl5 cl5Var = jdc.Q1;
                ((jdc) obj).G0().x(zcc.f44158a);
                return;
            case 8:
                if (this.b) {
                    sek sekVar = ayn.c2;
                    ((ayn) obj).I0().x(uxn.f36449a);
                    f(false);
                    return;
                }
                return;
            case 9:
                ((Function0) obj).invoke();
                return;
            case 10:
                androidx.fragment.app.e eVar = (androidx.fragment.app.e) obj;
                if (androidx.fragment.app.e.V(3)) {
                    Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + eVar);
                }
                v62 v62Var = eVar.j;
                ArrayList arrayList = eVar.o;
                eVar.i = true;
                eVar.C(true);
                eVar.i = false;
                if (eVar.h == null) {
                    if (v62Var.b) {
                        if (androidx.fragment.app.e.V(3)) {
                            Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                        }
                        eVar.g0();
                        return;
                    } else {
                        if (androidx.fragment.app.e.V(3)) {
                            Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                        }
                        eVar.g.c().a();
                        return;
                    }
                }
                if (!arrayList.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(androidx.fragment.app.e.N(eVar.h));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (it.next() != null) {
                            hny.b();
                            return;
                        }
                        Iterator it2 = linkedHashSet.iterator();
                        if (it2.hasNext()) {
                            throw null;
                        }
                    }
                }
                Iterator it3 = eVar.h.f44098a.iterator();
                while (it3.hasNext()) {
                    Fragment fragment = ((h6r) it3.next()).b;
                    if (fragment != null) {
                        fragment.n = false;
                    }
                }
                for (nxj nxjVar : eVar.i(new ArrayList(Collections.singletonList(eVar.h)), 0, 1)) {
                    ArrayList arrayList2 = nxjVar.c;
                    if (androidx.fragment.app.e.V(3)) {
                        Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
                    }
                    nxjVar.k(arrayList2);
                    nxjVar.c(arrayList2);
                }
                Iterator it4 = eVar.h.f44098a.iterator();
                while (it4.hasNext()) {
                    Fragment fragment2 = ((h6r) it4.next()).b;
                    if (fragment2 != null && fragment2.k1 == null) {
                        eVar.j(fragment2).k();
                    }
                }
                eVar.h = null;
                eVar.C0();
                if (androidx.fragment.app.e.V(3)) {
                    Log.d("FragmentManager", "Op is being set to null");
                    Log.d("FragmentManager", "OnBackPressedCallback enabled=" + v62Var.b + " for  FragmentManager " + eVar);
                    return;
                }
                return;
            case 11:
                rqt rqtVar = lkv.Q1;
                ((xkv) ((lkv) obj).M1.getValue()).w();
                return;
            case 12:
                atz atzVar = ik30.W1;
                ((ik30) obj).H0().x();
                return;
            case 13:
                htz htzVar = po50.S1;
                ((po50) obj).G0().x(xn50.f41157a);
                return;
            case 14:
                uuz uuzVar = lp50.R1;
                ((k3t0) ((lp50) obj).L1.getValue()).x(wt50.f39723a);
                return;
            case 15:
                evz evzVar = cr50.R1;
                ((k3t0) ((cr50) obj).L1.getValue()).x(tq50.f34366a);
                return;
            case 16:
                atz atzVar2 = rs50.R1;
                ((rs50) obj).G0().x(ds50.f6596a);
                return;
            case 17:
                ((Function1) obj).invoke(this);
                return;
            case 18:
                nh70 nh70Var = gs70.r2;
                ((gs70) obj).P0().x(xr70.f41356a);
                return;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                cge0 cge0Var = ddl0.V1;
                ((ddl0) obj).J0().a();
                return;
            case 20:
                syl0 syl0Var = (syl0) obj;
                if (!syl0Var.R1 && syl0Var.Q1) {
                    syl0Var.H0().x(kzl0Var);
                    return;
                } else {
                    e();
                    syl0Var.n0().k().c().a();
                    return;
                }
            case 21:
                t0m0 t0m0Var = (t0m0) obj;
                gne0 gne0Var = t0m0.Z1;
                if (t0m0Var.Q1) {
                    t0m0Var.G0().x(kzl0Var);
                    return;
                } else {
                    e();
                    t0m0Var.n0().k().c().a();
                    return;
                }
            case 22:
                g9m0 g9m0Var = npn0.j2;
                tpn0 tpn0VarU0 = ((npn0) obj).U0();
                i1w0 i1w0Var = tpn0VarU0.e;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                zx10 zx10Var = tpn0VarU0.h;
                zx10Var.getClass();
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new q0w0(zx10.k(zx10Var, r040.TOP, false, 2))), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar.next());
                    }
                }
                break;
            case 23:
                s9m0 s9m0Var = ypn0.h2;
                arn0 arn0VarN0 = ((ypn0) obj).N0();
                arn0VarN0.b.d(new j1l0(arn0VarN0, (byte) 27));
                return;
            case 24:
                y2m0 y2m0Var = zqp0.V1;
                ((zqp0) obj).H0().a();
                return;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                y2m0 y2m0Var2 = phr0.W1;
                ((phr0) obj).G0().x(tgr0.f33928a);
                return;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                j6m0 j6m0Var = pir0.W1;
                ((pir0) obj).G0().x();
                return;
            default:
                g9m0 g9m0Var2 = mvr0.W1;
                ((mvr0) obj).G0().x(xur0.f41525a);
                return;
        }
    }

    @Override // a.eg60
    public void c(pb5 pb5Var) {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 4:
                ((c2) obj).z(pb5Var);
                return;
            case 10:
                androidx.fragment.app.e eVar = (androidx.fragment.app.e) obj;
                if (androidx.fragment.app.e.V(2)) {
                    Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + eVar);
                }
                if (eVar.h != null) {
                    for (nxj nxjVar : eVar.i(new ArrayList(Collections.singletonList(eVar.h)), 0, 1)) {
                        nxjVar.getClass();
                        if (androidx.fragment.app.e.V(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + pb5Var.c);
                        }
                        ArrayList arrayList = nxjVar.c;
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            w3d.u(arrayList2, ((rnk0) it.next()).k);
                        }
                        List listL0 = CollectionsKt.L0(CollectionsKt.P0(arrayList2));
                        int size = listL0.size();
                        for (int i = 0; i < size; i++) {
                            ((qnk0) listL0.get(i)).c(pb5Var, nxjVar.f24286a);
                        }
                    }
                    Iterator it2 = eVar.o.iterator();
                    if (it2.hasNext()) {
                        throw rw2.h(it2);
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // a.eg60
    public void d(pb5 pb5Var) {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 4:
                ((c2) obj).A();
                break;
            case 10:
                androidx.fragment.app.e eVar = (androidx.fragment.app.e) obj;
                if (androidx.fragment.app.e.V(3)) {
                    Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + eVar);
                }
                eVar.z();
                eVar.A(new u1r(eVar), false);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v62(Object obj, byte b, boolean z) {
        super(false);
        this.d = b;
        this.e = obj;
    }
}
