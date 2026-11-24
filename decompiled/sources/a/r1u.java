package a;

/* JADX INFO: loaded from: classes5.dex */
public final class r1u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kym0 f29700a;

    public r1u(kym0 kym0Var, byte b) {
        kym0Var.getClass();
        switch (b) {
            case 1:
                this.f29700a = kym0Var;
                break;
            case 2:
                this.f29700a = kym0Var;
                break;
            default:
                this.f29700a = kym0Var;
                break;
        }
    }

    public i89 a() {
        return new i89(this.f29700a.b.f43316a, (byte) 22);
    }

    public void b(String str) {
        Object value;
        kym0 kym0Var = this.f29700a;
        kym0Var.getClass();
        lym0 lym0Var = kym0Var.c;
        lym0Var.getClass();
        p7m0 p7m0Var = lym0Var.f20869a;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, str));
    }
}
