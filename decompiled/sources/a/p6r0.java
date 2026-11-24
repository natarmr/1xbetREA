package a;

import android.app.Application;
import android.content.Context;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.special_event.impl.top_players.presentation.model.TopPlayersSearchModel;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class p6r0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26471a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p6r0(Object obj, byte b) {
        this.f26471a = b;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2) {
        Object value;
        yrr0 yrr0Var = (yrr0) this.b;
        ((Throwable) obj).getClass();
        ((String) obj2).getClass();
        bby bbyVar = yrr0Var.y;
        if (bbyVar != null) {
            v3c.N(bbyVar);
        }
        v3c.N(yrr0Var.z);
        ra10 ra10VarA = yrr0Var.s.a(pb10.g, R.string.data_retrieval_error, R.string.try_again_text, new qir0(yrr0Var, (byte) 5), ((wrr0) yrr0Var.D()).c);
        p7m0 p7m0Var = yrr0Var.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            yrr0Var.f.getClass();
        } while (!p7m0Var.m(value, wrr0.a((wrr0) value, grq0.f11794a, new gqq0(ra10VarA), 0L, 12)));
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2) {
        a8z a8zVar = ((ytr0) this.b).O1;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        m6m0 m6m0Var = ytr0.P1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            aur0 aur0Var = (aur0) ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar).getValue();
            k3t0 k3t0Var = (k3t0) a8zVar.getValue();
            boolean zI = fetVar.i(k3t0Var);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                mjr0 mjr0Var = new mjr0(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 16);
                fetVar.o0(mjr0Var);
                objP = mjr0Var;
            }
            ro4.W(null, aur0Var, (Function1) ((jhy) objP), fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object c(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        rsm0.f((zxr0) this.b, (fet) obj, x8x.L(7));
        return Unit.f46060a;
    }

    private final Object g(Object obj, Object obj2) {
        a8z a8zVar = ((afs0) this.b).N1;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        g9m0 g9m0Var = afs0.P1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar);
            k3t0 k3t0Var = (k3t0) a8zVar.getValue();
            boolean zI = fetVar.i(k3t0Var);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                las0 las0Var = new las0(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 4);
                fetVar.o0(las0Var);
                objP = las0Var;
            }
            ohm0.f(0, fetVar, null, pz40VarY, (Function1) ((jhy) objP));
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2) {
        gjs0 gjs0Var = (gjs0) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        j6m0 j6m0Var = gjs0.R1;
        byte b = 2;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean zI = fetVar.i(gjs0Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            byte b2 = 3;
            if (zI || objP == cl5Var) {
                objP = new djs0(gjs0Var, b2);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zI2 = fetVar.i(gjs0Var);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                objP2 = new djs0(gjs0Var, (byte) 4);
                fetVar.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            pz40 pz40VarY = ((i3t0) gjs0Var.G0()).y(fetVar);
            boolean zI3 = fetVar.i(gjs0Var);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var) {
                objP3 = new ejs0(gjs0Var, b);
                fetVar.o0(objP3);
            }
            f1t0.J(pz40VarY, (Function1) objP3, fetVar, 0);
            k3t0 k3t0VarG0 = gjs0Var.G0();
            boolean zI4 = fetVar.i(gjs0Var);
            Object objP4 = fetVar.P();
            if (zI4 || objP4 == cl5Var) {
                objP4 = new ejs0(gjs0Var, b2);
                fetVar.o0(objP4);
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP4, fetVar);
            boolean zI5 = fetVar.i(k3t0VarG0) | fetVar.i(gjs0Var) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP5 = fetVar.P();
            if (zI5 || objP5 == cl5Var) {
                tmj0 tmj0Var = new tmj0(k3t0VarG0, gjs0Var, pz40VarF, null, (byte) 21);
                fetVar.o0(tmj0Var);
                objP5 = tmj0Var;
            }
            m0x0.t(fetVar, gjs0Var, (Function2) objP5);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object i(Object obj, Object obj2) {
        a8z a8zVar = ((ojs0) this.b).M1;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        m6m0 m6m0Var = ojs0.P1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar);
            k3t0 k3t0Var = (k3t0) a8zVar.getValue();
            boolean zI = fetVar.i(k3t0Var);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                las0 las0Var = new las0(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 5);
                fetVar.o0(las0Var);
                objP = las0Var;
            }
            cwr0.H(pz40VarY, (Function1) ((jhy) objP), fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object l(Object obj, Object obj2) {
        Object value;
        zjs0 zjs0Var = (zjs0) this.b;
        ((Throwable) obj).getClass();
        ((String) obj2).getClass();
        p7m0 p7m0Var = zjs0Var.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            zjs0Var.f.getClass();
        } while (!p7m0Var.m(value, tjs0.a((tjs0) value, false, true)));
        return Unit.f46060a;
    }

    private final Object m(Object obj, Object obj2) {
        lss0 lss0Var = (lss0) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            mm40 mm40VarK0 = mrv.k0(jm40.b, "TEXT_ID");
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK0);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(new daq0(qmk.s));
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            x7z x7zVar = new x7z(1.0f, false);
            String str = lss0Var.f20597a;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar.k(zfnVar)).getClass();
            y9q0 y9q0VarJ = g1t0.j();
            zfn zfnVar2 = m8m0.f21378a;
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(zfnVar2)).m123getWhite0d7_KjU();
            n05 n05Var = new n05(qmk.p, qmk.s, qmk.n);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new dbo0(pz40Var, (byte) 9);
                fetVar.o0(objP2);
            }
            v8q0.a(str, x7zVar, jM123getWhite0d7_KjU, n05Var, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, (Function1) objP2, y9q0VarJ, fetVar, 0, 1597824, 45040);
            String str2 = lss0Var.b;
            ((g1t0) fetVar.k(zfnVar)).getClass();
            v8q0.a(str2, null, ((StaticColors) fetVar.k(zfnVar2)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0.a(g1t0.j(), 0L, ((daq0) pz40Var.getValue()).f5764a, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777213), fetVar, 0, 24960, 110586);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object o(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        j5n0.p((dus0) this.b, (fet) obj, x8x.L(1));
        return Unit.f46060a;
    }

    private final Object p(Object obj, Object obj2) {
        fus0 fus0Var = (fus0) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            j5n0.p(fus0Var.b, fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object r(Object obj, Object obj2) {
        m5t0 m5t0Var = (m5t0) this.b;
        a8z a8zVar = m5t0Var.P1;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        wxs0 wxs0Var = m5t0.R1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            u5t0 u5t0Var = (u5t0) ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar).getValue();
            k3t0 k3t0Var = (k3t0) a8zVar.getValue();
            boolean zI = fetVar.i(k3t0Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                las0 las0Var = new las0(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 10);
                fetVar.o0(las0Var);
                objP = las0Var;
            }
            m0x0.G(u5t0Var, (Function1) ((jhy) objP), fetVar, 0);
            k3t0 k3t0Var2 = (k3t0) a8zVar.getValue();
            boolean zI2 = fetVar.i(m5t0Var);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                objP2 = new lcr0(m5t0Var, (byte) 23);
                fetVar.o0(objP2);
            }
            clz clzVar = (clz) fetVar.k(or00.f25714a);
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP2, fetVar);
            boolean zI3 = fetVar.i(k3t0Var2) | fetVar.i(clzVar) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var) {
                kc70 kc70Var = new kc70(k3t0Var2, clzVar, pz40VarF, null, (byte) 29);
                fetVar.o0(kc70Var);
                objP3 = kc70Var;
            }
            m0x0.t(fetVar, clzVar, (Function2) objP3);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object s(Object obj, Object obj2) {
        g9t0 g9t0Var = (g9t0) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        svs0 svs0Var = g9t0.U1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean zI = fetVar.i(g9t0Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new f9t0(g9t0Var, (byte) 1);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zI2 = fetVar.i(g9t0Var);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                objP2 = new f9t0(g9t0Var, (byte) 2);
                fetVar.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            k3t0 k3t0VarG0 = g9t0Var.G0();
            boolean zI3 = fetVar.i(g9t0Var);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var) {
                las0 las0Var = new las0(1, g9t0Var, g9t0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/cyber/section/impl/championships/universal/presentation/main/model/UniversalChampSideEffect;)V", 0, (byte) 11);
                fetVar.o0(las0Var);
                objP3 = las0Var;
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP3), fetVar);
            boolean zI4 = fetVar.i(k3t0VarG0) | fetVar.i(g9t0Var) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP4 = fetVar.P();
            if (zI4 || objP4 == cl5Var) {
                tmj0 tmj0Var = new tmj0(k3t0VarG0, g9t0Var, pz40VarF, null, (byte) 22);
                fetVar.o0(tmj0Var);
                objP4 = tmj0Var;
            }
            m0x0.t(fetVar, g9t0Var, (Function2) objP4);
            pz40 pz40VarY = ((i3t0) g9t0Var.G0()).y(fetVar);
            qdz qdzVar = g9t0Var.R1;
            boolean zI5 = fetVar.i(g9t0Var);
            Object objP5 = fetVar.P();
            if (zI5 || objP5 == cl5Var) {
                objP5 = new e9t0(g9t0Var, (byte) 1);
                fetVar.o0(objP5);
            }
            Function1 function1 = (Function1) objP5;
            boolean zI6 = fetVar.i(g9t0Var);
            Object objP6 = fetVar.P();
            if (zI6 || objP6 == cl5Var) {
                objP6 = new e9t0(g9t0Var, (byte) 2);
                fetVar.o0(objP6);
            }
            ofm0.h(pz40VarY, qdzVar, function1, (Function1) objP6, fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object t(Object obj, Object obj2) {
        y9t0 y9t0Var = (y9t0) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        sxs0 sxs0Var = y9t0.Q1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean zI = fetVar.i(y9t0Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new x9t0(y9t0Var, (byte) 1);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zI2 = fetVar.i(y9t0Var);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                objP2 = new x9t0(y9t0Var, (byte) 2);
                fetVar.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            pz40 pz40VarY = ((i3t0) ((k3t0) y9t0Var.N1.getValue())).y(fetVar);
            qdz qdzVar = y9t0Var.O1;
            boolean zI3 = fetVar.i(y9t0Var);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var) {
                objP3 = new lcr0(y9t0Var, (byte) 24);
                fetVar.o0(objP3);
            }
            s5x0.x(pz40VarY, qdzVar, (Function1) objP3, fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object u(Object obj, Object obj2) {
        uat0 uat0Var = (uat0) this.b;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        uxs0 uxs0Var = uat0.Q1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean zI = fetVar.i(uat0Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                objP = new tat0(uat0Var, (byte) 1);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zI2 = fetVar.i(uat0Var);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                objP2 = new tat0(uat0Var, (byte) 2);
                fetVar.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            pz40 pz40VarY = ((i3t0) ((k3t0) uat0Var.N1.getValue())).y(fetVar);
            qdz qdzVar = uat0Var.O1;
            boolean zI3 = fetVar.i(uat0Var);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var) {
                objP3 = new lcr0(uat0Var, (byte) 27);
                fetVar.o0(objP3);
            }
            cfx0.z(pz40VarY, qdzVar, (Function1) objP3, fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        Object value2;
        ejr0 ejr0Var;
        byte b = this.f26471a;
        byte b2 = 4;
        cl5 cl5Var = ukd.f35823a;
        byte b3 = 2;
        byte b4 = 3;
        byte b5 = 0;
        byte b6 = 1;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                r6r0 r6r0Var = (r6r0) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s2m0 s2m0Var = r6r0.S1;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    k3t0 k3t0VarG0 = r6r0Var.G0();
                    boolean zI = fetVar.i(r6r0Var);
                    Object objP = fetVar.P();
                    if (zI || objP == cl5Var) {
                        w6q0 w6q0Var = new w6q0(1, r6r0Var, r6r0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/feed/popular/presentation/top_games/compose/topgamescontaner/models/TopGamesContainerSideEffect;)V", 0, (byte) 22);
                        fetVar.o0(w6q0Var);
                        objP = w6q0Var;
                    }
                    lkz lkzVar = lkz.f20223a;
                    pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                    boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(r6r0Var) | fetVar.e(3) | fetVar.g(pz40VarF);
                    Object objP2 = fetVar.P();
                    if (zI2 || objP2 == cl5Var) {
                        tmj0 tmj0Var = new tmj0(k3t0VarG0, r6r0Var, pz40VarF, null, (byte) 13);
                        fetVar.o0(tmj0Var);
                        objP2 = tmj0Var;
                    }
                    m0x0.t(fetVar, r6r0Var, (Function2) objP2);
                    boolean zI3 = fetVar.i(r6r0Var);
                    Object objP3 = fetVar.P();
                    if (zI3 || objP3 == cl5Var) {
                        objP3 = new o6r0(r6r0Var, b4);
                        fetVar.o0(objP3);
                    }
                    Function0 function0 = (Function0) objP3;
                    boolean zI4 = fetVar.i(r6r0Var);
                    Object objP4 = fetVar.P();
                    if (zI4 || objP4 == cl5Var) {
                        objP4 = new o6r0(r6r0Var, b2);
                        fetVar.o0(objP4);
                    }
                    v3c.A(function0, (Function0) objP4, null, fetVar, 0, 4);
                    pz40 pz40VarY = ((i3t0) r6r0Var.G0()).y(fetVar);
                    k3t0 k3t0VarG1 = r6r0Var.G0();
                    boolean zI5 = fetVar.i(k3t0VarG1);
                    Object objP5 = fetVar.P();
                    if (zI5 || objP5 == cl5Var) {
                        w6q0 w6q0Var2 = new w6q0(1, k3t0VarG1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 23);
                        fetVar.o0(w6q0Var2);
                        objP5 = w6q0Var2;
                    }
                    y860.T(pz40VarY, (Function1) ((jhy) objP5), fetVar, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                v9r0 v9r0Var = (v9r0) obj3;
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                j6m0 j6m0Var = v9r0.O1;
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    zfn zfnVar = dy2.b;
                    Context context = (Context) fetVar2.k(zfnVar);
                    boolean zI6 = fetVar2.i(context);
                    Object objP6 = fetVar2.P();
                    if (zI6 || objP6 == cl5Var) {
                        objP6 = new hrf0(context, (byte) 25);
                        fetVar2.o0(objP6);
                    }
                    Function0 function1 = (Function0) objP6;
                    boolean zI7 = fetVar2.i(context);
                    Object objP7 = fetVar2.P();
                    if (zI7 || objP7 == cl5Var) {
                        objP7 = new hrf0(context, (byte) 26);
                        fetVar2.o0(objP7);
                    }
                    v3c.z(function1, (Function0) objP7, null, fetVar2, 0, 4);
                    String name = txi.class.getName();
                    Context applicationContext = ((Context) fetVar2.k(zfnVar)).getApplicationContext();
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        throw new ss3((byte) 0);
                    }
                    riu0 riu0VarA = ms00.a(fetVar2);
                    if (riu0VarA == null) {
                        throw new tiu0();
                    }
                    Object objP8 = fetVar2.P();
                    byte b7 = 17;
                    if (objP8 == cl5Var) {
                        objP8 = new ywm0(application, v9r0Var, b7);
                        fetVar2.o0(objP8);
                    }
                    Function0 function2 = (Function0) objP8;
                    boolean zG = fetVar2.g(riu0VarA) | fetVar2.g(name);
                    Object objP9 = fetVar2.P();
                    if (zG || objP9 == cl5Var) {
                        ojg ojgVar = new ojg((byte) 1);
                        zfc zfcVar = new zfc(function2, (byte) 8);
                        tre0 tre0Var = sre0.f32672a;
                        ojgVar.a(tre0Var.b(kgd.class), zfcVar);
                        qbx qbxVarB = ojgVar.b();
                        piu0 piu0VarG = riu0VarA.g();
                        vbf vbfVar = vbf.b;
                        piu0VarG.getClass();
                        vbfVar.getClass();
                        objP9 = (kgd) new h0q0(piu0VarG, qbxVarB, vbfVar).t(tre0Var.b(kgd.class), name);
                        fetVar2.o0(objP9);
                    }
                    Object obj4 = ((kgd) objP9).b;
                    if (obj4 == null) {
                        hny.u("null cannot be cast to non-null type org.xplatform.special_event.impl.top_players.di.TopPlayersComponent");
                        return null;
                    }
                    txi txiVar = (txi) obj4;
                    sgy sgyVarB = sre0.f32672a.b(edr0.class);
                    q0h0 q0h0Var = new q0h0((rxi) txiVar.p.get());
                    int i = edr0.B;
                    k3t0 k3t0VarX = n4c.X(sgyVarB, null, q0h0Var, fetVar2, 14);
                    boolean zI8 = fetVar2.i(v9r0Var) | fetVar2.i(k3t0VarX);
                    Object objP10 = fetVar2.P();
                    if (zI8 || objP10 == cl5Var) {
                        objP10 = new b8q0(v9r0Var, k3t0VarX, b7);
                        fetVar2.o0(objP10);
                    }
                    lkz lkzVar2 = lkz.f20223a;
                    pz40 pz40VarF2 = androidx.compose.runtime.e.f((Function1) objP10, fetVar2);
                    boolean zI9 = fetVar2.i(k3t0VarX) | fetVar2.i(v9r0Var) | fetVar2.e(3) | fetVar2.g(pz40VarF2);
                    Object objP11 = fetVar2.P();
                    if (zI9 || objP11 == cl5Var) {
                        tmj0 tmj0Var2 = new tmj0(k3t0VarX, v9r0Var, pz40VarF2, null, (byte) 14);
                        fetVar2.o0(tmj0Var2);
                        objP11 = tmj0Var2;
                    }
                    m0x0.t(fetVar2, v9r0Var, (Function2) objP11);
                    boolean zI10 = fetVar2.i(k3t0VarX);
                    Object objP12 = fetVar2.P();
                    if (zI10 || objP12 == cl5Var) {
                        objP12 = new dbh(k3t0VarX, (byte) 29);
                        fetVar2.o0(objP12);
                    }
                    Function0 function3 = (Function0) objP12;
                    boolean zI11 = fetVar2.i(k3t0VarX);
                    Object objP13 = fetVar2.P();
                    if (zI11 || objP13 == cl5Var) {
                        objP13 = new s9r0(k3t0VarX, b5);
                        fetVar2.o0(objP13);
                    }
                    v3c.A(function3, (Function0) objP13, null, fetVar2, 0, 4);
                    i3t0 i3t0Var = (i3t0) k3t0VarX;
                    pz40 pz40VarY2 = i3t0Var.y(fetVar2);
                    Object[] objArr = new Object[0];
                    boolean zG2 = fetVar2.g(pz40VarY2);
                    Object objP14 = fetVar2.P();
                    if (zG2 || objP14 == cl5Var) {
                        objP14 = new g7o0(pz40VarY2, (byte) 27);
                        fetVar2.o0(objP14);
                    }
                    obc.d(r9r0.f30099a.a(txiVar), u1c.M(-973351447, new znk(v3c.Y(objArr, (Function0) objP14, fetVar2), i3t0Var, pz40VarY2, b2), fetVar2), fetVar2, 48);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                a8z a8zVar = ((jbr0) obj3).N1;
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                g9m0 g9m0Var = jbr0.O1;
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    pz40 pz40VarY3 = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar3);
                    k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                    boolean zI12 = fetVar3.i(k3t0Var);
                    Object objP15 = fetVar3.P();
                    if (zI12 || objP15 == cl5Var) {
                        w6q0 w6q0Var3 = new w6q0(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 27);
                        fetVar3.o0(w6q0Var3);
                        objP15 = w6q0Var3;
                    }
                    ju70.H(pz40VarY3, (Function1) ((jhy) objP15), fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                a8z a8zVar2 = ((qbr0) obj3).N1;
                fet fetVar4 = (fet) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                s9m0 s9m0Var = qbr0.O1;
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    pz40 pz40VarY4 = ((i3t0) ((k3t0) a8zVar2.getValue())).y(fetVar4);
                    k3t0 k3t0Var2 = (k3t0) a8zVar2.getValue();
                    boolean zI13 = fetVar4.i(k3t0Var2);
                    Object objP16 = fetVar4.P();
                    if (zI13 || objP16 == cl5Var) {
                        w6q0 w6q0Var4 = new w6q0(1, k3t0Var2, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 28);
                        fetVar4.o0(w6q0Var4);
                        objP16 = w6q0Var4;
                    }
                    dqm0.f(pz40VarY4, (Function1) ((jhy) objP16), fetVar4, 0);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                dqm0.e((ubr0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 5:
                oyg0 oyg0Var = (oyg0) obj;
                dbr0 dbr0Var = (dbr0) obj2;
                oyg0Var.getClass();
                dbr0Var.getClass();
                String str = dbr0Var.e.b;
                str.getClass();
                TopPlayersSearchModel topPlayersSearchModel = new TopPlayersSearchModel(str, true);
                q7x.F(oyg0Var, topPlayersSearchModel, "SEARCH_MODEL_KEY");
                return dbr0.a(dbr0Var, false, topPlayersSearchModel, null, null, 479);
            case 6:
                ofr0 ofr0Var = (ofr0) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                ofr0Var.j0.e0();
                ofr0Var.Z();
                return Unit.f46060a;
            case 7:
                ser0 ser0Var = (ser0) obj2;
                ((oyg0) obj).getClass();
                ser0Var.getClass();
                return ser0.a(ser0Var, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new o8r0((n8r0) obj3, ser0Var.v.b), null, false, 14680063);
            case 8:
                a1r0 a1r0Var = (a1r0) obj3;
                ser0 ser0Var2 = (ser0) obj2;
                ((oyg0) obj).getClass();
                ser0Var2.getClass();
                a1r0Var.getClass();
                if (a1r0Var instanceof v0r0) {
                    v0r0 v0r0Var = (v0r0) a1r0Var;
                    return ser0.a(ser0Var2, null, ler0.b(ser0Var2.b, v0r0Var.f36595a, v0r0Var.b, 1), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 16777213);
                }
                if (a1r0Var instanceof l0r0) {
                    l0r0 l0r0Var = (l0r0) a1r0Var;
                    return ser0.a(ser0Var2, null, null, zyq0.b(ser0Var2.c, l0r0Var.f19217a, l0r0Var.b, 1), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 16777211);
                }
                if (a1r0Var instanceof t0r0) {
                    t0r0 t0r0Var = (t0r0) a1r0Var;
                    return ser0.a(ser0Var2, null, null, null, u8r0.b(ser0Var2.d, t0r0Var.f33134a, t0r0Var.b, 1), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 16777207);
                }
                if (a1r0Var instanceof y0r0) {
                    y0r0 y0r0Var = (y0r0) a1r0Var;
                    return ser0.a(ser0Var2, null, null, null, null, c4r0.b(ser0Var2.e, y0r0Var.f41823a, y0r0Var.b, 1), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 16777199);
                }
                if (a1r0Var instanceof x0r0) {
                    x0r0 x0r0Var = (x0r0) a1r0Var;
                    return ser0.a(ser0Var2, null, null, null, null, null, qer0.b(ser0Var2.f, x0r0Var.f40085a, x0r0Var.b, 1), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 16777183);
                }
                if (a1r0Var instanceof w0r0) {
                    w0r0 w0r0Var = (w0r0) a1r0Var;
                    return ser0.a(ser0Var2, null, null, null, null, null, null, per0.b(ser0Var2.g, w0r0Var.f38365a, w0r0Var.b, 1), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 16777151);
                }
                if (a1r0Var instanceof u0r0) {
                    her0 her0Var = ser0Var2.h;
                    u0r0 u0r0Var = (u0r0) a1r0Var;
                    h1r0 h1r0Var = u0r0Var.f34869a;
                    List list = u0r0Var.b;
                    ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Long.valueOf(((rbb) it.next()).f30176a));
                    }
                    return ser0.a(ser0Var2, null, null, null, null, null, null, null, her0.b(her0Var, h1r0Var, list, CollectionsKt.P0(arrayList), 1), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 16777087);
                }
                if (a1r0Var instanceof j0r0) {
                    hyq0 hyq0Var = ser0Var2.i;
                    j0r0 j0r0Var = (j0r0) a1r0Var;
                    List list2 = j0r0Var.b;
                    h1r0 h1r0Var2 = j0r0Var.f15695a;
                    lc00 lc00VarB = kotlin.collections.a.b();
                    ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(Boolean.valueOf(lc00VarB.addAll(((vh0) it2.next()).l)));
                    }
                    return ser0.a(ser0Var2, null, null, null, null, null, null, null, null, hyq0.b(hyq0Var, h1r0Var2, list2, kotlin.collections.a.a(lc00VarB), 1), null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 16776959);
                }
                if (a1r0Var instanceof h0r0) {
                    h0r0 h0r0Var = (h0r0) a1r0Var;
                    return ser0.a(ser0Var2, null, null, null, null, null, null, null, null, null, zxq0.b(ser0Var2.j, h0r0Var.f12249a, h0r0Var.b, 1), null, null, null, null, null, null, null, null, null, null, null, null, null, false, 16776703);
                }
                if (a1r0Var instanceof r0r0) {
                    r0r0 r0r0Var = (r0r0) a1r0Var;
                    return ser0.a(ser0Var2, null, null, null, null, null, null, null, null, null, null, s8r0.b(ser0Var2.k, r0r0Var.f29645a, r0r0Var.b, 1), null, null, null, null, null, null, null, null, null, null, null, null, false, 16776191);
                }
                if (a1r0Var instanceof s0r0) {
                    s0r0 s0r0Var = (s0r0) a1r0Var;
                    return ser0.a(ser0Var2, null, null, null, null, null, null, null, null, null, null, null, t8r0.b(ser0Var2.l, s0r0Var.f31423a, s0r0Var.b, 1), null, null, null, null, null, null, null, null, null, null, null, false, 16775167);
                }
                if (a1r0Var instanceof g0r0) {
                    g0r0 g0r0Var = (g0r0) a1r0Var;
                    return ser0.a(ser0Var2, null, null, null, null, null, null, null, null, null, null, null, null, xxq0.b(ser0Var2.m, g0r0Var.f10473a, g0r0Var.b, 1), null, null, null, null, null, null, null, null, null, null, false, 16773119);
                }
                if (a1r0Var instanceof k0r0) {
                    iyq0 iyq0Var = ser0Var2.n;
                    k0r0 k0r0Var = (k0r0) a1r0Var;
                    xdr0 xdr0Var = ser0Var2.w;
                    if (!xdr0Var.s && xdr0Var.E) {
                        b5 = 1;
                    }
                    return ser0.a(ser0Var2, null, null, null, null, null, null, null, null, null, null, null, null, null, iyq0.b(iyq0Var, b5 != 0 ? k0r0Var.f17483a : i1r0.f14014a, b5 != 0 ? k0r0Var.b : iun.f15405a, 1), null, null, null, null, null, null, null, null, null, false, 16769023);
                }
                if (a1r0Var instanceof i0r0) {
                    i0r0 i0r0Var = (i0r0) a1r0Var;
                    return ser0.a(ser0Var2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, eyq0.b(ser0Var2.o, i0r0Var.f13961a, i0r0Var.b, 1), null, null, null, null, null, null, null, null, false, 16760831);
                }
                if (a1r0Var instanceof z0r0) {
                    pfr0 pfr0Var = ser0Var2.p;
                    z0r0 z0r0Var = (z0r0) a1r0Var;
                    List list3 = z0r0Var.b;
                    h1r0 h1r0Var3 = z0r0Var.f43584a;
                    lc00 lc00VarB2 = kotlin.collections.a.b();
                    ArrayList arrayList3 = new ArrayList(r3d.q(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(Boolean.valueOf(lc00VarB2.addAll(((vh0) it3.next()).l)));
                    }
                    return ser0.a(ser0Var2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, pfr0.b(pfr0Var, h1r0Var3, list3, kotlin.collections.a.a(lc00VarB2), 1), null, null, null, null, null, null, null, false, 16744447);
                }
                if (a1r0Var instanceof q0r0) {
                    q0r0 q0r0Var = (q0r0) a1r0Var;
                    return ser0.a(ser0Var2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, n2r0.b(ser0Var2.q, q0r0Var.f27917a, q0r0Var.b, 1), null, null, null, null, null, null, false, 16711679);
                }
                if (a1r0Var instanceof p0r0) {
                    p0r0 p0r0Var = (p0r0) a1r0Var;
                    return ser0.a(ser0Var2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, b3r0.b(ser0Var2.r, p0r0Var.f26168a, p0r0Var.b, 1), null, null, null, null, null, false, 16646143);
                }
                if (a1r0Var instanceof o0r0) {
                    o0r0 o0r0Var = (o0r0) a1r0Var;
                    return ser0.a(ser0Var2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, a3r0.b(ser0Var2.s, o0r0Var.f24442a, o0r0Var.b, 1), null, null, null, null, false, 16515071);
                }
                if (a1r0Var instanceof n0r0) {
                    n0r0 n0r0Var = (n0r0) a1r0Var;
                    return ser0.a(ser0Var2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, j2r0.b(ser0Var2.t, n0r0Var.f22714a, n0r0Var.b, 1), null, null, null, false, 16252927);
                }
                if (a1r0Var instanceof m0r0) {
                    m0r0 m0r0Var = (m0r0) a1r0Var;
                    return ser0.a(ser0Var2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, h2r0.b(ser0Var2.u, m0r0Var.f20969a, m0r0Var.b, 1), null, null, false, 15728639);
                }
                t9f.b();
                return null;
            case 9:
                fir0 fir0Var = (fir0) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                bby bbyVar = fir0Var.V;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                p7m0 p7m0Var = fir0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    fir0Var.f.getClass();
                } while (!p7m0Var.m(value, yhr0.a((yhr0) value, ihr0.f14795a, null, null, false, false, 0L, 0L, null, 510)));
                fir0Var.N.a();
                return Unit.f46060a;
            case 10:
                njr0 njr0Var = (njr0) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                v3c.N(njr0Var.M);
                p7m0 p7m0Var2 = njr0Var.G;
                do {
                    value2 = p7m0Var2.getValue();
                    ejr0Var = new ejr0(njr0Var.d.a(pb10.g, R.string.data_retrieval_error, R.string.try_again_text, new cym0(0, njr0Var, njr0.class, "onLottieRetryButtonClicked", "onLottieRetryButtonClicked()V", 0, (byte) 19), ((Number) njr0Var.H.getValue()).longValue()));
                } while (!p7m0Var2.m(value2, cjr0.a((cjr0) value2, njr0Var.y(ejr0Var), ejr0Var, false, 4)));
                njr0Var.D.a();
                return Unit.f46060a;
            case 11:
                return a(obj, obj2);
            case 12:
                psr0 psr0Var = (psr0) obj3;
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                v3c.N(psr0Var.J);
                psr0Var.Q();
                return Unit.f46060a;
            case 13:
                return b(obj, obj2);
            case 14:
                ((Integer) obj2).getClass();
                hhm0.h((pwr0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 15:
                ((Integer) obj2).getClass();
                qim0.f((ywr0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 16:
                ((Integer) obj2).getClass();
                qsm0.n((uxr0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 17:
                return c(obj, obj2);
            case 18:
                return g(obj, obj2);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return h(obj, obj2);
            case 20:
                return i(obj, obj2);
            case 21:
                return l(obj, obj2);
            case 22:
                return m(obj, obj2);
            case 23:
                return o(obj, obj2);
            case 24:
                return p(obj, obj2);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return r(obj, obj2);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return s(obj, obj2);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return t(obj, obj2);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return u(obj, obj2);
            default:
                obt0 obt0Var = (obt0) obj3;
                fet fetVar5 = (fet) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                wxs0 wxs0Var = obt0.R1;
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zI14 = fetVar5.i(obt0Var);
                    Object objP17 = fetVar5.P();
                    if (zI14 || objP17 == cl5Var) {
                        objP17 = new nbt0(obt0Var, b6);
                        fetVar5.o0(objP17);
                    }
                    Function0 function4 = (Function0) objP17;
                    boolean zI15 = fetVar5.i(obt0Var);
                    Object objP18 = fetVar5.P();
                    if (zI15 || objP18 == cl5Var) {
                        objP18 = new nbt0(obt0Var, b3);
                        fetVar5.o0(objP18);
                    }
                    v3c.z(function4, (Function0) objP18, null, fetVar5, 0, 4);
                    k3t0 k3t0VarG2 = obt0Var.G0();
                    boolean zI16 = fetVar5.i(obt0Var);
                    Object objP19 = fetVar5.P();
                    if (zI16 || objP19 == cl5Var) {
                        las0 las0Var = new las0(1, obt0Var, obt0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/cyber/section/impl/championships/universal/presentation/results/model/UniversalChampResultsSideEffect;)V", 0, (byte) 12);
                        fetVar5.o0(las0Var);
                        objP19 = las0Var;
                    }
                    lkz lkzVar3 = lkz.f20223a;
                    pz40 pz40VarF3 = androidx.compose.runtime.e.f((Function1) ((jhy) objP19), fetVar5);
                    boolean zI17 = fetVar5.i(k3t0VarG2) | fetVar5.i(obt0Var) | fetVar5.e(3) | fetVar5.g(pz40VarF3);
                    Object objP20 = fetVar5.P();
                    if (zI17 || objP20 == cl5Var) {
                        tmj0 tmj0Var3 = new tmj0(k3t0VarG2, obt0Var, pz40VarF3, null, (byte) 23);
                        fetVar5.o0(tmj0Var3);
                        objP20 = tmj0Var3;
                    }
                    m0x0.t(fetVar5, obt0Var, (Function2) objP20);
                    pz40 pz40VarY5 = ((i3t0) obt0Var.G0()).y(fetVar5);
                    qdz qdzVar = obt0Var.P1;
                    boolean zI18 = fetVar5.i(obt0Var);
                    Object objP21 = fetVar5.P();
                    if (zI18 || objP21 == cl5Var) {
                        objP21 = new lcr0(obt0Var, (byte) 28);
                        fetVar5.o0(objP21);
                    }
                    wb.F(pz40VarY5, qdzVar, (Function1) objP21, fetVar5, 0);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ p6r0(Object obj, int i, byte b) {
        this.f26471a = b;
        this.b = obj;
    }
}
