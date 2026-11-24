package a;

/* JADX INFO: loaded from: classes2.dex */
public final class zsd extends obb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static zsd f44900a;

    public static synchronized zsd q0() {
        zsd zsdVar;
        zsdVar = f44900a;
        if (zsdVar == null) {
            zsdVar = new zsd();
            f44900a = zsdVar;
        }
        return zsdVar;
    }

    @Override // a.obb
    public final String a0() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    @Override // a.obb
    public final String b0() {
        return "experiment_app_start_ttid";
    }
}
