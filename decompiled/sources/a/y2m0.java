package a;

import android.util.Size;
import java.util.Calendar;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class y2m0 implements kotlin.coroutines.f {
    public static y2m0 b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41912a;

    public y2m0(xjj0 xjj0Var) {
        this.f41912a = (byte) 19;
        ((v6j0) xjj0Var.f40988a).getClass();
    }

    public static wln0 a(vln0 vln0Var, tln0 tln0Var, urm0 urm0Var) {
        tln0Var.getClass();
        urm0Var.getClass();
        return new wln0(vln0Var, tln0Var, urm0Var);
    }

    public static long c() {
        return Calendar.getInstance().getTimeInMillis();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e8  */
    public static wln0 d(int i, Size size, m55 m55Var, int i2, uln0 uln0Var, urm0 urm0Var) {
        LinkedHashMap linkedHashMap = m55Var.f;
        size.getClass();
        uln0Var.getClass();
        urm0Var.getClass();
        vln0 vln0Var = (vln0) wln0.h.get(Integer.valueOf(i));
        if (vln0Var == null) {
            vln0Var = vln0.f37634a;
        }
        tln0 tln0Var = tln0.NOT_SUPPORT;
        Size size2 = v7k0.f36930a;
        int height = size.getHeight() * size.getWidth();
        if (i2 == 1) {
            if (height <= v7k0.a((Size) m55Var.b.get(Integer.valueOf(i)))) {
                tln0Var = tln0.S720P_16_9;
            } else if (height <= v7k0.a((Size) m55Var.d.get(Integer.valueOf(i)))) {
                tln0Var = tln0.S1440P_4_3;
            }
        } else if (uln0Var == uln0.f35881a) {
            Size size3 = (Size) linkedHashMap.get(Integer.valueOf(i));
            for (tln0 tln0Var2 : wln0.f) {
                if (size.equals(tln0Var2.b)) {
                    tln0Var = tln0Var2;
                    break;
                }
            }
            if (tln0Var == tln0.NOT_SUPPORT && size.equals(size3)) {
                tln0Var = tln0.MAXIMUM;
            }
        } else {
            Size size4 = m55Var.f21204a;
            if (height <= size4.getHeight() * size4.getWidth()) {
                tln0Var = tln0.VGA;
            } else if (height <= v7k0.a(m55Var.c)) {
                tln0Var = tln0.PREVIEW;
            } else {
                Size size5 = m55Var.e;
                if (height <= size5.getHeight() * size5.getWidth()) {
                    tln0Var = tln0.RECORD;
                } else {
                    Size size6 = (Size) linkedHashMap.get(Integer.valueOf(i));
                    Size size7 = (Size) m55Var.i.get(Integer.valueOf(i));
                    if (size6 != null) {
                        if (height <= size6.getHeight() * size6.getWidth()) {
                            if (i2 != 2) {
                                tln0Var = tln0.MAXIMUM;
                            } else if (size7 != null) {
                                if (height <= size7.getHeight() * size7.getWidth()) {
                                    tln0Var = tln0.ULTRA_MAXIMUM;
                                }
                            }
                        } else if (size7 != null) {
                            if (height <= size7.getHeight() * size7.getWidth()) {
                                tln0Var = tln0.ULTRA_MAXIMUM;
                            }
                        }
                    } else if (i2 != 2) {
                        tln0Var = tln0.MAXIMUM;
                    } else if (size7 != null) {
                        if (height <= size7.getHeight() * size7.getWidth()) {
                            tln0Var = tln0.ULTRA_MAXIMUM;
                        }
                    }
                }
            }
        }
        return a(vln0Var, tln0Var, urm0Var);
    }

    public String toString() {
        switch (this.f41912a) {
            case 4:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ y2m0(byte b2) {
        this.f41912a = b2;
    }
}
