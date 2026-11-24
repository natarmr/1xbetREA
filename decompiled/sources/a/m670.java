package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class m670 {
    public static final i670 Companion = new i670();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21255a;
    public final l670 b;

    public /* synthetic */ m670(int i, String str, l670 l670Var) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, h670.f12517a.getDescriptor());
            throw null;
        }
        this.f21255a = str;
        this.b = l670Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m670)) {
            return false;
        }
        m670 m670Var = (m670) obj;
        return Intrinsics.d(this.f21255a, m670Var.f21255a) && Intrinsics.d(this.b, m670Var.b);
    }

    public final int hashCode() {
        String str = this.f21255a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        l670 l670Var = this.b;
        return iHashCode + (l670Var != null ? l670Var.hashCode() : 0);
    }

    public final String toString() {
        return "OneXGamesWebClientError(title=" + this.f21255a + ", error=" + this.b + Separators.RPAREN;
    }
}
