package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class ox3 extends nx3 {
    public static boolean b(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr.length == objArr2.length) {
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                Object obj2 = objArr2[i];
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!b((Object[]) obj, (Object[]) obj2)) {
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            }
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            }
                        } else if ((obj instanceof q1t0) && (obj2 instanceof q1t0)) {
                            if (!Arrays.equals(((q1t0) obj).f27971a, ((q1t0) obj2).f27971a)) {
                            }
                        } else if ((obj instanceof r2t0) && (obj2 instanceof r2t0)) {
                            if (!Arrays.equals(((r2t0) obj).f29754a, ((r2t0) obj2).f29754a)) {
                            }
                        } else if ((obj instanceof c2t0) && (obj2 instanceof c2t0)) {
                            if (!Arrays.equals(((c2t0) obj).f3642a, ((c2t0) obj2).f3642a)) {
                            }
                        } else if ((obj instanceof i2t0) && (obj2 instanceof i2t0)) {
                            if (!Arrays.equals(((i2t0) obj).f14069a, ((i2t0) obj2).f14069a)) {
                            }
                        } else if (!obj.equals(obj2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
