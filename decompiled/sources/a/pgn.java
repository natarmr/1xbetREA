package a;

import com.appsflyer.share.attribution.RequestError;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class pgn extends n2t0 {
    public static final int[] j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};
    public static final int[] k = {1, 1, 1, 1, 1, 1};
    public static final int[][] l = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};
    public final /* synthetic */ byte h;
    public final Object i;

    public pgn(byte b) {
        this.h = b;
        switch (b) {
            case 1:
                this.i = new int[4];
                break;
            case 2:
                this.i = new int[4];
                break;
            case 3:
                this.i = new pgn((byte) 0);
                break;
            default:
                this.i = new int[4];
                break;
        }
    }

    public static i0g0 o(i0g0 i0g0Var) throws bwq {
        String str = i0g0Var.f13947a;
        if (str.charAt(0) != '0') {
            throw bwq.a();
        }
        i0g0 i0g0Var2 = new i0g0(str.substring(1), null, i0g0Var.c, ju5.o);
        Map map = i0g0Var.e;
        if (map != null) {
            i0g0Var2.a(map);
        }
        return i0g0Var2;
    }

    @Override // a.jl60, a.rae0
    public i0g0 a(chf0 chf0Var, Map map) {
        switch (this.h) {
            case 3:
                return o(((pgn) this.i).a(chf0Var, map));
            default:
                return super.a(chf0Var, map);
        }
    }

    @Override // a.n2t0, a.jl60
    public i0g0 b(int i, p68 p68Var, Map map) {
        switch (this.h) {
            case 3:
                return o(((pgn) this.i).b(i, p68Var, map));
            default:
                return super.b(i, p68Var, map);
        }
    }

    @Override // a.n2t0
    public boolean g(String str) {
        switch (this.h) {
            case 1:
                char[] cArr = new char[6];
                str.getChars(1, 7, cArr, 0);
                StringBuilder sb = new StringBuilder(12);
                sb.append(str.charAt(0));
                char c = cArr[5];
                switch (c) {
                    case '0':
                    case '1':
                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                        sb.append(cArr, 0, 2);
                        sb.append(c);
                        sb.append("0000");
                        sb.append(cArr, 2, 3);
                        break;
                    case '3':
                        sb.append(cArr, 0, 3);
                        sb.append("00000");
                        sb.append(cArr, 3, 2);
                        break;
                    case '4':
                        sb.append(cArr, 0, 4);
                        sb.append("00000");
                        sb.append(cArr[4]);
                        break;
                    default:
                        sb.append(cArr, 0, 5);
                        sb.append("0000");
                        sb.append(c);
                        break;
                }
                if (str.length() >= 8) {
                    sb.append(str.charAt(7));
                }
                return super.g(sb.toString());
            default:
                return super.g(str);
        }
    }

    @Override // a.n2t0
    public int[] i(p68 p68Var, int i) {
        switch (this.h) {
            case 1:
                return n2t0.l(p68Var, i, true, k, new int[6]);
            default:
                return super.i(p68Var, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.n2t0
    public final int j(p68 p68Var, int[] iArr, StringBuilder sb) throws o660 {
        byte b = this.h;
        int[][] iArr2 = n2t0.g;
        int[] iArr3 = n2t0.e;
        int[][] iArr4 = n2t0.f;
        int i = 1;
        Object obj = this.i;
        switch (b) {
            case 0:
                int[] iArr5 = (int[]) obj;
                iArr5[0] = 0;
                iArr5[1] = 0;
                iArr5[2] = 0;
                iArr5[3] = 0;
                int i2 = p68Var.b;
                int i3 = iArr[1];
                int i4 = 0;
                int i5 = 0;
                for (int i6 = 6; i4 < i6 && i3 < i2; i6 = 6) {
                    int iH = n2t0.h(p68Var, iArr5, i3, iArr2);
                    sb.append((char) ((iH % 10) + 48));
                    int i7 = i;
                    for (int i8 : iArr5) {
                        i3 += i8;
                    }
                    if (iH >= 10) {
                        i5 |= i7 << (5 - i4);
                    }
                    i4++;
                    i = i7;
                }
                boolean z = i;
                for (int i9 = 0; i9 < 10; i9++) {
                    if (i5 == j[i9]) {
                        sb.insert(0, (char) (i9 + 48));
                        int i10 = n2t0.l(p68Var, i3, z, iArr3, new int[5])[z ? 1 : 0];
                        for (int i11 = 0; i11 < 6 && i10 < i2; i11++) {
                            sb.append((char) (n2t0.h(p68Var, iArr5, i10, iArr4) + 48));
                            for (int i12 : iArr5) {
                                i10 += i12;
                            }
                        }
                        return i10;
                    }
                }
                throw o660.a();
            case 1:
                int[] iArr6 = (int[]) obj;
                iArr6[0] = 0;
                iArr6[1] = 0;
                iArr6[2] = 0;
                iArr6[3] = 0;
                int i13 = p68Var.b;
                int i14 = iArr[1];
                int i15 = 0;
                for (int i16 = 0; i16 < 6 && i14 < i13; i16++) {
                    int iH2 = n2t0.h(p68Var, iArr6, i14, iArr2);
                    sb.append((char) ((iH2 % 10) + 48));
                    for (int i17 : iArr6) {
                        i14 += i17;
                    }
                    if (iH2 >= 10) {
                        i15 |= 1 << (5 - i16);
                    }
                }
                for (int i18 = 0; i18 <= 1; i18++) {
                    for (int i19 = 0; i19 < 10; i19++) {
                        if (i15 == l[i18][i19]) {
                            sb.insert(0, (char) (i18 + 48));
                            sb.append((char) (i19 + 48));
                            return i14;
                        }
                    }
                }
                throw o660.a();
            case 2:
                int[] iArr7 = (int[]) obj;
                iArr7[0] = 0;
                iArr7[1] = 0;
                iArr7[2] = 0;
                iArr7[3] = 0;
                int i20 = p68Var.b;
                int i21 = iArr[1];
                for (int i22 = 0; i22 < 4 && i21 < i20; i22++) {
                    sb.append((char) (n2t0.h(p68Var, iArr7, i21, iArr4) + 48));
                    for (int i23 : iArr7) {
                        i21 += i23;
                    }
                }
                int i24 = n2t0.l(p68Var, i21, true, iArr3, new int[5])[1];
                for (int i25 = 0; i25 < 4 && i24 < i20; i25++) {
                    sb.append((char) (n2t0.h(p68Var, iArr7, i24, iArr4) + 48));
                    for (int i26 : iArr7) {
                        i24 += i26;
                    }
                }
                return i24;
            default:
                return ((pgn) obj).j(p68Var, iArr, sb);
        }
    }

    @Override // a.n2t0
    public i0g0 k(int i, p68 p68Var, int[] iArr, Map map) {
        switch (this.h) {
            case 3:
                return o(((pgn) this.i).k(i, p68Var, iArr, map));
            default:
                return super.k(i, p68Var, iArr, map);
        }
    }

    @Override // a.n2t0
    public final ju5 n() {
        switch (this.h) {
            case 0:
                return ju5.h;
            case 1:
                return ju5.p;
            case 2:
                return ju5.g;
            default:
                return ju5.o;
        }
    }
}
