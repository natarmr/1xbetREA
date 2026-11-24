package a;

/* JADX INFO: loaded from: classes6.dex */
public final class xyu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v6j0 f41723a;

    public xyu(v6j0 v6j0Var, byte b) {
        v6j0Var.getClass();
        switch (b) {
            case 1:
                this.f41723a = v6j0Var;
                break;
            case 2:
                this.f41723a = v6j0Var;
                break;
            default:
                this.f41723a = v6j0Var;
                break;
        }
    }

    public vkq0 a(boolean z) {
        v6j0 v6j0Var = this.f41723a;
        return z ? new vkq0(v6j0Var.d(), v6j0Var.e(), uhq0.c) : new vkq0(v6j0Var.b(), v6j0Var.c(), uhq0.c);
    }
}
