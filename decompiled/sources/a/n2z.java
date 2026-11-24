package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n2z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f22823a = q3d.j(new j2z(7), new i2z(8), new k2z(9));

    public static final ArrayList a(ljg ljgVar, List list) {
        ljgVar.getClass();
        v1h v1hVar = ljgVar.d;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l2z l2zVar = (l2z) it.next();
            if (l2zVar != null) {
                if (l2zVar instanceof j2z) {
                    if (!v1hVar.d.isEmpty()) {
                        arrayList.add(l2zVar);
                    }
                } else if (l2zVar instanceof i2z) {
                    if (!v1hVar.e.isEmpty() && ljgVar.b.c.length() > 0) {
                        arrayList.add(l2zVar);
                    }
                } else if (l2zVar instanceof k2z) {
                    if (!v1hVar.f.isEmpty() && ljgVar.c.c.length() > 0) {
                        arrayList.add(l2zVar);
                    }
                }
            }
            t9f.b();
            return null;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:39:0x0108  */
    /* JADX WARN: Code duplicated, block: B:40:0x010d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x010f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0114  */
    /* JADX WARN: Code duplicated, block: B:45:0x0134  */
    /* JADX WARN: Code duplicated, block: B:46:0x013a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x013c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0143  */
    /* JADX WARN: Code duplicated, block: B:53:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:57:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:59:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:75:0x0193 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final m2z b(String str, ljg ljgVar, l2z l2zVar, boolean z, ctf0 ctf0Var, boolean z2, boolean z3, boolean z4, Function1 function1) {
        e2z e2zVarD;
        f2z d2zVar;
        int i;
        List list;
        v1h v1hVar;
        int i2;
        int i3;
        boolean z5;
        lc00 lc00VarL;
        f2h f2hVar;
        f2h f2hVar2;
        List list2;
        ArrayList arrayList;
        int i4;
        int i5;
        boolean z6;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        i4 i4VarR0;
        int i11;
        boolean z7;
        ctf0 ctf0Var2 = ctf0Var;
        ljgVar.getClass();
        ctf0Var2.getClass();
        boolean z8 = l2zVar instanceof j2z;
        ljg ljgVar2 = z8 ? (ljg) function1.invoke(ljgVar) : ljgVar;
        boolean z9 = l2zVar instanceof i2z;
        boolean z10 = true;
        if (!z9) {
            if (z8) {
                ljgVar2.getClass();
                String strT = vsm0.t(ljgVar2.b.d);
                v1h v1hVar2 = ljgVar2.d;
                Object[] objArr = {String.valueOf(v1hVar2.f36629a)};
                lsm0 lsm0Var = ctf0Var2.b;
                d2zVar = new d2z(strT, lsm0Var.a(R.string.cyber_team_win_count_v2, Arrays.copyOf(objArr, 1)), vsm0.t(ljgVar2.c.d), lsm0Var.a(R.string.cyber_team_win_count_v2, Arrays.copyOf(new Object[]{String.valueOf(v1hVar2.b)}, 1)), (!z2 || (i = v1hVar2.c) == 0) ? "" : lsm0Var.a(R.string.cs2_overtimes_v2, Arrays.copyOf(new Object[]{String.valueOf(i)}, 1)));
            } else {
                if (!(l2zVar instanceof k2z)) {
                    t9f.b();
                    return null;
                }
                e2zVarD = yum0.d(ljgVar2.c);
            }
            list = ljgVar2.f20149a;
            v1hVar = ljgVar2.d;
            i2 = 0;
            i3 = 5;
            if (z9) {
                lc00VarL = ltt0.l(list, v1hVar.e);
                z5 = true;
            } else if (z8) {
                f2hVar = ljgVar2.b;
                f2hVar2 = ljgVar2.c;
                list2 = v1hVar.d;
                list2.getClass();
                lc00 lc00VarB = kotlin.collections.a.b();
                arrayList = new ArrayList();
                i4 = 0;
                for (Object obj : list2) {
                    i5 = i4 + 1;
                    if (i4 >= 0) {
                        q3d.p();
                        throw null;
                    }
                    q1h q1hVar = (q1h) obj;
                    boolean z11 = z10;
                    if (list2.size() <= i3 || i4 != list2.size() - 1) {
                        z6 = i2;
                    } else {
                        z6 = z11;
                    }
                    q1hVar.getClass();
                    String str2 = q1hVar.f27952a;
                    String strT2 = vsm0.t(f2hVar.d);
                    i6 = q1hVar.d;
                    i7 = q1hVar.e;
                    if (i6 > i7) {
                        i8 = R.string.previous_maps_win;
                    } else if (i6 < i7) {
                        i8 = R.string.previous_maps_lose;
                    } else {
                        i8 = R.string.draw_game;
                    }
                    List list3 = list2;
                    lsm0 lsm0Var2 = ctf0Var2.b;
                    String strA = lsm0Var2.a(i8, Arrays.copyOf(new Object[i2], i2));
                    long jT = pvm0.t(i6, i7, z3);
                    String strT3 = vsm0.t(f2hVar2.d);
                    if (i7 > i6) {
                        i9 = R.string.previous_maps_win;
                    } else if (i7 < i6) {
                        i9 = R.string.previous_maps_lose;
                    } else {
                        i9 = R.string.draw_game;
                    }
                    String strA2 = lsm0Var2.a(i9, Arrays.copyOf(new Object[i2], i2));
                    long jT2 = pvm0.t(i7, i6, z3);
                    String str3 = q1hVar.g;
                    String strValueOf = String.valueOf(i6);
                    String strValueOf2 = String.valueOf(i7);
                    rdj rdjVar = rdj.f30294a;
                    arrayList.add(new w1z(str2, strT2, strA, jT, strT3, strA2, jT2, new ib30(str3, strValueOf, strValueOf2, rdj.f(new znq0(q1hVar.f), sdj.UNIVERSAL, null, 60)), z6));
                    z10 = z11;
                    f2hVar = f2hVar;
                    ctf0Var2 = ctf0Var;
                    i4 = i5;
                    list2 = list3;
                    i2 = 0;
                    i3 = 5;
                }
                z5 = z10;
                lc00VarB.addAll(arrayList);
                lc00VarL = kotlin.collections.a.a(lc00VarB);
            } else {
                z5 = true;
                if (l2zVar instanceof k2z) {
                    t9f.b();
                    return null;
                }
                lc00VarL = ltt0.l(list, v1hVar.f);
            }
            if (z) {
                i10 = 5;
                i4VarR0 = dyb.r0(CollectionsKt.D0(lc00VarL, 5));
            } else {
                i10 = 5;
                i4VarR0 = dyb.r0(lc00VarL);
            }
            i4 i4Var = i4VarR0;
            if (z) {
                i11 = R.drawable.ic_glyph_chevron_down_small;
            } else {
                i11 = R.drawable.ic_glyph_chevron_up_small;
            }
            int i12 = i11;
            if (lc00VarL.b() > i10) {
                z7 = z5;
            } else {
                z7 = false;
            }
            return new m2z(str, d2zVar, i4Var, z7, i12, z4);
        }
        e2zVarD = yum0.d(ljgVar2.b);
        d2zVar = e2zVarD;
        list = ljgVar2.f20149a;
        v1hVar = ljgVar2.d;
        i2 = 0;
        i3 = 5;
        if (z9) {
            lc00VarL = ltt0.l(list, v1hVar.e);
            z5 = true;
        } else if (z8) {
            f2hVar = ljgVar2.b;
            f2hVar2 = ljgVar2.c;
            list2 = v1hVar.d;
            list2.getClass();
            lc00 lc00VarB2 = kotlin.collections.a.b();
            arrayList = new ArrayList();
            i4 = 0;
            while (r9.hasNext()) {
                i5 = i4 + 1;
                if (i4 >= 0) {
                    q3d.p();
                    throw null;
                }
                q1h q1hVar2 = (q1h) obj;
                boolean z12 = z10;
                if (list2.size() <= i3) {
                    z6 = i2;
                } else {
                    z6 = i2;
                }
                q1hVar2.getClass();
                String str4 = q1hVar2.f27952a;
                String strT4 = vsm0.t(f2hVar.d);
                i6 = q1hVar2.d;
                i7 = q1hVar2.e;
                if (i6 > i7) {
                    i8 = R.string.previous_maps_win;
                } else if (i6 < i7) {
                    i8 = R.string.previous_maps_lose;
                } else {
                    i8 = R.string.draw_game;
                }
                List list4 = list2;
                lsm0 lsm0Var3 = ctf0Var2.b;
                String strA3 = lsm0Var3.a(i8, Arrays.copyOf(new Object[i2], i2));
                long jT3 = pvm0.t(i6, i7, z3);
                String strT5 = vsm0.t(f2hVar2.d);
                if (i7 > i6) {
                    i9 = R.string.previous_maps_win;
                } else if (i7 < i6) {
                    i9 = R.string.previous_maps_lose;
                } else {
                    i9 = R.string.draw_game;
                }
                String strA4 = lsm0Var3.a(i9, Arrays.copyOf(new Object[i2], i2));
                long jT4 = pvm0.t(i7, i6, z3);
                String str5 = q1hVar2.g;
                String strValueOf3 = String.valueOf(i6);
                String strValueOf4 = String.valueOf(i7);
                rdj rdjVar2 = rdj.f30294a;
                arrayList.add(new w1z(str4, strT4, strA3, jT3, strT5, strA4, jT4, new ib30(str5, strValueOf3, strValueOf4, rdj.f(new znq0(q1hVar2.f), sdj.UNIVERSAL, null, 60)), z6));
                z10 = z12;
                f2hVar = f2hVar;
                ctf0Var2 = ctf0Var;
                i4 = i5;
                list2 = list4;
                i2 = 0;
                i3 = 5;
            }
            z5 = z10;
            lc00VarB2.addAll(arrayList);
            lc00VarL = kotlin.collections.a.a(lc00VarB2);
        } else {
            z5 = true;
            if (l2zVar instanceof k2z) {
                t9f.b();
                return null;
            }
            lc00VarL = ltt0.l(list, v1hVar.f);
        }
        if (z) {
            i10 = 5;
            i4VarR0 = dyb.r0(CollectionsKt.D0(lc00VarL, 5));
        } else {
            i10 = 5;
            i4VarR0 = dyb.r0(lc00VarL);
        }
        i4 i4Var2 = i4VarR0;
        if (z) {
            i11 = R.drawable.ic_glyph_chevron_down_small;
        } else {
            i11 = R.drawable.ic_glyph_chevron_up_small;
        }
        int i13 = i11;
        if (lc00VarL.b() > i10) {
            z7 = z5;
        } else {
            z7 = false;
        }
        return new m2z(str, d2zVar, i4Var2, z7, i13, z4);
    }

    public static final l2z d(long j, ArrayList arrayList) {
        Object next;
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((l2z) next).f19335a != j);
        l2z l2zVar = (l2z) next;
        return l2zVar == null ? (l2z) CollectionsKt.firstOrNull(arrayList) : l2zVar;
    }
}
