package a;

import android.javax.sip.message.Response;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class buj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f3233a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final u3u0 c = new u3u0();
    public pv00 d;
    public byte e;
    public int f;
    public long g;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:167:0x029e  */
    /* JADX WARN: Code duplicated, block: B:312:0x046e  */
    /* JADX WARN: Code duplicated, block: B:463:0x06bf A[PHI: r3 r12 r28
  0x06bf: PHI (r3v118 java.util.List) = (r3v81 java.util.List), (r3v86 java.util.List), (r3v111 java.util.List), (r3v120 java.util.List) binds: [B:510:0x0840, B:504:0x0822, B:474:0x0709, B:462:0x06bd] A[DONT_GENERATE, DONT_INLINE]
  0x06bf: PHI (r12v79 java.lang.String) = (r12v51 java.lang.String), (r12v54 java.lang.String), (r12v72 java.lang.String), (r12v80 java.lang.String) binds: [B:510:0x0840, B:504:0x0822, B:474:0x0709, B:462:0x06bd] A[DONT_GENERATE, DONT_INLINE]
  0x06bf: PHI (r28v50 java.lang.String) = (r28v19 java.lang.String), (r28v21 java.lang.String), (r28v40 java.lang.String), (r28v51 java.lang.String) binds: [B:510:0x0840, B:504:0x0822, B:474:0x0709, B:462:0x06bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:466:0x06cc A[PHI: r3 r4 r12 r28
  0x06cc: PHI (r3v115 java.util.List) = (r3v111 java.util.List), (r3v120 java.util.List) binds: [B:474:0x0709, B:462:0x06bd] A[DONT_GENERATE, DONT_INLINE]
  0x06cc: PHI (r4v65 int) = (r4v61 int), (r4v69 int) binds: [B:474:0x0709, B:462:0x06bd] A[DONT_GENERATE, DONT_INLINE]
  0x06cc: PHI (r12v77 java.lang.String) = (r12v72 java.lang.String), (r12v80 java.lang.String) binds: [B:474:0x0709, B:462:0x06bd] A[DONT_GENERATE, DONT_INLINE]
  0x06cc: PHI (r28v47 java.lang.String) = (r28v40 java.lang.String), (r28v51 java.lang.String) binds: [B:474:0x0709, B:462:0x06bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:633:0x0b2f  */
    /* JADX WARN: Code duplicated, block: B:635:0x0b3e  */
    /* JADX WARN: Code duplicated, block: B:636:0x0b45  */
    /* JADX WARN: Code duplicated, block: B:640:0x0b51  */
    /* JADX WARN: Code duplicated, block: B:641:0x0b54  */
    /* JADX WARN: Code duplicated, block: B:644:0x0b65  */
    /* JADX WARN: Code duplicated, block: B:645:0x0b75  */
    /* JADX WARN: Code duplicated, block: B:647:0x0b7b  */
    /* JADX WARN: Code duplicated, block: B:649:0x0b7f  */
    /* JADX WARN: Code duplicated, block: B:651:0x0b84  */
    /* JADX WARN: Code duplicated, block: B:654:0x0b8c  */
    /* JADX WARN: Code duplicated, block: B:656:0x0b91  */
    /* JADX WARN: Code duplicated, block: B:659:0x0b98  */
    /* JADX WARN: Code duplicated, block: B:663:0x0ba7  */
    /* JADX WARN: Code duplicated, block: B:665:0x0bab A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:668:0x0bb0  */
    /* JADX WARN: Code duplicated, block: B:672:0x0bc0  */
    /* JADX WARN: Code duplicated, block: B:674:0x0bc9 A[PHI: r3
  0x0bc9: PHI (r3v153 int) = (r3v121 int), (r3v128 int) binds: [B:673:0x0bc7, B:676:0x0bce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:675:0x0bcc  */
    /* JADX WARN: Code duplicated, block: B:680:0x0bd5  */
    /* JADX WARN: Code duplicated, block: B:681:0x0bd8  */
    /* JADX WARN: Code duplicated, block: B:683:0x0bdc  */
    /* JADX WARN: Code duplicated, block: B:684:0x0bdf  */
    /* JADX WARN: Code duplicated, block: B:687:0x0be7  */
    /* JADX WARN: Code duplicated, block: B:707:0x0c9d  */
    /* JADX WARN: Code duplicated, block: B:710:0x0caa  */
    /* JADX WARN: Code duplicated, block: B:713:0x0cbd  */
    /* JADX WARN: Code duplicated, block: B:716:0x0cc2  */
    /* JADX WARN: Code duplicated, block: B:735:0x0d0f  */
    /* JADX WARN: Code duplicated, block: B:737:0x0d27  */
    /* JADX WARN: Code duplicated, block: B:739:0x0d2d  */
    /* JADX WARN: Code duplicated, block: B:754:0x0d58  */
    /* JADX WARN: Code duplicated, block: B:759:0x0d6c  */
    /* JADX WARN: Code duplicated, block: B:760:0x0d6f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r5v127, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v130 */
    /* JADX WARN: Type inference failed for: r5v131, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r5v132 */
    /* JADX WARN: Type inference failed for: r5v145 */
    /* JADX WARN: Type inference failed for: r5v146, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r6v121 */
    public final boolean a(guo guoVar) {
        int i;
        boolean z;
        int i2;
        String str;
        int i3;
        int iA;
        String str2;
        byte b;
        List listSingletonList;
        int i4;
        ?? r5;
        String str3;
        int i5;
        String str4;
        String str5;
        int i6;
        Pair pair;
        String str6;
        String str7;
        String str8;
        int i7;
        int i8;
        List list;
        int i9;
        int i10;
        int i11;
        String str9;
        int i12;
        int i13;
        int i14;
        List listT;
        int iX;
        int iZ;
        int i15;
        String str10;
        int i16;
        awq awqVar;
        int i17;
        int i18;
        float f;
        int i19;
        int i20;
        int i21;
        byte[] bArr;
        String str11;
        int iIntValue;
        int i22;
        int i23;
        int i24;
        int i25;
        String str12;
        String str13;
        hbb hbbVarA;
        int i26;
        this.d.getClass();
        while (true) {
            ArrayDeque arrayDeque = this.b;
            auj aujVar = (auj) arrayDeque.peek();
            int i27 = 0;
            if (aujVar != null) {
                i = 8;
                if (guoVar.getPosition() >= aujVar.b) {
                    pv00 pv00Var = this.d;
                    int i28 = ((auj) arrayDeque.pop()).f1480a;
                    cj30 cj30Var = (cj30) pv00Var.f27640a;
                    Map map = cj30.w0;
                    SparseArray sparseArray = cj30Var.F;
                    SparseArray sparseArray2 = cj30Var.c;
                    cj30Var.q0.getClass();
                    if (i28 == 128) {
                        yi30 yi30Var = cj30Var.A;
                        yi30Var.getClass();
                        if (yi30Var.f != null || (str2 = yi30Var.h) == null) {
                            return true;
                        }
                        yi30Var.f = str2;
                        String str14 = yi30Var.i;
                        if (str14 == null) {
                            return true;
                        }
                        yi30Var.g = str14;
                        return true;
                    }
                    if (i28 == 160) {
                        if (cj30Var.V != 2) {
                            return true;
                        }
                        bj30 bj30Var = (bj30) sparseArray2.get(cj30Var.b0);
                        bj30Var.d0.getClass();
                        if (cj30Var.g0 > 0 && "A_OPUS".equals(bj30Var.c)) {
                            fq80 fq80Var = cj30Var.r;
                            byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(cj30Var.g0).array();
                            fq80Var.getClass();
                            fq80Var.K(bArrArray, bArrArray.length);
                        }
                        int i29 = 0;
                        for (int i30 = 0; i30 < cj30Var.Z; i30++) {
                            i29 += cj30Var.a0[i30];
                        }
                        int i31 = 0;
                        while (i31 < cj30Var.Z) {
                            long j = cj30Var.W + ((long) ((bj30Var.g * i31) / 1000));
                            int i32 = cj30Var.d0;
                            if (i31 == 0 && !cj30Var.f0) {
                                i32 |= 1;
                            }
                            int i33 = cj30Var.a0[i31];
                            int i34 = i29 - i33;
                            cj30Var.i(bj30Var, j, i32, i33, i34);
                            i31++;
                            i29 = i34;
                        }
                        cj30Var.V = (byte) 0;
                        return true;
                    }
                    String str15 = "video/webm";
                    if (i28 != 174) {
                        if (i28 == 17849) {
                            while (i27 < sparseArray2.size()) {
                                cj30Var.q((bj30) sparseArray2.valueAt(i27));
                                i27++;
                            }
                        } else {
                            if (i28 == 19899) {
                                int i35 = cj30Var.D;
                                if (i35 != -1) {
                                    long j2 = cj30Var.E;
                                    if (j2 != -1) {
                                        if (i35 == 475249515) {
                                            cj30Var.N = j2;
                                            return true;
                                        }
                                        if (i35 == 374648427) {
                                            cj30Var.P = j2;
                                            return true;
                                        }
                                    }
                                }
                                throw kq80.a("Mandatory element SeekID or SeekPosition not found", null);
                            }
                            if (i28 == 25152) {
                                cj30Var.h(i28);
                                bj30 bj30Var2 = cj30Var.B;
                                if (bj30Var2.j) {
                                    mcs0 mcs0Var = bj30Var2.l;
                                    if (mcs0Var == null) {
                                        throw kq80.a("Encrypted Track found but ContentEncKeyID was not found", null);
                                    }
                                    bj30Var2.n = new DrmInitData(null, true, new DrmInitData.SchemeData(tg9.f33898a, null, "video/webm", mcs0Var.b));
                                    return true;
                                }
                            } else if (i28 == 28032) {
                                cj30Var.h(i28);
                                bj30 bj30Var3 = cj30Var.B;
                                if (bj30Var3.j && bj30Var3.k != null) {
                                    throw kq80.a("Combining encryption and compression is not supported", null);
                                }
                            } else if (i28 == 357149030) {
                                if (cj30Var.v == -9223372036854775807L) {
                                    cj30Var.v = 1000000L;
                                }
                                long j3 = cj30Var.w;
                                if (j3 != -9223372036854775807L) {
                                    cj30Var.x = cj30Var.p(j3);
                                    return true;
                                }
                            } else if (i28 == 374648427) {
                                if (sparseArray2.size() == 0) {
                                    throw kq80.a("No valid tracks were found", null);
                                }
                                ?? r1 = !cj30Var.e || cj30Var.N == -1 || cj30Var.C;
                                int i36 = -1;
                                int i37 = -1;
                                int i38 = -1;
                                int i39 = -1;
                                for (int i40 = 0; i40 < sparseArray2.size(); i40++) {
                                    bj30 bj30Var4 = (bj30) sparseArray2.valueAt(i40);
                                    int i41 = bj30Var4.f;
                                    if (i41 == 2) {
                                        if (bj30Var4.b0) {
                                            i36 = bj30Var4.d;
                                        }
                                        if (i37 == -1) {
                                            i37 = bj30Var4.d;
                                        }
                                    } else if (i41 == 1) {
                                        if (bj30Var4.b0) {
                                            i38 = bj30Var4.d;
                                        }
                                        if (i39 == -1) {
                                            i39 = bj30Var4.d;
                                        }
                                    }
                                    if (r1 != false && !bj30Var4.X) {
                                        cj30Var.q(bj30Var4);
                                        bj30Var4.d0.getClass();
                                        ncs0 ncs0Var = bj30Var4.d0;
                                        androidx.media3.common.b bVar = bj30Var4.e0;
                                        bVar.getClass();
                                        ncs0Var.c(bVar);
                                    }
                                }
                                if (i36 != -1) {
                                    cj30Var.L = i36;
                                } else if (i37 != -1) {
                                    cj30Var.L = i37;
                                } else if (i38 != -1) {
                                    cj30Var.L = i38;
                                } else if (i39 != -1) {
                                    cj30Var.L = i39;
                                } else {
                                    cj30Var.L = sparseArray2.size() > 0 ? ((bj30) sparseArray2.valueAt(0)).d : -1;
                                }
                                cj30Var.S = true;
                                if (cj30Var.R != -1) {
                                    cj30Var.m();
                                }
                                if (r1 != false) {
                                    cj30Var.l();
                                    return true;
                                }
                            } else if (i28 != 475249515) {
                                if (i28 == 182) {
                                    yi30 yi30Var2 = cj30Var.A;
                                    yi30Var2.getClass();
                                    long j4 = yi30Var2.f42667a;
                                    if (j4 != 0) {
                                        cj30Var.d.put(j4, yi30Var2);
                                    }
                                    cj30Var.A = null;
                                    return true;
                                }
                                if (i28 == 183 && !cj30Var.C) {
                                    cj30Var.g(i28);
                                    if (cj30Var.H != -9223372036854775807L && (i26 = cj30Var.I) != -1 && cj30Var.J != -1) {
                                        List arrayList = (List) sparseArray.get(i26);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            sparseArray.put(cj30Var.I, arrayList);
                                        }
                                        arrayList.add(new zi30(cj30Var.H, cj30Var.u + cj30Var.J, cj30Var.K));
                                        return true;
                                    }
                                }
                            } else if (!cj30Var.C) {
                                int i42 = 0;
                                while (true) {
                                    if (i42 < sparseArray.size()) {
                                        if (((List) sparseArray.valueAt(i42)).isEmpty()) {
                                            i42++;
                                        } else if (cj30Var.x != -9223372036854775807L) {
                                            for (int i43 = 0; i43 < sparseArray.size(); i43++) {
                                                Collections.sort((List) sparseArray.valueAt(i43));
                                            }
                                            cj30Var.q0.f(new aj30(sparseArray, cj30Var.x, cj30Var.L, cj30Var.u, cj30Var.t));
                                        }
                                    }
                                    cj30Var.q0.f(new ca5(cj30Var.x));
                                }
                                cj30Var.C = true;
                                cj30Var.G = false;
                                while (i27 < sparseArray2.size()) {
                                    bj30 bj30Var5 = (bj30) sparseArray2.valueAt(i27);
                                    if (!bj30Var5.X) {
                                        cj30Var.q(bj30Var5);
                                        bj30Var5.d0.getClass();
                                        ncs0 ncs0Var2 = bj30Var5.d0;
                                        androidx.media3.common.b bVar2 = bj30Var5.e0;
                                        bVar2.getClass();
                                        ncs0Var2.c(bVar2);
                                    }
                                    i27++;
                                }
                                cj30Var.l();
                                return true;
                            }
                        }
                        return true;
                    }
                    bj30 bj30Var6 = cj30Var.B;
                    bj30Var6.getClass();
                    String str16 = bj30Var6.c;
                    if (str16 == null) {
                        throw kq80.a("CodecId is missing in TrackEntry element", null);
                    }
                    switch (str16) {
                        case "V_MPEG4/ISO/AP":
                        case "V_MPEG4/ISO/SP":
                        case "A_MS/ACM":
                        case "A_TRUEHD":
                        case "A_VORBIS":
                        case "A_MPEG/L2":
                        case "A_MPEG/L3":
                        case "V_MS/VFW/FOURCC":
                        case "S_DVBSUB":
                        case "V_MPEG4/ISO/ASP":
                        case "V_MPEG4/ISO/AVC":
                        case "S_VOBSUB":
                        case "A_DTS/LOSSLESS":
                        case "A_AAC":
                        case "A_AC3":
                        case "A_DTS":
                        case "V_AV1":
                        case "V_VP8":
                        case "V_VP9":
                        case "S_HDMV/PGS":
                        case "V_THEORA":
                        case "A_DTS/EXPRESS":
                        case "A_PCM/FLOAT/IEEE":
                        case "A_PCM/INT/BIG":
                        case "A_PCM/INT/LIT":
                        case "S_TEXT/ASS":
                        case "S_TEXT/SSA":
                        case "V_MPEGH/ISO/HEVC":
                        case "S_TEXT/WEBVTT":
                        case "S_TEXT/UTF8":
                        case "V_MPEG2":
                        case "A_ALAC":
                        case "A_EAC3":
                        case "A_FLAC":
                        case "A_OPUS":
                            int i44 = bj30Var6.d;
                            switch (str16) {
                                case "V_MPEG4/ISO/AP":
                                    b = 0;
                                    break;
                                case "V_MPEG4/ISO/SP":
                                    b = 1;
                                    break;
                                case "A_MS/ACM":
                                    b = 2;
                                    break;
                                case "A_TRUEHD":
                                    b = 3;
                                    break;
                                case "A_VORBIS":
                                    b = 4;
                                    break;
                                case "A_MPEG/L2":
                                    b = 5;
                                    break;
                                case "A_MPEG/L3":
                                    b = 6;
                                    break;
                                case "V_MS/VFW/FOURCC":
                                    b = 7;
                                    break;
                                case "S_DVBSUB":
                                    b = 8;
                                    break;
                                case "V_MPEG4/ISO/ASP":
                                    b = 9;
                                    break;
                                case "V_MPEG4/ISO/AVC":
                                    b = 10;
                                    break;
                                case "S_VOBSUB":
                                    b = 11;
                                    break;
                                case "A_DTS/LOSSLESS":
                                    b = 12;
                                    break;
                                case "A_AAC":
                                    b = 13;
                                    break;
                                case "A_AC3":
                                    b = 14;
                                    break;
                                case "A_DTS":
                                    b = 15;
                                    break;
                                case "V_AV1":
                                    b = 16;
                                    break;
                                case "V_VP8":
                                    b = 17;
                                    break;
                                case "V_VP9":
                                    b = 18;
                                    break;
                                case "S_HDMV/PGS":
                                    b = 19;
                                    break;
                                case "V_THEORA":
                                    b = 20;
                                    break;
                                case "A_DTS/EXPRESS":
                                    b = 21;
                                    break;
                                case "A_PCM/FLOAT/IEEE":
                                    b = 22;
                                    break;
                                case "A_PCM/INT/BIG":
                                    b = 23;
                                    break;
                                case "A_PCM/INT/LIT":
                                    b = 24;
                                    break;
                                case "S_TEXT/ASS":
                                    b = 25;
                                    break;
                                case "S_TEXT/SSA":
                                    b = 26;
                                    break;
                                case "V_MPEGH/ISO/HEVC":
                                    b = 27;
                                    break;
                                case "S_TEXT/WEBVTT":
                                    b = 28;
                                    break;
                                case "S_TEXT/UTF8":
                                    b = 29;
                                    break;
                                case "V_MPEG2":
                                    b = 30;
                                    break;
                                case "A_ALAC":
                                    b = 31;
                                    break;
                                case "A_EAC3":
                                    b = 32;
                                    break;
                                case "A_FLAC":
                                    b = 33;
                                    break;
                                case "A_OPUS":
                                    b = 34;
                                    break;
                                default:
                                    b = -1;
                                    break;
                            }
                            String str17 = "video/x-unknown";
                            byte b2 = b;
                            ?? r6 = "MatroskaExtractor";
                            switch (b2) {
                                case 0:
                                case 1:
                                case 9:
                                    str15 = "video/webm";
                                    byte[] bArr2 = bj30Var6.m;
                                    str17 = "video/mp4v-es";
                                    listSingletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    if (bj30Var6.P != null) {
                                        i15 = i5;
                                        hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                        if (hbbVarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = hbbVarA.b;
                                        }
                                        boolean z2 = bj30Var6.b0;
                                        if (bj30Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i45 = (z2 ? 1 : 0) | i16;
                                        awqVar = new awq();
                                        if (mg40.i(str10)) {
                                            awqVar.I = bj30Var6.Q;
                                            awqVar.J = bj30Var6.S;
                                            awqVar.K = bj30Var6.T;
                                            awqVar.L = i4;
                                        } else if (mg40.m(str10)) {
                                            if (bj30Var6.t == 0) {
                                                i24 = bj30Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = bj30Var6.o;
                                                }
                                                bj30Var6.r = i24;
                                                i25 = bj30Var6.s;
                                                if (i25 == -1) {
                                                    i25 = bj30Var6.p;
                                                }
                                                bj30Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = bj30Var6.r;
                                            if (i18 != i17 || (i23 = bj30Var6.s) == i17) {
                                                f = -1.0f;
                                            } else {
                                                f = (bj30Var6.p * i18) / (bj30Var6.o * i23);
                                            }
                                            if (i12 == -1 && i8 == -1) {
                                                if (i13 == -1 && bj30Var6.C == -1) {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                } else {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                }
                                            }
                                            int i46 = i12;
                                            int i47 = i13;
                                            int i48 = i8;
                                            if (i6 != -1 && (i6 = bj30Var6.q) == -1) {
                                                i19 = 8;
                                            } else {
                                                i19 = i6;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = bj30Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (bj30Var6.F != -1.0f || bj30Var6.G == -1.0f || bj30Var6.H == -1.0f || bj30Var6.I == -1.0f || bj30Var6.J == -1.0f || bj30Var6.K == -1.0f || bj30Var6.L == -1.0f || bj30Var6.M == -1.0f || bj30Var6.N == -1.0f || bj30Var6.O == -1.0f) {
                                                bArr = null;
                                            } else {
                                                byte[] bArr3 = new byte[25];
                                                ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr3).order(ByteOrder.LITTLE_ENDIAN);
                                                byteBufferOrder.put((byte) 0);
                                                byteBufferOrder.putShort((short) ((bj30Var6.F * 50000.0f) + 0.5f));
                                                byteBufferOrder.putShort((short) ((bj30Var6.G * 50000.0f) + 0.5f));
                                                byteBufferOrder.putShort((short) ((bj30Var6.H * 50000.0f) + 0.5f));
                                                byteBufferOrder.putShort((short) ((bj30Var6.I * 50000.0f) + 0.5f));
                                                byteBufferOrder.putShort((short) ((bj30Var6.J * 50000.0f) + 0.5f));
                                                byteBufferOrder.putShort((short) ((bj30Var6.K * 50000.0f) + 0.5f));
                                                byteBufferOrder.putShort((short) ((bj30Var6.L * 50000.0f) + 0.5f));
                                                byteBufferOrder.putShort((short) ((bj30Var6.M * 50000.0f) + 0.5f));
                                                byteBufferOrder.putShort((short) (bj30Var6.N + 0.5f));
                                                byteBufferOrder.putShort((short) (bj30Var6.O + 0.5f));
                                                byteBufferOrder.putShort((short) bj30Var6.D);
                                                byteBufferOrder.putShort((short) bj30Var6.E);
                                                bArr = bArr3;
                                            }
                                            c4d c4dVar = new c4d(i46, i47, i48, bArr, i19, i21);
                                            str11 = bj30Var6.b;
                                            if (str11 == null && map.containsKey(str11)) {
                                                iIntValue = ((Integer) map.get(bj30Var6.b)).intValue();
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (bj30Var6.u == 0 || Float.compare(bj30Var6.v, 0.0f) != 0 || Float.compare(bj30Var6.w, 0.0f) != 0) {
                                                i22 = iIntValue;
                                            } else if (Float.compare(bj30Var6.x, 0.0f) == 0) {
                                                i22 = 0;
                                            } else if (Float.compare(bj30Var6.x, 90.0f) == 0) {
                                                i22 = 90;
                                            } else if (Float.compare(bj30Var6.x, -180.0f) == 0 || Float.compare(bj30Var6.x, 180.0f) == 0) {
                                                i22 = 180;
                                            } else if (Float.compare(bj30Var6.x, -90.0f) == 0) {
                                                i22 = SubsamplingScaleImageView.ORIENTATION_270;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            awqVar.v = bj30Var6.o;
                                            awqVar.w = bj30Var6.p;
                                            awqVar.D = f;
                                            awqVar.B = i22;
                                            awqVar.E = bj30Var6.y;
                                            awqVar.F = bj30Var6.z;
                                            awqVar.G = c4dVar;
                                        } else if (!"application/x-subrip".equals(str10) && !"text/x-ssa".equals(str10) && !"text/vtt".equals(str10) && !"application/vobsub".equals(str10) && !"application/pgs".equals(str10) && !"application/dvbsubs".equals(str10)) {
                                            throw kq80.a("Unexpected MIME type.", null);
                                        }
                                        str12 = bj30Var6.b;
                                        if (str12 != null && !map.containsKey(str12)) {
                                            awqVar.b = bj30Var6.b;
                                        }
                                        awqVar.f1587a = Integer.toString(i44);
                                        if (bj30Var6.f2686a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        awqVar.n = mg40.n(str13);
                                        awqVar.o = mg40.n(str10);
                                        awqVar.p = i15;
                                        awqVar.d = bj30Var6.c0;
                                        awqVar.e = i45;
                                        awqVar.r = listSingletonList;
                                        awqVar.k = str7;
                                        awqVar.s = bj30Var6.n;
                                        bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                        cj30Var = cj30Var;
                                        bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                        sparseArray2.put(bj30Var6.d, bj30Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z3 = bj30Var6.b0;
                                    if (bj30Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i49 = (z3 ? 1 : 0) | i16;
                                    awqVar = new awq();
                                    if (mg40.i(str10)) {
                                        awqVar.I = bj30Var6.Q;
                                        awqVar.J = bj30Var6.S;
                                        awqVar.K = bj30Var6.T;
                                        awqVar.L = i4;
                                    } else if (mg40.m(str10)) {
                                        if (bj30Var6.t == 0) {
                                            i24 = bj30Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = bj30Var6.o;
                                            }
                                            bj30Var6.r = i24;
                                            i25 = bj30Var6.s;
                                            if (i25 == -1) {
                                                i25 = bj30Var6.p;
                                            }
                                            bj30Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = bj30Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            } else {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            }
                                        }
                                        int i410 = i12;
                                        int i411 = i13;
                                        int i412 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = bj30Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (bj30Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        c4d c4dVar2 = new c4d(i410, i411, i412, bArr, i19, i21);
                                        str11 = bj30Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (bj30Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        awqVar.v = bj30Var6.o;
                                        awqVar.w = bj30Var6.p;
                                        awqVar.D = f;
                                        awqVar.B = i22;
                                        awqVar.E = bj30Var6.y;
                                        awqVar.F = bj30Var6.z;
                                        awqVar.G = c4dVar2;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw kq80.a("Unexpected MIME type.", null);
                                    }
                                    str12 = bj30Var6.b;
                                    if (str12 != null) {
                                        awqVar.b = bj30Var6.b;
                                    }
                                    awqVar.f1587a = Integer.toString(i44);
                                    if (bj30Var6.f2686a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    awqVar.n = mg40.n(str13);
                                    awqVar.o = mg40.n(str10);
                                    awqVar.p = i15;
                                    awqVar.d = bj30Var6.c0;
                                    awqVar.e = i49;
                                    awqVar.r = listSingletonList;
                                    awqVar.k = str7;
                                    awqVar.s = bj30Var6.n;
                                    bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                    cj30Var = cj30Var;
                                    bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                    sparseArray2.put(bj30Var6.d, bj30Var6);
                                    break;
                                case 2:
                                    i44 = i44;
                                    sparseArray2 = sparseArray2;
                                    str15 = "video/webm";
                                    fq80 fq80Var2 = new fq80(bj30Var6.a(bj30Var6.c));
                                    try {
                                        int iS = fq80Var2.s();
                                        if (iS != 1) {
                                            if (iS == 65534) {
                                                fq80Var2.M(20);
                                                int iR = fq80Var2.r();
                                                if ((iR >> 18) == 0 && (iR == 0 || Integer.bitCount(iR) == bj30Var6.Q)) {
                                                    bj30Var6.S = iR == 0 ? -1 : iR << 2;
                                                }
                                                long jT = fq80Var2.t();
                                                UUID uuid = cj30.v0;
                                                if (jT != uuid.getMostSignificantBits() || fq80Var2.t() != uuid.getLeastSignificantBits()) {
                                                }
                                                str5 = "audio/x-unknown";
                                                i6 = -1;
                                                i5 = -1;
                                                i4 = -1;
                                                i12 = -1;
                                                i13 = -1;
                                                i14 = -1;
                                                i8 = -1;
                                                str7 = null;
                                                listSingletonList = null;
                                                if (bj30Var6.P != null) {
                                                    i15 = i5;
                                                    hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                                    if (hbbVarA != null) {
                                                        str10 = "video/dolby-vision";
                                                        str7 = hbbVarA.b;
                                                    }
                                                    boolean z4 = bj30Var6.b0;
                                                    if (bj30Var6.a0) {
                                                        i16 = 2;
                                                    } else {
                                                        i16 = 0;
                                                    }
                                                    int i413 = (z4 ? 1 : 0) | i16;
                                                    awqVar = new awq();
                                                    if (mg40.i(str10)) {
                                                        awqVar.I = bj30Var6.Q;
                                                        awqVar.J = bj30Var6.S;
                                                        awqVar.K = bj30Var6.T;
                                                        awqVar.L = i4;
                                                    } else if (mg40.m(str10)) {
                                                        if (bj30Var6.t == 0) {
                                                            i24 = bj30Var6.r;
                                                            i17 = -1;
                                                            if (i24 == -1) {
                                                                i24 = bj30Var6.o;
                                                            }
                                                            bj30Var6.r = i24;
                                                            i25 = bj30Var6.s;
                                                            if (i25 == -1) {
                                                                i25 = bj30Var6.p;
                                                            }
                                                            bj30Var6.s = i25;
                                                        } else {
                                                            i17 = -1;
                                                        }
                                                        i18 = bj30Var6.r;
                                                        if (i18 != i17) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (i12 == -1) {
                                                            if (i13 == -1) {
                                                                i12 = bj30Var6.A;
                                                                i8 = bj30Var6.B;
                                                                i13 = bj30Var6.C;
                                                            } else {
                                                                i12 = bj30Var6.A;
                                                                i8 = bj30Var6.B;
                                                                i13 = bj30Var6.C;
                                                            }
                                                        }
                                                        int i414 = i12;
                                                        int i415 = i13;
                                                        int i416 = i8;
                                                        if (i6 != -1) {
                                                            i19 = i6;
                                                        } else {
                                                            i19 = 8;
                                                        }
                                                        if (i14 != -1) {
                                                            i21 = i14;
                                                        } else {
                                                            i20 = bj30Var6.q;
                                                            if (i20 != -1) {
                                                                i21 = i20;
                                                            } else {
                                                                i21 = 8;
                                                            }
                                                        }
                                                        if (bj30Var6.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        c4d c4dVar3 = new c4d(i414, i415, i416, bArr, i19, i21);
                                                        str11 = bj30Var6.b;
                                                        if (str11 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (bj30Var6.u == 0) {
                                                            i22 = iIntValue;
                                                        } else {
                                                            i22 = iIntValue;
                                                        }
                                                        awqVar.v = bj30Var6.o;
                                                        awqVar.w = bj30Var6.p;
                                                        awqVar.D = f;
                                                        awqVar.B = i22;
                                                        awqVar.E = bj30Var6.y;
                                                        awqVar.F = bj30Var6.z;
                                                        awqVar.G = c4dVar3;
                                                    } else if (!"application/x-subrip".equals(str10)) {
                                                        throw kq80.a("Unexpected MIME type.", null);
                                                    }
                                                    str12 = bj30Var6.b;
                                                    if (str12 != null) {
                                                        awqVar.b = bj30Var6.b;
                                                    }
                                                    awqVar.f1587a = Integer.toString(i44);
                                                    if (bj30Var6.f2686a) {
                                                        str13 = str15;
                                                    } else {
                                                        str13 = "video/x-matroska";
                                                    }
                                                    awqVar.n = mg40.n(str13);
                                                    awqVar.o = mg40.n(str10);
                                                    awqVar.p = i15;
                                                    awqVar.d = bj30Var6.c0;
                                                    awqVar.e = i413;
                                                    awqVar.r = listSingletonList;
                                                    awqVar.k = str7;
                                                    awqVar.s = bj30Var6.n;
                                                    bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                                    cj30Var = cj30Var;
                                                    bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                                    sparseArray2.put(bj30Var6.d, bj30Var6);
                                                } else {
                                                    i15 = i5;
                                                }
                                                str10 = str5;
                                                boolean z5 = bj30Var6.b0;
                                                if (bj30Var6.a0) {
                                                    i16 = 2;
                                                } else {
                                                    i16 = 0;
                                                }
                                                int i417 = (z5 ? 1 : 0) | i16;
                                                awqVar = new awq();
                                                if (mg40.i(str10)) {
                                                    awqVar.I = bj30Var6.Q;
                                                    awqVar.J = bj30Var6.S;
                                                    awqVar.K = bj30Var6.T;
                                                    awqVar.L = i4;
                                                } else if (mg40.m(str10)) {
                                                    if (bj30Var6.t == 0) {
                                                        i24 = bj30Var6.r;
                                                        i17 = -1;
                                                        if (i24 == -1) {
                                                            i24 = bj30Var6.o;
                                                        }
                                                        bj30Var6.r = i24;
                                                        i25 = bj30Var6.s;
                                                        if (i25 == -1) {
                                                            i25 = bj30Var6.p;
                                                        }
                                                        bj30Var6.s = i25;
                                                    } else {
                                                        i17 = -1;
                                                    }
                                                    i18 = bj30Var6.r;
                                                    if (i18 != i17) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (i12 == -1) {
                                                        if (i13 == -1) {
                                                            i12 = bj30Var6.A;
                                                            i8 = bj30Var6.B;
                                                            i13 = bj30Var6.C;
                                                        } else {
                                                            i12 = bj30Var6.A;
                                                            i8 = bj30Var6.B;
                                                            i13 = bj30Var6.C;
                                                        }
                                                    }
                                                    int i418 = i12;
                                                    int i419 = i13;
                                                    int i4110 = i8;
                                                    if (i6 != -1) {
                                                        i19 = i6;
                                                    } else {
                                                        i19 = 8;
                                                    }
                                                    if (i14 != -1) {
                                                        i21 = i14;
                                                    } else {
                                                        i20 = bj30Var6.q;
                                                        if (i20 != -1) {
                                                            i21 = i20;
                                                        } else {
                                                            i21 = 8;
                                                        }
                                                    }
                                                    if (bj30Var6.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    c4d c4dVar4 = new c4d(i418, i419, i4110, bArr, i19, i21);
                                                    str11 = bj30Var6.b;
                                                    if (str11 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (bj30Var6.u == 0) {
                                                        i22 = iIntValue;
                                                    } else {
                                                        i22 = iIntValue;
                                                    }
                                                    awqVar.v = bj30Var6.o;
                                                    awqVar.w = bj30Var6.p;
                                                    awqVar.D = f;
                                                    awqVar.B = i22;
                                                    awqVar.E = bj30Var6.y;
                                                    awqVar.F = bj30Var6.z;
                                                    awqVar.G = c4dVar4;
                                                } else if (!"application/x-subrip".equals(str10)) {
                                                    throw kq80.a("Unexpected MIME type.", null);
                                                }
                                                str12 = bj30Var6.b;
                                                if (str12 != null) {
                                                    awqVar.b = bj30Var6.b;
                                                }
                                                awqVar.f1587a = Integer.toString(i44);
                                                if (bj30Var6.f2686a) {
                                                    str13 = str15;
                                                } else {
                                                    str13 = "video/x-matroska";
                                                }
                                                awqVar.n = mg40.n(str13);
                                                awqVar.o = mg40.n(str10);
                                                awqVar.p = i15;
                                                awqVar.d = bj30Var6.c0;
                                                awqVar.e = i417;
                                                awqVar.r = listSingletonList;
                                                awqVar.k = str7;
                                                awqVar.s = bj30Var6.n;
                                                bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                                cj30Var = cj30Var;
                                                bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                                sparseArray2.put(bj30Var6.d, bj30Var6);
                                            }
                                            f1t0.g0("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                            str5 = "audio/x-unknown";
                                            i6 = -1;
                                            i5 = -1;
                                            i4 = -1;
                                            i12 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            str7 = null;
                                            listSingletonList = null;
                                            if (bj30Var6.P != null) {
                                                i15 = i5;
                                                hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                                if (hbbVarA != null) {
                                                    str10 = "video/dolby-vision";
                                                    str7 = hbbVarA.b;
                                                }
                                                boolean z6 = bj30Var6.b0;
                                                if (bj30Var6.a0) {
                                                    i16 = 2;
                                                } else {
                                                    i16 = 0;
                                                }
                                                int i4111 = (z6 ? 1 : 0) | i16;
                                                awqVar = new awq();
                                                if (mg40.i(str10)) {
                                                    awqVar.I = bj30Var6.Q;
                                                    awqVar.J = bj30Var6.S;
                                                    awqVar.K = bj30Var6.T;
                                                    awqVar.L = i4;
                                                } else if (mg40.m(str10)) {
                                                    if (bj30Var6.t == 0) {
                                                        i24 = bj30Var6.r;
                                                        i17 = -1;
                                                        if (i24 == -1) {
                                                            i24 = bj30Var6.o;
                                                        }
                                                        bj30Var6.r = i24;
                                                        i25 = bj30Var6.s;
                                                        if (i25 == -1) {
                                                            i25 = bj30Var6.p;
                                                        }
                                                        bj30Var6.s = i25;
                                                    } else {
                                                        i17 = -1;
                                                    }
                                                    i18 = bj30Var6.r;
                                                    if (i18 != i17) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (i12 == -1) {
                                                        if (i13 == -1) {
                                                            i12 = bj30Var6.A;
                                                            i8 = bj30Var6.B;
                                                            i13 = bj30Var6.C;
                                                        } else {
                                                            i12 = bj30Var6.A;
                                                            i8 = bj30Var6.B;
                                                            i13 = bj30Var6.C;
                                                        }
                                                    }
                                                    int i4112 = i12;
                                                    int i4113 = i13;
                                                    int i4114 = i8;
                                                    if (i6 != -1) {
                                                        i19 = i6;
                                                    } else {
                                                        i19 = 8;
                                                    }
                                                    if (i14 != -1) {
                                                        i21 = i14;
                                                    } else {
                                                        i20 = bj30Var6.q;
                                                        if (i20 != -1) {
                                                            i21 = i20;
                                                        } else {
                                                            i21 = 8;
                                                        }
                                                    }
                                                    if (bj30Var6.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    c4d c4dVar5 = new c4d(i4112, i4113, i4114, bArr, i19, i21);
                                                    str11 = bj30Var6.b;
                                                    if (str11 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (bj30Var6.u == 0) {
                                                        i22 = iIntValue;
                                                    } else {
                                                        i22 = iIntValue;
                                                    }
                                                    awqVar.v = bj30Var6.o;
                                                    awqVar.w = bj30Var6.p;
                                                    awqVar.D = f;
                                                    awqVar.B = i22;
                                                    awqVar.E = bj30Var6.y;
                                                    awqVar.F = bj30Var6.z;
                                                    awqVar.G = c4dVar5;
                                                } else if (!"application/x-subrip".equals(str10)) {
                                                    throw kq80.a("Unexpected MIME type.", null);
                                                }
                                                str12 = bj30Var6.b;
                                                if (str12 != null) {
                                                    awqVar.b = bj30Var6.b;
                                                }
                                                awqVar.f1587a = Integer.toString(i44);
                                                if (bj30Var6.f2686a) {
                                                    str13 = str15;
                                                } else {
                                                    str13 = "video/x-matroska";
                                                }
                                                awqVar.n = mg40.n(str13);
                                                awqVar.o = mg40.n(str10);
                                                awqVar.p = i15;
                                                awqVar.d = bj30Var6.c0;
                                                awqVar.e = i4111;
                                                awqVar.r = listSingletonList;
                                                awqVar.k = str7;
                                                awqVar.s = bj30Var6.n;
                                                bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                                cj30Var = cj30Var;
                                                bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                                sparseArray2.put(bj30Var6.d, bj30Var6);
                                            } else {
                                                i15 = i5;
                                            }
                                            str10 = str5;
                                            boolean z7 = bj30Var6.b0;
                                            if (bj30Var6.a0) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i4115 = (z7 ? 1 : 0) | i16;
                                            awqVar = new awq();
                                            if (mg40.i(str10)) {
                                                awqVar.I = bj30Var6.Q;
                                                awqVar.J = bj30Var6.S;
                                                awqVar.K = bj30Var6.T;
                                                awqVar.L = i4;
                                            } else if (mg40.m(str10)) {
                                                if (bj30Var6.t == 0) {
                                                    i24 = bj30Var6.r;
                                                    i17 = -1;
                                                    if (i24 == -1) {
                                                        i24 = bj30Var6.o;
                                                    }
                                                    bj30Var6.r = i24;
                                                    i25 = bj30Var6.s;
                                                    if (i25 == -1) {
                                                        i25 = bj30Var6.p;
                                                    }
                                                    bj30Var6.s = i25;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = bj30Var6.r;
                                                if (i18 != i17) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (i12 == -1) {
                                                    if (i13 == -1) {
                                                        i12 = bj30Var6.A;
                                                        i8 = bj30Var6.B;
                                                        i13 = bj30Var6.C;
                                                    } else {
                                                        i12 = bj30Var6.A;
                                                        i8 = bj30Var6.B;
                                                        i13 = bj30Var6.C;
                                                    }
                                                }
                                                int i4116 = i12;
                                                int i4117 = i13;
                                                int i4118 = i8;
                                                if (i6 != -1) {
                                                    i19 = i6;
                                                } else {
                                                    i19 = 8;
                                                }
                                                if (i14 != -1) {
                                                    i21 = i14;
                                                } else {
                                                    i20 = bj30Var6.q;
                                                    if (i20 != -1) {
                                                        i21 = i20;
                                                    } else {
                                                        i21 = 8;
                                                    }
                                                }
                                                if (bj30Var6.F != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                c4d c4dVar6 = new c4d(i4116, i4117, i4118, bArr, i19, i21);
                                                str11 = bj30Var6.b;
                                                if (str11 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bj30Var6.u == 0) {
                                                    i22 = iIntValue;
                                                } else {
                                                    i22 = iIntValue;
                                                }
                                                awqVar.v = bj30Var6.o;
                                                awqVar.w = bj30Var6.p;
                                                awqVar.D = f;
                                                awqVar.B = i22;
                                                awqVar.E = bj30Var6.y;
                                                awqVar.F = bj30Var6.z;
                                                awqVar.G = c4dVar6;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw kq80.a("Unexpected MIME type.", null);
                                            }
                                            str12 = bj30Var6.b;
                                            if (str12 != null) {
                                                awqVar.b = bj30Var6.b;
                                            }
                                            awqVar.f1587a = Integer.toString(i44);
                                            if (bj30Var6.f2686a) {
                                                str13 = str15;
                                            } else {
                                                str13 = "video/x-matroska";
                                            }
                                            awqVar.n = mg40.n(str13);
                                            awqVar.o = mg40.n(str10);
                                            awqVar.p = i15;
                                            awqVar.d = bj30Var6.c0;
                                            awqVar.e = i4115;
                                            awqVar.r = listSingletonList;
                                            awqVar.k = str7;
                                            awqVar.s = bj30Var6.n;
                                            bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                            cj30Var = cj30Var;
                                            bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                            sparseArray2.put(bj30Var6.d, bj30Var6);
                                            break;
                                        }
                                        int i50 = bj30Var6.R;
                                        String str18 = vtt0.f38024a;
                                        int iZ2 = vtt0.z(i50, ByteOrder.LITTLE_ENDIAN);
                                        if (iZ2 == 0) {
                                            f1t0.g0("MatroskaExtractor", "Unsupported PCM bit depth: " + bj30Var6.R + ". Setting mimeType to audio/x-unknown");
                                            str5 = "audio/x-unknown";
                                            i6 = -1;
                                            i5 = -1;
                                            i4 = -1;
                                            i12 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            str7 = null;
                                            listSingletonList = null;
                                            if (bj30Var6.P != null) {
                                                i15 = i5;
                                                hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                                if (hbbVarA != null) {
                                                    str10 = "video/dolby-vision";
                                                    str7 = hbbVarA.b;
                                                }
                                                boolean z8 = bj30Var6.b0;
                                                if (bj30Var6.a0) {
                                                    i16 = 2;
                                                } else {
                                                    i16 = 0;
                                                }
                                                int i4119 = (z8 ? 1 : 0) | i16;
                                                awqVar = new awq();
                                                if (mg40.i(str10)) {
                                                    awqVar.I = bj30Var6.Q;
                                                    awqVar.J = bj30Var6.S;
                                                    awqVar.K = bj30Var6.T;
                                                    awqVar.L = i4;
                                                } else if (mg40.m(str10)) {
                                                    if (bj30Var6.t == 0) {
                                                        i24 = bj30Var6.r;
                                                        i17 = -1;
                                                        if (i24 == -1) {
                                                            i24 = bj30Var6.o;
                                                        }
                                                        bj30Var6.r = i24;
                                                        i25 = bj30Var6.s;
                                                        if (i25 == -1) {
                                                            i25 = bj30Var6.p;
                                                        }
                                                        bj30Var6.s = i25;
                                                    } else {
                                                        i17 = -1;
                                                    }
                                                    i18 = bj30Var6.r;
                                                    if (i18 != i17) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (i12 == -1) {
                                                        if (i13 == -1) {
                                                            i12 = bj30Var6.A;
                                                            i8 = bj30Var6.B;
                                                            i13 = bj30Var6.C;
                                                        } else {
                                                            i12 = bj30Var6.A;
                                                            i8 = bj30Var6.B;
                                                            i13 = bj30Var6.C;
                                                        }
                                                    }
                                                    int i41110 = i12;
                                                    int i41111 = i13;
                                                    int i41112 = i8;
                                                    if (i6 != -1) {
                                                        i19 = i6;
                                                    } else {
                                                        i19 = 8;
                                                    }
                                                    if (i14 != -1) {
                                                        i21 = i14;
                                                    } else {
                                                        i20 = bj30Var6.q;
                                                        if (i20 != -1) {
                                                            i21 = i20;
                                                        } else {
                                                            i21 = 8;
                                                        }
                                                    }
                                                    if (bj30Var6.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    c4d c4dVar7 = new c4d(i41110, i41111, i41112, bArr, i19, i21);
                                                    str11 = bj30Var6.b;
                                                    if (str11 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (bj30Var6.u == 0) {
                                                        i22 = iIntValue;
                                                    } else {
                                                        i22 = iIntValue;
                                                    }
                                                    awqVar.v = bj30Var6.o;
                                                    awqVar.w = bj30Var6.p;
                                                    awqVar.D = f;
                                                    awqVar.B = i22;
                                                    awqVar.E = bj30Var6.y;
                                                    awqVar.F = bj30Var6.z;
                                                    awqVar.G = c4dVar7;
                                                } else if (!"application/x-subrip".equals(str10)) {
                                                    throw kq80.a("Unexpected MIME type.", null);
                                                }
                                                str12 = bj30Var6.b;
                                                if (str12 != null) {
                                                    awqVar.b = bj30Var6.b;
                                                }
                                                awqVar.f1587a = Integer.toString(i44);
                                                if (bj30Var6.f2686a) {
                                                    str13 = str15;
                                                } else {
                                                    str13 = "video/x-matroska";
                                                }
                                                awqVar.n = mg40.n(str13);
                                                awqVar.o = mg40.n(str10);
                                                awqVar.p = i15;
                                                awqVar.d = bj30Var6.c0;
                                                awqVar.e = i4119;
                                                awqVar.r = listSingletonList;
                                                awqVar.k = str7;
                                                awqVar.s = bj30Var6.n;
                                                bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                                cj30Var = cj30Var;
                                                bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                                sparseArray2.put(bj30Var6.d, bj30Var6);
                                            } else {
                                                i15 = i5;
                                            }
                                            str10 = str5;
                                            boolean z9 = bj30Var6.b0;
                                            if (bj30Var6.a0) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i41113 = (z9 ? 1 : 0) | i16;
                                            awqVar = new awq();
                                            if (mg40.i(str10)) {
                                                awqVar.I = bj30Var6.Q;
                                                awqVar.J = bj30Var6.S;
                                                awqVar.K = bj30Var6.T;
                                                awqVar.L = i4;
                                            } else if (mg40.m(str10)) {
                                                if (bj30Var6.t == 0) {
                                                    i24 = bj30Var6.r;
                                                    i17 = -1;
                                                    if (i24 == -1) {
                                                        i24 = bj30Var6.o;
                                                    }
                                                    bj30Var6.r = i24;
                                                    i25 = bj30Var6.s;
                                                    if (i25 == -1) {
                                                        i25 = bj30Var6.p;
                                                    }
                                                    bj30Var6.s = i25;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = bj30Var6.r;
                                                if (i18 != i17) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (i12 == -1) {
                                                    if (i13 == -1) {
                                                        i12 = bj30Var6.A;
                                                        i8 = bj30Var6.B;
                                                        i13 = bj30Var6.C;
                                                    } else {
                                                        i12 = bj30Var6.A;
                                                        i8 = bj30Var6.B;
                                                        i13 = bj30Var6.C;
                                                    }
                                                }
                                                int i41114 = i12;
                                                int i41115 = i13;
                                                int i41116 = i8;
                                                if (i6 != -1) {
                                                    i19 = i6;
                                                } else {
                                                    i19 = 8;
                                                }
                                                if (i14 != -1) {
                                                    i21 = i14;
                                                } else {
                                                    i20 = bj30Var6.q;
                                                    if (i20 != -1) {
                                                        i21 = i20;
                                                    } else {
                                                        i21 = 8;
                                                    }
                                                }
                                                if (bj30Var6.F != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                c4d c4dVar8 = new c4d(i41114, i41115, i41116, bArr, i19, i21);
                                                str11 = bj30Var6.b;
                                                if (str11 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bj30Var6.u == 0) {
                                                    i22 = iIntValue;
                                                } else {
                                                    i22 = iIntValue;
                                                }
                                                awqVar.v = bj30Var6.o;
                                                awqVar.w = bj30Var6.p;
                                                awqVar.D = f;
                                                awqVar.B = i22;
                                                awqVar.E = bj30Var6.y;
                                                awqVar.F = bj30Var6.z;
                                                awqVar.G = c4dVar8;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw kq80.a("Unexpected MIME type.", null);
                                            }
                                            str12 = bj30Var6.b;
                                            if (str12 != null) {
                                                awqVar.b = bj30Var6.b;
                                            }
                                            awqVar.f1587a = Integer.toString(i44);
                                            if (bj30Var6.f2686a) {
                                                str13 = str15;
                                            } else {
                                                str13 = "video/x-matroska";
                                            }
                                            awqVar.n = mg40.n(str13);
                                            awqVar.o = mg40.n(str10);
                                            awqVar.p = i15;
                                            awqVar.d = bj30Var6.c0;
                                            awqVar.e = i41113;
                                            awqVar.r = listSingletonList;
                                            awqVar.k = str7;
                                            awqVar.s = bj30Var6.n;
                                            bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                            cj30Var = cj30Var;
                                            bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                            sparseArray2.put(bj30Var6.d, bj30Var6);
                                        } else {
                                            i4 = iZ2;
                                            str5 = "audio/raw";
                                            i6 = -1;
                                            i5 = -1;
                                            i12 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            str7 = null;
                                            listSingletonList = null;
                                            if (bj30Var6.P != null) {
                                                i15 = i5;
                                                hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                                if (hbbVarA != null) {
                                                    str10 = "video/dolby-vision";
                                                    str7 = hbbVarA.b;
                                                }
                                                boolean z10 = bj30Var6.b0;
                                                if (bj30Var6.a0) {
                                                    i16 = 2;
                                                } else {
                                                    i16 = 0;
                                                }
                                                int i41117 = (z10 ? 1 : 0) | i16;
                                                awqVar = new awq();
                                                if (mg40.i(str10)) {
                                                    awqVar.I = bj30Var6.Q;
                                                    awqVar.J = bj30Var6.S;
                                                    awqVar.K = bj30Var6.T;
                                                    awqVar.L = i4;
                                                } else if (mg40.m(str10)) {
                                                    if (bj30Var6.t == 0) {
                                                        i24 = bj30Var6.r;
                                                        i17 = -1;
                                                        if (i24 == -1) {
                                                            i24 = bj30Var6.o;
                                                        }
                                                        bj30Var6.r = i24;
                                                        i25 = bj30Var6.s;
                                                        if (i25 == -1) {
                                                            i25 = bj30Var6.p;
                                                        }
                                                        bj30Var6.s = i25;
                                                    } else {
                                                        i17 = -1;
                                                    }
                                                    i18 = bj30Var6.r;
                                                    if (i18 != i17) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (i12 == -1) {
                                                        if (i13 == -1) {
                                                            i12 = bj30Var6.A;
                                                            i8 = bj30Var6.B;
                                                            i13 = bj30Var6.C;
                                                        } else {
                                                            i12 = bj30Var6.A;
                                                            i8 = bj30Var6.B;
                                                            i13 = bj30Var6.C;
                                                        }
                                                    }
                                                    int i41118 = i12;
                                                    int i41119 = i13;
                                                    int i411110 = i8;
                                                    if (i6 != -1) {
                                                        i19 = i6;
                                                    } else {
                                                        i19 = 8;
                                                    }
                                                    if (i14 != -1) {
                                                        i21 = i14;
                                                    } else {
                                                        i20 = bj30Var6.q;
                                                        if (i20 != -1) {
                                                            i21 = i20;
                                                        } else {
                                                            i21 = 8;
                                                        }
                                                    }
                                                    if (bj30Var6.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    c4d c4dVar9 = new c4d(i41118, i41119, i411110, bArr, i19, i21);
                                                    str11 = bj30Var6.b;
                                                    if (str11 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (bj30Var6.u == 0) {
                                                        i22 = iIntValue;
                                                    } else {
                                                        i22 = iIntValue;
                                                    }
                                                    awqVar.v = bj30Var6.o;
                                                    awqVar.w = bj30Var6.p;
                                                    awqVar.D = f;
                                                    awqVar.B = i22;
                                                    awqVar.E = bj30Var6.y;
                                                    awqVar.F = bj30Var6.z;
                                                    awqVar.G = c4dVar9;
                                                } else if (!"application/x-subrip".equals(str10)) {
                                                    throw kq80.a("Unexpected MIME type.", null);
                                                }
                                                str12 = bj30Var6.b;
                                                if (str12 != null) {
                                                    awqVar.b = bj30Var6.b;
                                                }
                                                awqVar.f1587a = Integer.toString(i44);
                                                if (bj30Var6.f2686a) {
                                                    str13 = str15;
                                                } else {
                                                    str13 = "video/x-matroska";
                                                }
                                                awqVar.n = mg40.n(str13);
                                                awqVar.o = mg40.n(str10);
                                                awqVar.p = i15;
                                                awqVar.d = bj30Var6.c0;
                                                awqVar.e = i41117;
                                                awqVar.r = listSingletonList;
                                                awqVar.k = str7;
                                                awqVar.s = bj30Var6.n;
                                                bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                                cj30Var = cj30Var;
                                                bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                                sparseArray2.put(bj30Var6.d, bj30Var6);
                                            } else {
                                                i15 = i5;
                                            }
                                            str10 = str5;
                                            boolean z11 = bj30Var6.b0;
                                            if (bj30Var6.a0) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i411111 = (z11 ? 1 : 0) | i16;
                                            awqVar = new awq();
                                            if (mg40.i(str10)) {
                                                awqVar.I = bj30Var6.Q;
                                                awqVar.J = bj30Var6.S;
                                                awqVar.K = bj30Var6.T;
                                                awqVar.L = i4;
                                            } else if (mg40.m(str10)) {
                                                if (bj30Var6.t == 0) {
                                                    i24 = bj30Var6.r;
                                                    i17 = -1;
                                                    if (i24 == -1) {
                                                        i24 = bj30Var6.o;
                                                    }
                                                    bj30Var6.r = i24;
                                                    i25 = bj30Var6.s;
                                                    if (i25 == -1) {
                                                        i25 = bj30Var6.p;
                                                    }
                                                    bj30Var6.s = i25;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = bj30Var6.r;
                                                if (i18 != i17) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (i12 == -1) {
                                                    if (i13 == -1) {
                                                        i12 = bj30Var6.A;
                                                        i8 = bj30Var6.B;
                                                        i13 = bj30Var6.C;
                                                    } else {
                                                        i12 = bj30Var6.A;
                                                        i8 = bj30Var6.B;
                                                        i13 = bj30Var6.C;
                                                    }
                                                }
                                                int i411112 = i12;
                                                int i411113 = i13;
                                                int i411114 = i8;
                                                if (i6 != -1) {
                                                    i19 = i6;
                                                } else {
                                                    i19 = 8;
                                                }
                                                if (i14 != -1) {
                                                    i21 = i14;
                                                } else {
                                                    i20 = bj30Var6.q;
                                                    if (i20 != -1) {
                                                        i21 = i20;
                                                    } else {
                                                        i21 = 8;
                                                    }
                                                }
                                                if (bj30Var6.F != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                c4d c4dVar10 = new c4d(i411112, i411113, i411114, bArr, i19, i21);
                                                str11 = bj30Var6.b;
                                                if (str11 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bj30Var6.u == 0) {
                                                    i22 = iIntValue;
                                                } else {
                                                    i22 = iIntValue;
                                                }
                                                awqVar.v = bj30Var6.o;
                                                awqVar.w = bj30Var6.p;
                                                awqVar.D = f;
                                                awqVar.B = i22;
                                                awqVar.E = bj30Var6.y;
                                                awqVar.F = bj30Var6.z;
                                                awqVar.G = c4dVar10;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw kq80.a("Unexpected MIME type.", null);
                                            }
                                            str12 = bj30Var6.b;
                                            if (str12 != null) {
                                                awqVar.b = bj30Var6.b;
                                            }
                                            awqVar.f1587a = Integer.toString(i44);
                                            if (bj30Var6.f2686a) {
                                                str13 = str15;
                                            } else {
                                                str13 = "video/x-matroska";
                                            }
                                            awqVar.n = mg40.n(str13);
                                            awqVar.o = mg40.n(str10);
                                            awqVar.p = i15;
                                            awqVar.d = bj30Var6.c0;
                                            awqVar.e = i411111;
                                            awqVar.r = listSingletonList;
                                            awqVar.k = str7;
                                            awqVar.s = bj30Var6.n;
                                            bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                            cj30Var = cj30Var;
                                            bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                            sparseArray2.put(bj30Var6.d, bj30Var6);
                                        }
                                    } catch (ArrayIndexOutOfBoundsException unused) {
                                        throw kq80.a("Error parsing MS/ACM codec private", null);
                                    }
                                    break;
                                case 3:
                                    str15 = "video/webm";
                                    bj30Var6.W = new rrs0();
                                    str17 = "audio/true-hd";
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (bj30Var6.P != null) {
                                        i15 = i5;
                                        hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                        if (hbbVarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = hbbVarA.b;
                                        }
                                        boolean z12 = bj30Var6.b0;
                                        if (bj30Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i411115 = (z12 ? 1 : 0) | i16;
                                        awqVar = new awq();
                                        if (mg40.i(str10)) {
                                            awqVar.I = bj30Var6.Q;
                                            awqVar.J = bj30Var6.S;
                                            awqVar.K = bj30Var6.T;
                                            awqVar.L = i4;
                                        } else if (mg40.m(str10)) {
                                            if (bj30Var6.t == 0) {
                                                i24 = bj30Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = bj30Var6.o;
                                                }
                                                bj30Var6.r = i24;
                                                i25 = bj30Var6.s;
                                                if (i25 == -1) {
                                                    i25 = bj30Var6.p;
                                                }
                                                bj30Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = bj30Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                } else {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                }
                                            }
                                            int i411116 = i12;
                                            int i411117 = i13;
                                            int i411118 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = bj30Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (bj30Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            c4d c4dVar11 = new c4d(i411116, i411117, i411118, bArr, i19, i21);
                                            str11 = bj30Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (bj30Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            awqVar.v = bj30Var6.o;
                                            awqVar.w = bj30Var6.p;
                                            awqVar.D = f;
                                            awqVar.B = i22;
                                            awqVar.E = bj30Var6.y;
                                            awqVar.F = bj30Var6.z;
                                            awqVar.G = c4dVar11;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw kq80.a("Unexpected MIME type.", null);
                                        }
                                        str12 = bj30Var6.b;
                                        if (str12 != null) {
                                            awqVar.b = bj30Var6.b;
                                        }
                                        awqVar.f1587a = Integer.toString(i44);
                                        if (bj30Var6.f2686a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        awqVar.n = mg40.n(str13);
                                        awqVar.o = mg40.n(str10);
                                        awqVar.p = i15;
                                        awqVar.d = bj30Var6.c0;
                                        awqVar.e = i411115;
                                        awqVar.r = listSingletonList;
                                        awqVar.k = str7;
                                        awqVar.s = bj30Var6.n;
                                        bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                        cj30Var = cj30Var;
                                        bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                        sparseArray2.put(bj30Var6.d, bj30Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z13 = bj30Var6.b0;
                                    if (bj30Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i411119 = (z13 ? 1 : 0) | i16;
                                    awqVar = new awq();
                                    if (mg40.i(str10)) {
                                        awqVar.I = bj30Var6.Q;
                                        awqVar.J = bj30Var6.S;
                                        awqVar.K = bj30Var6.T;
                                        awqVar.L = i4;
                                    } else if (mg40.m(str10)) {
                                        if (bj30Var6.t == 0) {
                                            i24 = bj30Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = bj30Var6.o;
                                            }
                                            bj30Var6.r = i24;
                                            i25 = bj30Var6.s;
                                            if (i25 == -1) {
                                                i25 = bj30Var6.p;
                                            }
                                            bj30Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = bj30Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            } else {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            }
                                        }
                                        int i4111110 = i12;
                                        int i4111111 = i13;
                                        int i4111112 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = bj30Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (bj30Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        c4d c4dVar12 = new c4d(i4111110, i4111111, i4111112, bArr, i19, i21);
                                        str11 = bj30Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (bj30Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        awqVar.v = bj30Var6.o;
                                        awqVar.w = bj30Var6.p;
                                        awqVar.D = f;
                                        awqVar.B = i22;
                                        awqVar.E = bj30Var6.y;
                                        awqVar.F = bj30Var6.z;
                                        awqVar.G = c4dVar12;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw kq80.a("Unexpected MIME type.", null);
                                    }
                                    str12 = bj30Var6.b;
                                    if (str12 != null) {
                                        awqVar.b = bj30Var6.b;
                                    }
                                    awqVar.f1587a = Integer.toString(i44);
                                    if (bj30Var6.f2686a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    awqVar.n = mg40.n(str13);
                                    awqVar.o = mg40.n(str10);
                                    awqVar.p = i15;
                                    awqVar.d = bj30Var6.c0;
                                    awqVar.e = i411119;
                                    awqVar.r = listSingletonList;
                                    awqVar.k = str7;
                                    awqVar.s = bj30Var6.n;
                                    bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                    cj30Var = cj30Var;
                                    bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                    sparseArray2.put(bj30Var6.d, bj30Var6);
                                    break;
                                case 4:
                                    byte[] bArrA = bj30Var6.a(str16);
                                    try {
                                        r5 = bArrA[0];
                                        try {
                                            if (r5 != 2) {
                                                throw kq80.a("Error parsing vorbis codec private", null);
                                            }
                                            int i51 = 1;
                                            int i52 = 0;
                                            while (true) {
                                                int i53 = i51;
                                                int i54 = bArrA[i51] & 255;
                                                if (i54 != 255) {
                                                    int i55 = i53 + 1;
                                                    int i56 = i52 + i54;
                                                    int i57 = 0;
                                                    while (true) {
                                                        int i58 = bArrA[i55] & 255;
                                                        if (i58 != 255) {
                                                            int i59 = i55 + 1;
                                                            int i60 = i57 + i58;
                                                            if (bArrA[i59] != 1) {
                                                                throw kq80.a("Error parsing vorbis codec private", null);
                                                            }
                                                            byte[] bArr4 = new byte[i56];
                                                            System.arraycopy(bArrA, i59, bArr4, 0, i56);
                                                            int i61 = i59 + i56;
                                                            if (bArrA[i61] != 3) {
                                                                throw kq80.a("Error parsing vorbis codec private", null);
                                                            }
                                                            int i62 = i61 + i60;
                                                            if (bArrA[i62] != 5) {
                                                                throw kq80.a("Error parsing vorbis codec private", null);
                                                            }
                                                            byte[] bArr5 = new byte[bArrA.length - i62];
                                                            System.arraycopy(bArrA, i62, bArr5, 0, bArrA.length - i62);
                                                            ArrayList arrayList2 = new ArrayList(2);
                                                            arrayList2.add(bArr4);
                                                            arrayList2.add(bArr5);
                                                            str3 = "audio/vorbis";
                                                            i5 = 8192;
                                                            listSingletonList = arrayList2;
                                                            str5 = str3;
                                                            i6 = -1;
                                                            i4 = -1;
                                                            i12 = -1;
                                                            i13 = -1;
                                                            i14 = -1;
                                                            i8 = -1;
                                                            str7 = null;
                                                            if (bj30Var6.P != null) {
                                                                i15 = i5;
                                                                hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                                                if (hbbVarA != null) {
                                                                    str10 = "video/dolby-vision";
                                                                    str7 = hbbVarA.b;
                                                                }
                                                                boolean z14 = bj30Var6.b0;
                                                                if (bj30Var6.a0) {
                                                                    i16 = 2;
                                                                } else {
                                                                    i16 = 0;
                                                                }
                                                                int i4111113 = (z14 ? 1 : 0) | i16;
                                                                awqVar = new awq();
                                                                if (mg40.i(str10)) {
                                                                    awqVar.I = bj30Var6.Q;
                                                                    awqVar.J = bj30Var6.S;
                                                                    awqVar.K = bj30Var6.T;
                                                                    awqVar.L = i4;
                                                                } else if (mg40.m(str10)) {
                                                                    if (bj30Var6.t == 0) {
                                                                        i24 = bj30Var6.r;
                                                                        i17 = -1;
                                                                        if (i24 == -1) {
                                                                            i24 = bj30Var6.o;
                                                                        }
                                                                        bj30Var6.r = i24;
                                                                        i25 = bj30Var6.s;
                                                                        if (i25 == -1) {
                                                                            i25 = bj30Var6.p;
                                                                        }
                                                                        bj30Var6.s = i25;
                                                                    } else {
                                                                        i17 = -1;
                                                                    }
                                                                    i18 = bj30Var6.r;
                                                                    if (i18 != i17) {
                                                                        f = -1.0f;
                                                                    } else {
                                                                        f = -1.0f;
                                                                    }
                                                                    if (i12 == -1) {
                                                                        if (i13 == -1) {
                                                                            i12 = bj30Var6.A;
                                                                            i8 = bj30Var6.B;
                                                                            i13 = bj30Var6.C;
                                                                        } else {
                                                                            i12 = bj30Var6.A;
                                                                            i8 = bj30Var6.B;
                                                                            i13 = bj30Var6.C;
                                                                        }
                                                                    }
                                                                    int i4111114 = i12;
                                                                    int i4111115 = i13;
                                                                    int i4111116 = i8;
                                                                    if (i6 != -1) {
                                                                        i19 = i6;
                                                                    } else {
                                                                        i19 = 8;
                                                                    }
                                                                    if (i14 != -1) {
                                                                        i21 = i14;
                                                                    } else {
                                                                        i20 = bj30Var6.q;
                                                                        if (i20 != -1) {
                                                                            i21 = i20;
                                                                        } else {
                                                                            i21 = 8;
                                                                        }
                                                                    }
                                                                    if (bj30Var6.F != -1.0f) {
                                                                        bArr = null;
                                                                    } else {
                                                                        bArr = null;
                                                                    }
                                                                    c4d c4dVar13 = new c4d(i4111114, i4111115, i4111116, bArr, i19, i21);
                                                                    str11 = bj30Var6.b;
                                                                    if (str11 == null) {
                                                                        iIntValue = -1;
                                                                    } else {
                                                                        iIntValue = -1;
                                                                    }
                                                                    if (bj30Var6.u == 0) {
                                                                        i22 = iIntValue;
                                                                    } else {
                                                                        i22 = iIntValue;
                                                                    }
                                                                    awqVar.v = bj30Var6.o;
                                                                    awqVar.w = bj30Var6.p;
                                                                    awqVar.D = f;
                                                                    awqVar.B = i22;
                                                                    awqVar.E = bj30Var6.y;
                                                                    awqVar.F = bj30Var6.z;
                                                                    awqVar.G = c4dVar13;
                                                                } else if (!"application/x-subrip".equals(str10)) {
                                                                    throw kq80.a("Unexpected MIME type.", null);
                                                                }
                                                                str12 = bj30Var6.b;
                                                                if (str12 != null) {
                                                                    awqVar.b = bj30Var6.b;
                                                                }
                                                                awqVar.f1587a = Integer.toString(i44);
                                                                if (bj30Var6.f2686a) {
                                                                    str13 = str15;
                                                                } else {
                                                                    str13 = "video/x-matroska";
                                                                }
                                                                awqVar.n = mg40.n(str13);
                                                                awqVar.o = mg40.n(str10);
                                                                awqVar.p = i15;
                                                                awqVar.d = bj30Var6.c0;
                                                                awqVar.e = i4111113;
                                                                awqVar.r = listSingletonList;
                                                                awqVar.k = str7;
                                                                awqVar.s = bj30Var6.n;
                                                                bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                                                cj30Var = cj30Var;
                                                                bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                                                sparseArray2.put(bj30Var6.d, bj30Var6);
                                                            } else {
                                                                i15 = i5;
                                                            }
                                                            str10 = str5;
                                                            boolean z15 = bj30Var6.b0;
                                                            if (bj30Var6.a0) {
                                                                i16 = 2;
                                                            } else {
                                                                i16 = 0;
                                                            }
                                                            int i4111117 = (z15 ? 1 : 0) | i16;
                                                            awqVar = new awq();
                                                            if (mg40.i(str10)) {
                                                                awqVar.I = bj30Var6.Q;
                                                                awqVar.J = bj30Var6.S;
                                                                awqVar.K = bj30Var6.T;
                                                                awqVar.L = i4;
                                                            } else if (mg40.m(str10)) {
                                                                if (bj30Var6.t == 0) {
                                                                    i24 = bj30Var6.r;
                                                                    i17 = -1;
                                                                    if (i24 == -1) {
                                                                        i24 = bj30Var6.o;
                                                                    }
                                                                    bj30Var6.r = i24;
                                                                    i25 = bj30Var6.s;
                                                                    if (i25 == -1) {
                                                                        i25 = bj30Var6.p;
                                                                    }
                                                                    bj30Var6.s = i25;
                                                                } else {
                                                                    i17 = -1;
                                                                }
                                                                i18 = bj30Var6.r;
                                                                if (i18 != i17) {
                                                                    f = -1.0f;
                                                                } else {
                                                                    f = -1.0f;
                                                                }
                                                                if (i12 == -1) {
                                                                    if (i13 == -1) {
                                                                        i12 = bj30Var6.A;
                                                                        i8 = bj30Var6.B;
                                                                        i13 = bj30Var6.C;
                                                                    } else {
                                                                        i12 = bj30Var6.A;
                                                                        i8 = bj30Var6.B;
                                                                        i13 = bj30Var6.C;
                                                                    }
                                                                }
                                                                int i4111118 = i12;
                                                                int i4111119 = i13;
                                                                int i41111110 = i8;
                                                                if (i6 != -1) {
                                                                    i19 = i6;
                                                                } else {
                                                                    i19 = 8;
                                                                }
                                                                if (i14 != -1) {
                                                                    i21 = i14;
                                                                } else {
                                                                    i20 = bj30Var6.q;
                                                                    if (i20 != -1) {
                                                                        i21 = i20;
                                                                    } else {
                                                                        i21 = 8;
                                                                    }
                                                                }
                                                                if (bj30Var6.F != -1.0f) {
                                                                    bArr = null;
                                                                } else {
                                                                    bArr = null;
                                                                }
                                                                c4d c4dVar14 = new c4d(i4111118, i4111119, i41111110, bArr, i19, i21);
                                                                str11 = bj30Var6.b;
                                                                if (str11 == null) {
                                                                    iIntValue = -1;
                                                                } else {
                                                                    iIntValue = -1;
                                                                }
                                                                if (bj30Var6.u == 0) {
                                                                    i22 = iIntValue;
                                                                } else {
                                                                    i22 = iIntValue;
                                                                }
                                                                awqVar.v = bj30Var6.o;
                                                                awqVar.w = bj30Var6.p;
                                                                awqVar.D = f;
                                                                awqVar.B = i22;
                                                                awqVar.E = bj30Var6.y;
                                                                awqVar.F = bj30Var6.z;
                                                                awqVar.G = c4dVar14;
                                                            } else if (!"application/x-subrip".equals(str10)) {
                                                                throw kq80.a("Unexpected MIME type.", null);
                                                            }
                                                            str12 = bj30Var6.b;
                                                            if (str12 != null) {
                                                                awqVar.b = bj30Var6.b;
                                                            }
                                                            awqVar.f1587a = Integer.toString(i44);
                                                            if (bj30Var6.f2686a) {
                                                                str13 = str15;
                                                            } else {
                                                                str13 = "video/x-matroska";
                                                            }
                                                            awqVar.n = mg40.n(str13);
                                                            awqVar.o = mg40.n(str10);
                                                            awqVar.p = i15;
                                                            awqVar.d = bj30Var6.c0;
                                                            awqVar.e = i4111117;
                                                            awqVar.r = listSingletonList;
                                                            awqVar.k = str7;
                                                            awqVar.s = bj30Var6.n;
                                                            bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                                            cj30Var = cj30Var;
                                                            bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                                            sparseArray2.put(bj30Var6.d, bj30Var6);
                                                        } else {
                                                            i57 += 255;
                                                            i55++;
                                                        }
                                                    }
                                                } else {
                                                    i52 += 255;
                                                    i51 = i53 + 1;
                                                }
                                                break;
                                            }
                                        } catch (ArrayIndexOutOfBoundsException unused2) {
                                        }
                                    } catch (ArrayIndexOutOfBoundsException unused3) {
                                        r5 = 0;
                                    }
                                    throw kq80.a("Error parsing vorbis codec private", r5);
                                case 5:
                                    str4 = "audio/mpeg-L2";
                                    cj30Var = cj30Var;
                                    i44 = i44;
                                    sparseArray2 = sparseArray2;
                                    str5 = str4;
                                    i6 = -1;
                                    i5 = 4096;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (bj30Var6.P != null) {
                                        i15 = i5;
                                        hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                        if (hbbVarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = hbbVarA.b;
                                        }
                                        boolean z16 = bj30Var6.b0;
                                        if (bj30Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i41111111 = (z16 ? 1 : 0) | i16;
                                        awqVar = new awq();
                                        if (mg40.i(str10)) {
                                            awqVar.I = bj30Var6.Q;
                                            awqVar.J = bj30Var6.S;
                                            awqVar.K = bj30Var6.T;
                                            awqVar.L = i4;
                                        } else if (mg40.m(str10)) {
                                            if (bj30Var6.t == 0) {
                                                i24 = bj30Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = bj30Var6.o;
                                                }
                                                bj30Var6.r = i24;
                                                i25 = bj30Var6.s;
                                                if (i25 == -1) {
                                                    i25 = bj30Var6.p;
                                                }
                                                bj30Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = bj30Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                } else {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                }
                                            }
                                            int i41111112 = i12;
                                            int i41111113 = i13;
                                            int i41111114 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = bj30Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (bj30Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            c4d c4dVar15 = new c4d(i41111112, i41111113, i41111114, bArr, i19, i21);
                                            str11 = bj30Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (bj30Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            awqVar.v = bj30Var6.o;
                                            awqVar.w = bj30Var6.p;
                                            awqVar.D = f;
                                            awqVar.B = i22;
                                            awqVar.E = bj30Var6.y;
                                            awqVar.F = bj30Var6.z;
                                            awqVar.G = c4dVar15;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw kq80.a("Unexpected MIME type.", null);
                                        }
                                        str12 = bj30Var6.b;
                                        if (str12 != null) {
                                            awqVar.b = bj30Var6.b;
                                        }
                                        awqVar.f1587a = Integer.toString(i44);
                                        if (bj30Var6.f2686a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        awqVar.n = mg40.n(str13);
                                        awqVar.o = mg40.n(str10);
                                        awqVar.p = i15;
                                        awqVar.d = bj30Var6.c0;
                                        awqVar.e = i41111111;
                                        awqVar.r = listSingletonList;
                                        awqVar.k = str7;
                                        awqVar.s = bj30Var6.n;
                                        bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                        cj30Var = cj30Var;
                                        bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                        sparseArray2.put(bj30Var6.d, bj30Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z17 = bj30Var6.b0;
                                    if (bj30Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i41111115 = (z17 ? 1 : 0) | i16;
                                    awqVar = new awq();
                                    if (mg40.i(str10)) {
                                        awqVar.I = bj30Var6.Q;
                                        awqVar.J = bj30Var6.S;
                                        awqVar.K = bj30Var6.T;
                                        awqVar.L = i4;
                                    } else if (mg40.m(str10)) {
                                        if (bj30Var6.t == 0) {
                                            i24 = bj30Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = bj30Var6.o;
                                            }
                                            bj30Var6.r = i24;
                                            i25 = bj30Var6.s;
                                            if (i25 == -1) {
                                                i25 = bj30Var6.p;
                                            }
                                            bj30Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = bj30Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            } else {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            }
                                        }
                                        int i41111116 = i12;
                                        int i41111117 = i13;
                                        int i41111118 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = bj30Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (bj30Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        c4d c4dVar16 = new c4d(i41111116, i41111117, i41111118, bArr, i19, i21);
                                        str11 = bj30Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (bj30Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        awqVar.v = bj30Var6.o;
                                        awqVar.w = bj30Var6.p;
                                        awqVar.D = f;
                                        awqVar.B = i22;
                                        awqVar.E = bj30Var6.y;
                                        awqVar.F = bj30Var6.z;
                                        awqVar.G = c4dVar16;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw kq80.a("Unexpected MIME type.", null);
                                    }
                                    str12 = bj30Var6.b;
                                    if (str12 != null) {
                                        awqVar.b = bj30Var6.b;
                                    }
                                    awqVar.f1587a = Integer.toString(i44);
                                    if (bj30Var6.f2686a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    awqVar.n = mg40.n(str13);
                                    awqVar.o = mg40.n(str10);
                                    awqVar.p = i15;
                                    awqVar.d = bj30Var6.c0;
                                    awqVar.e = i41111115;
                                    awqVar.r = listSingletonList;
                                    awqVar.k = str7;
                                    awqVar.s = bj30Var6.n;
                                    bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                    cj30Var = cj30Var;
                                    bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                    sparseArray2.put(bj30Var6.d, bj30Var6);
                                    break;
                                case 6:
                                    str4 = "audio/mpeg";
                                    cj30Var = cj30Var;
                                    i44 = i44;
                                    sparseArray2 = sparseArray2;
                                    str5 = str4;
                                    i6 = -1;
                                    i5 = 4096;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (bj30Var6.P != null) {
                                        i15 = i5;
                                        hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                        if (hbbVarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = hbbVarA.b;
                                        }
                                        boolean z18 = bj30Var6.b0;
                                        if (bj30Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i41111119 = (z18 ? 1 : 0) | i16;
                                        awqVar = new awq();
                                        if (mg40.i(str10)) {
                                            awqVar.I = bj30Var6.Q;
                                            awqVar.J = bj30Var6.S;
                                            awqVar.K = bj30Var6.T;
                                            awqVar.L = i4;
                                        } else if (mg40.m(str10)) {
                                            if (bj30Var6.t == 0) {
                                                i24 = bj30Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = bj30Var6.o;
                                                }
                                                bj30Var6.r = i24;
                                                i25 = bj30Var6.s;
                                                if (i25 == -1) {
                                                    i25 = bj30Var6.p;
                                                }
                                                bj30Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = bj30Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                } else {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                }
                                            }
                                            int i411111110 = i12;
                                            int i411111111 = i13;
                                            int i411111112 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = bj30Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (bj30Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            c4d c4dVar17 = new c4d(i411111110, i411111111, i411111112, bArr, i19, i21);
                                            str11 = bj30Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (bj30Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            awqVar.v = bj30Var6.o;
                                            awqVar.w = bj30Var6.p;
                                            awqVar.D = f;
                                            awqVar.B = i22;
                                            awqVar.E = bj30Var6.y;
                                            awqVar.F = bj30Var6.z;
                                            awqVar.G = c4dVar17;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw kq80.a("Unexpected MIME type.", null);
                                        }
                                        str12 = bj30Var6.b;
                                        if (str12 != null) {
                                            awqVar.b = bj30Var6.b;
                                        }
                                        awqVar.f1587a = Integer.toString(i44);
                                        if (bj30Var6.f2686a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        awqVar.n = mg40.n(str13);
                                        awqVar.o = mg40.n(str10);
                                        awqVar.p = i15;
                                        awqVar.d = bj30Var6.c0;
                                        awqVar.e = i41111119;
                                        awqVar.r = listSingletonList;
                                        awqVar.k = str7;
                                        awqVar.s = bj30Var6.n;
                                        bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                        cj30Var = cj30Var;
                                        bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                        sparseArray2.put(bj30Var6.d, bj30Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z19 = bj30Var6.b0;
                                    if (bj30Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i411111113 = (z19 ? 1 : 0) | i16;
                                    awqVar = new awq();
                                    if (mg40.i(str10)) {
                                        awqVar.I = bj30Var6.Q;
                                        awqVar.J = bj30Var6.S;
                                        awqVar.K = bj30Var6.T;
                                        awqVar.L = i4;
                                    } else if (mg40.m(str10)) {
                                        if (bj30Var6.t == 0) {
                                            i24 = bj30Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = bj30Var6.o;
                                            }
                                            bj30Var6.r = i24;
                                            i25 = bj30Var6.s;
                                            if (i25 == -1) {
                                                i25 = bj30Var6.p;
                                            }
                                            bj30Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = bj30Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            } else {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            }
                                        }
                                        int i411111114 = i12;
                                        int i411111115 = i13;
                                        int i411111116 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = bj30Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (bj30Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        c4d c4dVar18 = new c4d(i411111114, i411111115, i411111116, bArr, i19, i21);
                                        str11 = bj30Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (bj30Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        awqVar.v = bj30Var6.o;
                                        awqVar.w = bj30Var6.p;
                                        awqVar.D = f;
                                        awqVar.B = i22;
                                        awqVar.E = bj30Var6.y;
                                        awqVar.F = bj30Var6.z;
                                        awqVar.G = c4dVar18;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw kq80.a("Unexpected MIME type.", null);
                                    }
                                    str12 = bj30Var6.b;
                                    if (str12 != null) {
                                        awqVar.b = bj30Var6.b;
                                    }
                                    awqVar.f1587a = Integer.toString(i44);
                                    if (bj30Var6.f2686a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    awqVar.n = mg40.n(str13);
                                    awqVar.o = mg40.n(str10);
                                    awqVar.p = i15;
                                    awqVar.d = bj30Var6.c0;
                                    awqVar.e = i411111113;
                                    awqVar.r = listSingletonList;
                                    awqVar.k = str7;
                                    awqVar.s = bj30Var6.n;
                                    bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                    cj30Var = cj30Var;
                                    bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                    sparseArray2.put(bj30Var6.d, bj30Var6);
                                    break;
                                case 7:
                                    fq80 fq80Var3 = new fq80(bj30Var6.a(bj30Var6.c));
                                    try {
                                        fq80Var3.N(16);
                                        long jQ = fq80Var3.q();
                                        try {
                                            if (jQ == 1482049860) {
                                                pair = new Pair("video/divx", null);
                                            } else if (jQ != 859189832) {
                                                if (jQ == 826496599) {
                                                    int i63 = fq80Var3.b + 20;
                                                    byte[] bArr6 = fq80Var3.f9961a;
                                                    while (true) {
                                                        if (i63 >= bArr6.length - 4) {
                                                            throw kq80.a("Failed to find FourCC VC1 initialization data", null);
                                                        }
                                                        if (bArr6[i63] == 0 && bArr6[i63 + 1] == 0 && bArr6[i63 + 2] == 1) {
                                                            if (bArr6[i63 + 3] == 15) {
                                                                pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr6, i63, bArr6.length)));
                                                            }
                                                        }
                                                        i63++;
                                                    }
                                                } else {
                                                    f1t0.g0("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                                    str6 = null;
                                                    pair = new Pair("video/x-unknown", null);
                                                }
                                                str7 = str6;
                                                str5 = (String) pair.first;
                                                listSingletonList = (List) pair.second;
                                                i6 = -1;
                                                i5 = -1;
                                                i4 = -1;
                                                i12 = -1;
                                                i13 = -1;
                                                i14 = -1;
                                                i8 = -1;
                                                if (bj30Var6.P != null) {
                                                    i15 = i5;
                                                    hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                                    if (hbbVarA != null) {
                                                        str10 = "video/dolby-vision";
                                                        str7 = hbbVarA.b;
                                                    }
                                                    boolean z110 = bj30Var6.b0;
                                                    if (bj30Var6.a0) {
                                                        i16 = 2;
                                                    } else {
                                                        i16 = 0;
                                                    }
                                                    int i411111117 = (z110 ? 1 : 0) | i16;
                                                    awqVar = new awq();
                                                    if (mg40.i(str10)) {
                                                        awqVar.I = bj30Var6.Q;
                                                        awqVar.J = bj30Var6.S;
                                                        awqVar.K = bj30Var6.T;
                                                        awqVar.L = i4;
                                                    } else if (mg40.m(str10)) {
                                                        if (bj30Var6.t == 0) {
                                                            i24 = bj30Var6.r;
                                                            i17 = -1;
                                                            if (i24 == -1) {
                                                                i24 = bj30Var6.o;
                                                            }
                                                            bj30Var6.r = i24;
                                                            i25 = bj30Var6.s;
                                                            if (i25 == -1) {
                                                                i25 = bj30Var6.p;
                                                            }
                                                            bj30Var6.s = i25;
                                                        } else {
                                                            i17 = -1;
                                                        }
                                                        i18 = bj30Var6.r;
                                                        if (i18 != i17) {
                                                            f = -1.0f;
                                                        } else {
                                                            f = -1.0f;
                                                        }
                                                        if (i12 == -1) {
                                                            if (i13 == -1) {
                                                                i12 = bj30Var6.A;
                                                                i8 = bj30Var6.B;
                                                                i13 = bj30Var6.C;
                                                            } else {
                                                                i12 = bj30Var6.A;
                                                                i8 = bj30Var6.B;
                                                                i13 = bj30Var6.C;
                                                            }
                                                        }
                                                        int i411111118 = i12;
                                                        int i411111119 = i13;
                                                        int i4111111110 = i8;
                                                        if (i6 != -1) {
                                                            i19 = i6;
                                                        } else {
                                                            i19 = 8;
                                                        }
                                                        if (i14 != -1) {
                                                            i21 = i14;
                                                        } else {
                                                            i20 = bj30Var6.q;
                                                            if (i20 != -1) {
                                                                i21 = i20;
                                                            } else {
                                                                i21 = 8;
                                                            }
                                                        }
                                                        if (bj30Var6.F != -1.0f) {
                                                            bArr = null;
                                                        } else {
                                                            bArr = null;
                                                        }
                                                        c4d c4dVar19 = new c4d(i411111118, i411111119, i4111111110, bArr, i19, i21);
                                                        str11 = bj30Var6.b;
                                                        if (str11 == null) {
                                                            iIntValue = -1;
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (bj30Var6.u == 0) {
                                                            i22 = iIntValue;
                                                        } else {
                                                            i22 = iIntValue;
                                                        }
                                                        awqVar.v = bj30Var6.o;
                                                        awqVar.w = bj30Var6.p;
                                                        awqVar.D = f;
                                                        awqVar.B = i22;
                                                        awqVar.E = bj30Var6.y;
                                                        awqVar.F = bj30Var6.z;
                                                        awqVar.G = c4dVar19;
                                                    } else if (!"application/x-subrip".equals(str10)) {
                                                        throw kq80.a("Unexpected MIME type.", null);
                                                    }
                                                    str12 = bj30Var6.b;
                                                    if (str12 != null) {
                                                        awqVar.b = bj30Var6.b;
                                                    }
                                                    awqVar.f1587a = Integer.toString(i44);
                                                    if (bj30Var6.f2686a) {
                                                        str13 = str15;
                                                    } else {
                                                        str13 = "video/x-matroska";
                                                    }
                                                    awqVar.n = mg40.n(str13);
                                                    awqVar.o = mg40.n(str10);
                                                    awqVar.p = i15;
                                                    awqVar.d = bj30Var6.c0;
                                                    awqVar.e = i411111117;
                                                    awqVar.r = listSingletonList;
                                                    awqVar.k = str7;
                                                    awqVar.s = bj30Var6.n;
                                                    bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                                    cj30Var = cj30Var;
                                                    bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                                    sparseArray2.put(bj30Var6.d, bj30Var6);
                                                } else {
                                                    i15 = i5;
                                                }
                                                str10 = str5;
                                                boolean z111 = bj30Var6.b0;
                                                if (bj30Var6.a0) {
                                                    i16 = 2;
                                                } else {
                                                    i16 = 0;
                                                }
                                                int i4111111111 = (z111 ? 1 : 0) | i16;
                                                awqVar = new awq();
                                                if (mg40.i(str10)) {
                                                    awqVar.I = bj30Var6.Q;
                                                    awqVar.J = bj30Var6.S;
                                                    awqVar.K = bj30Var6.T;
                                                    awqVar.L = i4;
                                                } else if (mg40.m(str10)) {
                                                    if (bj30Var6.t == 0) {
                                                        i24 = bj30Var6.r;
                                                        i17 = -1;
                                                        if (i24 == -1) {
                                                            i24 = bj30Var6.o;
                                                        }
                                                        bj30Var6.r = i24;
                                                        i25 = bj30Var6.s;
                                                        if (i25 == -1) {
                                                            i25 = bj30Var6.p;
                                                        }
                                                        bj30Var6.s = i25;
                                                    } else {
                                                        i17 = -1;
                                                    }
                                                    i18 = bj30Var6.r;
                                                    if (i18 != i17) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (i12 == -1) {
                                                        if (i13 == -1) {
                                                            i12 = bj30Var6.A;
                                                            i8 = bj30Var6.B;
                                                            i13 = bj30Var6.C;
                                                        } else {
                                                            i12 = bj30Var6.A;
                                                            i8 = bj30Var6.B;
                                                            i13 = bj30Var6.C;
                                                        }
                                                    }
                                                    int i4111111112 = i12;
                                                    int i4111111113 = i13;
                                                    int i4111111114 = i8;
                                                    if (i6 != -1) {
                                                        i19 = i6;
                                                    } else {
                                                        i19 = 8;
                                                    }
                                                    if (i14 != -1) {
                                                        i21 = i14;
                                                    } else {
                                                        i20 = bj30Var6.q;
                                                        if (i20 != -1) {
                                                            i21 = i20;
                                                        } else {
                                                            i21 = 8;
                                                        }
                                                    }
                                                    if (bj30Var6.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    c4d c4dVar110 = new c4d(i4111111112, i4111111113, i4111111114, bArr, i19, i21);
                                                    str11 = bj30Var6.b;
                                                    if (str11 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (bj30Var6.u == 0) {
                                                        i22 = iIntValue;
                                                    } else {
                                                        i22 = iIntValue;
                                                    }
                                                    awqVar.v = bj30Var6.o;
                                                    awqVar.w = bj30Var6.p;
                                                    awqVar.D = f;
                                                    awqVar.B = i22;
                                                    awqVar.E = bj30Var6.y;
                                                    awqVar.F = bj30Var6.z;
                                                    awqVar.G = c4dVar110;
                                                } else if (!"application/x-subrip".equals(str10)) {
                                                    throw kq80.a("Unexpected MIME type.", null);
                                                }
                                                str12 = bj30Var6.b;
                                                if (str12 != null) {
                                                    awqVar.b = bj30Var6.b;
                                                }
                                                awqVar.f1587a = Integer.toString(i44);
                                                if (bj30Var6.f2686a) {
                                                    str13 = str15;
                                                } else {
                                                    str13 = "video/x-matroska";
                                                }
                                                awqVar.n = mg40.n(str13);
                                                awqVar.o = mg40.n(str10);
                                                awqVar.p = i15;
                                                awqVar.d = bj30Var6.c0;
                                                awqVar.e = i4111111111;
                                                awqVar.r = listSingletonList;
                                                awqVar.k = str7;
                                                awqVar.s = bj30Var6.n;
                                                bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                                cj30Var = cj30Var;
                                                bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                                sparseArray2.put(bj30Var6.d, bj30Var6);
                                            } else {
                                                pair = new Pair("video/3gpp", null);
                                            }
                                            str6 = null;
                                            str7 = str6;
                                            str5 = (String) pair.first;
                                            listSingletonList = (List) pair.second;
                                            i6 = -1;
                                            i5 = -1;
                                            i4 = -1;
                                            i12 = -1;
                                            i13 = -1;
                                            i14 = -1;
                                            i8 = -1;
                                            if (bj30Var6.P != null) {
                                                i15 = i5;
                                                hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                                if (hbbVarA != null) {
                                                    str10 = "video/dolby-vision";
                                                    str7 = hbbVarA.b;
                                                }
                                                boolean z112 = bj30Var6.b0;
                                                if (bj30Var6.a0) {
                                                    i16 = 2;
                                                } else {
                                                    i16 = 0;
                                                }
                                                int i4111111115 = (z112 ? 1 : 0) | i16;
                                                awqVar = new awq();
                                                if (mg40.i(str10)) {
                                                    awqVar.I = bj30Var6.Q;
                                                    awqVar.J = bj30Var6.S;
                                                    awqVar.K = bj30Var6.T;
                                                    awqVar.L = i4;
                                                } else if (mg40.m(str10)) {
                                                    if (bj30Var6.t == 0) {
                                                        i24 = bj30Var6.r;
                                                        i17 = -1;
                                                        if (i24 == -1) {
                                                            i24 = bj30Var6.o;
                                                        }
                                                        bj30Var6.r = i24;
                                                        i25 = bj30Var6.s;
                                                        if (i25 == -1) {
                                                            i25 = bj30Var6.p;
                                                        }
                                                        bj30Var6.s = i25;
                                                    } else {
                                                        i17 = -1;
                                                    }
                                                    i18 = bj30Var6.r;
                                                    if (i18 != i17) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (i12 == -1) {
                                                        if (i13 == -1) {
                                                            i12 = bj30Var6.A;
                                                            i8 = bj30Var6.B;
                                                            i13 = bj30Var6.C;
                                                        } else {
                                                            i12 = bj30Var6.A;
                                                            i8 = bj30Var6.B;
                                                            i13 = bj30Var6.C;
                                                        }
                                                    }
                                                    int i4111111116 = i12;
                                                    int i4111111117 = i13;
                                                    int i4111111118 = i8;
                                                    if (i6 != -1) {
                                                        i19 = i6;
                                                    } else {
                                                        i19 = 8;
                                                    }
                                                    if (i14 != -1) {
                                                        i21 = i14;
                                                    } else {
                                                        i20 = bj30Var6.q;
                                                        if (i20 != -1) {
                                                            i21 = i20;
                                                        } else {
                                                            i21 = 8;
                                                        }
                                                    }
                                                    if (bj30Var6.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    c4d c4dVar111 = new c4d(i4111111116, i4111111117, i4111111118, bArr, i19, i21);
                                                    str11 = bj30Var6.b;
                                                    if (str11 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (bj30Var6.u == 0) {
                                                        i22 = iIntValue;
                                                    } else {
                                                        i22 = iIntValue;
                                                    }
                                                    awqVar.v = bj30Var6.o;
                                                    awqVar.w = bj30Var6.p;
                                                    awqVar.D = f;
                                                    awqVar.B = i22;
                                                    awqVar.E = bj30Var6.y;
                                                    awqVar.F = bj30Var6.z;
                                                    awqVar.G = c4dVar111;
                                                } else if (!"application/x-subrip".equals(str10)) {
                                                    throw kq80.a("Unexpected MIME type.", null);
                                                }
                                                str12 = bj30Var6.b;
                                                if (str12 != null) {
                                                    awqVar.b = bj30Var6.b;
                                                }
                                                awqVar.f1587a = Integer.toString(i44);
                                                if (bj30Var6.f2686a) {
                                                    str13 = str15;
                                                } else {
                                                    str13 = "video/x-matroska";
                                                }
                                                awqVar.n = mg40.n(str13);
                                                awqVar.o = mg40.n(str10);
                                                awqVar.p = i15;
                                                awqVar.d = bj30Var6.c0;
                                                awqVar.e = i4111111115;
                                                awqVar.r = listSingletonList;
                                                awqVar.k = str7;
                                                awqVar.s = bj30Var6.n;
                                                bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                                cj30Var = cj30Var;
                                                bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                                sparseArray2.put(bj30Var6.d, bj30Var6);
                                            } else {
                                                i15 = i5;
                                            }
                                            str10 = str5;
                                            boolean z113 = bj30Var6.b0;
                                            if (bj30Var6.a0) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i4111111119 = (z113 ? 1 : 0) | i16;
                                            awqVar = new awq();
                                            if (mg40.i(str10)) {
                                                awqVar.I = bj30Var6.Q;
                                                awqVar.J = bj30Var6.S;
                                                awqVar.K = bj30Var6.T;
                                                awqVar.L = i4;
                                            } else if (mg40.m(str10)) {
                                                if (bj30Var6.t == 0) {
                                                    i24 = bj30Var6.r;
                                                    i17 = -1;
                                                    if (i24 == -1) {
                                                        i24 = bj30Var6.o;
                                                    }
                                                    bj30Var6.r = i24;
                                                    i25 = bj30Var6.s;
                                                    if (i25 == -1) {
                                                        i25 = bj30Var6.p;
                                                    }
                                                    bj30Var6.s = i25;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = bj30Var6.r;
                                                if (i18 != i17) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (i12 == -1) {
                                                    if (i13 == -1) {
                                                        i12 = bj30Var6.A;
                                                        i8 = bj30Var6.B;
                                                        i13 = bj30Var6.C;
                                                    } else {
                                                        i12 = bj30Var6.A;
                                                        i8 = bj30Var6.B;
                                                        i13 = bj30Var6.C;
                                                    }
                                                }
                                                int i41111111110 = i12;
                                                int i41111111111 = i13;
                                                int i41111111112 = i8;
                                                if (i6 != -1) {
                                                    i19 = i6;
                                                } else {
                                                    i19 = 8;
                                                }
                                                if (i14 != -1) {
                                                    i21 = i14;
                                                } else {
                                                    i20 = bj30Var6.q;
                                                    if (i20 != -1) {
                                                        i21 = i20;
                                                    } else {
                                                        i21 = 8;
                                                    }
                                                }
                                                if (bj30Var6.F != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                c4d c4dVar112 = new c4d(i41111111110, i41111111111, i41111111112, bArr, i19, i21);
                                                str11 = bj30Var6.b;
                                                if (str11 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bj30Var6.u == 0) {
                                                    i22 = iIntValue;
                                                } else {
                                                    i22 = iIntValue;
                                                }
                                                awqVar.v = bj30Var6.o;
                                                awqVar.w = bj30Var6.p;
                                                awqVar.D = f;
                                                awqVar.B = i22;
                                                awqVar.E = bj30Var6.y;
                                                awqVar.F = bj30Var6.z;
                                                awqVar.G = c4dVar112;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw kq80.a("Unexpected MIME type.", null);
                                            }
                                            str12 = bj30Var6.b;
                                            if (str12 != null) {
                                                awqVar.b = bj30Var6.b;
                                            }
                                            awqVar.f1587a = Integer.toString(i44);
                                            if (bj30Var6.f2686a) {
                                                str13 = str15;
                                            } else {
                                                str13 = "video/x-matroska";
                                            }
                                            awqVar.n = mg40.n(str13);
                                            awqVar.o = mg40.n(str10);
                                            awqVar.p = i15;
                                            awqVar.d = bj30Var6.c0;
                                            awqVar.e = i4111111119;
                                            awqVar.r = listSingletonList;
                                            awqVar.k = str7;
                                            awqVar.s = bj30Var6.n;
                                            bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                            cj30Var = cj30Var;
                                            bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                            sparseArray2.put(bj30Var6.d, bj30Var6);
                                        } catch (ArrayIndexOutOfBoundsException unused4) {
                                            throw kq80.a("Error parsing FourCC private data", r6);
                                        }
                                    } catch (ArrayIndexOutOfBoundsException unused5) {
                                        r6 = 0;
                                    }
                                    break;
                                case 8:
                                    byte[] bArr7 = new byte[4];
                                    System.arraycopy(bj30Var6.a(str16), 0, bArr7, 0, 4);
                                    listSingletonList = b4x.t(bArr7);
                                    str5 = "application/dvbsubs";
                                    sparseArray2 = sparseArray2;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    if (bj30Var6.P != null) {
                                        i15 = i5;
                                        hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                        if (hbbVarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = hbbVarA.b;
                                        }
                                        boolean z114 = bj30Var6.b0;
                                        if (bj30Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i41111111113 = (z114 ? 1 : 0) | i16;
                                        awqVar = new awq();
                                        if (mg40.i(str10)) {
                                            awqVar.I = bj30Var6.Q;
                                            awqVar.J = bj30Var6.S;
                                            awqVar.K = bj30Var6.T;
                                            awqVar.L = i4;
                                        } else if (mg40.m(str10)) {
                                            if (bj30Var6.t == 0) {
                                                i24 = bj30Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = bj30Var6.o;
                                                }
                                                bj30Var6.r = i24;
                                                i25 = bj30Var6.s;
                                                if (i25 == -1) {
                                                    i25 = bj30Var6.p;
                                                }
                                                bj30Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = bj30Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                } else {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                }
                                            }
                                            int i41111111114 = i12;
                                            int i41111111115 = i13;
                                            int i41111111116 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = bj30Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (bj30Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            c4d c4dVar113 = new c4d(i41111111114, i41111111115, i41111111116, bArr, i19, i21);
                                            str11 = bj30Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (bj30Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            awqVar.v = bj30Var6.o;
                                            awqVar.w = bj30Var6.p;
                                            awqVar.D = f;
                                            awqVar.B = i22;
                                            awqVar.E = bj30Var6.y;
                                            awqVar.F = bj30Var6.z;
                                            awqVar.G = c4dVar113;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw kq80.a("Unexpected MIME type.", null);
                                        }
                                        str12 = bj30Var6.b;
                                        if (str12 != null) {
                                            awqVar.b = bj30Var6.b;
                                        }
                                        awqVar.f1587a = Integer.toString(i44);
                                        if (bj30Var6.f2686a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        awqVar.n = mg40.n(str13);
                                        awqVar.o = mg40.n(str10);
                                        awqVar.p = i15;
                                        awqVar.d = bj30Var6.c0;
                                        awqVar.e = i41111111113;
                                        awqVar.r = listSingletonList;
                                        awqVar.k = str7;
                                        awqVar.s = bj30Var6.n;
                                        bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                        cj30Var = cj30Var;
                                        bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                        sparseArray2.put(bj30Var6.d, bj30Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z115 = bj30Var6.b0;
                                    if (bj30Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i41111111117 = (z115 ? 1 : 0) | i16;
                                    awqVar = new awq();
                                    if (mg40.i(str10)) {
                                        awqVar.I = bj30Var6.Q;
                                        awqVar.J = bj30Var6.S;
                                        awqVar.K = bj30Var6.T;
                                        awqVar.L = i4;
                                    } else if (mg40.m(str10)) {
                                        if (bj30Var6.t == 0) {
                                            i24 = bj30Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = bj30Var6.o;
                                            }
                                            bj30Var6.r = i24;
                                            i25 = bj30Var6.s;
                                            if (i25 == -1) {
                                                i25 = bj30Var6.p;
                                            }
                                            bj30Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = bj30Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            } else {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            }
                                        }
                                        int i41111111118 = i12;
                                        int i41111111119 = i13;
                                        int i411111111110 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = bj30Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (bj30Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        c4d c4dVar114 = new c4d(i41111111118, i41111111119, i411111111110, bArr, i19, i21);
                                        str11 = bj30Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (bj30Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        awqVar.v = bj30Var6.o;
                                        awqVar.w = bj30Var6.p;
                                        awqVar.D = f;
                                        awqVar.B = i22;
                                        awqVar.E = bj30Var6.y;
                                        awqVar.F = bj30Var6.z;
                                        awqVar.G = c4dVar114;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw kq80.a("Unexpected MIME type.", null);
                                    }
                                    str12 = bj30Var6.b;
                                    if (str12 != null) {
                                        awqVar.b = bj30Var6.b;
                                    }
                                    awqVar.f1587a = Integer.toString(i44);
                                    if (bj30Var6.f2686a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    awqVar.n = mg40.n(str13);
                                    awqVar.o = mg40.n(str10);
                                    awqVar.p = i15;
                                    awqVar.d = bj30Var6.c0;
                                    awqVar.e = i41111111117;
                                    awqVar.r = listSingletonList;
                                    awqVar.k = str7;
                                    awqVar.s = bj30Var6.n;
                                    bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                    cj30Var = cj30Var;
                                    bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                    sparseArray2.put(bj30Var6.d, bj30Var6);
                                    break;
                                case 10:
                                    z95 z95VarA = z95.a(new fq80(bj30Var6.a(bj30Var6.c)));
                                    ArrayList arrayList3 = z95VarA.f44001a;
                                    bj30Var6.f0 = z95VarA.b;
                                    str8 = z95VarA.l;
                                    i7 = z95VarA.g;
                                    i8 = z95VarA.i;
                                    list = arrayList3;
                                    i9 = z95VarA.h;
                                    i10 = z95VarA.e;
                                    i11 = z95VarA.f;
                                    str9 = "video/avc";
                                    i13 = i9;
                                    str5 = str9;
                                    i12 = i7;
                                    listSingletonList = list;
                                    i14 = i11;
                                    i6 = i10;
                                    str7 = str8;
                                    i5 = -1;
                                    i4 = -1;
                                    if (bj30Var6.P != null) {
                                        i15 = i5;
                                        hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                        if (hbbVarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = hbbVarA.b;
                                        }
                                        boolean z116 = bj30Var6.b0;
                                        if (bj30Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i411111111111 = (z116 ? 1 : 0) | i16;
                                        awqVar = new awq();
                                        if (mg40.i(str10)) {
                                            awqVar.I = bj30Var6.Q;
                                            awqVar.J = bj30Var6.S;
                                            awqVar.K = bj30Var6.T;
                                            awqVar.L = i4;
                                        } else if (mg40.m(str10)) {
                                            if (bj30Var6.t == 0) {
                                                i24 = bj30Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = bj30Var6.o;
                                                }
                                                bj30Var6.r = i24;
                                                i25 = bj30Var6.s;
                                                if (i25 == -1) {
                                                    i25 = bj30Var6.p;
                                                }
                                                bj30Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = bj30Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                } else {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                }
                                            }
                                            int i411111111112 = i12;
                                            int i411111111113 = i13;
                                            int i411111111114 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = bj30Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (bj30Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            c4d c4dVar115 = new c4d(i411111111112, i411111111113, i411111111114, bArr, i19, i21);
                                            str11 = bj30Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (bj30Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            awqVar.v = bj30Var6.o;
                                            awqVar.w = bj30Var6.p;
                                            awqVar.D = f;
                                            awqVar.B = i22;
                                            awqVar.E = bj30Var6.y;
                                            awqVar.F = bj30Var6.z;
                                            awqVar.G = c4dVar115;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw kq80.a("Unexpected MIME type.", null);
                                        }
                                        str12 = bj30Var6.b;
                                        if (str12 != null) {
                                            awqVar.b = bj30Var6.b;
                                        }
                                        awqVar.f1587a = Integer.toString(i44);
                                        if (bj30Var6.f2686a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        awqVar.n = mg40.n(str13);
                                        awqVar.o = mg40.n(str10);
                                        awqVar.p = i15;
                                        awqVar.d = bj30Var6.c0;
                                        awqVar.e = i411111111111;
                                        awqVar.r = listSingletonList;
                                        awqVar.k = str7;
                                        awqVar.s = bj30Var6.n;
                                        bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                        cj30Var = cj30Var;
                                        bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                        sparseArray2.put(bj30Var6.d, bj30Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z117 = bj30Var6.b0;
                                    if (bj30Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i411111111115 = (z117 ? 1 : 0) | i16;
                                    awqVar = new awq();
                                    if (mg40.i(str10)) {
                                        awqVar.I = bj30Var6.Q;
                                        awqVar.J = bj30Var6.S;
                                        awqVar.K = bj30Var6.T;
                                        awqVar.L = i4;
                                    } else if (mg40.m(str10)) {
                                        if (bj30Var6.t == 0) {
                                            i24 = bj30Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = bj30Var6.o;
                                            }
                                            bj30Var6.r = i24;
                                            i25 = bj30Var6.s;
                                            if (i25 == -1) {
                                                i25 = bj30Var6.p;
                                            }
                                            bj30Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = bj30Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            } else {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            }
                                        }
                                        int i411111111116 = i12;
                                        int i411111111117 = i13;
                                        int i411111111118 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = bj30Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (bj30Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        c4d c4dVar116 = new c4d(i411111111116, i411111111117, i411111111118, bArr, i19, i21);
                                        str11 = bj30Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (bj30Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        awqVar.v = bj30Var6.o;
                                        awqVar.w = bj30Var6.p;
                                        awqVar.D = f;
                                        awqVar.B = i22;
                                        awqVar.E = bj30Var6.y;
                                        awqVar.F = bj30Var6.z;
                                        awqVar.G = c4dVar116;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw kq80.a("Unexpected MIME type.", null);
                                    }
                                    str12 = bj30Var6.b;
                                    if (str12 != null) {
                                        awqVar.b = bj30Var6.b;
                                    }
                                    awqVar.f1587a = Integer.toString(i44);
                                    if (bj30Var6.f2686a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    awqVar.n = mg40.n(str13);
                                    awqVar.o = mg40.n(str10);
                                    awqVar.p = i15;
                                    awqVar.d = bj30Var6.c0;
                                    awqVar.e = i411111111115;
                                    awqVar.r = listSingletonList;
                                    awqVar.k = str7;
                                    awqVar.s = bj30Var6.n;
                                    bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                    cj30Var = cj30Var;
                                    bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                    sparseArray2.put(bj30Var6.d, bj30Var6);
                                    break;
                                case 11:
                                    listSingletonList = b4x.t(bj30Var6.a(str16));
                                    str5 = "application/vobsub";
                                    sparseArray2 = sparseArray2;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    if (bj30Var6.P != null) {
                                        i15 = i5;
                                        hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                        if (hbbVarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = hbbVarA.b;
                                        }
                                        boolean z118 = bj30Var6.b0;
                                        if (bj30Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i411111111119 = (z118 ? 1 : 0) | i16;
                                        awqVar = new awq();
                                        if (mg40.i(str10)) {
                                            awqVar.I = bj30Var6.Q;
                                            awqVar.J = bj30Var6.S;
                                            awqVar.K = bj30Var6.T;
                                            awqVar.L = i4;
                                        } else if (mg40.m(str10)) {
                                            if (bj30Var6.t == 0) {
                                                i24 = bj30Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = bj30Var6.o;
                                                }
                                                bj30Var6.r = i24;
                                                i25 = bj30Var6.s;
                                                if (i25 == -1) {
                                                    i25 = bj30Var6.p;
                                                }
                                                bj30Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = bj30Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                } else {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                }
                                            }
                                            int i4111111111110 = i12;
                                            int i4111111111111 = i13;
                                            int i4111111111112 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = bj30Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (bj30Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            c4d c4dVar117 = new c4d(i4111111111110, i4111111111111, i4111111111112, bArr, i19, i21);
                                            str11 = bj30Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (bj30Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            awqVar.v = bj30Var6.o;
                                            awqVar.w = bj30Var6.p;
                                            awqVar.D = f;
                                            awqVar.B = i22;
                                            awqVar.E = bj30Var6.y;
                                            awqVar.F = bj30Var6.z;
                                            awqVar.G = c4dVar117;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw kq80.a("Unexpected MIME type.", null);
                                        }
                                        str12 = bj30Var6.b;
                                        if (str12 != null) {
                                            awqVar.b = bj30Var6.b;
                                        }
                                        awqVar.f1587a = Integer.toString(i44);
                                        if (bj30Var6.f2686a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        awqVar.n = mg40.n(str13);
                                        awqVar.o = mg40.n(str10);
                                        awqVar.p = i15;
                                        awqVar.d = bj30Var6.c0;
                                        awqVar.e = i411111111119;
                                        awqVar.r = listSingletonList;
                                        awqVar.k = str7;
                                        awqVar.s = bj30Var6.n;
                                        bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                        cj30Var = cj30Var;
                                        bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                        sparseArray2.put(bj30Var6.d, bj30Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z119 = bj30Var6.b0;
                                    if (bj30Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i4111111111113 = (z119 ? 1 : 0) | i16;
                                    awqVar = new awq();
                                    if (mg40.i(str10)) {
                                        awqVar.I = bj30Var6.Q;
                                        awqVar.J = bj30Var6.S;
                                        awqVar.K = bj30Var6.T;
                                        awqVar.L = i4;
                                    } else if (mg40.m(str10)) {
                                        if (bj30Var6.t == 0) {
                                            i24 = bj30Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = bj30Var6.o;
                                            }
                                            bj30Var6.r = i24;
                                            i25 = bj30Var6.s;
                                            if (i25 == -1) {
                                                i25 = bj30Var6.p;
                                            }
                                            bj30Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = bj30Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            } else {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            }
                                        }
                                        int i4111111111114 = i12;
                                        int i4111111111115 = i13;
                                        int i4111111111116 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = bj30Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (bj30Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        c4d c4dVar118 = new c4d(i4111111111114, i4111111111115, i4111111111116, bArr, i19, i21);
                                        str11 = bj30Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (bj30Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        awqVar.v = bj30Var6.o;
                                        awqVar.w = bj30Var6.p;
                                        awqVar.D = f;
                                        awqVar.B = i22;
                                        awqVar.E = bj30Var6.y;
                                        awqVar.F = bj30Var6.z;
                                        awqVar.G = c4dVar118;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw kq80.a("Unexpected MIME type.", null);
                                    }
                                    str12 = bj30Var6.b;
                                    if (str12 != null) {
                                        awqVar.b = bj30Var6.b;
                                    }
                                    awqVar.f1587a = Integer.toString(i44);
                                    if (bj30Var6.f2686a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    awqVar.n = mg40.n(str13);
                                    awqVar.o = mg40.n(str10);
                                    awqVar.p = i15;
                                    awqVar.d = bj30Var6.c0;
                                    awqVar.e = i4111111111113;
                                    awqVar.r = listSingletonList;
                                    awqVar.k = str7;
                                    awqVar.s = bj30Var6.n;
                                    bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                    cj30Var = cj30Var;
                                    bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                    sparseArray2.put(bj30Var6.d, bj30Var6);
                                    break;
                                case 12:
                                    str15 = "video/webm";
                                    str17 = "audio/vnd.dts.hd";
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (bj30Var6.P != null) {
                                        i15 = i5;
                                        hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                        if (hbbVarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = hbbVarA.b;
                                        }
                                        boolean z1110 = bj30Var6.b0;
                                        if (bj30Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i4111111111117 = (z1110 ? 1 : 0) | i16;
                                        awqVar = new awq();
                                        if (mg40.i(str10)) {
                                            awqVar.I = bj30Var6.Q;
                                            awqVar.J = bj30Var6.S;
                                            awqVar.K = bj30Var6.T;
                                            awqVar.L = i4;
                                        } else if (mg40.m(str10)) {
                                            if (bj30Var6.t == 0) {
                                                i24 = bj30Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = bj30Var6.o;
                                                }
                                                bj30Var6.r = i24;
                                                i25 = bj30Var6.s;
                                                if (i25 == -1) {
                                                    i25 = bj30Var6.p;
                                                }
                                                bj30Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = bj30Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                } else {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                }
                                            }
                                            int i4111111111118 = i12;
                                            int i4111111111119 = i13;
                                            int i41111111111110 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = bj30Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (bj30Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            c4d c4dVar119 = new c4d(i4111111111118, i4111111111119, i41111111111110, bArr, i19, i21);
                                            str11 = bj30Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (bj30Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            awqVar.v = bj30Var6.o;
                                            awqVar.w = bj30Var6.p;
                                            awqVar.D = f;
                                            awqVar.B = i22;
                                            awqVar.E = bj30Var6.y;
                                            awqVar.F = bj30Var6.z;
                                            awqVar.G = c4dVar119;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw kq80.a("Unexpected MIME type.", null);
                                        }
                                        str12 = bj30Var6.b;
                                        if (str12 != null) {
                                            awqVar.b = bj30Var6.b;
                                        }
                                        awqVar.f1587a = Integer.toString(i44);
                                        if (bj30Var6.f2686a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        awqVar.n = mg40.n(str13);
                                        awqVar.o = mg40.n(str10);
                                        awqVar.p = i15;
                                        awqVar.d = bj30Var6.c0;
                                        awqVar.e = i4111111111117;
                                        awqVar.r = listSingletonList;
                                        awqVar.k = str7;
                                        awqVar.s = bj30Var6.n;
                                        bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                        cj30Var = cj30Var;
                                        bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                        sparseArray2.put(bj30Var6.d, bj30Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z1111 = bj30Var6.b0;
                                    if (bj30Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i41111111111111 = (z1111 ? 1 : 0) | i16;
                                    awqVar = new awq();
                                    if (mg40.i(str10)) {
                                        awqVar.I = bj30Var6.Q;
                                        awqVar.J = bj30Var6.S;
                                        awqVar.K = bj30Var6.T;
                                        awqVar.L = i4;
                                    } else if (mg40.m(str10)) {
                                        if (bj30Var6.t == 0) {
                                            i24 = bj30Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = bj30Var6.o;
                                            }
                                            bj30Var6.r = i24;
                                            i25 = bj30Var6.s;
                                            if (i25 == -1) {
                                                i25 = bj30Var6.p;
                                            }
                                            bj30Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = bj30Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            } else {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            }
                                        }
                                        int i41111111111112 = i12;
                                        int i41111111111113 = i13;
                                        int i41111111111114 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = bj30Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (bj30Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        c4d c4dVar1110 = new c4d(i41111111111112, i41111111111113, i41111111111114, bArr, i19, i21);
                                        str11 = bj30Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (bj30Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        awqVar.v = bj30Var6.o;
                                        awqVar.w = bj30Var6.p;
                                        awqVar.D = f;
                                        awqVar.B = i22;
                                        awqVar.E = bj30Var6.y;
                                        awqVar.F = bj30Var6.z;
                                        awqVar.G = c4dVar1110;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw kq80.a("Unexpected MIME type.", null);
                                    }
                                    str12 = bj30Var6.b;
                                    if (str12 != null) {
                                        awqVar.b = bj30Var6.b;
                                    }
                                    awqVar.f1587a = Integer.toString(i44);
                                    if (bj30Var6.f2686a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    awqVar.n = mg40.n(str13);
                                    awqVar.o = mg40.n(str10);
                                    awqVar.p = i15;
                                    awqVar.d = bj30Var6.c0;
                                    awqVar.e = i41111111111111;
                                    awqVar.r = listSingletonList;
                                    awqVar.k = str7;
                                    awqVar.s = bj30Var6.n;
                                    bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                    cj30Var = cj30Var;
                                    bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                    sparseArray2.put(bj30Var6.d, bj30Var6);
                                    break;
                                case 13:
                                    List listSingletonList2 = Collections.singletonList(bj30Var6.a(str16));
                                    byte[] bArr8 = bj30Var6.m;
                                    cf60 cf60VarE = cy2.E(new q8b(bArr8, bArr8.length), false);
                                    bj30Var6.T = cf60VarE.b;
                                    bj30Var6.Q = cf60VarE.c;
                                    listSingletonList = listSingletonList2;
                                    str7 = (String) cf60VarE.d;
                                    str5 = "audio/mp4a-latm";
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    if (bj30Var6.P != null) {
                                        i15 = i5;
                                        hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                        if (hbbVarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = hbbVarA.b;
                                        }
                                        boolean z1112 = bj30Var6.b0;
                                        if (bj30Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i41111111111115 = (z1112 ? 1 : 0) | i16;
                                        awqVar = new awq();
                                        if (mg40.i(str10)) {
                                            awqVar.I = bj30Var6.Q;
                                            awqVar.J = bj30Var6.S;
                                            awqVar.K = bj30Var6.T;
                                            awqVar.L = i4;
                                        } else if (mg40.m(str10)) {
                                            if (bj30Var6.t == 0) {
                                                i24 = bj30Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = bj30Var6.o;
                                                }
                                                bj30Var6.r = i24;
                                                i25 = bj30Var6.s;
                                                if (i25 == -1) {
                                                    i25 = bj30Var6.p;
                                                }
                                                bj30Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = bj30Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                } else {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                }
                                            }
                                            int i41111111111116 = i12;
                                            int i41111111111117 = i13;
                                            int i41111111111118 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = bj30Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (bj30Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            c4d c4dVar1111 = new c4d(i41111111111116, i41111111111117, i41111111111118, bArr, i19, i21);
                                            str11 = bj30Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (bj30Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            awqVar.v = bj30Var6.o;
                                            awqVar.w = bj30Var6.p;
                                            awqVar.D = f;
                                            awqVar.B = i22;
                                            awqVar.E = bj30Var6.y;
                                            awqVar.F = bj30Var6.z;
                                            awqVar.G = c4dVar1111;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw kq80.a("Unexpected MIME type.", null);
                                        }
                                        str12 = bj30Var6.b;
                                        if (str12 != null) {
                                            awqVar.b = bj30Var6.b;
                                        }
                                        awqVar.f1587a = Integer.toString(i44);
                                        if (bj30Var6.f2686a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        awqVar.n = mg40.n(str13);
                                        awqVar.o = mg40.n(str10);
                                        awqVar.p = i15;
                                        awqVar.d = bj30Var6.c0;
                                        awqVar.e = i41111111111115;
                                        awqVar.r = listSingletonList;
                                        awqVar.k = str7;
                                        awqVar.s = bj30Var6.n;
                                        bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                        cj30Var = cj30Var;
                                        bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                        sparseArray2.put(bj30Var6.d, bj30Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z1113 = bj30Var6.b0;
                                    if (bj30Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i41111111111119 = (z1113 ? 1 : 0) | i16;
                                    awqVar = new awq();
                                    if (mg40.i(str10)) {
                                        awqVar.I = bj30Var6.Q;
                                        awqVar.J = bj30Var6.S;
                                        awqVar.K = bj30Var6.T;
                                        awqVar.L = i4;
                                    } else if (mg40.m(str10)) {
                                        if (bj30Var6.t == 0) {
                                            i24 = bj30Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = bj30Var6.o;
                                            }
                                            bj30Var6.r = i24;
                                            i25 = bj30Var6.s;
                                            if (i25 == -1) {
                                                i25 = bj30Var6.p;
                                            }
                                            bj30Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = bj30Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            } else {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            }
                                        }
                                        int i411111111111110 = i12;
                                        int i411111111111111 = i13;
                                        int i411111111111112 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = bj30Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (bj30Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        c4d c4dVar1112 = new c4d(i411111111111110, i411111111111111, i411111111111112, bArr, i19, i21);
                                        str11 = bj30Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (bj30Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        awqVar.v = bj30Var6.o;
                                        awqVar.w = bj30Var6.p;
                                        awqVar.D = f;
                                        awqVar.B = i22;
                                        awqVar.E = bj30Var6.y;
                                        awqVar.F = bj30Var6.z;
                                        awqVar.G = c4dVar1112;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw kq80.a("Unexpected MIME type.", null);
                                    }
                                    str12 = bj30Var6.b;
                                    if (str12 != null) {
                                        awqVar.b = bj30Var6.b;
                                    }
                                    awqVar.f1587a = Integer.toString(i44);
                                    if (bj30Var6.f2686a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    awqVar.n = mg40.n(str13);
                                    awqVar.o = mg40.n(str10);
                                    awqVar.p = i15;
                                    awqVar.d = bj30Var6.c0;
                                    awqVar.e = i41111111111119;
                                    awqVar.r = listSingletonList;
                                    awqVar.k = str7;
                                    awqVar.s = bj30Var6.n;
                                    bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                    cj30Var = cj30Var;
                                    bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                    sparseArray2.put(bj30Var6.d, bj30Var6);
                                    break;
                                case 14:
                                    str15 = "video/webm";
                                    str17 = "audio/ac3";
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (bj30Var6.P != null) {
                                        i15 = i5;
                                        hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                        if (hbbVarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = hbbVarA.b;
                                        }
                                        boolean z1114 = bj30Var6.b0;
                                        if (bj30Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i411111111111113 = (z1114 ? 1 : 0) | i16;
                                        awqVar = new awq();
                                        if (mg40.i(str10)) {
                                            awqVar.I = bj30Var6.Q;
                                            awqVar.J = bj30Var6.S;
                                            awqVar.K = bj30Var6.T;
                                            awqVar.L = i4;
                                        } else if (mg40.m(str10)) {
                                            if (bj30Var6.t == 0) {
                                                i24 = bj30Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = bj30Var6.o;
                                                }
                                                bj30Var6.r = i24;
                                                i25 = bj30Var6.s;
                                                if (i25 == -1) {
                                                    i25 = bj30Var6.p;
                                                }
                                                bj30Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = bj30Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                } else {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                }
                                            }
                                            int i411111111111114 = i12;
                                            int i411111111111115 = i13;
                                            int i411111111111116 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = bj30Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (bj30Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            c4d c4dVar1113 = new c4d(i411111111111114, i411111111111115, i411111111111116, bArr, i19, i21);
                                            str11 = bj30Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (bj30Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            awqVar.v = bj30Var6.o;
                                            awqVar.w = bj30Var6.p;
                                            awqVar.D = f;
                                            awqVar.B = i22;
                                            awqVar.E = bj30Var6.y;
                                            awqVar.F = bj30Var6.z;
                                            awqVar.G = c4dVar1113;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw kq80.a("Unexpected MIME type.", null);
                                        }
                                        str12 = bj30Var6.b;
                                        if (str12 != null) {
                                            awqVar.b = bj30Var6.b;
                                        }
                                        awqVar.f1587a = Integer.toString(i44);
                                        if (bj30Var6.f2686a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        awqVar.n = mg40.n(str13);
                                        awqVar.o = mg40.n(str10);
                                        awqVar.p = i15;
                                        awqVar.d = bj30Var6.c0;
                                        awqVar.e = i411111111111113;
                                        awqVar.r = listSingletonList;
                                        awqVar.k = str7;
                                        awqVar.s = bj30Var6.n;
                                        bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                        cj30Var = cj30Var;
                                        bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                        sparseArray2.put(bj30Var6.d, bj30Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z1115 = bj30Var6.b0;
                                    if (bj30Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i411111111111117 = (z1115 ? 1 : 0) | i16;
                                    awqVar = new awq();
                                    if (mg40.i(str10)) {
                                        awqVar.I = bj30Var6.Q;
                                        awqVar.J = bj30Var6.S;
                                        awqVar.K = bj30Var6.T;
                                        awqVar.L = i4;
                                    } else if (mg40.m(str10)) {
                                        if (bj30Var6.t == 0) {
                                            i24 = bj30Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = bj30Var6.o;
                                            }
                                            bj30Var6.r = i24;
                                            i25 = bj30Var6.s;
                                            if (i25 == -1) {
                                                i25 = bj30Var6.p;
                                            }
                                            bj30Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = bj30Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            } else {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            }
                                        }
                                        int i411111111111118 = i12;
                                        int i411111111111119 = i13;
                                        int i4111111111111110 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = bj30Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (bj30Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        c4d c4dVar1114 = new c4d(i411111111111118, i411111111111119, i4111111111111110, bArr, i19, i21);
                                        str11 = bj30Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (bj30Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        awqVar.v = bj30Var6.o;
                                        awqVar.w = bj30Var6.p;
                                        awqVar.D = f;
                                        awqVar.B = i22;
                                        awqVar.E = bj30Var6.y;
                                        awqVar.F = bj30Var6.z;
                                        awqVar.G = c4dVar1114;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw kq80.a("Unexpected MIME type.", null);
                                    }
                                    str12 = bj30Var6.b;
                                    if (str12 != null) {
                                        awqVar.b = bj30Var6.b;
                                    }
                                    awqVar.f1587a = Integer.toString(i44);
                                    if (bj30Var6.f2686a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    awqVar.n = mg40.n(str13);
                                    awqVar.o = mg40.n(str10);
                                    awqVar.p = i15;
                                    awqVar.d = bj30Var6.c0;
                                    awqVar.e = i411111111111117;
                                    awqVar.r = listSingletonList;
                                    awqVar.k = str7;
                                    awqVar.s = bj30Var6.n;
                                    bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                    cj30Var = cj30Var;
                                    bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                    sparseArray2.put(bj30Var6.d, bj30Var6);
                                    break;
                                case 15:
                                    str15 = "video/webm";
                                    bj30Var6.X = true;
                                    str17 = "audio/vnd.dts";
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (bj30Var6.P != null) {
                                        i15 = i5;
                                        hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                        if (hbbVarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = hbbVarA.b;
                                        }
                                        boolean z1116 = bj30Var6.b0;
                                        if (bj30Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i4111111111111111 = (z1116 ? 1 : 0) | i16;
                                        awqVar = new awq();
                                        if (mg40.i(str10)) {
                                            awqVar.I = bj30Var6.Q;
                                            awqVar.J = bj30Var6.S;
                                            awqVar.K = bj30Var6.T;
                                            awqVar.L = i4;
                                        } else if (mg40.m(str10)) {
                                            if (bj30Var6.t == 0) {
                                                i24 = bj30Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = bj30Var6.o;
                                                }
                                                bj30Var6.r = i24;
                                                i25 = bj30Var6.s;
                                                if (i25 == -1) {
                                                    i25 = bj30Var6.p;
                                                }
                                                bj30Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = bj30Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                } else {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                }
                                            }
                                            int i4111111111111112 = i12;
                                            int i4111111111111113 = i13;
                                            int i4111111111111114 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = bj30Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (bj30Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            c4d c4dVar1115 = new c4d(i4111111111111112, i4111111111111113, i4111111111111114, bArr, i19, i21);
                                            str11 = bj30Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (bj30Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            awqVar.v = bj30Var6.o;
                                            awqVar.w = bj30Var6.p;
                                            awqVar.D = f;
                                            awqVar.B = i22;
                                            awqVar.E = bj30Var6.y;
                                            awqVar.F = bj30Var6.z;
                                            awqVar.G = c4dVar1115;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw kq80.a("Unexpected MIME type.", null);
                                        }
                                        str12 = bj30Var6.b;
                                        if (str12 != null) {
                                            awqVar.b = bj30Var6.b;
                                        }
                                        awqVar.f1587a = Integer.toString(i44);
                                        if (bj30Var6.f2686a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        awqVar.n = mg40.n(str13);
                                        awqVar.o = mg40.n(str10);
                                        awqVar.p = i15;
                                        awqVar.d = bj30Var6.c0;
                                        awqVar.e = i4111111111111111;
                                        awqVar.r = listSingletonList;
                                        awqVar.k = str7;
                                        awqVar.s = bj30Var6.n;
                                        bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                        cj30Var = cj30Var;
                                        bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                        sparseArray2.put(bj30Var6.d, bj30Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z1117 = bj30Var6.b0;
                                    if (bj30Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i4111111111111115 = (z1117 ? 1 : 0) | i16;
                                    awqVar = new awq();
                                    if (mg40.i(str10)) {
                                        awqVar.I = bj30Var6.Q;
                                        awqVar.J = bj30Var6.S;
                                        awqVar.K = bj30Var6.T;
                                        awqVar.L = i4;
                                    } else if (mg40.m(str10)) {
                                        if (bj30Var6.t == 0) {
                                            i24 = bj30Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = bj30Var6.o;
                                            }
                                            bj30Var6.r = i24;
                                            i25 = bj30Var6.s;
                                            if (i25 == -1) {
                                                i25 = bj30Var6.p;
                                            }
                                            bj30Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = bj30Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            } else {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            }
                                        }
                                        int i4111111111111116 = i12;
                                        int i4111111111111117 = i13;
                                        int i4111111111111118 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = bj30Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (bj30Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        c4d c4dVar1116 = new c4d(i4111111111111116, i4111111111111117, i4111111111111118, bArr, i19, i21);
                                        str11 = bj30Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (bj30Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        awqVar.v = bj30Var6.o;
                                        awqVar.w = bj30Var6.p;
                                        awqVar.D = f;
                                        awqVar.B = i22;
                                        awqVar.E = bj30Var6.y;
                                        awqVar.F = bj30Var6.z;
                                        awqVar.G = c4dVar1116;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw kq80.a("Unexpected MIME type.", null);
                                    }
                                    str12 = bj30Var6.b;
                                    if (str12 != null) {
                                        awqVar.b = bj30Var6.b;
                                    }
                                    awqVar.f1587a = Integer.toString(i44);
                                    if (bj30Var6.f2686a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    awqVar.n = mg40.n(str13);
                                    awqVar.o = mg40.n(str10);
                                    awqVar.p = i15;
                                    awqVar.d = bj30Var6.c0;
                                    awqVar.e = i4111111111111115;
                                    awqVar.r = listSingletonList;
                                    awqVar.k = str7;
                                    awqVar.s = bj30Var6.n;
                                    bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                    cj30Var = cj30Var;
                                    bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                    sparseArray2.put(bj30Var6.d, bj30Var6);
                                    break;
                                case 16:
                                    str15 = "video/webm";
                                    byte[] bArr9 = bj30Var6.m;
                                    str17 = "video/av01";
                                    if (bArr9 != null) {
                                        listT = b4x.t(bArr9);
                                        z55 z55VarH = z55.h(bj30Var6.m);
                                        if (z55VarH != null) {
                                            int i64 = z55VarH.c;
                                            i8 = z55VarH.e;
                                            int i65 = z55VarH.d;
                                            i6 = z55VarH.b;
                                            listSingletonList = listT;
                                            str5 = "video/av01";
                                            i13 = i65;
                                            i14 = i6;
                                            str7 = (String) z55VarH.f;
                                            i12 = i64;
                                            i5 = -1;
                                            i4 = -1;
                                            if (bj30Var6.P != null) {
                                                i15 = i5;
                                                hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                                if (hbbVarA != null) {
                                                    str10 = "video/dolby-vision";
                                                    str7 = hbbVarA.b;
                                                }
                                                boolean z1118 = bj30Var6.b0;
                                                if (bj30Var6.a0) {
                                                    i16 = 2;
                                                } else {
                                                    i16 = 0;
                                                }
                                                int i4111111111111119 = (z1118 ? 1 : 0) | i16;
                                                awqVar = new awq();
                                                if (mg40.i(str10)) {
                                                    awqVar.I = bj30Var6.Q;
                                                    awqVar.J = bj30Var6.S;
                                                    awqVar.K = bj30Var6.T;
                                                    awqVar.L = i4;
                                                } else if (mg40.m(str10)) {
                                                    if (bj30Var6.t == 0) {
                                                        i24 = bj30Var6.r;
                                                        i17 = -1;
                                                        if (i24 == -1) {
                                                            i24 = bj30Var6.o;
                                                        }
                                                        bj30Var6.r = i24;
                                                        i25 = bj30Var6.s;
                                                        if (i25 == -1) {
                                                            i25 = bj30Var6.p;
                                                        }
                                                        bj30Var6.s = i25;
                                                    } else {
                                                        i17 = -1;
                                                    }
                                                    i18 = bj30Var6.r;
                                                    if (i18 != i17) {
                                                        f = -1.0f;
                                                    } else {
                                                        f = -1.0f;
                                                    }
                                                    if (i12 == -1) {
                                                        if (i13 == -1) {
                                                            i12 = bj30Var6.A;
                                                            i8 = bj30Var6.B;
                                                            i13 = bj30Var6.C;
                                                        } else {
                                                            i12 = bj30Var6.A;
                                                            i8 = bj30Var6.B;
                                                            i13 = bj30Var6.C;
                                                        }
                                                    }
                                                    int i41111111111111110 = i12;
                                                    int i41111111111111111 = i13;
                                                    int i41111111111111112 = i8;
                                                    if (i6 != -1) {
                                                        i19 = i6;
                                                    } else {
                                                        i19 = 8;
                                                    }
                                                    if (i14 != -1) {
                                                        i21 = i14;
                                                    } else {
                                                        i20 = bj30Var6.q;
                                                        if (i20 != -1) {
                                                            i21 = i20;
                                                        } else {
                                                            i21 = 8;
                                                        }
                                                    }
                                                    if (bj30Var6.F != -1.0f) {
                                                        bArr = null;
                                                    } else {
                                                        bArr = null;
                                                    }
                                                    c4d c4dVar1117 = new c4d(i41111111111111110, i41111111111111111, i41111111111111112, bArr, i19, i21);
                                                    str11 = bj30Var6.b;
                                                    if (str11 == null) {
                                                        iIntValue = -1;
                                                    } else {
                                                        iIntValue = -1;
                                                    }
                                                    if (bj30Var6.u == 0) {
                                                        i22 = iIntValue;
                                                    } else {
                                                        i22 = iIntValue;
                                                    }
                                                    awqVar.v = bj30Var6.o;
                                                    awqVar.w = bj30Var6.p;
                                                    awqVar.D = f;
                                                    awqVar.B = i22;
                                                    awqVar.E = bj30Var6.y;
                                                    awqVar.F = bj30Var6.z;
                                                    awqVar.G = c4dVar1117;
                                                } else if (!"application/x-subrip".equals(str10)) {
                                                    throw kq80.a("Unexpected MIME type.", null);
                                                }
                                                str12 = bj30Var6.b;
                                                if (str12 != null) {
                                                    awqVar.b = bj30Var6.b;
                                                }
                                                awqVar.f1587a = Integer.toString(i44);
                                                if (bj30Var6.f2686a) {
                                                    str13 = str15;
                                                } else {
                                                    str13 = "video/x-matroska";
                                                }
                                                awqVar.n = mg40.n(str13);
                                                awqVar.o = mg40.n(str10);
                                                awqVar.p = i15;
                                                awqVar.d = bj30Var6.c0;
                                                awqVar.e = i4111111111111119;
                                                awqVar.r = listSingletonList;
                                                awqVar.k = str7;
                                                awqVar.s = bj30Var6.n;
                                                bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                                cj30Var = cj30Var;
                                                bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                                sparseArray2.put(bj30Var6.d, bj30Var6);
                                            } else {
                                                i15 = i5;
                                            }
                                            str10 = str5;
                                            boolean z1119 = bj30Var6.b0;
                                            if (bj30Var6.a0) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i41111111111111113 = (z1119 ? 1 : 0) | i16;
                                            awqVar = new awq();
                                            if (mg40.i(str10)) {
                                                awqVar.I = bj30Var6.Q;
                                                awqVar.J = bj30Var6.S;
                                                awqVar.K = bj30Var6.T;
                                                awqVar.L = i4;
                                            } else if (mg40.m(str10)) {
                                                if (bj30Var6.t == 0) {
                                                    i24 = bj30Var6.r;
                                                    i17 = -1;
                                                    if (i24 == -1) {
                                                        i24 = bj30Var6.o;
                                                    }
                                                    bj30Var6.r = i24;
                                                    i25 = bj30Var6.s;
                                                    if (i25 == -1) {
                                                        i25 = bj30Var6.p;
                                                    }
                                                    bj30Var6.s = i25;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = bj30Var6.r;
                                                if (i18 != i17) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (i12 == -1) {
                                                    if (i13 == -1) {
                                                        i12 = bj30Var6.A;
                                                        i8 = bj30Var6.B;
                                                        i13 = bj30Var6.C;
                                                    } else {
                                                        i12 = bj30Var6.A;
                                                        i8 = bj30Var6.B;
                                                        i13 = bj30Var6.C;
                                                    }
                                                }
                                                int i41111111111111114 = i12;
                                                int i41111111111111115 = i13;
                                                int i41111111111111116 = i8;
                                                if (i6 != -1) {
                                                    i19 = i6;
                                                } else {
                                                    i19 = 8;
                                                }
                                                if (i14 != -1) {
                                                    i21 = i14;
                                                } else {
                                                    i20 = bj30Var6.q;
                                                    if (i20 != -1) {
                                                        i21 = i20;
                                                    } else {
                                                        i21 = 8;
                                                    }
                                                }
                                                if (bj30Var6.F != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                c4d c4dVar1118 = new c4d(i41111111111111114, i41111111111111115, i41111111111111116, bArr, i19, i21);
                                                str11 = bj30Var6.b;
                                                if (str11 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bj30Var6.u == 0) {
                                                    i22 = iIntValue;
                                                } else {
                                                    i22 = iIntValue;
                                                }
                                                awqVar.v = bj30Var6.o;
                                                awqVar.w = bj30Var6.p;
                                                awqVar.D = f;
                                                awqVar.B = i22;
                                                awqVar.E = bj30Var6.y;
                                                awqVar.F = bj30Var6.z;
                                                awqVar.G = c4dVar1118;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw kq80.a("Unexpected MIME type.", null);
                                            }
                                            str12 = bj30Var6.b;
                                            if (str12 != null) {
                                                awqVar.b = bj30Var6.b;
                                            }
                                            awqVar.f1587a = Integer.toString(i44);
                                            if (bj30Var6.f2686a) {
                                                str13 = str15;
                                            } else {
                                                str13 = "video/x-matroska";
                                            }
                                            awqVar.n = mg40.n(str13);
                                            awqVar.o = mg40.n(str10);
                                            awqVar.p = i15;
                                            awqVar.d = bj30Var6.c0;
                                            awqVar.e = i41111111111111113;
                                            awqVar.r = listSingletonList;
                                            awqVar.k = str7;
                                            awqVar.s = bj30Var6.n;
                                            bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                            cj30Var = cj30Var;
                                            bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                            sparseArray2.put(bj30Var6.d, bj30Var6);
                                        }
                                        listSingletonList = listT;
                                        str5 = str17;
                                        i6 = -1;
                                        i5 = -1;
                                        i4 = -1;
                                        i12 = -1;
                                        i13 = -1;
                                        i14 = -1;
                                        i8 = -1;
                                        str7 = null;
                                        if (bj30Var6.P != null) {
                                            i15 = i5;
                                            hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                            if (hbbVarA != null) {
                                                str10 = "video/dolby-vision";
                                                str7 = hbbVarA.b;
                                            }
                                            boolean z11110 = bj30Var6.b0;
                                            if (bj30Var6.a0) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i41111111111111117 = (z11110 ? 1 : 0) | i16;
                                            awqVar = new awq();
                                            if (mg40.i(str10)) {
                                                awqVar.I = bj30Var6.Q;
                                                awqVar.J = bj30Var6.S;
                                                awqVar.K = bj30Var6.T;
                                                awqVar.L = i4;
                                            } else if (mg40.m(str10)) {
                                                if (bj30Var6.t == 0) {
                                                    i24 = bj30Var6.r;
                                                    i17 = -1;
                                                    if (i24 == -1) {
                                                        i24 = bj30Var6.o;
                                                    }
                                                    bj30Var6.r = i24;
                                                    i25 = bj30Var6.s;
                                                    if (i25 == -1) {
                                                        i25 = bj30Var6.p;
                                                    }
                                                    bj30Var6.s = i25;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = bj30Var6.r;
                                                if (i18 != i17) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (i12 == -1) {
                                                    if (i13 == -1) {
                                                        i12 = bj30Var6.A;
                                                        i8 = bj30Var6.B;
                                                        i13 = bj30Var6.C;
                                                    } else {
                                                        i12 = bj30Var6.A;
                                                        i8 = bj30Var6.B;
                                                        i13 = bj30Var6.C;
                                                    }
                                                }
                                                int i41111111111111118 = i12;
                                                int i41111111111111119 = i13;
                                                int i411111111111111110 = i8;
                                                if (i6 != -1) {
                                                    i19 = i6;
                                                } else {
                                                    i19 = 8;
                                                }
                                                if (i14 != -1) {
                                                    i21 = i14;
                                                } else {
                                                    i20 = bj30Var6.q;
                                                    if (i20 != -1) {
                                                        i21 = i20;
                                                    } else {
                                                        i21 = 8;
                                                    }
                                                }
                                                if (bj30Var6.F != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                c4d c4dVar1119 = new c4d(i41111111111111118, i41111111111111119, i411111111111111110, bArr, i19, i21);
                                                str11 = bj30Var6.b;
                                                if (str11 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bj30Var6.u == 0) {
                                                    i22 = iIntValue;
                                                } else {
                                                    i22 = iIntValue;
                                                }
                                                awqVar.v = bj30Var6.o;
                                                awqVar.w = bj30Var6.p;
                                                awqVar.D = f;
                                                awqVar.B = i22;
                                                awqVar.E = bj30Var6.y;
                                                awqVar.F = bj30Var6.z;
                                                awqVar.G = c4dVar1119;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw kq80.a("Unexpected MIME type.", null);
                                            }
                                            str12 = bj30Var6.b;
                                            if (str12 != null) {
                                                awqVar.b = bj30Var6.b;
                                            }
                                            awqVar.f1587a = Integer.toString(i44);
                                            if (bj30Var6.f2686a) {
                                                str13 = str15;
                                            } else {
                                                str13 = "video/x-matroska";
                                            }
                                            awqVar.n = mg40.n(str13);
                                            awqVar.o = mg40.n(str10);
                                            awqVar.p = i15;
                                            awqVar.d = bj30Var6.c0;
                                            awqVar.e = i41111111111111117;
                                            awqVar.r = listSingletonList;
                                            awqVar.k = str7;
                                            awqVar.s = bj30Var6.n;
                                            bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                            cj30Var = cj30Var;
                                            bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                            sparseArray2.put(bj30Var6.d, bj30Var6);
                                        } else {
                                            i15 = i5;
                                        }
                                        str10 = str5;
                                        boolean z11111 = bj30Var6.b0;
                                        if (bj30Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i411111111111111111 = (z11111 ? 1 : 0) | i16;
                                        awqVar = new awq();
                                        if (mg40.i(str10)) {
                                            awqVar.I = bj30Var6.Q;
                                            awqVar.J = bj30Var6.S;
                                            awqVar.K = bj30Var6.T;
                                            awqVar.L = i4;
                                        } else if (mg40.m(str10)) {
                                            if (bj30Var6.t == 0) {
                                                i24 = bj30Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = bj30Var6.o;
                                                }
                                                bj30Var6.r = i24;
                                                i25 = bj30Var6.s;
                                                if (i25 == -1) {
                                                    i25 = bj30Var6.p;
                                                }
                                                bj30Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = bj30Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                } else {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                }
                                            }
                                            int i411111111111111112 = i12;
                                            int i411111111111111113 = i13;
                                            int i411111111111111114 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = bj30Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (bj30Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            c4d c4dVar11110 = new c4d(i411111111111111112, i411111111111111113, i411111111111111114, bArr, i19, i21);
                                            str11 = bj30Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (bj30Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            awqVar.v = bj30Var6.o;
                                            awqVar.w = bj30Var6.p;
                                            awqVar.D = f;
                                            awqVar.B = i22;
                                            awqVar.E = bj30Var6.y;
                                            awqVar.F = bj30Var6.z;
                                            awqVar.G = c4dVar11110;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw kq80.a("Unexpected MIME type.", null);
                                        }
                                        str12 = bj30Var6.b;
                                        if (str12 != null) {
                                            awqVar.b = bj30Var6.b;
                                        }
                                        awqVar.f1587a = Integer.toString(i44);
                                        if (bj30Var6.f2686a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        awqVar.n = mg40.n(str13);
                                        awqVar.o = mg40.n(str10);
                                        awqVar.p = i15;
                                        awqVar.d = bj30Var6.c0;
                                        awqVar.e = i411111111111111111;
                                        awqVar.r = listSingletonList;
                                        awqVar.k = str7;
                                        awqVar.s = bj30Var6.n;
                                        bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                        cj30Var = cj30Var;
                                        bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                        sparseArray2.put(bj30Var6.d, bj30Var6);
                                    }
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (bj30Var6.P != null) {
                                        i15 = i5;
                                        hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                        if (hbbVarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = hbbVarA.b;
                                        }
                                        boolean z11112 = bj30Var6.b0;
                                        if (bj30Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i411111111111111115 = (z11112 ? 1 : 0) | i16;
                                        awqVar = new awq();
                                        if (mg40.i(str10)) {
                                            awqVar.I = bj30Var6.Q;
                                            awqVar.J = bj30Var6.S;
                                            awqVar.K = bj30Var6.T;
                                            awqVar.L = i4;
                                        } else if (mg40.m(str10)) {
                                            if (bj30Var6.t == 0) {
                                                i24 = bj30Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = bj30Var6.o;
                                                }
                                                bj30Var6.r = i24;
                                                i25 = bj30Var6.s;
                                                if (i25 == -1) {
                                                    i25 = bj30Var6.p;
                                                }
                                                bj30Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = bj30Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                } else {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                }
                                            }
                                            int i411111111111111116 = i12;
                                            int i411111111111111117 = i13;
                                            int i411111111111111118 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = bj30Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (bj30Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            c4d c4dVar11111 = new c4d(i411111111111111116, i411111111111111117, i411111111111111118, bArr, i19, i21);
                                            str11 = bj30Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (bj30Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            awqVar.v = bj30Var6.o;
                                            awqVar.w = bj30Var6.p;
                                            awqVar.D = f;
                                            awqVar.B = i22;
                                            awqVar.E = bj30Var6.y;
                                            awqVar.F = bj30Var6.z;
                                            awqVar.G = c4dVar11111;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw kq80.a("Unexpected MIME type.", null);
                                        }
                                        str12 = bj30Var6.b;
                                        if (str12 != null) {
                                            awqVar.b = bj30Var6.b;
                                        }
                                        awqVar.f1587a = Integer.toString(i44);
                                        if (bj30Var6.f2686a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        awqVar.n = mg40.n(str13);
                                        awqVar.o = mg40.n(str10);
                                        awqVar.p = i15;
                                        awqVar.d = bj30Var6.c0;
                                        awqVar.e = i411111111111111115;
                                        awqVar.r = listSingletonList;
                                        awqVar.k = str7;
                                        awqVar.s = bj30Var6.n;
                                        bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                        cj30Var = cj30Var;
                                        bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                        sparseArray2.put(bj30Var6.d, bj30Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z11113 = bj30Var6.b0;
                                    if (bj30Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i411111111111111119 = (z11113 ? 1 : 0) | i16;
                                    awqVar = new awq();
                                    if (mg40.i(str10)) {
                                        awqVar.I = bj30Var6.Q;
                                        awqVar.J = bj30Var6.S;
                                        awqVar.K = bj30Var6.T;
                                        awqVar.L = i4;
                                    } else if (mg40.m(str10)) {
                                        if (bj30Var6.t == 0) {
                                            i24 = bj30Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = bj30Var6.o;
                                            }
                                            bj30Var6.r = i24;
                                            i25 = bj30Var6.s;
                                            if (i25 == -1) {
                                                i25 = bj30Var6.p;
                                            }
                                            bj30Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = bj30Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            } else {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            }
                                        }
                                        int i4111111111111111110 = i12;
                                        int i4111111111111111111 = i13;
                                        int i4111111111111111112 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = bj30Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (bj30Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        c4d c4dVar11112 = new c4d(i4111111111111111110, i4111111111111111111, i4111111111111111112, bArr, i19, i21);
                                        str11 = bj30Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (bj30Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        awqVar.v = bj30Var6.o;
                                        awqVar.w = bj30Var6.p;
                                        awqVar.D = f;
                                        awqVar.B = i22;
                                        awqVar.E = bj30Var6.y;
                                        awqVar.F = bj30Var6.z;
                                        awqVar.G = c4dVar11112;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw kq80.a("Unexpected MIME type.", null);
                                    }
                                    str12 = bj30Var6.b;
                                    if (str12 != null) {
                                        awqVar.b = bj30Var6.b;
                                    }
                                    awqVar.f1587a = Integer.toString(i44);
                                    if (bj30Var6.f2686a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    awqVar.n = mg40.n(str13);
                                    awqVar.o = mg40.n(str10);
                                    awqVar.p = i15;
                                    awqVar.d = bj30Var6.c0;
                                    awqVar.e = i411111111111111119;
                                    awqVar.r = listSingletonList;
                                    awqVar.k = str7;
                                    awqVar.s = bj30Var6.n;
                                    bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                    cj30Var = cj30Var;
                                    bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                    sparseArray2.put(bj30Var6.d, bj30Var6);
                                    break;
                                case 17:
                                    str15 = "video/webm";
                                    str17 = "video/x-vnd.on2.vp8";
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (bj30Var6.P != null) {
                                        i15 = i5;
                                        hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                        if (hbbVarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = hbbVarA.b;
                                        }
                                        boolean z11114 = bj30Var6.b0;
                                        if (bj30Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i4111111111111111113 = (z11114 ? 1 : 0) | i16;
                                        awqVar = new awq();
                                        if (mg40.i(str10)) {
                                            awqVar.I = bj30Var6.Q;
                                            awqVar.J = bj30Var6.S;
                                            awqVar.K = bj30Var6.T;
                                            awqVar.L = i4;
                                        } else if (mg40.m(str10)) {
                                            if (bj30Var6.t == 0) {
                                                i24 = bj30Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = bj30Var6.o;
                                                }
                                                bj30Var6.r = i24;
                                                i25 = bj30Var6.s;
                                                if (i25 == -1) {
                                                    i25 = bj30Var6.p;
                                                }
                                                bj30Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = bj30Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                } else {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                }
                                            }
                                            int i4111111111111111114 = i12;
                                            int i4111111111111111115 = i13;
                                            int i4111111111111111116 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = bj30Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (bj30Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            c4d c4dVar11113 = new c4d(i4111111111111111114, i4111111111111111115, i4111111111111111116, bArr, i19, i21);
                                            str11 = bj30Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (bj30Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            awqVar.v = bj30Var6.o;
                                            awqVar.w = bj30Var6.p;
                                            awqVar.D = f;
                                            awqVar.B = i22;
                                            awqVar.E = bj30Var6.y;
                                            awqVar.F = bj30Var6.z;
                                            awqVar.G = c4dVar11113;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw kq80.a("Unexpected MIME type.", null);
                                        }
                                        str12 = bj30Var6.b;
                                        if (str12 != null) {
                                            awqVar.b = bj30Var6.b;
                                        }
                                        awqVar.f1587a = Integer.toString(i44);
                                        if (bj30Var6.f2686a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        awqVar.n = mg40.n(str13);
                                        awqVar.o = mg40.n(str10);
                                        awqVar.p = i15;
                                        awqVar.d = bj30Var6.c0;
                                        awqVar.e = i4111111111111111113;
                                        awqVar.r = listSingletonList;
                                        awqVar.k = str7;
                                        awqVar.s = bj30Var6.n;
                                        bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                        cj30Var = cj30Var;
                                        bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                        sparseArray2.put(bj30Var6.d, bj30Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z11115 = bj30Var6.b0;
                                    if (bj30Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i4111111111111111117 = (z11115 ? 1 : 0) | i16;
                                    awqVar = new awq();
                                    if (mg40.i(str10)) {
                                        awqVar.I = bj30Var6.Q;
                                        awqVar.J = bj30Var6.S;
                                        awqVar.K = bj30Var6.T;
                                        awqVar.L = i4;
                                    } else if (mg40.m(str10)) {
                                        if (bj30Var6.t == 0) {
                                            i24 = bj30Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = bj30Var6.o;
                                            }
                                            bj30Var6.r = i24;
                                            i25 = bj30Var6.s;
                                            if (i25 == -1) {
                                                i25 = bj30Var6.p;
                                            }
                                            bj30Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = bj30Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            } else {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            }
                                        }
                                        int i4111111111111111118 = i12;
                                        int i4111111111111111119 = i13;
                                        int i41111111111111111110 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = bj30Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (bj30Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        c4d c4dVar11114 = new c4d(i4111111111111111118, i4111111111111111119, i41111111111111111110, bArr, i19, i21);
                                        str11 = bj30Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (bj30Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        awqVar.v = bj30Var6.o;
                                        awqVar.w = bj30Var6.p;
                                        awqVar.D = f;
                                        awqVar.B = i22;
                                        awqVar.E = bj30Var6.y;
                                        awqVar.F = bj30Var6.z;
                                        awqVar.G = c4dVar11114;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw kq80.a("Unexpected MIME type.", null);
                                    }
                                    str12 = bj30Var6.b;
                                    if (str12 != null) {
                                        awqVar.b = bj30Var6.b;
                                    }
                                    awqVar.f1587a = Integer.toString(i44);
                                    if (bj30Var6.f2686a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    awqVar.n = mg40.n(str13);
                                    awqVar.o = mg40.n(str10);
                                    awqVar.p = i15;
                                    awqVar.d = bj30Var6.c0;
                                    awqVar.e = i4111111111111111117;
                                    awqVar.r = listSingletonList;
                                    awqVar.k = str7;
                                    awqVar.s = bj30Var6.n;
                                    bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                    cj30Var = cj30Var;
                                    bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                    sparseArray2.put(bj30Var6.d, bj30Var6);
                                    break;
                                case 18:
                                    str15 = "video/webm";
                                    byte[] bArr10 = bj30Var6.m;
                                    listT = bArr10 == null ? null : b4x.t(bArr10);
                                    str17 = "video/x-vnd.on2.vp9";
                                    listSingletonList = listT;
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    if (bj30Var6.P != null) {
                                        i15 = i5;
                                        hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                        if (hbbVarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = hbbVarA.b;
                                        }
                                        boolean z11116 = bj30Var6.b0;
                                        if (bj30Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i41111111111111111111 = (z11116 ? 1 : 0) | i16;
                                        awqVar = new awq();
                                        if (mg40.i(str10)) {
                                            awqVar.I = bj30Var6.Q;
                                            awqVar.J = bj30Var6.S;
                                            awqVar.K = bj30Var6.T;
                                            awqVar.L = i4;
                                        } else if (mg40.m(str10)) {
                                            if (bj30Var6.t == 0) {
                                                i24 = bj30Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = bj30Var6.o;
                                                }
                                                bj30Var6.r = i24;
                                                i25 = bj30Var6.s;
                                                if (i25 == -1) {
                                                    i25 = bj30Var6.p;
                                                }
                                                bj30Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = bj30Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                } else {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                }
                                            }
                                            int i41111111111111111112 = i12;
                                            int i41111111111111111113 = i13;
                                            int i41111111111111111114 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = bj30Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (bj30Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            c4d c4dVar11115 = new c4d(i41111111111111111112, i41111111111111111113, i41111111111111111114, bArr, i19, i21);
                                            str11 = bj30Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (bj30Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            awqVar.v = bj30Var6.o;
                                            awqVar.w = bj30Var6.p;
                                            awqVar.D = f;
                                            awqVar.B = i22;
                                            awqVar.E = bj30Var6.y;
                                            awqVar.F = bj30Var6.z;
                                            awqVar.G = c4dVar11115;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw kq80.a("Unexpected MIME type.", null);
                                        }
                                        str12 = bj30Var6.b;
                                        if (str12 != null) {
                                            awqVar.b = bj30Var6.b;
                                        }
                                        awqVar.f1587a = Integer.toString(i44);
                                        if (bj30Var6.f2686a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        awqVar.n = mg40.n(str13);
                                        awqVar.o = mg40.n(str10);
                                        awqVar.p = i15;
                                        awqVar.d = bj30Var6.c0;
                                        awqVar.e = i41111111111111111111;
                                        awqVar.r = listSingletonList;
                                        awqVar.k = str7;
                                        awqVar.s = bj30Var6.n;
                                        bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                        cj30Var = cj30Var;
                                        bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                        sparseArray2.put(bj30Var6.d, bj30Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z11117 = bj30Var6.b0;
                                    if (bj30Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i41111111111111111115 = (z11117 ? 1 : 0) | i16;
                                    awqVar = new awq();
                                    if (mg40.i(str10)) {
                                        awqVar.I = bj30Var6.Q;
                                        awqVar.J = bj30Var6.S;
                                        awqVar.K = bj30Var6.T;
                                        awqVar.L = i4;
                                    } else if (mg40.m(str10)) {
                                        if (bj30Var6.t == 0) {
                                            i24 = bj30Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = bj30Var6.o;
                                            }
                                            bj30Var6.r = i24;
                                            i25 = bj30Var6.s;
                                            if (i25 == -1) {
                                                i25 = bj30Var6.p;
                                            }
                                            bj30Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = bj30Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            } else {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            }
                                        }
                                        int i41111111111111111116 = i12;
                                        int i41111111111111111117 = i13;
                                        int i41111111111111111118 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = bj30Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (bj30Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        c4d c4dVar11116 = new c4d(i41111111111111111116, i41111111111111111117, i41111111111111111118, bArr, i19, i21);
                                        str11 = bj30Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (bj30Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        awqVar.v = bj30Var6.o;
                                        awqVar.w = bj30Var6.p;
                                        awqVar.D = f;
                                        awqVar.B = i22;
                                        awqVar.E = bj30Var6.y;
                                        awqVar.F = bj30Var6.z;
                                        awqVar.G = c4dVar11116;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw kq80.a("Unexpected MIME type.", null);
                                    }
                                    str12 = bj30Var6.b;
                                    if (str12 != null) {
                                        awqVar.b = bj30Var6.b;
                                    }
                                    awqVar.f1587a = Integer.toString(i44);
                                    if (bj30Var6.f2686a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    awqVar.n = mg40.n(str13);
                                    awqVar.o = mg40.n(str10);
                                    awqVar.p = i15;
                                    awqVar.d = bj30Var6.c0;
                                    awqVar.e = i41111111111111111115;
                                    awqVar.r = listSingletonList;
                                    awqVar.k = str7;
                                    awqVar.s = bj30Var6.n;
                                    bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                    cj30Var = cj30Var;
                                    bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                    sparseArray2.put(bj30Var6.d, bj30Var6);
                                    break;
                                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                    str5 = "application/pgs";
                                    sparseArray2 = sparseArray2;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (bj30Var6.P != null) {
                                        i15 = i5;
                                        hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                        if (hbbVarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = hbbVarA.b;
                                        }
                                        boolean z11118 = bj30Var6.b0;
                                        if (bj30Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i41111111111111111119 = (z11118 ? 1 : 0) | i16;
                                        awqVar = new awq();
                                        if (mg40.i(str10)) {
                                            awqVar.I = bj30Var6.Q;
                                            awqVar.J = bj30Var6.S;
                                            awqVar.K = bj30Var6.T;
                                            awqVar.L = i4;
                                        } else if (mg40.m(str10)) {
                                            if (bj30Var6.t == 0) {
                                                i24 = bj30Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = bj30Var6.o;
                                                }
                                                bj30Var6.r = i24;
                                                i25 = bj30Var6.s;
                                                if (i25 == -1) {
                                                    i25 = bj30Var6.p;
                                                }
                                                bj30Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = bj30Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                } else {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                }
                                            }
                                            int i411111111111111111110 = i12;
                                            int i411111111111111111111 = i13;
                                            int i411111111111111111112 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = bj30Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (bj30Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            c4d c4dVar11117 = new c4d(i411111111111111111110, i411111111111111111111, i411111111111111111112, bArr, i19, i21);
                                            str11 = bj30Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (bj30Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            awqVar.v = bj30Var6.o;
                                            awqVar.w = bj30Var6.p;
                                            awqVar.D = f;
                                            awqVar.B = i22;
                                            awqVar.E = bj30Var6.y;
                                            awqVar.F = bj30Var6.z;
                                            awqVar.G = c4dVar11117;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw kq80.a("Unexpected MIME type.", null);
                                        }
                                        str12 = bj30Var6.b;
                                        if (str12 != null) {
                                            awqVar.b = bj30Var6.b;
                                        }
                                        awqVar.f1587a = Integer.toString(i44);
                                        if (bj30Var6.f2686a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        awqVar.n = mg40.n(str13);
                                        awqVar.o = mg40.n(str10);
                                        awqVar.p = i15;
                                        awqVar.d = bj30Var6.c0;
                                        awqVar.e = i41111111111111111119;
                                        awqVar.r = listSingletonList;
                                        awqVar.k = str7;
                                        awqVar.s = bj30Var6.n;
                                        bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                        cj30Var = cj30Var;
                                        bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                        sparseArray2.put(bj30Var6.d, bj30Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z11119 = bj30Var6.b0;
                                    if (bj30Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i411111111111111111113 = (z11119 ? 1 : 0) | i16;
                                    awqVar = new awq();
                                    if (mg40.i(str10)) {
                                        awqVar.I = bj30Var6.Q;
                                        awqVar.J = bj30Var6.S;
                                        awqVar.K = bj30Var6.T;
                                        awqVar.L = i4;
                                    } else if (mg40.m(str10)) {
                                        if (bj30Var6.t == 0) {
                                            i24 = bj30Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = bj30Var6.o;
                                            }
                                            bj30Var6.r = i24;
                                            i25 = bj30Var6.s;
                                            if (i25 == -1) {
                                                i25 = bj30Var6.p;
                                            }
                                            bj30Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = bj30Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            } else {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            }
                                        }
                                        int i411111111111111111114 = i12;
                                        int i411111111111111111115 = i13;
                                        int i411111111111111111116 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = bj30Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (bj30Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        c4d c4dVar11118 = new c4d(i411111111111111111114, i411111111111111111115, i411111111111111111116, bArr, i19, i21);
                                        str11 = bj30Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (bj30Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        awqVar.v = bj30Var6.o;
                                        awqVar.w = bj30Var6.p;
                                        awqVar.D = f;
                                        awqVar.B = i22;
                                        awqVar.E = bj30Var6.y;
                                        awqVar.F = bj30Var6.z;
                                        awqVar.G = c4dVar11118;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw kq80.a("Unexpected MIME type.", null);
                                    }
                                    str12 = bj30Var6.b;
                                    if (str12 != null) {
                                        awqVar.b = bj30Var6.b;
                                    }
                                    awqVar.f1587a = Integer.toString(i44);
                                    if (bj30Var6.f2686a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    awqVar.n = mg40.n(str13);
                                    awqVar.o = mg40.n(str10);
                                    awqVar.p = i15;
                                    awqVar.d = bj30Var6.c0;
                                    awqVar.e = i411111111111111111113;
                                    awqVar.r = listSingletonList;
                                    awqVar.k = str7;
                                    awqVar.s = bj30Var6.n;
                                    bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                    cj30Var = cj30Var;
                                    bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                    sparseArray2.put(bj30Var6.d, bj30Var6);
                                    break;
                                case 20:
                                    str15 = "video/webm";
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (bj30Var6.P != null) {
                                        i15 = i5;
                                        hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                        if (hbbVarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = hbbVarA.b;
                                        }
                                        boolean z111110 = bj30Var6.b0;
                                        if (bj30Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i411111111111111111117 = (z111110 ? 1 : 0) | i16;
                                        awqVar = new awq();
                                        if (mg40.i(str10)) {
                                            awqVar.I = bj30Var6.Q;
                                            awqVar.J = bj30Var6.S;
                                            awqVar.K = bj30Var6.T;
                                            awqVar.L = i4;
                                        } else if (mg40.m(str10)) {
                                            if (bj30Var6.t == 0) {
                                                i24 = bj30Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = bj30Var6.o;
                                                }
                                                bj30Var6.r = i24;
                                                i25 = bj30Var6.s;
                                                if (i25 == -1) {
                                                    i25 = bj30Var6.p;
                                                }
                                                bj30Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = bj30Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                } else {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                }
                                            }
                                            int i411111111111111111118 = i12;
                                            int i411111111111111111119 = i13;
                                            int i4111111111111111111110 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = bj30Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (bj30Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            c4d c4dVar11119 = new c4d(i411111111111111111118, i411111111111111111119, i4111111111111111111110, bArr, i19, i21);
                                            str11 = bj30Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (bj30Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            awqVar.v = bj30Var6.o;
                                            awqVar.w = bj30Var6.p;
                                            awqVar.D = f;
                                            awqVar.B = i22;
                                            awqVar.E = bj30Var6.y;
                                            awqVar.F = bj30Var6.z;
                                            awqVar.G = c4dVar11119;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw kq80.a("Unexpected MIME type.", null);
                                        }
                                        str12 = bj30Var6.b;
                                        if (str12 != null) {
                                            awqVar.b = bj30Var6.b;
                                        }
                                        awqVar.f1587a = Integer.toString(i44);
                                        if (bj30Var6.f2686a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        awqVar.n = mg40.n(str13);
                                        awqVar.o = mg40.n(str10);
                                        awqVar.p = i15;
                                        awqVar.d = bj30Var6.c0;
                                        awqVar.e = i411111111111111111117;
                                        awqVar.r = listSingletonList;
                                        awqVar.k = str7;
                                        awqVar.s = bj30Var6.n;
                                        bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                        cj30Var = cj30Var;
                                        bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                        sparseArray2.put(bj30Var6.d, bj30Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z111111 = bj30Var6.b0;
                                    if (bj30Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i4111111111111111111111 = (z111111 ? 1 : 0) | i16;
                                    awqVar = new awq();
                                    if (mg40.i(str10)) {
                                        awqVar.I = bj30Var6.Q;
                                        awqVar.J = bj30Var6.S;
                                        awqVar.K = bj30Var6.T;
                                        awqVar.L = i4;
                                    } else if (mg40.m(str10)) {
                                        if (bj30Var6.t == 0) {
                                            i24 = bj30Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = bj30Var6.o;
                                            }
                                            bj30Var6.r = i24;
                                            i25 = bj30Var6.s;
                                            if (i25 == -1) {
                                                i25 = bj30Var6.p;
                                            }
                                            bj30Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = bj30Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            } else {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            }
                                        }
                                        int i4111111111111111111112 = i12;
                                        int i4111111111111111111113 = i13;
                                        int i4111111111111111111114 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = bj30Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (bj30Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        c4d c4dVar111110 = new c4d(i4111111111111111111112, i4111111111111111111113, i4111111111111111111114, bArr, i19, i21);
                                        str11 = bj30Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (bj30Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        awqVar.v = bj30Var6.o;
                                        awqVar.w = bj30Var6.p;
                                        awqVar.D = f;
                                        awqVar.B = i22;
                                        awqVar.E = bj30Var6.y;
                                        awqVar.F = bj30Var6.z;
                                        awqVar.G = c4dVar111110;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw kq80.a("Unexpected MIME type.", null);
                                    }
                                    str12 = bj30Var6.b;
                                    if (str12 != null) {
                                        awqVar.b = bj30Var6.b;
                                    }
                                    awqVar.f1587a = Integer.toString(i44);
                                    if (bj30Var6.f2686a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    awqVar.n = mg40.n(str13);
                                    awqVar.o = mg40.n(str10);
                                    awqVar.p = i15;
                                    awqVar.d = bj30Var6.c0;
                                    awqVar.e = i4111111111111111111111;
                                    awqVar.r = listSingletonList;
                                    awqVar.k = str7;
                                    awqVar.s = bj30Var6.n;
                                    bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                    cj30Var = cj30Var;
                                    bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                    sparseArray2.put(bj30Var6.d, bj30Var6);
                                    break;
                                case 21:
                                    str15 = "video/webm";
                                    str17 = "audio/vnd.dts.hd;profile=lbr";
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (bj30Var6.P != null) {
                                        i15 = i5;
                                        hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                        if (hbbVarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = hbbVarA.b;
                                        }
                                        boolean z111112 = bj30Var6.b0;
                                        if (bj30Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i4111111111111111111115 = (z111112 ? 1 : 0) | i16;
                                        awqVar = new awq();
                                        if (mg40.i(str10)) {
                                            awqVar.I = bj30Var6.Q;
                                            awqVar.J = bj30Var6.S;
                                            awqVar.K = bj30Var6.T;
                                            awqVar.L = i4;
                                        } else if (mg40.m(str10)) {
                                            if (bj30Var6.t == 0) {
                                                i24 = bj30Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = bj30Var6.o;
                                                }
                                                bj30Var6.r = i24;
                                                i25 = bj30Var6.s;
                                                if (i25 == -1) {
                                                    i25 = bj30Var6.p;
                                                }
                                                bj30Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = bj30Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                } else {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                }
                                            }
                                            int i4111111111111111111116 = i12;
                                            int i4111111111111111111117 = i13;
                                            int i4111111111111111111118 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = bj30Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (bj30Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            c4d c4dVar111111 = new c4d(i4111111111111111111116, i4111111111111111111117, i4111111111111111111118, bArr, i19, i21);
                                            str11 = bj30Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (bj30Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            awqVar.v = bj30Var6.o;
                                            awqVar.w = bj30Var6.p;
                                            awqVar.D = f;
                                            awqVar.B = i22;
                                            awqVar.E = bj30Var6.y;
                                            awqVar.F = bj30Var6.z;
                                            awqVar.G = c4dVar111111;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw kq80.a("Unexpected MIME type.", null);
                                        }
                                        str12 = bj30Var6.b;
                                        if (str12 != null) {
                                            awqVar.b = bj30Var6.b;
                                        }
                                        awqVar.f1587a = Integer.toString(i44);
                                        if (bj30Var6.f2686a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        awqVar.n = mg40.n(str13);
                                        awqVar.o = mg40.n(str10);
                                        awqVar.p = i15;
                                        awqVar.d = bj30Var6.c0;
                                        awqVar.e = i4111111111111111111115;
                                        awqVar.r = listSingletonList;
                                        awqVar.k = str7;
                                        awqVar.s = bj30Var6.n;
                                        bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                        cj30Var = cj30Var;
                                        bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                        sparseArray2.put(bj30Var6.d, bj30Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z111113 = bj30Var6.b0;
                                    if (bj30Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i4111111111111111111119 = (z111113 ? 1 : 0) | i16;
                                    awqVar = new awq();
                                    if (mg40.i(str10)) {
                                        awqVar.I = bj30Var6.Q;
                                        awqVar.J = bj30Var6.S;
                                        awqVar.K = bj30Var6.T;
                                        awqVar.L = i4;
                                    } else if (mg40.m(str10)) {
                                        if (bj30Var6.t == 0) {
                                            i24 = bj30Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = bj30Var6.o;
                                            }
                                            bj30Var6.r = i24;
                                            i25 = bj30Var6.s;
                                            if (i25 == -1) {
                                                i25 = bj30Var6.p;
                                            }
                                            bj30Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = bj30Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            } else {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            }
                                        }
                                        int i41111111111111111111110 = i12;
                                        int i41111111111111111111111 = i13;
                                        int i41111111111111111111112 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = bj30Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (bj30Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        c4d c4dVar111112 = new c4d(i41111111111111111111110, i41111111111111111111111, i41111111111111111111112, bArr, i19, i21);
                                        str11 = bj30Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (bj30Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        awqVar.v = bj30Var6.o;
                                        awqVar.w = bj30Var6.p;
                                        awqVar.D = f;
                                        awqVar.B = i22;
                                        awqVar.E = bj30Var6.y;
                                        awqVar.F = bj30Var6.z;
                                        awqVar.G = c4dVar111112;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw kq80.a("Unexpected MIME type.", null);
                                    }
                                    str12 = bj30Var6.b;
                                    if (str12 != null) {
                                        awqVar.b = bj30Var6.b;
                                    }
                                    awqVar.f1587a = Integer.toString(i44);
                                    if (bj30Var6.f2686a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    awqVar.n = mg40.n(str13);
                                    awqVar.o = mg40.n(str10);
                                    awqVar.p = i15;
                                    awqVar.d = bj30Var6.c0;
                                    awqVar.e = i4111111111111111111119;
                                    awqVar.r = listSingletonList;
                                    awqVar.k = str7;
                                    awqVar.s = bj30Var6.n;
                                    bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                    cj30Var = cj30Var;
                                    bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                    sparseArray2.put(bj30Var6.d, bj30Var6);
                                    break;
                                case 22:
                                    str15 = "video/webm";
                                    int i66 = bj30Var6.R;
                                    String str19 = vtt0.f38024a;
                                    iX = vtt0.x(i66, ByteOrder.LITTLE_ENDIAN);
                                    if (iX == 0) {
                                        f1t0.g0("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + bj30Var6.R + ". Setting mimeType to audio/x-unknown");
                                        i44 = i44;
                                        sparseArray2 = sparseArray2;
                                        str5 = "audio/x-unknown";
                                        i6 = -1;
                                        i5 = -1;
                                        i4 = -1;
                                        i12 = -1;
                                        i13 = -1;
                                        i14 = -1;
                                        i8 = -1;
                                        str7 = null;
                                        listSingletonList = null;
                                        if (bj30Var6.P != null) {
                                            i15 = i5;
                                            hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                            if (hbbVarA != null) {
                                                str10 = "video/dolby-vision";
                                                str7 = hbbVarA.b;
                                            }
                                            boolean z111114 = bj30Var6.b0;
                                            if (bj30Var6.a0) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i41111111111111111111113 = (z111114 ? 1 : 0) | i16;
                                            awqVar = new awq();
                                            if (mg40.i(str10)) {
                                                awqVar.I = bj30Var6.Q;
                                                awqVar.J = bj30Var6.S;
                                                awqVar.K = bj30Var6.T;
                                                awqVar.L = i4;
                                            } else if (mg40.m(str10)) {
                                                if (bj30Var6.t == 0) {
                                                    i24 = bj30Var6.r;
                                                    i17 = -1;
                                                    if (i24 == -1) {
                                                        i24 = bj30Var6.o;
                                                    }
                                                    bj30Var6.r = i24;
                                                    i25 = bj30Var6.s;
                                                    if (i25 == -1) {
                                                        i25 = bj30Var6.p;
                                                    }
                                                    bj30Var6.s = i25;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = bj30Var6.r;
                                                if (i18 != i17) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (i12 == -1) {
                                                    if (i13 == -1) {
                                                        i12 = bj30Var6.A;
                                                        i8 = bj30Var6.B;
                                                        i13 = bj30Var6.C;
                                                    } else {
                                                        i12 = bj30Var6.A;
                                                        i8 = bj30Var6.B;
                                                        i13 = bj30Var6.C;
                                                    }
                                                }
                                                int i41111111111111111111114 = i12;
                                                int i41111111111111111111115 = i13;
                                                int i41111111111111111111116 = i8;
                                                if (i6 != -1) {
                                                    i19 = i6;
                                                } else {
                                                    i19 = 8;
                                                }
                                                if (i14 != -1) {
                                                    i21 = i14;
                                                } else {
                                                    i20 = bj30Var6.q;
                                                    if (i20 != -1) {
                                                        i21 = i20;
                                                    } else {
                                                        i21 = 8;
                                                    }
                                                }
                                                if (bj30Var6.F != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                c4d c4dVar111113 = new c4d(i41111111111111111111114, i41111111111111111111115, i41111111111111111111116, bArr, i19, i21);
                                                str11 = bj30Var6.b;
                                                if (str11 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bj30Var6.u == 0) {
                                                    i22 = iIntValue;
                                                } else {
                                                    i22 = iIntValue;
                                                }
                                                awqVar.v = bj30Var6.o;
                                                awqVar.w = bj30Var6.p;
                                                awqVar.D = f;
                                                awqVar.B = i22;
                                                awqVar.E = bj30Var6.y;
                                                awqVar.F = bj30Var6.z;
                                                awqVar.G = c4dVar111113;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw kq80.a("Unexpected MIME type.", null);
                                            }
                                            str12 = bj30Var6.b;
                                            if (str12 != null) {
                                                awqVar.b = bj30Var6.b;
                                            }
                                            awqVar.f1587a = Integer.toString(i44);
                                            if (bj30Var6.f2686a) {
                                                str13 = str15;
                                            } else {
                                                str13 = "video/x-matroska";
                                            }
                                            awqVar.n = mg40.n(str13);
                                            awqVar.o = mg40.n(str10);
                                            awqVar.p = i15;
                                            awqVar.d = bj30Var6.c0;
                                            awqVar.e = i41111111111111111111113;
                                            awqVar.r = listSingletonList;
                                            awqVar.k = str7;
                                            awqVar.s = bj30Var6.n;
                                            bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                            cj30Var = cj30Var;
                                            bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                            sparseArray2.put(bj30Var6.d, bj30Var6);
                                        } else {
                                            i15 = i5;
                                        }
                                        str10 = str5;
                                        boolean z111115 = bj30Var6.b0;
                                        if (bj30Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i41111111111111111111117 = (z111115 ? 1 : 0) | i16;
                                        awqVar = new awq();
                                        if (mg40.i(str10)) {
                                            awqVar.I = bj30Var6.Q;
                                            awqVar.J = bj30Var6.S;
                                            awqVar.K = bj30Var6.T;
                                            awqVar.L = i4;
                                        } else if (mg40.m(str10)) {
                                            if (bj30Var6.t == 0) {
                                                i24 = bj30Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = bj30Var6.o;
                                                }
                                                bj30Var6.r = i24;
                                                i25 = bj30Var6.s;
                                                if (i25 == -1) {
                                                    i25 = bj30Var6.p;
                                                }
                                                bj30Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = bj30Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                } else {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                }
                                            }
                                            int i41111111111111111111118 = i12;
                                            int i41111111111111111111119 = i13;
                                            int i411111111111111111111110 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = bj30Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (bj30Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            c4d c4dVar111114 = new c4d(i41111111111111111111118, i41111111111111111111119, i411111111111111111111110, bArr, i19, i21);
                                            str11 = bj30Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (bj30Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            awqVar.v = bj30Var6.o;
                                            awqVar.w = bj30Var6.p;
                                            awqVar.D = f;
                                            awqVar.B = i22;
                                            awqVar.E = bj30Var6.y;
                                            awqVar.F = bj30Var6.z;
                                            awqVar.G = c4dVar111114;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw kq80.a("Unexpected MIME type.", null);
                                        }
                                        str12 = bj30Var6.b;
                                        if (str12 != null) {
                                            awqVar.b = bj30Var6.b;
                                        }
                                        awqVar.f1587a = Integer.toString(i44);
                                        if (bj30Var6.f2686a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        awqVar.n = mg40.n(str13);
                                        awqVar.o = mg40.n(str10);
                                        awqVar.p = i15;
                                        awqVar.d = bj30Var6.c0;
                                        awqVar.e = i41111111111111111111117;
                                        awqVar.r = listSingletonList;
                                        awqVar.k = str7;
                                        awqVar.s = bj30Var6.n;
                                        bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                        cj30Var = cj30Var;
                                        bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                        sparseArray2.put(bj30Var6.d, bj30Var6);
                                    }
                                    i4 = iX;
                                    i44 = i44;
                                    sparseArray2 = sparseArray2;
                                    str5 = "audio/raw";
                                    i6 = -1;
                                    i5 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (bj30Var6.P != null) {
                                        i15 = i5;
                                        hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                        if (hbbVarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = hbbVarA.b;
                                        }
                                        boolean z111116 = bj30Var6.b0;
                                        if (bj30Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i411111111111111111111111 = (z111116 ? 1 : 0) | i16;
                                        awqVar = new awq();
                                        if (mg40.i(str10)) {
                                            awqVar.I = bj30Var6.Q;
                                            awqVar.J = bj30Var6.S;
                                            awqVar.K = bj30Var6.T;
                                            awqVar.L = i4;
                                        } else if (mg40.m(str10)) {
                                            if (bj30Var6.t == 0) {
                                                i24 = bj30Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = bj30Var6.o;
                                                }
                                                bj30Var6.r = i24;
                                                i25 = bj30Var6.s;
                                                if (i25 == -1) {
                                                    i25 = bj30Var6.p;
                                                }
                                                bj30Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = bj30Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                } else {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                }
                                            }
                                            int i411111111111111111111112 = i12;
                                            int i411111111111111111111113 = i13;
                                            int i411111111111111111111114 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = bj30Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (bj30Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            c4d c4dVar111115 = new c4d(i411111111111111111111112, i411111111111111111111113, i411111111111111111111114, bArr, i19, i21);
                                            str11 = bj30Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (bj30Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            awqVar.v = bj30Var6.o;
                                            awqVar.w = bj30Var6.p;
                                            awqVar.D = f;
                                            awqVar.B = i22;
                                            awqVar.E = bj30Var6.y;
                                            awqVar.F = bj30Var6.z;
                                            awqVar.G = c4dVar111115;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw kq80.a("Unexpected MIME type.", null);
                                        }
                                        str12 = bj30Var6.b;
                                        if (str12 != null) {
                                            awqVar.b = bj30Var6.b;
                                        }
                                        awqVar.f1587a = Integer.toString(i44);
                                        if (bj30Var6.f2686a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        awqVar.n = mg40.n(str13);
                                        awqVar.o = mg40.n(str10);
                                        awqVar.p = i15;
                                        awqVar.d = bj30Var6.c0;
                                        awqVar.e = i411111111111111111111111;
                                        awqVar.r = listSingletonList;
                                        awqVar.k = str7;
                                        awqVar.s = bj30Var6.n;
                                        bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                        cj30Var = cj30Var;
                                        bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                        sparseArray2.put(bj30Var6.d, bj30Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z111117 = bj30Var6.b0;
                                    if (bj30Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i411111111111111111111115 = (z111117 ? 1 : 0) | i16;
                                    awqVar = new awq();
                                    if (mg40.i(str10)) {
                                        awqVar.I = bj30Var6.Q;
                                        awqVar.J = bj30Var6.S;
                                        awqVar.K = bj30Var6.T;
                                        awqVar.L = i4;
                                    } else if (mg40.m(str10)) {
                                        if (bj30Var6.t == 0) {
                                            i24 = bj30Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = bj30Var6.o;
                                            }
                                            bj30Var6.r = i24;
                                            i25 = bj30Var6.s;
                                            if (i25 == -1) {
                                                i25 = bj30Var6.p;
                                            }
                                            bj30Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = bj30Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            } else {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            }
                                        }
                                        int i411111111111111111111116 = i12;
                                        int i411111111111111111111117 = i13;
                                        int i411111111111111111111118 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = bj30Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (bj30Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        c4d c4dVar111116 = new c4d(i411111111111111111111116, i411111111111111111111117, i411111111111111111111118, bArr, i19, i21);
                                        str11 = bj30Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (bj30Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        awqVar.v = bj30Var6.o;
                                        awqVar.w = bj30Var6.p;
                                        awqVar.D = f;
                                        awqVar.B = i22;
                                        awqVar.E = bj30Var6.y;
                                        awqVar.F = bj30Var6.z;
                                        awqVar.G = c4dVar111116;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw kq80.a("Unexpected MIME type.", null);
                                    }
                                    str12 = bj30Var6.b;
                                    if (str12 != null) {
                                        awqVar.b = bj30Var6.b;
                                    }
                                    awqVar.f1587a = Integer.toString(i44);
                                    if (bj30Var6.f2686a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    awqVar.n = mg40.n(str13);
                                    awqVar.o = mg40.n(str10);
                                    awqVar.p = i15;
                                    awqVar.d = bj30Var6.c0;
                                    awqVar.e = i411111111111111111111115;
                                    awqVar.r = listSingletonList;
                                    awqVar.k = str7;
                                    awqVar.s = bj30Var6.n;
                                    bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                    cj30Var = cj30Var;
                                    bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                    sparseArray2.put(bj30Var6.d, bj30Var6);
                                    break;
                                case 23:
                                    str15 = "video/webm";
                                    iX = vtt0.z(bj30Var6.R, ByteOrder.BIG_ENDIAN);
                                    if (iX == 0) {
                                        f1t0.g0("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + bj30Var6.R + ". Setting mimeType to audio/x-unknown");
                                        i44 = i44;
                                        sparseArray2 = sparseArray2;
                                        str5 = "audio/x-unknown";
                                        i6 = -1;
                                        i5 = -1;
                                        i4 = -1;
                                        i12 = -1;
                                        i13 = -1;
                                        i14 = -1;
                                        i8 = -1;
                                        str7 = null;
                                        listSingletonList = null;
                                        if (bj30Var6.P != null) {
                                            i15 = i5;
                                            hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                            if (hbbVarA != null) {
                                                str10 = "video/dolby-vision";
                                                str7 = hbbVarA.b;
                                            }
                                            boolean z111118 = bj30Var6.b0;
                                            if (bj30Var6.a0) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i411111111111111111111119 = (z111118 ? 1 : 0) | i16;
                                            awqVar = new awq();
                                            if (mg40.i(str10)) {
                                                awqVar.I = bj30Var6.Q;
                                                awqVar.J = bj30Var6.S;
                                                awqVar.K = bj30Var6.T;
                                                awqVar.L = i4;
                                            } else if (mg40.m(str10)) {
                                                if (bj30Var6.t == 0) {
                                                    i24 = bj30Var6.r;
                                                    i17 = -1;
                                                    if (i24 == -1) {
                                                        i24 = bj30Var6.o;
                                                    }
                                                    bj30Var6.r = i24;
                                                    i25 = bj30Var6.s;
                                                    if (i25 == -1) {
                                                        i25 = bj30Var6.p;
                                                    }
                                                    bj30Var6.s = i25;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = bj30Var6.r;
                                                if (i18 != i17) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (i12 == -1) {
                                                    if (i13 == -1) {
                                                        i12 = bj30Var6.A;
                                                        i8 = bj30Var6.B;
                                                        i13 = bj30Var6.C;
                                                    } else {
                                                        i12 = bj30Var6.A;
                                                        i8 = bj30Var6.B;
                                                        i13 = bj30Var6.C;
                                                    }
                                                }
                                                int i4111111111111111111111110 = i12;
                                                int i4111111111111111111111111 = i13;
                                                int i4111111111111111111111112 = i8;
                                                if (i6 != -1) {
                                                    i19 = i6;
                                                } else {
                                                    i19 = 8;
                                                }
                                                if (i14 != -1) {
                                                    i21 = i14;
                                                } else {
                                                    i20 = bj30Var6.q;
                                                    if (i20 != -1) {
                                                        i21 = i20;
                                                    } else {
                                                        i21 = 8;
                                                    }
                                                }
                                                if (bj30Var6.F != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                c4d c4dVar111117 = new c4d(i4111111111111111111111110, i4111111111111111111111111, i4111111111111111111111112, bArr, i19, i21);
                                                str11 = bj30Var6.b;
                                                if (str11 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bj30Var6.u == 0) {
                                                    i22 = iIntValue;
                                                } else {
                                                    i22 = iIntValue;
                                                }
                                                awqVar.v = bj30Var6.o;
                                                awqVar.w = bj30Var6.p;
                                                awqVar.D = f;
                                                awqVar.B = i22;
                                                awqVar.E = bj30Var6.y;
                                                awqVar.F = bj30Var6.z;
                                                awqVar.G = c4dVar111117;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw kq80.a("Unexpected MIME type.", null);
                                            }
                                            str12 = bj30Var6.b;
                                            if (str12 != null) {
                                                awqVar.b = bj30Var6.b;
                                            }
                                            awqVar.f1587a = Integer.toString(i44);
                                            if (bj30Var6.f2686a) {
                                                str13 = str15;
                                            } else {
                                                str13 = "video/x-matroska";
                                            }
                                            awqVar.n = mg40.n(str13);
                                            awqVar.o = mg40.n(str10);
                                            awqVar.p = i15;
                                            awqVar.d = bj30Var6.c0;
                                            awqVar.e = i411111111111111111111119;
                                            awqVar.r = listSingletonList;
                                            awqVar.k = str7;
                                            awqVar.s = bj30Var6.n;
                                            bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                            cj30Var = cj30Var;
                                            bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                            sparseArray2.put(bj30Var6.d, bj30Var6);
                                        } else {
                                            i15 = i5;
                                        }
                                        str10 = str5;
                                        boolean z111119 = bj30Var6.b0;
                                        if (bj30Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i4111111111111111111111113 = (z111119 ? 1 : 0) | i16;
                                        awqVar = new awq();
                                        if (mg40.i(str10)) {
                                            awqVar.I = bj30Var6.Q;
                                            awqVar.J = bj30Var6.S;
                                            awqVar.K = bj30Var6.T;
                                            awqVar.L = i4;
                                        } else if (mg40.m(str10)) {
                                            if (bj30Var6.t == 0) {
                                                i24 = bj30Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = bj30Var6.o;
                                                }
                                                bj30Var6.r = i24;
                                                i25 = bj30Var6.s;
                                                if (i25 == -1) {
                                                    i25 = bj30Var6.p;
                                                }
                                                bj30Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = bj30Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                } else {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                }
                                            }
                                            int i4111111111111111111111114 = i12;
                                            int i4111111111111111111111115 = i13;
                                            int i4111111111111111111111116 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = bj30Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (bj30Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            c4d c4dVar111118 = new c4d(i4111111111111111111111114, i4111111111111111111111115, i4111111111111111111111116, bArr, i19, i21);
                                            str11 = bj30Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (bj30Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            awqVar.v = bj30Var6.o;
                                            awqVar.w = bj30Var6.p;
                                            awqVar.D = f;
                                            awqVar.B = i22;
                                            awqVar.E = bj30Var6.y;
                                            awqVar.F = bj30Var6.z;
                                            awqVar.G = c4dVar111118;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw kq80.a("Unexpected MIME type.", null);
                                        }
                                        str12 = bj30Var6.b;
                                        if (str12 != null) {
                                            awqVar.b = bj30Var6.b;
                                        }
                                        awqVar.f1587a = Integer.toString(i44);
                                        if (bj30Var6.f2686a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        awqVar.n = mg40.n(str13);
                                        awqVar.o = mg40.n(str10);
                                        awqVar.p = i15;
                                        awqVar.d = bj30Var6.c0;
                                        awqVar.e = i4111111111111111111111113;
                                        awqVar.r = listSingletonList;
                                        awqVar.k = str7;
                                        awqVar.s = bj30Var6.n;
                                        bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                        cj30Var = cj30Var;
                                        bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                        sparseArray2.put(bj30Var6.d, bj30Var6);
                                    }
                                    i4 = iX;
                                    i44 = i44;
                                    sparseArray2 = sparseArray2;
                                    str5 = "audio/raw";
                                    i6 = -1;
                                    i5 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (bj30Var6.P != null) {
                                        i15 = i5;
                                        hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                        if (hbbVarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = hbbVarA.b;
                                        }
                                        boolean z1111110 = bj30Var6.b0;
                                        if (bj30Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i4111111111111111111111117 = (z1111110 ? 1 : 0) | i16;
                                        awqVar = new awq();
                                        if (mg40.i(str10)) {
                                            awqVar.I = bj30Var6.Q;
                                            awqVar.J = bj30Var6.S;
                                            awqVar.K = bj30Var6.T;
                                            awqVar.L = i4;
                                        } else if (mg40.m(str10)) {
                                            if (bj30Var6.t == 0) {
                                                i24 = bj30Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = bj30Var6.o;
                                                }
                                                bj30Var6.r = i24;
                                                i25 = bj30Var6.s;
                                                if (i25 == -1) {
                                                    i25 = bj30Var6.p;
                                                }
                                                bj30Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = bj30Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                } else {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                }
                                            }
                                            int i4111111111111111111111118 = i12;
                                            int i4111111111111111111111119 = i13;
                                            int i41111111111111111111111110 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = bj30Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (bj30Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            c4d c4dVar111119 = new c4d(i4111111111111111111111118, i4111111111111111111111119, i41111111111111111111111110, bArr, i19, i21);
                                            str11 = bj30Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (bj30Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            awqVar.v = bj30Var6.o;
                                            awqVar.w = bj30Var6.p;
                                            awqVar.D = f;
                                            awqVar.B = i22;
                                            awqVar.E = bj30Var6.y;
                                            awqVar.F = bj30Var6.z;
                                            awqVar.G = c4dVar111119;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw kq80.a("Unexpected MIME type.", null);
                                        }
                                        str12 = bj30Var6.b;
                                        if (str12 != null) {
                                            awqVar.b = bj30Var6.b;
                                        }
                                        awqVar.f1587a = Integer.toString(i44);
                                        if (bj30Var6.f2686a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        awqVar.n = mg40.n(str13);
                                        awqVar.o = mg40.n(str10);
                                        awqVar.p = i15;
                                        awqVar.d = bj30Var6.c0;
                                        awqVar.e = i4111111111111111111111117;
                                        awqVar.r = listSingletonList;
                                        awqVar.k = str7;
                                        awqVar.s = bj30Var6.n;
                                        bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                        cj30Var = cj30Var;
                                        bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                        sparseArray2.put(bj30Var6.d, bj30Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z1111111 = bj30Var6.b0;
                                    if (bj30Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i41111111111111111111111111 = (z1111111 ? 1 : 0) | i16;
                                    awqVar = new awq();
                                    if (mg40.i(str10)) {
                                        awqVar.I = bj30Var6.Q;
                                        awqVar.J = bj30Var6.S;
                                        awqVar.K = bj30Var6.T;
                                        awqVar.L = i4;
                                    } else if (mg40.m(str10)) {
                                        if (bj30Var6.t == 0) {
                                            i24 = bj30Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = bj30Var6.o;
                                            }
                                            bj30Var6.r = i24;
                                            i25 = bj30Var6.s;
                                            if (i25 == -1) {
                                                i25 = bj30Var6.p;
                                            }
                                            bj30Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = bj30Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            } else {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            }
                                        }
                                        int i41111111111111111111111112 = i12;
                                        int i41111111111111111111111113 = i13;
                                        int i41111111111111111111111114 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = bj30Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (bj30Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        c4d c4dVar1111110 = new c4d(i41111111111111111111111112, i41111111111111111111111113, i41111111111111111111111114, bArr, i19, i21);
                                        str11 = bj30Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (bj30Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        awqVar.v = bj30Var6.o;
                                        awqVar.w = bj30Var6.p;
                                        awqVar.D = f;
                                        awqVar.B = i22;
                                        awqVar.E = bj30Var6.y;
                                        awqVar.F = bj30Var6.z;
                                        awqVar.G = c4dVar1111110;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw kq80.a("Unexpected MIME type.", null);
                                    }
                                    str12 = bj30Var6.b;
                                    if (str12 != null) {
                                        awqVar.b = bj30Var6.b;
                                    }
                                    awqVar.f1587a = Integer.toString(i44);
                                    if (bj30Var6.f2686a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    awqVar.n = mg40.n(str13);
                                    awqVar.o = mg40.n(str10);
                                    awqVar.p = i15;
                                    awqVar.d = bj30Var6.c0;
                                    awqVar.e = i41111111111111111111111111;
                                    awqVar.r = listSingletonList;
                                    awqVar.k = str7;
                                    awqVar.s = bj30Var6.n;
                                    bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                    cj30Var = cj30Var;
                                    bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                    sparseArray2.put(bj30Var6.d, bj30Var6);
                                    break;
                                case 24:
                                    str15 = "video/webm";
                                    int i67 = bj30Var6.R;
                                    String str20 = vtt0.f38024a;
                                    iX = vtt0.z(i67, ByteOrder.LITTLE_ENDIAN);
                                    if (iX == 0) {
                                        f1t0.g0("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + bj30Var6.R + ". Setting mimeType to audio/x-unknown");
                                        i44 = i44;
                                        sparseArray2 = sparseArray2;
                                        str5 = "audio/x-unknown";
                                        i6 = -1;
                                        i5 = -1;
                                        i4 = -1;
                                        i12 = -1;
                                        i13 = -1;
                                        i14 = -1;
                                        i8 = -1;
                                        str7 = null;
                                        listSingletonList = null;
                                        if (bj30Var6.P != null) {
                                            i15 = i5;
                                            hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                            if (hbbVarA != null) {
                                                str10 = "video/dolby-vision";
                                                str7 = hbbVarA.b;
                                            }
                                            boolean z1111112 = bj30Var6.b0;
                                            if (bj30Var6.a0) {
                                                i16 = 2;
                                            } else {
                                                i16 = 0;
                                            }
                                            int i41111111111111111111111115 = (z1111112 ? 1 : 0) | i16;
                                            awqVar = new awq();
                                            if (mg40.i(str10)) {
                                                awqVar.I = bj30Var6.Q;
                                                awqVar.J = bj30Var6.S;
                                                awqVar.K = bj30Var6.T;
                                                awqVar.L = i4;
                                            } else if (mg40.m(str10)) {
                                                if (bj30Var6.t == 0) {
                                                    i24 = bj30Var6.r;
                                                    i17 = -1;
                                                    if (i24 == -1) {
                                                        i24 = bj30Var6.o;
                                                    }
                                                    bj30Var6.r = i24;
                                                    i25 = bj30Var6.s;
                                                    if (i25 == -1) {
                                                        i25 = bj30Var6.p;
                                                    }
                                                    bj30Var6.s = i25;
                                                } else {
                                                    i17 = -1;
                                                }
                                                i18 = bj30Var6.r;
                                                if (i18 != i17) {
                                                    f = -1.0f;
                                                } else {
                                                    f = -1.0f;
                                                }
                                                if (i12 == -1) {
                                                    if (i13 == -1) {
                                                        i12 = bj30Var6.A;
                                                        i8 = bj30Var6.B;
                                                        i13 = bj30Var6.C;
                                                    } else {
                                                        i12 = bj30Var6.A;
                                                        i8 = bj30Var6.B;
                                                        i13 = bj30Var6.C;
                                                    }
                                                }
                                                int i41111111111111111111111116 = i12;
                                                int i41111111111111111111111117 = i13;
                                                int i41111111111111111111111118 = i8;
                                                if (i6 != -1) {
                                                    i19 = i6;
                                                } else {
                                                    i19 = 8;
                                                }
                                                if (i14 != -1) {
                                                    i21 = i14;
                                                } else {
                                                    i20 = bj30Var6.q;
                                                    if (i20 != -1) {
                                                        i21 = i20;
                                                    } else {
                                                        i21 = 8;
                                                    }
                                                }
                                                if (bj30Var6.F != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                c4d c4dVar1111111 = new c4d(i41111111111111111111111116, i41111111111111111111111117, i41111111111111111111111118, bArr, i19, i21);
                                                str11 = bj30Var6.b;
                                                if (str11 == null) {
                                                    iIntValue = -1;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                if (bj30Var6.u == 0) {
                                                    i22 = iIntValue;
                                                } else {
                                                    i22 = iIntValue;
                                                }
                                                awqVar.v = bj30Var6.o;
                                                awqVar.w = bj30Var6.p;
                                                awqVar.D = f;
                                                awqVar.B = i22;
                                                awqVar.E = bj30Var6.y;
                                                awqVar.F = bj30Var6.z;
                                                awqVar.G = c4dVar1111111;
                                            } else if (!"application/x-subrip".equals(str10)) {
                                                throw kq80.a("Unexpected MIME type.", null);
                                            }
                                            str12 = bj30Var6.b;
                                            if (str12 != null) {
                                                awqVar.b = bj30Var6.b;
                                            }
                                            awqVar.f1587a = Integer.toString(i44);
                                            if (bj30Var6.f2686a) {
                                                str13 = str15;
                                            } else {
                                                str13 = "video/x-matroska";
                                            }
                                            awqVar.n = mg40.n(str13);
                                            awqVar.o = mg40.n(str10);
                                            awqVar.p = i15;
                                            awqVar.d = bj30Var6.c0;
                                            awqVar.e = i41111111111111111111111115;
                                            awqVar.r = listSingletonList;
                                            awqVar.k = str7;
                                            awqVar.s = bj30Var6.n;
                                            bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                            cj30Var = cj30Var;
                                            bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                            sparseArray2.put(bj30Var6.d, bj30Var6);
                                        } else {
                                            i15 = i5;
                                        }
                                        str10 = str5;
                                        boolean z1111113 = bj30Var6.b0;
                                        if (bj30Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i41111111111111111111111119 = (z1111113 ? 1 : 0) | i16;
                                        awqVar = new awq();
                                        if (mg40.i(str10)) {
                                            awqVar.I = bj30Var6.Q;
                                            awqVar.J = bj30Var6.S;
                                            awqVar.K = bj30Var6.T;
                                            awqVar.L = i4;
                                        } else if (mg40.m(str10)) {
                                            if (bj30Var6.t == 0) {
                                                i24 = bj30Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = bj30Var6.o;
                                                }
                                                bj30Var6.r = i24;
                                                i25 = bj30Var6.s;
                                                if (i25 == -1) {
                                                    i25 = bj30Var6.p;
                                                }
                                                bj30Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = bj30Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                } else {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                }
                                            }
                                            int i411111111111111111111111110 = i12;
                                            int i411111111111111111111111111 = i13;
                                            int i411111111111111111111111112 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = bj30Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (bj30Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            c4d c4dVar1111112 = new c4d(i411111111111111111111111110, i411111111111111111111111111, i411111111111111111111111112, bArr, i19, i21);
                                            str11 = bj30Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (bj30Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            awqVar.v = bj30Var6.o;
                                            awqVar.w = bj30Var6.p;
                                            awqVar.D = f;
                                            awqVar.B = i22;
                                            awqVar.E = bj30Var6.y;
                                            awqVar.F = bj30Var6.z;
                                            awqVar.G = c4dVar1111112;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw kq80.a("Unexpected MIME type.", null);
                                        }
                                        str12 = bj30Var6.b;
                                        if (str12 != null) {
                                            awqVar.b = bj30Var6.b;
                                        }
                                        awqVar.f1587a = Integer.toString(i44);
                                        if (bj30Var6.f2686a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        awqVar.n = mg40.n(str13);
                                        awqVar.o = mg40.n(str10);
                                        awqVar.p = i15;
                                        awqVar.d = bj30Var6.c0;
                                        awqVar.e = i41111111111111111111111119;
                                        awqVar.r = listSingletonList;
                                        awqVar.k = str7;
                                        awqVar.s = bj30Var6.n;
                                        bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                        cj30Var = cj30Var;
                                        bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                        sparseArray2.put(bj30Var6.d, bj30Var6);
                                    }
                                    i4 = iX;
                                    i44 = i44;
                                    sparseArray2 = sparseArray2;
                                    str5 = "audio/raw";
                                    i6 = -1;
                                    i5 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (bj30Var6.P != null) {
                                        i15 = i5;
                                        hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                        if (hbbVarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = hbbVarA.b;
                                        }
                                        boolean z1111114 = bj30Var6.b0;
                                        if (bj30Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i411111111111111111111111113 = (z1111114 ? 1 : 0) | i16;
                                        awqVar = new awq();
                                        if (mg40.i(str10)) {
                                            awqVar.I = bj30Var6.Q;
                                            awqVar.J = bj30Var6.S;
                                            awqVar.K = bj30Var6.T;
                                            awqVar.L = i4;
                                        } else if (mg40.m(str10)) {
                                            if (bj30Var6.t == 0) {
                                                i24 = bj30Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = bj30Var6.o;
                                                }
                                                bj30Var6.r = i24;
                                                i25 = bj30Var6.s;
                                                if (i25 == -1) {
                                                    i25 = bj30Var6.p;
                                                }
                                                bj30Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = bj30Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                } else {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                }
                                            }
                                            int i411111111111111111111111114 = i12;
                                            int i411111111111111111111111115 = i13;
                                            int i411111111111111111111111116 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = bj30Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (bj30Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            c4d c4dVar1111113 = new c4d(i411111111111111111111111114, i411111111111111111111111115, i411111111111111111111111116, bArr, i19, i21);
                                            str11 = bj30Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (bj30Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            awqVar.v = bj30Var6.o;
                                            awqVar.w = bj30Var6.p;
                                            awqVar.D = f;
                                            awqVar.B = i22;
                                            awqVar.E = bj30Var6.y;
                                            awqVar.F = bj30Var6.z;
                                            awqVar.G = c4dVar1111113;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw kq80.a("Unexpected MIME type.", null);
                                        }
                                        str12 = bj30Var6.b;
                                        if (str12 != null) {
                                            awqVar.b = bj30Var6.b;
                                        }
                                        awqVar.f1587a = Integer.toString(i44);
                                        if (bj30Var6.f2686a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        awqVar.n = mg40.n(str13);
                                        awqVar.o = mg40.n(str10);
                                        awqVar.p = i15;
                                        awqVar.d = bj30Var6.c0;
                                        awqVar.e = i411111111111111111111111113;
                                        awqVar.r = listSingletonList;
                                        awqVar.k = str7;
                                        awqVar.s = bj30Var6.n;
                                        bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                        cj30Var = cj30Var;
                                        bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                        sparseArray2.put(bj30Var6.d, bj30Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z1111115 = bj30Var6.b0;
                                    if (bj30Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i411111111111111111111111117 = (z1111115 ? 1 : 0) | i16;
                                    awqVar = new awq();
                                    if (mg40.i(str10)) {
                                        awqVar.I = bj30Var6.Q;
                                        awqVar.J = bj30Var6.S;
                                        awqVar.K = bj30Var6.T;
                                        awqVar.L = i4;
                                    } else if (mg40.m(str10)) {
                                        if (bj30Var6.t == 0) {
                                            i24 = bj30Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = bj30Var6.o;
                                            }
                                            bj30Var6.r = i24;
                                            i25 = bj30Var6.s;
                                            if (i25 == -1) {
                                                i25 = bj30Var6.p;
                                            }
                                            bj30Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = bj30Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            } else {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            }
                                        }
                                        int i411111111111111111111111118 = i12;
                                        int i411111111111111111111111119 = i13;
                                        int i4111111111111111111111111110 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = bj30Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (bj30Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        c4d c4dVar1111114 = new c4d(i411111111111111111111111118, i411111111111111111111111119, i4111111111111111111111111110, bArr, i19, i21);
                                        str11 = bj30Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (bj30Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        awqVar.v = bj30Var6.o;
                                        awqVar.w = bj30Var6.p;
                                        awqVar.D = f;
                                        awqVar.B = i22;
                                        awqVar.E = bj30Var6.y;
                                        awqVar.F = bj30Var6.z;
                                        awqVar.G = c4dVar1111114;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw kq80.a("Unexpected MIME type.", null);
                                    }
                                    str12 = bj30Var6.b;
                                    if (str12 != null) {
                                        awqVar.b = bj30Var6.b;
                                    }
                                    awqVar.f1587a = Integer.toString(i44);
                                    if (bj30Var6.f2686a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    awqVar.n = mg40.n(str13);
                                    awqVar.o = mg40.n(str10);
                                    awqVar.p = i15;
                                    awqVar.d = bj30Var6.c0;
                                    awqVar.e = i411111111111111111111111117;
                                    awqVar.r = listSingletonList;
                                    awqVar.k = str7;
                                    awqVar.s = bj30Var6.n;
                                    bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                    cj30Var = cj30Var;
                                    bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                    sparseArray2.put(bj30Var6.d, bj30Var6);
                                    break;
                                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                                    str15 = "video/webm";
                                    cj30Var = cj30Var;
                                    listSingletonList = b4x.v(cj30.s0, bj30Var6.a(str16));
                                    i44 = i44;
                                    sparseArray2 = sparseArray2;
                                    str5 = "text/x-ssa";
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    if (bj30Var6.P != null) {
                                        i15 = i5;
                                        hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                        if (hbbVarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = hbbVarA.b;
                                        }
                                        boolean z1111116 = bj30Var6.b0;
                                        if (bj30Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i4111111111111111111111111111 = (z1111116 ? 1 : 0) | i16;
                                        awqVar = new awq();
                                        if (mg40.i(str10)) {
                                            awqVar.I = bj30Var6.Q;
                                            awqVar.J = bj30Var6.S;
                                            awqVar.K = bj30Var6.T;
                                            awqVar.L = i4;
                                        } else if (mg40.m(str10)) {
                                            if (bj30Var6.t == 0) {
                                                i24 = bj30Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = bj30Var6.o;
                                                }
                                                bj30Var6.r = i24;
                                                i25 = bj30Var6.s;
                                                if (i25 == -1) {
                                                    i25 = bj30Var6.p;
                                                }
                                                bj30Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = bj30Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                } else {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                }
                                            }
                                            int i4111111111111111111111111112 = i12;
                                            int i4111111111111111111111111113 = i13;
                                            int i4111111111111111111111111114 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = bj30Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (bj30Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            c4d c4dVar1111115 = new c4d(i4111111111111111111111111112, i4111111111111111111111111113, i4111111111111111111111111114, bArr, i19, i21);
                                            str11 = bj30Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (bj30Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            awqVar.v = bj30Var6.o;
                                            awqVar.w = bj30Var6.p;
                                            awqVar.D = f;
                                            awqVar.B = i22;
                                            awqVar.E = bj30Var6.y;
                                            awqVar.F = bj30Var6.z;
                                            awqVar.G = c4dVar1111115;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw kq80.a("Unexpected MIME type.", null);
                                        }
                                        str12 = bj30Var6.b;
                                        if (str12 != null) {
                                            awqVar.b = bj30Var6.b;
                                        }
                                        awqVar.f1587a = Integer.toString(i44);
                                        if (bj30Var6.f2686a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        awqVar.n = mg40.n(str13);
                                        awqVar.o = mg40.n(str10);
                                        awqVar.p = i15;
                                        awqVar.d = bj30Var6.c0;
                                        awqVar.e = i4111111111111111111111111111;
                                        awqVar.r = listSingletonList;
                                        awqVar.k = str7;
                                        awqVar.s = bj30Var6.n;
                                        bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                        cj30Var = cj30Var;
                                        bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                        sparseArray2.put(bj30Var6.d, bj30Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z1111117 = bj30Var6.b0;
                                    if (bj30Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i4111111111111111111111111115 = (z1111117 ? 1 : 0) | i16;
                                    awqVar = new awq();
                                    if (mg40.i(str10)) {
                                        awqVar.I = bj30Var6.Q;
                                        awqVar.J = bj30Var6.S;
                                        awqVar.K = bj30Var6.T;
                                        awqVar.L = i4;
                                    } else if (mg40.m(str10)) {
                                        if (bj30Var6.t == 0) {
                                            i24 = bj30Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = bj30Var6.o;
                                            }
                                            bj30Var6.r = i24;
                                            i25 = bj30Var6.s;
                                            if (i25 == -1) {
                                                i25 = bj30Var6.p;
                                            }
                                            bj30Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = bj30Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            } else {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            }
                                        }
                                        int i4111111111111111111111111116 = i12;
                                        int i4111111111111111111111111117 = i13;
                                        int i4111111111111111111111111118 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = bj30Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (bj30Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        c4d c4dVar1111116 = new c4d(i4111111111111111111111111116, i4111111111111111111111111117, i4111111111111111111111111118, bArr, i19, i21);
                                        str11 = bj30Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (bj30Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        awqVar.v = bj30Var6.o;
                                        awqVar.w = bj30Var6.p;
                                        awqVar.D = f;
                                        awqVar.B = i22;
                                        awqVar.E = bj30Var6.y;
                                        awqVar.F = bj30Var6.z;
                                        awqVar.G = c4dVar1111116;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw kq80.a("Unexpected MIME type.", null);
                                    }
                                    str12 = bj30Var6.b;
                                    if (str12 != null) {
                                        awqVar.b = bj30Var6.b;
                                    }
                                    awqVar.f1587a = Integer.toString(i44);
                                    if (bj30Var6.f2686a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    awqVar.n = mg40.n(str13);
                                    awqVar.o = mg40.n(str10);
                                    awqVar.p = i15;
                                    awqVar.d = bj30Var6.c0;
                                    awqVar.e = i4111111111111111111111111115;
                                    awqVar.r = listSingletonList;
                                    awqVar.k = str7;
                                    awqVar.s = bj30Var6.n;
                                    bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                    cj30Var = cj30Var;
                                    bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                    sparseArray2.put(bj30Var6.d, bj30Var6);
                                    break;
                                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                                    xvv xvvVarA = xvv.a(new fq80(bj30Var6.a(bj30Var6.c)), false, null);
                                    List list2 = xvvVarA.f41581a;
                                    bj30Var6.f0 = xvvVarA.b;
                                    str8 = xvvVarA.n;
                                    i7 = xvvVarA.h;
                                    i8 = xvvVarA.j;
                                    list = list2;
                                    i9 = xvvVarA.i;
                                    i10 = xvvVarA.f;
                                    i11 = xvvVarA.g;
                                    str9 = "video/hevc";
                                    i13 = i9;
                                    str5 = str9;
                                    i12 = i7;
                                    listSingletonList = list;
                                    i14 = i11;
                                    i6 = i10;
                                    str7 = str8;
                                    i5 = -1;
                                    i4 = -1;
                                    if (bj30Var6.P != null) {
                                        i15 = i5;
                                        hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                        if (hbbVarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = hbbVarA.b;
                                        }
                                        boolean z1111118 = bj30Var6.b0;
                                        if (bj30Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i4111111111111111111111111119 = (z1111118 ? 1 : 0) | i16;
                                        awqVar = new awq();
                                        if (mg40.i(str10)) {
                                            awqVar.I = bj30Var6.Q;
                                            awqVar.J = bj30Var6.S;
                                            awqVar.K = bj30Var6.T;
                                            awqVar.L = i4;
                                        } else if (mg40.m(str10)) {
                                            if (bj30Var6.t == 0) {
                                                i24 = bj30Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = bj30Var6.o;
                                                }
                                                bj30Var6.r = i24;
                                                i25 = bj30Var6.s;
                                                if (i25 == -1) {
                                                    i25 = bj30Var6.p;
                                                }
                                                bj30Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = bj30Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                } else {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                }
                                            }
                                            int i41111111111111111111111111110 = i12;
                                            int i41111111111111111111111111111 = i13;
                                            int i41111111111111111111111111112 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = bj30Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (bj30Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            c4d c4dVar1111117 = new c4d(i41111111111111111111111111110, i41111111111111111111111111111, i41111111111111111111111111112, bArr, i19, i21);
                                            str11 = bj30Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (bj30Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            awqVar.v = bj30Var6.o;
                                            awqVar.w = bj30Var6.p;
                                            awqVar.D = f;
                                            awqVar.B = i22;
                                            awqVar.E = bj30Var6.y;
                                            awqVar.F = bj30Var6.z;
                                            awqVar.G = c4dVar1111117;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw kq80.a("Unexpected MIME type.", null);
                                        }
                                        str12 = bj30Var6.b;
                                        if (str12 != null) {
                                            awqVar.b = bj30Var6.b;
                                        }
                                        awqVar.f1587a = Integer.toString(i44);
                                        if (bj30Var6.f2686a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        awqVar.n = mg40.n(str13);
                                        awqVar.o = mg40.n(str10);
                                        awqVar.p = i15;
                                        awqVar.d = bj30Var6.c0;
                                        awqVar.e = i4111111111111111111111111119;
                                        awqVar.r = listSingletonList;
                                        awqVar.k = str7;
                                        awqVar.s = bj30Var6.n;
                                        bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                        cj30Var = cj30Var;
                                        bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                        sparseArray2.put(bj30Var6.d, bj30Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z1111119 = bj30Var6.b0;
                                    if (bj30Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i41111111111111111111111111113 = (z1111119 ? 1 : 0) | i16;
                                    awqVar = new awq();
                                    if (mg40.i(str10)) {
                                        awqVar.I = bj30Var6.Q;
                                        awqVar.J = bj30Var6.S;
                                        awqVar.K = bj30Var6.T;
                                        awqVar.L = i4;
                                    } else if (mg40.m(str10)) {
                                        if (bj30Var6.t == 0) {
                                            i24 = bj30Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = bj30Var6.o;
                                            }
                                            bj30Var6.r = i24;
                                            i25 = bj30Var6.s;
                                            if (i25 == -1) {
                                                i25 = bj30Var6.p;
                                            }
                                            bj30Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = bj30Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            } else {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            }
                                        }
                                        int i41111111111111111111111111114 = i12;
                                        int i41111111111111111111111111115 = i13;
                                        int i41111111111111111111111111116 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = bj30Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (bj30Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        c4d c4dVar1111118 = new c4d(i41111111111111111111111111114, i41111111111111111111111111115, i41111111111111111111111111116, bArr, i19, i21);
                                        str11 = bj30Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (bj30Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        awqVar.v = bj30Var6.o;
                                        awqVar.w = bj30Var6.p;
                                        awqVar.D = f;
                                        awqVar.B = i22;
                                        awqVar.E = bj30Var6.y;
                                        awqVar.F = bj30Var6.z;
                                        awqVar.G = c4dVar1111118;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw kq80.a("Unexpected MIME type.", null);
                                    }
                                    str12 = bj30Var6.b;
                                    if (str12 != null) {
                                        awqVar.b = bj30Var6.b;
                                    }
                                    awqVar.f1587a = Integer.toString(i44);
                                    if (bj30Var6.f2686a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    awqVar.n = mg40.n(str13);
                                    awqVar.o = mg40.n(str10);
                                    awqVar.p = i15;
                                    awqVar.d = bj30Var6.c0;
                                    awqVar.e = i41111111111111111111111111113;
                                    awqVar.r = listSingletonList;
                                    awqVar.k = str7;
                                    awqVar.s = bj30Var6.n;
                                    bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                    cj30Var = cj30Var;
                                    bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                    sparseArray2.put(bj30Var6.d, bj30Var6);
                                    break;
                                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                                    str15 = "video/webm";
                                    cj30Var = cj30Var;
                                    i44 = i44;
                                    sparseArray2 = sparseArray2;
                                    str5 = "text/vtt";
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (bj30Var6.P != null) {
                                        i15 = i5;
                                        hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                        if (hbbVarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = hbbVarA.b;
                                        }
                                        boolean z11111110 = bj30Var6.b0;
                                        if (bj30Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i41111111111111111111111111117 = (z11111110 ? 1 : 0) | i16;
                                        awqVar = new awq();
                                        if (mg40.i(str10)) {
                                            awqVar.I = bj30Var6.Q;
                                            awqVar.J = bj30Var6.S;
                                            awqVar.K = bj30Var6.T;
                                            awqVar.L = i4;
                                        } else if (mg40.m(str10)) {
                                            if (bj30Var6.t == 0) {
                                                i24 = bj30Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = bj30Var6.o;
                                                }
                                                bj30Var6.r = i24;
                                                i25 = bj30Var6.s;
                                                if (i25 == -1) {
                                                    i25 = bj30Var6.p;
                                                }
                                                bj30Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = bj30Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                } else {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                }
                                            }
                                            int i41111111111111111111111111118 = i12;
                                            int i41111111111111111111111111119 = i13;
                                            int i411111111111111111111111111110 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = bj30Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (bj30Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            c4d c4dVar1111119 = new c4d(i41111111111111111111111111118, i41111111111111111111111111119, i411111111111111111111111111110, bArr, i19, i21);
                                            str11 = bj30Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (bj30Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            awqVar.v = bj30Var6.o;
                                            awqVar.w = bj30Var6.p;
                                            awqVar.D = f;
                                            awqVar.B = i22;
                                            awqVar.E = bj30Var6.y;
                                            awqVar.F = bj30Var6.z;
                                            awqVar.G = c4dVar1111119;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw kq80.a("Unexpected MIME type.", null);
                                        }
                                        str12 = bj30Var6.b;
                                        if (str12 != null) {
                                            awqVar.b = bj30Var6.b;
                                        }
                                        awqVar.f1587a = Integer.toString(i44);
                                        if (bj30Var6.f2686a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        awqVar.n = mg40.n(str13);
                                        awqVar.o = mg40.n(str10);
                                        awqVar.p = i15;
                                        awqVar.d = bj30Var6.c0;
                                        awqVar.e = i41111111111111111111111111117;
                                        awqVar.r = listSingletonList;
                                        awqVar.k = str7;
                                        awqVar.s = bj30Var6.n;
                                        bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                        cj30Var = cj30Var;
                                        bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                        sparseArray2.put(bj30Var6.d, bj30Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z11111111 = bj30Var6.b0;
                                    if (bj30Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i411111111111111111111111111111 = (z11111111 ? 1 : 0) | i16;
                                    awqVar = new awq();
                                    if (mg40.i(str10)) {
                                        awqVar.I = bj30Var6.Q;
                                        awqVar.J = bj30Var6.S;
                                        awqVar.K = bj30Var6.T;
                                        awqVar.L = i4;
                                    } else if (mg40.m(str10)) {
                                        if (bj30Var6.t == 0) {
                                            i24 = bj30Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = bj30Var6.o;
                                            }
                                            bj30Var6.r = i24;
                                            i25 = bj30Var6.s;
                                            if (i25 == -1) {
                                                i25 = bj30Var6.p;
                                            }
                                            bj30Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = bj30Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            } else {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            }
                                        }
                                        int i411111111111111111111111111112 = i12;
                                        int i411111111111111111111111111113 = i13;
                                        int i411111111111111111111111111114 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = bj30Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (bj30Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        c4d c4dVar11111110 = new c4d(i411111111111111111111111111112, i411111111111111111111111111113, i411111111111111111111111111114, bArr, i19, i21);
                                        str11 = bj30Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (bj30Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        awqVar.v = bj30Var6.o;
                                        awqVar.w = bj30Var6.p;
                                        awqVar.D = f;
                                        awqVar.B = i22;
                                        awqVar.E = bj30Var6.y;
                                        awqVar.F = bj30Var6.z;
                                        awqVar.G = c4dVar11111110;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw kq80.a("Unexpected MIME type.", null);
                                    }
                                    str12 = bj30Var6.b;
                                    if (str12 != null) {
                                        awqVar.b = bj30Var6.b;
                                    }
                                    awqVar.f1587a = Integer.toString(i44);
                                    if (bj30Var6.f2686a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    awqVar.n = mg40.n(str13);
                                    awqVar.o = mg40.n(str10);
                                    awqVar.p = i15;
                                    awqVar.d = bj30Var6.c0;
                                    awqVar.e = i411111111111111111111111111111;
                                    awqVar.r = listSingletonList;
                                    awqVar.k = str7;
                                    awqVar.s = bj30Var6.n;
                                    bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                    cj30Var = cj30Var;
                                    bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                    sparseArray2.put(bj30Var6.d, bj30Var6);
                                    break;
                                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                                    str5 = "application/x-subrip";
                                    sparseArray2 = sparseArray2;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (bj30Var6.P != null) {
                                        i15 = i5;
                                        hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                        if (hbbVarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = hbbVarA.b;
                                        }
                                        boolean z11111112 = bj30Var6.b0;
                                        if (bj30Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i411111111111111111111111111115 = (z11111112 ? 1 : 0) | i16;
                                        awqVar = new awq();
                                        if (mg40.i(str10)) {
                                            awqVar.I = bj30Var6.Q;
                                            awqVar.J = bj30Var6.S;
                                            awqVar.K = bj30Var6.T;
                                            awqVar.L = i4;
                                        } else if (mg40.m(str10)) {
                                            if (bj30Var6.t == 0) {
                                                i24 = bj30Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = bj30Var6.o;
                                                }
                                                bj30Var6.r = i24;
                                                i25 = bj30Var6.s;
                                                if (i25 == -1) {
                                                    i25 = bj30Var6.p;
                                                }
                                                bj30Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = bj30Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                } else {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                }
                                            }
                                            int i411111111111111111111111111116 = i12;
                                            int i411111111111111111111111111117 = i13;
                                            int i411111111111111111111111111118 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = bj30Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (bj30Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            c4d c4dVar11111111 = new c4d(i411111111111111111111111111116, i411111111111111111111111111117, i411111111111111111111111111118, bArr, i19, i21);
                                            str11 = bj30Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (bj30Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            awqVar.v = bj30Var6.o;
                                            awqVar.w = bj30Var6.p;
                                            awqVar.D = f;
                                            awqVar.B = i22;
                                            awqVar.E = bj30Var6.y;
                                            awqVar.F = bj30Var6.z;
                                            awqVar.G = c4dVar11111111;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw kq80.a("Unexpected MIME type.", null);
                                        }
                                        str12 = bj30Var6.b;
                                        if (str12 != null) {
                                            awqVar.b = bj30Var6.b;
                                        }
                                        awqVar.f1587a = Integer.toString(i44);
                                        if (bj30Var6.f2686a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        awqVar.n = mg40.n(str13);
                                        awqVar.o = mg40.n(str10);
                                        awqVar.p = i15;
                                        awqVar.d = bj30Var6.c0;
                                        awqVar.e = i411111111111111111111111111115;
                                        awqVar.r = listSingletonList;
                                        awqVar.k = str7;
                                        awqVar.s = bj30Var6.n;
                                        bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                        cj30Var = cj30Var;
                                        bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                        sparseArray2.put(bj30Var6.d, bj30Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z11111113 = bj30Var6.b0;
                                    if (bj30Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i411111111111111111111111111119 = (z11111113 ? 1 : 0) | i16;
                                    awqVar = new awq();
                                    if (mg40.i(str10)) {
                                        awqVar.I = bj30Var6.Q;
                                        awqVar.J = bj30Var6.S;
                                        awqVar.K = bj30Var6.T;
                                        awqVar.L = i4;
                                    } else if (mg40.m(str10)) {
                                        if (bj30Var6.t == 0) {
                                            i24 = bj30Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = bj30Var6.o;
                                            }
                                            bj30Var6.r = i24;
                                            i25 = bj30Var6.s;
                                            if (i25 == -1) {
                                                i25 = bj30Var6.p;
                                            }
                                            bj30Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = bj30Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            } else {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            }
                                        }
                                        int i4111111111111111111111111111110 = i12;
                                        int i4111111111111111111111111111111 = i13;
                                        int i4111111111111111111111111111112 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = bj30Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (bj30Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        c4d c4dVar11111112 = new c4d(i4111111111111111111111111111110, i4111111111111111111111111111111, i4111111111111111111111111111112, bArr, i19, i21);
                                        str11 = bj30Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (bj30Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        awqVar.v = bj30Var6.o;
                                        awqVar.w = bj30Var6.p;
                                        awqVar.D = f;
                                        awqVar.B = i22;
                                        awqVar.E = bj30Var6.y;
                                        awqVar.F = bj30Var6.z;
                                        awqVar.G = c4dVar11111112;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw kq80.a("Unexpected MIME type.", null);
                                    }
                                    str12 = bj30Var6.b;
                                    if (str12 != null) {
                                        awqVar.b = bj30Var6.b;
                                    }
                                    awqVar.f1587a = Integer.toString(i44);
                                    if (bj30Var6.f2686a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    awqVar.n = mg40.n(str13);
                                    awqVar.o = mg40.n(str10);
                                    awqVar.p = i15;
                                    awqVar.d = bj30Var6.c0;
                                    awqVar.e = i411111111111111111111111111119;
                                    awqVar.r = listSingletonList;
                                    awqVar.k = str7;
                                    awqVar.s = bj30Var6.n;
                                    bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                    cj30Var = cj30Var;
                                    bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                    sparseArray2.put(bj30Var6.d, bj30Var6);
                                    break;
                                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                                    str15 = "video/webm";
                                    str17 = "video/mpeg2";
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (bj30Var6.P != null) {
                                        i15 = i5;
                                        hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                        if (hbbVarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = hbbVarA.b;
                                        }
                                        boolean z11111114 = bj30Var6.b0;
                                        if (bj30Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i4111111111111111111111111111113 = (z11111114 ? 1 : 0) | i16;
                                        awqVar = new awq();
                                        if (mg40.i(str10)) {
                                            awqVar.I = bj30Var6.Q;
                                            awqVar.J = bj30Var6.S;
                                            awqVar.K = bj30Var6.T;
                                            awqVar.L = i4;
                                        } else if (mg40.m(str10)) {
                                            if (bj30Var6.t == 0) {
                                                i24 = bj30Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = bj30Var6.o;
                                                }
                                                bj30Var6.r = i24;
                                                i25 = bj30Var6.s;
                                                if (i25 == -1) {
                                                    i25 = bj30Var6.p;
                                                }
                                                bj30Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = bj30Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                } else {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                }
                                            }
                                            int i4111111111111111111111111111114 = i12;
                                            int i4111111111111111111111111111115 = i13;
                                            int i4111111111111111111111111111116 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = bj30Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (bj30Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            c4d c4dVar11111113 = new c4d(i4111111111111111111111111111114, i4111111111111111111111111111115, i4111111111111111111111111111116, bArr, i19, i21);
                                            str11 = bj30Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (bj30Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            awqVar.v = bj30Var6.o;
                                            awqVar.w = bj30Var6.p;
                                            awqVar.D = f;
                                            awqVar.B = i22;
                                            awqVar.E = bj30Var6.y;
                                            awqVar.F = bj30Var6.z;
                                            awqVar.G = c4dVar11111113;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw kq80.a("Unexpected MIME type.", null);
                                        }
                                        str12 = bj30Var6.b;
                                        if (str12 != null) {
                                            awqVar.b = bj30Var6.b;
                                        }
                                        awqVar.f1587a = Integer.toString(i44);
                                        if (bj30Var6.f2686a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        awqVar.n = mg40.n(str13);
                                        awqVar.o = mg40.n(str10);
                                        awqVar.p = i15;
                                        awqVar.d = bj30Var6.c0;
                                        awqVar.e = i4111111111111111111111111111113;
                                        awqVar.r = listSingletonList;
                                        awqVar.k = str7;
                                        awqVar.s = bj30Var6.n;
                                        bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                        cj30Var = cj30Var;
                                        bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                        sparseArray2.put(bj30Var6.d, bj30Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z11111115 = bj30Var6.b0;
                                    if (bj30Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i4111111111111111111111111111117 = (z11111115 ? 1 : 0) | i16;
                                    awqVar = new awq();
                                    if (mg40.i(str10)) {
                                        awqVar.I = bj30Var6.Q;
                                        awqVar.J = bj30Var6.S;
                                        awqVar.K = bj30Var6.T;
                                        awqVar.L = i4;
                                    } else if (mg40.m(str10)) {
                                        if (bj30Var6.t == 0) {
                                            i24 = bj30Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = bj30Var6.o;
                                            }
                                            bj30Var6.r = i24;
                                            i25 = bj30Var6.s;
                                            if (i25 == -1) {
                                                i25 = bj30Var6.p;
                                            }
                                            bj30Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = bj30Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            } else {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            }
                                        }
                                        int i4111111111111111111111111111118 = i12;
                                        int i4111111111111111111111111111119 = i13;
                                        int i41111111111111111111111111111110 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = bj30Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (bj30Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        c4d c4dVar11111114 = new c4d(i4111111111111111111111111111118, i4111111111111111111111111111119, i41111111111111111111111111111110, bArr, i19, i21);
                                        str11 = bj30Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (bj30Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        awqVar.v = bj30Var6.o;
                                        awqVar.w = bj30Var6.p;
                                        awqVar.D = f;
                                        awqVar.B = i22;
                                        awqVar.E = bj30Var6.y;
                                        awqVar.F = bj30Var6.z;
                                        awqVar.G = c4dVar11111114;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw kq80.a("Unexpected MIME type.", null);
                                    }
                                    str12 = bj30Var6.b;
                                    if (str12 != null) {
                                        awqVar.b = bj30Var6.b;
                                    }
                                    awqVar.f1587a = Integer.toString(i44);
                                    if (bj30Var6.f2686a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    awqVar.n = mg40.n(str13);
                                    awqVar.o = mg40.n(str10);
                                    awqVar.p = i15;
                                    awqVar.d = bj30Var6.c0;
                                    awqVar.e = i4111111111111111111111111111117;
                                    awqVar.r = listSingletonList;
                                    awqVar.k = str7;
                                    awqVar.s = bj30Var6.n;
                                    bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                    cj30Var = cj30Var;
                                    bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                    sparseArray2.put(bj30Var6.d, bj30Var6);
                                    break;
                                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                                    str15 = "video/webm";
                                    listT = Collections.singletonList(bj30Var6.a(str16));
                                    int i68 = bj30Var6.R;
                                    String str21 = vtt0.f38024a;
                                    iZ = vtt0.z(i68, ByteOrder.LITTLE_ENDIAN);
                                    str17 = "audio/alac";
                                    if (iZ == 0) {
                                        listSingletonList = listT;
                                        str5 = str17;
                                        i6 = -1;
                                        i5 = -1;
                                        i4 = -1;
                                    } else {
                                        cj30Var = cj30Var;
                                        listSingletonList = listT;
                                        i4 = iZ;
                                        i44 = i44;
                                        sparseArray2 = sparseArray2;
                                        str5 = str17;
                                        i6 = -1;
                                        i5 = -1;
                                    }
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    if (bj30Var6.P != null) {
                                        i15 = i5;
                                        hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                        if (hbbVarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = hbbVarA.b;
                                        }
                                        boolean z11111116 = bj30Var6.b0;
                                        if (bj30Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i41111111111111111111111111111111 = (z11111116 ? 1 : 0) | i16;
                                        awqVar = new awq();
                                        if (mg40.i(str10)) {
                                            awqVar.I = bj30Var6.Q;
                                            awqVar.J = bj30Var6.S;
                                            awqVar.K = bj30Var6.T;
                                            awqVar.L = i4;
                                        } else if (mg40.m(str10)) {
                                            if (bj30Var6.t == 0) {
                                                i24 = bj30Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = bj30Var6.o;
                                                }
                                                bj30Var6.r = i24;
                                                i25 = bj30Var6.s;
                                                if (i25 == -1) {
                                                    i25 = bj30Var6.p;
                                                }
                                                bj30Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = bj30Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                } else {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                }
                                            }
                                            int i41111111111111111111111111111112 = i12;
                                            int i41111111111111111111111111111113 = i13;
                                            int i41111111111111111111111111111114 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = bj30Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (bj30Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            c4d c4dVar11111115 = new c4d(i41111111111111111111111111111112, i41111111111111111111111111111113, i41111111111111111111111111111114, bArr, i19, i21);
                                            str11 = bj30Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (bj30Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            awqVar.v = bj30Var6.o;
                                            awqVar.w = bj30Var6.p;
                                            awqVar.D = f;
                                            awqVar.B = i22;
                                            awqVar.E = bj30Var6.y;
                                            awqVar.F = bj30Var6.z;
                                            awqVar.G = c4dVar11111115;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw kq80.a("Unexpected MIME type.", null);
                                        }
                                        str12 = bj30Var6.b;
                                        if (str12 != null) {
                                            awqVar.b = bj30Var6.b;
                                        }
                                        awqVar.f1587a = Integer.toString(i44);
                                        if (bj30Var6.f2686a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        awqVar.n = mg40.n(str13);
                                        awqVar.o = mg40.n(str10);
                                        awqVar.p = i15;
                                        awqVar.d = bj30Var6.c0;
                                        awqVar.e = i41111111111111111111111111111111;
                                        awqVar.r = listSingletonList;
                                        awqVar.k = str7;
                                        awqVar.s = bj30Var6.n;
                                        bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                        cj30Var = cj30Var;
                                        bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                        sparseArray2.put(bj30Var6.d, bj30Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z11111117 = bj30Var6.b0;
                                    if (bj30Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i41111111111111111111111111111115 = (z11111117 ? 1 : 0) | i16;
                                    awqVar = new awq();
                                    if (mg40.i(str10)) {
                                        awqVar.I = bj30Var6.Q;
                                        awqVar.J = bj30Var6.S;
                                        awqVar.K = bj30Var6.T;
                                        awqVar.L = i4;
                                    } else if (mg40.m(str10)) {
                                        if (bj30Var6.t == 0) {
                                            i24 = bj30Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = bj30Var6.o;
                                            }
                                            bj30Var6.r = i24;
                                            i25 = bj30Var6.s;
                                            if (i25 == -1) {
                                                i25 = bj30Var6.p;
                                            }
                                            bj30Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = bj30Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            } else {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            }
                                        }
                                        int i41111111111111111111111111111116 = i12;
                                        int i41111111111111111111111111111117 = i13;
                                        int i41111111111111111111111111111118 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = bj30Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (bj30Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        c4d c4dVar11111116 = new c4d(i41111111111111111111111111111116, i41111111111111111111111111111117, i41111111111111111111111111111118, bArr, i19, i21);
                                        str11 = bj30Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (bj30Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        awqVar.v = bj30Var6.o;
                                        awqVar.w = bj30Var6.p;
                                        awqVar.D = f;
                                        awqVar.B = i22;
                                        awqVar.E = bj30Var6.y;
                                        awqVar.F = bj30Var6.z;
                                        awqVar.G = c4dVar11111116;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw kq80.a("Unexpected MIME type.", null);
                                    }
                                    str12 = bj30Var6.b;
                                    if (str12 != null) {
                                        awqVar.b = bj30Var6.b;
                                    }
                                    awqVar.f1587a = Integer.toString(i44);
                                    if (bj30Var6.f2686a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    awqVar.n = mg40.n(str13);
                                    awqVar.o = mg40.n(str10);
                                    awqVar.p = i15;
                                    awqVar.d = bj30Var6.c0;
                                    awqVar.e = i41111111111111111111111111111115;
                                    awqVar.r = listSingletonList;
                                    awqVar.k = str7;
                                    awqVar.s = bj30Var6.n;
                                    bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                    cj30Var = cj30Var;
                                    bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                    sparseArray2.put(bj30Var6.d, bj30Var6);
                                    break;
                                case 32:
                                    str15 = "video/webm";
                                    str17 = "audio/eac3";
                                    str5 = str17;
                                    i6 = -1;
                                    i5 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    listSingletonList = null;
                                    if (bj30Var6.P != null) {
                                        i15 = i5;
                                        hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                        if (hbbVarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = hbbVarA.b;
                                        }
                                        boolean z11111118 = bj30Var6.b0;
                                        if (bj30Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i41111111111111111111111111111119 = (z11111118 ? 1 : 0) | i16;
                                        awqVar = new awq();
                                        if (mg40.i(str10)) {
                                            awqVar.I = bj30Var6.Q;
                                            awqVar.J = bj30Var6.S;
                                            awqVar.K = bj30Var6.T;
                                            awqVar.L = i4;
                                        } else if (mg40.m(str10)) {
                                            if (bj30Var6.t == 0) {
                                                i24 = bj30Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = bj30Var6.o;
                                                }
                                                bj30Var6.r = i24;
                                                i25 = bj30Var6.s;
                                                if (i25 == -1) {
                                                    i25 = bj30Var6.p;
                                                }
                                                bj30Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = bj30Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                } else {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                }
                                            }
                                            int i411111111111111111111111111111110 = i12;
                                            int i411111111111111111111111111111111 = i13;
                                            int i411111111111111111111111111111112 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = bj30Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (bj30Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            c4d c4dVar11111117 = new c4d(i411111111111111111111111111111110, i411111111111111111111111111111111, i411111111111111111111111111111112, bArr, i19, i21);
                                            str11 = bj30Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (bj30Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            awqVar.v = bj30Var6.o;
                                            awqVar.w = bj30Var6.p;
                                            awqVar.D = f;
                                            awqVar.B = i22;
                                            awqVar.E = bj30Var6.y;
                                            awqVar.F = bj30Var6.z;
                                            awqVar.G = c4dVar11111117;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw kq80.a("Unexpected MIME type.", null);
                                        }
                                        str12 = bj30Var6.b;
                                        if (str12 != null) {
                                            awqVar.b = bj30Var6.b;
                                        }
                                        awqVar.f1587a = Integer.toString(i44);
                                        if (bj30Var6.f2686a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        awqVar.n = mg40.n(str13);
                                        awqVar.o = mg40.n(str10);
                                        awqVar.p = i15;
                                        awqVar.d = bj30Var6.c0;
                                        awqVar.e = i41111111111111111111111111111119;
                                        awqVar.r = listSingletonList;
                                        awqVar.k = str7;
                                        awqVar.s = bj30Var6.n;
                                        bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                        cj30Var = cj30Var;
                                        bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                        sparseArray2.put(bj30Var6.d, bj30Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z11111119 = bj30Var6.b0;
                                    if (bj30Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i411111111111111111111111111111113 = (z11111119 ? 1 : 0) | i16;
                                    awqVar = new awq();
                                    if (mg40.i(str10)) {
                                        awqVar.I = bj30Var6.Q;
                                        awqVar.J = bj30Var6.S;
                                        awqVar.K = bj30Var6.T;
                                        awqVar.L = i4;
                                    } else if (mg40.m(str10)) {
                                        if (bj30Var6.t == 0) {
                                            i24 = bj30Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = bj30Var6.o;
                                            }
                                            bj30Var6.r = i24;
                                            i25 = bj30Var6.s;
                                            if (i25 == -1) {
                                                i25 = bj30Var6.p;
                                            }
                                            bj30Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = bj30Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            } else {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            }
                                        }
                                        int i411111111111111111111111111111114 = i12;
                                        int i411111111111111111111111111111115 = i13;
                                        int i411111111111111111111111111111116 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = bj30Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (bj30Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        c4d c4dVar11111118 = new c4d(i411111111111111111111111111111114, i411111111111111111111111111111115, i411111111111111111111111111111116, bArr, i19, i21);
                                        str11 = bj30Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (bj30Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        awqVar.v = bj30Var6.o;
                                        awqVar.w = bj30Var6.p;
                                        awqVar.D = f;
                                        awqVar.B = i22;
                                        awqVar.E = bj30Var6.y;
                                        awqVar.F = bj30Var6.z;
                                        awqVar.G = c4dVar11111118;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw kq80.a("Unexpected MIME type.", null);
                                    }
                                    str12 = bj30Var6.b;
                                    if (str12 != null) {
                                        awqVar.b = bj30Var6.b;
                                    }
                                    awqVar.f1587a = Integer.toString(i44);
                                    if (bj30Var6.f2686a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    awqVar.n = mg40.n(str13);
                                    awqVar.o = mg40.n(str10);
                                    awqVar.p = i15;
                                    awqVar.d = bj30Var6.c0;
                                    awqVar.e = i411111111111111111111111111111113;
                                    awqVar.r = listSingletonList;
                                    awqVar.k = str7;
                                    awqVar.s = bj30Var6.n;
                                    bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                    cj30Var = cj30Var;
                                    bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                    sparseArray2.put(bj30Var6.d, bj30Var6);
                                    break;
                                case 33:
                                    str15 = "video/webm";
                                    listT = Collections.singletonList(bj30Var6.a(str16));
                                    int i69 = bj30Var6.R;
                                    String str22 = vtt0.f38024a;
                                    iZ = vtt0.z(i69, ByteOrder.LITTLE_ENDIAN);
                                    str17 = "audio/flac";
                                    if (iZ == 0) {
                                        listSingletonList = listT;
                                        str5 = str17;
                                        i6 = -1;
                                        i5 = -1;
                                        i4 = -1;
                                    } else {
                                        cj30Var = cj30Var;
                                        listSingletonList = listT;
                                        i4 = iZ;
                                        i44 = i44;
                                        sparseArray2 = sparseArray2;
                                        str5 = str17;
                                        i6 = -1;
                                        i5 = -1;
                                    }
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    if (bj30Var6.P != null) {
                                        i15 = i5;
                                        hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                        if (hbbVarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = hbbVarA.b;
                                        }
                                        boolean z111111110 = bj30Var6.b0;
                                        if (bj30Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i411111111111111111111111111111117 = (z111111110 ? 1 : 0) | i16;
                                        awqVar = new awq();
                                        if (mg40.i(str10)) {
                                            awqVar.I = bj30Var6.Q;
                                            awqVar.J = bj30Var6.S;
                                            awqVar.K = bj30Var6.T;
                                            awqVar.L = i4;
                                        } else if (mg40.m(str10)) {
                                            if (bj30Var6.t == 0) {
                                                i24 = bj30Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = bj30Var6.o;
                                                }
                                                bj30Var6.r = i24;
                                                i25 = bj30Var6.s;
                                                if (i25 == -1) {
                                                    i25 = bj30Var6.p;
                                                }
                                                bj30Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = bj30Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                } else {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                }
                                            }
                                            int i411111111111111111111111111111118 = i12;
                                            int i411111111111111111111111111111119 = i13;
                                            int i4111111111111111111111111111111110 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = bj30Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (bj30Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            c4d c4dVar11111119 = new c4d(i411111111111111111111111111111118, i411111111111111111111111111111119, i4111111111111111111111111111111110, bArr, i19, i21);
                                            str11 = bj30Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (bj30Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            awqVar.v = bj30Var6.o;
                                            awqVar.w = bj30Var6.p;
                                            awqVar.D = f;
                                            awqVar.B = i22;
                                            awqVar.E = bj30Var6.y;
                                            awqVar.F = bj30Var6.z;
                                            awqVar.G = c4dVar11111119;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw kq80.a("Unexpected MIME type.", null);
                                        }
                                        str12 = bj30Var6.b;
                                        if (str12 != null) {
                                            awqVar.b = bj30Var6.b;
                                        }
                                        awqVar.f1587a = Integer.toString(i44);
                                        if (bj30Var6.f2686a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        awqVar.n = mg40.n(str13);
                                        awqVar.o = mg40.n(str10);
                                        awqVar.p = i15;
                                        awqVar.d = bj30Var6.c0;
                                        awqVar.e = i411111111111111111111111111111117;
                                        awqVar.r = listSingletonList;
                                        awqVar.k = str7;
                                        awqVar.s = bj30Var6.n;
                                        bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                        cj30Var = cj30Var;
                                        bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                        sparseArray2.put(bj30Var6.d, bj30Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z111111111 = bj30Var6.b0;
                                    if (bj30Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i4111111111111111111111111111111111 = (z111111111 ? 1 : 0) | i16;
                                    awqVar = new awq();
                                    if (mg40.i(str10)) {
                                        awqVar.I = bj30Var6.Q;
                                        awqVar.J = bj30Var6.S;
                                        awqVar.K = bj30Var6.T;
                                        awqVar.L = i4;
                                    } else if (mg40.m(str10)) {
                                        if (bj30Var6.t == 0) {
                                            i24 = bj30Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = bj30Var6.o;
                                            }
                                            bj30Var6.r = i24;
                                            i25 = bj30Var6.s;
                                            if (i25 == -1) {
                                                i25 = bj30Var6.p;
                                            }
                                            bj30Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = bj30Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            } else {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            }
                                        }
                                        int i4111111111111111111111111111111112 = i12;
                                        int i4111111111111111111111111111111113 = i13;
                                        int i4111111111111111111111111111111114 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = bj30Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (bj30Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        c4d c4dVar111111110 = new c4d(i4111111111111111111111111111111112, i4111111111111111111111111111111113, i4111111111111111111111111111111114, bArr, i19, i21);
                                        str11 = bj30Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (bj30Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        awqVar.v = bj30Var6.o;
                                        awqVar.w = bj30Var6.p;
                                        awqVar.D = f;
                                        awqVar.B = i22;
                                        awqVar.E = bj30Var6.y;
                                        awqVar.F = bj30Var6.z;
                                        awqVar.G = c4dVar111111110;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw kq80.a("Unexpected MIME type.", null);
                                    }
                                    str12 = bj30Var6.b;
                                    if (str12 != null) {
                                        awqVar.b = bj30Var6.b;
                                    }
                                    awqVar.f1587a = Integer.toString(i44);
                                    if (bj30Var6.f2686a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    awqVar.n = mg40.n(str13);
                                    awqVar.o = mg40.n(str10);
                                    awqVar.p = i15;
                                    awqVar.d = bj30Var6.c0;
                                    awqVar.e = i4111111111111111111111111111111111;
                                    awqVar.r = listSingletonList;
                                    awqVar.k = str7;
                                    awqVar.s = bj30Var6.n;
                                    bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                    cj30Var = cj30Var;
                                    bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                    sparseArray2.put(bj30Var6.d, bj30Var6);
                                    break;
                                case 34:
                                    ArrayList arrayList4 = new ArrayList(3);
                                    arrayList4.add(bj30Var6.a(bj30Var6.c));
                                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                    arrayList4.add(byteBufferAllocate.order(byteOrder).putLong(bj30Var6.U).array());
                                    arrayList4.add(ByteBuffer.allocate(8).order(byteOrder).putLong(bj30Var6.V).array());
                                    str3 = "audio/opus";
                                    i5 = 5760;
                                    listSingletonList = arrayList4;
                                    str5 = str3;
                                    i6 = -1;
                                    i4 = -1;
                                    i12 = -1;
                                    i13 = -1;
                                    i14 = -1;
                                    i8 = -1;
                                    str7 = null;
                                    if (bj30Var6.P != null) {
                                        i15 = i5;
                                        hbbVarA = hbb.a(new fq80(bj30Var6.P));
                                        if (hbbVarA != null) {
                                            str10 = "video/dolby-vision";
                                            str7 = hbbVarA.b;
                                        }
                                        boolean z111111112 = bj30Var6.b0;
                                        if (bj30Var6.a0) {
                                            i16 = 2;
                                        } else {
                                            i16 = 0;
                                        }
                                        int i4111111111111111111111111111111115 = (z111111112 ? 1 : 0) | i16;
                                        awqVar = new awq();
                                        if (mg40.i(str10)) {
                                            awqVar.I = bj30Var6.Q;
                                            awqVar.J = bj30Var6.S;
                                            awqVar.K = bj30Var6.T;
                                            awqVar.L = i4;
                                        } else if (mg40.m(str10)) {
                                            if (bj30Var6.t == 0) {
                                                i24 = bj30Var6.r;
                                                i17 = -1;
                                                if (i24 == -1) {
                                                    i24 = bj30Var6.o;
                                                }
                                                bj30Var6.r = i24;
                                                i25 = bj30Var6.s;
                                                if (i25 == -1) {
                                                    i25 = bj30Var6.p;
                                                }
                                                bj30Var6.s = i25;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = bj30Var6.r;
                                            if (i18 != i17) {
                                                f = -1.0f;
                                            } else {
                                                f = -1.0f;
                                            }
                                            if (i12 == -1) {
                                                if (i13 == -1) {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                } else {
                                                    i12 = bj30Var6.A;
                                                    i8 = bj30Var6.B;
                                                    i13 = bj30Var6.C;
                                                }
                                            }
                                            int i4111111111111111111111111111111116 = i12;
                                            int i4111111111111111111111111111111117 = i13;
                                            int i4111111111111111111111111111111118 = i8;
                                            if (i6 != -1) {
                                                i19 = i6;
                                            } else {
                                                i19 = 8;
                                            }
                                            if (i14 != -1) {
                                                i21 = i14;
                                            } else {
                                                i20 = bj30Var6.q;
                                                if (i20 != -1) {
                                                    i21 = i20;
                                                } else {
                                                    i21 = 8;
                                                }
                                            }
                                            if (bj30Var6.F != -1.0f) {
                                                bArr = null;
                                            } else {
                                                bArr = null;
                                            }
                                            c4d c4dVar111111111 = new c4d(i4111111111111111111111111111111116, i4111111111111111111111111111111117, i4111111111111111111111111111111118, bArr, i19, i21);
                                            str11 = bj30Var6.b;
                                            if (str11 == null) {
                                                iIntValue = -1;
                                            } else {
                                                iIntValue = -1;
                                            }
                                            if (bj30Var6.u == 0) {
                                                i22 = iIntValue;
                                            } else {
                                                i22 = iIntValue;
                                            }
                                            awqVar.v = bj30Var6.o;
                                            awqVar.w = bj30Var6.p;
                                            awqVar.D = f;
                                            awqVar.B = i22;
                                            awqVar.E = bj30Var6.y;
                                            awqVar.F = bj30Var6.z;
                                            awqVar.G = c4dVar111111111;
                                        } else if (!"application/x-subrip".equals(str10)) {
                                            throw kq80.a("Unexpected MIME type.", null);
                                        }
                                        str12 = bj30Var6.b;
                                        if (str12 != null) {
                                            awqVar.b = bj30Var6.b;
                                        }
                                        awqVar.f1587a = Integer.toString(i44);
                                        if (bj30Var6.f2686a) {
                                            str13 = str15;
                                        } else {
                                            str13 = "video/x-matroska";
                                        }
                                        awqVar.n = mg40.n(str13);
                                        awqVar.o = mg40.n(str10);
                                        awqVar.p = i15;
                                        awqVar.d = bj30Var6.c0;
                                        awqVar.e = i4111111111111111111111111111111115;
                                        awqVar.r = listSingletonList;
                                        awqVar.k = str7;
                                        awqVar.s = bj30Var6.n;
                                        bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                        cj30Var = cj30Var;
                                        bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                        sparseArray2.put(bj30Var6.d, bj30Var6);
                                    } else {
                                        i15 = i5;
                                    }
                                    str10 = str5;
                                    boolean z111111113 = bj30Var6.b0;
                                    if (bj30Var6.a0) {
                                        i16 = 2;
                                    } else {
                                        i16 = 0;
                                    }
                                    int i4111111111111111111111111111111119 = (z111111113 ? 1 : 0) | i16;
                                    awqVar = new awq();
                                    if (mg40.i(str10)) {
                                        awqVar.I = bj30Var6.Q;
                                        awqVar.J = bj30Var6.S;
                                        awqVar.K = bj30Var6.T;
                                        awqVar.L = i4;
                                    } else if (mg40.m(str10)) {
                                        if (bj30Var6.t == 0) {
                                            i24 = bj30Var6.r;
                                            i17 = -1;
                                            if (i24 == -1) {
                                                i24 = bj30Var6.o;
                                            }
                                            bj30Var6.r = i24;
                                            i25 = bj30Var6.s;
                                            if (i25 == -1) {
                                                i25 = bj30Var6.p;
                                            }
                                            bj30Var6.s = i25;
                                        } else {
                                            i17 = -1;
                                        }
                                        i18 = bj30Var6.r;
                                        if (i18 != i17) {
                                            f = -1.0f;
                                        } else {
                                            f = -1.0f;
                                        }
                                        if (i12 == -1) {
                                            if (i13 == -1) {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            } else {
                                                i12 = bj30Var6.A;
                                                i8 = bj30Var6.B;
                                                i13 = bj30Var6.C;
                                            }
                                        }
                                        int i41111111111111111111111111111111110 = i12;
                                        int i41111111111111111111111111111111111 = i13;
                                        int i41111111111111111111111111111111112 = i8;
                                        if (i6 != -1) {
                                            i19 = i6;
                                        } else {
                                            i19 = 8;
                                        }
                                        if (i14 != -1) {
                                            i21 = i14;
                                        } else {
                                            i20 = bj30Var6.q;
                                            if (i20 != -1) {
                                                i21 = i20;
                                            } else {
                                                i21 = 8;
                                            }
                                        }
                                        if (bj30Var6.F != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        c4d c4dVar111111112 = new c4d(i41111111111111111111111111111111110, i41111111111111111111111111111111111, i41111111111111111111111111111111112, bArr, i19, i21);
                                        str11 = bj30Var6.b;
                                        if (str11 == null) {
                                            iIntValue = -1;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (bj30Var6.u == 0) {
                                            i22 = iIntValue;
                                        } else {
                                            i22 = iIntValue;
                                        }
                                        awqVar.v = bj30Var6.o;
                                        awqVar.w = bj30Var6.p;
                                        awqVar.D = f;
                                        awqVar.B = i22;
                                        awqVar.E = bj30Var6.y;
                                        awqVar.F = bj30Var6.z;
                                        awqVar.G = c4dVar111111112;
                                    } else if (!"application/x-subrip".equals(str10)) {
                                        throw kq80.a("Unexpected MIME type.", null);
                                    }
                                    str12 = bj30Var6.b;
                                    if (str12 != null) {
                                        awqVar.b = bj30Var6.b;
                                    }
                                    awqVar.f1587a = Integer.toString(i44);
                                    if (bj30Var6.f2686a) {
                                        str13 = str15;
                                    } else {
                                        str13 = "video/x-matroska";
                                    }
                                    awqVar.n = mg40.n(str13);
                                    awqVar.o = mg40.n(str10);
                                    awqVar.p = i15;
                                    awqVar.d = bj30Var6.c0;
                                    awqVar.e = i4111111111111111111111111111111119;
                                    awqVar.r = listSingletonList;
                                    awqVar.k = str7;
                                    awqVar.s = bj30Var6.n;
                                    bj30Var6.e0 = new androidx.media3.common.b(awqVar);
                                    cj30Var = cj30Var;
                                    bj30Var6.d0 = cj30Var.q0.q(bj30Var6.d, bj30Var6.f);
                                    sparseArray2.put(bj30Var6.d, bj30Var6);
                                    break;
                                default:
                                    throw kq80.a("Unrecognized codec identifier.", null);
                            }
                            break;
                    }
                    cj30Var.B = null;
                    return true;
                }
            } else {
                i = 8;
            }
            boolean z20 = true;
            byte b3 = this.e;
            u3u0 u3u0Var = this.c;
            if (b3 == 0) {
                int i70 = 4;
                int i71 = 0;
                long j5 = u3u0Var.j(guoVar, true, false, 4);
                if (j5 == -2) {
                    guoVar.g();
                    while (true) {
                        byte[] bArr11 = this.f3233a;
                        guoVar.n(bArr11, i71, i70);
                        byte b4 = bArr11[i71];
                        int i72 = i;
                        int i73 = 0;
                        while (true) {
                            if (i73 >= i72) {
                                i3 = -1;
                            } else if ((u3u0.d[i73] & ((long) b4)) != 0) {
                                i3 = i73 + 1;
                            } else {
                                i73++;
                                i72 = 8;
                            }
                        }
                        if (i3 != -1 && i3 <= 4) {
                            iA = (int) u3u0.a(bArr11, false, i3);
                            Object obj = this.d.f27640a;
                            if (iA == 357149030 || iA == 272869232 || iA == 524531317 || iA == 475249515 || iA == 374648427) {
                            }
                        }
                        guoVar.m(1);
                        i70 = 4;
                        i71 = 0;
                        i = 8;
                    }
                    guoVar.m(i3);
                    j5 = iA;
                }
                z20 = true;
                if (j5 == -1) {
                    return false;
                }
                z = false;
                this.f = (int) j5;
                this.e = (byte) 1;
                b3 = 1;
            } else {
                z = false;
            }
            if (b3 == z20) {
                this.g = u3u0Var.j(guoVar, z, z20, 8);
                this.e = (byte) 2;
            }
            pv00 pv00Var2 = this.d;
            int i74 = this.f;
            Object obj2 = pv00Var2.f27640a;
            switch (i74) {
                case 128:
                case 143:
                case 160:
                case 166:
                case 174:
                case Response.QUEUED /* 182 */:
                case Response.SESSION_PROGRESS /* 183 */:
                case 187:
                case 224:
                case 225:
                case 16868:
                case 17849:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30113:
                case 30320:
                case 272869232:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    i2 = 1;
                    break;
                case 131:
                case 136:
                case 137:
                case 145:
                case 146:
                case 152:
                case 155:
                case 159:
                case 176:
                case 179:
                case 186:
                case 215:
                case 231:
                case 238:
                case 240:
                case 241:
                case 247:
                case 251:
                case 16871:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21938:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 21998:
                case 22186:
                case 22203:
                case 25188:
                case 29636:
                case 29637:
                case 30114:
                case 30321:
                case 2352003:
                case 2807729:
                    i2 = 2;
                    break;
                case 133:
                case 134:
                case 17026:
                case 17276:
                case 21358:
                case 2274716:
                    i2 = 3;
                    break;
                case 161:
                case 163:
                case 165:
                case 16877:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    i2 = 4;
                    break;
                case Response.CALL_IS_BEING_FORWARDED /* 181 */:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                case 30323:
                case 30324:
                case 30325:
                    i2 = 5;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            if (i2 != 0) {
                if (i2 == 1) {
                    long position = guoVar.getPosition();
                    arrayDeque.push(new auj(this.f, this.g + position));
                    this.d.q(this.f, position, this.g);
                    this.e = (byte) 0;
                    return true;
                }
                if (i2 == 2) {
                    long j6 = this.g;
                    if (j6 <= 8) {
                        pv00Var2.k(i74, b(guoVar, (int) j6));
                        this.e = (byte) 0;
                        return true;
                    }
                    throw kq80.a("Invalid integer size: " + this.g, null);
                }
                if (i2 == 3) {
                    byte b5 = 0;
                    long j7 = this.g;
                    if (j7 > 2147483647L) {
                        throw kq80.a("String element size: " + this.g, null);
                    }
                    int i75 = (int) j7;
                    if (i75 == 0) {
                        str = "";
                    } else {
                        byte[] bArr12 = new byte[i75];
                        guoVar.readFully(bArr12, 0, i75);
                        while (i75 > 0 && bArr12[i75 - 1] == 0) {
                            i75--;
                        }
                        b5 = 0;
                        str = new String(bArr12, 0, i75);
                    }
                    pv00Var2.r(i74, str);
                    this.e = b5;
                    return true;
                }
                if (i2 == 4) {
                    pv00Var2.c(i74, (int) this.g, guoVar);
                    this.e = (byte) 0;
                    return true;
                }
                if (i2 != 5) {
                    throw kq80.a("Invalid element type " + i2, null);
                }
                long j8 = this.g;
                if (j8 != 4 && j8 != 8) {
                    throw kq80.a("Invalid float size: " + this.g, null);
                }
                int i76 = (int) j8;
                long jB = b(guoVar, i76);
                double dIntBitsToFloat = i76 == 4 ? Float.intBitsToFloat((int) jB) : Double.longBitsToDouble(jB);
                cj30 cj30Var2 = (cj30) pv00Var2.f27640a;
                if (i74 == 181) {
                    cj30Var2.h(i74);
                    cj30Var2.B.T = (int) dIntBitsToFloat;
                } else if (i74 != 17545) {
                    switch (i74) {
                        case 21969:
                            cj30Var2.h(i74);
                            cj30Var2.B.F = (float) dIntBitsToFloat;
                            break;
                        case 21970:
                            cj30Var2.h(i74);
                            cj30Var2.B.G = (float) dIntBitsToFloat;
                            break;
                        case 21971:
                            cj30Var2.h(i74);
                            cj30Var2.B.H = (float) dIntBitsToFloat;
                            break;
                        case 21972:
                            cj30Var2.h(i74);
                            cj30Var2.B.I = (float) dIntBitsToFloat;
                            break;
                        case 21973:
                            cj30Var2.h(i74);
                            cj30Var2.B.J = (float) dIntBitsToFloat;
                            break;
                        case 21974:
                            cj30Var2.h(i74);
                            cj30Var2.B.K = (float) dIntBitsToFloat;
                            break;
                        case 21975:
                            cj30Var2.h(i74);
                            cj30Var2.B.L = (float) dIntBitsToFloat;
                            break;
                        case 21976:
                            cj30Var2.h(i74);
                            cj30Var2.B.M = (float) dIntBitsToFloat;
                            break;
                        case 21977:
                            cj30Var2.h(i74);
                            cj30Var2.B.N = (float) dIntBitsToFloat;
                            break;
                        case 21978:
                            cj30Var2.h(i74);
                            cj30Var2.B.O = (float) dIntBitsToFloat;
                            break;
                        default:
                            switch (i74) {
                                case 30323:
                                    cj30Var2.h(i74);
                                    cj30Var2.B.v = (float) dIntBitsToFloat;
                                    break;
                                case 30324:
                                    cj30Var2.h(i74);
                                    cj30Var2.B.w = (float) dIntBitsToFloat;
                                    break;
                                case 30325:
                                    cj30Var2.h(i74);
                                    cj30Var2.B.x = (float) dIntBitsToFloat;
                                    break;
                            }
                            break;
                    }
                } else {
                    cj30Var2.w = (long) dIntBitsToFloat;
                }
                this.e = (byte) 0;
                return true;
            }
            guoVar.m((int) this.g);
            this.e = (byte) 0;
        }
    }

    public final long b(guo guoVar, int i) {
        byte[] bArr = this.f3233a;
        guoVar.readFully(bArr, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return j;
    }
}
