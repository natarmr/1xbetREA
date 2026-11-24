package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class j9j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j9j f16141a;
    public static final j9j b;
    public static final j9j c;
    public static final /* synthetic */ j9j[] d;

    static {
        j9j j9jVar = new j9j("FIRST_PLAYER_MOVE", 0);
        f16141a = j9jVar;
        j9j j9jVar2 = new j9j("SECOND_PLAYER_MOVE", 1);
        b = j9jVar2;
        j9j j9jVar3 = new j9j("PAUSE", 2);
        c = j9jVar3;
        d = new j9j[]{j9jVar, j9jVar2, j9jVar3};
    }

    public static j9j valueOf(String str) {
        return (j9j) Enum.valueOf(j9j.class, str);
    }

    public static j9j[] values() {
        return (j9j[]) d.clone();
    }
}
