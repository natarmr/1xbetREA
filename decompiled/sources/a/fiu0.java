package a;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class fiu0 implements miu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f9606a;

    public fiu0(Map map) {
        map.getClass();
        this.f9606a = map;
    }

    @Override // a.miu0
    public final diu0 b(Class cls) {
        Map map = this.f9606a;
        o5d0 o5d0Var = (o5d0) map.get(cls);
        if (o5d0Var == null) {
            for (Map.Entry entry : map.entrySet()) {
                Class<?> cls2 = (Class) entry.getKey();
                o5d0 o5d0Var2 = (o5d0) entry.getValue();
                if (cls.isAssignableFrom(cls2)) {
                    o5d0Var = o5d0Var2;
                    break;
                }
            }
        }
        if (o5d0Var == null) {
            e9d0.i(cls, "unknown model class ");
            return null;
        }
        try {
            Object obj = o5d0Var.get();
            obj.getClass();
            return (diu0) obj;
        } catch (Exception e) {
            ohq.p(e);
            return null;
        }
    }
}
