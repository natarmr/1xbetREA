package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jle0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16713a;
    public final String b;

    public jle0(String str, String str2) {
        str.getClass();
        this.f16713a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jle0)) {
            return false;
        }
        jle0 jle0Var = (jle0) obj;
        return Intrinsics.d(this.f16713a, jle0Var.f16713a) && this.b.equals(jle0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16713a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("RefereeTourInfoDataModel(id=", this.f16713a, ", title=", this.b, Separators.RPAREN);
    }
}
