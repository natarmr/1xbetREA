package a;

import android.os.Build;
import dalvik.system.VMStack;

/* JADX INFO: loaded from: classes2.dex */
public final class wbw0 extends sbw0 {
    public static final uxs0 b;

    static {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            vbw0.class.getName().equals(a());
        } catch (Throwable unused) {
        }
        String str = Build.FINGERPRINT;
        if (str != null) {
            "robolectric".equals(str);
        }
        b = new uxs0((byte) 22);
    }

    public static String a() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }
}
