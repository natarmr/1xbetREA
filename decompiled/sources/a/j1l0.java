package a;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.javax.sip.message.Response;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.picker.api.presentation.AnalyticsEntryPoint;
import org.xplatform.picker.api.presentation.PickerParams;
import org.xplatform.swipex.impl.presentation.dialogs.confirmation.models.SwipeActionConfirmationParams;
import org.xplatform.uikit_sport.score.SportScore;
import org.xplatform.uikit_sport.sport_cell.right.SportCellRightView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j1l0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15742a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j1l0(Object obj, byte b) {
        this.f15742a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long backgroundContent;
        Object value;
        Object value2;
        List list;
        bgn0 bgn0Var;
        Window window;
        byte b = this.f15742a;
        byte b2 = 3;
        byte b3 = 27;
        byte b4 = 10;
        qfn0 qfn0Var = qfn0.f28644a;
        byte b5 = 2;
        View decorView = null;
        Object[] objArr = 0;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                m1e m1eVar = (m1e) obj2;
                vzg0 vzg0Var = (vzg0) obj;
                vzg0Var.getClass();
                String str = (String) vzg0Var.a("CASHBACK_INPUT");
                if (str == null) {
                    str = "10";
                }
                String str2 = str;
                iun iunVar = iun.f15405a;
                Boolean bool = (Boolean) vzg0Var.a("HAS_FOCUS_EVENT");
                return new c1l0(null, str2, false, iunVar, false, true, false, bool != null ? bool.booleanValue() : false, m1eVar.c());
            case 1:
                return SportCellRightView.a((SportCellRightView) obj2, (TypedArray) obj);
            case 2:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                View view = cpVar.f40887a;
                view.getClass();
                dyb.O(view, new huh0((yj5) obj2, cpVar, (byte) 28));
                cpVar.t(new kzi0(cpVar, b4));
                return Unit.f46060a;
            case 3:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                zcl zclVar = qmk.f28987a;
                float fW0 = fhlVar.w0(12.0f);
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fW0)) << 32) | (((long) Float.floatToRawIntBits(fW0)) & 4294967295L);
                if (((s8l0) obj2).d) {
                    pz40 pz40Var = s6t0.f31722a;
                    backgroundContent = s6t0.b().f33626a.getPrimary();
                } else {
                    pz40 pz40Var2 = s6t0.f31722a;
                    backgroundContent = s6t0.b().f33626a.getBackgroundContent();
                }
                fhl.o0(fhlVar, backgroundContent, 0L, 0L, jFloatToRawIntBits, null, 246);
                return Unit.f46060a;
            case 4:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                ((t850) cpVar2.u).d.setListCheckBoxClickListener(new bs50(obj2, (Object) cpVar2, (byte) 12));
                cpVar2.t(new pgj0(cpVar2, cpVar2, b2));
                return Unit.f46060a;
            case 5:
                SportScore sportScore = (SportScore) obj;
                sportScore.getClass();
                sportScore.setScore((n5h0) obj2);
                return Unit.f46060a;
            case 6:
                ((hpl0) obj).getClass();
                return new n5j((svu) obj2, b5);
            case 7:
                xpl0 xpl0Var = (xpl0) obj2;
                ((Throwable) obj).getClass();
                int i = xpl0Var.J;
                xuz xuzVar = pb10.c;
                pb10 pb10Var = pb10.g;
                xuzVar.getClass();
                mdm mdmVar = new mdm(xuz.a(pb10Var, i), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
                p7m0 p7m0Var = xpl0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    xpl0Var.f.getClass();
                } while (!p7m0Var.m(value, hpl0.a((hpl0) value, false, false, null, null, false, new xmf0(mdmVar), null, null, null, null, null, null, null, null, null, false, 262111)));
                if (vtb.c0(((hpl0) xpl0Var.D()).d)) {
                    xpl0Var.N("");
                }
                return Unit.f46060a;
            case 8:
                f240 f240Var = (f240) obj;
                zie0 zie0Var = ysl0.O1;
                f240Var.getClass();
                ((fho0) ((ysl0) obj2).M1.getValue()).F(f240Var);
                return Unit.f46060a;
            case 9:
                f240 f240Var2 = (f240) obj;
                eke0 eke0Var = mtl0.O1;
                f240Var2.getClass();
                ((rio0) ((mtl0) obj2).M1.getValue()).E(f240Var2);
                return Unit.f46060a;
            case 10:
                bbl0 bbl0Var = (bbl0) obj2;
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                xsx xsxVar = (xsx) cpVar3.u;
                List listJ = q3d.j(xsxVar.c, xsxVar.e, xsxVar.i, xsxVar.g);
                List listJ2 = q3d.j(xsxVar.d, xsxVar.f, xsxVar.j, xsxVar.h);
                gkz gkzVar = new gkz(pek0.b);
                gbn gbnVar = new gbn(new s3t((byte) 22), new pkv(b2, (byte) 8), new umu((byte) 20), btv.d);
                dp dpVar = gkzVar.d;
                dpVar.b(gbnVar);
                dpVar.b(new gbn(new v1x((byte) 18), new tvx(b2, objArr == true ? 1 : 0), new djx((byte) 5), btv.Y));
                xsxVar.k.setAdapter(gkzVar);
                cpVar3.t(new dg(cpVar3, listJ, gkzVar, listJ2, bbl0Var, (byte) 27));
                return Unit.f46060a;
            case 11:
                ezl0 ezl0Var = (ezl0) obj2;
                ((Throwable) obj).getClass();
                p7m0 p7m0Var2 = ezl0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    ezl0Var.f.getClass();
                    list = ((yyl0) value2).c;
                    list.getClass();
                } while (!p7m0Var2.m(value2, new yyl0(list, false, true)));
                return Unit.f46060a;
            case 12:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                a4x a4xVar = ((o4m0) obj2).b;
                hczVar.f(a4xVar.size(), new o3l0(new f8l0((byte) 13), a4xVar, (byte) 25), new o3l0(new f8l0((byte) 14), a4xVar, (byte) 26), new ugd(802480018, true, new xy1(a4xVar, b3)));
                return Unit.f46060a;
            case 13:
                fcm0 fcm0Var = (fcm0) obj2;
                hcz hczVar2 = (hcz) obj;
                j6m0 j6m0Var = fcm0.n2;
                hczVar2.getClass();
                List listN = fcm0Var.l2.n(fcm0Var, fcm0.o2[1]);
                hczVar2.f(listN.size(), null, new y9k0(listN, (byte) 27), new ugd(2039820996, true, new xe4(listN, fcm0Var, (byte) 19)));
                return Unit.f46060a;
            case 14:
                fhl fhlVar2 = (fhl) obj;
                fhlVar2.getClass();
                fhl.E(fhlVar2, ((bmp0) obj2).f2847a, 0.0f, 0L, 0.0f, null, 126);
                return Unit.f46060a;
            case 15:
                hvm0 hvm0Var = (hvm0) obj2;
                uxm0 uxm0Var = (uxm0) obj;
                y2m0 y2m0Var = hvm0.j2;
                uxm0Var.getClass();
                if (!hvm0Var.R()) {
                    vcc.f0(i120.V(new Pair("KEY_SUB_GAME_FILTER_MODEL_REQUEST", Long.valueOf(uxm0Var.f36448a))), hvm0Var, "KEY_SUB_GAME_FILTER_MODEL_REQUEST");
                    hvm0Var.y0();
                }
                return Unit.f46060a;
            case 16:
                lib libVar = (lib) obj2;
                n0o0 n0o0Var = libVar.c;
                ctf0 ctf0Var = (ctf0) libVar.f;
                List list2 = (List) obj;
                if (list2 == null) {
                    return iun.f15405a;
                }
                ArrayList<xum0> arrayList = new ArrayList();
                for (Object obj3 : list2) {
                    String strA = ((xum0) obj3).f41519a;
                    if (strA == null) {
                        strA = ctf0Var.b.a(R.string.main_game, Arrays.copyOf(new Object[0], 0));
                    }
                    if (((CharSequence) ((fee) n0o0Var.getValue()).c()).length() == 0 || StringsKt.O(strA, (CharSequence) ((fee) n0o0Var.getValue()).c(), true)) {
                        arrayList.add(obj3);
                    }
                }
                Long l = ((txm0) libVar.e).b;
                ctf0Var.getClass();
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                for (xum0 xum0Var : arrayList) {
                    long j = xum0Var.b;
                    String strA2 = xum0Var.f41519a;
                    if (strA2 == null) {
                        strA2 = ctf0Var.b.a(R.string.main_game, Arrays.copyOf(new Object[0], 0));
                    }
                    arrayList2.add(new mxm0(strA2, j, l != null && l.longValue() == xum0Var.b));
                }
                return arrayList2;
            case 17:
                swm0 swm0Var = (swm0) obj;
                g9m0 g9m0Var = eym0.S1;
                dzm0 dzm0VarH0 = ((eym0) obj2).H0();
                swm0Var.getClass();
                vmr vmrVar = dzm0VarH0.k;
                s1p s1pVar = vmrVar.b.f16351a;
                bn6 bn6Var = vmrVar.f37684a;
                if (swm0Var instanceof qwm0) {
                    qwm0 qwm0Var = (qwm0) swm0Var;
                    long j2 = qwm0Var.c;
                    long j3 = qwm0Var.f29442a;
                    bn6Var.o(j3, j2);
                    s1pVar.a(tx3.l0(new k1p[]{new i1p((byte) 2, j3), new i1p((byte) 0, j2)}), 3182L);
                } else {
                    if (!(swm0Var instanceof pwm0)) {
                        t9f.b();
                        return null;
                    }
                    long j4 = ((pwm0) swm0Var).f27718a;
                    bn6Var.a(j4);
                    s1pVar.a(tx3.l0(new k1p[]{new i1p((byte) 2, j4), new j1p("insight", (byte) 0)}), 3182L);
                }
                return Unit.f46060a;
            case 18:
                ((View) obj).getClass();
                ((lph0) obj2).invoke();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((View) obj).getClass();
                ((lph0) obj2).invoke();
                return Unit.f46060a;
            case 20:
                l0n0 l0n0Var = (l0n0) obj2;
                v0n0 v0n0Var = (v0n0) obj;
                s2m0 s2m0Var = l0n0.P1;
                v0n0Var.getClass();
                if (v0n0Var instanceof u0n0) {
                    PickerParams.Country country = ((u0n0) v0n0Var).f34862a;
                    rl70 rl70Var = l0n0Var.L1;
                    if (rl70Var == null) {
                        Intrinsics.h("pickerDialogFactory");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC = l0n0Var.C();
                    eVarC.getClass();
                    rl70Var.e(eVarC, country, AnalyticsEntryPoint.b);
                } else {
                    if (!(v0n0Var instanceof t0n0)) {
                        t9f.b();
                        return null;
                    }
                    Context contextD = l0n0Var.D();
                    if (contextD != null) {
                        j120.g0(contextD, i120.U());
                    }
                }
                l0n0Var.G0().x(tzm0.f34811a);
                return Unit.f46060a;
            case 21:
                uid uidVar = (uid) obj;
                j6m0 j6m0Var2 = dbn0.S1;
                uidVar.getClass();
                ((dbn0) obj2).G0().x(new han0(uidVar));
                return Unit.f46060a;
            case 22:
                bem bemVar = (bem) obj;
                g9m0 g9m0Var2 = icn0.W1;
                bemVar.getClass();
                ((icn0) obj2).H0().x(new qcn0(bemVar));
                return Unit.f46060a;
            case 23:
                wfn0 wfn0Var = (wfn0) obj2;
                pgn0 pgn0Var = (pgn0) obj;
                s2m0 s2m0Var2 = wfn0.e2;
                pgn0Var.getClass();
                if (pgn0Var instanceof ngn0) {
                    Intent intentJ = hne.j("android.intent.action.SEND");
                    intentJ.putExtra("android.intent.extra.TEXT", ((ngn0) pgn0Var).f23495a);
                    intentJ.setType("text/plain");
                    wfn0Var.w0(Intent.createChooser(intentJ, null));
                } else {
                    if (!(pgn0Var instanceof ogn0)) {
                        t9f.b();
                        return null;
                    }
                    wdk0 wdk0Var = (wdk0) ((ivi) wfn0Var.c2.getValue()).b.d;
                    x1x.y(wdk0Var);
                    wdk0.k(wdk0Var, new xdk0(rek0.b, ((ogn0) pgn0Var).f25230a, null, null, null, null, 124), wfn0Var, null, null, false, null, 1012);
                }
                ((k3t0) wfn0Var.d2.getValue()).x(qfn0Var);
                return Unit.f46060a;
            case 24:
                bgn0 bgn0Var2 = (bgn0) obj2;
                pgn0 pgn0Var2 = (pgn0) obj;
                j6m0 j6m0Var3 = bgn0.q2;
                pgn0Var2.getClass();
                if (pgn0Var2 instanceof ngn0) {
                    Intent intentJ2 = hne.j("android.intent.action.SEND");
                    intentJ2.putExtra("android.intent.extra.TEXT", ((ngn0) pgn0Var2).f23495a);
                    intentJ2.setType("text/plain");
                    bgn0Var2.w0(Intent.createChooser(intentJ2, null));
                    bgn0Var = bgn0Var2;
                } else {
                    if (!(pgn0Var2 instanceof ogn0)) {
                        t9f.b();
                        return null;
                    }
                    wdk0 wdk0Var2 = (wdk0) ((ivi) bgn0Var2.o2.getValue()).b.d;
                    x1x.y(wdk0Var2);
                    xdk0 xdk0Var = new xdk0(rek0.b, ((ogn0) pgn0Var2).f25230a, null, null, null, null, 124);
                    Dialog dialog = bgn0Var2.S1;
                    if (dialog != null && (window = dialog.getWindow()) != null) {
                        decorView = window.getDecorView();
                    }
                    bgn0Var = bgn0Var2;
                    wdk0.k(wdk0Var2, xdk0Var, bgn0Var, null, decorView, false, null, 1012);
                }
                bgn0Var.P0().x(qfn0Var);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                whn0 whn0Var = (whn0) obj2;
                MenuItem menuItem = (MenuItem) obj;
                s2m0 s2m0Var3 = whn0.Y1;
                menuItem.getClass();
                if (menuItem.getItemId() == R.id.sum_sub_menu) {
                    fin0 fin0VarJ0 = whn0Var.J0();
                    if (!((Boolean) fin0VarJ0.m.getValue()).booleanValue()) {
                        fin0VarJ0.w(false);
                    }
                }
                return Boolean.TRUE;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                don0 don0Var = (don0) obj2;
                mon0 mon0Var = (mon0) obj;
                m6m0 m6m0Var = don0.n2;
                mon0Var.getClass();
                boolean z = mon0Var.f22143a;
                khf0 khf0Var = don0Var.k2;
                iiy[] iiyVarArr = don0.o2;
                vcc.f0(i120.V(new Pair(((SwipeActionConfirmationParams) khf0Var.n(don0Var, iiyVarArr[0])).b, Boolean.valueOf(z))), don0Var, ((SwipeActionConfirmationParams) khf0Var.n(don0Var, iiyVarArr[0])).f47116a);
                don0Var.y0();
                don0Var.Q0().x(eon0.f8146a);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.b(t0w0.f33140a);
                zx10 zx10Var = ((arn0) obj2).o;
                zx10Var.getClass();
                k0w0Var.c(zx10.k(zx10Var, r040.TOP, false, 2));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                tsn0 tsn0Var = (tsn0) obj2;
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    tsn0Var.r.setImageDrawable(drawable);
                }
                return Unit.f46060a;
            default:
                jtn0 jtn0Var = (jtn0) obj2;
                Drawable drawable2 = (Drawable) obj;
                if (drawable2 != null) {
                    jtn0Var.k.setImageDrawable(drawable2);
                }
                return Unit.f46060a;
        }
    }
}
