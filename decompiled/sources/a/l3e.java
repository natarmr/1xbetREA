package a;

import android.util.Log;
import com.appsflyer.share.attribution.RequestError;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class l3e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f19353a;
    public int[] b;
    public int c;
    public int[] d;
    public float[] e;
    public int f;
    public int[] g;
    public String[] h;
    public int i;
    public int[] j;
    public boolean[] k;
    public int l;

    public final void a(float f, int i) {
        int i2 = this.f;
        int[] iArr = this.d;
        if (i2 >= iArr.length) {
            this.d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.e;
            this.e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.d;
        int i3 = this.f;
        iArr2[i3] = i;
        float[] fArr2 = this.e;
        this.f = i3 + 1;
        fArr2[i3] = f;
    }

    public final void b(int i, int i2) {
        int i3 = this.c;
        int[] iArr = this.f19353a;
        if (i3 >= iArr.length) {
            this.f19353a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.b;
            this.b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f19353a;
        int i4 = this.c;
        iArr3[i4] = i;
        int[] iArr4 = this.b;
        this.c = i4 + 1;
        iArr4[i4] = i2;
    }

    public final void c(int i, String str) {
        int i2 = this.i;
        int[] iArr = this.g;
        if (i2 >= iArr.length) {
            this.g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.h;
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.g;
        int i3 = this.i;
        iArr2[i3] = i;
        String[] strArr2 = this.h;
        this.i = i3 + 1;
        strArr2[i3] = str;
    }

    public final void d(int i, boolean z) {
        int i2 = this.l;
        int[] iArr = this.j;
        if (i2 >= iArr.length) {
            this.j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.k;
            this.k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.j;
        int i3 = this.l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.k;
        this.l = i3 + 1;
        zArr2[i3] = z;
    }

    public final void e(m3e m3eVar) {
        for (int i = 0; i < this.c; i++) {
            int i2 = this.f19353a[i];
            int i3 = this.b[i];
            if (i2 == 6) {
                m3eVar.e.D = i3;
            } else if (i2 == 7) {
                m3eVar.e.E = i3;
            } else if (i2 == 8) {
                m3eVar.e.K = i3;
            } else if (i2 == 27) {
                m3eVar.e.F = i3;
            } else if (i2 == 28) {
                m3eVar.e.H = i3;
            } else if (i2 == 41) {
                m3eVar.e.W = i3;
            } else if (i2 == 42) {
                m3eVar.e.X = i3;
            } else if (i2 == 61) {
                m3eVar.e.A = i3;
            } else if (i2 == 62) {
                m3eVar.e.B = i3;
            } else if (i2 == 72) {
                m3eVar.e.g0 = i3;
            } else if (i2 == 73) {
                m3eVar.e.h0 = i3;
            } else if (i2 == 2) {
                m3eVar.e.J = i3;
            } else if (i2 == 31) {
                m3eVar.e.L = i3;
            } else if (i2 == 34) {
                m3eVar.e.I = i3;
            } else if (i2 == 38) {
                m3eVar.f21110a = i3;
            } else if (i2 == 64) {
                m3eVar.d.b = i3;
            } else if (i2 == 66) {
                m3eVar.d.f = i3;
            } else if (i2 == 76) {
                m3eVar.d.e = i3;
            } else if (i2 == 78) {
                m3eVar.c.c = i3;
            } else if (i2 == 97) {
                m3eVar.e.p0 = i3;
            } else if (i2 == 93) {
                m3eVar.e.M = i3;
            } else if (i2 != 94) {
                switch (i2) {
                    case 11:
                        m3eVar.e.Q = i3;
                        break;
                    case 12:
                        m3eVar.e.R = i3;
                        break;
                    case 13:
                        m3eVar.e.N = i3;
                        break;
                    case 14:
                        m3eVar.e.P = i3;
                        break;
                    case 15:
                        m3eVar.e.S = i3;
                        break;
                    case 16:
                        m3eVar.e.O = i3;
                        break;
                    case 17:
                        m3eVar.e.e = i3;
                        break;
                    case 18:
                        m3eVar.e.f = i3;
                        break;
                    default:
                        switch (i2) {
                            case 21:
                                m3eVar.e.d = i3;
                                break;
                            case 22:
                                m3eVar.c.b = i3;
                                break;
                            case 23:
                                m3eVar.e.c = i3;
                                break;
                            case 24:
                                m3eVar.e.G = i3;
                                break;
                            default:
                                switch (i2) {
                                    case 54:
                                        m3eVar.e.Y = i3;
                                        break;
                                    case 55:
                                        m3eVar.e.Z = i3;
                                        break;
                                    case 56:
                                        m3eVar.e.a0 = i3;
                                        break;
                                    case 57:
                                        m3eVar.e.b0 = i3;
                                        break;
                                    case 58:
                                        m3eVar.e.c0 = i3;
                                        break;
                                    case 59:
                                        m3eVar.e.d0 = i3;
                                        break;
                                    default:
                                        switch (i2) {
                                            case 82:
                                                m3eVar.d.c = i3;
                                                break;
                                            case 83:
                                                m3eVar.f.i = i3;
                                                break;
                                            case 84:
                                                m3eVar.d.j = i3;
                                                break;
                                            default:
                                                switch (i2) {
                                                    case 87:
                                                        break;
                                                    case 88:
                                                        m3eVar.d.l = i3;
                                                        break;
                                                    case 89:
                                                        m3eVar.d.m = i3;
                                                        break;
                                                    default:
                                                        Log.w("ConstraintSet", "Unknown attribute 0x");
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                m3eVar.e.T = i3;
            }
        }
        for (int i4 = 0; i4 < this.f; i4++) {
            int i5 = this.d[i4];
            float f = this.e[i4];
            if (i5 == 19) {
                m3eVar.e.g = f;
            } else if (i5 == 20) {
                m3eVar.e.x = f;
            } else if (i5 == 37) {
                m3eVar.e.y = f;
            } else if (i5 == 60) {
                m3eVar.f.b = f;
            } else if (i5 == 63) {
                m3eVar.e.C = f;
            } else if (i5 == 79) {
                m3eVar.d.g = f;
            } else if (i5 == 85) {
                m3eVar.d.i = f;
            } else if (i5 != 87) {
                if (i5 == 39) {
                    m3eVar.e.V = f;
                } else if (i5 != 40) {
                    switch (i5) {
                        case 43:
                            m3eVar.c.d = f;
                            break;
                        case 44:
                            q3e q3eVar = m3eVar.f;
                            q3eVar.n = f;
                            q3eVar.m = true;
                            break;
                        case 45:
                            m3eVar.f.c = f;
                            break;
                        case 46:
                            m3eVar.f.d = f;
                            break;
                        case 47:
                            m3eVar.f.e = f;
                            break;
                        case 48:
                            m3eVar.f.f = f;
                            break;
                        case 49:
                            m3eVar.f.g = f;
                            break;
                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                            m3eVar.f.h = f;
                            break;
                        case 51:
                            m3eVar.f.j = f;
                            break;
                        case 52:
                            m3eVar.f.k = f;
                            break;
                        case 53:
                            m3eVar.f.l = f;
                            break;
                        default:
                            switch (i5) {
                                case 67:
                                    m3eVar.d.h = f;
                                    break;
                                case 68:
                                    m3eVar.c.e = f;
                                    break;
                                case 69:
                                    m3eVar.e.e0 = f;
                                    break;
                                case 70:
                                    m3eVar.e.f0 = f;
                                    break;
                                default:
                                    Log.w("ConstraintSet", "Unknown attribute 0x");
                                    break;
                            }
                            break;
                    }
                } else {
                    m3eVar.e.U = f;
                }
            }
        }
        for (int i6 = 0; i6 < this.i; i6++) {
            int i7 = this.g[i6];
            String str = this.h[i6];
            if (i7 == 5) {
                m3eVar.e.z = str;
            } else if (i7 == 65) {
                m3eVar.d.d = str;
            } else if (i7 == 74) {
                n3e n3eVar = m3eVar.e;
                n3eVar.k0 = str;
                n3eVar.j0 = null;
            } else if (i7 == 77) {
                m3eVar.e.l0 = str;
            } else if (i7 != 87) {
                if (i7 != 90) {
                    Log.w("ConstraintSet", "Unknown attribute 0x");
                } else {
                    m3eVar.d.k = str;
                }
            }
        }
        for (int i8 = 0; i8 < this.l; i8++) {
            int i9 = this.j[i8];
            boolean z = this.k[i8];
            if (i9 == 44) {
                m3eVar.f.m = z;
            } else if (i9 == 75) {
                m3eVar.e.o0 = z;
            } else if (i9 != 87) {
                if (i9 == 80) {
                    m3eVar.e.m0 = z;
                } else if (i9 != 81) {
                    Log.w("ConstraintSet", "Unknown attribute 0x");
                } else {
                    m3eVar.e.n0 = z;
                }
            }
        }
    }
}
