package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jmk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jmk f16770a;
    public static final jmk b;
    public static final jmk c;
    public static final /* synthetic */ jmk[] d;

    static {
        jmk jmkVar = new jmk("ITEM_TO_PLACEHOLDER", 0);
        f16770a = jmkVar;
        jmk jmkVar2 = new jmk("PLACEHOLDER_TO_ITEM", 1);
        b = jmkVar2;
        jmk jmkVar3 = new jmk("PLACEHOLDER_POSITION_CHANGE", 2);
        c = jmkVar3;
        d = new jmk[]{jmkVar, jmkVar2, jmkVar3};
    }

    public static jmk valueOf(String str) {
        return (jmk) Enum.valueOf(jmk.class, str);
    }

    public static jmk[] values() {
        return (jmk[]) d.clone();
    }
}
