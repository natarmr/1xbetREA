package a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.util.Log;
import com.airbnb.lottie.LottieAnimationView;
import java.io.FileOutputStream;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ird implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15252a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ird(Object obj, Object obj2, byte b) {
        this.f15252a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ServiceInfo serviceInfo;
        String str;
        String str2;
        int i;
        ComponentName componentNameStartService;
        String str3 = null;
        switch (this.f15252a) {
            case 0:
                krd krdVar = (krd) this.b;
                mrd mrdVar = (mrd) this.c;
                nsd nsdVar = krdVar.b;
                synchronized (nsdVar) {
                    FileOutputStream fileOutputStreamOpenFileOutput = nsdVar.f24046a.openFileOutput(nsdVar.b, 0);
                    try {
                        fileOutputStreamOpenFileOutput.write(mrdVar.f22265a.toString().getBytes("UTF-8"));
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Throwable th) {
                        fileOutputStreamOpenFileOutput.close();
                        throw th;
                    }
                }
                return null;
            case 1:
                Context context = (Context) this.b;
                Intent intent = (Intent) this.c;
                mii0 mii0VarU = mii0.u();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) mii0VarU.e).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (mii0VarU) {
                    try {
                        String str4 = (String) mii0VarU.b;
                        if (str4 != null) {
                            str3 = str4;
                        } else {
                            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            } else if (!context.getPackageName().equals(serviceInfo.packageName) || (str = serviceInfo.name) == null) {
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + Separators.SLASH + serviceInfo.name);
                            } else {
                                if (str.startsWith(Separators.DOT)) {
                                    str2 = context.getPackageName() + serviceInfo.name;
                                    mii0VarU.b = str2;
                                } else {
                                    str2 = serviceInfo.name;
                                    mii0VarU.b = str2;
                                }
                                str3 = str2;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (str3 != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str3));
                    }
                    intent2.setClassName(context.getPackageName(), str3);
                }
                try {
                    if (mii0VarU.z(context)) {
                        componentNameStartService = qjj.X(context, intent2);
                    } else {
                        componentNameStartService = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentNameStartService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i = Response.NOT_FOUND;
                    } else {
                        i = -1;
                    }
                } catch (IllegalStateException e) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e);
                    i = Response.PAYMENT_REQUIRED;
                } catch (SecurityException e2) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
                    i = Response.UNAUTHORIZED;
                }
                return Integer.valueOf(i);
            case 2:
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.b;
                String str5 = (String) this.c;
                z910 z910Var = LottieAnimationView.q;
                if (!lottieAnimationView.m) {
                    return ka10.b(lottieAnimationView.getContext(), str5, null);
                }
                Context context2 = lottieAnimationView.getContext();
                HashMap map = ka10.f17941a;
                return ka10.b(context2, str5, "asset_" + str5);
            default:
                AtomicReference atomicReference = (AtomicReference) this.b;
                Function0 function0 = (Function0) this.c;
                function0.getClass();
                psg0.f27514a.set(Boolean.TRUE);
                atomicReference.set(Thread.currentThread());
                try {
                    return function0.invoke();
                } finally {
                    ThreadLocal threadLocal = psg0.f27514a;
                    psg0.f27514a.remove();
                }
        }
    }
}
