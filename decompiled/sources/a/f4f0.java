package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f4f0 implements t4f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8912a;

    public f4f0(String str) {
        str.getClass();
        this.f8912a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f4f0) && Intrinsics.d(this.f8912a, ((f4f0) obj).f8912a);
    }

    public final int hashCode() {
        return this.f8912a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenBrowser(url=", this.f8912a, Separators.RPAREN);
    }
}
