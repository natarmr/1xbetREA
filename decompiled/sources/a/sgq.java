package a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class sgq {
    public static final f03 b = f03.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f32174a = new ConcurrentHashMap();

    public sgq(nfq nfqVar, p5d0 p5d0Var, dgq dgqVar, p5d0 p5d0Var2, RemoteConfigManager remoteConfigManager, hsd hsdVar, SessionManager sessionManager) {
        Bundle bundle;
        if (nfqVar == null) {
            new q3x(new Bundle());
            return;
        }
        mgq mgqVar = nfqVar.c;
        dps0 dps0Var = dps0.s;
        dps0Var.d = nfqVar;
        nfqVar.a();
        dps0Var.p = mgqVar.h;
        dps0Var.f = dgqVar;
        dps0Var.g = p5d0Var2;
        dps0Var.i.execute(new bps0(dps0Var, (byte) 1));
        nfqVar.a();
        Context context = nfqVar.f23449a;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            Log.d("isEnabled", "No perf enable meta data found " + e.getMessage());
            bundle = null;
        }
        q3x q3xVar = bundle != null ? new q3x(bundle) : new q3x();
        remoteConfigManager.setFirebaseRemoteConfigProvider(p5d0Var);
        hsdVar.b = q3xVar;
        hsd.d.f8700a = gut0.a(context);
        hsdVar.c.c(context);
        sessionManager.setApplicationContext(context);
        Boolean boolF = hsdVar.f();
        f03 f03Var = b;
        if (f03Var.f8700a) {
            if (boolF != null ? boolF.booleanValue() : nfq.d().j()) {
                nfqVar.a();
                String strConcat = "Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: ".concat(ieb.S(mgqVar.h, context.getPackageName()).concat("/trends?utm_source=perf-android-sdk&utm_medium=android-ide"));
                if (f03Var.f8700a) {
                    Log.i("FirebasePerformance", strConcat);
                }
            }
        }
    }
}
