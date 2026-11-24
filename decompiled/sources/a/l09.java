package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l09 implements y09 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19187a;

    public l09(String str) {
        str.getClass();
        this.f19187a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l09) && Intrinsics.d(this.f19187a, ((l09) obj).f19187a);
    }

    public final int hashCode() {
        return this.f19187a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnBrandClick(brandId=", this.f19187a, Separators.RPAREN);
    }
}
