package a;

import android.hardware.camera2.params.DynamicRangeProfiles;
import android.util.Log;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class egn implements dgn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DynamicRangeProfiles f7772a;

    public egn(DynamicRangeProfiles dynamicRangeProfiles) {
        this.f7772a = dynamicRangeProfiles;
    }

    public static Set d(Set set) {
        if (set.isEmpty()) {
            return xun.f41520a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            agn agnVar = (agn) bgn.f2563a.get(Long.valueOf(jLongValue));
            if (agnVar == null && l8x.j0()) {
                Log.w("CXCP", "Dynamic range profile cannot be converted to a DynamicRange object: " + jLongValue);
            }
            if (agnVar != null) {
                linkedHashSet.add(agnVar);
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        setUnmodifiableSet.getClass();
        return setUnmodifiableSet;
    }

    @Override // a.dgn
    public final Set a() {
        Set<Long> supportedProfiles = this.f7772a.getSupportedProfiles();
        supportedProfiles.getClass();
        return d(supportedProfiles);
    }

    @Override // a.dgn
    public final DynamicRangeProfiles b() {
        return this.f7772a;
    }

    @Override // a.dgn
    public final Set c(agn agnVar) {
        agnVar.getClass();
        LinkedHashMap linkedHashMap = bgn.f2563a;
        Long lA = bgn.a(agnVar, this.f7772a);
        if (lA == null) {
            hny.v(agnVar, "DynamicRange is not supported: ");
            return null;
        }
        Set<Long> profileCaptureRequestConstraints = this.f7772a.getProfileCaptureRequestConstraints(lA.longValue());
        profileCaptureRequestConstraints.getClass();
        return d(profileCaptureRequestConstraints);
    }
}
