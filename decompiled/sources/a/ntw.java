package a;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class ntw extends kbj {
    public final byte b;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public ntw(IOException iOException, int i, int i2) {
        if (i == 2000 && i2 == 1) {
            i = 2001;
        }
        super(iOException, i);
        this.b = i2;
    }

    public static ntw a(IOException iOException, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else {
            i2 = (message == null || !j47.H0(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i2 == 2007 ? new mtw("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, CommonConstant.RETCODE.SIGN_IN_NETWORK_UNDER_CONTROLED) : new ntw(iOException, i2, i);
    }

    public ntw() {
        super(CommonConstant.RETCODE.INVALID_AT_ERROR);
        this.b = (byte) 1;
    }

    public ntw(String str, IOException iOException, int i) {
        super(str, iOException, i == 2000 ? 2001 : i);
        this.b = (byte) 1;
    }
}
