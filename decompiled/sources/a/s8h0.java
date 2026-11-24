package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s8h0 implements d9h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31800a;

    public s8h0(String str) {
        str.getClass();
        this.f31800a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s8h0) && Intrinsics.d(this.f31800a, ((s8h0) obj).f31800a);
    }

    public final int hashCode() {
        return this.f31800a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnActualDomainLoaded(url=", this.f31800a, Separators.RPAREN);
    }
}
