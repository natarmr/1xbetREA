package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class nzz implements g100 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24395a;

    public nzz(String str) {
        d4d d4dVar = d4d.PRIMARY;
        d4d d4dVar2 = d4d.PRIMARY;
        str.getClass();
        this.f24395a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nzz) || !Intrinsics.d(this.f24395a, ((nzz) obj).f24395a)) {
            return false;
        }
        d4d d4dVar = d4d.PRIMARY;
        d4d d4dVar2 = d4d.PRIMARY;
        return true;
    }

    public final int hashCode() {
        return d4d.BACKGROUND_CONTENT.hashCode() + dw9.b(d4d.STATIC_YELLOW, this.f24395a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "LimitsNeAcceptInfoUiModel(text=" + this.f24395a + ", iconColor=" + d4d.STATIC_YELLOW + ", backgroundColor=" + d4d.BACKGROUND_CONTENT + Separators.RPAREN;
    }
}
