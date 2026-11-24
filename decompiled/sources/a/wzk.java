package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wzk implements b0l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0l f40024a;

    public wzk(n0l n0lVar) {
        n0lVar.getClass();
        this.f40024a = n0lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wzk) && Intrinsics.d(this.f40024a, ((wzk) obj).f40024a);
    }

    public final int hashCode() {
        return this.f40024a.hashCode();
    }

    public final String toString() {
        return "SetState(dominoModel=" + this.f40024a + Separators.RPAREN;
    }
}
