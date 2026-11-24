package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class k92 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17896a;
    public final /* synthetic */ uaq0 b;

    public /* synthetic */ k92(uaq0 uaq0Var, byte b) {
        this.f17896a = b;
        this.b = uaq0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f17896a;
        uaq0 uaq0Var = this.b;
        switch (b) {
            case 0:
                d92 d92Var = (d92) obj2;
                b92 b92Var = d92Var.b;
                uaq0.f35345a.getClass();
                boolean zL = s9m0.l(uaq0Var);
                int i = b92Var.f2186a;
                String str = b92Var.b;
                boolean z = b92Var.c;
                lok0 lok0Var = b92Var.d;
                boolean z2 = b92Var.e;
                boolean z3 = b92Var.g;
                boolean z4 = b92Var.h;
                str.getClass();
                return d92.a(d92Var, new b92(i, str, z, lok0Var, z2, zL, z3, z4), null, null, null, null, 0L, null, 2045);
            case 1:
                uaq0.f35345a.getClass();
                return z2s.a((z2s) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, s9m0.l(uaq0Var), null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, false, null, -134217729, 65535);
            case 2:
                uaq0.f35345a.getClass();
                return r7s.a((r7s) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, null, false, false, false, false, false, false, null, false, false, s9m0.l(uaq0Var), null, null, false, false, null, null, null, null, null, null, null, null, null, false, -1, 1048571);
            default:
                jpk0 jpk0Var = (jpk0) obj2;
                uaq0.f35345a.getClass();
                return jpk0.a(jpk0Var, q5x.B(jpk0Var.h.e.u, jpk0Var.f16907a, !s9m0.j(uaq0Var)), null, null, 0L, null, s9m0.l(uaq0Var), 1019);
        }
    }
}
