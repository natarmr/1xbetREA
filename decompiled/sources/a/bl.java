package a;

import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class bl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bl f2772a;
    public static final bl b;
    public static final bl c;
    public static final /* synthetic */ bl[] d;

    static {
        bl blVar = new bl("PHONE", 0);
        f2772a = blVar;
        bl blVar2 = new bl(CommonConstant.RETKEY.EMAIL, 1);
        b = blVar2;
        bl blVar3 = new bl("TELEGRAM", 2);
        c = blVar3;
        d = new bl[]{blVar, blVar2, blVar3};
    }

    public static bl valueOf(String str) {
        return (bl) Enum.valueOf(bl.class, str);
    }

    public static bl[] values() {
        return (bl[]) d.clone();
    }
}
