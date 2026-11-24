package a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.gov.nist.core.Separators;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.identity.PresentationSession;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CompoundButton;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.matchinfo.MatchInfoContainerView;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class wwb {
    public static final void A(lc00 lc00Var, float f, String str) {
        if (f <= 0.0f) {
            return;
        }
        lc00Var.add(new b3m(str, wzb.H0(Float.valueOf(si30.b(f * 10.0f) / 10.0f))));
    }

    public static q58 B() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("androidxBiometric", 3);
            builder.setBlockModes("CBC");
            builder.setEncryptionPaddings("PKCS7Padding");
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(builder.build());
            keyGenerator.generateKey();
            SecretKey secretKey = (SecretKey) keyStore.getKey("androidxBiometric", null);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, secretKey);
            return new q58(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e) {
            Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e);
            return null;
        }
    }

    public static final zj2 C(zdg0 zdg0Var, String[] strArr, Function2 function2) {
        yje yjeVar;
        Pair pair;
        zdg0Var.getClass();
        lox loxVarD = zdg0Var.d();
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        u7x.H(loxVarD.f20412a);
        jrs0 jrs0Var = loxVarD.b;
        yni0 yni0Var = new yni0();
        byte b = 0;
        for (String str : strArr2) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) jrs0Var.d;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) linkedHashMap.get(lowerCase);
            if (set != null) {
                yni0Var.addAll(set);
            } else {
                yni0Var.add(str);
            }
        }
        String[] strArr3 = (String[]) cui0.a(yni0Var).toArray(new String[0]);
        int length = strArr3.length;
        int[] iArr = new int[length];
        int i = 0;
        while (true) {
            yjeVar = null;
            if (i >= length) {
                pair = new Pair(strArr3, iArr);
                break;
            }
            String str2 = strArr3[i];
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) jrs0Var.e;
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) linkedHashMap2.get(lowerCase2);
            if (num == null) {
                jf4.o("There is no table with name ".concat(str2));
                pair = null;
                break;
            }
            iArr[i] = num.intValue();
            i++;
        }
        String[] strArr4 = (String[]) pair.f46059a;
        int[] iArr2 = (int[]) pair.b;
        strArr4.getClass();
        iArr2.getClass();
        return new zj2(ulb.D(new dnq(new fnq(new vsg0(new lyh(jrs0Var, iArr2, true, true, strArr4, null)), new cin(loxVarD, yjeVar, (byte) 22)), new gbv(loxVarD, yjeVar, (byte) 4), b), -1), zdg0Var, function2, (byte) 6);
    }

    public static void D(CompoundButton compoundButton, Function2 function2) {
        ymx ymxVar = ivb0.b;
        ymxVar.getClass();
        compoundButton.setOnCheckedChangeListener(new ajj(ymxVar, false, function2));
    }

    public static final String E(int i, jol jolVar) {
        int iOrdinal = jolVar.ordinal();
        if (iOrdinal == 0) {
            return String.valueOf(i);
        }
        if (iOrdinal == 1) {
            return i < 10 ? twn.m(i, "0") : String.valueOf(i);
        }
        t9f.b();
        return null;
    }

    public static final String F(String str, boolean z) {
        str.getClass();
        String string = StringsKt.u0(str).toString();
        return (z && kotlin.text.c.x(string, "+", false)) ? kotlin.text.c.u(string, "+", "", false).concat("+") : string;
    }

    public static final ArrayList G(PackageManager packageManager, String str) throws NoSuchAlgorithmException {
        packageManager.getClass();
        str.getClass();
        int i = 0;
        if (Build.VERSION.SDK_INT < 28) {
            Signature[] signatureArr = J(packageManager, str, 64L).signatures;
            signatureArr.getClass();
            ArrayList arrayList = new ArrayList(signatureArr.length);
            int length = signatureArr.length;
            while (i < length) {
                Signature signature = signatureArr[i];
                MessageDigest messageDigest = MessageDigest.getInstance("SHA");
                messageDigest.update(signature.toByteArray());
                arrayList.add(messageDigest.digest());
                i++;
            }
            return arrayList;
        }
        SigningInfo signingInfo = J(packageManager, str, 134217728L).signingInfo;
        if (signingInfo.hasMultipleSigners()) {
            Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
            apkContentsSigners.getClass();
            ArrayList arrayList2 = new ArrayList(apkContentsSigners.length);
            int length2 = apkContentsSigners.length;
            while (i < length2) {
                Signature signature2 = apkContentsSigners[i];
                MessageDigest messageDigest2 = MessageDigest.getInstance("SHA");
                messageDigest2.update(signature2.toByteArray());
                arrayList2.add(messageDigest2.digest());
                i++;
            }
            return arrayList2;
        }
        Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
        signingCertificateHistory.getClass();
        ArrayList arrayList3 = new ArrayList(signingCertificateHistory.length);
        int length3 = signingCertificateHistory.length;
        while (i < length3) {
            Signature signature3 = signingCertificateHistory[i];
            MessageDigest messageDigest3 = MessageDigest.getInstance("SHA");
            messageDigest3.update(signature3.toByteArray());
            arrayList3.add(messageDigest3.digest());
            i++;
        }
        return arrayList3;
    }

    public static final int H(ViewGroup viewGroup, int i) {
        ViewParent parent = viewGroup.getParent();
        Object obj = null;
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 == null) {
            return 0;
        }
        for (Object obj2 : hxm0.q(viewGroup2)) {
            if (((View) obj2) instanceof MatchInfoContainerView) {
                obj = obj2;
                break;
            }
        }
        View view = (View) obj;
        if (view != null) {
            return view.getHeight() - i;
        }
        return 0;
    }

    public static final String I(vq4 vq4Var, fet fetVar) {
        Context context = (Context) fetVar.k(dy2.b);
        switch (vq4Var.ordinal()) {
            case 1:
                String string = context.getString(R.string.recovery_password);
                string.getClass();
                return string;
            case 2:
                String string2 = context.getString(R.string.authenticator_migration);
                string2.getClass();
                return string2;
            case 3:
                String string3 = context.getString(R.string.authenticator_cash_out);
                string3.getClass();
                return string3;
            case 4:
                String string4 = context.getString(R.string.new_place_login);
                string4.getClass();
                return string4;
            case 5:
                String string5 = context.getString(R.string.authenticator_turn_on);
                string5.getClass();
                return string5;
            case 6:
                String string6 = context.getString(R.string.change_password_title);
                string6.getClass();
                return string6;
            default:
                return "";
        }
    }

    public static final PackageInfo J(PackageManager packageManager, String str, long j) throws PackageManager.NameNotFoundException {
        packageManager.getClass();
        str.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, PackageManager.PackageInfoFlags.of(j));
            packageInfo.getClass();
            return packageInfo;
        }
        PackageInfo packageInfo2 = packageManager.getPackageInfo(str, (int) j);
        packageInfo2.getClass();
        return packageInfo2;
    }

    public static final List K(hxu hxuVar, String str) {
        hxuVar.getClass();
        ivo0 ivo0Var = hxuVar.f13829a;
        ivo0 ivo0Var2 = hxuVar.e;
        ivo0 ivo0Var3 = hxuVar.d;
        ivo0 ivo0Var4 = hxuVar.c;
        ivo0 ivo0Var5 = hxuVar.b;
        String str2 = ivo0Var.f15455a;
        String strN = ohs0.n(str2, Separators.COLON);
        pn40 pn40Var = pn40.f27267a;
        double d = ivo0Var.b;
        p3u0 p3u0Var = p3u0.c;
        String strC = pn40.c(d, p3u0Var);
        e3w e3wVar = e3w.f7156a;
        f3w f3wVar = ivo0Var.f15455a.length() > 0 ? new f3w(str2, strN, strC, str, e3wVar) : null;
        String str3 = ivo0Var5.f15455a;
        f3w f3wVar2 = ivo0Var5.f15455a.length() > 0 ? new f3w(str3, ohs0.n(str3, Separators.COLON), pn40.c(ivo0Var5.b, p3u0Var), str, e3wVar) : null;
        String str4 = ivo0Var4.f15455a;
        f3w f3wVar3 = ivo0Var4.f15455a.length() > 0 ? new f3w(str4, ohs0.n(str4, Separators.COLON), pn40.c(ivo0Var4.b, p3u0Var), str, e3wVar) : null;
        String str5 = ivo0Var3.f15455a;
        f3w f3wVar4 = ivo0Var3.f15455a.length() > 0 ? new f3w(str5, ohs0.n(str5, Separators.COLON), pn40.c(ivo0Var3.b, p3u0Var), str, e3wVar) : null;
        String str6 = ivo0Var2.f15455a;
        return tx3.z(new f3w[]{f3wVar, f3wVar2, f3wVar3, f3wVar4, ivo0Var2.f15455a.length() > 0 ? new f3w(str6, ohs0.n(str6, Separators.COLON), pn40.c(ivo0Var2.b, p3u0Var), str, e3wVar) : null});
    }

    public static final String L(knm knmVar, zmm zmmVar, String str) {
        str.getClass();
        a8z a8zVarA = maz.a(wez.b, new ntl(knmVar, (byte) 7));
        Integer num = knmVar.d;
        if (num != null && num.intValue() == 0) {
            num = null;
        }
        int iIntValue = num != null ? num.intValue() : ((Number) a8zVarA.getValue()).intValue() == 0 ? Integer.MAX_VALUE : ((Number) a8zVarA.getValue()).intValue();
        String str2 = knmVar.f18593a;
        StringBuilder sb = new StringBuilder();
        int length = str2.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str2.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        int length2 = str.length();
        for (int i2 = 0; i2 < length2; i2++) {
            char cCharAt2 = str.charAt(i2);
            if (Character.isDigit(cCharAt2)) {
                sb2.append(cCharAt2);
            }
        }
        String string2 = sb2.toString();
        if (string2.length() <= iIntValue || string.length() != iIntValue) {
            return string2.length() > iIntValue ? string2.substring(string2.length() - iIntValue, string2.length()) : string2;
        }
        return string;
    }

    public static final float M(String str, String str2, fet fetVar) {
        g9q0 g9q0VarN = pym0.n(fetVar);
        w6k w6kVar = (w6k) fetVar.k(bmd.h);
        boolean zG = fetVar.g(str) | fetVar.g(str2);
        Object objP = fetVar.P();
        if (zG || objP == ukd.f35823a) {
            objP = twn.j(Math.max(w6kVar.r0((int) (g9q0.b(g9q0VarN, new j83(str), g1t0.a(), 0, false, 1, 0L, null, null, null, 2028).c >> 32)), w6kVar.r0((int) (g9q0.b(g9q0VarN, new j83(str2), g1t0.a(), 0, false, 1, 0L, null, null, null, 2028).c >> 32))), fetVar);
        }
        return ((ycl) objP).f42389a;
    }

    public static List N(PackageManager packageManager, Intent intent) {
        packageManager.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            List listQueryIntentActivities = packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0L));
            listQueryIntentActivities.getClass();
            return listQueryIntentActivities;
        }
        List<ResolveInfo> listQueryIntentActivities2 = packageManager.queryIntentActivities(intent, 0);
        listQueryIntentActivities2.getClass();
        return listQueryIntentActivities2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(2:4|(1:6)(1:7))(1:7)|8|(4:(1:(2:12|13)(2:14|15))(4:16|44|17|18)|28|(2:34|(1:36)(2:37|38))(1:38)|(1:40)(1:43))(1:21)|46|22|(1:42)(1:25)) */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        r2 = r9;
        r9 = r10;
        r10 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0091, code lost:
    
        if (a.qcc.O(3000, r0) == r1) goto L42;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0091 -> B:13:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O(a.zaq r9, a.zje r10) throws a.zhi0 {
        /*
            boolean r0 = r10 instanceof a.e2o
            if (r0 == 0) goto L13
            r0 = r10
            a.e2o r0 = (a.e2o) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.e2o r0 = new a.e2o
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L42
            if (r2 == r5) goto L38
            if (r2 != r3) goto L31
            int r9 = r0.j
            kotlin.jvm.functions.Function1 r2 = r0.i
            a.z1x.P(r10)
        L2e:
            r10 = r9
            r9 = r2
            goto L46
        L31:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            r9 = 0
            return r9
        L38:
            int r9 = r0.j
            kotlin.jvm.functions.Function1 r2 = r0.i
            a.z1x.P(r10)     // Catch: java.lang.Throwable -> L40
            return r10
        L40:
            r10 = move-exception
            goto L59
        L42:
            a.z1x.P(r10)
            r10 = r4
        L46:
            r0.i = r9     // Catch: java.lang.Throwable -> L54
            r0.j = r10     // Catch: java.lang.Throwable -> L54
            r0.l = r5     // Catch: java.lang.Throwable -> L54
            java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L54
            if (r9 != r1) goto L53
            goto L93
        L53:
            return r9
        L54:
            r2 = move-exception
            r8 = r2
            r2 = r9
            r9 = r10
            r10 = r8
        L59:
            a.bt4 r6 = new a.bt4
            r6.<init>(r10, r5)
            a.n0o0 r6 = a.maz.b(r6)
            java.lang.Object r6 = r6.getValue()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L79
            boolean r6 = r10 instanceof a.zhi0
            if (r6 == 0) goto L82
            r6 = r10
            a.zhi0 r6 = (a.zhi0) r6
            boolean r6 = r6.e
            if (r6 != 0) goto L82
        L79:
            int r6 = r9 + 1
            r7 = 3
            if (r9 >= r7) goto L81
            r9 = r6
            r6 = r5
            goto L83
        L81:
            r9 = r6
        L82:
            r6 = r4
        L83:
            if (r6 == 0) goto L94
            r0.i = r2
            r0.j = r9
            r0.l = r3
            r6 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r10 = a.qcc.O(r6, r0)
            if (r10 != r1) goto L2e
        L93:
            return r1
        L94:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a.wwb.O(a.zaq, a.zje):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List] */
    public static final y3h P(List list) {
        ?? arrayList;
        f4h f4hVar;
        f4h f4hVar2;
        List list2;
        List list3;
        list.getClass();
        f110 f110Var = (f110) CollectionsKt.firstOrNull(list);
        f110 f110Var2 = (f110) CollectionsKt.W(1, list);
        List list4 = null;
        String str = f110Var != null ? f110Var.f8743a : null;
        String str2 = str == null ? "" : str;
        String strE = lmc.E(f110Var != null ? f110Var.c : null);
        int i = 0;
        if (f110Var == null || (list3 = f110Var.d) == null) {
            arrayList = 0;
        } else {
            arrayList = new ArrayList(r3d.q(list3, 10));
            int i2 = 0;
            for (Object obj : list3) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    q3d.p();
                    throw null;
                }
                arrayList.add(R((i4h) obj, i2, 0));
                i2 = i3;
            }
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        ?? r9 = arrayList;
        String str3 = f110Var2 != null ? f110Var2.f8743a : null;
        String str4 = str3 == null ? "" : str3;
        String strE2 = lmc.E(f110Var2 != null ? f110Var2.c : null);
        if (f110Var2 != null && (list2 = f110Var2.d) != null) {
            ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
            for (Object obj2 : list2) {
                int i4 = i + 1;
                if (i < 0) {
                    q3d.p();
                    throw null;
                }
                arrayList2.add(R((i4h) obj2, i, 1));
                i = i4;
            }
            list4 = arrayList2;
        }
        if (list4 == null) {
            list4 = iun.f15405a;
        }
        return new y3h(str2, strE, r9, (f110Var == null || (f4hVar2 = f110Var.e) == null) ? new c110(-1, -1, -1.0f, -1.0f, -1.0f, -1, -1.0f, -1.0f, -1.0f) : Q(f4hVar2), str4, strE2, list4, (f110Var2 == null || (f4hVar = f110Var2.e) == null) ? new c110(-1, -1, -1.0f, -1.0f, -1.0f, -1, -1.0f, -1.0f, -1.0f) : Q(f4hVar));
    }

    public static final c110 Q(f4h f4hVar) {
        Integer num = f4hVar.f8913a;
        int iIntValue = num != null ? num.intValue() : -1;
        Integer num2 = f4hVar.b;
        int iIntValue2 = num2 != null ? num2.intValue() : -1;
        Float f = f4hVar.c;
        float fFloatValue = f != null ? f.floatValue() : -1.0f;
        Float f2 = f4hVar.d;
        float fFloatValue2 = f2 != null ? f2.floatValue() : -1.0f;
        Float f3 = f4hVar.e;
        float fFloatValue3 = f3 != null ? f3.floatValue() : -1.0f;
        Integer num3 = f4hVar.f;
        int iIntValue3 = num3 != null ? num3.intValue() : -1;
        Float f4 = f4hVar.g;
        float fFloatValue4 = f4 != null ? f4.floatValue() : -1.0f;
        Float f5 = f4hVar.h;
        float fFloatValue5 = f5 != null ? f5.floatValue() : -1.0f;
        Float f6 = f4hVar.i;
        return new c110(iIntValue, iIntValue2, fFloatValue, fFloatValue2, fFloatValue3, iIntValue3, fFloatValue4, fFloatValue5, f6 != null ? f6.floatValue() : -1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.ArrayList] */
    public static final c4h R(i4h i4hVar, int i, int i2) {
        ?? arrayList;
        String str = i4hVar.c + i + i2;
        String str2 = i4hVar.c;
        if (str2 == null) {
            str2 = "";
        }
        String strE = lmc.E(i4hVar.n);
        String str3 = i4hVar.g;
        if (str3 == null) {
            str3 = "";
        }
        Float f = i4hVar.h;
        float fFloatValue = f != null ? f.floatValue() : 0.0f;
        Float f2 = i4hVar.i;
        float fFloatValue2 = f2 != null ? f2.floatValue() : 0.0f;
        Float f3 = i4hVar.j;
        float fFloatValue3 = f3 != null ? f3.floatValue() : 0.0f;
        Integer num = i4hVar.k;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = i4hVar.l;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        List list = i4hVar.q;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b4h b4hVar = (b4h) it.next();
                Iterator it2 = it;
                String strN = ohs0.n(b4hVar.f1957a, b4hVar.b);
                String str4 = b4hVar.f1957a;
                String str5 = str4 == null ? "" : str4;
                String strE2 = lmc.E(b4hVar.c);
                Double d = b4hVar.d;
                double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
                Double d2 = b4hVar.e;
                double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
                Integer num3 = b4hVar.f;
                arrayList.add(new q3h(strN, str5, strE2, dDoubleValue, dDoubleValue2, num3 != null ? num3.intValue() : 0));
                it = it2;
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        return new c4h(str, str2, strE, str3, fFloatValue, fFloatValue2, fFloatValue3, iIntValue, iIntValue2, arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:128:0x09cf  */
    /* JADX WARN: Code duplicated, block: B:130:0x09d5  */
    /* JADX WARN: Code duplicated, block: B:156:0x0c26  */
    /* JADX WARN: Code duplicated, block: B:158:0x0c2e  */
    /* JADX WARN: Code duplicated, block: B:33:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:35:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:61:0x0537  */
    /* JADX WARN: Code duplicated, block: B:63:0x053f  */
    /* JADX WARN: Code duplicated, block: B:98:0x07b0  */
    public static final mim0 S(long j, cys0 cys0Var, kbo kboVar, v5l0 v5l0Var, ctf0 ctf0Var, pim0 pim0Var) {
        slm0 qlm0Var;
        slm0 rlm0Var;
        float f;
        umm0 smm0Var;
        umm0 pmm0Var;
        nmm0 lmm0Var;
        nmm0 imm0Var;
        gmm0 emm0Var;
        gmm0 bmm0Var;
        zlm0 xlm0Var;
        zlm0 zlm0Var;
        String str = kboVar.f;
        String str2 = kboVar.e;
        boolean z = kboVar.i;
        List list = kboVar.o;
        String str3 = kboVar.h;
        String str4 = kboVar.g;
        String str5 = kboVar.d;
        String str6 = kboVar.b;
        String str7 = kboVar.c;
        String str8 = kboVar.f18023a;
        String str9 = kboVar.k;
        String str10 = kboVar.j;
        boolean z2 = kboVar.n;
        long j2 = kboVar.l;
        cys0Var.getClass();
        v5l0Var.getClass();
        ctf0Var.getClass();
        int iOrdinal = v5l0Var.ordinal();
        if (iOrdinal == 0) {
            switch (cys0Var.ordinal()) {
                case 0:
                    mpm mpmVarR = idm0.r(kboVar.g, kboVar.h, kboVar.i);
                    String strP = idm0.p(kboVar.n, kboVar.l);
                    Pair pairO = idm0.o(kboVar);
                    hgm hgmVar = (hgm) pairO.f46059a;
                    hgm hgmVar2 = (hgm) pairO.b;
                    h1n h1nVarQ = idm0.q(kboVar.f18023a, kboVar.b);
                    h1n h1nVarQ2 = idm0.q(kboVar.c, kboVar.d);
                    String str11 = kboVar.j;
                    String str12 = kboVar.k;
                    x0m x0mVar = x0m.f40076a;
                    qlm0Var = new qlm0(h1nVarQ, h1nVarQ2, mpmVarR, strP, str11, str12, new mgm(new ygm(hgmVar)), new mgm(new ygm(hgmVar2)));
                    return qlm0Var != null ? new fim0(j, qlm0Var, pim0Var) : new shm0();
                case 1:
                    Pair pairO2 = idm0.o(kboVar);
                    hgm hgmVar3 = (hgm) pairO2.f46059a;
                    hgm hgmVar4 = (hgm) pairO2.b;
                    String strP2 = idm0.p(kboVar.n, kboVar.l);
                    String str13 = kboVar.f18023a;
                    c280 c280Var = new c280(kboVar.b, R.drawable.ic_glyph_placeholder_player);
                    String str14 = kboVar.j;
                    List list2 = kboVar.o;
                    ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add((String) ((Pair) it.next()).f46059a);
                    }
                    ixm ixmVar = new ixm(str13, c280Var, str14, dyb.o0(arrayList));
                    String str15 = kboVar.c;
                    c280 c280Var2 = new c280(kboVar.d, R.drawable.ic_glyph_placeholder_player);
                    String str16 = kboVar.k;
                    ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add((String) ((Pair) it2.next()).b);
                    }
                    qlm0Var = new nlm0(ixmVar, new ixm(str15, c280Var2, str16, dyb.o0(arrayList2)), strP2, new lgm(new zgm(hgmVar3, hgmVar4)), new lgm(new zgm(hgmVar3, hgmVar4)));
                    if (qlm0Var != null) {
                    }
                case 2:
                    q3i o3iVar = z ? p3i.f26301a : new o3i(str4, str3);
                    String strP3 = idm0.p(z2, j2);
                    Pair pairO3 = idm0.o(kboVar);
                    rlm0Var = new rlm0(new r3i(str8, new c280(str6, R.drawable.ic_glyph_placeholder_player), new c280(str2, R.drawable.ic_glyph_placeholder_player)), new r3i(str7, new c280(str5, R.drawable.ic_glyph_placeholder_player), new c280(str, R.drawable.ic_glyph_placeholder_player)), o3iVar, strP3, str10, str9, new mgm(new ygm((hgm) pairO3.f46059a)), new mgm(new ygm((hgm) pairO3.b)));
                    qlm0Var = rlm0Var;
                    if (qlm0Var != null) {
                    }
                case 3:
                    Pair pairO4 = idm0.o(kboVar);
                    hgm hgmVar5 = (hgm) pairO4.f46059a;
                    hgm hgmVar6 = (hgm) pairO4.b;
                    String strP4 = idm0.p(z2, j2);
                    String str17 = kboVar.f18023a;
                    String str18 = kboVar.g;
                    pz40 pz40Var = s6t0.f31722a;
                    rlm0Var = new mlm0(str17, str18, s6t0.b().f33626a.getTextPrimary(), new c280(str6, R.drawable.ic_glyph_placeholder_player), new c280(str5, R.drawable.ic_glyph_placeholder_player), kboVar.c, kboVar.h, s6t0.b().f33626a.getTextPrimary(), strP4, str10, str9, new kgm(new zgm(hgmVar5, hgmVar6)), new kgm(new zgm(hgmVar5, hgmVar6)));
                    qlm0Var = rlm0Var;
                    if (qlm0Var != null) {
                    }
                case 4:
                    mpm mpmVarR2 = idm0.r(str4, str3, z);
                    String strP5 = idm0.p(z2, j2);
                    Pair pairO5 = idm0.o(kboVar);
                    hgm hgmVar7 = (hgm) pairO5.f46059a;
                    hgm hgmVar8 = (hgm) pairO5.b;
                    h1n h1nVar = new h1n(new c280(str6, R.drawable.ic_glyph_placeholder_player), str8);
                    h1n h1nVar2 = new h1n(new c280(str5, R.drawable.ic_glyph_placeholder_player), str7);
                    x0m x0mVar2 = x0m.f40076a;
                    rlm0Var = new plm0(h1nVar, h1nVar2, mpmVarR2, strP5, str10, str9, new mgm(new ygm(hgmVar7)), new mgm(new ygm(hgmVar8)));
                    qlm0Var = rlm0Var;
                    if (qlm0Var != null) {
                    }
                case 5:
                    rlm0Var = new olm0(new c280(jwb.K(kboVar), R.drawable.ic_glyph_placeholder_player), jwb.L(kboVar), idm0.p(z2, j2), str10, str9);
                    qlm0Var = rlm0Var;
                    if (qlm0Var != null) {
                    }
                case 6:
                    qlm0Var = null;
                    if (qlm0Var != null) {
                    }
                default:
                    t9f.b();
                    return null;
            }
        }
        ulm0 ulm0Var = null;
        if (iOrdinal == 1) {
            switch (cys0Var.ordinal()) {
                case 0:
                    String strP6 = idm0.p(z2, j2);
                    Pair pairO6 = idm0.o(kboVar);
                    hgm hgmVar9 = (hgm) pairO6.f46059a;
                    hgm hgmVar10 = (hgm) pairO6.b;
                    if (str4.length() <= 0 || str3.length() <= 0) {
                        zcl zclVar = qmk.f28987a;
                        f = 0.0f;
                    } else {
                        zcl zclVar2 = qmk.f28987a;
                        f = 16.0f;
                    }
                    i1n i1nVar = new i1n(str8, str4);
                    i1n i1nVar2 = new i1n(str7, str3);
                    String strA = ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0));
                    x0m x0mVar3 = x0m.f40076a;
                    smm0Var = new smm0(i1nVar, i1nVar2, strA, strP6, str10, str9, new pgm(new zgm(hgmVar9, hgmVar10), f, 4), new pgm(new zgm(hgmVar9, hgmVar10), f, 4));
                    pmm0Var = smm0Var;
                    return pmm0Var != null ? new jim0(j, pmm0Var, pim0Var) : new shm0();
                case 1:
                    Pair pairO7 = idm0.o(kboVar);
                    hgm hgmVar11 = (hgm) pairO7.f46059a;
                    hgm hgmVar12 = (hgm) pairO7.b;
                    String strP7 = idm0.p(z2, j2);
                    ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add((String) ((Pair) it3.next()).f46059a);
                    }
                    jxm jxmVar = new jxm(dyb.o0(arrayList3), str8, str10);
                    ArrayList arrayList4 = new ArrayList(r3d.q(list, 10));
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add((String) ((Pair) it4.next()).b);
                    }
                    pmm0Var = new pmm0(jxmVar, new jxm(dyb.o0(arrayList4), str7, str9), strP7, new ngm(new zgm(hgmVar11, hgmVar12)), new ngm(new zgm(hgmVar11, hgmVar12)));
                    if (pmm0Var != null) {
                    }
                case 2:
                    String strP8 = idm0.p(z2, j2);
                    Pair pairO8 = idm0.o(kboVar);
                    hgm hgmVar13 = (hgm) pairO8.f46059a;
                    hgm hgmVar14 = (hgm) pairO8.b;
                    i1n i1nVar3 = new i1n(str8, str4);
                    i1n i1nVar4 = new i1n(str7, str3);
                    String strA2 = ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0));
                    x0m x0mVar4 = x0m.f40076a;
                    smm0Var = new tmm0(i1nVar3, i1nVar4, strA2, strP8, str10, str9, new pgm(new zgm(hgmVar13, hgmVar14), 0.0f, 6), new pgm(new zgm(hgmVar13, hgmVar14), 0.0f, 6));
                    pmm0Var = smm0Var;
                    if (pmm0Var != null) {
                    }
                case 3:
                    Pair pairO9 = idm0.o(kboVar);
                    hgm hgmVar15 = (hgm) pairO9.f46059a;
                    hgm hgmVar16 = (hgm) pairO9.b;
                    String strP9 = idm0.p(z2, j2);
                    i1n i1nVar5 = new i1n(str8, str4);
                    i1n i1nVar6 = new i1n(str7, str3);
                    x0m x0mVar5 = x0m.f40076a;
                    smm0Var = new omm0(i1nVar5, i1nVar6, strP9, str10, str9, new ogm(new zgm(hgmVar15, hgmVar16)), new ogm(new zgm(hgmVar15, hgmVar16)));
                    pmm0Var = smm0Var;
                    if (pmm0Var != null) {
                    }
                case 4:
                    String strP10 = idm0.p(z2, j2);
                    Pair pairO10 = idm0.o(kboVar);
                    hgm hgmVar17 = (hgm) pairO10.f46059a;
                    hgm hgmVar18 = (hgm) pairO10.b;
                    i1n i1nVar7 = new i1n(str8, str4);
                    i1n i1nVar8 = new i1n(str7, str3);
                    String strA3 = ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0));
                    x0m x0mVar6 = x0m.f40076a;
                    smm0Var = new rmm0(i1nVar7, i1nVar8, strA3, strP10, str10, str9, new pgm(new zgm(hgmVar17, hgmVar18), 0.0f, 6), new pgm(new zgm(hgmVar17, hgmVar18), 0.0f, 6));
                    pmm0Var = smm0Var;
                    if (pmm0Var != null) {
                    }
                case 5:
                    pmm0Var = new qmm0(jwb.L(kboVar), idm0.p(z2, j2), str10, str9);
                    if (pmm0Var != null) {
                    }
                case 6:
                    pmm0Var = null;
                    if (pmm0Var != null) {
                    }
                default:
                    t9f.b();
                    return null;
            }
        }
        if (iOrdinal == 2) {
            switch (cys0Var.ordinal()) {
                case 0:
                    String strP11 = idm0.p(z2, j2);
                    Pair pairO11 = idm0.o(kboVar);
                    hgm hgmVar19 = (hgm) pairO11.f46059a;
                    hgm hgmVar20 = (hgm) pairO11.b;
                    boolean z3 = str4.length() > 0 && str3.length() > 0;
                    zcl zclVar3 = qmk.f28987a;
                    float f2 = z3 ? 16.0f : 0.0f;
                    float f3 = z3 ? 56.0f : 52.0f;
                    j1n j1nVar = new j1n(str8, new c280(str6, R.drawable.ic_glyph_placeholder_player), str4);
                    j1n j1nVar2 = new j1n(str7, new c280(str5, R.drawable.ic_glyph_placeholder_player), str3);
                    String strA4 = ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0));
                    x0m x0mVar7 = x0m.f40076a;
                    lmm0Var = new lmm0(j1nVar, j1nVar2, strA4, strP11, str10, str9, new sgm(new zgm(hgmVar19, hgmVar20), f2, f3), new sgm(new zgm(hgmVar19, hgmVar20), f2, f3));
                    imm0Var = lmm0Var;
                    return imm0Var != null ? new iim0(j, imm0Var, pim0Var) : new shm0();
                case 1:
                    Pair pairO12 = idm0.o(kboVar);
                    hgm hgmVar21 = (hgm) pairO12.f46059a;
                    hgm hgmVar22 = (hgm) pairO12.b;
                    String strP12 = idm0.p(z2, j2);
                    c280 c280Var3 = new c280(str6, R.drawable.ic_glyph_placeholder_player);
                    ArrayList arrayList5 = new ArrayList(r3d.q(list, 10));
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        arrayList5.add((String) ((Pair) it5.next()).f46059a);
                    }
                    kxm kxmVar = new kxm(str8, c280Var3, str10, dyb.o0(arrayList5));
                    c280 c280Var4 = new c280(str5, R.drawable.ic_glyph_placeholder_player);
                    ArrayList arrayList6 = new ArrayList(r3d.q(list, 10));
                    Iterator it6 = list.iterator();
                    while (it6.hasNext()) {
                        arrayList6.add((String) ((Pair) it6.next()).b);
                    }
                    imm0Var = new imm0(kxmVar, new kxm(str7, c280Var4, str9, dyb.o0(arrayList6)), strP12, new rgm(new zgm(hgmVar21, hgmVar22)), new rgm(new zgm(hgmVar21, hgmVar22)));
                    if (imm0Var != null) {
                    }
                case 2:
                    String strP13 = idm0.p(z2, j2);
                    Pair pairO13 = idm0.o(kboVar);
                    hgm hgmVar23 = (hgm) pairO13.f46059a;
                    hgm hgmVar24 = (hgm) pairO13.b;
                    j1n j1nVar3 = new j1n(str8, null, str4);
                    j1n j1nVar4 = new j1n(str7, null, str3);
                    String strA5 = ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0));
                    x0m x0mVar8 = x0m.f40076a;
                    lmm0Var = new mmm0(j1nVar3, j1nVar4, strA5, strP13, str10, str9, new sgm(new zgm(hgmVar23, hgmVar24)), new sgm(new zgm(hgmVar23, hgmVar24)));
                    imm0Var = lmm0Var;
                    if (imm0Var != null) {
                    }
                case 3:
                    Pair pairO14 = idm0.o(kboVar);
                    hgm hgmVar25 = (hgm) pairO14.f46059a;
                    hgm hgmVar26 = (hgm) pairO14.b;
                    String strP14 = idm0.p(z2, j2);
                    String str19 = kboVar.f18023a;
                    String str20 = kboVar.g;
                    pz40 pz40Var2 = s6t0.f31722a;
                    lmm0Var = new hmm0(str19, str20, s6t0.b().f33626a.getTextPrimary(), new c280(str6, R.drawable.ic_glyph_placeholder_player), new c280(str5, R.drawable.ic_glyph_placeholder_player), kboVar.c, kboVar.h, s6t0.b().f33626a.getTextPrimary(), strP14, str10, str9, new qgm(new zgm(hgmVar25, hgmVar26)), new qgm(new zgm(hgmVar25, hgmVar26)));
                    imm0Var = lmm0Var;
                    if (imm0Var != null) {
                    }
                case 4:
                    String strP15 = idm0.p(z2, j2);
                    Pair pairO15 = idm0.o(kboVar);
                    hgm hgmVar27 = (hgm) pairO15.f46059a;
                    hgm hgmVar28 = (hgm) pairO15.b;
                    j1n j1nVar5 = new j1n(str8, new c280(str6, R.drawable.ic_glyph_placeholder_player), str4);
                    j1n j1nVar6 = new j1n(str7, new c280(str5, R.drawable.ic_glyph_placeholder_player), str3);
                    String strA6 = ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0));
                    x0m x0mVar9 = x0m.f40076a;
                    lmm0Var = new kmm0(j1nVar5, j1nVar6, strA6, strP15, str10, str9, new sgm(new zgm(hgmVar27, hgmVar28)), new sgm(new zgm(hgmVar27, hgmVar28)));
                    imm0Var = lmm0Var;
                    if (imm0Var != null) {
                    }
                case 5:
                    lmm0Var = new jmm0(new c280(jwb.K(kboVar), R.drawable.ic_glyph_placeholder_player), jwb.L(kboVar), idm0.p(z2, j2), str10, str9);
                    imm0Var = lmm0Var;
                    if (imm0Var != null) {
                    }
                case 6:
                    imm0Var = null;
                    if (imm0Var != null) {
                    }
                default:
                    t9f.b();
                    return null;
            }
        }
        if (iOrdinal == 3) {
            switch (cys0Var.ordinal()) {
                case 0:
                    String strP16 = idm0.p(z2, j2);
                    Pair pairO16 = idm0.o(kboVar);
                    hgm hgmVar29 = (hgm) pairO16.f46059a;
                    hgm hgmVar30 = (hgm) pairO16.b;
                    k1n k1nVar = new k1n(str8, new c280(str6, R.drawable.ic_glyph_placeholder_player));
                    k1n k1nVar2 = new k1n(str7, new c280(str5, R.drawable.ic_glyph_placeholder_player));
                    a2m a2mVarK = zcm0.k(str4, str3, z);
                    x0m x0mVar10 = x0m.f40076a;
                    emm0Var = new emm0(k1nVar, k1nVar2, a2mVarK, strP16, str10, str9, new vgm(new ygm(hgmVar29)), new vgm(new ygm(hgmVar30)));
                    bmm0Var = emm0Var;
                    return bmm0Var != null ? new him0(j, bmm0Var, pim0Var) : new shm0();
                case 1:
                    Pair pairO17 = idm0.o(kboVar);
                    hgm hgmVar31 = (hgm) pairO17.f46059a;
                    hgm hgmVar32 = (hgm) pairO17.b;
                    String strP17 = idm0.p(z2, j2);
                    c280 c280Var5 = new c280(str6, R.drawable.ic_glyph_placeholder_player);
                    ArrayList arrayList7 = new ArrayList(r3d.q(list, 10));
                    Iterator it7 = list.iterator();
                    while (it7.hasNext()) {
                        arrayList7.add((String) ((Pair) it7.next()).f46059a);
                    }
                    lxm lxmVar = new lxm(str8, c280Var5, str10, dyb.o0(arrayList7));
                    c280 c280Var6 = new c280(str5, R.drawable.ic_glyph_placeholder_player);
                    ArrayList arrayList8 = new ArrayList(r3d.q(list, 10));
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        arrayList8.add((String) ((Pair) it8.next()).b);
                    }
                    bmm0Var = new bmm0(lxmVar, new lxm(str7, c280Var6, str9, dyb.o0(arrayList8)), strP17, new ugm(new zgm(hgmVar31, hgmVar32)), new ugm(new zgm(hgmVar31, hgmVar32)));
                    if (bmm0Var != null) {
                    }
                case 2:
                    String strP18 = idm0.p(z2, j2);
                    Pair pairO18 = idm0.o(kboVar);
                    hgm hgmVar33 = (hgm) pairO18.f46059a;
                    hgm hgmVar34 = (hgm) pairO18.b;
                    bzm bzmVar = new bzm(str8, new c280(str6, R.drawable.ic_glyph_placeholder_player), new c280(str2, R.drawable.ic_glyph_placeholder_player));
                    bzm bzmVar2 = new bzm(str7, new c280(str5, R.drawable.ic_glyph_placeholder_player), new c280(str, R.drawable.ic_glyph_placeholder_player));
                    azm azmVar = new azm(ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), str4, str3);
                    wgm wgmVar = new wgm(new zgm(hgmVar33, hgmVar34));
                    wgm wgmVar2 = new wgm(new zgm(hgmVar33, hgmVar34));
                    q6x q6xVar = q6x.f28221a;
                    emm0Var = new fmm0(bzmVar, bzmVar2, azmVar, strP18, str10, str9, wgmVar, wgmVar2);
                    bmm0Var = emm0Var;
                    if (bmm0Var != null) {
                    }
                case 3:
                    Pair pairO19 = idm0.o(kboVar);
                    hgm hgmVar35 = (hgm) pairO19.f46059a;
                    hgm hgmVar36 = (hgm) pairO19.b;
                    String strP19 = idm0.p(z2, j2);
                    String str21 = kboVar.f18023a;
                    String str22 = kboVar.g;
                    pz40 pz40Var3 = s6t0.f31722a;
                    emm0Var = new amm0(str21, str22, s6t0.b().f33626a.getTextPrimary(), new c280(str6, R.drawable.ic_glyph_placeholder_player), new c280(str5, R.drawable.ic_glyph_placeholder_player), kboVar.c, kboVar.h, s6t0.b().f33626a.getTextPrimary(), strP19, str10, str9, new tgm(new zgm(hgmVar35, hgmVar36)), new tgm(new zgm(hgmVar35, hgmVar36)));
                    bmm0Var = emm0Var;
                    if (bmm0Var != null) {
                    }
                case 4:
                    String strP20 = idm0.p(z2, j2);
                    Pair pairO20 = idm0.o(kboVar);
                    hgm hgmVar37 = (hgm) pairO20.f46059a;
                    hgm hgmVar38 = (hgm) pairO20.b;
                    bzm bzmVar3 = new bzm(str8, new c280(str6, R.drawable.ic_glyph_placeholder_player), null);
                    bzm bzmVar4 = new bzm(str7, new c280(str5, R.drawable.ic_glyph_placeholder_player), null);
                    azm azmVar2 = new azm(ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), str4, str3);
                    wgm wgmVar3 = new wgm(new zgm(hgmVar37, hgmVar38));
                    wgm wgmVar4 = new wgm(new zgm(hgmVar37, hgmVar38));
                    q6x q6xVar2 = q6x.f28221a;
                    emm0Var = new dmm0(bzmVar3, bzmVar4, azmVar2, strP20, str10, str9, wgmVar3, wgmVar4);
                    bmm0Var = emm0Var;
                    if (bmm0Var != null) {
                    }
                case 5:
                    emm0Var = new cmm0(new c280(jwb.K(kboVar), R.drawable.ic_glyph_placeholder_player), jwb.L(kboVar), idm0.p(z2, j2), str10, str9);
                    bmm0Var = emm0Var;
                    if (bmm0Var != null) {
                    }
                case 6:
                    bmm0Var = null;
                    if (bmm0Var != null) {
                    }
                default:
                    t9f.b();
                    return null;
            }
        }
        if (iOrdinal != 4) {
            t9f.b();
            return null;
        }
        switch (cys0Var.ordinal()) {
            case 0:
                String strP21 = idm0.p(z2, j2);
                Pair pairO21 = idm0.o(kboVar);
                hgm hgmVar39 = (hgm) pairO21.f46059a;
                hgm hgmVar40 = (hgm) pairO21.b;
                k1n k1nVar3 = new k1n(str8, new c280(str6, R.drawable.ic_glyph_placeholder_player));
                k1n k1nVar4 = new k1n(str7, new c280(str5, R.drawable.ic_glyph_placeholder_player));
                a2m a2mVarP = ycm0.p(str4, str3, z);
                x0m x0mVar11 = x0m.f40076a;
                xlm0Var = new xlm0(k1nVar3, k1nVar4, a2mVarP, strP21, str10, str9, new vgm(new ygm(hgmVar39)), new vgm(new ygm(hgmVar40)));
                zlm0Var = xlm0Var;
                return zlm0Var != null ? new gim0(j, zlm0Var, pim0Var) : new shm0();
            case 1:
                Pair pairO22 = idm0.o(kboVar);
                hgm hgmVar41 = (hgm) pairO22.f46059a;
                hgm hgmVar42 = (hgm) pairO22.b;
                String strP22 = idm0.p(z2, j2);
                c280 c280Var7 = new c280(str6, R.drawable.ic_glyph_placeholder_player);
                ArrayList arrayList9 = new ArrayList(r3d.q(list, 10));
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    arrayList9.add((String) ((Pair) it9.next()).f46059a);
                }
                lxm lxmVar2 = new lxm(str8, c280Var7, str10, dyb.o0(arrayList9));
                c280 c280Var8 = new c280(str5, R.drawable.ic_glyph_placeholder_player);
                ArrayList arrayList10 = new ArrayList(r3d.q(list, 10));
                Iterator it10 = list.iterator();
                while (it10.hasNext()) {
                    arrayList10.add((String) ((Pair) it10.next()).b);
                }
                ulm0Var = new ulm0(lxmVar2, new lxm(str7, c280Var8, str9, dyb.o0(arrayList10)), strP22, new ugm(new zgm(hgmVar41, hgmVar42)), new ugm(new zgm(hgmVar41, hgmVar42)));
                zlm0Var = ulm0Var;
                if (zlm0Var != null) {
                }
            case 2:
                String strP23 = idm0.p(z2, j2);
                Pair pairO23 = idm0.o(kboVar);
                hgm hgmVar43 = (hgm) pairO23.f46059a;
                hgm hgmVar44 = (hgm) pairO23.b;
                bzm bzmVar5 = new bzm(str8, new c280(str6, R.drawable.ic_glyph_placeholder_player), new c280(str2, R.drawable.ic_glyph_placeholder_player));
                bzm bzmVar6 = new bzm(str7, new c280(str5, R.drawable.ic_glyph_placeholder_player), new c280(str, R.drawable.ic_glyph_placeholder_player));
                azm azmVar3 = new azm(ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), str4, str3);
                wgm wgmVar5 = new wgm(new zgm(hgmVar43, hgmVar44));
                wgm wgmVar6 = new wgm(new zgm(hgmVar43, hgmVar44));
                q6x q6xVar3 = q6x.f28221a;
                xlm0Var = new ylm0(bzmVar5, bzmVar6, azmVar3, strP23, str10, str9, wgmVar5, wgmVar6);
                zlm0Var = xlm0Var;
                if (zlm0Var != null) {
                }
            case 3:
                Pair pairO24 = idm0.o(kboVar);
                hgm hgmVar45 = (hgm) pairO24.f46059a;
                hgm hgmVar46 = (hgm) pairO24.b;
                String strP24 = idm0.p(z2, j2);
                String str23 = kboVar.f18023a;
                String str24 = kboVar.g;
                pz40 pz40Var4 = s6t0.f31722a;
                xlm0Var = new tlm0(str23, str24, s6t0.b().f33626a.getTextPrimary(), new c280(str6, R.drawable.ic_glyph_placeholder_player), new c280(str5, R.drawable.ic_glyph_placeholder_player), kboVar.c, kboVar.h, s6t0.b().f33626a.getTextPrimary(), strP24, str10, str9, new tgm(new zgm(hgmVar45, hgmVar46)), new tgm(new zgm(hgmVar45, hgmVar46)));
                zlm0Var = xlm0Var;
                if (zlm0Var != null) {
                }
            case 4:
                String strP25 = idm0.p(z2, j2);
                Pair pairO25 = idm0.o(kboVar);
                hgm hgmVar47 = (hgm) pairO25.f46059a;
                hgm hgmVar48 = (hgm) pairO25.b;
                bzm bzmVar7 = new bzm(str8, new c280(str6, R.drawable.ic_glyph_placeholder_player), null);
                bzm bzmVar8 = new bzm(str7, new c280(str5, R.drawable.ic_glyph_placeholder_player), null);
                azm azmVar4 = new azm(ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), str4, str3);
                wgm wgmVar7 = new wgm(new zgm(hgmVar47, hgmVar48));
                wgm wgmVar8 = new wgm(new zgm(hgmVar47, hgmVar48));
                q6x q6xVar4 = q6x.f28221a;
                xlm0Var = new wlm0(bzmVar7, bzmVar8, azmVar4, strP25, str10, str9, wgmVar7, wgmVar8);
                zlm0Var = xlm0Var;
                if (zlm0Var != null) {
                }
            case 5:
                xlm0Var = new vlm0(new c280(jwb.K(kboVar), R.drawable.ic_glyph_placeholder_player), jwb.L(kboVar), idm0.p(z2, j2), str10, str9);
                zlm0Var = xlm0Var;
                if (zlm0Var != null) {
                }
            case 6:
                zlm0Var = ulm0Var;
                if (zlm0Var != null) {
                }
            default:
                t9f.b();
                return null;
        }
    }

    public static final u6l T(z4l z4lVar) {
        z4lVar.getClass();
        long j = z4lVar.f43775a;
        String str = z4lVar.q;
        boolean z = z4lVar.l;
        long j2 = z4lVar.g;
        return new u6l(j, z4lVar.o, j2, str, z, j2 == 0);
    }

    public static final trm U(nyg nygVar, ctf0 ctf0Var) {
        long j = nygVar.g;
        String strM0 = nygVar.f;
        if (nygVar.i == 243) {
            strM0 = StringsKt.m0(strM0, ". ", strM0);
        }
        return new trm(j, strM0, nygVar.m ? ctf0Var.b.a(R.string.cyber_live, Arrays.copyOf(new Object[0], 0)) : "", "", ctf0Var.j() ? new n0x(nygVar.b) : new n0x(nygVar.f24328a), ctf0Var.j() ? new m0x(R.drawable.cybergames_tablet_champ_placeholder, null, 6) : new m0x(R.drawable.cybergames_champ_placeholder, null, 6));
    }

    /* JADX WARN: Code duplicated, block: B:178:0x02b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:179:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:180:0x02be  */
    /* JADX WARN: Code duplicated, block: B:181:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:183:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:186:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:187:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:189:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:192:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:193:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:251:0x0393 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:252:0x0395 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:254:0x039a  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final a2n V(d0t d0tVar, ctf0 ctf0Var, y78 y78Var, boolean z, boolean z2, String str, boolean z3, List list, boolean z4, boolean z5, boolean z6, v5l0 v5l0Var, m5l0 m5l0Var, String str2, boolean z7) {
        boolean z8;
        long j;
        int i;
        boolean z9;
        w5l0 w5l0Var;
        a2n w1o0Var;
        d0tVar.getClass();
        ctf0Var.getClass();
        y78Var.getClass();
        str.getClass();
        list.getClass();
        v5l0Var.getClass();
        str2.getClass();
        boolean z10 = d0tVar.C;
        long j2 = d0tVar.u;
        String strX = d0tVar.c;
        Date date = d0tVar.P;
        boolean z11 = d0tVar.h;
        long j3 = d0tVar.v;
        rqs rqsVar = d0tVar.p;
        String str3 = rqsVar.f30947a;
        List listP = xkb.P();
        if (listP == null || !listP.isEmpty()) {
            Iterator it = listP.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z8 = z10;
                    j = j2;
                    i = 0;
                    z9 = false;
                    break;
                }
                i = 0;
                yxg yxgVar = (yxg) it.next();
                z8 = z10;
                j = j2;
                if (j3 == yxgVar.b && (j == yxgVar.f43419a || j == 0)) {
                    z9 = true;
                    break;
                }
                z10 = z8;
                j2 = j;
            }
        } else {
            z8 = z10;
            j = j2;
            z9 = false;
            i = 0;
        }
        boh bohVar = d0tVar.A;
        boolean z12 = d0tVar.z;
        if (bohVar != boh.UNKNOWN || qzb.C0(d0tVar) || z3 || z9) {
            if (z6) {
                if (qzb.D0(d0tVar)) {
                    w5l0Var = (!z8 || z12) ? w5l0.m : w5l0.n;
                } else if (fxb.H(Long.valueOf(j3))) {
                    w5l0Var = (!z8 || z12) ? w5l0.e : w5l0.f;
                } else if (fxb.G(Long.valueOf(j3), Long.valueOf(j))) {
                    w5l0Var = (!z8 || z12) ? w5l0.i : w5l0.j;
                } else if (j3 == 40 && z8) {
                    w5l0Var = w5l0.d;
                } else if (qzb.a1(d0tVar)) {
                    w5l0Var = z12 ? w5l0.k : w5l0.l;
                } else if (z12) {
                    w5l0Var = w5l0.c;
                } else {
                    w5l0Var = z8 ? w5l0.b : w5l0.f38591a;
                }
            } else if (j3 != 235) {
                yxg[] yxgVarArr = new yxg[5];
                yxgVarArr[i] = jrg.d;
                yxgVarArr[1] = mxg.d;
                yxgVarArr[2] = jwg.d;
                yxgVarArr[3] = hwg.d;
                yxgVarArr[4] = tvg.d;
                List listJ = q3d.j(yxgVarArr);
                if (listJ == null || !listJ.isEmpty()) {
                    Iterator it2 = listJ.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((yxg) it2.next()).b == j3) {
                                long j4 = d0tVar.n;
                                if (j3 == 167 && j4 != 2566618) {
                                    w5l0Var = z12 ? w5l0.w : w5l0.x;
                                } else if (j3 == mxg.d.b || j3 == jrg.d.b || j3 == hwg.d.b || (j3 == tvg.d.b && j4 == 2566618)) {
                                    w5l0Var = z12 ? w5l0.o : w5l0.p;
                                } else if (j3 == jwg.d.b) {
                                    w5l0Var = z12 ? w5l0.o : w5l0.p;
                                } else {
                                    w5l0Var = (!z12 || j4 == 2257069) ? w5l0.p : w5l0.c;
                                }
                            }
                        } else if (j3 == dxg.d.b) {
                            if (z12) {
                                w5l0Var = w5l0.c;
                            } else {
                                w5l0Var = w5l0.b;
                            }
                        } else if (qzb.D0(d0tVar)) {
                            if (z8 || z12) {
                                w5l0Var = w5l0.m;
                            } else {
                                w5l0Var = w5l0.n;
                            }
                        } else if (j3 == 40) {
                            if (z8 || z12) {
                                w5l0Var = w5l0.c;
                            } else {
                                w5l0Var = w5l0.d;
                            }
                        } else if (j3 != csg.d.b || j3 == 66) {
                            if (z8 || z12) {
                                w5l0Var = w5l0.i;
                            } else {
                                w5l0Var = w5l0.j;
                            }
                        } else if (z8 && j3 == pxg.d.b) {
                            w5l0Var = z12 ? w5l0.u : w5l0.v;
                        } else if (j3 == cwg.d.b && z8) {
                            w5l0Var = z12 ? w5l0.A : w5l0.B;
                        } else if (j3 == jtg.d.b || (j3 == kvg.d.b && z8)) {
                            w5l0Var = z12 ? w5l0.s : w5l0.t;
                        } else if (ckb.X(d0tVar)) {
                            if (qzb.Z0(d0tVar)) {
                                w5l0Var = z8 ? w5l0.h : w5l0.g;
                            } else {
                                w5l0Var = z12 ? w5l0.e : w5l0.f;
                            }
                        } else if (j3 == rtg.d.b && z8) {
                            w5l0Var = z12 ? w5l0.y : w5l0.z;
                        } else if (qzb.a1(d0tVar)) {
                            w5l0Var = z12 ? w5l0.k : w5l0.l;
                        } else if (qzb.Z0(d0tVar)) {
                            w5l0Var = (!z8 || z12) ? w5l0.g : w5l0.h;
                        } else {
                            w5l0Var = (!z12 && z8) ? w5l0.b : w5l0.c;
                        }
                    }
                } else if (j3 == dxg.d.b) {
                    if (z12) {
                        w5l0Var = w5l0.c;
                    } else {
                        w5l0Var = w5l0.b;
                    }
                } else if (qzb.D0(d0tVar)) {
                    if (z8) {
                        w5l0Var = w5l0.m;
                    } else {
                        w5l0Var = w5l0.m;
                    }
                } else if (j3 == 40) {
                    if (z8) {
                        w5l0Var = w5l0.c;
                    } else {
                        w5l0Var = w5l0.c;
                    }
                } else if (j3 != csg.d.b) {
                    if (z8) {
                        w5l0Var = w5l0.i;
                    } else {
                        w5l0Var = w5l0.i;
                    }
                } else if (z8) {
                    w5l0Var = w5l0.i;
                } else {
                    w5l0Var = w5l0.i;
                }
            } else if (!z12) {
                List list2 = rqsVar.n;
                if (list2 != null && list2.isEmpty()) {
                    w5l0Var = w5l0.r;
                    break;
                }
                Iterator it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        w5l0Var = w5l0.r;
                        break;
                    }
                    cmr cmrVar = (cmr) it3.next();
                    if (cmrVar.f4620a == dmr.B && Intrinsics.d(cmrVar.b, "2")) {
                        w5l0Var = w5l0.b;
                        break;
                    }
                }
            } else {
                w5l0Var = w5l0.q;
            }
        } else if (z6) {
            boolean zC0 = qzb.C0(d0tVar);
            if (qzb.D0(d0tVar)) {
                w5l0Var = (!z8 || z12) ? w5l0.m : w5l0.n;
            } else if (zC0) {
                w5l0Var = (!z8 || z12) ? w5l0.c : w5l0.d;
            } else if (z8 && ckb.X(d0tVar)) {
                w5l0Var = qzb.Z0(d0tVar) ? w5l0.h : w5l0.f;
            } else {
                w5l0Var = (!z8 || z12) ? w5l0.f38591a : w5l0.b;
            }
        } else if (qzb.D0(d0tVar)) {
            w5l0Var = (!z8 || z12) ? w5l0.m : w5l0.n;
        } else if (qzb.a1(d0tVar)) {
            w5l0Var = (!z8 || z12) ? w5l0.k : w5l0.l;
        } else if (qzb.Z0(d0tVar)) {
            w5l0Var = (!z8 || z12) ? w5l0.g : w5l0.h;
        } else if (fxb.H(Long.valueOf(j3))) {
            w5l0Var = (!z8 || z12) ? w5l0.e : w5l0.f;
        } else if (fxb.G(Long.valueOf(j3), Long.valueOf(j))) {
            w5l0Var = (!z8 || z12) ? w5l0.i : w5l0.j;
        } else {
            w5l0Var = (!z8 || z12) ? w5l0.f38591a : w5l0.b;
        }
        int iOrdinal = w5l0Var.ordinal();
        opm opmVar = opm.f25648a;
        c2m c2mVar = c2m.f3631a;
        Object p0nVar = null;
        switch (iOrdinal) {
            case 0:
                return w7n0.G(d0tVar, ctf0Var, m5l0Var, v5l0Var, str, str2, list, z, z4, z5, z2);
            case 1:
                return n8n0.o(y78Var, d0tVar, ctf0Var, m5l0Var, v5l0Var, str, str2, list, z, z4, z5, z2, z7);
            case 2:
                return vzb.o0(d0tVar, ctf0Var, m5l0Var, v5l0Var, str, str2, list, z, z4, z5, z2);
            case 3:
                return u1c.Q(y78Var, d0tVar, ctf0Var, m5l0Var, v5l0Var, str, str2, list, z, z2, z4, z5, z7);
            case 4:
                return jpm0.s(d0tVar, ctf0Var, m5l0Var, v5l0Var, str, str2, list, z, z4, z5, z2);
            case 5:
                return dqm0.F(d0tVar, ctf0Var, m5l0Var, v5l0Var, str, str2, list, z, z2, z4, z5);
            case 6:
                return qem0.u(d0tVar, ctf0Var, m5l0Var, v5l0Var, str, str2, list, z, z4, z5, z2);
            case 7:
                return ofm0.B(y78Var, d0tVar, ctf0Var, m5l0Var, v5l0Var, str, str2, list, z, z2, z4, z5, z7);
            case 8:
                return nkb.K(d0tVar, ctf0Var, m5l0Var, v5l0Var, str, str2, list, z, z4, z5, z2);
            case 9:
                return slb.X(y78Var, d0tVar, ctf0Var, m5l0Var, v5l0Var, str, str2, list, z, z2, z5, z4, z7);
            case 10:
                return h8x.U(y78Var, d0tVar, ctf0Var, m5l0Var, v5l0Var, str, str2, list, z, z4, z5, z2, z7);
            case 11:
                return l8x.y0(y78Var, d0tVar, ctf0Var, m5l0Var, v5l0Var, str, str2, list, z, z2, z4, z5, z7);
            case 12:
                return efx.O(d0tVar, ctf0Var, m5l0Var, v5l0Var, str, str2, list, z, z4, z5, z2);
            case 13:
                return gfx.T(y78Var, d0tVar, ctf0Var, m5l0Var, v5l0Var, str, str2, list, z, z4, z5, z2, z7);
            case 14:
                return epv0.b0(d0tVar, ctf0Var, m5l0Var, v5l0Var, str, str2, list, z, z4, z5, z2);
            case 15:
                return phu0.X(d0tVar, ctf0Var, list, str, v5l0Var, m5l0Var, z, z2, z4, z5, str2, y78Var);
            case 16:
                return f7k.g0(d0tVar, ctf0Var, m5l0Var, v5l0Var, str, str2, list, z, z4, z5, z2);
            case 17:
                return sj3.J0(d0tVar, ctf0Var, m5l0Var, v5l0Var, str, str2, list, z, z2, z4, z5);
            case 18:
                return n4c.T(d0tVar, ctf0Var, m5l0Var, v5l0Var, str, str2, list, z, z4, z5, z2);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return e3c.J(d0tVar, ctf0Var, m5l0Var, v5l0Var, str, str2, list, z, z2, z4, z5);
            case 20:
                return wgm0.w(d0tVar, ctf0Var, m5l0Var, v5l0Var, str, str2, list, z, z4, z5, z2);
            case 21:
                int i2 = i;
                int iOrdinal2 = v5l0Var.ordinal();
                if (iOrdinal2 == 0) {
                    return new q1o0(d0tVar.f5282a, afn0.q(d0tVar, str, list, z4, z5, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z2), kpb.f0(d0tVar, z)), new j2o0(new i2n(qzb.c0(d0tVar), ctf0Var.k(R.string.sport_game_victory_formula_text, new Object[0]), egm0.r(egm0.v(d0tVar).f11174a, ctf0Var), egm0.h(d0tVar, ctf0Var, true)), new i2n(qzb.r0(d0tVar), ctf0Var.k(R.string.sport_game_victory_formula_text, new Object[0]), egm0.r(egm0.v(d0tVar).b, ctf0Var), egm0.h(d0tVar, ctf0Var, false)), kpb.S(d0tVar), z11 ? ctf0Var.k(R.string.game_end, new Object[0]) : "", str3), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
                }
                if (iOrdinal2 == 1) {
                    return new u1o0(d0tVar.f5282a, afn0.u(new y3d(StaticColors.INSTANCE.m113getRed0d7_KjU()), d0tVar, str, str2, list, z4, z5, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new p3o0(new k2n(qzb.c0(d0tVar), egm0.r(egm0.v(d0tVar).f11174a, ctf0Var), egm0.h(d0tVar, ctf0Var, true), kpb.R(d0tVar).f33307a, rqsVar.t), new k2n(qzb.r0(d0tVar), egm0.r(egm0.v(d0tVar).b, ctf0Var), egm0.h(d0tVar, ctf0Var, false), kpb.R(d0tVar).b, rqsVar.u), z11 ? ctf0Var.k(R.string.game_end, new Object[0]) : "", str3), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
                }
                if (iOrdinal2 == 2) {
                    return new t1o0(d0tVar.f5282a, afn0.t(d0tVar, str, list, z4, z5, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new h3o0(new l2n(qzb.c0(d0tVar), egm0.r(egm0.v(d0tVar).f11174a, ctf0Var), egm0.h(d0tVar, ctf0Var, true), ctf0Var.k(R.string.total_count, new Object[0]), kpb.R(d0tVar).f33307a, rqsVar.t), new l2n(qzb.r0(d0tVar), egm0.r(egm0.v(d0tVar).b, ctf0Var), egm0.h(d0tVar, ctf0Var, false), ctf0Var.k(R.string.total_count, new Object[0]), kpb.R(d0tVar).b, rqsVar.u), z11 ? ctf0Var.k(R.string.game_end, new Object[0]) : "", str3, ctf0Var.k(R.string.live_new, new Object[0])), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
                }
                if (iOrdinal2 == 3) {
                    return new s1o0(d0tVar.f5282a, afn0.s(null, d0tVar, str, "", ctf0Var.k(R.string.live_new, new Object[i2]), str2, list, z4, z5, true, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z2), kpb.f0(d0tVar, z)), new z2o0(new m2n(egm0.h(d0tVar, ctf0Var, true), qzb.c0(d0tVar), egm0.r(egm0.v(d0tVar).f11174a, ctf0Var)), new m2n(egm0.h(d0tVar, ctf0Var, false), qzb.r0(d0tVar), egm0.r(egm0.v(d0tVar).b, ctf0Var)), kpb.C(d0tVar), str3), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var), new n0x(dtb.F(str)));
                }
                if (iOrdinal2 == 4) {
                    return new r1o0(d0tVar.f5282a, afn0.r(d0tVar, str, list, z4, z5, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z2), kpb.f0(d0tVar, z)), new r2o0(new n2n(egm0.h(d0tVar, ctf0Var, true), qzb.c0(d0tVar), egm0.r(egm0.v(d0tVar).f11174a, ctf0Var)), new n2n(egm0.h(d0tVar, ctf0Var, i2), qzb.r0(d0tVar), egm0.r(egm0.v(d0tVar).b, ctf0Var)), kpb.C(d0tVar), z11 ? "" : str3, z11 ? ctf0Var.k(R.string.game_end, new Object[i2]) : "", ctf0Var.k(R.string.live_new, new Object[i2])), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
                }
                t9f.b();
                return null;
            case 22:
                return fbc.X(d0tVar, ctf0Var, m5l0Var, v5l0Var, str, str2, list, z, z4, z5, z2);
            case 23:
                return sac.m0(d0tVar, ctf0Var, m5l0Var, v5l0Var, str, str2, list, z, z4, z5, z2);
            case 24:
                int i3 = i;
                d0tVar.getClass();
                Date date2 = d0tVar.P;
                String str4 = d0tVar.c;
                long j5 = d0tVar.v;
                ctf0Var.getClass();
                list.getClass();
                str.getClass();
                v5l0Var.getClass();
                str2.getClass();
                int iOrdinal3 = v5l0Var.ordinal();
                if (iOrdinal3 == 0) {
                    long j6 = d0tVar.f5282a;
                    i4i i4iVarU = ibm0.u(d0tVar, str, str2, list, z4, z5, z2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
                    if (j5 == 40) {
                        i3 = 1;
                    }
                    w1o0Var = new w1o0(j6, i4iVarU, new b4o0(new pws0(qzb.c0(d0tVar), kbc.U(d0tVar)), new pws0(qzb.r0(d0tVar), kbc.V(d0tVar)), new lpm(opmVar, new hpm(0L, 3)), qzb.B0(d0tVar) ? new p0n(kpb.q0(d0tVar), fgm.b, date2.getTime(), false, 24) : null, i3 != 0 ? str4 : kpb.X(d0tVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
                } else if (iOrdinal3 == 1) {
                    String strX2 = str4;
                    long j7 = d0tVar.f5282a;
                    j4i j4iVarY = ibm0.y(d0tVar, str, list, z4, z5, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
                    if (j5 == 40) {
                        i3 = 1;
                    }
                    qws0 qws0Var = new qws0(qzb.c0(d0tVar));
                    qws0 qws0Var2 = new qws0(qzb.r0(d0tVar));
                    p0nVar = qzb.B0(d0tVar) ? new p0n(kpb.q0(d0tVar), fgm.b, date2.getTime(), false, 24) : null;
                    if (i3 == 0) {
                        strX2 = kpb.X(d0tVar);
                    }
                    w1o0Var = new a2o0(j7, j4iVarY, new h5o0(qws0Var, qws0Var2, p0nVar, strX2, pem.f26861a), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
                } else if (iOrdinal3 == 2) {
                    String strX3 = str4;
                    long j8 = d0tVar.f5282a;
                    k4i k4iVarX = ibm0.x(d0tVar, str, list, z4, z5, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
                    if (j5 == 40) {
                        i3 = 1;
                    }
                    rws0 rws0Var = new rws0(qzb.c0(d0tVar), kbc.U(d0tVar));
                    rws0 rws0Var2 = new rws0(qzb.r0(d0tVar), kbc.V(d0tVar));
                    p0n p0nVar2 = qzb.B0(d0tVar) ? new p0n(kpb.q0(d0tVar), fgm.b, date2.getTime(), false, 24) : null;
                    if (i3 == 0) {
                        strX3 = kpb.X(d0tVar);
                    }
                    if (d0tVar.S && z2) {
                        p0nVar = new d2i();
                    }
                    w1o0Var = new z1o0(j8, k4iVarX, new z4o0(p0nVar, p0nVar2, rws0Var, rws0Var2, strX3), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
                } else if (iOrdinal3 == 3) {
                    String strX4 = str4;
                    int i4 = j5 == 40 ? 1 : i3;
                    long j9 = d0tVar.f5282a;
                    n0x n0xVar = new n0x(dtb.F(str));
                    if (i4 == 0) {
                        strX4 = kpb.X(d0tVar);
                    }
                    w1o0Var = new y1o0(j9, ibm0.w(d0tVar, str, strX4, list, z4, z5, qzb.B0(d0tVar), str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new r4o0(new sws0(qzb.c0(d0tVar), kbc.U(d0tVar)), new sws0(qzb.r0(d0tVar), kbc.V(d0tVar)), new z1m(c2mVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var), n0xVar);
                } else {
                    if (iOrdinal3 != 4) {
                        t9f.b();
                        return null;
                    }
                    long j10 = d0tVar.f5282a;
                    String strX5 = str4;
                    k4i k4iVarV = ibm0.v(d0tVar, str, str2, list, z4, z5, z2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
                    if (j5 == 40) {
                        i3 = 1;
                    }
                    tws0 tws0Var = new tws0(qzb.c0(d0tVar), kbc.U(d0tVar));
                    tws0 tws0Var2 = new tws0(qzb.r0(d0tVar), kbc.V(d0tVar));
                    z1m z1mVar = new z1m(c2mVar);
                    p0nVar = qzb.B0(d0tVar) ? new p0n(kpb.q0(d0tVar), fgm.b, date2.getTime(), false, 24) : null;
                    if (i3 == 0) {
                        strX5 = kpb.X(d0tVar);
                    }
                    w1o0Var = new x1o0(j10, k4iVarV, new j4o0(z1mVar, p0nVar, tws0Var, tws0Var2, strX5), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
                }
                return w1o0Var;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int i5 = i;
                int iOrdinal4 = v5l0Var.ordinal();
                if (iOrdinal4 == 0) {
                    long j11 = d0tVar.f5282a;
                    i4i i4iVarQ = afn0.q(d0tVar, str, list, z4, z5, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z2), kpb.f0(d0tVar, z));
                    a4x a4xVarJ = kkb.J(d0tVar, dmr.r, dmr.g1);
                    a4x a4xVarJ2 = kkb.J(d0tVar, dmr.s, dmr.h1);
                    return new q1o0(j11, i4iVarQ, new g2o0(qzb.c0(d0tVar), qzb.r0(d0tVar), a4xVarJ, a4xVarJ2, a4xVarJ.size() == 5 ? kkb.K(d0tVar, dmr.w) : "", a4xVarJ2.size() == 5 ? kkb.K(d0tVar, dmr.z) : "", str3, kkb.L(StringsKt.toIntOrNull(kkb.K(d0tVar, dmr.u)), ctf0Var), kpb.S(d0tVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
                }
                if (iOrdinal4 == 1) {
                    long j12 = d0tVar.f5282a;
                    j4i j4iVarU = afn0.u(new y3d(StaticColors.INSTANCE.m113getRed0d7_KjU()), d0tVar, str, str2, list, z4, z5, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
                    a4x a4xVarJ3 = kkb.J(d0tVar, dmr.r, dmr.g1);
                    a4x a4xVarJ4 = kkb.J(d0tVar, dmr.s, dmr.h1);
                    return new u1o0(j12, j4iVarU, new m3o0(qzb.c0(d0tVar), qzb.r0(d0tVar), a4xVarJ3, a4xVarJ4, a4xVarJ3.size() == 5 ? kkb.K(d0tVar, dmr.w) : "", a4xVarJ4.size() == 5 ? kkb.K(d0tVar, dmr.z) : "", kpb.R(d0tVar).f33307a, kpb.R(d0tVar).b, rqsVar.t, rqsVar.u, str3, kkb.L(StringsKt.toIntOrNull(kkb.K(d0tVar, dmr.u)), ctf0Var)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
                }
                if (iOrdinal4 == 2) {
                    long j13 = d0tVar.f5282a;
                    k4i k4iVarT = afn0.t(d0tVar, str, list, z4, z5, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
                    a4x a4xVarJ5 = kkb.J(d0tVar, dmr.r, dmr.g1);
                    a4x a4xVarJ6 = kkb.J(d0tVar, dmr.s, dmr.h1);
                    return new t1o0(j13, k4iVarT, new e3o0(qzb.c0(d0tVar), qzb.r0(d0tVar), a4xVarJ5, a4xVarJ6, a4xVarJ5.size() == 5 ? kkb.K(d0tVar, dmr.w) : "", a4xVarJ6.size() == 5 ? kkb.K(d0tVar, dmr.z) : "", str3, kkb.L(StringsKt.toIntOrNull(kkb.K(d0tVar, dmr.u)), ctf0Var), kpb.S(d0tVar), ctf0Var.k(R.string.live_new, new Object[i5])), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
                }
                if (iOrdinal4 == 3) {
                    long j14 = d0tVar.f5282a;
                    n0x n0xVar2 = new n0x(dtb.F(str));
                    l4i l4iVarS = afn0.s(null, d0tVar, str, "", ctf0Var.k(R.string.live_new, new Object[i5]), str2, list, z4, z5, true, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z2), kpb.f0(d0tVar, z));
                    a4x a4xVarJ7 = kkb.J(d0tVar, dmr.r, dmr.g1);
                    a4x a4xVarJ8 = kkb.J(d0tVar, dmr.s, dmr.h1);
                    return new s1o0(j14, l4iVarS, new w2o0(kpb.C(d0tVar), a4xVarJ7, a4xVarJ8, qzb.c0(d0tVar), qzb.r0(d0tVar), a4xVarJ7.size() == 5 ? kkb.K(d0tVar, dmr.w) : "", a4xVarJ8.size() == 5 ? kkb.K(d0tVar, dmr.z) : "", kkb.L(StringsKt.toIntOrNull(kkb.K(d0tVar, dmr.u)), ctf0Var)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var), n0xVar2);
                }
                if (iOrdinal4 != 4) {
                    t9f.b();
                    return null;
                }
                long j15 = d0tVar.f5282a;
                k4i k4iVarR = afn0.r(d0tVar, str, list, z4, z5, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z2), kpb.f0(d0tVar, z));
                a4x a4xVarJ9 = kkb.J(d0tVar, dmr.r, dmr.g1);
                a4x a4xVarJ10 = kkb.J(d0tVar, dmr.s, dmr.h1);
                return new r1o0(j15, k4iVarR, new o2o0(qzb.c0(d0tVar), qzb.r0(d0tVar), a4xVarJ9, a4xVarJ10, a4xVarJ9.size() == 5 ? kkb.K(d0tVar, dmr.w) : "", a4xVarJ10.size() == 5 ? kkb.K(d0tVar, dmr.z) : "", kkb.L(StringsKt.toIntOrNull(kkb.K(d0tVar, dmr.u)), ctf0Var), z11 ? ctf0Var.k(R.string.game_end, new Object[i5]) : str3, ctf0Var.k(R.string.live_new, new Object[i5]), kpb.C(d0tVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int i6 = i;
                int iOrdinal5 = v5l0Var.ordinal();
                if (iOrdinal5 == 0) {
                    long j16 = d0tVar.f5282a;
                    i4i i4iVarU2 = ibm0.u(d0tVar, str, str2, list, z4, z5, z2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
                    if (j3 == 40) {
                        i6 = 1;
                    }
                    pws0 pws0Var = new pws0(qzb.c0(d0tVar), kbc.U(d0tVar));
                    pws0 pws0Var2 = new pws0(qzb.r0(d0tVar), kbc.V(d0tVar));
                    lpm lpmVar = new lpm(opmVar, new hpm(0L, 3));
                    p0nVar = qzb.B0(d0tVar) ? new p0n(kpb.q0(d0tVar), fgm.b, date.getTime(), false, 24) : null;
                    if (i6 == 0) {
                        strX = kpb.X(d0tVar);
                    }
                    return new w1o0(j16, i4iVarU2, new d4o0(pws0Var, pws0Var2, lpmVar, p0nVar, strX), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
                }
                if (iOrdinal5 == 1) {
                    long j17 = d0tVar.f5282a;
                    j4i j4iVarY2 = ibm0.y(d0tVar, str, list, z4, z5, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
                    if (j3 == 40) {
                        i6 = 1;
                    }
                    qws0 qws0Var3 = new qws0(qzb.c0(d0tVar));
                    qws0 qws0Var4 = new qws0(qzb.r0(d0tVar));
                    p0nVar = qzb.B0(d0tVar) ? new p0n(kpb.q0(d0tVar), fgm.b, date.getTime(), false, 24) : null;
                    if (i6 == 0) {
                        strX = kpb.X(d0tVar);
                    }
                    return new a2o0(j17, j4iVarY2, new j5o0(qws0Var3, qws0Var4, p0nVar, strX, pem.f26861a), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
                }
                if (iOrdinal5 == 2) {
                    long j18 = d0tVar.f5282a;
                    k4i k4iVarX2 = ibm0.x(d0tVar, str, list, z4, z5, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
                    if (j3 == 40) {
                        i6 = 1;
                    }
                    rws0 rws0Var3 = new rws0(qzb.c0(d0tVar), kbc.U(d0tVar));
                    rws0 rws0Var4 = new rws0(qzb.r0(d0tVar), kbc.V(d0tVar));
                    p0n p0nVar3 = qzb.B0(d0tVar) ? new p0n(kpb.q0(d0tVar), fgm.b, date.getTime(), false, 24) : null;
                    if (i6 == 0) {
                        strX = kpb.X(d0tVar);
                    }
                    if (d0tVar.S && z2) {
                        p0nVar = new d2i();
                    }
                    return new z1o0(j18, k4iVarX2, new b5o0(p0nVar, p0nVar3, rws0Var3, rws0Var4, strX), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
                }
                if (iOrdinal5 == 3) {
                    int i7 = j3 == 40 ? 1 : i6;
                    long j19 = d0tVar.f5282a;
                    n0x n0xVar3 = new n0x(dtb.F(str));
                    if (i7 == 0) {
                        strX = kpb.X(d0tVar);
                    }
                    return new y1o0(j19, ibm0.w(d0tVar, str, strX, list, z4, z5, qzb.B0(d0tVar), str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new t4o0(new sws0(qzb.c0(d0tVar), kbc.U(d0tVar)), new sws0(qzb.r0(d0tVar), kbc.V(d0tVar)), new z1m(c2mVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var), n0xVar3);
                }
                if (iOrdinal5 != 4) {
                    t9f.b();
                    return null;
                }
                long j20 = d0tVar.f5282a;
                k4i k4iVarV2 = ibm0.v(d0tVar, str, str2, list, z4, z5, z2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
                if (j3 == 40) {
                    i6 = 1;
                }
                tws0 tws0Var3 = new tws0(qzb.c0(d0tVar), kbc.U(d0tVar));
                tws0 tws0Var4 = new tws0(qzb.r0(d0tVar), kbc.V(d0tVar));
                z1m z1mVar2 = new z1m(c2mVar);
                p0nVar = qzb.B0(d0tVar) ? new p0n(kpb.q0(d0tVar), fgm.b, date.getTime(), false, 24) : null;
                if (i6 == 0) {
                    strX = kpb.X(d0tVar);
                }
                return new x1o0(j20, k4iVarV2, new l4o0(z1mVar2, p0nVar, tws0Var3, tws0Var4, strX), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                int iOrdinal6 = v5l0Var.ordinal();
                if (iOrdinal6 == 0) {
                    long j21 = d0tVar.f5282a;
                    i4i i4iVarQ2 = afn0.q(d0tVar, str, list, z4, z5, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z2), kpb.f0(d0tVar, z));
                    dmr dmrVar = dmr.f6334a;
                    return new q1o0(j21, i4iVarQ2, new i2o0(qzb.c0(d0tVar), qzb.r0(d0tVar), kbc.U(d0tVar), kbc.V(d0tVar), b8k0.w(StringsKt__StringsKt.split$default(b8k0.K(d0tVar), new String[]{Separators.COMMA}, false, i, 6, null)), kpb.S(d0tVar), str3), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
                }
                if (iOrdinal6 == 1) {
                    long j22 = d0tVar.f5282a;
                    j4i j4iVarU2 = afn0.u(new y3d(StaticColors.INSTANCE.m113getRed0d7_KjU()), d0tVar, str, str2, list, z4, z5, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
                    dmr dmrVar2 = dmr.f6334a;
                    return new u1o0(j22, j4iVarU2, new o3o0(qzb.c0(d0tVar), qzb.r0(d0tVar), kpb.R(d0tVar).f33307a, kpb.R(d0tVar).b, rqsVar.t, rqsVar.u, b8k0.w(StringsKt__StringsKt.split$default(b8k0.K(d0tVar), new String[]{Separators.COMMA}, false, i, 6, null)), str3), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
                }
                if (iOrdinal6 == 2) {
                    int i8 = i;
                    long j23 = d0tVar.f5282a;
                    k4i k4iVarT2 = afn0.t(d0tVar, str, list, z4, z5, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
                    dmr dmrVar3 = dmr.f6334a;
                    return new t1o0(j23, k4iVarT2, new g3o0(qzb.c0(d0tVar), qzb.r0(d0tVar), kbc.U(d0tVar), kbc.V(d0tVar), kpb.R(d0tVar).f33307a, kpb.R(d0tVar).b, rqsVar.t, rqsVar.u, b8k0.w(StringsKt__StringsKt.split$default(b8k0.K(d0tVar), new String[]{Separators.COMMA}, false, i8, 6, null)), str3, ctf0Var.k(R.string.live_new, new Object[i8])), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
                }
                if (iOrdinal6 == 3) {
                    long j24 = d0tVar.f5282a;
                    n0x n0xVar4 = new n0x(dtb.F(str));
                    String strK = ctf0Var.k(R.string.live_new, new Object[0]);
                    boolean zB0 = kpb.b0(d0tVar, z);
                    boolean zD0 = kpb.d0(d0tVar, z);
                    boolean zA0 = kpb.a0(d0tVar, z, z2);
                    if (z8 && rqsVar.j != 0) {
                        long jR0 = kpb.r0(d0tVar);
                        fgm fgmVar = fgm.f9498a;
                        p0nVar = new e4i(24, jR0, date.getTime(), false);
                    }
                    l4i l4iVarS2 = afn0.s(p0nVar, d0tVar, str, "", strK, str2, list, z4, z5, true, zB0, zD0, zA0, kpb.f0(d0tVar, z));
                    dmr dmrVar4 = dmr.f6334a;
                    return new s1o0(j24, l4iVarS2, new y2o0(qzb.c0(d0tVar), qzb.r0(d0tVar), kbc.U(d0tVar), kbc.V(d0tVar), b8k0.w(StringsKt__StringsKt.split$default(b8k0.K(d0tVar), new String[]{Separators.COMMA}, false, 0, 6, null)), kpb.C(d0tVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var), n0xVar4);
                }
                if (iOrdinal6 != 4) {
                    t9f.b();
                    return null;
                }
                long j25 = d0tVar.f5282a;
                String strA = str3;
                k4i k4iVarR2 = afn0.r(d0tVar, str, list, z4, z5, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z2), kpb.f0(d0tVar, z));
                dmr dmrVar5 = dmr.f6334a;
                int i9 = i;
                a4x a4xVarW = b8k0.w(StringsKt__StringsKt.split$default(b8k0.K(d0tVar), new String[]{Separators.COMMA}, false, i9, 6, null));
                String strC0 = qzb.c0(d0tVar);
                String strR0 = qzb.r0(d0tVar);
                c280 c280VarU = kbc.U(d0tVar);
                c280 c280VarV = kbc.V(d0tVar);
                if (z11) {
                    strA = ctf0Var.b.a(R.string.game_end, Arrays.copyOf(new Object[i9], i9));
                }
                return new r1o0(j25, k4iVarR2, new q2o0(strC0, strR0, c280VarU, c280VarV, a4xVarW, kpb.C(d0tVar), strA, ctf0Var.k(R.string.live_new, new Object[i9])), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
            default:
                t9f.b();
                return null;
        }
    }

    public static BiometricPrompt.CryptoObject W(q58 q58Var) {
        KeyAgreement keyAgreement;
        PresentationSession presentationSession;
        IdentityCredential identityCredential;
        if (q58Var == null) {
            return null;
        }
        Cipher cipher = (Cipher) q58Var.c;
        if (cipher != null) {
            return ia3.c(cipher);
        }
        java.security.Signature signature = (java.security.Signature) q58Var.b;
        if (signature != null) {
            return ia3.b(signature);
        }
        Mac mac = (Mac) q58Var.d;
        if (mac != null) {
            return ia3.d(mac);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && (identityCredential = (IdentityCredential) q58Var.f) != null) {
            return e7.a(identityCredential);
        }
        if (i >= 33 && (presentationSession = (PresentationSession) q58Var.g) != null) {
            return f7.a(presentationSession);
        }
        if (i >= 36) {
            if ((i < 36 ? 100000 * i : Build.VERSION.SDK_INT_FULL) >= 3600001 && (keyAgreement = (KeyAgreement) q58Var.e) != null) {
                return h7.a(keyAgreement);
            }
        }
        if (i < 35) {
            return null;
        }
        long j = q58Var.f28138a;
        if (j != 0) {
            return qef.a(j);
        }
        return null;
    }

    public static final void a(mm40 mm40Var, final a4x a4xVar, xwb xwbVar, fet fetVar, final int i) {
        final mm40 mm40Var2;
        final xwb xwbVar2;
        yfe0 yfe0VarU;
        Function2 function2;
        final xwb xwbVar3;
        final mm40 mm40Var3;
        a4xVar.getClass();
        fetVar.g0(1580151664);
        int i2 = i | 6 | (fetVar.g(a4xVar) ? 32 : 16) | 128;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                pz40 pz40Var = s6t0.f31722a;
                long primary = s6t0.b().f33626a.getPrimary();
                zcl zclVar = qmk.f28987a;
                xwbVar3 = new xwb(primary, yk5.n(q3d.j(new y3d(y3d.c(0.3f, s6t0.b().f33626a.getPrimary())), new y3d(y3d.f)), 0.0f, 0.0f, 14), s6t0.b().f33626a.getPrimary(), s6t0.b().f33626a.getPrimary(), g1t0.j(), s6t0.b().f33626a.getTextPrimary(), s6t0.b().f33626a.getSeparator(), qjj.K(0.0f, new float[]{10.0f, 10.0f}), s6t0.b().f33626a.getSecondaryButtonBackground(), g1t0.m(), s6t0.b().f33626a.getTextPrimary(), s6t0.b().f33626a.getBackgroundContent());
                mm40Var3 = jm40.b;
            } else {
                fetVar.X();
                mm40Var3 = mm40Var;
                xwbVar3 = xwbVar;
            }
            fetVar.s();
            if (a4xVar.isEmpty()) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                }
                final xwb xwbVar4 = xwbVar3;
                final byte b = 0;
                function2 = new Function2(mm40Var3, a4xVar, xwbVar4, i, b) { // from class: a.qwb

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ byte f29427a;
                    public final /* synthetic */ mm40 b;
                    public final /* synthetic */ a4x c;
                    public final /* synthetic */ xwb d;

                    {
                        this.f29427a = b;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b2 = this.f29427a;
                        fet fetVar2 = (fet) obj;
                        ((Integer) obj2).getClass();
                        switch (b2) {
                            case 0:
                                wwb.a(this.b, this.c, this.d, fetVar2, x8x.L(1));
                                break;
                            default:
                                wwb.a(this.b, this.c, this.d, fetVar2, x8x.L(1));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            } else {
                mm40 mm40Var4 = mm40Var3;
                final rah0 rah0VarT = wha0.T(fetVar);
                Object objP = fetVar.P();
                cl5 cl5Var = ukd.f35823a;
                if (objP == cl5Var) {
                    objP = androidx.compose.runtime.e.e(null);
                    fetVar.o0(objP);
                }
                final pz40 pz40Var2 = (pz40) objP;
                Object objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = androidx.compose.runtime.e.a(1.0f);
                    fetVar.o0(objP2);
                }
                final agk0 agk0Var = (agk0) objP2;
                final g9q0 g9q0VarN = pym0.n(fetVar);
                Iterator<E> it = a4xVar.iterator();
                if (!it.hasNext()) {
                    itt0.a();
                    return;
                }
                int i3 = ((uoa0) it.next()).b;
                while (it.hasNext()) {
                    int i4 = ((uoa0) it.next()).b;
                    if (i3 > i4) {
                        i3 = i4;
                    }
                }
                Iterator<E> it2 = a4xVar.iterator();
                if (!it2.hasNext()) {
                    itt0.a();
                    return;
                }
                int i5 = ((uoa0) it2.next()).b;
                while (it2.hasNext()) {
                    int i6 = ((uoa0) it2.next()).b;
                    if (i5 < i6) {
                        i5 = i6;
                    }
                }
                int i7 = i5 - i3;
                if (i7 < 1) {
                    i7 = 1;
                }
                int i8 = i7 / 5;
                if (i8 < 1) {
                    i8 = 1;
                }
                List listL0 = CollectionsKt.L0(l1e0.m(i8, new IntRange(i3, i5, 1)));
                if (((Number) CollectionsKt.d0(listL0)).intValue() < i5) {
                    listL0 = CollectionsKt.r0(listL0, Integer.valueOf(((Number) CollectionsKt.d0(listL0)).intValue() + i8));
                }
                final List list = listL0;
                final int iIntValue = ((Number) CollectionsKt.U(list)).intValue();
                float fIntValue = ((Number) CollectionsKt.d0(list)).intValue() - iIntValue;
                final float f = fIntValue < 1.0f ? 1.0f : fIntValue;
                nnw0.g(i120.Q(o7k0.d(mm40Var4, 1.0f), xwbVar3.l, jd8.n), null, false, u1c.M(-1611415226, new xdr() { // from class: a.rwb
                    @Override // a.xdr
                    public final Object F(Object obj, Object obj2, Object obj3) {
                        Object swbVar;
                        shd shdVar;
                        float f2;
                        lr8 lr8Var = (lr8) obj;
                        fet fetVar2 = (fet) obj2;
                        int iIntValue2 = ((Integer) obj3).intValue();
                        lr8Var.getClass();
                        if ((iIntValue2 & 6) == 0) {
                            iIntValue2 |= fetVar2.g(lr8Var) ? 4 : 2;
                        }
                        if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                            final float fC = (lr8Var.c() - 62.0f) - 40.0f;
                            final float fD = lr8Var.d() - 36.0f;
                            n0q n0qVar = o7k0.c;
                            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
                            int iHashCode = Long.hashCode(fetVar2.T);
                            bh90 bh90VarM = fetVar2.m();
                            mm40 mm40VarC0 = kbc.c0(fetVar2, n0qVar);
                            mkd.c0.getClass();
                            fetVar2.i0();
                            boolean z = fetVar2.S;
                            pcy pcyVar = e7z.u1;
                            if (z) {
                                fetVar2.l(pcyVar);
                            } else {
                                fetVar2.r0();
                            }
                            shd shdVar2 = gqw0.x;
                            jpm0.o(fetVar2, thg0VarA, shdVar2);
                            shd shdVar3 = gqw0.w;
                            jpm0.o(fetVar2, bh90VarM, shdVar3);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            shd shdVar4 = gqw0.y;
                            jpm0.o(fetVar2, numValueOf, shdVar4);
                            jpm0.n(fetVar2);
                            shd shdVar5 = gqw0.v;
                            jpm0.o(fetVar2, mm40VarC0, shdVar5);
                            final xwb xwbVar5 = xwbVar3;
                            long j = xwbVar5.l;
                            ljc ljcVar = jd8.n;
                            jm40 jm40Var = jm40.b;
                            mm40 mm40VarC = o7k0.c(o7k0.s(i120.Q(jm40Var, j, ljcVar), 36.0f), 1.0f);
                            boolean zD = fetVar2.d(fC) | fetVar2.g(xwbVar5);
                            final List list2 = list;
                            boolean zI = zD | fetVar2.i(list2);
                            final int i9 = iIntValue;
                            boolean zE = zI | fetVar2.e(i9);
                            float f3 = f;
                            boolean zD2 = zE | fetVar2.d(f3);
                            final g9q0 g9q0Var = g9q0VarN;
                            boolean zG = zD2 | fetVar2.g(g9q0Var);
                            Object objP3 = fetVar2.P();
                            cl5 cl5Var2 = ukd.f35823a;
                            if (zG || objP3 == cl5Var2) {
                                shdVar = shdVar5;
                                swbVar = new swb(fC, xwbVar5, list2, i9, f3, g9q0Var);
                                f2 = f3;
                                fetVar2.o0(swbVar);
                            } else {
                                f2 = f3;
                                shdVar = shdVar5;
                                swbVar = objP3;
                            }
                            p8a.k(mm40VarC, (Function1) swbVar, fetVar2, 0);
                            agk0 agk0Var2 = agk0Var;
                            final float fL = agk0Var2.l() * 52.0f;
                            final float f4 = f2;
                            x7z x7zVar = new x7z(1.0f, true);
                            Boolean bool = Boolean.FALSE;
                            boolean zG2 = fetVar2.g(xwbVar5);
                            Object objP4 = fetVar2.P();
                            if (zG2 || objP4 == cl5Var2) {
                                objP4 = new i54(xwbVar5, agk0Var2);
                                fetVar2.o0(objP4);
                            }
                            mm40 mm40VarA = fnn0.a(x7zVar, bool, (PointerInputEventHandler) objP4);
                            final rah0 rah0Var = rah0VarT;
                            mm40 mm40VarP = wha0.P(mm40VarA, rah0Var, false, 14);
                            Float fValueOf = Float.valueOf(agk0Var2.l());
                            boolean zD3 = fetVar2.d(fL);
                            final a4x a4xVar2 = a4xVar;
                            boolean zG3 = zD3 | fetVar2.g(a4xVar2);
                            Object objP5 = fetVar2.P();
                            final pz40 pz40Var3 = pz40Var2;
                            if (zG3 || objP5 == cl5Var2) {
                                objP5 = new vwb(fL, a4xVar2, pz40Var3);
                                fetVar2.o0(objP5);
                            }
                            mm40 mm40VarB = fnn0.b(mm40VarP, a4xVar2, fValueOf, (PointerInputEventHandler) objP5);
                            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                            int iHashCode2 = Long.hashCode(fetVar2.T);
                            bh90 bh90VarM2 = fetVar2.m();
                            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarB);
                            fetVar2.i0();
                            if (fetVar2.S) {
                                fetVar2.l(pcyVar);
                            } else {
                                fetVar2.r0();
                            }
                            jpm0.o(fetVar2, tj30VarC, shdVar2);
                            jpm0.o(fetVar2, bh90VarM2, shdVar3);
                            vqd.u(iHashCode2, fetVar2, shdVar4, fetVar2);
                            jpm0.o(fetVar2, mm40VarC1, shdVar);
                            final float size = a4xVar2.size() * fL;
                            mm40 mm40VarS = o7k0.s(o7k0.c(jm40Var, 1.0f), size);
                            boolean zD4 = fetVar2.d(size) | fetVar2.d(fC) | fetVar2.d(fL) | fetVar2.g(xwbVar5) | fetVar2.i(list2) | fetVar2.e(i9) | fetVar2.d(f4) | fetVar2.g(a4xVar2) | fetVar2.g(g9q0Var) | fetVar2.d(fD) | fetVar2.g(rah0Var);
                            Object objP6 = fetVar2.P();
                            if (zD4 || objP6 == cl5Var2) {
                                Function1 function1 = new Function1() { // from class: a.twb
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        xwb xwbVar6;
                                        int i10;
                                        float f5;
                                        float f6;
                                        float f7;
                                        int i11;
                                        ArrayList arrayList;
                                        float f8;
                                        float f9;
                                        int i12;
                                        int i13;
                                        xwb xwbVar7;
                                        ArrayList arrayList2;
                                        long j2;
                                        float f10;
                                        xwb xwbVar8;
                                        w03 w03VarA;
                                        fhl fhlVar = (fhl) obj4;
                                        fhlVar.getClass();
                                        float fW0 = fhlVar.w0(size);
                                        float fW1 = fhlVar.w0(fC);
                                        float fW2 = fhlVar.w0(fL);
                                        float fW3 = fhlVar.w0(40.0f);
                                        Iterator it3 = list2.iterator();
                                        while (true) {
                                            boolean zHasNext = it3.hasNext();
                                            xwbVar6 = xwbVar5;
                                            i10 = i9;
                                            f5 = f4;
                                            f6 = 0.0f;
                                            if (!zHasNext) {
                                                break;
                                            }
                                            float fIntValue2 = (((((Number) it3.next()).intValue() - i10) / f5) * fW1) + fW3;
                                            long j3 = xwbVar6.g;
                                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntValue2)) & 4294967295L);
                                            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fW0)) << 32) | (((long) Float.floatToRawIntBits(fIntValue2)) & 4294967295L);
                                            zcl zclVar2 = qmk.f28987a;
                                            fhl.Q(fhlVar, j3, jFloatToRawIntBits, jFloatToRawIntBits2, fhlVar.w0(1.0f), 0, null, 496);
                                        }
                                        a4x a4xVar3 = a4xVar2;
                                        ArrayList arrayList3 = new ArrayList(r3d.q(a4xVar3, 10));
                                        Iterator<E> it4 = a4xVar3.iterator();
                                        int i14 = 0;
                                        while (true) {
                                            float f11 = 2.0f;
                                            if (it4.hasNext()) {
                                                Object next = it4.next();
                                                int i15 = i14 + 1;
                                                if (i14 < 0) {
                                                    q3d.p();
                                                    throw null;
                                                }
                                                arrayList3.add(new ne60((((long) Float.floatToRawIntBits((fW2 / 2.0f) + (i14 * fW2))) << 32) | (((long) Float.floatToRawIntBits((((((uoa0) next).b - i10) / f5) * fW1) + fW3)) & 4294967295L)));
                                                i14 = i15;
                                                f6 = f6;
                                                a4xVar3 = a4xVar3;
                                            } else {
                                                float f12 = f6;
                                                a4x a4xVar4 = a4xVar3;
                                                int i16 = 1;
                                                if (arrayList3.size() > 1) {
                                                    int size2 = arrayList3.size();
                                                    if (size2 < 2) {
                                                        w03VarA = z03.a();
                                                        f7 = 2.0f;
                                                        xwbVar8 = xwbVar6;
                                                        i11 = 1;
                                                    } else {
                                                        int i17 = size2 - 1;
                                                        float[] fArr = new float[i17];
                                                        float[] fArr2 = new float[i17];
                                                        int i18 = 0;
                                                        while (i18 < i17) {
                                                            int i19 = i16;
                                                            int i20 = i18 + 1;
                                                            fArr2[i18] = Float.intBitsToFloat((int) (((ne60) arrayList3.get(i20)).f23370a >> 32)) - Float.intBitsToFloat((int) (((ne60) arrayList3.get(i18)).f23370a >> 32));
                                                            fArr[i18] = (Float.intBitsToFloat((int) (((ne60) arrayList3.get(i20)).f23370a & 4294967295L)) - Float.intBitsToFloat((int) (((ne60) arrayList3.get(i18)).f23370a & 4294967295L))) / fArr2[i18];
                                                            i18 = i20;
                                                            i16 = i19;
                                                            xwbVar6 = xwbVar6;
                                                            f11 = f11;
                                                            i17 = i17;
                                                        }
                                                        f7 = f11;
                                                        xwbVar8 = xwbVar6;
                                                        i11 = i16;
                                                        float[] fArr3 = new float[size2];
                                                        for (int i21 = i11; i21 < i17; i21++) {
                                                            int i22 = i21 - 1;
                                                            float f13 = fArr[i22];
                                                            float f14 = fArr[i21];
                                                            if (f13 * f14 <= f12) {
                                                                fArr3[i21] = f12;
                                                            } else {
                                                                float f15 = fArr2[i21];
                                                                float f16 = fArr2[i22];
                                                                fArr3[i21] = Math.min(Math.abs(fArr[i22]) * f7, Math.min(Math.abs(fArr[i21]) * f7, Math.abs(((f14 * f16) + (f13 * f15)) / (f16 + f15)))) * Math.signum(f14);
                                                            }
                                                        }
                                                        if (size2 > 2) {
                                                            float f17 = fArr[0];
                                                            float f18 = fArr2[0];
                                                            float f19 = fArr2[i11] + f18;
                                                            float f20 = (((f18 / f19) + 1.0f) * f17) - ((fArr[i11] * f18) / f19);
                                                            fArr3[0] = f20 * f17 <= f12 ? f12 : Math.min(Math.abs(f20), Math.abs(fArr[0]) * f7) * Math.signum(f17);
                                                            int i23 = size2 - 2;
                                                            float f21 = fArr[i23];
                                                            float f22 = fArr2[i23];
                                                            int i24 = size2 - 3;
                                                            float f23 = fArr2[i24] + f22;
                                                            float f24 = (((f22 / f23) + 1.0f) * f21) - ((fArr[i24] * f22) / f23);
                                                            fArr3[i17] = f24 * f21 <= f12 ? f12 : Math.min(Math.abs(f24), Math.abs(fArr[i23]) * f7) * Math.signum(f21);
                                                        } else {
                                                            fArr3[0] = fArr[0];
                                                            fArr3[i11] = fArr[0];
                                                        }
                                                        w03VarA = z03.a();
                                                        w03VarA.f(Float.intBitsToFloat((int) (((ne60) arrayList3.get(0)).f23370a >> 32)), Float.intBitsToFloat((int) (((ne60) arrayList3.get(0)).f23370a & 4294967295L)));
                                                        int i25 = 0;
                                                        while (i25 < i17) {
                                                            float f25 = fArr2[i25];
                                                            float f26 = f25 / 3.0f;
                                                            float fIntBitsToFloat = Float.intBitsToFloat((int) (((ne60) arrayList3.get(i25)).f23370a >> 32)) + f26;
                                                            ArrayList arrayList4 = arrayList3;
                                                            float fIntBitsToFloat2 = ((fArr3[i25] * f25) / 3.0f) + Float.intBitsToFloat((int) (((ne60) arrayList3.get(i25)).f23370a & 4294967295L));
                                                            i25++;
                                                            w03VarA.f38329a.cubicTo(fIntBitsToFloat, fIntBitsToFloat2, Float.intBitsToFloat((int) (((ne60) arrayList4.get(i25)).f23370a >> 32)) - f26, Float.intBitsToFloat((int) (((ne60) arrayList4.get(i25)).f23370a & 4294967295L)) - ((f25 * fArr3[i25]) / 3.0f), Float.intBitsToFloat((int) (((ne60) arrayList4.get(i25)).f23370a >> 32)), Float.intBitsToFloat((int) (((ne60) arrayList4.get(i25)).f23370a & 4294967295L)));
                                                            arrayList3 = arrayList4;
                                                        }
                                                    }
                                                    arrayList = arrayList3;
                                                    w03 w03Var = w03VarA;
                                                    w03 w03VarA2 = z03.a();
                                                    w03.a(w03VarA2, w03Var);
                                                    float f27 = fW3 + fW1;
                                                    w03VarA2.e(Float.intBitsToFloat((int) (((ne60) CollectionsKt.d0(arrayList)).f23370a >> 32)), f27);
                                                    w03VarA2.e(Float.intBitsToFloat((int) (((ne60) CollectionsKt.U(arrayList)).f23370a >> 32)), f27);
                                                    w03VarA2.c();
                                                    xwbVar6 = xwbVar8;
                                                    fhl.K0(fhlVar, w03VarA2, xwbVar6.b, 0.0f, null, 60);
                                                    fhl.C0(fhlVar, w03Var, xwbVar6.f41602a, 0.0f, new vtm0(fhlVar.w0(f7), 0.0f, 1, 1, null, 18), 52);
                                                } else {
                                                    f7 = 2.0f;
                                                    i11 = 1;
                                                    arrayList = arrayList3;
                                                }
                                                int size3 = a4xVar4.size();
                                                float f28 = 6.0f;
                                                if (size3 >= 0) {
                                                    int i26 = 0;
                                                    while (true) {
                                                        float f29 = i26 * fW2;
                                                        zcl zclVar3 = qmk.f28987a;
                                                        int i27 = i26;
                                                        float f30 = fW3 + fW1;
                                                        f8 = fW1;
                                                        f9 = fW2;
                                                        i12 = i11;
                                                        xwbVar7 = xwbVar6;
                                                        i13 = 0;
                                                        arrayList2 = arrayList;
                                                        fhl.Q(fhlVar, xwbVar6.g, (((long) Float.floatToRawIntBits(f29)) << 32) | (((long) Float.floatToRawIntBits(f30)) & 4294967295L), (((long) Float.floatToRawIntBits(f29)) << 32) | (((long) Float.floatToRawIntBits(f30 + fhlVar.w0(f28))) & 4294967295L), fhlVar.w0(1.0f), 0, null, 496);
                                                        if (i27 == size3) {
                                                            break;
                                                        }
                                                        i26 = i27 + 1;
                                                        fW1 = f8;
                                                        xwbVar6 = xwbVar7;
                                                        f28 = 6.0f;
                                                        fW2 = f9;
                                                        arrayList = arrayList2;
                                                        i11 = i12;
                                                    }
                                                } else {
                                                    f8 = fW1;
                                                    f9 = fW2;
                                                    i12 = i11;
                                                    i13 = 0;
                                                    xwbVar7 = xwbVar6;
                                                    arrayList2 = arrayList;
                                                }
                                                Iterator<E> it5 = a4xVar4.iterator();
                                                int i28 = i13;
                                                while (true) {
                                                    boolean zHasNext2 = it5.hasNext();
                                                    g9q0 g9q0Var2 = g9q0Var;
                                                    if (zHasNext2) {
                                                        Object next2 = it5.next();
                                                        int i29 = i28 + 1;
                                                        if (i28 < 0) {
                                                            q3d.p();
                                                            throw null;
                                                        }
                                                        zcl zclVar4 = qmk.f28987a;
                                                        float fW4 = fhlVar.w0(8.0f) + (f9 / f7) + (i28 * f9);
                                                        a9q0 a9q0VarB = g9q0.b(g9q0Var2, new j83(String.valueOf(((uoa0) next2).f36003a)), xwbVar7.e, 0, false, 0, 0L, null, null, null, 2044);
                                                        float f31 = fW3 + f8;
                                                        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fW4)) << 32) | (((long) Float.floatToRawIntBits(fhlVar.w0(20.0f) + f31)) & 4294967295L);
                                                        nr nrVarA0 = fhlVar.A0();
                                                        long jP = nrVarA0.p();
                                                        nrVarA0.i().l();
                                                        try {
                                                            ((fvt0) nrVarA0.b).y(40.0f, jFloatToRawIntBits3);
                                                            long j4 = xwbVar7.f;
                                                            float f32 = fW4 - (((int) (a9q0VarB.c >> 32)) / f7);
                                                            float fW5 = f31 + fhlVar.w0(20.0f);
                                                            long jFloatToRawIntBits4 = Float.floatToRawIntBits(f32);
                                                            fhlVar = fhlVar;
                                                            v2n0.o(fhlVar, a9q0VarB, j4, (((long) Float.floatToRawIntBits(fW5)) & 4294967295L) | (jFloatToRawIntBits4 << 32), 248);
                                                            defpackage.c.g(nrVarA0, jP);
                                                            i28 = i29;
                                                        } catch (Throwable th) {
                                                            defpackage.c.g(nrVarA0, jP);
                                                            throw th;
                                                        }
                                                    } else {
                                                        Iterator it6 = arrayList2.iterator();
                                                        int i30 = i13;
                                                        while (true) {
                                                            boolean zHasNext3 = it6.hasNext();
                                                            pz40 pz40Var4 = pz40Var3;
                                                            if (!zHasNext3) {
                                                                Integer num = (Integer) pz40Var4.getValue();
                                                                if (num != null) {
                                                                    int iIntValue3 = num.intValue();
                                                                    long j5 = ((ne60) arrayList2.get(iIntValue3)).f23370a;
                                                                    uoa0 uoa0Var = (uoa0) a4xVar4.get(iIntValue3);
                                                                    long jC = y3d.c(0.5f, xwbVar7.f41602a);
                                                                    int i31 = (int) (j5 >> 32);
                                                                    long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i31))) << 32) | (((long) Float.floatToRawIntBits(fW3)) & 4294967295L);
                                                                    long jFloatToRawIntBits6 = Float.floatToRawIntBits(Float.intBitsToFloat(i31));
                                                                    long jFloatToRawIntBits7 = Float.floatToRawIntBits(fW3 + f8);
                                                                    zcl zclVar5 = qmk.f28987a;
                                                                    fhl.Q(fhlVar, jC, jFloatToRawIntBits5, (jFloatToRawIntBits6 << 32) | (jFloatToRawIntBits7 & 4294967295L), fhlVar.w0(1.0f), 0, xwbVar7.h, 464);
                                                                    a9q0 a9q0VarB2 = g9q0.b(g9q0Var2, new j83(String.valueOf(uoa0Var.b)), xwbVar7.j, 0, false, 0, 0L, null, null, null, 2044);
                                                                    float fW6 = fhlVar.w0(4.0f);
                                                                    long j6 = a9q0VarB2.c;
                                                                    float f33 = (fW6 * 4.0f) + ((int) (j6 >> 32));
                                                                    float f34 = fW6 * f7;
                                                                    float f35 = ((int) (j6 & 4294967295L)) + f34;
                                                                    float fW7 = (fW3 - f35) - fhlVar.w0(8.0f);
                                                                    float fW8 = fhlVar.w0(fD);
                                                                    float fL2 = rah0Var.f30133a.l();
                                                                    float fC2 = l1e0.c(Float.intBitsToFloat(i31) - (f33 / f7), fhlVar.w0(4.0f) + fL2, ((fL2 + fW8) - f33) - fhlVar.w0(4.0f));
                                                                    long j7 = xwbVar7.i;
                                                                    long jFloatToRawIntBits8 = (((long) Float.floatToRawIntBits(fC2)) << 32) | (((long) Float.floatToRawIntBits(fW7)) & 4294967295L);
                                                                    long jFloatToRawIntBits9 = (((long) Float.floatToRawIntBits(f33)) << 32) | (((long) Float.floatToRawIntBits(f35)) & 4294967295L);
                                                                    float fW9 = fhlVar.w0(4.0f);
                                                                    xwb xwbVar9 = xwbVar7;
                                                                    long jFloatToRawIntBits10 = (((long) Float.floatToRawIntBits(fW9)) << 32) | (((long) Float.floatToRawIntBits(fW9)) & 4294967295L);
                                                                    fhl fhlVar2 = fhlVar;
                                                                    fhl.o0(fhlVar2, j7, jFloatToRawIntBits8, jFloatToRawIntBits9, jFloatToRawIntBits10, null, 240);
                                                                    v2n0.o(fhlVar2, a9q0VarB2, xwbVar9.k, (((long) Float.floatToRawIntBits(fC2 + f34)) << 32) | (((long) Float.floatToRawIntBits(fW7 + fW6)) & 4294967295L), 248);
                                                                    w03 w03VarA3 = z03.a();
                                                                    float f36 = fW7 + f35;
                                                                    w03VarA3.f(Float.intBitsToFloat(i31) - fhlVar2.w0(4.0f), f36);
                                                                    w03VarA3.e(fhlVar2.w0(4.0f) + Float.intBitsToFloat(i31), f36);
                                                                    w03VarA3.e(Float.intBitsToFloat(i31), fhlVar2.w0(4.0f) + f36);
                                                                    w03VarA3.c();
                                                                    fhl.C0(fhlVar2, w03VarA3, xwbVar9.i, 0.0f, null, 60);
                                                                }
                                                                return Unit.f46060a;
                                                            }
                                                            Object next3 = it6.next();
                                                            int i32 = i30 + 1;
                                                            if (i30 < 0) {
                                                                q3d.p();
                                                                throw null;
                                                            }
                                                            long j8 = ((ne60) next3).f23370a;
                                                            Integer num2 = (Integer) pz40Var4.getValue();
                                                            if (((num2 != null && i30 == num2.intValue()) ? i12 : i13) != 0) {
                                                                f10 = 6.0f;
                                                                j2 = j8;
                                                                fhl.O(fhlVar, new ttd0(q3d.j(new y3d(y3d.c(0.4f, xwbVar7.c)), new y3d(y3d.f)), j8, fhlVar.w0(6.0f) * 3.0f), fhlVar.w0(6.0f) * 3.0f, j2, null, 120);
                                                            } else {
                                                                j2 = j8;
                                                                f10 = 6.0f;
                                                            }
                                                            float fW10 = fhlVar.w0(f10);
                                                            long j9 = j2;
                                                            fhl.E(fhlVar, xwbVar7.c, fW10, j9, 0.0f, null, 120);
                                                            fhl.E(fhlVar, xwbVar7.d, fW10, j9, 0.0f, new vtm0(fhlVar.w0(0.0f), 0.0f, 0, 0, null, 30), 104);
                                                            i30 = i32;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                };
                                fetVar2.o0(function1);
                                objP6 = function1;
                            }
                            p8a.k(mm40VarS, (Function1) objP6, fetVar2, 0);
                            fetVar2.r(true);
                            fetVar2.r(true);
                        } else {
                            fetVar2.X();
                        }
                        return Unit.f46060a;
                    }
                }, fetVar), fetVar, 3072, 6);
                xwbVar2 = xwbVar3;
                mm40Var2 = mm40Var4;
            }
            yfe0VarU.d = function2;
        }
        fetVar.X();
        mm40Var2 = mm40Var;
        xwbVar2 = xwbVar;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final byte b2 = 1;
            function2 = new Function2(mm40Var2, a4xVar, xwbVar2, i, b2) { // from class: a.qwb

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ byte f29427a;
                public final /* synthetic */ mm40 b;
                public final /* synthetic */ a4x c;
                public final /* synthetic */ xwb d;

                {
                    this.f29427a = b2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = this.f29427a;
                    fet fetVar2 = (fet) obj;
                    ((Integer) obj2).getClass();
                    switch (b3) {
                        case 0:
                            wwb.a(this.b, this.c, this.d, fetVar2, x8x.L(1));
                            break;
                        default:
                            wwb.a(this.b, this.c, this.d, fetVar2, x8x.L(1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    public static final void b(mm40 mm40Var, l7m0 l7m0Var, final f3d f3dVar, boolean z, final Function0 function0, final Function0 function1, fet fetVar, int i) {
        int i2;
        l7m0Var.getClass();
        function0.getClass();
        function1.getClass();
        fetVar.g0(363223087);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(f3dVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function1) ? 131072 : 65536;
        }
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            boolean z2 = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new y1d(f3dVar, b2);
                fetVar.o0(objP);
            }
            mm40 mm40VarW = o050.W(rq8.K(mm40VarD, (Function1) objP));
            zcl zclVar = qmk.f28987a;
            ozb.g(o7k0.e(mm40VarW, 56.0f), null, null, u1c.M(177359466, new xdr() { // from class: a.g2d
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b3 = b;
                    cl5 cl5Var = ukd.f35823a;
                    f3d f3dVar2 = f3dVar;
                    switch (b3) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                boolean zG = fetVar2.g(f3dVar2);
                                Object objP2 = fetVar2.P();
                                if (zG || objP2 == cl5Var) {
                                    objP2 = new s82(f3dVar2, (byte) 3);
                                    fetVar2.o0(objP2);
                                }
                                ozb.h(jm40.b, 0L, 0L, 0L, (Function0) objP2, function0, y860.f42182a, fetVar2, 1572870);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                boolean zG2 = fetVar3.g(f3dVar2);
                                Object objP3 = fetVar3.P();
                                if (zG2 || objP3 == cl5Var) {
                                    objP3 = new s82(f3dVar2, (byte) 2);
                                    fetVar3.o0(objP3);
                                }
                                ozb.h(jm40.b, 0L, 0L, 0L, (Function0) objP3, function0, y860.b, fetVar3, 1572870);
                            } else {
                                fetVar3.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(-1158014263, new l4m(z, f3dVar, l7m0Var), fetVar), u1c.M(1801579304, new xdr() { // from class: a.g2d
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b3 = b2;
                    cl5 cl5Var = ukd.f35823a;
                    f3d f3dVar2 = f3dVar;
                    switch (b3) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                boolean zG = fetVar2.g(f3dVar2);
                                Object objP2 = fetVar2.P();
                                if (zG || objP2 == cl5Var) {
                                    objP2 = new s82(f3dVar2, (byte) 3);
                                    fetVar2.o0(objP2);
                                }
                                ozb.h(jm40.b, 0L, 0L, 0L, (Function0) objP2, function1, y860.f42182a, fetVar2, 1572870);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                boolean zG2 = fetVar3.g(f3dVar2);
                                Object objP3 = fetVar3.P();
                                if (zG2 || objP3 == cl5Var) {
                                    objP3 = new s82(f3dVar2, (byte) 2);
                                    fetVar3.o0(objP3);
                                }
                                ozb.h(jm40.b, 0L, 0L, 0L, (Function0) objP3, function1, y860.b, fetVar3, 1572870);
                            } else {
                                fetVar3.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, 224256);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ig2((Object) mm40Var, (Object) l7m0Var, (Object) f3dVar, z, (Object) function0, (wdr) function1, i, (byte) 6);
        }
    }

    public static final void c(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-771947357);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            float fH0 = lgb.h0(fetVar);
            zcl zclVar = qmk.f28987a;
            float f = 168.0f + fH0;
            m0x0.d(null, f, ijg.j, ijg.l, false, 14.0f, null, 0L, 0.0f, null, null, u1c.M(1736979670, new lkb(l7m0Var, f, 104.0f + fH0, function1, (byte) 2), fetVar), u1c.M(-192692208, new kzh0(l7m0Var, function1, b), fetVar), fetVar, 24576, 432, 1985);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new quh(l7m0Var, function1, i, (byte) 26);
        }
    }

    public static final void d(Function0 function0, boolean z, boolean z2, ugd ugdVar, ugd ugdVar2, mm40 mm40Var, fet fetVar, int i) {
        ugd ugdVar3;
        ugd ugdVar4;
        function0.getClass();
        fetVar.g0(980290164);
        int i2 = i | (fetVar.i(function0) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.h(z2) ? 256 : 128) | (fetVar.g(mm40Var) ? 131072 : 65536);
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(o7k0.e(mm40VarD, 60.0f), 12.0f, 0.0f, 8.0f, 0.0f, 10);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z3 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN2 = s5x0.N(o7k0.c(jm40Var, 1.0f), 0.0f, 0.0f, 28.0f, 0.0f, 11);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            ugdVar3 = ugdVar;
            ugdVar3.invoke(fetVar, 6);
            ugdVar4 = ugdVar2;
            ugdVar4.F(twn.l(gqw0.k, s5x0.N(jm40Var, 12.0f, 0.0f, 0.0f, 0.0f, 14)), fetVar, 48);
            fetVar.r(true);
            mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.f);
            long backgroundContent = afn0.m(fetVar).getBackgroundContent();
            long primary = afn0.m(fetVar).getPrimary();
            long primary2 = afn0.m(fetVar).getPrimary();
            long secondary60 = afn0.m(fetVar).getSecondary60();
            long secondary61 = afn0.m(fetVar).getSecondary60();
            long backgroundContent2 = afn0.m(fetVar).getBackgroundContent();
            long primary60 = afn0.m(fetVar).getPrimary60();
            long primary61 = afn0.m(fetVar).getPrimary60();
            long backgroundContent3 = afn0.m(fetVar).getBackgroundContent();
            long backgroundContent4 = afn0.m(fetVar).getBackgroundContent();
            long secondary40 = afn0.m(fetVar).getSecondary40();
            long secondary41 = afn0.m(fetVar).getSecondary40();
            long jD = v4d.d(mzn0.h, fetVar);
            long jD2 = v4d.d(mzn0.o, fetVar);
            long jC = y3d.c(mzn0.b, v4d.d(mzn0.f22663a, fetVar));
            zfn zfnVar = v4d.f36771a;
            dzn0 dzn0Var = new dzn0(backgroundContent, primary, primary2, jD, secondary60, backgroundContent2, secondary61, jD2, backgroundContent3, primary60, primary61, fbc.L(jC, ((t4d) fetVar.k(zfnVar)).p), secondary40, backgroundContent4, secondary41, fbc.L(y3d.c(mzn0.d, v4d.d(mzn0.c, fetVar)), ((t4d) fetVar.k(zfnVar)).p));
            boolean z4 = (i2 & 14) == 4;
            Object objP = fetVar.P();
            if (z4 || objP == ukd.f35823a) {
                objP = new y(function0, (byte) 16);
                fetVar.o0(objP);
            }
            fzn0.a(z2, (Function1) objP, mm40VarB, z, dzn0Var, fetVar, ((i2 >> 6) & 14) | ((i2 << 9) & 57344));
            fetVar.r(true);
        } else {
            ugdVar3 = ugdVar;
            ugdVar4 = ugdVar2;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qxf(function0, z, z2, ugdVar3, ugdVar4, mm40Var, i);
        }
    }

    public static final void e(mm40 mm40Var, n0x n0xVar, Function0 function0, fet fetVar, int i) {
        function0.getClass();
        fetVar.g0(-383668467);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(n0xVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.e(mm40VarD, 36.0f), 8.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, fetVar, 54);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            v(n0xVar, function0, fetVar, (i2 >> 3) & 126);
            qzb.n(null, new wul(oul.e, oe9.d, new te9(R.drawable.ic_glyph_chevron_right_small), true, false, false), function0, fetVar, i2 & 896, 1);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new coh(mm40Var, n0xVar, function0, i, (byte) 0);
        }
    }

    public static final void f(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(336668510);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, 128.0f), 1.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y30(mm40Var, i, (byte) 19);
        }
    }

    public static final void g(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(-89347765);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            qxw.o(fetVar, o7k0.e(jm40Var, 10.0f));
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 128.0f), 20.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, rw2.d(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1), fetVar, jm40Var, 10.0f));
            mm40 mm40VarE2 = o7k0.e(o7k0.d(jm40Var, 1.0f), 128.0f);
            zcl zclVar3 = qmk.i;
            h97.s(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarE2), vbc.d0(null, fetVar, 0, 1), fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y30(mm40Var, i, (byte) 20);
        }
    }

    public static final void h(final mm40 mm40Var, int i, final int i2, final int i3, final int i4, final qol qolVar, tol tolVar, iol iolVar, fet fetVar, int i5) {
        int i6;
        int i7;
        iol iolVar2;
        y9q0 y9q0VarT;
        y9q0 y9q0VarN;
        final float f;
        final float f2;
        final y9q0 y9q0Var;
        fetVar.g0(-1600724685);
        if ((i5 & 6) == 0) {
            i6 = (fetVar.g(mm40Var) ? 4 : 2) | i5;
        } else {
            i6 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 = i;
            i6 |= fetVar.e(i7) ? 32 : 16;
        } else {
            i7 = i;
        }
        if ((i5 & 384) == 0) {
            i6 |= fetVar.e(i2) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i6 |= fetVar.e(i3) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i6 |= fetVar.e(i4) ? 16384 : 8192;
        }
        if ((196608 & i5) == 0) {
            i6 |= (262144 & i5) == 0 ? fetVar.g(qolVar) : fetVar.i(qolVar) ? 131072 : 65536;
        }
        if ((1572864 & i5) == 0) {
            i6 |= fetVar.e(tolVar == null ? -1 : tolVar.ordinal()) ? 1048576 : 524288;
        }
        if ((12582912 & i5) == 0) {
            iolVar2 = iolVar;
            i6 |= fetVar.g(iolVar2) ? 8388608 : 4194304;
        } else {
            iolVar2 = iolVar;
        }
        if (fetVar.U(i6 & 1, (4793491 & i6) != 4793490)) {
            fetVar.Z();
            if ((i5 & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            int iOrdinal = tolVar.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(-166642276);
                y9q0VarT = ibm0.t(g1t0.e(), fetVar);
                zcl zclVar = qmk.f28987a;
                y9q0VarN = ibm0.n(g1t0.f(), fetVar);
                fetVar.r(false);
                f = 14.0f;
                f2 = 12.0f;
            } else if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    fetVar.e0(-166068032);
                    y9q0VarT = ibm0.t(g1t0.m(), fetVar);
                    zcl zclVar2 = qmk.f28987a;
                    y9q0VarN = ibm0.n(g1t0.e(), fetVar);
                    fetVar.r(false);
                    f = 16.0f;
                    f2 = 16.0f;
                } else {
                    if (iOrdinal != 3) {
                        throw b1j.f(-698113394, fetVar, false);
                    }
                    fetVar.e0(-165785188);
                    y9q0 y9q0VarT2 = ibm0.t(g1t0.j(), fetVar);
                    zcl zclVar3 = qmk.f28987a;
                    y9q0VarN = ibm0.n(g1t0.d(), fetVar);
                    fetVar.r(false);
                    y9q0Var = y9q0VarT2;
                    f = 20.0f;
                    f2 = 20.0f;
                }
                final iol iolVar3 = iolVar2;
                final int i8 = i7;
                final y9q0 y9q0Var2 = y9q0VarN;
                obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1984178701, new Function2() { // from class: a.kol
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        iol iolVar4;
                        dh90 dh90Var;
                        y9q0 y9q0Var3;
                        qol qolVar2;
                        fet fetVar2;
                        float f3;
                        qol qolVar3;
                        qol qolVar4;
                        float f4;
                        boolean z;
                        boolean z2;
                        fet fetVar3 = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            g9q0 g9q0VarN = pym0.n(fetVar3);
                            mm40 mm40VarY = o7k0.y(mm40Var, null, 3);
                            zcl zclVar4 = qmk.f28987a;
                            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.j, fetVar3, 0);
                            int iHashCode = Long.hashCode(fetVar3.T);
                            bh90 bh90VarM = fetVar3.m();
                            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarY);
                            mkd.c0.getClass();
                            fetVar3.i0();
                            if (fetVar3.S) {
                                fetVar3.l(e7z.u1);
                            } else {
                                fetVar3.r0();
                            }
                            jpm0.o(fetVar3, thg0VarA, gqw0.x);
                            jpm0.o(fetVar3, bh90VarM, gqw0.w);
                            jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
                            jpm0.n(fetVar3);
                            jpm0.o(fetVar3, mm40VarC0, gqw0.v);
                            iol iolVar5 = iolVar3;
                            dh90 dh90Var2 = iolVar5.d.d;
                            boolean zContainsKey = dh90Var2.containsKey(rol.f30844a);
                            qol qolVar5 = qolVar;
                            y9q0 y9q0Var4 = y9q0Var;
                            y9q0 y9q0Var5 = y9q0Var2;
                            float f5 = f;
                            if (zContainsKey) {
                                fetVar3.e0(1040293100);
                                fetVar2 = fetVar3;
                                qolVar2 = qolVar5;
                                iolVar4 = iolVar5;
                                dh90Var = dh90Var2;
                                wwb.y(wwb.E(i8, iolVar5.e), qolVar5.f29078a, y9q0Var4, y9q0Var5, iolVar5.f15122a, iolVar5.b, null, f5, g9q0VarN, fetVar2, 12582918);
                                y9q0Var3 = y9q0Var4;
                                y9q0Var5 = y9q0Var5;
                                wwb.x(null, y9q0Var3, iolVar4.c, fetVar2, 0);
                                fetVar2.r(false);
                            } else {
                                iolVar4 = iolVar5;
                                dh90Var = dh90Var2;
                                y9q0Var3 = y9q0Var4;
                                qolVar2 = qolVar5;
                                fetVar2 = fetVar3;
                                fetVar2.e0(1041091691);
                                fetVar2.r(false);
                            }
                            boolean zContainsKey2 = dh90Var.containsKey(rol.b);
                            float f6 = f2;
                            if (zContainsKey2) {
                                fetVar2.e0(1041206918);
                                y9q0 y9q0Var6 = y9q0Var3;
                                qol qolVar6 = qolVar2;
                                y9q0 y9q0Var7 = y9q0Var5;
                                qolVar3 = qolVar6;
                                f3 = f6;
                                wwb.y(wwb.E(i2, jol.b), qolVar6.b, y9q0Var6, y9q0Var7, iolVar4.f15122a, iolVar4.b, new ycl(f6), f5, g9q0VarN, fetVar2, 6);
                                y9q0Var3 = y9q0Var6;
                                y9q0Var5 = y9q0Var7;
                                if (dh90Var.containsKey(rol.c)) {
                                    fetVar2.e0(1041853237);
                                    wwb.x(null, y9q0Var3, iolVar4.c, fetVar2, 0);
                                    z2 = false;
                                    fetVar2.r(false);
                                } else {
                                    z2 = false;
                                    fetVar2.e0(1042028139);
                                    fetVar2.r(false);
                                }
                                fetVar2.r(z2);
                            } else {
                                f3 = f6;
                                qolVar3 = qolVar2;
                                fetVar2.e0(1042042027);
                                fetVar2.r(false);
                            }
                            if (dh90Var.containsKey(rol.c)) {
                                fetVar2.e0(1042159331);
                                y9q0 y9q0Var8 = y9q0Var3;
                                qol qolVar7 = qolVar3;
                                y9q0 y9q0Var9 = y9q0Var5;
                                float f7 = f3;
                                qolVar4 = qolVar7;
                                f4 = f7;
                                wwb.y(wwb.E(i3, jol.b), qolVar7.c, y9q0Var8, y9q0Var9, iolVar4.f15122a, iolVar4.b, new ycl(f7), f5, g9q0VarN, fetVar2, 6);
                                y9q0Var3 = y9q0Var8;
                                y9q0Var5 = y9q0Var9;
                                if (dh90Var.containsKey(rol.d)) {
                                    fetVar2.e0(1042808533);
                                    wwb.x(null, y9q0Var3, iolVar4.c, fetVar2, 0);
                                    z = false;
                                    fetVar2.r(false);
                                } else {
                                    z = false;
                                    fetVar2.e0(1042983435);
                                    fetVar2.r(false);
                                }
                                fetVar2.r(z);
                            } else {
                                qolVar4 = qolVar3;
                                f4 = f3;
                                fetVar2.e0(1042997323);
                                fetVar2.r(false);
                            }
                            if (dh90Var.containsKey(rol.d)) {
                                fetVar2.e0(1043106071);
                                fet fetVar4 = fetVar2;
                                wwb.y(wwb.E(i4, jol.b), qolVar4.d, y9q0Var3, y9q0Var5, iolVar4.f15122a, iolVar4.b, new ycl(f4), f5, g9q0VarN, fetVar4, 6);
                                fetVar2 = fetVar4;
                                fetVar2.r(false);
                            } else {
                                fetVar2.e0(1043678827);
                                fetVar2.r(false);
                            }
                            fetVar2.r(true);
                        } else {
                            fetVar3.X();
                        }
                        return Unit.f46060a;
                    }
                }, fetVar), fetVar, 56);
            } else {
                fetVar.e0(-166355588);
                y9q0VarT = ibm0.t(g1t0.d(), fetVar);
                zcl zclVar4 = qmk.f28987a;
                y9q0VarN = ibm0.n(g1t0.e(), fetVar);
                fetVar.r(false);
                f2 = 14.0f;
                f = 16.0f;
            }
            y9q0Var = y9q0VarT;
            final iol iolVar4 = iolVar2;
            final int i9 = i7;
            final y9q0 y9q0Var3 = y9q0VarN;
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1984178701, new Function2() { // from class: a.kol
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    iol iolVar5;
                    dh90 dh90Var;
                    y9q0 y9q0Var4;
                    qol qolVar2;
                    fet fetVar2;
                    float f3;
                    qol qolVar3;
                    qol qolVar4;
                    float f4;
                    boolean z;
                    boolean z2;
                    fet fetVar3 = (fet) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                        g9q0 g9q0VarN = pym0.n(fetVar3);
                        mm40 mm40VarY = o7k0.y(mm40Var, null, 3);
                        zcl zclVar5 = qmk.f28987a;
                        thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.j, fetVar3, 0);
                        int iHashCode = Long.hashCode(fetVar3.T);
                        bh90 bh90VarM = fetVar3.m();
                        mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarY);
                        mkd.c0.getClass();
                        fetVar3.i0();
                        if (fetVar3.S) {
                            fetVar3.l(e7z.u1);
                        } else {
                            fetVar3.r0();
                        }
                        jpm0.o(fetVar3, thg0VarA, gqw0.x);
                        jpm0.o(fetVar3, bh90VarM, gqw0.w);
                        jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
                        jpm0.n(fetVar3);
                        jpm0.o(fetVar3, mm40VarC0, gqw0.v);
                        iol iolVar6 = iolVar4;
                        dh90 dh90Var2 = iolVar6.d.d;
                        boolean zContainsKey = dh90Var2.containsKey(rol.f30844a);
                        qol qolVar5 = qolVar;
                        y9q0 y9q0Var5 = y9q0Var;
                        y9q0 y9q0Var6 = y9q0Var3;
                        float f5 = f;
                        if (zContainsKey) {
                            fetVar3.e0(1040293100);
                            fetVar2 = fetVar3;
                            qolVar2 = qolVar5;
                            iolVar5 = iolVar6;
                            dh90Var = dh90Var2;
                            wwb.y(wwb.E(i9, iolVar6.e), qolVar5.f29078a, y9q0Var5, y9q0Var6, iolVar6.f15122a, iolVar6.b, null, f5, g9q0VarN, fetVar2, 12582918);
                            y9q0Var4 = y9q0Var5;
                            y9q0Var6 = y9q0Var6;
                            wwb.x(null, y9q0Var4, iolVar5.c, fetVar2, 0);
                            fetVar2.r(false);
                        } else {
                            iolVar5 = iolVar6;
                            dh90Var = dh90Var2;
                            y9q0Var4 = y9q0Var5;
                            qolVar2 = qolVar5;
                            fetVar2 = fetVar3;
                            fetVar2.e0(1041091691);
                            fetVar2.r(false);
                        }
                        boolean zContainsKey2 = dh90Var.containsKey(rol.b);
                        float f6 = f2;
                        if (zContainsKey2) {
                            fetVar2.e0(1041206918);
                            y9q0 y9q0Var7 = y9q0Var4;
                            qol qolVar6 = qolVar2;
                            y9q0 y9q0Var8 = y9q0Var6;
                            qolVar3 = qolVar6;
                            f3 = f6;
                            wwb.y(wwb.E(i2, jol.b), qolVar6.b, y9q0Var7, y9q0Var8, iolVar5.f15122a, iolVar5.b, new ycl(f6), f5, g9q0VarN, fetVar2, 6);
                            y9q0Var4 = y9q0Var7;
                            y9q0Var6 = y9q0Var8;
                            if (dh90Var.containsKey(rol.c)) {
                                fetVar2.e0(1041853237);
                                wwb.x(null, y9q0Var4, iolVar5.c, fetVar2, 0);
                                z2 = false;
                                fetVar2.r(false);
                            } else {
                                z2 = false;
                                fetVar2.e0(1042028139);
                                fetVar2.r(false);
                            }
                            fetVar2.r(z2);
                        } else {
                            f3 = f6;
                            qolVar3 = qolVar2;
                            fetVar2.e0(1042042027);
                            fetVar2.r(false);
                        }
                        if (dh90Var.containsKey(rol.c)) {
                            fetVar2.e0(1042159331);
                            y9q0 y9q0Var9 = y9q0Var4;
                            qol qolVar7 = qolVar3;
                            y9q0 y9q0Var10 = y9q0Var6;
                            float f7 = f3;
                            qolVar4 = qolVar7;
                            f4 = f7;
                            wwb.y(wwb.E(i3, jol.b), qolVar7.c, y9q0Var9, y9q0Var10, iolVar5.f15122a, iolVar5.b, new ycl(f7), f5, g9q0VarN, fetVar2, 6);
                            y9q0Var4 = y9q0Var9;
                            y9q0Var6 = y9q0Var10;
                            if (dh90Var.containsKey(rol.d)) {
                                fetVar2.e0(1042808533);
                                wwb.x(null, y9q0Var4, iolVar5.c, fetVar2, 0);
                                z = false;
                                fetVar2.r(false);
                            } else {
                                z = false;
                                fetVar2.e0(1042983435);
                                fetVar2.r(false);
                            }
                            fetVar2.r(z);
                        } else {
                            qolVar4 = qolVar3;
                            f4 = f3;
                            fetVar2.e0(1042997323);
                            fetVar2.r(false);
                        }
                        if (dh90Var.containsKey(rol.d)) {
                            fetVar2.e0(1043106071);
                            fet fetVar4 = fetVar2;
                            wwb.y(wwb.E(i4, jol.b), qolVar4.d, y9q0Var4, y9q0Var6, iolVar5.f15122a, iolVar5.b, new ycl(f4), f5, g9q0VarN, fetVar4, 6);
                            fetVar2 = fetVar4;
                            fetVar2.r(false);
                        } else {
                            fetVar2.e0(1043678827);
                            fetVar2.r(false);
                        }
                        fetVar2.r(true);
                    } else {
                        fetVar3.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lol(mm40Var, i, i2, i3, i4, qolVar, tolVar, iolVar, i5, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:72:0x0152  */
    /* JADX WARN: Code duplicated, block: B:75:0x0160  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    public static final void i(mm40 mm40Var, final String str, long j, int i, long j2, fet fetVar, final int i2, final int i3) {
        mm40 mm40Var2;
        int i4;
        long textPrimary;
        long j3;
        boolean z;
        final int i5;
        final mm40 mm40Var3;
        final long j4;
        final long j5;
        yfe0 yfe0VarU;
        mm40 mm40Var4;
        int i6;
        int i7;
        int i8;
        long j6;
        str.getClass();
        fetVar.g0(1851428586);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i2 | 6;
            mm40Var2 = mm40Var;
        } else if ((i2 & 6) == 0) {
            mm40Var2 = mm40Var;
            i4 = (fetVar.g(mm40Var2) ? 4 : 2) | i2;
        } else {
            mm40Var2 = mm40Var;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                textPrimary = j;
                int i10 = fetVar.f(textPrimary) ? 256 : 128;
                i4 |= i10;
            } else {
                textPrimary = j;
            }
            i4 |= i10;
        } else {
            textPrimary = j;
        }
        if ((i2 & 3072) == 0) {
            i4 |= 1024;
        }
        int i11 = i3 & 16;
        if (i11 == 0) {
            if ((i2 & 24576) == 0) {
                j3 = j2;
                i4 |= fetVar.f(j3) ? 16384 : 8192;
            }
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i4 & 1, z)) {
                fetVar.Z();
                if ((i2 & 1) != 0 || fetVar.B()) {
                    if (i9 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if ((i3 & 4) != 0) {
                        textPrimary = ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary();
                        i4 &= -897;
                    }
                    i6 = i4 & (-7169);
                    if (i11 != 0) {
                        j6 = y3d.f;
                        i7 = i6;
                        i8 = 3;
                    } else {
                        i7 = i6;
                        i8 = 3;
                        j6 = j3;
                    }
                } else {
                    fetVar.X();
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    i7 = i4 & (-7169);
                    mm40Var4 = mm40Var2;
                    j6 = j3;
                    i8 = i;
                }
                fetVar.s();
                mm40 mm40VarD = o7k0.d(i120.Q(mm40Var4, j6, jd8.n), 1.0f);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarE0 = o2e.e0(s5x0.L(mm40VarD, 16.0f, 0.0f, 2), "DS_BOTTOM_SHEET_TITLE_PRESET");
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                long j7 = textPrimary;
                v8q0.a(str, mm40VarE0, j7, null, 0L, null, null, null, 0L, new f2q0(i8), 0L, 0, false, 0, 0, null, g1t0.q(), fetVar, ((i7 >> 3) & 14) | (i7 & 896), 0, 130040);
                j4 = j7;
                i5 = i8;
                mm40Var3 = mm40Var4;
                j5 = j6;
            } else {
                fetVar.X();
                i5 = i;
                mm40Var3 = mm40Var2;
                j4 = textPrimary;
                j5 = j3;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.dul
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        wwb.i(mm40Var3, str, j4, i5, j5, (fet) obj, x8x.L(i2 | 1), i3);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i4 |= 24576;
        j3 = j2;
        if ((i4 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i4 & 1, z)) {
            fetVar.Z();
            if ((i2 & 1) != 0) {
                if (i9 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if ((i3 & 4) != 0) {
                    textPrimary = ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary();
                    i4 &= -897;
                }
                i6 = i4 & (-7169);
                if (i11 != 0) {
                    j6 = y3d.f;
                    i7 = i6;
                    i8 = 3;
                } else {
                    i7 = i6;
                    i8 = 3;
                    j6 = j3;
                }
            } else {
                if (i9 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if ((i3 & 4) != 0) {
                    textPrimary = ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary();
                    i4 &= -897;
                }
                i6 = i4 & (-7169);
                if (i11 != 0) {
                    j6 = y3d.f;
                    i7 = i6;
                    i8 = 3;
                } else {
                    i7 = i6;
                    i8 = 3;
                    j6 = j3;
                }
            }
            fetVar.s();
            mm40 mm40VarD2 = o7k0.d(i120.Q(mm40Var4, j6, jd8.n), 1.0f);
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarE1 = o2e.e0(s5x0.L(mm40VarD2, 16.0f, 0.0f, 2), "DS_BOTTOM_SHEET_TITLE_PRESET");
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            long j8 = textPrimary;
            v8q0.a(str, mm40VarE1, j8, null, 0L, null, null, null, 0L, new f2q0(i8), 0L, 0, false, 0, 0, null, g1t0.q(), fetVar, ((i7 >> 3) & 14) | (i7 & 896), 0, 130040);
            j4 = j8;
            i5 = i8;
            mm40Var3 = mm40Var4;
            j5 = j6;
        } else {
            fetVar.X();
            i5 = i;
            mm40Var3 = mm40Var2;
            j4 = textPrimary;
            j5 = j3;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.dul
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wwb.i(mm40Var3, str, j4, i5, j5, (fet) obj, x8x.L(i2 | 1), i3);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void j(mm40 mm40Var, b8m b8mVar, float f, r7m r7mVar, Function0 function0, fet fetVar, int i, int i2) {
        r7m r7mVar2;
        b8mVar.getClass();
        if ((i2 & 1) != 0) {
            mm40Var = jm40.b;
        }
        mm40 mm40Var2 = mm40Var;
        if ((i2 & 8) != 0) {
            zfn zfnVar = zaq0.b;
            r7mVar2 = new r7m(((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), ((ThemeColors) fetVar.k(zfnVar)).getPrimary());
        } else {
            r7mVar2 = r7mVar;
        }
        Object objP = fetVar.P();
        cl5 cl5Var = ukd.f35823a;
        if (objP == cl5Var) {
            objP = new knl((byte) 27);
            fetVar.o0(objP);
        }
        Function0 function1 = (Function0) objP;
        if ((i2 & 32) != 0) {
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new knl((byte) 28);
                fetVar.o0(objP2);
            }
            function0 = (Function0) objP2;
        }
        Function0 function2 = function0;
        if (b8mVar instanceof x7m) {
            fetVar.e0(-457561836);
            fxb.m(mm40Var2, (x7m) b8mVar, r7mVar2, f, function1, function2, fetVar, i & 126);
            fetVar.r(false);
        } else {
            if (!(b8mVar instanceof a8m)) {
                throw b1j.f(1370711527, fetVar, false);
            }
            fetVar.e0(-457207692);
            dyb.q(mm40Var2, (a8m) b8mVar, r7mVar2, f, function1, function2, fetVar, i & 126);
            fetVar.r(false);
        }
    }

    public static final void k(mm40 mm40Var, jnm jnmVar, int i, kly klyVar, Function0 function0, Function1 function1, fet fetVar, int i2, int i3) {
        jnmVar.getClass();
        if ((i3 & 1) != 0) {
            mm40Var = jm40.b;
        }
        mm40 mm40Var2 = mm40Var;
        if ((i3 & 8) != 0) {
            klyVar = kly.d;
        }
        kly klyVar2 = klyVar;
        Object objP = fetVar.P();
        if (objP == ukd.f35823a) {
            objP = new aim((byte) 9);
            fetVar.o0(objP);
        }
        Function1 function2 = (Function1) objP;
        if (jnmVar instanceof hnm) {
            fetVar.e0(-819154595);
            wvb.q(mm40Var2, (hnm) jnmVar, i, klyVar2, function0, function1, function2, fetVar, i2 & 4194302);
            fetVar.r(false);
        } else {
            if (!(jnmVar instanceof inm)) {
                throw b1j.f(-1273351725, fetVar, false);
            }
            fetVar.e0(-818729988);
            jwb.l(mm40Var2, (inm) jnmVar, i, klyVar2, function0, function1, function2, fetVar, i2 & 4194302);
            fetVar.r(false);
        }
    }

    public static final void l(mm40 mm40Var, tum tumVar, tum tumVar2, kum kumVar, String str, sem semVar, fet fetVar, int i) {
        int i2;
        tum tumVar3;
        tum tumVar4;
        String str2 = tumVar.d;
        String str3 = tumVar2.d;
        str.getClass();
        fetVar.g0(921062226);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(tumVar) ? 32 : 16) | (fetVar.g(tumVar2) ? 256 : 128) | (fetVar.g(kumVar) ? 2048 : 1024) | (fetVar.g(str) ? 16384 : 8192);
        if ((i & 196608) == 0) {
            i3 |= fetVar.g(semVar) ? 131072 : 65536;
        }
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.e(mm40VarD, 58.0f), 12.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            boolean zEquals = semVar.equals(pem.f26861a);
            jm40 jm40Var = jm40.b;
            int i4 = i3;
            if (zEquals || semVar.equals(qem.f28591a)) {
                fetVar.e0(1264700341);
                jeb.r(s5x0.N(s5x0.L(jm40Var, 4.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 6.0f, 7), semVar instanceof pem ? bhm.f2615a : bhm.b, fetVar, 0);
                fetVar.r(false);
            } else {
                if (!semVar.equals(rem.f30342a)) {
                    throw b1j.f(-97755576, fetVar, false);
                }
                fetVar.e0(-97733638);
                fetVar.r(false);
            }
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), 4.0f, 0.0f, 0.0f, 0.0f, 14);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            int i5 = i4 >> 3;
            s(o2e.e0(jm40Var, "INFO_CONTAINER_V1"), str, kumVar, fetVar, ((i4 >> 9) & 112) | 6 | (i5 & 896));
            tumVar3 = tumVar;
            u(o2e.e0(jm40Var, "FIRST_OPPONENT_CONTAINER_V1"), tumVar3, M(str2, str3, fetVar), fetVar, (i4 & 112) | 6);
            int i6 = (i5 & 112) | 6;
            tumVar4 = tumVar2;
            u(o2e.e0(jm40Var, "SECOND_OPPONENT_CONTAINER_V1"), tumVar4, M(str2, str3, fetVar), fetVar, i6);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            tumVar3 = tumVar;
            tumVar4 = tumVar2;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg0((Object) mm40Var, (Object) tumVar3, (Object) tumVar4, (Object) kumVar, (Object) str, (Object) semVar, i, (byte) 17);
        }
    }

    public static final void m(mm40 mm40Var, wzm wzmVar, wzm wzmVar2, String str, jwm jwmVar, jwm jwmVar2, jwm jwmVar3, boolean z, fet fetVar, int i) {
        int i2;
        wzm wzmVar3;
        String str2;
        uso0 uso0Var = uso0.f36223a;
        str.getClass();
        fetVar.g0(-945471468);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(wzmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            wzmVar3 = wzmVar2;
            i2 |= fetVar.g(wzmVar3) ? 256 : 128;
        } else {
            wzmVar3 = wzmVar2;
        }
        if ((i & 3072) == 0) {
            str2 = str;
            i2 |= fetVar.g(str2) ? 2048 : 1024;
        } else {
            str2 = str;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? fetVar.g(jwmVar) : fetVar.i(jwmVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (262144 & i) == 0 ? fetVar.g(jwmVar2) : fetVar.i(jwmVar2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= (2097152 & i) == 0 ? fetVar.g(jwmVar3) : fetVar.i(jwmVar3) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.e(0) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= fetVar.h(z) ? 67108864 : 33554432;
        }
        if (fetVar.U(i2 & 1, (38347923 & i2) != 38347922)) {
            androidx.compose.runtime.d dVar = bmd.n;
            k6z k6zVar = (k6z) fetVar.k(dVar);
            Object obj = z ? k6zVar : k6z.f17794a;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            int i3 = i2;
            mm40 mm40VarN = s5x0.N(s5x0.L(mm40VarD, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 12.0f, 7);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 6);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            z(null, wzmVar, wzmVar3, str2, jwmVar, fetVar, (i3 & 65520) | (458752 & (i3 >> 6)));
            obc.d(dVar.a(obj), u1c.M(1639983006, new zzm(k6zVar, jwmVar2, jwmVar3, (byte) 1), fetVar), fetVar, 56);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gw6(mm40Var, wzmVar, wzmVar2, str, jwmVar, jwmVar2, jwmVar3, z, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:90:0x017d  */
    public static final void n(mm40 mm40Var, x6q0 x6q0Var, kly klyVar, Function1 function1, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        kly klyVar2;
        int i4;
        kly klyVar3;
        int i5;
        oie oieVar;
        uuu0 uuu0Var = gfk0.f;
        x6q0Var.getClass();
        boolean z = x6q0Var.d;
        function1.getClass();
        fetVar.g0(864974918);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else {
            mm40Var2 = mm40Var;
            i3 = i | (fetVar.g(mm40Var2) ? 4 : 2);
        }
        int i7 = i3 | (fetVar.g(x6q0Var) ? 32 : 16);
        int i8 = i2 & 4;
        if (i8 != 0) {
            i4 = i7 | 384;
            klyVar2 = klyVar;
        } else {
            klyVar2 = klyVar;
            i4 = i7 | (fetVar.g(klyVar2) ? 256 : 128);
        }
        int i9 = i4 | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i9 & 1, (i9 & 1171) != 1170)) {
            mm40 mm40Var3 = i6 != 0 ? jm40.b : mm40Var2;
            kly klyVar4 = i8 != 0 ? kly.d : klyVar2;
            Object obj = x6q0Var.b;
            Object obj2 = x6q0Var.f;
            boolean zH = fetVar.h(z);
            Object objP = fetVar.P();
            Object obj3 = ukd.f35823a;
            if (zH || objP == obj3) {
                objP = Float.valueOf(z ? 1.0f : 0.5f);
                fetVar.o0(objP);
            }
            float fFloatValue = ((Number) objP).floatValue();
            boolean zG = fetVar.g(obj2);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj3) {
                if (obj2 == null) {
                    i5 = 0;
                } else if (obj2 instanceof a6q0) {
                    i5 = ((a6q0) obj2).f329a ? 8 : 7;
                } else if (obj2 instanceof y5q0) {
                    i5 = ((y5q0) obj2).f42061a;
                } else if (!(obj2 instanceof z5q0)) {
                    t9f.b();
                    return;
                } else {
                    i5 = 9;
                }
                objP2 = new bmy(i5);
                fetVar.o0(objP2);
            }
            int i10 = ((bmy) objP2).f2857a;
            boolean zG2 = fetVar.g(obj2);
            Object objP3 = fetVar.P();
            if (zG2 || objP3 == obj3) {
                objP3 = Boolean.valueOf(obj2 instanceof a6q0);
                fetVar.o0(objP3);
            }
            boolean zBooleanValue = ((Boolean) objP3).booleanValue();
            boolean zG3 = fetVar.g(obj);
            Object objP4 = fetVar.P();
            if (zG3 || objP4 == obj3) {
                objP4 = Boolean.valueOf((obj instanceof i6q0) || (obj instanceof l6q0));
                fetVar.o0(objP4);
            }
            Boolean bool = (Boolean) objP4;
            boolean zBooleanValue2 = bool.booleanValue();
            Object[] objArr = new Object[0];
            Object objP5 = fetVar.P();
            if (objP5 == obj3) {
                objP5 = new ndm((byte) 25);
                fetVar.o0(objP5);
            }
            pz40 pz40Var = (pz40) e9x.Q(objArr, (Function0) objP5, fetVar, 48);
            Boolean bool2 = (Boolean) pz40Var.getValue();
            bool2.booleanValue();
            Object[] objArrCopyOf = Arrays.copyOf(new Object[]{obj2, bool, bool2}, 3);
            boolean zE = fetVar.e(objArrCopyOf.length);
            int length = objArrCopyOf.length;
            boolean zG4 = zE;
            int i11 = 0;
            while (i11 < length) {
                zG4 |= fetVar.g(objArrCopyOf[i11]);
                i11++;
                pz40Var = pz40Var;
            }
            pz40 pz40Var2 = pz40Var;
            Object objP6 = fetVar.P();
            if (zG4 || objP6 == obj3) {
                if (obj2 == null) {
                    objP6 = uuu0Var;
                } else if (obj2 instanceof a6q0) {
                    if (!zBooleanValue || (!((Boolean) pz40Var2.getValue()).booleanValue() && zBooleanValue2)) {
                        objP6 = uuu0Var;
                    } else {
                        objP6 = new v190();
                    }
                } else if (obj2 instanceof y5q0) {
                    objP6 = ((y5q0) obj2).b;
                } else if (!(obj2 instanceof z5q0)) {
                    t9f.b();
                    return;
                } else {
                    z5q0 z5q0Var = (z5q0) obj2;
                    objP6 = new lm90(z5q0Var.f43831a, z5q0Var.b);
                }
                fetVar.o0(objP6);
            }
            vuu0 vuu0Var = (vuu0) objP6;
            if (obj2 == null) {
                oieVar = null;
            } else if (obj2 instanceof y5q0) {
                oieVar = ((y5q0) obj2).c;
            } else if (obj2 instanceof z5q0) {
                oieVar = ((z5q0) obj2).c;
            } else if (!(obj2 instanceof a6q0)) {
                t9f.b();
                return;
            } else if (((a6q0) obj2).b) {
                oie.f25306a.getClass();
                oieVar = mie.e;
            } else {
                oie.f25306a.getClass();
                oieVar = mie.c;
            }
            oie oieVar2 = oieVar;
            String str = x6q0Var.f40376a;
            String str2 = x6q0Var.h;
            String str3 = x6q0Var.i;
            boolean z2 = x6q0Var.d;
            boolean z3 = obj instanceof g6q0;
            q7q0 q7q0Var = x6q0Var.g;
            boolean z4 = x6q0Var.e;
            a7n a7nVar = x6q0Var.j;
            zcl zclVar = qmk.f28987a;
            int i12 = x6q0Var.k;
            Object objP7 = fetVar.P();
            if (objP7 == obj3) {
                objP7 = new aim((byte) 17);
                fetVar.o0(objP7);
            }
            h36.a(epv0.N(pai0.a(mm40Var3, true, (Function1) objP7), fFloatValue), str, q7q0Var, str2, str3, z2, false, z3, z4, true, oieVar2, false, false, null, null, false, vuu0Var, false, 0L, null, null, i10, i12, klyVar4, 4.0f, 0.0f, 0.0f, null, null, false, 0.0f, -1, a7nVar, null, function1, u1c.M(995692308, new elm(x6q0Var, (byte) 4), fetVar), u1c.M(642841777, new p2n((Object) x6q0Var, zBooleanValue2, pz40Var2, function1, (byte) 5), fetVar), u1c.M(2133410482, new mxm(x6q0Var, (byte) 20), fetVar), fetVar, 806879232, 48, (i9 << 3) & 7168, (458752 & (i9 << 6)) | 114819072, 2115952640, 9);
            klyVar3 = klyVar4;
            mm40Var2 = mm40Var3;
        } else {
            fetVar.X();
            klyVar3 = klyVar2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pr9((byte) 2, i, i2, function1, mm40Var2, x6q0Var, klyVar3);
        }
    }

    public static final void o(int i, fet fetVar, mm40 mm40Var, String str) {
        fet fetVar2;
        fetVar.g0(999401931);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            ugd ugdVarM = u1c.M(-2050443932, new vod(str, b), fetVar);
            jm40 jm40Var = jm40.b;
            fetVar2 = fetVar;
            v3c.u(jm40Var, null, ugdVarM, null, fetVar2, 3078, 22);
            mm40Var = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ndp(mm40Var, str, i, (byte) 4);
        }
    }

    public static final void p(mm40 mm40Var, xak xakVar, nek nekVar, l7m0 l7m0Var, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        Object obj;
        mm40 mm40Var2;
        fet fetVar2;
        xcz xczVar;
        xakVar.getClass();
        nekVar.getClass();
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1008005534);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(xakVar) : fetVar.i(xakVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? fetVar.g(nekVar) : fetVar.i(nekVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            obj = function1;
            i2 |= fetVar.i(obj) ? 16384 : 8192;
        } else {
            obj = function1;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function2) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            zcl zclVar = qmk.f28987a;
            float f = qmk.a(fetVar).c;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = jgk0.b(new zwp(l7m0Var, (byte) 26));
                fetVar.o0(objP);
            }
            if (((Boolean) ((l7m0) objP).getValue()).booleanValue()) {
                fetVar.e0(-917771372);
                Object objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = jgk0.b(new zwp(l7m0Var, (byte) 27));
                    fetVar.o0(objP2);
                }
                l7m0 l7m0Var2 = (l7m0) objP2;
                Object objP3 = fetVar.P();
                if (objP3 == cl5Var) {
                    objP3 = jgk0.b(new zwp(l7m0Var, (byte) 28));
                    fetVar.o0(objP3);
                }
                l7m0 l7m0Var3 = (l7m0) objP3;
                Object objP4 = fetVar.P();
                if (objP4 == cl5Var) {
                    objP4 = jgk0.b(new zwp(l7m0Var, (byte) 29));
                    fetVar.o0(objP4);
                }
                l7m0 l7m0Var4 = (l7m0) objP4;
                xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                Object objP5 = fetVar.P();
                if (objP5 == cl5Var) {
                    objP5 = androidx.compose.runtime.e.e(Boolean.FALSE);
                    fetVar.o0(objP5);
                }
                pz40 pz40Var = (pz40) objP5;
                boolean zG = ((i2 & 7168) == 2048) | fetVar.g(xczVarA) | ((i2 & 57344) == 16384);
                Object objP6 = fetVar.P();
                if (zG || objP6 == cl5Var) {
                    Object obj2 = obj;
                    xczVar = xczVarA;
                    wmq wmqVar = new wmq((Object) l7m0Var, (Object) xczVar, obj2, (Object) pz40Var, (yje) null, (byte) 3);
                    fetVar.o0(wmqVar);
                    objP6 = wmqVar;
                } else {
                    xczVar = xczVarA;
                }
                m0x0.t(fetVar, xczVar, (Function2) objP6);
                zfn zfnVar = kr00.f18743a;
                Boolean bool = (Boolean) l7m0Var4.getValue();
                bool.getClass();
                mm40Var2 = mm40Var;
                obc.d(zfnVar.a(bool), u1c.M(254266937, new g3d(mm40Var, xczVar, function2, f, function1, xakVar, nekVar, l7m0Var2, l7m0Var3), fetVar), fetVar, 56);
                fetVar.r(false);
                fetVar2 = fetVar;
            } else {
                mm40Var2 = mm40Var;
                fetVar.e0(-910583061);
                mm40 mm40VarL = s5x0.L(mm40Var2, qmk.a(fetVar).c, 0.0f, 2);
                lh80 lh80VarT = s5x0.t(0.0f, 8.0f, 1);
                qw3 qw3Var = new qw3(12.0f, true, new jf4((byte) 14));
                Object objP7 = fetVar.P();
                if (objP7 == cl5Var) {
                    objP7 = new dcr((byte) 18);
                    fetVar.o0(objP7);
                }
                fetVar2 = fetVar;
                b8k0.e(mm40VarL, null, lh80VarT, qw3Var, null, null, false, null, (Function1) objP7, fetVar2, 817889280, 362);
                fetVar2.r(false);
            }
        } else {
            mm40Var2 = mm40Var;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg0(mm40Var2, (Object) xakVar, (Object) nekVar, (Object) l7m0Var, function1, function2, i, (byte) 21);
        }
    }

    public static final void q(mm40 mm40Var, crv crvVar, qdz qdzVar, Function0 function0, Function2 function2, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        crvVar.getClass();
        qdzVar.getClass();
        function0.getClass();
        function2.getClass();
        fetVar2.g0(-1901413490);
        int i2 = i | (fetVar2.g(crvVar) ? 32 : 16) | (fetVar2.g(qdzVar) ? 256 : 128) | (fetVar2.i(function0) ? 2048 : 1024) | (fetVar2.i(function2) ? 16384 : 8192);
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            String str = crvVar.f4863a;
            fetVar2.b0(-1034177717, str);
            HashMap map = qdzVar.f28556a;
            Object obj = map.get(str);
            mez mezVarQ = obj instanceof mez ? (mez) obj : null;
            if (mezVarQ == null) {
                fetVar2.e0(-1994659072);
                fetVar2.e0(-1108384329);
                mezVarQ = gfx.Q(fetVar2);
                fetVar2.r(false);
                map.put(str, mezVarQ);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1994536653);
                fetVar2.r(false);
            }
            mez mezVar = mezVarQ;
            fetVar2.r(false);
            mm40Var2 = mm40Var;
            mm40 mm40VarW = o7k0.w(mm40Var2, null, false, 3);
            zcl zclVar = qmk.l;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarW);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarE, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            b8m b8mVar = crvVar.b;
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            r7m r7mVar = new r7m(textPrimary, ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), ((ThemeColors) fetVar2.k(zfnVar)).getPrimary());
            boolean z = (i2 & 7168) == 2048;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new dbn(function0, (byte) 15);
                fetVar2.o0(objP);
            }
            j(mm40VarN, b8mVar, 16.0f, r7mVar, (Function0) objP, fetVar2, 0, 16);
            fetVar2 = fetVar;
            bdx.q(o7k0.d(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 12.0f, 5), 1.0f), crvVar.c, mezVar, s5x0.t(8.0f, 0.0f, 2), function2, fetVar2, i2 & 57344);
            fetVar2.r(true);
        } else {
            mm40Var2 = mm40Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cqk(mm40Var2, (p6t0) crvVar, qdzVar, function0, (wdr) function2, i, (byte) 28);
        }
    }

    public static final void r(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(874591172);
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            c(l7m0Var, function1, fetVar, i2 & 126);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new quh(l7m0Var, function1, i, (byte) 25);
        }
    }

    public static final void s(mm40 mm40Var, String str, kum kumVar, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(485107591);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(kumVar) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            if (kumVar != null) {
                fetVar2.e0(-1980419169);
                rcb.x(null, kpb.m0(kumVar), h2m.f12341a, nsm0.y(fgm.b), true, null, fetVar2, 384);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1980111649);
                fetVar2.r(false);
            }
            f1t0.a(null, str, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, 0L, null, 0L, 2, false, 1, 0, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), 0L, fetVar, i2 & 112, 438265);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ikl((Object) mm40Var, (Object) str, (Object) kumVar, i, (byte) 22);
        }
    }

    public static final void t(mm40 mm40Var, wzm wzmVar, boolean z, fet fetVar, int i) {
        fet fetVar2;
        mm40 mm40Var2;
        boolean z2;
        fetVar.g0(1011031713);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(wzmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var2, 24.0f), 1.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            d280 d280Var = wzmVar.b;
            if (d280Var != null) {
                fetVar.e0(-1880982901);
                boolean zG = fetVar.g(d280Var);
                Object objP = fetVar.P();
                cl5 cl5Var = ukd.f35823a;
                if (zG || objP == cl5Var) {
                    objP = new u6n(d4d.SECONDARY60, w6n.j, d280Var);
                    fetVar.o0(objP);
                }
                u6n u6nVar = (u6n) objP;
                boolean zG2 = fetVar.g(u6nVar);
                Object objP2 = fetVar.P();
                if (zG2 || objP2 == cl5Var) {
                    objP2 = new d1n(u6nVar, (byte) 1);
                    fetVar.o0(objP2);
                }
                kkb.p(1, fetVar, null, (Function0) objP2);
                fetVar.r(false);
            } else {
                fetVar.e0(-1880588891);
                fetVar.r(false);
            }
            v8q0.a(wzmVar.f40027a, new x7z(1.0f, false), ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), new n05(qmk.p, g1t0.m().f42262a.b, qmk.n), 0L, null, null, g1t0.m().f42262a.f, 0L, null, 0L, 2, false, 2, 0, null, y9q0.a(g1t0.m(), 0L, 0L, null, null, null, 0L, null, null, 0, 0, qmk.C, null, null, 16646143), fetVar, 0, 24960, 110448);
            fetVar2 = fetVar;
            fetVar2.e0(-1879770491);
            fetVar2.r(false);
            if (z) {
                fetVar2.e0(-1879707747);
                z2 = true;
                jcb.k(0, 1, fetVar2, null);
                fetVar2.r(false);
            } else {
                z2 = true;
                fetVar2.e0(-1879669307);
                fetVar2.r(false);
            }
            fetVar2.r(z2);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q02((byte) 23, i, mm40Var2, (Object) wzmVar, z);
        }
    }

    public static final void u(mm40 mm40Var, tum tumVar, float f, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        long primary;
        float f2 = f;
        fetVar.g0(-1650953143);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(tumVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.d(f2) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new gne(gqw0.o, (byte) 12)), gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            String str = tumVar.f34558a;
            int i3 = tumVar.c;
            int i4 = tumVar.b;
            y9q0 y9q0VarD = g1t0.d();
            zfn zfnVar = zaq0.b;
            f1t0.a(new x7z(1.0f, true), str, ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), null, 0L, null, 0L, null, 0L, 2, false, 1, 0, y9q0VarD, 0L, fetVar, 0, 438264);
            jm40 jm40Var = jm40.b;
            if (i4 > 0) {
                fetVar.e0(-110921897);
                long primary2 = ((ThemeColors) fetVar.k(zfnVar)).getPrimary();
                boolean zE = fetVar.e(i4) | fetVar.e(i3);
                Object objP = fetVar.P();
                if (zE || objP == ukd.f35823a) {
                    objP = new l8n(new k8n(primary2), i4, i3);
                    fetVar.o0(objP);
                }
                dyb.u(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), (l8n) objP, fetVar, 0);
                fetVar.r(false);
            } else {
                fetVar.e0(-110278027);
                fetVar.r(false);
            }
            if (tumVar.e) {
                fetVar.e0(-110216864);
                primary = ((StaticColors) fetVar.k(m8m0.f21378a)).m98getGreen0d7_KjU();
                fetVar.r(false);
            } else {
                fetVar.e0(-110158460);
                primary = ((ThemeColors) fetVar.k(zfnVar)).getPrimary();
                fetVar.r(false);
            }
            f2 = f;
            v8q0.a(tumVar.d, o7k0.s(jm40Var, f2), primary, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 0, false, 0, 0, null, g1t0.a(), fetVar, 0, 0, 130040);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new svm(mm40Var, (Object) tumVar, f2, i, (byte) 0);
        }
    }

    public static final void v(n0x n0xVar, Function0 function0, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(860030371);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(n0xVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.i(function0) ? 32 : 16;
        }
        byte b = 18;
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = y860.W(lgb.K(o7k0.p(jm40Var, 40.0f, 36.0f)), null, null, false, null, function0, 28);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            if (n0xVar.c()) {
                fetVar2.e0(72196182);
                dww.c(a8k0.F(R.drawable.ufc_champ_header_placeholder, 0, fetVar2), null, o7k0.p(jm40Var, 40.0f, 20.0f), ((StaticColors) fetVar2.k(m8m0.f21378a)).m130getWhite600d7_KjU(), fetVar2, 56, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(72508786);
                mm40 mm40VarP = o7k0.p(jm40Var, 40.0f, 20.0f);
                mm40 mm40VarP2 = o7k0.p(jm40Var, 40.0f, 20.0f);
                Integer numValueOf = Integer.valueOf(R.drawable.ufc_champ_header_placeholder);
                zfn zfnVar = m8m0.f21378a;
                uc9.c(mm40VarP, mm40VarP2, n0xVar, numValueOf, new y3d(((StaticColors) fetVar2.k(zfnVar)).m130getWhite600d7_KjU()), new y3d(((StaticColors) fetVar2.k(zfnVar)).m130getWhite600d7_KjU()), null, gqw0.A, null, fetVar2, ((i2 << 6) & 896) | 12582912, 320);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zma(n0xVar, function0, i, b);
        }
    }

    public static final void w(int i, fet fetVar, mm40 mm40Var, String str, String str2, String str3) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-2089080276);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.g(str3) ? 2048 : 1024;
        }
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(o7k0.e(jm40Var, 72.0f), 32.0f);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarS);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            int i3 = i2 >> 3;
            v8q0.a(str, s5x0.L(jm40Var, 0.0f, 2.0f, 1), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary80(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, i3 & 14, 24960, 110584);
            fetVar2 = fetVar;
            qzb.p(null, str2, null, fetVar2, i3 & 112, 5);
            qzb.p(null, str3, null, fetVar2, (i2 >> 6) & 112, 5);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a0n(mm40Var2, str, str2, str3, i, (byte) 0);
        }
    }

    public static final void x(mm40 mm40Var, y9q0 y9q0Var, long j, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(-1732890138);
        int i2 = i | 6 | (fetVar.g(y9q0Var) ? 32 : 16) | (fetVar.f(j) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            int i3 = 54 | (i2 & 896);
            int i4 = (i2 << 18) & 29360128;
            jm40 jm40Var = jm40.b;
            v8q0.a(Separators.COLON, jm40Var, j, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var, fetVar, i3, i4, 131064);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nol(mm40Var2, y9q0Var, j, i, (byte) 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void y(final String str, final String str2, final y9q0 y9q0Var, final y9q0 y9q0Var2, final long j, final long j2, final ycl yclVar, final float f, final g9q0 g9q0Var, fet fetVar, final int i) {
        fet fetVar2;
        jm40 jm40Var;
        int i2;
        ?? r14;
        int iC;
        fetVar.g0(1245963280);
        int i3 = i | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128) | (fetVar.g(y9q0Var) ? 2048 : 1024) | (fetVar.g(y9q0Var2) ? 16384 : 8192) | (fetVar.f(j) ? 131072 : 65536) | (fetVar.f(j2) ? 1048576 : 524288);
        if ((i & 12582912) == 0) {
            i3 |= fetVar.g(yclVar) ? 8388608 : 4194304;
        }
        int i4 = i3 | (fetVar.d(f) ? 67108864 : 33554432) | (fetVar.g(g9q0Var) ? 536870912 : 268435456);
        if (fetVar.U(i4 & 1, (306783379 & i4) != 306783378)) {
            jm40 jm40Var2 = jm40.b;
            v8q0.a(str, (yclVar == null ? jm40Var2 : o7k0.s(jm40Var2, yclVar.f42389a)).e(new jov0(z12.f43597a)), j, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, y9q0Var, fetVar, ((i4 >> 3) & 14) | ((i4 >> 9) & 896), (i4 << 12) & 29360128, 130040);
            fet fetVar3 = fetVar;
            if (str2 != null) {
                fetVar3.e0(1385479992);
                int iB = si30.b(pkd.b(f, fetVar3));
                boolean zE = ((i4 & 896) == 256) | ((57344 & i4) == 16384) | fetVar3.e(iB);
                Object objP = fetVar3.P();
                if (zE || objP == ukd.f35823a) {
                    jm40Var = jm40Var2;
                    i2 = 0;
                    r14 = 1;
                    objP = g9q0.a(g9q0Var, str2, y9q0Var2, 1, 1, r4e.b(0, iB, 0, 0, 13), null, 968);
                    fetVar3.o0(objP);
                } else {
                    jm40Var = jm40Var2;
                    i2 = 0;
                    r14 = 1;
                }
                a9q0 a9q0Var = (a9q0) objP;
                v8q0.a((!a9q0Var.f() || (iC = a9q0Var.b.c(i2, r14)) <= 0 || str2.length() <= iC) ? str2 : ttm0.L(iC, str2), o7k0.u(jm40Var, 0.0f, f, r14).e(new jov0(z12.f43597a)), j2, null, 0L, null, null, null, 0L, null, 0L, 1, false, 1, 0, null, y9q0Var2, fetVar, (i4 >> 12) & 896, ((i4 << 9) & 29360128) | 24960, 110584);
                fet fetVar4 = fetVar;
                fetVar4.r(i2);
                fetVar2 = fetVar4;
            } else {
                fetVar3.e0(1386796562);
                fetVar3.r(false);
                fetVar2 = fetVar3;
            }
        } else {
            fet fetVar5 = fetVar;
            fetVar5.X();
            fetVar2 = fetVar5;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.mol
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wwb.y(str, str2, y9q0Var, y9q0Var2, j, j2, yclVar, f, g9q0Var, (fet) obj, x8x.L(i | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void z(mm40 mm40Var, wzm wzmVar, wzm wzmVar2, String str, jwm jwmVar, fet fetVar, int i) {
        String str2;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        uso0 uso0Var = uso0.f36223a;
        fetVar2.g0(1894642014);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(wzmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(wzmVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            str2 = str;
            i2 |= fetVar2.g(str2) ? 2048 : 1024;
        } else {
            str2 = str;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? fetVar2.g(jwmVar) : fetVar2.i(jwmVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar2.e(0) ? 131072 : 65536;
        }
        if (fetVar2.U(i2 & 1, (74899 & i2) != 74898)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarH = dw9.h(1.0f, o7k0.e(jm40Var, 72.0f), true);
            int i3 = i2;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarH);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarG = o7k0.g(jm40Var, 16.0f, 0.0f, 2);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarG);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            String str3 = jwmVar.f17257a;
            if (str3 == null) {
                str3 = "";
            }
            v8q0.a(str3, null, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 0, 24960, 110586);
            fetVar2 = fetVar;
            fetVar2.r(true);
            uso0 uso0Var2 = uso0.f36223a;
            t(null, wzmVar, false, fetVar2, i3 & 112);
            uso0 uso0Var3 = uso0.f36223a;
            t(null, wzmVar2, false, fetVar2, (i3 >> 3) & 112);
            fetVar2.r(true);
            if (wzmVar.c.length() <= 0 || wzmVar2.c.length() <= 0) {
                fetVar2.e0(179142848);
                fetVar2.r(false);
            } else {
                fetVar2.e0(178941689);
                w((i3 >> 6) & 112, fetVar2, null, str2, wzmVar.c, wzmVar2.c);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zf(mm40Var2, wzmVar, wzmVar2, str, jwmVar, i);
        }
    }
}
