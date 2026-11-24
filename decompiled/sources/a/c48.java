package a;

import android.content.Context;
import android.content.Intent;
import android.hardware.biometrics.BiometricManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.game_broadcasting.api.presentation.models.events.BroadcastingLandscapeZoneEvent;
import org.xplatform.game_broadcasting.impl.presentation.zone.GameZoneView;
import org.xplatform.games_section.feature.cashback.presentation.custom_view.CashbackChoiceView;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c48 extends xo implements Function2 {
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c48(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.h = b;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:335:0x0a39  */
    /* JADX WARN: Code duplicated, block: B:337:0x0a3f  */
    /* JADX WARN: Code duplicated, block: B:339:0x0a51  */
    /* JADX WARN: Code duplicated, block: B:342:0x0a5f  */
    /* JADX WARN: Code duplicated, block: B:343:0x0a6c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r8v32 */
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
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object value;
        Object value2;
        byte b = this.h;
        byte b2 = 27;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = false;
        z = false;
        boolean z4 = false;
        z3 = false;
        yr10 yr10Var = 0;
        Object obj3 = this.f41192a;
        switch (b) {
            case 0:
                ((d48) obj3).z((Throwable) obj);
                return Unit.f46060a;
            case 1:
                cl5 cl5Var = e68.N1;
                ((e68) obj3).G0().b.a(((x58) obj).f40301a);
                return Unit.f46060a;
            case 2:
                i68 i68Var = (i68) obj;
                e68 e68Var = (e68) obj3;
                cl5 cl5Var2 = e68.N1;
                if (i68Var instanceof g68) {
                    e68Var.G0().d.d();
                    if (((g68) i68Var).f10749a) {
                        e68Var.H0().w(m2a.e);
                    } else {
                        TextView textView = e68Var.G0().c;
                        textView.setTextColor(e68Var.o0().getColor(R.color.static_red));
                        textView.setText(R.string.fingerprint_pass_error);
                        new nvu(e68Var.o0()).Z();
                        e68Var.G0().c.startAnimation(AnimationUtils.loadAnimation(e68Var.o0(), R.anim.shake_long));
                    }
                } else {
                    e68Var.getClass();
                    if (!Intrinsics.d(i68Var, h68.f12518a)) {
                        t9f.b();
                        return null;
                    }
                    d68 d68Var = new d68(e68Var);
                    Executor executorO0 = jiq0.o0(e68Var.o0());
                    executorO0.getClass();
                    androidx.fragment.app.e eVarC = e68Var.C();
                    piu0 piu0VarG = e68Var.g();
                    miu0 miu0VarP = u4n0.p(e68Var);
                    wbf wbfVarO = u4n0.o(e68Var);
                    miu0VarP.getClass();
                    wbfVarO.getClass();
                    h0q0 h0q0Var = new h0q0(piu0VarG, miu0VarP, wbfVarO);
                    tre0 tre0Var = sre0.f32672a;
                    sgy sgyVarB = tre0Var.b(t58.class);
                    String strV = sgyVarB.v();
                    if (strV == null) {
                        jf4.o("Local and anonymous classes can not be ViewModels");
                        return null;
                    }
                    e68Var.u1.a(new r58((t58) h0q0Var.t(sgyVarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strV))));
                    piu0 piu0VarG2 = e68Var.g();
                    miu0 miu0VarP2 = u4n0.p(e68Var);
                    wbf wbfVarO2 = u4n0.o(e68Var);
                    miu0VarP2.getClass();
                    wbfVarO2.getClass();
                    h0q0 h0q0Var2 = new h0q0(piu0VarG2, miu0VarP2, wbfVarO2);
                    sgy sgyVarB2 = tre0Var.b(t58.class);
                    String strV2 = sgyVarB2.v();
                    if (strV2 == null) {
                        jf4.o("Local and anonymous classes can not be ViewModels");
                        return null;
                    }
                    t58 t58Var = (t58) h0q0Var2.t(sgyVarB2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strV2));
                    t58Var.b = executorO0;
                    t58Var.c = d68Var;
                    String string = e68Var.o0().getString(R.string.biometrics_authentication);
                    String string2 = e68Var.o0().getString(R.string.cancel);
                    if (TextUtils.isEmpty(string)) {
                        jf4.o("Title must be set and non-empty.");
                        return null;
                    }
                    if (!hmw0.a0(0)) {
                        throw new IllegalArgumentException("Authenticator combination is unsupported on API " + Build.VERSION.SDK_INT + ": " + String.valueOf(0));
                    }
                    yzn0 yzn0Var = new yzn0(string, string2);
                    if (eVarC == null) {
                        Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
                    } else if (eVarC.a0()) {
                        Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
                    } else {
                        l58 l58Var = (l58) eVarC.J("androidx.biometric.internal.BiometricFragment");
                        if (l58Var == null) {
                            l58Var = new l58();
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("host_activity", false);
                            l58Var.s0(bundle);
                            zb5 zb5Var = new zb5(eVarC);
                            zb5Var.k(0, l58Var, "androidx.biometric.internal.BiometricFragment", 1);
                            zb5Var.g(true, true);
                            eVarC.F();
                        }
                        t58 t58Var2 = l58Var.H1;
                        t58Var2.d = yzn0Var;
                        t58Var2.y();
                        t58 t58Var3 = l58Var.H1;
                        BiometricManager biometricManagerB = Build.VERSION.SDK_INT >= 29 ? m58.b(l58Var.o0().getApplicationContext()) : null;
                        if (Build.VERSION.SDK_INT >= 35 && biometricManagerB != null) {
                            try {
                                n58.a(biometricManagerB, 65536);
                                break;
                            } catch (SecurityException unused) {
                            }
                        }
                        t58Var3.getClass();
                        t58Var3.y();
                        t58 t58Var4 = l58Var.H1;
                        t58Var4.e = null;
                        if (Build.VERSION.SDK_INT < 30) {
                            t58Var4.d.getClass();
                            for (int i = 1; i <= 15; i = (i << 1) | 1) {
                                if (i == 0) {
                                    t58Var4.e = wwb.B();
                                }
                            }
                        }
                        t58Var4.y();
                        boolean zA0 = l58Var.A0();
                        t58 t58Var5 = l58Var.H1;
                        if (zA0) {
                            t58Var5.j = l58Var.H(R.string.confirm_device_credential_password);
                        } else {
                            t58Var5.j = null;
                        }
                        Context contextD = l58Var.D();
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 == 29) {
                            Bundle bundle2 = l58Var.g;
                            Context contextD2 = l58Var.D();
                            if (bundle2.getBoolean("has_fingerprint", (contextD2 == null || contextD2.getPackageManager() == null || !contextD2.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) ? false : true)) {
                                if (!l58Var.A0()) {
                                }
                                if (l58Var.H1.o) {
                                    l58Var.I1.postDelayed(new k58(l58Var), 600L);
                                } else {
                                    l58Var.H0();
                                }
                            } else {
                                Bundle bundle3 = l58Var.g;
                                Context contextD3 = l58Var.D();
                                if (bundle3.getBoolean("has_face", i2 >= 29 && contextD3 != null && contextD3.getPackageManager() != null && contextD3.getPackageManager().hasSystemFeature("android.hardware.biometrics.face"))) {
                                    if (!l58Var.A0()) {
                                    }
                                    if (l58Var.H1.o) {
                                        l58Var.I1.postDelayed(new k58(l58Var), 600L);
                                    } else {
                                        l58Var.H0();
                                    }
                                } else {
                                    Bundle bundle4 = l58Var.g;
                                    Context contextD4 = l58Var.D();
                                    if (!bundle4.getBoolean("has_iris", i2 >= 29 && contextD4 != null && contextD4.getPackageManager() != null && contextD4.getPackageManager().hasSystemFeature("android.hardware.biometrics.iris"))) {
                                        l58Var.H1.m = true;
                                        l58Var.C0();
                                    } else if (!l58Var.A0() && new nhf0(new o58(contextD, (byte) 0)).d(255) != 0) {
                                        l58Var.H1.m = true;
                                        l58Var.C0();
                                    } else if (l58Var.H1.o) {
                                        l58Var.I1.postDelayed(new k58(l58Var), 600L);
                                    } else {
                                        l58Var.H0();
                                    }
                                }
                            }
                        } else {
                            if (!l58Var.A0()) {
                            }
                            if (l58Var.H1.o) {
                                l58Var.I1.postDelayed(new k58(l58Var), 600L);
                            } else {
                                l58Var.H0();
                            }
                        }
                    }
                }
                return Unit.f46060a;
            case 3:
                cm80 cm80Var = (cm80) obj;
                ty8 ty8Var = (ty8) obj3;
                ty8Var.getClass();
                if ((cm80Var instanceof zl80) && ((zl80) cm80Var).b) {
                    z3 = true;
                }
                ty8Var.H(new uj1(cm80Var, z ? 1 : 0));
                if (z3) {
                    ty8Var.G(mx8.f22541a);
                }
                return Unit.f46060a;
            case 4:
                cm80 cm80Var2 = (cm80) obj;
                s29 s29Var = (s29) obj3;
                s29Var.getClass();
                if ((cm80Var2 instanceof zl80) && ((zl80) cm80Var2).b) {
                    z4 = true;
                }
                s29Var.H(new b85(cm80Var2, z4, z2 ? 1 : 0));
                if (z4) {
                    s29Var.G(r19.f29667a);
                }
                return Unit.f46060a;
            case 5:
                f89 f89Var = (f89) obj;
                z79 z79Var = (z79) obj3;
                bj5 bj5Var = z79.O1;
                z79Var.getClass();
                if (f89Var != null) {
                    if (f89Var instanceof c89) {
                        z79Var.G0().b.setVisibility(8);
                        z79Var.G0().c.setVisibility(0);
                        z79Var.G0().b.setProgressVisible(false);
                        z79Var.I0(((c89) f89Var).f3902a);
                    } else if (f89Var instanceof e89) {
                        z79Var.G0().b.setVisibility(0);
                        z79Var.G0().c.setVisibility(8);
                        e89 e89Var = (e89) f89Var;
                        z79Var.G0().b.setBroadcastingUrl(e89Var.f7362a);
                        z79Var.G0().b.setProgressVisible(true);
                        z79Var.I0(e89Var.b);
                    } else if (f89Var instanceof d89) {
                        z79Var.G0().b.setVisibility(0);
                        z79Var.G0().c.setVisibility(8);
                        z79Var.G0().b.setProgressVisible(false);
                        GameZoneView gameZoneView = z79Var.G0().b;
                        d89 d89Var = (d89) f89Var;
                        boolean z5 = d89Var.c;
                        w3w0 w3w0Var = d89Var.e;
                        gameZoneView.setZoneFormatIsVisible(d89Var.f);
                        z79Var.G0().b.setZoneFormatDrawable(w3w0Var);
                        z79Var.I0(d89Var.d);
                        if (z5) {
                            z79Var.G0().b.setPlayZoneCommand(d89Var.f5635a);
                            z79Var.G0().b.f();
                            z79Var.G0().b.g(d89Var.b, w3w0Var);
                        } else {
                            z79Var.G0().b.e();
                        }
                        z79Var.G0().b.setPlayDrawable(z5);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 6:
                t79 t79Var = t79.f33455a;
                w79 w79Var = (w79) obj;
                z79 z79Var2 = (z79) obj3;
                bj5 bj5Var2 = z79.O1;
                if (w79Var instanceof u79) {
                    z79Var2.J0(BroadcastingLandscapeZoneEvent.Fullscreen.f46696a);
                    p7m0 p7m0Var = z79Var2.H0().m;
                    p7m0Var.getClass();
                    p7m0Var.o(null, t79Var);
                } else if (w79Var instanceof v79) {
                    if (Settings.canDrawOverlays(z79Var2.o0())) {
                        z79Var2.J0(BroadcastingLandscapeZoneEvent.Windowed.f46698a);
                        ((v79) w79Var).f36913a.invoke();
                    } else {
                        Context contextO0 = z79Var2.o0();
                        Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + contextO0.getPackageName()));
                        if (contextO0.getPackageManager().resolveActivity(intent, 0) != null) {
                            intent.setFlags(268435456);
                            contextO0.startActivity(intent);
                        }
                    }
                    p7m0 p7m0Var2 = z79Var2.H0().m;
                    p7m0Var2.getClass();
                    p7m0Var2.o(null, t79Var);
                } else {
                    z79Var2.getClass();
                    if (!Intrinsics.d(w79Var, t79Var)) {
                        if (!Intrinsics.d(w79Var, t79.b)) {
                            t9f.b();
                            return null;
                        }
                        z79Var2.J0(BroadcastingLandscapeZoneEvent.Stop.f46697a);
                        p7m0 p7m0Var3 = z79Var2.H0().m;
                        p7m0Var3.getClass();
                        p7m0Var3.o(null, t79Var);
                    }
                }
                return Unit.f46060a;
            case 7:
                us9 us9Var = (us9) obj;
                br9 br9Var = (br9) obj3;
                kl5 kl5Var = br9.S1;
                if (us9Var instanceof ms9) {
                    ms9 ms9Var = (ms9) us9Var;
                    wyq wyqVarG0 = br9Var.G0();
                    ((cyv) br9Var.R1.getValue()).A(ms9Var.f22308a);
                    wyqVarG0.c.setVisibility(0);
                    wyqVarG0.e.setVisibility(8);
                    LinearLayout linearLayout = wyqVarG0.d.b;
                    linearLayout.setVisibility(8);
                    x0x.O(linearLayout);
                    wyqVarG0.b.setVisibility(8);
                    Fragment fragment = br9Var.y;
                    yr10 yr10Var2 = fragment instanceof yr10 ? (yr10) fragment : null;
                    if (yr10Var2 != null) {
                        yr10Var2.H0(ms9Var.b);
                    }
                } else {
                    br9Var.getClass();
                    if (Intrinsics.d(us9Var, os9.f25772a)) {
                        wyq wyqVarG1 = br9Var.G0();
                        wyqVarG1.c.setVisibility(8);
                        wyqVarG1.e.setVisibility(0);
                        LinearLayout linearLayout2 = wyqVarG1.d.b;
                        linearLayout2.setVisibility(8);
                        x0x.O(linearLayout2);
                        wyqVarG1.b.setVisibility(8);
                        Fragment fragment2 = br9Var.y;
                        yr10 yr10Var3 = fragment2 instanceof yr10 ? (yr10) fragment2 : null;
                        if (yr10Var3 != null) {
                            yr10Var3.H0(false);
                        }
                    } else if (Intrinsics.d(us9Var, ss9.f32715a)) {
                        wyq wyqVarG2 = br9Var.G0();
                        wyqVarG2.c.setVisibility(8);
                        wyqVarG2.e.setVisibility(8);
                        LinearLayout linearLayout3 = wyqVarG2.d.b;
                        linearLayout3.setVisibility(0);
                        x0x.s(linearLayout3);
                        wyqVarG2.b.setVisibility(8);
                        Fragment fragment3 = br9Var.y;
                        yr10 yr10Var4 = fragment3 instanceof yr10 ? (yr10) fragment3 : null;
                        if (yr10Var4 != null) {
                            yr10Var4.H0(false);
                        }
                    } else {
                        if (!(us9Var instanceof qs9)) {
                            t9f.b();
                            return null;
                        }
                        wyq wyqVarG3 = br9Var.G0();
                        wyqVarG3.c.setVisibility(8);
                        wyqVarG3.e.setVisibility(8);
                        LinearLayout linearLayout4 = wyqVarG3.d.b;
                        linearLayout4.setVisibility(8);
                        x0x.O(linearLayout4);
                        LottieView lottieView = wyqVarG3.b;
                        lottieView.w(((qs9) us9Var).f29248a);
                        lottieView.setVisibility(0);
                        Fragment fragment4 = br9Var.y;
                        yr10Var = fragment4 instanceof yr10 ? (yr10) fragment4 : 0;
                        if (yr10Var != 0) {
                            yr10Var.H0(false);
                        }
                    }
                }
                return Unit.f46060a;
            case 8:
                tq9 tq9Var = (tq9) obj;
                br9 br9Var2 = (br9) obj3;
                kl5 kl5Var2 = br9.S1;
                br9Var2.getClass();
                pq9 pq9Var = pq9.f27404a;
                if (!Intrinsics.d(tq9Var, pq9Var)) {
                    if (Intrinsics.d(tq9Var, qq9.f29154a)) {
                        ii iiVar = br9Var2.L1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH = br9Var2.H(R.string.support_cancel_request);
                        String strH2 = br9Var2.H(R.string.support_dialog_delete);
                        String strH3 = br9Var2.H(R.string.yes);
                        strH3.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, br9Var2.H(R.string.no), (String) null, "CANCEL_REQUEST_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC2 = br9Var2.C();
                        eVarC2.getClass();
                        iiVar.d(dialogFields, eVarC2);
                    } else if (tq9Var instanceof sq9) {
                        String str = ((sq9) tq9Var).f32617a;
                        wdk0 wdk0Var = br9Var2.M1;
                        if (wdk0Var == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        wdk0.k(wdk0Var, new xdk0(pek0.f26859a, str, null, null, null, null, 124), br9Var2, null, null, false, null, 1020);
                    } else {
                        if (!Intrinsics.d(tq9Var, rq9.f30920a)) {
                            t9f.b();
                            return null;
                        }
                        wdk0 wdk0Var2 = br9Var2.M1;
                        if (wdk0Var2 == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        rek0 rek0Var = rek0.b;
                        String strH4 = br9Var2.H(R.string.error_something_went_wrong);
                        strH4.getClass();
                        wdk0.k(wdk0Var2, new xdk0(rek0Var, strH4, null, null, null, null, 124), br9Var2, null, null, false, null, 1020);
                    }
                    p7m0 p7m0Var4 = br9Var2.H0().n;
                    p7m0Var4.getClass();
                    p7m0Var4.o(null, pq9Var);
                }
                return Unit.f46060a;
            case 9:
                Throwable th = (Throwable) obj;
                wsa wsaVar = (wsa) obj3;
                p7m0 p7m0Var5 = wsaVar.i.f25029a;
                do {
                    value = p7m0Var5.getValue();
                    value.getClass();
                    wsaVar.f.getClass();
                } while (!p7m0Var5.m(value, gsa.a((gsa) value, null, null, true, iun.f15405a, 0, 0, null, false, false, null, 4067)));
                wsaVar.E.b(th, new im8(b2));
                return Unit.f46060a;
            case 10:
                Throwable th2 = (Throwable) obj;
                wsa wsaVar2 = (wsa) obj3;
                p7m0 p7m0Var6 = wsaVar2.i.f25029a;
                do {
                    value2 = p7m0Var6.getValue();
                    value2.getClass();
                    wsaVar2.f.getClass();
                } while (!p7m0Var6.m(value2, gsa.a((gsa) value2, null, null, true, iun.f15405a, 0, 0, null, false, false, null, 4067)));
                wsaVar2.E.b(th2, new im8(b2));
                return Unit.f46060a;
            case 11:
                wya wyaVar = (wya) obj;
                aya ayaVar = (aya) obj3;
                bj5 bj5Var3 = aya.S1;
                m0b m0bVarH0 = ayaVar.H0();
                n0o0 n0o0Var = ayaVar.R1;
                if (m0bVarH0.e.getAdapter() == null) {
                    ayaVar.H0().e.setAdapter((lza) n0o0Var.getValue());
                }
                ((lza) n0o0Var.getValue()).A(wyaVar.f39964a);
                bdx.j0(ayaVar.H0().e);
                CashbackChoiceView cashbackChoiceView = ayaVar.H0().g;
                int i3 = wyaVar.b;
                cashbackChoiceView.f46727a = (byte) 2;
                cashbackChoiceView.b = i3;
                cashbackChoiceView.b();
                return Unit.f46060a;
            case 12:
                ra10 ra10Var = (ra10) obj;
                aya ayaVar2 = (aya) obj3;
                bj5 bj5Var4 = aya.S1;
                if (ra10Var != null) {
                    ayaVar2.H0().c.setVisibility(0);
                    ayaVar2.H0().c.v(ra10Var);
                    ayaVar2.H0().d.setVisibility(8);
                    ayaVar2.J0(false);
                    CashbackChoiceView cashbackChoiceView2 = ayaVar2.H0().g;
                    cashbackChoiceView2.f46727a = (byte) 2;
                    cashbackChoiceView2.b = 0;
                    cashbackChoiceView2.b();
                } else {
                    ayaVar2.H0().c.setVisibility(8);
                    ayaVar2.J0(true);
                }
                return Unit.f46060a;
            case 13:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                aya ayaVar3 = (aya) obj3;
                bj5 bj5Var5 = aya.S1;
                ayaVar3.H0().d.setVisibility(zBooleanValue ? 0 : 8);
                ayaVar3.H0().e.setVisibility(zBooleanValue ? 4 : 0);
                ayaVar3.H0().g.setVisibility(zBooleanValue ? 4 : 0);
                return Unit.f46060a;
            case 14:
                String str2 = (String) obj;
                bj5 bj5Var6 = aya.S1;
                Context contextO1 = ((aya) obj3).o0();
                str2.getClass();
                Toast toast = mym0.f22609a;
                if (toast != null) {
                    toast.cancel();
                }
                Toast toastMakeText = Toast.makeText(contextO1, str2, 1);
                mym0.f22609a = toastMakeText;
                if (toastMakeText != null) {
                    toastMakeText.show();
                }
                return Unit.f46060a;
            case 15:
                String str3 = (String) obj;
                aya ayaVar4 = (aya) obj3;
                bj5 bj5Var7 = aya.S1;
                wdk0 wdk0Var3 = ayaVar4.N1;
                if (wdk0Var3 != null) {
                    wdk0.k(wdk0Var3, new xdk0(rek0.b, str3, null, null, null, null, 124), ayaVar4, null, null, false, null, 1020);
                    return Unit.f46060a;
                }
                Intrinsics.h("snackbarManager");
                throw null;
            case 16:
                gl5 gl5Var = xpb.S1;
                ((xpb) obj3).G0().c.setTitle((String) obj);
                return Unit.f46060a;
            case 17:
                String str4 = (String) obj;
                xpb xpbVar = (xpb) obj3;
                gl5 gl5Var2 = xpb.S1;
                xpbVar.G0().e.f(str4.length() > 0);
                xpbVar.G0().e.setErrorText(str4);
                return Unit.f46060a;
            case 18:
                gl5 gl5Var3 = xpb.S1;
                ((xpb) obj3).G0().f.setText((String) obj);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                gl5 gl5Var4 = xpb.S1;
                ((xpb) obj3).G0().d.setVisibility(zBooleanValue2 ? 0 : 8);
                return Unit.f46060a;
            case 20:
                gl5 gl5Var5 = xpb.S1;
                ((xpb) obj3).G0().e.setText((String) obj);
                return Unit.f46060a;
            case 21:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                gl5 gl5Var6 = xpb.S1;
                ((xpb) obj3).G0().b.setFirstButtonEnabled(zBooleanValue3);
                return Unit.f46060a;
            case 22:
                d7a d7aVar = (d7a) obj;
                xpb xpbVar2 = (xpb) obj3;
                gl5 gl5Var7 = xpb.S1;
                if (xpbVar2.N1 == null) {
                    Intrinsics.h("captchaDialogDelegate");
                    throw null;
                }
                String strH5 = xpbVar2.H(R.string.login_title);
                strH5.getClass();
                gl5.q(xpbVar2, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", d7aVar, strH5);
                return Unit.f46060a;
            case 23:
                hrb hrbVar = (hrb) obj3;
                hrbVar.getClass();
                sac.R(jiu0.a(hrbVar), new lya(hrbVar, (byte) 13), null, hrbVar.c.f22085a, new fob(hrbVar, (Throwable) obj, yr10Var, (byte) 5));
                return Unit.f46060a;
            case 24:
                ((k1q0) obj3).A((List) obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                utc utcVar = (utc) obj;
                stc stcVar = (stc) obj3;
                iiy[] iiyVarArr = stc.Q1;
                wdk0 wdk0Var4 = stcVar.M1;
                if (wdk0Var4 == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                String str5 = utcVar.f36248a;
                j120.M(stcVar, wdk0Var4, str5, str5, utcVar.b, null, null, null, 112);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((ugd) obj3).a(((Number) obj2).intValue(), (fet) obj);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                r0e r0eVar = (r0e) obj;
                qud qudVar = uzd.S1;
                jzq jzqVarH0 = ((uzd) obj3).H0();
                FrameLayout frameLayout = jzqVarH0.e;
                DsBottomBar dsBottomBar = jzqVarH0.b;
                frameLayout.setVisibility(r0eVar.f29624a ? 0 : 8);
                jzqVarH0.h.setText(r0eVar.b);
                jzqVarH0.f.setVisibility(r0eVar.f ? 0 : 8);
                wzd wzdVar = r0eVar.c;
                dsBottomBar.setFirstButtonVisibility(wzdVar.b);
                dsBottomBar.setFirstButtonText(wzdVar.f40017a);
                dsBottomBar.setFirstButtonEnabled(wzdVar.c);
                dsBottomBar.setFirstButtonStyle(R.style.DSButton_Large_Secondary);
                wzd wzdVar2 = r0eVar.d;
                dsBottomBar.setSecondButtonVisibility(wzdVar2.b);
                dsBottomBar.setSecondButtonText(wzdVar2.f40017a);
                dsBottomBar.setSecondButtonEnabled(wzdVar2.c);
                dsBottomBar.setSecondButtonStyle(R.style.DSButton_Large_Secondary);
                wzd wzdVar3 = r0eVar.e;
                dsBottomBar.setThirdButtonVisibility(wzdVar3.b);
                dsBottomBar.setThirdButtonText(wzdVar3.f40017a);
                dsBottomBar.setThirdButtonEnabled(wzdVar3.c);
                dsBottomBar.setThirdButtonStyle(R.style.DSButton_Large_Secondary);
                jzqVarH0.g.setVisibility(r0eVar.h ? 0 : 8);
                jzqVarH0.c.setVisibility(r0eVar.g ? 0 : 8);
                jzqVarH0.d.setTitle(r0eVar.i);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                a0e a0eVar = (a0e) obj;
                uzd uzdVar = (uzd) obj3;
                qud qudVar2 = uzd.S1;
                if (a0eVar instanceof xzd) {
                    uzdVar.H0().i.setVisibility(8);
                } else {
                    uzdVar.getClass();
                    if (Intrinsics.d(a0eVar, yzd.f43509a)) {
                        uzdVar.H0().i.setVisibility(8);
                    } else {
                        if (!(a0eVar instanceof zzd)) {
                            t9f.b();
                            return null;
                        }
                        uzdVar.H0().i.setVisibility(0);
                        uzdVar.H0().i.setText(((zzd) a0eVar).f45248a);
                    }
                }
                return Unit.f46060a;
            default:
                s9e s9eVar = (s9e) obj;
                e7e e7eVar = (e7e) obj3;
                kwd kwdVar = e7e.d2;
                e7eVar.getClass();
                if (s9eVar != null) {
                    if (s9eVar instanceof q9e) {
                        e7eVar.H0().j.setAlpha(0.6f);
                        e7eVar.H0().s.setProgress(((q9e) s9eVar).f28342a);
                    } else if (s9eVar instanceof r9e) {
                        e7eVar.H0().s.setProgress(0);
                        Editable text = e7eVar.H0().f.getText();
                        if (text != null && text.length() != 0) {
                            e7eVar.H0().j.setAlpha(1.0f);
                        }
                        ndk0 ndk0Var = e7eVar.Q1;
                        if (ndk0Var != null) {
                            ndk0Var.dismiss();
                        }
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }
}
