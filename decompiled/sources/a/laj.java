package a;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class laj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f19707a;

    public laj(byte b) {
        switch (b) {
            case 1:
                this.f19707a = new LinkedHashMap();
                break;
            case 2:
                this.f19707a = new LinkedHashMap();
                break;
            default:
                this.f19707a = new LinkedHashMap();
                break;
        }
    }

    public maj a() {
        maj majVar = new maj(this.f19707a);
        nkb.I(majVar);
        return majVar;
    }

    public void b(Object obj, String str) {
        Object[] objArr;
        str.getClass();
        if (obj == null) {
            obj = null;
        } else {
            Class<?> cls = obj.getClass();
            tre0 tre0Var = sre0.f32672a;
            sgy sgyVarB = tre0Var.b(cls);
            if (!sgyVarB.equals(tre0Var.b(Boolean.TYPE)) && !sgyVarB.equals(tre0Var.b(Byte.TYPE)) && !sgyVarB.equals(tre0Var.b(Integer.TYPE)) && !sgyVarB.equals(tre0Var.b(Long.TYPE)) && !sgyVarB.equals(tre0Var.b(Float.TYPE)) && !sgyVarB.equals(tre0Var.b(Double.TYPE)) && !sgyVarB.equals(tre0Var.b(String.class)) && !sgyVarB.equals(tre0Var.b(Boolean[].class)) && !sgyVarB.equals(tre0Var.b(Byte[].class)) && !sgyVarB.equals(tre0Var.b(Integer[].class)) && !sgyVarB.equals(tre0Var.b(Long[].class)) && !sgyVarB.equals(tre0Var.b(Float[].class)) && !sgyVarB.equals(tre0Var.b(Double[].class)) && !sgyVarB.equals(tre0Var.b(String[].class))) {
                int i = 0;
                if (sgyVarB.equals(tre0Var.b(boolean[].class))) {
                    boolean[] zArr = (boolean[]) obj;
                    String str2 = qcj.f28485a;
                    int length = zArr.length;
                    objArr = new Boolean[length];
                    while (i < length) {
                        objArr[i] = Boolean.valueOf(zArr[i]);
                        i++;
                    }
                } else if (sgyVarB.equals(tre0Var.b(byte[].class))) {
                    byte[] bArr = (byte[]) obj;
                    String str3 = qcj.f28485a;
                    int length2 = bArr.length;
                    objArr = new Byte[length2];
                    while (i < length2) {
                        objArr[i] = Byte.valueOf(bArr[i]);
                        i++;
                    }
                } else if (sgyVarB.equals(tre0Var.b(int[].class))) {
                    int[] iArr = (int[]) obj;
                    String str4 = qcj.f28485a;
                    int length3 = iArr.length;
                    objArr = new Integer[length3];
                    while (i < length3) {
                        objArr[i] = Integer.valueOf(iArr[i]);
                        i++;
                    }
                } else if (sgyVarB.equals(tre0Var.b(long[].class))) {
                    long[] jArr = (long[]) obj;
                    String str5 = qcj.f28485a;
                    int length4 = jArr.length;
                    objArr = new Long[length4];
                    while (i < length4) {
                        objArr[i] = Long.valueOf(jArr[i]);
                        i++;
                    }
                } else if (sgyVarB.equals(tre0Var.b(float[].class))) {
                    float[] fArr = (float[]) obj;
                    String str6 = qcj.f28485a;
                    int length5 = fArr.length;
                    objArr = new Float[length5];
                    while (i < length5) {
                        objArr[i] = Float.valueOf(fArr[i]);
                        i++;
                    }
                } else {
                    if (!sgyVarB.equals(tre0Var.b(double[].class))) {
                        itt0.l("Key ", str, " has invalid type ", sgyVarB);
                        return;
                    }
                    double[] dArr = (double[]) obj;
                    String str7 = qcj.f28485a;
                    int length6 = dArr.length;
                    objArr = new Double[length6];
                    while (i < length6) {
                        objArr[i] = Double.valueOf(dArr[i]);
                        i++;
                    }
                }
                obj = objArr;
            }
        }
        this.f19707a.put(str, obj);
    }

    public void c(Map map) {
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            b(entry.getValue(), (String) entry.getKey());
        }
    }
}
