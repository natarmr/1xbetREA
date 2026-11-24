package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class wrv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39664a;

    public wrv(String str) {
        str.getClass();
        this.f39664a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wrv) && Intrinsics.d(this.f39664a, ((wrv) obj).f39664a);
    }

    public final int hashCode() {
        return this.f39664a.hashCode();
    }

    public final String toString() {
        return kng0.l("HeaderState(title=", this.f39664a, Separators.RPAREN);
    }
}
