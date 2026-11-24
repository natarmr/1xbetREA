package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class xvw0 extends oww0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41582a;

    public xvw0(boolean z) {
        this.f41582a = z;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        oww0 oww0Var = (oww0) obj;
        int iZza = oww0Var.zza();
        int iC = oww0.c((byte) -32);
        if (iC != iZza) {
            return iC - oww0Var.zza();
        }
        return (true != this.f41582a ? 20 : 21) - (true != ((xvw0) oww0Var).f41582a ? 20 : 21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && xvw0.class == obj.getClass() && this.f41582a == ((xvw0) obj).f41582a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(oww0.c((byte) -32)), Boolean.valueOf(this.f41582a)});
    }

    public final String toString() {
        return Boolean.toString(this.f41582a);
    }

    @Override // a.oww0
    public final int zza() {
        return oww0.c((byte) -32);
    }
}
