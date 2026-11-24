package a;

/* JADX INFO: loaded from: classes5.dex */
public abstract class sdo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f32043a = new zfn(new dco0((byte) 2), (byte) 1);

    public static final rdo0 a(mbo0 mbo0Var, bco0 bco0Var, fet fetVar) {
        bco0Var.getClass();
        boolean zG = fetVar.g(mbo0Var) | fetVar.g(bco0Var);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = new rdo0(mbo0Var, bco0Var);
            fetVar.o0(objP);
        }
        return (rdo0) objP;
    }
}
