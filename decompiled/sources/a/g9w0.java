package a;

/* JADX INFO: loaded from: classes2.dex */
public final class g9w0 implements ec5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10936a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g9w0(Object obj, byte b) {
        this.f10936a = b;
        this.b = obj;
    }

    @Override // a.ec5
    public final void a(boolean z) {
        byte b = this.f10936a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Boolean boolValueOf = Boolean.valueOf(z);
                jaw0 jaw0Var = ((sav) obj).m;
                jaw0Var.sendMessage(jaw0Var.obtainMessage(1, boolValueOf));
                break;
            default:
                zlt0 zlt0Var = (zlt0) obj;
                if (z) {
                    tlw0 tlw0Var = (tlw0) zlt0Var.b;
                    tlw0Var.c.removeCallbacks(tlw0Var.d);
                }
                break;
        }
    }
}
