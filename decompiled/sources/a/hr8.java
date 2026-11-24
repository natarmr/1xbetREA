package a;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.util.Pair;
import androidx.media3.common.DrmInitData;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class hr8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f13518a;

    static {
        String str = vtt0.f38024a;
        f13518a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void a(fq80 fq80Var) {
        int i = fq80Var.b;
        fq80Var.N(4);
        if (fq80Var.m() != 1751411826) {
            i += 4;
        }
        fq80Var.M(i);
    }

    /* JADX WARN: Code duplicated, block: B:195:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:264:0x056e  */
    /* JADX WARN: Code duplicated, block: B:276:0x0595  */
    /* JADX WARN: Code duplicated, block: B:282:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:356:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:88:0x0164  */
    public static void b(fq80 fq80Var, int i, int i2, int i3, int i4, String str, boolean z, DrmInitData drmInitData, qo8 qo8Var, int i5) throws kq80 {
        int iG;
        int iM;
        int iRound;
        int iD;
        int iZ;
        DrmInitData drmInitDataA;
        String str2;
        String str3;
        int i6;
        String str4;
        int i7;
        String str5;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int iG2;
        int i17;
        boolean z2;
        boolean z3;
        int i18;
        int i19;
        boolean zF;
        int i20;
        int iG3;
        String str6;
        fq80 fq80Var2 = fq80Var;
        int iIntValue = i;
        int i21 = i3;
        int[] iArr = ay3.d;
        int[] iArr2 = ay3.b;
        fq80Var2.M(i2 + 16);
        if (z) {
            iG = fq80Var2.G();
            fq80Var2.N(6);
        } else {
            fq80Var2.N(8);
            iG = 0;
        }
        int i22 = 4;
        int i23 = 2;
        if (iG == 0 || iG == 1) {
            i22 = 4;
            int iG4 = fq80Var2.G();
            fq80Var2.N(6);
            int iA = fq80Var2.A();
            fq80Var2.M(fq80Var2.b - 4);
            iM = fq80Var2.m();
            if (iG == 1) {
                fq80Var2.N(16);
            }
            iRound = iA;
            iD = iG4;
            iZ = -1;
        } else {
            if (iG != 2) {
                return;
            }
            fq80Var2.N(16);
            iRound = (int) Math.round(Double.longBitsToDouble(fq80Var2.t()));
            iD = fq80Var2.D();
            fq80Var2.N(4);
            int iD2 = fq80Var2.D();
            int iD3 = fq80Var2.D();
            boolean z4 = (iD3 & 1) != 0;
            boolean z5 = (iD3 & 2) != 0;
            iZ = z4 ? vtt0.x(iD2, z5 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN) : vtt0.z(iD2, z5 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
            if (iZ == 0) {
                iZ = -1;
            }
            fq80Var2.N(8);
            iM = 0;
        }
        if (iIntValue == 1767992678) {
            iRound = -1;
            iD = -1;
        } else {
            if (iIntValue == 1935764850) {
                iRound = JosStatusCodes.RTN_CODE_COMMON_ERROR;
            } else if (iIntValue == 1935767394) {
                iRound = 16000;
            }
            iD = 1;
        }
        int i24 = fq80Var2.b;
        if (iIntValue == 1701733217) {
            Pair pairH = h(fq80Var2, i2, i21);
            if (pairH != null) {
                iIntValue = ((Integer) pairH.first).intValue();
                drmInitDataA = drmInitData == null ? null : drmInitData.a(((vbs0) pairH.second).b);
                ((vbs0[]) qo8Var.d)[i5] = (vbs0) pairH.second;
            } else {
                drmInitDataA = drmInitData;
            }
            fq80Var2.M(i24);
        } else {
            drmInitDataA = drmInitData;
        }
        String str7 = "audio/mhm1";
        if (iIntValue == 1633889587) {
            str2 = "audio/ac3";
        } else if (iIntValue == 1700998451) {
            str2 = "audio/eac3";
        } else if (iIntValue == 1633889588) {
            str2 = "audio/ac4";
        } else if (iIntValue == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str2 = "audio/vnd.dts.hd";
        } else if (iIntValue == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (iIntValue == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (iIntValue == 1935764850) {
            str2 = "audio/3gpp";
        } else if (iIntValue == 1935767394) {
            str2 = "audio/amr-wb";
        } else if (iIntValue != 1936684916) {
            if (iIntValue == 1953984371) {
                iZ = 268435456;
            } else if (iIntValue == 1819304813) {
                if (iZ == -1) {
                    iZ = i23;
                }
            } else if (iIntValue == 778924082 || iIntValue == 778924083) {
                str2 = "audio/mpeg";
            } else if (iIntValue == 1835557169) {
                str2 = "audio/mha1";
            } else if (iIntValue == 1835560241) {
                str2 = "audio/mhm1";
            } else if (iIntValue == 1634492771) {
                str2 = "audio/alac";
            } else if (iIntValue == 1634492791) {
                str2 = "audio/g711-alaw";
            } else if (iIntValue == 1970037111) {
                str2 = "audio/g711-mlaw";
            } else if (iIntValue == 1332770163) {
                str2 = "audio/opus";
            } else if (iIntValue == 1716281667) {
                str2 = "audio/flac";
            } else if (iIntValue == 1835823201) {
                str2 = "audio/true-hd";
            } else {
                str2 = iIntValue == 1767992678 ? "audio/iamf" : null;
            }
            str2 = "audio/raw";
        } else {
            iZ = i23;
            str2 = "audio/raw";
        }
        dr8 dr8VarC = null;
        String str8 = null;
        List listT = null;
        br8 br8Var = null;
        while (i24 - i2 < i21) {
            fq80Var2.M(i24);
            int iM2 = fq80Var2.m();
            int i25 = iZ;
            obc.N("childAtomSize must be positive", iM2 > 0);
            int iM3 = fq80Var2.m();
            String str9 = str8;
            if (iM3 == 1835557187) {
                fq80Var2.M(i24 + 8);
                fq80Var2.N(1);
                int iZ2 = fq80Var2.z();
                fq80Var2.N(1);
                String str10 = Objects.equals(str2, str7) ? String.format("mhm1.%02X", Integer.valueOf(iZ2)) : String.format("mha1.%02X", Integer.valueOf(iZ2));
                int iG5 = fq80Var2.G();
                byte[] bArr = new byte[iG5];
                str9 = str10;
                fq80Var2.k(bArr, 0, iG5);
                listT = listT == null ? b4x.t(bArr) : b4x.v(bArr, (byte[]) listT.get(0));
            } else if (iM3 == 1835557200) {
                fq80Var2.M(i24 + 8);
                int iZ3 = fq80Var2.z();
                if (iZ3 > 0) {
                    byte[] bArr2 = new byte[iZ3];
                    fq80Var2.k(bArr2, 0, iZ3);
                    listT = listT == null ? b4x.t(bArr2) : b4x.v((byte[]) listT.get(0), bArr2);
                }
            } else {
                if (iM3 == 1702061171 || (z && iM3 == 2002876005)) {
                    String str11 = str2;
                    List list = listT;
                    int i26 = iM2;
                    str3 = str7;
                    int i27 = i24;
                    iRound = iRound;
                    int i28 = iD;
                    iIntValue = iIntValue;
                    if (iM3 == 1702061171) {
                        iM2 = i26;
                        i6 = i27;
                        i24 = i6;
                    } else {
                        i6 = fq80Var2.b;
                        i24 = i27;
                        obc.N(null, i6 >= i24);
                        while (true) {
                            iM2 = i26;
                            if (i6 - i24 < iM2) {
                                fq80Var2.M(i6);
                                int iM4 = fq80Var2.m();
                                obc.N("childAtomSize must be positive", iM4 > 0);
                                if (fq80Var2.m() != 1702061171) {
                                    i6 += iM4;
                                    i26 = iM2;
                                }
                            } else {
                                i6 = -1;
                            }
                        }
                    }
                    if (i6 != -1) {
                        dr8VarC = c(i6, fq80Var2);
                        str4 = (String) dr8VarC.c;
                        byte[] bArr3 = (byte[]) dr8VarC.d;
                        if (bArr3 != null) {
                            if ("audio/vorbis".equals(str4)) {
                                t3x t3xVar = kvu0.f18972a;
                                fq80 fq80Var3 = new fq80(bArr3);
                                fq80Var3.N(1);
                                int i29 = 0;
                                while (fq80Var3.a() > 0 && fq80Var3.j() == 255) {
                                    i29 += 255;
                                    fq80Var3.N(1);
                                }
                                int iZ4 = fq80Var3.z() + i29;
                                int i30 = 0;
                                while (true) {
                                    if (fq80Var3.a() > 0) {
                                        i24 = i24;
                                        if (fq80Var3.j() == 255) {
                                            i30 += 255;
                                            fq80Var3.N(1);
                                            i24 = i24;
                                        }
                                    } else {
                                        i24 = i24;
                                    }
                                }
                                int iZ5 = fq80Var3.z() + i30;
                                byte[] bArr4 = new byte[iZ4];
                                int i31 = fq80Var3.b;
                                System.arraycopy(bArr3, i31, bArr4, 0, iZ4);
                                int i32 = i31 + iZ4 + iZ5;
                                int length = bArr3.length - i32;
                                byte[] bArr5 = new byte[length];
                                System.arraycopy(bArr3, i32, bArr5, 0, length);
                                iRound = iRound;
                                listT = b4x.v(bArr4, bArr5);
                                i28 = i28;
                                str8 = str9;
                            } else {
                                i24 = i24;
                                if ("audio/mp4a-latm".equals(str4)) {
                                    cf60 cf60VarE = cy2.E(new q8b(bArr3, bArr3.length), false);
                                    iRound = cf60VarE.b;
                                    int i33 = cf60VarE.c;
                                    str8 = (String) cf60VarE.d;
                                    i28 = i33;
                                } else {
                                    i28 = i28;
                                    iRound = iRound;
                                    str8 = str9;
                                }
                                listT = b4x.t(bArr3);
                            }
                        }
                        i7 = i28;
                        str5 = str4;
                        iZ = i25;
                    } else {
                        dr8VarC = dr8VarC;
                        str4 = str11;
                    }
                    listT = list;
                    str8 = str9;
                    i7 = i28;
                    str5 = str4;
                    iZ = i25;
                } else if (iM3 == 1651798644) {
                    fq80Var2.M(i24 + 8);
                    fq80Var2.N(i22);
                    br8Var = new br8((byte) 0, fq80Var2.B(), fq80Var2.B());
                } else {
                    if (iM3 == 1684103987) {
                        fq80Var2.M(i24 + 8);
                        String string = Integer.toString(i4);
                        q8b q8bVar = new q8b();
                        q8bVar.k(fq80Var2);
                        int i34 = iArr2[q8bVar.g(i23)];
                        str5 = str2;
                        q8bVar.o(8);
                        int i35 = iArr[q8bVar.g(3)];
                        int i36 = q8bVar.g(1) != 0 ? i35 + 1 : i35;
                        str3 = str7;
                        int i37 = ay3.e[q8bVar.g(5)] * 1000;
                        q8bVar.c();
                        fq80Var2.M(q8bVar.d());
                        awq awqVar = new awq();
                        awqVar.f1587a = string;
                        awqVar.o = mg40.n("audio/ac3");
                        awqVar.I = i36;
                        awqVar.K = i34;
                        awqVar.s = drmInitDataA;
                        awqVar.d = str;
                        awqVar.i = i37;
                        awqVar.j = i37;
                        qo8Var.e = new androidx.media3.common.b(awqVar);
                    } else {
                        str5 = str2;
                        str3 = str7;
                        if (iM3 == 1684366131) {
                            fq80Var2.M(i24 + 8);
                            String string2 = Integer.toString(i4);
                            q8b q8bVar2 = new q8b();
                            q8bVar2.k(fq80Var2);
                            int iG6 = q8bVar2.g(13) * 1000;
                            q8bVar2.o(3);
                            int i38 = iArr2[q8bVar2.g(2)];
                            q8bVar2.o(10);
                            int i39 = iArr[q8bVar2.g(3)];
                            if (q8bVar2.g(1) != 0) {
                                i39++;
                            }
                            q8bVar2.o(3);
                            int iG7 = q8bVar2.g(4);
                            q8bVar2.o(1);
                            if (iG7 > 0) {
                                q8bVar2.o(6);
                                if (q8bVar2.g(1) != 0) {
                                    i39 += 2;
                                }
                                q8bVar2.o(1);
                            }
                            int i40 = i39;
                            if (q8bVar2.b() > 7) {
                                q8bVar2.o(7);
                                if (q8bVar2.g(1) != 0) {
                                    str6 = "audio/eac3-joc";
                                } else {
                                    str6 = "audio/eac3";
                                }
                            } else {
                                str6 = "audio/eac3";
                            }
                            q8bVar2.c();
                            fq80Var2.M(q8bVar2.d());
                            awq awqVar2 = new awq();
                            awqVar2.f1587a = string2;
                            awqVar2.o = mg40.n(str6);
                            awqVar2.I = i40;
                            awqVar2.K = i38;
                            awqVar2.s = drmInitDataA;
                            awqVar2.d = str;
                            awqVar2.j = iG6;
                            qo8Var.e = new androidx.media3.common.b(awqVar2);
                        } else {
                            listT = listT;
                            iM2 = iM2;
                            if (iM3 == 1684103988) {
                                fq80Var2.M(i24 + 8);
                                String string3 = Integer.toString(i4);
                                q8b q8bVar3 = new q8b();
                                q8bVar3.k(fq80Var2);
                                int iB = q8bVar3.b();
                                int iG8 = q8bVar3.g(3);
                                if (iG8 > 1) {
                                    throw kq80.e("Unsupported AC-4 DSI version: " + iG8);
                                }
                                int iG9 = q8bVar3.g(7);
                                int i41 = q8bVar3.f() ? 48000 : 44100;
                                q8bVar3.o(4);
                                int iG10 = q8bVar3.g(9);
                                if (iG9 > 1) {
                                    if (iG8 == 0) {
                                        throw kq80.e("Invalid AC-4 DSI version: " + iG8);
                                    }
                                    if (q8bVar3.f()) {
                                        q8bVar3.o(16);
                                        if (q8bVar3.f()) {
                                            q8bVar3.o(128);
                                        }
                                    }
                                }
                                if (iG8 == 1) {
                                    if (q8bVar3.b() < 66) {
                                        throw kq80.e("Invalid AC-4 DSI bitrate.");
                                    }
                                    q8bVar3.o(66);
                                    q8bVar3.c();
                                }
                                i6 i6Var = new i6();
                                i6Var.f14217a = true;
                                i6Var.b = -1;
                                i6Var.c = -1;
                                i6Var.d = true;
                                i6Var.e = 2;
                                i6Var.f = 1;
                                i6Var.g = 0;
                                int i42 = 0;
                                while (true) {
                                    if (i42 < iG10) {
                                        if (iG8 == 0) {
                                            boolean zF2 = q8bVar3.f();
                                            int iG11 = q8bVar3.g(5);
                                            i11 = iRound;
                                            iG2 = q8bVar3.g(5);
                                            i17 = 0;
                                            z2 = false;
                                            z3 = zF2;
                                            i18 = iG11;
                                            i19 = 0;
                                        } else {
                                            int i43 = iG10;
                                            int iG12 = q8bVar3.g(8);
                                            i11 = iRound;
                                            int iG13 = q8bVar3.g(8);
                                            if (iG13 == 255) {
                                                iG13 = q8bVar3.g(16) + iG13;
                                            }
                                            if (iG12 > 2) {
                                                q8bVar3.o(iG13 * 8);
                                                i42++;
                                                iG10 = i43;
                                                iRound = i11;
                                            } else {
                                                int iB2 = (iB - q8bVar3.b()) / 8;
                                                int i44 = iG13;
                                                int iG14 = q8bVar3.g(5);
                                                z2 = iG14 == 31;
                                                i18 = iG14;
                                                iG2 = iG12;
                                                i19 = iB2;
                                                i17 = i44;
                                                z3 = false;
                                            }
                                        }
                                        i6Var.f = iG2;
                                        i12 = iD;
                                        if (z3 || z2 || i18 != 6) {
                                            i6Var.g = q8bVar3.g(3);
                                            if (q8bVar3.f()) {
                                                q8bVar3.o(5);
                                            }
                                            q8bVar3.o(2);
                                            int i45 = 1;
                                            if (iG8 == 1 && (iG2 == 1 || iG2 == 2)) {
                                                q8bVar3.o(2);
                                            }
                                            q8bVar3.o(5);
                                            q8bVar3.o(10);
                                            if (iG8 == 1) {
                                                if (iG2 > 0) {
                                                    i6Var.f14217a = q8bVar3.f();
                                                }
                                                if (i6Var.f14217a) {
                                                    if (iG2 != 1) {
                                                        i20 = 2;
                                                        if (iG2 == 2) {
                                                            iG3 = q8bVar3.g(5);
                                                            if (iG3 >= 0 && iG3 <= 15) {
                                                                i6Var.b = iG3;
                                                            }
                                                            if (iG3 >= 11 || iG3 > 14) {
                                                                i20 = 2;
                                                            } else {
                                                                i6Var.d = q8bVar3.f();
                                                                i20 = 2;
                                                                i6Var.e = q8bVar3.g(2);
                                                            }
                                                        }
                                                    } else {
                                                        iG3 = q8bVar3.g(5);
                                                        if (iG3 >= 0) {
                                                            i6Var.b = iG3;
                                                        }
                                                        if (iG3 >= 11) {
                                                            i20 = 2;
                                                        } else {
                                                            i20 = 2;
                                                        }
                                                    }
                                                    q8bVar3.o(24);
                                                    i45 = 1;
                                                } else {
                                                    i20 = 2;
                                                }
                                                if (iG2 == i45 || iG2 == i20) {
                                                    if (q8bVar3.f() && q8bVar3.f()) {
                                                        q8bVar3.o(i20);
                                                    }
                                                    if (q8bVar3.f()) {
                                                        q8bVar3.n();
                                                        int i46 = 8;
                                                        int iG15 = q8bVar3.g(8);
                                                        int i47 = 0;
                                                        while (i47 < iG15) {
                                                            q8bVar3.o(i46);
                                                            i47++;
                                                            i46 = 8;
                                                        }
                                                    }
                                                }
                                            }
                                            if (!z3 && !z2) {
                                                q8bVar3.n();
                                                if (i18 == 0 || i18 == 1 || i18 == 2) {
                                                    if (iG2 == 0) {
                                                        for (int i48 = 0; i48 < 2; i48++) {
                                                            b34.q0(q8bVar3, i6Var);
                                                        }
                                                    } else {
                                                        for (int i49 = 0; i49 < 2; i49++) {
                                                            b34.r0(q8bVar3, i6Var);
                                                        }
                                                    }
                                                } else if (i18 == 3 || i18 == 4) {
                                                    if (iG2 == 0) {
                                                        for (int i50 = 0; i50 < 3; i50++) {
                                                            b34.q0(q8bVar3, i6Var);
                                                        }
                                                    } else {
                                                        for (int i51 = 0; i51 < 3; i51++) {
                                                            b34.r0(q8bVar3, i6Var);
                                                        }
                                                    }
                                                } else if (i18 != 5) {
                                                    int iG16 = q8bVar3.g(7);
                                                    for (int i52 = 0; i52 < iG16; i52++) {
                                                        q8bVar3.o(8);
                                                    }
                                                } else if (iG2 == 0) {
                                                    b34.q0(q8bVar3, i6Var);
                                                } else {
                                                    int iG17 = q8bVar3.g(3);
                                                    for (int i53 = 0; i53 < iG17 + 2; i53++) {
                                                        b34.r0(q8bVar3, i6Var);
                                                    }
                                                }
                                            } else if (iG2 == 0) {
                                                b34.q0(q8bVar3, i6Var);
                                            } else {
                                                b34.r0(q8bVar3, i6Var);
                                            }
                                            q8bVar3.n();
                                            zF = q8bVar3.f();
                                        } else {
                                            iG2 = iG2;
                                            zF = true;
                                        }
                                        if (zF) {
                                            int iG18 = q8bVar3.g(7);
                                            for (int i54 = 0; i54 < iG18; i54++) {
                                                q8bVar3.o(15);
                                            }
                                        }
                                        if (iG2 <= 0) {
                                            i13 = 8;
                                        } else {
                                            if (q8bVar3.f()) {
                                                if (q8bVar3.b() < 66) {
                                                    throw kq80.e("Can't parse bitrate DSI.");
                                                }
                                                q8bVar3.o(66);
                                            }
                                            if (q8bVar3.f()) {
                                                q8bVar3.c();
                                                q8bVar3.p(q8bVar3.g(16));
                                                int iG19 = q8bVar3.g(5);
                                                for (int i55 = 0; i55 < iG19; i55++) {
                                                    q8bVar3.o(3);
                                                    q8bVar3.o(8);
                                                }
                                                i13 = 8;
                                            } else {
                                                i13 = 8;
                                            }
                                        }
                                        q8bVar3.c();
                                        if (iG8 == 1) {
                                            int iB3 = ((iB - q8bVar3.b()) / 8) - i19;
                                            if (i17 < iB3) {
                                                throw kq80.e("pres_bytes is smaller than presentation bytes read.");
                                            }
                                            q8bVar3.p(i17 - iB3);
                                        }
                                        if (i6Var.f14217a && i6Var.b == -1) {
                                            throw kq80.e("Can't determine channel mode of presentation " + i42);
                                        }
                                    } else {
                                        iIntValue = iIntValue;
                                        i11 = iRound;
                                        i12 = iD;
                                        i13 = 8;
                                    }
                                    if (i6Var.f14217a) {
                                        int i56 = i6Var.b;
                                        boolean z6 = i6Var.d;
                                        int i57 = i6Var.e;
                                        switch (i56) {
                                            case 0:
                                                i15 = 11;
                                                i16 = 1;
                                                break;
                                            case 1:
                                                i15 = 11;
                                                i16 = 2;
                                                break;
                                            case 2:
                                                i15 = 11;
                                                i16 = 3;
                                                break;
                                            case 3:
                                                i15 = 11;
                                                i16 = 5;
                                                break;
                                            case 4:
                                                i15 = 11;
                                                i16 = 6;
                                                break;
                                            case 5:
                                            case 7:
                                            case 9:
                                                i15 = 11;
                                                i16 = 7;
                                                break;
                                            case 6:
                                            case 8:
                                            case 10:
                                                i16 = i13;
                                                i15 = 11;
                                                break;
                                            case 11:
                                                i15 = 11;
                                                i16 = 11;
                                                break;
                                            case 12:
                                                i16 = 12;
                                                i15 = 11;
                                                break;
                                            case 13:
                                                i15 = 11;
                                                i16 = 13;
                                                break;
                                            case 14:
                                                i15 = 11;
                                                i16 = 14;
                                                break;
                                            case 15:
                                                i15 = 11;
                                                i16 = 24;
                                                break;
                                            default:
                                                i15 = 11;
                                                i16 = -1;
                                                break;
                                        }
                                        if (i56 == i15 || i56 == 12 || i56 == 13 || i56 == 14) {
                                            if (!z6) {
                                                i16 -= 2;
                                            }
                                            if (i57 == 0) {
                                                i16 -= 4;
                                            } else if (i57 == 1) {
                                                i16 -= 2;
                                            }
                                        }
                                        i14 = i16;
                                    } else {
                                        int i58 = i6Var.c;
                                        int i59 = i6Var.g;
                                        if (i58 > 0) {
                                            i14 = i58 + 1;
                                            if (i59 == 4 && i14 == 17) {
                                                i14 = 21;
                                            }
                                        } else if (i59 == 0) {
                                            i14 = 2;
                                        } else if (i59 == 1) {
                                            i14 = 6;
                                        } else if (i59 == 2) {
                                            i14 = i13;
                                        } else if (i59 == 3) {
                                            i14 = 10;
                                        } else if (i59 != 4) {
                                            f1t0.g0("Ac4Util", "AC-4 level " + i6Var.g + " has not been defined.");
                                            i14 = 2;
                                        } else {
                                            i14 = 12;
                                        }
                                    }
                                    if (i14 <= 0) {
                                        throw kq80.e("Cannot determine channel count of presentation.");
                                    }
                                    Object[] objArr = {Integer.valueOf(iG9), Integer.valueOf(i6Var.f), Integer.valueOf(i6Var.g)};
                                    String str12 = vtt0.f38024a;
                                    String str13 = String.format(Locale.US, "ac-4.%02d.%02d.%02d", objArr);
                                    awq awqVar3 = new awq();
                                    awqVar3.f1587a = string3;
                                    awqVar3.o = mg40.n("audio/ac4");
                                    awqVar3.I = i14;
                                    awqVar3.K = i41;
                                    awqVar3.s = drmInitDataA;
                                    awqVar3.d = str;
                                    awqVar3.k = str13;
                                    qo8Var.e = new androidx.media3.common.b(awqVar3);
                                    i9 = i11;
                                    i8 = i12;
                                    iIntValue = iIntValue;
                                    i7 = i8;
                                    iRound = i9;
                                    iZ = i25;
                                    listT = listT;
                                    iM2 = iM2;
                                    str8 = str9;
                                }
                            } else {
                                int i60 = iIntValue;
                                i24 = i24;
                                iRound = iRound;
                                i7 = iD;
                                if (iM3 != 1684892784) {
                                    if (iM3 == 1684305011 || iM3 == 1969517683) {
                                        iIntValue = i60;
                                        awq awqVar4 = new awq();
                                        awqVar4.f1587a = Integer.toString(i4);
                                        awqVar4.o = mg40.n(str5);
                                        i8 = i7;
                                        awqVar4.I = i8;
                                        i9 = iRound;
                                        awqVar4.K = i9;
                                        awqVar4.s = drmInitDataA;
                                        awqVar4.d = str;
                                        qo8Var.e = new androidx.media3.common.b(awqVar4);
                                    } else {
                                        if (iM3 == 1682927731) {
                                            int i61 = iM2 - 8;
                                            byte[] bArr6 = f13518a;
                                            byte[] bArrCopyOf = Arrays.copyOf(bArr6, bArr6.length + i61);
                                            fq80Var2.M(i24 + 8);
                                            fq80Var2.k(bArrCopyOf, bArr6.length, i61);
                                            listT = zvw.C(bArrCopyOf);
                                        } else if (iM3 == 1684425825) {
                                            byte[] bArr7 = new byte[iM2 - 8];
                                            bArr7[0] = 102;
                                            bArr7[1] = 76;
                                            bArr7[2] = 97;
                                            bArr7[3] = 67;
                                            fq80Var2.M(i24 + 12);
                                            fq80Var2.k(bArr7, 4, iM2 - 12);
                                            listT = b4x.t(bArr7);
                                        } else if (iM3 == 1634492771) {
                                            int i62 = iM2 - 12;
                                            byte[] bArr8 = new byte[i62];
                                            fq80Var2.M(i24 + 12);
                                            fq80Var2.k(bArr8, 0, i62);
                                            byte[] bArr9 = jyc.f17352a;
                                            fq80 fq80Var4 = new fq80(bArr8);
                                            fq80Var4.M(5);
                                            int iZ6 = fq80Var4.z();
                                            fq80Var4.M(9);
                                            int iZ7 = fq80Var4.z();
                                            fq80Var4.M(20);
                                            int[] iArr3 = {fq80Var4.D(), iZ7, iZ6};
                                            int i63 = iArr3[0];
                                            int i64 = iArr3[1];
                                            int i65 = iArr3[2];
                                            String str14 = vtt0.f38024a;
                                            int iZ8 = vtt0.z(i65, ByteOrder.LITTLE_ENDIAN);
                                            if (iZ8 == 0) {
                                                iZ8 = -1;
                                            }
                                            iZ = iZ8;
                                            iRound = i63;
                                            i7 = i64;
                                            iM2 = iM2;
                                            iIntValue = i60;
                                            listT = b4x.t(bArr8);
                                            str8 = str9;
                                        } else if (iM3 == 1767990114) {
                                            fq80Var2.M(i24 + 9);
                                            int iE = fq80Var2.E();
                                            byte[] bArr10 = new byte[iE];
                                            fq80Var2.k(bArr10, 0, iE);
                                            byte[] bArr11 = jyc.f17352a;
                                            fq80 fq80Var5 = new fq80(bArr10);
                                            String str15 = null;
                                            String strX = null;
                                            while (fq80Var5.a() > 0 && (str15 == null || strX == null)) {
                                                int iZ9 = fq80Var5.z();
                                                int i66 = iZ9 >> 3;
                                                boolean z7 = (iZ9 & 2) != 0;
                                                boolean z8 = (iZ9 & 1) != 0;
                                                int iE2 = fq80Var5.E();
                                                if (i66 > 4 && i66 < 24 && z7) {
                                                    do {
                                                    } while ((fq80Var5.z() & 128) != 0);
                                                    for (i10 = 128; (fq80Var5.z() & i10) != 0; i10 = 128) {
                                                    }
                                                }
                                                if (z8) {
                                                    fq80Var5.N(fq80Var5.E());
                                                }
                                                int i67 = fq80Var5.b + iE2;
                                                if (i66 == 31) {
                                                    fq80Var5.N(4);
                                                    Object[] objArr2 = {Integer.valueOf(fq80Var5.z()), Integer.valueOf(fq80Var5.z())};
                                                    String str16 = vtt0.f38024a;
                                                    str15 = String.format(Locale.US, "iamf.%03X.%03X", objArr2);
                                                } else {
                                                    if (i66 == 0) {
                                                        while ((fq80Var5.z() & 128) != 0) {
                                                        }
                                                        strX = fq80Var5.x(4, StandardCharsets.UTF_8);
                                                        if (strX.equals("mp4a")) {
                                                            while ((fq80Var5.z() & 128) != 0) {
                                                            }
                                                            fq80Var5.N(2);
                                                            q8b q8bVar4 = new q8b();
                                                            q8bVar4.k(fq80Var5);
                                                            int iG20 = q8bVar4.g(5);
                                                            if (iG20 == 31) {
                                                                iG20 = q8bVar4.g(6) + 32;
                                                            }
                                                            strX = strX + ".40." + iG20;
                                                        }
                                                        fq80Var5.M(i67);
                                                    }
                                                    fq80Var5.M(i67);
                                                }
                                                fq80Var5.M(i67);
                                            }
                                            String strL = (str15 == null || strX == null) ? null : kng0.l(str15, Separators.DOT, strX);
                                            listT = b4x.t(bArr10);
                                            str8 = strL;
                                            iZ = i25;
                                            iIntValue = i60;
                                        } else if (iM3 == 1885564227) {
                                            fq80Var2.M(i24 + 12);
                                            ByteOrder byteOrder = (fq80Var2.z() & 1) != 0 ? ByteOrder.LITTLE_ENDIAN : ByteOrder.BIG_ENDIAN;
                                            int iZ10 = fq80Var2.z();
                                            iIntValue = i60;
                                            iZ = iIntValue == 1768973165 ? vtt0.z(iZ10, byteOrder) : iIntValue == 1718641517 ? vtt0.x(iZ10, byteOrder) : i25;
                                            if (iZ == 0) {
                                                iZ = -1;
                                            }
                                            str8 = str9;
                                            if (iZ != -1) {
                                                str5 = "audio/raw";
                                            }
                                            listT = listT;
                                        } else {
                                            iIntValue = i60;
                                            i9 = iRound;
                                            i8 = i7;
                                        }
                                        dr8VarC = dr8VarC;
                                        str8 = str9;
                                        iZ = i25;
                                        iM2 = iM2;
                                        iRound = iRound;
                                        iIntValue = i60;
                                    }
                                    i7 = i8;
                                    iRound = i9;
                                    iZ = i25;
                                    listT = listT;
                                    iM2 = iM2;
                                    str8 = str9;
                                } else {
                                    if (iM <= 0) {
                                        throw kq80.a("Invalid sample rate for Dolby TrueHD MLP stream: " + iM, null);
                                    }
                                    dr8VarC = dr8VarC;
                                    str8 = str9;
                                    iRound = iM;
                                    iZ = i25;
                                    listT = listT;
                                    iM2 = iM2;
                                    iIntValue = i60;
                                    i7 = 2;
                                }
                            }
                        }
                    }
                    i9 = iRound;
                    i8 = iD;
                    i7 = i8;
                    iRound = i9;
                    iZ = i25;
                    listT = listT;
                    iM2 = iM2;
                    str8 = str9;
                }
                i24 += iM2;
                i22 = 4;
                i23 = 2;
                fq80Var2 = fq80Var;
                i21 = i3;
                iIntValue = iIntValue;
                dr8VarC = dr8VarC;
                str2 = str5;
                str7 = str3;
                iD = i7;
            }
            str8 = str9;
            str5 = str2;
            str3 = str7;
            i24 = i24;
            i7 = iD;
            iZ = i25;
            iIntValue = iIntValue;
            iM2 = iM2;
            dr8VarC = dr8VarC;
            i24 += iM2;
            i22 = 4;
            i23 = 2;
            fq80Var2 = fq80Var;
            i21 = i3;
            iIntValue = iIntValue;
            dr8VarC = dr8VarC;
            str2 = str5;
            str7 = str3;
            iD = i7;
        }
        String str17 = str8;
        String str18 = str2;
        List list2 = listT;
        int i68 = iRound;
        int i69 = iZ;
        int i70 = iD;
        if (((androidx.media3.common.b) qo8Var.e) != null || str18 == null) {
            return;
        }
        awq awqVar5 = new awq();
        awqVar5.f1587a = Integer.toString(i4);
        awqVar5.o = mg40.n(str18);
        awqVar5.k = str17;
        awqVar5.I = i70;
        awqVar5.K = i68;
        awqVar5.L = i69;
        awqVar5.r = list2;
        awqVar5.s = drmInitDataA;
        awqVar5.d = str;
        if (dr8VarC != null) {
            dr8 dr8Var = dr8VarC;
            awqVar5.i = n6x.Y(dr8Var.f6545a);
            awqVar5.j = n6x.Y(dr8Var.b);
        } else {
            br8 br8Var2 = br8Var;
            if (br8Var2 != null) {
                awqVar5.i = n6x.Y(br8Var2.b);
                awqVar5.j = n6x.Y(br8Var2.c);
            }
        }
        qo8Var.e = new androidx.media3.common.b(awqVar5);
    }

    public static dr8 c(int i, fq80 fq80Var) {
        fq80Var.M(i + 12);
        fq80Var.N(1);
        d(fq80Var);
        fq80Var.N(2);
        int iZ = fq80Var.z();
        if ((iZ & 128) != 0) {
            fq80Var.N(2);
        }
        if ((iZ & 64) != 0) {
            fq80Var.N(fq80Var.z());
        }
        if ((iZ & 32) != 0) {
            fq80Var.N(2);
        }
        fq80Var.N(1);
        d(fq80Var);
        String strE = mg40.e(fq80Var.z());
        if ("audio/mpeg".equals(strE) || "audio/vnd.dts".equals(strE) || "audio/vnd.dts.hd".equals(strE)) {
            return new dr8(strE, null, -1L, -1L);
        }
        fq80Var.N(4);
        long jB = fq80Var.B();
        long jB2 = fq80Var.B();
        fq80Var.N(1);
        int iD = d(fq80Var);
        long j = jB2;
        byte[] bArr = new byte[iD];
        fq80Var.k(bArr, 0, iD);
        if (j <= 0) {
            j = -1;
        }
        return new dr8(strE, bArr, j, jB > 0 ? jB : -1L);
    }

    public static int d(fq80 fq80Var) {
        int iZ = fq80Var.z();
        int i = iZ & 127;
        while ((iZ & 128) == 128) {
            iZ = fq80Var.z();
            i = (i << 7) | (iZ & 127);
        }
        return i;
    }

    public static int e(int i) {
        return (i >> 24) & 255;
    }

    public static ed40 f(ev40 ev40Var) {
        nj30 nj30Var;
        fv40 fv40VarW = ev40Var.w(1751411826);
        fv40 fv40VarW2 = ev40Var.w(1801812339);
        fv40 fv40VarW3 = ev40Var.w(1768715124);
        if (fv40VarW == null || fv40VarW2 == null || fv40VarW3 == null) {
            return null;
        }
        fq80 fq80Var = fv40VarW.e;
        fq80Var.M(16);
        if (fq80Var.m() != 1835299937) {
            return null;
        }
        fq80 fq80Var2 = fv40VarW2.e;
        fq80Var2.M(12);
        int iM = fq80Var2.m();
        String[] strArr = new String[iM];
        for (int i = 0; i < iM; i++) {
            int iM2 = fq80Var2.m();
            fq80Var2.N(4);
            strArr[i] = fq80Var2.x(iM2 - 8, StandardCharsets.UTF_8);
        }
        fq80 fq80Var3 = fv40VarW3.e;
        fq80Var3.M(8);
        ArrayList arrayList = new ArrayList();
        while (fq80Var3.a() > 8) {
            int i2 = fq80Var3.b;
            int iM3 = fq80Var3.m();
            int iM4 = fq80Var3.m() - 1;
            if (iM4 < 0 || iM4 >= iM) {
                rw2.u(iM4, "Skipped metadata with unknown key index: ", "BoxParsers");
            } else {
                String str = strArr[iM4];
                int i3 = i2 + iM3;
                while (true) {
                    int i4 = fq80Var3.b;
                    if (i4 < i3) {
                        int iM5 = fq80Var3.m();
                        if (fq80Var3.m() == 1684108385) {
                            int iM6 = fq80Var3.m();
                            int iM7 = fq80Var3.m();
                            int i5 = iM5 - 16;
                            byte[] bArr = new byte[i5];
                            fq80Var3.k(bArr, 0, i5);
                            try {
                                nj30Var = new nj30(str, bArr, iM7, iM6);
                                break;
                            } catch (Exception unused) {
                                dw9.A("Failed to parse metadata entry with key: ", str, "MetadataUtil");
                                nj30Var = null;
                                break;
                            }
                        }
                        fq80Var3.M(i4 + iM5);
                    }
                    nj30Var = null;
                    break;
                }
                if (nj30Var != null) {
                    arrayList.add(nj30Var);
                }
            }
            fq80Var3.M(i2 + iM3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ed40(arrayList);
    }

    public static kv40 g(fq80 fq80Var) {
        long jT;
        long jT2;
        fq80Var.M(8);
        if (e(fq80Var.m()) == 0) {
            jT = fq80Var.B();
            jT2 = fq80Var.B();
        } else {
            jT = fq80Var.t();
            jT2 = fq80Var.t();
        }
        return new kv40(jT, jT2, fq80Var.B());
    }

    public static Pair h(fq80 fq80Var, int i, int i2) throws kq80 {
        vbs0 vbs0Var;
        Pair pairCreate;
        int i3;
        int i4;
        int i5 = fq80Var.b;
        while (i5 - i < i2) {
            fq80Var.M(i5);
            int iM = fq80Var.m();
            obc.N("childAtomSize must be positive", iM > 0);
            if (fq80Var.m() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                Integer numValueOf = null;
                String strX = null;
                while (i6 - i5 < iM) {
                    fq80Var.M(i6);
                    int iM2 = fq80Var.m();
                    int iM3 = fq80Var.m();
                    if (iM3 == 1718775137) {
                        numValueOf = Integer.valueOf(fq80Var.m());
                    } else if (iM3 == 1935894637) {
                        fq80Var.N(4);
                        strX = fq80Var.x(4, StandardCharsets.UTF_8);
                    } else if (iM3 == 1935894633) {
                        i8 = i6;
                        i7 = iM2;
                    }
                    i6 += iM2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strX) || "cbc1".equals(strX) || "cens".equals(strX) || "cbcs".equals(strX)) {
                    obc.N("frma atom is mandatory", numValueOf != null);
                    obc.N("schi atom is mandatory", i8 != -1);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            vbs0Var = null;
                            break;
                        }
                        fq80Var.M(i9);
                        int iM4 = fq80Var.m();
                        if (fq80Var.m() == 1952804451) {
                            int iE = e(fq80Var.m());
                            fq80Var.N(1);
                            if (iE == 0) {
                                fq80Var.N(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int iZ = fq80Var.z();
                                i3 = iZ & 15;
                                i4 = (iZ & 240) >> 4;
                            }
                            boolean z = fq80Var.z() == 1;
                            int iZ2 = fq80Var.z();
                            byte[] bArr2 = new byte[16];
                            fq80Var.k(bArr2, 0, 16);
                            if (z && iZ2 == 0) {
                                int iZ3 = fq80Var.z();
                                byte[] bArr3 = new byte[iZ3];
                                fq80Var.k(bArr3, 0, iZ3);
                                bArr = bArr3;
                            }
                            vbs0Var = new vbs0(z, strX, iZ2, bArr2, i4, i3, bArr);
                            break;
                        }
                        i9 += iM4;
                    }
                    obc.N("tenc atom is mandatory", vbs0Var != null);
                    String str = vtt0.f38024a;
                    pairCreate = Pair.create(numValueOf, vbs0Var);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i5 += iM;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:167:0x0329  */
    public static qo8 i(fq80 fq80Var, gr8 gr8Var, String str, DrmInitData drmInitData, boolean z) throws kq80 {
        DrmInitData drmInitData2;
        String str2;
        int i;
        int i2;
        int i3;
        int i4;
        String str3;
        String str4;
        gr8 gr8Var2;
        int iG;
        String str5;
        int i5;
        int i6;
        int i7;
        byte[] bArrCopyOfRange;
        int i8;
        int i9;
        int iZ;
        int iZ2;
        int i10;
        int i11;
        DrmInitData drmInitDataA;
        String str6;
        rcf0 rcf0VarT;
        long j;
        fq80 fq80Var2 = fq80Var;
        gr8 gr8Var3 = gr8Var;
        String str7 = str;
        int i12 = gr8Var3.f11766a;
        fq80Var2.M(12);
        int iM = fq80Var2.m();
        qo8 qo8Var = new qo8(iM);
        int i13 = 0;
        while (i13 < iM) {
            int i14 = fq80Var2.b;
            int iM2 = fq80Var2.m();
            String str8 = "childAtomSize must be positive";
            obc.N("childAtomSize must be positive", iM2 > 0);
            int iM3 = fq80Var2.m();
            byte b = 3;
            int i15 = 8;
            String str9 = null;
            if (iM3 == 1635148593 || iM3 == 1635148595 || iM3 == 1701733238 || iM3 == 1831958048 || iM3 == 1836070006 || iM3 == 1752589105 || iM3 == 1751479857 || iM3 == 1987470129 || iM3 == 1987471665 || iM3 == 1932670515 || iM3 == 1211250227 || iM3 == 1748121139 || iM3 == 1987063864 || iM3 == 1987063865 || iM3 == 1635135537 || iM3 == 1685479798 || iM3 == 1685479729 || iM3 == 1685481573 || iM3 == 1685481521 || iM3 == 1634760241 || iM3 == 1684108849) {
                fq80Var2.M(i14 + 16);
                fq80Var2.N(16);
                int iG2 = fq80Var2.G();
                int iG3 = fq80Var2.G();
                fq80Var2.N(50);
                int i16 = fq80Var2.b;
                if (iM3 == 1701733238) {
                    Pair pairH = h(fq80Var2, i14, iM2);
                    if (pairH != null) {
                        iM3 = ((Integer) pairH.first).intValue();
                        drmInitDataA = drmInitData == null ? null : drmInitData.a(((vbs0) pairH.second).b);
                        ((vbs0[]) qo8Var.d)[i13] = (vbs0) pairH.second;
                    } else {
                        i14 = i14;
                        drmInitDataA = drmInitData;
                    }
                    fq80Var2.M(i16);
                    drmInitData2 = drmInitDataA;
                } else {
                    i14 = i14;
                    drmInitData2 = drmInitData;
                }
                if (iM3 == 1831958048) {
                    str2 = "video/mpeg";
                } else {
                    str2 = iM3 == 1211250227 ? "video/3gpp" : null;
                }
                DrmInitData drmInitData3 = drmInitData2;
                i = iM;
                int i17 = 8;
                dgu dguVar = null;
                List listT = null;
                String string = null;
                byte[] bArr = null;
                ByteBuffer byteBuffer = null;
                hbb hbbVarA = null;
                br8 br8Var = null;
                dr8 dr8Var = null;
                String str10 = str2;
                float fD = 1.0f;
                int i18 = i16;
                int i19 = -1;
                int i20 = -1;
                int iF = -1;
                boolean z2 = false;
                int i21 = -1;
                int i22 = -1;
                int i23 = -1;
                int i24 = -1;
                i2 = i13;
                i3 = i12;
                int i25 = 8;
                int i26 = -1;
                while (i18 - i14 < iM2) {
                    fq80Var2.M(i18);
                    int i27 = fq80Var2.b;
                    int i28 = i18;
                    int iM4 = fq80Var2.m();
                    if (iM4 == 0 && fq80Var2.b - i14 == iM2) {
                        break;
                    }
                    obc.N(str8, iM4 > 0);
                    int iM5 = fq80Var2.m();
                    int i29 = iM2;
                    if (iM5 == 1635148611) {
                        obc.N(str9, str10 == null);
                        fq80Var2.M(i27 + 8);
                        z95 z95VarA = z95.a(fq80Var2);
                        listT = z95VarA.f44001a;
                        qo8Var.b = z95VarA.b;
                        float f = !z2 ? z95VarA.k : fD;
                        String str11 = z95VarA.l;
                        int i30 = z95VarA.j;
                        iF = z95VarA.g;
                        int i31 = z95VarA.h;
                        int i32 = z95VarA.i;
                        int i33 = z95VarA.e;
                        i5 = z95VarA.f;
                        i6 = iM3;
                        str8 = str8;
                        i22 = i30;
                        i26 = i31;
                        fD = f;
                        iG = i32;
                        i25 = i33;
                        i15 = i15;
                        str5 = "video/avc";
                        string = str11;
                    } else {
                        int i34 = iM3;
                        if (iM5 == 1752589123) {
                            obc.N(null, str10 == null);
                            fq80Var2.M(i27 + 8);
                            xvv xvvVarA = xvv.a(fq80Var2, false, null);
                            listT = xvvVarA.f41581a;
                            qo8Var.b = xvvVarA.b;
                            float f2 = !z2 ? xvvVarA.l : fD;
                            int i35 = xvvVarA.m;
                            int i36 = xvvVarA.c;
                            String str12 = xvvVarA.n;
                            int i37 = xvvVarA.k;
                            if (i37 != -1) {
                                i19 = i37;
                            }
                            int i38 = xvvVarA.d;
                            int i39 = xvvVarA.e;
                            int i40 = xvvVarA.h;
                            int i41 = xvvVarA.i;
                            int i42 = i19;
                            int i43 = xvvVarA.j;
                            int i44 = xvvVarA.f;
                            i5 = xvvVarA.g;
                            str5 = "video/hevc";
                            str8 = str8;
                            i24 = i38;
                            i23 = i39;
                            fD = f2;
                            iF = i40;
                            i26 = i41;
                            i19 = i42;
                            iG = i43;
                            i25 = i44;
                            i6 = i34;
                            i21 = i36;
                            string = str12;
                            i22 = i35;
                            dguVar = xvvVarA.o;
                            i15 = i15;
                        } else {
                            i19 = i19;
                            if (iM5 == 1818785347) {
                                obc.N("lhvC must follow hvcC atom", "video/hevc".equals(str10));
                                obc.N("must have at least two layers", dguVar != null && ((b4x) dguVar.f6058a).size() >= 2);
                                fq80Var2.M(i27 + 8);
                                dguVar.getClass();
                                xvv xvvVarA2 = xvv.a(fq80Var2, true, dguVar);
                                obc.N("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", qo8Var.b == xvvVarA2.b);
                                int i45 = xvvVarA2.h;
                                if (i45 != -1) {
                                    obc.N("colorSpace must be the same for both views", iF == i45);
                                }
                                int i46 = xvvVarA2.i;
                                if (i46 != -1) {
                                    obc.N("colorRange must be the same for both views", i26 == i46);
                                }
                                int i47 = xvvVarA2.j;
                                if (i47 != -1) {
                                    obc.N("colorTransfer must be the same for both views", i20 == i47);
                                }
                                obc.N("bitdepthLuma must be the same for both views", i25 == xvvVarA2.f);
                                obc.N("bitdepthChroma must be the same for both views", i17 == xvvVarA2.g);
                                if (listT != null) {
                                    u3x u3xVarL = b4x.l();
                                    u3xVarL.c(listT);
                                    u3xVarL.c(xvvVarA2.f41581a);
                                    listT = u3xVarL.g();
                                } else {
                                    obc.N("initializationData must be already set from hvcC atom", false);
                                }
                                string = xvvVarA2.n;
                                str5 = "video/mv-hevc";
                                iG = i20;
                                i5 = i17;
                            } else {
                                if (iM5 == 1987470147) {
                                    obc.N(null, str10 == null);
                                    fq80Var2.M(i27 + 8);
                                    try {
                                        if (fq80Var2.m() != 0) {
                                            throw kq80.a("Unsupported VVC version", null);
                                        }
                                        int iZ3 = fq80Var2.z();
                                        int i48 = (iZ3 >> 1) & 3;
                                        boolean z3 = (iZ3 & 1) != 0;
                                        int i49 = i48 + 1;
                                        String str13 = TokenNames.L;
                                        if (z3) {
                                            fq80Var2.N(1);
                                            int iZ4 = (fq80Var2.z() >> 4) & 7;
                                            iZ = (fq80Var2.z() >> 5) & 7;
                                            int iZ5 = fq80Var2.z() & 63;
                                            int iZ6 = fq80Var2.z();
                                            i10 = (iZ6 >> 1) & 127;
                                            if ((iZ6 & 1) != 0) {
                                                str13 = "H";
                                            }
                                            iZ2 = fq80Var2.z();
                                            fq80Var2.N(iZ5);
                                            int i50 = 1;
                                            if (iZ4 > 1) {
                                                int iZ7 = fq80Var2.z();
                                                int i51 = 0;
                                                while (true) {
                                                    int i52 = i50;
                                                    if (i51 >= iZ4 - 1) {
                                                        break;
                                                    }
                                                    if (((iZ7 >> (7 - i51)) & 1) != 0) {
                                                        fq80Var2.N(i52);
                                                    }
                                                    i51++;
                                                    i50 = 1;
                                                }
                                            }
                                            fq80Var2.N(fq80Var2.z() * 4);
                                            fq80Var2.N(6);
                                        } else {
                                            iZ = 0;
                                            iZ2 = 0;
                                            i10 = 0;
                                        }
                                        int iZ8 = fq80Var2.z();
                                        int i53 = fq80Var2.b;
                                        int i54 = iZ;
                                        int i55 = 0;
                                        int i56 = 0;
                                        while (true) {
                                            i11 = 13;
                                            if (i56 >= iZ8) {
                                                break;
                                            }
                                            int i57 = i56;
                                            int iZ9 = fq80Var2.z() & 31;
                                            int iG4 = (iZ9 == 13 || iZ9 == 12) ? 1 : fq80Var2.G();
                                            int i58 = 0;
                                            while (i58 < iG4) {
                                                int i59 = i55;
                                                int iG5 = fq80Var2.G();
                                                fq80Var2.N(iG5);
                                                i58++;
                                                i55 = iG5 + 4 + i59;
                                            }
                                            i56 = i57 + 1;
                                        }
                                        fq80Var2.M(i53);
                                        byte[] bArr2 = new byte[i55];
                                        int i60 = 0;
                                        int i61 = 0;
                                        while (i60 < iZ8) {
                                            int i62 = iZ8;
                                            int iZ10 = fq80Var2.z() & 31;
                                            int iG6 = (iZ10 == i11 || iZ10 == 12) ? 1 : fq80Var2.G();
                                            int i63 = 0;
                                            while (i63 < iG6) {
                                                int i64 = iG6;
                                                int iG7 = fq80Var2.G();
                                                System.arraycopy(ntr.j, 0, bArr2, i61, 4);
                                                int i65 = i61 + 4;
                                                fq80Var2.k(bArr2, i65, iG7);
                                                i61 = i65 + iG7;
                                                i63++;
                                                iG6 = i64;
                                                i60 = i60;
                                                i20 = i20;
                                            }
                                            i60++;
                                            iZ8 = i62;
                                            i11 = 13;
                                        }
                                        iG = i20;
                                        Locale locale = Locale.US;
                                        String str14 = "vvc1." + i10 + Separators.DOT + str13 + iZ2;
                                        listT = b4x.t(bArr2);
                                        i25 = i54 + 8;
                                        qo8Var.b = i49;
                                        string = str14;
                                        str5 = "video/vvc";
                                        i5 = i25;
                                        i22 = 16;
                                    } catch (ArrayIndexOutOfBoundsException e) {
                                        throw kq80.a("Error parsing VVC configuration", e);
                                    }
                                } else {
                                    iG = i20;
                                    i26 = i26;
                                    if (iM5 == 1986361461) {
                                        fq80Var2.M(i27 + 8);
                                        int i66 = fq80Var2.b;
                                        fvt0 fvt0Var = null;
                                        while (i66 - i27 < iM4) {
                                            fq80Var2.M(i66);
                                            int iM6 = fq80Var2.m();
                                            obc.N(str8, iM6 > 0);
                                            if (fq80Var2.m() == 1702454643) {
                                                fq80Var2.M(i66 + 8);
                                                int i67 = fq80Var2.b;
                                                while (true) {
                                                    if (i67 - i66 >= iM6) {
                                                        fvt0Var = null;
                                                        break;
                                                    }
                                                    fq80Var2.M(i67);
                                                    int iM7 = fq80Var2.m();
                                                    obc.N(str8, iM7 > 0);
                                                    if (fq80Var2.m() == 1937011305) {
                                                        fq80Var2.N(4);
                                                        int iZ11 = fq80Var2.z();
                                                        fvt0Var = new fvt0(new c34((iZ11 & 1) == 1, (iZ11 & 2) == 2, (iZ11 & 8) == i15));
                                                        break;
                                                    }
                                                    i67 += iM7;
                                                    i15 = 8;
                                                }
                                            }
                                            i66 += iM6;
                                            i15 = 8;
                                        }
                                        bbw0 bbw0Var = fvt0Var == null ? null : new bbw0(fvt0Var, (byte) 15);
                                        if (bbw0Var != null) {
                                            c34 c34Var = (c34) ((fvt0) bbw0Var.b).f10231a;
                                            boolean z4 = c34Var.c;
                                            if (dguVar == null || ((b4x) dguVar.f6058a).size() < 2) {
                                                i19 = i19;
                                                if (i19 == -1) {
                                                    i19 = z4 ? 5 : 4;
                                                }
                                            } else {
                                                obc.N("both eye views must be marked as available", c34Var.f3655a && c34Var.b);
                                                obc.N("for MV-HEVC, eye_views_reversed must be set to false", !z4);
                                                i19 = i19;
                                            }
                                        } else {
                                            i19 = i19;
                                        }
                                        str8 = str8;
                                        str5 = str10;
                                        i5 = i17;
                                        i6 = i34;
                                    } else {
                                        i19 = i19;
                                        if (iM5 == 1685480259 || iM5 == 1685485123 || iM5 == 1685485379) {
                                            str8 = str8;
                                            str5 = str10;
                                            i25 = i25;
                                            dguVar = dguVar;
                                            i5 = i17;
                                            i6 = i34;
                                            i15 = 8;
                                            iG = iG;
                                            hbbVarA = hbb.a(fq80Var2);
                                        } else if (iM5 == 1987076931) {
                                            obc.N(null, str10 == null);
                                            String str15 = i34 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                            fq80Var2.M(i27 + 12);
                                            byte bZ = (byte) fq80Var2.z();
                                            byte bZ2 = (byte) fq80Var2.z();
                                            int iZ12 = fq80Var2.z();
                                            int i68 = iZ12 >> 4;
                                            byte b2 = (byte) ((iZ12 >> 1) & 7);
                                            if (str15.equals("video/x-vnd.on2.vp9")) {
                                                byte[] bArr3 = jyc.f17352a;
                                                byte[] bArr4 = new byte[12];
                                                bArr4[0] = 1;
                                                bArr4[1] = 1;
                                                bArr4[2] = bZ;
                                                bArr4[b] = 2;
                                                bArr4[4] = 1;
                                                bArr4[5] = bZ2;
                                                bArr4[6] = b;
                                                bArr4[7] = 1;
                                                bArr4[8] = (byte) i68;
                                                bArr4[9] = 4;
                                                bArr4[10] = 1;
                                                bArr4[11] = b2;
                                                listT = b4x.t(bArr4);
                                            }
                                            boolean z5 = (iZ12 & 1) != 0;
                                            int iZ13 = fq80Var2.z();
                                            int iZ14 = fq80Var2.z();
                                            iF = c4d.f(iZ13);
                                            int i69 = z5 ? 1 : 2;
                                            iG = c4d.g(iZ14);
                                            i6 = i34;
                                            str8 = str8;
                                            str5 = str15;
                                            i25 = i68;
                                            i5 = i25;
                                            i26 = i69;
                                        } else {
                                            i6 = i34;
                                            int i70 = 11;
                                            if (iM5 == 1635135811) {
                                                int i71 = iM4 - 8;
                                                byte[] bArr5 = new byte[i71];
                                                fq80Var2.k(bArr5, 0, i71);
                                                listT = b4x.t(bArr5);
                                                z55 z55VarH = z55.h(bArr5);
                                                if (z55VarH != null) {
                                                    i25 = z55VarH.b;
                                                    iF = z55VarH.c;
                                                    i8 = z55VarH.d;
                                                    i9 = z55VarH.e;
                                                    string = (String) z55VarH.f;
                                                    i17 = i25;
                                                } else {
                                                    i8 = i26;
                                                    i9 = iG;
                                                }
                                                str5 = "video/av01";
                                                i26 = i8;
                                                iG = i9;
                                            } else if (iM5 == 1668050025) {
                                                ByteBuffer byteBufferOrder = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                                byteBufferOrder.position(21);
                                                byteBufferOrder.putShort(fq80Var2.w());
                                                byteBufferOrder.putShort(fq80Var2.w());
                                                byteBuffer = byteBufferOrder;
                                                str5 = str10;
                                            } else {
                                                if (iM5 == 1835295606) {
                                                    ByteBuffer byteBufferOrder2 = byteBuffer == null ? ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN) : byteBuffer;
                                                    short sW = fq80Var2.w();
                                                    short sW2 = fq80Var2.w();
                                                    short sW3 = fq80Var2.w();
                                                    i6 = i6;
                                                    short sW4 = fq80Var2.w();
                                                    str8 = str8;
                                                    short sW5 = fq80Var2.w();
                                                    str5 = str10;
                                                    short sW6 = fq80Var2.w();
                                                    i25 = i25;
                                                    short sW7 = fq80Var2.w();
                                                    dguVar = dguVar;
                                                    short sW8 = fq80Var2.w();
                                                    long jB = fq80Var2.B();
                                                    long jB2 = fq80Var2.B();
                                                    i5 = i17;
                                                    byteBufferOrder2.position(1);
                                                    byteBufferOrder2.putShort(sW5);
                                                    byteBufferOrder2.putShort(sW6);
                                                    byteBufferOrder2.putShort(sW);
                                                    byteBufferOrder2.putShort(sW2);
                                                    byteBufferOrder2.putShort(sW3);
                                                    byteBufferOrder2.putShort(sW4);
                                                    byteBufferOrder2.putShort(sW7);
                                                    byteBufferOrder2.putShort(sW8);
                                                    byteBufferOrder2.putShort((short) (jB / 10000));
                                                    byteBufferOrder2.putShort((short) (jB2 / 10000));
                                                    byteBuffer = byteBufferOrder2;
                                                } else {
                                                    i6 = i6;
                                                    str8 = str8;
                                                    str5 = str10;
                                                    i25 = i25;
                                                    dguVar = dguVar;
                                                    i5 = i17;
                                                    if (iM5 == 1681012275) {
                                                        obc.N(null, str5 == null);
                                                        str5 = "video/3gpp";
                                                    } else {
                                                        if (iM5 == 1702061171) {
                                                            obc.N(null, str5 == null);
                                                            dr8 dr8VarC = c(i27, fq80Var2);
                                                            String str16 = (String) dr8VarC.c;
                                                            byte[] bArr6 = (byte[]) dr8VarC.d;
                                                            if (bArr6 != null) {
                                                                listT = b4x.t(bArr6);
                                                            }
                                                            dr8Var = dr8VarC;
                                                            str5 = str16;
                                                        } else if (iM5 == 1651798644) {
                                                            fq80Var2.M(i27 + 8);
                                                            fq80Var2.N(4);
                                                            br8Var = new br8((byte) 0, fq80Var2.B(), fq80Var2.B());
                                                            i15 = 8;
                                                        } else if (iM5 == 1885434736) {
                                                            fq80Var2.M(i27 + 8);
                                                            fD = fq80Var2.D() / fq80Var2.D();
                                                            i25 = i25;
                                                            dguVar = dguVar;
                                                            i15 = 8;
                                                            z2 = true;
                                                        } else if (iM5 == 1937126244) {
                                                            int i72 = i27 + 8;
                                                            while (true) {
                                                                if (i72 - i27 >= iM4) {
                                                                    bArrCopyOfRange = null;
                                                                    break;
                                                                }
                                                                fq80Var2.M(i72);
                                                                int iM8 = fq80Var2.m();
                                                                if (fq80Var2.m() == 1886547818) {
                                                                    bArrCopyOfRange = Arrays.copyOfRange(fq80Var2.f9961a, i72, iM8 + i72);
                                                                    break;
                                                                }
                                                                i72 += iM8;
                                                            }
                                                            bArr = bArrCopyOfRange;
                                                        } else if (iM5 == 1936995172) {
                                                            int iZ15 = fq80Var2.z();
                                                            byte b3 = b;
                                                            fq80Var2.N(b3);
                                                            if (iZ15 == 0) {
                                                                int iZ16 = fq80Var2.z();
                                                                if (iZ16 == 0) {
                                                                    i19 = 0;
                                                                } else if (iZ16 == 1) {
                                                                    i19 = 1;
                                                                } else if (iZ16 == 2) {
                                                                    i19 = 2;
                                                                } else if (iZ16 == b3) {
                                                                    i19 = b3;
                                                                }
                                                            }
                                                        } else if (iM5 == 1634760259) {
                                                            int i73 = iM4 - 12;
                                                            byte[] bArr7 = new byte[i73];
                                                            fq80Var2.M(i27 + 12);
                                                            fq80Var2.k(bArr7, 0, i73);
                                                            byte[] bArr8 = jyc.f17352a;
                                                            x0x.w("Invalid APV CSD length: %s", i73, i73 >= 17);
                                                            byte b4 = bArr7[0];
                                                            x0x.w("Invalid APV CSD version: %s", b4, b4 == 1);
                                                            int i74 = bArr7[5] & 255;
                                                            int i75 = bArr7[6] & 255;
                                                            int i76 = bArr7[7] & 255;
                                                            String str17 = vtt0.f38024a;
                                                            Locale locale2 = Locale.US;
                                                            StringBuilder sbT = dw9.t("apv1.apvf", i74, ".apvl", ".apvb", i75);
                                                            sbT.append(i76);
                                                            string = sbT.toString();
                                                            listT = b4x.t(bArr7);
                                                            fq80 fq80Var3 = new fq80(bArr7);
                                                            q8b q8bVar = new q8b(bArr7, i73);
                                                            i15 = 8;
                                                            q8bVar.m(fq80Var3.b * 8);
                                                            q8bVar.p(1);
                                                            int iG8 = q8bVar.g(8);
                                                            int i77 = -1;
                                                            int i78 = 0;
                                                            int i79 = -1;
                                                            int i80 = -1;
                                                            int i81 = -1;
                                                            int i82 = -1;
                                                            while (i78 < iG8) {
                                                                q8bVar.p(1);
                                                                int iG9 = q8bVar.g(8);
                                                                int iG10 = i82;
                                                                int i83 = i81;
                                                                int i84 = i80;
                                                                int i85 = i79;
                                                                int iG11 = i77;
                                                                int i86 = 0;
                                                                while (i86 < iG9) {
                                                                    q8bVar.o(6);
                                                                    boolean zF = q8bVar.f();
                                                                    q8bVar.n();
                                                                    q8bVar.p(i70);
                                                                    q8bVar.o(4);
                                                                    iG10 = q8bVar.g(4) + 8;
                                                                    q8bVar.p(1);
                                                                    if (zF) {
                                                                        int iG12 = q8bVar.g(8);
                                                                        int iG13 = q8bVar.g(8);
                                                                        q8bVar.p(1);
                                                                        boolean zF2 = q8bVar.f();
                                                                        int iF2 = c4d.f(iG12);
                                                                        i83 = zF2 ? 1 : 2;
                                                                        i84 = iF2;
                                                                        iG11 = c4d.g(iG13);
                                                                    }
                                                                    i86++;
                                                                    i85 = iG10;
                                                                    i70 = 11;
                                                                }
                                                                i78++;
                                                                i77 = iG11;
                                                                i79 = i85;
                                                                i80 = i84;
                                                                i81 = i83;
                                                                i82 = iG10;
                                                                i70 = 11;
                                                            }
                                                            str5 = "video/apv";
                                                            iG = i77;
                                                            i25 = i79;
                                                            iF = i80;
                                                            i26 = i81;
                                                            i5 = i82;
                                                            dguVar = dguVar;
                                                        } else {
                                                            i15 = 8;
                                                            if (iM5 == 1668246642) {
                                                                i7 = iG;
                                                                if (iF == -1 && i7 == -1) {
                                                                    int iM9 = fq80Var2.m();
                                                                    if (iM9 == 1852009592 || iM9 == 1852009571) {
                                                                        int iG14 = fq80Var2.G();
                                                                        int iG15 = fq80Var2.G();
                                                                        fq80Var2.N(2);
                                                                        boolean z6 = iM4 == 19 && (fq80Var2.z() & 128) != 0;
                                                                        int iF3 = c4d.f(iG14);
                                                                        int i87 = z6 ? 1 : 2;
                                                                        iG = c4d.g(iG15);
                                                                        i26 = i87;
                                                                        i25 = i25;
                                                                        dguVar = dguVar;
                                                                        iF = iF3;
                                                                    } else {
                                                                        f1t0.g0("BoxParsers", "Unsupported color type: ".concat(syx.k(iM9)));
                                                                    }
                                                                }
                                                            } else {
                                                                i7 = iG;
                                                            }
                                                            iG = i7;
                                                        }
                                                        i15 = 8;
                                                    }
                                                }
                                                i25 = i25;
                                                dguVar = dguVar;
                                            }
                                            i5 = i17;
                                        }
                                        i25 = i25;
                                        dguVar = dguVar;
                                    }
                                    i15 = 8;
                                }
                            }
                            i6 = i34;
                        }
                    }
                    i18 = i28 + iM4;
                    i15 = i15;
                    iM2 = i29;
                    iM3 = i6;
                    i26 = i26;
                    i20 = iG;
                    str8 = str8;
                    str10 = str5;
                    i17 = i5;
                    b = 3;
                    str9 = null;
                }
                i4 = iM2;
                int i88 = i20;
                String str18 = str10;
                int i89 = i25;
                int i90 = i26;
                int i91 = i17;
                if (hbbVarA != null) {
                    str3 = hbbVarA.b;
                    str4 = "video/dolby-vision";
                } else {
                    str3 = string;
                    str4 = str18;
                }
                if (str4 == null) {
                    gr8Var2 = gr8Var;
                    str7 = str;
                } else {
                    awq awqVar = new awq();
                    awqVar.f1587a = Integer.toString(i3);
                    awqVar.o = mg40.n(str4);
                    awqVar.k = str3;
                    awqVar.v = iG2;
                    awqVar.w = iG3;
                    awqVar.y = i24;
                    awqVar.z = i23;
                    awqVar.D = fD;
                    gr8Var2 = gr8Var;
                    awqVar.B = gr8Var2.c;
                    awqVar.C = gr8Var2.d;
                    awqVar.E = bArr;
                    awqVar.F = i19;
                    awqVar.r = listT;
                    awqVar.q = i22;
                    awqVar.H = i21;
                    awqVar.s = drmInitData3;
                    str7 = str;
                    awqVar.d = str7;
                    awqVar.G = new c4d(iF, i90, i88, byteBuffer != null ? byteBuffer.array() : null, i89, i91);
                    br8 br8Var2 = br8Var;
                    if (br8Var2 != null) {
                        awqVar.i = n6x.Y(br8Var2.b);
                        awqVar.j = n6x.Y(br8Var2.c);
                    } else {
                        dr8 dr8Var2 = dr8Var;
                        if (dr8Var2 != null) {
                            awqVar.i = n6x.Y(dr8Var2.f6545a);
                            awqVar.j = n6x.Y(dr8Var2.b);
                        }
                    }
                    qo8Var.e = new androidx.media3.common.b(awqVar);
                }
            } else {
                if (iM3 == 1836069985 || iM3 == 1701733217 || iM3 == 1633889587 || iM3 == 1700998451 || iM3 == 1633889588 || iM3 == 1835823201 || iM3 == 1685353315 || iM3 == 1685353317 || iM3 == 1685353320 || iM3 == 1685353324 || iM3 == 1685353336 || iM3 == 1935764850 || iM3 == 1935767394 || iM3 == 1819304813 || iM3 == 1936684916 || iM3 == 1953984371 || iM3 == 778924082 || iM3 == 778924083 || iM3 == 1835557169 || iM3 == 1835560241 || iM3 == 1634492771 || iM3 == 1634492791 || iM3 == 1970037111 || iM3 == 1332770163 || iM3 == 1716281667 || iM3 == 1767992678 || iM3 == 1768973165 || iM3 == 1718641517) {
                    fq80Var2 = fq80Var;
                    i14 = i14;
                    iM2 = iM2;
                    b(fq80Var2, iM3, i14, iM2, gr8Var3.f11766a, str7, z, drmInitData, qo8Var, i13);
                    str7 = str;
                } else if (iM3 == 1414810956 || iM3 == 1954034535 || iM3 == 2004251764 || iM3 == 1937010800 || iM3 == 1664495672 || iM3 == 1836070003 || iM3 == 1952807028) {
                    fq80Var2.M(i14 + 16);
                    String str19 = "application/ttml+xml";
                    long j2 = Long.MAX_VALUE;
                    if (iM3 != 1414810956) {
                        if (iM3 == 1954034535) {
                            int i92 = iM2 - 16;
                            byte[] bArr9 = new byte[i92];
                            fq80Var2.k(bArr9, 0, i92);
                            rcf0VarT = b4x.t(bArr9);
                            str19 = "application/x-quicktime-tx3g";
                            i14 = i14;
                            iM2 = iM2;
                        } else {
                            if (iM3 == 2004251764) {
                                str19 = "application/x-mp4-vtt";
                            } else if (iM3 == 1937010800) {
                                j2 = 0;
                            } else if (iM3 == 1664495672) {
                                qo8Var.c = true;
                                str19 = "application/x-mp4-cea-608";
                            } else if (iM3 == 1836070003) {
                                int i93 = fq80Var2.b;
                                fq80Var2.N(4);
                                if (fq80Var2.m() == 1702061171) {
                                    byte[] bArr10 = (byte[]) c(i93, fq80Var2).d;
                                    if (bArr10 == null || bArr10.length != 64) {
                                        i14 = i14;
                                        iM2 = iM2;
                                    } else {
                                        int i94 = gr8Var3.e;
                                        int i95 = gr8Var3.f;
                                        x0x.K(bArr10.length == 64);
                                        ArrayList arrayList = new ArrayList(16);
                                        int i96 = 0;
                                        while (i96 < bArr10.length - 3) {
                                            byte[] bArr11 = bArr10;
                                            int iA = n6x.A(bArr10[i96], bArr10[i96 + 1], bArr10[i96 + 2], bArr11[i96 + 3]);
                                            int i97 = (iA >> 16) & 255;
                                            int i98 = ((iA >> 8) & 255) - 128;
                                            int i99 = (iA & 255) - 128;
                                            arrayList.add(String.format("%06x", Integer.valueOf(vtt0.i(ua80.a(i99, 17790, HwBuildEx.VersionCodes.CUR_DEVELOPMENT, i97), 0, 255) | (vtt0.i((i97 - ((i99 * 3455) / HwBuildEx.VersionCodes.CUR_DEVELOPMENT)) - ((i98 * 7169) / HwBuildEx.VersionCodes.CUR_DEVELOPMENT), 0, 255) << 8) | (vtt0.i(ua80.a(i98, 14075, HwBuildEx.VersionCodes.CUR_DEVELOPMENT, i97), 0, 255) << 16))));
                                            i96 += 4;
                                            bArr10 = bArr11;
                                            i14 = i14;
                                            iM2 = iM2;
                                        }
                                        i14 = i14;
                                        iM2 = iM2;
                                        StringBuilder sbT2 = dw9.t("size: ", i94, "x", "\npalette: ", i95);
                                        sbT2.append(new pfw(", ").b(arrayList));
                                        sbT2.append(Separators.RETURN);
                                        String string2 = sbT2.toString();
                                        String str20 = vtt0.f38024a;
                                        rcf0VarT = b4x.t(string2.getBytes(StandardCharsets.UTF_8));
                                        str6 = "application/vobsub";
                                    }
                                } else {
                                    i14 = i14;
                                    iM2 = iM2;
                                    str6 = null;
                                    rcf0VarT = null;
                                }
                                str19 = str6;
                            } else {
                                if (iM3 != 1952807028) {
                                    v4i0.e();
                                    return null;
                                }
                                str19 = "text/x-unknown";
                                rcf0VarT = null;
                            }
                            rcf0VarT = null;
                        }
                        j = j2;
                        if (str19 != null) {
                            awq awqVar2 = new awq();
                            awqVar2.f1587a = Integer.toString(i12);
                            awqVar2.o = mg40.n(str19);
                            awqVar2.d = str7;
                            awqVar2.t = j;
                            awqVar2.r = rcf0VarT;
                            qo8Var.e = new androidx.media3.common.b(awqVar2);
                        }
                    } else {
                        rcf0VarT = null;
                        j = j2;
                        if (str19 != null) {
                            awq awqVar3 = new awq();
                            awqVar3.f1587a = Integer.toString(i12);
                            awqVar3.o = mg40.n(str19);
                            awqVar3.d = str7;
                            awqVar3.t = j;
                            awqVar3.r = rcf0VarT;
                            qo8Var.e = new androidx.media3.common.b(awqVar3);
                        }
                    }
                    fq80Var2 = fq80Var;
                    i2 = i13;
                    gr8Var2 = gr8Var3;
                    i = iM;
                    i14 = i14;
                    i4 = iM2;
                    i3 = i12;
                } else if (iM3 == 1835365492 || iM3 == 1769222965) {
                    fq80Var2.M(i14 + 16);
                    if (iM3 == 1835365492) {
                        fq80Var2.u();
                        String strU = fq80Var2.u();
                        if (strU != null) {
                            awq awqVar4 = new awq();
                            awqVar4.f1587a = Integer.toString(i12);
                            awqVar4.o = mg40.n(strU);
                            qo8Var.e = new androidx.media3.common.b(awqVar4);
                        }
                    } else if (iM3 == 1769222965) {
                        int iZ17 = fq80Var2.z();
                        byte[] bArr12 = new byte[iZ17];
                        fq80Var2.k(bArr12, 0, iZ17);
                        awq awqVar5 = new awq();
                        awqVar5.f1587a = Integer.toString(i12);
                        awqVar5.o = mg40.n("application/x-itut-t35");
                        awqVar5.r = b4x.t(bArr12);
                        qo8Var.e = new androidx.media3.common.b(awqVar5);
                    }
                } else if (iM3 == 1667329389) {
                    awq awqVar6 = new awq();
                    awqVar6.f1587a = Integer.toString(i12);
                    awqVar6.o = mg40.n("application/x-camera-motion");
                    qo8Var.e = new androidx.media3.common.b(awqVar6);
                }
                i14 = i14;
                i4 = iM2;
                i2 = i13;
                gr8Var2 = gr8Var3;
                i3 = i12;
                i = iM;
            }
            fq80Var2.M(i14 + i4);
            i13 = i2 + 1;
            gr8Var3 = gr8Var2;
            i12 = i3;
            iM = i;
        }
        return qo8Var;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:103:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:108:0x020a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0216 A[LOOP:18: B:98:0x01e6->B:109:0x0216, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x0256  */
    /* JADX WARN: Code duplicated, block: B:123:0x0278  */
    /* JADX WARN: Code duplicated, block: B:125:0x0287  */
    /* JADX WARN: Code duplicated, block: B:132:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:199:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:203:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:204:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:206:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:208:0x0408  */
    /* JADX WARN: Code duplicated, block: B:209:0x0412  */
    /* JADX WARN: Code duplicated, block: B:265:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:268:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:269:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:271:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:274:0x05e0 A[LOOP:1: B:272:0x05da->B:274:0x05e0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:277:0x05f8 A[LOOP:2: B:276:0x05f6->B:277:0x05f8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:280:0x0615  */
    /* JADX WARN: Code duplicated, block: B:282:0x0629 A[LOOP:4: B:281:0x0627->B:282:0x0629, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:286:0x0672  */
    /* JADX WARN: Code duplicated, block: B:288:0x0676  */
    /* JADX WARN: Code duplicated, block: B:290:0x067a  */
    /* JADX WARN: Code duplicated, block: B:292:0x067e  */
    /* JADX WARN: Code duplicated, block: B:295:0x0690  */
    /* JADX WARN: Code duplicated, block: B:297:0x0693  */
    /* JADX WARN: Code duplicated, block: B:298:0x0696  */
    /* JADX WARN: Code duplicated, block: B:301:0x069c  */
    /* JADX WARN: Code duplicated, block: B:302:0x069f  */
    /* JADX WARN: Code duplicated, block: B:305:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:306:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:309:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:310:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:313:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:315:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:317:0x06d8 A[LOOP:14: B:314:0x06d0->B:317:0x06d8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:322:0x06fe  */
    /* JADX WARN: Code duplicated, block: B:324:0x0716  */
    /* JADX WARN: Code duplicated, block: B:325:0x071b  */
    /* JADX WARN: Code duplicated, block: B:327:0x071f A[ADDED_TO_REGION, LOOP:15: B:327:0x071f->B:329:0x0723, LOOP_START, PHI: r10 r30 r31
  0x071f: PHI (r10v18 int) = (r10v16 int), (r10v19 int) binds: [B:326:0x071d, B:329:0x0723] A[DONT_GENERATE, DONT_INLINE]
  0x071f: PHI (r30v5 int) = (r30v1 int), (r30v6 int) binds: [B:326:0x071d, B:329:0x0723] A[DONT_GENERATE, DONT_INLINE]
  0x071f: PHI (r31v11 int) = (r31v9 int), (r31v13 int) binds: [B:326:0x071d, B:329:0x0723] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:333:0x073c  */
    /* JADX WARN: Code duplicated, block: B:335:0x073f  */
    /* JADX WARN: Code duplicated, block: B:337:0x074c  */
    /* JADX WARN: Code duplicated, block: B:338:0x074e  */
    /* JADX WARN: Code duplicated, block: B:341:0x0753  */
    /* JADX WARN: Code duplicated, block: B:342:0x075f  */
    /* JADX WARN: Code duplicated, block: B:356:0x07b2 A[DONT_INVERT, LOOP:16: B:356:0x07b2->B:360:0x07bc, LOOP_START, PHI: r30
  0x07b2: PHI (r30v2 int) = (r30v1 int), (r30v3 int) binds: [B:355:0x07b0, B:360:0x07bc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:357:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:360:0x07bc A[LOOP:16: B:356:0x07b2->B:360:0x07bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:361:0x07c2 A[EDGE_INSN: B:361:0x07c2->B:362:0x07c3 BREAK  A[LOOP:16: B:356:0x07b2->B:360:0x07bc]] */
    /* JADX WARN: Code duplicated, block: B:370:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:372:0x0803  */
    /* JADX WARN: Code duplicated, block: B:373:0x0806  */
    /* JADX WARN: Code duplicated, block: B:378:0x0827  */
    /* JADX WARN: Code duplicated, block: B:385:0x086f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:386:0x0871  */
    /* JADX WARN: Code duplicated, block: B:389:0x0883  */
    /* JADX WARN: Code duplicated, block: B:391:0x088b  */
    /* JADX WARN: Code duplicated, block: B:397:0x08ae  */
    /* JADX WARN: Code duplicated, block: B:399:0x08b3  */
    /* JADX WARN: Code duplicated, block: B:401:0x08bb  */
    /* JADX WARN: Code duplicated, block: B:405:0x08d8  */
    /* JADX WARN: Code duplicated, block: B:429:0x098e  */
    /* JADX WARN: Code duplicated, block: B:431:0x0994  */
    /* JADX WARN: Code duplicated, block: B:433:0x099f  */
    /* JADX WARN: Code duplicated, block: B:436:0x09aa A[LOOP:6: B:434:0x09a7->B:436:0x09aa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:438:0x09da  */
    /* JADX WARN: Code duplicated, block: B:441:0x09e6  */
    /* JADX WARN: Code duplicated, block: B:442:0x09e8  */
    /* JADX WARN: Code duplicated, block: B:445:0x09f8  */
    /* JADX WARN: Code duplicated, block: B:447:0x0a04  */
    /* JADX WARN: Code duplicated, block: B:450:0x0a32  */
    /* JADX WARN: Code duplicated, block: B:452:0x0a38  */
    /* JADX WARN: Code duplicated, block: B:453:0x0a3a  */
    /* JADX WARN: Code duplicated, block: B:460:0x0a4e  */
    /* JADX WARN: Code duplicated, block: B:466:0x0a61  */
    /* JADX WARN: Code duplicated, block: B:471:0x0a6f  */
    /* JADX WARN: Code duplicated, block: B:476:0x0a85  */
    /* JADX WARN: Code duplicated, block: B:477:0x0a87  */
    /* JADX WARN: Code duplicated, block: B:479:0x0a8f  */
    /* JADX WARN: Code duplicated, block: B:483:0x0ab1  */
    /* JADX WARN: Code duplicated, block: B:484:0x0ab3  */
    /* JADX WARN: Code duplicated, block: B:487:0x0ab9  */
    /* JADX WARN: Code duplicated, block: B:488:0x0abc  */
    /* JADX WARN: Code duplicated, block: B:490:0x0abf  */
    /* JADX WARN: Code duplicated, block: B:491:0x0ac2  */
    /* JADX WARN: Code duplicated, block: B:493:0x0ac6  */
    /* JADX WARN: Code duplicated, block: B:495:0x0aca  */
    /* JADX WARN: Code duplicated, block: B:496:0x0acd  */
    /* JADX WARN: Code duplicated, block: B:498:0x0ad1  */
    /* JADX WARN: Code duplicated, block: B:499:0x0ad7  */
    /* JADX WARN: Code duplicated, block: B:502:0x0ae3  */
    /* JADX WARN: Code duplicated, block: B:504:0x0af1  */
    /* JADX WARN: Code duplicated, block: B:505:0x0b05  */
    /* JADX WARN: Code duplicated, block: B:508:0x0b0f  */
    /* JADX WARN: Code duplicated, block: B:510:0x0b39  */
    /* JADX WARN: Code duplicated, block: B:513:0x0b40  */
    /* JADX WARN: Code duplicated, block: B:517:0x0b48 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:525:0x0b8b  */
    /* JADX WARN: Code duplicated, block: B:526:0x0ba5  */
    /* JADX WARN: Code duplicated, block: B:548:0x08c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:0x0a44 A[EDGE_INSN: B:554:0x0a44->B:457:0x0a44 BREAK  A[LOOP:8: B:448:0x0a2f->B:456:0x0a41], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x0a41 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:0x0a5b A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:559:0x0a7c A[ADDED_TO_REGION, EDGE_INSN: B:559:0x0a7c->B:474:0x0a7c BREAK  A[LOOP:10: B:469:0x0a69->B:473:0x0a75], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:0x0b59 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:567:0x079c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:568:0x06f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:0x06ed A[EDGE_INSN: B:573:0x06ed->B:318:0x06ed BREAK  A[LOOP:14: B:314:0x06d0->B:317:0x06d8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:0x07c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:0x07ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:580:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:581:0x01f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:582:0x026a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x016a  */
    /* JADX WARN: Code duplicated, block: B:79:0x016d  */
    /* JADX WARN: Code duplicated, block: B:82:0x017a  */
    /* JADX WARN: Code duplicated, block: B:83:0x017d  */
    /* JADX WARN: Code duplicated, block: B:86:0x018b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0192  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:95:0x01de  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e8  */
    public static ArrayList j(ev40 ev40Var, met metVar, long j, DrmInitData drmInitData, boolean z, boolean z2, tdr tdrVar, boolean z3) {
        int i;
        int i2;
        long j2;
        long jT;
        long jB;
        int i3;
        int i4;
        boolean z4;
        gr8 gr8Var;
        long j3;
        long j4;
        long jT2;
        long j5;
        fq80 fq80Var;
        int iE;
        int i5;
        long jB2;
        int i6;
        int i7;
        ArrayList arrayList;
        int i8;
        long j6;
        ArrayList arrayList2;
        int i9;
        char[] cArr;
        int i10;
        String str;
        fv40 fv40VarW;
        qo8 qo8VarI;
        ev40 ev40VarV;
        int iM;
        c4x c4xVar;
        c4x c4xVar2;
        androidx.media3.common.b bVar;
        int i11;
        lbs0 lbs0Var;
        dv40 dv40Var;
        ed40 ed40Var;
        ed40 ed40Var2;
        ev40 ev40VarV2;
        Pair pairCreate;
        fv40 fv40VarW2;
        char c;
        int i12;
        int i13;
        int i14;
        long jF;
        er8 fr8Var;
        boolean z5;
        int iD;
        int iD2;
        int iD3;
        int iK;
        boolean z6;
        ArrayList arrayList3;
        boolean z7;
        long[] jArr;
        fq80 fq80Var2;
        int[] iArrCopyOf;
        er8 er8Var;
        long[] jArr2;
        int[] iArr;
        fq80 fq80Var3;
        int i15;
        int i16;
        long j7;
        long j8;
        long j9;
        int iM2;
        int i17;
        int i18;
        int iD4;
        int i19;
        int i20;
        String str2;
        long[] jArrCopyOf;
        long[] jArr3;
        int i21;
        int[] iArrCopyOf2;
        boolean z8;
        String str3;
        int i22;
        long j10;
        int i23;
        int[] iArr2;
        long j11;
        long j12;
        int i24;
        boolean zA;
        int i25;
        int iG;
        long[] jArr4;
        int[] iArr3;
        long j13;
        long j14;
        int iD5;
        int i26;
        long[] jArr5;
        int[] iArr4;
        long j15;
        int i27;
        long j16;
        androidx.media3.common.b bVar2;
        c4x c4xVar3;
        c4x c4xVar4;
        long jT3;
        int[] iArrM0;
        long[] jArr6;
        int i28;
        lbs0 lbs0Var2;
        int i29;
        long[] jArr7;
        int[] iArr5;
        int[] iArr6;
        int i30;
        boolean z9;
        int[] iArr7;
        int[] iArr8;
        int i31;
        int i32;
        int i33;
        boolean z10;
        int[] iArr9;
        int[] iArr10;
        int[] iArr11;
        boolean z11;
        boolean z12;
        long[] jArr8;
        int[] iArr12;
        int[] iArr13;
        ArrayList arrayList4;
        long[] jArr9;
        int i34;
        boolean z13;
        int i35;
        long jA;
        androidx.media3.common.b bVar3;
        lbs0 lbs0Var3;
        ocs0 ocs0Var;
        long jA2;
        boolean z14;
        int i36;
        long[] jArr10;
        int i37;
        int[] iArr14;
        int i38;
        int i39;
        long jT4;
        long jA3;
        int[] iArr15;
        int i40;
        long jT5;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        boolean z15;
        int i47;
        long jA4;
        int i48;
        ocs0 ocs0Var2;
        long jA5;
        int i49;
        long jT6;
        long jT7;
        int i50;
        long[] jArr11;
        int[] iArr16;
        long j17;
        int iMax;
        int i51;
        int iG2;
        int[] iArr17;
        int i52;
        int i53;
        int i54;
        int i55;
        int i56;
        long j18;
        int iMax2;
        int i57;
        int i58;
        int i59;
        ev40 ev40Var2 = ev40Var;
        ArrayList arrayList5 = ev40Var2.g;
        ArrayList arrayList6 = new ArrayList();
        int i60 = 0;
        while (i60 < arrayList5.size()) {
            ev40 ev40Var3 = (ev40) arrayList5.get(i60);
            if (ev40Var3.b != 1953653099) {
                arrayList = arrayList5;
                arrayList2 = arrayList6;
                i2 = i60;
            } else {
                fv40 fv40VarW3 = ev40Var2.w(1836476516);
                fv40VarW3.getClass();
                ev40 ev40VarV3 = ev40Var3.v(1835297121);
                ev40VarV3.getClass();
                fv40 fv40VarW4 = ev40VarV3.w(1751411826);
                fv40VarW4.getClass();
                fq80 fq80Var4 = fv40VarW4.e;
                fq80Var4.M(16);
                int iM3 = fq80Var4.m();
                if (iM3 == 1936684398) {
                    i = 1;
                } else if (iM3 == 1986618469) {
                    i = 2;
                } else if (iM3 == 1952807028 || iM3 == 1935832172 || iM3 == 1937072756 || iM3 == 1668047728 || iM3 == 1937072752) {
                    i = 3;
                } else {
                    i = iM3 == 1835365473 ? 5 : -1;
                }
                String str4 = "BoxParsers";
                int i61 = 1;
                i2 = i60;
                if (i == -1) {
                    tdrVar = tdrVar;
                    arrayList = arrayList5;
                    arrayList2 = arrayList6;
                    ev40Var3 = ev40Var3;
                    str4 = "BoxParsers";
                    lbs0Var = null;
                    j2 = 0;
                } else {
                    j2 = 0;
                    fv40 fv40VarW5 = ev40Var3.w(1953196132);
                    fv40VarW5.getClass();
                    fq80 fq80Var5 = fv40VarW5.e;
                    fq80Var5.M(8);
                    int iE2 = e(fq80Var5.m());
                    fq80Var5.N(iE2 != 0 ? 16 : 8);
                    int iM4 = fq80Var5.m();
                    fq80Var5.N(4);
                    int i62 = fq80Var5.b;
                    int i63 = iE2 == 0 ? 4 : 8;
                    int i64 = 0;
                    while (true) {
                        jT = -9223372036854775807L;
                        if (i64 >= i63) {
                            fq80Var5.N(i63);
                        } else {
                            if (fq80Var5.f9961a[i62 + i64] != -1) {
                                jB = iE2 == 0 ? fq80Var5.B() : fq80Var5.F();
                                if (jB != 0) {
                                    break;
                                }
                                break;
                            }
                            i64++;
                        }
                        jB = -9223372036854775807L;
                        break;
                    }
                    fq80Var5.N(10);
                    int iG3 = fq80Var5.G();
                    fq80Var5.N(4);
                    int iM5 = fq80Var5.m();
                    int iM6 = fq80Var5.m();
                    fq80Var5.N(4);
                    int iM7 = fq80Var5.m();
                    int iM8 = fq80Var5.m();
                    if (iM5 == 0 && iM6 == 65536 && ((iM7 == -65536 || iM7 == 65536) && iM8 == 0)) {
                        i3 = 90;
                    } else if (iM5 == 0 && iM6 == -65536 && ((iM7 == 65536 || iM7 == -65536) && iM8 == 0)) {
                        i3 = SubsamplingScaleImageView.ORIENTATION_270;
                    } else {
                        if ((iM5 == -65536 || iM5 == 65536) && iM6 == 0 && iM7 == 0 && iM8 == -65536) {
                            i3 = 180;
                        } else {
                            i4 = 0;
                        }
                        fq80Var5.N(16);
                        short sW = fq80Var5.w();
                        fq80Var5.N(2);
                        short sW2 = fq80Var5.w();
                        if ((((long) iM5) * ((long) iM8)) - (((long) iM6) * ((long) iM7)) < 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        gr8Var = new gr8(iM4, jB, iG3, i4, z4, sW, sW2);
                        if (j == -9223372036854775807L) {
                            j3 = jB;
                        } else {
                            j3 = j;
                        }
                        j4 = g(fv40VarW3.e).c;
                        if (j3 == -9223372036854775807L) {
                            j5 = j4;
                            jT2 = -9223372036854775807L;
                        } else {
                            String str5 = vtt0.f38024a;
                            jT2 = vtt0.T(j3, 1000000L, j4, RoundingMode.DOWN);
                            j5 = j4;
                        }
                        ev40 ev40VarV4 = ev40VarV3.v(1835626086);
                        ev40VarV4.getClass();
                        ev40 ev40VarV5 = ev40VarV4.v(1937007212);
                        ev40VarV5.getClass();
                        fv40 fv40VarW6 = ev40VarV3.w(1835296868);
                        fv40VarW6.getClass();
                        fq80Var = fv40VarW6.e;
                        fq80Var.M(8);
                        iE = e(fq80Var.m());
                        if (iE == 0) {
                            i5 = 8;
                        } else {
                            i5 = 16;
                        }
                        fq80Var.N(i5);
                        jB2 = fq80Var.B();
                        i6 = fq80Var.b;
                        if (iE == 0) {
                            i7 = 4;
                        } else {
                            i7 = 8;
                        }
                        arrayList = arrayList5;
                        i8 = 0;
                        while (true) {
                            if (i8 < i7) {
                                fq80Var.N(i7);
                                break;
                            }
                            i13 = i8;
                            i14 = iE;
                            if (fq80Var.f9961a[i6 + i13] != -1) {
                                if (i14 == 0) {
                                    jF = fq80Var.B();
                                } else {
                                    jF = fq80Var.F();
                                }
                                if (jF != 0) {
                                    String str6 = vtt0.f38024a;
                                    jT = vtt0.T(jF, 1000000L, jB2, RoundingMode.DOWN);
                                }
                                break;
                            }
                            arrayList6 = arrayList6;
                            i8 = i13 + 1;
                            iE = i14;
                        }
                        j6 = jT;
                        int iG4 = fq80Var.G();
                        char c2 = (char) (((iG4 >> 10) & 31) + 96);
                        char c3 = (char) (((iG4 >> 5) & 31) + 96);
                        char c4 = (char) ((iG4 & 31) + 96);
                        arrayList2 = arrayList6;
                        i9 = 3;
                        cArr = new char[]{c2, c3, c4};
                        i10 = 0;
                        while (true) {
                            if (i10 < i9) {
                                str = new String(cArr);
                                break;
                            }
                            c = cArr[i10];
                            i12 = i10;
                            if (c >= 'a' || c > 'z') {
                                str = null;
                                break;
                            }
                            i10 = i12 + 1;
                            i9 = 3;
                        }
                        fv40VarW = ev40VarV5.w(1937011556);
                        if (fv40VarW == null) {
                            f1t0.g0("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                            ev40Var3 = ev40Var3;
                            str4 = "BoxParsers";
                        } else {
                            qo8VarI = i(fv40VarW.e, gr8Var, str, drmInitData, z2);
                            ev40VarV = ev40Var3.v(1953654118);
                            if (ev40VarV != null || (fv40VarW2 = ev40VarV.w(1667785072)) == null) {
                                iM = -1;
                            } else {
                                fq80 fq80Var6 = fv40VarW2.e;
                                fq80Var6.M(8);
                                if (fq80Var6.a() >= 4) {
                                    iM = fq80Var6.m();
                                } else {
                                    iM = -1;
                                }
                            }
                            if (!z || (ev40VarV2 = ev40Var3.v(1701082227)) == null) {
                                j6 = j6;
                                ev40Var3 = ev40Var3;
                                jT2 = jT2;
                                iM = iM;
                                str4 = "BoxParsers";
                            } else {
                                fv40 fv40VarW7 = ev40VarV2.w(1701606260);
                                if (fv40VarW7 == null) {
                                    pairCreate = null;
                                } else {
                                    fq80 fq80Var7 = fv40VarW7.e;
                                    fq80Var7.M(8);
                                    int iE3 = e(fq80Var7.m());
                                    int iD6 = fq80Var7.D();
                                    x0x.w("Invalid initialCapacity: %s", iD6, iD6 >= 0);
                                    long[] jArr12 = new long[iD6];
                                    x0x.w("Invalid initialCapacity: %s", iD6, iD6 >= 0);
                                    long[] jArrCopyOf2 = new long[iD6];
                                    int i65 = 0;
                                    long[] jArrCopyOf3 = jArr12;
                                    int i66 = 0;
                                    int i67 = 0;
                                    while (i66 < iD6) {
                                        long jF2 = iE3 == i61 ? fq80Var7.F() : fq80Var7.B();
                                        int i68 = i67 + 1;
                                        int i69 = i66;
                                        if (i68 > jArrCopyOf3.length) {
                                            int length = jArrCopyOf3.length;
                                            if (i68 < 0) {
                                                c99.l("cannot store more than MAX_VALUE elements");
                                                return null;
                                            }
                                            int iHighestOneBit = length + (length >> 1) + 1;
                                            if (iHighestOneBit < i68) {
                                                iHighestOneBit = Integer.highestOneBit(i67) << 1;
                                            }
                                            if (iHighestOneBit < 0) {
                                                iHighestOneBit = Integer.MAX_VALUE;
                                            }
                                            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, iHighestOneBit);
                                        }
                                        long[] jArr13 = jArrCopyOf3;
                                        jArrCopyOf3[i67] = jF2;
                                        int i70 = i67 + 1;
                                        int i71 = i65 + 1;
                                        long jT8 = iE3 == 1 ? fq80Var7.t() : fq80Var7.m();
                                        if (i71 > jArrCopyOf2.length) {
                                            int length2 = jArrCopyOf2.length;
                                            if (i71 < 0) {
                                                c99.l("cannot store more than MAX_VALUE elements");
                                                return null;
                                            }
                                            int iHighestOneBit2 = length2 + (length2 >> 1) + 1;
                                            if (iHighestOneBit2 < i71) {
                                                iHighestOneBit2 = Integer.highestOneBit(i65) << 1;
                                            }
                                            if (iHighestOneBit2 < 0) {
                                                iHighestOneBit2 = Integer.MAX_VALUE;
                                            }
                                            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, iHighestOneBit2);
                                        }
                                        long[] jArr14 = jArrCopyOf2;
                                        jArrCopyOf2[i65] = jT8;
                                        i65++;
                                        if (fq80Var7.w() != 1) {
                                            jf4.o("Unsupported media rate.");
                                            return null;
                                        }
                                        fq80Var7.N(2);
                                        jArrCopyOf2 = jArr14;
                                        i66 = i69 + 1;
                                        jArrCopyOf3 = jArr13;
                                        i67 = i70;
                                        i61 = 1;
                                    }
                                    c4x c4xVar5 = c4x.c;
                                    c4x c4xVar6 = i67 == 0 ? c4xVar5 : new c4x(i67, jArrCopyOf3);
                                    if (i65 != 0) {
                                        c4xVar5 = new c4x(i65, jArrCopyOf2);
                                    }
                                    pairCreate = Pair.create(c4xVar6, c4xVar5);
                                }
                                if (pairCreate != null) {
                                    c4xVar2 = (c4x) pairCreate.first;
                                    c4xVar = (c4x) pairCreate.second;
                                }
                                bVar = (androidx.media3.common.b) qo8VarI.e;
                                if (bVar != null) {
                                    i11 = gr8Var.b;
                                    if (i11 != 0) {
                                        dv40Var = new dv40(i11);
                                        awq awqVarA = bVar.a();
                                        ed40Var = ((androidx.media3.common.b) qo8VarI.e).m;
                                        if (ed40Var != null) {
                                            ed40Var2 = ed40Var.a(dv40Var);
                                        } else {
                                            ed40Var2 = new ed40(dv40Var);
                                        }
                                        awqVarA.l = ed40Var2;
                                        bVar = new androidx.media3.common.b(awqVarA);
                                    }
                                    boolean z16 = !Objects.equals(bVar.p, "text/x-unknown");
                                    kbs0 kbs0Var = new kbs0();
                                    kbs0Var.m = true;
                                    kbs0Var.n = -1;
                                    kbs0Var.f18030a = gr8Var.f11766a;
                                    kbs0Var.b = i;
                                    kbs0Var.c = jB2;
                                    kbs0Var.d = j5;
                                    kbs0Var.e = jT2;
                                    kbs0Var.f = j6;
                                    kbs0Var.g = bVar;
                                    kbs0Var.h = qo8VarI.c;
                                    kbs0Var.i = (vbs0[]) ((vbs0[]) qo8VarI.d).clone();
                                    kbs0Var.j = qo8VarI.b;
                                    kbs0Var.k = c4xVar2;
                                    kbs0Var.l = c4xVar;
                                    kbs0Var.m = z16;
                                    kbs0Var.n = iM;
                                    kbs0Var.g.getClass();
                                    lbs0Var = new lbs0(kbs0Var);
                                    tdrVar = tdrVar;
                                }
                            }
                            c4xVar = null;
                            c4xVar2 = null;
                            bVar = (androidx.media3.common.b) qo8VarI.e;
                            if (bVar != null) {
                                i11 = gr8Var.b;
                                if (i11 != 0) {
                                    dv40Var = new dv40(i11);
                                    awq awqVarA2 = bVar.a();
                                    ed40Var = ((androidx.media3.common.b) qo8VarI.e).m;
                                    if (ed40Var != null) {
                                        ed40Var2 = ed40Var.a(dv40Var);
                                    } else {
                                        ed40Var2 = new ed40(dv40Var);
                                    }
                                    awqVarA2.l = ed40Var2;
                                    bVar = new androidx.media3.common.b(awqVarA2);
                                }
                                boolean z17 = !Objects.equals(bVar.p, "text/x-unknown");
                                kbs0 kbs0Var2 = new kbs0();
                                kbs0Var2.m = true;
                                kbs0Var2.n = -1;
                                kbs0Var2.f18030a = gr8Var.f11766a;
                                kbs0Var2.b = i;
                                kbs0Var2.c = jB2;
                                kbs0Var2.d = j5;
                                kbs0Var2.e = jT2;
                                kbs0Var2.f = j6;
                                kbs0Var2.g = bVar;
                                kbs0Var2.h = qo8VarI.c;
                                kbs0Var2.i = (vbs0[]) ((vbs0[]) qo8VarI.d).clone();
                                kbs0Var2.j = qo8VarI.b;
                                kbs0Var2.k = c4xVar2;
                                kbs0Var2.l = c4xVar;
                                kbs0Var2.m = z17;
                                kbs0Var2.n = iM;
                                kbs0Var2.g.getClass();
                                lbs0Var = new lbs0(kbs0Var2);
                                tdrVar = tdrVar;
                            }
                        }
                        lbs0Var = null;
                    }
                    i4 = i3;
                    fq80Var5.N(16);
                    short sW3 = fq80Var5.w();
                    fq80Var5.N(2);
                    short sW4 = fq80Var5.w();
                    if ((((long) iM5) * ((long) iM8)) - (((long) iM6) * ((long) iM7)) < 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    gr8Var = new gr8(iM4, jB, iG3, i4, z4, sW3, sW4);
                    if (j == -9223372036854775807L) {
                        j3 = jB;
                    } else {
                        j3 = j;
                    }
                    j4 = g(fv40VarW3.e).c;
                    if (j3 == -9223372036854775807L) {
                        j5 = j4;
                        jT2 = -9223372036854775807L;
                    } else {
                        String str7 = vtt0.f38024a;
                        jT2 = vtt0.T(j3, 1000000L, j4, RoundingMode.DOWN);
                        j5 = j4;
                    }
                    ev40 ev40VarV6 = ev40VarV3.v(1835626086);
                    ev40VarV6.getClass();
                    ev40 ev40VarV7 = ev40VarV6.v(1937007212);
                    ev40VarV7.getClass();
                    fv40 fv40VarW8 = ev40VarV3.w(1835296868);
                    fv40VarW8.getClass();
                    fq80Var = fv40VarW8.e;
                    fq80Var.M(8);
                    iE = e(fq80Var.m());
                    if (iE == 0) {
                        i5 = 8;
                    } else {
                        i5 = 16;
                    }
                    fq80Var.N(i5);
                    jB2 = fq80Var.B();
                    i6 = fq80Var.b;
                    if (iE == 0) {
                        i7 = 4;
                    } else {
                        i7 = 8;
                    }
                    arrayList = arrayList5;
                    i8 = 0;
                    while (true) {
                        if (i8 < i7) {
                            fq80Var.N(i7);
                            break;
                        }
                        i13 = i8;
                        i14 = iE;
                        if (fq80Var.f9961a[i6 + i13] != -1) {
                            if (i14 == 0) {
                                jF = fq80Var.B();
                            } else {
                                jF = fq80Var.F();
                            }
                            if (jF != 0) {
                                String str8 = vtt0.f38024a;
                                jT = vtt0.T(jF, 1000000L, jB2, RoundingMode.DOWN);
                            }
                            break;
                            break;
                        }
                        arrayList6 = arrayList6;
                        i8 = i13 + 1;
                        iE = i14;
                    }
                    j6 = jT;
                    int iG5 = fq80Var.G();
                    char c5 = (char) (((iG5 >> 10) & 31) + 96);
                    char c6 = (char) (((iG5 >> 5) & 31) + 96);
                    char c7 = (char) ((iG5 & 31) + 96);
                    arrayList2 = arrayList6;
                    i9 = 3;
                    cArr = new char[]{c5, c6, c7};
                    i10 = 0;
                    while (true) {
                        if (i10 < i9) {
                            str = new String(cArr);
                            break;
                        }
                        c = cArr[i10];
                        i12 = i10;
                        if (c >= 'a') {
                        }
                        str = null;
                        break;
                        i10 = i12 + 1;
                        i9 = 3;
                    }
                    fv40VarW = ev40VarV7.w(1937011556);
                    if (fv40VarW == null) {
                        f1t0.g0("BoxParsers", "Ignoring track where sample table (stbl) box is missing a sample description (stsd).");
                        ev40Var3 = ev40Var3;
                        str4 = "BoxParsers";
                    } else {
                        qo8VarI = i(fv40VarW.e, gr8Var, str, drmInitData, z2);
                        ev40VarV = ev40Var3.v(1953654118);
                        if (ev40VarV != null) {
                            iM = -1;
                        } else {
                            iM = -1;
                        }
                        if (z) {
                            j6 = j6;
                            ev40Var3 = ev40Var3;
                            jT2 = jT2;
                            iM = iM;
                            str4 = "BoxParsers";
                            c4xVar = null;
                            c4xVar2 = null;
                        } else {
                            j6 = j6;
                            ev40Var3 = ev40Var3;
                            jT2 = jT2;
                            iM = iM;
                            str4 = "BoxParsers";
                            c4xVar = null;
                            c4xVar2 = null;
                        }
                        bVar = (androidx.media3.common.b) qo8VarI.e;
                        if (bVar != null) {
                            i11 = gr8Var.b;
                            if (i11 != 0) {
                                dv40Var = new dv40(i11);
                                awq awqVarA3 = bVar.a();
                                ed40Var = ((androidx.media3.common.b) qo8VarI.e).m;
                                if (ed40Var != null) {
                                    ed40Var2 = ed40Var.a(dv40Var);
                                } else {
                                    ed40Var2 = new ed40(dv40Var);
                                }
                                awqVarA3.l = ed40Var2;
                                bVar = new androidx.media3.common.b(awqVarA3);
                            }
                            boolean z18 = !Objects.equals(bVar.p, "text/x-unknown");
                            kbs0 kbs0Var3 = new kbs0();
                            kbs0Var3.m = true;
                            kbs0Var3.n = -1;
                            kbs0Var3.f18030a = gr8Var.f11766a;
                            kbs0Var3.b = i;
                            kbs0Var3.c = jB2;
                            kbs0Var3.d = j5;
                            kbs0Var3.e = jT2;
                            kbs0Var3.f = j6;
                            kbs0Var3.g = bVar;
                            kbs0Var3.h = qo8VarI.c;
                            kbs0Var3.i = (vbs0[]) ((vbs0[]) qo8VarI.d).clone();
                            kbs0Var3.j = qo8VarI.b;
                            kbs0Var3.k = c4xVar2;
                            kbs0Var3.l = c4xVar;
                            kbs0Var3.m = z18;
                            kbs0Var3.n = iM;
                            kbs0Var3.g.getClass();
                            lbs0Var = new lbs0(kbs0Var3);
                            tdrVar = tdrVar;
                        }
                    }
                    lbs0Var = null;
                }
                lbs0 lbs0Var4 = (lbs0) tdrVar.apply(lbs0Var);
                if (lbs0Var4 == null) {
                    arrayList2 = arrayList2;
                } else {
                    androidx.media3.common.b bVar4 = lbs0Var4.g;
                    ev40 ev40VarV8 = ev40Var3.v(1835297121);
                    ev40VarV8.getClass();
                    ev40 ev40VarV9 = ev40VarV8.v(1835626086);
                    ev40VarV9.getClass();
                    ev40 ev40VarV10 = ev40VarV9.v(1937007212);
                    ev40VarV10.getClass();
                    fv40 fv40VarW9 = ev40VarV10.w(1937011578);
                    if (fv40VarW9 != null) {
                        fr8Var = new cf60(fv40VarW9, bVar4);
                    } else {
                        fv40 fv40VarW10 = ev40VarV10.w(1937013298);
                        if (fv40VarW10 == null) {
                            throw kq80.a("Track has no sample table size information", null);
                        }
                        fr8Var = new fr8(fv40VarW10);
                    }
                    int iM9 = fr8Var.m();
                    if (iM9 == 0) {
                        ocs0Var = new ocs0(lbs0Var4, new long[0], new int[0], 0, new long[0], new int[0], new int[0], false, 0L, 0);
                    } else {
                        if (lbs0Var4.b == 2) {
                            long j19 = lbs0Var4.f;
                            if (j19 > j2) {
                                awq awqVarA4 = bVar4.a();
                                awqVarA4.a(iM9 / (j19 / 1000000.0f));
                                androidx.media3.common.b bVar5 = new androidx.media3.common.b(awqVarA4);
                                kbs0 kbs0VarA = lbs0Var4.a();
                                kbs0VarA.g = bVar5;
                                lbs0Var4 = new lbs0(kbs0VarA);
                            }
                        }
                        androidx.media3.common.b bVar6 = lbs0Var4.g;
                        fv40 fv40VarW11 = ev40VarV10.w(1937007471);
                        if (fv40VarW11 == null) {
                            fv40VarW11 = ev40VarV10.w(1668232756);
                            fv40VarW11.getClass();
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        fq80 fq80Var8 = fv40VarW11.e;
                        fv40 fv40VarW12 = ev40VarV10.w(1937011555);
                        fv40VarW12.getClass();
                        fq80 fq80Var9 = fv40VarW12.e;
                        fv40 fv40VarW13 = ev40VarV10.w(1937011827);
                        fv40VarW13.getClass();
                        fq80 fq80Var10 = fv40VarW13.e;
                        fv40 fv40VarW14 = ev40VarV10.w(1937011571);
                        fq80 fq80Var11 = fv40VarW14 != null ? fv40VarW14.e : null;
                        fv40 fv40VarW15 = ev40VarV10.w(1668576371);
                        fq80 fq80Var12 = fv40VarW15 != null ? fv40VarW15.e : null;
                        cr8 cr8Var = new cr8(fq80Var9, fq80Var8, z5);
                        fq80Var10.M(12);
                        int iD7 = fq80Var10.D() - 1;
                        int iD8 = fq80Var10.D();
                        int iD9 = fq80Var10.D();
                        if (fq80Var12 != null) {
                            fq80Var12.M(12);
                            iD = fq80Var12.D();
                        } else {
                            iD = 0;
                        }
                        if (fq80Var11 != null) {
                            fq80Var11.M(12);
                            iD2 = fq80Var11.D();
                            if (iD2 > 0) {
                                iD3 = fq80Var11.D() - 1;
                            } else {
                                fq80Var11 = null;
                            }
                            iK = fr8Var.k();
                            String str9 = bVar6.p;
                            if (iK == -1 && (("audio/raw".equals(str9) || "audio/g711-mlaw".equals(str9) || "audio/g711-alaw".equals(str9)) && iD7 == 0 && iD == 0 && iD2 == 0)) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            arrayList3 = new ArrayList();
                            if (fq80Var11 == null) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (z6) {
                                i50 = cr8Var.f4831a;
                                jArr11 = new long[i50];
                                iArr16 = new int[i50];
                                while (cr8Var.a()) {
                                    int i72 = cr8Var.b;
                                    jArr11[i72] = cr8Var.d;
                                    iArr16[i72] = cr8Var.c;
                                }
                                j17 = iD9;
                                iMax = Math.max(1, 8192 / iK);
                                iG2 = 0;
                                for (i51 = 0; i51 < i50; i51++) {
                                    iG2 += vtt0.g(iArr16[i51], iMax);
                                }
                                jArr3 = new long[iG2];
                                iArr17 = new int[iG2];
                                jArrCopyOf = new long[iG2];
                                iArrCopyOf2 = new int[iG2];
                                i52 = 0;
                                i53 = 0;
                                i54 = 0;
                                i55 = 0;
                                i56 = 0;
                                while (i53 < i50) {
                                    int i73 = iArr16[i53];
                                    j18 = jArr11[i53];
                                    int i74 = i56;
                                    int i75 = i50;
                                    iMax2 = i55;
                                    i57 = i74;
                                    i58 = i52;
                                    i59 = i73;
                                    while (i59 > 0) {
                                        int iMin = Math.min(iMax, i59);
                                        jArr3[i57] = j18;
                                        int i76 = i59;
                                        int i77 = iK * iMin;
                                        iArr17[i57] = i77;
                                        i58 += i77;
                                        iMax2 = Math.max(iMax2, i77);
                                        long j20 = j17;
                                        jArrCopyOf[i57] = j20 * ((long) i54);
                                        iArrCopyOf2[i57] = 1;
                                        j18 += (long) iArr17[i57];
                                        i54 += iMin;
                                        i59 = i76 - iMin;
                                        i57++;
                                        iArr16 = iArr16;
                                        j17 = j20;
                                    }
                                    i53++;
                                    int i78 = i57;
                                    i55 = iMax2;
                                    i50 = i75;
                                    i56 = i78;
                                    i52 = i58;
                                }
                                long j21 = j17 * ((long) i54);
                                j11 = i52;
                                if (z3) {
                                    jArr3 = new long[0];
                                }
                                if (z3) {
                                    iArr17 = new int[0];
                                }
                                if (z3) {
                                    jArrCopyOf = new long[0];
                                }
                                if (z3) {
                                    iArrCopyOf2 = new int[0];
                                }
                                j10 = j21;
                                i22 = iG2;
                                iArr2 = iArr17;
                                i23 = i55;
                                arrayList3 = arrayList3;
                            } else {
                                if (z3) {
                                    jArr = new long[0];
                                } else {
                                    jArr = new long[iM9];
                                }
                                fq80Var2 = fq80Var12;
                                if (z3) {
                                    iArrCopyOf = new int[0];
                                } else {
                                    iArrCopyOf = new int[iM9];
                                }
                                er8Var = fr8Var;
                                if (z3) {
                                    jArr2 = new long[0];
                                } else {
                                    jArr2 = new long[iM9];
                                }
                                int i79 = iD2;
                                if (z3) {
                                    iArr = new int[0];
                                } else {
                                    iArr = new int[iM9];
                                }
                                fq80Var3 = fq80Var11;
                                i15 = iD;
                                i16 = i79;
                                j7 = j2;
                                j8 = j7;
                                j9 = j8;
                                iM9 = 0;
                                iM2 = 0;
                                i17 = 0;
                                i18 = 0;
                                iD4 = 0;
                                while (true) {
                                    if (iM9 < iM9) {
                                        i19 = iD7;
                                        i20 = iD8;
                                        str2 = str4;
                                        jArrCopyOf = jArr2;
                                        jArr3 = jArr;
                                        i21 = i18;
                                        iArrCopyOf2 = iArr;
                                        break;
                                    }
                                    j12 = j9;
                                    i24 = i18;
                                    zA = true;
                                    while (i24 == 0) {
                                        zA = cr8Var.a();
                                        if (zA) {
                                            break;
                                        }
                                        int i80 = iD7;
                                        long j22 = cr8Var.d;
                                        i24 = cr8Var.c;
                                        j12 = j22;
                                        iD7 = i80;
                                        iD8 = iD8;
                                        iM9 = iM9;
                                    }
                                    i25 = iM9;
                                    i19 = iD7;
                                    i20 = iD8;
                                    if (!zA) {
                                        str2 = str4;
                                        f1t0.g0(str2, "Unexpected end of chunk data");
                                        if (z3) {
                                            jArrCopyOf = jArr2;
                                            iArrCopyOf2 = iArr;
                                            jArr3 = jArr;
                                        } else {
                                            long[] jArrCopyOf4 = Arrays.copyOf(jArr, iM9);
                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iM9);
                                            jArr3 = jArrCopyOf4;
                                            jArrCopyOf = Arrays.copyOf(jArr2, iM9);
                                            iArrCopyOf2 = Arrays.copyOf(iArr, iM9);
                                        }
                                        i21 = i24;
                                        break;
                                    }
                                    String str10 = str4;
                                    if (fq80Var2 != null) {
                                        while (iD4 == 0 && i15 > 0) {
                                            iD4 = fq80Var2.D();
                                            iM2 = fq80Var2.m();
                                            i15--;
                                        }
                                        iD4--;
                                    }
                                    iG = er8Var.g();
                                    jArr4 = jArr2;
                                    iArr3 = iArr;
                                    j13 = iG;
                                    j8 += j13;
                                    if (iG > i17) {
                                        i17 = iG;
                                    }
                                    if (z3) {
                                        j14 = j13;
                                    } else {
                                        jArr[iM9] = j12;
                                        iArrCopyOf[iM9] = iG;
                                        j14 = j13;
                                        jArr4[iM9] = j7 + ((long) iM2);
                                        if (fq80Var3 == null) {
                                            i26 = 1;
                                        } else {
                                            i26 = 0;
                                        }
                                        iArr3[iM9] = i26;
                                        if (iM9 == iD3) {
                                            iArr3[iM9] = 1;
                                            arrayList3.add(Integer.valueOf(iM9));
                                        }
                                    }
                                    if (fq80Var3 != null && iM9 == iD3 && (i16 = i16 - 1) > 0) {
                                        iD3 = fq80Var3.D() - 1;
                                    }
                                    j7 += (long) iD9;
                                    iD5 = i20 - 1;
                                    if (iD5 != 0 && i19 > 0) {
                                        iD5 = fq80Var10.D();
                                        iD9 = fq80Var10.m();
                                        i19--;
                                    }
                                    i18 = i24 - 1;
                                    iM9++;
                                    j9 = j12 + j14;
                                    jArr2 = jArr4;
                                    iArr = iArr3;
                                    iD8 = iD5;
                                    str4 = str10;
                                    iD7 = i19;
                                    iM9 = i25;
                                }
                                long j23 = j7 + ((long) iM2);
                                if (fq80Var2 != null) {
                                    z8 = true;
                                    break;
                                }
                                while (true) {
                                    if (i15 > 0) {
                                        z8 = true;
                                        break;
                                    }
                                    if (fq80Var2.D() != 0) {
                                        z8 = false;
                                        break;
                                    }
                                    fq80Var2.m();
                                    i15--;
                                }
                                if (i16 == 0 || i20 != 0 || i21 != 0 || i19 != 0 || iD4 != 0 || !z8) {
                                    StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                                    axq.r(lbs0Var4.f19766a, i16, ": remainingSynchronizationSamples ", ", remainingSamplesAtTimestampDelta ", sb);
                                    axq.r(i20, i21, ", remainingSamplesInChunk ", ", remainingTimestampDeltaChanges ", sb);
                                    sb.append(i19);
                                    sb.append(", remainingSamplesAtTimestampOffset ");
                                    sb.append(iD4);
                                    if (z8) {
                                        str3 = "";
                                    } else {
                                        str3 = ", ctts invalid";
                                    }
                                    sb.append(str3);
                                    f1t0.g0(str2, sb.toString());
                                }
                                i22 = iM9;
                                j10 = j23;
                                i23 = i17;
                                iArr2 = iArrCopyOf;
                                j11 = j8;
                            }
                            jArr5 = jArr3;
                            iArr4 = iArrCopyOf2;
                            j15 = lbs0Var4.f;
                            if (j15 > j2) {
                                jT7 = vtt0.T(8 * j11, 1000000L, j15, RoundingMode.HALF_DOWN);
                                if (jT7 > j2 && jT7 < 2147483647L) {
                                    awq awqVarA5 = bVar6.a();
                                    awqVarA5.i = (int) jT7;
                                    androidx.media3.common.b bVar7 = new androidx.media3.common.b(awqVarA5);
                                    kbs0 kbs0VarA2 = lbs0Var4.a();
                                    kbs0VarA2.g = bVar7;
                                    lbs0Var4 = new lbs0(kbs0VarA2);
                                }
                            }
                            i27 = lbs0Var4.b;
                            j16 = lbs0Var4.c;
                            bVar2 = lbs0Var4.g;
                            c4xVar3 = lbs0Var4.j;
                            c4xVar4 = lbs0Var4.i;
                            RoundingMode roundingMode = RoundingMode.DOWN;
                            jT3 = vtt0.T(j10, 1000000L, j16, roundingMode);
                            iArrM0 = n6x.m0(arrayList3);
                            if (c4xVar4 == null) {
                                if (!z3) {
                                    vtt0.S(jArrCopyOf, j16);
                                }
                                ocs0Var2 = new ocs0(lbs0Var4, jArr5, iArr2, i23, jArrCopyOf, iArr4, iArrM0, z7, jT3, i22);
                            } else {
                                jArr6 = jArrCopyOf;
                                i28 = c4xVar4.b;
                                if (z3) {
                                    c4xVar3.getClass();
                                    if (i28 == 1 || c4xVar4.a(0) != j2) {
                                        jA5 = j2;
                                        for (i49 = 0; i49 < i28; i49++) {
                                            if (c4xVar3.a(i49) != -1) {
                                                jA5 = c4xVar4.a(i49) + jA5;
                                            }
                                        }
                                        jT6 = vtt0.T(jA5, 1000000L, lbs0Var4.d, RoundingMode.DOWN);
                                    } else {
                                        jT6 = vtt0.T(j10 - c4xVar3.a(0), 1000000L, lbs0Var4.c, roundingMode);
                                    }
                                    ocs0Var2 = new ocs0(lbs0Var4, jArr5, iArr2, i23, jArr6, iArr4, iArrM0, z7, jT6, i22);
                                } else {
                                    lbs0Var2 = lbs0Var4;
                                    i29 = 1;
                                    if (i28 != 1 && i27 == 1 && jArr6.length >= 2) {
                                        c4xVar3.getClass();
                                        long jA6 = c4xVar3.a(0);
                                        long jT9 = jA6 + vtt0.T(c4xVar4.a(0), lbs0Var2.c, lbs0Var2.d, roundingMode);
                                        int length3 = jArr6.length - 1;
                                        int i81 = vtt0.i(4, 0, length3);
                                        int i82 = vtt0.i(jArr6.length - 4, 0, length3);
                                        if (jArr6[0] <= jA6 && jA6 < jArr6[i81] && jArr6[i82] < jT9 && jT9 <= j10 + 2) {
                                            long jMax = Math.max(j2, j10 - jT9);
                                            long jT10 = vtt0.T(jA6 - jArr6[0], bVar2.L, lbs0Var2.c, roundingMode);
                                            long jT11 = vtt0.T(jMax, bVar2.L, lbs0Var2.c, roundingMode);
                                            if ((jT10 != j2 || jT11 != j2) && jT10 <= 2147483647L && jT11 <= 2147483647L) {
                                                metVar.f21663a = (int) jT10;
                                                metVar.b = (int) jT11;
                                                vtt0.S(jArr6, j16);
                                                ocs0Var2 = new ocs0(lbs0Var2, jArr5, iArr2, i23, jArr6, iArr4, iArrM0, z7, vtt0.T(c4xVar4.a(0), 1000000L, lbs0Var2.d, roundingMode), i22);
                                            }
                                        }
                                        i29 = 1;
                                    }
                                    if (i28 == i29) {
                                        if (c4xVar4.a(0) == 0) {
                                            c4xVar3.getClass();
                                            jA4 = c4xVar3.a(0);
                                            for (i48 = 0; i48 < jArr6.length; i48++) {
                                                jArr6[i48] = vtt0.T(jArr6[i48] - jA4, 1000000L, lbs0Var2.c, RoundingMode.DOWN);
                                            }
                                            ocs0Var2 = new ocs0(lbs0Var2, jArr5, iArr2, i23, jArr6, iArr4, iArrM0, z7, vtt0.T(j10 - jA4, 1000000L, lbs0Var2.c, RoundingMode.DOWN), i22);
                                        } else {
                                            i29 = 1;
                                        }
                                    }
                                    jArr7 = jArr5;
                                    iArr5 = iArr2;
                                    iArr6 = iArr4;
                                    i30 = i22;
                                    if (i27 == i29) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    iArr7 = new int[i28];
                                    iArr8 = new int[i28];
                                    c4xVar3.getClass();
                                    i31 = 0;
                                    i32 = 0;
                                    i33 = 0;
                                    z10 = false;
                                    while (i33 < i28) {
                                        int[] iArr18 = iArr5;
                                        int[] iArr19 = iArr6;
                                        jA3 = c4xVar3.a(i33);
                                        if (jA3 != -1) {
                                            iArr15 = iArr8;
                                            i40 = i33;
                                            jT5 = vtt0.T(c4xVar4.a(i33), lbs0Var2.c, lbs0Var2.d, RoundingMode.DOWN) + jA3;
                                            boolean z19 = z10;
                                            iArr7[i40] = vtt0.f(jArr6, jA3, true);
                                            int iB = vtt0.b(jArr6, jT5, z9);
                                            i41 = iB - 1;
                                            i43 = 0;
                                            for (i42 = iB; i42 < jArr6.length; i42++) {
                                                if (jArr6[i42] >= jT5) {
                                                    i43++;
                                                    if (i43 > bVar2.r) {
                                                        break;
                                                    }
                                                } else {
                                                    i41 = i42;
                                                }
                                            }
                                            iArr15[i40] = i41 + 1;
                                            i44 = iArr7[i40];
                                            while (true) {
                                                i45 = iArr7[i40];
                                                if (i45 > 0 || (iArr19[i45] & 1) != 0) {
                                                    break;
                                                    break;
                                                }
                                                iArr7[i40] = i45 - 1;
                                            }
                                            if (i45 == 0 && (iArr19[0] & 1) == 0) {
                                                iArr7[i40] = i44;
                                                while (true) {
                                                    i47 = iArr7[i40];
                                                    if (i47 < iArr15[i40] || (iArr19[i47] & 1) != 0) {
                                                        break;
                                                    }
                                                    iArr7[i40] = i47 + 1;
                                                }
                                            }
                                            int i83 = iArr15[i40];
                                            i46 = iArr7[i40];
                                            int i84 = (i83 - i46) + i31;
                                            if (i32 != i46) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                            i32 = i83;
                                            z10 = z19 | z15;
                                            i31 = i84;
                                        } else {
                                            iArr15 = iArr8;
                                            i40 = i33;
                                        }
                                        i33 = i40 + 1;
                                        iArr8 = iArr15;
                                        z9 = z9;
                                        iArr5 = iArr18;
                                        iArr6 = iArr19;
                                    }
                                    iArr9 = iArr5;
                                    iArr10 = iArr6;
                                    iArr11 = iArr8;
                                    boolean z20 = z10;
                                    if (i31 != i30) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    z12 = z20 | z11;
                                    if (z12) {
                                        jArr8 = new long[i31];
                                    } else {
                                        jArr8 = jArr7;
                                    }
                                    if (z12) {
                                        iArr12 = new int[i31];
                                    } else {
                                        iArr12 = iArr9;
                                    }
                                    if (z12) {
                                        i23 = 0;
                                    }
                                    if (z12) {
                                        iArr13 = new int[i31];
                                    } else {
                                        iArr13 = iArr10;
                                    }
                                    if (z12) {
                                        arrayList4 = new ArrayList();
                                    } else {
                                        arrayList4 = arrayList3;
                                    }
                                    jArr9 = new long[i31];
                                    i34 = 0;
                                    z13 = false;
                                    i35 = 0;
                                    jA = 0;
                                    while (i34 < i28) {
                                        jA2 = c4xVar3.a(i34);
                                        z14 = z12;
                                        i36 = iArr7[i34];
                                        jArr10 = jArr9;
                                        i37 = iArr11[i34];
                                        if (z14) {
                                            int i85 = i37 - i36;
                                            System.arraycopy(jArr7, i36, jArr8, i35, i85);
                                            System.arraycopy(iArr9, i36, iArr12, i35, i85);
                                            iArr14 = iArr10;
                                            System.arraycopy(iArr14, i36, iArr13, i35, i85);
                                        } else {
                                            iArr14 = iArr10;
                                        }
                                        i38 = i23;
                                        while (i36 < i37) {
                                            i39 = i36;
                                            int[] iArr20 = iArr14;
                                            long j24 = lbs0Var2.d;
                                            RoundingMode roundingMode2 = RoundingMode.DOWN;
                                            long jT12 = vtt0.T(jA, 1000000L, j24, roundingMode2);
                                            jT4 = vtt0.T(jArr6[i39] - jA2, 1000000L, lbs0Var2.c, roundingMode2);
                                            if (jT4 < 0) {
                                                z13 = true;
                                            }
                                            jArr10[i35] = jT12 + jT4;
                                            if (z14 && iArr12[i35] > i38) {
                                                i38 = iArr9[i39];
                                            }
                                            if (!z14 && !z7 && (iArr13[i35] & 1) != 0) {
                                                arrayList4.add(Integer.valueOf(i35));
                                            }
                                            i35++;
                                            i36 = i39 + 1;
                                            iArr14 = iArr20;
                                        }
                                        iArr10 = iArr14;
                                        jA = c4xVar4.a(i34) + jA;
                                        i34++;
                                        i23 = i38;
                                        z12 = z14;
                                        bVar2 = bVar2;
                                        jArr7 = jArr7;
                                        jArr9 = jArr10;
                                    }
                                    long[] jArr15 = jArr9;
                                    bVar3 = bVar2;
                                    long jT13 = vtt0.T(jA, 1000000L, lbs0Var2.d, RoundingMode.DOWN);
                                    if (z13) {
                                        awq awqVarA6 = bVar3.a();
                                        awqVarA6.u = true;
                                        androidx.media3.common.b bVar8 = new androidx.media3.common.b(awqVarA6);
                                        kbs0 kbs0VarA3 = lbs0Var2.a();
                                        kbs0VarA3.g = bVar8;
                                        lbs0Var3 = new lbs0(kbs0VarA3);
                                    } else {
                                        lbs0Var3 = lbs0Var2;
                                    }
                                    arrayList2 = arrayList2;
                                    ocs0Var = new ocs0(lbs0Var3, jArr8, iArr12, i23, jArr15, iArr13, n6x.m0(arrayList4), z7, jT13, jArr8.length);
                                    arrayList2.add(ocs0Var);
                                }
                            }
                            ocs0Var = ocs0Var2;
                        } else {
                            iD2 = 0;
                        }
                        iD3 = -1;
                        iK = fr8Var.k();
                        String str11 = bVar6.p;
                        if (iK == -1) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        arrayList3 = new ArrayList();
                        if (fq80Var11 == null) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (z6) {
                            i50 = cr8Var.f4831a;
                            jArr11 = new long[i50];
                            iArr16 = new int[i50];
                            while (cr8Var.a()) {
                                int i710 = cr8Var.b;
                                jArr11[i710] = cr8Var.d;
                                iArr16[i710] = cr8Var.c;
                            }
                            j17 = iD9;
                            iMax = Math.max(1, 8192 / iK);
                            iG2 = 0;
                            while (i51 < i50) {
                                iG2 += vtt0.g(iArr16[i51], iMax);
                            }
                            jArr3 = new long[iG2];
                            iArr17 = new int[iG2];
                            jArrCopyOf = new long[iG2];
                            iArrCopyOf2 = new int[iG2];
                            i52 = 0;
                            i53 = 0;
                            i54 = 0;
                            i55 = 0;
                            i56 = 0;
                            while (i53 < i50) {
                                int i711 = iArr16[i53];
                                j18 = jArr11[i53];
                                int i712 = i56;
                                int i713 = i50;
                                iMax2 = i55;
                                i57 = i712;
                                i58 = i52;
                                i59 = i711;
                                while (i59 > 0) {
                                    int iMin2 = Math.min(iMax, i59);
                                    jArr3[i57] = j18;
                                    int i714 = i59;
                                    int i715 = iK * iMin2;
                                    iArr17[i57] = i715;
                                    i58 += i715;
                                    iMax2 = Math.max(iMax2, i715);
                                    long j25 = j17;
                                    jArrCopyOf[i57] = j25 * ((long) i54);
                                    iArrCopyOf2[i57] = 1;
                                    j18 += (long) iArr17[i57];
                                    i54 += iMin2;
                                    i59 = i714 - iMin2;
                                    i57++;
                                    iArr16 = iArr16;
                                    j17 = j25;
                                }
                                i53++;
                                int i716 = i57;
                                i55 = iMax2;
                                i50 = i713;
                                i56 = i716;
                                i52 = i58;
                            }
                            long j26 = j17 * ((long) i54);
                            j11 = i52;
                            if (z3) {
                                jArr3 = new long[0];
                            }
                            if (z3) {
                                iArr17 = new int[0];
                            }
                            if (z3) {
                                jArrCopyOf = new long[0];
                            }
                            if (z3) {
                                iArrCopyOf2 = new int[0];
                            }
                            j10 = j26;
                            i22 = iG2;
                            iArr2 = iArr17;
                            i23 = i55;
                            arrayList3 = arrayList3;
                        } else {
                            if (z3) {
                                jArr = new long[0];
                            } else {
                                jArr = new long[iM9];
                            }
                            fq80Var2 = fq80Var12;
                            if (z3) {
                                iArrCopyOf = new int[0];
                            } else {
                                iArrCopyOf = new int[iM9];
                            }
                            er8Var = fr8Var;
                            if (z3) {
                                jArr2 = new long[0];
                            } else {
                                jArr2 = new long[iM9];
                            }
                            int i717 = iD2;
                            if (z3) {
                                iArr = new int[0];
                            } else {
                                iArr = new int[iM9];
                            }
                            fq80Var3 = fq80Var11;
                            i15 = iD;
                            i16 = i717;
                            j7 = j2;
                            j8 = j7;
                            j9 = j8;
                            iM9 = 0;
                            iM2 = 0;
                            i17 = 0;
                            i18 = 0;
                            iD4 = 0;
                            while (true) {
                                if (iM9 < iM9) {
                                    i19 = iD7;
                                    i20 = iD8;
                                    str2 = str4;
                                    jArrCopyOf = jArr2;
                                    jArr3 = jArr;
                                    i21 = i18;
                                    iArrCopyOf2 = iArr;
                                    break;
                                }
                                j12 = j9;
                                i24 = i18;
                                zA = true;
                                while (i24 == 0) {
                                    zA = cr8Var.a();
                                    if (zA) {
                                        break;
                                        break;
                                    }
                                    int i86 = iD7;
                                    long j27 = cr8Var.d;
                                    i24 = cr8Var.c;
                                    j12 = j27;
                                    iD7 = i86;
                                    iD8 = iD8;
                                    iM9 = iM9;
                                }
                                i25 = iM9;
                                i19 = iD7;
                                i20 = iD8;
                                if (!zA) {
                                    str2 = str4;
                                    f1t0.g0(str2, "Unexpected end of chunk data");
                                    if (z3) {
                                        long[] jArrCopyOf5 = Arrays.copyOf(jArr, iM9);
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, iM9);
                                        jArr3 = jArrCopyOf5;
                                        jArrCopyOf = Arrays.copyOf(jArr2, iM9);
                                        iArrCopyOf2 = Arrays.copyOf(iArr, iM9);
                                    } else {
                                        jArrCopyOf = jArr2;
                                        iArrCopyOf2 = iArr;
                                        jArr3 = jArr;
                                    }
                                    i21 = i24;
                                    break;
                                }
                                String str12 = str4;
                                if (fq80Var2 != null) {
                                    while (iD4 == 0) {
                                        iD4 = fq80Var2.D();
                                        iM2 = fq80Var2.m();
                                        i15--;
                                    }
                                    iD4--;
                                }
                                iG = er8Var.g();
                                jArr4 = jArr2;
                                iArr3 = iArr;
                                j13 = iG;
                                j8 += j13;
                                if (iG > i17) {
                                    i17 = iG;
                                }
                                if (z3) {
                                    jArr[iM9] = j12;
                                    iArrCopyOf[iM9] = iG;
                                    j14 = j13;
                                    jArr4[iM9] = j7 + ((long) iM2);
                                    if (fq80Var3 == null) {
                                        i26 = 1;
                                    } else {
                                        i26 = 0;
                                    }
                                    iArr3[iM9] = i26;
                                    if (iM9 == iD3) {
                                        iArr3[iM9] = 1;
                                        arrayList3.add(Integer.valueOf(iM9));
                                    }
                                } else {
                                    j14 = j13;
                                }
                                if (fq80Var3 != null) {
                                    iD3 = fq80Var3.D() - 1;
                                }
                                j7 += (long) iD9;
                                iD5 = i20 - 1;
                                if (iD5 != 0) {
                                }
                                i18 = i24 - 1;
                                iM9++;
                                j9 = j12 + j14;
                                jArr2 = jArr4;
                                iArr = iArr3;
                                iD8 = iD5;
                                str4 = str12;
                                iD7 = i19;
                                iM9 = i25;
                            }
                            long j28 = j7 + ((long) iM2);
                            if (fq80Var2 != null) {
                                z8 = true;
                                break;
                            }
                            while (true) {
                                if (i15 > 0) {
                                    z8 = true;
                                    break;
                                }
                                if (fq80Var2.D() != 0) {
                                    z8 = false;
                                    break;
                                }
                                fq80Var2.m();
                                i15--;
                            }
                            if (i16 == 0) {
                                StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                                axq.r(lbs0Var4.f19766a, i16, ": remainingSynchronizationSamples ", ", remainingSamplesAtTimestampDelta ", sb2);
                                axq.r(i20, i21, ", remainingSamplesInChunk ", ", remainingTimestampDeltaChanges ", sb2);
                                sb2.append(i19);
                                sb2.append(", remainingSamplesAtTimestampOffset ");
                                sb2.append(iD4);
                                if (z8) {
                                    str3 = ", ctts invalid";
                                } else {
                                    str3 = "";
                                }
                                sb2.append(str3);
                                f1t0.g0(str2, sb2.toString());
                            } else {
                                StringBuilder sb3 = new StringBuilder("Inconsistent stbl box for track ");
                                axq.r(lbs0Var4.f19766a, i16, ": remainingSynchronizationSamples ", ", remainingSamplesAtTimestampDelta ", sb3);
                                axq.r(i20, i21, ", remainingSamplesInChunk ", ", remainingTimestampDeltaChanges ", sb3);
                                sb3.append(i19);
                                sb3.append(", remainingSamplesAtTimestampOffset ");
                                sb3.append(iD4);
                                if (z8) {
                                    str3 = ", ctts invalid";
                                } else {
                                    str3 = "";
                                }
                                sb3.append(str3);
                                f1t0.g0(str2, sb3.toString());
                            }
                            i22 = iM9;
                            j10 = j28;
                            i23 = i17;
                            iArr2 = iArrCopyOf;
                            j11 = j8;
                        }
                        jArr5 = jArr3;
                        iArr4 = iArrCopyOf2;
                        j15 = lbs0Var4.f;
                        if (j15 > j2) {
                            jT7 = vtt0.T(8 * j11, 1000000L, j15, RoundingMode.HALF_DOWN);
                            if (jT7 > j2) {
                                awq awqVarA7 = bVar6.a();
                                awqVarA7.i = (int) jT7;
                                androidx.media3.common.b bVar9 = new androidx.media3.common.b(awqVarA7);
                                kbs0 kbs0VarA4 = lbs0Var4.a();
                                kbs0VarA4.g = bVar9;
                                lbs0Var4 = new lbs0(kbs0VarA4);
                            }
                        }
                        i27 = lbs0Var4.b;
                        j16 = lbs0Var4.c;
                        bVar2 = lbs0Var4.g;
                        c4xVar3 = lbs0Var4.j;
                        c4xVar4 = lbs0Var4.i;
                        RoundingMode roundingMode3 = RoundingMode.DOWN;
                        jT3 = vtt0.T(j10, 1000000L, j16, roundingMode3);
                        iArrM0 = n6x.m0(arrayList3);
                        if (c4xVar4 == null) {
                            if (!z3) {
                                vtt0.S(jArrCopyOf, j16);
                            }
                            ocs0Var2 = new ocs0(lbs0Var4, jArr5, iArr2, i23, jArrCopyOf, iArr4, iArrM0, z7, jT3, i22);
                        } else {
                            jArr6 = jArrCopyOf;
                            i28 = c4xVar4.b;
                            if (z3) {
                                c4xVar3.getClass();
                                if (i28 == 1) {
                                    jA5 = j2;
                                    while (i49 < i28) {
                                        if (c4xVar3.a(i49) != -1) {
                                            jA5 = c4xVar4.a(i49) + jA5;
                                        }
                                    }
                                    jT6 = vtt0.T(jA5, 1000000L, lbs0Var4.d, RoundingMode.DOWN);
                                } else {
                                    jA5 = j2;
                                    while (i49 < i28) {
                                        if (c4xVar3.a(i49) != -1) {
                                            jA5 = c4xVar4.a(i49) + jA5;
                                        }
                                    }
                                    jT6 = vtt0.T(jA5, 1000000L, lbs0Var4.d, RoundingMode.DOWN);
                                }
                                ocs0Var2 = new ocs0(lbs0Var4, jArr5, iArr2, i23, jArr6, iArr4, iArrM0, z7, jT6, i22);
                            } else {
                                lbs0Var2 = lbs0Var4;
                                i29 = 1;
                                if (i28 != 1) {
                                    if (i28 == i29) {
                                        if (c4xVar4.a(0) == 0) {
                                            c4xVar3.getClass();
                                            jA4 = c4xVar3.a(0);
                                            while (i48 < jArr6.length) {
                                                jArr6[i48] = vtt0.T(jArr6[i48] - jA4, 1000000L, lbs0Var2.c, RoundingMode.DOWN);
                                            }
                                            ocs0Var2 = new ocs0(lbs0Var2, jArr5, iArr2, i23, jArr6, iArr4, iArrM0, z7, vtt0.T(j10 - jA4, 1000000L, lbs0Var2.c, RoundingMode.DOWN), i22);
                                        } else {
                                            i29 = 1;
                                        }
                                    }
                                    jArr7 = jArr5;
                                    iArr5 = iArr2;
                                    iArr6 = iArr4;
                                    i30 = i22;
                                    if (i27 == i29) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    iArr7 = new int[i28];
                                    iArr8 = new int[i28];
                                    c4xVar3.getClass();
                                    i31 = 0;
                                    i32 = 0;
                                    i33 = 0;
                                    z10 = false;
                                    while (i33 < i28) {
                                        int[] iArr110 = iArr5;
                                        int[] iArr111 = iArr6;
                                        jA3 = c4xVar3.a(i33);
                                        if (jA3 != -1) {
                                            iArr15 = iArr8;
                                            i40 = i33;
                                            jT5 = vtt0.T(c4xVar4.a(i33), lbs0Var2.c, lbs0Var2.d, RoundingMode.DOWN) + jA3;
                                            boolean z110 = z10;
                                            iArr7[i40] = vtt0.f(jArr6, jA3, true);
                                            int iB2 = vtt0.b(jArr6, jT5, z9);
                                            i41 = iB2 - 1;
                                            i43 = 0;
                                            while (i42 < jArr6.length) {
                                                if (jArr6[i42] >= jT5) {
                                                    i43++;
                                                    if (i43 > bVar2.r) {
                                                        break;
                                                        break;
                                                    }
                                                } else {
                                                    i41 = i42;
                                                }
                                            }
                                            iArr15[i40] = i41 + 1;
                                            i44 = iArr7[i40];
                                            while (true) {
                                                i45 = iArr7[i40];
                                                if (i45 > 0) {
                                                    break;
                                                }
                                                iArr7[i40] = i45 - 1;
                                            }
                                            if (i45 == 0) {
                                                iArr7[i40] = i44;
                                                while (true) {
                                                    i47 = iArr7[i40];
                                                    if (i47 < iArr15[i40]) {
                                                        break;
                                                    }
                                                    break;
                                                    break;
                                                    iArr7[i40] = i47 + 1;
                                                }
                                            }
                                            int i87 = iArr15[i40];
                                            i46 = iArr7[i40];
                                            int i88 = (i87 - i46) + i31;
                                            if (i32 != i46) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                            i32 = i87;
                                            z10 = z110 | z15;
                                            i31 = i88;
                                        } else {
                                            iArr15 = iArr8;
                                            i40 = i33;
                                        }
                                        i33 = i40 + 1;
                                        iArr8 = iArr15;
                                        z9 = z9;
                                        iArr5 = iArr110;
                                        iArr6 = iArr111;
                                    }
                                    iArr9 = iArr5;
                                    iArr10 = iArr6;
                                    iArr11 = iArr8;
                                    boolean z21 = z10;
                                    if (i31 != i30) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    z12 = z21 | z11;
                                    if (z12) {
                                        jArr8 = new long[i31];
                                    } else {
                                        jArr8 = jArr7;
                                    }
                                    if (z12) {
                                        iArr12 = new int[i31];
                                    } else {
                                        iArr12 = iArr9;
                                    }
                                    if (z12) {
                                        i23 = 0;
                                    }
                                    if (z12) {
                                        iArr13 = new int[i31];
                                    } else {
                                        iArr13 = iArr10;
                                    }
                                    if (z12) {
                                        arrayList4 = new ArrayList();
                                    } else {
                                        arrayList4 = arrayList3;
                                    }
                                    jArr9 = new long[i31];
                                    i34 = 0;
                                    z13 = false;
                                    i35 = 0;
                                    jA = 0;
                                    while (i34 < i28) {
                                        jA2 = c4xVar3.a(i34);
                                        z14 = z12;
                                        i36 = iArr7[i34];
                                        jArr10 = jArr9;
                                        i37 = iArr11[i34];
                                        if (z14) {
                                            int i89 = i37 - i36;
                                            System.arraycopy(jArr7, i36, jArr8, i35, i89);
                                            System.arraycopy(iArr9, i36, iArr12, i35, i89);
                                            iArr14 = iArr10;
                                            System.arraycopy(iArr14, i36, iArr13, i35, i89);
                                        } else {
                                            iArr14 = iArr10;
                                        }
                                        i38 = i23;
                                        while (i36 < i37) {
                                            i39 = i36;
                                            int[] iArr21 = iArr14;
                                            long j29 = lbs0Var2.d;
                                            RoundingMode roundingMode4 = RoundingMode.DOWN;
                                            long jT14 = vtt0.T(jA, 1000000L, j29, roundingMode4);
                                            jT4 = vtt0.T(jArr6[i39] - jA2, 1000000L, lbs0Var2.c, roundingMode4);
                                            if (jT4 < 0) {
                                                z13 = true;
                                            }
                                            jArr10[i35] = jT14 + jT4;
                                            if (z14) {
                                                i38 = iArr9[i39];
                                            }
                                            if (!z14) {
                                            }
                                            i35++;
                                            i36 = i39 + 1;
                                            iArr14 = iArr21;
                                        }
                                        iArr10 = iArr14;
                                        jA = c4xVar4.a(i34) + jA;
                                        i34++;
                                        i23 = i38;
                                        z12 = z14;
                                        bVar2 = bVar2;
                                        jArr7 = jArr7;
                                        jArr9 = jArr10;
                                    }
                                    long[] jArr16 = jArr9;
                                    bVar3 = bVar2;
                                    long jT15 = vtt0.T(jA, 1000000L, lbs0Var2.d, RoundingMode.DOWN);
                                    if (z13) {
                                        awq awqVarA8 = bVar3.a();
                                        awqVarA8.u = true;
                                        androidx.media3.common.b bVar10 = new androidx.media3.common.b(awqVarA8);
                                        kbs0 kbs0VarA5 = lbs0Var2.a();
                                        kbs0VarA5.g = bVar10;
                                        lbs0Var3 = new lbs0(kbs0VarA5);
                                    } else {
                                        lbs0Var3 = lbs0Var2;
                                    }
                                    arrayList2 = arrayList2;
                                    ocs0Var = new ocs0(lbs0Var3, jArr8, iArr12, i23, jArr16, iArr13, n6x.m0(arrayList4), z7, jT15, jArr8.length);
                                    arrayList2.add(ocs0Var);
                                } else {
                                    if (i28 == i29) {
                                        if (c4xVar4.a(0) == 0) {
                                            c4xVar3.getClass();
                                            jA4 = c4xVar3.a(0);
                                            while (i48 < jArr6.length) {
                                                jArr6[i48] = vtt0.T(jArr6[i48] - jA4, 1000000L, lbs0Var2.c, RoundingMode.DOWN);
                                            }
                                            ocs0Var2 = new ocs0(lbs0Var2, jArr5, iArr2, i23, jArr6, iArr4, iArrM0, z7, vtt0.T(j10 - jA4, 1000000L, lbs0Var2.c, RoundingMode.DOWN), i22);
                                        } else {
                                            i29 = 1;
                                        }
                                    }
                                    jArr7 = jArr5;
                                    iArr5 = iArr2;
                                    iArr6 = iArr4;
                                    i30 = i22;
                                    if (i27 == i29) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    iArr7 = new int[i28];
                                    iArr8 = new int[i28];
                                    c4xVar3.getClass();
                                    i31 = 0;
                                    i32 = 0;
                                    i33 = 0;
                                    z10 = false;
                                    while (i33 < i28) {
                                        int[] iArr112 = iArr5;
                                        int[] iArr113 = iArr6;
                                        jA3 = c4xVar3.a(i33);
                                        if (jA3 != -1) {
                                            iArr15 = iArr8;
                                            i40 = i33;
                                            jT5 = vtt0.T(c4xVar4.a(i33), lbs0Var2.c, lbs0Var2.d, RoundingMode.DOWN) + jA3;
                                            boolean z111 = z10;
                                            iArr7[i40] = vtt0.f(jArr6, jA3, true);
                                            int iB3 = vtt0.b(jArr6, jT5, z9);
                                            i41 = iB3 - 1;
                                            i43 = 0;
                                            while (i42 < jArr6.length) {
                                                if (jArr6[i42] >= jT5) {
                                                    i43++;
                                                    if (i43 > bVar2.r) {
                                                        break;
                                                        break;
                                                    }
                                                } else {
                                                    i41 = i42;
                                                }
                                            }
                                            iArr15[i40] = i41 + 1;
                                            i44 = iArr7[i40];
                                            while (true) {
                                                i45 = iArr7[i40];
                                                if (i45 > 0) {
                                                    break;
                                                    break;
                                                }
                                                iArr7[i40] = i45 - 1;
                                            }
                                            if (i45 == 0) {
                                                iArr7[i40] = i44;
                                                while (true) {
                                                    i47 = iArr7[i40];
                                                    if (i47 < iArr15[i40]) {
                                                        break;
                                                        break;
                                                    }
                                                    break;
                                                    break;
                                                    iArr7[i40] = i47 + 1;
                                                }
                                            }
                                            int i810 = iArr15[i40];
                                            i46 = iArr7[i40];
                                            int i811 = (i810 - i46) + i31;
                                            if (i32 != i46) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                            i32 = i810;
                                            z10 = z111 | z15;
                                            i31 = i811;
                                        } else {
                                            iArr15 = iArr8;
                                            i40 = i33;
                                        }
                                        i33 = i40 + 1;
                                        iArr8 = iArr15;
                                        z9 = z9;
                                        iArr5 = iArr112;
                                        iArr6 = iArr113;
                                    }
                                    iArr9 = iArr5;
                                    iArr10 = iArr6;
                                    iArr11 = iArr8;
                                    boolean z22 = z10;
                                    if (i31 != i30) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    z12 = z22 | z11;
                                    if (z12) {
                                        jArr8 = new long[i31];
                                    } else {
                                        jArr8 = jArr7;
                                    }
                                    if (z12) {
                                        iArr12 = new int[i31];
                                    } else {
                                        iArr12 = iArr9;
                                    }
                                    if (z12) {
                                        i23 = 0;
                                    }
                                    if (z12) {
                                        iArr13 = new int[i31];
                                    } else {
                                        iArr13 = iArr10;
                                    }
                                    if (z12) {
                                        arrayList4 = new ArrayList();
                                    } else {
                                        arrayList4 = arrayList3;
                                    }
                                    jArr9 = new long[i31];
                                    i34 = 0;
                                    z13 = false;
                                    i35 = 0;
                                    jA = 0;
                                    while (i34 < i28) {
                                        jA2 = c4xVar3.a(i34);
                                        z14 = z12;
                                        i36 = iArr7[i34];
                                        jArr10 = jArr9;
                                        i37 = iArr11[i34];
                                        if (z14) {
                                            int i812 = i37 - i36;
                                            System.arraycopy(jArr7, i36, jArr8, i35, i812);
                                            System.arraycopy(iArr9, i36, iArr12, i35, i812);
                                            iArr14 = iArr10;
                                            System.arraycopy(iArr14, i36, iArr13, i35, i812);
                                        } else {
                                            iArr14 = iArr10;
                                        }
                                        i38 = i23;
                                        while (i36 < i37) {
                                            i39 = i36;
                                            int[] iArr22 = iArr14;
                                            long j210 = lbs0Var2.d;
                                            RoundingMode roundingMode5 = RoundingMode.DOWN;
                                            long jT16 = vtt0.T(jA, 1000000L, j210, roundingMode5);
                                            jT4 = vtt0.T(jArr6[i39] - jA2, 1000000L, lbs0Var2.c, roundingMode5);
                                            if (jT4 < 0) {
                                                z13 = true;
                                            }
                                            jArr10[i35] = jT16 + jT4;
                                            if (z14) {
                                                i38 = iArr9[i39];
                                            }
                                            if (!z14) {
                                            }
                                            i35++;
                                            i36 = i39 + 1;
                                            iArr14 = iArr22;
                                        }
                                        iArr10 = iArr14;
                                        jA = c4xVar4.a(i34) + jA;
                                        i34++;
                                        i23 = i38;
                                        z12 = z14;
                                        bVar2 = bVar2;
                                        jArr7 = jArr7;
                                        jArr9 = jArr10;
                                    }
                                    long[] jArr17 = jArr9;
                                    bVar3 = bVar2;
                                    long jT17 = vtt0.T(jA, 1000000L, lbs0Var2.d, RoundingMode.DOWN);
                                    if (z13) {
                                        awq awqVarA9 = bVar3.a();
                                        awqVarA9.u = true;
                                        androidx.media3.common.b bVar11 = new androidx.media3.common.b(awqVarA9);
                                        kbs0 kbs0VarA6 = lbs0Var2.a();
                                        kbs0VarA6.g = bVar11;
                                        lbs0Var3 = new lbs0(kbs0VarA6);
                                    } else {
                                        lbs0Var3 = lbs0Var2;
                                    }
                                    arrayList2 = arrayList2;
                                    ocs0Var = new ocs0(lbs0Var3, jArr8, iArr12, i23, jArr17, iArr13, n6x.m0(arrayList4), z7, jT17, jArr8.length);
                                    arrayList2.add(ocs0Var);
                                }
                            }
                        }
                        ocs0Var = ocs0Var2;
                    }
                    arrayList2.add(ocs0Var);
                }
            }
            i60 = i2 + 1;
            ev40Var2 = ev40Var;
            arrayList6 = arrayList2;
            arrayList5 = arrayList;
        }
        return arrayList6;
    }

    /* JADX WARN: Code duplicated, block: B:163:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:214:0x0379  */
    /* JADX WARN: Code duplicated, block: B:217:0x037e A[EDGE_INSN: B:217:0x037e->B:220:0x039f BREAK  A[LOOP:4: B:177:0x0309->B:218:0x0391]] */
    /* JADX WARN: Code duplicated, block: B:276:0x02c8 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean, int] */
    public static ed40 k(fv40 fv40Var, boolean z) {
        int i;
        boolean z2;
        ed40 ed40Var;
        ed40 ed40VarB;
        ed40 ed40Var2;
        ed40 ed40Var3;
        int iA;
        ed40 ed40Var4;
        Object objW;
        fq80 fq80Var = fv40Var.e;
        int i2 = 8;
        fq80Var.M(8);
        ed40 ed40Var5 = new ed40(new cd40[0]);
        while (fq80Var.a() >= i2) {
            int i3 = fq80Var.b;
            int iM = fq80Var.m();
            int iM2 = fq80Var.m();
            boolean z3 = true;
            String str = null;
            if (iM2 == 1835365473) {
                fq80Var.M(i3);
                int i4 = i3 + iM;
                fq80Var.N(i2);
                a(fq80Var);
                while (true) {
                    int i5 = fq80Var.b;
                    if (i5 < i4) {
                        int iM3 = fq80Var.m();
                        if (fq80Var.m() == 1768715124) {
                            fq80Var.M(i5);
                            int i6 = i5 + iM3;
                            fq80Var.N(i2);
                            ArrayList arrayList = new ArrayList();
                            ?? r11 = z3;
                            while (true) {
                                int i7 = fq80Var.b;
                                if (i7 >= i6) {
                                    break;
                                }
                                int iM4 = fq80Var.m();
                                if (iM4 < i2) {
                                    f1t0.g0("MetadataUtil", "Skipped empty metadata entry");
                                } else {
                                    int i8 = i7 + iM4;
                                    int iM5 = fq80Var.m();
                                    int i9 = (iM5 >> 24) & 255;
                                    try {
                                        if (i8 - fq80Var.b < i2) {
                                            f1t0.g0("MetadataUtil", "Skipped empty metadata entry: ".concat(syx.k(iM5)));
                                            fq80Var.M(i8);
                                        } else if (i9 == 169 || i9 == 253) {
                                            int i10 = 16777215 & iM5;
                                            if (i10 == 6516084) {
                                                int iM6 = fq80Var.m();
                                                if (fq80Var.m() == 1684108385) {
                                                    fq80Var.N(8);
                                                    String strV = fq80Var.v(iM6 - 16);
                                                    objW = new k8d("und", strV, strV);
                                                } else {
                                                    f1t0.g0("MetadataUtil", "Failed to parse comment attribute: ".concat(syx.k(iM5)));
                                                    objW = null;
                                                }
                                            } else if (i10 == 7233901 || i10 == 7631467) {
                                                objW = l7x.W(iM5, fq80Var, "TIT2");
                                            } else if (i10 == 6516589 || i10 == 7828084) {
                                                objW = l7x.W(iM5, fq80Var, "TCOM");
                                            } else if (i10 == 6578553) {
                                                objW = l7x.W(iM5, fq80Var, "TDRC");
                                            } else if (i10 == 4280916) {
                                                objW = l7x.W(iM5, fq80Var, "TPE1");
                                            } else if (i10 == 7630703) {
                                                objW = l7x.W(iM5, fq80Var, "TSSE");
                                            } else if (i10 == 6384738) {
                                                objW = l7x.W(iM5, fq80Var, "TALB");
                                            } else if (i10 == 7108978) {
                                                objW = l7x.W(iM5, fq80Var, "USLT");
                                            } else if (i10 == 6776174) {
                                                objW = l7x.W(iM5, fq80Var, "TCON");
                                            } else if (i10 == 6779504) {
                                                objW = l7x.W(iM5, fq80Var, "TIT1");
                                            } else if (i10 == 7173742) {
                                                objW = l7x.W(iM5, fq80Var, "MVNM");
                                            } else if (i10 == 7173737) {
                                                fxw fxwVarV = l7x.V(iM5, "MVIN", fq80Var, true, false);
                                                fq80Var.M(i8);
                                                objW = fxwVarV;
                                            } else {
                                                f1t0.P("MetadataUtil", "Skipped unknown metadata entry: ".concat(syx.k(iM5)));
                                                fq80Var.M(i8);
                                                objW = null;
                                            }
                                            fq80Var.M(i8);
                                        } else {
                                            if (iM5 == 1735291493) {
                                                String strA = gxw.a(l7x.U(fq80Var) - r11);
                                                if (strA != null) {
                                                    objW = new h8q0("TCON", str, b4x.t(strA));
                                                } else {
                                                    f1t0.g0("MetadataUtil", "Failed to parse standard genre code");
                                                }
                                            } else if (iM5 == 1684632427) {
                                                objW = l7x.T(iM5, fq80Var, "TPOS");
                                            } else if (iM5 == 1953655662) {
                                                objW = l7x.T(iM5, fq80Var, "TRCK");
                                            } else if (iM5 == 1953329263) {
                                                objW = l7x.V(iM5, "TBPM", fq80Var, r11, false);
                                            } else if (iM5 == 1668311404) {
                                                objW = l7x.V(iM5, "TCMP", fq80Var, r11, r11);
                                            } else if (iM5 == 1668249202) {
                                                objW = z ? str : l7x.S(fq80Var);
                                            } else if (iM5 == 1631670868) {
                                                objW = l7x.W(iM5, fq80Var, "TPE2");
                                            } else if (iM5 == 1936682605) {
                                                objW = l7x.W(iM5, fq80Var, "TSOT");
                                            } else if (iM5 == 1936679276) {
                                                objW = l7x.W(iM5, fq80Var, "TSOA");
                                            } else if (iM5 == 1936679282) {
                                                objW = l7x.W(iM5, fq80Var, "TSOP");
                                            } else if (iM5 == 1936679265) {
                                                objW = l7x.W(iM5, fq80Var, "TSO2");
                                            } else if (iM5 == 1936679791) {
                                                objW = l7x.W(iM5, fq80Var, "TSOC");
                                            } else if (iM5 == 1920233063) {
                                                objW = l7x.V(iM5, "ITUNESADVISORY", fq80Var, false, false);
                                            } else if (iM5 == 1885823344) {
                                                objW = l7x.V(iM5, "ITUNESGAPLESS", fq80Var, false, r11);
                                            } else if (iM5 == 1936683886) {
                                                objW = l7x.W(iM5, fq80Var, "TVSHOWSORT");
                                            } else if (iM5 == 1953919848) {
                                                objW = l7x.W(iM5, fq80Var, "TVSHOW");
                                            } else if (iM5 == 757935405) {
                                                String strV2 = str;
                                                String strV3 = strV2;
                                                int i11 = -1;
                                                int i12 = -1;
                                                while (true) {
                                                    int i13 = fq80Var.b;
                                                    if (i13 >= i8) {
                                                        break;
                                                    }
                                                    int iM7 = fq80Var.m();
                                                    int iM8 = fq80Var.m();
                                                    fq80Var.N(4);
                                                    if (iM8 == 1835360622) {
                                                        strV2 = fq80Var.v(iM7 - 12);
                                                    } else if (iM8 == 1851878757) {
                                                        strV3 = fq80Var.v(iM7 - 12);
                                                    } else {
                                                        if (iM8 == 1684108385) {
                                                            i11 = i13;
                                                            i12 = iM7;
                                                        }
                                                        fq80Var.N(iM7 - 12);
                                                    }
                                                }
                                                if (strV2 == null || strV3 == null || i11 == -1) {
                                                    objW = null;
                                                } else {
                                                    fq80Var.M(i11);
                                                    fq80Var.N(16);
                                                    objW = new jmx(strV2, strV3, fq80Var.v(i12 - 16));
                                                }
                                                fq80Var.M(i8);
                                            } else {
                                                f1t0.P("MetadataUtil", "Skipped unknown metadata entry: ".concat(syx.k(iM5)));
                                                fq80Var.M(i8);
                                                objW = null;
                                            }
                                            fq80Var.M(i8);
                                        }
                                        if (objW != null) {
                                            arrayList.add(objW);
                                        }
                                        i2 = 8;
                                        r11 = 1;
                                        str = null;
                                    } catch (Throwable th) {
                                        fq80Var.M(i8);
                                        throw th;
                                    }
                                }
                                objW = str;
                                if (objW != null) {
                                    arrayList.add(objW);
                                }
                                i2 = 8;
                                r11 = 1;
                                str = null;
                            }
                            if (!arrayList.isEmpty()) {
                                ed40Var4 = new ed40(arrayList);
                                break;
                            }
                            break;
                        }
                        fq80Var.M(i5 + iM3);
                        i2 = 8;
                        z3 = true;
                        str = null;
                    }
                    ed40Var4 = null;
                    break;
                }
                ed40Var5 = ed40Var5.b(ed40Var4);
                i = 8;
            } else {
                if (iM2 == 1936553057) {
                    fq80Var.M(i3);
                    int i14 = i3 + iM;
                    fq80Var.N(12);
                    while (true) {
                        int i15 = fq80Var.b;
                        if (i15 < i14) {
                            int iM9 = fq80Var.m();
                            if (fq80Var.m() == 1935766900) {
                                if (iM9 >= 16) {
                                    fq80Var.N(4);
                                    int i16 = -1;
                                    int i17 = 0;
                                    for (int i18 = 0; i18 < 2; i18++) {
                                        int iZ = fq80Var.z();
                                        int iZ2 = fq80Var.z();
                                        if (iZ == 0) {
                                            i16 = iZ2;
                                        } else if (iZ == 1) {
                                            i17 = iZ2;
                                        }
                                    }
                                    if (i16 != 12) {
                                        if (i16 != 13) {
                                            if (i16 != 21) {
                                                iA = -2147483647;
                                            } else {
                                                i = 8;
                                                if (fq80Var.a() < 8 || fq80Var.b + 8 > i14) {
                                                    iA = -2147483647;
                                                } else {
                                                    int iM10 = fq80Var.m();
                                                    int iM11 = fq80Var.m();
                                                    if (iM10 < 12 || iM11 != 1936877170) {
                                                        iA = -2147483647;
                                                    } else {
                                                        iA = fq80Var.A();
                                                    }
                                                }
                                            }
                                            if (iA == -2147483647) {
                                                ed40Var3 = new ed40(new gdk0(iA, i17));
                                                break;
                                            }
                                            break;
                                        }
                                        iA = 120;
                                    } else {
                                        iA = 240;
                                    }
                                    i = 8;
                                    if (iA == -2147483647) {
                                        ed40Var3 = new ed40(new gdk0(iA, i17));
                                        break;
                                    }
                                    break;
                                }
                                ed40Var3 = null;
                                i = 8;
                                break;
                            }
                            fq80Var.M(i15 + iM9);
                        } else {
                            i = 8;
                        }
                        ed40Var3 = null;
                        break;
                    }
                    ed40Var5 = ed40Var5.b(ed40Var3);
                } else {
                    i = 8;
                    if (iM2 == -1451722374) {
                        short sW = fq80Var.w();
                        fq80Var.N(2);
                        String strX = fq80Var.x(sW, StandardCharsets.UTF_8);
                        int iMax = Math.max(strX.lastIndexOf(43), strX.lastIndexOf(45));
                        try {
                            try {
                                jv40 jv40Var = new jv40(Float.parseFloat(strX.substring(0, iMax)), Float.parseFloat(strX.substring(iMax, strX.length() - 1)));
                                cd40[] cd40VarArr = new cd40[1];
                                z2 = false;
                                try {
                                    cd40VarArr[0] = jv40Var;
                                    ed40Var2 = new ed40(cd40VarArr);
                                } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                    ed40Var2 = null;
                                }
                            } catch (IndexOutOfBoundsException | NumberFormatException unused2) {
                                z2 = false;
                            }
                        } catch (IndexOutOfBoundsException | NumberFormatException unused3) {
                            z2 = false;
                        }
                        ed40VarB = ed40Var5.b(ed40Var2);
                    } else {
                        z2 = false;
                        if (iM2 == 1667788908) {
                            try {
                                fq80Var.N(5);
                                int iM12 = fq80Var.m();
                                ArrayList arrayList2 = new ArrayList();
                                for (int i19 = 0; i19 < iM12; i19++) {
                                    long jT = fq80Var.t() / 10000;
                                    if (jT < 0) {
                                        jT = -9223372036854775807L;
                                    }
                                    ed40Var = null;
                                    try {
                                        arrayList2.add(new gub(jT, -9223372036854775807L, false, new uty(null, fq80Var.x(fq80Var.z(), StandardCharsets.UTF_8))));
                                    } catch (IndexOutOfBoundsException unused4) {
                                    }
                                }
                                ed40Var = null;
                                if (!arrayList2.isEmpty()) {
                                    ed40Var = new ed40(arrayList2);
                                }
                            } catch (IndexOutOfBoundsException unused5) {
                                ed40Var = null;
                            }
                            ed40VarB = ed40Var5.b(ed40Var);
                        }
                    }
                    ed40Var5 = ed40VarB;
                }
                fq80Var.M(i3 + iM);
                i2 = i;
            }
            z2 = false;
            fq80Var.M(i3 + iM);
            i2 = i;
        }
        return ed40Var5;
    }
}
