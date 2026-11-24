package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class olc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final olc f25445a;
    public static final olc b;
    public static final olc c;
    public static final /* synthetic */ olc[] d;

    static {
        olc olcVar = new olc("NONE", 0);
        f25445a = olcVar;
        olc olcVar2 = new olc("ALL_JSON_OBJECTS", 1);
        b = olcVar2;
        olc olcVar3 = new olc("POLYMORPHIC", 2);
        c = olcVar3;
        d = new olc[]{olcVar, olcVar2, olcVar3};
    }

    public static olc valueOf(String str) {
        return (olc) Enum.valueOf(olc.class, str);
    }

    public static olc[] values() {
        return (olc[]) d.clone();
    }
}
