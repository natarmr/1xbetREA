package a;

import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public enum c860 {
    ALL(0),
    ACTIVE(1),
    APPROVED(2),
    REJECTED(3),
    EXPIRED(4);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f3898a;

    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    c860(long j) {
        this.f3898a = (int) j;
    }

    public final int a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return R.string.all;
        }
        if (iOrdinal == 1) {
            return R.string.active;
        }
        if (iOrdinal == 2) {
            return R.string.received;
        }
        if (iOrdinal == 3) {
            return R.string.rejected;
        }
        if (iOrdinal == 4) {
            return R.string.notification_type_expired;
        }
        t9f.b();
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return String.valueOf(this.f3898a);
    }
}
