package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wtl implements xtl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hdj f39746a;

    public wtl(hdj hdjVar) {
        hdjVar.getClass();
        this.f39746a = hdjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wtl) && Intrinsics.d(this.f39746a, ((wtl) obj).f39746a);
    }

    public final int hashCode() {
        return this.f39746a.hashCode();
    }

    public final String toString() {
        return "SingleDate(state=" + this.f39746a + Separators.RPAREN;
    }
}
