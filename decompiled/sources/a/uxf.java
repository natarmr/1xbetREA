package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class uxf implements wxf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36439a;
    public final String b;
    public final String c;
    public final boolean d;
    public final float e;
    public final int f;
    public final int g;
    public final d4d h;

    public uxf(String str, String str2, String str3, boolean z, float f, int i, int i2, d4d d4dVar) {
        brm0.B(str, str2, str3);
        this.f36439a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = f;
        this.f = i;
        this.g = i2;
        this.h = d4dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxf)) {
            return false;
        }
        uxf uxfVar = (uxf) obj;
        return Intrinsics.d(this.f36439a, uxfVar.f36439a) && Intrinsics.d(this.b, uxfVar.b) && Intrinsics.d(this.c, uxfVar.c) && this.d == uxfVar.d && Float.compare(this.e, uxfVar.e) == 0 && this.f == uxfVar.f && this.g == uxfVar.g && this.h == uxfVar.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + twn.a(this.g, twn.a(this.f, defpackage.c.a(brm0.e(ua80.b(ua80.b(this.f36439a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), this.e, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("SecurityLevel(title=", this.f36439a, ", subTitle=", this.b, ", description=");
        brm0.C(this.c, ", descriptionVisible=", ", progressBarValue=", sbN, this.d);
        sbN.append(this.e);
        sbN.append(", currentProgress=");
        sbN.append(this.f);
        sbN.append(", completeProgress=");
        sbN.append(this.g);
        sbN.append(", progressColor=");
        sbN.append(this.h);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
