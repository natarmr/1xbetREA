package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a7s implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f388a;
    public final /* synthetic */ xcz b;

    public /* synthetic */ a7s(xcz xczVar, byte b) {
        this.f388a = b;
        this.b = xczVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f388a;
        boolean z = true;
        xcz xczVar = this.b;
        switch (b) {
            case 0:
                List list = xczVar.j().l;
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((ncz) it.next()).f23317a == 1) {
                        }
                    }
                    z = false;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                ncz nczVar = (ncz) CollectionsKt.firstOrNull(xczVar.j().l);
                ncz nczVar2 = (ncz) CollectionsKt.f0(xczVar.j().l);
                return new Pair(Boolean.valueOf((nczVar != null ? nczVar.p : 0) < xczVar.j().m), Boolean.valueOf((nczVar2 != null ? nczVar2.p + nczVar2.q : 0) > xczVar.j().n));
            case 2:
                return Integer.valueOf(xczVar.j().o);
            case 3:
                return Integer.valueOf(((mcz) ((hgk0) xczVar.f).getValue()).k);
            case 4:
                return Integer.valueOf(xczVar.j().o);
            case 5:
                if (!xczVar.d() && !xczVar.c()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                return new Pair(Integer.valueOf(xczVar.h()), Integer.valueOf(xczVar.i()));
            case 7:
                return Integer.valueOf(xczVar.j().o);
            case 8:
                return new Pair(Integer.valueOf(xczVar.h()), Integer.valueOf(xczVar.i()));
            case 9:
                return new Pair(Integer.valueOf(xczVar.h()), Integer.valueOf(xczVar.i()));
            case 10:
                return new Pair(Integer.valueOf(xczVar.h()), Integer.valueOf(xczVar.i()));
            case 11:
                return Integer.valueOf(xczVar.j().o);
            case 12:
                return Integer.valueOf(xczVar.j().o);
            case 13:
                return Integer.valueOf(xczVar.j().o);
            case 14:
                return Integer.valueOf(xczVar.j().n);
            case 15:
                return Integer.valueOf(xczVar.j().n);
            case 16:
                return xczVar.j().l;
            case 17:
                ncz nczVar3 = (ncz) CollectionsKt.f0(xczVar.j().l);
                if (nczVar3 != null) {
                    return Integer.valueOf(nczVar3.f23317a);
                }
                return null;
            case 18:
                ncz nczVar4 = (ncz) CollectionsKt.f0(xczVar.j().l);
                if (nczVar4 != null) {
                    return Integer.valueOf(nczVar4.f23317a);
                }
                return null;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Integer.valueOf(xczVar.j().o);
            case 20:
                return new Pair(Integer.valueOf(xczVar.h()), Integer.valueOf(xczVar.i()));
            case 21:
                if (!xczVar.d() && !xczVar.c()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 22:
                return Boolean.valueOf(xczVar.c());
            case 23:
                return Integer.valueOf(xczVar.j().o);
            case 24:
                return Integer.valueOf(xczVar.j().o);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return Integer.valueOf(xczVar.j().o);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return Integer.valueOf(xczVar.j().o);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return Integer.valueOf(xczVar.j().o);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Boolean.valueOf(xczVar.j.a());
            default:
                return Boolean.valueOf(xczVar.j.a());
        }
    }
}
