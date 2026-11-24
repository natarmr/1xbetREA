package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wqh0 implements yqh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39590a;

    public wqh0(String str) {
        str.getClass();
        this.f39590a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wqh0) && Intrinsics.d(this.f39590a, ((wqh0) obj).f39590a);
    }

    public final int hashCode() {
        return this.f39590a.hashCode();
    }

    public final String toString() {
        return kng0.l("PromotionSuccessDialog(message=", this.f39590a, Separators.RPAREN);
    }
}
