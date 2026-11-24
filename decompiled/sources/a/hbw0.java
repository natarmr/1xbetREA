package a;

/* JADX INFO: loaded from: classes2.dex */
public final class hbw0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12793a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ dqw0 d;

    public /* synthetic */ hbw0(dqw0 dqw0Var, String str, long j, byte b) {
        this.f12793a = b;
        this.b = str;
        this.c = j;
        this.d = dqw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f12793a;
        long j = this.c;
        String str = this.b;
        dqw0 dqw0Var = this.d;
        switch (b) {
            case 0:
                dqw0Var.m1();
                s0x.E(str);
                gx3 gx3Var = dqw0Var.d;
                if (gx3Var.isEmpty()) {
                    dqw0Var.e = j;
                }
                Integer num = (Integer) gx3Var.get(str);
                if (num != null) {
                    gx3Var.put(str, Integer.valueOf(num.intValue() + 1));
                } else if (gx3Var.c < 100) {
                    gx3Var.put(str, 1);
                    dqw0Var.c.put(str, Long.valueOf(j));
                } else {
                    uuw0 uuw0Var = ((kxw0) dqw0Var.b).f;
                    kxw0.g(uuw0Var);
                    uuw0Var.j.a("Too many ads visible");
                }
                break;
            default:
                dqw0Var.m1();
                s0x.E(str);
                gx3 gx3Var2 = dqw0Var.d;
                Integer num2 = (Integer) gx3Var2.get(str);
                kxw0 kxw0Var = (kxw0) dqw0Var.b;
                if (num2 == null) {
                    uuw0 uuw0Var2 = kxw0Var.f;
                    kxw0.g(uuw0Var2);
                    uuw0Var2.g.b(str, "Call to endAdUnitExposure for unknown ad unit id");
                } else {
                    c2x0 c2x0Var = kxw0Var.l;
                    uuw0 uuw0Var3 = kxw0Var.f;
                    kxw0.f(c2x0Var);
                    r1x0 r1x0VarP1 = c2x0Var.p1(false);
                    int iIntValue = num2.intValue() - 1;
                    if (iIntValue != 0) {
                        gx3Var2.put(str, Integer.valueOf(iIntValue));
                    } else {
                        gx3Var2.remove(str);
                        gx3 gx3Var3 = dqw0Var.c;
                        Long l = (Long) gx3Var3.get(str);
                        if (l == null) {
                            kxw0.g(uuw0Var3);
                            uuw0Var3.g.a("First ad unit exposure time was never set");
                        } else {
                            long jLongValue = j - l.longValue();
                            gx3Var3.remove(str);
                            dqw0Var.r1(str, jLongValue, r1x0VarP1);
                        }
                        if (gx3Var2.isEmpty()) {
                            long j2 = dqw0Var.e;
                            if (j2 != 0) {
                                dqw0Var.q1(j - j2, r1x0VarP1);
                                dqw0Var.e = 0L;
                            } else {
                                kxw0.g(uuw0Var3);
                                uuw0Var3.g.a("First ad exposure time was never set");
                            }
                        }
                    }
                }
                break;
        }
    }
}
