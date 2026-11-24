package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t6r implements tdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33432a;
    public final /* synthetic */ fuo b;

    public /* synthetic */ t6r(fuo fuoVar, byte b) {
        this.f33432a = b;
        this.b = fuoVar;
    }

    @Override // a.tdr
    public final Object apply(Object obj) {
        byte b = this.f33432a;
        fuo fuoVar = this.b;
        switch (b) {
            case 0:
                x6r x6rVar = (x6r) fuoVar;
                lbs0 lbs0Var = (lbs0) obj;
                if (lbs0Var == null) {
                    return null;
                }
                if ((x6rVar.b & 2048) == 0 || !jyc.e(lbs0Var.g)) {
                    return lbs0Var;
                }
                return null;
            default:
                iv40 iv40Var = (iv40) fuoVar;
                lbs0 lbs0Var2 = (lbs0) obj;
                if (lbs0Var2 == null) {
                    return null;
                }
                if ((iv40Var.b & 1024) == 0 || !jyc.e(lbs0Var2.g)) {
                    return lbs0Var2;
                }
                return null;
        }
    }
}
