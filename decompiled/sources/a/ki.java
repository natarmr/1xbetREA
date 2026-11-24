package a;

import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public enum ki {
    PINE(0),
    UNPINE(1),
    SHOW(2),
    HIDE(3),
    /* JADX INFO: Fake field, exist only in values array */
    RESET_SETTINGS(4),
    UNKNOWN(-1);

    public static final qek0 b = new qek0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18313a;

    ki(int i) {
        this.f18313a = i;
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
