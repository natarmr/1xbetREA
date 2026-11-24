package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class k5x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k5x f17741a;
    public static final k5x b;
    public static final k5x c;
    public static final k5x d;
    public static final k5x e;
    public static final k5x f;
    public static final k5x g;
    public static final /* synthetic */ k5x[] h;

    static {
        k5x k5xVar = new k5x("WAIT_FIRST_CARD", 0);
        f17741a = k5xVar;
        k5x k5xVar2 = new k5x("WAIT_SECOND_CARD", 1);
        b = k5xVar2;
        k5x k5xVar3 = new k5x("WAIT_THIRD_CARD", 2);
        c = k5xVar3;
        k5x k5xVar4 = new k5x("PLAYER_ONE_WINS", 3);
        d = k5xVar4;
        k5x k5xVar5 = new k5x("PLAYER_TWO_WINS", 4);
        e = k5xVar5;
        k5x k5xVar6 = new k5x("DRAW", 5);
        f = k5xVar6;
        k5x k5xVar7 = new k5x(GrsBaseInfo.CountryCodeSource.UNKNOWN, 6);
        g = k5xVar7;
        h = new k5x[]{k5xVar, k5xVar2, k5xVar3, k5xVar4, k5xVar5, k5xVar6, k5xVar7};
    }

    public static k5x valueOf(String str) {
        return (k5x) Enum.valueOf(k5x.class, str);
    }

    public static k5x[] values() {
        return (k5x[]) h.clone();
    }
}
