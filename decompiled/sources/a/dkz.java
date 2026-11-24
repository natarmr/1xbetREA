package a;

import android.javax.sip.message.Request;
import com.huawei.hms.android.HwBuildEx;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class dkz extends lwb0 implements Serializable {
    public static final dkz g = new dkz(Integer.MAX_VALUE, "OFF");
    public static final dkz h = new dkz(50000, "FATAL");
    public static final dkz i = new dkz(40000, "ERROR");
    public static final dkz j = new dkz(30000, "WARN");
    public static final dkz k = new dkz(20000, Request.INFO);
    public static final dkz l = new dkz(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, "DEBUG");
    public static final dkz m = new dkz(5000, "TRACE");
    public static final dkz n = new dkz(Integer.MIN_VALUE, "ALL");
}
