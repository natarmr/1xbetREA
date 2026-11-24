package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ejx implements fjx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7928a;
    public long b;

    public /* synthetic */ ejx(int i, long j) {
        this.f7928a = i;
        this.b = j;
    }

    public static ejx b(int i, int i2, String str) {
        if (i >= i2) {
            return null;
        }
        long j = 0;
        int i3 = i;
        while (i3 < i2) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j = (j * 10) + ((long) (cCharAt - '0'));
            if (j > 2147483647L) {
                return null;
            }
            i3++;
        }
        if (i3 == i) {
            return null;
        }
        return new ejx(j, i3);
    }

    public static ejx c(guo guoVar, fq80 fq80Var) {
        guoVar.n(fq80Var.f9961a, 0, 8);
        fq80Var.M(0);
        return new ejx(fq80Var.m(), fq80Var.q());
    }

    public synchronized boolean a() {
        return this.f7928a == 0 || System.currentTimeMillis() > this.b;
    }

    public synchronized void d(int i) {
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.f7928a = 0;
            }
            return;
        } else {
            this.f7928a++;
            synchronized (this) {
                this.b = System.currentTimeMillis() + ((i == 429 || (i >= 500 && i < 600)) ? (long) Math.min(Math.pow(2.0d, this.f7928a) + ((long) (Math.random() * 1000.0d)), 1800000.0d) : 86400000L);
            }
            return;
        }
        throw th;
    }

    @Override // a.fjx
    public bjx toInstant() {
        long j = this.b;
        bjx bjxVar = bjx.c;
        bjx bjxVar2 = bjx.c;
        if (j >= bjxVar2.f2725a) {
            bjx bjxVar3 = bjx.d;
            if (j <= bjxVar3.f2725a) {
                long j2 = this.f7928a;
                long j3 = j2 / 1000000000;
                if ((j2 ^ 1000000000) < 0 && j3 * 1000000000 != j2) {
                    j3--;
                }
                long j4 = j + j3;
                if ((j ^ j4) < 0 && (j3 ^ j) >= 0) {
                    return j > 0 ? bjxVar3 : bjxVar2;
                }
                if (j4 >= -31557014167219200L) {
                    if (j4 <= 31556889864403199L) {
                        long j5 = j2 % 1000000000;
                        return new bjx(j4, (int) (j5 + ((((j5 ^ 1000000000) & ((-j5) | j5)) >> 63) & 1000000000)));
                    }
                }
            }
        }
        throw new w4x("The parsed date is outside the range representable by Instant (Unix epoch second " + j + ')');
    }

    public /* synthetic */ ejx(long j, int i) {
        this.b = j;
        this.f7928a = i;
    }
}
