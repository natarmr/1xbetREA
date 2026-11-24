package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class q6x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q6x f28221a;
    public static final /* synthetic */ q6x[] b;

    /* JADX INFO: Fake field, exist only in values array */
    q6x EF0;

    static {
        q6x q6xVar = new q6x("FIRST_TEAM", 0);
        q6x q6xVar2 = new q6x("SECOND_TEAM", 1);
        q6x q6xVar3 = new q6x("NONE", 2);
        f28221a = q6xVar3;
        b = new q6x[]{q6xVar, q6xVar2, q6xVar3};
    }

    public static q6x valueOf(String str) {
        return (q6x) Enum.valueOf(q6x.class, str);
    }

    public static q6x[] values() {
        return (q6x[]) b.clone();
    }
}
