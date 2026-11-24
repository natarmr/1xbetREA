package a;

import android.javax.sip.message.Response;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qb implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28421a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qb(ku4 ku4Var, Function1 function1, pz40 pz40Var) {
        this.f28421a = (byte) 18;
        this.b = ku4Var;
        this.d = function1;
        this.c = pz40Var;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        i4 i4Var = (i4) this.c;
        pq5 pq5Var = (pq5) this.b;
        Function1 function1 = (Function1) this.d;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((g9z) obj).getClass();
        byte b = 0;
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            boolean zIsEmpty = i4Var.isEmpty();
            mm40 mm40VarL = jm40.b;
            if (!zIsEmpty || (pq5Var instanceof oq5)) {
                zcl zclVar = qmk.f28987a;
                mm40VarL = s5x0.L(mm40VarL, 0.0f, 8.0f, 1);
            }
            lq5 lq5VarA = pq5Var.a();
            boolean z = pq5Var instanceof oq5;
            boolean zG = fetVar.g(function1);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new ag0(function1, b);
                fetVar.o0(objP);
            }
            etl.e(mm40VarL, i4Var, lq5VarA, z, null, 0.0f, 0, null, (Function2) objP, fetVar, 0, 240);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        mm40 mm40Var = (mm40) this.c;
        mdm mdmVar = (mdm) this.b;
        Function1 function1 = (Function1) this.d;
        g9z g9zVar = (g9z) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        g9zVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(g9zVar) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            mm40 mm40VarB = g9z.b(g9zVar, o7k0.d(jm40.b, 1.0f), null, 7);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarB);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarN = s5x0.N(mm40Var, 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar, false), 7);
            boolean zG = fetVar.g(function1);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new dn(function1, (byte) 18);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarN, mdmVar, false, (Function0) objP, fetVar, 0, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object c(Object obj, Object obj2, Object obj3) {
        pz40 pz40Var = (pz40) this.c;
        wul wulVar = (wul) this.d;
        t42 t42Var = (t42) this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        jdk0 jdk0Var = t42.p2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            mm40 mm40VarV = cjx.V(jm40.b, a8k0.G(xczVarA, fetVar), null);
            zcl zclVar = qmk.f28987a;
            lh80 lh80Var = new lh80(16.0f, 8.0f, 16.0f, 8.0f);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean zG = fetVar.g(pz40Var) | fetVar.g(wulVar) | fetVar.i(t42Var);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new on((Object) pz40Var, (Object) wulVar, (Object) t42Var, (byte) 10);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarV, xczVarA, lh80Var, qw3Var, null, null, false, null, (Function1) objP, fetVar, 0, Response.NOT_ACCEPTABLE_HERE);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        long coefHigher;
        db8 db8Var = (db8) this.c;
        t6k t6kVar = (t6k) this.d;
        vz40 vz40Var = (vz40) this.b;
        p53 p53Var = (p53) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        p53Var.getClass();
        byte b = 2;
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(p53Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            int iOrdinal = db8Var.ordinal();
            if (iOrdinal == 0) {
                pz40 pz40Var = s6t0.f31722a;
                coefHigher = s6t0.b().b.getCoefHigher();
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return null;
                }
                pz40 pz40Var2 = s6t0.f31722a;
                coefHigher = s6t0.b().b.getCoefLower();
            }
            y9q0 y9q0Var = new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
            g9q0 g9q0VarN = pym0.n(fetVar);
            boolean zG = fetVar.g(y9q0Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = Integer.valueOf((int) (g9q0.a(g9q0VarN, "Hg", y9q0Var, 0, 0, 0L, null, 1020).c & 4294967295L));
                fetVar.o0(objP);
            }
            int iIntValue2 = ((Number) objP).intValue();
            boolean zF = fetVar.f(coefHigher);
            Object objP2 = fetVar.P();
            if (zF || objP2 == cl5Var) {
                objP2 = new zt(vz40Var, coefHigher, b);
                fetVar.o0(objP2);
            }
            nia0.h(null, p53Var, t6kVar, iIntValue2, (Function0) objP2, fetVar, (iIntValue << 3) & 112);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        ku4 ku4Var = (ku4) this.b;
        Function1 function1 = (Function1) this.d;
        l7m0 l7m0Var = (l7m0) this.c;
        hh80 hh80Var = (hh80) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        hh80Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(hh80Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            vs4 vs4Var = (vs4) l7m0Var.getValue();
            jkm jkmVar = (jkm) ku4Var.H.getValue();
            boolean zI = fetVar.i(ku4Var);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zI || objP == cl5Var) {
                f8 f8Var = new f8(0, ku4Var, ku4.class, "onSwipeRefreshed", "onSwipeRefreshed()V", 0, (byte) 23);
                fetVar.o0(f8Var);
                objP = f8Var;
            }
            jhy jhyVar = (jhy) objP;
            boolean zI2 = fetVar.i(ku4Var);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                j94 j94Var = new j94(1, ku4Var, ku4.class, "confirm", "confirm(Lorg/xplatform/authenticator/impl/ui/fragments/authenticator/models/AuthenticatorActiveUiItem;)V", 0, (byte) 16);
                fetVar.o0(j94Var);
                objP2 = j94Var;
            }
            jhy jhyVar2 = (jhy) objP2;
            boolean zI3 = fetVar.i(ku4Var);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var) {
                j94 j94Var2 = new j94(1, ku4Var, ku4.class, "decline", "decline(Lorg/xplatform/authenticator/impl/ui/fragments/authenticator/models/AuthenticatorActiveUiItem;)V", 0, (byte) 17);
                fetVar.o0(j94Var2);
                objP3 = j94Var2;
            }
            jhy jhyVar3 = (jhy) objP3;
            boolean zI4 = fetVar.i(ku4Var);
            Object objP4 = fetVar.P();
            if (zI4 || objP4 == cl5Var) {
                j94 j94Var3 = new j94(1, ku4Var, ku4.class, "onRemoveFilterClick", "onRemoveFilterClick(Lorg/xplatform/authenticator/impl/domain/models/notifications/FilterItem;)V", 0, (byte) 18);
                fetVar.o0(j94Var3);
                objP4 = j94Var3;
            }
            jhy jhyVar4 = (jhy) objP4;
            boolean zI5 = fetVar.i(ku4Var);
            Object objP5 = fetVar.P();
            if (zI5 || objP5 == cl5Var) {
                f8 f8Var2 = new f8(0, ku4Var, ku4.class, "onBackToBets", "onBackToBets()V", 0, (byte) 24);
                fetVar.o0(f8Var2);
                objP5 = f8Var2;
            }
            knx.o(vs4Var, jkmVar, (Function0) jhyVar, (Function1) jhyVar2, (Function1) jhyVar3, function1, (Function1) jhyVar4, (Function0) ((jhy) objP5), s5x0.I(i120.Q(jm40.b, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n), hh80Var), fetVar, 0);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        String str = (String) this.d;
        y9q0 y9q0Var = (y9q0) this.b;
        l7m0 l7m0Var = (l7m0) this.c;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((u63) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            v8q0.a(str, o2e.e0(jm40.b, "PLACEHOLDER_CONTAINER_TEXT"), ((y3d) l7m0Var.getValue()).f41946a, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0Var, fetVar, 48, 24960, 110584);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object l(Object obj, Object obj2, Object obj3) {
        String str = (String) this.c;
        xdr xdrVar = (xdr) this.d;
        String str2 = (String) this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((bpq) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar.k(zfnVar)).getClass();
            y9q0 y9q0VarG = g1t0.g();
            zfn zfnVar2 = zaq0.b;
            v8q0.a(str, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(y9q0VarG, ((ThemeColors) fetVar.k(zfnVar2)).getSecondary(), 0L, null, null, null, 0L, new j56(0.5f), null, 3, 0, 0L, null, null, 16744190), fetVar, 0, 24960, 110590);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40.b);
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
            if (xdrVar == null) {
                fetVar.e0(611986200);
            } else {
                fetVar.e0(-1365731831);
                xdrVar.F(zhg0.f44392a, fetVar, 6);
            }
            fetVar.r(false);
            ((g1t0) fetVar.k(zfnVar)).getClass();
            v8q0.a(str2, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, y9q0.a(g1t0.a(), ((ThemeColors) fetVar.k(zfnVar2)).getCommerce(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, sw6.f32905a, null, 16252926), fetVar, 0, 24576, 114686);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        xj7 xj7Var = (xj7) this.c;
        xcz xczVar = (xcz) this.b;
        tj7 tj7Var = (tj7) this.d;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        gl5 gl5Var = tj7.t2;
        ((y5d) obj).getClass();
        if (!fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            fetVar.X();
        } else if (Intrinsics.d(xj7Var, vj7.f37512a)) {
            fetVar.e0(1480243013);
            fetVar.r(false);
        } else if (xj7Var instanceof wj7) {
            fetVar.e0(-1356824627);
            mm40 mm40VarV = cjx.V(jm40.b, a8k0.G(xczVar, fetVar), null);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(mm40VarV, 16.0f);
            boolean zG = fetVar.g(xj7Var) | fetVar.i(tj7Var);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new qo5(xj7Var, tj7Var, (byte) 29);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarJ, xczVar, null, null, null, null, false, null, (Function1) objP, fetVar, 0, 508);
            fetVar.r(false);
        } else {
            fetVar.e0(-1350646079);
            fetVar.r(false);
        }
        return Unit.f46060a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        q99 q99Var = (q99) this.d;
        o2i0 o2i0Var = (o2i0) this.b;
        pfw pfwVar = s99.l;
        Object obj4 = this.c;
        if (obj4 != pfwVar) {
            vdx.E(q99Var.b, obj4, o2i0Var.f24531a);
        }
        return Unit.f46060a;
    }

    private final Object p(Object obj, Object obj2, Object obj3) {
        ljc ljcVar = jd8.n;
        dk5 dk5Var = (dk5) this.d;
        l7m0 l7m0Var = (l7m0) this.c;
        l7m0 l7m0Var2 = (l7m0) this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((g9z) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            boolean z = ((lh5) l7m0Var.getValue()) instanceof jh5;
            jm40 jm40Var = jm40.b;
            cl5 cl5Var = ukd.f35823a;
            if (z) {
                fetVar.e0(1491614345);
                lh5 lh5Var = (lh5) l7m0Var.getValue();
                lh5Var.getClass();
                jh5 jh5Var = (jh5) lh5Var;
                mm40 mm40VarN = s5x0.N(i120.Q(jm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), ljcVar), xfn.a(fetVar).e, 0.0f, xfn.a(fetVar).e, 0.0f, 10);
                String str = jh5Var.b;
                double d = jh5Var.c;
                String str2 = jh5Var.d;
                boolean zI = fetVar.i(dk5Var);
                Object objP = fetVar.P();
                if (zI || objP == cl5Var) {
                    objP = new uj5(dk5Var, (byte) 6);
                    fetVar.o0(objP);
                }
                gq80.a(mm40VarN, str, d, str2, (Function0) objP, fetVar, 0);
                fetVar = fetVar;
                fetVar.r(false);
            } else {
                fetVar.e0(1492555164);
                fetVar.r(false);
            }
            mm40 mm40VarN2 = s5x0.N(i120.Q(o7k0.d(jm40Var, 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), ljcVar), xfn.a(fetVar).d, 0.0f, xfn.a(fetVar).d, 0.0f, 10);
            boolean zI2 = fetVar.i(dk5Var);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == cl5Var) {
                objP2 = new uj5(dk5Var, (byte) 7);
                fetVar.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean zI3 = fetVar.i(dk5Var);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == cl5Var) {
                objP3 = new uj5(dk5Var, (byte) 8);
                fetVar.o0(objP3);
            }
            i120.a(0, fetVar, mm40VarN2, function0, (Function0) objP3, ((gk5) l7m0Var2.getValue()).f11429a, ((gk5) l7m0Var2.getValue()).b);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object r(Object obj, Object obj2, Object obj3) {
        rod rodVar = (rod) this.c;
        pz40 pz40Var = (pz40) this.d;
        Function2 function2 = (Function2) this.b;
        mm40 mm40Var = (mm40) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        mm40Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(mm40Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            obc.d(afp0.f790a.a(w6n.h), u1c.M(-108087724, new gf9((Object) mm40Var, (Object) rodVar, (Object) pz40Var, (Object) function2, (byte) 12), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object s(Object obj, Object obj2, Object obj3) {
        Function1 function1 = (Function1) this.d;
        Function1 function2 = (Function1) this.c;
        Function2 function3 = (Function2) this.b;
        p6t0 p6t0Var = (p6t0) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        p6t0Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(p6t0Var) ? 4 : 2;
        }
        byte b = 18;
        if (!fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            fetVar.X();
        } else if (p6t0Var instanceof ncg) {
            fetVar.e0(-2103796210);
            vbc.m(null, (ncg) p6t0Var, fetVar, (iIntValue << 3) & 112);
            fetVar.r(false);
        } else if (p6t0Var instanceof bcg) {
            fetVar.e0(-2103793743);
            bcg bcgVar = (bcg) p6t0Var;
            boolean zG = fetVar.g(function1);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new omf(function1, b);
                fetVar.o0(objP);
            }
            obc.g(null, bcgVar, (Function1) objP, function2, function3, fetVar, (iIntValue << 3) & 112);
            fetVar.r(false);
        } else {
            fetVar.e0(-792870446);
            fetVar.r(false);
        }
        return Unit.f46060a;
    }

    private final Object t(Object obj, Object obj2, Object obj3) {
        z6h z6hVar = (z6h) this.c;
        i3t0 i3t0Var = (i3t0) this.d;
        ugd ugdVar = (ugd) this.b;
        String str = (String) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(str) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            boolean zI = fetVar.i(z6hVar) | fetVar.i(i3t0Var);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new v4f(z6hVar, i3t0Var, (byte) 26);
                fetVar.o0(objP);
            }
            m0x0.o(z6hVar, (Function1) objP, fetVar);
            ugdVar.F(str, fetVar, Integer.valueOf(iIntValue & 14));
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object u(Object obj, Object obj2, Object obj3) {
        d9z d9zVar = (d9z) this.c;
        wmh wmhVar = (wmh) this.b;
        Function1 function1 = (Function1) this.d;
        lr8 lr8Var = (lr8) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        lr8Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(lr8Var) ? 4 : 2;
        }
        byte b = 1;
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            float fD = lr8Var.d();
            ngv ngvVar = new ngv(3);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(o7k0.e(mm40VarD, 256.0f), "CYBER_TOURNAMENT_CARD_COLLECTION_RECTANGLE");
            lh80 lh80VarT = s5x0.t(8.0f, 0.0f, 2);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            qw3 qw3Var2 = new qw3(8.0f, true, new jf4((byte) 14));
            boolean zG = fetVar.g(wmhVar) | fetVar.d(fD) | fetVar.g(function1);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new ny2(wmhVar, fD, function1, b);
                fetVar.o0(objP);
            }
            g8x.h(ngvVar, mm40VarE0, d9zVar, lh80VarT, qw3Var, qw3Var2, null, false, null, (Function1) objP, fetVar, 0, 0, 912);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object v(Object obj, Object obj2, Object obj3) {
        c2 c2Var = (c2) this.c;
        String str = (String) this.d;
        String str2 = (String) this.b;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        nwd nwdVar = xej.l2;
        ((y5d) obj).getClass();
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            y860.w(wha0.a0(cjx.V(jm40.b, x0x.a0(fetVar), null), wha0.T(fetVar), false, 14), new vtl(c2Var), str, str2, null, null, null, fetVar, 1008);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object w(Object obj, Object obj2, Object obj3) {
        ugd ugdVar = (ugd) this.c;
        nyq0 nyq0Var = (nyq0) this.d;
        xcz xczVar = (xcz) this.b;
        hh80 hh80Var = (hh80) obj;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        hh80Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= fetVar.g(hh80Var) ? 4 : 2;
        }
        if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = s5x0.I(jm40Var, hh80Var).e(o7k0.c);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(lgb.J(mm40VarE, vgg0.c(24.0f, 24.0f, 0.0f, 0.0f, 12)), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            ugdVar.j(cjx.V(o050.S(jm40Var), nyq0Var.a(), null), xczVar, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }

    private final Object x(Object obj, Object obj2, Object obj3) {
        bjs0 bjs0Var = (bjs0) this.c;
        xcz xczVar = (xcz) this.b;
        Function1 function1 = (Function1) this.d;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        y2m0 y2m0Var = zis0.m2;
        ((y5d) obj).getClass();
        byte b = 0;
        if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
            uis0 uis0Var = (uis0) bjs0Var.f2721a.getValue();
            if (uis0Var != null) {
                boolean z = uis0Var instanceof sis0;
                jm40 jm40Var = jm40.b;
                if (z) {
                    fetVar.e0(107724302);
                    mm40 mm40VarV = cjx.V(jm40Var, a8k0.G(xczVar, fetVar), null);
                    zcl zclVar = qmk.f28987a;
                    lh80 lh80VarU = s5x0.u(4.0f, 0.0f, 4.0f, 16.0f, 2);
                    boolean zI = fetVar.i(uis0Var);
                    Object objP = fetVar.P();
                    if (zI || objP == ukd.f35823a) {
                        objP = new xis0(uis0Var, function1, b);
                        fetVar.o0(objP);
                    }
                    b8k0.e(mm40VarV, xczVar, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, 0, Response.SERVER_TIMEOUT);
                    fetVar.r(false);
                } else if (uis0Var instanceof tis0) {
                    fetVar.e0(109431782);
                    mm40 mm40VarA0 = wha0.a0(cjx.V(o7k0.c, x0x.a0(fetVar), null), wha0.T(fetVar), false, 14);
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarA0);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    jcb.l(jm40Var, ((tis0) uis0Var).f34022a, true, null, fetVar, 390, 8);
                    fetVar.r(true);
                    fetVar.r(false);
                }
            }
            throw b1j.f(-1520548517, fetVar, false);
        }
        fetVar.X();
        return Unit.f46060a;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        fet fetVar;
        boolean z;
        float f;
        mm40 mm40VarI;
        float f2;
        byte b = this.f28421a;
        mm40 mm40VarV = jm40.b;
        byte b2 = 5;
        pcy pcyVar = e7z.u1;
        byte b3 = 4;
        cl5 cl5Var = ukd.f35823a;
        Object obj4 = this.b;
        Object obj5 = this.d;
        Object obj6 = this.c;
        final byte b4 = 0;
        final byte b5 = 1;
        switch (b) {
            case 0:
                l7m0 l7m0Var = (l7m0) obj6;
                Function1 function1 = (Function1) obj5;
                xcz xczVar = (xcz) obj4;
                hh80 hh80Var = (hh80) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                hh80Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar2.g(hh80Var) ? (byte) 4 : (byte) 2;
                }
                if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    float fD = hh80Var.d();
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, fD, 0.0f, 0.0f, 13);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                    wb.v(3072, fetVar2, xczVar, o7k0.c, ((rfj0) l7m0Var.getValue()).d, function1);
                    fetVar2.r(true);
                    bsr0.H(0, fetVar2, s5x0.I(jm40Var, hh80Var), ((rfj0) l7m0Var.getValue()).f30391a);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 1:
                mm40 mm40Var = (mm40) obj6;
                xcz xczVar2 = (xcz) obj4;
                vce vceVar = (vce) obj5;
                fet fetVar3 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    mm40 mm40VarE = mm40Var.e(o7k0.c);
                    ch80 ch80VarG = knm0.g(s5x0.u(xfn.a(fetVar3).c, 0.0f, xfn.a(fetVar3).c, 0.0f, 10), fetVar3);
                    nw3 nw3Var = uc9.e;
                    boolean zG = fetVar3.g(vceVar);
                    Object objP = fetVar3.P();
                    if (zG || objP == cl5Var) {
                        objP = new m51(vceVar, (byte) 19);
                        fetVar3.o0(objP);
                    }
                    b8k0.e(mm40VarE, xczVar2, ch80VarG, nw3Var, null, null, false, null, (Function1) objP, fetVar3, 24576, Response.NOT_ACCEPTABLE_HERE);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 2:
                mm40 mm40Var2 = (mm40) obj6;
                xcz xczVar3 = (xcz) obj4;
                sce sceVar = (sce) obj5;
                fet fetVar4 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar4.U(1 & iIntValue3, (iIntValue3 & 17) != 16)) {
                    mm40 mm40VarE2 = mm40Var2.e(o7k0.c);
                    ch80 ch80VarG2 = knm0.g(s5x0.u(xfn.a(fetVar4).c, 0.0f, xfn.a(fetVar4).c, 0.0f, 10), fetVar4);
                    nw3 nw3Var2 = uc9.e;
                    boolean zG2 = fetVar4.g(sceVar);
                    Object objP2 = fetVar4.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new xh2(sceVar, (byte) 0);
                        fetVar4.o0(objP2);
                    }
                    b8k0.e(mm40VarE2, xczVar3, ch80VarG2, nw3Var2, null, null, false, null, (Function1) objP2, fetVar4, 24576, Response.NOT_ACCEPTABLE_HERE);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 3:
                mm40 mm40Var3 = (mm40) obj6;
                xcz xczVar4 = (xcz) obj4;
                uce uceVar = (uce) obj5;
                fet fetVar5 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    mm40 mm40VarE3 = mm40Var3.e(o7k0.c);
                    nw3 nw3Var3 = uc9.e;
                    boolean zG3 = fetVar5.g(uceVar);
                    Object objP3 = fetVar5.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new m51(uceVar, (byte) 20);
                        fetVar5.o0(objP3);
                    }
                    b8k0.e(mm40VarE3, xczVar4, null, nw3Var3, null, null, false, null, (Function1) objP3, fetVar5, 24576, 492);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            case 4:
                shd shdVar = gqw0.v;
                shd shdVar2 = gqw0.y;
                shd shdVar3 = gqw0.w;
                shd shdVar4 = gqw0.x;
                l7m0 l7m0Var2 = (l7m0) obj6;
                gna0 gna0Var = (gna0) obj5;
                au7 au7Var = (au7) obj4;
                mm40 mm40Var4 = (mm40) obj;
                fet fetVar6 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                yk5 yk5Var = au7.U1;
                mm40Var4.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= fetVar6.g(mm40Var4) ? (byte) 4 : (byte) 2;
                }
                if (fetVar6.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    boolean zI = fetVar6.i(au7Var);
                    Object objP4 = fetVar6.P();
                    if (zI || objP4 == cl5Var) {
                        objP4 = new yt7(au7Var, (byte) 0);
                        fetVar6.o0(objP4);
                    }
                    Function1 function2 = (Function1) objP4;
                    boolean zI2 = fetVar6.i(au7Var);
                    Object objP5 = fetVar6.P();
                    if (zI2 || objP5 == cl5Var) {
                        objP5 = new wt7(au7Var, (byte) 2);
                        fetVar6.o0(objP5);
                    }
                    Function0 function0 = (Function0) objP5;
                    boolean zI3 = fetVar6.i(au7Var);
                    Object objP6 = fetVar6.P();
                    if (zI3 || objP6 == cl5Var) {
                        objP6 = new yt7(au7Var, (byte) 1);
                        fetVar6.o0(objP6);
                    }
                    Function1 function3 = (Function1) objP6;
                    int i = (iIntValue5 & 14) | 384;
                    l7m0Var2.getClass();
                    gna0Var.getClass();
                    function2.getClass();
                    function0.getClass();
                    function3.getClass();
                    le40 le40Var = (le40) l7m0Var2.getValue();
                    if (le40Var == null) {
                        fetVar = fetVar6;
                    } else if (le40Var instanceof ie40) {
                        fetVar6.e0(1371167778);
                        ie40 ie40Var = (ie40) le40Var;
                        zcl zclVar = qmk.f28987a;
                        mm40 mm40VarN2 = s5x0.N(mm40Var4, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                        tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
                        int iHashCode2 = Long.hashCode(fetVar6.T);
                        bh90 bh90VarM2 = fetVar6.m();
                        mm40 mm40VarC1 = kbc.c0(fetVar6, mm40VarN2);
                        mkd.c0.getClass();
                        fetVar6.i0();
                        if (fetVar6.S) {
                            fetVar6.l(pcyVar);
                        } else {
                            fetVar6.r0();
                        }
                        jpm0.o(fetVar6, tj30VarC2, shdVar4);
                        jpm0.o(fetVar6, bh90VarM2, shdVar3);
                        vqd.u(iHashCode2, fetVar6, shdVar2, fetVar6);
                        jpm0.o(fetVar6, mm40VarC1, shdVar);
                        he40 he40Var = ie40Var.f14615a;
                        Object objP7 = fetVar6.P();
                        if (objP7 == cl5Var) {
                            objP7 = new da40((byte) 2);
                            fetVar6.o0(objP7);
                        }
                        Function1 function4 = (Function1) objP7;
                        Object objP8 = fetVar6.P();
                        if (objP8 == cl5Var) {
                            objP8 = new da40((byte) 3);
                            fetVar6.o0(objP8);
                        }
                        ay3.f(he40Var, null, function4, null, null, (Function1) objP8, u1c.M(1691534161, new n82(gna0Var, function2, function3, (byte) 19), fetVar6), fetVar6, 1769856, 26);
                        fetVar6.r(true);
                        fetVar6.r(false);
                    } else {
                        fetVar = fetVar6;
                        if (le40Var instanceof je40) {
                            fetVar.e0(1371496533);
                            mm40 mm40VarE4 = mm40Var4.e(o7k0.c);
                            tj30 tj30VarC3 = zq8.c(gqw0.e, false);
                            int iHashCode3 = Long.hashCode(fetVar.T);
                            bh90 bh90VarM3 = fetVar.m();
                            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarE4);
                            mkd.c0.getClass();
                            fetVar.i0();
                            if (fetVar.S) {
                                fetVar.l(pcyVar);
                            } else {
                                fetVar.r0();
                            }
                            jpm0.o(fetVar, tj30VarC3, shdVar4);
                            jpm0.o(fetVar, bh90VarM3, shdVar3);
                            vqd.u(iHashCode3, fetVar, shdVar2, fetVar);
                            jpm0.o(fetVar, mm40VarC2, shdVar);
                            jcb.l(null, ((je40) le40Var).f16356a, false, function0, fetVar, 0, 5);
                            fetVar.r(true);
                            fetVar.r(false);
                        } else if (le40Var instanceof ke40) {
                            fetVar.e0(1371850212);
                            int iOrdinal = ((ke40) le40Var).f18136a.ordinal();
                            if (iOrdinal == 0) {
                                z = false;
                                fetVar.e0(1568275873);
                                x9x.r(i & 14, fetVar, mm40Var4);
                                fetVar.r(false);
                            } else {
                                if (iOrdinal != 1) {
                                    throw b1j.f(1568273886, fetVar, false);
                                }
                                fetVar.e0(1568278336);
                                piz.g(i & 14, fetVar, mm40Var4);
                                z = false;
                                fetVar.r(false);
                            }
                            fetVar.r(z);
                        }
                    }
                    throw b1j.f(1568250032, fetVar, false);
                }
                fetVar6.X();
                return Unit.f46060a;
            case 5:
                xcz xczVar5 = (xcz) obj4;
                hh80 hh80Var2 = (hh80) obj6;
                Function1 function5 = (Function1) obj5;
                fet fetVar7 = (fet) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar7.U(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    Object[] objArr = new Object[0];
                    boolean zG4 = fetVar7.g(xczVar5);
                    Object objP9 = fetVar7.P();
                    Object obj7 = objP9;
                    if (zG4 || objP9 == cl5Var) {
                        eb ebVar = new eb(xczVar5, (byte) 17);
                        fetVar7.o0(ebVar);
                        obj7 = ebVar;
                    }
                    l7m0 l7m0VarY = v3c.Y(objArr, (Function0) obj7, fetVar7);
                    e2d e2dVar = (e2d) fetVar7.k(nip.f23600a);
                    if (e2dVar != null) {
                        fetVar7.e0(-1266309930);
                        boolean zG5 = fetVar7.g(l7m0VarY);
                        Object objP10 = fetVar7.P();
                        Object obj8 = objP10;
                        if (zG5 || objP10 == cl5Var) {
                            eka ekaVar = new eka(l7m0VarY, (byte) 5);
                            fetVar7.o0(ekaVar);
                            obj8 = ekaVar;
                        }
                        mm40VarV = cjx.V(mm40VarV, e2d.b(e2dVar, (Function0) obj8), null);
                        fetVar7.r(false);
                    } else {
                        fetVar7.e0(-1266128084);
                        fetVar7.r(false);
                    }
                    mm40 mm40VarE0 = o2e.e0(mm40VarV.e(o7k0.c), "CHAMP_LAZY_COLUMN");
                    boolean zG6 = fetVar7.g(function5);
                    Object objP11 = fetVar7.P();
                    Object obj9 = objP11;
                    if (zG6 || objP11 == cl5Var) {
                        xz8 xz8Var = new xz8(function5, (byte) 27);
                        fetVar7.o0(xz8Var);
                        obj9 = xz8Var;
                    }
                    b8k0.e(mm40VarE0, xczVar5, hh80Var2, null, null, null, false, null, (Function1) obj9, fetVar7, 0, Response.SERVER_TIMEOUT);
                } else {
                    fetVar7.X();
                }
                return Unit.f46060a;
            case 6:
                whv whvVar = (whv) obj6;
                x480 x480Var = (x480) obj5;
                Fragment fragment = (Fragment) obj4;
                String str = (String) obj;
                fet fetVar8 = (fet) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                str.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= fetVar8.g(str) ? 4 : 2;
                }
                if (fetVar8.U(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    int i2 = (fetVar8.g(whvVar) ? 1 : 0) | ((iIntValue7 & 14) == 4 ? (byte) 1 : (byte) 0);
                    Object objP12 = fetVar8.P();
                    if (i2 != 0 || objP12 == cl5Var) {
                        objP12 = new v480(whvVar.f39185a, str, whvVar.b, whvVar.c, e3m0.f7145a);
                        fetVar8.o0(objP12);
                    }
                    n0q n0qVar = o7k0.c;
                    x480Var.getClass();
                    x480.a(n0qVar, fragment, (v480) objP12, fetVar8);
                } else {
                    fetVar8.X();
                }
                return Unit.f46060a;
            case 7:
                egz egzVar = (egz) obj6;
                xcz xczVar6 = (xcz) obj4;
                Function1 function6 = (Function1) obj5;
                fet fetVar9 = (fet) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                sqt sqtVar = cgz.m2;
                ((y5d) obj).getClass();
                if (fetVar9.U(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    yfz yfzVar = (yfz) egzVar.f7785a.getValue();
                    if (yfzVar != null) {
                        boolean z2 = yfzVar instanceof wfz;
                        jm40 jm40Var2 = jm40.b;
                        if (z2) {
                            fetVar9.e0(-1928801053);
                            mm40 mm40VarV2 = cjx.V(jm40Var2, a8k0.G(xczVar6, fetVar9), null);
                            zcl zclVar2 = qmk.f28987a;
                            lh80 lh80VarU = s5x0.u(4.0f, 0.0f, 4.0f, 16.0f, 2);
                            boolean zI4 = fetVar9.i(yfzVar);
                            Object objP13 = fetVar9.P();
                            if (zI4 || objP13 == cl5Var) {
                                objP13 = new okw(yfzVar, function6, (byte) 22);
                                fetVar9.o0(objP13);
                            }
                            b8k0.e(mm40VarV2, xczVar6, lh80VarU, null, null, null, false, null, (Function1) objP13, fetVar9, 0, Response.SERVER_TIMEOUT);
                            fetVar9.r(false);
                        } else if (yfzVar instanceof xfz) {
                            fetVar9.e0(-1926984918);
                            mm40 mm40VarA0 = wha0.a0(cjx.V(o7k0.c, x0x.a0(fetVar9), null), wha0.T(fetVar9), false, 14);
                            tj30 tj30VarC4 = zq8.c(gqw0.e, false);
                            int iHashCode4 = Long.hashCode(fetVar9.T);
                            bh90 bh90VarM4 = fetVar9.m();
                            mm40 mm40VarC3 = kbc.c0(fetVar9, mm40VarA0);
                            mkd.c0.getClass();
                            fetVar9.i0();
                            if (fetVar9.S) {
                                fetVar9.l(pcyVar);
                            } else {
                                fetVar9.r0();
                            }
                            jpm0.o(fetVar9, tj30VarC4, gqw0.x);
                            jpm0.o(fetVar9, bh90VarM4, gqw0.w);
                            jpm0.o(fetVar9, Integer.valueOf(iHashCode4), gqw0.y);
                            jpm0.n(fetVar9);
                            jpm0.o(fetVar9, mm40VarC3, gqw0.v);
                            jcb.l(jm40Var2, ((xfz) yfzVar).f40816a, true, null, fetVar9, 390, 8);
                            fetVar9.r(true);
                            fetVar9.r(false);
                        }
                    }
                    throw b1j.f(-200769622, fetVar9, false);
                }
                fetVar9.X();
                return Unit.f46060a;
            case 8:
                yjj0 yjj0VarC = jd8.n;
                cp50 cp50Var = (cp50) obj6;
                w2d w2dVar = (w2d) obj4;
                x2d x2dVar = w2dVar.f38442a;
                Function1 function7 = (Function1) obj5;
                hh80 hh80Var3 = (hh80) obj;
                fet fetVar10 = (fet) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                hh80Var3.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= fetVar10.g(hh80Var3) ? (byte) 4 : (byte) 2;
                }
                if (fetVar10.U(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    if (cp50Var != null) {
                        boolean z3 = cp50Var instanceof zo50;
                        jm40 jm40Var3 = jm40.b;
                        if (z3) {
                            fetVar10.e0(1938659911);
                            zo50 zo50Var = (zo50) cp50Var;
                            ArrayList arrayList = zo50Var.f44703a;
                            if (arrayList.isEmpty()) {
                                fetVar10.e0(1938774797);
                                WeakHashMap weakHashMap = djv0.w;
                                float fD2 = i120.O(zcm0.i(fetVar10).f, fetVar10).d();
                                zcl zclVar3 = qmk.f28987a;
                                mm40VarI = s5x0.N(jm40Var3, 0.0f, fD2 + 56.0f, 0.0f, 0.0f, 13);
                                fetVar10.r(false);
                                f = 24.0f;
                            } else {
                                f = 24.0f;
                                fetVar10.e0(1939070320);
                                fetVar10.r(false);
                                mm40VarI = s5x0.I(jm40Var3, hh80Var3);
                            }
                            long background = ((ThemeColors) fetVar10.k(zaq0.b)).getBackground();
                            if (!arrayList.isEmpty()) {
                                zcl zclVar4 = qmk.f28987a;
                                yjj0VarC = vgg0.c((1.0f - x2dVar.a()) * f, (1.0f - x2dVar.a()) * f, 0.0f, 0.0f, 12);
                            }
                            mm40 mm40VarV3 = cjx.V(i120.Q(mm40VarI, background, yjj0VarC).e(o7k0.c), w2dVar, null);
                            boolean zG7 = fetVar10.g(function7);
                            Object objP14 = fetVar10.P();
                            if (zG7 || objP14 == cl5Var) {
                                objP14 = new nc40(function7, b5);
                                fetVar10.o0(objP14);
                            }
                            xdr xdrVar = (xdr) objP14;
                            boolean zG8 = fetVar10.g(function7);
                            Object objP15 = fetVar10.P();
                            if (zG8 || objP15 == cl5Var) {
                                objP15 = new rp30(function7, (byte) 21);
                                fetVar10.o0(objP15);
                            }
                            lv00.t(mm40VarV3, zo50Var, xdrVar, (Function1) objP15, fetVar10, 0);
                            fetVar10.r(false);
                        } else if (cp50Var instanceof ap50) {
                            fetVar10.e0(1940926445);
                            mm40 mm40VarQ = i120.Q(s5x0.I(jm40Var3, hh80Var3), ((ThemeColors) fetVar10.k(zaq0.b)).getBackground(), yjj0VarC);
                            mdm mdmVar = ((ap50) cp50Var).f1234a;
                            boolean zG9 = fetVar10.g(function7);
                            Object objP16 = fetVar10.P();
                            if (zG9 || objP16 == cl5Var) {
                                objP16 = new w250(function7, (byte) 13);
                                fetVar10.o0(objP16);
                            }
                            lv00.u(mm40VarQ, mdmVar, (Function0) objP16, fetVar10, 0);
                            fetVar10.r(false);
                        } else if (cp50Var instanceof bp50) {
                            fetVar10.e0(1941355330);
                            mm40 mm40VarI2 = s5x0.I(jm40Var3, hh80Var3);
                            long background2 = ((ThemeColors) fetVar10.k(zaq0.b)).getBackground();
                            zcl zclVar5 = qmk.f28987a;
                            lv00.v(0, fetVar10, cjx.V(i120.Q(mm40VarI2, background2, vgg0.c((1.0f - x2dVar.a()) * 24.0f, (1.0f - x2dVar.a()) * 24.0f, 0.0f, 0.0f, 12)).e(o7k0.c), w2dVar, null));
                            fetVar10.r(false);
                        }
                    }
                    throw b1j.f(-1461484283, fetVar10, false);
                }
                fetVar10.X();
                return Unit.f46060a;
            case 9:
                pz40 pz40Var = (pz40) obj6;
                xcz xczVar7 = (xcz) obj4;
                final ep90 ep90Var = (ep90) obj5;
                fet fetVar11 = (fet) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                jh70 jh70Var = ep90.c2;
                ((ir8) obj).getClass();
                if (fetVar11.U(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    mm40 mm40VarP = o050.P(o7k0.c);
                    x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar11, 48);
                    int iHashCode5 = Long.hashCode(fetVar11.T);
                    bh90 bh90VarM5 = fetVar11.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar11, mm40VarP);
                    mkd.c0.getClass();
                    fetVar11.i0();
                    if (fetVar11.S) {
                        fetVar11.l(pcyVar);
                    } else {
                        fetVar11.r0();
                    }
                    jpm0.o(fetVar11, x5dVarA, gqw0.x);
                    jpm0.o(fetVar11, bh90VarM5, gqw0.w);
                    jpm0.o(fetVar11, Integer.valueOf(iHashCode5), gqw0.y);
                    jpm0.n(fetVar11);
                    jpm0.o(fetVar11, mm40VarC4, gqw0.v);
                    ur90 ur90Var = (ur90) pz40Var.getValue();
                    if (ur90Var.c == null && ur90Var.d == null) {
                        zcl zclVar6 = qmk.f28987a;
                        f2 = 16.0f;
                    } else {
                        zcl zclVar7 = qmk.f28987a;
                        f2 = 8.0f;
                    }
                    jm40 jm40Var4 = jm40.b;
                    mm40 mm40VarE1 = o2e.e0(s5x0.N(jm40Var4, 16.0f, 0.0f, 16.0f, f2, 2), "BOTTOM_SHEET_TITLE");
                    String str2 = ((ur90) pz40Var.getValue()).b;
                    y9q0 y9q0Var = new y9q0(0L, qmk.u, null, j1t0.f15753a, 0L, null, 0, 0, qmk.H, 16646109);
                    pz40 pz40Var2 = s6t0.f31722a;
                    v8q0.a(str2, mm40VarE1, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, y9q0Var, fetVar11, 0, 0, 130040);
                    sr90 sr90Var = ((ur90) pz40Var.getValue()).c;
                    if (sr90Var == null) {
                        fetVar11.e0(292077595);
                        fetVar11.r(false);
                    } else {
                        fetVar11.e0(292077596);
                        mm40 mm40VarK = s5x0.K(jm40Var4, 16.0f, 8.0f);
                        Unit unit = Unit.f46060a;
                        boolean zI5 = fetVar11.i(ep90Var);
                        Object objP17 = fetVar11.P();
                        if (zI5 || objP17 == cl5Var) {
                            objP17 = new zy2(ep90Var, b2);
                            fetVar11.o0(objP17);
                        }
                        mm40 mm40VarA = fnn0.a(mm40VarK, unit, (PointerInputEventHandler) objP17);
                        String str3 = sr90Var.f32665a;
                        String str4 = sr90Var.b;
                        boolean zI6 = fetVar11.i(ep90Var);
                        Object objP18 = fetVar11.P();
                        if (zI6 || objP18 == cl5Var) {
                            objP18 = new Function1() { // from class: a.cp90
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj10) {
                                    byte b6 = b5;
                                    ep90 ep90Var2 = ep90Var;
                                    switch (b6) {
                                        case 0:
                                            int iIntValue11 = ((Integer) obj10).intValue();
                                            jh70 jh70Var2 = ep90.c2;
                                            ep90Var2.K0().x(new rn90(iIntValue11));
                                            break;
                                        case 1:
                                            String str5 = (String) obj10;
                                            jh70 jh70Var3 = ep90.c2;
                                            str5.getClass();
                                            ep90Var2.K0().x(new tn90(str5));
                                            break;
                                        default:
                                            String str6 = (String) obj10;
                                            jh70 jh70Var4 = ep90.c2;
                                            str6.getClass();
                                            ep90Var2.K0().x(new qn90(str6));
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            };
                            fetVar11.o0(objP18);
                        }
                        aac.n(mm40VarA, false, str3, null, str4, null, (Function1) objP18, null, null, fetVar11, 0, 426);
                        fetVar11.r(false);
                    }
                    rr90 rr90Var = ((ur90) pz40Var.getValue()).d;
                    if (rr90Var == null) {
                        fetVar11.e0(293336288);
                        fetVar11.r(false);
                    } else {
                        fetVar11.e0(293336289);
                        mm40 mm40VarD = o7k0.d(jm40Var4, 1.0f);
                        boolean zI7 = fetVar11.i(ep90Var);
                        Object objP19 = fetVar11.P();
                        if (zI7 || objP19 == cl5Var) {
                            final byte b6 = 2;
                            objP19 = new Function1() { // from class: a.cp90
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj10) {
                                    byte b7 = b6;
                                    ep90 ep90Var2 = ep90Var;
                                    switch (b7) {
                                        case 0:
                                            int iIntValue11 = ((Integer) obj10).intValue();
                                            jh70 jh70Var2 = ep90.c2;
                                            ep90Var2.K0().x(new rn90(iIntValue11));
                                            break;
                                        case 1:
                                            String str5 = (String) obj10;
                                            jh70 jh70Var3 = ep90.c2;
                                            str5.getClass();
                                            ep90Var2.K0().x(new tn90(str5));
                                            break;
                                        default:
                                            String str6 = (String) obj10;
                                            jh70 jh70Var4 = ep90.c2;
                                            str6.getClass();
                                            ep90Var2.K0().x(new qn90(str6));
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            };
                            fetVar11.o0(objP19);
                        }
                        Function1 function8 = (Function1) objP19;
                        boolean zI8 = fetVar11.i(ep90Var);
                        Object objP20 = fetVar11.P();
                        if (zI8 || objP20 == cl5Var) {
                            objP20 = new bp90(ep90Var, (byte) 3);
                            fetVar11.o0(objP20);
                        }
                        Function0 function9 = (Function0) objP20;
                        boolean zI9 = fetVar11.i(ep90Var);
                        Object objP21 = fetVar11.P();
                        if (zI9 || objP21 == cl5Var) {
                            objP21 = new bp90(ep90Var, (byte) 4);
                            fetVar11.o0(objP21);
                        }
                        q7x.i(mm40VarD, rr90Var, function8, function9, (Function0) objP21, fetVar11, 6);
                        fetVar11.r(false);
                    }
                    zq8.a(0, fetVar11, i120.Q(o7k0.e(o7k0.d(jm40Var4, 1.0f), 1.0f), s6t0.b().f33626a.getSeparator60(), jd8.n));
                    or90 or90Var = ((ur90) pz40Var.getValue()).e;
                    boolean zI10 = fetVar11.i(ep90Var);
                    Object objP22 = fetVar11.P();
                    if (zI10 || objP22 == cl5Var) {
                        objP22 = new Function1() { // from class: a.cp90
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj10) {
                                byte b7 = b4;
                                ep90 ep90Var2 = ep90Var;
                                switch (b7) {
                                    case 0:
                                        int iIntValue11 = ((Integer) obj10).intValue();
                                        jh70 jh70Var2 = ep90.c2;
                                        ep90Var2.K0().x(new rn90(iIntValue11));
                                        break;
                                    case 1:
                                        String str5 = (String) obj10;
                                        jh70 jh70Var3 = ep90.c2;
                                        str5.getClass();
                                        ep90Var2.K0().x(new tn90(str5));
                                        break;
                                    default:
                                        String str6 = (String) obj10;
                                        jh70 jh70Var4 = ep90.c2;
                                        str6.getClass();
                                        ep90Var2.K0().x(new qn90(str6));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar11.o0(objP22);
                    }
                    u7x.f(null, xczVar7, or90Var, (Function1) objP22, fetVar11, 0);
                    fetVar11.r(true);
                } else {
                    fetVar11.X();
                }
                return Unit.f46060a;
            case 10:
                xcz xczVar8 = (xcz) obj4;
                lh80 lh80Var = (lh80) obj6;
                Function1 function10 = (Function1) obj5;
                fet fetVar12 = (fet) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar12.U(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    Object[] objArr2 = new Object[0];
                    boolean zG10 = fetVar12.g(xczVar8);
                    Object objP23 = fetVar12.P();
                    Object obj10 = objP23;
                    if (zG10 || objP23 == cl5Var) {
                        gg90 gg90Var = new gg90(xczVar8, (byte) 11);
                        fetVar12.o0(gg90Var);
                        obj10 = gg90Var;
                    }
                    l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) obj10, fetVar12);
                    e2d e2dVar2 = (e2d) fetVar12.k(nip.f23600a);
                    if (e2dVar2 != null) {
                        fetVar12.e0(635871187);
                        boolean zG11 = fetVar12.g(l7m0VarY2);
                        Object objP24 = fetVar12.P();
                        Object obj11 = objP24;
                        if (zG11 || objP24 == cl5Var) {
                            wda0 wda0Var = new wda0(l7m0VarY2, b2);
                            fetVar12.o0(wda0Var);
                            obj11 = wda0Var;
                        }
                        mm40VarV = cjx.V(mm40VarV, e2d.b(e2dVar2, (Function0) obj11), null);
                        fetVar12.r(false);
                    } else {
                        fetVar12.e0(636053033);
                        fetVar12.r(false);
                    }
                    mm40 mm40VarE5 = o2e.e0(mm40VarV.e(o7k0.c), "POLYBET_CHAMP_LAZY_COLUMN");
                    boolean zG12 = fetVar12.g(function10);
                    Object objP25 = fetVar12.P();
                    Object obj12 = objP25;
                    if (zG12 || objP25 == cl5Var) {
                        rpa0 rpa0Var = new rpa0(function10, (byte) 2);
                        fetVar12.o0(rpa0Var);
                        obj12 = rpa0Var;
                    }
                    b8k0.e(mm40VarE5, xczVar8, lh80Var, null, null, null, false, null, (Function1) obj12, fetVar12, 0, Response.SERVER_TIMEOUT);
                } else {
                    fetVar12.X();
                }
                return Unit.f46060a;
            case 11:
                xcz xczVar9 = (xcz) obj4;
                f1l0 f1l0Var = (f1l0) obj6;
                Function1 function11 = (Function1) obj5;
                ir8 ir8Var = (ir8) obj;
                fet fetVar13 = (fet) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ir8Var.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= fetVar13.g(ir8Var) ? 4 : 2;
                }
                if (fetVar13.U(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    Object objP26 = fetVar13.P();
                    if (objP26 == cl5Var) {
                        objP26 = androidx.compose.runtime.e.e(new ycl(0.0f));
                        fetVar13.o0(objP26);
                    }
                    pz40 pz40Var3 = (pz40) objP26;
                    w6k w6kVar = (w6k) fetVar13.k(bmd.h);
                    n0q n0qVar2 = o7k0.c;
                    zcl zclVar8 = qmk.f28987a;
                    lh80 lh80VarU2 = s5x0.u(0.0f, 0.0f, 0.0f, 20.0f, 7);
                    boolean zG13 = fetVar13.g(f1l0Var) | fetVar13.g(w6kVar) | fetVar13.g(function11);
                    Object objP27 = fetVar13.P();
                    if (zG13 || objP27 == cl5Var) {
                        objP27 = new l0i0((Object) f1l0Var, (Object) w6kVar, function11, (Object) pz40Var3, (byte) 3);
                        fetVar13.o0(objP27);
                    }
                    b8k0.e(n0qVar2, xczVar9, lh80VarU2, null, null, null, false, null, (Function1) objP27, fetVar13, 6, Response.SERVER_TIMEOUT);
                    mm40 mm40VarN3 = s5x0.N(n0qVar2, 0.0f, ((ycl) pz40Var3.getValue()).f42389a, 0.0f, 0.0f, 13);
                    zx7 zx7Var = gqw0.e;
                    Object objP28 = fetVar13.P();
                    if (objP28 == cl5Var) {
                        objP28 = new ejk0((byte) 15);
                        fetVar13.o0(objP28);
                    }
                    Function1 function12 = (Function1) objP28;
                    Object objP29 = fetVar13.P();
                    if (objP29 == cl5Var) {
                        objP29 = new ejk0((byte) 16);
                        fetVar13.o0(objP29);
                    }
                    ay3.f(f1l0Var, mm40VarN3, function12, zx7Var, null, (Function1) objP29, u1c.M(1121434340, new ec30(ir8Var, function11, b3), fetVar13), fetVar13, 1772928, 16);
                } else {
                    fetVar13.X();
                }
                return Unit.f46060a;
            case 12:
                return w(obj, obj2, obj3);
            case 13:
                return x(obj, obj2, obj3);
            case 14:
                return a(obj, obj2, obj3);
            case 15:
                return b(obj, obj2, obj3);
            case 16:
                return c(obj, obj2, obj3);
            case 17:
                return g(obj, obj2, obj3);
            case 18:
                return h(obj, obj2, obj3);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return i(obj, obj2, obj3);
            case 20:
                return l(obj, obj2, obj3);
            case 21:
                return m(obj, obj2, obj3);
            case 22:
                return o(obj, obj2, obj3);
            case 23:
                return p(obj, obj2, obj3);
            case 24:
                return r(obj, obj2, obj3);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return s(obj, obj2, obj3);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return t(obj, obj2, obj3);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return u(obj, obj2, obj3);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return v(obj, obj2, obj3);
            default:
                ytl ytlVar = (ytl) obj6;
                Function0 function13 = (Function0) obj5;
                Function0 function14 = (Function0) obj4;
                fet fetVar14 = (fet) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar14.U(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    nkb.q(ytlVar.d, ytlVar.e, function13, function14, fetVar14, 0);
                } else {
                    fetVar14.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ qb(xcz xczVar, Object obj, Function1 function1, byte b) {
        this.f28421a = b;
        this.b = xczVar;
        this.c = obj;
        this.d = function1;
    }

    public /* synthetic */ qb(Object obj, Object obj2, Object obj3, byte b) {
        this.f28421a = b;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }

    public /* synthetic */ qb(Object obj, Object obj2, Object obj3, byte b, byte b2) {
        this.f28421a = b;
        this.d = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ qb(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.f28421a = b;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    public /* synthetic */ qb(String str, y9q0 y9q0Var, l7m0 l7m0Var) {
        this.f28421a = (byte) 19;
        this.d = str;
        this.b = y9q0Var;
        this.c = l7m0Var;
    }
}
