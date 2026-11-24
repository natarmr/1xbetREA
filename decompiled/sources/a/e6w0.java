package a;

/* JADX INFO: loaded from: classes2.dex */
public final class e6w0 {
    public final bnk b;
    public final Object d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7307a = 1;
    public final Object c = new Object();

    public e6w0(bnk bnkVar, yg60 yg60Var) {
        this.d = yg60Var;
        this.b = bnkVar;
    }

    public final void a(u6w0 u6w0Var) {
        byte b = this.f7307a;
        boolean z = false;
        bnk bnkVar = this.b;
        switch (b) {
            case 0:
                bnkVar.execute(new lfr(this, u6w0Var, z, (byte) 19));
                break;
            case 1:
                if (!u6w0Var.d()) {
                    bnkVar.execute(new mfr(this, u6w0Var, z, (byte) 17));
                }
                break;
            default:
                if (u6w0Var.d()) {
                    bnkVar.execute(new lfr(this, u6w0Var, z, (byte) 20));
                }
                break;
        }
    }

    public e6w0(bnk bnkVar, fh60 fh60Var) {
        this.d = fh60Var;
        this.b = bnkVar;
    }

    public e6w0(bnk bnkVar, nh60 nh60Var) {
        this.d = nh60Var;
        this.b = bnkVar;
    }
}
