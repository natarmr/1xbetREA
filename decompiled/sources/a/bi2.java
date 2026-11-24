package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class bi2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2638a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ p6t0 c;

    public /* synthetic */ bi2(Function1 function1, p6t0 p6t0Var, byte b) {
        this.f2638a = b;
        this.b = function1;
        this.c = p6t0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f2638a;
        p6t0 p6t0Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                ((h2l0) obj).getClass();
                vnp0 vnp0Var = (vnp0) p6t0Var;
                function1.invoke(new rh2(vnp0Var.c, vnp0Var.f37730a));
                break;
            case 1:
                ((h2l0) obj).getClass();
                o8s0 o8s0Var = (o8s0) p6t0Var;
                function1.invoke(new zi2(o8s0Var.c, o8s0Var.f24847a));
                break;
            case 2:
                ((h2l0) obj).getClass();
                o8s0 o8s0Var2 = (o8s0) p6t0Var;
                function1.invoke(new zi2(o8s0Var2.c, o8s0Var2.f24847a));
                break;
            case 3:
                zia ziaVar = (zia) obj;
                ziaVar.getClass();
                function1.invoke(new lk2(ziaVar, ((sbs0) p6t0Var).f31951a.b.h));
                break;
            case 4:
                ((h2l0) obj).getClass();
                vnp0 vnp0Var2 = (vnp0) p6t0Var;
                function1.invoke(new rh2(vnp0Var2.c, vnp0Var2.f37730a));
                break;
            case 5:
                function1.invoke(new shw(((yqv) p6t0Var).d == sip.c, ((Number) obj).longValue()));
                break;
            case 6:
                h2l0 h2l0Var = (h2l0) obj;
                h2l0Var.getClass();
                if (ggl0.f11255a[h2l0Var.ordinal()] == 1) {
                    function1.invoke(new zfl0(((gpp) p6t0Var).f11693a));
                }
                break;
            case 7:
                h2l0 h2l0Var2 = (h2l0) obj;
                h2l0Var2.getClass();
                if (igl0.f14740a[h2l0Var2.ordinal()] == 1) {
                    function1.invoke(new zfl0(((gpp) p6t0Var).f11693a));
                }
                break;
            case 8:
                h2l0 h2l0Var3 = (h2l0) obj;
                h2l0Var3.getClass();
                if (jgl0.f16487a[h2l0Var3.ordinal()] == 1) {
                    function1.invoke(new zfl0(((gpp) p6t0Var).f11693a));
                }
                break;
            case 9:
                h2l0 h2l0Var4 = (h2l0) obj;
                h2l0Var4.getClass();
                if (kgl0.f18245a[h2l0Var4.ordinal()] == 1) {
                    function1.invoke(new zfl0(((gpp) p6t0Var).f11693a));
                }
                break;
            default:
                ((bem) obj).getClass();
                function1.invoke(new m2p0(((v2p0) p6t0Var).f36698a));
                break;
        }
        return Unit.f46060a;
    }
}
