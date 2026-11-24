package a;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z54 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ a64 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z54(a64 a64Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = a64Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        a64 a64Var = this.k;
        switch (b) {
            case 0:
                z54 z54Var = new z54(a64Var, yjeVar, (byte) 0);
                z54Var.j = obj;
                return z54Var;
            default:
                z54 z54Var2 = new z54(a64Var, yjeVar, (byte) 1);
                z54Var2.j = obj;
                return z54Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((z54) create((h64) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((z54) create((e64) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        a64 a64Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                jdk0 jdk0Var = a64.l2;
                ((w54) a64Var.j2.getValue()).A(((h64) obj2).f12511a);
                return Unit.f46060a;
            default:
                e64 e64Var = (e64) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                d64 d64Var = d64.f5535a;
                if (!Intrinsics.d(e64Var, d64Var)) {
                    if (!(e64Var instanceof c64)) {
                        t9f.b();
                        return null;
                    }
                    vcc.f0(i120.V(new Pair("KEY_AUTH_ENTRY_POINT_REQUEST", new Integer(((c64) e64Var).f3801a))), a64Var, "KEY_AUTH_ENTRY_POINT_REQUEST");
                    jdk0 jdk0Var2 = a64.l2;
                    p7m0 p7m0Var = ((m64) a64Var.i2.getValue()).e;
                    p7m0Var.getClass();
                    p7m0Var.o(null, d64Var);
                    a64Var.x0();
                }
                return Unit.f46060a;
        }
    }
}
