package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class hlk0 implements ilk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13266a;

    public hlk0(String str) {
        str.getClass();
        this.f13266a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hlk0) && Intrinsics.d(this.f13266a, ((hlk0) obj).f13266a);
    }

    public final int hashCode() {
        return this.f13266a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnSortOptionClicked(sortingOptionName=", this.f13266a, Separators.RPAREN);
    }
}
