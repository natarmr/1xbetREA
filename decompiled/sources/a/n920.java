package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n920 implements p920 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23117a;

    public n920(String str) {
        str.getClass();
        this.f23117a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n920) && Intrinsics.d(this.f23117a, ((n920) obj).f23117a);
    }

    public final int hashCode() {
        return this.f23117a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowError(message=", this.f23117a, Separators.RPAREN);
    }
}
