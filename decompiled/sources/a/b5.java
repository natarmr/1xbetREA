package a;

import android.content.Context;
import android.text.Editable;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.african_roulette.presentation.views.AfricanRouletteCell;
import org.xplatform.uikit.components.account_info.DsAccountInfo;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b5 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1978a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = 0;
        switch (this.f1978a) {
            case 0:
                lpa0 lpa0Var = (lpa0) obj;
                if (lpa0Var != null && lpa0Var.f20431a == 2) {
                    b = 1;
                }
                return Boolean.valueOf(b ^ 1);
            case 1:
                return Unit.f46060a;
            case 2:
                return Unit.f46060a;
            case 3:
                n1g n1gVar = (n1g) obj;
                n1gVar.getClass();
                n1gVar.e = new rq2();
                n1gVar.f = l1g.OPEN_SCREEN;
                n1gVar.g = k1g.OPEN_REGULAR;
                n1gVar.d = j1g.REAL;
                return Unit.f46060a;
            case 4:
                Context context = (Context) obj;
                context.getClass();
                DsButton dsButton = new DsButton(context, null, 6, 0);
                dsButton.setButtonStyle(ful.i);
                String string = dsButton.getResources().getString(R.string.top_up);
                string.getClass();
                dsButton.l(string);
                dsButton.h();
                return dsButton;
            case 5:
                Context context2 = (Context) obj;
                context2.getClass();
                DsButton dsButton2 = new DsButton(context2, null, 6, 0);
                dsButton2.setButtonStyle(ful.f);
                String string2 = dsButton2.getResources().getString(R.string.withdraw_money);
                string2.getClass();
                dsButton2.l(string2);
                dsButton2.h();
                return dsButton2;
            case 6:
                Context context3 = (Context) obj;
                context3.getClass();
                return new DsAccountInfo(new tje(context3, R.style.Widget_DSAccountInfo_Small_WithButton_Right), null);
            case 7:
                ((cp) obj).getClass();
                return Unit.f46060a;
            case 8:
                ex exVar = (ex) obj;
                exVar.getClass();
                return Integer.valueOf(exVar.f8551a);
            case 9:
                ((ex) obj).getClass();
                return sre0.f32672a.b(ex.class);
            case 10:
                ((Throwable) obj).getClass();
                return Unit.f46060a;
            case 11:
                ((Throwable) obj).getClass();
                return Unit.f46060a;
            case 12:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                kie0 kie0Var = new kie0();
                for (int i = 0; i < 40; i++) {
                    hcz.e(hczVar, null, null, new ugd(1675361490, true, new z30(i, kie0Var, b)), 3);
                }
                return Unit.f46060a;
            case 13:
                int i2 = AfricanRouletteCell.c;
                ((z70) obj).getClass();
                return Unit.f46060a;
            case 14:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 15:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                return Unit.f46060a;
            case 16:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                th3.printStackTrace();
                return Unit.f46060a;
            case 17:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                th4.printStackTrace();
                return Unit.f46060a;
            case 18:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                th5.printStackTrace();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((Editable) obj).getClass();
                return Unit.f46060a;
            case 20:
                Map map = (Map) obj;
                map.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (entry.getValue() instanceof Integer) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    if (StringsKt.t0((String) entry2.getKey()) != null) {
                        linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(wp20.a(linkedHashMap2.size()));
                for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                    linkedHashMap3.put(Long.valueOf(Long.parseLong((String) entry3.getKey())), entry3.getValue());
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(wp20.a(linkedHashMap3.size()));
                for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
                    Object key = entry4.getKey();
                    Object value = entry4.getValue();
                    value.getClass();
                    linkedHashMap4.put(key, new y3d(fbc.d(((Integer) value).intValue())));
                }
                return new LinkedHashMap(linkedHashMap4);
            case 21:
                String str = (String) obj;
                str.getClass();
                return Long.valueOf(str.length() == 0 ? 0L : 300L);
            case 22:
                kg kgVar = (kg) obj;
                kgVar.getClass();
                int iOrdinal = kgVar.ordinal();
                if (iOrdinal == 0) {
                    return ijl.f14880a;
                }
                if (iOrdinal == 1) {
                    return ijl.b;
                }
                if (iOrdinal == 2) {
                    return ijl.c;
                }
                if (iOrdinal == 3) {
                    return ijl.d;
                }
                if (iOrdinal == 4) {
                    return ijl.e;
                }
                t9f.b();
                return null;
            case 23:
                ob0 ob0Var = (ob0) obj;
                ob0Var.getClass();
                return new eg0(ob0Var);
            case 24:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                th6.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ph0 ph0Var = (ph0) obj;
                ph0Var.getClass();
                if (ph0Var instanceof nh0) {
                    return Long.valueOf(((nh0) ph0Var).f23509a);
                }
                if (ph0Var instanceof oh0) {
                    return null;
                }
                t9f.b();
                return null;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ph0 ph0Var2 = (ph0) obj;
                ph0Var2.getClass();
                return sre0.f32672a.b(ph0Var2.getClass());
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                kg kgVar2 = (kg) obj;
                kgVar2.getClass();
                return oja0.b0(kgVar2);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                zvh0 zvh0Var = (zvh0) obj;
                zvh0Var.getClass();
                int iOrdinal2 = zvh0Var.ordinal();
                if (iOrdinal2 == 0) {
                    return axh0.f1625a;
                }
                if (iOrdinal2 == 1) {
                    return zwh0.f45106a;
                }
                if (iOrdinal2 == 2) {
                    return cxh0.f5122a;
                }
                if (iOrdinal2 == 3) {
                    return bxh0.f3376a;
                }
                t9f.b();
                return null;
            default:
                ot0 ot0Var = (ot0) obj;
                ot0Var.getClass();
                return x4d0.g0(ot0Var);
        }
    }

    public /* synthetic */ b5(byte b) {
        this.f1978a = b;
    }
}
