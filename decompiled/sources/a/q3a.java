package a;

import android.hardware.camera2.CameraCaptureSession;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class q3a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q3a f28042a = new q3a();

    public void a(nzw nzwVar, ucs0 ucs0Var) {
        int i;
        t7a t7aVar = (t7a) nzwVar.e(fpt0.D0, null);
        b780 b780Var = b780.c;
        b780Var.getClass();
        u15 u15Var = t7a.f;
        HashSet hashSet = new HashSet();
        wy40 wy40VarL = wy40.l();
        ArrayList arrayList = new ArrayList();
        tz40 tz40VarA = tz40.a();
        ArrayList arrayList2 = new ArrayList(hashSet);
        b780 b780VarJ = b780.j(wy40VarL);
        ArrayList arrayList3 = new ArrayList(arrayList);
        eoo0 eoo0Var = eoo0.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = tz40VarA.f8147a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        new t7a(arrayList2, b780VarJ, -1, arrayList3, new eoo0(arrayMap));
        if (t7aVar != null) {
            int i2 = t7aVar.c;
            ucs0Var.e(t7aVar.d);
            b780 b780Var2 = t7aVar.b;
            ((tz40) ucs0Var.f).f8147a.putAll((Map) t7aVar.e.f8147a);
            List listUnmodifiableList = Collections.unmodifiableList(t7aVar.f33457a);
            listUnmodifiableList.getClass();
            Iterator it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                ((HashSet) ucs0Var.c).add((hzj) it.next());
            }
            i = i2;
            b780Var = b780Var2;
        } else {
            i = -1;
        }
        ucs0Var.d = wy40.p(b780Var);
        Object objE = nzwVar.e(hx9.d, Integer.valueOf(i));
        objE.getClass();
        ucs0Var.b = ((Number) objE).intValue();
        CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) nzwVar.e(hx9.g, null);
        if (captureCallback != null) {
            ucs0Var.f(new o3a(captureCallback));
        }
        peg0 peg0Var = new peg0((byte) 19);
        nzwVar.i(new uq((Object) peg0Var, (Object) nzwVar, (byte) 3));
        ucs0Var.g(new h03((Object) b780.j((wy40) peg0Var.b), (byte) 20));
    }
}
