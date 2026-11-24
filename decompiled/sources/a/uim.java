package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class uim implements vim {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35738a;

    public uim(String str) {
        str.getClass();
        this.f35738a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uim) && Intrinsics.d(this.f35738a, ((uim) obj).f35738a);
    }

    public final int hashCode() {
        return this.f35738a.hashCode();
    }

    public final String toString() {
        return kng0.l("Title(title=", this.f35738a, Separators.RPAREN);
    }
}
