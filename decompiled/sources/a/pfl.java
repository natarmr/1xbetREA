package a;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.provider.Settings;
import android.util.TypedValue;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.dragons_gold.presentation.views.DragonsGoldCellGameView;
import org.xplatform.eastern_nights.presentation.views.EasternNightsCellGameView;
import org.xplatform.game_broadcasting.api.presentation.models.GameVideoUiConfig;
import org.xplatform.game_broadcasting.api.presentation.models.events.BroadcastingVideoEvent$Fullscreen;
import org.xplatform.game_broadcasting.api.presentation.models.events.BroadcastingZoneEvent$Fullscreen;
import org.xplatform.game_broadcasting.impl.presentation.video.GameVideoView;
import org.xplatform.game_broadcasting.impl.presentation.video.window_screen.GameVideoWindowService;
import org.xplatform.game_broadcasting.impl.presentation.zone.GameZoneView;
import org.xplatform.game_broadcasting.impl.presentation.zone.window_screen.GameZoneWindowService;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class pfl extends xo implements Function2 {
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pfl(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.h = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        Object value2;
        byte b = this.h;
        byte b2 = 2;
        byte b3 = 1;
        Object[] objArr = 0;
        yje yjeVar = null;
        Object obj3 = this.f41192a;
        switch (b) {
            case 0:
                tgl tglVar = (tgl) obj;
                qfl qflVar = (qfl) obj3;
                iiy[] iiyVarArr = qfl.O1;
                qflVar.getClass();
                if (tglVar != null) {
                    if (tglVar instanceof sgl) {
                        tzq tzqVarG0 = qflVar.G0();
                        tzqVarG0.c.setVisibility(8);
                        DragonsGoldCellGameView dragonsGoldCellGameView = tzqVarG0.b;
                        dragonsGoldCellGameView.y();
                        dragonsGoldCellGameView.v(false);
                    } else if (tglVar instanceof qgl) {
                        qflVar.G0().c.setVisibility(0);
                    } else if (tglVar instanceof pgl) {
                        ugl uglVar = ((pgl) tglVar).f26960a;
                        tzq tzqVarG1 = qflVar.G0();
                        tzqVarG1.c.setVisibility(8);
                        DragonsGoldCellGameView dragonsGoldCellGameView2 = tzqVarG1.b;
                        dragonsGoldCellGameView2.u();
                        dragonsGoldCellGameView2.D(uglVar);
                        dragonsGoldCellGameView2.v(true);
                    } else if (tglVar instanceof mgl) {
                        ugl uglVar2 = ((mgl) tglVar).f21748a;
                        tzq tzqVarG2 = qflVar.G0();
                        tzqVarG2.c.setVisibility(8);
                        DragonsGoldCellGameView dragonsGoldCellGameView3 = tzqVarG2.b;
                        dragonsGoldCellGameView3.s.setEnabled(false);
                        dragonsGoldCellGameView3.z(uglVar2);
                    } else if (tglVar instanceof ngl) {
                        ugl uglVar3 = ((ngl) tglVar).f23491a;
                        tzq tzqVarG3 = qflVar.G0();
                        tzqVarG3.c.setVisibility(8);
                        DragonsGoldCellGameView dragonsGoldCellGameView4 = tzqVarG3.b;
                        dragonsGoldCellGameView4.s.setEnabled(true);
                        dragonsGoldCellGameView4.D(uglVar3);
                        dragonsGoldCellGameView4.v(true);
                    } else if (tglVar instanceof ogl) {
                        ugl uglVar4 = ((ogl) tglVar).f25225a;
                        qflVar.G0().c.setVisibility(8);
                        DragonsGoldCellGameView dragonsGoldCellGameView5 = qflVar.G0().b;
                        dragonsGoldCellGameView5.C(false);
                        dragonsGoldCellGameView5.v(false);
                        dragonsGoldCellGameView5.A(uglVar4);
                    } else if (tglVar instanceof rgl) {
                        ugl uglVar5 = ((rgl) tglVar).f30443a;
                        qflVar.G0().c.setVisibility(8);
                        DragonsGoldCellGameView dragonsGoldCellGameView6 = qflVar.G0().b;
                        dragonsGoldCellGameView6.D(uglVar5);
                        dragonsGoldCellGameView6.C(false);
                        dragonsGoldCellGameView6.v(false);
                        dragonsGoldCellGameView6.B();
                        dragonsGoldCellGameView6.A(uglVar5);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 1:
                ((cgl) obj3).B((Throwable) obj);
                return Unit.f46060a;
            case 2:
                bjn bjnVar = (bjn) obj;
                whn whnVar = (whn) obj3;
                iiy[] iiyVarArr2 = whn.O1;
                whnVar.getClass();
                if (bjnVar != null) {
                    if (bjnVar instanceof ajn) {
                        whnVar.G0().c.setVisibility(8);
                        EasternNightsCellGameView easternNightsCellGameView = whnVar.G0().b;
                        easternNightsCellGameView.y();
                        easternNightsCellGameView.v(false);
                    } else if (bjnVar instanceof yin) {
                        xhn xhnVar = ((yin) bjnVar).f42701a;
                        whnVar.G0().c.setVisibility(8);
                        EasternNightsCellGameView easternNightsCellGameView2 = whnVar.G0().b;
                        easternNightsCellGameView2.u();
                        easternNightsCellGameView2.z(xhnVar);
                        easternNightsCellGameView2.v(true);
                    } else if (bjnVar instanceof vin) {
                        xhn xhnVar2 = ((vin) bjnVar).f37487a;
                        uzq uzqVarG0 = whnVar.G0();
                        uzqVarG0.c.setVisibility(8);
                        EasternNightsCellGameView easternNightsCellGameView3 = uzqVarG0.b;
                        easternNightsCellGameView3.s.setEnabled(false);
                        easternNightsCellGameView3.A(xhnVar2);
                    } else if (bjnVar instanceof win) {
                        xhn xhnVar3 = ((win) bjnVar).f39223a;
                        uzq uzqVarG1 = whnVar.G0();
                        uzqVarG1.c.setVisibility(8);
                        EasternNightsCellGameView easternNightsCellGameView4 = uzqVarG1.b;
                        easternNightsCellGameView4.s.setEnabled(true);
                        easternNightsCellGameView4.v(true);
                        easternNightsCellGameView4.D(xhnVar3);
                    } else if (bjnVar instanceof xin) {
                        xhn xhnVar4 = ((xin) bjnVar).f40953a;
                        whnVar.G0().c.setVisibility(8);
                        EasternNightsCellGameView easternNightsCellGameView5 = whnVar.G0().b;
                        easternNightsCellGameView5.D(xhnVar4);
                        easternNightsCellGameView5.C(false);
                        easternNightsCellGameView5.v(false);
                        easternNightsCellGameView5.B(xhnVar4);
                    } else if (bjnVar instanceof zin) {
                        whnVar.G0().c.setVisibility(0);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 3:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                iiy[] iiyVarArr3 = whn.O1;
                ((whn) obj3).G0().b.v(zBooleanValue);
                return Unit.f46060a;
            case 4:
                ((kin) obj3).z((Throwable) obj);
                return Unit.f46060a;
            case 5:
                ((duj) obj3).a((Throwable) obj);
                return Unit.f46060a;
            case 6:
                org.xplatform.favorites.impl.presentation.category.a aVar = (org.xplatform.favorites.impl.presentation.category.a) obj3;
                aVar.B.b((Throwable) obj, new q4p(aVar, b3));
                return Unit.f46060a;
            case 7:
                Throwable th = (Throwable) obj;
                bep bepVar = (bep) obj3;
                bepVar.getClass();
                boolean z = th != null && ((th instanceof SocketTimeoutException) || (th instanceof ConnectException) || (th instanceof UnknownHostException));
                p7m0 p7m0Var = bepVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    bepVar.f.getClass();
                } while (!p7m0Var.m(value, e2p.a((e2p) value, false, false, false, z, !z, false, null, null, null, false, 65337)));
                return Unit.f46060a;
            case 8:
                ((gfp) obj3).O((Throwable) obj);
                return Unit.f46060a;
            case 9:
                Throwable th2 = (Throwable) obj;
                abr abrVar = (abr) obj3;
                abrVar.q.b(th2, new gup((Object) th2, (Object) abrVar, (byte) 13));
                return Unit.f46060a;
            case 10:
                k4s k4sVar = (k4s) obj3;
                int i = k4s.c0;
                k4sVar.getClass();
                sac.V(jiu0.a(k4sVar), n3s.f22864a, null, k4sVar.p.c, new o3s((i3t0) k4sVar, (g4z) obj, yjeVar, (byte) (objArr == true ? 1 : 0)), 10);
                return Unit.f46060a;
            case 11:
                g9s g9sVar = (g9s) obj3;
                int i2 = g9s.n0;
                g9sVar.getClass();
                sac.V(jiu0.a(g9sVar), i8s.f14354a, null, g9sVar.q.c, new o3s((i3t0) g9sVar, (g4z) obj, yjeVar, b3), 10);
                return Unit.f46060a;
            case 12:
                yks yksVar = (yks) obj3;
                int i3 = yks.m0;
                yksVar.getClass();
                sac.V(jiu0.a(yksVar), aks.f1037a, null, yksVar.q.c, new o3s((i3t0) yksVar, (g4z) obj, yjeVar, b2), 10);
                return Unit.f46060a;
            case 13:
                txs txsVar = (txs) obj;
                wws wwsVar = (wws) obj3;
                pek pekVar = wws.S1;
                e0r e0rVarG0 = wwsVar.G0();
                khf0 khf0Var = wwsVar.Q1;
                e0rVarG0.i.setVisibility(8);
                wwsVar.G0().h.setVisibility(0);
                wwsVar.G0().l.setVisibility(8);
                wwsVar.G0().e.b.setVisibility(8);
                wwsVar.G0().b.b.setVisibility(8);
                wwsVar.G0().m.setVisibility(8);
                wwsVar.G0().f.setVisibility(8);
                wwsVar.G0().g.setVisibility(8);
                wwsVar.G0().h.setProgressVisible(false);
                if (txsVar instanceof mxs) {
                    wwsVar.G0().h.m();
                    wwsVar.G0().f.setVisibility(0);
                    wwsVar.G0().c.setText(((mxs) txsVar).f22574a);
                    wwsVar.G0().i.setVisibility(0);
                    wwsVar.G0().h.setVisibility(8);
                    wwsVar.G0().h.getBroadcastingContainerView().setVisibility(8);
                } else if (Intrinsics.d(txsVar, pxs.f27768a)) {
                    wwsVar.G0().b.b.setVisibility(0);
                    wwsVar.G0().h.g();
                    b3 = wwsVar.G0().h.l == null ? (byte) 0 : (byte) 1;
                    wwsVar.G0().m.setVisibility(b3 != 0 ? 0 : 8);
                    wwsVar.G0().h.b();
                    if (b3 != 0) {
                        Context contextO0 = wwsVar.o0();
                        TypedValue typedValue = m5d.f21214a;
                        int color = contextO0.getColor(R.color.static_white);
                        wwsVar.G0().b.e.setTextColor(color);
                        wwsVar.G0().b.d.setImageTintList(ColorStateList.valueOf(color));
                    } else {
                        zws zwsVarA = axs.a(((GameVideoUiConfig) khf0Var.n(wwsVar, wws.U1[2])).e);
                        TextView textView = wwsVar.G0().b.e;
                        TypedValue typedValue2 = j5d.f15927a;
                        textView.setTextColor(j5d.a(wwsVar.o0(), zwsVarA.b, false));
                        wwsVar.G0().b.d.setImageTintList(ColorStateList.valueOf(j5d.a(wwsVar.o0(), zwsVarA.c, false)));
                    }
                } else if (Intrinsics.d(txsVar, qxs.f29502a)) {
                    wwsVar.G0().e.b.setVisibility(0);
                    wwsVar.G0().h.g();
                    b3 = wwsVar.G0().h.l == null ? (byte) 0 : (byte) 1;
                    wwsVar.G0().m.setVisibility(b3 != 0 ? 0 : 8);
                    wwsVar.G0().h.b();
                    if (b3 != 0) {
                        Context contextO1 = wwsVar.o0();
                        TypedValue typedValue3 = m5d.f21214a;
                        int color2 = contextO1.getColor(R.color.static_white);
                        wwsVar.G0().e.e.setTextColor(color2);
                        wwsVar.G0().e.d.setImageTintList(ColorStateList.valueOf(color2));
                    } else {
                        zws zwsVarA2 = axs.a(((GameVideoUiConfig) khf0Var.n(wwsVar, wws.U1[2])).e);
                        TextView textView2 = wwsVar.G0().e.e;
                        TypedValue typedValue4 = j5d.f15927a;
                        textView2.setTextColor(j5d.a(wwsVar.o0(), zwsVarA2.b, false));
                        wwsVar.G0().e.d.setImageTintList(ColorStateList.valueOf(j5d.a(wwsVar.o0(), zwsVarA2.c, false)));
                    }
                } else if (txsVar instanceof nxs) {
                    wwsVar.G0().h.m();
                    wwsVar.G0().f.setVisibility(0);
                    wwsVar.G0().l.setText(((nxs) txsVar).f24297a);
                    wwsVar.G0().l.setVisibility(0);
                    wwsVar.G0().h.setVisibility(8);
                    wwsVar.G0().h.getBroadcastingContainerView().setVisibility(8);
                } else if (txsVar instanceof lxs) {
                    wwsVar.G0().h.m();
                    wwsVar.G0().f.setVisibility(0);
                    wwsVar.G0().c.setText(((lxs) txsVar).f20831a);
                    wwsVar.G0().g.setVisibility(0);
                    wwsVar.G0().h.setVisibility(8);
                    wwsVar.G0().h.getBroadcastingContainerView().setVisibility(8);
                } else if (Intrinsics.d(txsVar, oxs.f26028a)) {
                    wwsVar.G0().h.setProgressVisible(true);
                    wwsVar.G0().h.getBroadcastingContainerView().setVisibility(8);
                } else if (txsVar instanceof sxs) {
                    sxs sxsVar = (sxs) txsVar;
                    wwsVar.G0().h.setBroadcastingUrl(sxsVar.f32994a);
                    wwsVar.G0().h.setProgressVisible(true);
                    wwsVar.G0().h.d();
                    if (sxsVar.b) {
                        wwsVar.G0().h.c();
                    } else {
                        wwsVar.G0().h.b();
                    }
                    wwsVar.G0().h.setPlayDrawable(true);
                } else {
                    if (!(txsVar instanceof rxs)) {
                        t9f.b();
                        return null;
                    }
                    wwsVar.G0().h.d();
                    rxs rxsVar = (rxs) txsVar;
                    boolean z2 = rxsVar.f31280a;
                    if (rxsVar.b) {
                        wwsVar.G0().h.c();
                    } else {
                        wwsVar.G0().h.b();
                    }
                    if (z2) {
                        wwsVar.G0().h.setSoundEnable(rxsVar.c);
                        GameVideoView gameVideoView = wwsVar.G0().h;
                        if (gameVideoView.i.length() != 0) {
                            gameVideoView.o = true;
                            ulo uloVar = gameVideoView.j;
                            if (uloVar != null) {
                                uloVar.P(true);
                            }
                        }
                    } else {
                        wwsVar.G0().h.f();
                    }
                    wwsVar.G0().h.setPlayDrawable(z2);
                }
                return Unit.f46060a;
            case 14:
                nws nwsVar = nws.f24250a;
                pws pwsVar = (pws) obj;
                wws wwsVar2 = (wws) obj3;
                pek pekVar2 = wws.S1;
                wwsVar2.getClass();
                if (Intrinsics.d(pwsVar, nws.b)) {
                    vcc.f0(i120.V(new Pair("KEY_VIDEO_REQUEST", BroadcastingVideoEvent$Fullscreen.f46699a)), wwsVar2, "KEY_VIDEO_REQUEST");
                    p7m0 p7m0Var2 = wwsVar2.H0().C;
                    p7m0Var2.getClass();
                    p7m0Var2.o(null, nwsVar);
                } else if (pwsVar instanceof ows) {
                    if (Settings.canDrawOverlays(wwsVar2.o0())) {
                        ((ows) pwsVar).f25980a.invoke();
                    } else {
                        Context contextO2 = wwsVar2.o0();
                        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + contextO2.getPackageName()));
                        if (contextO2.getPackageManager().resolveActivity(intent, 0) != null) {
                            intent.setFlags(268435456);
                            contextO2.startActivity(intent);
                        }
                    }
                    p7m0 p7m0Var3 = wwsVar2.H0().C;
                    p7m0Var3.getClass();
                    p7m0Var3.o(null, nwsVar);
                } else if (!Intrinsics.d(pwsVar, nwsVar)) {
                    t9f.b();
                    return null;
                }
                return Unit.f46060a;
            case 15:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                wws wwsVar3 = (wws) obj3;
                pek pekVar3 = wws.S1;
                if (zBooleanValue2) {
                    wwsVar3.G0().h.l();
                } else {
                    wwsVar3.getClass();
                }
                return Unit.f46060a;
            case 16:
                hzs hzsVar = (hzs) obj;
                GameVideoWindowService gameVideoWindowService = (GameVideoWindowService) obj3;
                int i4 = GameVideoWindowService.k;
                gameVideoWindowService.getClass();
                a8z a8zVar = gameVideoWindowService.f;
                a8z a8zVar2 = gameVideoWindowService.h;
                if (Intrinsics.d(hzsVar, dzs.f6955a)) {
                    ((FrameLayout) a8zVar2.getValue()).setVisibility(8);
                    ((View) a8zVar.getValue()).setVisibility(0);
                    gameVideoWindowService.b().setVisibility(0);
                    gameVideoWindowService.a().g();
                    gameVideoWindowService.a().b();
                    gameVideoWindowService.b().setBackgroundColor(gameVideoWindowService.a().l == null ? gameVideoWindowService.getColor(R.color.static_black) : 0);
                } else if (hzsVar instanceof gzs) {
                    ((View) a8zVar.getValue()).setVisibility(8);
                    gameVideoWindowService.b().setVisibility(8);
                    ((FrameLayout) a8zVar2.getValue()).setVisibility(0);
                    gameVideoWindowService.a().setVisibility(0);
                    gameVideoWindowService.a().p();
                    gameVideoWindowService.a().d();
                    if (((gzs) hzsVar).f12196a) {
                        gameVideoWindowService.a().c();
                    } else {
                        gameVideoWindowService.a().b();
                    }
                } else if (hzsVar instanceof fzs) {
                    fzs fzsVar = (fzs) hzsVar;
                    ((View) a8zVar.getValue()).setVisibility(8);
                    gameVideoWindowService.b().setVisibility(8);
                    ((FrameLayout) a8zVar2.getValue()).setVisibility(8);
                    gameVideoWindowService.a().setVisibility(0);
                    gameVideoWindowService.a().setBroadcastingUrl(fzsVar.f10424a);
                    gameVideoWindowService.a().d();
                    gameVideoWindowService.a().setProgressVisible(true);
                    gameVideoWindowService.a().setPlayDrawable(true);
                    if (fzsVar.b) {
                        gameVideoWindowService.a().c();
                    } else {
                        gameVideoWindowService.a().b();
                    }
                } else {
                    if (!(hzsVar instanceof ezs)) {
                        t9f.b();
                        return null;
                    }
                    ezs ezsVar = (ezs) hzsVar;
                    ((View) a8zVar.getValue()).setVisibility(8);
                    gameVideoWindowService.b().setVisibility(8);
                    ((FrameLayout) a8zVar2.getValue()).setVisibility(8);
                    gameVideoWindowService.a().setVisibility(0);
                    gameVideoWindowService.a().setProgressVisible(false);
                    gameVideoWindowService.a().d();
                    if (ezsVar.b) {
                        gameVideoWindowService.a().c();
                    } else {
                        gameVideoWindowService.a().b();
                    }
                    boolean z3 = ezsVar.f8684a;
                    if (z3) {
                        gameVideoWindowService.a().setSoundEnable(ezsVar.c);
                        GameVideoView gameVideoViewA = gameVideoWindowService.a();
                        if (gameVideoViewA.i.length() != 0) {
                            gameVideoViewA.o = true;
                            ulo uloVar2 = gameVideoViewA.j;
                            if (uloVar2 != null) {
                                uloVar2.P(true);
                            }
                        }
                    } else {
                        gameVideoWindowService.a().f();
                    }
                    gameVideoWindowService.a().setPlayDrawable(z3);
                }
                return Unit.f46060a;
            case 17:
                w0t w0tVar = (w0t) obj;
                p0t p0tVar = (p0t) obj3;
                ddk ddkVar = p0t.P1;
                p0tVar.getClass();
                if (w0tVar != null) {
                    if (w0tVar instanceof t0t) {
                        p0tVar.G0().b.setVisibility(8);
                        p0tVar.G0().c.setVisibility(0);
                        p0tVar.G0().b.setProgressVisible(false);
                        p0tVar.I0(((t0t) w0tVar).f33137a);
                    } else if (w0tVar instanceof v0t) {
                        p0tVar.G0().b.setVisibility(0);
                        p0tVar.G0().c.setVisibility(8);
                        v0t v0tVar = (v0t) w0tVar;
                        p0tVar.G0().b.setBroadcastingUrl(v0tVar.f36598a);
                        p0tVar.G0().b.setProgressVisible(true);
                        p0tVar.I0(v0tVar.b);
                    } else if (w0tVar instanceof u0t) {
                        p0tVar.G0().b.setVisibility(0);
                        p0tVar.G0().c.setVisibility(8);
                        p0tVar.G0().b.setProgressVisible(false);
                        GameZoneView gameZoneView = p0tVar.G0().b;
                        u0t u0tVar = (u0t) w0tVar;
                        boolean z4 = u0tVar.c;
                        w3w0 w3w0Var = u0tVar.e;
                        gameZoneView.setZoneFormatIsVisible(u0tVar.f);
                        p0tVar.G0().b.setZoneFormatDrawable(w3w0Var);
                        p0tVar.I0(u0tVar.d);
                        if (z4) {
                            p0tVar.G0().b.setPlayZoneCommand(u0tVar.f34871a);
                            p0tVar.G0().b.f();
                            p0tVar.G0().b.g(u0tVar.b, w3w0Var);
                        } else {
                            p0tVar.G0().b.e();
                        }
                        p0tVar.G0().b.setPlayDrawable(z4);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 18:
                m0t m0tVar = (m0t) obj;
                p0t p0tVar2 = (p0t) obj3;
                ddk ddkVar2 = p0t.P1;
                p0tVar2.getClass();
                boolean z5 = m0tVar instanceof k0t;
                j0t j0tVar = j0t.f15697a;
                if (z5) {
                    vcc.f0(i120.V(new Pair("KEY_ZONE_REQUEST", BroadcastingZoneEvent$Fullscreen.f46700a)), p0tVar2, "KEY_ZONE_REQUEST");
                    p7m0 p7m0Var4 = p0tVar2.H0().o;
                    p7m0Var4.getClass();
                    p7m0Var4.o(null, j0tVar);
                } else if (m0tVar instanceof l0t) {
                    if (Settings.canDrawOverlays(p0tVar2.o0())) {
                        ((l0t) m0tVar).f19218a.invoke();
                    } else {
                        Context contextO3 = p0tVar2.o0();
                        Intent intent2 = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + contextO3.getPackageName()));
                        if (contextO3.getPackageManager().resolveActivity(intent2, 0) != null) {
                            intent2.setFlags(268435456);
                            contextO3.startActivity(intent2);
                        }
                    }
                    p7m0 p7m0Var5 = p0tVar2.H0().o;
                    p7m0Var5.getClass();
                    p7m0Var5.o(null, j0tVar);
                } else if (!Intrinsics.d(m0tVar, j0tVar)) {
                    t9f.b();
                    return null;
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                n1t n1tVar = (n1t) obj;
                GameZoneWindowService gameZoneWindowService = (GameZoneWindowService) obj3;
                int i5 = GameZoneWindowService.g;
                gameZoneWindowService.getClass();
                if (n1tVar != null) {
                    if (n1tVar instanceof k1t) {
                        gameZoneWindowService.a().setVisibility(0);
                        gameZoneWindowService.a().setProgressVisible(false);
                        gameZoneWindowService.a().d();
                        if (((k1t) n1tVar).f17544a) {
                            gameZoneWindowService.a().c();
                        } else {
                            gameZoneWindowService.a().b();
                        }
                    } else if (n1tVar instanceof m1t) {
                        gameZoneWindowService.a().setVisibility(0);
                        m1t m1tVar = (m1t) n1tVar;
                        gameZoneWindowService.a().setBroadcastingUrl(m1tVar.f21025a);
                        gameZoneWindowService.a().d();
                        gameZoneWindowService.a().setProgressVisible(true);
                        gameZoneWindowService.a().setPlayDrawable(true);
                        if (m1tVar.b) {
                            gameZoneWindowService.a().c();
                        } else {
                            gameZoneWindowService.a().b();
                        }
                    } else if (n1tVar instanceof l1t) {
                        gameZoneWindowService.a().setVisibility(0);
                        gameZoneWindowService.a().setProgressVisible(false);
                        gameZoneWindowService.a().d();
                        GameZoneView gameZoneViewA = gameZoneWindowService.a();
                        l1t l1tVar = (l1t) n1tVar;
                        boolean z6 = l1tVar.c;
                        w3w0 w3w0Var2 = l1tVar.e;
                        gameZoneViewA.setZoneFormatIsVisible(l1tVar.f);
                        gameZoneWindowService.a().setZoneFormatDrawable(w3w0Var2);
                        if (l1tVar.d) {
                            gameZoneWindowService.a().c();
                        } else {
                            gameZoneWindowService.a().b();
                        }
                        if (z6) {
                            gameZoneWindowService.a().setPlayZoneCommand(l1tVar.f19274a);
                            gameZoneWindowService.a().f();
                            gameZoneWindowService.a().g(l1tVar.b, w3w0Var2);
                        } else {
                            gameZoneWindowService.a().e();
                        }
                        gameZoneWindowService.a().setPlayDrawable(z6);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 20:
                igv igvVar = (igv) obj3;
                bst bstVar = igv.e2;
                igvVar.getClass();
                List list = u0d.f34849a;
                u0d.j(igvVar.J0().b, (String) obj, 0, 0, null, null, null, 510);
                return Unit.f46060a;
            case 21:
                jgv jgvVar = (jgv) obj3;
                gst gstVar = jgv.h2;
                jgvVar.getClass();
                List list2 = u0d.f34849a;
                u0d.j(jgvVar.T0().b, (String) obj, 0, 0, null, null, null, 510);
                return Unit.f46060a;
            case 22:
                vuv vuvVar = (vuv) obj3;
                vuvVar.getClass();
                ((Throwable) obj).printStackTrace();
                p7m0 p7m0Var6 = vuvVar.i.f25029a;
                do {
                    value2 = p7m0Var6.getValue();
                    value2.getClass();
                    vuvVar.f.getClass();
                } while (!p7m0Var6.m(value2, guv.a((guv) value2, false, true, null, null, null, 57)));
                return Unit.f46060a;
            case 23:
                s1w s1wVar = (s1w) obj3;
                bst bstVar2 = s1w.d2;
                if (((p9w) obj) instanceof f9w) {
                    ii iiVarH0 = s1wVar.H0();
                    String strH = s1wVar.H(R.string.confirmation);
                    String strH2 = s1wVar.H(R.string.push_tracking_alert_message);
                    String strH3 = s1wVar.H(R.string.activate);
                    strH3.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, s1wVar.H(R.string.cancel), (String) null, "REQUEST_SYSTEM_NOTIFICATION_SETTINGS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC = s1wVar.C();
                    eVarC.getClass();
                    iiVarH0.d(dialogFields, eVarC);
                } else {
                    s1wVar.getClass();
                }
                return Unit.f46060a;
            case 24:
                ((naw) obj3).y((Throwable) obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                abx abxVar = (abx) obj;
                art artVar = yax.S1;
                ((yax) obj3).getClass();
                if (abxVar != null) {
                    WebView.setWebContentsDebuggingEnabled(abxVar.f600a);
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                iiy[] iiyVarArr4 = uvz.P1;
                ((ezz) ((uvz) obj3).O1.getValue()).A((List) obj);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                d500 d500Var = (d500) obj;
                uvz uvzVar = (uvz) obj3;
                iiy[] iiyVarArr5 = uvz.P1;
                uvzVar.getClass();
                if (Intrinsics.d(d500Var, b500.f1979a)) {
                    uvzVar.G0().d.setVisibility(0);
                    uvzVar.G0().b.setVisibility(8);
                } else {
                    if (!(d500Var instanceof c500)) {
                        t9f.b();
                        return null;
                    }
                    uvzVar.G0().d.setVisibility(8);
                    LottieView lottieView = uvzVar.G0().b;
                    lottieView.v(((c500) d500Var).f3747a);
                    lottieView.setVisibility(0);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                iiy[] iiyVarArr6 = uvz.P1;
                ((FrameLayout) ((uvz) obj3).G0().c.b).setVisibility(zBooleanValue3 ? 0 : 8);
                return Unit.f46060a;
            default:
                om00 om00Var = (om00) obj;
                yl00 yl00Var = (yl00) obj3;
                htz htzVar = yl00.n2;
                yl00Var.getClass();
                phf0 phf0Var = yl00Var.j2;
                if (om00Var != null) {
                    if (om00Var instanceof lm00) {
                        iiy[] iiyVarArr7 = yl00.o2;
                        vcc.f0(i120.V(new Pair(phf0Var.n(yl00Var, iiyVarArr7[0]), Boolean.TRUE)), yl00Var, phf0Var.n(yl00Var, iiyVarArr7[0]));
                        yl00Var.y0();
                    } else if (om00Var instanceof nm00) {
                        yl00Var.W0(true);
                    } else if (om00Var instanceof mm00) {
                        j120.Y(yl00Var);
                        ii iiVar = yl00Var.h2;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH4 = yl00Var.H(R.string.attention);
                        String str = ((mm00) om00Var).f22016a;
                        String strH5 = yl00Var.H(R.string.ok_new);
                        strH5.getClass();
                        iiVar.d(new DialogFields((CharSequence) strH4, (CharSequence) str, (CharSequence) strH5, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528), yl00Var.F());
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
