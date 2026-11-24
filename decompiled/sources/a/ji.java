package a;

import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public enum ji {
    PINE(0),
    UNPINE(1),
    SHOW(2),
    HIDE(3),
    /* JADX INFO: Fake field, exist only in values array */
    RESET_SETTINGS(4),
    UNKNOWN(-1);

    public static final pek0 b = new pek0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16551a;

    ji(int i) {
        this.f16551a = i;
    }

    public final int a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return R.string.pine;
        }
        if (iOrdinal == 1) {
            return R.string.unpine;
        }
        if (iOrdinal == 2) {
            return R.string.show;
        }
        if (iOrdinal == 3) {
            return R.string.hide;
        }
        if (iOrdinal == 4) {
            return R.string.reset_all_settings;
        }
        if (iOrdinal == 5) {
            return R.string.empty_str;
        }
        t9f.b();
        return 0;
    }
}
