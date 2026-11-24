package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h6m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12536a;
    public final o0x b;
    public final f6m c;
    public final o0x d;
    public final v5m e;
    public final v5m f;
    public final a6m g;
    public final f5m h;
    public final b6m i;
    public final boolean j;

    public h6m(String str, o0x o0xVar, f6m f6mVar, o0x o0xVar2, v5m v5mVar, v5m v5mVar2, a6m a6mVar, f5m f5mVar, b6m b6mVar, boolean z) {
        this.f12536a = str;
        this.b = o0xVar;
        this.c = f6mVar;
        this.d = o0xVar2;
        this.e = v5mVar;
        this.f = v5mVar2;
        this.g = a6mVar;
        this.h = f5mVar;
        this.i = b6mVar;
        this.j = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6m)) {
            return false;
        }
        h6m h6mVar = (h6m) obj;
        return Intrinsics.d(this.f12536a, h6mVar.f12536a) && this.b.equals(h6mVar.b) && this.c.equals(h6mVar.c) && Intrinsics.d(this.d, h6mVar.d) && this.e.equals(h6mVar.e) && this.f.equals(h6mVar.f) && this.g.equals(h6mVar.g) && this.h.equals(h6mVar.h) && Intrinsics.d(this.i, h6mVar.i) && this.j == h6mVar.j;
    }

    public final int hashCode() {
        String str = this.f12536a;
        int iHashCode = (this.c.hashCode() + w6x.d(this.b, (str == null ? 0 : str.hashCode()) * 31, 31)) * 31;
        o0x o0xVar = this.d;
        int iHashCode2 = (this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (o0xVar == null ? 0 : o0xVar.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31;
        b6m b6mVar = this.i;
        return Boolean.hashCode(this.j) + ((iHashCode2 + (b6mVar != null ? b6mVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DsCyberGameHeaderTwoTeamsUiModel(title=" + this.f12536a + ", gameIcon=" + this.b + ", tournamentBadge=" + this.c + ", gameRulesBadge=" + this.d + ", opponentLeft=" + this.e + ", opponentRight=" + this.f + ", score=" + this.g + ", bottomInfo=" + this.h + ", tabs=" + this.i + ", supportRtl=" + this.j + Separators.RPAREN;
    }
}
