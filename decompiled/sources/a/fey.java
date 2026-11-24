package a;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class fey implements klc {
    public static final g950 g;
    public static final qlc h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ym40 f9427a;
    public final Function1 b;
    public final cu00 c;
    public static final /* synthetic */ iiy[] e = {new j0d0(fey.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0)};
    public static final sqt d = new sqt();
    public static final swq f = j4m0.l;

    static {
        twq twqVar = i4m0.c;
        g = twqVar.g();
        swq swqVarI = twqVar.i();
        h = new qlc(swqVarI.b(), swqVarI.f32934a.g());
    }

    public fey(eu00 eu00Var, zm40 zm40Var) {
        j9x j9xVar = j9x.h;
        zm40Var.getClass();
        this.f9427a = zm40Var;
        this.b = j9xVar;
        this.c = new cu00(eu00Var, new nsr((Object) this, (Object) eu00Var, (byte) 16));
    }

    @Override // a.klc
    public final boolean a(swq swqVar, g950 g950Var) {
        swqVar.getClass();
        g950Var.getClass();
        return Intrinsics.d(g950Var, g) && Intrinsics.d(swqVar, f);
    }

    @Override // a.klc
    public final wm40 b(qlc qlcVar) {
        qlcVar.getClass();
        if (!qlcVar.equals(h)) {
            return null;
        }
        return (llc) yqm0.s(this.c, e[0]);
    }

    @Override // a.klc
    public final Collection c(swq swqVar) {
        swqVar.getClass();
        if (!swqVar.equals(f)) {
            return xun.f41520a;
        }
        return cui0.b((llc) yqm0.s(this.c, e[0]));
    }
}
