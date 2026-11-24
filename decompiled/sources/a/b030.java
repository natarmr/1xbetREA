package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class b030 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1750a = 0;
    public final /* synthetic */ ugd b;
    public final /* synthetic */ gy20 c;

    public b030(ugd ugdVar, gy20 gy20Var) {
        this.b = ugdVar;
        this.c = gy20Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        switch (this.f1750a) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Number) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    gy20 gy20Var = this.c;
                    int i = 0;
                    for (Object obj4 : ((fv20) gy20Var).b) {
                        int i2 = i + 1;
                        if (i < 0) {
                            q3d.p();
                            throw null;
                        }
                        this.b.O(gy20Var, (d4n) obj4, Integer.valueOf(i), fetVar, 0);
                        i = i2;
                    }
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            default:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    this.b.F(this.c, fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
        }
    }

    public b030(gy20 gy20Var, ugd ugdVar) {
        this.c = gy20Var;
        this.b = ugdVar;
    }
}
