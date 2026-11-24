package a;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class pmo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7m0 f27246a = q7m0.a(new HashMap());
    public boolean b;

    public final void a(String str, boolean z) {
        Object value;
        str.getClass();
        HashMap map = new HashMap();
        p7m0 p7m0Var = this.f27246a;
        map.putAll((Map) p7m0Var.getValue());
        map.put(str, Boolean.valueOf(z));
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, map));
    }
}
