package a;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.function.Function;

/* JADX INFO: loaded from: classes2.dex */
public final class fbv implements iwk {
    public static fbv c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f9280a = new CopyOnWriteArraySet();
    public volatile Object b;

    public static fbv b(Context context) {
        fbv fbvVar;
        s0x.H(context);
        synchronized (fbv.class) {
            fbvVar = c;
            if (fbvVar == null) {
                wpw0 wpw0Var = s4x0.f31630a;
                synchronized (s4x0.class) {
                    if (s4x0.e == null) {
                        s4x0.e = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                fbvVar = new fbv();
                fbvVar.f9280a = context.getApplicationContext();
                c = fbvVar;
            }
        }
        return fbvVar;
    }

    public static final boolean f(PackageInfo packageInfo, boolean z) {
        gjw0 gjw0Var;
        int i;
        if (packageInfo != null) {
            if (z && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            try {
                gjw0 gjw0Var2 = z ? l3x0.c : l3x0.b;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 28) {
                    Signature[] signatureArr = packageInfo.signatures;
                    byte[] byteArray = null;
                    if (signatureArr != null && signatureArr.length == 1) {
                        byteArray = signatureArr[0].toByteArray();
                    }
                    if (byteArray != null) {
                        qew0 qew0Var = ghw0.e;
                        Object[] objArr = {byteArray};
                        dnm0.t(1, objArr);
                        gjw0Var = new gjw0(1, objArr);
                    } else {
                        qew0 qew0Var2 = ghw0.e;
                        gjw0Var = gjw0.h;
                    }
                } else {
                    if (i2 < 28) {
                        throw new IllegalStateException();
                    }
                    SigningInfo signingInfo = packageInfo.signingInfo;
                    if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                        qew0 qew0Var3 = ghw0.e;
                        gjw0Var = gjw0.h;
                    } else {
                        qew0 qew0Var4 = ghw0.e;
                        Object[] objArrCopyOf = new Object[4];
                        Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                        int length = signingCertificateHistory.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            byte[] byteArray2 = signingCertificateHistory[i3].toByteArray();
                            byteArray2.getClass();
                            int length2 = objArrCopyOf.length;
                            int i5 = i4 + 1;
                            if (i5 < 0) {
                                throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                            }
                            if (i5 <= length2) {
                                i = length2;
                            } else {
                                i = (length2 >> 1) + length2 + 1;
                                if (i < i5) {
                                    int iHighestOneBit = Integer.highestOneBit(i4);
                                    i = iHighestOneBit + iHighestOneBit;
                                }
                                if (i < 0) {
                                    i = Integer.MAX_VALUE;
                                }
                            }
                            if (i > length2) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i);
                            }
                            objArrCopyOf[i4] = byteArray2;
                            i3++;
                            i4 = i5;
                        }
                        gjw0Var = i4 == 0 ? gjw0.h : new gjw0(i4, objArrCopyOf);
                    }
                }
                if (gjw0Var.isEmpty()) {
                    throw new IllegalArgumentException("Unable to obtain package certificate history.");
                }
                ghw0 ghw0VarM = gjw0Var.m();
                int size = ghw0VarM.size();
                int i6 = 0;
                while (i6 < size) {
                    byte[] bArr = (byte[]) ghw0VarM.get(i6);
                    qew0 qew0VarQ = gjw0Var2.listIterator(0);
                    do {
                        int i7 = i6 + 1;
                        if (!qew0VarQ.hasNext()) {
                            i6 = i7;
                        }
                    } while (!Arrays.equals(bArr, (byte[]) qew0VarQ.next()));
                    return true;
                }
            } catch (IllegalArgumentException unused) {
                Log.i("GoogleSignatureVerifier", "package info is not set correctly");
                if ((z ? g(packageInfo, l3x0.f19377a) : g(packageInfo, l3x0.f19377a[0])) == null) {
                    return false;
                }
            }
        }
        return false;
    }

    public static kyw0 g(PackageInfo packageInfo, kyw0... kyw0VarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            jzw0 jzw0Var = new jzw0(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < kyw0VarArr.length; i++) {
                if (kyw0VarArr[i].equals(jzw0Var)) {
                    return kyw0VarArr[i];
                }
            }
        }
        return null;
    }

    @Override // a.iwk
    public void a() {
        boolean z;
        mlu0 mlu0VarR = o5n0.r((View) this.f9280a);
        synchronized (mlu0VarR) {
            z = this != mlu0VarR.b;
        }
        if (z) {
            return;
        }
        o5n0.r((View) this.f9280a).a();
    }

    @Override // a.iwk
    public jzj c() {
        return (kzj) this.b;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x01c9 A[EDGE_INSN: B:128:0x01c9->B:103:0x01c9 BREAK  A[LOOP:0: B:8:0x001a->B:98:0x01b7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0193  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b7 A[LOOP:0: B:8:0x001a->B:98:0x01b7, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean d(int i) {
        cgx0 cgx0VarZ;
        int length;
        ApplicationInfo applicationInfo;
        String[] packagesForUid = ((Context) this.f9280a).getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            cgx0VarZ = cgx0.z("no pkgs");
        } else {
            byte b = 0;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            int i2 = 0;
            cgx0VarZ = null;
            while (true) {
                if (i2 >= length) {
                    s0x.H(cgx0VarZ);
                    break;
                }
                String str = packagesForUid[i2];
                if (str == null) {
                    cgx0VarZ = cgx0.z("null pkg");
                } else {
                    if (str.equals((String) this.b)) {
                        cgx0VarZ = cgx0.e;
                    } else {
                        wpw0 wpw0Var = s4x0.f31630a;
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        boolean z = true;
                        try {
                            try {
                                s4x0.a();
                                boolean zJ = ((lcw0) s4x0.c).J();
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                if (zJ) {
                                    boolean zA = bbv.a((Context) this.f9280a);
                                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                                    try {
                                        s0x.H(s4x0.e);
                                        try {
                                            s4x0.a();
                                            s0x.H(s4x0.e);
                                            com.google.android.gms.common.zzp zzpVar = new com.google.android.gms.common.zzp(str, zA, false, new aa60(s4x0.e), false, true, false);
                                            try {
                                                lcw0 lcw0Var = (lcw0) s4x0.c;
                                                Parcel parcelG = lcw0Var.G();
                                                int i3 = mnw0.f22111a;
                                                parcelG.writeInt(1);
                                                zzpVar.writeToParcel(parcelG, 0);
                                                Parcel parcelE = lcw0Var.E(parcelG, 6);
                                                com.google.android.gms.common.zzr zzrVar = (com.google.android.gms.common.zzr) mnw0.a(parcelE, com.google.android.gms.common.zzr.CREATOR);
                                                parcelE.recycle();
                                                if (zzrVar.f45498a) {
                                                    etm0.x(zzrVar.d);
                                                    Object obj = null;
                                                    cgx0VarZ = new cgx0(z, obj, obj, b);
                                                } else {
                                                    String str2 = zzrVar.b;
                                                    PackageManager.NameNotFoundException nameNotFoundException = hfm0.I(zzrVar.c) == 4 ? new PackageManager.NameNotFoundException() : null;
                                                    if (str2 == null) {
                                                        str2 = "error checking package certificate";
                                                    }
                                                    etm0.x(zzrVar.d);
                                                    hfm0.I(zzrVar.c);
                                                    cgx0VarZ = new cgx0(objArr2 == true ? 1 : 0, str2, nameNotFoundException, objArr == true ? 1 : 0);
                                                }
                                            } catch (RemoteException e) {
                                                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                                                cgx0VarZ = cgx0.A("module call", e);
                                            }
                                        } catch (lgn e2) {
                                            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                                            cgx0VarZ = cgx0.A("module init: ".concat(String.valueOf(e2.getMessage())), e2);
                                        }
                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                                    } catch (Throwable th) {
                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                                        throw th;
                                    }
                                } else {
                                    try {
                                        PackageInfo packageInfo = ((Context) this.f9280a).getPackageManager().getPackageInfo(str, Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
                                        boolean zA2 = bbv.a((Context) this.f9280a);
                                        if (packageInfo == null) {
                                            cgx0VarZ = cgx0.z("null pkg");
                                        } else {
                                            Signature[] signatureArr = packageInfo.signatures;
                                            if (signatureArr == null || signatureArr.length != z) {
                                                cgx0VarZ = cgx0.z("single cert required");
                                            } else {
                                                jzw0 jzw0Var = new jzw0(packageInfo.signatures[0].toByteArray());
                                                String str3 = packageInfo.packageName;
                                                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                                try {
                                                    cgx0 cgx0VarB = s4x0.b(str3, jzw0Var, zA2, false);
                                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                                    if (!cgx0VarB.b || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0) {
                                                        cgx0VarZ = cgx0VarB;
                                                    } else {
                                                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads4 = StrictMode.allowThreadDiskReads();
                                                        try {
                                                            cgx0 cgx0VarB2 = s4x0.b(str3, jzw0Var, false, true);
                                                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                            if (cgx0VarB2.b) {
                                                                cgx0VarZ = cgx0.z("debuggable release cert app rejected");
                                                            } else {
                                                                cgx0VarZ = cgx0VarB;
                                                            }
                                                        } catch (Throwable th2) {
                                                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th3) {
                                                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                                    throw th3;
                                                }
                                            }
                                        }
                                    } catch (PackageManager.NameNotFoundException e3) {
                                        cgx0VarZ = cgx0.A("no pkg ".concat(str), e3);
                                    }
                                }
                            } catch (Throwable th4) {
                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                throw th4;
                            }
                        } catch (lgn | RemoteException e4) {
                            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        }
                        if (cgx0VarZ.b) {
                            this.b = str;
                        }
                    }
                    if (cgx0VarZ.b) {
                        break;
                    }
                    i2++;
                }
                if (cgx0VarZ.b) {
                    break;
                    break;
                }
                i2++;
            }
        }
        if (!cgx0VarZ.b && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            Throwable th5 = (Throwable) cgx0VarZ.d;
            if (th5 != null) {
                Log.d("GoogleCertificatesRslt", cgx0VarZ.y(), th5);
            } else {
                Log.d("GoogleCertificatesRslt", cgx0VarZ.y());
            }
        }
        return cgx0VarZ.b;
    }

    public l6x0 e(final c1x0 c1x0Var) {
        final n5x0 n5x0Var = (n5x0) this.b;
        n5x0 n5x0Var2 = l6x0.i;
        if (n5x0Var != n5x0Var2) {
            zas0 zas0Var = l6x0.h;
            zas0Var.getClass();
            final nqd nqdVar = new nqd((byte) 13);
            byte b = 0;
            nqdVar.b = false;
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) zas0Var.b;
            Context context = c1x0Var.b;
            String str = n5x0Var.d;
            if (str == null) {
                str = (String) n5x0Var.f22967a.apply(context);
                n5x0Var.d = str;
            }
            p5x0 p5x0Var = (p5x0) concurrentHashMap.computeIfAbsent(str, new Function() { // from class: a.f6x0
                @Override // java.util.function.Function
                public final /* synthetic */ Object apply(Object obj) {
                    p5x0 p5x0Var2 = new p5x0(new l6x0(c1x0Var, n5x0Var));
                    nqdVar.b = true;
                    return p5x0Var2;
                }
            });
            if (nqdVar.b) {
                Context context2 = c1x0Var.b;
                w4p0 w4p0Var = new w4p0((Object) zas0Var, (byte) 26);
                if (q7x0.b == null) {
                    synchronized (q7x0.class) {
                        try {
                            if (q7x0.b == null) {
                                if (!Objects.equals(context2.getPackageName(), "com.google.android.gms")) {
                                    if (Build.VERSION.SDK_INT >= 33) {
                                        context2.registerReceiver(new q7x0(b), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                                    } else {
                                        context2.registerReceiver(new q7x0(b), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                                    }
                                }
                                q7x0.b = w4p0Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            this.f9280a = p5x0Var.f26426a;
            this.b = n5x0Var2;
        }
        return (l6x0) this.f9280a;
    }
}
