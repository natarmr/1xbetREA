package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r5m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0x f29893a;
    public final f6m b;
    public final o0x c;
    public final q5m d;
    public final q5m e;
    public final mpm f;
    public final c8n g;
    public final f5m h;
    public final boolean i;

    public r5m(n0x n0xVar, f6m f6mVar, m0x m0xVar, q5m q5mVar, q5m q5mVar2, mpm mpmVar, c8n c8nVar, f5m f5mVar, boolean z) {
        this.f29893a = n0xVar;
        this.b = f6mVar;
        this.c = m0xVar;
        this.d = q5mVar;
        this.e = q5mVar2;
        this.f = mpmVar;
        this.g = c8nVar;
        this.h = f5mVar;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5m)) {
            return false;
        }
        r5m r5mVar = (r5m) obj;
        return this.f29893a.equals(r5mVar.f29893a) && this.b.equals(r5mVar.b) && Intrinsics.d(this.c, r5mVar.c) && this.d.equals(r5mVar.d) && this.e.equals(r5mVar.e) && this.f.equals(r5mVar.f) && Intrinsics.d(this.g, r5mVar.g) && this.h.equals(r5mVar.h) && this.i == r5mVar.i;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f29893a.hashCode() * 31)) * 31;
        o0x o0xVar = this.c;
        int iE = ohs0.e(this.f, (this.e.hashCode() + ((this.d.hashCode() + ((iHashCode + (o0xVar == null ? 0 : o0xVar.hashCode())) * 31)) * 31)) * 31, 31);
        c8n c8nVar = this.g;
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + ((iE + (c8nVar != null ? c8nVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DsCyberGameHeaderMultiTeamsUiModel(gameIcon=");
        sb.append(this.f29893a);
        sb.append(", tournamentBadge=");
        sb.append(this.b);
        sb.append(", gameRulesBadge=");
        sb.append(this.c);
        sb.append(", firstTeam=");
        sb.append(this.d);
        sb.append(", secondTeam=");
        sb.append(this.e);
        sb.append(", score=");
        sb.append(this.f);
        sb.append(", timer=");
        sb.append(this.g);
        sb.append(", bottomInfo=");
        sb.append(this.h);
        sb.append(", supportRtl=");
        return rw2.p(sb, this.i, Separators.RPAREN);
    }
}
