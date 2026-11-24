package a;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class q7x0 extends BroadcastReceiver {
    public static volatile w4p0 b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28272a;

    public /* synthetic */ q7x0(byte b2) {
        this.f28272a = b2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f28272a) {
            case 0:
                String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
                if (stringExtra != null) {
                    if (stringExtra.contains("../") || stringExtra.contains("/..")) {
                        StringBuilder sb = new StringBuilder(stringExtra.length() + 68);
                        sb.append("Got an invalid config package for P/H that includes '..': ");
                        sb.append(stringExtra);
                        sb.append(". Exiting.");
                        Log.w("PhUpdateBroadcastRecv", sb.toString());
                    } else {
                        w4p0 w4p0Var = b;
                        if (w4p0Var != null) {
                            p5x0 p5x0Var = (p5x0) ((ConcurrentHashMap) ((zas0) w4p0Var.b).b).get(stringExtra);
                            if (p5x0Var != null) {
                                p5x0Var.f26426a.b();
                            }
                        } else {
                            Log.w("PhUpdateBroadcastRecv", "No callback registered for P/H UPDATE broadcast. Exiting.");
                        }
                    }
                    break;
                }
                break;
            default:
                yje yjeVar = null;
                Context applicationContext = context != null ? context.getApplicationContext() : null;
                ComponentCallbacks2 componentCallbacks2 = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (componentCallbacks2 != null) {
                    af3 af3Var = componentCallbacks2 instanceof af3 ? (af3) componentCallbacks2 : null;
                    if (af3Var != null) {
                        o5d0 o5d0Var = (o5d0) af3Var.d().get(kdj.class);
                        ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                        if (!(ze3Var instanceof kdj)) {
                            ze3Var = null;
                        }
                        kdj kdjVar = (kdj) ze3Var;
                        if (kdjVar != null) {
                            ls00 ls00Var = kdjVar.f18110a;
                            ls00Var.getClass();
                            sje sjeVar = ls00Var.c;
                            if (sjeVar != null && d5c.R(sjeVar)) {
                                sje sjeVar2 = ls00Var.c;
                                if (sjeVar2 != null) {
                                    d5c.G(sjeVar2, null);
                                }
                                ls00Var.c = null;
                                cpv0 cpv0VarD = cpv0.d(ls00Var.f20556a);
                                cpv0VarD.getClass();
                                std stdVar = cpv0VarD.b.f;
                                xgi0 xgi0Var = cpv0VarD.d.f9946a;
                                xgi0Var.getClass();
                                r8x.T(stdVar, "CancelWorkByName_LocalTimeDiffWorker", xgi0Var, new h5a("LocalTimeDiffWorker", cpv0VarD));
                            }
                            kin0 kin0VarE = qem0.e();
                            rwj rwjVar = tvk.f34603a;
                            sje sjeVarA = d5c.a(kotlin.coroutines.e.c(kin0VarE, dvj.c));
                            ls00Var.c = sjeVarA;
                            qjj.W(sjeVarA, null, null, new ks00(ls00Var, yjeVar, (byte) 0), 3);
                        }
                    }
                    jf4.n(b1j.i(kdj.class, "Cannot create dependency "));
                    break;
                }
                break;
        }
    }
}
