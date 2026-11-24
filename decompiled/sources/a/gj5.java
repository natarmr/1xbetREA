package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gj5 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11380a;
    public final /* synthetic */ dk5 b;

    public /* synthetic */ gj5(dk5 dk5Var, byte b) {
        this.f11380a = b;
        this.b = dk5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f11380a;
        dk5 dk5Var = this.b;
        switch (b) {
            case 0:
                String str = (String) obj2;
                ((Throwable) obj).getClass();
                str.getClass();
                p7m0 p7m0Var = dk5Var.a0;
                oi5 oi5Var = new oi5(str);
                p7m0Var.getClass();
                p7m0Var.o(null, oi5Var);
                break;
            case 1:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                p7m0 p7m0Var2 = dk5Var.Z;
                Boolean bool = Boolean.TRUE;
                p7m0Var2.getClass();
                p7m0Var2.o(null, bool);
                break;
            case 2:
                String str2 = (String) obj2;
                ((Throwable) obj).getClass();
                str2.getClass();
                p7m0 p7m0Var3 = dk5Var.a0;
                oi5 oi5Var2 = new oi5(str2);
                p7m0Var3.getClass();
                p7m0Var3.o(null, oi5Var2);
                break;
            case 3:
                ((Integer) obj2).getClass();
                ckb.e(dk5Var, (fet) obj, x8x.L(9));
                break;
            default:
                ((Integer) obj2).getClass();
                xia0.x(dk5Var, (fet) obj, x8x.L(9));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ gj5(dk5 dk5Var, int i, byte b) {
        this.f11380a = b;
        this.b = dk5Var;
    }
}
