package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class usy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final usy f36233a;
    public static final usy b;
    public static final usy c;
    public static final /* synthetic */ usy[] d;

    static {
        usy usyVar = new usy("RUNTIME", 0);
        f36233a = usyVar;
        usy usyVar2 = new usy("BINARY", 1);
        b = usyVar2;
        usy usyVar3 = new usy("SOURCE", 2);
        c = usyVar3;
        d = new usy[]{usyVar, usyVar2, usyVar3};
    }

    public static usy valueOf(String str) {
        return (usy) Enum.valueOf(usy.class, str);
    }

    public static usy[] values() {
        return (usy[]) d.clone();
    }
}
