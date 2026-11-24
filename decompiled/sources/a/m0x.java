package a;

/* JADX INFO: loaded from: classes6.dex */
public final class m0x implements o0x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20977a;
    public final bzw b;

    public m0x(int i, bzw bzwVar, int i2) {
        bzwVar = (i2 & 2) != 0 ? null : bzwVar;
        this.f20977a = i;
        this.b = bzwVar;
    }

    @Override // a.o0x
    public final Integer b() {
        return null;
    }

    @Override // a.o0x
    public final bzw d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0x)) {
            return false;
        }
        m0x m0xVar = (m0x) obj;
        return this.f20977a == m0xVar.f20977a && this.b == m0xVar.b;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f20977a) * 31;
        bzw bzwVar = this.b;
        return (iHashCode + (bzwVar == null ? 0 : bzwVar.hashCode())) * 31;
    }

    public final String toString() {
        return "Res(resId=" + this.f20977a + ", blendMode=" + this.b + ", tintColor=null)";
    }
}
