package a;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import android.util.SparseArray;
import android.view.Surface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.zzaia;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.TotpMultiFactorInfo;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzaj;
import com.google.firebase.auth.internal.zzao;
import com.huawei.hms.android.HwBuildEx;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import okhttp3.RequestBody$Companion$toRequestBody$3;

/* JADX INFO: loaded from: classes.dex */
public final class trm0 implements cfr, ngw0, nmw0, bfr, r2x0, v8x0 {
    public static trm0 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34427a;
    public final Object b;
    public Object c;

    public trm0(gii0 gii0Var, byte b) {
        this.f34427a = b;
        gii0Var.getClass();
        switch (b) {
            case 5:
                this.b = gii0Var;
                this.c = new h3q0((Object) this, (byte) 23);
                break;
            case 7:
                this.b = gii0Var;
                this.c = new qir0(this, (byte) 17);
                break;
            case 9:
                this.b = gii0Var;
                this.c = new rbt0(this, (byte) 2);
                break;
            case 13:
                this.b = gii0Var;
                this.c = new rbt0(this, (byte) 18);
                break;
            case 15:
                this.b = gii0Var;
                this.c = new rbt0(this, (byte) 28);
                break;
            default:
                this.b = gii0Var;
                this.c = new nxo0(this, (byte) 11);
                break;
        }
    }

    public static trm0 q(Context context, String str) {
        ok50 ok50VarT;
        trm0 trm0Var = d;
        if (trm0Var == null || !((String) trm0Var.b).equals(str)) {
            try {
                mqw0.a();
                ok50VarT = t(context, str);
            } catch (IOException | GeneralSecurityException e) {
                f140.r("Exception encountered during crypto setup:\n", e.getMessage(), "FirebearStorageCryptoHelper");
                if (e instanceof GeneralSecurityException) {
                    context.getSharedPreferences("com.google.firebase.auth.api.crypto.".concat(str), 0).edit().remove("StorageCryptoKeyset").apply();
                    try {
                        ok50VarT = t(context, str);
                    } catch (IOException | GeneralSecurityException e2) {
                        f140.r("Exception encountered during second attempt to crypto setup:\n", e2.getMessage(), "FirebearStorageCryptoHelper");
                        ok50VarT = null;
                    }
                } else {
                    ok50VarT = null;
                }
            }
            d = new trm0(str, ok50VarT, (byte) 21);
        }
        return d;
    }

