package a;

import android.app.Activity;
import android.graphics.Rect;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class itg0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15352a;
    public final /* synthetic */ jtg0 b;

    public /* synthetic */ itg0(jtg0 jtg0Var, byte b) {
        this.f15352a = b;
        this.b = jtg0Var;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x006a  */
    /* JADX WARN: Code duplicated, block: B:25:0x009f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0116  */
    /* JADX WARN: Code duplicated, block: B:51:0x0163  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e6  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws NoSuchMethodException, ClassNotFoundException {
        boolean z;
        byte b = this.f15352a;
        Class cls = Integer.TYPE;
        Class<?> cls2 = null;
        boolean z2 = false;
        jtg0 jtg0Var = this.b;
        switch (b) {
            case 0:
                Class<?> clsLoadClass = ((ClassLoader) jtg0Var.c.f15470a).loadClass("androidx.window.extensions.WindowExtensions");
                clsLoadClass.getClass();
                Method method = clsLoadClass.getMethod("getWindowLayoutComponent", null);
                Class<?> clsLoadClass2 = jtg0Var.f17099a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                clsLoadClass2.getClass();
                method.getClass();
                return Boolean.valueOf(Modifier.isPublic(method.getModifiers()) && method.getReturnType().equals(clsLoadClass2));
            case 1:
                Class<?> clsLoadClass3 = jtg0Var.f17099a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                clsLoadClass3.getClass();
                Method method2 = clsLoadClass3.getMethod("getBounds", null);
                Method method3 = clsLoadClass3.getMethod("getType", null);
                Method method4 = clsLoadClass3.getMethod("getState", null);
                method2.getClass();
                tre0 tre0Var = sre0.f32672a;
                if (method2.getReturnType().equals(azw.G(tre0Var.b(Rect.class))) && Modifier.isPublic(method2.getModifiers())) {
                    method3.getClass();
                    if (method3.getReturnType().equals(azw.G(tre0Var.b(cls))) && Modifier.isPublic(method3.getModifiers())) {
                        method4.getClass();
                        z = method4.getReturnType().equals(azw.G(tre0Var.b(cls))) && Modifier.isPublic(method4.getModifiers());
                    }
                }
                return Boolean.valueOf(z);
            case 2:
                ClassLoader classLoader = jtg0Var.f17099a;
                Class<?> clsLoadClass4 = classLoader.loadClass("androidx.window.extensions.layout.SupportedWindowFeatures");
                clsLoadClass4.getClass();
                Method method5 = clsLoadClass4.getMethod("getDisplayFoldFeatures", null);
                Type genericReturnType = method5.getGenericReturnType();
                genericReturnType.getClass();
                Type type = ((ParameterizedType) genericReturnType).getActualTypeArguments()[0];
                type.getClass();
                Class cls3 = (Class) type;
                if (Modifier.isPublic(method5.getModifiers()) && method5.getReturnType().equals(List.class)) {
                    Class<?> clsLoadClass5 = classLoader.loadClass("androidx.window.extensions.layout.DisplayFoldFeature");
                    clsLoadClass5.getClass();
                    z = cls3.equals(clsLoadClass5);
                }
                return Boolean.valueOf(z);
            case 3:
                Class<?> clsLoadClass6 = jtg0Var.f17099a.loadClass("androidx.window.extensions.layout.DisplayFoldFeature");
                clsLoadClass6.getClass();
                Method method6 = clsLoadClass6.getMethod("getType", null);
                Method method7 = clsLoadClass6.getMethod("hasProperty", cls);
                Method method8 = clsLoadClass6.getMethod("hasProperties", int[].class);
                method6.getClass();
                if (Modifier.isPublic(method6.getModifiers())) {
                    cls.getClass();
                    if (method6.getReturnType().equals(cls)) {
                        method7.getClass();
                        if (Modifier.isPublic(method7.getModifiers())) {
                            Class cls4 = Boolean.TYPE;
                            cls4.getClass();
                            if (method7.getReturnType().equals(cls4)) {
                                method8.getClass();
                                z = Modifier.isPublic(method8.getModifiers()) && method8.getReturnType().equals(cls4);
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 4:
                ClassLoader classLoader2 = jtg0Var.f17099a;
                Class<?> clsLoadClass7 = classLoader2.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                clsLoadClass7.getClass();
                Method method9 = clsLoadClass7.getMethod("getSupportedWindowFeatures", null);
                method9.getClass();
                if (Modifier.isPublic(method9.getModifiers())) {
                    Class<?> clsLoadClass8 = classLoader2.loadClass("androidx.window.extensions.layout.SupportedWindowFeatures");
                    clsLoadClass8.getClass();
                    z = method9.getReturnType().equals(clsLoadClass8);
                }
                return Boolean.valueOf(z);
            case 5:
                try {
                    Class<?> clsLoadClass9 = ((ClassLoader) jtg0Var.b.b).loadClass("java.util.function.Consumer");
                    clsLoadClass9.getClass();
                    cls2 = clsLoadClass9;
                } catch (ClassNotFoundException unused) {
                }
                if (cls2 != null) {
                    Class<?> clsLoadClass10 = jtg0Var.f17099a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                    clsLoadClass10.getClass();
                    Method method10 = clsLoadClass10.getMethod("addWindowLayoutInfoListener", Activity.class, cls2);
                    Method method11 = clsLoadClass10.getMethod("removeWindowLayoutInfoListener", cls2);
                    method10.getClass();
                    if (Modifier.isPublic(method10.getModifiers())) {
                        method11.getClass();
                        z = Modifier.isPublic(method11.getModifiers());
                    }
                    z2 = z;
                }
                return Boolean.valueOf(z2);
            default:
                return Boolean.valueOf(jtg0.d(jtg0Var));
        }
    }
}
