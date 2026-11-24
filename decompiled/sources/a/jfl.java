package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class jfl implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16432a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jfl(Object obj, byte b) {
        this.f16432a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f16432a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (riu0) ((v9k) obj).invoke();
            case 1:
                return (qfl) obj;
            case 2:
                return (riu0) ((jfl) obj).invoke();
            case 3:
                return (whn) obj;
            case 4:
                return (riu0) ((jfl) obj).invoke();
            case 5:
                return (min) obj;
            case 6:
                return (riu0) ((jfl) obj).invoke();
            case 7:
                e0o e0oVar = (e0o) obj;
                HashSet hashSet = new HashSet();
                for (g950 g950Var : (Set) e0oVar.e.i.invoke()) {
                    ux50 ux50Var = ux50.f;
                    hashSet.addAll(e0oVar.a(g950Var, ux50Var));
                    hashSet.addAll(e0oVar.f(g950Var, ux50Var));
                }
                return hashSet;
            case 8:
                return (nzo) obj;
            case 9:
                return (riu0) ((jfl) obj).invoke();
            case 10:
                return new q0h0((p0h0) ((p5p) obj).invoke());
            case 11:
                return (s5p) obj;
            case 12:
                return (riu0) ((jfl) obj).invoke();
            case 13:
                return (s6p) obj;
            case 14:
                return (riu0) ((jfl) obj).invoke();
            case 15:
                return (org.xplatform.favorites.impl.presentation.category.e) obj;
            case 16:
                return (riu0) ((jfl) obj).invoke();
            case 17:
                return new y3d(((qnp) ((l7m0) obj).getValue()).f);
            case 18:
                return (i6q) obj;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (riu0) ((jfl) obj).invoke();
            case 20:
                return (List) obj;
            case 21:
                return (ljr) obj;
            case 22:
                return (riu0) ((jfl) obj).invoke();
            case 23:
                return (wws) obj;
            case 24:
                return (riu0) ((jfl) obj).invoke();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return (p0t) obj;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return (riu0) ((jfl) obj).invoke();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return (z2t) obj;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return (riu0) ((jfl) obj).invoke();
            default:
                return (u7t) obj;
        }
    }
}
