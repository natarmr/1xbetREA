package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d8n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5658a;
    public final String b;
    public final n0x c;
    public final boolean d;
    public final String e;

    public d8n(long j, String str, n0x n0xVar, boolean z, String str2) {
        this.f5658a = j;
        this.b = str;
        this.c = n0xVar;
        this.d = z;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d8n)) {
            return false;
        }
        d8n d8nVar = (d8n) obj;
        return this.f5658a == d8nVar.f5658a && this.b.equals(d8nVar.b) && this.c.equals(d8nVar.c) && this.d == d8nVar.d && Intrinsics.d(this.e, d8nVar.e);
    }

    public final int hashCode() {
        int iE = brm0.e(f140.f(this.c, ua80.b(Long.hashCode(this.f5658a) * 31, 31, this.b), 31), 31, this.d);
        String str = this.e;
        return (iE + (str == null ? 0 : str.hashCode())) * 31;
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f5658a, "DsUfcFighterUiModel(id=", ", name=", this.b);
        sbO.append(", photo=");
        sbO.append(this.c);
        sbO.append(", isFavorite=");
        sbO.append(this.d);
        return rw2.o(sbO, ", winnerLabel=", this.e, ", backgroundColor=null)");
    }
}
