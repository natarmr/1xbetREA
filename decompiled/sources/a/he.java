package a;

/* JADX INFO: loaded from: classes5.dex */
public enum he implements sgf0 {
    PRIMARY("primary"),
    /* JADX INFO: Fake field, exist only in values array */
    SECONDARY("secondary"),
    /* JADX INFO: Fake field, exist only in values array */
    TERTIARY("tertiary"),
    /* JADX INFO: Fake field, exist only in values array */
    QUATERNARY("quaternary"),
    /* JADX INFO: Fake field, exist only in values array */
    QUINARY("quinary"),
    /* JADX INFO: Fake field, exist only in values array */
    SENARY("senary");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12896a;

    he(String str) {
        this.f12896a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "accountControlStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f12896a;
    }
}
