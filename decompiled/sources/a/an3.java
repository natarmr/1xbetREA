package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class an3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1131a;
    public final String b;

    public an3(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f1131a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an3)) {
            return false;
        }
        an3 an3Var = (an3) obj;
        return Intrinsics.d(this.f1131a, an3Var.f1131a) && Intrinsics.d(this.b, an3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1131a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("AppUpdateVideoBackgroundUriUiModel(videoUri=", this.f1131a, ", previewUri=", this.b, Separators.RPAREN);
    }
}
