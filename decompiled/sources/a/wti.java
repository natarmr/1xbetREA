package a;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.clientauthutils.DigestServerAuthenticationHelper;
import android.javax.sip.header.Header;
import android.javax.sip.header.WWWAuthenticateHeader;
import android.javax.sip.message.Response;
import android.view.View;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xplatform.ufc.impl.navigation.UfcScreensFactoryImpl$getChampionshipFragmentScreen$1;
import org.xplatform.ufc.impl.navigation.UfcScreensFactoryImpl$getFighterFragmentScreen$1;
import org.xplatform.ufc.impl.navigation.UfcScreensFactoryImpl$getGameFragmentScreen$1;
import org.xplatform.ufc.impl.navigation.UfcScreensFactoryImpl$getHomeFragmentScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final class wti implements zf60, qbw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39741a;
    public Object b;
    public Object c;

    public wti(gii0 gii0Var, byte b) {
        this.f39741a = b;
        switch (b) {
            case 10:
                gii0Var.getClass();
                this.b = gii0Var;
                this.c = new ntl(this, (byte) 27);
                break;
            case 15:
                gii0Var.getClass();
                this.b = gii0Var;
                this.c = new yip(this, (byte) 21);
                break;
            default:
                this.b = gii0Var;
                this.c = new ntl(this, (byte) 13);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0027  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.List] */
    public static mmk A(Response response) {
        WWWAuthenticateHeader wWWAuthenticateHeader;
        ?? arrayList;
        List listSplit$default;
        if (response.getStatusCode() == 407) {
            Header header = response.getHeader("Proxy-Authenticate");
            wWWAuthenticateHeader = header instanceof WWWAuthenticateHeader ? (WWWAuthenticateHeader) header : null;
            if (wWWAuthenticateHeader == null) {
                Header header2 = response.getHeader("WWW-Authenticate");
                if (header2 instanceof WWWAuthenticateHeader) {
                    wWWAuthenticateHeader = (WWWAuthenticateHeader) header2;
                } else {
                    wWWAuthenticateHeader = null;
                }
            }
        } else {
            Header header3 = response.getHeader("WWW-Authenticate");
            wWWAuthenticateHeader = header3 instanceof WWWAuthenticateHeader ? (WWWAuthenticateHeader) header3 : null;
            if (wWWAuthenticateHeader == null) {
                Header header4 = response.getHeader("Proxy-Authenticate");
                if (header4 instanceof WWWAuthenticateHeader) {
                    wWWAuthenticateHeader = (WWWAuthenticateHeader) header4;
                } else {
                    wWWAuthenticateHeader = null;
                }
            }
        }
        if (wWWAuthenticateHeader != null) {
            String qop = wWWAuthenticateHeader.getQop();
            if (qop == null || (listSplit$default = StringsKt__StringsKt.split$default(qop, new String[]{Separators.COMMA}, false, 0, 6, null)) == null) {
                arrayList = 0;
            } else {
                ArrayList arrayList2 = new ArrayList(r3d.q(listSplit$default, 10));
                Iterator it = listSplit$default.iterator();
                while (it.hasNext()) {
                    arrayList2.add(StringsKt.u0((String) it.next()).toString());
                }
                arrayList = new ArrayList();
                for (Object obj : arrayList2) {
                    if (((String) obj).length() > 0) {
                        arrayList.add(obj);
                    }
                }
            }
            if (arrayList == 0) {
                arrayList = iun.f15405a;
            }
            String str = (arrayList.isEmpty() || arrayList.contains("auth")) ? "auth" : null;
            if (str != null) {
                String realm = wWWAuthenticateHeader.getRealm();
                realm.getClass();
                String nonce = wWWAuthenticateHeader.getNonce();
                nonce.getClass();
                String algorithm = wWWAuthenticateHeader.getAlgorithm();
                if (algorithm == null) {
                    algorithm = DigestServerAuthenticationHelper.DEFAULT_ALGORITHM;
                }
                return new mmk(realm, nonce, algorithm, str, wWWAuthenticateHeader.getOpaque());
            }
        }
        return null;
    }

    public static d3g0 B(d3g0 d3g0Var, d3g0 d3g0Var2, int i) {
        float f = d3g0Var2.f5402a;
        float f2 = d3g0Var.f5402a;
        float f3 = i + 1;
        float f4 = d3g0Var2.b;
        float f5 = d3g0Var.b;
        return new d3g0(f2 + ((f - f2) / f3), f5 + ((f4 - f5) / f3));
    }

    public static String u(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(DigestServerAuthenticationHelper.DEFAULT_ALGORITHM);
        messageDigest.getClass();
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        byte[] bArrDigest = messageDigest.digest(bytes);
        bArrDigest.getClass();
        return tx3.L(bArrDigest, "", new vbk((byte) 8), 30);
    }

    public static d3g0 v(d3g0 d3g0Var, float f, float f2) {
        float f3 = d3g0Var.f5402a;
        float f4 = d3g0Var.b;
        return new d3g0(f3 < f ? f3 - 1.0f : f3 + 1.0f, f4 < f2 ? f4 - 1.0f : f4 + 1.0f);
    }

    public int C(d3g0 d3g0Var, d3g0 d3g0Var2) {
        int i = (int) d3g0Var.f5402a;
        int i2 = (int) d3g0Var.b;
        int i3 = (int) d3g0Var2.f5402a;
        r68 r68Var = (r68) this.b;
        int iMin = Math.min(r68Var.b - 1, (int) d3g0Var2.b);
        int i4 = 0;
        boolean z = Math.abs(iMin - i2) > Math.abs(i3 - i);
        if (z) {
            i = i2;
            i2 = i;
            i3 = iMin;
            iMin = i3;
        }
        int iAbs = Math.abs(i3 - i);
        int iAbs2 = Math.abs(iMin - i2);
        int i5 = (-iAbs) / 2;
        int i6 = i2 < iMin ? 1 : -1;
        int i7 = i >= i3 ? -1 : 1;
        boolean zB = r68Var.b(z ? i2 : i, z ? i : i2);
        while (i != i3) {
            boolean zB2 = r68Var.b(z ? i2 : i, z ? i : i2);
            if (zB2 != zB) {
                i4++;
                zB = zB2;
            }
            i5 += iAbs2;
            if (i5 > 0) {
                if (i2 == iMin) {
                    return i4;
                }
                i2 += i6;
                i5 -= iAbs;
            }
            i += i7;
        }
        return i4;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:27|53|28|(2:59|47)(2:31|32)|25) */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006e, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006f, code lost:
    
        r2 = r11;
        r11 = r13;
        r13 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0093, code lost:
    
        throw r13;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00a7 -> B:49:0x00a9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object D(a.qpg0 r11, java.util.ArrayList r12, a.zje r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof a.uzn
            if (r0 == 0) goto L13
            r0 = r13
            a.uzn r0 = (a.uzn) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            a.uzn r0 = new a.uzn
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.l
            a.wne r1 = a.wne.f39444a
            int r2 = r0.n
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L36
            if (r2 != r4) goto L30
            java.util.Iterator r11 = r0.j
            a.qpg0 r12 = r0.i
            a.z1x.P(r13)
            goto La9
        L30:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r10)
            return r3
        L36:
            java.lang.Object r11 = r0.k
            java.util.Iterator r12 = r0.j
            a.qpg0 r2 = r0.i
            a.z1x.P(r13)     // Catch: android.database.SQLException -> L40
            goto L6c
        L40:
            r13 = move-exception
            goto L73
        L42:
            a.z1x.P(r13)
            if (r12 != 0) goto L4a
            kotlin.Unit r10 = kotlin.Unit.f46060a
            return r10
        L4a:
            java.util.Iterator r12 = r12.iterator()
        L4e:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto Lae
            java.lang.Object r13 = r12.next()
            java.lang.Object r2 = r10.b     // Catch: android.database.SQLException -> L6e
            a.sj3 r2 = (a.sj3) r2     // Catch: android.database.SQLException -> L6e
            r0.i = r11     // Catch: android.database.SQLException -> L6e
            r0.j = r12     // Catch: android.database.SQLException -> L6e
            r0.k = r13     // Catch: android.database.SQLException -> L6e
            r0.n = r5     // Catch: android.database.SQLException -> L6e
            kotlin.Unit r13 = r2.l0(r11, r13)     // Catch: android.database.SQLException -> L6e
            if (r13 != r1) goto L6b
            goto La6
        L6b:
            r2 = r11
        L6c:
            r11 = r2
            goto L4e
        L6e:
            r2 = move-exception
            r9 = r2
            r2 = r11
            r11 = r13
            r13 = r9
        L73:
            java.lang.String r6 = r13.getMessage()
            if (r6 == 0) goto Lad
            java.lang.String r7 = "unique"
            boolean r7 = kotlin.text.StringsKt.O(r6, r7, r5)
            if (r7 != 0) goto L94
            java.lang.String r7 = "2067"
            r8 = 0
            boolean r7 = kotlin.text.StringsKt.O(r6, r7, r8)
            if (r7 != 0) goto L94
            java.lang.String r7 = "1555"
            boolean r6 = kotlin.text.StringsKt.O(r6, r7, r8)
            if (r6 == 0) goto L93
            goto L94
        L93:
            throw r13
        L94:
            java.lang.Object r13 = r10.c
            a.fu6 r13 = (a.fu6) r13
            r0.i = r2
            r0.j = r12
            r0.k = r3
            r0.n = r4
            kotlin.Unit r11 = r13.Q(r2, r11)
            if (r11 != r1) goto La7
        La6:
            return r1
        La7:
            r11 = r12
            r12 = r2
        La9:
            r9 = r12
            r12 = r11
            r11 = r9
            goto L4e
        Lad:
            throw r13
        Lae:
            kotlin.Unit r10 = kotlin.Unit.f46060a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wti.D(a.qpg0, java.util.ArrayList, a.zje):java.lang.Object");
    }

    public void E(int i, tyc tycVar) {
        Iterator it = (Iterator) this.b;
        while (true) {
            Map.Entry entry = (Map.Entry) this.c;
            if (entry == null || ((hjt) entry.getKey()).f13177a >= i) {
                return;
            }
            hjt hjtVar = (hjt) ((Map.Entry) this.c).getKey();
            Object value = ((Map.Entry) this.c).getValue();
            erp erpVar = erp.c;
            eov0 eov0Var = hjtVar.b;
            short s = hjtVar.f13177a;
            if (hjtVar.c) {
                for (Object obj : (List) value) {
                    if (eov0Var == eov0.e) {
                        tycVar.u0(s, 3);
                        ((z3) obj).g(tycVar);
                        tycVar.u0(s, 4);
                    } else {
                        tycVar.u0(s, eov0Var.b);
                        erp.k(tycVar, eov0Var, obj);
                    }
                }
            } else if (eov0Var == eov0.e) {
                tycVar.u0(s, 3);
                ((z3) value).g(tycVar);
                tycVar.u0(s, 4);
            } else {
                tycVar.u0(s, eov0Var.b);
                erp.k(tycVar, eov0Var, value);
            }
            if (it.hasNext()) {
                this.c = (Map.Entry) it.next();
            } else {
                this.c = null;
            }
        }
    }

    @Override // a.qbw
    public lq80 a() {
        return new hsj(((qbw) this.b).a(), (List) this.c);
    }

    @Override // a.qbw
    public lq80 b(mbw mbwVar, ibw ibwVar) {
        return new hsj(((qbw) this.b).b(mbwVar, ibwVar), (List) this.c);
    }

    public nmk c(String str, String str2, String str3, String str4, mmk mmkVar) throws NoSuchAlgorithmException {
        str.getClass();
        str2.getClass();
        String strU = u(str + Separators.COLON + mmkVar.f22041a + Separators.COLON + str2);
        StringBuilder sb = new StringBuilder(str3);
        sb.append(Separators.COLON);
        sb.append(str4);
        String strU2 = u(sb.toString());
        byte[] bArr = new byte[4];
        ((SecureRandom) this.b).nextBytes(bArr);
        String strL = tx3.L(bArr, "", new vbk((byte) 7), 30);
        String str5 = mmkVar.b;
        Object objUpdateAndGet = ((AtomicReference) this.c).updateAndGet(new kmk(str5, (byte) 0));
        objUpdateAndGet.getClass();
        String string = Integer.toString(((lmk) objUpdateAndGet).b, CharsKt.checkRadix(16));
        string.getClass();
        String strB0 = StringsKt.b0(8, string);
        String str6 = mmkVar.d;
        StringBuilder sbN = b1j.n(strU, Separators.COLON, str5, Separators.COLON, strB0);
        f140.v(sbN, Separators.COLON, strL, Separators.COLON, str6);
        sbN.append(Separators.COLON);
        sbN.append(strU2);
        return new nmk(u(sbN.toString()), strL, strB0);
    }

    public cmt d() {
        return new cmt((Object) new j910((knf0) this.c, new pmi0((gii0) this.b, (byte) 16)), (byte) 4);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:78|29|(1:32)) */
    /* JADX WARN: Code duplicated, block: B:32:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:43:0x0100  */
    /* JADX WARN: Code duplicated, block: B:46:0x0105  */
    /* JADX WARN: Code duplicated, block: B:50:0x0124  */
    /* JADX WARN: Code duplicated, block: B:52:0x012e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0135  */
    /* JADX WARN: Code duplicated, block: B:56:0x013c  */
    /* JADX WARN: Code duplicated, block: B:57:0x013e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0143  */
    /* JADX WARN: Code duplicated, block: B:65:0x0163  */
    /* JADX WARN: Code duplicated, block: B:66:0x016b  */
    /* JADX WARN: Code duplicated, block: B:67:0x016d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0175 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0177  */
    /* JADX WARN: Code duplicated, block: B:71:0x017d  */
    /* JADX WARN: Code duplicated, block: B:78:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011e, code lost:
    
        if (a.qcc.P(r9, r6) == r4) goto L74;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00f0 -> B:28:0x00ba). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x016d -> B:64:0x0160). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(a.zje r21, java.lang.String r22, boolean r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wti.e(a.zje, java.lang.String, boolean):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(1:(1:(3:13|14|15)(2:16|17))(3:18|19|20))(4:21|96|22|23)|98|38|(3:40|(2:43|41)|101)(1:46)|(1:48)|49|104) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:93|31|32|91|33|34|(2:36|81)(1:37)) */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x011a  */
    /* JADX WARN: Code duplicated, block: B:37:0x011d  */
    /* JADX WARN: Code duplicated, block: B:40:0x013a A[Catch: all -> 0x015d, TryCatch #4 {all -> 0x015d, blocks: (B:38:0x012e, B:40:0x013a, B:41:0x0149, B:43:0x014f, B:48:0x0167), top: B:98:0x012e }] */
    /* JADX WARN: Code duplicated, block: B:43:0x014f A[Catch: all -> 0x015d, LOOP:0: B:41:0x0149->B:43:0x014f, LOOP_END, TryCatch #4 {all -> 0x015d, blocks: (B:38:0x012e, B:40:0x013a, B:41:0x0149, B:43:0x014f, B:48:0x0167), top: B:98:0x012e }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0163  */
    /* JADX WARN: Code duplicated, block: B:48:0x0167 A[Catch: all -> 0x015d, TRY_LEAVE, TryCatch #4 {all -> 0x015d, blocks: (B:38:0x012e, B:40:0x013a, B:41:0x0149, B:43:0x014f, B:48:0x0167), top: B:98:0x012e }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0180 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0182 A[Catch: all -> 0x021a, TryCatch #2 {all -> 0x021a, blocks: (B:14:0x0045, B:49:0x0169, B:55:0x017a, B:58:0x0182, B:60:0x018c, B:64:0x0197, B:66:0x019b, B:69:0x01bc, B:71:0x01ca, B:73:0x01d2, B:77:0x01dc, B:79:0x01e0, B:82:0x0201, B:83:0x0209, B:85:0x0211, B:86:0x0218, B:87:0x0219, B:19:0x0079, B:28:0x00d6), top: B:95:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x018c A[Catch: all -> 0x021a, TryCatch #2 {all -> 0x021a, blocks: (B:14:0x0045, B:49:0x0169, B:55:0x017a, B:58:0x0182, B:60:0x018c, B:64:0x0197, B:66:0x019b, B:69:0x01bc, B:71:0x01ca, B:73:0x01d2, B:77:0x01dc, B:79:0x01e0, B:82:0x0201, B:83:0x0209, B:85:0x0211, B:86:0x0218, B:87:0x0219, B:19:0x0079, B:28:0x00d6), top: B:95:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0194  */
    /* JADX WARN: Code duplicated, block: B:63:0x0196  */
    /* JADX WARN: Code duplicated, block: B:66:0x019b A[Catch: all -> 0x021a, TryCatch #2 {all -> 0x021a, blocks: (B:14:0x0045, B:49:0x0169, B:55:0x017a, B:58:0x0182, B:60:0x018c, B:64:0x0197, B:66:0x019b, B:69:0x01bc, B:71:0x01ca, B:73:0x01d2, B:77:0x01dc, B:79:0x01e0, B:82:0x0201, B:83:0x0209, B:85:0x0211, B:86:0x0218, B:87:0x0219, B:19:0x0079, B:28:0x00d6), top: B:95:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x01bc A[Catch: all -> 0x021a, TryCatch #2 {all -> 0x021a, blocks: (B:14:0x0045, B:49:0x0169, B:55:0x017a, B:58:0x0182, B:60:0x018c, B:64:0x0197, B:66:0x019b, B:69:0x01bc, B:71:0x01ca, B:73:0x01d2, B:77:0x01dc, B:79:0x01e0, B:82:0x0201, B:83:0x0209, B:85:0x0211, B:86:0x0218, B:87:0x0219, B:19:0x0079, B:28:0x00d6), top: B:95:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01ca A[Catch: all -> 0x021a, TryCatch #2 {all -> 0x021a, blocks: (B:14:0x0045, B:49:0x0169, B:55:0x017a, B:58:0x0182, B:60:0x018c, B:64:0x0197, B:66:0x019b, B:69:0x01bc, B:71:0x01ca, B:73:0x01d2, B:77:0x01dc, B:79:0x01e0, B:82:0x0201, B:83:0x0209, B:85:0x0211, B:86:0x0218, B:87:0x0219, B:19:0x0079, B:28:0x00d6), top: B:95:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01d2 A[Catch: all -> 0x021a, TryCatch #2 {all -> 0x021a, blocks: (B:14:0x0045, B:49:0x0169, B:55:0x017a, B:58:0x0182, B:60:0x018c, B:64:0x0197, B:66:0x019b, B:69:0x01bc, B:71:0x01ca, B:73:0x01d2, B:77:0x01dc, B:79:0x01e0, B:82:0x0201, B:83:0x0209, B:85:0x0211, B:86:0x0218, B:87:0x0219, B:19:0x0079, B:28:0x00d6), top: B:95:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:76:0x01db  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e0 A[Catch: all -> 0x021a, TryCatch #2 {all -> 0x021a, blocks: (B:14:0x0045, B:49:0x0169, B:55:0x017a, B:58:0x0182, B:60:0x018c, B:64:0x0197, B:66:0x019b, B:69:0x01bc, B:71:0x01ca, B:73:0x01d2, B:77:0x01dc, B:79:0x01e0, B:82:0x0201, B:83:0x0209, B:85:0x0211, B:86:0x0218, B:87:0x0219, B:19:0x0079, B:28:0x00d6), top: B:95:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x0201 A[Catch: all -> 0x021a, TryCatch #2 {all -> 0x021a, blocks: (B:14:0x0045, B:49:0x0169, B:55:0x017a, B:58:0x0182, B:60:0x018c, B:64:0x0197, B:66:0x019b, B:69:0x01bc, B:71:0x01ca, B:73:0x01d2, B:77:0x01dc, B:79:0x01e0, B:82:0x0201, B:83:0x0209, B:85:0x0211, B:86:0x0218, B:87:0x0219, B:19:0x0079, B:28:0x00d6), top: B:95:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0209 A[Catch: all -> 0x021a, TryCatch #2 {all -> 0x021a, blocks: (B:14:0x0045, B:49:0x0169, B:55:0x017a, B:58:0x0182, B:60:0x018c, B:64:0x0197, B:66:0x019b, B:69:0x01bc, B:71:0x01ca, B:73:0x01d2, B:77:0x01dc, B:79:0x01e0, B:82:0x0201, B:83:0x0209, B:85:0x0211, B:86:0x0218, B:87:0x0219, B:19:0x0079, B:28:0x00d6), top: B:95:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x020f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x0211 A[Catch: all -> 0x021a, TryCatch #2 {all -> 0x021a, blocks: (B:14:0x0045, B:49:0x0169, B:55:0x017a, B:58:0x0182, B:60:0x018c, B:64:0x0197, B:66:0x019b, B:69:0x01bc, B:71:0x01ca, B:73:0x01d2, B:77:0x01dc, B:79:0x01e0, B:82:0x0201, B:83:0x0209, B:85:0x0211, B:86:0x0218, B:87:0x0219, B:19:0x0079, B:28:0x00d6), top: B:95:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0219 A[Catch: all -> 0x021a, TRY_LEAVE, TryCatch #2 {all -> 0x021a, blocks: (B:14:0x0045, B:49:0x0169, B:55:0x017a, B:58:0x0182, B:60:0x018c, B:64:0x0197, B:66:0x019b, B:69:0x01bc, B:71:0x01ca, B:73:0x01d2, B:77:0x01dc, B:79:0x01e0, B:82:0x0201, B:83:0x0209, B:85:0x0211, B:86:0x0218, B:87:0x0219, B:19:0x0079, B:28:0x00d6), top: B:95:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x00e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x015d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x015e, code lost:
    
        r1 = r15;
        r15 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x016d, code lost:
    
        r18 = r13;
        r13 = r0;
        r0 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0173, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0174, code lost:
    
        r14 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0177, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0178, code lost:
    
        r14 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v17, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x01c3 -> B:30:0x00e6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable f(long r24, a.zje r26) {
        /*
            Method dump skipped, instruction units count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wti.f(long, a.zje):java.io.Serializable");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:78|29|(1:32)) */
    /* JADX WARN: Code duplicated, block: B:32:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:43:0x0100  */
    /* JADX WARN: Code duplicated, block: B:46:0x0105  */
    /* JADX WARN: Code duplicated, block: B:50:0x0124  */
    /* JADX WARN: Code duplicated, block: B:52:0x012e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0135  */
    /* JADX WARN: Code duplicated, block: B:56:0x013c  */
    /* JADX WARN: Code duplicated, block: B:57:0x013e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0143  */
    /* JADX WARN: Code duplicated, block: B:65:0x0163  */
    /* JADX WARN: Code duplicated, block: B:66:0x016b  */
    /* JADX WARN: Code duplicated, block: B:67:0x016d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0175 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0177  */
    /* JADX WARN: Code duplicated, block: B:71:0x017d  */
    /* JADX WARN: Code duplicated, block: B:78:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011e, code lost:
    
        if (a.qcc.P(r9, r6) == r4) goto L74;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00f0 -> B:28:0x00ba). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x016d -> B:64:0x0160). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(a.zje r21, java.lang.String r22, boolean r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wti.g(a.zje, java.lang.String, boolean):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v4, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9, types: [a.iun] */
    public Serializable h(int i, Set set, zje zjeVar) throws Throwable {
        v6t v6tVar;
        ?? arrayList;
        List list;
        Throwable th;
        Iterator it;
        ?? r10;
        a7t a7tVar;
        List list2;
        knf0 knf0Var = (knf0) this.c;
        if (zjeVar instanceof v6t) {
            v6tVar = (v6t) zjeVar;
            int i2 = v6tVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v6tVar.k = i2 - Integer.MIN_VALUE;
            } else {
                v6tVar = new v6t(this, zjeVar);
            }
        } else {
            v6tVar = new v6t(this, zjeVar);
        }
        Object objB = v6tVar.i;
        wne wneVar = wne.f39444a;
        int i3 = v6tVar.k;
        Throwable th2 = null;
        if (i3 == 0) {
            z1x.P(objB);
            nmo nmoVar = (nmo) this.b;
            String strC = knf0Var.c();
            int iB = knf0Var.b();
            set.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("fcountry", Integer.valueOf(iB));
            if (i > 0) {
                linkedHashMap.put("country", Integer.valueOf(i));
            }
            linkedHashMap.put("gr", 1357);
            linkedHashMap.put("lng", strC);
            linkedHashMap.put("ref", 1);
            linkedHashMap.put("sportIds", CollectionsKt.b0(CollectionsKt.z0(set), Separators.COMMA, null, null, null, 62));
            linkedHashMap.put("whence", 22);
            TreeMap treeMap = new TreeMap(linkedHashMap);
            v6tVar.k = 1;
            objB = ((lct) ((wgn) nmoVar.f23782a).invoke()).b(treeMap, v6tVar);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        Iterable<b7t> iterable = (Iterable) ((dx5) objB).a();
        int i4 = 10;
        ArrayList arrayList2 = new ArrayList(r3d.q(iterable, 10));
        for (b7t b7tVar : iterable) {
            b7tVar.getClass();
            List<a7t> list3 = b7tVar.b;
            Long l = b7tVar.f2124a;
            int i5 = 0;
            if (list3 != null) {
                arrayList = new ArrayList(r3d.q(list3, i4));
                for (a7t a7tVar2 : list3) {
                    long jLongValue = l != null ? l.longValue() : 0L;
                    Long l2 = a7tVar2.e;
                    int iLongValue = l2 != null ? (int) l2.longValue() : 0;
                    Long l3 = a7tVar2.f;
                    long jLongValue2 = l3 != null ? l3.longValue() : 0L;
                    String str = a7tVar2.b;
                    String str2 = str == null ? "" : str;
                    iun iunVar = iun.f15405a;
                    Long l4 = a7tVar2.f390a;
                    long jLongValue3 = l4 != null ? l4.longValue() : 0L;
                    Boolean bool = a7tVar2.h;
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    Boolean bool2 = a7tVar2.g;
                    boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                    Long l5 = a7tVar2.i;
                    int iLongValue2 = l5 != null ? (int) l5.longValue() : 0;
                    String str3 = a7tVar2.c;
                    String str4 = str3 == null ? "" : str3;
                    String str5 = a7tVar2.d;
                    arrayList.add(new fhb(iLongValue, jLongValue2, str2, iunVar, jLongValue3, zBooleanValue, jLongValue, iunVar, zBooleanValue2, iLongValue2, "", str4, str5 == null ? "" : str5));
                }
            } else {
                arrayList = th2;
            }
            if (arrayList == 0) {
                arrayList = iun.f15405a;
            }
            iun iunVar2 = iun.f15405a;
            arrayList.getClass();
            iunVar2.getClass();
            ArrayList arrayList3 = new ArrayList(r3d.q(arrayList, i4));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    Throwable th3 = th2;
                    q3d.p();
                    throw th3;
                }
                fhb fhbVar = (fhb) next;
                if (list3 == null || (a7tVar = (a7t) list3.get(i5)) == null || (list2 = a7tVar.k) == null) {
                    list = list3;
                    th = th2;
                    it = it2;
                    r10 = th;
                } else {
                    ArrayList arrayList4 = new ArrayList(r3d.q(list2, i4));
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        su10 su10Var = (su10) it3.next();
                        sip sipVar = sip.c;
                        long j = fhbVar.g;
                        String str6 = fhbVar.c;
                        Throwable th4 = th2;
                        long j2 = fhbVar.e;
                        List list4 = list3;
                        long j3 = fhbVar.j;
                        su10Var.getClass();
                        arrayList4.add(g7x.t(su10Var, sipVar, j, j3, j2, str6, 0L));
                        it2 = it2;
                        it3 = it3;
                        th2 = th4;
                        list3 = list4;
                    }
                    list = list3;
                    th = th2;
                    it = it2;
                    r10 = arrayList4;
                }
                if (r10 == 0) {
                    r10 = iun.f15405a;
                }
                arrayList3.add(new idb(fhbVar, r10));
                it2 = it;
                th2 = th;
                i5 = i6;
                list3 = list;
                i4 = 10;
            }
            arrayList2.add(arrayList3);
            i4 = 10;
        }
        return r3d.r(arrayList2);
    }

    public boolean i() {
        return ((Boolean) ((n0o0) this.c).getValue()).booleanValue();
    }

    public gmq j(long j, String str, String str2, int i, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
        j1q0 j1q0Var = (j1q0) this.c;
        str2.getClass();
        str3.getClass();
        jr0 jr0Var = (jr0) this.b;
        if (z4) {
            boolean zA = j1q0Var.f15748a.a();
            jr0Var.getClass();
            return ulb.L(new vsg0(new tq0(jr0Var, j, z2, i, str, str2, str3, z, zA, z3, null, (byte) 0)), jr0Var.d.b);
        }
        boolean zA2 = j1q0Var.f15748a.a();
        jr0Var.getClass();
        return ulb.L(new vsg0(new tq0(jr0Var, j, z2, i, str, str2, str3, z, zA2, z3, null, (byte) 1)), jr0Var.d.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable k(zje zjeVar, String str, boolean z) throws sp90, c44 {
        tzt tztVar;
        Object next;
        if (zjeVar instanceof tzt) {
            tztVar = (tzt) zjeVar;
            int i = tztVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                tztVar.m = i - Integer.MIN_VALUE;
            } else {
                tztVar = new tzt(this, zjeVar);
            }
        } else {
            tztVar = new tzt(this, zjeVar);
        }
        Object objD = tztVar.k;
        wne wneVar = wne.f39444a;
        int i2 = tztVar.m;
        if (i2 == 0) {
            z1x.P(objD);
            bot botVar = (bot) this.b;
            tztVar.i = str;
            tztVar.j = z;
            tztVar.m = 1;
            objD = botVar.f2951a.d(tztVar);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = tztVar.j;
            str = tztVar.i;
            z1x.P(objD);
        }
        Iterator it = ((Iterable) objD).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((qkt) next).c, str));
        qkt qktVar = (qkt) next;
        if (qktVar == null) {
            throw sp90.f32581a;
        }
        if (((sff0) this.c).s1.contains(qktVar.d) && z) {
            throw sp90.f32581a;
        }
        if (!Intrinsics.d(str, "7")) {
            return qktVar;
        }
        qkt qktVar2 = qktVar.f28902a == 1 ? qktVar : null;
        if (qktVar2 != null) {
            return qktVar2;
        }
        throw new c44((byte) 10);
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        view.getClass();
        uiv0 uiv0Var = xiv0Var.f40966a;
        boolean zU = uiv0Var.u(8);
        int i = uiv0Var.i(8).d;
        stl.L0((stl) this.b, (View) this.c, Boolean.valueOf(zU), 4);
        return xiv0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object m(int i, zje zjeVar) {
        v2u v2uVar;
        cyu cyuVar;
        int i2;
        if (zjeVar instanceof v2u) {
            v2uVar = (v2u) zjeVar;
            int i3 = v2uVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                v2uVar.m = i3 - Integer.MIN_VALUE;
            } else {
                v2uVar = new v2u(this, zjeVar);
            }
        } else {
            v2uVar = new v2u(this, zjeVar);
        }
        Object obj = v2uVar.k;
        wne wneVar = wne.f39444a;
        int i4 = v2uVar.m;
        yje yjeVar = null;
        byte b = 1;
        if (i4 == 0) {
            z1x.P(obj);
            cyu cyuVar2 = (cyu) this.b;
            sjl0 sjl0Var = (sjl0) this.c;
            v2uVar.j = cyuVar2;
            v2uVar.i = i;
            v2uVar.m = 1;
            Serializable serializableD = sjl0Var.d(v2uVar);
            if (serializableD == wneVar) {
                return wneVar;
            }
            cyuVar = cyuVar2;
            obj = serializableD;
            i2 = i;
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = v2uVar.i;
            cyu cyuVar3 = v2uVar.j;
            z1x.P(obj);
            cyuVar = cyuVar3;
        }
        List list = (List) obj;
        cyuVar.getClass();
        list.getClass();
        hie0 hie0Var = new hie0();
        hie0Var.f13108a = true;
        return new rzq0(gfx.R((or30) ((n660) cyuVar.c).c, kpb.v(sip.c), null, new szq0(cyuVar, kbc.N(((knf0) cyuVar.f5196a).d(), i2), yjeVar, b), 252), cyuVar, hie0Var, list, (byte) 1);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object n(long j, String str, yje yjeVar) {
        a5u a5uVar;
        long j2;
        if (yjeVar instanceof a5u) {
            a5uVar = (a5u) yjeVar;
            int i = a5uVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                a5uVar.l = i - Integer.MIN_VALUE;
            } else {
                a5uVar = new a5u(this, yjeVar);
            }
        } else {
            a5uVar = new a5u(this, yjeVar);
        }
        a5u a5uVar2 = a5uVar;
        Object objH = a5uVar2.j;
        wne wneVar = wne.f39444a;
        int i2 = a5uVar2.l;
        if (i2 == 0) {
            z1x.P(objH);
            pbt pbtVar = (pbt) this.b;
            boolean zA = ((gst0) this.c).a();
            a5uVar2.i = j;
            a5uVar2.l = 1;
            objH = pbtVar.h(j, a5uVar2, str, zA);
            if (objH == wneVar) {
                return wneVar;
            }
            j2 = j;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = a5uVar2.i;
            z1x.P(objH);
        }
        pbv pbvVar = (pbv) objH;
        s470.Companion.getClass();
        return Boolean.valueOf(pbvVar.o && !(!pbvVar.k && (r470.a(j2) != s470.GAME_UNAVAILABLE)));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0265 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0267 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x0286 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0288  */
    /* JADX WARN: Code duplicated, block: B:49:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0119 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:55:0x013b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x013d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x015c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x015e  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x01ae A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x01d0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x01d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:95:0x0241 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0243 A[ADDED_TO_REGION] */
    public Object o(ed5 ed5Var, iy3 iy3Var, zje zjeVar) {
        grt grtVar;
        iy3 iy3Var2;
        Object objD0;
        oe5 oe5Var;
        iy3 iy3Var3;
        ArrayList arrayList;
        String str;
        String str2;
        String str3;
        ArrayList arrayList2;
        String str4;
        String str5;
        String str6;
        boolean z;
        ArrayList arrayList3;
        String str7;
        String str8;
        String str9;
        boolean z2;
        ArrayList arrayList4;
        ed5 ed5Var2 = ed5Var;
        if (zjeVar instanceof grt) {
            grtVar = (grt) zjeVar;
            int i = grtVar.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                grtVar.o = i - Integer.MIN_VALUE;
            } else {
                grtVar = new grt(this, zjeVar);
            }
        } else {
            grtVar = new grt(this, zjeVar);
        }
        Object oe5Var2 = grtVar.m;
        wne wneVar = wne.f39444a;
        int i2 = grtVar.o;
        boolean z3 = true;
        byte b = 0;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(oe5Var2);
            nmo nmoVar = (nmo) this.b;
            grtVar.i = ed5Var2;
            iy3Var2 = iy3Var;
            grtVar.j = iy3Var2;
            grtVar.o = 1;
            dd5 dd5VarQ = ((gr00) nmoVar.f23782a).q(ed5Var2);
            oe5Var2 = dd5VarQ != null ? new oe5(dd5VarQ.f5880a, dd5VarQ.b, dd5VarQ.d, dd5VarQ.e, dd5VarQ.g, dd5VarQ.h) : null;
            if (oe5Var2 != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            iy3 iy3Var4 = grtVar.j;
            ed5 ed5Var3 = grtVar.i;
            z1x.P(oe5Var2);
            iy3Var2 = iy3Var4;
            ed5Var2 = ed5Var3;
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = grtVar.l;
            oe5Var = grtVar.k;
            iy3Var3 = grtVar.j;
            z1x.P(oe5Var2);
        }
        ne5 ne5Var = (ne5) oe5Var2;
        str = ne5Var.e;
        String str10 = ne5Var.f;
        str2 = oe5Var.e;
        str3 = oe5Var.f;
        if (!(iy3Var3 instanceof fy3) && !(iy3Var3 instanceof hy3)) {
            z3 = false;
        }
        arrayList2 = new ArrayList();
        String strN = kcx.N(str2);
        String strN2 = kcx.N(str3);
        if (str == null || str10 == null) {
            if (str == null && str10 == null) {
                if (StringsKt.O(str, strN, false)) {
                    arrayList2.add(new vd5(str3));
                } else {
                    arrayList2.add(new vd5(str3));
                    arrayList2.add(new yd5(str2));
                }
            } else if (str == null && str10 != null) {
                if (!StringsKt.O(str10, strN2, false)) {
                    arrayList2.add(new vd5(str3));
                }
                if (!StringsKt.O(str, strN, false)) {
                    arrayList2.add(new yd5(str2));
                }
            } else if (z3) {
                arrayList2.add(new vd5(str3));
                arrayList2.add(new yd5(str2));
            }
        } else if (StringsKt.O(str10, strN2, false)) {
            arrayList2.add(new yd5(str2));
        } else {
            arrayList2.add(new vd5(str3));
            arrayList2.add(new vd5(str3));
        }
        arrayList.addAll(arrayList2);
        str4 = ne5Var.c;
        String str11 = ne5Var.d;
        str5 = oe5Var.c;
        str6 = oe5Var.d;
        z = iy3Var3 instanceof ey3;
        arrayList3 = new ArrayList();
        String strN3 = kcx.N(str5);
        String strN4 = kcx.N(str6);
        if (str4 == null || str11 == null) {
            if (str4 == null && str11 == null) {
                if (StringsKt.O(str4, strN3, false)) {
                    arrayList3.add(new wd5(str6));
                } else {
                    arrayList3.add(new wd5(str6));
                    arrayList3.add(new zd5(str5));
                }
            } else if (str4 == null && str11 != null) {
                if (!StringsKt.O(str11, strN4, false)) {
                    arrayList3.add(new wd5(str6));
                }
                if (!StringsKt.O(str4, strN3, false)) {
                    arrayList3.add(new zd5(str5));
                }
            } else if (z) {
                arrayList3.add(new wd5(str6));
                arrayList3.add(new zd5(str5));
            }
        } else if (StringsKt.O(str11, strN4, false)) {
            arrayList3.add(new zd5(str5));
        } else {
            arrayList3.add(new wd5(str6));
            arrayList3.add(new wd5(str6));
        }
        arrayList.addAll(arrayList3);
        str7 = ne5Var.f23367a;
        String str12 = ne5Var.b;
        str8 = oe5Var.f25108a;
        str9 = oe5Var.b;
        z2 = iy3Var3 instanceof gy3;
        arrayList4 = new ArrayList();
        String strN5 = kcx.N(str8);
        String strN6 = kcx.N(str9);
        if (str7 == null || str12 == null) {
            if (str7 == null && str12 == null) {
                if (StringsKt.O(str7, strN5, false)) {
                    arrayList4.add(new xd5(str9));
                } else {
                    arrayList4.add(new xd5(str9));
                    arrayList4.add(new ae5(str8));
                }
            } else if (str7 == null && str12 != null) {
                if (!StringsKt.O(str12, strN6, false)) {
                    arrayList4.add(new xd5(str9));
                }
                if (!StringsKt.O(str7, strN5, false)) {
                    arrayList4.add(new ae5(str8));
                }
            } else if (z2) {
                arrayList4.add(new xd5(str9));
                arrayList4.add(new ae5(str8));
            }
        } else if (StringsKt.O(str12, strN6, false)) {
            arrayList4.add(new ae5(str8));
        } else {
            arrayList4.add(new xd5(str9));
            arrayList4.add(new xd5(str9));
        }
        arrayList.addAll(arrayList4);
        return arrayList;
        oe5 oe5Var3 = (oe5) oe5Var2;
        if (oe5Var3 == null) {
            return iun.f15405a;
        }
        ArrayList arrayList5 = new ArrayList();
        wti wtiVar = (wti) this.c;
        grtVar.i = null;
        grtVar.j = iy3Var2;
        grtVar.k = oe5Var3;
        grtVar.l = arrayList5;
        grtVar.o = 2;
        int iOrdinal = ed5Var2.ordinal();
        if (iOrdinal == 0) {
            xex xexVar = (xex) wtiVar.b;
            objD0 = qjj.d0(((mne) xexVar.f40764a).b, new je5(xexVar, yjeVar, b), grtVar);
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return null;
            }
            xex xexVar2 = (xex) wtiVar.c;
            objD0 = qjj.d0(((mne) xexVar2.f40764a).b, new je5(xexVar2, yjeVar, b), grtVar);
        }
        if (objD0 != wneVar) {
            oe5Var = oe5Var3;
            iy3Var3 = iy3Var2;
            oe5Var2 = objD0;
            arrayList = arrayList5;
            ne5 ne5Var2 = (ne5) oe5Var2;
            str = ne5Var2.e;
            String str13 = ne5Var2.f;
            str2 = oe5Var.e;
            str3 = oe5Var.f;
            if (!(iy3Var3 instanceof fy3)) {
                z3 = false;
            }
            arrayList2 = new ArrayList();
            String strN7 = kcx.N(str2);
            String strN8 = kcx.N(str3);
            if (str == null) {
                if (str == null) {
                    if (str == null) {
                        if (z3) {
                            arrayList2.add(new vd5(str3));
                            arrayList2.add(new yd5(str2));
                        }
                    } else if (z3) {
                        arrayList2.add(new vd5(str3));
                        arrayList2.add(new yd5(str2));
                    }
                } else if (str == null) {
                    if (z3) {
                        arrayList2.add(new vd5(str3));
                        arrayList2.add(new yd5(str2));
                    }
                } else if (z3) {
                    arrayList2.add(new vd5(str3));
                    arrayList2.add(new yd5(str2));
                }
            } else if (str == null) {
                if (str == null) {
                    if (z3) {
                        arrayList2.add(new vd5(str3));
                        arrayList2.add(new yd5(str2));
                    }
                } else if (z3) {
                    arrayList2.add(new vd5(str3));
                    arrayList2.add(new yd5(str2));
                }
            } else if (str == null) {
                if (z3) {
                    arrayList2.add(new vd5(str3));
                    arrayList2.add(new yd5(str2));
                }
            } else if (z3) {
                arrayList2.add(new vd5(str3));
                arrayList2.add(new yd5(str2));
            }
            arrayList.addAll(arrayList2);
            str4 = ne5Var2.c;
            String str14 = ne5Var2.d;
            str5 = oe5Var.c;
            str6 = oe5Var.d;
            z = iy3Var3 instanceof ey3;
            arrayList3 = new ArrayList();
            String strN9 = kcx.N(str5);
            String strN10 = kcx.N(str6);
            if (str4 == null) {
                if (str4 == null) {
                    if (str4 == null) {
                        if (z) {
                            arrayList3.add(new wd5(str6));
                            arrayList3.add(new zd5(str5));
                        }
                    } else if (z) {
                        arrayList3.add(new wd5(str6));
                        arrayList3.add(new zd5(str5));
                    }
                } else if (str4 == null) {
                    if (z) {
                        arrayList3.add(new wd5(str6));
                        arrayList3.add(new zd5(str5));
                    }
                } else if (z) {
                    arrayList3.add(new wd5(str6));
                    arrayList3.add(new zd5(str5));
                }
            } else if (str4 == null) {
                if (str4 == null) {
                    if (z) {
                        arrayList3.add(new wd5(str6));
                        arrayList3.add(new zd5(str5));
                    }
                } else if (z) {
                    arrayList3.add(new wd5(str6));
                    arrayList3.add(new zd5(str5));
                }
            } else if (str4 == null) {
                if (z) {
                    arrayList3.add(new wd5(str6));
                    arrayList3.add(new zd5(str5));
                }
            } else if (z) {
                arrayList3.add(new wd5(str6));
                arrayList3.add(new zd5(str5));
            }
            arrayList.addAll(arrayList3);
            str7 = ne5Var2.f23367a;
            String str15 = ne5Var2.b;
            str8 = oe5Var.f25108a;
            str9 = oe5Var.b;
            z2 = iy3Var3 instanceof gy3;
            arrayList4 = new ArrayList();
            String strN11 = kcx.N(str8);
            String strN12 = kcx.N(str9);
            if (str7 == null) {
                if (str7 == null) {
                    if (str7 == null) {
                        if (z2) {
                            arrayList4.add(new xd5(str9));
                            arrayList4.add(new ae5(str8));
                        }
                    } else if (z2) {
                        arrayList4.add(new xd5(str9));
                        arrayList4.add(new ae5(str8));
                    }
                } else if (str7 == null) {
                    if (z2) {
                        arrayList4.add(new xd5(str9));
                        arrayList4.add(new ae5(str8));
                    }
                } else if (z2) {
                    arrayList4.add(new xd5(str9));
                    arrayList4.add(new ae5(str8));
                }
            } else if (str7 == null) {
                if (str7 == null) {
                    if (z2) {
                        arrayList4.add(new xd5(str9));
                        arrayList4.add(new ae5(str8));
                    }
                } else if (z2) {
                    arrayList4.add(new xd5(str9));
                    arrayList4.add(new ae5(str8));
                }
            } else if (str7 == null) {
                if (z2) {
                    arrayList4.add(new xd5(str9));
                    arrayList4.add(new ae5(str8));
                }
            } else if (z2) {
                arrayList4.add(new xd5(str9));
                arrayList4.add(new ae5(str8));
            }
            arrayList.addAll(arrayList4);
            return arrayList;
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p(zje zjeVar) {
        qnt qntVar;
        cu cuVar;
        if (zjeVar instanceof qnt) {
            qntVar = (qnt) zjeVar;
            int i = qntVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                qntVar.l = i - Integer.MIN_VALUE;
            } else {
                qntVar = new qnt(this, zjeVar);
            }
        } else {
            qntVar = new qnt(this, zjeVar);
        }
        Object obj = qntVar.j;
        wne wneVar = wne.f39444a;
        int i2 = qntVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            cu cuVar2 = (cu) this.b;
            pmi pmiVar = (pmi) this.c;
            qntVar.i = cuVar2;
            qntVar.l = 1;
            Serializable serializableX = pmiVar.x(qntVar);
            if (serializableX != wneVar) {
                obj = serializableX;
                cuVar = cuVar2;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        cuVar = qntVar.i;
        z1x.P(obj);
        int iIntValue = ((Number) obj).intValue();
        qntVar.i = null;
        qntVar.l = 2;
        Object objJ = cuVar.j(iIntValue, qntVar);
        return objJ == wneVar ? wneVar : objJ;
    }

    public ArrayList q(sys0 sys0Var, s77 s77Var) {
        sys0Var.getClass();
        s77Var.getClass();
        gm7 gm7Var = ((pru) this.c).a().f32117a.f12063a;
        aau aauVar = (aau) this.b;
        return ((tnm0) aauVar.f548a.f35622a).b(sys0Var, s77Var, gm7Var.m, gm7Var.n, gm7Var.q);
    }

    public boolean r(d3g0 d3g0Var) {
        float f = d3g0Var.f5402a;
        if (f < 0.0f) {
            return false;
        }
        r68 r68Var = (r68) this.b;
        if (f > r68Var.f29923a - 1) {
            return false;
        }
        float f2 = d3g0Var.b;
        return f2 > 0.0f && f2 <= ((float) (r68Var.b - 1));
    }

    public mwn s() throws IOException {
        InputStream inputStreamOpen = ((us00) this.c).getAssets().open("remote-config/remote-config.json");
        inputStreamOpen.getClass();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, Charsets.UTF_8), 8192);
        try {
            String strK = n8n0.k(bufferedReader);
            bufferedReader.close();
            vby vbyVar = (vby) this.b;
            vbyVar.getClass();
            return (mwn) vbyVar.b(mwn.Companion.serializer(), strK);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                bkb.E(bufferedReader, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0196  */
    /* JADX WARN: Code duplicated, block: B:102:0x0199  */
    /* JADX WARN: Code duplicated, block: B:105:0x019f  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:109:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:113:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:114:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:118:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:121:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:122:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:125:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:126:0x01db  */
    /* JADX WARN: Code duplicated, block: B:129:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:131:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ee A[PHI: r2
  0x01ee: PHI (r2v11 java.lang.String) = (r2v10 java.lang.String), (r2v22 java.lang.String) binds: [B:130:0x01e6, B:132:0x01ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:137:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:139:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:140:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:143:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:144:0x0200  */
    /* JADX WARN: Code duplicated, block: B:147:0x0205  */
    /* JADX WARN: Code duplicated, block: B:148:0x0208  */
    /* JADX WARN: Code duplicated, block: B:151:0x020e  */
    /* JADX WARN: Code duplicated, block: B:152:0x0211  */
    /* JADX WARN: Code duplicated, block: B:155:0x0217  */
    /* JADX WARN: Code duplicated, block: B:156:0x021a  */
    /* JADX WARN: Code duplicated, block: B:159:0x0220  */
    /* JADX WARN: Code duplicated, block: B:160:0x0223  */
    /* JADX WARN: Code duplicated, block: B:163:0x0229  */
    /* JADX WARN: Code duplicated, block: B:164:0x022c  */
    /* JADX WARN: Code duplicated, block: B:167:0x0232  */
    /* JADX WARN: Code duplicated, block: B:168:0x0235  */
    /* JADX WARN: Code duplicated, block: B:171:0x023b  */
    /* JADX WARN: Code duplicated, block: B:172:0x023e  */
    /* JADX WARN: Code duplicated, block: B:175:0x0244  */
    /* JADX WARN: Code duplicated, block: B:178:0x024e  */
    /* JADX WARN: Code duplicated, block: B:180:0x025d  */
    /* JADX WARN: Code duplicated, block: B:181:0x0261  */
    /* JADX WARN: Code duplicated, block: B:182:0x0265  */
    /* JADX WARN: Code duplicated, block: B:190:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x013a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0148  */
    /* JADX WARN: Code duplicated, block: B:72:0x015d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0163  */
    /* JADX WARN: Code duplicated, block: B:76:0x0169  */
    /* JADX WARN: Code duplicated, block: B:79:0x016f A[PHI: r5
  0x016f: PHI (r5v6 java.lang.String) = (r5v5 java.lang.String), (r5v24 java.lang.String) binds: [B:75:0x0167, B:77:0x016b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x0174  */
    /* JADX WARN: Code duplicated, block: B:83:0x0177  */
    /* JADX WARN: Code duplicated, block: B:85:0x017a  */
    /* JADX WARN: Code duplicated, block: B:86:0x017c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0181  */
    /* JADX WARN: Code duplicated, block: B:90:0x0183  */
    /* JADX WARN: Code duplicated, block: B:93:0x0188  */
    /* JADX WARN: Code duplicated, block: B:94:0x018a  */
    /* JADX WARN: Code duplicated, block: B:97:0x018f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0191  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v25 java.lang.Object, still in use, count: 2, list:
          (r5v25 java.lang.Object) from 0x0136: PHI (r5 I:??) = (r5v2 java.lang.Object), (r5v25 java.lang.Object) binds: [B:60:0x0135, B:188:0x0136] A[DONT_GENERATE, DONT_INLINE]
          (r5v25 java.lang.Object) from 0x012a: CHECK_CAST (a.gip0) (r5v25 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public java.lang.Object t(java.lang.String r26, a.zje r27) {
        /*
            Method dump skipped, instruction units count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wti.t(java.lang.String, a.zje):java.lang.Object");
    }

    public void w(long j) {
        if (i()) {
            kd30.G((kd30) this.b, new ab50(0), new UfcScreensFactoryImpl$getChampionshipFragmentScreen$1(j, ""), false, false, 26);
        }
    }

    public void x(boolean z, long j) {
        if (i()) {
            kd30.G((kd30) this.b, new ab50(0), new UfcScreensFactoryImpl$getGameFragmentScreen$1(0, j, 189L, 0L, 0L, "", z), false, false, 26);
        }
    }

    public void y(long j) {
        if (i()) {
            kd30.G((kd30) this.b, new ab50(0), new UfcScreensFactoryImpl$getFighterFragmentScreen$1(j), false, false, 26);
        }
    }

    public void z() {
        if (i()) {
            kd30.G((kd30) this.b, new ab50(0), new UfcScreensFactoryImpl$getHomeFragmentScreen$1(), false, false, 26);
        }
    }

    public wti(ilp0 ilp0Var) {
        this.f39741a = (byte) 5;
        this.b = ilp0Var;
        this.c = new AtomicBoolean(false);
    }

    public wti(pbt pbtVar, gst0 gst0Var) {
        this.f39741a = (byte) 27;
        pbtVar.getClass();
        gst0Var.getClass();
        this.b = pbtVar;
        this.c = gst0Var;
    }

    public wti(vby vbyVar, us00 us00Var) {
        this.f39741a = (byte) 2;
        vbyVar.getClass();
        this.b = vbyVar;
        this.c = us00Var;
    }

    public wti(hsj hsjVar, gmt gmtVar) {
        this.f39741a = (byte) 19;
        gmtVar.getClass();
        this.b = hsjVar;
        this.c = gmtVar;
    }

    public wti(zfo zfoVar, mne mneVar) {
        this.f39741a = (byte) 28;
        zfoVar.getClass();
        this.b = zfoVar;
        this.c = mneVar;
    }

    public wti(cyu cyuVar, sjl0 sjl0Var) {
        this.f39741a = (byte) 25;
        sjl0Var.getClass();
        this.b = cyuVar;
        this.c = sjl0Var;
    }

    public wti(kd30 kd30Var, kys0 kys0Var, pru pruVar) {
        this.f39741a = (byte) 1;
        this.b = kd30Var;
        this.c = maz.b(new hc0(pruVar, (byte) 19));
    }

    public wti(jr0 jr0Var, j1q0 j1q0Var) {
        this.f39741a = (byte) 22;
        jr0Var.getClass();
        j1q0Var.getClass();
        this.b = jr0Var;
        this.c = j1q0Var;
    }

    public wti(bot botVar, pru pruVar) {
        this.f39741a = (byte) 23;
        this.b = botVar;
        this.c = pruVar.a();
    }

    public wti(zri zriVar, knf0 knf0Var) {
        this.f39741a = (byte) 11;
        knf0Var.getClass();
        this.b = zriVar;
        this.c = knf0Var;
    }

    public wti(knf0 knf0Var, zri zriVar) {
        this.f39741a = (byte) 12;
        knf0Var.getClass();
        this.c = knf0Var;
        this.b = zriVar;
    }

    public wti(eu7 eu7Var, gst0 gst0Var) {
        this.f39741a = (byte) 21;
        gst0Var.getClass();
        this.b = eu7Var;
        this.c = gst0Var;
    }

    public wti(zri zriVar, knf0 knf0Var, byte b) {
        this.f39741a = (byte) 14;
        knf0Var.getClass();
        this.b = zriVar;
        this.c = knf0Var;
    }

    public wti(nmo nmoVar, knf0 knf0Var) {
        this.f39741a = (byte) 16;
        knf0Var.getClass();
        this.b = nmoVar;
        this.c = knf0Var;
    }

    public /* synthetic */ wti(Object obj, Object obj2, byte b) {
        this.f39741a = b;
        this.b = obj;
        this.c = obj2;
    }

    public wti(byte b) {
        this.f39741a = b;
        switch (b) {
            case 9:
                break;
            default:
                this.b = new SecureRandom();
                this.c = new AtomicReference(new lmk("", 0));
                break;
        }
    }

    public wti(r68 r68Var) {
        this.f39741a = (byte) 3;
        this.b = r68Var;
        this.c = new mv40(r68Var);
    }

    public wti(gjt gjtVar) {
        this.f39741a = (byte) 17;
        erp erpVar = gjtVar.f11417a;
        erpVar.getClass();
        Iterator it = ((ax3) erpVar.f8293a.entrySet()).iterator();
        this.b = it;
        if (it.hasNext()) {
            this.c = (Map.Entry) it.next();
        }
    }
}
