package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.cyber.section.impl.tournament_bracket.presentation.match_diaolog.model.CyberTournamentBracketMatchLabelPresetParams;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class chh implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4360a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ chh(a4x a4xVar, ugd ugdVar) {
        this.f4360a = (byte) 9;
        this.b = a4xVar;
        this.c = ugdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f4360a;
        jm40 jm40Var = jm40.b;
        byte b2 = 16;
        cl5 cl5Var = ukd.f35823a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                feb.e((mm40) obj4, (dhh) obj3, (fet) obj, x8x.L(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ahb.b((mm40) obj4, (CyberTournamentBracketMatchLabelPresetParams) obj3, (fet) obj, x8x.L(65));
                break;
            case 2:
                ((Integer) obj2).getClass();
                j120.n((jjh) obj4, (Function1) obj3, (fet) obj, x8x.L(9));
                break;
            case 3:
                ((Integer) obj2).getClass();
                vtb.h((mm40) obj4, (inh) obj3, (fet) obj, x8x.L(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                wvb.i((mm40) obj4, (qnh) obj3, (fet) obj, x8x.L(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                wvb.I((mm40) obj4, (aoh) obj3, (fet) obj, x8x.L(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                wvb.H((mm40) obj4, (ynh) obj3, (fet) obj, x8x.L(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                wzb.A((n0x) obj4, (String) obj3, (fet) obj, x8x.L(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                d5c.b((mm40) obj4, (eph) obj3, (fet) obj, x8x.L(1));
                break;
            case 9:
                a4x a4xVar = (a4x) obj4;
                ugd ugdVar = (ugd) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarV = vic.v(jm40Var);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarM = s5x0.M(mm40VarV, 8.0f, 8.0f, 8.0f, 16.0f);
                    x5d x5dVarA = w5d.a(new qw3(16.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarM);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, x5dVarA, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    fetVar.e0(775882915);
                    Iterator it = CollectionsKt.D0(a4xVar, 5).iterator();
                    while (it.hasNext()) {
                        xbc.d((jph) it.next(), fetVar, 0);
                    }
                    fetVar.r(false);
                    ugdVar.F(jm40Var, fetVar, 6);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                break;
            case 10:
                ((Integer) obj2).getClass();
                vcc.b((mm40) obj4, (xph) obj3, (fet) obj, x8x.L(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                agc.j((mm40) obj4, (cqh) obj3, (fet) obj, x8x.L(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                acb.i((mm40) obj4, (jph) obj3, (fet) obj, x8x.L(1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                jcb.d((mm40) obj4, (oqh) obj3, (fet) obj, x8x.L(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                rcb.n((mm40) obj4, (yqh) obj3, (fet) obj, x8x.L(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                y860.H((ewh) obj4, (xk80) obj3, (fet) obj, x8x.L(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                y860.q((ewh) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                ju70.n((pxh) obj4, (Function1) obj3, (fet) obj, x8x.L(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                gq80.d((mm40) obj4, (dzh) obj3, (fet) obj, x8x.L(1));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Integer) obj2).getClass();
                jiq0.S((mm40) obj4, (zx30) obj3, (fet) obj, x8x.L(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                jiq0.T((by30) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                jiq0.U((ay30) obj4, (Function0) obj3, (fet) obj, x8x.L(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                n4c.d((mm40) obj4, (f2i) obj3, (fet) obj, x8x.L(1));
                break;
            case 23:
                ((Integer) obj2).getClass();
                qcc.d((mm40) obj4, (n3i) obj3, (fet) obj, x8x.L(1));
                break;
            case 24:
                Function1 function1 = (Function1) obj4;
                k9n k9nVar = (k9n) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarJ = s5x0.J(o7k0.n(jm40Var, 44.0f), 12.0f);
                    boolean zG = fetVar2.g(function1) | fetVar2.g(k9nVar);
                    Object objP = fetVar2.P();
                    if (zG || objP == cl5Var) {
                        objP = new vef(function1, k9nVar, b2);
                        fetVar2.o0(objP);
                    }
                    dww.c(a8k0.F(R.drawable.ic_glyph_plus_small, 0, fetVar2), null, y860.W(mm40VarJ, null, null, false, null, (Function0) objP, 28), ((ThemeColors) fetVar2.k(zaq0.b)).getPrimary(), fetVar2, 56, 0);
                } else {
                    fetVar2.X();
                }
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((Integer) obj2).getClass();
                obb.D((mm40) obj4, (h9n) obj3, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                s9n s9nVar = (s9n) obj4;
                Function1 function2 = (Function1) obj3;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    o0x o0xVarR = s9nVar.r();
                    o0x o0xVarW = s9nVar.w();
                    boolean zG2 = fetVar3.g(function2);
                    Object objP2 = fetVar3.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new olh(function2, (byte) 7);
                        fetVar3.o0(objP2);
                    }
                    ibm0.e(o0xVarR, o0xVarW, (Function1) objP2, phu0.d, u1c.M(-709972733, new tx(s9nVar, b2), fetVar3), fetVar3, 27648);
                } else {
                    fetVar3.X();
                }
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj2).getClass();
                vdb.q((mm40) obj4, (y9n) obj3, (fet) obj, x8x.L(1));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                j2j j2jVar = (j2j) obj4;
                Throwable th = (Throwable) obj3;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((String) obj2).getClass();
                if ((th2 instanceof SocketTimeoutException) || (th2 instanceof ConnectException) || (th2 instanceof UnknownHostException) || (th2 instanceof zhi0) || (th2 instanceof IllegalArgumentException)) {
                    j2jVar.y();
                } else {
                    th.printStackTrace();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                kpb.e((mm40) obj4, (bfj) obj3, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ chh(Object obj, Object obj2, byte b) {
        this.f4360a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ chh(Object obj, Object obj2, int i, byte b) {
        this.f4360a = b;
        this.b = obj;
        this.c = obj2;
    }
}
