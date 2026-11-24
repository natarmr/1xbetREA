package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class ap10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uuz f1228a;

    static {
        uuz uuzVar;
        try {
            try {
                uuzVar = new uuz();
            } catch (NoSuchMethodError unused) {
                uuzVar = new uuz();
            }
            f1228a = uuzVar;
        } catch (Exception e) {
            lvm0.n("MDC binding unsuccessful.", e);
        } catch (NoClassDefFoundError e2) {
            f1228a = new uuz();
            String message = e2.getMessage();
            if (message == null || !message.contains("StaticMDCBinder")) {
                throw e2;
            }
            lvm0.m("Failed to load class \"org.slf4j.impl.StaticMDCBinder\".");
            lvm0.m("Defaulting to no-operation MDCAdapter implementation.");
            lvm0.m("See http://www.slf4j.org/codes.html#no_static_mdc_binder for further details.");
        }
    }
}
