package a;

/* JADX INFO: loaded from: classes5.dex */
public enum kg implements sgf0 {
    PRIMARY("primary"),
    SECONDARY("secondary"),
    /* JADX INFO: Fake field, exist only in values array */
    TERTIARY("tertiary"),
    /* JADX INFO: Fake field, exist only in values array */
    QUATERNARY("quaternary"),
    /* JADX INFO: Fake field, exist only in values array */
    FIVEFOLD("fivefold");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18216a;

    kg(String str) {
        this.f18216a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "accountSelectionStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f18216a;
    }
}
