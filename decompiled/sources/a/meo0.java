package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class meo0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21657a;

    /* JADX WARN: Code duplicated, block: B:82:0x01a2  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        gga agaVar;
        l0l0 l0l0Var;
        switch (this.f21657a) {
            case 0:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                pz40 pz40Var = s6t0.f31722a;
                fhl.u(fhlVar, s6t0.b().f33626a.getBackgroundGroup(), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.f46060a;
            case 1:
                deo0 deo0Var = (deo0) obj;
                deo0Var.getClass();
                return deo0Var.f5959a;
            case 2:
                deo0 deo0Var2 = (deo0) obj;
                deo0Var2.getClass();
                return deo0Var2.f5959a;
            case 3:
                List<w8r0> list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (w8r0 w8r0Var : list) {
                    arrayList.add(new ceo0(w8r0Var.f38737a, w8r0Var.b));
                }
                return dyb.o0(arrayList);
            case 4:
                n1g n1gVar = (n1g) obj;
                rq2 rq2Var = new rq2();
                n1gVar.getClass();
                n1gVar.e = rq2Var;
                n1gVar.f = l1g.OPEN_SCREEN;
                n1gVar.g = k1g.OPEN_REGULAR;
                return Unit.f46060a;
            case 5:
                n1g n1gVar2 = (n1g) obj;
                rq2 rq2Var2 = new rq2();
                n1gVar2.getClass();
                n1gVar2.e = rq2Var2;
                n1gVar2.f = l1g.OPEN_SCREEN;
                n1gVar2.g = k1g.OPEN_REGULAR;
                n1gVar2.d = j1g.REAL;
                return Unit.f46060a;
            case 6:
                ((ou90) obj).getClass();
                return Unit.f46060a;
            case 7:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                cbi0.b(abi0Var, new m0x(R.drawable.ic_sport_league_of_legends_106, null, 6));
                return Unit.f46060a;
            case 8:
                o8w o8wVar = (o8w) obj;
                o8wVar.getClass();
                return o8wVar.getKey();
            case 9:
                ((Float) obj).getClass();
                return Unit.f46060a;
            case 10:
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                uag0Var.e(28);
                return Unit.f46060a;
            case 11:
                kyo0 kyo0Var = (kyo0) obj;
                kyo0Var.getClass();
                String str = kyo0Var.b;
                String str2 = kyo0Var.c;
                str2.getClass();
                if (!kotlin.text.c.x(str2, ujn.h, false)) {
                    if (str2.length() == 0) {
                        str2 = "";
                    } else {
                        List list2 = u0d.f34849a;
                        if (u0d.c(str2)) {
                            str2 = "";
                        } else {
                            str2 = String.format(Locale.ENGLISH, StringsKt.O(str2, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str2}, 2));
                        }
                    }
                }
                c280 c280Var = new c280(str2, R.drawable.ic_glyph_placeholder_player);
                String string = "";
                long j = kyo0Var.d;
                if (j != 0) {
                    bzu bzuVarE = rz4.e("static", "img", "TeamBet", "sportIcon3d");
                    rz4.s(j, ".png", bzuVarE);
                    string = ((StringBuilder) bzuVarE.b).toString();
                }
                return new q6n(str, c280Var, new n0x(string), kyo0Var.g, kyo0Var.f);
            case 12:
                p6t0 p6t0Var = (p6t0) obj;
                p6t0Var.getClass();
                return p6t0Var.getKey();
            case 13:
                p6t0 p6t0Var2 = (p6t0) obj;
                p6t0Var2.getClass();
                return sre0.f32672a.b(p6t0Var2.getClass());
            case 14:
                nzo0 nzo0Var = (nzo0) obj;
                v5l0 v5l0Var = nzo0Var != null ? nzo0Var.c : yzo0.f43525a;
                boolean z = nzo0Var != null ? nzo0Var.f : false;
                lc00 lc00VarB = kotlin.collections.a.b();
                lc00VarB.add(new l0p0("TEAM_BET_NEAREST_HEADER", new ijm()));
                int iOrdinal = v5l0Var.ordinal();
                if (iOrdinal == 0) {
                    agaVar = new aga();
                } else if (iOrdinal == 1) {
                    agaVar = new ega();
                } else if (iOrdinal == 2) {
                    agaVar = new dga();
                } else if (iOrdinal == 3) {
                    agaVar = new cga();
                } else {
                    if (iOrdinal != 4) {
                        t9f.b();
                        return null;
                    }
                    agaVar = new bga();
                }
                lc00VarB.add(new b1p0(agaVar, z));
                lc00VarB.add(new l0p0("TEAM_BET_UPCOMING_HEADER", new ijm()));
                for (int i = 0; i < 4; i++) {
                    int iOrdinal2 = v5l0Var.ordinal();
                    if (iOrdinal2 == 0) {
                        l0l0Var = g0l0.f10465a;
                    } else if (iOrdinal2 == 1) {
                        l0l0Var = k0l0.f17474a;
                    } else if (iOrdinal2 == 2) {
                        l0l0Var = j0l0.f15687a;
                    } else if (iOrdinal2 == 3) {
                        l0l0Var = i0l0.f13953a;
                    } else {
                        if (iOrdinal2 != 4) {
                            t9f.b();
                            return null;
                        }
                        l0l0Var = h0l0.f12241a;
                    }
                    lc00VarB.add(new qyo0(new x56(l0l0Var), z));
                }
                return dyb.o0(kotlin.collections.a.a(lc00VarB));
            case 15:
                sjd sjdVar = (sjd) obj;
                sjdVar.getClass();
                return new tzo0(sjdVar);
            case 16:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 17:
                s6p0 s6p0Var = (s6p0) obj;
                s6p0Var.getClass();
                return s6p0Var.getKey();
            case 18:
                y4p0 y4p0Var = (y4p0) obj;
                y4p0Var.getClass();
                return Integer.valueOf(y4p0Var.f42015a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                sjd sjdVar2 = (sjd) obj;
                sjdVar2.getClass();
                return new hbp0(sjdVar2);
            case 20:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new pgj0(cpVar, cpVar, (byte) 13));
                return Unit.f46060a;
            case 21:
                String str3 = (String) obj;
                str3.getClass();
                return cy7.e(str3);
            case 22:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                cpVar2.t(new pgj0(cpVar2, cpVar2, (byte) 14));
                return Unit.f46060a;
            case 23:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                return Unit.f46060a;
            case 24:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                th3.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                th4.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                th5.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                th6.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                th7.printStackTrace();
                return Unit.f46060a;
            default:
                ((Integer) obj).intValue();
                return r6q0.f29947a;
        }
    }

    public /* synthetic */ meo0(byte b) {
        this.f21657a = b;
    }
}
