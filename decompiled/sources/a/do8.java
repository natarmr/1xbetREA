package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class do8 implements eo8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6404a;
    public final String b;
    public final String c;
    public final boolean d;

    public do8(String str, String str2, String str3, boolean z) {
        str3.getClass();
        this.f6404a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof do8)) {
            return false;
        }
        do8 do8Var = (do8) obj;
        return this.f6404a.equals(do8Var.f6404a) && this.b.equals(do8Var.b) && Intrinsics.d(this.c, do8Var.c) && this.d == do8Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ua80.b(ua80.b(this.f6404a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return defpackage.c.c(this.c, ", isVisible=", Separators.RPAREN, b1j.n("HelperUiModel(titleText=", this.f6404a, ", subTitleText=", this.b, ", settingsText="), this.d);
    }
}
