package a;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gg60 implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11240a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gg60(Object obj, Object obj2, byte b) {
        this.f11240a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Object value;
        kvv0 kvv0Var;
        List<lwv0> listL0;
        Map mapI;
        Map mapG;
        byte b = this.f11240a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((glz) obj2).f((lz2) obj);
                break;
            default:
                jvv0 jvv0Var = (jvv0) obj2;
                kvv0 kvv0Var2 = (kvv0) obj;
                p7m0 p7m0Var = jvv0Var.f17222a;
                do {
                    value = p7m0Var.getValue();
                    gvv0 gvv0Var = (gvv0) value;
                    Map map = gvv0Var.f11994a;
                    kvv0Var = gvv0Var.c;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : map.entrySet()) {
                        if (Intrinsics.d((kvv0) entry.getValue(), kvv0Var2)) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    listL0 = CollectionsKt.L0(linkedHashMap.keySet());
                    Map map2 = gvv0Var.f11994a;
                    Set setP0 = CollectionsKt.P0(listL0);
                    map2.getClass();
                    setP0.getClass();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(map2);
                    Set setKeySet = linkedHashMap2.keySet();
                    setKeySet.getClass();
                    setKeySet.removeAll(w3d.w(setP0));
                    mapI = xp20.i(linkedHashMap2);
                    mapG = xp20.g(gvv0Var.b, kvv0Var2);
                    if (Intrinsics.d(kvv0Var, kvv0Var2)) {
                        kvv0Var = null;
                    }
                } while (!p7m0Var.m(value, new gvv0(mapI, mapG, kvv0Var)));
                gsv0 gsv0Var = jvv0Var.b;
                if (gsv0Var != null) {
                    hsv0 hsv0Var = gsv0Var.f11850a;
                    for (lwv0 lwv0Var : listL0) {
                        hsv0Var.c(hsv0Var.d, lwv0Var);
                        u950 u950Var = hsv0Var.c;
                        if (u950Var != null) {
                            hsv0Var.c(u950Var, lwv0Var);
                        }
                        if (hsv0Var.c == null) {
                            hsv0Var.b(lwv0Var);
                        }
                    }
                }
                break;
        }
    }
}
