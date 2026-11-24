package a;

import android.app.Activity;
import android.graphics.Region;
import android.javax.sip.message.Response;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class pv00 implements zfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f27640a;

    public pv00(cad cadVar, drm0 drm0Var, rmd0 rmd0Var, gr70 gr70Var, y58 y58Var, wsf0 wsf0Var, ok50 ok50Var, clc clcVar, wxs0 wxs0Var, zoc zocVar, jqc jqcVar, yk50 yk50Var, f4v f4vVar, cad cadVar2, rrc rrcVar, kt2 kt2Var, rv3 rv3Var, bbw0 bbw0Var, aqt aqtVar, hqc hqcVar, bbw0 bbw0Var2, r5w0 r5w0Var, xqc xqcVar, wqc wqcVar, wsf0 wsf0Var2, fpc fpcVar, o2j0 o2j0Var, erc ercVar, onv onvVar, xr xrVar, pmi0 pmi0Var, gst0 gst0Var, owp0 owp0Var, rpc rpcVar, y3v y3vVar, eg3 eg3Var, b3c0 b3c0Var, lef0 lef0Var, gpc gpcVar, tpc tpcVar, jqc jqcVar2, qoc qocVar, roc rocVar, poc pocVar) {
        rmd0Var.getClass();
        gr70Var.getClass();
        y58Var.getClass();
        kt2Var.getClass();
        rv3Var.getClass();
        aqtVar.getClass();
        o2j0Var.getClass();
        gst0Var.getClass();
        eg3Var.getClass();
        b3c0Var.getClass();
        this.f27640a = new w9i(drm0Var, eg3Var, gr70Var, wsf0Var, ok50Var, clcVar, o2j0Var, wxs0Var, onvVar, rrcVar, zocVar, jqcVar, yk50Var, f4vVar, kt2Var, aqtVar, rv3Var, cadVar2, r5w0Var, bbw0Var, bbw0Var2, qocVar, rocVar, pocVar, hqcVar, xqcVar, wqcVar, wsf0Var2, fpcVar, ercVar, xrVar, pmi0Var, gst0Var, owp0Var, rpcVar, y3vVar, b3c0Var, lef0Var, gpcVar, tpcVar, jqcVar2);
    }

    @Override // a.zfu0
    public int a(View view) {
        return androidx.recyclerview.widget.b.N(view) - ((ViewGroup.MarginLayoutParams) ((hhe0) view.getLayoutParams())).leftMargin;
    }

    @Override // a.zfu0
    public int b() {
        return ((androidx.recyclerview.widget.b) this.f27640a).getPaddingLeft();
    }

    /* JADX WARN: Code duplicated, block: B:142:0x02b6  */
    public void c(int i, int i2, guo guoVar) throws kq80 {
        int i3;
        byte b;
        int i4;
        int i5;
        byte b2;
        int i6;
        long j;
        int i7;
        int i8;
        int[] iArr;
        int i9;
        int i10;
        int i11;
        cj30 cj30Var = (cj30) this.f27640a;
        u3u0 u3u0Var = cj30Var.b;
        SparseArray sparseArray = cj30Var.c;
        fq80 fq80Var = cj30Var.m;
        fq80 fq80Var2 = cj30Var.k;
        byte b3 = 2;
        int i12 = 0;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (cj30Var.V != 2) {
                    return;
                }
                bj30 bj30Var = (bj30) sparseArray.get(cj30Var.b0);
                int i13 = cj30Var.e0;
                fq80 fq80Var3 = cj30Var.r;
                if (i13 != 4 || !"V_VP9".equals(bj30Var.c)) {
                    guoVar.m(i2);
                    return;
                }
                fq80Var3.J(i2);
                guoVar.readFully(fq80Var3.f9961a, 0, i2);
                if (cj30Var.f) {
                    return;
                }
                byte[] bArr = fq80Var3.f9961a;
                byte[] bArr2 = jyc.d;
                if (i2 < bArr2.length) {
                    return;
                }
                for (int i14 = 0; i14 < bArr2.length; i14++) {
                    if (bArr[i14] != bArr2[i14]) {
                        return;
                    }
                }
                fq80Var3.J(0);
                return;
            }
            if (i == 16877) {
                cj30Var.h(i);
                bj30 bj30Var2 = cj30Var.B;
                int i15 = bj30Var2.i;
                if (i15 != 1685485123 && i15 != 1685480259) {
                    guoVar.m(i2);
                    return;
                }
                byte[] bArr3 = new byte[i2];
                bj30Var2.P = bArr3;
                guoVar.readFully(bArr3, 0, i2);
                return;
            }
            if (i == 16981) {
                cj30Var.h(i);
                byte[] bArr4 = new byte[i2];
                cj30Var.B.k = bArr4;
                guoVar.readFully(bArr4, 0, i2);
                return;
            }
            if (i == 18402) {
                byte[] bArr5 = new byte[i2];
                guoVar.readFully(bArr5, 0, i2);
                cj30Var.h(i);
                cj30Var.B.l = new mcs0(1, bArr5, 0, 0);
                return;
            }
            if (i == 21419) {
                Arrays.fill(fq80Var.f9961a, (byte) 0);
                guoVar.readFully(fq80Var.f9961a, 4 - i2, i2);
                fq80Var.M(0);
                cj30Var.D = (int) fq80Var.B();
                return;
            }
            if (i == 25506) {
                cj30Var.h(i);
                byte[] bArr6 = new byte[i2];
                cj30Var.B.m = bArr6;
                guoVar.readFully(bArr6, 0, i2);
                return;
            }
            if (i != 30322) {
                throw kq80.a("Unexpected id: " + i, null);
            }
            cj30Var.h(i);
            byte[] bArr7 = new byte[i2];
            cj30Var.B.y = bArr7;
            guoVar.readFully(bArr7, 0, i2);
            return;
        }
        int i16 = 8;
        if (cj30Var.V == 0) {
            cj30Var.b0 = (int) u3u0Var.j(guoVar, false, true, 8);
            cj30Var.c0 = u3u0Var.f35015a;
            cj30Var.X = -9223372036854775807L;
            cj30Var.V = (byte) 1;
            fq80Var2.J(0);
        }
        bj30 bj30Var3 = (bj30) sparseArray.get(cj30Var.b0);
        if (bj30Var3 == null) {
            guoVar.m(i2 - cj30Var.c0);
            cj30Var.V = (byte) 0;
            return;
        }
        bj30Var3.d0.getClass();
        if (cj30Var.V == 1) {
            cj30Var.n(guoVar, 3);
            int i17 = (fq80Var2.f9961a[2] & 6) >> 1;
            if (i17 == 0) {
                cj30Var.Z = 1;
                int[] iArr2 = cj30Var.a0;
                if (iArr2 == null) {
                    iArr2 = new int[1];
                } else if (iArr2.length < 1) {
                    iArr2 = new int[Math.max(iArr2.length * 2, 1)];
                }
                cj30Var.a0 = iArr2;
                iArr2[0] = (i2 - cj30Var.c0) - 3;
            } else {
                cj30Var.n(guoVar, 4);
                int i18 = (fq80Var2.f9961a[3] & 255) + 1;
                cj30Var.Z = i18;
                int[] iArr3 = cj30Var.a0;
                if (iArr3 == null) {
                    iArr3 = new int[i18];
                    i3 = 4;
                } else {
                    i3 = 4;
                    if (iArr3.length < i18) {
                        iArr3 = new int[Math.max(iArr3.length * 2, i18)];
                    }
                }
                cj30Var.a0 = iArr3;
                if (i17 == 2) {
                    int i19 = (i2 - cj30Var.c0) - 4;
                    int i20 = cj30Var.Z;
                    Arrays.fill(iArr3, 0, i20, i19 / i20);
                } else {
                    if (i17 == 1) {
                        int i21 = 0;
                        int i22 = 0;
                        int i23 = i3;
                        while (true) {
                            i8 = cj30Var.Z - 1;
                            iArr = cj30Var.a0;
                            if (i21 >= i8) {
                                break;
                            }
                            iArr[i21] = 0;
                            while (true) {
                                i9 = i23 + 1;
                                cj30Var.n(guoVar, i9);
                                int i24 = fq80Var2.f9961a[i23] & 255;
                                int[] iArr4 = cj30Var.a0;
                                i10 = iArr4[i21] + i24;
                                iArr4[i21] = i10;
                                if (i24 != 255) {
                                    break;
                                } else {
                                    i23 = i9;
                                }
                            }
                            i22 += i10;
                            i21++;
                            i23 = i9;
                        }
                        iArr[i8] = ((i2 - cj30Var.c0) - i23) - i22;
                    } else {
                        if (i17 != 3) {
                            throw kq80.a("Unexpected lacing value: " + i17, null);
                        }
                        int i25 = 0;
                        int i26 = 0;
                        int i27 = i3;
                        while (true) {
                            int i28 = cj30Var.Z - 1;
                            int[] iArr5 = cj30Var.a0;
                            if (i25 >= i28) {
                                b = b3;
                                i4 = i12;
                                iArr5[i28] = ((i2 - cj30Var.c0) - i27) - i26;
                                break;
                            }
                            iArr5[i25] = i12;
                            int i29 = i27 + 1;
                            cj30Var.n(guoVar, i29);
                            if (fq80Var2.f9961a[i27] == 0) {
                                throw kq80.a("No valid varint length mask found", null);
                            }
                            int i30 = i12;
                            while (true) {
                                if (i30 >= i16) {
                                    i5 = i16;
                                    b2 = b3;
                                    i6 = i12;
                                    j = 0;
                                    i7 = i29;
                                    break;
                                }
                                i5 = i16;
                                int i31 = 1 << (7 - i30);
                                i6 = i12;
                                if ((fq80Var2.f9961a[i27] & i31) != 0) {
                                    i7 = i29 + i30;
                                    cj30Var.n(guoVar, i7);
                                    b2 = b3;
                                    j = (~i31) & fq80Var2.f9961a[i27] & 255;
                                    while (i29 < i7) {
                                        j = (j << i5) | ((long) (fq80Var2.f9961a[i29] & 255));
                                        i29++;
                                    }
                                    if (i25 <= 0) {
                                        break;
                                    }
                                    j -= (1 << ((i30 * 7) + 6)) - 1;
                                    break;
                                }
                                i30++;
                                i12 = i6;
                                i16 = i5;
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                throw kq80.a("EBML lacing sample size out of range.", null);
                            }
                            int i32 = (int) j;
                            int[] iArr6 = cj30Var.a0;
                            if (i25 != 0) {
                                i32 += iArr6[i25 - 1];
                            }
                            iArr6[i25] = i32;
                            i26 += i32;
                            i25++;
                            i27 = i7;
                            i12 = i6;
                            i16 = i5;
                            b3 = b2;
                        }
                    }
                    byte[] bArr8 = fq80Var2.f9961a;
                    cj30Var.W = cj30Var.p((bArr8[1] & 255) | (bArr8[i4] << 8)) + cj30Var.T;
                    if (bj30Var3.f != 1 || (i == 163 && (fq80Var2.f9961a[b] & 128) == 128)) {
                        i11 = 1;
                    } else {
                        i11 = i4;
                    }
                    cj30Var.d0 = i11;
                    cj30Var.V = b;
                    cj30Var.Y = i4;
                }
            }
            b = 2;
            i4 = 0;
            byte[] bArr9 = fq80Var2.f9961a;
            cj30Var.W = cj30Var.p((bArr9[1] & 255) | (bArr9[i4] << 8)) + cj30Var.T;
            if (bj30Var3.f != 1) {
                i11 = 1;
            } else {
                i11 = 1;
            }
            cj30Var.d0 = i11;
            cj30Var.V = b;
            cj30Var.Y = i4;
        }
        if (i == 163) {
            while (true) {
                int i33 = cj30Var.Y;
                if (i33 >= cj30Var.Z) {
                    cj30Var.V = (byte) 0;
                    return;
                }
                cj30Var.i(bj30Var3, ((long) ((cj30Var.Y * bj30Var3.g) / 1000)) + cj30Var.W, cj30Var.d0, cj30Var.r(guoVar, bj30Var3, cj30Var.a0[i33], false), 0);
                cj30Var.Y++;
            }
        } else {
            while (true) {
                int i34 = cj30Var.Y;
                if (i34 >= cj30Var.Z) {
                    return;
                }
                int[] iArr7 = cj30Var.a0;
                iArr7[i34] = cj30Var.r(guoVar, bj30Var3, iArr7[i34], true);
                cj30Var.Y++;
            }
        }
    }

    public List d() {
        cyu cyuVar = (cyu) this.f27640a;
        iun iunVar = (iun) cyuVar.c;
        try {
            String strC = q7d0.c((q7d0) cyuVar.f5196a, "KEY_MENU_ITEMS_INNOVATIONS");
            if (strC != null && strC.length() != 0) {
                vby vbyVar = (vby) cyuVar.b;
                vbyVar.getClass();
                iz30[] iz30VarArrValues = iz30.values();
                iz30VarArrValues.getClass();
                return (List) vbyVar.b(new zw3(new g0o("org.xplatform.onexcore.configs.MenuItemModel", (Enum[]) iz30VarArrValues), (byte) 0), strC);
            }
        } catch (Exception unused) {
        }
        return iunVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(String str, zje zjeVar) {
        scb0 scb0Var;
        if (zjeVar instanceof scb0) {
            scb0Var = (scb0) zjeVar;
            int i = scb0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                scb0Var.k = i - Integer.MIN_VALUE;
            } else {
                scb0Var = new scb0(this, zjeVar);
            }
        } else {
            scb0Var = new scb0(this, zjeVar);
        }
        Object objA = scb0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = scb0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            ncb0 ncb0Var = (ncb0) ((rta0) this.f27640a).invoke();
            scb0Var.k = 1;
            objA = ncb0Var.a(str, scb0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return ((dx5) objA).a();
    }

    @Override // a.zfu0
    public int f() {
        androidx.recyclerview.widget.b bVar = (androidx.recyclerview.widget.b) this.f27640a;
        return bVar.n - bVar.getPaddingRight();
    }

    @Override // a.zfu0
    public View g(int i) {
        return ((androidx.recyclerview.widget.b) this.f27640a).H(i);
    }

    @Override // a.zfu0
    public int h(View view) {
        return androidx.recyclerview.widget.b.Q(view) + ((ViewGroup.MarginLayoutParams) ((hhe0) view.getLayoutParams())).rightMargin;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public Object i(long j, double d, double d2, boolean z, zje zjeVar) {
        jnd0 jnd0Var;
        double d3;
        double d4;
        boolean z2;
        long j2;
        if (zjeVar instanceof jnd0) {
            jnd0Var = (jnd0) zjeVar;
            int i = jnd0Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                jnd0Var.o = i - Integer.MIN_VALUE;
            } else {
                jnd0Var = new jnd0(this, zjeVar);
            }
        } else {
            jnd0Var = new jnd0(this, zjeVar);
        }
        Object obj = jnd0Var.m;
        wne wneVar = wne.f39444a;
        int i2 = jnd0Var.o;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(obj);
            ywu ywuVar = (ywu) this.f27640a;
            jnd0Var.i = j;
            d3 = d;
            jnd0Var.j = d3;
            d4 = d2;
            jnd0Var.k = d4;
            jnd0Var.l = z;
            jnd0Var.o = 1;
            Object objW0 = sj3.w0(jnd0Var, ((gnd0) ((n0o0) ywuVar.d).getValue()).f11580a, new hu6(j, yjeVar, (byte) 8), true, false);
            if (objW0 == wneVar) {
                return wneVar;
            }
            obj = objW0;
            z2 = z;
            j2 = j;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = jnd0Var.l;
            double d5 = jnd0Var.k;
            double d6 = jnd0Var.j;
            j2 = jnd0Var.i;
            z1x.P(obj);
            d4 = d5;
            d3 = d6;
        }
        ind0 ind0Var = (ind0) obj;
        if (ind0Var == null) {
            ind0Var = new ind0(j2, d3, !z2 ? d3 * 5.0d : 2.0d * d4, !z2 ? 10.0d * d3 : 5.0d * d4);
        }
        return new hnd0(ind0Var.f15069a, ind0Var.b, ind0Var.c, ind0Var.d);
    }

    public ql5 j(bm5 bm5Var) {
        bm5Var.getClass();
        o7h0 o7h0Var = (o7h0) this.f27640a;
        o7h0Var.getClass();
        bm5Var.getClass();
        return o7h0Var.a(bm5Var).f23041a;
    }

    public void k(int i, long j) throws kq80 {
        cj30 cj30Var = (cj30) this.f27640a;
        if (i == 136) {
            cj30Var.h(i);
            cj30Var.B.b0 = j == 1;
            return;
        }
        if (i == 137) {
            cj30Var.k(i).e = j;
            return;
        }
        if (i == 145) {
            cj30Var.k(i).b = j;
            return;
        }
        if (i == 146) {
            cj30Var.k(i).c = j;
            return;
        }
        if (i == 240) {
            if (cj30Var.C) {
                return;
            }
            cj30Var.g(i);
            if (cj30Var.K == -1) {
                cj30Var.K = j;
                return;
            }
            return;
        }
        if (i == 241) {
            if (cj30Var.C) {
                return;
            }
            cj30Var.g(i);
            if (cj30Var.J == -1) {
                cj30Var.J = j;
                return;
            }
            return;
        }
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw kq80.a("ContentEncodingOrder " + j + " not supported", null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw kq80.a("ContentEncodingScope " + j + " not supported", null);
        }
        if (i == 29636) {
            cj30Var.k(i).f42667a = j;
            return;
        }
        if (i == 29637) {
            cj30Var.h(i);
            cj30Var.B.e = j;
            return;
        }
        switch (i) {
            case 131:
                int i2 = (int) j;
                if (i2 == 1) {
                    cj30Var.h(i);
                    cj30Var.B.f = 2;
                    return;
                }
                if (i2 == 2) {
                    cj30Var.h(i);
                    cj30Var.B.f = 1;
                    return;
                } else if (i2 == 17) {
                    cj30Var.h(i);
                    cj30Var.B.f = 3;
                    return;
                } else if (i2 != 33) {
                    cj30Var.h(i);
                    cj30Var.B.f = -1;
                    return;
                } else {
                    cj30Var.h(i);
                    cj30Var.B.f = 5;
                    return;
                }
            case 152:
                cj30Var.k(i).d = j == 1;
                return;
            case 155:
                cj30Var.X = cj30Var.p(j);
                return;
            case 159:
                cj30Var.h(i);
                cj30Var.B.Q = (int) j;
                return;
            case 176:
                cj30Var.h(i);
                cj30Var.B.o = (int) j;
                return;
            case 179:
                if (cj30Var.C) {
                    return;
                }
                cj30Var.g(i);
                cj30Var.H = cj30Var.p(j);
                return;
            case 186:
                cj30Var.h(i);
                cj30Var.B.p = (int) j;
                return;
            case 215:
                cj30Var.h(i);
                cj30Var.B.d = (int) j;
                return;
            case 231:
                cj30Var.T = cj30Var.p(j);
                return;
            case 238:
                cj30Var.e0 = (int) j;
                return;
            case 247:
                if (cj30Var.C) {
                    return;
                }
                cj30Var.g(i);
                cj30Var.I = (int) j;
                return;
            case 251:
                cj30Var.f0 = true;
                return;
            case 16871:
                cj30Var.h(i);
                cj30Var.B.i = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw kq80.a("ContentCompAlgo " + j + " not supported", null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw kq80.a("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw kq80.a("EBMLReadVersion " + j + " not supported", null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw kq80.a("ContentEncAlgo " + j + " not supported", null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw kq80.a("AESSettingsCipherMode " + j + " not supported", null);
            case 21420:
                cj30Var.E = j + cj30Var.u;
                return;
            case 21432:
                int i3 = (int) j;
                cj30Var.h(i);
                if (i3 == 0) {
                    cj30Var.B.z = 0;
                    return;
                }
                if (i3 == 1) {
                    cj30Var.B.z = 2;
                    return;
                } else if (i3 == 3) {
                    cj30Var.B.z = 1;
                    return;
                } else {
                    if (i3 != 15) {
                        return;
                    }
                    cj30Var.B.z = 3;
                    return;
                }
            case 21680:
                cj30Var.h(i);
                cj30Var.B.r = (int) j;
                return;
            case 21682:
                cj30Var.h(i);
                cj30Var.B.t = (int) j;
                return;
            case 21690:
                cj30Var.h(i);
                cj30Var.B.s = (int) j;
                return;
            case 21930:
                cj30Var.h(i);
                cj30Var.B.a0 = j == 1;
                return;
            case 21938:
                cj30Var.h(i);
                cj30Var.B.q = (int) j;
                return;
            case 21998:
                cj30Var.h(i);
                cj30Var.B.h = (int) j;
                return;
            case 22186:
                cj30Var.h(i);
                cj30Var.B.U = j;
                return;
            case 22203:
                cj30Var.h(i);
                cj30Var.B.V = j;
                return;
            case 25188:
                cj30Var.h(i);
                cj30Var.B.R = (int) j;
                return;
            case 30114:
                cj30Var.g0 = j;
                return;
            case 30321:
                cj30Var.h(i);
                int i4 = (int) j;
                if (i4 == 0) {
                    cj30Var.B.u = 0;
                    return;
                }
                if (i4 == 1) {
                    cj30Var.B.u = 1;
                    return;
                } else if (i4 == 2) {
                    cj30Var.B.u = 2;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    cj30Var.B.u = 3;
                    return;
                }
            case 2352003:
                cj30Var.h(i);
                cj30Var.B.g = (int) j;
                return;
            case 2807729:
                cj30Var.v = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        cj30Var.h(i);
                        int i5 = (int) j;
                        if (i5 == 1) {
                            cj30Var.B.C = 2;
                            return;
                        } else {
                            if (i5 != 2) {
                                return;
                            }
                            cj30Var.B.C = 1;
                            return;
                        }
                    case 21946:
                        cj30Var.h(i);
                        int iG = c4d.g((int) j);
                        if (iG != -1) {
                            cj30Var.B.B = iG;
                            return;
                        }
                        return;
                    case 21947:
                        cj30Var.h(i);
                        int iF = c4d.f((int) j);
                        if (iF != -1) {
                            cj30Var.B.A = iF;
                            return;
                        }
                        return;
                    case 21948:
                        cj30Var.h(i);
                        cj30Var.B.D = (int) j;
                        return;
                    case 21949:
                        cj30Var.h(i);
                        cj30Var.B.E = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    public void l(int i, String str) {
        Object next;
        int iIndexOf;
        oe6 oe6Var = (oe6) ((r7v) this.f27640a).f29996a;
        ArrayList arrayList = oe6Var.f25109a;
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((q88) next).f28287a != i);
        q88 q88Var = (q88) next;
        if (q88Var == null || (iIndexOf = arrayList.indexOf(q88Var)) == -1) {
            return;
        }
        int i2 = q88Var.f28287a;
        int i3 = q88Var.b;
        double d = q88Var.c;
        double d2 = q88Var.d;
        double d3 = q88Var.e;
        String str2 = q88Var.f;
        str2.getClass();
        q88 q88Var2 = new q88(d, d2, d3, i2, i3, str2, str);
        oe6Var.getClass();
        oe6Var.f25109a.set(iIndexOf, q88Var2);
    }

    public void m(xkb0 xkb0Var) {
        tj60 tj60Var = (tj60) ((nv20) this.f27640a).f24171a;
        tj60Var.getClass();
        Object value = tj60Var.b.getValue();
        rk60 rk60Var = value instanceof rk60 ? (rk60) value : null;
        skb0 skb0Var = rk60Var != null ? rk60Var.b : null;
        if (skb0Var == null || skb0Var.equals(xkb0Var.b())) {
            tj60Var.c.o(null, xkb0Var);
        }
    }

    public void n(vcm0 vcm0Var) {
        int i;
        lho lhoVar;
        ddm0 ddm0Var = (ddm0) ((nw20) this.f27640a).f24215a;
        String str = vcm0Var.f37194a;
        long j = vcm0Var.b;
        long j2 = vcm0Var.d;
        String str2 = vcm0Var.e;
        String str3 = vcm0Var.f;
        String str4 = vcm0Var.g;
        ufp0 ufp0VarR = b5x.R(vcm0Var.h);
        ufp0 ufp0VarR2 = b5x.R(vcm0Var.i);
        int i2 = vcm0Var.j;
        int i3 = vcm0Var.k;
        iun iunVar = iun.f15405a;
        boolean z = vcm0Var.l;
        boolean z2 = vcm0Var.n;
        if (z2) {
            i = i3;
            lhoVar = lho.GAME_STATUS_RESULT;
        } else {
            i = i3;
            lhoVar = vcm0Var.o ? lho.GAME_STATUS_LIVE : lho.UNKNOWN;
        }
        xqj0 xqj0Var = new xqj0(j, j2, lhoVar, -1, str3, str4, str2, ufp0VarR, ufp0VarR2, i2, i, iunVar, z, hrj0.f13533a, vcm0Var.m, z2, iunVar, 0L, 0L, vcm0Var.p, vcm0Var.q);
        ddm0Var.getClass();
        str.getClass();
        ddm0Var.f5902a.put(str, xqj0Var);
        ddm0Var.c.g(Unit.f46060a);
    }

    public cgx0 o(zn00 zn00Var, AndroidComposeView androidComposeView) {
        long j;
        boolean z;
        long jH;
        u710 u710Var = (u710) this.f27640a;
        u710 u710Var2 = new u710(((ArrayList) zn00Var.f44650a).size());
        ArrayList arrayList = (ArrayList) zn00Var.f44650a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            fpa0 fpa0Var = (fpa0) arrayList.get(i);
            long j2 = fpa0Var.f9919a;
            epa0 epa0Var = (epa0) u710Var.b(j2);
            if (epa0Var == null) {
                j = fpa0Var.b;
                jH = fpa0Var.d;
                z = false;
            } else {
                long j3 = epa0Var.f8176a;
                j = j3;
                z = epa0Var.c;
                jH = androidComposeView.H(epa0Var.b);
            }
            long j4 = fpa0Var.f9919a;
            int i2 = i;
            ArrayList arrayList2 = arrayList;
            int i3 = size;
            u710Var2.f(new dpa0(j4, fpa0Var.b, fpa0Var.d, fpa0Var.e, fpa0Var.f, j, jH, z, fpa0Var.g, fpa0Var.i, fpa0Var.j, fpa0Var.k, fpa0Var.l, fpa0Var.m), j4);
            boolean z2 = fpa0Var.e;
            if (z2) {
                u710Var.f(new epa0(fpa0Var.b, z2, fpa0Var.c), j2);
            } else {
                u710Var.g(j2);
            }
            i = i2 + 1;
            arrayList = arrayList2;
            size = i3;
        }
        return new cgx0(u710Var2, zn00Var);
    }

    public void p(mkx mkxVar) {
        ((Region) this.f27640a).set(mkxVar.f21964a, mkxVar.b, mkxVar.c, mkxVar.d);
    }

    public void q(int i, long j, long j2) throws kq80 {
        cj30 cj30Var = (cj30) this.f27640a;
        cj30Var.q0.getClass();
        if (i == 128) {
            cj30Var.k(i).h = null;
            cj30Var.k(i).i = null;
            return;
        }
        if (i == 160) {
            cj30Var.f0 = false;
            cj30Var.g0 = 0L;
            return;
        }
        if (i == 174) {
            bj30 bj30Var = new bj30();
            bj30Var.o = -1;
            bj30Var.p = -1;
            bj30Var.q = -1;
            bj30Var.r = -1;
            bj30Var.s = -1;
            bj30Var.t = 0;
            bj30Var.u = -1;
            bj30Var.v = 0.0f;
            bj30Var.w = 0.0f;
            bj30Var.x = 0.0f;
            bj30Var.y = null;
            bj30Var.z = -1;
            bj30Var.A = -1;
            bj30Var.B = -1;
            bj30Var.C = -1;
            bj30Var.D = 1000;
            bj30Var.E = Response.OK;
            bj30Var.F = -1.0f;
            bj30Var.G = -1.0f;
            bj30Var.H = -1.0f;
            bj30Var.I = -1.0f;
            bj30Var.J = -1.0f;
            bj30Var.K = -1.0f;
            bj30Var.L = -1.0f;
            bj30Var.M = -1.0f;
            bj30Var.N = -1.0f;
            bj30Var.O = -1.0f;
            bj30Var.Q = 1;
            bj30Var.R = -1;
            bj30Var.S = -1;
            bj30Var.T = JosStatusCodes.RTN_CODE_COMMON_ERROR;
            bj30Var.U = 0L;
            bj30Var.V = 0L;
            bj30Var.X = false;
            bj30Var.b0 = true;
            bj30Var.c0 = "eng";
            cj30Var.B = bj30Var;
            bj30Var.f2686a = cj30Var.y;
            return;
        }
        if (i == 187) {
            if (cj30Var.C) {
                return;
            }
            cj30Var.g(i);
            cj30Var.H = -9223372036854775807L;
            return;
        }
        if (i == 19899) {
            cj30Var.D = -1;
            cj30Var.E = -1L;
            return;
        }
        if (i == 20533) {
            cj30Var.h(i);
            cj30Var.B.j = true;
            return;
        }
        if (i == 408125543) {
            long j3 = cj30Var.u;
            if (j3 != -1 && j3 != j) {
                throw kq80.a("Multiple Segment elements not supported", null);
            }
            cj30Var.u = j;
            cj30Var.t = j2;
            return;
        }
        if (i == 475249515) {
            if (cj30Var.C) {
                return;
            }
            cj30Var.G = true;
            return;
        }
        if (i == 524531317) {
            if (cj30Var.P == -1 || cj30Var.S) {
                cj30Var.m();
                return;
            } else {
                cj30Var.Q = true;
                return;
            }
        }
        if (i == 182) {
            yi30 yi30Var = new yi30();
            yi30Var.b = -9223372036854775807L;
            yi30Var.c = -9223372036854775807L;
            cj30Var.A = yi30Var;
            return;
        }
        if (i == 183 && !cj30Var.C) {
            cj30Var.g(i);
            cj30Var.I = -1;
            cj30Var.J = -1L;
            cj30Var.K = -1L;
        }
    }

    public void r(int i, String str) throws kq80 {
        cj30 cj30Var = (cj30) this.f27640a;
        if (i == 133) {
            cj30Var.k(i).h = str;
            return;
        }
        if (i == 134) {
            cj30Var.h(i);
            cj30Var.B.c = str;
            return;
        }
        if (i == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                cj30Var.y = str.equals("webm");
                return;
            }
            throw kq80.a("DocType " + str + " not supported", null);
        }
        if (i == 17276) {
            cj30Var.k(i).i = str;
            return;
        }
        if (i == 21358) {
            cj30Var.h(i);
            cj30Var.B.b = str;
        } else {
            if (i != 2274716) {
                return;
            }
            cj30Var.h(i);
            cj30Var.B.c0 = str;
        }
    }

    public pv00(Activity activity) {
        this.f27640a = activity.getSharedPreferences("authsdk", 0);
    }

    public pv00(jx50 jx50Var) {
        jx50Var.getClass();
        this.f27640a = jx50Var;
    }

    public pv00(xs70 xs70Var) {
        xs70Var.getClass();
        this.f27640a = xs70Var;
    }

    public pv00(ux80 ux80Var) {
        ux80Var.getClass();
        this.f27640a = ux80Var;
    }

    public pv00(gii0 gii0Var) {
        gii0Var.getClass();
        this.f27640a = new rta0(gii0Var, (byte) 4);
    }

    public pv00(q530 q530Var) {
        q530Var.getClass();
        this.f27640a = q530Var;
    }

    public pv00(hdf0 hdf0Var) {
        hdf0Var.getClass();
        this.f27640a = hdf0Var;
    }

    public pv00(o5g0 o5g0Var) {
        o5g0Var.getClass();
        this.f27640a = o5g0Var;
    }

    public pv00(bbw0 bbw0Var) {
        this.f27640a = new rrc(bbw0Var, (byte) 12);
    }

    public pv00(ony onyVar) {
        onyVar.getClass();
        this.f27640a = onyVar;
    }

    public pv00(o7h0 o7h0Var) {
        o7h0Var.getClass();
        this.f27640a = o7h0Var;
    }

    public pv00(q7d0 q7d0Var, v230 v230Var, pru pruVar, j1q0 j1q0Var, r9u r9uVar) {
        q7d0Var.getClass();
        v230Var.getClass();
        j1q0Var.getClass();
        r9uVar.getClass();
        this.f27640a = new u9x0(v230Var, pruVar);
    }

    public pv00(byte b) {
        Object nh70Var;
        switch (b) {
            case 13:
                this.f27640a = new u710((Object) null);
                break;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                this.f27640a = new Region();
                break;
            default:
                if (Build.VERSION.SDK_INT >= 28) {
                    nh70Var = new jh70();
                } else {
                    nh70Var = new nh70();
                }
                this.f27640a = nh70Var;
                break;
        }
    }

    public /* synthetic */ pv00(Object obj) {
        this.f27640a = obj;
    }

    public pv00(UUID uuid, int i, byte[] bArr, UUID[] uuidArr) {
        this.f27640a = uuid;
    }
}
