package a;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class aqp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7d0 f1308a;
    public final vby b;
    public final k050 c;
    public final ConcurrentHashMap d;
    public final p7m0 e;

    public aqp0(vby vbyVar, q7d0 q7d0Var) {
        Object obj;
        q7d0Var.getClass();
        vbyVar.getClass();
        this.f1308a = q7d0Var;
        this.b = vbyVar;
        this.c = new k050();
        this.d = new ConcurrentHashMap();
        try {
            String string = q7d0Var.a().getString("PREF_KEY_MY_TEAMS", "");
            if (string == null || string.length() == 0) {
                obj = lun.f20680a;
                obj.getClass();
            } else {
                okx okxVar = okx.f25427a;
                obj = (Map) vbyVar.b(new inv(okxVar, new zw3(okxVar, (byte) 0), (byte) 1), string);
            }
        } catch (Exception unused) {
            obj = lun.f20680a;
            obj.getClass();
        }
        this.e = q7m0.a(obj);
    }
}
