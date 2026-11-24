package a;

/* JADX INFO: loaded from: classes3.dex */
public final class tp9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34319a;
    public final Object b;

    public tp9(j1q0 j1q0Var, byte b) {
        this.f34319a = b;
        switch (b) {
            case 1:
                this.b = j1q0Var;
                break;
            default:
                j1q0Var.getClass();
                this.b = new tp9(j1q0Var, (byte) 1);
                break;
        }
    }

    public final ou9 a() {
        byte b = this.f34319a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((tp9) obj).a();
            default:
                return new ou9((j1q0) obj, (byte) 0);
        }
    }
}
