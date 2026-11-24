package a;

import android.app.KeyguardManager;
import android.content.ComponentName;
import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.fingerprint.FingerprintManager;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.authreminder.impl.CheckAuthReminderBroadcastReceiver;
import org.xplatform.wallet.impl.presentation.dialogs.accountactions.params.AccountActionsScreenParams;

/* JADX INFO: loaded from: classes3.dex */
public final class nhf0 implements lry {
    public static final byte[] e = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f23530a;
    public Object b;
    public Object c;
    public Object d;

    public nhf0(kj5 kj5Var, g8i g8iVar) {
        this.f23530a = g8iVar;
        byte b = 28;
        this.b = n0k0.a(new r5i(this, 1, b));
        this.c = n0k0.a(new r5i(this, 0, b));
        this.d = n0k0.a(new r5i(this, 2, b));
    }

    public static int g(int[] iArr) throws o660 {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            if (i5 > i) {
                i3 = i4;
                i = i5;
            }
            if (i5 > i2) {
                i2 = i5;
            }
        }
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = i8 - i3;
            int i10 = iArr[i8] * i9 * i9;
            if (i10 > i7) {
                i6 = i8;
                i7 = i10;
            }
        }
        if (i3 <= i6) {
            int i11 = i3;
            i3 = i6;
            i6 = i11;
        }
        if (i3 - i6 <= length / 16) {
            throw o660.a();
        }
        int i12 = i3 - 1;
        int i13 = -1;
        int i14 = i12;
        while (i12 > i6) {
            int i15 = i12 - i6;
            int i16 = (i2 - iArr[i12]) * (i3 - i12) * i15 * i15;
            if (i16 > i13) {
                i14 = i12;
                i13 = i16;
            }
            i12--;
        }
        return i14 << 3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object A(int i, zje zjeVar) {
        kwc kwcVar;
        if (zjeVar instanceof kwc) {
            kwcVar = (kwc) zjeVar;
            int i2 = kwcVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kwcVar.k = i2 - Integer.MIN_VALUE;
            } else {
                kwcVar = new kwc(this, zjeVar);
            }
        } else {
            kwcVar = new kwc(this, zjeVar);
        }
        Object obj = kwcVar.i;
        wne wneVar = wne.f39444a;
        int i3 = kwcVar.k;
        yje yjeVar = null;
        if (i3 == 0) {
            z1x.P(obj);
            ((LinkedHashSet) this.c).add(new Integer(i));
            sr50 sr50Var = (sr50) ((n0o0) this.b).getValue();
            rr50 rr50Var = new rr50(i);
            kwcVar.k = 1;
            if (sj3.w0(kwcVar, sr50Var.f32660a, new hk40((Object) sr50Var, (Object) rr50Var, yjeVar, (byte) 17), false, true) == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    public Bundle B() {
        Bundle bundle = new Bundle();
        Integer num = (Integer) this.f23530a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = (Integer) this.b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = (Integer) this.c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = (Integer) this.d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }

    @Override // a.lry
    public void a() {
        ((xzp) this.b).a();
        ((ArrayList) ((mii0) this.c).b).add(new e93((t83) CollectionsKt.v0((ArrayList) this.d)));
    }

    @Override // a.lry
    public void b(g950 g950Var, qlc qlcVar, g950 g950Var2) {
        ((xzp) this.f23530a).b(g950Var, qlcVar, g950Var2);
    }

    @Override // a.lry
    public void c(g950 g950Var, Object obj) {
        ((xzp) this.f23530a).c(g950Var, obj);
    }

    public int d(int i) {
        Boolean bool;
        boolean zBooleanValue;
        BiometricManager biometricManager;
        BiometricPrompt.CryptoObject cryptoObjectW;
        Object objInvoke;
        o58 o58Var = (o58) this.f23530a;
        Boolean bool2 = (Boolean) this.d;
        if (bool2 != null) {
            zBooleanValue = bool2.booleanValue();
        } else {
            if (Build.VERSION.SDK_INT < 35 || (biometricManager = (BiometricManager) this.b) == null) {
                bool = Boolean.FALSE;
                this.d = bool;
            } else {
                try {
                    n58.a(biometricManager, 65536);
                    bool = Boolean.TRUE;
                    this.d = bool;
                } catch (SecurityException unused) {
                    bool = Boolean.FALSE;
                    this.d = bool;
                }
            }
            zBooleanValue = bool.booleanValue();
        }
        if (!zBooleanValue && i == 65536) {
            return 20;
        }
        int i2 = Build.VERSION.SDK_INT;
        int iE = 0;
        int iA = 1;
        if (i2 < 30) {
            if (!hmw0.a0(i)) {
                return -2;
            }
            if (i != 0) {
                Context context = o58Var.f24675a;
                if (((KeyguardManager) context.getSystemService(KeyguardManager.class)) != null) {
                    if (!hmw0.Z(i)) {
                        if (i2 != 29) {
                            if (i2 != 28) {
                                return e();
                            }
                            if (context == null || context.getPackageManager() == null || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                                return 12;
                            }
                            KeyguardManager keyguardManager = (KeyguardManager) o58Var.f24675a.getSystemService(KeyguardManager.class);
                            if (keyguardManager == null ? false : keyguardManager.isDeviceSecure()) {
                                return e() == 0 ? 0 : -1;
                            }
                            return e();
                        }
                        if ((i & 255) == 255) {
                            BiometricManager biometricManager2 = (BiometricManager) this.b;
                            if (biometricManager2 != null) {
                                return m58.a(biometricManager2);
                            }
                            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                            return 1;
                        }
                        Method methodC = m58.c();
                        if (methodC != null && (cryptoObjectW = wwb.W(wwb.B())) != null) {
                            if (i2 == 29) {
                                try {
                                    objInvoke = methodC.invoke((BiometricManager) this.b, cryptoObjectW);
                                } catch (IllegalAccessException e2) {
                                    e = e2;
                                    Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                                } catch (IllegalArgumentException e3) {
                                    e = e3;
                                    Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                                } catch (InvocationTargetException e4) {
                                    e = e4;
                                    Log.w("BiometricManager", "Failed to invoke canAuthenticate(CryptoObject).", e);
                                }
                            } else {
                                objInvoke = null;
                            }
                            if (objInvoke instanceof Integer) {
                                return ((Integer) objInvoke).intValue();
                            }
                            Log.w("BiometricManager", "Invalid return type for canAuthenticate(CryptoObject).");
                        }
                        BiometricManager biometricManager3 = (BiometricManager) this.b;
                        if (biometricManager3 == null) {
                            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
                        } else {
                            iA = m58.a(biometricManager3);
                        }
                        String str = Build.MODEL;
                        if (Build.VERSION.SDK_INT < 30 && str != null) {
                            for (String str2 : context.getResources().getStringArray(R.array.assume_strong_biometrics_models)) {
                                if (str.equals(str2)) {
                                    return iA;
                                }
                            }
                        }
                        if (iA != 0) {
                            return iA;
                        }
                        KeyguardManager keyguardManager2 = (KeyguardManager) o58Var.f24675a.getSystemService(KeyguardManager.class);
                        if (!(keyguardManager2 == null ? false : keyguardManager2.isDeviceSecure())) {
                            iE = e();
                        } else if (e() != 0) {
                            iE = -1;
                        }
                        return iE;
                    }
                    KeyguardManager keyguardManager3 = (KeyguardManager) context.getSystemService(KeyguardManager.class);
                    if (!(keyguardManager3 == null ? false : keyguardManager3.isDeviceSecure())) {
                        return 11;
                    }
                }
            }
            return 12;
        }
        BiometricManager biometricManager4 = (BiometricManager) this.b;
        if (biometricManager4 == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
            return 1;
        }
        int iA2 = n58.a(biometricManager4, i);
        if (iA2 != 7) {
            if (iA2 != 21) {
                return iA2;
            }
            return 1;
        }
        return 0;
    }

    public int e() {
        ieq ieqVar = (ieq) this.c;
        if (ieqVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        Context context = ieqVar.f14646a;
        FingerprintManager fingerprintManagerB = geq.b(context);
        if (fingerprintManagerB == null || !geq.d(fingerprintManagerB)) {
            return 12;
        }
        FingerprintManager fingerprintManagerB2 = geq.b(context);
        return (fingerprintManagerB2 == null || !geq.c(fingerprintManagerB2)) ? 11 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    public Object f(boolean z, boolean z2, yje yjeVar) {
        qk3 qk3Var;
        String str;
        boolean z3;
        boolean z4;
        boolean z5;
        nmo nmoVar;
        String str2;
        boolean z6 = z;
        boolean z7 = z2;
        j1q0 j1q0Var = (j1q0) this.f23530a;
        if (yjeVar instanceof qk3) {
            qk3Var = (qk3) yjeVar;
            int i = qk3Var.s;
            if ((i & Integer.MIN_VALUE) != 0) {
                qk3Var.s = i - Integer.MIN_VALUE;
            } else {
                qk3Var = new qk3(this, yjeVar);
            }
        } else {
            qk3Var = new qk3(this, yjeVar);
        }
        qk3 qk3Var2 = qk3Var;
        Object obj = qk3Var2.q;
        wne wneVar = wne.f39444a;
        int i2 = qk3Var2.s;
        if (i2 == 0) {
            z1x.P(obj);
            esg0 esg0Var = (esg0) ((fvt0) this.b).f10231a;
            vby vbyVar = (vby) esg0Var.f8326a;
            yk50 yk50Var = new yk50((gii0) esg0Var.b, (byte) 7);
            us3 us3Var = (us3) esg0Var.c;
            z8w0 z8w0Var = (z8w0) esg0Var.d;
            hk3 hk3Var = (hk3) esg0Var.e;
            mne mneVarH = ((psc) ((cad) esg0Var.f).b).h();
            x1x.x(mneVarH);
            vbyVar.getClass();
            us3Var.getClass();
            hk3Var.getClass();
            esg0 esg0Var2 = new esg0();
            esg0Var2.f8326a = vbyVar;
            esg0Var2.b = yk50Var;
            esg0Var2.c = us3Var;
            esg0Var2.d = z8w0Var;
            esg0Var2.e = hk3Var;
            esg0Var2.f = mneVarH;
            nmo nmoVar2 = new nmo(esg0Var2);
            String strC = q7d0.c(j1q0Var.f15748a.f21021a, "FAKE_WORDS_ENABLED");
            if (strC == null) {
                strC = "";
            }
            String str3 = strC;
            boolean z8 = axq.z(j1q0Var.f15748a.f21021a, "OVERRIDE_UPDATE", false);
            String strA = ((ntu) this.c).a();
            x0u x0uVar = (x0u) this.d;
            qk3Var2.n = nmoVar2;
            qk3Var2.o = str3;
            qk3Var2.p = strA;
            qk3Var2.i = z6;
            qk3Var2.j = z7;
            qk3Var2.k = z6;
            qk3Var2.l = z7;
            qk3Var2.m = z8;
            qk3Var2.s = 1;
            Object objC = x0uVar.c(qk3Var2);
            if (objC != wneVar) {
                obj = objC;
                str = str3;
                z3 = z8;
                z4 = z6;
                z5 = z7;
                nmoVar = nmoVar2;
                str2 = strA;
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
        boolean z9 = qk3Var2.m;
        boolean z10 = qk3Var2.l;
        boolean z11 = qk3Var2.k;
        boolean z12 = qk3Var2.j;
        boolean z13 = qk3Var2.i;
        String str4 = qk3Var2.p;
        String str5 = qk3Var2.o;
        nmo nmoVar3 = qk3Var2.n;
        z1x.P(obj);
        z3 = z9;
        str = str5;
        z5 = z10;
        z6 = z13;
        nmoVar = nmoVar3;
        str2 = str4;
        z4 = z11;
        z7 = z12;
        int iIntValue = ((Number) obj).intValue();
        qk3Var2.n = null;
        qk3Var2.o = null;
        qk3Var2.p = null;
        qk3Var2.i = z6;
        qk3Var2.j = z7;
        qk3Var2.s = 2;
        Object objH = nmoVar.h(z4, z5, str, z3, str2, iIntValue, qk3Var2);
        return objH == wneVar ? wneVar : objH;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable h(long j, zje zjeVar) throws zhi0 {
        dy dyVar;
        if (zjeVar instanceof dy) {
            dyVar = (dy) zjeVar;
            int i = dyVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                dyVar.k = i - Integer.MIN_VALUE;
            } else {
                dyVar = new dy(this, zjeVar);
            }
        } else {
            dyVar = new dy(this, zjeVar);
        }
        Object objD0 = dyVar.i;
        wne wneVar = wne.f39444a;
        int i2 = dyVar.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objD0);
            dvj dvjVar = ((mne) this.b).b;
            ey eyVar = new ey((Object) this, j, yjeVar, (byte) 0);
            dyVar.k = 1;
            objD0 = qjj.d0(dvjVar, eyVar, dyVar);
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
        ly lyVar = (ly) objD0;
        String str = lyVar.b;
        if (str != null && str.length() > 0) {
            throw new zhi0(lyVar.b, lyVar.c, (Integer) null, 12);
        }
        List<md6> list = lyVar.f20840a;
        if (list == null) {
            jf4.k(null);
            return null;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (md6 md6Var : list) {
            md6Var.getClass();
            Long l = md6Var.f21582a;
            long jLongValue = l != null ? l.longValue() : 0L;
            String str2 = md6Var.b;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = md6Var.d;
            if (str3 == null) {
                str3 = "";
            }
            List list2 = md6Var.c;
            if (list2 == null) {
                list2 = iun.f15405a;
            }
            String str4 = md6Var.f;
            if (str4 == null) {
                str4 = "";
            }
            List list3 = md6Var.e;
            if (list3 == null) {
                list3 = iun.f15405a;
            }
            Boolean bool = md6Var.g;
            int iIntValue = 0;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            String str5 = md6Var.h;
            String str6 = str5 != null ? str5 : "";
            Integer num = md6Var.i;
            int iIntValue2 = num != null ? num.intValue() : 0;
            Integer num2 = md6Var.j;
            if (num2 != null) {
                iIntValue = num2.intValue();
            }
            arrayList.add(new cy(jLongValue, str2, str3, list2, str4, list3, zBooleanValue, str6, iIntValue2, iIntValue));
        }
        return arrayList;
    }

    @Override // a.lry
    public lry i(qlc qlcVar, g950 g950Var) {
        return ((xzp) this.f23530a).i(qlcVar, g950Var);
    }

    @Override // a.lry
    public mry j(g950 g950Var) {
        return ((xzp) this.f23530a).j(g950Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object k(zje zjeVar) {
        jwc jwcVar;
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.c;
        if (zjeVar instanceof jwc) {
            jwcVar = (jwc) zjeVar;
            int i = jwcVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                jwcVar.k = i - Integer.MIN_VALUE;
            } else {
                jwcVar = new jwc(this, zjeVar);
            }
        } else {
            jwcVar = new jwc(this, zjeVar);
        }
        Object objW0 = jwcVar.i;
        wne wneVar = wne.f39444a;
        int i2 = jwcVar.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objW0);
            List listL0 = CollectionsKt.L0(linkedHashSet);
            if (!listL0.isEmpty()) {
                return listL0;
            }
            sr50 sr50Var = (sr50) ((n0o0) this.b).getValue();
            jwcVar.k = 1;
            objW0 = sj3.w0(jwcVar, sr50Var.f32660a, new st20(2, yjeVar, (byte) 6), true, false);
            if (objW0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objW0);
        }
        List list = (List) objW0;
        linkedHashSet.addAll(list);
        return list;
    }

    public String l() {
        mbe mbeVarM = m();
        String str = ((pru) this.b).a().j0;
        if (mbeVarM == mbe.f21502a) {
            return "wss://mobilaserverstest.xyz/supphelper/v2/widget";
        }
        if (mbeVarM == mbe.c) {
            return "wss://consdesk.com/widget/stage/api/v2/widget";
        }
        if (mbeVarM == mbe.d) {
            return String.format("wss://webx-consultant-widget-v2-%s.antflatair.com/services/widget/v2/widget", Arrays.copyOf(new Object[]{((j1q0) this.f23530a).f15748a.n().b}, 1));
        }
        return str.length() == 0 ? kng0.l("wss://", kotlin.text.c.r(((ntu) this.c).a(), "https://", "", false), "/supphelper/v2/widget") : kng0.l("wss://", str, "/widget/v2/widget");
    }

    public mbe m() {
        z0q0 z0q0VarN = ((j1q0) this.f23530a).f15748a.n();
        if (z0q0VarN.f) {
            return mbe.c;
        }
        if (z0q0VarN.d) {
            return mbe.b;
        }
        if (z0q0VarN.e) {
            return mbe.f21502a;
        }
        return z0q0VarN.c ? mbe.d : mbe.e;
    }

    @Override // a.lry
    public void n(g950 g950Var, tlc tlcVar) {
        ((xzp) this.f23530a).n(g950Var, tlcVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    public Serializable o(String str, String str2, int i, boolean z, zje zjeVar) {
        pn1 pn1Var;
        String str3;
        ?? arrayList;
        ?? arrayList2;
        String strZ;
        knf0 knf0Var = (knf0) this.b;
        if (zjeVar instanceof pn1) {
            pn1Var = (pn1) zjeVar;
            int i2 = pn1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pn1Var.l = i2 - Integer.MIN_VALUE;
            } else {
                pn1Var = new pn1(this, zjeVar);
            }
        } else {
            pn1Var = new pn1(this, zjeVar);
        }
        pn1 pn1Var2 = pn1Var;
        Object objL = pn1Var2.j;
        wne wneVar = wne.f39444a;
        int i3 = pn1Var2.l;
        if (i3 == 0) {
            z1x.P(objL);
            xzp xzpVar = (xzp) this.f23530a;
            boolean zA = ((j1q0) this.d).f15748a.a();
            int iB = knf0Var.b();
            String strA = ((kuy) this.c).a();
            str3 = str2;
            pn1Var2.i = str3;
            pn1Var2.l = 1;
            bx0 bx0Var = (bx0) ((il1) xzpVar.d).invoke();
            m2c0 m2c0VarA = ((x2c0) xzpVar.b).a();
            Integer intOrNull = m2c0VarA != null ? StringsKt.toIntOrNull(m2c0VarA.c) : null;
            str.getClass();
            LinkedHashMap linkedHashMapH = xp20.h(new Pair("whence", 22), new Pair("fcountry", Integer.valueOf(iB)), new Pair("ref", 1), new Pair("lng", strA), new Pair("gr", 1357), new Pair("nameSubstr", str), new Pair("gamesCount", Integer.valueOf(i)));
            if (zA) {
                linkedHashMapH.put("test", Boolean.valueOf(zA));
            }
            if (intOrNull != null) {
                linkedHashMapH.put("country", intOrNull);
            }
            objL = bx0Var.l(linkedHashMapH, z, "application/vnd.xenvelop+json", new fk9(false), pn1Var2);
            if (objL == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str4 = pn1Var2.i;
            z1x.P(objL);
            str3 = str4;
        }
        ay0 ay0Var = (ay0) ((dx5) objL).a();
        str3.getClass();
        List<zt0> list = ay0Var.f1647a;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (zt0 zt0Var : list) {
                zt0Var.getClass();
                Long l = zt0Var.f44932a;
                String str5 = zt0Var.s;
                long jLongValue = l != null ? l.longValue() : 0L;
                Long l2 = zt0Var.b;
                long jLongValue2 = l2 != null ? l2.longValue() : 0L;
                Long l3 = zt0Var.c;
                long jLongValue3 = l3 != null ? l3.longValue() : 0L;
                String str6 = zt0Var.f;
                String str7 = str6 == null ? "" : str6;
                String str8 = zt0Var.g;
                String str9 = str8 == null ? "" : str8;
                if (str5 == null || str5.length() == 0) {
                    String str10 = zt0Var.r;
                    if (str10 == null) {
                        str10 = "";
                    }
                    strZ = saj.Z(str3, str10);
                } else {
                    strZ = saj.Z(str3, str5);
                }
                String str11 = strZ;
                Boolean bool = zt0Var.h;
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                Boolean bool2 = zt0Var.j;
                boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                Boolean bool3 = zt0Var.i;
                boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
                Boolean bool4 = zt0Var.x;
                boolean zBooleanValue4 = bool4 != null ? bool4.booleanValue() : false;
                Boolean bool5 = zt0Var.w;
                boolean zBooleanValue5 = (bool5 == null && (bool5 = zt0Var.v) == null) ? false : bool5.booleanValue();
                Boolean bool6 = zt0Var.u;
                Boolean bool7 = Boolean.FALSE;
                boolean zD = Intrinsics.d(bool6, bool7);
                boolean zD2 = Intrinsics.d(zt0Var.k, bool7);
                List list2 = zt0Var.t;
                if (list2 == null) {
                    list2 = iun.f15405a;
                }
                List list3 = list2;
                Boolean bool8 = zt0Var.y;
                arrayList.add(new mlr(jLongValue, jLongValue2, jLongValue3, 0L, str7, str9, str11, (String) null, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, zBooleanValue5, zD, zD2, list3, bool8 != null ? bool8.booleanValue() : false, 131200));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        List<vt0> list4 = ay0Var.b;
        if (list4 != null) {
            arrayList2 = new ArrayList(r3d.q(list4, 10));
            for (vt0 vt0Var : list4) {
                Long l4 = vt0Var.f37978a;
                long jLongValue4 = l4 != null ? l4.longValue() : 0L;
                String str12 = vt0Var.b;
                String str13 = str12 == null ? "" : str12;
                String str14 = vt0Var.c;
                String str15 = str14 == null ? "" : str14;
                Long l5 = vt0Var.e;
                long jLongValue5 = l5 != null ? l5.longValue() : 0L;
                String str16 = vt0Var.j;
                arrayList2.add(new t0s(jLongValue4, jLongValue5, str13, str15, str16 == null ? "" : str16));
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = iun.f15405a;
        }
        return new Pair(arrayList, arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v4, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    public Object p(int i, zje zjeVar, String str, String str2) {
        pb7 pb7Var;
        ?? arrayList;
        if (zjeVar instanceof pb7) {
            pb7Var = (pb7) zjeVar;
            int i2 = pb7Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pb7Var.k = i2 - Integer.MIN_VALUE;
            } else {
                pb7Var = new pb7(this, zjeVar);
            }
        } else {
            pb7Var = new pb7(this, zjeVar);
        }
        pb7 pb7Var2 = pb7Var;
        Object objD = pb7Var2.i;
        wne wneVar = wne.f39444a;
        int i3 = pb7Var2.k;
        List list = null;
        if (i3 == 0) {
            z1x.P(objD);
            peg0 peg0Var = (peg0) this.f23530a;
            String strA = ((btt0) this.b).a();
            String strA2 = ((kuy) this.d).a();
            pb7Var2.k = 1;
            objD = ((wb7) ((zm) peg0Var.b).invoke()).d(strA, strA2, str, str2, i, pb7Var2);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD);
        }
        p0y p0yVar = (p0y) ((dx5) objD).a();
        String str3 = p0yVar.c;
        if (str3 == null) {
            jf4.k(null);
            return null;
        }
        Long l = p0yVar.f26175a;
        long jLongValue = l != null ? l.longValue() : 0L;
        Integer num = p0yVar.b;
        i0w i0wVarM = kkb.M(num != null ? num.intValue() : 0);
        Double d = p0yVar.d;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        Double d2 = p0yVar.e;
        double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
        Double d3 = p0yVar.j;
        double dDoubleValue3 = d3 != null ? d3.doubleValue() : 0.0d;
        Integer num2 = p0yVar.h;
        q4f q4fVar = (num2 != null && num2.intValue() == 8) ? q4f.y : q4f.b;
        String str4 = p0yVar.m;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = str4;
        List<j0y> list2 = p0yVar.o;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (j0y j0yVar : list2) {
                List list3 = j0yVar.i;
                if (list3 != null) {
                    arrayList = new ArrayList(r3d.q(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(u4n0.w((g2y) it.next(), j0yVar));
                    }
                } else {
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = iun.f15405a;
                }
                w3d.u(arrayList2, arrayList);
            }
            list = arrayList2;
        }
        if (list == null) {
            list = iun.f15405a;
        }
        List list4 = list;
        pxu pxuVar = p0yVar.p;
        return new z7y(str3, q4fVar, dDoubleValue2, jLongValue, i0wVarM, dDoubleValue3, dDoubleValue, "", list4, str5, pxuVar != null ? dyb.n0(pxuVar) : hxu.h);
    }

    public md80 q(ch chVar) {
        List listH = ((tqt) this.b).h(chVar);
        ArrayList arrayList = new ArrayList();
        Iterator it = listH.iterator();
        while (it.hasNext()) {
            w3d.u(arrayList, ((wtr0) it.next()).b);
        }
        return (md80) CollectionsKt.s0(arrayList, f1e0.f8761a);
    }

    public String r() {
        int iOrdinal = m().ordinal();
        if (iOrdinal == 0) {
            return "5d2da47eba3bc6235061b4de";
        }
        if (iOrdinal == 1) {
            return "5b03f86ffdf01028c442b5de";
        }
        if (iOrdinal == 2) {
            return "5d2da47eba3bc6235061b4de";
        }
        if (iOrdinal == 3) {
            return ((j1q0) this.f23530a).f15748a.n().f43582a;
        }
        if (iOrdinal == 4) {
            return ((pru) this.b).a().r;
        }
        t9f.b();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Object s(int i, zje zjeVar, String str) {
        qb7 qb7Var;
        knf0 knf0Var = (knf0) this.c;
        if (zjeVar instanceof qb7) {
            qb7Var = (qb7) zjeVar;
            int i2 = qb7Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qb7Var.k = i2 - Integer.MIN_VALUE;
            } else {
                qb7Var = new qb7(this, zjeVar);
            }
        } else {
            qb7Var = new qb7(this, zjeVar);
        }
        qb7 qb7Var2 = qb7Var;
        Object objC = qb7Var2.i;
        wne wneVar = wne.f39444a;
        int i3 = qb7Var2.k;
        if (i3 == 0) {
            z1x.P(objC);
            peg0 peg0Var = (peg0) this.f23530a;
            String strA = ((btt0) this.b).a();
            knf0Var.getClass();
            String strA2 = ((kuy) this.d).a();
            qb7Var2.k = 1;
            objC = ((wb7) ((zm) peg0Var.b).invoke()).c(strA, "application/vnd.xenvelop+json", 1, 22, strA2, str, i, qb7Var2);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        return n8n0.n((lor0) ((dx5) objC).a());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Serializable t(long j, Long l, Long l2, String str, boolean z, Integer num, zje zjeVar) {
        kk5 kk5Var;
        if (zjeVar instanceof kk5) {
            kk5Var = (kk5) zjeVar;
            int i = kk5Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                kk5Var.k = i - Integer.MIN_VALUE;
            } else {
                kk5Var = new kk5(this, zjeVar);
            }
        } else {
            kk5Var = new kk5(this, zjeVar);
        }
        kk5 kk5Var2 = kk5Var;
        Object objA = kk5Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = kk5Var2.k;
        if (i2 == 0) {
            z1x.P(objA);
            fvt0 fvt0Var = (fvt0) this.b;
            String strA = ((btt0) this.d).a();
            String strC = ((knf0) this.c).c();
            kk5Var2.k = 1;
            objA = ((nes0) fvt0Var.f10231a).a(strA, strC, j, l, l2, str, z, num, "application/vnd.xenvelop+json", kk5Var2);
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
        Iterable iterable = (Iterable) ((dx5) objA).a();
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        int i3 = 0;
        for (Object obj : iterable) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                q3d.p();
                throw null;
            }
            fgs0 fgs0Var = (fgs0) obj;
            fgs0Var.getClass();
            Long l3 = fgs0Var.f9507a;
            long jLongValue = l3 != null ? l3.longValue() : 0L;
            Long l4 = fgs0Var.b;
            long jLongValue2 = l4 != null ? l4.longValue() : 0L;
            Integer num2 = fgs0Var.c;
            int iIntValue = num2 != null ? num2.intValue() : 0;
            Double d = fgs0Var.d;
            double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
            String str2 = fgs0Var.f;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            String str4 = fgs0Var.h;
            if (str4 != null) {
                str3 = str4;
            }
            arrayList.add(new zfs0(jLongValue, jLongValue2, iIntValue, dDoubleValue, str2, str3, "", i3));
            i3 = i4;
        }
        return arrayList;
    }

    public ouj0 u(long j, double d, boolean z, boolean z2, String str, ex4 ex4Var, ru6 ru6Var, double d2) {
        long jA = ((x1u) this.f23530a).a();
        pn40 pn40Var = pn40.f27267a;
        String strC = pn40.c(d, p3u0.c);
        List listC = kotlin.collections.a.c(ru6Var);
        q4f q4fVar = q4f.c;
        int iA = q4fVar.a();
        byte b = ((vyt) this.b).a().f8665a;
        iun iunVar = iun.f15405a;
        return new ouj0(jA, j, strC, z2, listC, iA, b, false, iunVar, iunVar, 0L, ((vn7) this.c).f37705a.b().getId(), ((zlt0) this.d).k() && d > d2 && d2 != 0.0d, z, str, null, ex4Var, "", q4fVar, false, false, null, null, 0.0d, null);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:56:0x0100  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
    
        if (r13.p(r0, r14, r15) == r9) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0102, code lost:
    
        if (r12 == r9) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object v(a.xvs r13, a.h9n0 r14, a.zje r15) throws a.n7p {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nhf0.v(a.xvs, a.h9n0, a.zje):java.lang.Object");
    }

    public Object w(bnn0 bnn0Var) {
        Set setB;
        HashMap map = new HashMap();
        Iterator it = ((usc) this.f23530a).f36204a.c().iterator();
        while (it.hasNext()) {
            Integer num = new Integer(((ujr0) it.next()).k);
            switch (((ctu) this.d).f4960a.r().c.ordinal()) {
                case 1:
                case 3:
                case 6:
                case 7:
                    setB = cui0.b((md80) CollectionsKt.s0(q3d.j(md80.P1, md80.X, md80.P2), f1e0.f8761a));
                    break;
                case 2:
                    setB = cui0.b(q(ch.b));
                    break;
                case 4:
                    setB = cui0.b(q(ch.f4338a));
                    break;
                case 5:
                case 8:
                case 9:
                    setB = cui0.b((md80) CollectionsKt.s0(q3d.j(md80.P1TB, md80.P1TM, md80.X, md80.P2TB, md80.P2TM), f1e0.f8761a));
                    break;
                default:
                    jf4.o("SUCCESS: Unknown toto type");
                    return null;
            }
            map.put(num, setB);
        }
        Object objN = ((ctu) this.c).f4960a.n(map, bnn0Var);
        wne wneVar = wne.f39444a;
        if (objN != wneVar) {
            objN = Unit.f46060a;
        }
        return objN == wneVar ? objN : Unit.f46060a;
    }

    public void x(fzs0 fzs0Var) {
        on4 on4Var = (on4) ((lrc) this.c).b;
        if (((gqt) this.f23530a).a()) {
            us00 us00Var = on4Var.f25529a.f20325a;
            us00Var.getPackageManager().setComponentEnabledSetting(new ComponentName(us00Var, (Class<?>) CheckAuthReminderBroadcastReceiver.class), 2, 1);
        } else {
            List listC = ((gqt) this.b).f11749a.c();
            if (listC == null || !listC.isEmpty()) {
                Iterator it = listC.iterator();
                while (it.hasNext()) {
                    if (!((mn4) it.next()).b) {
                    }
                }
                us00 us00Var2 = on4Var.f25529a.f20325a;
                us00Var2.getPackageManager().setComponentEnabledSetting(new ComponentName(us00Var2, (Class<?>) CheckAuthReminderBroadcastReceiver.class), 2, 1);
            } else {
                us00 us00Var3 = on4Var.f25529a.f20325a;
                us00Var3.getPackageManager().setComponentEnabledSetting(new ComponentName(us00Var3, (Class<?>) CheckAuthReminderBroadcastReceiver.class), 2, 1);
            }
        }
        ort ortVar = (ort) this.d;
        ortVar.f25751a.g(new mn4(fzs0Var.b(), true));
    }

    public boolean y() {
        boolean z = ((k9c) this.c).a() != ((wtt) this.d).f39758a.e.f36291a.a().getBoolean("PreviewServiceStatusLocalDataSource.CACHE_AUTHORIZED_KEY", false);
        if (z) {
            pbt pbtVar = ((yoc) this.f23530a).f42977a;
            pbtVar.d.f26269a.h("GAME_ACTIONS_KEY");
            pbtVar.e.a();
            pbt pbtVar2 = ((yoc) this.b).f42977a;
            g7d g7dVar = pbtVar2.c;
            g7dVar.e(null);
            g7dVar.g.n(xun.f41520a);
            pbtVar2.e.a();
        }
        return z;
    }

    public dgu z() {
        mne mneVarH = ((psc) ((cad) this.f23530a).b).h();
        x1x.x(mneVarH);
        return new dgu(mneVarH, new u8u((gii0) this.b, (byte) 27), (izy) ((n5d0) this.d).get(), (knf0) this.c);
    }

    public nhf0() {
        this.f23530a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    public nhf0(rrc rrcVar) {
        this.f23530a = rrcVar;
        this.b = maz.b(new h8a(this, (byte) 19));
        this.c = new LinkedHashSet();
        this.d = new CopyOnWriteArrayList();
    }

    public nhf0(h03 h03Var, mne mneVar, knf0 knf0Var, btt0 btt0Var) {
        knf0Var.getClass();
        btt0Var.getClass();
        this.f23530a = h03Var;
        this.b = mneVar;
        this.c = knf0Var;
        this.d = btt0Var;
    }

    public nhf0(lpb lpbVar, knf0 knf0Var, btt0 btt0Var, mne mneVar) {
        knf0Var.getClass();
        btt0Var.getClass();
        this.f23530a = lpbVar;
        this.b = knf0Var;
        this.c = btt0Var;
        this.d = mneVar;
    }

    public nhf0(j1q0 j1q0Var, fvt0 fvt0Var, ntu ntuVar, x0u x0uVar) {
        j1q0Var.getClass();
        this.f23530a = j1q0Var;
        this.b = fvt0Var;
        this.c = ntuVar;
        this.d = x0uVar;
    }

    public nhf0(au0 au0Var, bn6 bn6Var, b4j b4jVar, ix0 ix0Var, String str) {
        this.f23530a = au0Var;
        this.b = bn6Var;
        this.c = b4jVar;
        this.d = ix0Var;
    }

    public nhf0(q7d0 q7d0Var, knf0 knf0Var, fvt0 fvt0Var, mne mneVar) {
        q7d0Var.getClass();
        knf0Var.getClass();
        this.f23530a = q7d0Var;
        this.b = knf0Var;
        this.c = fvt0Var;
        this.d = mneVar;
    }

    public nhf0(h03 h03Var, knf0 knf0Var, btt0 btt0Var, mne mneVar) {
        knf0Var.getClass();
        btt0Var.getClass();
        this.f23530a = h03Var;
        this.b = knf0Var;
        this.c = btt0Var;
        this.d = mneVar;
    }

    public nhf0(xzp xzpVar, knf0 knf0Var, kuy kuyVar, j1q0 j1q0Var) {
        knf0Var.getClass();
        kuyVar.getClass();
        j1q0Var.getClass();
        this.f23530a = xzpVar;
        this.b = knf0Var;
        this.c = kuyVar;
        this.d = j1q0Var;
    }

    public nhf0(peg0 peg0Var, btt0 btt0Var, knf0 knf0Var, kuy kuyVar) {
        btt0Var.getClass();
        knf0Var.getClass();
        kuyVar.getClass();
        this.f23530a = peg0Var;
        this.b = btt0Var;
        this.c = knf0Var;
        this.d = kuyVar;
    }

    public nhf0(vi5 vi5Var, fvt0 fvt0Var, knf0 knf0Var, btt0 btt0Var) {
        vi5Var.getClass();
        knf0Var.getClass();
        btt0Var.getClass();
        this.f23530a = vi5Var;
        this.b = fvt0Var;
        this.c = knf0Var;
        this.d = btt0Var;
    }

    public nhf0(mjq mjqVar) {
        this.f23530a = mjqVar;
        this.b = e;
        this.c = new int[32];
    }

    public nhf0(cad cadVar, AccountActionsScreenParams accountActionsScreenParams, ctf0 ctf0Var) {
        this.f23530a = accountActionsScreenParams;
        this.b = ctf0Var;
        this.c = cadVar;
        this.d = new t5i(this, (byte) 0);
    }

    public nhf0(y58 y58Var, eg3 eg3Var, i1w0 i1w0Var) {
        this.f23530a = y58Var;
        this.b = i1w0Var;
        this.c = eg3Var;
        this.d = new n8i(this, (byte) 25);
    }

    public nhf0(j2a j2aVar, wy9 wy9Var, u3a u3aVar, trm0 trm0Var) {
        j2aVar.getClass();
        wy9Var.getClass();
        u3aVar.getClass();
        trm0Var.getClass();
        this.f23530a = j2aVar;
        this.b = wy9Var;
        this.c = u3aVar;
        this.d = trm0Var;
    }

    public nhf0(cad cadVar, duj dujVar, g2v g2vVar, ul9 ul9Var) {
        this.f23530a = ul9Var;
        this.b = cadVar;
        this.c = dujVar;
        this.d = n0k0.a(new uci(this, (byte) 17));
    }

    public nhf0(cad cadVar, knf0 knf0Var, gii0 gii0Var) {
        this.f23530a = cadVar;
        this.b = gii0Var;
        this.c = knf0Var;
        this.d = mbl.b(new p8i((byte) 6));
    }

    public nhf0(fhj fhjVar, ctf0 ctf0Var, i1w0 i1w0Var, wdk0 wdk0Var) {
        this.f23530a = fhjVar;
        this.b = ctf0Var;
        this.c = i1w0Var;
        this.d = new pai(this, (byte) 25);
    }

    public /* synthetic */ nhf0(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f23530a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public nhf0(xzp xzpVar, mii0 mii0Var, ArrayList arrayList) {
        this.b = xzpVar;
        this.c = mii0Var;
        this.d = arrayList;
        this.f23530a = xzpVar;
    }

    public nhf0(j1q0 j1q0Var, pru pruVar, ntu ntuVar, yox yoxVar, uf3 uf3Var, kl5 kl5Var) {
        this.f23530a = j1q0Var;
        this.b = pruVar;
        this.c = ntuVar;
        this.d = yoxVar;
    }

    public nhf0(AudioTrack audioTrack, do20 do20Var) {
        this.f23530a = audioTrack;
        this.b = do20Var;
        Handler handlerN = vtt0.n(null);
        this.c = handlerN;
        AudioRouting.OnRoutingChangedListener onRoutingChangedListener = new AudioRouting.OnRoutingChangedListener() { // from class: a.h44
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                nhf0 nhf0Var = this.f12416a;
                if (((h44) nhf0Var.d) == null) {
                    return;
                }
                kc5.P0().execute(new fy2(nhf0Var, audioRouting, (byte) 9));
            }
        };
        this.d = onRoutingChangedListener;
        audioTrack.addOnRoutingChangedListener(onRoutingChangedListener, handlerN);
    }

    public nhf0(o58 o58Var) {
        Context context = o58Var.f24675a;
        this.d = null;
        this.f23530a = o58Var;
        int i = Build.VERSION.SDK_INT;
        this.b = i >= 29 ? m58.b(context) : null;
        this.c = i <= 29 ? new ieq(context) : null;
    }
}
