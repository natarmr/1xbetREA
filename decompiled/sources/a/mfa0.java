package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mfa0 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21686a;
    public final /* synthetic */ ty6 b;

    public /* synthetic */ mfa0(ty6 ty6Var, byte b) {
        this.f21686a = b;
        this.b = ty6Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f21686a;
        ty6 ty6Var = this.b;
        byte b2 = 1;
        y5d y5dVar = (y5d) obj;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                y5dVar.getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    uf40 uf40Var = ty6Var.f34738a;
                    m8x.n(null, uf40Var.c, uf40Var.d, null, u1c.M(645046063, new mfa0(ty6Var, b2), fetVar), u1c.M(1787393648, new mfa0(ty6Var, (byte) 2), fetVar), fetVar, 224256);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                y5dVar.getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    jm40 jm40Var = jm40.b;
                    r7x.c(6, fetVar2, o7k0.d(jm40Var, 1.0f), ((kgs) ty6Var.f34738a.f35562a).f18255a);
                    String str = ty6Var.b;
                    if (str == null) {
                        fetVar2.e0(883857856);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(883857857);
                        zcl zclVar = qmk.f28987a;
                        o5n0.c(0, fetVar2, s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), str);
                        fetVar2.r(false);
                    }
                } else {
                    fetVar2.X();
                }
                break;
            default:
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                y5dVar.getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    zcl zclVar2 = qmk.f28987a;
                    idx.h(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 2.0f, 7), (b480) ty6Var.f34738a.b, fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
