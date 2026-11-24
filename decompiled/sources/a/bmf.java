package a;

import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public enum bmf {
    WIN_RATE(R.string.win_rate_statistic, 10),
    PICK_BAN(R.string.pick_ban, 11);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f2834a;
    public final int b;

    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    bmf(int i, long j) {
        this.f2834a = (int) j;
        this.b = i;
    }
}
