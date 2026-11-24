package a;

import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public final class a45 implements f0x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eoo0 f206a;
    public final long b;
    public final int c;
    public final Matrix d;
    public final int e;

    public a45(eoo0 eoo0Var, long j, int i, Matrix matrix, int i2) {
        if (eoo0Var == null) {
            hny.u("Null tagBundle");
            throw null;
        }
        this.f206a = eoo0Var;
        this.b = j;
        this.c = i;
        this.d = matrix;
        this.e = i2;
    }

    @Override // a.f0x
    public final int a() {
        return this.c;
    }

    @Override // a.f0x
    public final int c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a45)) {
            return false;
        }
        a45 a45Var = (a45) obj;
        return this.f206a.equals(a45Var.f206a) && this.b == a45Var.b && this.c == a45Var.c && this.d.equals(a45Var.d) && this.e == a45Var.e;
    }

    @Override // a.f0x
    public final eoo0 f() {
        return this.f206a;
    }

    @Override // a.f0x
    public final void g(jko jkoVar) {
        jkoVar.d(this.c);
    }

    @Override // a.f0x
    public final long h() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (this.f206a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return this.e ^ ((((((iHashCode ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableImageInfo{tagBundle=");
        sb.append(this.f206a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", rotationDegrees=");
        sb.append(this.c);
        sb.append(", sensorToBufferTransformMatrix=");
        sb.append(this.d);
        sb.append(", flashState=");
        return rz4.j(this.e, "}", sb);
    }
}
