package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x3u0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40238a;
    public final /* synthetic */ y3u0 b;

    public /* synthetic */ x3u0(y3u0 y3u0Var, byte b) {
        this.f40238a = b;
        this.b = y3u0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f40238a;
        y3u0 y3u0Var = this.b;
        switch (b) {
            case 0:
                y3u0Var.d = true;
                y3u0Var.f.invoke();
                return Unit.f46060a;
            default:
                fhl fhlVar = (fhl) obj;
                wgv wgvVar = y3u0Var.b;
                float f = y3u0Var.k;
                float f2 = y3u0Var.l;
                nr nrVarA0 = fhlVar.A0();
                long jP = nrVarA0.p();
                nrVarA0.i().l();
                try {
                    ((fvt0) nrVarA0.b).z(f, f2, 0L);
                    wgvVar.a(fhlVar);
                    return Unit.f46060a;
                } finally {
                    defpackage.c.g(nrVarA0, jP);
                }
        }
    }
}
