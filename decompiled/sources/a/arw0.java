package a;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes2.dex */
public final class arw0 implements mff0 {
    public static final arw0 c;
    public static final arw0 d;
    public static final arw0 e;
    public static final arw0 f;
    public static final arw0 g;
    public static final arw0 h;
    public static final arw0 i;
    public static final arw0 j;
    public static final arw0 k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1365a;
    public final String b;

    static {
        byte b = 0;
        c = new arw0("TINK", b);
        d = new arw0("CRUNCHY", b);
        e = new arw0("NO_PREFIX", b);
        byte b2 = 1;
        f = new arw0("TINK", b2);
        g = new arw0("NO_PREFIX", b2);
        byte b3 = 2;
        h = new arw0("TINK", b3);
        i = new arw0("CRUNCHY", b3);
        j = new arw0("LEGACY", b3);
        k = new arw0("NO_PREFIX", b3);
    }

    public /* synthetic */ arw0(String str, byte b) {
        this.f1365a = b;
        this.b = str;
    }

    @Override // a.mff0
    public void accept(Object obj, Object obj2) {
        int i2 = tzw0.l;
        izw0 izw0Var = new izw0((TaskCompletionSource) obj2);
        h0x0 h0x0Var = (h0x0) ((i0x0) obj).l();
        Parcel parcelG = h0x0Var.G();
        wmw0.c(parcelG, izw0Var);
        parcelG.writeString(this.b);
        h0x0Var.H(parcelG, 5);
    }

    public String toString() {
        byte b = this.f1365a;
        String str = this.b;
        switch (b) {
            case 0:
            case 1:
            case 2:
                return str;
            default:
                return super.toString();
        }
    }
}
