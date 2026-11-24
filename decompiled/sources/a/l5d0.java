package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class l5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.compose.runtime.d f19449a;
    public final boolean b;
    public final igk0 c;
    public final Function1 d;
    public final boolean e;
    public final Object f;
    public boolean g = true;

    public l5d0(androidx.compose.runtime.d dVar, Object obj, boolean z, igk0 igk0Var, Function1 function1, boolean z2) {
        this.f19449a = dVar;
        this.b = z;
        this.c = igk0Var;
        this.d = function1;
        this.e = z2;
        this.f = obj;
    }

    public final Object a() {
        if (this.b) {
            return null;
        }
        Object obj = this.f;
        if (obj != null) {
            return obj;
        }
        ykd.b("Unexpected form of a provided value");
        csj.b();
        return null;
    }
}
