package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x6c implements h7c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40357a;

    public x6c(String str) {
        str.getClass();
        this.f40357a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x6c) && Intrinsics.d(this.f40357a, ((x6c) obj).f40357a);
    }

    public final int hashCode() {
        return this.f40357a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowBackPressDialog(message=", this.f40357a, Separators.RPAREN);
    }
}
