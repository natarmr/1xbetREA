package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class uvj implements xrz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uvj f36351a;
    public static final /* synthetic */ uvj[] b;

    static {
        bnz bnzVar = bnz.f2907a;
        uvj uvjVar = new uvj(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        f36351a = uvjVar;
        b = new uvj[]{uvjVar};
    }

    public static uvj valueOf(String str) {
        return (uvj) Enum.valueOf(uvj.class, str);
    }

    public static uvj[] values() {
        return (uvj[]) b.clone();
    }

    @Override // a.xrz
    public final bnz a() {
        return bnz.j;
    }

    @Override // a.xrz
    public final int getId() {
        return -1;
    }
}
