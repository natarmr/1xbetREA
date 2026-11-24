package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class z310 {

    /* JADX INFO: Fake field, exist only in values array */
    z310 EF5;
    public static final /* synthetic */ z310[] b = {new z310("CHEMTECH_DRAGON", 0), new z310("FIRE_DRAGON", 1), new z310("EARTH_DRAGON", 2), new z310("WATER_DRAGON", 3), new z310("AIR_DRAGON", 4), new z310("HEXTECH_DRAGON", 5), new z310("ELDER_DRAGON", 6)};
    public static final y310 Companion = new y310();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a8z f43697a = maz.a(wez.f39042a, new t010((byte) 6));

    public static z310 valueOf(String str) {
        return (z310) Enum.valueOf(z310.class, str);
    }

    public static z310[] values() {
        return (z310[]) b.clone();
    }
}
