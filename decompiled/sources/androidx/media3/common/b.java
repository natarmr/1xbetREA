package androidx.media3.common;

import a.awq;
import a.b1j;
import a.b4x;
import a.brm0;
import a.c4d;
import a.ed40;
import a.hne;
import a.jf4;
import a.jtm0;
import a.mg40;
import a.pfw;
import a.rw2;
import a.rz4;
import a.sbl;
import a.sd9;
import a.tg9;
import a.uty;
import a.vtt0;
import a.w6x;
import a.x0x;
import android.gov.nist.core.Separators;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final int A;
    public final float B;
    public final int C;
    public final boolean D;
    public final float E;
    public final byte[] F;
    public final int G;
    public final c4d H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public int U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45386a;
    public final String b;
    public final b4x c;
    public final String d;
    public final int e;
    public final int f;
    public final float g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final String l;
    public final ed40 m;
    public final String n;
    public final String o;
    public final String p;
    public final int q;
    public final int r;
    public final List s;
    public final DrmInitData t;
    public final long u;
    public final boolean v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    static {
        new b(new awq());
        vtt0.H(0);
        vtt0.H(1);
        vtt0.H(2);
        vtt0.H(3);
        hne.s(4, 5, 6, 7, 8);
        hne.s(9, 10, 11, 12, 13);
        hne.s(14, 15, 16, 17, 18);
        hne.s(19, 20, 21, 22, 23);
        hne.s(24, 25, 26, 27, 28);
        hne.s(29, 30, 31, 32, 33);
        hne.s(34, 35, 36, 37, 38);
        vtt0.H(39);
        vtt0.H(40);
        vtt0.H(41);
    }

    public b(awq awqVar) {
        boolean z;
        String str;
        this.f45386a = awqVar.f1587a;
        String strN = vtt0.N(awqVar.d);
        this.d = strN;
        if (awqVar.c.isEmpty() && awqVar.b != null) {
            this.c = b4x.t(new uty(strN, awqVar.b));
            this.b = awqVar.b;
        } else if (awqVar.c.isEmpty() || awqVar.b != null) {
            if (!awqVar.c.isEmpty() || awqVar.b != null) {
                int i = 0;
                while (true) {
                    if (i >= awqVar.c.size()) {
                        z = false;
                        break;
                    } else {
                        if (((uty) awqVar.c.get(i)).b.equals(awqVar.b)) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                }
            } else {
                z = true;
                break;
            }
            x0x.K(z);
            this.c = awqVar.c;
            this.b = awqVar.b;
        } else {
            b4x b4xVar = awqVar.c;
            this.c = b4xVar;
            Iterator it = b4xVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((uty) b4xVar.get(0)).b;
                    break;
                }
                uty utyVar = (uty) it.next();
                if (TextUtils.equals(utyVar.f36277a, strN)) {
                    str = utyVar.b;
                    break;
                }
            }
            this.b = str;
        }
        this.e = awqVar.e;
        x0x.J("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", awqVar.h == 0 || (awqVar.f & 32768) != 0);
        this.f = awqVar.f;
        this.g = awqVar.g;
        this.h = awqVar.h;
        int i2 = awqVar.i;
        this.i = i2;
        int i3 = awqVar.j;
        this.j = i3;
        this.k = i3 != -1 ? i3 : i2;
        this.l = awqVar.k;
        this.m = awqVar.l;
        this.n = awqVar.m;
        this.o = awqVar.n;
        this.p = awqVar.o;
        this.q = awqVar.p;
        this.r = awqVar.q;
        List list = awqVar.r;
        this.s = list == null ? Collections.EMPTY_LIST : list;
        DrmInitData drmInitData = awqVar.s;
        this.t = drmInitData;
        this.u = awqVar.t;
        this.v = awqVar.u;
        this.w = awqVar.v;
        this.x = awqVar.w;
        this.y = awqVar.x;
        this.z = awqVar.y;
        this.A = awqVar.z;
        this.B = awqVar.A;
        int i4 = awqVar.B;
        this.C = i4 == -1 ? 0 : i4;
        this.D = awqVar.C;
        float f = awqVar.D;
        this.E = f == -1.0f ? 1.0f : f;
        this.F = awqVar.E;
        this.G = awqVar.F;
        this.H = awqVar.G;
        this.I = awqVar.H;
        int i5 = awqVar.I;
        this.J = i5;
        int i6 = awqVar.J;
        this.K = i6;
        if (i5 != -1 && i6 != -1) {
            if (!(Integer.bitCount(i6) == i5)) {
                jf4.n(jtm0.p("channelCount and channelMask are inconsistent. channelCount=%s, channelMask=%s", Integer.valueOf(i5), Integer.valueOf(i6)));
                throw null;
            }
        }
        this.L = awqVar.K;
        this.M = awqVar.L;
        int i7 = awqVar.M;
        this.N = i7 == -1 ? 0 : i7;
        int i8 = awqVar.N;
        this.O = i8 != -1 ? i8 : 0;
        this.P = awqVar.O;
        this.Q = awqVar.P;
        this.R = awqVar.Q;
        this.S = awqVar.R;
        int i9 = awqVar.S;
        if (i9 != 0 || drmInitData == null) {
            this.T = i9;
        } else {
            this.T = 1;
        }
    }

    public static String c(b bVar) {
        float f;
        int i;
        String str;
        String strK;
        if (bVar == null) {
            return "null";
        }
        int i2 = bVar.e;
        b4x b4xVar = bVar.c;
        String str2 = bVar.d;
        int i3 = bVar.L;
        int i4 = bVar.K;
        int i5 = bVar.J;
        int i6 = bVar.I;
        int i7 = bVar.C;
        float f2 = bVar.B;
        int i8 = bVar.y;
        c4d c4dVar = bVar.H;
        float f3 = bVar.E;
        int i9 = bVar.A;
        int i10 = bVar.z;
        int i11 = bVar.x;
        int i12 = bVar.w;
        DrmInitData drmInitData = bVar.t;
        String str3 = bVar.l;
        float f4 = bVar.g;
        int i13 = bVar.k;
        String str4 = bVar.n;
        String str5 = bVar.o;
        int i14 = bVar.f;
        pfw pfwVar = new pfw(String.valueOf(','));
        StringBuilder sbR = brm0.r("id=");
        sbR.append(bVar.f45386a);
        sbR.append(", mimeType=");
        sbR.append(bVar.p);
        if (str5 != null) {
            sbR.append(", container=");
            sbR.append(str5);
        }
        if (str4 != null) {
            sbR.append(", primaryGroupId=");
            sbR.append(str4);
        }
        if (i13 != -1) {
            sbR.append(", bitrate=");
            sbR.append(i13);
        }
        float f5 = -1.0f;
        if (f4 != -1.0f) {
            sbR.append(", selectionPriority=");
            sbR.append(f4);
        }
        if (str3 != null) {
            sbR.append(", codecs=");
            sbR.append(str3);
        }
        if (drmInitData != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i15 = 0;
            while (i15 < drmInitData.d) {
                UUID uuid = drmInitData.f45381a[i15].b;
                if (uuid.equals(tg9.b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(tg9.c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(tg9.e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(tg9.d)) {
                    linkedHashSet.add("widevine");
                } else {
                    if (uuid.equals(tg9.f33898a)) {
                        linkedHashSet.add("universal");
                    } else {
                        linkedHashSet.add("unknown (" + uuid + Separators.RPAREN);
                    }
                    i15++;
                    f5 = f5;
                }
                i15++;
                f5 = f5;
            }
            f = f5;
            sbR.append(", drm=[");
            pfwVar.a(sbR, linkedHashSet.iterator());
            sbR.append(']');
        } else {
            f = -1.0f;
        }
        if (i12 != -1 && i11 != -1) {
            rw2.s(i12, i11, ", res=", "x", sbR);
        }
        if (i10 != -1 && i9 != -1) {
            rw2.s(i10, i9, ", decRes=", "x", sbR);
        }
        double d = f3;
        int i16 = sbl.f31941a;
        if (Math.copySign(d - 1.0d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            sbR.append(", par=");
            Object[] objArr = {Float.valueOf(f3)};
            String str6 = vtt0.f38024a;
            sbR.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (c4dVar != null) {
            int i17 = c4dVar.f;
            int i18 = c4dVar.e;
            if ((i18 != -1 && i17 != -1) || c4dVar.d()) {
                sbR.append(", color=");
                if (c4dVar.d()) {
                    String strB = c4d.b(c4dVar.f3719a);
                    String strA = c4d.a(c4dVar.b);
                    String strC = c4d.c(c4dVar.c);
                    Locale locale = Locale.US;
                    strK = b1j.k(strB, Separators.SLASH, strA, Separators.SLASH, strC);
                } else {
                    strK = "NA/NA/NA";
                }
                sbR.append(strK + Separators.SLASH + ((i18 == -1 || i17 == -1) ? "NA/NA" : w6x.n(i18, i17, Separators.SLASH)));
            }
        }
        if (i8 != -1) {
            sbR.append(", pixelFormat=");
            sbR.append(i8);
        }
        if (f2 != f) {
            sbR.append(", fps=");
            sbR.append(f2);
        }
        if (i7 != 0) {
            sbR.append(", rotation=");
            sbR.append(i7);
        }
        if (bVar.D) {
            sbR.append(", mirrorHorizontal");
        }
        if (i6 != -1) {
            sbR.append(", maxSubLayers=");
            sbR.append(i6);
        }
        if (i5 != -1) {
            sbR.append(", channels=");
            sbR.append(i5);
        }
        if (i4 != -1) {
            sbR.append(", channel_mask=");
            sbR.append(i4);
        }
        if (i3 != -1) {
            sbR.append(", sample_rate=");
            sbR.append(i3);
        }
        if (str2 != null) {
            sbR.append(", language=");
            sbR.append(str2);
        }
        if (!b4xVar.isEmpty()) {
            sbR.append(", labels=[");
            pfwVar.a(sbR, x0x.j0(b4xVar, new sd9((byte) 6)).iterator());
            sbR.append("]");
        }
        if (i2 != 0) {
            sbR.append(", selectionFlags=[");
            String str7 = vtt0.f38024a;
            ArrayList arrayList = new ArrayList();
            if ((i2 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i2 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i2 & 2) != 0) {
                arrayList.add("forced");
            }
            pfwVar.a(sbR, arrayList.iterator());
            sbR.append("]");
        }
        if (i14 != 0) {
            sbR.append(", roleFlags=[");
            String str8 = vtt0.f38024a;
            ArrayList arrayList2 = new ArrayList();
            if ((i14 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i14 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i14 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i14 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i14 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i14 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i14 & 64) != 0) {
                arrayList2.add("caption");
            }
            i = i14;
            if ((i & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i & 32768) != 0) {
                arrayList2.add("auxiliary");
            }
            pfwVar.a(sbR, arrayList2.iterator());
            sbR.append("]");
        } else {
            i = i14;
        }
        if ((i & 32768) != 0) {
            sbR.append(", auxiliaryTrackType=");
            int i19 = bVar.h;
            String str9 = vtt0.f38024a;
            if (i19 == 0) {
                str = "undefined";
            } else if (i19 == 1) {
                str = "original";
            } else if (i19 == 2) {
                str = "depth-linear";
            } else if (i19 == 3) {
                str = "depth-inverse";
            } else {
                if (i19 != 4) {
                    jf4.n("Unsupported auxiliary track type");
                    return null;
                }
                str = "depth metadata";
            }
            sbR.append(str);
        }
        return sbR.toString();
    }

    public final awq a() {
        awq awqVar = new awq();
        awqVar.f1587a = this.f45386a;
        awqVar.b = this.b;
        awqVar.c = this.c;
        awqVar.d = this.d;
        awqVar.e = this.e;
        awqVar.f = this.f;
        awqVar.g = this.g;
        awqVar.i = this.i;
        awqVar.j = this.j;
        awqVar.k = this.l;
        awqVar.l = this.m;
        awqVar.m = this.n;
        awqVar.n = this.o;
        awqVar.o = this.p;
        awqVar.p = this.q;
        awqVar.q = this.r;
        awqVar.r = this.s;
        awqVar.s = this.t;
        awqVar.t = this.u;
        awqVar.u = this.v;
        awqVar.v = this.w;
        awqVar.w = this.x;
        awqVar.x = this.y;
        awqVar.y = this.z;
        awqVar.z = this.A;
        awqVar.A = this.B;
        awqVar.B = this.C;
        awqVar.C = this.D;
        awqVar.D = this.E;
        awqVar.E = this.F;
        awqVar.F = this.G;
        awqVar.G = this.H;
        awqVar.H = this.I;
        awqVar.I = this.J;
        awqVar.J = this.K;
        awqVar.K = this.L;
        awqVar.L = this.M;
        awqVar.M = this.N;
        awqVar.N = this.O;
        awqVar.O = this.P;
        awqVar.P = this.Q;
        awqVar.Q = this.R;
        awqVar.R = this.S;
        awqVar.S = this.T;
        return awqVar;
    }

    public final boolean b(b bVar) {
        List list = this.s;
        if (list.size() != bVar.s.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) bVar.s.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final b d(b bVar) {
        String str;
        b4x b4xVar;
        String str2;
        int i;
        float f;
        if (this == bVar) {
            return this;
        }
        int iH = mg40.h(this.p);
        String str3 = bVar.f45386a;
        b4x b4xVar2 = bVar.c;
        float f2 = bVar.g;
        int i2 = bVar.R;
        int i3 = bVar.S;
        String str4 = bVar.b;
        if (str4 == null) {
            str4 = this.b;
        }
        if (b4xVar2.isEmpty()) {
            b4xVar2 = this.c;
        }
        if ((iH != 3 && iH != 1) || (str = bVar.d) == null) {
            str = this.d;
        }
        int i4 = this.i;
        if (i4 == -1) {
            i4 = bVar.i;
        }
        int i5 = this.j;
        if (i5 == -1) {
            i5 = bVar.j;
        }
        String str5 = this.l;
        if (str5 == null) {
            String strS = vtt0.s(iH, bVar.l);
            if (vtt0.W(strS).length == 1) {
                str5 = strS;
            }
        }
        String str6 = this.n;
        if (str6 == null) {
            str6 = bVar.n;
        }
        ed40 ed40VarB = bVar.m;
        ed40 ed40Var = this.m;
        if (ed40Var != null) {
            ed40VarB = ed40Var.b(ed40VarB);
        }
        float f3 = this.B;
        if (f3 == -1.0f) {
            b4xVar = b4xVar2;
            if (iH == 2) {
                f3 = bVar.B;
            }
        } else {
            b4xVar = b4xVar2;
        }
        int i6 = this.e | bVar.e;
        int i7 = this.f | bVar.f;
        DrmInitData drmInitData = bVar.t;
        ArrayList arrayList = new ArrayList();
        if (drmInitData != null) {
            String str7 = drmInitData.c;
            DrmInitData.SchemeData[] schemeDataArr = drmInitData.f45381a;
            int length = schemeDataArr.length;
            int i8 = 0;
            while (i8 < length) {
                int i9 = i8;
                DrmInitData.SchemeData schemeData = schemeDataArr[i9];
                int i10 = length;
                if (schemeData.e != null) {
                    arrayList.add(schemeData);
                }
                i8 = i9 + 1;
                length = i10;
            }
            str2 = str7;
        } else {
            str2 = null;
        }
        DrmInitData drmInitData2 = this.t;
        if (drmInitData2 != null) {
            if (str2 == null) {
                str2 = drmInitData2.c;
            }
            int size = arrayList.size();
            DrmInitData.SchemeData[] schemeDataArr2 = drmInitData2.f45381a;
            String str8 = str2;
            int length2 = schemeDataArr2.length;
            int i11 = 0;
            while (i11 < length2) {
                int i12 = i11;
                DrmInitData.SchemeData schemeData2 = schemeDataArr2[i12];
                int i13 = length2;
                if (schemeData2.e != null) {
                    UUID uuid = schemeData2.b;
                    f = f3;
                    int i14 = 0;
                    while (true) {
                        if (i14 >= size) {
                            i = size;
                            arrayList.add(schemeData2);
                            break;
                        }
                        i = size;
                        if (((DrmInitData.SchemeData) arrayList.get(i14)).b.equals(uuid)) {
                            break;
                        }
                        i14++;
                        size = i;
                    }
                } else {
                    i = size;
                    f = f3;
                }
                i11 = i12 + 1;
                length2 = i13;
                f3 = f;
                size = i;
            }
            str2 = str8;
        }
        float f4 = f3;
        DrmInitData drmInitData3 = arrayList.isEmpty() ? null : new DrmInitData(str2, false, (DrmInitData.SchemeData[]) arrayList.toArray(new DrmInitData.SchemeData[0]));
        awq awqVarA = a();
        awqVarA.f1587a = str3;
        awqVarA.b = str4;
        awqVarA.c = b4x.o(b4xVar);
        awqVarA.d = str;
        awqVarA.e = i6;
        awqVarA.f = i7;
        awqVarA.g = f2;
        awqVarA.i = i4;
        awqVarA.j = i5;
        awqVarA.k = str5;
        awqVarA.l = ed40VarB;
        awqVarA.m = str6;
        awqVarA.s = drmInitData3;
        awqVarA.a(f4);
        awqVarA.Q = i2;
        awqVarA.R = i3;
        return new b(awqVarA);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        int i2 = this.U;
        return (i2 == 0 || (i = bVar.U) == 0 || i2 == i) && this.e == bVar.e && this.f == bVar.f && this.h == bVar.h && this.i == bVar.i && this.j == bVar.j && this.q == bVar.q && this.u == bVar.u && this.w == bVar.w && this.x == bVar.x && this.y == bVar.y && this.z == bVar.z && this.A == bVar.A && this.C == bVar.C && this.D == bVar.D && this.G == bVar.G && this.I == bVar.I && this.J == bVar.J && this.K == bVar.K && this.L == bVar.L && this.M == bVar.M && this.N == bVar.N && this.O == bVar.O && this.P == bVar.P && this.R == bVar.R && this.S == bVar.S && this.T == bVar.T && Float.compare(this.B, bVar.B) == 0 && Float.compare(this.g, bVar.g) == 0 && Float.compare(this.E, bVar.E) == 0 && Objects.equals(this.f45386a, bVar.f45386a) && Objects.equals(this.b, bVar.b) && this.c.equals(bVar.c) && Objects.equals(this.l, bVar.l) && Objects.equals(this.n, bVar.n) && Objects.equals(this.o, bVar.o) && Objects.equals(this.p, bVar.p) && Objects.equals(this.d, bVar.d) && Arrays.equals(this.F, bVar.F) && Objects.equals(this.m, bVar.m) && Objects.equals(this.H, bVar.H) && Objects.equals(this.t, bVar.t) && b(bVar);
    }

    public final int hashCode() {
        int i = this.U;
        if (i != 0) {
            return i;
        }
        String str = this.f45386a;
        int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.d;
        int iFloatToIntBits = (((((((Float.floatToIntBits(this.g) + ((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.e) * 31) + this.f) * 31)) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31;
        String str4 = this.l;
        int iHashCode3 = (iFloatToIntBits + (str4 == null ? 0 : str4.hashCode())) * 31;
        ed40 ed40Var = this.m;
        int iHashCode4 = (iHashCode3 + (ed40Var == null ? 0 : ed40Var.hashCode())) * 961;
        String str5 = this.n;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.o;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.p;
        int iFloatToIntBits2 = ((((((((((((((((((((((((Float.floatToIntBits(this.E) + ((((((Float.floatToIntBits(this.B) + ((((((((((((((((iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.q) * 31) + ((int) this.u)) * 31) + this.w) * 31) + this.x) * 31) + this.y) * 31) + this.z) * 31) + this.A) * 31)) * 31) + this.C) * 31) + (this.D ? 1 : 0)) * 31)) * 31) + this.G) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.R) * 31) + this.S) * 31) + this.T;
        this.U = iFloatToIntBits2;
        return iFloatToIntBits2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.f45386a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.o);
        sb.append(", ");
        sb.append(this.p);
        sb.append(", ");
        sb.append(this.l);
        sb.append(", ");
        sb.append(this.k);
        sb.append(", ");
        sb.append(this.d);
        sb.append(", [");
        sb.append(this.w);
        sb.append(", ");
        sb.append(this.x);
        sb.append(", ");
        sb.append(this.B);
        sb.append(", ");
        sb.append(this.H);
        sb.append("], [");
        sb.append(this.J);
        sb.append(", ");
        sb.append(this.K);
        sb.append(", ");
        return rz4.j(this.L, "])", sb);
    }
}
