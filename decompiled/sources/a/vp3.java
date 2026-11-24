package a;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.jakewharton.processphoenix.PhoenixActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.platform.app.ApplicationLoader;
import org.xbet.client1.R;
import org.xplatform.alerts_pipe_api.presentation.AlertsPipeType;
import org.xplatform.apple_fortune.presentation.views.AppleFortuneCellGameView;
import org.xplatform.background_video.impl.presentation.BackgroundVideoService;
import org.xplatform.client1.features.appactivity.ApplicationActivity;
import org.xplatform.uikit.components.account_info.DsAccountInfo;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vp3 extends xo implements Function2 {
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vp3(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.h = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Drawable drawable;
        byte b = this.h;
        byte b2 = 5;
        byte b3 = 2;
        byte b4 = 6;
        byte b5 = 4;
        byte b6 = 1;
        z = true;
        boolean z = true;
        byte b7 = 0;
        Object obj3 = this.f41192a;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                iiy[] iiyVarArr = wp3.O1;
                ((wp3) obj3).G0().b.v(zBooleanValue);
                return Unit.f46060a;
            case 1:
                br3 br3Var = (br3) obj;
                wp3 wp3Var = (wp3) obj3;
                iiy[] iiyVarArr2 = wp3.O1;
                wp3Var.getClass();
                if (br3Var != null) {
                    if (br3Var instanceof ar3) {
                        ayq ayqVarG0 = wp3Var.G0();
                        ayqVarG0.c.setVisibility(8);
                        AppleFortuneCellGameView appleFortuneCellGameView = ayqVarG0.b;
                        appleFortuneCellGameView.y();
                        appleFortuneCellGameView.v(false);
                    } else if (br3Var instanceof yq3) {
                        wp3Var.G0().c.setVisibility(0);
                    } else if (br3Var instanceof xq3) {
                        cr3 cr3Var = ((xq3) br3Var).f41295a;
                        ayq ayqVarG1 = wp3Var.G0();
                        ayqVarG1.c.setVisibility(8);
                        AppleFortuneCellGameView appleFortuneCellGameView2 = ayqVarG1.b;
                        appleFortuneCellGameView2.u();
                        appleFortuneCellGameView2.D(cr3Var);
                        appleFortuneCellGameView2.v(true);
                    } else if (br3Var instanceof uq3) {
                        cr3 cr3Var2 = ((uq3) br3Var).f36098a;
                        ayq ayqVarG2 = wp3Var.G0();
                        ayqVarG2.c.setVisibility(8);
                        AppleFortuneCellGameView appleFortuneCellGameView3 = ayqVarG2.b;
                        appleFortuneCellGameView3.s.setEnabled(false);
                        appleFortuneCellGameView3.z(cr3Var2);
                    } else if (br3Var instanceof vq3) {
                        cr3 cr3Var3 = ((vq3) br3Var).f37835a;
                        ayq ayqVarG3 = wp3Var.G0();
                        ayqVarG3.c.setVisibility(8);
                        AppleFortuneCellGameView appleFortuneCellGameView4 = ayqVarG3.b;
                        appleFortuneCellGameView4.s.setEnabled(true);
                        appleFortuneCellGameView4.D(cr3Var3);
                        appleFortuneCellGameView4.v(true);
                    } else if (br3Var instanceof wq3) {
                        cr3 cr3Var4 = ((wq3) br3Var).f39570a;
                        wp3Var.G0().c.setVisibility(8);
                        AppleFortuneCellGameView appleFortuneCellGameView5 = wp3Var.G0().b;
                        appleFortuneCellGameView5.C(false);
                        appleFortuneCellGameView5.v(false);
                        appleFortuneCellGameView5.A(cr3Var4);
                    } else if (br3Var instanceof zq3) {
                        cr3 cr3Var5 = ((zq3) br3Var).f44790a;
                        wp3Var.G0().c.setVisibility(8);
                        AppleFortuneCellGameView appleFortuneCellGameView6 = wp3Var.G0().b;
                        appleFortuneCellGameView6.D(cr3Var5);
                        appleFortuneCellGameView6.C(false);
                        appleFortuneCellGameView6.v(false);
                        appleFortuneCellGameView6.B();
                        appleFortuneCellGameView6.A(cr3Var5);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 2:
                ((kq3) obj3).A((Throwable) obj);
                return Unit.f46060a;
            case 3:
                vt3 vt3Var = (vt3) obj;
                ApplicationActivity applicationActivity = (ApplicationActivity) obj3;
                int i = ApplicationActivity.F1;
                applicationActivity.getClass();
                rv00 rv00Var = rv00.B;
                lwf lwfVar = lwf.Y;
                pek0 pek0Var = pek0.f26859a;
                if (vt3Var != null) {
                    if (vt3Var instanceof ft3) {
                        applicationActivity.getWindow().getDecorView().postDelayed(new w1(applicationActivity, (byte) 9), 5000L);
                    } else if (vt3Var instanceof ot3) {
                        String str = ((ot3) vt3Var).f25812a;
                        Object obj4 = applicationActivity.E().get();
                        obj4.getClass();
                        String string = applicationActivity.getResources().getString(R.string.copy_info);
                        string.getClass();
                        wdk0.j((wdk0) obj4, new xdk0(pek0Var, str, null, new hdk0(string, new mc((Object) applicationActivity, (Object) str, (byte) 27)), null, null, 116), applicationActivity, null, null, false, false, null, 124);
                    } else if (vt3Var instanceof at3) {
                        Object obj5 = applicationActivity.E().get();
                        obj5.getClass();
                        wdk0 wdk0Var = (wdk0) obj5;
                        String str2 = ((at3) vt3Var).f1416a;
                        Object systemService = applicationActivity.getSystemService("clipboard");
                        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                        ClipData clipDataNewPlainText = ClipData.newPlainText("DEBUG_CONSOLE_LOGS", str2);
                        if (clipboardManager != null) {
                            clipboardManager.setPrimaryClip(clipDataNewPlainText);
                        }
                        if (Build.VERSION.SDK_INT <= 32) {
                            wdk0.j(wdk0Var, new xdk0(pek0Var, "Logs Copied", "", null, null, null, 88), applicationActivity, null, null, false, false, null, 120);
                        }
                    } else if (vt3Var instanceof zs3) {
                        if (tdc.U(applicationActivity.r())) {
                            zu3 zu3VarF = applicationActivity.F();
                            zu3VarF.c.d(new vs3(zu3VarF, b7));
                        }
                    } else if (vt3Var instanceof it3) {
                        it3 it3Var = (it3) vt3Var;
                        boolean z2 = it3Var.f15335a;
                        boolean z3 = it3Var.b;
                        z7z z7zVar = applicationActivity.n1;
                        if (z7zVar == null) {
                            Intrinsics.h("lockDialogFactory");
                            throw null;
                        }
                        fu00 fu00Var = (fu00) z7zVar.get();
                        v1r v1rVarR = applicationActivity.r();
                        fu00Var.getClass();
                        ayn.c2.getClass();
                        if (v1rVarR.J("EndSessionDialog") == null) {
                            ayn aynVar = new ayn();
                            iiy[] iiyVarArr3 = ayn.d2;
                            aynVar.Z1.v(aynVar, iiyVarArr3[0], z2);
                            aynVar.a2.v(aynVar, iiyVarArr3[1], z3);
                            aynVar.H0(v1rVarR, "EndSessionDialog");
                        }
                    } else if (vt3Var instanceof pt3) {
                        String str3 = ((pt3) vt3Var).f27544a;
                        z7z z7zVar2 = applicationActivity.n1;
                        if (z7zVar2 == null) {
                            Intrinsics.h("lockDialogFactory");
                            throw null;
                        }
                        Object obj6 = z7zVar2.get();
                        obj6.getClass();
                        v1r v1rVarR2 = applicationActivity.r();
                        diq0.b2.getClass();
                        if (v1rVarR2.J("TimeIsEndDialog") == null) {
                            diq0 diq0Var = new diq0();
                            diq0Var.Z1.x(diq0Var, diq0.c2[0], str3);
                            diq0Var.H0(v1rVarR2, "TimeIsEndDialog");
                        }
                    } else if (vt3Var instanceof rt3) {
                        z7z z7zVar3 = applicationActivity.o1;
                        if (z7zVar3 == null) {
                            Intrinsics.h("alertsPipeFeature");
                            throw null;
                        }
                        r12 r12VarA = ((p12) z7zVar3.get()).a();
                        AlertsPipeType.UserAgreementDocumentsDialog userAgreementDocumentsDialog = new AlertsPipeType.UserAgreementDocumentsDialog(false);
                        v1r v1rVarR3 = applicationActivity.r();
                        z7z z7zVar4 = applicationActivity.p1;
                        if (z7zVar4 == null) {
                            Intrinsics.h("userAgreementDocumentsDialogProvider");
                            throw null;
                        }
                        ((lqt0) z7zVar4.get()).getClass();
                        ((s12) r12VarA).a(new q12(userAgreementDocumentsDialog, v1rVarR3, "USER_AGREEMENT_DIALOG_REQUEST_KEY"));
                    } else if (vt3Var instanceof mt3) {
                        String str4 = ((mt3) vt3Var).f22351a;
                        z7z z7zVar5 = applicationActivity.o1;
                        if (z7zVar5 == null) {
                            Intrinsics.h("alertsPipeFeature");
                            throw null;
                        }
                        ((s12) ((p12) z7zVar5.get()).a()).a(new q12(new AlertsPipeType.NotIdentifiedKzAlert(str4), applicationActivity.r(), ""));
                    } else if (vt3Var instanceof qt3) {
                        z7z z7zVar6 = applicationActivity.q1;
                        if (z7zVar6 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        ii iiVar = (ii) z7zVar6.get();
                        String string2 = applicationActivity.getString(R.string.error);
                        String string3 = applicationActivity.getString(R.string.error_something_went_wrong);
                        String string4 = applicationActivity.getString(R.string.ok_new);
                        string4.getClass();
                        iiVar.d(new DialogFields((CharSequence) string2, (CharSequence) string3, (CharSequence) string4, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528), applicationActivity.r());
                    } else if (vt3Var instanceof gt3) {
                        z7z z7zVar7 = applicationActivity.q1;
                        if (z7zVar7 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        ii iiVar2 = (ii) z7zVar7.get();
                        z7z z7zVar8 = applicationActivity.r1;
                        if (z7zVar8 == null) {
                            Intrinsics.h("logoutDialogFactory");
                            throw null;
                        }
                        ((ux00) z7zVar8.get()).getClass();
                        iiVar2.c(ux00.a(), applicationActivity.r());
                    } else if (vt3Var instanceof ht3) {
                        String packageName = applicationActivity.getPackageName();
                        PackageManager packageManager = applicationActivity.getPackageManager();
                        Intent leanbackLaunchIntentForPackage = packageManager.hasSystemFeature("android.software.leanback") ? packageManager.getLeanbackLaunchIntentForPackage(packageName) : null;
                        if (leanbackLaunchIntentForPackage == null) {
                            leanbackLaunchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                        }
                        if (leanbackLaunchIntentForPackage == null) {
                            jf4.n(kng0.l("Unable to determine default activity for ", packageName, ". Does an activity specify the DEFAULT category in its intent filter?"));
                            return null;
                        }
                        Intent[] intentArr = {leanbackLaunchIntentForPackage};
                        intentArr[0].addFlags(268468224);
                        Intent intent = new Intent(applicationActivity, (Class<?>) PhoenixActivity.class);
                        intent.addFlags(268435456);
                        intent.putParcelableArrayListExtra("phoenix_restart_intents", new ArrayList<>(Arrays.asList(intentArr)));
                        intent.putExtra("phoenix_main_process_pid", Process.myPid());
                        applicationActivity.startActivity(intent);
                    } else if (vt3Var instanceof jt3) {
                        String str5 = ((jt3) vt3Var).f17080a;
                        ndk0 ndk0Var = applicationActivity.A1;
                        if (ndk0Var == null || !ndk0Var.c().b()) {
                            Object obj7 = applicationActivity.E().get();
                            obj7.getClass();
                            wdk0.j((wdk0) obj7, new xdk0(rek0.b, str5, null, null, null, null, 124), applicationActivity, null, null, false, false, null, 124);
                        }
                    } else if (vt3Var instanceof ut3) {
                        applicationActivity.I(false);
                    } else if (vt3Var instanceof tt3) {
                        zu3 zu3VarF2 = applicationActivity.F();
                        ndk0 ndk0Var2 = applicationActivity.B1;
                        b6 = (ndk0Var2 == null || !ndk0Var2.a()) ? (byte) 0 : (byte) 1;
                        ol60 ol60Var = zu3VarF2.h0;
                        if (((m1e) zu3VarF2.v.get()).c()) {
                            o1d0 o1d0Var = (o1d0) ((c1d0) zu3VarF2.f.get()).h().f27387a.f41850a.f15729a.getValue();
                            if (o1d0Var instanceof m1d0) {
                                if (!((m1d0) o1d0Var).d) {
                                    ol60Var.f(bt3.f3162a);
                                } else if (b6 == 0) {
                                    ol60Var.f(kt3.f18843a);
                                }
                            }
                        }
                    } else if (vt3Var instanceof lt3) {
                        applicationActivity.A();
                    } else if (vt3Var instanceof ct3) {
                        ndk0 ndk0Var3 = applicationActivity.A1;
                        if (ndk0Var3 != null) {
                            ndk0Var3.dismiss();
                        }
                        applicationActivity.A1 = null;
                        applicationActivity.E1 = null;
                    } else if (vt3Var instanceof kt3) {
                        if (applicationActivity.B1 == null) {
                            Object obj8 = applicationActivity.E().get();
                            obj8.getClass();
                            String string5 = applicationActivity.getString(R.string.technical_difficulites_title_v2);
                            string5.getClass();
                            applicationActivity.B1 = wdk0.j((wdk0) obj8, new xdk0(pek0Var, string5, null, lwfVar, rv00Var, null, 100), applicationActivity, null, new kr3(applicationActivity, b6), false, false, null, 84);
                        }
                    } else if (vt3Var instanceof bt3) {
                        ndk0 ndk0Var4 = applicationActivity.B1;
                        if (ndk0Var4 != null) {
                            ndk0Var4.dismiss();
                        }
                        applicationActivity.B1 = null;
                    } else if (vt3Var instanceof nt3) {
                        nt3 nt3Var = (nt3) vt3Var;
                        long j = nt3Var.f24077a;
                        long j2 = nt3Var.b;
                        if (applicationActivity.C1 == null) {
                            boolean zIs24HourFormat = DateFormat.is24HourFormat(applicationActivity);
                            Object obj9 = applicationActivity.E().get();
                            obj9.getClass();
                            wdk0 wdk0Var2 = (wdk0) obj9;
                            String string6 = applicationActivity.getString(R.string.prophylaxis_notification_title);
                            string6.getClass();
                            rdj rdjVar = rdj.f30294a;
                            efj efjVar = efj.UNIQUE_1;
                            String string7 = applicationActivity.getString(R.string.prophylaxis_notification_message, rdj.g(new znq0(j), efjVar, Boolean.valueOf(zIs24HourFormat), false, 56), rdj.g(new znq0(j2), efjVar, Boolean.valueOf(zIs24HourFormat), false, 56));
                            string7.getClass();
                            applicationActivity.C1 = wdk0.j(wdk0Var2, new xdk0(pek0Var, string6, string7, lwfVar, rv00Var, null, 96), applicationActivity, null, new kr3(applicationActivity, b4), false, false, null, 116);
                        }
                    } else if (vt3Var instanceof dt3) {
                        ndk0 ndk0Var5 = applicationActivity.B1;
                        if (ndk0Var5 != null) {
                            ndk0Var5.dismiss();
                        }
                        applicationActivity.B1 = null;
                        ndk0 ndk0Var6 = applicationActivity.C1;
                        if (ndk0Var6 != null) {
                            ndk0Var6.dismiss();
                        }
                        applicationActivity.C1 = null;
                    } else if (vt3Var instanceof st3) {
                        if (applicationActivity.D1 == null) {
                            Object obj10 = applicationActivity.E().get();
                            obj10.getClass();
                            String string8 = applicationActivity.getString(R.string.attention);
                            string8.getClass();
                            String string9 = applicationActivity.getString(R.string.wrong_time_message_snackbar);
                            string9.getClass();
                            applicationActivity.D1 = wdk0.j((wdk0) obj10, new xdk0(pek0Var, string8, string9, lwfVar, rv00Var, null, 96), applicationActivity, null, new kr3(applicationActivity, b2), false, false, null, 116);
                        }
                    } else if (vt3Var instanceof et3) {
                        ndk0 ndk0Var7 = applicationActivity.D1;
                        if (ndk0Var7 != null) {
                            ndk0Var7.dismiss();
                        }
                        applicationActivity.D1 = null;
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 4:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                int i2 = ApplicationActivity.F1;
                ((ApplicationActivity) obj3).I(zBooleanValue2);
                return Unit.f46060a;
            case 5:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                ApplicationActivity applicationActivity2 = (ApplicationActivity) obj3;
                int i3 = ApplicationActivity.F1;
                if (zBooleanValue3) {
                    FrameLayout frameLayout = applicationActivity2.C().c;
                    frameLayout.getClass();
                    if (frameLayout.findViewWithTag("INTERNET_EMULATION_BUTTON_TAG") == null) {
                        ComposeView composeView = new ComposeView(applicationActivity2, null, 6);
                        composeView.setTag("INTERNET_EMULATION_BUTTON_TAG");
                        pkd.i(composeView, new o33(b2), new ugd(-1175295146, true, new lr3(applicationActivity2, b5)));
                        frameLayout.addView(composeView, new ViewGroup.LayoutParams(-1, -1));
                    }
                } else {
                    applicationActivity2.getClass();
                }
                return Unit.f46060a;
            case 6:
                ljj ljjVar = (ljj) obj;
                ApplicationActivity applicationActivity3 = (ApplicationActivity) obj3;
                int i4 = ApplicationActivity.F1;
                FrameLayout frameLayout2 = applicationActivity3.C().c;
                frameLayout2.getClass();
                if (ljjVar == ljj.f20154a) {
                    View viewFindViewWithTag = frameLayout2.findViewWithTag("DEBUG_CONSOLE_VIEW_TAG");
                    if (viewFindViewWithTag != null) {
                        frameLayout2.removeView(viewFindViewWithTag);
                    }
                } else {
                    ComposeView composeView2 = new ComposeView(applicationActivity3, null, 6);
                    composeView2.setTag("DEBUG_CONSOLE_VIEW_TAG");
                    pkd.i(composeView2, new o33(b5), new ugd(-996936295, true, new lr3(applicationActivity3, b3)));
                    frameLayout2.addView(composeView2, new ViewGroup.LayoutParams(-1, -1));
                }
                return Unit.f46060a;
            case 7:
                ApplicationLoader applicationLoader = ApplicationLoader.v1;
                ((ApplicationLoader) obj3).b((uaq0) obj);
                return Unit.f46060a;
            case 8:
                ApplicationLoader applicationLoader2 = ApplicationLoader.v1;
                ((ApplicationLoader) obj3).b((uaq0) obj);
                return Unit.f46060a;
            case 9:
                ((fy4) obj3).z((Throwable) obj);
                return Unit.f46060a;
            case 10:
                cm80 cm80Var = (cm80) obj;
                g85 g85Var = (g85) obj3;
                g85Var.getClass();
                Object[] objArr = (cm80Var instanceof zl80) && ((zl80) cm80Var).b;
                if (!(cm80Var instanceof wl80) && !(cm80Var instanceof tl80)) {
                    z = false;
                }
                g85Var.H(new b85(cm80Var, z, (byte) 0));
                if (objArr != false) {
                    g85Var.G(o75.f24768a);
                }
                return Unit.f46060a;
            case 11:
                he5 he5Var = (he5) obj;
                BackgroundVideoService backgroundVideoService = (BackgroundVideoService) obj3;
                int i5 = BackgroundVideoService.d;
                backgroundVideoService.getClass();
                n0o0 n0o0Var = backgroundVideoService.c;
                if (!Intrinsics.d(he5Var, ee5.f7653a)) {
                    if (Intrinsics.d(he5Var, fe5.f9388a) || Intrinsics.d(he5Var, ge5.f11135a)) {
                        backgroundVideoService.stopSelf();
                    } else if (he5Var instanceof ce5) {
                        ze5 ze5Var = (ze5) n0o0Var.getValue();
                        ce5 ce5Var = (ce5) he5Var;
                        String str6 = ce5Var.f4195a;
                        long jZ = sj3.Z(backgroundVideoService);
                        String str7 = ce5Var.b;
                        rwn rwnVar = ce5Var.c;
                        ze5Var.getClass();
                        str6.getClass();
                        str7.getClass();
                        rwnVar.getClass();
                        sac.V(jiu0.a(ze5Var), re5.f30318a, null, ze5Var.j.f22085a, new se5(ze5Var, jZ, str6, str7, rwnVar, (yje) null), 10);
                    } else {
                        if (!(he5Var instanceof de5)) {
                            t9f.b();
                            return null;
                        }
                        ze5 ze5Var2 = (ze5) n0o0Var.getValue();
                        de5 de5Var = (de5) he5Var;
                        String str8 = de5Var.f5931a;
                        long jZ2 = sj3.Z(backgroundVideoService);
                        String str9 = de5Var.b;
                        xwn xwnVar = de5Var.c;
                        ze5Var2.getClass();
                        str8.getClass();
                        str9.getClass();
                        xwnVar.getClass();
                        sac.V(jiu0.a(ze5Var2), te5.f33802a, null, ze5Var2.j.f22085a, new se5(ze5Var2, str8, jZ2, str9, xwnVar, (yje) null), 10);
                    }
                }
                return Unit.f46060a;
            case 12:
                jk5 jk5Var = (jk5) obj;
                ii5 ii5Var = (ii5) obj3;
                gfk0 gfk0Var = ii5.O1;
                ii5Var.getClass();
                if (!Intrinsics.d(jk5Var, jk5.f16650a)) {
                    if (Intrinsics.d(jk5Var, jk5.c)) {
                        d04 d04Var = ii5Var.I0().e.h;
                        d04Var.getClass();
                        if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                            Log.d("Paging", "Refresh signal received", null);
                        }
                        d04Var.c.p();
                    } else {
                        if (!Intrinsics.d(jk5Var, jk5.b)) {
                            t9f.b();
                            return null;
                        }
                        ii5Var.H0().e.setRefreshing(false);
                    }
                }
                return Unit.f46060a;
            case 13:
                gfk0 gfk0Var2 = ii5.O1;
                ((ii5) obj3).getClass();
                if (Intrinsics.d((mh5) obj, mh5.f21775a)) {
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 14:
                sk5 sk5Var = (sk5) obj;
                ii5 ii5Var2 = (ii5) obj3;
                gfk0 gfk0Var3 = ii5.O1;
                ii5Var2.getClass();
                if (!Intrinsics.d(sk5Var, qk5.f28868a)) {
                    if (Intrinsics.d(sk5Var, qk5.b)) {
                        if (ii5Var2.H0().b.b.getVisibility() != 0) {
                            ii5Var2.H0().c.setVisibility(8);
                            ii5Var2.H0().b.b.setVisibility(0);
                            x0x.s(ii5Var2.H0().b.b);
                        }
                    } else {
                        if (!(sk5Var instanceof rk5)) {
                            t9f.b();
                            return null;
                        }
                        if (ii5Var2.H0().b.b.getVisibility() == 0) {
                            ii5Var2.H0().b.b.setVisibility(8);
                            x0x.O(ii5Var2.H0().b.b);
                        }
                    }
                }
                return Unit.f46060a;
            case 15:
                boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                ii5 ii5Var3 = (ii5) obj3;
                gfk0 gfk0Var4 = ii5.O1;
                RecyclerView recyclerView = ii5Var3.H0().d;
                if (zBooleanValue4) {
                    Context context = ii5Var3.H0().f13870a.getContext();
                    context.getClass();
                    drawable = context.getDrawable(R.drawable.balance_management_content_top_rounded_corners);
                } else {
                    Context context2 = ii5Var3.H0().f13870a.getContext();
                    context2.getClass();
                    drawable = context2.getDrawable(R.drawable.balance_management_collapsed_toolbar_content_background);
                }
                recyclerView.setBackground(drawable);
                return Unit.f46060a;
            case 16:
                lh5 lh5Var = (lh5) obj;
                ej5 ej5Var = (ej5) obj3;
                bj5 bj5Var = ej5.V1;
                ej5Var.getClass();
                if (lh5Var != null) {
                    if (lh5Var instanceof jh5) {
                        jh5 jh5Var = (jh5) lh5Var;
                        ej5Var.G0().c.setLabel(jh5Var.b);
                        DsAccountInfo dsAccountInfo = ej5Var.G0().c;
                        pn40 pn40Var = pn40.f27267a;
                        dsAccountInfo.setModel(new ke(pn40.c(jh5Var.c, p3u0.c), jh5Var.d));
                        ej5Var.G0().b.g(jh5Var.e, true, true);
                    } else if (lh5Var instanceof kh5) {
                        p7m0 p7m0Var = ej5Var.H0().f0;
                        qk5 qk5Var = qk5.b;
                        p7m0Var.getClass();
                        p7m0Var.o(null, qk5Var);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 17:
                gk5 gk5Var = (gk5) obj;
                ej5 ej5Var2 = (ej5) obj3;
                bj5 bj5Var2 = ej5.V1;
                ej5Var2.G0().h.setEnabledState(gk5Var.f11429a);
                ej5Var2.G0().i.setEnabledState(gk5Var.b);
                return Unit.f46060a;
            case 18:
                sk5 sk5Var2 = (sk5) obj;
                ej5 ej5Var3 = (ej5) obj3;
                bj5 bj5Var3 = ej5.V1;
                ej5Var3.getClass();
                if (!Intrinsics.d(sk5Var2, qk5.f28868a)) {
                    if (Intrinsics.d(sk5Var2, qk5.b)) {
                        ej5Var3.G0().e.setVisibility(8);
                        ej5Var3.G0().c.setVisibility(4);
                        ConstraintLayout constraintLayout = ej5Var3.G0().f.b;
                        if (constraintLayout.getVisibility() != 0) {
                            constraintLayout.setVisibility(0);
                            x0x.s(constraintLayout);
                        }
                    } else {
                        if (!(sk5Var2 instanceof rk5)) {
                            t9f.b();
                            return null;
                        }
                        ConstraintLayout constraintLayout2 = ej5Var3.G0().f.b;
                        if (constraintLayout2.getVisibility() == 0) {
                            constraintLayout2.setVisibility(8);
                            x0x.O(constraintLayout2);
                        }
                        ej5Var3.G0().c.setVisibility(0);
                        ej5Var3.G0().e.setVisibility(0);
                    }
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((duj) obj3).a((Throwable) obj);
                return Unit.f46060a;
            case 20:
                ((d06) obj3).B(((Boolean) obj).booleanValue());
                return Unit.f46060a;
            case 21:
                ((vp6) obj3).N((Throwable) obj);
                return Unit.f46060a;
            case 22:
                ((vp6) obj3).N((Throwable) obj);
                return Unit.f46060a;
            case 23:
                ((vp6) obj3).N((Throwable) obj);
                return Unit.f46060a;
            case 24:
                ((vp6) obj3).N((Throwable) obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th = (Throwable) obj;
                ((wr6) obj3).E.b(th, new yr0(th, (byte) 7));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                dt6 dt6Var = (dt6) obj3;
                dt6Var.U.b((Throwable) obj, new ls6(dt6Var, b3));
                dt6Var.G(nb20.f23220a);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                boolean zBooleanValue5 = ((Boolean) obj).booleanValue();
                yk5 yk5Var = ke7.R1;
                ((FrameLayout) ((ke7) obj3).G0().c.b).setVisibility(zBooleanValue5 ? 0 : 8);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((isz) obj3).A((List) obj);
                return Unit.f46060a;
            default:
                ((Button) obj3).setEnabled(((Boolean) obj).booleanValue());
                return Unit.f46060a;
        }
    }
}
