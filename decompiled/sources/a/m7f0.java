package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m7f0 implements n7f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21318a;

    public m7f0(String str) {
        str.getClass();
        this.f21318a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m7f0) && Intrinsics.d(this.f21318a, ((m7f0) obj).f21318a);
    }

    public final int hashCode() {
        return this.f21318a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorDialog(message=", this.f21318a, Separators.RPAREN);
    }
}
