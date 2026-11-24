package a;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes3.dex */
public final class eio {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0o0 f7869a;

    public eio(rrc rrcVar, byte b) {
        switch (b) {
            case 1:
                this.f7869a = maz.b(new dio(rrcVar, (byte) 4));
                break;
            default:
                this.f7869a = maz.b(new dio(rrcVar, (byte) 1));
                break;
        }
    }

    public tt20 a() {
        return (tt20) this.f7869a.getValue();
    }

    public Object b(bnn0 bnn0Var) {
        return sj3.w0(bnn0Var, ((nbo) this.f7869a.getValue()).f23251a, new f1e(2, null, (byte) 18), true, false);
    }

    public SharedPreferences c() {
        return (SharedPreferences) this.f7869a.getValue();
    }

    public eio(gii0 gii0Var) {
        gii0Var.getClass();
        this.f7869a = maz.b(new rta0(gii0Var, (byte) 1));
    }

    public eio(Context context) {
        context.getClass();
        this.f7869a = maz.b(new sz2(context, (byte) 21));
    }
}
