package a;

/* JADX INFO: loaded from: classes2.dex */
public final class rut0 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rut0 f31142a = new rut0();
    public static final ewb0 b = new ewb0("kotlin.uuid.Uuid", zvb0.j);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        mut0 mut0Var = nut0.c;
        String strZ = rkjVar.z();
        mut0Var.getClass();
        strZ.getClass();
        int length = strZ.length();
        int i = 0;
        if (length == 32) {
            long j = 0;
            while (i < 16) {
                long j2 = j << 4;
                char cCharAt = strZ.charAt(i);
                if ((cCharAt >>> '\b') == 0) {
                    long j3 = zvv.d[cCharAt];
                    if (j3 >= 0) {
                        j = j2 | j3;
                        i++;
                    }
                }
                qut0.b(i, strZ, "a hexadecimal digit");
                throw null;
            }
            long j4 = 0;
            for (int i2 = 16; i2 < 32; i2++) {
                long j5 = j4 << 4;
                char cCharAt2 = strZ.charAt(i2);
                if ((cCharAt2 >>> '\b') == 0) {
                    long j6 = zvv.d[cCharAt2];
                    if (j6 >= 0) {
                        j4 = j5 | j6;
                    }
                }
                qut0.b(i2, strZ, "a hexadecimal digit");
                throw null;
            }
            nut0.c.getClass();
            return (j == 0 && j4 == 0) ? nut0.d : new nut0(j, j4);
        }
        if (length != 36) {
            StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
            sb.append(strZ.length() <= 64 ? strZ : strZ.substring(0, 64).concat("..."));
            sb.append("\" of length ");
            sb.append(strZ.length());
            throw new IllegalArgumentException(sb.toString());
        }
        long j7 = 0;
        while (i < 8) {
            long j8 = j7 << 4;
            char cCharAt3 = strZ.charAt(i);
            if ((cCharAt3 >>> '\b') == 0) {
                long j9 = zvv.d[cCharAt3];
                if (j9 >= 0) {
                    j7 = j8 | j9;
                    i++;
                }
            }
            qut0.b(i, strZ, "a hexadecimal digit");
            throw null;
        }
        if (strZ.charAt(8) != '-') {
            qut0.b(8, strZ, "'-' (hyphen)");
            throw null;
        }
        long j10 = 0;
        for (int i3 = 9; i3 < 13; i3++) {
            long j11 = j10 << 4;
            char cCharAt4 = strZ.charAt(i3);
            if ((cCharAt4 >>> '\b') == 0) {
                long j12 = zvv.d[cCharAt4];
                if (j12 >= 0) {
                    j10 = j11 | j12;
                }
            }
            qut0.b(i3, strZ, "a hexadecimal digit");
            throw null;
        }
        if (strZ.charAt(13) != '-') {
            qut0.b(13, strZ, "'-' (hyphen)");
            throw null;
        }
        long j13 = 0;
        for (int i4 = 14; i4 < 18; i4++) {
            long j14 = j13 << 4;
            char cCharAt5 = strZ.charAt(i4);
            if ((cCharAt5 >>> '\b') == 0) {
                long j15 = zvv.d[cCharAt5];
                if (j15 >= 0) {
                    j13 = j14 | j15;
                }
            }
            qut0.b(i4, strZ, "a hexadecimal digit");
            throw null;
        }
        if (strZ.charAt(18) != '-') {
            qut0.b(18, strZ, "'-' (hyphen)");
            throw null;
        }
        long j16 = 0;
        for (int i5 = 19; i5 < 23; i5++) {
            long j17 = j16 << 4;
            char cCharAt6 = strZ.charAt(i5);
            if ((cCharAt6 >>> '\b') == 0) {
                long j18 = zvv.d[cCharAt6];
                if (j18 >= 0) {
                    j16 = j17 | j18;
                }
            }
            qut0.b(i5, strZ, "a hexadecimal digit");
            throw null;
        }
        if (strZ.charAt(23) != '-') {
            qut0.b(23, strZ, "'-' (hyphen)");
            throw null;
        }
        long j19 = 0;
        for (int i6 = 24; i6 < 36; i6++) {
            long j20 = j19 << 4;
            char cCharAt7 = strZ.charAt(i6);
            if ((cCharAt7 >>> '\b') == 0) {
                long j21 = zvv.d[cCharAt7];
                if (j21 >= 0) {
                    j19 = j20 | j21;
                }
            }
            qut0.b(i6, strZ, "a hexadecimal digit");
            throw null;
        }
        long j22 = (j7 << 32) | (j10 << 16) | j13;
        long j23 = (j16 << 48) | j19;
        nut0.c.getClass();
        return (j22 == 0 && j23 == 0) ? nut0.d : new nut0(j22, j23);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        nut0 nut0Var = (nut0) obj;
        nut0Var.getClass();
        bwnVar.E(nut0Var.toString());
    }
}
