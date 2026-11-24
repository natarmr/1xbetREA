package a;

/* JADX INFO: loaded from: classes4.dex */
public final class a5v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btr f291a;

    public a5v(btr btrVar, byte b) {
        btrVar.getClass();
        switch (b) {
            case 1:
                this.f291a = btrVar;
                break;
            case 2:
                this.f291a = btrVar;
                break;
            case 3:
                this.f291a = btrVar;
                break;
            default:
                this.f291a = btrVar;
                break;
        }
    }

    public void a(mhv0 mhv0Var) {
        btr btrVar = this.f291a;
        btrVar.getClass();
        nhv0 nhv0Var = btrVar.c;
        nhv0Var.getClass();
        if (mhv0Var instanceof khv0) {
            nhv0Var.f23554a.o(null, mhv0Var);
        } else if (mhv0Var instanceof lhv0) {
            nhv0Var.b.o(null, mhv0Var);
        } else {
            t9f.b();
        }
    }
}
