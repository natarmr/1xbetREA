package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class ov90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k03 f25914a;
    public static final gle0 b;
    public static final kl5 c;

    static {
        String property = System.getProperty("java.vm.name");
        property.getClass();
        if (property.equals("RoboVM")) {
            f25914a = null;
            b = new gle0();
            c = new kl5();
        } else if (property.equals("Dalvik")) {
            f25914a = new k03((byte) 0);
            b = new rre0((byte) 0);
            c = new wc9();
        } else {
            f25914a = null;
            b = new rre0((byte) 1);
            c = new wc9();
        }
    }
}
