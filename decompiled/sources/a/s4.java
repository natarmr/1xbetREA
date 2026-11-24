package a;

/* JADX INFO: loaded from: classes.dex */
public final class s4 extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31580a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s4(String str, byte b) {
        super(str);
        this.f31580a = b;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        byte b = this.f31580a;
        synchronized (this) {
            switch (b) {
                case 0:
                    break;
                default:
                    break;
            }
            return this;
        }
    }
}
