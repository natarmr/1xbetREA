package androidx.camera.camera2.compat.quirk;

import a.axq;
import a.gpd0;
import a.sln0;
import a.tln0;
import a.tx3;
import a.urm0;
import a.vln0;
import a.wln0;
import a.y2m0;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;", "La/gpd0;", "a/mbc", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExtraSupportedSurfaceCombinationsQuirk implements gpd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sln0 f45310a;
    public static final sln0 b;
    public static final Set c;
    public static final Set d;

    static {
        sln0 sln0Var = new sln0();
        urm0 urm0Var = wln0.e;
        vln0 vln0Var = vln0.b;
        tln0 tln0Var = tln0.VGA;
        urm0 urm0Var2 = wln0.e;
        sln0Var.a(y2m0.a(vln0Var, tln0Var, urm0Var2));
        vln0 vln0Var2 = vln0.f37634a;
        tln0 tln0Var2 = tln0.PREVIEW;
        sln0Var.a(y2m0.a(vln0Var2, tln0Var2, urm0Var2));
        tln0 tln0Var3 = tln0.MAXIMUM;
        sln0Var.a(y2m0.a(vln0Var, tln0Var3, urm0Var2));
        f45310a = sln0Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(y2m0.a(vln0Var, tln0Var, urm0Var2));
        arrayList.add(y2m0.a(vln0Var, tln0Var2, urm0Var2));
        arrayList.add(y2m0.a(vln0Var, tln0Var3, urm0Var2));
        sln0 sln0Var2 = new sln0();
        axq.v(sln0Var2, y2m0.a(vln0Var2, tln0Var2, urm0Var2), vln0Var2, tln0Var, urm0Var2);
        sln0Var2.a(y2m0.a(vln0Var, tln0Var3, urm0Var2));
        b = sln0Var2;
        c = tx3.l0(new String[]{"PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO", "PIXEL 9", "PIXEL 9 PRO", "PIXEL 9 PRO XL", "PIXEL 9 PRO FOLD"});
        d = tx3.l0(new String[]{"SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26", "SM-S931", "SM-S936", "SM-S937", "SM-S938", "SCG31", "SCG32", "SC-51F", "SC-52F"});
    }
}
