package a;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class gsj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n0o0 f11832a;

    public gsj(gii0 gii0Var) {
        gii0Var.getClass();
        this.f11832a = maz.b(new tpv(gii0Var, (byte) 20));
    }

    public s840 a() {
        return (s840) this.f11832a.getValue();
    }

    public void b(vv00 vv00Var, String str, Exception exc) {
        vv00Var.getClass();
        if (((vv00) this.f11832a.getValue()).ordinal() > vv00Var.ordinal()) {
            return;
        }
        int iOrdinal = vv00Var.ordinal();
        if (iOrdinal == 0) {
            Log.v("VKSdkApi", str, exc);
            return;
        }
        if (iOrdinal == 1) {
            Log.d("VKSdkApi", str, exc);
        } else if (iOrdinal == 2) {
            Log.w("VKSdkApi", str, exc);
        } else {
            if (iOrdinal != 3) {
                return;
            }
            Log.e("VKSdkApi", str, exc);
        }
    }
}
