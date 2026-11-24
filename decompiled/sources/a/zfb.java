package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.xbet.client1.R;
import org.xplatform.statistic.stage.impl.champ_statistic_tour_net.presentation.view.bracket.BracketItemView;
import org.xplatform.statistic.stage.impl.champ_statistic_tour_net.presentation.view.bracket.BracketLineView;

/* JADX INFO: loaded from: classes6.dex */
public final class zfb extends yge0 {
    public final List d;
    public final HashMap e;
    public final Function2 f;
    public final Function1 g;
    public final Function2 h;
    public final d930 i;
    public final boolean j;
    public List k;
    public RecyclerView l;
    public lk50 m;
    public List n;
    public final LinkedHashMap o;
    public int p;

    public zfb(List list, HashMap map, Function2 function2, Function1 function1, Function2 function3, d930 d930Var, boolean z) {
        int i;
        list.getClass();
        map.getClass();
        d930Var.getClass();
        this.d = list;
        this.e = map;
        this.f = function2;
        this.g = function1;
        this.h = function3;
        this.i = d930Var;
        this.j = z;
        this.k = list;
        this.n = iun.f15405a;
        this.o = new LinkedHashMap();
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            j1m0 j1m0Var = (j1m0) next;
            i1m0 i1m0Var = j1m0Var instanceof i1m0 ? (i1m0) j1m0Var : null;
            int i4 = i1m0Var != null ? i1m0Var.f14006a.e : -1;
            if (i4 != -1) {
                i = i4;
                break;
            }
            i2 = i3;
        }
        this.p = i;
    }

    public final void A(lk50 lk50Var, List list) {
        Collection collectionQ0;
        list.getClass();
        RecyclerView recyclerView = this.l;
        if (recyclerView == null) {
            return;
        }
        kie0 kie0Var = new kie0();
        kie0Var.f18333a = -1;
        boolean z = false;
        if (lk50Var != null) {
            int i = 0;
            for (Object obj : this.d) {
                int i2 = i + 1;
                if (i < 0) {
                    q3d.p();
                    throw null;
                }
                j1m0 j1m0Var = (j1m0) obj;
                if (j1m0Var != null) {
                    if (j1m0Var instanceof i1m0) {
                        collectionQ0 = r3d.r(((i1m0) j1m0Var).f14006a.b.values());
                    } else if (j1m0Var instanceof g1m0) {
                        g1m0 g1m0Var = (g1m0) j1m0Var;
                        collectionQ0 = CollectionsKt.q0(r3d.r(g1m0Var.f10520a.b.values()), r3d.r(g1m0Var.b.b.values()));
                    } else if (j1m0Var instanceof h1m0) {
                        collectionQ0 = iun.f15405a;
                    }
                    if (collectionQ0 == null || !collectionQ0.isEmpty()) {
                        Iterator it = collectionQ0.iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.d((lk50) it.next(), lk50Var)) {
                                kie0Var.f18333a = i;
                                break;
                            }
                        }
                    }
                    i = i2;
                }
                t9f.b();
                return;
            }
        }
        androidx.recyclerview.widget.b layoutManager = recyclerView.getLayoutManager();
        layoutManager.getClass();
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        Iterator it2 = new IntRange(linearLayoutManager.f1(), linearLayoutManager.h1(), 1).iterator();
        while (((kkx) it2).c) {
            int iNextInt = ((bkx) it2).nextInt();
            RecyclerView recyclerView2 = this.l;
            if ((recyclerView2 != null ? recyclerView2.O(iNextInt) : null) instanceof vju0) {
                kie0Var.f18333a = iNextInt;
            }
        }
        androidx.recyclerview.widget.b layoutManager2 = recyclerView.getLayoutManager();
        layoutManager2.getClass();
        LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) layoutManager2;
        int i3 = kie0Var.f18333a;
        boolean z2 = linearLayoutManager2.f1() <= i3 && i3 <= linearLayoutManager2.h1();
        if (lk50Var != null && !Intrinsics.d(this.m, lk50Var) && !z2) {
            z = true;
        }
        this.m = lk50Var;
        this.n = list;
        Iterator it3 = new IntRange(linearLayoutManager2.f1(), linearLayoutManager2.h1(), 1).iterator();
        while (((kkx) it3).c) {
            z(((bkx) it3).nextInt(), lk50Var);
        }
        int i4 = kie0Var.f18333a;
        if (!z) {
            z(i4, lk50Var);
        } else {
            recyclerView.o(new yfb(this, i4, linearLayoutManager2, new kk0(this, kie0Var, lk50Var, (byte) 15)));
            linearLayoutManager2.H0(kie0Var.f18333a);
        }
    }

    @Override // a.yge0
    public final int d() {
        return this.d.size();
    }

    @Override // a.yge0
    public final int f(int i) {
        j1m0 j1m0Var = (j1m0) this.d.get(i);
        if (j1m0Var != null) {
            if (j1m0Var instanceof i1m0) {
                return 0;
            }
            if (j1m0Var instanceof g1m0) {
                return 1;
            }
            if (j1m0Var instanceof h1m0) {
                return 2;
            }
        }
        t9f.b();
        return 0;
    }

    @Override // a.yge0
    public final void m(RecyclerView recyclerView) {
        this.l = recyclerView;
    }

    @Override // a.yge0
    public final void n(xhe0 xhe0Var, int i) {
        boolean z = xhe0Var instanceof vju0;
        int i2 = -1;
        List list = this.d;
        if (z) {
            Object obj = list.get(i);
            obj.getClass();
            ((vju0) xhe0Var).t(((i1m0) obj).f14006a, tju0.f34068a, this.p);
            this.p = -1;
            return;
        }
        int i3 = 0;
        if (xhe0Var instanceof zbl) {
            Object obj2 = list.get(i);
            obj2.getClass();
            g1m0 g1m0Var = (g1m0) obj2;
            a1m0 a1m0Var = g1m0Var.b;
            a1m0 a1m0Var2 = g1m0Var.f10520a;
            zbl zblVar = (zbl) xhe0Var;
            vju0 vju0Var = zblVar.x;
            dc3 dc3Var = zblVar.u;
            dc3 dc3Var2 = (dc3) dc3Var.d;
            View view = (View) dc3Var2.e;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.getClass();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = zblVar.y * 2;
            view.setLayoutParams(marginLayoutParams);
            BracketItemView bracketItemView = (BracketItemView) ((dc3) dc3Var.e).d;
            BracketItemView bracketItemView2 = (BracketItemView) dc3Var2.d;
            BracketLineView bracketLineView = (BracketLineView) dc3Var.c;
            List list2 = a1m0Var2.f77a;
            List list3 = (List) a1m0Var2.b.get(list2.get(list2.size() - 1));
            lk50 lk50Var = list3 != null ? (lk50) CollectionsKt.firstOrNull(list3) : null;
            List list4 = a1m0Var.f77a;
            List list5 = (List) a1m0Var.b.get(list4.get(list4.size() - 2));
            lk50 lk50Var2 = list5 != null ? (lk50) CollectionsKt.firstOrNull(list5) : null;
            vju0 vju0Var2 = zblVar.w;
            vju0Var2.P = new ybl(zblVar, bracketItemView2, view, bracketLineView, lk50Var, lk50Var2, (byte) 0);
            vju0Var.P = new ybl(zblVar, bracketItemView, view, bracketLineView, lk50Var, lk50Var2, (byte) 1);
            vju0Var2.t(a1m0Var2, new sju0(true), -1);
            vju0Var.t(a1m0Var, new sju0(false), -1);
            return;
        }
        if (xhe0Var instanceof fsv) {
            Object obj3 = this.k.get(i);
            obj3.getClass();
            ArrayList arrayList = ((h1m0) obj3).f12291a;
            fsv fsvVar = (fsv) xhe0Var;
            ybc ybcVar = new ybc(new z08((Object) fsvVar, i, (byte) 6));
            RecyclerView recyclerView = (RecyclerView) fsvVar.u.c;
            recyclerView.setAdapter(ybcVar);
            qmk0 qmk0Var = fsvVar.x;
            recyclerView.s0(qmk0Var);
            recyclerView.m(qmk0Var);
            ybcVar.f = arrayList;
            ybcVar.g();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((ifo0) it.next()).b) {
                    i2 = i3;
                    break;
                }
                i3++;
            }
            androidx.recyclerview.widget.b layoutManager = recyclerView.getLayoutManager();
            layoutManager.getClass();
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int iC1 = linearLayoutManager.c1();
            int iG1 = linearLayoutManager.g1();
            if (i2 < iC1 || i2 > iG1) {
                linearLayoutManager.H0(i2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [a.xfb] */
    @Override // a.yge0
    public final xhe0 p(ViewGroup viewGroup, int i) {
        boolean z;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        Function1 function1 = this.g;
        Function2 function2 = this.f;
        Function2 function3 = this.h;
        final byte b = 1;
        final byte b2 = 0;
        if (i == 0) {
            dc3 dc3VarA = dc3.a(layoutInflaterFrom.inflate(R.layout.item_pager, viewGroup, false));
            RecyclerView recyclerView = this.l;
            List list = this.d;
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((j1m0) it.next()) instanceof h1m0) {
                        z = true;
                    }
                }
                z = false;
            } else {
                z = false;
            }
            return new vju0(dc3VarA, recyclerView, this.e, this.o, function2, function1, z, true, function3, new Function0(this) { // from class: a.xfb
                public final /* synthetic */ zfb b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    byte b3 = b2;
                    zfb zfbVar = this.b;
                    switch (b3) {
                        case 0:
                            break;
                    }
                    return zfbVar.n;
                }
            }, this.j);
        }
        if (i != 1) {
            if (i != 2) {
                e9d0.d(i, "Unknown viewType ");
                return null;
            }
            View viewInflate = layoutInflaterFrom.inflate(R.layout.vh_header_chips, viewGroup, false);
            if (viewInflate != null) {
                RecyclerView recyclerView2 = (RecyclerView) viewInflate;
                return new fsv(new nq8(recyclerView2, recyclerView2, (byte) 15), function3, this.l, this.i);
            }
            hny.u("rootView");
            return null;
        }
        View viewInflate2 = layoutInflaterFrom.inflate(R.layout.vh_item_two_pager, viewGroup, false);
        int i2 = R.id.lineView;
        BracketLineView bracketLineView = (BracketLineView) yum0.f(viewInflate2, R.id.lineView);
        if (bracketLineView != null) {
            i2 = R.id.lower;
            View viewF = yum0.f(viewInflate2, R.id.lower);
            if (viewF != null) {
                dc3 dc3VarA2 = dc3.a(viewF);
                i2 = R.id.upper;
                View viewF2 = yum0.f(viewInflate2, R.id.upper);
                if (viewF2 != null) {
                    return new zbl(new dc3((FrameLayout) viewInflate2, bracketLineView, dc3VarA2, dc3.a(viewF2), (byte) 14), this.l, this.e, function2, function1, function3, new Function0(this) { // from class: a.xfb
                        public final /* synthetic */ zfb b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b3 = b;
                            zfb zfbVar = this.b;
                            switch (b3) {
                                case 0:
                                    break;
                            }
                            return zfbVar.n;
                        }
                    }, this.j);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i2)));
        return null;
    }

    @Override // a.yge0
    public final void q(RecyclerView recyclerView) {
        this.l = null;
    }

    @Override // a.yge0
    public final void u(xhe0 xhe0Var) {
        xhe0Var.getClass();
        if (xhe0Var instanceof vju0) {
            ((vju0) xhe0Var).w();
        } else if (xhe0Var instanceof zbl) {
            zbl zblVar = (zbl) xhe0Var;
            zblVar.w.w();
            zblVar.x.w();
        }
    }

    public final void z(int i, lk50 lk50Var) {
        RecyclerView recyclerView = this.l;
        xhe0 xhe0VarO = recyclerView != null ? recyclerView.O(i) : null;
        if (xhe0VarO == null) {
            return;
        }
        if (xhe0VarO instanceof vju0) {
            ((vju0) xhe0VarO).u(lk50Var);
        } else if (xhe0VarO instanceof zbl) {
            zbl zblVar = (zbl) xhe0VarO;
            zblVar.w.u(lk50Var);
            zblVar.x.u(lk50Var);
        }
    }
}
