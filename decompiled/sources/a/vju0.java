package a;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.statistic.stage.impl.champ_statistic_tour_net.presentation.adapter.LinearLayoutManagerWithAccurateOffset;
import org.xplatform.statistic.stage.impl.champ_statistic_tour_net.presentation.view.bracket.BracketItemView;

/* JADX INFO: loaded from: classes6.dex */
public final class vju0 extends xhe0 {
    public final boolean A;
    public final Function2 B;
    public final Function0 C;
    public final boolean D;
    public final LinearLayoutManager E;
    public final int F;
    public final Rect G;
    public WeakReference H;
    public WeakReference I;
    public final int J;
    public int K;
    public final zas0 L;
    public final gz6 M;
    public int N;
    public final qmk0 O;
    public ybl P;
    public final dc3 u;
    public final RecyclerView v;
    public final HashMap w;
    public final Function2 x;
    public final Function1 y;
    public final boolean z;

    /* JADX WARN: Illegal instructions before constructor call */
    public vju0(dc3 dc3Var, RecyclerView recyclerView, HashMap map, LinkedHashMap linkedHashMap, Function2 function2, Function1 function1, boolean z, boolean z2, Function2 function3, Function0 function0, boolean z3) {
        map.getClass();
        LinearLayout linearLayout = (LinearLayout) dc3Var.b;
        super(linearLayout);
        this.u = dc3Var;
        this.v = recyclerView;
        this.w = map;
        this.x = function2;
        this.y = function1;
        this.z = z;
        this.A = z2;
        this.B = function3;
        this.C = function0;
        this.D = z3;
        androidx.recyclerview.widget.b layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        this.E = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        this.F = linearLayout.getContext().getResources().getDimensionPixelSize(R.dimen.size_46);
        this.G = new Rect();
        Context context = linearLayout.getContext();
        sz3 sz3Var = new sz3((byte) 0);
        new tz3(context);
        new Handler(Looper.myLooper(), sz3Var);
        int i = uz3.b;
        this.J = linearLayout.getContext().getResources().getDimensionPixelSize(R.dimen.size_8);
        this.K = -1;
        this.L = new zas0((Object) this, (byte) 11);
        this.M = new gz6(this, (byte) 6);
        this.N = d();
        this.O = new qmk0(linearLayout.getResources().getDimensionPixelOffset(R.dimen.space_6), linearLayout.getResources().getDimensionPixelOffset(R.dimen.space_8), 0, linearLayout.getResources().getDimensionPixelOffset(R.dimen.space_8), 0, 0, null, null, 468);
        ((RecyclerView) dc3Var.c).setVisibility(z ? (byte) 8 : (byte) 0);
    }

    public static void v(RecyclerView recyclerView, BracketItemView bracketItemView, int i) {
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        androidx.recyclerview.widget.b layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManagerWithAccurateOffset linearLayoutManagerWithAccurateOffset = layoutManager instanceof LinearLayoutManagerWithAccurateOffset ? (LinearLayoutManagerWithAccurateOffset) layoutManager : null;
        int iC1 = iComputeVerticalScrollOffset - (linearLayoutManagerWithAccurateOffset != null ? linearLayoutManagerWithAccurateOffset.C1(i) : 0);
        if (iC1 < 0) {
            iC1 = 0;
        }
        bracketItemView.k.offsetTo(0, iC1);
        bracketItemView.i();
        bracketItemView.c();
    }

