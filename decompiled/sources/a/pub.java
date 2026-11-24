package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class pub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oub f27607a;
    public static final /* synthetic */ pub[] b;
    public static final /* synthetic */ c0o c;

    /* JADX INFO: Fake field, exist only in values array */
    pub EF5;

    static {
        pub[] pubVarArr = {new pub("UNASSIGNED", 0), new pub("UPPERCASE_LETTER", 1), new pub("LOWERCASE_LETTER", 2), new pub("TITLECASE_LETTER", 3), new pub("MODIFIER_LETTER", 4), new pub("OTHER_LETTER", 5), new pub("NON_SPACING_MARK", 6), new pub("ENCLOSING_MARK", 7), new pub("COMBINING_SPACING_MARK", 8), new pub("DECIMAL_DIGIT_NUMBER", 9), new pub("LETTER_NUMBER", 10), new pub("OTHER_NUMBER", 11), new pub("SPACE_SEPARATOR", 12), new pub("LINE_SEPARATOR", 13), new pub("PARAGRAPH_SEPARATOR", 14), new pub("CONTROL", 15), new pub("FORMAT", 16), new pub("PRIVATE_USE", 17), new pub("SURROGATE", 18), new pub("DASH_PUNCTUATION", 19), new pub("START_PUNCTUATION", 20), new pub("END_PUNCTUATION", 21), new pub("CONNECTOR_PUNCTUATION", 22), new pub("OTHER_PUNCTUATION", 23), new pub("MATH_SYMBOL", 24), new pub("CURRENCY_SYMBOL", 25), new pub("MODIFIER_SYMBOL", 26), new pub("OTHER_SYMBOL", 27), new pub("INITIAL_QUOTE_PUNCTUATION", 28), new pub("FINAL_QUOTE_PUNCTUATION", 29)};
        b = pubVarArr;
        c = new c0o(pubVarArr);
        f27607a = new oub(null);
    }

    public static pub valueOf(String str) {
        return (pub) Enum.valueOf(pub.class, str);
    }

    public static pub[] values() {
        return (pub[]) b.clone();
    }
}
