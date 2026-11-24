package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xgw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gx3 f40860a = new gx3(0);
    public static final gx3 b = new gx3(0);

    public static void a(String str) {
        gx3 gx3Var = f40860a;
        synchronized (gx3Var) {
            if (gx3Var.get(str) != null) {
                throw new ClassCastException();
            }
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    public static String b(String str) {
        gx3 gx3Var = f40860a;
        synchronized (gx3Var) {
            if (gx3Var.get(str) != null) {
                throw new ClassCastException();
            }
        }
        return "https://www.googleapis.com/identitytoolkit/v3/relyingparty";
    }
}
