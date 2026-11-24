package a;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class yjo {
    public static final pek c = new pek();
    public static final LinkedHashMap d = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i050 f42750a;
    public final fhj b;

    public yjo(String str, boolean z) {
        i050 i050Var;
        fhj fhjVar;
        synchronized (c) {
            try {
                LinkedHashMap linkedHashMap = d;
                Object k050Var = linkedHashMap.get(str);
                if (k050Var == null) {
                    k050Var = new k050();
                    linkedHashMap.put(str, k050Var);
                }
                i050Var = (i050) k050Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f42750a = i050Var;
        if (z) {
            fhjVar = new fhj();
            fhjVar.f9543a = str.concat(".lck");
        } else {
            fhjVar = null;
        }
        this.b = fhjVar;
    }
}
