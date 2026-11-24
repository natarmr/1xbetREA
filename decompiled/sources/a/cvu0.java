package a;

import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.huawei.hms.android.HwBuildEx;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class cvu0 implements lfn0 {
    public static final ftf e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fq80 f5048a = new fq80();
    public final fq80 b = new fq80();
    public final bvu0 c;
    public Inflater d;

    static {
        v3x v3xVar = b4x.b;
        e = new ftf(-9223372036854775807L, -9223372036854775807L, rcf0.e);
    }

    public cvu0(List list) {
        int i;
        bvu0 bvu0Var = new bvu0();
        this.c = bvu0Var;
        String strTrim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        String str = vtt0.f38024a;
        for (String str2 : strTrim.split("\\r?\\n", -1)) {
            if (str2.startsWith("palette: ")) {
                String[] strArrSplit = str2.substring(9).split(Separators.COMMA, -1);
                bvu0Var.f = new int[strArrSplit.length];
                for (int i2 = 0; i2 < strArrSplit.length; i2++) {
                    int[] iArr = bvu0Var.f;
                    try {
                        i = Integer.parseInt(strArrSplit[i2].trim(), 16);
                    } catch (RuntimeException e2) {
                        f1t0.h0("VobsubParser", "Parsing color failed", e2);
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            } else if (str2.startsWith("size: ")) {
                String[] strArrSplit2 = str2.substring(6).trim().split("x", -1);
                if (strArrSplit2.length != 2) {
                    f1t0.g0("VobsubParser", "Ignoring malformed IDX size line: '" + str2 + Separators.QUOTE);
                } else {
                    try {
                        bvu0Var.g = Integer.parseInt(strArrSplit2[0]);
                        bvu0Var.h = Integer.parseInt(strArrSplit2[1]);
                        bvu0Var.d = true;
                    } catch (RuntimeException e3) {
                        f1t0.h0("VobsubParser", "Parsing IDX failed", e3);
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x028c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0292  */
    /* JADX WARN: Code duplicated, block: B:106:0x0298  */
    /* JADX WARN: Code duplicated, block: B:92:0x0278  */
    /* JADX WARN: Code duplicated, block: B:95:0x027f  */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x00c9. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.lfn0
    public final void d(byte[] bArr, int i, int i2, kfn0 kfn0Var, rbe rbeVar) {
        ftf ftfVar;
        char c;
        long j;
        char c2;
        ctf ctfVar;
        long j2;
        long j3;
        rcf0 rcf0VarT;
        long j4;
        Rect rect;
        fq80 fq80Var = this.f5048a;
        fq80Var.K(bArr, i + i2);
        fq80Var.M(i);
        Inflater inflater = this.d;
        if (inflater == null) {
            inflater = new Inflater();
            this.d = inflater;
        }
        String str = vtt0.f38024a;
        if (fq80Var.a() > 0 && fq80Var.j() == 120) {
            fq80 fq80Var2 = this.b;
            if (vtt0.G(fq80Var, fq80Var2, inflater)) {
                fq80Var.K(fq80Var2.f9961a, fq80Var2.c);
            }
        }
        bvu0 bvu0Var = this.c;
        long j5 = -9223372036854775807L;
        bvu0Var.b = -9223372036854775807L;
        bvu0Var.c = -9223372036854775807L;
        char c3 = 0;
        bvu0Var.e = false;
        bvu0Var.i = null;
        bvu0Var.j = -1;
        bvu0Var.k = -1;
        int iA = fq80Var.a();
        if (iA < 2 || fq80Var.G() != iA) {
            ftfVar = e;
        } else {
            if (bvu0Var.f == null) {
                f1t0.g0("VobsubParser", "Skipping SPU (no palette)");
            } else {
                if (bvu0Var.d) {
                    int i3 = fq80Var.b - 2;
                    fq80Var.M(fq80Var.G() + i3);
                    while (true) {
                        if (fq80Var.a() < 4) {
                            j = j5;
                            c2 = c3;
                            c = c2;
                        } else {
                            int i4 = fq80Var.b;
                            int iG = fq80Var.G() * HwBuildEx.VersionCodes.CUR_DEVELOPMENT;
                            int iG2 = fq80Var.G() + i3;
                            c = (iG2 == i4 || iG2 >= fq80Var.c) ? c3 : (char) 1;
                            int i5 = c != 0 ? iG2 : fq80Var.c;
                            j = j5;
                            char c4 = 1;
                            while (fq80Var.b < i5 && c4 != 0) {
                                long j6 = iG;
                                int[] iArr = bvu0Var.f3294a;
                                char c5 = c3;
                                int iZ = fq80Var.z();
                                if (iZ != 255) {
                                    switch (iZ) {
                                        case 0:
                                            c4 = 1;
                                            break;
                                        case 1:
                                            bvu0Var.b = j6;
                                            c4 = 1;
                                            break;
                                        case 2:
                                            bvu0Var.c = j6;
                                            c4 = 1;
                                            break;
                                        case 3:
                                            if (fq80Var.a() >= 2) {
                                                int iZ2 = fq80Var.z();
                                                int iZ3 = fq80Var.z();
                                                iArr[3] = bvu0.a(bvu0Var.f, iZ2 >> 4);
                                                iArr[2] = bvu0.a(bvu0Var.f, iZ2 & 15);
                                                iArr[1] = bvu0.a(bvu0Var.f, iZ3 >> 4);
                                                iArr[c5] = bvu0.a(bvu0Var.f, iZ3 & 15);
                                                bvu0Var.e = true;
                                                c4 = 1;
                                            } else {
                                                f1t0.g0("VobsubParser", "Incomplete color command");
                                                c4 = c5;
                                            }
                                            break;
                                        case 4:
                                            if (fq80Var.a() < 2) {
                                                f1t0.g0("VobsubParser", "Incomplete alpha command");
                                            } else if (bvu0Var.e) {
                                                int iZ4 = fq80Var.z();
                                                int iZ5 = fq80Var.z();
                                                iArr[3] = bvu0.c(iArr[3], iZ4 >> 4);
                                                iArr[2] = bvu0.c(iArr[2], iZ4 & 15);
                                                iArr[1] = bvu0.c(iArr[1], iZ5 >> 4);
                                                iArr[c5] = bvu0.c(iArr[c5], iZ5 & 15);
                                                c4 = 1;
                                            } else {
                                                f1t0.g0("VobsubParser", "Ignoring alpha command before color command");
                                            }
                                            c4 = c5;
                                            break;
                                        case 5:
                                            if (fq80Var.a() >= 6) {
                                                int iZ6 = fq80Var.z();
                                                int iZ7 = fq80Var.z();
                                                int i6 = (iZ6 << 4) | (iZ7 >> 4);
                                                int iZ8 = ((iZ7 & 15) << 8) | fq80Var.z();
                                                int iZ9 = fq80Var.z();
                                                int iZ10 = fq80Var.z();
                                                bvu0Var.i = new Rect(i6, (iZ9 << 4) | (iZ10 >> 4), iZ8 + 1, (((iZ10 & 15) << 8) | fq80Var.z()) + 1);
                                                c4 = 1;
                                            } else {
                                                f1t0.g0("VobsubParser", "Incomplete area command");
                                                c4 = c5;
                                            }
                                            break;
                                        case 6:
                                            if (fq80Var.a() >= 4) {
                                                bvu0Var.j = fq80Var.G();
                                                bvu0Var.k = fq80Var.G();
                                                c4 = 1;
                                            } else {
                                                f1t0.g0("VobsubParser", "Incomplete offsets command");
                                                c4 = c5;
                                            }
                                            break;
                                        default:
                                            rw2.u(iZ, "Unrecognized command: ", "VobsubParser");
                                            c4 = c5;
                                            break;
                                    }
                                } else {
                                    c4 = c5;
                                }
                                c3 = c5;
                            }
                            c2 = c3;
                            if (c != 0) {
                                fq80Var.M(iG2);
                            }
                        }
                        if (c != 0) {
                            j5 = j;
                            c3 = c2;
                        }
                    }
                } else {
                    f1t0.g0("VobsubParser", "Skipping SPU (no plane)");
                }
                if (bvu0Var.f != null || !bvu0Var.d || !bvu0Var.e || (rect = bvu0Var.i) == null || bvu0Var.j == -1 || bvu0Var.k == -1 || rect.width() < 2 || bvu0Var.i.height() < 2) {
                    ctfVar = null;
                } else {
                    Rect rect2 = bvu0Var.i;
                    int[] iArr2 = new int[rect2.height() * rect2.width()];
                    q8b q8bVar = new q8b();
                    fq80Var.M(bvu0Var.j);
                    q8bVar.k(fq80Var);
                    bvu0Var.b(q8bVar, true, rect2, iArr2);
                    fq80Var.M(bvu0Var.k);
                    q8bVar.k(fq80Var);
                    bvu0Var.b(q8bVar, c2, rect2, iArr2);
                    ctfVar = new ctf(null, null, null, Bitmap.createBitmap(iArr2, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888), rect2.top / bvu0Var.h, 0, 0, rect2.left / bvu0Var.g, 0, Integer.MIN_VALUE, -3.4028235E38f, rect2.width() / bvu0Var.g, rect2.height() / bvu0Var.h, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                }
                j2 = bvu0Var.c;
                if (j2 != j) {
                    j4 = bvu0Var.b;
                    if (j4 != j && j2 > j4) {
                        j2 -= j4;
                    }
                    j3 = j2;
                } else {
                    j3 = j;
                }
                if (ctfVar != null) {
                    rcf0VarT = b4x.t(ctfVar);
                } else {
                    v3x v3xVar = b4x.b;
                    rcf0VarT = rcf0.e;
                }
                ftfVar = new ftf(bvu0Var.b, j3, rcf0VarT);
            }
            j = -9223372036854775807L;
            c2 = 0;
            if (bvu0Var.f != null) {
                ctfVar = null;
            } else {
                ctfVar = null;
            }
            j2 = bvu0Var.c;
            if (j2 != j) {
                j4 = bvu0Var.b;
                if (j4 != j) {
                    j2 -= j4;
                }
                j3 = j2;
            } else {
                j3 = j;
            }
            if (ctfVar != null) {
                rcf0VarT = b4x.t(ctfVar);
            } else {
                v3x v3xVar2 = b4x.b;
                rcf0VarT = rcf0.e;
            }
            ftfVar = new ftf(bvu0Var.b, j3, rcf0VarT);
        }
        rbeVar.accept(ftfVar);
    }
}
