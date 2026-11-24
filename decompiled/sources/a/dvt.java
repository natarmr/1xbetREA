package a;

/* JADX INFO: loaded from: classes5.dex */
public final class dvt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6760a;
    public final wi9 b;

    public dvt(wi9 wi9Var, byte b) {
        this.f6760a = b;
        wi9Var.getClass();
        switch (b) {
            case 1:
                this.b = wi9Var;
                break;
            default:
                this.b = wi9Var;
                break;
        }
    }

    public final i89 a() {
        byte b = this.f6760a;
        wi9 wi9Var = this.b;
        switch (b) {
            case 0:
                return new i89(wi9Var.b.f26748a, (byte) 22);
            default:
                return new i89(wi9Var.f39203a.b, (byte) 22);
        }
    }
}
