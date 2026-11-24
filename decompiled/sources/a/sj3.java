package a;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.javax.sip.message.Response;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.MediaStore;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.ui_core.utils.ExtensionsKt$removeLinksUnderline$1;
import org.xplatform.uikit.components.tag.DsTag;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;
import org.xplatform.uikit.compose.components.calendar.model.DateRangeModel;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes5.dex */
public final class sj3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32288a;

    public sj3(ou6 ou6Var) {
        this.f32288a = (byte) 1;
    }

    public static final void A(final long j, final boolean z, fet fetVar, final int i) {
        int i2;
        mm40 mm40VarA0;
        fetVar.g0(797208762);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            if (z) {
                fetVar.e0(-1522739142);
                mm40VarA0 = wha0.a0(cjx.V(jm40Var, x0x.a0(fetVar), null), wha0.T(fetVar), false, 14);
                fetVar.r(false);
            } else {
                fetVar.e0(-1522595984);
                fetVar.r(false);
                mm40VarA0 = jm40Var;
            }
            mm40 mm40VarD = o7k0.d(i120.Q(jm40Var, j, jd8.n), 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 192.0f).e(mm40VarA0);
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
            kpb.j(null, new dkm(new ycl(32.0f), new ycl(4.0f), new y3d(((ThemeColors) fetVar.k(zaq0.b)).getSecondary60())), fetVar, 0, 1);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.ztl
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(i | 1);
                    sj3.A(j, z, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void A0(Fragment fragment, String str, Function2 function2) {
        fragment.getClass();
        fragment.C().u0(str, fragment, new jk8(function2, (byte) 1));
    }

    public static final void B(tlm tlmVar, gmm gmmVar, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        Function1 function3;
        fetVar.g0(-816991116);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(tlmVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(gmmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            function3 = function1;
            i2 |= fetVar.i(function3) ? 256 : 128;
        } else {
            function3 = function1;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function2) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            imm immVar = new imm(jlm.f16723a, tlmVar, gmmVar, y3d.f, false, null);
            int i3 = i2 & 7168;
            boolean z = i3 == 2048;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new mfp(function2, (byte) 11);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 2048;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new qyo(function2, (byte) 19);
                fetVar.o0(objP2);
            }
            Function1 function4 = (Function1) objP2;
            boolean z3 = i3 == 2048;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new qyo(function2, (byte) 20);
                fetVar.o0(objP3);
            }
            Function1 function5 = (Function1) objP3;
            boolean z4 = i3 == 2048;
            Object objP4 = fetVar.P();
            if (z4 || objP4 == cl5Var) {
                objP4 = new mfp(function2, (byte) 12);
                fetVar.o0(objP4);
            }
            hlm.c(null, immVar, null, function0, null, function3, function4, function5, (Function0) objP4, null, null, null, fetVar, ((i2 << 9) & 458752) | 805306368, 54, 21);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pip(tlmVar, gmmVar, function1, function2, i, (byte) 2);
        }
    }

    public static final void B0(Drawable drawable, Context context, int i) {
        context.getClass();
        if (drawable != null) {
            TypedValue typedValue = j5d.f15927a;
            drawable.setColorFilter(j5d.a(context, i, false), b4d.f1952a.b());
        }
    }

    public static final void C(mm40 mm40Var, bzm bzmVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1545369386);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(bzmVar) ? 32 : 16);
        byte b = 0;
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, 32.0f), 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(58153266, new xym(bzmVar, b), fetVar2), fetVar2, 56);
            mm40 mm40VarN = s5x0.N(jm40.b, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            String str = bzmVar.f3476a;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarM = g1t0.m();
            long j = qmk.q;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            v8q0.a(str, mm40VarN, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), new n05(j, g1t0.m().f42262a.b, idm0.s(0.25d)), 0L, null, null, null, 0L, null, qmk.C, 2, false, 2, 0, null, y9q0VarM, fetVar, 0, 24960, 108528);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yym(mm40Var, bzmVar, i, (byte) 0);
        }
    }

    public static final void C0(Drawable drawable, Context context, int i) {
        context.getClass();
        if (drawable != null) {
            TypedValue typedValue = j5d.f15927a;
            int color = context.getColor(i);
            b4d b4dVar = b4d.f1952a;
            vcc.b0(drawable, color);
        }
    }

    public static final void D(znp0 znp0Var, String str, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(67017860);
        int i2 = i | (fetVar2.g(znp0Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16);
        byte b = 0;
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = r71.l;
                fetVar2.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
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
            jpm0.o(fetVar2, tj30Var, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarK0 = mrv.k0(jm40Var, "IMAGE_ID");
            boolean z = (i2 & 14) == 4;
            Object objP2 = fetVar2.P();
            if (z || objP2 == cl5Var) {
                objP2 = new kdf(znp0Var, b);
                fetVar2.o0(objP2);
            }
            kkb.p(0, fetVar2, mm40VarK0, (Function0) objP2);
            mm40 mm40VarK1 = mrv.k0(jm40Var, "TITLE_ID");
            String str2 = znp0Var.b;
            y9q0 y9q0VarS = ibm0.s(g1t0.m(), fetVar2);
            long j = qmk.q;
            long j2 = qmk.r;
            long j3 = qmk.n;
            v8q0.a(str2, mm40VarK1, 0L, new n05(j, j2, j3), 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0VarS, fetVar, 48, 24960, 110580);
            v8q0.a(str, mrv.k0(jm40Var, "SCORE_ID"), 0L, new n05(qmk.p, j2, j3), 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, ibm0.s(g1t0.m(), fetVar), fetVar, ((i2 >> 3) & 14) | 48, 24960, 109556);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ldf(znp0Var, str, i, (byte) 0);
        }
    }

    public static final void D0(sik sikVar, androidx.fragment.app.e eVar) {
        eVar.getClass();
        String simpleName = sikVar.getClass().getSimpleName();
        if (eVar.J(simpleName) != null || eVar.K) {
            return;
        }
        sikVar.H0(eVar, simpleName);
    }

    public static final void E(mm40 mm40Var, azm azmVar, boolean z, fet fetVar, int i) {
        boolean z2;
        fet fetVar2 = fetVar;
        q6x q6xVar = q6x.f28221a;
        fetVar2.g0(1181394503);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(azmVar) ? 32 : 16) | (fetVar2.e(2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(mm40Var, 32.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.e(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), 12.0f), 1.0f);
            String str = azmVar.f1723a;
            String str2 = azmVar.c;
            String str3 = azmVar.b;
            long textPrimary = ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarD, textPrimary, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.h(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.e0(-232321707);
            fetVar2.r(false);
            fetVar2.e0(-232174891);
            fetVar2.r(false);
            if (z) {
                fetVar2.e0(-232073087);
                qzb.p(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), f7k.Z(str3, fetVar2), null, fetVar2, 0, 0);
                fetVar2.r(false);
            } else {
                q6x q6xVar2 = q6x.f28221a;
                fetVar2.e0(-231826110);
                ebc.s(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), new dqm(f7k.Z(str3, fetVar2), null), fetVar2, 0, 0);
                fetVar2.r(false);
            }
            if (z) {
                z2 = true;
                fetVar2.e0(-231430395);
                qzb.p(null, f7k.Z(str2, fetVar2), null, fetVar2, 0, 1);
                fetVar2.r(false);
            } else {
                q6x q6xVar3 = q6x.f28221a;
                fetVar2.e0(-231250874);
                z2 = true;
                ebc.s(null, new dqm(f7k.Z(str2, fetVar2), null), fetVar2, 0, 1);
                fetVar2.r(false);
            }
            fetVar2.r(z2);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wym(mm40Var, azmVar, z, i, (byte) 0);
        }
    }

    public static final void E0(sik sikVar, androidx.fragment.app.e eVar, String str) {
        sikVar.getClass();
        eVar.getClass();
        str.getClass();
        eVar.getClass();
        zb5 zb5Var = new zb5(eVar);
        zb5Var.k(0, sikVar, str, 1);
        zb5Var.g(true, true);
    }

    public static final void F(int i, fet fetVar, mm40 mm40Var, String str) {
        int i2;
        fet fetVar2 = fetVar;
        String str2 = str;
        fetVar2.g0(-899823530);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str2) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarC = o7k0.c(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarU = o7k0.u(mm40VarC, 0.0f, 80.0f, 1);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarU);
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
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), new n05(qmk.p, g1t0.g().f42262a.b, idm0.s(0.25d)), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar2, (i2 >> 3) & 14, 24960, 110578);
            str2 = str;
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cx(mm40Var, str2, i, (byte) 12);
        }
    }

    public static final void G(int i, fet fetVar, a4x a4xVar, Function0 function0, Function1 function1) {
        fet fetVar2;
        a4x a4xVar2;
        Function0 function2;
        Function1 function3;
        fetVar.g0(915168872);
        int i2 = (fetVar.g(a4xVar) ? 4 : 2) | i | (fetVar.i(function0) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            fetVar2 = fetVar;
            hp4.w(s5x0.L(jm40.b, 12.0f, 0.0f, 2), a4xVar, function0, function1, fetVar2, (i2 << 3) & 8176);
            a4xVar2 = a4xVar;
            function2 = function0;
            function3 = function1;
        } else {
            fetVar2 = fetVar;
            a4xVar2 = a4xVar;
            function2 = function0;
            function3 = function1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pbg(a4xVar2, function2, function3, i, (byte) 3);
        }
    }

    public static final String G0(String str) {
        return twn.p("[^\\d]", str, "");
    }

    public static final void H(mm40 mm40Var, x6m x6mVar, fet fetVar, int i) {
        fetVar.g0(-173927082);
        int i2 = i | 6;
        byte b = 16;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(x6mVar) : fetVar.i(x6mVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.g, gqw0.m, fetVar, 6);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarC);
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
            kpb.i(null, x6mVar.f40370a, fetVar, 0);
            kpb.i(null, x6mVar.b, fetVar, 0);
            fetVar.r(true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kkl(mm40Var, x6mVar, i, b);
        }
    }

    public static final ArrayList H0(knb knbVar) {
        List list = knbVar.f18576a;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((rbb) it.next()).n));
        }
        List listL0 = CollectionsKt.L0(CollectionsKt.O0(arrayList));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Long lValueOf = Long.valueOf(((rbb) obj).n);
            Object arrayList2 = linkedHashMap.get(lValueOf);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(lValueOf, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = listL0.iterator();
        while (it2.hasNext()) {
            long jLongValue = ((Number) it2.next()).longValue();
            List list2 = (List) linkedHashMap.get(Long.valueOf(jLongValue));
            zlb zlbVar = list2 == null ? null : new zlb(jLongValue, ((rbb) CollectionsKt.U(list2)).e, list2, true);
            if (zlbVar != null) {
                arrayList3.add(zlbVar);
            }
        }
        return arrayList3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
    
        if (a.bww.T(r7, r4, r0) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I(a.xcz r7, int r8, a.zje r9) {
        /*
            boolean r0 = r9 instanceof a.iej
            if (r0 == 0) goto L13
            r0 = r9
            a.iej r0 = (a.iej) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.iej r0 = new a.iej
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            a.z1x.P(r9)
            goto L78
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r5
        L31:
            int r8 = r0.j
            a.xcz r7 = r0.i
            a.z1x.P(r9)
            goto L5a
        L39:
            a.z1x.P(r9)
            a.x9c r9 = new a.x9c
            r2 = 5
            r9.<init>(r7, r8, r2)
            a.vsg0 r9 = a.ydx.V(r5, r9)
            a.i89 r2 = new a.i89
            r6 = 22
            r2.<init>(r9, r6)
            r0.i = r7
            r0.j = r8
            r0.l = r4
            java.lang.Object r9 = a.ntb.K(r2, r0)
            if (r9 != r1) goto L5a
            goto L77
        L5a:
            a.ncz r9 = (a.ncz) r9
            a.mcz r2 = r7.j()
            int r2 = r2.n
            int r4 = r9.p
            int r9 = r9.q
            int r4 = r4 + r9
            int r4 = r4 - r2
            if (r4 == 0) goto L7b
            float r9 = (float) r4
            r0.i = r5
            r0.j = r8
            r0.l = r3
            java.lang.Object r7 = a.bww.T(r7, r9, r0)
            if (r7 != r1) goto L78
        L77:
            return r1
        L78:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        L7b:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.sj3.I(a.xcz, int, a.zje):java.lang.Object");
    }

    public static final ArrayList I0(ned nedVar) {
        ned nedVar2 = nedVar;
        List list = nedVar2.f23380a.f19738a;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            udt udtVar = (udt) it.next();
            String str = udtVar.f35495a;
            long j = udtVar.b;
            lho lhoVar = udtVar.c;
            String str2 = udtVar.g;
            String str3 = udtVar.h;
            int i = udtVar.d;
            String str4 = udtVar.e;
            String str5 = udtVar.f;
            int i2 = udtVar.i;
            cys0 cys0Var = udtVar.j;
            List list2 = udtVar.k;
            List list3 = udtVar.l;
            str4.getClass();
            str5.getClass();
            list2.getClass();
            list3.getClass();
            Iterator it2 = it;
            List list4 = nedVar2.c;
            String strG0 = g0(str2, list4);
            String strG1 = g0(str3, list4);
            String strF0 = f0(str2, list4);
            Long lT0 = StringsKt.t0(str2);
            long jLongValue = 0;
            String strS = vsm0.s(lT0 != null ? lT0.longValue() : 0L, strF0);
            String strF1 = f0(str3, list4);
            Long lT1 = StringsKt.t0(str3);
            if (lT1 != null) {
                jLongValue = lT1.longValue();
            }
            arrayList.add(new rvf(str, j, lhoVar, strG0, strG1, strS, vsm0.s(jLongValue, strF1), str4, str5, i, i2, cys0Var, list2, list3));
            nedVar2 = nedVar;
            it = it2;
        }
        return arrayList;
    }

    public static final boolean J(Context context) {
        context.getClass();
        return (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f || Settings.Global.getFloat(context.getContentResolver(), "transition_animation_scale", 1.0f) == 0.0f) ? false : true;
    }

    public static final v1o0 J0(d0t d0tVar, ctf0 ctf0Var, m5l0 m5l0Var, v5l0 v5l0Var, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        int i;
        String strA;
        d0tVar.getClass();
        boolean z5 = d0tVar.h;
        rqs rqsVar = d0tVar.p;
        ctf0Var.getClass();
        list.getClass();
        str.getClass();
        v5l0Var.getClass();
        str2.getClass();
        int iOrdinal = v5l0Var.ordinal();
        if (iOrdinal == 0) {
            return new q1o0(d0tVar.f5282a, afn0.q(d0tVar, str, list, z3, z4, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z2), kpb.f0(d0tVar, z)), new f2o0(qzb.c0(d0tVar), qzb.r0(d0tVar), z5 ? ctf0Var.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0)) : rqsVar.f30947a, ulb.h0(d0tVar), ulb.k0(d0tVar), new dlk(kpb.R(d0tVar).f33307a, kpb.R(d0tVar).b, rqsVar.t, rqsVar.u)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        if (iOrdinal == 1) {
            return new u1o0(d0tVar.f5282a, afn0.u(new y3d(StaticColors.INSTANCE.m113getRed0d7_KjU()), d0tVar, str, str2, list, z3, z4, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new l3o0(qzb.c0(d0tVar), qzb.r0(d0tVar), z5 ? ctf0Var.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0)) : rqsVar.f30947a, ulb.h0(d0tVar), ulb.k0(d0tVar), new dlk(kpb.R(d0tVar).f33307a, kpb.R(d0tVar).b, rqsVar.t, rqsVar.u)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        if (iOrdinal == 2) {
            return new t1o0(d0tVar.f5282a, afn0.t(d0tVar, str, list, z3, z4, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new d3o0(ulb.h0(d0tVar), ulb.k0(d0tVar), new dlk(kpb.R(d0tVar).f33307a, kpb.R(d0tVar).b, rqsVar.t, rqsVar.u), qzb.c0(d0tVar), qzb.r0(d0tVar), z5 ? ctf0Var.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0)) : rqsVar.f30947a, ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0))), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        if (iOrdinal == 3) {
            return new s1o0(d0tVar.f5282a, afn0.s(null, d0tVar, str, "", ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), str2, list, z3, z4, true, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z2), kpb.f0(d0tVar, z)), new v2o0(qzb.c0(d0tVar), qzb.r0(d0tVar), ulb.h0(d0tVar), ulb.k0(d0tVar), new dlk(kpb.R(d0tVar).f33307a, kpb.R(d0tVar).b, rqsVar.t, rqsVar.u)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var), new n0x(dtb.F(str)));
        }
        if (iOrdinal != 4) {
            t9f.b();
            return null;
        }
        long j = d0tVar.f5282a;
        k4i k4iVarR = afn0.r(d0tVar, str, list, z3, z4, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z2), kpb.f0(d0tVar, z));
        String strC0 = qzb.c0(d0tVar);
        String strR0 = qzb.r0(d0tVar);
        dkk dkkVarH0 = ulb.h0(d0tVar);
        dkk dkkVarK0 = ulb.k0(d0tVar);
        dlk dlkVar = new dlk(kpb.R(d0tVar).f33307a, kpb.R(d0tVar).b, rqsVar.t, rqsVar.u);
        if (z5) {
            i = 0;
            strA = ctf0Var.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0));
        } else {
            i = 0;
            strA = rqsVar.f30947a;
        }
        return new r1o0(j, k4iVarR, new n2o0(dkkVarH0, dkkVarK0, dlkVar, ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[i], i)), strC0, strR0, strA), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
    }

    public static final boolean K(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        context.getClass();
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null || runningAppProcesses.isEmpty()) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (Intrinsics.d(runningAppProcessInfo.processName, context.getPackageName()) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }

    public static final void K0(View view, Float f, Float f2, Float f3, Float f4) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            if (f != null) {
                float fFloatValue = f.floatValue();
                Context context = view.getContext();
                context.getClass();
                marginLayoutParams.leftMargin = fFloatValue == 0.0f ? 0 : (int) Math.ceil(context.getResources().getDisplayMetrics().density * fFloatValue);
            }
            float fFloatValue2 = f2.floatValue();
            Context context2 = view.getContext();
            context2.getClass();
            marginLayoutParams.topMargin = fFloatValue2 == 0.0f ? 0 : (int) Math.ceil(context2.getResources().getDisplayMetrics().density * fFloatValue2);
            if (f3 != null) {
                float fFloatValue3 = f3.floatValue();
                Context context3 = view.getContext();
                context3.getClass();
                marginLayoutParams.rightMargin = fFloatValue3 == 0.0f ? 0 : (int) Math.ceil(context3.getResources().getDisplayMetrics().density * fFloatValue3);
            }
            if (f4 != null) {
                float fFloatValue4 = f4.floatValue();
                Context context4 = view.getContext();
                context4.getClass();
                marginLayoutParams.bottomMargin = fFloatValue4 != 0.0f ? (int) Math.ceil(context4.getResources().getDisplayMetrics().density * fFloatValue4) : 0;
            }
        }
    }

    public static final boolean L(Context context) {
        if (Build.VERSION.SDK_INT < 26) {
            return new o760(context).b.areNotificationsEnabled();
        }
        Object systemService = context.getSystemService(RemoteMessageConst.NOTIFICATION);
        systemService.getClass();
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (!notificationManager.areNotificationsEnabled()) {
            return false;
        }
        Iterator it = notificationManager.getNotificationChannels().iterator();
        while (it.hasNext()) {
            if (c0g.b(it.next()).getImportance() == 0) {
                return false;
            }
        }
        return true;
    }

    public static void L0(View view, int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            i = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
        }
        if ((i5 & 2) != 0) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            i2 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
        }
        if ((i5 & 4) != 0) {
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
            i3 = marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0;
        }
        if ((i5 & 8) != 0) {
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
            i4 = marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0;
        }
        view.getClass();
        ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
        if (layoutParams5 == null) {
            hny.u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
        marginLayoutParams5.leftMargin = i;
        marginLayoutParams5.topMargin = i2;
        marginLayoutParams5.rightMargin = i3;
        marginLayoutParams5.bottomMargin = i4;
        view.setLayoutParams(marginLayoutParams5);
    }

    public static /* synthetic */ void M0(View view, Float f, Float f2, int i) {
        if ((i & 8) != 0) {
            f2 = null;
        }
        K0(view, null, f, null, f2);
    }

    public static final String N(String str) {
        str.getClass();
        if (str.length() <= 0) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public static void N0(View view, Float f) {
        int paddingLeft = view.getPaddingLeft();
        int paddingTop = view.getPaddingTop();
        int paddingRight = view.getPaddingRight();
        float fFloatValue = f.floatValue();
        Context context = view.getContext();
        context.getClass();
        view.setPadding(paddingLeft, paddingTop, paddingRight, fFloatValue == 0.0f ? 0 : (int) Math.ceil(context.getResources().getDisplayMetrics().density * fFloatValue));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void O(Fragment fragment) {
        fragment.getClass();
        if (fragment instanceof vbr) {
            ((vbr) fragment).onClose();
            androidx.fragment.app.e eVarF = fragment.F();
            eVarF.A(new t1r(eVarF, null, -1, 0), false);
            return;
        }
        List<Fragment> listP = fragment.C().c.p();
        listP.getClass();
        for (Fragment fragment2 : listP) {
            fragment2.getClass();
            O(fragment2);
        }
    }

    public static final int P(int i, Context context) {
        context.getClass();
        return context.getColor(i);
    }

    public static final int R(SimpleDate simpleDate, SimpleDate simpleDate2, Calendar calendar) {
        wdx.J(simpleDate, calendar);
        long timeInMillis = calendar.getTimeInMillis();
        wdx.J(simpleDate2, calendar);
        return (int) ((calendar.getTimeInMillis() - timeInMillis) / 86400000);
    }

    public static final gmq S(gmq gmqVar, long j) {
        if (j >= 0) {
            return j == 0 ? gmqVar : new eu4(new ymq(new nme((byte) 25, j), gmqVar, null, (byte) 0), (byte) 9);
        }
        jf4.o("Debounce timeout should not be negative");
        return null;
    }

    public static final void T(Fragment fragment) {
        fragment.getClass();
        if (fragment instanceof sik) {
            ((sik) fragment).y0();
            return;
        }
        List<Fragment> listP = fragment.C().c.p();
        listP.getClass();
        for (Fragment fragment2 : listP) {
            fragment2.getClass();
            T(fragment2);
        }
    }

    public static final Drawable U(int i, Context context) {
        context.getClass();
        return context.getDrawable(i);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[LOOP:0: B:22:0x005e->B:44:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0085 -> B:30:0x0086). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object V(a.qpg0 r8, a.zje r9) {
        /*
            boolean r0 = r9 instanceof a.iyh
            if (r0 == 0) goto L13
            r0 = r9
            a.iyh r0 = (a.iyh) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.iyh r0 = new a.iyh
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L33
            if (r2 != r5) goto L2d
            java.util.Iterator r8 = r0.j
            a.qpg0 r2 = r0.i
            a.z1x.P(r9)
            goto L86
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r4
        L33:
            a.z1x.P(r9)
            a.lc00 r9 = kotlin.collections.a.b()
            java.lang.String r2 = "SELECT name FROM sqlite_master WHERE type = 'trigger'"
            a.xpg0 r2 = r8.Z0(r2)
        L40:
            boolean r6 = r2.W0()     // Catch: java.lang.Throwable -> L4e
            if (r6 == 0) goto L50
            java.lang.String r6 = r2.J0(r3)     // Catch: java.lang.Throwable -> L4e
            r9.add(r6)     // Catch: java.lang.Throwable -> L4e
            goto L40
        L4e:
            r8 = move-exception
            goto L8b
        L50:
            a.ay3.L(r2, r4)
            a.lc00 r9 = kotlin.collections.a.a(r9)
            java.util.ListIterator r9 = r9.listIterator(r3)
            r7 = r9
            r9 = r8
            r8 = r7
        L5e:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L88
            java.lang.Object r2 = r8.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = "room_fts_content_sync_"
            boolean r4 = kotlin.text.c.x(r2, r4, r3)
            if (r4 == 0) goto L5e
            java.lang.String r4 = "DROP TRIGGER IF EXISTS "
            java.lang.String r2 = r4.concat(r2)
            r0.i = r9
            r0.j = r8
            r0.l = r5
            kotlin.Unit r2 = a.j0x.s(r9, r2)
            if (r2 != r1) goto L85
            return r1
        L85:
            r2 = r9
        L86:
            r9 = r2
            goto L5e
        L88:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        L8b:
            throw r8     // Catch: java.lang.Throwable -> L8c
        L8c:
            r9 = move-exception
            a.ay3.L(r2, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.sj3.V(a.qpg0, a.zje):java.lang.Object");
    }

    public static DsTag W(int i, Context context) {
        context.getClass();
        return new DsTag(new tje(context, i), null, 6, 0);
    }

    public static final int X(int i) {
        return (int) (i * Resources.getSystem().getDisplayMetrics().density);
    }

    public static final long Y(Context context) {
        Object g0g0Var;
        context.getClass();
        try {
            e0g0 e0g0Var = j0g0.b;
            File externalFilesDir = context.getExternalFilesDir(null);
            g0g0Var = Long.valueOf((externalFilesDir == null || !externalFilesDir.exists()) ? -1L : new StatFs(externalFilesDir.getAbsolutePath()).getAvailableBytes());
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (g0g0Var instanceof g0g0) {
            g0g0Var = -1L;
        }
        return ((Number) g0g0Var).longValue();
    }

    public static final long Z(Context context) {
        context.getClass();
        File filesDir = context.getFilesDir();
        StatFs statFs = new StatFs(filesDir != null ? filesDir.getPath() : null);
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    /* JADX WARN: Code duplicated, block: B:95:0x01d9  */
    public static final void a(final il9 il9Var, final Locale locale, final Calendar calendar, final long j, final long j2, final long j3, final Long l, final Long l2, final boolean z, final int i, final Integer num, final DateRangeModel dateRangeModel, final Function2 function2, fet fetVar, final int i2) {
        Object intRange;
        Object obj;
        final Long l3 = l;
        final Long l4 = l2;
        fetVar.g0(1781601063);
        final Calendar calendar2 = calendar;
        long j4 = j;
        long j5 = j2;
        int i3 = i2 | (fetVar.i(il9Var) ? 4 : 2) | (fetVar.g(locale) ? 32 : 16) | (fetVar.i(calendar2) ? 256 : 128) | (fetVar.f(j4) ? 2048 : 1024) | (fetVar.f(j5) ? 16384 : 8192) | (fetVar.f(j3) ? 131072 : 65536) | (fetVar.g(l3) ? 1048576 : 524288) | (fetVar.g(l4) ? 8388608 : 4194304) | (fetVar.h(z) ? 67108864 : 33554432) | (fetVar.e(i) ? 536870912 : 268435456);
        if (fetVar.U(i3 & 1, ((i3 & 306783379) == 306783378 && (((('@' | (fetVar.g(num) ? (char) 4 : (char) 2)) | (fetVar.i(dateRangeModel) ? 32 : 16)) | (fetVar.i(function2) ? 256 : 128)) & 147) == 146) ? false : true)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            int i4 = il9Var.f14965a;
            int i5 = il9Var.b;
            boolean zE = fetVar.e(i4) | fetVar.e(i5) | ((i3 & 112) == 32);
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            Object obj3 = objP;
            if (zE || objP == obj2) {
                Calendar calendar3 = Calendar.getInstance(locale);
                calendar3.clear();
                calendar3.set(1, il9Var.f14965a);
                calendar3.set(2, i5);
                calendar3.set(5, 1);
                fetVar.o0(calendar3);
                obj3 = calendar3;
            }
            Calendar calendar4 = (Calendar) obj3;
            calendar4.getClass();
            x0x.k(o7k0.d(jm40Var, 1.0f), calendar4, locale, fetVar, ((i3 << 3) & 896) | 6);
            zcl zclVar = qmk.f28987a;
            qxw.o(fetVar, o7k0.e(jm40Var, 4.0f));
            fetVar.e0(-817717924);
            int i6 = 0;
            for (Object obj4 : il9Var.c) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    q3d.p();
                    throw null;
                }
                final List list = (List) obj4;
                boolean zG = fetVar.g(list) | ((i3 & 3670016) == 1048576) | ((i3 & 29360128) == 8388608);
                Object objP2 = fetVar.P();
                if (zG || objP2 == obj2) {
                    if (l3 != null && l4 != null) {
                        Integer numValueOf = null;
                        Integer numValueOf2 = null;
                        int i8 = 0;
                        for (Object obj5 : list) {
                            int i9 = i8 + 1;
                            if (i8 < 0) {
                                q3d.p();
                                throw null;
                            }
                            yk9 yk9Var = (yk9) obj5;
                            long j6 = yk9Var.f42776a;
                            long jLongValue = l3.longValue();
                            if (j6 <= l4.longValue() && jLongValue <= j6 && yk9Var.c) {
                                if (numValueOf == null) {
                                    numValueOf = Integer.valueOf(i8);
                                }
                                numValueOf2 = Integer.valueOf(i8);
                            }
                            i8 = i9;
                        }
                        intRange = (numValueOf == null || numValueOf2 == null) ? null : new IntRange(numValueOf.intValue(), numValueOf2.intValue(), 1);
                    }
                    fetVar.o0(intRange);
                } else {
                    intRange = objP2;
                }
                IntRange intRange2 = (IntRange) intRange;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    Object next = it.next();
                    if (((yk9) next).c) {
                        obj = next;
                        break;
                    }
                }
                if (obj == null) {
                    fetVar.e0(1812232044);
                    fetVar.r(false);
                } else {
                    fetVar.e0(1809043012);
                    int size = list.size();
                    zcl zclVar2 = qmk.f28987a;
                    final long j7 = j5;
                    final long j8 = j4;
                    cwr0.a(o7k0.d(jm40Var, 1.0f), size, s5x0.t(16.0f, 0.0f, 2), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundLight60(), intRange2, new ycl(40.0f), u1c.M(985174204, new ydr() { // from class: a.gej
                        /* JADX WARN: Failed to calculate best type for var: r13v3 ??
                        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v3 ??, new type: boolean
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                        Caused by: java.lang.NullPointerException
                         */
                        /* JADX WARN: Failed to calculate best type for var: r13v3 ??
                        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v3 ??, new type: boolean
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                        Caused by: java.lang.NullPointerException
                         */
                        /* JADX WARN: Failed to calculate best type for var: r13v4 ??
                        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v4 ??, new type: boolean
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                        Caused by: java.lang.NullPointerException
                         */
                        /* JADX WARN: Failed to calculate best type for var: r13v5 ??
                        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v5 ??, new type: boolean
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                        Caused by: java.lang.NullPointerException
                         */
                        /* JADX WARN: Failed to calculate best type for var: r9v1 ??
                        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v1 ??, new type: a.fet
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                        Caused by: java.lang.NullPointerException
                         */
                        /*  JADX ERROR: Types fix failed
                            jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v3 ??, new type: boolean
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                            	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                            Caused by: java.lang.NullPointerException
                            */
                        @Override // a.ydr
                        public final java.lang.Object j(java.lang.Object r19, java.lang.Object r20, java.lang.Object r21, java.lang.Object r22) {
                            /*
                                Method dump skipped, instruction units count: 401
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: a.gej.j(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                        }
                    }, fetVar), fetVar, 6);
                    fetVar.r(false);
                }
                calendar2 = calendar;
                j4 = j;
                j5 = j2;
                l3 = l;
                l4 = l2;
                i6 = i7;
                jm40Var = jm40Var;
                obj2 = obj2;
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(locale, calendar, j, j2, j3, l, l2, z, i, num, dateRangeModel, function2, i2) { // from class: a.hej
                public final /* synthetic */ Locale b;
                public final /* synthetic */ Calendar c;
                public final /* synthetic */ long d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;
                public final /* synthetic */ Long g;
                public final /* synthetic */ Long h;
                public final /* synthetic */ boolean i;
                public final /* synthetic */ int j;
                public final /* synthetic */ Integer k;
                public final /* synthetic */ DateRangeModel l;
                public final /* synthetic */ Function2 m;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    int iL = x8x.L(9);
                    sj3.a(this.f12926a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (fet) obj6, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final String a0(d0t d0tVar) {
        d0tVar.getClass();
        int i = d0tVar.g;
        String str = d0tVar.o;
        if (i == 0) {
            return str;
        }
        return d0tVar.v == 146 ? String.format("%s.%s.%s", Arrays.copyOf(new Object[]{Integer.valueOf(i), str, d0tVar.b}, 3)) : String.format("%s.%s", Arrays.copyOf(new Object[]{Integer.valueOf(i), str}, 2));
    }

    public static final void b(mm40 mm40Var, g0d g0dVar, Function0 function0, fet fetVar, int i) {
        int i2;
        g0dVar.getClass();
        function0.getClass();
        fetVar.g0(361408084);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(g0dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM125getWhite100d7_KjU = staticColors.m125getWhite100d7_KjU();
            zcl zclVar = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarM = s5x0.M(i120.Q(mm40Var, jM125getWhite100d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar)), 8.0f, 6.0f, 4.0f, 6.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            z(new x7z(1.0f, true), g0dVar, fetVar, i2 & 112);
            mm40 mm40VarN = o7k0.n(jm40.b, 32.0f);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z = (i2 & 896) == 256;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new pk9(function0, (byte) 11);
                fetVar.o0(objP2);
            }
            dww.c(iom0.r(jpm0.t(R.drawable.ic_glyph_settings_inactive, 6, fetVar), fetVar), null, o2e.e0(s5x0.J(y860.W(mm40VarN, gy40Var, null, false, null, (Function0) objP2, 28), 6.0f), "COEF_SETTINGS_ICON"), staticColors.m123getWhite0d7_KjU(), fetVar, 56, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuc(mm40Var, g0dVar, function0, i, (byte) 3);
        }
    }

    public static final String b0(kzv kzvVar) {
        String str = kzvVar.k;
        return str.length() > 0 ? str : kzvVar.i;
    }

    public static final void c(mm40 mm40Var, p3w p3wVar, Function1 function1, fet fetVar, int i) {
        int i2;
        ugd ugdVarM;
        ugd ugdVarM2;
        function1.getClass();
        fetVar.g0(-905644299);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(p3wVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        byte b = 0;
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            ugd ugdVarM3 = null;
            if (p3wVar.h) {
                fetVar.e0(935627853);
                ugdVarM = u1c.M(1970567837, new mcd(p3wVar, function1, b), fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(936526481);
                fetVar.r(false);
                ugdVarM = null;
            }
            if (p3wVar.o) {
                fetVar.e0(936641956);
                ugdVarM2 = u1c.M(-1372567620, new mcd(function1, p3wVar, b2), fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(937456977);
                fetVar.r(false);
                ugdVarM2 = null;
            }
            if (p3wVar.f.isEmpty()) {
                fetVar.e0(940253425);
                fetVar.r(false);
            } else {
                fetVar.e0(937635568);
                ugdVarM3 = u1c.M(-420735781, new c61(p3wVar, (byte) 3), fetVar);
                fetVar.r(false);
            }
            d(mm40Var, p3wVar, ugdVarM, ugdVarM2, ugdVarM3, fetVar, i2 & 126);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ncd(mm40Var, p3wVar, function1, i, (byte) 0);
        }
    }

    public static final String c0(File file) {
        file.getClass();
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String lowerCase = k0q.e(file).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(lowerCase);
        return mimeTypeFromExtension == null ? "application/octet-stream" : mimeTypeFromExtension;
    }

    public static final void d(mm40 mm40Var, p3w p3wVar, Function2 function2, Function2 function3, Function2 function4, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(-824268916);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(p3wVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function4) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            x(p3wVar, fetVar, (i2 >> 3) & 14);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarH = dw9.h(1.0f, o7k0.g(s5x0.N(jm40.b, 12.0f, 0.0f, 0.0f, 0.0f, 14), 32.0f, 0.0f, 2), true);
            x5d x5dVarA = w5d.a(uc9.e, gqw0.m, fetVar, 6);
            int i3 = i2;
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarH);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = p3wVar.c + " · \u200e" + p3wVar.e;
                fetVar.o0(objP);
            }
            v8q0.a((String) objP, null, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 6, 24960, 110586);
            fetVar2 = fetVar;
            if (function4 == null) {
                fetVar2.e0(94502215);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-551140870);
                h97.q((i3 >> 12) & 14, fetVar2, function4, false);
            }
            fetVar2.r(true);
            if (function2 == null) {
                fetVar2.e0(1968222257);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-490698288);
                h97.q((i3 >> 6) & 14, fetVar2, function2, false);
            }
            if (function3 == null) {
                fetVar2.e0(1968252017);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-490697328);
                h97.q((i3 >> 9) & 14, fetVar2, function3, false);
            }
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zf(mm40Var, (Object) p3wVar, (Object) function2, (Object) function3, (Object) function4, i, (byte) 8);
        }
    }

    public static final int d0(int i) {
        return (int) (i / Resources.getSystem().getDisplayMetrics().density);
    }

    public static final void e(mm40 mm40Var, pdm0 pdm0Var, fet fetVar, int i) {
        fetVar.g0(202496175);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(pdm0Var) ? 32 : 16;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            p5h0 p5h0Var = pdm0Var.d;
            boolean z = p5h0Var instanceof n5h0;
            jm40 jm40Var = jm40.b;
            if (z) {
                fetVar.e0(-1865318894);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13);
                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
                n5h0 n5h0Var = (n5h0) p5h0Var;
                D(pdm0Var.b, n5h0Var.f22944a, fetVar, 0);
                D(pdm0Var.c, n5h0Var.b, fetVar, 0);
                fetVar.r(true);
                fetVar.r(false);
            } else {
                fetVar.e0(-1864948909);
                fetVar.r(false);
            }
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jdf(mm40Var, pdm0Var, i, b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0033 A[RETURN] */
    public static final String e0(Uri uri, String str) {
        uri.getClass();
        str.getClass();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        queryParameterNames.getClass();
        for (String str2 : queryParameterNames) {
            if (!str.equalsIgnoreCase(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                if (str2 != null) {
                    return uri.getQueryParameter(str2);
                }
                return null;
            }
        }
        str2 = null;
        if (str2 != null) {
            return uri.getQueryParameter(str2);
        }
        return null;
    }

    public static final void f(mm40 mm40Var, q2r0 q2r0Var, xcz xczVar, hh80 hh80Var, qw3 qw3Var, Function1 function1, fet fetVar, int i) {
        q2r0Var.getClass();
        xczVar.getClass();
        hh80Var.getClass();
        function1.getClass();
        fetVar.g0(1608272737);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(q2r0Var) ? 32 : 16) | (fetVar.g(xczVar) ? 256 : 128) | (fetVar.g(qw3Var) ? 16384 : 8192) | (fetVar.i(function1) ? 131072 : 65536);
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            mm40 mm40VarS = o7k0.s(jm40.b, ((ycl) fetVar.k(wdr0.f38987a)).f42389a);
            boolean z = q2r0Var.f28016a;
            boolean zG = ((i2 & 112) == 32) | fetVar.g(mm40VarS) | fetVar.h(z) | ((458752 & i2) == 131072);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                t13 t13Var = new t13((Object) q2r0Var, (Object) mm40VarS, z, (Object) function1, (byte) 5);
                fetVar.o0(t13Var);
                objP = t13Var;
            }
            b8k0.f(mm40Var, xczVar, hh80Var, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, (i2 & 14) | ((i2 >> 3) & 112) | 384 | (57344 & i2), Response.NOT_ACCEPTABLE_HERE);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new acb0(mm40Var, q2r0Var, xczVar, hh80Var, qw3Var, function1, i, (byte) 13);
        }
    }

    public static final String f0(String str, List list) {
        Object next;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((ufp0) next).f35586a, str));
        ufp0 ufp0Var = (ufp0) next;
        String str2 = ufp0Var != null ? ufp0Var.d : null;
        return str2 == null ? "" : str2;
    }

    public static final void g(mm40 mm40Var, xcz xczVar, bnh bnhVar, Function1 function1, fet fetVar, int i) {
        int i2;
        xcz xczVar2;
        xczVar.getClass();
        function1.getClass();
        fetVar.g0(1247562747);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            xczVar2 = xczVar;
            i2 |= fetVar.g(xczVar2) ? 32 : 16;
        } else {
            xczVar2 = xczVar;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(bnhVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = bnhVar instanceof zmh;
            byte b = 14;
            cl5 cl5Var = ukd.f35823a;
            if (z) {
                fetVar.e0(1790123413);
                mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                lh80 lh80VarT = s5x0.t(8.0f, 0.0f, 2);
                qw3 qw3Var = new qw3(8.0f, true, new jf4(b));
                boolean z2 = ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
                Object objP = fetVar.P();
                if (z2 || objP == cl5Var) {
                    objP = new ngh(bnhVar, function1, (byte) 4);
                    fetVar.o0(objP);
                }
                b8k0.f(mm40VarD, xczVar2, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, i2 & 112, Response.NOT_ACCEPTABLE_HERE);
                fetVar.r(false);
            } else {
                if (!(bnhVar instanceof anh)) {
                    throw b1j.f(611933233, fetVar, false);
                }
                fetVar.e0(1790807552);
                mm40 mm40VarD2 = o7k0.d(mm40Var, 1.0f);
                zcl zclVar2 = qmk.f28987a;
                lh80 lh80VarT2 = s5x0.t(8.0f, 0.0f, 2);
                qw3 qw3Var2 = new qw3(8.0f, true, new jf4(b));
                Object objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = new m7h((byte) 19);
                    fetVar.o0(objP2);
                }
                b8k0.f(mm40VarD2, null, lh80VarT2, false, qw3Var2, null, null, false, null, (Function1) objP2, fetVar, 817889280, 362);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dg0((byte) 25, i, (Object) mm40Var, (Object) xczVar, (Object) bnhVar, (Object) function1);
        }
    }

    public static final String g0(String str, List list) {
        Object next;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((ufp0) next).f35586a, str));
        ufp0 ufp0Var = (ufp0) next;
        String str2 = ufp0Var != null ? ufp0Var.b : null;
        return str2 == null ? "" : str2;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0166  */
    public static final void h(mm40 mm40Var, final jej jejVar, String str, String str2, final Function1 function1, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        Pair pair;
        boolean z;
        w2w0 w2w0VarJ0;
        w2w0 w2w0VarJ1;
        Object obj;
        Long lValueOf;
        Long lValueOf2;
        boolean z2;
        int iD;
        xcz xczVar;
        IntRange intRange;
        fet fetVar3;
        fet fetVar4 = fetVar;
        jejVar.getClass();
        str.getClass();
        str2.getClass();
        fetVar4.g0(159229421);
        if ((i & 6) == 0) {
            i2 = (fetVar4.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar4.g(jejVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar4.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar4.g(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar4.i(function1) ? 16384 : 8192;
        }
        if (fetVar4.U(i2 & 1, (i2 & 9363) != 9362)) {
            final Locale locale = jejVar.f16377a;
            Integer num = jejVar.e;
            int i3 = jejVar.d;
            SimpleDate simpleDate = jejVar.c;
            SimpleDate simpleDate2 = jejVar.b;
            boolean zG = fetVar4.g(locale);
            Object objP = fetVar4.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = Calendar.getInstance(locale);
                fetVar4.o0(objP);
            }
            final Calendar calendar = (Calendar) objP;
            boolean zG2 = fetVar4.g(calendar) | fetVar4.g(simpleDate2);
            Object objP2 = fetVar4.P();
            if (zG2 || objP2 == cl5Var) {
                calendar.getClass();
                simpleDate2.getClass();
                wdx.J(simpleDate2, calendar);
                objP2 = Long.valueOf(calendar.getTimeInMillis());
                fetVar4.o0(objP2);
            }
            final long jLongValue = ((Number) objP2).longValue();
            boolean zG3 = fetVar4.g(calendar) | fetVar4.g(simpleDate);
            Object objP3 = fetVar4.P();
            if (zG3 || objP3 == cl5Var) {
                calendar.getClass();
                simpleDate.getClass();
                wdx.J(simpleDate, calendar);
                objP3 = Long.valueOf(calendar.getTimeInMillis());
                fetVar4.o0(objP3);
            }
            final long jLongValue2 = ((Number) objP3).longValue();
            boolean zG4 = fetVar4.g(simpleDate2) | fetVar4.g(simpleDate);
            Object objP4 = fetVar4.P();
            if (zG4 || objP4 == cl5Var) {
                calendar.getClass();
                objP4 = Integer.valueOf(R(simpleDate2, simpleDate, calendar) + 1);
                fetVar4.o0(objP4);
            }
            int iIntValue = ((Number) objP4).intValue();
            boolean zG5 = fetVar4.g(simpleDate2) | fetVar4.g(simpleDate) | fetVar4.e(i3) | fetVar4.g(num) | fetVar4.g(jejVar.a()) | fetVar4.g(locale) | fetVar4.e(iIntValue);
            int i4 = i2;
            Object objP5 = fetVar4.P();
            if (zG5 || objP5 == cl5Var) {
                if (bsr0.W(simpleDate2, simpleDate) <= 0 && i3 >= 1 && i3 <= num.intValue() && iIntValue >= Math.max(2, i3)) {
                    DateRangeModel dateRangeModelA = jejVar.a();
                    calendar.getClass();
                    SimpleDate simpleDate3 = dateRangeModelA.f47284a;
                    SimpleDate simpleDate4 = dateRangeModelA.b;
                    boolean z3 = simpleDate3 == null || (bsr0.W(simpleDate3, simpleDate2) >= 0 && bsr0.W(simpleDate3, simpleDate) <= 0);
                    boolean z4 = simpleDate4 == null || (bsr0.W(simpleDate4, simpleDate2) >= 0 && bsr0.W(simpleDate4, simpleDate) <= 0);
                    if (simpleDate3 == null || simpleDate4 == null) {
                        pair = new Pair(Boolean.TRUE, null);
                    } else {
                        boolean z5 = bsr0.W(simpleDate4, simpleDate3) >= 0;
                        pair = new Pair(Boolean.valueOf(z5), z5 ? Integer.valueOf(R(simpleDate3, simpleDate4, calendar) + 1) : null);
                    }
                    boolean zBooleanValue = ((Boolean) pair.f46059a).booleanValue();
                    Integer num2 = (Integer) pair.b;
                    boolean z6 = num2 == null || num2.intValue() >= i3;
                    boolean z7 = num2 == null || num2.intValue() <= num.intValue();
                    if (z3 && z4 && zBooleanValue && z6 && z7) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                objP5 = Boolean.valueOf(z);
                fetVar4.o0(objP5);
            }
            Boolean bool = (Boolean) objP5;
            final boolean zBooleanValue2 = bool.booleanValue();
            int i5 = i4 & 112;
            int i6 = i4 & 57344;
            boolean zH = fetVar4.h(zBooleanValue2) | (i5 == 32) | (i6 == 16384);
            Object objP6 = fetVar4.P();
            if (zH || objP6 == cl5Var) {
                objP6 = new b1f(zBooleanValue2, jejVar, function1, (yje) null);
                fetVar4.o0(objP6);
            }
            m0x0.t(fetVar4, bool, (Function2) objP6);
            boolean zG6 = fetVar4.g(locale);
            Object objP7 = fetVar4.P();
            Object obj2 = objP7;
            if (zG6 || objP7 == cl5Var) {
                Calendar calendar2 = Calendar.getInstance(locale);
                calendar2.getClass();
                bsr0.U(calendar2);
                fetVar4.o0(calendar2);
                obj2 = calendar2;
            }
            Calendar calendar3 = (Calendar) obj2;
            boolean zG7 = fetVar4.g(locale) | fetVar4.g(simpleDate2);
            Object objP8 = fetVar4.P();
            if (zG7 || objP8 == cl5Var) {
                if (zBooleanValue2) {
                    calendar.getClass();
                    wdx.J(simpleDate2, calendar);
                    w2w0VarJ0 = wdx.j0(calendar);
                } else {
                    calendar3.getClass();
                    w2w0VarJ0 = wdx.j0(calendar3);
                }
                objP8 = w2w0VarJ0;
                fetVar4.o0(objP8);
            }
            w2w0 w2w0Var = (w2w0) objP8;
            boolean zG8 = fetVar4.g(locale) | fetVar4.g(simpleDate);
            Object objP9 = fetVar4.P();
            if (zG8 || objP9 == cl5Var) {
                if (zBooleanValue2) {
                    calendar.getClass();
                    wdx.J(simpleDate, calendar);
                    w2w0VarJ1 = wdx.j0(calendar);
                } else {
                    calendar3.add(2, 1);
                    w2w0VarJ1 = wdx.j0(calendar3);
                }
                objP9 = w2w0VarJ1;
                fetVar4.o0(objP9);
            }
            w2w0 w2w0Var2 = (w2w0) objP9;
            boolean zG9 = fetVar4.g(w2w0Var) | fetVar4.g(w2w0Var2);
            Object objP10 = fetVar4.P();
            if (zG9 || objP10 == cl5Var) {
                int iM0 = bsr0.m0(w2w0Var);
                int iM1 = bsr0.m0(w2w0Var2);
                objP10 = iM0 <= iM1 ? new IntRange(iM0, iM1, 1) : new IntRange(0, 0, 1);
                fetVar4.o0(objP10);
            } else {
                i5 = i5;
            }
            IntRange intRange2 = (IntRange) objP10;
            boolean zG10 = fetVar4.g(locale);
            Object objP11 = fetVar4.P();
            if (zG10 || objP11 == cl5Var) {
                objP11 = bsr0.o0(locale);
                fetVar4.o0(objP11);
            }
            Set set = (Set) objP11;
            boolean zG11 = fetVar4.g(locale) | fetVar4.g(set);
            Object objP12 = fetVar4.P();
            if (zG11 || objP12 == cl5Var) {
                ArrayList arrayListN0 = bsr0.n0(locale);
                ArrayList arrayList = new ArrayList(r3d.q(arrayListN0, 10));
                Iterator it = arrayListN0.iterator();
                while (it.hasNext()) {
                    b6v0 b6v0Var = (b6v0) it.next();
                    Iterator it2 = it;
                    Set set2 = set;
                    arrayList.add(new d6v0(b6v0Var.b, set.contains(Integer.valueOf(b6v0Var.f2076a)) ? e6v0.b : e6v0.f7306a));
                    it = it2;
                    set = set2;
                }
                fetVar4.o0(arrayList);
                obj = arrayList;
            } else {
                obj = objP12;
            }
            List list = (List) obj;
            boolean zG12 = fetVar4.g(calendar3);
            Object objP13 = fetVar4.P();
            if (zG12 || objP13 == cl5Var) {
                objP13 = androidx.compose.runtime.e.c(calendar3.getTimeInMillis());
                fetVar4.o0(objP13);
            }
            final egk0 egk0Var = (egk0) objP13;
            boolean zG13 = fetVar4.g(jejVar.a()) | fetVar4.g(calendar);
            Object objP14 = fetVar4.P();
            if (zG13 || objP14 == cl5Var) {
                SimpleDate simpleDate5 = jejVar.a().f47284a;
                if (simpleDate5 != null) {
                    calendar.getClass();
                    wdx.J(simpleDate5, calendar);
                    lValueOf = Long.valueOf(calendar.getTimeInMillis());
                } else {
                    lValueOf = null;
                }
                fetVar4.o0(lValueOf);
                objP14 = lValueOf;
            }
            final Long l = (Long) objP14;
            boolean zG14 = fetVar4.g(jejVar.a()) | fetVar4.g(calendar);
            Object objP15 = fetVar4.P();
            if (zG14 || objP15 == cl5Var) {
                SimpleDate simpleDate6 = jejVar.a().b;
                if (simpleDate6 != null) {
                    calendar.getClass();
                    wdx.J(simpleDate6, calendar);
                    lValueOf2 = Long.valueOf(calendar.getTimeInMillis());
                } else {
                    lValueOf2 = null;
                }
                fetVar4.o0(lValueOf2);
                objP15 = lValueOf2;
            }
            final Long l2 = (Long) objP15;
            final omv omvVar = (omv) fetVar4.k(bmd.l);
            xcz xczVarA = ddz.a(0, 0, fetVar4, 0, 3);
            Object objP16 = fetVar4.P();
            if (objP16 == cl5Var) {
                objP16 = jejVar.a();
                fetVar4.o0(objP16);
            }
            DateRangeModel dateRangeModel = (DateRangeModel) objP16;
            boolean zG15 = fetVar4.g(simpleDate2) | fetVar4.g(simpleDate) | fetVar4.g(locale);
            Object objP17 = fetVar4.P();
            if (zG15 || objP17 == cl5Var) {
                Calendar calendar4 = Calendar.getInstance(locale);
                calendar4.getClass();
                bsr0.U(calendar4);
                SimpleDate simpleDate7 = new SimpleDate(calendar4.get(1), calendar4.get(2) + 1, calendar4.get(5));
                SimpleDate simpleDate8 = dateRangeModel.b;
                if (simpleDate8 != null || (simpleDate8 = dateRangeModel.f47284a) != null) {
                    simpleDate7 = simpleDate8;
                }
                objP17 = bsr0.V(simpleDate7, simpleDate2, simpleDate);
                fetVar4.o0(objP17);
            }
            SimpleDate simpleDate9 = (SimpleDate) objP17;
            boolean zG16 = fetVar4.g(simpleDate9) | fetVar4.g(locale) | fetVar4.g(intRange2);
            Object objP18 = fetVar4.P();
            if (zG16 || objP18 == cl5Var) {
                int iM = CollectionsKt.M(intRange2);
                if (iM <= 0) {
                    iD = 0;
                    z2 = true;
                } else {
                    calendar.getClass();
                    wdx.J(simpleDate9, calendar);
                    z2 = true;
                    iD = l1e0.d(bsr0.m0(wdx.j0(calendar)) - intRange2.f46068a, 0, iM - 1);
                }
                objP18 = Integer.valueOf(iD);
                fetVar4.o0(objP18);
            } else {
                z2 = true;
            }
            int iIntValue2 = ((Number) objP18).intValue();
            Integer numValueOf = Integer.valueOf(iIntValue2);
            boolean zI = fetVar4.i(intRange2) | fetVar4.g(xczVarA) | fetVar4.e(iIntValue2);
            Object objP19 = fetVar4.P();
            if (zI || objP19 == cl5Var) {
                xczVar = xczVarA;
                objP19 = new gc1((Object) intRange2, (Object) xczVar, iIntValue2, (yje) null, (byte) 4);
                intRange = intRange2;
                fetVar4.o0(objP19);
            } else {
                intRange = intRange2;
                xczVar = xczVarA;
            }
            m0x0.v(numValueOf, intRange, (Function2) objP19, fetVar4);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar4, 0);
            int iHashCode = Long.hashCode(fetVar4.T);
            bh90 bh90VarM = fetVar4.m();
            mm40 mm40VarC0 = kbc.c0(fetVar4, mm40Var);
            mkd.c0.getClass();
            fetVar4.i0();
            if (fetVar4.S) {
                fetVar4.l(e7z.u1);
            } else {
                fetVar4.r0();
            }
            jpm0.o(fetVar4, x5dVarA, gqw0.x);
            jpm0.o(fetVar4, bh90VarM, gqw0.w);
            jpm0.o(fetVar4, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar4);
            jpm0.o(fetVar4, mm40VarC0, gqw0.v);
            DateRangeModel dateRangeModelA2 = jejVar.a();
            calendar.getClass();
            i(list, str, str2, dateRangeModelA2, locale, calendar, fetVar4, ((i4 >> 3) & 1008) | 4096);
            boolean zI2 = fetVar4.i(intRange) | fetVar4.g(locale) | fetVar4.i(calendar) | fetVar4.f(jLongValue) | fetVar4.f(jLongValue2) | fetVar4.g(egk0Var) | fetVar4.g(l) | fetVar4.g(l2) | fetVar4.h(zBooleanValue2) | (i5 == 32 ? z2 : false) | (i6 == 16384 ? z2 : false) | fetVar4.i(omvVar);
            Object objP20 = fetVar4.P();
            if (zI2 || objP20 == cl5Var) {
                final IntRange intRange3 = intRange;
                fet fetVar5 = fetVar;
                Function1 function2 = new Function1() { // from class: a.eej
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        hcz hczVar = (hcz) obj3;
                        hczVar.getClass();
                        final IntRange intRange4 = intRange3;
                        int iM2 = CollectionsKt.M(intRange4);
                        final Locale locale2 = locale;
                        final Calendar calendar5 = calendar;
                        final long j = jLongValue;
                        final long j2 = jLongValue2;
                        final Long l3 = l;
                        final Long l4 = l2;
                        final boolean z8 = zBooleanValue2;
                        final jej jejVar2 = jejVar;
                        final Function1 function3 = function1;
                        final omv omvVar2 = omvVar;
                        final egk0 egk0Var2 = egk0Var;
                        hcz.g(hczVar, iM2, null, null, new ugd(1133337561, true, new ydr() { // from class: a.fej
                            @Override // a.ydr
                            public final Object j(Object obj4, Object obj5, Object obj6, Object obj7) {
                                boolean z9;
                                Calendar calendar6;
                                int iIntValue3 = ((Integer) obj5).intValue();
                                fet fetVar6 = (fet) obj6;
                                int iIntValue4 = ((Integer) obj7).intValue();
                                ((g9z) obj4).getClass();
                                if ((iIntValue4 & 48) == 0) {
                                    iIntValue4 |= fetVar6.e(iIntValue3) ? 32 : 16;
                                }
                                if (fetVar6.U(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                                    IntRange intRange5 = intRange4;
                                    w2w0 w2w0VarD0 = bsr0.d0(intRange5.f46068a + iIntValue3);
                                    boolean zG17 = fetVar6.g(w2w0VarD0);
                                    Locale locale3 = locale2;
                                    boolean zG18 = zG17 | fetVar6.g(locale3);
                                    Object objP21 = fetVar6.P();
                                    cl5 cl5Var2 = ukd.f35823a;
                                    if (zG18 || objP21 == cl5Var2) {
                                        objP21 = bsr0.S(w2w0VarD0.f38472a, w2w0VarD0.b, locale3);
                                        fetVar6.o0(objP21);
                                    }
                                    il9 il9Var = (il9) objP21;
                                    if (iIntValue3 == 0) {
                                        fetVar6.e0(521690064);
                                        zcl zclVar = qmk.f28987a;
                                        wvb.o(null, 4.0f, 0L, fetVar6, 0, 5);
                                        fetVar6.r(false);
                                    } else {
                                        fetVar6.e0(521784335);
                                        zcl zclVar2 = qmk.f28987a;
                                        wvb.o(null, 16.0f, 0L, fetVar6, 0, 5);
                                        fetVar6.r(false);
                                    }
                                    Calendar calendar7 = calendar5;
                                    calendar7.getClass();
                                    long jL = egk0Var2.l();
                                    jej jejVar3 = jejVar2;
                                    int i7 = jejVar3.d;
                                    Integer num3 = jejVar3.e;
                                    DateRangeModel dateRangeModelA3 = jejVar3.a();
                                    boolean z10 = z8;
                                    boolean zH2 = fetVar6.h(z10) | fetVar6.i(calendar7) | fetVar6.g(jejVar3);
                                    Function1 function4 = function3;
                                    boolean zG19 = zH2 | fetVar6.g(function4);
                                    omv omvVar3 = omvVar2;
                                    boolean zI3 = zG19 | fetVar6.i(omvVar3);
                                    Object objP22 = fetVar6.P();
                                    if (zI3 || objP22 == cl5Var2) {
                                        z9 = z10;
                                        calendar6 = calendar7;
                                        ip0 ip0Var = new ip0(z9, calendar6, jejVar3, function4, omvVar3);
                                        fetVar6.o0(ip0Var);
                                        objP22 = ip0Var;
                                    } else {
                                        calendar6 = calendar7;
                                        z9 = z10;
                                    }
                                    sj3.a(il9Var, locale3, calendar6, j, j2, jL, l3, l4, z9, i7, num3, dateRangeModelA3, (Function2) objP22, fetVar6, 8);
                                    if (iIntValue3 == CollectionsKt.M(intRange5) - 1) {
                                        fetVar6.e0(523563983);
                                        wvb.o(null, 12.0f, 0L, fetVar6, 0, 5);
                                        fetVar6.r(false);
                                    } else {
                                        fetVar6.e0(523650473);
                                        fetVar6.r(false);
                                    }
                                } else {
                                    fetVar6.X();
                                }
                                return Unit.f46060a;
                            }
                        }), 6);
                        return Unit.f46060a;
                    }
                };
                fetVar5.o0(function2);
                objP20 = function2;
                fetVar3 = fetVar5;
            } else {
                fetVar3 = fetVar4;
            }
            fet fetVar6 = fetVar3;
            b8k0.e(jm40.b, xczVar, null, null, null, null, false, null, (Function1) objP20, fetVar6, 6, 508);
            fetVar6.r(z2);
            fetVar2 = fetVar6;
        } else {
            fetVar4.X();
            fetVar2 = fetVar4;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bl9(mm40Var, jejVar, str, str2, function1, i, (byte) 1);
        }
    }

    public static final boolean h0(Fragment fragment, String str) {
        fragment.getClass();
        str.getClass();
        for (int iP = fragment.F().P() - 1; iP >= 0; iP--) {
            Fragment fragmentJ = fragment.F().J(fragment.F().O(iP).i);
            if (Intrinsics.d(fragmentJ != null ? fragmentJ.B : null, str)) {
                return true;
            }
        }
        Fragment fragment2 = fragment.y;
        if (fragment2 != null) {
            return h0(fragment2, str);
        }
        return false;
    }

    public static final void i(List list, String str, String str2, DateRangeModel dateRangeModel, Locale locale, Calendar calendar, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1900249586);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar2.g(list) : fetVar2.i(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? fetVar2.g(dateRangeModel) : fetVar2.i(dateRangeModel) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.g(locale) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar2.i(calendar) ? 131072 : 65536;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (i3 & 74899) != 74898)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            zcl zclVar = qmk.f28987a;
            wvb.o(null, 8.0f, 0L, fetVar2, 0, 5);
            int i4 = i3 >> 6;
            int i5 = i3 << 9;
            f7k.d(s5x0.L(o7k0.d(jm40Var, 1.0f), 16.0f, 0.0f, 2), dateRangeModel, locale, calendar, str, str2, fetVar, (i4 & 7168) | (i4 & 112) | 64 | (i4 & 896) | (57344 & i5) | (i5 & 458752));
            wvb.o(null, 6.0f, 0L, fetVar, 0, 5);
            rsm0.m(o7k0.d(jm40Var, 1.0f), list, fetVar, ((i3 << 3) & 112) | 6);
            wvb.o(null, 6.0f, 0L, fetVar, 0, 5);
            vtb.t(null, qqm.b, null, 0L, fetVar, 48, 13);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg0((Object) list, (Object) str, (Object) str2, (Object) dateRangeModel, (Object) locale, (Object) calendar, i, (byte) 11);
        }
    }

    public static final String i0(String str) {
        str.getClass();
        if (str.length() == 0) {
            return null;
        }
        return str;
    }

    public static final void j(final k4l k4lVar, amw amwVar, fet fetVar, int i) {
        int i2;
        amwVar.getClass();
        fetVar.g0(1278175352);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(k4lVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(amwVar) ? 32 : 16;
        }
        final byte b2 = 0;
        final byte b3 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 4.0f, 7), "DOTA_ITEMS_STATISTICS");
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new i5l(amwVar, b2);
                fetVar.o0(objP);
            }
            Function1 function1 = (Function1) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new n2l(b);
                fetVar.o0(objP2);
            }
            Function1 function2 = (Function1) objP2;
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object objP3 = fetVar.P();
            if (z2 || objP3 == cl5Var) {
                objP3 = new Function1() { // from class: a.j5l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b4 = b2;
                        k4l k4lVar2 = k4lVar;
                        m5l m5lVar = (m5l) obj;
                        switch (b4) {
                            case 0:
                                m5lVar.getClass();
                                String strValueOf = String.valueOf(k4lVar2.b);
                                strValueOf.getClass();
                                amw amwVar2 = m5lVar.i;
                                if (amwVar2 != null) {
                                    amwVar2.b(strValueOf, (HorizontalScrollView) m5lVar.f21225a.e);
                                }
                                break;
                            default:
                                m5lVar.getClass();
                                m5lVar.setTeam(k4lVar2.c);
                                m5lVar.setHeroes(k4lVar2.d);
                                m5lVar.setHeroesItems(k4lVar2.e);
                                m5lVar.setAdditionalInformation(k4lVar2.f);
                                m5lVar.setItems(k4lVar2.g);
                                String strValueOf2 = String.valueOf(k4lVar2.b);
                                strValueOf2.getClass();
                                amw amwVar3 = m5lVar.i;
                                if (amwVar3 != null) {
                                    amwVar3.a(strValueOf2, (HorizontalScrollView) m5lVar.f21225a.e);
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP3);
            }
            Function1 function3 = (Function1) objP3;
            b2 = i3 == 4 ? (byte) 1 : (byte) 0;
            Object objP4 = fetVar.P();
            if (b2 != 0 || objP4 == cl5Var) {
                objP4 = new Function1() { // from class: a.j5l
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b4 = b3;
                        k4l k4lVar2 = k4lVar;
                        m5l m5lVar = (m5l) obj;
                        switch (b4) {
                            case 0:
                                m5lVar.getClass();
                                String strValueOf = String.valueOf(k4lVar2.b);
                                strValueOf.getClass();
                                amw amwVar2 = m5lVar.i;
                                if (amwVar2 != null) {
                                    amwVar2.b(strValueOf, (HorizontalScrollView) m5lVar.f21225a.e);
                                }
                                break;
                            default:
                                m5lVar.getClass();
                                m5lVar.setTeam(k4lVar2.c);
                                m5lVar.setHeroes(k4lVar2.d);
                                m5lVar.setHeroesItems(k4lVar2.e);
                                m5lVar.setAdditionalInformation(k4lVar2.f);
                                m5lVar.setItems(k4lVar2.g);
                                String strValueOf2 = String.valueOf(k4lVar2.b);
                                strValueOf2.getClass();
                                amw amwVar3 = m5lVar.i;
                                if (amwVar3 != null) {
                                    amwVar3.a(strValueOf2, (HorizontalScrollView) m5lVar.f21225a.e);
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP4);
            }
            dwi0.c(function1, mm40VarE0, function2, function3, (Function1) objP4, fetVar, 384, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zma(k4lVar, amwVar, i, (byte) 25);
        }
    }

    public static final String j0(String str, String str2) {
        str2.getClass();
        return (str == null || str.length() == 0) ? str2 : str;
    }

    public static final void k(mm40 mm40Var, onl onlVar, pnl pnlVar, Function0 function0, fet fetVar, int i) {
        fetVar.g0(989237385);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.e(onlVar.ordinal()) ? 32 : 16) | (fetVar.g(pnlVar) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            int iOrdinal = onlVar.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(1469362643);
                int i3 = i2 & 14;
                int i4 = i2 >> 3;
                ulb.g(mm40Var, pnlVar, function0, fetVar, (i4 & 896) | i3 | (i4 & 112));
                fetVar.r(false);
            } else if (iOrdinal == 1) {
                fetVar.e0(1469368533);
                int i5 = i2 & 14;
                int i6 = i2 >> 3;
                tlb.h(mm40Var, pnlVar, function0, fetVar, (i6 & 896) | i5 | (i6 & 112));
                fetVar.r(false);
            } else if (iOrdinal == 2) {
                fetVar.e0(1469374682);
                int i7 = i2 & 14;
                int i8 = i2 >> 3;
                kpb.f(mm40Var, pnlVar, function0, fetVar, (i8 & 896) | i7 | (i8 & 112));
                fetVar.r(false);
            } else {
                if (iOrdinal != 3) {
                    throw b1j.f(1469361431, fetVar, false);
                }
                fetVar.e0(1469380986);
                int i9 = i2 & 14;
                int i10 = i2 >> 3;
                f7k.f(mm40Var, pnlVar, function0, fetVar, (i10 & 896) | i9 | (i10 & 112));
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqk((byte) 3, i, (Object) mm40Var, (Object) onlVar, (Object) pnlVar, (Object) function0);
        }
    }

    public static final void l(qwv0 qwv0Var, mm40 mm40Var, long j, fet fetVar, int i) {
        fetVar.g0(-1354884368);
        int i2 = i | 432;
        if (fetVar.U(i2 & 1, (i2 & 145) != 144)) {
            j = y3d.f;
            int i3 = i2 >> 3;
            A(j, false, fetVar, (i3 & 112) | (i3 & 14) | 384);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        long j2 = j;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xhh((Object) qwv0Var, (Object) mm40Var2, j2, i, (byte) 1);
        }
    }

    public static final void m(int i, long j, fet fetVar, mm40 mm40Var) {
        fetVar.g0(80941094);
        int i2 = i | 54;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            j = y3d.f;
            A(j, true, fetVar, 438);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        long j2 = j;
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ly2(mm40Var2, j2, i, (byte) 6);
        }
    }

    public static final void n(mm40 mm40Var, x6m x6mVar, a4x a4xVar, xcz xczVar, fet fetVar, int i) {
        int i2;
        a4xVar.getClass();
        fetVar.g0(2089720025);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(w6m.f38630a) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? fetVar.g(x6mVar) : fetVar.i(x6mVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(a4xVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(xczVar) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 104.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarN = s5x0.N(i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), ((StaticColors) fetVar.k(m8m0.f21378a)).m73getBlack400d7_KjU(), jd8.n), 8.0f, 8.0f, 0.0f, 8.0f, 4);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            int i3 = i2 >> 3;
            H(null, x6mVar, fetVar, i3 & 112);
            v(null, a4xVar, xczVar, fetVar, (i2 & 112) | (i3 & 896) | (i3 & 7168));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e0i((byte) 10, i, (Object) mm40Var, (Object) x6mVar, (Object) a4xVar, (Object) xczVar);
        }
    }

    public static final boolean n0(List list, List list2) {
        list.getClass();
        list2.getClass();
        if (list.size() != list2.size()) {
            return false;
        }
        ArrayList<Pair> arrayListT0 = CollectionsKt.T0(list, list2);
        if (arrayListT0.isEmpty()) {
            return true;
        }
        for (Pair pair : arrayListT0) {
            if (!Intrinsics.d(pair.f46059a, pair.b)) {
                return false;
            }
        }
        return true;
    }

    public static final void o(mm40 mm40Var, boolean z, nim nimVar, Function2 function2, Function1 function1, fet fetVar, int i) {
        int i2;
        boolean z2;
        List listJ;
        Object yn8Var;
        int i3;
        String str;
        Object plmVar;
        Function1 function3;
        boolean z3;
        Function1 function4 = function1;
        nimVar.getClass();
        function4.getClass();
        fetVar.g0(1821097934);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 16;
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= fetVar.h(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(nimVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function4) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            if (((Configuration) fetVar.k(dy2.f6873a)).getLayoutDirection() == 0) {
                fetVar.e0(-1697936057);
                listJ = q3d.j(new y3d(afn0.o(fetVar).getUpdateGradientStart()), new y3d(afn0.o(fetVar).getUpdateGradientEnd()));
                fetVar.r(false);
            } else {
                fetVar.e0(-1697758489);
                listJ = q3d.j(new y3d(afn0.o(fetVar).getUpdateGradientEnd()), new y3d(afn0.o(fetVar).getUpdateGradientStart()));
                fetVar.r(false);
            }
            List list = listJ;
            zcl zclVar = qmk.f28987a;
            long jM71getBlack300d7_KjU = afn0.p(fetVar).m71getBlack300d7_KjU();
            long separator60 = afn0.m(fetVar).getSeparator60();
            boolean zF = ((i2 & 112) == 32) | fetVar.f(jM71getBlack300d7_KjU) | fetVar.i(list) | fetVar.d(1.0f) | fetVar.f(separator60);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zF || objP == obj) {
                boolean z4 = z2;
                i3 = 0;
                yn8Var = new yn8(jM71getBlack300d7_KjU, list, z4, separator60);
                fetVar.o0(yn8Var);
            } else {
                i3 = 0;
                yn8Var = objP;
            }
            mm40 mm40VarE = s5x0.N(rq8.K(jm40.b, (Function1) yn8Var), 0.0f, 0.0f, 0.0f, 4.0f, 7).e(mm40Var);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, i3);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            long jM123getWhite0d7_KjU = afn0.p(fetVar).m123getWhite0d7_KjU();
            long jM123getWhite0d7_KjU2 = afn0.p(fetVar).m123getWhite0d7_KjU();
            Object obj2 = nimVar.f23596a;
            a4x a4xVar = nimVar.h;
            boolean z5 = nimVar.f;
            String str2 = nimVar.e;
            String str3 = nimVar.d;
            String str4 = nimVar.i;
            boolean zG = fetVar.g(obj2) | fetVar.g(str4);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                String str5 = nimVar.f23596a;
                fa50 fa50Var = fa50.f9191a;
                if (str4 != null) {
                    str = str3;
                    plmVar = new rlm(str5, str4, jM123getWhite0d7_KjU, jM123getWhite0d7_KjU2, fa50Var);
                } else if (str5.length() > 0) {
                    str = str3;
                    plmVar = new plm(str5, ha50.TWO_LINES, jM123getWhite0d7_KjU, fa50Var);
                } else {
                    str = str3;
                    plmVar = mlm.f21997a;
                }
                fetVar.o0(plmVar);
            } else {
                plmVar = objP2;
                z5 = z5;
                str2 = str2;
                str = str3;
            }
            tlm tlmVar = (tlm) plmVar;
            boolean zG2 = fetVar.g(str) | fetVar.g(str2) | fetVar.h(z5);
            Object objP3 = fetVar.P();
            if (zG2 || objP3 == obj) {
                objP3 = new nlm(new hmm(str2, rfh0.f30388a, str, z5));
                fetVar.o0(objP3);
            }
            nlm nlmVar = (nlm) objP3;
            if (nimVar.c) {
                tlmVar = nlmVar;
            }
            gmm gmmVar = nimVar.b;
            int i4 = 57344 & i2;
            boolean z6 = i4 == 16384;
            Object objP4 = fetVar.P();
            if (z6 || objP4 == obj) {
                function3 = function1;
                objP4 = new qyo(function3, (byte) 18);
                fetVar.o0(objP4);
            } else {
                function3 = function1;
            }
            function4 = function3;
            B(tlmVar, gmmVar, (Function1) objP4, function4, fetVar, (i2 >> 3) & 7168);
            if (a4xVar.isEmpty()) {
                z3 = false;
                fetVar.e0(-1419584310);
                fetVar.r(false);
            } else {
                fetVar.e0(-1420043668);
                pz40 pz40VarF = androidx.compose.runtime.e.f(nimVar, fetVar);
                boolean zG3 = fetVar.g(pz40VarF);
                Object objP5 = fetVar.P();
                if (zG3 || objP5 == obj) {
                    objP5 = new cml(pz40VarF, (byte) 29);
                    fetVar.o0(objP5);
                }
                Function0 function0 = (Function0) objP5;
                boolean zG4 = (i4 == 16384) | fetVar.g(pz40VarF);
                Object objP6 = fetVar.P();
                if (zG4 || objP6 == obj) {
                    objP6 = new jg2(function4, pz40VarF, b);
                    fetVar.o0(objP6);
                }
                z3 = false;
                G(0, fetVar, a4xVar, function0, (Function1) objP6);
                fetVar.r(false);
            }
            if (function2 == null) {
                fetVar.e0(-1419556287);
                fetVar.r(z3);
            } else {
                fetVar.e0(-1846907456);
                h97.q((i2 >> 9) & 14, fetVar, function2, z3);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mg((byte) 21, i, (wdr) function4, (Object) mm40Var, (Object) nimVar, (Object) function2, z);
        }
    }

    public static final boolean o0(String str, String str2) {
        Integer intOrNull = StringsKt.toIntOrNull(str);
        Integer intOrNull2 = StringsKt.toIntOrNull(str2);
        if (!str.equals("A") || str2.equals("A")) {
            return (str2.equals("A") || intOrNull == null || intOrNull2 == null || intOrNull.intValue() <= intOrNull2.intValue()) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x0078  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:55:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x008f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0092  */
    /* JADX WARN: Code duplicated, block: B:61:0x009b  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ca A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:68:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:77:0x0118  */
    /* JADX WARN: Code duplicated, block: B:78:0x011e  */
    /* JADX WARN: Code duplicated, block: B:81:0x014a  */
    /* JADX WARN: Code duplicated, block: B:84:0x021a  */
    /* JADX WARN: Code duplicated, block: B:87:0x023f  */
    /* JADX WARN: Code duplicated, block: B:90:0x024d  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public static final void p(int i, int i2, fet fetVar, mm40 mm40Var, String str, String str2, String str3) {
        int i3;
        String str4;
        int i4;
        String str5;
        int i5;
        boolean z;
        fet fetVar2;
        mm40 mm40Var2;
        String str6;
        String str7;
        yfe0 yfe0VarU;
        jm40 jm40Var;
        mm40 mm40Var3;
        String str8;
        Object objP;
        cl5 cl5Var;
        cgk0 cgk0Var;
        Object objP2;
        cgk0 cgk0Var2;
        boolean zE;
        Object objP3;
        float f;
        Object objP4;
        Object objP5;
        str.getClass();
        fetVar.g0(-1003705658);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(str) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                str4 = str2;
                i3 |= fetVar.g(str4) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    str5 = str3;
                    if (fetVar.g(str5)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i3 & 1171) != 1170) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i3 & 1, z)) {
                    jm40Var = jm40.b;
                    if (i6 != 0) {
                        mm40Var3 = jm40Var;
                    } else {
                        mm40Var3 = mm40Var;
                    }
                    if (i7 != 0) {
                        str8 = "";
                    } else {
                        str8 = str4;
                    }
                    if (i4 != 0) {
                        str5 = "";
                    }
                    objP = fetVar.P();
                    cl5Var = ukd.f35823a;
                    if (objP == cl5Var) {
                        objP = androidx.compose.runtime.e.b(0);
                        fetVar.o0(objP);
                    }
                    cgk0Var = (cgk0) objP;
                    objP2 = fetVar.P();
                    if (objP2 == cl5Var) {
                        objP2 = androidx.compose.runtime.e.b(0);
                        fetVar.o0(objP2);
                    }
                    cgk0Var2 = (cgk0) objP2;
                    zE = fetVar.e(cgk0Var.l()) | fetVar.e(cgk0Var2.l());
                    objP3 = fetVar.P();
                    if (zE || objP3 == cl5Var) {
                        if (cgk0Var.l() == 0 || cgk0Var2.l() != 0) {
                            zcl zclVar = qmk.f28987a;
                            f = 8.0f;
                        } else {
                            zcl zclVar2 = qmk.f28987a;
                            f = 0.0f;
                        }
                        objP3 = twn.j(f, fetVar);
                    }
                    float f2 = ((ycl) objP3).f42389a;
                    mm40 mm40VarD = o7k0.d(mm40Var3, 1.0f);
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(mm40VarD, 32.0f);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    mm40 mm40Var4 = mm40Var3;
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
                    zx7 zx7Var = gqw0.d;
                    jr8 jr8Var = jr8.f16991a;
                    mm40 mm40VarB = jr8Var.b(jm40Var, zx7Var);
                    objP4 = fetVar.P();
                    if (objP4 == cl5Var) {
                        objP4 = new nw6(cgk0Var, (byte) 12);
                        fetVar.o0(objP4);
                    }
                    mm40 mm40VarY = fre0.Y(mm40VarB, (Function1) objP4);
                    int i8 = i3 >> 3;
                    F(i8 & 112, fetVar, mm40VarY, str8);
                    String str9 = str5;
                    String str10 = str8;
                    int i9 = i3;
                    v8q0.a(str, s5x0.L(o7k0.d(jr8Var.b(jm40Var, gqw0.e), 1.0f), ((ycl) idd.d(new ycl(pkd.e(cgk0Var.l(), fetVar)), new ycl(pkd.e(cgk0Var2.l(), fetVar)))).f42389a + f2, 0.0f, 2), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, i8 & 14, 24960, 109560);
                    fetVar2 = fetVar;
                    mm40 mm40VarB2 = jr8Var.b(jm40Var, gqw0.f);
                    objP5 = fetVar2.P();
                    if (objP5 == cl5Var) {
                        objP5 = new nw6(cgk0Var2, (byte) 13);
                        fetVar2.o0(objP5);
                    }
                    str5 = str9;
                    F((i9 >> 6) & 112, fetVar2, fre0.Y(mm40VarB2, (Function1) objP5), str5);
                    fetVar2.r(true);
                    mm40Var2 = mm40Var4;
                    str6 = str10;
                } else {
                    fetVar2 = fetVar;
                    fetVar2.X();
                    mm40Var2 = mm40Var;
                    str6 = str4;
                }
                str7 = str5;
                yfe0VarU = fetVar2.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new g13((byte) 5, i, i2, mm40Var2, str, str6, str7);
                }
            }
            i3 |= 3072;
            str5 = str3;
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i3 & 1, z)) {
                jm40Var = jm40.b;
                if (i6 != 0) {
                    mm40Var3 = jm40Var;
                } else {
                    mm40Var3 = mm40Var;
                }
                if (i7 != 0) {
                    str8 = "";
                } else {
                    str8 = str4;
                }
                if (i4 != 0) {
                    str5 = "";
                }
                objP = fetVar.P();
                cl5Var = ukd.f35823a;
                if (objP == cl5Var) {
                    objP = androidx.compose.runtime.e.b(0);
                    fetVar.o0(objP);
                }
                cgk0Var = (cgk0) objP;
                objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = androidx.compose.runtime.e.b(0);
                    fetVar.o0(objP2);
                }
                cgk0Var2 = (cgk0) objP2;
                zE = fetVar.e(cgk0Var.l()) | fetVar.e(cgk0Var2.l());
                objP3 = fetVar.P();
                if (zE) {
                    if (cgk0Var.l() == 0) {
                        zcl zclVar4 = qmk.f28987a;
                        f = 8.0f;
                    } else {
                        zcl zclVar5 = qmk.f28987a;
                        f = 8.0f;
                    }
                    objP3 = twn.j(f, fetVar);
                } else {
                    if (cgk0Var.l() == 0) {
                        zcl zclVar6 = qmk.f28987a;
                        f = 8.0f;
                    } else {
                        zcl zclVar7 = qmk.f28987a;
                        f = 8.0f;
                    }
                    objP3 = twn.j(f, fetVar);
                }
                float f3 = ((ycl) objP3).f42389a;
                mm40 mm40VarD2 = o7k0.d(mm40Var3, 1.0f);
                zcl zclVar8 = qmk.f28987a;
                mm40 mm40VarE2 = o7k0.e(mm40VarD2, 32.0f);
                tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
                mm40 mm40Var5 = mm40Var3;
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE2);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC2, gqw0.x);
                jpm0.o(fetVar, bh90VarM2, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode2), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC1, gqw0.v);
                zx7 zx7Var2 = gqw0.d;
                jr8 jr8Var2 = jr8.f16991a;
                mm40 mm40VarB3 = jr8Var2.b(jm40Var, zx7Var2);
                objP4 = fetVar.P();
                if (objP4 == cl5Var) {
                    objP4 = new nw6(cgk0Var, (byte) 12);
                    fetVar.o0(objP4);
                }
                mm40 mm40VarY2 = fre0.Y(mm40VarB3, (Function1) objP4);
                int i10 = i3 >> 3;
                F(i10 & 112, fetVar, mm40VarY2, str8);
                String str11 = str5;
                String str12 = str8;
                int i11 = i3;
                v8q0.a(str, s5x0.L(o7k0.d(jr8Var2.b(jm40Var, gqw0.e), 1.0f), ((ycl) idd.d(new ycl(pkd.e(cgk0Var.l(), fetVar)), new ycl(pkd.e(cgk0Var2.l(), fetVar)))).f42389a + f3, 0.0f, 2), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, i10 & 14, 24960, 109560);
                fetVar2 = fetVar;
                mm40 mm40VarB4 = jr8Var2.b(jm40Var, gqw0.f);
                objP5 = fetVar2.P();
                if (objP5 == cl5Var) {
                    objP5 = new nw6(cgk0Var2, (byte) 13);
                    fetVar2.o0(objP5);
                }
                str5 = str11;
                F((i11 >> 6) & 112, fetVar2, fre0.Y(mm40VarB4, (Function1) objP5), str5);
                fetVar2.r(true);
                mm40Var2 = mm40Var5;
                str6 = str12;
            } else {
                fetVar2 = fetVar;
                fetVar2.X();
                mm40Var2 = mm40Var;
                str6 = str4;
            }
            str7 = str5;
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new g13((byte) 5, i, i2, mm40Var2, str, str6, str7);
            }
        }
        i3 |= 384;
        str4 = str2;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                str5 = str3;
                if (fetVar.g(str5)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i3 & 1, z)) {
                jm40Var = jm40.b;
                if (i6 != 0) {
                    mm40Var3 = jm40Var;
                } else {
                    mm40Var3 = mm40Var;
                }
                if (i7 != 0) {
                    str8 = "";
                } else {
                    str8 = str4;
                }
                if (i4 != 0) {
                    str5 = "";
                }
                objP = fetVar.P();
                cl5Var = ukd.f35823a;
                if (objP == cl5Var) {
                    objP = androidx.compose.runtime.e.b(0);
                    fetVar.o0(objP);
                }
                cgk0Var = (cgk0) objP;
                objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = androidx.compose.runtime.e.b(0);
                    fetVar.o0(objP2);
                }
                cgk0Var2 = (cgk0) objP2;
                zE = fetVar.e(cgk0Var.l()) | fetVar.e(cgk0Var2.l());
                objP3 = fetVar.P();
                if (zE) {
                    if (cgk0Var.l() == 0) {
                        zcl zclVar9 = qmk.f28987a;
                        f = 8.0f;
                    } else {
                        zcl zclVar10 = qmk.f28987a;
                        f = 8.0f;
                    }
                    objP3 = twn.j(f, fetVar);
                } else {
                    if (cgk0Var.l() == 0) {
                        zcl zclVar11 = qmk.f28987a;
                        f = 8.0f;
                    } else {
                        zcl zclVar12 = qmk.f28987a;
                        f = 8.0f;
                    }
                    objP3 = twn.j(f, fetVar);
                }
                float f4 = ((ycl) objP3).f42389a;
                mm40 mm40VarD3 = o7k0.d(mm40Var3, 1.0f);
                zcl zclVar13 = qmk.f28987a;
                mm40 mm40VarE3 = o7k0.e(mm40VarD3, 32.0f);
                tj30 tj30VarC3 = zq8.c(gqw0.f11754a, false);
                mm40 mm40Var6 = mm40Var3;
                int iHashCode3 = Long.hashCode(fetVar.T);
                bh90 bh90VarM3 = fetVar.m();
                mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarE3);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30VarC3, gqw0.x);
                jpm0.o(fetVar, bh90VarM3, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode3), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC2, gqw0.v);
                zx7 zx7Var3 = gqw0.d;
                jr8 jr8Var3 = jr8.f16991a;
                mm40 mm40VarB5 = jr8Var3.b(jm40Var, zx7Var3);
                objP4 = fetVar.P();
                if (objP4 == cl5Var) {
                    objP4 = new nw6(cgk0Var, (byte) 12);
                    fetVar.o0(objP4);
                }
                mm40 mm40VarY3 = fre0.Y(mm40VarB5, (Function1) objP4);
                int i12 = i3 >> 3;
                F(i12 & 112, fetVar, mm40VarY3, str8);
                String str13 = str5;
                String str14 = str8;
                int i13 = i3;
                v8q0.a(str, s5x0.L(o7k0.d(jr8Var3.b(jm40Var, gqw0.e), 1.0f), ((ycl) idd.d(new ycl(pkd.e(cgk0Var.l(), fetVar)), new ycl(pkd.e(cgk0Var2.l(), fetVar)))).f42389a + f4, 0.0f, 2), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, i12 & 14, 24960, 109560);
                fetVar2 = fetVar;
                mm40 mm40VarB6 = jr8Var3.b(jm40Var, gqw0.f);
                objP5 = fetVar2.P();
                if (objP5 == cl5Var) {
                    objP5 = new nw6(cgk0Var2, (byte) 13);
                    fetVar2.o0(objP5);
                }
                str5 = str13;
                F((i13 >> 6) & 112, fetVar2, fre0.Y(mm40VarB6, (Function1) objP5), str5);
                fetVar2.r(true);
                mm40Var2 = mm40Var6;
                str6 = str14;
            } else {
                fetVar2 = fetVar;
                fetVar2.X();
                mm40Var2 = mm40Var;
                str6 = str4;
            }
            str7 = str5;
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new g13((byte) 5, i, i2, mm40Var2, str, str6, str7);
            }
        }
        i3 |= 3072;
        str5 = str3;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i3 & 1, z)) {
            jm40Var = jm40.b;
            if (i6 != 0) {
                mm40Var3 = jm40Var;
            } else {
                mm40Var3 = mm40Var;
            }
            if (i7 != 0) {
                str8 = "";
            } else {
                str8 = str4;
            }
            if (i4 != 0) {
                str5 = "";
            }
            objP = fetVar.P();
            cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.b(0);
                fetVar.o0(objP);
            }
            cgk0Var = (cgk0) objP;
            objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.b(0);
                fetVar.o0(objP2);
            }
            cgk0Var2 = (cgk0) objP2;
            zE = fetVar.e(cgk0Var.l()) | fetVar.e(cgk0Var2.l());
            objP3 = fetVar.P();
            if (zE) {
                if (cgk0Var.l() == 0) {
                    zcl zclVar14 = qmk.f28987a;
                    f = 8.0f;
                } else {
                    zcl zclVar15 = qmk.f28987a;
                    f = 8.0f;
                }
                objP3 = twn.j(f, fetVar);
            } else {
                if (cgk0Var.l() == 0) {
                    zcl zclVar16 = qmk.f28987a;
                    f = 8.0f;
                } else {
                    zcl zclVar17 = qmk.f28987a;
                    f = 8.0f;
                }
                objP3 = twn.j(f, fetVar);
            }
            float f5 = ((ycl) objP3).f42389a;
            mm40 mm40VarD4 = o7k0.d(mm40Var3, 1.0f);
            zcl zclVar18 = qmk.f28987a;
            mm40 mm40VarE4 = o7k0.e(mm40VarD4, 32.0f);
            tj30 tj30VarC4 = zq8.c(gqw0.f11754a, false);
            mm40 mm40Var7 = mm40Var3;
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarE4);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC4, gqw0.x);
            jpm0.o(fetVar, bh90VarM4, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode4), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC3, gqw0.v);
            zx7 zx7Var4 = gqw0.d;
            jr8 jr8Var4 = jr8.f16991a;
            mm40 mm40VarB7 = jr8Var4.b(jm40Var, zx7Var4);
            objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = new nw6(cgk0Var, (byte) 12);
                fetVar.o0(objP4);
            }
            mm40 mm40VarY4 = fre0.Y(mm40VarB7, (Function1) objP4);
            int i14 = i3 >> 3;
            F(i14 & 112, fetVar, mm40VarY4, str8);
            String str15 = str5;
            String str16 = str8;
            int i15 = i3;
            v8q0.a(str, s5x0.L(o7k0.d(jr8Var4.b(jm40Var, gqw0.e), 1.0f), ((ycl) idd.d(new ycl(pkd.e(cgk0Var.l(), fetVar)), new ycl(pkd.e(cgk0Var2.l(), fetVar)))).f42389a + f5, 0.0f, 2), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, i14 & 14, 24960, 109560);
            fetVar2 = fetVar;
            mm40 mm40VarB8 = jr8Var4.b(jm40Var, gqw0.f);
            objP5 = fetVar2.P();
            if (objP5 == cl5Var) {
                objP5 = new nw6(cgk0Var2, (byte) 13);
                fetVar2.o0(objP5);
            }
            str5 = str15;
            F((i15 >> 6) & 112, fetVar2, fre0.Y(mm40VarB8, (Function1) objP5), str5);
            fetVar2.r(true);
            mm40Var2 = mm40Var7;
            str6 = str16;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
            str6 = str4;
        }
        str7 = str5;
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g13((byte) 5, i, i2, mm40Var2, str, str6, str7);
        }
    }

    public static final boolean p0(Context context, Class cls) {
        context.getClass();
        Object systemService = context.getSystemService("activity");
        systemService.getClass();
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) systemService).getRunningServices(Integer.MAX_VALUE);
        runningServices.getClass();
        if (runningServices.isEmpty()) {
            return false;
        }
        Iterator<T> it = runningServices.iterator();
        while (it.hasNext()) {
            if (Intrinsics.d(((ActivityManager.RunningServiceInfo) it.next()).service.getClassName(), cls.getName())) {
                return true;
            }
        }
        return false;
    }

    public static final void q(mm40 mm40Var, fum fumVar, fet fetVar, int i) {
        if (fumVar instanceof aum) {
            fetVar.e0(1456608756);
            c9x.m(mm40Var, (aum) fumVar, fetVar, i & 126);
            fetVar.r(false);
            return;
        }
        if (fumVar instanceof bum) {
            fetVar.e0(1456803033);
            ucx.K(mm40Var, (bum) fumVar, fetVar, i & 126);
            fetVar.r(false);
            return;
        }
        if (fumVar instanceof cum) {
            fetVar.e0(1456992505);
            bdx.J(mm40Var, (cum) fumVar, fetVar, i & 126);
            fetVar.r(false);
        } else if (fumVar instanceof dum) {
            fetVar.e0(1457181977);
            idx.q(mm40Var, (dum) fumVar, fetVar, i & 126);
            fetVar.r(false);
        } else {
            if (!(fumVar instanceof eum)) {
                throw b1j.f(-1199940134, fetVar, false);
            }
            fetVar.e0(1457371449);
            vdx.A(mm40Var, (eum) fumVar, fetVar, i & 126);
            fetVar.r(false);
        }
    }

    public static final boolean q0(Context context) {
        context.getClass();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null) {
            return true;
        }
        return (activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }

    public static final void r(mm40 mm40Var, uym uymVar, fet fetVar, int i) {
        String str = uymVar.f;
        String str2 = uymVar.e;
        fetVar.g0(-1387236753);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(uymVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 8.0f, 0.0f, 2);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
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
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            x7z x7zVarI = ohs0.i(fetVar, mm40VarC1, shdVar4, 1.0f, true);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, x7zVarI);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            C(s5x0.N(jm40Var, 0.0f, 22.0f, 0.0f, 0.0f, 13), uymVar.f36496a, fetVar, 0);
            C(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), uymVar.b, fetVar, 0);
            fetVar.r(true);
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 26.0f, 0.0f, 0.0f, 13);
            q6x q6xVar = q6x.f28221a;
            y(0, fetVar, mm40VarN);
            fetVar.e0(-117576181);
            fetVar.r(false);
            fetVar.e0(-117275605);
            fetVar.r(false);
            E(s5x0.N(jm40Var, 0.0f, 6.0f, 0.0f, 0.0f, 13), uymVar.c, true, fetVar, 3072);
            fetVar.r(true);
            if (str2.length() <= 0 && str.length() <= 0 && uymVar.d.length() <= 0) {
                fetVar.e0(292935869);
                fetVar.r(false);
            } else {
                fetVar.e0(292712917);
                p(6, 0, fetVar, jm40Var, uymVar.d, str2, str);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wvm(mm40Var, uymVar, i, (byte) 25);
        }
    }

    public static final void r0(Fragment fragment, String str, Function1 function1) {
        fragment.getClass();
        fragment.C().u0(str, fragment, new kto((byte) 0, str, function1));
    }

    public static final void s(mm40 mm40Var, final mao maoVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        maoVar.getClass();
        fetVar2.g0(109122242);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(maoVar) ? 32 : 16);
        final byte b = 0;
        final byte b2 = 1;
        if (!fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar2.X();
        } else if (maoVar.c.length() > 0) {
            fetVar2.e0(-429347539);
            hmw0.j(mm40Var, u1c.M(-1042976275, new Function2() { // from class: a.lao
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = b;
                    mao maoVar2 = maoVar;
                    switch (b3) {
                        case 0:
                            fet fetVar3 = (fet) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                v8q0.a(maoVar2.b, null, ((ThemeColors) fetVar3.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar3, 0, 24960, 110586);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        default:
                            fet fetVar4 = (fet) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                y9a.h(null, maoVar2.c, maoVar2.d, ((ThemeColors) fetVar4.k(zaq0.b)).getPrimary(), 0L, 0L, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar4, 3072, 97);
                            } else {
                                fetVar4.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar2), u1c.M(1983320942, new Function2() { // from class: a.lao
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = b2;
                    mao maoVar2 = maoVar;
                    switch (b3) {
                        case 0:
                            fet fetVar3 = (fet) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                v8q0.a(maoVar2.b, null, ((ThemeColors) fetVar3.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar3, 0, 24960, 110586);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        default:
                            fet fetVar4 = (fet) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                y9a.h(null, maoVar2.c, maoVar2.d, ((ThemeColors) fetVar4.k(zaq0.b)).getPrimary(), 0L, 0L, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar4, 3072, 97);
                            } else {
                                fetVar4.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar2), fetVar2, (i2 & 14) | 432);
            fetVar2.r(false);
        } else {
            fetVar2.e0(-428567331);
            v8q0.a(maoVar.b, mm40Var, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, (i2 << 3) & 112, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fun(mm40Var, maoVar, i, (byte) 15);
        }
    }

    public static final void s0(Fragment fragment, String str, Function1 function1) {
        fragment.getClass();
        fragment.C().u0(str, fragment, new kto((byte) 2, str, function1));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void t(mm40 mm40Var, l7m0 l7m0Var, Function0 function0, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, ugd ugdVar4, ugd ugdVar5, ugd ugdVar6, fet fetVar, int i) {
        ugd ugdVar7;
        ugd ugdVar8;
        ugd ugdVar9;
        ugd ugdVar10;
        Object obj;
        Object obj2;
        Object obj3;
        final t33 t33Var;
        Object obj4;
        Object obj5;
        Object atjVar;
        ix7 ix7Var;
        pz40 pz40Var;
        t33 t33Var2;
        yj50 yj50Var;
        ugd ugdVar11 = ahy.b;
        l7m0Var.getClass();
        fetVar.g0(-827053766);
        int i2 = i | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        int i3 = 0;
        if (fetVar.U(i2 & 1, (306783379 & i2) != 306783378)) {
            Configuration configuration = (Configuration) fetVar.k(dy2.f6873a);
            Activity activityS = j120.S((Context) fetVar.k(dy2.b));
            int iU = activityS != null ? j120.U(activityS) : 0;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            int i4 = 2;
            Object obj6 = objP;
            if (objP == cl5Var) {
                Object xczVar = new xcz(((Number) function0.invoke()).intValue(), i4, i3);
                fetVar.o0(xczVar);
                obj6 = xczVar;
            }
            xcz xczVar2 = (xcz) obj6;
            zcl zclVar = qmk.f28987a;
            final float fB = pkd.b(24.0f, fetVar);
            final float fB2 = pkd.b(96.0f, fetVar);
            float f = (configuration.smallestScreenWidthDp - (qmk.a(fetVar).d + qmk.a(fetVar).d)) * 0.5625f;
            Object objP2 = fetVar.P();
            Object obj7 = objP2;
            if (objP2 == cl5Var) {
                Object objA = androidx.compose.runtime.e.a(0.0f);
                fetVar.o0(objA);
                obj7 = objA;
            }
            agk0 agk0Var = (agk0) obj7;
            agk0Var.m(pkd.b(((ycl) l1e0.h(new ycl(f), new ycl(210.0f), new ycl(344.0f))).f42389a, fetVar));
            float fB3 = pkd.b(56.0f, fetVar);
            float fB4 = pkd.b(12.0f, fetVar);
            Object objP3 = fetVar.P();
            Object obj8 = objP3;
            if (objP3 == cl5Var) {
                Object objE = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objE);
                obj8 = objE;
            }
            pz40 pz40Var2 = (pz40) obj8;
            Object[] objArr = new Object[0];
            Object objP4 = fetVar.P();
            Object obj9 = objP4;
            if (objP4 == cl5Var) {
                Object s9rVar = new s9r((byte) 21);
                fetVar.o0(s9rVar);
                obj9 = s9rVar;
            }
            agk0 agk0Var2 = (agk0) e9x.Q(objArr, (Function0) obj9, fetVar, 48);
            Object objP5 = fetVar.P();
            Object obj10 = objP5;
            if (objP5 == cl5Var) {
                Object objE2 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objE2);
                obj10 = objE2;
            }
            pz40 pz40Var3 = (pz40) obj10;
            Object objP6 = fetVar.P();
            Object obj11 = objP6;
            if (objP6 == cl5Var) {
                Object objE3 = androidx.compose.runtime.e.e(null);
                fetVar.o0(objE3);
                obj11 = objE3;
            }
            pz40 pz40Var4 = (pz40) obj11;
            Object objP7 = fetVar.P();
            Object obj12 = objP7;
            if (objP7 == cl5Var) {
                Object objC = xf0.c(0.0f);
                fetVar.o0(objC);
                obj12 = objC;
            }
            final t33 t33Var3 = (t33) obj12;
            Object objP8 = fetVar.P();
            Object obj13 = objP8;
            if (objP8 == cl5Var) {
                Object objC2 = xf0.c(((Boolean) l7m0Var.getValue()).booleanValue() ? 1.0f : 0.0f);
                fetVar.o0(objC2);
                obj13 = objC2;
            }
            final t33 t33Var4 = (t33) obj13;
            final float fB5 = pkd.b(12.0f, fetVar);
            Object objP9 = fetVar.P();
            if (objP9 == cl5Var) {
                final byte b = 1;
                Object objB = jgk0.b(new Function0() { // from class: a.enr
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b2 = b;
                        t33 t33Var5 = t33Var3;
                        float f2 = fB5;
                        switch (b2) {
                            case 0:
                                return Float.valueOf(l1e0.c(((Number) t33Var5.d()).floatValue() * f2, 0.0f, f2));
                            case 1:
                                return Integer.valueOf(Math.round(l1e0.c((1.0f - ((Number) t33Var5.d()).floatValue()) * f2, 0.0f, f2)));
                            default:
                                return Integer.valueOf(Math.round(((Number) t33Var5.d()).floatValue() * f2));
                        }
                    }
                });
                fetVar.o0(objB);
                obj = objB;
            } else {
                obj = objP9;
            }
            l7m0 l7m0Var2 = (l7m0) obj;
            Object objP10 = fetVar.P();
            Object obj14 = objP10;
            if (objP10 == cl5Var) {
                Object objB2 = jgk0.b(new gmo(t33Var3, t33Var4, (byte) 18));
                fetVar.o0(objB2);
                obj14 = objB2;
            }
            l7m0 l7m0Var3 = (l7m0) obj14;
            Object objP11 = fetVar.P();
            if (objP11 == cl5Var) {
                Object objB3 = jgk0.b(new fu7(t33Var3, (byte) 10));
                fetVar.o0(objB3);
                obj2 = objB3;
            } else {
                obj2 = objP11;
            }
            l7m0 l7m0Var4 = (l7m0) obj2;
            Object objP12 = fetVar.P();
            if (objP12 == cl5Var) {
                Object objB4 = jgk0.b(new fu7(t33Var3, (byte) 11));
                fetVar.o0(objB4);
                obj3 = objB4;
            } else {
                obj3 = objP12;
            }
            l7m0 l7m0Var5 = (l7m0) obj3;
            boolean zE = fetVar.e(iU) | fetVar.d(fB3) | fetVar.d(fB4);
            Object objP13 = fetVar.P();
            if (zE || objP13 == cl5Var) {
                objP13 = new swb(t33Var3, agk0Var, iU, fB3, fB4, t33Var4);
                t33Var = t33Var3;
                fetVar.o0(objP13);
            } else {
                t33Var = t33Var3;
            }
            Function1 function1 = (Function1) objP13;
            float fL = agk0Var.l() - fB2;
            Object objP14 = fetVar.P();
            if (objP14 == cl5Var) {
                final byte b2 = 2;
                Object objB5 = jgk0.b(new Function0() { // from class: a.enr
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = b2;
                        t33 t33Var5 = t33Var;
                        float f2 = fB2;
                        switch (b3) {
                            case 0:
                                return Float.valueOf(l1e0.c(((Number) t33Var5.d()).floatValue() * f2, 0.0f, f2));
                            case 1:
                                return Integer.valueOf(Math.round(l1e0.c((1.0f - ((Number) t33Var5.d()).floatValue()) * f2, 0.0f, f2)));
                            default:
                                return Integer.valueOf(Math.round(((Number) t33Var5.d()).floatValue() * f2));
                        }
                    }
                });
                fetVar.o0(objB5);
                obj4 = objB5;
            } else {
                obj4 = objP14;
            }
            l7m0 l7m0Var6 = (l7m0) obj4;
            Object objP15 = fetVar.P();
            if (objP15 == cl5Var) {
                final byte b3 = 0;
                Object objB6 = jgk0.b(new Function0() { // from class: a.enr
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b4 = b3;
                        t33 t33Var5 = t33Var4;
                        float f2 = fB;
                        switch (b4) {
                            case 0:
                                return Float.valueOf(l1e0.c(((Number) t33Var5.d()).floatValue() * f2, 0.0f, f2));
                            case 1:
                                return Integer.valueOf(Math.round(l1e0.c((1.0f - ((Number) t33Var5.d()).floatValue()) * f2, 0.0f, f2)));
                            default:
                                return Integer.valueOf(Math.round(((Number) t33Var5.d()).floatValue() * f2));
                        }
                    }
                });
                fetVar.o0(objB6);
                obj5 = objB6;
            } else {
                obj5 = objP15;
            }
            l7m0 l7m0Var7 = (l7m0) obj5;
            Object objP16 = fetVar.P();
            Object obj15 = objP16;
            if (objP16 == cl5Var) {
                Object ix7Var2 = new ix7(xczVar2, fL, agk0Var2, pz40Var4);
                fetVar.o0(ix7Var2);
                obj15 = ix7Var2;
            }
            ix7 ix7Var3 = (ix7) obj15;
            Object value = l7m0Var.getValue();
            boolean zI = fetVar.i(t33Var4) | ((i2 & 112) == 32);
            Object objP17 = fetVar.P();
            if (zI || objP17 == cl5Var) {
                ix7Var = ix7Var3;
                pz40Var = pz40Var2;
                t33Var2 = t33Var;
                yj50Var = null;
                atjVar = new atj(t33Var4, l7m0Var, pz40Var, false ? 1 : 0, (byte) 6);
                fetVar.o0(atjVar);
            } else {
                t33 t33Var5 = t33Var;
                atjVar = objP17;
                t33Var2 = t33Var5;
                ix7Var = ix7Var3;
                pz40Var = pz40Var2;
                yj50Var = null;
            }
            m0x0.t(fetVar, value, (Function2) atjVar);
            Unit unit = Unit.f46060a;
            boolean zG = fetVar.g(agk0Var2) | fetVar.d(fL) | fetVar.i(t33Var2);
            Object objP18 = fetVar.P();
            if (zG || objP18 == cl5Var) {
                objP18 = new hnr(pz40Var3, agk0Var2, fL, t33Var2, pz40Var4, (yje) null);
                fetVar.o0(objP18);
            }
            m0x0.t(fetVar, unit, (Function2) objP18);
            mm40 mm40VarE0 = o2e.e0(mm40Var, "GAME_ADVANCED_SCREEN_LAYOUT");
            boolean zE2 = fetVar.e(iU) | fetVar.g(function1);
            Object objP19 = fetVar.P();
            Object obj16 = objP19;
            if (zE2 || objP19 == cl5Var) {
                Object jnrVar = new jnr(function1, l7m0Var6, l7m0Var2, iU);
                fetVar.o0(jnrVar);
                obj16 = jnrVar;
            }
            tj30 tj30Var = (tj30) obj16;
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
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            ugdVar8 = ugdVar4;
            ugdVar8.F(new s40("BACKGROUND_ID"), fetVar, 48);
            ugdVar9 = ugdVar5;
            ugdVar9.F(new s40("TOOLBAR_ID"), fetVar, 48);
            ugdVar7 = ugdVar2;
            ugdVar7.F(epv0.N(new s40("COMPRESSED_CARD_ID"), ((Number) l7m0Var5.getValue()).floatValue()), fetVar, 48);
            Object objN = epv0.N(new s40("CARDS_ID"), ((Number) l7m0Var4.getValue()).floatValue());
            Object objP20 = fetVar.P();
            Object obj17 = objP20;
            if (objP20 == cl5Var) {
                Object ripVar = new rip(pz40Var, (byte) 1);
                fetVar.o0(ripVar);
                obj17 = ripVar;
            }
            ugdVar.O(objN, xczVar2, (Function0) obj17, fetVar, 3504);
            ugdVar11.j(epv0.N(new s40("INDICATOR_ID"), ((Number) l7m0Var3.getValue()).floatValue()), xczVar2, fetVar, 432);
            ugdVar10 = ugdVar6;
            ugdVar10.F(new s40("SIMULATION"), fetVar, 48);
            s40 s40Var = new s40("BETTING_ID");
            Object objP21 = fetVar.P();
            Object obj18 = objP21;
            if (objP21 == cl5Var) {
                Object ufpVar = new ufp(l7m0Var7, (byte) 3);
                fetVar.o0(ufpVar);
                obj18 = ufpVar;
            }
            mm40 mm40VarT = i4w0.T(s40Var, (Function1) obj18);
            mm40 mm40VarV = cjx.V(jm40.b, ix7Var, yj50Var);
            Object objP22 = fetVar.P();
            if (objP22 == cl5Var) {
                objP22 = new wil(pz40Var3, (byte) 24);
                fetVar.o0(objP22);
            }
            ugdVar3.O(mm40VarT, mm40VarV, (Function1) objP22, fetVar, 3456);
            fetVar.r(true);
        } else {
            ugdVar7 = ugdVar2;
            ugdVar8 = ugdVar4;
            ugdVar9 = ugdVar5;
            ugdVar10 = ugdVar6;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j0a0(mm40Var, l7m0Var, function0, ugdVar, ugdVar7, ugdVar3, ugdVar8, ugdVar9, ugdVar10, i, (byte) 3);
        }
    }

    public static final void t0(Fragment fragment, String str, Function1 function1) {
        fragment.getClass();
        fragment.C().u0(str, fragment, new kto((byte) 1, str, function1));
    }

    public static final void u(int i, long j, fet fetVar, mm40 mm40Var, y9q0 y9q0Var, String str) {
        str.getClass();
        tj30 tj30VarC = zq8.c(gqw0.e, false);
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
        jpm0.o(fetVar, tj30VarC, gqw0.x);
        jpm0.o(fetVar, bh90VarM, gqw0.w);
        jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
        jpm0.n(fetVar);
        jpm0.o(fetVar, mm40VarC0, gqw0.v);
        v8q0.a(str, null, j, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, y9q0Var, fetVar, (i >> 3) & 910, ((i << 15) & 29360128) | 24960, 109562);
        fetVar.r(true);
    }

    public static final PendingIntent u0(Context context, Uri uri) {
        uri.getClass();
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent.setDataAndType(uri, "image/*");
        intent.addFlags(268468225);
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, rsr0.e0(0));
        activity.getClass();
        return activity;
    }

    public static final void v(mm40 mm40Var, a4x a4xVar, xcz xczVar, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(1710216114);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(w6m.f38630a) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(a4xVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(xczVar) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = CollectionsKt.K(a4xVar, 2);
                fetVar.o0(objP);
            }
            List list = (List) objP;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 8.0f, 0.0f, 11);
            qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
            boolean zI = fetVar.i(list) | ((i2 & 112) == 32);
            Object objP2 = fetVar.P();
            if (zI || objP2 == obj) {
                objP2 = new gg4(list, (byte) 4);
                fetVar.o0(objP2);
            }
            int i3 = (i2 >> 6) & 112;
            mm40Var2 = jm40Var;
            b8k0.f(mm40VarC, xczVar, lh80VarU, false, qw3Var, null, null, false, null, (Function1) objP2, fetVar, i3, Response.NOT_ACCEPTABLE_HERE);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t6m(mm40Var2, a4xVar, xczVar, i, (byte) 0);
        }
    }

    public static final boolean v0(Context context, File file, String str) {
        file.getClass();
        str.getClass();
        Uri uriC = FileProvider.c(context, file, str.concat(".provider"));
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent.setDataAndType(uriC, "application/pdf");
        intent.addFlags(1);
        try {
            context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    public static final void w(int i, fet fetVar, mm40 mm40Var, Function0 function0, boolean z) {
        mm40 mm40Var2;
        function0.getClass();
        fetVar.g0(-2098598091);
        int i2 = i | 6 | (fetVar.h(z) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new h7w(b);
                fetVar.o0(objP);
            }
            Function1 function1 = (Function1) objP;
            boolean z2 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new dd(z, function0, (byte) 2);
                fetVar.o0(objP2);
            }
            mm40Var2 = jm40.b;
            dwi0.b(function1, mm40Var2, (Function1) objP2, fetVar, 54, 0);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a5a(mm40Var2, z, function0, i, (byte) 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.jvm.functions.Function2] */
    public static final Object w0(yje yjeVar, zdg0 zdg0Var, Function2 function2, boolean z, boolean z2) {
        jyh jyhVar;
        ?? r13;
        if (yjeVar instanceof jyh) {
            jyhVar = (jyh) yjeVar;
            int i = jyhVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                jyhVar.n = i - Integer.MIN_VALUE;
            } else {
                jyhVar = new jyh(yjeVar);
            }
        } else {
            jyhVar = new jyh(yjeVar);
        }
        Object objL = jyhVar.m;
        Object obj = wne.f39444a;
        int i2 = jyhVar.n;
        if (i2 == 0) {
            z1x.P(objL);
            jyhVar.i = zdg0Var;
            jyhVar.j = (bnn0) function2;
            jyhVar.k = z;
            jyhVar.l = z2;
            jyhVar.n = 1;
            objL = f7k.L(zdg0Var, jyhVar);
            r13 = function2;
            if (objL != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(objL);
                return objL;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z2 = jyhVar.l;
        z = jyhVar.k;
        Function2 function3 = (Function2) jyhVar.j;
        zdg0Var = jyhVar.i;
        z1x.P(objL);
        r13 = function3;
        mu3 mu3Var = new mu3((yje) null, zdg0Var, (Function2) r13, z, z2);
        jyhVar.i = null;
        jyhVar.j = null;
        jyhVar.n = 2;
        Object objD0 = qjj.d0((CoroutineContext) objL, mu3Var, jyhVar);
        return objD0 == obj ? obj : objD0;
    }

    public static final void x(p3w p3wVar, fet fetVar, int i) {
        int i2;
        zfn zfnVar;
        zfn zfnVar2;
        zx7 zx7Var = gqw0.e;
        fetVar.g0(937427668);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(p3wVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
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
            tvw tvwVar = p3wVar.k;
            boolean zEquals = tvwVar.equals(qvw.f29409a);
            jr8 jr8Var = jr8.f16991a;
            if (zEquals) {
                fetVar.e0(171768616);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarB = jr8Var.b(o7k0.n(jm40Var, 24.0f), zx7Var);
                pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_category_new, 0, fetVar);
                zfn zfnVar3 = zaq0.b;
                zfnVar = zfnVar3;
                j0x.b(pm80VarF, null, mm40VarB, null, null, 0.0f, new m78(((ThemeColors) fetVar.k(zfnVar3)).getSecondary(), 5), fetVar, 56, 56);
                fetVar.r(false);
            } else {
                if (tvwVar instanceof rvw) {
                    fetVar.e0(172219635);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarB2 = jr8Var.b(o7k0.n(jm40Var, 24.0f), zx7Var);
                    String str = ((rvw) tvwVar).f31190a;
                    zfn zfnVar4 = zaq0.b;
                    lgb.s(mm40VarB2, str, ((ThemeColors) fetVar.k(zfnVar4)).getSecondary(), fetVar);
                    fetVar.r(false);
                    zfnVar2 = zfnVar4;
                } else {
                    if (!(tvwVar instanceof svw)) {
                        throw b1j.f(-1102840186, fetVar, false);
                    }
                    fetVar.e0(172658626);
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarB3 = jr8Var.b(o7k0.n(jm40Var, 24.0f), zx7Var);
                    pm80 pm80VarF2 = a8k0.F(((svw) tvwVar).f32891a, 0, fetVar);
                    zfn zfnVar5 = zaq0.b;
                    zfnVar = zfnVar5;
                    j0x.b(pm80VarF2, null, mm40VarB3, null, null, 0.0f, new m78(((ThemeColors) fetVar.k(zfnVar5)).getSecondary(), 5), fetVar, 56, 56);
                    fetVar.r(false);
                }
                j0x.b(a8k0.F(p3wVar.q, 0, fetVar), null, i120.Q(ffb0.Q(o7k0.n(jr8Var.b(jm40Var, gqw0.i), 16.0f), 4.0f, 4.0f), ((ThemeColors) fetVar.k(zfnVar2)).getBackgroundContent(), vgg0.f37379a), null, null, 0.0f, null, fetVar, 56, 120);
                fetVar.r(true);
            }
            zfnVar2 = zfnVar;
            j0x.b(a8k0.F(p3wVar.q, 0, fetVar), null, i120.Q(ffb0.Q(o7k0.n(jr8Var.b(jm40Var, gqw0.i), 16.0f), 4.0f, 4.0f), ((ThemeColors) fetVar.k(zfnVar2)).getBackgroundContent(), vgg0.f37379a), null, null, 0.0f, null, fetVar, 56, 120);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pcd(p3wVar, i, b);
        }
    }

    public static final void x0(TextView textView) {
        SpannableString spannableString = new SpannableString(textView.getText());
        Object[] spans = spannableString.getSpans(0, spannableString.length(), URLSpan.class);
        spans.getClass();
        for (URLSpan uRLSpan : (URLSpan[]) spans) {
            spannableString.setSpan(new ExtensionsKt$removeLinksUnderline$1(uRLSpan.getURL()), spannableString.getSpanStart(uRLSpan), spannableString.getSpanEnd(uRLSpan), 0);
        }
        textView.setText(spannableString);
    }

    public static final void y(int i, fet fetVar, mm40 mm40Var) {
        q6x q6xVar = q6x.f28221a;
        fetVar.g0(656185763);
        byte b = 16;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.e(2) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(o7k0.s(mm40Var, 28.0f), 8.0f, 0.0f, 6.0f, 0.0f, 10);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
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
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = null;
                fetVar.o0(null);
            }
            mm40 mm40Var2 = (mm40) objP;
            if (mm40Var2 == null) {
                fetVar.e0(1764799032);
                fetVar.r(false);
            } else {
                fetVar.e0(1764799033);
                srm.a(0, fetVar, o7k0.e(mm40Var2, 24.0f));
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xml(mm40Var, i, b);
        }
    }

    public static final List y0(List list) {
        Object g0g0Var;
        list.getClass();
        try {
            e0g0 e0g0Var = j0g0.b;
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            g0g0Var = CollectionsKt.L0(arrayList);
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Object obj = iun.f15405a;
        if (g0g0Var instanceof g0g0) {
            g0g0Var = obj;
        }
        return (List) g0g0Var;
    }

    public static final void z(mm40 mm40Var, g0d g0dVar, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1987328758);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(g0dVar) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            String str = g0dVar.f10453a;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarG = g1t0.g();
            StaticColors staticColors = StaticColors.INSTANCE;
            y9q0 y9q0VarA = y9q0.a(y9q0VarG, staticColors.m131getWhite800d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214);
            long j = qmk.q;
            long j2 = g1t0.l().f42262a.b;
            long j3 = qmk.n;
            n05 n05Var = new n05(j, j2, j3);
            jm40 jm40Var = jm40.b;
            aad.e(str, jm40Var, y9q0VarA, null, 2, false, 1, 0, null, n05Var, fetVar2, 1597488, 424);
            mm40 mm40VarE0 = o2e.e0(s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), "ON_COEF_CHANGE_SETTING_STATE_TEXT");
            String str2 = g0dVar.b;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            fetVar2 = fetVar2;
            aad.e(str2, mm40VarE0, y9q0.a(g1t0.d(), staticColors.m123getWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), null, 2, false, 1, 0, null, new n05(j, g1t0.l().f42262a.b, j3), fetVar2, 1597440, 424);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zma(mm40Var, g0dVar, i, (byte) 2);
        }
    }

    public static final Uri z0(File file, Context context, String str, String str2) throws FileNotFoundException {
        Uri uriC;
        str.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        if (Build.VERSION.SDK_INT >= 29) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", str2);
            contentValues.put("mime_type", "image/*");
            contentValues.put("relative_path", str);
            uriC = contentResolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
        } else {
            uriC = FileProvider.c(context, new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), str2), "org.xbet.client1.provider");
        }
        if (uriC == null) {
            return null;
        }
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriC);
        if (outputStreamOpenOutputStream != null) {
            try {
                outputStreamOpenOutputStream.write(i0q.a(file));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    bkb.E(outputStreamOpenOutputStream, th);
                    throw th2;
                }
            }
        }
        bkb.E(outputStreamOpenOutputStream, null);
        return uriC;
    }

    public final void M(xpg0 xpg0Var, Object obj) {
        switch (this.f32288a) {
            case 0:
                oj3 oj3Var = (oj3) obj;
                xpg0Var.getClass();
                oj3Var.getClass();
                xpg0Var.z(1, oj3Var.f25341a);
                xpg0Var.z(2, oj3Var.b);
                xpg0Var.z(3, oj3Var.c);
                break;
            case 1:
                pu6 pu6Var = (pu6) obj;
                xpg0Var.getClass();
                pu6Var.getClass();
                xpg0Var.o(1, pu6Var.f27599a);
                xpg0Var.o(2, pu6Var.b);
                xpg0Var.o(3, pu6Var.c);
                xpg0Var.o(4, pu6Var.d);
                xpg0Var.o(5, pu6Var.e);
                xpg0Var.z(6, pu6Var.f);
                xpg0Var.z(7, pu6Var.g);
                xpg0Var.z(8, pu6Var.h);
                xpg0Var.z(9, pu6Var.i);
                xpg0Var.z(10, pu6Var.j);
                xpg0Var.z(11, pu6Var.k);
                xpg0Var.z(12, pu6Var.l);
                xpg0Var.z(13, pu6Var.m);
                xpg0Var.o(14, pu6Var.n);
                xpg0Var.z(15, pu6Var.o);
                xpg0Var.p(pu6Var.p, 16);
                xpg0Var.o(17, pu6Var.q);
                xpg0Var.z(18, pu6Var.r);
                xpg0Var.z(19, pu6Var.s);
                xpg0Var.z(20, pu6Var.t);
                xpg0Var.o(21, pu6Var.u.f34306a);
                xpg0Var.o(22, pu6Var.v);
                xpg0Var.z(23, pu6Var.w);
                xpg0Var.o(24, pu6Var.x);
                xpg0Var.z(25, pu6Var.y);
                xpg0Var.z(26, pu6Var.z);
                xpg0Var.z(27, pu6Var.A);
                xpg0Var.z(28, pu6Var.B);
                xpg0Var.o(29, pu6Var.C);
                xpg0Var.z(30, pu6Var.D);
                xpg0Var.z(31, pu6Var.E);
                xpg0Var.o(32, pu6Var.F);
                xpg0Var.p(pu6Var.G, 33);
                xpg0Var.z(34, pu6Var.H);
                xpg0Var.o(35, pu6Var.I);
                xpg0Var.o(36, pu6Var.J);
                xpg0Var.o(37, pu6Var.K);
                xpg0Var.o(38, pu6Var.L);
                xpg0Var.o(39, pu6Var.M);
                break;
            case 2:
                oqe oqeVar = (oqe) obj;
                xpg0Var.getClass();
                oqeVar.getClass();
                xpg0Var.o(1, oqeVar.f25683a);
                xpg0Var.z(2, oqeVar.b);
                xpg0Var.o(3, oqeVar.c);
                xpg0Var.z(4, oqeVar.d);
                xpg0Var.o(5, oqeVar.e);
                xpg0Var.z(6, oqeVar.f);
                xpg0Var.o(7, oqeVar.g);
                xpg0Var.o(8, oqeVar.h);
                xpg0Var.z(9, oqeVar.i);
                break;
            case 3:
                skt sktVar = (skt) obj;
                xpg0Var.getClass();
                sktVar.getClass();
                xpg0Var.o(1, sktVar.f32368a);
                xpg0Var.z(2, sktVar.b);
                xpg0Var.o(3, sktVar.c);
                xpg0Var.z(4, sktVar.d);
                xpg0Var.o(5, sktVar.e);
                xpg0Var.z(6, sktVar.f);
                break;
            case 4:
                tuf tufVar = (tuf) obj;
                xpg0Var.getClass();
                tufVar.getClass();
                xpg0Var.o(1, tufVar.f34547a);
                xpg0Var.z(2, tufVar.b);
                xpg0Var.z(3, tufVar.c);
                xpg0Var.o(4, tufVar.d ? 1L : 0L);
                xpg0Var.p(tufVar.e, 5);
                xpg0Var.z(6, tufVar.f);
                xpg0Var.p(tufVar.g, 7);
                xpg0Var.p(tufVar.h, 8);
                xpg0Var.p(tufVar.i, 9);
                xpg0Var.o(10, tufVar.j);
                xpg0Var.o(11, tufVar.k ? 1L : 0L);
                xpg0Var.o(12, tufVar.l ? 1L : 0L);
                xpg0Var.p(tufVar.m, 13);
                xpg0Var.p(tufVar.n, 14);
                break;
            case 5:
                obo oboVar = (obo) obj;
                xpg0Var.getClass();
                oboVar.getClass();
                xpg0Var.o(1, oboVar.f24991a);
                xpg0Var.z(2, oboVar.b);
                xpg0Var.o(3, oboVar.c);
                xpg0Var.o(4, oboVar.d);
                break;
            case 6:
                rco rcoVar = (rco) obj;
                xpg0Var.getClass();
                rcoVar.getClass();
                xpg0Var.o(1, rcoVar.f30249a);
                xpg0Var.z(2, rcoVar.b);
                xpg0Var.o(3, rcoVar.c);
                xpg0Var.o(4, rcoVar.d);
                xpg0Var.o(5, rcoVar.e ? 1L : 0L);
                break;
            case 7:
                hxy hxyVar = (hxy) obj;
                xpg0Var.getClass();
                hxyVar.getClass();
                xpg0Var.o(1, hxyVar.f13835a);
                xpg0Var.o(2, hxyVar.b);
                xpg0Var.o(3, hxyVar.c);
                break;
            case 8:
                ut20 ut20Var = (ut20) obj;
                xpg0Var.getClass();
                ut20Var.getClass();
                xpg0Var.o(1, ut20Var.f36237a);
                xpg0Var.o(2, ut20Var.b ? 1L : 0L);
                xpg0Var.o(3, ut20Var.c);
                break;
            case 9:
                un50 un50Var = (un50) obj;
                xpg0Var.getClass();
                un50Var.getClass();
                xpg0Var.o(1, un50Var.f35944a);
                break;
            case 10:
                rr50 rr50Var = (rr50) obj;
                xpg0Var.getClass();
                rr50Var.getClass();
                xpg0Var.o(1, rr50Var.f30965a);
                break;
            case 11:
                ind0 ind0Var = (ind0) obj;
                xpg0Var.getClass();
                ind0Var.getClass();
                xpg0Var.o(1, ind0Var.f15069a);
                xpg0Var.p(ind0Var.b, 2);
                xpg0Var.p(ind0Var.c, 3);
                xpg0Var.p(ind0Var.d, 4);
                break;
            case 12:
                fze0 fze0Var = (fze0) obj;
                xpg0Var.getClass();
                fze0Var.getClass();
                xpg0Var.o(1, fze0Var.f10404a);
                xpg0Var.o(2, fze0Var.b);
                xpg0Var.z(3, fze0Var.c);
                xpg0Var.o(4, fze0Var.d ? 1L : 0L);
                xpg0Var.o(5, fze0Var.e ? 1L : 0L);
                String str = fze0Var.f;
                if (str != null) {
                    xpg0Var.z(6, str);
                } else {
                    xpg0Var.s(6);
                }
                break;
            case 13:
                h5l0 h5l0Var = (h5l0) obj;
                xpg0Var.getClass();
                h5l0Var.getClass();
                xpg0Var.o(1, h5l0Var.f12486a);
                xpg0Var.z(2, h5l0Var.b);
                xpg0Var.z(3, h5l0Var.c);
                xpg0Var.z(4, h5l0Var.d);
                xpg0Var.o(5, h5l0Var.e ? 1L : 0L);
                xpg0Var.z(6, h5l0Var.f);
                xpg0Var.z(7, h5l0Var.g);
                xpg0Var.z(8, h5l0Var.h);
                xpg0Var.z(9, h5l0Var.i);
                xpg0Var.z(10, h5l0Var.j);
                xpg0Var.z(11, h5l0Var.k);
                xpg0Var.z(12, h5l0Var.l);
                xpg0Var.z(13, h5l0Var.m);
                xpg0Var.z(14, h5l0Var.n);
                xpg0Var.z(15, h5l0Var.o);
                xpg0Var.z(16, h5l0Var.p);
                xpg0Var.z(17, h5l0Var.q);
                xpg0Var.z(18, h5l0Var.r);
                xpg0Var.z(19, h5l0Var.s);
                xpg0Var.z(20, h5l0Var.t);
                xpg0Var.z(21, h5l0Var.u);
                xpg0Var.z(22, h5l0Var.v);
                xpg0Var.z(23, h5l0Var.w);
                xpg0Var.z(24, h5l0Var.x);
                break;
            default:
                scm0 scm0Var = (scm0) obj;
                xpg0Var.getClass();
                scm0Var.getClass();
                xpg0Var.o(1, scm0Var.f31993a);
                xpg0Var.o(2, scm0Var.b);
                xpg0Var.o(3, scm0Var.c);
                xpg0Var.z(4, scm0Var.d);
                break;
        }
    }

    public final String Q() {
        switch (this.f32288a) {
            case 0:
                return "INSERT OR REPLACE INTO `strings` (`locale`,`key`,`value`) VALUES (?,?,?)";
            case 1:
                return "INSERT OR IGNORE INTO `bet_events` (`id`,`game_id`,`main_game_id`,`player_id`,`sport_id`,`player_name`,`game_match_name`,`first_opponent_first_img`,`first_opponent_second_img`,`second_opponent_first_img`,`second_opponent_second_img`,`group_name`,`champ_name`,`express_number`,`coefficient`,`param`,`time_start`,`vid`,`full_name`,`name`,`kind`,`type`,`players_duel_game`,`coupon_entry_feature_id`,`first_opponent_name`,`second_opponent_name`,`opponents_full_name`,`tournament_stage`,`teams_number`,`game_type`,`game_vid`,`group_id`,`option_lower_cf`,`option_lower_cf_view`,`coupon_type_vid`,`builder_game_type`,`builder_game_vid`,`builder_period`,`builder_coef_available`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `country` (`id`,`country_name`,`country_phone_code`,`country_code`,`country_currency_id`,`country_image`,`phone_mask_max_length`,`phone_mask_min_length`,`phone_mask`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 3:
                return "INSERT INTO `country` (`id`,`country_name`,`country_phone_code`,`country_code`,`country_currency_id`,`country_image`) VALUES (?,?,?,?,?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `currencies` (`id`,`code`,`name`,`top`,`ruble_to_currency_rate`,`symbol`,`min_out_deposit`,`min_out_deposit_electron`,`min_sum_bets`,`round`,`registration_hidden`,`crypto`,`initialBet`,`betStep`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 5:
                return "INSERT OR REPLACE INTO `events` (`id`,`name`,`type_param`,`special_type`) VALUES (?,?,?,?)";
            case 6:
                return "INSERT OR REPLACE INTO `event_groups` (`id`,`name`,`position`,`count_cols`,`has_auto_sub`) VALUES (?,?,?,?,?)";
            case 7:
                return "INSERT OR REPLACE INTO `last_action` (`id`,`type`,`date`) VALUES (?,?,?)";
            case 8:
                return "INSERT OR REPLACE INTO `market_filter` (`id`,`hidden`,`pinned_position`) VALUES (?,?,?)";
            case 9:
                return "INSERT OR IGNORE INTO `news_catalog_banners` (`id`) VALUES (?)";
            case 10:
                return "INSERT OR IGNORE INTO `news_catalog_cms_banners` (`id`) VALUES (?)";
            case 11:
                return "INSERT OR REPLACE INTO `quick_bet_settings_table` (`balanceId`,`firstValue`,`secondValue`,`thirdValue`) VALUES (?,?,?,?)";
            case 12:
                return "INSERT OR REPLACE INTO `registration` (`id`,`registration_type_id`,`field_name`,`is_required`,`is_hidden`,`min_age`) VALUES (nullif(?, 0),?,?,?,?,?)";
            case 13:
                return "INSERT OR REPLACE INTO `sports` (`id`,`name`,`team`,`short_name`,`cyber`,`background`,`image_small`,`image_popular`,`background_tablet`,`background_champ_default`,`background_champ_tablet_default`,`background_champ_header_default`,`background_champ_header_tablet_default`,`game_background`,`sub_sports`,`image_champ_small`,`feed_image_vertical`,`feed_image_horizontal`,`feed_image_square`,`discipline_icon_3d`,`esports_event_focus_discipline_header`,`esports_header_focus_discipline_header`,`default_opponent_header`,`default_opponent_header_tablet`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `statistic_dictionaries` (`id`,`type`,`itemId`,`title`) VALUES (nullif(?, 0),?,?,?)";
        }
    }

    public Unit k0(qpg0 qpg0Var, Iterable iterable) {
        if (iterable == null) {
            return Unit.f46060a;
        }
        xpg0 xpg0VarZ0 = qpg0Var.Z0(Q());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    M(xpg0VarZ0, obj);
                    xpg0VarZ0.W0();
                    xpg0VarZ0.reset();
                }
            }
            ay3.L(xpg0VarZ0, null);
            return Unit.f46060a;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ay3.L(xpg0VarZ0, th);
                throw th2;
            }
        }
    }

    public Unit l0(qpg0 qpg0Var, Object obj) {
        if (obj == null) {
            return Unit.f46060a;
        }
        xpg0 xpg0VarZ0 = qpg0Var.Z0(Q());
        try {
            M(xpg0VarZ0, obj);
            xpg0VarZ0.W0();
            ay3.L(xpg0VarZ0, null);
            return Unit.f46060a;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ay3.L(xpg0VarZ0, th);
                throw th2;
            }
        }
    }

    public Object m0(qpg0 qpg0Var, Object obj, bnn0 bnn0Var) {
        xpg0 xpg0VarZ0 = qpg0Var.Z0(Q());
        try {
            M(xpg0VarZ0, obj);
            xpg0VarZ0.W0();
            ay3.L(xpg0VarZ0, null);
            return q0x.K(qpg0Var, bnn0Var);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ay3.L(xpg0VarZ0, th);
                throw th2;
            }
        }
    }

    public /* synthetic */ sj3(byte b) {
        this.f32288a = b;
    }
}
