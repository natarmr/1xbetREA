package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rp30 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30867a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ rp30(Function1 function1, byte b) {
        this.f30867a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f30867a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                jtl jtlVar = (jtl) obj;
                jtlVar.getClass();
                function1.invoke(new f62(jtlVar));
                break;
            case 1:
                jtl jtlVar2 = (jtl) obj;
                jtlVar2.getClass();
                function1.invoke(new f62(jtlVar2));
                break;
            case 2:
                kim kimVar = (kim) obj;
                kimVar.getClass();
                if (kimVar instanceof iim) {
                    function1.invoke(new m62(((iim) kimVar).f14835a));
                } else if (kimVar.equals(eim.f7867a)) {
                    function1.invoke(e62.f7260a);
                } else if (kimVar.equals(gim.f11355a)) {
                    function1.invoke(k62.f17746a);
                } else if (kimVar instanceof fim) {
                    int i = ((fim) kimVar).f9595a;
                    if (i == 1) {
                        function1.invoke(h62.f12509a);
                    } else if (i == 2) {
                        function1.invoke(o62.f24712a);
                    }
                }
                break;
            case 3:
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue == 1) {
                    function1.invoke(qu30.f29329a);
                } else if (iIntValue == 2) {
                    function1.invoke(vu30.f38033a);
                }
                break;
            case 4:
                ((Integer) obj).intValue();
                function1.invoke(o740.f24767a);
                break;
            case 5:
                function1.invoke(new xa40(((Long) obj).longValue()));
                break;
            case 6:
                function1.invoke(new wa40(((Long) obj).longValue()));
                break;
            case 7:
                function1.invoke(new wa40(((Long) obj).longValue()));
                break;
            case 8:
                hdb hdbVar = (hdb) obj;
                hdbVar.getClass();
                function1.invoke(new jh40(hdbVar));
                break;
            case 9:
                uss ussVar = (uss) obj;
                ussVar.getClass();
                function1.invoke(new kh40(ussVar));
                break;
            case 10:
                function1.invoke(new nh40(((Long) obj).longValue()));
                break;
            case 11:
                nus nusVar = (nus) obj;
                nusVar.getClass();
                function1.invoke(new th40(nusVar));
                break;
            case 12:
                ims imsVar = (ims) obj;
                imsVar.getClass();
                function1.invoke(new lh40(imsVar));
                break;
            case 13:
                function1.invoke(new dk40(((Long) obj).longValue()));
                break;
            case 14:
                function1.invoke(new ck40(((Long) obj).longValue()));
                break;
            case 15:
                ((jtl) obj).getClass();
                function1.invoke(po40.f27314a);
                break;
            case 16:
                x5q0 x5q0Var = (x5q0) obj;
                x5q0Var.getClass();
                if (x5q0Var instanceof w5q0) {
                    function1.invoke(new so40(((w5q0) x5q0Var).f38596a));
                }
                break;
            case 17:
                ((Integer) obj).getClass();
                function1.invoke(v350.f36719a);
                break;
            case 18:
                ((Integer) obj).getClass();
                function1.invoke(n150.f22732a);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(new bo50(((Integer) obj).intValue()));
                break;
            case 20:
                function1.invoke(new ao50(((Integer) obj).intValue()));
                break;
            case 21:
                function1.invoke(new zn50(((Integer) obj).intValue()));
                break;
            case 22:
                function1.invoke(new yt50(((Integer) obj).intValue()));
                break;
            case 23:
                function1.invoke(new vq50(((Integer) obj).intValue()));
                break;
            case 24:
                function1.invoke(new fs50(((Integer) obj).intValue()));
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(new ls50(((Integer) obj).intValue()));
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                function1.invoke(new ns50(((Boolean) obj).booleanValue()));
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(new lv50(((Integer) obj).intValue()));
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                jtl jtlVar3 = (jtl) obj;
                jtlVar3.getClass();
                if (Intrinsics.d(jtlVar3, sh00.h)) {
                    function1.invoke(kv50.f18940a);
                } else if (Intrinsics.d(jtlVar3, sh00.f)) {
                    function1.invoke(ev50.f8453a);
                } else if (Intrinsics.d(jtlVar3, sh00.g)) {
                    function1.invoke(iv50.f15430a);
                }
                break;
            default:
                function1.invoke(new ln50(((Integer) obj).intValue()));
                break;
        }
        return Unit.f46060a;
    }
}
