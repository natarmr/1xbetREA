package a;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import com.appsflyer.share.attribution.RequestError;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r8b extends u8b {
    public final fq80 h = new fq80();
    public final q8b i = new q8b();
    public int j = -1;
    public final int k;
    public final p8b[] l;
    public p8b m;
    public List n;
    public List o;
    public q8b p;
    public int q;

    public r8b(int i, List list) {
        this.k = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = jyc.f17352a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.l = new p8b[8];
        int i2 = 0;
        while (true) {
            p8b[] p8bVarArr = this.l;
            if (i2 >= 8) {
                this.m = p8bVarArr[0];
                return;
            } else {
                p8bVarArr[i2] = new p8b();
                i2++;
            }
        }
    }

    @Override // a.u8b
    public final fvt0 f() {
        List list = this.n;
        this.o = list;
        list.getClass();
        return new fvt0(list);
    }

    @Override // a.u8b, a.skj
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        this.q = 0;
        this.m = this.l[0];
        l();
        this.p = null;
    }

    @Override // a.u8b
    public final void g(s8b s8bVar) {
        q8b q8bVar;
        ByteBuffer byteBuffer = s8bVar.g;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        fq80 fq80Var = this.h;
        fq80Var.K(bArrArray, iLimit);
        while (fq80Var.a() >= 3) {
            int iZ = fq80Var.z();
            int i = iZ & 3;
            boolean z = (iZ & 4) == 4;
            byte bZ = (byte) fq80Var.z();
            byte bZ2 = (byte) fq80Var.z();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        j();
                        int i2 = (bZ & 192) >> 6;
                        int i3 = this.j;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            l();
                            f1t0.g0("Cea708Decoder", "Sequence number discontinuity. previous=" + this.j + " current=" + i2);
                        }
                        this.j = i2;
                        int i4 = bZ & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        q8bVar = new q8b(i2, i4);
                        this.p = q8bVar;
                        byte[] bArr = q8bVar.b;
                        q8bVar.e = 1;
                        bArr[0] = bZ2;
                    } else {
                        x0x.A(i == 2);
                        q8bVar = this.p;
                        if (q8bVar == null) {
                            f1t0.Q("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = q8bVar.b;
                            int i5 = q8bVar.e;
                            int i6 = i5 + 1;
                            q8bVar.e = i6;
                            bArr2[i5] = bZ;
                            q8bVar.e = i5 + 2;
                            bArr2[i6] = bZ2;
                        }
                    }
                    if (q8bVar.e == (q8bVar.d * 2) - 1) {
                        j();
                    }
                }
            }
        }
    }

    @Override // a.u8b
    public final boolean i() {
        return this.n != this.o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:228:0x053d  */
    public final void j() {
        char c;
        boolean z;
        q8b q8bVar = this.p;
        if (q8bVar == null) {
            return;
        }
        int i = 2;
        if (q8bVar.e != (q8bVar.d * 2) - 1) {
            f1t0.P("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.p.d * 2) - 1) + ", but current index is " + this.p.e + " (sequence number " + this.p.c + ");");
        }
        q8b q8bVar2 = this.p;
        byte[] bArr = q8bVar2.b;
        int i2 = q8bVar2.e;
        q8b q8bVar3 = this.i;
        q8bVar3.l(bArr, i2);
        boolean z2 = false;
        while (q8bVar3.b() > 0) {
            int i3 = 3;
            int iG = q8bVar3.g(3);
            int iG2 = q8bVar3.g(5);
            if (iG == 7) {
                q8bVar3.o(i);
                iG = q8bVar3.g(6);
                if (iG < 7) {
                    rw2.u(iG, "Invalid extended service number: ", "Cea708Decoder");
                }
            }
            if (iG2 == 0) {
                if (iG != 0) {
                    f1t0.g0("Cea708Decoder", "serviceNumber is non-zero (" + iG + ") when blockSize is 0");
                }
                if (z2) {
                    this.n = k();
                }
                this.p = null;
            }
            if (iG != this.k) {
                q8bVar3.p(iG2);
            } else {
                int iE = (iG2 * 8) + q8bVar3.e();
                while (q8bVar3.e() < iE) {
                    int iG3 = q8bVar3.g(8);
                    if (iG3 != 16) {
                        if (iG3 <= 31) {
                            if (iG3 != 0) {
                                if (iG3 == i3) {
                                    this.n = k();
                                } else if (iG3 != 8) {
                                    switch (iG3) {
                                        case 12:
                                            l();
                                            break;
                                        case 13:
                                            this.m.a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (iG3 >= 17 && iG3 <= 23) {
                                                f1t0.g0("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + iG3);
                                                q8bVar3.o(8);
                                            } else if (iG3 < 24 || iG3 > 31) {
                                                rw2.u(iG3, "Invalid C0 command: ", "Cea708Decoder");
                                            } else {
                                                f1t0.g0("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + iG3);
                                                q8bVar3.o(16);
                                            }
                                            break;
                                    }
                                } else {
                                    SpannableStringBuilder spannableStringBuilder = this.m.b;
                                    int length = spannableStringBuilder.length();
                                    if (length > 0) {
                                        spannableStringBuilder.delete(length - 1, length);
                                    }
                                }
                            }
                        } else if (iG3 <= 127) {
                            p8b p8bVar = this.m;
                            if (iG3 == 127) {
                                p8bVar.a((char) 9835);
                            } else {
                                p8bVar.a((char) (iG3 & 255));
                            }
                            z2 = true;
                        } else {
                            if (iG3 <= 159) {
                                p8b[] p8bVarArr = this.l;
                                switch (iG3) {
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                        z = true;
                                        int i4 = iG3 - 128;
                                        if (this.q != i4) {
                                            this.q = i4;
                                            this.m = p8bVarArr[i4];
                                        }
                                        break;
                                    case 136:
                                        z = true;
                                        for (int i5 = 1; i5 <= 8; i5++) {
                                            if (q8bVar3.f()) {
                                                p8b p8bVar2 = p8bVarArr[8 - i5];
                                                p8bVar2.f26545a.clear();
                                                p8bVar2.b.clear();
                                                p8bVar2.o = -1;
                                                p8bVar2.p = -1;
                                                p8bVar2.q = -1;
                                                p8bVar2.s = -1;
                                                p8bVar2.u = 0;
                                            }
                                        }
                                        break;
                                    case 137:
                                        for (int i6 = 1; i6 <= 8; i6++) {
                                            if (q8bVar3.f()) {
                                                p8bVarArr[8 - i6].d = true;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 138:
                                        for (int i7 = 1; i7 <= 8; i7++) {
                                            if (q8bVar3.f()) {
                                                p8bVarArr[8 - i7].d = false;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 139:
                                        for (int i8 = 1; i8 <= 8; i8++) {
                                            if (q8bVar3.f()) {
                                                p8b p8bVar3 = p8bVarArr[8 - i8];
                                                p8bVar3.d = !p8bVar3.d;
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 140:
                                        for (int i9 = 1; i9 <= 8; i9++) {
                                            if (q8bVar3.f()) {
                                                p8bVarArr[8 - i9].d();
                                            }
                                        }
                                        z = true;
                                        break;
                                    case 141:
                                        q8bVar3.o(8);
                                        z = true;
                                        break;
                                    case 142:
                                        z = true;
                                        break;
                                    case 143:
                                        l();
                                        z = true;
                                        break;
                                    case 144:
                                        int i10 = i;
                                        if (this.m.c) {
                                            q8bVar3.g(4);
                                            q8bVar3.g(i10);
                                            q8bVar3.g(i10);
                                            boolean zF = q8bVar3.f();
                                            boolean zF2 = q8bVar3.f();
                                            i3 = 3;
                                            q8bVar3.g(3);
                                            q8bVar3.g(3);
                                            this.m.e(zF, zF2);
                                            z = true;
                                        } else {
                                            q8bVar3.o(16);
                                            z = true;
                                            i3 = 3;
                                        }
                                        break;
                                    case 145:
                                        if (this.m.c) {
                                            int iC = p8b.c(q8bVar3.g(2), q8bVar3.g(2), q8bVar3.g(2), q8bVar3.g(2));
                                            int iC2 = p8b.c(q8bVar3.g(2), q8bVar3.g(2), q8bVar3.g(2), q8bVar3.g(2));
                                            q8bVar3.o(2);
                                            p8b.c(q8bVar3.g(2), q8bVar3.g(2), q8bVar3.g(2), 0);
                                            this.m.f(iC, iC2);
                                        } else {
                                            q8bVar3.o(24);
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                    case 146:
                                        if (this.m.c) {
                                            q8bVar3.o(4);
                                            int iG4 = q8bVar3.g(4);
                                            q8bVar3.o(2);
                                            q8bVar3.g(6);
                                            p8b p8bVar4 = this.m;
                                            if (p8bVar4.u != iG4) {
                                                p8bVar4.a('\n');
                                            }
                                            p8bVar4.u = iG4;
                                        } else {
                                            q8bVar3.o(16);
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                    case 147:
                                    case 148:
                                    case 149:
                                    case 150:
                                    default:
                                        rw2.u(iG3, "Invalid C1 command: ", "Cea708Decoder");
                                        z = true;
                                        break;
                                    case 151:
                                        if (this.m.c) {
                                            int iC3 = p8b.c(q8bVar3.g(2), q8bVar3.g(2), q8bVar3.g(2), q8bVar3.g(2));
                                            q8bVar3.g(2);
                                            p8b.c(q8bVar3.g(2), q8bVar3.g(2), q8bVar3.g(2), 0);
                                            q8bVar3.f();
                                            q8bVar3.f();
                                            q8bVar3.g(2);
                                            q8bVar3.g(2);
                                            int iG5 = q8bVar3.g(2);
                                            q8bVar3.o(8);
                                            p8b p8bVar5 = this.m;
                                            p8bVar5.n = iC3;
                                            p8bVar5.k = iG5;
                                        } else {
                                            q8bVar3.o(32);
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                    case 152:
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 159:
                                        int i11 = iG3 - 152;
                                        p8b p8bVar6 = p8bVarArr[i11];
                                        q8bVar3.o(i);
                                        boolean zF3 = q8bVar3.f();
                                        q8bVar3.o(i);
                                        int iG6 = q8bVar3.g(i3);
                                        boolean zF4 = q8bVar3.f();
                                        int iG7 = q8bVar3.g(7);
                                        int iG8 = q8bVar3.g(8);
                                        int iG9 = q8bVar3.g(4);
                                        int iG10 = q8bVar3.g(4);
                                        q8bVar3.o(i);
                                        q8bVar3.o(6);
                                        q8bVar3.o(i);
                                        int iG11 = q8bVar3.g(3);
                                        int iG12 = q8bVar3.g(3);
                                        ArrayList arrayList = p8bVar6.f26545a;
                                        p8bVar6.c = true;
                                        p8bVar6.d = zF3;
                                        p8bVar6.e = iG6;
                                        p8bVar6.f = zF4;
                                        p8bVar6.g = iG7;
                                        p8bVar6.h = iG8;
                                        p8bVar6.i = iG9;
                                        int i12 = iG10 + 1;
                                        if (p8bVar6.j != i12) {
                                            p8bVar6.j = i12;
                                            while (true) {
                                                if (arrayList.size() >= p8bVar6.j || arrayList.size() >= 15) {
                                                    arrayList.remove(0);
                                                }
                                            }
                                        }
                                        if (iG11 != 0 && p8bVar6.l != iG11) {
                                            p8bVar6.l = iG11;
                                            int i13 = iG11 - 1;
                                            int i14 = p8b.B[i13];
                                            boolean z3 = p8b.A[i13];
                                            int i15 = p8b.y[i13];
                                            int i16 = p8b.z[i13];
                                            int i17 = p8b.x[i13];
                                            p8bVar6.n = i14;
                                            p8bVar6.k = i17;
                                        }
                                        if (iG12 != 0 && p8bVar6.m != iG12) {
                                            p8bVar6.m = iG12;
                                            int i18 = iG12 - 1;
                                            int i19 = p8b.D[i18];
                                            int i20 = p8b.C[i18];
                                            p8bVar6.e(false, false);
                                            p8bVar6.f(p8b.v, p8b.E[i18]);
                                        }
                                        if (this.q != i11) {
                                            this.q = i11;
                                            this.m = p8bVarArr[i11];
                                        }
                                        z = true;
                                        i3 = 3;
                                        break;
                                }
                            } else {
                                z = true;
                                if (iG3 <= 255) {
                                    this.m.a((char) (iG3 & 255));
                                } else {
                                    rw2.u(iG3, "Invalid base command: ", "Cea708Decoder");
                                }
                                i = 2;
                                c = 7;
                            }
                            z2 = z;
                            i = 2;
                            c = 7;
                        }
                        c = 7;
                    } else {
                        int iG13 = q8bVar3.g(8);
                        if (iG13 <= 31) {
                            c = 7;
                            if (iG13 > 7) {
                                if (iG13 <= 15) {
                                    q8bVar3.o(8);
                                } else if (iG13 <= 23) {
                                    q8bVar3.o(16);
                                } else if (iG13 <= 31) {
                                    q8bVar3.o(24);
                                }
                            }
                        } else {
                            c = 7;
                            if (iG13 <= 127) {
                                if (iG13 == 32) {
                                    this.m.a(' ');
                                } else if (iG13 == 33) {
                                    this.m.a((char) 160);
                                } else if (iG13 == 37) {
                                    this.m.a((char) 8230);
                                } else if (iG13 == 42) {
                                    this.m.a((char) 352);
                                } else if (iG13 == 44) {
                                    this.m.a((char) 338);
                                } else if (iG13 == 63) {
                                    this.m.a((char) 376);
                                } else if (iG13 == 57) {
                                    this.m.a((char) 8482);
                                } else if (iG13 == 58) {
                                    this.m.a((char) 353);
                                } else if (iG13 == 60) {
                                    this.m.a((char) 339);
                                } else if (iG13 != 61) {
                                    switch (iG13) {
                                        case 48:
                                            this.m.a((char) 9608);
                                            break;
                                        case 49:
                                            this.m.a((char) 8216);
                                            break;
                                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                                            this.m.a((char) 8217);
                                            break;
                                        case 51:
                                            this.m.a((char) 8220);
                                            break;
                                        case 52:
                                            this.m.a((char) 8221);
                                            break;
                                        case 53:
                                            this.m.a((char) 8226);
                                            break;
                                        default:
                                            switch (iG13) {
                                                case 118:
                                                    this.m.a((char) 8539);
                                                    break;
                                                case 119:
                                                    this.m.a((char) 8540);
                                                    break;
                                                case 120:
                                                    this.m.a((char) 8541);
                                                    break;
                                                case 121:
                                                    this.m.a((char) 8542);
                                                    break;
                                                case 122:
                                                    this.m.a((char) 9474);
                                                    break;
                                                case 123:
                                                    this.m.a((char) 9488);
                                                    break;
                                                case 124:
                                                    this.m.a((char) 9492);
                                                    break;
                                                case 125:
                                                    this.m.a((char) 9472);
                                                    break;
                                                case 126:
                                                    this.m.a((char) 9496);
                                                    break;
                                                case 127:
                                                    this.m.a((char) 9484);
                                                    break;
                                                default:
                                                    rw2.u(iG13, "Invalid G2 character: ", "Cea708Decoder");
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    this.m.a((char) 8480);
                                }
                                i = 2;
                                z2 = true;
                            } else if (iG13 > 159) {
                                i = 2;
                                if (iG13 <= 255) {
                                    if (iG13 == 160) {
                                        this.m.a((char) 13252);
                                    } else {
                                        rw2.u(iG13, "Invalid G3 character: ", "Cea708Decoder");
                                        this.m.a('_');
                                    }
                                    z2 = true;
                                } else {
                                    rw2.u(iG13, "Invalid extended command: ", "Cea708Decoder");
                                }
                            } else if (iG13 <= 135) {
                                q8bVar3.o(32);
                            } else if (iG13 <= 143) {
                                q8bVar3.o(40);
                            } else if (iG13 <= 159) {
                                i = 2;
                                q8bVar3.o(2);
                                q8bVar3.o(q8bVar3.g(6) * 8);
                            }
                        }
                        i = 2;
                    }
                    i = i;
                }
            }
        }
        if (z2) {
            this.n = k();
        }
        this.p = null;
    }

    public final List k() {
        Layout.Alignment alignment;
        float f;
        float f2;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            p8b[] p8bVarArr = this.l;
            p8b p8bVar = p8bVarArr[i];
            if (p8bVar.c && (!p8bVar.f26545a.isEmpty() || p8bVar.b.length() != 0)) {
                p8b p8bVar2 = p8bVarArr[i];
                if (p8bVar2.d) {
                    ArrayList arrayList2 = p8bVar2.f26545a;
                    o8b o8bVar = null;
                    if (p8bVar2.c && (!arrayList2.isEmpty() || p8bVar2.b.length() != 0)) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i2));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) p8bVar2.b());
                        int i3 = p8bVar2.k;
                        if (i3 == 0) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else if (i3 == 1) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else if (i3 != 2) {
                            if (i3 != 3) {
                                ohq.h(p8bVar2.k, "Unexpected justification value: ");
                                return null;
                            }
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else {
                            alignment = Layout.Alignment.ALIGN_CENTER;
                        }
                        Layout.Alignment alignment2 = alignment;
                        boolean z = p8bVar2.f;
                        int i4 = p8bVar2.h;
                        int i5 = p8bVar2.g;
                        if (z) {
                            f = i4 / 99.0f;
                            f2 = i5 / 99.0f;
                        } else {
                            f = i4 / 209.0f;
                            f2 = i5 / 74.0f;
                        }
                        float f3 = (f * 0.9f) + 0.05f;
                        float f4 = (f2 * 0.9f) + 0.05f;
                        int i6 = p8bVar2.i;
                        int i7 = i6 / 3;
                        int i8 = i7 == 0 ? 0 : i7 == 1 ? 1 : 2;
                        int i9 = i6 % 3;
                        int i10 = i9 == 0 ? 0 : i9 == 1 ? 1 : 2;
                        int i11 = p8bVar2.n;
                        o8bVar = new o8b(spannableStringBuilder, alignment2, f4, i8, f3, i10, i11 != p8b.w, i11, p8bVar2.e);
                    }
                    if (o8bVar != null) {
                        arrayList.add(o8bVar);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, o8b.c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList3.add(((o8b) arrayList.get(i12)).f24821a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    public final void l() {
        for (int i = 0; i < 8; i++) {
            this.l[i].d();
        }
    }
}
