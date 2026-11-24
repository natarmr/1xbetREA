package a;

import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class p1a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p1a f26190a;
    public static final p1a b;
    public static final p1a c;
    public static final /* synthetic */ p1a[] d;

    static {
        p1a p1aVar = new p1a("CAMERA", 0);
        f26190a = p1aVar;
        p1a p1aVar2 = new p1a(CommonConstant.RETKEY.SCOPE, 1);
        b = p1aVar2;
        p1a p1aVar3 = new p1a("THREAD", 2);
        c = p1aVar3;
        d = new p1a[]{p1aVar, p1aVar2, p1aVar3};
    }

    public static p1a valueOf(String str) {
        return (p1a) Enum.valueOf(p1a.class, str);
    }

    public static p1a[] values() {
        return (p1a[]) d.clone();
    }
}
