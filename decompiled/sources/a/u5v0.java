package a;

import android.text.TextUtils;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class u5v0 implements fuo {
    public static final Pattern i = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern j = Pattern.compile("MPEGTS:(-?\\d+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35114a;
    public final coq0 b;
    public final jfn0 d;
    public final boolean e;
    public huo f;
    public int h;
    public final fq80 c = new fq80();
    public byte[] g = new byte[1024];

    public u5v0(String str, coq0 coq0Var, jfn0 jfn0Var, boolean z) {
        this.f35114a = str;
        this.b = coq0Var;
        this.d = jfn0Var;
        this.e = z;
    }

    @Override // a.fuo
    public final int a(guo guoVar, mtc mtcVar) throws kq80 {
        String strN;
        this.f.getClass();
        int length = (int) guoVar.getLength();
        int i2 = this.h;
        byte[] bArrCopyOf = this.g;
        if (i2 == bArrCopyOf.length) {
            bArrCopyOf = Arrays.copyOf(bArrCopyOf, ((length != -1 ? length : bArrCopyOf.length) * 3) / 2);
            this.g = bArrCopyOf;
        }
        int i3 = this.h;
        int i4 = guoVar.read(bArrCopyOf, i3, bArrCopyOf.length - i3);
        if (i4 != -1) {
            int i5 = this.h + i4;
            this.h = i5;
            if (length == -1 || i5 != length) {
                return 0;
            }
        }
        fq80 fq80Var = new fq80(this.g);
        v5v0.d(fq80Var);
        String strN2 = fq80Var.n(StandardCharsets.UTF_8);
        long jT = 0;
        long jC = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(strN2)) {
                while (true) {
                    String strN3 = fq80Var.n(StandardCharsets.UTF_8);
                    if (strN3 == null) {
                        break;
                    }
                    if (v5v0.f36845a.matcher(strN3).matches()) {
                        do {
                            strN = fq80Var.n(StandardCharsets.UTF_8);
                            if (strN == null) {
                                break;
                            }
                        } while (!strN.isEmpty());
                    } else {
                        Matcher matcher2 = t5v0.f33388a.matcher(strN3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    g(0L);
                    return -1;
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                long jC2 = v5v0.c(strGroup);
                String str = vtt0.f38024a;
                long jB = this.b.b(vtt0.T((jT + jC2) - jC, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                ncs0 ncs0VarG = g(jB - jC2);
                byte[] bArr = this.g;
                int i6 = this.h;
                fq80 fq80Var2 = this.c;
                fq80Var2.K(bArr, i6);
                ncs0VarG.a(this.h, fq80Var2);
                ncs0VarG.b(jB, 1, this.h, 0, null);
                return -1;
            }
            if (strN2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = i.matcher(strN2);
                if (!matcher3.find()) {
                    throw kq80.a("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strN2), null);
                }
                Matcher matcher4 = j.matcher(strN2);
                if (!matcher4.find()) {
                    throw kq80.a("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strN2), null);
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jC = v5v0.c(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                long j2 = Long.parseLong(strGroup3);
                String str2 = vtt0.f38024a;
                jT = vtt0.T(j2, 1000000L, 90000L, RoundingMode.DOWN);
            }
            strN2 = fq80Var.n(StandardCharsets.UTF_8);
        }
    }

    @Override // a.fuo
    public final void b(long j2, long j3) {
        throw new IllegalStateException();
    }

    @Override // a.fuo
    public final boolean c(guo guoVar) {
        guj gujVar = (guj) guoVar;
        gujVar.b(this.g, 0, 6, false);
        byte[] bArr = this.g;
        fq80 fq80Var = this.c;
        fq80Var.K(bArr, 6);
        if (v5v0.a(fq80Var)) {
            return true;
        }
        gujVar.b(this.g, 6, 3, false);
        fq80Var.K(this.g, 9);
        return v5v0.a(fq80Var);
    }

    @Override // a.fuo
    public final void e(huo huoVar) {
        if (this.e) {
            huoVar = new o24(huoVar, this.d);
        }
        this.f = huoVar;
        huoVar.f(new ca5(-9223372036854775807L));
    }

    public final ncs0 g(long j2) {
        ncs0 ncs0VarQ = this.f.q(0, 3);
        awq awqVar = new awq();
        awqVar.o = mg40.n("text/vtt");
        awqVar.d = this.f35114a;
        awqVar.t = j2;
        ohs0.w(awqVar, ncs0VarQ);
        this.f.o();
        return ncs0VarQ;
    }

    @Override // a.fuo
    public final void release() {
    }
}
