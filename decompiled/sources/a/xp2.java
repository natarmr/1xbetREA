package a;

import android.os.Bundle;
import android.util.Log;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xp2 implements t29, zp2, izj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yp2 f41248a;

    public /* synthetic */ xp2(yp2 yp2Var) {
        this.f41248a = yp2Var;
    }

    @Override // a.izj
    public void a(p5d0 p5d0Var) {
        yp2 yp2Var = this.f41248a;
        rv00 rv00Var = rv00.s;
        rv00Var.t("AnalyticsConnector now available.");
        vp2 vp2Var = (vp2) p5d0Var.get();
        yqc yqcVar = new yqc(vp2Var, (byte) 11);
        yzn0 yzn0Var = new yzn0();
        wp2 wp2Var = (wp2) vp2Var;
        pek0 pek0VarB = wp2Var.b("clx", yzn0Var);
        if (pek0VarB == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not register AnalyticsConnectorListener with Crashlytics origin.", null);
            }
            pek0VarB = wp2Var.b(CrashHianalyticsData.EVENT_ID_CRASH, yzn0Var);
            if (pek0VarB != null) {
                Log.w("FirebaseCrashlytics", "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.", null);
            }
        }
        if (pek0VarB == null) {
            rv00Var.E("Could not register Firebase Analytics listener; a listener is already registered.", null);
            return;
        }
        rv00Var.t("Registered Firebase Analytics listener.");
        peg0 peg0Var = new peg0((byte) 16, false);
        lhf0 lhf0Var = new lhf0(yqcVar);
        synchronized (yp2Var) {
            try {
                Iterator it = ((ArrayList) yp2Var.f43010a).iterator();
                while (it.hasNext()) {
                    peg0Var.c((i8f) it.next());
                }
                yzn0Var.b = peg0Var;
                yzn0Var.f43523a = lhf0Var;
                yp2Var.c = peg0Var;
                yp2Var.b = lhf0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.t29
    public void c(i8f i8fVar) {
        yp2 yp2Var = this.f41248a;
        synchronized (yp2Var) {
            try {
                if (((t29) yp2Var.c) instanceof onk) {
                    ((ArrayList) yp2Var.f43010a).add(i8fVar);
                }
                ((t29) yp2Var.c).c(i8fVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.zp2
    public void i(Bundle bundle) {
        ((zp2) this.f41248a.b).i(bundle);
    }
}
