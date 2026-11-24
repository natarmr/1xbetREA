package a;

import com.huawei.hms.support.api.entity.common.CommonConstant;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class vqp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pek f37865a;
    public static final vqp b;
    public static final vqp c;
    public static final vqp d;
    public static final vqp e;
    public static final vqp f;
    public static final vqp g;
    public static final vqp h;
    public static final vqp i;
    public static final vqp j;
    public static final /* synthetic */ vqp[] k;

    static {
        vqp vqpVar = new vqp(CommonConstant.RETKEY.USERID, 0);
        b = vqpVar;
        vqp vqpVar2 = new vqp("LAST_NAME", 1);
        c = vqpVar2;
        vqp vqpVar3 = new vqp("FIRST_NAME", 2);
        d = vqpVar3;
        vqp vqpVar4 = new vqp("COUNTRY", 3);
        e = vqpVar4;
        vqp vqpVar5 = new vqp("REGION", 4);
        f = vqpVar5;
        vqp vqpVar6 = new vqp("CITY", 5);
        g = vqpVar6;
        vqp vqpVar7 = new vqp("DATE", 6);
        h = vqpVar7;
        vqp vqpVar8 = new vqp(CommonConstant.RETKEY.EMAIL, 7);
        i = vqpVar8;
        vqp vqpVar9 = new vqp("PHONE", 8);
        j = vqpVar9;
        k = new vqp[]{vqpVar, vqpVar2, vqpVar3, vqpVar4, vqpVar5, vqpVar6, vqpVar7, vqpVar8, vqpVar9};
        f37865a = new pek();
    }

    public static vqp valueOf(String str) {
        return (vqp) Enum.valueOf(vqp.class, str);
    }

    public static vqp[] values() {
        return (vqp[]) k.clone();
    }
}
