package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vao0 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37101a;
    public final /* synthetic */ ivk0 b;
    public final /* synthetic */ ebo0 c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ vao0(ivk0 ivk0Var, ebo0 ebo0Var, Function1 function1, byte b) {
        this.f37101a = b;
        this.b = ivk0Var;
        this.c = ebo0Var;
        this.d = function1;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f37101a;
        ivk0 ivk0Var = this.b;
        y5d y5dVar = (y5d) obj;
        fet fetVar = (fet) obj2;
        switch (b) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                y5dVar.getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    q5x.h(cjx.V(jm40.b, x0x.a0(fetVar), null), ivk0Var.f15449a, this.c, ivk0Var.b, this.d, fetVar, 0, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                y5dVar.getClass();
                if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    q5x.h(null, ivk0Var.f15449a, this.c, ivk0Var.b, this.d, fetVar, 0, 1);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
