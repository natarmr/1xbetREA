package a;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.gov.nist.core.Separators;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.cyber.game.universal.impl.presentation.durak.view.CyberDurakGameView;
import org.xplatform.cyber.game.universal.impl.presentation.indianpoker.SyntheticIndianPokerView;
import org.xplatform.cyber.game.universal.impl.presentation.roulette.gamefield.RouletteView;
import org.xplatform.cyber.game.universal.impl.presentation.seabattle.view.SeaBattleView;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.pin_code.impl.presentation.views.enteringpincode.EnteringPinCode;
import org.xplatform.pin_code.impl.presentation.views.enteringpincode.PicCodeEditField;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yhn implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42644a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yhn(vjn vjnVar, hsj hsjVar) {
        this.f42644a = (byte) 5;
        this.b = vjnVar;
    }

    /* JADX WARN: Code duplicated, block: B:182:0x0766  */
    /* JADX WARN: Code duplicated, block: B:183:0x0769  */
    /* JADX WARN: Code duplicated, block: B:80:0x0446  */
    /* JADX WARN: Code duplicated, block: B:98:0x054a  */
    /* JADX WARN: Code duplicated, block: B:99:0x054f  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String strConcat;
        int length;
        int i;
        String str;
        m3o m3oVar;
        boolean z;
        Object next;
        m5l0 m5l0Var;
        Object value;
        y5o0 y5o0Var;
        c4m0 c4m0Var;
        boolean z2;
        ConstraintLayout constraintLayout;
        Object value2;
        Object value3;
        byte b = this.f42644a;
        byte b2 = 0;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                kin kinVar = (kin) obj2;
                Throwable th = (Throwable) obj;
                th.getClass();
                bvc bvcVarA = jiu0.a(kinVar);
                mne mneVar = kinVar.f;
                yje yjeVar = null;
                sac.V(bvcVarA, ain.f931a, null, mneVar.f22085a, new bin(kinVar, yjeVar, (byte) 0), 10);
                sac.V(jiu0.a(kinVar), zhn.f44402a, null, mneVar.f22085a, new j0l((Object) kinVar, (Object) new xy5(false), yjeVar, (byte) 10), 10);
                p7m0 p7m0Var = kinVar.w;
                p7m0Var.getClass();
                p7m0Var.o(null, ajn.f985a);
                kinVar.A(th);
                return Unit.f46060a;
            case 1:
                xak xakVar = kmn.Q1;
                ((eg60) obj).getClass();
                ((kmn) obj2).G0().x(lkn.f20208a);
                return Unit.f46060a;
            case 2:
                omn omnVar = (omn) obj2;
                hcz hczVar = (hcz) obj;
                ddk ddkVar = omn.p2;
                hczVar.getClass();
                List listN = omnVar.k2.n(omnVar, omn.q2[0]);
                hczVar.f(listN.size(), null, new v2m(listN, (byte) 18), new ugd(2039820996, true, new xe4(listN, omnVar, (byte) 5)));
                return Unit.f46060a;
            case 3:
                ((Throwable) obj).getClass();
                bby bbyVar = ((wnn) obj2).Z;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                return Unit.f46060a;
            case 4:
                bek bekVar = xon.S1;
                ((eg60) obj).getClass();
                ((xon) obj2).G0().x(ynn.f42949a);
                return Unit.f46060a;
            case 5:
                vjn vjnVar = (vjn) obj;
                String str2 = ((vjn) obj2) == vjnVar ? " > " : "   ";
                if (!(vjnVar instanceof l8d)) {
                    if (vjnVar instanceof eoi0) {
                        eoi0 eoi0Var = (eoi0) vjnVar;
                        length = eoi0Var.f8142a.b.length();
                        i = eoi0Var.b;
                        str = "SetComposingTextCommand(text.length=";
                    } else if (vjnVar instanceof doi0) {
                        strConcat = ((doi0) vjnVar).toString();
                    } else if (vjnVar instanceof g6k) {
                        strConcat = ((g6k) vjnVar).toString();
                    } else if (vjnVar instanceof h6k) {
                        strConcat = ((h6k) vjnVar).toString();
                    } else if (vjnVar instanceof fsi0) {
                        strConcat = ((fsi0) vjnVar).toString();
                    } else if (vjnVar instanceof bfq) {
                        strConcat = "FinishComposingTextCommand()";
                    } else if (vjnVar instanceof j4k) {
                        strConcat = "DeleteAllCommand()";
                    } else {
                        String strJ = sre0.f32672a.b(vjnVar.getClass()).J();
                        if (strJ == null) {
                            strJ = "{anonymous EditCommand}";
                        }
                        strConcat = "Unknown EditCommand: ".concat(strJ);
                    }
                    return str2.concat(strConcat);
                }
                l8d l8dVar = (l8d) vjnVar;
                length = l8dVar.f19598a.b.length();
                i = l8dVar.b;
                str = "CommitTextCommand(text.length=";
                strConcat = ohs0.m(str, length, ", newCursorPosition=", Separators.RPAREN, i);
                return str2.concat(strConcat);
            case 6:
                hxn hxnVar = (hxn) obj2;
                ((View) obj).getClass();
                hxnVar.v.invoke();
                ((DsButton) hxnVar.u.c).setLoading(true);
                return Unit.f46060a;
            case 7:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((byn) obj2).r.b(th2, new f4m((byte) 27));
                return Unit.f46060a;
            case 8:
                int i2 = EnteringPinCode.u;
                ((View) obj).getClass();
                ((PicCodeEditField) ((dc3) obj2).d).e();
                return Unit.f46060a;
            case 9:
                b4o b4oVar = (b4o) obj2;
                fee feeVarA = b4oVar.a();
                y3o y3oVar = b4oVar.f1968a;
                j0g0 j0g0Var = (j0g0) (((Number) feeVarA.c()).intValue() == 0 ? (fee) b4oVar.m.getValue() : (fee) b4oVar.n.getValue()).c();
                if (j0g0Var != null) {
                    Object obj3 = j0g0Var.f15681a;
                    if (obj3 instanceof g0g0) {
                        obj3 = null;
                    }
                    m3oVar = (m3o) obj3;
                } else {
                    m3oVar = null;
                }
                y78 y78Var = b4oVar.d;
                ctf0 ctf0Var = b4oVar.c;
                CyberGamesPage cyberGamesPageD = org.xplatform.cyber.section.api.domain.entity.d.d(y3oVar.f41962a.getD());
                boolean z3 = y3oVar.d;
                sff0 sff0Var = y3oVar.f;
                v5l0 v5l0Var = sff0Var.g.y;
                boolean zBooleanValue = ((Boolean) ((fee) b4oVar.o.getValue()).c()).booleanValue();
                List list = m3oVar != null ? m3oVar.f21125a : null;
                if (list == null) {
                    list = iun.f15405a;
                }
                List list2 = m3oVar != null ? m3oVar.d : null;
                if (list2 == null) {
                    list2 = iun.f15405a;
                }
                List list3 = m3oVar != null ? m3oVar.e : null;
                if (list3 == null) {
                    list3 = iun.f15405a;
                }
                boolean z4 = y3oVar.p;
                list.getClass();
                list2.getClass();
                ctf0Var.getClass();
                list3.getClass();
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                int i3 = 0;
                for (Object obj4 : list) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        q3d.p();
                        throw null;
                    }
                    d0t d0tVar = (d0t) obj4;
                    Iterator it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            z = zBooleanValue;
                            if (((lok0) next).f20396a != d0tVar.O) {
                                zBooleanValue = z;
                            }
                        } else {
                            z = zBooleanValue;
                            next = null;
                        }
                    }
                    lok0 lok0Var = (lok0) next;
                    boolean z5 = sff0Var.J;
                    String str3 = (String) CollectionsKt.W(i3, list3);
                    String str4 = str3 == null ? "" : str3;
                    boolean zEquals = cyberGamesPageD.equals(CyberGamesPage.OneXCyber.INSTANCE);
                    List list4 = list3;
                    ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(Integer.valueOf(((lok0) it2.next()).f20396a));
                    }
                    boolean z6 = lok0Var != null ? lok0Var.n : false;
                    boolean z7 = lok0Var != null ? lok0Var.p : false;
                    if (d0tVar.K.isEmpty()) {
                        List list5 = d0tVar.k;
                        if (list5 == null || !list5.isEmpty()) {
                            Iterator it3 = list5.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (!((d0t) it3.next()).K.isEmpty()) {
                                        if (z) {
                                            m5l0Var = k5l0.f17726a;
                                        } else {
                                            m5l0Var = l5l0.f19463a;
                                        }
                                    }
                                }
                            }
                        }
                        m5l0Var = i5l0.f14197a;
                    } else if (z) {
                        m5l0Var = k5l0.f17726a;
                    } else {
                        m5l0Var = l5l0.f19463a;
                    }
                    m5l0 m5l0Var2 = m5l0Var;
                    String str5 = lok0Var != null ? lok0Var.u : null;
                    arrayList.add(wwb.V(d0tVar, ctf0Var, y78Var, z3, z5, str4, zEquals, arrayList2, z6, z7, false, v5l0Var, m5l0Var2, str5 == null ? "" : str5, z4));
                    zBooleanValue = z;
                    list3 = list4;
                    i3 = i4;
                }
                return dyb.o0(arrayList);
            case 10:
                d4o d4oVar = (d4o) obj2;
                ((Throwable) obj).getClass();
                p7m0 p7m0Var2 = d4oVar.i.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                    d4oVar.f.getClass();
                } while (!p7m0Var2.m(value, y3o.a((y3o) value, null, null, null, 0, false, false, null, null, 0L, 0L, false, false, false, 65471)));
                return Unit.f46060a;
            case 11:
                wng wngVar = (wng) obj2;
                l1o0 l1o0Var = (l1o0) obj;
                l1o0Var.getClass();
                CyberDurakGameView cyberDurakGameView = l1o0Var.b;
                cyberDurakGameView.setCardDeck(wngVar.i);
                cyberDurakGameView.setCardsOnTable(wngVar.l);
                cyberDurakGameView.m32setCountRebound4eaVOWs(wngVar.g);
                cyberDurakGameView.m33setCountStep4ygb3Fo(wngVar.f);
                cyberDurakGameView.m34setCountTakenxxXNjZw(wngVar.h);
                cyberDurakGameView.setMatchDescription(wngVar.f39446a);
                cyberDurakGameView.setFirstPlayerCards(wngVar.j);
                cyberDurakGameView.m35setFirstPlayerName7hlsDRw(wngVar.b);
                cyberDurakGameView.m36setFirstPlayerStatusxj29_n0(wngVar.d);
                cyberDurakGameView.setSecondPlayerCards(wngVar.k);
                cyberDurakGameView.m37setSecondPlayerNamex_7YRRc(wngVar.c);
                cyberDurakGameView.m38setSecondPlayerStatusby2wi9I(wngVar.e);
                cyberDurakGameView.m31setBackgroundyKGKXMA(wngVar.m);
                return Unit.f46060a;
            case 12:
                v0o0 v0o0Var = (v0o0) obj2;
                u0o0 u0o0Var = (u0o0) obj;
                u0o0Var.getClass();
                u0o0Var.f34864a.setBackgroundResource(R.drawable.cybergame_synthetic_baseball_header_bg);
                u0o0Var.b.setText(v0o0Var.f36590a);
                u0o0Var.c.setText(v0o0Var.b);
                return Unit.f46060a;
            case 13:
                j1h j1hVar = (j1h) obj2;
                y5o0 y5o0Var2 = (y5o0) obj;
                y5o0Var2.getClass();
                TextView textView = y5o0Var2.f;
                lth lthVar = y5o0Var2.e;
                lth lthVar2 = y5o0Var2.c;
                TextView textView2 = y5o0Var2.g;
                iab iabVar = y5o0Var2.d;
                iab iabVar2 = y5o0Var2.b;
                String str6 = j1hVar.b;
                i1h i1hVar = j1hVar.g;
                i1h i1hVar2 = j1hVar.f;
                float f = j1hVar.i;
                float f2 = j1hVar.h;
                textView.setText(str6);
                TextView textView3 = y5o0Var2.h;
                textView3.setText(j1hVar.c);
                h1h h1hVar = j1hVar.f15733a;
                if (!(h1hVar instanceof f1h)) {
                    if (!(h1hVar instanceof g1h)) {
                        t9f.b();
                        return null;
                    }
                    g1h g1hVar = (g1h) h1hVar;
                    long j = g1hVar.f10511a;
                    Long l = g1hVar.b;
                    if (l != null) {
                        long jLongValue = l.longValue();
                        Long l2 = o5o.b;
                        if (l2 != null && jLongValue == l2.longValue() && (c4m0Var = o5o.f24696a) != null) {
                            y5o0Var = y5o0Var2;
                            if (c4m0Var.isActive()) {
                            }
                            lthVar2.b.setAlpha(f2);
                            ((ConstraintLayout) iabVar2.d).setAlpha(f2);
                            textView.setAlpha(f2);
                            float f3 = f;
                            lthVar.b.setAlpha(f3);
                            ((ConstraintLayout) iabVar.d).setAlpha(f3);
                            textView3.setAlpha(f3);
                            ((TextView) iabVar2.e).setText("1");
                            ((TextView) iabVar2.b).setText(i1hVar2.f13998a);
                            ((TextView) iabVar2.f).setText("2");
                            ((TextView) iabVar2.g).setText(i1hVar2.b);
                            ((TextView) iabVar2.c).setText("3");
                            ((TextView) iabVar2.h).setText(i1hVar2.c);
                            ((TextView) iabVar.e).setText("1");
                            ((TextView) iabVar.b).setText(i1hVar.f13998a);
                            ((TextView) iabVar.f).setText("2");
                            ((TextView) iabVar.g).setText(i1hVar.b);
                            ((TextView) iabVar.c).setText("3");
                            ((TextView) iabVar.h).setText(i1hVar.c);
                            lthVar2.c.setText(j1hVar.d);
                            lthVar.c.setText(j1hVar.e);
                            z2 = j1hVar.j;
                            constraintLayout = y5o0Var.f42058a;
                            if (z2) {
                                constraintLayout.setLayoutDirection(3);
                            } else {
                                constraintLayout.setLayoutDirection(0);
                            }
                            return Unit.f46060a;
                        }
                        y5o0Var = y5o0Var2;
                    } else {
                        y5o0Var = y5o0Var2;
                    }
                    c4m0 c4m0Var2 = o5o.f24696a;
                    if (c4m0Var2 != null) {
                        c4m0Var2.cancel(null);
                    }
                    o5o.b = l;
                    vsg0 vsg0VarM = l != 0 ? sac.M(l.longValue()) : sac.L(6, j, 0L);
                    yje yjeVar2 = null;
                    o5o.f24696a = slb.U(new dnq(new fnq(vsg0VarM, new yg1((Object) textView2, yjeVar2, (byte) 12), (byte) 4), new e00(textView2, yjeVar2, (byte) 27), (byte) 0), (vne) o5o.c.getValue());
                    lthVar2.b.setAlpha(f2);
                    ((ConstraintLayout) iabVar2.d).setAlpha(f2);
                    textView.setAlpha(f2);
                    float f4 = f;
                    lthVar.b.setAlpha(f4);
                    ((ConstraintLayout) iabVar.d).setAlpha(f4);
                    textView3.setAlpha(f4);
                    ((TextView) iabVar2.e).setText("1");
                    ((TextView) iabVar2.b).setText(i1hVar2.f13998a);
                    ((TextView) iabVar2.f).setText("2");
                    ((TextView) iabVar2.g).setText(i1hVar2.b);
                    ((TextView) iabVar2.c).setText("3");
                    ((TextView) iabVar2.h).setText(i1hVar2.c);
                    ((TextView) iabVar.e).setText("1");
                    ((TextView) iabVar.b).setText(i1hVar.f13998a);
                    ((TextView) iabVar.f).setText("2");
                    ((TextView) iabVar.g).setText(i1hVar.b);
                    ((TextView) iabVar.c).setText("3");
                    ((TextView) iabVar.h).setText(i1hVar.c);
                    lthVar2.c.setText(j1hVar.d);
                    lthVar.c.setText(j1hVar.e);
                    z2 = j1hVar.j;
                    constraintLayout = y5o0Var.f42058a;
                    if (z2) {
                        constraintLayout.setLayoutDirection(3);
                    } else {
                        constraintLayout.setLayoutDirection(0);
                    }
                    return Unit.f46060a;
                }
                c4m0 c4m0Var3 = o5o.f24696a;
                if (c4m0Var3 != null) {
                    c4m0Var3.cancel(null);
                }
                o5o.f24696a = null;
                o5o.b = null;
                textView2.setText(((f1h) h1hVar).f8764a);
                y5o0Var = y5o0Var2;
                f = f;
                i1hVar = i1hVar;
                lthVar2.b.setAlpha(f2);
                ((ConstraintLayout) iabVar2.d).setAlpha(f2);
                textView.setAlpha(f2);
                float f5 = f;
                lthVar.b.setAlpha(f5);
                ((ConstraintLayout) iabVar.d).setAlpha(f5);
                textView3.setAlpha(f5);
                ((TextView) iabVar2.e).setText("1");
                ((TextView) iabVar2.b).setText(i1hVar2.f13998a);
                ((TextView) iabVar2.f).setText("2");
                ((TextView) iabVar2.g).setText(i1hVar2.b);
                ((TextView) iabVar2.c).setText("3");
                ((TextView) iabVar2.h).setText(i1hVar2.c);
                ((TextView) iabVar.e).setText("1");
                ((TextView) iabVar.b).setText(i1hVar.f13998a);
                ((TextView) iabVar.f).setText("2");
                ((TextView) iabVar.g).setText(i1hVar.b);
                ((TextView) iabVar.c).setText("3");
                ((TextView) iabVar.h).setText(i1hVar.c);
                lthVar2.c.setText(j1hVar.d);
                lthVar.c.setText(j1hVar.e);
                z2 = j1hVar.j;
                constraintLayout = y5o0Var.f42058a;
                if (z2) {
                    constraintLayout.setLayoutDirection(3);
                } else {
                    constraintLayout.setLayoutDirection(0);
                }
                return Unit.f46060a;
            case 14:
                y5x y5xVar = (y5x) obj2;
                z5o0 z5o0Var = (z5o0) obj;
                z5o0Var.getClass();
                SyntheticIndianPokerView syntheticIndianPokerView = z5o0Var.b;
                syntheticIndianPokerView.setFirstPlayerCards(y5xVar.f42068a);
                syntheticIndianPokerView.setSecondPlayerCards(y5xVar.b);
                syntheticIndianPokerView.setMatchStatus(y5xVar.c);
                syntheticIndianPokerView.setFirstPlayerCombination(y5xVar.d);
                syntheticIndianPokerView.setSecondPlayerCombination(y5xVar.e);
                syntheticIndianPokerView.v(y5xVar.g);
                boolean z8 = y5xVar.f;
                SyntheticIndianPokerView syntheticIndianPokerView2 = z5o0Var.f43827a;
                if (z8) {
                    syntheticIndianPokerView2.setLayoutDirection(3);
                } else {
                    syntheticIndianPokerView2.setLayoutDirection(0);
                }
                return Unit.f46060a;
            case 15:
                ((Boolean) obj).getClass();
                AnimatorSet animatorSet = new AnimatorSet();
                ImageView imageView = ((f6o0) obj2).b;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.2f, 0.7f);
                valueAnimatorOfFloat.setDuration(800L);
                valueAnimatorOfFloat.addUpdateListener(new eng(imageView, (byte) 1));
                animatorSet.playSequentially(valueAnimatorOfFloat);
                animatorSet.start();
                return Unit.f46060a;
            case 16:
                sfg0 sfg0Var = (sfg0) obj2;
                n7o0 n7o0Var = (n7o0) obj;
                n7o0Var.getClass();
                RouletteView rouletteView = n7o0Var.b;
                rouletteView.setType(sfg0Var.d);
                rouletteView.setRouletteImage(sfg0Var.f32118a);
                rouletteView.setCurrentValue(sfg0Var.b);
                rouletteView.setNewValue(sfg0Var.c);
                return Unit.f46060a;
            case 17:
                jeh0 jeh0Var = (jeh0) obj2;
                u7o0 u7o0Var = (u7o0) obj;
                u7o0Var.getClass();
                List list6 = u0d.f34849a;
                u0d.j(u7o0Var.b, jeh0Var.b, R.drawable.ic_player_placeholder, 0, null, null, null, 500);
                u0d.j(u7o0Var.c, jeh0Var.c, R.drawable.ic_player_placeholder, 0, null, null, null, 500);
                u7o0Var.d.setText(jeh0Var.f);
                u7o0Var.e.setText(jeh0Var.d);
                u7o0Var.f.setText(jeh0Var.g);
                SeaBattleView seaBattleView = u7o0Var.i;
                seaBattleView.b(jeh0Var.m, jeh0Var.o);
                agc.O(u7o0Var, jeh0Var.i);
                agc.Q(seaBattleView, jeh0Var.k);
                u7o0Var.g.setText(jeh0Var.e);
                u7o0Var.h.setText(jeh0Var.h);
                SeaBattleView seaBattleView2 = u7o0Var.j;
                seaBattleView2.b(jeh0Var.n, jeh0Var.p);
                agc.P(u7o0Var, jeh0Var.j);
                agc.Q(seaBattleView2, jeh0Var.l);
                return Unit.f46060a;
            case 18:
                kij0 kij0Var = (kij0) obj2;
                d8o0 d8o0Var = (d8o0) obj;
                d8o0Var.getClass();
                d8o0Var.c.setRule(kij0Var.f18341a);
                d8o0Var.g.setRule(kij0Var.b);
                d8o0Var.k.setRule(kij0Var.c);
                d8o0Var.e.setRule(kij0Var.d);
                d8o0Var.d.setRule(kij0Var.e);
                d8o0Var.i.setRule(kij0Var.f);
                d8o0Var.h.setRule(kij0Var.g);
                d8o0Var.b.setRule(kij0Var.h);
                d8o0Var.f.setRule(kij0Var.i);
                d8o0Var.j.setRule(kij0Var.j);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                c8o0 c8o0Var = (c8o0) obj;
                c8o0Var.getClass();
                c8o0Var.f3924a.setCombination((iij0) obj2);
                return Unit.f46060a;
            case 20:
                b7o b7oVar = (b7o) obj2;
                xus xusVar = (xus) obj;
                xusVar.getClass();
                p7m0 p7m0Var3 = b7oVar.i.f25029a;
                while (true) {
                    Object value4 = p7m0Var3.getValue();
                    value4.getClass();
                    b7oVar.f.getClass();
                    b7o b7oVar2 = b7oVar;
                    if (p7m0Var3.m(value4, l6o.a((l6o) value4, null, null, null, null, null, xusVar, false, null, false, false, null, null, 0L, false, 67108799))) {
                        return Unit.f46060a;
                    }
                    b7oVar = b7oVar2;
                }
                break;
            case 21:
                iqt0 iqt0Var = (iqt0) obj;
                bek bekVar2 = byo.P1;
                iqt0Var.getClass();
                ((byo) obj2).H0().x(new pxo(iqt0Var.f15226a));
                return Unit.f46060a;
            case 22:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((gzo) obj2).y.a(th3);
                return Unit.f46060a;
            case 23:
                pek pekVar = nzo.P1;
                ((View) obj).getClass();
                e0p e0pVar = (e0p) ((nzo) obj2).M1.getValue();
                long j2 = e0pVar.j;
                if (j2 != 0) {
                    e0pVar.c.a(e0pVar.h, true, j2);
                }
                return Unit.f46060a;
            case 24:
                z0p z0pVar = (z0p) obj2;
                g7z g7zVar = (g7z) obj;
                g7zVar.getClass();
                a6a a6aVar = g7zVar.f10839a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (a6aVar.d() & 4294967295L)) * 0.3f;
                w03 w03VarA = z03.a();
                w03VarA.f(fIntBitsToFloat, 0.0f);
                w03VarA.e(Float.intBitsToFloat((int) (a6aVar.d() >> 32)), 0.0f);
                w03VarA.e(Float.intBitsToFloat((int) (a6aVar.d() >> 32)) - fIntBitsToFloat, Float.intBitsToFloat((int) (a6aVar.d() & 4294967295L)));
                w03VarA.e(0.0f, Float.intBitsToFloat((int) (a6aVar.d() & 4294967295L)));
                nr nrVar = a6aVar.b;
                long jP = nrVar.p();
                nrVar.i().l();
                try {
                    ((fvt0) nrVar.b).i(w03VarA);
                    g7zVar.a();
                    nrVar.i().i();
                    nrVar.H(jP);
                    if (z0pVar.c()) {
                        zcl zclVar = qmk.f28987a;
                        float fW0 = g7zVar.w0(2.0f);
                        w03 w03VarA2 = z03.a();
                        float f6 = 0.5f * fW0;
                        w03VarA2.f(fIntBitsToFloat + f6, f6);
                        w03VarA2.e(Float.intBitsToFloat((int) (a6aVar.d() >> 32)) - f6, f6);
                        w03VarA2.e((Float.intBitsToFloat((int) (a6aVar.d() >> 32)) - fIntBitsToFloat) - f6, Float.intBitsToFloat((int) (a6aVar.d() & 4294967295L)) - f6);
                        w03VarA2.e(f6, Float.intBitsToFloat((int) (4294967295L & a6aVar.d())) - f6);
                        w03VarA2.c();
                        fhl.C0(g7zVar, w03VarA2, ijg.g, 0.0f, new vtm0(fW0, 0.0f, 0, 0, null, 30), 52);
                    }
                    return Unit.f46060a;
                } catch (Throwable th4) {
                    defpackage.c.g(nrVar, jP);
                    throw th4;
                }
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                i3p i3pVar = (i3p) obj2;
                int iIntValue = ((Integer) obj).intValue();
                if (((w2p) i3pVar.D()).b) {
                    i3pVar.G(new v2p(i3pVar.v.b.a(iIntValue, Arrays.copyOf(new Object[0], 0))));
                } else {
                    p7m0 p7m0Var4 = i3pVar.i.f25029a;
                    do {
                        value2 = p7m0Var4.getValue();
                        value2.getClass();
                        i3pVar.f.getClass();
                    } while (!p7m0Var4.m(value2, w2p.a((w2p) value2, false, false, true, null, null, 122)));
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                ((x1k) cpVar.u).b.setButtonClickListener(dyb.V(new qzn((mmn) obj2, cpVar, (byte) 29)));
                cpVar.t(new kgh(cpVar, (byte) 16));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                uid uidVar = (uid) obj;
                bek bekVar3 = m4p.S1;
                uidVar.getClass();
                ((m4p) obj2).G0().x(new o3p(uidVar));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                org.xplatform.favorites.impl.presentation.category.a aVar = (org.xplatform.favorites.impl.presentation.category.a) obj2;
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                aVar.B.b(th5, new q4p(aVar, b2));
                return Unit.f46060a;
            default:
                k6p k6pVar = (k6p) obj2;
                int iIntValue2 = ((Integer) obj).intValue();
                if (k6pVar.s) {
                    k6pVar.t.f(new b6p(iIntValue2));
                } else {
                    p7m0 p7m0Var5 = k6pVar.u;
                    do {
                        value3 = p7m0Var5.getValue();
                    } while (!p7m0Var5.m(value3, new d6p(k6pVar.w())));
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ yhn(Object obj, byte b) {
        this.f42644a = b;
        this.b = obj;
    }
}
