package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class uv00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ uv00[] f36325a = {new uv00("Verbose", 0), new uv00("Debug", 1), new uv00("Info", 2), new uv00("Warn", 3), new uv00("Error", 4)};

    /* JADX INFO: Fake field, exist only in values array */
    uv00 EF5;

    public static uv00 valueOf(String str) {
        return (uv00) Enum.valueOf(uv00.class, str);
    }

    public static uv00[] values() {
        return (uv00[]) f36325a.clone();
    }
}
