package a;

/* JADX INFO: loaded from: classes2.dex */
public final class xqp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41333a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public xqp(boolean z, int i) {
        this.f41333a = z;
        this.b = i;
    }

    public static xqp a(int i) {
        return new xqp(false, i);
    }

    public static xqp b(int i) {
        return new xqp(true, i);
    }
}
