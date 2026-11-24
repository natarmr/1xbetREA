package a;

import android.app.Application;
import android.content.Context;
import android.util.ArrayMap;
import android.util.Log;
import androidx.camera.camera2.compat.quirk.PreviewUnderExposureQuirk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class u3a implements ipt0 {
    public final xvk b;

    public u3a(Context context) {
        context.getClass();
        this.b = xvk.g.m(context);
        if ((context instanceof Application) && l8x.h0()) {
            Log.i("CXCP", "The provided context (" + context + ") is application scoped and will be used to infer the default display for computing the default preview size, orientation, and default aspect ratio for UseCase outputs.");
        }
        if (l8x.f0("CXCP")) {
            Log.d("CXCP", "Created UseCaseConfigurationMap");
        }
    }

    @Override // a.ipt0
    public final drd a(hpt0 hpt0Var, int i) {
        int i2;
        int i3;
        hpt0Var.getClass();
        if (l8x.f0("CXCP")) {
            Log.d("CXCP", "Creating config for " + hpt0Var);
        }
        wy40 wy40VarL = wy40.l();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        wy40 wy40VarL2 = wy40.l();
        ArrayList arrayList = new ArrayList();
        tz40 tz40VarA = tz40.a();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int iOrdinal = hpt0Var.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            i2 = 1;
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4 && iOrdinal != 5) {
                t9f.b();
                return null;
            }
            i2 = 1;
        } else {
            i2 = mhk.a().b(PreviewUnderExposureQuirk.class) != null ? 1 : 3;
        }
        u15 u15Var = fpt0.C0;
        ArrayList arrayList5 = new ArrayList(linkedHashSet);
        ArrayList arrayList6 = new ArrayList(arrayList2);
        ArrayList arrayList7 = new ArrayList(arrayList3);
        ArrayList arrayList8 = new ArrayList(arrayList4);
        ArrayList arrayList9 = new ArrayList(hashSet);
        b780 b780VarJ = b780.j(wy40VarL2);
        ArrayList arrayList10 = new ArrayList(arrayList);
        eoo0 eoo0Var = eoo0.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = tz40VarA.f8147a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        wy40VarL.y(u15Var, new xii0(arrayList5, arrayList6, arrayList7, arrayList8, new t7a(arrayList9, b780VarJ, i2, arrayList10, new eoo0(arrayMap)), null, null, 0, null));
        HashSet hashSet2 = new HashSet();
        wy40 wy40VarL3 = wy40.l();
        ArrayList arrayList11 = new ArrayList();
        ArrayMap arrayMap3 = tz40.a().f8147a;
        int iOrdinal2 = hpt0Var.ordinal();
        if (iOrdinal2 == 0) {
            i3 = i == 2 ? 5 : 2;
        } else if (iOrdinal2 == 1 || iOrdinal2 == 2) {
            i3 = 1;
        } else if (iOrdinal2 != 3) {
            if (iOrdinal2 != 4 && iOrdinal2 != 5) {
                t9f.b();
                return null;
            }
            i3 = 1;
        } else {
            i3 = mhk.a().b(PreviewUnderExposureQuirk.class) != null ? 1 : 3;
        }
        u15 u15Var2 = fpt0.D0;
        ArrayList arrayList12 = new ArrayList(hashSet2);
        b780 b780VarJ2 = b780.j(wy40VarL3);
        ArrayList arrayList13 = new ArrayList(arrayList11);
        eoo0 eoo0Var2 = eoo0.b;
        ArrayMap arrayMap4 = new ArrayMap();
        for (String str2 : arrayMap3.keySet()) {
            arrayMap4.put(str2, arrayMap3.get(str2));
        }
        wy40VarL.y(u15Var2, new t7a(arrayList12, b780VarJ2, i3, arrayList13, new eoo0(arrayMap4)));
        wy40VarL.y(fpt0.F0, hpt0Var == hpt0.f13459a ? s3a.b : q3a.f28042a);
        wy40VarL.y(fpt0.E0, r3a.f29777a);
        hpt0 hpt0Var2 = hpt0.b;
        xvk xvkVar = this.b;
        if (hpt0Var == hpt0Var2) {
            wy40VarL.y(w0x.q0, xvkVar.c());
        }
        u15 u15Var3 = w0x.l0;
        pek pekVar = xvk.g;
        wy40VarL.y(u15Var3, Integer.valueOf(xvkVar.b(true).getRotation()));
        return b780.j(wy40VarL);
    }
}
