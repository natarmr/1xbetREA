package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gho0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11310a;
    public final /* synthetic */ jho0 b;

    public /* synthetic */ gho0(jho0 jho0Var, byte b) {
        this.f11310a = b;
        this.b = jho0Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00cc  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f11310a;
        String str = "menu_games";
        jho0 jho0Var = this.b;
        switch (b) {
            case 0:
                y2m0 y2m0Var = jho0.R1;
                jho0Var.H0().B();
                return Unit.f46060a;
            case 1:
                y2m0 y2m0Var2 = jho0.R1;
                rio0 rio0VarH0 = jho0Var.H0();
                tzi tziVar = rio0VarH0.W;
                wv10 wv10VarO = cww.O(rio0VarH0.z());
                String strG = rio0VarH0.V.g();
                tziVar.getClass();
                s64 s64Var = (s64) tziVar.b;
                kt2 kt2Var = ((ag3) tziVar.h).f809a;
                int iOrdinal = wv10VarO.ordinal();
                if (iOrdinal == 0) {
                    i8i.D("screen", "menu_sport", kt2Var, "reg_page_call");
                    s64Var.d(y1p.MENU_SPORT, strG);
                } else if (iOrdinal == 1) {
                    i8i.D("screen", "menu_aggregator", kt2Var, "reg_page_call");
                    s64Var.d(y1p.MENU_AGGREGATOR, strG);
                } else if (iOrdinal == 2) {
                    i8i.D("screen", "menu_1xgames", kt2Var, "reg_page_call");
                    s64Var.d(y1p.MENU_ONE_XGAMES, strG);
                } else if (iOrdinal == 3) {
                    i8i.D("screen", "menu_other", kt2Var, "reg_page_call");
                    s64Var.d(y1p.MENU_OTHER, strG);
                } else if (iOrdinal == 4) {
                    i8i.D("screen", "menu_top", kt2Var, "reg_page_call");
                    s64Var.d(y1p.MENU_TOP, strG);
                }
                return Unit.f46060a;
            case 2:
                y2m0 y2m0Var3 = jho0.R1;
                rio0 rio0VarH1 = jho0Var.H0();
                tzi tziVar2 = rio0VarH1.W;
                wv10 wv10VarO2 = cww.O(rio0VarH1.z());
                tziVar2.getClass();
                s64 s64Var2 = (s64) tziVar2.b;
                kt2 kt2Var2 = ((ag3) tziVar2.h).f809a;
                int iOrdinal2 = wv10VarO2.ordinal();
                if (iOrdinal2 == 0) {
                    i8i.D("screen", "menu_sport", kt2Var2, "login_page_call");
                    y1p y1pVar = y1p.MAIN;
                    s64Var2.c("menu_sport");
                } else if (iOrdinal2 == 1) {
                    i8i.D("screen", "menu_aggregator", kt2Var2, "login_page_call");
                    y1p y1pVar2 = y1p.MAIN;
                    s64Var2.c("menu_aggregator");
                } else if (iOrdinal2 == 2) {
                    i8i.D("screen", "menu_1xgames", kt2Var2, "login_page_call");
                    y1p y1pVar3 = y1p.MAIN;
                    s64Var2.c("menu_games");
                } else if (iOrdinal2 == 3) {
                    i8i.D("screen", "menu_other", kt2Var2, "login_page_call");
                    y1p y1pVar4 = y1p.MAIN;
                    s64Var2.c("menu_other");
                } else if (iOrdinal2 == 4) {
                    i8i.D("screen", "menu_top", kt2Var2, "login_page_call");
                    y1p y1pVar5 = y1p.MAIN;
                    s64Var2.c("menu_top");
                }
                return Unit.f46060a;
            case 3:
                y2m0 y2m0Var4 = jho0.R1;
                rio0 rio0VarH2 = jho0Var.H0();
                tzi tziVar3 = rio0VarH2.W;
                wv10 wv10VarO3 = cww.O(rio0VarH2.z());
                String strG2 = rio0VarH2.V.g();
                tziVar3.getClass();
                kt2 kt2Var3 = ((ih5) tziVar3.i).f14765a;
                int iOrdinal3 = wv10VarO3.ordinal();
                if (iOrdinal3 != 0) {
                    if (iOrdinal3 == 1) {
                        i8i.D("screen", "menu_aggregator", kt2Var3, "deposit_call");
                    } else if (iOrdinal3 == 2) {
                        i8i.D("screen", "menu_1xgames", kt2Var3, "deposit_call");
                    } else if (iOrdinal3 == 3) {
                        i8i.D("screen", "menu_other", kt2Var3, "deposit_call");
                    } else if (iOrdinal3 == 4) {
                        i8i.D("screen", "menu_top", kt2Var3, "deposit_call");
                    } else if (iOrdinal3 == 5) {
                        i8i.D("screen", "menu_aggregator", kt2Var3, "deposit_call");
                    } else {
                        t9f.b();
                    }
                    return null;
                }
                i8i.D("screen", "menu_sport", kt2Var3, "deposit_call");
                l7k l7kVar = (l7k) tziVar3.f;
                int iOrdinal4 = wv10VarO3.ordinal();
                if (iOrdinal4 == 0) {
                    y1p y1pVar6 = y1p.MAIN;
                    str = "menu_sport";
                } else if (iOrdinal4 == 1) {
                    y1p y1pVar7 = y1p.MAIN;
                    str = "menu_aggregator";
                } else if (iOrdinal4 == 2) {
                    y1p y1pVar8 = y1p.MAIN;
                } else if (iOrdinal4 == 3) {
                    y1p y1pVar9 = y1p.MAIN;
                    str = "menu_other";
                } else if (iOrdinal4 == 4) {
                    y1p y1pVar10 = y1p.MAIN;
                    str = "menu_top";
                } else {
                    if (iOrdinal4 != 5) {
                        t9f.b();
                        return null;
                    }
                    str = "";
                }
                l7kVar.b(str, strG2);
                return Unit.f46060a;
            case 4:
                y2m0 y2m0Var5 = jho0.R1;
                rio0 rio0VarH3 = jho0Var.H0();
                rio0VarH3.W.t(cww.O(rio0VarH3.z()));
                return Unit.f46060a;
            case 5:
                y2m0 y2m0Var6 = jho0.R1;
                ComponentCallbacks2 application = jho0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(kho0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof kho0)) {
                        ze3Var = null;
                    }
                    kho0 kho0Var = (kho0) ze3Var;
                    if (kho0Var != null) {
                        return kho0Var.a(a4n0.f(jho0Var), (r040) jho0Var.O1.n(jho0Var, jho0.S1[1]));
                    }
                }
                jf4.n(b1j.i(kho0.class, "Cannot create dependency "));
                return null;
            default:
                y2m0 y2m0Var7 = jho0.R1;
                return (awi) ((cwi) jho0Var.M1.getValue()).A.get();
        }
    }
}
