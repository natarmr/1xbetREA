package a;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public abstract class ak30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MeasurementManager f1004a;

    public ak30(MeasurementManager measurementManager) {
        measurementManager.getClass();
        this.f1004a = measurementManager;
    }

    public static Object b(ak30 ak30Var, yje<? super Integer> yjeVar) {
        n5a n5aVar = new n5a(1, pnx.b(yjeVar));
        n5aVar.r();
        ak30Var.f1004a.getMeasurementApiStatus(new ew3((byte) 1), new bke(n5aVar));
        Object objP = n5aVar.p();
        wne wneVar = wne.f39444a;
        return objP;
    }

    public static Object d(ak30 ak30Var, Uri uri, yje<? super Unit> yjeVar) {
        n5a n5aVar = new n5a(1, pnx.b(yjeVar));
        n5aVar.r();
        ak30Var.f1004a.registerTrigger(uri, new ew3((byte) 1), new bke(n5aVar));
        Object objP = n5aVar.p();
        return objP == wne.f39444a ? objP : Unit.f46060a;
    }

    public Object a(yje<? super Integer> yjeVar) {
        return b(this, yjeVar);
    }

    public Object c(Uri uri, yje<? super Unit> yjeVar) {
        return d(this, uri, yjeVar);
    }
}
