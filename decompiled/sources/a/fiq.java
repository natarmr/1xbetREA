package a;

/* JADX INFO: loaded from: classes.dex */
public final class fiq {
    public boolean c;
    public int e;
    public long h;
    public final diq i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public eiq f9601a = new eiq();
    public eiq b = new eiq();
    public long d = -9223372036854775807L;
    public float f = -1.0f;
    public float g = -1.0f;

    public fiq(diq diqVar) {
        this.i = diqVar;
    }

    public final long a() {
        if (!this.f9601a.a()) {
            return -9223372036854775807L;
        }
        eiq eiqVar = this.f9601a;
        long j = eiqVar.e;
        if (j == 0) {
            return 0L;
        }
        return eiqVar.f / j;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    public final void b(long j) {
        if (j == this.d) {
            return;
        }
        this.h++;
        this.f9601a.b(j);
        if (this.f9601a.a()) {
            this.c = false;
        } else if (this.d != -9223372036854775807L) {
            if (this.c) {
                eiq eiqVar = this.b;
                long j2 = eiqVar.d;
                if (j2 == 0 ? false : eiqVar.g[(int) ((j2 - 1) % 15)]) {
                    this.b.c();
                    this.b.b(this.d);
                }
            } else {
                this.b.c();
                this.b.b(this.d);
            }
            this.c = true;
            this.b.b(j);
        }
        if (this.c && this.b.a()) {
            eiq eiqVar2 = this.f9601a;
            this.f9601a = this.b;
            this.b = eiqVar2;
            this.c = false;
        }
        this.d = j;
        this.e = this.f9601a.a() ? 0 : this.e + 1;
        c();
    }

    public final void c() {
        float f;
        boolean zA = this.f9601a.a();
        if (zA) {
            eiq eiqVar = this.f9601a;
            long j = eiqVar.e;
            f = (float) (1.0E9d / (j != 0 ? eiqVar.f / j : 0L));
        } else {
            f = this.f;
        }
        float f2 = this.g;
        if (f == f2) {
            return;
        }
        if (f != -1.0f && f2 != -1.0f) {
            if (Math.abs(f - f2) < ((!zA || this.f9601a.f < 5000000000L) ? 1.0f : 0.1f)) {
                return;
            }
        } else if (f == -1.0f && this.e < 30) {
            return;
        }
        this.g = f;
        this.i.c(f);
    }
}
