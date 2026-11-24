package a;

import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i03 implements m9a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lrm0 f13931a;

    public i03(lrm0 lrm0Var, qcq0 qcq0Var) {
        qcq0Var.getClass();
        this.f13931a = lrm0Var;
    }

    @Override // a.m9a
    public final l9a a(yy9 yy9Var, Map map, r9a r9aVar) {
        yy9Var.getClass();
        map.getClass();
        r9aVar.getClass();
        ArrayList arrayList = new ArrayList(map.size());
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((Surface) ((Map.Entry) it.next()).getValue());
        }
        if (yy9Var.S(arrayList, r9aVar)) {
            jo20 jo20VarI = j2e.I(map, this.f13931a);
            lun lunVar = lun.f20680a;
            lunVar.getClass();
            return new k9a(lunVar, jo20VarI);
        }
        Log.w("CXCP", "Failed to create ConstrainedHighSpeedCaptureSession from " + yy9Var + " for " + r9aVar + '!');
        r9aVar.a();
        return m2a.g;
    }
}
