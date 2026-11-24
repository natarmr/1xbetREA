package a;

/* JADX INFO: loaded from: classes5.dex */
public enum ep0 implements sgf0 {
    SMALL_HEADER("smallHeader"),
    /* JADX INFO: Fake field, exist only in values array */
    PROVIDER_CHIPS("providerChips"),
    LARGE_HEADER("largeHeader");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8162a;

    ep0(String str) {
        this.f8162a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "aggregatorFilterScreenStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f8162a;
    }
}
