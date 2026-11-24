package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class igx implements zdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14753a;
    public final /* synthetic */ long b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ igx(long j, float f, Function1 function1, Function1 function2, byte b) {
        this.f14753a = b;
        this.b = j;
        this.c = f;
        this.d = function1;
        this.e = function2;
    }

    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        byte b = this.f14753a;
        jm40 jm40Var = jm40.b;
        long j = this.b;
        switch (b) {
            case 0:
                zgx zgxVar = (zgx) obj;
                d4n d4nVar = (d4n) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                fet fetVar = (fet) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                zgxVar.getClass();
                d4nVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    i = (fetVar.g(zgxVar) ? 4 : 2) | iIntValue2;
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
                    mm40 mm40VarQ = i120.Q(jm40Var, j, jd8.n);
                    zcl zclVar = qmk.f28987a;
                    float f = iIntValue == 0 ? 12.0f : 2.0f;
                    float f2 = iIntValue == q3d.i(zgxVar.b) ? 8.0f : 2.0f;
                    float f3 = this.c;
                    agc.t(s5x0.M(mm40VarQ, f3, f, f3, f2), d4nVar, ((Boolean) fetVar.k(kr00.f18743a)).booleanValue(), this.d, this.e, fetVar, i & 112, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                d4n d4nVar2 = (d4n) obj2;
                ((Integer) obj3).getClass();
                fet fetVar2 = (fet) obj4;
                int iIntValue3 = ((Integer) obj5).intValue();
                ((zgx) obj).getClass();
                d4nVar2.getClass();
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= fetVar2.g(d4nVar2) ? 32 : 16;
                }
                if (fetVar2.U(iIntValue3 & 1, (iIntValue3 & 1041) != 1040)) {
                    mm40 mm40VarQ2 = i120.Q(jm40Var, j, jd8.n);
                    float f4 = this.c;
                    agc.t(s5x0.N(mm40VarQ2, f4, 0.0f, f4, 0.0f, 10), d4nVar2, ((Boolean) fetVar2.k(kr00.f18743a)).booleanValue(), this.d, this.e, fetVar2, iIntValue3 & 112, 0);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
