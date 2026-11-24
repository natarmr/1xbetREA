package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pjr0 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27104a = 0;
    public final /* synthetic */ njr0 b;
    public final /* synthetic */ l7m0 c;

    public /* synthetic */ pjr0(l7m0 l7m0Var, njr0 njr0Var) {
        this.c = l7m0Var;
        this.b = njr0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f27104a;
        cl5 cl5Var = ukd.f35823a;
        switch (b) {
            case 0:
                mm40 mm40Var = (mm40) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                mm40Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(mm40Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    njr0 njr0Var = this.b;
                    boolean zI = fetVar.i(njr0Var);
                    Object objP = fetVar.P();
                    if (zI || objP == cl5Var) {
                        cym0 cym0Var = new cym0(0, njr0Var, njr0.class, "randomSelection", "randomSelection()V", 0, (byte) 22);
                        fetVar.o0(cym0Var);
                        objP = cym0Var;
                    }
                    Function0 function0 = (Function0) ((jhy) objP);
                    boolean zI2 = fetVar.i(njr0Var);
                    Object objP2 = fetVar.P();
                    if (zI2 || objP2 == cl5Var) {
                        cym0 cym0Var2 = new cym0(0, njr0Var, njr0.class, "makeBet", "makeBet()V", 0, (byte) 23);
                        fetVar.o0(cym0Var2);
                        objP2 = cym0Var2;
                    }
                    pvm0.h(((iIntValue << 9) & 7168) | 6, fetVar, mm40Var, this.c, function0, (Function0) ((jhy) objP2));
                } else {
                    fetVar.X();
                }
                break;
            default:
                mm40 mm40Var2 = (mm40) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                mm40Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(mm40Var2) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    njr0 njr0Var2 = this.b;
                    boolean zI3 = fetVar2.i(njr0Var2);
                    Object objP3 = fetVar2.P();
                    if (zI3 || objP3 == cl5Var) {
                        cym0 cym0Var3 = new cym0(0, njr0Var2, njr0.class, "exit", "exit()V", 0, (byte) 24);
                        fetVar2.o0(cym0Var3);
                        objP3 = cym0Var3;
                    }
                    jhy jhyVar = (jhy) objP3;
                    boolean zI4 = fetVar2.i(njr0Var2);
                    Object objP4 = fetVar2.P();
                    if (zI4 || objP4 == cl5Var) {
                        cym0 cym0Var4 = new cym0(0, njr0Var2, njr0.class, "onClearChoiceClicked", "onClearChoiceClicked()V", 0, (byte) 25);
                        fetVar2.o0(cym0Var4);
                        objP4 = cym0Var4;
                    }
                    jhy jhyVar2 = (jhy) objP4;
                    boolean zI5 = fetVar2.i(njr0Var2);
                    Object objP5 = fetVar2.P();
                    if (zI5 || objP5 == cl5Var) {
                        cym0 cym0Var5 = new cym0(0, njr0Var2, njr0.class, "navigateToTotoTirage", "navigateToTotoTirage()V", 0, (byte) 26);
                        fetVar2.o0(cym0Var5);
                        objP5 = cym0Var5;
                    }
                    jhy jhyVar3 = (jhy) objP5;
                    boolean zI6 = fetVar2.i(njr0Var2);
                    Object objP6 = fetVar2.P();
                    if (zI6 || objP6 == cl5Var) {
                        cym0 cym0Var6 = new cym0(0, njr0Var2, njr0.class, "onTitleClick", "onTitleClick()V", 0, (byte) 27);
                        fetVar2.o0(cym0Var6);
                        objP6 = cym0Var6;
                    }
                    ltt0.j(mm40Var2, this.c, (Function0) ((jhy) objP6), (Function0) jhyVar, (Function0) jhyVar2, (Function0) jhyVar3, fetVar2, (iIntValue2 & 14) | 48);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ pjr0(njr0 njr0Var, l7m0 l7m0Var) {
        this.b = njr0Var;
        this.c = l7m0Var;
    }
}
