package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class lt90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20622a;
    public final String b;

    public lt90(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f20622a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt90)) {
            return false;
        }
        lt90 lt90Var = (lt90) obj;
        return Intrinsics.d(this.f20622a, lt90Var.f20622a) && Intrinsics.d(this.b, lt90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f20622a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("PictureCaptureStateModel(errorText=", this.f20622a, ", userInput=", this.b, Separators.RPAREN);
    }
}
