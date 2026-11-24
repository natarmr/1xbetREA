package a;

/* JADX INFO: loaded from: classes.dex */
public final class luc implements ixg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ixg0 f20667a;
    public final boolean b;
    public boolean c;
    public final /* synthetic */ muc d;

    public luc(muc mucVar, ixg0 ixg0Var, boolean z) {
        this.d = mucVar;
        this.f20667a = ixg0Var;
        this.b = z;
    }

    @Override // a.ixg0
    public final int a() {
        int iA = this.f20667a.a();
        if (this.d.i != Long.MIN_VALUE) {
            iA |= 1;
        }
        return this.b ? (iA & (-3)) | 4 : iA;
    }

    @Override // a.ixg0
    public final int b(hsj hsjVar, wkj wkjVar, int i) {
        muc mucVar = this.d;
        if (mucVar.i()) {
            return -3;
        }
        if (this.c) {
            wkjVar.b = 4;
            return -4;
        }
        long jS = mucVar.s();
        int iB = this.f20667a.b(hsjVar, wkjVar, i);
        if (mucVar.g != -9223372036854775807L && iB != -3) {
            mucVar.g = -9223372036854775807L;
        }
        if (iB != -5) {
            long j = mucVar.i;
            if (j == Long.MIN_VALUE || ((iB != -4 || wkjVar.i < j) && !(iB == -3 && jS == Long.MIN_VALUE && !wkjVar.h))) {
                return iB;
            }
            wkjVar.v();
            wkjVar.b = 4;
            this.c = true;
            return -4;
        }
        long j2 = mucVar.h;
        long j3 = mucVar.i;
        androidx.media3.common.b bVar = (androidx.media3.common.b) hsjVar.b;
        bVar.getClass();
        int i2 = bVar.O;
        int i3 = bVar.N;
        if (i3 != 0 || i2 != 0) {
            if (j2 != 0) {
                i3 = 0;
            }
            if (j3 != Long.MIN_VALUE) {
                i2 = 0;
            }
            awq awqVarA = bVar.a();
            awqVarA.M = i3;
            awqVarA.N = i2;
            hsjVar.b = new androidx.media3.common.b(awqVarA);
        }
        return -5;
    }

    @Override // a.ixg0
    public final void c() {
        this.f20667a.c();
    }

    @Override // a.ixg0
    public final int d(long j) {
        if (this.d.i()) {
            return -3;
        }
        return this.f20667a.d(j);
    }

    @Override // a.ixg0
    public final boolean isReady() {
        return !this.d.i() && this.f20667a.isReady();
    }
}
