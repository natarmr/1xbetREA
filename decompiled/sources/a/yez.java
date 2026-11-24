package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class yez implements rhv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Function0 f42515a;
    public pz40 b;
    public final pz40 c = androidx.compose.runtime.e.e(Boolean.FALSE);

    public final long a() {
        xbk xbkVar;
        pz40 pz40VarE = this.b;
        if (pz40VarE == null) {
            Function0 function0 = this.f42515a;
            if (function0 == null || (xbkVar = (xbk) function0.invoke()) == null) {
                xbkVar = xbk.c;
            }
            pz40VarE = androidx.compose.runtime.e.e(xbkVar);
            this.b = pz40VarE;
            this.f42515a = null;
        }
        return ((xbk) ((hgk0) pz40VarE).getValue()).b;
    }

    public final long b() {
        xbk xbkVar;
        pz40 pz40VarE = this.b;
        if (pz40VarE == null) {
            Function0 function0 = this.f42515a;
            if (function0 == null || (xbkVar = (xbk) function0.invoke()) == null) {
                xbkVar = xbk.c;
            }
            pz40VarE = androidx.compose.runtime.e.e(xbkVar);
            this.b = pz40VarE;
            this.f42515a = null;
        }
        return ((xbk) ((hgk0) pz40VarE).getValue()).f40604a;
    }

    public final boolean c() {
        return ((Boolean) ((hgk0) this.c).getValue()).booleanValue();
    }
}
