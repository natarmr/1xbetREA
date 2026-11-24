package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class c410 {

    /* JADX INFO: Fake field, exist only in values array */
    c410 EF5;
    public static final /* synthetic */ c410[] b = {new c410("HORDE", 0), new c410("DRAGON", 1), new c410("RIFTHERALD", 2), new c410("BARON_NASHOR", 3), new c410("ATAKHAN", 4)};
    public static final b410 Companion = new b410();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a8z f3703a = maz.a(wez.f39042a, new t010((byte) 7));

    public static c410 valueOf(String str) {
        return (c410) Enum.valueOf(c410.class, str);
    }

    public static c410[] values() {
        return (c410[]) b.clone();
    }
}
