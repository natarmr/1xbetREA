package a;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class h3a implements hmx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12374a;
    public final cbi b;
    public final Object c;
    public Map d;

    public h3a(Context context, cbi cbiVar, Set set) throws nbx {
        context.getClass();
        set.getClass();
        this.f12374a = context;
        cbiVar.getClass();
        this.b = cbiVar;
        this.c = new Object();
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        this.d = lunVar;
        try {
            a(CollectionsKt.L0(set));
        } catch (l3a e) {
            throw new nbx(e);
        }
    }

    @Override // a.hmx
    public final void a(List list) throws l3a {
        List<String> listN0;
        egp oif0Var;
        list.getClass();
        synchronized (this.c) {
            listN0 = CollectionsKt.n0(list, this.d.keySet());
        }
        if (!listN0.isEmpty() && l8x.f0("CXCP")) {
            Log.d("CXCP", "Creating new surface combinations for: " + listN0);
        }
        cbi cbiVar = this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!listN0.isEmpty()) {
            try {
                for (String str : listN0) {
                    zy9 zy9VarA = cbiVar.a();
                    g0a.a(str);
                    c1a c1aVarB = zy9.b(zy9VarA, str);
                    CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                    key.getClass();
                    i2a i2aVar = new i2a(c1aVarB, new erm0((StreamConfigurationMap) ((ow9) c1aVarB).c(key), new cf80(c1aVarB)));
                    Context context = this.f12374a;
                    fwn fwnVar = new fwn(str, i2aVar.a());
                    if (Build.VERSION.SDK_INT >= 35) {
                        m1a m1aVar = (m1a) cbiVar.f4062a.c;
                        x1x.y(m1aVar);
                        oif0Var = new oif0(c1aVarB, m1aVar, i2aVar, (byte) 19);
                    } else {
                        oif0Var = egp.g0;
                    }
                    linkedHashMap.put(str, new hln0(context, c1aVarB, fwnVar, oif0Var));
                }
            } catch (cxk e) {
                throw new l3a("Failed to query camera metadata", e);
            } catch (Exception e2) {
                throw new l3a("Failed to build surface combinations", e2);
            }
        }
        synchronized (this.c) {
            try {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (this.d.containsKey(str2)) {
                        Object obj = this.d.get(str2);
                        obj.getClass();
                        linkedHashMap2.put(str2, obj);
                    }
                }
                linkedHashMap2.putAll(linkedHashMap);
                this.d = linkedHashMap2;
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "Committed new surface combination map. Total cameras: " + linkedHashMap2.size());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
