package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class mqy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mqy f22243a;
    public static final mqy b;
    public static final mqy c;
    public static final /* synthetic */ mqy[] d;

    static {
        mqy mqyVar = new mqy("WARNING", 0);
        f22243a = mqyVar;
        mqy mqyVar2 = new mqy("ERROR", 1);
        b = mqyVar2;
        mqy mqyVar3 = new mqy("HIDDEN", 2);
        c = mqyVar3;
        d = new mqy[]{mqyVar, mqyVar2, mqyVar3};
    }

    public static mqy valueOf(String str) {
        return (mqy) Enum.valueOf(mqy.class, str);
    }

    public static mqy[] values() {
        return (mqy[]) d.clone();
    }
}
