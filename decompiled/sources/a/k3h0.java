package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class k3h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f17619a = -1;
    public final p7m0 b = q7m0.a(null);

    public static ArrayList a(List list, List list2) {
        te90 te90Var;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            ue90 ue90Var = (ue90) obj;
            te90 te90Var2 = list2 != null ? (te90) CollectionsKt.W(i, list2) : null;
            if (te90Var2 != null) {
                String str = ue90Var.b;
                boolean zB = b(te90Var2.b, str);
                String str2 = ue90Var.c;
                te90Var = new te90(ue90Var.f35514a, str, str2, zB, b(te90Var2.d, str2));
            } else {
                te90Var = new te90(ue90Var.f35514a, ue90Var.b, ue90Var.c, false, false);
            }
            arrayList.add(te90Var);
            i = i2;
        }
        return arrayList;
    }

    public static boolean b(String str, String str2) {
        if (Intrinsics.d(str, str2)) {
            return false;
        }
        Double dI = str != null ? kotlin.text.b.i(str) : null;
        Double dI2 = kotlin.text.b.i(str2);
        if (dI2 == null) {
            return dI != null;
        }
        return dI != null && dI2.doubleValue() > dI.doubleValue();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public final void c(a.pqs r26, long r27) {
        /*
            Method dump skipped, instruction units count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.k3h0.c(a.pqs, long):void");
    }

    public final void d(dwm0 dwm0Var, long j) {
        p7m0 p7m0Var;
        Object value;
        bg30 bg30VarA;
        izm0 gzm0Var;
        izm0 gzm0Var2;
        do {
            p7m0Var = this.b;
            value = p7m0Var.getValue();
            bg30 bg30Var = (bg30) value;
            bg30VarA = null;
            if (bg30Var != null) {
                izm0 izm0Var = this.f17619a == j ? bg30Var.b : null;
                this.f17619a = j;
                if (dwm0Var != null) {
                    String strH = dwm0Var.h();
                    strH.getClass();
                    List listSplit$default = StringsKt__StringsKt.split$default(strH, new String[]{"-"}, false, 0, 6, null);
                    String str = (String) CollectionsKt.firstOrNull(listSplit$default);
                    String str2 = str == null ? "" : str;
                    String str3 = (String) CollectionsKt.f0(listSplit$default);
                    if (str3 == null) {
                        str3 = "";
                    }
                    if (izm0Var == null) {
                        String str4 = str3;
                        if (dwm0Var instanceof bwm0) {
                            bwm0 bwm0Var = (bwm0) dwm0Var;
                            List list = bwm0Var.b;
                            ue90 ue90Var = (ue90) CollectionsKt.firstOrNull(list);
                            gzm0Var2 = new hzm0(ue90Var != null ? ue90Var.f35514a : "", str2, false, str4, false, a(list, null), bwm0Var.c, bwm0Var.d, bwm0Var.e, bwm0Var.f);
                        } else if (!(dwm0Var instanceof cwm0)) {
                            t9f.b();
                            return;
                        } else {
                            List list2 = ((cwm0) dwm0Var).b;
                            ue90 ue90Var2 = (ue90) CollectionsKt.firstOrNull(list2);
                            gzm0Var2 = new gzm0(ue90Var2 != null ? ue90Var2.f35514a : "", str2, false, str4, false, a(list2, null));
                        }
                    } else if (izm0Var instanceof gzm0) {
                        gzm0 gzm0Var3 = (gzm0) izm0Var;
                        gzm0Var = new gzm0(gzm0Var3.f12186a, str2.length() == 0 ? "0" : str2, b(gzm0Var3.b, str2), str3.length() == 0 ? "0" : str3, b(gzm0Var3.d, str3), a(dwm0Var.a(), gzm0Var3.f));
                    } else {
                        if (!(izm0Var instanceof hzm0)) {
                            t9f.b();
                            return;
                        }
                        bwm0 bwm0Var2 = dwm0Var instanceof bwm0 ? (bwm0) dwm0Var : null;
                        hzm0 hzm0Var = (hzm0) izm0Var;
                        boolean zB = b(hzm0Var.b, str2);
                        boolean zB2 = b(hzm0Var.d, str3);
                        ArrayList arrayListA = a(dwm0Var.a(), hzm0Var.f);
                        String str5 = bwm0Var2 != null ? bwm0Var2.e : null;
                        String str6 = bwm0Var2 != null ? bwm0Var2.c : null;
                        String str7 = str6 == null ? "" : str6;
                        String str8 = bwm0Var2 != null ? bwm0Var2.f : null;
                        String str9 = bwm0Var2 != null ? bwm0Var2.d : null;
                        gzm0Var2 = new hzm0(hzm0Var.f13914a, str2, zB, str3, zB2, arrayListA, str7, str9 == null ? "" : str9, str5, str8);
                    }
                    gzm0Var = gzm0Var2;
                } else {
                    gzm0Var = null;
                }
                bg30VarA = bg30.a(bg30Var, null, gzm0Var, 1);
            }
        } while (!p7m0Var.m(value, bg30VarA));
    }
}
