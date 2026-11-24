package a;

/* JADX INFO: loaded from: classes2.dex */
public final class jzx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jzx f17435a = new jzx();
    public static final Integer b;

    static {
        Integer num;
        Integer num2 = null;
        try {
            Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            num = obj instanceof Integer ? (Integer) obj : null;
        } catch (Throwable unused) {
        }
        if (num != null && num.intValue() > 0) {
            num2 = num;
        }
        b = num2;
    }
}
