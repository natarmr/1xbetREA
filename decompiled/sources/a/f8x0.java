package a;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final class f8x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9130a;
    public final TaskCompletionSource b = new TaskCompletionSource();
    public final byte c;
    public final Bundle d;
    public final /* synthetic */ byte e;

    /* JADX WARN: Multi-variable type inference failed */
    public f8x0(int i, int i2, Bundle bundle, byte b) {
        this.e = b;
        this.f9130a = i;
        this.c = i2;
        this.d = bundle;
    }

    public final boolean a() {
        switch (this.e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String string = toString();
            String strValueOf = String.valueOf(bundle);
            Log.d("MessengerIpcClient", ua80.m(new StringBuilder(string.length() + 16 + strValueOf.length()), "Finishing ", string, " with ", strValueOf));
        }
        this.b.setResult(bundle);
    }

    public final void c(c44 c44Var) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String string = toString();
            String string2 = c44Var.toString();
            Log.d("MessengerIpcClient", ua80.m(new StringBuilder(string.length() + 14 + string2.length()), "Failing ", string, " with ", string2));
        }
        this.b.setException(c44Var);
    }

    public final String toString() {
        byte b = this.c;
        int length = String.valueOf((int) b).length();
        int i = this.f9130a;
        int length2 = String.valueOf(i).length();
        boolean zA = a();
        StringBuilder sb = new StringBuilder(length + 19 + length2 + 8 + String.valueOf(zA).length() + 1);
        rw2.s(b, i, "Request { what=", " id=", sb);
        return f140.n(sb, " oneWay=", zA, "}");
    }
}
