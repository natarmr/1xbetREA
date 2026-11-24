package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class v4s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v4s f36795a;
    public static final v4s b;
    public static final v4s c;
    public static final /* synthetic */ v4s[] d;

    static {
        v4s v4sVar = new v4s("Picture", 0);
        f36795a = v4sVar;
        v4s v4sVar2 = new v4s("Action", 1);
        b = v4sVar2;
        v4s v4sVar3 = new v4s("TechnicalWorks", 2);
        c = v4sVar3;
        d = new v4s[]{v4sVar, v4sVar2, v4sVar3};
    }

    public static v4s valueOf(String str) {
        return (v4s) Enum.valueOf(v4s.class, str);
    }

    public static v4s[] values() {
        return (v4s[]) d.clone();
    }
}
