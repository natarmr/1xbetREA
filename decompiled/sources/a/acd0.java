package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class acd0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f622a;

    public /* synthetic */ acd0() {
        this("");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof acd0) && Intrinsics.d(this.f622a, ((acd0) obj).f622a);
    }

    public final int hashCode() {
        return this.f622a.hashCode();
    }

    public final String toString() {
        return kng0.l("Popular(redirectUrl=", this.f622a, Separators.RPAREN);
    }

    public acd0(String str) {
        this.f622a = str;
    }
}
