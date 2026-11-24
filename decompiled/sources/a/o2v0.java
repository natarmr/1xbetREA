package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class o2v0 {
    public static final n2v0 Companion = new n2v0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24550a;
    public final String b;

    public /* synthetic */ o2v0(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f24550a = null;
        } else {
            this.f24550a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2v0)) {
            return false;
        }
        o2v0 o2v0Var = (o2v0) obj;
        return Intrinsics.d(this.f24550a, o2v0Var.f24550a) && Intrinsics.d(this.b, o2v0Var.b);
    }

    public final int hashCode() {
        String str = this.f24550a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("WebCaptchaInfo(type=", this.f24550a, ", token=", this.b, Separators.RPAREN);
    }
}
