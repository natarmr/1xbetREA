package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class n3e {
    public static final SparseIntArray q0;
    public int A;
    public int B;
    public float C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public float U;
    public float V;
    public int W;
    public int X;
    public int Y;
    public int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f22844a;
    public int a0;
    public boolean b;
    public int b0;
    public int c;
    public int c0;
    public int d;
    public int d0;
    public int e;
    public float e0;
    public int f;
    public float f0;
    public float g;
    public int g0;
    public boolean h;
    public int h0;
    public int i;
    public int i0;
    public int j;
    public int[] j0;
    public int k;
    public String k0;
    public int l;
    public String l0;
    public int m;
    public boolean m0;
    public int n;
    public boolean n0;
    public int o;
    public boolean o0;
    public int p;
    public int p0;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public float x;
    public float y;
    public String z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        q0 = sparseIntArray;
        sparseIntArray.append(43, 24);
        sparseIntArray.append(44, 25);
        sparseIntArray.append(46, 28);
        sparseIntArray.append(47, 29);
        sparseIntArray.append(52, 35);
        sparseIntArray.append(51, 34);
        sparseIntArray.append(24, 4);
        sparseIntArray.append(23, 3);
        sparseIntArray.append(19, 1);
        sparseIntArray.append(61, 6);
        sparseIntArray.append(62, 7);
        sparseIntArray.append(31, 17);
        sparseIntArray.append(32, 18);
        sparseIntArray.append(33, 19);
        sparseIntArray.append(15, 90);
        sparseIntArray.append(0, 26);
        sparseIntArray.append(48, 31);
        sparseIntArray.append(49, 32);
        sparseIntArray.append(30, 10);
        sparseIntArray.append(29, 9);
        sparseIntArray.append(66, 13);
        sparseIntArray.append(69, 16);
        sparseIntArray.append(67, 14);
        sparseIntArray.append(64, 11);
        sparseIntArray.append(68, 15);
        sparseIntArray.append(65, 12);
        sparseIntArray.append(55, 38);
        sparseIntArray.append(41, 37);
        sparseIntArray.append(40, 39);
        sparseIntArray.append(54, 40);
        sparseIntArray.append(39, 20);
        sparseIntArray.append(53, 36);
        sparseIntArray.append(28, 5);
        sparseIntArray.append(42, 91);
        sparseIntArray.append(50, 91);
        sparseIntArray.append(45, 91);
        sparseIntArray.append(22, 91);
        sparseIntArray.append(18, 91);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(5, 27);
        sparseIntArray.append(7, 30);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(4, 33);
        sparseIntArray.append(6, 2);
        sparseIntArray.append(1, 22);
        sparseIntArray.append(2, 21);
        sparseIntArray.append(56, 41);
        sparseIntArray.append(34, 42);
        sparseIntArray.append(17, 87);
        sparseIntArray.append(16, 88);
        sparseIntArray.append(71, 76);
        sparseIntArray.append(25, 61);
        sparseIntArray.append(27, 62);
        sparseIntArray.append(26, 63);
        sparseIntArray.append(60, 69);
        sparseIntArray.append(38, 70);
        sparseIntArray.append(12, 71);
        sparseIntArray.append(10, 72);
        sparseIntArray.append(11, 73);
        sparseIntArray.append(13, 74);
        sparseIntArray.append(9, 75);
        sparseIntArray.append(58, 84);
        sparseIntArray.append(59, 86);
        sparseIntArray.append(58, 83);
        sparseIntArray.append(37, 85);
        sparseIntArray.append(56, 87);
        sparseIntArray.append(34, 88);
        sparseIntArray.append(91, 89);
        sparseIntArray.append(15, 90);
    }

    public final void a(n3e n3eVar) {
        this.f22844a = n3eVar.f22844a;
        this.c = n3eVar.c;
        this.b = n3eVar.b;
        this.d = n3eVar.d;
        this.e = n3eVar.e;
        this.f = n3eVar.f;
        this.g = n3eVar.g;
        this.h = n3eVar.h;
        this.i = n3eVar.i;
        this.j = n3eVar.j;
        this.k = n3eVar.k;
        this.l = n3eVar.l;
        this.m = n3eVar.m;
        this.n = n3eVar.n;
        this.o = n3eVar.o;
        this.p = n3eVar.p;
        this.q = n3eVar.q;
        this.r = n3eVar.r;
        this.s = n3eVar.s;
        this.t = n3eVar.t;
        this.u = n3eVar.u;
        this.v = n3eVar.v;
        this.w = n3eVar.w;
        this.x = n3eVar.x;
        this.y = n3eVar.y;
        this.z = n3eVar.z;
        this.A = n3eVar.A;
        this.B = n3eVar.B;
        this.C = n3eVar.C;
        this.D = n3eVar.D;
        this.E = n3eVar.E;
        this.F = n3eVar.F;
        this.G = n3eVar.G;
        this.H = n3eVar.H;
        this.I = n3eVar.I;
        this.J = n3eVar.J;
        this.K = n3eVar.K;
        this.L = n3eVar.L;
        this.M = n3eVar.M;
        this.N = n3eVar.N;
        this.O = n3eVar.O;
        this.P = n3eVar.P;
        this.Q = n3eVar.Q;
        this.R = n3eVar.R;
        this.S = n3eVar.S;
        this.T = n3eVar.T;
        this.U = n3eVar.U;
        this.V = n3eVar.V;
        this.W = n3eVar.W;
        this.X = n3eVar.X;
        this.Y = n3eVar.Y;
        this.Z = n3eVar.Z;
        this.a0 = n3eVar.a0;
        this.b0 = n3eVar.b0;
        this.c0 = n3eVar.c0;
        this.d0 = n3eVar.d0;
        this.e0 = n3eVar.e0;
        this.f0 = n3eVar.f0;
        this.g0 = n3eVar.g0;
        this.h0 = n3eVar.h0;
        this.i0 = n3eVar.i0;
        this.l0 = n3eVar.l0;
        int[] iArr = n3eVar.j0;
        if (iArr == null || n3eVar.k0 != null) {
            this.j0 = null;
        } else {
            this.j0 = Arrays.copyOf(iArr, iArr.length);
        }
        this.k0 = n3eVar.k0;
        this.m0 = n3eVar.m0;
        this.n0 = n3eVar.n0;
        this.o0 = n3eVar.o0;
        this.p0 = n3eVar.p0;
    }

    public final void b(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fqd0.k);
        this.b = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray = q0;
            int i2 = sparseIntArray.get(index);
            switch (i2) {
                case 1:
                    this.q = r3e.l(typedArrayObtainStyledAttributes, index, this.q);
                    break;
                case 2:
                    this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                    break;
                case 3:
                    this.p = r3e.l(typedArrayObtainStyledAttributes, index, this.p);
                    break;
                case 4:
                    this.o = r3e.l(typedArrayObtainStyledAttributes, index, this.o);
                    break;
                case 5:
                    this.z = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 6:
                    this.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                    break;
                case 7:
                    this.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                    break;
                case 8:
                    this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                    break;
                case 9:
                    this.w = r3e.l(typedArrayObtainStyledAttributes, index, this.w);
                    break;
                case 10:
                    this.v = r3e.l(typedArrayObtainStyledAttributes, index, this.v);
                    break;
                case 11:
                    this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                    break;
                case 12:
                    this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                    break;
                case 13:
                    this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                    break;
                case 14:
                    this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                    break;
                case 15:
                    this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                    break;
                case 16:
                    this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                    break;
                case 17:
                    this.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                    break;
                case 18:
                    this.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    this.g = typedArrayObtainStyledAttributes.getFloat(index, this.g);
                    break;
                case 20:
                    this.x = typedArrayObtainStyledAttributes.getFloat(index, this.x);
                    break;
                case 21:
                    this.d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.d);
                    break;
                case 22:
                    this.c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.c);
                    break;
                case 23:
                    this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.G);
                    break;
                case 24:
                    this.i = r3e.l(typedArrayObtainStyledAttributes, index, this.i);
                    break;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                    this.j = r3e.l(typedArrayObtainStyledAttributes, index, this.j);
                    break;
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                    this.F = typedArrayObtainStyledAttributes.getInt(index, this.F);
                    break;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    this.k = r3e.l(typedArrayObtainStyledAttributes, index, this.k);
                    break;
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                    this.l = r3e.l(typedArrayObtainStyledAttributes, index, this.l);
                    break;
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                    this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                    break;
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                    this.t = r3e.l(typedArrayObtainStyledAttributes, index, this.t);
                    break;
                case 32:
                    this.u = r3e.l(typedArrayObtainStyledAttributes, index, this.u);
                    break;
                case 33:
                    this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                    break;
                case 34:
                    this.n = r3e.l(typedArrayObtainStyledAttributes, index, this.n);
                    break;
                case 35:
                    this.m = r3e.l(typedArrayObtainStyledAttributes, index, this.m);
                    break;
                case 36:
                    this.y = typedArrayObtainStyledAttributes.getFloat(index, this.y);
                    break;
                case 37:
                    this.V = typedArrayObtainStyledAttributes.getFloat(index, this.V);
                    break;
                case 38:
                    this.U = typedArrayObtainStyledAttributes.getFloat(index, this.U);
                    break;
                case 39:
                    this.W = typedArrayObtainStyledAttributes.getInt(index, this.W);
                    break;
                case 40:
                    this.X = typedArrayObtainStyledAttributes.getInt(index, this.X);
                    break;
                case 41:
                    r3e.m(this, typedArrayObtainStyledAttributes, index, 0);
                    break;
                case 42:
                    r3e.m(this, typedArrayObtainStyledAttributes, index, 1);
                    break;
                default:
                    switch (i2) {
                        case 61:
                            this.A = r3e.l(typedArrayObtainStyledAttributes, index, this.A);
                            break;
                        case 62:
                            this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.B);
                            break;
                        case 63:
                            this.C = typedArrayObtainStyledAttributes.getFloat(index, this.C);
                            break;
                        default:
                            switch (i2) {
                                case 69:
                                    this.e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 70:
                                    this.f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 71:
                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    break;
                                case 72:
                                    this.g0 = typedArrayObtainStyledAttributes.getInt(index, this.g0);
                                    break;
                                case 73:
                                    this.h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.h0);
                                    break;
                                case 74:
                                    this.k0 = typedArrayObtainStyledAttributes.getString(index);
                                    break;
                                case 75:
                                    this.o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.o0);
                                    break;
                                case 76:
                                    this.p0 = typedArrayObtainStyledAttributes.getInt(index, this.p0);
                                    break;
                                case 77:
                                    this.r = r3e.l(typedArrayObtainStyledAttributes, index, this.r);
                                    break;
                                case 78:
                                    this.s = r3e.l(typedArrayObtainStyledAttributes, index, this.s);
                                    break;
                                case 79:
                                    this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                                    break;
                                case 80:
                                    this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                                    break;
                                case 81:
                                    this.Y = typedArrayObtainStyledAttributes.getInt(index, this.Y);
                                    break;
                                case 82:
                                    this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                                    break;
                                case 83:
                                    this.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                    break;
                                case 84:
                                    this.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.a0);
                                    break;
                                case 85:
                                    this.d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.d0);
                                    break;
                                case 86:
                                    this.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                    break;
                                case 87:
                                    this.m0 = typedArrayObtainStyledAttributes.getBoolean(index, this.m0);
                                    break;
                                case 88:
                                    this.n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.n0);
                                    break;
                                case 89:
                                    this.l0 = typedArrayObtainStyledAttributes.getString(index);
                                    break;
                                case SubsamplingScaleImageView.ORIENTATION_90 /* 90 */:
                                    this.h = typedArrayObtainStyledAttributes.getBoolean(index, this.h);
                                    break;
                                case 91:
                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    break;
                                default:
                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
