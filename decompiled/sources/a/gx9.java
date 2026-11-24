package a;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class gx9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12067a = new Object();
    public final LinkedHashMap b = new LinkedHashMap();

    public final void a(String str, int i, boolean z) {
        jnu0 jnu0Var;
        str.getClass();
        synchronized (this.f12067a) {
            jnu0Var = (jnu0) this.b.get(new g0a(str));
        }
        if (jnu0Var == null) {
            return;
        }
        jnu0Var.b.a(new mev(i, z));
    }
}
