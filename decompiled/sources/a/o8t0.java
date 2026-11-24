package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o8t0 implements u8t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24849a;

    public o8t0(String str) {
        str.getClass();
        this.f24849a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o8t0) && Intrinsics.d(this.f24849a, ((o8t0) obj).f24849a);
    }

    public final int hashCode() {
        return this.f24849a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnItemWithKeyClick(idKey=", this.f24849a, Separators.RPAREN);
    }
}
