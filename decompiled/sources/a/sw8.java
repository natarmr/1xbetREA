package a;

import android.app.RemoteAction;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.drawable.Drawable;
import android.javax.sip.message.Response;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.view.textclassifier.TextClassification;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.game.counterstrike.impl.presentation.map_movement.Cs2MapMovementView;
import org.xplatform.registration.success.api.RegistrationSuccessParams;
import org.xplatform.security.api.presentation.models.TokenRestoreData;
import org.xplatform.security.impl.navigation.PhoneScreenFactoryImpl$getConfirmPhoneNumberBySmsScreen$1;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sw8 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32909a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sw8(nee neeVar, aht0 aht0Var, bby bbyVar, rch0 rch0Var) {
        this.f32909a = (byte) 12;
        this.b = neeVar;
        this.c = bbyVar;
        this.d = rch0Var;
    }

    private final Object a(Object obj) {
        u4q0 u4q0Var = (u4q0) this.b;
        Context context = (Context) this.c;
        g5q0 g5q0Var = (g5q0) this.d;
        pje pjeVar = (pje) obj;
        List list = u4q0Var.f35064a;
        int size = list.size();
        byte b = 0;
        for (int i = 0; i < size; i++) {
            t4q0 t4q0Var = (t4q0) list.get(i);
            byte b2 = 19;
            byte b3 = 6;
            byte b4 = 1;
            if (t4q0Var instanceof b5q0) {
                b5q0 b5q0Var = (b5q0) t4q0Var;
                pje.b(pjeVar, new yfg(b5q0Var, b2), b5q0Var.c != 0 ? new ugd(-1930700965, true, new bkh(b5q0Var, b4)) : null, new vef(b5q0Var, g5q0Var, (byte) 26), 6);
            } else if (t4q0Var instanceof h5q0) {
                if (Build.VERSION.SDK_INT >= 28) {
                    h5q0 h5q0Var = (h5q0) t4q0Var;
                    if (context != null) {
                        int i2 = h5q0Var.c;
                        TextClassification textClassification = h5q0Var.b;
                        Drawable drawable = h5q0Var.d;
                        if (i2 < 0) {
                            pje.b(pjeVar, new l7p0(textClassification, (byte) 18), drawable != null ? new ugd(-1123224187, true, new a5q0(drawable, b)) : null, new yip0(context, textClassification, b3), 6);
                        } else {
                            RemoteAction remoteActionC = jw90.c(textClassification.getActions().get(i2));
                            pje.b(pjeVar, new l7p0(remoteActionC, b2), drawable != null ? new ugd(1106162332, true, new a5q0(drawable, b4)) : null, new h3q0((Object) remoteActionC, (byte) 2), 6);
                        }
                    }
                }
            } else if (t4q0Var instanceof f5q0) {
                pjeVar.f27086a.add(ro4.d);
            }
        }
        return Unit.f46060a;
    }

    private final Object b(Object obj) {
        atk atkVar = (atk) this.b;
        npn npnVar = (npn) this.c;
        xah xahVar = (xah) this.d;
        k0w0 k0w0Var = (k0w0) obj;
        k0w0Var.getClass();
        c8d c8dVar = (c8d) k0w0Var.b(new b1w0(new xg0(atkVar, npnVar, xahVar, null, (byte) 8))).f14945a;
        bjk bjkVar = cfx0.o;
        c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
        return Unit.f46060a;
    }

    private final Object c(Object obj) {
        szj0 szj0Var = (szj0) this.b;
        ebl eblVar = (ebl) this.c;
        FragmentScreen fragmentScreen = (FragmentScreen) this.d;
        k0w0 k0w0Var = (k0w0) obj;
        rzj0 rzj0Var = szj0Var.e;
        if (rzj0Var.equals(pzj0.f27849a)) {
            i3t0.A(eblVar, eblVar.R, new vpr(false), null, null, 6);
            k0w0Var.c(fragmentScreen);
        } else {
            if (!rzj0Var.equals(qzj0.f29581a)) {
                t9f.b();
                return null;
            }
            i3t0.A(eblVar, eblVar.R, new vpr(true), null, null, 6);
            k0w0Var.h(fragmentScreen);
        }
        return Unit.f46060a;
    }

    private final Object g(Object obj) {
        vj30 vj30Var = (vj30) this.b;
        rel relVar = (rel) this.c;
        pu90 pu90Var = (pu90) this.d;
        ou90 ou90Var = (ou90) obj;
        boolean zM = vj30Var.M();
        qv2 qv2Var = relVar.o;
        float fD = zM ? qv2Var.j().d(((zbk) relVar.o.k).getValue()) : qv2Var.v();
        ma80 ma80Var = relVar.q;
        float f = ma80Var == ma80.b ? fD : 0.0f;
        if (ma80Var != ma80.f21447a) {
            fD = 0.0f;
        }
        ou90Var.f25867a = true;
        ou90Var.g(pu90Var, si30.b(f), si30.b(fD), 0.0f);
        ou90Var.f25867a = false;
        return Unit.f46060a;
    }

    private final Object h(Object obj) {
        ov2 ov2Var = (ov2) this.b;
        vel velVar = (vel) this.c;
        ma80 ma80Var = (ma80) this.d;
        long jG = ne60.g(velVar.o1 ? -1.0f : 1.0f, ((odl) obj).f25081a);
        bk9 bk9Var = uel.f35535a;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (ma80Var == ma80.f21447a ? 4294967295L & jG : jG >> 32));
        switch (ov2Var.f25904a) {
            case 0:
                qv2 qv2Var = (qv2) ov2Var.b;
                mv2.a((mv2) qv2Var.n, qv2Var.u(fIntBitsToFloat));
                break;
            default:
                ((wtj) ov2Var.b).f39742a.invoke(Float.valueOf(fIntBitsToFloat));
                break;
        }
        return Unit.f46060a;
    }

    private final Object i(Object obj) {
        eql eqlVar = (eql) this.b;
        Function2 function2 = (Function2) this.c;
        Function0 function0 = (Function0) this.d;
        hcz hczVar = (hcz) obj;
        hczVar.getClass();
        a4x a4xVar = eqlVar.f8243a;
        hczVar.f(a4xVar.size(), null, new bzh(a4xVar, (byte) 16), new ugd(802480018, true, new c8((List) a4xVar, (Object) function2, (Object) function0, (byte) 18)));
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        TextView textView;
        x5a x5aVar;
        String str;
        String strF;
        byte b = this.f32909a;
        byte b2 = 23;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                vne vneVar = (vne) obj4;
                uw8 uw8Var = (uw8) obj3;
                d9z d9zVar = (d9z) obj2;
                px8 px8Var = (px8) obj;
                cl5 cl5Var = uw8.S1;
                px8Var.getClass();
                if (px8Var.equals(mx8.f22541a)) {
                    qjj.W(vneVar, null, null, new kn1(d9zVar, null == true ? 1 : 0, (byte) 2), 3);
                } else if (px8Var.equals(kx8.f19040a)) {
                    qcc.c0(uw8Var);
                } else if (px8Var.equals(lx8.f20802a)) {
                    j120.Y(uw8Var);
                } else if (px8Var instanceof ox8) {
                    ox8 ox8Var = (ox8) px8Var;
                    String str2 = ox8Var.f25999a;
                    String str3 = ox8Var.b;
                    String str4 = ox8Var.c;
                    ii iiVar = uw8Var.N1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    DialogFields dialogFields = new DialogFields((CharSequence) str2, (CharSequence) str3, (CharSequence) str4, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC = uw8Var.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else if (px8Var instanceof nx8) {
                    String str5 = ((nx8) px8Var).f24271a;
                    wdk0 wdk0Var = uw8Var.M1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, new xdk0(rek0.b, str5, null, null, null, null, 124), uw8Var, null, null, false, null, 1020);
                } else if (px8Var instanceof jx8) {
                    ob0 ob0Var = ((jx8) px8Var).f17291a;
                    if (ob0Var instanceof mb0) {
                        String str6 = ((mb0) ob0Var).f21481a;
                        ynb ynbVar = uw8Var.L1;
                        if (ynbVar == null) {
                            Intrinsics.h("changeBalanceDialogProvider");
                            throw null;
                        }
                        bm5 bm5Var = bm5.e;
                        androidx.fragment.app.e eVarC2 = uw8Var.C();
                        eVarC2.getClass();
                        ynb.b(ynbVar, bm5Var, str6, eVarC2, false, "REQUEST_CHANGE_BALANCE_KEY", Response.BUSY_HERE);
                    } else if (ob0Var.equals(lb0.f19732a)) {
                        kxq kxqVarB = uw8Var.B();
                        if (kxqVarB != null) {
                            ii iiVar2 = uw8Var.N1;
                            if (iiVar2 == null) {
                                Intrinsics.h("actionDialogManager");
                                throw null;
                            }
                            String string = kxqVarB.getString(R.string.attention);
                            String string2 = kxqVarB.getString(R.string.casino_guard_notify_description);
                            String string3 = kxqVarB.getString(R.string.ok);
                            string3.getClass();
                            iiVar2.d(new DialogFields((CharSequence) string, (CharSequence) string2, (CharSequence) string3, (String) null, (String) null, "REQUEST_ATTENTION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496), kxqVarB.r());
                        }
                    } else {
                        if (!ob0Var.equals(nb0.f23215a)) {
                            t9f.b();
                            return null;
                        }
                        kxq kxqVarB2 = uw8Var.B();
                        if (kxqVarB2 != null) {
                            ii iiVar3 = uw8Var.N1;
                            if (iiVar3 == null) {
                                Intrinsics.h("actionDialogManager");
                                throw null;
                            }
                            String string4 = kxqVarB2.getString(R.string.attention);
                            String string5 = kxqVarB2.getString(R.string.selected_balance_unavailable_description);
                            String string6 = kxqVarB2.getString(R.string.ok);
                            string6.getClass();
                            iiVar3.d(new DialogFields((CharSequence) string4, (CharSequence) string5, (CharSequence) string6, (String) null, (String) null, "REQUEST_ATTENTION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496), kxqVarB2.r());
                        }
                    }
                }
                uw8Var.G0().x(wt8.f39728a);
                return Unit.f46060a;
            case 1:
                cp cpVar = (cp) obj4;
                ((List) obj).getClass();
                pkd.h(((jsx) cpVar.u).b, pek0.g, null, new ugd(-977328694, true, new zb8((Object) cpVar, obj3, obj2, (byte) 14)));
                return Unit.f46060a;
            case 2:
                r9u r9uVar = (r9u) obj4;
                r6b r6bVar = (r6b) obj;
                r6bVar.getClass();
                ygp ygpVar = ygp.c;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                return new mya(r6bVar, j1q0Var.f15748a.d(ygpVar), (ctf0) obj3, (g2v) obj2);
            case 3:
                cob cobVar = (cob) obj4;
                xnb xnbVar = (xnb) obj3;
                Function1 function1 = (Function1) obj2;
                hcz hczVar = (hcz) obj;
                kj5 kj5Var = xnb.w2;
                hczVar.getClass();
                a4x a4xVar = cobVar.b;
                hczVar.f(a4xVar.size(), new at7(new pua((byte) 24), a4xVar, (byte) 16), new dx8(a4xVar, (byte) 7), new ugd(2039820996, true, new wnb(a4xVar, cobVar, xnbVar, function1)));
                a4x a4xVar2 = cobVar.c;
                hczVar.f(a4xVar2.size(), new at7(new pua((byte) 25), a4xVar2, (byte) 17), new dx8(a4xVar2, (byte) 8), new ugd(2039820996, true, new wnb(a4xVar2, xnbVar, cobVar, function1)));
                return Unit.f46060a;
            case 4:
                v7c v7cVar = (v7c) obj4;
                t5c t5cVar = (t5c) obj3;
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                mi70 mi70Var = v7cVar.r;
                String str7 = t5cVar.j;
                swp0 swp0Var = ((owt0) obj2).f25982a;
                int i = t5cVar.c;
                obk0 obk0Var = obk0.SMS;
                u5c u5cVar = new u5c(str7, swp0Var, i, kotlin.collections.a.c(obk0Var), kotlin.collections.a.c(obk0Var), t5cVar.f, t5cVar.h, v7cVar.d.u());
                mi70Var.getClass();
                k0w0Var.k(new PhoneScreenFactoryImpl$getConfirmPhoneNumberBySmsScreen$1(u5cVar));
                return Unit.f46060a;
            case 5:
                mwt0 mwt0Var = (mwt0) obj3;
                a6c a6cVar = (a6c) obj2;
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                lme0 lme0Var = ((v7c) obj4).K;
                String strValueOf = String.valueOf(mwt0Var.f22522a);
                String str8 = mwt0Var.b;
                String str9 = a6cVar.g;
                String str10 = a6cVar.h;
                Integer numValueOf = Integer.valueOf((int) a6cVar.j);
                gne0 gne0Var = q7f0.b;
                int i2 = a6cVar.i;
                gne0Var.getClass();
                RegistrationSuccessParams registrationSuccessParams = new RegistrationSuccessParams(strValueOf, str8, str9, str10, numValueOf, gne0.c(i2), a6cVar.o, a6cVar.n, a6cVar.k, a6cVar.l, a6cVar.m, a6cVar.p, null);
                lme0Var.getClass();
                k0w0Var2.l(lme0.a(registrationSuccessParams));
                return Unit.f46060a;
            case 6:
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                a4x a4xVar3 = ((sdc) obj4).c;
                hczVar2.f(a4xVar3.size(), null, new dx8(a4xVar3, (byte) 10), new ugd(2039820996, true, new c8((List) a4xVar3, obj3, (Function1) obj2, (byte) 12)));
                return Unit.f46060a;
            case 7:
                xhc xhcVar = (xhc) obj4;
                Function1 function2 = (Function1) obj3;
                wpq wpqVar = (wpq) obj2;
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                hcz.e(hczVar3, null, null, lv00.b, 3);
                hcz.e(hczVar3, null, null, new ugd(-1002741154, true, new ab4(xhcVar, function2, b2)), 3);
                if (!xhcVar.f40883a.isEmpty()) {
                    hcz.e(hczVar3, null, null, lv00.c, 3);
                    a4x a4xVar4 = xhcVar.f40883a;
                    hczVar3.f(a4xVar4.size(), null, new dx8(a4xVar4, (byte) 13), new ugd(2039820996, true, new gq4((List) a4xVar4, (Object) xhcVar, (Object) wpqVar, function2, (byte) 1)));
                }
                return Unit.f46060a;
            case 8:
                jie0 jie0Var = (jie0) obj4;
                x2d x2dVar = (x2d) obj3;
                i73 i73Var = (i73) obj;
                i73Var.getClass();
                hgk0 hgk0Var = (hgk0) i73Var.e;
                float fFloatValue = ((Number) hgk0Var.getValue()).floatValue() - jie0Var.f16571a;
                float fL = x2dVar.f.l();
                x2dVar.b(fL + fFloatValue);
                float fAbs = Math.abs(fL - x2dVar.f.l());
                jie0Var.f16571a = ((Number) hgk0Var.getValue()).floatValue();
                ((jie0) obj2).f16571a = ((Number) i73Var.b()).floatValue();
                if (Math.abs(fFloatValue - fAbs) > 0.5f) {
                    i73Var.a();
                }
                return Unit.f46060a;
            case 9:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                View view = cpVar2.f40887a;
                view.getClass();
                dyb.c0(view, new abd((m1w) obj4, cpVar2, (byte) 0));
                cpVar2.t(new sw8((Object) cpVar2, obj3, obj2, (byte) 10));
                return Unit.f46060a;
            case 10:
                cp cpVar3 = (cp) obj4;
                m1w m1wVar = (m1w) obj3;
                vft vftVar = (vft) obj2;
                ((List) obj).getClass();
                Object objU = cpVar3.u();
                View view2 = cpVar3.f40887a;
                yad yadVar = ((zad) objU).t;
                pzv pzvVar = (pzv) cpVar3.u;
                TextView textView2 = pzvVar.H;
                Group group = pzvVar.o;
                Group group2 = pzvVar.N;
                Group group3 = pzvVar.m;
                Group group4 = pzvVar.M;
                Group group5 = pzvVar.n;
                TextView textView3 = pzvVar.t;
                TextView textView4 = pzvVar.w;
                TextView textView5 = pzvVar.x;
                TextView textView6 = pzvVar.p;
                TextView textView7 = pzvVar.s;
                TextView textView8 = pzvVar.r;
                FrameLayout frameLayout = pzvVar.i;
                FrameLayout frameLayout2 = pzvVar.g;
                TextView textView9 = pzvVar.z;
                textView2.setVisibility(yadVar.b ? 0 : 8);
                textView2.setText(yadVar.f42289a);
                textView2.setBackgroundTintList(yadVar.c);
                textView9.setVisibility(yadVar.i ? 0 : 8);
                textView9.setText(yadVar.j);
                pzvVar.A.setVisibility(yadVar.d ? 0 : 8);
                TextView textView10 = pzvVar.y;
                rdj rdjVar = rdj.f30294a;
                byte b3 = 0;
                textView10.setText(rdj.g(new znq0(yadVar.e), efj.UNIVERSAL, Boolean.valueOf(yadVar.l), false, 56));
                frameLayout2.setVisibility(yadVar.f ? 0 : 8);
                pzvVar.f.setImageResource(yadVar.g);
                dyb.c0(frameLayout2, new bbd(m1wVar, cpVar3, b3));
                frameLayout.setVisibility(yadVar.h ? 0 : 8);
                dyb.b0(frameLayout, ymx.INTERVAL_500, new cbd(b3, cpVar3, vftVar));
                pzvVar.b.setVisibility(yadVar.k ? 0 : 8);
                if (((zad) cpVar3.u()).g) {
                    textView8.setVisibility(0);
                    textView7.setVisibility(0);
                    textView8.setText(view2.getContext().getResources().getString(R.string.coef_view_ind));
                    textView7.setText(view2.getContext().getResources().getString(R.string.coefficient_type_title));
                } else {
                    textView8.setVisibility(8);
                    textView7.setVisibility(8);
                }
                pzvVar.q.setText(((zad) cpVar3.u()).q);
                textView6.setVisibility(((zad) cpVar3.u()).r ? 0 : 8);
                textView6.setText(((zad) cpVar3.u()).s);
                pzvVar.e.setVisibility(((zad) cpVar3.u()).n ? 0 : 8);
                pzvVar.v.setText(((zad) cpVar3.u()).o);
                pzvVar.u.setText(((zad) cpVar3.u()).p);
                pzvVar.c.setVisibility(((zad) cpVar3.u()).b ? 0 : 8);
                pzvVar.d.setText(((zad) cpVar3.u()).c);
                so7 so7Var = ((zad) cpVar3.u()).l;
                textView5.setText(so7Var.f32531a);
                textView4.setText(so7Var.b);
                textView4.setTextColor(so7Var.c);
                Group group6 = pzvVar.j;
                TextView textView11 = pzvVar.k;
                group6.setVisibility(((zad) cpVar3.u()).m.d ? 0 : 8);
                pzvVar.l.setText(((zad) cpVar3.u()).m.f21497a);
                textView11.setText(((zad) cpVar3.u()).m.b);
                textView11.setTextColor(((zad) cpVar3.u()).m.c);
                e4f e4fVar = ((zad) cpVar3.u()).h;
                Context context = view2.getContext();
                context.getClass();
                if (feb.a0(e4fVar, context) != 0) {
                    e4f e4fVar2 = ((zad) cpVar3.u()).h;
                    Context context2 = view2.getContext();
                    context2.getClass();
                    int iA0 = feb.a0(e4fVar2, context2);
                    textView = textView3;
                    textView.setTextColor(iA0);
                } else {
                    textView = textView3;
                }
                pzvVar.h.setImageResource(((zad) cpVar3.u()).j);
                textView.setText(((zad) cpVar3.u()).i);
                if (((zad) cpVar3.u()).f) {
                    exo0 exo0Var = ((zad) cpVar3.u()).f44060a;
                    group5.setVisibility(exo0Var.f8589a ? 0 : 8);
                    pzvVar.D.setText(exo0Var.b);
                    pzvVar.E.setText(exo0Var.c);
                    group4.setVisibility(exo0Var.f ? 0 : 8);
                    pzvVar.I.setText(exo0Var.d);
                    pzvVar.J.setText(exo0Var.e);
                    group3.setVisibility(exo0Var.g ? 0 : 8);
                    pzvVar.B.setText(exo0Var.h);
                    pzvVar.C.setText(exo0Var.i);
                    group2.setVisibility(exo0Var.j ? 0 : 8);
                    pzvVar.K.setText(exo0Var.k);
                    pzvVar.L.setText(exo0Var.t);
                    group.setVisibility(exo0Var.n ? 0 : 8);
                    pzvVar.F.setText(exo0Var.m);
                    pzvVar.G.setText(exo0Var.o);
                    if (exo0Var.p) {
                        textView5.setText(exo0Var.q);
                        textView4.setText(exo0Var.r);
                        textView4.setTextColor(exo0Var.s);
                    }
                } else {
                    group5.setVisibility(8);
                    group4.setVisibility(8);
                    group3.setVisibility(8);
                    group2.setVisibility(8);
                    group.setVisibility(8);
                }
                return Unit.f46060a;
            case 11:
                swp0 swp0Var2 = (swp0) obj3;
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                k0w0Var3.k(((kyd) obj4).q.J0(new TokenRestoreData(swp0Var2.b, swp0Var2.f32933a, tzf0.f34801a), -1L, (we50) obj2));
                return Unit.f46060a;
            case 12:
                nee neeVar = (nee) obj4;
                bby bbyVar = (bby) obj3;
                rch0 rch0Var = (rch0) obj2;
                float fFloatValue2 = ((Float) obj).floatValue();
                float f = neeVar.q ? 1.0f : -1.0f;
                sch0 sch0Var = neeVar.p;
                long jF = sch0Var.f(sch0Var.i(f * fFloatValue2));
                sch0 sch0Var2 = rch0Var.f30239a;
                float fH = sch0Var.h(sch0Var.f(sch0Var2.d(sch0Var2.k, jF, 1))) * f;
                if (Math.abs(fH) < Math.abs(fFloatValue2)) {
                    zvw.G(bbyVar, rw2.i(fH, fFloatValue2, "Scroll animation cancelled because scroll was not consumed (", " < ", Separators.RPAREN));
                }
                return Unit.f46060a;
            case 13:
                a4x a4xVar5 = (a4x) obj4;
                hcz hczVar4 = (hcz) obj;
                hczVar4.getClass();
                hczVar4.f(a4xVar5.size(), null, new dx8(a4xVar5, (byte) 20), new ugd(2039820996, true, new c8((List) a4xVar5, obj3, obj2, (byte) 14)));
                return Unit.f46060a;
            case 14:
                pek0 pek0Var = pek0.d;
                djz djzVar = (djz) obj4;
                a8q0 a8q0Var = (a8q0) obj3;
                qe60 qe60Var = (qe60) obj2;
                fhl fhlVar = (fhl) obj;
                b9q0 b9q0VarD = djzVar.d();
                if (b9q0VarD != null) {
                    x5a x5aVarI = fhlVar.A0().i();
                    long j = ((o9q0) ((hgk0) djzVar.A).getValue()).f24893a;
                    long j2 = ((o9q0) ((hgk0) djzVar.B).getValue()).f24893a;
                    a9q0 a9q0Var = b9q0VarD.f2224a;
                    bw40 bw40Var = a9q0Var.b;
                    z8q0 z8q0Var = a9q0Var.f491a;
                    ucs0 ucs0Var = djzVar.y;
                    long j3 = djzVar.z;
                    if (!o9q0.c(j)) {
                        ucs0Var.s(j3);
                        int iS = qe60Var.s(o9q0.f(j));
                        int iS2 = qe60Var.s(o9q0.e(j));
                        if (iS != iS2) {
                            x5aVarI.p(a9q0Var.k(iS, iS2), ucs0Var);
                        }
                    } else if (!o9q0.c(j2)) {
                        long jB = z8q0Var.b.b();
                        y3d y3dVar = jB != 16 ? new y3d(jB) : null;
                        long j4 = y3dVar != null ? y3dVar.f41946a : y3d.b;
                        ucs0Var.s(y3d.c(y3d.d(j4) * 0.2f, j4));
                        int iS3 = qe60Var.s(o9q0.f(j2));
                        int iS4 = qe60Var.s(o9q0.e(j2));
                        if (iS3 != iS4) {
                            x5aVarI.p(a9q0Var.k(iS3, iS4), ucs0Var);
                        }
                    } else if (!o9q0.c(a8q0Var.b)) {
                        ucs0Var.s(j3);
                        long j5 = a8q0Var.b;
                        int iS5 = qe60Var.s(o9q0.f(j5));
                        int iS6 = qe60Var.s(o9q0.e(j5));
                        if (iS5 != iS6) {
                            x5aVarI.p(a9q0Var.k(iS5, iS6), ucs0Var);
                        }
                    }
                    boolean z = a9q0Var.f() && z8q0Var.f != 3;
                    if (z) {
                        long j6 = a9q0Var.c;
                        jge0 jge0VarR = k9x.r(0L, (((long) Float.floatToRawIntBits((int) (j6 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j6 >> 32))) << 32));
                        x5aVarI.l();
                        x5a.h(x5aVarI, jge0VarR);
                    }
                    smk0 smk0Var = z8q0Var.b.f42262a;
                    k5q0 k5q0Var = smk0Var.m;
                    e8q0 e8q0Var = smk0Var.f32451a;
                    if (k5q0Var == null) {
                        k5q0Var = k5q0.b;
                    }
                    k5q0 k5q0Var2 = k5q0Var;
                    ljj0 ljj0Var = smk0Var.n;
                    if (ljj0Var == null) {
                        ljj0Var = ljj0.d;
                    }
                    ljj0 ljj0Var2 = ljj0Var;
                    agc agcVar = smk0Var.o;
                    if (agcVar == null) {
                        agcVar = l0q.f19214a;
                    }
                    agc agcVar2 = agcVar;
                    try {
                        t89 t89VarL = e8q0Var.l();
                        try {
                            if (t89VarL != null) {
                                x5aVar = x5aVarI;
                                x8f.X(bw40Var, x5aVar, t89VarL, e8q0Var != pek0Var ? e8q0Var.g() : 1.0f, ljj0Var2, k5q0Var2, agcVar2);
                            } else {
                                x5aVar = x5aVarI;
                                bw40Var.i(x5aVar, e8q0Var != pek0Var ? e8q0Var.h() : y3d.b, ljj0Var2, k5q0Var2, agcVar2);
                            }
                            if (z) {
                                x5aVar.i();
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (z) {
                                x5aVarI.i();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return Unit.f46060a;
            case 15:
                jzj jzjVar = (jzj) obj4;
                odd oddVar = (odd) obj3;
                t9r0 t9r0Var = (t9r0) obj2;
                Throwable th3 = (Throwable) obj;
                if (th3 == null) {
                    oddVar.N(t9r0Var.invoke(jzjVar.getCompleted()));
                } else if (th3 instanceof CancellationException) {
                    oddVar.s((CancellationException) th3);
                } else {
                    oddVar.b0(th3);
                }
                return Unit.f46060a;
            case 16:
                rnf rnfVar = (rnf) obj3;
                FragmentScreen fragmentScreen = (FragmentScreen) obj2;
                k0w0 k0w0Var4 = (k0w0) obj;
                rzj0 rzj0Var = ((szj0) obj4).e;
                if (rzj0Var.equals(pzj0.f27849a)) {
                    i3t0.A(rnfVar, rnfVar.S, new vpr(false), null, null, 6);
                    k0w0Var4.c(fragmentScreen);
                } else {
                    if (!rzj0Var.equals(qzj0.f29581a)) {
                        t9f.b();
                        return null;
                    }
                    i3t0.A(rnfVar, rnfVar.S, new vpr(true), null, null, 6);
                    k0w0Var4.h(fragmentScreen);
                }
                return Unit.f46060a;
            case 17:
                return Cs2MapMovementView.v((String) obj4, (Cs2MapMovementView) obj3, (zb1) obj2, (Drawable) obj);
            case 18:
                a4x a4xVar6 = (a4x) obj4;
                hcz hczVar5 = (hcz) obj;
                kwd kwdVar = djg.n2;
                hczVar5.getClass();
                hczVar5.f(a4xVar6.size(), null, new dx8(a4xVar6, b2), new ugd(2039820996, true, new gq4(a4xVar6, (djg) obj3, (Function1) obj2, a4xVar6)));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                r9u r9uVar2 = (r9u) obj2;
                ((ubh) obj).getClass();
                ygp ygpVar2 = ygp.t;
                r9uVar2.getClass();
                j1q0 j1q0Var2 = r9uVar2.f30104a;
                j1q0Var2.getClass();
                return new l7h((ctf0) obj4, (y78) obj3, j1q0Var2.f15748a.d(ygpVar2));
            case 20:
                ocl oclVar = (ocl) obj4;
                ctf0 ctf0Var = (ctf0) obj2;
                dwh dwhVar = (dwh) obj;
                dwhVar.getClass();
                boolean z2 = !h97.A((wyu) obj3, uaq0.f35345a);
                ctf0Var.getClass();
                String strZ = p7x.z(z2, 36L);
                mwh mwhVar = dwhVar.f;
                boolean z3 = dwhVar.f6798a;
                b9a0 b9a0Var = mwhVar.f22502a;
                String str11 = b9a0Var.f;
                if (kotlin.text.c.x(str11, ujn.h, false)) {
                    str = str11;
                } else {
                    if (str11.length() != 0) {
                        List list = u0d.f34849a;
                        if (!u0d.c(str11)) {
                            str = String.format(Locale.ENGLISH, StringsKt.O(str11, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str11}, 2));
                        }
                    }
                    str11 = "";
                    str = str11;
                }
                List list2 = mwhVar.b;
                zvh zvhVar = new zvh(strZ, str, ((StringBuilder) rz4.d("sfiles", "logo_teams", b9a0Var.e.b).b).toString(), b9a0Var.b, b9a0Var.e.f3077a);
                if (dwhVar.c) {
                    return new fwh(zvhVar, z3, ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                }
                if (dwhVar.d) {
                    return new fwh(zvhVar, z3, ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990));
                }
                if (dwhVar.b) {
                    return new gwh(zvhVar, z3);
                }
                long j7 = dwhVar.e;
                ArrayList arrayList = new ArrayList();
                Object[] objArr = list2.size() > 1;
                if (objArr != false) {
                    arrayList.add(new lxl(0L, (dyl) new xxl(ctf0Var.b.a(R.string.statistic_all_value, Arrays.copyOf(new Object[0], 0))), (Integer) 1, false, j7 == 0 ? uxl.b : uxl.f36445a, (cwl) null));
                }
                Iterator it = list2.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        q3d.p();
                        throw null;
                    }
                    mvh mvhVar = (mvh) next;
                    if (objArr != false) {
                        i3 = i4;
                    }
                    Iterator it2 = it;
                    long j8 = i3;
                    arrayList.add(new lxl(j8, (dyl) new xxl(mvhVar.b), (Integer) 1, false, j7 == j8 ? uxl.b : uxl.f36445a, (cwl) null));
                    it = it2;
                    i3 = i4;
                }
                a4x a4xVarO0 = dyb.o0(arrayList);
                boolean z4 = dwhVar.f6798a;
                boolean z5 = list2.size() > 1;
                int i5 = 10;
                ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    List<s8g0> list3 = ((mvh) it3.next()).f22456a;
                    ArrayList arrayList3 = new ArrayList(r3d.q(list3, i5));
                    for (s8g0 s8g0Var : list3) {
                        s8g0Var.getClass();
                        long j9 = s8g0Var.f31798a;
                        ArrayList arrayList4 = arrayList2;
                        long j10 = s8g0Var.b;
                        if (j9 != r10 && j10 != r10) {
                            rdj rdjVar2 = rdj.f30294a;
                            znq0 znq0Var = new znq0(j9);
                            sdj sdjVar = sdj.UNIVERSAL;
                            strF = w6x.q(rdj.f(znq0Var, sdjVar, null, 60), " - ", rdj.f(new znq0(j10), sdjVar, null, 60));
                        } else if (j9 != r10) {
                            rdj rdjVar3 = rdj.f30294a;
                            strF = rdj.f(new znq0(j9), sdj.UNIVERSAL, null, 60);
                        } else if (j10 != r10) {
                            rdj rdjVar4 = rdj.f30294a;
                            strF = rdj.f(new znq0(j10), sdj.UNIVERSAL, null, 60);
                        } else {
                            strF = "-";
                        }
                        String str12 = strF;
                        String strValueOf2 = String.valueOf(s8g0Var.c);
                        int iOrdinal = s8g0Var.d.ordinal();
                        String strA = ctf0Var.b.a(iOrdinal != 1 ? iOrdinal != 2 ? R.string.game_end : R.string.live : R.string.line, Arrays.copyOf(new Object[0], 0));
                        String str13 = s8g0Var.e;
                        String str14 = s8g0Var.f;
                        List list4 = s8g0Var.g;
                        ArrayList arrayList5 = new ArrayList(r3d.q(list4, 10));
                        Iterator it4 = list4.iterator();
                        while (it4.hasNext()) {
                            arrayList5.add(ckb.d0((c6u0) it4.next()));
                        }
                        arrayList3.add(new fuh(str12, strValueOf2, strA, str13, str14, dyb.o0(arrayList5)));
                        arrayList2 = arrayList4;
                    }
                    arrayList2.add(dyb.o0(arrayList3));
                    i5 = 10;
                }
                a4x a4xVarO1 = dyb.o0(arrayList2);
                if (z5) {
                    ArrayList arrayList6 = new ArrayList();
                    arrayList6.add(dyb.o0(r3d.r(a4xVarO1)));
                    arrayList6.addAll(a4xVarO1);
                    a4xVarO1 = dyb.o0(arrayList6);
                }
                return new ewh(zvhVar, z4, a4xVarO0, a4xVarO1, dwhVar.e, a4xVarO0.size());
            case 21:
                ymx ymxVar = (ymx) obj4;
                Function1 function3 = (Function1) obj3;
                egk0 egk0Var = (egk0) obj2;
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (egk0Var.l() == 0 || jUptimeMillis - egk0Var.l() > ymxVar.f42912a) {
                    egk0Var.m(jUptimeMillis);
                    function3.invoke(obj);
                }
                return Unit.f46060a;
            case 22:
                jie0 jie0Var2 = (jie0) obj4;
                i73 i73Var2 = (i73) obj;
                float fFloatValue3 = ((Number) ((hgk0) i73Var2.e).getValue()).floatValue() - jie0Var2.f16571a;
                float fA = ((qah0) obj3).a(fFloatValue3);
                jie0Var2.f16571a = ((Number) ((hgk0) i73Var2.e).getValue()).floatValue();
                ((jie0) obj2).f16571a = ((Number) i73Var2.b()).floatValue();
                if (Math.abs(fFloatValue3 - fA) > 0.5f) {
                    i73Var2.a();
                }
                return Unit.f46060a;
            case 23:
                return a(obj);
            case 24:
                return b(obj);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return c(obj);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return g(obj);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return h(obj);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return i(obj);
            default:
                Function0 function0 = (Function0) obj4;
                Function0 function4 = (Function0) obj3;
                Function0 function5 = (Function0) obj2;
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue == 0) {
                    function0.invoke();
                } else if (iIntValue == 1) {
                    function4.invoke();
                } else if (iIntValue == 2) {
                    function5.invoke();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ sw8(jie0 jie0Var, qah0 qah0Var, jie0 jie0Var2, iuj iujVar) {
        this.f32909a = (byte) 22;
        this.b = jie0Var;
        this.c = qah0Var;
        this.d = jie0Var2;
    }

    public /* synthetic */ sw8(Object obj, Object obj2, Object obj3, byte b) {
        this.f32909a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
