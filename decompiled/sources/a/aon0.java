package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class aon0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ aon0[] f1211a = {new aon0("LEFT_MANUAL", 0), new aon0("RIGHT_MANUAL", 1), new aon0("LEFT_AUTO", 2), new aon0("RIGHT_AUTO", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    aon0 EF5;

    public static aon0 valueOf(String str) {
        return (aon0) Enum.valueOf(aon0.class, str);
    }

    public static aon0[] values() {
        return (aon0[]) f1211a.clone();
    }
}
