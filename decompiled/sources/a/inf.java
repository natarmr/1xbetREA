package a;

import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public enum inf {
    STATISTIC(R.string.statistic, 1),
    WEAPON(R.string.cs2_weapon, 2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f15071a;
    public final int b;

    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    inf(int i, long j) {
        this.f15071a = (int) j;
        this.b = i;
    }
}
