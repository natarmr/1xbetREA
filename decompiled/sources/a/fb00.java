package a;

import android.javax.sip.message.Response;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class fb00 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ctf0 f9233a;
    public final ocl b;
    public final long c;
    public final n0o0 d;
    public final n0o0 e;
    public final n0o0 f;
    public final n0o0 g;
    public final n0o0 h;
    public final n0o0 i;
    public final n0o0 j;

    public fb00(ma00 ma00Var, ctf0 ctf0Var, ocl oclVar, long j) {
        ctf0Var.getClass();
        this.f9233a = ctf0Var;
        this.b = oclVar;
        this.c = j;
        this.d = bkb.H(Integer.valueOf(ma00Var.c));
        this.e = bkb.H(ma00Var.f);
        this.f = bkb.H(ma00Var.g);
        final byte b = 1;
        n0o0 n0o0VarB = maz.b(new yw9(ma00Var, new w800((byte) 1), (byte) 20));
        this.g = n0o0VarB;
        final byte b2 = 0;
        this.h = bkb.G(a().d, new Function1(this) { // from class: a.eb00
            public final /* synthetic */ fb00 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                int i = 10;
                fb00 fb00Var = this.b;
                switch (b3) {
                    case 0:
                        ((l800) obj).getClass();
                        ArrayList arrayListW = ydx.W((l800) fb00Var.a().c());
                        ArrayList arrayList = new ArrayList(r3d.q(arrayListW, 10));
                        Iterator it = arrayListW.iterator();
                        while (it.hasNext()) {
                            arrayList.add((String) ((Pair) it.next()).f46059a);
                        }
                        return dyb.o0(arrayList);
                    case 1:
                        ((l800) obj).getClass();
                        List list = ((l800) fb00Var.a().c()).b;
                        int iA = wp20.a(r3d.q(list, 10));
                        if (iA < 16) {
                            iA = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                        for (Object obj2 : list) {
                            linkedHashMap.put(((b9a0) obj2).f2199a, obj2);
                        }
                        ArrayList arrayListW2 = ydx.W((l800) fb00Var.a().c());
                        ArrayList arrayList2 = new ArrayList(r3d.q(arrayListW2, 10));
                        Iterator it2 = arrayListW2.iterator();
                        while (it2.hasNext()) {
                            Pair pair = (Pair) it2.next();
                            String str = (String) pair.f46059a;
                            d800 d800Var = (d800) pair.b;
                            ctf0 ctf0Var2 = fb00Var.f9233a;
                            lc00 lc00VarB = kotlin.collections.a.b();
                            List list2 = d800Var.b;
                            List list3 = d800Var.c;
                            Iterator it3 = list2.iterator();
                            while (it3.hasNext()) {
                                u800 u800Var = (u800) it3.next();
                                lc00VarB.add(new ja00(u800Var.f35212a));
                                List list4 = u800Var.b;
                                ArrayList arrayList3 = new ArrayList(r3d.q(list4, i));
                                int i2 = 0;
                                for (Iterator it4 = list4.iterator(); it4.hasNext(); it4 = it4) {
                                    Object next = it4.next();
                                    int i3 = i2 + 1;
                                    if (i2 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    fb00 fb00Var2 = fb00Var;
                                    m800 m800Var = (m800) next;
                                    Iterator it5 = it2;
                                    String str2 = m800Var.f21346a;
                                    Iterator it6 = it3;
                                    String str3 = m800Var.f21346a;
                                    b9a0 b9a0Var = (b9a0) linkedHashMap.get(str2);
                                    List list5 = list4;
                                    String strM = b9a0Var != null ? b9a0Var.b : null;
                                    if (strM == null) {
                                        strM = "";
                                    }
                                    int i4 = m800Var.d;
                                    if (i4 > 0) {
                                        strM = dw9.m(i4, ". ", strM);
                                    }
                                    String str4 = strM;
                                    String str5 = b9a0Var != null ? b9a0Var.f : null;
                                    String str6 = str5 == null ? "" : str5;
                                    arrayList3.add(new ia00(str3 + BundleUtil.UNDERLINE_TAG + i2, str3, str4, i2 == list5.size() + (-1), str6));
                                    it2 = it5;
                                    i2 = i3;
                                    fb00Var = fb00Var2;
                                    it3 = it6;
                                    list4 = list5;
                                }
                                lc00VarB.addAll(arrayList3);
                                i = 10;
                            }
                            fb00 fb00Var3 = fb00Var;
                            Iterator it7 = it2;
                            if (!list3.isEmpty()) {
                                lc00VarB.add(new ja00(ctf0Var2.b.a(R.string.missing_players, Arrays.copyOf(new Object[0], 0))));
                                ArrayList arrayList4 = new ArrayList(r3d.q(list3, 10));
                                int i5 = 0;
                                for (Object obj3 : list3) {
                                    int i6 = i5 + 1;
                                    if (i5 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    h800 h800Var = (h800) obj3;
                                    b9a0 b9a0Var2 = (b9a0) linkedHashMap.get(h800Var.f12602a);
                                    String str7 = b9a0Var2 != null ? b9a0Var2.b : null;
                                    String str8 = str7 == null ? "" : str7;
                                    String str9 = b9a0Var2 != null ? b9a0Var2.f : null;
                                    String str10 = str9 == null ? "" : str9;
                                    boolean z = i5 == list3.size() + (-1);
                                    String str11 = h800Var.f12602a;
                                    arrayList4.add(new ia00(str11 + BundleUtil.UNDERLINE_TAG + i5, str11, str8, z, str10));
                                    i5 = i6;
                                }
                                lc00VarB.addAll(arrayList4);
                            }
                            arrayList2.add(new ynp0(dyb.o0(kotlin.collections.a.a(lc00VarB)), str));
                            it2 = it7;
                            fb00Var = fb00Var3;
                            i = 10;
                        }
                        return dyb.o0(arrayList2);
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayListW3 = ydx.W((l800) fb00Var.a().c());
                        ArrayList arrayList5 = new ArrayList(r3d.q(arrayListW3, 10));
                        Iterator it8 = arrayListW3.iterator();
                        while (it8.hasNext()) {
                            arrayList5.add(xdx.K((d800) ((Pair) it8.next()).b, fb00Var.c, (uaq0) ((fee) fb00Var.f.getValue()).c(), ((l800) fb00Var.a().c()).b, ((Number) ((fee) fb00Var.g.getValue()).b()).intValue()));
                        }
                        return dyb.r0(arrayList5);
                }
            }
        });
        this.i = bkb.G(a().d, new Function1(this) { // from class: a.eb00
            public final /* synthetic */ fb00 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b;
                int i = 10;
                fb00 fb00Var = this.b;
                switch (b3) {
                    case 0:
                        ((l800) obj).getClass();
                        ArrayList arrayListW = ydx.W((l800) fb00Var.a().c());
                        ArrayList arrayList = new ArrayList(r3d.q(arrayListW, 10));
                        Iterator it = arrayListW.iterator();
                        while (it.hasNext()) {
                            arrayList.add((String) ((Pair) it.next()).f46059a);
                        }
                        return dyb.o0(arrayList);
                    case 1:
                        ((l800) obj).getClass();
                        List list = ((l800) fb00Var.a().c()).b;
                        int iA = wp20.a(r3d.q(list, 10));
                        if (iA < 16) {
                            iA = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                        for (Object obj2 : list) {
                            linkedHashMap.put(((b9a0) obj2).f2199a, obj2);
                        }
                        ArrayList arrayListW2 = ydx.W((l800) fb00Var.a().c());
                        ArrayList arrayList2 = new ArrayList(r3d.q(arrayListW2, 10));
                        Iterator it2 = arrayListW2.iterator();
                        while (it2.hasNext()) {
                            Pair pair = (Pair) it2.next();
                            String str = (String) pair.f46059a;
                            d800 d800Var = (d800) pair.b;
                            ctf0 ctf0Var2 = fb00Var.f9233a;
                            lc00 lc00VarB = kotlin.collections.a.b();
                            List list2 = d800Var.b;
                            List list3 = d800Var.c;
                            Iterator it3 = list2.iterator();
                            while (it3.hasNext()) {
                                u800 u800Var = (u800) it3.next();
                                lc00VarB.add(new ja00(u800Var.f35212a));
                                List list4 = u800Var.b;
                                ArrayList arrayList3 = new ArrayList(r3d.q(list4, i));
                                int i2 = 0;
                                for (Iterator it4 = list4.iterator(); it4.hasNext(); it4 = it4) {
                                    Object next = it4.next();
                                    int i3 = i2 + 1;
                                    if (i2 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    fb00 fb00Var2 = fb00Var;
                                    m800 m800Var = (m800) next;
                                    Iterator it5 = it2;
                                    String str2 = m800Var.f21346a;
                                    Iterator it6 = it3;
                                    String str3 = m800Var.f21346a;
                                    b9a0 b9a0Var = (b9a0) linkedHashMap.get(str2);
                                    List list5 = list4;
                                    String strM = b9a0Var != null ? b9a0Var.b : null;
                                    if (strM == null) {
                                        strM = "";
                                    }
                                    int i4 = m800Var.d;
                                    if (i4 > 0) {
                                        strM = dw9.m(i4, ". ", strM);
                                    }
                                    String str4 = strM;
                                    String str5 = b9a0Var != null ? b9a0Var.f : null;
                                    String str6 = str5 == null ? "" : str5;
                                    arrayList3.add(new ia00(str3 + BundleUtil.UNDERLINE_TAG + i2, str3, str4, i2 == list5.size() + (-1), str6));
                                    it2 = it5;
                                    i2 = i3;
                                    fb00Var = fb00Var2;
                                    it3 = it6;
                                    list4 = list5;
                                }
                                lc00VarB.addAll(arrayList3);
                                i = 10;
                            }
                            fb00 fb00Var3 = fb00Var;
                            Iterator it7 = it2;
                            if (!list3.isEmpty()) {
                                lc00VarB.add(new ja00(ctf0Var2.b.a(R.string.missing_players, Arrays.copyOf(new Object[0], 0))));
                                ArrayList arrayList4 = new ArrayList(r3d.q(list3, 10));
                                int i5 = 0;
                                for (Object obj3 : list3) {
                                    int i6 = i5 + 1;
                                    if (i5 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    h800 h800Var = (h800) obj3;
                                    b9a0 b9a0Var2 = (b9a0) linkedHashMap.get(h800Var.f12602a);
                                    String str7 = b9a0Var2 != null ? b9a0Var2.b : null;
                                    String str8 = str7 == null ? "" : str7;
                                    String str9 = b9a0Var2 != null ? b9a0Var2.f : null;
                                    String str10 = str9 == null ? "" : str9;
                                    boolean z = i5 == list3.size() + (-1);
                                    String str11 = h800Var.f12602a;
                                    arrayList4.add(new ia00(str11 + BundleUtil.UNDERLINE_TAG + i5, str11, str8, z, str10));
                                    i5 = i6;
                                }
                                lc00VarB.addAll(arrayList4);
                            }
                            arrayList2.add(new ynp0(dyb.o0(kotlin.collections.a.a(lc00VarB)), str));
                            it2 = it7;
                            fb00Var = fb00Var3;
                            i = 10;
                        }
                        return dyb.o0(arrayList2);
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayListW3 = ydx.W((l800) fb00Var.a().c());
                        ArrayList arrayList5 = new ArrayList(r3d.q(arrayListW3, 10));
                        Iterator it8 = arrayListW3.iterator();
                        while (it8.hasNext()) {
                            arrayList5.add(xdx.K((d800) ((Pair) it8.next()).b, fb00Var.c, (uaq0) ((fee) fb00Var.f.getValue()).c(), ((l800) fb00Var.a().c()).b, ((Number) ((fee) fb00Var.g.getValue()).b()).intValue()));
                        }
                        return dyb.r0(arrayList5);
                }
            }
        });
        final byte b3 = 2;
        this.j = bkb.G(((fee) n0o0VarB.getValue()).e, new Function1(this) { // from class: a.eb00
            public final /* synthetic */ fb00 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                int i = 10;
                fb00 fb00Var = this.b;
                switch (b4) {
                    case 0:
                        ((l800) obj).getClass();
                        ArrayList arrayListW = ydx.W((l800) fb00Var.a().c());
                        ArrayList arrayList = new ArrayList(r3d.q(arrayListW, 10));
                        Iterator it = arrayListW.iterator();
                        while (it.hasNext()) {
                            arrayList.add((String) ((Pair) it.next()).f46059a);
                        }
                        return dyb.o0(arrayList);
                    case 1:
                        ((l800) obj).getClass();
                        List list = ((l800) fb00Var.a().c()).b;
                        int iA = wp20.a(r3d.q(list, 10));
                        if (iA < 16) {
                            iA = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                        for (Object obj2 : list) {
                            linkedHashMap.put(((b9a0) obj2).f2199a, obj2);
                        }
                        ArrayList arrayListW2 = ydx.W((l800) fb00Var.a().c());
                        ArrayList arrayList2 = new ArrayList(r3d.q(arrayListW2, 10));
                        Iterator it2 = arrayListW2.iterator();
                        while (it2.hasNext()) {
                            Pair pair = (Pair) it2.next();
                            String str = (String) pair.f46059a;
                            d800 d800Var = (d800) pair.b;
                            ctf0 ctf0Var2 = fb00Var.f9233a;
                            lc00 lc00VarB = kotlin.collections.a.b();
                            List list2 = d800Var.b;
                            List list3 = d800Var.c;
                            Iterator it3 = list2.iterator();
                            while (it3.hasNext()) {
                                u800 u800Var = (u800) it3.next();
                                lc00VarB.add(new ja00(u800Var.f35212a));
                                List list4 = u800Var.b;
                                ArrayList arrayList3 = new ArrayList(r3d.q(list4, i));
                                int i2 = 0;
                                for (Iterator it4 = list4.iterator(); it4.hasNext(); it4 = it4) {
                                    Object next = it4.next();
                                    int i3 = i2 + 1;
                                    if (i2 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    fb00 fb00Var2 = fb00Var;
                                    m800 m800Var = (m800) next;
                                    Iterator it5 = it2;
                                    String str2 = m800Var.f21346a;
                                    Iterator it6 = it3;
                                    String str3 = m800Var.f21346a;
                                    b9a0 b9a0Var = (b9a0) linkedHashMap.get(str2);
                                    List list5 = list4;
                                    String strM = b9a0Var != null ? b9a0Var.b : null;
                                    if (strM == null) {
                                        strM = "";
                                    }
                                    int i4 = m800Var.d;
                                    if (i4 > 0) {
                                        strM = dw9.m(i4, ". ", strM);
                                    }
                                    String str4 = strM;
                                    String str5 = b9a0Var != null ? b9a0Var.f : null;
                                    String str6 = str5 == null ? "" : str5;
                                    arrayList3.add(new ia00(str3 + BundleUtil.UNDERLINE_TAG + i2, str3, str4, i2 == list5.size() + (-1), str6));
                                    it2 = it5;
                                    i2 = i3;
                                    fb00Var = fb00Var2;
                                    it3 = it6;
                                    list4 = list5;
                                }
                                lc00VarB.addAll(arrayList3);
                                i = 10;
                            }
                            fb00 fb00Var3 = fb00Var;
                            Iterator it7 = it2;
                            if (!list3.isEmpty()) {
                                lc00VarB.add(new ja00(ctf0Var2.b.a(R.string.missing_players, Arrays.copyOf(new Object[0], 0))));
                                ArrayList arrayList4 = new ArrayList(r3d.q(list3, 10));
                                int i5 = 0;
                                for (Object obj3 : list3) {
                                    int i6 = i5 + 1;
                                    if (i5 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    h800 h800Var = (h800) obj3;
                                    b9a0 b9a0Var2 = (b9a0) linkedHashMap.get(h800Var.f12602a);
                                    String str7 = b9a0Var2 != null ? b9a0Var2.b : null;
                                    String str8 = str7 == null ? "" : str7;
                                    String str9 = b9a0Var2 != null ? b9a0Var2.f : null;
                                    String str10 = str9 == null ? "" : str9;
                                    boolean z = i5 == list3.size() + (-1);
                                    String str11 = h800Var.f12602a;
                                    arrayList4.add(new ia00(str11 + BundleUtil.UNDERLINE_TAG + i5, str11, str8, z, str10));
                                    i5 = i6;
                                }
                                lc00VarB.addAll(arrayList4);
                            }
                            arrayList2.add(new ynp0(dyb.o0(kotlin.collections.a.a(lc00VarB)), str));
                            it2 = it7;
                            fb00Var = fb00Var3;
                            i = 10;
                        }
                        return dyb.o0(arrayList2);
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayListW3 = ydx.W((l800) fb00Var.a().c());
                        ArrayList arrayList5 = new ArrayList(r3d.q(arrayListW3, 10));
                        Iterator it8 = arrayListW3.iterator();
                        while (it8.hasNext()) {
                            arrayList5.add(xdx.K((d800) ((Pair) it8.next()).b, fb00Var.c, (uaq0) ((fee) fb00Var.f.getValue()).c(), ((l800) fb00Var.a().c()).b, ((Number) ((fee) fb00Var.g.getValue()).b()).intValue()));
                        }
                        return dyb.r0(arrayList5);
                }
            }
        });
    }

    public final fee a() {
        return (fee) this.e.getValue();
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        ma00 ma00Var = (ma00) obj;
        ma00Var.getClass();
        boolean z = ma00Var.f21437a;
        l800 l800Var = ma00Var.f;
        if (z) {
            return new za00();
        }
        boolean z2 = ma00Var.b;
        ocl oclVar = this.b;
        ctf0 ctf0Var = this.f9233a;
        if (z2) {
            return new xa00(ctf0Var.b.a(R.string.statistic_info_start_team, Arrays.copyOf(new Object[0], 0)), ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
        }
        if (l800Var.d.isEmpty()) {
            return new xa00(ctf0Var.b.a(R.string.statistic_info_start_team, Arrays.copyOf(new Object[0], 0)), ocl.b(oclVar, pb10.g, null, 0, 0, R.string.currently_no_events, 0, 0L, 0L, 990));
        }
        ((fee) this.g.getValue()).d(ma00Var);
        n0o0 n0o0Var = this.d;
        ((fee) n0o0Var.getValue()).d(Integer.valueOf(ma00Var.c));
        a().d(l800Var);
        ((fee) this.f.getValue()).d(ma00Var.g);
        n0o0 n0o0Var2 = this.j;
        Iterable iterable = (Iterable) ((fee) n0o0Var2.getValue()).b();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : iterable) {
            ra00 ra00Var = (ra00) obj2;
            if (!(ra00Var instanceof qa00) || !((qa00) ra00Var).c.b.isEmpty()) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            ra00 ra00Var2 = (ra00) obj3;
            if (ra00Var2 instanceof pa00) {
                a4x a4xVar = ((pa00) ra00Var2).c;
                if (a4xVar == null || !a4xVar.isEmpty()) {
                    Iterator<E> it = a4xVar.iterator();
                    while (it.hasNext()) {
                        if (!((p6m0) it.next()).b.isEmpty()) {
                        }
                    }
                }
            }
            arrayList2.add(obj3);
        }
        return new bb00(!arrayList2.isEmpty(), ctf0Var.b.a(R.string.statistic_info_start_team, Arrays.copyOf(new Object[0], 0)), ((Number) ((fee) n0o0Var.getValue()).c()).intValue(), (a4x) ((fee) this.h.getValue()).b(), (a4x) ((fee) this.i.getValue()).b(), (a4x) ((fee) n0o0Var2.getValue()).b(), ma00Var.h);
    }
}
