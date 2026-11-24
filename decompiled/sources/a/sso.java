package a;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class sso {
    public static final sso b = new sso(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f32734a;

    public sso(sso ssoVar) {
        if (ssoVar == b) {
            this.f32734a = Collections.EMPTY_MAP;
        } else {
            this.f32734a = Collections.unmodifiableMap(ssoVar.f32734a);
        }
    }

    public final void a(ijt ijtVar) {
        this.f32734a.put(new pso(ijtVar.f14892a, ijtVar.d.f13177a), ijtVar);
    }

    public sso() {
        this.f32734a = new HashMap();
    }

    public sso(int i) {
        this.f32734a = Collections.EMPTY_MAP;
    }
}
