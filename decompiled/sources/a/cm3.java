package a;

import android.app.NotificationManager;
import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.authenticator.impl.ui.dialogs.authenticator_filter.models.AuthenticatorFilterDialogSettings;
import org.xplatform.authenticator.impl.util.NotificationPeriodInfo;
import org.xplatform.authenticator.impl.util.NotificationTypeInfo;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.make_bet.impl.presentation.model.StepInputUiModel;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
public final class cm3 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cm3(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = obj;
        this.k = obj2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                cm3 cm3Var = new cm3((dm3) obj2, yjeVar, (byte) 0);
                cm3Var.j = obj;
                return cm3Var;
            case 1:
                return new cm3((esg0) this.j, (String) obj2, yjeVar, (byte) 1);
            case 2:
                cm3 cm3Var2 = new cm3((on3) obj2, yjeVar, (byte) 2);
                cm3Var2.j = obj;
                return cm3Var2;
            case 3:
                return new cm3((ll80) this.j, (f04) obj2, yjeVar, (byte) 3);
            case 4:
                return new cm3((Function1) this.j, (o0x) obj2, yjeVar, (byte) 4);
            case 5:
                return new cm3((nw2) this.j, (y34) obj2, yjeVar, (byte) 5);
            case 6:
                return new cm3((x34) this.j, (y34) obj2, yjeVar, (byte) 6);
            case 7:
                cm3 cm3Var3 = new cm3((kc4) obj2, yjeVar, (byte) 7);
                cm3Var3.j = obj;
                return cm3Var3;
            case 8:
                return new cm3((rv2) this.j, (Function0) obj2, yjeVar, (byte) 8);
            case 9:
                cm3 cm3Var4 = new cm3((fh4) obj2, yjeVar, (byte) 9);
                cm3Var4.j = obj;
                return cm3Var4;
            case 10:
                cm3 cm3Var5 = new cm3((hk4) obj2, yjeVar, (byte) 10);
                cm3Var5.j = obj;
                return cm3Var5;
            case 11:
                cm3 cm3Var6 = new cm3((hl4) obj2, yjeVar, (byte) 11);
                cm3Var6.j = obj;
                return cm3Var6;
            case 12:
                cm3 cm3Var7 = new cm3((qp4) obj2, yjeVar, (byte) 12);
                cm3Var7.j = obj;
                return cm3Var7;
            case 13:
                cm3 cm3Var8 = new cm3((vp4) obj2, yjeVar, (byte) 13);
                cm3Var8.j = obj;
                return cm3Var8;
            case 14:
                return new cm3((fy4) this.j, (String) obj2, yjeVar, (byte) 14);
            case 15:
                return new cm3((fy4) this.j, (ql5) obj2, yjeVar, (byte) 15);
            case 16:
                return new cm3((dk5) this.j, (tjz) obj2, yjeVar, (byte) 16);
            case 17:
                cm3 cm3Var9 = new cm3((il5) obj2, yjeVar, (byte) 17);
                cm3Var9.j = obj;
                return cm3Var9;
            case 18:
                return new cm3((Function1) this.j, (lo5) obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                cm3 cm3Var10 = new cm3((tu5) obj2, yjeVar, (byte) 19);
                cm3Var10.j = obj;
                return cm3Var10;
            case 20:
                cm3 cm3Var11 = new cm3((d650) obj2, yjeVar, (byte) 20);
                cm3Var11.j = obj;
                return cm3Var11;
            case 21:
                return new cm3((iw5) this.j, (pz40) obj2, yjeVar, (byte) 21);
            case 22:
                cm3 cm3Var12 = new cm3((jgb) obj2, yjeVar, (byte) 22);
                cm3Var12.j = obj;
                return cm3Var12;
            case 23:
                cm3 cm3Var13 = new cm3((a56) obj2, yjeVar, (byte) 23);
                cm3Var13.j = obj;
                return cm3Var13;
            case 24:
                return new cm3((oms0) this.j, (Function0) obj2, yjeVar, (byte) 24);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new cm3((po6) this.j, (String) obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new cm3((po6) this.j, (dv7) obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new cm3((po6) this.j, (ojp0) obj2, yjeVar, (byte) 27);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                cm3 cm3Var14 = new cm3((vp6) obj2, yjeVar, (byte) 28);
                cm3Var14.j = obj;
                return cm3Var14;
            default:
                return new cm3((vp6) this.j, (ojp0) obj2, yjeVar, (byte) 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((cm3) create((vm3) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((cm3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((cm3) create((pm3) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((cm3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((cm3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((cm3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((cm3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((cm3) create((um4) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((cm3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((cm3) create((um4) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((cm3) create((um4) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((cm3) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((cm3) create((tt4) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((cm3) create((zp4) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((cm3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((cm3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((cm3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((cm3) create((pi5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((cm3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((cm3) create((pu5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((cm3) create((ql5) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((cm3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((cm3) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((cm3) create((f56) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((cm3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((cm3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((cm3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((cm3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((cm3) create((jg7) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((cm3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:95:0x0396  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        File[] fileArrListFiles;
        Object value;
        Object value2;
        um3 um3VarA;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        String str;
        Object value8;
        StepInputUiModel stepInputUiModel;
        Iterable<j1m0> iterable;
        List listQ0;
        Function0 function0;
        Object value9;
        byte b = this.i;
        iyb iybVar = iyb.f15580a;
        p0w0 p0w0Var = p0w0.f26173a;
        boolean z = true;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                vm3 vm3Var = (vm3) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                dm3 dm3Var = (dm3) obj2;
                qek0 qek0Var = dm3.U1;
                dm3Var.H0().c.w(vm3Var, new xl3(dm3Var, (byte) 7));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                hk3 hk3Var = (hk3) ((esg0) this.j).e;
                String str2 = (String) obj2;
                hk3Var.getClass();
                File file = new File(hk3Var.f13190a.getFilesDir(), ".CWAC-Update");
                file.mkdirs();
                String[] list = file.list();
                if (list != null && !tx3.u(hk3.b(str2), list) && (fileArrListFiles = file.listFiles()) != null) {
                    for (File file2 : fileArrListFiles) {
                        if (!Intrinsics.d(file2.getName(), hk3.c(str2))) {
                            file2.delete();
                        }
                    }
                }
                return Unit.f46060a;
            case 2:
                on3 on3Var = (on3) obj2;
                p7m0 p7m0Var = on3Var.r;
                pm3 pm3Var = (pm3) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (pm3Var != null) {
                    if (pm3Var instanceof mm3) {
                        do {
                            value3 = p7m0Var.getValue();
                        } while (!p7m0Var.m(value3, um3.a((um3) value3, null, null, null, null, false, false, false, false, false, 130303)));
                        p7m0 p7m0Var2 = on3Var.s;
                        tl3 tl3Var = new tl3(on3Var.m.d(on3Var.c.c), ((um3) p7m0Var.getValue()).f);
                        p7m0Var2.getClass();
                        p7m0Var2.o(null, tl3Var);
                    } else if (pm3Var instanceof nm3) {
                        do {
                            value2 = p7m0Var.getValue();
                            um3VarA = um3.a((um3) value2, null, null, null, new Integer(((nm3) pm3Var).f23753a), false, true, false, false, false, 130495);
                            on3Var.b.e("KEY_DOWNLOAD_UPDATE_PROGRESS", um3VarA.g);
                        } while (!p7m0Var.m(value2, um3VarA));
                    } else if (pm3Var instanceof om3) {
                        do {
                            value = p7m0Var.getValue();
                        } while (!p7m0Var.m(value, um3.a((um3) value, null, null, null, null, true, false, false, ((om3) pm3Var).f25485a, false, 128255)));
                    }
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                ll80 ll80Var = (ll80) this.j;
                zi80 zi80Var = ll80Var.b;
                zi80 zi80Var2 = ll80Var.f20235a;
                dtb dtbVar = ((f04) obj2).f8701a;
                zi80Var.getClass();
                amk amkVarW = cy2.w(new uu90(zi80Var, zi80Var2, dtbVar, zi80Var.b, zi80Var2.b), true);
                Iterable iterableO = l1e0.o(0, zi80Var.b);
                if ((iterableO instanceof Collection) && ((Collection) iterableO).isEmpty()) {
                    z = false;
                } else {
                    Iterator it = iterableO.iterator();
                    while (((kkx) it).c) {
                        if (amkVarW.a(((bkx) it).nextInt()) != -1) {
                        }
                    }
                    z = false;
                }
                return new tu90(amkVarW, z);
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                ((Function1) this.j).invoke((o0x) obj2);
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                ((nw2) this.j).J(((y34) obj2).f41933a);
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                Iterator it2 = ((x34) this.j).e.iterator();
                it2.getClass();
                while (it2.hasNext()) {
                    ((yy9) it2.next()).J(((y34) obj2).f41933a);
                }
                return Unit.f46060a;
            case 7:
                um4 um4Var = (um4) this.j;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                int i = kc4.Y;
                p7m0 p7m0Var3 = ((kc4) obj2).i.f25029a;
                do {
                    value4 = p7m0Var3.getValue();
                    value4.getClass();
                } while (!p7m0Var3.m(value4, mb4.a((mb4) value4, false, false, um4Var.f35903a, null, null, null, 0, false, null, null, false, 16375)));
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                if (((hgk0) ((rv2) this.j).c).getValue() == nt2.f24075a) {
                    ((Function0) obj2).invoke();
                }
                return Unit.f46060a;
            case 9:
                um4 um4Var2 = (um4) this.j;
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                int i2 = fh4.c0;
                p7m0 p7m0Var4 = ((fh4) obj2).i.f25029a;
                do {
                    value5 = p7m0Var4.getValue();
                    value5.getClass();
                } while (!p7m0Var4.m(value5, zf4.a((zf4) value5, false, false, um4Var2.f35903a, null, null, null, 0, false, null, null, false, false, 32759)));
                return Unit.f46060a;
            case 10:
                um4 um4Var3 = (um4) this.j;
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                int i3 = hk4.b0;
                p7m0 p7m0Var5 = ((hk4) obj2).i.f25029a;
                do {
                    value6 = p7m0Var5.getValue();
                    value6.getClass();
                } while (!p7m0Var5.m(value6, tj4.a((tj4) value6, false, false, um4Var3.f35903a, null, null, null, 0, false, null, null, false, 65527)));
                return Unit.f46060a;
            case 11:
                uaq0 uaq0Var = (uaq0) this.j;
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var6 = ((hl4) obj2).g;
                do {
                    value7 = p7m0Var6.getValue();
                    dl4 dl4Var = (dl4) value7;
                    uaq0.f35345a.getClass();
                    str = s9m0.l(uaq0Var) ? "/static/img/android/instructions/onboarding_registration/en/1_d.png" : "/static/img/android/instructions/onboarding_registration/en/1_l.png";
                    dl4Var.getClass();
                } while (!p7m0Var6.m(value7, new dl4(str)));
                return Unit.f46060a;
            case 12:
                qp4 qp4Var = (qp4) obj2;
                tt4 tt4Var = (tt4) this.j;
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                if (tt4Var != null) {
                    if (tt4Var instanceof mt4) {
                        int i4 = ((mt4) tt4Var).f22353a;
                        hfk0 hfk0Var = qp4.R1;
                        Object systemService = qp4Var.o0().getSystemService(RemoteMessageConst.NOTIFICATION);
                        systemService.getClass();
                        ((NotificationManager) systemService).cancel(i4);
                    } else if (tt4Var instanceof nt4) {
                        hfk0 hfk0Var2 = qp4.R1;
                        ii iiVar = qp4Var.G0().p;
                        String strH = qp4Var.H(R.string.error);
                        String strH2 = qp4Var.H(R.string.something_went_wrong);
                        String strH3 = qp4Var.H(R.string.ok_new);
                        strH3.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                        androidx.fragment.app.e eVarC = qp4Var.C();
                        eVarC.getClass();
                        iiVar.d(dialogFields, eVarC);
                    } else if (tt4Var instanceof pt4) {
                        String str3 = ((pt4) tt4Var).f27546a;
                        hfk0 hfk0Var3 = qp4.R1;
                        wdk0.k(qp4Var.G0().q, new xdk0(pek0.f26859a, str3, null, null, null, null, 124), qp4Var, null, null, false, null, 1020);
                    } else if (tt4Var instanceof st4) {
                        hfk0 hfk0Var4 = qp4.R1;
                        wdk0 wdk0Var = qp4Var.G0().q;
                        qek0 qek0Var2 = qek0.f28589a;
                        String strH4 = qp4Var.H(R.string.authenticator_disabled);
                        strH4.getClass();
                        wdk0.k(wdk0Var, new xdk0(qek0Var2, strH4, null, null, null, null, 124), qp4Var, null, null, false, null, 1020);
                    } else if (tt4Var instanceof qt4) {
                        qt4 qt4Var = (qt4) tt4Var;
                        NotificationPeriodInfo notificationPeriodInfo = qt4Var.b;
                        NotificationTypeInfo notificationTypeInfo = qt4Var.f29282a;
                        hfk0 hfk0Var5 = qp4.R1;
                        AuthenticatorFilterDialogSettings authenticatorFilterDialogSettings = new AuthenticatorFilterDialogSettings(notificationTypeInfo, notificationPeriodInfo, "APPLY_FILTERS_REQUEST_KEY");
                        jdk0 jdk0Var = vp4.n2;
                        androidx.fragment.app.e eVarC2 = qp4Var.C();
                        eVarC2.getClass();
                        jdk0Var.getClass();
                        String name = vp4.class.getName();
                        if (eVarC2.J(name) == null) {
                            vp4 vp4Var = new vp4();
                            vp4Var.m2.J(vp4Var, vp4.o2[0], authenticatorFilterDialogSettings);
                            vp4Var.H0(eVarC2, name);
                        }
                    } else if (tt4Var instanceof rt4) {
                        hfk0 hfk0Var6 = qp4.R1;
                        ii iiVar2 = qp4Var.G0().p;
                        String strH5 = qp4Var.H(R.string.caution);
                        String strH6 = qp4Var.H(R.string.authenticator_enable_push_dialog_title);
                        String strH7 = qp4Var.H(R.string.open_settings);
                        strH7.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH5, (CharSequence) strH6, (CharSequence) strH7, qp4Var.H(R.string.cancel), (String) null, "REQUEST_SETTINGS_PUSH_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC3 = qp4Var.C();
                        eVarC3.getClass();
                        iiVar2.d(dialogFields2, eVarC3);
                    } else if (tt4Var instanceof ot4) {
                        hfk0 hfk0Var7 = qp4.R1;
                        ii iiVar3 = qp4Var.G0().p;
                        String strH8 = qp4Var.H(R.string.caution);
                        String strH9 = qp4Var.H(R.string.authenticator_disable_query);
                        String strH10 = qp4Var.H(R.string.disable);
                        strH10.getClass();
                        DialogFields dialogFields3 = new DialogFields((CharSequence) strH8, (CharSequence) strH9, (CharSequence) strH10, qp4Var.H(R.string.cancel), (String) null, "REQUEST_SHOW_DISABLE_AUTH_CONF_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC4 = qp4Var.C();
                        eVarC4.getClass();
                        iiVar3.d(dialogFields3, eVarC4);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 13:
                zp4 zp4Var = (zp4) this.j;
                wne wneVar14 = wne.f39444a;
                z1x.P(obj);
                vp4 vp4Var2 = (vp4) obj2;
                khf0 khf0Var = vp4Var2.m2;
                jdk0 jdk0Var2 = vp4.n2;
                if (zp4Var != null) {
                    if (zp4Var instanceof xp4) {
                        xp4 xp4Var = (xp4) zp4Var;
                        NotificationPeriodInfo notificationPeriodInfo2 = xp4Var.b;
                        c860 c860Var = xp4Var.f41251a;
                        String strH11 = vp4Var2.H(c860Var.a());
                        strH11.getClass();
                        NotificationTypeInfo notificationTypeInfo2 = new NotificationTypeInfo(c860Var, strH11);
                        q760 q760Var = notificationPeriodInfo2.f46354a;
                        if (q760Var != q760.CUSTOM) {
                            String strH12 = vp4Var2.H(q760Var.a());
                            strH12.getClass();
                            vcc.f0(i120.V(new Pair("RESULT_TYPE_FILTER", notificationTypeInfo2), new Pair("RESULT_PERIOD_FILTER", new NotificationPeriodInfo(q760Var, strH12, notificationPeriodInfo2.c, notificationPeriodInfo2.d))), vp4Var2, ((AuthenticatorFilterDialogSettings) khf0Var.n(vp4Var2, vp4.o2[0])).c);
                        } else {
                            vcc.f0(i120.V(new Pair("RESULT_TYPE_FILTER", notificationTypeInfo2), new Pair("RESULT_PERIOD_FILTER", notificationPeriodInfo2)), vp4Var2, ((AuthenticatorFilterDialogSettings) khf0Var.n(vp4Var2, vp4.o2[0])).c);
                        }
                        vp4Var2.x0();
                    } else if (zp4Var instanceof yp4) {
                        xi70 xi70Var = de90.k2;
                        androidx.fragment.app.e eVarC5 = vp4Var2.C();
                        eVarC5.getClass();
                        yp4 yp4Var = (yp4) zp4Var;
                        long j = yp4Var.f43013a;
                        long j2 = yp4Var.b;
                        xi70Var.getClass();
                        xi70.f(eVarC5, j, j2, 365, "REQUEST_DATA_HISTORY_DIALOG_KEY");
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 14:
                wne wneVar15 = wne.f39444a;
                z1x.P(obj);
                fy4 fy4Var = (fy4) this.j;
                fy4Var.J(new ys3(fy4Var, (String) obj2, (byte) 25));
                return Unit.f46060a;
            case 15:
                wne wneVar16 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var7 = ((fy4) this.j).c0;
                ql5 ql5Var = (ql5) obj2;
                do {
                    value8 = p7m0Var7.getValue();
                    stepInputUiModel = (StepInputUiModel) value8;
                } while (!p7m0Var7.m(value8, stepInputUiModel.o ? StepInputUiModel.a(stepInputUiModel, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, false, false, false, false, false, false, 114687) : StepInputUiModel.a(stepInputUiModel, -1.0d, 0.0d, 0.0d, 0.0d, 0.0d, ql5Var.f, false, false, null, false, false, false, false, true, false, 96222)));
                return Unit.f46060a;
            case 16:
                wne wneVar17 = wne.f39444a;
                z1x.P(obj);
                dk5 dk5Var = (dk5) this.j;
                db9 db9Var = dk5Var.p;
                tjz tjzVar = (tjz) obj2;
                y9x y9xVar = tjzVar instanceof ojz ? y9x.INFO_APPLICATION_FOR_PAYOUT : y9x.INFO_DEFAULT;
                ((knf0) db9Var.f5792a.b).getClass();
                FragmentScreen fragmentScreenW = qgd.W(dk5Var.i, y9xVar.a(), tjzVar.f34072a);
                i1w0 i1w0Var = dk5Var.b;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                if (fragmentScreenW instanceof DialogScreen) {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenW)));
                } else {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenW)));
                }
                ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case 17:
                il5 il5Var = (il5) obj2;
                pi5 pi5Var = (pi5) this.j;
                wne wneVar18 = wne.f39444a;
                z1x.P(obj);
                if (pi5Var instanceof oi5) {
                    wdk0 wdk0Var2 = il5Var.N1;
                    if (wdk0Var2 == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var2, new xdk0(rek0.b, ((oi5) pi5Var).f25295a, null, null, null, null, 124), il5Var, null, null, false, null, 1020);
                    ((dk5) il5Var.O1.getValue()).G();
                }
                return Unit.f46060a;
            case 18:
                wne wneVar19 = wne.f39444a;
                z1x.P(obj);
                ((Function1) this.j).invoke(new Integer(((lo5) obj2).c.size()));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                tu5 tu5Var = (tu5) obj2;
                pu5 pu5Var = (pu5) this.j;
                wne wneVar20 = wne.f39444a;
                z1x.P(obj);
                nu5 nu5Var = nu5.f24133a;
                if (!Intrinsics.d(pu5Var, nu5Var)) {
                    if (!Intrinsics.d(pu5Var, ou5.f25860a)) {
                        t9f.b();
                        return null;
                    }
                    yk5 yk5Var = tu5.V1;
                    if (!tu5Var.m) {
                        ii iiVar4 = tu5Var.M1;
                        if (iiVar4 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH13 = tu5Var.H(R.string.caution);
                        String strH14 = tu5Var.H(R.string.permission_camera_data_for_coupon);
                        String strH15 = tu5Var.H(R.string.go_to_settings_text);
                        strH15.getClass();
                        DialogFields dialogFields4 = new DialogFields((CharSequence) strH13, (CharSequence) strH14, (CharSequence) strH15, tu5Var.H(R.string.cancel), (String) null, "REQUEST_CAMERA_PERMISSION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                        androidx.fragment.app.e eVarC6 = tu5Var.C();
                        eVarC6.getClass();
                        iiVar4.d(dialogFields4, eVarC6);
                    }
                    p7m0 p7m0Var8 = tu5Var.H0().e;
                    p7m0Var8.getClass();
                    p7m0Var8.o(null, nu5Var);
                }
                return Unit.f46060a;
            case 20:
                ql5 ql5Var2 = (ql5) this.j;
                wne wneVar21 = wne.f39444a;
                z1x.P(obj);
                d650 d650Var = (d650) obj2;
                p7m0 p7m0Var9 = d650Var.v;
                lv5 lv5Var = new lv5(ql5Var2, d650Var.x(ql5Var2));
                p7m0Var9.getClass();
                p7m0Var9.o(null, lv5Var);
                return Unit.f46060a;
            case 21:
                wne wneVar22 = wne.f39444a;
                z1x.P(obj);
                pz40 pz40Var = (pz40) obj2;
                iw5 iw5Var = (iw5) this.j;
                iiy[] iiyVarArr = iw5.j2;
                fw5 fw5Var = iw5Var.Z1;
                Object objI = fw5Var.b;
                if (objI == null) {
                    objI = fw5Var.i();
                    fw5Var.b = objI;
                }
                pz40Var.setValue((ComposeView) objI);
                return Unit.f46060a;
            case 22:
                String str4 = (String) this.j;
                wne wneVar23 = wne.f39444a;
                z1x.P(obj);
                jgb jgbVar = (jgb) obj2;
                if (str4.length() == 0) {
                    jgbVar.p = new zz2(jgbVar, iun.f15405a);
                    jgbVar.C();
                } else {
                    v26 v26Var = (v26) jgbVar.j.getValue();
                    if (v26Var == null) {
                        iterable = iun.f15405a;
                    } else if (v26Var instanceof t26) {
                        iterable = ((t26) v26Var).f33201a;
                    } else if (v26Var instanceof u26) {
                        iterable = ((u26) v26Var).f34931a;
                    } else {
                        iterable = iun.f15405a;
                    }
                    ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                    for (j1m0 j1m0Var : iterable) {
                        if (j1m0Var != null) {
                            if (j1m0Var instanceof i1m0) {
                                listQ0 = jgb.A(((i1m0) j1m0Var).f14006a.b);
                            } else if (j1m0Var instanceof g1m0) {
                                g1m0 g1m0Var = (g1m0) j1m0Var;
                                listQ0 = CollectionsKt.q0(jgb.A(g1m0Var.f10520a.b), jgb.A(g1m0Var.b.b));
                            } else if (j1m0Var instanceof h1m0) {
                                listQ0 = iun.f15405a;
                            }
                            arrayList.add(listQ0);
                        }
                        t9f.b();
                        return null;
                    }
                    ArrayList arrayListR = r3d.r(arrayList);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : arrayListR) {
                        lk50 lk50Var = (lk50) obj3;
                        if (jgb.B(lk50Var.b, str4) || jgb.B(lk50Var.c, str4)) {
                            arrayList2.add(obj3);
                        }
                    }
                    jgbVar.p = new zz2(jgbVar, arrayList2);
                    jgbVar.C();
                }
                return Unit.f46060a;
            case 23:
                a56 a56Var = (a56) obj2;
                Context context = a56Var.f254a;
                f56 f56Var = (f56) this.j;
                wne wneVar24 = wne.f39444a;
                z1x.P(obj);
                long time = Calendar.getInstance(Locale.getDefault()).getTime().getTime() / 1000;
                if (f56Var instanceof b56) {
                    List list2 = ((b56) f56Var).f1986a;
                    list2.getClass();
                    a56Var.d = list2;
                    a56Var.f(context);
                    Boolean bool = Boolean.FALSE;
                    a56Var.i(i120.V(new Pair("show_prophylaxis", bool), new Pair("top_live_error_data", bool), new Pair("error_need_authorization", bool), new Pair("upload_data_time", new Long(time)), new Pair("renew_animation_needed", bool)));
                } else if (f56Var instanceof c56) {
                    iun iunVar = iun.f15405a;
                    iunVar.getClass();
                    a56Var.d = iunVar;
                    a56Var.f(context);
                    Boolean bool2 = Boolean.FALSE;
                    a56Var.i(i120.V(new Pair("show_prophylaxis", bool2), new Pair("top_live_error_data", Boolean.TRUE), new Pair("error_need_authorization", bool2), new Pair("upload_data_time", new Long(time)), new Pair("renew_animation_needed", bool2)));
                } else if (Intrinsics.d(f56Var, d56.f5489a)) {
                    iun iunVar2 = iun.f15405a;
                    iunVar2.getClass();
                    a56Var.d = iunVar2;
                    a56Var.f(context);
                    Boolean bool3 = Boolean.FALSE;
                    a56Var.i(i120.V(new Pair("show_prophylaxis", bool3), new Pair("error_need_authorization", Boolean.TRUE), new Pair("top_live_error_data", bool3), new Pair("upload_data_time", new Long(time)), new Pair("renew_animation_needed", bool3)));
                } else {
                    if (!(f56Var instanceof e56)) {
                        t9f.b();
                        return null;
                    }
                    iun iunVar3 = iun.f15405a;
                    iunVar3.getClass();
                    a56Var.d = iunVar3;
                    a56Var.f(context);
                    Boolean bool4 = Boolean.FALSE;
                    e56 e56Var = (e56) f56Var;
                    a56Var.i(i120.V(new Pair("error_need_authorization", bool4), new Pair("top_live_error_data", bool4), new Pair("upload_data_time", new Long(time)), new Pair("renew_animation_needed", bool4), new Pair("show_prophylaxis", Boolean.TRUE), new Pair("key_start_date_prophylaxis", new Long(e56Var.f7216a)), new Pair("key_end_date_prophylaxis", new Long(e56Var.b))));
                }
                return Unit.f46060a;
            case 24:
                wne wneVar25 = wne.f39444a;
                z1x.P(obj);
                if (!((Boolean) ((oms0) this.j).f25519a.y0()).booleanValue() && (function0 = (Function0) obj2) != null) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wne wneVar26 = wne.f39444a;
                z1x.P(obj);
                ((po6) this.j).V.f(new cv7((String) obj2));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wne wneVar27 = wne.f39444a;
                z1x.P(obj);
                ((po6) this.j).V.f((dv7) obj2);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                wne wneVar28 = wne.f39444a;
                z1x.P(obj);
                po6 po6Var = (po6) this.j;
                f8u f8uVar = po6Var.e;
                ctf0 ctf0Var = po6Var.B;
                ol60 ol60Var = po6Var.V;
                lhf0 lhf0Var = po6Var.d;
                ojp0 ojp0Var = (ojp0) obj2;
                int i5 = ojp0Var.f25370a;
                int i6 = ojp0Var.b;
                m6m0 m6m0Var = bop0.b;
                int i7 = ojp0Var.c;
                m6m0Var.getClass();
                jyb jybVarT = lhf0Var.t(i5, i6, m6m0.j(i7), true);
                if (jybVarT.equals(ujn.f)) {
                    ArrayList arrayListA = f8uVar.a(bop0.FIRST);
                    ArrayList arrayListA2 = f8uVar.a(bop0.SECOND);
                    if (arrayListA.isEmpty() || arrayListA2.isEmpty()) {
                        i1w0 i1w0Var2 = po6Var.E;
                        CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var2);
                        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, p0w0Var), i1w0Var2, copyOnWriteArrayListQ2, 0);
                        while (true) {
                            paw pawVar2 = (paw) listIteratorP;
                            if (pawVar2.hasNext()) {
                                i1w0Var2.a((oe50) pawVar2.next());
                            }
                        }
                    } else {
                        po6Var.A(true);
                    }
                } else if (jybVarT instanceof gyb) {
                    ol60Var.f(new vu7(ctf0Var.f(R.string.team_replace_error, new Object[0])));
                } else if (jybVarT instanceof fyb) {
                    ol60Var.f(new vu7(ctf0Var.f(R.string.error_groups_is_full, new Object[0])));
                } else {
                    if (!jybVarT.equals(iybVar)) {
                        t9f.b();
                        return null;
                    }
                    ol60Var.f(new vu7(ctf0Var.f(R.string.team_replace_error, new Object[0])));
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                jg7 jg7Var = (jg7) this.j;
                wne wneVar29 = wne.f39444a;
                z1x.P(obj);
                int i8 = vp6.W;
                p7m0 p7m0Var10 = ((vp6) obj2).i.f25029a;
                do {
                    value9 = p7m0Var10.getValue();
                    value9.getClass();
                } while (!p7m0Var10.m(value9, jp6.a((jp6) value9, false, false, false, false, null, null, null, null, null, false, null, false, false, false, jg7Var, false, null, false, 2080767)));
                return Unit.f46060a;
            default:
                wne wneVar30 = wne.f39444a;
                z1x.P(obj);
                vp6 vp6Var = (vp6) this.j;
                ctf0 ctf0Var2 = vp6Var.M;
                f8u f8uVar2 = vp6Var.r;
                lhf0 lhf0Var2 = vp6Var.q;
                ojp0 ojp0Var2 = (ojp0) obj2;
                int i9 = ojp0Var2.f25370a;
                int i10 = ojp0Var2.b;
                m6m0 m6m0Var2 = bop0.b;
                int i11 = ojp0Var2.c;
                m6m0Var2.getClass();
                jyb jybVarT2 = lhf0Var2.t(i9, i10, m6m0.j(i11), true);
                if (jybVarT2.equals(ujn.f)) {
                    ArrayList arrayListA3 = f8uVar2.a(bop0.FIRST);
                    ArrayList arrayListA4 = f8uVar2.a(bop0.SECOND);
                    if (arrayListA3.isEmpty() || arrayListA4.isEmpty()) {
                        i1w0 i1w0Var3 = vp6Var.O;
                        CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var3);
                        ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ3, new c8d(y7d.f42146a, p0w0Var), i1w0Var3, copyOnWriteArrayListQ3, 0);
                        while (true) {
                            paw pawVar3 = (paw) listIteratorP2;
                            if (pawVar3.hasNext()) {
                                i1w0Var3.a((oe50) pawVar3.next());
                            }
                        }
                    } else {
                        vp6Var.R(true);
                    }
                } else if ((jybVarT2 instanceof gyb) || jybVarT2.equals(iybVar)) {
                    vp6Var.G(new xo6(ctf0Var2.b.a(R.string.team_replace_error, Arrays.copyOf(new Object[0], 0))));
                } else {
                    if (!(jybVarT2 instanceof fyb)) {
                        t9f.b();
                        return null;
                    }
                    vp6Var.G(new xo6(ctf0Var2.b.a(R.string.error_groups_is_full, Arrays.copyOf(new Object[0], 0))));
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cm3(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
    }
}
