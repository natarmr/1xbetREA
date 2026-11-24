package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bnf implements r6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2881a;

    public final boolean equals(Object obj) {
        if (obj instanceof bnf) {
            return this.f2881a == ((bnf) obj).f2881a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2881a);
    }

    public final String toString() {
        return defpackage.c.d("NeedExtraMargin(value=", Separators.RPAREN, this.f2881a);
    }
}
