package a;

import android.javax.sip.message.Response;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final class anw implements ydr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1175a;
    public final /* synthetic */ List b;
    public final /* synthetic */ List c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ anw(List list, List list2, Function1 function1, byte b) {
        this.f1175a = b;
        this.b = list;
        this.c = list2;
        this.d = function1;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        wui0 wui0Var;
        int i2;
        wui0 wui0Var2;
        int i3;
        wui0 wui0Var3;
        byte b = this.f1175a;
        cl5 cl5Var = ukd.f35823a;
        List list = this.c;
        List list2 = this.b;
        Function1 function1 = this.d;
        switch (b) {
            case 0:
                g9z g9zVar = (g9z) obj;
                int iIntValue = ((Number) obj2).intValue();
                fet fetVar = (fet) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar.g(g9zVar) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= fetVar.e(iIntValue) ? 32 : 16;
                }
                if (fetVar.U(i & 1, (i & 147) != 146)) {
                    zmw zmwVar = (zmw) list2.get(iIntValue);
                    fetVar.e0(1336493675);
                    String str = zmwVar.f44645a;
                    zfn zfnVar = zaq0.b;
                    tui0 tui0Var = new tui0(str, new y3d(((ThemeColors) fetVar.k(zfnVar)).getTextPrimary()));
                    nui0 nui0Var = new nui0(Integer.valueOf(R.drawable.ic_star_filled), null, new m0x(zmwVar.b.b, null, 6), new y3d(((ThemeColors) fetVar.k(zfnVar)).getPrimary()), null, new pc5(new y3d(((ThemeColors) fetVar.k(zfnVar)).getBackground())), 0.0f, 210);
                    if (list.size() == 1) {
                        wui0Var = wui0.f39793a;
                    } else if (iIntValue == 0) {
                        wui0Var = wui0.b;
                    } else {
                        wui0Var = iIntValue == list.size() - 1 ? wui0.d : wui0.c;
                    }
                    rqm rqmVar = new rqm((vui0) tui0Var, (pui0) nui0Var, (pvi0) null, (d4d) null, (tvi0) qvi0.f29388a, wui0Var, false, (e900) null, Response.CONDITIONAL_REQUEST_FAILED);
                    boolean zG = fetVar.g(function1) | fetVar.g(zmwVar);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new nsr(function1, zmwVar, (byte) 11);
                        fetVar.o0(objP);
                    }
                    obc.q(null, rqmVar, false, null, (Function0) objP, null, null, null, fetVar, 384, 233);
                    fetVar.r(false);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                g9z g9zVar2 = (g9z) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                fet fetVar2 = (fet) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (fetVar2.g(g9zVar2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= fetVar2.e(iIntValue3) ? 32 : 16;
                }
                if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
                    j240 j240Var = (j240) list2.get(iIntValue3);
                    fetVar2.e0(1400760004);
                    String str2 = j240Var.b;
                    zfn zfnVar2 = zaq0.b;
                    tui0 tui0Var2 = new tui0(str2, new y3d(((ThemeColors) fetVar2.k(zfnVar2)).getTextPrimary()));
                    nui0 nui0Var2 = new nui0(Integer.valueOf(R.drawable.ic_star_filled), null, new m0x(j240Var.f15765a.getF47018a(), null, 6), new y3d(((ThemeColors) fetVar2.k(zfnVar2)).getPrimary()), null, new pc5(new y3d(((ThemeColors) fetVar2.k(zfnVar2)).getBackground())), 0.0f, 210);
                    if (list.size() == 1) {
                        wui0Var2 = wui0.f39793a;
                    } else if (iIntValue3 == 0) {
                        wui0Var2 = wui0.b;
                    } else {
                        wui0Var2 = iIntValue3 == list.size() - 1 ? wui0.d : wui0.c;
                    }
                    rqm rqmVar2 = new rqm((vui0) tui0Var2, (pui0) nui0Var2, (pvi0) null, (d4d) null, (tvi0) qvi0.f29388a, wui0Var2, false, (e900) null, Response.CONDITIONAL_REQUEST_FAILED);
                    boolean zG2 = fetVar2.g(function1) | fetVar2.g(j240Var);
                    Object objP2 = fetVar2.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new puh(function1, j240Var, (byte) 1);
                        fetVar2.o0(objP2);
                    }
                    obc.q(null, rqmVar2, true, null, (Function0) objP2, null, null, null, fetVar2, 384, 233);
                    fetVar2.r(false);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                g9z g9zVar3 = (g9z) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                fet fetVar3 = (fet) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = iIntValue6 | (fetVar3.g(g9zVar3) ? 4 : 2);
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= fetVar3.e(iIntValue5) ? 32 : 16;
                }
                if (fetVar3.U(i3 & 1, (i3 & 147) != 146)) {
                    j240 j240Var2 = (j240) list2.get(iIntValue5);
                    fetVar3.e0(-424455337);
                    String str3 = j240Var2.b;
                    zfn zfnVar3 = zaq0.b;
                    tui0 tui0Var3 = new tui0(str3, new y3d(((ThemeColors) fetVar3.k(zfnVar3)).getTextPrimary()));
                    nui0 nui0Var3 = new nui0(Integer.valueOf(R.drawable.ic_star_filled), null, new m0x(j240Var2.f15765a.getF47018a(), null, 6), new y3d(((ThemeColors) fetVar3.k(zfnVar3)).getPrimary()), null, new pc5(new y3d(((ThemeColors) fetVar3.k(zfnVar3)).getBackground())), 0.0f, 210);
                    if (iIntValue5 == 0) {
                        wui0Var3 = wui0.b;
                    } else {
                        wui0Var3 = iIntValue5 == list.size() + (-1) ? wui0.d : wui0.c;
                    }
                    rqm rqmVar3 = new rqm((vui0) tui0Var3, (pui0) nui0Var3, (pvi0) null, (d4d) null, (tvi0) qvi0.f29388a, wui0Var3, false, (e900) null, Response.CONDITIONAL_REQUEST_FAILED);
                    boolean zG3 = fetVar3.g(function1) | fetVar3.g(j240Var2);
                    Object objP3 = fetVar3.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new puh(function1, j240Var2, (byte) 2);
                        fetVar3.o0(objP3);
                    }
                    obc.q(null, rqmVar3, true, null, (Function0) objP3, null, null, null, fetVar3, 384, 233);
                    fetVar3.r(false);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
