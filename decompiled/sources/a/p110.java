package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p110 implements f210 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26178a;

    public final boolean equals(Object obj) {
        if (obj instanceof p110) {
            return Intrinsics.d(this.f26178a, ((p110) obj).f26178a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26178a.hashCode();
    }

    public final String toString() {
        return kng0.l("BestHeroesPlayerClick(value=", this.f26178a, Separators.RPAREN);
    }
}
