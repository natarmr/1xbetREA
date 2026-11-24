package a;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xcj0 implements t2g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40649a;
    public final /* synthetic */ i3t0 b;

    public /* synthetic */ xcj0(i3t0 i3t0Var, byte b) {
        this.f40649a = b;
        this.b = i3t0Var;
    }

    @Override // a.t2g0
    public final void onResult(Object obj) {
        byte b = this.f40649a;
        i3t0 i3t0Var = this.b;
        switch (b) {
            case 0:
                odj0 odj0Var = (odj0) i3t0Var;
                obj.getClass();
                if ((obj instanceof Boolean ? (Boolean) obj : null) != null) {
                    odj0Var.H(new biz(obj, (byte) 3));
                }
                break;
            default:
                iwk0 iwk0Var = (iwk0) i3t0Var;
                obj.getClass();
                if (obj.equals(Boolean.TRUE)) {
                    iwk0Var.G(tuk0.f34555a);
                }
                break;
        }
    }
}
