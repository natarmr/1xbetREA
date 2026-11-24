package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f6m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0x f9019a;
    public final String b;

    public f6m(m0x m0xVar, String str) {
        str.getClass();
        this.f9019a = m0xVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6m)) {
            return false;
        }
        f6m f6mVar = (f6m) obj;
        return this.f9019a.equals(f6mVar.f9019a) && Intrinsics.d(this.b, f6mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9019a.hashCode() * 31);
    }

    public final String toString() {
        return "DsCyberGameHeaderTournamentBadge(icon=" + this.f9019a + ", label=" + this.b + Separators.RPAREN;
    }
}
