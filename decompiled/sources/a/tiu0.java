package a;

/* JADX INFO: loaded from: classes4.dex */
public final class tiu0 extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34023a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tiu0() {
        super("ViewModelStoreOwner не предоставлен");
        this.f34023a = (byte) 0;
    }

    public static tiu0 a(int i, String str, int i2, String str2) {
        return new tiu0(d(i, str, i2, str2), (byte) 3);
    }

    public static tiu0 b(int i, String str, String str2) {
        return new tiu0(d(i, str, i + 1, str2), (byte) 3);
    }

    public static String d(int i, String str, int i2, String str2) {
        if (i2 < 0) {
            i2 = str2.length();
        }
        StringBuilder sbT = brm0.t(str, ": ");
        if (i > 8) {
            sbT.append("...");
            sbT.append((CharSequence) str2, i - 5, i);
        } else {
            sbT.append((CharSequence) str2, 0, i);
        }
        sbT.append('[');
        sbT.append(str2.substring(i, i2));
        sbT.append(']');
        if (str2.length() - i2 > 8) {
            sbT.append((CharSequence) str2, i2, i2 + 5);
            sbT.append("...");
        } else {
            sbT.append((CharSequence) str2, i2, str2.length());
        }
        return sbT.toString();
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.f34023a) {
            case 3:
                synchronized (this) {
                }
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tiu0(String str, Throwable th, byte b) {
        super(str, th);
        this.f34023a = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tiu0(Throwable th) {
        super(th);
        this.f34023a = (byte) 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tiu0(String str, byte b) {
        super(str);
        this.f34023a = b;
    }
}
