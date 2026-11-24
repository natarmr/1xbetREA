package a;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes.dex */
public final class jtg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLoader f17099a;
    public final rrc b;
    public final iw20 c;

    public jtg0(ClassLoader classLoader, rrc rrcVar) {
        this.f17099a = classLoader;
        this.b = rrcVar;
        this.c = new iw20(classLoader);
    }

    public static final boolean d(jtg0 jtg0Var) throws NoSuchMethodException, ClassNotFoundException {
        Class<?> clsLoadClass = jtg0Var.f17099a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        clsLoadClass.getClass();
        Method method = clsLoadClass.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
        Method method2 = clsLoadClass.getMethod("removeWindowLayoutInfoListener", Consumer.class);
        method.getClass();
        if (!Modifier.isPublic(method.getModifiers())) {
            return false;
        }
        method2.getClass();
        return Modifier.isPublic(method2.getModifiers());
    }

    public final WindowLayoutComponent a() {
        int iA;
        iw20 iw20Var = this.c;
        boolean zB = false;
        zB = false;
        zB = false;
        zB = false;
        zB = false;
        zB = false;
        zB = false;
        zB = false;
        zB = false;
        try {
            ((ClassLoader) iw20Var.f15470a).loadClass("androidx.window.extensions.WindowExtensionsProvider").getClass();
            if (fww.M("WindowExtensionsProvider#getWindowExtensions is not valid", new a7g0(iw20Var, (byte) 7)) && fww.M("WindowExtensions#getWindowLayoutComponent is not valid", new itg0(this, zB ? (byte) 1 : (byte) 0)) && fww.M("FoldingFeature class is not valid", new itg0(this, (byte) 1)) && (iA = sto.a()) >= 1) {
                if (iA == 1) {
                    zB = c();
                } else if (iA < 5) {
                    zB = b();
                } else if (b() && fww.M("DisplayFoldFeature is not valid", new itg0(this, (byte) 3)) && fww.M("SupportedWindowFeatures is not valid", new itg0(this, (byte) 2)) && fww.M("WindowLayoutComponent#getSupportedWindowFeatures is not valid", new itg0(this, (byte) 4))) {
                    zB = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!zB) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final boolean b() {
        if (!c()) {
            return false;
        }
        StringBuilder sb = new StringBuilder("WindowLayoutComponent#addWindowLayoutInfoListener(");
        sb.append(Context.class.getName());
        sb.append(", androidx.window.extensions.core.util.function.Consumer) is not valid");
        return fww.M(sb.toString(), new itg0(this, (byte) 6));
    }

    public final boolean c() {
        return fww.M("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new itg0(this, (byte) 5));
    }
}
