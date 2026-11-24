package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xd6 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40680a;
    public final /* synthetic */ me6 b;

    public /* synthetic */ xd6(me6 me6Var, byte b) {
        this.f40680a = b;
        this.b = me6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f40680a;
        boolean z = false;
        me6 me6Var = this.b;
        switch (b) {
            case 0:
                me6Var.E(false);
                return Unit.f46060a;
            case 1:
                me6Var.E(false);
                return Unit.f46060a;
            case 2:
                return Boolean.valueOf(me6Var.f.j());
            default:
                me6Var.E(true);
                me6Var.w();
                me6Var.y();
                p7m0 p7m0Var = me6Var.A;
                if (((Boolean) me6Var.F.getValue()).booleanValue() && me6Var.o.a() == q4f.m) {
                    z = true;
                }
                ee6 ee6Var = new ee6(me6Var.C(), z, me6Var.u.c(me6Var.b));
                p7m0Var.getClass();
                p7m0Var.o(null, ee6Var);
                return Unit.f46060a;
        }
    }
}
