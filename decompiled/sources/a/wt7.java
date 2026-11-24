package a;

import android.app.Application;
import android.content.ComponentCallbacks2;
import androidx.fragment.app.Fragment;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.sportgame.bets_on_players.api.navigation.BetsOnPlayersScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wt7 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39726a;
    public final /* synthetic */ au7 b;

    public /* synthetic */ wt7(au7 au7Var, byte b) {
        this.f39726a = b;
        this.b = au7Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f39726a;
        au7 au7Var = this.b;
        switch (b) {
            case 0:
                yk5 yk5Var = au7.U1;
                au7Var.H0().x(it7.f15342a);
                return Unit.f46060a;
            case 1:
                yk5 yk5Var2 = au7.U1;
                au7Var.H0().x(gt7.f11867a);
                return Unit.f46060a;
            case 2:
                yk5 yk5Var3 = au7.U1;
                au7Var.H0().x(ot7.f25816a);
                return Unit.f46060a;
            case 3:
                yk5 yk5Var4 = au7.U1;
                androidx.fragment.app.e eVarF = au7Var.F();
                while (eVarF != null) {
                    for (int iP = eVarF.P() - 1; iP >= 0; iP--) {
                        i0h0 i0h0VarJ = eVarF.J(eVarF.O(iP).i);
                        if (i0h0VarJ instanceof ocl0) {
                            pcl0 pcl0VarU = ((ocl0) i0h0VarJ).u(new wt7(au7Var, (byte) 7));
                            LinkedHashMap linkedHashMap = tt7.f34496a;
                            eai eaiVarA = tt7.a(dw9.o(au7Var.G0().f46987a, efx.v(au7Var).f4046a), new wt7(au7Var, (byte) 8));
                            LinkedHashMap linkedHashMap2 = st7.f32759a;
                            String strO = dw9.o(au7Var.G0().f46987a, efx.v(au7Var).f4046a);
                            tga0 tga0Var = (tga0) eaiVarA.g.get();
                            b8h0 b8h0VarA = eaiVarA.a();
                            hqp0 hqp0Var = (hqp0) eaiVarA.i.get();
                            tga0Var.getClass();
                            b8h0VarA.getClass();
                            hqp0Var.getClass();
                            LinkedHashMap linkedHashMap3 = st7.f32759a;
                            cai caiVar = (cai) linkedHashMap3.get(strO);
                            if (caiVar == null) {
                                ComponentCallbacks2 application = au7Var.n0().getApplication();
                                application.getClass();
                                af3 af3Var = application instanceof af3 ? (af3) application : null;
                                if (af3Var != null) {
                                    o5d0 o5d0Var = (o5d0) af3Var.d().get(ut7.class);
                                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                                    if (!(ze3Var instanceof ut7)) {
                                        ze3Var = null;
                                    }
                                    if (((ut7) ze3Var) != null) {
                                        caiVar = new cai(tga0Var, b8h0VarA, hqp0Var);
                                        linkedHashMap3.put(strO, caiVar);
                                    }
                                }
                                jf4.n(b1j.i(ut7.class, "Cannot create dependency "));
                                return null;
                            }
                            au7Var.O1 = caiVar;
                            ComponentCallbacks2 application2 = au7Var.n0().getApplication();
                            application2.getClass();
                            af3 af3Var2 = application2 instanceof af3 ? (af3) application2 : null;
                            if (af3Var2 != null) {
                                o5d0 o5d0Var2 = (o5d0) af3Var2.d().get(bu7.class);
                                ze3 ze3Var2 = o5d0Var2 != null ? (ze3) o5d0Var2.get() : null;
                                if (!(ze3Var2 instanceof bu7)) {
                                    ze3Var2 = null;
                                }
                                bu7 bu7Var = (bu7) ze3Var2;
                                if (bu7Var != null) {
                                    BetsOnPlayersScreenParams betsOnPlayersScreenParamsG0 = au7Var.G0();
                                    i1w0 i1w0VarF = a4n0.f(au7Var);
                                    cai caiVar2 = au7Var.O1;
                                    if (caiVar2 == null) {
                                        Intrinsics.h("betsOnPlayersFeature");
                                        throw null;
                                    }
                                    i1w0VarF.getClass();
                                    pcl0VarU.getClass();
                                    cad cadVar = bu7Var.f3217a;
                                    ctf0 ctf0Var = bu7Var.b;
                                    m1e m1eVar = bu7Var.c;
                                    pmi pmiVar = bu7Var.d;
                                    gst0 gst0Var = bu7Var.e;
                                    ntu ntuVar = bu7Var.f;
                                    xi70 xi70Var = bu7Var.g;
                                    s64 s64Var = bu7Var.h;
                                    kt2 kt2Var = bu7Var.i;
                                    pru pruVar = bu7Var.j;
                                    bzt bztVar = bu7Var.k;
                                    ctf0Var.getClass();
                                    m1eVar.getClass();
                                    gst0Var.getClass();
                                    kt2Var.getClass();
                                    return new dai(cadVar, pcl0VarU, eaiVarA, caiVar2, betsOnPlayersScreenParamsG0, i1w0VarF, ctf0Var, m1eVar, pmiVar, gst0Var, ntuVar, xi70Var, s64Var, kt2Var, pruVar, bztVar);
                                }
                            }
                            jf4.n(b1j.i(bu7.class, "Cannot create dependency "));
                            return null;
                        }
                    }
                    Fragment fragment = au7Var.y;
                    eVarF = fragment != null ? fragment.F() : null;
                }
                jf4.n("Can't find feature provider!");
                return null;
            case 4:
                yk5 yk5Var5 = au7.U1;
                au7Var.H0().x(jt7.f17086a);
                return Unit.f46060a;
            case 5:
                yk5 yk5Var6 = au7.U1;
                au7Var.H0().x(pt7.f27550a);
                return Unit.f46060a;
            case 6:
                yk5 yk5Var7 = au7.U1;
                fiu0 fiu0Var = au7Var.Q1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 7:
                yk5 yk5Var8 = au7.U1;
                Application application3 = au7Var.n0().getApplication();
                application3.getClass();
                return application3;
            default:
                yk5 yk5Var9 = au7.U1;
                Application application4 = au7Var.n0().getApplication();
                application4.getClass();
                return application4;
        }
    }
}
