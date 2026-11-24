package a;

/* JADX INFO: loaded from: classes5.dex */
public enum nr1 implements sgf0 {
    PRIZE("prize"),
    /* JADX INFO: Fake field, exist only in values array */
    DATES("dates"),
    /* JADX INFO: Fake field, exist only in values array */
    TAGS("tags"),
    /* JADX INFO: Fake field, exist only in values array */
    TIMER("timer");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23981a;

    nr1(String str) {
        this.f23981a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "aggregatorTournamentCardNativeStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f23981a;
    }
}
