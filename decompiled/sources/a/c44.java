package a;

/* JADX INFO: loaded from: classes2.dex */
public class c44 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3706a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c44(String str, String str2) {
        super(str2 != null ? str2.toString() : null);
        this.f3706a = (byte) 13;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.f3706a) {
            case 21:
                synchronized (this) {
                    setStackTrace(new StackTraceElement[0]);
                }
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c44(String str, byte b) {
        super(str);
        this.f3706a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c44(String str, Throwable th, byte b) {
        super(str, th);
        this.f3706a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c44(Throwable th, byte b) {
        super(th);
        this.f3706a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c44(String str) {
        super(str);
        this.f3706a = (byte) 4;
        s0x.F(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c44(String str, Throwable th) {
        super(str, th);
        this.f3706a = (byte) 4;
        s0x.F(str, "Detail message must not be empty");
    }
}
