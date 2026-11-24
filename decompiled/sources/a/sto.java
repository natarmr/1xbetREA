package a;

import android.util.Log;
import androidx.window.extensions.WindowExtensionsProvider;

/* JADX INFO: loaded from: classes.dex */
public abstract class sto {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f32781a = sre0.f32672a.b(sto.class).J();

    public static int a() {
        String str = f32781a;
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            if (x99.f40499a != t7u0.f33484a) {
                return 0;
            }
            Log.d(str, "Embedding extension version not found");
            return 0;
        } catch (NullPointerException unused2) {
            if (x99.f40499a != t7u0.f33484a) {
                return 0;
            }
            Log.d(str, "Error with Extension implementation");
            return 0;
        } catch (UnsupportedOperationException unused3) {
            if (x99.f40499a != t7u0.f33484a) {
                return 0;
            }
            Log.d(str, "Stub Extension");
            return 0;
        }
    }
}
