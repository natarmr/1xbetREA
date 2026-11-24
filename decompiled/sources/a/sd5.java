package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class sd5 implements ud5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32015a;
    public final String b;
    public final boolean c;
    public final int d;

    public sd5(int i, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f32015a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd5)) {
            return false;
        }
        sd5 sd5Var = (sd5) obj;
        return Intrinsics.d(this.f32015a, sd5Var.f32015a) && Intrinsics.d(this.b, sd5Var.b) && this.c == sd5Var.c && this.d == sd5Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + brm0.e(ua80.b(this.f32015a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Video(videoUri=", this.f32015a, ", imageUri=", this.b, ", startVideo=");
        sbN.append(this.c);
        sbN.append(", placeholderColor=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
