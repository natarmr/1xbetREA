package a;

import android.hardware.camera2.params.InputConfiguration;
import android.media.MediaCodec;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class wii0 extends sii0 {
    public final nqd j = new nqd();
    public boolean k = true;
    public final StringBuilder l = new StringBuilder();
    public boolean m = false;
    public final ArrayList n = new ArrayList();

    public final void a(xii0 xii0Var) {
        ucs0 ucs0Var = this.b;
        HashSet hashSet = (HashSet) ucs0Var.c;
        t7a t7aVar = xii0Var.g;
        b780 b780Var = t7aVar.b;
        int i = t7aVar.c;
        if (i != -1) {
            this.m = true;
            int i2 = ucs0Var.b;
            List list = xii0.j;
            if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
            ucs0Var.b = i;
        }
        Range rangeA = t7aVar.a();
        Range range = h55.h;
        boolean zEquals = rangeA.equals(range);
        StringBuilder sb = this.l;
        if (!zEquals) {
            wy40 wy40Var = (wy40) ucs0Var.d;
            u15 u15Var = t7a.h;
            boolean zEquals2 = ((Range) wy40Var.e(u15Var, range)).equals(range);
            wy40 wy40Var2 = (wy40) ucs0Var.d;
            if (zEquals2) {
                wy40Var2.y(u15Var, rangeA);
            } else if (!((Range) wy40Var2.e(u15Var, range)).equals(rangeA)) {
                this.k = false;
                String str = "Different ExpectedFrameRateRange values; current = " + ((Range) ((wy40) ucs0Var.d).e(u15Var, range)) + ", new = " + rangeA;
                l8x.X("ValidatingBuilder", str);
                sb.append(str);
            }
        }
        u15 u15Var2 = fpt0.O0;
        Integer num = (Integer) b780Var.e(u15Var2, 0);
        Objects.requireNonNull(num);
        int iIntValue = num.intValue();
        if (iIntValue != 0 && iIntValue != 0) {
            ((wy40) ucs0Var.d).y(u15Var2, num);
        }
        u15 u15Var3 = fpt0.P0;
        Integer num2 = (Integer) b780Var.e(u15Var3, 0);
        Objects.requireNonNull(num2);
        int iIntValue2 = num2.intValue();
        if (iIntValue2 != 0 && iIntValue2 != 0) {
            ((wy40) ucs0Var.d).y(u15Var3, num2);
        }
        ((tz40) ucs0Var.f).f8147a.putAll((Map) t7aVar.e.f8147a);
        this.c.addAll(xii0Var.c);
        this.d.addAll(xii0Var.d);
        ucs0Var.e(t7aVar.d);
        this.e.addAll(xii0Var.e);
        vii0 vii0Var = xii0Var.f;
        if (vii0Var != null) {
            this.n.add(vii0Var);
        }
        InputConfiguration inputConfiguration = xii0Var.i;
        if (inputConfiguration != null) {
            this.g = inputConfiguration;
        }
        ArrayList arrayList = xii0Var.f40947a;
        LinkedHashSet<a55> linkedHashSet = this.f32265a;
        linkedHashSet.addAll(arrayList);
        hashSet.addAll(Collections.unmodifiableList(t7aVar.f33457a));
        ArrayList arrayList2 = new ArrayList();
        for (a55 a55Var : linkedHashSet) {
            arrayList2.add(a55Var.f252a);
            Iterator it = a55Var.b.iterator();
            while (it.hasNext()) {
                arrayList2.add((hzj) it.next());
            }
        }
        if (!arrayList2.containsAll(hashSet)) {
            l8x.U("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
            this.k = false;
            sb.append("Invalid configuration due to capture request surfaces are not a subset of surfaces");
        }
        int i3 = xii0Var.h;
        int i4 = this.h;
        if (i3 != i4 && i3 != 0 && i4 != 0) {
            l8x.U("ValidatingBuilder", "Invalid configuration due to that two non-default session types are set");
            this.k = false;
            sb.append("Invalid configuration due to that two non-default session types are set");
        } else if (i3 != 0) {
            this.h = i3;
        }
        a55 a55Var2 = xii0Var.b;
        if (a55Var2 != null) {
            a55 a55Var3 = this.i;
            if (a55Var3 == a55Var2 || a55Var3 == null) {
                this.i = a55Var2;
            } else {
                l8x.U("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                this.k = false;
                sb.append("Invalid configuration due to that two different postview output configs are set");
            }
        }
        ucs0Var.g(b780Var);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0087  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a7 A[EDGE_INSN: B:38:0x00a7->B:39:0x00d8 BREAK  A[LOOP:0: B:16:0x0035->B:48:?]] */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x00a7, please report this as an issue */
    public final xii0 b() {
        u15 u15Var;
        Range range;
        if (!this.k) {
            jf4.o("Unsupported session configuration combination");
            return null;
        }
        ArrayList arrayList = new ArrayList(this.f32265a);
        nqd nqdVar = this.j;
        if (nqdVar.b) {
            Collections.sort(arrayList, new l13(nqdVar));
        }
        int i = this.h;
        byte b = 2;
        ucs0 ucs0Var = this.b;
        if (i == 1 && arrayList.size() == 2 && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                hzj hzjVar = ((a55) it.next()).f252a;
                hzjVar.getClass();
                if (Intrinsics.d(hzjVar.j, MediaCodec.class)) {
                    HashSet hashSet = (HashSet) ucs0Var.c;
                    if (!hashSet.isEmpty()) {
                        Iterator it2 = hashSet.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                wy40 wy40Var = (wy40) ucs0Var.d;
                                u15Var = t7a.h;
                                range = (Range) wy40Var.e(u15Var, h55.h);
                                if (range != null) {
                                    break;
                                }
                                if (((Number) range.getUpper()).intValue() >= 120) {
                                    range = null;
                                } else {
                                    range = null;
                                }
                                if (range != null) {
                                    break;
                                }
                                Range range2 = new Range(30, range.getUpper());
                                l8x.U("HighSpeedFpsModifier", "Modified high-speed FPS range from " + range + " to " + range2);
                                ((wy40) ucs0Var.d).y(u15Var, range2);
                                break;
                            }
                            hzj hzjVar2 = (hzj) it2.next();
                            hzjVar2.getClass();
                            if (Intrinsics.d(hzjVar2.j, MediaCodec.class)) {
                                break;
                            }
                        }
                    } else {
                        wy40 wy40Var2 = (wy40) ucs0Var.d;
                        u15Var = t7a.h;
                        range = (Range) wy40Var2.e(u15Var, h55.h);
                        if (range != null) {
                            break;
                        }
                        if (((Number) range.getUpper()).intValue() >= 120 || !Intrinsics.d(range.getLower(), range.getUpper())) {
                            range = null;
                        }
                        if (range != null) {
                            break;
                        }
                        Range range3 = new Range(30, range.getUpper());
                        l8x.U("HighSpeedFpsModifier", "Modified high-speed FPS range from " + range + " to " + range3);
                        ((wy40) ucs0Var.d).y(u15Var, range3);
                        break;
                    }
                }
            }
        }
        return new xii0(arrayList, new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), ucs0Var.j(), this.n.isEmpty() ? null : new izw(this, b), this.g, this.h, this.i);
    }

    public final boolean c() {
        return this.m && this.k;
    }
}
