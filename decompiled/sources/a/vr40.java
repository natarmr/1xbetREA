package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class vr40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vr40 f37881a;
    public static final vr40 b;
    public static final vr40 c;
    public static final /* synthetic */ vr40[] d;

    static {
        vr40 vr40Var = new vr40("FIRST_HERO", 0);
        f37881a = vr40Var;
        vr40 vr40Var2 = new vr40("SECOND_HERO", 1);
        b = vr40Var2;
        vr40 vr40Var3 = new vr40(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
        c = vr40Var3;
        d = new vr40[]{vr40Var, vr40Var2, vr40Var3};
    }

    public static vr40 valueOf(String str) {
        return (vr40) Enum.valueOf(vr40.class, str);
    }

    public static vr40[] values() {
        return (vr40[]) d.clone();
    }
}
