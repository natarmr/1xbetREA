package a;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class onu0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25566a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ onu0(Object obj, Object obj2, byte b) {
        this.f25566a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f25566a;
        jm40 jm40Var = jm40.b;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                uc9.Q((pnu0) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 1:
                l7m0 l7m0Var = (l7m0) obj4;
                wpu0 wpu0Var = (wpu0) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zG = fetVar.g(l7m0Var);
                    Object objP = fetVar.P();
                    if (zG || objP == ukd.f35823a) {
                        objP = new mqr0(l7m0Var, (byte) 8);
                        fetVar.o0(objP);
                    }
                    mm40 mm40VarD = o7k0.d(i4w0.T(jm40Var, (Function1) objP), 1.0f);
                    zcl zclVar = qmk.f28987a;
                    v8q0.a(wpu0Var.c, o2e.e0(s5x0.N(mm40VarD, 8.0f, 0.0f, 64.0f, 0.0f, 10), "VIRTUAL_GAME_CATEGORY_MAIN_TOOLBAR_COLLAPSED_TITLE"), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.u, null, j1t0.b, 0L, null, 0, 0, qmk.H, 16646109), fetVar, 0, 24960, 109560);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                zgc.H((g2v) obj4, (esu0) obj3, (fet) obj, x8x.L(65));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                wpm0.h((mm40) obj4, (j1v0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                dqm0.i((mm40) obj4, (l1v0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                yqm0.g((mm40) obj4, (m1v0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                msm0.f((mm40) obj4, (n1v0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                ewm0.o((mm40) obj4, (m0x) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 8:
                qtv0 qtv0Var = (qtv0) obj4;
                l7m0 l7m0Var2 = (l7m0) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    btm0.a(jm40.b, (jtv0) l7m0Var2.getValue(), zsm0.j(qtv0Var), ((jtv0) l7m0Var2.getValue()).b, fetVar2, 6, 0);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 9:
                ((Integer) obj2).getClass();
                luv0.a((mm40) obj4, (ywv0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 10:
                ugd ugdVar = (ugd) obj4;
                qwv0 qwv0Var = (qwv0) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ugdVar.F(qwv0Var, fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 11:
                jgc jgcVar = (jgc) obj4;
                Function1 function1 = (Function1) obj3;
                fwv0 fwv0Var = (fwv0) obj;
                kvv0 kvv0Var = (kvv0) obj2;
                fwv0Var.getClass();
                jgcVar.getClass();
                ConcurrentHashMap concurrentHashMap = fwv0Var.b;
                gwv0 gwv0Var = (gwv0) concurrentHashMap.get(jgcVar);
                if (gwv0Var != null) {
                    return (kvv0Var == null || gwv0Var.f12048a != kvv0Var) ? vsv0.c : vsv0.b;
                }
                concurrentHashMap.put(jgcVar, new gwv0(kvv0Var, function1));
                return vsv0.f37973a;
            default:
                xak xakVar = (xak) obj4;
                x39 x39Var = (x39) obj3;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    xakVar.o(jm40Var, x39Var.f40206a, fetVar4, 70);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ onu0(Object obj, Object obj2, int i, byte b) {
        this.f25566a = b;
        this.b = obj;
        this.c = obj2;
    }
}
