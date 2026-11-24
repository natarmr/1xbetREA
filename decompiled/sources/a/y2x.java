package a;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.work.impl.WorkDatabase_Impl;
import com.android.installreferrer.api.InstallReferrerClient;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.client1.features.appactivity.IntentForwardingActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y2x implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41926a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y2x(Object obj, byte b) {
        this.f41926a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        tld tldVar;
        byte b = this.f41926a;
        boolean z = true;
        Object obj = this.b;
        switch (b) {
            case 0:
                bst bstVar = a3x.a2;
                ((a3x) obj).z0(false, false, false);
                return Unit.f46060a;
            case 1:
                return Float.valueOf(hhm0.v(((vne) obj).getCoroutineContext()));
            case 2:
                ((tax) obj).C = false;
                return Unit.f46060a;
            case 3:
                bst bstVar2 = wbx.P1;
                fiu0 fiu0Var = ((wbx) obj).K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 4:
                return (icx) ((gii0) ((abu) obj).b).b(sre0.f32672a.b(icx.class));
            case 5:
                Object systemService = ((View) ((y3v) obj).b).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 6:
                Object systemService2 = ((View) ((xex) obj).f40764a).getContext().getSystemService("input_method");
                systemService2.getClass();
                return (InputMethodManager) systemService2;
            case 7:
                return InstallReferrerClient.newBuilder(((rix) obj).f30564a).build();
            case 8:
                fiu0 fiu0Var2 = ((IntentForwardingActivity) obj).B;
                if (fiu0Var2 != null) {
                    return fiu0Var2;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 9:
                WorkDatabase_Impl workDatabase_Impl = ((mox) obj).f22151a;
                if (workDatabase_Impl.k() && !workDatabase_Impl.n()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                ((a2y) obj).G(l1y.f19282a);
                return Unit.f46060a;
            case 11:
                ((d4y) obj).G(q3y.f28074a);
                return Unit.f46060a;
            case 12:
                ((c5y) obj).G(r4y.f29860a);
                return Unit.f46060a;
            case 13:
                ((e6y) obj).G(q5y.f28175a);
                return Unit.f46060a;
            case 14:
                return (qzx) ((gii0) ((ieu) obj).b).b(sre0.f32672a.b(qzx.class));
            case 15:
                return new u7y(n7y.f23062a, ((n4u) obj).c(), iun.f15405a, 0L, false);
            case 16:
                f8y f8yVar = (f8y) obj;
                p7m0 p7m0Var = f8yVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    f8yVar.f.getClass();
                } while (!p7m0Var.m(value, u7y.a((u7y) value, n7y.f23062a, null, 0L, false, 22)));
                return Unit.f46060a;
            case 17:
                Object obj2 = ((miy) obj).f21868a;
                kry kryVar = obj2 instanceof kry ? (kry) obj2 : null;
                if (kryVar != null) {
                    return kryVar.findJavaDeclaration();
                }
                return null;
            case 18:
                return Integer.valueOf(((kxq) ((iha) obj).c).getResources().getDisplayMetrics().heightPixels);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                rny rnyVar = (rny) obj;
                String strA = rnyVar.d.a();
                rnyVar.b.getClass();
                tgk.i();
                String str = Build.VERSION.RELEASE;
                int iH = tgk.h();
                Object obj3 = rnyVar.j.get();
                obj3.getClass();
                String str2 = (String) obj3;
                String string = rnyVar.h.c().toString();
                Build.MANUFACTURER.getClass();
                String strC = tgk.c();
                String property = System.getProperty("os.arch");
                if (property == null) {
                    property = "";
                }
                String[] strArr = Build.SUPPORTED_ABIS;
                strArr.getClass();
                String str3 = (String) tx3.B(strArr);
                if (str3 == null) {
                    str3 = "";
                }
                return new m9d(iH, strA, str2, string, strC, property, str3);
            case 20:
                return (xuy) ((gii0) ((lbu) obj).b).b(sre0.f32672a.b(xuy.class));
            case 21:
                sqt sqtVar = pzy.Q1;
                fiu0 fiu0Var3 = ((pzy) obj).K1;
                if (fiu0Var3 != null) {
                    return fiu0Var3;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 22:
                return (syy) ((gii0) ((u8u) obj).c).b(sre0.f32672a.b(syy.class));
            case 23:
                bst bstVar3 = s0z.U1;
                fiu0 fiu0Var4 = ((s0z) obj).M1;
                if (fiu0Var4 != null) {
                    return fiu0Var4;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 24:
                return Integer.valueOf(((l1z) obj).f.size());
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new v3z(((i4z) obj).f14167a.f12456a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new d4z(((k4z) obj).f17693a.f12456a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                i7z i7zVar = ((e7z) obj).i1;
                i7zVar.p.A = true;
                i810 i810Var = i7zVar.q;
                if (i810Var != null) {
                    i810Var.u = true;
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                k7z k7zVar = (k7z) obj;
                if (!((Boolean) ((hgk0) k7zVar.g).getValue()).booleanValue() && (tldVar = k7zVar.c) != null) {
                    tldVar.r();
                }
                return Unit.f46060a;
            default:
                hwk hwkVar = ((dbz) obj).j;
                if (hwkVar != null) {
                    vfc.J(hwkVar);
                }
                return Unit.f46060a;
        }
    }
}
