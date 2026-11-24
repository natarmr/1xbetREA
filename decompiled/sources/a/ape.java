package a;

import android.content.Context;
import org.xbet.client1.R;
import org.xplatform.uikit.components.badges.DsBadge;
import org.xplatform.uikit.components.cells.menu.DsMenuCompactCell;
import org.xplatform.uikit.components.counter.DsCounter;

/* JADX INFO: loaded from: classes6.dex */
public final class ape {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DsMenuCompactCell f1247a;
    public final rkm b;
    public DsCounter c;
    public DsBadge d;
    public r0m e = r0m.l;
    public int f = R.style.Widget_DSBadge_Counter;
    public int g = 8388693;
    public int h;
    public int i;
    public final int j;

    public ape(DsMenuCompactCell dsMenuCompactCell, rkm rkmVar) {
        this.f1247a = dsMenuCompactCell;
        this.b = rkmVar;
        this.j = dsMenuCompactCell.getContext().getResources().getDimensionPixelOffset(R.dimen.space_1);
    }

    public final void a(Integer num) {
        int i = this.h;
        int i2 = this.i;
        if (num != null && this.c == null) {
            DsMenuCompactCell dsMenuCompactCell = this.f1247a;
            Context context = dsMenuCompactCell.getContext();
            context.getClass();
            DsCounter dsCounter = new DsCounter(context, null, 6);
            dsCounter.setComponentStyle(this.e);
            dsCounter.g(this.g, i + this.j, i2);
            dsCounter.b(dsMenuCompactCell, this.b);
            this.c = dsCounter;
        }
        DsCounter dsCounter2 = this.c;
        if (dsCounter2 != null) {
            dsCounter2.setCount(num);
        }
        DsBadge dsBadge = this.d;
        if (dsBadge != null) {
            DsCounter dsCounter3 = this.c;
            dsBadge.setVisibility((dsCounter3 == null || dsCounter3.getVisibility() != 0) ? 8 : 0);
        }
    }
}
