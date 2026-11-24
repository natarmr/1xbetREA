package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i0i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13949a;
    public final String b;
    public final String c;
    public final n0x d;
    public final m0x e;

    public i0i(long j, String str, String str2, n0x n0xVar, m0x m0xVar) {
        this.f13949a = j;
        this.b = str;
        this.c = str2;
        this.d = n0xVar;
        this.e = m0xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0i)) {
            return false;
        }
        i0i i0iVar = (i0i) obj;
        return this.f13949a == i0iVar.f13949a && this.b.equals(i0iVar.b) && Intrinsics.d(this.c, i0iVar.c) && this.d.equals(i0iVar.d) && this.e.equals(i0iVar.e);
    }

    public final int hashCode() {
        int iB = ua80.b(Long.hashCode(this.f13949a) * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(false) + cs0.a(this.e, f140.f(this.d, (iB + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f13949a, "DSAggregatorTournamentCardTallUiModel(id=", ", title=", this.b);
        sbO.append(", subtitle=");
        sbO.append(this.c);
        sbO.append(", imageLink=");
        sbO.append(this.d);
        sbO.append(", placeholderLink=");
        sbO.append(this.e);
        sbO.append(", titleBlackout=false)");
        return sbO.toString();
    }
}
