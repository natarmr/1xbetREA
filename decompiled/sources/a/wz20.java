package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wz20 implements zdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40001a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ wz20(Function1 function1, Function1 function2, byte b) {
        this.f40001a = b;
        this.b = function1;
        this.c = function2;
    }

    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        switch (this.f40001a) {
            case 0:
                fv20 fv20Var = (fv20) obj;
                d4n d4nVar = (d4n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                fet fetVar = (fet) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                fv20Var.getClass();
                d4nVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    i = (fetVar.g(fv20Var) ? 4 : 2) | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar.g(d4nVar) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    i |= fetVar.e(iIntValue) ? 256 : 128;
                }
                if (fetVar.U(i & 1, (i & 1171) != 1170)) {
                    zcl zclVar = qmk.f28987a;
                    agc.t(s5x0.N(jm40.b, 0.0f, iIntValue == 0 ? 12.0f : 2.0f, 0.0f, iIntValue == q3d.i(fv20Var.b) ? 8.0f : 2.0f, 5), d4nVar, ((Boolean) fetVar.k(kr00.f18743a)).booleanValue(), this.b, this.c, fetVar, i & 112, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                d4n d4nVar2 = (d4n) obj2;
                ((Integer) obj3).getClass();
                fet fetVar2 = (fet) obj4;
                int iIntValue3 = ((Integer) obj5).intValue();
                ((fv20) obj).getClass();
                d4nVar2.getClass();
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= fetVar2.g(d4nVar2) ? 32 : 16;
                }
                if (fetVar2.U(iIntValue3 & 1, (iIntValue3 & 1041) != 1040)) {
                    agc.t(null, d4nVar2, ((Boolean) fetVar2.k(kr00.f18743a)).booleanValue(), this.b, this.c, fetVar2, iIntValue3 & 112, 1);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
