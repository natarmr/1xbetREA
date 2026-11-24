package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class m8m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21377a;
    public final w8m b;
    public final String c;
    public final u8m d;

    public m8m(long j, w8m w8mVar, String str, u8m u8mVar) {
        str.getClass();
        this.f21377a = j;
        this.b = w8mVar;
        this.c = str;
        this.d = u8mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8m)) {
            return false;
        }
        m8m m8mVar = (m8m) obj;
        return this.f21377a == m8mVar.f21377a && this.b.equals(m8mVar.b) && Intrinsics.d(this.c, m8mVar.c) && this.d.equals(m8mVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b((this.b.hashCode() + (Long.hashCode(this.f21377a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "DsCyberLeaderBoardCellItemUiModel(id=" + this.f21377a + ", team=" + this.b + ", position=" + this.c + ", value=" + this.d + Separators.RPAREN;
    }
}
