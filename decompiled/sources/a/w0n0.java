package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w0n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o2n0 f38358a;
    public final l1q0 b;
    public final z0q0 c;
    public final String d;
    public final String e;
    public final boolean f;
    public final int g;
    public final ljj h;

    public w0n0(o2n0 o2n0Var, l1q0 l1q0Var, z0q0 z0q0Var, String str, String str2, boolean z, int i, ljj ljjVar) {
        z0q0Var.getClass();
        this.f38358a = o2n0Var;
        this.b = l1q0Var;
        this.c = z0q0Var;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = i;
        this.h = ljjVar;
    }

    public static w0n0 a(w0n0 w0n0Var, l1q0 l1q0Var, z0q0 z0q0Var, String str, String str2, boolean z, int i, ljj ljjVar, int i2) {
        l1q0 l1q0Var2 = l1q0Var;
        o2n0 o2n0Var = w0n0Var.f38358a;
        if ((i2 & 2) != 0) {
            l1q0Var2 = w0n0Var.b;
        }
        if ((i2 & 4) != 0) {
            z0q0Var = w0n0Var.c;
        }
        if ((i2 & 8) != 0) {
            str = w0n0Var.d;
        }
        if ((i2 & 16) != 0) {
            str2 = w0n0Var.e;
        }
        if ((i2 & 32) != 0) {
            z = w0n0Var.f;
        }
        if ((i2 & 64) != 0) {
            i = w0n0Var.g;
        }
        if ((i2 & 128) != 0) {
            ljjVar = w0n0Var.h;
        }
        ljj ljjVar2 = ljjVar;
        w0n0Var.getClass();
        z0q0Var.getClass();
        str.getClass();
        str2.getClass();
        ljjVar2.getClass();
        int i3 = i;
        boolean z2 = z;
        String str3 = str2;
        String str4 = str;
        return new w0n0(o2n0Var, l1q0Var2, z0q0Var, str4, str3, z2, i3, ljjVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0n0)) {
            return false;
        }
        w0n0 w0n0Var = (w0n0) obj;
        return this.f38358a.equals(w0n0Var.f38358a) && Intrinsics.d(this.b, w0n0Var.b) && Intrinsics.d(this.c, w0n0Var.c) && this.d.equals(w0n0Var.d) && this.e.equals(w0n0Var.e) && this.f == w0n0Var.f && this.g == w0n0Var.g && this.h == w0n0Var.h;
    }

    public final int hashCode() {
        int iHashCode = this.f38358a.hashCode() * 31;
        l1q0 l1q0Var = this.b;
        return this.h.hashCode() + twn.a(this.g, brm0.e(ua80.b(ua80.b((this.c.hashCode() + ((iHashCode + (l1q0Var == null ? 0 : l1q0Var.hashCode())) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubSectionState(subSectionType=");
        sb.append(this.f38358a);
        sb.append(", testSectionCommonItemsModel=");
        sb.append(this.b);
        sb.append(", testConsultantModel=");
        sb.append(this.c);
        sb.append(", testDomain=");
        sb.append(this.d);
        sb.append(", fakeLetters=");
        brm0.C(this.e, ", isFakeLatersSelected=", ", couponEventsCount=", sb, this.f);
        sb.append(this.g);
        sb.append(", debugConsoleState=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
