package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a77 implements h77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f351a;
    public final String b;

    public a77(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f351a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a77)) {
            return false;
        }
        a77 a77Var = (a77) obj;
        return Intrinsics.d(this.f351a, a77Var.f351a) && Intrinsics.d(this.b, a77Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f351a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("HideErrorSnackBar(title=", this.f351a, ", subTitle=", this.b, Separators.RPAREN);
    }
}
