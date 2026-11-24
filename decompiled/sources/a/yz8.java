package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yz8 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43503a;
    public final /* synthetic */ jjm b;

    public /* synthetic */ yz8(jjm jjmVar, byte b) {
        this.f43503a = b;
        this.b = jjmVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f43503a;
        jm40 jm40Var = jm40.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    nkb.h(s5x0.L(mm40VarD, 16.0f, 0.0f, 2), this.b, kjm.b, null, null, null, fetVar, 384, 56);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar2 = qmk.f28987a;
                    nkb.h(s5x0.L(s5x0.N(mm40VarD2, 0.0f, 16.0f, 0.0f, 0.0f, 13), 16.0f, 0.0f, 2), this.b, kjm.b, null, null, null, fetVar2, 384, 56);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar3 = qmk.f28987a;
                    nkb.h(s5x0.L(s5x0.N(mm40VarD3, 12.0f, 12.0f, 12.0f, 0.0f, 8), xfn.a(fetVar3).e, 0.0f, 2), this.b, kjm.b, null, null, null, fetVar3, 384, 56);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
