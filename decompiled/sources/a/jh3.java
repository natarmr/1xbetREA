package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16508a;
    public final iy3 b;
    public final hh3 c;
    public final List d;
    public final ph3 e;
    public final oc5 f;
    public final oc5 g;
    public final String h;
    public final yfw i;
    public final Set j;
    public final boolean k;
    public final boolean l;

    public jh3(String str, iy3 iy3Var, hh3 hh3Var, List list, ph3 ph3Var, oc5 oc5Var, oc5 oc5Var2, String str2, yfw yfwVar, Set set, boolean z, boolean z2) {
        str.getClass();
        set.getClass();
        this.f16508a = str;
        this.b = iy3Var;
        this.c = hh3Var;
        this.d = list;
        this.e = ph3Var;
        this.f = oc5Var;
        this.g = oc5Var2;
        this.h = str2;
        this.i = yfwVar;
        this.j = set;
        this.k = z;
        this.l = z2;
    }

    public static jh3 a(jh3 jh3Var, iy3 iy3Var, ArrayList arrayList, ph3 ph3Var, oc5 oc5Var, oc5 oc5Var2, String str, yfw yfwVar, Set set, boolean z, boolean z2, int i) {
        String str2 = jh3Var.f16508a;
        if ((i & 2) != 0) {
            iy3Var = jh3Var.b;
        }
        iy3 iy3Var2 = iy3Var;
        hh3 hh3Var = jh3Var.c;
        List list = (i & 8) != 0 ? jh3Var.d : arrayList;
        ph3 ph3Var2 = (i & 16) != 0 ? jh3Var.e : ph3Var;
        oc5 oc5Var3 = (i & 32) != 0 ? jh3Var.f : oc5Var;
        oc5 oc5Var4 = (i & 64) != 0 ? jh3Var.g : oc5Var2;
        String str3 = (i & 128) != 0 ? jh3Var.h : str;
        yfw yfwVar2 = (i & 256) != 0 ? jh3Var.i : yfwVar;
        Set set2 = (i & 512) != 0 ? jh3Var.j : set;
        boolean z3 = (i & 1024) != 0 ? jh3Var.k : z;
        boolean z4 = (i & 2048) != 0 ? jh3Var.l : z2;
        jh3Var.getClass();
        str2.getClass();
        iy3Var2.getClass();
        set2.getClass();
        return new jh3(str2, iy3Var2, hh3Var, list, ph3Var2, oc5Var3, oc5Var4, str3, yfwVar2, set2, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh3)) {
            return false;
        }
        jh3 jh3Var = (jh3) obj;
        return Intrinsics.d(this.f16508a, jh3Var.f16508a) && this.b.equals(jh3Var.b) && this.c.equals(jh3Var.c) && this.d.equals(jh3Var.d) && Intrinsics.d(this.e, jh3Var.e) && Intrinsics.d(this.f, jh3Var.f) && Intrinsics.d(this.g, jh3Var.g) && Intrinsics.d(this.h, jh3Var.h) && this.i == jh3Var.i && Intrinsics.d(this.j, jh3Var.j) && this.k == jh3Var.k && this.l == jh3Var.l;
    }

    public final int hashCode() {
        int iA = dw9.a((this.c.hashCode() + ((this.b.hashCode() + (this.f16508a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        ph3 ph3Var = this.e;
        int iHashCode = (iA + (ph3Var == null ? 0 : ph3Var.hashCode())) * 31;
        oc5 oc5Var = this.f;
        int iHashCode2 = (iHashCode + (oc5Var == null ? 0 : oc5Var.hashCode())) * 31;
        oc5 oc5Var2 = this.g;
        int iHashCode3 = (iHashCode2 + (oc5Var2 == null ? 0 : oc5Var2.hashCode())) * 31;
        String str = this.h;
        return Boolean.hashCode(this.l) + brm0.e(ohs0.g(this.j, (this.i.hashCode() + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31)) * 31, 31), 31, this.k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppStartStateModel(appVersionName=");
        sb.append(this.f16508a);
        sb.append(", aspectRatio=");
        sb.append(this.b);
        sb.append(", settingModel=");
        sb.append(this.c);
        sb.append(", loadingSteps=");
        sb.append(this.d);
        sb.append(", videoBackgroundUriModel=");
        sb.append(this.e);
        sb.append(", backgroundImageUrlsModel=");
        sb.append(this.f);
        sb.append(", imageUrlsToPreload=");
        sb.append(this.g);
        sb.append(", appUpdateImageUrlToPreload=");
        sb.append(this.h);
        sb.append(", holidayEvent=");
        sb.append(this.i);
        sb.append(", eventsOnEnd=");
        sb.append(this.j);
        sb.append(", isPlayerReady=");
        return ohs0.p(", isAppBlocked=", Separators.RPAREN, sb, this.k, this.l);
    }
}
