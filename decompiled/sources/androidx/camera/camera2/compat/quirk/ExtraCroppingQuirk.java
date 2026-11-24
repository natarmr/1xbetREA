package androidx.camera.camera2.compat.quirk;

import a.gpd0;
import a.n4c;
import a.vln0;
import a.xp20;
import android.util.Range;
import android.util.Size;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ExtraCroppingQuirk;", "La/gpd0;", "a/n4c", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExtraCroppingQuirk implements gpd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f45309a = xp20.h(new Pair("SM-T580", null), new Pair("SM-J710MN", new Range(21, 26)), new Pair("SM-A320FL", null), new Pair("SM-G570M", null), new Pair("SM-G610F", null), new Pair("SM-G610M", new Range(21, 26)));

    public static Size b(vln0 vln0Var) {
        if (!n4c.N()) {
            return null;
        }
        int iOrdinal = vln0Var.ordinal();
        if (iOrdinal == 0) {
            return new Size(1920, 1080);
        }
        if (iOrdinal == 1) {
            return new Size(1280, 720);
        }
        if (iOrdinal != 2) {
            return null;
        }
        return new Size(3264, 1836);
    }
}
