package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p62 implements s62 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fql0 f26432a;

    public p62(fql0 fql0Var) {
        fql0Var.getClass();
        this.f26432a = fql0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p62) && Intrinsics.d(this.f26432a, ((p62) obj).f26432a);
    }

    public final int hashCode() {
        return this.f26432a.hashCode();
    }

    public final String toString() {
        return "OnSelectChamp(sportItem=" + this.f26432a + Separators.RPAREN;
    }
}
