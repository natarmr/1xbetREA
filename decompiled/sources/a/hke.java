package a;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class hke {
    public static final yzn A;
    public static final List f = q3d.j(2, 4, 3);
    public static final List g = q3d.j(2, 3);
    public static final List h = q3d.j(2, 6, 4, 5);
    public static final List i = kotlin.collections.a.c(3);
    public static final List j = kotlin.collections.a.c(3);
    public static final List k = q3d.j(4, 5);
    public static final List l = q3d.j(2, 4, 3);
    public static final List m = q3d.j(2, 3);
    public static final Map n;
    public static final Map o;
    public static final Map p;
    public static final Map q;
    public static final odd r;
    public static final List s;
    public static final List t;
    public static final List u;
    public static final Map v;
    public static final Map w;
    public static final Map x;
    public static final Map y;
    public static final Map z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iev f13203a;
    public final c1a b;
    public final qev c;
    public final pg00 d;
    public odd e;

    static {
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
        n = wp20.b(new Pair(key, 1));
        o = wp20.b(new Pair(key, 2));
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
        p = wp20.b(new Pair(key2, 1));
        q = xp20.f(new Pair(key, 1), new Pair(key2, 1));
        r = ozb.j(new k0g0(4, null));
        s = q3d.j(0, 1, 2, 4);
        List listJ = q3d.j(0, 3, 1, 2, 6);
        t = listJ;
        u = q3d.j(0, 1, 2);
        CaptureRequest.Key key3 = CaptureRequest.CONTROL_AE_LOCK;
        Boolean bool = Boolean.TRUE;
        v = wp20.b(new Pair(key3, bool));
        w = xp20.f(new Pair(key, 2), new Pair(key3, bool));
        x = wp20.b(new Pair(key3, Boolean.FALSE));
        y = wp20.b(new Pair(key2, 2));
        z = xp20.f(new Pair(key, 2), new Pair(key2, 2));
        Map mapB = wp20.b(new Pair(CaptureResult.CONTROL_AF_STATE, listJ));
        mapB.getClass();
        A = new yzn(mapB, (byte) 1);
    }

    public hke(iev ievVar, c1a c1aVar, qev qevVar, pg00 pg00Var) {
        ievVar.getClass();
        c1aVar.getClass();
        qevVar.getClass();
        pg00Var.getClass();
        this.f13203a = ievVar;
        this.b = c1aVar;
        this.c = qevVar;
        this.d = pg00Var;
    }

    public static odd b(hke hkeVar, z40 z40Var, q70 q70Var, va5 va5Var, xjq xjqVar, List list, List list2, List list3, int i2) {
        q70 q70Var2 = (i2 & 2) != 0 ? null : q70Var;
        va5 va5Var2 = (i2 & 4) != 0 ? null : va5Var;
        xjq xjqVar2 = (i2 & 8) != 0 ? null : xjqVar;
        List list4 = (i2 & 16) != 0 ? null : list;
        List list5 = (i2 & 32) != 0 ? null : list2;
        List list6 = (i2 & 64) != 0 ? null : list3;
        if (hkeVar.f13203a.c.d() == null) {
            qev.b(hkeVar.c, z40Var, q70Var2, va5Var2, xjqVar2, list4, list5, list6, null, null, null, 896);
            hkeVar.f13203a.f(hkeVar.c.a());
            return r;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (z40Var != null) {
            int i3 = z40Var.f43743a;
            CaptureResult.Key key = CaptureResult.CONTROL_AE_MODE;
            key.getClass();
        }
        if (q70Var2 != null) {
            byte b = q70Var2.f28225a;
            CaptureResult.Key key2 = CaptureResult.CONTROL_AF_MODE;
            key2.getClass();
        }
        if (va5Var2 != null) {
            byte b2 = va5Var2.f37069a;
            CaptureResult.Key key3 = CaptureResult.CONTROL_AWB_MODE;
            key3.getClass();
        }
        if (xjqVar2 != null) {
            byte b3 = xjqVar2.f40999a;
            CaptureResult.Key key4 = CaptureResult.FLASH_MODE;
            key4.getClass();
        }
        l0g0 l0g0Var = new l0g0(xp20.n(linkedHashMap));
        pg00 pg00Var = hkeVar.d;
        pg00Var.getClass();
        pg00Var.f26931a.add(l0g0Var);
        qev.b(hkeVar.c, z40Var, q70Var2, va5Var2, xjqVar2, list4, list5, list6, null, null, null, 896);
        hkeVar.f13203a.f(hkeVar.c.a());
        odd oddVar = l0g0Var.d;
        synchronized (hkeVar) {
            try {
                Log.d("CXCP", "Controller3A#update3A: cancelling previous request " + hkeVar.e);
                odd oddVar2 = hkeVar.e;
                if (oddVar2 != null) {
                    zvw.G(oddVar2, "A newer call for 3A state update initiated.");
                }
                hkeVar.e = oddVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        return oddVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:103:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:104:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:108:0x01da  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:115:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:121:0x021b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:122:0x021c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0288  */
    /* JADX WARN: Code duplicated, block: B:136:0x028b  */
    /* JADX WARN: Code duplicated, block: B:138:0x0291  */
    /* JADX WARN: Code duplicated, block: B:139:0x0294  */
    /* JADX WARN: Code duplicated, block: B:141:0x029a  */
    /* JADX WARN: Code duplicated, block: B:142:0x029c  */
    /* JADX WARN: Code duplicated, block: B:144:0x029f  */
    /* JADX WARN: Code duplicated, block: B:145:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:147:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:148:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:153:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:155:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:157:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:159:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:163:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:164:0x032f  */
    /* JADX WARN: Code duplicated, block: B:166:0x0332  */
    /* JADX WARN: Code duplicated, block: B:168:0x0336 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:169:0x0338  */
    /* JADX WARN: Code duplicated, block: B:170:0x0363  */
    /* JADX WARN: Code duplicated, block: B:174:0x0372  */
    /* JADX WARN: Code duplicated, block: B:176:0x039f  */
    /* JADX WARN: Code duplicated, block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:60:0x0104  */
    /* JADX WARN: Code duplicated, block: B:66:0x010e  */
    /* JADX WARN: Code duplicated, block: B:71:0x011d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0124  */
    /* JADX WARN: Code duplicated, block: B:74:0x012e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0132  */
    /* JADX WARN: Code duplicated, block: B:78:0x013b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX WARN: Code duplicated, block: B:81:0x014a  */
    /* JADX WARN: Code duplicated, block: B:84:0x0164  */
    /* JADX WARN: Code duplicated, block: B:85:0x0166  */
    /* JADX WARN: Code duplicated, block: B:87:0x016b  */
    /* JADX WARN: Code duplicated, block: B:91:0x0172  */
    /* JADX WARN: Code duplicated, block: B:94:0x0179  */
    /* JADX WARN: Code duplicated, block: B:96:0x017c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x017e  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
    
        if (r8.e(a.hke.o) == false) goto L25;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:163:0x02dc, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:97:0x017e, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r34, java.util.List r35, java.util.List r36, a.vt00 r37, a.vt00 r38, a.vt00 r39, a.z40 r40, kotlin.jvm.functions.Function1 r41, int r42, java.lang.Long r43, java.lang.Long r44, a.zje r45) {
        /*
            Method dump skipped, instruction units count: 978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hke.a(java.util.List, java.util.List, java.util.List, a.vt00, a.vt00, a.vt00, a.z40, kotlin.jvm.functions.Function1, int, java.lang.Long, java.lang.Long, a.zje):java.lang.Object");
    }
}
