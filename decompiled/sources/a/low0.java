package a;

/* JADX INFO: loaded from: classes2.dex */
public final class low0 {
    public static final low0 c = new low0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vmw0 f20411a;
    public final s88 b;

    public low0() {
        vmw0 vmw0Var = vmw0.b;
        s88 s88Var = s88.d;
        if (s88Var == null) {
            s88Var = new s88((byte) 12, false);
            s88Var.b = false;
            s88.d = s88Var;
        }
        this.f20411a = vmw0Var;
        this.b = s88Var;
    }

    public final void a(kxq kxqVar) {
        this.f20411a.getClass();
        vmw0.b(kxqVar.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
    }
}
