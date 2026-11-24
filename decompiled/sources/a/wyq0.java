package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wyq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39986a;
    public final String b;

    public wyq0(String str, String str2) {
        str.getClass();
        this.f39986a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyq0)) {
            return false;
        }
        wyq0 wyq0Var = (wyq0) obj;
        return Intrinsics.d(this.f39986a, wyq0Var.f39986a) && this.b.equals(wyq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f39986a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("TopBannerImagesModel(image=", this.f39986a, ", imageBigSquare=", this.b, Separators.RPAREN);
    }
}
