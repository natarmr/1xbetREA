package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o6l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ydl0 f24742a;
    public final String b;

    public o6l0(ydl0 ydl0Var, String str) {
        str.getClass();
        this.f24742a = ydl0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6l0)) {
            return false;
        }
        o6l0 o6l0Var = (o6l0) obj;
        return this.f24742a.equals(o6l0Var.f24742a) && Intrinsics.d(this.b, o6l0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f24742a.hashCode() * 31);
    }

    public final String toString() {
        return "SportEventUiModel(image=" + this.f24742a + ", coeff=" + this.b + Separators.RPAREN;
    }
}
