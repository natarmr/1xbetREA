package a;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class fgn implements dgn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vqc f9499a = new vqc(new fgn(), (byte) 28);
    public static final Set b = cui0.b(agn.d);

    @Override // a.dgn
    public final Set a() {
        return b;
    }

    @Override // a.dgn
    public final DynamicRangeProfiles b() {
        return null;
    }

    @Override // a.dgn
    public final Set c(agn agnVar) {
        agnVar.getClass();
        z1x.t("DynamicRange is not supported: " + agnVar, agn.d.equals(agnVar));
        return b;
    }
}
