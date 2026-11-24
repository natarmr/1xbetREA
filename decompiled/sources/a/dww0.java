package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class dww0 extends oww0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6819a;

    public dww0(long j) {
        this.f6819a = j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        oww0 oww0Var = (oww0) obj;
        if (zza() != oww0Var.zza()) {
            return zza() - oww0Var.zza();
        }
        long jAbs = Math.abs(this.f6819a);
        long jAbs2 = Math.abs(((dww0) oww0Var).f6819a);
        if (jAbs < jAbs2) {
            return -1;
        }
        return jAbs > jAbs2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && dww0.class == obj.getClass() && this.f6819a == ((dww0) obj).f6819a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zza()), Long.valueOf(this.f6819a)});
    }

    public final String toString() {
        return Long.toString(this.f6819a);
    }

    @Override // a.oww0
    public final int zza() {
        return oww0.c(this.f6819a >= 0 ? (byte) 0 : (byte) 32);
    }
}
