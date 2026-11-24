package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ep40 implements fp40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8169a;

    public ep40(String str) {
        str.getClass();
        this.f8169a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ep40) && Intrinsics.d(this.f8169a, ((ep40) obj).f8169a);
    }

    public final int hashCode() {
        return this.f8169a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorDialog(message=", this.f8169a, Separators.RPAREN);
    }
}
