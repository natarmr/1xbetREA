package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o82 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24811a;
    public final /* synthetic */ f3d b;
    public final /* synthetic */ l7m0 c;

    public /* synthetic */ o82(l7m0 l7m0Var, f3d f3dVar) {
        this.f24811a = (byte) 0;
        this.c = l7m0Var;
        this.b = f3dVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f24811a;
        l7m0 l7m0Var = this.c;
        f3d f3dVar = this.b;
        mm40 mm40Var = (mm40) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (b) {
            case 0:
                qek0 qek0Var = y82.V1;
                mm40Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(mm40Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    wvb.d(mm40Var, l7m0Var, f3dVar, fetVar, iIntValue & 14);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                zie0 zie0Var = fpk0.V1;
                mm40Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(mm40Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    dub.g(mm40Var, (z1d) l7m0Var.getValue(), f3dVar, fetVar, iIntValue & 14);
                } else {
                    fetVar.X();
                }
                break;
            default:
                zie0 zie0Var2 = fpk0.V1;
                mm40Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(mm40Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    m2x.j(mm40Var, (wnk0) l7m0Var.getValue(), f3dVar, fetVar, iIntValue & 14);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ o82(f3d f3dVar, l7m0 l7m0Var, byte b) {
        this.f24811a = b;
        this.b = f3dVar;
        this.c = l7m0Var;
    }
}
