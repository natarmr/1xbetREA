package a;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.platform.app.ApplicationLoader;

/* JADX INFO: loaded from: classes2.dex */
public final class gyf implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f12125a;
    public final WeakReference b;

    public gyf(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, ApplicationLoader applicationLoader) {
        this.f12125a = uncaughtExceptionHandler;
        this.b = new WeakReference(applicationLoader);
    }

    public static String a(AssetManager assetManager) {
        Object next;
        Object g0g0Var;
        Object next2;
        Object g0g0Var2;
        String str;
        Method[] methods = assetManager.getClass().getMethods();
        methods.getClass();
        ArrayList arrayList = new ArrayList();
        for (Method method : methods) {
            if (method.getParameterTypes().length == 0) {
                arrayList.add(method);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((Method) next).getName(), "getApkAssets"));
        Method method2 = (Method) next;
        if (method2 != null) {
            try {
                e0g0 e0g0Var = j0g0.b;
                Object objInvoke = method2.invoke(assetManager, null);
                g0g0Var = objInvoke instanceof Object[] ? (Object[]) objInvoke : null;
            } catch (Throwable th) {
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
            if (g0g0Var instanceof g0g0) {
                g0g0Var = null;
            }
            Object[] objArr = (Object[]) g0g0Var;
            if (objArr != null) {
                List listZ = tx3.z(objArr);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : (ArrayList) listZ) {
                    Method[] methods2 = obj.getClass().getMethods();
                    methods2.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    for (Method method3 : methods2) {
                        if (method3.getParameterTypes().length == 0) {
                            arrayList3.add(method3);
                        }
                    }
                    Iterator it2 = arrayList3.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                    } while (!Intrinsics.d(((Method) next2).getName(), "getAssetPath"));
                    Method method4 = (Method) next2;
                    if (method4 == null) {
                        str = null;
                    } else {
                        method4.setAccessible(true);
                        try {
                            e0g0 e0g0Var3 = j0g0.b;
                            Object objInvoke2 = method4.invoke(obj, null);
                            g0g0Var2 = objInvoke2 instanceof String ? (String) objInvoke2 : null;
                        } catch (Throwable th2) {
                            e0g0 e0g0Var4 = j0g0.b;
                            g0g0Var2 = new g0g0(th2);
                        }
                        if (g0g0Var2 instanceof g0g0) {
                            g0g0Var2 = null;
                        }
                        str = (String) g0g0Var2;
                    }
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    return CollectionsKt.b0(arrayList2, Separators.SEMICOLON, null, null, null, 62);
                }
            }
        }
        return null;
    }

    public static Resources.NotFoundException b(int i, Throwable th) {
        if (i < 16) {
            Resources.NotFoundException notFoundException = th instanceof Resources.NotFoundException ? (Resources.NotFoundException) th : null;
            if (notFoundException != null) {
                Regex regex = hyf.f13857a;
                String message = notFoundException.getMessage();
                if (message == null) {
                    message = "";
                }
                if (regex.a(message)) {
                    return notFoundException;
                }
            }
            Throwable cause = th.getCause();
            if (cause != null && cause != th) {
                return b(i + 1, cause);
            }
        }
        return null;
    }

    public static String c(Configuration configuration) {
        return String.format(Locale.US, "loc=%s density=%ddp screen=%dx%d scale=%.2f sdk=%d", Arrays.copyOf(new Object[]{configuration.getLocales().get(0), Integer.valueOf(configuration.densityDpi), Integer.valueOf(configuration.screenWidthDp), Integer.valueOf(configuration.screenHeightDp), Float.valueOf(configuration.fontScale), Integer.valueOf(Build.VERSION.SDK_INT)}, 6));
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Context context;
        thread.getClass();
        th.getClass();
        if (Intrinsics.d(sre0.f32672a.b(th.getClass()).J(), "CannotDeliverBroadcastException")) {
            return;
        }
        Resources.NotFoundException notFoundExceptionB = b(0, th);
        if (notFoundExceptionB != null && (context = (Context) this.b.get()) != null) {
            try {
                e0g0 e0g0Var = j0g0.b;
                Resources resources = context.getResources();
                AssetManager assets = resources.getAssets();
                assets.getClass();
                String strA = a(assets);
                Configuration configuration = resources.getConfiguration();
                configuration.getClass();
                String strC = c(configuration);
                tfq tfqVarA = tfq.a();
                String message = notFoundExceptionB.getMessage();
                if (message == null) {
                    message = "";
                }
                tfqVarA.b(hyf.a("resource_not_found crash: " + message + " cause=" + th.getClass().getName()));
                tfqVarA.b(hyf.a("context: sdk=" + Build.VERSION.SDK_INT + " thread=" + thread.getName()));
                tfqVarA.b(hyf.a("config=".concat(strC)));
                if (strA != null) {
                    tfqVarA.b(hyf.a("apkAssets=".concat(strA)));
                    tfqVarA.d("res_apk_assets", hyf.a(strA));
                }
                tfqVarA.d("res_config", hyf.a(strC));
            } catch (Throwable unused) {
                e0g0 e0g0Var2 = j0g0.b;
            }
        }
        this.f12125a.uncaughtException(thread, th);
    }
}
