package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u5m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35102a;
    public final o0x b;
    public final f6m c;
    public final o0x d;
    public final e6m e;
    public final f5m f;
    public final boolean g;

    public u5m(String str, o0x o0xVar, f6m f6mVar, m0x m0xVar, e6m e6mVar, f5m f5mVar, boolean z) {
        str.getClass();
        this.f35102a = str;
        this.b = o0xVar;
        this.c = f6mVar;
        this.d = m0xVar;
        this.e = e6mVar;
        this.f = f5mVar;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5m)) {
            return false;
        }
        u5m u5mVar = (u5m) obj;
        return Intrinsics.d(this.f35102a, u5mVar.f35102a) && this.b.equals(u5mVar.b) && this.c.equals(u5mVar.c) && Intrinsics.d(this.d, u5mVar.d) && Intrinsics.d(this.e, u5mVar.e) && this.f.equals(u5mVar.f) && this.g == u5mVar.g;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + w6x.d(this.b, this.f35102a.hashCode() * 31, 31)) * 31;
        o0x o0xVar = this.d;
        int iHashCode2 = (iHashCode + (o0xVar == null ? 0 : o0xVar.hashCode())) * 31;
        e6m e6mVar = this.e;
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + ((iHashCode2 + (e6mVar != null ? e6mVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DsCyberGameHeaderOneTeamUiModel(teamName=");
        sb.append(this.f35102a);
        sb.append(", gameIcon=");
        sb.append(this.b);
        sb.append(", tournamentBadge=");
        sb.append(this.c);
        sb.append(", gameRulesBadge=");
        sb.append(this.d);
        sb.append(", timer=");
        sb.append(this.e);
        sb.append(", bottomInfo=");
        sb.append(this.f);
        sb.append(", supportRtl=");
        return rw2.p(sb, this.g, Separators.RPAREN);
    }
}
