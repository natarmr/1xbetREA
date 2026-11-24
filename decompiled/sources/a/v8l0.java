package a;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class v8l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7d0 f36991a;
    public final vby b;
    public final String c;
    public final int d;
    public final p7m0 e;
    public final p7m0 f;

    public v8l0(q7d0 q7d0Var, vby vbyVar, String str, int i) {
        Object obj;
        q7d0Var.getClass();
        vbyVar.getClass();
        this.f36991a = q7d0Var;
        this.b = vbyVar;
        this.c = str;
        this.d = i;
        this.e = q7m0.a(xun.f41520a);
        try {
            String string = q7d0Var.a().getString(str, "");
            if (string == null || string.length() == 0) {
                obj = lun.f20680a;
                obj.getClass();
            } else {
                obj = (Map) ((Map) vbyVar.b(new inv(okx.f25427a, new inv(s710.f31729a, sm8.f32432a, (byte) 1), (byte) 1), string)).get(Integer.valueOf(i));
                if (obj == null) {
                    obj = lun.f20680a;
                    obj.getClass();
                }
            }
        } catch (Exception unused) {
            obj = lun.f20680a;
            obj.getClass();
        }
        this.f = q7m0.a(obj);
    }

    public final void a(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2;
        vby vbyVar = this.b;
        String str = this.c;
        q7d0 q7d0Var = this.f36991a;
        try {
            String strC = q7d0.c(q7d0Var, str);
            if (strC == null || strC.length() == 0) {
                linkedHashMap2 = new LinkedHashMap();
            } else {
                vbyVar.getClass();
                linkedHashMap2 = xp20.p((Map) vbyVar.b(new inv(okx.f25427a, new inv(s710.f31729a, sm8.f32432a, (byte) 1), (byte) 1), strC));
            }
        } catch (Exception unused) {
            linkedHashMap2 = new LinkedHashMap();
        }
        linkedHashMap2.put(Integer.valueOf(this.d), linkedHashMap);
        vbyVar.getClass();
        q7d0Var.g(str, vbyVar.d(new inv(okx.f25427a, new inv(s710.f31729a, sm8.f32432a, (byte) 1), (byte) 1), linkedHashMap2));
    }
}
