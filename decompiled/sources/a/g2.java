package a;

/* JADX INFO: loaded from: classes2.dex */
public final class g2 extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10538a;

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        switch (this.f10538a) {
            case 0:
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2(String str, byte b) {
        super(str);
        this.f10538a = b;
    }
}
