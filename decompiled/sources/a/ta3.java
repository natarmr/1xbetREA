package a;

import android.os.Build;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class ta3 {
    public static final HashSet c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33595a;
    public final String b;

    public ta3(String str, String str2) {
        this.f33595a = str;
        this.b = str2;
        c.add(this);
    }

    public boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public boolean b() {
        HashSet hashSet = ra3.f30114a;
        String str = this.b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        return ("eng".equals(str2) || "userdebug".equals(str2)) && hashSet.contains(str.concat(":dev"));
    }
}
