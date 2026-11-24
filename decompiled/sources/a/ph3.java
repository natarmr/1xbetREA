package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ph3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26977a;
    public final String b;

    public ph3(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f26977a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph3)) {
            return false;
        }
        ph3 ph3Var = (ph3) obj;
        return Intrinsics.d(this.f26977a, ph3Var.f26977a) && Intrinsics.d(this.b, ph3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f26977a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("AppStartVideoBackgroundUriUiModel(videoUri=", this.f26977a, ", previewUri=", this.b, Separators.RPAREN);
    }
}
