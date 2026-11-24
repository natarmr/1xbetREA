package a;

import android.app.Activity;
import android.content.Context;
import android.gov.nist.javax.sip.parser.TokenTypes;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import com.google.android.gms.common.Feature;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.game_broadcasting.api.presentation.models.GameBroadcastingParams;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;
import org.xplatform.uikit.compose.components.calendar.model.SimpleDateTime;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;
import org.xplatform.uikit.compose.components.picker.model.TimeOfDay23;

/* JADX INFO: loaded from: classes6.dex */
public abstract class rsr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f31046a = new ugd(-1922780536, false, new i5b(3));
    public static final ugd b = new ugd(-465660176, false, new zgd(21));
    public static final ugd c = new ugd(-1436912068, false, new ehd(18));
    public static final ugd d = new ugd(2113656280, false, new mhd(5));
    public static final ugd e = new ugd(-1327608545, false, new lhd(29));
    public static final TimeOfDay23 f = new TimeOfDay23(0, 0);
    public static final TimeOfDay23 g = new TimeOfDay23(23, 59);
    public static final Feature h;
    public static final Feature[] i;

    static {
        Feature feature = new Feature(-1, 1L, "register", true);
        h = feature;
        i = new Feature[]{feature, new Feature(-1, 1L, "unregister", true)};
    }

    public static final void A(mm40 mm40Var, a8q0 a8q0Var, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Function1 function1, Function1 function2, fet fetVar, int i2) {
        String str3;
        boolean z5;
        boolean z6;
        Function1 function3;
        mm40 mm40Var2;
        long jB;
        fetVar.g0(-1089815328);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(a8q0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            str3 = str2;
            i3 |= fetVar.g(str3) ? 2048 : 1024;
        } else {
            str3 = str2;
        }
        if ((i2 & 24576) == 0) {
            z5 = z;
            i3 |= fetVar.h(z5) ? 16384 : 8192;
        } else {
            z5 = z;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.h(z2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.h(z3) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            z6 = z4;
            i3 |= fetVar.h(z6) ? 8388608 : 4194304;
        } else {
            z6 = z4;
        }
        if ((100663296 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            function3 = function2;
            i3 |= fetVar.i(function3) ? 536870912 : 268435456;
        } else {
            function3 = function2;
        }
        if (fetVar.U(i3 & 1, (306783379 & i3) != 306783378)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int i4 = i3;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
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
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = androidx.compose.runtime.e.a(16.0f);
                fetVar.o0(objP);
            }
            agk0 agk0Var = (agk0) objP;
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = androidx.compose.runtime.e.b(0);
                fetVar.o0(objP2);
            }
            cgk0 cgk0Var = (cgk0) objP2;
            Object[] objArr = new Object[0];
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = new lg6((byte) 19);
                fetVar.o0(objP3);
            }
            pz40 pz40Var = (pz40) e9x.Q(objArr, (Function0) objP3, fetVar, 48);
            if (z2) {
                fetVar.e0(384422311);
                jB = afn0.m(fetVar).getSecondary60();
                fetVar.r(false);
            } else {
                fetVar.e0(384481242);
                afn0.v(fetVar).getClass();
                jB = g1t0.j().b();
                fetVar.r(false);
            }
            afn0.v(fetVar).getClass();
            smk0 smk0VarA = smk0.a(g1t0.m().f42262a, afn0.m(fetVar).getCommerce(), null, 65534);
            Boolean bool = (Boolean) pz40Var.getValue();
            bool.booleanValue();
            boolean zG = fetVar.g(pz40Var) | ((i4 & 234881024) == 67108864);
            Object objP4 = fetVar.P();
            if (zG || objP4 == obj) {
                objP4 = new ua4(function1, pz40Var, null, (byte) 4);
                fetVar.o0(objP4);
            }
            m0x0.t(fetVar, bool, (Function2) objP4);
            Function1 function4 = function3;
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1523962970, new iw6(z6, smk0VarA, str3, jB, a8q0Var, pz40Var, z3, function4, function1, z5, agk0Var, cgk0Var, str, (byte) 0), fetVar), fetVar, 56);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jw6(mm40Var2, a8q0Var, str, str2, z, z2, z3, z4, function1, function2, i2, (byte) 0);
        }
    }

    public static final void B(mm40 mm40Var, e2d e2dVar, qdz qdzVar, a4x a4xVar, boolean z, boolean z2, boolean z3, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        mm40 mm40VarV;
        fetVar.g0(-1605881723);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(e2dVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(qdzVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(a4xVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.h(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.h(z2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.h(z3) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 8388608 : 4194304;
        }
        if (fetVar.U(i3 & 1, (4793491 & i3) != 4793490)) {
            boolean z4 = (57344 & i3) == 16384;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z4 || objP == cl5Var) {
                objP = z ? "KEY_LAZY_LIST_SEARCH_SHIMMERS" : "KEY_LAZY_LIST_SEARCH";
                fetVar.o0(objP);
            }
            xcz xczVarB = qdzVar.b((String) objP, new ma2((byte) 4), fetVar, i3 & 896);
            jm40 jm40Var = jm40.b;
            if (e2dVar != null) {
                fetVar.e0(818912751);
                Object objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = new j6g0((byte) 17);
                    fetVar.o0(objP2);
                }
                mm40VarV = cjx.V(jm40Var, e2d.b(e2dVar, (Function0) objP2), null);
                fetVar.r(false);
            } else {
                fetVar.e0(819025157);
                fetVar.r(false);
                mm40VarV = jm40Var;
            }
            int i4 = 29360128 & i3;
            boolean z5 = i4 == 8388608;
            Object objP3 = fetVar.P();
            if (z5 || objP3 == cl5Var) {
                objP3 = new ja2(function1, (byte) 11);
                fetVar.o0(objP3);
            }
            mm40 mm40VarA = pzw.A(0, fetVar, mm40VarV, (Function0) objP3);
            pz40 pz40VarF = androidx.compose.runtime.e.f(a4xVar, fetVar);
            wom womVarF = mom.f(fetVar);
            n0q n0qVar = o7k0.c;
            boolean z6 = i4 == 8388608;
            Object objP4 = fetVar.P();
            if (z6 || objP4 == cl5Var) {
                objP4 = new ja2(function1, (byte) 7);
                fetVar.o0(objP4);
            }
            mom.c(n0qVar, z2, womVarF, null, false, null, (Function0) objP4, null, u1c.M(-534925414, new na2(z, mm40VarA, xczVarB, pz40VarF, z3, function1, (byte) 1), fetVar), fetVar, ((i3 >> 12) & 112) | 100663296, 184);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u72(mm40Var2, e2dVar, qdzVar, a4xVar, z, z2, z3, function1, i2);
        }
    }

    public static final void C(int i2, fet fetVar, mm40 mm40Var) {
        fet fetVar2;
        fetVar.g0(-982369801);
        int i3 = i2 | 6;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(qmk.a(fetVar).c, 0.0f, qmk.a(fetVar).c, 24.0f, 2);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new cr60((byte) 16);
                fetVar.o0(objP);
            }
            fetVar2 = fetVar;
            uzb.z(n0qVar, lh80VarU, null, false, (Function2) objP, fetVar2, 24576, 12);
            mm40Var = jm40.b;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mp50(mm40Var, i2, (byte) 7);
        }
    }

    public static final void D(mm40 mm40Var, mx6 mx6Var, fx6 fx6Var, String str, boolean z, Function1 function1, Function1 function2, fet fetVar, int i2) {
        int i3;
        fet fetVar2;
        fetVar.g0(79786328);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(mx6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.e(fx6Var.ordinal()) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(str) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.h(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.i(function2) ? 1048576 : 524288;
        }
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 22.0f);
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            a8q0 a8q0Var = mx6Var.f22537a;
            String str2 = mx6Var.b;
            boolean z2 = fx6Var != fx6.c;
            boolean z3 = mx6Var.c;
            boolean z4 = mx6Var.e;
            boolean z5 = (i3 & 458752) == 131072;
            Object objP = fetVar.P();
            if (z5 || objP == ukd.f35823a) {
                objP = new uo6(function1, (byte) 4);
                fetVar.o0(objP);
            }
            A(null, a8q0Var, str2, str, z2, z, z3, z4, (Function1) objP, function2, fetVar, (i3 & 7168) | ((i3 << 3) & 458752) | ((i3 << 9) & 1879048192));
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o84(mm40Var, (Object) mx6Var, (Enum) fx6Var, str, z, function1, function2, i2, (byte) 2);
        }
    }

    public static final void E(mm40 mm40Var, mx6 mx6Var, oln0 oln0Var, fx6 fx6Var, String str, boolean z, Function1 function1, Function1 function2, fet fetVar, int i2) {
        int i3;
        fx6 fx6Var2;
        mx6 mx6Var2 = mx6Var;
        fetVar.g0(-259845377);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(mx6Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(oln0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.e(fx6Var.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.g(str) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.h(z) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= fetVar.i(function2) ? 8388608 : 4194304;
        }
        if (fetVar.U(i3 & 1, (4793491 & i3) != 4793490)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            int i4 = i3 >> 3;
            D(o7k0.d(jm40.b, 1.0f), mx6Var2, fx6Var, str, z, function1, function2, fetVar, (3670016 & i4) | (i4 & 896) | (i3 & 112) | 6 | (i4 & 7168) | (57344 & i4) | (458752 & i4));
            mx6Var2 = mx6Var2;
            if (mx6Var2.d || mx6Var2.f22537a.f440a.b.length() > 0 || z) {
                fetVar.e0(-1361171114);
                fx6Var2 = fx6Var;
                Q(null, oln0Var, fx6Var2, fetVar, i4 & 1008);
                fetVar.r(false);
            } else {
                fetVar.e0(-1361026003);
                fetVar.r(false);
                fx6Var2 = fx6Var;
            }
            fetVar.r(true);
        } else {
            fx6Var2 = fx6Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gw6(mm40Var, (Object) mx6Var2, (Object) oln0Var, (Enum) fx6Var2, str, z, function1, function2, i2, (byte) 0);
        }
    }

    public static final void F(SimpleDateTime simpleDateTime, SimpleDateTime simpleDateTime2, SimpleDateTime simpleDateTime3, SimpleDateTime simpleDateTime4, Locale locale, ulq0 ulq0Var, Calendar calendar, yg40 yg40Var, Function1 function1, Function1 function2, fet fetVar, int i2) {
        int i3;
        Object obj;
        fetVar.g0(-809299930);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? fetVar.g(simpleDateTime) : fetVar.i(simpleDateTime) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar.g(simpleDateTime2) : fetVar.i(simpleDateTime2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? fetVar.g(simpleDateTime3) : fetVar.i(simpleDateTime3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= (i2 & 4096) == 0 ? fetVar.g(simpleDateTime4) : fetVar.i(simpleDateTime4) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            obj = locale;
            i3 |= fetVar.g(obj) ? 16384 : 8192;
        } else {
            obj = locale;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.e(ulq0Var.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.i(calendar) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= fetVar.e(yg40Var.ordinal()) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i3 |= fetVar.i(function2) ? 536870912 : 268435456;
        }
        if (fetVar.U(i3 & 1, (i3 & 306783379) != 306783378)) {
            pz40 pz40VarF = androidx.compose.runtime.e.f(function1, fetVar);
            pz40 pz40VarF2 = androidx.compose.runtime.e.f(function2, fetVar);
            int i4 = i3;
            Object[] objArr = {simpleDateTime, simpleDateTime2, simpleDateTime3, simpleDateTime4, obj, ulq0Var, yg40Var};
            boolean zI = ((i4 & 896) == 256 || ((i4 & 512) != 0 && fetVar.i(simpleDateTime3))) | fetVar.i(calendar) | ((i4 & 7168) == 2048 || ((i4 & 4096) != 0 && fetVar.i(simpleDateTime4))) | ((i4 & 14) == 4 || ((i4 & 8) != 0 && fetVar.i(simpleDateTime))) | ((i4 & 112) == 32 || ((i4 & 64) != 0 && fetVar.i(simpleDateTime2))) | ((29360128 & i4) == 8388608) | ((458752 & i4) == 131072) | fetVar.g(pz40VarF) | fetVar.g(pz40VarF2);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                Object vejVar = new vej(simpleDateTime3, calendar, simpleDateTime4, simpleDateTime, simpleDateTime2, yg40Var, ulq0Var, pz40VarF, pz40VarF2, null);
                fetVar.o0(vejVar);
                objP = vejVar;
            }
            m0x0.w(objArr, (Function2) objP, fetVar);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ej4(simpleDateTime, simpleDateTime2, simpleDateTime3, simpleDateTime4, locale, ulq0Var, calendar, yg40Var, function1, function2, i2, (byte) 2);
        }
    }

    public static final void G(d9z d9zVar, l7m0 l7m0Var, Function1 function1, Function1 function2, fet fetVar, int i2) {
        boolean z;
        fet fetVar2 = fetVar;
        d9zVar.getClass();
        l7m0Var.getClass();
        function1.getClass();
        function2.getClass();
        fetVar2.g0(899895043);
        int i3 = i2 | (fetVar2.g(d9zVar) ? 4 : 2) | (fetVar2.g(l7m0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        byte b2 = 1;
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            k570 k570Var = (k570) l7m0Var.getValue();
            boolean zG = fetVar2.g(k570Var);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = k570Var.a();
                fetVar2.o0(objP);
            }
            dd50 dd50Var = (dd50) objP;
            boolean zG2 = fetVar2.g(k570Var);
            Object objP2 = fetVar2.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = k570Var.b();
                fetVar2.o0(objP2);
            }
            jn5 jn5Var = (jn5) objP2;
            boolean zG3 = fetVar2.g(k570Var);
            Object objP3 = fetVar2.P();
            if (zG3 || objP3 == cl5Var) {
                objP3 = k570Var.d();
                fetVar2.o0(objP3);
            }
            h3b h3bVar = (h3b) objP3;
            clo cloVarB = lyq0.b(ob3.d(0, 7, fetVar2), fetVar2, 24576);
            Object value = l7m0Var.getValue();
            boolean zG4 = ((i3 & 112) == 32) | fetVar2.g(cloVarB);
            Object objP4 = fetVar2.P();
            yje yjeVar = null;
            if (zG4 || objP4 == cl5Var) {
                objP4 = new kx60(l7m0Var, cloVarB, yjeVar, b2);
                fetVar2.o0(objP4);
            }
            m0x0.t(fetVar2, value, (Function2) objP4);
            int i4 = i3 & 896;
            boolean zI = fetVar2.i(k570Var) | (i4 == 256);
            Object objP5 = fetVar2.P();
            byte b3 = 24;
            if (zI || objP5 == cl5Var) {
                objP5 = new a540(k570Var, function1, b3);
                fetVar2.o0(objP5);
            }
            knx.i(false, (Function0) objP5, fetVar2, 0, 1);
            mm40 mm40VarE0 = o2e.e0(cjx.V(i120.Q(o7k0.c, ((ThemeColors) fetVar2.k(zaq0.b)).getBackground(), jd8.n), cloVarB.e, null), "ONE_XGAMES_SCREEN_TAG");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
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
            piz.m(null, cloVarB, u1c.M(-96151889, new s270(dd50Var, function1), fetVar2), u1c.M(1456935472, new dr50((Object) jn5Var, (Object) k570Var, (Object) function1, (byte) 16), fetVar2), fetVar2, 3456);
            if (h3bVar.f12376a) {
                fetVar2.e0(981291416);
                n(h3bVar, k570Var instanceof j570, function1, fetVar2, i4);
                z = false;
                fetVar2.r(false);
            } else {
                z = false;
                fetVar2.e0(981503797);
                fetVar2.r(false);
            }
            if (k570Var != null) {
                if (k570Var instanceof j570) {
                    fetVar2.e0(308758463);
                    C(z ? 1 : 0, fetVar2, null);
                    fetVar2.r(z);
                } else if (k570Var instanceof i570) {
                    fetVar2.e0(981670732);
                    i570 i570Var = (i570) k570Var;
                    mdm mdmVar = i570Var.f14180a;
                    if (mdmVar == null) {
                        fetVar2.e0(981670731);
                        fetVar2.r(z);
                    } else {
                        fetVar2.e0(981670732);
                        boolean z2 = i570Var.b;
                        mm40 mm40VarN = jm40.b;
                        if (z2) {
                            zcl zclVar = qmk.f28987a;
                            mm40VarN = s5x0.N(mm40VarN, 0.0f, 0.0f, 0.0f, 100.0f, 7);
                        }
                        mm40 mm40Var = mm40VarN;
                        boolean z3 = i4 == 256;
                        Object objP6 = fetVar2.P();
                        if (z3 || objP6 == cl5Var) {
                            objP6 = new ju60(function1, (byte) 24);
                            fetVar2.o0(objP6);
                        }
                        z = false;
                        o(mm40Var, mdmVar, (Function0) objP6, fetVar2, 0);
                        fetVar2.r(false);
                    }
                    fetVar2.r(z);
                } else if (k570Var instanceof h570) {
                    fetVar2.e0(982134151);
                    boolean zG5 = fetVar2.g((h570) k570Var);
                    Object objP7 = fetVar2.P();
                    if (zG5 || objP7 == cl5Var) {
                        objP7 = jgk0.b(new pu50(k570Var, (byte) 20));
                        fetVar2.o0(objP7);
                    }
                    w(d9zVar, (vdt) ((l7m0) objP7).getValue(), jn5Var, function1, fetVar2, ((i3 << 3) & 7168) | (i3 & 14) | 64);
                    fetVar2 = fetVar2;
                    fetVar2.r(false);
                } else {
                    z = false;
                }
                fetVar2.r(true);
            }
            throw b1j.f(308757356, fetVar2, z);
        }
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pd50((byte) 11, i2, (Object) d9zVar, (Object) l7m0Var, (Object) function1, (Object) function2);
        }
    }

    public static final void H(int i2, fet fetVar, mm40 mm40Var, String str, String str2) {
        mm40 mm40Var2;
        fetVar.g0(-174505748);
        int i3 = i2 | 6 | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(mm40VarD, 0.0f, 30.0f, 1);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarG);
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
            nw3 nw3Var = uc9.e;
            jwb.p(null, nw3Var, nw3Var, null, 2, 0, u1c.M(400469729, new ew6(str, str2, (byte) 3), fetVar), fetVar, 1597872, 41);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g15(mm40Var2, str, str2, i2, (byte) 5);
        }
    }

    public static final void I(int i2, fet fetVar, mm40 mm40Var, boolean z) {
        yfe0 yfe0VarU;
        s84 s84Var;
        mm40Var.getClass();
        fetVar.g0(1281848771);
        int i3 = (fetVar.h(z) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            if (z) {
                mm40 mm40VarQ = i120.Q(mm40Var.e(o7k0.c), ((StaticColors) fetVar.k(m8m0.f21378a)).m73getBlack400d7_KjU(), jd8.n);
                Object objP = fetVar.P();
                if (objP == ukd.f35823a) {
                    objP = new npa0((byte) 24);
                    fetVar.o0(objP);
                }
                mm40 mm40VarY = y860.Y(mm40VarQ, false, null, null, (Function0) objP, 14);
                tj30 tj30VarC = zq8.c(gqw0.e, false);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarY);
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
                z(0, fetVar);
                fetVar.r(true);
            } else {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    s84Var = new s84(z, mm40Var, i2, (byte) 5);
                }
            }
            yfe0VarU.d = s84Var;
        }
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            s84Var = new s84(z, mm40Var, i2, (byte) 7);
            yfe0VarU.d = s84Var;
        }
    }

    public static final void J(jn5 jn5Var, ijl ijlVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(1453187434);
        int i3 = i2 | (fetVar.g(jn5Var) ? 4 : 2) | (fetVar.e(ijlVar.ordinal()) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            Context context = (Context) fetVar.k(dy2.b);
            if (jn5Var.b) {
                fetVar.e0(-1363265442);
                d(function1, fetVar, (i3 >> 6) & 14);
                fetVar.r(false);
            } else {
                fetVar.e0(-1363184346);
                boolean z = true;
                jjl jjlVar = new jjl(jn5Var.c, jn5Var.d, jiq0.q0(R.string.top_up, context), jn5Var.e);
                int i4 = i3 & 896;
                boolean z2 = i4 == 256;
                Object objP = fetVar.P();
                cl5 cl5Var = ukd.f35823a;
                if (z2 || objP == cl5Var) {
                    objP = new ju60(function1, (byte) 18);
                    fetVar.o0(objP);
                }
                Function0 function0 = (Function0) objP;
                boolean z3 = i4 == 256;
                Object objP2 = fetVar.P();
                if (z3 || objP2 == cl5Var) {
                    objP2 = new ju60(function1, (byte) 19);
                    fetVar.o0(objP2);
                }
                Function0 function2 = (Function0) objP2;
                if (i4 != 256) {
                    z = false;
                }
                Object objP3 = fetVar.P();
                if (z || objP3 == cl5Var) {
                    objP3 = new ju60(function1, (byte) 20);
                    fetVar.o0(objP3);
                }
                feb.k(ijlVar, jjlVar, null, function0, function2, (Function0) objP3, fetVar, (i3 >> 3) & 14, 4);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dr50(jn5Var, ijlVar, function1, i2, (byte) 15);
        }
    }

    public static final void K(mm40 mm40Var, fe2 fe2Var, qdz qdzVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(1874414487);
        if ((i2 & 6) == 0) {
            i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(fe2Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.g(qdzVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar2.i(function1) ? 2048 : 1024;
        }
        byte b2 = 1;
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            e2d e2dVarD = nip.d(null, null, fetVar2, 7);
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarX = yyw.X(jm40Var, null, fetVar2, 1);
            qim qimVar = fe2Var.b;
            boolean z3 = (i3 & 7168) == 2048;
            Object objP = fetVar2.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new wc2(function1, b2);
                fetVar2.o0(objP);
            }
            ckb.k(mm40VarX, qimVar, true, e2dVarD, null, (Function1) objP, fetVar, 24960, 0);
            fetVar2 = fetVar;
            mm40 mm40VarQ = i120.Q(jm40Var, ((ThemeColors) fetVar2.k(zaq0.b)).getBackground(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
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
            z2g0 z2g0Var = fe2Var.c;
            if (z2g0Var instanceof v2g0) {
                fetVar2.e0(-1530422757);
                s(null, ((v2g0) z2g0Var).f36680a, function1, fetVar2, (i3 >> 3) & 896);
                fetVar2.r(false);
            } else {
                if (z2g0Var instanceof w2g0) {
                    fetVar2.e0(-1530196581);
                    t(null, ((w2g0) z2g0Var).f38446a, function1, fetVar2, (i3 >> 3) & 896);
                    fetVar2.r(false);
                } else if (z2g0Var instanceof x2g0) {
                    fetVar2.e0(-1529960919);
                    z = true;
                    B(null, e2dVarD, qdzVar, ((x2g0) z2g0Var).f40166a, false, fe2Var.f9383a, fe2Var.d, function1, fetVar2, ((i3 << 12) & 29360128) | (i3 & 896) | 24576);
                    fetVar2.r(false);
                } else {
                    z = true;
                    if (!(z2g0Var instanceof y2g0)) {
                        throw b1j.f(-1019201653, fetVar2, false);
                    }
                    fetVar2.e0(-1529460982);
                    B(null, e2dVarD, qdzVar, ((y2g0) z2g0Var).f41903a, true, fe2Var.f9383a, fe2Var.d, function1, fetVar2, (i3 & 896) | 24576 | ((i3 << 12) & 29360128));
                    fetVar2.r(false);
                }
                fetVar2.r(z);
                fetVar2.r(z);
            }
            z = true;
            fetVar2.r(z);
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dg0((byte) 1, i2, (Object) mm40Var, (Object) fe2Var, (Object) qdzVar, (Object) function1);
        }
    }

    public static final void L(dd50 dd50Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(462111248);
        int i3 = i2 | (fetVar.g(dd50Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarY = o7k0.y(jm40.b, null, 3);
            imm immVar = dd50Var.b;
            boolean z = (i3 & 14) == 4;
            int i4 = i3 & 112;
            boolean z2 = z | (i4 == 32);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new a540((Object) dd50Var, (Object) function1, (byte) 25);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z3 = i4 == 32;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new i160(function1, (byte) 12);
                fetVar.o0(objP2);
            }
            Function1 function2 = (Function1) objP2;
            boolean z4 = i4 == 32;
            Object objP3 = fetVar.P();
            if (z4 || objP3 == cl5Var) {
                objP3 = new i160(function1, (byte) 13);
                fetVar.o0(objP3);
            }
            hlm.c(mm40VarY, immVar, null, function0, null, function2, (Function1) objP3, null, null, null, null, null, fetVar, 6, 0, 3988);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s270(dd50Var, function1, i2);
        }
    }

    public static final void M(mm40 mm40Var, String str, Function0 function0, fet fetVar, int i2) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-591479539);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar2.i(function0) ? 256 : 128;
        }
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = y860.W(o7k0.e(jm40Var, 48.0f), null, null, false, null, function0, 28);
            tj30 tj30VarC = zq8.c(gqw0.f, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
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
            v8q0.a(str, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.l(new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar2), fetVar2, (i3 >> 3) & 14, 24960, 110590);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fg5(mm40Var2, str, function0, i2, (byte) 1);
        }
    }

    public static final void N(int i2, fet fetVar) {
        fetVar.g0(-770531345);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            mm40 mm40VarL = s5x0.L(o7k0.c, xfn.a(fetVar).d, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarP = o7k0.p(s5x0.M(jm40Var, 16.0f, 28.0f, 16.0f, 12.0f), 96.0f, 12.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarP), vbc.d0(null, fetVar, 0, 1)));
            mm40 mm40VarE = o7k0.e(o7k0.d(jm40Var, 1.0f), 192.0f);
            zcl zclVar3 = qmk.i;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.p(s5x0.M(jm40Var, 16.0f, 28.0f, 16.0f, 12.0f), 96.0f, 12.0f)), vbc.d0(null, fetVar, 0, 1)));
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, o7k0.e(o7k0.d(jm40Var, 1.0f), 128.0f)), vbc.d0(null, fetVar, 0, 1)));
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.p(s5x0.M(jm40Var, 16.0f, 28.0f, 16.0f, 12.0f), 96.0f, 12.0f)), vbc.d0(null, fetVar, 0, 1)));
            dw9.x(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, o7k0.e(o7k0.d(jm40Var, 1.0f), 128.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kyz(i2, (byte) 15);
        }
    }

    public static final void O(GameBroadcastingParams gameBroadcastingParams, fet fetVar, int i2) {
        int i3;
        fet fetVar2;
        fetVar.g0(-995083453);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? fetVar.g(gameBroadcastingParams) : fetVar.i(gameBroadcastingParams) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        boolean z = false;
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            if ((i3 & 14) == 4 || ((i3 & 8) != 0 && fetVar.g(gameBroadcastingParams))) {
                z = true;
            }
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = i120.V(new Pair("ZONE_PARAMS", gameBroadcastingParams));
                fetVar.o0(objP);
            }
            Bundle bundle = (Bundle) objP;
            n0q n0qVar = o7k0.c;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new vls((byte) 7);
                fetVar.o0(objP2);
            }
            fetVar2 = fetVar;
            nz2.a(p0t.class, n0qVar, g5r.a(fetVar), bundle, (lkz) ydx.F(vtb.N(((clz) fetVar.k(or00.f25714a)).x().j), fetVar).getValue(), (Function1) objP2, fetVar2, 196656);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o6o(gameBroadcastingParams, i2, (byte) 12);
        }
    }

    public static final void P(l7m0 l7m0Var, Function1 function1, Function1 function2, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        function1.getClass();
        function2.getClass();
        fetVar2.g0(1001845097);
        byte b2 = 4;
        int i3 = i2 | (fetVar2.g(l7m0Var) ? 4 : 2) | (fetVar2.i(function1) ? 32 : 16) | (fetVar2.i(function2) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new opm0(function1, (byte) 9);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i4 == 32;
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new opm0(function1, (byte) 10);
                fetVar2.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar2, 0, 4);
            fetVar2 = fetVar2;
            boolean z3 = l7m0Var.getValue() instanceof kdn0;
            Boolean boolValueOf = Boolean.valueOf(z3);
            boolean zH = (i4 == 32) | fetVar2.h(z3);
            Object objP3 = fetVar2.P();
            if (zH || objP3 == cl5Var) {
                objP3 = new a2f(function1, z3, null, b2);
                fetVar2.o0(objP3);
            }
            m0x0.t(fetVar2, boolValueOf, (Function2) objP3);
            Object[] objArr = new Object[0];
            boolean z4 = (i3 & 14) == 4;
            Object objP4 = fetVar2.P();
            if (z4 || objP4 == cl5Var) {
                objP4 = new f7f0(l7m0Var, (byte) 29);
                fetVar2.o0(objP4);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP4, fetVar2);
            mdn0 mdn0Var = (mdn0) l7m0Var.getValue();
            if (mdn0Var != null) {
                if (mdn0Var instanceof kdn0) {
                    fetVar2.e0(240464347);
                    kdn0 kdn0Var = (kdn0) mdn0Var;
                    x(l7m0VarY, kdn0Var.f18115a, false, kdn0Var.b, function2, function1, fetVar2, ((i3 << 6) & 57344) | 384 | ((i3 << 12) & 458752));
                    fetVar2.r(false);
                } else if (mdn0Var instanceof ldn0) {
                    fetVar2.e0(240869052);
                    ldn0 ldn0Var = (ldn0) mdn0Var;
                    x(l7m0VarY, ldn0Var.b, true, ldn0Var.c, function2, function1, fetVar2, ((i3 << 6) & 57344) | 384 | ((i3 << 12) & 458752));
                    fetVar2.r(false);
                } else if (mdn0Var instanceof idn0) {
                    fetVar2.e0(241253049);
                    mm40 mm40VarR = knm0.r(o7k0.c);
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM = fetVar2.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarR);
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
                    mdm mdmVar = ((idn0) mdn0Var).f14595a;
                    boolean z5 = i4 == 32;
                    Object objP5 = fetVar2.P();
                    if (z5 || objP5 == cl5Var) {
                        objP5 = new opm0(function1, (byte) 11);
                        fetVar2.o0(objP5);
                    }
                    jcb.l(null, mdmVar, false, (Function0) objP5, fetVar, 0, 5);
                    fetVar2 = fetVar;
                    fetVar2.r(true);
                    fetVar2.r(false);
                } else if (mdn0Var instanceof jdn0) {
                    fetVar2.e0(241778189);
                    i4 i4Var = ((jdn0) mdn0Var).f16337a;
                    Object objP6 = fetVar2.P();
                    if (objP6 == cl5Var) {
                        objP6 = new f8l0((byte) 27);
                        fetVar2.o0(objP6);
                    }
                    bsr0.L(null, i4Var, false, false, (Function1) objP6, fetVar, 28032);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                }
            }
            throw b1j.f(700491106, fetVar2, false);
        }
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgm0(l7m0Var, function1, function2, i2, (byte) 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public static final void Q(mm40 mm40Var, oln0 oln0Var, fx6 fx6Var, fet fetVar, int i2) {
        mm40 mm40Var2;
        fet fetVar2;
        long secondary60;
        jm40 jm40Var;
        ?? r0;
        fet fetVar3;
        jm40 jm40Var2;
        fet fetVar4 = fetVar;
        fetVar4.g0(-1797125925);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar4.g(oln0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar4.e(fx6Var.ordinal()) ? 256 : 128;
        }
        if (fetVar4.U(i3 & 1, (i3 & 147) != 146)) {
            jm40 jm40Var3 = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var3, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 12.0f);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar4, 54);
            int iHashCode = Long.hashCode(fetVar4.T);
            bh90 bh90VarM = fetVar4.m();
            mm40 mm40VarC0 = kbc.c0(fetVar4, mm40VarE);
            mkd.c0.getClass();
            fetVar4.i0();
            if (fetVar4.S) {
                fetVar4.l(e7z.u1);
            } else {
                fetVar4.r0();
            }
            jpm0.o(fetVar4, thg0VarA, gqw0.x);
            jpm0.o(fetVar4, bh90VarM, gqw0.w);
            jpm0.o(fetVar4, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar4);
            jpm0.o(fetVar4, mm40VarC0, gqw0.v);
            fx6 fx6Var2 = fx6.f10293a;
            if (fx6Var == fx6Var2 || fx6Var == fx6.b || oln0Var.b) {
                fetVar4.e0(1865741628);
                String str = oln0Var.f25464a;
                androidx.compose.runtime.d dVar = j1t0.e;
                ((g1t0) fetVar4.k(dVar)).getClass();
                y9q0 y9q0VarE = g1t0.e();
                ((g1t0) fetVar4.k(dVar)).getClass();
                nrq nrqVar = g1t0.e().f42262a.f;
                if (fx6Var == fx6.b) {
                    fetVar4.e0(1866015234);
                    secondary60 = ((ThemeColors) fetVar4.k(zaq0.b)).getWarning();
                    fetVar4.r(false);
                } else {
                    fetVar4.e0(1866093726);
                    secondary60 = ((ThemeColors) fetVar4.k(zaq0.b)).getSecondary60();
                    fetVar4.r(false);
                }
                long j = qmk.o;
                ((g1t0) fetVar4.k(dVar)).getClass();
                jm40Var = jm40Var3;
                r0 = 0;
                kc5.N(str, null, secondary60, null, null, 0L, j, g1t0.e().f42262a.b, null, nrqVar, 0L, null, 2, false, 1, 0, false, null, y9q0VarE, 0.0f, fetVar, 0, 1597440, 0, 3062586);
                fet fetVar5 = fetVar;
                fetVar5.r(false);
                fetVar3 = fetVar5;
            } else {
                if (fx6Var == fx6.c) {
                    fetVar4.e0(1866481722);
                    mm40 mm40VarE2 = o7k0.e(o7k0.s(jm40Var3, 128.0f), 12.0f);
                    zcl zclVar2 = qmk.m;
                    ugg0 ugg0Var = vgg0.f37379a;
                    h97.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE2), vbc.d0(null, fetVar4, 0, 1), fetVar4, false);
                } else {
                    fetVar4.e0(1866815499);
                    fetVar4.r(false);
                }
                jm40Var = jm40Var3;
                r0 = 0;
                fetVar3 = fetVar4;
            }
            if (oln0Var.c && fx6Var == fx6Var2) {
                fetVar3.e0(1866906174);
                jm40Var2 = jm40Var;
                dww.c(a8k0.F(R.drawable.ic_glyph_vip, r0, fetVar3), null, o7k0.n(jm40Var2, 16.0f), ((ThemeColors) fetVar3.k(zaq0.b)).getPrimary(), fetVar3, 56, 0);
                fetVar3.r(r0);
            } else {
                jm40Var2 = jm40Var;
                fetVar3.e0(1867164683);
                fetVar3.r(r0);
            }
            fetVar3.r(true);
            mm40Var2 = jm40Var2;
            fetVar2 = fetVar3;
        } else {
            fetVar4.X();
            mm40Var2 = mm40Var;
            fetVar2 = fetVar4;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sa5((Object) mm40Var2, (Object) oln0Var, (Object) fx6Var, i2, (byte) 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01b7  */
    public static final void R(mm40 mm40Var, am amVar, boolean z, Locale locale, SimpleDateTime simpleDateTime, SimpleDateTime simpleDateTime2, SimpleDateTime simpleDateTime3, SimpleDateTime simpleDateTime4, Calendar calendar, yg40 yg40Var, Function2 function2, Function2 function3, fet fetVar, int i2) {
        mm40 mm40Var2;
        int i3;
        SimpleDate simpleDate;
        SimpleDateTime simpleDateTimeH0;
        SimpleDateTime simpleDateTimeH1;
        fetVar.g0(-771696776);
        int i4 = i2 | 6 | (fetVar.e(amVar.ordinal()) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.g(locale) ? 2048 : 1024) | (fetVar.i(simpleDateTime) ? 16384 : 8192) | (fetVar.i(simpleDateTime2) ? 131072 : 65536) | (fetVar.i(simpleDateTime3) ? 1048576 : 524288) | (fetVar.i(simpleDateTime4) ? 8388608 : 4194304) | (fetVar.i(calendar) ? 67108864 : 33554432) | (fetVar.e(yg40Var.ordinal()) ? 536870912 : 268435456);
        if (fetVar.U(i4 & 1, ((i4 & 306783379) == 306783378 && (((fetVar.i(function2) ? (char) 4 : (char) 2) | (fetVar.i(function3) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
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
            fetVar.b0(32693316, amVar);
            int i5 = i4 & 112;
            int i6 = i4 & 1879048192;
            boolean zG = ((i4 & 57344) == 16384 || fetVar.g(simpleDateTime)) | (i5 == 32) | ((i4 & 458752) == 131072 || fetVar.g(simpleDateTime2)) | ((i4 & 3670016) == 1048576 || fetVar.g(simpleDateTime3)) | ((i4 & 29360128) == 8388608 || fetVar.g(simpleDateTime4)) | fetVar.g(calendar) | (i6 == 536870912);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                int iOrdinal = amVar.ordinal();
                if (iOrdinal != 0) {
                    i3 = 1;
                    if (iOrdinal != 1) {
                        t9f.b();
                        return;
                    }
                    simpleDate = simpleDateTime2.f47285a;
                } else {
                    i3 = 1;
                    simpleDate = simpleDateTime.f47285a;
                }
                int iOrdinal2 = amVar.ordinal();
                if (iOrdinal2 == 0) {
                    simpleDateTimeH0 = simpleDateTime3;
                } else if (iOrdinal2 != i3) {
                    t9f.b();
                    return;
                } else {
                    simpleDateTimeH0 = h0(simpleDateTime, calendar, yg40Var, i3);
                    if (wdx.e0(simpleDateTime3, calendar) >= wdx.e0(simpleDateTimeH0, calendar)) {
                        simpleDateTimeH0 = simpleDateTime3;
                    }
                }
                int iOrdinal3 = amVar.ordinal();
                if (iOrdinal3 == 0) {
                    simpleDateTimeH1 = h0(simpleDateTime4, calendar, yg40Var, -1);
                } else {
                    if (iOrdinal3 != 1) {
                        t9f.b();
                        return;
                    }
                    simpleDateTimeH1 = simpleDateTime4;
                }
                objP = new Pair(Intrinsics.d(simpleDateTimeH0.f47285a, simpleDate) ? i0(simpleDateTimeH0, calendar, yg40Var, xg40.b).b : null, Intrinsics.d(simpleDateTimeH1.f47285a, simpleDate) ? i0(simpleDateTimeH1, calendar, yg40Var, xg40.f40822a).b : null);
                fetVar.o0(objP);
            }
            Pair pair = (Pair) objP;
            TimeOfDay23 timeOfDay23 = (TimeOfDay23) pair.f46059a;
            TimeOfDay23 timeOfDay24 = (TimeOfDay23) pair.b;
            pz40 pz40VarF = androidx.compose.runtime.e.f(Boolean.valueOf(z), fetVar);
            int i7 = i4 >> 3;
            pz40 pz40VarF2 = androidx.compose.runtime.e.f(amVar, fetVar);
            pz40 pz40VarF3 = androidx.compose.runtime.e.f(function2, fetVar);
            pz40 pz40VarF4 = androidx.compose.runtime.e.f(function3, fetVar);
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = new gf9((Object) pz40VarF, (Object) pz40VarF2, (Object) pz40VarF3, (Object) pz40VarF4, (byte) 28);
                fetVar.o0(objP2);
            }
            Function2 function4 = (Function2) objP2;
            boolean zG2 = fetVar.g(timeOfDay23) | fetVar.g(timeOfDay24);
            Object objP3 = fetVar.P();
            if (zG2 || objP3 == obj) {
                objP3 = new rgq0(true, timeOfDay23, timeOfDay24, function4);
                fetVar.o0(objP3);
            }
            rgq0 rgq0Var = (rgq0) objP3;
            boolean z2 = i5 == 32;
            Object objP4 = fetVar.P();
            if (z2 || objP4 == obj) {
                int iOrdinal4 = amVar.ordinal();
                if (iOrdinal4 == 0) {
                    objP4 = simpleDateTime.b;
                } else {
                    if (iOrdinal4 != 1) {
                        t9f.b();
                        return;
                    }
                    objP4 = simpleDateTime2.b;
                }
                fetVar.o0(objP4);
            }
            TimeOfDay23 timeOfDay25 = (TimeOfDay23) objP4;
            boolean z3 = (i6 == 536870912) | (i5 == 32);
            Object objP5 = fetVar.P();
            if (z3 || objP5 == obj) {
                objP5 = new gr90(timeOfDay25, yg40Var);
                fetVar.o0(objP5);
            }
            zx7 zx7Var = gqw0.e;
            jr8 jr8Var = jr8.f16991a;
            jm40 jm40Var = jm40.b;
            up90.a(jr8Var.b(jm40Var, zx7Var), (gr90) objP5, locale, null, rgq0Var, null, fetVar, (i7 & 896) | 32832, 40);
            fetVar.r(false);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nfe(mm40Var2, amVar, z, locale, simpleDateTime, simpleDateTime2, simpleDateTime3, simpleDateTime4, calendar, yg40Var, function2, function3, i2);
        }
    }

    public static final void S(String str, String str2, String str3, ifj ifjVar, boolean z, ulq0 ulq0Var, am amVar, Function1 function1, Function1 function2, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-191665576);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(str2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(str3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.e(ifjVar.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.h(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.e(ulq0Var.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.e(amVar.ordinal()) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= fetVar.i(function2) ? 67108864 : 33554432;
        }
        int i4 = i3;
        if (fetVar.U(i4 & 1, (38347923 & i4) != 38347922)) {
            ifj ifjVar2 = amVar == am.f1086a ? ifjVar : null;
            jfj jfjVar = jfj.b;
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            int i5 = 29360128 & i4;
            int i6 = i4 & 234881024;
            boolean z2 = (i5 == 8388608) | (i6 == 67108864);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new rej(function1, function2, (byte) 1);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z3 = (i5 == 8388608) | ((458752 & i4) == 131072) | ((i4 & 57344) == 16384) | (i6 == 67108864);
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                sej sejVar = new sej(z, ulq0Var, function1, function2, (byte) 1);
                fetVar.o0(sejVar);
                objP2 = sejVar;
            }
            int i7 = i4 << 6;
            cwr0.n(mm40VarD, str, ulq0Var, str2, str3, ifjVar2, jfjVar, function0, (Function0) objP2, fetVar, ((i4 << 3) & 112) | 1572870 | ((i4 >> 9) & 896) | (i7 & 7168) | (i7 & 57344));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dcc(str, str2, str3, ifjVar, z, ulq0Var, amVar, function1, function2, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x024f  */
    /* JADX WARN: Code duplicated, block: B:79:0x025c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0268  */
    /* JADX WARN: Code duplicated, block: B:82:0x0296  */
    /* JADX WARN: Code duplicated, block: B:83:0x0298  */
    /* JADX WARN: Code duplicated, block: B:89:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:92:0x02c3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r6v1, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v7, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void T(int i2, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        Function1 function2;
        ?? r6;
        boolean z;
        ?? r13;
        int i3;
        int i4;
        cl5 cl5Var;
        Object obj;
        boolean z2;
        ?? r7;
        mtl mtlVar;
        ?? r10;
        Object obj2;
        boolean z3;
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        fetVar2.g0(777223209);
        int i5 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(l7m0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i5 & 1, (i5 & 147) != 146)) {
            int i6 = i5 & 896;
            boolean z4 = i6 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            Object obj3 = objP;
            if (z4 || objP == cl5Var2) {
                sbr0 sbr0Var = new sbr0(function1, (byte) 28);
                fetVar2.o0(sbr0Var);
                obj3 = sbr0Var;
            }
            v3c.A((Function0) obj3, null, null, fetVar2, 0, 6);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z5 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z5) {
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
            jas0 jas0Var = ((tas0) l7m0Var.getValue()).b;
            n0q n0qVar = o7k0.c;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, n0qVar);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            imm immVar = ((tas0) l7m0Var.getValue()).f33630a;
            boolean z6 = i6 == 256;
            Object objP2 = fetVar2.P();
            Object obj4 = objP2;
            if (z6 || objP2 == cl5Var2) {
                sbr0 sbr0Var2 = new sbr0(function1, (byte) 29);
                fetVar2.o0(sbr0Var2);
                obj4 = sbr0Var2;
            }
            hlm.c(null, immVar, null, (Function0) obj4, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            fet fetVar3 = fetVar;
            if (jas0Var != null) {
                boolean z7 = jas0Var instanceof gas0;
                jm40 jm40Var = jm40.b;
                if (z7) {
                    z3 = true;
                    x7z x7zVarF = rz4.f(fetVar3, -1538651850, 1.0f, true);
                    gas0 gas0Var = (gas0) jas0Var;
                    bol bolVar = gas0Var.f10985a;
                    zcl zclVar = qmk.f28987a;
                    wvb.k(x7zVarF, bolVar, null, h97.f(qmk.a(fetVar3).c, 8.0f, qmk.a(fetVar3).c, gas0Var.b != null ? 100.0f : 24.0f, fetVar3), null, null, fetVar3, 0, 52);
                    z2 = false;
                    fetVar3.r(false);
                } else {
                    r13 = 1;
                    z3 = true;
                    z = false;
                    z2 = false;
                    z2 = false;
                    if (jas0Var instanceof ias0) {
                        x7z x7zVarF2 = rz4.f(fetVar3, -1537791786, 1.0f, true);
                        col colVar = ((ias0) jas0Var).f14453a;
                        zcl zclVar2 = qmk.f28987a;
                        wvb.k(x7zVarF2, colVar, null, h97.f(qmk.a(fetVar3).c, 8.0f, qmk.a(fetVar3).c, 24.0f, fetVar3), null, null, fetVar3, 0, 52);
                        fetVar3.r(false);
                    } else if (jas0Var instanceof has0) {
                        fetVar3.e0(-1537116358);
                        mm40 mm40VarE = tfx.E(new x7z(1.0f, true));
                        tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                        int iHashCode3 = Long.hashCode(fetVar3.T);
                        bh90 bh90VarM3 = fetVar3.m();
                        mm40 mm40VarC2 = kbc.c0(fetVar3, mm40VarE);
                        fetVar3.i0();
                        if (fetVar3.S) {
                            fetVar3.l(pcyVar);
                        } else {
                            fetVar3.r0();
                        }
                        jpm0.o(fetVar3, tj30VarC2, shdVar);
                        jpm0.o(fetVar3, bh90VarM3, shdVar2);
                        vqd.u(iHashCode3, fetVar3, shdVar3, fetVar3);
                        jpm0.o(fetVar3, mm40VarC2, shdVar4);
                        mm40 mm40VarH = phu0.H(jm40Var, null, 1);
                        mdm mdmVar = ((has0) jas0Var).f12740a;
                        i3 = i6;
                        i4 = 256;
                        boolean z8 = i3 == 256;
                        Object objP3 = fetVar3.P();
                        cl5Var = cl5Var2;
                        if (z8 || objP3 == cl5Var) {
                            nas0 nas0Var = new nas0(function1, z ? (byte) 1 : (byte) 0);
                            fetVar3.o0(nas0Var);
                            obj = nas0Var;
                        } else {
                            obj = objP3;
                        }
                        jcb.l(mm40VarH, mdmVar, false, (Function0) obj, fetVar, 0, 4);
                        fet fetVar4 = fetVar;
                        fetVar4.r(true);
                        fetVar4.r(false);
                        r7 = fetVar4;
                    }
                    r7.r(r13);
                    if (z7) {
                        r7.e0(216417011);
                        mtlVar = ((gas0) jas0Var).b;
                        if (mtlVar == null) {
                            r7.e0(-1881007250);
                            r7.r(z2);
                            function2 = function1;
                        } else {
                            r7.e0(-1881007249);
                            mm40 mm40VarN = s5x0.N(jr8.f16991a.b(phu0.H(jm40Var, null, r13), gqw0.h), 0.0f, 0.0f, 0.0f, knm0.t(r13, r7, z2), 7);
                            zcl zclVar3 = qmk.f28987a;
                            lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 12.0f, 7);
                            if (i3 == i4) {
                                r10 = r13;
                            } else {
                                r10 = z2;
                            }
                            Object objP4 = r7.P();
                            if (r10 == 0 || objP4 == cl5Var) {
                                function2 = function1;
                                xar0 xar0Var = new xar0(function2, (byte) 8);
                                r7.o0(xar0Var);
                                obj2 = xar0Var;
                            } else {
                                function2 = function1;
                                obj2 = objP4;
                            }
                            bkb.f(mm40VarN, mtlVar, null, false, lh80VarU, (Function1) obj2, r7, 3072, 4);
                            r7.r(z2);
                        }
                        r7.r(z2);
                    } else {
                        function2 = function1;
                        r7.e0(-1880378445);
                        r7.r(z2);
                    }
                    r7.r(r13);
                    r6 = r7;
                }
                i3 = i6;
                cl5Var = cl5Var2;
                i4 = 256;
                r7 = fetVar3;
                r13 = z3;
                r7.r(r13);
                if (z7) {
                    r7.e0(216417011);
                    mtlVar = ((gas0) jas0Var).b;
                    if (mtlVar == null) {
                        r7.e0(-1881007250);
                        r7.r(z2);
                        function2 = function1;
                    } else {
                        r7.e0(-1881007249);
                        mm40 mm40VarN2 = s5x0.N(jr8.f16991a.b(phu0.H(jm40Var, null, r13), gqw0.h), 0.0f, 0.0f, 0.0f, knm0.t(r13, r7, z2), 7);
                        zcl zclVar4 = qmk.f28987a;
                        lh80 lh80VarU2 = s5x0.u(0.0f, 0.0f, 0.0f, 12.0f, 7);
                        if (i3 == i4) {
                            r10 = r13;
                        } else {
                            r10 = z2;
                        }
                        Object objP5 = r7.P();
                        if (r10 == 0) {
                            function2 = function1;
                            xar0 xar0Var2 = new xar0(function2, (byte) 8);
                            r7.o0(xar0Var2);
                            obj2 = xar0Var2;
                        } else {
                            function2 = function1;
                            xar0 xar0Var3 = new xar0(function2, (byte) 8);
                            r7.o0(xar0Var3);
                            obj2 = xar0Var3;
                        }
                        bkb.f(mm40VarN2, mtlVar, null, false, lh80VarU2, (Function1) obj2, r7, 3072, 4);
                        r7.r(z2);
                    }
                    r7.r(z2);
                } else {
                    function2 = function1;
                    r7.e0(-1880378445);
                    r7.r(z2);
                }
                r7.r(r13);
                r6 = r7;
            } else {
                z = false;
            }
            throw b1j.f(-1435108577, fetVar3, z);
        }
        function2 = function1;
        fetVar2.X();
        r6 = fetVar2;
        yfe0 yfe0VarU = r6.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mpb0(mm40Var, l7m0Var, function2, i2, (byte) 16);
        }
    }

    public static final gbn U(Function0 function0, Function1 function1) {
        return new gbn(new im8((byte) 12), new lq4(3, (byte) 14), new ya4(function1, function0, (byte) 2), zx3.x);
    }

    public static final int V(List list, ano0 ano0Var) {
        Object next;
        Integer intOrNull;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((cno0) it.next()).f4666a);
        }
        Iterator it2 = r3d.r(arrayList).iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (((bno0) next).f2894a != ano0Var);
        bno0 bno0Var = (bno0) next;
        if (bno0Var == null || (intOrNull = StringsKt.toIntOrNull(bno0Var.c)) == null) {
            return 0;
        }
        return intOrNull.intValue();
    }

    public static final int W(List list, ano0 ano0Var) {
        Object next;
        Integer intOrNull;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((cno0) it.next()).f4666a);
        }
        Iterator it2 = r3d.r(arrayList).iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (((bno0) next).f2894a != ano0Var);
        bno0 bno0Var = (bno0) next;
        if (bno0Var == null || (intOrNull = StringsKt.toIntOrNull(bno0Var.d)) == null) {
            return 0;
        }
        return intOrNull.intValue();
    }

    public static final int X(ctf0 ctf0Var, String str) {
        str.getClass();
        ctf0Var.getClass();
        if (Intrinsics.d(str, ctf0Var.f(R.string.aggregator_one_x_live, new Object[0]))) {
            return 2292;
        }
        if (Intrinsics.d(str, ctf0Var.f(R.string.slots_popular, new Object[0]))) {
            return 2192;
        }
        if (Intrinsics.d(str, ctf0Var.f(R.string.recommendation, new Object[0]))) {
            return TokenTypes.REFER_TO;
        }
        return Intrinsics.d(str, ctf0Var.f(R.string.live_casino_popular, new Object[0])) ? 2293 : 0;
    }

    public static String Y(ao aoVar) {
        if (aoVar instanceof zn) {
            return "image/*";
        }
        if (aoVar instanceof yn) {
            return null;
        }
        t9f.b();
        return null;
    }

    public static final SimpleDateTime Z(SimpleDateTime simpleDateTime, SimpleDateTime simpleDateTime2, SimpleDateTime simpleDateTime3, Calendar calendar, yg40 yg40Var, xg40 xg40Var) {
        long jE0 = wdx.e0(simpleDateTime2, calendar);
        long jE1 = wdx.e0(simpleDateTime3, calendar);
        if (jE0 > jE1) {
            return i0(simpleDateTime2, calendar, yg40Var, xg40.b);
        }
        long jE2 = wdx.e0(i0(simpleDateTime2, calendar, yg40Var, xg40.b), calendar);
        long jE3 = wdx.e0(i0(simpleDateTime3, calendar, yg40Var, xg40.f40822a), calendar);
        return jE2 > jE3 ? bsr0.h0(l1e0.f(wdx.e0(simpleDateTime, calendar), jE0, jE1), calendar) : bsr0.h0(l1e0.f(wdx.e0(i0(simpleDateTime, calendar, yg40Var, xg40Var), calendar), jE2, jE3), calendar);
    }

    public static final void a(int i2, fet fetVar, mm40 mm40Var, String str) {
        fet fetVar2 = fetVar;
        String str2 = str;
        str2.getClass();
        fetVar2.g0(1875873393);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            y9q0 y9q0Var = new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109);
            long secondary = ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary();
            zcl zclVar = qmk.f28987a;
            v8q0.a(str, jr8.f16991a.b(s5x0.K(jm40.b, qmk.a(fetVar2).d, 24.0f), gqw0.e), secondary, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 0, 0, null, y9q0Var, fetVar2, (i3 >> 3) & 14, 384, 125944);
            str2 = str;
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hx1(mm40Var, str2, i2, (byte) 2);
        }
    }

    public static final Pair a0(SimpleDateTime simpleDateTime, SimpleDateTime simpleDateTime2, SimpleDateTime simpleDateTime3, SimpleDateTime simpleDateTime4, Calendar calendar, yg40 yg40Var) {
        long jE0 = wdx.e0(simpleDateTime3, calendar);
        long jE1 = wdx.e0(simpleDateTime4, calendar);
        if (jE0 > jE1) {
            return new Pair(simpleDateTime, simpleDateTime2);
        }
        if (yg40Var != null) {
            SimpleDateTime simpleDateTimeZ = Z(simpleDateTime, simpleDateTime3, h0(simpleDateTime4, calendar, yg40Var, -1), calendar, yg40Var, xg40.f40822a);
            return new Pair(simpleDateTimeZ, Z(simpleDateTime2, h0(simpleDateTimeZ, calendar, yg40Var, 1), simpleDateTime4, calendar, yg40Var, xg40.b));
        }
        long jF = l1e0.f(wdx.e0(simpleDateTime, calendar), jE0, jE1);
        long jF2 = l1e0.f(wdx.e0(simpleDateTime2, calendar), jE0, jE1);
        if (jF2 < jF) {
            jF2 = jF;
        }
        return new Pair(bsr0.h0(jF, calendar), bsr0.h0(jF2, calendar));
    }

    public static final void b(mm40 mm40Var, fe2 fe2Var, qdz qdzVar, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        fe2Var.getClass();
        qdzVar.getClass();
        function1.getClass();
        fetVar.g0(817702189);
        int i3 = i2 | 6 | (fetVar.g(fe2Var) ? 32 : 16) | (fetVar.g(qdzVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            Context context = (Context) fetVar.k(dy2.b);
            Activity activity = context instanceof Activity ? (Activity) context : null;
            Window window = activity != null ? activity.getWindow() : null;
            boolean zC = pkd.c(fetVar);
            int i4 = i3 & 7168;
            boolean z = i4 == 2048;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new ja2(function1, (byte) 6);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i4 == 2048;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == obj) {
                objP2 = new ja2(function1, (byte) 9);
                fetVar.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            Boolean boolValueOf = Boolean.valueOf(zC);
            boolean zI = fetVar.i(window) | fetVar.i(context) | fetVar.h(zC);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj) {
                objP3 = new la2(window, context, zC, b2);
                fetVar.o0(objP3);
            }
            s0x.d(boolValueOf, null, (Function1) objP3, fetVar, 0);
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            K(i120.Q(jm40Var, backgroundContent, ljcVar), fe2Var, qdzVar, function1, fetVar, i3 & 8176);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iop((byte) 12, i2, mm40Var2, fe2Var, qdzVar, function1);
        }
    }

    public static final void b0(pz40 pz40Var, pz40 pz40Var2, Calendar calendar, pz40 pz40Var3, pz40 pz40Var4, pz40 pz40Var5, pz40 pz40Var6, pz40 pz40Var7, pz40 pz40Var8, pz40 pz40Var9, pz40 pz40Var10, pz40 pz40Var11, SimpleDateTime simpleDateTime) {
        if (((Boolean) pz40Var.getValue()).booleanValue()) {
            if (pz40Var2.getValue() == ulq0.b) {
                long jF = l1e0.f(wdx.e0(simpleDateTime, calendar), ((Number) pz40Var3.getValue()).longValue(), ((Number) pz40Var4.getValue()).longValue());
                SimpleDateTime simpleDateTimeH0 = bsr0.h0(jF, calendar);
                SimpleDateTime simpleDateTime2 = (SimpleDateTime) pz40Var5.getValue();
                if (jF < wdx.e0(simpleDateTime2, calendar)) {
                    simpleDateTimeH0 = simpleDateTime2;
                }
                if (simpleDateTimeH0.equals((SimpleDateTime) pz40Var6.getValue())) {
                    return;
                }
                ((Function1) pz40Var7.getValue()).invoke(simpleDateTimeH0);
                return;
            }
            SimpleDateTime simpleDateTime3 = (SimpleDateTime) pz40Var5.getValue();
            SimpleDateTime simpleDateTime4 = (SimpleDateTime) pz40Var8.getValue();
            SimpleDateTime simpleDateTime5 = (SimpleDateTime) pz40Var9.getValue();
            yg40 yg40Var = (yg40) pz40Var10.getValue();
            SimpleDateTime simpleDateTimeZ = Z(simpleDateTime3, simpleDateTime4, h0(simpleDateTime5, calendar, yg40Var, -1), calendar, yg40Var, xg40.f40822a);
            SimpleDateTime simpleDateTimeZ2 = Z(simpleDateTime, h0(simpleDateTimeZ, calendar, (yg40) pz40Var10.getValue(), 1), (SimpleDateTime) pz40Var9.getValue(), calendar, (yg40) pz40Var10.getValue(), xg40.b);
            if (!simpleDateTimeZ.equals(pz40Var5.getValue())) {
                ((Function1) pz40Var11.getValue()).invoke(simpleDateTimeZ);
            }
            if (Intrinsics.d(simpleDateTimeZ2, pz40Var6.getValue())) {
                return;
            }
            ((Function1) pz40Var7.getValue()).invoke(simpleDateTimeZ2);
        }
    }

    public static final void c(int i2, int i3, fet fetVar, mm40 mm40Var) {
        int i4;
        mm40 mm40Var2;
        fetVar.g0(1464448199);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else {
            i4 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        }
        if (fetVar.U(i4 & 1, (i4 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40Var2 = i5 != 0 ? jm40Var : mm40Var;
            mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarN = s5x0.N(s5x0.L(i120.Q(mm40VarD, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar)), 12.0f, 0.0f, 2), 0.0f, 12.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            zcl zclVar2 = qmk.e;
            azw.t(new ugg0(zclVar2, zclVar2, zclVar2, zclVar2), null, dwi0.c, fetVar, 384);
            mm40 mm40VarL = s5x0.L(jm40Var, 0.0f, 10.0f, 1);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarL);
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
            zcl zclVar3 = qmk.m;
            azw.t(new ugg0(zclVar3, zclVar3, zclVar3, zclVar3), null, dwi0.d, fetVar, 384);
            qxw.o(fetVar, o7k0.n(jm40Var, 12.0f));
            azw.t(new ugg0(zclVar2, zclVar2, zclVar2, zclVar2), null, dwi0.e, fetVar, 384);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i00(mm40Var2, i2, i3, (byte) 3);
        }
    }

    public static final void c0(pz40 pz40Var, pz40 pz40Var2, Calendar calendar, pz40 pz40Var3, pz40 pz40Var4, pz40 pz40Var5, pz40 pz40Var6, pz40 pz40Var7, pz40 pz40Var8, pz40 pz40Var9, pz40 pz40Var10, pz40 pz40Var11, SimpleDateTime simpleDateTime) {
        if (((Boolean) pz40Var.getValue()).booleanValue()) {
            if (pz40Var2.getValue() == ulq0.b) {
                long jF = l1e0.f(wdx.e0(simpleDateTime, calendar), ((Number) pz40Var3.getValue()).longValue(), ((Number) pz40Var4.getValue()).longValue());
                SimpleDateTime simpleDateTimeH0 = bsr0.h0(jF, calendar);
                SimpleDateTime simpleDateTime2 = (SimpleDateTime) pz40Var5.getValue();
                SimpleDateTime simpleDateTime3 = wdx.e0(simpleDateTime2, calendar) < jF ? simpleDateTimeH0 : simpleDateTime2;
                if (!simpleDateTimeH0.equals((SimpleDateTime) pz40Var6.getValue())) {
                    ((Function1) pz40Var7.getValue()).invoke(simpleDateTimeH0);
                }
                if (simpleDateTime3.equals(simpleDateTime2)) {
                    return;
                }
                ((Function1) pz40Var8.getValue()).invoke(simpleDateTime3);
                return;
            }
            SimpleDateTime simpleDateTime4 = (SimpleDateTime) pz40Var9.getValue();
            SimpleDateTime simpleDateTime5 = (SimpleDateTime) pz40Var10.getValue();
            yg40 yg40Var = (yg40) pz40Var11.getValue();
            SimpleDateTime simpleDateTimeZ = Z(simpleDateTime, simpleDateTime4, h0(simpleDateTime5, calendar, yg40Var, -1), calendar, yg40Var, xg40.f40822a);
            SimpleDateTime simpleDateTimeZ2 = Z((SimpleDateTime) pz40Var5.getValue(), h0(simpleDateTimeZ, calendar, (yg40) pz40Var11.getValue(), 1), (SimpleDateTime) pz40Var10.getValue(), calendar, (yg40) pz40Var11.getValue(), xg40.b);
            SimpleDateTime simpleDateTime6 = (SimpleDateTime) pz40Var6.getValue();
            SimpleDateTime simpleDateTime7 = (SimpleDateTime) pz40Var5.getValue();
            if (!simpleDateTimeZ.equals(simpleDateTime6)) {
                ((Function1) pz40Var7.getValue()).invoke(simpleDateTimeZ);
            }
            if (Intrinsics.d(simpleDateTimeZ2, simpleDateTime7)) {
                return;
            }
            ((Function1) pz40Var8.getValue()).invoke(simpleDateTimeZ2);
        }
    }

    public static final void d(Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(684791668);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.i(function1) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (fetVar.U(i3 & 1, (i3 & 3) != 2)) {
            Context context = (Context) fetVar.k(dy2.b);
            mm40 mm40VarQ = i120.Q(jm40.b, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarQ, xfn.a(fetVar).d, 8.0f);
            String strQ0 = jiq0.q0(R.string.button_login, context);
            strQ0.getClass();
            String strQ1 = jiq0.q0(R.string.registration, context);
            strQ1.getClass();
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new ju60(function1, (byte) 22);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i4 == 4;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new ju60(function1, (byte) 23);
                fetVar.o0(objP2);
            }
            pzb.g(mm40VarK, strQ0, strQ1, function0, (Function0) objP2, fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wt9(function1, i2, (byte) 3);
        }
    }

    public static final gfj d0(SimpleDate simpleDate, SimpleDate simpleDate2, SimpleDateTime simpleDateTime, SimpleDateTime simpleDateTime2, TimeOfDay23 timeOfDay23, TimeOfDay23 timeOfDay24, yg40 yg40Var, fet fetVar, int i2, int i3) {
        Pair pair;
        fet fetVar2 = fetVar;
        simpleDate.getClass();
        simpleDate2.getClass();
        Locale localeS = a8k0.s();
        TimeOfDay23 timeOfDay25 = (i3 & 128) != 0 ? null : timeOfDay24;
        boolean zG = fetVar2.g(localeS);
        Object objP = fetVar2.P();
        cl5 cl5Var = ukd.f35823a;
        if (zG || objP == cl5Var) {
            objP = Calendar.getInstance(localeS);
            fetVar2.o0(objP);
        }
        Calendar calendar = (Calendar) objP;
        calendar.getClass();
        boolean zG2 = fetVar2.g(localeS) | fetVar2.g(simpleDate) | fetVar2.g(simpleDate2) | fetVar2.g(timeOfDay23) | (((i2 & 29360128) ^ 12582912) > 8388608 && fetVar2.g(timeOfDay25)) | fetVar2.e(5) | fetVar2.e(yg40Var.ordinal());
        Object objP2 = fetVar2.P();
        TimeOfDay23 timeOfDay26 = g;
        TimeOfDay23 timeOfDay27 = f;
        if (zG2 || objP2 == cl5Var) {
            if (simpleDateTime == null || simpleDateTime2 == null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                SimpleDateTime simpleDateTime3 = new SimpleDateTime(simpleDate, timeOfDay23 == null ? timeOfDay27 : timeOfDay23);
                SimpleDateTime simpleDateTime4 = new SimpleDateTime(simpleDate2, timeOfDay25 == null ? timeOfDay26 : timeOfDay25);
                long jE0 = wdx.e0(simpleDateTime3, calendar);
                long jE1 = wdx.e0(simpleDateTime4, calendar);
                if (jE0 > jE1) {
                    SimpleDateTime simpleDateTimeH0 = bsr0.h0(jE0, calendar);
                    pair = new Pair(simpleDateTimeH0, simpleDateTimeH0);
                } else {
                    SimpleDateTime simpleDateTimeZ = Z(bsr0.h0(l1e0.f(jCurrentTimeMillis, jE0, jE1), calendar), simpleDateTime3, h0(simpleDateTime4, calendar, yg40Var, -1), calendar, yg40Var, xg40.f40822a);
                    pair = new Pair(simpleDateTimeZ, Z(bsr0.h0(wdx.e0(simpleDateTimeZ, calendar) + (((long) Math.max(5, (int) yg40Var.f42569a)) * 60000), calendar), h0(simpleDateTimeZ, calendar, yg40Var, 1), simpleDateTime4, calendar, yg40Var, xg40.b));
                }
                fetVar2 = fetVar;
                objP2 = pair;
            } else {
                objP2 = new Pair(simpleDateTime, simpleDateTime2);
            }
            fetVar2.o0(objP2);
        }
        Pair pair2 = (Pair) objP2;
        SimpleDateTime simpleDateTime5 = (SimpleDateTime) pair2.f46059a;
        SimpleDateTime simpleDateTime6 = (SimpleDateTime) pair2.b;
        simpleDateTime5.getClass();
        simpleDateTime6.getClass();
        boolean zG3 = fetVar2.g(localeS);
        Object objP3 = fetVar2.P();
        if (zG3 || objP3 == cl5Var) {
            objP3 = Calendar.getInstance(localeS);
            fetVar2.o0(objP3);
        }
        Calendar calendar2 = (Calendar) objP3;
        calendar2.getClass();
        boolean zG4 = fetVar2.g(localeS);
        Object objP4 = fetVar2.P();
        if (zG4 || objP4 == cl5Var) {
            v0h0 v0h0Var = new v0h0(new zcj(calendar2, (byte) 3), new n72(calendar2, (byte) 4));
            fetVar2.o0(v0h0Var);
            objP4 = v0h0Var;
        }
        u0h0 u0h0Var = (u0h0) objP4;
        boolean zG5 = fetVar2.g(simpleDate) | fetVar2.g(timeOfDay23);
        Object objP5 = fetVar2.P();
        if (zG5 || objP5 == cl5Var) {
            objP5 = new SimpleDateTime(simpleDate, timeOfDay23 == null ? timeOfDay27 : timeOfDay23);
            fetVar2.o0(objP5);
        }
        SimpleDateTime simpleDateTime7 = (SimpleDateTime) objP5;
        boolean zG6 = fetVar2.g(simpleDate2) | fetVar2.g(timeOfDay25);
        Object objP6 = fetVar2.P();
        if (zG6 || objP6 == cl5Var) {
            objP6 = new SimpleDateTime(simpleDate2, timeOfDay25 == null ? timeOfDay26 : timeOfDay25);
            fetVar2.o0(objP6);
        }
        SimpleDateTime simpleDateTime8 = (SimpleDateTime) objP6;
        boolean zG7 = fetVar2.g(simpleDateTime5) | fetVar2.g(simpleDateTime6) | fetVar2.g(simpleDateTime7) | fetVar2.g(simpleDateTime8) | fetVar2.g(calendar2) | fetVar2.e(yg40Var.ordinal());
        Object objP7 = fetVar2.P();
        if (zG7 || objP7 == cl5Var) {
            Pair pairA0 = a0(simpleDateTime5, simpleDateTime6, simpleDateTime7, simpleDateTime8, calendar2, yg40Var);
            fetVar2.o0(pairA0);
            objP7 = pairA0;
        }
        Pair pair3 = (Pair) objP7;
        SimpleDateTime simpleDateTime9 = (SimpleDateTime) pair3.f46059a;
        SimpleDateTime simpleDateTime10 = (SimpleDateTime) pair3.b;
        Object[] objArr = new Object[0];
        boolean zI = fetVar2.i(simpleDateTime9) | fetVar2.i(simpleDateTime10);
        Object objP8 = fetVar2.P();
        if (zI || objP8 == cl5Var) {
            objP8 = new vef(simpleDateTime9, simpleDateTime10, (byte) 22);
            fetVar2.o0(objP8);
        }
        pz40 pz40VarO = e9x.O(objArr, u0h0Var, (Function0) objP8, fetVar2, 0);
        boolean zG8 = fetVar2.g(localeS) | fetVar2.g(simpleDate) | fetVar2.g(simpleDate2) | fetVar2.g(timeOfDay23) | fetVar2.g(timeOfDay25) | fetVar2.e(yg40Var.ordinal());
        Object objP9 = fetVar2.P();
        if (zG8 || objP9 == cl5Var) {
            gfj gfjVar = new gfj(localeS, simpleDate, simpleDate2, timeOfDay23, timeOfDay25, yg40Var, pz40VarO);
            fetVar2.o0(gfjVar);
            objP9 = gfjVar;
        }
        return (gfj) objP9;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00df  */
    /* JADX WARN: Code duplicated, block: B:45:0x0127  */
    /* JADX WARN: Code duplicated, block: B:46:0x0129  */
    /* JADX WARN: Code duplicated, block: B:50:0x0138  */
    /* JADX WARN: Code duplicated, block: B:53:0x0155  */
    /* JADX WARN: Code duplicated, block: B:55:0x0159  */
    /* JADX WARN: Code duplicated, block: B:57:0x015d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0167  */
    /* JADX WARN: Code duplicated, block: B:64:0x0179  */
    /* JADX WARN: Code duplicated, block: B:67:0x0185  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    public static final void e(mm40 mm40Var, lo5 lo5Var, qdz qdzVar, Function1 function1, fet fetVar, int i2, int i3) {
        Function1 function2;
        boolean z;
        mm40 mm40Var2;
        Function1 function3;
        yfe0 yfe0VarU;
        cl5 cl5Var;
        d9z d9zVarA;
        yje yjeVar;
        int i4;
        boolean z2;
        boolean zG;
        Object objP;
        boolean z3;
        boolean z4;
        Object objP2;
        Object objP3;
        lo5Var.getClass();
        a4x a4xVar = lo5Var.c;
        qdzVar.getClass();
        fetVar.g0(-783737144);
        int i5 = i2 | 6;
        if ((i2 & 48) == 0) {
            i5 |= fetVar.g(lo5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= fetVar.g(qdzVar) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 == 0) {
            if ((i2 & 3072) == 0) {
                function2 = function1;
                i5 |= fetVar.i(function2) ? 2048 : 1024;
            }
            if ((i5 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i5 & 1, z)) {
                cl5Var = ukd.f35823a;
                if (i6 != 0) {
                    objP3 = fetVar.P();
                    if (objP3 == cl5Var) {
                        objP3 = new ij4((byte) 24);
                        fetVar.o0(objP3);
                    }
                    function2 = (Function1) objP3;
                }
                d9zVarA = qdzVar.a("BAN_PICKS", new gh5((byte) 5), fetVar, i5 & 896);
                jm40 jm40Var = jm40.b;
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarE = o7k0.e(mm40VarD, 88.0f);
                long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
                zcl zclVar2 = qmk.i;
                ugg0 ugg0Var = vgg0.f37379a;
                mm40 mm40VarE0 = o2e.e0(s5x0.J(i120.Q(mm40VarE, jM73getBlack400d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f), "BAN_PICKS");
                thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
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
                cwr0.g(0, fetVar, s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), lo5Var.f20375a, lo5Var.b);
                yjeVar = null;
                bsr0.e(a4xVar, d9zVarA, null, fetVar, 0);
                fetVar.r(true);
                Boolean boolValueOf = Boolean.valueOf(lo5Var.d);
                i4 = i5 & 112;
                if (i4 == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zG = z2 | fetVar.g(d9zVarA);
                objP = fetVar.P();
                if (zG || objP == cl5Var) {
                    objP = new y32((Object) lo5Var, (Object) d9zVarA, yjeVar, (byte) 28);
                    fetVar.o0(objP);
                }
                m0x0.t(fetVar, boolValueOf, (Function2) objP);
                Integer numValueOf = Integer.valueOf(a4xVar.size());
                if ((i5 & 7168) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z3 | (i4 == 32);
                objP2 = fetVar.P();
                if (z4 || objP2 == cl5Var) {
                    objP2 = new cm3(function2, lo5Var, yjeVar, (byte) 18);
                    fetVar.o0(objP2);
                }
                m0x0.t(fetVar, numValueOf, (Function2) objP2);
                mm40Var2 = jm40Var;
            } else {
                fetVar.X();
                mm40Var2 = mm40Var;
            }
            function3 = function2;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new g13((byte) 1, i2, i3, mm40Var2, lo5Var, qdzVar, function3);
            }
        }
        i5 |= 3072;
        function2 = function1;
        if ((i5 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i5 & 1, z)) {
            cl5Var = ukd.f35823a;
            if (i6 != 0) {
                objP3 = fetVar.P();
                if (objP3 == cl5Var) {
                    objP3 = new ij4((byte) 24);
                    fetVar.o0(objP3);
                }
                function2 = (Function1) objP3;
            }
            d9zVarA = qdzVar.a("BAN_PICKS", new gh5((byte) 5), fetVar, i5 & 896);
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD2 = o7k0.d(jm40Var2, 1.0f);
            zcl zclVar3 = qmk.f28987a;
            mm40 mm40VarE2 = o7k0.e(mm40VarD2, 88.0f);
            long jM73getBlack400d7_KjU2 = StaticColors.INSTANCE.m73getBlack400d7_KjU();
            zcl zclVar4 = qmk.i;
            ugg0 ugg0Var2 = vgg0.f37379a;
            mm40 mm40VarE1 = o2e.e0(s5x0.J(i120.Q(mm40VarE2, jM73getBlack400d7_KjU2, new ugg0(zclVar4, zclVar4, zclVar4, zclVar4)), 8.0f), "BAN_PICKS");
            thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE1);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, gqw0.x);
            jpm0.o(fetVar, bh90VarM2, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode2), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC1, gqw0.v);
            cwr0.g(0, fetVar, s5x0.N(jm40Var2, 0.0f, 0.0f, 8.0f, 0.0f, 11), lo5Var.f20375a, lo5Var.b);
            yjeVar = null;
            bsr0.e(a4xVar, d9zVarA, null, fetVar, 0);
            fetVar.r(true);
            Boolean boolValueOf2 = Boolean.valueOf(lo5Var.d);
            i4 = i5 & 112;
            if (i4 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            zG = z2 | fetVar.g(d9zVarA);
            objP = fetVar.P();
            if (zG) {
                objP = new y32((Object) lo5Var, (Object) d9zVarA, yjeVar, (byte) 28);
                fetVar.o0(objP);
            } else {
                objP = new y32((Object) lo5Var, (Object) d9zVarA, yjeVar, (byte) 28);
                fetVar.o0(objP);
            }
            m0x0.t(fetVar, boolValueOf2, (Function2) objP);
            Integer numValueOf2 = Integer.valueOf(a4xVar.size());
            if ((i5 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = z3 | (i4 == 32);
            objP2 = fetVar.P();
            if (z4) {
                objP2 = new cm3(function2, lo5Var, yjeVar, (byte) 18);
                fetVar.o0(objP2);
            } else {
                objP2 = new cm3(function2, lo5Var, yjeVar, (byte) 18);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, numValueOf2, (Function2) objP2);
            mm40Var2 = jm40Var2;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        function3 = function2;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g13((byte) 1, i2, i3, mm40Var2, lo5Var, qdzVar, function3);
        }
    }

    public static final int e0(int i2) {
        return Build.VERSION.SDK_INT >= 31 ? i2 | 67108864 : i2;
    }

    /* JADX WARN: Code duplicated, block: B:95:0x020b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r38v0, types: [a.fet, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    public static final void f(mm40 mm40Var, mx6 mx6Var, oln0 oln0Var, xnb0 xnb0Var, final jke jkeVar, fx6 fx6Var, String str, hh80 hh80Var, Function0 function0, final Function0 function1, final Function0 function2, Function1 function3, Function2 function4, fet fetVar, int i2, int i3) {
        Function0 function5;
        int i4;
        hh80 hh80Var2;
        Function2 function6;
        Function0 function7;
        mm40 mm40Var2;
        hh80 hh80VarT;
        int i5;
        ugd ugdVarM;
        char c2;
        Function2 function8;
        Function0 function9;
        mm40 mm40Var3;
        ?? r3;
        ugd ugdVarM2;
        boolean z;
        Object obj;
        str.getClass();
        fetVar.g0(586539339);
        int i6 = i2 | 6 | (fetVar.g(mx6Var) ? 32 : 16) | (fetVar.g(oln0Var) ? 256 : 128) | (fetVar.g(xnb0Var) ? 2048 : 1024) | (fetVar.g(jkeVar) ? 16384 : 8192) | (fetVar.e(fx6Var.ordinal()) ? 131072 : 65536) | (fetVar.g(str) ? 1048576 : 524288);
        int i7 = 4194304 | i6;
        int i8 = i3 & 256;
        if (i8 != 0) {
            i4 = i6 | 104857600;
            function5 = function0;
        } else {
            function5 = function0;
            i4 = i7 | (fetVar.i(function5) ? 67108864 : 33554432);
        }
        int i9 = i4 | (fetVar.i(function1) ? 536870912 : 268435456);
        int i10 = (((fetVar.i(function2) ? (char) 4 : (char) 2) | (fetVar.i(function3) ? ' ' : (char) 16)) == true ? 1 : 0) | 128;
        if (fetVar.U(i9 & 1, ((306783379 & i9) == 306783378 && ((i10 == true ? 1 : 0) & 147) == 146) ? false : true)) {
            fetVar.Z();
            ugd ugdVarM3 = null;
            if ((i2 & 1) == 0 || fetVar.B()) {
                zcl zclVar = qmk.f28987a;
                hh80VarT = s5x0.t(16.0f, 0.0f, 2);
                i5 = i9 & (-29360129);
                if (i8 != 0) {
                    function5 = null;
                }
                if (xnb0Var.c) {
                    fetVar.e0(1667100025);
                    ugdVarM = u1c.M(743335132, new fa2((Object) xnb0Var, (byte) 28), fetVar);
                    fetVar.r(false);
                } else {
                    fetVar.e0(1667319442);
                    fetVar.r(false);
                    ugdVarM = null;
                }
                int i11 = (i10 == true ? 1 : 0) & (-897);
                jm40 jm40Var = jm40.b;
                ugd ugdVar = ugdVarM;
                c2 = i11 == true ? 1 : 0;
                function8 = ugdVar;
                function9 = function5;
                mm40Var3 = jm40Var;
            } else {
                fetVar.X();
                function9 = function5;
                i5 = i9 & (-29360129);
                c2 = ((i10 == true ? 1 : 0) & (-897)) == true ? 1 : 0;
                mm40Var3 = mm40Var;
                hh80VarT = hh80Var;
                function8 = function4;
            }
            fetVar.s();
            mm40 mm40Var4 = mm40Var3;
            mm40 mm40VarN = epv0.N(s5x0.I(mm40Var3, hh80VarT), fx6Var == fx6.c ? 0.5f : 1.0f);
            zcl zclVar2 = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(6.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            if (jkeVar.f16665a) {
                fetVar.e0(926866589);
                r3 = 0;
                final boolean z2 = false ? 1 : 0;
                ugdVarM2 = u1c.M(1401435932, new Function2() { // from class: a.dw6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b2 = z2;
                        cl5 cl5Var = ukd.f35823a;
                        Function0 function10 = function1;
                        jke jkeVar2 = jkeVar;
                        switch (b2) {
                            case 0:
                                fet fetVar2 = (fet) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    boolean z3 = jkeVar2.c;
                                    boolean zG = fetVar2.g(function10);
                                    Object objP = fetVar2.P();
                                    if (zG || objP == cl5Var) {
                                        objP = new tq(function10, (byte) 14);
                                        fetVar2.o0(objP);
                                    }
                                    rsr0.g(R.drawable.ic_glyph_minus_small, 0, fetVar2, null, (Function0) objP, z3);
                                } else {
                                    fetVar2.X();
                                }
                                break;
                            default:
                                fet fetVar3 = (fet) obj2;
                                int iIntValue2 = ((Integer) obj3).intValue();
                                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    boolean z4 = jkeVar2.d;
                                    boolean zG2 = fetVar3.g(function10);
                                    Object objP2 = fetVar3.P();
                                    if (zG2 || objP2 == cl5Var) {
                                        objP2 = new tq(function10, (byte) 15);
                                        fetVar3.o0(objP2);
                                    }
                                    rsr0.g(R.drawable.ic_glyph_plus_small, 0, fetVar3, null, (Function0) objP2, z4);
                                } else {
                                    fetVar3.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, fetVar);
                fetVar.r(false);
            } else {
                r3 = 0;
                fetVar.e0(927195560);
                fetVar.r(false);
                ugdVarM2 = null;
            }
            if (jkeVar.b) {
                fetVar.e0(927278176);
                z = true;
                final boolean z3 = true ? 1 : 0;
                ugdVarM3 = u1c.M(1044168962, new Function2() { // from class: a.dw6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b2 = z3;
                        cl5 cl5Var = ukd.f35823a;
                        Function0 function10 = function2;
                        jke jkeVar2 = jkeVar;
                        switch (b2) {
                            case 0:
                                fet fetVar2 = (fet) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    boolean z4 = jkeVar2.c;
                                    boolean zG = fetVar2.g(function10);
                                    Object objP = fetVar2.P();
                                    if (zG || objP == cl5Var) {
                                        objP = new tq(function10, (byte) 14);
                                        fetVar2.o0(objP);
                                    }
                                    rsr0.g(R.drawable.ic_glyph_minus_small, 0, fetVar2, null, (Function0) objP, z4);
                                } else {
                                    fetVar2.X();
                                }
                                break;
                            default:
                                fet fetVar3 = (fet) obj2;
                                int iIntValue2 = ((Integer) obj3).intValue();
                                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    boolean z5 = jkeVar2.d;
                                    boolean zG2 = fetVar3.g(function10);
                                    Object objP2 = fetVar3.P();
                                    if (zG2 || objP2 == cl5Var) {
                                        objP2 = new tq(function10, (byte) 15);
                                        fetVar3.o0(objP2);
                                    }
                                    rsr0.g(R.drawable.ic_glyph_plus_small, 0, fetVar3, null, (Function0) objP2, z5);
                                } else {
                                    fetVar3.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, fetVar);
                fetVar.r(r3);
            } else {
                z = true;
                fetVar.e0(927604264);
                fetVar.r(r3);
            }
            ugd ugdVar2 = ugdVarM3;
            ?? r15 = (c2 & 'p') == 32 ? z : r3;
            Object objP = fetVar.P();
            if (r15 == 0) {
                obj = objP;
                if (objP == ukd.f35823a) {
                    uo6 uo6Var = new uo6(function3, (byte) 8);
                    fetVar.o0(uo6Var);
                    obj = uo6Var;
                }
            } else {
                uo6 uo6Var2 = new uo6(function3, (byte) 8);
                fetVar.o0(uo6Var2);
                obj = uo6Var2;
            }
            int i12 = i5 >> 6;
            u(null, mx6Var, oln0Var, fx6Var, str, function9, (Function1) obj, ugdVarM2, ugdVar2, fetVar, (i5 & 1008) | (i12 & 7168) | (i12 & 57344) | ((i5 >> 9) & 458752));
            if (function8 == null) {
                fetVar.e0(927637124);
            } else {
                fetVar.e0(-1217002211);
                function8.invoke(fetVar, Integer.valueOf((int) r3));
            }
            fetVar.r(r3);
            fetVar.r(z);
            mm40Var2 = mm40Var4;
            hh80Var2 = hh80VarT;
            function6 = function8;
            function7 = function9;
        } else {
            fetVar.X();
            hh80Var2 = hh80Var;
            function6 = function4;
            function7 = function5;
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pw6(mm40Var2, mx6Var, oln0Var, xnb0Var, jkeVar, fx6Var, str, hh80Var2, function7, function1, function2, function3, function6, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00a5 A[PHI: r0
  0x00a5: PHI (r0v11 int) = (r0v5 int), (r0v6 int), (r0v7 int), (r0v8 int) binds: [B:54:0x00a3, B:57:0x00a8, B:60:0x00ac, B:63:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    public static final Object f0(nqq nqqVar, int i2, Function1 function1) {
        int i3;
        int i4;
        Object objInvoke;
        lm40 lm40VarV;
        taz tazVarD1;
        tzi tziVar;
        if (!nqqVar.f20279a.n) {
            xcx.b("visitAncestors called on an unattached node");
        }
        lm40 lm40Var = nqqVar.f20279a.e;
        e7z e7zVarZ = vcc.Z(nqqVar);
        loop0: while (true) {
            i3 = 0;
            i4 = 1;
            objInvoke = null;
            if (e7zVarZ == null) {
                lm40VarV = null;
                break;
            }
            if ((((lm40) e7zVarZ.h1.g).d & 1024) != 0) {
                while (lm40Var != null) {
                    if ((lm40Var.c & 1024) != 0) {
                        lm40VarV = lm40Var;
                        xz40 xz40Var = null;
                        while (lm40VarV != null) {
                            if (lm40VarV instanceof nqq) {
                                break loop0;
                            }
                            if ((lm40VarV.c & 1024) != 0 && (lm40VarV instanceof f3k)) {
                                int i5 = 0;
                                for (lm40 lm40Var2 = ((f3k) lm40VarV).p; lm40Var2 != null; lm40Var2 = lm40Var2.f) {
                                    if ((lm40Var2.c & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            lm40VarV = lm40Var2;
                                        } else {
                                            if (xz40Var == null) {
                                                xz40Var = new xz40(new lm40[16]);
                                            }
                                            if (lm40VarV != null) {
                                                xz40Var.b(lm40VarV);
                                                lm40VarV = null;
                                            }
                                            xz40Var.b(lm40Var2);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            lm40VarV = vcc.V(xz40Var);
                        }
                    }
                    lm40Var = lm40Var.e;
                }
            }
            e7zVarZ = e7zVarZ.v();
            lm40Var = (e7zVarZ == null || (tziVar = e7zVarZ.h1) == null) ? null : (wso0) tziVar.f;
        }
        nqq nqqVar2 = (nqq) lm40VarV;
        if ((nqqVar2 == null || !Intrinsics.d(nqqVar2.d1(), nqqVar.d1())) && (tazVarD1 = nqqVar.d1()) != null) {
            int i6 = 5;
            if (i2 == 5) {
                i4 = i6;
            } else {
                i6 = 6;
                if (i2 == 6) {
                    i4 = i6;
                } else {
                    i6 = 3;
                    if (i2 == 3) {
                        i4 = i6;
                    } else {
                        i6 = 4;
                        if (i2 == 4) {
                            i4 = i6;
                        } else if (i2 == 1) {
                            i4 = 2;
                        } else if (i2 != 2) {
                            jf4.n("Unsupported direction for beyond bounds layout");
                        }
                    }
                }
            }
            if (tazVarD1.o.b() <= 0 || !tazVarD1.o.a() || !tazVarD1.n) {
                return function1.invoke(taz.s);
            }
            boolean zA1 = tazVarD1.a1(i4);
            uaz uazVar = tazVarD1.o;
            int iE = zA1 ? uazVar.e() : uazVar.d();
            mie0 mie0Var = new mie0();
            hru hruVar = tazVarD1.p;
            hruVar.getClass();
            paz pazVar = new paz(iE, iE);
            ((xz40) hruVar.f13549a).b(pazVar);
            mie0Var.f21842a = pazVar;
            int iC = tazVarD1.o.c() * 2;
            int iB = tazVarD1.o.b();
            if (iC > iB) {
                iC = iB;
            }
            while (objInvoke == null && tazVarD1.Z0((paz) mie0Var.f21842a, i4) && i3 < iC) {
                paz pazVar2 = (paz) mie0Var.f21842a;
                int i7 = pazVar2.f26678a;
                int i8 = pazVar2.b;
                if (tazVarD1.a1(i4)) {
                    i8++;
                } else {
                    i7--;
                }
                hru hruVar2 = tazVarD1.p;
                hruVar2.getClass();
                paz pazVar3 = new paz(i7, i8);
                ((xz40) hruVar2.f13549a).b(pazVar3);
                ((xz40) tazVarD1.p.f13549a).j((paz) mie0Var.f21842a);
                mie0Var.f21842a = pazVar3;
                i3++;
                vcc.Z(tazVarD1).l();
                objInvoke = function1.invoke(new saz(tazVarD1, mie0Var, i4));
            }
            ((xz40) tazVarD1.p.f13549a).j((paz) mie0Var.f21842a);
            vcc.Z(tazVarD1).l();
            return objInvoke;
        }
        return null;
    }

    public static final void g(int i2, int i3, fet fetVar, mm40 mm40Var, Function0 function0, boolean z) {
        mm40 mm40Var2;
        fetVar.g0(-771339901);
        int i4 = i3 | 6 | (fetVar.e(i2) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i4 & 1, (i4 & 1171) != 1170)) {
            boolean z2 = (i4 & 896) == 256;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                wul wulVar = new wul(mul.e, oe9.c, new te9(i2), z, false, false);
                fetVar.o0(wulVar);
                objP = wulVar;
            }
            int i5 = 6 | ((i4 >> 3) & 896);
            jm40 jm40Var = jm40.b;
            qzb.n(jm40Var, (wul) objP, function0, fetVar, i5, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ed(mm40Var2, i2, z, function0, i3, (byte) 3);
        }
    }

    public static final mm40 g0(boolean z, ncg0 ncg0Var, boolean z2, ucg0 ucg0Var, Function0 function0) {
        if (ncg0Var != null) {
            return new i4i0(z, null, ncg0Var, z2, ucg0Var, function0);
        }
        if (ncg0Var == null) {
            return new i4i0(z, null, null, z2, ucg0Var, function0);
        }
        return kbc.O(jm40.b, new j4i0(ncg0Var, z, z2, ucg0Var, function0));
    }

    public static final void h(mm40 mm40Var, final String str, final String str2, final String str3, final Locale locale, final boolean z, final ulq0 ulq0Var, final am amVar, final ifj ifjVar, final long j, final SimpleDate simpleDate, final SimpleDateTime simpleDateTime, final SimpleDateTime simpleDateTime2, final SimpleDateTime simpleDateTime3, final SimpleDateTime simpleDateTime4, final Calendar calendar, final yg40 yg40Var, final j1e0 j1e0Var, final cfq cfqVar, final Function1 function1, final Function1 function2, fet fetVar, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        final mm40 mm40Var2;
        fetVar.g0(-323213978);
        int i9 = i2 & 6;
        y5d y5dVar = y5d.f42040a;
        if (i9 == 0) {
            i4 = (fetVar.g(y5dVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i10 = i4 | 48;
        if ((i2 & 384) == 0) {
            i10 |= fetVar.g(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i10 |= fetVar.g(str2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i10 |= fetVar.g(str3) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i10 |= fetVar.g(locale) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i10 |= fetVar.h(z) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i10 |= fetVar.e(ulq0Var.ordinal()) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i10 |= fetVar.e(amVar.ordinal()) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i10 |= fetVar.e(ifjVar.ordinal()) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = (fetVar.f(j) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= (i3 & 64) == 0 ? fetVar.g(simpleDate) : fetVar.i(simpleDate) ? 32 : 16;
        }
        int i11 = i5;
        if ((i3 & 384) == 0) {
            i6 = i11 | ((i3 & 512) == 0 ? fetVar.g(simpleDateTime) : fetVar.i(simpleDateTime) ? 256 : 128);
        } else {
            i6 = i11;
        }
        int i12 = i6;
        if ((i3 & 3072) == 0) {
            i7 = i12 | ((i3 & 4096) == 0 ? fetVar.g(simpleDateTime2) : fetVar.i(simpleDateTime2) ? 2048 : 1024);
        } else {
            i7 = i12;
        }
        int i13 = i7;
        if ((i3 & 24576) == 0) {
            i8 = i13 | ((32768 & i3) == 0 ? fetVar.g(simpleDateTime3) : fetVar.i(simpleDateTime3) ? 16384 : 8192);
        } else {
            i8 = i13;
        }
        if ((i3 & 196608) == 0) {
            i8 |= (i3 & 262144) == 0 ? fetVar.g(simpleDateTime4) : fetVar.i(simpleDateTime4) ? 131072 : 65536;
        }
        if ((i3 & 1572864) == 0) {
            i8 |= fetVar.i(calendar) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i8 |= fetVar.e(yg40Var.ordinal()) ? 8388608 : 4194304;
        }
        if ((i3 & 100663296) == 0) {
            i8 |= fetVar.g(j1e0Var) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i8 |= (i3 & 1073741824) == 0 ? fetVar.g(cfqVar) : fetVar.i(cfqVar) ? 536870912 : 268435456;
        }
        if (fetVar.U(i10 & 1, ((i10 & 306783379) == 306783378 && (i8 & 306783379) == 306783378 && (((fetVar.i(function1) ? (char) 4 : (char) 2) | (fetVar.i(function2) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
            jm40 jm40Var = jm40.b;
            nnw0.g(y5dVar.b(o7k0.d(jm40Var, 1.0f), true), null, false, u1c.M(-72589508, new xdr() { // from class: a.mej
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    Object objJ;
                    float f2;
                    float f3;
                    Object objJ2;
                    jm40 jm40Var2;
                    am amVar2;
                    fet fetVar2;
                    lr8 lr8Var = (lr8) obj;
                    fet fetVar3 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    lr8Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= fetVar3.g(lr8Var) ? 4 : 2;
                    }
                    if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                        float fC = lr8Var.c();
                        am amVar3 = amVar;
                        oms0 oms0VarZ = phu0.Z(amVar3, null, fetVar3, 0, 2);
                        p4 p4Var = oms0VarZ.f25519a;
                        lxs0 lxs0Var = hp4.l;
                        boolean zH = oms0VarZ.h();
                        cl5 cl5Var = ukd.f35823a;
                        if (zH) {
                            objJ = vqd.j(fetVar3, 1666827533, false, p4Var);
                        } else {
                            fetVar3.e0(1666573488);
                            boolean zG = fetVar3.g(oms0VarZ);
                            objJ = fetVar3.P();
                            if (zG || objJ == cl5Var) {
                                rfk0 rfk0VarJ = vdx.J();
                                Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
                                rfk0 rfk0VarW = vdx.W(rfk0VarJ);
                                try {
                                    Object objY0 = p4Var.y0();
                                    vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                                    fetVar3.o0(objY0);
                                    objJ = objY0;
                                } catch (Throwable th) {
                                    vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                                    throw th;
                                }
                            }
                            fetVar3.r(false);
                        }
                        am amVar4 = (am) objJ;
                        fetVar3.e0(-572648470);
                        am amVar5 = am.b;
                        if (amVar4 == amVar5) {
                            zcl zclVar = qmk.f28987a;
                            f2 = 0.0f;
                        } else {
                            ycl yclVar = new ycl(fC - hfj.f12976a);
                            zcl zclVar2 = qmk.f28987a;
                            ycl yclVar2 = new ycl(0.0f);
                            if (yclVar.compareTo(yclVar2) < 0) {
                                yclVar = yclVar2;
                            }
                            f2 = yclVar.f42389a;
                        }
                        ycl yclVarG = dw9.g(fetVar3, false, f2);
                        boolean zG2 = fetVar3.g(oms0VarZ);
                        Object objP = fetVar3.P();
                        if (zG2 || objP == cl5Var) {
                            objP = jgk0.b(new elb(oms0VarZ, (byte) 8));
                            fetVar3.o0(objP);
                        }
                        am amVar6 = (am) ((l7m0) objP).getValue();
                        fetVar3.e0(-572648470);
                        if (amVar6 == amVar5) {
                            f3 = 0.0f;
                        } else {
                            ycl yclVar3 = new ycl(fC - hfj.f12976a);
                            ycl yclVar4 = new ycl(0.0f);
                            if (yclVar3.compareTo(yclVar4) < 0) {
                                yclVar3 = yclVar4;
                            }
                            f3 = yclVar3.f42389a;
                        }
                        ycl yclVarG2 = dw9.g(fetVar3, false, f3);
                        boolean zG3 = fetVar3.g(oms0VarZ);
                        Object objP2 = fetVar3.P();
                        if (zG3 || objP2 == cl5Var) {
                            objP2 = jgk0.b(new elb(oms0VarZ, (byte) 9));
                            fetVar3.o0(objP2);
                        }
                        ((ams0) ((l7m0) objP2).getValue()).getClass();
                        fetVar3.e0(-1306948395);
                        fetVar3.r(false);
                        cfq cfqVar2 = cfqVar;
                        cms0 cms0VarE = phu0.E(oms0VarZ, yclVarG, yclVarG2, cfqVar2, lxs0Var, fetVar3, 0);
                        if (oms0VarZ.h()) {
                            objJ2 = vqd.j(fetVar3, 1666827533, false, p4Var);
                        } else {
                            fetVar3.e0(1666573488);
                            boolean zG4 = fetVar3.g(oms0VarZ);
                            objJ2 = fetVar3.P();
                            if (zG4 || objJ2 == cl5Var) {
                                rfk0 rfk0VarJ2 = vdx.J();
                                Function1 function1E2 = rfk0VarJ2 != null ? rfk0VarJ2.e() : null;
                                rfk0 rfk0VarW2 = vdx.W(rfk0VarJ2);
                                try {
                                    Object objY1 = p4Var.y0();
                                    vdx.Y(rfk0VarJ2, rfk0VarW2, function1E2);
                                    fetVar3.o0(objY1);
                                    objJ2 = objY1;
                                } catch (Throwable th2) {
                                    vdx.Y(rfk0VarJ2, rfk0VarW2, function1E2);
                                    throw th2;
                                }
                            }
                            fetVar3.r(false);
                        }
                        am amVar7 = (am) objJ2;
                        fetVar3.e0(793722249);
                        ycl yclVarG3 = dw9.g(fetVar3, false, amVar7 == amVar5 ? hfj.f12976a : 0.0f);
                        boolean zG5 = fetVar3.g(oms0VarZ);
                        Object objP3 = fetVar3.P();
                        if (zG5 || objP3 == cl5Var) {
                            objP3 = jgk0.b(new elb(oms0VarZ, (byte) 10));
                            fetVar3.o0(objP3);
                        }
                        am amVar8 = (am) ((l7m0) objP3).getValue();
                        fetVar3.e0(793722249);
                        ycl yclVarG4 = dw9.g(fetVar3, false, amVar8 == amVar5 ? hfj.f12976a : 0.0f);
                        boolean zG6 = fetVar3.g(oms0VarZ);
                        Object objP4 = fetVar3.P();
                        if (zG6 || objP4 == cl5Var) {
                            objP4 = jgk0.b(new elb(oms0VarZ, (byte) 11));
                            fetVar3.o0(objP4);
                        }
                        ((ams0) ((l7m0) objP4).getValue()).getClass();
                        fetVar3.e0(2003428340);
                        fetVar3.r(false);
                        cms0 cms0VarE2 = phu0.E(oms0VarZ, yclVarG3, yclVarG4, cfqVar2, lxs0Var, fetVar3, 0);
                        n0q n0qVar = o7k0.c;
                        x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar3, 0);
                        int iHashCode = Long.hashCode(fetVar3.T);
                        bh90 bh90VarM = fetVar3.m();
                        mm40 mm40VarC0 = kbc.c0(fetVar3, n0qVar);
                        mkd.c0.getClass();
                        fetVar3.i0();
                        boolean z2 = fetVar3.S;
                        pcy pcyVar = e7z.u1;
                        if (z2) {
                            fetVar3.l(pcyVar);
                        } else {
                            fetVar3.r0();
                        }
                        shd shdVar = gqw0.x;
                        jpm0.o(fetVar3, x5dVarA, shdVar);
                        shd shdVar2 = gqw0.w;
                        jpm0.o(fetVar3, bh90VarM, shdVar2);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        shd shdVar3 = gqw0.y;
                        jpm0.o(fetVar3, numValueOf, shdVar3);
                        jpm0.n(fetVar3);
                        shd shdVar4 = gqw0.v;
                        jpm0.o(fetVar3, mm40VarC0, shdVar4);
                        jm40 jm40Var3 = jm40.b;
                        mm40 mm40VarR = ffb0.R(dw9.h(1.0f, o7k0.d(jm40Var3, 1.0f), true), 0.0f, ((ycl) cms0VarE2.getValue()).f42389a, 1);
                        tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                        int iHashCode2 = Long.hashCode(fetVar3.T);
                        bh90 bh90VarM2 = fetVar3.m();
                        mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarR);
                        fetVar3.i0();
                        if (fetVar3.S) {
                            fetVar3.l(pcyVar);
                        } else {
                            fetVar3.r0();
                        }
                        jpm0.o(fetVar3, tj30VarC, shdVar);
                        jpm0.o(fetVar3, bh90VarM2, shdVar2);
                        vqd.u(iHashCode2, fetVar3, shdVar3, fetVar3);
                        jpm0.o(fetVar3, mm40VarC1, shdVar4);
                        ifj ifjVar2 = ifjVar;
                        int iOrdinal = ifjVar2.ordinal();
                        boolean z3 = z;
                        Locale locale2 = locale;
                        Calendar calendar2 = calendar;
                        SimpleDateTime simpleDateTime5 = simpleDateTime;
                        SimpleDateTime simpleDateTime6 = simpleDateTime2;
                        SimpleDateTime simpleDateTime7 = simpleDateTime3;
                        SimpleDateTime simpleDateTime8 = simpleDateTime4;
                        j1e0 j1e0Var2 = j1e0Var;
                        if (iOrdinal == 0) {
                            jm40Var2 = jm40Var3;
                            amVar2 = amVar3;
                            fetVar3.e0(2082108237);
                            rsr0.q(null, amVar2, z3, locale2, calendar2, j, simpleDate, simpleDateTime5.f47285a, simpleDateTime6.f47285a, simpleDateTime7.f47285a, simpleDateTime8.f47285a, j1e0Var2.f15730a, j1e0Var2.b, fetVar3, 1226833920);
                            fetVar2 = fetVar3;
                            fetVar2.r(false);
                        } else {
                            if (iOrdinal != 1) {
                                throw b1j.f(-764120979, fetVar3, false);
                            }
                            fetVar3.e0(2082951406);
                            amVar2 = amVar3;
                            jm40Var2 = jm40Var3;
                            rsr0.R(null, amVar2, z3, locale2, simpleDateTime7, simpleDateTime8, simpleDateTime5, simpleDateTime6, calendar2, yg40Var, j1e0Var2.c, j1e0Var2.d, fetVar3, 19169280);
                            fetVar2 = fetVar3;
                            fetVar2.r(false);
                        }
                        fetVar2.r(true);
                        qxw.o(fetVar2, o7k0.e(jm40Var2, hfj.f12976a));
                        fetVar2.r(true);
                        rsr0.m(str, str2, str3, ulq0Var, z3, amVar2, ifjVar2, ((ycl) cms0VarE.getValue()).f42389a, function1, function2, fetVar2, 0);
                    } else {
                        fetVar3.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, 3072, 6);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.nej
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(i2 | 1);
                    int iL2 = x8x.L(i3);
                    rsr0.h(mm40Var2, str, str2, str3, locale, z, ulq0Var, amVar, ifjVar, j, simpleDate, simpleDateTime, simpleDateTime2, simpleDateTime3, simpleDateTime4, calendar, yg40Var, j1e0Var, cfqVar, function1, function2, (fet) obj, iL, iL2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final SimpleDateTime h0(SimpleDateTime simpleDateTime, Calendar calendar, yg40 yg40Var, int i2) {
        return bsr0.h0((((long) i2) * ((long) yg40Var.f42569a) * 60000) + wdx.e0(simpleDateTime, calendar), calendar);
    }

    public static final void i(mm40 mm40Var, qj8 qj8Var, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-666834189);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(qj8Var) ? 32 : 16;
        }
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarF = h97.f(qmk.a(fetVar).c, 12.0f, qmk.a(fetVar).c, 24.0f, fetVar);
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new nj8(qj8Var, b2);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarD, null, ch80VarF, null, null, null, false, null, (Function1) objP, fetVar, 0, 506);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x((Object) mm40Var, (Object) qj8Var, i2, (byte) 26);
        }
    }

    public static final SimpleDateTime i0(SimpleDateTime simpleDateTime, Calendar calendar, yg40 yg40Var, xg40 xg40Var) {
        int i2;
        int i3;
        byte b2 = yg40Var.f42569a;
        if (b2 <= 1 || (i2 = simpleDateTime.b.b % b2) == 0) {
            return simpleDateTime;
        }
        int iOrdinal = xg40Var.ordinal();
        if (iOrdinal == 0) {
            i3 = -i2;
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return null;
            }
            i3 = b2 - i2;
        }
        return bsr0.h0((((long) i3) * 60000) + wdx.e0(simpleDateTime, calendar), calendar);
    }

    public static final void j(rj8 rj8Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(-716400165);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(rj8Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mdm mdmVar = rj8Var.b;
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new to6(function1, (byte) 29);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, 0, 5);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x((Object) rj8Var, (Object) function1, i2, (byte) 27);
        }
    }

    public static final SimpleDateTime j0(SimpleDateTime simpleDateTime, int i2, int i3) {
        simpleDateTime.getClass();
        TimeOfDay23 timeOfDay23 = simpleDateTime.b;
        int iD = l1e0.d(i2, 0, 23);
        int iD2 = l1e0.d(i3, 0, 59);
        timeOfDay23.getClass();
        return SimpleDateTime.a(simpleDateTime, null, new TimeOfDay23(iD, iD2), 1);
    }

    public static final void k(mm40 mm40Var, sj8 sj8Var, Function1 function1, fet fetVar, int i2) {
        fet fetVar2;
        sj8Var.getClass();
        function1.getClass();
        fetVar.g0(-808495736);
        int i3 = i2 | (fetVar.g(sj8Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new to6(function1, (byte) 27);
                fetVar.o0(objP);
            }
            knx.i(false, (Function0) objP, fetVar, 0, 1);
            mm40 mm40VarQ = i120.Q(mm40Var.e(o7k0.c), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            imm immVarA = sj8Var.a();
            boolean z2 = i4 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new to6(function1, (byte) 28);
                fetVar.o0(objP2);
            }
            hlm.c(mm40VarD, immVarA, null, (Function0) objP2, null, null, null, null, null, null, null, null, fetVar, 6, 0, 4084);
            fetVar2 = fetVar;
            if (sj8Var instanceof qj8) {
                fetVar2.e0(1570673014);
                i(o7k0.d(jm40Var, 1.0f), (qj8) sj8Var, fetVar2, (i3 & 112) | 6);
                fetVar2.r(false);
            } else {
                if (!(sj8Var instanceof rj8)) {
                    throw b1j.f(1570671248, fetVar2, false);
                }
                fetVar2.e0(1570678244);
                j((rj8) sj8Var, function1, fetVar2, (i3 >> 3) & 126);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zb8(mm40Var, sj8Var, function1, i2, (byte) 7);
        }
    }

    public static final void l(mm40 mm40Var, fo8 fo8Var, Function0 function0, fet fetVar, int i2) {
        fo8Var.getClass();
        function0.getClass();
        fetVar.g0(1796034392);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(fo8Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(o7k0.w(mm40Var, null, false, 3), 1.0f);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
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
            y(0, fetVar, s5x0.L(ohs0.i(fetVar, mm40VarC0, gqw0.v, 1.0f, true), 0.0f, 8.0f, 1), fo8Var.f9869a, fo8Var.b);
            fetVar.e0(1273095530);
            M(null, fo8Var.c, function0, fetVar, i3 & 896);
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zb8(mm40Var, fo8Var, function0, i2, (byte) 9);
        }
    }

    public static final void m(final String str, final String str2, final String str3, final ulq0 ulq0Var, final boolean z, final am amVar, final ifj ifjVar, final float f2, final Function1 function1, final Function1 function2, fet fetVar, final int i2) {
        fetVar.g0(-668206972);
        int i3 = i2 | (fetVar.g(str) ? 4 : 2) | (fetVar.g(str2) ? 32 : 16) | (fetVar.g(str3) ? 256 : 128) | (fetVar.e(ulq0Var.ordinal()) ? 2048 : 1024) | (fetVar.h(z) ? 16384 : 8192) | (fetVar.e(amVar.ordinal()) ? 131072 : 65536) | (fetVar.e(ifjVar.ordinal()) ? 1048576 : 524288) | (fetVar.d(f2) ? 8388608 : 4194304) | (fetVar.i(function1) ? 67108864 : 33554432) | (fetVar.i(function2) ? 536870912 : 268435456);
        if (fetVar.U(i3 & 1, (306783379 & i3) != 306783378)) {
            am amVar2 = am.b;
            ifj ifjVar2 = amVar == amVar2 ? ifjVar : null;
            jfj jfjVar = amVar == amVar2 ? jfj.b : jfj.f16429a;
            mm40 mm40VarH = k7n0.H(ffb0.R(o7k0.d(jm40.b, 1.0f), 0.0f, f2, 1), -1.0f);
            int i4 = 234881024 & i3;
            int i5 = i3 & 1879048192;
            boolean z2 = (i4 == 67108864) | (i5 == 536870912);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new rej(function1, function2, (byte) 0);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z3 = (i4 == 67108864) | ((i3 & 57344) == 16384) | ((i3 & 7168) == 2048) | (i5 == 536870912);
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                sej sejVar = new sej(z, ulq0Var, function1, function2, (byte) 0);
                fetVar.o0(sejVar);
                objP2 = sejVar;
            }
            int i6 = i3 << 6;
            cwr0.n(mm40VarH, str, ulq0Var, str2, str3, ifjVar2, jfjVar, function0, (Function0) objP2, fetVar, ((i3 << 3) & 112) | ((i3 >> 3) & 896) | (i6 & 7168) | (i6 & 57344));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(str, str2, str3, ulq0Var, z, amVar, ifjVar, f2, function1, function2, i2) { // from class: a.tej

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f33824a;
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ ulq0 d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ am f;
                public final /* synthetic */ ifj g;
                public final /* synthetic */ float h;
                public final /* synthetic */ Function1 i;
                public final /* synthetic */ Function1 j;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(1);
                    rsr0.m(this.f33824a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void n(h3b h3bVar, boolean z, Function1 function1, fet fetVar, int i2) {
        hyl hylVar;
        a4x a4xVar = h3bVar.d;
        fetVar.g0(-1977200057);
        int i3 = i2 | (fetVar.g(h3bVar) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            if (z) {
                fetVar.e0(-1585214741);
                syl sylVar = syl.f33027a;
                zcl zclVar = qmk.f28987a;
                gyl gylVar = new gyl(sylVar, s5x0.u(qmk.a(fetVar).c, 8.0f, 0.0f, 8.0f, 4));
                fetVar.r(false);
                hylVar = gylVar;
            } else {
                fetVar.e0(-1584904338);
                a4x a4xVarO0 = dyb.o0(a4xVar);
                tyl tylVar = tyl.b;
                syl sylVar2 = syl.f33027a;
                zcl zclVar2 = qmk.f28987a;
                fyl fylVar = new fyl(a4xVarO0, tylVar, sylVar2, s5x0.u(qmk.a(fetVar).c + 40.0f, 0.0f, 4.0f, 0.0f, 10), null, 16);
                fetVar.r(false);
                hylVar = fylVar;
            }
            mm40 mm40VarQ = i120.Q(o7k0.e(o7k0.d(jm40.b, 1.0f), 48.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.d, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, n0qVar);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            vxl vxlVar = vxl.f38204a;
            int i4 = i3 & 896;
            boolean z3 = i4 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new i160(function1, (byte) 10);
                fetVar.o0(objP);
            }
            ebc.r(null, hylVar, vxlVar, (Function1) objP, null, fetVar, 384, 41);
            if (z || a4xVar.isEmpty()) {
                fetVar.e0(-964849755);
                fetVar.r(false);
            } else {
                fetVar.e0(-965047721);
                boolean z4 = h3bVar.c;
                boolean z5 = i4 == 256;
                Object objP2 = fetVar.P();
                if (z5 || objP2 == cl5Var) {
                    objP2 = new ju60(function1, (byte) 21);
                    fetVar.o0(objP2);
                }
                v(z4, (Function0) objP2, fetVar, 0);
                fetVar.r(false);
            }
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q2n((Object) h3bVar, z, (Object) function1, i2, (byte) 15);
        }
    }

    public static final void o(mm40 mm40Var, mdm mdmVar, Function0 function0, fet fetVar, int i2) {
        fetVar.g0(1273571260);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(mdmVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jcb.l(null, mdmVar, false, function0, fetVar, (i3 & 112) | ((i3 << 3) & 7168), 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gg8(mm40Var, mdmVar, function0, i2, (byte) 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0212  */
    /* JADX WARN: Code duplicated, block: B:148:0x0238  */
    /* JADX WARN: Code duplicated, block: B:160:0x0268  */
    /* JADX WARN: Code duplicated, block: B:172:0x0295  */
    /* JADX WARN: Code duplicated, block: B:174:0x029b  */
    /* JADX WARN: Code duplicated, block: B:175:0x029e  */
    /* JADX WARN: Code duplicated, block: B:185:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:194:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:198:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:200:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:201:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:211:0x0309  */
    /* JADX WARN: Code duplicated, block: B:220:0x031f  */
    /* JADX WARN: Code duplicated, block: B:224:0x032a  */
    /* JADX WARN: Code duplicated, block: B:226:0x032e  */
    /* JADX WARN: Code duplicated, block: B:227:0x0331  */
    /* JADX WARN: Code duplicated, block: B:231:0x0348  */
    /* JADX WARN: Code duplicated, block: B:232:0x034a  */
    /* JADX WARN: Code duplicated, block: B:236:0x035d  */
    /* JADX WARN: Code duplicated, block: B:238:0x0363  */
    /* JADX WARN: Code duplicated, block: B:240:0x0366  */
    /* JADX WARN: Code duplicated, block: B:241:0x0371  */
    /* JADX WARN: Code duplicated, block: B:243:0x0375  */
    /* JADX WARN: Code duplicated, block: B:247:0x0390  */
    /* JADX WARN: Code duplicated, block: B:248:0x0392  */
    /* JADX WARN: Code duplicated, block: B:252:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:254:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:256:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:257:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:259:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:263:0x03db  */
    /* JADX WARN: Code duplicated, block: B:264:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:267:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:268:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:272:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:275:0x0423  */
    /* JADX WARN: Code duplicated, block: B:278:0x042c  */
    /* JADX WARN: Code duplicated, block: B:281:0x0433 A[PHI: r5
  0x0433: PHI (r5v31 org.xplatform.uikit.compose.components.calendar.model.SimpleDateTime) = 
  (r5v23 org.xplatform.uikit.compose.components.calendar.model.SimpleDateTime)
  (r5v32 org.xplatform.uikit.compose.components.calendar.model.SimpleDateTime)
 binds: [B:280:0x0431, B:276:0x0429] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:282:0x0435  */
    /* JADX WARN: Code duplicated, block: B:285:0x0441 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:286:0x0443  */
    /* JADX WARN: Code duplicated, block: B:291:0x0463  */
    /* JADX WARN: Code duplicated, block: B:294:0x046c  */
    /* JADX WARN: Code duplicated, block: B:295:0x046f  */
    /* JADX WARN: Code duplicated, block: B:298:0x0479 A[PHI: r6 r42
  0x0479: PHI (r6v20 org.xplatform.uikit.compose.components.calendar.model.SimpleDateTime) = 
  (r6v4 org.xplatform.uikit.compose.components.calendar.model.SimpleDateTime)
  (r6v21 org.xplatform.uikit.compose.components.calendar.model.SimpleDateTime)
 binds: [B:297:0x0477, B:294:0x046c] A[DONT_GENERATE, DONT_INLINE]
  0x0479: PHI (r42v3 int) = (r42v0 int), (r42v4 int) binds: [B:297:0x0477, B:294:0x046c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:299:0x047b  */
    /* JADX WARN: Code duplicated, block: B:302:0x0487 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:303:0x0489  */
    /* JADX WARN: Code duplicated, block: B:308:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:310:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:316:0x04ba A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:317:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:320:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:322:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:328:0x04e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:329:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:332:0x0513 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:333:0x0515  */
    /* JADX WARN: Code duplicated, block: B:336:0x0551 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:337:0x0553  */
    /* JADX WARN: Code duplicated, block: B:339:0x0559  */
    /* JADX WARN: Code duplicated, block: B:341:0x055c  */
    /* JADX WARN: Code duplicated, block: B:342:0x055e  */
    /* JADX WARN: Code duplicated, block: B:344:0x0562  */
    /* JADX WARN: Code duplicated, block: B:348:0x0585  */
    /* JADX WARN: Code duplicated, block: B:354:0x0592  */
    /* JADX WARN: Code duplicated, block: B:357:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:358:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:361:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:362:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:365:0x05bd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:368:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:370:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:372:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:373:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:375:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:379:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:380:0x0602  */
    /* JADX WARN: Code duplicated, block: B:383:0x066e  */
    /* JADX WARN: Code duplicated, block: B:386:0x0677  */
    /* JADX WARN: Code duplicated, block: B:387:0x067c  */
    /* JADX WARN: Code duplicated, block: B:390:0x0688 A[PHI: r1 r45 r46
  0x0688: PHI (r1v43 java.util.Locale) = (r1v33 java.util.Locale), (r1v44 java.util.Locale) binds: [B:389:0x0686, B:386:0x0677] A[DONT_GENERATE, DONT_INLINE]
  0x0688: PHI (r45v2 int) = (r45v0 int), (r45v3 int) binds: [B:389:0x0686, B:386:0x0677] A[DONT_GENERATE, DONT_INLINE]
  0x0688: PHI (r46v2 org.xplatform.uikit.compose.components.calendar.model.SimpleDateTime) = 
  (r46v0 org.xplatform.uikit.compose.components.calendar.model.SimpleDateTime)
  (r46v3 org.xplatform.uikit.compose.components.calendar.model.SimpleDateTime)
 binds: [B:389:0x0686, B:386:0x0677] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:391:0x068a  */
    /* JADX WARN: Code duplicated, block: B:394:0x0691 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:397:0x06a1  */
    /* JADX WARN: Code duplicated, block: B:400:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:402:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:408:0x06ea A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:409:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:412:0x0722  */
    /* JADX WARN: Code duplicated, block: B:414:0x0728  */
    /* JADX WARN: Code duplicated, block: B:420:0x0735 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:421:0x0737  */
    /* JADX WARN: Code duplicated, block: B:424:0x076b  */
    /* JADX WARN: Code duplicated, block: B:426:0x0771  */
    /* JADX WARN: Code duplicated, block: B:432:0x077e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:433:0x0780  */
    /* JADX WARN: Code duplicated, block: B:436:0x0798  */
    /* JADX WARN: Code duplicated, block: B:439:0x081f  */
    /* JADX WARN: Code duplicated, block: B:440:0x0825  */
    /* JADX WARN: Code duplicated, block: B:443:0x085f  */
    /* JADX WARN: Code duplicated, block: B:446:0x0864  */
    /* JADX WARN: Code duplicated, block: B:450:0x087d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:451:0x087f  */
    /* JADX WARN: Code duplicated, block: B:454:0x08bb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:455:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:458:0x08d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:459:0x08d5  */
    public static final void p(final mm40 mm40Var, final String str, final String str2, final SimpleDateTime simpleDateTime, final SimpleDateTime simpleDateTime2, final SimpleDate simpleDate, final SimpleDate simpleDate2, final boolean z, final ulq0 ulq0Var, final Calendar calendar, final Locale locale, final TimeOfDay23 timeOfDay23, final TimeOfDay23 timeOfDay24, yg40 yg40Var, final Function1 function1, final Function1 function2, fet fetVar, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        final yg40 yg40Var2;
        yg40 yg40Var3;
        Context context;
        yg40 yg40Var4;
        Object objP;
        cl5 cl5Var;
        pz40 pz40VarO;
        Object objP2;
        pz40 pz40VarO2;
        boolean z2;
        Object objP3;
        DateFormat dateFormat;
        boolean zG;
        Object objP4;
        String str3;
        DateFormat dateFormat2;
        boolean z3;
        boolean z4;
        boolean z5;
        Object objP5;
        TimeOfDay23 timeOfDay25;
        SimpleDateTime simpleDateTime3;
        boolean z6;
        boolean z7;
        boolean z8;
        Object objP6;
        TimeOfDay23 timeOfDay26;
        SimpleDateTime simpleDateTime4;
        int i7;
        boolean z9;
        boolean zG2;
        Object objP7;
        int iOrdinal;
        long jE0;
        boolean z10;
        boolean zG3;
        Object objP8;
        int iOrdinal2;
        long jE1;
        boolean z11;
        boolean z12;
        boolean z13;
        Object objP9;
        int i8;
        int i9;
        SimpleDateTime simpleDateTime5;
        boolean z14;
        boolean zG4;
        Object objP10;
        SimpleDate simpleDate3;
        String str4;
        int i10;
        SimpleDateTime simpleDateTime6;
        int i11;
        boolean z15;
        boolean zG5;
        Object objP11;
        SimpleDate simpleDate4;
        String str5;
        boolean zG6;
        Object objP12;
        String str6;
        boolean zG7;
        Object objP13;
        String str7;
        boolean zG8;
        Object objP14;
        am amVar;
        boolean zG9;
        Object objP15;
        int iOrdinal3;
        SimpleDateTime simpleDateTime7;
        boolean z16;
        boolean z17;
        int i12;
        boolean z18;
        boolean z19;
        int iOrdinal4;
        yg40 yg40Var5;
        SimpleDateTime simpleDateTimeH0;
        Object objV;
        Object objP16;
        int i13;
        pz40 pz40VarF;
        pz40 pz40VarF2;
        pz40 pz40VarF3;
        pz40 pz40VarF4;
        pz40 pz40VarF5;
        pz40 pz40VarF6;
        pz40 pz40VarF7;
        pz40 pz40VarF8;
        pz40 pz40VarF9;
        pz40 pz40VarF10;
        pz40 pz40VarF11;
        int i14;
        Locale locale2;
        int i15;
        SimpleDateTime simpleDateTime8;
        boolean z20;
        Object objP17;
        pz40 pz40Var;
        pz40 pz40Var2;
        pz40 pz40Var3;
        pz40 pz40Var4;
        pz40 pz40Var5;
        Function1 function3;
        boolean z21;
        Object objP18;
        Function1 function4;
        boolean z22;
        Object objP19;
        Function2 function5;
        boolean z23;
        Object objP20;
        Function2 function6;
        Object objP21;
        boolean zG10;
        Object objP22;
        cl5 cl5Var2;
        boolean zG11;
        Object objP23;
        boolean zG12;
        Object objP24;
        boolean zG13;
        Object objP25;
        fet fetVar2 = fetVar;
        str.getClass();
        str2.getClass();
        simpleDateTime.getClass();
        SimpleDate simpleDate5 = simpleDateTime.f47285a;
        simpleDateTime2.getClass();
        SimpleDate simpleDate6 = simpleDateTime2.f47285a;
        simpleDate.getClass();
        simpleDate2.getClass();
        calendar.getClass();
        function1.getClass();
        function2.getClass();
        fetVar2.g0(272650772);
        if ((i2 & 6) == 0) {
            i5 = i2 | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= fetVar2.g(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= (i2 & 4096) == 0 ? fetVar2.g(simpleDateTime) : fetVar2.i(simpleDateTime) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= (32768 & i2) == 0 ? fetVar2.g(simpleDateTime2) : fetVar2.i(simpleDateTime2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i5 |= (i2 & 262144) == 0 ? fetVar2.g(simpleDate) : fetVar2.i(simpleDate) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= (i2 & 2097152) == 0 ? fetVar2.g(simpleDate2) : fetVar2.i(simpleDate2) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= fetVar2.h(z) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= fetVar2.e(ulq0Var.ordinal()) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 |= fetVar2.i(calendar) ? 536870912 : 268435456;
        }
        int i16 = i5;
        int i17 = i3 | (fetVar2.g(locale) ? 4 : 2);
        if ((i3 & 48) == 0) {
            i17 |= (i3 & 64) == 0 ? fetVar2.g(timeOfDay23) : fetVar2.i(timeOfDay23) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i17 |= (i3 & 512) == 0 ? fetVar2.g(timeOfDay24) : fetVar2.i(timeOfDay24) ? 256 : 128;
        }
        int i18 = i17;
        int i19 = i4 & 8192;
        if (i19 != 0) {
            i6 = i18 | 3072;
        } else {
            i6 = i18 | (fetVar2.e(yg40Var == null ? -1 : yg40Var.ordinal()) ? 2048 : 1024);
        }
        int i20 = i6 | (fetVar2.i(function1) ? 16384 : 8192) | (fetVar2.i(function2) ? 131072 : 65536);
        if (fetVar2.U(i16 & 1, ((i16 & 306783379) == 306783378 && (74899 & i20) == 74898) ? false : true)) {
            fetVar2.Z();
            if ((i2 & 1) == 0 || fetVar2.B()) {
                if (i19 != 0) {
                    yg40Var3 = yg40.ONE;
                }
                fetVar2.s();
                context = (Context) fetVar2.k(dy2.b);
                yg40Var4 = yg40Var3;
                Object[] objArr = new Object[0];
                v0h0 v0h0Var = new v0h0(ske.l, x0.n);
                objP = fetVar2.P();
                cl5Var = ukd.f35823a;
                if (objP == cl5Var) {
                    objP = new bmh((byte) 25);
                    fetVar2.o0(objP);
                }
                pz40VarO = e9x.O(objArr, v0h0Var, (Function0) objP, fetVar2, 384);
                Object[] objArr2 = new Object[0];
                v0h0 v0h0Var2 = new v0h0(ske.m, x0.o);
                objP2 = fetVar2.P();
                if (objP2 == cl5Var) {
                    objP2 = new bmh((byte) 26);
                    fetVar2.o0(objP2);
                }
                pz40VarO2 = e9x.O(objArr2, v0h0Var2, (Function0) objP2, fetVar2, 384);
                int i21 = (i20 & 14) ^ 6;
                z2 = (i21 <= 4 && fetVar2.g(locale)) || (i20 & 6) == 4;
                objP3 = fetVar2.P();
                if (z2 || objP3 == cl5Var) {
                    objP3 = new SimpleDateFormat(android.text.format.DateFormat.getBestDateTimePattern(locale, "dMMMM"), locale);
                    fetVar2.o0(objP3);
                }
                dateFormat = (DateFormat) objP3;
                zG = ((i21 <= 4 && fetVar2.g(locale)) || (i20 & 6) == 4) | fetVar2.g(context);
                objP4 = fetVar2.P();
                if (zG || objP4 == cl5Var) {
                    if (android.text.format.DateFormat.is24HourFormat(context)) {
                        str3 = "Hm";
                    } else {
                        str3 = "hm";
                    }
                    objP4 = new SimpleDateFormat(android.text.format.DateFormat.getBestDateTimePattern(locale, str3), locale);
                    fetVar2.o0(objP4);
                }
                dateFormat2 = (DateFormat) objP4;
                if ((i16 & 458752) != 131072 || ((i16 & 262144) != 0 && fetVar2.g(simpleDate))) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z24 = z3;
                if ((i20 & 112) != 32 || ((i20 & 64) != 0 && fetVar2.g(timeOfDay23))) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 = z24 | z4;
                objP5 = fetVar2.P();
                if (z5 || objP5 == cl5Var) {
                    if (timeOfDay23 == null) {
                        timeOfDay25 = f;
                    } else {
                        timeOfDay25 = timeOfDay23;
                    }
                    objP5 = new SimpleDateTime(simpleDate, timeOfDay25);
                    fetVar2.o0(objP5);
                }
                simpleDateTime3 = (SimpleDateTime) objP5;
                if ((i16 & 3670016) != 1048576 || ((i16 & 2097152) != 0 && fetVar2.g(simpleDate2))) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                boolean z25 = z6;
                if ((i20 & 896) != 256 || ((i20 & 512) != 0 && fetVar2.g(timeOfDay24))) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                z8 = z25 | z7;
                objP6 = fetVar2.P();
                if (z8 || objP6 == cl5Var) {
                    if (timeOfDay24 == null) {
                        timeOfDay26 = g;
                    } else {
                        timeOfDay26 = timeOfDay24;
                    }
                    objP6 = new SimpleDateTime(simpleDate2, timeOfDay26);
                    fetVar2.o0(objP6);
                }
                simpleDateTime4 = (SimpleDateTime) objP6;
                boolean zG14 = fetVar2.g(simpleDateTime3);
                i7 = i16 & 234881024;
                if (i7 == 67108864) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                zG2 = zG14 | z9 | fetVar2.g(calendar);
                objP7 = fetVar2.P();
                if (zG2 || objP7 == cl5Var) {
                    iOrdinal = ulq0Var.ordinal();
                    if (iOrdinal == 0) {
                        jE0 = wdx.e0(simpleDateTime3, calendar);
                    } else if (iOrdinal != 1) {
                        t9f.b();
                        return;
                    } else {
                        wdx.I(simpleDateTime3, calendar);
                        bsr0.U(calendar);
                        jE0 = calendar.getTimeInMillis();
                    }
                    objP7 = Long.valueOf(jE0);
                    fetVar2.o0(objP7);
                }
                long jLongValue = ((Number) objP7).longValue();
                boolean zG15 = fetVar2.g(simpleDateTime4);
                if (i7 == 67108864) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zG3 = zG15 | z10 | fetVar2.g(calendar);
                objP8 = fetVar2.P();
                if (zG3 || objP8 == cl5Var) {
                    iOrdinal2 = ulq0Var.ordinal();
                    if (iOrdinal2 == 0) {
                        jE1 = wdx.e0(simpleDateTime4, calendar);
                    } else if (iOrdinal2 != 1) {
                        t9f.b();
                        return;
                    } else {
                        wdx.I(simpleDateTime4, calendar);
                        bsr0.U(calendar);
                        jE1 = calendar.getTimeInMillis();
                    }
                    objP8 = Long.valueOf(jE1);
                    fetVar2.o0(objP8);
                }
                long jLongValue2 = ((Number) objP8).longValue();
                ifj ifjVar = (ifj) pz40VarO2.getValue();
                if ((i16 & 29360128) == 8388608) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean zE = z11 | fetVar2.e(ifjVar.ordinal());
                if (i7 == 67108864) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = zE | z12;
                objP9 = fetVar2.P();
                if (z13 || objP9 == cl5Var) {
                    objP9 = jgk0.b(new lf2(z, (Object) ulq0Var, (Object) pz40VarO2, (byte) 5));
                    fetVar2.o0(objP9);
                }
                l7m0 l7m0Var = (l7m0) objP9;
                int i22 = i16 >> 9;
                int i23 = (i22 & 14) | 72 | (i22 & 112);
                int i24 = i16 >> 21;
                i8 = (i24 & 896) | i23;
                i9 = (i8 & 14) ^ 6;
                if (i9 > 4) {
                    simpleDateTime5 = simpleDateTime;
                    if (!fetVar2.g(simpleDateTime5)) {
                        z14 = true;
                    }
                    zG4 = z14 | fetVar2.g(dateFormat);
                    objP10 = fetVar2.P();
                    if (!zG4 || objP10 == cl5Var) {
                        simpleDate3 = simpleDate5;
                        wdx.J(simpleDate3, calendar);
                        objP10 = dateFormat.format(calendar.getTime());
                        fetVar2.o0(objP10);
                    } else {
                        simpleDate3 = simpleDate5;
                    }
                    str4 = (String) objP10;
                    i10 = (i8 & 112) ^ 48;
                    if (i10 > 32) {
                        simpleDateTime6 = simpleDateTime2;
                        if (!fetVar2.g(simpleDateTime6)) {
                            i11 = i20;
                        }
                        z15 = true;
                        zG5 = z15 | fetVar2.g(dateFormat);
                        objP11 = fetVar2.P();
                        if (!zG5 || objP11 == cl5Var) {
                            simpleDate4 = simpleDate6;
                            wdx.J(simpleDate4, calendar);
                            objP11 = dateFormat.format(calendar.getTime());
                            fetVar2.o0(objP11);
                        } else {
                            simpleDate4 = simpleDate6;
                        }
                        str5 = (String) objP11;
                        zG6 = ((i9 <= 4 && fetVar2.g(simpleDateTime5)) || (i8 & 6) == 4) | fetVar2.g(dateFormat2);
                        objP12 = fetVar2.P();
                        if (zG6 || objP12 == cl5Var) {
                            wdx.I(simpleDateTime5, calendar);
                            objP12 = dateFormat2.format(calendar.getTime());
                            fetVar2.o0(objP12);
                        }
                        str6 = (String) objP12;
                        zG7 = ((i10 <= 32 && fetVar2.g(simpleDateTime6)) || (i8 & 48) == 32) | fetVar2.g(dateFormat2);
                        objP13 = fetVar2.P();
                        if (zG7 || objP13 == cl5Var) {
                            wdx.I(simpleDateTime6, calendar);
                            objP13 = dateFormat2.format(calendar.getTime());
                            fetVar2.o0(objP13);
                        }
                        str7 = (String) objP13;
                        zG8 = fetVar2.g(str4) | fetVar2.g(str5) | fetVar2.g(str6) | fetVar2.g(str7);
                        objP14 = fetVar2.P();
                        if (zG8 || objP14 == cl5Var) {
                            str4.getClass();
                            str5.getClass();
                            str6.getClass();
                            str7.getClass();
                            objP14 = new cfj(str4, str5, str6, str7);
                            fetVar2.o0(objP14);
                        }
                        cfj cfjVar = (cfj) objP14;
                        amVar = (am) pz40VarO.getValue();
                        int i25 = i16 >> 6;
                        zG9 = fetVar2.g(simpleDate4) | fetVar2.e(amVar.ordinal()) | fetVar2.g(simpleDate3) | fetVar2.g(calendar);
                        objP15 = fetVar2.P();
                        if (zG9 || objP15 == cl5Var) {
                            iOrdinal3 = amVar.ordinal();
                            if (iOrdinal3 == 0) {
                                simpleDateTime7 = simpleDateTime5;
                            } else {
                                if (iOrdinal3 != 1) {
                                    t9f.b();
                                    return;
                                }
                                simpleDateTime7 = simpleDateTime6;
                            }
                            wdx.J(simpleDateTime7.f47285a, calendar);
                            objP15 = Long.valueOf(calendar.getTimeInMillis());
                            fetVar2.o0(objP15);
                        }
                        long jLongValue3 = ((Number) objP15).longValue();
                        SimpleDate simpleDate7 = simpleDateTime3.f47285a;
                        SimpleDate simpleDate8 = simpleDateTime4.f47285a;
                        if ((i16 & 7168) != 2048 || ((i16 & 4096) != 0 && fetVar2.g(simpleDateTime5))) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        boolean zG16 = fetVar2.g(simpleDate7) | z16 | fetVar2.g(simpleDate8);
                        if (i7 == 67108864) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        boolean zG17 = zG16 | z17 | fetVar2.g(calendar);
                        i12 = i11;
                        if ((i12 & 7168) == 2048) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        z19 = zG17 | z18;
                        Object objP26 = fetVar2.P();
                        if (!z19 || objP26 == cl5Var) {
                            iOrdinal4 = ulq0Var.ordinal();
                            if (iOrdinal4 == 0) {
                                yg40Var5 = yg40Var4;
                                simpleDateTimeH0 = h0(simpleDateTime5, calendar, yg40Var5, 1);
                            } else if (iOrdinal4 != 1) {
                                t9f.b();
                                return;
                            } else {
                                yg40Var5 = yg40Var4;
                                simpleDateTimeH0 = simpleDateTime5;
                            }
                            objV = bsr0.V(simpleDateTimeH0.f47285a, simpleDateTime3.f47285a, simpleDateTime4.f47285a);
                            fetVar2.o0(objV);
                        } else {
                            yg40Var5 = yg40Var4;
                            objV = objP26;
                        }
                        SimpleDate simpleDate9 = (SimpleDate) objV;
                        objP16 = fetVar2.P();
                        if (objP16 == cl5Var) {
                            objP16 = ro4.m0(220, 0, ihn.f14788a, 2);
                            fetVar2.o0(objP16);
                        }
                        uts0 uts0Var = (uts0) objP16;
                        int i26 = i16 >> 3;
                        i13 = (i26 & 896) | (i24 & 14) | ((i12 << 3) & 112) | 512 | 4096 | (i26 & 7168) | (i25 & 3670016) | (i25 & 29360128) | 1207959552;
                        pz40VarF = androidx.compose.runtime.e.f(Boolean.valueOf(z), fetVar2);
                        pz40VarF2 = androidx.compose.runtime.e.f(simpleDateTime5, fetVar2);
                        pz40VarF3 = androidx.compose.runtime.e.f(simpleDateTime6, fetVar2);
                        pz40VarF4 = androidx.compose.runtime.e.f(ulq0Var, fetVar2);
                        pz40VarF5 = androidx.compose.runtime.e.f(function1, fetVar2);
                        pz40VarF6 = androidx.compose.runtime.e.f(function2, fetVar);
                        pz40VarF7 = androidx.compose.runtime.e.f(Long.valueOf(jLongValue), fetVar2);
                        pz40VarF8 = androidx.compose.runtime.e.f(Long.valueOf(jLongValue2), fetVar2);
                        pz40VarF9 = androidx.compose.runtime.e.f(simpleDateTime3, fetVar2);
                        pz40VarF10 = androidx.compose.runtime.e.f(simpleDateTime4, fetVar2);
                        pz40VarF11 = androidx.compose.runtime.e.f(yg40Var5, fetVar2);
                        i14 = (i13 & 112) ^ 48;
                        if (i14 > 32) {
                            locale2 = locale;
                            if (!fetVar2.g(locale2)) {
                                i15 = i13;
                                simpleDateTime8 = simpleDateTime4;
                            }
                            z20 = true;
                            objP17 = fetVar2.P();
                            if (!z20 || objP17 == cl5Var) {
                                objP17 = new oej(pz40VarF, pz40VarF9, pz40VarF10, pz40VarF2, pz40VarF4, calendar, pz40VarF7, pz40VarF8, pz40VarF3, pz40VarF5, pz40VarF6, pz40VarF11);
                                pz40VarF8 = pz40VarF8;
                                pz40Var = pz40VarF6;
                                pz40Var2 = pz40VarF11;
                                pz40Var3 = pz40VarF5;
                                pz40Var4 = pz40VarF10;
                                pz40VarF3 = pz40VarF3;
                                pz40Var5 = pz40VarF9;
                                pz40VarF4 = pz40VarF4;
                                pz40VarF7 = pz40VarF7;
                                fetVar2.o0(objP17);
                            } else {
                                pz40Var3 = pz40VarF5;
                                pz40Var = pz40VarF6;
                                pz40Var5 = pz40VarF9;
                                pz40Var4 = pz40VarF10;
                                pz40Var2 = pz40VarF11;
                            }
                            function3 = (Function1) objP17;
                            z21 = (i14 <= 32 && fetVar2.g(locale2)) || (i15 & 48) == 32;
                            objP18 = fetVar2.P();
                            if (z21 || objP18 == cl5Var) {
                                pz40 pz40Var6 = pz40VarF8;
                                pz40 pz40Var7 = pz40VarF4;
                                pz40 pz40Var8 = pz40Var5;
                                pz40 pz40Var9 = pz40VarF7;
                                pz40 pz40Var10 = pz40VarF3;
                                pz40 pz40Var11 = pz40Var4;
                                pz40 pz40Var12 = pz40Var;
                                oej oejVar = new oej(pz40VarF, pz40Var8, pz40Var11, pz40VarF2, pz40Var10, pz40Var7, calendar, pz40Var9, pz40Var6, pz40Var12, pz40Var2, pz40Var3);
                                pz40Var5 = pz40Var8;
                                pz40VarF4 = pz40Var7;
                                pz40VarF8 = pz40Var6;
                                pz40Var4 = pz40Var11;
                                pz40VarF3 = pz40Var10;
                                pz40VarF7 = pz40Var9;
                                pz40Var = pz40Var12;
                                objP18 = oejVar;
                                fetVar2.o0(objP18);
                            }
                            function4 = (Function1) objP18;
                            z22 = (i14 <= 32 && fetVar2.g(locale2)) || (i15 & 48) == 32;
                            objP19 = fetVar2.P();
                            if (z22 || objP19 == cl5Var) {
                                pz40 pz40Var13 = pz40Var5;
                                pz40 pz40Var14 = pz40Var;
                                pz40 pz40Var15 = pz40Var3;
                                pz40 pz40Var16 = pz40Var2;
                                pz40 pz40Var17 = pz40Var4;
                                pz40 pz40Var18 = pz40VarF3;
                                pej pejVar = new pej(pz40VarF, pz40VarF4, pz40VarF2, calendar, pz40VarF7, pz40VarF8, pz40Var18, pz40Var15, pz40Var14, pz40Var13, pz40Var17, pz40Var16, (byte) 0);
                                pz40Var3 = pz40Var15;
                                pz40Var = pz40Var14;
                                pz40Var5 = pz40Var13;
                                pz40Var4 = pz40Var17;
                                pz40Var2 = pz40Var16;
                                objP19 = pejVar;
                                pz40VarF2 = pz40VarF2;
                                pz40VarF3 = pz40Var18;
                                fetVar2.o0(objP19);
                            }
                            function5 = (Function2) objP19;
                            z23 = (i14 <= 32 && fetVar2.g(locale2)) || (i15 & 48) == 32;
                            objP20 = fetVar2.P();
                            if (z23 || objP20 == cl5Var) {
                                objP20 = new pej(pz40VarF, pz40VarF4, pz40VarF3, calendar, pz40VarF7, pz40VarF8, pz40VarF2, pz40Var, pz40Var5, pz40Var4, pz40Var2, pz40Var3, (byte) 1);
                                fetVar2.o0(objP20);
                            }
                            function6 = (Function2) objP20;
                            objP21 = fetVar2.P();
                            if (objP21 == cl5Var) {
                                objP21 = new j1e0(function3, function4, function5, function6);
                                fetVar2.o0(objP21);
                            }
                            j1e0 j1e0Var = (j1e0) objP21;
                            int i27 = i12 << 12;
                            int i28 = i22 & 458752;
                            int i29 = i22 & 3670016;
                            int i30 = i27 & 29360128;
                            F(simpleDateTime5, simpleDateTime6, simpleDateTime3, simpleDateTime8, locale2, ulq0Var, calendar, yg40Var5, function1, function2, fetVar2, i23 | 4608 | (i27 & 57344) | i28 | i29 | i30 | (i27 & 234881024) | (i27 & 1879048192));
                            yg40 yg40Var6 = yg40Var5;
                            mm40 mm40VarQ = i120.Q(o7k0.e(mm40Var, lej.f19905a), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
                            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                            int iHashCode = Long.hashCode(fetVar2.T);
                            bh90 bh90VarM = fetVar2.m();
                            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
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
                            String str8 = cfjVar.f4265a;
                            String str9 = cfjVar.c;
                            ifj ifjVar2 = (ifj) l7m0Var.getValue();
                            am amVar2 = (am) pz40VarO.getValue();
                            zG10 = fetVar2.g(pz40VarO);
                            objP22 = fetVar2.P();
                            if (zG10) {
                                cl5Var2 = cl5Var;
                            } else {
                                cl5Var2 = cl5Var;
                                if (objP22 == cl5Var2) {
                                }
                                Function1 function7 = (Function1) objP22;
                                zG11 = fetVar2.g(pz40VarO2);
                                objP23 = fetVar2.P();
                                if (zG11 || objP23 == cl5Var2) {
                                    objP23 = new ca6(pz40VarO2, (byte) 21);
                                    fetVar2.o0(objP23);
                                }
                                S(str, str8, str9, ifjVar2, z, ulq0Var, amVar2, function7, (Function1) objP23, fetVar2, (i26 & 14) | (i22 & 57344) | i28);
                                String str10 = cfjVar.b;
                                String str11 = cfjVar.d;
                                am amVar3 = (am) pz40VarO.getValue();
                                ifj ifjVar3 = (ifj) l7m0Var.getValue();
                                zG12 = fetVar2.g(pz40VarO);
                                objP24 = fetVar2.P();
                                if (zG12 || objP24 == cl5Var2) {
                                    objP24 = new ca6(pz40VarO, (byte) 22);
                                    fetVar2.o0(objP24);
                                }
                                Function1 function8 = (Function1) objP24;
                                zG13 = fetVar2.g(pz40VarO2);
                                objP25 = fetVar2.P();
                                if (zG13 || objP25 == cl5Var2) {
                                    objP25 = new ca6(pz40VarO2, (byte) 23);
                                    fetVar2.o0(objP25);
                                }
                                int i31 = i16 << 3;
                                h(null, str2, str10, str11, locale, z, ulq0Var, amVar3, ifjVar3, jLongValue3, simpleDate9, simpleDateTime3, simpleDateTime8, simpleDateTime, simpleDateTime2, calendar, yg40Var6, j1e0Var, uts0Var, function8, (Function1) objP25, fetVar2, 6 | (i16 & 896) | ((i12 << 15) & 458752) | (i26 & 3670016) | (i26 & 29360128), (i31 & 458752) | (i31 & 57344) | 805605952 | i29 | i30);
                                fetVar2 = fetVar2;
                                fetVar2.r(true);
                                yg40Var2 = yg40Var6;
                            }
                            objP22 = new ca6(pz40VarO, (byte) 20);
                            fetVar2.o0(objP22);
                            Function1 function9 = (Function1) objP22;
                            zG11 = fetVar2.g(pz40VarO2);
                            objP23 = fetVar2.P();
                            if (zG11) {
                                objP23 = new ca6(pz40VarO2, (byte) 21);
                                fetVar2.o0(objP23);
                            } else {
                                objP23 = new ca6(pz40VarO2, (byte) 21);
                                fetVar2.o0(objP23);
                            }
                            S(str, str8, str9, ifjVar2, z, ulq0Var, amVar2, function9, (Function1) objP23, fetVar2, (i26 & 14) | (i22 & 57344) | i28);
                            String str12 = cfjVar.b;
                            String str13 = cfjVar.d;
                            am amVar4 = (am) pz40VarO.getValue();
                            ifj ifjVar4 = (ifj) l7m0Var.getValue();
                            zG12 = fetVar2.g(pz40VarO);
                            objP24 = fetVar2.P();
                            if (zG12) {
                                objP24 = new ca6(pz40VarO, (byte) 22);
                                fetVar2.o0(objP24);
                            } else {
                                objP24 = new ca6(pz40VarO, (byte) 22);
                                fetVar2.o0(objP24);
                            }
                            Function1 function10 = (Function1) objP24;
                            zG13 = fetVar2.g(pz40VarO2);
                            objP25 = fetVar2.P();
                            if (zG13) {
                                objP25 = new ca6(pz40VarO2, (byte) 23);
                                fetVar2.o0(objP25);
                            } else {
                                objP25 = new ca6(pz40VarO2, (byte) 23);
                                fetVar2.o0(objP25);
                            }
                            int i32 = i16 << 3;
                            h(null, str2, str12, str13, locale, z, ulq0Var, amVar4, ifjVar4, jLongValue3, simpleDate9, simpleDateTime3, simpleDateTime8, simpleDateTime, simpleDateTime2, calendar, yg40Var6, j1e0Var, uts0Var, function10, (Function1) objP25, fetVar2, 6 | (i16 & 896) | ((i12 << 15) & 458752) | (i26 & 3670016) | (i26 & 29360128), (i32 & 458752) | (i32 & 57344) | 805605952 | i29 | i30);
                            fetVar2 = fetVar2;
                            fetVar2.r(true);
                            yg40Var2 = yg40Var6;
                        } else {
                            locale2 = locale;
                        }
                        i15 = i13;
                        simpleDateTime8 = simpleDateTime4;
                        if ((i15 & 48) == 32) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        objP17 = fetVar2.P();
                        if (z20) {
                            objP17 = new oej(pz40VarF, pz40VarF9, pz40VarF10, pz40VarF2, pz40VarF4, calendar, pz40VarF7, pz40VarF8, pz40VarF3, pz40VarF5, pz40VarF6, pz40VarF11);
                            pz40VarF8 = pz40VarF8;
                            pz40Var = pz40VarF6;
                            pz40Var2 = pz40VarF11;
                            pz40Var3 = pz40VarF5;
                            pz40Var4 = pz40VarF10;
                            pz40VarF3 = pz40VarF3;
                            pz40Var5 = pz40VarF9;
                            pz40VarF4 = pz40VarF4;
                            pz40VarF7 = pz40VarF7;
                            fetVar2.o0(objP17);
                        } else {
                            objP17 = new oej(pz40VarF, pz40VarF9, pz40VarF10, pz40VarF2, pz40VarF4, calendar, pz40VarF7, pz40VarF8, pz40VarF3, pz40VarF5, pz40VarF6, pz40VarF11);
                            pz40VarF8 = pz40VarF8;
                            pz40Var = pz40VarF6;
                            pz40Var2 = pz40VarF11;
                            pz40Var3 = pz40VarF5;
                            pz40Var4 = pz40VarF10;
                            pz40VarF3 = pz40VarF3;
                            pz40Var5 = pz40VarF9;
                            pz40VarF4 = pz40VarF4;
                            pz40VarF7 = pz40VarF7;
                            fetVar2.o0(objP17);
                        }
                        function3 = (Function1) objP17;
                        if (i14 <= 32) {
                        }
                        objP18 = fetVar2.P();
                        if (z21) {
                            pz40 pz40Var19 = pz40VarF8;
                            pz40 pz40Var20 = pz40VarF4;
                            pz40 pz40Var21 = pz40Var5;
                            pz40 pz40Var22 = pz40VarF7;
                            pz40 pz40Var110 = pz40VarF3;
                            pz40 pz40Var111 = pz40Var4;
                            pz40 pz40Var112 = pz40Var;
                            oej oejVar2 = new oej(pz40VarF, pz40Var21, pz40Var111, pz40VarF2, pz40Var110, pz40Var20, calendar, pz40Var22, pz40Var19, pz40Var112, pz40Var2, pz40Var3);
                            pz40Var5 = pz40Var21;
                            pz40VarF4 = pz40Var20;
                            pz40VarF8 = pz40Var19;
                            pz40Var4 = pz40Var111;
                            pz40VarF3 = pz40Var110;
                            pz40VarF7 = pz40Var22;
                            pz40Var = pz40Var112;
                            objP18 = oejVar2;
                            fetVar2.o0(objP18);
                        } else {
                            pz40 pz40Var113 = pz40VarF8;
                            pz40 pz40Var23 = pz40VarF4;
                            pz40 pz40Var24 = pz40Var5;
                            pz40 pz40Var25 = pz40VarF7;
                            pz40 pz40Var114 = pz40VarF3;
                            pz40 pz40Var115 = pz40Var4;
                            pz40 pz40Var116 = pz40Var;
                            oej oejVar3 = new oej(pz40VarF, pz40Var24, pz40Var115, pz40VarF2, pz40Var114, pz40Var23, calendar, pz40Var25, pz40Var113, pz40Var116, pz40Var2, pz40Var3);
                            pz40Var5 = pz40Var24;
                            pz40VarF4 = pz40Var23;
                            pz40VarF8 = pz40Var113;
                            pz40Var4 = pz40Var115;
                            pz40VarF3 = pz40Var114;
                            pz40VarF7 = pz40Var25;
                            pz40Var = pz40Var116;
                            objP18 = oejVar3;
                            fetVar2.o0(objP18);
                        }
                        function4 = (Function1) objP18;
                        if (i14 <= 32) {
                        }
                        objP19 = fetVar2.P();
                        if (z22) {
                            pz40 pz40Var117 = pz40Var5;
                            pz40 pz40Var118 = pz40Var;
                            pz40 pz40Var119 = pz40Var3;
                            pz40 pz40Var120 = pz40Var2;
                            pz40 pz40Var121 = pz40Var4;
                            pz40 pz40Var122 = pz40VarF3;
                            pej pejVar2 = new pej(pz40VarF, pz40VarF4, pz40VarF2, calendar, pz40VarF7, pz40VarF8, pz40Var122, pz40Var119, pz40Var118, pz40Var117, pz40Var121, pz40Var120, (byte) 0);
                            pz40Var3 = pz40Var119;
                            pz40Var = pz40Var118;
                            pz40Var5 = pz40Var117;
                            pz40Var4 = pz40Var121;
                            pz40Var2 = pz40Var120;
                            objP19 = pejVar2;
                            pz40VarF2 = pz40VarF2;
                            pz40VarF3 = pz40Var122;
                            fetVar2.o0(objP19);
                        } else {
                            pz40 pz40Var1110 = pz40Var5;
                            pz40 pz40Var1111 = pz40Var;
                            pz40 pz40Var1112 = pz40Var3;
                            pz40 pz40Var123 = pz40Var2;
                            pz40 pz40Var124 = pz40Var4;
                            pz40 pz40Var125 = pz40VarF3;
                            pej pejVar3 = new pej(pz40VarF, pz40VarF4, pz40VarF2, calendar, pz40VarF7, pz40VarF8, pz40Var125, pz40Var1112, pz40Var1111, pz40Var1110, pz40Var124, pz40Var123, (byte) 0);
                            pz40Var3 = pz40Var1112;
                            pz40Var = pz40Var1111;
                            pz40Var5 = pz40Var1110;
                            pz40Var4 = pz40Var124;
                            pz40Var2 = pz40Var123;
                            objP19 = pejVar3;
                            pz40VarF2 = pz40VarF2;
                            pz40VarF3 = pz40Var125;
                            fetVar2.o0(objP19);
                        }
                        function5 = (Function2) objP19;
                        if (i14 <= 32) {
                        }
                        objP20 = fetVar2.P();
                        if (z23) {
                            objP20 = new pej(pz40VarF, pz40VarF4, pz40VarF3, calendar, pz40VarF7, pz40VarF8, pz40VarF2, pz40Var, pz40Var5, pz40Var4, pz40Var2, pz40Var3, (byte) 1);
                            fetVar2.o0(objP20);
                        } else {
                            objP20 = new pej(pz40VarF, pz40VarF4, pz40VarF3, calendar, pz40VarF7, pz40VarF8, pz40VarF2, pz40Var, pz40Var5, pz40Var4, pz40Var2, pz40Var3, (byte) 1);
                            fetVar2.o0(objP20);
                        }
                        function6 = (Function2) objP20;
                        objP21 = fetVar2.P();
                        if (objP21 == cl5Var) {
                            objP21 = new j1e0(function3, function4, function5, function6);
                            fetVar2.o0(objP21);
                        }
                        j1e0 j1e0Var2 = (j1e0) objP21;
                        int i210 = i12 << 12;
                        int i211 = i22 & 458752;
                        int i212 = i22 & 3670016;
                        int i33 = i210 & 29360128;
                        F(simpleDateTime5, simpleDateTime6, simpleDateTime3, simpleDateTime8, locale2, ulq0Var, calendar, yg40Var5, function1, function2, fetVar2, i23 | 4608 | (i210 & 57344) | i211 | i212 | i33 | (i210 & 234881024) | (i210 & 1879048192));
                        yg40 yg40Var7 = yg40Var5;
                        mm40 mm40VarQ2 = i120.Q(o7k0.e(mm40Var, lej.f19905a), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
                        x5d x5dVarA2 = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                        int iHashCode2 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM2 = fetVar2.m();
                        mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ2);
                        mkd.c0.getClass();
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(e7z.u1);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, x5dVarA2, gqw0.x);
                        jpm0.o(fetVar2, bh90VarM2, gqw0.w);
                        jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
                        jpm0.n(fetVar2);
                        jpm0.o(fetVar2, mm40VarC1, gqw0.v);
                        String str14 = cfjVar.f4265a;
                        String str15 = cfjVar.c;
                        ifj ifjVar5 = (ifj) l7m0Var.getValue();
                        am amVar5 = (am) pz40VarO.getValue();
                        zG10 = fetVar2.g(pz40VarO);
                        objP22 = fetVar2.P();
                        if (zG10) {
                            cl5Var2 = cl5Var;
                            if (objP22 == cl5Var2) {
                            }
                            Function1 function11 = (Function1) objP22;
                            zG11 = fetVar2.g(pz40VarO2);
                            objP23 = fetVar2.P();
                            if (zG11) {
                                objP23 = new ca6(pz40VarO2, (byte) 21);
                                fetVar2.o0(objP23);
                            } else {
                                objP23 = new ca6(pz40VarO2, (byte) 21);
                                fetVar2.o0(objP23);
                            }
                            S(str, str14, str15, ifjVar5, z, ulq0Var, amVar5, function11, (Function1) objP23, fetVar2, (i26 & 14) | (i22 & 57344) | i211);
                            String str16 = cfjVar.b;
                            String str17 = cfjVar.d;
                            am amVar6 = (am) pz40VarO.getValue();
                            ifj ifjVar6 = (ifj) l7m0Var.getValue();
                            zG12 = fetVar2.g(pz40VarO);
                            objP24 = fetVar2.P();
                            if (zG12) {
                                objP24 = new ca6(pz40VarO, (byte) 22);
                                fetVar2.o0(objP24);
                            } else {
                                objP24 = new ca6(pz40VarO, (byte) 22);
                                fetVar2.o0(objP24);
                            }
                            Function1 function12 = (Function1) objP24;
                            zG13 = fetVar2.g(pz40VarO2);
                            objP25 = fetVar2.P();
                            if (zG13) {
                                objP25 = new ca6(pz40VarO2, (byte) 23);
                                fetVar2.o0(objP25);
                            } else {
                                objP25 = new ca6(pz40VarO2, (byte) 23);
                                fetVar2.o0(objP25);
                            }
                            int i34 = i16 << 3;
                            h(null, str2, str16, str17, locale, z, ulq0Var, amVar6, ifjVar6, jLongValue3, simpleDate9, simpleDateTime3, simpleDateTime8, simpleDateTime, simpleDateTime2, calendar, yg40Var7, j1e0Var2, uts0Var, function12, (Function1) objP25, fetVar2, 6 | (i16 & 896) | ((i12 << 15) & 458752) | (i26 & 3670016) | (i26 & 29360128), (i34 & 458752) | (i34 & 57344) | 805605952 | i212 | i33);
                            fetVar2 = fetVar2;
                            fetVar2.r(true);
                            yg40Var2 = yg40Var7;
                        } else {
                            cl5Var2 = cl5Var;
                        }
                        objP22 = new ca6(pz40VarO, (byte) 20);
                        fetVar2.o0(objP22);
                        Function1 function13 = (Function1) objP22;
                        zG11 = fetVar2.g(pz40VarO2);
                        objP23 = fetVar2.P();
                        if (zG11) {
                            objP23 = new ca6(pz40VarO2, (byte) 21);
                            fetVar2.o0(objP23);
                        } else {
                            objP23 = new ca6(pz40VarO2, (byte) 21);
                            fetVar2.o0(objP23);
                        }
                        S(str, str14, str15, ifjVar5, z, ulq0Var, amVar5, function13, (Function1) objP23, fetVar2, (i26 & 14) | (i22 & 57344) | i211);
                        String str18 = cfjVar.b;
                        String str19 = cfjVar.d;
                        am amVar7 = (am) pz40VarO.getValue();
                        ifj ifjVar7 = (ifj) l7m0Var.getValue();
                        zG12 = fetVar2.g(pz40VarO);
                        objP24 = fetVar2.P();
                        if (zG12) {
                            objP24 = new ca6(pz40VarO, (byte) 22);
                            fetVar2.o0(objP24);
                        } else {
                            objP24 = new ca6(pz40VarO, (byte) 22);
                            fetVar2.o0(objP24);
                        }
                        Function1 function14 = (Function1) objP24;
                        zG13 = fetVar2.g(pz40VarO2);
                        objP25 = fetVar2.P();
                        if (zG13) {
                            objP25 = new ca6(pz40VarO2, (byte) 23);
                            fetVar2.o0(objP25);
                        } else {
                            objP25 = new ca6(pz40VarO2, (byte) 23);
                            fetVar2.o0(objP25);
                        }
                        int i35 = i16 << 3;
                        h(null, str2, str18, str19, locale, z, ulq0Var, amVar7, ifjVar7, jLongValue3, simpleDate9, simpleDateTime3, simpleDateTime8, simpleDateTime, simpleDateTime2, calendar, yg40Var7, j1e0Var2, uts0Var, function14, (Function1) objP25, fetVar2, 6 | (i16 & 896) | ((i12 << 15) & 458752) | (i26 & 3670016) | (i26 & 29360128), (i35 & 458752) | (i35 & 57344) | 805605952 | i212 | i33);
                        fetVar2 = fetVar2;
                        fetVar2.r(true);
                        yg40Var2 = yg40Var7;
                    } else {
                        simpleDateTime6 = simpleDateTime2;
                    }
                    i11 = i20;
                    if ((i8 & 48) == 32) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    zG5 = z15 | fetVar2.g(dateFormat);
                    objP11 = fetVar2.P();
                    if (zG5) {
                        simpleDate4 = simpleDate6;
                        wdx.J(simpleDate4, calendar);
                        objP11 = dateFormat.format(calendar.getTime());
                        fetVar2.o0(objP11);
                    } else {
                        simpleDate4 = simpleDate6;
                        wdx.J(simpleDate4, calendar);
                        objP11 = dateFormat.format(calendar.getTime());
                        fetVar2.o0(objP11);
                    }
                    str5 = (String) objP11;
                    zG6 = ((i9 <= 4 && fetVar2.g(simpleDateTime5)) || (i8 & 6) == 4) | fetVar2.g(dateFormat2);
                    objP12 = fetVar2.P();
                    if (zG6) {
                        wdx.I(simpleDateTime5, calendar);
                        objP12 = dateFormat2.format(calendar.getTime());
                        fetVar2.o0(objP12);
                    } else {
                        wdx.I(simpleDateTime5, calendar);
                        objP12 = dateFormat2.format(calendar.getTime());
                        fetVar2.o0(objP12);
                    }
                    str6 = (String) objP12;
                    zG7 = ((i10 <= 32 && fetVar2.g(simpleDateTime6)) || (i8 & 48) == 32) | fetVar2.g(dateFormat2);
                    objP13 = fetVar2.P();
                    if (zG7) {
                        wdx.I(simpleDateTime6, calendar);
                        objP13 = dateFormat2.format(calendar.getTime());
                        fetVar2.o0(objP13);
                    } else {
                        wdx.I(simpleDateTime6, calendar);
                        objP13 = dateFormat2.format(calendar.getTime());
                        fetVar2.o0(objP13);
                    }
                    str7 = (String) objP13;
                    zG8 = fetVar2.g(str4) | fetVar2.g(str5) | fetVar2.g(str6) | fetVar2.g(str7);
                    objP14 = fetVar2.P();
                    if (zG8) {
                        str4.getClass();
                        str5.getClass();
                        str6.getClass();
                        str7.getClass();
                        objP14 = new cfj(str4, str5, str6, str7);
                        fetVar2.o0(objP14);
                    } else {
                        str4.getClass();
                        str5.getClass();
                        str6.getClass();
                        str7.getClass();
                        objP14 = new cfj(str4, str5, str6, str7);
                        fetVar2.o0(objP14);
                    }
                    cfj cfjVar2 = (cfj) objP14;
                    amVar = (am) pz40VarO.getValue();
                    int i213 = i16 >> 6;
                    zG9 = fetVar2.g(simpleDate4) | fetVar2.e(amVar.ordinal()) | fetVar2.g(simpleDate3) | fetVar2.g(calendar);
                    objP15 = fetVar2.P();
                    if (zG9) {
                        iOrdinal3 = amVar.ordinal();
                        if (iOrdinal3 == 0) {
                            simpleDateTime7 = simpleDateTime5;
                        } else {
                            if (iOrdinal3 != 1) {
                                t9f.b();
                                return;
                            }
                            simpleDateTime7 = simpleDateTime6;
                        }
                        wdx.J(simpleDateTime7.f47285a, calendar);
                        objP15 = Long.valueOf(calendar.getTimeInMillis());
                        fetVar2.o0(objP15);
                    } else {
                        iOrdinal3 = amVar.ordinal();
                        if (iOrdinal3 == 0) {
                            simpleDateTime7 = simpleDateTime5;
                        } else {
                            if (iOrdinal3 != 1) {
                                t9f.b();
                                return;
                            }
                            simpleDateTime7 = simpleDateTime6;
                        }
                        wdx.J(simpleDateTime7.f47285a, calendar);
                        objP15 = Long.valueOf(calendar.getTimeInMillis());
                        fetVar2.o0(objP15);
                    }
                    long jLongValue4 = ((Number) objP15).longValue();
                    SimpleDate simpleDate10 = simpleDateTime3.f47285a;
                    SimpleDate simpleDate11 = simpleDateTime4.f47285a;
                    if ((i16 & 7168) != 2048) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    boolean zG18 = fetVar2.g(simpleDate10) | z16 | fetVar2.g(simpleDate11);
                    if (i7 == 67108864) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean zG19 = zG18 | z17 | fetVar2.g(calendar);
                    i12 = i11;
                    if ((i12 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zG19 | z18;
                    Object objP27 = fetVar2.P();
                    if (z19) {
                        iOrdinal4 = ulq0Var.ordinal();
                        if (iOrdinal4 == 0) {
                            yg40Var5 = yg40Var4;
                            simpleDateTimeH0 = h0(simpleDateTime5, calendar, yg40Var5, 1);
                        } else if (iOrdinal4 != 1) {
                            t9f.b();
                            return;
                        } else {
                            yg40Var5 = yg40Var4;
                            simpleDateTimeH0 = simpleDateTime5;
                        }
                        objV = bsr0.V(simpleDateTimeH0.f47285a, simpleDateTime3.f47285a, simpleDateTime4.f47285a);
                        fetVar2.o0(objV);
                    } else {
                        iOrdinal4 = ulq0Var.ordinal();
                        if (iOrdinal4 == 0) {
                            yg40Var5 = yg40Var4;
                            simpleDateTimeH0 = h0(simpleDateTime5, calendar, yg40Var5, 1);
                        } else if (iOrdinal4 != 1) {
                            t9f.b();
                            return;
                        } else {
                            yg40Var5 = yg40Var4;
                            simpleDateTimeH0 = simpleDateTime5;
                        }
                        objV = bsr0.V(simpleDateTimeH0.f47285a, simpleDateTime3.f47285a, simpleDateTime4.f47285a);
                        fetVar2.o0(objV);
                    }
                    SimpleDate simpleDate12 = (SimpleDate) objV;
                    objP16 = fetVar2.P();
                    if (objP16 == cl5Var) {
                        objP16 = ro4.m0(220, 0, ihn.f14788a, 2);
                        fetVar2.o0(objP16);
                    }
                    uts0 uts0Var2 = (uts0) objP16;
                    int i214 = i16 >> 3;
                    i13 = (i214 & 896) | (i24 & 14) | ((i12 << 3) & 112) | 512 | 4096 | (i214 & 7168) | (i213 & 3670016) | (i213 & 29360128) | 1207959552;
                    pz40VarF = androidx.compose.runtime.e.f(Boolean.valueOf(z), fetVar2);
                    pz40VarF2 = androidx.compose.runtime.e.f(simpleDateTime5, fetVar2);
                    pz40VarF3 = androidx.compose.runtime.e.f(simpleDateTime6, fetVar2);
                    pz40VarF4 = androidx.compose.runtime.e.f(ulq0Var, fetVar2);
                    pz40VarF5 = androidx.compose.runtime.e.f(function1, fetVar2);
                    pz40VarF6 = androidx.compose.runtime.e.f(function2, fetVar);
                    pz40VarF7 = androidx.compose.runtime.e.f(Long.valueOf(jLongValue), fetVar2);
                    pz40VarF8 = androidx.compose.runtime.e.f(Long.valueOf(jLongValue2), fetVar2);
                    pz40VarF9 = androidx.compose.runtime.e.f(simpleDateTime3, fetVar2);
                    pz40VarF10 = androidx.compose.runtime.e.f(simpleDateTime4, fetVar2);
                    pz40VarF11 = androidx.compose.runtime.e.f(yg40Var5, fetVar2);
                    i14 = (i13 & 112) ^ 48;
                    if (i14 > 32) {
                        locale2 = locale;
                        if (!fetVar2.g(locale2)) {
                            i15 = i13;
                            simpleDateTime8 = simpleDateTime4;
                        }
                        z20 = true;
                        objP17 = fetVar2.P();
                        if (z20) {
                            objP17 = new oej(pz40VarF, pz40VarF9, pz40VarF10, pz40VarF2, pz40VarF4, calendar, pz40VarF7, pz40VarF8, pz40VarF3, pz40VarF5, pz40VarF6, pz40VarF11);
                            pz40VarF8 = pz40VarF8;
                            pz40Var = pz40VarF6;
                            pz40Var2 = pz40VarF11;
                            pz40Var3 = pz40VarF5;
                            pz40Var4 = pz40VarF10;
                            pz40VarF3 = pz40VarF3;
                            pz40Var5 = pz40VarF9;
                            pz40VarF4 = pz40VarF4;
                            pz40VarF7 = pz40VarF7;
                            fetVar2.o0(objP17);
                        } else {
                            objP17 = new oej(pz40VarF, pz40VarF9, pz40VarF10, pz40VarF2, pz40VarF4, calendar, pz40VarF7, pz40VarF8, pz40VarF3, pz40VarF5, pz40VarF6, pz40VarF11);
                            pz40VarF8 = pz40VarF8;
                            pz40Var = pz40VarF6;
                            pz40Var2 = pz40VarF11;
                            pz40Var3 = pz40VarF5;
                            pz40Var4 = pz40VarF10;
                            pz40VarF3 = pz40VarF3;
                            pz40Var5 = pz40VarF9;
                            pz40VarF4 = pz40VarF4;
                            pz40VarF7 = pz40VarF7;
                            fetVar2.o0(objP17);
                        }
                        function3 = (Function1) objP17;
                        if (i14 <= 32) {
                        }
                        objP18 = fetVar2.P();
                        if (z21) {
                            pz40 pz40Var1113 = pz40VarF8;
                            pz40 pz40Var26 = pz40VarF4;
                            pz40 pz40Var27 = pz40Var5;
                            pz40 pz40Var28 = pz40VarF7;
                            pz40 pz40Var1114 = pz40VarF3;
                            pz40 pz40Var1115 = pz40Var4;
                            pz40 pz40Var1116 = pz40Var;
                            oej oejVar4 = new oej(pz40VarF, pz40Var27, pz40Var1115, pz40VarF2, pz40Var1114, pz40Var26, calendar, pz40Var28, pz40Var1113, pz40Var1116, pz40Var2, pz40Var3);
                            pz40Var5 = pz40Var27;
                            pz40VarF4 = pz40Var26;
                            pz40VarF8 = pz40Var1113;
                            pz40Var4 = pz40Var1115;
                            pz40VarF3 = pz40Var1114;
                            pz40VarF7 = pz40Var28;
                            pz40Var = pz40Var1116;
                            objP18 = oejVar4;
                            fetVar2.o0(objP18);
                        } else {
                            pz40 pz40Var1117 = pz40VarF8;
                            pz40 pz40Var29 = pz40VarF4;
                            pz40 pz40Var210 = pz40Var5;
                            pz40 pz40Var211 = pz40VarF7;
                            pz40 pz40Var1118 = pz40VarF3;
                            pz40 pz40Var1119 = pz40Var4;
                            pz40 pz40Var11110 = pz40Var;
                            oej oejVar5 = new oej(pz40VarF, pz40Var210, pz40Var1119, pz40VarF2, pz40Var1118, pz40Var29, calendar, pz40Var211, pz40Var1117, pz40Var11110, pz40Var2, pz40Var3);
                            pz40Var5 = pz40Var210;
                            pz40VarF4 = pz40Var29;
                            pz40VarF8 = pz40Var1117;
                            pz40Var4 = pz40Var1119;
                            pz40VarF3 = pz40Var1118;
                            pz40VarF7 = pz40Var211;
                            pz40Var = pz40Var11110;
                            objP18 = oejVar5;
                            fetVar2.o0(objP18);
                        }
                        function4 = (Function1) objP18;
                        if (i14 <= 32) {
                        }
                        objP19 = fetVar2.P();
                        if (z22) {
                            pz40 pz40Var11111 = pz40Var5;
                            pz40 pz40Var11112 = pz40Var;
                            pz40 pz40Var11113 = pz40Var3;
                            pz40 pz40Var126 = pz40Var2;
                            pz40 pz40Var127 = pz40Var4;
                            pz40 pz40Var128 = pz40VarF3;
                            pej pejVar4 = new pej(pz40VarF, pz40VarF4, pz40VarF2, calendar, pz40VarF7, pz40VarF8, pz40Var128, pz40Var11113, pz40Var11112, pz40Var11111, pz40Var127, pz40Var126, (byte) 0);
                            pz40Var3 = pz40Var11113;
                            pz40Var = pz40Var11112;
                            pz40Var5 = pz40Var11111;
                            pz40Var4 = pz40Var127;
                            pz40Var2 = pz40Var126;
                            objP19 = pejVar4;
                            pz40VarF2 = pz40VarF2;
                            pz40VarF3 = pz40Var128;
                            fetVar2.o0(objP19);
                        } else {
                            pz40 pz40Var11114 = pz40Var5;
                            pz40 pz40Var11115 = pz40Var;
                            pz40 pz40Var11116 = pz40Var3;
                            pz40 pz40Var129 = pz40Var2;
                            pz40 pz40Var1210 = pz40Var4;
                            pz40 pz40Var1211 = pz40VarF3;
                            pej pejVar5 = new pej(pz40VarF, pz40VarF4, pz40VarF2, calendar, pz40VarF7, pz40VarF8, pz40Var1211, pz40Var11116, pz40Var11115, pz40Var11114, pz40Var1210, pz40Var129, (byte) 0);
                            pz40Var3 = pz40Var11116;
                            pz40Var = pz40Var11115;
                            pz40Var5 = pz40Var11114;
                            pz40Var4 = pz40Var1210;
                            pz40Var2 = pz40Var129;
                            objP19 = pejVar5;
                            pz40VarF2 = pz40VarF2;
                            pz40VarF3 = pz40Var1211;
                            fetVar2.o0(objP19);
                        }
                        function5 = (Function2) objP19;
                        if (i14 <= 32) {
                        }
                        objP20 = fetVar2.P();
                        if (z23) {
                            objP20 = new pej(pz40VarF, pz40VarF4, pz40VarF3, calendar, pz40VarF7, pz40VarF8, pz40VarF2, pz40Var, pz40Var5, pz40Var4, pz40Var2, pz40Var3, (byte) 1);
                            fetVar2.o0(objP20);
                        } else {
                            objP20 = new pej(pz40VarF, pz40VarF4, pz40VarF3, calendar, pz40VarF7, pz40VarF8, pz40VarF2, pz40Var, pz40Var5, pz40Var4, pz40Var2, pz40Var3, (byte) 1);
                            fetVar2.o0(objP20);
                        }
                        function6 = (Function2) objP20;
                        objP21 = fetVar2.P();
                        if (objP21 == cl5Var) {
                            objP21 = new j1e0(function3, function4, function5, function6);
                            fetVar2.o0(objP21);
                        }
                        j1e0 j1e0Var3 = (j1e0) objP21;
                        int i215 = i12 << 12;
                        int i216 = i22 & 458752;
                        int i217 = i22 & 3670016;
                        int i36 = i215 & 29360128;
                        F(simpleDateTime5, simpleDateTime6, simpleDateTime3, simpleDateTime8, locale2, ulq0Var, calendar, yg40Var5, function1, function2, fetVar2, i23 | 4608 | (i215 & 57344) | i216 | i217 | i36 | (i215 & 234881024) | (i215 & 1879048192));
                        yg40 yg40Var8 = yg40Var5;
                        mm40 mm40VarQ3 = i120.Q(o7k0.e(mm40Var, lej.f19905a), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
                        x5d x5dVarA3 = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                        int iHashCode3 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM3 = fetVar2.m();
                        mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarQ3);
                        mkd.c0.getClass();
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(e7z.u1);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, x5dVarA3, gqw0.x);
                        jpm0.o(fetVar2, bh90VarM3, gqw0.w);
                        jpm0.o(fetVar2, Integer.valueOf(iHashCode3), gqw0.y);
                        jpm0.n(fetVar2);
                        jpm0.o(fetVar2, mm40VarC2, gqw0.v);
                        String str110 = cfjVar2.f4265a;
                        String str111 = cfjVar2.c;
                        ifj ifjVar8 = (ifj) l7m0Var.getValue();
                        am amVar8 = (am) pz40VarO.getValue();
                        zG10 = fetVar2.g(pz40VarO);
                        objP22 = fetVar2.P();
                        if (zG10) {
                            cl5Var2 = cl5Var;
                            if (objP22 == cl5Var2) {
                            }
                            Function1 function15 = (Function1) objP22;
                            zG11 = fetVar2.g(pz40VarO2);
                            objP23 = fetVar2.P();
                            if (zG11) {
                                objP23 = new ca6(pz40VarO2, (byte) 21);
                                fetVar2.o0(objP23);
                            } else {
                                objP23 = new ca6(pz40VarO2, (byte) 21);
                                fetVar2.o0(objP23);
                            }
                            S(str, str110, str111, ifjVar8, z, ulq0Var, amVar8, function15, (Function1) objP23, fetVar2, (i214 & 14) | (i22 & 57344) | i216);
                            String str112 = cfjVar2.b;
                            String str113 = cfjVar2.d;
                            am amVar9 = (am) pz40VarO.getValue();
                            ifj ifjVar9 = (ifj) l7m0Var.getValue();
                            zG12 = fetVar2.g(pz40VarO);
                            objP24 = fetVar2.P();
                            if (zG12) {
                                objP24 = new ca6(pz40VarO, (byte) 22);
                                fetVar2.o0(objP24);
                            } else {
                                objP24 = new ca6(pz40VarO, (byte) 22);
                                fetVar2.o0(objP24);
                            }
                            Function1 function16 = (Function1) objP24;
                            zG13 = fetVar2.g(pz40VarO2);
                            objP25 = fetVar2.P();
                            if (zG13) {
                                objP25 = new ca6(pz40VarO2, (byte) 23);
                                fetVar2.o0(objP25);
                            } else {
                                objP25 = new ca6(pz40VarO2, (byte) 23);
                                fetVar2.o0(objP25);
                            }
                            int i37 = i16 << 3;
                            h(null, str2, str112, str113, locale, z, ulq0Var, amVar9, ifjVar9, jLongValue4, simpleDate12, simpleDateTime3, simpleDateTime8, simpleDateTime, simpleDateTime2, calendar, yg40Var8, j1e0Var3, uts0Var2, function16, (Function1) objP25, fetVar2, 6 | (i16 & 896) | ((i12 << 15) & 458752) | (i214 & 3670016) | (i214 & 29360128), (i37 & 458752) | (i37 & 57344) | 805605952 | i217 | i36);
                            fetVar2 = fetVar2;
                            fetVar2.r(true);
                            yg40Var2 = yg40Var8;
                        } else {
                            cl5Var2 = cl5Var;
                        }
                        objP22 = new ca6(pz40VarO, (byte) 20);
                        fetVar2.o0(objP22);
                        Function1 function17 = (Function1) objP22;
                        zG11 = fetVar2.g(pz40VarO2);
                        objP23 = fetVar2.P();
                        if (zG11) {
                            objP23 = new ca6(pz40VarO2, (byte) 21);
                            fetVar2.o0(objP23);
                        } else {
                            objP23 = new ca6(pz40VarO2, (byte) 21);
                            fetVar2.o0(objP23);
                        }
                        S(str, str110, str111, ifjVar8, z, ulq0Var, amVar8, function17, (Function1) objP23, fetVar2, (i214 & 14) | (i22 & 57344) | i216);
                        String str114 = cfjVar2.b;
                        String str115 = cfjVar2.d;
                        am amVar10 = (am) pz40VarO.getValue();
                        ifj ifjVar10 = (ifj) l7m0Var.getValue();
                        zG12 = fetVar2.g(pz40VarO);
                        objP24 = fetVar2.P();
                        if (zG12) {
                            objP24 = new ca6(pz40VarO, (byte) 22);
                            fetVar2.o0(objP24);
                        } else {
                            objP24 = new ca6(pz40VarO, (byte) 22);
                            fetVar2.o0(objP24);
                        }
                        Function1 function18 = (Function1) objP24;
                        zG13 = fetVar2.g(pz40VarO2);
                        objP25 = fetVar2.P();
                        if (zG13) {
                            objP25 = new ca6(pz40VarO2, (byte) 23);
                            fetVar2.o0(objP25);
                        } else {
                            objP25 = new ca6(pz40VarO2, (byte) 23);
                            fetVar2.o0(objP25);
                        }
                        int i38 = i16 << 3;
                        h(null, str2, str114, str115, locale, z, ulq0Var, amVar10, ifjVar10, jLongValue4, simpleDate12, simpleDateTime3, simpleDateTime8, simpleDateTime, simpleDateTime2, calendar, yg40Var8, j1e0Var3, uts0Var2, function18, (Function1) objP25, fetVar2, 6 | (i16 & 896) | ((i12 << 15) & 458752) | (i214 & 3670016) | (i214 & 29360128), (i38 & 458752) | (i38 & 57344) | 805605952 | i217 | i36);
                        fetVar2 = fetVar2;
                        fetVar2.r(true);
                        yg40Var2 = yg40Var8;
                    } else {
                        locale2 = locale;
                    }
                    i15 = i13;
                    simpleDateTime8 = simpleDateTime4;
                    if ((i15 & 48) == 32) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    objP17 = fetVar2.P();
                    if (z20) {
                        objP17 = new oej(pz40VarF, pz40VarF9, pz40VarF10, pz40VarF2, pz40VarF4, calendar, pz40VarF7, pz40VarF8, pz40VarF3, pz40VarF5, pz40VarF6, pz40VarF11);
                        pz40VarF8 = pz40VarF8;
                        pz40Var = pz40VarF6;
                        pz40Var2 = pz40VarF11;
                        pz40Var3 = pz40VarF5;
                        pz40Var4 = pz40VarF10;
                        pz40VarF3 = pz40VarF3;
                        pz40Var5 = pz40VarF9;
                        pz40VarF4 = pz40VarF4;
                        pz40VarF7 = pz40VarF7;
                        fetVar2.o0(objP17);
                    } else {
                        objP17 = new oej(pz40VarF, pz40VarF9, pz40VarF10, pz40VarF2, pz40VarF4, calendar, pz40VarF7, pz40VarF8, pz40VarF3, pz40VarF5, pz40VarF6, pz40VarF11);
                        pz40VarF8 = pz40VarF8;
                        pz40Var = pz40VarF6;
                        pz40Var2 = pz40VarF11;
                        pz40Var3 = pz40VarF5;
                        pz40Var4 = pz40VarF10;
                        pz40VarF3 = pz40VarF3;
                        pz40Var5 = pz40VarF9;
                        pz40VarF4 = pz40VarF4;
                        pz40VarF7 = pz40VarF7;
                        fetVar2.o0(objP17);
                    }
                    function3 = (Function1) objP17;
                    if (i14 <= 32) {
                    }
                    objP18 = fetVar2.P();
                    if (z21) {
                        pz40 pz40Var11117 = pz40VarF8;
                        pz40 pz40Var212 = pz40VarF4;
                        pz40 pz40Var213 = pz40Var5;
                        pz40 pz40Var214 = pz40VarF7;
                        pz40 pz40Var11118 = pz40VarF3;
                        pz40 pz40Var11119 = pz40Var4;
                        pz40 pz40Var111110 = pz40Var;
                        oej oejVar6 = new oej(pz40VarF, pz40Var213, pz40Var11119, pz40VarF2, pz40Var11118, pz40Var212, calendar, pz40Var214, pz40Var11117, pz40Var111110, pz40Var2, pz40Var3);
                        pz40Var5 = pz40Var213;
                        pz40VarF4 = pz40Var212;
                        pz40VarF8 = pz40Var11117;
                        pz40Var4 = pz40Var11119;
                        pz40VarF3 = pz40Var11118;
                        pz40VarF7 = pz40Var214;
                        pz40Var = pz40Var111110;
                        objP18 = oejVar6;
                        fetVar2.o0(objP18);
                    } else {
                        pz40 pz40Var111111 = pz40VarF8;
                        pz40 pz40Var215 = pz40VarF4;
                        pz40 pz40Var216 = pz40Var5;
                        pz40 pz40Var217 = pz40VarF7;
                        pz40 pz40Var111112 = pz40VarF3;
                        pz40 pz40Var111113 = pz40Var4;
                        pz40 pz40Var111114 = pz40Var;
                        oej oejVar7 = new oej(pz40VarF, pz40Var216, pz40Var111113, pz40VarF2, pz40Var111112, pz40Var215, calendar, pz40Var217, pz40Var111111, pz40Var111114, pz40Var2, pz40Var3);
                        pz40Var5 = pz40Var216;
                        pz40VarF4 = pz40Var215;
                        pz40VarF8 = pz40Var111111;
                        pz40Var4 = pz40Var111113;
                        pz40VarF3 = pz40Var111112;
                        pz40VarF7 = pz40Var217;
                        pz40Var = pz40Var111114;
                        objP18 = oejVar7;
                        fetVar2.o0(objP18);
                    }
                    function4 = (Function1) objP18;
                    if (i14 <= 32) {
                    }
                    objP19 = fetVar2.P();
                    if (z22) {
                        pz40 pz40Var111115 = pz40Var5;
                        pz40 pz40Var111116 = pz40Var;
                        pz40 pz40Var111117 = pz40Var3;
                        pz40 pz40Var1212 = pz40Var2;
                        pz40 pz40Var1213 = pz40Var4;
                        pz40 pz40Var1214 = pz40VarF3;
                        pej pejVar6 = new pej(pz40VarF, pz40VarF4, pz40VarF2, calendar, pz40VarF7, pz40VarF8, pz40Var1214, pz40Var111117, pz40Var111116, pz40Var111115, pz40Var1213, pz40Var1212, (byte) 0);
                        pz40Var3 = pz40Var111117;
                        pz40Var = pz40Var111116;
                        pz40Var5 = pz40Var111115;
                        pz40Var4 = pz40Var1213;
                        pz40Var2 = pz40Var1212;
                        objP19 = pejVar6;
                        pz40VarF2 = pz40VarF2;
                        pz40VarF3 = pz40Var1214;
                        fetVar2.o0(objP19);
                    } else {
                        pz40 pz40Var111118 = pz40Var5;
                        pz40 pz40Var111119 = pz40Var;
                        pz40 pz40Var1111110 = pz40Var3;
                        pz40 pz40Var1215 = pz40Var2;
                        pz40 pz40Var1216 = pz40Var4;
                        pz40 pz40Var1217 = pz40VarF3;
                        pej pejVar7 = new pej(pz40VarF, pz40VarF4, pz40VarF2, calendar, pz40VarF7, pz40VarF8, pz40Var1217, pz40Var1111110, pz40Var111119, pz40Var111118, pz40Var1216, pz40Var1215, (byte) 0);
                        pz40Var3 = pz40Var1111110;
                        pz40Var = pz40Var111119;
                        pz40Var5 = pz40Var111118;
                        pz40Var4 = pz40Var1216;
                        pz40Var2 = pz40Var1215;
                        objP19 = pejVar7;
                        pz40VarF2 = pz40VarF2;
                        pz40VarF3 = pz40Var1217;
                        fetVar2.o0(objP19);
                    }
                    function5 = (Function2) objP19;
                    if (i14 <= 32) {
                    }
                    objP20 = fetVar2.P();
                    if (z23) {
                        objP20 = new pej(pz40VarF, pz40VarF4, pz40VarF3, calendar, pz40VarF7, pz40VarF8, pz40VarF2, pz40Var, pz40Var5, pz40Var4, pz40Var2, pz40Var3, (byte) 1);
                        fetVar2.o0(objP20);
                    } else {
                        objP20 = new pej(pz40VarF, pz40VarF4, pz40VarF3, calendar, pz40VarF7, pz40VarF8, pz40VarF2, pz40Var, pz40Var5, pz40Var4, pz40Var2, pz40Var3, (byte) 1);
                        fetVar2.o0(objP20);
                    }
                    function6 = (Function2) objP20;
                    objP21 = fetVar2.P();
                    if (objP21 == cl5Var) {
                        objP21 = new j1e0(function3, function4, function5, function6);
                        fetVar2.o0(objP21);
                    }
                    j1e0 j1e0Var4 = (j1e0) objP21;
                    int i218 = i12 << 12;
                    int i219 = i22 & 458752;
                    int i2110 = i22 & 3670016;
                    int i39 = i218 & 29360128;
                    F(simpleDateTime5, simpleDateTime6, simpleDateTime3, simpleDateTime8, locale2, ulq0Var, calendar, yg40Var5, function1, function2, fetVar2, i23 | 4608 | (i218 & 57344) | i219 | i2110 | i39 | (i218 & 234881024) | (i218 & 1879048192));
                    yg40 yg40Var9 = yg40Var5;
                    mm40 mm40VarQ4 = i120.Q(o7k0.e(mm40Var, lej.f19905a), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
                    x5d x5dVarA4 = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                    int iHashCode4 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM4 = fetVar2.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarQ4);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(e7z.u1);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA4, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM4, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode4), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC3, gqw0.v);
                    String str116 = cfjVar2.f4265a;
                    String str117 = cfjVar2.c;
                    ifj ifjVar11 = (ifj) l7m0Var.getValue();
                    am amVar11 = (am) pz40VarO.getValue();
                    zG10 = fetVar2.g(pz40VarO);
                    objP22 = fetVar2.P();
                    if (zG10) {
                        cl5Var2 = cl5Var;
                        if (objP22 == cl5Var2) {
                        }
                        Function1 function19 = (Function1) objP22;
                        zG11 = fetVar2.g(pz40VarO2);
                        objP23 = fetVar2.P();
                        if (zG11) {
                            objP23 = new ca6(pz40VarO2, (byte) 21);
                            fetVar2.o0(objP23);
                        } else {
                            objP23 = new ca6(pz40VarO2, (byte) 21);
                            fetVar2.o0(objP23);
                        }
                        S(str, str116, str117, ifjVar11, z, ulq0Var, amVar11, function19, (Function1) objP23, fetVar2, (i214 & 14) | (i22 & 57344) | i219);
                        String str118 = cfjVar2.b;
                        String str119 = cfjVar2.d;
                        am amVar12 = (am) pz40VarO.getValue();
                        ifj ifjVar12 = (ifj) l7m0Var.getValue();
                        zG12 = fetVar2.g(pz40VarO);
                        objP24 = fetVar2.P();
                        if (zG12) {
                            objP24 = new ca6(pz40VarO, (byte) 22);
                            fetVar2.o0(objP24);
                        } else {
                            objP24 = new ca6(pz40VarO, (byte) 22);
                            fetVar2.o0(objP24);
                        }
                        Function1 function110 = (Function1) objP24;
                        zG13 = fetVar2.g(pz40VarO2);
                        objP25 = fetVar2.P();
                        if (zG13) {
                            objP25 = new ca6(pz40VarO2, (byte) 23);
                            fetVar2.o0(objP25);
                        } else {
                            objP25 = new ca6(pz40VarO2, (byte) 23);
                            fetVar2.o0(objP25);
                        }
                        int i310 = i16 << 3;
                        h(null, str2, str118, str119, locale, z, ulq0Var, amVar12, ifjVar12, jLongValue4, simpleDate12, simpleDateTime3, simpleDateTime8, simpleDateTime, simpleDateTime2, calendar, yg40Var9, j1e0Var4, uts0Var2, function110, (Function1) objP25, fetVar2, 6 | (i16 & 896) | ((i12 << 15) & 458752) | (i214 & 3670016) | (i214 & 29360128), (i310 & 458752) | (i310 & 57344) | 805605952 | i2110 | i39);
                        fetVar2 = fetVar2;
                        fetVar2.r(true);
                        yg40Var2 = yg40Var9;
                    } else {
                        cl5Var2 = cl5Var;
                    }
                    objP22 = new ca6(pz40VarO, (byte) 20);
                    fetVar2.o0(objP22);
                    Function1 function111 = (Function1) objP22;
                    zG11 = fetVar2.g(pz40VarO2);
                    objP23 = fetVar2.P();
                    if (zG11) {
                        objP23 = new ca6(pz40VarO2, (byte) 21);
                        fetVar2.o0(objP23);
                    } else {
                        objP23 = new ca6(pz40VarO2, (byte) 21);
                        fetVar2.o0(objP23);
                    }
                    S(str, str116, str117, ifjVar11, z, ulq0Var, amVar11, function111, (Function1) objP23, fetVar2, (i214 & 14) | (i22 & 57344) | i219);
                    String str1110 = cfjVar2.b;
                    String str1111 = cfjVar2.d;
                    am amVar13 = (am) pz40VarO.getValue();
                    ifj ifjVar13 = (ifj) l7m0Var.getValue();
                    zG12 = fetVar2.g(pz40VarO);
                    objP24 = fetVar2.P();
                    if (zG12) {
                        objP24 = new ca6(pz40VarO, (byte) 22);
                        fetVar2.o0(objP24);
                    } else {
                        objP24 = new ca6(pz40VarO, (byte) 22);
                        fetVar2.o0(objP24);
                    }
                    Function1 function112 = (Function1) objP24;
                    zG13 = fetVar2.g(pz40VarO2);
                    objP25 = fetVar2.P();
                    if (zG13) {
                        objP25 = new ca6(pz40VarO2, (byte) 23);
                        fetVar2.o0(objP25);
                    } else {
                        objP25 = new ca6(pz40VarO2, (byte) 23);
                        fetVar2.o0(objP25);
                    }
                    int i311 = i16 << 3;
                    h(null, str2, str1110, str1111, locale, z, ulq0Var, amVar13, ifjVar13, jLongValue4, simpleDate12, simpleDateTime3, simpleDateTime8, simpleDateTime, simpleDateTime2, calendar, yg40Var9, j1e0Var4, uts0Var2, function112, (Function1) objP25, fetVar2, 6 | (i16 & 896) | ((i12 << 15) & 458752) | (i214 & 3670016) | (i214 & 29360128), (i311 & 458752) | (i311 & 57344) | 805605952 | i2110 | i39);
                    fetVar2 = fetVar2;
                    fetVar2.r(true);
                    yg40Var2 = yg40Var9;
                } else {
                    simpleDateTime5 = simpleDateTime;
                }
                if ((i8 & 6) == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zG4 = z14 | fetVar2.g(dateFormat);
                objP10 = fetVar2.P();
                if (zG4) {
                    simpleDate3 = simpleDate5;
                    wdx.J(simpleDate3, calendar);
                    objP10 = dateFormat.format(calendar.getTime());
                    fetVar2.o0(objP10);
                } else {
                    simpleDate3 = simpleDate5;
                    wdx.J(simpleDate3, calendar);
                    objP10 = dateFormat.format(calendar.getTime());
                    fetVar2.o0(objP10);
                }
                str4 = (String) objP10;
                i10 = (i8 & 112) ^ 48;
                if (i10 > 32) {
                    simpleDateTime6 = simpleDateTime2;
                    if (!fetVar2.g(simpleDateTime6)) {
                        i11 = i20;
                    }
                    z15 = true;
                    zG5 = z15 | fetVar2.g(dateFormat);
                    objP11 = fetVar2.P();
                    if (zG5) {
                        simpleDate4 = simpleDate6;
                        wdx.J(simpleDate4, calendar);
                        objP11 = dateFormat.format(calendar.getTime());
                        fetVar2.o0(objP11);
                    } else {
                        simpleDate4 = simpleDate6;
                        wdx.J(simpleDate4, calendar);
                        objP11 = dateFormat.format(calendar.getTime());
                        fetVar2.o0(objP11);
                    }
                    str5 = (String) objP11;
                    zG6 = ((i9 <= 4 && fetVar2.g(simpleDateTime5)) || (i8 & 6) == 4) | fetVar2.g(dateFormat2);
                    objP12 = fetVar2.P();
                    if (zG6) {
                        wdx.I(simpleDateTime5, calendar);
                        objP12 = dateFormat2.format(calendar.getTime());
                        fetVar2.o0(objP12);
                    } else {
                        wdx.I(simpleDateTime5, calendar);
                        objP12 = dateFormat2.format(calendar.getTime());
                        fetVar2.o0(objP12);
                    }
                    str6 = (String) objP12;
                    zG7 = ((i10 <= 32 && fetVar2.g(simpleDateTime6)) || (i8 & 48) == 32) | fetVar2.g(dateFormat2);
                    objP13 = fetVar2.P();
                    if (zG7) {
                        wdx.I(simpleDateTime6, calendar);
                        objP13 = dateFormat2.format(calendar.getTime());
                        fetVar2.o0(objP13);
                    } else {
                        wdx.I(simpleDateTime6, calendar);
                        objP13 = dateFormat2.format(calendar.getTime());
                        fetVar2.o0(objP13);
                    }
                    str7 = (String) objP13;
                    zG8 = fetVar2.g(str4) | fetVar2.g(str5) | fetVar2.g(str6) | fetVar2.g(str7);
                    objP14 = fetVar2.P();
                    if (zG8) {
                        str4.getClass();
                        str5.getClass();
                        str6.getClass();
                        str7.getClass();
                        objP14 = new cfj(str4, str5, str6, str7);
                        fetVar2.o0(objP14);
                    } else {
                        str4.getClass();
                        str5.getClass();
                        str6.getClass();
                        str7.getClass();
                        objP14 = new cfj(str4, str5, str6, str7);
                        fetVar2.o0(objP14);
                    }
                    cfj cfjVar3 = (cfj) objP14;
                    amVar = (am) pz40VarO.getValue();
                    int i2111 = i16 >> 6;
                    zG9 = fetVar2.g(simpleDate4) | fetVar2.e(amVar.ordinal()) | fetVar2.g(simpleDate3) | fetVar2.g(calendar);
                    objP15 = fetVar2.P();
                    if (zG9) {
                        iOrdinal3 = amVar.ordinal();
                        if (iOrdinal3 == 0) {
                            simpleDateTime7 = simpleDateTime5;
                        } else {
                            if (iOrdinal3 != 1) {
                                t9f.b();
                                return;
                            }
                            simpleDateTime7 = simpleDateTime6;
                        }
                        wdx.J(simpleDateTime7.f47285a, calendar);
                        objP15 = Long.valueOf(calendar.getTimeInMillis());
                        fetVar2.o0(objP15);
                    } else {
                        iOrdinal3 = amVar.ordinal();
                        if (iOrdinal3 == 0) {
                            simpleDateTime7 = simpleDateTime5;
                        } else {
                            if (iOrdinal3 != 1) {
                                t9f.b();
                                return;
                            }
                            simpleDateTime7 = simpleDateTime6;
                        }
                        wdx.J(simpleDateTime7.f47285a, calendar);
                        objP15 = Long.valueOf(calendar.getTimeInMillis());
                        fetVar2.o0(objP15);
                    }
                    long jLongValue5 = ((Number) objP15).longValue();
                    SimpleDate simpleDate13 = simpleDateTime3.f47285a;
                    SimpleDate simpleDate14 = simpleDateTime4.f47285a;
                    if ((i16 & 7168) != 2048) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    boolean zG110 = fetVar2.g(simpleDate13) | z16 | fetVar2.g(simpleDate14);
                    if (i7 == 67108864) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean zG111 = zG110 | z17 | fetVar2.g(calendar);
                    i12 = i11;
                    if ((i12 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zG111 | z18;
                    Object objP28 = fetVar2.P();
                    if (z19) {
                        iOrdinal4 = ulq0Var.ordinal();
                        if (iOrdinal4 == 0) {
                            yg40Var5 = yg40Var4;
                            simpleDateTimeH0 = h0(simpleDateTime5, calendar, yg40Var5, 1);
                        } else if (iOrdinal4 != 1) {
                            t9f.b();
                            return;
                        } else {
                            yg40Var5 = yg40Var4;
                            simpleDateTimeH0 = simpleDateTime5;
                        }
                        objV = bsr0.V(simpleDateTimeH0.f47285a, simpleDateTime3.f47285a, simpleDateTime4.f47285a);
                        fetVar2.o0(objV);
                    } else {
                        iOrdinal4 = ulq0Var.ordinal();
                        if (iOrdinal4 == 0) {
                            yg40Var5 = yg40Var4;
                            simpleDateTimeH0 = h0(simpleDateTime5, calendar, yg40Var5, 1);
                        } else if (iOrdinal4 != 1) {
                            t9f.b();
                            return;
                        } else {
                            yg40Var5 = yg40Var4;
                            simpleDateTimeH0 = simpleDateTime5;
                        }
                        objV = bsr0.V(simpleDateTimeH0.f47285a, simpleDateTime3.f47285a, simpleDateTime4.f47285a);
                        fetVar2.o0(objV);
                    }
                    SimpleDate simpleDate15 = (SimpleDate) objV;
                    objP16 = fetVar2.P();
                    if (objP16 == cl5Var) {
                        objP16 = ro4.m0(220, 0, ihn.f14788a, 2);
                        fetVar2.o0(objP16);
                    }
                    uts0 uts0Var3 = (uts0) objP16;
                    int i2112 = i16 >> 3;
                    i13 = (i2112 & 896) | (i24 & 14) | ((i12 << 3) & 112) | 512 | 4096 | (i2112 & 7168) | (i2111 & 3670016) | (i2111 & 29360128) | 1207959552;
                    pz40VarF = androidx.compose.runtime.e.f(Boolean.valueOf(z), fetVar2);
                    pz40VarF2 = androidx.compose.runtime.e.f(simpleDateTime5, fetVar2);
                    pz40VarF3 = androidx.compose.runtime.e.f(simpleDateTime6, fetVar2);
                    pz40VarF4 = androidx.compose.runtime.e.f(ulq0Var, fetVar2);
                    pz40VarF5 = androidx.compose.runtime.e.f(function1, fetVar2);
                    pz40VarF6 = androidx.compose.runtime.e.f(function2, fetVar);
                    pz40VarF7 = androidx.compose.runtime.e.f(Long.valueOf(jLongValue), fetVar2);
                    pz40VarF8 = androidx.compose.runtime.e.f(Long.valueOf(jLongValue2), fetVar2);
                    pz40VarF9 = androidx.compose.runtime.e.f(simpleDateTime3, fetVar2);
                    pz40VarF10 = androidx.compose.runtime.e.f(simpleDateTime4, fetVar2);
                    pz40VarF11 = androidx.compose.runtime.e.f(yg40Var5, fetVar2);
                    i14 = (i13 & 112) ^ 48;
                    if (i14 > 32) {
                        locale2 = locale;
                        if (!fetVar2.g(locale2)) {
                            i15 = i13;
                            simpleDateTime8 = simpleDateTime4;
                        }
                        z20 = true;
                        objP17 = fetVar2.P();
                        if (z20) {
                            objP17 = new oej(pz40VarF, pz40VarF9, pz40VarF10, pz40VarF2, pz40VarF4, calendar, pz40VarF7, pz40VarF8, pz40VarF3, pz40VarF5, pz40VarF6, pz40VarF11);
                            pz40VarF8 = pz40VarF8;
                            pz40Var = pz40VarF6;
                            pz40Var2 = pz40VarF11;
                            pz40Var3 = pz40VarF5;
                            pz40Var4 = pz40VarF10;
                            pz40VarF3 = pz40VarF3;
                            pz40Var5 = pz40VarF9;
                            pz40VarF4 = pz40VarF4;
                            pz40VarF7 = pz40VarF7;
                            fetVar2.o0(objP17);
                        } else {
                            objP17 = new oej(pz40VarF, pz40VarF9, pz40VarF10, pz40VarF2, pz40VarF4, calendar, pz40VarF7, pz40VarF8, pz40VarF3, pz40VarF5, pz40VarF6, pz40VarF11);
                            pz40VarF8 = pz40VarF8;
                            pz40Var = pz40VarF6;
                            pz40Var2 = pz40VarF11;
                            pz40Var3 = pz40VarF5;
                            pz40Var4 = pz40VarF10;
                            pz40VarF3 = pz40VarF3;
                            pz40Var5 = pz40VarF9;
                            pz40VarF4 = pz40VarF4;
                            pz40VarF7 = pz40VarF7;
                            fetVar2.o0(objP17);
                        }
                        function3 = (Function1) objP17;
                        if (i14 <= 32) {
                        }
                        objP18 = fetVar2.P();
                        if (z21) {
                            pz40 pz40Var1111111 = pz40VarF8;
                            pz40 pz40Var218 = pz40VarF4;
                            pz40 pz40Var219 = pz40Var5;
                            pz40 pz40Var2110 = pz40VarF7;
                            pz40 pz40Var1111112 = pz40VarF3;
                            pz40 pz40Var1111113 = pz40Var4;
                            pz40 pz40Var1111114 = pz40Var;
                            oej oejVar8 = new oej(pz40VarF, pz40Var219, pz40Var1111113, pz40VarF2, pz40Var1111112, pz40Var218, calendar, pz40Var2110, pz40Var1111111, pz40Var1111114, pz40Var2, pz40Var3);
                            pz40Var5 = pz40Var219;
                            pz40VarF4 = pz40Var218;
                            pz40VarF8 = pz40Var1111111;
                            pz40Var4 = pz40Var1111113;
                            pz40VarF3 = pz40Var1111112;
                            pz40VarF7 = pz40Var2110;
                            pz40Var = pz40Var1111114;
                            objP18 = oejVar8;
                            fetVar2.o0(objP18);
                        } else {
                            pz40 pz40Var1111115 = pz40VarF8;
                            pz40 pz40Var2111 = pz40VarF4;
                            pz40 pz40Var2112 = pz40Var5;
                            pz40 pz40Var2113 = pz40VarF7;
                            pz40 pz40Var1111116 = pz40VarF3;
                            pz40 pz40Var1111117 = pz40Var4;
                            pz40 pz40Var1111118 = pz40Var;
                            oej oejVar9 = new oej(pz40VarF, pz40Var2112, pz40Var1111117, pz40VarF2, pz40Var1111116, pz40Var2111, calendar, pz40Var2113, pz40Var1111115, pz40Var1111118, pz40Var2, pz40Var3);
                            pz40Var5 = pz40Var2112;
                            pz40VarF4 = pz40Var2111;
                            pz40VarF8 = pz40Var1111115;
                            pz40Var4 = pz40Var1111117;
                            pz40VarF3 = pz40Var1111116;
                            pz40VarF7 = pz40Var2113;
                            pz40Var = pz40Var1111118;
                            objP18 = oejVar9;
                            fetVar2.o0(objP18);
                        }
                        function4 = (Function1) objP18;
                        if (i14 <= 32) {
                        }
                        objP19 = fetVar2.P();
                        if (z22) {
                            pz40 pz40Var1111119 = pz40Var5;
                            pz40 pz40Var1111120 = pz40Var;
                            pz40 pz40Var11111110 = pz40Var3;
                            pz40 pz40Var1218 = pz40Var2;
                            pz40 pz40Var1219 = pz40Var4;
                            pz40 pz40Var12110 = pz40VarF3;
                            pej pejVar8 = new pej(pz40VarF, pz40VarF4, pz40VarF2, calendar, pz40VarF7, pz40VarF8, pz40Var12110, pz40Var11111110, pz40Var1111120, pz40Var1111119, pz40Var1219, pz40Var1218, (byte) 0);
                            pz40Var3 = pz40Var11111110;
                            pz40Var = pz40Var1111120;
                            pz40Var5 = pz40Var1111119;
                            pz40Var4 = pz40Var1219;
                            pz40Var2 = pz40Var1218;
                            objP19 = pejVar8;
                            pz40VarF2 = pz40VarF2;
                            pz40VarF3 = pz40Var12110;
                            fetVar2.o0(objP19);
                        } else {
                            pz40 pz40Var11111111 = pz40Var5;
                            pz40 pz40Var1111121 = pz40Var;
                            pz40 pz40Var11111112 = pz40Var3;
                            pz40 pz40Var12111 = pz40Var2;
                            pz40 pz40Var12112 = pz40Var4;
                            pz40 pz40Var12113 = pz40VarF3;
                            pej pejVar9 = new pej(pz40VarF, pz40VarF4, pz40VarF2, calendar, pz40VarF7, pz40VarF8, pz40Var12113, pz40Var11111112, pz40Var1111121, pz40Var11111111, pz40Var12112, pz40Var12111, (byte) 0);
                            pz40Var3 = pz40Var11111112;
                            pz40Var = pz40Var1111121;
                            pz40Var5 = pz40Var11111111;
                            pz40Var4 = pz40Var12112;
                            pz40Var2 = pz40Var12111;
                            objP19 = pejVar9;
                            pz40VarF2 = pz40VarF2;
                            pz40VarF3 = pz40Var12113;
                            fetVar2.o0(objP19);
                        }
                        function5 = (Function2) objP19;
                        if (i14 <= 32) {
                        }
                        objP20 = fetVar2.P();
                        if (z23) {
                            objP20 = new pej(pz40VarF, pz40VarF4, pz40VarF3, calendar, pz40VarF7, pz40VarF8, pz40VarF2, pz40Var, pz40Var5, pz40Var4, pz40Var2, pz40Var3, (byte) 1);
                            fetVar2.o0(objP20);
                        } else {
                            objP20 = new pej(pz40VarF, pz40VarF4, pz40VarF3, calendar, pz40VarF7, pz40VarF8, pz40VarF2, pz40Var, pz40Var5, pz40Var4, pz40Var2, pz40Var3, (byte) 1);
                            fetVar2.o0(objP20);
                        }
                        function6 = (Function2) objP20;
                        objP21 = fetVar2.P();
                        if (objP21 == cl5Var) {
                            objP21 = new j1e0(function3, function4, function5, function6);
                            fetVar2.o0(objP21);
                        }
                        j1e0 j1e0Var5 = (j1e0) objP21;
                        int i2113 = i12 << 12;
                        int i2114 = i22 & 458752;
                        int i2115 = i22 & 3670016;
                        int i312 = i2113 & 29360128;
                        F(simpleDateTime5, simpleDateTime6, simpleDateTime3, simpleDateTime8, locale2, ulq0Var, calendar, yg40Var5, function1, function2, fetVar2, i23 | 4608 | (i2113 & 57344) | i2114 | i2115 | i312 | (i2113 & 234881024) | (i2113 & 1879048192));
                        yg40 yg40Var10 = yg40Var5;
                        mm40 mm40VarQ5 = i120.Q(o7k0.e(mm40Var, lej.f19905a), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
                        x5d x5dVarA5 = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                        int iHashCode5 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM5 = fetVar2.m();
                        mm40 mm40VarC4 = kbc.c0(fetVar2, mm40VarQ5);
                        mkd.c0.getClass();
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(e7z.u1);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, x5dVarA5, gqw0.x);
                        jpm0.o(fetVar2, bh90VarM5, gqw0.w);
                        jpm0.o(fetVar2, Integer.valueOf(iHashCode5), gqw0.y);
                        jpm0.n(fetVar2);
                        jpm0.o(fetVar2, mm40VarC4, gqw0.v);
                        String str1112 = cfjVar3.f4265a;
                        String str1113 = cfjVar3.c;
                        ifj ifjVar14 = (ifj) l7m0Var.getValue();
                        am amVar14 = (am) pz40VarO.getValue();
                        zG10 = fetVar2.g(pz40VarO);
                        objP22 = fetVar2.P();
                        if (zG10) {
                            cl5Var2 = cl5Var;
                            if (objP22 == cl5Var2) {
                            }
                            Function1 function113 = (Function1) objP22;
                            zG11 = fetVar2.g(pz40VarO2);
                            objP23 = fetVar2.P();
                            if (zG11) {
                                objP23 = new ca6(pz40VarO2, (byte) 21);
                                fetVar2.o0(objP23);
                            } else {
                                objP23 = new ca6(pz40VarO2, (byte) 21);
                                fetVar2.o0(objP23);
                            }
                            S(str, str1112, str1113, ifjVar14, z, ulq0Var, amVar14, function113, (Function1) objP23, fetVar2, (i2112 & 14) | (i22 & 57344) | i2114);
                            String str1114 = cfjVar3.b;
                            String str1115 = cfjVar3.d;
                            am amVar15 = (am) pz40VarO.getValue();
                            ifj ifjVar15 = (ifj) l7m0Var.getValue();
                            zG12 = fetVar2.g(pz40VarO);
                            objP24 = fetVar2.P();
                            if (zG12) {
                                objP24 = new ca6(pz40VarO, (byte) 22);
                                fetVar2.o0(objP24);
                            } else {
                                objP24 = new ca6(pz40VarO, (byte) 22);
                                fetVar2.o0(objP24);
                            }
                            Function1 function114 = (Function1) objP24;
                            zG13 = fetVar2.g(pz40VarO2);
                            objP25 = fetVar2.P();
                            if (zG13) {
                                objP25 = new ca6(pz40VarO2, (byte) 23);
                                fetVar2.o0(objP25);
                            } else {
                                objP25 = new ca6(pz40VarO2, (byte) 23);
                                fetVar2.o0(objP25);
                            }
                            int i313 = i16 << 3;
                            h(null, str2, str1114, str1115, locale, z, ulq0Var, amVar15, ifjVar15, jLongValue5, simpleDate15, simpleDateTime3, simpleDateTime8, simpleDateTime, simpleDateTime2, calendar, yg40Var10, j1e0Var5, uts0Var3, function114, (Function1) objP25, fetVar2, 6 | (i16 & 896) | ((i12 << 15) & 458752) | (i2112 & 3670016) | (i2112 & 29360128), (i313 & 458752) | (i313 & 57344) | 805605952 | i2115 | i312);
                            fetVar2 = fetVar2;
                            fetVar2.r(true);
                            yg40Var2 = yg40Var10;
                        } else {
                            cl5Var2 = cl5Var;
                        }
                        objP22 = new ca6(pz40VarO, (byte) 20);
                        fetVar2.o0(objP22);
                        Function1 function115 = (Function1) objP22;
                        zG11 = fetVar2.g(pz40VarO2);
                        objP23 = fetVar2.P();
                        if (zG11) {
                            objP23 = new ca6(pz40VarO2, (byte) 21);
                            fetVar2.o0(objP23);
                        } else {
                            objP23 = new ca6(pz40VarO2, (byte) 21);
                            fetVar2.o0(objP23);
                        }
                        S(str, str1112, str1113, ifjVar14, z, ulq0Var, amVar14, function115, (Function1) objP23, fetVar2, (i2112 & 14) | (i22 & 57344) | i2114);
                        String str1116 = cfjVar3.b;
                        String str1117 = cfjVar3.d;
                        am amVar16 = (am) pz40VarO.getValue();
                        ifj ifjVar16 = (ifj) l7m0Var.getValue();
                        zG12 = fetVar2.g(pz40VarO);
                        objP24 = fetVar2.P();
                        if (zG12) {
                            objP24 = new ca6(pz40VarO, (byte) 22);
                            fetVar2.o0(objP24);
                        } else {
                            objP24 = new ca6(pz40VarO, (byte) 22);
                            fetVar2.o0(objP24);
                        }
                        Function1 function116 = (Function1) objP24;
                        zG13 = fetVar2.g(pz40VarO2);
                        objP25 = fetVar2.P();
                        if (zG13) {
                            objP25 = new ca6(pz40VarO2, (byte) 23);
                            fetVar2.o0(objP25);
                        } else {
                            objP25 = new ca6(pz40VarO2, (byte) 23);
                            fetVar2.o0(objP25);
                        }
                        int i314 = i16 << 3;
                        h(null, str2, str1116, str1117, locale, z, ulq0Var, amVar16, ifjVar16, jLongValue5, simpleDate15, simpleDateTime3, simpleDateTime8, simpleDateTime, simpleDateTime2, calendar, yg40Var10, j1e0Var5, uts0Var3, function116, (Function1) objP25, fetVar2, 6 | (i16 & 896) | ((i12 << 15) & 458752) | (i2112 & 3670016) | (i2112 & 29360128), (i314 & 458752) | (i314 & 57344) | 805605952 | i2115 | i312);
                        fetVar2 = fetVar2;
                        fetVar2.r(true);
                        yg40Var2 = yg40Var10;
                    } else {
                        locale2 = locale;
                    }
                    i15 = i13;
                    simpleDateTime8 = simpleDateTime4;
                    if ((i15 & 48) == 32) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    objP17 = fetVar2.P();
                    if (z20) {
                        objP17 = new oej(pz40VarF, pz40VarF9, pz40VarF10, pz40VarF2, pz40VarF4, calendar, pz40VarF7, pz40VarF8, pz40VarF3, pz40VarF5, pz40VarF6, pz40VarF11);
                        pz40VarF8 = pz40VarF8;
                        pz40Var = pz40VarF6;
                        pz40Var2 = pz40VarF11;
                        pz40Var3 = pz40VarF5;
                        pz40Var4 = pz40VarF10;
                        pz40VarF3 = pz40VarF3;
                        pz40Var5 = pz40VarF9;
                        pz40VarF4 = pz40VarF4;
                        pz40VarF7 = pz40VarF7;
                        fetVar2.o0(objP17);
                    } else {
                        objP17 = new oej(pz40VarF, pz40VarF9, pz40VarF10, pz40VarF2, pz40VarF4, calendar, pz40VarF7, pz40VarF8, pz40VarF3, pz40VarF5, pz40VarF6, pz40VarF11);
                        pz40VarF8 = pz40VarF8;
                        pz40Var = pz40VarF6;
                        pz40Var2 = pz40VarF11;
                        pz40Var3 = pz40VarF5;
                        pz40Var4 = pz40VarF10;
                        pz40VarF3 = pz40VarF3;
                        pz40Var5 = pz40VarF9;
                        pz40VarF4 = pz40VarF4;
                        pz40VarF7 = pz40VarF7;
                        fetVar2.o0(objP17);
                    }
                    function3 = (Function1) objP17;
                    if (i14 <= 32) {
                    }
                    objP18 = fetVar2.P();
                    if (z21) {
                        pz40 pz40Var11111113 = pz40VarF8;
                        pz40 pz40Var2114 = pz40VarF4;
                        pz40 pz40Var2115 = pz40Var5;
                        pz40 pz40Var2116 = pz40VarF7;
                        pz40 pz40Var11111114 = pz40VarF3;
                        pz40 pz40Var11111115 = pz40Var4;
                        pz40 pz40Var11111116 = pz40Var;
                        oej oejVar10 = new oej(pz40VarF, pz40Var2115, pz40Var11111115, pz40VarF2, pz40Var11111114, pz40Var2114, calendar, pz40Var2116, pz40Var11111113, pz40Var11111116, pz40Var2, pz40Var3);
                        pz40Var5 = pz40Var2115;
                        pz40VarF4 = pz40Var2114;
                        pz40VarF8 = pz40Var11111113;
                        pz40Var4 = pz40Var11111115;
                        pz40VarF3 = pz40Var11111114;
                        pz40VarF7 = pz40Var2116;
                        pz40Var = pz40Var11111116;
                        objP18 = oejVar10;
                        fetVar2.o0(objP18);
                    } else {
                        pz40 pz40Var11111117 = pz40VarF8;
                        pz40 pz40Var2117 = pz40VarF4;
                        pz40 pz40Var2118 = pz40Var5;
                        pz40 pz40Var2119 = pz40VarF7;
                        pz40 pz40Var11111118 = pz40VarF3;
                        pz40 pz40Var11111119 = pz40Var4;
                        pz40 pz40Var111111110 = pz40Var;
                        oej oejVar11 = new oej(pz40VarF, pz40Var2118, pz40Var11111119, pz40VarF2, pz40Var11111118, pz40Var2117, calendar, pz40Var2119, pz40Var11111117, pz40Var111111110, pz40Var2, pz40Var3);
                        pz40Var5 = pz40Var2118;
                        pz40VarF4 = pz40Var2117;
                        pz40VarF8 = pz40Var11111117;
                        pz40Var4 = pz40Var11111119;
                        pz40VarF3 = pz40Var11111118;
                        pz40VarF7 = pz40Var2119;
                        pz40Var = pz40Var111111110;
                        objP18 = oejVar11;
                        fetVar2.o0(objP18);
                    }
                    function4 = (Function1) objP18;
                    if (i14 <= 32) {
                    }
                    objP19 = fetVar2.P();
                    if (z22) {
                        pz40 pz40Var111111111 = pz40Var5;
                        pz40 pz40Var1111122 = pz40Var;
                        pz40 pz40Var111111112 = pz40Var3;
                        pz40 pz40Var12114 = pz40Var2;
                        pz40 pz40Var12115 = pz40Var4;
                        pz40 pz40Var12116 = pz40VarF3;
                        pej pejVar10 = new pej(pz40VarF, pz40VarF4, pz40VarF2, calendar, pz40VarF7, pz40VarF8, pz40Var12116, pz40Var111111112, pz40Var1111122, pz40Var111111111, pz40Var12115, pz40Var12114, (byte) 0);
                        pz40Var3 = pz40Var111111112;
                        pz40Var = pz40Var1111122;
                        pz40Var5 = pz40Var111111111;
                        pz40Var4 = pz40Var12115;
                        pz40Var2 = pz40Var12114;
                        objP19 = pejVar10;
                        pz40VarF2 = pz40VarF2;
                        pz40VarF3 = pz40Var12116;
                        fetVar2.o0(objP19);
                    } else {
                        pz40 pz40Var111111113 = pz40Var5;
                        pz40 pz40Var1111123 = pz40Var;
                        pz40 pz40Var111111114 = pz40Var3;
                        pz40 pz40Var12117 = pz40Var2;
                        pz40 pz40Var12118 = pz40Var4;
                        pz40 pz40Var12119 = pz40VarF3;
                        pej pejVar11 = new pej(pz40VarF, pz40VarF4, pz40VarF2, calendar, pz40VarF7, pz40VarF8, pz40Var12119, pz40Var111111114, pz40Var1111123, pz40Var111111113, pz40Var12118, pz40Var12117, (byte) 0);
                        pz40Var3 = pz40Var111111114;
                        pz40Var = pz40Var1111123;
                        pz40Var5 = pz40Var111111113;
                        pz40Var4 = pz40Var12118;
                        pz40Var2 = pz40Var12117;
                        objP19 = pejVar11;
                        pz40VarF2 = pz40VarF2;
                        pz40VarF3 = pz40Var12119;
                        fetVar2.o0(objP19);
                    }
                    function5 = (Function2) objP19;
                    if (i14 <= 32) {
                    }
                    objP20 = fetVar2.P();
                    if (z23) {
                        objP20 = new pej(pz40VarF, pz40VarF4, pz40VarF3, calendar, pz40VarF7, pz40VarF8, pz40VarF2, pz40Var, pz40Var5, pz40Var4, pz40Var2, pz40Var3, (byte) 1);
                        fetVar2.o0(objP20);
                    } else {
                        objP20 = new pej(pz40VarF, pz40VarF4, pz40VarF3, calendar, pz40VarF7, pz40VarF8, pz40VarF2, pz40Var, pz40Var5, pz40Var4, pz40Var2, pz40Var3, (byte) 1);
                        fetVar2.o0(objP20);
                    }
                    function6 = (Function2) objP20;
                    objP21 = fetVar2.P();
                    if (objP21 == cl5Var) {
                        objP21 = new j1e0(function3, function4, function5, function6);
                        fetVar2.o0(objP21);
                    }
                    j1e0 j1e0Var6 = (j1e0) objP21;
                    int i2116 = i12 << 12;
                    int i2117 = i22 & 458752;
                    int i2118 = i22 & 3670016;
                    int i315 = i2116 & 29360128;
                    F(simpleDateTime5, simpleDateTime6, simpleDateTime3, simpleDateTime8, locale2, ulq0Var, calendar, yg40Var5, function1, function2, fetVar2, i23 | 4608 | (i2116 & 57344) | i2117 | i2118 | i315 | (i2116 & 234881024) | (i2116 & 1879048192));
                    yg40 yg40Var11 = yg40Var5;
                    mm40 mm40VarQ6 = i120.Q(o7k0.e(mm40Var, lej.f19905a), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
                    x5d x5dVarA6 = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                    int iHashCode6 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM6 = fetVar2.m();
                    mm40 mm40VarC5 = kbc.c0(fetVar2, mm40VarQ6);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(e7z.u1);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA6, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM6, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode6), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC5, gqw0.v);
                    String str1118 = cfjVar3.f4265a;
                    String str1119 = cfjVar3.c;
                    ifj ifjVar17 = (ifj) l7m0Var.getValue();
                    am amVar17 = (am) pz40VarO.getValue();
                    zG10 = fetVar2.g(pz40VarO);
                    objP22 = fetVar2.P();
                    if (zG10) {
                        cl5Var2 = cl5Var;
                        if (objP22 == cl5Var2) {
                        }
                        Function1 function117 = (Function1) objP22;
                        zG11 = fetVar2.g(pz40VarO2);
                        objP23 = fetVar2.P();
                        if (zG11) {
                            objP23 = new ca6(pz40VarO2, (byte) 21);
                            fetVar2.o0(objP23);
                        } else {
                            objP23 = new ca6(pz40VarO2, (byte) 21);
                            fetVar2.o0(objP23);
                        }
                        S(str, str1118, str1119, ifjVar17, z, ulq0Var, amVar17, function117, (Function1) objP23, fetVar2, (i2112 & 14) | (i22 & 57344) | i2117);
                        String str11110 = cfjVar3.b;
                        String str11111 = cfjVar3.d;
                        am amVar18 = (am) pz40VarO.getValue();
                        ifj ifjVar18 = (ifj) l7m0Var.getValue();
                        zG12 = fetVar2.g(pz40VarO);
                        objP24 = fetVar2.P();
                        if (zG12) {
                            objP24 = new ca6(pz40VarO, (byte) 22);
                            fetVar2.o0(objP24);
                        } else {
                            objP24 = new ca6(pz40VarO, (byte) 22);
                            fetVar2.o0(objP24);
                        }
                        Function1 function118 = (Function1) objP24;
                        zG13 = fetVar2.g(pz40VarO2);
                        objP25 = fetVar2.P();
                        if (zG13) {
                            objP25 = new ca6(pz40VarO2, (byte) 23);
                            fetVar2.o0(objP25);
                        } else {
                            objP25 = new ca6(pz40VarO2, (byte) 23);
                            fetVar2.o0(objP25);
                        }
                        int i316 = i16 << 3;
                        h(null, str2, str11110, str11111, locale, z, ulq0Var, amVar18, ifjVar18, jLongValue5, simpleDate15, simpleDateTime3, simpleDateTime8, simpleDateTime, simpleDateTime2, calendar, yg40Var11, j1e0Var6, uts0Var3, function118, (Function1) objP25, fetVar2, 6 | (i16 & 896) | ((i12 << 15) & 458752) | (i2112 & 3670016) | (i2112 & 29360128), (i316 & 458752) | (i316 & 57344) | 805605952 | i2118 | i315);
                        fetVar2 = fetVar2;
                        fetVar2.r(true);
                        yg40Var2 = yg40Var11;
                    } else {
                        cl5Var2 = cl5Var;
                    }
                    objP22 = new ca6(pz40VarO, (byte) 20);
                    fetVar2.o0(objP22);
                    Function1 function119 = (Function1) objP22;
                    zG11 = fetVar2.g(pz40VarO2);
                    objP23 = fetVar2.P();
                    if (zG11) {
                        objP23 = new ca6(pz40VarO2, (byte) 21);
                        fetVar2.o0(objP23);
                    } else {
                        objP23 = new ca6(pz40VarO2, (byte) 21);
                        fetVar2.o0(objP23);
                    }
                    S(str, str1118, str1119, ifjVar17, z, ulq0Var, amVar17, function119, (Function1) objP23, fetVar2, (i2112 & 14) | (i22 & 57344) | i2117);
                    String str11112 = cfjVar3.b;
                    String str11113 = cfjVar3.d;
                    am amVar19 = (am) pz40VarO.getValue();
                    ifj ifjVar19 = (ifj) l7m0Var.getValue();
                    zG12 = fetVar2.g(pz40VarO);
                    objP24 = fetVar2.P();
                    if (zG12) {
                        objP24 = new ca6(pz40VarO, (byte) 22);
                        fetVar2.o0(objP24);
                    } else {
                        objP24 = new ca6(pz40VarO, (byte) 22);
                        fetVar2.o0(objP24);
                    }
                    Function1 function1110 = (Function1) objP24;
                    zG13 = fetVar2.g(pz40VarO2);
                    objP25 = fetVar2.P();
                    if (zG13) {
                        objP25 = new ca6(pz40VarO2, (byte) 23);
                        fetVar2.o0(objP25);
                    } else {
                        objP25 = new ca6(pz40VarO2, (byte) 23);
                        fetVar2.o0(objP25);
                    }
                    int i317 = i16 << 3;
                    h(null, str2, str11112, str11113, locale, z, ulq0Var, amVar19, ifjVar19, jLongValue5, simpleDate15, simpleDateTime3, simpleDateTime8, simpleDateTime, simpleDateTime2, calendar, yg40Var11, j1e0Var6, uts0Var3, function1110, (Function1) objP25, fetVar2, 6 | (i16 & 896) | ((i12 << 15) & 458752) | (i2112 & 3670016) | (i2112 & 29360128), (i317 & 458752) | (i317 & 57344) | 805605952 | i2118 | i315);
                    fetVar2 = fetVar2;
                    fetVar2.r(true);
                    yg40Var2 = yg40Var11;
                } else {
                    simpleDateTime6 = simpleDateTime2;
                }
                i11 = i20;
                if ((i8 & 48) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zG5 = z15 | fetVar2.g(dateFormat);
                objP11 = fetVar2.P();
                if (zG5) {
                    simpleDate4 = simpleDate6;
                    wdx.J(simpleDate4, calendar);
                    objP11 = dateFormat.format(calendar.getTime());
                    fetVar2.o0(objP11);
                } else {
                    simpleDate4 = simpleDate6;
                    wdx.J(simpleDate4, calendar);
                    objP11 = dateFormat.format(calendar.getTime());
                    fetVar2.o0(objP11);
                }
                str5 = (String) objP11;
                zG6 = ((i9 <= 4 && fetVar2.g(simpleDateTime5)) || (i8 & 6) == 4) | fetVar2.g(dateFormat2);
                objP12 = fetVar2.P();
                if (zG6) {
                    wdx.I(simpleDateTime5, calendar);
                    objP12 = dateFormat2.format(calendar.getTime());
                    fetVar2.o0(objP12);
                } else {
                    wdx.I(simpleDateTime5, calendar);
                    objP12 = dateFormat2.format(calendar.getTime());
                    fetVar2.o0(objP12);
                }
                str6 = (String) objP12;
                zG7 = ((i10 <= 32 && fetVar2.g(simpleDateTime6)) || (i8 & 48) == 32) | fetVar2.g(dateFormat2);
                objP13 = fetVar2.P();
                if (zG7) {
                    wdx.I(simpleDateTime6, calendar);
                    objP13 = dateFormat2.format(calendar.getTime());
                    fetVar2.o0(objP13);
                } else {
                    wdx.I(simpleDateTime6, calendar);
                    objP13 = dateFormat2.format(calendar.getTime());
                    fetVar2.o0(objP13);
                }
                str7 = (String) objP13;
                zG8 = fetVar2.g(str4) | fetVar2.g(str5) | fetVar2.g(str6) | fetVar2.g(str7);
                objP14 = fetVar2.P();
                if (zG8) {
                    str4.getClass();
                    str5.getClass();
                    str6.getClass();
                    str7.getClass();
                    objP14 = new cfj(str4, str5, str6, str7);
                    fetVar2.o0(objP14);
                } else {
                    str4.getClass();
                    str5.getClass();
                    str6.getClass();
                    str7.getClass();
                    objP14 = new cfj(str4, str5, str6, str7);
                    fetVar2.o0(objP14);
                }
                cfj cfjVar4 = (cfj) objP14;
                amVar = (am) pz40VarO.getValue();
                int i2119 = i16 >> 6;
                zG9 = fetVar2.g(simpleDate4) | fetVar2.e(amVar.ordinal()) | fetVar2.g(simpleDate3) | fetVar2.g(calendar);
                objP15 = fetVar2.P();
                if (zG9) {
                    iOrdinal3 = amVar.ordinal();
                    if (iOrdinal3 == 0) {
                        simpleDateTime7 = simpleDateTime5;
                    } else {
                        if (iOrdinal3 != 1) {
                            t9f.b();
                            return;
                        }
                        simpleDateTime7 = simpleDateTime6;
                    }
                    wdx.J(simpleDateTime7.f47285a, calendar);
                    objP15 = Long.valueOf(calendar.getTimeInMillis());
                    fetVar2.o0(objP15);
                } else {
                    iOrdinal3 = amVar.ordinal();
                    if (iOrdinal3 == 0) {
                        simpleDateTime7 = simpleDateTime5;
                    } else {
                        if (iOrdinal3 != 1) {
                            t9f.b();
                            return;
                        }
                        simpleDateTime7 = simpleDateTime6;
                    }
                    wdx.J(simpleDateTime7.f47285a, calendar);
                    objP15 = Long.valueOf(calendar.getTimeInMillis());
                    fetVar2.o0(objP15);
                }
                long jLongValue6 = ((Number) objP15).longValue();
                SimpleDate simpleDate16 = simpleDateTime3.f47285a;
                SimpleDate simpleDate17 = simpleDateTime4.f47285a;
                if ((i16 & 7168) != 2048) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                boolean zG112 = fetVar2.g(simpleDate16) | z16 | fetVar2.g(simpleDate17);
                if (i7 == 67108864) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean zG113 = zG112 | z17 | fetVar2.g(calendar);
                i12 = i11;
                if ((i12 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zG113 | z18;
                Object objP29 = fetVar2.P();
                if (z19) {
                    iOrdinal4 = ulq0Var.ordinal();
                    if (iOrdinal4 == 0) {
                        yg40Var5 = yg40Var4;
                        simpleDateTimeH0 = h0(simpleDateTime5, calendar, yg40Var5, 1);
                    } else if (iOrdinal4 != 1) {
                        t9f.b();
                        return;
                    } else {
                        yg40Var5 = yg40Var4;
                        simpleDateTimeH0 = simpleDateTime5;
                    }
                    objV = bsr0.V(simpleDateTimeH0.f47285a, simpleDateTime3.f47285a, simpleDateTime4.f47285a);
                    fetVar2.o0(objV);
                } else {
                    iOrdinal4 = ulq0Var.ordinal();
                    if (iOrdinal4 == 0) {
                        yg40Var5 = yg40Var4;
                        simpleDateTimeH0 = h0(simpleDateTime5, calendar, yg40Var5, 1);
                    } else if (iOrdinal4 != 1) {
                        t9f.b();
                        return;
                    } else {
                        yg40Var5 = yg40Var4;
                        simpleDateTimeH0 = simpleDateTime5;
                    }
                    objV = bsr0.V(simpleDateTimeH0.f47285a, simpleDateTime3.f47285a, simpleDateTime4.f47285a);
                    fetVar2.o0(objV);
                }
                SimpleDate simpleDate18 = (SimpleDate) objV;
                objP16 = fetVar2.P();
                if (objP16 == cl5Var) {
                    objP16 = ro4.m0(220, 0, ihn.f14788a, 2);
                    fetVar2.o0(objP16);
                }
                uts0 uts0Var4 = (uts0) objP16;
                int i21110 = i16 >> 3;
                i13 = (i21110 & 896) | (i24 & 14) | ((i12 << 3) & 112) | 512 | 4096 | (i21110 & 7168) | (i2119 & 3670016) | (i2119 & 29360128) | 1207959552;
                pz40VarF = androidx.compose.runtime.e.f(Boolean.valueOf(z), fetVar2);
                pz40VarF2 = androidx.compose.runtime.e.f(simpleDateTime5, fetVar2);
                pz40VarF3 = androidx.compose.runtime.e.f(simpleDateTime6, fetVar2);
                pz40VarF4 = androidx.compose.runtime.e.f(ulq0Var, fetVar2);
                pz40VarF5 = androidx.compose.runtime.e.f(function1, fetVar2);
                pz40VarF6 = androidx.compose.runtime.e.f(function2, fetVar);
                pz40VarF7 = androidx.compose.runtime.e.f(Long.valueOf(jLongValue), fetVar2);
                pz40VarF8 = androidx.compose.runtime.e.f(Long.valueOf(jLongValue2), fetVar2);
                pz40VarF9 = androidx.compose.runtime.e.f(simpleDateTime3, fetVar2);
                pz40VarF10 = androidx.compose.runtime.e.f(simpleDateTime4, fetVar2);
                pz40VarF11 = androidx.compose.runtime.e.f(yg40Var5, fetVar2);
                i14 = (i13 & 112) ^ 48;
                if (i14 > 32) {
                    locale2 = locale;
                    if (!fetVar2.g(locale2)) {
                        i15 = i13;
                        simpleDateTime8 = simpleDateTime4;
                    }
                    z20 = true;
                    objP17 = fetVar2.P();
                    if (z20) {
                        objP17 = new oej(pz40VarF, pz40VarF9, pz40VarF10, pz40VarF2, pz40VarF4, calendar, pz40VarF7, pz40VarF8, pz40VarF3, pz40VarF5, pz40VarF6, pz40VarF11);
                        pz40VarF8 = pz40VarF8;
                        pz40Var = pz40VarF6;
                        pz40Var2 = pz40VarF11;
                        pz40Var3 = pz40VarF5;
                        pz40Var4 = pz40VarF10;
                        pz40VarF3 = pz40VarF3;
                        pz40Var5 = pz40VarF9;
                        pz40VarF4 = pz40VarF4;
                        pz40VarF7 = pz40VarF7;
                        fetVar2.o0(objP17);
                    } else {
                        objP17 = new oej(pz40VarF, pz40VarF9, pz40VarF10, pz40VarF2, pz40VarF4, calendar, pz40VarF7, pz40VarF8, pz40VarF3, pz40VarF5, pz40VarF6, pz40VarF11);
                        pz40VarF8 = pz40VarF8;
                        pz40Var = pz40VarF6;
                        pz40Var2 = pz40VarF11;
                        pz40Var3 = pz40VarF5;
                        pz40Var4 = pz40VarF10;
                        pz40VarF3 = pz40VarF3;
                        pz40Var5 = pz40VarF9;
                        pz40VarF4 = pz40VarF4;
                        pz40VarF7 = pz40VarF7;
                        fetVar2.o0(objP17);
                    }
                    function3 = (Function1) objP17;
                    if (i14 <= 32) {
                    }
                    objP18 = fetVar2.P();
                    if (z21) {
                        pz40 pz40Var111111115 = pz40VarF8;
                        pz40 pz40Var21110 = pz40VarF4;
                        pz40 pz40Var21111 = pz40Var5;
                        pz40 pz40Var21112 = pz40VarF7;
                        pz40 pz40Var111111116 = pz40VarF3;
                        pz40 pz40Var111111117 = pz40Var4;
                        pz40 pz40Var111111118 = pz40Var;
                        oej oejVar12 = new oej(pz40VarF, pz40Var21111, pz40Var111111117, pz40VarF2, pz40Var111111116, pz40Var21110, calendar, pz40Var21112, pz40Var111111115, pz40Var111111118, pz40Var2, pz40Var3);
                        pz40Var5 = pz40Var21111;
                        pz40VarF4 = pz40Var21110;
                        pz40VarF8 = pz40Var111111115;
                        pz40Var4 = pz40Var111111117;
                        pz40VarF3 = pz40Var111111116;
                        pz40VarF7 = pz40Var21112;
                        pz40Var = pz40Var111111118;
                        objP18 = oejVar12;
                        fetVar2.o0(objP18);
                    } else {
                        pz40 pz40Var111111119 = pz40VarF8;
                        pz40 pz40Var21113 = pz40VarF4;
                        pz40 pz40Var21114 = pz40Var5;
                        pz40 pz40Var21115 = pz40VarF7;
                        pz40 pz40Var1111111110 = pz40VarF3;
                        pz40 pz40Var1111111111 = pz40Var4;
                        pz40 pz40Var1111111112 = pz40Var;
                        oej oejVar13 = new oej(pz40VarF, pz40Var21114, pz40Var1111111111, pz40VarF2, pz40Var1111111110, pz40Var21113, calendar, pz40Var21115, pz40Var111111119, pz40Var1111111112, pz40Var2, pz40Var3);
                        pz40Var5 = pz40Var21114;
                        pz40VarF4 = pz40Var21113;
                        pz40VarF8 = pz40Var111111119;
                        pz40Var4 = pz40Var1111111111;
                        pz40VarF3 = pz40Var1111111110;
                        pz40VarF7 = pz40Var21115;
                        pz40Var = pz40Var1111111112;
                        objP18 = oejVar13;
                        fetVar2.o0(objP18);
                    }
                    function4 = (Function1) objP18;
                    if (i14 <= 32) {
                    }
                    objP19 = fetVar2.P();
                    if (z22) {
                        pz40 pz40Var1111111113 = pz40Var5;
                        pz40 pz40Var1111124 = pz40Var;
                        pz40 pz40Var1111111114 = pz40Var3;
                        pz40 pz40Var121110 = pz40Var2;
                        pz40 pz40Var121111 = pz40Var4;
                        pz40 pz40Var121112 = pz40VarF3;
                        pej pejVar12 = new pej(pz40VarF, pz40VarF4, pz40VarF2, calendar, pz40VarF7, pz40VarF8, pz40Var121112, pz40Var1111111114, pz40Var1111124, pz40Var1111111113, pz40Var121111, pz40Var121110, (byte) 0);
                        pz40Var3 = pz40Var1111111114;
                        pz40Var = pz40Var1111124;
                        pz40Var5 = pz40Var1111111113;
                        pz40Var4 = pz40Var121111;
                        pz40Var2 = pz40Var121110;
                        objP19 = pejVar12;
                        pz40VarF2 = pz40VarF2;
                        pz40VarF3 = pz40Var121112;
                        fetVar2.o0(objP19);
                    } else {
                        pz40 pz40Var1111111115 = pz40Var5;
                        pz40 pz40Var1111125 = pz40Var;
                        pz40 pz40Var1111111116 = pz40Var3;
                        pz40 pz40Var121113 = pz40Var2;
                        pz40 pz40Var121114 = pz40Var4;
                        pz40 pz40Var121115 = pz40VarF3;
                        pej pejVar13 = new pej(pz40VarF, pz40VarF4, pz40VarF2, calendar, pz40VarF7, pz40VarF8, pz40Var121115, pz40Var1111111116, pz40Var1111125, pz40Var1111111115, pz40Var121114, pz40Var121113, (byte) 0);
                        pz40Var3 = pz40Var1111111116;
                        pz40Var = pz40Var1111125;
                        pz40Var5 = pz40Var1111111115;
                        pz40Var4 = pz40Var121114;
                        pz40Var2 = pz40Var121113;
                        objP19 = pejVar13;
                        pz40VarF2 = pz40VarF2;
                        pz40VarF3 = pz40Var121115;
                        fetVar2.o0(objP19);
                    }
                    function5 = (Function2) objP19;
                    if (i14 <= 32) {
                    }
                    objP20 = fetVar2.P();
                    if (z23) {
                        objP20 = new pej(pz40VarF, pz40VarF4, pz40VarF3, calendar, pz40VarF7, pz40VarF8, pz40VarF2, pz40Var, pz40Var5, pz40Var4, pz40Var2, pz40Var3, (byte) 1);
                        fetVar2.o0(objP20);
                    } else {
                        objP20 = new pej(pz40VarF, pz40VarF4, pz40VarF3, calendar, pz40VarF7, pz40VarF8, pz40VarF2, pz40Var, pz40Var5, pz40Var4, pz40Var2, pz40Var3, (byte) 1);
                        fetVar2.o0(objP20);
                    }
                    function6 = (Function2) objP20;
                    objP21 = fetVar2.P();
                    if (objP21 == cl5Var) {
                        objP21 = new j1e0(function3, function4, function5, function6);
                        fetVar2.o0(objP21);
                    }
                    j1e0 j1e0Var7 = (j1e0) objP21;
                    int i21111 = i12 << 12;
                    int i21112 = i22 & 458752;
                    int i21113 = i22 & 3670016;
                    int i318 = i21111 & 29360128;
                    F(simpleDateTime5, simpleDateTime6, simpleDateTime3, simpleDateTime8, locale2, ulq0Var, calendar, yg40Var5, function1, function2, fetVar2, i23 | 4608 | (i21111 & 57344) | i21112 | i21113 | i318 | (i21111 & 234881024) | (i21111 & 1879048192));
                    yg40 yg40Var12 = yg40Var5;
                    mm40 mm40VarQ7 = i120.Q(o7k0.e(mm40Var, lej.f19905a), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
                    x5d x5dVarA7 = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                    int iHashCode7 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM7 = fetVar2.m();
                    mm40 mm40VarC6 = kbc.c0(fetVar2, mm40VarQ7);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(e7z.u1);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA7, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM7, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode7), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC6, gqw0.v);
                    String str11114 = cfjVar4.f4265a;
                    String str11115 = cfjVar4.c;
                    ifj ifjVar110 = (ifj) l7m0Var.getValue();
                    am amVar110 = (am) pz40VarO.getValue();
                    zG10 = fetVar2.g(pz40VarO);
                    objP22 = fetVar2.P();
                    if (zG10) {
                        cl5Var2 = cl5Var;
                        if (objP22 == cl5Var2) {
                        }
                        Function1 function1111 = (Function1) objP22;
                        zG11 = fetVar2.g(pz40VarO2);
                        objP23 = fetVar2.P();
                        if (zG11) {
                            objP23 = new ca6(pz40VarO2, (byte) 21);
                            fetVar2.o0(objP23);
                        } else {
                            objP23 = new ca6(pz40VarO2, (byte) 21);
                            fetVar2.o0(objP23);
                        }
                        S(str, str11114, str11115, ifjVar110, z, ulq0Var, amVar110, function1111, (Function1) objP23, fetVar2, (i21110 & 14) | (i22 & 57344) | i21112);
                        String str11116 = cfjVar4.b;
                        String str11117 = cfjVar4.d;
                        am amVar111 = (am) pz40VarO.getValue();
                        ifj ifjVar111 = (ifj) l7m0Var.getValue();
                        zG12 = fetVar2.g(pz40VarO);
                        objP24 = fetVar2.P();
                        if (zG12) {
                            objP24 = new ca6(pz40VarO, (byte) 22);
                            fetVar2.o0(objP24);
                        } else {
                            objP24 = new ca6(pz40VarO, (byte) 22);
                            fetVar2.o0(objP24);
                        }
                        Function1 function1112 = (Function1) objP24;
                        zG13 = fetVar2.g(pz40VarO2);
                        objP25 = fetVar2.P();
                        if (zG13) {
                            objP25 = new ca6(pz40VarO2, (byte) 23);
                            fetVar2.o0(objP25);
                        } else {
                            objP25 = new ca6(pz40VarO2, (byte) 23);
                            fetVar2.o0(objP25);
                        }
                        int i319 = i16 << 3;
                        h(null, str2, str11116, str11117, locale, z, ulq0Var, amVar111, ifjVar111, jLongValue6, simpleDate18, simpleDateTime3, simpleDateTime8, simpleDateTime, simpleDateTime2, calendar, yg40Var12, j1e0Var7, uts0Var4, function1112, (Function1) objP25, fetVar2, 6 | (i16 & 896) | ((i12 << 15) & 458752) | (i21110 & 3670016) | (i21110 & 29360128), (i319 & 458752) | (i319 & 57344) | 805605952 | i21113 | i318);
                        fetVar2 = fetVar2;
                        fetVar2.r(true);
                        yg40Var2 = yg40Var12;
                    } else {
                        cl5Var2 = cl5Var;
                    }
                    objP22 = new ca6(pz40VarO, (byte) 20);
                    fetVar2.o0(objP22);
                    Function1 function1113 = (Function1) objP22;
                    zG11 = fetVar2.g(pz40VarO2);
                    objP23 = fetVar2.P();
                    if (zG11) {
                        objP23 = new ca6(pz40VarO2, (byte) 21);
                        fetVar2.o0(objP23);
                    } else {
                        objP23 = new ca6(pz40VarO2, (byte) 21);
                        fetVar2.o0(objP23);
                    }
                    S(str, str11114, str11115, ifjVar110, z, ulq0Var, amVar110, function1113, (Function1) objP23, fetVar2, (i21110 & 14) | (i22 & 57344) | i21112);
                    String str11118 = cfjVar4.b;
                    String str11119 = cfjVar4.d;
                    am amVar112 = (am) pz40VarO.getValue();
                    ifj ifjVar112 = (ifj) l7m0Var.getValue();
                    zG12 = fetVar2.g(pz40VarO);
                    objP24 = fetVar2.P();
                    if (zG12) {
                        objP24 = new ca6(pz40VarO, (byte) 22);
                        fetVar2.o0(objP24);
                    } else {
                        objP24 = new ca6(pz40VarO, (byte) 22);
                        fetVar2.o0(objP24);
                    }
                    Function1 function1114 = (Function1) objP24;
                    zG13 = fetVar2.g(pz40VarO2);
                    objP25 = fetVar2.P();
                    if (zG13) {
                        objP25 = new ca6(pz40VarO2, (byte) 23);
                        fetVar2.o0(objP25);
                    } else {
                        objP25 = new ca6(pz40VarO2, (byte) 23);
                        fetVar2.o0(objP25);
                    }
                    int i3110 = i16 << 3;
                    h(null, str2, str11118, str11119, locale, z, ulq0Var, amVar112, ifjVar112, jLongValue6, simpleDate18, simpleDateTime3, simpleDateTime8, simpleDateTime, simpleDateTime2, calendar, yg40Var12, j1e0Var7, uts0Var4, function1114, (Function1) objP25, fetVar2, 6 | (i16 & 896) | ((i12 << 15) & 458752) | (i21110 & 3670016) | (i21110 & 29360128), (i3110 & 458752) | (i3110 & 57344) | 805605952 | i21113 | i318);
                    fetVar2 = fetVar2;
                    fetVar2.r(true);
                    yg40Var2 = yg40Var12;
                } else {
                    locale2 = locale;
                }
                i15 = i13;
                simpleDateTime8 = simpleDateTime4;
                if ((i15 & 48) == 32) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                objP17 = fetVar2.P();
                if (z20) {
                    objP17 = new oej(pz40VarF, pz40VarF9, pz40VarF10, pz40VarF2, pz40VarF4, calendar, pz40VarF7, pz40VarF8, pz40VarF3, pz40VarF5, pz40VarF6, pz40VarF11);
                    pz40VarF8 = pz40VarF8;
                    pz40Var = pz40VarF6;
                    pz40Var2 = pz40VarF11;
                    pz40Var3 = pz40VarF5;
                    pz40Var4 = pz40VarF10;
                    pz40VarF3 = pz40VarF3;
                    pz40Var5 = pz40VarF9;
                    pz40VarF4 = pz40VarF4;
                    pz40VarF7 = pz40VarF7;
                    fetVar2.o0(objP17);
                } else {
                    objP17 = new oej(pz40VarF, pz40VarF9, pz40VarF10, pz40VarF2, pz40VarF4, calendar, pz40VarF7, pz40VarF8, pz40VarF3, pz40VarF5, pz40VarF6, pz40VarF11);
                    pz40VarF8 = pz40VarF8;
                    pz40Var = pz40VarF6;
                    pz40Var2 = pz40VarF11;
                    pz40Var3 = pz40VarF5;
                    pz40Var4 = pz40VarF10;
                    pz40VarF3 = pz40VarF3;
                    pz40Var5 = pz40VarF9;
                    pz40VarF4 = pz40VarF4;
                    pz40VarF7 = pz40VarF7;
                    fetVar2.o0(objP17);
                }
                function3 = (Function1) objP17;
                if (i14 <= 32) {
                }
                objP18 = fetVar2.P();
                if (z21) {
                    pz40 pz40Var1111111117 = pz40VarF8;
                    pz40 pz40Var21116 = pz40VarF4;
                    pz40 pz40Var21117 = pz40Var5;
                    pz40 pz40Var21118 = pz40VarF7;
                    pz40 pz40Var1111111118 = pz40VarF3;
                    pz40 pz40Var1111111119 = pz40Var4;
                    pz40 pz40Var11111111110 = pz40Var;
                    oej oejVar14 = new oej(pz40VarF, pz40Var21117, pz40Var1111111119, pz40VarF2, pz40Var1111111118, pz40Var21116, calendar, pz40Var21118, pz40Var1111111117, pz40Var11111111110, pz40Var2, pz40Var3);
                    pz40Var5 = pz40Var21117;
                    pz40VarF4 = pz40Var21116;
                    pz40VarF8 = pz40Var1111111117;
                    pz40Var4 = pz40Var1111111119;
                    pz40VarF3 = pz40Var1111111118;
                    pz40VarF7 = pz40Var21118;
                    pz40Var = pz40Var11111111110;
                    objP18 = oejVar14;
                    fetVar2.o0(objP18);
                } else {
                    pz40 pz40Var11111111111 = pz40VarF8;
                    pz40 pz40Var21119 = pz40VarF4;
                    pz40 pz40Var211110 = pz40Var5;
                    pz40 pz40Var211111 = pz40VarF7;
                    pz40 pz40Var11111111112 = pz40VarF3;
                    pz40 pz40Var11111111113 = pz40Var4;
                    pz40 pz40Var11111111114 = pz40Var;
                    oej oejVar15 = new oej(pz40VarF, pz40Var211110, pz40Var11111111113, pz40VarF2, pz40Var11111111112, pz40Var21119, calendar, pz40Var211111, pz40Var11111111111, pz40Var11111111114, pz40Var2, pz40Var3);
                    pz40Var5 = pz40Var211110;
                    pz40VarF4 = pz40Var21119;
                    pz40VarF8 = pz40Var11111111111;
                    pz40Var4 = pz40Var11111111113;
                    pz40VarF3 = pz40Var11111111112;
                    pz40VarF7 = pz40Var211111;
                    pz40Var = pz40Var11111111114;
                    objP18 = oejVar15;
                    fetVar2.o0(objP18);
                }
                function4 = (Function1) objP18;
                if (i14 <= 32) {
                }
                objP19 = fetVar2.P();
                if (z22) {
                    pz40 pz40Var11111111115 = pz40Var5;
                    pz40 pz40Var1111126 = pz40Var;
                    pz40 pz40Var11111111116 = pz40Var3;
                    pz40 pz40Var121116 = pz40Var2;
                    pz40 pz40Var121117 = pz40Var4;
                    pz40 pz40Var121118 = pz40VarF3;
                    pej pejVar14 = new pej(pz40VarF, pz40VarF4, pz40VarF2, calendar, pz40VarF7, pz40VarF8, pz40Var121118, pz40Var11111111116, pz40Var1111126, pz40Var11111111115, pz40Var121117, pz40Var121116, (byte) 0);
                    pz40Var3 = pz40Var11111111116;
                    pz40Var = pz40Var1111126;
                    pz40Var5 = pz40Var11111111115;
                    pz40Var4 = pz40Var121117;
                    pz40Var2 = pz40Var121116;
                    objP19 = pejVar14;
                    pz40VarF2 = pz40VarF2;
                    pz40VarF3 = pz40Var121118;
                    fetVar2.o0(objP19);
                } else {
                    pz40 pz40Var11111111117 = pz40Var5;
                    pz40 pz40Var1111127 = pz40Var;
                    pz40 pz40Var11111111118 = pz40Var3;
                    pz40 pz40Var121119 = pz40Var2;
                    pz40 pz40Var1211110 = pz40Var4;
                    pz40 pz40Var1211111 = pz40VarF3;
                    pej pejVar15 = new pej(pz40VarF, pz40VarF4, pz40VarF2, calendar, pz40VarF7, pz40VarF8, pz40Var1211111, pz40Var11111111118, pz40Var1111127, pz40Var11111111117, pz40Var1211110, pz40Var121119, (byte) 0);
                    pz40Var3 = pz40Var11111111118;
                    pz40Var = pz40Var1111127;
                    pz40Var5 = pz40Var11111111117;
                    pz40Var4 = pz40Var1211110;
                    pz40Var2 = pz40Var121119;
                    objP19 = pejVar15;
                    pz40VarF2 = pz40VarF2;
                    pz40VarF3 = pz40Var1211111;
                    fetVar2.o0(objP19);
                }
                function5 = (Function2) objP19;
                if (i14 <= 32) {
                }
                objP20 = fetVar2.P();
                if (z23) {
                    objP20 = new pej(pz40VarF, pz40VarF4, pz40VarF3, calendar, pz40VarF7, pz40VarF8, pz40VarF2, pz40Var, pz40Var5, pz40Var4, pz40Var2, pz40Var3, (byte) 1);
                    fetVar2.o0(objP20);
                } else {
                    objP20 = new pej(pz40VarF, pz40VarF4, pz40VarF3, calendar, pz40VarF7, pz40VarF8, pz40VarF2, pz40Var, pz40Var5, pz40Var4, pz40Var2, pz40Var3, (byte) 1);
                    fetVar2.o0(objP20);
                }
                function6 = (Function2) objP20;
                objP21 = fetVar2.P();
                if (objP21 == cl5Var) {
                    objP21 = new j1e0(function3, function4, function5, function6);
                    fetVar2.o0(objP21);
                }
                j1e0 j1e0Var8 = (j1e0) objP21;
                int i21114 = i12 << 12;
                int i21115 = i22 & 458752;
                int i21116 = i22 & 3670016;
                int i3111 = i21114 & 29360128;
                F(simpleDateTime5, simpleDateTime6, simpleDateTime3, simpleDateTime8, locale2, ulq0Var, calendar, yg40Var5, function1, function2, fetVar2, i23 | 4608 | (i21114 & 57344) | i21115 | i21116 | i3111 | (i21114 & 234881024) | (i21114 & 1879048192));
                yg40 yg40Var13 = yg40Var5;
                mm40 mm40VarQ8 = i120.Q(o7k0.e(mm40Var, lej.f19905a), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
                x5d x5dVarA8 = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                int iHashCode8 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM8 = fetVar2.m();
                mm40 mm40VarC7 = kbc.c0(fetVar2, mm40VarQ8);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(e7z.u1);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, x5dVarA8, gqw0.x);
                jpm0.o(fetVar2, bh90VarM8, gqw0.w);
                jpm0.o(fetVar2, Integer.valueOf(iHashCode8), gqw0.y);
                jpm0.n(fetVar2);
                jpm0.o(fetVar2, mm40VarC7, gqw0.v);
                String str111110 = cfjVar4.f4265a;
                String str111111 = cfjVar4.c;
                ifj ifjVar113 = (ifj) l7m0Var.getValue();
                am amVar113 = (am) pz40VarO.getValue();
                zG10 = fetVar2.g(pz40VarO);
                objP22 = fetVar2.P();
                if (zG10) {
                    cl5Var2 = cl5Var;
                    if (objP22 == cl5Var2) {
                    }
                    Function1 function1115 = (Function1) objP22;
                    zG11 = fetVar2.g(pz40VarO2);
                    objP23 = fetVar2.P();
                    if (zG11) {
                        objP23 = new ca6(pz40VarO2, (byte) 21);
                        fetVar2.o0(objP23);
                    } else {
                        objP23 = new ca6(pz40VarO2, (byte) 21);
                        fetVar2.o0(objP23);
                    }
                    S(str, str111110, str111111, ifjVar113, z, ulq0Var, amVar113, function1115, (Function1) objP23, fetVar2, (i21110 & 14) | (i22 & 57344) | i21115);
                    String str111112 = cfjVar4.b;
                    String str111113 = cfjVar4.d;
                    am amVar114 = (am) pz40VarO.getValue();
                    ifj ifjVar114 = (ifj) l7m0Var.getValue();
                    zG12 = fetVar2.g(pz40VarO);
                    objP24 = fetVar2.P();
                    if (zG12) {
                        objP24 = new ca6(pz40VarO, (byte) 22);
                        fetVar2.o0(objP24);
                    } else {
                        objP24 = new ca6(pz40VarO, (byte) 22);
                        fetVar2.o0(objP24);
                    }
                    Function1 function1116 = (Function1) objP24;
                    zG13 = fetVar2.g(pz40VarO2);
                    objP25 = fetVar2.P();
                    if (zG13) {
                        objP25 = new ca6(pz40VarO2, (byte) 23);
                        fetVar2.o0(objP25);
                    } else {
                        objP25 = new ca6(pz40VarO2, (byte) 23);
                        fetVar2.o0(objP25);
                    }
                    int i3112 = i16 << 3;
                    h(null, str2, str111112, str111113, locale, z, ulq0Var, amVar114, ifjVar114, jLongValue6, simpleDate18, simpleDateTime3, simpleDateTime8, simpleDateTime, simpleDateTime2, calendar, yg40Var13, j1e0Var8, uts0Var4, function1116, (Function1) objP25, fetVar2, 6 | (i16 & 896) | ((i12 << 15) & 458752) | (i21110 & 3670016) | (i21110 & 29360128), (i3112 & 458752) | (i3112 & 57344) | 805605952 | i21116 | i3111);
                    fetVar2 = fetVar2;
                    fetVar2.r(true);
                    yg40Var2 = yg40Var13;
                } else {
                    cl5Var2 = cl5Var;
                }
                objP22 = new ca6(pz40VarO, (byte) 20);
                fetVar2.o0(objP22);
                Function1 function1117 = (Function1) objP22;
                zG11 = fetVar2.g(pz40VarO2);
                objP23 = fetVar2.P();
                if (zG11) {
                    objP23 = new ca6(pz40VarO2, (byte) 21);
                    fetVar2.o0(objP23);
                } else {
                    objP23 = new ca6(pz40VarO2, (byte) 21);
                    fetVar2.o0(objP23);
                }
                S(str, str111110, str111111, ifjVar113, z, ulq0Var, amVar113, function1117, (Function1) objP23, fetVar2, (i21110 & 14) | (i22 & 57344) | i21115);
                String str111114 = cfjVar4.b;
                String str111115 = cfjVar4.d;
                am amVar115 = (am) pz40VarO.getValue();
                ifj ifjVar115 = (ifj) l7m0Var.getValue();
                zG12 = fetVar2.g(pz40VarO);
                objP24 = fetVar2.P();
                if (zG12) {
                    objP24 = new ca6(pz40VarO, (byte) 22);
                    fetVar2.o0(objP24);
                } else {
                    objP24 = new ca6(pz40VarO, (byte) 22);
                    fetVar2.o0(objP24);
                }
                Function1 function1118 = (Function1) objP24;
                zG13 = fetVar2.g(pz40VarO2);
                objP25 = fetVar2.P();
                if (zG13) {
                    objP25 = new ca6(pz40VarO2, (byte) 23);
                    fetVar2.o0(objP25);
                } else {
                    objP25 = new ca6(pz40VarO2, (byte) 23);
                    fetVar2.o0(objP25);
                }
                int i3113 = i16 << 3;
                h(null, str2, str111114, str111115, locale, z, ulq0Var, amVar115, ifjVar115, jLongValue6, simpleDate18, simpleDateTime3, simpleDateTime8, simpleDateTime, simpleDateTime2, calendar, yg40Var13, j1e0Var8, uts0Var4, function1118, (Function1) objP25, fetVar2, 6 | (i16 & 896) | ((i12 << 15) & 458752) | (i21110 & 3670016) | (i21110 & 29360128), (i3113 & 458752) | (i3113 & 57344) | 805605952 | i21116 | i3111);
                fetVar2 = fetVar2;
                fetVar2.r(true);
                yg40Var2 = yg40Var13;
            } else {
                fetVar2.X();
            }
            yg40Var3 = yg40Var;
            fetVar2.s();
            context = (Context) fetVar2.k(dy2.b);
            yg40Var4 = yg40Var3;
            Object[] objArr3 = new Object[0];
            v0h0 v0h0Var3 = new v0h0(ske.l, x0.n);
            objP = fetVar2.P();
            cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new bmh((byte) 25);
                fetVar2.o0(objP);
            }
            pz40VarO = e9x.O(objArr3, v0h0Var3, (Function0) objP, fetVar2, 384);
            Object[] objArr4 = new Object[0];
            v0h0 v0h0Var4 = new v0h0(ske.m, x0.o);
            objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new bmh((byte) 26);
                fetVar2.o0(objP2);
            }
            pz40VarO2 = e9x.O(objArr4, v0h0Var4, (Function0) objP2, fetVar2, 384);
            int i220 = (i20 & 14) ^ 6;
            if (i220 <= 4) {
            }
            objP3 = fetVar2.P();
            if (z2) {
                objP3 = new SimpleDateFormat(android.text.format.DateFormat.getBestDateTimePattern(locale, "dMMMM"), locale);
                fetVar2.o0(objP3);
            } else {
                objP3 = new SimpleDateFormat(android.text.format.DateFormat.getBestDateTimePattern(locale, "dMMMM"), locale);
                fetVar2.o0(objP3);
            }
            dateFormat = (DateFormat) objP3;
            zG = ((i220 <= 4 && fetVar2.g(locale)) || (i20 & 6) == 4) | fetVar2.g(context);
            objP4 = fetVar2.P();
            if (zG) {
                if (android.text.format.DateFormat.is24HourFormat(context)) {
                    str3 = "Hm";
                } else {
                    str3 = "hm";
                }
                objP4 = new SimpleDateFormat(android.text.format.DateFormat.getBestDateTimePattern(locale, str3), locale);
                fetVar2.o0(objP4);
            } else {
                if (android.text.format.DateFormat.is24HourFormat(context)) {
                    str3 = "Hm";
                } else {
                    str3 = "hm";
                }
                objP4 = new SimpleDateFormat(android.text.format.DateFormat.getBestDateTimePattern(locale, str3), locale);
                fetVar2.o0(objP4);
            }
            dateFormat2 = (DateFormat) objP4;
            if ((i16 & 458752) != 131072) {
                z3 = true;
            } else {
                z3 = true;
            }
            boolean z26 = z3;
            if ((i20 & 112) != 32) {
                z4 = true;
            } else {
                z4 = true;
            }
            z5 = z26 | z4;
            objP5 = fetVar2.P();
            if (z5) {
                if (timeOfDay23 == null) {
                    timeOfDay25 = f;
                } else {
                    timeOfDay25 = timeOfDay23;
                }
                objP5 = new SimpleDateTime(simpleDate, timeOfDay25);
                fetVar2.o0(objP5);
            } else {
                if (timeOfDay23 == null) {
                    timeOfDay25 = f;
                } else {
                    timeOfDay25 = timeOfDay23;
                }
                objP5 = new SimpleDateTime(simpleDate, timeOfDay25);
                fetVar2.o0(objP5);
            }
            simpleDateTime3 = (SimpleDateTime) objP5;
            if ((i16 & 3670016) != 1048576) {
                z6 = true;
            } else {
                z6 = true;
            }
            boolean z27 = z6;
            if ((i20 & 896) != 256) {
                z7 = true;
            } else {
                z7 = true;
            }
            z8 = z27 | z7;
            objP6 = fetVar2.P();
            if (z8) {
                if (timeOfDay24 == null) {
                    timeOfDay26 = g;
                } else {
                    timeOfDay26 = timeOfDay24;
                }
                objP6 = new SimpleDateTime(simpleDate2, timeOfDay26);
                fetVar2.o0(objP6);
            } else {
                if (timeOfDay24 == null) {
                    timeOfDay26 = g;
                } else {
                    timeOfDay26 = timeOfDay24;
                }
                objP6 = new SimpleDateTime(simpleDate2, timeOfDay26);
                fetVar2.o0(objP6);
            }
            simpleDateTime4 = (SimpleDateTime) objP6;
            boolean zG114 = fetVar2.g(simpleDateTime3);
            i7 = i16 & 234881024;
            if (i7 == 67108864) {
                z9 = true;
            } else {
                z9 = false;
            }
            zG2 = zG114 | z9 | fetVar2.g(calendar);
            objP7 = fetVar2.P();
            if (zG2) {
                iOrdinal = ulq0Var.ordinal();
                if (iOrdinal == 0) {
                    jE0 = wdx.e0(simpleDateTime3, calendar);
                } else if (iOrdinal != 1) {
                    t9f.b();
                    return;
                } else {
                    wdx.I(simpleDateTime3, calendar);
                    bsr0.U(calendar);
                    jE0 = calendar.getTimeInMillis();
                }
                objP7 = Long.valueOf(jE0);
                fetVar2.o0(objP7);
            } else {
                iOrdinal = ulq0Var.ordinal();
                if (iOrdinal == 0) {
                    jE0 = wdx.e0(simpleDateTime3, calendar);
                } else if (iOrdinal != 1) {
                    t9f.b();
                    return;
                } else {
                    wdx.I(simpleDateTime3, calendar);
                    bsr0.U(calendar);
                    jE0 = calendar.getTimeInMillis();
                }
                objP7 = Long.valueOf(jE0);
                fetVar2.o0(objP7);
            }
            long jLongValue7 = ((Number) objP7).longValue();
            boolean zG115 = fetVar2.g(simpleDateTime4);
            if (i7 == 67108864) {
                z10 = true;
            } else {
                z10 = false;
            }
            zG3 = zG115 | z10 | fetVar2.g(calendar);
            objP8 = fetVar2.P();
            if (zG3) {
                iOrdinal2 = ulq0Var.ordinal();
                if (iOrdinal2 == 0) {
                    jE1 = wdx.e0(simpleDateTime4, calendar);
                } else if (iOrdinal2 != 1) {
                    t9f.b();
                    return;
                } else {
                    wdx.I(simpleDateTime4, calendar);
                    bsr0.U(calendar);
                    jE1 = calendar.getTimeInMillis();
                }
                objP8 = Long.valueOf(jE1);
                fetVar2.o0(objP8);
            } else {
                iOrdinal2 = ulq0Var.ordinal();
                if (iOrdinal2 == 0) {
                    jE1 = wdx.e0(simpleDateTime4, calendar);
                } else if (iOrdinal2 != 1) {
                    t9f.b();
                    return;
                } else {
                    wdx.I(simpleDateTime4, calendar);
                    bsr0.U(calendar);
                    jE1 = calendar.getTimeInMillis();
                }
                objP8 = Long.valueOf(jE1);
                fetVar2.o0(objP8);
            }
            long jLongValue8 = ((Number) objP8).longValue();
            ifj ifjVar20 = (ifj) pz40VarO2.getValue();
            if ((i16 & 29360128) == 8388608) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean zE2 = z11 | fetVar2.e(ifjVar20.ordinal());
            if (i7 == 67108864) {
                z12 = true;
            } else {
                z12 = false;
            }
            z13 = zE2 | z12;
            objP9 = fetVar2.P();
            if (z13) {
                objP9 = jgk0.b(new lf2(z, (Object) ulq0Var, (Object) pz40VarO2, (byte) 5));
                fetVar2.o0(objP9);
            } else {
                objP9 = jgk0.b(new lf2(z, (Object) ulq0Var, (Object) pz40VarO2, (byte) 5));
                fetVar2.o0(objP9);
            }
            l7m0 l7m0Var2 = (l7m0) objP9;
            int i221 = i16 >> 9;
            int i222 = (i221 & 14) | 72 | (i221 & 112);
            int i223 = i16 >> 21;
            i8 = (i223 & 896) | i222;
            i9 = (i8 & 14) ^ 6;
            if (i9 > 4) {
                simpleDateTime5 = simpleDateTime;
                if (!fetVar2.g(simpleDateTime5)) {
                    z14 = true;
                }
                zG4 = z14 | fetVar2.g(dateFormat);
                objP10 = fetVar2.P();
                if (zG4) {
                    simpleDate3 = simpleDate5;
                    wdx.J(simpleDate3, calendar);
                    objP10 = dateFormat.format(calendar.getTime());
                    fetVar2.o0(objP10);
                } else {
                    simpleDate3 = simpleDate5;
                    wdx.J(simpleDate3, calendar);
                    objP10 = dateFormat.format(calendar.getTime());
                    fetVar2.o0(objP10);
                }
                str4 = (String) objP10;
                i10 = (i8 & 112) ^ 48;
                if (i10 > 32) {
                    simpleDateTime6 = simpleDateTime2;
                    if (!fetVar2.g(simpleDateTime6)) {
                        i11 = i20;
                    }
                    z15 = true;
                    zG5 = z15 | fetVar2.g(dateFormat);
                    objP11 = fetVar2.P();
                    if (zG5) {
                        simpleDate4 = simpleDate6;
                        wdx.J(simpleDate4, calendar);
                        objP11 = dateFormat.format(calendar.getTime());
                        fetVar2.o0(objP11);
                    } else {
                        simpleDate4 = simpleDate6;
                        wdx.J(simpleDate4, calendar);
                        objP11 = dateFormat.format(calendar.getTime());
                        fetVar2.o0(objP11);
                    }
                    str5 = (String) objP11;
                    zG6 = ((i9 <= 4 && fetVar2.g(simpleDateTime5)) || (i8 & 6) == 4) | fetVar2.g(dateFormat2);
                    objP12 = fetVar2.P();
                    if (zG6) {
                        wdx.I(simpleDateTime5, calendar);
                        objP12 = dateFormat2.format(calendar.getTime());
                        fetVar2.o0(objP12);
                    } else {
                        wdx.I(simpleDateTime5, calendar);
                        objP12 = dateFormat2.format(calendar.getTime());
                        fetVar2.o0(objP12);
                    }
                    str6 = (String) objP12;
                    zG7 = ((i10 <= 32 && fetVar2.g(simpleDateTime6)) || (i8 & 48) == 32) | fetVar2.g(dateFormat2);
                    objP13 = fetVar2.P();
                    if (zG7) {
                        wdx.I(simpleDateTime6, calendar);
                        objP13 = dateFormat2.format(calendar.getTime());
                        fetVar2.o0(objP13);
                    } else {
                        wdx.I(simpleDateTime6, calendar);
                        objP13 = dateFormat2.format(calendar.getTime());
                        fetVar2.o0(objP13);
                    }
                    str7 = (String) objP13;
                    zG8 = fetVar2.g(str4) | fetVar2.g(str5) | fetVar2.g(str6) | fetVar2.g(str7);
                    objP14 = fetVar2.P();
                    if (zG8) {
                        str4.getClass();
                        str5.getClass();
                        str6.getClass();
                        str7.getClass();
                        objP14 = new cfj(str4, str5, str6, str7);
                        fetVar2.o0(objP14);
                    } else {
                        str4.getClass();
                        str5.getClass();
                        str6.getClass();
                        str7.getClass();
                        objP14 = new cfj(str4, str5, str6, str7);
                        fetVar2.o0(objP14);
                    }
                    cfj cfjVar5 = (cfj) objP14;
                    amVar = (am) pz40VarO.getValue();
                    int i21117 = i16 >> 6;
                    zG9 = fetVar2.g(simpleDate4) | fetVar2.e(amVar.ordinal()) | fetVar2.g(simpleDate3) | fetVar2.g(calendar);
                    objP15 = fetVar2.P();
                    if (zG9) {
                        iOrdinal3 = amVar.ordinal();
                        if (iOrdinal3 == 0) {
                            simpleDateTime7 = simpleDateTime5;
                        } else {
                            if (iOrdinal3 != 1) {
                                t9f.b();
                                return;
                            }
                            simpleDateTime7 = simpleDateTime6;
                        }
                        wdx.J(simpleDateTime7.f47285a, calendar);
                        objP15 = Long.valueOf(calendar.getTimeInMillis());
                        fetVar2.o0(objP15);
                    } else {
                        iOrdinal3 = amVar.ordinal();
                        if (iOrdinal3 == 0) {
                            simpleDateTime7 = simpleDateTime5;
                        } else {
                            if (iOrdinal3 != 1) {
                                t9f.b();
                                return;
                            }
                            simpleDateTime7 = simpleDateTime6;
                        }
                        wdx.J(simpleDateTime7.f47285a, calendar);
                        objP15 = Long.valueOf(calendar.getTimeInMillis());
                        fetVar2.o0(objP15);
                    }
                    long jLongValue9 = ((Number) objP15).longValue();
                    SimpleDate simpleDate19 = simpleDateTime3.f47285a;
                    SimpleDate simpleDate110 = simpleDateTime4.f47285a;
                    if ((i16 & 7168) != 2048) {
                        z16 = true;
                    } else {
                        z16 = true;
                    }
                    boolean zG116 = fetVar2.g(simpleDate19) | z16 | fetVar2.g(simpleDate110);
                    if (i7 == 67108864) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean zG117 = zG116 | z17 | fetVar2.g(calendar);
                    i12 = i11;
                    if ((i12 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zG117 | z18;
                    Object objP210 = fetVar2.P();
                    if (z19) {
                        iOrdinal4 = ulq0Var.ordinal();
                        if (iOrdinal4 == 0) {
                            yg40Var5 = yg40Var4;
                            simpleDateTimeH0 = h0(simpleDateTime5, calendar, yg40Var5, 1);
                        } else if (iOrdinal4 != 1) {
                            t9f.b();
                            return;
                        } else {
                            yg40Var5 = yg40Var4;
                            simpleDateTimeH0 = simpleDateTime5;
                        }
                        objV = bsr0.V(simpleDateTimeH0.f47285a, simpleDateTime3.f47285a, simpleDateTime4.f47285a);
                        fetVar2.o0(objV);
                    } else {
                        iOrdinal4 = ulq0Var.ordinal();
                        if (iOrdinal4 == 0) {
                            yg40Var5 = yg40Var4;
                            simpleDateTimeH0 = h0(simpleDateTime5, calendar, yg40Var5, 1);
                        } else if (iOrdinal4 != 1) {
                            t9f.b();
                            return;
                        } else {
                            yg40Var5 = yg40Var4;
                            simpleDateTimeH0 = simpleDateTime5;
                        }
                        objV = bsr0.V(simpleDateTimeH0.f47285a, simpleDateTime3.f47285a, simpleDateTime4.f47285a);
                        fetVar2.o0(objV);
                    }
                    SimpleDate simpleDate111 = (SimpleDate) objV;
                    objP16 = fetVar2.P();
                    if (objP16 == cl5Var) {
                        objP16 = ro4.m0(220, 0, ihn.f14788a, 2);
                        fetVar2.o0(objP16);
                    }
                    uts0 uts0Var5 = (uts0) objP16;
                    int i21118 = i16 >> 3;
                    i13 = (i21118 & 896) | (i223 & 14) | ((i12 << 3) & 112) | 512 | 4096 | (i21118 & 7168) | (i21117 & 3670016) | (i21117 & 29360128) | 1207959552;
                    pz40VarF = androidx.compose.runtime.e.f(Boolean.valueOf(z), fetVar2);
                    pz40VarF2 = androidx.compose.runtime.e.f(simpleDateTime5, fetVar2);
                    pz40VarF3 = androidx.compose.runtime.e.f(simpleDateTime6, fetVar2);
                    pz40VarF4 = androidx.compose.runtime.e.f(ulq0Var, fetVar2);
                    pz40VarF5 = androidx.compose.runtime.e.f(function1, fetVar2);
                    pz40VarF6 = androidx.compose.runtime.e.f(function2, fetVar);
                    pz40VarF7 = androidx.compose.runtime.e.f(Long.valueOf(jLongValue7), fetVar2);
                    pz40VarF8 = androidx.compose.runtime.e.f(Long.valueOf(jLongValue8), fetVar2);
                    pz40VarF9 = androidx.compose.runtime.e.f(simpleDateTime3, fetVar2);
                    pz40VarF10 = androidx.compose.runtime.e.f(simpleDateTime4, fetVar2);
                    pz40VarF11 = androidx.compose.runtime.e.f(yg40Var5, fetVar2);
                    i14 = (i13 & 112) ^ 48;
                    if (i14 > 32) {
                        locale2 = locale;
                        if (!fetVar2.g(locale2)) {
                            i15 = i13;
                            simpleDateTime8 = simpleDateTime4;
                        }
                        z20 = true;
                        objP17 = fetVar2.P();
                        if (z20) {
                            objP17 = new oej(pz40VarF, pz40VarF9, pz40VarF10, pz40VarF2, pz40VarF4, calendar, pz40VarF7, pz40VarF8, pz40VarF3, pz40VarF5, pz40VarF6, pz40VarF11);
                            pz40VarF8 = pz40VarF8;
                            pz40Var = pz40VarF6;
                            pz40Var2 = pz40VarF11;
                            pz40Var3 = pz40VarF5;
                            pz40Var4 = pz40VarF10;
                            pz40VarF3 = pz40VarF3;
                            pz40Var5 = pz40VarF9;
                            pz40VarF4 = pz40VarF4;
                            pz40VarF7 = pz40VarF7;
                            fetVar2.o0(objP17);
                        } else {
                            objP17 = new oej(pz40VarF, pz40VarF9, pz40VarF10, pz40VarF2, pz40VarF4, calendar, pz40VarF7, pz40VarF8, pz40VarF3, pz40VarF5, pz40VarF6, pz40VarF11);
                            pz40VarF8 = pz40VarF8;
                            pz40Var = pz40VarF6;
                            pz40Var2 = pz40VarF11;
                            pz40Var3 = pz40VarF5;
                            pz40Var4 = pz40VarF10;
                            pz40VarF3 = pz40VarF3;
                            pz40Var5 = pz40VarF9;
                            pz40VarF4 = pz40VarF4;
                            pz40VarF7 = pz40VarF7;
                            fetVar2.o0(objP17);
                        }
                        function3 = (Function1) objP17;
                        if (i14 <= 32) {
                        }
                        objP18 = fetVar2.P();
                        if (z21) {
                            pz40 pz40Var11111111119 = pz40VarF8;
                            pz40 pz40Var211112 = pz40VarF4;
                            pz40 pz40Var211113 = pz40Var5;
                            pz40 pz40Var211114 = pz40VarF7;
                            pz40 pz40Var111111111110 = pz40VarF3;
                            pz40 pz40Var111111111111 = pz40Var4;
                            pz40 pz40Var111111111112 = pz40Var;
                            oej oejVar16 = new oej(pz40VarF, pz40Var211113, pz40Var111111111111, pz40VarF2, pz40Var111111111110, pz40Var211112, calendar, pz40Var211114, pz40Var11111111119, pz40Var111111111112, pz40Var2, pz40Var3);
                            pz40Var5 = pz40Var211113;
                            pz40VarF4 = pz40Var211112;
                            pz40VarF8 = pz40Var11111111119;
                            pz40Var4 = pz40Var111111111111;
                            pz40VarF3 = pz40Var111111111110;
                            pz40VarF7 = pz40Var211114;
                            pz40Var = pz40Var111111111112;
                            objP18 = oejVar16;
                            fetVar2.o0(objP18);
                        } else {
                            pz40 pz40Var111111111113 = pz40VarF8;
                            pz40 pz40Var211115 = pz40VarF4;
                            pz40 pz40Var211116 = pz40Var5;
                            pz40 pz40Var211117 = pz40VarF7;
                            pz40 pz40Var111111111114 = pz40VarF3;
                            pz40 pz40Var111111111115 = pz40Var4;
                            pz40 pz40Var111111111116 = pz40Var;
                            oej oejVar17 = new oej(pz40VarF, pz40Var211116, pz40Var111111111115, pz40VarF2, pz40Var111111111114, pz40Var211115, calendar, pz40Var211117, pz40Var111111111113, pz40Var111111111116, pz40Var2, pz40Var3);
                            pz40Var5 = pz40Var211116;
                            pz40VarF4 = pz40Var211115;
                            pz40VarF8 = pz40Var111111111113;
                            pz40Var4 = pz40Var111111111115;
                            pz40VarF3 = pz40Var111111111114;
                            pz40VarF7 = pz40Var211117;
                            pz40Var = pz40Var111111111116;
                            objP18 = oejVar17;
                            fetVar2.o0(objP18);
                        }
                        function4 = (Function1) objP18;
                        if (i14 <= 32) {
                        }
                        objP19 = fetVar2.P();
                        if (z22) {
                            pz40 pz40Var111111111117 = pz40Var5;
                            pz40 pz40Var1111128 = pz40Var;
                            pz40 pz40Var111111111118 = pz40Var3;
                            pz40 pz40Var1211112 = pz40Var2;
                            pz40 pz40Var1211113 = pz40Var4;
                            pz40 pz40Var1211114 = pz40VarF3;
                            pej pejVar16 = new pej(pz40VarF, pz40VarF4, pz40VarF2, calendar, pz40VarF7, pz40VarF8, pz40Var1211114, pz40Var111111111118, pz40Var1111128, pz40Var111111111117, pz40Var1211113, pz40Var1211112, (byte) 0);
                            pz40Var3 = pz40Var111111111118;
                            pz40Var = pz40Var1111128;
                            pz40Var5 = pz40Var111111111117;
                            pz40Var4 = pz40Var1211113;
                            pz40Var2 = pz40Var1211112;
                            objP19 = pejVar16;
                            pz40VarF2 = pz40VarF2;
                            pz40VarF3 = pz40Var1211114;
                            fetVar2.o0(objP19);
                        } else {
                            pz40 pz40Var111111111119 = pz40Var5;
                            pz40 pz40Var1111129 = pz40Var;
                            pz40 pz40Var1111111111110 = pz40Var3;
                            pz40 pz40Var1211115 = pz40Var2;
                            pz40 pz40Var1211116 = pz40Var4;
                            pz40 pz40Var1211117 = pz40VarF3;
                            pej pejVar17 = new pej(pz40VarF, pz40VarF4, pz40VarF2, calendar, pz40VarF7, pz40VarF8, pz40Var1211117, pz40Var1111111111110, pz40Var1111129, pz40Var111111111119, pz40Var1211116, pz40Var1211115, (byte) 0);
                            pz40Var3 = pz40Var1111111111110;
                            pz40Var = pz40Var1111129;
                            pz40Var5 = pz40Var111111111119;
                            pz40Var4 = pz40Var1211116;
                            pz40Var2 = pz40Var1211115;
                            objP19 = pejVar17;
                            pz40VarF2 = pz40VarF2;
                            pz40VarF3 = pz40Var1211117;
                            fetVar2.o0(objP19);
                        }
                        function5 = (Function2) objP19;
                        if (i14 <= 32) {
                        }
                        objP20 = fetVar2.P();
                        if (z23) {
                            objP20 = new pej(pz40VarF, pz40VarF4, pz40VarF3, calendar, pz40VarF7, pz40VarF8, pz40VarF2, pz40Var, pz40Var5, pz40Var4, pz40Var2, pz40Var3, (byte) 1);
                            fetVar2.o0(objP20);
                        } else {
                            objP20 = new pej(pz40VarF, pz40VarF4, pz40VarF3, calendar, pz40VarF7, pz40VarF8, pz40VarF2, pz40Var, pz40Var5, pz40Var4, pz40Var2, pz40Var3, (byte) 1);
                            fetVar2.o0(objP20);
                        }
                        function6 = (Function2) objP20;
                        objP21 = fetVar2.P();
                        if (objP21 == cl5Var) {
                            objP21 = new j1e0(function3, function4, function5, function6);
                            fetVar2.o0(objP21);
                        }
                        j1e0 j1e0Var9 = (j1e0) objP21;
                        int i21119 = i12 << 12;
                        int i211110 = i221 & 458752;
                        int i211111 = i221 & 3670016;
                        int i3114 = i21119 & 29360128;
                        F(simpleDateTime5, simpleDateTime6, simpleDateTime3, simpleDateTime8, locale2, ulq0Var, calendar, yg40Var5, function1, function2, fetVar2, i222 | 4608 | (i21119 & 57344) | i211110 | i211111 | i3114 | (i21119 & 234881024) | (i21119 & 1879048192));
                        yg40 yg40Var14 = yg40Var5;
                        mm40 mm40VarQ9 = i120.Q(o7k0.e(mm40Var, lej.f19905a), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
                        x5d x5dVarA9 = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                        int iHashCode9 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM9 = fetVar2.m();
                        mm40 mm40VarC8 = kbc.c0(fetVar2, mm40VarQ9);
                        mkd.c0.getClass();
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(e7z.u1);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, x5dVarA9, gqw0.x);
                        jpm0.o(fetVar2, bh90VarM9, gqw0.w);
                        jpm0.o(fetVar2, Integer.valueOf(iHashCode9), gqw0.y);
                        jpm0.n(fetVar2);
                        jpm0.o(fetVar2, mm40VarC8, gqw0.v);
                        String str111116 = cfjVar5.f4265a;
                        String str111117 = cfjVar5.c;
                        ifj ifjVar116 = (ifj) l7m0Var2.getValue();
                        am amVar116 = (am) pz40VarO.getValue();
                        zG10 = fetVar2.g(pz40VarO);
                        objP22 = fetVar2.P();
                        if (zG10) {
                            cl5Var2 = cl5Var;
                            if (objP22 == cl5Var2) {
                            }
                            Function1 function1119 = (Function1) objP22;
                            zG11 = fetVar2.g(pz40VarO2);
                            objP23 = fetVar2.P();
                            if (zG11) {
                                objP23 = new ca6(pz40VarO2, (byte) 21);
                                fetVar2.o0(objP23);
                            } else {
                                objP23 = new ca6(pz40VarO2, (byte) 21);
                                fetVar2.o0(objP23);
                            }
                            S(str, str111116, str111117, ifjVar116, z, ulq0Var, amVar116, function1119, (Function1) objP23, fetVar2, (i21118 & 14) | (i221 & 57344) | i211110);
                            String str111118 = cfjVar5.b;
                            String str111119 = cfjVar5.d;
                            am amVar117 = (am) pz40VarO.getValue();
                            ifj ifjVar117 = (ifj) l7m0Var2.getValue();
                            zG12 = fetVar2.g(pz40VarO);
                            objP24 = fetVar2.P();
                            if (zG12) {
                                objP24 = new ca6(pz40VarO, (byte) 22);
                                fetVar2.o0(objP24);
                            } else {
                                objP24 = new ca6(pz40VarO, (byte) 22);
                                fetVar2.o0(objP24);
                            }
                            Function1 function11110 = (Function1) objP24;
                            zG13 = fetVar2.g(pz40VarO2);
                            objP25 = fetVar2.P();
                            if (zG13) {
                                objP25 = new ca6(pz40VarO2, (byte) 23);
                                fetVar2.o0(objP25);
                            } else {
                                objP25 = new ca6(pz40VarO2, (byte) 23);
                                fetVar2.o0(objP25);
                            }
                            int i3115 = i16 << 3;
                            h(null, str2, str111118, str111119, locale, z, ulq0Var, amVar117, ifjVar117, jLongValue9, simpleDate111, simpleDateTime3, simpleDateTime8, simpleDateTime, simpleDateTime2, calendar, yg40Var14, j1e0Var9, uts0Var5, function11110, (Function1) objP25, fetVar2, 6 | (i16 & 896) | ((i12 << 15) & 458752) | (i21118 & 3670016) | (i21118 & 29360128), (i3115 & 458752) | (i3115 & 57344) | 805605952 | i211111 | i3114);
                            fetVar2 = fetVar2;
                            fetVar2.r(true);
                            yg40Var2 = yg40Var14;
                        } else {
                            cl5Var2 = cl5Var;
                        }
                        objP22 = new ca6(pz40VarO, (byte) 20);
                        fetVar2.o0(objP22);
                        Function1 function11111 = (Function1) objP22;
                        zG11 = fetVar2.g(pz40VarO2);
                        objP23 = fetVar2.P();
                        if (zG11) {
                            objP23 = new ca6(pz40VarO2, (byte) 21);
                            fetVar2.o0(objP23);
                        } else {
                            objP23 = new ca6(pz40VarO2, (byte) 21);
                            fetVar2.o0(objP23);
                        }
                        S(str, str111116, str111117, ifjVar116, z, ulq0Var, amVar116, function11111, (Function1) objP23, fetVar2, (i21118 & 14) | (i221 & 57344) | i211110);
                        String str1111110 = cfjVar5.b;
                        String str1111111 = cfjVar5.d;
                        am amVar118 = (am) pz40VarO.getValue();
                        ifj ifjVar118 = (ifj) l7m0Var2.getValue();
                        zG12 = fetVar2.g(pz40VarO);
                        objP24 = fetVar2.P();
                        if (zG12) {
                            objP24 = new ca6(pz40VarO, (byte) 22);
                            fetVar2.o0(objP24);
                        } else {
                            objP24 = new ca6(pz40VarO, (byte) 22);
                            fetVar2.o0(objP24);
                        }
                        Function1 function11112 = (Function1) objP24;
                        zG13 = fetVar2.g(pz40VarO2);
                        objP25 = fetVar2.P();
                        if (zG13) {
                            objP25 = new ca6(pz40VarO2, (byte) 23);
                            fetVar2.o0(objP25);
                        } else {
                            objP25 = new ca6(pz40VarO2, (byte) 23);
                            fetVar2.o0(objP25);
                        }
                        int i3116 = i16 << 3;
                        h(null, str2, str1111110, str1111111, locale, z, ulq0Var, amVar118, ifjVar118, jLongValue9, simpleDate111, simpleDateTime3, simpleDateTime8, simpleDateTime, simpleDateTime2, calendar, yg40Var14, j1e0Var9, uts0Var5, function11112, (Function1) objP25, fetVar2, 6 | (i16 & 896) | ((i12 << 15) & 458752) | (i21118 & 3670016) | (i21118 & 29360128), (i3116 & 458752) | (i3116 & 57344) | 805605952 | i211111 | i3114);
                        fetVar2 = fetVar2;
                        fetVar2.r(true);
                        yg40Var2 = yg40Var14;
                    } else {
                        locale2 = locale;
                    }
                    i15 = i13;
                    simpleDateTime8 = simpleDateTime4;
                    if ((i15 & 48) == 32) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    objP17 = fetVar2.P();
                    if (z20) {
                        objP17 = new oej(pz40VarF, pz40VarF9, pz40VarF10, pz40VarF2, pz40VarF4, calendar, pz40VarF7, pz40VarF8, pz40VarF3, pz40VarF5, pz40VarF6, pz40VarF11);
                        pz40VarF8 = pz40VarF8;
                        pz40Var = pz40VarF6;
                        pz40Var2 = pz40VarF11;
                        pz40Var3 = pz40VarF5;
                        pz40Var4 = pz40VarF10;
                        pz40VarF3 = pz40VarF3;
                        pz40Var5 = pz40VarF9;
                        pz40VarF4 = pz40VarF4;
                        pz40VarF7 = pz40VarF7;
                        fetVar2.o0(objP17);
                    } else {
                        objP17 = new oej(pz40VarF, pz40VarF9, pz40VarF10, pz40VarF2, pz40VarF4, calendar, pz40VarF7, pz40VarF8, pz40VarF3, pz40VarF5, pz40VarF6, pz40VarF11);
                        pz40VarF8 = pz40VarF8;
                        pz40Var = pz40VarF6;
                        pz40Var2 = pz40VarF11;
                        pz40Var3 = pz40VarF5;
                        pz40Var4 = pz40VarF10;
                        pz40VarF3 = pz40VarF3;
                        pz40Var5 = pz40VarF9;
                        pz40VarF4 = pz40VarF4;
                        pz40VarF7 = pz40VarF7;
                        fetVar2.o0(objP17);
                    }
                    function3 = (Function1) objP17;
                    if (i14 <= 32) {
                    }
                    objP18 = fetVar2.P();
                    if (z21) {
                        pz40 pz40Var1111111111111 = pz40VarF8;
                        pz40 pz40Var211118 = pz40VarF4;
                        pz40 pz40Var211119 = pz40Var5;
                        pz40 pz40Var2111110 = pz40VarF7;
                        pz40 pz40Var1111111111112 = pz40VarF3;
                        pz40 pz40Var1111111111113 = pz40Var4;
                        pz40 pz40Var1111111111114 = pz40Var;
                        oej oejVar18 = new oej(pz40VarF, pz40Var211119, pz40Var1111111111113, pz40VarF2, pz40Var1111111111112, pz40Var211118, calendar, pz40Var2111110, pz40Var1111111111111, pz40Var1111111111114, pz40Var2, pz40Var3);
                        pz40Var5 = pz40Var211119;
                        pz40VarF4 = pz40Var211118;
                        pz40VarF8 = pz40Var1111111111111;
                        pz40Var4 = pz40Var1111111111113;
                        pz40VarF3 = pz40Var1111111111112;
                        pz40VarF7 = pz40Var2111110;
                        pz40Var = pz40Var1111111111114;
                        objP18 = oejVar18;
                        fetVar2.o0(objP18);
                    } else {
                        pz40 pz40Var1111111111115 = pz40VarF8;
                        pz40 pz40Var2111111 = pz40VarF4;
                        pz40 pz40Var2111112 = pz40Var5;
                        pz40 pz40Var2111113 = pz40VarF7;
                        pz40 pz40Var1111111111116 = pz40VarF3;
                        pz40 pz40Var1111111111117 = pz40Var4;
                        pz40 pz40Var1111111111118 = pz40Var;
                        oej oejVar19 = new oej(pz40VarF, pz40Var2111112, pz40Var1111111111117, pz40VarF2, pz40Var1111111111116, pz40Var2111111, calendar, pz40Var2111113, pz40Var1111111111115, pz40Var1111111111118, pz40Var2, pz40Var3);
                        pz40Var5 = pz40Var2111112;
                        pz40VarF4 = pz40Var2111111;
                        pz40VarF8 = pz40Var1111111111115;
                        pz40Var4 = pz40Var1111111111117;
                        pz40VarF3 = pz40Var1111111111116;
                        pz40VarF7 = pz40Var2111113;
                        pz40Var = pz40Var1111111111118;
                        objP18 = oejVar19;
                        fetVar2.o0(objP18);
                    }
                    function4 = (Function1) objP18;
                    if (i14 <= 32) {
                    }
                    objP19 = fetVar2.P();
                    if (z22) {
                        pz40 pz40Var1111111111119 = pz40Var5;
                        pz40 pz40Var11111210 = pz40Var;
                        pz40 pz40Var11111111111110 = pz40Var3;
                        pz40 pz40Var1211118 = pz40Var2;
                        pz40 pz40Var1211119 = pz40Var4;
                        pz40 pz40Var12111110 = pz40VarF3;
                        pej pejVar18 = new pej(pz40VarF, pz40VarF4, pz40VarF2, calendar, pz40VarF7, pz40VarF8, pz40Var12111110, pz40Var11111111111110, pz40Var11111210, pz40Var1111111111119, pz40Var1211119, pz40Var1211118, (byte) 0);
                        pz40Var3 = pz40Var11111111111110;
                        pz40Var = pz40Var11111210;
                        pz40Var5 = pz40Var1111111111119;
                        pz40Var4 = pz40Var1211119;
                        pz40Var2 = pz40Var1211118;
                        objP19 = pejVar18;
                        pz40VarF2 = pz40VarF2;
                        pz40VarF3 = pz40Var12111110;
                        fetVar2.o0(objP19);
                    } else {
                        pz40 pz40Var11111111111111 = pz40Var5;
                        pz40 pz40Var11111211 = pz40Var;
                        pz40 pz40Var11111111111112 = pz40Var3;
                        pz40 pz40Var12111111 = pz40Var2;
                        pz40 pz40Var12111112 = pz40Var4;
                        pz40 pz40Var12111113 = pz40VarF3;
                        pej pejVar19 = new pej(pz40VarF, pz40VarF4, pz40VarF2, calendar, pz40VarF7, pz40VarF8, pz40Var12111113, pz40Var11111111111112, pz40Var11111211, pz40Var11111111111111, pz40Var12111112, pz40Var12111111, (byte) 0);
                        pz40Var3 = pz40Var11111111111112;
                        pz40Var = pz40Var11111211;
                        pz40Var5 = pz40Var11111111111111;
                        pz40Var4 = pz40Var12111112;
                        pz40Var2 = pz40Var12111111;
                        objP19 = pejVar19;
                        pz40VarF2 = pz40VarF2;
                        pz40VarF3 = pz40Var12111113;
                        fetVar2.o0(objP19);
                    }
                    function5 = (Function2) objP19;
                    if (i14 <= 32) {
                    }
                    objP20 = fetVar2.P();
                    if (z23) {
                        objP20 = new pej(pz40VarF, pz40VarF4, pz40VarF3, calendar, pz40VarF7, pz40VarF8, pz40VarF2, pz40Var, pz40Var5, pz40Var4, pz40Var2, pz40Var3, (byte) 1);
                        fetVar2.o0(objP20);
                    } else {
                        objP20 = new pej(pz40VarF, pz40VarF4, pz40VarF3, calendar, pz40VarF7, pz40VarF8, pz40VarF2, pz40Var, pz40Var5, pz40Var4, pz40Var2, pz40Var3, (byte) 1);
                        fetVar2.o0(objP20);
                    }
                    function6 = (Function2) objP20;
                    objP21 = fetVar2.P();
                    if (objP21 == cl5Var) {
                        objP21 = new j1e0(function3, function4, function5, function6);
                        fetVar2.o0(objP21);
                    }
                    j1e0 j1e0Var10 = (j1e0) objP21;
                    int i211112 = i12 << 12;
                    int i211113 = i221 & 458752;
                    int i211114 = i221 & 3670016;
                    int i3117 = i211112 & 29360128;
                    F(simpleDateTime5, simpleDateTime6, simpleDateTime3, simpleDateTime8, locale2, ulq0Var, calendar, yg40Var5, function1, function2, fetVar2, i222 | 4608 | (i211112 & 57344) | i211113 | i211114 | i3117 | (i211112 & 234881024) | (i211112 & 1879048192));
                    yg40 yg40Var15 = yg40Var5;
                    mm40 mm40VarQ10 = i120.Q(o7k0.e(mm40Var, lej.f19905a), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
                    x5d x5dVarA10 = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                    int iHashCode10 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM10 = fetVar2.m();
                    mm40 mm40VarC9 = kbc.c0(fetVar2, mm40VarQ10);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(e7z.u1);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA10, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM10, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode10), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC9, gqw0.v);
                    String str1111112 = cfjVar5.f4265a;
                    String str1111113 = cfjVar5.c;
                    ifj ifjVar119 = (ifj) l7m0Var2.getValue();
                    am amVar119 = (am) pz40VarO.getValue();
                    zG10 = fetVar2.g(pz40VarO);
                    objP22 = fetVar2.P();
                    if (zG10) {
                        cl5Var2 = cl5Var;
                        if (objP22 == cl5Var2) {
                        }
                        Function1 function11113 = (Function1) objP22;
                        zG11 = fetVar2.g(pz40VarO2);
                        objP23 = fetVar2.P();
                        if (zG11) {
                            objP23 = new ca6(pz40VarO2, (byte) 21);
                            fetVar2.o0(objP23);
                        } else {
                            objP23 = new ca6(pz40VarO2, (byte) 21);
                            fetVar2.o0(objP23);
                        }
                        S(str, str1111112, str1111113, ifjVar119, z, ulq0Var, amVar119, function11113, (Function1) objP23, fetVar2, (i21118 & 14) | (i221 & 57344) | i211113);
                        String str1111114 = cfjVar5.b;
                        String str1111115 = cfjVar5.d;
                        am amVar1110 = (am) pz40VarO.getValue();
                        ifj ifjVar1110 = (ifj) l7m0Var2.getValue();
                        zG12 = fetVar2.g(pz40VarO);
                        objP24 = fetVar2.P();
                        if (zG12) {
                            objP24 = new ca6(pz40VarO, (byte) 22);
                            fetVar2.o0(objP24);
                        } else {
                            objP24 = new ca6(pz40VarO, (byte) 22);
                            fetVar2.o0(objP24);
                        }
                        Function1 function11114 = (Function1) objP24;
                        zG13 = fetVar2.g(pz40VarO2);
                        objP25 = fetVar2.P();
                        if (zG13) {
                            objP25 = new ca6(pz40VarO2, (byte) 23);
                            fetVar2.o0(objP25);
                        } else {
                            objP25 = new ca6(pz40VarO2, (byte) 23);
                            fetVar2.o0(objP25);
                        }
                        int i3118 = i16 << 3;
                        h(null, str2, str1111114, str1111115, locale, z, ulq0Var, amVar1110, ifjVar1110, jLongValue9, simpleDate111, simpleDateTime3, simpleDateTime8, simpleDateTime, simpleDateTime2, calendar, yg40Var15, j1e0Var10, uts0Var5, function11114, (Function1) objP25, fetVar2, 6 | (i16 & 896) | ((i12 << 15) & 458752) | (i21118 & 3670016) | (i21118 & 29360128), (i3118 & 458752) | (i3118 & 57344) | 805605952 | i211114 | i3117);
                        fetVar2 = fetVar2;
                        fetVar2.r(true);
                        yg40Var2 = yg40Var15;
                    } else {
                        cl5Var2 = cl5Var;
                    }
                    objP22 = new ca6(pz40VarO, (byte) 20);
                    fetVar2.o0(objP22);
                    Function1 function11115 = (Function1) objP22;
                    zG11 = fetVar2.g(pz40VarO2);
                    objP23 = fetVar2.P();
                    if (zG11) {
                        objP23 = new ca6(pz40VarO2, (byte) 21);
                        fetVar2.o0(objP23);
                    } else {
                        objP23 = new ca6(pz40VarO2, (byte) 21);
                        fetVar2.o0(objP23);
                    }
                    S(str, str1111112, str1111113, ifjVar119, z, ulq0Var, amVar119, function11115, (Function1) objP23, fetVar2, (i21118 & 14) | (i221 & 57344) | i211113);
                    String str1111116 = cfjVar5.b;
                    String str1111117 = cfjVar5.d;
                    am amVar1111 = (am) pz40VarO.getValue();
                    ifj ifjVar1111 = (ifj) l7m0Var2.getValue();
                    zG12 = fetVar2.g(pz40VarO);
                    objP24 = fetVar2.P();
                    if (zG12) {
                        objP24 = new ca6(pz40VarO, (byte) 22);
                        fetVar2.o0(objP24);
                    } else {
                        objP24 = new ca6(pz40VarO, (byte) 22);
                        fetVar2.o0(objP24);
                    }
                    Function1 function11116 = (Function1) objP24;
                    zG13 = fetVar2.g(pz40VarO2);
                    objP25 = fetVar2.P();
                    if (zG13) {
                        objP25 = new ca6(pz40VarO2, (byte) 23);
                        fetVar2.o0(objP25);
                    } else {
                        objP25 = new ca6(pz40VarO2, (byte) 23);
                        fetVar2.o0(objP25);
                    }
                    int i3119 = i16 << 3;
                    h(null, str2, str1111116, str1111117, locale, z, ulq0Var, amVar1111, ifjVar1111, jLongValue9, simpleDate111, simpleDateTime3, simpleDateTime8, simpleDateTime, simpleDateTime2, calendar, yg40Var15, j1e0Var10, uts0Var5, function11116, (Function1) objP25, fetVar2, 6 | (i16 & 896) | ((i12 << 15) & 458752) | (i21118 & 3670016) | (i21118 & 29360128), (i3119 & 458752) | (i3119 & 57344) | 805605952 | i211114 | i3117);
                    fetVar2 = fetVar2;
                    fetVar2.r(true);
                    yg40Var2 = yg40Var15;
                } else {
                    simpleDateTime6 = simpleDateTime2;
                }
                i11 = i20;
                if ((i8 & 48) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zG5 = z15 | fetVar2.g(dateFormat);
                objP11 = fetVar2.P();
                if (zG5) {
                    simpleDate4 = simpleDate6;
                    wdx.J(simpleDate4, calendar);
                    objP11 = dateFormat.format(calendar.getTime());
                    fetVar2.o0(objP11);
                } else {
                    simpleDate4 = simpleDate6;
                    wdx.J(simpleDate4, calendar);
                    objP11 = dateFormat.format(calendar.getTime());
                    fetVar2.o0(objP11);
                }
                str5 = (String) objP11;
                zG6 = ((i9 <= 4 && fetVar2.g(simpleDateTime5)) || (i8 & 6) == 4) | fetVar2.g(dateFormat2);
                objP12 = fetVar2.P();
                if (zG6) {
                    wdx.I(simpleDateTime5, calendar);
                    objP12 = dateFormat2.format(calendar.getTime());
                    fetVar2.o0(objP12);
                } else {
                    wdx.I(simpleDateTime5, calendar);
                    objP12 = dateFormat2.format(calendar.getTime());
                    fetVar2.o0(objP12);
                }
                str6 = (String) objP12;
                zG7 = ((i10 <= 32 && fetVar2.g(simpleDateTime6)) || (i8 & 48) == 32) | fetVar2.g(dateFormat2);
                objP13 = fetVar2.P();
                if (zG7) {
                    wdx.I(simpleDateTime6, calendar);
                    objP13 = dateFormat2.format(calendar.getTime());
                    fetVar2.o0(objP13);
                } else {
                    wdx.I(simpleDateTime6, calendar);
                    objP13 = dateFormat2.format(calendar.getTime());
                    fetVar2.o0(objP13);
                }
                str7 = (String) objP13;
                zG8 = fetVar2.g(str4) | fetVar2.g(str5) | fetVar2.g(str6) | fetVar2.g(str7);
                objP14 = fetVar2.P();
                if (zG8) {
                    str4.getClass();
                    str5.getClass();
                    str6.getClass();
                    str7.getClass();
                    objP14 = new cfj(str4, str5, str6, str7);
                    fetVar2.o0(objP14);
                } else {
                    str4.getClass();
                    str5.getClass();
                    str6.getClass();
                    str7.getClass();
                    objP14 = new cfj(str4, str5, str6, str7);
                    fetVar2.o0(objP14);
                }
                cfj cfjVar6 = (cfj) objP14;
                amVar = (am) pz40VarO.getValue();
                int i211115 = i16 >> 6;
                zG9 = fetVar2.g(simpleDate4) | fetVar2.e(amVar.ordinal()) | fetVar2.g(simpleDate3) | fetVar2.g(calendar);
                objP15 = fetVar2.P();
                if (zG9) {
                    iOrdinal3 = amVar.ordinal();
                    if (iOrdinal3 == 0) {
                        simpleDateTime7 = simpleDateTime5;
                    } else {
                        if (iOrdinal3 != 1) {
                            t9f.b();
                            return;
                        }
                        simpleDateTime7 = simpleDateTime6;
                    }
                    wdx.J(simpleDateTime7.f47285a, calendar);
                    objP15 = Long.valueOf(calendar.getTimeInMillis());
                    fetVar2.o0(objP15);
                } else {
                    iOrdinal3 = amVar.ordinal();
                    if (iOrdinal3 == 0) {
                        simpleDateTime7 = simpleDateTime5;
                    } else {
                        if (iOrdinal3 != 1) {
                            t9f.b();
                            return;
                        }
                        simpleDateTime7 = simpleDateTime6;
                    }
                    wdx.J(simpleDateTime7.f47285a, calendar);
                    objP15 = Long.valueOf(calendar.getTimeInMillis());
                    fetVar2.o0(objP15);
                }
                long jLongValue10 = ((Number) objP15).longValue();
                SimpleDate simpleDate112 = simpleDateTime3.f47285a;
                SimpleDate simpleDate113 = simpleDateTime4.f47285a;
                if ((i16 & 7168) != 2048) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                boolean zG118 = fetVar2.g(simpleDate112) | z16 | fetVar2.g(simpleDate113);
                if (i7 == 67108864) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean zG119 = zG118 | z17 | fetVar2.g(calendar);
                i12 = i11;
                if ((i12 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zG119 | z18;
                Object objP211 = fetVar2.P();
                if (z19) {
                    iOrdinal4 = ulq0Var.ordinal();
                    if (iOrdinal4 == 0) {
                        yg40Var5 = yg40Var4;
                        simpleDateTimeH0 = h0(simpleDateTime5, calendar, yg40Var5, 1);
                    } else if (iOrdinal4 != 1) {
                        t9f.b();
                        return;
                    } else {
                        yg40Var5 = yg40Var4;
                        simpleDateTimeH0 = simpleDateTime5;
                    }
                    objV = bsr0.V(simpleDateTimeH0.f47285a, simpleDateTime3.f47285a, simpleDateTime4.f47285a);
                    fetVar2.o0(objV);
                } else {
                    iOrdinal4 = ulq0Var.ordinal();
                    if (iOrdinal4 == 0) {
                        yg40Var5 = yg40Var4;
                        simpleDateTimeH0 = h0(simpleDateTime5, calendar, yg40Var5, 1);
                    } else if (iOrdinal4 != 1) {
                        t9f.b();
                        return;
                    } else {
                        yg40Var5 = yg40Var4;
                        simpleDateTimeH0 = simpleDateTime5;
                    }
                    objV = bsr0.V(simpleDateTimeH0.f47285a, simpleDateTime3.f47285a, simpleDateTime4.f47285a);
                    fetVar2.o0(objV);
                }
                SimpleDate simpleDate114 = (SimpleDate) objV;
                objP16 = fetVar2.P();
                if (objP16 == cl5Var) {
                    objP16 = ro4.m0(220, 0, ihn.f14788a, 2);
                    fetVar2.o0(objP16);
                }
                uts0 uts0Var6 = (uts0) objP16;
                int i211116 = i16 >> 3;
                i13 = (i211116 & 896) | (i223 & 14) | ((i12 << 3) & 112) | 512 | 4096 | (i211116 & 7168) | (i211115 & 3670016) | (i211115 & 29360128) | 1207959552;
                pz40VarF = androidx.compose.runtime.e.f(Boolean.valueOf(z), fetVar2);
                pz40VarF2 = androidx.compose.runtime.e.f(simpleDateTime5, fetVar2);
                pz40VarF3 = androidx.compose.runtime.e.f(simpleDateTime6, fetVar2);
                pz40VarF4 = androidx.compose.runtime.e.f(ulq0Var, fetVar2);
                pz40VarF5 = androidx.compose.runtime.e.f(function1, fetVar2);
                pz40VarF6 = androidx.compose.runtime.e.f(function2, fetVar);
                pz40VarF7 = androidx.compose.runtime.e.f(Long.valueOf(jLongValue7), fetVar2);
                pz40VarF8 = androidx.compose.runtime.e.f(Long.valueOf(jLongValue8), fetVar2);
                pz40VarF9 = androidx.compose.runtime.e.f(simpleDateTime3, fetVar2);
                pz40VarF10 = androidx.compose.runtime.e.f(simpleDateTime4, fetVar2);
                pz40VarF11 = androidx.compose.runtime.e.f(yg40Var5, fetVar2);
                i14 = (i13 & 112) ^ 48;
                if (i14 > 32) {
                    locale2 = locale;
                    if (!fetVar2.g(locale2)) {
                        i15 = i13;
                        simpleDateTime8 = simpleDateTime4;
                    }
                    z20 = true;
                    objP17 = fetVar2.P();
                    if (z20) {
                        objP17 = new oej(pz40VarF, pz40VarF9, pz40VarF10, pz40VarF2, pz40VarF4, calendar, pz40VarF7, pz40VarF8, pz40VarF3, pz40VarF5, pz40VarF6, pz40VarF11);
                        pz40VarF8 = pz40VarF8;
                        pz40Var = pz40VarF6;
                        pz40Var2 = pz40VarF11;
                        pz40Var3 = pz40VarF5;
                        pz40Var4 = pz40VarF10;
                        pz40VarF3 = pz40VarF3;
                        pz40Var5 = pz40VarF9;
                        pz40VarF4 = pz40VarF4;
                        pz40VarF7 = pz40VarF7;
                        fetVar2.o0(objP17);
                    } else {
                        objP17 = new oej(pz40VarF, pz40VarF9, pz40VarF10, pz40VarF2, pz40VarF4, calendar, pz40VarF7, pz40VarF8, pz40VarF3, pz40VarF5, pz40VarF6, pz40VarF11);
                        pz40VarF8 = pz40VarF8;
                        pz40Var = pz40VarF6;
                        pz40Var2 = pz40VarF11;
                        pz40Var3 = pz40VarF5;
                        pz40Var4 = pz40VarF10;
                        pz40VarF3 = pz40VarF3;
                        pz40Var5 = pz40VarF9;
                        pz40VarF4 = pz40VarF4;
                        pz40VarF7 = pz40VarF7;
                        fetVar2.o0(objP17);
                    }
                    function3 = (Function1) objP17;
                    if (i14 <= 32) {
                    }
                    objP18 = fetVar2.P();
                    if (z21) {
                        pz40 pz40Var11111111111113 = pz40VarF8;
                        pz40 pz40Var2111114 = pz40VarF4;
                        pz40 pz40Var2111115 = pz40Var5;
                        pz40 pz40Var2111116 = pz40VarF7;
                        pz40 pz40Var11111111111114 = pz40VarF3;
                        pz40 pz40Var11111111111115 = pz40Var4;
                        pz40 pz40Var11111111111116 = pz40Var;
                        oej oejVar110 = new oej(pz40VarF, pz40Var2111115, pz40Var11111111111115, pz40VarF2, pz40Var11111111111114, pz40Var2111114, calendar, pz40Var2111116, pz40Var11111111111113, pz40Var11111111111116, pz40Var2, pz40Var3);
                        pz40Var5 = pz40Var2111115;
                        pz40VarF4 = pz40Var2111114;
                        pz40VarF8 = pz40Var11111111111113;
                        pz40Var4 = pz40Var11111111111115;
                        pz40VarF3 = pz40Var11111111111114;
                        pz40VarF7 = pz40Var2111116;
                        pz40Var = pz40Var11111111111116;
                        objP18 = oejVar110;
                        fetVar2.o0(objP18);
                    } else {
                        pz40 pz40Var11111111111117 = pz40VarF8;
                        pz40 pz40Var2111117 = pz40VarF4;
                        pz40 pz40Var2111118 = pz40Var5;
                        pz40 pz40Var2111119 = pz40VarF7;
                        pz40 pz40Var11111111111118 = pz40VarF3;
                        pz40 pz40Var11111111111119 = pz40Var4;
                        pz40 pz40Var111111111111110 = pz40Var;
                        oej oejVar111 = new oej(pz40VarF, pz40Var2111118, pz40Var11111111111119, pz40VarF2, pz40Var11111111111118, pz40Var2111117, calendar, pz40Var2111119, pz40Var11111111111117, pz40Var111111111111110, pz40Var2, pz40Var3);
                        pz40Var5 = pz40Var2111118;
                        pz40VarF4 = pz40Var2111117;
                        pz40VarF8 = pz40Var11111111111117;
                        pz40Var4 = pz40Var11111111111119;
                        pz40VarF3 = pz40Var11111111111118;
                        pz40VarF7 = pz40Var2111119;
                        pz40Var = pz40Var111111111111110;
                        objP18 = oejVar111;
                        fetVar2.o0(objP18);
                    }
                    function4 = (Function1) objP18;
                    if (i14 <= 32) {
                    }
                    objP19 = fetVar2.P();
                    if (z22) {
                        pz40 pz40Var111111111111111 = pz40Var5;
                        pz40 pz40Var11111212 = pz40Var;
                        pz40 pz40Var111111111111112 = pz40Var3;
                        pz40 pz40Var12111114 = pz40Var2;
                        pz40 pz40Var12111115 = pz40Var4;
                        pz40 pz40Var12111116 = pz40VarF3;
                        pej pejVar110 = new pej(pz40VarF, pz40VarF4, pz40VarF2, calendar, pz40VarF7, pz40VarF8, pz40Var12111116, pz40Var111111111111112, pz40Var11111212, pz40Var111111111111111, pz40Var12111115, pz40Var12111114, (byte) 0);
                        pz40Var3 = pz40Var111111111111112;
                        pz40Var = pz40Var11111212;
                        pz40Var5 = pz40Var111111111111111;
                        pz40Var4 = pz40Var12111115;
                        pz40Var2 = pz40Var12111114;
                        objP19 = pejVar110;
                        pz40VarF2 = pz40VarF2;
                        pz40VarF3 = pz40Var12111116;
                        fetVar2.o0(objP19);
                    } else {
                        pz40 pz40Var111111111111113 = pz40Var5;
                        pz40 pz40Var11111213 = pz40Var;
                        pz40 pz40Var111111111111114 = pz40Var3;
                        pz40 pz40Var12111117 = pz40Var2;
                        pz40 pz40Var12111118 = pz40Var4;
                        pz40 pz40Var12111119 = pz40VarF3;
                        pej pejVar111 = new pej(pz40VarF, pz40VarF4, pz40VarF2, calendar, pz40VarF7, pz40VarF8, pz40Var12111119, pz40Var111111111111114, pz40Var11111213, pz40Var111111111111113, pz40Var12111118, pz40Var12111117, (byte) 0);
                        pz40Var3 = pz40Var111111111111114;
                        pz40Var = pz40Var11111213;
                        pz40Var5 = pz40Var111111111111113;
                        pz40Var4 = pz40Var12111118;
                        pz40Var2 = pz40Var12111117;
                        objP19 = pejVar111;
                        pz40VarF2 = pz40VarF2;
                        pz40VarF3 = pz40Var12111119;
                        fetVar2.o0(objP19);
                    }
                    function5 = (Function2) objP19;
                    if (i14 <= 32) {
                    }
                    objP20 = fetVar2.P();
                    if (z23) {
                        objP20 = new pej(pz40VarF, pz40VarF4, pz40VarF3, calendar, pz40VarF7, pz40VarF8, pz40VarF2, pz40Var, pz40Var5, pz40Var4, pz40Var2, pz40Var3, (byte) 1);
                        fetVar2.o0(objP20);
                    } else {
                        objP20 = new pej(pz40VarF, pz40VarF4, pz40VarF3, calendar, pz40VarF7, pz40VarF8, pz40VarF2, pz40Var, pz40Var5, pz40Var4, pz40Var2, pz40Var3, (byte) 1);
                        fetVar2.o0(objP20);
                    }
                    function6 = (Function2) objP20;
                    objP21 = fetVar2.P();
                    if (objP21 == cl5Var) {
                        objP21 = new j1e0(function3, function4, function5, function6);
                        fetVar2.o0(objP21);
                    }
                    j1e0 j1e0Var11 = (j1e0) objP21;
                    int i211117 = i12 << 12;
                    int i211118 = i221 & 458752;
                    int i211119 = i221 & 3670016;
                    int i31110 = i211117 & 29360128;
                    F(simpleDateTime5, simpleDateTime6, simpleDateTime3, simpleDateTime8, locale2, ulq0Var, calendar, yg40Var5, function1, function2, fetVar2, i222 | 4608 | (i211117 & 57344) | i211118 | i211119 | i31110 | (i211117 & 234881024) | (i211117 & 1879048192));
                    yg40 yg40Var16 = yg40Var5;
                    mm40 mm40VarQ11 = i120.Q(o7k0.e(mm40Var, lej.f19905a), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
                    x5d x5dVarA11 = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                    int iHashCode11 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM11 = fetVar2.m();
                    mm40 mm40VarC10 = kbc.c0(fetVar2, mm40VarQ11);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(e7z.u1);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA11, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM11, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode11), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC10, gqw0.v);
                    String str1111118 = cfjVar6.f4265a;
                    String str1111119 = cfjVar6.c;
                    ifj ifjVar1112 = (ifj) l7m0Var2.getValue();
                    am amVar1112 = (am) pz40VarO.getValue();
                    zG10 = fetVar2.g(pz40VarO);
                    objP22 = fetVar2.P();
                    if (zG10) {
                        cl5Var2 = cl5Var;
                        if (objP22 == cl5Var2) {
                        }
                        Function1 function11117 = (Function1) objP22;
                        zG11 = fetVar2.g(pz40VarO2);
                        objP23 = fetVar2.P();
                        if (zG11) {
                            objP23 = new ca6(pz40VarO2, (byte) 21);
                            fetVar2.o0(objP23);
                        } else {
                            objP23 = new ca6(pz40VarO2, (byte) 21);
                            fetVar2.o0(objP23);
                        }
                        S(str, str1111118, str1111119, ifjVar1112, z, ulq0Var, amVar1112, function11117, (Function1) objP23, fetVar2, (i211116 & 14) | (i221 & 57344) | i211118);
                        String str11111110 = cfjVar6.b;
                        String str11111111 = cfjVar6.d;
                        am amVar1113 = (am) pz40VarO.getValue();
                        ifj ifjVar1113 = (ifj) l7m0Var2.getValue();
                        zG12 = fetVar2.g(pz40VarO);
                        objP24 = fetVar2.P();
                        if (zG12) {
                            objP24 = new ca6(pz40VarO, (byte) 22);
                            fetVar2.o0(objP24);
                        } else {
                            objP24 = new ca6(pz40VarO, (byte) 22);
                            fetVar2.o0(objP24);
                        }
                        Function1 function11118 = (Function1) objP24;
                        zG13 = fetVar2.g(pz40VarO2);
                        objP25 = fetVar2.P();
                        if (zG13) {
                            objP25 = new ca6(pz40VarO2, (byte) 23);
                            fetVar2.o0(objP25);
                        } else {
                            objP25 = new ca6(pz40VarO2, (byte) 23);
                            fetVar2.o0(objP25);
                        }
                        int i31111 = i16 << 3;
                        h(null, str2, str11111110, str11111111, locale, z, ulq0Var, amVar1113, ifjVar1113, jLongValue10, simpleDate114, simpleDateTime3, simpleDateTime8, simpleDateTime, simpleDateTime2, calendar, yg40Var16, j1e0Var11, uts0Var6, function11118, (Function1) objP25, fetVar2, 6 | (i16 & 896) | ((i12 << 15) & 458752) | (i211116 & 3670016) | (i211116 & 29360128), (i31111 & 458752) | (i31111 & 57344) | 805605952 | i211119 | i31110);
                        fetVar2 = fetVar2;
                        fetVar2.r(true);
                        yg40Var2 = yg40Var16;
                    } else {
                        cl5Var2 = cl5Var;
                    }
                    objP22 = new ca6(pz40VarO, (byte) 20);
                    fetVar2.o0(objP22);
                    Function1 function11119 = (Function1) objP22;
                    zG11 = fetVar2.g(pz40VarO2);
                    objP23 = fetVar2.P();
                    if (zG11) {
                        objP23 = new ca6(pz40VarO2, (byte) 21);
                        fetVar2.o0(objP23);
                    } else {
                        objP23 = new ca6(pz40VarO2, (byte) 21);
                        fetVar2.o0(objP23);
                    }
                    S(str, str1111118, str1111119, ifjVar1112, z, ulq0Var, amVar1112, function11119, (Function1) objP23, fetVar2, (i211116 & 14) | (i221 & 57344) | i211118);
                    String str11111112 = cfjVar6.b;
                    String str11111113 = cfjVar6.d;
                    am amVar1114 = (am) pz40VarO.getValue();
                    ifj ifjVar1114 = (ifj) l7m0Var2.getValue();
                    zG12 = fetVar2.g(pz40VarO);
                    objP24 = fetVar2.P();
                    if (zG12) {
                        objP24 = new ca6(pz40VarO, (byte) 22);
                        fetVar2.o0(objP24);
                    } else {
                        objP24 = new ca6(pz40VarO, (byte) 22);
                        fetVar2.o0(objP24);
                    }
                    Function1 function111110 = (Function1) objP24;
                    zG13 = fetVar2.g(pz40VarO2);
                    objP25 = fetVar2.P();
                    if (zG13) {
                        objP25 = new ca6(pz40VarO2, (byte) 23);
                        fetVar2.o0(objP25);
                    } else {
                        objP25 = new ca6(pz40VarO2, (byte) 23);
                        fetVar2.o0(objP25);
                    }
                    int i31112 = i16 << 3;
                    h(null, str2, str11111112, str11111113, locale, z, ulq0Var, amVar1114, ifjVar1114, jLongValue10, simpleDate114, simpleDateTime3, simpleDateTime8, simpleDateTime, simpleDateTime2, calendar, yg40Var16, j1e0Var11, uts0Var6, function111110, (Function1) objP25, fetVar2, 6 | (i16 & 896) | ((i12 << 15) & 458752) | (i211116 & 3670016) | (i211116 & 29360128), (i31112 & 458752) | (i31112 & 57344) | 805605952 | i211119 | i31110);
                    fetVar2 = fetVar2;
                    fetVar2.r(true);
                    yg40Var2 = yg40Var16;
                } else {
                    locale2 = locale;
                }
                i15 = i13;
                simpleDateTime8 = simpleDateTime4;
                if ((i15 & 48) == 32) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                objP17 = fetVar2.P();
                if (z20) {
                    objP17 = new oej(pz40VarF, pz40VarF9, pz40VarF10, pz40VarF2, pz40VarF4, calendar, pz40VarF7, pz40VarF8, pz40VarF3, pz40VarF5, pz40VarF6, pz40VarF11);
                    pz40VarF8 = pz40VarF8;
                    pz40Var = pz40VarF6;
                    pz40Var2 = pz40VarF11;
                    pz40Var3 = pz40VarF5;
                    pz40Var4 = pz40VarF10;
                    pz40VarF3 = pz40VarF3;
                    pz40Var5 = pz40VarF9;
                    pz40VarF4 = pz40VarF4;
                    pz40VarF7 = pz40VarF7;
                    fetVar2.o0(objP17);
                } else {
                    objP17 = new oej(pz40VarF, pz40VarF9, pz40VarF10, pz40VarF2, pz40VarF4, calendar, pz40VarF7, pz40VarF8, pz40VarF3, pz40VarF5, pz40VarF6, pz40VarF11);
                    pz40VarF8 = pz40VarF8;
                    pz40Var = pz40VarF6;
                    pz40Var2 = pz40VarF11;
                    pz40Var3 = pz40VarF5;
                    pz40Var4 = pz40VarF10;
                    pz40VarF3 = pz40VarF3;
                    pz40Var5 = pz40VarF9;
                    pz40VarF4 = pz40VarF4;
                    pz40VarF7 = pz40VarF7;
                    fetVar2.o0(objP17);
                }
                function3 = (Function1) objP17;
                if (i14 <= 32) {
                }
                objP18 = fetVar2.P();
                if (z21) {
                    pz40 pz40Var111111111111115 = pz40VarF8;
                    pz40 pz40Var21111110 = pz40VarF4;
                    pz40 pz40Var21111111 = pz40Var5;
                    pz40 pz40Var21111112 = pz40VarF7;
                    pz40 pz40Var111111111111116 = pz40VarF3;
                    pz40 pz40Var111111111111117 = pz40Var4;
                    pz40 pz40Var111111111111118 = pz40Var;
                    oej oejVar112 = new oej(pz40VarF, pz40Var21111111, pz40Var111111111111117, pz40VarF2, pz40Var111111111111116, pz40Var21111110, calendar, pz40Var21111112, pz40Var111111111111115, pz40Var111111111111118, pz40Var2, pz40Var3);
                    pz40Var5 = pz40Var21111111;
                    pz40VarF4 = pz40Var21111110;
                    pz40VarF8 = pz40Var111111111111115;
                    pz40Var4 = pz40Var111111111111117;
                    pz40VarF3 = pz40Var111111111111116;
                    pz40VarF7 = pz40Var21111112;
                    pz40Var = pz40Var111111111111118;
                    objP18 = oejVar112;
                    fetVar2.o0(objP18);
                } else {
                    pz40 pz40Var111111111111119 = pz40VarF8;
                    pz40 pz40Var21111113 = pz40VarF4;
                    pz40 pz40Var21111114 = pz40Var5;
                    pz40 pz40Var21111115 = pz40VarF7;
                    pz40 pz40Var1111111111111110 = pz40VarF3;
                    pz40 pz40Var1111111111111111 = pz40Var4;
                    pz40 pz40Var1111111111111112 = pz40Var;
                    oej oejVar113 = new oej(pz40VarF, pz40Var21111114, pz40Var1111111111111111, pz40VarF2, pz40Var1111111111111110, pz40Var21111113, calendar, pz40Var21111115, pz40Var111111111111119, pz40Var1111111111111112, pz40Var2, pz40Var3);
                    pz40Var5 = pz40Var21111114;
                    pz40VarF4 = pz40Var21111113;
                    pz40VarF8 = pz40Var111111111111119;
                    pz40Var4 = pz40Var1111111111111111;
                    pz40VarF3 = pz40Var1111111111111110;
                    pz40VarF7 = pz40Var21111115;
                    pz40Var = pz40Var1111111111111112;
                    objP18 = oejVar113;
                    fetVar2.o0(objP18);
                }
                function4 = (Function1) objP18;
                if (i14 <= 32) {
                }
                objP19 = fetVar2.P();
                if (z22) {
                    pz40 pz40Var1111111111111113 = pz40Var5;
                    pz40 pz40Var11111214 = pz40Var;
                    pz40 pz40Var1111111111111114 = pz40Var3;
                    pz40 pz40Var121111110 = pz40Var2;
                    pz40 pz40Var121111111 = pz40Var4;
                    pz40 pz40Var121111112 = pz40VarF3;
                    pej pejVar112 = new pej(pz40VarF, pz40VarF4, pz40VarF2, calendar, pz40VarF7, pz40VarF8, pz40Var121111112, pz40Var1111111111111114, pz40Var11111214, pz40Var1111111111111113, pz40Var121111111, pz40Var121111110, (byte) 0);
                    pz40Var3 = pz40Var1111111111111114;
                    pz40Var = pz40Var11111214;
                    pz40Var5 = pz40Var1111111111111113;
                    pz40Var4 = pz40Var121111111;
                    pz40Var2 = pz40Var121111110;
                    objP19 = pejVar112;
                    pz40VarF2 = pz40VarF2;
                    pz40VarF3 = pz40Var121111112;
                    fetVar2.o0(objP19);
                } else {
                    pz40 pz40Var1111111111111115 = pz40Var5;
                    pz40 pz40Var11111215 = pz40Var;
                    pz40 pz40Var1111111111111116 = pz40Var3;
                    pz40 pz40Var121111113 = pz40Var2;
                    pz40 pz40Var121111114 = pz40Var4;
                    pz40 pz40Var121111115 = pz40VarF3;
                    pej pejVar113 = new pej(pz40VarF, pz40VarF4, pz40VarF2, calendar, pz40VarF7, pz40VarF8, pz40Var121111115, pz40Var1111111111111116, pz40Var11111215, pz40Var1111111111111115, pz40Var121111114, pz40Var121111113, (byte) 0);
                    pz40Var3 = pz40Var1111111111111116;
                    pz40Var = pz40Var11111215;
                    pz40Var5 = pz40Var1111111111111115;
                    pz40Var4 = pz40Var121111114;
                    pz40Var2 = pz40Var121111113;
                    objP19 = pejVar113;
                    pz40VarF2 = pz40VarF2;
                    pz40VarF3 = pz40Var121111115;
                    fetVar2.o0(objP19);
                }
                function5 = (Function2) objP19;
                if (i14 <= 32) {
                }
                objP20 = fetVar2.P();
                if (z23) {
                    objP20 = new pej(pz40VarF, pz40VarF4, pz40VarF3, calendar, pz40VarF7, pz40VarF8, pz40VarF2, pz40Var, pz40Var5, pz40Var4, pz40Var2, pz40Var3, (byte) 1);
                    fetVar2.o0(objP20);
                } else {
                    objP20 = new pej(pz40VarF, pz40VarF4, pz40VarF3, calendar, pz40VarF7, pz40VarF8, pz40VarF2, pz40Var, pz40Var5, pz40Var4, pz40Var2, pz40Var3, (byte) 1);
                    fetVar2.o0(objP20);
                }
                function6 = (Function2) objP20;
                objP21 = fetVar2.P();
                if (objP21 == cl5Var) {
                    objP21 = new j1e0(function3, function4, function5, function6);
                    fetVar2.o0(objP21);
                }
                j1e0 j1e0Var12 = (j1e0) objP21;
                int i2111110 = i12 << 12;
                int i2111111 = i221 & 458752;
                int i2111112 = i221 & 3670016;
                int i31113 = i2111110 & 29360128;
                F(simpleDateTime5, simpleDateTime6, simpleDateTime3, simpleDateTime8, locale2, ulq0Var, calendar, yg40Var5, function1, function2, fetVar2, i222 | 4608 | (i2111110 & 57344) | i2111111 | i2111112 | i31113 | (i2111110 & 234881024) | (i2111110 & 1879048192));
                yg40 yg40Var17 = yg40Var5;
                mm40 mm40VarQ12 = i120.Q(o7k0.e(mm40Var, lej.f19905a), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
                x5d x5dVarA12 = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                int iHashCode12 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM12 = fetVar2.m();
                mm40 mm40VarC11 = kbc.c0(fetVar2, mm40VarQ12);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(e7z.u1);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, x5dVarA12, gqw0.x);
                jpm0.o(fetVar2, bh90VarM12, gqw0.w);
                jpm0.o(fetVar2, Integer.valueOf(iHashCode12), gqw0.y);
                jpm0.n(fetVar2);
                jpm0.o(fetVar2, mm40VarC11, gqw0.v);
                String str11111114 = cfjVar6.f4265a;
                String str11111115 = cfjVar6.c;
                ifj ifjVar1115 = (ifj) l7m0Var2.getValue();
                am amVar1115 = (am) pz40VarO.getValue();
                zG10 = fetVar2.g(pz40VarO);
                objP22 = fetVar2.P();
                if (zG10) {
                    cl5Var2 = cl5Var;
                    if (objP22 == cl5Var2) {
                    }
                    Function1 function111111 = (Function1) objP22;
                    zG11 = fetVar2.g(pz40VarO2);
                    objP23 = fetVar2.P();
                    if (zG11) {
                        objP23 = new ca6(pz40VarO2, (byte) 21);
                        fetVar2.o0(objP23);
                    } else {
                        objP23 = new ca6(pz40VarO2, (byte) 21);
                        fetVar2.o0(objP23);
                    }
                    S(str, str11111114, str11111115, ifjVar1115, z, ulq0Var, amVar1115, function111111, (Function1) objP23, fetVar2, (i211116 & 14) | (i221 & 57344) | i2111111);
                    String str11111116 = cfjVar6.b;
                    String str11111117 = cfjVar6.d;
                    am amVar1116 = (am) pz40VarO.getValue();
                    ifj ifjVar1116 = (ifj) l7m0Var2.getValue();
                    zG12 = fetVar2.g(pz40VarO);
                    objP24 = fetVar2.P();
                    if (zG12) {
                        objP24 = new ca6(pz40VarO, (byte) 22);
                        fetVar2.o0(objP24);
                    } else {
                        objP24 = new ca6(pz40VarO, (byte) 22);
                        fetVar2.o0(objP24);
                    }
                    Function1 function111112 = (Function1) objP24;
                    zG13 = fetVar2.g(pz40VarO2);
                    objP25 = fetVar2.P();
                    if (zG13) {
                        objP25 = new ca6(pz40VarO2, (byte) 23);
                        fetVar2.o0(objP25);
                    } else {
                        objP25 = new ca6(pz40VarO2, (byte) 23);
                        fetVar2.o0(objP25);
                    }
                    int i31114 = i16 << 3;
                    h(null, str2, str11111116, str11111117, locale, z, ulq0Var, amVar1116, ifjVar1116, jLongValue10, simpleDate114, simpleDateTime3, simpleDateTime8, simpleDateTime, simpleDateTime2, calendar, yg40Var17, j1e0Var12, uts0Var6, function111112, (Function1) objP25, fetVar2, 6 | (i16 & 896) | ((i12 << 15) & 458752) | (i211116 & 3670016) | (i211116 & 29360128), (i31114 & 458752) | (i31114 & 57344) | 805605952 | i2111112 | i31113);
                    fetVar2 = fetVar2;
                    fetVar2.r(true);
                    yg40Var2 = yg40Var17;
                } else {
                    cl5Var2 = cl5Var;
                }
                objP22 = new ca6(pz40VarO, (byte) 20);
                fetVar2.o0(objP22);
                Function1 function111113 = (Function1) objP22;
                zG11 = fetVar2.g(pz40VarO2);
                objP23 = fetVar2.P();
                if (zG11) {
                    objP23 = new ca6(pz40VarO2, (byte) 21);
                    fetVar2.o0(objP23);
                } else {
                    objP23 = new ca6(pz40VarO2, (byte) 21);
                    fetVar2.o0(objP23);
                }
                S(str, str11111114, str11111115, ifjVar1115, z, ulq0Var, amVar1115, function111113, (Function1) objP23, fetVar2, (i211116 & 14) | (i221 & 57344) | i2111111);
                String str11111118 = cfjVar6.b;
                String str11111119 = cfjVar6.d;
                am amVar1117 = (am) pz40VarO.getValue();
                ifj ifjVar1117 = (ifj) l7m0Var2.getValue();
                zG12 = fetVar2.g(pz40VarO);
                objP24 = fetVar2.P();
                if (zG12) {
                    objP24 = new ca6(pz40VarO, (byte) 22);
                    fetVar2.o0(objP24);
                } else {
                    objP24 = new ca6(pz40VarO, (byte) 22);
                    fetVar2.o0(objP24);
                }
                Function1 function111114 = (Function1) objP24;
                zG13 = fetVar2.g(pz40VarO2);
                objP25 = fetVar2.P();
                if (zG13) {
                    objP25 = new ca6(pz40VarO2, (byte) 23);
                    fetVar2.o0(objP25);
                } else {
                    objP25 = new ca6(pz40VarO2, (byte) 23);
                    fetVar2.o0(objP25);
                }
                int i31115 = i16 << 3;
                h(null, str2, str11111118, str11111119, locale, z, ulq0Var, amVar1117, ifjVar1117, jLongValue10, simpleDate114, simpleDateTime3, simpleDateTime8, simpleDateTime, simpleDateTime2, calendar, yg40Var17, j1e0Var12, uts0Var6, function111114, (Function1) objP25, fetVar2, 6 | (i16 & 896) | ((i12 << 15) & 458752) | (i211116 & 3670016) | (i211116 & 29360128), (i31115 & 458752) | (i31115 & 57344) | 805605952 | i2111112 | i31113);
                fetVar2 = fetVar2;
                fetVar2.r(true);
                yg40Var2 = yg40Var17;
            } else {
                simpleDateTime5 = simpleDateTime;
            }
            if ((i8 & 6) == 4) {
                z14 = true;
            } else {
                z14 = false;
            }
            zG4 = z14 | fetVar2.g(dateFormat);
            objP10 = fetVar2.P();
            if (zG4) {
                simpleDate3 = simpleDate5;
                wdx.J(simpleDate3, calendar);
                objP10 = dateFormat.format(calendar.getTime());
                fetVar2.o0(objP10);
            } else {
                simpleDate3 = simpleDate5;
                wdx.J(simpleDate3, calendar);
                objP10 = dateFormat.format(calendar.getTime());
                fetVar2.o0(objP10);
            }
            str4 = (String) objP10;
            i10 = (i8 & 112) ^ 48;
            if (i10 > 32) {
                simpleDateTime6 = simpleDateTime2;
                if (!fetVar2.g(simpleDateTime6)) {
                    i11 = i20;
                }
                z15 = true;
                zG5 = z15 | fetVar2.g(dateFormat);
                objP11 = fetVar2.P();
                if (zG5) {
                    simpleDate4 = simpleDate6;
                    wdx.J(simpleDate4, calendar);
                    objP11 = dateFormat.format(calendar.getTime());
                    fetVar2.o0(objP11);
                } else {
                    simpleDate4 = simpleDate6;
                    wdx.J(simpleDate4, calendar);
                    objP11 = dateFormat.format(calendar.getTime());
                    fetVar2.o0(objP11);
                }
                str5 = (String) objP11;
                zG6 = ((i9 <= 4 && fetVar2.g(simpleDateTime5)) || (i8 & 6) == 4) | fetVar2.g(dateFormat2);
                objP12 = fetVar2.P();
                if (zG6) {
                    wdx.I(simpleDateTime5, calendar);
                    objP12 = dateFormat2.format(calendar.getTime());
                    fetVar2.o0(objP12);
                } else {
                    wdx.I(simpleDateTime5, calendar);
                    objP12 = dateFormat2.format(calendar.getTime());
                    fetVar2.o0(objP12);
                }
                str6 = (String) objP12;
                zG7 = ((i10 <= 32 && fetVar2.g(simpleDateTime6)) || (i8 & 48) == 32) | fetVar2.g(dateFormat2);
                objP13 = fetVar2.P();
                if (zG7) {
                    wdx.I(simpleDateTime6, calendar);
                    objP13 = dateFormat2.format(calendar.getTime());
                    fetVar2.o0(objP13);
                } else {
                    wdx.I(simpleDateTime6, calendar);
                    objP13 = dateFormat2.format(calendar.getTime());
                    fetVar2.o0(objP13);
                }
                str7 = (String) objP13;
                zG8 = fetVar2.g(str4) | fetVar2.g(str5) | fetVar2.g(str6) | fetVar2.g(str7);
                objP14 = fetVar2.P();
                if (zG8) {
                    str4.getClass();
                    str5.getClass();
                    str6.getClass();
                    str7.getClass();
                    objP14 = new cfj(str4, str5, str6, str7);
                    fetVar2.o0(objP14);
                } else {
                    str4.getClass();
                    str5.getClass();
                    str6.getClass();
                    str7.getClass();
                    objP14 = new cfj(str4, str5, str6, str7);
                    fetVar2.o0(objP14);
                }
                cfj cfjVar7 = (cfj) objP14;
                amVar = (am) pz40VarO.getValue();
                int i2111113 = i16 >> 6;
                zG9 = fetVar2.g(simpleDate4) | fetVar2.e(amVar.ordinal()) | fetVar2.g(simpleDate3) | fetVar2.g(calendar);
                objP15 = fetVar2.P();
                if (zG9) {
                    iOrdinal3 = amVar.ordinal();
                    if (iOrdinal3 == 0) {
                        simpleDateTime7 = simpleDateTime5;
                    } else {
                        if (iOrdinal3 != 1) {
                            t9f.b();
                            return;
                        }
                        simpleDateTime7 = simpleDateTime6;
                    }
                    wdx.J(simpleDateTime7.f47285a, calendar);
                    objP15 = Long.valueOf(calendar.getTimeInMillis());
                    fetVar2.o0(objP15);
                } else {
                    iOrdinal3 = amVar.ordinal();
                    if (iOrdinal3 == 0) {
                        simpleDateTime7 = simpleDateTime5;
                    } else {
                        if (iOrdinal3 != 1) {
                            t9f.b();
                            return;
                        }
                        simpleDateTime7 = simpleDateTime6;
                    }
                    wdx.J(simpleDateTime7.f47285a, calendar);
                    objP15 = Long.valueOf(calendar.getTimeInMillis());
                    fetVar2.o0(objP15);
                }
                long jLongValue11 = ((Number) objP15).longValue();
                SimpleDate simpleDate115 = simpleDateTime3.f47285a;
                SimpleDate simpleDate116 = simpleDateTime4.f47285a;
                if ((i16 & 7168) != 2048) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                boolean zG1110 = fetVar2.g(simpleDate115) | z16 | fetVar2.g(simpleDate116);
                if (i7 == 67108864) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean zG1111 = zG1110 | z17 | fetVar2.g(calendar);
                i12 = i11;
                if ((i12 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zG1111 | z18;
                Object objP212 = fetVar2.P();
                if (z19) {
                    iOrdinal4 = ulq0Var.ordinal();
                    if (iOrdinal4 == 0) {
                        yg40Var5 = yg40Var4;
                        simpleDateTimeH0 = h0(simpleDateTime5, calendar, yg40Var5, 1);
                    } else if (iOrdinal4 != 1) {
                        t9f.b();
                        return;
                    } else {
                        yg40Var5 = yg40Var4;
                        simpleDateTimeH0 = simpleDateTime5;
                    }
                    objV = bsr0.V(simpleDateTimeH0.f47285a, simpleDateTime3.f47285a, simpleDateTime4.f47285a);
                    fetVar2.o0(objV);
                } else {
                    iOrdinal4 = ulq0Var.ordinal();
                    if (iOrdinal4 == 0) {
                        yg40Var5 = yg40Var4;
                        simpleDateTimeH0 = h0(simpleDateTime5, calendar, yg40Var5, 1);
                    } else if (iOrdinal4 != 1) {
                        t9f.b();
                        return;
                    } else {
                        yg40Var5 = yg40Var4;
                        simpleDateTimeH0 = simpleDateTime5;
                    }
                    objV = bsr0.V(simpleDateTimeH0.f47285a, simpleDateTime3.f47285a, simpleDateTime4.f47285a);
                    fetVar2.o0(objV);
                }
                SimpleDate simpleDate117 = (SimpleDate) objV;
                objP16 = fetVar2.P();
                if (objP16 == cl5Var) {
                    objP16 = ro4.m0(220, 0, ihn.f14788a, 2);
                    fetVar2.o0(objP16);
                }
                uts0 uts0Var7 = (uts0) objP16;
                int i2111114 = i16 >> 3;
                i13 = (i2111114 & 896) | (i223 & 14) | ((i12 << 3) & 112) | 512 | 4096 | (i2111114 & 7168) | (i2111113 & 3670016) | (i2111113 & 29360128) | 1207959552;
                pz40VarF = androidx.compose.runtime.e.f(Boolean.valueOf(z), fetVar2);
                pz40VarF2 = androidx.compose.runtime.e.f(simpleDateTime5, fetVar2);
                pz40VarF3 = androidx.compose.runtime.e.f(simpleDateTime6, fetVar2);
                pz40VarF4 = androidx.compose.runtime.e.f(ulq0Var, fetVar2);
                pz40VarF5 = androidx.compose.runtime.e.f(function1, fetVar2);
                pz40VarF6 = androidx.compose.runtime.e.f(function2, fetVar);
                pz40VarF7 = androidx.compose.runtime.e.f(Long.valueOf(jLongValue7), fetVar2);
                pz40VarF8 = androidx.compose.runtime.e.f(Long.valueOf(jLongValue8), fetVar2);
                pz40VarF9 = androidx.compose.runtime.e.f(simpleDateTime3, fetVar2);
                pz40VarF10 = androidx.compose.runtime.e.f(simpleDateTime4, fetVar2);
                pz40VarF11 = androidx.compose.runtime.e.f(yg40Var5, fetVar2);
                i14 = (i13 & 112) ^ 48;
                if (i14 > 32) {
                    locale2 = locale;
                    if (!fetVar2.g(locale2)) {
                        i15 = i13;
                        simpleDateTime8 = simpleDateTime4;
                    }
                    z20 = true;
                    objP17 = fetVar2.P();
                    if (z20) {
                        objP17 = new oej(pz40VarF, pz40VarF9, pz40VarF10, pz40VarF2, pz40VarF4, calendar, pz40VarF7, pz40VarF8, pz40VarF3, pz40VarF5, pz40VarF6, pz40VarF11);
                        pz40VarF8 = pz40VarF8;
                        pz40Var = pz40VarF6;
                        pz40Var2 = pz40VarF11;
                        pz40Var3 = pz40VarF5;
                        pz40Var4 = pz40VarF10;
                        pz40VarF3 = pz40VarF3;
                        pz40Var5 = pz40VarF9;
                        pz40VarF4 = pz40VarF4;
                        pz40VarF7 = pz40VarF7;
                        fetVar2.o0(objP17);
                    } else {
                        objP17 = new oej(pz40VarF, pz40VarF9, pz40VarF10, pz40VarF2, pz40VarF4, calendar, pz40VarF7, pz40VarF8, pz40VarF3, pz40VarF5, pz40VarF6, pz40VarF11);
                        pz40VarF8 = pz40VarF8;
                        pz40Var = pz40VarF6;
                        pz40Var2 = pz40VarF11;
                        pz40Var3 = pz40VarF5;
                        pz40Var4 = pz40VarF10;
                        pz40VarF3 = pz40VarF3;
                        pz40Var5 = pz40VarF9;
                        pz40VarF4 = pz40VarF4;
                        pz40VarF7 = pz40VarF7;
                        fetVar2.o0(objP17);
                    }
                    function3 = (Function1) objP17;
                    if (i14 <= 32) {
                    }
                    objP18 = fetVar2.P();
                    if (z21) {
                        pz40 pz40Var1111111111111117 = pz40VarF8;
                        pz40 pz40Var21111116 = pz40VarF4;
                        pz40 pz40Var21111117 = pz40Var5;
                        pz40 pz40Var21111118 = pz40VarF7;
                        pz40 pz40Var1111111111111118 = pz40VarF3;
                        pz40 pz40Var1111111111111119 = pz40Var4;
                        pz40 pz40Var11111111111111110 = pz40Var;
                        oej oejVar114 = new oej(pz40VarF, pz40Var21111117, pz40Var1111111111111119, pz40VarF2, pz40Var1111111111111118, pz40Var21111116, calendar, pz40Var21111118, pz40Var1111111111111117, pz40Var11111111111111110, pz40Var2, pz40Var3);
                        pz40Var5 = pz40Var21111117;
                        pz40VarF4 = pz40Var21111116;
                        pz40VarF8 = pz40Var1111111111111117;
                        pz40Var4 = pz40Var1111111111111119;
                        pz40VarF3 = pz40Var1111111111111118;
                        pz40VarF7 = pz40Var21111118;
                        pz40Var = pz40Var11111111111111110;
                        objP18 = oejVar114;
                        fetVar2.o0(objP18);
                    } else {
                        pz40 pz40Var11111111111111111 = pz40VarF8;
                        pz40 pz40Var21111119 = pz40VarF4;
                        pz40 pz40Var211111110 = pz40Var5;
                        pz40 pz40Var211111111 = pz40VarF7;
                        pz40 pz40Var11111111111111112 = pz40VarF3;
                        pz40 pz40Var11111111111111113 = pz40Var4;
                        pz40 pz40Var11111111111111114 = pz40Var;
                        oej oejVar115 = new oej(pz40VarF, pz40Var211111110, pz40Var11111111111111113, pz40VarF2, pz40Var11111111111111112, pz40Var21111119, calendar, pz40Var211111111, pz40Var11111111111111111, pz40Var11111111111111114, pz40Var2, pz40Var3);
                        pz40Var5 = pz40Var211111110;
                        pz40VarF4 = pz40Var21111119;
                        pz40VarF8 = pz40Var11111111111111111;
                        pz40Var4 = pz40Var11111111111111113;
                        pz40VarF3 = pz40Var11111111111111112;
                        pz40VarF7 = pz40Var211111111;
                        pz40Var = pz40Var11111111111111114;
                        objP18 = oejVar115;
                        fetVar2.o0(objP18);
                    }
                    function4 = (Function1) objP18;
                    if (i14 <= 32) {
                    }
                    objP19 = fetVar2.P();
                    if (z22) {
                        pz40 pz40Var11111111111111115 = pz40Var5;
                        pz40 pz40Var11111216 = pz40Var;
                        pz40 pz40Var11111111111111116 = pz40Var3;
                        pz40 pz40Var121111116 = pz40Var2;
                        pz40 pz40Var121111117 = pz40Var4;
                        pz40 pz40Var121111118 = pz40VarF3;
                        pej pejVar114 = new pej(pz40VarF, pz40VarF4, pz40VarF2, calendar, pz40VarF7, pz40VarF8, pz40Var121111118, pz40Var11111111111111116, pz40Var11111216, pz40Var11111111111111115, pz40Var121111117, pz40Var121111116, (byte) 0);
                        pz40Var3 = pz40Var11111111111111116;
                        pz40Var = pz40Var11111216;
                        pz40Var5 = pz40Var11111111111111115;
                        pz40Var4 = pz40Var121111117;
                        pz40Var2 = pz40Var121111116;
                        objP19 = pejVar114;
                        pz40VarF2 = pz40VarF2;
                        pz40VarF3 = pz40Var121111118;
                        fetVar2.o0(objP19);
                    } else {
                        pz40 pz40Var11111111111111117 = pz40Var5;
                        pz40 pz40Var11111217 = pz40Var;
                        pz40 pz40Var11111111111111118 = pz40Var3;
                        pz40 pz40Var121111119 = pz40Var2;
                        pz40 pz40Var1211111110 = pz40Var4;
                        pz40 pz40Var1211111111 = pz40VarF3;
                        pej pejVar115 = new pej(pz40VarF, pz40VarF4, pz40VarF2, calendar, pz40VarF7, pz40VarF8, pz40Var1211111111, pz40Var11111111111111118, pz40Var11111217, pz40Var11111111111111117, pz40Var1211111110, pz40Var121111119, (byte) 0);
                        pz40Var3 = pz40Var11111111111111118;
                        pz40Var = pz40Var11111217;
                        pz40Var5 = pz40Var11111111111111117;
                        pz40Var4 = pz40Var1211111110;
                        pz40Var2 = pz40Var121111119;
                        objP19 = pejVar115;
                        pz40VarF2 = pz40VarF2;
                        pz40VarF3 = pz40Var1211111111;
                        fetVar2.o0(objP19);
                    }
                    function5 = (Function2) objP19;
                    if (i14 <= 32) {
                    }
                    objP20 = fetVar2.P();
                    if (z23) {
                        objP20 = new pej(pz40VarF, pz40VarF4, pz40VarF3, calendar, pz40VarF7, pz40VarF8, pz40VarF2, pz40Var, pz40Var5, pz40Var4, pz40Var2, pz40Var3, (byte) 1);
                        fetVar2.o0(objP20);
                    } else {
                        objP20 = new pej(pz40VarF, pz40VarF4, pz40VarF3, calendar, pz40VarF7, pz40VarF8, pz40VarF2, pz40Var, pz40Var5, pz40Var4, pz40Var2, pz40Var3, (byte) 1);
                        fetVar2.o0(objP20);
                    }
                    function6 = (Function2) objP20;
                    objP21 = fetVar2.P();
                    if (objP21 == cl5Var) {
                        objP21 = new j1e0(function3, function4, function5, function6);
                        fetVar2.o0(objP21);
                    }
                    j1e0 j1e0Var13 = (j1e0) objP21;
                    int i2111115 = i12 << 12;
                    int i2111116 = i221 & 458752;
                    int i2111117 = i221 & 3670016;
                    int i31116 = i2111115 & 29360128;
                    F(simpleDateTime5, simpleDateTime6, simpleDateTime3, simpleDateTime8, locale2, ulq0Var, calendar, yg40Var5, function1, function2, fetVar2, i222 | 4608 | (i2111115 & 57344) | i2111116 | i2111117 | i31116 | (i2111115 & 234881024) | (i2111115 & 1879048192));
                    yg40 yg40Var18 = yg40Var5;
                    mm40 mm40VarQ13 = i120.Q(o7k0.e(mm40Var, lej.f19905a), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
                    x5d x5dVarA13 = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                    int iHashCode13 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM13 = fetVar2.m();
                    mm40 mm40VarC12 = kbc.c0(fetVar2, mm40VarQ13);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(e7z.u1);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA13, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM13, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode13), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC12, gqw0.v);
                    String str111111110 = cfjVar7.f4265a;
                    String str111111111 = cfjVar7.c;
                    ifj ifjVar1118 = (ifj) l7m0Var2.getValue();
                    am amVar1118 = (am) pz40VarO.getValue();
                    zG10 = fetVar2.g(pz40VarO);
                    objP22 = fetVar2.P();
                    if (zG10) {
                        cl5Var2 = cl5Var;
                        if (objP22 == cl5Var2) {
                        }
                        Function1 function111115 = (Function1) objP22;
                        zG11 = fetVar2.g(pz40VarO2);
                        objP23 = fetVar2.P();
                        if (zG11) {
                            objP23 = new ca6(pz40VarO2, (byte) 21);
                            fetVar2.o0(objP23);
                        } else {
                            objP23 = new ca6(pz40VarO2, (byte) 21);
                            fetVar2.o0(objP23);
                        }
                        S(str, str111111110, str111111111, ifjVar1118, z, ulq0Var, amVar1118, function111115, (Function1) objP23, fetVar2, (i2111114 & 14) | (i221 & 57344) | i2111116);
                        String str111111112 = cfjVar7.b;
                        String str111111113 = cfjVar7.d;
                        am amVar1119 = (am) pz40VarO.getValue();
                        ifj ifjVar1119 = (ifj) l7m0Var2.getValue();
                        zG12 = fetVar2.g(pz40VarO);
                        objP24 = fetVar2.P();
                        if (zG12) {
                            objP24 = new ca6(pz40VarO, (byte) 22);
                            fetVar2.o0(objP24);
                        } else {
                            objP24 = new ca6(pz40VarO, (byte) 22);
                            fetVar2.o0(objP24);
                        }
                        Function1 function111116 = (Function1) objP24;
                        zG13 = fetVar2.g(pz40VarO2);
                        objP25 = fetVar2.P();
                        if (zG13) {
                            objP25 = new ca6(pz40VarO2, (byte) 23);
                            fetVar2.o0(objP25);
                        } else {
                            objP25 = new ca6(pz40VarO2, (byte) 23);
                            fetVar2.o0(objP25);
                        }
                        int i31117 = i16 << 3;
                        h(null, str2, str111111112, str111111113, locale, z, ulq0Var, amVar1119, ifjVar1119, jLongValue11, simpleDate117, simpleDateTime3, simpleDateTime8, simpleDateTime, simpleDateTime2, calendar, yg40Var18, j1e0Var13, uts0Var7, function111116, (Function1) objP25, fetVar2, 6 | (i16 & 896) | ((i12 << 15) & 458752) | (i2111114 & 3670016) | (i2111114 & 29360128), (i31117 & 458752) | (i31117 & 57344) | 805605952 | i2111117 | i31116);
                        fetVar2 = fetVar2;
                        fetVar2.r(true);
                        yg40Var2 = yg40Var18;
                    } else {
                        cl5Var2 = cl5Var;
                    }
                    objP22 = new ca6(pz40VarO, (byte) 20);
                    fetVar2.o0(objP22);
                    Function1 function111117 = (Function1) objP22;
                    zG11 = fetVar2.g(pz40VarO2);
                    objP23 = fetVar2.P();
                    if (zG11) {
                        objP23 = new ca6(pz40VarO2, (byte) 21);
                        fetVar2.o0(objP23);
                    } else {
                        objP23 = new ca6(pz40VarO2, (byte) 21);
                        fetVar2.o0(objP23);
                    }
                    S(str, str111111110, str111111111, ifjVar1118, z, ulq0Var, amVar1118, function111117, (Function1) objP23, fetVar2, (i2111114 & 14) | (i221 & 57344) | i2111116);
                    String str111111114 = cfjVar7.b;
                    String str111111115 = cfjVar7.d;
                    am amVar11110 = (am) pz40VarO.getValue();
                    ifj ifjVar11110 = (ifj) l7m0Var2.getValue();
                    zG12 = fetVar2.g(pz40VarO);
                    objP24 = fetVar2.P();
                    if (zG12) {
                        objP24 = new ca6(pz40VarO, (byte) 22);
                        fetVar2.o0(objP24);
                    } else {
                        objP24 = new ca6(pz40VarO, (byte) 22);
                        fetVar2.o0(objP24);
                    }
                    Function1 function111118 = (Function1) objP24;
                    zG13 = fetVar2.g(pz40VarO2);
                    objP25 = fetVar2.P();
                    if (zG13) {
                        objP25 = new ca6(pz40VarO2, (byte) 23);
                        fetVar2.o0(objP25);
                    } else {
                        objP25 = new ca6(pz40VarO2, (byte) 23);
                        fetVar2.o0(objP25);
                    }
                    int i31118 = i16 << 3;
                    h(null, str2, str111111114, str111111115, locale, z, ulq0Var, amVar11110, ifjVar11110, jLongValue11, simpleDate117, simpleDateTime3, simpleDateTime8, simpleDateTime, simpleDateTime2, calendar, yg40Var18, j1e0Var13, uts0Var7, function111118, (Function1) objP25, fetVar2, 6 | (i16 & 896) | ((i12 << 15) & 458752) | (i2111114 & 3670016) | (i2111114 & 29360128), (i31118 & 458752) | (i31118 & 57344) | 805605952 | i2111117 | i31116);
                    fetVar2 = fetVar2;
                    fetVar2.r(true);
                    yg40Var2 = yg40Var18;
                } else {
                    locale2 = locale;
                }
                i15 = i13;
                simpleDateTime8 = simpleDateTime4;
                if ((i15 & 48) == 32) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                objP17 = fetVar2.P();
                if (z20) {
                    objP17 = new oej(pz40VarF, pz40VarF9, pz40VarF10, pz40VarF2, pz40VarF4, calendar, pz40VarF7, pz40VarF8, pz40VarF3, pz40VarF5, pz40VarF6, pz40VarF11);
                    pz40VarF8 = pz40VarF8;
                    pz40Var = pz40VarF6;
                    pz40Var2 = pz40VarF11;
                    pz40Var3 = pz40VarF5;
                    pz40Var4 = pz40VarF10;
                    pz40VarF3 = pz40VarF3;
                    pz40Var5 = pz40VarF9;
                    pz40VarF4 = pz40VarF4;
                    pz40VarF7 = pz40VarF7;
                    fetVar2.o0(objP17);
                } else {
                    objP17 = new oej(pz40VarF, pz40VarF9, pz40VarF10, pz40VarF2, pz40VarF4, calendar, pz40VarF7, pz40VarF8, pz40VarF3, pz40VarF5, pz40VarF6, pz40VarF11);
                    pz40VarF8 = pz40VarF8;
                    pz40Var = pz40VarF6;
                    pz40Var2 = pz40VarF11;
                    pz40Var3 = pz40VarF5;
                    pz40Var4 = pz40VarF10;
                    pz40VarF3 = pz40VarF3;
                    pz40Var5 = pz40VarF9;
                    pz40VarF4 = pz40VarF4;
                    pz40VarF7 = pz40VarF7;
                    fetVar2.o0(objP17);
                }
                function3 = (Function1) objP17;
                if (i14 <= 32) {
                }
                objP18 = fetVar2.P();
                if (z21) {
                    pz40 pz40Var11111111111111119 = pz40VarF8;
                    pz40 pz40Var211111112 = pz40VarF4;
                    pz40 pz40Var211111113 = pz40Var5;
                    pz40 pz40Var211111114 = pz40VarF7;
                    pz40 pz40Var111111111111111110 = pz40VarF3;
                    pz40 pz40Var111111111111111111 = pz40Var4;
                    pz40 pz40Var111111111111111112 = pz40Var;
                    oej oejVar116 = new oej(pz40VarF, pz40Var211111113, pz40Var111111111111111111, pz40VarF2, pz40Var111111111111111110, pz40Var211111112, calendar, pz40Var211111114, pz40Var11111111111111119, pz40Var111111111111111112, pz40Var2, pz40Var3);
                    pz40Var5 = pz40Var211111113;
                    pz40VarF4 = pz40Var211111112;
                    pz40VarF8 = pz40Var11111111111111119;
                    pz40Var4 = pz40Var111111111111111111;
                    pz40VarF3 = pz40Var111111111111111110;
                    pz40VarF7 = pz40Var211111114;
                    pz40Var = pz40Var111111111111111112;
                    objP18 = oejVar116;
                    fetVar2.o0(objP18);
                } else {
                    pz40 pz40Var111111111111111113 = pz40VarF8;
                    pz40 pz40Var211111115 = pz40VarF4;
                    pz40 pz40Var211111116 = pz40Var5;
                    pz40 pz40Var211111117 = pz40VarF7;
                    pz40 pz40Var111111111111111114 = pz40VarF3;
                    pz40 pz40Var111111111111111115 = pz40Var4;
                    pz40 pz40Var111111111111111116 = pz40Var;
                    oej oejVar117 = new oej(pz40VarF, pz40Var211111116, pz40Var111111111111111115, pz40VarF2, pz40Var111111111111111114, pz40Var211111115, calendar, pz40Var211111117, pz40Var111111111111111113, pz40Var111111111111111116, pz40Var2, pz40Var3);
                    pz40Var5 = pz40Var211111116;
                    pz40VarF4 = pz40Var211111115;
                    pz40VarF8 = pz40Var111111111111111113;
                    pz40Var4 = pz40Var111111111111111115;
                    pz40VarF3 = pz40Var111111111111111114;
                    pz40VarF7 = pz40Var211111117;
                    pz40Var = pz40Var111111111111111116;
                    objP18 = oejVar117;
                    fetVar2.o0(objP18);
                }
                function4 = (Function1) objP18;
                if (i14 <= 32) {
                }
                objP19 = fetVar2.P();
                if (z22) {
                    pz40 pz40Var111111111111111117 = pz40Var5;
                    pz40 pz40Var11111218 = pz40Var;
                    pz40 pz40Var111111111111111118 = pz40Var3;
                    pz40 pz40Var1211111112 = pz40Var2;
                    pz40 pz40Var1211111113 = pz40Var4;
                    pz40 pz40Var1211111114 = pz40VarF3;
                    pej pejVar116 = new pej(pz40VarF, pz40VarF4, pz40VarF2, calendar, pz40VarF7, pz40VarF8, pz40Var1211111114, pz40Var111111111111111118, pz40Var11111218, pz40Var111111111111111117, pz40Var1211111113, pz40Var1211111112, (byte) 0);
                    pz40Var3 = pz40Var111111111111111118;
                    pz40Var = pz40Var11111218;
                    pz40Var5 = pz40Var111111111111111117;
                    pz40Var4 = pz40Var1211111113;
                    pz40Var2 = pz40Var1211111112;
                    objP19 = pejVar116;
                    pz40VarF2 = pz40VarF2;
                    pz40VarF3 = pz40Var1211111114;
                    fetVar2.o0(objP19);
                } else {
                    pz40 pz40Var111111111111111119 = pz40Var5;
                    pz40 pz40Var11111219 = pz40Var;
                    pz40 pz40Var1111111111111111110 = pz40Var3;
                    pz40 pz40Var1211111115 = pz40Var2;
                    pz40 pz40Var1211111116 = pz40Var4;
                    pz40 pz40Var1211111117 = pz40VarF3;
                    pej pejVar117 = new pej(pz40VarF, pz40VarF4, pz40VarF2, calendar, pz40VarF7, pz40VarF8, pz40Var1211111117, pz40Var1111111111111111110, pz40Var11111219, pz40Var111111111111111119, pz40Var1211111116, pz40Var1211111115, (byte) 0);
                    pz40Var3 = pz40Var1111111111111111110;
                    pz40Var = pz40Var11111219;
                    pz40Var5 = pz40Var111111111111111119;
                    pz40Var4 = pz40Var1211111116;
                    pz40Var2 = pz40Var1211111115;
                    objP19 = pejVar117;
                    pz40VarF2 = pz40VarF2;
                    pz40VarF3 = pz40Var1211111117;
                    fetVar2.o0(objP19);
                }
                function5 = (Function2) objP19;
                if (i14 <= 32) {
                }
                objP20 = fetVar2.P();
                if (z23) {
                    objP20 = new pej(pz40VarF, pz40VarF4, pz40VarF3, calendar, pz40VarF7, pz40VarF8, pz40VarF2, pz40Var, pz40Var5, pz40Var4, pz40Var2, pz40Var3, (byte) 1);
                    fetVar2.o0(objP20);
                } else {
                    objP20 = new pej(pz40VarF, pz40VarF4, pz40VarF3, calendar, pz40VarF7, pz40VarF8, pz40VarF2, pz40Var, pz40Var5, pz40Var4, pz40Var2, pz40Var3, (byte) 1);
                    fetVar2.o0(objP20);
                }
                function6 = (Function2) objP20;
                objP21 = fetVar2.P();
                if (objP21 == cl5Var) {
                    objP21 = new j1e0(function3, function4, function5, function6);
                    fetVar2.o0(objP21);
                }
                j1e0 j1e0Var14 = (j1e0) objP21;
                int i2111118 = i12 << 12;
                int i2111119 = i221 & 458752;
                int i21111110 = i221 & 3670016;
                int i31119 = i2111118 & 29360128;
                F(simpleDateTime5, simpleDateTime6, simpleDateTime3, simpleDateTime8, locale2, ulq0Var, calendar, yg40Var5, function1, function2, fetVar2, i222 | 4608 | (i2111118 & 57344) | i2111119 | i21111110 | i31119 | (i2111118 & 234881024) | (i2111118 & 1879048192));
                yg40 yg40Var19 = yg40Var5;
                mm40 mm40VarQ14 = i120.Q(o7k0.e(mm40Var, lej.f19905a), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
                x5d x5dVarA14 = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                int iHashCode14 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM14 = fetVar2.m();
                mm40 mm40VarC13 = kbc.c0(fetVar2, mm40VarQ14);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(e7z.u1);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, x5dVarA14, gqw0.x);
                jpm0.o(fetVar2, bh90VarM14, gqw0.w);
                jpm0.o(fetVar2, Integer.valueOf(iHashCode14), gqw0.y);
                jpm0.n(fetVar2);
                jpm0.o(fetVar2, mm40VarC13, gqw0.v);
                String str111111116 = cfjVar7.f4265a;
                String str111111117 = cfjVar7.c;
                ifj ifjVar11111 = (ifj) l7m0Var2.getValue();
                am amVar11111 = (am) pz40VarO.getValue();
                zG10 = fetVar2.g(pz40VarO);
                objP22 = fetVar2.P();
                if (zG10) {
                    cl5Var2 = cl5Var;
                    if (objP22 == cl5Var2) {
                    }
                    Function1 function111119 = (Function1) objP22;
                    zG11 = fetVar2.g(pz40VarO2);
                    objP23 = fetVar2.P();
                    if (zG11) {
                        objP23 = new ca6(pz40VarO2, (byte) 21);
                        fetVar2.o0(objP23);
                    } else {
                        objP23 = new ca6(pz40VarO2, (byte) 21);
                        fetVar2.o0(objP23);
                    }
                    S(str, str111111116, str111111117, ifjVar11111, z, ulq0Var, amVar11111, function111119, (Function1) objP23, fetVar2, (i2111114 & 14) | (i221 & 57344) | i2111119);
                    String str111111118 = cfjVar7.b;
                    String str111111119 = cfjVar7.d;
                    am amVar11112 = (am) pz40VarO.getValue();
                    ifj ifjVar11112 = (ifj) l7m0Var2.getValue();
                    zG12 = fetVar2.g(pz40VarO);
                    objP24 = fetVar2.P();
                    if (zG12) {
                        objP24 = new ca6(pz40VarO, (byte) 22);
                        fetVar2.o0(objP24);
                    } else {
                        objP24 = new ca6(pz40VarO, (byte) 22);
                        fetVar2.o0(objP24);
                    }
                    Function1 function1111110 = (Function1) objP24;
                    zG13 = fetVar2.g(pz40VarO2);
                    objP25 = fetVar2.P();
                    if (zG13) {
                        objP25 = new ca6(pz40VarO2, (byte) 23);
                        fetVar2.o0(objP25);
                    } else {
                        objP25 = new ca6(pz40VarO2, (byte) 23);
                        fetVar2.o0(objP25);
                    }
                    int i311110 = i16 << 3;
                    h(null, str2, str111111118, str111111119, locale, z, ulq0Var, amVar11112, ifjVar11112, jLongValue11, simpleDate117, simpleDateTime3, simpleDateTime8, simpleDateTime, simpleDateTime2, calendar, yg40Var19, j1e0Var14, uts0Var7, function1111110, (Function1) objP25, fetVar2, 6 | (i16 & 896) | ((i12 << 15) & 458752) | (i2111114 & 3670016) | (i2111114 & 29360128), (i311110 & 458752) | (i311110 & 57344) | 805605952 | i21111110 | i31119);
                    fetVar2 = fetVar2;
                    fetVar2.r(true);
                    yg40Var2 = yg40Var19;
                } else {
                    cl5Var2 = cl5Var;
                }
                objP22 = new ca6(pz40VarO, (byte) 20);
                fetVar2.o0(objP22);
                Function1 function1111111 = (Function1) objP22;
                zG11 = fetVar2.g(pz40VarO2);
                objP23 = fetVar2.P();
                if (zG11) {
                    objP23 = new ca6(pz40VarO2, (byte) 21);
                    fetVar2.o0(objP23);
                } else {
                    objP23 = new ca6(pz40VarO2, (byte) 21);
                    fetVar2.o0(objP23);
                }
                S(str, str111111116, str111111117, ifjVar11111, z, ulq0Var, amVar11111, function1111111, (Function1) objP23, fetVar2, (i2111114 & 14) | (i221 & 57344) | i2111119);
                String str1111111110 = cfjVar7.b;
                String str1111111111 = cfjVar7.d;
                am amVar11113 = (am) pz40VarO.getValue();
                ifj ifjVar11113 = (ifj) l7m0Var2.getValue();
                zG12 = fetVar2.g(pz40VarO);
                objP24 = fetVar2.P();
                if (zG12) {
                    objP24 = new ca6(pz40VarO, (byte) 22);
                    fetVar2.o0(objP24);
                } else {
                    objP24 = new ca6(pz40VarO, (byte) 22);
                    fetVar2.o0(objP24);
                }
                Function1 function1111112 = (Function1) objP24;
                zG13 = fetVar2.g(pz40VarO2);
                objP25 = fetVar2.P();
                if (zG13) {
                    objP25 = new ca6(pz40VarO2, (byte) 23);
                    fetVar2.o0(objP25);
                } else {
                    objP25 = new ca6(pz40VarO2, (byte) 23);
                    fetVar2.o0(objP25);
                }
                int i311111 = i16 << 3;
                h(null, str2, str1111111110, str1111111111, locale, z, ulq0Var, amVar11113, ifjVar11113, jLongValue11, simpleDate117, simpleDateTime3, simpleDateTime8, simpleDateTime, simpleDateTime2, calendar, yg40Var19, j1e0Var14, uts0Var7, function1111112, (Function1) objP25, fetVar2, 6 | (i16 & 896) | ((i12 << 15) & 458752) | (i2111114 & 3670016) | (i2111114 & 29360128), (i311111 & 458752) | (i311111 & 57344) | 805605952 | i21111110 | i31119);
                fetVar2 = fetVar2;
                fetVar2.r(true);
                yg40Var2 = yg40Var19;
            } else {
                simpleDateTime6 = simpleDateTime2;
            }
            i11 = i20;
            if ((i8 & 48) == 32) {
                z15 = true;
            } else {
                z15 = false;
            }
            zG5 = z15 | fetVar2.g(dateFormat);
            objP11 = fetVar2.P();
            if (zG5) {
                simpleDate4 = simpleDate6;
                wdx.J(simpleDate4, calendar);
                objP11 = dateFormat.format(calendar.getTime());
                fetVar2.o0(objP11);
            } else {
                simpleDate4 = simpleDate6;
                wdx.J(simpleDate4, calendar);
                objP11 = dateFormat.format(calendar.getTime());
                fetVar2.o0(objP11);
            }
            str5 = (String) objP11;
            zG6 = ((i9 <= 4 && fetVar2.g(simpleDateTime5)) || (i8 & 6) == 4) | fetVar2.g(dateFormat2);
            objP12 = fetVar2.P();
            if (zG6) {
                wdx.I(simpleDateTime5, calendar);
                objP12 = dateFormat2.format(calendar.getTime());
                fetVar2.o0(objP12);
            } else {
                wdx.I(simpleDateTime5, calendar);
                objP12 = dateFormat2.format(calendar.getTime());
                fetVar2.o0(objP12);
            }
            str6 = (String) objP12;
            zG7 = ((i10 <= 32 && fetVar2.g(simpleDateTime6)) || (i8 & 48) == 32) | fetVar2.g(dateFormat2);
            objP13 = fetVar2.P();
            if (zG7) {
                wdx.I(simpleDateTime6, calendar);
                objP13 = dateFormat2.format(calendar.getTime());
                fetVar2.o0(objP13);
            } else {
                wdx.I(simpleDateTime6, calendar);
                objP13 = dateFormat2.format(calendar.getTime());
                fetVar2.o0(objP13);
            }
            str7 = (String) objP13;
            zG8 = fetVar2.g(str4) | fetVar2.g(str5) | fetVar2.g(str6) | fetVar2.g(str7);
            objP14 = fetVar2.P();
            if (zG8) {
                str4.getClass();
                str5.getClass();
                str6.getClass();
                str7.getClass();
                objP14 = new cfj(str4, str5, str6, str7);
                fetVar2.o0(objP14);
            } else {
                str4.getClass();
                str5.getClass();
                str6.getClass();
                str7.getClass();
                objP14 = new cfj(str4, str5, str6, str7);
                fetVar2.o0(objP14);
            }
            cfj cfjVar8 = (cfj) objP14;
            amVar = (am) pz40VarO.getValue();
            int i21111111 = i16 >> 6;
            zG9 = fetVar2.g(simpleDate4) | fetVar2.e(amVar.ordinal()) | fetVar2.g(simpleDate3) | fetVar2.g(calendar);
            objP15 = fetVar2.P();
            if (zG9) {
                iOrdinal3 = amVar.ordinal();
                if (iOrdinal3 == 0) {
                    simpleDateTime7 = simpleDateTime5;
                } else {
                    if (iOrdinal3 != 1) {
                        t9f.b();
                        return;
                    }
                    simpleDateTime7 = simpleDateTime6;
                }
                wdx.J(simpleDateTime7.f47285a, calendar);
                objP15 = Long.valueOf(calendar.getTimeInMillis());
                fetVar2.o0(objP15);
            } else {
                iOrdinal3 = amVar.ordinal();
                if (iOrdinal3 == 0) {
                    simpleDateTime7 = simpleDateTime5;
                } else {
                    if (iOrdinal3 != 1) {
                        t9f.b();
                        return;
                    }
                    simpleDateTime7 = simpleDateTime6;
                }
                wdx.J(simpleDateTime7.f47285a, calendar);
                objP15 = Long.valueOf(calendar.getTimeInMillis());
                fetVar2.o0(objP15);
            }
            long jLongValue12 = ((Number) objP15).longValue();
            SimpleDate simpleDate118 = simpleDateTime3.f47285a;
            SimpleDate simpleDate119 = simpleDateTime4.f47285a;
            if ((i16 & 7168) != 2048) {
                z16 = true;
            } else {
                z16 = true;
            }
            boolean zG1112 = fetVar2.g(simpleDate118) | z16 | fetVar2.g(simpleDate119);
            if (i7 == 67108864) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean zG1113 = zG1112 | z17 | fetVar2.g(calendar);
            i12 = i11;
            if ((i12 & 7168) == 2048) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = zG1113 | z18;
            Object objP213 = fetVar2.P();
            if (z19) {
                iOrdinal4 = ulq0Var.ordinal();
                if (iOrdinal4 == 0) {
                    yg40Var5 = yg40Var4;
                    simpleDateTimeH0 = h0(simpleDateTime5, calendar, yg40Var5, 1);
                } else if (iOrdinal4 != 1) {
                    t9f.b();
                    return;
                } else {
                    yg40Var5 = yg40Var4;
                    simpleDateTimeH0 = simpleDateTime5;
                }
                objV = bsr0.V(simpleDateTimeH0.f47285a, simpleDateTime3.f47285a, simpleDateTime4.f47285a);
                fetVar2.o0(objV);
            } else {
                iOrdinal4 = ulq0Var.ordinal();
                if (iOrdinal4 == 0) {
                    yg40Var5 = yg40Var4;
                    simpleDateTimeH0 = h0(simpleDateTime5, calendar, yg40Var5, 1);
                } else if (iOrdinal4 != 1) {
                    t9f.b();
                    return;
                } else {
                    yg40Var5 = yg40Var4;
                    simpleDateTimeH0 = simpleDateTime5;
                }
                objV = bsr0.V(simpleDateTimeH0.f47285a, simpleDateTime3.f47285a, simpleDateTime4.f47285a);
                fetVar2.o0(objV);
            }
            SimpleDate simpleDate1110 = (SimpleDate) objV;
            objP16 = fetVar2.P();
            if (objP16 == cl5Var) {
                objP16 = ro4.m0(220, 0, ihn.f14788a, 2);
                fetVar2.o0(objP16);
            }
            uts0 uts0Var8 = (uts0) objP16;
            int i21111112 = i16 >> 3;
            i13 = (i21111112 & 896) | (i223 & 14) | ((i12 << 3) & 112) | 512 | 4096 | (i21111112 & 7168) | (i21111111 & 3670016) | (i21111111 & 29360128) | 1207959552;
            pz40VarF = androidx.compose.runtime.e.f(Boolean.valueOf(z), fetVar2);
            pz40VarF2 = androidx.compose.runtime.e.f(simpleDateTime5, fetVar2);
            pz40VarF3 = androidx.compose.runtime.e.f(simpleDateTime6, fetVar2);
            pz40VarF4 = androidx.compose.runtime.e.f(ulq0Var, fetVar2);
            pz40VarF5 = androidx.compose.runtime.e.f(function1, fetVar2);
            pz40VarF6 = androidx.compose.runtime.e.f(function2, fetVar);
            pz40VarF7 = androidx.compose.runtime.e.f(Long.valueOf(jLongValue7), fetVar2);
            pz40VarF8 = androidx.compose.runtime.e.f(Long.valueOf(jLongValue8), fetVar2);
            pz40VarF9 = androidx.compose.runtime.e.f(simpleDateTime3, fetVar2);
            pz40VarF10 = androidx.compose.runtime.e.f(simpleDateTime4, fetVar2);
            pz40VarF11 = androidx.compose.runtime.e.f(yg40Var5, fetVar2);
            i14 = (i13 & 112) ^ 48;
            if (i14 > 32) {
                locale2 = locale;
                if (!fetVar2.g(locale2)) {
                    i15 = i13;
                    simpleDateTime8 = simpleDateTime4;
                }
                z20 = true;
                objP17 = fetVar2.P();
                if (z20) {
                    objP17 = new oej(pz40VarF, pz40VarF9, pz40VarF10, pz40VarF2, pz40VarF4, calendar, pz40VarF7, pz40VarF8, pz40VarF3, pz40VarF5, pz40VarF6, pz40VarF11);
                    pz40VarF8 = pz40VarF8;
                    pz40Var = pz40VarF6;
                    pz40Var2 = pz40VarF11;
                    pz40Var3 = pz40VarF5;
                    pz40Var4 = pz40VarF10;
                    pz40VarF3 = pz40VarF3;
                    pz40Var5 = pz40VarF9;
                    pz40VarF4 = pz40VarF4;
                    pz40VarF7 = pz40VarF7;
                    fetVar2.o0(objP17);
                } else {
                    objP17 = new oej(pz40VarF, pz40VarF9, pz40VarF10, pz40VarF2, pz40VarF4, calendar, pz40VarF7, pz40VarF8, pz40VarF3, pz40VarF5, pz40VarF6, pz40VarF11);
                    pz40VarF8 = pz40VarF8;
                    pz40Var = pz40VarF6;
                    pz40Var2 = pz40VarF11;
                    pz40Var3 = pz40VarF5;
                    pz40Var4 = pz40VarF10;
                    pz40VarF3 = pz40VarF3;
                    pz40Var5 = pz40VarF9;
                    pz40VarF4 = pz40VarF4;
                    pz40VarF7 = pz40VarF7;
                    fetVar2.o0(objP17);
                }
                function3 = (Function1) objP17;
                if (i14 <= 32) {
                }
                objP18 = fetVar2.P();
                if (z21) {
                    pz40 pz40Var1111111111111111111 = pz40VarF8;
                    pz40 pz40Var211111118 = pz40VarF4;
                    pz40 pz40Var211111119 = pz40Var5;
                    pz40 pz40Var2111111110 = pz40VarF7;
                    pz40 pz40Var1111111111111111112 = pz40VarF3;
                    pz40 pz40Var1111111111111111113 = pz40Var4;
                    pz40 pz40Var1111111111111111114 = pz40Var;
                    oej oejVar118 = new oej(pz40VarF, pz40Var211111119, pz40Var1111111111111111113, pz40VarF2, pz40Var1111111111111111112, pz40Var211111118, calendar, pz40Var2111111110, pz40Var1111111111111111111, pz40Var1111111111111111114, pz40Var2, pz40Var3);
                    pz40Var5 = pz40Var211111119;
                    pz40VarF4 = pz40Var211111118;
                    pz40VarF8 = pz40Var1111111111111111111;
                    pz40Var4 = pz40Var1111111111111111113;
                    pz40VarF3 = pz40Var1111111111111111112;
                    pz40VarF7 = pz40Var2111111110;
                    pz40Var = pz40Var1111111111111111114;
                    objP18 = oejVar118;
                    fetVar2.o0(objP18);
                } else {
                    pz40 pz40Var1111111111111111115 = pz40VarF8;
                    pz40 pz40Var2111111111 = pz40VarF4;
                    pz40 pz40Var2111111112 = pz40Var5;
                    pz40 pz40Var2111111113 = pz40VarF7;
                    pz40 pz40Var1111111111111111116 = pz40VarF3;
                    pz40 pz40Var1111111111111111117 = pz40Var4;
                    pz40 pz40Var1111111111111111118 = pz40Var;
                    oej oejVar119 = new oej(pz40VarF, pz40Var2111111112, pz40Var1111111111111111117, pz40VarF2, pz40Var1111111111111111116, pz40Var2111111111, calendar, pz40Var2111111113, pz40Var1111111111111111115, pz40Var1111111111111111118, pz40Var2, pz40Var3);
                    pz40Var5 = pz40Var2111111112;
                    pz40VarF4 = pz40Var2111111111;
                    pz40VarF8 = pz40Var1111111111111111115;
                    pz40Var4 = pz40Var1111111111111111117;
                    pz40VarF3 = pz40Var1111111111111111116;
                    pz40VarF7 = pz40Var2111111113;
                    pz40Var = pz40Var1111111111111111118;
                    objP18 = oejVar119;
                    fetVar2.o0(objP18);
                }
                function4 = (Function1) objP18;
                if (i14 <= 32) {
                }
                objP19 = fetVar2.P();
                if (z22) {
                    pz40 pz40Var1111111111111111119 = pz40Var5;
                    pz40 pz40Var111112110 = pz40Var;
                    pz40 pz40Var11111111111111111110 = pz40Var3;
                    pz40 pz40Var1211111118 = pz40Var2;
                    pz40 pz40Var1211111119 = pz40Var4;
                    pz40 pz40Var12111111110 = pz40VarF3;
                    pej pejVar118 = new pej(pz40VarF, pz40VarF4, pz40VarF2, calendar, pz40VarF7, pz40VarF8, pz40Var12111111110, pz40Var11111111111111111110, pz40Var111112110, pz40Var1111111111111111119, pz40Var1211111119, pz40Var1211111118, (byte) 0);
                    pz40Var3 = pz40Var11111111111111111110;
                    pz40Var = pz40Var111112110;
                    pz40Var5 = pz40Var1111111111111111119;
                    pz40Var4 = pz40Var1211111119;
                    pz40Var2 = pz40Var1211111118;
                    objP19 = pejVar118;
                    pz40VarF2 = pz40VarF2;
                    pz40VarF3 = pz40Var12111111110;
                    fetVar2.o0(objP19);
                } else {
                    pz40 pz40Var11111111111111111111 = pz40Var5;
                    pz40 pz40Var111112111 = pz40Var;
                    pz40 pz40Var11111111111111111112 = pz40Var3;
                    pz40 pz40Var12111111111 = pz40Var2;
                    pz40 pz40Var12111111112 = pz40Var4;
                    pz40 pz40Var12111111113 = pz40VarF3;
                    pej pejVar119 = new pej(pz40VarF, pz40VarF4, pz40VarF2, calendar, pz40VarF7, pz40VarF8, pz40Var12111111113, pz40Var11111111111111111112, pz40Var111112111, pz40Var11111111111111111111, pz40Var12111111112, pz40Var12111111111, (byte) 0);
                    pz40Var3 = pz40Var11111111111111111112;
                    pz40Var = pz40Var111112111;
                    pz40Var5 = pz40Var11111111111111111111;
                    pz40Var4 = pz40Var12111111112;
                    pz40Var2 = pz40Var12111111111;
                    objP19 = pejVar119;
                    pz40VarF2 = pz40VarF2;
                    pz40VarF3 = pz40Var12111111113;
                    fetVar2.o0(objP19);
                }
                function5 = (Function2) objP19;
                if (i14 <= 32) {
                }
                objP20 = fetVar2.P();
                if (z23) {
                    objP20 = new pej(pz40VarF, pz40VarF4, pz40VarF3, calendar, pz40VarF7, pz40VarF8, pz40VarF2, pz40Var, pz40Var5, pz40Var4, pz40Var2, pz40Var3, (byte) 1);
                    fetVar2.o0(objP20);
                } else {
                    objP20 = new pej(pz40VarF, pz40VarF4, pz40VarF3, calendar, pz40VarF7, pz40VarF8, pz40VarF2, pz40Var, pz40Var5, pz40Var4, pz40Var2, pz40Var3, (byte) 1);
                    fetVar2.o0(objP20);
                }
                function6 = (Function2) objP20;
                objP21 = fetVar2.P();
                if (objP21 == cl5Var) {
                    objP21 = new j1e0(function3, function4, function5, function6);
                    fetVar2.o0(objP21);
                }
                j1e0 j1e0Var15 = (j1e0) objP21;
                int i21111113 = i12 << 12;
                int i21111114 = i221 & 458752;
                int i21111115 = i221 & 3670016;
                int i311112 = i21111113 & 29360128;
                F(simpleDateTime5, simpleDateTime6, simpleDateTime3, simpleDateTime8, locale2, ulq0Var, calendar, yg40Var5, function1, function2, fetVar2, i222 | 4608 | (i21111113 & 57344) | i21111114 | i21111115 | i311112 | (i21111113 & 234881024) | (i21111113 & 1879048192));
                yg40 yg40Var110 = yg40Var5;
                mm40 mm40VarQ15 = i120.Q(o7k0.e(mm40Var, lej.f19905a), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
                x5d x5dVarA15 = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                int iHashCode15 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM15 = fetVar2.m();
                mm40 mm40VarC14 = kbc.c0(fetVar2, mm40VarQ15);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(e7z.u1);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, x5dVarA15, gqw0.x);
                jpm0.o(fetVar2, bh90VarM15, gqw0.w);
                jpm0.o(fetVar2, Integer.valueOf(iHashCode15), gqw0.y);
                jpm0.n(fetVar2);
                jpm0.o(fetVar2, mm40VarC14, gqw0.v);
                String str1111111112 = cfjVar8.f4265a;
                String str1111111113 = cfjVar8.c;
                ifj ifjVar11114 = (ifj) l7m0Var2.getValue();
                am amVar11114 = (am) pz40VarO.getValue();
                zG10 = fetVar2.g(pz40VarO);
                objP22 = fetVar2.P();
                if (zG10) {
                    cl5Var2 = cl5Var;
                    if (objP22 == cl5Var2) {
                    }
                    Function1 function1111113 = (Function1) objP22;
                    zG11 = fetVar2.g(pz40VarO2);
                    objP23 = fetVar2.P();
                    if (zG11) {
                        objP23 = new ca6(pz40VarO2, (byte) 21);
                        fetVar2.o0(objP23);
                    } else {
                        objP23 = new ca6(pz40VarO2, (byte) 21);
                        fetVar2.o0(objP23);
                    }
                    S(str, str1111111112, str1111111113, ifjVar11114, z, ulq0Var, amVar11114, function1111113, (Function1) objP23, fetVar2, (i21111112 & 14) | (i221 & 57344) | i21111114);
                    String str1111111114 = cfjVar8.b;
                    String str1111111115 = cfjVar8.d;
                    am amVar11115 = (am) pz40VarO.getValue();
                    ifj ifjVar11115 = (ifj) l7m0Var2.getValue();
                    zG12 = fetVar2.g(pz40VarO);
                    objP24 = fetVar2.P();
                    if (zG12) {
                        objP24 = new ca6(pz40VarO, (byte) 22);
                        fetVar2.o0(objP24);
                    } else {
                        objP24 = new ca6(pz40VarO, (byte) 22);
                        fetVar2.o0(objP24);
                    }
                    Function1 function1111114 = (Function1) objP24;
                    zG13 = fetVar2.g(pz40VarO2);
                    objP25 = fetVar2.P();
                    if (zG13) {
                        objP25 = new ca6(pz40VarO2, (byte) 23);
                        fetVar2.o0(objP25);
                    } else {
                        objP25 = new ca6(pz40VarO2, (byte) 23);
                        fetVar2.o0(objP25);
                    }
                    int i311113 = i16 << 3;
                    h(null, str2, str1111111114, str1111111115, locale, z, ulq0Var, amVar11115, ifjVar11115, jLongValue12, simpleDate1110, simpleDateTime3, simpleDateTime8, simpleDateTime, simpleDateTime2, calendar, yg40Var110, j1e0Var15, uts0Var8, function1111114, (Function1) objP25, fetVar2, 6 | (i16 & 896) | ((i12 << 15) & 458752) | (i21111112 & 3670016) | (i21111112 & 29360128), (i311113 & 458752) | (i311113 & 57344) | 805605952 | i21111115 | i311112);
                    fetVar2 = fetVar2;
                    fetVar2.r(true);
                    yg40Var2 = yg40Var110;
                } else {
                    cl5Var2 = cl5Var;
                }
                objP22 = new ca6(pz40VarO, (byte) 20);
                fetVar2.o0(objP22);
                Function1 function1111115 = (Function1) objP22;
                zG11 = fetVar2.g(pz40VarO2);
                objP23 = fetVar2.P();
                if (zG11) {
                    objP23 = new ca6(pz40VarO2, (byte) 21);
                    fetVar2.o0(objP23);
                } else {
                    objP23 = new ca6(pz40VarO2, (byte) 21);
                    fetVar2.o0(objP23);
                }
                S(str, str1111111112, str1111111113, ifjVar11114, z, ulq0Var, amVar11114, function1111115, (Function1) objP23, fetVar2, (i21111112 & 14) | (i221 & 57344) | i21111114);
                String str1111111116 = cfjVar8.b;
                String str1111111117 = cfjVar8.d;
                am amVar11116 = (am) pz40VarO.getValue();
                ifj ifjVar11116 = (ifj) l7m0Var2.getValue();
                zG12 = fetVar2.g(pz40VarO);
                objP24 = fetVar2.P();
                if (zG12) {
                    objP24 = new ca6(pz40VarO, (byte) 22);
                    fetVar2.o0(objP24);
                } else {
                    objP24 = new ca6(pz40VarO, (byte) 22);
                    fetVar2.o0(objP24);
                }
                Function1 function1111116 = (Function1) objP24;
                zG13 = fetVar2.g(pz40VarO2);
                objP25 = fetVar2.P();
                if (zG13) {
                    objP25 = new ca6(pz40VarO2, (byte) 23);
                    fetVar2.o0(objP25);
                } else {
                    objP25 = new ca6(pz40VarO2, (byte) 23);
                    fetVar2.o0(objP25);
                }
                int i311114 = i16 << 3;
                h(null, str2, str1111111116, str1111111117, locale, z, ulq0Var, amVar11116, ifjVar11116, jLongValue12, simpleDate1110, simpleDateTime3, simpleDateTime8, simpleDateTime, simpleDateTime2, calendar, yg40Var110, j1e0Var15, uts0Var8, function1111116, (Function1) objP25, fetVar2, 6 | (i16 & 896) | ((i12 << 15) & 458752) | (i21111112 & 3670016) | (i21111112 & 29360128), (i311114 & 458752) | (i311114 & 57344) | 805605952 | i21111115 | i311112);
                fetVar2 = fetVar2;
                fetVar2.r(true);
                yg40Var2 = yg40Var110;
            } else {
                locale2 = locale;
            }
            i15 = i13;
            simpleDateTime8 = simpleDateTime4;
            if ((i15 & 48) == 32) {
                z20 = true;
            } else {
                z20 = false;
            }
            objP17 = fetVar2.P();
            if (z20) {
                objP17 = new oej(pz40VarF, pz40VarF9, pz40VarF10, pz40VarF2, pz40VarF4, calendar, pz40VarF7, pz40VarF8, pz40VarF3, pz40VarF5, pz40VarF6, pz40VarF11);
                pz40VarF8 = pz40VarF8;
                pz40Var = pz40VarF6;
                pz40Var2 = pz40VarF11;
                pz40Var3 = pz40VarF5;
                pz40Var4 = pz40VarF10;
                pz40VarF3 = pz40VarF3;
                pz40Var5 = pz40VarF9;
                pz40VarF4 = pz40VarF4;
                pz40VarF7 = pz40VarF7;
                fetVar2.o0(objP17);
            } else {
                objP17 = new oej(pz40VarF, pz40VarF9, pz40VarF10, pz40VarF2, pz40VarF4, calendar, pz40VarF7, pz40VarF8, pz40VarF3, pz40VarF5, pz40VarF6, pz40VarF11);
                pz40VarF8 = pz40VarF8;
                pz40Var = pz40VarF6;
                pz40Var2 = pz40VarF11;
                pz40Var3 = pz40VarF5;
                pz40Var4 = pz40VarF10;
                pz40VarF3 = pz40VarF3;
                pz40Var5 = pz40VarF9;
                pz40VarF4 = pz40VarF4;
                pz40VarF7 = pz40VarF7;
                fetVar2.o0(objP17);
            }
            function3 = (Function1) objP17;
            if (i14 <= 32) {
            }
            objP18 = fetVar2.P();
            if (z21) {
                pz40 pz40Var11111111111111111113 = pz40VarF8;
                pz40 pz40Var2111111114 = pz40VarF4;
                pz40 pz40Var2111111115 = pz40Var5;
                pz40 pz40Var2111111116 = pz40VarF7;
                pz40 pz40Var11111111111111111114 = pz40VarF3;
                pz40 pz40Var11111111111111111115 = pz40Var4;
                pz40 pz40Var11111111111111111116 = pz40Var;
                oej oejVar1110 = new oej(pz40VarF, pz40Var2111111115, pz40Var11111111111111111115, pz40VarF2, pz40Var11111111111111111114, pz40Var2111111114, calendar, pz40Var2111111116, pz40Var11111111111111111113, pz40Var11111111111111111116, pz40Var2, pz40Var3);
                pz40Var5 = pz40Var2111111115;
                pz40VarF4 = pz40Var2111111114;
                pz40VarF8 = pz40Var11111111111111111113;
                pz40Var4 = pz40Var11111111111111111115;
                pz40VarF3 = pz40Var11111111111111111114;
                pz40VarF7 = pz40Var2111111116;
                pz40Var = pz40Var11111111111111111116;
                objP18 = oejVar1110;
                fetVar2.o0(objP18);
            } else {
                pz40 pz40Var11111111111111111117 = pz40VarF8;
                pz40 pz40Var2111111117 = pz40VarF4;
                pz40 pz40Var2111111118 = pz40Var5;
                pz40 pz40Var2111111119 = pz40VarF7;
                pz40 pz40Var11111111111111111118 = pz40VarF3;
                pz40 pz40Var11111111111111111119 = pz40Var4;
                pz40 pz40Var111111111111111111110 = pz40Var;
                oej oejVar1111 = new oej(pz40VarF, pz40Var2111111118, pz40Var11111111111111111119, pz40VarF2, pz40Var11111111111111111118, pz40Var2111111117, calendar, pz40Var2111111119, pz40Var11111111111111111117, pz40Var111111111111111111110, pz40Var2, pz40Var3);
                pz40Var5 = pz40Var2111111118;
                pz40VarF4 = pz40Var2111111117;
                pz40VarF8 = pz40Var11111111111111111117;
                pz40Var4 = pz40Var11111111111111111119;
                pz40VarF3 = pz40Var11111111111111111118;
                pz40VarF7 = pz40Var2111111119;
                pz40Var = pz40Var111111111111111111110;
                objP18 = oejVar1111;
                fetVar2.o0(objP18);
            }
            function4 = (Function1) objP18;
            if (i14 <= 32) {
            }
            objP19 = fetVar2.P();
            if (z22) {
                pz40 pz40Var111111111111111111111 = pz40Var5;
                pz40 pz40Var111112112 = pz40Var;
                pz40 pz40Var111111111111111111112 = pz40Var3;
                pz40 pz40Var12111111114 = pz40Var2;
                pz40 pz40Var12111111115 = pz40Var4;
                pz40 pz40Var12111111116 = pz40VarF3;
                pej pejVar1110 = new pej(pz40VarF, pz40VarF4, pz40VarF2, calendar, pz40VarF7, pz40VarF8, pz40Var12111111116, pz40Var111111111111111111112, pz40Var111112112, pz40Var111111111111111111111, pz40Var12111111115, pz40Var12111111114, (byte) 0);
                pz40Var3 = pz40Var111111111111111111112;
                pz40Var = pz40Var111112112;
                pz40Var5 = pz40Var111111111111111111111;
                pz40Var4 = pz40Var12111111115;
                pz40Var2 = pz40Var12111111114;
                objP19 = pejVar1110;
                pz40VarF2 = pz40VarF2;
                pz40VarF3 = pz40Var12111111116;
                fetVar2.o0(objP19);
            } else {
                pz40 pz40Var111111111111111111113 = pz40Var5;
                pz40 pz40Var111112113 = pz40Var;
                pz40 pz40Var111111111111111111114 = pz40Var3;
                pz40 pz40Var12111111117 = pz40Var2;
                pz40 pz40Var12111111118 = pz40Var4;
                pz40 pz40Var12111111119 = pz40VarF3;
                pej pejVar1111 = new pej(pz40VarF, pz40VarF4, pz40VarF2, calendar, pz40VarF7, pz40VarF8, pz40Var12111111119, pz40Var111111111111111111114, pz40Var111112113, pz40Var111111111111111111113, pz40Var12111111118, pz40Var12111111117, (byte) 0);
                pz40Var3 = pz40Var111111111111111111114;
                pz40Var = pz40Var111112113;
                pz40Var5 = pz40Var111111111111111111113;
                pz40Var4 = pz40Var12111111118;
                pz40Var2 = pz40Var12111111117;
                objP19 = pejVar1111;
                pz40VarF2 = pz40VarF2;
                pz40VarF3 = pz40Var12111111119;
                fetVar2.o0(objP19);
            }
            function5 = (Function2) objP19;
            if (i14 <= 32) {
            }
            objP20 = fetVar2.P();
            if (z23) {
                objP20 = new pej(pz40VarF, pz40VarF4, pz40VarF3, calendar, pz40VarF7, pz40VarF8, pz40VarF2, pz40Var, pz40Var5, pz40Var4, pz40Var2, pz40Var3, (byte) 1);
                fetVar2.o0(objP20);
            } else {
                objP20 = new pej(pz40VarF, pz40VarF4, pz40VarF3, calendar, pz40VarF7, pz40VarF8, pz40VarF2, pz40Var, pz40Var5, pz40Var4, pz40Var2, pz40Var3, (byte) 1);
                fetVar2.o0(objP20);
            }
            function6 = (Function2) objP20;
            objP21 = fetVar2.P();
            if (objP21 == cl5Var) {
                objP21 = new j1e0(function3, function4, function5, function6);
                fetVar2.o0(objP21);
            }
            j1e0 j1e0Var16 = (j1e0) objP21;
            int i21111116 = i12 << 12;
            int i21111117 = i221 & 458752;
            int i21111118 = i221 & 3670016;
            int i311115 = i21111116 & 29360128;
            F(simpleDateTime5, simpleDateTime6, simpleDateTime3, simpleDateTime8, locale2, ulq0Var, calendar, yg40Var5, function1, function2, fetVar2, i222 | 4608 | (i21111116 & 57344) | i21111117 | i21111118 | i311115 | (i21111116 & 234881024) | (i21111116 & 1879048192));
            yg40 yg40Var111 = yg40Var5;
            mm40 mm40VarQ16 = i120.Q(o7k0.e(mm40Var, lej.f19905a), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
            x5d x5dVarA16 = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode16 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM16 = fetVar2.m();
            mm40 mm40VarC15 = kbc.c0(fetVar2, mm40VarQ16);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA16, gqw0.x);
            jpm0.o(fetVar2, bh90VarM16, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode16), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC15, gqw0.v);
            String str1111111118 = cfjVar8.f4265a;
            String str1111111119 = cfjVar8.c;
            ifj ifjVar11117 = (ifj) l7m0Var2.getValue();
            am amVar11117 = (am) pz40VarO.getValue();
            zG10 = fetVar2.g(pz40VarO);
            objP22 = fetVar2.P();
            if (zG10) {
                cl5Var2 = cl5Var;
                if (objP22 == cl5Var2) {
                }
                Function1 function1111117 = (Function1) objP22;
                zG11 = fetVar2.g(pz40VarO2);
                objP23 = fetVar2.P();
                if (zG11) {
                    objP23 = new ca6(pz40VarO2, (byte) 21);
                    fetVar2.o0(objP23);
                } else {
                    objP23 = new ca6(pz40VarO2, (byte) 21);
                    fetVar2.o0(objP23);
                }
                S(str, str1111111118, str1111111119, ifjVar11117, z, ulq0Var, amVar11117, function1111117, (Function1) objP23, fetVar2, (i21111112 & 14) | (i221 & 57344) | i21111117);
                String str11111111110 = cfjVar8.b;
                String str11111111111 = cfjVar8.d;
                am amVar11118 = (am) pz40VarO.getValue();
                ifj ifjVar11118 = (ifj) l7m0Var2.getValue();
                zG12 = fetVar2.g(pz40VarO);
                objP24 = fetVar2.P();
                if (zG12) {
                    objP24 = new ca6(pz40VarO, (byte) 22);
                    fetVar2.o0(objP24);
                } else {
                    objP24 = new ca6(pz40VarO, (byte) 22);
                    fetVar2.o0(objP24);
                }
                Function1 function1111118 = (Function1) objP24;
                zG13 = fetVar2.g(pz40VarO2);
                objP25 = fetVar2.P();
                if (zG13) {
                    objP25 = new ca6(pz40VarO2, (byte) 23);
                    fetVar2.o0(objP25);
                } else {
                    objP25 = new ca6(pz40VarO2, (byte) 23);
                    fetVar2.o0(objP25);
                }
                int i311116 = i16 << 3;
                h(null, str2, str11111111110, str11111111111, locale, z, ulq0Var, amVar11118, ifjVar11118, jLongValue12, simpleDate1110, simpleDateTime3, simpleDateTime8, simpleDateTime, simpleDateTime2, calendar, yg40Var111, j1e0Var16, uts0Var8, function1111118, (Function1) objP25, fetVar2, 6 | (i16 & 896) | ((i12 << 15) & 458752) | (i21111112 & 3670016) | (i21111112 & 29360128), (i311116 & 458752) | (i311116 & 57344) | 805605952 | i21111118 | i311115);
                fetVar2 = fetVar2;
                fetVar2.r(true);
                yg40Var2 = yg40Var111;
            } else {
                cl5Var2 = cl5Var;
            }
            objP22 = new ca6(pz40VarO, (byte) 20);
            fetVar2.o0(objP22);
            Function1 function1111119 = (Function1) objP22;
            zG11 = fetVar2.g(pz40VarO2);
            objP23 = fetVar2.P();
            if (zG11) {
                objP23 = new ca6(pz40VarO2, (byte) 21);
                fetVar2.o0(objP23);
            } else {
                objP23 = new ca6(pz40VarO2, (byte) 21);
                fetVar2.o0(objP23);
            }
            S(str, str1111111118, str1111111119, ifjVar11117, z, ulq0Var, amVar11117, function1111119, (Function1) objP23, fetVar2, (i21111112 & 14) | (i221 & 57344) | i21111117);
            String str11111111112 = cfjVar8.b;
            String str11111111113 = cfjVar8.d;
            am amVar11119 = (am) pz40VarO.getValue();
            ifj ifjVar11119 = (ifj) l7m0Var2.getValue();
            zG12 = fetVar2.g(pz40VarO);
            objP24 = fetVar2.P();
            if (zG12) {
                objP24 = new ca6(pz40VarO, (byte) 22);
                fetVar2.o0(objP24);
            } else {
                objP24 = new ca6(pz40VarO, (byte) 22);
                fetVar2.o0(objP24);
            }
            Function1 function11111110 = (Function1) objP24;
            zG13 = fetVar2.g(pz40VarO2);
            objP25 = fetVar2.P();
            if (zG13) {
                objP25 = new ca6(pz40VarO2, (byte) 23);
                fetVar2.o0(objP25);
            } else {
                objP25 = new ca6(pz40VarO2, (byte) 23);
                fetVar2.o0(objP25);
            }
            int i311117 = i16 << 3;
            h(null, str2, str11111111112, str11111111113, locale, z, ulq0Var, amVar11119, ifjVar11119, jLongValue12, simpleDate1110, simpleDateTime3, simpleDateTime8, simpleDateTime, simpleDateTime2, calendar, yg40Var111, j1e0Var16, uts0Var8, function11111110, (Function1) objP25, fetVar2, 6 | (i16 & 896) | ((i12 << 15) & 458752) | (i21111112 & 3670016) | (i21111112 & 29360128), (i311117 & 458752) | (i311117 & 57344) | 805605952 | i21111118 | i311115);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            yg40Var2 = yg40Var111;
        } else {
            fetVar2.X();
            yg40Var2 = yg40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.uej
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(i2 | 1);
                    int iL2 = x8x.L(i3);
                    rsr0.p(mm40Var, str, str2, simpleDateTime, simpleDateTime2, simpleDate, simpleDate2, z, ulq0Var, calendar, locale, timeOfDay23, timeOfDay24, yg40Var2, function1, function2, (fet) obj, iL, iL2, i4);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void q(mm40 mm40Var, final am amVar, final boolean z, final Locale locale, final Calendar calendar, final long j, final SimpleDate simpleDate, final SimpleDate simpleDate2, final SimpleDate simpleDate3, final SimpleDate simpleDate4, final SimpleDate simpleDate5, final Function1 function1, final Function1 function2, fet fetVar, final int i2) {
        final mm40 mm40Var2;
        Object dgVar;
        int i3;
        SimpleDate simpleDate6;
        SimpleDate simpleDate7;
        fetVar.g0(869223613);
        int i4 = i2 | 6 | (fetVar.e(amVar.ordinal()) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.g(locale) ? 2048 : 1024) | (fetVar.i(calendar) ? 16384 : 8192) | (fetVar.f(j) ? 131072 : 65536) | (fetVar.i(simpleDate) ? 1048576 : 524288) | (fetVar.i(simpleDate2) ? 8388608 : 4194304) | (fetVar.i(simpleDate3) ? 67108864 : 33554432) | (fetVar.i(simpleDate4) ? 536870912 : 268435456);
        if (fetVar.U(i4 & 1, ((i4 & 306783379) == 306783378 && (((('\b' | (fetVar.i(simpleDate5) ? (char) 4 : (char) 2)) | (fetVar.i(function1) ? ' ' : (char) 16)) | (fetVar.i(function2) ? (char) 256 : (char) 128)) & 147) == 146) ? false : true)) {
            int i5 = i4 >> 6;
            pz40 pz40VarF = androidx.compose.runtime.e.f(Boolean.valueOf(z), fetVar);
            pz40 pz40VarF2 = androidx.compose.runtime.e.f(amVar, fetVar);
            pz40 pz40VarF3 = androidx.compose.runtime.e.f(function1, fetVar);
            pz40 pz40VarF4 = androidx.compose.runtime.e.f(function2, fetVar);
            boolean zG = fetVar.g(calendar);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                dgVar = new dg(pz40VarF, calendar, pz40VarF2, pz40VarF3, pz40VarF4, (byte) 12);
                fetVar.o0(dgVar);
            } else {
                dgVar = objP;
            }
            Function1 function3 = (Function1) dgVar;
            int iOrdinal = amVar.ordinal();
            if (iOrdinal != 0) {
                i3 = 1;
                if (iOrdinal != 1) {
                    t9f.b();
                    return;
                }
                simpleDate6 = simpleDate;
            } else {
                i3 = 1;
                simpleDate6 = simpleDate2;
            }
            int iOrdinal2 = amVar.ordinal();
            if (iOrdinal2 == 0) {
                simpleDate7 = simpleDate4;
            } else {
                if (iOrdinal2 != i3) {
                    t9f.b();
                    return;
                }
                simpleDate7 = simpleDate5;
            }
            jm40 jm40Var = jm40.b;
            tlb.g(o7k0.d(jm40Var, 1.0f), simpleDate6, simpleDate3, Long.valueOf(j), z, calendar, locale, simpleDate7, amVar, function3, fetVar, ((i4 >> 18) & 896) | 576 | (i5 & 7168) | (57344 & (i4 << 6)) | (458752 & (i4 << 3)) | ((i4 << 9) & 3670016) | 16777216 | ((i4 << 21) & 234881024), 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(amVar, z, locale, calendar, j, simpleDate, simpleDate2, simpleDate3, simpleDate4, simpleDate5, function1, function2, i2) { // from class: a.qej
                public final /* synthetic */ am b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ Locale d;
                public final /* synthetic */ Calendar e;
                public final /* synthetic */ long f;
                public final /* synthetic */ SimpleDate g;
                public final /* synthetic */ SimpleDate h;
                public final /* synthetic */ SimpleDate i;
                public final /* synthetic */ SimpleDate j;
                public final /* synthetic */ SimpleDate k;
                public final /* synthetic */ Function1 l;
                public final /* synthetic */ Function1 m;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(1226833921);
                    rsr0.q(this.f28587a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:104:0x04da  */
    /* JADX WARN: Code duplicated, block: B:106:0x053a  */
    /* JADX WARN: Code duplicated, block: B:108:0x0541  */
    /* JADX WARN: Code duplicated, block: B:110:0x055a  */
    /* JADX WARN: Code duplicated, block: B:111:0x055c  */
    /* JADX WARN: Code duplicated, block: B:115:0x056b  */
    /* JADX WARN: Code duplicated, block: B:118:0x0591  */
    /* JADX WARN: Code duplicated, block: B:119:0x0595  */
    /* JADX WARN: Code duplicated, block: B:122:0x05be  */
    /* JADX WARN: Code duplicated, block: B:123:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:126:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:129:0x0603  */
    /* JADX WARN: Code duplicated, block: B:130:0x061c  */
    /* JADX WARN: Code duplicated, block: B:133:0x062d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0645  */
    /* JADX WARN: Code duplicated, block: B:137:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:138:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:141:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:147:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:149:0x0705  */
    /* JADX WARN: Code duplicated, block: B:151:0x0758  */
    /* JADX WARN: Code duplicated, block: B:153:0x0768  */
    /* JADX WARN: Code duplicated, block: B:155:0x077b  */
    /* JADX WARN: Code duplicated, block: B:157:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:158:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:161:0x07e9  */
    /* JADX WARN: Code duplicated, block: B:162:0x07ed  */
    /* JADX WARN: Code duplicated, block: B:164:0x0828  */
    /* JADX WARN: Code duplicated, block: B:166:0x085e  */
    /* JADX WARN: Code duplicated, block: B:167:0x0862  */
    /* JADX WARN: Code duplicated, block: B:170:0x08c3  */
    /* JADX WARN: Code duplicated, block: B:172:0x08cb  */
    /* JADX WARN: Code duplicated, block: B:175:0x08d5  */
    /* JADX WARN: Code duplicated, block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:35:0x0096  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:45:0x0130  */
    /* JADX WARN: Code duplicated, block: B:46:0x0134  */
    /* JADX WARN: Code duplicated, block: B:48:0x0182  */
    /* JADX WARN: Code duplicated, block: B:50:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:51:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:55:0x025f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0276  */
    /* JADX WARN: Code duplicated, block: B:58:0x0278  */
    /* JADX WARN: Code duplicated, block: B:61:0x0285  */
    /* JADX WARN: Code duplicated, block: B:62:0x0287  */
    /* JADX WARN: Code duplicated, block: B:65:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:73:0x0314  */
    /* JADX WARN: Code duplicated, block: B:74:0x031a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0331  */
    /* JADX WARN: Code duplicated, block: B:80:0x0395  */
    /* JADX WARN: Code duplicated, block: B:81:0x0399  */
    /* JADX WARN: Code duplicated, block: B:84:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:87:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:89:0x0406  */
    /* JADX WARN: Code duplicated, block: B:91:0x0435  */
    /* JADX WARN: Code duplicated, block: B:93:0x043c  */
    /* JADX WARN: Code duplicated, block: B:94:0x045d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0463  */
    /* JADX WARN: Code duplicated, block: B:98:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:99:0x04a4  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void r(mm40 mm40Var, n3n n3nVar, Function2 function2, fet fetVar, int i2, int i3) {
        Function2 function3;
        boolean z;
        Function2 function4;
        yfe0 yfe0VarU;
        xx7 xx7Var;
        gqw0 gqw0Var;
        boolean z2;
        Function2 function5;
        pcy pcyVar;
        shd shdVar;
        shd shdVar2;
        shd shdVar3;
        shd shdVar4;
        boolean z3;
        jm40 jm40Var;
        pcy pcyVar2;
        int i4;
        pcy pcyVar3;
        shd shdVar5;
        shd shdVar6;
        shd shdVar7;
        zx7 zx7Var;
        shd shdVar8;
        jm40 jm40Var2;
        Function2 function6;
        xx7 xx7Var2;
        boolean z4;
        boolean z5;
        byte b2;
        cl5 cl5Var;
        jm40 jm40Var3;
        Function2 function7;
        xx7 xx7Var3;
        shd shdVar9;
        shd shdVar10;
        shd shdVar11;
        shd shdVar12;
        pcy pcyVar4;
        byte b3;
        jm40 jm40Var4;
        shd shdVar13;
        mm40 mm40Var2;
        Function2 function8;
        boolean z6;
        float f2;
        shd shdVar14;
        m3n m3nVar;
        zfn zfnVar;
        boolean z7;
        boolean zH;
        Object objP;
        final aal0 aal0Var;
        long jM126getWhite200d7_KjU;
        Object objP2;
        final mm40 mm40Var3;
        Object objP3;
        final mm40 mm40Var4;
        boolean z8;
        ugd ugdVarM;
        ugd ugdVarM2;
        mm40 mm40VarN;
        Object objP4;
        m3n m3nVar2;
        qal0 qal0Var;
        boolean z9;
        jm40 jm40Var5;
        fex fexVar;
        boolean z10;
        pz40 pz40VarF;
        boolean z11;
        pz40 pz40VarF2;
        Object objP5;
        pcy pcyVar5;
        Object objP6;
        Object objP7;
        fet fetVar2 = fetVar;
        zx7 zx7Var2 = gqw0.e;
        n3nVar.getClass();
        fetVar2.g0(-1937686667);
        int i5 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i5 |= fetVar2.g(n3nVar) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 == 0) {
            if ((i2 & 384) == 0) {
                function3 = function2;
                i5 |= fetVar2.i(function3) ? 256 : 128;
            }
            if ((i5 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar2.U(i5 & 1, z)) {
                if (i6 != 0) {
                    function3 = null;
                }
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarL = s5x0.L(mm40Var, qmk.a(fetVar2).d, 0.0f, 2);
                nw3 nw3Var = uc9.g;
                xx7Var = gqw0.m;
                x5d x5dVarA = w5d.a(nw3Var, xx7Var, fetVar2, 6);
                int iHashCode = Long.hashCode(fetVar2.T);
                bh90 bh90VarM = fetVar2.m();
                mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
                gqw0Var = mkd.c0;
                gqw0Var.getClass();
                fetVar2.i0();
                z2 = fetVar2.S;
                function5 = function3;
                pcyVar = e7z.u1;
                if (z2) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                shdVar = gqw0.x;
                jpm0.o(fetVar2, x5dVarA, shdVar);
                shdVar2 = gqw0.w;
                jpm0.o(fetVar2, bh90VarM, shdVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                shdVar3 = gqw0.y;
                jpm0.o(fetVar2, numValueOf, shdVar3);
                jpm0.n(fetVar2);
                shdVar4 = gqw0.v;
                jpm0.o(fetVar2, mm40VarC0, shdVar4);
                z3 = n3nVar instanceof l3n;
                jm40Var = jm40.b;
                if (z3) {
                    fetVar2.e0(-53224022);
                    mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, 24.0f), 1.0f);
                    tj30 tj30VarC = zq8.c(zx7Var2, false);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarD);
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
                    mm40 mm40VarL2 = s5x0.L(o7k0.e(o7k0.d(jm40Var, 1.0f), 12.0f), 96.0f, 0.0f, 2);
                    tj30 tj30VarC2 = zq8.c(zx7Var2, false);
                    int iHashCode3 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM3 = fetVar2.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarL2);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC2, shdVar);
                    jpm0.o(fetVar2, bh90VarM3, shdVar2);
                    vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
                    jpm0.o(fetVar2, mm40VarC2, shdVar4);
                    mm40 mm40VarE = o7k0.u(jm40Var, 0.0f, 256.0f, 1).e(o7k0.c);
                    zcl zclVar2 = qmk.m;
                    ugg0 ugg0Var = vgg0.f37379a;
                    dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(vqm.b, fetVar2, 6, 0), fetVar2, 0, true);
                    fetVar2.r(true);
                    fetVar2.r(false);
                    zx7Var = zx7Var2;
                    i4 = i5;
                    z4 = true;
                    pcyVar3 = pcyVar;
                    shdVar5 = shdVar4;
                    shdVar6 = shdVar3;
                    shdVar7 = shdVar2;
                    jm40Var2 = jm40Var;
                    shdVar8 = shdVar;
                    function6 = function5;
                    xx7Var2 = xx7Var;
                } else {
                    fetVar2.e0(-52285745);
                    mm40 mm40VarE2 = o7k0.e(o7k0.d(jm40Var, 1.0f), 24.0f);
                    j83 j83VarA = n3nVar.a();
                    j83VarA.getClass();
                    mm40 mm40VarD2 = o7k0.d(mm40VarE2, 1.0f);
                    tj30 tj30VarC3 = zq8.c(zx7Var2, false);
                    int iHashCode4 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM4 = fetVar2.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarD2);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        pcyVar2 = pcyVar;
                        fetVar2.l(pcyVar2);
                    } else {
                        pcyVar2 = pcyVar;
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC3, shdVar);
                    jpm0.o(fetVar2, bh90VarM4, shdVar2);
                    vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
                    jpm0.o(fetVar2, mm40VarC3, shdVar4);
                    int i7 = i5;
                    mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                    ((g1t0) fetVar2.k(j1t0.e)).getClass();
                    i4 = i7;
                    pcyVar3 = pcyVar2;
                    shdVar5 = shdVar4;
                    shdVar6 = shdVar3;
                    shdVar7 = shdVar2;
                    zx7Var = zx7Var2;
                    shdVar8 = shdVar;
                    jm40Var2 = jm40Var;
                    function6 = function5;
                    xx7Var2 = xx7Var;
                    z4 = true;
                    v8q0.b(j83VarA, mm40VarD3, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, null, g1t0.h(), fetVar2, 48, 24960, 240632);
                    fetVar2 = fetVar2;
                    fetVar2.r(true);
                    fetVar2.r(false);
                }
                z5 = n3nVar instanceof h3n;
                b2 = 14;
                cl5Var = ukd.f35823a;
                if (z5) {
                    fetVar2.e0(-51999677);
                    jm40Var5 = jm40Var2;
                    mm40 mm40VarD4 = o7k0.d(jm40Var5, 1.0f);
                    final h3n h3nVar = (h3n) n3nVar;
                    fexVar = h3nVar.d;
                    if (fexVar == fex.f9426a) {
                        z10 = z4;
                    } else {
                        z10 = false;
                    }
                    pz40VarF = androidx.compose.runtime.e.f(Boolean.valueOf(z10), fetVar2);
                    if (fexVar == fex.b) {
                        z11 = z4;
                    } else {
                        z11 = false;
                    }
                    pz40VarF2 = androidx.compose.runtime.e.f(Boolean.valueOf(z11), fetVar2);
                    x5d x5dVarA2 = w5d.a(new qw3(8.0f, z4, new jf4(b2)), xx7Var2, fetVar2, 0);
                    int iHashCode5 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM5 = fetVar2.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar2, mm40VarD4);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar3);
                    } else {
                        fetVar2.r0();
                    }
                    shdVar9 = shdVar8;
                    jpm0.o(fetVar2, x5dVarA2, shdVar9);
                    shd shdVar15 = shdVar7;
                    jpm0.o(fetVar2, bh90VarM5, shdVar15);
                    shdVar11 = shdVar6;
                    vqd.u(iHashCode5, fetVar2, shdVar11, fetVar2);
                    shd shdVar16 = shdVar5;
                    jpm0.o(fetVar2, mm40VarC4, shdVar16);
                    objP5 = fetVar2.P();
                    if (objP5 == cl5Var) {
                        objP5 = o7k0.d(jm40Var5, 1.0f);
                        fetVar2.o0(objP5);
                    }
                    mm40 mm40Var5 = (mm40) objP5;
                    pzw.w(mm40Var5, h3nVar.c, fetVar2);
                    qw3 qw3Var = new qw3(8.0f, z4, new jf4(b2));
                    yx7 yx7Var = gqw0.k;
                    thg0 thg0VarA = shg0.a(qw3Var, yx7Var, fetVar2, 48);
                    pcyVar5 = pcyVar3;
                    int iHashCode6 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM6 = fetVar2.m();
                    mm40 mm40VarC5 = kbc.c0(fetVar2, mm40Var5);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        pcyVar4 = pcyVar5;
                        fetVar2.l(pcyVar4);
                    } else {
                        pcyVar4 = pcyVar5;
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, thg0VarA, shdVar9);
                    jpm0.o(fetVar2, bh90VarM6, shdVar15);
                    vqd.u(iHashCode6, fetVar2, shdVar11, fetVar2);
                    jpm0.o(fetVar2, mm40VarC5, shdVar16);
                    objP6 = fetVar2.P();
                    if (objP6 == cl5Var) {
                        objP6 = jgk0.b(new rip(pz40VarF, (byte) 29));
                        fetVar2.o0(objP6);
                    }
                    zfn zfnVar2 = eal0.c;
                    l5d0 l5d0VarA = zfnVar2.a(((l7m0) objP6).getValue());
                    final Function2 function9 = function6;
                    final byte b4 = 0;
                    obc.d(l5d0VarA, u1c.M(1168353998, new Function2() { // from class: a.l9l0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b5 = b4;
                            Function2 function10 = function9;
                            h3n h3nVar2 = h3nVar;
                            fet fetVar3 = (fet) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            switch (b5) {
                                case 0:
                                    if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        if (1.0f <= 0.0d) {
                                            vcx.a("invalid weight; must be greater than zero");
                                        }
                                        azw.v(new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), h3nVar2.e, function10, fetVar3);
                                    } else {
                                        fetVar3.X();
                                    }
                                    break;
                                default:
                                    if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        if (1.0f <= 0.0d) {
                                            vcx.a("invalid weight; must be greater than zero");
                                        }
                                        azw.v(new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), h3nVar2.f, function10, fetVar3);
                                    } else {
                                        fetVar3.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar2), fetVar2, 56);
                    qxw.p(null, h3nVar.g, pz40VarF, fetVar2, 0);
                    fetVar2.r(true);
                    thg0 thg0VarA2 = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), yx7Var, fetVar2, 48);
                    int iHashCode7 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM7 = fetVar2.m();
                    mm40 mm40VarC6 = kbc.c0(fetVar2, mm40Var5);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar4);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, thg0VarA2, shdVar9);
                    jpm0.o(fetVar2, bh90VarM7, shdVar15);
                    vqd.u(iHashCode7, fetVar2, shdVar11, fetVar2);
                    jpm0.o(fetVar2, mm40VarC6, shdVar16);
                    objP7 = fetVar2.P();
                    if (objP7 == cl5Var) {
                        objP7 = jgk0.b(new m9l0(pz40VarF2, (byte) 0));
                        fetVar2.o0(objP7);
                    }
                    final byte b5 = 1;
                    obc.d(zfnVar2.a(((l7m0) objP7).getValue()), u1c.M(-1543673545, new Function2() { // from class: a.l9l0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b6 = b5;
                            Function2 function10 = function9;
                            h3n h3nVar2 = h3nVar;
                            fet fetVar3 = (fet) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            switch (b6) {
                                case 0:
                                    if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        if (1.0f <= 0.0d) {
                                            vcx.a("invalid weight; must be greater than zero");
                                        }
                                        azw.v(new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), h3nVar2.e, function10, fetVar3);
                                    } else {
                                        fetVar3.X();
                                    }
                                    break;
                                default:
                                    if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                        if (1.0f <= 0.0d) {
                                            vcx.a("invalid weight; must be greater than zero");
                                        }
                                        azw.v(new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), h3nVar2.f, function10, fetVar3);
                                    } else {
                                        fetVar3.X();
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, fetVar2), fetVar2, 56);
                    qxw.p(null, h3nVar.h, pz40VarF2, fetVar2, 0);
                    ohs0.x(fetVar2, true, true, false);
                    z6 = false;
                    shdVar13 = shdVar15;
                    function8 = function9;
                    shdVar14 = shdVar16;
                    mm40Var2 = jm40Var5;
                    f2 = 1.0f;
                } else {
                    jm40Var3 = jm40Var2;
                    function7 = function6;
                    xx7Var3 = xx7Var2;
                    shdVar9 = shdVar8;
                    shdVar10 = shdVar7;
                    shdVar11 = shdVar6;
                    shdVar12 = shdVar5;
                    pcyVar4 = pcyVar3;
                    b3 = 0;
                    if (n3nVar instanceof i3n) {
                        fetVar2.e0(-51726877);
                        jm40Var4 = jm40Var3;
                        kr00.a(u1c.M(1744836299, new n9l0(o7k0.d(jm40Var4, 1.0f), (i3n) n3nVar, function7, b3), fetVar2), fetVar2, 6);
                        fetVar2.r(false);
                        f2 = 1.0f;
                        z6 = false;
                    } else {
                        jm40Var4 = jm40Var3;
                        if (n3nVar instanceof j3n) {
                            fetVar2.e0(-51187167);
                            j0x.n(dw9.h(1.0f, o7k0.d(jm40Var4, 1.0f), true), (j3n) n3nVar, fetVar2, i4 & 112);
                            fetVar2.r(false);
                            f2 = 1.0f;
                            z6 = false;
                        } else if (n3nVar instanceof k3n) {
                            fetVar2.e0(-50915235);
                            k3n k3nVar = (k3n) n3nVar;
                            mm40 mm40VarD5 = o7k0.d(o7k0.d(jm40Var4, 1.0f), 1.0f);
                            x5d x5dVarA3 = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.n, fetVar2, 48);
                            int iHashCode8 = Long.hashCode(fetVar2.T);
                            bh90 bh90VarM8 = fetVar2.m();
                            mm40 mm40VarC7 = kbc.c0(fetVar2, mm40VarD5);
                            fetVar2.i0();
                            if (fetVar2.S) {
                                fetVar2.l(pcyVar4);
                            } else {
                                fetVar2.r0();
                            }
                            jpm0.o(fetVar2, x5dVarA3, shdVar9);
                            jpm0.o(fetVar2, bh90VarM8, shdVar10);
                            vqd.u(iHashCode8, fetVar2, shdVar11, fetVar2);
                            jpm0.o(fetVar2, mm40VarC7, shdVar12);
                            shdVar13 = shdVar10;
                            n2x.n(null, new gal0(k3nVar.d), null, fetVar2, 0, 5);
                            qal0Var = k3nVar.b;
                            if (qal0Var == null) {
                                fetVar2.e0(1333857640);
                                z6 = false;
                                fetVar2.r(false);
                            } else {
                                fetVar2.e0(1333857641);
                                c3x.n(null, u1c.M(1575790146, new ygd(qal0Var, (byte) 12), fetVar2), u1c.M(-1547913783, new ygd(qal0Var, (byte) 13), fetVar2), u1c.M(-541232536, new ygd(qal0Var, (byte) 14), fetVar2), u1c.M(465448711, new ygd(qal0Var, (byte) 15), fetVar2), fetVar, 28080);
                                fetVar2 = fetVar;
                                z6 = false;
                                fetVar2.r(false);
                            }
                            fetVar2.r(true);
                            fetVar2.r(z6);
                            function8 = function7;
                            shdVar14 = shdVar12;
                            mm40Var2 = jm40Var4;
                            f2 = 1.0f;
                        } else {
                            shdVar13 = shdVar10;
                            if (n3nVar instanceof m3n) {
                                fetVar2.e0(-50700219);
                                mm40 mm40VarD6 = o7k0.d(jm40Var4, 1.0f);
                                m3nVar = (m3n) n3nVar;
                                zfnVar = bmd.n;
                                if (fetVar2.k(zfnVar) == k6z.b) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                zH = fetVar2.h(z7);
                                objP = fetVar2.P();
                                if (zH || objP == cl5Var) {
                                    objP = new kp2((byte) 9, z7);
                                    fetVar2.o0(objP);
                                }
                                tj30 tj30Var = (tj30) objP;
                                int iHashCode9 = Long.hashCode(fetVar2.T);
                                bh90 bh90VarM9 = fetVar2.m();
                                mm40 mm40VarC8 = kbc.c0(fetVar2, mm40VarD6);
                                gqw0Var.getClass();
                                fetVar2.i0();
                                if (fetVar2.S) {
                                    fetVar2.l(pcyVar4);
                                } else {
                                    fetVar2.r0();
                                }
                                jpm0.o(fetVar2, tj30Var, shdVar9);
                                jpm0.o(fetVar2, bh90VarM9, shdVar13);
                                vqd.u(iHashCode9, fetVar2, shdVar11, fetVar2);
                                jpm0.o(fetVar2, mm40VarC8, shdVar12);
                                mm40 mm40VarK0 = mrv.k0(jm40Var4, "SPORT_GAME_BOARD_SCORE");
                                aal0Var = m3nVar.f;
                                jM126getWhite200d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m126getWhite200d7_KjU();
                                objP2 = fetVar2.P();
                                if (objP2 == cl5Var) {
                                    objP2 = rq8.L(s5x0.J(o7k0.n(jm40Var4, 32.0f), 1.0f), new r2a0((byte) 7, jM126getWhite200d7_KjU));
                                    fetVar2.o0(objP2);
                                }
                                mm40Var3 = (mm40) objP2;
                                objP3 = fetVar2.P();
                                if (objP3 == cl5Var) {
                                    objP3 = o7k0.e(o7k0.s(jm40Var4, 32.0f), 16.0f);
                                    fetVar2.o0(objP3);
                                }
                                mm40Var4 = (mm40) objP3;
                                pz40 pz40VarF3 = androidx.compose.runtime.e.f(aal0Var.b, fetVar2);
                                if (aal0Var.d != null) {
                                    fetVar2.e0(2094636039);
                                    z8 = false;
                                    final Object[] objArr = 0 == true ? 1 : 0;
                                    ugdVarM = u1c.M(-85543668, new xdr() { // from class: a.bal0
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // a.xdr
                                        public final Object F(Object obj, Object obj2, Object obj3) {
                                            byte b6 = objArr;
                                            final mm40 mm40Var6 = mm40Var4;
                                            final aal0 aal0Var2 = aal0Var;
                                            Object[] objArr2 = 0;
                                            final byte b7 = 2;
                                            char c2 = 1;
                                            switch (b6) {
                                                case 0:
                                                    y5d y5dVar = (y5d) obj;
                                                    fet fetVar3 = (fet) obj2;
                                                    int iIntValue = ((Integer) obj3).intValue();
                                                    y5dVar.getClass();
                                                    if ((iIntValue & 6) == 0) {
                                                        iIntValue |= fetVar3.g(y5dVar) ? 4 : 2;
                                                    }
                                                    if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                                        zd90 zd90Var = aal0Var2.d;
                                                        j83 j83Var = zd90Var.f44202a;
                                                        j83 j83Var2 = zd90Var.b;
                                                        ((g1t0) fetVar3.k(j1t0.e)).getClass();
                                                        y9q0 y9q0VarD = g1t0.d();
                                                        final Object[] objArr3 = objArr2 == true ? 1 : 0;
                                                        zvw.v(y5dVar, mm40Var3, j83Var, j83Var2, y9q0VarD, u1c.M(1301445920, new xdr() { // from class: a.cal0
                                                            @Override // a.xdr
                                                            public final Object F(Object obj4, Object obj5, Object obj6) {
                                                                byte b8 = objArr3;
                                                                aal0 aal0Var3 = aal0Var2;
                                                                mm40 mm40Var7 = mm40Var6;
                                                                y5d y5dVar2 = (y5d) obj4;
                                                                fet fetVar4 = (fet) obj5;
                                                                int iIntValue2 = ((Integer) obj6).intValue();
                                                                switch (b8) {
                                                                    case 0:
                                                                        y5dVar2.getClass();
                                                                        if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                                            dtb.t(6, fetVar4, mm40Var7, aal0Var3.d.c);
                                                                        } else {
                                                                            fetVar4.X();
                                                                        }
                                                                        break;
                                                                    case 1:
                                                                        y5dVar2.getClass();
                                                                        if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                                            dtb.t(6, fetVar4, mm40Var7, aal0Var3.e.c);
                                                                        } else {
                                                                            fetVar4.X();
                                                                        }
                                                                        break;
                                                                    default:
                                                                        y5dVar2.getClass();
                                                                        if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                                                            dtb.t(6, fetVar4, mm40Var7, aal0Var3.c.c);
                                                                        } else {
                                                                            fetVar4.X();
                                                                        }
                                                                        break;
                                                                }
                                                                return Unit.f46060a;
                                                            }
                                                        }, fetVar3), fetVar3, 196656 | (iIntValue & 14));
                                                    } else {
                                                        fetVar3.X();
                                                    }
                                                    break;
                                                case 1:
                                                    y5d y5dVar2 = (y5d) obj;
                                                    boolean z12 = false;
                                                    fet fetVar4 = (fet) obj2;
                                                    int iIntValue2 = ((Integer) obj3).intValue();
                                                    y5dVar2.getClass();
                                                    if ((iIntValue2 & 6) == 0) {
                                                        iIntValue2 |= fetVar4.g(y5dVar2) ? 4 : 2;
                                                    }
                                                    if ((iIntValue2 & 19) != 18) {
                                                        z12 = true;
                                                    }
                                                    if (fetVar4.U(iIntValue2 & 1, z12)) {
                                                        zd90 zd90Var2 = aal0Var2.e;
                                                        j83 j83Var3 = zd90Var2.f44202a;
                                                        j83 j83Var4 = zd90Var2.b;
                                                        ((g1t0) fetVar4.k(j1t0.e)).getClass();
                                                        y9q0 y9q0VarD2 = g1t0.d();
                                                        final char c3 = c2 == true ? 1 : 0;
                                                        zvw.v(y5dVar2, mm40Var3, j83Var3, j83Var4, y9q0VarD2, u1c.M(1156398672, new xdr() { // from class: a.cal0
                                                            @Override // a.xdr
                                                            public final Object F(Object obj4, Object obj5, Object obj6) {
                                                                byte b8 = c3;
                                                                aal0 aal0Var3 = aal0Var2;
                                                                mm40 mm40Var7 = mm40Var6;
                                                                y5d y5dVar3 = (y5d) obj4;
                                                                fet fetVar5 = (fet) obj5;
                                                                int iIntValue3 = ((Integer) obj6).intValue();
                                                                switch (b8) {
                                                                    case 0:
                                                                        y5dVar3.getClass();
                                                                        if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                            dtb.t(6, fetVar5, mm40Var7, aal0Var3.d.c);
                                                                        } else {
                                                                            fetVar5.X();
                                                                        }
                                                                        break;
                                                                    case 1:
                                                                        y5dVar3.getClass();
                                                                        if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                            dtb.t(6, fetVar5, mm40Var7, aal0Var3.e.c);
                                                                        } else {
                                                                            fetVar5.X();
                                                                        }
                                                                        break;
                                                                    default:
                                                                        y5dVar3.getClass();
                                                                        if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                                            dtb.t(6, fetVar5, mm40Var7, aal0Var3.c.c);
                                                                        } else {
                                                                            fetVar5.X();
                                                                        }
                                                                        break;
                                                                }
                                                                return Unit.f46060a;
                                                            }
                                                        }, fetVar4), fetVar4, 196656 | (iIntValue2 & 14));
                                                    } else {
                                                        fetVar4.X();
                                                    }
                                                    break;
                                                default:
                                                    y5d y5dVar3 = (y5d) obj;
                                                    fet fetVar5 = (fet) obj2;
                                                    int iIntValue3 = ((Integer) obj3).intValue();
                                                    y5dVar3.getClass();
                                                    if ((iIntValue3 & 6) == 0) {
                                                        iIntValue3 |= fetVar5.g(y5dVar3) ? 4 : 2;
                                                    }
                                                    if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                                        zd90 zd90Var3 = aal0Var2.c;
                                                        j83 j83Var5 = zd90Var3.f44202a;
                                                        j83 j83Var6 = zd90Var3.b;
                                                        ((g1t0) fetVar5.k(j1t0.e)).getClass();
                                                        zvw.v(y5dVar3, mm40Var3, j83Var5, j83Var6, g1t0.a(), u1c.M(-1240611666, new xdr() { // from class: a.cal0
                                                            @Override // a.xdr
                                                            public final Object F(Object obj4, Object obj5, Object obj6) {
                                                                byte b8 = b7;
                                                                aal0 aal0Var3 = aal0Var2;
                                                                mm40 mm40Var7 = mm40Var6;
                                                                y5d y5dVar4 = (y5d) obj4;
                                                                fet fetVar6 = (fet) obj5;
                                                                int iIntValue4 = ((Integer) obj6).intValue();
                                                                switch (b8) {
                                                                    case 0:
                                                                        y5dVar4.getClass();
                                                                        if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                            dtb.t(6, fetVar6, mm40Var7, aal0Var3.d.c);
                                                                        } else {
                                                                            fetVar6.X();
                                                                        }
                                                                        break;
                                                                    case 1:
                                                                        y5dVar4.getClass();
                                                                        if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                            dtb.t(6, fetVar6, mm40Var7, aal0Var3.e.c);
                                                                        } else {
                                                                            fetVar6.X();
                                                                        }
                                                                        break;
                                                                    default:
                                                                        y5dVar4.getClass();
                                                                        if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                            dtb.t(6, fetVar6, mm40Var7, aal0Var3.c.c);
                                                                        } else {
                                                                            fetVar6.X();
                                                                        }
                                                                        break;
                                                                }
                                                                return Unit.f46060a;
                                                            }
                                                        }, fetVar5), fetVar5, (iIntValue3 & 14) | 196656);
                                                    } else {
                                                        fetVar5.X();
                                                    }
                                                    break;
                                            }
                                            return Unit.f46060a;
                                        }
                                    }, fetVar2);
                                    fetVar2.r(false);
                                } else {
                                    z8 = false;
                                    fetVar2.e0(2095133930);
                                    fetVar2.r(false);
                                    ugdVarM = null;
                                }
                                if (aal0Var.e != null) {
                                    fetVar2.e0(2095240260);
                                    final byte b6 = 1;
                                    ugdVarM2 = u1c.M(-300733636, new xdr() { // from class: a.bal0
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // a.xdr
                                        public final Object F(Object obj, Object obj2, Object obj3) {
                                            byte b7 = b6;
                                            final mm40 mm40Var6 = mm40Var4;
                                            final aal0 aal0Var2 = aal0Var;
                                            Object[] objArr2 = 0;
                                            final byte b8 = 2;
                                            char c2 = 1;
                                            switch (b7) {
                                                case 0:
                                                    y5d y5dVar = (y5d) obj;
                                                    fet fetVar3 = (fet) obj2;
                                                    int iIntValue = ((Integer) obj3).intValue();
                                                    y5dVar.getClass();
                                                    if ((iIntValue & 6) == 0) {
                                                        iIntValue |= fetVar3.g(y5dVar) ? 4 : 2;
                                                    }
                                                    if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                                        zd90 zd90Var = aal0Var2.d;
                                                        j83 j83Var = zd90Var.f44202a;
                                                        j83 j83Var2 = zd90Var.b;
                                                        ((g1t0) fetVar3.k(j1t0.e)).getClass();
                                                        y9q0 y9q0VarD = g1t0.d();
                                                        final byte objArr3 = objArr2 == true ? 1 : 0;
                                                        zvw.v(y5dVar, mm40Var3, j83Var, j83Var2, y9q0VarD, u1c.M(1301445920, new xdr() { // from class: a.cal0
                                                            @Override // a.xdr
                                                            public final Object F(Object obj4, Object obj5, Object obj6) {
                                                                byte b9 = objArr3;
                                                                aal0 aal0Var3 = aal0Var2;
                                                                mm40 mm40Var7 = mm40Var6;
                                                                y5d y5dVar4 = (y5d) obj4;
                                                                fet fetVar6 = (fet) obj5;
                                                                int iIntValue4 = ((Integer) obj6).intValue();
                                                                switch (b9) {
                                                                    case 0:
                                                                        y5dVar4.getClass();
                                                                        if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                            dtb.t(6, fetVar6, mm40Var7, aal0Var3.d.c);
                                                                        } else {
                                                                            fetVar6.X();
                                                                        }
                                                                        break;
                                                                    case 1:
                                                                        y5dVar4.getClass();
                                                                        if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                            dtb.t(6, fetVar6, mm40Var7, aal0Var3.e.c);
                                                                        } else {
                                                                            fetVar6.X();
                                                                        }
                                                                        break;
                                                                    default:
                                                                        y5dVar4.getClass();
                                                                        if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                            dtb.t(6, fetVar6, mm40Var7, aal0Var3.c.c);
                                                                        } else {
                                                                            fetVar6.X();
                                                                        }
                                                                        break;
                                                                }
                                                                return Unit.f46060a;
                                                            }
                                                        }, fetVar3), fetVar3, 196656 | (iIntValue & 14));
                                                    } else {
                                                        fetVar3.X();
                                                    }
                                                    break;
                                                case 1:
                                                    y5d y5dVar2 = (y5d) obj;
                                                    boolean z12 = false;
                                                    fet fetVar4 = (fet) obj2;
                                                    int iIntValue2 = ((Integer) obj3).intValue();
                                                    y5dVar2.getClass();
                                                    if ((iIntValue2 & 6) == 0) {
                                                        iIntValue2 |= fetVar4.g(y5dVar2) ? 4 : 2;
                                                    }
                                                    if ((iIntValue2 & 19) != 18) {
                                                        z12 = true;
                                                    }
                                                    if (fetVar4.U(iIntValue2 & 1, z12)) {
                                                        zd90 zd90Var2 = aal0Var2.e;
                                                        j83 j83Var3 = zd90Var2.f44202a;
                                                        j83 j83Var4 = zd90Var2.b;
                                                        ((g1t0) fetVar4.k(j1t0.e)).getClass();
                                                        y9q0 y9q0VarD2 = g1t0.d();
                                                        final byte c3 = c2 == true ? 1 : 0;
                                                        zvw.v(y5dVar2, mm40Var3, j83Var3, j83Var4, y9q0VarD2, u1c.M(1156398672, new xdr() { // from class: a.cal0
                                                            @Override // a.xdr
                                                            public final Object F(Object obj4, Object obj5, Object obj6) {
                                                                byte b9 = c3;
                                                                aal0 aal0Var3 = aal0Var2;
                                                                mm40 mm40Var7 = mm40Var6;
                                                                y5d y5dVar4 = (y5d) obj4;
                                                                fet fetVar6 = (fet) obj5;
                                                                int iIntValue4 = ((Integer) obj6).intValue();
                                                                switch (b9) {
                                                                    case 0:
                                                                        y5dVar4.getClass();
                                                                        if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                            dtb.t(6, fetVar6, mm40Var7, aal0Var3.d.c);
                                                                        } else {
                                                                            fetVar6.X();
                                                                        }
                                                                        break;
                                                                    case 1:
                                                                        y5dVar4.getClass();
                                                                        if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                            dtb.t(6, fetVar6, mm40Var7, aal0Var3.e.c);
                                                                        } else {
                                                                            fetVar6.X();
                                                                        }
                                                                        break;
                                                                    default:
                                                                        y5dVar4.getClass();
                                                                        if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                            dtb.t(6, fetVar6, mm40Var7, aal0Var3.c.c);
                                                                        } else {
                                                                            fetVar6.X();
                                                                        }
                                                                        break;
                                                                }
                                                                return Unit.f46060a;
                                                            }
                                                        }, fetVar4), fetVar4, 196656 | (iIntValue2 & 14));
                                                    } else {
                                                        fetVar4.X();
                                                    }
                                                    break;
                                                default:
                                                    y5d y5dVar3 = (y5d) obj;
                                                    fet fetVar5 = (fet) obj2;
                                                    int iIntValue3 = ((Integer) obj3).intValue();
                                                    y5dVar3.getClass();
                                                    if ((iIntValue3 & 6) == 0) {
                                                        iIntValue3 |= fetVar5.g(y5dVar3) ? 4 : 2;
                                                    }
                                                    if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                                        zd90 zd90Var3 = aal0Var2.c;
                                                        j83 j83Var5 = zd90Var3.f44202a;
                                                        j83 j83Var6 = zd90Var3.b;
                                                        ((g1t0) fetVar5.k(j1t0.e)).getClass();
                                                        zvw.v(y5dVar3, mm40Var3, j83Var5, j83Var6, g1t0.a(), u1c.M(-1240611666, new xdr() { // from class: a.cal0
                                                            @Override // a.xdr
                                                            public final Object F(Object obj4, Object obj5, Object obj6) {
                                                                byte b9 = b8;
                                                                aal0 aal0Var3 = aal0Var2;
                                                                mm40 mm40Var7 = mm40Var6;
                                                                y5d y5dVar4 = (y5d) obj4;
                                                                fet fetVar6 = (fet) obj5;
                                                                int iIntValue4 = ((Integer) obj6).intValue();
                                                                switch (b9) {
                                                                    case 0:
                                                                        y5dVar4.getClass();
                                                                        if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                            dtb.t(6, fetVar6, mm40Var7, aal0Var3.d.c);
                                                                        } else {
                                                                            fetVar6.X();
                                                                        }
                                                                        break;
                                                                    case 1:
                                                                        y5dVar4.getClass();
                                                                        if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                            dtb.t(6, fetVar6, mm40Var7, aal0Var3.e.c);
                                                                        } else {
                                                                            fetVar6.X();
                                                                        }
                                                                        break;
                                                                    default:
                                                                        y5dVar4.getClass();
                                                                        if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                            dtb.t(6, fetVar6, mm40Var7, aal0Var3.c.c);
                                                                        } else {
                                                                            fetVar6.X();
                                                                        }
                                                                        break;
                                                                }
                                                                return Unit.f46060a;
                                                            }
                                                        }, fetVar5), fetVar5, (iIntValue3 & 14) | 196656);
                                                    } else {
                                                        fetVar5.X();
                                                    }
                                                    break;
                                            }
                                            return Unit.f46060a;
                                        }
                                    }, fetVar2);
                                    fetVar2.r(false);
                                } else {
                                    fetVar2.e0(2095741034);
                                    fetVar2.r(z8);
                                    ugdVarM2 = null;
                                }
                                ugd ugdVar = ugdVarM2;
                                ugd ugdVarM3 = u1c.M(-1531911618, new rqc0(aal0Var, (byte) 14), fetVar2);
                                ugd ugdVarM4 = u1c.M(-481538726, new tja(pz40VarF3, mm40Var4, mm40Var3, (byte) 1), fetVar2);
                                final byte b7 = 2;
                                ugd ugdVarM5 = u1c.M(-807750846, new xdr() { // from class: a.bal0
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // a.xdr
                                    public final Object F(Object obj, Object obj2, Object obj3) {
                                        byte b8 = b7;
                                        final mm40 mm40Var6 = mm40Var4;
                                        final aal0 aal0Var2 = aal0Var;
                                        Object[] objArr2 = 0;
                                        final byte b9 = 2;
                                        char c2 = 1;
                                        switch (b8) {
                                            case 0:
                                                y5d y5dVar = (y5d) obj;
                                                fet fetVar3 = (fet) obj2;
                                                int iIntValue = ((Integer) obj3).intValue();
                                                y5dVar.getClass();
                                                if ((iIntValue & 6) == 0) {
                                                    iIntValue |= fetVar3.g(y5dVar) ? 4 : 2;
                                                }
                                                if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                                    zd90 zd90Var = aal0Var2.d;
                                                    j83 j83Var = zd90Var.f44202a;
                                                    j83 j83Var2 = zd90Var.b;
                                                    ((g1t0) fetVar3.k(j1t0.e)).getClass();
                                                    y9q0 y9q0VarD = g1t0.d();
                                                    final byte objArr3 = objArr2 == true ? 1 : 0;
                                                    zvw.v(y5dVar, mm40Var3, j83Var, j83Var2, y9q0VarD, u1c.M(1301445920, new xdr() { // from class: a.cal0
                                                        @Override // a.xdr
                                                        public final Object F(Object obj4, Object obj5, Object obj6) {
                                                            byte b10 = objArr3;
                                                            aal0 aal0Var3 = aal0Var2;
                                                            mm40 mm40Var7 = mm40Var6;
                                                            y5d y5dVar4 = (y5d) obj4;
                                                            fet fetVar6 = (fet) obj5;
                                                            int iIntValue4 = ((Integer) obj6).intValue();
                                                            switch (b10) {
                                                                case 0:
                                                                    y5dVar4.getClass();
                                                                    if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                        dtb.t(6, fetVar6, mm40Var7, aal0Var3.d.c);
                                                                    } else {
                                                                        fetVar6.X();
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    y5dVar4.getClass();
                                                                    if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                        dtb.t(6, fetVar6, mm40Var7, aal0Var3.e.c);
                                                                    } else {
                                                                        fetVar6.X();
                                                                    }
                                                                    break;
                                                                default:
                                                                    y5dVar4.getClass();
                                                                    if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                        dtb.t(6, fetVar6, mm40Var7, aal0Var3.c.c);
                                                                    } else {
                                                                        fetVar6.X();
                                                                    }
                                                                    break;
                                                            }
                                                            return Unit.f46060a;
                                                        }
                                                    }, fetVar3), fetVar3, 196656 | (iIntValue & 14));
                                                } else {
                                                    fetVar3.X();
                                                }
                                                break;
                                            case 1:
                                                y5d y5dVar2 = (y5d) obj;
                                                boolean z12 = false;
                                                fet fetVar4 = (fet) obj2;
                                                int iIntValue2 = ((Integer) obj3).intValue();
                                                y5dVar2.getClass();
                                                if ((iIntValue2 & 6) == 0) {
                                                    iIntValue2 |= fetVar4.g(y5dVar2) ? 4 : 2;
                                                }
                                                if ((iIntValue2 & 19) != 18) {
                                                    z12 = true;
                                                }
                                                if (fetVar4.U(iIntValue2 & 1, z12)) {
                                                    zd90 zd90Var2 = aal0Var2.e;
                                                    j83 j83Var3 = zd90Var2.f44202a;
                                                    j83 j83Var4 = zd90Var2.b;
                                                    ((g1t0) fetVar4.k(j1t0.e)).getClass();
                                                    y9q0 y9q0VarD2 = g1t0.d();
                                                    final byte c3 = c2 == true ? 1 : 0;
                                                    zvw.v(y5dVar2, mm40Var3, j83Var3, j83Var4, y9q0VarD2, u1c.M(1156398672, new xdr() { // from class: a.cal0
                                                        @Override // a.xdr
                                                        public final Object F(Object obj4, Object obj5, Object obj6) {
                                                            byte b10 = c3;
                                                            aal0 aal0Var3 = aal0Var2;
                                                            mm40 mm40Var7 = mm40Var6;
                                                            y5d y5dVar4 = (y5d) obj4;
                                                            fet fetVar6 = (fet) obj5;
                                                            int iIntValue4 = ((Integer) obj6).intValue();
                                                            switch (b10) {
                                                                case 0:
                                                                    y5dVar4.getClass();
                                                                    if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                        dtb.t(6, fetVar6, mm40Var7, aal0Var3.d.c);
                                                                    } else {
                                                                        fetVar6.X();
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    y5dVar4.getClass();
                                                                    if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                        dtb.t(6, fetVar6, mm40Var7, aal0Var3.e.c);
                                                                    } else {
                                                                        fetVar6.X();
                                                                    }
                                                                    break;
                                                                default:
                                                                    y5dVar4.getClass();
                                                                    if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                        dtb.t(6, fetVar6, mm40Var7, aal0Var3.c.c);
                                                                    } else {
                                                                        fetVar6.X();
                                                                    }
                                                                    break;
                                                            }
                                                            return Unit.f46060a;
                                                        }
                                                    }, fetVar4), fetVar4, 196656 | (iIntValue2 & 14));
                                                } else {
                                                    fetVar4.X();
                                                }
                                                break;
                                            default:
                                                y5d y5dVar3 = (y5d) obj;
                                                fet fetVar5 = (fet) obj2;
                                                int iIntValue3 = ((Integer) obj3).intValue();
                                                y5dVar3.getClass();
                                                if ((iIntValue3 & 6) == 0) {
                                                    iIntValue3 |= fetVar5.g(y5dVar3) ? 4 : 2;
                                                }
                                                if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                                    zd90 zd90Var3 = aal0Var2.c;
                                                    j83 j83Var5 = zd90Var3.f44202a;
                                                    j83 j83Var6 = zd90Var3.b;
                                                    ((g1t0) fetVar5.k(j1t0.e)).getClass();
                                                    zvw.v(y5dVar3, mm40Var3, j83Var5, j83Var6, g1t0.a(), u1c.M(-1240611666, new xdr() { // from class: a.cal0
                                                        @Override // a.xdr
                                                        public final Object F(Object obj4, Object obj5, Object obj6) {
                                                            byte b10 = b9;
                                                            aal0 aal0Var3 = aal0Var2;
                                                            mm40 mm40Var7 = mm40Var6;
                                                            y5d y5dVar4 = (y5d) obj4;
                                                            fet fetVar6 = (fet) obj5;
                                                            int iIntValue4 = ((Integer) obj6).intValue();
                                                            switch (b10) {
                                                                case 0:
                                                                    y5dVar4.getClass();
                                                                    if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                        dtb.t(6, fetVar6, mm40Var7, aal0Var3.d.c);
                                                                    } else {
                                                                        fetVar6.X();
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    y5dVar4.getClass();
                                                                    if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                        dtb.t(6, fetVar6, mm40Var7, aal0Var3.e.c);
                                                                    } else {
                                                                        fetVar6.X();
                                                                    }
                                                                    break;
                                                                default:
                                                                    y5dVar4.getClass();
                                                                    if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                        dtb.t(6, fetVar6, mm40Var7, aal0Var3.c.c);
                                                                    } else {
                                                                        fetVar6.X();
                                                                    }
                                                                    break;
                                                            }
                                                            return Unit.f46060a;
                                                        }
                                                    }, fetVar5), fetVar5, (iIntValue3 & 14) | 196656);
                                                } else {
                                                    fetVar5.X();
                                                }
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                }, fetVar2);
                                ugd ugdVar2 = ugdVarM;
                                shdVar14 = shdVar12;
                                mm40VarN = jm40Var4;
                                fet fetVar3 = fetVar2;
                                o5n0.d(mm40VarK0, ugdVarM3, ugdVar2, ugdVar, ugdVarM4, ugdVarM5, fetVar3, 221238);
                                fetVar2 = fetVar3;
                                mm40 mm40VarK1 = mrv.k0(mm40VarN, "SPORT_GAME_BOARD_INFO");
                                x5d x5dVarA4 = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), xx7Var3, fetVar2, 0);
                                int iHashCode10 = Long.hashCode(fetVar2.T);
                                bh90 bh90VarM10 = fetVar2.m();
                                mm40 mm40VarC9 = kbc.c0(fetVar2, mm40VarK1);
                                fetVar2.i0();
                                if (fetVar2.S) {
                                    fetVar2.l(pcyVar4);
                                } else {
                                    fetVar2.r0();
                                }
                                jpm0.o(fetVar2, x5dVarA4, shdVar9);
                                jpm0.o(fetVar2, bh90VarM10, shdVar13);
                                vqd.u(iHashCode10, fetVar2, shdVar11, fetVar2);
                                jpm0.o(fetVar2, mm40VarC9, shdVar14);
                                objP4 = fetVar2.P();
                                if (objP4 == cl5Var) {
                                    m3nVar2 = m3nVar;
                                    if (!(m3nVar2.d instanceof hal0) || (m3nVar2.e instanceof hal0)) {
                                        mm40VarN = s5x0.N(mm40VarN, 12.0f, 0.0f, 0.0f, 0.0f, 14);
                                        mm40Var2 = mm40VarN;
                                    } else {
                                        mm40Var2 = mm40VarN;
                                    }
                                    fetVar2.o0(mm40VarN);
                                    objP4 = mm40VarN;
                                } else {
                                    mm40Var2 = mm40VarN;
                                    m3nVar2 = m3nVar;
                                }
                                f2 = 1.0f;
                                pzw.w(o7k0.d((mm40) objP4, 1.0f), m3nVar2.c, fetVar2);
                                function8 = function7;
                                z6 = false;
                                obc.e(new l5d0[]{zep0.f44264a.a(w6n.h), eal0.f7472a.a(gqw0.d), dw9.k(5, eal0.b), gap.f10979a.a(fetVar2.k(zfnVar))}, u1c.M(-1683133989, new z9l0(m3nVar2, function8, 0 == true ? 1 : 0), fetVar2), fetVar2, 48);
                                ohs0.x(fetVar2, true, true, false);
                            } else {
                                mm40Var2 = jm40Var4;
                                function8 = function7;
                                z6 = false;
                                f2 = 1.0f;
                                shdVar14 = shdVar12;
                                if (n3nVar.equals(l3n.f19365a)) {
                                    throw b1j.f(-1678029, fetVar2, false);
                                }
                                fetVar2.e0(-50435479);
                                z1x.n(6, fetVar2, o7k0.d(mm40Var2, 1.0f));
                                fetVar2.r(false);
                            }
                        }
                        if (z3) {
                            fetVar2.e0(-50236986);
                            mm40 mm40VarD7 = o7k0.d(o7k0.e(o7k0.d(mm40Var2, f2), 32.0f), f2);
                            zx7 zx7Var3 = zx7Var;
                            tj30 tj30VarC4 = zq8.c(zx7Var3, z6);
                            int iHashCode11 = Long.hashCode(fetVar2.T);
                            bh90 bh90VarM11 = fetVar2.m();
                            mm40 mm40VarC10 = kbc.c0(fetVar2, mm40VarD7);
                            fetVar2.i0();
                            if (fetVar2.S) {
                                fetVar2.l(pcyVar4);
                            } else {
                                fetVar2.r0();
                            }
                            jpm0.o(fetVar2, tj30VarC4, shdVar9);
                            jpm0.o(fetVar2, bh90VarM11, shdVar13);
                            vqd.u(iHashCode11, fetVar2, shdVar11, fetVar2);
                            jpm0.o(fetVar2, mm40VarC10, shdVar14);
                            mm40 mm40VarL3 = s5x0.L(o7k0.e(o7k0.d(mm40Var2, f2), 14.0f), 80.0f, 0.0f, 2);
                            tj30 tj30VarC5 = zq8.c(zx7Var3, false);
                            int iHashCode12 = Long.hashCode(fetVar2.T);
                            bh90 bh90VarM12 = fetVar2.m();
                            mm40 mm40VarC11 = kbc.c0(fetVar2, mm40VarL3);
                            fetVar2.i0();
                            if (fetVar2.S) {
                                fetVar2.l(pcyVar4);
                            } else {
                                fetVar2.r0();
                            }
                            jpm0.o(fetVar2, tj30VarC5, shdVar9);
                            jpm0.o(fetVar2, bh90VarM12, shdVar13);
                            vqd.u(iHashCode12, fetVar2, shdVar11, fetVar2);
                            jpm0.o(fetVar2, mm40VarC11, shdVar14);
                            mm40 mm40VarE3 = o7k0.u(mm40Var2, 0.0f, 280.0f, 1).e(o7k0.c);
                            zcl zclVar3 = qmk.m;
                            ugg0 ugg0Var2 = vgg0.f37379a;
                            dw9.x(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarE3), vbc.d0(vqm.b, fetVar2, 6, 0), fetVar2, 0, true);
                            fetVar2.r(true);
                            fetVar2.r(false);
                            z9 = true;
                        } else {
                            fetVar2.e0(-49263927);
                            mm40 mm40VarE4 = o7k0.e(o7k0.d(mm40Var2, f2), 32.0f);
                            j83 j83VarB = n3nVar.b();
                            j83VarB.getClass();
                            mm40 mm40VarD8 = o7k0.d(mm40VarE4, f2);
                            tj30 tj30VarC6 = zq8.c(zx7Var, z6);
                            int iHashCode13 = Long.hashCode(fetVar2.T);
                            bh90 bh90VarM13 = fetVar2.m();
                            mm40 mm40VarC12 = kbc.c0(fetVar2, mm40VarD8);
                            fetVar2.i0();
                            if (fetVar2.S) {
                                fetVar2.l(pcyVar4);
                            } else {
                                fetVar2.r0();
                            }
                            jpm0.o(fetVar2, tj30VarC6, shdVar9);
                            jpm0.o(fetVar2, bh90VarM13, shdVar13);
                            vqd.u(iHashCode13, fetVar2, shdVar11, fetVar2);
                            jpm0.o(fetVar2, mm40VarC12, shdVar14);
                            mm40 mm40VarD9 = o7k0.d(mm40Var2, f2);
                            ((g1t0) fetVar2.k(j1t0.e)).getClass();
                            fet fetVar4 = fetVar2;
                            v8q0.b(j83VarB, mm40VarD9, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, null, g1t0.g(), fetVar4, 48, 24960, 240632);
                            fetVar2 = fetVar4;
                            z9 = true;
                            fetVar2.r(true);
                            fetVar2.r(false);
                        }
                        fetVar2.r(z9);
                        function4 = function8;
                    }
                    shdVar13 = shdVar10;
                    function8 = function7;
                    shdVar14 = shdVar12;
                    mm40Var2 = jm40Var4;
                    if (z3) {
                        fetVar2.e0(-50236986);
                        mm40 mm40VarD10 = o7k0.d(o7k0.e(o7k0.d(mm40Var2, f2), 32.0f), f2);
                        zx7 zx7Var4 = zx7Var;
                        tj30 tj30VarC7 = zq8.c(zx7Var4, z6);
                        int iHashCode14 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM14 = fetVar2.m();
                        mm40 mm40VarC13 = kbc.c0(fetVar2, mm40VarD10);
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(pcyVar4);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, tj30VarC7, shdVar9);
                        jpm0.o(fetVar2, bh90VarM14, shdVar13);
                        vqd.u(iHashCode14, fetVar2, shdVar11, fetVar2);
                        jpm0.o(fetVar2, mm40VarC13, shdVar14);
                        mm40 mm40VarL4 = s5x0.L(o7k0.e(o7k0.d(mm40Var2, f2), 14.0f), 80.0f, 0.0f, 2);
                        tj30 tj30VarC8 = zq8.c(zx7Var4, false);
                        int iHashCode15 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM15 = fetVar2.m();
                        mm40 mm40VarC14 = kbc.c0(fetVar2, mm40VarL4);
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(pcyVar4);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, tj30VarC8, shdVar9);
                        jpm0.o(fetVar2, bh90VarM15, shdVar13);
                        vqd.u(iHashCode15, fetVar2, shdVar11, fetVar2);
                        jpm0.o(fetVar2, mm40VarC14, shdVar14);
                        mm40 mm40VarE5 = o7k0.u(mm40Var2, 0.0f, 280.0f, 1).e(o7k0.c);
                        zcl zclVar4 = qmk.m;
                        ugg0 ugg0Var3 = vgg0.f37379a;
                        dw9.x(h97.e(zclVar4, zclVar4, zclVar4, zclVar4, mm40VarE5), vbc.d0(vqm.b, fetVar2, 6, 0), fetVar2, 0, true);
                        fetVar2.r(true);
                        fetVar2.r(false);
                        z9 = true;
                    } else {
                        fetVar2.e0(-49263927);
                        mm40 mm40VarE6 = o7k0.e(o7k0.d(mm40Var2, f2), 32.0f);
                        j83 j83VarB2 = n3nVar.b();
                        j83VarB2.getClass();
                        mm40 mm40VarD11 = o7k0.d(mm40VarE6, f2);
                        tj30 tj30VarC9 = zq8.c(zx7Var, z6);
                        int iHashCode16 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM16 = fetVar2.m();
                        mm40 mm40VarC15 = kbc.c0(fetVar2, mm40VarD11);
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(pcyVar4);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, tj30VarC9, shdVar9);
                        jpm0.o(fetVar2, bh90VarM16, shdVar13);
                        vqd.u(iHashCode16, fetVar2, shdVar11, fetVar2);
                        jpm0.o(fetVar2, mm40VarC15, shdVar14);
                        mm40 mm40VarD12 = o7k0.d(mm40Var2, f2);
                        ((g1t0) fetVar2.k(j1t0.e)).getClass();
                        fet fetVar5 = fetVar2;
                        v8q0.b(j83VarB2, mm40VarD12, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, null, g1t0.g(), fetVar5, 48, 24960, 240632);
                        fetVar2 = fetVar5;
                        z9 = true;
                        fetVar2.r(true);
                        fetVar2.r(false);
                    }
                    fetVar2.r(z9);
                    function4 = function8;
                }
                if (z3) {
                    fetVar2.e0(-50236986);
                    mm40 mm40VarD13 = o7k0.d(o7k0.e(o7k0.d(mm40Var2, f2), 32.0f), f2);
                    zx7 zx7Var5 = zx7Var;
                    tj30 tj30VarC10 = zq8.c(zx7Var5, z6);
                    int iHashCode17 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM17 = fetVar2.m();
                    mm40 mm40VarC16 = kbc.c0(fetVar2, mm40VarD13);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar4);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC10, shdVar9);
                    jpm0.o(fetVar2, bh90VarM17, shdVar13);
                    vqd.u(iHashCode17, fetVar2, shdVar11, fetVar2);
                    jpm0.o(fetVar2, mm40VarC16, shdVar14);
                    mm40 mm40VarL5 = s5x0.L(o7k0.e(o7k0.d(mm40Var2, f2), 14.0f), 80.0f, 0.0f, 2);
                    tj30 tj30VarC11 = zq8.c(zx7Var5, false);
                    int iHashCode18 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM18 = fetVar2.m();
                    mm40 mm40VarC17 = kbc.c0(fetVar2, mm40VarL5);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar4);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC11, shdVar9);
                    jpm0.o(fetVar2, bh90VarM18, shdVar13);
                    vqd.u(iHashCode18, fetVar2, shdVar11, fetVar2);
                    jpm0.o(fetVar2, mm40VarC17, shdVar14);
                    mm40 mm40VarE7 = o7k0.u(mm40Var2, 0.0f, 280.0f, 1).e(o7k0.c);
                    zcl zclVar5 = qmk.m;
                    ugg0 ugg0Var4 = vgg0.f37379a;
                    dw9.x(h97.e(zclVar5, zclVar5, zclVar5, zclVar5, mm40VarE7), vbc.d0(vqm.b, fetVar2, 6, 0), fetVar2, 0, true);
                    fetVar2.r(true);
                    fetVar2.r(false);
                    z9 = true;
                } else {
                    fetVar2.e0(-49263927);
                    mm40 mm40VarE8 = o7k0.e(o7k0.d(mm40Var2, f2), 32.0f);
                    j83 j83VarB3 = n3nVar.b();
                    j83VarB3.getClass();
                    mm40 mm40VarD14 = o7k0.d(mm40VarE8, f2);
                    tj30 tj30VarC12 = zq8.c(zx7Var, z6);
                    int iHashCode19 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM19 = fetVar2.m();
                    mm40 mm40VarC18 = kbc.c0(fetVar2, mm40VarD14);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar4);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC12, shdVar9);
                    jpm0.o(fetVar2, bh90VarM19, shdVar13);
                    vqd.u(iHashCode19, fetVar2, shdVar11, fetVar2);
                    jpm0.o(fetVar2, mm40VarC18, shdVar14);
                    mm40 mm40VarD15 = o7k0.d(mm40Var2, f2);
                    ((g1t0) fetVar2.k(j1t0.e)).getClass();
                    fet fetVar6 = fetVar2;
                    v8q0.b(j83VarB3, mm40VarD15, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, null, g1t0.g(), fetVar6, 48, 24960, 240632);
                    fetVar2 = fetVar6;
                    z9 = true;
                    fetVar2.r(true);
                    fetVar2.r(false);
                }
                fetVar2.r(z9);
                function4 = function8;
            } else {
                fetVar2.X();
                function4 = function3;
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new g3n(mm40Var, n3nVar, function4, i2, i3, (byte) 0);
            }
        }
        i5 |= 384;
        function3 = function2;
        if ((i5 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar2.U(i5 & 1, z)) {
            if (i6 != 0) {
                function3 = null;
            }
            zcl zclVar6 = qmk.f28987a;
            mm40 mm40VarL6 = s5x0.L(mm40Var, qmk.a(fetVar2).d, 0.0f, 2);
            nw3 nw3Var2 = uc9.g;
            xx7Var = gqw0.m;
            x5d x5dVarA5 = w5d.a(nw3Var2, xx7Var, fetVar2, 6);
            int iHashCode20 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM20 = fetVar2.m();
            mm40 mm40VarC19 = kbc.c0(fetVar2, mm40VarL6);
            gqw0Var = mkd.c0;
            gqw0Var.getClass();
            fetVar2.i0();
            z2 = fetVar2.S;
            function5 = function3;
            pcyVar = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA5, shdVar);
            shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM20, shdVar2);
            Integer numValueOf2 = Integer.valueOf(iHashCode20);
            shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf2, shdVar3);
            jpm0.n(fetVar2);
            shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC19, shdVar4);
            z3 = n3nVar instanceof l3n;
            jm40Var = jm40.b;
            if (z3) {
                fetVar2.e0(-53224022);
                mm40 mm40VarD16 = o7k0.d(o7k0.e(jm40Var, 24.0f), 1.0f);
                tj30 tj30VarC13 = zq8.c(zx7Var2, false);
                int iHashCode21 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM21 = fetVar2.m();
                mm40 mm40VarC20 = kbc.c0(fetVar2, mm40VarD16);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC13, shdVar);
                jpm0.o(fetVar2, bh90VarM21, shdVar2);
                vqd.u(iHashCode21, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC20, shdVar4);
                mm40 mm40VarL7 = s5x0.L(o7k0.e(o7k0.d(jm40Var, 1.0f), 12.0f), 96.0f, 0.0f, 2);
                tj30 tj30VarC14 = zq8.c(zx7Var2, false);
                int iHashCode22 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM22 = fetVar2.m();
                mm40 mm40VarC21 = kbc.c0(fetVar2, mm40VarL7);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC14, shdVar);
                jpm0.o(fetVar2, bh90VarM22, shdVar2);
                vqd.u(iHashCode22, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC21, shdVar4);
                mm40 mm40VarE9 = o7k0.u(jm40Var, 0.0f, 256.0f, 1).e(o7k0.c);
                zcl zclVar7 = qmk.m;
                ugg0 ugg0Var5 = vgg0.f37379a;
                dw9.x(h97.e(zclVar7, zclVar7, zclVar7, zclVar7, mm40VarE9), vbc.d0(vqm.b, fetVar2, 6, 0), fetVar2, 0, true);
                fetVar2.r(true);
                fetVar2.r(false);
                zx7Var = zx7Var2;
                i4 = i5;
                z4 = true;
                pcyVar3 = pcyVar;
                shdVar5 = shdVar4;
                shdVar6 = shdVar3;
                shdVar7 = shdVar2;
                jm40Var2 = jm40Var;
                shdVar8 = shdVar;
                function6 = function5;
                xx7Var2 = xx7Var;
            } else {
                fetVar2.e0(-52285745);
                mm40 mm40VarE10 = o7k0.e(o7k0.d(jm40Var, 1.0f), 24.0f);
                j83 j83VarA2 = n3nVar.a();
                j83VarA2.getClass();
                mm40 mm40VarD17 = o7k0.d(mm40VarE10, 1.0f);
                tj30 tj30VarC15 = zq8.c(zx7Var2, false);
                int iHashCode23 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM23 = fetVar2.m();
                mm40 mm40VarC22 = kbc.c0(fetVar2, mm40VarD17);
                fetVar2.i0();
                if (fetVar2.S) {
                    pcyVar2 = pcyVar;
                    fetVar2.l(pcyVar2);
                } else {
                    pcyVar2 = pcyVar;
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC15, shdVar);
                jpm0.o(fetVar2, bh90VarM23, shdVar2);
                vqd.u(iHashCode23, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC22, shdVar4);
                int i8 = i5;
                mm40 mm40VarD18 = o7k0.d(jm40Var, 1.0f);
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                i4 = i8;
                pcyVar3 = pcyVar2;
                shdVar5 = shdVar4;
                shdVar6 = shdVar3;
                shdVar7 = shdVar2;
                zx7Var = zx7Var2;
                shdVar8 = shdVar;
                jm40Var2 = jm40Var;
                function6 = function5;
                xx7Var2 = xx7Var;
                z4 = true;
                v8q0.b(j83VarA2, mm40VarD18, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, null, g1t0.h(), fetVar2, 48, 24960, 240632);
                fetVar2 = fetVar2;
                fetVar2.r(true);
                fetVar2.r(false);
            }
            z5 = n3nVar instanceof h3n;
            b2 = 14;
            cl5Var = ukd.f35823a;
            if (z5) {
                fetVar2.e0(-51999677);
                jm40Var5 = jm40Var2;
                mm40 mm40VarD19 = o7k0.d(jm40Var5, 1.0f);
                final h3n h3nVar2 = (h3n) n3nVar;
                fexVar = h3nVar2.d;
                if (fexVar == fex.f9426a) {
                    z10 = z4;
                } else {
                    z10 = false;
                }
                pz40VarF = androidx.compose.runtime.e.f(Boolean.valueOf(z10), fetVar2);
                if (fexVar == fex.b) {
                    z11 = z4;
                } else {
                    z11 = false;
                }
                pz40VarF2 = androidx.compose.runtime.e.f(Boolean.valueOf(z11), fetVar2);
                x5d x5dVarA6 = w5d.a(new qw3(8.0f, z4, new jf4(b2)), xx7Var2, fetVar2, 0);
                int iHashCode24 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM24 = fetVar2.m();
                mm40 mm40VarC23 = kbc.c0(fetVar2, mm40VarD19);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar3);
                } else {
                    fetVar2.r0();
                }
                shdVar9 = shdVar8;
                jpm0.o(fetVar2, x5dVarA6, shdVar9);
                shd shdVar17 = shdVar7;
                jpm0.o(fetVar2, bh90VarM24, shdVar17);
                shdVar11 = shdVar6;
                vqd.u(iHashCode24, fetVar2, shdVar11, fetVar2);
                shd shdVar18 = shdVar5;
                jpm0.o(fetVar2, mm40VarC23, shdVar18);
                objP5 = fetVar2.P();
                if (objP5 == cl5Var) {
                    objP5 = o7k0.d(jm40Var5, 1.0f);
                    fetVar2.o0(objP5);
                }
                mm40 mm40Var6 = (mm40) objP5;
                pzw.w(mm40Var6, h3nVar2.c, fetVar2);
                qw3 qw3Var2 = new qw3(8.0f, z4, new jf4(b2));
                yx7 yx7Var2 = gqw0.k;
                thg0 thg0VarA3 = shg0.a(qw3Var2, yx7Var2, fetVar2, 48);
                pcyVar5 = pcyVar3;
                int iHashCode25 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM25 = fetVar2.m();
                mm40 mm40VarC24 = kbc.c0(fetVar2, mm40Var6);
                fetVar2.i0();
                if (fetVar2.S) {
                    pcyVar4 = pcyVar5;
                    fetVar2.l(pcyVar4);
                } else {
                    pcyVar4 = pcyVar5;
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA3, shdVar9);
                jpm0.o(fetVar2, bh90VarM25, shdVar17);
                vqd.u(iHashCode25, fetVar2, shdVar11, fetVar2);
                jpm0.o(fetVar2, mm40VarC24, shdVar18);
                objP6 = fetVar2.P();
                if (objP6 == cl5Var) {
                    objP6 = jgk0.b(new rip(pz40VarF, (byte) 29));
                    fetVar2.o0(objP6);
                }
                zfn zfnVar3 = eal0.c;
                l5d0 l5d0VarA2 = zfnVar3.a(((l7m0) objP6).getValue());
                final Function2 function10 = function6;
                final byte b8 = 0;
                obc.d(l5d0VarA2, u1c.M(1168353998, new Function2() { // from class: a.l9l0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b9 = b8;
                        Function2 function11 = function10;
                        h3n h3nVar3 = h3nVar2;
                        fet fetVar7 = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        switch (b9) {
                            case 0:
                                if (fetVar7.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    if (1.0f <= 0.0d) {
                                        vcx.a("invalid weight; must be greater than zero");
                                    }
                                    azw.v(new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), h3nVar3.e, function11, fetVar7);
                                } else {
                                    fetVar7.X();
                                }
                                break;
                            default:
                                if (fetVar7.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    if (1.0f <= 0.0d) {
                                        vcx.a("invalid weight; must be greater than zero");
                                    }
                                    azw.v(new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), h3nVar3.f, function11, fetVar7);
                                } else {
                                    fetVar7.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, fetVar2), fetVar2, 56);
                qxw.p(null, h3nVar2.g, pz40VarF, fetVar2, 0);
                fetVar2.r(true);
                thg0 thg0VarA4 = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), yx7Var2, fetVar2, 48);
                int iHashCode26 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM26 = fetVar2.m();
                mm40 mm40VarC25 = kbc.c0(fetVar2, mm40Var6);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar4);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA4, shdVar9);
                jpm0.o(fetVar2, bh90VarM26, shdVar17);
                vqd.u(iHashCode26, fetVar2, shdVar11, fetVar2);
                jpm0.o(fetVar2, mm40VarC25, shdVar18);
                objP7 = fetVar2.P();
                if (objP7 == cl5Var) {
                    objP7 = jgk0.b(new m9l0(pz40VarF2, (byte) 0));
                    fetVar2.o0(objP7);
                }
                final byte b9 = 1;
                obc.d(zfnVar3.a(((l7m0) objP7).getValue()), u1c.M(-1543673545, new Function2() { // from class: a.l9l0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b10 = b9;
                        Function2 function11 = function10;
                        h3n h3nVar3 = h3nVar2;
                        fet fetVar7 = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        switch (b10) {
                            case 0:
                                if (fetVar7.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    if (1.0f <= 0.0d) {
                                        vcx.a("invalid weight; must be greater than zero");
                                    }
                                    azw.v(new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), h3nVar3.e, function11, fetVar7);
                                } else {
                                    fetVar7.X();
                                }
                                break;
                            default:
                                if (fetVar7.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    if (1.0f <= 0.0d) {
                                        vcx.a("invalid weight; must be greater than zero");
                                    }
                                    azw.v(new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), h3nVar3.f, function11, fetVar7);
                                } else {
                                    fetVar7.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, fetVar2), fetVar2, 56);
                qxw.p(null, h3nVar2.h, pz40VarF2, fetVar2, 0);
                ohs0.x(fetVar2, true, true, false);
                z6 = false;
                shdVar13 = shdVar17;
                function8 = function10;
                shdVar14 = shdVar18;
                mm40Var2 = jm40Var5;
                f2 = 1.0f;
            } else {
                jm40Var3 = jm40Var2;
                function7 = function6;
                xx7Var3 = xx7Var2;
                shdVar9 = shdVar8;
                shdVar10 = shdVar7;
                shdVar11 = shdVar6;
                shdVar12 = shdVar5;
                pcyVar4 = pcyVar3;
                b3 = 0;
                if (n3nVar instanceof i3n) {
                    fetVar2.e0(-51726877);
                    jm40Var4 = jm40Var3;
                    kr00.a(u1c.M(1744836299, new n9l0(o7k0.d(jm40Var4, 1.0f), (i3n) n3nVar, function7, b3), fetVar2), fetVar2, 6);
                    fetVar2.r(false);
                    f2 = 1.0f;
                    z6 = false;
                } else {
                    jm40Var4 = jm40Var3;
                    if (n3nVar instanceof j3n) {
                        fetVar2.e0(-51187167);
                        j0x.n(dw9.h(1.0f, o7k0.d(jm40Var4, 1.0f), true), (j3n) n3nVar, fetVar2, i4 & 112);
                        fetVar2.r(false);
                        f2 = 1.0f;
                        z6 = false;
                    } else if (n3nVar instanceof k3n) {
                        fetVar2.e0(-50915235);
                        k3n k3nVar2 = (k3n) n3nVar;
                        mm40 mm40VarD20 = o7k0.d(o7k0.d(jm40Var4, 1.0f), 1.0f);
                        x5d x5dVarA7 = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.n, fetVar2, 48);
                        int iHashCode27 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM27 = fetVar2.m();
                        mm40 mm40VarC26 = kbc.c0(fetVar2, mm40VarD20);
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(pcyVar4);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, x5dVarA7, shdVar9);
                        jpm0.o(fetVar2, bh90VarM27, shdVar10);
                        vqd.u(iHashCode27, fetVar2, shdVar11, fetVar2);
                        jpm0.o(fetVar2, mm40VarC26, shdVar12);
                        shdVar13 = shdVar10;
                        n2x.n(null, new gal0(k3nVar2.d), null, fetVar2, 0, 5);
                        qal0Var = k3nVar2.b;
                        if (qal0Var == null) {
                            fetVar2.e0(1333857640);
                            z6 = false;
                            fetVar2.r(false);
                        } else {
                            fetVar2.e0(1333857641);
                            c3x.n(null, u1c.M(1575790146, new ygd(qal0Var, (byte) 12), fetVar2), u1c.M(-1547913783, new ygd(qal0Var, (byte) 13), fetVar2), u1c.M(-541232536, new ygd(qal0Var, (byte) 14), fetVar2), u1c.M(465448711, new ygd(qal0Var, (byte) 15), fetVar2), fetVar, 28080);
                            fetVar2 = fetVar;
                            z6 = false;
                            fetVar2.r(false);
                        }
                        fetVar2.r(true);
                        fetVar2.r(z6);
                        function8 = function7;
                        shdVar14 = shdVar12;
                        mm40Var2 = jm40Var4;
                        f2 = 1.0f;
                    } else {
                        shdVar13 = shdVar10;
                        if (n3nVar instanceof m3n) {
                            fetVar2.e0(-50700219);
                            mm40 mm40VarD21 = o7k0.d(jm40Var4, 1.0f);
                            m3nVar = (m3n) n3nVar;
                            zfnVar = bmd.n;
                            if (fetVar2.k(zfnVar) == k6z.b) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            zH = fetVar2.h(z7);
                            objP = fetVar2.P();
                            if (zH) {
                                objP = new kp2((byte) 9, z7);
                                fetVar2.o0(objP);
                            } else {
                                objP = new kp2((byte) 9, z7);
                                fetVar2.o0(objP);
                            }
                            tj30 tj30Var2 = (tj30) objP;
                            int iHashCode28 = Long.hashCode(fetVar2.T);
                            bh90 bh90VarM28 = fetVar2.m();
                            mm40 mm40VarC27 = kbc.c0(fetVar2, mm40VarD21);
                            gqw0Var.getClass();
                            fetVar2.i0();
                            if (fetVar2.S) {
                                fetVar2.l(pcyVar4);
                            } else {
                                fetVar2.r0();
                            }
                            jpm0.o(fetVar2, tj30Var2, shdVar9);
                            jpm0.o(fetVar2, bh90VarM28, shdVar13);
                            vqd.u(iHashCode28, fetVar2, shdVar11, fetVar2);
                            jpm0.o(fetVar2, mm40VarC27, shdVar12);
                            mm40 mm40VarK2 = mrv.k0(jm40Var4, "SPORT_GAME_BOARD_SCORE");
                            aal0Var = m3nVar.f;
                            jM126getWhite200d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m126getWhite200d7_KjU();
                            objP2 = fetVar2.P();
                            if (objP2 == cl5Var) {
                                objP2 = rq8.L(s5x0.J(o7k0.n(jm40Var4, 32.0f), 1.0f), new r2a0((byte) 7, jM126getWhite200d7_KjU));
                                fetVar2.o0(objP2);
                            }
                            mm40Var3 = (mm40) objP2;
                            objP3 = fetVar2.P();
                            if (objP3 == cl5Var) {
                                objP3 = o7k0.e(o7k0.s(jm40Var4, 32.0f), 16.0f);
                                fetVar2.o0(objP3);
                            }
                            mm40Var4 = (mm40) objP3;
                            pz40 pz40VarF4 = androidx.compose.runtime.e.f(aal0Var.b, fetVar2);
                            if (aal0Var.d != null) {
                                fetVar2.e0(2094636039);
                                z8 = false;
                                final byte objArr2 = 0 == true ? 1 : 0;
                                ugdVarM = u1c.M(-85543668, new xdr() { // from class: a.bal0
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // a.xdr
                                    public final Object F(Object obj, Object obj2, Object obj3) {
                                        byte b10 = objArr2;
                                        final mm40 mm40Var7 = mm40Var4;
                                        final aal0 aal0Var2 = aal0Var;
                                        Object[] objArr3 = 0;
                                        final byte b11 = 2;
                                        char c2 = 1;
                                        switch (b10) {
                                            case 0:
                                                y5d y5dVar = (y5d) obj;
                                                fet fetVar7 = (fet) obj2;
                                                int iIntValue = ((Integer) obj3).intValue();
                                                y5dVar.getClass();
                                                if ((iIntValue & 6) == 0) {
                                                    iIntValue |= fetVar7.g(y5dVar) ? 4 : 2;
                                                }
                                                if (fetVar7.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                                    zd90 zd90Var = aal0Var2.d;
                                                    j83 j83Var = zd90Var.f44202a;
                                                    j83 j83Var2 = zd90Var.b;
                                                    ((g1t0) fetVar7.k(j1t0.e)).getClass();
                                                    y9q0 y9q0VarD = g1t0.d();
                                                    final byte objArr4 = objArr3 == true ? 1 : 0;
                                                    zvw.v(y5dVar, mm40Var3, j83Var, j83Var2, y9q0VarD, u1c.M(1301445920, new xdr() { // from class: a.cal0
                                                        @Override // a.xdr
                                                        public final Object F(Object obj4, Object obj5, Object obj6) {
                                                            byte b12 = objArr4;
                                                            aal0 aal0Var3 = aal0Var2;
                                                            mm40 mm40Var8 = mm40Var7;
                                                            y5d y5dVar4 = (y5d) obj4;
                                                            fet fetVar8 = (fet) obj5;
                                                            int iIntValue4 = ((Integer) obj6).intValue();
                                                            switch (b12) {
                                                                case 0:
                                                                    y5dVar4.getClass();
                                                                    if (fetVar8.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                        dtb.t(6, fetVar8, mm40Var8, aal0Var3.d.c);
                                                                    } else {
                                                                        fetVar8.X();
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    y5dVar4.getClass();
                                                                    if (fetVar8.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                        dtb.t(6, fetVar8, mm40Var8, aal0Var3.e.c);
                                                                    } else {
                                                                        fetVar8.X();
                                                                    }
                                                                    break;
                                                                default:
                                                                    y5dVar4.getClass();
                                                                    if (fetVar8.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                        dtb.t(6, fetVar8, mm40Var8, aal0Var3.c.c);
                                                                    } else {
                                                                        fetVar8.X();
                                                                    }
                                                                    break;
                                                            }
                                                            return Unit.f46060a;
                                                        }
                                                    }, fetVar7), fetVar7, 196656 | (iIntValue & 14));
                                                } else {
                                                    fetVar7.X();
                                                }
                                                break;
                                            case 1:
                                                y5d y5dVar2 = (y5d) obj;
                                                boolean z12 = false;
                                                fet fetVar8 = (fet) obj2;
                                                int iIntValue2 = ((Integer) obj3).intValue();
                                                y5dVar2.getClass();
                                                if ((iIntValue2 & 6) == 0) {
                                                    iIntValue2 |= fetVar8.g(y5dVar2) ? 4 : 2;
                                                }
                                                if ((iIntValue2 & 19) != 18) {
                                                    z12 = true;
                                                }
                                                if (fetVar8.U(iIntValue2 & 1, z12)) {
                                                    zd90 zd90Var2 = aal0Var2.e;
                                                    j83 j83Var3 = zd90Var2.f44202a;
                                                    j83 j83Var4 = zd90Var2.b;
                                                    ((g1t0) fetVar8.k(j1t0.e)).getClass();
                                                    y9q0 y9q0VarD2 = g1t0.d();
                                                    final byte c3 = c2 == true ? 1 : 0;
                                                    zvw.v(y5dVar2, mm40Var3, j83Var3, j83Var4, y9q0VarD2, u1c.M(1156398672, new xdr() { // from class: a.cal0
                                                        @Override // a.xdr
                                                        public final Object F(Object obj4, Object obj5, Object obj6) {
                                                            byte b12 = c3;
                                                            aal0 aal0Var3 = aal0Var2;
                                                            mm40 mm40Var8 = mm40Var7;
                                                            y5d y5dVar4 = (y5d) obj4;
                                                            fet fetVar9 = (fet) obj5;
                                                            int iIntValue4 = ((Integer) obj6).intValue();
                                                            switch (b12) {
                                                                case 0:
                                                                    y5dVar4.getClass();
                                                                    if (fetVar9.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                        dtb.t(6, fetVar9, mm40Var8, aal0Var3.d.c);
                                                                    } else {
                                                                        fetVar9.X();
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    y5dVar4.getClass();
                                                                    if (fetVar9.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                        dtb.t(6, fetVar9, mm40Var8, aal0Var3.e.c);
                                                                    } else {
                                                                        fetVar9.X();
                                                                    }
                                                                    break;
                                                                default:
                                                                    y5dVar4.getClass();
                                                                    if (fetVar9.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                        dtb.t(6, fetVar9, mm40Var8, aal0Var3.c.c);
                                                                    } else {
                                                                        fetVar9.X();
                                                                    }
                                                                    break;
                                                            }
                                                            return Unit.f46060a;
                                                        }
                                                    }, fetVar8), fetVar8, 196656 | (iIntValue2 & 14));
                                                } else {
                                                    fetVar8.X();
                                                }
                                                break;
                                            default:
                                                y5d y5dVar3 = (y5d) obj;
                                                fet fetVar9 = (fet) obj2;
                                                int iIntValue3 = ((Integer) obj3).intValue();
                                                y5dVar3.getClass();
                                                if ((iIntValue3 & 6) == 0) {
                                                    iIntValue3 |= fetVar9.g(y5dVar3) ? 4 : 2;
                                                }
                                                if (fetVar9.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                                    zd90 zd90Var3 = aal0Var2.c;
                                                    j83 j83Var5 = zd90Var3.f44202a;
                                                    j83 j83Var6 = zd90Var3.b;
                                                    ((g1t0) fetVar9.k(j1t0.e)).getClass();
                                                    zvw.v(y5dVar3, mm40Var3, j83Var5, j83Var6, g1t0.a(), u1c.M(-1240611666, new xdr() { // from class: a.cal0
                                                        @Override // a.xdr
                                                        public final Object F(Object obj4, Object obj5, Object obj6) {
                                                            byte b12 = b11;
                                                            aal0 aal0Var3 = aal0Var2;
                                                            mm40 mm40Var8 = mm40Var7;
                                                            y5d y5dVar4 = (y5d) obj4;
                                                            fet fetVar10 = (fet) obj5;
                                                            int iIntValue4 = ((Integer) obj6).intValue();
                                                            switch (b12) {
                                                                case 0:
                                                                    y5dVar4.getClass();
                                                                    if (fetVar10.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                        dtb.t(6, fetVar10, mm40Var8, aal0Var3.d.c);
                                                                    } else {
                                                                        fetVar10.X();
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    y5dVar4.getClass();
                                                                    if (fetVar10.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                        dtb.t(6, fetVar10, mm40Var8, aal0Var3.e.c);
                                                                    } else {
                                                                        fetVar10.X();
                                                                    }
                                                                    break;
                                                                default:
                                                                    y5dVar4.getClass();
                                                                    if (fetVar10.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                        dtb.t(6, fetVar10, mm40Var8, aal0Var3.c.c);
                                                                    } else {
                                                                        fetVar10.X();
                                                                    }
                                                                    break;
                                                            }
                                                            return Unit.f46060a;
                                                        }
                                                    }, fetVar9), fetVar9, (iIntValue3 & 14) | 196656);
                                                } else {
                                                    fetVar9.X();
                                                }
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                }, fetVar2);
                                fetVar2.r(false);
                            } else {
                                z8 = false;
                                fetVar2.e0(2095133930);
                                fetVar2.r(false);
                                ugdVarM = null;
                            }
                            if (aal0Var.e != null) {
                                fetVar2.e0(2095240260);
                                final byte b10 = 1;
                                ugdVarM2 = u1c.M(-300733636, new xdr() { // from class: a.bal0
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // a.xdr
                                    public final Object F(Object obj, Object obj2, Object obj3) {
                                        byte b11 = b10;
                                        final mm40 mm40Var7 = mm40Var4;
                                        final aal0 aal0Var2 = aal0Var;
                                        Object[] objArr3 = 0;
                                        final byte b12 = 2;
                                        char c2 = 1;
                                        switch (b11) {
                                            case 0:
                                                y5d y5dVar = (y5d) obj;
                                                fet fetVar7 = (fet) obj2;
                                                int iIntValue = ((Integer) obj3).intValue();
                                                y5dVar.getClass();
                                                if ((iIntValue & 6) == 0) {
                                                    iIntValue |= fetVar7.g(y5dVar) ? 4 : 2;
                                                }
                                                if (fetVar7.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                                    zd90 zd90Var = aal0Var2.d;
                                                    j83 j83Var = zd90Var.f44202a;
                                                    j83 j83Var2 = zd90Var.b;
                                                    ((g1t0) fetVar7.k(j1t0.e)).getClass();
                                                    y9q0 y9q0VarD = g1t0.d();
                                                    final byte objArr4 = objArr3 == true ? 1 : 0;
                                                    zvw.v(y5dVar, mm40Var3, j83Var, j83Var2, y9q0VarD, u1c.M(1301445920, new xdr() { // from class: a.cal0
                                                        @Override // a.xdr
                                                        public final Object F(Object obj4, Object obj5, Object obj6) {
                                                            byte b13 = objArr4;
                                                            aal0 aal0Var3 = aal0Var2;
                                                            mm40 mm40Var8 = mm40Var7;
                                                            y5d y5dVar4 = (y5d) obj4;
                                                            fet fetVar10 = (fet) obj5;
                                                            int iIntValue4 = ((Integer) obj6).intValue();
                                                            switch (b13) {
                                                                case 0:
                                                                    y5dVar4.getClass();
                                                                    if (fetVar10.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                        dtb.t(6, fetVar10, mm40Var8, aal0Var3.d.c);
                                                                    } else {
                                                                        fetVar10.X();
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    y5dVar4.getClass();
                                                                    if (fetVar10.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                        dtb.t(6, fetVar10, mm40Var8, aal0Var3.e.c);
                                                                    } else {
                                                                        fetVar10.X();
                                                                    }
                                                                    break;
                                                                default:
                                                                    y5dVar4.getClass();
                                                                    if (fetVar10.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                        dtb.t(6, fetVar10, mm40Var8, aal0Var3.c.c);
                                                                    } else {
                                                                        fetVar10.X();
                                                                    }
                                                                    break;
                                                            }
                                                            return Unit.f46060a;
                                                        }
                                                    }, fetVar7), fetVar7, 196656 | (iIntValue & 14));
                                                } else {
                                                    fetVar7.X();
                                                }
                                                break;
                                            case 1:
                                                y5d y5dVar2 = (y5d) obj;
                                                boolean z12 = false;
                                                fet fetVar8 = (fet) obj2;
                                                int iIntValue2 = ((Integer) obj3).intValue();
                                                y5dVar2.getClass();
                                                if ((iIntValue2 & 6) == 0) {
                                                    iIntValue2 |= fetVar8.g(y5dVar2) ? 4 : 2;
                                                }
                                                if ((iIntValue2 & 19) != 18) {
                                                    z12 = true;
                                                }
                                                if (fetVar8.U(iIntValue2 & 1, z12)) {
                                                    zd90 zd90Var2 = aal0Var2.e;
                                                    j83 j83Var3 = zd90Var2.f44202a;
                                                    j83 j83Var4 = zd90Var2.b;
                                                    ((g1t0) fetVar8.k(j1t0.e)).getClass();
                                                    y9q0 y9q0VarD2 = g1t0.d();
                                                    final byte c3 = c2 == true ? 1 : 0;
                                                    zvw.v(y5dVar2, mm40Var3, j83Var3, j83Var4, y9q0VarD2, u1c.M(1156398672, new xdr() { // from class: a.cal0
                                                        @Override // a.xdr
                                                        public final Object F(Object obj4, Object obj5, Object obj6) {
                                                            byte b13 = c3;
                                                            aal0 aal0Var3 = aal0Var2;
                                                            mm40 mm40Var8 = mm40Var7;
                                                            y5d y5dVar4 = (y5d) obj4;
                                                            fet fetVar10 = (fet) obj5;
                                                            int iIntValue4 = ((Integer) obj6).intValue();
                                                            switch (b13) {
                                                                case 0:
                                                                    y5dVar4.getClass();
                                                                    if (fetVar10.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                        dtb.t(6, fetVar10, mm40Var8, aal0Var3.d.c);
                                                                    } else {
                                                                        fetVar10.X();
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    y5dVar4.getClass();
                                                                    if (fetVar10.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                        dtb.t(6, fetVar10, mm40Var8, aal0Var3.e.c);
                                                                    } else {
                                                                        fetVar10.X();
                                                                    }
                                                                    break;
                                                                default:
                                                                    y5dVar4.getClass();
                                                                    if (fetVar10.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                        dtb.t(6, fetVar10, mm40Var8, aal0Var3.c.c);
                                                                    } else {
                                                                        fetVar10.X();
                                                                    }
                                                                    break;
                                                            }
                                                            return Unit.f46060a;
                                                        }
                                                    }, fetVar8), fetVar8, 196656 | (iIntValue2 & 14));
                                                } else {
                                                    fetVar8.X();
                                                }
                                                break;
                                            default:
                                                y5d y5dVar3 = (y5d) obj;
                                                fet fetVar9 = (fet) obj2;
                                                int iIntValue3 = ((Integer) obj3).intValue();
                                                y5dVar3.getClass();
                                                if ((iIntValue3 & 6) == 0) {
                                                    iIntValue3 |= fetVar9.g(y5dVar3) ? 4 : 2;
                                                }
                                                if (fetVar9.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                                    zd90 zd90Var3 = aal0Var2.c;
                                                    j83 j83Var5 = zd90Var3.f44202a;
                                                    j83 j83Var6 = zd90Var3.b;
                                                    ((g1t0) fetVar9.k(j1t0.e)).getClass();
                                                    zvw.v(y5dVar3, mm40Var3, j83Var5, j83Var6, g1t0.a(), u1c.M(-1240611666, new xdr() { // from class: a.cal0
                                                        @Override // a.xdr
                                                        public final Object F(Object obj4, Object obj5, Object obj6) {
                                                            byte b13 = b12;
                                                            aal0 aal0Var3 = aal0Var2;
                                                            mm40 mm40Var8 = mm40Var7;
                                                            y5d y5dVar4 = (y5d) obj4;
                                                            fet fetVar10 = (fet) obj5;
                                                            int iIntValue4 = ((Integer) obj6).intValue();
                                                            switch (b13) {
                                                                case 0:
                                                                    y5dVar4.getClass();
                                                                    if (fetVar10.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                        dtb.t(6, fetVar10, mm40Var8, aal0Var3.d.c);
                                                                    } else {
                                                                        fetVar10.X();
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    y5dVar4.getClass();
                                                                    if (fetVar10.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                        dtb.t(6, fetVar10, mm40Var8, aal0Var3.e.c);
                                                                    } else {
                                                                        fetVar10.X();
                                                                    }
                                                                    break;
                                                                default:
                                                                    y5dVar4.getClass();
                                                                    if (fetVar10.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                        dtb.t(6, fetVar10, mm40Var8, aal0Var3.c.c);
                                                                    } else {
                                                                        fetVar10.X();
                                                                    }
                                                                    break;
                                                            }
                                                            return Unit.f46060a;
                                                        }
                                                    }, fetVar9), fetVar9, (iIntValue3 & 14) | 196656);
                                                } else {
                                                    fetVar9.X();
                                                }
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                }, fetVar2);
                                fetVar2.r(false);
                            } else {
                                fetVar2.e0(2095741034);
                                fetVar2.r(z8);
                                ugdVarM2 = null;
                            }
                            ugd ugdVar3 = ugdVarM2;
                            ugd ugdVarM6 = u1c.M(-1531911618, new rqc0(aal0Var, (byte) 14), fetVar2);
                            ugd ugdVarM7 = u1c.M(-481538726, new tja(pz40VarF4, mm40Var4, mm40Var3, (byte) 1), fetVar2);
                            final byte b11 = 2;
                            ugd ugdVarM8 = u1c.M(-807750846, new xdr() { // from class: a.bal0
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // a.xdr
                                public final Object F(Object obj, Object obj2, Object obj3) {
                                    byte b12 = b11;
                                    final mm40 mm40Var7 = mm40Var4;
                                    final aal0 aal0Var2 = aal0Var;
                                    Object[] objArr3 = 0;
                                    final byte b13 = 2;
                                    char c2 = 1;
                                    switch (b12) {
                                        case 0:
                                            y5d y5dVar = (y5d) obj;
                                            fet fetVar7 = (fet) obj2;
                                            int iIntValue = ((Integer) obj3).intValue();
                                            y5dVar.getClass();
                                            if ((iIntValue & 6) == 0) {
                                                iIntValue |= fetVar7.g(y5dVar) ? 4 : 2;
                                            }
                                            if (fetVar7.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                                zd90 zd90Var = aal0Var2.d;
                                                j83 j83Var = zd90Var.f44202a;
                                                j83 j83Var2 = zd90Var.b;
                                                ((g1t0) fetVar7.k(j1t0.e)).getClass();
                                                y9q0 y9q0VarD = g1t0.d();
                                                final byte objArr4 = objArr3 == true ? 1 : 0;
                                                zvw.v(y5dVar, mm40Var3, j83Var, j83Var2, y9q0VarD, u1c.M(1301445920, new xdr() { // from class: a.cal0
                                                    @Override // a.xdr
                                                    public final Object F(Object obj4, Object obj5, Object obj6) {
                                                        byte b14 = objArr4;
                                                        aal0 aal0Var3 = aal0Var2;
                                                        mm40 mm40Var8 = mm40Var7;
                                                        y5d y5dVar4 = (y5d) obj4;
                                                        fet fetVar10 = (fet) obj5;
                                                        int iIntValue4 = ((Integer) obj6).intValue();
                                                        switch (b14) {
                                                            case 0:
                                                                y5dVar4.getClass();
                                                                if (fetVar10.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                    dtb.t(6, fetVar10, mm40Var8, aal0Var3.d.c);
                                                                } else {
                                                                    fetVar10.X();
                                                                }
                                                                break;
                                                            case 1:
                                                                y5dVar4.getClass();
                                                                if (fetVar10.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                    dtb.t(6, fetVar10, mm40Var8, aal0Var3.e.c);
                                                                } else {
                                                                    fetVar10.X();
                                                                }
                                                                break;
                                                            default:
                                                                y5dVar4.getClass();
                                                                if (fetVar10.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                    dtb.t(6, fetVar10, mm40Var8, aal0Var3.c.c);
                                                                } else {
                                                                    fetVar10.X();
                                                                }
                                                                break;
                                                        }
                                                        return Unit.f46060a;
                                                    }
                                                }, fetVar7), fetVar7, 196656 | (iIntValue & 14));
                                            } else {
                                                fetVar7.X();
                                            }
                                            break;
                                        case 1:
                                            y5d y5dVar2 = (y5d) obj;
                                            boolean z12 = false;
                                            fet fetVar8 = (fet) obj2;
                                            int iIntValue2 = ((Integer) obj3).intValue();
                                            y5dVar2.getClass();
                                            if ((iIntValue2 & 6) == 0) {
                                                iIntValue2 |= fetVar8.g(y5dVar2) ? 4 : 2;
                                            }
                                            if ((iIntValue2 & 19) != 18) {
                                                z12 = true;
                                            }
                                            if (fetVar8.U(iIntValue2 & 1, z12)) {
                                                zd90 zd90Var2 = aal0Var2.e;
                                                j83 j83Var3 = zd90Var2.f44202a;
                                                j83 j83Var4 = zd90Var2.b;
                                                ((g1t0) fetVar8.k(j1t0.e)).getClass();
                                                y9q0 y9q0VarD2 = g1t0.d();
                                                final byte c3 = c2 == true ? 1 : 0;
                                                zvw.v(y5dVar2, mm40Var3, j83Var3, j83Var4, y9q0VarD2, u1c.M(1156398672, new xdr() { // from class: a.cal0
                                                    @Override // a.xdr
                                                    public final Object F(Object obj4, Object obj5, Object obj6) {
                                                        byte b14 = c3;
                                                        aal0 aal0Var3 = aal0Var2;
                                                        mm40 mm40Var8 = mm40Var7;
                                                        y5d y5dVar4 = (y5d) obj4;
                                                        fet fetVar10 = (fet) obj5;
                                                        int iIntValue4 = ((Integer) obj6).intValue();
                                                        switch (b14) {
                                                            case 0:
                                                                y5dVar4.getClass();
                                                                if (fetVar10.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                    dtb.t(6, fetVar10, mm40Var8, aal0Var3.d.c);
                                                                } else {
                                                                    fetVar10.X();
                                                                }
                                                                break;
                                                            case 1:
                                                                y5dVar4.getClass();
                                                                if (fetVar10.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                    dtb.t(6, fetVar10, mm40Var8, aal0Var3.e.c);
                                                                } else {
                                                                    fetVar10.X();
                                                                }
                                                                break;
                                                            default:
                                                                y5dVar4.getClass();
                                                                if (fetVar10.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                    dtb.t(6, fetVar10, mm40Var8, aal0Var3.c.c);
                                                                } else {
                                                                    fetVar10.X();
                                                                }
                                                                break;
                                                        }
                                                        return Unit.f46060a;
                                                    }
                                                }, fetVar8), fetVar8, 196656 | (iIntValue2 & 14));
                                            } else {
                                                fetVar8.X();
                                            }
                                            break;
                                        default:
                                            y5d y5dVar3 = (y5d) obj;
                                            fet fetVar9 = (fet) obj2;
                                            int iIntValue3 = ((Integer) obj3).intValue();
                                            y5dVar3.getClass();
                                            if ((iIntValue3 & 6) == 0) {
                                                iIntValue3 |= fetVar9.g(y5dVar3) ? 4 : 2;
                                            }
                                            if (fetVar9.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                                zd90 zd90Var3 = aal0Var2.c;
                                                j83 j83Var5 = zd90Var3.f44202a;
                                                j83 j83Var6 = zd90Var3.b;
                                                ((g1t0) fetVar9.k(j1t0.e)).getClass();
                                                zvw.v(y5dVar3, mm40Var3, j83Var5, j83Var6, g1t0.a(), u1c.M(-1240611666, new xdr() { // from class: a.cal0
                                                    @Override // a.xdr
                                                    public final Object F(Object obj4, Object obj5, Object obj6) {
                                                        byte b14 = b13;
                                                        aal0 aal0Var3 = aal0Var2;
                                                        mm40 mm40Var8 = mm40Var7;
                                                        y5d y5dVar4 = (y5d) obj4;
                                                        fet fetVar10 = (fet) obj5;
                                                        int iIntValue4 = ((Integer) obj6).intValue();
                                                        switch (b14) {
                                                            case 0:
                                                                y5dVar4.getClass();
                                                                if (fetVar10.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                    dtb.t(6, fetVar10, mm40Var8, aal0Var3.d.c);
                                                                } else {
                                                                    fetVar10.X();
                                                                }
                                                                break;
                                                            case 1:
                                                                y5dVar4.getClass();
                                                                if (fetVar10.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                    dtb.t(6, fetVar10, mm40Var8, aal0Var3.e.c);
                                                                } else {
                                                                    fetVar10.X();
                                                                }
                                                                break;
                                                            default:
                                                                y5dVar4.getClass();
                                                                if (fetVar10.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                    dtb.t(6, fetVar10, mm40Var8, aal0Var3.c.c);
                                                                } else {
                                                                    fetVar10.X();
                                                                }
                                                                break;
                                                        }
                                                        return Unit.f46060a;
                                                    }
                                                }, fetVar9), fetVar9, (iIntValue3 & 14) | 196656);
                                            } else {
                                                fetVar9.X();
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            }, fetVar2);
                            ugd ugdVar4 = ugdVarM;
                            shdVar14 = shdVar12;
                            mm40VarN = jm40Var4;
                            fet fetVar7 = fetVar2;
                            o5n0.d(mm40VarK2, ugdVarM6, ugdVar4, ugdVar3, ugdVarM7, ugdVarM8, fetVar7, 221238);
                            fetVar2 = fetVar7;
                            mm40 mm40VarK3 = mrv.k0(mm40VarN, "SPORT_GAME_BOARD_INFO");
                            x5d x5dVarA8 = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), xx7Var3, fetVar2, 0);
                            int iHashCode110 = Long.hashCode(fetVar2.T);
                            bh90 bh90VarM110 = fetVar2.m();
                            mm40 mm40VarC28 = kbc.c0(fetVar2, mm40VarK3);
                            fetVar2.i0();
                            if (fetVar2.S) {
                                fetVar2.l(pcyVar4);
                            } else {
                                fetVar2.r0();
                            }
                            jpm0.o(fetVar2, x5dVarA8, shdVar9);
                            jpm0.o(fetVar2, bh90VarM110, shdVar13);
                            vqd.u(iHashCode110, fetVar2, shdVar11, fetVar2);
                            jpm0.o(fetVar2, mm40VarC28, shdVar14);
                            objP4 = fetVar2.P();
                            if (objP4 == cl5Var) {
                                m3nVar2 = m3nVar;
                                if (m3nVar2.d instanceof hal0) {
                                    mm40VarN = s5x0.N(mm40VarN, 12.0f, 0.0f, 0.0f, 0.0f, 14);
                                    mm40Var2 = mm40VarN;
                                } else {
                                    mm40VarN = s5x0.N(mm40VarN, 12.0f, 0.0f, 0.0f, 0.0f, 14);
                                    mm40Var2 = mm40VarN;
                                }
                                fetVar2.o0(mm40VarN);
                                objP4 = mm40VarN;
                            } else {
                                mm40Var2 = mm40VarN;
                                m3nVar2 = m3nVar;
                            }
                            f2 = 1.0f;
                            pzw.w(o7k0.d((mm40) objP4, 1.0f), m3nVar2.c, fetVar2);
                            function8 = function7;
                            z6 = false;
                            obc.e(new l5d0[]{zep0.f44264a.a(w6n.h), eal0.f7472a.a(gqw0.d), dw9.k(5, eal0.b), gap.f10979a.a(fetVar2.k(zfnVar))}, u1c.M(-1683133989, new z9l0(m3nVar2, function8, 0 == true ? 1 : 0), fetVar2), fetVar2, 48);
                            ohs0.x(fetVar2, true, true, false);
                        } else {
                            mm40Var2 = jm40Var4;
                            function8 = function7;
                            z6 = false;
                            f2 = 1.0f;
                            shdVar14 = shdVar12;
                            if (n3nVar.equals(l3n.f19365a)) {
                                throw b1j.f(-1678029, fetVar2, false);
                            }
                            fetVar2.e0(-50435479);
                            z1x.n(6, fetVar2, o7k0.d(mm40Var2, 1.0f));
                            fetVar2.r(false);
                        }
                    }
                    if (z3) {
                        fetVar2.e0(-50236986);
                        mm40 mm40VarD110 = o7k0.d(o7k0.e(o7k0.d(mm40Var2, f2), 32.0f), f2);
                        zx7 zx7Var6 = zx7Var;
                        tj30 tj30VarC16 = zq8.c(zx7Var6, z6);
                        int iHashCode111 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM111 = fetVar2.m();
                        mm40 mm40VarC110 = kbc.c0(fetVar2, mm40VarD110);
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(pcyVar4);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, tj30VarC16, shdVar9);
                        jpm0.o(fetVar2, bh90VarM111, shdVar13);
                        vqd.u(iHashCode111, fetVar2, shdVar11, fetVar2);
                        jpm0.o(fetVar2, mm40VarC110, shdVar14);
                        mm40 mm40VarL8 = s5x0.L(o7k0.e(o7k0.d(mm40Var2, f2), 14.0f), 80.0f, 0.0f, 2);
                        tj30 tj30VarC17 = zq8.c(zx7Var6, false);
                        int iHashCode112 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM112 = fetVar2.m();
                        mm40 mm40VarC111 = kbc.c0(fetVar2, mm40VarL8);
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(pcyVar4);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, tj30VarC17, shdVar9);
                        jpm0.o(fetVar2, bh90VarM112, shdVar13);
                        vqd.u(iHashCode112, fetVar2, shdVar11, fetVar2);
                        jpm0.o(fetVar2, mm40VarC111, shdVar14);
                        mm40 mm40VarE11 = o7k0.u(mm40Var2, 0.0f, 280.0f, 1).e(o7k0.c);
                        zcl zclVar8 = qmk.m;
                        ugg0 ugg0Var6 = vgg0.f37379a;
                        dw9.x(h97.e(zclVar8, zclVar8, zclVar8, zclVar8, mm40VarE11), vbc.d0(vqm.b, fetVar2, 6, 0), fetVar2, 0, true);
                        fetVar2.r(true);
                        fetVar2.r(false);
                        z9 = true;
                    } else {
                        fetVar2.e0(-49263927);
                        mm40 mm40VarE12 = o7k0.e(o7k0.d(mm40Var2, f2), 32.0f);
                        j83 j83VarB4 = n3nVar.b();
                        j83VarB4.getClass();
                        mm40 mm40VarD111 = o7k0.d(mm40VarE12, f2);
                        tj30 tj30VarC18 = zq8.c(zx7Var, z6);
                        int iHashCode113 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM113 = fetVar2.m();
                        mm40 mm40VarC112 = kbc.c0(fetVar2, mm40VarD111);
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(pcyVar4);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, tj30VarC18, shdVar9);
                        jpm0.o(fetVar2, bh90VarM113, shdVar13);
                        vqd.u(iHashCode113, fetVar2, shdVar11, fetVar2);
                        jpm0.o(fetVar2, mm40VarC112, shdVar14);
                        mm40 mm40VarD112 = o7k0.d(mm40Var2, f2);
                        ((g1t0) fetVar2.k(j1t0.e)).getClass();
                        fet fetVar8 = fetVar2;
                        v8q0.b(j83VarB4, mm40VarD112, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, null, g1t0.g(), fetVar8, 48, 24960, 240632);
                        fetVar2 = fetVar8;
                        z9 = true;
                        fetVar2.r(true);
                        fetVar2.r(false);
                    }
                    fetVar2.r(z9);
                    function4 = function8;
                }
                shdVar13 = shdVar10;
                function8 = function7;
                shdVar14 = shdVar12;
                mm40Var2 = jm40Var4;
                if (z3) {
                    fetVar2.e0(-50236986);
                    mm40 mm40VarD113 = o7k0.d(o7k0.e(o7k0.d(mm40Var2, f2), 32.0f), f2);
                    zx7 zx7Var7 = zx7Var;
                    tj30 tj30VarC19 = zq8.c(zx7Var7, z6);
                    int iHashCode114 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM114 = fetVar2.m();
                    mm40 mm40VarC113 = kbc.c0(fetVar2, mm40VarD113);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar4);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC19, shdVar9);
                    jpm0.o(fetVar2, bh90VarM114, shdVar13);
                    vqd.u(iHashCode114, fetVar2, shdVar11, fetVar2);
                    jpm0.o(fetVar2, mm40VarC113, shdVar14);
                    mm40 mm40VarL9 = s5x0.L(o7k0.e(o7k0.d(mm40Var2, f2), 14.0f), 80.0f, 0.0f, 2);
                    tj30 tj30VarC110 = zq8.c(zx7Var7, false);
                    int iHashCode115 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM115 = fetVar2.m();
                    mm40 mm40VarC114 = kbc.c0(fetVar2, mm40VarL9);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar4);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC110, shdVar9);
                    jpm0.o(fetVar2, bh90VarM115, shdVar13);
                    vqd.u(iHashCode115, fetVar2, shdVar11, fetVar2);
                    jpm0.o(fetVar2, mm40VarC114, shdVar14);
                    mm40 mm40VarE13 = o7k0.u(mm40Var2, 0.0f, 280.0f, 1).e(o7k0.c);
                    zcl zclVar9 = qmk.m;
                    ugg0 ugg0Var7 = vgg0.f37379a;
                    dw9.x(h97.e(zclVar9, zclVar9, zclVar9, zclVar9, mm40VarE13), vbc.d0(vqm.b, fetVar2, 6, 0), fetVar2, 0, true);
                    fetVar2.r(true);
                    fetVar2.r(false);
                    z9 = true;
                } else {
                    fetVar2.e0(-49263927);
                    mm40 mm40VarE14 = o7k0.e(o7k0.d(mm40Var2, f2), 32.0f);
                    j83 j83VarB5 = n3nVar.b();
                    j83VarB5.getClass();
                    mm40 mm40VarD114 = o7k0.d(mm40VarE14, f2);
                    tj30 tj30VarC111 = zq8.c(zx7Var, z6);
                    int iHashCode116 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM116 = fetVar2.m();
                    mm40 mm40VarC115 = kbc.c0(fetVar2, mm40VarD114);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar4);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC111, shdVar9);
                    jpm0.o(fetVar2, bh90VarM116, shdVar13);
                    vqd.u(iHashCode116, fetVar2, shdVar11, fetVar2);
                    jpm0.o(fetVar2, mm40VarC115, shdVar14);
                    mm40 mm40VarD115 = o7k0.d(mm40Var2, f2);
                    ((g1t0) fetVar2.k(j1t0.e)).getClass();
                    fet fetVar9 = fetVar2;
                    v8q0.b(j83VarB5, mm40VarD115, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, null, g1t0.g(), fetVar9, 48, 24960, 240632);
                    fetVar2 = fetVar9;
                    z9 = true;
                    fetVar2.r(true);
                    fetVar2.r(false);
                }
                fetVar2.r(z9);
                function4 = function8;
            }
            if (z3) {
                fetVar2.e0(-50236986);
                mm40 mm40VarD116 = o7k0.d(o7k0.e(o7k0.d(mm40Var2, f2), 32.0f), f2);
                zx7 zx7Var8 = zx7Var;
                tj30 tj30VarC112 = zq8.c(zx7Var8, z6);
                int iHashCode117 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM117 = fetVar2.m();
                mm40 mm40VarC116 = kbc.c0(fetVar2, mm40VarD116);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar4);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC112, shdVar9);
                jpm0.o(fetVar2, bh90VarM117, shdVar13);
                vqd.u(iHashCode117, fetVar2, shdVar11, fetVar2);
                jpm0.o(fetVar2, mm40VarC116, shdVar14);
                mm40 mm40VarL10 = s5x0.L(o7k0.e(o7k0.d(mm40Var2, f2), 14.0f), 80.0f, 0.0f, 2);
                tj30 tj30VarC113 = zq8.c(zx7Var8, false);
                int iHashCode118 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM118 = fetVar2.m();
                mm40 mm40VarC117 = kbc.c0(fetVar2, mm40VarL10);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar4);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC113, shdVar9);
                jpm0.o(fetVar2, bh90VarM118, shdVar13);
                vqd.u(iHashCode118, fetVar2, shdVar11, fetVar2);
                jpm0.o(fetVar2, mm40VarC117, shdVar14);
                mm40 mm40VarE15 = o7k0.u(mm40Var2, 0.0f, 280.0f, 1).e(o7k0.c);
                zcl zclVar10 = qmk.m;
                ugg0 ugg0Var8 = vgg0.f37379a;
                dw9.x(h97.e(zclVar10, zclVar10, zclVar10, zclVar10, mm40VarE15), vbc.d0(vqm.b, fetVar2, 6, 0), fetVar2, 0, true);
                fetVar2.r(true);
                fetVar2.r(false);
                z9 = true;
            } else {
                fetVar2.e0(-49263927);
                mm40 mm40VarE16 = o7k0.e(o7k0.d(mm40Var2, f2), 32.0f);
                j83 j83VarB6 = n3nVar.b();
                j83VarB6.getClass();
                mm40 mm40VarD117 = o7k0.d(mm40VarE16, f2);
                tj30 tj30VarC114 = zq8.c(zx7Var, z6);
                int iHashCode119 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM119 = fetVar2.m();
                mm40 mm40VarC118 = kbc.c0(fetVar2, mm40VarD117);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar4);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC114, shdVar9);
                jpm0.o(fetVar2, bh90VarM119, shdVar13);
                vqd.u(iHashCode119, fetVar2, shdVar11, fetVar2);
                jpm0.o(fetVar2, mm40VarC118, shdVar14);
                mm40 mm40VarD118 = o7k0.d(mm40Var2, f2);
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                fet fetVar10 = fetVar2;
                v8q0.b(j83VarB6, mm40VarD118, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, null, g1t0.g(), fetVar10, 48, 24960, 240632);
                fetVar2 = fetVar10;
                z9 = true;
                fetVar2.r(true);
                fetVar2.r(false);
            }
            fetVar2.r(z9);
            function4 = function8;
        } else {
            fetVar2.X();
            function4 = function3;
        }
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g3n(mm40Var, n3nVar, function4, i2, i3, (byte) 0);
        }
    }

    public static final void s(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-846564586);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(mdmVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarE = tfx.E(o7k0.c);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ja2(function1, (byte) 8);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, i3 & 112, 5);
            fetVar.r(true);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wy0(mm40Var2, mdmVar, function1, i2, (byte) 4);
        }
    }

    public static final void t(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(1026582779);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(mdmVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarE = tfx.E(o7k0.c);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ja2(function1, (byte) 10);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, i3 & 112, 5);
            fetVar.r(true);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wy0(mm40Var2, mdmVar, function1, i2, (byte) 5);
        }
    }

    public static final void u(mm40 mm40Var, mx6 mx6Var, oln0 oln0Var, fx6 fx6Var, String str, Function0 function0, Function1 function1, Function2 function2, Function2 function3, fet fetVar, int i2) {
        mm40 mm40Var2;
        boolean z;
        androidx.compose.runtime.d dVar;
        long background;
        long background2;
        boolean z2;
        boolean z3;
        fetVar.g0(1322693687);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(mx6Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(oln0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.e(fx6Var.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.g(str) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function0) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= fetVar.i(function2) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= fetVar.i(function3) ? 67108864 : 33554432;
        }
        if (fetVar.U(i3 & 1, (38347923 & i3) != 38347922)) {
            Object[] objArr = new Object[0];
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new lg6((byte) 26);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) e9x.Q(objArr, (Function0) objP, fetVar, 48);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.h;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarD);
            if (((Boolean) pz40Var.getValue()).booleanValue()) {
                fetVar.e0(-201663906);
                dVar = zaq0.b;
                background = ((ThemeColors) fetVar.k(dVar)).getPrimary();
                z = false;
            } else {
                z = false;
                fetVar.e0(-201662911);
                dVar = zaq0.b;
                background = ((ThemeColors) fetVar.k(dVar)).getBackground();
            }
            fetVar.r(z);
            int i4 = i3;
            mm40 mm40VarS = i120.S(mm40VarE, 1.0f, background, new ugg0(zclVar, zclVar, zclVar, zclVar));
            int iOrdinal = fx6Var.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(784647762);
                background2 = ((ThemeColors) fetVar.k(dVar)).getBackground();
                fetVar.r(false);
            } else if (iOrdinal == 1) {
                fetVar.e0(784649555);
                background2 = ((ThemeColors) fetVar.k(dVar)).getWarningTint();
                fetVar.r(false);
            } else {
                if (iOrdinal != 2) {
                    throw b1j.f(784645958, fetVar, false);
                }
                fetVar.e0(784651474);
                background2 = ((ThemeColors) fetVar.k(dVar)).getBackground();
                fetVar.r(false);
            }
            mm40 mm40VarK = s5x0.K(i120.Q(mm40VarS, background2, jd8.n), 8.0f, 6.0f);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar, 54);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
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
            if (function2 == null) {
                fetVar.e0(233755174);
                z2 = false;
                fetVar.r(false);
            } else {
                z2 = false;
                fetVar.e0(1670108475);
                h97.q((i4 >> 21) & 14, fetVar, function2, false);
            }
            x7z x7zVar = new x7z(1.0f, true);
            boolean zBooleanValue = ((Boolean) pz40Var.getValue()).booleanValue();
            boolean zG = fetVar.g(pz40Var) | ((i4 & 458752) == 131072 ? true : z2);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                z3 = true;
                objP2 = new bw6((byte) 1, pz40Var, function0);
                fetVar.o0(objP2);
            } else {
                z3 = true;
            }
            E(x7zVar, mx6Var, oln0Var, fx6Var, str, zBooleanValue, function1, (Function1) objP2, fetVar, i4 & 3735536);
            if (function3 == null) {
                fetVar.e0(234294822);
                fetVar.r(z2);
            } else {
                fetVar.e0(1670125883);
                h97.q((i4 >> 24) & 14, fetVar, function3, z2);
            }
            fetVar.r(z3);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ez3(mm40Var2, (Object) mx6Var, (Object) oln0Var, (Object) fx6Var, str, (Object) function0, (wdr) function1, (wdr) function2, (wdr) function3, i2, (byte) 2);
        }
    }

    public static final void v(boolean z, Function0 function0, fet fetVar, int i2) {
        Function0 function1;
        fet fetVar2;
        d4d d4dVar;
        d4d d4dVar2;
        fetVar.g0(-1928277741);
        int i3 = i2 | (fetVar.h(z) ? 4 : 2) | (fetVar.i(function0) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            boolean z2 = fetVar.k(bmd.n) == k6z.f17794a;
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            long jM121getTransparent0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU();
            if (z) {
                fetVar.e0(-1943994534);
                d4dVar = d4d.STATIC_WHITE;
            } else {
                fetVar.e0(-1943993574);
                d4dVar = d4d.PRIMARY;
            }
            long jY = ibc.Y(d4dVar, fetVar);
            fetVar.r(false);
            if (z) {
                fetVar.e0(-1943991366);
                d4dVar2 = d4d.COMMERCE;
            } else {
                fetVar.e0(-1943990054);
                d4dVar2 = d4d.BACKGROUND_CONTENT;
            }
            long jY2 = ibc.Y(d4dVar2, fetVar);
            fetVar.r(false);
            pm80 pm80VarF = a8k0.F(z ? R.drawable.ic_glyph_filter_line_active : R.drawable.ic_glyph_filter_line_inactive, 0, fetVar);
            boolean zH = fetVar.h(z2);
            Object objP = fetVar.P();
            if (zH || objP == ukd.f35823a) {
                objP = z2 ? q3d.j(new y3d(background), new y3d(background), new y3d(background), new y3d(jM121getTransparent0d7_KjU)) : q3d.j(new y3d(jM121getTransparent0d7_KjU), new y3d(background), new y3d(background), new y3d(background));
                fetVar.o0(objP);
            }
            zcl zclVar = qmk.f28987a;
            float f2 = qmk.a(fetVar).c + 40.0f;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(s5x0.N(i120.P(o7k0.c(o7k0.s(jm40Var, f2), 1.0f), yk5.g((List) objP, 0.0f, 0.0f, 14), null, 6), qmk.a(fetVar).c, 0.0f, 0.0f, 0.0f, 14), "FILTER_BOX");
            tj30 tj30VarC = zq8.c(gqw0.d, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z3 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
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
            mm40 mm40VarQ = i120.Q(y860.W(lgb.J(o7k0.n(jm40Var, 32.0f), vgg0.f37379a), null, null, false, null, function0, 28), jY2, jd8.n);
            tj30 tj30VarC2 = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            function1 = function0;
            fetVar2 = fetVar;
            dww.c(pm80VarF, null, o7k0.n(jm40Var, 20.0f), jY, fetVar2, 56, 0);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            function1 = function0;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a0(z, function1, i2, (byte) 4);
        }
    }

    public static final void w(d9z d9zVar, vdt vdtVar, jn5 jn5Var, Function1 function1, fet fetVar, int i2) {
        Object khxVar;
        yje yjeVar;
        int i3;
        int i4;
        fetVar.g0(-1251225172);
        int i5 = (fetVar.g(d9zVar) ? 4 : 2) | i2 | (fetVar.i(vdtVar) ? 32 : 16) | (fetVar.g(jn5Var) ? 256 : 128);
        if ((i2 & 3072) == 0) {
            i5 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i5 & 1, (i5 & 1171) != 1170)) {
            Object obj = (pkk0) fetVar.k(bmd.q);
            Object obj2 = (wpq) fetVar.k(bmd.i);
            Object objF = androidx.compose.runtime.e.f(function1, fetVar);
            htr htrVar = vdtVar.f37248a;
            Object objP = fetVar.P();
            Object obj3 = ukd.f35823a;
            if (objP == obj3) {
                objP = jgk0.b(new md0(d9zVar, (byte) 12));
                fetVar.o0(objP);
            }
            l7m0 l7m0Var = (l7m0) objP;
            Integer numValueOf = Integer.valueOf(vdtVar.f);
            int i6 = i5 & 14;
            boolean z = ((i5 & 112) == 32 || fetVar.i(vdtVar)) | (i6 == 4);
            Object objP2 = fetVar.P();
            yje yjeVar2 = null;
            if (z || objP2 == obj3) {
                objP2 = new er60(vdtVar, d9zVar, yjeVar2, (byte) 3);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, numValueOf, (Function2) objP2);
            Boolean bool = (Boolean) l7m0Var.getValue();
            bool.booleanValue();
            boolean zG = ((i5 & 896) == 256) | fetVar.g(objF);
            Object objP3 = fetVar.P();
            if (zG || objP3 == obj3) {
                yjeVar = null;
                khxVar = new khx(jn5Var, objF, l7m0Var, yjeVar, (byte) 20);
                fetVar.o0(khxVar);
            } else {
                yjeVar = null;
                khxVar = objP3;
            }
            m0x0.t(fetVar, bool, (Function2) khxVar);
            Boolean boolValueOf = Boolean.valueOf(d9zVar.h.a());
            boolean zG2 = (i6 == 4) | fetVar.g(obj) | fetVar.i(obj2);
            Object objP4 = fetVar.P();
            if (zG2 || objP4 == obj3) {
                i3 = i5;
                i4 = 2048;
                Object khxVar2 = new khx(d9zVar, obj, obj2, yjeVar, (byte) 21);
                fetVar.o0(khxVar2);
                objP4 = khxVar2;
            } else {
                i3 = i5;
                i4 = 2048;
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP4);
            Unit unit = Unit.f46060a;
            boolean zG3 = (i6 == 4) | fetVar.g(objF);
            Object objP5 = fetVar.P();
            if (zG3 || objP5 == obj3) {
                objP5 = new rw40(d9zVar, objF, (byte) 29);
                fetVar.o0(objP5);
            }
            m0x0.o(unit, (Function1) objP5, fetVar);
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarG = knm0.g(s5x0.u(qmk.a(fetVar).c, 0.0f, qmk.a(fetVar).c, 24.0f, 2), fetVar);
            boolean zG4 = fetVar.g(htrVar) | ((i3 & 7168) == i4);
            Object objP6 = fetVar.P();
            if (zG4 || objP6 == obj3) {
                objP6 = new eya(htrVar, function1, (byte) 4);
                fetVar.o0(objP6);
            }
            uzb.z(n0qVar, ch80VarG, d9zVar, false, (Function2) objP6, fetVar, ((i3 << 6) & 896) | 6, 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fy7((byte) 4, i2, d9zVar, vdtVar, jn5Var, function1);
        }
    }

    public static final void x(l7m0 l7m0Var, a4x a4xVar, boolean z, boolean z2, Function1 function1, Function1 function2, fet fetVar, int i2) {
        l7m0 l7m0Var2;
        int i3;
        fetVar.g0(28391596);
        if ((i2 & 6) == 0) {
            l7m0Var2 = l7m0Var;
            i3 = (fetVar.g(l7m0Var2) ? 4 : 2) | i2;
        } else {
            l7m0Var2 = l7m0Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.h(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(function2) ? 131072 : 65536;
        }
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            wom womVarF = mom.f(fetVar);
            boolean zBooleanValue = ((Boolean) l7m0Var2.getValue()).booleanValue();
            boolean z3 = (i3 & 458752) == 131072;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new opm0(function2, (byte) 12);
                fetVar.o0(objP);
            }
            mom.c(null, zBooleanValue, womVarF, null, false, null, (Function0) objP, null, u1c.M(293782273, new hbn0((byte) 1, a4xVar, function1, z, z2), fetVar), fetVar, 100663296, ModuleDescriptor.MODULE_VERSION);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ibn0(l7m0Var2, a4xVar, z, z2, function1, function2, i2, (byte) 1);
        }
    }

    public static final void y(int i2, fet fetVar, mm40 mm40Var, String str, String str2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1621382599);
        int i3 = i2 | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            v8q0.a(str, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.n(g1t0.g(), fetVar2), fetVar2, (i3 >> 3) & 14, 24960, 110590);
            v8q0.a(str2, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.t(g1t0.d(), fetVar2), fetVar2, (i3 >> 6) & 14, 24960, 110590);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g15(mm40Var, str, str2, i2, (byte) 10);
        }
    }

    public static final void z(int i2, fet fetVar) {
        fet fetVar2;
        fetVar.g0(-1265384911);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            fetVar2 = fetVar;
            p3c0.a(null, ((ThemeColors) fetVar.k(zaq0.b)).getPrimary(), 0.0f, ((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU(), 0, 0.0f, fetVar2, 0, 53);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j3b0(i2, (byte) 26);
        }
    }
}
