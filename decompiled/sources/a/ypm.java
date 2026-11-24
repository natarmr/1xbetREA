package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ypm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ypm f43038a;
    public static final ypm b;
    public static final ypm c;
    public static final /* synthetic */ ypm[] d;

    static {
        ypm ypmVar = new ypm("SHOW", 0);
        f43038a = ypmVar;
        ypm ypmVar2 = new ypm("SHOW_WITH_KEYBOARD", 1);
        b = ypmVar2;
        ypm ypmVar3 = new ypm("CLOSE", 2);
        c = ypmVar3;
        d = new ypm[]{ypmVar, ypmVar2, ypmVar3};
    }

    public static ypm valueOf(String str) {
        return (ypm) Enum.valueOf(ypm.class, str);
    }

    public static ypm[] values() {
        return (ypm[]) d.clone();
    }
}
