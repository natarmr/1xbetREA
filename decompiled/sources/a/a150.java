package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a150 implements r150 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f54a;

    public a150(String str) {
        str.getClass();
        this.f54a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a150) && Intrinsics.d(this.f54a, ((a150) obj).f54a);
    }

    public final int hashCode() {
        return this.f54a.hashCode();
    }

    public final String toString() {
        return kng0.l("OnClickAll(key=", this.f54a, Separators.RPAREN);
    }
}
