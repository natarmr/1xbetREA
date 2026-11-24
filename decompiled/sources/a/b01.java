package a;

/* JADX INFO: loaded from: classes5.dex */
public enum b01 implements sgf0 {
    BACKGROUND_PICTURE("backgroundPicture"),
    /* JADX INFO: Fake field, exist only in values array */
    BACKGROUND_ILLUSTRATION("backgroundIllustration"),
    /* JADX INFO: Fake field, exist only in values array */
    ICON("icon"),
    /* JADX INFO: Fake field, exist only in values array */
    TICKET_PRIMARY("ticketPrimary"),
    /* JADX INFO: Fake field, exist only in values array */
    TICKET_SECONDARY("ticketSecondary");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1746a;

    b01(String str) {
        this.f1746a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "aggregatorGiftCardStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f1746a;
    }
}