    public static ok50 t(Context context, String str) {
        sd60 sd60Var = new sd60((byte) 14);
        String strConcat = "com.google.firebase.auth.api.crypto.".concat(str);
        if (context == null) {
            jf4.o("need an Android context");
            return null;
        }
        sd60Var.b = context;
        sd60Var.c = "StorageCryptoKeyset";
        sd60Var.d = strConcat;
        sd60Var.h = pqw0.b;
        String strConcat2 = "android-keystore://firebear_main_key_id_for_storage_crypto.".concat(str);
        if (strConcat2.startsWith("android-keystore://")) {
            sd60Var.e = strConcat2;
            return sd60Var.u();
        }
        jf4.o("key URI must start with android-keystore://");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0221  */
    /* JADX WARN: Code duplicated, block: B:56:0x0276  */
    /* JADX WARN: Code duplicated, block: B:58:0x028a  */
    /* JADX WARN: Code duplicated, block: B:64:0x028d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7, types: [a.u4w0, a.xcm0] */
    /* JADX WARN: Type inference failed for: r2v8, types: [a.u4w0, a.xcm0] */
    public Object a(xcm0 xcm0Var, u4w0 u4w0Var, zje zjeVar) {
        x8w0 x8w0Var;
        long jCurrentTimeMillis;
        xcm0 xcm0Var2;
        wne wneVar;
        String str;
        long j;
        ?? r2;
        String str2;
        Object objE;
        String str3;
        String str4;
        int i;
        StringBuilder sb;
        char[] charArray;
        int length;
        int i2;
        char c;
        int i3;
        u4w0 u4w0Var2 = u4w0Var;
        h0q0 h0q0Var = (h0q0) this.b;
        tgk tgkVar = (tgk) ((rrc) this.c).b;
        if (zjeVar instanceof x8w0) {
            x8w0Var = (x8w0) zjeVar;
            int i4 = x8w0Var.p;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                x8w0Var.p = i4 - Integer.MIN_VALUE;
            } else {
                x8w0Var = new x8w0(this, zjeVar);
            }
        } else {
            x8w0Var = new x8w0(this, zjeVar);
        }
        Object objI = x8w0Var.n;
        wne wneVar2 = wne.f39444a;
        int i5 = x8w0Var.p;
        if (i5 == 0) {
            z1x.P(objI);
            jCurrentTimeMillis = System.currentTimeMillis();
            tgkVar.getClass();
            String str5 = Build.MANUFACTURER;
            str5.getClass();
            tgkVar.getClass();
            String strC = tgk.c();
            tgkVar.getClass();
            tgk.i();
            String strConcat = Build.VERSION.RELEASE;
            if (!StringsKt.P(strConcat, '.')) {
                strConcat = strConcat.concat(".0");
            }
            int i6 = u4w0Var2.f35071a;
            int i7 = u4w0Var2.b;
            tgkVar.getClass();
            int iH = tgk.h();
            String str6 = u4w0Var2.c;
            long j2 = (jCurrentTimeMillis / 1000) + u4w0Var2.d;
            String str7 = u4w0Var2.e;
            int i8 = u4w0Var2.f;
            str5.getClass();
            str6.getClass();
            str7.getClass();
            bzu bzuVar = new bzu((byte) 19);
            cww.G(bzuVar, "X-DeviceManufacturer", str5);
            cww.G(bzuVar, "X-DeviceModel", strC);
            cww.G(bzuVar, "X-DeviceSystemVersion", strConcat);
            cww.F(bzuVar, "X-Group", Integer.valueOf(i6));
            cww.F(bzuVar, "X-Whence", Integer.valueOf(i7));
            cww.F(bzuVar, "X-VersionOS", Integer.valueOf(iH));
            cww.G(bzuVar, "X-BundleId", str6);
            cww.F(bzuVar, "Time", Long.valueOf(j2));
            cww.G(bzuVar, "AppGuid", str7);
            cww.F(bzuVar, "X-Ref", Integer.valueOf(i8));
            String string = bzuVar.a().toString();
            xcm0Var2 = xcm0Var;
            x8w0Var.i = xcm0Var2;
            x8w0Var.j = u4w0Var2;
            x8w0Var.m = jCurrentTimeMillis;
            x8w0Var.p = 1;
            h0q0Var = h0q0Var;
            objI = h0q0Var.i(string, x8w0Var);
            wneVar = wneVar2;
            if (objI != wneVar) {
            }
            return wneVar;
        }
        if (i5 == 1) {
            jCurrentTimeMillis = x8w0Var.m;
            u4w0Var2 = x8w0Var.j;
            xcm0 xcm0Var3 = x8w0Var.i;
            z1x.P(objI);
            wneVar = wneVar2;
            xcm0Var2 = xcm0Var3;
        } else {
            if (i5 == 2) {
                j = x8w0Var.m;
                str = x8w0Var.k;
                z1x.P(objI);
                wneVar = wneVar2;
                r2 = 0;
                str2 = (String) objI;
                x8w0Var.i = r2;
                x8w0Var.j = r2;
                x8w0Var.k = str;
                x8w0Var.l = str2;
                x8w0Var.m = j;
                x8w0Var.p = 3;
                objE = h0q0Var.e(x8w0Var);
                if (objE != wneVar) {
                    String str8 = str;
                    str3 = str2;
                    objI = objE;
                    str4 = str8;
                }
                return wneVar;
            }
            if (i5 != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str3 = x8w0Var.l;
            str4 = x8w0Var.k;
            z1x.P(objI);
        }
        String str9 = (String) objI;
        str4.getClass();
        str3.getClass();
        str9.getClass();
        i = 0;
        sb = new StringBuilder(str4.substring(0, 11) + str3.substring(0, 11) + str4.substring(10, str4.length()) + '_' + str3.substring(10, str3.length()));
        charArray = str9.toCharArray();
        charArray.getClass();
        length = charArray.length;
        i2 = 0;
        while (i2 < length) {
            c = charArray[i2];
            int i9 = i + 1;
            i3 = (i * 2) + 1;
            if (sb.toString().length() >= i) {
                sb.insert(i3, c);
            }
            i2++;
            i = i9;
        }
        return sb.toString();
        long j3 = jCurrentTimeMillis;
        String str10 = (String) objI;
        long j4 = u4w0Var2.d;
        int i10 = u4w0Var2.g;
        long j5 = (j3 / 1000) + j4 + 5;
        String str11 = u4w0Var2.e;
        String strValueOf = String.valueOf(i10);
        String str12 = u4w0Var2.h;
        tgkVar.getClass();
        String strValueOf2 = String.valueOf(tgk.h() * i10);
        wne wneVar3 = wneVar;
        h0q0 h0q0Var2 = h0q0Var;
        int iJ = l1e0.j(new IntRange(0, HwBuildEx.VersionCodes.CUR_DEVELOPMENT, 1), f1e0.f8761a);
        String str13 = u4w0Var2.i;
        String str14 = u4w0Var2.j;
        String str15 = u4w0Var2.k;
        str11.getClass();
        strValueOf.getClass();
        str12.getClass();
        strValueOf2.getClass();
        xcm0Var2.getClass();
        bzu bzuVar2 = new bzu((byte) 19);
        cww.F(bzuVar2, "Time", Long.valueOf(j5));
        cww.G(bzuVar2, "AppGuid", str11);
        cww.G(bzuVar2, "X-FCountry", strValueOf);
        cww.G(bzuVar2, "ApplicationVersion", str12);
        cww.G(bzuVar2, "X-VersionOS", strValueOf2);
        cww.F(bzuVar2, "Rnd", Integer.valueOf(iJ));
        if (str13 != null) {
            cww.G(bzuVar2, "Rnd2", str13);
        }
        if (str14 != null) {
            cww.G(bzuVar2, "Rnd3", str14);
        }
        if (str15 != null) {
            cww.G(bzuVar2, "Rnd4", str15);
        }
        if (!xcm0Var2.equals(t7w0.f33487a) && !xcm0Var2.equals(s7w0.b) && !xcm0Var2.equals(s7w0.c) && !xcm0Var2.equals(u7w0.f35206a) && !xcm0Var2.equals(s7w0.f31772a)) {
            t9f.b();
            return 0;
        }
        String string2 = bzuVar2.a().toString();
        ?? r3 = r12;
        x8w0Var.i = r3;
        x8w0Var.j = r3;
        x8w0Var.k = str10;
        x8w0Var.m = j3;
        x8w0Var.p = 2;
        h0q0Var = h0q0Var2;
        Object objF = h0q0Var.f(string2, x8w0Var);
        wneVar = wneVar3;
        if (objF != wneVar) {
            str = str10;
            objI = objF;
            j = j3;
            r2 = r3;
            str2 = (String) objI;
            x8w0Var.i = r2;
            x8w0Var.j = r2;
            x8w0Var.k = str;
            x8w0Var.l = str2;
            x8w0Var.m = j;
            x8w0Var.p = 3;
            objE = h0q0Var.e(x8w0Var);
            if (objE != wneVar) {
                String str16 = str;
                str3 = str2;
                objI = objE;
                str4 = str16;
                String str17 = (String) objI;
                str4.getClass();
                str3.getClass();
                str17.getClass();
                i = 0;
                sb = new StringBuilder(str4.substring(0, 11) + str3.substring(0, 11) + str4.substring(10, str4.length()) + '_' + str3.substring(10, str3.length()));
                charArray = str17.toCharArray();
                charArray.getClass();
                length = charArray.length;
                i2 = 0;
                while (i2 < length) {
                    c = charArray[i2];
                    int i11 = i + 1;
                    i3 = (i * 2) + 1;
                    if (sb.toString().length() >= i) {
                        sb.insert(i3, c);
                    }
                    i2++;
                    i = i11;
                }
                return sb.toString();
            }
        }
        return wneVar;
    }

    @Override // a.v8x0
    public Object b(h0q0 h0q0Var) throws IOException {
        Uri uri = (Uri) h0q0Var.d;
        AtomicLong atomicLong = n9x0.f23162a;
        int iMyPid = Process.myPid();
        long id = Thread.currentThread().getId();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long andIncrement = n9x0.f23162a.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(iMyPid).length() + 15 + String.valueOf(id).length() + 1 + String.valueOf(jCurrentTimeMillis).length() + 1 + String.valueOf(andIncrement).length());
        rw2.x(sb, ".mobstore_tmp-", iMyPid, "-");
        sb.append(id);
        kng0.A(sb, "-", jCurrentTimeMillis, "-");
        sb.append(andIncrement);
        Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(sb.toString())).build();
        p9x0 p9x0Var = (p9x0) h0q0Var.f12247a;
        OutputStream outputStreamB = p9x0Var.b(uriBuild);
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStreamB);
        ArrayList arrayList2 = (ArrayList) h0q0Var.b;
        if (!arrayList2.isEmpty()) {
            int i = u8x0.b;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                throw rw2.h(it);
            }
            u8x0 u8x0Var = !arrayList3.isEmpty() ? new u8x0(outputStreamB, arrayList3) : null;
            if (u8x0Var != null) {
                arrayList.add(u8x0Var);
            }
        }
        Iterator it2 = ((b4x) h0q0Var.c).iterator();
        if (!it2.hasNext()) {
            Collections.reverse(arrayList);
        } else {
            if (it2.next() == null) {
                throw null;
            }
            hny.b();
            arrayList = null;
        }
        hcp0[] hcp0VarArr = (hcp0[]) this.c;
        if (hcp0VarArr != null) {
            hcp0 hcp0Var = hcp0VarArr[0];
            hcp0Var.getClass();
            OutputStream outputStream = (OutputStream) g8x.H(arrayList);
            if (outputStream instanceof i9x0) {
                hcp0Var.c = (i9x0) outputStream;
                hcp0Var.b = (OutputStream) arrayList.get(0);
            }
        }
        try {
            OutputStream outputStream2 = (OutputStream) arrayList.get(0);
            try {
                jdw0 jdw0Var = (jdw0) this.b;
                jdw0Var.getClass();
                mew0 mew0Var = (mew0) jdw0Var;
                int iK = mew0Var.k();
                boolean z = aew0.b;
                if (iK > 4096) {
                    iK = 4096;
                }
                wdw0 wdw0Var = new wdw0(outputStream2, iK);
                mew0Var.d(wdw0Var);
                if (wdw0Var.e > 0) {
                    wdw0Var.B();
                }
                hcp0[] hcp0VarArr2 = (hcp0[]) this.c;
                if (hcp0VarArr2 != null) {
                    hcp0 hcp0Var2 = hcp0VarArr2[0];
                    if (((i9x0) hcp0Var2.c) == null) {
                        throw new l52("Cannot sync underlying stream");
                    }
                    ((OutputStream) hcp0Var2.b).flush();
                    ((i9x0) hcp0Var2.c).f14411a.getFD().sync();
                }
                outputStream2.close();
                p9x0Var.d(uriBuild, uri);
                return null;
            } catch (Throwable th) {
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            try {
                p9x0Var.c(uriBuild);
            } catch (FileNotFoundException unused) {
            }
            if (e instanceof IOException) {
                throw ((IOException) e);
            }
            throw new IOException(e);
        }
    }

    public void c(xhe0 xhe0Var, eld0 eld0Var) {
        nuj0 nuj0Var = (nuj0) this.b;
        mhu0 mhu0VarA = (mhu0) nuj0Var.get(xhe0Var);
        if (mhu0VarA == null) {
            mhu0VarA = mhu0.a();
            nuj0Var.put(xhe0Var, mhu0VarA);
        }
        mhu0VarA.c = eld0Var;
        mhu0VarA.f21815a |= 8;
    }

    /* JADX WARN: Code duplicated, block: B:221:0x05f2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public srm0 d(int i, n0a n0aVar, ArrayList arrayList, ArrayList arrayList2, hy9 hy9Var, Range range, boolean z) {
        int i2;
        Rect rectG;
        hln0 hln0Var;
        boolean z2;
        boolean z3;
        LinkedHashMap linkedHashMap;
        boolean z4;
        boolean z5;
        int i3;
        int i4;
        fln0 fln0Var;
        tmn0 tmn0VarP;
        hln0 hln0Var2;
        n0aVar.getClass();
        hy9Var.getClass();
        range.getClass();
        ArrayList arrayList3 = new ArrayList();
        String strE = n0aVar.e();
        strE.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            fot0 fot0Var = (fot0) it.next();
            h55 h55Var = fot0Var.j;
            if (h55Var == null) {
                jf4.o("Attached stream spec cannot be null for already attached use cases.");
                return null;
            }
            h3a h3aVar = (h3a) this.c;
            if (h3aVar == null) {
                jf4.n("Required value was null.");
                return null;
            }
            int iK = fot0Var.i.k();
            Size sizeC = fot0Var.c();
            if (sizeC == null) {
                jf4.o("Attached surface resolution cannot be null for already attached use cases.");
                return null;
            }
            urm0 urm0VarU = fot0Var.i.u();
            Iterator it2 = it;
            z1x.t("No such camera id in supported combination list: ".concat(strE), h3aVar.d.containsKey(strE));
            synchronized (h3aVar.c) {
                hln0Var2 = (hln0) h3aVar.d.get(strE);
            }
            if (hln0Var2 == null) {
                jf4.o("No such camera id in supported combination list: ".concat(strE));
                return null;
            }
            wln0 wln0VarQ = hln0Var2.q(i, iK, sizeC, urm0VarU);
            int iK2 = fot0Var.i.k();
            Size sizeC2 = fot0Var.c();
            sizeC2.getClass();
            agn agnVar = h55Var.c;
            ArrayList arrayList4 = new ArrayList();
            if (fot0Var instanceof qrm0) {
                Iterator it3 = ((qrm0) fot0Var).s.f9855a.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(((fot0) it3.next()).i.v());
                }
            } else {
                arrayList4.add(fot0Var.i.v());
            }
            drd drdVar = h55Var.f;
            int iIntValue = ((Integer) fot0Var.i.e(fpt0.H0, 0)).intValue();
            Range range2 = (Range) fot0Var.i.e(fpt0.I0, h55.h);
            if (range2 == null) {
                jf4.o("Required value was null.");
                return null;
            }
            Boolean bool = (Boolean) fot0Var.i.e(fpt0.J0, Boolean.FALSE);
            Objects.requireNonNull(bool);
            boolean zBooleanValue = bool.booleanValue();
            fpt0 fpt0Var = fot0Var.i;
            Size sizeC3 = fot0Var.c();
            sizeC3.getClass();
            l15 l15Var = new l15(wln0VarQ, iK2, sizeC2, agnVar, arrayList4, drdVar, iIntValue, range2, zBooleanValue, fpt0Var.w(sizeC3));
            arrayList3.add(l15Var);
            linkedHashMap3.put(l15Var, fot0Var);
            linkedHashMap2.put(fot0Var, h55Var);
            it = it2;
        }
        Pair pair = new Pair(linkedHashMap2, linkedHashMap3);
        Object obj = pair.second;
        obj.getClass();
        Map map = (Map) obj;
        HashMap mapW = t3a.w(arrayList, (ipt0) hy9Var.e(hy9.H, ipt0.f15179a), (u3a) this.b, range);
        String strE2 = n0aVar.e();
        strE2.getClass();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        if (arrayList.isEmpty()) {
            i2 = Integer.MAX_VALUE;
        } else {
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
            try {
                rectG = n0aVar.g();
            } catch (NullPointerException unused) {
                rectG = null;
            }
            gxu gxuVar = new gxu(n0aVar, rectG != null ? jls0.f(rectG) : null);
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                fot0 fot0Var2 = (fot0) it4.next();
                Object obj2 = mapW.get(fot0Var2);
                if (obj2 == null) {
                    jf4.o("Required value was null.");
                    return null;
                }
                p3a p3aVar = (p3a) obj2;
                fpt0 fpt0VarQ = fot0Var2.q(n0aVar, p3aVar.f26290a, p3aVar.b);
                fpt0VarQ.getClass();
                linkedHashMap5.put(fpt0VarQ, fot0Var2);
                linkedHashMap6.put(fpt0VarQ, gxuVar.j(fpt0VarQ));
            }
            rfu0 rfu0VarU = qsm0.u(arrayList, new u5l0((Object) mapW, (Object) n0aVar, (byte) 21));
            h3a h3aVar2 = (h3a) this.c;
            if (h3aVar2 == null) {
                jf4.n("Required value was null.");
                return null;
            }
            ArrayList arrayList5 = new ArrayList(map.keySet());
            boolean zT = qsm0.t(arrayList);
            z1x.t("No such camera id in supported combination list: ".concat(strE2), h3aVar2.d.containsKey(strE2));
            synchronized (h3aVar2.c) {
                hln0Var = (hln0) h3aVar2.d.get(strE2);
            }
            if (hln0Var == null) {
                jf4.o("No such camera id in supported combination list: ".concat(strE2));
                return null;
            }
            xvk xvkVar = hln0Var.y;
            synchronized (xvkVar.c) {
                xvkVar.f = xvkVar.a();
            }
            if (hln0Var.v == null) {
                hln0Var.c();
            } else {
                hln0Var.v = new m55(hln0Var.m().f21204a, hln0Var.m().b, hln0Var.y.c(), hln0Var.m().d, hln0Var.m().e, hln0Var.m().f, hln0Var.m().g, hln0Var.m().h, hln0Var.m().i);
            }
            Range range3 = pxv.f;
            Set setKeySet = linkedHashMap6.keySet();
            setKeySet.getClass();
            ArrayList arrayList6 = new ArrayList(r3d.q(arrayList5, 10));
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                arrayList6.add(Integer.valueOf(((l15) it5.next()).g));
            }
            Set set = setKeySet;
            ArrayList arrayList7 = new ArrayList(r3d.q(set, 10));
            Iterator it6 = set.iterator();
            while (it6.hasNext()) {
                Integer num = (Integer) ((fpt0) it6.next()).e(fpt0.H0, 0);
                num.getClass();
                arrayList7.add(num);
            }
            ArrayList arrayListQ0 = CollectionsKt.q0(arrayList6, arrayList7);
            if (arrayListQ0.isEmpty()) {
                z2 = false;
                break;
            }
            Iterator it7 = arrayListQ0.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    z2 = false;
                    break;
                }
                if (((Number) it7.next()).intValue() == 1) {
                    z2 = true;
                    break;
                }
            }
            if (z2 && !arrayListQ0.isEmpty()) {
                Iterator it8 = arrayListQ0.iterator();
                while (it8.hasNext()) {
                    if (((Number) it8.next()).intValue() != 1) {
                        jf4.o("All sessionTypes should be high-speed when any of them is high-speed");
                        return null;
                    }
                }
            }
            if (z2) {
                pxv pxvVar = hln0Var.C;
                pxvVar.getClass();
                List listA = pxv.a(CollectionsKt.L0(linkedHashMap6.values()));
                ArrayList arrayList8 = new ArrayList();
                for (Object obj3 : listA) {
                    boolean z6 = zT;
                    if (((List) pxvVar.e.getValue()).contains((Size) obj3)) {
                        arrayList8.add(obj3);
                    }
                    zT = z6;
                }
                z3 = zT;
                LinkedHashMap linkedHashMap7 = new LinkedHashMap(wp20.a(linkedHashMap6.size()));
                Iterator it9 = linkedHashMap6.entrySet().iterator();
                while (it9.hasNext()) {
                    Map.Entry entry = (Map.Entry) it9.next();
                    Object key = entry.getKey();
                    List list = (List) entry.getValue();
                    ArrayList arrayList9 = new ArrayList();
                    for (Object obj4 : list) {
                        Iterator it10 = it9;
                        if (arrayList8.contains((Size) obj4)) {
                            arrayList9.add(obj4);
                        }
                        it9 = it10;
                    }
                    linkedHashMap7.put(key, arrayList9);
                }
                linkedHashMap = linkedHashMap7;
            } else {
                z3 = zT;
                linkedHashMap = linkedHashMap6;
            }
            List<fpt0> listL0 = CollectionsKt.L0(linkedHashMap.keySet());
            ArrayList arrayList10 = new ArrayList();
            ArrayList arrayList11 = new ArrayList();
            Iterator it11 = listL0.iterator();
            while (it11.hasNext()) {
                Integer num2 = (Integer) ((fpt0) it11.next()).e(fpt0.G0, 0);
                num2.getClass();
                if (!arrayList11.contains(num2)) {
                    arrayList11.add(num2);
                }
            }
            v3d.s(arrayList11);
            Collections.reverse(arrayList11);
            Iterator it12 = arrayList11.iterator();
            while (it12.hasNext()) {
                int iIntValue2 = ((Number) it12.next()).intValue();
                for (fpt0 fpt0Var2 : listL0) {
                    if (iIntValue2 == ((Integer) fpt0Var2.e(fpt0.G0, 0)).intValue()) {
                        arrayList10.add(Integer.valueOf(listL0.indexOf(fpt0Var2)));
                    }
                }
            }
            LinkedHashMap linkedHashMapT = hln0Var.B.t(arrayList5, listL0, arrayList10);
            if (l8x.f0("CXCP")) {
                Log.d("CXCP", "resolvedDynamicRanges = " + linkedHashMapT);
            }
            Iterator it13 = arrayList5.iterator();
            while (true) {
                if (!it13.hasNext()) {
                    Iterator it14 = linkedHashMap.keySet().iterator();
                    while (true) {
                        if (!it14.hasNext()) {
                            z4 = false;
                            break;
                        }
                        if (((fpt0) it14.next()).k() == 4101) {
                        }
                    }
                } else if (((l15) it13.next()).b == 4101) {
                }
                z4 = true;
                break;
            }
            Iterator it15 = arrayList5.iterator();
            Boolean boolValueOf = null;
            while (it15.hasNext()) {
                boolean z7 = ((l15) it15.next()).i;
                if (boolValueOf != null && !boolValueOf.equals(Boolean.valueOf(z7))) {
                    jf4.n("All isStrictFpsRequired should be the same");
                    return null;
                }
                boolValueOf = Boolean.valueOf(z7);
            }
            Iterator it16 = listL0.iterator();
            while (it16.hasNext()) {
                Boolean bool2 = (Boolean) ((fpt0) it16.next()).e(fpt0.J0, Boolean.FALSE);
                Objects.requireNonNull(bool2);
                if (boolValueOf != null && !boolValueOf.equals(bool2)) {
                    jf4.n("All isStrictFpsRequired should be the same");
                    return null;
                }
                boolValueOf = bool2;
            }
            boolean zBooleanValue2 = boolValueOf != null ? boolValueOf.booleanValue() : false;
            Range rangeO = h55.h;
            rangeO.getClass();
            Iterator it17 = arrayList5.iterator();
            while (it17.hasNext()) {
                Range range4 = ((l15) it17.next()).h;
                range4.getClass();
                rangeO = hln0.o(range4, rangeO, zBooleanValue2);
            }
            Iterator it18 = arrayList10.iterator();
            Range rangeO2 = rangeO;
            while (it18.hasNext()) {
                List list2 = listL0;
                Range range5 = (Range) ((fpt0) listL0.get(((Number) it18.next()).intValue())).e(fpt0.I0, h55.h);
                range5.getClass();
                rangeO2 = hln0.o(range5, rangeO2, zBooleanValue2);
                listL0 = list2;
            }
            List list3 = listL0;
            boolean zBooleanValue3 = Boolean.valueOf(zBooleanValue2).booleanValue();
            boolean z8 = rfu0VarU == rfu0.e;
            if (l8x.f0("CXCP")) {
                StringBuilder sb = new StringBuilder("getSuggestedStreamSpecifications: isPreviewStabilizationSupported = ");
                sb.append(hln0Var.t);
                sb.append(", isFeatureComboInvocation = ");
                z5 = z;
                sb.append(z5);
                Log.d("CXCP", sb.toString());
            } else {
                z5 = z;
            }
            if (z8 && !hln0Var.t && z5) {
                jf4.o("Preview stabilization is not supported by the camera.");
                return null;
            }
            rangeO2.getClass();
            Iterator it19 = linkedHashMapT.values().iterator();
            do {
                if (!it19.hasNext()) {
                    i3 = 8;
                    break;
                }
                i3 = 10;
            } while (((agn) it19.next()).b != 10);
            hln0 hln0Var3 = hln0Var;
            gln0 gln0Var = new gln0(i, i3, z3, rfu0VarU, z4, z2, z, false, rangeO2, zBooleanValue3);
            hln0Var3.t(gln0Var);
            Collection collectionValues = linkedHashMapT.values();
            if (z) {
                ?? Contains = collectionValues.contains(agn.e);
                Integer num3 = (Integer) rangeO2.getUpper();
                int i5 = Contains;
                if (num3 != null) {
                    i5 = Contains;
                    if (num3.intValue() == 60) {
                        i5 = Contains + 1;
                    }
                }
                if (rfu0VarU != rfu0.d) {
                    i4 = i5;
                    if (rfu0VarU == rfu0.e) {
                        i4 = i5 + 1;
                    }
                } else {
                    i4 = i5 + 1;
                }
                if (z4) {
                    i4++;
                }
                fln0Var = i4 > 1 ? fln0.b : i4 == 1 ? fln0.c : fln0.f9747a;
            } else {
                fln0Var = fln0.f9747a;
            }
            if (l8x.f0("CXCP")) {
                Log.d("CXCP", "resolveSpecsByCheckingMethod: checkingMethod = " + fln0Var);
            }
            int iOrdinal = fln0Var.ordinal();
            if (iOrdinal == 0) {
                gln0 gln0VarA = gln0.a(gln0Var, false, null, 895);
                hln0Var3.t(gln0VarA);
                tmn0VarP = hln0Var3.p(gln0VarA, arrayList5, linkedHashMap, list3, arrayList10, linkedHashMapT);
            } else if (iOrdinal == 1) {
                if (z) {
                    Range range6 = h55.h;
                }
                gln0 gln0VarA2 = gln0.a(gln0Var, true, rangeO2, 639);
                hln0Var3.t(gln0VarA2);
                tmn0VarP = hln0Var3.p(gln0VarA2, arrayList5, linkedHashMap, list3, arrayList10, linkedHashMapT);
            } else {
                if (iOrdinal != 2) {
                    t9f.b();
                    return null;
                }
                try {
                    gln0 gln0VarA3 = gln0.a(gln0Var, false, null, 895);
                    hln0Var3.t(gln0VarA3);
                    try {
                        tmn0VarP = hln0Var3.p(gln0VarA3, arrayList5, linkedHashMap, list3, arrayList10, linkedHashMapT);
                    } catch (IllegalArgumentException e) {
                        e = e;
                        hln0Var3 = hln0Var3;
                        if (l8x.f0("CXCP")) {
                            Log.d("CXCP", "Failed to find a supported combination without feature combo, trying again with feature combo", e);
                        }
                        gln0 gln0VarA4 = gln0.a(gln0Var, true, null, 895);
                        hln0Var3.t(gln0VarA4);
                        tmn0VarP = hln0Var3.p(gln0VarA4, arrayList5, linkedHashMap, list3, arrayList10, linkedHashMapT);
                    }
                } catch (IllegalArgumentException e2) {
                    e = e2;
                }
            }
            LinkedHashMap linkedHashMap8 = tmn0VarP.f34202a;
            LinkedHashMap linkedHashMap9 = tmn0VarP.b;
            i2 = tmn0VarP.c;
            for (Map.Entry entry2 : linkedHashMap5.entrySet()) {
                Object value = entry2.getValue();
                Object obj5 = linkedHashMap8.get(entry2.getKey());
                if (obj5 == null) {
                    jf4.o("Required value was null.");
                    return null;
                }
                linkedHashMap4.put(value, obj5);
            }
            for (Map.Entry entry3 : linkedHashMap9.entrySet()) {
                if (map.containsKey(entry3.getKey())) {
                    Object obj6 = map.get(entry3.getKey());
                    if (obj6 == null) {
                        jf4.o("Required value was null.");
                        return null;
                    }
                    linkedHashMap4.put(obj6, entry3.getValue());
                }
            }
        }
        Object obj7 = pair.first;
        obj7.getClass();
        return new srm0(i2, xp20.j((Map) obj7, linkedHashMap4));
    }

    public float e() {
        float fIntValue = (((Number) ((hgk0) ((pz40) this.b)).getValue()).intValue() - ((Number) ((hgk0) ((pz40) this.c)).getValue()).intValue()) / 2.0f;
        if (fIntValue < 0.0f) {
            return 0.0f;
        }
        return fIntValue;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object f(int i, zje zjeVar, String str, String str2) {
        mgt0 mgt0Var;
        if (zjeVar instanceof mgt0) {
            mgt0Var = (mgt0) zjeVar;
            int i2 = mgt0Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mgt0Var.k = i2 - Integer.MIN_VALUE;
            } else {
                mgt0Var = new mgt0(this, zjeVar);
            }
        } else {
            mgt0Var = new mgt0(this, zjeVar);
        }
        mgt0 mgt0Var2 = mgt0Var;
        Object objA = mgt0Var2.i;
        wne wneVar = wne.f39444a;
        int i3 = mgt0Var2.k;
        if (i3 == 0) {
            z1x.P(objA);
            rgt0 rgt0Var = (rgt0) ((rbt0) this.c).invoke();
            mgt0Var2.k = 1;
            objA = rgt0Var.a("application/vnd.xenvelop+json", str, str2, i, 0, mgt0Var2);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return ((dx5) objA).a();
    }

    @Override // a.nmw0
    public h0q0 g(jlw0 jlw0Var) {
        h0q0 h0q0VarJ = ((h0q0) this.b).J();
        h0q0VarJ.N((String) this.c, jlw0Var);
        return h0q0VarJ;
    }

    @Override // a.ngw0
    public void h(xfw0 xfw0Var) {
        hcp0 hcp0Var = (hcp0) this.b;
        mjw0 mjw0Var = (mjw0) xfw0Var;
        if (!TextUtils.isEmpty(mjw0Var.e)) {
            hcp0Var.c(new cmt0(mjw0Var.e, mjw0Var.d, null));
            return;
        }
        ((nmt0) this.c).g(new zzaia(Long.valueOf(mjw0Var.c), mjw0Var.b, mjw0Var.f21916a), null, null, Boolean.FALSE, null, hcp0Var, this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(zje zjeVar) {
        u4v0 u4v0Var;
        if (zjeVar instanceof u4v0) {
            u4v0Var = (u4v0) zjeVar;
            int i = u4v0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                u4v0Var.k = i - Integer.MIN_VALUE;
            } else {
                u4v0Var = new u4v0(this, zjeVar);
            }
        } else {
            u4v0Var = new u4v0(this, zjeVar);
        }
        Object objA = u4v0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = u4v0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            hcp0 hcp0Var = (hcp0) this.b;
            String strA = ((btt0) this.c).a();
            u4v0Var.k = 1;
            objA = ((t4v0) ((rbt0) hcp0Var.c).invoke()).a(strA, "application/vnd.xenvelop+json", u4v0Var);
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
        return ((dx5) objA).a();
    }

    @Override // a.r2x0
    public byte[] j(byte[] bArr, fck0 fck0Var) {
        byte[] bArrB = ((p3x0) this.c).b(((icw0) fck0Var.b).b(), bArr);
        byte[] bArrB2 = egm0.B(bArr, ((icw0) fck0Var.c).b());
        byte[] bArrB3 = egm0.B(c3x0.m, c3x0.b);
        h70 h70Var = (h70) this.b;
        int macLength = Mac.getInstance(h70Var.b).getMacLength();
        byte[] bArr2 = c3x0.o;
        Charset charset = x7x0.f40437a;
        return h70Var.a(macLength, h70Var.b(egm0.B(bArr2, bArrB3, "eae_prk".getBytes(charset), bArrB), null), egm0.B(c3x0.b(2, macLength), bArr2, bArrB3, "shared_secret".getBytes(charset), bArrB2));
    }

    public void k(int i) {
        rrd rrdVar = (rrd) this.b;
        long jE = ((gst0) this.c).e();
        tg5 tg5Var = (tg5) rrdVar.b;
        ql5 ql5Var = (ql5) tg5Var.f33892a.get(Long.valueOf(jE));
        if (ql5Var != null) {
            tg5Var.c(ql5.a(ql5Var, 0.0d, null, i, 8063));
        }
    }

    public void l(bm5 bm5Var, ql5 ql5Var) {
        bm5Var.getClass();
        ql5Var.getClass();
        ((ot) this.b).a(bm5Var, ql5Var);
        if (bm5Var == bm5.d || bm5Var == bm5.e) {
            jyg0 jyg0Var = (jyg0) this.c;
            jyg0Var.f17359a.z(bm5Var, ql5Var.f28916a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object m(RequestBody$Companion$toRequestBody$3 requestBody$Companion$toRequestBody$3, String str, zje zjeVar) {
        y8o0 y8o0Var;
        if (zjeVar instanceof y8o0) {
            y8o0Var = (y8o0) zjeVar;
            int i = y8o0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                y8o0Var.k = i - Integer.MIN_VALUE;
            } else {
                y8o0Var = new y8o0(this, zjeVar);
            }
        } else {
            y8o0Var = new y8o0(this, zjeVar);
        }
        Object obj = y8o0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = y8o0Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            x8o0 x8o0Var = (x8o0) ((jfm0) this.c).invoke();
            y8o0Var.k = 1;
            if (x8o0Var.b(requestBody$Companion$toRequestBody$3, str, new lwf((byte) 0), y8o0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    public eld0 n(xhe0 xhe0Var, int i) {
        mhu0 mhu0Var;
        eld0 eld0Var;
        nuj0 nuj0Var = (nuj0) this.b;
        int iD = nuj0Var.d(xhe0Var);
        if (iD >= 0 && (mhu0Var = (mhu0) nuj0Var.j(iD)) != null) {
            int i2 = mhu0Var.f21815a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                mhu0Var.f21815a = i3;
                if (i == 4) {
                    eld0Var = mhu0Var.b;
                } else if (i == 8) {
                    eld0Var = mhu0Var.c;
                } else {
                    jf4.o("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    nuj0Var.g(iD);
                    mhu0Var.f21815a = 0;
                    mhu0Var.b = null;
                    mhu0Var.c = null;
                    mhu0.d.c(mhu0Var);
                }
                return eld0Var;
            }
        }
        return null;
    }

    public void o(xhe0 xhe0Var) {
        mhu0 mhu0Var = (mhu0) ((nuj0) this.b).get(xhe0Var);
        if (mhu0Var == null) {
            return;
        }
        mhu0Var.f21815a &= -2;
    }

    @Override // a.cfr
    public void onFailure(Throwable th) {
        byte b = this.f34427a;
        Object obj = this.b;
        byte b2 = 1;
        switch (b) {
            case 1:
                z1x.y("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th, th instanceof nmn0);
                ((sbe) obj).accept(new k55(1, (Surface) this.c));
                return;
            case 4:
                throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
            default:
                b1x0 b1x0Var = (b1x0) this.c;
                b1x0Var.m1();
                kxw0 kxw0Var = (kxw0) b1x0Var.b;
                boolean z = false;
                b1x0Var.j = false;
                b1x0Var.J1().add((zzoh) obj);
                if (b1x0Var.k > ((Integer) btw0.v0.a(null)).intValue()) {
                    b1x0Var.k = 1;
                    uuw0 uuw0Var = kxw0Var.f;
                    kxw0.g(uuw0Var);
                    uuw0Var.j.c(uuw0.q1(kxw0Var.k().r1()), uuw0.q1(th.toString()), "registerTriggerAsync failed. May try later. App ID, throwable");
                    return;
                }
                uuw0 uuw0Var2 = kxw0Var.f;
                kxw0.g(uuw0Var2);
                uuw0Var2.j.d("registerTriggerAsync failed. App ID, delay in seconds, throwable", uuw0.q1(kxw0Var.k().r1()), uuw0.q1(String.valueOf(b1x0Var.k)), uuw0.q1(th.toString()));
                int i = b1x0Var.k;
                ezw0 ezw0Var = b1x0Var.l;
                if (ezw0Var == null) {
                    ezw0Var = new ezw0(b1x0Var, kxw0Var, b2, z);
                    b1x0Var.l = ezw0Var;
                }
                ezw0Var.b(((long) i) * 1000);
                int i2 = b1x0Var.k;
                b1x0Var.k = i2 + i2;
                return;
        }
    }

    @Override // a.cfr
    public void onSuccess(Object obj) {
        byte b = this.f34427a;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                ((sbe) obj2).accept(new k55(0, (Surface) this.c));
                break;
            case 4:
                z1x.y("Unexpected result from SurfaceRequest. Surface was provided twice.", ((k55) obj).f17702a != 3);
                l8x.U("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                ((SurfaceTexture) obj2).release();
                raq0 raq0Var = (raq0) ((a2a) this.c).b;
                if (raq0Var.j != null) {
                    raq0Var.j = null;
                }
                break;
            default:
                b1x0 b1x0Var = (b1x0) this.c;
                b1x0Var.m1();
                kxw0 kxw0Var = (kxw0) b1x0Var.b;
                wvw0 wvw0Var = kxw0Var.e;
                kxw0.e(wvw0Var);
                SparseArray sparseArrayS1 = wvw0Var.s1();
                zzoh zzohVar = (zzoh) obj2;
                sparseArrayS1.put(zzohVar.c, Long.valueOf(zzohVar.b));
                wvw0 wvw0Var2 = kxw0Var.e;
                kxw0.e(wvw0Var2);
                int[] iArr = new int[sparseArrayS1.size()];
                long[] jArr = new long[sparseArrayS1.size()];
                for (int i = 0; i < sparseArrayS1.size(); i++) {
                    iArr[i] = sparseArrayS1.keyAt(i);
                    jArr[i] = ((Long) sparseArrayS1.valueAt(i)).longValue();
                }
                Bundle bundle = new Bundle();
                bundle.putIntArray("uriSources", iArr);
                bundle.putLongArray("uriTimestamps", jArr);
                wvw0Var2.o.y(bundle);
                b1x0Var.j = false;
                b1x0Var.k = 1;
                uuw0 uuw0Var = kxw0Var.f;
                kxw0.g(uuw0Var);
                uuw0Var.n.b(zzohVar.f45545a, "Successfully registered trigger URI");
                b1x0Var.K1();
                break;
        }
    }

    public void p(xhe0 xhe0Var) {
        u710 u710Var = (u710) this.c;
        for (int iH = u710Var.h() - 1; iH >= 0; iH--) {
            if (xhe0Var == u710Var.i(iH)) {
                Object[] objArr = u710Var.c;
                Object obj = objArr[iH];
                Object obj2 = epv0.k;
                if (obj == obj2) {
                    break;
                }
                objArr[iH] = obj2;
                u710Var.f35162a = true;
                break;
            }
        }
        mhu0 mhu0Var = (mhu0) ((nuj0) this.b).remove(xhe0Var);
        if (mhu0Var != null) {
            mhu0Var.f21815a = 0;
            mhu0Var.b = null;
            mhu0Var.c = null;
            mhu0.d.c(mhu0Var);
        }
    }

    public b5x0 r(String str, int i, boolean z) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.b;
        b5x0 b5x0Var = (b5x0) atomicReferenceArray.get(i);
        if (b5x0Var != null) {
            return b5x0Var;
        }
        n4x0 n4x0VarK = ((owp0) this.c).k(str, z);
        while (!atomicReferenceArray.compareAndSet(i, null, n4x0VarK)) {
            if (atomicReferenceArray.get(i) != null) {
                b5x0 b5x0Var2 = (b5x0) atomicReferenceArray.get(i);
                b5x0Var2.getClass();
                return b5x0Var2;
            }
        }
        return n4x0VarK;
    }

    public void s(Object obj, Status status) {
        c44 qfqVar;
        dgw0 dgw0Var = (dgw0) this.b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
        s0x.I(taskCompletionSource, "completion source cannot be null");
        if (status == null) {
            taskCompletionSource.setResult(obj);
            return;
        }
        if (dgw0Var.k == null) {
            if (dgw0Var.j == null) {
                taskCompletionSource.setException(jfw0.a(status));
                return;
            }
            SparseArray sparseArray = jfw0.f16450a;
            int i = status.f45486a;
            if (i == 17012 || i == 17007 || i == 17025) {
                Pair pair = (Pair) jfw0.f16450a.get(i);
                qfqVar = new qfq(jfw0.b(i), jfw0.c(pair != null ? (String) pair.second : "An internal error has occurred.", status));
            } else {
                qfqVar = jfw0.a(status);
            }
            taskCompletionSource.setException(qfqVar);
            return;
        }
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(dgw0Var.c);
        cmt0 cmt0Var = dgw0Var.k;
        FirebaseUser firebaseUser = ("reauthenticateWithCredential".equals(dgw0Var.a()) || "reauthenticateWithCredentialWithData".equals(dgw0Var.a())) ? dgw0Var.d : null;
        SparseArray sparseArray2 = jfw0.f16450a;
        firebaseAuth.getClass();
        cmt0Var.getClass();
        Pair pair2 = (Pair) jfw0.f16450a.get(17078);
        String str = (String) pair2.first;
        String str2 = (String) pair2.second;
        List list = (List) cmt0Var.b;
        ArrayList<MultiFactorInfo> arrayListZ = rsm0.z(list);
        ArrayList arrayList = new ArrayList();
        for (MultiFactorInfo multiFactorInfo : arrayListZ) {
            if (multiFactorInfo instanceof PhoneMultiFactorInfo) {
                arrayList.add((PhoneMultiFactorInfo) multiFactorInfo);
            }
        }
        ArrayList<MultiFactorInfo> arrayListZ2 = rsm0.z(list);
        ArrayList arrayList2 = new ArrayList();
        for (MultiFactorInfo multiFactorInfo2 : arrayListZ2) {
            if (multiFactorInfo2 instanceof TotpMultiFactorInfo) {
                arrayList2.add((TotpMultiFactorInfo) multiFactorInfo2);
            }
        }
        ArrayList<MultiFactorInfo> arrayListZ3 = rsm0.z(list);
        String str3 = (String) cmt0Var.f4625a;
        s0x.E(str3);
        zzao zzaoVar = new zzao();
        zzaoVar.c = new ArrayList();
        zzaoVar.d = new ArrayList();
        for (MultiFactorInfo multiFactorInfo3 : arrayListZ3) {
            if (multiFactorInfo3 instanceof PhoneMultiFactorInfo) {
                zzaoVar.c.add((PhoneMultiFactorInfo) multiFactorInfo3);
            } else {
                if (!(multiFactorInfo3 instanceof TotpMultiFactorInfo)) {
                    jf4.o("MultiFactorInfo must be either PhoneMultiFactorInfo or TotpMultiFactorInfo. The factorId of this MultiFactorInfo: ".concat(multiFactorInfo3.m()));
                    return;
                }
                zzaoVar.d.add((TotpMultiFactorInfo) multiFactorInfo3);
            }
        }
        zzaoVar.b = str3;
        nfq nfqVar = firebaseAuth.f45644a;
        nfqVar.a();
        new zzaj(arrayList, zzaoVar, nfqVar.b, (com.google.firebase.auth.zzc) cmt0Var.c, (zzad) firebaseUser, arrayList2);
        taskCompletionSource.setException(new qfq(str, str2));
    }

    public b5x0 u(String str, int i, long j) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.b;
        b5x0 b5x0Var = (b5x0) atomicReferenceArray.get(i);
        if (b5x0Var != null) {
            return b5x0Var;
        }
        v4x0 v4x0Var = new v4x0(str, (fbv) ((owp0) this.c).b, j);
        while (!atomicReferenceArray.compareAndSet(i, null, v4x0Var)) {
            if (atomicReferenceArray.get(i) != null) {
                b5x0 b5x0Var2 = (b5x0) atomicReferenceArray.get(i);
                b5x0Var2.getClass();
                return b5x0Var2;
            }
        }
        return v4x0Var;
    }

    public b5x0 v(int i, String str, String str2) {
        AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.b;
        b5x0 b5x0Var = (b5x0) atomicReferenceArray.get(i);
        if (b5x0Var != null) {
            return b5x0Var;
        }
        y4x0 y4x0Var = new y4x0(str, (fbv) ((owp0) this.c).b, str2);
        while (!atomicReferenceArray.compareAndSet(i, null, y4x0Var)) {
            if (atomicReferenceArray.get(i) != null) {
                b5x0 b5x0Var2 = (b5x0) atomicReferenceArray.get(i);
                b5x0Var2.getClass();
                return b5x0Var2;
            }
        }
        return y4x0Var;
    }

    @Override // a.r2x0
    public byte[] zza() throws GeneralSecurityException {
        byte[] bArr;
        switch (((h70) this.b).b) {
            case "HmacSha256":
                bArr = c3x0.f;
                break;
            case "HmacSha384":
                bArr = c3x0.g;
                break;
            case "HmacSha512":
                bArr = c3x0.h;
                break;
            default:
                hny.o("Could not determine HPKE KDF ID");
                return null;
        }
        if (Arrays.equals(bArr, c3x0.f)) {
            return c3x0.b;
        }
        hny.o("Could not determine HPKE KEM ID");
        return null;
    }

    @Override // a.ngw0
    /* JADX INFO: renamed from: zza */
    public void mo2zza(String str) {
        ((hcp0) this.b).a(msm0.v(str));
    }

    public /* synthetic */ trm0(Object obj, Object obj2, byte b) {
        this.f34427a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ trm0(Object obj, Object obj2, boolean z, byte b) {
        this.f34427a = b;
        this.c = obj;
        this.b = obj2;
    }

    public trm0(owp0 owp0Var, int i) {
        this.f34427a = (byte) 24;
        this.c = owp0Var;
        this.b = new AtomicReferenceArray(i);
    }

    public trm0(h0q0 h0q0Var, rrc rrcVar, bzs0 bzs0Var, sxs0 sxs0Var) {
        this.f34427a = (byte) 17;
        this.b = h0q0Var;
        this.c = rrcVar;
    }

    public trm0(hcp0 hcp0Var, btt0 btt0Var) {
        this.f34427a = (byte) 14;
        btt0Var.getClass();
        this.b = hcp0Var;
        this.c = btt0Var;
    }

    public trm0(h70 h70Var) {
        Object zow0Var;
        this.f34427a = (byte) 23;
        this.b = h70Var;
        try {
            Provider providerA0 = hew0.a0();
            if (providerA0 != null) {
                KeyFactory.getInstance("XDH", providerA0);
                KeyAgreement.getInstance("XDH", providerA0);
                r7v r7vVar = new r7v(providerA0);
                r7vVar.l();
                zow0Var = r7vVar;
                this.c = zow0Var;
                return;
            }
            throw new GeneralSecurityException("Conscrypt is not available.");
        } catch (GeneralSecurityException unused) {
            zow0Var = new zow0((byte) 29);
        }
    }

    public trm0(rrd rrdVar, gst0 gst0Var) {
        this.f34427a = (byte) 10;
        gst0Var.getClass();
        this.b = rrdVar;
        this.c = gst0Var;
    }

    public trm0(dpi0 dpi0Var, btt0 btt0Var) {
        this.f34427a = (byte) 6;
        btt0Var.getClass();
        this.b = dpi0Var;
        this.c = btt0Var;
    }

    public trm0(jdw0 jdw0Var) {
        this.f34427a = (byte) 25;
        this.b = jdw0Var;
    }

    public trm0(z7z z7zVar) {
        this.f34427a = (byte) 2;
        z7zVar.getClass();
        this.b = maz.b(new ws3(z7zVar, (byte) 5));
        this.c = new jfm0(this, (byte) 22);
    }

    public trm0(u3a u3aVar) {
        this.f34427a = (byte) 0;
        this.b = u3aVar;
        this.c = null;
    }

    public trm0(byte b) {
        this.f34427a = b;
        switch (b) {
            case 12:
                this.b = new nuj0(0);
                this.c = new u710((Object) null);
                break;
            case 16:
                this.b = androidx.compose.runtime.e.e(0);
                this.c = androidx.compose.runtime.e.e(0);
                break;
            default:
                this.b = new j6m0((byte) 9);
                this.c = new dj10(16);
                break;
        }
    }
}
