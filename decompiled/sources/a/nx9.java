package a;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class nx9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f24273a;
    public final Object b = new Object();
    public final LinkedHashMap c = new LinkedHashMap();
    public final wv9 d;

    public nx9(String str, Map map, Context context, qcq0 qcq0Var, r1a r1aVar) {
        this.f24273a = map;
        r1aVar.a(p1a.f26190a, new w1(this, (byte) 20));
        wv9 wv9VarA = a(str);
        if (wv9VarA != null) {
            this.d = wv9VarA;
            return;
        }
        StringBuilder sb = new StringBuilder("Failed to load the default backend for ");
        sb.append((Object) mx9.a(str));
        c99.r(sb, "! Available backends are ", map.keySet());
        throw null;
    }

    public final wv9 a(String str) {
        str.getClass();
        synchronized (this.b) {
            try {
                wv9 wv9Var = (wv9) this.c.get(new mx9(str));
                if (wv9Var != null) {
                    return wv9Var;
                }
                s1a s1aVar = (s1a) this.f24273a.get(new mx9(str));
                wv9 wv9Var2 = s1aVar != null ? s1aVar.f31445a : null;
                if (wv9Var2 != null) {
                    if (!str.equals("CXCP-Camera2")) {
                        throw new IllegalStateException(("Unexpected backend id! Expected " + ((Object) mx9.a(str)) + " but it was actually " + ((Object) mx9.a("CXCP-Camera2"))).toString());
                    }
                    this.c.put(new mx9(str), wv9Var2);
                }
                return wv9Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
