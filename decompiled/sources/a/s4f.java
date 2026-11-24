package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s4f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31601a;
    public final /* synthetic */ r7f b;

    public /* synthetic */ s4f(r7f r7fVar, byte b) {
        this.f31601a = b;
        this.b = r7fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        pwq0 pwq0Var;
        hao0 hao0Var;
        Object value5;
        byte b = this.f31601a;
        r7f r7fVar = this.b;
        switch (b) {
            case 0:
                p7m0 p7m0Var = r7fVar.W1;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, n9h0.a((n9h0) value, false, true, false, null, 0, false, false, false, false, false, 2043)));
                r7fVar.d2.f(d3f.f5400a);
                return Unit.f46060a;
            case 1:
                return ((sff0) r7fVar.u1.getValue()).f32117a.c;
            case 2:
                p7m0 p7m0Var2 = r7fVar.W1;
                do {
                    value2 = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value2, n9h0.a((n9h0) value2, false, false, false, null, 0, false, false, false, false, false, 2046)));
                return Unit.f46060a;
            case 3:
                v3c.N(r7fVar.E1);
                r7fVar.R(f3f.f8859a);
                p7m0 p7m0Var3 = r7fVar.W1;
                do {
                    value3 = p7m0Var3.getValue();
                } while (!p7m0Var3.m(value3, n9h0.a((n9h0) value3, false, false, false, null, 0, false, false, false, false, false, 2046)));
                p7m0 p7m0Var4 = r7fVar.X1;
                do {
                    value4 = p7m0Var4.getValue();
                    pwq0Var = (pwq0) value4;
                    hao0Var = pwq0Var.l;
                } while (!p7m0Var4.m(value4, pwq0.a(pwq0Var, false, null, null, false, false, false, false, 0, hao0Var != null ? hao0.a(hao0Var, false) : null, false, 6143)));
                r7fVar.o1.a(jit0.f16593a);
                return Unit.f46060a;
            case 4:
                r7fVar.D0.a(r7fVar.V0, true, r7fVar.l.b());
                return Unit.f46060a;
            case 5:
                r7fVar.Z();
                return Unit.f46060a;
            case 6:
                r7fVar.x1 = false;
                return Unit.f46060a;
            case 7:
                p7m0 p7m0Var5 = r7fVar.W1;
                do {
                    value5 = p7m0Var5.getValue();
                } while (!p7m0Var5.m(value5, n9h0.a((n9h0) value5, false, true, false, null, 0, false, false, false, false, false, 2043)));
                return Unit.f46060a;
            case 8:
                r7fVar.Z();
                return Unit.f46060a;
            case 9:
                r7fVar.Z();
                return Unit.f46060a;
            case 10:
                r7fVar.Z();
                return Unit.f46060a;
            default:
                if (r7fVar.C1 == w4f.c) {
                    r7fVar.Z();
                }
                return Unit.f46060a;
        }
    }
}
