package a;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class vc00 implements ba5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b4x f37165a;
    public final int b;

    public vc00(int i, rcf0 rcf0Var) {
        this.b = i;
        this.f37165a = rcf0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static vc00 b(int i, fq80 fq80Var) {
        String str;
        ba5 hrm0Var;
        String str2;
        int i2 = 4;
        e3c.s(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i3 = fq80Var.c;
        int iA = -2;
        int i4 = 0;
        while (fq80Var.a() > 8) {
            int iO = fq80Var.o();
            int iO2 = fq80Var.b + fq80Var.o();
            fq80Var.L(iO2);
            if (iO != 1414744396) {
                fa5 fa5Var = null;
                switch (iO) {
                    case 1718776947:
                        if (iA != 2) {
                            if (iA == 1) {
                                int iS = fq80Var.s();
                                if (iS == 1) {
                                    str = "audio/raw";
                                } else if (iS == 85) {
                                    str = "audio/mpeg";
                                } else if (iS == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (iS != 8192) {
                                    str = iS != 8193 ? null : "audio/vnd.dts";
                                } else {
                                    str = "audio/ac3";
                                }
                                if (str != null) {
                                    int iS2 = fq80Var.s();
                                    int iO3 = fq80Var.o();
                                    fq80Var.N(6);
                                    int iS3 = fq80Var.s();
                                    String str3 = vtt0.f38024a;
                                    int iZ = vtt0.z(iS3, ByteOrder.LITTLE_ENDIAN);
                                    int iS4 = fq80Var.a() > 0 ? fq80Var.s() : 0;
                                    awq awqVar = new awq();
                                    awqVar.o = mg40.n(str);
                                    awqVar.I = iS2;
                                    awqVar.K = iO3;
                                    if (str.equals("audio/raw") && iZ != 0) {
                                        awqVar.L = iZ;
                                    }
                                    if (str.equals("audio/mp4a-latm") && iS4 > 0) {
                                        byte[] bArr = new byte[iS4];
                                        fq80Var.k(bArr, 0, iS4);
                                        awqVar.r = b4x.t(bArr);
                                    }
                                    hrm0Var = new hrm0(new androidx.media3.common.b(awqVar));
                                } else {
                                    rw2.u(iS, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                f1t0.g0("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(vtt0.D(iA)));
                            }
                            hrm0Var = fa5Var;
                            break;
                        } else {
                            fq80Var.N(i2);
                            int iO4 = fq80Var.o();
                            int iO5 = fq80Var.o();
                            fq80Var.N(i2);
                            int iO6 = fq80Var.o();
                            switch (iO6) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                awq awqVar2 = new awq();
                                awqVar2.v = iO4;
                                awqVar2.w = iO5;
                                awqVar2.o = mg40.n(str2);
                                hrm0Var = new hrm0(new androidx.media3.common.b(awqVar2));
                            } else {
                                rw2.u(iO6, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                hrm0Var = fa5Var;
                            }
                        }
                        break;
                    case 1751742049:
                        int iO7 = fq80Var.o();
                        fq80Var.N(8);
                        int iO8 = fq80Var.o();
                        int iO9 = fq80Var.o();
                        fq80Var.N(i2);
                        fq80Var.o();
                        fq80Var.N(12);
                        hrm0Var = new ea5(iO7, iO8, iO9);
                        break;
                    case 1752331379:
                        int iO10 = fq80Var.o();
                        fq80Var.N(12);
                        fq80Var.o();
                        int iO11 = fq80Var.o();
                        int iO12 = fq80Var.o();
                        fq80Var.N(i2);
                        int iO13 = fq80Var.o();
                        int iO14 = fq80Var.o();
                        fq80Var.N(i2);
                        fa5Var = new fa5(iO10, iO11, iO12, iO13, iO14, fq80Var.o());
                        hrm0Var = fa5Var;
                        break;
                    case 1852994675:
                        hrm0Var = new nrm0(fq80Var.x(fq80Var.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        hrm0Var = fa5Var;
                        break;
                }
            } else {
                hrm0Var = b(fq80Var.o(), fq80Var);
            }
            if (hrm0Var != null) {
                if (hrm0Var.getType() == 1752331379) {
                    iA = ((fa5) hrm0Var).a();
                }
                int i5 = i4 + 1;
                int iE = r3x.e(objArrCopyOf.length, i5);
                if (iE > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iE);
                }
                objArrCopyOf[i4] = hrm0Var;
                i4 = i5;
            }
            fq80Var.M(iO2);
            fq80Var.L(i3);
            i2 = 4;
        }
        return new vc00(i, b4x.k(i4, objArrCopyOf));
    }

    public final ba5 a(Class cls) {
        v3x v3xVarListIterator = this.f37165a.listIterator(0);
        while (v3xVarListIterator.hasNext()) {
            ba5 ba5Var = (ba5) v3xVarListIterator.next();
            if (ba5Var.getClass() == cls) {
                return ba5Var;
            }
        }
        return null;
    }

    @Override // a.ba5
    public final int getType() {
        return this.b;
    }
}
