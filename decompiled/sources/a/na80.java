package a;

import android.javax.sip.message.Response;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes3.dex */
public enum na80 {
    BORDER_0_TO_20(0, new IntRange(0, 20, 1)),
    BORDER_70_TO_110(-90, new IntRange(70, 110, 1)),
    BORDER_160_TO_200(-180, new IntRange(160, Response.OK, 1)),
    BORDER_250_TO_290(-270, new IntRange(250, 290, 1)),
    BORDER_340_TO_360(0, new IntRange(340, 360, 1)),
    BORDER_UNDEFINED(-1, new IntRange(-1, -1, 1));

    public static final fl70 c = new fl70();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23178a;
    public final IntRange b;

    na80(int i, IntRange intRange) {
        this.f23178a = i;
        this.b = intRange;
    }
}
