package a;

import android.javax.sip.message.Response;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.bethistory.coupon_scanner.presentation.CouponScannerScreen;
import org.xplatform.lotto.impl.navigation.LottoScreenFactoryImpl$getLottoScreen$1;
import org.xplatform.uikit.compose.components.picker.model.SimpleDate;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x2i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40169a;

    public /* synthetic */ x2i(byte b) {
        this.f40169a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object[] objArr = 0;
        byte b = 1;
        switch (this.f40169a) {
            case 0:
                ((abi0) obj).getClass();
                return Unit.f46060a;
            case 1:
                ((Boolean) obj).getClass();
                return Unit.f46060a;
            case 2:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                return Unit.f46060a;
            case 3:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                return Unit.f46060a;
            case 4:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                th3.printStackTrace();
                return Unit.f46060a;
            case 5:
                int iIntValue = ((Integer) obj).intValue();
                xuz xuzVar = pb10.c;
                pb10 pb10Var = pb10.g;
                xuzVar.getClass();
                return new mdm(xuz.a(pb10Var, iIntValue), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
            case 6:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                th4.printStackTrace();
                return Unit.f46060a;
            case 7:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                th5.printStackTrace();
                return Unit.f46060a;
            case 8:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                th6.printStackTrace();
                return Unit.f46060a;
            case 9:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                th7.printStackTrace();
                return Unit.f46060a;
            case 10:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                th8.printStackTrace();
                return Unit.f46060a;
            case 11:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                for (int i = 0; i < 40; i++) {
                    hcz.e(hczVar, null, null, new ugd(575064566, true, new cl2(i, b)), 3);
                }
                return Unit.f46060a;
            case 12:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    value.getClass();
                }
                return str + " : " + value;
            case 13:
                ((SimpleDate) obj).getClass();
                return Unit.f46060a;
            case 14:
                c53 c53Var = (c53) obj;
                c53Var.getClass();
                zsf zsfVar = ihn.f14788a;
                return c53Var.a(ay3.e0(kzn.d(ro4.m0(Response.OK, 0, zsfVar, 2), 0.0f, 2), kzn.e(ro4.m0(300, 0, zsfVar, 2), 2)), ay3.F(null, 2));
            case 15:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new ok(cpVar, cpVar, (byte) 28));
                return Unit.f46060a;
            case 16:
                ((lhj) obj).getClass();
                return Unit.f46060a;
            case 17:
                return obj instanceof Object[] ? tx3.N((Object[]) obj, null, "[", "]", new x2i((byte) 17), 25) : String.valueOf(obj);
            case 18:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                okt0 okt0VarA = k0w0Var.a(o0w0.f24450a);
                t44 t44VarC = okt0VarA.c();
                t44VarC.getClass();
                t44VarC.f33301a = new bjk(null, false, false, true);
                ((c8d) okt0VarA.f25422a).f3908a = okt0VarA.c().a();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                c8d c8dVar = (c8d) k0w0Var2.h(new CouponScannerScreen(1)).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                return Unit.f46060a;
            case 20:
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                c8d c8dVar2 = (c8d) k0w0Var3.h(new LottoScreenFactoryImpl$getLottoScreen$1(fd10.b)).f14945a;
                bjk bjkVar2 = cfx0.o;
                c8dVar2.f3908a = new v7d(true, bjkVar2, bjkVar2);
                return Unit.f46060a;
            case 21:
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                c8d c8dVar3 = (c8d) k0w0Var4.h(new CouponScannerScreen(0)).f14945a;
                bjk bjkVar3 = cfx0.o;
                c8dVar3.f3908a = new v7d(true, bjkVar3, bjkVar3);
                return Unit.f46060a;
            case 22:
                ((Throwable) obj).getClass();
                return Unit.f46060a;
            case 23:
                List list = (List) obj;
                list.getClass();
                Object obj2 = list.get(0);
                obj2.getClass();
                int iIntValue2 = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                obj3.getClass();
                return new bwj(iIntValue2, ((Float) obj3).floatValue(), new awj(list, objArr == true ? 1 : 0));
            case 24:
                List list2 = (List) obj;
                Object obj4 = list2.get(0);
                obj4.getClass();
                int iIntValue3 = ((Integer) obj4).intValue();
                Object obj5 = list2.get(1);
                obj5.getClass();
                return new kwj(iIntValue3, ((Float) obj5).floatValue(), new awj(list2, b));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                yai0.j((abi0) obj);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                th9.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                th10.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                th11.printStackTrace();
                return Unit.f46060a;
            default:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                th12.printStackTrace();
                return Unit.f46060a;
        }
    }
}
