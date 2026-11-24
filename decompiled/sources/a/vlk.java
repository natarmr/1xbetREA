package a;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class vlk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vwb0 f37628a;

    public vlk(vwb0 vwb0Var, byte b) {
        vwb0Var.getClass();
        switch (b) {
            case 1:
                this.f37628a = vwb0Var;
                break;
            default:
                this.f37628a = vwb0Var;
                break;
        }
    }

    public long a(ylk ylkVar, String str) {
        String str2 = ylkVar.f42847a;
        String strConcat = "dictionaries_last_lng_update_".concat(str2);
        vwb0 vwb0Var = this.f37628a;
        if (TextUtils.equals(str, vwb0Var.c(strConcat, str))) {
            return vwb0Var.b().getLong(str2, 0L);
        }
        return 0L;
    }

    public boolean b() {
        return ua80.x(this.f37628a, "changeBalance", true);
    }

    public void c(ylk ylkVar, long j, String str) {
        str.getClass();
        String str2 = ylkVar.f42847a;
        String strConcat = "dictionaries_last_lng_update_".concat(str2);
        vwb0 vwb0Var = this.f37628a;
        vwb0Var.h(strConcat, str);
        if (j == 0) {
            return;
        }
        vwb0Var.g(str2, j);
    }
}
