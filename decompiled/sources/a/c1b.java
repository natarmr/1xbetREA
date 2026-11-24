package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c1b implements h1b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a570 f3566a;

    public final boolean equals(Object obj) {
        if (obj instanceof c1b) {
            return Intrinsics.d(this.f3566a, ((c1b) obj).f3566a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3566a.hashCode();
    }

    public final String toString() {
        return "GameType(value=" + this.f3566a + Separators.RPAREN;
    }
}
