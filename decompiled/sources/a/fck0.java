package a;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.internal.zzad;
import com.google.firebase.auth.internal.zzaf;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class fck0 implements cfr, OnFailureListener {
    public static fck0 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9317a;
    public Object b;
    public Object c;

    public fck0(Context context, String str) {
        ok50 ok50VarU;
        this.f9317a = (byte) 28;
        this.b = str;
        try {
            v0x0.a();
            sd60 sd60Var = new sd60((byte) 14);
            String strConcat = "com.google.firebase.auth.api.crypto.".concat(str);
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            sd60Var.b = context;
            sd60Var.c = "GenericIdpKeyset";
            sd60Var.d = strConcat;
            sd60Var.h = e1x0.f7059a;
            String strConcat2 = "android-keystore://firebear_master_key_id.".concat(str);
            if (!strConcat2.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            sd60Var.e = strConcat2;
            ok50VarU = sd60Var.u();
            this.c = ok50VarU;
        } catch (IOException e) {
            e = e;
            f140.r("Exception encountered during crypto setup:\n", e.getMessage(), "FirebearCryptoHelper");
            ok50VarU = null;
        } catch (GeneralSecurityException e2) {
            e = e2;
            f140.r("Exception encountered during crypto setup:\n", e.getMessage(), "FirebearCryptoHelper");
            ok50VarU = null;
        }
    }

    public static boolean B(int i) {
        int i2 = jnw0.f16832a[hne.E(i)];
        return i2 == 1 || i2 == 2 || i2 == 3;
    }

    public static ays0 b(List list) {
        list.getClass();
        return list.isEmpty() ? ays0.c : new ays0(list);
    }

    public static final fck0 k(drm0 drm0Var, g4x0 g4x0Var, byte[] bArr) throws GeneralSecurityException, IOException {
        ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) drm0Var.f6568a;
        try {
            dkw0 dkw0Var = dkw0.b;
            idx0 idx0VarT = idx0.t(byteArrayInputStream, dkw0Var);
            byteArrayInputStream.close();
            if (idx0VarT.x().e() == 0) {
                hny.o("empty keyset");
                return null;
            }
            try {
                mfx0 mfx0VarV = mfx0.v(g4x0Var.b(idx0VarT.x().r(), bArr), dkw0Var);
                if (mfx0VarV == null || mfx0VarV.t() <= 0) {
                    throw new GeneralSecurityException("empty keyset");
                }
                return m(mfx0VarV);
            } catch (qkw0 unused) {
                hny.o("invalid keyset, corrupted key material");
                return null;
            }
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public static final fck0 l(w4p0 w4p0Var) throws GeneralSecurityException {
        int i;
        fpw0 fpw0VarE = (fpw0) w4p0Var.b;
        if (fpw0VarE == null) {
            try {
                x4w0 x4w0VarA = fpw0VarE instanceof t5x0 ? ((t5x0) fpw0VarE).f33391a : k6x0.b.a(fpw0VarE);
                zex0 zex0VarT = bfx0.t();
                zex0VarT.g((String) x4w0VarA.b);
                zex0VarT.f((sjw0) x4w0VarA.f40287a);
                zex0VarT.h(bcm0.D((lpw0) x4w0VarA.c));
                fpw0VarE = ktt0.E(((bfx0) zex0VarT.c()).c());
            } catch (GeneralSecurityException e) {
                throw new tiu0("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat(String.valueOf(fpw0VarE)), e, (byte) 5);
            }
        }
        cgx0 cgx0Var = new cgx0((byte) 16);
        ArrayList arrayList = (ArrayList) cgx0Var.c;
        aow0 aow0Var = new aow0(fpw0VarE);
        rek0 rek0Var = rek0.j;
        aow0Var.c = rek0Var;
        aow0Var.f1222a = true;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((aow0) it.next()).f1222a = false;
        }
        arrayList.add(aow0Var);
        if (cgx0Var.b) {
            hny.o("KeysetHandle.Builder#build must only be called once");
            return null;
        }
        cgx0Var.b = true;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size() - 1; i2++) {
            if (((aow0) arrayList.get(i2)).c == rek0Var && ((aow0) arrayList.get(i2 + 1)).c != rek0Var) {
                hny.o("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
                return null;
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = arrayList.iterator();
        Integer numValueOf = null;
        while (true) {
            byte b = 24;
            if (!it2.hasNext()) {
                if (numValueOf == null) {
                    hny.o("No primary was set");
                    return null;
                }
                fck0 fck0Var = new fck0(arrayList2, (HashMap) cgx0Var.d, b);
                fck0Var.x();
                return fck0Var;
            }
            aow0 aow0Var2 = (aow0) it2.next();
            aow0Var2.getClass();
            fpw0 fpw0Var = aow0Var2.b;
            rek0 rek0Var2 = aow0Var2.c;
            if (rek0Var2 == null) {
                hny.o("No ID was set (with withFixedId or withRandomId)");
                return null;
            }
            if (rek0Var2 == rek0Var) {
                int i3 = 0;
                while (true) {
                    if (i3 != 0 && !hashSet.contains(Integer.valueOf(i3))) {
                        break;
                    }
                    Charset charset = x7x0.f40437a;
                    i3 = 0;
                    while (i3 == 0) {
                        byte[] bArrA = s7x0.a(4);
                        i3 = (bArrA[3] & 255) | ((bArrA[0] & 255) << 24) | ((bArrA[1] & 255) << 16) | ((bArrA[2] & 255) << 8);
                    }
                }
                i = i3;
            } else {
                i = 0;
            }
            if (hashSet.contains(Integer.valueOf(i))) {
                throw new GeneralSecurityException(ua80.e(i, "Id ", " is used twice in the keyset"));
            }
            hashSet.add(Integer.valueOf(i));
            dow0 dow0Var = new dow0(b6x0.b.b(fpw0Var, fpw0Var.a() ? Integer.valueOf(i) : null), 2, i, aow0Var2.f1222a, false);
            int i4 = i;
            if (aow0Var2.f1222a) {
                if (numValueOf != null) {
                    hny.o("Two primaries were set");
                    return null;
                }
                numValueOf = Integer.valueOf(i4);
            }
            arrayList2.add(dow0Var);
        }
    }

    public static final fck0 m(mfx0 mfx0Var) throws GeneralSecurityException {
        atm0 o5x0Var;
        boolean z;
        fqw0 fqw0Var = jar0.g;
        if (mfx0Var.t() <= 0) {
            hny.o("empty keyset");
            return null;
        }
        gfk0 gfk0Var = gfk0.h;
        ArrayList arrayList = new ArrayList(mfx0Var.t());
        Iterator it = mfx0Var.A().iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                List<dow0> listUnmodifiableList = Collections.unmodifiableList(arrayList);
                if ((gqw0.class.equals(qpw0.class) ? gqw0.class.cast(fqw0Var) : (!gqw0.class.equals(gqw0.class) || jyw0.f17379a.f41787a.get()) ? null : gqw0.class.cast(new gqw0())) == null) {
                    HashSet hashSet = new HashSet();
                    for (dow0 dow0Var : listUnmodifiableList) {
                        int i = dow0Var.d;
                        if (hashSet.contains(Integer.valueOf(i))) {
                            throw new GeneralSecurityException(ua80.e(i, "KeyID ", " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                        }
                        hashSet.add(Integer.valueOf(i));
                        if (dow0Var.e) {
                            z2 = true;
                        }
                    }
                    if (!z2) {
                        hny.o("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                        return null;
                    }
                }
                return new fck0((Object) listUnmodifiableList, (Object) new HashMap(), (byte) 24);
            }
            jfx0 jfx0Var = (jfx0) it.next();
            int iU = jfx0Var.u();
            try {
                vkr0 vkr0VarO = o(jfx0Var);
                qpw0 qpw0Var = (qpw0) (qpw0.class.equals(qpw0.class) ? qpw0.class.cast(fqw0Var) : (!qpw0.class.equals(gqw0.class) || jyw0.f17379a.f41787a.get()) ? null : qpw0.class.cast(new gqw0()));
                if (qpw0Var == null) {
                    throw new GeneralSecurityException("Passed in configuration cannot be used to serialize into proto keyset format.");
                }
                o5x0Var = qpw0Var.c(vkr0VarO);
                z = false;
            } catch (GeneralSecurityException e) {
                if ((gqw0.class.equals(qpw0.class) ? gqw0.class.cast(fqw0Var) : (!gqw0.class.equals(gqw0.class) || jyw0.f17379a.f41787a.get()) ? null : gqw0.class.cast(new gqw0())) == null) {
                    throw e;
                }
                o5x0Var = new o5x0(o(jfx0Var), gfk0Var);
                z = true;
            }
            atm0 atm0Var = o5x0Var;
            if ((gqw0.class.equals(qpw0.class) ? gqw0.class.cast(fqw0Var) : (!gqw0.class.equals(gqw0.class) || jyw0.f17379a.f41787a.get()) ? null : gqw0.class.cast(new gqw0())) == null && !B(jfx0Var.A())) {
                hny.o("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
                return null;
            }
            arrayList.add(new dow0(atm0Var, jfx0Var.A(), iU, iU == mfx0Var.y(), z));
        }
    }

    public static fck0 n(Context context, String str) {
        fck0 fck0Var = d;
        if (fck0Var == null || !((String) fck0Var.b).equals(str)) {
            d = new fck0(context, str);
        }
        return d;
    }

    public static vkr0 o(jfx0 jfx0Var) {
        return vkr0.C(jfx0Var.z().A(), jfx0Var.z().z(), bcm0.E(jfx0Var.z().x()), bcm0.G(jfx0Var.C()), jfx0Var.C() == 4 ? null : Integer.valueOf(jfx0Var.u()));
    }

    public static zzad t(nfq nfqVar, biw0 biw0Var) {
        s0x.H(nfqVar);
        s0x.H(biw0Var);
        ArrayList arrayList = new ArrayList();
        com.google.firebase.auth.internal.zzz zzzVar = new com.google.firebase.auth.internal.zzz();
        s0x.E("firebase");
        String str = biw0Var.f2677a;
        s0x.E(str);
        zzzVar.f45659a = str;
        zzzVar.b = "firebase";
        zzzVar.e = biw0Var.b;
        zzzVar.c = biw0Var.d;
        String str2 = biw0Var.e;
        Uri uri = !TextUtils.isEmpty(str2) ? Uri.parse(str2) : null;
        if (uri != null) {
            zzzVar.d = uri.toString();
        }
        zzzVar.g = biw0Var.c;
        zzzVar.h = null;
        zzzVar.f = biw0Var.g;
        arrayList.add(zzzVar);
        List list = (List) biw0Var.f.b;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                niw0 niw0Var = (niw0) list.get(i);
                com.google.firebase.auth.internal.zzz zzzVar2 = new com.google.firebase.auth.internal.zzz();
                s0x.H(niw0Var);
                zzzVar2.f45659a = niw0Var.f23610a;
                String str3 = niw0Var.d;
                s0x.E(str3);
                zzzVar2.b = str3;
                zzzVar2.c = niw0Var.b;
                String str4 = niw0Var.c;
                Uri uri2 = !TextUtils.isEmpty(str4) ? Uri.parse(str4) : null;
                if (uri2 != null) {
                    zzzVar2.d = uri2.toString();
                }
                zzzVar2.e = niw0Var.g;
                zzzVar2.f = niw0Var.f;
                zzzVar2.g = false;
                zzzVar2.h = niw0Var.e;
                arrayList.add(zzzVar2);
            }
        }
        zzad zzadVar = new zzad(nfqVar, arrayList);
        zzadVar.i = new zzaf(biw0Var.i, biw0Var.h);
        zzadVar.j = biw0Var.j;
        zzadVar.k = biw0Var.k;
        zzadVar.s(rsm0.z(biw0Var.l));
        List arrayList2 = biw0Var.m;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        zzadVar.m = arrayList2;
        return zzadVar;
    }

    public void A(Enum r2, Object obj) {
        ((HashMap) this.b).put(r2, obj);
        ((HashMap) this.c).put(obj, r2);
    }

    public fck0 C() throws GeneralSecurityException {
        atm0 o5x0Var;
        List<dow0> list = (List) this.b;
        ArrayList arrayList = new ArrayList(list.size());
        for (dow0 dow0Var : list) {
            atm0 atm0Var = dow0Var.f6432a;
            if (atm0Var instanceof i1x0) {
                o5x0Var = ((i1x0) atm0Var).u();
            } else {
                if (!(atm0Var instanceof o5x0)) {
                    throw new GeneralSecurityException("Cannot get Public Key for key of type ".concat(String.valueOf(dow0Var.f6432a.getClass())));
                }
                vkr0 vkr0Var = ((o5x0) atm0Var).f24707a;
                String str = (String) vkr0Var.b;
                l5x0 l5x0VarE = a5x0.d.e(str);
                if (!(l5x0VarE instanceof q5x0)) {
                    throw new GeneralSecurityException(kng0.l("manager for key type ", str, " is not a PrivateKeyManager"));
                }
                q5x0 q5x0Var = (q5x0) l5x0VarE;
                vkr0 vkr0VarC = vkr0.C(q5x0Var.f19481a, (sjw0) vkr0Var.c, bcm0.E(q5x0Var.c), bcm0.G(4), null);
                k6x0 k6x0Var = k6x0.b;
                atm0 atm0VarC = ((u7x0) k6x0Var.f17793a.get()).c(vkr0VarC);
                if (!(atm0VarC instanceof i1x0)) {
                    hny.o("Key not private key");
                    return null;
                }
                vkr0 vkr0VarA = ((u7x0) k6x0Var.f17793a.get()).a(((i1x0) atm0VarC).u());
                vex0 vex0VarT = wex0.t();
                String str2 = (String) vkr0VarA.b;
                vex0VarT.d();
                wex0.w((wex0) vex0VarT.b, str2);
                sjw0 sjw0Var = (sjw0) vkr0VarA.c;
                vex0VarT.d();
                wex0.v((wex0) vex0VarT.b, sjw0Var);
                int iC = bcm0.C((hbb) vkr0VarA.d);
                vex0VarT.d();
                wex0.u((wex0) vex0VarT.b, iC);
                wex0 wex0Var = (wex0) vex0VarT.c();
                o5x0Var = new o5x0(vkr0.C(wex0Var.A(), wex0Var.z(), bcm0.E(wex0Var.x()), (lpw0) vkr0Var.e, (Integer) vkr0Var.f), null);
            }
            dow0 dow0Var2 = new dow0(o5x0Var, dow0Var.b, dow0Var.d, dow0Var.e, false);
            int i = dow0Var.d;
            Integer numT = o5x0Var.t();
            if (numT != null && numT.intValue() != i) {
                hny.o("Wrong ID set for key with ID requirement");
                return null;
            }
            arrayList.add(dow0Var2);
        }
        fck0 fck0Var = new fck0((Object) arrayList, this.c, (byte) 24);
        fck0Var.x();
        return fck0Var;
    }

    public dow0 D() {
        for (dow0 dow0Var : (List) this.b) {
            if (dow0Var != null && dow0Var.e) {
                if (dow0Var.c == pfw.g) {
                    return dow0Var;
                }
                jf4.n("Keyset has primary which isn't enabled");
                return null;
            }
        }
        jf4.n("Keyset has no valid primary");
        return null;
    }

    public mfx0 E() {
        try {
            kfx0 kfx0VarZ = mfx0.z();
            for (dow0 dow0Var : (List) this.b) {
                atm0 atm0Var = dow0Var.f6432a;
                int i = dow0Var.d;
                int i2 = dow0Var.b;
                qpw0 qpw0Var = (qpw0) (qpw0.class.equals(qpw0.class) ? qpw0.class.cast(jar0.g) : (!qpw0.class.equals(gqw0.class) || jyw0.f17379a.f41787a.get()) ? null : qpw0.class.cast(new gqw0()));
                if (qpw0Var == null) {
                    throw new GeneralSecurityException("Passed in configuration cannot be used to parse and serialize proto keysets.");
                }
                vkr0 vkr0VarA = qpw0Var.a(atm0Var);
                Integer numT = atm0Var.t();
                if (numT != null && numT.intValue() != i) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
                ifx0 ifx0VarB = jfx0.B();
                vex0 vex0VarT = wex0.t();
                String str = (String) vkr0VarA.b;
                vex0VarT.d();
                wex0.w((wex0) vex0VarT.b, str);
                sjw0 sjw0Var = (sjw0) vkr0VarA.c;
                vex0VarT.d();
                wex0.v((wex0) vex0VarT.b, sjw0Var);
                int iC = bcm0.C((hbb) vkr0VarA.d);
                vex0VarT.d();
                wex0.u((wex0) vex0VarT.b, iC);
                ifx0VarB.d();
                jfx0.w((jfx0) ifx0VarB.b, (wex0) vex0VarT.c());
                ifx0VarB.d();
                ((jfx0) ifx0VarB.b).zzg = esw0.c(i2);
                ifx0VarB.d();
                ((jfx0) ifx0VarB.b).zzh = i;
                int iD = bcm0.D((lpw0) vkr0VarA.e);
                ifx0VarB.d();
                ((jfx0) ifx0VarB.b).zzi = esw0.e(iD);
                jfx0 jfx0Var = (jfx0) ifx0VarB.c();
                kfx0VarZ.d();
                mfx0.x((mfx0) kfx0VarZ.b, jfx0Var);
                if (dow0Var.e) {
                    kfx0VarZ.d();
                    ((mfx0) kfx0VarZ.b).zze = i;
                }
            }
            return (mfx0) kfx0VarZ.c();
        } catch (GeneralSecurityException e) {
            itt0.s(e);
            return null;
        }
    }

    public boolean a(xov0 xov0Var) {
        boolean zContainsKey;
        synchronized (this.c) {
            zContainsKey = ((ea70) this.b).f7454a.containsKey(xov0Var);
        }
        return zContainsKey;
    }

    public Object c() {
        Object objRemoveLast;
        synchronized (this.c) {
            objRemoveLast = ((ArrayDeque) this.b).removeLast();
        }
        return objRemoveLast;
    }

    public int d(String str) {
        int andIncrement;
        str.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        Integer num = (Integer) concurrentHashMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        synchronized (concurrentHashMap) {
            try {
                Integer num2 = (Integer) concurrentHashMap.get(str);
                if (num2 != null) {
                    andIncrement = num2.intValue();
                } else {
                    andIncrement = ((AtomicInteger) this.c).getAndIncrement();
                    concurrentHashMap.putIfAbsent(str, Integer.valueOf(andIncrement));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return andIncrement;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:66|24|(1:27)|58) */
    /* JADX WARN: Code duplicated, block: B:27:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:33:0x0102 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0104  */
    /* JADX WARN: Code duplicated, block: B:35:0x010c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0113  */
    /* JADX WARN: Code duplicated, block: B:38:0x0115  */
    /* JADX WARN: Code duplicated, block: B:41:0x011a  */
    /* JADX WARN: Code duplicated, block: B:46:0x013a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0142  */
    /* JADX WARN: Code duplicated, block: B:48:0x0144  */
    /* JADX WARN: Code duplicated, block: B:50:0x014b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0152  */
    /* JADX WARN: Code duplicated, block: B:53:0x0154  */
    /* JADX WARN: Code duplicated, block: B:56:0x0159  */
    /* JADX WARN: Code duplicated, block: B:60:0x0176  */
    /* JADX WARN: Code duplicated, block: B:61:0x017f  */
    /* JADX WARN: Code duplicated, block: B:62:0x018a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x018c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0192  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0170, code lost:
    
        if (a.qcc.P(r10, r5) == r3) goto L58;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0104 -> B:23:0x00b2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0170 -> B:59:0x0173). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0176 -> B:59:0x0173). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x017f -> B:45:0x0137). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(int r20, int r21, a.zje r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fck0.e(int, int, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Serializable f(String str, String str2, zje zjeVar) {
        gfs0 gfs0Var;
        if (zjeVar instanceof gfs0) {
            gfs0Var = (gfs0) zjeVar;
            int i = gfs0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                gfs0Var.k = i - Integer.MIN_VALUE;
            } else {
                gfs0Var = new gfs0(this, zjeVar);
            }
        } else {
            gfs0Var = new gfs0(this, zjeVar);
        }
        gfs0 gfs0Var2 = gfs0Var;
        Object objA = gfs0Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = gfs0Var2.k;
        if (i2 == 0) {
            z1x.P(objA);
            ilp0 ilp0Var = (ilp0) this.b;
            String strA = ((btt0) this.c).a();
            gfs0Var2.k = 1;
            objA = ((d57) ilp0Var.f14992a).a(strA, str, str2, "application/vnd.xenvelop+json", gfs0Var2);
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
        Iterable<k7w> iterable = (Iterable) ((dx5) objA).a();
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (k7w k7wVar : iterable) {
            k7wVar.getClass();
            Long l = k7wVar.f17844a;
            long jLongValue = l != null ? l.longValue() : 0L;
            Double d2 = k7wVar.b;
            double dDoubleValue = 0.0d;
            double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
            Double d3 = k7wVar.c;
            if (d3 != null) {
                dDoubleValue = d3.doubleValue();
            }
            arrayList.add(new l7w(dDoubleValue2, dDoubleValue, jLongValue));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object g(String str, zje zjeVar) {
        dlt0 dlt0Var;
        Object value;
        Object objA;
        aja ajaVar = (aja) this.c;
        if (zjeVar instanceof dlt0) {
            dlt0Var = (dlt0) zjeVar;
            int i = dlt0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                dlt0Var.l = i - Integer.MIN_VALUE;
            } else {
                dlt0Var = new dlt0(this, zjeVar);
            }
        } else {
            dlt0Var = new dlt0(this, zjeVar);
        }
        Object objD0 = dlt0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = dlt0Var.l;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objD0);
            Object value2 = ajaVar.f964a.f30402a.getValue();
            bgs bgsVar = value2 instanceof bgs ? (bgs) value2 : null;
            if ((bgsVar != null ? bgsVar.e : null) == null) {
                q700 q700Var = (q700) this.b;
                dlt0Var.i = ajaVar;
                dlt0Var.l = 1;
                objD0 = qjj.d0(q700Var.c.b, new juy((Object) q700Var, (Object) str, yjeVar, (byte) 10), dlt0Var);
                if (objD0 == wneVar) {
                    return wneVar;
                }
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ajaVar = dlt0Var.i;
        z1x.P(objD0);
        p700 p700Var = (p700) objD0;
        ajaVar.getClass();
        p700Var.getClass();
        rfs rfsVar = ajaVar.f964a;
        rfsVar.getClass();
        p7m0 p7m0Var = rfsVar.f30402a;
        do {
            value = p7m0Var.getValue();
            objA = (egs) value;
            if (objA instanceof bgs) {
                objA = bgs.a((bgs) objA, null, null, null, null, p700Var, null, false, 111);
            }
        } while (!p7m0Var.m(value, objA));
        return Unit.f46060a;
    }

    public h6m0 h(xov0 xov0Var) {
        h6m0 h6m0VarC;
        xov0Var.getClass();
        synchronized (this.c) {
            h6m0VarC = ((ea70) this.b).c(xov0Var);
        }
        return h6m0VarC;
    }

    public h6m0 i(xov0 xov0Var) {
        h6m0 h6m0VarE;
        synchronized (this.c) {
            h6m0VarE = ((ea70) this.b).e(xov0Var);
        }
        return h6m0VarE;
    }

    public void j(qfu0 qfu0Var) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new qaq0(this, qfu0Var, (byte) 15));
        }
    }

    @Override // a.cfr
    public void onFailure(Throwable th) {
        int i = ((cmn0) this.b).f;
        if (i == 2 && (th instanceof CancellationException)) {
            l8x.U("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
        } else {
            l8x.F0("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: ".concat(ohm0.m(i)), th);
        }
    }

    @Override // a.cfr
    public void onSuccess(Object obj) {
        imn0 imn0Var = (imn0) obj;
        imn0Var.getClass();
        ((txj) ((cyu) this.c).f5196a).a(imn0Var);
    }

    public okt0 p() {
        return new okt0(Collections.unmodifiableMap((HashMap) this.b), Collections.unmodifiableMap((HashMap) this.c));
    }

    public dow0 q(int i) {
        List list = (List) this.b;
        if (i < 0 || i >= list.size()) {
            v4i0.m(f140.j(i, "Invalid index ", list.size(), " for keyset of size "));
            return null;
        }
        dow0 dow0Var = (dow0) list.get(i);
        if (!B(dow0Var.b)) {
            jf4.n(ua80.e(i, "Keyset-Entry at position ", " has wrong status"));
            return null;
        }
        if (!dow0Var.f) {
            return (dow0) list.get(i);
        }
        jf4.n(ua80.e(i, "Keyset-Entry at position ", " didn't parse correctly"));
        return null;
    }

    public Task r(nfq nfqVar, FirebaseUser firebaseUser, AuthCredential authCredential, String str, iow0 iow0Var) {
        s0x.H(nfqVar);
        s0x.H(authCredential);
        s0x.H(firebaseUser);
        s0x.H(iow0Var);
        ArrayList arrayList = ((zzad) firebaseUser).f;
        if (arrayList != null && arrayList.contains(authCredential.m())) {
            return Tasks.forException(jfw0.a(new Status(17015, null, null, null)));
        }
        if (authCredential instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredential;
            if (TextUtils.isEmpty(emailAuthCredential.c)) {
                new0 new0Var = new new0(emailAuthCredential, str);
                new0Var.c = nfqVar;
                new0Var.d = firebaseUser;
                new0Var.e = iow0Var;
                new0Var.f = iow0Var;
                return s(new0Var);
            }
            cew0 cew0Var = new cew0((AuthCredential) emailAuthCredential, (byte) 3);
            cew0Var.c = nfqVar;
            cew0Var.d = firebaseUser;
            cew0Var.e = iow0Var;
            cew0Var.f = iow0Var;
            return s(cew0Var);
        }
        if (!(authCredential instanceof PhoneAuthCredential)) {
            few0 few0Var = new few0(authCredential);
            few0Var.c = nfqVar;
            few0Var.d = firebaseUser;
            few0Var.e = iow0Var;
            few0Var.f = iow0Var;
            return s(few0Var);
        }
        qgw0.f28707a.clear();
        cew0 cew0Var2 = new cew0(authCredential, (byte) 2);
        cew0Var2.c = nfqVar;
        cew0Var2.d = firebaseUser;
        cew0Var2.e = iow0Var;
        cew0Var2.f = iow0Var;
        return s(cew0Var2);
    }

    public Task s(dgw0 dgw0Var) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Executor executor = (Executor) this.c;
        hf5 hf5Var = new hf5((byte) 11);
        hf5Var.b = this;
        hf5Var.c = dgw0Var;
        hf5Var.d = taskCompletionSource;
        executor.execute(hf5Var);
        return taskCompletionSource.getTask();
    }

    public String toString() {
        switch (this.f9317a) {
            case 24:
                return iqw0.a(E()).toString();
            default:
                return super.toString();
        }
    }

    public Object u(anw0 anw0Var, Class cls) throws GeneralSecurityException {
        String str;
        List list = (List) this.b;
        mfx0 mfx0VarE = E();
        int i = iqw0.f15231a;
        int iY = mfx0VarE.y();
        int i2 = 0;
        boolean z = false;
        for (jfx0 jfx0Var : mfx0VarE.A()) {
            if (jfx0Var.A() == 2) {
                if (!jfx0Var.t()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(jfx0Var.u())));
                }
                if (jfx0Var.C() == 1) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(jfx0Var.u())));
                }
                if (jfx0Var.A() == 1) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(jfx0Var.u())));
                }
                if (jfx0Var.u() == iY) {
                    if (z) {
                        hny.o("keyset contains multiple primary keys");
                        return null;
                    }
                    z = true;
                }
                i2++;
            }
        }
        if (i2 == 0) {
            hny.o("keyset must contain at least one ENABLED key");
            return null;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (((dow0) list.get(i3)).f || !B(((dow0) list.get(i3)).b)) {
                atm0 atm0Var = ((dow0) list.get(i3)).f6432a;
                if (atm0Var instanceof o5x0) {
                    gfk0 gfk0Var = gfk0.h;
                    vkr0 vkr0Var = ((o5x0) atm0Var).f24707a;
                    o5x0.u(vkr0Var, gfk0Var);
                    str = (String) vkr0Var.b;
                } else {
                    str = "(unknown)";
                }
                throw new GeneralSecurityException(defpackage.c.b(i3, "Key parsing of key with index ", " and type_url ", str, " failed, unable to get primitive"));
            }
        }
        return anw0Var.f(this, cls);
    }

    public String v() {
        if (((ok50) this.c) == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        nmt0 nmt0Var = new nmt0(byteArrayOutputStream);
        try {
            synchronized (((ok50) this.c)) {
                ((ok50) this.c).p().C().z(nmt0Var);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e) {
            f140.r("Exception encountered when attempting to get Public Key:\n", e.getMessage(), "FirebearCryptoHelper");
            return null;
        }
    }

    public String w(String str) {
        String str2;
        ok50 ok50Var = (ok50) this.c;
        if (ok50Var == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (ok50Var) {
                fck0 fck0VarP = ((ok50) this.c).p();
                try {
                    if (pyw0.a()) {
                        throw new GeneralSecurityException("Cannot use non-FIPS-compliant HybridConfigurationV1 in FIPS mode");
                    }
                    str2 = new String(((dnw0) fck0VarP.u(t0x0.f33142a, dnw0.class)).b(Base64.decode(str, 8), null), StandardCharsets.UTF_8);
                } catch (GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            }
            return str2;
        } catch (GeneralSecurityException e2) {
            f140.r("Exception encountered while decrypting bytes:\n", e2.getMessage(), "FirebearCryptoHelper");
            return null;
        }
    }

    public void x() {
        if (((HashMap) this.c).get(s5x0.class) == null) {
            return;
        }
        hny.b();
    }

    public void y(fuj0 fuj0Var, g4x0 g4x0Var, byte[] bArr) throws IOException {
        mfx0 mfx0VarE = E();
        byte[] bArrC = g4x0Var.c(mfx0VarE.c(), bArr);
        hdx0 hdx0VarW = idx0.w();
        vjw0 vjw0VarH = sjw0.h(bArrC, 0, bArrC.length);
        hdx0VarW.d();
        idx0.u((idx0) hdx0VarW.b, vjw0VarH);
        sfx0 sfx0VarA = iqw0.a(mfx0VarE);
        hdx0VarW.d();
        idx0.v((idx0) hdx0VarW.b, sfx0VarA);
        if (((SharedPreferences.Editor) fuj0Var.b).putString((String) fuj0Var.f10166a, zcm0.s(((idx0) hdx0VarW.c()).c())).commit()) {
            return;
        }
        ohq.l("Failed to write to SharedPreferences");
    }

    public void z(nmt0 nmt0Var) throws GeneralSecurityException, IOException {
        String str;
        mfx0 mfx0VarE = E();
        for (jfx0 jfx0Var : mfx0VarE.A()) {
            if (jfx0Var.z().x() == 1 || jfx0Var.z().x() == 2 || jfx0Var.z().x() == 3) {
                switch (jfx0Var.z().x()) {
                    case 1:
                        str = "UNKNOWN_KEYMATERIAL";
                        break;
                    case 2:
                        str = "SYMMETRIC";
                        break;
                    case 3:
                        str = "ASYMMETRIC_PRIVATE";
                        break;
                    case 4:
                        str = "ASYMMETRIC_PUBLIC";
                        break;
                    case 5:
                        str = "REMOTE";
                        break;
                    case 6:
                        str = "UNRECOGNIZED";
                        break;
                    default:
                        throw null;
                }
                throw new GeneralSecurityException(ua80.i("keyset contains key material of type ", str, " for type url ", jfx0Var.z().A()));
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) nmt0Var.f23789a;
        try {
            mfx0 mfx0Var = mfx0VarE;
            int iB = mfx0Var.b(null);
            if (iB > 4096) {
                iB = 4096;
            }
            ckw0 ckw0Var = new ckw0(byteArrayOutputStream, iB);
            mfx0Var.k(ckw0Var);
            if (ckw0Var.e > 0) {
                ckw0Var.o1();
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ((TaskCompletionSource) this.b).setException(exc);
        s88.y((Context) this.c);
    }

    public /* synthetic */ fck0(Object obj, Object obj2, byte b) {
        this.f9317a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ fck0(Object obj, Object obj2, boolean z, byte b) {
        this.f9317a = b;
        this.c = obj;
        this.b = obj2;
    }

    public fck0(s88 s88Var, TaskCompletionSource taskCompletionSource, Context context) {
        this.f9317a = (byte) 23;
        this.b = taskCompletionSource;
        this.c = context;
    }

    public fck0(q700 q700Var, aja ajaVar) {
        this.f9317a = (byte) 14;
        q700Var.getClass();
        ajaVar.getClass();
        this.b = q700Var;
        this.c = ajaVar;
    }

    public fck0(ilp0 ilp0Var, btt0 btt0Var) {
        this.f9317a = (byte) 10;
        btt0Var.getClass();
        this.b = ilp0Var;
        this.c = btt0Var;
    }

    public fck0(gii0 gii0Var, byte b) {
        this.f9317a = b;
        byte b2 = 20;
        gii0Var.getClass();
        switch (b) {
            case 6:
                this.b = gii0Var;
                this.c = new nxo0(this, (byte) 7);
                break;
            case 7:
                this.b = gii0Var;
                this.c = new nxo0(this, b2);
                break;
            case 8:
            default:
                this.b = gii0Var;
                this.c = new goi0(this, b2);
                break;
            case 9:
                this.b = gii0Var;
                this.c = new qir0(this, (byte) 3);
                break;
        }
    }

    public fck0(epi0 epi0Var, knf0 knf0Var) {
        this.f9317a = (byte) 8;
        knf0Var.getClass();
        this.b = epi0Var;
        this.c = knf0Var;
    }

    public fck0(q7d0 q7d0Var, zoq0 zoq0Var) {
        this.f9317a = (byte) 2;
        q7d0Var.getClass();
        zoq0Var.getClass();
        this.b = q7d0Var;
        this.c = zoq0Var;
    }

    public /* synthetic */ fck0(byte b, boolean z) {
        this.f9317a = b;
    }

    public fck0(itt0 itt0Var) {
        this.f9317a = (byte) 20;
        this.c = new Object();
        this.b = new ArrayDeque(3);
    }

    public fck0(byte b) {
        this.f9317a = b;
        switch (b) {
            case 17:
                this.b = new xz40(new Reference[16]);
                this.c = new ReferenceQueue();
                break;
            default:
                this.b = new ConcurrentHashMap();
                this.c = new AtomicInteger(0);
                break;
        }
    }

    public fck0(ea70 ea70Var) {
        this.f9317a = (byte) 5;
        this.b = ea70Var;
        this.c = new Object();
    }

    public fck0(Handler handler, qlo qloVar) {
        this.f9317a = (byte) 16;
        if (qloVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = qloVar;
    }
}
