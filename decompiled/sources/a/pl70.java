package a;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.widget.ProgressBar;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.picker.api.presentation.PickerDialogParams;
import org.xplatform.picker.api.presentation.PickerParams;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pl70 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27170a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pl70(Object obj, byte b) {
        this.f27170a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ClipData primaryClip;
        ClipData.Item itemAt;
        CharSequence text;
        byte b = this.f27170a;
        z = false;
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                rl70 rl70Var = ul70.Q1;
                return new ko60((ul70) obj, (byte) 6);
            case 1:
                int i = om70.Q1;
                return new ko60((om70) obj, (byte) 7);
            case 2:
                return new hu70(0, 0, false, false, true, true, false, false, false, false, false, "00:00", false, true, true, "", true, iun.f15405a, h97.A((wyu) obj, uaq0.f35345a), new suy(wuy.f39812a, false, 0L, 300000L, false), false);
            case 3:
                return new ay70(((rpt) obj).k(), false);
            case 4:
                v480 v480Var = (v480) obj;
                iun iunVar = iun.f15405a;
                String str = v480Var.b;
                return new i580(iunVar, v480Var.e, str.length() != 0 ? str : null);
            case 5:
                fiu0 fiu0Var = ((z880) obj).K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 6:
                aa80 aa80Var = (aa80) obj;
                return aa80Var.s.a(pb10.g, R.string.data_retrieval_error, R.string.try_again_text, new cz60(0, aa80Var, aa80.class, "onReloadScreenContent", "onReloadScreenContent()V", 0, (byte) 7), 9000L);
            case 7:
                kc80 kc80Var = (kc80) obj;
                nh70 nh70Var = kc80.O1;
                cd60 cd60Var = new cd60((Object) kc80Var, (byte) 25);
                cz60 cz60Var = new cz60(0, (fho0) kc80Var.M1.getValue(), fho0.class, "onEndCallClicked", "onEndCallClicked()V", 0, (byte) 8);
                ic80 ic80Var = new ic80(ek5.h);
                gbn gbnVarS = ccq0.S(cd60Var);
                dp dpVar = ic80Var.d;
                dpVar.b(gbnVarS);
                dpVar.b(zjb.B(cd60Var));
                dpVar.b(e3c.y(cd60Var));
                dpVar.b(ofm0.p(cd60Var));
                dpVar.b(pzw.H(cd60Var));
                dpVar.b(rsr0.U(cz60Var, cd60Var));
                dpVar.b(bfb.P(cd60Var));
                return ic80Var;
            case 8:
                xc80 xc80Var = (xc80) obj;
                mi70 mi70Var = xc80.O1;
                cd60 cd60Var2 = new cd60((Object) xc80Var, (byte) 27);
                cz60 cz60Var2 = new cz60(0, (rio0) xc80Var.M1.getValue(), rio0.class, "onEndCallClicked", "onEndCallClicked()V", 0, (byte) 10);
                sio0 sio0Var = new sio0(ek5.h);
                gbn gbnVarN = phu0.N(cd60Var2);
                dp dpVar2 = sio0Var.d;
                dpVar2.b(gbnVarN);
                dpVar2.b(pym0.h(cd60Var2));
                dpVar2.b(e3c.y(cd60Var2));
                dpVar2.b(egm0.i(cd60Var2));
                dpVar2.b(pzw.H(cd60Var2));
                dpVar2.b(rsr0.U(cz60Var2, cd60Var2));
                dpVar2.b(ro4.X(cd60Var2));
                return sio0Var;
            case 9:
                qoj0 qoj0Var = ((d04) obj).l;
                Unit unit = Unit.f46060a;
                qoj0Var.g(unit);
                return unit;
            case 10:
                fiu0 fiu0Var2 = ((gn80) obj).K1;
                if (fiu0Var2 != null) {
                    return fiu0Var2;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 11:
                return Integer.valueOf(((Map) obj).size());
            case 12:
                return ((oy80) obj).f26050a;
            case 13:
                return (bxf0) ((gii0) ((j910) obj).b).b(sre0.f32672a.b(bxf0.class));
            case 14:
                fl70 fl70Var = x790.V1;
                fiu0 fiu0Var3 = ((x790) obj).L1;
                if (fiu0Var3 != null) {
                    return fiu0Var3;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 15:
                jh70 jh70Var = o890.f2;
                ((ProgressBar) ((nq8) obj).b).setVisibility(8);
                return Unit.f46060a;
            case 16:
                p7m0 p7m0Var = ((kk90) obj).B;
                Boolean bool = Boolean.FALSE;
                p7m0Var.getClass();
                p7m0Var.o(null, bool);
                return Unit.f46060a;
            case 17:
                return (sk90) ((gii0) ((j910) obj).b).b(sre0.f32672a.b(sk90.class));
            case 18:
                l1a l1aVar = ((vm90) obj).f37667a;
                mw9 mw9Var = new mw9();
                String str2 = l1aVar.f19240a.b;
                return mw9Var;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                int i2 = dn90.m2;
                fiu0 fiu0Var4 = ((dn90) obj).k2;
                if (fiu0Var4 != null) {
                    return fiu0Var4;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 20:
                Integer f46821a = ((PickerParams) obj).getF46821a();
                return new ko90(f46821a != null ? f46821a.intValue() : 0, lak0.c, "", "");
            case 21:
                fl70 fl70Var2 = zo90.p2;
                Object systemService = ((DsTextField) obj).getContext().getSystemService("clipboard");
                ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                String string = (clipboardManager == null || (primaryClip = clipboardManager.getPrimaryClip()) == null || (itemAt = primaryClip.getItemAt(0)) == null || (text = itemAt.getText()) == null) ? null : text.toString();
                String strG0 = sj3.G0(string != null ? string : "");
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText(null, strG0));
                }
                return Unit.f46060a;
            case 22:
                PickerDialogParams.PickerType pickerType = ((PickerDialogParams) obj).f46801a;
                if (!(pickerType instanceof PickerDialogParams.PickerType.Gender) && !(pickerType instanceof PickerDialogParams.PickerType.ResidentStatus)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 23:
                aoi aoiVar = ((ez90) obj).K1;
                if (aoiVar != null) {
                    return new q0h0(aoiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 24:
                return (xy90) ((gii0) ((nw20) obj).f24215a).b(sre0.f32672a.b(xy90.class));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (oz90) ((gii0) ((dq00) obj).b).b(sre0.f32672a.b(oz90.class));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                xi70 xi70Var = f0a0.P1;
                fiu0 fiu0Var5 = ((f0a0) obj).K1;
                if (fiu0Var5 != null) {
                    return fiu0Var5;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((s2a0) obj).b;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((b3a0) obj).G(l2a0.f19298a);
                return Unit.f46060a;
            default:
                coi coiVar = ((j3a0) obj).L1;
                if (coiVar != null) {
                    return new q0h0(coiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}
