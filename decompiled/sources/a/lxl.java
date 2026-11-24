package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lxl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20819a;
    public final dyl b;
    public final Integer c;
    public final boolean d;
    public final uxl e;
    public final cwl f;

    public /* synthetic */ lxl(long j, dyl dylVar, boolean z, uxl uxlVar, cwl cwlVar, int i) {
        this(j, dylVar, (i & 4) != 0 ? null : 1, (i & 8) != 0 ? false : z, (i & 16) != 0 ? uxl.f36445a : uxlVar, (i & 32) != 0 ? null : cwlVar);
    }

    public static lxl a(lxl lxlVar, uxl uxlVar) {
        long j = lxlVar.f20819a;
        dyl dylVar = lxlVar.b;
        Integer num = lxlVar.c;
        boolean z = lxlVar.d;
        cwl cwlVar = lxlVar.f;
        lxlVar.getClass();
        lxlVar.getClass();
        dylVar.getClass();
        return new lxl(j, dylVar, num, z, uxlVar, cwlVar);
    }

    public final boolean b() {
        uxl uxlVar = uxl.b;
        uxl uxlVar2 = this.e;
        return uxlVar2 == uxlVar || uxlVar2 == uxl.d;
    }

    public final boolean c() {
        uxl uxlVar = uxl.c;
        uxl uxlVar2 = this.e;
        return uxlVar2 == uxlVar || uxlVar2 == uxl.d;
    }

    public final Integer d() {
        if (this.d) {
            return null;
        }
        Integer num = this.c;
        return Integer.valueOf(num != null ? num.intValue() : 2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lxl)) {
            return false;
        }
        lxl lxlVar = (lxl) obj;
        return this.f20819a == lxlVar.f20819a && Intrinsics.d(this.b, lxlVar.b) && Intrinsics.d(this.c, lxlVar.c) && this.d == lxlVar.d && this.e == lxlVar.e && Intrinsics.d(this.f, lxlVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Long.hashCode(this.f20819a) * 31)) * 31;
        Integer num = this.c;
        int iHashCode2 = (this.e.hashCode() + brm0.e((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.d)) * 31;
        cwl cwlVar = this.f;
        return (iHashCode2 + (cwlVar != null ? Integer.hashCode(cwlVar.f5086a.f30883a) : 0)) * 31;
    }

    public final String toString() {
        return "DsChipModel(id=" + this.f20819a + ", type=" + this.b + ", textMaxLines=" + this.c + ", unlimitedLines=" + this.d + ", state=" + this.e + ", counter=" + this.f + ", badgeStyle=null)";
    }

    public lxl(long j, dyl dylVar, Integer num, boolean z, uxl uxlVar, cwl cwlVar) {
        uxlVar.getClass();
        this.f20819a = j;
        this.b = dylVar;
        this.c = num;
        this.d = z;
        this.e = uxlVar;
        this.f = cwlVar;
    }
}
