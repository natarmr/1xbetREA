package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tja implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34038a;
    public final /* synthetic */ pz40 b;
    public final /* synthetic */ mm40 c;
    public final /* synthetic */ mm40 d;

    public /* synthetic */ tja(pz40 pz40Var, mm40 mm40Var, mm40 mm40Var2, byte b) {
        this.f34038a = b;
        this.b = pz40Var;
        this.c = mm40Var;
        this.d = mm40Var2;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f34038a;
        byte b2 = 9;
        mm40 mm40Var = this.d;
        mm40 mm40Var2 = this.c;
        byte b3 = 1;
        switch (b) {
            case 0:
                mm40 mm40Var3 = (mm40) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                mm40Var3.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(mm40Var3) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    d7x.f(mm40Var3, this.b, u1c.M(-1362102496, new ft0(mm40Var2, b3), fetVar), u1c.M(885067102, new fp0(mm40Var, b3), fetVar), fetVar, (iIntValue & 14) | 3456);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                mm40 mm40Var4 = (mm40) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                mm40Var4.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(mm40Var4) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    n6x.d(mm40Var4, this.b, u1c.M(1599120304, new ft0(mm40Var2, b2), fetVar2), u1c.M(1404233198, new fp0(mm40Var, (byte) 7), fetVar2), fetVar2, (iIntValue2 & 14) | 3456);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                mm40 mm40Var5 = (mm40) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                mm40Var5.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar3.g(mm40Var5) ? 4 : 2;
                }
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    q5x.r(mm40Var5, this.b, u1c.M(-968479958, new ft0(mm40Var2, (byte) 12), fetVar3), u1c.M(1999203560, new fp0(mm40Var, b2), fetVar3), fetVar3, (iIntValue3 & 14) | 3456);
                } else {
                    fetVar3.X();
                }
                break;
            default:
                mm40 mm40Var6 = (mm40) obj;
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                mm40Var6.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= fetVar4.g(mm40Var6) ? 4 : 2;
                }
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    b5x.m(mm40Var6, this.b, u1c.M(-437965364, new ft0(mm40Var2, (byte) 11), fetVar4), u1c.M(2048611022, new fp0(mm40Var, (byte) 10), fetVar4), fetVar4, (iIntValue4 & 14) | 3456);
                } else {
                    fetVar4.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
