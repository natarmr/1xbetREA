package a;

import android.javax.sip.message.Response;

/* JADX INFO: loaded from: classes6.dex */
public enum ven {
    Normal(Response.BAD_REQUEST),
    Slow(Response.BUSY_EVERYWHERE);

    public static final pek b = new pek();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f37294a;

    /* JADX WARN: Multi-variable type inference failed */
    ven(int i) {
        this.f37294a = i;
    }
}
