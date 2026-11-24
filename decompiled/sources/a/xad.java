package a;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class xad extends AbstractMap implements Serializable {
    public static final Object j = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Object f40546a;
    public transient int[] b;
    public transient Object[] c;
    public transient Object[] d;
    public transient int e;
    public transient int f;
    public transient vad g;
    public transient vad h;
    public transient b4 i;

    public static xad a(int i) {
        xad xadVar = new xad();
        x0x.z("Expected size must be >= 0", i >= 0);
        xadVar.e = Math.min(Math.max(i, 1), 1073741823);
        return xadVar;
    }

    public final Map b() {
        Object obj = this.f40546a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (g()) {
            return;
        }
        this.e += 32;
        Map mapB = b();
        if (mapB != null) {
            this.e = Math.min(Math.max(size(), 3), 1073741823);
            mapB.clear();
            this.f40546a = null;
            this.f = 0;
            return;
        }
        Arrays.fill(k(), 0, this.f, (Object) null);
        Arrays.fill(l(), 0, this.f, (Object) null);
        Object obj = this.f40546a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(j(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.containsKey(obj);
        }
        return e(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.containsValue(obj);
        }
        for (int i = 0; i < this.f; i++) {
            if (Objects.equals(obj, l()[i])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.e & 31)) - 1;
    }

    public final int e(Object obj) {
        if (g()) {
            return -1;
        }
        int iZ = gkb.Z(obj);
        int iD = d();
        Object obj2 = this.f40546a;
        Objects.requireNonNull(obj2);
        int iK0 = lgb.k0(iZ & iD, obj2);
        if (iK0 == 0) {
            return -1;
        }
        int i = ~iD;
        int i2 = iZ & i;
        do {
            int i3 = iK0 - 1;
            int i4 = j()[i3];
            if ((i4 & i) == i2 && Objects.equals(obj, k()[i3])) {
                return i3;
            }
            iK0 = i4 & iD;
        } while (iK0 != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        vad vadVar = this.h;
        if (vadVar != null) {
            return vadVar;
        }
        vad vadVar2 = new vad(this, (byte) 0);
        this.h = vadVar2;
        return vadVar2;
    }

    public final void f(int i, int i2) {
        Object obj = this.f40546a;
        Objects.requireNonNull(obj);
        int[] iArrJ = j();
        Object[] objArrK = k();
        Object[] objArrL = l();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrK[i] = null;
            objArrL[i] = null;
            iArrJ[i] = 0;
            return;
        }
        Object obj2 = objArrK[i3];
        objArrK[i] = obj2;
        objArrL[i] = objArrL[i3];
        objArrK[i3] = null;
        objArrL[i3] = null;
        iArrJ[i] = iArrJ[i3];
        iArrJ[i3] = 0;
        int iZ = gkb.Z(obj2) & i2;
        int iK0 = lgb.k0(iZ, obj);
        if (iK0 == size) {
            lgb.l0(iZ, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = iK0 - 1;
            int i5 = iArrJ[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArrJ[i4] = lgb.g0(i5, i + 1, i2);
                return;
            }
            iK0 = i6;
        }
    }

    public final boolean g() {
        return this.f40546a == null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.get(obj);
        }
        int iE = e(obj);
        if (iE == -1) {
            return null;
        }
        return l()[iE];
    }

    public final Object h(Object obj) {
        if (!g()) {
            int iD = d();
            Object obj2 = this.f40546a;
            Objects.requireNonNull(obj2);
            int iI0 = lgb.i0(obj, null, iD, obj2, j(), k(), null);
            if (iI0 != -1) {
                Object obj3 = l()[iI0];
                f(iI0, iD);
                this.f--;
                this.e += 32;
                return obj3;
            }
        }
        return j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final int[] j() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] k() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        vad vadVar = this.g;
        if (vadVar != null) {
            return vadVar;
        }
        vad vadVar2 = new vad(this, (byte) 1);
        this.g = vadVar2;
        return vadVar2;
    }

    public final Object[] l() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int m(int i, int i2, int i3, int i4) {
        Object objM = lgb.M(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            lgb.l0(i3 & i5, i4 + 1, objM);
        }
        Object obj = this.f40546a;
        Objects.requireNonNull(obj);
        int[] iArrJ = j();
        for (int i6 = 0; i6 <= i; i6++) {
            int iK0 = lgb.k0(i6, obj);
            while (iK0 != 0) {
                int i7 = iK0 - 1;
                int i8 = iArrJ[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iK1 = lgb.k0(i10, objM);
                lgb.l0(i10, iK0, objM);
                iArrJ[i7] = lgb.g0(i9, iK1, i5);
                iK0 = i8 & i;
            }
        }
        this.f40546a = objM;
        this.e = lgb.g0(this.e, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:42:0x0100 A[LOOP:1: B:39:0x00e9->B:42:0x0100, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e4 A[EDGE_INSN: B:63:0x00e4->B:37:0x00e4 BREAK  A[LOOP:1: B:39:0x00e9->B:42:0x0100], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00fe -> B:37:0x00e4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object r23, java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xad.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.remove(obj);
        }
        Object objH = h(obj);
        if (objH == j) {
            return null;
        }
        return objH;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapB = b();
        return mapB != null ? mapB.size() : this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        b4 b4Var = this.i;
        if (b4Var != null) {
            return b4Var;
        }
        b4 b4Var2 = new b4(this, (byte) 1);
        this.i = b4Var2;
        return b4Var2;
    }
}
