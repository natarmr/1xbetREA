package a;

import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public enum ngs0 {
    UNKNOWN(R.drawable.ic_status_gray_three_dots_circle, ""),
    UPWARD(R.drawable.ic_status_dark_blue_minus_circle, "-"),
    DOWNWARD(R.drawable.ic_status_green_plus_circle, "+"),
    CLOSED(R.drawable.ic_status_red_cross_circle, ""),
    PROVISIONAL(R.drawable.ic_status_yellow_waiting_circle, "-");

    public static final s9m0 c = new s9m0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23500a;
    public final String b;

    ngs0(int i2, String str) {
        this.f23500a = i2;
        this.b = str;
    }
}
