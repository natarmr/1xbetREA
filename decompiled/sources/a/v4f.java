package a;

import a.csu0;
import a.m1r;
import a.ufx;
import a.y4h;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.os.CancellationSignal;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.calendar.impl.presentation.content.calendarperiod.CyberCalendarPeriodView;
import org.xplatform.cyber.cyberstatistic.api.navigation.CyberGameStatisticScreenParams;
import org.xplatform.cyber.game.core.betting.domain.model.RelatedParams;
import org.xplatform.cyber.game.counterstrike.api.Cs2GameScreenParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.section.api.presentation.CyberMainDisciplinesParams;
import org.xplatform.cyber.section.api.presentation.EsportsGamesScreenParams;
import org.xplatform.cyber.section.api.virtualrecommended.VirtualRecommendedEventsParams;
import org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$esportsGamesScreen$1;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlocksParams;
import org.xplatform.cyber.statistics_blocks.impl.navigation.CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v4f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36775a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v4f(Object obj, Object obj2, byte b) {
        this.f36775a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List listV;
        Object value;
        lpg lpgVar;
        Object value2;
        lpg lpgVar2;
        ljg ljgVar;
        byte b = this.f36775a;
        byte b2 = 6;
        yje yjeVar = null;
        char c = 1;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                r7f r7fVar = (r7f) obj3;
                Function0 function0 = (Function0) obj2;
                Throwable th = (Throwable) obj;
                th.getClass();
                if (!(th instanceof CancellationException)) {
                    r7fVar.U0.b(th, new u4f(r7fVar, c == true ? 1 : 0));
                    function0.invoke();
                    v3c.N(r7fVar.E1);
                    r7fVar.R(f3f.f8859a);
                    if (agc.L(th) || agc.N(th)) {
                        r7fVar.y(new t4f(r7fVar, b2));
                    }
                }
                return Unit.f46060a;
            case 1:
                CancellationSignal cancellationSignal = (CancellationSignal) obj3;
                dcf dcfVar = (dcf) obj2;
                Context context = dcfVar.d;
                BeginSignInResult beginSignInResult = (BeginSignInResult) obj;
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (ocf.a(cancellationSignal)) {
                    return Unit.f46060a;
                }
                Intent intent = new Intent(context, (Class<?>) HiddenActivity.class);
                ecf.a(dcfVar.h, intent, "BEGIN_SIGN_IN");
                intent.putExtra("EXTRA_FLOW_PENDING_INTENT", beginSignInResult.f45469a);
                try {
                    context.startActivity(intent);
                    break;
                } catch (Exception unused) {
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!ocf.a(cancellationSignal)) {
                        dcfVar.e().execute(new ccf(dcfVar, (byte) 0));
                    }
                }
                return Unit.f46060a;
            case 2:
                CancellationSignal cancellationSignal2 = (CancellationSignal) obj3;
                icf icfVar = (icf) obj2;
                Context context2 = icfVar.d;
                PendingIntent pendingIntent = (PendingIntent) obj;
                pendingIntent.getClass();
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (ocf.a(cancellationSignal2)) {
                    return Unit.f46060a;
                }
                Intent intent2 = new Intent(context2, (Class<?>) HiddenActivity.class);
                ecf.a(icfVar.h, intent2, "SIGN_IN_INTENT");
                intent2.putExtra("EXTRA_FLOW_PENDING_INTENT", pendingIntent);
                try {
                    context2.startActivity(intent2);
                    break;
                } catch (Exception unused2) {
                    CredentialProviderPlayServicesImpl.Companion.getClass();
                    if (!ocf.a(cancellationSignal2)) {
                        icfVar.e().execute(new ccf(icfVar, (byte) 1));
                    }
                }
                return Unit.f46060a;
            case 3:
                xkf xkfVar = (xkf) obj3;
                Context context3 = (Context) obj2;
                ath athVar = (ath) obj;
                athVar.getClass();
                List list = u0d.f34849a;
                ImageView imageView = athVar.c;
                ImageView imageView2 = athVar.d;
                TextView textView = athVar.f;
                tkf tkfVar = xkfVar.d;
                wkf wkfVar = xkfVar.e;
                u0d.n(imageView, tkfVar.f34091a, R.drawable.icon_globe_new, 3);
                boolean z = tkfVar.b;
                String str = tkfVar.c;
                imageView.setVisibility(z ? 0 : 8);
                textView.setVisibility(str.length() > 0 ? 0 : 8);
                textView.setText(str);
                TextView textView2 = athVar.h;
                u0d.n(imageView2, wkfVar.f39305a, R.drawable.icon_globe_new, 3);
                boolean z2 = wkfVar.b;
                String str2 = wkfVar.c;
                imageView2.setVisibility(z2 ? 0 : 8);
                textView2.setVisibility(str2.length() > 0 ? 0 : 8);
                textView2.setText(str2);
                athVar.e.setVisibility(xkfVar.f ? 0 : 8);
                athVar.g.setText(xkfVar.b);
                u0d.j(athVar.b, xkfVar.c, 0, 0, null, null, null, 510);
                athVar.f1432a.setBackground(sj3.U(xkfVar.g, context3));
                return Unit.f46060a;
            case 4:
                llf llfVar = (llf) obj3;
                ctf0 ctf0Var = (ctf0) obj2;
                bnk0 bnk0Var = (bnk0) obj;
                bnk0Var.getClass();
                String str3 = llfVar.d;
                if (str3.length() == 0) {
                    pzw.E(bnk0Var, ctf0Var.b.a(R.string.cs2_gamelog_bomb_planted_without_site, Arrays.copyOf(new Object[0], 0)), 0, R.color.static_white, 0, 0, 54);
                } else {
                    pzw.E(bnk0Var, ctf0Var.b.a(R.string.cs2_gamelog_bomb_planted, Arrays.copyOf(new Object[0], 0)), 0, R.color.static_white, 0, 0, 54);
                    pzw.E(bnk0Var, Separators.SP, 0, R.color.static_white, 0, 0, 54);
                    pzw.E(bnk0Var, str3, 0, R.color.static_white, 0, 0, 54);
                }
                pzw.E(bnk0Var, " (", 0, R.color.static_white, 0, 0, 54);
                pzw.E(bnk0Var, String.valueOf(llfVar.c), 0, R.color.cyber_game_cs2_map_terrorist, 0, 0, 54);
                pzw.E(bnk0Var, Separators.SP, 0, R.color.static_white, 0, 0, 54);
                pzw.E(bnk0Var, ctf0Var.b.a(R.string.cs2_gamelog_bomb_planted_t_vs_ct, Arrays.copyOf(new Object[0], 0)), 0, R.color.static_white, 0, 0, 54);
                pzw.E(bnk0Var, Separators.SP, 0, R.color.static_white, 0, 0, 54);
                pzw.E(bnk0Var, String.valueOf(llfVar.b), 0, R.color.cyber_game_cs2_map_ct, 0, 0, 54);
                pzw.E(bnk0Var, Separators.RPAREN, 0, R.color.static_white, 0, 0, 54);
                return Unit.f46060a;
            case 5:
                elf elfVar = (elf) obj3;
                ilf ilfVar = (ilf) obj2;
                ((lwk) obj).getClass();
                elfVar.v(ilfVar);
                return new pr0(elfVar, ilfVar, (byte) 6);
            case 6:
                lmf lmfVar = (lmf) obj3;
                Context context4 = (Context) obj2;
                dth dthVar = (dth) obj;
                dthVar.getClass();
                TextView textView3 = dthVar.K;
                jmf jmfVar = lmfVar.c;
                textView3.setText(jmfVar.b);
                List list2 = u0d.f34849a;
                u0d.n(dthVar.b, jmfVar.f16761a, R.drawable.icon_globe_new, 3);
                orf orfVar = lmfVar.d;
                dthVar.l.setText(orfVar.f25733a.b(context4));
                dthVar.f.setText(orfVar.g.b(context4));
                dthVar.h.setText(orfVar.f.b(context4));
                dthVar.g.setText(orfVar.e.b(context4));
                dthVar.j.setText(orfVar.d.b(context4));
                dthVar.k.setText(orfVar.c.b(context4));
                dthVar.i.setText(orfVar.b.b(context4));
                orf orfVar2 = lmfVar.e;
                dthVar.J.setText(orfVar2.f25733a.b(context4));
                dthVar.D.setText(orfVar2.g.b(context4));
                dthVar.F.setText(orfVar2.f.b(context4));
                dthVar.E.setText(orfVar2.e.b(context4));
                dthVar.H.setText(orfVar2.d.b(context4));
                dthVar.I.setText(orfVar2.c.b(context4));
                dthVar.G.setText(orfVar2.b.b(context4));
                orf orfVar3 = lmfVar.f;
                dthVar.R.setText(orfVar3.f25733a.b(context4));
                dthVar.L.setText(orfVar3.g.b(context4));
                dthVar.N.setText(orfVar3.f.b(context4));
                dthVar.M.setText(orfVar3.e.b(context4));
                dthVar.P.setText(orfVar3.d.b(context4));
                dthVar.Q.setText(orfVar3.c.b(context4));
                dthVar.O.setText(orfVar3.b.b(context4));
                orf orfVar4 = lmfVar.g;
                dthVar.z.setText(orfVar4.f25733a.b(context4));
                dthVar.t.setText(orfVar4.g.b(context4));
                dthVar.v.setText(orfVar4.f.b(context4));
                dthVar.u.setText(orfVar4.e.b(context4));
                dthVar.x.setText(orfVar4.d.b(context4));
                dthVar.y.setText(orfVar4.c.b(context4));
                dthVar.w.setText(orfVar4.b.b(context4));
                orf orfVar5 = lmfVar.h;
                dthVar.s.setText(orfVar5.f25733a.b(context4));
                dthVar.m.setText(orfVar5.g.b(context4));
                dthVar.o.setText(orfVar5.f.b(context4));
                dthVar.n.setText(orfVar5.e.b(context4));
                dthVar.q.setText(orfVar5.d.b(context4));
                dthVar.r.setText(orfVar5.c.b(context4));
                dthVar.p.setText(orfVar5.b.b(context4));
                boolean z3 = lmfVar.j;
                int dimensionPixelSize = context4.getResources().getDimensionPixelSize(R.dimen.space_4);
                if (z3) {
                    dthVar.f6656a.setPadding(0, 0, 0, dimensionPixelSize);
                }
                int i = lmfVar.i;
                dthVar.S.setBackground(context4.getDrawable(i));
                dthVar.A.setBackground(context4.getDrawable(i));
                dthVar.C.setBackground(context4.getDrawable(i));
                dthVar.B.setBackground(context4.getDrawable(i));
                dthVar.d.setBackground(context4.getDrawable(i));
                dthVar.e.setBackground(context4.getDrawable(i));
                dthVar.c.setBackground(context4.getDrawable(i));
                return Unit.f46060a;
            case 7:
                qgg0 qgg0Var = (qgg0) obj3;
                drf drfVar = (drf) obj2;
                cth cthVar = (cth) obj;
                cthVar.getClass();
                RecyclerView recyclerView = cthVar.b;
                if (!Intrinsics.d(recyclerView.getAdapter(), qgg0Var)) {
                    recyclerView.setAdapter(qgg0Var);
                }
                qgg0Var.A(drfVar.f6556a);
                return Unit.f46060a;
            case 8:
                rnf rnfVar = (rnf) obj3;
                String str4 = (String) obj2;
                k0w0 k0w0Var = (k0w0) obj;
                qgh qghVar = rnfVar.P;
                bek bekVar = sip.f32274a;
                Cs2GameScreenParams cs2GameScreenParams = rnfVar.q;
                boolean z4 = cs2GameScreenParams.b;
                bekVar.getClass();
                sip sipVarF = bek.f(z4);
                dam0 dam0Var = dam0.f5756a;
                long j = cs2GameScreenParams.d;
                c0o c0oVar = xmf.c;
                ArrayList arrayList = new ArrayList(r3d.q(c0oVar, 10));
                Iterator it = c0oVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf(((xmf) it.next()).f41120a.f33572a));
                }
                mrf mrfVar = ((wmf) rnfVar.D()).f;
                if (mrfVar == null || (listV = u1c.v(mrfVar, d5c.C(((wmf) rnfVar.D()).b))) == null) {
                    listV = iun.f15405a;
                }
                StatisticBlocksParams statisticBlocksParams = new StatisticBlocksParams(sipVarF, dam0Var, 40L, j, str4, arrayList, listV);
                qghVar.getClass();
                k0w0Var.h(new CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1(statisticBlocksParams));
                return Unit.f46060a;
            case 9:
                cof cofVar = (cof) obj3;
                Context context5 = (Context) obj2;
                gth gthVar = (gth) obj;
                gthVar.getClass();
                TextView textView4 = gthVar.P;
                vnf vnfVar = cofVar.c;
                textView4.setText(vnfVar.b);
                List list3 = u0d.f34849a;
                u0d.n(gthVar.J, vnfVar.f37716a, R.drawable.icon_globe_new, 3);
                TextView textView5 = gthVar.L;
                oqf oqfVar = cofVar.e;
                textView5.setText(oqfVar.f25685a.b(context5));
                qbc.G(gthVar.e, oqfVar.b);
                qbc.H(gthVar.F, oqfVar.c);
                qbc.H(gthVar.b, oqfVar.d);
                qbc.H(gthVar.f, oqfVar.e);
                qbc.H(gthVar.g, oqfVar.f);
                qbc.H(gthVar.d, oqfVar.g);
                qbc.H(gthVar.c, oqfVar.h);
                TextView textView6 = gthVar.O;
                oqf oqfVar2 = cofVar.f;
                textView6.setText(oqfVar2.f25685a.b(context5));
                qbc.G(gthVar.w, oqfVar2.b);
                qbc.H(gthVar.I, oqfVar2.c);
                qbc.H(gthVar.t, oqfVar2.d);
                qbc.H(gthVar.x, oqfVar2.e);
                qbc.H(gthVar.y, oqfVar2.f);
                qbc.H(gthVar.v, oqfVar2.g);
                qbc.H(gthVar.u, oqfVar2.h);
                TextView textView7 = gthVar.Q;
                oqf oqfVar3 = cofVar.g;
                textView7.setText(oqfVar3.f25685a.b(context5));
                qbc.G(gthVar.C, oqfVar3.b);
                qbc.H(gthVar.K, oqfVar3.c);
                qbc.H(gthVar.z, oqfVar3.d);
                qbc.H(gthVar.D, oqfVar3.e);
                qbc.H(gthVar.E, oqfVar3.f);
                qbc.H(gthVar.B, oqfVar3.g);
                qbc.H(gthVar.A, oqfVar3.h);
                TextView textView8 = gthVar.N;
                oqf oqfVar4 = cofVar.h;
                textView8.setText(oqfVar4.f25685a.b(context5));
                qbc.G(gthVar.q, oqfVar4.b);
                u0d.j(gthVar.H, oqfVar4.c, R.drawable.cs2_weapon_placeholder, 0, null, null, null, 508);
                qbc.H(gthVar.n, oqfVar4.d);
                qbc.H(gthVar.r, oqfVar4.e);
                qbc.H(gthVar.s, oqfVar4.f);
                qbc.H(gthVar.p, oqfVar4.g);
                qbc.H(gthVar.o, oqfVar4.h);
                TextView textView9 = gthVar.M;
                oqf oqfVar5 = cofVar.i;
                textView9.setText(oqfVar5.f25685a.b(context5));
                qbc.G(gthVar.k, oqfVar5.b);
                qbc.H(gthVar.G, oqfVar5.c);
                qbc.H(gthVar.h, oqfVar5.d);
                qbc.H(gthVar.l, oqfVar5.e);
                qbc.H(gthVar.m, oqfVar5.f);
                qbc.H(gthVar.j, oqfVar5.g);
                qbc.H(gthVar.i, oqfVar5.h);
                View view = gthVar.V;
                int i2 = cofVar.d;
                view.setBackground(context5.getDrawable(i2));
                TextView textView10 = gthVar.R;
                textView10.setBackground(context5.getDrawable(i2));
                textView10.setText(cofVar.j);
                boolean z5 = cofVar.k;
                int dimensionPixelSize2 = context5.getResources().getDimensionPixelSize(R.dimen.space_4);
                if (z5) {
                    gthVar.f11880a.setPadding(0, 0, 0, dimensionPixelSize2);
                }
                return Unit.f46060a;
            case 10:
                chv0 chv0Var = (chv0) obj3;
                Context context6 = (Context) obj2;
                op20 op20Var = (op20) obj;
                op20Var.getClass();
                op20Var.e.setText(chv0Var.b);
                List list4 = u0d.f34849a;
                u0d.j(op20Var.b, chv0Var.c, R.drawable.cs2_map_statistic_item_bg, 0, null, null, null, 508);
                op20Var.d.setText(chv0Var.d.b(context6));
                op20Var.g.setText(chv0Var.e.b(context6));
                op20Var.c.setText(chv0Var.f);
                op20Var.f.setText(chv0Var.g);
                ConstraintLayout constraintLayout = op20Var.f25620a;
                constraintLayout.setBackground(context6.getDrawable(chv0Var.h));
                if (chv0Var.i) {
                    constraintLayout.setLayoutDirection(3);
                } else {
                    constraintLayout.setLayoutDirection(0);
                }
                return Unit.f46060a;
            case 11:
                ddh ddhVar = (ddh) obj3;
                Context context7 = (Context) obj2;
                oth othVar = (oth) obj;
                othVar.getClass();
                TextView textView11 = othVar.f;
                uch uchVar = ddhVar.c;
                boolean z6 = ddhVar.k;
                textView11.setText(uchVar.b);
                List list5 = u0d.f34849a;
                u0d.n(othVar.c, uchVar.f35428a, R.drawable.icon_globe_new, 3);
                TextView textView12 = othVar.j;
                adh adhVar = ddhVar.d;
                textView12.setText(adhVar.b);
                u0d.n(othVar.e, adhVar.f678a, R.drawable.icon_globe_new, 3);
                u0d.j(othVar.b, ddhVar.e.f38924a, 0, 0, null, null, null, 510);
                TextView textView13 = othVar.g;
                textView13.setText(ddhVar.f.b(context7));
                TextView textView14 = othVar.k;
                textView14.setText(ddhVar.g.b(context7));
                othVar.f25830a.setBackground(context7.getDrawable(ddhVar.h));
                TextView textView15 = othVar.h;
                xch xchVar = ddhVar.i;
                textView15.setText(xchVar.f40645a);
                othVar.d.setVisibility(xchVar.b ? 0 : 8);
                othVar.i.setText(ddhVar.j);
                textView13.setVisibility(z6 ? 0 : 8);
                textView14.setVisibility(z6 ? 0 : 8);
                return Unit.f46060a;
            case 12:
                ouf oufVar = (ouf) obj3;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.getLocalizedMessage();
                oufVar.j.o(null, i8d.e);
                oufVar.f(th2, (vne) obj2);
                return Unit.f46060a;
            case 13:
                uxf uxfVar = (uxf) obj3;
                pz40 pz40Var = (pz40) obj2;
                j6z j6zVar = (j6z) obj;
                j6zVar.getClass();
                float fD0 = sj3.d0((int) (j6zVar.g() >> 32));
                zcl zclVar = qmk.f28987a;
                pz40Var.setValue(new ycl(ycl.b(fD0, 0.0f) ? 0 : (int) ((fD0 - 28.0f) * uxfVar.e)));
                return Unit.f46060a;
            case 14:
                cp cpVar = (cp) obj2;
                ((View) obj).getClass();
                ((mhc) obj3).invoke(Long.valueOf(((a7g) cpVar.u()).f367a), Boolean.valueOf(((a7g) cpVar.u()).d));
                return Unit.f46060a;
            case 15:
                int i3 = CyberCalendarPeriodView.p;
                ((View) obj).getClass();
                ((Function1) obj3).invoke((i9g) obj2);
                dyb.u0();
                return Unit.f46060a;
            case 16:
                h2l0 h2l0Var = (h2l0) obj;
                h2l0Var.getClass();
                ((Function2) obj3).invoke(Long.valueOf(((zbg) ((bcg) obj2)).b), h2l0Var);
                return Unit.f46060a;
            case 17:
                ((Throwable) obj).getClass();
                ((gdg) obj3).l.a((Throwable) obj2);
                return Unit.f46060a;
            case 18:
                ov40 ov40Var = (ov40) obj;
                ov40Var.getClass();
                ov40Var.b = (cnb) obj3;
                for (Pair pair : (a4x) obj2) {
                    ov40Var.a((cnb) pair.f46059a, (ajg) pair.b);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                rig rigVar = (rig) obj;
                rigVar.getClass();
                wdk0.k(((kei) obj3).r, new xdk0(rek0.b, rigVar.f30541a, null, null, null, null, 124), (Fragment) obj2, null, null, false, null, 1020);
                return Unit.f46060a;
            case 20:
                xig xigVar = (xig) obj3;
                List list6 = (List) obj2;
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                vqc vqcVar = xigVar.E;
                EsportsGamesScreenParams.ChampsGames champsGames = new EsportsGamesScreenParams.ChampsGames(xigVar.p.f46548a.f46556a, list6, xigVar.o == sip.c);
                vqcVar.getClass();
                k0w0Var2.h(new CyberGamesScreenFactoryImpl$esportsGamesScreen$1(vqcVar, champsGames));
                return Unit.f46060a;
            case 21:
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                c8d c8dVar = (c8d) k0w0Var3.b(new b1w0(new ffd((ulg) obj3, (xah) obj2, yjeVar, (byte) 4))).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                return Unit.f46060a;
            case 22:
                vqg vqgVar = (vqg) obj3;
                String str5 = (String) obj2;
                k0w0 k0w0Var4 = (k0w0) obj;
                qgh qghVar2 = vqgVar.u;
                sip.f32274a.getClass();
                sip sipVar = sip.b;
                dam0 dam0Var2 = dam0.b;
                long j2 = vqgVar.b.b;
                List list7 = vqgVar.F;
                ArrayList arrayList2 = new ArrayList(r3d.q(list7, 10));
                Iterator it2 = list7.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Integer.valueOf(((t9m0) it2.next()).f33572a));
                }
                StatisticBlocksParams statisticBlocksParams2 = new StatisticBlocksParams(sipVar, dam0Var2, 40L, j2, str5, arrayList2, vqgVar.O);
                qghVar2.getClass();
                k0w0Var4.h(new CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1(statisticBlocksParams2));
                return Unit.f46060a;
            case 23:
                k0w0 k0w0Var5 = (k0w0) obj;
                k0w0Var5.getClass();
                final vqc vqcVar2 = ((uzg) obj3).b;
                final VirtualRecommendedEventsParams virtualRecommendedEventsParams = new VirtualRecommendedEventsParams((List) obj2);
                k0w0Var5.h(new FragmentScreen(vqcVar2, virtualRecommendedEventsParams) { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$virtualRecommendedEventsScreen$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ VirtualRecommendedEventsParams f46610a;

                    {
                        this.f46610a = virtualRecommendedEventsParams;
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        csu0.R1.getClass();
                        csu0 csu0Var = new csu0();
                        csu0Var.P1.J(csu0Var, csu0.S1[0], this.f46610a);
                        return csu0Var;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        return ufx.C(this);
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                });
                return Unit.f46060a;
            case 24:
                k0w0 k0w0Var6 = (k0w0) obj;
                k0w0Var6.getClass();
                final vqc vqcVar3 = ((uzg) obj3).b;
                final CyberMainDisciplinesParams.Disciplines disciplines = new CyberMainDisciplinesParams.Disciplines((CyberGamesPage) obj2);
                k0w0Var6.h(new FragmentScreen(vqcVar3, disciplines) { // from class: org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$mainDisciplinesScreen$1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ CyberMainDisciplinesParams.Disciplines f46593a;

                    {
                        this.f46593a = disciplines;
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    public final Fragment a(m1r m1rVar) {
                        m1rVar.getClass();
                        y4h.W1.getClass();
                        y4h y4hVar = new y4h();
                        y4hVar.Q1.J(y4hVar, y4h.X1[0], this.f46593a);
                        return y4hVar;
                    }

                    @Override // a.m7h0
                    /* JADX INFO: renamed from: b */
                    public final String getF45455a() {
                        return ufx.C(this);
                    }

                    @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                    /* JADX INFO: renamed from: g */
                    public final /* bridge */ boolean getB() {
                        return true;
                    }
                });
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((View) obj).getClass();
                b2z b2zVar = (b2z) ((cp) obj2).u();
                p7m0 p7m0Var = ((ppg) obj3).f27375a.L;
                long j3 = b2zVar.f1877a;
                if (j3 == 18) {
                    do {
                        value2 = p7m0Var.getValue();
                        lpgVar2 = (lpg) value2;
                    } while (!p7m0Var.m(value2, new lpg(!lpgVar2.f20440a, lpgVar2.b)));
                } else if (j3 == 19) {
                    do {
                        value = p7m0Var.getValue();
                        lpgVar = (lpg) value;
                    } while (!p7m0Var.m(value, new lpg(lpgVar.f20440a, !lpgVar.b)));
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((lwk) obj).getClass();
                return new pr0((z6h) obj3, (i3t0) obj2, (byte) 8);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                h7h h7hVar = (h7h) obj3;
                Function1 function1 = (Function1) obj2;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                if (h7hVar.d > 0) {
                    hcz.e(hczVar, dw9.o(h7hVar.f12573a, "_hidden_markets"), null, new ugd(-372171086, true, new sd8(h7hVar, (byte) 19)), 2);
                }
                hcz.g(hczVar, h7hVar.g.size(), new hfg(h7hVar, (byte) 13), null, new ugd(-117349472, true, new ec30(h7hVar, function1, (byte) 20)), 4);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Throwable) obj).getClass();
                ((dch) obj3).M((RelatedParams) obj2);
                return Unit.f46060a;
            default:
                ((View) obj).getClass();
                long j4 = ((yfh) ((cp) obj2).u()).f42543a;
                vqg vqgVar2 = ((opg) obj3).f25640a;
                CyberGameStatisticScreenParams cyberGameStatisticScreenParams = vqgVar2.b;
                zr1 zr1Var = vqgVar2.w;
                ih5 ih5Var = vqgVar2.v;
                if (j4 == 4) {
                    r1g r1gVar = r1g.CYBERSPORT_MAIN;
                    ih5Var.o("сyber_postmatch_statistics");
                    zr1Var.x("сyber_postmatch_statistics");
                    dqg dqgVar = vqgVar2.E;
                    long j5 = (dqgVar == null || (ljgVar = dqgVar.f6514a) == null) ? 0L : ljgVar.i;
                    boolean z7 = dqgVar != null ? dqgVar.f : false;
                    if (j5 != 0) {
                        long j6 = cyberGameStatisticScreenParams.b;
                        if (j6 == 46 && z7) {
                            ((uzg) vqgVar2.d).p(j5, j6, cyberGameStatisticScreenParams.d, cyberGameStatisticScreenParams.i, cyberGameStatisticScreenParams.f46490a, false);
                        }
                    }
                } else if (j4 == 20) {
                    ih5Var.f14765a.c("cyber_result_full_stat_call");
                    zr1Var.f44833a.a(xun.f41520a, 12017L);
                    vqgVar2.D.f(new nqg(vqgVar2.k.H((int) cyberGameStatisticScreenParams.b, vqgVar2.j, cyberGameStatisticScreenParams.f46490a, cy7.c())));
                }
                return Unit.f46060a;
        }
    }
}
