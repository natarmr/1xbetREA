package androidx.camera.core.internal.compat.quirk;

import a.fot0;
import a.fpt0;
import a.gpd0;
import a.hpt0;
import a.mzw;
import a.oub0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ImageCaptureFailedForSpecificCombinationQuirk implements gpd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f45334a = new HashSet(Arrays.asList("pixel 4a", "pixel 4a (5g)", "pixel 5", "pixel 5a"));

    public static boolean b(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() == 3) {
            Iterator it = linkedHashSet.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            while (it.hasNext()) {
                fot0 fot0Var = (fot0) it.next();
                if (fot0Var instanceof oub0) {
                    z = true;
                } else if (fot0Var instanceof mzw) {
                    z3 = true;
                } else if (fot0Var.i.f(fpt0.N0)) {
                    z2 = fot0Var.i.v() == hpt0.d;
                }
            }
            if (z && z2 && z3) {
                return true;
            }
        }
        return false;
    }
}
