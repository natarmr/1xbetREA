package a;

/* JADX INFO: loaded from: classes5.dex */
public enum zuc0 implements sgf0 {
    CARDS_WITH_GAMES_AND_STORE("cardsWithGamesAndStore"),
    CARDS_WITH_GAMES("cardsWithGames"),
    LIST_WITH_GAMES_AND_STORE("listWithGamesAndStore"),
    LIST_WITH_GAMES("listWithGames"),
    PLAIN_LIST("plainList");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45004a;

    zuc0(String str) {
        this.f45004a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "promoStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f45004a;
    }
}
