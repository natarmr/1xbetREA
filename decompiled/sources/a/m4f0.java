package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m4f0 implements t4f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21168a;

    public m4f0(String str) {
        str.getClass();
        this.f21168a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m4f0) && Intrinsics.d(this.f21168a, ((m4f0) obj).f21168a);
    }

    public final int hashCode() {
        return this.f21168a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowDataFillingError(message=", this.f21168a, Separators.RPAREN);
    }
}
