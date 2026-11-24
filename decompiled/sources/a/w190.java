package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class w190 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38388a;
    public final String b;

    public w190(String str, String str2) {
        this.f38388a = str;
        this.b = str2;
    }

    public static w190 a(w190 w190Var, String str, String str2, int i) {
        if ((i & 1) != 0) {
            str = w190Var.f38388a;
        }
        if ((i & 2) != 0) {
            str2 = w190Var.b;
        }
        w190Var.getClass();
        str.getClass();
        str2.getClass();
        return new w190(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w190)) {
            return false;
        }
        w190 w190Var = (w190) obj;
        return Intrinsics.d(this.f38388a, w190Var.f38388a) && Intrinsics.d(this.b, w190Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f38388a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("PasswordsState(password=", this.f38388a, ", confirmPassword=", this.b, Separators.RPAREN);
    }

    public /* synthetic */ w190() {
        this("", "");
    }
}
