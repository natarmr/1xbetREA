package a;

import android.javax.sip.message.Response;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n8b extends u8b {
    public final int i;
    public final boolean j;
    public final boolean k;
    public List o;
    public List p;
    public byte q;
    public byte r;
    public boolean s;
    public boolean t;
    public byte u;
    public byte v;
    public boolean x;
    public long y;
    public static final int[] z = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, Response.OK, Response.ACCEPTED, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final fq80 h = new fq80();
    public final ArrayList m = new ArrayList();
    public m8b n = new m8b(0, 4);
    public int w = 0;
    public final long l = 16000000;

    public n8b(String str, int i) {
        this.i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.k = false;
            this.j = false;
        } else if (i == 2) {
            this.k = true;
            this.j = false;
        } else if (i == 3) {
            this.k = false;
            this.j = true;
        } else if (i != 4) {
            f1t0.g0("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.k = false;
            this.j = false;
        } else {
            this.k = true;
            this.j = true;
        }
        l(0);
        k();
        this.x = true;
        this.y = -9223372036854775807L;
    }

    @Override // a.u8b
    public final fvt0 f() {
        List list = this.o;
        this.p = list;
        list.getClass();
        return new fvt0(list);
    }

    @Override // a.u8b, a.skj
    public final void flush() {
        super.flush();
        this.o = null;
        this.p = null;
        l(0);
        this.r = (byte) 4;
        this.n.h = (byte) 4;
        k();
        this.s = false;
        this.t = false;
        this.u = (byte) 0;
        this.v = (byte) 0;
        this.w = 0;
        this.x = true;
        this.y = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0198  */
    /* JADX WARN: Code duplicated, block: B:123:0x019e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:127:0x01ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:133:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:134:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:140:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:142:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:143:0x01da  */
    /* JADX WARN: Code duplicated, block: B:148:0x0205 A[LOOP:1: B:146:0x01ff->B:148:0x0205, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x0209  */
    /* JADX WARN: Code duplicated, block: B:151:0x020f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x0211  */
    /* JADX WARN: Code duplicated, block: B:153:0x0216  */
    /* JADX WARN: Code duplicated, block: B:154:0x021d  */
    /* JADX WARN: Code duplicated, block: B:155:0x0228  */
    /* JADX WARN: Code duplicated, block: B:156:0x0233  */
    /* JADX WARN: Code duplicated, block: B:157:0x023e  */
    /* JADX WARN: Code duplicated, block: B:158:0x0243  */
    /* JADX WARN: Code duplicated, block: B:159:0x0248  */
    /* JADX WARN: Code duplicated, block: B:161:0x0259  */
    /* JADX WARN: Code duplicated, block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:182:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:183:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x012a  */
    /* JADX WARN: Code duplicated, block: B:93:0x012e  */
    @Override // a.u8b
    public final void g(s8b s8bVar) {
        boolean z2;
        int i;
        int[] iArr;
        int i2;
        int i3;
        byte b;
        ArrayList arrayList;
        int iMin;
        ByteBuffer byteBuffer = s8bVar.g;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        fq80 fq80Var = this.h;
        fq80Var.K(bArrArray, iLimit);
        boolean z3 = false;
        while (true) {
            int iA = fq80Var.a();
            int i4 = this.i;
            if (iA < i4) {
                if (z3) {
                    byte b2 = this.q;
                    if (b2 == 1 || b2 == 3) {
                        this.o = j();
                        this.y = this.e;
                        return;
                    }
                    return;
                }
                return;
            }
            int iZ = i4 == 2 ? -4 : fq80Var.z();
            int iZ2 = fq80Var.z();
            int iZ3 = fq80Var.z();
            if ((iZ & 2) == 0 && (iZ & 1) == this.j) {
                byte b3 = (byte) (iZ2 & 127);
                byte b4 = (byte) (iZ3 & 127);
                if (b3 != 0 || b4 != 0) {
                    boolean z4 = this.s;
                    if ((iZ & 4) == 4) {
                        boolean[] zArr = G;
                        if (zArr[iZ2] && zArr[iZ3]) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                    this.s = z2;
                    if (!z2 || (b3 & 240) != 16) {
                        this.t = false;
                        if (!z2) {
                            if (1 > b3 && b3 <= 15) {
                                this.x = false;
                            } else if ((b3 & 246) == 20) {
                                if (b4 == 32 && b4 != 47) {
                                    switch (b4) {
                                        default:
                                            switch (b4) {
                                                case 42:
                                                case 43:
                                                    this.x = false;
                                                    break;
                                            }
                                        case 37:
                                        case 38:
                                        case 39:
                                            this.x = true;
                                            break;
                                    }
                                } else {
                                    this.x = true;
                                }
                            }
                            if (this.x) {
                                i = b3 & 224;
                                if (i == 0) {
                                    this.w = (b3 >> 3) & 1;
                                }
                                if (this.w != this.k) {
                                    if (i == 0) {
                                        i2 = b3 & 247;
                                        if (i2 == 17 || (b4 & 240) != 48) {
                                            i3 = b3 & 246;
                                            if (i3 != 18 && (b4 & 224) == 32) {
                                                this.n.b();
                                                this.n.a((char) ((b3 & 1) == 0 ? E[b4 & 31] : F[b4 & 31]));
                                            } else if (i2 != 17 && (b4 & 240) == 32) {
                                                this.n.a(' ');
                                                boolean z5 = (b4 & 1) == 1;
                                                m8b m8bVar = this.n;
                                                m8bVar.f21361a.add(new l8b((b4 >> 1) & 7, m8bVar.c.length(), z5));
                                            } else if ((b3 & 240) != 16 && (b4 & 192) == 64) {
                                                int i5 = z[b3 & 7];
                                                if ((b4 & 32) != 0) {
                                                    i5++;
                                                }
                                                m8b m8bVar2 = this.n;
                                                if (i5 != m8bVar2.d) {
                                                    if (this.q != 1 && !m8bVar2.e()) {
                                                        m8b m8bVar3 = new m8b(this.q, this.r);
                                                        this.n = m8bVar3;
                                                        this.m.add(m8bVar3);
                                                    }
                                                    m8bVar2 = this.n;
                                                    m8bVar2.d = i5;
                                                }
                                                boolean z6 = (b4 & 16) == 16;
                                                int i6 = (b4 >> 1) & 7;
                                                m8bVar2.f21361a.add(new l8b(z6 ? 8 : i6, m8bVar2.c.length(), (b4 & 1) == 1));
                                                if (z6) {
                                                    this.n.e = A[i6];
                                                }
                                            } else if (i2 != 23 && b4 >= 33 && b4 <= 35) {
                                                this.n.f = b4 - 32;
                                            } else if (i3 == 20 && (b4 & 240) == 32) {
                                                if (b4 == 32) {
                                                    l(2);
                                                } else if (b4 != 41) {
                                                    switch (b4) {
                                                        case 37:
                                                            l(1);
                                                            this.r = (byte) 2;
                                                            this.n.h = (byte) 2;
                                                            break;
                                                        case 38:
                                                            l(1);
                                                            this.r = (byte) 3;
                                                            this.n.h = (byte) 3;
                                                            break;
                                                        case 39:
                                                            l(1);
                                                            this.r = (byte) 4;
                                                            this.n.h = (byte) 4;
                                                            break;
                                                        default:
                                                            b = this.q;
                                                            if (b != 0) {
                                                                if (b4 != 33) {
                                                                    switch (b4) {
                                                                        case 44:
                                                                            this.o = Collections.EMPTY_LIST;
                                                                            if (b != 1 || b == 3) {
                                                                                k();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (b == 1 && !this.n.e()) {
                                                                                m8b m8bVar4 = this.n;
                                                                                arrayList = m8bVar4.b;
                                                                                arrayList.add(m8bVar4.d());
                                                                                m8bVar4.c.setLength(0);
                                                                                m8bVar4.f21361a.clear();
                                                                                iMin = Math.min((int) m8bVar4.h, m8bVar4.d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            k();
                                                                            break;
                                                                        case 47:
                                                                            this.o = j();
                                                                            k();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.n.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    l(3);
                                                }
                                            }
                                        } else {
                                            this.n.a((char) D[b4 & 15]);
                                        }
                                    } else {
                                        m8b m8bVar5 = this.n;
                                        iArr = C;
                                        m8bVar5.a((char) iArr[(b3 & 127) - 32]);
                                        if ((b4 & 224) != 0) {
                                            this.n.a((char) iArr[(b4 & 127) - 32]);
                                        }
                                    }
                                    z3 = true;
                                }
                            }
                        } else if (z4) {
                            k();
                            z3 = true;
                        }
                    } else if (this.t && this.u == b3 && this.v == b4) {
                        this.t = false;
                    } else {
                        this.t = true;
                        this.u = b3;
                        this.v = b4;
                        if (!z2) {
                            if (1 > b3) {
                                if ((b3 & 246) == 20) {
                                    if (b4 == 32) {
                                        this.x = true;
                                    } else {
                                        this.x = true;
                                    }
                                }
                            } else if ((b3 & 246) == 20) {
                                if (b4 == 32) {
                                    this.x = true;
                                } else {
                                    this.x = true;
                                }
                            }
                            if (this.x) {
                                i = b3 & 224;
                                if (i == 0) {
                                    this.w = (b3 >> 3) & 1;
                                }
                                if (this.w != this.k) {
                                    if (i == 0) {
                                        i2 = b3 & 247;
                                        if (i2 == 17) {
                                            i3 = b3 & 246;
                                            if (i3 != 18) {
                                                if (i2 != 17) {
                                                    if ((b3 & 240) != 16) {
                                                        if (i2 != 23) {
                                                            if (i3 == 20) {
                                                                if (b4 == 32) {
                                                                    l(2);
                                                                } else if (b4 != 41) {
                                                                    switch (b4) {
                                                                        case 37:
                                                                            l(1);
                                                                            this.r = (byte) 2;
                                                                            this.n.h = (byte) 2;
                                                                            break;
                                                                        case 38:
                                                                            l(1);
                                                                            this.r = (byte) 3;
                                                                            this.n.h = (byte) 3;
                                                                            break;
                                                                        case 39:
                                                                            l(1);
                                                                            this.r = (byte) 4;
                                                                            this.n.h = (byte) 4;
                                                                            break;
                                                                        default:
                                                                            b = this.q;
                                                                            if (b != 0) {
                                                                                if (b4 != 33) {
                                                                                    switch (b4) {
                                                                                        case 44:
                                                                                            this.o = Collections.EMPTY_LIST;
                                                                                            if (b != 1) {
                                                                                                k();
                                                                                            } else {
                                                                                                k();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (b == 1) {
                                                                                                m8b m8bVar6 = this.n;
                                                                                                arrayList = m8bVar6.b;
                                                                                                arrayList.add(m8bVar6.d());
                                                                                                m8bVar6.c.setLength(0);
                                                                                                m8bVar6.f21361a.clear();
                                                                                                iMin = Math.min((int) m8bVar6.h, m8bVar6.d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            k();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.o = j();
                                                                                            k();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.n.b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    l(3);
                                                                }
                                                            }
                                                        } else if (i3 == 20) {
                                                            if (b4 == 32) {
                                                                l(2);
                                                            } else if (b4 != 41) {
                                                                switch (b4) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.r = (byte) 2;
                                                                        this.n.h = (byte) 2;
                                                                        break;
                                                                    case 38:
                                                                        l(1);
                                                                        this.r = (byte) 3;
                                                                        this.n.h = (byte) 3;
                                                                        break;
                                                                    case 39:
                                                                        l(1);
                                                                        this.r = (byte) 4;
                                                                        this.n.h = (byte) 4;
                                                                        break;
                                                                    default:
                                                                        b = this.q;
                                                                        if (b != 0) {
                                                                            if (b4 != 33) {
                                                                                switch (b4) {
                                                                                    case 44:
                                                                                        this.o = Collections.EMPTY_LIST;
                                                                                        if (b != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (b == 1) {
                                                                                            m8b m8bVar7 = this.n;
                                                                                            arrayList = m8bVar7.b;
                                                                                            arrayList.add(m8bVar7.d());
                                                                                            m8bVar7.c.setLength(0);
                                                                                            m8bVar7.f21361a.clear();
                                                                                            iMin = Math.min((int) m8bVar7.h, m8bVar7.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b4 == 32) {
                                                                l(2);
                                                            } else if (b4 != 41) {
                                                                switch (b4) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.r = (byte) 2;
                                                                        this.n.h = (byte) 2;
                                                                        break;
                                                                    case 38:
                                                                        l(1);
                                                                        this.r = (byte) 3;
                                                                        this.n.h = (byte) 3;
                                                                        break;
                                                                    case 39:
                                                                        l(1);
                                                                        this.r = (byte) 4;
                                                                        this.n.h = (byte) 4;
                                                                        break;
                                                                    default:
                                                                        b = this.q;
                                                                        if (b != 0) {
                                                                            if (b4 != 33) {
                                                                                switch (b4) {
                                                                                    case 44:
                                                                                        this.o = Collections.EMPTY_LIST;
                                                                                        if (b != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (b == 1) {
                                                                                            m8b m8bVar8 = this.n;
                                                                                            arrayList = m8bVar8.b;
                                                                                            arrayList.add(m8bVar8.d());
                                                                                            m8bVar8.c.setLength(0);
                                                                                            m8bVar8.f21361a.clear();
                                                                                            iMin = Math.min((int) m8bVar8.h, m8bVar8.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b4 == 32) {
                                                            l(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case 37:
                                                                    l(1);
                                                                    this.r = (byte) 2;
                                                                    this.n.h = (byte) 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.r = (byte) 3;
                                                                    this.n.h = (byte) 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.r = (byte) 4;
                                                                    this.n.h = (byte) 4;
                                                                    break;
                                                                default:
                                                                    b = this.q;
                                                                    if (b != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case 44:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (b != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (b == 1) {
                                                                                        m8b m8bVar9 = this.n;
                                                                                        arrayList = m8bVar9.b;
                                                                                        arrayList.add(m8bVar9.d());
                                                                                        m8bVar9.c.setLength(0);
                                                                                        m8bVar9.f21361a.clear();
                                                                                        iMin = Math.min((int) m8bVar9.h, m8bVar9.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if ((b3 & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b4 == 32) {
                                                                l(2);
                                                            } else if (b4 != 41) {
                                                                switch (b4) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.r = (byte) 2;
                                                                        this.n.h = (byte) 2;
                                                                        break;
                                                                    case 38:
                                                                        l(1);
                                                                        this.r = (byte) 3;
                                                                        this.n.h = (byte) 3;
                                                                        break;
                                                                    case 39:
                                                                        l(1);
                                                                        this.r = (byte) 4;
                                                                        this.n.h = (byte) 4;
                                                                        break;
                                                                    default:
                                                                        b = this.q;
                                                                        if (b != 0) {
                                                                            if (b4 != 33) {
                                                                                switch (b4) {
                                                                                    case 44:
                                                                                        this.o = Collections.EMPTY_LIST;
                                                                                        if (b != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (b == 1) {
                                                                                            m8b m8bVar10 = this.n;
                                                                                            arrayList = m8bVar10.b;
                                                                                            arrayList.add(m8bVar10.d());
                                                                                            m8bVar10.c.setLength(0);
                                                                                            m8bVar10.f21361a.clear();
                                                                                            iMin = Math.min((int) m8bVar10.h, m8bVar10.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b4 == 32) {
                                                            l(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case 37:
                                                                    l(1);
                                                                    this.r = (byte) 2;
                                                                    this.n.h = (byte) 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.r = (byte) 3;
                                                                    this.n.h = (byte) 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.r = (byte) 4;
                                                                    this.n.h = (byte) 4;
                                                                    break;
                                                                default:
                                                                    b = this.q;
                                                                    if (b != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case 44:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (b != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (b == 1) {
                                                                                        m8b m8bVar11 = this.n;
                                                                                        arrayList = m8bVar11.b;
                                                                                        arrayList.add(m8bVar11.d());
                                                                                        m8bVar11.c.setLength(0);
                                                                                        m8bVar11.f21361a.clear();
                                                                                        iMin = Math.min((int) m8bVar11.h, m8bVar11.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b4 == 32) {
                                                            l(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case 37:
                                                                    l(1);
                                                                    this.r = (byte) 2;
                                                                    this.n.h = (byte) 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.r = (byte) 3;
                                                                    this.n.h = (byte) 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.r = (byte) 4;
                                                                    this.n.h = (byte) 4;
                                                                    break;
                                                                default:
                                                                    b = this.q;
                                                                    if (b != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case 44:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (b != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (b == 1) {
                                                                                        m8b m8bVar12 = this.n;
                                                                                        arrayList = m8bVar12.b;
                                                                                        arrayList.add(m8bVar12.d());
                                                                                        m8bVar12.c.setLength(0);
                                                                                        m8bVar12.f21361a.clear();
                                                                                        iMin = Math.min((int) m8bVar12.h, m8bVar12.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b4 == 32) {
                                                        l(2);
                                                    } else if (b4 != 41) {
                                                        switch (b4) {
                                                            case 37:
                                                                l(1);
                                                                this.r = (byte) 2;
                                                                this.n.h = (byte) 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.r = (byte) 3;
                                                                this.n.h = (byte) 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.r = (byte) 4;
                                                                this.n.h = (byte) 4;
                                                                break;
                                                            default:
                                                                b = this.q;
                                                                if (b != 0) {
                                                                    if (b4 != 33) {
                                                                        switch (b4) {
                                                                            case 44:
                                                                                this.o = Collections.EMPTY_LIST;
                                                                                if (b != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (b == 1) {
                                                                                    m8b m8bVar13 = this.n;
                                                                                    arrayList = m8bVar13.b;
                                                                                    arrayList.add(m8bVar13.d());
                                                                                    m8bVar13.c.setLength(0);
                                                                                    m8bVar13.f21361a.clear();
                                                                                    iMin = Math.min((int) m8bVar13.h, m8bVar13.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i2 != 17) {
                                                if ((b3 & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b4 == 32) {
                                                                l(2);
                                                            } else if (b4 != 41) {
                                                                switch (b4) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.r = (byte) 2;
                                                                        this.n.h = (byte) 2;
                                                                        break;
                                                                    case 38:
                                                                        l(1);
                                                                        this.r = (byte) 3;
                                                                        this.n.h = (byte) 3;
                                                                        break;
                                                                    case 39:
                                                                        l(1);
                                                                        this.r = (byte) 4;
                                                                        this.n.h = (byte) 4;
                                                                        break;
                                                                    default:
                                                                        b = this.q;
                                                                        if (b != 0) {
                                                                            if (b4 != 33) {
                                                                                switch (b4) {
                                                                                    case 44:
                                                                                        this.o = Collections.EMPTY_LIST;
                                                                                        if (b != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (b == 1) {
                                                                                            m8b m8bVar14 = this.n;
                                                                                            arrayList = m8bVar14.b;
                                                                                            arrayList.add(m8bVar14.d());
                                                                                            m8bVar14.c.setLength(0);
                                                                                            m8bVar14.f21361a.clear();
                                                                                            iMin = Math.min((int) m8bVar14.h, m8bVar14.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b4 == 32) {
                                                            l(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case 37:
                                                                    l(1);
                                                                    this.r = (byte) 2;
                                                                    this.n.h = (byte) 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.r = (byte) 3;
                                                                    this.n.h = (byte) 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.r = (byte) 4;
                                                                    this.n.h = (byte) 4;
                                                                    break;
                                                                default:
                                                                    b = this.q;
                                                                    if (b != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case 44:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (b != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (b == 1) {
                                                                                        m8b m8bVar15 = this.n;
                                                                                        arrayList = m8bVar15.b;
                                                                                        arrayList.add(m8bVar15.d());
                                                                                        m8bVar15.c.setLength(0);
                                                                                        m8bVar15.f21361a.clear();
                                                                                        iMin = Math.min((int) m8bVar15.h, m8bVar15.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b4 == 32) {
                                                            l(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case 37:
                                                                    l(1);
                                                                    this.r = (byte) 2;
                                                                    this.n.h = (byte) 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.r = (byte) 3;
                                                                    this.n.h = (byte) 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.r = (byte) 4;
                                                                    this.n.h = (byte) 4;
                                                                    break;
                                                                default:
                                                                    b = this.q;
                                                                    if (b != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case 44:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (b != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (b == 1) {
                                                                                        m8b m8bVar16 = this.n;
                                                                                        arrayList = m8bVar16.b;
                                                                                        arrayList.add(m8bVar16.d());
                                                                                        m8bVar16.c.setLength(0);
                                                                                        m8bVar16.f21361a.clear();
                                                                                        iMin = Math.min((int) m8bVar16.h, m8bVar16.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b4 == 32) {
                                                        l(2);
                                                    } else if (b4 != 41) {
                                                        switch (b4) {
                                                            case 37:
                                                                l(1);
                                                                this.r = (byte) 2;
                                                                this.n.h = (byte) 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.r = (byte) 3;
                                                                this.n.h = (byte) 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.r = (byte) 4;
                                                                this.n.h = (byte) 4;
                                                                break;
                                                            default:
                                                                b = this.q;
                                                                if (b != 0) {
                                                                    if (b4 != 33) {
                                                                        switch (b4) {
                                                                            case 44:
                                                                                this.o = Collections.EMPTY_LIST;
                                                                                if (b != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (b == 1) {
                                                                                    m8b m8bVar17 = this.n;
                                                                                    arrayList = m8bVar17.b;
                                                                                    arrayList.add(m8bVar17.d());
                                                                                    m8bVar17.c.setLength(0);
                                                                                    m8bVar17.f21361a.clear();
                                                                                    iMin = Math.min((int) m8bVar17.h, m8bVar17.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if ((b3 & 240) != 16) {
                                                if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b4 == 32) {
                                                            l(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case 37:
                                                                    l(1);
                                                                    this.r = (byte) 2;
                                                                    this.n.h = (byte) 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.r = (byte) 3;
                                                                    this.n.h = (byte) 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.r = (byte) 4;
                                                                    this.n.h = (byte) 4;
                                                                    break;
                                                                default:
                                                                    b = this.q;
                                                                    if (b != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case 44:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (b != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (b == 1) {
                                                                                        m8b m8bVar18 = this.n;
                                                                                        arrayList = m8bVar18.b;
                                                                                        arrayList.add(m8bVar18.d());
                                                                                        m8bVar18.c.setLength(0);
                                                                                        m8bVar18.f21361a.clear();
                                                                                        iMin = Math.min((int) m8bVar18.h, m8bVar18.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b4 == 32) {
                                                        l(2);
                                                    } else if (b4 != 41) {
                                                        switch (b4) {
                                                            case 37:
                                                                l(1);
                                                                this.r = (byte) 2;
                                                                this.n.h = (byte) 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.r = (byte) 3;
                                                                this.n.h = (byte) 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.r = (byte) 4;
                                                                this.n.h = (byte) 4;
                                                                break;
                                                            default:
                                                                b = this.q;
                                                                if (b != 0) {
                                                                    if (b4 != 33) {
                                                                        switch (b4) {
                                                                            case 44:
                                                                                this.o = Collections.EMPTY_LIST;
                                                                                if (b != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (b == 1) {
                                                                                    m8b m8bVar19 = this.n;
                                                                                    arrayList = m8bVar19.b;
                                                                                    arrayList.add(m8bVar19.d());
                                                                                    m8bVar19.c.setLength(0);
                                                                                    m8bVar19.f21361a.clear();
                                                                                    iMin = Math.min((int) m8bVar19.h, m8bVar19.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i2 != 23) {
                                                if (i3 == 20) {
                                                    if (b4 == 32) {
                                                        l(2);
                                                    } else if (b4 != 41) {
                                                        switch (b4) {
                                                            case 37:
                                                                l(1);
                                                                this.r = (byte) 2;
                                                                this.n.h = (byte) 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.r = (byte) 3;
                                                                this.n.h = (byte) 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.r = (byte) 4;
                                                                this.n.h = (byte) 4;
                                                                break;
                                                            default:
                                                                b = this.q;
                                                                if (b != 0) {
                                                                    if (b4 != 33) {
                                                                        switch (b4) {
                                                                            case 44:
                                                                                this.o = Collections.EMPTY_LIST;
                                                                                if (b != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (b == 1) {
                                                                                    m8b m8bVar110 = this.n;
                                                                                    arrayList = m8bVar110.b;
                                                                                    arrayList.add(m8bVar110.d());
                                                                                    m8bVar110.c.setLength(0);
                                                                                    m8bVar110.f21361a.clear();
                                                                                    iMin = Math.min((int) m8bVar110.h, m8bVar110.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i3 == 20) {
                                                if (b4 == 32) {
                                                    l(2);
                                                } else if (b4 != 41) {
                                                    switch (b4) {
                                                        case 37:
                                                            l(1);
                                                            this.r = (byte) 2;
                                                            this.n.h = (byte) 2;
                                                            break;
                                                        case 38:
                                                            l(1);
                                                            this.r = (byte) 3;
                                                            this.n.h = (byte) 3;
                                                            break;
                                                        case 39:
                                                            l(1);
                                                            this.r = (byte) 4;
                                                            this.n.h = (byte) 4;
                                                            break;
                                                        default:
                                                            b = this.q;
                                                            if (b != 0) {
                                                                if (b4 != 33) {
                                                                    switch (b4) {
                                                                        case 44:
                                                                            this.o = Collections.EMPTY_LIST;
                                                                            if (b != 1) {
                                                                                k();
                                                                            } else {
                                                                                k();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (b == 1) {
                                                                                m8b m8bVar111 = this.n;
                                                                                arrayList = m8bVar111.b;
                                                                                arrayList.add(m8bVar111.d());
                                                                                m8bVar111.c.setLength(0);
                                                                                m8bVar111.f21361a.clear();
                                                                                iMin = Math.min((int) m8bVar111.h, m8bVar111.d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            k();
                                                                            break;
                                                                        case 47:
                                                                            this.o = j();
                                                                            k();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.n.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    l(3);
                                                }
                                            }
                                        } else {
                                            i3 = b3 & 246;
                                            if (i3 != 18) {
                                                if (i2 != 17) {
                                                    if ((b3 & 240) != 16) {
                                                        if (i2 != 23) {
                                                            if (i3 == 20) {
                                                                if (b4 == 32) {
                                                                    l(2);
                                                                } else if (b4 != 41) {
                                                                    switch (b4) {
                                                                        case 37:
                                                                            l(1);
                                                                            this.r = (byte) 2;
                                                                            this.n.h = (byte) 2;
                                                                            break;
                                                                        case 38:
                                                                            l(1);
                                                                            this.r = (byte) 3;
                                                                            this.n.h = (byte) 3;
                                                                            break;
                                                                        case 39:
                                                                            l(1);
                                                                            this.r = (byte) 4;
                                                                            this.n.h = (byte) 4;
                                                                            break;
                                                                        default:
                                                                            b = this.q;
                                                                            if (b != 0) {
                                                                                if (b4 != 33) {
                                                                                    switch (b4) {
                                                                                        case 44:
                                                                                            this.o = Collections.EMPTY_LIST;
                                                                                            if (b != 1) {
                                                                                                k();
                                                                                            } else {
                                                                                                k();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (b == 1) {
                                                                                                m8b m8bVar112 = this.n;
                                                                                                arrayList = m8bVar112.b;
                                                                                                arrayList.add(m8bVar112.d());
                                                                                                m8bVar112.c.setLength(0);
                                                                                                m8bVar112.f21361a.clear();
                                                                                                iMin = Math.min((int) m8bVar112.h, m8bVar112.d);
                                                                                                while (arrayList.size() >= iMin) {
                                                                                                    arrayList.remove(0);
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            k();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.o = j();
                                                                                            k();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.n.b();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    l(3);
                                                                }
                                                            }
                                                        } else if (i3 == 20) {
                                                            if (b4 == 32) {
                                                                l(2);
                                                            } else if (b4 != 41) {
                                                                switch (b4) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.r = (byte) 2;
                                                                        this.n.h = (byte) 2;
                                                                        break;
                                                                    case 38:
                                                                        l(1);
                                                                        this.r = (byte) 3;
                                                                        this.n.h = (byte) 3;
                                                                        break;
                                                                    case 39:
                                                                        l(1);
                                                                        this.r = (byte) 4;
                                                                        this.n.h = (byte) 4;
                                                                        break;
                                                                    default:
                                                                        b = this.q;
                                                                        if (b != 0) {
                                                                            if (b4 != 33) {
                                                                                switch (b4) {
                                                                                    case 44:
                                                                                        this.o = Collections.EMPTY_LIST;
                                                                                        if (b != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (b == 1) {
                                                                                            m8b m8bVar113 = this.n;
                                                                                            arrayList = m8bVar113.b;
                                                                                            arrayList.add(m8bVar113.d());
                                                                                            m8bVar113.c.setLength(0);
                                                                                            m8bVar113.f21361a.clear();
                                                                                            iMin = Math.min((int) m8bVar113.h, m8bVar113.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b4 == 32) {
                                                                l(2);
                                                            } else if (b4 != 41) {
                                                                switch (b4) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.r = (byte) 2;
                                                                        this.n.h = (byte) 2;
                                                                        break;
                                                                    case 38:
                                                                        l(1);
                                                                        this.r = (byte) 3;
                                                                        this.n.h = (byte) 3;
                                                                        break;
                                                                    case 39:
                                                                        l(1);
                                                                        this.r = (byte) 4;
                                                                        this.n.h = (byte) 4;
                                                                        break;
                                                                    default:
                                                                        b = this.q;
                                                                        if (b != 0) {
                                                                            if (b4 != 33) {
                                                                                switch (b4) {
                                                                                    case 44:
                                                                                        this.o = Collections.EMPTY_LIST;
                                                                                        if (b != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (b == 1) {
                                                                                            m8b m8bVar114 = this.n;
                                                                                            arrayList = m8bVar114.b;
                                                                                            arrayList.add(m8bVar114.d());
                                                                                            m8bVar114.c.setLength(0);
                                                                                            m8bVar114.f21361a.clear();
                                                                                            iMin = Math.min((int) m8bVar114.h, m8bVar114.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b4 == 32) {
                                                            l(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case 37:
                                                                    l(1);
                                                                    this.r = (byte) 2;
                                                                    this.n.h = (byte) 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.r = (byte) 3;
                                                                    this.n.h = (byte) 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.r = (byte) 4;
                                                                    this.n.h = (byte) 4;
                                                                    break;
                                                                default:
                                                                    b = this.q;
                                                                    if (b != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case 44:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (b != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (b == 1) {
                                                                                        m8b m8bVar115 = this.n;
                                                                                        arrayList = m8bVar115.b;
                                                                                        arrayList.add(m8bVar115.d());
                                                                                        m8bVar115.c.setLength(0);
                                                                                        m8bVar115.f21361a.clear();
                                                                                        iMin = Math.min((int) m8bVar115.h, m8bVar115.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if ((b3 & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b4 == 32) {
                                                                l(2);
                                                            } else if (b4 != 41) {
                                                                switch (b4) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.r = (byte) 2;
                                                                        this.n.h = (byte) 2;
                                                                        break;
                                                                    case 38:
                                                                        l(1);
                                                                        this.r = (byte) 3;
                                                                        this.n.h = (byte) 3;
                                                                        break;
                                                                    case 39:
                                                                        l(1);
                                                                        this.r = (byte) 4;
                                                                        this.n.h = (byte) 4;
                                                                        break;
                                                                    default:
                                                                        b = this.q;
                                                                        if (b != 0) {
                                                                            if (b4 != 33) {
                                                                                switch (b4) {
                                                                                    case 44:
                                                                                        this.o = Collections.EMPTY_LIST;
                                                                                        if (b != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (b == 1) {
                                                                                            m8b m8bVar116 = this.n;
                                                                                            arrayList = m8bVar116.b;
                                                                                            arrayList.add(m8bVar116.d());
                                                                                            m8bVar116.c.setLength(0);
                                                                                            m8bVar116.f21361a.clear();
                                                                                            iMin = Math.min((int) m8bVar116.h, m8bVar116.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b4 == 32) {
                                                            l(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case 37:
                                                                    l(1);
                                                                    this.r = (byte) 2;
                                                                    this.n.h = (byte) 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.r = (byte) 3;
                                                                    this.n.h = (byte) 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.r = (byte) 4;
                                                                    this.n.h = (byte) 4;
                                                                    break;
                                                                default:
                                                                    b = this.q;
                                                                    if (b != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case 44:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (b != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (b == 1) {
                                                                                        m8b m8bVar117 = this.n;
                                                                                        arrayList = m8bVar117.b;
                                                                                        arrayList.add(m8bVar117.d());
                                                                                        m8bVar117.c.setLength(0);
                                                                                        m8bVar117.f21361a.clear();
                                                                                        iMin = Math.min((int) m8bVar117.h, m8bVar117.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b4 == 32) {
                                                            l(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case 37:
                                                                    l(1);
                                                                    this.r = (byte) 2;
                                                                    this.n.h = (byte) 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.r = (byte) 3;
                                                                    this.n.h = (byte) 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.r = (byte) 4;
                                                                    this.n.h = (byte) 4;
                                                                    break;
                                                                default:
                                                                    b = this.q;
                                                                    if (b != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case 44:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (b != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (b == 1) {
                                                                                        m8b m8bVar118 = this.n;
                                                                                        arrayList = m8bVar118.b;
                                                                                        arrayList.add(m8bVar118.d());
                                                                                        m8bVar118.c.setLength(0);
                                                                                        m8bVar118.f21361a.clear();
                                                                                        iMin = Math.min((int) m8bVar118.h, m8bVar118.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b4 == 32) {
                                                        l(2);
                                                    } else if (b4 != 41) {
                                                        switch (b4) {
                                                            case 37:
                                                                l(1);
                                                                this.r = (byte) 2;
                                                                this.n.h = (byte) 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.r = (byte) 3;
                                                                this.n.h = (byte) 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.r = (byte) 4;
                                                                this.n.h = (byte) 4;
                                                                break;
                                                            default:
                                                                b = this.q;
                                                                if (b != 0) {
                                                                    if (b4 != 33) {
                                                                        switch (b4) {
                                                                            case 44:
                                                                                this.o = Collections.EMPTY_LIST;
                                                                                if (b != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (b == 1) {
                                                                                    m8b m8bVar119 = this.n;
                                                                                    arrayList = m8bVar119.b;
                                                                                    arrayList.add(m8bVar119.d());
                                                                                    m8bVar119.c.setLength(0);
                                                                                    m8bVar119.f21361a.clear();
                                                                                    iMin = Math.min((int) m8bVar119.h, m8bVar119.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i2 != 17) {
                                                if ((b3 & 240) != 16) {
                                                    if (i2 != 23) {
                                                        if (i3 == 20) {
                                                            if (b4 == 32) {
                                                                l(2);
                                                            } else if (b4 != 41) {
                                                                switch (b4) {
                                                                    case 37:
                                                                        l(1);
                                                                        this.r = (byte) 2;
                                                                        this.n.h = (byte) 2;
                                                                        break;
                                                                    case 38:
                                                                        l(1);
                                                                        this.r = (byte) 3;
                                                                        this.n.h = (byte) 3;
                                                                        break;
                                                                    case 39:
                                                                        l(1);
                                                                        this.r = (byte) 4;
                                                                        this.n.h = (byte) 4;
                                                                        break;
                                                                    default:
                                                                        b = this.q;
                                                                        if (b != 0) {
                                                                            if (b4 != 33) {
                                                                                switch (b4) {
                                                                                    case 44:
                                                                                        this.o = Collections.EMPTY_LIST;
                                                                                        if (b != 1) {
                                                                                            k();
                                                                                        } else {
                                                                                            k();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (b == 1) {
                                                                                            m8b m8bVar1110 = this.n;
                                                                                            arrayList = m8bVar1110.b;
                                                                                            arrayList.add(m8bVar1110.d());
                                                                                            m8bVar1110.c.setLength(0);
                                                                                            m8bVar1110.f21361a.clear();
                                                                                            iMin = Math.min((int) m8bVar1110.h, m8bVar1110.d);
                                                                                            while (arrayList.size() >= iMin) {
                                                                                                arrayList.remove(0);
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        k();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.o = j();
                                                                                        k();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.n.b();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                l(3);
                                                            }
                                                        }
                                                    } else if (i3 == 20) {
                                                        if (b4 == 32) {
                                                            l(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case 37:
                                                                    l(1);
                                                                    this.r = (byte) 2;
                                                                    this.n.h = (byte) 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.r = (byte) 3;
                                                                    this.n.h = (byte) 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.r = (byte) 4;
                                                                    this.n.h = (byte) 4;
                                                                    break;
                                                                default:
                                                                    b = this.q;
                                                                    if (b != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case 44:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (b != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (b == 1) {
                                                                                        m8b m8bVar1111 = this.n;
                                                                                        arrayList = m8bVar1111.b;
                                                                                        arrayList.add(m8bVar1111.d());
                                                                                        m8bVar1111.c.setLength(0);
                                                                                        m8bVar1111.f21361a.clear();
                                                                                        iMin = Math.min((int) m8bVar1111.h, m8bVar1111.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b4 == 32) {
                                                            l(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case 37:
                                                                    l(1);
                                                                    this.r = (byte) 2;
                                                                    this.n.h = (byte) 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.r = (byte) 3;
                                                                    this.n.h = (byte) 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.r = (byte) 4;
                                                                    this.n.h = (byte) 4;
                                                                    break;
                                                                default:
                                                                    b = this.q;
                                                                    if (b != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case 44:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (b != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (b == 1) {
                                                                                        m8b m8bVar1112 = this.n;
                                                                                        arrayList = m8bVar1112.b;
                                                                                        arrayList.add(m8bVar1112.d());
                                                                                        m8bVar1112.c.setLength(0);
                                                                                        m8bVar1112.f21361a.clear();
                                                                                        iMin = Math.min((int) m8bVar1112.h, m8bVar1112.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b4 == 32) {
                                                        l(2);
                                                    } else if (b4 != 41) {
                                                        switch (b4) {
                                                            case 37:
                                                                l(1);
                                                                this.r = (byte) 2;
                                                                this.n.h = (byte) 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.r = (byte) 3;
                                                                this.n.h = (byte) 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.r = (byte) 4;
                                                                this.n.h = (byte) 4;
                                                                break;
                                                            default:
                                                                b = this.q;
                                                                if (b != 0) {
                                                                    if (b4 != 33) {
                                                                        switch (b4) {
                                                                            case 44:
                                                                                this.o = Collections.EMPTY_LIST;
                                                                                if (b != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (b == 1) {
                                                                                    m8b m8bVar1113 = this.n;
                                                                                    arrayList = m8bVar1113.b;
                                                                                    arrayList.add(m8bVar1113.d());
                                                                                    m8bVar1113.c.setLength(0);
                                                                                    m8bVar1113.f21361a.clear();
                                                                                    iMin = Math.min((int) m8bVar1113.h, m8bVar1113.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if ((b3 & 240) != 16) {
                                                if (i2 != 23) {
                                                    if (i3 == 20) {
                                                        if (b4 == 32) {
                                                            l(2);
                                                        } else if (b4 != 41) {
                                                            switch (b4) {
                                                                case 37:
                                                                    l(1);
                                                                    this.r = (byte) 2;
                                                                    this.n.h = (byte) 2;
                                                                    break;
                                                                case 38:
                                                                    l(1);
                                                                    this.r = (byte) 3;
                                                                    this.n.h = (byte) 3;
                                                                    break;
                                                                case 39:
                                                                    l(1);
                                                                    this.r = (byte) 4;
                                                                    this.n.h = (byte) 4;
                                                                    break;
                                                                default:
                                                                    b = this.q;
                                                                    if (b != 0) {
                                                                        if (b4 != 33) {
                                                                            switch (b4) {
                                                                                case 44:
                                                                                    this.o = Collections.EMPTY_LIST;
                                                                                    if (b != 1) {
                                                                                        k();
                                                                                    } else {
                                                                                        k();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (b == 1) {
                                                                                        m8b m8bVar1114 = this.n;
                                                                                        arrayList = m8bVar1114.b;
                                                                                        arrayList.add(m8bVar1114.d());
                                                                                        m8bVar1114.c.setLength(0);
                                                                                        m8bVar1114.f21361a.clear();
                                                                                        iMin = Math.min((int) m8bVar1114.h, m8bVar1114.d);
                                                                                        while (arrayList.size() >= iMin) {
                                                                                            arrayList.remove(0);
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    k();
                                                                                    break;
                                                                                case 47:
                                                                                    this.o = j();
                                                                                    k();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.n.b();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            l(3);
                                                        }
                                                    }
                                                } else if (i3 == 20) {
                                                    if (b4 == 32) {
                                                        l(2);
                                                    } else if (b4 != 41) {
                                                        switch (b4) {
                                                            case 37:
                                                                l(1);
                                                                this.r = (byte) 2;
                                                                this.n.h = (byte) 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.r = (byte) 3;
                                                                this.n.h = (byte) 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.r = (byte) 4;
                                                                this.n.h = (byte) 4;
                                                                break;
                                                            default:
                                                                b = this.q;
                                                                if (b != 0) {
                                                                    if (b4 != 33) {
                                                                        switch (b4) {
                                                                            case 44:
                                                                                this.o = Collections.EMPTY_LIST;
                                                                                if (b != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (b == 1) {
                                                                                    m8b m8bVar1115 = this.n;
                                                                                    arrayList = m8bVar1115.b;
                                                                                    arrayList.add(m8bVar1115.d());
                                                                                    m8bVar1115.c.setLength(0);
                                                                                    m8bVar1115.f21361a.clear();
                                                                                    iMin = Math.min((int) m8bVar1115.h, m8bVar1115.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i2 != 23) {
                                                if (i3 == 20) {
                                                    if (b4 == 32) {
                                                        l(2);
                                                    } else if (b4 != 41) {
                                                        switch (b4) {
                                                            case 37:
                                                                l(1);
                                                                this.r = (byte) 2;
                                                                this.n.h = (byte) 2;
                                                                break;
                                                            case 38:
                                                                l(1);
                                                                this.r = (byte) 3;
                                                                this.n.h = (byte) 3;
                                                                break;
                                                            case 39:
                                                                l(1);
                                                                this.r = (byte) 4;
                                                                this.n.h = (byte) 4;
                                                                break;
                                                            default:
                                                                b = this.q;
                                                                if (b != 0) {
                                                                    if (b4 != 33) {
                                                                        switch (b4) {
                                                                            case 44:
                                                                                this.o = Collections.EMPTY_LIST;
                                                                                if (b != 1) {
                                                                                    k();
                                                                                } else {
                                                                                    k();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (b == 1) {
                                                                                    m8b m8bVar1116 = this.n;
                                                                                    arrayList = m8bVar1116.b;
                                                                                    arrayList.add(m8bVar1116.d());
                                                                                    m8bVar1116.c.setLength(0);
                                                                                    m8bVar1116.f21361a.clear();
                                                                                    iMin = Math.min((int) m8bVar1116.h, m8bVar1116.d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                k();
                                                                                break;
                                                                            case 47:
                                                                                this.o = j();
                                                                                k();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.n.b();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        l(3);
                                                    }
                                                }
                                            } else if (i3 == 20) {
                                                if (b4 == 32) {
                                                    l(2);
                                                } else if (b4 != 41) {
                                                    switch (b4) {
                                                        case 37:
                                                            l(1);
                                                            this.r = (byte) 2;
                                                            this.n.h = (byte) 2;
                                                            break;
                                                        case 38:
                                                            l(1);
                                                            this.r = (byte) 3;
                                                            this.n.h = (byte) 3;
                                                            break;
                                                        case 39:
                                                            l(1);
                                                            this.r = (byte) 4;
                                                            this.n.h = (byte) 4;
                                                            break;
                                                        default:
                                                            b = this.q;
                                                            if (b != 0) {
                                                                if (b4 != 33) {
                                                                    switch (b4) {
                                                                        case 44:
                                                                            this.o = Collections.EMPTY_LIST;
                                                                            if (b != 1) {
                                                                                k();
                                                                            } else {
                                                                                k();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (b == 1) {
                                                                                m8b m8bVar1117 = this.n;
                                                                                arrayList = m8bVar1117.b;
                                                                                arrayList.add(m8bVar1117.d());
                                                                                m8bVar1117.c.setLength(0);
                                                                                m8bVar1117.f21361a.clear();
                                                                                iMin = Math.min((int) m8bVar1117.h, m8bVar1117.d);
                                                                                while (arrayList.size() >= iMin) {
                                                                                    arrayList.remove(0);
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            k();
                                                                            break;
                                                                        case 47:
                                                                            this.o = j();
                                                                            k();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.n.b();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    l(3);
                                                }
                                            }
                                        }
                                    } else {
                                        m8b m8bVar20 = this.n;
                                        iArr = C;
                                        m8bVar20.a((char) iArr[(b3 & 127) - 32]);
                                        if ((b4 & 224) != 0) {
                                            this.n.a((char) iArr[(b4 & 127) - 32]);
                                        }
                                    }
                                    z3 = true;
                                }
                            }
                        } else if (z4) {
                            k();
                            z3 = true;
                        }
                    }
                }
            }
        }
    }

    @Override // a.u8b, a.skj
    /* JADX INFO: renamed from: h */
    public final t8b b() {
        t8b t8bVar;
        t8b t8bVarB = super.b();
        if (t8bVarB != null) {
            return t8bVarB;
        }
        long j = this.l;
        if (j == -9223372036854775807L) {
            return null;
        }
        long j2 = this.y;
        if (j2 == -9223372036854775807L || this.e - j2 < j || (t8bVar = (t8b) this.b.pollFirst()) == null) {
            return null;
        }
        this.o = Collections.EMPTY_LIST;
        this.y = -9223372036854775807L;
        fvt0 fvt0VarF = f();
        long j3 = this.e;
        t8bVar.e = j3;
        t8bVar.g = fvt0VarF;
        t8bVar.h = j3;
        return t8bVar;
    }

    @Override // a.u8b
    public final boolean i() {
        return this.o != this.p;
    }

    public final ArrayList j() {
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            ctf ctfVarC = ((m8b) arrayList.get(i)).c(Integer.MIN_VALUE);
            arrayList2.add(ctfVarC);
            if (ctfVarC != null) {
                iMin = Math.min(iMin, ctfVarC.i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            ctf ctfVarC2 = (ctf) arrayList2.get(i2);
            if (ctfVarC2 != null) {
                if (ctfVarC2.i != iMin) {
                    ctfVarC2 = ((m8b) arrayList.get(i2)).c(iMin);
                    ctfVarC2.getClass();
                }
                arrayList3.add(ctfVarC2);
            }
        }
        return arrayList3;
    }

    public final void k() {
        m8b m8bVar = this.n;
        m8bVar.g = this.q;
        m8bVar.f21361a.clear();
        m8bVar.b.clear();
        m8bVar.c.setLength(0);
        m8bVar.d = 15;
        m8bVar.e = 0;
        m8bVar.f = 0;
        ArrayList arrayList = this.m;
        arrayList.clear();
        arrayList.add(this.n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(int i) {
        byte b = this.q;
        if (b == i) {
            return;
        }
        this.q = i;
        if (i != 3) {
            k();
            if (b == 3 || i == 1 || i == 0) {
                this.o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((m8b) arrayList.get(i2)).g = i;
            i2++;
        }
    }

    @Override // a.u8b, a.skj
    public final void release() {
    }
}
