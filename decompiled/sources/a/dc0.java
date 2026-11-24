package a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.javax.sip.message.Response;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.cyberstatistic.api.navigation.CyberGameStatisticScreenParams;
import org.xplatform.cyber.cyberstatistic.impl.navigation.CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;
import org.xplatform.cyber.game.counterstrike.impl.presentation.game_log.bomb.Cs2GameLogBombTimerView;
import org.xplatform.cyber.game.counterstrike.impl.presentation.map_movement.Cs2MapMovementView;
import org.xplatform.cyber.section.api.championships.regular.presentation.CyberChampParams;
import org.xplatform.login.core.presentation.model.AuthDataErrorModel;
import org.xplatform.picker.api.presentation.AnalyticsEntryPoint;
import org.xplatform.picker.api.presentation.PickerParams;
import org.xplatform.security.impl.navigation.SendConfirmationSMSScreen;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dc0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5826a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ dc0(pru pruVar, bzt bztVar, rpt rptVar, pek pekVar, b8u b8uVar) {
        this.f5826a = (byte) 8;
        this.b = pruVar;
        this.c = bztVar;
        this.d = rptVar;
        this.e = b8uVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:20:0x00ca  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v24 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Bitmap bitmap;
        DialogFields dialogFields;
        String string;
        m7h0 sendConfirmationSMSScreen;
        FragmentScreen fragmentScreenA;
        Bitmap bitmap2;
        daq0 daq0Var;
        long jT;
        byte b = this.f5826a;
        byte b2 = 20;
        byte b3 = 2;
        byte b4 = 1;
        byte b5 = 0;
        Bitmap bitmap3 = 0;
        Object obj2 = null;
        bitmapS0 = null;
        Bitmap bitmapS0 = null;
        bitmap3 = 0;
        Object obj3 = this.c;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                Map map = (Map) obj6;
                Resources resources = (Resources) obj5;
                pz40 pz40Var = (pz40) obj4;
                kz3 kz3Var = (kz3) obj;
                kz3Var.getClass();
                long j = ((fc0) obj3).f9285a;
                y3d y3dVar = (y3d) map.get(Long.valueOf(j));
                if (y3dVar != null) {
                    pz40Var.setValue(y3dVar);
                    return Unit.f46060a;
                }
                Drawable drawableQ = c3x.q(kz3Var.b.f13073a, resources);
                BitmapDrawable bitmapDrawable = drawableQ instanceof BitmapDrawable ? (BitmapDrawable) drawableQ : null;
                if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                    if (Build.VERSION.SDK_INT >= 26 && bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                        bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, false);
                        bitmap.getClass();
                    }
                    bitmap3 = bitmap;
                }
                if (bitmap3 != 0) {
                    long jD = fbc.d(bitmap3.getPixel(2, bitmap3.getHeight() / 2));
                    map.put(Long.valueOf(j), new y3d(jD));
                    pz40Var.setValue(new y3d(jD));
                }
                return Unit.f46060a;
            case 1:
                pp0 pp0Var = (pp0) obj6;
                mm40 mm40Var = (mm40) obj3;
                Function0 function0 = (Function0) obj5;
                Function1 function1 = (Function1) obj4;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                np0 np0Var = (np0) pp0Var;
                if (np0Var.b) {
                    hcz.e(hczVar, null, null, new ugd(-1163723278, true, new gp0(mm40Var, pp0Var, function0)), 3);
                }
                a4x a4xVar = np0Var.f23889a.f10362a;
                hczVar.f(a4xVar.size(), null, new b8(a4xVar, (byte) 11), new ugd(802480018, true, new kp0(a4xVar, mm40Var, function1, (byte) 0)));
                return Unit.f46060a;
            case 2:
                a9q0 a9q0Var = (a9q0) obj;
                jdk0 jdk0Var = z31.n2;
                a9q0Var.getClass();
                rwj rwjVar = tvk.f34603a;
                qjj.W((vne) obj6, ys10.f43147a.x(), null, new ah0((Object) a9q0Var, obj4, obj3, obj5, (yje) null, (byte) 1), 2);
                return Unit.f46060a;
            case 3:
                dz1 dz1Var = (dz1) obj;
                dz1Var.getClass();
                return new rw(dz1Var, (ctf0) obj5, ((wiu) obj3).a(), (g2v) obj4, ((pru) obj6).a());
            case 4:
                k0w0 k0w0Var = (k0w0) obj;
                mr0 mr0Var = new mr0((a570) obj6, (yn2) obj3, (String) obj5, (String) obj4);
                k0w0Var.getClass();
                c8d c8dVar = (c8d) k0w0Var.b(new a1w0(mr0Var)).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                return Unit.f46060a;
            case 5:
                t33 t33Var = (t33) obj6;
                l73 l73Var = (l73) obj3;
                Function1 function2 = (Function1) obj5;
                hie0 hie0Var = (hie0) obj4;
                i73 i73Var = (i73) obj;
                l73 l73Var2 = t33Var.c;
                hhm0.F(i73Var, l73Var2);
                hgk0 hgk0Var = (hgk0) i73Var.e;
                Object objB = t33Var.b(hgk0Var.getValue());
                if (!Intrinsics.d(objB, hgk0Var.getValue())) {
                    ((hgk0) l73Var2.b).setValue(objB);
                    ((hgk0) l73Var.b).setValue(objB);
                    if (function2 != null) {
                        function2.invoke(t33Var);
                    }
                    i73Var.a();
                    hie0Var.f13108a = true;
                } else if (function2 != null) {
                    function2.invoke(t33Var);
                }
                return Unit.f46060a;
            case 6:
                pz40 pz40Var2 = (pz40) obj5;
                lz3 lz3Var = (lz3) obj;
                lz3Var.getClass();
                ((pz40) obj4).setValue(lz3Var);
                boolean zD = Intrinsics.d((o0x) obj6, (o0x) obj3);
                if ((lz3Var instanceof iz3) && !((Boolean) pz40Var2.getValue()).booleanValue() && !zD) {
                    pz40Var2.setValue(Boolean.TRUE);
                }
                return Unit.f46060a;
            case 7:
                Fragment fragment = (Fragment) obj6;
                u8i u8iVar = (u8i) obj3;
                ii iiVar = u8iVar.I;
                Function1 function3 = (Function1) obj5;
                Function0 function4 = (Function0) obj4;
                lb4 lb4Var = (lb4) obj;
                lb4Var.getClass();
                if (lb4Var instanceof kb4) {
                    int i = ((kb4) lb4Var).f17994a;
                    View viewJ = fragment.J();
                    ViewGroup viewGroup = viewJ instanceof ViewGroup ? (ViewGroup) viewJ : null;
                    tkz tkzVarQ = x0x.Q(fragment.u1);
                    rwj rwjVar2 = tvk.f34603a;
                    qjj.W(tkzVarQ, ys10.f43147a, null, new wa4(u8iVar, fragment, i, viewGroup, function3, null), 2);
                } else if (lb4Var.equals(fb4.f9239a)) {
                    androidx.fragment.app.e eVarC = fragment.C();
                    eVarC.getClass();
                    pek0.n(eVarC, false);
                } else if (lb4Var instanceof hb4) {
                    PickerParams.Phone phone = ((hb4) lb4Var).f12753a;
                    rl70 rl70Var = u8iVar.H;
                    androidx.fragment.app.e eVarC2 = fragment.C();
                    eVarC2.getClass();
                    rl70Var.e(eVarC2, phone, AnalyticsEntryPoint.b);
                } else {
                    if (lb4Var instanceof gb4) {
                        gb4 gb4Var = (gb4) lb4Var;
                        String str = gb4Var.f10998a;
                        String str2 = gb4Var.b;
                        boolean z = gb4Var.c;
                        String strH = fragment.H(R.string.close);
                        strH.getClass();
                        dialogFields = new DialogFields((CharSequence) str, (CharSequence) str2, (CharSequence) strH, z ? fragment.H(R.string.get_help) : null, (String) null, "AUTH_LOGIN_DEFAULT_KEY_REQUEST_SUPPORT", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                    } else if (lb4Var instanceof ib4) {
                        d7a d7aVar = ((ib4) lb4Var).f14469a;
                        String strH2 = fragment.H(R.string.authorization);
                        strH2.getClass();
                        gl5.q(fragment, "AUTH_LOGIN_DEFAULT_KEY_REQUEST_CAPTCHA_CODE_DIALOG", d7aVar, strH2);
                    } else if (lb4Var.equals(db4.f5783a)) {
                        function4.invoke();
                    } else if (lb4Var instanceof eb4) {
                        j120.d0(fragment.o0(), "open/paysystems");
                    } else {
                        if (!lb4Var.equals(jb4.f16221a)) {
                            t9f.b();
                            return null;
                        }
                        String strH3 = fragment.H(R.string.error);
                        String strH4 = fragment.H(R.string.something_went_wrong);
                        String strH5 = fragment.H(R.string.ok_new);
                        strH5.getClass();
                        dialogFields = new DialogFields((CharSequence) strH3, (CharSequence) strH4, (CharSequence) strH5, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    }
                    ua80.r(fragment, iiVar, dialogFields);
                }
                function3.invoke(r94.f30059a);
                return Unit.f46060a;
            case 8:
                b8u b8uVar = (b8u) obj4;
                vzg0 vzg0Var = (vzg0) obj;
                vzg0Var.getClass();
                sff0 sff0VarA = ((pru) obj6).a();
                f3c0 f3c0Var = sff0VarA.k;
                co4 co4Var = sff0VarA.N;
                v8d v8dVarA = ((bzt) obj3).f3488a.a();
                Object[] objArr = ((xr) ((rpt) obj5).f30901a).i() == rl40.GMS;
                boolean zBooleanValue = ((Boolean) a8k0.H(vzg0Var, "KEY_LOGIN_BY_PHONE", Boolean.valueOf(co4Var.j || (co4Var.f && !co4Var.e && !co4Var.d) == true))).booleanValue();
                lc00 lc00VarO = pek.o(f3c0Var, co4Var);
                ArrayList arrayList = new ArrayList();
                ListIterator listIterator = lc00VarO.listIterator(0);
                while (true) {
                    paw pawVar = (paw) listIterator;
                    if (!pawVar.hasNext()) {
                        return new mb4(zBooleanValue, true, arrayList, false, new gd4((String) a8k0.H(vzg0Var, "KEY_LOGIN", "")), new hd4((String) a8k0.H(vzg0Var, "KEY_PASSWORD", "")), new id4(((Number) a8k0.H(vzg0Var, "KEY_PHONE_MASK_MAX_LENGTH", 255)).intValue(), (String) a8k0.H(vzg0Var, "KEY_PHONE", ""), (String) a8k0.H(vzg0Var, "KEY_PHONE_MASK", ""), (String) a8k0.H(vzg0Var, "KEY_PHONE_CODE", ""), (String) a8k0.H(vzg0Var, "KEY_CODE_COUNTRY_IMAGE", "")), ((Number) a8k0.H(vzg0Var, "KEY_SELECTED_COUNTRY_ID", 225)).intValue(), ((Boolean) a8k0.H(vzg0Var, "KEY_COUNTRY_ALLOWED", Boolean.TRUE)).booleanValue(), iun.f15405a, ((zte0) ((chf0) b8uVar.f2175a).b).f44955a.get(), (AuthDataErrorModel) a8k0.H(vzg0Var, "AUTHORIZATION_DATA_ERROR_KEY", null), new cb4(sff0VarA.e0, co4Var.f, co4Var.d, co4Var.e, sff0VarA.T, sff0VarA.r.length() > 0, co4Var.k, co4Var.l, sff0VarA.q1, sff0VarA.W0, sff0VarA.u0, v8dVarA.k, v8dVarA.m, f3c0Var.h, co4Var.r), ((Boolean) a8k0.H(vzg0Var, "KEY_PASSWORD_RECOVER", Boolean.FALSE)).booleanValue());
                    }
                    Object next = pawVar.next();
                    u54 u54Var = (u54) next;
                    t54 t54Var = u54Var instanceof t54 ? (t54) u54Var : null;
                    if (t54Var == null || t54Var.f33350a != 11 || objArr != false) {
                        arrayList.add(next);
                    }
                }
                break;
            case 9:
                List list = (List) obj6;
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                hcz.e(hczVar2, null, null, cy2.p, 3);
                hczVar2.f(list.size(), null, new b8(list, (byte) 24), new ugd(802480018, true, new gq4(list, (Function1) obj3, obj5, obj4, (byte) 0)));
                return Unit.f46060a;
            case 10:
                ze5 ze5Var = (ze5) obj6;
                Throwable th = (Throwable) obj;
                th.getClass();
                sac.V(jiu0.a(ze5Var), ye5.f42471a, null, ze5Var.j.f22085a, new kv((Object) th, (Object) ze5Var, (String) obj3, obj5, (String) obj4, (yje) null, (byte) 2), 10);
                return Unit.f46060a;
            case 11:
                ze5 ze5Var2 = (ze5) obj6;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                sac.V(jiu0.a(ze5Var2), ve5.f37266a, null, ze5Var2.j.f22085a, new kv((Object) th2, (Object) ze5Var2, (String) obj3, obj5, (String) obj4, (yje) null, (byte) 1), 10);
                return Unit.f46060a;
            case 12:
                String str3 = (String) obj6;
                Integer num = (Integer) obj3;
                Function1 function5 = (Function1) obj5;
                pz40 pz40Var3 = (pz40) obj4;
                a8q0 a8q0Var = (a8q0) obj;
                a8q0Var.getClass();
                j83 j83Var = a8q0Var.f440a;
                if (str3 != null) {
                    String str4 = j83Var.b;
                    StringBuilder sb = new StringBuilder();
                    int length = str4.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        char cCharAt = str4.charAt(i2);
                        if (StringsKt.P(str3, cCharAt)) {
                            sb.append(cCharAt);
                        }
                    }
                    string = sb.toString();
                } else {
                    string = j83Var.b;
                }
                String strL = ttm0.L(num != null ? num.intValue() : j83Var.b.length(), string);
                if (strL.equals(j83Var.b)) {
                    pz40Var3.setValue(a8q0Var);
                } else {
                    String str5 = ((a8q0) pz40Var3.getValue()).f440a.b;
                    String str6 = j83Var.b;
                    long jE = a8q0Var.b;
                    if (str6.length() - str5.length() > 0) {
                        int i3 = o9q0.c;
                        int i4 = (int) (jE >> 32);
                        int length2 = str6.length();
                        for (int length3 = str5.length(); length3 < length2; length3++) {
                            if (!StringsKt.P(strL, str6.charAt(length3))) {
                                i4--;
                            }
                        }
                        int iD = l1e0.d(i4, 0, strL.length());
                        jE = s7n0.e(iD, iD);
                    }
                    pz40Var3.setValue(a8q0.b(a8q0Var, strL, jE, 4));
                }
                function5.invoke(new w5q0(((a8q0) pz40Var3.getValue()).f440a.b));
                return Unit.f46060a;
            case 13:
                r9u r9uVar = (r9u) obj6;
                hj6 hj6Var = (hj6) obj;
                hj6Var.getClass();
                ygp ygpVar = ygp.c;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                return new ov0(hj6Var, j1q0Var.f15748a.d(ygpVar), (ctf0) obj3, (g2v) obj5, (edu) obj4);
            case 14:
                id8 id8Var = (id8) obj6;
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                byte b6 = 9;
                hcz.e(hczVar3, null, null, new ugd(-532041111, true, new ab4((wfn) obj3, (hjm) obj5, b6)), 3);
                ArrayList arrayList2 = id8Var.g;
                hczVar3.f(arrayList2.size(), null, new j13(arrayList2, b4, null == true ? 1 : 0), new ugd(2039820996, true, new c8((List) arrayList2, (Object) id8Var, (Function1) obj4, b6)));
                hcz.e(hczVar3, null, null, new ugd(-2032435488, true, new un6(id8Var, (byte) 29)), 3);
                return Unit.f46060a;
            case 15:
                w03 w03Var = (w03) obj6;
                bh8 bh8Var = (bh8) obj3;
                w03 w03Var2 = (w03) obj5;
                n0o0 n0o0Var = (n0o0) obj4;
                g7z g7zVar = (g7z) obj;
                g7zVar.getClass();
                nr nrVar = g7zVar.f10839a.b;
                long jP = nrVar.p();
                nrVar.i().l();
                try {
                    ((fvt0) nrVar.b).i(w03Var);
                    g7zVar.a();
                    if (bh8Var.d) {
                        pz40 pz40Var4 = s6t0.f31722a;
                        fhl.C0(g7zVar, w03Var2, StaticColors.INSTANCE.m98getGreen0d7_KjU(), 0.0f, (vtm0) n0o0Var.getValue(), 52);
                        break;
                    }
                    return Unit.f46060a;
                } finally {
                    defpackage.c.g(nrVar, jP);
                }
            case 16:
                vne vneVar = (vne) obj6;
                m19 m19Var = (m19) obj3;
                d9z d9zVar = (d9z) obj5;
                nyq0 nyq0Var = (nyq0) obj4;
                t19 t19Var = (t19) obj;
                kj5 kj5Var = m19.U1;
                t19Var.getClass();
                if (t19Var.equals(r19.f29667a)) {
                    qjj.W(vneVar, null, null, new d09(d9zVar, nyq0Var, (yje) bitmap3, b3), 3);
                } else if (t19Var.equals(p19.f26189a)) {
                    qcc.c0(m19Var);
                } else if (t19Var.equals(q19.f27941a)) {
                    j120.Y(m19Var);
                } else if (t19Var instanceof s19) {
                    uzb0 uzb0Var = ((s19) t19Var).f31444a;
                    gle0 gle0Var = dlk0.m2;
                    androidx.fragment.app.e eVarF = m19Var.F();
                    gle0Var.getClass();
                    gle0.h(eVarF, "SELECT_SORT_TYPE_REQUEST_KEY", uzb0Var);
                } else if (t19Var instanceof o19) {
                    ob0 ob0Var = ((o19) t19Var).f24469a;
                    if (ob0Var.equals(lb0.f19732a)) {
                        kxq kxqVarB = m19Var.B();
                        if (kxqVarB != null) {
                            ii iiVar2 = m19Var.N1;
                            if (iiVar2 == null) {
                                Intrinsics.h("actionDialogManager");
                                throw null;
                            }
                            String string2 = kxqVarB.getString(R.string.attention);
                            String string3 = kxqVarB.getString(R.string.casino_guard_notify_description);
                            String string4 = kxqVarB.getString(R.string.ok);
                            string4.getClass();
                            iiVar2.d(new DialogFields((CharSequence) string2, (CharSequence) string3, (CharSequence) string4, (String) null, (String) null, "REQUEST_ATTENTION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496), kxqVarB.r());
                        }
                    } else if (ob0Var instanceof mb0) {
                        String str7 = ((mb0) ob0Var).f21481a;
                        ynb ynbVar = m19Var.M1;
                        if (ynbVar == null) {
                            Intrinsics.h("changeBalanceDialogProvider");
                            throw null;
                        }
                        bm5 bm5Var = bm5.e;
                        androidx.fragment.app.e eVarC3 = m19Var.C();
                        eVarC3.getClass();
                        ynb.b(ynbVar, bm5Var, str7, eVarC3, false, "REQUEST_CHANGE_BALANCE_KEY", Response.BUSY_HERE);
                    } else {
                        if (!ob0Var.equals(nb0.f23215a)) {
                            t9f.b();
                            return null;
                        }
                        kxq kxqVarB2 = m19Var.B();
                        if (kxqVarB2 != null) {
                            ii iiVar3 = m19Var.N1;
                            if (iiVar3 == null) {
                                Intrinsics.h("actionDialogManager");
                                throw null;
                            }
                            String string5 = kxqVarB2.getString(R.string.attention);
                            String string6 = kxqVarB2.getString(R.string.selected_balance_unavailable_description);
                            String string7 = kxqVarB2.getString(R.string.ok);
                            string7.getClass();
                            iiVar3.d(new DialogFields((CharSequence) string5, (CharSequence) string6, (CharSequence) string7, (String) null, (String) null, "REQUEST_ATTENTION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496), kxqVarB2.r());
                        }
                    }
                }
                m19Var.G0().x(f09.f8706a);
                return Unit.f46060a;
            case 17:
                gr00 gr00Var = (gr00) obj3;
                String str8 = (String) obj5;
                String str9 = (String) obj4;
                Map map2 = (Map) obj6;
                wgk wgkVar = (wgk) obj;
                wgkVar.getClass();
                vby vbyVar = (vby) gr00Var.b;
                String str10 = wgkVar.f39121a;
                Long lValueOf = Long.valueOf(new Date().getTime());
                knf0 knf0Var = (knf0) gr00Var.c;
                knf0Var.getClass();
                tuu0 tuu0Var = new tuu0(lValueOf, str10, str8.length() != 0 ? str8 : null);
                vbyVar.getClass();
                ((p2v0) gr00Var.d).f26270a.g(new j2v0(kng0.l("window.dispatchEvent(new CustomEvent(\"frameParams\", ", vbyVar.d(o7r.Companion.serializer(), new o7r(new k7r(knf0Var.c(), new n7r(gr00.k(vbyVar.d(tgd.Companion.serializer(), new tgd(map2, Long.valueOf(new Date().getTime()))), str9), gr00.k(vbyVar.d(tuu0.Companion.serializer(), tuu0Var), str9))))), "));")));
                return Unit.f46060a;
            case 18:
                z430 z430Var = (z430) obj6;
                vne vneVar2 = (vne) obj3;
                i3t0 i3t0Var = (i3t0) obj5;
                xcz xczVar = (xcz) obj4;
                q6b q6bVar = (q6b) obj;
                q6bVar.getClass();
                if (q6bVar instanceof o6b) {
                    z430Var.a(((o6b) q6bVar).f24725a, -1L, "");
                } else {
                    if (!q6bVar.equals(p6b.f26446a)) {
                        t9f.b();
                        return null;
                    }
                    qjj.W(vneVar2, null, null, new wi6(xczVar, bitmap3, b3), 3);
                }
                i3t0Var.x(z5b.f43807a);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                djz djzVar = (djz) obj6;
                o8q0 o8q0Var = (o8q0) obj3;
                a8q0 a8q0Var2 = (a8q0) obj5;
                k3x k3xVar = (k3x) obj4;
                if (djzVar.b()) {
                    hsj hsjVar = djzVar.d;
                    ome omeVar = djzVar.v;
                    ome omeVar2 = djzVar.w;
                    mie0 mie0Var = new mie0();
                    nej0 nej0Var = new nej0(hsjVar, omeVar, mie0Var, b2);
                    qw90 qw90Var = o8q0Var.f24843a;
                    qw90Var.g(a8q0Var2, k3xVar, nej0Var, omeVar2);
                    r8q0 r8q0Var = new r8q0(o8q0Var, qw90Var);
                    o8q0Var.b.set(r8q0Var);
                    mie0Var.f21842a = r8q0Var;
                    djzVar.e = r8q0Var;
                }
                return new mz2((byte) 2);
            case 20:
                swp0 swp0Var = (swp0) obj6;
                lbf lbfVar = (lbf) obj3;
                paf pafVar = lbfVar.i;
                String str11 = (String) obj5;
                String str12 = (String) obj4;
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                if (swp0Var.c) {
                    qud qudVar = lbfVar.m;
                    String str13 = swp0Var.b;
                    String str14 = swp0Var.f32933a;
                    we50 we50Var = pafVar.d;
                    List list2 = pafVar.b;
                    List list3 = pafVar.c;
                    qudVar.getClass();
                    sendConfirmationSMSScreen = qud.g(19, we50Var, str13, str14, str11, str12, list2, list3);
                } else {
                    mi70 mi70Var = lbfVar.j;
                    vbi0 vbi0Var = new vbi0(str11, swp0Var, 3, pafVar.b, pafVar.c, false, false, str12, pafVar.d);
                    mi70Var.getClass();
                    sendConfirmationSMSScreen = new SendConfirmationSMSScreen(vbi0Var);
                }
                k0w0Var2.h(sendConfirmationSMSScreen);
                return Unit.f46060a;
            case 21:
                elf elfVar = (elf) obj6;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) obj3;
                amf amfVar = (amf) obj5;
                Context context = (Context) obj4;
                xsh xshVar = (xsh) obj;
                xshVar.getClass();
                RecyclerView recyclerView = xshVar.b;
                Cs2GameLogBombTimerView cs2GameLogBombTimerView = xshVar.d;
                if (recyclerView.getAdapter() != elfVar) {
                    recyclerView.setAdapter(elfVar);
                }
                if (recyclerView.getLayoutManager() != linearLayoutManager) {
                    recyclerView.setLayoutManager(linearLayoutManager);
                }
                cs2GameLogBombTimerView.b(amfVar.b);
                elfVar.A(amfVar.f1104a);
                cs2GameLogBombTimerView.setBackground(sj3.U(R.drawable.cs2_bomb_bg, context));
                bpf bpfVar = amfVar.c;
                boolean z2 = amfVar.d;
                Cs2MapMovementView cs2MapMovementView = xshVar.c;
                cs2MapMovementView.u(bpfVar.b, bpfVar.e, bpfVar.f, bpfVar.g, bpfVar.h, new zb1((Object) xshVar, z2, (Object) cs2MapMovementView, (Object) bpfVar, (byte) 1), new jwd(xshVar, (byte) 21), bpfVar.f2979a);
                recyclerView.n(new jlf());
                return Unit.f46060a;
            case 22:
                igg iggVar = (igg) obj6;
                String str15 = (String) obj3;
                kie0 kie0Var = (kie0) obj5;
                qfg qfgVar = (qfg) obj4;
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                List listB = gql0.b();
                CyberChampParams cyberChampParams = iggVar.o;
                if (listB.contains(Long.valueOf(cyberChampParams.c))) {
                    gr00 gr00Var2 = iggVar.s;
                    CyberGameStatisticScreenParams cyberGameStatisticScreenParams = new CyberGameStatisticScreenParams(str15, cyberChampParams.c, 0, kie0Var.f18333a, "", "", "", "", -1L, "");
                    gr00Var2.getClass();
                    fragmentScreenA = new CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1(cyberGameStatisticScreenParams, gr00Var2);
                } else {
                    fragmentScreenA = ((zfm0) iggVar.r).a(40L, String.valueOf(qfgVar.f28631a));
                }
                k0w0Var3.h(fragmentScreenA);
                return Unit.f46060a;
            case 23:
                int iIntValue = ((Integer) obj).intValue();
                qjj.W((vne) obj6, null, null, new gjg((kwj) obj4, iIntValue, bitmap3, null == true ? 1 : 0), 3);
                ((aig) obj3).x(new nhg((cnb) ((i4) obj5).get(iIntValue)));
                return Unit.f46060a;
            case 24:
                View view = (View) obj6;
                ((lwk) obj).getClass();
                mr3 mr3Var = new mr3(view, (View) obj3, (w6k) obj5, (pz40) obj4);
                view.getViewTreeObserver().addOnGlobalLayoutListener(mr3Var);
                view.getViewTreeObserver().dispatchOnGlobalLayout();
                return new pr0((Object) view, (Object) mr3Var, (byte) 7);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                vne vneVar3 = (vne) obj6;
                q1j q1jVar = (q1j) obj3;
                kwj kwjVar = (kwj) obj5;
                l7m0 l7m0Var = (l7m0) obj4;
                lmm lmmVar = (lmm) obj;
                int i5 = q1j.n2;
                lmmVar.getClass();
                if (lmmVar.equals(jmm.f16772a)) {
                    if (!((Boolean) l7m0Var.getValue()).booleanValue()) {
                        qjj.W(vneVar3, null, null, new p1j(kwjVar, bitmap3, b5), 3);
                    }
                    q1jVar.P0().x(new k1j(kwjVar.k(), kwjVar.n()));
                } else {
                    if (!lmmVar.equals(kmm.f18547a)) {
                        t9f.b();
                        return null;
                    }
                    q1jVar.P0().x(new l1j(kwjVar.k()));
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Set set = (Set) obj6;
                Object obj7 = this.c;
                set.add(obj7);
                return new kz2(set, obj7, (Set) obj5, (pz40) obj4, (byte) 1);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Map map3 = (Map) obj6;
                Resources resources2 = (Resources) obj5;
                pz40 pz40Var5 = (pz40) obj4;
                kz3 kz3Var2 = (kz3) obj;
                kz3Var2.getClass();
                long j2 = ((cll) obj3).f4565a;
                y3d y3dVar2 = (y3d) map3.get(Long.valueOf(j2));
                if (y3dVar2 != null) {
                    pz40Var5.setValue(y3dVar2);
                    return Unit.f46060a;
                }
                Drawable drawableQ2 = c3x.q(kz3Var2.b.f13073a, resources2);
                BitmapDrawable bitmapDrawable2 = drawableQ2 instanceof BitmapDrawable ? (BitmapDrawable) drawableQ2 : null;
                if (bitmapDrawable2 != null && (bitmap2 = bitmapDrawable2.getBitmap()) != null) {
                    bitmapS0 = vzb.s0(bitmap2);
                }
                if (bitmapS0 != null) {
                    long jD2 = fbc.d(bitmapS0.getPixel(2, bitmapS0.getHeight() / 2));
                    map3.put(Long.valueOf(j2), new y3d(jD2));
                    pz40Var5.setValue(new y3d(jD2));
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new dg(cpVar, (x6f) obj6, (oye) obj3, (mhc) obj5, (x6f) obj4, (byte) 15));
                return Unit.f46060a;
            default:
                g9q0 g9q0Var = (g9q0) obj6;
                ecm ecmVar = (ecm) obj3;
                y9q0 y9q0Var = (y9q0) obj5;
                pz40 pz40Var6 = (pz40) obj4;
                a9q0 a9q0Var2 = (a9q0) obj;
                a9q0Var2.getClass();
                kotlin.ranges.a aVarI = l1e0.i(24, 20);
                ArrayList arrayList3 = new ArrayList(r3d.q(aVarI, 10));
                Iterator it = aVarI.iterator();
                while (((kkx) it).c) {
                    arrayList3.add(new daq0(idm0.t(((bkx) it).nextInt())));
                }
                for (Object obj8 : arrayList3) {
                    y9q0 y9q0Var2 = y9q0Var;
                    a9q0 a9q0VarA = g9q0.a(g9q0Var, ecmVar.f7573a, y9q0.a(y9q0Var, 0L, ((daq0) obj8).f5764a, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777213), 2, 2, a9q0Var2.f491a.j, null, 968);
                    if (qkx.a(a9q0VarA.c, a9q0Var2.c) && a9q0VarA.b.f == a9q0Var2.b.f) {
                        obj2 = obj8;
                        daq0Var = (daq0) obj2;
                        if (daq0Var != null) {
                            jT = daq0Var.f5764a;
                        } else {
                            jT = idm0.t(20);
                        }
                        pz40Var6.setValue(new daq0(jT));
                        return Unit.f46060a;
                    }
                    y9q0Var = y9q0Var2;
                }
                daq0Var = (daq0) obj2;
                if (daq0Var != null) {
                    jT = daq0Var.f5764a;
                } else {
                    jT = idm0.t(20);
                }
                pz40Var6.setValue(new daq0(jT));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ dc0(vne vneVar, pz40 pz40Var, cgk0 cgk0Var, pz40 pz40Var2) {
        this.f5826a = (byte) 2;
        this.b = vneVar;
        this.e = pz40Var;
        this.c = cgk0Var;
        this.d = pz40Var2;
    }

    public /* synthetic */ dc0(o0x o0xVar, o0x o0xVar2, pz40 pz40Var, pz40 pz40Var2) {
        this.f5826a = (byte) 6;
        this.b = o0xVar;
        this.c = o0xVar2;
        this.e = pz40Var;
        this.d = pz40Var2;
    }

    public /* synthetic */ dc0(gr00 gr00Var, String str, String str2, Map map) {
        this.f5826a = (byte) 17;
        this.c = gr00Var;
        this.d = str;
        this.e = str2;
        this.b = map;
    }

    public /* synthetic */ dc0(jdk0 jdk0Var, Fragment fragment, u8i u8iVar, Function1 function1, Function0 function0) {
        this.f5826a = (byte) 7;
        this.b = fragment;
        this.c = u8iVar;
        this.d = function1;
        this.e = function0;
    }

    public /* synthetic */ dc0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.f5826a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
