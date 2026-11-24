package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class jme {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jme f16760a;
    public static final jme b;
    public static final /* synthetic */ jme[] c;

    static {
        jme jmeVar = new jme("BULLET", 0);
        f16760a = jmeVar;
        jme jmeVar2 = new jme("ORDERED", 1);
        b = jmeVar2;
        c = new jme[]{jmeVar, jmeVar2};
    }

    public static jme valueOf(String str) {
        return (jme) Enum.valueOf(jme.class, str);
    }

    public static jme[] values() {
        return (jme[]) c.clone();
    }
}
