package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class if4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14668a;
    public final wul b;

    public if4(String str, wul wulVar) {
        str.getClass();
        this.f14668a = str;
        this.b = wulVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof if4)) {
            return false;
        }
        if4 if4Var = (if4) obj;
        return Intrinsics.d(this.f14668a, if4Var.f14668a) && this.b.equals(if4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f14668a.hashCode() * 31);
    }

    public final String toString() {
        return "AuthLoginSimpleRegistrationUiModel(label=" + this.f14668a + ", button=" + this.b + Separators.RPAREN;
    }
}
