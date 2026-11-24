package a;

import java.util.List;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes2.dex */
public class x3d extends w3d {
    public static final int B(int i, List list) {
        if (i >= 0 && i <= list.size() - 1) {
            return (list.size() - 1) - i;
        }
        StringBuilder sbM = b1j.m(i, "Element index ", " must be in range [");
        sbM.append(new IntRange(0, list.size() - 1, 1));
        sbM.append("].");
        throw new IndexOutOfBoundsException(sbM.toString());
    }

    public static final int C(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder sbM = b1j.m(i, "Position index ", " must be in range [");
        sbM.append(new IntRange(0, list.size(), 1));
        sbM.append("].");
        throw new IndexOutOfBoundsException(sbM.toString());
    }
}
