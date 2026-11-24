package a;

/* JADX INFO: loaded from: classes.dex */
public final class ux2 implements abi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f36420a;
    public final /* synthetic */ yjj0 b;

    public ux2(yjj0 yjj0Var) {
        this.b = yjj0Var;
    }

    @Override // a.abi0
    public final void b(zai0 zai0Var, Object obj) {
        if (obj == this.b) {
            this.f36420a = true;
        }
    }
}
