package a;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzao;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpl;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class oyw0 extends umw0 implements gtw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m6x0 f26078a;
    public Boolean b;
    public String c;

    public oyw0(m6x0 m6x0Var) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        s0x.H(m6x0Var);
        this.f26078a = m6x0Var;
        this.c = null;
    }

    @Override // a.gtw0
    public final List A(String str, String str2, com.google.android.gms.measurement.internal.zzr zzrVar) {
        D(zzrVar);
        String str3 = zzrVar.f45550a;
        s0x.H(str3);
        m6x0 m6x0Var = this.f26078a;
        try {
            return (List) m6x0Var.J().t1(new uxw0(this, str3, str, str2, (byte) 2)).get();
        } catch (InterruptedException | ExecutionException e) {
            m6x0Var.r().g.b(e, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // a.gtw0
    public final void B(com.google.android.gms.measurement.internal.zzr zzrVar) {
        s0x.E(zzrVar.f45550a);
        s0x.H(zzrVar.s);
        C(new pxw0(this, zzrVar, (byte) 2));
    }

    public final void C(Runnable runnable) {
        m6x0 m6x0Var = this.f26078a;
        if (m6x0Var.J().s1()) {
            runnable.run();
        } else {
            m6x0Var.J().x1(runnable);
        }
    }

    public final void D(com.google.android.gms.measurement.internal.zzr zzrVar) {
        s0x.H(zzrVar);
        String str = zzrVar.f45550a;
        s0x.E(str);
        E(str, false);
        this.f26078a.k0().s1(zzrVar.b);
    }

    public final void E(String str, boolean z) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        m6x0 m6x0Var = this.f26078a;
        if (zIsEmpty) {
            m6x0Var.r().g.a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                Boolean boolValueOf = this.b;
                if (boolValueOf == null) {
                    boolean z2 = true;
                    if (!"com.google.android.gms".equals(this.c)) {
                        if (!bcm0.q(Binder.getCallingUid(), m6x0Var.l.f19080a) && !fbv.b(m6x0Var.l.f19080a).d(Binder.getCallingUid())) {
                            z2 = false;
                        }
                    }
                    boolValueOf = Boolean.valueOf(z2);
                    this.b = boolValueOf;
                }
                if (boolValueOf.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                m6x0Var.r().g.b(uuw0.q1(str), "Measurement Service called with invalid calling package. appId");
                throw e;
            }
        }
        if (this.c == null) {
            Context context = m6x0Var.l.f19080a;
            int callingUid = Binder.getCallingUid();
            AtomicBoolean atomicBoolean = bbv.f2326a;
            if (bcm0.B(context, callingUid, str)) {
                this.c = str;
            }
        }
        if (str.equals(this.c)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    public final void F(Runnable runnable) {
        m6x0 m6x0Var = this.f26078a;
        if (m6x0Var.J().s1()) {
            runnable.run();
        } else {
            m6x0Var.J().v1(runnable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.umw0
    public final boolean b(int i, Parcel parcel, Parcel parcel2) {
        List list;
        m6x0 m6x0Var = this.f26078a;
        ArrayList arrayList = null;
        mtw0 jtw0Var = null;
        ttw0 ptw0Var = null;
        boolean z = false;
        byte b = 1;
        switch (i) {
            case 1:
                zzbh zzbhVar = (zzbh) wmw0.a(parcel, zzbh.CREATOR);
                com.google.android.gms.measurement.internal.zzr zzrVar = (com.google.android.gms.measurement.internal.zzr) wmw0.a(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                wmw0.d(parcel);
                z(zzbhVar, zzrVar);
                parcel2.writeNoException();
                return true;
            case 2:
                zzpl zzplVar = (zzpl) wmw0.a(parcel, zzpl.CREATOR);
                com.google.android.gms.measurement.internal.zzr zzrVar2 = (com.google.android.gms.measurement.internal.zzr) wmw0.a(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                wmw0.d(parcel);
                m(zzplVar, zzrVar2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            default:
                return false;
            case 4:
                com.google.android.gms.measurement.internal.zzr zzrVar3 = (com.google.android.gms.measurement.internal.zzr) wmw0.a(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                wmw0.d(parcel);
                v(zzrVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbh zzbhVar2 = (zzbh) wmw0.a(parcel, zzbh.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                wmw0.d(parcel);
                s0x.H(zzbhVar2);
                s0x.E(string);
                E(string, true);
                F(new hf5((Object) this, (Object) zzbhVar2, (Object) string, false, (byte) 16));
                parcel2.writeNoException();
                return true;
            case 6:
                com.google.android.gms.measurement.internal.zzr zzrVar4 = (com.google.android.gms.measurement.internal.zzr) wmw0.a(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                wmw0.d(parcel);
                j(zzrVar4);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.measurement.internal.zzr zzrVar5 = (com.google.android.gms.measurement.internal.zzr) wmw0.a(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                Object[] objArr = parcel.readInt() != 0;
                wmw0.d(parcel);
                D(zzrVar5);
                String str = zzrVar5.f45550a;
                s0x.H(str);
                try {
                    List<v6x0> list2 = (List) m6x0Var.J().t1(new nxw0(this, str, z ? (byte) 1 : (byte) 0)).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (v6x0 v6x0Var : list2) {
                        if (objArr != false || !x6x0.Q1(v6x0Var.c)) {
                            arrayList2.add(new zzpl(v6x0Var));
                        }
                        break;
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException e) {
                    e = e;
                    m6x0Var.r().g.c(uuw0.q1(str), e, "Failed to get user properties. appId");
                } catch (ExecutionException e2) {
                    e = e2;
                    m6x0Var.r().g.c(uuw0.q1(str), e, "Failed to get user properties. appId");
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                zzbh zzbhVar3 = (zzbh) wmw0.a(parcel, zzbh.CREATOR);
                String string2 = parcel.readString();
                wmw0.d(parcel);
                byte[] bArrH = h(zzbhVar3, string2);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrH);
                return true;
            case 10:
                long j = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                wmw0.d(parcel);
                p(j, string3, string4, string5);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.measurement.internal.zzr zzrVar6 = (com.google.android.gms.measurement.internal.zzr) wmw0.a(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                wmw0.d(parcel);
                String strO = o(zzrVar6);
                parcel2.writeNoException();
                parcel2.writeString(strO);
                return true;
            case 12:
                zzah zzahVar = (zzah) wmw0.a(parcel, zzah.CREATOR);
                com.google.android.gms.measurement.internal.zzr zzrVar7 = (com.google.android.gms.measurement.internal.zzr) wmw0.a(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                wmw0.d(parcel);
                e(zzahVar, zzrVar7);
                parcel2.writeNoException();
                return true;
            case 13:
                zzah zzahVar2 = (zzah) wmw0.a(parcel, zzah.CREATOR);
                wmw0.d(parcel);
                s0x.H(zzahVar2);
                s0x.H(zzahVar2.c);
                s0x.E(zzahVar2.f45541a);
                E(zzahVar2.f45541a, true);
                F(new lfr(this, new zzah(zzahVar2), z, (byte) 25));
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ClassLoader classLoader = wmw0.f39422a;
                z = parcel.readInt() != 0;
                com.google.android.gms.measurement.internal.zzr zzrVar8 = (com.google.android.gms.measurement.internal.zzr) wmw0.a(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                wmw0.d(parcel);
                List listY = y(string6, string7, z, zzrVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listY);
                return true;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ClassLoader classLoader2 = wmw0.f39422a;
                boolean z2 = parcel.readInt() != 0;
                wmw0.d(parcel);
                List listC = c(string8, string9, string10, z2);
                parcel2.writeNoException();
                parcel2.writeTypedList(listC);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                com.google.android.gms.measurement.internal.zzr zzrVar9 = (com.google.android.gms.measurement.internal.zzr) wmw0.a(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                wmw0.d(parcel);
                List listA = A(string11, string12, zzrVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listA);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                wmw0.d(parcel);
                List listF = f(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listF);
                return true;
            case 18:
                com.google.android.gms.measurement.internal.zzr zzrVar10 = (com.google.android.gms.measurement.internal.zzr) wmw0.a(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                wmw0.d(parcel);
                q(zzrVar10);
                parcel2.writeNoException();
                return true;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Bundle bundle = (Bundle) wmw0.a(parcel, Bundle.CREATOR);
                com.google.android.gms.measurement.internal.zzr zzrVar11 = (com.google.android.gms.measurement.internal.zzr) wmw0.a(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                wmw0.d(parcel);
                t(bundle, zzrVar11);
                parcel2.writeNoException();
                return true;
            case 20:
                com.google.android.gms.measurement.internal.zzr zzrVar12 = (com.google.android.gms.measurement.internal.zzr) wmw0.a(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                wmw0.d(parcel);
                B(zzrVar12);
                parcel2.writeNoException();
                return true;
            case 21:
                com.google.android.gms.measurement.internal.zzr zzrVar13 = (com.google.android.gms.measurement.internal.zzr) wmw0.a(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                wmw0.d(parcel);
                zzao zzaoVarS = s(zzrVar13);
                parcel2.writeNoException();
                if (zzaoVarS == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                zzaoVarS.writeToParcel(parcel2, 1);
                return true;
            case 24:
                com.google.android.gms.measurement.internal.zzr zzrVar14 = (com.google.android.gms.measurement.internal.zzr) wmw0.a(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                Bundle bundle2 = (Bundle) wmw0.a(parcel, Bundle.CREATOR);
                wmw0.d(parcel);
                D(zzrVar14);
                String str2 = zzrVar14.f45550a;
                s0x.H(str2);
                if (!m6x0Var.e0().x1(null, btw0.T0)) {
                    try {
                        list = (List) m6x0Var.J().t1(new fyw0(this, zzrVar14, bundle2, b)).get();
                    } catch (InterruptedException | ExecutionException e3) {
                        m6x0Var.r().g.c(uuw0.q1(str2), e3, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                } else {
                    try {
                        list = (List) m6x0Var.J().u1(new fyw0(this, zzrVar14, bundle2, z ? (byte) 1 : (byte) 0)).get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e4) {
                        m6x0Var.r().g.c(uuw0.q1(str2), e4, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                com.google.android.gms.measurement.internal.zzr zzrVar15 = (com.google.android.gms.measurement.internal.zzr) wmw0.a(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                wmw0.d(parcel);
                i(zzrVar15);
                parcel2.writeNoException();
                return true;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                com.google.android.gms.measurement.internal.zzr zzrVar16 = (com.google.android.gms.measurement.internal.zzr) wmw0.a(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                wmw0.d(parcel);
                l(zzrVar16);
                parcel2.writeNoException();
                return true;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                com.google.android.gms.measurement.internal.zzr zzrVar17 = (com.google.android.gms.measurement.internal.zzr) wmw0.a(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                wmw0.d(parcel);
                x(zzrVar17);
                parcel2.writeNoException();
                return true;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                com.google.android.gms.measurement.internal.zzr zzrVar18 = (com.google.android.gms.measurement.internal.zzr) wmw0.a(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                zzoo zzooVar = (zzoo) wmw0.a(parcel, zzoo.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    ptw0Var = iInterfaceQueryLocalInterface instanceof ttw0 ? (ttw0) iInterfaceQueryLocalInterface : new ptw0(strongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", (byte) 4);
                }
                wmw0.d(parcel);
                g(zzrVar18, zzooVar, ptw0Var);
                parcel2.writeNoException();
                return true;
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                com.google.android.gms.measurement.internal.zzr zzrVar19 = (com.google.android.gms.measurement.internal.zzr) wmw0.a(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                zzaf zzafVar = (zzaf) wmw0.a(parcel, zzaf.CREATOR);
                wmw0.d(parcel);
                r(zzrVar19, zzafVar);
                parcel2.writeNoException();
                return true;
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                com.google.android.gms.measurement.internal.zzr zzrVar20 = (com.google.android.gms.measurement.internal.zzr) wmw0.a(parcel, com.google.android.gms.measurement.internal.zzr.CREATOR);
                Bundle bundle3 = (Bundle) wmw0.a(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    jtw0Var = iInterfaceQueryLocalInterface2 instanceof mtw0 ? (mtw0) iInterfaceQueryLocalInterface2 : new jtw0(strongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", (byte) 4);
                }
                wmw0.d(parcel);
                k(zzrVar20, bundle3, jtw0Var);
                parcel2.writeNoException();
                return true;
        }
    }

    @Override // a.gtw0
    public final List c(String str, String str2, String str3, boolean z) {
        E(str, true);
        m6x0 m6x0Var = this.f26078a;
        try {
            List<v6x0> list = (List) m6x0Var.J().t1(new uxw0(this, str, str2, str3, (byte) 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (v6x0 v6x0Var : list) {
                if (z || !x6x0.Q1(v6x0Var.c)) {
                    arrayList.add(new zzpl(v6x0Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            m6x0Var.r().g.c(uuw0.q1(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            m6x0Var.r().g.c(uuw0.q1(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // a.gtw0
    public final void e(zzah zzahVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        s0x.H(zzahVar);
        s0x.H(zzahVar.c);
        D(zzrVar);
        zzah zzahVar2 = new zzah(zzahVar);
        zzahVar2.f45541a = zzrVar.f45550a;
        F(new hf5((Object) this, (Object) zzahVar2, (Object) zzrVar, false, (byte) 14));
    }

    @Override // a.gtw0
    public final List f(String str, String str2, String str3) {
        E(str, true);
        m6x0 m6x0Var = this.f26078a;
        try {
            return (List) m6x0Var.J().t1(new uxw0(this, str, str2, str3, (byte) 3)).get();
        } catch (InterruptedException | ExecutionException e) {
            m6x0Var.r().g.b(e, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // a.gtw0
    public final void g(com.google.android.gms.measurement.internal.zzr zzrVar, zzoo zzooVar, ttw0 ttw0Var) {
        D(zzrVar);
        String str = zzrVar.f45550a;
        s0x.H(str);
        this.f26078a.J().v1(new pb90(this, str, zzooVar, ttw0Var, (byte) 6));
    }

    @Override // a.gtw0
    public final byte[] h(zzbh zzbhVar, String str) {
        s0x.E(str);
        s0x.H(zzbhVar);
        E(str, true);
        m6x0 m6x0Var = this.f26078a;
        quw0 quw0Var = m6x0Var.r().n;
        kxw0 kxw0Var = m6x0Var.l;
        iuw0 iuw0Var = kxw0Var.j;
        String str2 = zzbhVar.f45544a;
        quw0Var.b(iuw0Var.a(str2), "Log and bundle. event");
        m6x0Var.S().getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) m6x0Var.J().u1(new jmv(this, zzbhVar, str)).get();
            if (bArr == null) {
                m6x0Var.r().g.b(uuw0.q1(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            m6x0Var.S().getClass();
            m6x0Var.r().n.d("Log and bundle processed. event, size, time_ms", kxw0Var.j.a(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e) {
            e = e;
            m6x0Var.r().g.d("Failed to log and bundle. appId, event, error", uuw0.q1(str), kxw0Var.j.a(str2), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            m6x0Var.r().g.d("Failed to log and bundle. appId, event, error", uuw0.q1(str), kxw0Var.j.a(str2), e);
            return null;
        }
    }

    @Override // a.gtw0
    public final void i(com.google.android.gms.measurement.internal.zzr zzrVar) {
        s0x.E(zzrVar.f45550a);
        s0x.H(zzrVar.s);
        C(new pxw0(this, zzrVar, (byte) 3));
    }

    @Override // a.gtw0
    public final void j(com.google.android.gms.measurement.internal.zzr zzrVar) {
        D(zzrVar);
        F(new pxw0(this, zzrVar, (byte) 1));
    }

    @Override // a.gtw0
    public final void k(com.google.android.gms.measurement.internal.zzr zzrVar, Bundle bundle, mtw0 mtw0Var) {
        D(zzrVar);
        String str = zzrVar.f45550a;
        s0x.H(str);
        this.f26078a.J().v1(new ob90(this, zzrVar, bundle, mtw0Var, str));
    }

    @Override // a.gtw0
    public final void l(com.google.android.gms.measurement.internal.zzr zzrVar) {
        s0x.E(zzrVar.f45550a);
        s0x.H(zzrVar.s);
        C(new oxw0(this, zzrVar, (byte) 2));
    }

    @Override // a.gtw0
    public final void m(zzpl zzplVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        s0x.H(zzplVar);
        D(zzrVar);
        F(new hf5((Object) this, (Object) zzplVar, (Object) zzrVar, false, (byte) 17));
    }

    @Override // a.gtw0
    public final String o(com.google.android.gms.measurement.internal.zzr zzrVar) {
        D(zzrVar);
        m6x0 m6x0Var = this.f26078a;
        try {
            return (String) m6x0Var.J().t1(new nxw0(m6x0Var, zzrVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            m6x0Var.r().g.c(uuw0.q1(zzrVar.f45550a), e, "Failed to get app instance id. appId");
            return null;
        }
    }

    @Override // a.gtw0
    public final void p(long j, String str, String str2, String str3) {
        F(new bgr0(this, str2, str3, str, j, (byte) 1));
    }

    @Override // a.gtw0
    public final void q(com.google.android.gms.measurement.internal.zzr zzrVar) {
        String str = zzrVar.f45550a;
        s0x.E(str);
        E(str, false);
        F(new oxw0(this, zzrVar, (byte) 1));
    }

    @Override // a.gtw0
    public final void r(com.google.android.gms.measurement.internal.zzr zzrVar, zzaf zzafVar) {
        D(zzrVar);
        F(new hf5(this, zzrVar, zzafVar, (byte) 18));
    }

    @Override // a.gtw0
    public final zzao s(com.google.android.gms.measurement.internal.zzr zzrVar) {
        D(zzrVar);
        String str = zzrVar.f45550a;
        s0x.E(str);
        m6x0 m6x0Var = this.f26078a;
        try {
            return (zzao) m6x0Var.J().u1(new nxw0(this, zzrVar, (byte) 1)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            m6x0Var.r().g.c(uuw0.q1(str), e, "Failed to get consent. appId");
            return new zzao(null);
        }
    }

    @Override // a.gtw0
    public final void t(Bundle bundle, com.google.android.gms.measurement.internal.zzr zzrVar) {
        D(zzrVar);
        String str = zzrVar.f45550a;
        s0x.H(str);
        F(new pb90(this, bundle, str, zzrVar, (byte) 8));
    }

    @Override // a.gtw0
    public final void v(com.google.android.gms.measurement.internal.zzr zzrVar) {
        D(zzrVar);
        F(new oxw0(this, zzrVar, (byte) 0));
    }

    @Override // a.gtw0
    public final void x(com.google.android.gms.measurement.internal.zzr zzrVar) {
        D(zzrVar);
        F(new pxw0(this, zzrVar, (byte) 0));
    }

    @Override // a.gtw0
    public final List y(String str, String str2, boolean z, com.google.android.gms.measurement.internal.zzr zzrVar) {
        D(zzrVar);
        String str3 = zzrVar.f45550a;
        s0x.H(str3);
        m6x0 m6x0Var = this.f26078a;
        try {
            List<v6x0> list = (List) m6x0Var.J().t1(new uxw0(this, str3, str, str2, (byte) 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (v6x0 v6x0Var : list) {
                if (z || !x6x0.Q1(v6x0Var.c)) {
                    arrayList.add(new zzpl(v6x0Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            m6x0Var.r().g.c(uuw0.q1(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            m6x0Var.r().g.c(uuw0.q1(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // a.gtw0
    public final void z(zzbh zzbhVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        s0x.H(zzbhVar);
        D(zzrVar);
        F(new hf5((Object) this, (Object) zzbhVar, (Object) zzrVar, false, (byte) 15));
    }
}
