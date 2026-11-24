package a;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jxm0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17314a;
    public final /* synthetic */ kxm0 b;

    public /* synthetic */ jxm0(kxm0 kxm0Var, byte b) {
        this.f17314a = b;
        this.b = kxm0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f17314a;
        kxm0 kxm0Var = this.b;
        switch (b) {
            case 0:
                sxm0 sxm0Var = (sxm0) obj;
                m6m0 m6m0Var = kxm0.n2;
                sxm0Var.getClass();
                if (sxm0Var.equals(qxm0.f29492a)) {
                    if (!kxm0Var.R()) {
                        kxm0Var.y0();
                    }
                } else {
                    if (!(sxm0Var instanceof rxm0)) {
                        t9f.b();
                        return null;
                    }
                    if (!kxm0Var.R()) {
                        vcc.f0(i120.V(new Pair(kxm0Var.P0().b, Long.valueOf(((rxm0) sxm0Var).f31272a))), kxm0Var, kxm0Var.P0().b);
                        kxm0Var.y0();
                    }
                }
                kxm0Var.Q0().x(zwm0.f45113a);
                return Unit.f46060a;
            default:
                String str = (String) obj;
                m6m0 m6m0Var2 = kxm0.n2;
                str.getClass();
                kxm0Var.Q0().x(new cxm0(str));
                return Unit.f46060a;
        }
    }
}
