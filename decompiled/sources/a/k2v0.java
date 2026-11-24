package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k2v0 implements l2v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17591a;

    public k2v0(String str) {
        str.getClass();
        this.f17591a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k2v0) && Intrinsics.d(this.f17591a, ((k2v0) obj).f17591a);
    }

    public final int hashCode() {
        return this.f17591a.hashCode();
    }

    public final String toString() {
        return kng0.l("Token(token=", this.f17591a, Separators.RPAREN);
    }
}
