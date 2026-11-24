package a;

import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class i0g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13947a;
    public final byte[] b;
    public d3g0[] c;
    public final ju5 d;
    public Map e;

    public i0g0(String str, byte[] bArr, d3g0[] d3g0VarArr, ju5 ju5Var, int i) {
        this.f13947a = str;
        this.b = bArr;
        this.c = d3g0VarArr;
        this.d = ju5Var;
        this.e = null;
    }

    public final void a(Map map) {
        if (map != null) {
            Map map2 = this.e;
            if (map2 == null) {
                this.e = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public final void b(a3g0 a3g0Var, Object obj) {
        Map enumMap = this.e;
        if (enumMap == null) {
            enumMap = new EnumMap(a3g0.class);
            this.e = enumMap;
        }
        enumMap.put(a3g0Var, obj);
    }

    public final String toString() {
        return this.f13947a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i0g0(String str, byte[] bArr, d3g0[] d3g0VarArr, ju5 ju5Var) {
        this(str, bArr, d3g0VarArr, ju5Var, 0);
        System.currentTimeMillis();
    }
}
