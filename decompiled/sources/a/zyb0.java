package a;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class zyb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f45198a = wv00.h("ProcessUtils");

    public static final boolean a(Context context, wsd wsdVar) {
        String strQ;
        Object next;
        context.getClass();
        wsdVar.getClass();
        if (Build.VERSION.SDK_INT >= 28) {
            strQ = ia3.q();
        } else {
            strQ = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, cpv0.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, null);
                objInvoke.getClass();
                if (objInvoke instanceof String) {
                    strQ = (String) objInvoke;
                } else {
                    int iMyPid = Process.myPid();
                    Object systemService = context.getSystemService("activity");
                    systemService.getClass();
                    List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                    if (runningAppProcesses != null) {
                        Iterator<T> it = runningAppProcesses.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((ActivityManager.RunningAppProcessInfo) next).pid != iMyPid);
                        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                        if (runningAppProcessInfo != null) {
                            strQ = runningAppProcessInfo.processName;
                        }
                    }
                }
            } catch (Throwable th) {
                wv00.f().c(f45198a, "Unable to check ActivityThread for processName", th);
            }
        }
        return Intrinsics.d(strQ, context.getApplicationInfo().processName);
    }
}
