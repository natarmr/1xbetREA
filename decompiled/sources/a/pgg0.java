package a;

import java.util.List;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class pgg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f26955a = q3d.j(12, 24);

    /* JADX WARN: Code duplicated, block: B:22:0x003b  */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    public static final ngg0 a(int i) {
        int i2;
        long jM121getTransparent0d7_KjU;
        if (i == 0 || i == 1) {
            i2 = R.drawable.ic_valorant_all_killed;
        } else if (i == 2) {
            i2 = R.drawable.ic_spike_exploded;
        } else if (i != 3) {
            i2 = i != 4 ? 0 : R.drawable.ic_valorant_time_win;
        } else {
            i2 = R.drawable.ic_spike_defused;
        }
        if (i2 == 0) {
            jM121getTransparent0d7_KjU = StaticColors.INSTANCE.m121getTransparent0d7_KjU();
        } else if (i == 0) {
            jM121getTransparent0d7_KjU = ijg.k0;
        } else if (i == 1) {
            jM121getTransparent0d7_KjU = ijg.p0;
        } else if (i == 2) {
            jM121getTransparent0d7_KjU = ijg.k0;
        } else if (i == 3 || i == 4) {
            jM121getTransparent0d7_KjU = ijg.p0;
        } else {
            jM121getTransparent0d7_KjU = StaticColors.INSTANCE.m121getTransparent0d7_KjU();
        }
        return new ngg0(i2, jM121getTransparent0d7_KjU);
    }
}
