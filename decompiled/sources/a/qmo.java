package a;

import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class qmo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hoo f28994a;

    public qmo(hoo hooVar, byte b) {
        switch (b) {
            case 1:
                this.f28994a = hooVar;
                break;
            default:
                hooVar.getClass();
                this.f28994a = hooVar;
                break;
        }
    }

    public Unit a(long j, long j2, long j3, boolean z) {
        vno vnoVar = this.f28994a.f13403a;
        vnoVar.getClass();
        ono onoVar = new ono(j, j3);
        HashMap map = new HashMap();
        map.putAll((Map) vnoVar.a(onoVar).getValue());
        map.put(new Long(j2), Boolean.valueOf(z));
        vnoVar.a(onoVar).o(null, map);
        Unit unit = Unit.f46060a;
        wne wneVar = wne.f39444a;
        return unit;
    }
}
