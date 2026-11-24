package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class glf0 {
    public static final flf0 Companion = new flf0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11488a;
    public final String b;
    public final String c;

    public /* synthetic */ glf0(String str, int i, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f11488a = null;
        } else {
            this.f11488a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof glf0)) {
            return false;
        }
        glf0 glf0Var = (glf0) obj;
        return Intrinsics.d(this.f11488a, glf0Var.f11488a) && Intrinsics.d(this.b, glf0Var.b) && Intrinsics.d(this.c, glf0Var.c);
    }

    public final int hashCode() {
        String str = this.f11488a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(b1j.n("Row(id=", this.f11488a, ", type=", this.b, ", text="), this.c, Separators.RPAREN);
    }
}
