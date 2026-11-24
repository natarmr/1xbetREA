package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class z9d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z9d f44011a;
    public static final HashMap b;
    public static final /* synthetic */ z9d[] c;

    /* JADX INFO: Fake field, exist only in values array */
    z9d EF0;

    static {
        z9d z9dVar = new z9d("X86_32", 0);
        z9d z9dVar2 = new z9d("X86_64", 1);
        z9d z9dVar3 = new z9d("ARM_UNKNOWN", 2);
        z9d z9dVar4 = new z9d("PPC", 3);
        z9d z9dVar5 = new z9d("PPC64", 4);
        z9d z9dVar6 = new z9d("ARMV6", 5);
        z9d z9dVar7 = new z9d("ARMV7", 6);
        z9d z9dVar8 = new z9d(GrsBaseInfo.CountryCodeSource.UNKNOWN, 7);
        f44011a = z9dVar8;
        z9d z9dVar9 = new z9d("ARMV7S", 8);
        z9d z9dVar10 = new z9d("ARM64", 9);
        c = new z9d[]{z9dVar, z9dVar2, z9dVar3, z9dVar4, z9dVar5, z9dVar6, z9dVar7, z9dVar8, z9dVar9, z9dVar10};
        HashMap map = new HashMap(4);
        b = map;
        map.put("armeabi-v7a", z9dVar7);
        map.put("armeabi", z9dVar6);
        map.put("arm64-v8a", z9dVar10);
        map.put("x86", z9dVar);
    }

    public static z9d valueOf(String str) {
        return (z9d) Enum.valueOf(z9d.class, str);
    }

    public static z9d[] values() {
        return (z9d[]) c.clone();
    }
}
