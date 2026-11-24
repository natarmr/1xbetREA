package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class esj implements sg00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8330a = 0;
    public final /* synthetic */ qfu0 b;

    public /* synthetic */ esj(ft2 ft2Var, qfu0 qfu0Var) {
        this.b = qfu0Var;
    }

    @Override // a.sg00
    public final void invoke(Object obj) {
        byte b = this.f8330a;
        qfu0 qfu0Var = this.b;
        switch (b) {
            case 0:
                kn30 kn30Var = (kn30) ((gt2) obj);
                zz2 zz2Var = kn30Var.p;
                if (zz2Var != null) {
                    androidx.media3.common.b bVar = (androidx.media3.common.b) zz2Var.b;
                    if (bVar.x == -1) {
                        awq awqVarA = bVar.a();
                        awqVarA.v = qfu0Var.f28655a;
                        awqVarA.w = qfu0Var.b;
                        kn30Var.p = new zz2(new androidx.media3.common.b(awqVarA), zz2Var.f45232a, (String) zz2Var.c);
                    }
                }
                int i = qfu0Var.f28655a;
                break;
            default:
                ((ky90) obj).a(qfu0Var);
                break;
        }
    }

    public /* synthetic */ esj(qfu0 qfu0Var) {
        this.b = qfu0Var;
    }
}
