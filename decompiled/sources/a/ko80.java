package a;

import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class ko80 extends q8x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18620a;
    public final Method b;
    public final int c;
    public final boolean d;

    public /* synthetic */ ko80(byte b, int i, Method method, boolean z) {
        this.f18620a = b;
        this.b = method;
        this.c = i;
        this.d = z;
    }

    @Override // a.q8x
    public final void y(emf0 emf0Var, Object obj) {
        byte b = this.f18620a;
        boolean z = this.d;
        Method method = this.b;
        int i = this.c;
        switch (b) {
            case 0:
                Map map = (Map) obj;
                if (map == null) {
                    throw ay3.Z(method, i, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw ay3.Z(method, i, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw ay3.Z(method, i, kng0.l("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String string = value.toString();
                    if (string == null) {
                        throw ay3.Z(method, i, "Field map value '" + value + "' converted to null by " + uc9.class.getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    emf0Var.a(str, string, z);
                }
                return;
            case 1:
                Map map2 = (Map) obj;
                if (map2 == null) {
                    throw ay3.Z(method, i, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    if (str2 == null) {
                        throw ay3.Z(method, i, "Header map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw ay3.Z(method, i, kng0.l("Header map contained null value for key '", str2, "'."), new Object[0]);
                    }
                    emf0Var.b(str2, value2.toString(), z);
                }
                return;
            default:
                Map map3 = (Map) obj;
                if (map3 == null) {
                    throw ay3.Z(method, i, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry3 : map3.entrySet()) {
                    String str3 = (String) entry3.getKey();
                    if (str3 == null) {
                        throw ay3.Z(method, i, "Query map contained null key.", new Object[0]);
                    }
                    Object value3 = entry3.getValue();
                    if (value3 == null) {
                        throw ay3.Z(method, i, kng0.l("Query map contained null value for key '", str3, "'."), new Object[0]);
                    }
                    String string2 = value3.toString();
                    if (string2 == null) {
                        throw ay3.Z(method, i, "Query map value '" + value3 + "' converted to null by " + uc9.class.getName() + " for key '" + str3 + "'.", new Object[0]);
                    }
                    emf0Var.c(str3, string2, z);
                }
                return;
        }
    }
}
