package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class waf0 implements lbf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38823a;

    public waf0(String str) {
        str.getClass();
        this.f38823a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof waf0) && Intrinsics.d(this.f38823a, ((waf0) obj).f38823a);
    }

    public final int hashCode() {
        return this.f38823a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenBrowser(url=", this.f38823a, Separators.RPAREN);
    }
}
