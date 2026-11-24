package a;

import android.net.ssl.EchConfigMismatchException;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class aw2 {
    public static /* bridge */ /* synthetic */ EchConfigMismatchException e(SSLException sSLException) {
        return (EchConfigMismatchException) sSLException;
    }

    public static /* bridge */ /* synthetic */ boolean h(SSLException sSLException) {
        return sSLException instanceof EchConfigMismatchException;
    }
}
