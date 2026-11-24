package a;

import android.javax.sip.message.Request;
import com.huawei.hms.android.HwBuildEx;

/* JADX INFO: loaded from: classes.dex */
public abstract class lwb0 {
    public static final dkz c = new dkz(50000, "FATAL");
    public static final dkz d = new dkz(40000, "ERROR");
    public static final dkz e = new dkz(20000, Request.INFO);
    public static final dkz f = new dkz(HwBuildEx.VersionCodes.CUR_DEVELOPMENT, "DEBUG");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient int f20758a;
    public final transient String b;

    public lwb0() {
        this.f20758a = HwBuildEx.VersionCodes.CUR_DEVELOPMENT;
        this.b = "DEBUG";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof lwb0) && this.f20758a == ((lwb0) obj).f20758a;
    }

    public final String toString() {
        return this.b;
    }

    public lwb0(int i, String str) {
        this.f20758a = i;
        this.b = str;
    }
}
