package a;

import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class p2l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f26255a = q3d.j(7, 8, 9, 12);
    public static final List b = q3d.j(1, 2, 3, 6, 10, 11);

    public static final int a(int i, boolean z) {
        if (b.contains(Integer.valueOf(i))) {
            return R.drawable.dota_pre_ban_placeholder;
        }
        if (f26255a.contains(Integer.valueOf(i))) {
            return R.drawable.dota_pre_pick_placeholder;
        }
        if (i == 4) {
            return z ? R.drawable.dota_pre_pick_placeholder : R.drawable.dota_pre_ban_placeholder;
        }
        return (i != 5 || z) ? R.drawable.dota_pre_ban_placeholder : R.drawable.dota_pre_pick_placeholder;
    }
}
