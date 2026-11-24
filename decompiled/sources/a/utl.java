package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class utl implements xtl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jej f36260a;

    public utl(jej jejVar) {
        jejVar.getClass();
        this.f36260a = jejVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof utl) && Intrinsics.d(this.f36260a, ((utl) obj).f36260a);
    }

    public final int hashCode() {
        return this.f36260a.hashCode();
    }

    public final String toString() {
        return "DateRange(state=" + this.f36260a + Separators.RPAREN;
    }
}
