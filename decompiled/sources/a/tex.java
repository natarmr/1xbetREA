package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class tex {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tex f33843a;
    public static final tex b;
    public static final /* synthetic */ tex[] c;

    static {
        tex texVar = new tex("INSERT", 0);
        f33843a = texVar;
        tex texVar2 = new tex("DELETE", 1);
        b = texVar2;
        c = new tex[]{texVar, texVar2};
    }

    public static tex valueOf(String str) {
        return (tex) Enum.valueOf(tex.class, str);
    }

    public static tex[] values() {
        return (tex[]) c.clone();
    }
}
