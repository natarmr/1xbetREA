package a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.betting.core.zip.model.zip.bet.BetGroupZip;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesParentSectionModel;
import org.xplatform.uikit.compose.color.IndividualColors;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vbc {
    public static final void A(sah sahVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1450287818);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(sahVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 14;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = twn.s(fetVar);
            }
            List list = (List) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = twn.s(fetVar);
            }
            List list2 = (List) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = twn.s(fetVar);
            }
            List list3 = (List) objP3;
            mm40 mm40Var = (mm40) fetVar.k(t0h.f33118a);
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = v5o.f36834a;
                fetVar.o0(objP4);
            }
            xdr xdrVar = (xdr) ((jhy) objP4);
            boolean zI = fetVar.i(list) | ((i2 & 14) == 4) | fetVar.i(list2) | fetVar.i(list3);
            Object objP5 = fetVar.P();
            if (zI || objP5 == cl5Var) {
                enm enmVar = new enm((Object) sahVar, (Object) list, (Object) list2, (Object) list3, (byte) 4);
                fetVar.o0(enmVar);
                objP5 = enmVar;
            }
            y860.f(xdrVar, mm40Var, (Function1) objP5, fetVar, 6, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z4o(sahVar, i, b);
        }
    }

    public static final void B(mm40 mm40Var, final dho dhoVar, fet fetVar, int i) {
        fetVar.g0(662821823);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(dhoVar) ? 32 : 16);
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            hmw0.j(o7k0.d(mm40Var, 1.0f), u1c.M(-1195963985, new Function2() { // from class: a.cho
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = b;
                    jm40 jm40Var = jm40.b;
                    dho dhoVar2 = dhoVar;
                    switch (b3) {
                        case 0:
                            fet fetVar2 = (fet) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                v8q0.a(dhoVar2.b, mrv.k0(jm40Var, "TITLE_TEXT"), 0L, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, ibm0.n(new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar2), fetVar2, 48, 24960, 109564);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            fet fetVar3 = (fet) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                v8q0.a(dhoVar2.c, mrv.k0(jm40Var, "DESCRIPTION_TEXT"), dhoVar2.d, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar3, 48, 24960, 109560);
                            } else {
                                fetVar3.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(-959794162, new Function2() { // from class: a.cho
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = b2;
                    jm40 jm40Var = jm40.b;
                    dho dhoVar2 = dhoVar;
                    switch (b3) {
                        case 0:
                            fet fetVar2 = (fet) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                v8q0.a(dhoVar2.b, mrv.k0(jm40Var, "TITLE_TEXT"), 0L, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, ibm0.n(new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar2), fetVar2, 48, 24960, 109564);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            fet fetVar3 = (fet) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                v8q0.a(dhoVar2.c, mrv.k0(jm40Var, "DESCRIPTION_TEXT"), dhoVar2.d, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar3, 48, 24960, 109560);
                            } else {
                                fetVar3.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, 432);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fun(mm40Var, dhoVar, i, (byte) 19);
        }
    }

    public static final void C(mm40 mm40Var, wui0 wui0Var, final e1w e1wVar, final Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        function1.getClass();
        fetVar.g0(-484052753);
        int i2 = i | 6 | (fetVar.e(wui0Var.ordinal()) ? 32 : 16) | (fetVar.g(e1wVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(s5x0.L(jm40Var, 4.0f, 0.0f, 2), 1.0f);
            rqm rqmVar = new rqm((vui0) new tui0(e1wVar.b, null), (pui0) null, (pvi0) new lvi0(tc00.f33696a, e1wVar.c), (d4d) null, (tvi0) null, wui0Var, false, (e900) null, 442);
            int i3 = i2 & 7168;
            int i4 = i2 & 896;
            boolean z = (i3 == 2048) | (i4 == 256);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new Function0() { // from class: a.m3q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = b;
                        e1w e1wVar2 = e1wVar;
                        Function1 function2 = function1;
                        switch (b3) {
                            case 0:
                                jvw jvwVar = e1wVar2.f7057a;
                                jvwVar.getClass();
                                function2.invoke(new yzv(jvwVar));
                                break;
                            default:
                                jvw jvwVar2 = e1wVar2.f7057a;
                                jvwVar2.getClass();
                                function2.invoke(new yzv(jvwVar2));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            int i5 = (i3 == 2048 ? (byte) 1 : (byte) 0) | (i4 == 256 ? (byte) 1 : (byte) 0);
            Object objP2 = fetVar.P();
            if (i5 != 0 || objP2 == cl5Var) {
                objP2 = new Function0() { // from class: a.m3q
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = b2;
                        e1w e1wVar2 = e1wVar;
                        Function1 function2 = function1;
                        switch (b3) {
                            case 0:
                                jvw jvwVar = e1wVar2.f7057a;
                                jvwVar.getClass();
                                function2.invoke(new yzv(jvwVar));
                                break;
                            default:
                                jvw jvwVar2 = e1wVar2.f7057a;
                                jvwVar2.getClass();
                                function2.invoke(new yzv(jvwVar2));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP2);
            }
            obc.q(mm40VarD, rqmVar, false, null, function0, null, (Function0) objP2, null, fetVar, 384, 168);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqk((byte) 29, i, (Object) mm40Var2, (Object) wui0Var, (Object) e1wVar, (Object) function1);
        }
    }

    public static final void D(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        mm40 mm40Var2;
        fetVar.g0(-482487739);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str2) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            StringBuilder sb = new StringBuilder(16);
            new ArrayList();
            ArrayList arrayList = new ArrayList();
            new ArrayList();
            sb.append(str);
            if (str2.length() > 0 && str.length() > 0) {
                sb.append(", ");
            }
            sb.append(str2);
            String string = sb.toString();
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList2.add(((g83) arrayList.get(i3)).a(sb.length()));
            }
            j83 j83Var = new j83(string, arrayList2);
            int length = str2.length();
            jm40 jm40Var = jm40.b;
            if (length <= 0 && str.length() <= 0) {
                fetVar.e0(1463924189);
                fetVar.r(false);
            } else {
                fetVar.e0(1463676065);
                v8q0.b(j83Var, jm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, (i2 << 3) & 112, 24960, 241656);
                fetVar.r(false);
            }
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nd8(mm40Var2, str, str2, i, (byte) 8);
        }
    }

    public static final void E(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(34542438);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new hcr(function1, (byte) 12);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new hcr(function1, (byte) 13);
                fetVar.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            Object[] objArr = new Object[0];
            int i4 = i2 & 112;
            boolean z3 = i4 == 32;
            Object objP3 = fetVar.P();
            byte b = 7;
            if (z3 || objP3 == cl5Var) {
                objP3 = new z6s(l7m0Var, b);
                fetVar.o0(objP3);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP3, fetVar);
            Object[] objArr2 = new Object[0];
            boolean z4 = i4 == 32;
            Object objP4 = fetVar.P();
            if (z4 || objP4 == cl5Var) {
                objP4 = new z6s(l7m0Var, (byte) 8);
                fetVar.o0(objP4);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP4, fetVar);
            mm40 mm40VarR = knm0.r(mm40Var);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(o050.P(j120.K(mm40VarR, s5x0.u(0.0f, 0.0f, 0.0f, 56.0f, 7))), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            boolean z5 = i3 == 256;
            Object objP5 = fetVar.P();
            if (z5 || objP5 == cl5Var) {
                objP5 = new baq(function1, (byte) 15);
                fetVar.o0(objP5);
            }
            Q(mm40VarQ, l7m0VarY, l7m0VarY2, function1, (Function1) objP5, fetVar, (i2 << 3) & 7168);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kr0(mm40Var, l7m0Var, function1, i, (byte) 17);
        }
    }

    public static final void F(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1075747596);
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarV = cjx.V(s5x0.N(jm40.b, 0.0f, 16.0f, 0.0f, 16.0f, 5), a8k0.G(xczVarA, fetVar), null);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ys4(l7m0Var, function1, (byte) 10);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarV, xczVarA, null, null, null, null, false, null, (Function1) objP, fetVar, 0, 508);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new quh(l7m0Var, function1, i, (byte) 22);
        }
    }

    public static final void G(lav lavVar, fet fetVar, int i) {
        int i2;
        lav lavVar2;
        k6z k6zVar;
        fetVar.g0(-876895013);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(lavVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP2);
            }
            pz40 pz40Var2 = (pz40) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP3);
            }
            pz40 pz40Var3 = (pz40) objP3;
            if (lavVar.l) {
                fetVar.e0(-1587895397);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-1587846076);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            lavVar2 = lavVar;
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1579095653, new cqk((Object) lavVar2, (Object) pz40Var2, (Object) pz40Var3, (Object) k6zVar, (Object) pz40Var, (byte) 27), fetVar), fetVar, 56);
        } else {
            lavVar2 = lavVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o6o(lavVar2, i, (byte) 13);
        }
    }

    public static final void H(drw drwVar, Function1 function1, fet fetVar, int i) {
        int i2;
        drwVar.getClass();
        function1.getClass();
        fetVar.g0(-585370566);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(drwVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 8.0f, 0.0f, 2);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new okw(drwVar, function1, (byte) 6);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarL, null, null, qw3Var, null, null, false, null, (Function1) objP, fetVar, 0, 494);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dlw(drwVar, function1, i);
        }
    }

    public static final void I(o0x o0xVar, ubm ubmVar, int i, fet fetVar, int i2) {
        mm40 mm40VarN;
        fetVar.g0(-180714400);
        int i3 = (fetVar.g(o0xVar) ? 4 : 2) | i2 | (fetVar.e(ubmVar.ordinal()) ? 32 : 16) | (fetVar.e(i) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            int iOrdinal = ubmVar.ordinal();
            jm40 jm40Var = jm40.b;
            if (iOrdinal == 0) {
                zcl zclVar = qmk.f28987a;
                mm40VarN = o7k0.n(jm40Var, 18.0f);
            } else if (iOrdinal != 1) {
                t9f.b();
                return;
            } else {
                zcl zclVar2 = qmk.f28987a;
                mm40VarN = lgb.J(o7k0.n(jm40Var, 18.0f), vgg0.f37379a);
            }
            rq8.b(mm40VarN, o7k0.n(jm40Var, 18.0f), o0xVar, i, new y3d(((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU()), null, null, gqw0.A, null, fetVar, ((i3 << 6) & 896) | 12582912 | ((i3 << 3) & 7168), 352);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kkl(o0xVar, ubmVar, i, i2);
        }
    }

    public static final void J(String str, fet fetVar, int i) {
        fetVar.g0(-1673319140);
        int i2 = i | (fetVar.g(str) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, null, ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.d(), fetVar, i2 & 14, 24576, 114682);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hxk((byte) 11, i, str);
        }
    }

    public static final void K(mm40 mm40Var, n2n n2nVar, boolean z, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1391587650);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(n2nVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, z ? gqw0.o : gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            String str = n2nVar.f22809a;
            zfn zfnVar = zaq0.b;
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar2, 0, 24960, 110586);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarU = o7k0.u(s5x0.L(i120.S(o7k0.e(s5x0.N(jm40.b, 0.0f, 6.0f, 0.0f, 0.0f, 13), 24.0f), 1.0f, ((ThemeColors) fetVar2.k(zfnVar)).getSeparator(), vgg0.a(6.0f)), 4.0f, 0.0f, 2), 80.0f, 0.0f, 2);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarU);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            v8q0.a(n2nVar.b, null, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar2, 0, 24960, 110586);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(1192824564, new mxm(n2nVar, (byte) 15), fetVar2), fetVar2, 56);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new igm((byte) 29, i, mm40Var, (Object) n2nVar, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public static final void L(mm40 mm40Var, ixm ixmVar, xcz xczVar, bch0 bch0Var, boolean z, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2;
        ?? r0;
        int i2;
        shd shdVar;
        boolean z2;
        Object obj;
        float f;
        Function0 function0;
        shd shdVar2;
        shd shdVar3;
        shd shdVar4;
        ?? r2;
        fet fetVar3 = fetVar;
        String str = ixmVar.c;
        a4x a4xVar = ixmVar.d;
        c280 c280Var = ixmVar.b;
        fetVar3.g0(999115880);
        int i3 = i | 6;
        if ((i & 48) == 0) {
            i3 |= fetVar3.g(ixmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar3.g(xczVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? fetVar3.g(bch0Var) : fetVar3.i(bch0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= fetVar3.h(z) ? 16384 : 8192;
        }
        if (fetVar3.U(i3 & 1, (i3 & 9363) != 9362)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 32.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar3, 48);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarE);
            mkd.c0.getClass();
            fetVar3.i0();
            boolean z3 = fetVar3.S;
            Function0 function1 = e7z.u1;
            if (z3) {
                fetVar3.l(function1);
            } else {
                fetVar3.r0();
            }
            shd shdVar5 = gqw0.x;
            jpm0.o(fetVar3, thg0VarA, shdVar5);
            shd shdVar6 = gqw0.w;
            jpm0.o(fetVar3, bh90VarM, shdVar6);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar7 = gqw0.y;
            jpm0.o(fetVar3, numValueOf, shdVar7);
            jpm0.n(fetVar3);
            shd shdVar8 = gqw0.v;
            jpm0.o(fetVar3, mm40VarC0, shdVar8);
            boolean zG = fetVar3.g(c280Var);
            Object objP = fetVar3.P();
            Object obj2 = ukd.f35823a;
            if (zG || objP == obj2) {
                objP = new u6n(d4d.SECONDARY60, w6n.j, c280Var);
                fetVar3.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            boolean zG2 = fetVar3.g(u6nVar);
            Object objP2 = fetVar3.P();
            if (zG2 || objP2 == obj2) {
                r0 = 1;
                objP2 = new d1n(u6nVar, (byte) 1);
                fetVar3.o0(objP2);
            } else {
                r0 = 1;
            }
            kkb.p(r0, fetVar3, null, (Function0) objP2);
            M(0, fetVar3, new x7z(1.0f, r0), ixmVar.f15547a);
            if (str.length() > 0) {
                fetVar3.e0(247502459);
                f = 4.0f;
                i2 = i3;
                shdVar3 = shdVar6;
                shdVar4 = shdVar7;
                shdVar = shdVar5;
                z2 = false;
                r2 = 1;
                obj = obj2;
                function0 = function1;
                shdVar2 = shdVar8;
                v8q0.a(str, s5x0.L(jm40Var, 4.0f, 0.0f, 2), ((ThemeColors) fetVar3.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 0, 0, 131064);
                fetVar3 = fetVar;
                fetVar3.r(false);
            } else {
                i2 = i3;
                shdVar = shdVar5;
                z2 = false;
                obj = obj2;
                f = 4.0f;
                function0 = function1;
                shdVar2 = shdVar8;
                shdVar3 = shdVar6;
                shdVar4 = shdVar7;
                r2 = 1;
                fetVar3.e0(247761278);
                fetVar3.r(false);
            }
            jcb.H(s5x0.N(ffb0.R(jm40Var, 0.0f, z ? 6.0f : -6.0f, r2), 0.0f, z ? 0.0f : f, 0.0f, z ? f : 0.0f, 5), 1.0f, ((ThemeColors) fetVar3.k(zaq0.b)).getSeparator60(), fetVar3, 0, 0);
            fet fetVar4 = fetVar3;
            ma80 ma80Var = ma80.b;
            sjj sjjVarA = wzk0.a(fetVar4);
            boolean zG3 = fetVar4.g(sjjVarA);
            Object objP3 = fetVar4.P();
            if (zG3 || objP3 == obj) {
                objP3 = new iuj(sjjVarA);
                fetVar4.o0(objP3);
            }
            mm40 mm40VarA = fbh0.a(jm40Var, bch0Var, ma80Var, false, (iuj) objP3, 44);
            zx7 zx7Var = gqw0.d;
            tj30 tj30VarC = zq8.c(zx7Var, z2);
            int iHashCode2 = Long.hashCode(fetVar4.T);
            bh90 bh90VarM2 = fetVar4.m();
            mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarA);
            fetVar4.i0();
            if (fetVar4.S) {
                fetVar4.l(function0);
            } else {
                fetVar4.r0();
            }
            jpm0.o(fetVar4, tj30VarC, shdVar);
            jpm0.o(fetVar4, bh90VarM2, shdVar3);
            vqd.u(iHashCode2, fetVar4, shdVar4, fetVar4);
            jpm0.o(fetVar4, mm40VarC1, shdVar2);
            O(null, a4xVar, xczVar, fetVar4, i2 & 896);
            int size = a4xVar.size();
            jr8 jr8Var = jr8.f16991a;
            if (size > 3) {
                fetVar4.e0(-642816325);
                qcc.q(jr8Var.b(jm40Var, zx7Var), xczVar, fetVar4, (i2 >> 3) & 112);
                fetVar4.r(z2);
            } else {
                fetVar4.e0(-642653916);
                fetVar4.r(z2);
            }
            if (a4xVar.size() > 3) {
                fetVar4.e0(-642578369);
                qcc.p(jr8Var.b(jm40Var, gqw0.f), xczVar, fetVar4, (i2 >> 3) & 112);
                fetVar4.r(z2);
            } else {
                fetVar4.e0(-642419804);
                fetVar4.r(z2);
            }
            fetVar4.r(r2);
            fetVar4.r(r2);
            mm40Var2 = jm40Var;
            fetVar2 = fetVar4;
        } else {
            fet fetVar5 = fetVar3;
            fetVar5.X();
            mm40Var2 = mm40Var;
            fetVar2 = fetVar5;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mg((byte) 10, i, mm40Var2, (Object) ixmVar, (Object) xczVar, (Object) bch0Var, z);
        }
    }

    public static final void M(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        fetVar.g0(-370453988);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            str2 = str;
            kc5.N(str2, s5x0.L(mm40Var, 8.0f, 0.0f, 2), ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, null, 0L, qmk.q, g1t0.m().f42262a.b, null, g1t0.m().f42262a.f, 0L, null, 2, false, 2, 0, false, null, null, 0.0f, fetVar, (i2 >> 3) & 14, 1597440, 0, 4111160);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdm(mm40Var, str2, i, (byte) 13);
        }
    }

    public static final void N(mm40 mm40Var, j2n j2nVar, fet fetVar, int i) {
        mm40 mm40Var2;
        String str;
        String str2;
        fet fetVar2 = fetVar;
        fetVar2.g0(525852358);
        int i2 = i | 6 | (fetVar2.g(j2nVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            xx7 xx7Var = gqw0.n;
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), xx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            if (j2nVar == null || (str = j2nVar.f15788a) == null) {
                str = "";
            }
            v8q0.a(str, o7k0.u(jm40Var, 0.0f, 28.0f, 1), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary80(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            pzb.n(null, (j2nVar == null || (str2 = j2nVar.b) == null) ? "" : str2, null, fetVar2, 0, 5);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new b2n(mm40Var2, j2nVar, i, (byte) 4);
        }
    }

    public static final void O(mm40 mm40Var, a4x a4xVar, xcz xczVar, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(503032034);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(xczVar) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarU = o7k0.u(jm40Var, 0.0f, 128.0f, 1);
            yx7 yx7Var = gqw0.k;
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new oea(a4xVar, (byte) 7);
                fetVar.o0(objP);
            }
            int i3 = ((i2 >> 3) & 112) | 12779520;
            mm40Var2 = jm40Var;
            b8k0.f(mm40VarU, xczVar, null, false, null, yx7Var, null, false, null, (Function1) objP, fetVar, i3, 348);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t6m(mm40Var2, a4xVar, xczVar, i, (byte) 1);
        }
    }

    public static final void P(int i, fet fetVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        String str2 = str;
        fetVar2.g0(162692682);
        int i2 = i | 6 | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(mm40VarC, 36.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarS);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109), fetVar2, (i2 >> 3) & 14, 24576, 114682);
            str2 = str;
            fetVar2 = fetVar2;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdm(mm40Var2, str2, i, (byte) 14);
        }
    }

    public static final void Q(mm40 mm40Var, l7m0 l7m0Var, l7m0 l7m0Var2, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        l7m0 l7m0Var3;
        l7m0 l7m0Var4;
        fet fetVar2 = fetVar;
        fetVar2.g0(-492904795);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            l7m0Var3 = l7m0Var;
            i2 |= fetVar2.g(l7m0Var3) ? 32 : 16;
        } else {
            l7m0Var3 = l7m0Var;
        }
        if ((i & 384) == 0) {
            l7m0Var4 = l7m0Var2;
            i2 |= fetVar2.g(l7m0Var4) ? 256 : 128;
        } else {
            l7m0Var4 = l7m0Var2;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.i(function2) ? 16384 : 8192;
        }
        boolean z = false;
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            zhs zhsVar = (zhs) l7m0Var3.getValue();
            if (zhsVar != null) {
                if (zhsVar instanceof xhs) {
                    fetVar2.e0(366759643);
                    fetVar2.r(false);
                } else {
                    boolean z2 = zhsVar instanceof vhs;
                    byte b = 14;
                    cl5 cl5Var = ukd.f35823a;
                    if (z2) {
                        fetVar2.e0(366827223);
                        boolean z3 = true;
                        wom womVarF = mom.f(fetVar2);
                        boolean zBooleanValue = ((Boolean) l7m0Var4.getValue()).booleanValue();
                        if ((i2 & 7168) != 2048) {
                            z3 = false;
                        }
                        Object objP = fetVar2.P();
                        if (z3 || objP == cl5Var) {
                            objP = new hcr(function1, b);
                            fetVar2.o0(objP);
                        }
                        mom.c(null, zBooleanValue, womVarF, null, false, null, (Function0) objP, null, u1c.M(-1059899399, new eyn(zhsVar, mm40Var, function2, (byte) 12), fetVar2), fetVar, 100663296, ModuleDescriptor.MODULE_VERSION);
                        fetVar2 = fetVar;
                        fetVar2.r(false);
                    } else {
                        boolean z4 = true;
                        if (zhsVar instanceof whs) {
                            fetVar2.e0(367470318);
                            mm40 mm40VarW = o7k0.w(mm40Var, null, false, 3);
                            mdm mdmVar = ((whs) zhsVar).f39180a;
                            if ((i2 & 7168) != 2048) {
                                z4 = false;
                            }
                            Object objP2 = fetVar2.P();
                            if (z4 || objP2 == cl5Var) {
                                objP2 = new hcr(function1, (byte) 15);
                                fetVar2.o0(objP2);
                            }
                            jcb.l(mm40VarW, mdmVar, false, (Function0) objP2, fetVar2, 0, 4);
                            fetVar2.r(false);
                        } else if (zhsVar instanceof yhs) {
                            fetVar2.e0(367798360);
                            yhs yhsVar = (yhs) zhsVar;
                            int i3 = i2;
                            a4x a4xVar = yhsVar.b;
                            float f = yhsVar.f42653a;
                            Object objP3 = fetVar2.P();
                            if (objP3 == cl5Var) {
                                objP3 = new dcr((byte) 23);
                                fetVar2.o0(objP3);
                            }
                            ccq0.u(mm40Var, f, a4xVar, false, (Function1) objP3, fetVar2, (i3 & 14) | 27648);
                            fetVar2.r(false);
                        } else {
                            z = false;
                        }
                    }
                }
            }
            throw b1j.f(-1235096323, fetVar2, z);
        }
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o4p(mm40Var, l7m0Var, l7m0Var2, function1, function2, i, (byte) 1);
        }
    }

    public static float R(EdgeEffect edgeEffect, float f, float f2, w6k w6kVar) {
        float f3 = ijn.f14883a;
        double density = w6kVar.getDensity() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f) * 0.35f;
        double d = ((double) ijn.f14883a) * density;
        float fExp = (float) (Math.exp((ijn.b / ijn.c) * Math.log(dAbs / d)) * d);
        int i = Build.VERSION.SDK_INT;
        if (fExp > (i >= 31 ? gy2.f(edgeEffect) : 0.0f) * f2) {
            return 0.0f;
        }
        int iB = si30.b(f);
        if (i >= 31) {
            edgeEffect.onAbsorb(iB);
            return f;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iB);
        }
        return f;
    }

    public static final boolean S(cmp0 cmp0Var) {
        cmp0Var.getClass();
        List list = cmp0Var.c;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).length() <= 0) {
                return (cmp0Var.h.equals("0-0") && cmp0Var.e.equals("0") && cmp0Var.g.equals("0") && cmp0Var.d.equals("0") && cmp0Var.f.equals("0")) ? false : true;
            }
        }
        return true;
    }

    public static final void T(LinearLayout linearLayout, List list, List list2) {
        Iterator it = new ihu0(linearLayout).iterator();
        int i = 0;
        while (true) {
            jhu0 jhu0Var = (jhu0) it;
            if (!jhu0Var.hasNext()) {
                int i2 = 0;
                for (Object obj : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        q3d.p();
                        throw null;
                    }
                    int i4 = ((una0) obj).f35951a;
                    f1o0 f1o0Var = (f1o0) CollectionsKt.W(i2, list2);
                    if (f1o0Var == null) {
                        View viewInflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.synthetic_cyber_poker_combination_item, (ViewGroup) linearLayout, false);
                        if (viewInflate == null) {
                            hny.u("rootView");
                            return;
                        }
                        ImageView imageView = (ImageView) viewInflate;
                        f1o0 f1o0Var2 = new f1o0(imageView);
                        linearLayout.addView(imageView);
                        list2.add(f1o0Var2);
                        f1o0Var = f1o0Var2;
                    }
                    f1o0Var.f8774a.setImageResource(i4);
                    i2 = i3;
                }
                return;
            }
            Object next = jhu0Var.next();
            int i5 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            ((View) next).setVisibility(i < list.size() ? 0 : 8);
            i = i5;
        }
    }

    public static final boolean U(gdl gdlVar, long j) {
        if (!gdlVar.f20279a.n) {
            return false;
        }
        rdx rdxVar = (rdx) vcc.Z(gdlVar).h1.d;
        if (!rdxVar.D1.n) {
            return false;
        }
        long jY = rdxVar.Y(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jY >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jY & 4294967295L));
        long j2 = gdlVar.q;
        float f = ((int) (j2 >> 32)) + fIntBitsToFloat;
        float f2 = ((int) (j2 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f2;
    }

    public static final List V(ArrayList arrayList, List list) {
        Object next;
        list.getClass();
        ArrayList arrayListW = W(arrayList);
        ArrayList arrayListW2 = W(list);
        if (!arrayListW2.isEmpty()) {
            ArrayList<dao> arrayList2 = new ArrayList();
            for (Object obj : arrayListW) {
                if (((dao) obj).b > 0) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
            for (dao daoVar : arrayList2) {
                Iterator it = arrayListW2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    dao daoVar2 = (dao) next;
                    if (daoVar2.c == daoVar.c && daoVar2.b == daoVar.b && daoVar2.m.f32198a == daoVar.m.f32198a && daoVar2.f == daoVar.f) {
                        break;
                    }
                }
                dao daoVar3 = (dao) next;
                arrayList3.add(Integer.valueOf(((int) (daoVar.d * 10000.0d)) - ((int) ((daoVar3 != null ? daoVar3.d : 0.0d) * 10000.0d))));
            }
            ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (true) {
                boolean z = false;
                if (!it2.hasNext()) {
                    break;
                }
                if (((Number) it2.next()).intValue() <= 0) {
                    z = true;
                }
                arrayList4.add(Boolean.valueOf(z));
            }
            if (!arrayList4.isEmpty()) {
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    if (!((Boolean) it3.next()).booleanValue()) {
                    }
                }
            }
            ArrayList arrayList5 = new ArrayList(r3d.q(arrayList, 10));
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                xt20 xt20Var = (xt20) it4.next();
                List<List> list2 = xt20Var.f41445a;
                ArrayList arrayList6 = new ArrayList(r3d.q(list2, 10));
                for (List<dao> list3 : list2) {
                    ArrayList arrayList7 = new ArrayList(r3d.q(list3, 10));
                    for (dao daoVar4 : list3) {
                        cao caoVar = cao.f4021a;
                        arrayList7.add(dao.a(daoVar4, false, false, 516095));
                    }
                    arrayList6.add(arrayList7);
                }
                arrayList5.add(xt20.a(xt20Var, arrayList6, false, 0L, 0.0d, 254));
            }
            return arrayList5;
        }
        return arrayList;
    }

    public static final ArrayList W(List list) {
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(r3d.r(((xt20) it.next()).f41445a));
        }
        return r3d.r(arrayList);
    }

    public static final boolean a0(cmp0 cmp0Var) {
        if (cmp0Var == null || cmp0Var.d.equals("0")) {
            return false;
        }
        return (cmp0Var.e.equals("0") && cmp0Var.f.equals("0") && cmp0Var.g.equals("0")) ? false : true;
    }

    public static final void b(mm40 mm40Var, y1m y1mVar, boolean z, fet fetVar, int i) {
        fetVar.g0(-1365562497);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(y1mVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 86.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
            obb.q(jr8.f16991a.b(jm40.b, gqw0.e), y1mVar, z, fetVar, i2 & 1008, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q2n((Object) mm40Var, (Object) y1mVar, z, i, (byte) 0);
        }
    }

    public static final void c(tbm tbmVar, fet fetVar, int i) {
        fet fetVar2;
        fetVar.g0(-1703249638);
        int i2 = (fetVar.g(tbmVar) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            fetVar2 = fetVar;
            dww.b(jpm0.t(Intrinsics.d(tbmVar, sbm.f31943a) ? R.drawable.ic_glyph_chevron_up_small : R.drawable.ic_glyph_chevron_down_small, 6, fetVar), null, o7k0.n(jm40.b, 18.0f), ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU(), fetVar2, 48, 0);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i3l(tbmVar, i, (byte) 13);
        }
    }

    public static final void d(final o0x o0xVar, final m0x m0xVar, final long j, final long j2, final boolean z, final y3d y3dVar, final Boolean bool, final Boolean bool2, final Integer num, final boolean z2, final Function0 function0, final xdr xdrVar, final xdr xdrVar2, fet fetVar, final int i) {
        long primary;
        boolean z3;
        fet fetVar2 = fetVar;
        function0.getClass();
        fetVar2.g0(-1567454252);
        int i2 = (fetVar2.g(null) ? 67108864 : 33554432) | i | (fetVar2.g(o0xVar) ? 4 : 2) | (fetVar2.g(m0xVar) ? 32 : 16) | (fetVar2.d(0.0f) ? 256 : 128) | (fetVar2.d(0.0f) ? 2048 : 1024) | (fetVar2.f(j) ? 16384 : 8192) | (fetVar2.f(j2) ? 131072 : 65536) | (fetVar2.h(z) ? 1048576 : 524288) | (fetVar2.g(y3dVar) ? 8388608 : 4194304) | (fetVar2.g(bool) ? 536870912 : 268435456);
        int i3 = (fetVar2.g(bool2) ? 4 : 2) | (fetVar2.g(num) ? 32 : 16) | (fetVar2.h(z2) ? 256 : 128) | (fetVar2.i(function0) ? 2048 : 1024) | (fetVar2.i(xdrVar) ? 16384 : 8192) | (fetVar2.i(xdrVar2) ? 131072 : 65536);
        if (fetVar2.U(i2 & 1, ((i2 & 306783379) == 306783378 && (74899 & i3) == 74898) ? false : true)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(jm40Var, "DS_CHIP");
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(mm40VarE0, 48.0f, 0.0f, 2);
            boolean z4 = ((i3 & 7168) == 2048) | ((i2 & 3670016) == 1048576);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z4 || objP == cl5Var) {
                objP = new jw7(z, function0, (byte) 6);
                fetVar2.o0(objP);
            }
            mm40 mm40VarF = phu0.F(mm40VarG, null, null, false, null, (Function0) objP, fetVar2, 0, 15);
            boolean z5 = (i3 & 896) == 256;
            Object objP2 = fetVar2.P();
            if (z5 || objP2 == cl5Var) {
                objP2 = new z((byte) 8, z2);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarL = s5x0.L(pai0.a(mm40VarF, true, (Function1) objP2), 0.0f, 8.0f, 1);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z6 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z6) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarQ = i120.Q(o7k0.g(epv0.N(jm40Var, z ? 0.5f : 1.0f), 32.0f, 0.0f, 2), j2, vgg0.a(14.0f));
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            int i4 = i2 >> 9;
            int i5 = i2 >> 3;
            int i6 = (i4 & 112) | (i5 & 896);
            int i7 = i4 & 7168;
            ebc.b(s5x0.N(jm40Var, 6.0f, 0.0f, 8.0f, 0.0f, 10), j, 0.0f, z, o0xVar, num, null, null, null, null, bool, null, null, null, fetVar2, i6 | i7 | ((i2 << 12) & 57344) | (458752 & (i3 << 12)), (i2 >> 27) & 14, 15296);
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 6.0f, 0.0f, 11);
            if (y3dVar != null) {
                primary = y3dVar.f41946a;
            } else {
                pz40 pz40Var = s6t0.f31722a;
                primary = s6t0.b().f33626a.getPrimary();
            }
            ebc.b(mm40VarN, primary, 0.0f, z, null, null, m0xVar, null, null, null, null, bool2, null, null, fetVar, ((i2 << 15) & 3670016) | (i2 & 896) | i7 | (i5 & 29360128), (i3 << 3) & 112, 14128);
            fetVar2 = fetVar;
            fetVar2.r(true);
            jr8 jr8Var = jr8.f16991a;
            if (xdrVar == null) {
                fetVar2.e0(968061918);
                z3 = false;
                fetVar2.r(false);
            } else {
                z3 = false;
                fetVar2.e0(968061919);
                xdrVar.F(jr8Var, fetVar2, 6);
                fetVar2.r(false);
            }
            if (xdrVar2 == null) {
                fetVar2.e0(968133342);
                fetVar2.r(z3);
            } else {
                fetVar2.e0(968133343);
                xdrVar2.F(jr8Var, fetVar2, 6);
                fetVar2.r(z3);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(m0xVar, j, j2, z, y3dVar, bool, bool2, num, z2, function0, xdrVar, xdrVar2, i) { // from class: a.ubc
                public final /* synthetic */ m0x b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ y3d f;
                public final /* synthetic */ Boolean g;
                public final /* synthetic */ Boolean h;
                public final /* synthetic */ Integer i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ Function0 k;
                public final /* synthetic */ xdr l;
                public final /* synthetic */ xdr m;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(1);
                    vbc.d(this.f35373a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final fqj0 d0(vqm vqmVar, fet fetVar, int i, int i2) {
        long secondary20;
        Float fValueOf = Float.valueOf(-1.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        boolean z = true;
        vqm vqmVar2 = (i2 & 1) != 0 ? vqm.f37862a : vqmVar;
        int i3 = i & 14;
        int iOrdinal = vqmVar2.ordinal();
        if (iOrdinal == 0) {
            fetVar.e0(-892334207);
            secondary20 = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary20();
            fetVar.r(false);
        } else if (iOrdinal == 1) {
            fetVar.e0(-892331619);
            secondary20 = ((StaticColors) fetVar.k(m8m0.f21378a)).m126getWhite200d7_KjU();
            fetVar.r(false);
        } else if (iOrdinal == 2) {
            fetVar.e0(-892329187);
            secondary20 = ((StaticColors) fetVar.k(m8m0.f21378a)).m73getBlack400d7_KjU();
            fetVar.r(false);
        } else if (iOrdinal == 3) {
            fetVar.e0(-892326659);
            secondary20 = ((StaticColors) fetVar.k(m8m0.f21378a)).m73getBlack400d7_KjU();
            fetVar.r(false);
        } else {
            if (iOrdinal != 4) {
                throw b1j.f(-892336323, fetVar, false);
            }
            fetVar.e0(-892324049);
            secondary20 = ((IndividualColors) fetVar.k(j7x.f16059a)).getWebGamesControlBackground();
            fetVar.r(false);
        }
        long j = secondary20;
        zfn zfnVar = m8m0.f21378a;
        a4x a4xVarO0 = dyb.o0(dyb.g0(new y3d(((StaticColors) fetVar.k(zfnVar)).m121getTransparent0d7_KjU()), new y3d(((ThemeColors) fetVar.k(zaq0.b)).getSecondary10()), new y3d(((StaticColors) fetVar.k(zfnVar)).m121getTransparent0d7_KjU())));
        boolean z2 = ((Configuration) fetVar.k(dy2.f6873a)).getLayoutDirection() == 1;
        if (((i3 ^ 6) <= 4 || !fetVar.e(vqmVar2.ordinal())) && (i & 6) != 4) {
            z = false;
        }
        boolean zH = z | fetVar.h(z2);
        Object objP = fetVar.P();
        if (zH || objP == ukd.f35823a) {
            prs0 prs0Var = z2 ? new prs0(yqm.f43083a, fValueOf2, fValueOf) : new prs0(xqm.f41328a, fValueOf, fValueOf2);
            zqm zqmVar = (zqm) prs0Var.f27482a;
            float fFloatValue = ((Number) prs0Var.b).floatValue();
            float fFloatValue2 = ((Number) prs0Var.c).floatValue();
            z73 z73Var = ihn.d;
            kkf0 kkf0Var = kkf0.f18436a;
            long j2 = y3d.f;
            dyb.g0(new y3d(j2), new y3d(j2), new y3d(j2));
            zqmVar.getClass();
            z73Var.getClass();
            a4xVarO0.getClass();
            fqj0 fqj0Var = new fqj0(fFloatValue, fFloatValue2, z73Var, a4xVarO0, j, zqmVar);
            fetVar.o0(fqj0Var);
            objP = fqj0Var;
        }
        return (fqj0) objP;
    }

    public static final rse e0(String str) {
        str.getClass();
        rse rseVar = rse.b;
        if (Intrinsics.d(str, "line")) {
            return rseVar;
        }
        return Intrinsics.d(str, "dashed") ? rse.c : rse.f31027a;
    }

    public static final void f(l7m0 l7m0Var, int i, fet fetVar, int i2) {
        int i3;
        int i4 = i;
        l7m0Var.getClass();
        fetVar.g0(-1515736672);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.e(i4) ? 32 : 16;
        }
        byte b = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            fetVar.Z();
            if ((i2 & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            Activity activity = (Activity) fetVar.k(cr00.f4820a);
            Configuration configuration = (Configuration) fetVar.k(dy2.f6873a);
            Window window = activity != null ? activity.getWindow() : null;
            boolean zC = pkd.c(fetVar);
            float fFloatValue = ((Number) l7m0Var.getValue()).floatValue();
            boolean zD = fetVar.d(fFloatValue);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zD || objP == obj) {
                objP = jgk0.b(new c5d(fFloatValue, zC, (byte) 0));
                fetVar.o0(objP);
            }
            l7m0 l7m0Var2 = (l7m0) objP;
            Object value = l7m0Var2.getValue();
            boolean zI = fetVar.i(window) | fetVar.i(activity) | ((((i3 & 112) ^ 48) > 32 && fetVar.e(i4)) || (i3 & 48) == 32) | fetVar.g(l7m0Var2) | fetVar.h(zC);
            Object objP2 = fetVar.P();
            if (zI || objP2 == obj) {
                Object d5dVar = new d5d(window, activity, i4, l7m0Var2, zC);
                fetVar.o0(d5dVar);
                objP2 = d5dVar;
            }
            s0x.e(value, configuration, null, (Function1) objP2, fetVar, 0, 4);
        } else {
            i4 = i4;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new al1(b, i4, i2, l7m0Var);
        }
    }

    public static final qtr f0(d0t d0tVar, boolean z, boolean z2, boolean z3) {
        int i;
        d0tVar.getClass();
        ArrayList arrayList = new ArrayList();
        List list = d0tVar.K;
        long j = d0tVar.f5282a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g07 g07VarP = wb.P((BetGroupZip) it.next(), j, "");
            if (g07VarP != null) {
                arrayList.add(g07VarP);
            }
        }
        for (d0t d0tVar2 : d0tVar.k) {
            String str = d0tVar2.i;
            Iterator it2 = d0tVar2.K.iterator();
            while (it2.hasNext()) {
                g07 g07VarP2 = wb.P((BetGroupZip) it2.next(), j, str);
                if (g07VarP2 != null) {
                    arrayList.add(g07VarP2);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        boolean z4 = false;
        int i2 = 0;
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            g07 g07Var = (g07) obj;
            arrayList2.add(new i07(g07Var.f10444a, new c07(g07Var.b, g07Var.c, g07Var.d), g07Var.e, CollectionsKt.S(CollectionsKt.r0(g07Var.g, null))));
            i2 = i3;
        }
        List listD0 = arrayList2;
        if (!z) {
            listD0 = CollectionsKt.D0(arrayList2, 1);
        }
        List list2 = listD0;
        if (z) {
            Iterator it3 = list2.iterator();
            int iA = 0;
            while (true) {
                i = 9;
                if (!it3.hasNext()) {
                    break;
                }
                i07 i07Var = (i07) it3.next();
                double size = ((double) i07Var.d.size()) / ((double) i07Var.c);
                int i4 = iA + 1;
                if (i4 == 9) {
                    z4 = true;
                }
                iA = i4 + si30.a(size);
            }
            if (z4) {
                i = 10;
            }
        } else {
            i = 2;
        }
        return new qtr(d0tVar.f5282a, d0tVar.n, d0tVar.C, new ptr(i, list2, z, z2, !list2.isEmpty(), z3), d0tVar.v, d0tVar.u);
    }

    public static final void j(mm40 mm40Var, j83 j83Var, fet fetVar) {
        j83Var.getClass();
        zcl zclVar = qmk.f28987a;
        mm40 mm40VarD = o7k0.d(s5x0.L(mm40Var, 12.0f, 0.0f, 2), 1.0f);
        ((g1t0) fetVar.k(j1t0.e)).getClass();
        v8q0.b(j83Var, mm40VarD, 0L, null, 0L, null, idm0.v(0.4f, 4294967296L), new f2q0(3), 0L, 0, false, 1, 0, null, null, g1t0.h(), fetVar, 0, 24576, 244476);
    }

    public static final void l(chv0 chv0Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(-1707270748);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(chv0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) fetVar.k(dy2.b);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dof.f6411a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            mm40 mm40VarE0 = o2e.e0(jm40.b, "CS2_GAME_WINRATE");
            boolean zI = fetVar.i(context) | ((i2 & 14) == 4);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new v4f(chv0Var, context, (byte) 10);
                fetVar.o0(objP2);
            }
            fetVar2 = fetVar;
            y860.f(xdrVar, mm40VarE0, (Function1) objP2, fetVar2, 54, 0);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n00(chv0Var, i, (byte) 25);
        }
    }

    public static final void m(mm40 mm40Var, ncg ncgVar, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(-1493896970);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(ncgVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = jm40.b;
            nkb.h(s5x0.N(mm40Var2, 0.0f, 6.0f, 0.0f, 0.0f, 13), ncgVar.b, kjm.b, null, null, null, fetVar, 384, 56);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zma(mm40Var2, ncgVar, i, (byte) 13);
        }
    }

    public static final void n(CyberGamesPage cyberGamesPage, CyberGamesParentSectionModel cyberGamesParentSectionModel, fet fetVar, int i) {
        fet fetVar2;
        Object dgVar;
        yje yjeVar;
        k3t0 k3t0Var;
        fet fetVar3 = fetVar;
        cyberGamesPage.getClass();
        cyberGamesParentSectionModel.getClass();
        fetVar3.g0(1342107350);
        byte b = 2;
        int i2 = (fetVar3.i(cyberGamesPage) ? 4 : 2) | i | (fetVar3.i(cyberGamesParentSectionModel) ? 32 : 16);
        byte b2 = 0;
        if (fetVar3.U(i2 & 1, (i2 & 19) != 18)) {
            Object obj = (Fragment) fetVar3.k(mr00.f22246a);
            String name = yii.class.getName();
            Context applicationContext = ((Context) fetVar3.k(dy2.b)).getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application == null) {
                throw new ss3((byte) 0);
            }
            riu0 riu0VarA = ms00.a(fetVar3);
            if (riu0VarA == null) {
                throw new tiu0();
            }
            Object objP = fetVar3.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new kch(application, cyberGamesPage, cyberGamesParentSectionModel, b2);
                fetVar3.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean zG = fetVar3.g(riu0VarA) | fetVar3.g(name);
            Object objP2 = fetVar3.P();
            if (zG || objP2 == cl5Var) {
                ojg ojgVar = new ojg((byte) 1);
                zfc zfcVar = new zfc(function0, (byte) 2);
                tre0 tre0Var = sre0.f32672a;
                ojgVar.a(tre0Var.b(kgd.class), zfcVar);
                qbx qbxVarB = ojgVar.b();
                piu0 piu0VarG = riu0VarA.g();
                vbf vbfVar = vbf.b;
                piu0VarG.getClass();
                vbfVar.getClass();
                objP2 = (kgd) new h0q0(piu0VarG, qbxVarB, vbfVar).t(tre0Var.b(kgd.class), name);
                fetVar3.o0(objP2);
            }
            Object obj2 = ((kgd) objP2).b;
            if (obj2 == null) {
                hny.u("null cannot be cast to non-null type org.xplatform.cyber.section.impl.home.di.HomeFragmentComponent");
                return;
            }
            yii yiiVar = (yii) obj2;
            Object objP3 = fetVar3.P();
            if (objP3 == cl5Var) {
                objP3 = new fiu0(Collections.singletonMap(ukw.class, yiiVar.L));
                fetVar3.o0(objP3);
            }
            fiu0 fiu0Var = (fiu0) objP3;
            Object objP4 = fetVar3.P();
            if (objP4 == cl5Var) {
                objP4 = yiiVar.f42692a.d();
                x1x.x(objP4);
                fetVar3.o0(objP4);
            }
            Object obj3 = (ujd) objP4;
            Object objP5 = fetVar3.P();
            if (objP5 == cl5Var) {
                objP5 = yiiVar.c;
                fetVar3.o0(objP5);
            }
            Object obj4 = (wdk0) objP5;
            Object objP6 = fetVar3.P();
            if (objP6 == cl5Var) {
                objP6 = yiiVar.d;
                fetVar3.o0(objP6);
            }
            Object obj5 = (ooq0) objP6;
            k3t0 k3t0VarY = n4c.Y(sre0.f32672a.b(ukw.class), null, fiu0Var, fetVar3, 14);
            Object objP7 = fetVar3.P();
            if (objP7 == cl5Var) {
                objP7 = new qdz();
                fetVar3.o0(objP7);
            }
            qdz qdzVar = (qdz) objP7;
            boolean zI = fetVar3.i(obj3) | fetVar3.i(obj) | fetVar3.i(k3t0VarY);
            Object objP8 = fetVar3.P();
            if (zI || objP8 == cl5Var) {
                objP8 = new kk0(obj3, obj, k3t0VarY, (byte) 25);
                fetVar3.o0(objP8);
            }
            Function0 function1 = (Function0) objP8;
            boolean zI2 = fetVar3.i(obj3) | fetVar3.i(obj);
            Object objP9 = fetVar3.P();
            if (zI2 || objP9 == cl5Var) {
                objP9 = new vef(obj3, obj, (byte) 9);
                fetVar3.o0(objP9);
            }
            v3c.A(function1, (Function0) objP9, null, fetVar3, 0, 4);
            boolean zI3 = fetVar3.i(k3t0VarY);
            Object objP10 = fetVar3.P();
            if (zI3 || objP10 == cl5Var) {
                objP10 = new dbh(k3t0VarY, b);
                fetVar3.o0(objP10);
            }
            Function0 function2 = (Function0) objP10;
            boolean zI4 = fetVar3.i(k3t0VarY);
            Object objP11 = fetVar3.P();
            byte b3 = 3;
            if (zI4 || objP11 == cl5Var) {
                objP11 = new dbh(k3t0VarY, b3);
                fetVar3.o0(objP11);
            }
            v3c.z(function2, (Function0) objP11, null, fetVar3, 0, 4);
            boolean zI5 = fetVar3.i(obj3) | fetVar3.i(obj5) | fetVar3.i(obj4) | fetVar3.i(obj) | fetVar3.i(k3t0VarY);
            Object objP12 = fetVar3.P();
            if (zI5 || objP12 == cl5Var) {
                yjeVar = null;
                dgVar = new dg(obj3, obj5, obj4, obj, k3t0VarY, (byte) 11);
                k3t0Var = k3t0VarY;
                fetVar3.o0(dgVar);
            } else {
                dgVar = objP12;
                yjeVar = null;
                k3t0Var = k3t0VarY;
            }
            clz clzVar = (clz) fetVar3.k(or00.f25714a);
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) dgVar, fetVar3);
            boolean zI6 = fetVar3.i(k3t0Var) | fetVar3.i(clzVar) | fetVar3.e(3) | fetVar3.g(pz40VarF);
            Object objP13 = fetVar3.P();
            if (zI6 || objP13 == cl5Var) {
                Object pcVar = new pc(k3t0Var, clzVar, pz40VarF, yjeVar, (byte) 13);
                fetVar3.o0(pcVar);
                objP13 = pcVar;
            }
            m0x0.t(fetVar3, clzVar, (Function2) objP13);
            i3t0 i3t0Var = (i3t0) k3t0Var;
            pz40 pz40VarY = i3t0Var.y(fetVar3);
            Object objP14 = fetVar3.P();
            byte b4 = 6;
            if (objP14 == cl5Var) {
                objP14 = new m7h(b4);
                fetVar3.o0(objP14);
            }
            mm40 mm40VarK = lgb.K(rq8.K(jm40.b, (Function1) objP14));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarK);
            mkd.c0.getClass();
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(e7z.u1);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, tj30VarC, gqw0.x);
            jpm0.o(fetVar3, bh90VarM, gqw0.w);
            jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar3);
            jpm0.o(fetVar3, mm40VarC0, gqw0.v);
            boolean zI7 = fetVar3.i(i3t0Var);
            Object objP15 = fetVar3.P();
            if (zI7 || objP15 == cl5Var) {
                objP15 = new vi6(i3t0Var, b4);
                fetVar3.o0(objP15);
            }
            Function1 function3 = (Function1) objP15;
            boolean zI8 = fetVar3.i(i3t0Var);
            Object objP16 = fetVar3.P();
            if (zI8 || objP16 == cl5Var) {
                objP16 = new vi6(i3t0Var, (byte) 7);
                fetVar3.o0(objP16);
            }
            ntr.r(pz40VarY, qdzVar, function3, (Function1) objP16, fetVar, 48);
            fet fetVar4 = fetVar;
            fetVar4.r(true);
            fetVar2 = fetVar4;
        } else {
            fetVar3.X();
            fetVar2 = fetVar3;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eod(cyberGamesPage, cyberGamesParentSectionModel, i, (byte) 28);
        }
    }

    public static final void o(mm40 mm40Var, a4x a4xVar, ugd ugdVar, fet fetVar, int i) {
        mm40 mm40Var2;
        int i2;
        yfe0 yfe0VarU;
        rph rphVar;
        a4xVar.getClass();
        fetVar.g0(1365580830);
        if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i2 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(ugdVar) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            if (a4xVar.isEmpty()) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    rphVar = new rph(mm40Var2, a4xVar, ugdVar, i, (byte) 2);
                }
            } else {
                mm40 mm40VarV = vic.v(mm40Var);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarJ = s5x0.J(mm40VarV, 8.0f);
                byte b = 14;
                x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4(b)), gqw0.m, fetVar, 0);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
                mkd.c0.getClass();
                fetVar.i0();
                boolean z = fetVar.S;
                pcy pcyVar = e7z.u1;
                if (z) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                shd shdVar = gqw0.x;
                jpm0.o(fetVar, x5dVarA, shdVar);
                shd shdVar2 = gqw0.w;
                jpm0.o(fetVar, bh90VarM, shdVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                shd shdVar3 = gqw0.y;
                jpm0.o(fetVar, numValueOf, shdVar3);
                jpm0.n(fetVar);
                shd shdVar4 = gqw0.v;
                jpm0.o(fetVar, mm40VarC0, shdVar4);
                jm40 jm40Var = jm40.b;
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4(b)), gqw0.j, fetVar, 0);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA, shdVar);
                jpm0.o(fetVar, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar4);
                fetVar.e0(1048728536);
                for (dqh dqhVar : CollectionsKt.D0(a4xVar, 3)) {
                    fbc.k(0, fetVar, new x7z(1.0f, true), dqhVar.f6515a, dqhVar.b);
                }
                fetVar.r(false);
                fetVar.r(true);
                zcl zclVar2 = qmk.f28987a;
                ugdVar.F(o7k0.e(jm40Var, 22.0f), fetVar, Integer.valueOf((i2 >> 3) & 112));
                fetVar.r(true);
            }
            yfe0VarU.d = rphVar;
        }
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            rphVar = new rph(mm40Var, a4xVar, ugdVar, i, (byte) 3);
            yfe0VarU.d = rphVar;
        }
    }

    public static final void p(mm40 mm40Var, u3i u3iVar, u3i u3iVar2, u3i u3iVar3, String str, Function1 function1, fet fetVar, int i) {
        u3i u3iVar4;
        Function1 function2;
        boolean z;
        int i2;
        int i3;
        int i4;
        function1.getClass();
        fetVar.g0(-2065914499);
        int i5 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(u3iVar) ? 32 : 16) | (fetVar.g(u3iVar2) ? 256 : 128) | (fetVar.g(u3iVar3) ? 2048 : 1024) | (fetVar.g(str) ? 16384 : 8192);
        if ((i & 196608) == 0) {
            i5 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if (fetVar.U(i5 & 1, (74899 & i5) != 74898)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(s5x0.L(mm40Var, 4.0f, 0.0f, 2), 40.0f), 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            if (str == null || str.length() == 0) {
                fetVar.e0(2011466303);
                fetVar.r(false);
            } else {
                fetVar.e0(2011144368);
                obc.d(bmd.n.a(k6z.f17794a), u1c.M(-513431266, new g0(str, (byte) 27), fetVar), fetVar, 56);
                fetVar.r(false);
            }
            zx7 zx7Var = gqw0.f;
            jr8 jr8Var = jr8.f16991a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarB = jr8Var.b(jm40Var, zx7Var);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarB);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            boolean z3 = u3iVar instanceof v3i;
            cl5 cl5Var = ukd.f35823a;
            if (z3) {
                fetVar.e0(-511880182);
                tj30 tj30VarC2 = zq8.c(gqw0.b, false);
                i2 = 458752;
                int iHashCode3 = Long.hashCode(fetVar.T);
                bh90 bh90VarM3 = fetVar.m();
                mm40 mm40VarC2 = kbc.c0(fetVar, jm40Var);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC2, shdVar);
                jpm0.o(fetVar, bh90VarM3, shdVar2);
                vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC2, shdVar4);
                f2i f2iVar = ((v3i) u3iVar).f36733a;
                int i6 = f2iVar instanceof e2i ? R.drawable.ic_glyph_video_zone : R.drawable.ic_glyph_broadcast;
                boolean z4 = f2iVar instanceof d2i;
                boolean z5 = !z4;
                boolean z6 = ((i5 & 458752) == 131072) | ((i5 & 112) == 32);
                Object objP = fetVar.P();
                if (z6 || objP == cl5Var) {
                    function2 = function1;
                    objP = new a3i(function2, u3iVar, (byte) 1);
                    fetVar.o0(objP);
                } else {
                    function2 = function1;
                }
                Function0 function0 = (Function0) objP;
                z = false;
                q(i6, 0, fetVar, null, function0, z5);
                if (z4) {
                    fetVar.e0(-856018983);
                    acb.p(0, fetVar, null);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-855956518);
                    fetVar.r(false);
                }
                fetVar.r(true);
                fetVar.r(false);
            } else {
                function2 = function1;
                z = false;
                i2 = 458752;
                fetVar.e0(-511095045);
                fetVar.r(false);
            }
            if (u3iVar2 instanceof z3i) {
                fetVar.e0(-510987537);
                int iOrdinal = ((z3i) u3iVar2).f43719a.ordinal();
                if (iOrdinal == 0) {
                    i4 = R.drawable.ic_glyph_notification_active;
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return;
                    }
                    i4 = R.drawable.ic_glyph_notification_inactive;
                }
                int i7 = i4;
                boolean z7 = ((i5 & 896) == 256 ? true : z) | ((i5 & i2) == 131072 ? true : z);
                Object objP2 = fetVar.P();
                if (z7 || objP2 == cl5Var) {
                    objP2 = new brh(function2, u3iVar2, (byte) 5);
                    fetVar.o0(objP2);
                }
                q(i7, 384, fetVar, null, (Function0) objP2, true);
                fetVar.r(z);
            } else {
                fetVar.e0(-510545477);
                fetVar.r(z);
            }
            u3iVar4 = u3iVar3;
            if (u3iVar4 instanceof x3i) {
                fetVar.e0(-510446339);
                int iOrdinal2 = ((x3i) u3iVar4).f40219a.ordinal();
                if (iOrdinal2 == 0) {
                    i3 = R.drawable.ic_glyph_favourite_active;
                } else {
                    if (iOrdinal2 != 1) {
                        t9f.b();
                        return;
                    }
                    i3 = R.drawable.ic_glyph_favourite_inactive;
                }
                boolean z8 = ((i5 & 7168) == 2048 ? true : z) | ((i5 & i2) == 131072 ? true : z);
                Object objP3 = fetVar.P();
                if (z8 || objP3 == cl5Var) {
                    objP3 = new arh(function2, u3iVar4, (byte) 5);
                    fetVar.o0(objP3);
                }
                q(i3, 384, fetVar, null, (Function0) objP3, true);
                fetVar.r(z);
            } else {
                fetVar.e0(-510017733);
                fetVar.r(z);
            }
            fetVar.r(true);
            fetVar.r(true);
        } else {
            u3iVar4 = u3iVar3;
            function2 = function1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new b3i(mm40Var, u3iVar, u3iVar2, u3iVar4, str, function2, i, (byte) 1);
        }
    }

    public static final void q(int i, int i2, fet fetVar, mm40 mm40Var, Function0 function0, boolean z) {
        mm40 mm40Var2;
        long secondary20;
        fetVar.g0(1252788966);
        int i3 = i2 | 6 | (fetVar.e(i) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i3 |= fetVar.h(z) ? 256 : 128;
        }
        int i4 = i3 | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i4 & 1, (i4 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = s5x0.J(o7k0.s(o7k0.e(jm40Var, 32.0f), 40.0f), 4.0f);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarW = y860.W(i120.Q(mm40VarJ, ((ThemeColors) fetVar.k(zfnVar)).getBackground(), vgg0.f37379a), null, null, z, null, function0, 24);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
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
            mm40 mm40VarJ2 = s5x0.J(jm40Var, 4.0f);
            pm80 pm80VarF = a8k0.F(i, (i4 >> 3) & 14, fetVar);
            if (z) {
                fetVar.e0(-2117839321);
                secondary20 = ((ThemeColors) fetVar.k(zfnVar)).getPrimary();
            } else {
                fetVar.e0(-2117838325);
                secondary20 = ((ThemeColors) fetVar.k(zfnVar)).getSecondary20();
            }
            fetVar.r(false);
            dww.c(pm80VarF, null, mm40VarJ2, secondary20, fetVar, 56, 0);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new h2i(mm40Var2, i, z, function0, i2, (byte) 2);
        }
    }

    public static final void r(l7m0 l7m0Var, qdz qdzVar, Function1 function1, Function1 function2, fet fetVar, int i) {
        l7m0Var.getClass();
        qdzVar.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(451145952);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.g(qdzVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | (fetVar.i(function2) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = jgk0.b(new plh(l7m0Var, (byte) 15));
                fetVar.o0(objP);
            }
            int iOrdinal = ((n2o) ((l7m0) objP).getValue()).ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(1136795864);
                wvb.g(l7m0Var, qdzVar, function1, function2, fetVar, i2 & 8190);
                fetVar.r(false);
            } else if (iOrdinal == 1) {
                fetVar.e0(1137112405);
                dyb.m(l7m0Var, qdzVar, function1, function2, fetVar, i2 & 8190);
                fetVar.r(false);
            } else if (iOrdinal == 2) {
                fetVar.e0(1137432852);
                b34.q(l7m0Var, qdzVar, function1, function2, fetVar, i2 & 8190);
                fetVar.r(false);
            } else {
                if (iOrdinal != 3) {
                    throw b1j.f(-240424997, fetVar, false);
                }
                fetVar.e0(1137752214);
                fbc.u(l7m0Var, qdzVar, function1, function2, fetVar, i2 & 8190);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new keg(l7m0Var, qdzVar, function1, function2, i, (byte) 8);
        }
    }

    public static final void s(mm40 mm40Var, brl brlVar, fet fetVar, int i) {
        fetVar.g0(-668502453);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(brlVar) ? 32 : 16;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = brlVar instanceof zql;
            jm40 jm40Var = jm40.b;
            if (z) {
                fetVar.e0(406987170);
                t((zql) brlVar, fetVar, i2 & 126);
                fetVar.r(false);
            } else {
                if (!brlVar.equals(arl.f1351a)) {
                    throw b1j.f(1814241689, fetVar, false);
                }
                fetVar.e0(407128747);
                u(i2 & 14, fetVar, jm40Var);
                fetVar.r(false);
            }
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new oql(mm40Var, brlVar, i, b);
        }
    }

    public static final void t(zql zqlVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(1315934980);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(zqlVar) ? 32 : 16;
        }
        byte b = 1;
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else if (zqlVar instanceof wql) {
            fetVar.e0(1893138304);
            lv00.z((wql) zqlVar, fetVar, i2 & 126);
            fetVar.r(false);
        } else if (zqlVar instanceof xql) {
            fetVar.e0(1893142565);
            lv00.A((xql) zqlVar, fetVar, i2 & 126);
            fetVar.r(false);
        } else {
            if (!(zqlVar instanceof yql)) {
                throw b1j.f(1893136116, fetVar, false);
            }
            fetVar.e0(1893146882);
            qbc.j(jm40Var, (yql) zqlVar, fetVar, i2 & 126);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pql(zqlVar, i, b);
        }
    }

    public static final void u(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(-1542402087);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, 224.0f), 1.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD), d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ujl(mm40Var, i, (byte) 18);
        }
    }

    public static final void v(mm40 mm40Var, b0m b0mVar, fet fetVar, int i) {
        b0m b0mVar2;
        mm40 mm40Var2;
        jm40 jm40Var;
        fet fetVar2 = fetVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        fetVar2.g0(-533432142);
        int i2 = i | 6 | (fetVar2.g(b0mVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = b0mVar instanceof zzl;
            pcy pcyVar = e7z.u1;
            jm40 jm40Var2 = jm40.b;
            if (z) {
                fetVar2.e0(-97721750);
                mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarE = o7k0.e(mm40VarD, 28.0f);
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                int iHashCode = Long.hashCode(fetVar2.T);
                bh90 bh90VarM = fetVar2.m();
                mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC, shdVar4);
                jpm0.o(fetVar2, bh90VarM, shdVar3);
                vqd.u(iHashCode, fetVar2, shdVar2, fetVar2);
                jpm0.o(fetVar2, mm40VarC0, shdVar);
                mm40 mm40VarB = jr8.f16991a.b(jm40Var2, gqw0.h);
                thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarB);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA, shdVar4);
                jpm0.o(fetVar2, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, fetVar2, shdVar2, fetVar2);
                jpm0.o(fetVar2, mm40VarC1, shdVar);
                zzl zzlVar = (zzl) b0mVar;
                thb.f(o7k0.n(jm40Var2, 14.0f), zzlVar.f45260a, fetVar2, 0, 0);
                mm40 mm40VarE0 = o2e.e0(o7k0.d(jm40Var2, 1.0f), "MENU_CELL_SUBTITLE");
                String str = zzlVar.b;
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                jm40Var = jm40Var2;
                v8q0.a(str, mm40VarE0, zzlVar.c, null, 0L, null, null, null, 0L, null, qmk.C, 2, false, 2, 0, null, g1t0.g(), fetVar, 48, 24960, 108536);
                fetVar2 = fetVar;
                ohs0.x(fetVar2, true, true, false);
            } else {
                jm40Var = jm40Var2;
                if (b0mVar instanceof a0m) {
                    fetVar2.e0(-96509247);
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarE2 = o7k0.e(mm40VarD2, 28.0f);
                    tj30 tj30VarC2 = zq8.c(gqw0.g, false);
                    int iHashCode3 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM3 = fetVar2.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarE2);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC2, shdVar4);
                    jpm0.o(fetVar2, bh90VarM3, shdVar3);
                    vqd.u(iHashCode3, fetVar2, shdVar2, fetVar2);
                    jpm0.o(fetVar2, mm40VarC2, shdVar);
                    mm40 mm40VarE1 = o2e.e0(jm40Var, "MENU_CELL_SUBTITLE");
                    a0m a0mVar = (a0m) b0mVar;
                    String str2 = a0mVar.f31a;
                    ((g1t0) fetVar2.k(j1t0.e)).getClass();
                    jm40Var = jm40Var;
                    v8q0.a(str2, mm40VarE1, a0mVar.b, null, 0L, null, null, null, 0L, null, qmk.C, 2, false, 2, 0, null, g1t0.g(), fetVar, 48, 24960, 108536);
                    fetVar2 = fetVar;
                    fetVar2.r(true);
                    fetVar2.r(false);
                } else {
                    b0mVar2 = b0mVar;
                    if (!b0mVar2.equals(yzl.f43518a)) {
                        throw b1j.f(-1527174476, fetVar2, false);
                    }
                    fetVar2.e0(-95837074);
                    fetVar2.r(false);
                }
                mm40Var2 = jm40Var;
            }
            b0mVar2 = b0mVar;
            mm40Var2 = jm40Var;
        } else {
            b0mVar2 = b0mVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cxj(mm40Var2, b0mVar2, i, (byte) 24);
        }
    }

    public static final void w(ybm ybmVar, Function1 function1, fet fetVar, int i) {
        ybmVar.getClass();
        fetVar.g0(-2049514895);
        int i2 = (fetVar.g(ybmVar) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(jm40.b, 36.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarL = s5x0.L(i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), ((StaticColors) fetVar.k(m8m0.f21378a)).m126getWhite200d7_KjU(), jd8.n), 8.0f, 0.0f, 2);
            tbm tbmVarA = ybmVar.a();
            rbm rbmVar = rbm.f30195a;
            boolean z = !Intrinsics.d(tbmVarA, rbmVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            byte b = 14;
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new lrk(function1, ybmVar, (byte) 23);
                fetVar.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarL, gy40Var, null, z, null, (Function0) objP2, 24);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4(b)), gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
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
            if (ybmVar instanceof vbm) {
                fetVar.e0(-1098823700);
                I(((vbm) ybmVar).f37147a, ubm.f35388a, R.drawable.ic_glyph_cyber_gamepad, fetVar, 0);
                fetVar.r(false);
            } else if (ybmVar instanceof wbm) {
                fetVar.e0(-1098574429);
                J(((wbm) ybmVar).b, fetVar, 0);
                fetVar.r(false);
            } else {
                if (!(ybmVar instanceof xbm)) {
                    throw b1j.f(-173994952, fetVar, false);
                }
                fetVar.e0(-1098456567);
                xbm xbmVar = (xbm) ybmVar;
                I(xbmVar.c, xbmVar.d, xbmVar.e, fetVar, 0);
                J(xbmVar.b, fetVar, 0);
                fetVar.r(false);
            }
            if (Intrinsics.d(ybmVar.a(), rbmVar)) {
                fetVar.e0(-1098089899);
                fetVar.r(false);
            } else {
                fetVar.e0(-1098137949);
                c(ybmVar.a(), fetVar, 0);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p5m(ybmVar, function1, i, (byte) 10);
        }
    }

    public static final void y(mm40 mm40Var, ixm ixmVar, ixm ixmVar2, String str, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        str.getClass();
        fetVar2.g0(2119658895);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(ixmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(ixmVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.g(str) ? 2048 : 1024;
        }
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 8.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            xcz xczVarA = ddz.a(q3d.i(ixmVar.d), 0, fetVar2, 0, 2);
            xcz xczVarA2 = ddz.a(q3d.i(ixmVar2.d), 0, fetVar2, 0, 2);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar2);
                fetVar2.o0(objP);
            }
            vne vneVar = (vne) objP;
            boolean zI = fetVar2.i(vneVar) | fetVar2.g(xczVarA) | fetVar2.g(xczVarA2);
            Object objP2 = fetVar2.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new gxm(vneVar, xczVarA, xczVarA2, (byte) 0);
                fetVar2.o0(objP2);
            }
            bch0 bch0VarP = piz.P((Function1) objP2, fetVar2);
            int i3 = i2;
            L(null, ixmVar, xczVarA, bch0VarP, true, fetVar2, (i2 & 112) | 24576);
            mm40 mm40VarE = o7k0.e(o7k0.d(jm40.b, 1.0f), 4.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mbc.o(zfi0.f44303a, null, false, fetVar, 6, 6);
            fetVar2 = fetVar;
            fetVar2.r(true);
            L(null, ixmVar2, xczVarA2, bch0VarP, false, fetVar2, ((i3 >> 3) & 112) | 24576);
            if (str.length() > 0) {
                fetVar2.e0(773200362);
                sj3.p((i3 >> 6) & 112, 13, fetVar, null, str, null, null);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(773260905);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0i((byte) 17, i, (Object) mm40Var, (Object) ixmVar, (Object) ixmVar2, (Object) str);
        }
    }

    public static final void z(mm40 mm40Var, n2n n2nVar, n2n n2nVar2, y1m y1mVar, String str, String str2, String str3, boolean z, fet fetVar, int i) {
        int i2;
        String str4;
        n2n n2nVar3;
        k6z k6zVar;
        boolean z2;
        boolean z3;
        brm0.B(str, str2, str3);
        fetVar.g0(208270479);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(n2nVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(n2nVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(y1mVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(str) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.g(str2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            str4 = str3;
            i2 |= fetVar.g(str4) ? 1048576 : 524288;
        } else {
            str4 = str3;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.h(z) ? 8388608 : 4194304;
        }
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
            if (z) {
                fetVar.e0(-1715519306);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-1715518382);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(mm40VarD, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z4 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z4) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            if (str4.length() <= 0 && str.length() <= 0 && str2.length() <= 0) {
                z3 = true;
                fetVar.e0(838416861);
                fetVar.r(false);
            } else {
                fetVar.e0(837674969);
                int i3 = i2;
                mm40 mm40VarE = o7k0.e(s5x0.N(o7k0.d(jm40.b, 1.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7), 16.0f);
                thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.k, fetVar, 48);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA, shdVar);
                jpm0.o(fetVar, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar4);
                if (str3.length() > 0) {
                    fetVar.e0(1849626977);
                    z3 = true;
                    z2 = false;
                    j6n.h(str3, oro0.f25744a, null, 0, 0, fetVar, ((i3 >> 18) & 14) | 48, 28);
                    fetVar.r(false);
                } else {
                    z2 = false;
                    z3 = true;
                    fetVar.e0(1849808606);
                    fetVar.r(false);
                }
                D((i3 >> 9) & 1008, fetVar, null, str, str2);
                fetVar.r(z3);
                fetVar.r(z2);
            }
            n2nVar3 = n2nVar;
            obc.d(bmd.n.a(k6zVar), u1c.M(2030970181, new p2n(n2nVar3, y1mVar, z, n2nVar2), fetVar), fetVar, 56);
            fetVar.r(z3);
        } else {
            n2nVar3 = n2nVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gw6(mm40Var, (Object) n2nVar3, (Object) n2nVar2, (a2m) y1mVar, str, str2, (Object) str3, z, i, (byte) 9);
        }
    }

    public abstract int X(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int Y();

    public abstract ViewPropertyAnimator Z(View view, int i);

    public abstract View b0(int i);

    public abstract boolean c0();
}
