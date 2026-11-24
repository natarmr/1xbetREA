package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ldv implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19871a;

    public /* synthetic */ ldv(byte b) {
        this.f19871a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f19871a) {
            case 0:
                iun iunVar = iun.f15405a;
                return new fdv(iunVar, iunVar, true, false);
            case 1:
                return new zw3(n280.f22786a, (byte) 0);
            case 2:
                return new zw3(q680.f28189a, (byte) 0);
            case 3:
                return new zw3(v29.f36672a, (byte) 0);
            case 4:
                n0o0 n0o0Var = piv.f27060a;
                ArrayList arrayList = new ArrayList();
                sln0 sln0Var = new sln0();
                urm0 urm0Var = wln0.e;
                vln0 vln0Var = vln0.f37634a;
                tln0 tln0Var = tln0.S1080P_16_9;
                urm0 urm0Var2 = wln0.e;
                sln0Var.a(y2m0.a(vln0Var, tln0Var, urm0Var2));
                arrayList.add(sln0Var);
                sln0 sln0Var2 = new sln0();
                tln0 tln0Var2 = tln0.S720P_16_9;
                sln0Var2.a(y2m0.a(vln0Var, tln0Var2, urm0Var2));
                arrayList.add(sln0Var2);
                tln0 tln0Var3 = tln0.MAXIMUM_16_9;
                arrayList.addAll(piv.a(tln0Var, tln0Var3));
                tln0 tln0Var4 = tln0.UHD;
                arrayList.addAll(piv.a(tln0Var, tln0Var4));
                arrayList.addAll(piv.a(tln0Var, tln0.S1440P_16_9));
                arrayList.addAll(piv.a(tln0Var, tln0Var));
                arrayList.addAll(piv.a(tln0Var2, tln0Var3));
                arrayList.addAll(piv.a(tln0Var2, tln0Var4));
                arrayList.addAll(piv.a(tln0Var2, tln0Var));
                tln0 tln0Var5 = tln0.X_VGA;
                tln0 tln0Var6 = tln0.MAXIMUM_4_3;
                arrayList.addAll(piv.a(tln0Var5, tln0Var6));
                arrayList.addAll(piv.a(tln0.S1080P_4_3, tln0Var6));
                return arrayList;
            case 5:
                ArrayList arrayList2 = new ArrayList();
                sln0 sln0Var3 = new sln0();
                urm0 urm0Var3 = wln0.e;
                vln0 vln0Var2 = vln0.f37634a;
                tln0 tln0Var7 = tln0.S1080P_16_9;
                urm0 urm0Var4 = wln0.e;
                axq.v(sln0Var3, y2m0.a(vln0Var2, tln0Var7, urm0Var4), vln0Var2, tln0Var7, urm0Var4);
                sln0 sln0VarE = axq.e(arrayList2, sln0Var3);
                sln0VarE.a(y2m0.a(vln0Var2, tln0Var7, urm0Var4));
                sln0VarE.a(y2m0.a(vln0Var2, tln0.S1440P_16_9, urm0Var4));
                arrayList2.add(sln0VarE);
                sln0 sln0Var4 = new sln0();
                sln0Var4.a(y2m0.a(vln0Var2, tln0Var7, urm0Var4));
                sln0Var4.a(y2m0.a(vln0Var2, tln0.UHD, urm0Var4));
                arrayList2.add(sln0Var4);
                sln0 sln0Var5 = new sln0();
                sln0Var5.a(y2m0.a(vln0Var2, tln0Var7, urm0Var4));
                axq.v(sln0Var5, y2m0.a(vln0.b, tln0Var7, urm0Var4), vln0Var2, tln0Var7, urm0Var4);
                arrayList2.add(sln0Var5);
                return arrayList2;
            case 6:
                return new zw3(ajv.f995a, (byte) 0);
            case 7:
                return Unit.f46060a;
            case 8:
                return new zw3(okx.f25427a, (byte) 0);
            case 9:
                return new zw3(epv.f8205a, (byte) 0);
            case 10:
                return new zw3(fpv.f9945a, (byte) 0);
            case 11:
                return new zw3(wov.f39516a, (byte) 0);
            case 12:
                return new zw3(xov.f41240a, (byte) 0);
            case 13:
                return new zw3(wov.f39516a, (byte) 0);
            case 14:
                return new zw3(xov.f41240a, (byte) 0);
            case 15:
                return new zw3(wov.f39516a, (byte) 0);
            case 16:
                return new zw3(xov.f41240a, (byte) 0);
            case 17:
                return new zw3(ipv.f15181a, (byte) 0);
            case 18:
                return new zw3(jpv.f16920a, (byte) 0);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new zw3(whp0.f39176a, (byte) 0);
            case 20:
                return new zw3(o9a0.f24870a, (byte) 0);
            case 21:
                return new zw3(yfp0.f42552a, (byte) 0);
            case 22:
                return new zw3(okx.f25427a, (byte) 0);
            case 23:
                rqt rqtVar = izv.d2;
                return Unit.f46060a;
            case 24:
                bst bstVar = s1w.d2;
                return new t3w();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new zw3(juo0.f17166a, (byte) 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new zw3(tuo0.f34561a, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new zw3(a7w.f394a, (byte) 0);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new zw3(ldw.f19873a, (byte) 0);
            default:
                return new zw3(pdw.f26825a, (byte) 0);
        }
    }
}
