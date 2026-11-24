package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g7c implements h7c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10808a;

    public g7c(String str) {
        str.getClass();
        this.f10808a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g7c) && Intrinsics.d(this.f10808a, ((g7c) obj).f10808a);
    }

    public final int hashCode() {
        return this.f10808a.hashCode();
    }

    public final String toString() {
        return kng0.l("UpdateInputCode(code=", this.f10808a, Separators.RPAREN);
    }
}
