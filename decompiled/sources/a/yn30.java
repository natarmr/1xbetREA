package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yn30 implements rbe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42918a;
    public final /* synthetic */ zhl b;
    public final /* synthetic */ wn00 c;
    public final /* synthetic */ in30 d;

    public /* synthetic */ yn30(zhl zhlVar, wn00 wn00Var, in30 in30Var, byte b) {
        this.f42918a = b;
        this.b = zhlVar;
        this.c = wn00Var;
        this.d = in30Var;
    }

    @Override // a.rbe
    public final void accept(Object obj) {
        byte b = this.f42918a;
        in30 in30Var = this.d;
        wn00 wn00Var = this.c;
        zhl zhlVar = this.b;
        bo30 bo30Var = (bo30) obj;
        switch (b) {
            case 0:
                bo30Var.r(zhlVar.f44398a, zhlVar.b, wn00Var, in30Var);
                break;
            default:
                bo30Var.j(zhlVar.f44398a, zhlVar.b, wn00Var, in30Var);
                break;
        }
    }
}
