package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dq6 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6498a;
    public final /* synthetic */ oy6 b;

    public /* synthetic */ dq6(oy6 oy6Var, byte b) {
        this.f6498a = b;
        this.b = oy6Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f6498a;
        oy6 oy6Var = this.b;
        byte b2 = 1;
        y5d y5dVar = (y5d) obj;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                y5dVar.getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    zcl zclVar = qmk.f28987a;
                    q8x.i(s5x0.L(jm40.b, 12.0f, 0.0f, 2), oy6Var.f26047a.b, null, u1c.M(-63411450, new dq6(oy6Var, b2), fetVar), fetVar, 3456);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                y5dVar.getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    a8k0.e(0, fetVar2, null, ((jgs) oy6Var.f26047a.f37314a).f16494a);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
