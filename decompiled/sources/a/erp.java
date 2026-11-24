package a;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class erp {
    public static final erp c = new erp(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oak0 f8293a = new oak0(16);
    public boolean b;

    public erp(int i) {
        f();
    }

    public static int c(eov0 eov0Var, Object obj) {
        switch (eov0Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return tyc.s(((Long) obj).longValue());
            case 3:
                return tyc.s(((Long) obj).longValue());
            case 4:
                return tyc.o(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                return 8;
            case 6:
                ((Integer) obj).getClass();
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return tyc.r(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e) {
                    e9d0.m("UTF-8 not supported.", e);
                    return 0;
                }
            case 9:
                return ((z3) obj).d();
            case 10:
                return tyc.q((z3) obj);
            case 11:
                if (obj instanceof pg9) {
                    pg9 pg9Var = (pg9) obj;
                    return pg9Var.size() + tyc.r(pg9Var.size());
                }
                byte[] bArr = (byte[]) obj;
                return tyc.r(bArr.length) + bArr.length;
            case 12:
                return tyc.r(((Integer) obj).intValue());
            case 13:
                return obj instanceof vlx ? tyc.o(((vlx) obj).a()) : tyc.o(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                return 4;
            case 15:
                ((Long) obj).getClass();
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return tyc.r((iIntValue >> 31) ^ (iIntValue << 1));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return tyc.s((jLongValue >> 63) ^ (jLongValue << 1));
            default:
                itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                return 0;
        }
    }

    public static int d(hjt hjtVar, Object obj) {
        eov0 eov0Var = hjtVar.b;
        short s = hjtVar.f13177a;
        if (!hjtVar.c) {
            int iT = tyc.t(s);
            if (eov0Var == eov0.e) {
                iT *= 2;
            }
            return c(eov0Var, obj) + iT;
        }
        int iC = 0;
        for (Object obj2 : (List) obj) {
            int iT2 = tyc.t(s);
            if (eov0Var == eov0.e) {
                iT2 *= 2;
            }
            iC += c(eov0Var, obj2) + iT2;
        }
        return iC;
    }

    public static boolean e(Map.Entry entry) {
        hjt hjtVar = (hjt) entry.getKey();
        if (hjtVar.b.f8155a != hov0.MESSAGE) {
            return true;
        }
        if (hjtVar.c) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!((z3) it.next()).b()) {
                }
            }
            return true;
        }
        Object value = entry.getValue();
        if (!(value instanceof z3)) {
            jf4.o("Wrong object type used with protocol message reflection.");
            return false;
        }
        if (((z3) value).b()) {
            return true;
        }
        return false;
    }

    public static Object h(pyc pycVar, eov0 eov0Var) {
        switch (eov0Var.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(pycVar.j()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(pycVar.i()));
            case 2:
                return Long.valueOf(pycVar.l());
            case 3:
                return Long.valueOf(pycVar.l());
            case 4:
                return Integer.valueOf(pycVar.k());
            case 5:
                return Long.valueOf(pycVar.j());
            case 6:
                return Integer.valueOf(pycVar.i());
            case 7:
                return Boolean.valueOf(pycVar.l() != 0);
            case 8:
                int iK = pycVar.k();
                int i = pycVar.b;
                int i2 = pycVar.d;
                if (iK > i - i2 || iK <= 0) {
                    return iK == 0 ? "" : new String(pycVar.h(iK), "UTF-8");
                }
                String str = new String(pycVar.f27797a, i2, iK, "UTF-8");
                pycVar.d += iK;
                return str;
            case 9:
                jf4.o("readPrimitiveField() cannot handle nested groups.");
                return null;
            case 10:
                jf4.o("readPrimitiveField() cannot handle embedded messages.");
                return null;
            case 11:
                return pycVar.f();
            case 12:
                return Integer.valueOf(pycVar.k());
            case 13:
                jf4.o("readPrimitiveField() cannot handle enums.");
                return null;
            case 14:
                return Integer.valueOf(pycVar.i());
            case 15:
                return Long.valueOf(pycVar.j());
            case 16:
                int iK2 = pycVar.k();
                return Integer.valueOf((-(iK2 & 1)) ^ (iK2 >>> 1));
            case 17:
                long jL = pycVar.l();
                return Long.valueOf((-(jL & 1)) ^ (jL >>> 1));
            default:
                itt0.k("There is no way to get here, but the compiler thinks otherwise.");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    public static void j(eov0 eov0Var, Object obj) {
        obj.getClass();
        boolean z = true;
        boolean z2 = false;
        switch (eov0Var.f8155a) {
            case INT:
                z2 = obj instanceof Integer;
                break;
            case LONG:
                z2 = obj instanceof Long;
                break;
            case FLOAT:
                z2 = obj instanceof Float;
                break;
            case DOUBLE:
                z2 = obj instanceof Double;
                break;
            case BOOLEAN:
                z2 = obj instanceof Boolean;
                break;
            case STRING:
                z2 = obj instanceof String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof pg9) && !(obj instanceof byte[])) {
                    z = false;
                }
                z2 = z;
                break;
            case ENUM:
                if (!(obj instanceof Integer) && !(obj instanceof vlx)) {
                    z = false;
                }
                z2 = z;
                break;
            case MESSAGE:
                z2 = obj instanceof z3;
                break;
        }
        if (z2) {
            return;
        }
        jf4.o("Wrong object type used with protocol message reflection.");
    }

    public static void k(tyc tycVar, eov0 eov0Var, Object obj) throws IOException {
        switch (eov0Var.ordinal()) {
            case 0:
                double dDoubleValue = ((Double) obj).doubleValue();
                tycVar.getClass();
                tycVar.r0(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                tycVar.getClass();
                tycVar.q0(Float.floatToRawIntBits(fFloatValue));
                break;
            case 2:
                tycVar.t0(((Long) obj).longValue());
                break;
            case 3:
                tycVar.t0(((Long) obj).longValue());
                break;
            case 4:
                tycVar.k0(((Integer) obj).intValue());
                break;
            case 5:
                tycVar.r0(((Long) obj).longValue());
                break;
            case 6:
                tycVar.q0(((Integer) obj).intValue());
                break;
            case 7:
                tycVar.n0(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 8:
                tycVar.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                tycVar.s0(bytes.length);
                tycVar.p0(bytes);
                break;
            case 9:
                tycVar.getClass();
                ((z3) obj).g(tycVar);
                break;
            case 10:
                tycVar.m0((z3) obj);
                break;
            case 11:
                if (!(obj instanceof pg9)) {
                    byte[] bArr = (byte[]) obj;
                    tycVar.getClass();
                    tycVar.s0(bArr.length);
                    tycVar.p0(bArr);
                } else {
                    pg9 pg9Var = (pg9) obj;
                    tycVar.getClass();
                    tycVar.s0(pg9Var.size());
                    tycVar.o0(pg9Var);
                }
                break;
            case 12:
                tycVar.s0(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof vlx)) {
                    tycVar.k0(((Integer) obj).intValue());
                } else {
                    tycVar.k0(((vlx) obj).a());
                }
                break;
            case 14:
                tycVar.q0(((Integer) obj).intValue());
                break;
            case 15:
                tycVar.r0(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                tycVar.s0((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                tycVar.t0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a(hjt hjtVar, Object obj) {
        List arrayList;
        if (!hjtVar.c) {
            jf4.o("addRepeatedField() can only be called on repeated fields.");
            return;
        }
        j(hjtVar.b, obj);
        oak0 oak0Var = this.f8293a;
        Object obj2 = oak0Var.get(hjtVar);
        if (obj2 == null) {
            arrayList = new ArrayList();
            oak0Var.put(hjtVar, arrayList);
        } else {
            arrayList = (List) obj2;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final erp clone() {
        oak0 oak0Var;
        erp erpVar = new erp();
        int i = 0;
        while (true) {
            oak0Var = this.f8293a;
            if (i >= oak0Var.b.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) oak0Var.b.get(i);
            erpVar.i((hjt) entry.getKey(), entry.getValue());
            i++;
        }
        for (Map.Entry entry2 : oak0Var.c()) {
            erpVar.i((hjt) entry2.getKey(), entry2.getValue());
        }
        return erpVar;
    }

    public final void f() {
        if (this.b) {
            return;
        }
        oak0 oak0Var = this.f8293a;
        if (!oak0Var.d) {
            for (int i = 0; i < oak0Var.b.size(); i++) {
                Map.Entry entry = (Map.Entry) oak0Var.b.get(i);
                if (((hjt) entry.getKey()).c) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : oak0Var.c()) {
                if (((hjt) entry2.getKey()).c) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!oak0Var.d) {
            oak0Var.c = oak0Var.c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(oak0Var.c);
            oak0Var.d = true;
        }
        this.b = true;
    }

    public final void g(Map.Entry entry) {
        hjt hjtVar = (hjt) entry.getKey();
        Object value = entry.getValue();
        boolean z = hjtVar.c;
        oak0 oak0Var = this.f8293a;
        if (z) {
            Object arrayList = oak0Var.get(hjtVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) arrayList;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            oak0Var.put(hjtVar, arrayList);
            return;
        }
        if (hjtVar.b.f8155a != hov0.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            oak0Var.put(hjtVar, value);
            return;
        }
        Object obj2 = oak0Var.get(hjtVar);
        if (obj2 != null) {
            oak0Var.put(hjtVar, ((z3) obj2).f().e((ljt) ((z3) value)).c());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        oak0Var.put(hjtVar, value);
    }

    public final void i(hjt hjtVar, Object obj) {
        boolean z = hjtVar.c;
        eov0 eov0Var = hjtVar.b;
        if (!z) {
            j(eov0Var, obj);
        } else {
            if (!(obj instanceof List)) {
                jf4.o("Wrong object type used with protocol message reflection.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j(eov0Var, it.next());
            }
            obj = arrayList;
        }
        this.f8293a.put(hjtVar, obj);
    }

    public erp() {
    }
}
