package a;

/* JADX INFO: loaded from: classes3.dex */
public final class cih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7d0 f4414a;

    public cih(q7d0 q7d0Var, byte b) {
        switch (b) {
            case 1:
                this.f4414a = q7d0Var;
                break;
            case 2:
                q7d0Var.getClass();
                this.f4414a = q7d0Var;
                break;
            default:
                q7d0Var.getClass();
                this.f4414a = q7d0Var;
                break;
        }
    }

    public uzc a() {
        return new uzc(this.f4414a);
    }

    public zyt b() {
        return new zyt(a());
    }

    public k7u c() {
        return new k7u(a());
    }

    public zyt d() {
        return new zyt(a());
    }
}
