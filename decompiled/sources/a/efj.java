package a;

/* JADX INFO: loaded from: classes6.dex */
public enum efj {
    UNIVERSAL("dd.MM.yyyy (HH:mm)", "dd.MM.yyyy (hh:mm a)"),
    UNIQUE_1("dd.MM (HH:mm)", "dd.MM (hh:mm a)"),
    UNIQUE_2("dd.MM (HH:mm:ss)", "dd.MM (hh:mm:ss a)");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7721a;
    public final String b;

    efj(String str, String str2) {
        this.f7721a = str;
        this.b = str2;
    }
}
