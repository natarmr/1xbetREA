package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pp5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27360a;

    public /* synthetic */ pp5(String str) {
        this.f27360a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pp5) {
            return Intrinsics.d(this.f27360a, ((pp5) obj).f27360a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27360a.hashCode();
    }

    public final String toString() {
        return kng0.l("Title(value=", this.f27360a, Separators.RPAREN);
    }
}
