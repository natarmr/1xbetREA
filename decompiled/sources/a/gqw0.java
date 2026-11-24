package a;

import android.graphics.Bitmap;
import java.io.FileInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class gqw0 implements w58, b49, n1x, jgd, qsr, kotlin.coroutines.f, k3z, c6z, e5n0, l3u0, mhi0, q1o, qq8, eoc, kdk0 {
    public static final pge h1;
    public static final k080 w1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zx7 f11754a = new zx7(-1.0f, -1.0f);
    public static final zx7 b = new zx7(0.0f, -1.0f);
    public static final zx7 c = new zx7(1.0f, -1.0f);
    public static final zx7 d = new zx7(-1.0f, 0.0f);
    public static final zx7 e = new zx7(0.0f, 0.0f);
    public static final zx7 f = new zx7(1.0f, 0.0f);
    public static final zx7 g = new zx7(-1.0f, 1.0f);
    public static final zx7 h = new zx7(0.0f, 1.0f);
    public static final zx7 i = new zx7(1.0f, 1.0f);
    public static final yx7 j = new yx7(-1.0f);
    public static final yx7 k = new yx7(0.0f);
    public static final yx7 l = new yx7(1.0f);
    public static final xx7 m = new xx7(-1.0f);
    public static final xx7 n = new xx7(0.0f);
    public static final xx7 o = new xx7(1.0f);
    public static final gqw0 p = new gqw0();
    public static final gqw0 q = new gqw0();
    public static final gqw0 r = new gqw0();
    public static final c99 s = new c99((byte) 8);
    public static final /* synthetic */ gqw0 t = new gqw0();
    public static final a7d u = new a7d(18);
    public static final shd v = new shd(10);
    public static final shd w = new shd(11);
    public static final shd x = new shd(12);
    public static final shd y = new shd(13);
    public static final y2d z = new y2d(14);
    public static final pge A = new pge(0);
    public static final pge B = new pge(4);
    public static final pge Y = new pge(2);
    public static final pge Z = new pge(3);
    public static final pge f1 = new pge(5);
    public static final oiq g1 = new oiq();
    public static final gqw0 i1 = new gqw0();
    public static final gqw0 j1 = new gqw0();
    public static final gqw0 k1 = new gqw0();
    public static final gqw0 l1 = new gqw0();
    public static final gqw0 m1 = new gqw0();
    public static final /* synthetic */ gqw0 n1 = new gqw0();
    public static final /* synthetic */ gqw0 o1 = new gqw0();
    public static final gqw0 p1 = new gqw0();
    public static final gqw0 q1 = new gqw0();
    public static final gqw0 r1 = new gqw0();
    public static final gqw0 s1 = new gqw0();
    public static final gqw0 t1 = new gqw0();
    public static final gqw0 u1 = new gqw0();
    public static final gqw0 v1 = new gqw0();
    public static final k080 x1 = new k080(0);
    public static final gqw0 y1 = new gqw0();
    public static final gqw0 z1 = new gqw0();
    public static final gqw0 A1 = new gqw0();
    public static final gqw0 B1 = new gqw0();
    public static final gqw0 C1 = new gqw0();
    public static final gqw0 D1 = new gqw0();

    static {
        byte b2 = 1;
        h1 = new pge(b2);
        w1 = new k080(b2);
    }

    public static Date I0(String str, String str2) {
        Locale locale = Locale.getDefault();
        locale.getClass();
        TimeZone timeZone = TimeZone.getDefault();
        timeZone.getClass();
        str.getClass();
        Date date = new Date();
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, locale);
            simpleDateFormat.setTimeZone(timeZone);
            Date date2 = simpleDateFormat.parse(str);
            date2.getClass();
            return date2;
        } catch (ParseException e2) {
            e2.printStackTrace();
            return date;
        }
    }

    public static gmk0 N0(kp9 kp9Var) {
        while (kp9Var instanceof mp9) {
            mp9 mp9Var = (mp9) kp9Var;
            if (mp9Var.l() != 2) {
                break;
            }
            Collection collectionK = mp9Var.k();
            collectionK.getClass();
            kp9Var = (mp9) CollectionsKt.w0(collectionK);
            if (kp9Var == null) {
                return null;
            }
        }
        return kp9Var.b();
    }

    @Override // a.yzs0
    public faa A(dcg0 dcg0Var) {
        return rcb.W(this, M0(dcg0Var));
    }

    @Override // a.yzs0
    public /* bridge */ xnm0 A0(dcg0 dcg0Var) {
        return rcb.k1(this, dcg0Var);
    }

    @Override // a.yzs0
    public /* bridge */ boolean B(jys0 jys0Var) {
        return rcb.O0(jys0Var);
    }

    @Override // a.yzs0
    public /* bridge */ f0t0 B0(jzs0 jzs0Var) {
        return rcb.B0(jzs0Var);
    }

    @Override // a.yzs0
    public /* bridge */ jzs0 C(jys0 jys0Var) {
        return rcb.y0(jys0Var);
    }

    @Override // a.yzs0
    public /* bridge */ aty C0(zxs0 zxs0Var) {
        return rcb.x0(this, zxs0Var);
    }

    @Override // a.yzs0
    public /* bridge */ boolean D(jys0 jys0Var) {
        return rcb.H0(jys0Var);
    }

    @Override // a.eoc
    public /* bridge */ tft0 D0(mzj0 mzj0Var, mzj0 mzj0Var2) {
        return rcb.j0(this, mzj0Var, mzj0Var2);
    }

    @Override // a.yzs0
    public /* bridge */ zxs0 E(aty atyVar, int i2) {
        return rcb.n0(atyVar, i2);
    }

    @Override // a.q1o
    public void E0(mp9 mp9Var) {
        throw new IllegalStateException("Cannot infer visibility for " + mp9Var);
    }

    @Override // a.yzs0
    public /* bridge */ aty F(aty atyVar) {
        return rcb.q1(this, atyVar);
    }

    @Override // a.yzs0
    public boolean F0(aty atyVar) {
        atyVar.getClass();
        return !Intrinsics.d(rcb.o1(m0(atyVar)), rcb.o1(W(atyVar)));
    }

    @Override // a.mhi0
    public Object G() {
        return new az40(true);
    }

    public boolean G0(vjj vjjVar, vjj vjjVar2, boolean z2) {
        if ((vjjVar instanceof wm40) && (vjjVar2 instanceof wm40)) {
            return Intrinsics.d(((wm40) vjjVar).h(), ((wm40) vjjVar2).h());
        }
        if ((vjjVar instanceof hzs0) && (vjjVar2 instanceof hzs0)) {
            return H0((hzs0) vjjVar, (hzs0) vjjVar2, z2, x0.p);
        }
        if (!(vjjVar instanceof kp9) || !(vjjVar2 instanceof kp9)) {
            return ((vjjVar instanceof mg80) && (vjjVar2 instanceof mg80)) ? Intrinsics.d(((ng80) ((mg80) vjjVar)).f, ((ng80) ((mg80) vjjVar2)).f) : Intrinsics.d(vjjVar, vjjVar2);
        }
        kp9 kp9Var = (kp9) vjjVar;
        kp9 kp9Var2 = (kp9) vjjVar2;
        if (!kp9Var.equals(kp9Var2)) {
            if (Intrinsics.d(kp9Var.getName(), kp9Var2.getName()) && ((!(kp9Var instanceof sq30) || !(kp9Var2 instanceof sq30) || ((sq30) kp9Var).Q() == ((sq30) kp9Var2).Q()) && ((!Intrinsics.d(kp9Var.j(), kp9Var2.j()) || (z2 && Intrinsics.d(N0(kp9Var), N0(kp9Var2)))) && !oek.n(kp9Var) && !oek.n(kp9Var2)))) {
                vjj vjjVarJ = kp9Var.j();
                vjj vjjVarJ2 = kp9Var2.j();
                if (((vjjVarJ instanceof mp9) || (vjjVarJ2 instanceof mp9)) ? false : G0(vjjVarJ, vjjVarJ2, z2)) {
                    sf80 sf80Var = new sf80(new cgx0(z2, kp9Var, kp9Var2, (byte) 6));
                    if (sf80Var.m(kp9Var, kp9Var2, null, true).b() != 1 || sf80Var.m(kp9Var2, kp9Var, null, true).b() != 1) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // a.yzs0
    public /* bridge */ boolean H(aty atyVar) {
        return rcb.J0(atyVar);
    }

    public boolean H0(hzs0 hzs0Var, hzs0 hzs0Var2, boolean z2, Function2 function2) {
        if (hzs0Var.equals(hzs0Var2)) {
            return true;
        }
        if (Intrinsics.d(hzs0Var.j(), hzs0Var2.j())) {
            return false;
        }
        vjj vjjVarJ = hzs0Var.j();
        vjj vjjVarJ2 = hzs0Var2.j();
        return (((vjjVarJ instanceof mp9) || (vjjVarJ2 instanceof mp9)) ? ((Boolean) function2.invoke(vjjVarJ, vjjVarJ2)).booleanValue() : G0(vjjVarJ, vjjVarJ2, z2)) && hzs0Var.getIndex() == hzs0Var2.getIndex();
    }

    @Override // a.yzs0
    public /* bridge */ boolean I(jys0 jys0Var) {
        return rcb.G0(jys0Var);
    }

    @Override // a.yzs0
    public /* bridge */ boolean J(dcg0 dcg0Var, dcg0 dcg0Var2) {
        return rcb.E0(dcg0Var, dcg0Var2);
    }

    public zdx J0(androidx.media3.common.b bVar) {
        String str = bVar.p;
        if (str != null) {
            byte b2 = 1;
            byte b3 = 0;
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new hf3(b3);
                case "application/x-icy":
                    return new zww();
                case "application/id3":
                    return new exw(null);
                case "application/x-emsg":
                    return new hf3(b2);
                case "application/x-scte35":
                    return new szk0();
            }
        }
        jf4.o(kng0.k("Attempted to create decoder for unsupported MIME type: ", str));
        return null;
    }

    @Override // a.yzs0
    public /* bridge */ Collection K(dcg0 dcg0Var) {
        return rcb.e1(this, dcg0Var);
    }

    public aty K0(aty atyVar) {
        kzj0 kzj0VarR1;
        atyVar.getClass();
        kzj0 kzj0VarZ = rcb.Z(atyVar);
        return (kzj0VarZ == null || (kzj0VarR1 = rcb.r1(kzj0VarZ, true)) == null) ? atyVar : kzj0VarR1;
    }

    @Override // a.yzs0
    public /* bridge */ int L(aty atyVar) {
        return rcb.U(atyVar);
    }

    public gys0 L0() {
        return jcb.Y(false, this, null, 24);
    }

    @Override // a.yzs0
    public /* bridge */ boolean M(aty atyVar) {
        return rcb.P0(atyVar);
    }

    public mzj0 M0(dcg0 dcg0Var) {
        kzj0 kzj0Var;
        szj szjVarX = rcb.X(dcg0Var);
        return (szjVarX == null || (kzj0Var = szjVarX.b) == null) ? (mzj0) dcg0Var : kzj0Var;
    }

    @Override // a.yzs0
    public /* bridge */ jys0 N(dcg0 dcg0Var) {
        return rcb.o1(dcg0Var);
    }

    @Override // a.yzs0
    public /* bridge */ dcg0 O(dcg0 dcg0Var) {
        u9a u9aVar = u9a.f35274a;
        return rcb.g0(dcg0Var);
    }

    public boolean O0(androidx.media3.common.b bVar) {
        String str = bVar.p;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }

    @Override // a.yzs0
    public boolean P(aty atyVar) {
        atyVar.getClass();
        kzj0 kzj0VarZ = rcb.Z(atyVar);
        return (kzj0VarZ != null ? rcb.X(kzj0VarZ) : null) != null;
    }

    @Override // a.yzs0
    public /* bridge */ boolean Q(jys0 jys0Var, jys0 jys0Var2) {
        return rcb.T(jys0Var, jys0Var2);
    }

    @Override // a.yzs0
    public boolean R(dcg0 dcg0Var) {
        return rcb.L0(rcb.o1(dcg0Var));
    }

    @Override // a.yzs0
    public /* bridge */ nkq S(aty atyVar) {
        return rcb.Y(atyVar);
    }

    @Override // a.yzs0
    public zxs0 T(yxs0 yxs0Var, int i2) {
        yxs0Var.getClass();
        if (yxs0Var instanceof mzj0) {
            return rcb.n0((aty) yxs0Var, i2);
        }
        if (yxs0Var instanceof kw3) {
            E e2 = ((kw3) yxs0Var).get(i2);
            e2.getClass();
            return (zxs0) e2;
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(yxs0Var);
        e9d0.n(sb, sre0.f32672a.b(yxs0Var.getClass()));
        return null;
    }

    @Override // a.yzs0
    public boolean U(aty atyVar) {
        atyVar.getClass();
        return rcb.N0(m0(atyVar)) != rcb.N0(W(atyVar));
    }

    @Override // a.yzs0
    public /* bridge */ zxs0 V(eaa eaaVar) {
        return rcb.f1(eaaVar);
    }

    @Override // a.yzs0
    public dcg0 W(aty atyVar) {
        kzj0 kzj0VarP1;
        atyVar.getClass();
        kkq kkqVarY = rcb.Y(atyVar);
        if (kkqVarY != null && (kzj0VarP1 = rcb.p1(kkqVarY)) != null) {
            return kzj0VarP1;
        }
        kzj0 kzj0VarZ = rcb.Z(atyVar);
        kzj0VarZ.getClass();
        return kzj0VarZ;
    }

    @Override // a.yzs0
    public /* bridge */ faa X(mzj0 mzj0Var) {
        return rcb.W(this, mzj0Var);
    }

    @Override // a.yzs0
    public /* bridge */ boolean Y(jys0 jys0Var) {
        return rcb.M0(jys0Var);
    }

    @Override // a.yzs0
    public void Z(aty atyVar) {
        atyVar.getClass();
        rcb.Y(atyVar);
    }

    @Override // a.yzs0
    public /* bridge */ dcg0 a(aty atyVar) {
        return rcb.Z(atyVar);
    }

    @Override // a.yzs0
    public zxs0 a0(dcg0 dcg0Var, int i2) {
        if (i2 < 0 || i2 >= rcb.U(dcg0Var)) {
            return null;
        }
        return rcb.n0(dcg0Var, i2);
    }

    @Override // a.c6z
    public Object b(dfv dfvVar, yje yjeVar) {
        return Bitmap.createBitmap(new f6z(dfvVar));
    }

    @Override // a.mhi0
    public Unit b0(Object obj, k7t0 k7t0Var) {
        mjt mjtVarA;
        Map mapA = ((az40) obj).a();
        ctb0 ctb0VarN = etb0.n();
        for (Map.Entry entry : mapA.entrySet()) {
            zsb0 zsb0Var = (zsb0) entry.getKey();
            Object value = entry.getValue();
            String str = zsb0Var.f44898a;
            if (value instanceof Boolean) {
                htb0 htb0VarV = itb0.v();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                htb0VarV.c();
                ((itb0) htb0VarV.b).w(zBooleanValue);
                mjtVarA = htb0VarV.a();
            } else if (value instanceof Float) {
                htb0 htb0VarV2 = itb0.v();
                float fFloatValue = ((Number) value).floatValue();
                htb0VarV2.c();
                ((itb0) htb0VarV2.b).z(fFloatValue);
                mjtVarA = htb0VarV2.a();
            } else if (value instanceof Double) {
                htb0 htb0VarV3 = itb0.v();
                double dDoubleValue = ((Number) value).doubleValue();
                htb0VarV3.c();
                ((itb0) htb0VarV3.b).y(dDoubleValue);
                mjtVarA = htb0VarV3.a();
            } else if (value instanceof Integer) {
                htb0 htb0VarV4 = itb0.v();
                int iIntValue = ((Number) value).intValue();
                htb0VarV4.c();
                ((itb0) htb0VarV4.b).A(iIntValue);
                mjtVarA = htb0VarV4.a();
            } else if (value instanceof Long) {
                htb0 htb0VarV5 = itb0.v();
                long jLongValue = ((Number) value).longValue();
                htb0VarV5.c();
                ((itb0) htb0VarV5.b).B(jLongValue);
                mjtVarA = htb0VarV5.a();
            } else if (value instanceof String) {
                htb0 htb0VarV6 = itb0.v();
                htb0VarV6.c();
                ((itb0) htb0VarV6.b).C((String) value);
                mjtVarA = htb0VarV6.a();
            } else if (value instanceof Set) {
                htb0 htb0VarV7 = itb0.v();
                ftb0 ftb0VarO = gtb0.o();
                ftb0VarO.c();
                ((gtb0) ftb0VarO.b).l((Set) value);
                htb0VarV7.c();
                ((itb0) htb0VarV7.b).D((gtb0) ftb0VarO.a());
                mjtVarA = htb0VarV7.a();
            } else {
                if (!(value instanceof byte[])) {
                    jf4.n("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                    return null;
                }
                htb0 htb0VarV8 = itb0.v();
                byte[] bArr = (byte[]) value;
                mg9 mg9VarF = mg9.f(bArr, 0, bArr.length);
                htb0VarV8.c();
                ((itb0) htb0VarV8.b).x(mg9VarF);
                mjtVarA = htb0VarV8.a();
            }
            ctb0VarN.getClass();
            str.getClass();
            ctb0VarN.c();
            ((etb0) ctb0VarN.b).m().put(str, (itb0) mjtVarA);
        }
        etb0 etb0Var = (etb0) ctb0VarN.a();
        int iA = etb0Var.a(null);
        Logger logger = syc.f;
        if (iA > 4096) {
            iA = 4096;
        }
        syc sycVar = new syc(k7t0Var, iA);
        etb0Var.b(sycVar);
        if (sycVar.d > 0) {
            sycVar.k();
        }
        return Unit.f46060a;
    }

    @Override // a.eoc
    public ary c() {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override // a.eoc
    public /* bridge */ kzj0 c0(dcg0 dcg0Var) {
        return rcb.r1(dcg0Var, true);
    }

    @Override // a.yzs0
    public /* bridge */ dcg0 d(nkq nkqVar) {
        return rcb.W0(nkqVar);
    }

    @Override // a.yzs0
    public /* bridge */ aty d0(faa faaVar) {
        return rcb.X0(faaVar);
    }

    @Override // a.yzs0
    public /* bridge */ dcg0 e(nkq nkqVar) {
        return rcb.p1(nkqVar);
    }

    @Override // a.yzs0
    public /* bridge */ dcg0 e0(dcg0 dcg0Var, boolean z2) {
        return rcb.r1(dcg0Var, false);
    }

    @Override // a.e5n0
    public void f(d5n0 d5n0Var) {
        d5n0Var.clear();
    }

    @Override // a.mhi0
    public Object f0(FileInputStream fileInputStream) throws soe {
        byte[] bArr;
        try {
            etb0 etb0VarO = etb0.o(fileInputStream);
            az40 az40Var = new az40(false);
            atb0[] atb0VarArr = (atb0[]) Arrays.copyOf(new atb0[0], 0);
            az40Var.b();
            if (atb0VarArr.length > 0) {
                atb0 atb0Var = atb0VarArr[0];
                throw null;
            }
            Map mapL = etb0VarO.l();
            mapL.getClass();
            for (Map.Entry entry : mapL.entrySet()) {
                String str = (String) entry.getKey();
                itb0 itb0Var = (itb0) entry.getValue();
                str.getClass();
                itb0Var.getClass();
                int iU = itb0Var.u();
                switch (iU == 0 ? -1 : btb0.f3176a[hne.E(iU)]) {
                    case -1:
                        throw new soe("Value case is null.", null);
                    case 0:
                    default:
                        t9f.b();
                        return null;
                    case 1:
                        az40Var.d(new zsb0(str), Boolean.valueOf(itb0Var.l()));
                        break;
                    case 2:
                        az40Var.d(new zsb0(str), Float.valueOf(itb0Var.p()));
                        break;
                    case 3:
                        az40Var.d(new zsb0(str), Double.valueOf(itb0Var.o()));
                        break;
                    case 4:
                        az40Var.d(new zsb0(str), Integer.valueOf(itb0Var.q()));
                        break;
                    case 5:
                        az40Var.d(new zsb0(str), Long.valueOf(itb0Var.r()));
                        break;
                    case 6:
                        az40Var.d(new zsb0(str), itb0Var.s());
                        break;
                    case 7:
                        zsb0 zsb0Var = new zsb0(str);
                        bmx bmxVarN = itb0Var.t().n();
                        bmxVarN.getClass();
                        az40Var.d(zsb0Var, CollectionsKt.P0(bmxVarN));
                        break;
                    case 8:
                        zsb0 zsb0Var2 = new zsb0(str);
                        mg9 mg9VarM = itb0Var.m();
                        int size = mg9VarM.size();
                        if (size == 0) {
                            bArr = fmx.b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            mg9VarM.g(bArr2, size);
                            bArr = bArr2;
                        }
                        az40Var.d(zsb0Var2, bArr);
                        break;
                    case 9:
                        throw new soe("Value not set.", null);
                }
            }
            return new az40(new LinkedHashMap(az40Var.a()), true);
        } catch (box e2) {
            throw new soe("Unable to parse preferences proto.", e2);
        }
    }

    @Override // a.yzs0
    public int g(yxs0 yxs0Var) {
        yxs0Var.getClass();
        if (yxs0Var instanceof dcg0) {
            return rcb.U((aty) yxs0Var);
        }
        if (yxs0Var instanceof kw3) {
            return ((kw3) yxs0Var).size();
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(yxs0Var);
        e9d0.n(sb, sre0.f32672a.b(yxs0Var.getClass()));
        return 0;
    }

    @Override // a.yzs0
    public /* bridge */ List g0(jzs0 jzs0Var) {
        return rcb.z0(jzs0Var);
    }

    @Override // a.e5n0
    public boolean h0(Object obj, Object obj2) {
        return false;
    }

    @Override // a.yzs0
    public boolean i(dcg0 dcg0Var) {
        kzj0 kzj0VarZ = rcb.Z(dcg0Var);
        return (kzj0VarZ != null ? rcb.W(this, M0(kzj0VarZ)) : null) != null;
    }

    @Override // a.yzs0
    public Function2 i0() {
        return null;
    }

    @Override // a.qq8
    public long j(hu5 hu5Var, int i2) {
        return ((a9q0) hu5Var.e).l(i2);
    }

    @Override // a.yzs0
    public /* bridge */ u9a j0(faa faaVar) {
        return rcb.h0(faaVar);
    }

    @Override // a.yzs0
    public /* bridge */ f0t0 k0(zxs0 zxs0Var) {
        return rcb.A0(zxs0Var);
    }

    @Override // a.yzs0
    public boolean l(dcg0 dcg0Var) {
        dcg0Var.getClass();
        return rcb.O0(n0(dcg0Var)) && !rcb.P0(dcg0Var);
    }

    @Override // a.yzs0
    public /* bridge */ boolean l0(aty atyVar) {
        return rcb.N0(atyVar);
    }

    @Override // a.yzs0
    public /* bridge */ boolean m(aty atyVar) {
        return rcb.S0(atyVar);
    }

    @Override // a.yzs0
    public dcg0 m0(aty atyVar) {
        kzj0 kzj0VarW0;
        atyVar.getClass();
        kkq kkqVarY = rcb.Y(atyVar);
        if (kkqVarY != null && (kzj0VarW0 = rcb.W0(kkqVarY)) != null) {
            return kzj0VarW0;
        }
        kzj0 kzj0VarZ = rcb.Z(atyVar);
        kzj0VarZ.getClass();
        return kzj0VarZ;
    }

    @Override // a.yzs0
    public /* bridge */ zxs0 n(aty atyVar) {
        return rcb.a0(atyVar);
    }

    @Override // a.yzs0
    public jys0 n0(aty atyVar) {
        atyVar.getClass();
        dcg0 dcg0VarZ = rcb.Z(atyVar);
        if (dcg0VarZ == null) {
            dcg0VarZ = m0(atyVar);
        }
        return rcb.o1(dcg0VarZ);
    }

    @Override // a.q1o
    public void o(wm40 wm40Var, ArrayList arrayList) {
        throw new IllegalStateException("Incomplete hierarchy for class " + wm40Var.getName() + ", unresolved classes " + arrayList);
    }

    @Override // a.yzs0
    public /* bridge */ boolean o0(jys0 jys0Var) {
        return rcb.I0(jys0Var);
    }

    @Override // a.yzs0
    public aty p(aty atyVar) {
        return rcb.Y0(atyVar);
    }

    @Override // a.yzs0
    public /* bridge */ boolean p0(jys0 jys0Var) {
        return rcb.L0(jys0Var);
    }

    @Override // a.yzs0
    public /* bridge */ yxs0 q(dcg0 dcg0Var) {
        return rcb.V(dcg0Var);
    }

    @Override // a.yzs0
    public /* bridge */ boolean q0(zxs0 zxs0Var) {
        return rcb.T0(zxs0Var);
    }

    @Override // a.eoc
    public /* bridge */ kzj0 r(wsy wsyVar) {
        return rcb.Z(wsyVar);
    }

    @Override // a.yzs0
    public /* bridge */ jzs0 r0(jys0 jys0Var, int i2) {
        return rcb.t0(jys0Var, i2);
    }

    @Override // a.yzs0
    public /* bridge */ Collection s(jys0 jys0Var) {
        return rcb.l1(jys0Var);
    }

    @Override // a.yzs0
    public boolean s0(dcg0 dcg0Var) {
        dcg0Var.getClass();
        return rcb.G0(rcb.o1(dcg0Var));
    }

    @Override // a.yzs0
    public boolean t(aty atyVar) {
        atyVar.getClass();
        return atyVar instanceof t660;
    }

    @Override // a.yzs0
    public /* bridge */ void t0(dcg0 dcg0Var) {
        rcb.V0(dcg0Var);
    }

    @Override // a.yzs0
    public /* bridge */ eaa u(faa faaVar) {
        return rcb.n1(faaVar);
    }

    @Override // a.yzs0
    public /* bridge */ boolean u0(faa faaVar) {
        return rcb.R0(faaVar);
    }

    @Override // a.yzs0
    public boolean v(dcg0 dcg0Var) {
        dcg0Var.getClass();
        return rcb.X(dcg0Var) != null;
    }

    @Override // a.yzs0
    public /* bridge */ void v0(dcg0 dcg0Var) {
        rcb.U0(dcg0Var);
    }

    @Override // a.yzs0
    public /* bridge */ boolean w(jzs0 jzs0Var, jys0 jys0Var) {
        return rcb.D0(jzs0Var, jys0Var);
    }

    @Override // a.yzs0
    public void w0(dcg0 dcg0Var, jys0 jys0Var) {
        dcg0Var.getClass();
    }

    @Override // a.yzs0
    public /* bridge */ int x(jys0 jys0Var) {
        return rcb.c1(jys0Var);
    }

    @Override // a.jgd
    public Object x0(pzu pzuVar) {
        Object objE = pzuVar.e(new jkd0(a7t0.class, Executor.class));
        objE.getClass();
        return obb.Y((Executor) objE);
    }

    @Override // a.yzs0
    public boolean y(faa faaVar) {
        return faaVar instanceof z9a;
    }

    @Override // a.yzs0
    public /* bridge */ boolean y0(jys0 jys0Var) {
        return rcb.F0(jys0Var);
    }

    @Override // a.yzs0
    public aty z(ArrayList arrayList) {
        kzj0 kzj0Var;
        int size = arrayList.size();
        if (size == 0) {
            jf4.n("Expected some types");
            return null;
        }
        if (size == 1) {
            return (tft0) CollectionsKt.u0(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            tft0 tft0Var = (tft0) it.next();
            z2 = z2 || bdx.k0(tft0Var);
            if (tft0Var instanceof kzj0) {
                kzj0Var = (kzj0) tft0Var;
            } else {
                if (!(tft0Var instanceof kkq)) {
                    t9f.b();
                    return null;
                }
                kzj0Var = ((kkq) tft0Var).b;
                z3 = true;
            }
            arrayList2.add(kzj0Var);
        }
        if (z2) {
            return f2o.c(c2o.x, arrayList.toString());
        }
        yys0 yys0Var = yys0.f43482a;
        if (!z3) {
            return yys0Var.b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(thb.Z((tft0) it2.next()));
        }
        return ucx.W(yys0Var.b(arrayList2), yys0Var.b(arrayList3));
    }

    @Override // a.l3u0
    public Object z0(ndy ndyVar, float f2) {
        return vdy.b(ndyVar, f2);
    }

    @Override // a.eoc, a.yzs0
    public /* bridge */ kzj0 d(nkq nkqVar) {
        return rcb.W0(nkqVar);
    }

    @Override // a.eoc, a.yzs0
    public /* bridge */ kzj0 e(nkq nkqVar) {
        return rcb.p1(nkqVar);
    }

    @Override // a.n1x
    public void h(o1x o1xVar, hhn0 hhn0Var) {
    }

    @Override // a.n1x
    public void k(o1x o1xVar, r1o r1oVar) {
    }
}
