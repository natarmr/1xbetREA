package a;

import android.hardware.camera2.params.InputConfiguration;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class j03 implements m9a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15663a;
    public final lrm0 b;
    public final tz9 c;

    public j03(qcq0 qcq0Var, lrm0 lrm0Var, tz9 tz9Var, byte b) {
        this.f15663a = b;
        qcq0Var.getClass();
        switch (b) {
            case 1:
                this.b = lrm0Var;
                this.c = tz9Var;
                break;
            default:
                this.b = lrm0Var;
                this.c = tz9Var;
                break;
        }
    }

    @Override // a.m9a
    public final l9a a(yy9 yy9Var, Map map, r9a r9aVar) {
        boolean zO;
        byte b = this.f15663a;
        lrm0 lrm0Var = this.b;
        tz9 tz9Var = this.c;
        switch (b) {
            case 0:
                m2a m2aVar = m2a.g;
                yy9Var.getClass();
                map.getClass();
                r9aVar.getClass();
                ArrayList arrayList = tz9Var.d;
                if (arrayList != null) {
                    gf80 gf80Var = (gf80) CollectionsKt.v0(((ffx) CollectionsKt.v0(arrayList)).f9465a.f7123a);
                    InputConfiguration inputConfiguration = new InputConfiguration(gf80Var.f11196a.getWidth(), gf80Var.f11196a.getHeight(), gf80Var.b);
                    ArrayList arrayList2 = new ArrayList(map.size());
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        arrayList2.add((Surface) ((Map.Entry) it.next()).getValue());
                    }
                    if (!yy9Var.y(inputConfiguration, arrayList2, r9aVar)) {
                        Log.w("CXCP", "Failed to create reprocessable captures session from " + yy9Var + " for " + r9aVar + '!');
                        r9aVar.a();
                        return m2aVar;
                    }
                } else {
                    ArrayList arrayList3 = new ArrayList(map.size());
                    Iterator it2 = map.entrySet().iterator();
                    while (it2.hasNext()) {
                        arrayList3.add((Surface) ((Map.Entry) it2.next()).getValue());
                    }
                    if (!yy9Var.l(arrayList3, r9aVar)) {
                        Log.w("CXCP", "Failed to create captures session from " + yy9Var + " for " + r9aVar + '!');
                        r9aVar.a();
                        return m2aVar;
                    }
                }
                jo20 jo20VarI = j2e.I(map, lrm0Var);
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                return new k9a(lunVar, jo20VarI);
            default:
                m2a m2aVar2 = m2a.g;
                yy9Var.getClass();
                map.getClass();
                r9aVar.getClass();
                te80 te80VarH = j2e.H(tz9Var, lrm0Var, map);
                ArrayList arrayList4 = te80VarH.f33807a;
                if (arrayList4.isEmpty()) {
                    Log.w("CXCP", "Failed to create OutputConfigurations for " + tz9Var);
                    r9aVar.a();
                    return m2aVar2;
                }
                ArrayList arrayList5 = tz9Var.d;
                if (arrayList5 == null) {
                    zO = yy9Var.w(arrayList4, r9aVar);
                } else {
                    gf80 gf80Var2 = (gf80) CollectionsKt.v0(((ffx) CollectionsKt.v0(arrayList5)).f9465a.f7123a);
                    zO = yy9Var.O(new kex(gf80Var2.f11196a.getWidth(), gf80Var2.f11196a.getHeight(), gf80Var2.b), arrayList4, r9aVar);
                }
                if (zO) {
                    lun lunVar2 = lun.f20680a;
                    lunVar2.getClass();
                    return new k9a(lunVar2, te80VarH.d);
                }
                Log.w("CXCP", "Failed to create capture session from " + yy9Var + " for " + r9aVar + '!');
                r9aVar.a();
                return m2aVar2;
        }
    }
}
