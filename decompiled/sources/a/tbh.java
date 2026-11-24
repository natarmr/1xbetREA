package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class tbh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tbh f33663a;
    public static final tbh b;
    public static final tbh c;
    public static final tbh d;
    public static final /* synthetic */ tbh[] e;

    static {
        tbh tbhVar = new tbh("Idle", 0);
        f33663a = tbhVar;
        tbh tbhVar2 = new tbh("Loading", 1);
        b = tbhVar2;
        tbh tbhVar3 = new tbh("Content", 2);
        c = tbhVar3;
        tbh tbhVar4 = new tbh("Error", 3);
        d = tbhVar4;
        e = new tbh[]{tbhVar, tbhVar2, tbhVar3, tbhVar4};
    }

    public static tbh valueOf(String str) {
        return (tbh) Enum.valueOf(tbh.class, str);
    }

    public static tbh[] values() {
        return (tbh[]) e.clone();
    }
}
