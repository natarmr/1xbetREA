package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a72 implements b72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f344a;

    public a72(String str) {
        str.getClass();
        this.f344a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a72) && Intrinsics.d(this.f344a, ((a72) obj).f344a);
    }

    public final int hashCode() {
        return this.f344a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowMessage(message=", this.f344a, Separators.RPAREN);
    }
}
