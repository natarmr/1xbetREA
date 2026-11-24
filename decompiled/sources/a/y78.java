package a;

import android.database.sqlite.SQLiteDatabase;
import android.gov.nist.core.Separators;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import java.io.File;
import java.lang.ref.WeakReference;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class y78 implements zf60, qgk0, s1x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42140a;
    public int b;
    public Object c;

    public y78(byte b) {
        this.f42140a = b;
        switch (b) {
            case 10:
                this.b = 255;
                this.c = null;
                break;
            case 14:
                this.c = new ArrayList();
                break;
            case 15:
                this.c = new LinkedHashMap();
                break;
            case 17:
                this.c = new fq80(8);
                break;
            default:
                this.b = 0;
                this.c = new StringBuilder();
                break;
        }
    }

    public static void e(SpannableStringBuilder spannableStringBuilder, d0t d0tVar) {
        String string = StringsKt.u0(d0tVar.p.f30947a).toString();
        if (string.length() > 0) {
            long jCurrentTimeMillis = d0tVar.s - (System.currentTimeMillis() / 1000);
            if (1 > jCurrentTimeMillis || jCurrentTimeMillis >= 21600) {
                if (spannableStringBuilder.length() > 0) {
                    spannableStringBuilder.append(", ");
                }
                spannableStringBuilder.append((CharSequence) string);
            }
        }
    }

    public static void i(String str) {
        if (kotlin.text.c.o(str, ":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.e(str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (str.subSequence(i, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e) {
            Log.w("SupportSQLite", "delete failed: ", e);
        }
    }

    public static /* synthetic */ CharSequence n(y78 y78Var, d0t d0tVar, boolean z, boolean z2, int i) {
        if ((i & 2) != 0) {
            z = true;
        }
        return y78Var.m(d0tVar, z, false, z2);
    }

    @Override // a.s1x0
    public byte[] a(int i, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrA;
        byte[] bArrE;
        byte b = 11;
        switch (this.f42140a) {
            case 22:
                if (bArr2.length < i) {
                    hny.o("ciphertext too short");
                    return null;
                }
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, i, bArr2.length);
                brw0 brw0Var = (brw0) this.c;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, brw0Var.f3100a);
                int i2 = brw0Var.f3100a;
                byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i2, brw0Var.b + i2);
                h0q0 h0q0Var = new h0q0();
                h0q0Var.b = null;
                h0q0Var.c = null;
                h0q0Var.d = null;
                h0q0Var.f12247a = brw0Var;
                h0q0Var.b = new rkt0(icw0.a(bArrCopyOf), b);
                h0q0Var.c = new rkt0(icw0.a(bArrCopyOfRange2), b);
                return hix0.a(h0q0Var.C()).b(bArrCopyOfRange, i4w0.m);
            default:
                if (bArr2.length < i) {
                    hny.o("ciphertext too short");
                    return null;
                }
                byte[] bArrCopyOfRange3 = Arrays.copyOfRange(bArr2, i, bArr2.length);
                mkt0 mkt0Var = new mkt0();
                mkt0Var.b = null;
                mkt0Var.c = null;
                mkt0Var.f21959a = (zyw0) this.c;
                mkt0Var.b = new rkt0(icw0.a(bArr), b);
                uyw0 uyw0VarC = mkt0Var.c();
                xhx0 xhx0Var = new xhx0(((icw0) uyw0VarC.b.b).b(), uyw0VarC.c);
                byte[][] bArr3 = {i4w0.m};
                int length = bArrCopyOfRange3.length;
                byte[] bArr4 = xhx0Var.c;
                if (length < bArr4.length + 16) {
                    hny.o("Ciphertext too short.");
                    return null;
                }
                if (!x7x0.b(bArr4, bArrCopyOfRange3)) {
                    hny.o("Decryption failed (OutputPrefix mismatch).");
                    return null;
                }
                Cipher cipher = (Cipher) xhx0.f.get();
                byte[] bArrCopyOfRange4 = Arrays.copyOfRange(bArrCopyOfRange3, bArr4.length, bArr4.length + 16);
                byte[] bArr5 = (byte[]) bArrCopyOfRange4.clone();
                bArr5[8] = (byte) (bArr5[8] & 127);
                bArr5[12] = (byte) (bArr5[12] & 127);
                cipher.init(2, new SecretKeySpec(xhx0Var.b, "AES"), new IvParameterSpec(bArr5));
                int length2 = bArr4.length + 16;
                int length3 = bArrCopyOfRange3.length - length2;
                byte[] bArrDoFinal = cipher.doFinal(bArrCopyOfRange3, length2, length3);
                if (length3 == 0 && bArrDoFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
                    bArrDoFinal = new byte[0];
                }
                byte[][] bArr6 = (byte[][]) Arrays.copyOf(bArr3, 2);
                bArr6[1] = bArrDoFinal;
                int length4 = bArr6.length;
                r9x0 r9x0Var = xhx0Var.f40916a;
                if (length4 == 0) {
                    bArrE = r9x0Var.e(xhx0.e, 16);
                } else {
                    byte[] bArrE2 = r9x0Var.e(xhx0.d, 16);
                    for (int i3 = 0; i3 < bArr6.length - 1; i3++) {
                        byte[] bArr7 = bArr6[i3];
                        if (bArr7 == null) {
                            bArr7 = new byte[0];
                        }
                        bArrE2 = egm0.A(idm0.B(bArrE2), r9x0Var.e(bArr7, 16));
                    }
                    byte[] bArr8 = bArr6[bArr6.length - 1];
                    if (bArr8.length >= 16) {
                        if (bArr8.length < bArrE2.length) {
                            jf4.o("xorEnd requires a.length >= b.length");
                            return null;
                        }
                        int length5 = bArr8.length - bArrE2.length;
                        bArrA = Arrays.copyOf(bArr8, bArr8.length);
                        for (int i4 = 0; i4 < bArrE2.length; i4++) {
                            int i5 = length5 + i4;
                            bArrA[i5] = (byte) (bArrA[i5] ^ bArrE2[i4]);
                        }
                    } else {
                        if (bArr8.length >= 16) {
                            jf4.o("x must be smaller than a block.");
                            return null;
                        }
                        byte[] bArrCopyOf2 = Arrays.copyOf(bArr8, 16);
                        bArrCopyOf2[bArr8.length] = -128;
                        bArrA = egm0.A(bArrCopyOf2, idm0.B(bArrE2));
                    }
                    bArrE = r9x0Var.e(bArrA, 16);
                }
                if (MessageDigest.isEqual(bArrCopyOfRange4, bArrE)) {
                    return bArrDoFinal;
                }
                throw new AEADBadTagException("Integrity check failed.");
        }
    }

    public void b(List list) {
        list.getClass();
        ((ArrayList) this.c).addAll(list);
    }

    public void c(SpannableStringBuilder spannableStringBuilder, d0t d0tVar) {
        String strG = d0tVar.p.m;
        String str = "";
        if (StringsKt.W(strG)) {
            if (StringsKt.W(spannableStringBuilder)) {
                rdj rdjVar = rdj.f30294a;
                boolean zH = ((ctf0) this.c).h();
                strG = rdj.g(new znq0(d0tVar.s), efj.UNIVERSAL, Boolean.valueOf(zH), false, 56);
            } else {
                strG = "";
            }
        }
        if (!StringsKt.W(spannableStringBuilder)) {
            str = ttm0.J(spannableStringBuilder) == ',' ? Separators.SP : ", ";
        }
        if (StringsKt.W(strG)) {
            return;
        }
        spannableStringBuilder.append((CharSequence) str.concat(strG));
    }

    public void d(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence) {
        if (StringsKt.W(charSequence)) {
            return;
        }
        if (!StringsKt.W(spannableStringBuilder)) {
            spannableStringBuilder.append(", ");
        }
        spannableStringBuilder.append((CharSequence) ((ctf0) this.c).b.a(R.string.score, Arrays.copyOf(new Object[0], 0)));
        spannableStringBuilder.append(Separators.SP);
        spannableStringBuilder.append((CharSequence) ("\u2066" + ((Object) charSequence) + "\u2069"));
    }

    public void f(SpannableStringBuilder spannableStringBuilder, d0t d0tVar, boolean z) {
        rqs rqsVar = d0tVar.p;
        long j = rqsVar.j;
        if (j != 0) {
            if (spannableStringBuilder.length() > 0) {
                spannableStringBuilder.append(Separators.COMMA);
            }
            if (z) {
                boolean z2 = rqsVar.z;
                String strA = String.format(Locale.ENGLISH, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j / 60), Long.valueOf(j % 60)}, 2));
                if (!rqsVar.p) {
                    strA = ((ctf0) this.c).b.a(z2 ? R.string.line_live_time_period_back_v2 : R.string.line_live_time_period_capitalized_v2, Arrays.copyOf(new Object[]{strA}, 1));
                }
                spannableStringBuilder.append((CharSequence) Separators.SP.concat(strA));
            }
            String strB0 = qzb.b0(d0tVar);
            if (!z || strB0.length() <= 0) {
                return;
            }
            spannableStringBuilder.append((CharSequence) (" (" + strB0 + Separators.RPAREN));
        }
    }

    public void g(SpannableStringBuilder spannableStringBuilder, d0t d0tVar) {
        if (d0tVar.s != 0) {
            rdj rdjVar = rdj.f30294a;
            boolean zH = ((ctf0) this.c).h();
            spannableStringBuilder.append((CharSequence) (Separators.SP + rdj.g(new znq0(d0tVar.s), efj.UNIVERSAL, Boolean.valueOf(zH), false, 56)));
        }
    }

    public void h() {
        int i = this.b;
        this.b = i + 1;
        if (i >= 10) {
            this.b = 0;
            Iterator it = ((LinkedHashMap) this.c).values().iterator();
            while (it.hasNext()) {
                ArrayList arrayList = (ArrayList) it.next();
                if (arrayList.size() <= 1) {
                    rbe0 rbe0Var = (rbe0) CollectionsKt.firstOrNull(arrayList);
                    if ((rbe0Var != null ? (dyw) rbe0Var.f30181a.get() : null) == null) {
                        it.remove();
                    }
                } else {
                    int size = arrayList.size();
                    int i2 = 0;
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = i3 - i2;
                        if (((rbe0) arrayList.get(i4)).f30181a.get() == null) {
                            arrayList.remove(i4);
                            i2++;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        it.remove();
                    }
                }
            }
        }
    }

    public void j(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.c;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.c = Arrays.copyOf(cArr, i3);
        }
    }

    public CharSequence k(d0t d0tVar, boolean z) {
        String strN;
        int i = this.b;
        rqs rqsVar = d0tVar.p;
        List list = rqsVar.d;
        int i2 = 1;
        boolean z2 = cy7.c() && z;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                q3d.p();
                throw null;
            }
            tf90 tf90Var = ((df90) obj).b;
            int i5 = tf90Var.b;
            int i6 = tf90Var.c;
            if (i3 == q3d.i(list)) {
                int i7 = rqsVar.g;
                if (i7 == i2) {
                    strN = !z2 ? w6x.n(i5, i6, "*-") : w6x.n(i6, i5, "-*");
                } else if (i7 != 2) {
                    strN = !z2 ? w6x.n(i5, i6, "-") : w6x.n(i6, i5, "-");
                } else {
                    strN = !z2 ? w6x.n(i5, i6, "-*") : w6x.n(i6, i5, "*-");
                }
            } else {
                strN = !z2 ? w6x.n(i5, i6, "-") : w6x.n(i6, i5, "-");
            }
            arrayList.add(strN);
            i3 = i4;
            i2 = 1;
        }
        String strB0 = CollectionsKt.b0(arrayList, ", ", null, null, new vls((byte) 3), 30);
        long j = d0tVar.v;
        CharSequence charSequenceAppend = "";
        if (j != 4) {
            return j == 40 ? twn.p("\\*", strB0, "") : strB0;
        }
        boolean z3 = z && cy7.c();
        kts ktsVar = d0tVar.p.h;
        String str = ktsVar.f18881a;
        String str2 = ktsVar.b;
        if (str.length() != 0 && str2.length() != 0) {
            SpannableString spannableString = new SpannableString(str);
            if (ktsVar.c) {
                spannableString.setSpan(new ForegroundColorSpan(i), 0, spannableString.length(), 17);
            }
            SpannableString spannableString2 = new SpannableString(str2);
            if (ktsVar.d) {
                spannableString2.setSpan(new ForegroundColorSpan(i), 0, spannableString2.length(), 17);
            }
            if (z3) {
                charSequenceAppend = new SpannableStringBuilder().append((CharSequence) spannableString2).append((CharSequence) "-").append((CharSequence) spannableString);
                charSequenceAppend.getClass();
            } else {
                charSequenceAppend = new SpannableStringBuilder().append((CharSequence) spannableString).append((CharSequence) "-").append((CharSequence) spannableString2);
                charSequenceAppend.getClass();
            }
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z3) {
            spannableStringBuilder.append(charSequenceAppend);
            spannableStringBuilder.append((CharSequence) Separators.COLON);
            spannableStringBuilder.append((CharSequence) strB0);
            return spannableStringBuilder;
        }
        spannableStringBuilder.append((CharSequence) strB0);
        spannableStringBuilder.append((CharSequence) Separators.COLON);
        spannableStringBuilder.append(charSequenceAppend);
        return spannableStringBuilder;
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        view.getClass();
        int i = xiv0Var.f40966a.i(1).b;
        gbl0 gbl0Var = (gbl0) this.c;
        lme0 lme0Var = gbl0.c2;
        sj3.L0(gbl0Var.I0().e, 0, i, 0, 0, 13);
        sj3.L0(gbl0Var.I0().c.getCardsContainer(), 0, i + this.b, 0, 0, 13);
        return xiv0Var;
    }

    public CharSequence m(d0t d0tVar, boolean z, boolean z2, boolean z3) {
        d0tVar.getClass();
        pfs pfsVar = d0tVar.y;
        boolean z4 = d0tVar.h;
        rqs rqsVar = d0tVar.p;
        if (z4) {
            return new SpannableString(((ctf0) this.c).b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0)));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (pfsVar.c.length() > 0) {
            spannableStringBuilder.append((CharSequence) pfsVar.c);
        }
        String string = StringsKt.u0(d0tVar.c).toString();
        String string2 = StringsKt.u0(rqsVar.f30947a).toString();
        if (string.length() > 0 && !kotlin.text.c.l(string2, string)) {
            spannableStringBuilder.append((CharSequence) Separators.SP.concat(string));
        }
        e(spannableStringBuilder, d0tVar);
        f(spannableStringBuilder, d0tVar, z);
        if (z2) {
            d(spannableStringBuilder, (d0tVar.q.f8731a == 0 || d0tVar.r.f8731a == 0) ? "" : qzb.G0(d0tVar, this.b, z3));
        }
        String strQ0 = qzb.q0(d0tVar, false);
        if (!rqsVar.d.isEmpty() && !rqsVar.i.equals(strQ0)) {
            spannableStringBuilder.append(" (");
            spannableStringBuilder.append(k(d0tVar, z3));
            spannableStringBuilder.append(Separators.RPAREN);
        }
        if (d0tVar.C) {
            c(spannableStringBuilder, d0tVar);
        } else {
            g(spannableStringBuilder, d0tVar);
        }
        CharSequence charSequenceU0 = StringsKt.u0(spannableStringBuilder);
        return (charSequenceU0.length() <= 0 || ttm0.J(charSequenceU0) != ',') ? charSequenceU0 : new SpannableStringBuilder(charSequenceU0.subSequence(0, charSequenceU0.length() - 1));
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0067  */
    public CharSequence o(d0t d0tVar, boolean z, boolean z2, boolean z3) {
        CharSequence charSequenceG0;
        d0tVar.getClass();
        pfs pfsVar = d0tVar.y;
        boolean z4 = d0tVar.h;
        long j = d0tVar.v;
        if (z4) {
            return new SpannableString(((ctf0) this.c).b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0)));
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (pfsVar.c.length() > 0) {
            spannableStringBuilder.append((CharSequence) pfsVar.c);
        }
        e(spannableStringBuilder, d0tVar);
        f(spannableStringBuilder, d0tVar, z);
        if (z2) {
            if (d0tVar.q.f8731a == 0 || d0tVar.r.f8731a == 0) {
                charSequenceG0 = "";
            } else {
                int i = this.b;
                if (j == 66) {
                    charSequenceG0 = qzb.a0(d0tVar, z3);
                    if (charSequenceG0 == null) {
                        charSequenceG0 = "";
                    }
                } else {
                    charSequenceG0 = qzb.G0(d0tVar, i, z3);
                }
            }
            d(spannableStringBuilder, charSequenceG0);
        }
        rqs rqsVar = d0tVar.p;
        String strU = kotlin.text.c.u(rqsVar.c, "-", " : ", false);
        String str = (j == 66 && (strU = qzb.a0(d0tVar, false)) == null) ? "" : strU;
        if (!rqsVar.d.isEmpty() && !rqsVar.i.equals(str)) {
            spannableStringBuilder.append(" (");
            spannableStringBuilder.append(k(d0tVar, z3));
            spannableStringBuilder.append(Separators.RPAREN);
        }
        if (d0tVar.C) {
            c(spannableStringBuilder, d0tVar);
        } else {
            g(spannableStringBuilder, d0tVar);
        }
        CharSequence charSequenceU0 = StringsKt.u0(spannableStringBuilder);
        return (charSequenceU0.length() <= 0 || ttm0.J(charSequenceU0) != ',') ? charSequenceU0 : new SpannableStringBuilder(charSequenceU0.subSequence(0, charSequenceU0.length() - 1));
    }

    public boolean q() {
        return ((kil) this.c) != null;
    }

    public void r(int i, j04 j04Var) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            j04 j04Var2 = ((j04[]) this.c)[i2];
            j04Var2.getClass();
            if (Intrinsics.f(0L, j04Var.g - j04Var2.g) <= 0) {
                break;
            }
            j04Var2.f = i;
            ((j04[]) this.c)[i] = j04Var2;
            i = i2;
        }
        ((j04[]) this.c)[i] = j04Var;
        j04Var.f = i;
    }

    public void s(w7r w7rVar, int i, int i2) {
        ((udg0) this.c).e(new okn0(w7rVar), i, i2);
    }

    public long t(guj gujVar) {
        fq80 fq80Var = (fq80) this.c;
        int i = 0;
        gujVar.b(fq80Var.f9961a, 0, 1, false);
        int i2 = fq80Var.f9961a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        gujVar.b(fq80Var.f9961a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (fq80Var.f9961a[i] & 255) + (i5 << 8);
        }
        this.b = i4 + 1 + this.b;
        return i5;
    }

    public String toString() {
        switch (this.f42140a) {
            case 6:
                return new String((char[]) this.c, 0, this.b);
            case 20:
                t3x t3xVar = (t3x) this.c;
                int i = t3xVar.b;
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList.add(vtt0.X(t3xVar.a(i2)));
                }
                return "UnsupportedBrands{major=" + vtt0.X(this.b) + ", compatible=" + arrayList + "}";
            default:
                return super.toString();
        }
    }

    public void u() {
        jub jubVar = jub.c;
        char[] cArr = (char[]) this.c;
        jubVar.getClass();
        cArr.getClass();
        synchronized (jubVar) {
            int i = jubVar.b;
            if (cArr.length + i < jx3.f17282a) {
                jubVar.b = i + cArr.length;
                jubVar.f17145a.addLast(cArr);
            }
        }
    }

    public void v(j04 j04Var) {
        j04 j04Var2;
        int i = j04Var.f;
        if (i == -1) {
            jf4.o("Failed requirement.");
            return;
        }
        int i2 = this.b;
        j04 j04Var3 = ((j04[]) this.c)[i2];
        j04Var3.getClass();
        j04Var.f = -1;
        ((j04[]) this.c)[i2] = null;
        this.b = i2 - 1;
        if (j04Var == j04Var3) {
            return;
        }
        int iF = Intrinsics.f(0L, j04Var3.g - j04Var.g);
        if (iF == 0) {
            ((j04[]) this.c)[i] = j04Var3;
            j04Var3.f = i;
            return;
        }
        if (iF >= 0) {
            r(i, j04Var3);
            return;
        }
        while (true) {
            int i3 = i << 1;
            int i4 = i3 + 1;
            int i5 = this.b;
            if (i4 > i5) {
                if (i3 > i5) {
                    break;
                }
                j04Var2 = ((j04[]) this.c)[i3];
                j04Var2.getClass();
            } else {
                j04Var2 = ((j04[]) this.c)[i3];
                j04Var2.getClass();
                j04 j04Var4 = ((j04[]) this.c)[i4];
                j04Var4.getClass();
                if (Intrinsics.f(0L, j04Var4.g - j04Var2.g) >= 0) {
                    j04Var2 = j04Var4;
                }
            }
            if (Intrinsics.f(0L, j04Var2.g - j04Var3.g) <= 0) {
                break;
            }
            int i6 = j04Var2.f;
            j04Var2.f = i;
            ((j04[]) this.c)[i] = j04Var2;
            i = i6;
        }
        ((j04[]) this.c)[i] = j04Var3;
        j04Var3.f = i;
    }

    public void w(jr30 jr30Var, dyw dywVar, Map map, long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        Object arrayList = linkedHashMap.get(jr30Var);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(jr30Var, arrayList);
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        rbe0 rbe0Var = new rbe0(new WeakReference(dywVar), map, j);
        if (arrayList2.isEmpty()) {
            arrayList2.add(rbe0Var);
        } else {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                rbe0 rbe0Var2 = (rbe0) arrayList2.get(i);
                if (j >= rbe0Var2.c) {
                    if (rbe0Var2.f30181a.get() == dywVar) {
                        arrayList2.set(i, rbe0Var);
                        break;
                    } else {
                        arrayList2.add(i, rbe0Var);
                        break;
                    }
                }
            }
        }
        h();
    }

    public void x(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        j(this.b, length);
        str.getChars(0, str.length(), (char[]) this.c, this.b);
        this.b += length;
    }

    @Override // a.s1x0
    public int zza() {
        switch (this.f42140a) {
            case 22:
                break;
        }
        return this.b;
    }

    public /* synthetic */ y78(Object obj, int i, byte b) {
        this.f42140a = b;
        this.c = obj;
        this.b = i;
    }

    public y78(ConnectionResult connectionResult, int i) {
        this.f42140a = (byte) 21;
        s0x.H(connectionResult);
        this.c = connectionResult;
        this.b = i;
    }

    public y78(zyw0 zyw0Var) {
        this.f42140a = (byte) 23;
        this.c = zyw0Var;
        this.b = zyw0Var.f45226a;
    }

    public /* synthetic */ y78(byte b, boolean z) {
        this.f42140a = b;
    }

    public y78(brw0 brw0Var) {
        this.f42140a = (byte) 22;
        this.c = brw0Var;
        this.b = brw0Var.f3100a + brw0Var.b;
    }

    public y78(y78 y78Var) {
        this.f42140a = (byte) 13;
        this.c = y78Var;
        this.b = y78Var.b;
    }

    public y78(ctf0 ctf0Var) {
        this.f42140a = (byte) 2;
        ctf0Var.getClass();
        this.c = ctf0Var;
        this.b = ctf0Var.a(R.color.static_green);
    }

    public y78(int[] iArr, int i) {
        this.f42140a = (byte) 20;
        this.b = i;
        t3x t3xVar = t3x.c;
        if (iArr != null && iArr.length != 0) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            t3xVar = new t3x(iArrCopyOf, iArrCopyOf.length);
        }
        this.c = t3xVar;
    }

    public y78(k1a k1aVar) {
        this.f42140a = (byte) 19;
        this.c = k1aVar;
        this.b = Math.max(4, Runtime.getRuntime().availableProcessors() - 2);
    }

    public y78(udg0 udg0Var, int i) {
        this.f42140a = (byte) 16;
        this.c = udg0Var;
        this.f42140a = (byte) 16;
        this.b = i;
    }

    public y78(boolean z, boolean z2, boolean z3) {
        this.f42140a = (byte) 9;
        this.b = (z || z2 || z3) ? 1 : 0;
    }
}
