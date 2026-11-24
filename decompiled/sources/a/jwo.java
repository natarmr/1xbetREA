package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class jwo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jwo f17261a;
    public static final jwo b;
    public static final /* synthetic */ jwo[] c;

    static {
        jwo jwoVar = new jwo("START", 0);
        f17261a = jwoVar;
        jwo jwoVar2 = new jwo("END", 1);
        b = jwoVar2;
        c = new jwo[]{jwoVar, jwoVar2, new jwo("BOTTOM", 2), new jwo("TOP", 3)};
    }

    public static jwo valueOf(String str) {
        return (jwo) Enum.valueOf(jwo.class, str);
    }

    public static jwo[] values() {
        return (jwo[]) c.clone();
    }
}
