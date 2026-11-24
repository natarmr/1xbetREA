package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class got0 implements o5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11650a;
    public final /* synthetic */ Object b;

    public /* synthetic */ got0(Object obj, byte b) {
        this.f11650a = b;
        this.b = obj;
    }

    @Override // a.o5d0
    public final Object get() {
        byte b = this.f11650a;
        Object obj = this.b;
        switch (b) {
            case 0:
                iot0 iot0Var = (iot0) obj;
                return (b0a) iot0Var.f15131a.invoke(((xz9) iot0Var.d.getValue()).f41744a);
            case 1:
                return ((xz9) ((iot0) obj).d.getValue()).b;
            default:
                return (uq70) ((o5d0) obj).get();
        }
    }
}
