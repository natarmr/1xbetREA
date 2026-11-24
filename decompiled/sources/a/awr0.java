package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class awr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1589a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final zpq0 f;
    public final lrq0 g;
    public final String h;
    public final String i;
    public final String j;

    public awr0(int i, String str, String str2, boolean z, boolean z2, zpq0 zpq0Var, lrq0 lrq0Var, String str3, String str4, String str5) {
        str.getClass();
        str2.getClass();
        this.f1589a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = zpq0Var;
        this.g = lrq0Var;
        this.h = str3;
        this.i = str4;
        this.j = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awr0)) {
            return false;
        }
        awr0 awr0Var = (awr0) obj;
        return this.f1589a == awr0Var.f1589a && Intrinsics.d(this.b, awr0Var.b) && Intrinsics.d(this.c, awr0Var.c) && this.d == awr0Var.d && this.e == awr0Var.e && this.f.equals(awr0Var.f) && this.g.equals(awr0Var.g) && this.h.equals(awr0Var.h) && this.i.equals(awr0Var.i) && this.j.equals(awr0Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ua80.b(ua80.b((this.g.hashCode() + ((this.f.hashCode() + brm0.e(brm0.e(ua80.b(ua80.b(Integer.hashCode(this.f1589a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e)) * 31)) * 31, 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f1589a, "TotoTirageUiItem(tirageNum=", ", tirageText=", this.b, ", date=");
        brm0.C(this.c, ", showButtons=", ", showDownloadButton=", sbR, this.d);
        sbR.append(this.e);
        sbR.append(", tirageItemStatus=");
        sbR.append(this.f);
        sbR.append(", tirageUiContent=");
        sbR.append(this.g);
        sbR.append(", cephFullPath=");
        sbR.append(this.h);
        sbR.append(", fileName=");
        return ua80.m(sbR, this.i, ", fileSizeText=", this.j, Separators.RPAREN);
    }
}
