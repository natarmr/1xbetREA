package a;

import android.graphics.Typeface;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.personal.impl.navigation.PersonalScreen$PersonalDataScreen;
import org.xplatform.promo.impl.core.di.navigation.PromoScreenFactoryImpl$getPromoSettingsScreen$1;

/* JADX INFO: loaded from: classes3.dex */
public final class jh70 implements zxv, uw90, s2c0 {
    public static Typeface a(String str, psq psqVar, int i) {
        if (i == 0 && Intrinsics.d(psqVar, psq.e) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        if (i == 0 && Intrinsics.d(psqVar, psq.g) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT_BOLD;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), psqVar.f27526a, i == 1);
    }

    public static sba0 f(Integer num) {
        sba0 sba0Var = sba0.PERSONAL;
        if (num != null && num.intValue() == 1) {
            return sba0Var;
        }
        sba0 sba0Var2 = sba0.GAMING;
        if (num != null && num.intValue() == 2) {
            return sba0Var2;
        }
        return (num != null && num.intValue() == 3) ? sba0.DEPOSIT : sba0.UNKNOWN;
    }

    public static ArrayList g() {
        c0o c0oVar = d590.e;
        ArrayList arrayList = new ArrayList(r3d.q(c0oVar, 10));
        y2 y2Var = new y2(c0oVar, (byte) 0);
        while (y2Var.hasNext()) {
            arrayList.add(((d590) y2Var.next()).b);
        }
        return arrayList;
    }

    public static String[] h() {
        c0o c0oVar = d590.e;
        ArrayList arrayList = new ArrayList(r3d.q(c0oVar, 10));
        y2 y2Var = new y2(c0oVar, (byte) 0);
        while (y2Var.hasNext()) {
            arrayList.add(((d590) y2Var.next()).f5495a);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static PromoScreenFactoryImpl$getPromoSettingsScreen$1 i(jh70 jh70Var, zuc0 zuc0Var) {
        jh70Var.getClass();
        zuc0Var.getClass();
        return new PromoScreenFactoryImpl$getPromoSettingsScreen$1(zuc0Var, 0L);
    }

    public static PersonalScreen$PersonalDataScreen j(jh70 jh70Var, boolean z) {
        jh70Var.getClass();
        return new PersonalScreen$PersonalDataScreen("");
    }

    @Override // a.uw90
    public Typeface b(vjt vjtVar, psq psqVar, int i) {
        return a(vjtVar.f, psqVar, i);
    }

    @Override // a.uw90
    public Typeface c(psq psqVar, int i) {
        return a(null, psqVar, i);
    }

    public void l(androidx.fragment.app.e eVar, dqe dqeVar) {
        eVar.getClass();
        bqe.o2.getClass();
        String str = bqe.q2;
        if (eVar.J(str) != null) {
            return;
        }
        bqe bqeVar = new bqe();
        bqeVar.n2.u(bqeVar, bqe.p2[0], dqeVar);
        bqeVar.H0(eVar, str);
    }

    public void m(androidx.fragment.app.e eVar, ft00 ft00Var) {
        eVar.getClass();
        ct00.n2.getClass();
        String str = ct00.p2;
        if (eVar.J(str) != null) {
            return;
        }
        ct00 ct00Var = new ct00();
        ct00Var.m2.u(ct00Var, ct00.o2[0], ft00Var);
        ct00Var.H0(eVar, str);
    }

    @Override // a.s2c0
    public void d() {
    }

    @Override // a.zxv
    public void k(vmu0 vmu0Var) {
    }

    @Override // a.s2c0
    public void e(int i, Object obj) {
    }
}
