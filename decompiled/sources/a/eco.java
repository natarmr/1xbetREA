package a;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class eco implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7576a = 1;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ pz40 c;
    public final /* synthetic */ xk80 d;
    public final /* synthetic */ vne e;
    public final /* synthetic */ Function1 f;

    public /* synthetic */ eco(pz40 pz40Var, xk80 xk80Var, vne vneVar, l7m0 l7m0Var, Function1 function1) {
        this.c = pz40Var;
        this.d = xk80Var;
        this.e = vneVar;
        this.b = l7m0Var;
        this.f = function1;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0134  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        i4 i4VarR0;
        a4x a4xVar;
        int i;
        i4 i4VarR1;
        a4x a4xVar2;
        int i2;
        byte b = this.f7576a;
        cl5 cl5Var = ukd.f35823a;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objP = fetVar.P();
                    l7m0 l7m0Var = this.b;
                    if (objP == cl5Var) {
                        gkw gkwVar = (gkw) l7m0Var.getValue();
                        if (gkwVar == null || (a4xVar = gkwVar.b) == null) {
                            i4VarR0 = lak0.c;
                        } else {
                            ArrayList arrayList = new ArrayList(r3d.q(a4xVar, 10));
                            Iterator<E> it = a4xVar.iterator();
                            while (it.hasNext()) {
                                CyberGamesPage cyberGamesPage = ((ekw) it.next()).f7971a;
                                if (cyberGamesPage != null) {
                                    if (cyberGamesPage instanceof CyberGamesPage.Real) {
                                        i = R.drawable.ic_sport_cyber_sport_40;
                                    } else if (cyberGamesPage instanceof CyberGamesPage.Virtual) {
                                        i = R.drawable.ic_sport_boardgames_157;
                                    } else if (cyberGamesPage instanceof CyberGamesPage.OneXCyber) {
                                        i = R.drawable.ic_glyph_football_1;
                                    }
                                    arrayList.add(Integer.valueOf(i));
                                }
                                t9f.b();
                                return null;
                            }
                            i4VarR0 = dyb.r0(arrayList);
                            if (i4VarR0 == null) {
                                i4VarR0 = lak0.c;
                            }
                        }
                        objP = new mjw(jjw.f16637a, i4VarR0);
                        fetVar.o0(objP);
                    }
                    mjw mjwVar = (mjw) objP;
                    xk80 xk80Var = this.d;
                    boolean zG = fetVar.g(xk80Var);
                    vne vneVar = this.e;
                    boolean zI = zG | fetVar.i(vneVar) | fetVar.g(l7m0Var);
                    Function1 function1 = this.f;
                    boolean zG2 = zI | fetVar.g(function1);
                    Object objP2 = fetVar.P();
                    if (zG2 || objP2 == cl5Var) {
                        cyj cyjVar = new cyj(xk80Var, vneVar, l7m0Var, function1, (byte) 1);
                        fetVar.o0(cyjVar);
                        objP2 = cyjVar;
                    }
                    v3c.x(null, mjwVar, this.c, (Function1) objP2, fetVar, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l7m0 l7m0Var2 = this.b;
                    gkw gkwVar2 = (gkw) l7m0Var2.getValue();
                    if (gkwVar2 == null || (a4xVar2 = gkwVar2.b) == null) {
                        i4VarR1 = lak0.c;
                    } else {
                        ArrayList arrayList2 = new ArrayList(r3d.q(a4xVar2, 10));
                        Iterator<E> it2 = a4xVar2.iterator();
                        while (it2.hasNext()) {
                            CyberGamesPage cyberGamesPage2 = ((ekw) it2.next()).f7971a;
                            if (cyberGamesPage2 != null) {
                                if (cyberGamesPage2 instanceof CyberGamesPage.Real) {
                                    i2 = R.drawable.ic_sport_cyber_sport_40;
                                } else if (cyberGamesPage2 instanceof CyberGamesPage.Virtual) {
                                    i2 = R.drawable.ic_sport_boardgames_157;
                                } else if (cyberGamesPage2 instanceof CyberGamesPage.OneXCyber) {
                                    i2 = R.drawable.ic_glyph_football_1;
                                }
                                arrayList2.add(Integer.valueOf(i2));
                            }
                            t9f.b();
                            return null;
                        }
                        i4VarR1 = dyb.r0(arrayList2);
                        if (i4VarR1 == null) {
                            i4VarR1 = lak0.c;
                        }
                    }
                    mjw mjwVar2 = new mjw(kjw.f18407a, i4VarR1);
                    xk80 xk80Var2 = this.d;
                    boolean zG3 = fetVar2.g(xk80Var2);
                    vne vneVar2 = this.e;
                    boolean zI2 = zG3 | fetVar2.i(vneVar2) | fetVar2.g(l7m0Var2);
                    Function1 function2 = this.f;
                    boolean zG4 = zI2 | fetVar2.g(function2);
                    Object objP3 = fetVar2.P();
                    if (zG4 || objP3 == cl5Var) {
                        cyj cyjVar2 = new cyj(xk80Var2, vneVar2, l7m0Var2, function2, (byte) 2);
                        fetVar2.o0(cyjVar2);
                        objP3 = cyjVar2;
                    }
                    v3c.x(null, mjwVar2, this.c, (Function1) objP3, fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ eco(l7m0 l7m0Var, pz40 pz40Var, xk80 xk80Var, vne vneVar, Function1 function1) {
        this.b = l7m0Var;
        this.c = pz40Var;
        this.d = xk80Var;
        this.e = vneVar;
        this.f = function1;
    }
}
