package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s66 implements w66 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31688a;

    public s66(String str) {
        str.getClass();
        this.f31688a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s66) && Intrinsics.d(this.f31688a, ((s66) obj).f31688a);
    }

    public final int hashCode() {
        return this.f31688a.hashCode();
    }

    public final String toString() {
        return kng0.l("OneOpponent(opponentName=", this.f31688a, Separators.RPAREN);
    }
}
