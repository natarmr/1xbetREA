package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i4z implements l4z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h4z f14167a;
    public final are b;

    public i4z(h4z h4zVar, are areVar) {
        h4zVar.getClass();
        this.f14167a = h4zVar;
        this.b = areVar;
    }

    @Override // a.l4z
    public final h4z a() {
        return this.f14167a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4z)) {
            return false;
        }
        i4z i4zVar = (i4z) obj;
        return Intrinsics.d(this.f14167a, i4zVar.f14167a) && this.b.equals(i4zVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f14167a.hashCode() * 31);
    }

    public final String toString() {
        return "Line(commonInfo=" + this.f14167a + ", countryModel=" + this.b + Separators.RPAREN;
    }
}
