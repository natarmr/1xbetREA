package a;

import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public enum q760 {
    ALL_TIME(0),
    WEEK(1),
    MONTH(2),
    CUSTOM(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f28236a;

    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    q760(long j) {
        this.f28236a = (int) j;
    }

    public final int a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return R.string.all_time;
        }
        if (iOrdinal == 1) {
            return R.string.for_week;
        }
        if (iOrdinal == 2) {
            return R.string.for_month;
        }
        if (iOrdinal == 3) {
            return R.string.select_period;
        }
        t9f.b();
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return String.valueOf(this.f28236a);
    }
}
