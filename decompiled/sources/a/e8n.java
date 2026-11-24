package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e8n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7382a;
    public final o0x b;
    public final f6m c;
    public final d8n d;
    public final d8n e;
    public final i8n f;
    public final a4x g;
    public final boolean h;

    public e8n(String str, o0x o0xVar, f6m f6mVar, d8n d8nVar, d8n d8nVar2, i8n i8nVar, a4x a4xVar, boolean z) {
        a4xVar.getClass();
        this.f7382a = str;
        this.b = o0xVar;
        this.c = f6mVar;
        this.d = d8nVar;
        this.e = d8nVar2;
        this.f = i8nVar;
        this.g = a4xVar;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8n)) {
            return false;
        }
        e8n e8nVar = (e8n) obj;
        return Intrinsics.d(this.f7382a, e8nVar.f7382a) && this.b.equals(e8nVar.b) && this.c.equals(e8nVar.c) && this.d.equals(e8nVar.d) && this.e.equals(e8nVar.e) && this.f.equals(e8nVar.f) && Intrinsics.d(this.g, e8nVar.g) && this.h == e8nVar.h;
    }

    public final int hashCode() {
        String str = this.f7382a;
        return Boolean.hashCode(this.h) + cs0.b(this.g, (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + w6x.d(this.b, (str == null ? 0 : str.hashCode()) * 31, 31)) * 31)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DsUfcGameHeaderUiModel(title=");
        sb.append(this.f7382a);
        sb.append(", gameIcon=");
        sb.append(this.b);
        sb.append(", tournamentBadge=");
        sb.append(this.c);
        sb.append(", fighterLeft=");
        sb.append(this.d);
        sb.append(", fighterRight=");
        sb.append(this.e);
        sb.append(", score=");
        sb.append(this.f);
        sb.append(", statsRows=");
        return rz4.m(sb, this.g, ", supportRtl=", this.h, Separators.RPAREN);
    }
}
