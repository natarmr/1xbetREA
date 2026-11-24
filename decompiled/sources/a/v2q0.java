package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class v2q0 implements y2q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36699a;

    public v2q0(String str) {
        str.getClass();
        this.f36699a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v2q0) && Intrinsics.d(this.f36699a, ((v2q0) obj).f36699a);
    }

    public final int hashCode() {
        return this.f36699a.hashCode();
    }

    public final String toString() {
        return kng0.l("Link(url=", this.f36699a, Separators.RPAREN);
    }
}
