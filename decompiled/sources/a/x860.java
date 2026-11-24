package a;

import android.content.Context;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Log;
import com.appsflyer.share.attribution.RequestError;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public class x860 implements l3u0, oju0, nae0, s1x0, mgn {
    public static final float[] b = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f, 1.0E11f, 1.0E12f, 1.0E13f, 1.0E14f, 1.0E15f, 1.0E16f, 1.0E17f, 1.0E18f, 1.0E19f, 1.0E20f, 1.0E21f, 1.0E22f, 1.0E23f, 1.0E24f, 1.0E25f, 1.0E26f, 1.0E27f, 1.0E28f, 1.0E29f, 1.0E30f, 1.0E31f, 1.0E32f, 1.0E33f, 1.0E34f, 1.0E35f, 1.0E36f, 1.0E37f, 1.0E38f};
    public static final float[] c = {1.0f, 0.1f, 0.01f, 0.001f, 1.0E-4f, 1.0E-5f, 1.0E-6f, 1.0E-7f, 1.0E-8f, 1.0E-9f, 1.0E-10f, 1.0E-11f, 1.0E-12f, 1.0E-13f, 1.0E-14f, 1.0E-15f, 1.0E-16f, 1.0E-17f, 1.0E-18f, 1.0E-19f, 1.0E-20f, 1.0E-21f, 1.0E-22f, 1.0E-23f, 1.0E-24f, 1.0E-25f, 1.0E-26f, 1.0E-27f, 1.0E-28f, 1.0E-29f, 1.0E-30f, 1.0E-31f, 1.0E-32f, 1.0E-33f, 1.0E-34f, 1.0E-35f, 1.0E-36f, 1.0E-37f, 1.0E-38f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f40449a;

    public x860(int i, wz9 wz9Var) {
        wz9Var.getClass();
        this.f40449a = i;
    }

    public static un00 c(dmk dmkVar, y78 y78Var) {
        IOException iOException = (IOException) y78Var.c;
        if (!(iOException instanceof ptw)) {
            return null;
        }
        int i = ((ptw) iOException).c;
        if (i != 403 && i != 404 && i != 410 && i != 416 && i != 500 && i != 503) {
            return null;
        }
        if (dmkVar.e) {
            if (dmkVar.b(2)) {
                return new un00(2, 60000L);
            }
            if (dmkVar.b(1)) {
                return new un00(1, 300000L);
            }
            return null;
        }
        if (dmkVar.b(1)) {
            return new un00(1, 300000L);
        }
        if (dmkVar.b(2)) {
            return new un00(2, 60000L);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00fa  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r1v16, types: [a.ikt0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0158 -> B:72:0x0159). Please report as a decompilation issue!!! */
    public static x860 i() throws Throwable {
        InputStream resourceAsStream;
        String str;
        String str2;
        ?? r0;
        hkz hkzVar = hkz.c;
        hkzVar.getClass();
        fhn fhnVar = hkz.b;
        s0x.F("firebase-auth", "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = hkzVar.f13230a;
        if (concurrentHashMap.containsKey("firebase-auth")) {
            str2 = (String) concurrentHashMap.get("firebase-auth");
        } else {
            Properties properties = new Properties();
            InputStream inputStream = null;
            property = null;
            String property = null;
            InputStream inputStream2 = null;
            try {
                try {
                    resourceAsStream = hkz.class.getResourceAsStream("/firebase-auth.properties");
                    try {
                        if (resourceAsStream != null) {
                            properties.load(resourceAsStream);
                            property = properties.getProperty("version", null);
                            StringBuilder sb = new StringBuilder(25 + String.valueOf(property).length());
                            sb.append("firebase-auth version is ");
                            sb.append(property);
                            String string = sb.toString();
                            fhnVar.getClass();
                            if (Log.isLoggable("LibraryVersion", 2)) {
                                String str3 = fhnVar.b;
                                if (str3 != null) {
                                    string = str3.concat(string);
                                }
                                Log.v("LibraryVersion", string);
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder(56);
                            sb2.append("Failed to get app version for libraryName: firebase-auth");
                            String string2 = sb2.toString();
                            fhnVar.getClass();
                            if (Log.isLoggable("LibraryVersion", 5)) {
                                String str4 = fhnVar.b;
                                if (str4 != null) {
                                    string2 = str4.concat(string2);
                                }
                                Log.w("LibraryVersion", string2);
                            }
                        }
                    } catch (IOException e) {
                        e = e;
                        inputStream = resourceAsStream;
                        StringBuilder sb3 = new StringBuilder(56);
                        sb3.append("Failed to get app version for libraryName: firebase-auth");
                        String string3 = sb3.toString();
                        fhnVar.getClass();
                        if (Log.isLoggable("LibraryVersion", 6)) {
                            String str5 = fhnVar.b;
                            if (str5 != null) {
                                string3 = str5.concat(string3);
                            }
                            Log.e("LibraryVersion", string3, e);
                        }
                        resourceAsStream = inputStream;
                        property = null;
                    } catch (Throwable th) {
                        th = th;
                        inputStream2 = resourceAsStream;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e2) {
                e = e2;
            }
            if (resourceAsStream != null) {
                try {
                    resourceAsStream.close();
                } catch (IOException unused2) {
                }
            }
            if (property == null) {
                fhnVar.getClass();
                if (Log.isLoggable("LibraryVersion", 3)) {
                    String str6 = fhnVar.b;
                    Log.d("LibraryVersion", str6 != null ? str6.concat(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used") : ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
                }
                str = GrsBaseInfo.CountryCodeSource.UNKNOWN;
            } else {
                str = property;
            }
            concurrentHashMap.put("firebase-auth", str);
            str2 = str;
        }
        if (TextUtils.isEmpty(str2)) {
            r0 = "-1";
        } else {
            boolean zEquals = str2.equals(GrsBaseInfo.CountryCodeSource.UNKNOWN);
            r0 = str2;
            if (zEquals) {
                r0 = "-1";
            }
        }
        x860 x860Var = new x860();
        try {
            List listD = ikt0.c().d(r0);
            if (listD.size() == 1) {
                r0 = Integer.parseInt(r0);
            } else if (listD.size() >= 3) {
                r0 = Integer.parseInt((String) listD.get(2)) + (Integer.parseInt((String) listD.get(1)) * 1000) + (Integer.parseInt((String) listD.get(0)) * 1000000);
            } else {
                r0 = -1;
            }
        } catch (IllegalArgumentException e3) {
            if (Log.isLoggable("LibraryVersionContainer", 3)) {
                Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", r0, e3));
            }
        }
        x860Var.f40449a = r0;
        return x860Var;
    }

    @Override // a.s1x0
    public byte[] a(int i, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr2.length < i) {
            hny.o("ciphertext too short");
            return null;
        }
        if (bArr.length != this.f40449a) {
            hny.o("invalid key size");
            return null;
        }
        SecretKeySpec secretKeySpecC = kvw0.c(bArr);
        int i2 = i + 12;
        if (bArr2.length < i + 28) {
            hny.o("ciphertext too short");
            return null;
        }
        AlgorithmParameterSpec algorithmParameterSpecA = kvw0.a(bArr2, i, 12);
        Cipher cipherB = kvw0.b();
        cipherB.init(2, secretKeySpecC, algorithmParameterSpecA);
        return cipherB.doFinal(bArr2, i2, (bArr2.length - i) - 12);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(zje zjeVar) {
        h6a h6aVar;
        if (zjeVar instanceof h6a) {
            h6aVar = (h6a) zjeVar;
            int i = h6aVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                h6aVar.k = i - Integer.MIN_VALUE;
            } else {
                h6aVar = new h6a(this, zjeVar);
            }
        } else {
            h6aVar = new h6a(this, zjeVar);
        }
        Object obj = h6aVar.i;
        wne wneVar = wne.f39444a;
        int i2 = h6aVar.k;
        if (i2 == 0) {
            z1x.P(obj);
            int i3 = this.f40449a;
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (i4 > 4) {
                    i4 = 4;
                }
                h6aVar.k = 1;
                if (qcc.O(2000 << i4, h6aVar) == wneVar) {
                    return wneVar;
                }
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        this.f40449a++;
        return Unit.f46060a;
    }

    @Override // a.mgn
    public int d(Context context, String str, boolean z) {
        return 0;
    }

    public int e(int i) {
        int i2 = this.f40449a;
        if (i2 == -1) {
            return i == 7 ? 6 : 3;
        }
        return i2;
    }

    public long f(y78 y78Var) {
        for (Throwable cause = (IOException) y78Var.c; cause != null; cause = cause.getCause()) {
            if ((cause instanceof kq80) || (cause instanceof FileNotFoundException) || (cause instanceof mtw) || (cause instanceof mq00)) {
                return -9223372036854775807L;
            }
            if ((cause instanceof kbj) && ((kbj) cause).f18017a == 2008) {
                return -9223372036854775807L;
            }
        }
        return Math.min((y78Var.b - 1) * 1000, 5000);
    }

    @Override // a.mgn
    public int g(Context context, String str) {
        return this.f40449a;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x008a A[EDGE_INSN: B:107:0x008a->B:42:0x008a BREAK  A[LOOP:0: B:13:0x0034->B:41:0x0083], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0101 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0043  */
    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    /* JADX WARN: Code duplicated, block: B:19:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:47:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0097 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00de  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:84:0x0105 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:85:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x0108  */
    /* JADX WARN: Code duplicated, block: B:87:0x010a  */
    public float h(int i, int i2, String str) {
        boolean z;
        int i3;
        int i4;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        float f;
        char cCharAt;
        int i10;
        char cCharAt2;
        boolean z3;
        boolean z4;
        int i11;
        int i12;
        int i13;
        char cCharAt3;
        char cCharAt4;
        this.f40449a = i;
        if (i >= i2) {
            return Float.NaN;
        }
        char cCharAt5 = str.charAt(i);
        if (cCharAt5 != '+') {
            if (cCharAt5 != '-') {
                z = false;
            } else {
                z = true;
            }
            int i14 = this.f40449a;
            long j = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            z2 = false;
            i6 = 0;
            while (true) {
                i7 = this.f40449a;
                if (i7 >= i2) {
                    break;
                }
                cCharAt4 = str.charAt(i7);
                if (cCharAt4 != '0') {
                    if (i3 == 0) {
                        i5++;
                    } else {
                        i4++;
                    }
                } else if (cCharAt4 < '1' && cCharAt4 <= '9') {
                    int i15 = i3 + i4;
                    while (i4 > 0) {
                        if (j > 922337203685477580L) {
                            return Float.NaN;
                        }
                        j *= 10;
                        i4--;
                    }
                    if (j > 922337203685477580L) {
                        return Float.NaN;
                    }
                    j = (j * 10) + ((long) (cCharAt4 - '0'));
                    i3 = i15 + 1;
                    if (j < 0) {
                        return Float.NaN;
                    }
                } else {
                    if (cCharAt4 != '.' || z2) {
                        break;
                    }
                    i6 = this.f40449a - i14;
                    z2 = true;
                }
                this.f40449a++;
            }
            if (!z2 && this.f40449a == i6 + 1) {
                return Float.NaN;
            }
            if (i3 == 0) {
                if (i5 == 0) {
                    return Float.NaN;
                }
                i3 = 1;
            }
            if (z2) {
                i4 = (i6 - i5) - i3;
            }
            i8 = this.f40449a;
            if (i8 < i2 && ((cCharAt = str.charAt(i8)) == 'E' || cCharAt == 'e')) {
                i10 = this.f40449a + 1;
                this.f40449a = i10;
                if (i10 == i2) {
                    return Float.NaN;
                }
                cCharAt2 = str.charAt(i10);
                if (cCharAt2 != '+') {
                    if (cCharAt2 != '-') {
                        switch (cCharAt2) {
                            case '0':
                            case '1':
                            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                z3 = false;
                                z4 = false;
                                break;
                            default:
                                this.f40449a--;
                                z4 = true;
                                z3 = false;
                                break;
                        }
                    } else {
                        z3 = true;
                    }
                    if (!z4) {
                        i11 = this.f40449a;
                        i12 = 0;
                        while (true) {
                            i13 = this.f40449a;
                            if (i13 >= i2 && (cCharAt3 = str.charAt(i13)) >= '0' && cCharAt3 <= '9') {
                                if (i12 > 922337203685477580L) {
                                    return Float.NaN;
                                }
                                i12 = (i12 * 10) + (cCharAt3 - '0');
                                this.f40449a++;
                            }
                        }
                        if (this.f40449a == i11) {
                            return Float.NaN;
                        }
                        if (z3) {
                            i4 -= i12;
                        } else {
                            i4 += i12;
                        }
                    }
                } else {
                    z3 = false;
                }
                this.f40449a++;
                z4 = false;
                if (!z4) {
                    i11 = this.f40449a;
                    i12 = 0;
                    while (true) {
                        i13 = this.f40449a;
                        if (i13 >= i2) {
                        }
                        i12 = (i12 * 10) + (cCharAt3 - '0');
                        this.f40449a++;
                    }
                    if (this.f40449a == i11) {
                        return Float.NaN;
                    }
                    if (z3) {
                        i4 -= i12;
                    } else {
                        i4 += i12;
                    }
                }
            }
            i9 = i3 + i4;
            if (i9 <= 39 || i9 < -44) {
                return Float.NaN;
            }
            float f2 = j;
            if (j != 0) {
                if (i4 > 0) {
                    f = b[i4];
                } else if (i4 < 0) {
                    if (i4 < -38) {
                        f2 = (float) (((double) f2) * 1.0E-20d);
                        i4 += 20;
                    }
                    f = c[-i4];
                }
                f2 *= f;
            }
            return z ? -f2 : f2;
        }
        z = false;
        this.f40449a++;
        int i16 = this.f40449a;
        long j2 = 0;
        i3 = 0;
        i4 = 0;
        i5 = 0;
        z2 = false;
        i6 = 0;
        while (true) {
            i7 = this.f40449a;
            if (i7 >= i2) {
                break;
                break;
            }
            cCharAt4 = str.charAt(i7);
            if (cCharAt4 != '0') {
                if (cCharAt4 < '1') {
                }
                if (cCharAt4 != '.') {
                    break;
                }
                break;
                break;
            }
            if (i3 == 0) {
                i5++;
            } else {
                i4++;
            }
            this.f40449a++;
        }
        if (!z2) {
        }
        if (i3 == 0) {
            if (i5 == 0) {
                return Float.NaN;
            }
            i3 = 1;
        }
        if (z2) {
            i4 = (i6 - i5) - i3;
        }
        i8 = this.f40449a;
        if (i8 < i2) {
            i10 = this.f40449a + 1;
            this.f40449a = i10;
            if (i10 == i2) {
                return Float.NaN;
            }
            cCharAt2 = str.charAt(i10);
            if (cCharAt2 != '+') {
                if (cCharAt2 != '-') {
                    switch (cCharAt2) {
                        case '0':
                        case '1':
                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            z3 = false;
                            z4 = false;
                            break;
                        default:
                            this.f40449a--;
                            z4 = true;
                            z3 = false;
                            break;
                    }
                } else {
                    z3 = true;
                }
                if (!z4) {
                    i11 = this.f40449a;
                    i12 = 0;
                    while (true) {
                        i13 = this.f40449a;
                        if (i13 >= i2) {
                        }
                        i12 = (i12 * 10) + (cCharAt3 - '0');
                        this.f40449a++;
                    }
                    if (this.f40449a == i11) {
                        return Float.NaN;
                    }
                    if (z3) {
                        i4 -= i12;
                    } else {
                        i4 += i12;
                    }
                }
            } else {
                z3 = false;
            }
            this.f40449a++;
            z4 = false;
            if (!z4) {
                i11 = this.f40449a;
                i12 = 0;
                while (true) {
                    i13 = this.f40449a;
                    if (i13 >= i2) {
                    }
                    i12 = (i12 * 10) + (cCharAt3 - '0');
                    this.f40449a++;
                }
                if (this.f40449a == i11) {
                    return Float.NaN;
                }
                if (z3) {
                    i4 -= i12;
                } else {
                    i4 += i12;
                }
            }
        }
        i9 = i3 + i4;
        if (i9 <= 39) {
        }
        return Float.NaN;
    }

    public String j() {
        return kng0.k(TokenNames.X, Integer.toString(this.f40449a));
    }

    @Override // a.nae0
    public Object n(iiy iiyVar, Object obj) {
        ays0 ays0Var = (ays0) obj;
        ays0Var.getClass();
        iiyVar.getClass();
        return ays0Var.f1685a.get(this.f40449a);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d1  */
    @Override // a.l3u0
    public Object z0(ndy ndyVar, float f) {
        int i;
        int iArgb;
        float f2;
        int iArgb2;
        float f3;
        float f4;
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        int i3 = 0;
        boolean z = ndyVar.w() == 1;
        if (z) {
            ndyVar.a();
        }
        while (ndyVar.l()) {
            arrayList.add(Float.valueOf((float) ndyVar.q()));
        }
        int i4 = 2;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.f40449a = 2;
        }
        if (z) {
            ndyVar.d();
        }
        int size = this.f40449a;
        if (size == -1) {
            size = arrayList.size() / 4;
            this.f40449a = size;
        }
        float[] fArr = new float[size];
        int[] iArr = new int[size];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i = this.f40449a * 4;
            if (i5 >= i) {
                break;
            }
            int i8 = i5 / 4;
            double dFloatValue = ((Float) arrayList.get(i5)).floatValue();
            int i9 = i3;
            int i10 = i5 % 4;
            if (i10 != 0) {
                if (i10 == i2) {
                    i6 = (int) (dFloatValue * 255.0d);
                } else if (i10 == 2) {
                    i7 = (int) (dFloatValue * 255.0d);
                } else if (i10 == 3) {
                    iArr[i8] = Color.argb(255, i6, i7, (int) (dFloatValue * 255.0d));
                }
            } else if (i8 > 0) {
                float f5 = (float) dFloatValue;
                if (fArr[i8 - 1] >= f5) {
                    fArr[i8] = f5 + 0.01f;
                } else {
                    fArr[i8] = (float) dFloatValue;
                }
            } else {
                fArr[i8] = (float) dFloatValue;
            }
            i5++;
            i3 = i9;
            i2 = 1;
        }
        int i11 = i3;
        tbv tbvVar = new tbv(fArr, iArr);
        if (arrayList.size() <= i) {
            return tbvVar;
        }
        int size2 = (arrayList.size() - i) / 2;
        float[] fArr2 = new float[size2];
        float[] fArr3 = new float[size2];
        int i12 = i11;
        while (i < arrayList.size()) {
            if (i % 2 == 0) {
                fArr2[i12] = ((Float) arrayList.get(i)).floatValue();
            } else {
                fArr3[i12] = ((Float) arrayList.get(i)).floatValue();
                i12++;
            }
            i++;
        }
        float[] fArrCopyOf = tbvVar.f33687a;
        if (fArrCopyOf.length == 0) {
            fArrCopyOf = fArr2;
        } else if (size2 != 0) {
            int length = fArrCopyOf.length + size2;
            float[] fArr4 = new float[length];
            int i13 = i11;
            int i14 = i13;
            int i15 = i14;
            int i16 = i15;
            while (i13 < length) {
                float f6 = i15 < fArrCopyOf.length ? fArrCopyOf[i15] : Float.NaN;
                float f7 = i16 < size2 ? fArr2[i16] : Float.NaN;
                if (Float.isNaN(f7) || f6 < f7) {
                    fArr4[i13] = f6;
                    i15++;
                } else if (Float.isNaN(f6) || f7 < f6) {
                    fArr4[i13] = f7;
                    i16++;
                } else {
                    fArr4[i13] = f6;
                    i15++;
                    i16++;
                    i14++;
                }
                i13++;
            }
            fArrCopyOf = i14 == 0 ? fArr4 : Arrays.copyOf(fArr4, length - i14);
        }
        int length2 = fArrCopyOf.length;
        int[] iArr2 = new int[length2];
        int i17 = i11;
        while (i17 < length2) {
            float f8 = fArrCopyOf[i17];
            int iBinarySearch = Arrays.binarySearch(fArr, f8);
            int iBinarySearch2 = Arrays.binarySearch(fArr2, f8);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                float f9 = fArr3[iBinarySearch2];
                if (size < i4 || f8 == fArr[i11]) {
                    iArgb = iArr[i11];
                } else {
                    int i18 = 1;
                    while (true) {
                        if (i18 >= size) {
                            jf4.o("Unreachable code.");
                            return null;
                        }
                        f2 = fArr[i18];
                        if (f2 >= f8 || i18 == size - 1) {
                            break;
                        }
                        i18++;
                    }
                    if (i18 != size - 1 || f8 < f2) {
                        int i19 = i18 - 1;
                        float f10 = fArr[i19];
                        int iS = mbc.S(iArr[i19], (f8 - f10) / (f2 - f10), iArr[i18]);
                        iArgb = Color.argb((int) (f9 * 255.0f), Color.red(iS), Color.green(iS), Color.blue(iS));
                    } else {
                        iArgb = Color.argb((int) (f9 * 255.0f), Color.red(iArr[i18]), Color.green(iArr[i18]), Color.blue(iArr[i18]));
                    }
                }
                iArr2[i17] = iArgb;
            } else {
                int i20 = iArr[iBinarySearch];
                if (size2 < i4 || f8 <= fArr2[i11]) {
                    iArgb2 = Color.argb((int) (fArr3[i11] * 255.0f), Color.red(i20), Color.green(i20), Color.blue(i20));
                } else {
                    int i21 = 1;
                    while (true) {
                        if (i21 >= size2) {
                            jf4.o("Unreachable code.");
                            return null;
                        }
                        f3 = fArr2[i21];
                        if (f3 >= f8 || i21 == size2 - 1) {
                            break;
                        }
                        i21++;
                    }
                    if (f3 <= f8) {
                        f4 = fArr3[i21];
                    } else {
                        int i22 = i21 - 1;
                        float f11 = fArr2[i22];
                        f4 = ah40.f(fArr3[i22], fArr3[i21], (f8 - f11) / (f3 - f11));
                    }
                    iArgb2 = Color.argb((int) (f4 * 255.0f), Color.red(i20), Color.green(i20), Color.blue(i20));
                }
                iArr2[i17] = iArgb2;
            }
            i17++;
            i4 = 2;
        }
        return new tbv(fArrCopyOf, iArr2);
    }

    @Override // a.s1x0
    public int zza() {
        return this.f40449a;
    }

    public /* synthetic */ x860(int i, boolean z) {
        this.f40449a = i;
    }
}
