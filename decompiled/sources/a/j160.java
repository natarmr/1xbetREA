package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j160 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15718a;
    public final /* synthetic */ bdz b;
    public final /* synthetic */ a4x c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ j160(bdz bdzVar, a4x a4xVar, boolean z, Function1 function1, byte b) {
        this.f15718a = b;
        this.b = bdzVar;
        this.c = a4xVar;
        this.d = z;
        this.e = function1;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        ir8 ir8Var = (ir8) obj;
        switch (this.f15718a) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ir8Var.getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    nia0.y(0, fetVar, this.c, this.b, null, this.e, this.d);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ir8Var.getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    epv0.q(this.b, this.c, this.d, this.e, fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
