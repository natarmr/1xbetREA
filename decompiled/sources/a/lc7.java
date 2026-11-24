package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class lc7 implements mc7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19786a;

    public lc7(String str) {
        str.getClass();
        this.f19786a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lc7) && Intrinsics.d(this.f19786a, ((lc7) obj).f19786a);
    }

    public final int hashCode() {
        return this.f19786a.hashCode();
    }

    public final String toString() {
        return kng0.l("SuccessSale(betId=", this.f19786a, Separators.RPAREN);
    }
}
