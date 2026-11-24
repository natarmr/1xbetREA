package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class uph implements xph {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f36064a;
    public final String b;

    public uph(a4x a4xVar, String str) {
        a4xVar.getClass();
        this.f36064a = a4xVar;
        this.b = str;
    }

    @Override // a.xph
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uph)) {
            return false;
        }
        uph uphVar = (uph) obj;
        return Intrinsics.d(this.f36064a, uphVar.f36064a) && Intrinsics.d(this.b, uphVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.f36064a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CellText(cells=" + this.f36064a + ", timeLabel=" + this.b + Separators.RPAREN;
    }
}
