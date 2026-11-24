package a;

/* JADX INFO: loaded from: classes.dex */
public final class vh9 implements th9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37418a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.th9
    public final boolean a(drg0 drg0Var) {
        switch (this.f37418a) {
            case 0:
                return !(drg0Var instanceof brg0) || ((brg0) drg0Var).getChildren().size() == 0;
            case 1:
                return drg0Var.b == null;
            default:
                return false;
        }
    }

    public final String toString() {
        switch (this.f37418a) {
            case 0:
                return "empty";
            case 1:
                return "root";
            default:
                return "target";
        }
    }
}
