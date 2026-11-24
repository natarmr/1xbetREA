package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u4q0 {
    public static final u4q0 b = new u4q0(iun.f15405a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f35064a;

    public u4q0(List list) {
        this.f35064a = list;
    }

    public final String toString() {
        return kng0.l("TextContextMenuData(components=", qf00.a(this.f35064a, "\n\t", null, 56), Separators.RPAREN);
    }
}
