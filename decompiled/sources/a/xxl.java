package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xxl implements dyl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41664a;

    public xxl(String str) {
        str.getClass();
        this.f41664a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xxl) && Intrinsics.d(this.f41664a, ((xxl) obj).f41664a);
    }

    public final int hashCode() {
        return this.f41664a.hashCode();
    }

    public final String toString() {
        return kng0.l("Label(label=", this.f41664a, Separators.RPAREN);
    }
}
