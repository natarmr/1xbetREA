package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class axp implements zdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1633a = 0;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ l7m0 f;

    public /* synthetic */ axp(agk0 agk0Var, l7m0 l7m0Var, float f, float f2, Function1 function1) {
        this.f = agk0Var;
        this.b = l7m0Var;
        this.c = f;
        this.d = f2;
        this.e = function1;
    }

    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        byte b = this.f1633a;
        l7m0 l7m0Var = this.f;
        l7m0 l7m0Var2 = this.b;
        switch (b) {
            case 0:
                agk0 agk0Var = (agk0) l7m0Var;
                l7m0 l7m0Var3 = (l7m0) obj;
                fet fetVar = (fet) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                l7m0Var3.getClass();
                ((l7m0) obj2).getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(l7m0Var3) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 1027) != 1026)) {
                    agk0Var.m(((Number) l7m0Var3.getValue()).floatValue());
                    pyp pypVar = ((qyp) l7m0Var2.getValue()).f29545a;
                    Function1 function1 = this.e;
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == ukd.f35823a) {
                        objP = new mfp(function1, (byte) 22);
                        fetVar.o0(objP);
                    }
                    u1c.n(null, pypVar, l7m0Var3, this.c, this.d, (Function0) objP, fetVar, (iIntValue << 6) & 896);
                } else {
                    fetVar.X();
                }
                break;
            default:
                l7m0 l7m0Var4 = (l7m0) obj;
                ycl yclVar = (ycl) obj3;
                fet fetVar2 = (fet) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                l7m0Var4.getClass();
                ((l7m0) obj2).getClass();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar2.g(l7m0Var4) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 384) == 0) {
                    i |= fetVar2.d(yclVar.f42389a) ? 256 : 128;
                }
                if (fetVar2.U(i & 1, (i & 1155) != 1154)) {
                    cy2.i(null, (fkw) ((jkw) l7m0Var2.getValue()).b.getValue(), l7m0Var.getValue() instanceof djw, l7m0Var4, this.c, this.d, yclVar.f42389a, this.e, fetVar2, ((i << 9) & 7168) | ((i << 12) & 3670016));
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ axp(l7m0 l7m0Var, l7m0 l7m0Var2, float f, float f2, Function1 function1) {
        this.b = l7m0Var;
        this.f = l7m0Var2;
        this.c = f;
        this.d = f2;
        this.e = function1;
    }
}
