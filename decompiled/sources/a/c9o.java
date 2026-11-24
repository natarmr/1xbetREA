package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c9o implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3971a;
    public final /* synthetic */ String b;
    public final /* synthetic */ l7m0 c;

    public /* synthetic */ c9o(String str, l7m0 l7m0Var, byte b) {
        this.f3971a = b;
        this.b = str;
        this.c = l7m0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f3971a;
        jm40 jm40Var = jm40.b;
        cl5 cl5Var = ukd.f35823a;
        l7m0 l7m0Var = this.c;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zG = fetVar.g(l7m0Var);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new x1d(l7m0Var, (byte) 25);
                        fetVar.o0(objP);
                    }
                    mm40 mm40VarD = o7k0.d(i4w0.T(jm40Var, (Function1) objP), 1.0f);
                    zcl zclVar = qmk.f28987a;
                    v8q0.a(this.b, s5x0.N(mm40VarD, 0.0f, 0.0f, 56.0f, 0.0f, 11), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.u, null, j1t0.b, 0L, null, 0, 0, qmk.H, 16646109), fetVar, 0, 24960, 109560);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zG2 = fetVar2.g(l7m0Var);
                    Object objP2 = fetVar2.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new ufp(l7m0Var, (byte) 27);
                        fetVar2.o0(objP2);
                    }
                    mm40 mm40VarD2 = o7k0.d(i4w0.T(jm40Var, (Function1) objP2), 1.0f);
                    zcl zclVar2 = qmk.f28987a;
                    v8q0.a(this.b, s5x0.N(mm40VarD2, 0.0f, 0.0f, 56.0f, 0.0f, 11), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.u, null, j1t0.b, 0L, null, 0, 0, qmk.H, 16646109), fetVar2, 0, 24960, 109560);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    boolean zG3 = fetVar3.g(l7m0Var);
                    Object objP3 = fetVar3.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new mqr0(l7m0Var, (byte) 6);
                        fetVar3.o0(objP3);
                    }
                    mm40 mm40VarD3 = o7k0.d(i4w0.T(jm40Var, (Function1) objP3), 1.0f);
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(mm40VarD3, 0.0f, 0.0f, 56.0f, 0.0f, 11);
                    boolean zG4 = fetVar3.g(l7m0Var);
                    Object objP4 = fetVar3.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new mqr0(l7m0Var, (byte) 7);
                        fetVar3.o0(objP4);
                    }
                    v8q0.a(this.b, pai0.a(mm40VarN, false, (Function1) objP4), ((ThemeColors) fetVar3.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.u, null, j1t0.b, 0L, null, 0, 0, qmk.H, 16646109), fetVar3, 0, 24960, 109560);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
