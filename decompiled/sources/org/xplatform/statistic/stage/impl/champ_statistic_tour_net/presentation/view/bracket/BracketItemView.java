package org.xplatform.statistic.stage.impl.champ_statistic_tour_net.presentation.view.bracket;

import a.a1m0;
import a.bkx;
import a.gs8;
import a.gt8;
import a.hny;
import a.hs8;
import a.hun;
import a.hxm0;
import a.is8;
import a.it8;
import a.itt0;
import a.iun;
import a.js8;
import a.kkx;
import a.ks8;
import a.l1e0;
import a.lk50;
import a.ls8;
import a.ms8;
import a.nr8;
import a.ns8;
import a.or8;
import a.os8;
import a.p7x;
import a.pab;
import a.q3d;
import a.r3d;
import a.rt8;
import a.rw2;
import a.si30;
import a.sj3;
import a.sju0;
import a.ss8;
import a.t9f;
import a.tju0;
import a.tt8;
import a.uju0;
import a.vju0;
import a.xbl;
import a.ybl;
import a.zas0;
import a.zbl;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.xbet.client1.R;
import org.xplatform.uikit.components.header.Header;

/* JADX INFO: loaded from: classes6.dex */
public final class BracketItemView extends FrameLayout implements gt8 {
    public static final /* synthetic */ int n1 = 0;
    public List A;
    public final int B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final it8 f47071a;
    public final int[] b;
    public final boolean c;
    public final int d;
    public final int e;
    public final gs8 f;
    public final int f1;
    public final int g;
    public final int g1;
    public final int h;
    public final int h1;
    public final int i;
    public final TreeMap i1;
    public final Rect j;
    public uju0 j1;
    public final Rect k;
    public Rect k1;
    public rt8 l;
    public boolean l1;
    public lk50 m;
    public boolean m1;
    public final iun n;
    public boolean o;
    public hs8 p;
    public boolean q;
    public Function0 r;
    public ks8 s;
    public List t;
    public int u;
    public int v;
    public int w;
    public float x;
    public float y;
    public int z;

