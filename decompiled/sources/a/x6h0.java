package a;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.feed.linelive.presentation.dialogs.select_date_time.params.SelectTimeRangeScreenParams;
import org.xplatform.results.impl.presentation.dialogs.results.params.SelectDateScreenParams;
import org.xplatform.scratch_card.presentation.views.ScratchCardFieldView;
import org.xplatform.scratch_card.presentation.views.ScratchCardView;
import org.xplatform.ui_core.viewcomponents.views.BetInputView;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x6h0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40364a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x6h0(Object obj, Object obj2, byte b) {
        this.f40364a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:164:0x043f  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        long timeInMillis;
        long timeInMillis2;
        long timeInMillis3;
        long timeInMillis4;
        boolean z = true;
        z = true;
        byte b = 0;
        switch (this.f40364a) {
            case 0:
                Context context = (Context) this.b;
                y6h0 y6h0Var = (y6h0) this.c;
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.view_scratch_card_item, (ViewGroup) y6h0Var, false);
                y6h0Var.addView(viewInflate);
                ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.itemImage);
                if (imageView != null) {
                    return new oku0((FrameLayout) viewInflate, imageView);
                }
                hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.itemImage)));
                return null;
            case 1:
                ScratchCardView scratchCardView = (ScratchCardView) this.b;
                c7h0 c7h0Var = (c7h0) this.c;
                scratchCardView.f46912a.invoke();
                ScratchCardFieldView scratchCardFieldView = scratchCardView.b;
                if (scratchCardFieldView != null) {
                    scratchCardFieldView.a(c7h0Var.g);
                }
                return Unit.f46060a;
            case 2:
                return x2x.G((String) this.b, tua0.c, new ugi0[0], new keh0((leh0) this.c, b));
            case 3:
                thh0 thh0Var = (thh0) this.b;
                thh0 thh0Var2 = (thh0) this.c;
                nhh0 nhh0Var = thh0Var instanceof nhh0 ? (nhh0) thh0Var : null;
                List list = nhh0Var != null ? nhh0Var.f23533a : null;
                if (list == null || list.isEmpty()) {
                    nhh0 nhh0Var2 = thh0Var2 instanceof nhh0 ? (nhh0) thh0Var2 : null;
                    List list2 = nhh0Var2 != null ? nhh0Var2.f23533a : null;
                    if (list2 != null && !list2.isEmpty()) {
                        z = false;
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                ctf0 ctf0Var = (ctf0) this.b;
                nqh0 nqh0Var = (nqh0) this.c;
                zvh0 zvh0Var = zvh0.CONTROL_WITH_DIVIDERS;
                String strA = ctf0Var.b.a(R.string.profile_title, Arrays.copyOf(new Object[0], 0));
                bwh0 bwh0Var = bwh0.f3325a;
                return new yph0(zvh0Var, dyb.g0(new yvh0(strA, bwh0Var), new yvh0(ctf0Var.b.a(R.string.settings_session, Arrays.copyOf(new Object[0], 0)), bwh0Var)), nqh0Var == nqh0.f23960a ? 0 : 1);
            case 5:
                ((Function1) this.b).invoke((fqh0) this.c);
                return Unit.f46060a;
            case 6:
                ((Function1) this.b).invoke((gqh0) this.c);
                return Unit.f46060a;
            case 7:
                x6f x6fVar = (x6f) this.b;
                c5h c5hVar = (c5h) this.c;
                x6fVar.invoke("");
                p7m0 p7m0Var = c5hVar.q;
                if (((l120) p7m0Var.getValue()).g) {
                    ((uzg) c5hVar.d).a();
                } else {
                    p7m0Var.o(null, l120.a((l120) p7m0Var.getValue(), "", false, false, true, false, 187));
                }
                return Unit.f46060a;
            case 8:
                ((Function1) this.b).invoke(new i0i0(((q0i0) ((t0i0) this.c).c).f27900a));
                return Unit.f46060a;
            case 9:
                hdj hdjVar = (hdj) this.b;
                x1i0 x1i0Var = (x1i0) this.c;
                zie0 zie0Var = x1i0.n2;
                SimpleDate simpleDateA = hdjVar.a();
                if (simpleDateA != null) {
                    x1i0Var.Q0().x(new r1i0(simpleDateA));
                }
                return Unit.f46060a;
            case 10:
                gfj gfjVar = (gfj) this.b;
                y3i0 y3i0Var = (y3i0) this.c;
                lme0 lme0Var = y3i0.n2;
                xk9 xk9VarQ = gfjVar.Q();
                if (xk9VarQ != null) {
                    ((k3t0) y3i0Var.m2.getValue()).x(new t3i0(xk9VarQ));
                }
                return Unit.f46060a;
            case 11:
                vzg0 vzg0Var = (vzg0) this.b;
                SelectDateScreenParams selectDateScreenParams = (SelectDateScreenParams) this.c;
                Date date = selectDateScreenParams.f46901a;
                Long l = (Long) vzg0Var.a("MIN_SAVED_HANDLE");
                if (l != null) {
                    timeInMillis = l.longValue();
                } else {
                    Calendar calendar = Calendar.getInstance();
                    calendar.add(1, -2);
                    vzg0Var.e("MIN_SAVED_HANDLE", Long.valueOf(calendar.getTimeInMillis()));
                    timeInMillis = calendar.getTimeInMillis();
                }
                long j = timeInMillis;
                Long l2 = (Long) vzg0Var.a("MAX_SAVED_HANDLE");
                if (l2 != null) {
                    timeInMillis2 = l2.longValue();
                } else {
                    Calendar calendar2 = Calendar.getInstance();
                    vzg0Var.e("MAX_SAVED_HANDLE", Long.valueOf(calendar2.getTimeInMillis()));
                    timeInMillis2 = calendar2.getTimeInMillis();
                }
                return new l2i0(j, timeInMillis2, date != null ? Long.valueOf(date.getTime()) : null, selectDateScreenParams.b, date != null);
            case 12:
                vzg0 vzg0Var2 = (vzg0) this.b;
                SelectTimeRangeScreenParams selectTimeRangeScreenParams = (SelectTimeRangeScreenParams) this.c;
                yg40 yg40Var = yg40.ONE;
                Long l3 = (Long) vzg0Var2.a("MIN_SAVED_HANDLE");
                if (l3 != null) {
                    timeInMillis3 = l3.longValue();
                } else {
                    Calendar calendar3 = Calendar.getInstance();
                    calendar3.setTimeInMillis(calendar3.getTimeInMillis() - 300000);
                    calendar3.get(11);
                    calendar3.get(12);
                    vzg0Var2.e("MIN_SAVED_HANDLE", Long.valueOf(calendar3.getTimeInMillis()));
                    timeInMillis3 = calendar3.getTimeInMillis();
                }
                long j2 = timeInMillis3;
                Long l4 = (Long) vzg0Var2.a("MAX_SAVED_HANDLE");
                if (l4 != null) {
                    timeInMillis4 = l4.longValue();
                } else {
                    Calendar calendar4 = Calendar.getInstance();
                    calendar4.add(1, 100);
                    vzg0Var2.e("MAX_SAVED_HANDLE", Long.valueOf(calendar4.getTimeInMillis()));
                    timeInMillis4 = calendar4.getTimeInMillis();
                }
                return new h4i0(j2, timeInMillis4, selectTimeRangeScreenParams.f46662a, selectTimeRangeScreenParams.b);
            case 13:
                swi0 swi0Var = (swi0) this.b;
                vvi0 vvi0Var = (vvi0) this.c;
                gne0 gne0Var = swi0.X1;
                swi0Var.H0().x(new syi0(vvi0Var));
                qgd qgdVar = swi0Var.V1;
                if (qgdVar != null) {
                    qgdVar.H();
                    return Unit.f46060a;
                }
                Intrinsics.h("settingsNavigator");
                throw null;
            case 14:
                Function1 function1 = (Function1) this.b;
                hzi0 hzi0Var = (hzi0) this.c;
                hzi0Var.getClass();
                function1.invoke(new gbj0(hzi0Var));
                return Unit.f46060a;
            case 15:
                ((Function1) this.b).invoke((nzi0) this.c);
                return Unit.f46060a;
            case 16:
                Function1 function2 = (Function1) this.b;
                pzi0 pzi0Var = (pzi0) this.c;
                pzi0Var.getClass();
                function2.invoke(new gbj0(pzi0Var));
                return Unit.f46060a;
            case 17:
                t1j0 t1j0Var = (t1j0) this.b;
                vvi0 vvi0Var2 = (vvi0) this.c;
                zie0 zie0Var2 = t1j0.Y1;
                org.xplatform.settings.impl.presentation.a aVarI0 = t1j0Var.I0();
                i1w0 i1w0Var = aVarI0.k;
                s31 s31Var = aVarI0.d;
                s31Var.f31532a.c("settings_not_logged_click");
                s64 s64Var = aVarI0.A;
                s64Var.f31684a.a(xun.f41520a, 11011L);
                int iOrdinal = vvi0Var2.ordinal();
                if (iOrdinal == 0) {
                    aVarI0.C(nqh0.f23960a);
                } else if (iOrdinal == 1) {
                    s31Var.D();
                    s64Var.e("transactions");
                    i1w0Var.d(new kej0(aVarI0, (byte) 16));
                } else if (iOrdinal == 2) {
                    i1w0Var.d(new kej0(aVarI0, (byte) 6));
                } else if (iOrdinal == 3) {
                    s31Var.t();
                    s64Var.e("mailing");
                    i1w0Var.d(new kej0(aVarI0, (byte) 10));
                } else {
                    if (iOrdinal != 4) {
                        t9f.b();
                        return null;
                    }
                    s31Var.r();
                    s64Var.e("history");
                    i1w0Var.d(new kej0(aVarI0, (byte) 17));
                }
                qgd qgdVar2 = t1j0Var.U1;
                if (qgdVar2 != null) {
                    qgdVar2.H();
                    return Unit.f46060a;
                }
                Intrinsics.h("settingsNavigator");
                throw null;
            case 18:
                ((Function1) this.b).invoke((mv00) this.c);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                qbj0 qbj0Var = (qbj0) this.b;
                vvi0 vvi0Var3 = (vvi0) this.c;
                lme0 lme0Var2 = qbj0.Z1;
                qbj0Var.H0().x(new ibj0(vvi0Var3));
                qgd qgdVar3 = qbj0Var.V1;
                if (qgdVar3 != null) {
                    qgdVar3.H();
                    return Unit.f46060a;
                }
                Intrinsics.h("settingsNavigator");
                throw null;
            case 20:
                ofj0 ofj0Var = (ofj0) this.b;
                vvi0 vvi0Var4 = (vvi0) this.c;
                cge0 cge0Var = ofj0.X1;
                ofj0Var.H0().x(new syi0(vvi0Var4));
                qgd qgdVar4 = ofj0Var.V1;
                if (qgdVar4 != null) {
                    qgdVar4.H();
                    return Unit.f46060a;
                }
                Intrinsics.h("settingsNavigator");
                throw null;
            case 21:
                rw40 rw40Var = (rw40) this.b;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.c;
                synchronized (uoj0.b) {
                    LinkedHashMap linkedHashMap = uoj0.c;
                    linkedHashMap.remove(rw40Var);
                    if (linkedHashMap.isEmpty()) {
                        wv00.f().a(pov0.f27347a, "NetworkRequestConstraintController unregister shared callback");
                        connectivityManager.unregisterNetworkCallback(uoj0.f36019a);
                        uoj0.f = null;
                        uoj0.d = null;
                        uoj0.e = false;
                    }
                    break;
                }
                return Unit.f46060a;
            case 22:
                SharedPreferences sharedPreferences = ((Context) this.b).getSharedPreferences((String) this.c, 0);
                sharedPreferences.getClass();
                return sharedPreferences;
            case 23:
                BetInputView betInputView = (BetInputView) this.b;
                jvj0 jvj0Var = (jvj0) this.c;
                zie0 zie0Var3 = jvj0.W1;
                betInputView.clearFocus();
                jvj0Var.J0().N("BetInputView", false, false, false);
                return Unit.f46060a;
            case 24:
                BetInputView betInputView2 = (BetInputView) this.b;
                kvj0 kvj0Var = (kvj0) this.c;
                eke0 eke0Var = kvj0.S1;
                betInputView2.clearFocus();
                yxj0 yxj0VarM0 = kvj0Var.M0();
                bby bbyVar = yxj0VarM0.U;
                if (bbyVar == null || !bbyVar.isActive()) {
                    yxj0VarM0.C(false);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                xxj0 xxj0Var = (xxj0) this.b;
                Function1 function3 = (Function1) this.c;
                m97 m97Var = (m97) CollectionsKt.U(xxj0Var.K.g().e);
                xxj0Var.D.a(m97Var);
                function3.invoke(m97Var);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Function1) this.b).invoke((d0k0) this.c);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Function1) this.b).invoke((faj) this.c);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Function1) this.b).invoke((e0k0) this.c);
                return Unit.f46060a;
            default:
                ((Function1) this.b).invoke((f0k0) this.c);
                return Unit.f46060a;
        }
    }
}
