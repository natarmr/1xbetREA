package a;

import android.graphics.Point;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ddh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5897a;
    public final ArrayList b;

    public ddh0(int i, int i2) {
        this.f5897a = i2;
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < 6; i3++) {
            int i4 = 0;
            while (i4 < 6) {
                int i5 = this.f5897a + i;
                Point point = new Point(i5 * i3, i5 * i4);
                i4++;
                arrayList.add(new sdh0(new ych0(point, new Point(point.x, point.y + i), new Point(point.x + i, point.y), new Point(point.x + i, point.y + i)), new edh0(i3 + 1, i4)));
            }
        }
        this.b = arrayList;
    }
}
