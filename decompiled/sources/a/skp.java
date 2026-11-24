package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class skp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32362a;
    public final rkp b;

    public skp(String str, rkp rkpVar) {
        str.getClass();
        this.f32362a = str;
        this.b = rkpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof skp)) {
            return false;
        }
        skp skpVar = (skp) obj;
        return Intrinsics.d(this.f32362a, skpVar.f32362a) && this.b.equals(skpVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f32362a.hashCode() * 31);
    }

    public final String toString() {
        return "Feedback(dialogId=" + this.f32362a + ", previousFeedback=" + this.b + Separators.RPAREN;
    }
}