    public final void A(int i) {
        fsv fsvVar;
        ArrayList arrayList = null;
        fsv fsvVar2 = null;
        if (this.z) {
            WeakReference weakReference = this.I;
            if (weakReference != null && (fsvVar = (fsv) weakReference.get()) != null) {
                fsvVar.t(i, d());
            }
            RecyclerView recyclerView = this.v;
            xhe0 xhe0VarO = recyclerView != null ? recyclerView.O(d() - 1) : null;
            fsv fsvVar3 = xhe0VarO instanceof fsv ? (fsv) xhe0VarO : null;
            if (fsvVar3 == null) {
                WeakReference weakReference2 = this.H;
                if (weakReference2 != null) {
                    fsvVar2 = (fsv) weakReference2.get();
                }
            } else {
                fsvVar2 = fsvVar3;
            }
            if (fsvVar2 != null) {
                fsvVar2.t(i, d());
                return;
            }
            return;
        }
        dc3 dc3Var = this.u;
        yge0 adapter = ((RecyclerView) dc3Var.c).getAdapter();
        ybc ybcVar = adapter instanceof ybc ? (ybc) adapter : null;
        if (ybcVar != null) {
            List<p6t0> list = (List) ybcVar.f;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
                for (p6t0 p6t0Var : list) {
                    p6t0Var.getClass();
                    arrayList2.add((ifo0) p6t0Var);
                }
                ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                int i2 = 0;
                for (Object obj : arrayList2) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        q3d.p();
                        throw null;
                    }
                    arrayList3.add(ifo0.c((ifo0) obj, i2 == i));
                    i2 = i3;
                }
                arrayList = arrayList3;
            }
            ybcVar.f = arrayList;
        }
        if (ybcVar != null) {
            ybcVar.g();
        }
        ((RecyclerView) dc3Var.c).B0(i);
    }

    public final void t(a1m0 a1m0Var, uju0 uju0Var, int i) {
        int iD;
        RecyclerView recyclerView;
        if (uju0Var.equals(tju0.f34068a)) {
            iD = d();
        } else {
            if (!(uju0Var instanceof sju0)) {
                t9f.b();
                return;
            }
            iD = ((sju0) uju0Var).f32319a ? d() : d() + 1;
        }
        this.N = iD;
        this.K = i;
        Integer numValueOf = Integer.valueOf(iD);
        HashMap map = this.w;
        boolean z = map.get(numValueOf) != null;
        int i2 = i != -1 ? a1m0Var.e : -1;
        Integer num = (Integer) map.get(Integer.valueOf(this.N));
        int iIntValue = num != null ? num.intValue() : i2 != -1 ? i2 : 0;
        dc3 dc3Var = this.u;
        BracketItemView bracketItemView = (BracketItemView) dc3Var.d;
        RecyclerView recyclerView2 = (RecyclerView) dc3Var.c;
        BracketItemView bracketItemView2 = (BracketItemView) dc3Var.d;
        zas0 zas0Var = this.L;
        bracketItemView.setDelegate(zas0Var);
        bracketItemView2.setAllHighlightedItemsDelegate(this.C);
        boolean z2 = this.A;
        bracketItemView2.setSingleNetOptimizationEnabled(z2);
        bracketItemView2.n(a1m0Var, uju0Var, iIntValue);
        if (!this.z) {
            ybc ybcVar = new ybc(new npt0(this, (byte) 12));
            List list = a1m0Var.f77a;
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                String str = (String) obj;
                str.getClass();
                arrayList.add(new ifo0(str, i3 == bracketItemView2.getPage()));
                i3 = i4;
            }
            ybcVar.f = arrayList;
            recyclerView2.setAdapter(ybcVar);
            qmk0 qmk0Var = this.O;
            recyclerView2.s0(qmk0Var);
            recyclerView2.m(qmk0Var);
            A(iIntValue);
        } else if (i2 != -1 && !z) {
            zas0Var.d(i2, true, true, false);
        }
        if (!z2 || (recyclerView = this.v) == null) {
            return;
        }
        recyclerView.o(this.M);
    }

    public final void u(lk50 lk50Var) {
        int iIntValue;
        dc3 dc3Var = this.u;
        if (lk50Var != null) {
            BracketItemView bracketItemView = (BracketItemView) dc3Var.d;
            BracketItemView bracketItemView2 = (BracketItemView) dc3Var.d;
            int page = bracketItemView.getPage();
            Iterator it = bracketItemView2.i1.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    iIntValue = -1;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                Iterable iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    pab pabVar = ((rt8) it2.next()).f31065a.c;
                    arrayList.add(pabVar != null ? pabVar.f26648a : null);
                }
                if (arrayList.contains(lk50Var)) {
                    iIntValue = ((Number) entry.getKey()).intValue();
                    break;
                }
            }
            if (iIntValue == -1) {
                return;
            }
            if (page != iIntValue) {
                bracketItemView2.l(iIntValue, false, true, false, false);
            } else {
                x(lk50Var, true);
            }
        }
        BracketItemView bracketItemView3 = (BracketItemView) dc3Var.d;
        bracketItemView3.m = lk50Var;
        bracketItemView3.i();
    }

    public final void w() {
        RecyclerView recyclerView;
        Integer numValueOf = Integer.valueOf(this.N);
        dc3 dc3Var = this.u;
        this.w.put(numValueOf, Integer.valueOf(((BracketItemView) dc3Var.d).getPage()));
        this.H = null;
        this.I = null;
        BracketItemView bracketItemView = (BracketItemView) dc3Var.d;
        bracketItemView.setDelegate(null);
        bracketItemView.a();
        this.P = null;
        bracketItemView.setAllHighlightedItemsDelegate(null);
        if (!this.A || (recyclerView = this.v) == null) {
            return;
        }
        recyclerView.u0(this.M);
    }

    public final void x(lk50 lk50Var, boolean z) {
        if (lk50Var != null) {
            RecyclerView recyclerView = this.v;
            int iComputeVerticalScrollOffset = recyclerView != null ? recyclerView.computeVerticalScrollOffset() : 0;
            Rect rectH = ((BracketItemView) this.u.d).h(lk50Var, null);
            androidx.recyclerview.widget.b layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
            LinearLayoutManagerWithAccurateOffset linearLayoutManagerWithAccurateOffset = layoutManager instanceof LinearLayoutManagerWithAccurateOffset ? (LinearLayoutManagerWithAccurateOffset) layoutManager : null;
            int iC1 = ((rectH != null ? rectH.top : 0) - (iComputeVerticalScrollOffset - (linearLayoutManagerWithAccurateOffset != null ? linearLayoutManagerWithAccurateOffset.C1(d()) : 0))) - this.J;
            if (iC1 == 0) {
                return;
            }
            if (!z) {
                if (recyclerView != null) {
                    recyclerView.scrollBy(0, iC1);
                }
            } else {
                if (recyclerView != null) {
                    recyclerView.A0(0, iC1, null, Integer.MIN_VALUE, false);
                }
                if (recyclerView != null) {
                    recyclerView.o(new aie0(this, lk50Var, (byte) 1));
                }
            }
        }
    }

    public final void y(int i, boolean z) {
        if (i != -1) {
            kie0 kie0Var = new kie0();
            int i2 = this.z ? i - 1 : i;
            kie0Var.f18333a = i2;
            if (i2 < 0) {
                i2 = 0;
            }
            kie0Var.f18333a = i2;
            LinearLayoutManager linearLayoutManager = this.E;
            int iC1 = linearLayoutManager != null ? linearLayoutManager.c1() : 0;
            int iG1 = linearLayoutManager != null ? linearLayoutManager.g1() : 0;
            View viewD = linearLayoutManager != null ? linearLayoutManager.D(i) : null;
            Rect rect = this.G;
            if (viewD != null && this.v != null) {
                RecyclerView.Y(rect, viewD);
            }
            boolean z2 = rect.top - this.F < 0;
            if (iC1 > i || i > iG1 || z2) {
                if (z) {
                    ((BracketItemView) this.u.d).addOnLayoutChangeListener(new djl(this, kie0Var, (byte) 5));
                } else if (linearLayoutManager != null) {
                    linearLayoutManager.H0(kie0Var.f18333a);
                }
            }
        }
    }

    public final void z(fsv fsvVar, fsv fsvVar2) {
        WeakReference weakReference = this.H;
        fsv fsvVar3 = weakReference != null ? (fsv) weakReference.get() : null;
        WeakReference weakReference2 = this.I;
        fsv fsvVar4 = weakReference2 != null ? (fsv) weakReference2.get() : null;
        if (fsvVar3 == null && fsvVar != null) {
            this.H = new WeakReference(fsvVar);
            if (fsvVar4 != null) {
                yge0 adapter = ((RecyclerView) fsvVar4.u.c).getAdapter();
                ybc ybcVar = adapter instanceof ybc ? (ybc) adapter : null;
                int i = 0;
                if (ybcVar != null) {
                    List<p6t0> list = (List) ybcVar.f;
                    if (list == null) {
                        i = -1;
                        break;
                    }
                    ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                    for (p6t0 p6t0Var : list) {
                        p6t0Var.getClass();
                        arrayList.add((ifo0) p6t0Var);
                    }
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                            break;
                        } else if (((ifo0) it.next()).b) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                fsvVar.t(i, d());
            }
        }
        if (fsvVar2 != null) {
            this.I = new WeakReference(fsvVar2);
        }
    }
}
