package a;

import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class v7a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kpt0 f36914a;
    public final f4w0 b;
    public final tpt0 c;
    public final nwp0 d;
    public final boolean e;

    public v7a(l1a l1aVar, kpt0 kpt0Var, f4w0 f4w0Var, tpt0 tpt0Var, nwp0 nwp0Var) {
        l1aVar.getClass();
        kpt0Var.getClass();
        f4w0Var.getClass();
        tpt0Var.getClass();
        this.f36914a = kpt0Var;
        this.b = f4w0Var;
        this.c = tpt0Var;
        this.d = nwp0Var;
        b1a b1aVar = c1a.a0;
        c1a c1aVar = l1aVar.b;
        b1aVar.getClass();
        this.e = b1a.c(c1aVar);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x013d  */
    /* JADX WARN: Multi-variable type inference failed */
    public final cmf0 a(t7a t7aVar, int i, drd drdVar, List list) {
        dfx dfxVar;
        b1x b1xVarF;
        u7a u7aVar;
        t7aVar.getClass();
        int i2 = t7aVar.c;
        drdVar.getClass();
        list.getClass();
        List<hzj> listUnmodifiableList = Collections.unmodifiableList(t7aVar.f33457a);
        listUnmodifiableList.getClass();
        Object dfxVar2 = null;
        if (listUnmodifiableList.isEmpty()) {
            hny.t(t7aVar, "Attempted to issue a capture without surfaces using ");
            return null;
        }
        ArrayList arrayList = new ArrayList(r3d.q(listUnmodifiableList, 10));
        for (hzj hzjVar : listUnmodifiableList) {
            Object obj = ((Map) this.f36914a.f.getValue()).get(hzjVar);
            if (obj == null) {
                hny.t(hzjVar, "Attempted to issue a capture with an unrecognized surface: ");
                return null;
            }
            arrayList.add((mrm0) obj);
        }
        ux9 ux9Var = new ux9();
        List<vx9> list2 = t7aVar.d;
        list2.getClass();
        for (vx9 vx9Var : list2) {
            vx9Var.getClass();
            ux9Var.b(vx9Var, this.c.e);
        }
        b780 b780Var = t7aVar.b;
        TreeMap treeMap = b780Var.f2093a;
        bbw0 bbw0Var = new bbw0((byte) 16);
        wy40 wy40Var = (wy40) bbw0Var.b;
        bbw0Var.o(drdVar);
        bbw0Var.o(b780Var);
        u15 u15Var = t7a.f;
        if (treeMap.containsKey(u15Var)) {
            CaptureRequest.Key key = CaptureRequest.JPEG_ORIENTATION;
            key.getClass();
            Object objD = b780Var.d(u15Var);
            objD.getClass();
            wy40Var.y(s5x0.C(key), objD);
        }
        u15 u15Var2 = t7a.g;
        if (treeMap.containsKey(u15Var2)) {
            CaptureRequest.Key key2 = CaptureRequest.JPEG_QUALITY;
            key2.getClass();
            Object objD2 = b780Var.d(u15Var2);
            objD2.getClass();
            wy40Var.y(s5x0.C(key2), Byte.valueOf((byte) ((Number) objD2).intValue()));
        }
        if (i2 == 5) {
            f4w0 f4w0Var = this.b;
            if (f4w0Var.c() || f4w0Var.h() || (b1xVarF = f4w0Var.f()) == null) {
                dfxVar = 0;
            } else {
                f0x f0xVarK0 = b1xVarF.K0();
                cy9 cy9Var = f0xVarK0 instanceof dy9 ? ((dy9) f0xVarK0).f6882a : null;
                if (cy9Var == null) {
                    u7aVar = null;
                } else {
                    if (!(cy9Var instanceof j9a)) {
                        hny.t(cy9Var.getClass(), "Unexpected capture result type: ");
                        return null;
                    }
                    Image imageB = b1xVarF.b();
                    if (imageB == null) {
                        jf4.n("Required value was null.");
                        return null;
                    }
                    uz2 uz2Var = new uz2(imageB);
                    Object objH = ((j9a) cy9Var).H(sre0.f32672a.b(b7r.class));
                    if (objH == null) {
                        jf4.n("Required value was null.");
                        return null;
                    }
                    dfxVar2 = new dfx(uz2Var, (b7r) objH);
                    u7aVar = new u7a(new AtomicReference(b1xVarF));
                }
                dfxVar = dfxVar2;
                dfxVar2 = u7aVar;
            }
        } else {
            dfxVar = 0;
        }
        if (dfxVar == 0) {
            int i3 = (i != 3 || this.e) ? (i2 == -1 || i2 == 5) ? 2 : -1 : 4;
            if (i3 != -1) {
                i2 = i3;
            }
        }
        LinkedHashMap linkedHashMapJ = xp20.j(this.d.a(new onf0(i2)), s5x0.U(bbw0Var.c()));
        lc00 lc00VarB = kotlin.collections.a.b();
        lc00VarB.add(ux9Var);
        if (dfxVar2 != null) {
            lc00VarB.add(dfxVar2);
        }
        lc00VarB.addAll(list);
        return new cmf0(arrayList, linkedHashMapJ, wp20.b(new Pair(vso0.f37960a, t7aVar.e)), kotlin.collections.a.a(lc00VarB), new onf0(i2), dfxVar);
    }
}
