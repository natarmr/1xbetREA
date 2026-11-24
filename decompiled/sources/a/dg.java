package a;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.team_details.presentation.TeamDetailsParams;
import org.xplatform.game_broadcasting.impl.presentation.zone.GameZoneWebView;
import org.xplatform.special_event.impl.special_event_tab.presentation.model.SpecialEventTab;
import org.xplatform.special_event.impl.special_event_tab.presentation.model.SpecialEventTabScreenParams;
import org.xplatform.sportgame.bets_on_players.api.navigation.BetsOnPlayersScreenParams;
import org.xplatform.sportgame.classic.impl.presentation.legacy.adapters.gameinfo.main.viewholders.CardWithTimerViewHolderKt$cardWithTimerDelegate$2$layoutManager$1;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;
import org.xplatform.uikit.components.account_info.DsAccountInfo;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dg implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6023a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ dg(w940 w940Var, Intent intent, String str, String str2, k9h0 k9h0Var) {
        this.f6023a = (byte) 22;
        this.d = w940Var;
        this.e = intent;
        this.b = str;
        this.c = str2;
        this.f = k9h0Var;
    }

    private final Object a(Object obj) {
        cp cpVar = (cp) this.b;
        List list = (List) this.c;
        gkz gkzVar = (gkz) this.d;
        List list2 = (List) this.e;
        bbl0 bbl0Var = (bbl0) this.f;
        ((List) obj).getClass();
        xsx xsxVar = (xsx) cpVar.u;
        int size = list.size();
        int size2 = ((qwl0) cpVar.u()).f29440a.size();
        ImageView imageView = xsxVar.b;
        TextView textView = xsxVar.l;
        imageView.setVisibility(!((qwl0) cpVar.u()).f29440a.isEmpty() ? 0 : 8);
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            RoundCornerImageView roundCornerImageView = (RoundCornerImageView) obj2;
            if (i < size2) {
                roundCornerImageView.setVisibility(0);
                List list3 = u0d.f34849a;
                u0d.j(roundCornerImageView, (String) ((qwl0) cpVar.u()).f29440a.get(i), 0, 0, null, new g18((Object) roundCornerImageView, (Object) list2, i, (byte) 18), new z08((Object) list2, i, (byte) 20), 126);
                dyb.c0(roundCornerImageView, new g18((Object) bbl0Var, i, (Object) cpVar, (byte) 19));
            } else {
                roundCornerImageView.getClass();
                roundCornerImageView.setVisibility(i != 0 ? 4 : 0);
                Object obj3 = list2.get(i);
                obj3.getClass();
                ((View) obj3).setVisibility(i == 0 ? 0 : 4);
            }
            i = i2;
        }
        if (size2 > size) {
            textView.setText("+" + (size2 - size));
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        gkzVar.A(((qwl0) cpVar.u()).b);
        return Unit.f46060a;
    }

    private final Object b(Object obj) {
        yx5 yx5Var = (yx5) this.b;
        SpecialEventTabScreenParams specialEventTabScreenParams = (SpecialEventTabScreenParams) this.c;
        ujd ujdVar = (ujd) this.d;
        dcv0 dcv0Var = (dcv0) this.e;
        i3t0 i3t0Var = (i3t0) this.f;
        ((lwk) obj).getClass();
        final ndn0 ndn0Var = new ndn0(1, i3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 26);
        SpecialEventTab specialEventTab = specialEventTabScreenParams.c;
        int i = specialEventTabScreenParams.f46974a;
        final byte b = 0;
        ujdVar.c(yx5Var, specialEventTab.a(i), new Function1() { // from class: a.yao0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                byte b2 = b;
                ndn0 ndn0Var2 = ndn0Var;
                switch (b2) {
                    case 0:
                        uid uidVar = (uid) obj2;
                        uidVar.getClass();
                        ndn0Var2.invoke(new nqk0(uidVar));
                        break;
                    default:
                        lbv0 lbv0Var = (lbv0) obj2;
                        lbv0Var.getClass();
                        ndn0Var2.invoke(new nrk0(lbv0Var));
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b2 = 1;
        dcv0Var.b(yx5Var, specialEventTab.a(i), new Function1() { // from class: a.yao0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                byte b3 = b2;
                ndn0 ndn0Var2 = ndn0Var;
                switch (b3) {
                    case 0:
                        uid uidVar = (uid) obj2;
                        uidVar.getClass();
                        ndn0Var2.invoke(new nqk0(uidVar));
                        break;
                    default:
                        lbv0 lbv0Var = (lbv0) obj2;
                        lbv0Var.getClass();
                        ndn0Var2.invoke(new nrk0(lbv0Var));
                        break;
                }
                return Unit.f46060a;
            }
        });
        return new u43(ujdVar, yx5Var, dcv0Var, (byte) 9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v19, types: [android.view.LayoutInflater] */
    /* JADX WARN: Type inference failed for: r1v81, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r25v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r25v6, types: [java.lang.Throwable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        g7z g7zVar;
        Drawable drawable;
        Drawable drawableY;
        byte b = this.f6023a;
        byte b2 = 22;
        byte b3 = 5;
        byte b4 = 4;
        byte b5 = 19;
        byte b6 = 3;
        byte b7 = 8;
        boolean zBooleanValue = false;
        Drawable drawableY2 = null;
        Object obj2 = this.b;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                String str = (String) obj4;
                Function0 function0 = (Function0) obj3;
                DsAccountInfo dsAccountInfo = (DsAccountInfo) obj;
                dsAccountInfo.getClass();
                dsAccountInfo.setButtonText((String) obj2);
                dsAccountInfo.setButtonIconRes(R.drawable.ic_glyph_chevron_right_small);
                dsAccountInfo.setLabel((String) obj6);
                pn40 pn40Var = pn40.f27267a;
                Double dI = kotlin.text.b.i((String) obj5);
                dsAccountInfo.setModel(new ke(pn40.k("", dI != null ? dI.doubleValue() : 0.0d), str));
                dsAccountInfo.setButtonClickListener(new c0(function0, (byte) 2));
                return Unit.f46060a;
            case 1:
                ejz ejzVar = (ejz) obj;
                uiz uizVar = ((e03) obj6).f6971a;
                ejzVar.h = (a8q0) obj2;
                ejzVar.i = (k3x) obj5;
                ejzVar.c = (nej0) obj4;
                ejzVar.d = (Function1) obj3;
                ejzVar.e = uizVar != null ? uizVar.p : null;
                ejzVar.f = uizVar != null ? uizVar.q : null;
                ejzVar.g = uizVar != null ? (wgu0) mbc.R(uizVar, bmd.t) : null;
                return Unit.f46060a;
            case 2:
                rmb0 rmb0Var = (rmb0) obj6;
                rmb0Var.p.addView(rmb0Var, rmb0Var.q);
                rmb0Var.o((Function0) obj3, (wmb0) obj5, (String) obj2, (k6z) obj4);
                return new ty2(rmb0Var, (byte) 1);
            case 3:
                pu7 pu7Var = (pu7) obj;
                pu7Var.getClass();
                return new ru7(pu7Var, (ctf0) obj2, ((BetsOnPlayersScreenParams) obj6).c, ((ntu) obj5).a(), ((pru) obj4).a().g, ((bzt) obj3).f3488a.a().r);
            case 4:
                a4x a4xVar = (a4x) obj2;
                Function1 function1 = (Function1) obj4;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hcz.e(hczVar, "DEFAULT_LANGUAGES_HEADER_KEY", null, new ugd(-1573353699, true, new yz8((jjm) obj6, (byte) 0)), 2);
                hcz.e(hczVar, "ALL_LANGUAGES_CELL_KEY", null, new ugd(1040504340, true, new ab4(obj5, (Object) function1, (byte) 10)), 2);
                hcz.e(hczVar, "AVAILABLE_LANGUAGES_HEADER_KEY", null, new ugd(1586896981, true, new yz8((jjm) obj3, (byte) 1)), 2);
                hczVar.f(a4xVar.size(), new dx8(xdx.E(a4xVar, new cp8((byte) 19)), (byte) 1), new at7(new cp8((byte) 20), a4xVar, (byte) 7), new ugd(-1311333631, true, new vb(a4xVar, function1, (byte) 14)));
                return Unit.f46060a;
            case 5:
                ExoPlayer exoPlayer = (ExoPlayer) obj2;
                ((lwk) obj).getClass();
                l69 l69Var = new l69((cgk0) obj6, (dfu0) obj5, (pz40) obj4, (pz40) obj3);
                ((ulo) exoPlayer).m.a(l69Var);
                return new pr0(exoPlayer, l69Var, b4);
            case 6:
                Context context = (Context) obj;
                context.getClass();
                GameZoneWebView gameZoneWebView = new GameZoneWebView(context, null);
                gameZoneWebView.setOnMediaFileReddy(new xx((pz40) obj6, (byte) 17));
                gameZoneWebView.setOnError(new xx((pz40) obj5, (byte) 18));
                gameZoneWebView.setOnInternalError(new xx((pz40) obj4, (byte) 19));
                gameZoneWebView.setJavascriptInterface((x3w0) obj2);
                ((pz40) obj3).setValue(gameZoneWebView);
                return gameZoneWebView;
            case 7:
                final bbl0 bbl0Var = (bbl0) obj3;
                cp cpVar = (cp) obj;
                cpVar.getClass();
                vqa vqaVar = new vqa(lwf.f);
                final byte b8 = 1;
                gbn gbnVar = new gbn(new ogj0(b5), new asj0(b6, (byte) 0), new Function1() { // from class: a.zrw
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        byte b9 = b8;
                        bbl0 bbl0Var2 = bbl0Var;
                        cp cpVar2 = (cp) obj7;
                        switch (b9) {
                            case 0:
                                cpVar2.getClass();
                                gkz gkzVar = new gkz(xrw.g);
                                gkzVar.d.b(new gbn(new x2w((byte) 25), new pkv(3, (byte) 18), new h7w((byte) 11), btv.n));
                                rsx rsxVar = (rsx) cpVar2.u;
                                RecyclerView recyclerView = rsxVar.d;
                                Context context2 = cpVar2.w;
                                recyclerView.m(new qmk0(context2.getResources().getDimensionPixelSize(R.dimen.space_2), 0, context2.getResources().getDimensionPixelSize(R.dimen.space_2), 0, context2.getResources().getDimensionPixelSize(R.dimen.space_2), 1, null, null, 458));
                                rsxVar.d.setAdapter(gkzVar);
                                dyb.b0(rsxVar.b, ymx.INTERVAL_400, new asw(bbl0Var2, cpVar2, (byte) 0));
                                cpVar2.t(new xg(cpVar2, (Object) gkzVar, cpVar2, (byte) 7));
                                cpVar2.x(new bb(cpVar2, (byte) 8));
                                break;
                            default:
                                cpVar2.getClass();
                                gkz gkzVar2 = new gkz(prj0.j);
                                gkzVar2.d.b(new gbn(new ogj0((byte) 15), new gsh0(3, (byte) 28), new thj0((byte) 9), wjj0.e));
                                wsx wsxVar = (wsx) cpVar2.u;
                                wsxVar.c.setAdapter(gkzVar2);
                                wsxVar.c.m(new qmk0(cpVar2.w.getResources().getDimensionPixelSize(R.dimen.space_8)));
                                dyb.b0(wsxVar.b, ymx.INTERVAL_400, new asw(bbl0Var2, cpVar2, (byte) 3));
                                cpVar2.t(new if6(gkzVar2, cpVar2, gkzVar2, cpVar2));
                                cpVar2.x(new bb(cpVar2, (byte) 17));
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, wjj0.g);
                dp dpVar = vqaVar.d;
                dpVar.b(gbnVar);
                shq0 shq0Var = new shq0(b3);
                byte b9 = 18;
                dpVar.b(new gbn(shq0Var, new d8q0(b6, b6), new t6q0(b9), pfo0.l));
                byte b10 = 26;
                dpVar.b(new gbn(new jbp(b10), new atq(b6, (byte) 0), new rnp(b9), gzn.x));
                dpVar.b(new gbn(new ht80((byte) 29), new iv60(b6, b4), new ev80((byte) 23), xk60.g));
                dpVar.b(new gbn(new ei20((byte) 20), new tvx(b6, (byte) 23), new bw20((cbl0) obj2, bbl0Var, b4), gvy.y));
                dpVar.b(new gbn(new kyz((byte) 12), new tvx(b6, (byte) 15), new u400((cbl0) obj4, bbl0Var, b6), gvy.p));
                dpVar.b(new gbn(new ht80((byte) 22), new iv60(b6, (byte) 2), new vca((bbl0) obj5, b4), xk60.e));
                dpVar.b(new gbn(new b4u0((byte) 24), new d8q0(b6, b10), new d4u0((byte) 17), mnu0.e));
                dpVar.b(new gbn(new gcl0((byte) 20), new asj0(b6, (byte) 9), new j1l0((bbl0) obj6, (byte) 10), wjj0.p));
                final byte b11 = 0;
                dpVar.b(new gbn(new x2w(b10), new pkv(b6, (byte) 19), new Function1() { // from class: a.zrw
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj7) {
                        byte b12 = b11;
                        bbl0 bbl0Var2 = bbl0Var;
                        cp cpVar2 = (cp) obj7;
                        switch (b12) {
                            case 0:
                                cpVar2.getClass();
                                gkz gkzVar = new gkz(xrw.g);
                                gkzVar.d.b(new gbn(new x2w((byte) 25), new pkv(3, (byte) 18), new h7w((byte) 11), btv.n));
                                rsx rsxVar = (rsx) cpVar2.u;
                                RecyclerView recyclerView = rsxVar.d;
                                Context context2 = cpVar2.w;
                                recyclerView.m(new qmk0(context2.getResources().getDimensionPixelSize(R.dimen.space_2), 0, context2.getResources().getDimensionPixelSize(R.dimen.space_2), 0, context2.getResources().getDimensionPixelSize(R.dimen.space_2), 1, null, null, 458));
                                rsxVar.d.setAdapter(gkzVar);
                                dyb.b0(rsxVar.b, ymx.INTERVAL_400, new asw(bbl0Var2, cpVar2, (byte) 0));
                                cpVar2.t(new xg(cpVar2, (Object) gkzVar, cpVar2, (byte) 7));
                                cpVar2.x(new bb(cpVar2, (byte) 8));
                                break;
                            default:
                                cpVar2.getClass();
                                gkz gkzVar2 = new gkz(prj0.j);
                                gkzVar2.d.b(new gbn(new ogj0((byte) 15), new gsh0(3, (byte) 28), new thj0((byte) 9), wjj0.e));
                                wsx wsxVar = (wsx) cpVar2.u;
                                wsxVar.c.setAdapter(gkzVar2);
                                wsxVar.c.m(new qmk0(cpVar2.w.getResources().getDimensionPixelSize(R.dimen.space_8)));
                                dyb.b0(wsxVar.b, ymx.INTERVAL_400, new asw(bbl0Var2, cpVar2, (byte) 3));
                                cpVar2.t(new if6(gkzVar2, cpVar2, gkzVar2, cpVar2));
                                cpVar2.x(new bb(cpVar2, (byte) 17));
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, btv.o));
                CardWithTimerViewHolderKt$cardWithTimerDelegate$2$layoutManager$1 cardWithTimerViewHolderKt$cardWithTimerDelegate$2$layoutManager$1 = new CardWithTimerViewHolderKt$cardWithTimerDelegate$2$layoutManager$1(cpVar.w);
                atx atxVar = (atx) cpVar.u;
                atxVar.b.setAdapter(vqaVar);
                atxVar.b.setLayoutManager(cardWithTimerViewHolderKt$cardWithTimerDelegate$2$layoutManager$1);
                cpVar.t(new op7(vqaVar, cpVar, (byte) 22));
                return Unit.f46060a;
            case 8:
                w03 w03Var = (w03) obj6;
                jge0 jge0Var = (jge0) obj5;
                ucs0 ucs0Var = (ucs0) obj4;
                List list = (List) obj3;
                g7z g7zVar2 = (g7z) obj;
                g7zVar2.getClass();
                nn8 nn8Var = (nn8) ((l7m0) obj2).getValue();
                w03Var.i();
                a6a a6aVar = g7zVar2.f10839a;
                jge0 jge0VarR = k9x.r(0L, a6aVar.d());
                float f = nn8Var.d;
                float f2 = nn8Var.b;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
                float f3 = nn8Var.d;
                w03.b(w03Var, r8x.u(jge0VarR, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), 0L, 0L));
                nr nrVar = a6aVar.b;
                long jP = nrVar.p();
                nrVar.i().l();
                try {
                    ((fvt0) nrVar.b).i(w03Var);
                    if (f2 > 0.0f) {
                        pz40 pz40Var = s6t0.f31722a;
                        g7zVar = g7zVar2;
                        fhl.u(g7zVar, s6t0.b().f33626a.getBackground(), 0L, 0L, 0.0f, null, null, 0, 126);
                    } else {
                        g7zVar = g7zVar2;
                    }
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (a6aVar.d() & 4294967295L)) * (f2 > 0.0f ? 1.0f - f2 : nn8Var.f23808a);
                    if (fIntBitsToFloat > 0.0f) {
                        a6aVar.b.i().r(jge0Var, ucs0Var);
                        g7zVar.a();
                        fhl.r(g7zVar, yk5.n(list, Float.intBitsToFloat((int) (a6aVar.d() & 4294967295L)) - fIntBitsToFloat, Float.intBitsToFloat((int) (a6aVar.d() & 4294967295L)), 8), 0L, 0L, 0.0f, null, null, 6, 62);
                        a6aVar.b.i().i();
                    } else {
                        g7zVar.a();
                    }
                    return Unit.f46060a;
                } finally {
                    defpackage.c.g(nrVar, jP);
                }
            case 9:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                qjj.W((vne) obj2, null, null, new obd((d9d0) obj4, (pz40) obj3, null, (byte) 0), 3);
                ((pz40) obj6).setValue(Boolean.FALSE);
                ((pz40) obj5).setValue(bool);
                return Unit.f46060a;
            case 10:
                a4x a4xVar2 = (a4x) obj2;
                xcz xczVar = (xcz) obj6;
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj5;
                Map map = (Map) obj4;
                Function1 function2 = (Function1) obj3;
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                rfk0 rfk0VarJ = vdx.J();
                Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
                rfk0 rfk0VarW = vdx.W(rfk0VarJ);
                try {
                    xczVar.k(xczVar.h(), xczVar.i());
                    vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                    Iterator it = a4xVar2.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i2 = i + 1;
                        if (i < 0) {
                            q3d.p();
                            throw null;
                        }
                        wbg wbgVar = (wbg) next;
                        h7h h7hVar = wbgVar.f38876a;
                        long j = h7hVar.f12573a;
                        l7m0 l7m0Var = (l7m0) xp20.d(linkedHashMap, Long.valueOf(j));
                        Long lValueOf = Long.valueOf(j);
                        Object obj7 = map.get(lValueOf);
                        Object obj8 = obj7;
                        if (obj7 == null) {
                            ngk0 ngk0Var = new ngk0();
                            map.put(lValueOf, ngk0Var);
                            obj8 = ngk0Var;
                        }
                        ngk0 ngk0Var2 = (ngk0) obj8;
                        if (i > 0) {
                            hczVar2.d(dw9.o(j, "_gap"), "sub_game_gap", fre0.f10016a);
                        }
                        hczVar2.d(dw9.o(j, "_header"), "sub_game_header", new ugd(577283153, true, new ab4((Object) wbgVar, (Object) function2, (byte) 28)));
                        Iterator it2 = h7hVar.g.iterator();
                        int i3 = 0;
                        while (it2.hasNext()) {
                            Object next2 = it2.next();
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                q3d.p();
                                throw null;
                            }
                            b7h b7hVar = (b7h) next2;
                            Iterator it3 = it;
                            Function1 function3 = function2;
                            hczVar2.d(j + BundleUtil.UNDERLINE_TAG + i3 + BundleUtil.UNDERLINE_TAG + b7hVar.f2108a, "market_group", new ugd(169587854, true, new rbg(i3, h7hVar, l7m0Var, wbgVar, ngk0Var2, b7hVar, function3)));
                            it = it3;
                            it2 = it2;
                            i3 = i4;
                            function2 = function3;
                        }
                        hczVar2.d(dw9.o(j, "_footer"), "sub_game_footer", new ugd(594107962, true, new v7i0(l7m0Var, (byte) 21)));
                        it = it;
                        i = i2;
                        function2 = function2;
                    }
                    return Unit.f46060a;
                } catch (Throwable th) {
                    vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                    throw th;
                }
            case 11:
                ujd ujdVar = (ujd) obj2;
                ooq0 ooq0Var = (ooq0) obj6;
                wdk0 wdk0Var = (wdk0) obj5;
                Fragment fragment = (Fragment) obj4;
                k3t0 k3t0Var = (k3t0) obj3;
                ujw ujwVar = (ujw) obj;
                ujwVar.getClass();
                if (ujwVar instanceof qjw) {
                    ujdVar.b(fragment, ((qjw) ujwVar).f28860a);
                } else if (ujwVar instanceof tjw) {
                    androidx.fragment.app.e eVarC = fragment.C();
                    eVarC.getClass();
                    if (!tdc.T(eVarC)) {
                        roq0 roq0VarA = ooq0Var.a();
                        androidx.fragment.app.e eVarC2 = fragment.C();
                        eVarC2.getClass();
                        uuz uuzVar = fk60.b;
                        roq0VarA.d(eVarC2, 7, "");
                    }
                } else {
                    if (!(ujwVar instanceof sjw)) {
                        t9f.b();
                        return null;
                    }
                    wdk0.k(wdk0Var, ((sjw) ujwVar).f32321a, fragment, null, null, false, null, 1020);
                }
                k3t0Var.x(bgw.f2577a);
                return Unit.f46060a;
            case 12:
                Calendar calendar = (Calendar) obj6;
                pz40 pz40Var2 = (pz40) obj5;
                pz40 pz40Var3 = (pz40) obj4;
                pz40 pz40Var4 = (pz40) obj3;
                long jLongValue = ((Long) obj).longValue();
                if (!((Boolean) ((pz40) obj2).getValue()).booleanValue()) {
                    return Unit.f46060a;
                }
                calendar.setTimeInMillis(jLongValue);
                SimpleDate simpleDate = new SimpleDate(calendar.get(1), calendar.get(2) + 1, calendar.get(5));
                int iOrdinal = ((am) pz40Var2.getValue()).ordinal();
                if (iOrdinal == 0) {
                    ((Function1) pz40Var3.getValue()).invoke(simpleDate);
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return null;
                    }
                    ((Function1) pz40Var4.getValue()).invoke(simpleDate);
                }
                return Unit.f46060a;
            case 13:
                return new elj(this.b, (Set) obj6, (Set) obj5, (pz40) obj4, (pz40) obj3);
            case 14:
                List list2 = (List) obj2;
                i8z i8zVar = (i8z) obj;
                i8zVar.getClass();
                i8zVar.e(list2.size(), new vtf(new j2l((byte) 14), list2, (byte) 25), null, new bzh(list2, (byte) 8), new ugd(-1942245546, true, new vll(list2, (pt0) obj6, (Function1) obj5, (Function1) obj4, (Function1) obj3, (byte) 0)));
                return Unit.f46060a;
            case 15:
                cp cpVar2 = (cp) obj2;
                ((List) obj).getClass();
                pkd.h(((vjd) cpVar2.u).b, pek0.g, null, new ugd(-1671680503, true, new cqk((Object) cpVar2, obj6, obj5, obj4, obj3, (byte) 10)));
                return Unit.f46060a;
            case 16:
                ejm ejmVar = (ejm) obj2;
                ezj ezjVar = (ezj) obj6;
                gy40 gy40Var = (gy40) obj5;
                Function2 function4 = (Function2) obj4;
                ngk0 ngk0Var3 = (ngk0) obj3;
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                if (ejmVar instanceof djm) {
                    hcz.g(hczVar3, ((djm) ejmVar).f6194a == xim.f40952a ? 12 : 6, null, null, new ugd(-858666316, true, new awh(ejmVar, (byte) 28)), 6);
                } else {
                    if (!(ejmVar instanceof cjm)) {
                        t9f.b();
                        return null;
                    }
                    i4 i4Var = ((cjm) ejmVar).f4467a;
                    hczVar3.f(i4Var.size(), new v2m(xdx.E(i4Var, new aim((byte) 24)), (byte) 17), new pn7(i4Var, (byte) 1), new ugd(-1311333631, true, new w2m(i4Var, ejmVar, ezjVar, gy40Var, function4, ngk0Var3, (byte) 1)));
                }
                return Unit.f46060a;
            case 17:
                Context context2 = (Context) obj2;
                cjj0 cjj0Var = (cjj0) obj6;
                e8o0 e8o0Var = (e8o0) obj;
                e8o0Var.getClass();
                TextView textView = e8o0Var.g;
                zij0 zij0Var = cjj0Var.f4463a;
                textView.setText(zij0Var.f44442a.c(context2));
                textView.setBackground(context2.getDrawable(zij0Var.b));
                TextView textView2 = e8o0Var.f;
                wij0 wij0Var = cjj0Var.b;
                textView2.setText(wij0Var.f39216a.c(context2));
                textView2.setBackground(context2.getDrawable(wij0Var.b));
                acb.I(e8o0Var, cjj0Var);
                acb.H(e8o0Var.d, cjj0Var.c, (List) obj5);
                acb.H(e8o0Var.b, cjj0Var.d, (List) obj4);
                List list3 = u0d.f34849a;
                u0d.j(e8o0Var.c, cjj0Var.f, 0, 0, null, null, null, 510);
                acb.J(e8o0Var, g1x.u((clz) obj3), cjj0Var);
                return Unit.f46060a;
            case 18:
                p8o0 p8o0Var = (p8o0) obj6;
                List list4 = (List) obj5;
                List list5 = (List) obj4;
                Animation animation = (Animation) obj3;
                n8o0 n8o0Var = (n8o0) obj;
                n8o0Var.getClass();
                ConstraintLayout constraintLayout = n8o0Var.f23101a;
                ImageView imageView = n8o0Var.c;
                constraintLayout.setBackground(sj3.U(p8o0Var.d, (Context) obj2));
                ?? r1 = n8o0Var.d;
                ArrayList arrayList = p8o0Var.c;
                Iterator it4 = new ihu0(r1).iterator();
                int i5 = 0;
                while (true) {
                    jhu0 jhu0Var = (jhu0) it4;
                    if (jhu0Var.hasNext()) {
                        Object next3 = jhu0Var.next();
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            q3d.p();
                            throw null;
                        }
                        ((View) next3).setVisibility(i5 < arrayList.size() ? 0 : 8);
                        i5 = i6;
                    } else {
                        int i7 = 0;
                        for (Object obj9 : arrayList) {
                            int i8 = i7 + 1;
                            if (i7 < 0) {
                                ?? r25 = drawableY2;
                                q3d.p();
                                throw r25;
                            }
                            String str2 = (String) obj9;
                            o8o0 o8o0Var = (o8o0) CollectionsKt.W(i7, list4);
                            if (o8o0Var == null) {
                                View viewInflate = LayoutInflater.from(r1.getContext()).inflate(R.layout.synthetic_tennis_player_image, r1, false);
                                drawable = drawableY2;
                                ShapeableImageView shapeableImageView = (ShapeableImageView) yum0.f(viewInflate, R.id.ivPlayer);
                                if (shapeableImageView == null) {
                                    hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.ivPlayer)));
                                    return drawable;
                                }
                                FrameLayout frameLayout = (FrameLayout) viewInflate;
                                o8o0 o8o0Var2 = new o8o0(frameLayout, shapeableImageView);
                                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                                layoutParams.getClass();
                                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                                layoutParams2.setMargins(i7 * sj3.X(16), 0, 0, 0);
                                frameLayout.setLayoutParams(layoutParams2);
                                r1.addView(frameLayout);
                                list4.add(o8o0Var2);
                                o8o0Var = o8o0Var2;
                            } else {
                                drawable = drawableY2;
                            }
                            ShapeableImageView shapeableImageView2 = o8o0Var.b;
                            if (str2.length() > 0) {
                                List list6 = u0d.f34849a;
                                qzw qzwVar = qzw.f29598a;
                                u0d.n(shapeableImageView2, str2, 0, 10);
                                shapeableImageView2.setVisibility(0);
                            } else {
                                shapeableImageView2.setVisibility(8);
                            }
                            i7 = i8;
                            drawableY2 = drawable;
                        }
                        ?? r26 = drawableY2;
                        n8o0Var.e.setText(p8o0Var.b);
                        LinearLayout linearLayout = n8o0Var.b;
                        ArrayList arrayList2 = p8o0Var.e;
                        Iterator it5 = new ihu0(linearLayout).iterator();
                        int i9 = 0;
                        while (true) {
                            jhu0 jhu0Var2 = (jhu0) it5;
                            if (!jhu0Var2.hasNext()) {
                                int i10 = 0;
                                for (Object obj10 : arrayList2) {
                                    int i11 = i10 + 1;
                                    if (i10 < 0) {
                                        q3d.p();
                                        throw r26;
                                    }
                                    String str3 = (String) obj10;
                                    sth sthVarA = (sth) CollectionsKt.W(i10, list5);
                                    if (sthVarA == null) {
                                        sthVarA = sth.a(LayoutInflater.from(linearLayout.getContext()), linearLayout);
                                        linearLayout.addView(sthVarA.f32772a);
                                        list5.add(sthVarA);
                                    }
                                    sthVarA.b.setText(str3);
                                    i10 = i11;
                                }
                                animation.getClass();
                                if (p8o0Var.f) {
                                    imageView.setVisibility(0);
                                    imageView.startAnimation(animation);
                                } else {
                                    imageView.setVisibility(8);
                                    imageView.clearAnimation();
                                }
                                return Unit.f46060a;
                            }
                            Object next4 = jhu0Var2.next();
                            int i12 = i9 + 1;
                            if (i9 < 0) {
                                q3d.p();
                                throw r26;
                            }
                            ((View) next4).setVisibility(i9 < arrayList2.size() ? 0 : 8);
                            i9 = i12;
                        }
                    }
                }
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                o0x o0xVar = (o0x) obj6;
                s4s s4sVar = (s4s) obj5;
                ljc0 ljc0Var = (ljc0) obj4;
                Function2 function5 = (Function2) obj3;
                if (((o0x) obj2).equals(o0xVar)) {
                    zBooleanValue = Boolean.FALSE.booleanValue();
                } else {
                    s4sVar.getPictureImageView().h(o0xVar, s4sVar.b, new p4s(s4sVar, o0xVar, function5, (byte) 1), ljc0Var);
                }
                return Boolean.valueOf(zBooleanValue);
            case 20:
                zls zlsVar = (zls) obj6;
                pz40 pz40Var5 = (pz40) obj5;
                pz40 pz40Var6 = (pz40) obj4;
                pz40 pz40Var7 = (pz40) obj3;
                a9q0 a9q0Var = (a9q0) obj;
                a9q0Var.getClass();
                float fR0 = ((w6k) obj2).r0((int) (a9q0Var.c & 4294967295L));
                if (!ycl.b(((ycl) pz40Var5.getValue()).f42389a, Float.NaN) || zlsVar.b) {
                    pz40Var7.setValue(new ycl(fR0));
                    pz40Var6.setValue(Boolean.valueOf(a9q0Var.b.f > 5));
                } else if (a9q0Var.f()) {
                    pz40Var6.setValue(Boolean.TRUE);
                    pz40Var5.setValue(new ycl(fR0));
                }
                return Unit.f46060a;
            case 21:
                r0x r0xVar = (r0x) obj2;
                o0x o0xVar2 = (o0x) obj6;
                o0x o0xVar3 = (o0x) obj5;
                Function1 function6 = (Function1) obj4;
                Function1 function7 = (Function1) obj3;
                ((Context) obj).getClass();
                r0xVar.a(o0xVar2);
                ImageView imageView2 = r0xVar.f29650a;
                imageView2.setVisibility((o0xVar2.c() && o0xVar3 == null) ? (byte) 8 : (byte) 0);
                Object objX = s0x.X(o0xVar2);
                gbe0 gbe0VarA = o5k0.a(imageView2.getContext());
                k1x k1xVar = new k1x(imageView2.getContext());
                k1xVar.c = objX;
                t1x.h(k1xVar, imageView2);
                vi9 vi9Var = vi9.c;
                k1xVar.n = vi9Var;
                k1xVar.m = vi9Var;
                k1xVar.o = vi9Var;
                if (o0xVar3 != null) {
                    Context context3 = imageView2.getContext();
                    context3.getClass();
                    drawableY = s0x.Y(o0xVar3, context3);
                } else {
                    drawableY = null;
                }
                t1x.g(k1xVar, drawableY);
                if (o0xVar3 != null) {
                    Context context4 = imageView2.getContext();
                    context4.getClass();
                    drawableY2 = s0x.Y(o0xVar3, context4);
                }
                t1x.d(k1xVar, drawableY2);
                k1xVar.e = new ywu(function6, r0xVar, function7, b4);
                t1x.b(k1xVar, true);
                return gbe0VarA.a(k1xVar.a());
            case 22:
                k9h0 k9h0Var = (k9h0) obj3;
                t760.a(((w940) obj5).g.a(), (Intent) obj4, (String) obj2, (String) obj6, xvw.I(k9h0Var), (Bitmap) obj, null, k9h0Var.toString(), 0, null, 928);
                return Unit.f46060a;
            case 23:
                iu40 iu40Var = (iu40) obj2;
                mie0 mie0Var = (mie0) obj6;
                jie0 jie0Var = (jie0) obj5;
                sch0 sch0Var = (sch0) obj4;
                hie0 hie0Var = (hie0) obj3;
                float fFloatValue = ((Float) obj).floatValue();
                eu40 eu40VarG = iu40.g(iu40Var.g);
                if (eu40VarG != null) {
                    zri zriVar = iu40Var.e;
                    long j2 = eu40VarG.b;
                    long j3 = eu40VarG.f8401a;
                    ((i6u0) zriVar.b).a(Float.intBitsToFloat((int) (j3 >> 32)), j2);
                    ((i6u0) zriVar.c).a(Float.intBitsToFloat((int) (j3 & 4294967295L)), j2);
                    eu40 eu40VarA = ((eu40) mie0Var.f21842a).a(eu40VarG);
                    mie0Var.f21842a = eu40VarA;
                    float fJ = sch0Var.j(sch0Var.f(eu40VarA.f8401a));
                    jie0Var.f16571a = fJ;
                    hie0Var.f13108a = !k7x.Q(fJ - fFloatValue);
                }
                return Boolean.valueOf(eu40VarG != null);
            case 24:
                clz clzVar = (clz) obj2;
                ((lwk) obj).getClass();
                co coVar = new co((nac0) obj6, (cqq) obj5, (pkk0) obj4, (pz40) obj3, (byte) 1);
                clzVar.x().a(coVar);
                return new pr0(clzVar, coVar, b5);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                frc0 frc0Var = (frc0) obj2;
                hcz hczVar4 = (hcz) obj;
                hczVar4.getClass();
                hcz.e(hczVar4, null, null, new ugd(-16132950, true, new rqc0(frc0Var, zBooleanValue ? (byte) 1 : (byte) 0)), 3);
                hcz.e(hczVar4, null, null, new ugd(-2069801453, true, new sqc0(frc0Var, (Function1) obj6, (Function1) obj5, zBooleanValue ? (byte) 1 : (byte) 0)), 3);
                hcz.e(hczVar4, null, null, new ugd(-392778126, true, new in80((nuc0) obj4, (Function1) obj3, b7)), 3);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                hcz hczVar5 = (hcz) obj;
                hczVar5.getClass();
                a4x a4xVar3 = ((qsm) obj2).c;
                hczVar5.f(a4xVar3.size(), new o3l0(new jak0(b2), a4xVar3, b3), new y9k0(a4xVar3, b7), new ugd(2039820996, true, new vll(a4xVar3, (xdr) obj6, (Function1) obj5, (ngk0) obj4, (pz40) obj3, (byte) 3)));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return a(obj);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return b(obj);
            default:
                ctf0 ctf0Var = (ctf0) obj6;
                g2v g2vVar = (g2v) obj5;
                y78 y78Var = (y78) obj4;
                wiu wiuVar = (wiu) obj3;
                mbp0 mbp0Var = (mbp0) obj;
                mbp0Var.getClass();
                long j4 = ((TeamDetailsParams) obj2).f46569a;
                if (j4 == 46) {
                    return new bsf(mbp0Var, ctf0Var, g2vVar, y78Var, wiuVar.a(), (byte) 0);
                }
                if (j4 == 1) {
                    return new z19(mbp0Var, ctf0Var, g2vVar, y78Var, wiuVar.a());
                }
                if (j4 == 2) {
                    return new bsf(mbp0Var, ctf0Var, g2vVar, y78Var, wiuVar.a(), (byte) 1);
                }
                if (j4 == 15) {
                    return new bsf(mbp0Var, ctf0Var, g2vVar, y78Var, wiuVar.a(), (byte) 2);
                }
                return j4 == 27 ? new bsf(mbp0Var, ctf0Var, g2vVar, y78Var, wiuVar.a(), (byte) 3) : new zun(g2vVar);
        }
    }

    public /* synthetic */ dg(rmb0 rmb0Var, Function0 function0, wmb0 wmb0Var, String str, k6z k6zVar) {
        this.f6023a = (byte) 2;
        this.c = rmb0Var;
        this.f = function0;
        this.d = wmb0Var;
        this.b = str;
        this.e = k6zVar;
    }

    public /* synthetic */ dg(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.f6023a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
