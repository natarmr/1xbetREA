package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class hbn0 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12777a;
    public final /* synthetic */ a4x b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ hbn0(byte b, a4x a4xVar, Function1 function1, boolean z, boolean z2) {
        this.f12777a = b;
        this.b = a4xVar;
        this.c = z;
        this.d = z2;
        this.e = function1;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f12777a;
        ir8 ir8Var = (ir8) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (b) {
            case 0:
                ir8Var.getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ccq0.L(null, this.b, this.c, this.d, this.e, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ir8Var.getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    bsr0.L(null, this.b, this.c, this.d, this.e, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
