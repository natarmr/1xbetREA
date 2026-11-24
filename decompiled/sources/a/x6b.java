package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x6b implements d7b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final udl0 f40355a;
    public final String b;

    public x6b(udl0 udl0Var, String str) {
        str.getClass();
        this.f40355a = udl0Var;
        this.b = str;
    }

    @Override // a.d7b
    public final udl0 b() {
        return this.f40355a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6b)) {
            return false;
        }
        x6b x6bVar = (x6b) obj;
        return this.f40355a == x6bVar.f40355a && Intrinsics.d(this.b, x6bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f40355a.hashCode() * 31);
    }

    public final String toString() {
        return "AllMarketsHidden(sportGameType=" + this.f40355a + ", message=" + this.b + Separators.RPAREN;
    }
}
