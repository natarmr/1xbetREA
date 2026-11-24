package a;

/* JADX INFO: loaded from: classes5.dex */
public final class mge0 implements yjj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21739a;
    public final float b;

    public /* synthetic */ mge0(float f, byte b) {
        this.f21739a = b;
        this.b = f;
    }

    @Override // a.yjj0
    public final x1x a(long j, k6z k6zVar, w6k w6kVar) {
        byte b = this.f21739a;
        float f = this.b;
        k6zVar.getClass();
        w6kVar.getClass();
        switch (b) {
            case 0:
                if (f < 0.0f) {
                    f = 0.0f;
                }
                return new oe80(new jge0(0.0f, f, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                if (f < 0.0f) {
                    f = 0.0f;
                }
                return new oe80(new jge0(0.0f, f, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L))));
        }
    }
}
