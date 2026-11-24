package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class idl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final idl f14590a;
    public static final idl b;
    public static final idl c;
    public static final /* synthetic */ idl[] d;

    static {
        idl idlVar = new idl("Yes", 0);
        f14590a = idlVar;
        idl idlVar2 = new idl("No", 1);
        b = idlVar2;
        idl idlVar3 = new idl("NotInitialized", 2);
        c = idlVar3;
        d = new idl[]{idlVar, idlVar2, idlVar3};
    }

    public static idl valueOf(String str) {
        return (idl) Enum.valueOf(idl.class, str);
    }

    public static idl[] values() {
        return (idl[]) d.clone();
    }
}
