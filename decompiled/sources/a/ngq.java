package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ngq extends pd90 {
    public static final f03 d = f03.d();
    public final cs3 c;

    public ngq(cs3 cs3Var) {
        this.c = cs3Var;
    }

    @Override // a.pd90
    public final boolean a() {
        f03 f03Var = d;
        cs3 cs3Var = this.c;
        if (cs3Var == null) {
            f03Var.f("ApplicationInfo is null");
        } else if (!cs3Var.w()) {
            f03Var.f("GoogleAppId is null");
        } else if (!cs3Var.u()) {
            f03Var.f("AppInstanceId is null");
        } else if (!cs3Var.v()) {
            f03Var.f("ApplicationProcessState is null");
        } else {
            if (!cs3Var.t()) {
                return true;
            }
            if (!cs3Var.r().s()) {
                f03Var.f("AndroidAppInfo.packageName is null");
            } else {
                if (cs3Var.r().t()) {
                    return true;
                }
                f03Var.f("AndroidAppInfo.sdkVersion is null");
            }
        }
        f03Var.f("ApplicationInfo is invalid");
        return false;
    }
}
