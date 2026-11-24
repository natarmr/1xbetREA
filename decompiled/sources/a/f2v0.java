package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f2v0 implements g2v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8833a;

    public f2v0(String str) {
        str.getClass();
        this.f8833a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f2v0) && Intrinsics.d(this.f8833a, ((f2v0) obj).f8833a);
    }

    public final int hashCode() {
        return this.f8833a.hashCode();
    }

    public final String toString() {
        return kng0.l("Token(token=", this.f8833a, Separators.RPAREN);
    }
}