    /* JADX WARN: Illegal instructions before constructor call */
    public BracketItemView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        it8 it8Var = new it8(context, null, 0);
        it8Var.setFocusable(true);
        it8Var.setDescendantFocusability(262144);
        it8Var.setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(it8Var.getContext());
        it8Var.h = (int) (400.0f * it8Var.getContext().getResources().getDisplayMetrics().density);
        it8Var.i = viewConfiguration.getScaledMaximumFlingVelocity();
        it8Var.j = viewConfiguration.getScaledPagingTouchSlop();
        this.f47071a = it8Var;
        this.b = new int[2];
        boolean z = context.getResources().getBoolean(R.bool.isTablet);
        this.c = z;
        int i2 = context.getResources().getDisplayMetrics().widthPixels;
        this.d = i2;
        this.e = context.getResources().getDisplayMetrics().heightPixels;
        this.f = new gs8(this);
        this.g = context.getResources().getDimensionPixelSize(R.dimen.space_8);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.space_24);
        ms8 ms8Var = new ms8(0.032f, 0.016f);
        this.i = getResources().getDimensionPixelSize(R.dimen.size_64);
        this.j = new Rect(o(ms8Var, i2, z), context.getResources().getDimensionPixelSize(R.dimen.space_16), context.getResources().getDimensionPixelSize(R.dimen.space_12), context.getResources().getDimensionPixelSize(R.dimen.space_24));
        this.k = new Rect();
        iun iunVar = iun.f15405a;
        this.n = iunVar;
        this.o = true;
        ks8 ks8Var = new ks8();
        this.s = ks8Var;
        this.t = iunVar;
        this.A = iunVar;
        this.B = o(ks8Var.f18801a, i2, z);
        this.f1 = sj3.X(92);
        this.g1 = o(this.s.c, i2, z);
        this.h1 = o(this.s.d, i2, z);
        this.i1 = new TreeMap();
        this.j1 = tju0.f34068a;
        it8Var.setScrollDelegate(this);
        addView(it8Var, new FrameLayout.LayoutParams(-1, -1));
    }

    public static final rt8 e(BracketItemView bracketItemView, List list) {
        Object obj;
        int iCenterY = bracketItemView.k.centerY();
        Iterator it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int iAbs = Math.abs(iCenterY - ((rt8) next).f.centerY());
                do {
                    Object next2 = it.next();
                    int iAbs2 = Math.abs(iCenterY - ((rt8) next2).f.centerY());
                    if (iAbs > iAbs2) {
                        next = next2;
                        iAbs = iAbs2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (rt8) obj;
    }

    private final rt8 getScrollingAnchorNode() {
        boolean zF = f();
        TreeMap treeMap = this.i1;
        if (zF) {
            List list = (List) treeMap.get(Integer.valueOf(getPage()));
            if (list != null) {
                return (rt8) CollectionsKt.firstOrNull(list);
            }
            return null;
        }
        if (getPage() < treeMap.size() - 1) {
            List list2 = (List) treeMap.get(Integer.valueOf(getPage() + 1));
            if (list2 == null) {
                list2 = iun.f15405a;
            }
            return e(this, list2);
        }
        List list3 = (List) treeMap.get(Integer.valueOf(getPage()));
        if (list3 == null) {
            list3 = iun.f15405a;
        }
        return e(this, list3);
    }

    public static int o(os8 os8Var, int i, boolean z) {
        float f;
        if (os8Var instanceof ns8) {
            f = ((ns8) os8Var).f24040a;
        } else {
            if (!(os8Var instanceof ms8)) {
                t9f.b();
                return 0;
            }
            ms8 ms8Var = (ms8) os8Var;
            f = (z ? ms8Var.b : ms8Var.f22306a) * i;
        }
        return (int) f;
    }

    private final void setColumnConfigurations(List<is8> list) {
        this.t = list;
        this.A = iun.f15405a;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.t.iterator();
        while (it.hasNext()) {
            arrayList.add(new js8(o(((is8) it.next()).b, this.d, this.c)));
        }
        this.A = arrayList;
        rt8 rt8Var = this.l;
        if (rt8Var != null) {
            m(rt8Var.f31065a, 0);
        }
    }

    public final void a() {
        TreeMap treeMap = this.i1;
        Iterator it = treeMap.entrySet().iterator();
        while (it.hasNext()) {
            for (rt8 rt8Var : (List) ((Map.Entry) it.next()).getValue()) {
                ss8 ss8Var = rt8Var.f31065a;
                if (rt8Var.a() && this.p != null) {
                    or8 or8Var = rt8Var.h;
                    if (or8Var != null) {
                        or8Var.getChildAt(0);
                    }
                    ss8Var.getClass();
                }
                if (rt8Var.a()) {
                    or8 or8Var2 = rt8Var.h;
                    if (or8Var2 != null) {
                        hxm0.v(or8Var2);
                    }
                    or8 or8Var3 = rt8Var.h;
                    if (or8Var3 != null) {
                        or8Var3.removeAllViewsInLayout();
                    }
                    rt8Var.h = null;
                }
            }
        }
        treeMap.clear();
        this.n.getClass();
        hun.f13690a.getClass();
    }

    public final void b(int i, int i2, boolean z, boolean z2) {
        hs8 hs8Var;
        ybl yblVar;
        k(i, this.s.b == ls8.b ? 0 : i2, z, z2);
        boolean z3 = i < 0;
        if (this.o && (hs8Var = this.p) != null && (yblVar = ((vju0) ((zas0) hs8Var).b).P) != null) {
            switch (yblVar.f42346a) {
                case 0:
                    zbl zblVar = yblVar.b;
                    BracketItemView bracketItemView = yblVar.c;
                    zblVar.u(this, bracketItemView, yblVar.d, z3);
                    BracketLineView bracketLineView = yblVar.e;
                    lk50 lk50Var = yblVar.f;
                    lk50 lk50Var2 = yblVar.g;
                    if (bracketLineView.isLaidOut() && !bracketLineView.isLayoutRequested()) {
                        zblVar.t(bracketLineView, this, bracketItemView, lk50Var, lk50Var2);
                    } else {
                        bracketLineView.addOnLayoutChangeListener(new xbl(zblVar, bracketLineView, this, bracketItemView, lk50Var, lk50Var2, (byte) 0));
                    }
                    break;
                default:
                    zbl zblVar2 = yblVar.b;
                    BracketItemView bracketItemView2 = yblVar.c;
                    zblVar2.u(this, bracketItemView2, yblVar.d, z3);
                    BracketLineView bracketLineView2 = yblVar.e;
                    lk50 lk50Var3 = yblVar.f;
                    lk50 lk50Var4 = yblVar.g;
                    if (bracketLineView2.isLaidOut() && !bracketLineView2.isLayoutRequested()) {
                        zblVar2.t(bracketLineView2, bracketItemView2, this, lk50Var3, lk50Var4);
                    } else {
                        bracketLineView2.addOnLayoutChangeListener(new xbl(zblVar2, bracketLineView2, bracketItemView2, this, lk50Var3, lk50Var4, (byte) 1));
                    }
                    break;
            }
        }
        this.n.getClass();
        hun.f13690a.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:51:0x0104  */
    /* JADX WARN: Code duplicated, block: B:52:0x0119  */
    /* JADX WARN: Code duplicated, block: B:68:0x0159 A[SYNTHETIC] */
    public final void c() {
        rt8 rt8Var;
        ArrayList arrayList;
        int i;
        Iterator it;
        int i2;
        Iterator it2;
        Iterator it3;
        int i3;
        int iCenterY;
        tt8 tt8Var;
        tt8 tt8Var2;
        Object next;
        int i4;
        rt8 rt8Var2;
        double d;
        ArrayList arrayList2 = new ArrayList();
        Iterator it4 = this.i1.entrySet().iterator();
        while (it4.hasNext()) {
            Iterator it5 = CollectionsKt.K((List) ((Map.Entry) it4.next()).getValue(), 2).iterator();
            while (it5.hasNext()) {
                int i5 = 0;
                for (Object obj : (List) it5.next()) {
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        q3d.p();
                        throw null;
                    }
                    rt8 rt8Var3 = (rt8) obj;
                    ArrayList arrayList3 = rt8Var3.b;
                    rt8 rt8Var4 = (rt8) CollectionsKt.firstOrNull(arrayList3);
                    if (rt8Var4 == null || (rt8Var = (rt8) CollectionsKt.f0(arrayList3)) == null || rt8Var3.f31065a.c == null || ((rt8Var4.f31065a.c == null && rt8Var.f31065a.c == null) || !(rt8Var3.a() || (rt8Var4.a() && rt8Var.a())))) {
                        it2 = it4;
                        it3 = it5;
                    } else {
                        boolean zA = rt8Var4.a();
                        int i7 = this.g1;
                        int i8 = this.h1;
                        if (!zA && !rt8Var.a()) {
                            uju0 uju0Var = this.j1;
                            uju0Var.getClass();
                            if (!(uju0Var instanceof sju0)) {
                                Rect rect = rt8Var3.f;
                                int i9 = rect.left;
                                int iCenterY2 = rect.centerY();
                                Rect rect2 = rt8Var3.f;
                                arrayList2.add(new tt8(i9, iCenterY2, (rect2.left - i8) - i7, rect2.centerY()));
                            } else if (arrayList3.size() == 1) {
                                Rect rect3 = rt8Var4.f;
                                int i10 = rect3.right;
                                int iCenterY3 = rect3.centerY();
                                Rect rect4 = rt8Var3.f;
                                arrayList2.add(new tt8(i10, iCenterY3, rect4.left, rect4.centerY()));
                            } else {
                                arrayList = new ArrayList();
                                i = rt8Var4.f.right + i7;
                                it = arrayList3.iterator();
                                i2 = 0;
                                while (it.hasNext()) {
                                    next = it.next();
                                    i4 = i2 + 1;
                                    if (i2 >= 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    rt8Var2 = (rt8) next;
                                    if (i2 == 0) {
                                        d = (((double) rt8Var2.e) / 2.0d) + ((double) rt8Var2.f.top);
                                    } else {
                                        float f = rt8Var2.e;
                                        Rect rect5 = rt8Var2.f;
                                        float f2 = rect5.top;
                                        d = (((double) ((rect5.bottom - f) - f2)) / 2.0d) + ((double) (f + f2));
                                    }
                                    int iF = (int) p7x.F((float) d, rt8Var3.f.exactCenterY(), rt8Var2.c);
                                    i = i;
                                    arrayList.add(new tt8(rt8Var2.f.right, iF, i, iF));
                                    it4 = it4;
                                    i2 = i4;
                                    it = it;
                                    it5 = it5;
                                }
                                it2 = it4;
                                it3 = it5;
                                Rect rect6 = rt8Var3.f;
                                int i11 = rect6.left;
                                int iCenterY4 = rect6.centerY();
                                Rect rect7 = rt8Var3.f;
                                i3 = rect7.left - i8;
                                iCenterY = rect7.centerY();
                                tt8 tt8Var3 = new tt8(i11, iCenterY4, i3, iCenterY);
                                tt8Var = (tt8) CollectionsKt.firstOrNull(arrayList);
                                tt8Var2 = (tt8) CollectionsKt.f0(arrayList);
                                if (tt8Var != null) {
                                    arrayList2.add(new tt8(tt8Var.c, tt8Var.d, i3, iCenterY));
                                    arrayList2.add(new tt8(tt8Var2.c, tt8Var2.d, i3, iCenterY));
                                }
                                arrayList2.add(tt8Var3);
                                arrayList2.addAll(arrayList);
                            }
                            it2 = it4;
                            it3 = it5;
                        } else if (arrayList3.size() == 1) {
                            Rect rect8 = rt8Var4.f;
                            int i12 = rect8.right;
                            int iCenterY5 = rect8.centerY();
                            Rect rect9 = rt8Var3.f;
                            arrayList2.add(new tt8(i12, iCenterY5, rect9.left, rect9.centerY()));
                            it2 = it4;
                            it3 = it5;
                        } else {
                            arrayList = new ArrayList();
                            i = rt8Var4.f.right + i7;
                            it = arrayList3.iterator();
                            i2 = 0;
                            while (it.hasNext()) {
                                next = it.next();
                                i4 = i2 + 1;
                                if (i2 >= 0) {
                                    q3d.p();
                                    throw null;
                                }
                                rt8Var2 = (rt8) next;
                                if (i2 == 0) {
                                    d = (((double) rt8Var2.e) / 2.0d) + ((double) rt8Var2.f.top);
                                } else {
                                    float f3 = rt8Var2.e;
                                    Rect rect10 = rt8Var2.f;
                                    float f4 = rect10.top;
                                    d = (((double) ((rect10.bottom - f3) - f4)) / 2.0d) + ((double) (f3 + f4));
                                }
                                int iF2 = (int) p7x.F((float) d, rt8Var3.f.exactCenterY(), rt8Var2.c);
                                i = i;
                                arrayList.add(new tt8(rt8Var2.f.right, iF2, i, iF2));
                                it4 = it4;
                                i2 = i4;
                                it = it;
                                it5 = it5;
                            }
                            it2 = it4;
                            it3 = it5;
                            Rect rect11 = rt8Var3.f;
                            int i13 = rect11.left;
                            int iCenterY6 = rect11.centerY();
                            Rect rect12 = rt8Var3.f;
                            i3 = rect12.left - i8;
                            iCenterY = rect12.centerY();
                            tt8 tt8Var4 = new tt8(i13, iCenterY6, i3, iCenterY);
                            tt8Var = (tt8) CollectionsKt.firstOrNull(arrayList);
                            tt8Var2 = (tt8) CollectionsKt.f0(arrayList);
                            if (tt8Var != null && tt8Var2 != null) {
                                arrayList2.add(new tt8(tt8Var.c, tt8Var.d, i3, iCenterY));
                                arrayList2.add(new tt8(tt8Var2.c, tt8Var2.d, i3, iCenterY));
                            }
                            arrayList2.add(tt8Var4);
                            arrayList2.addAll(arrayList);
                        }
                    }
                    i5 = i6;
                    it4 = it2;
                    it5 = it3;
                }
            }
        }
        this.f47071a.setLines(arrayList2);
    }

    public final List d(a1m0 a1m0Var, int i, int i2) {
        int i3;
        int i4;
        Map map = a1m0Var.c;
        if (i < 0) {
            return iun.f15405a;
        }
        List list = a1m0Var.f77a;
        List list2 = (List) map.get(CollectionsKt.W(i + 1, list));
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        List list3 = (List) map.get(list.get(i));
        if (list3 == null) {
            list3 = iun.f15405a;
        }
        if (list2.size() == list3.size()) {
            i3 = i2;
            i4 = i3;
        } else {
            i3 = i2 * 2;
            i4 = i3 + 1;
        }
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        for (Object obj : list3) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                q3d.p();
                throw null;
            }
            pab pabVar = (pab) obj;
            if (i3 <= i5 && i5 <= i4) {
                arrayList.add(new ss8(d(a1m0Var, i - 1, i5), this.f.a(pabVar.f26648a, pabVar.d), pabVar, (String) list.get(i), null));
            }
            i5 = i6;
        }
        return arrayList;
    }

    public final boolean f() {
        rt8 rt8Var;
        Rect rect;
        rt8 rt8Var2;
        Rect rect2;
        Integer numValueOf = Integer.valueOf(getPage());
        TreeMap treeMap = this.i1;
        List list = (List) treeMap.get(numValueOf);
        int i = (list == null || (rt8Var2 = (rt8) CollectionsKt.firstOrNull(list)) == null || (rect2 = rt8Var2.f) == null) ? 0 : rect2.top;
        List list2 = (List) treeMap.get(Integer.valueOf(getPage() + 1));
        int i2 = (list2 == null || (rt8Var = (rt8) CollectionsKt.firstOrNull(list2)) == null || (rect = rt8Var.f) == null) ? 0 : rect.top;
        if (i > i2) {
            i = i2;
        }
        return i >= this.k.top;
    }

    public final int g(int i) {
        this.s.getClass();
        js8 js8Var = (js8) CollectionsKt.W(i, this.A);
        int i2 = js8Var != null ? js8Var.f17038a : 0;
        Iterator it = l1e0.o(0, i).iterator();
        while (((kkx) it).c) {
            is8 is8Var = (is8) CollectionsKt.W(((bkx) it).nextInt() + 1, this.t);
            i2 += is8Var != null ? is8Var.f15291a : false ? this.d : this.v;
        }
        return -i2;
    }

    public final Function0<List<lk50>> getAllHighlightedItemsDelegate() {
        return this.r;
    }

    public final ks8 getConfig() {
        return this.s;
    }

    public final hs8 getDelegate() {
        return this.p;
    }

    public final float getFractionalPage() {
        Object next;
        int iIntValue;
        if (this.v == 0) {
            return 0.0f;
        }
        Iterator it = new IntRange(0, this.i1.size(), 1).iterator();
        do {
            if (!((kkx) it).c) {
                next = null;
                break;
            }
            next = ((bkx) it).next();
        } while (g(((Number) next).intValue()) >= this.x);
        Integer num = (Integer) next;
        if (num == null || (iIntValue = num.intValue() - 1) < 0) {
            return 0.0f;
        }
        int iG = g(iIntValue);
        return ((this.x - iG) / (g(num.intValue()) - iG)) + iIntValue;
    }

    public final int getPage() {
        return (int) getFractionalPage();
    }

    public final int getPagesCount() {
        return this.i1.size();
    }

    public final boolean getSingleNetOptimizationEnabled() {
        return this.q;
    }

    public final Rect h(lk50 lk50Var, BracketLineView bracketLineView) {
        lk50Var.getClass();
        Iterator it = this.i1.entrySet().iterator();
        while (it.hasNext()) {
            for (rt8 rt8Var : (List) ((Map.Entry) it.next()).getValue()) {
                pab pabVar = rt8Var.f31065a.c;
                if (Intrinsics.d(pabVar != null ? pabVar.f26648a : null, lk50Var)) {
                    if (bracketLineView == null) {
                        return rt8Var.f;
                    }
                    Rect rect = new Rect();
                    bracketLineView.getGlobalVisibleRect(rect);
                    it8 it8Var = this.f47071a;
                    int[] iArr = this.b;
                    it8Var.getLocationOnScreen(iArr);
                    int i = iArr[1];
                    Rect rect2 = rt8Var.f;
                    int i2 = rect2.left;
                    int i3 = (i - rect.top) + rect2.top;
                    int i4 = this.B + i2;
                    int i5 = rt8Var.f31065a.b;
                    if (i5 == 0) {
                        i5 = this.f1;
                    }
                    return new Rect(i2, i3, i4, i5 + i3);
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void i() {
        Iterable iterable;
        int i;
        Iterator it = this.i1.entrySet().iterator();
        while (it.hasNext()) {
            Iterator it2 = CollectionsKt.K((List) ((Map.Entry) it.next()).getValue(), 2).iterator();
            while (it2.hasNext()) {
                int i2 = 0;
                for (Object obj : (List) it2.next()) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        q3d.p();
                        throw null;
                    }
                    rt8 rt8Var = (rt8) obj;
                    ss8 ss8Var = rt8Var.f31065a;
                    boolean z = this.q;
                    Rect rect = rt8Var.f;
                    Rect rect2 = this.k;
                    if (z ? Rect.intersects(rect, rect2) : rect.left < rect2.right && rect2.left < rect.right) {
                        hs8 hs8Var = this.p;
                        if (hs8Var == null) {
                            it = it;
                            it2 = it2;
                        } else {
                            boolean zA = rt8Var.a();
                            ss8 ss8Var2 = rt8Var.f31065a;
                            if (zA) {
                                it = it;
                                it2 = it2;
                            } else {
                                Context context = getContext();
                                context.getClass();
                                zas0 zas0Var = (zas0) hs8Var;
                                View viewF = zas0Var.f(this, ss8Var2);
                                ss8 ss8Var3 = ss8Var2.e;
                                int i4 = ss8Var2.b;
                                or8 or8Var = new or8(context, viewF, i2 == 0 ? nr8.f23988a : nr8.b);
                                View contentView = or8Var.getContentView();
                                int i5 = this.f1;
                                int i6 = i4 != 0 ? i4 : i5;
                                int i7 = this.B;
                                or8Var.addView(contentView, i7, i6);
                                if (ss8Var3 != null) {
                                    String str = ss8Var3.d;
                                    str.getClass();
                                    View viewInflate = LayoutInflater.from(((LinearLayout) ((vju0) zas0Var.b).u.b).getContext()).inflate(R.layout.title_item, (ViewGroup) this, false);
                                    if (viewInflate == null) {
                                        hny.u("rootView");
                                        return;
                                    }
                                    ((Header) viewInflate).setTitle(str);
                                    viewInflate.measure(0, 0);
                                    ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i7, viewInflate.getMeasuredHeight());
                                    marginLayoutParams.topMargin = i4 != 0 ? i4 : i5;
                                    View viewF2 = zas0Var.f(this, ss8Var3);
                                    ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(i7, ss8Var3.b);
                                    marginLayoutParams2.topMargin = marginLayoutParams.height + marginLayoutParams.topMargin;
                                    or8Var.addView(viewInflate, marginLayoutParams);
                                    or8Var.addView(viewF2, marginLayoutParams2);
                                    i = marginLayoutParams2.height + marginLayoutParams2.topMargin;
                                } else {
                                    i = 0;
                                }
                                if (i4 == 0) {
                                    i4 = i5;
                                }
                                this.f47071a.addView(or8Var, i7, i4 + i);
                                rt8Var.h = or8Var;
                            }
                            Function0 function0 = this.r;
                            if (function0 == null || (iterable = (List) function0.invoke()) == null) {
                                iterable = iun.f15405a;
                            }
                            pab pabVar = ss8Var2.c;
                            boolean zL = CollectionsKt.L(iterable, pabVar != null ? pabVar.f26648a : null);
                            or8 or8Var2 = rt8Var.h;
                            if (or8Var2 != null) {
                                or8Var2.setShowBorder(ss8Var2.c != null && zL);
                            }
                            or8 or8Var3 = rt8Var.h;
                            if (or8Var3 != null) {
                                or8Var3.setTweeningPercent(rt8Var.c);
                            }
                            or8 or8Var4 = rt8Var.h;
                            if (or8Var4 != null) {
                                or8Var4.setCollapsingY(rt8Var.e);
                            }
                            or8 or8Var5 = rt8Var.h;
                            if (or8Var5 != null) {
                                or8Var5.setFrame(rt8Var.f);
                            }
                            or8 or8Var6 = rt8Var.h;
                            if (or8Var6 != null) {
                                Rect rect3 = rt8Var.f;
                                ViewGroup.LayoutParams layoutParams = or8Var6.getLayoutParams();
                                layoutParams.getClass();
                                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams;
                                marginLayoutParams3.setMarginStart(rect3.left);
                                marginLayoutParams3.topMargin = rect3.top;
                                or8Var6.setLayoutParams(marginLayoutParams3);
                            }
                        }
                        if (rt8Var.h != null && this.p != null) {
                            Rect rect4 = rt8Var.f;
                            ss8Var.getClass();
                            rect4.getClass();
                        }
                    } else {
                        it = it;
                        it2 = it2;
                        if (rt8Var.a() && this.p != null) {
                            or8 or8Var7 = rt8Var.h;
                            if (or8Var7 != null) {
                                or8Var7.getChildAt(0);
                            }
                            ss8Var.getClass();
                        }
                        if (rt8Var.a()) {
                            or8 or8Var8 = rt8Var.h;
                            if (or8Var8 != null) {
                                hxm0.v(or8Var8);
                            }
                            or8 or8Var9 = rt8Var.h;
                            if (or8Var9 != null) {
                                or8Var9.removeAllViewsInLayout();
                            }
                            rt8Var.h = null;
                        }
                    }
                    i2 = i3;
                    it = it;
                    it2 = it2;
                }
            }
        }
    }

    public final void j(List list) {
        int i = this.j.top;
        for (List list2 : CollectionsKt.K(list, 2)) {
            int i2 = 0;
            for (Object obj : list2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    q3d.p();
                    throw null;
                }
                rt8 rt8Var = (rt8) obj;
                if (i2 > 0) {
                    i += this.g;
                }
                Rect rect = rt8Var.f;
                ss8 ss8Var = rt8Var.f31065a;
                int i4 = ss8Var.b;
                int i5 = this.f1;
                if (i4 == 0) {
                    i4 = i5;
                }
                rect.set(rect.left, i, rect.right, i4 + i);
                int i6 = ss8Var.b;
                if (i6 != 0) {
                    i5 = i6;
                }
                i += i5;
                i2 = i3;
            }
            if (!list2.isEmpty()) {
                i += this.h;
            }
        }
    }

    public final void k(int i, int i2, boolean z, boolean z2) {
        rt8 rt8Var;
        Rect rect;
        rt8 rt8Var2;
        Rect rect2;
        rt8 rt8Var3;
        rt8 rt8Var4;
        Rect rect3;
        rt8 rt8Var5;
        Rect rect4;
        boolean z3;
        boolean z4;
        Iterator it;
        Iterator it2;
        int iHeight;
        Rect rect5;
        ss8 ss8Var;
        rt8 rt8Var6;
        ss8 ss8Var2;
        ss8 ss8Var3;
        float fMax;
        rt8 rt8Var7;
        float f;
        float f2 = this.x;
        float f3 = i + f2;
        this.x = f3;
        boolean z5 = false;
        this.x = Math.min(0.0f, Math.max(f3, -this.z));
        float f4 = this.y + i2;
        this.y = f4;
        this.y = Math.min(0.0f, f4);
        int i3 = (int) (this.x - f2);
        boolean zF = f();
        Integer numValueOf = Integer.valueOf(getPage());
        TreeMap treeMap = this.i1;
        List list = (List) treeMap.get(numValueOf);
        rt8 rt8Var8 = list != null ? (rt8) CollectionsKt.firstOrNull(list) : null;
        rt8 scrollingAnchorNode = getScrollingAnchorNode();
        if (rt8Var8 == null || scrollingAnchorNode == null) {
            c();
            return;
        }
        Rect rect6 = new Rect(scrollingAnchorNode.f);
        if (this.l1 && this.k1 == null && this.q) {
            this.k1 = rect6;
        }
        Rect rect7 = new Rect(rt8Var8.f);
        rect7.offset(i3, 0);
        int i4 = rect7.right;
        int i5 = this.g1;
        int i6 = this.h1;
        this.s.getClass();
        int iMax = i4 - Math.max((((i4 + i5) + i6) + 16) - this.d, rect7.left);
        Iterator it3 = treeMap.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            List list2 = (List) entry.getValue();
            if (iIntValue >= getPage()) {
                if (iIntValue != getPage() || iIntValue >= treeMap.size() - 1) {
                    z3 = zF;
                    Iterator it4 = CollectionsKt.K(list2, 2).iterator();
                    int i7 = 0;
                    while (it4.hasNext()) {
                        List list3 = (List) it4.next();
                        int i8 = 0;
                        for (Object obj : list3) {
                            int i9 = i8 + 1;
                            if (i8 < 0) {
                                q3d.p();
                                throw null;
                            }
                            Iterator it5 = it4;
                            rt8 rt8Var9 = (rt8) obj;
                            int i10 = i7;
                            rt8 rt8Var10 = (rt8) CollectionsKt.firstOrNull(rt8Var9.b);
                            rt8 rt8Var11 = (rt8) CollectionsKt.f0(rt8Var9.b);
                            if (rt8Var10 == null || rt8Var11 == null) {
                                it2 = it3;
                                iHeight = i8 > 0 ? i10 + this.g : i10;
                            } else {
                                int i11 = rt8Var10.f.top;
                                it2 = it3;
                                iHeight = (int) (((((double) (rt8Var11.f.bottom - i11)) / 2.0d) + ((double) i11)) - ((double) (rt8Var9.f.height() / 2)));
                            }
                            Rect rect8 = rt8Var9.f;
                            rect8.offset(0, iHeight - rect8.top);
                            rt8Var9.c = 0.0f;
                            rt8Var9.e = i8 == 0 ? rt8Var9.f.height() : 0.0f;
                            int i12 = rt8Var9.f31065a.b;
                            if (i12 == 0) {
                                i12 = this.f1;
                            }
                            i7 = iHeight + i12;
                            i8 = i9;
                            it4 = it5;
                            it3 = it2;
                        }
                        Iterator it6 = it4;
                        int i13 = i7;
                        Iterator it7 = it3;
                        i7 = !list3.isEmpty() ? i13 + this.h : i13;
                        it4 = it6;
                        it3 = it7;
                    }
                } else {
                    if (iMax == 0) {
                        fMax = 1.0f;
                    } else {
                        int i14 = (!this.q || (getPage() != this.w)) ? 1 : 2;
                        int i15 = this.B + i5 + i6;
                        this.s.getClass();
                        int i16 = i15 + 16;
                        fMax = Math.max(0.0f, ((-this.x) - (getPage() * i16)) / (i16 * i14));
                    }
                    List list4 = (List) treeMap.get(Integer.valueOf(iIntValue + 1));
                    if (list4 == null) {
                        list4 = iun.f15405a;
                    }
                    j(list4);
                    j(list2);
                    Iterator it8 = CollectionsKt.Q0(list2, 2, 2).iterator();
                    while (it8.hasNext()) {
                        List list5 = (List) it8.next();
                        rt8 rt8Var12 = (rt8) CollectionsKt.firstOrNull(list5);
                        if (rt8Var12 != null && (rt8Var7 = rt8Var12.g) != null) {
                            int i17 = 0;
                            for (Object obj2 : list5) {
                                int i18 = i17 + 1;
                                if (i17 < 0) {
                                    q3d.p();
                                    throw null;
                                }
                                rt8 rt8Var13 = (rt8) obj2;
                                boolean z6 = zF;
                                Iterator it9 = it8;
                                if (rt8Var7.b.size() == 1) {
                                    rt8Var13.c = 0.0f;
                                    rt8Var13.e = rt8Var13.f.bottom;
                                } else {
                                    Rect rect9 = getPage() != this.w ? rt8Var7.f : this.k1;
                                    if (rect9 == null) {
                                        rect9 = rt8Var7.f;
                                    }
                                    if (i17 == 0) {
                                        float F = p7x.F(rt8Var13.f.bottom, rect9.centerY(), fMax);
                                        int iF = (int) p7x.F(rt8Var13.f.top, rect9.centerY() - rt8Var13.d, fMax);
                                        Rect rect10 = rt8Var13.f;
                                        f = F;
                                        rect10.offset(0, iF - rect10.top);
                                    } else {
                                        float F2 = p7x.F(rt8Var13.f.top, rect9.centerY(), fMax);
                                        int iF2 = (int) p7x.F(rt8Var13.f.top, (rect9.centerY() + rt8Var13.d) - rt8Var13.f.height(), fMax);
                                        Rect rect11 = rt8Var13.f;
                                        f = F2;
                                        rect11.offset(0, iF2 - rect11.top);
                                    }
                                    rt8Var13.e = f - rt8Var13.f.top;
                                    rt8Var13.c = fMax;
                                }
                                i17 = i18;
                                zF = z6;
                                it8 = it9;
                            }
                        }
                        zF = zF;
                        it8 = it8;
                    }
                    z3 = zF;
                    int iB = si30.b(getFractionalPage());
                    if (iB != this.w && !this.m1) {
                        hs8 hs8Var = this.p;
                        if (hs8Var != null) {
                            ((zas0) hs8Var).d(iB, z, z2, true);
                        }
                        this.w = iB;
                    }
                }
                it = it3;
                z4 = false;
                if (this.q) {
                    int fractionalPage = (int) getFractionalPage();
                    List list6 = (List) treeMap.get(Integer.valueOf(fractionalPage));
                    List list7 = fractionalPage < treeMap.size() + (-1) ? (List) treeMap.get(Integer.valueOf(fractionalPage + 1)) : null;
                    rt8 rt8Var14 = list6 != null ? (rt8) CollectionsKt.d0(list6) : null;
                    if (rt8Var14 == null || (rect5 = rt8Var14.f) == null) {
                        rect5 = this.k;
                    }
                    if (rt8Var14 == null || (ss8Var3 = rt8Var14.f31065a) == null || (ss8Var = ss8Var3.e) == null) {
                        ss8Var = (list7 == null || (rt8Var6 = (rt8) CollectionsKt.d0(list7)) == null || (ss8Var2 = rt8Var6.f31065a) == null) ? null : ss8Var2.e;
                    }
                    int i19 = ss8Var != null ? this.i + ss8Var.b : 0;
                    ViewGroup.LayoutParams layoutParams = getLayoutParams();
                    layoutParams.height = rect5.bottom + i19;
                    setLayoutParams(layoutParams);
                }
            } else {
                z3 = zF;
                z4 = z5;
                it = it3;
            }
            z5 = z4;
            zF = z3;
            it3 = it;
        }
        boolean z7 = zF;
        Rect rect12 = new Rect(rect6);
        List list8 = (List) treeMap.get(Integer.valueOf(getPage()));
        int i20 = (list8 == null || (rt8Var5 = (rt8) CollectionsKt.firstOrNull(list8)) == null || (rect4 = rt8Var5.f) == null) ? 0 : rect4.top;
        List list9 = (List) treeMap.get(Integer.valueOf(getPage() + 1));
        int iMin = Math.min(i20, (list9 == null || (rt8Var4 = (rt8) CollectionsKt.firstOrNull(list9)) == null || (rect3 = rt8Var4.f) == null) ? 0 : rect3.top);
        ls8 ls8Var = this.s.b;
        ls8 ls8Var2 = ls8.f20564a;
        Rect rect13 = this.j;
        if (ls8Var == ls8Var2) {
            rect12.offset(i3, i2);
            List list10 = (List) treeMap.get(Integer.valueOf(getPage()));
            if (list10 != null && (rt8Var3 = (rt8) CollectionsKt.d0(list10)) != null) {
                Rect rect14 = rt8Var3.f;
            }
            List list11 = (List) treeMap.get(Integer.valueOf(getPage()));
            int i21 = (list11 == null || (rt8Var2 = (rt8) CollectionsKt.f0(list11)) == null || (rect2 = rt8Var2.f) == null) ? 0 : rect2.bottom;
            List list12 = (List) treeMap.get(Integer.valueOf(getPage() + 1));
            int iMax2 = Math.max(i21, (list12 == null || (rt8Var = (rt8) CollectionsKt.f0(list12)) == null || (rect = rt8Var.f) == null) ? 0 : rect.bottom) + rect12.top;
            int measuredHeight = this.f47071a.getMeasuredHeight() - rect13.bottom;
            if (iMax2 <= measuredHeight) {
                rect12.top -= iMax2 - Math.max(iMax2, measuredHeight);
            }
            int i22 = rect12.top;
            int i23 = iMin + i22;
            if (i23 >= 0 || z7) {
                rect12.top = i22 - (i23 - Math.min(i23, rect13.top));
            }
        } else {
            new Rect(0, 0, i3, i2).top -= iMin - rect13.top;
        }
        Iterator it10 = treeMap.entrySet().iterator();
        while (it10.hasNext()) {
            Iterator it11 = ((List) ((Map.Entry) it10.next()).getValue()).iterator();
            while (it11.hasNext()) {
                ((rt8) it11.next()).f.offset(i3, 0);
            }
        }
        i();
        c();
    }

    public final void l(float f, boolean z, boolean z2, boolean z3, boolean z4) {
        if (f >= this.i1.size()) {
            return;
        }
        this.w = f > getFractionalPage() ? si30.b(getFractionalPage()) : (int) Math.ceil(getFractionalPage());
        this.o = z2;
        int i = (int) f;
        float f2 = -g(i);
        is8 is8Var = (is8) CollectionsKt.W(i + 1, this.t);
        this.f47071a.b((-((int) rw2.a(f, i, is8Var != null ? is8Var.f15291a : false ? this.d : this.v, f2))) - ((int) this.x), 0, z, z3, z4);
        if (z) {
            return;
        }
        this.o = true;
    }

    public final void m(ss8 ss8Var, int i) {
        TreeMap treeMap;
        rt8 rt8Var = new rt8(ss8Var);
        this.l = rt8Var;
        Collection collectionC = a.c(rt8Var);
        a();
        this.k.set(0, 0, this.d, this.e);
        this.w = 0;
        int i2 = this.g1;
        int i3 = this.B;
        this.v = i2 + i3 + this.h1;
        int i4 = ss8Var.f;
        while (true) {
            boolean zIsEmpty = collectionC.isEmpty();
            treeMap = this.i1;
            if (zIsEmpty) {
                break;
            }
            int i5 = i4 - 1;
            treeMap.put(Integer.valueOf(i4), collectionC);
            ArrayList arrayList = new ArrayList(r3d.q(collectionC, 10));
            Iterator it = collectionC.iterator();
            while (it.hasNext()) {
                arrayList.add(((rt8) it.next()).b);
            }
            collectionC = r3d.r(arrayList);
            i4 = i5;
        }
        int i6 = -g(treeMap.size() - 1);
        Rect rect = this.j;
        this.z = i6 + rect.left;
        for (Map.Entry entry : treeMap.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            List<rt8> list = (List) entry.getValue();
            int i7 = rect.left;
            this.s.getClass();
            js8 js8Var = (js8) CollectionsKt.W(iIntValue, this.A);
            int iG = (i7 - (js8Var != null ? js8Var.f17038a : 0)) - g(iIntValue);
            for (rt8 rt8Var2 : list) {
                int i8 = rect.top;
                int i9 = iG + i3;
                int i10 = rt8Var2.f31065a.b;
                if (i10 == 0) {
                    i10 = this.f1;
                }
                rt8Var2.f = new Rect(iG, i8, i9, i10 + i8);
            }
        }
        Iterator it2 = treeMap.entrySet().iterator();
        while (it2.hasNext()) {
            for (List list2 : CollectionsKt.K((List) ((Map.Entry) it2.next()).getValue(), 2)) {
                Iterator it3 = list2.iterator();
                if (!it3.hasNext()) {
                    itt0.a();
                    return;
                }
                int iHeight = ((rt8) it3.next()).f.height();
                while (it3.hasNext()) {
                    int iHeight2 = ((rt8) it3.next()).f.height();
                    if (iHeight > iHeight2) {
                        iHeight = iHeight2;
                    }
                }
                float size = iHeight / list2.size();
                Iterator it4 = list2.iterator();
                while (it4.hasNext()) {
                    ((rt8) it4.next()).d = size;
                }
            }
        }
        this.x = 0.0f;
        if (i > 0) {
            l(i, false, true, false, true);
        } else {
            k(g(0), 0, true, true);
        }
    }

    public final void n(a1m0 a1m0Var, uju0 uju0Var, int i) {
        ss8 ss8Var;
        is8 is8Var;
        os8 ms8Var;
        List list = a1m0Var.f77a;
        IntRange intRangeO = l1e0.o(0, list.size());
        ArrayList arrayList = new ArrayList(r3d.q(intRangeO, 10));
        Iterator it = intRangeO.iterator();
        while (((kkx) it).c) {
            int iNextInt = ((bkx) it).nextInt();
            if ((uju0Var instanceof sju0) && iNextInt == list.size() - 1) {
                os8 os8Var = this.s.d;
                if (os8Var instanceof ns8) {
                    ms8Var = new ns8(-((ns8) os8Var).f24040a);
                } else if (!(os8Var instanceof ms8)) {
                    t9f.b();
                    return;
                } else {
                    ms8 ms8Var2 = (ms8) os8Var;
                    ms8Var = new ms8(-ms8Var2.f22306a, -ms8Var2.b);
                }
                is8Var = new is8(true, ms8Var);
            } else {
                is8Var = new is8(false, new ns8(0.0f));
            }
            arrayList.add(is8Var);
        }
        setColumnConfigurations(arrayList);
        this.j1 = uju0Var;
        boolean z = (uju0Var instanceof sju0) && !((sju0) uju0Var).f32319a;
        a1m0 a1m0Var2 = a1m0Var.d;
        int size = list.size();
        int i2 = size - 1;
        List list2 = (List) a1m0Var.c.get(list.get(i2));
        pab pabVar = (z || list2 == null) ? null : (pab) CollectionsKt.firstOrNull(list2);
        int iA = this.f1;
        gs8 gs8Var = this.f;
        if (a1m0Var2 != null) {
            List list3 = a1m0Var2.f77a;
            int size2 = list3.size() - 1;
            List list4 = (List) a1m0Var2.c.get(list3.get(size2));
            pab pabVar2 = list4 != null ? (pab) CollectionsKt.firstOrNull(list4) : null;
            ss8Var = new ss8(iun.f15405a, pabVar2 != null ? gs8Var.a(pabVar2.f26648a, pabVar2.d) : iA, pabVar2, (String) list3.get(size2), null);
        } else {
            ss8Var = null;
        }
        List listD = d(a1m0Var, size - 2, 0);
        if (pabVar != null) {
            iA = gs8Var.a(pabVar.f26648a, pabVar.d);
        }
        m(new ss8(listD, iA, pabVar, (String) list.get(i2), ss8Var), i);
    }

    public final void setAllHighlightedItemsDelegate(Function0<? extends List<lk50>> function0) {
        this.r = function0;
    }

    public final void setConfig(ks8 ks8Var) {
        ks8Var.getClass();
        this.s = ks8Var;
        rt8 rt8Var = this.l;
        if (rt8Var != null) {
            m(rt8Var.f31065a, 0);
        }
    }

    public final void setDelegate(hs8 hs8Var) {
        this.p = hs8Var;
    }

    public final void setSingleNetOptimizationEnabled(boolean z) {
        this.q = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BracketItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BracketItemView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
