package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gls0 implements oz5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11510a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gls0(Object obj, byte b) {
        this.f11510a = b;
        this.b = obj;
    }

    @Override // a.oz5
    public final void a() {
        byte b = this.f11510a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((hls0) obj).k = true;
                break;
            case 1:
                ((hls0) obj).k = true;
                break;
            case 2:
                ((hls0) obj).k = true;
                break;
            default:
                tz5 tz5Var = (tz5) obj;
                boolean z = tz5Var.r.l() == 1.0f;
                if (z != tz5Var.x) {
                    tz5Var.x = z;
                    tz5Var.o.invalidateSelf();
                }
                break;
        }
    }
}
