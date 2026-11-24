package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class jzk {
    public static final Regex b = new Regex("^\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z8w0 f17417a;

    public jzk(z8w0 z8w0Var) {
        this.f17417a = z8w0Var;
    }

    public static String b(byte[] bArr, short s) {
        int i;
        if (bArr.length < 12) {
            return "";
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (byteBufferWrap.getShort() != s || (byteBufferWrap.getShort() & 15) != 0) {
            return "";
        }
        int i2 = byteBufferWrap.getShort() & 65535;
        int i3 = byteBufferWrap.getShort() & 65535;
        for (int i4 = 0; i4 < i2; i4++) {
            c(byteBufferWrap);
        }
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < i3; i5++) {
            if (byteBufferWrap.hasRemaining()) {
                c(byteBufferWrap);
                if (byteBufferWrap.hasRemaining()) {
                    int i6 = byteBufferWrap.getShort() & 65535;
                    byteBufferWrap.getShort();
                    byteBufferWrap.getInt();
                    int i7 = byteBufferWrap.getShort() & 65535;
                    if (i6 == 16) {
                        int iPosition = byteBufferWrap.position() + i7;
                        while (byteBufferWrap.position() < iPosition && byteBufferWrap.hasRemaining() && byteBufferWrap.remaining() >= (i = byteBufferWrap.get() & 255)) {
                            byte[] bArr2 = new byte[i];
                            byteBufferWrap.get(bArr2);
                            Charset charset = StandardCharsets.UTF_8;
                            charset.getClass();
                            sb.append(new String(bArr2, charset));
                        }
                    }
                }
            }
        }
        return sb.toString();
    }

    public static void c(ByteBuffer byteBuffer) {
        byte b2;
        int i;
        while (byteBuffer.hasRemaining() && (i = (b2 = byteBuffer.get()) & 255) != 0) {
            if ((b2 & 192) == 192) {
                byteBuffer.get();
                return;
            }
        }
    }

    public static byte[] d(String str, short s) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(512);
        byteBufferAllocate.putShort(s);
        byteBufferAllocate.putShort((short) 256);
        byteBufferAllocate.putShort((short) 1);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.putShort((short) 0);
        if (!kotlin.text.c.n(str, Separators.DOT, false)) {
            str = str.concat(Separators.DOT);
        }
        List listI0 = StringsKt.i0(str, new char[]{'.'}, 6);
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : listI0) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        for (String str2 : arrayList) {
            byteBufferAllocate.put((byte) str2.length());
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            byte[] bytes = str2.getBytes(charset);
            bytes.getClass();
            byteBufferAllocate.put(bytes);
        }
        byteBufferAllocate.put((byte) 0);
        byteBufferAllocate.putShort((short) 16);
        byteBufferAllocate.putShort((short) 1);
        byte[] bArr = new byte[byteBufferAllocate.position()];
        byteBufferAllocate.get(bArr);
        return bArr;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, zje zjeVar) {
        hzk hzkVar;
        Throwable th;
        Object obj;
        Object g0g0Var;
        if (zjeVar instanceof hzk) {
            hzkVar = (hzk) zjeVar;
            int i = hzkVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                hzkVar.l = i - Integer.MIN_VALUE;
            } else {
                hzkVar = new hzk(this, zjeVar);
            }
        } else {
            hzkVar = new hzk(this, zjeVar);
        }
        Object objF = hzkVar.j;
        wne wneVar = wne.f39444a;
        int i2 = hzkVar.l;
        z8w0 z8w0Var = this.f17417a;
        try {
            try {
                if (i2 == 0) {
                    z1x.P(objF);
                    if (b.g(str)) {
                        return str;
                    }
                    hzkVar.i = str;
                    hzkVar.l = 1;
                    objF = z8w0Var.f(hzkVar, str, true);
                    if (objF == wneVar) {
                    }
                    return wneVar;
                }
                if (i2 == 1) {
                    str = hzkVar.i;
                    z1x.P(objF);
                } else {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = hzkVar.i;
                        try {
                            z1x.P(objF);
                            g0g0Var = ((klj) objF).f18491a;
                            e0g0 e0g0Var = j0g0.b;
                        } catch (Throwable th2) {
                            th = th2;
                            e0g0 e0g0Var2 = j0g0.b;
                            g0g0Var = new g0g0(th);
                        }
                        if (!(g0g0Var instanceof g0g0)) {
                            obj = g0g0Var;
                        }
                        return (String) obj;
                    }
                    String str2 = hzkVar.i;
                    z1x.P(objF);
                }
                return ((klj) objF).f18491a;
                klj kljVar = (klj) objF;
                if (kljVar.b) {
                    return kljVar.f18491a;
                }
                hzkVar.i = str;
                hzkVar.l = 2;
                objF = z8w0Var.f(hzkVar, str, false);
                if (objF == wneVar) {
                    return wneVar;
                }
                return ((klj) objF).f18491a;
            } catch (Exception unused) {
                e0g0 e0g0Var3 = j0g0.b;
                hzkVar.i = str;
                hzkVar.l = 3;
                objF = z8w0Var.f(hzkVar, str, false);
                if (objF != wneVar) {
                    obj = str;
                }
                return wneVar;
            }
        } catch (Throwable th3) {
            th = th3;
            obj = str;
            e0g0 e0g0Var4 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, String str2, zje zjeVar) {
        fzk fzkVar;
        if (zjeVar instanceof fzk) {
            fzkVar = (fzk) zjeVar;
            int i = fzkVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                fzkVar.k = i - Integer.MIN_VALUE;
            } else {
                fzkVar = new fzk(this, zjeVar);
            }
        } else {
            fzkVar = new fzk(this, zjeVar);
        }
        Object objD0 = fzkVar.i;
        wne wneVar = wne.f39444a;
        int i2 = fzkVar.k;
        try {
            if (i2 == 0) {
                z1x.P(objD0);
                short sNextInt = (short) new Random().nextInt(65536);
                rwj rwjVar = tvk.f34603a;
                dvj dvjVar = dvj.c;
                gzk gzkVar = new gzk(this, str, sNextInt, str2, null);
                fzkVar.k = 1;
                objD0 = qjj.d0(dvjVar, gzkVar, fzkVar);
                if (objD0 == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objD0);
            }
            return (Collection) objD0;
        } catch (Exception unused) {
            return xun.f41520a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable f(String str, zje zjeVar) {
        izk izkVar;
        if (zjeVar instanceof izk) {
            izkVar = (izk) zjeVar;
            int i = izkVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                izkVar.k = i - Integer.MIN_VALUE;
            } else {
                izkVar = new izk(this, zjeVar);
            }
        } else {
            izkVar = new izk(this, zjeVar);
        }
        Object objA = izkVar.i;
        wne wneVar = wne.f39444a;
        int i2 = izkVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            if (str.length() == 0) {
                return xun.f41520a;
            }
            String strR = kotlin.text.c.r(str, Separators.DOUBLE_QUOTE, "", false);
            izkVar.k = 1;
            objA = a(strR, izkVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        List listI = new Regex("\\s+").i((String) objA);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listI) {
            if (!StringsKt.W((String) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
