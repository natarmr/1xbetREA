package a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.gms.cloudmessaging.RegisterRequest;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.internal.RecaptchaActivity;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.io.Serializable;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class afm0 implements zmh0, zf60, OnCompleteListener, ngw0, OnSuccessListener, mff0, n7x0, Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f785a;
    public Object b;
    public Object c;

    public afm0(gii0 gii0Var, byte b) {
        this.f785a = b;
        byte b2 = 5;
        gii0Var.getClass();
        switch (b) {
            case 1:
                this.b = gii0Var;
                this.c = new jfm0(this, (byte) 4);
                break;
            case 3:
                this.b = gii0Var;
                this.c = new jfm0(this, (byte) 20);
                break;
            case 4:
                this.b = gii0Var;
                this.c = new nxo0(this, b2);
                break;
            case 5:
                this.b = gii0Var;
                this.c = new nxo0(this, (byte) 17);
                break;
            case 14:
                this.b = gii0Var;
                this.c = new rbt0(this, b2);
                break;
            default:
                this.b = gii0Var;
                this.c = new goi0(this, (byte) 29);
                break;
        }
    }

    public static void s(yx5 yx5Var, Function1 function1) {
        yx5Var.F().u0("REQUEST_ACTION_SELECTOR_DIALOG_KEY", yx5Var, new sa4(function1, (byte) 8));
    }

    @Override // a.zmh0
    public void a(fq80 fq80Var) {
        xrs0 xrs0Var = (xrs0) this.c;
        SparseArray sparseArray = xrs0Var.h;
        q8b q8bVar = (q8b) this.b;
        if (fq80Var.z() == 0 && (fq80Var.z() & 128) != 0) {
            fq80Var.N(6);
            int iA = fq80Var.a() / 4;
            for (int i = 0; i < iA; i++) {
                fq80Var.k(q8bVar.b, 0, 4);
                q8bVar.m(0);
                int iG = q8bVar.g(16);
                q8bVar.o(3);
                if (iG == 0) {
                    q8bVar.o(13);
                } else {
                    int iG2 = q8bVar.g(13);
                    if (sparseArray.get(iG2) == null) {
                        sparseArray.put(iG2, new anh0(new ucs0(xrs0Var, iG2)));
                        xrs0Var.n++;
                    }
                }
            }
            if (xrs0Var.f41385a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override // a.mff0
    public void accept(Object obj, Object obj2) {
        int i;
        mmx mmxVar = (mmx) this.b;
        bqw0 bqw0Var = (bqw0) obj;
        hiw0 hiw0Var = new hiw0(mmxVar, (TaskCompletionSource) obj2, (byte) 0);
        Context context = mmxVar.f23210a;
        try {
            i = grv0.a(context).b(0, context.getPackageName()).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i = 0;
        }
        RegisterRequest registerRequest = (RegisterRequest) this.c;
        registerRequest.f = i;
        hrw0 hrw0Var = (hrw0) bqw0Var.l();
        ApiMetadata apiMetadata = new ApiMetadata(new ComplianceOptions(-1, -1, 0, true), true);
        apiMetadata.c = false;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
        int i2 = lnw0.f20367a;
        parcelObtain.writeStrongBinder(hiw0Var);
        parcelObtain.writeInt(1);
        registerRequest.writeToParcel(parcelObtain, 0);
        parcelObtain.writeInt(1);
        apiMetadata.writeToParcel(parcelObtain, 0);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            hrw0Var.f13552a.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object c(String str, long j, String str2, String str3, long j2, zje zjeVar) {
        ryu0 ryu0Var;
        if (zjeVar instanceof ryu0) {
            ryu0Var = (ryu0) zjeVar;
            int i = ryu0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ryu0Var.k = i - Integer.MIN_VALUE;
            } else {
                ryu0Var = new ryu0(this, zjeVar);
            }
        } else {
            ryu0Var = new ryu0(this, zjeVar);
        }
        Object objB = ryu0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ryu0Var.k;
        if (i2 == 0) {
            z1x.P(objB);
            okt0 okt0Var = (okt0) this.b;
            String strA = ((btt0) this.c).a();
            jq40 jq40Var = new jq40(j, j2, str, str2, str3);
            ryu0Var.k = 1;
            objB = ((qyu0) ((rbt0) okt0Var.b).invoke()).b(strA, jq40Var, ryu0Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        return j0x.N((gq40) ((dx5) objB).a());
    }

    @Override // a.n7x0
    public Object d(dow0 dow0Var) throws GeneralSecurityException {
        Class cls;
        j7x0 j7x0Var = (j7x0) this.b;
        rqw0 rqw0Var = (rqw0) this.c;
        atm0 atm0Var = dow0Var.f6432a;
        switch (rqw0Var.f30953a) {
            case 0:
                cls = tmw0.class;
                break;
            case 1:
                cls = ymw0.class;
                break;
            case 2:
                cls = dnw0.class;
                break;
            case 3:
                cls = cnw0.class;
                break;
            case 4:
                cls = f9x0.class;
                break;
            default:
                cls = xow0.class;
                break;
        }
        m7x0 m7x0Var = new m7x0(atm0Var.getClass(), cls);
        HashMap map = j7x0Var.f16060a;
        if (map.containsKey(m7x0Var)) {
            return ((h7x0) map.get(m7x0Var)).c.mo8a(atm0Var);
        }
        throw new GeneralSecurityException(kng0.l("No PrimitiveConstructor for ", String.valueOf(m7x0Var), " available, see https://developers.google.com/tink/faq/registration_errors"));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object e(String str, long j, String str2, String str3, long j2, zje zjeVar) {
        syu0 syu0Var;
        if (zjeVar instanceof syu0) {
            syu0Var = (syu0) zjeVar;
            int i = syu0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                syu0Var.k = i - Integer.MIN_VALUE;
            } else {
                syu0Var = new syu0(this, zjeVar);
            }
        } else {
            syu0Var = new syu0(this, zjeVar);
        }
        Object objC = syu0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = syu0Var.k;
        if (i2 == 0) {
            z1x.P(objC);
            okt0 okt0Var = (okt0) this.b;
            String strA = ((btt0) this.c).a();
            jq40 jq40Var = new jq40(j, j2, str, str2, str3);
            syu0Var.k = 1;
            objC = ((qyu0) ((rbt0) okt0Var.b).invoke()).c(strA, jq40Var, syu0Var);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        return j0x.N((gq40) ((dx5) objC).a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(String str, String str2, String str3, zje zjeVar) {
        uzt0 uzt0Var;
        if (zjeVar instanceof uzt0) {
            uzt0Var = (uzt0) zjeVar;
            int i = uzt0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                uzt0Var.k = i - Integer.MIN_VALUE;
            } else {
                uzt0Var = new uzt0(this, zjeVar);
            }
        } else {
            uzt0Var = new uzt0(this, zjeVar);
        }
        Object objA = uzt0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = uzt0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            mxt0 mxt0Var = (mxt0) ((rbt0) this.c).invoke();
            uzt0Var.k = 1;
            objA = mxt0Var.a(str, str2, str3, uzt0Var);
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

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Serializable g(String str, int i, int i2, long j, boolean z, long j2, zje zjeVar) {
        t7n0 t7n0Var;
        long j3;
        Object objA;
        knf0 knf0Var = (knf0) this.c;
        if (zjeVar instanceof t7n0) {
            t7n0Var = (t7n0) zjeVar;
            int i3 = t7n0Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                t7n0Var.l = i3 - Integer.MIN_VALUE;
            } else {
                t7n0Var = new t7n0(this, zjeVar);
            }
        } else {
            t7n0Var = new t7n0(this, zjeVar);
        }
        Object obj = t7n0Var.j;
        wne wneVar = wne.f39444a;
        int i4 = t7n0Var.l;
        if (i4 == 0) {
            z1x.P(obj);
            String strC = knf0Var.c();
            pmi0 pmi0Var = (pmi0) this.b;
            v7n0 v7n0Var = new v7n0(i2, knf0Var.b(), i, j, strC, str, z);
            j3 = j2;
            t7n0Var.i = j3;
            t7n0Var.l = 1;
            objA = ((x7n0) ((enj0) pmi0Var.f27236a).invoke()).a(w7n0.D(v7n0Var), t7n0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j4 = t7n0Var.i;
            z1x.P(obj);
            objA = obj;
            j3 = j4;
        }
        List list = (List) ((dx5) objA).a();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            Long l = ((r7n0) obj2).h;
            if (l != null && l.longValue() > 0) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(s7n0.A((r7n0) it.next(), sip.b, j3));
        }
        return arrayList2;
    }

    @Override // a.ngw0
    public void h(xfw0 xfw0Var) {
        hcp0 hcp0Var = (hcp0) this.b;
        ljw0 ljw0Var = (ljw0) xfw0Var;
        if (TextUtils.isEmpty(ljw0Var.p)) {
            nmt0.e((nmt0) this.c, ljw0Var, hcp0Var, this);
        } else {
            hcp0Var.c(new cmt0(ljw0Var.p, ljw0Var.o, ljw0Var.a()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Serializable i(String str, int i, int i2, long j, boolean z, zje zjeVar) {
        u7n0 u7n0Var;
        knf0 knf0Var = (knf0) this.c;
        if (zjeVar instanceof u7n0) {
            u7n0Var = (u7n0) zjeVar;
            int i3 = u7n0Var.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                u7n0Var.k = i3 - Integer.MIN_VALUE;
            } else {
                u7n0Var = new u7n0(this, zjeVar);
            }
        } else {
            u7n0Var = new u7n0(this, zjeVar);
        }
        Object objB = u7n0Var.i;
        wne wneVar = wne.f39444a;
        int i4 = u7n0Var.k;
        if (i4 == 0) {
            z1x.P(objB);
            String strC = knf0Var.c();
            pmi0 pmi0Var = (pmi0) this.b;
            v7n0 v7n0Var = new v7n0(i2, knf0Var.b(), i, j, strC, str, z);
            u7n0Var.k = 1;
            objB = ((x7n0) ((enj0) pmi0Var.f27236a).invoke()).b(w7n0.D(v7n0Var), u7n0Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        List list = (List) ((dx5) objB).a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Long l = ((r7n0) obj).h;
            if (l != null && l.longValue() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(s7n0.A((r7n0) it.next(), sip.c, 0L));
        }
        return arrayList2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:91|24|103|25|99|26|27|93|28|89|29|30|101|31|(1:34)) */
    /* JADX WARN: Can't wrap try/catch for region: R(4:(1:(1:(4:13|82|69|56)(2:14|15))(2:16|105))(4:17|97|18|19)|95|35|36) */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:54:0x012d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x012f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0139  */
    /* JADX WARN: Code duplicated, block: B:59:0x013e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0140  */
    /* JADX WARN: Code duplicated, block: B:63:0x0145  */
    /* JADX WARN: Code duplicated, block: B:66:0x0161  */
    /* JADX WARN: Code duplicated, block: B:68:0x0167  */
    /* JADX WARN: Code duplicated, block: B:70:0x0170  */
    /* JADX WARN: Code duplicated, block: B:72:0x0177  */
    /* JADX WARN: Code duplicated, block: B:74:0x017d  */
    /* JADX WARN: Code duplicated, block: B:75:0x017f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0184  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:88:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:91:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0108, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0109, code lost:
    
        r15 = r14;
        r14 = r13;
        r13 = r15;
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0110, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0111, code lost:
    
        r16 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0113, code lost:
    
        r10 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0116, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x011a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011b, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0120, code lost:
    
        r16 = r10;
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0124, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0125, code lost:
    
        r1 = r9;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x012f -> B:56:0x0136). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0167 -> B:69:0x016e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x01a0 -> B:82:0x01a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x01a3 -> B:69:0x016e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x01ac -> B:69:0x016e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(java.lang.String r21, java.lang.String r22, java.lang.String r23, a.zje r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.afm0.j(java.lang.String, java.lang.String, java.lang.String, a.zje):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:117|43|44|113|45|(7:48|111|49|107|50|102|103)|92) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:48|111|49|107|50|102|103) */
    /* JADX WARN: Code duplicated, block: B:117:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0133  */
    /* JADX WARN: Code duplicated, block: B:63:0x0177 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0179 A[Catch: all -> 0x0181, TryCatch #1 {all -> 0x0181, blocks: (B:61:0x0171, B:64:0x0179, B:68:0x0184, B:72:0x018e, B:74:0x0192, B:79:0x01be, B:82:0x01cd, B:84:0x01d4, B:88:0x01de, B:90:0x01e2, B:93:0x0204, B:94:0x020f, B:96:0x0218, B:97:0x021f, B:98:0x0220), top: B:106:0x0171 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0184 A[Catch: all -> 0x0181, TryCatch #1 {all -> 0x0181, blocks: (B:61:0x0171, B:64:0x0179, B:68:0x0184, B:72:0x018e, B:74:0x0192, B:79:0x01be, B:82:0x01cd, B:84:0x01d4, B:88:0x01de, B:90:0x01e2, B:93:0x0204, B:94:0x020f, B:96:0x0218, B:97:0x021f, B:98:0x0220), top: B:106:0x0171 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x018b  */
    /* JADX WARN: Code duplicated, block: B:71:0x018d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0192 A[Catch: all -> 0x0181, TryCatch #1 {all -> 0x0181, blocks: (B:61:0x0171, B:64:0x0179, B:68:0x0184, B:72:0x018e, B:74:0x0192, B:79:0x01be, B:82:0x01cd, B:84:0x01d4, B:88:0x01de, B:90:0x01e2, B:93:0x0204, B:94:0x020f, B:96:0x0218, B:97:0x021f, B:98:0x0220), top: B:106:0x0171 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:79:0x01be A[Catch: all -> 0x0181, TryCatch #1 {all -> 0x0181, blocks: (B:61:0x0171, B:64:0x0179, B:68:0x0184, B:72:0x018e, B:74:0x0192, B:79:0x01be, B:82:0x01cd, B:84:0x01d4, B:88:0x01de, B:90:0x01e2, B:93:0x0204, B:94:0x020f, B:96:0x0218, B:97:0x021f, B:98:0x0220), top: B:106:0x0171 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x01cd A[Catch: all -> 0x0181, TryCatch #1 {all -> 0x0181, blocks: (B:61:0x0171, B:64:0x0179, B:68:0x0184, B:72:0x018e, B:74:0x0192, B:79:0x01be, B:82:0x01cd, B:84:0x01d4, B:88:0x01de, B:90:0x01e2, B:93:0x0204, B:94:0x020f, B:96:0x0218, B:97:0x021f, B:98:0x0220), top: B:106:0x0171 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01d4 A[Catch: all -> 0x0181, TryCatch #1 {all -> 0x0181, blocks: (B:61:0x0171, B:64:0x0179, B:68:0x0184, B:72:0x018e, B:74:0x0192, B:79:0x01be, B:82:0x01cd, B:84:0x01d4, B:88:0x01de, B:90:0x01e2, B:93:0x0204, B:94:0x020f, B:96:0x0218, B:97:0x021f, B:98:0x0220), top: B:106:0x0171 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01db  */
    /* JADX WARN: Code duplicated, block: B:87:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:90:0x01e2 A[Catch: all -> 0x0181, TryCatch #1 {all -> 0x0181, blocks: (B:61:0x0171, B:64:0x0179, B:68:0x0184, B:72:0x018e, B:74:0x0192, B:79:0x01be, B:82:0x01cd, B:84:0x01d4, B:88:0x01de, B:90:0x01e2, B:93:0x0204, B:94:0x020f, B:96:0x0218, B:97:0x021f, B:98:0x0220), top: B:106:0x0171 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0204 A[Catch: all -> 0x0181, TryCatch #1 {all -> 0x0181, blocks: (B:61:0x0171, B:64:0x0179, B:68:0x0184, B:72:0x018e, B:74:0x0192, B:79:0x01be, B:82:0x01cd, B:84:0x01d4, B:88:0x01de, B:90:0x01e2, B:93:0x0204, B:94:0x020f, B:96:0x0218, B:97:0x021f, B:98:0x0220), top: B:106:0x0171 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x020f A[Catch: all -> 0x0181, TryCatch #1 {all -> 0x0181, blocks: (B:61:0x0171, B:64:0x0179, B:68:0x0184, B:72:0x018e, B:74:0x0192, B:79:0x01be, B:82:0x01cd, B:84:0x01d4, B:88:0x01de, B:90:0x01e2, B:93:0x0204, B:94:0x020f, B:96:0x0218, B:97:0x021f, B:98:0x0220), top: B:106:0x0171 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0216 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0218 A[Catch: all -> 0x0181, TryCatch #1 {all -> 0x0181, blocks: (B:61:0x0171, B:64:0x0179, B:68:0x0184, B:72:0x018e, B:74:0x0192, B:79:0x01be, B:82:0x01cd, B:84:0x01d4, B:88:0x01de, B:90:0x01e2, B:93:0x0204, B:94:0x020f, B:96:0x0218, B:97:0x021f, B:98:0x0220), top: B:106:0x0171 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0220 A[Catch: all -> 0x0181, TRY_LEAVE, TryCatch #1 {all -> 0x0181, blocks: (B:61:0x0171, B:64:0x0179, B:68:0x0184, B:72:0x018e, B:74:0x0192, B:79:0x01be, B:82:0x01cd, B:84:0x01d4, B:88:0x01de, B:90:0x01e2, B:93:0x0204, B:94:0x020f, B:96:0x0218, B:97:0x021f, B:98:0x0220), top: B:106:0x0171 }] */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0159, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x015a, code lost:
    
        r18 = r7;
        r7 = r2;
        r8 = r9;
        r2 = r14;
        r9 = r4;
        r20 = r12;
        r12 = r5;
        r13 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0167, code lost:
    
        r15 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x016a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x016c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x016d, code lost:
    
        r22 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0201, code lost:
    
        if (a.qcc.P(r10, r8) == r3) goto L92;
     */
    /* JADX WARN: Path cross not found for [B:10:0x0028, B:31:0x00d1], limit reached: 119 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x01c8 -> B:81:0x01ca). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(long r23, a.zje r25) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.afm0.k(long, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        boolean z;
        s88 s88Var = (s88) this.b;
        j6 j6Var = (j6) this.c;
        int i = j6Var.f15959a;
        int i2 = j6Var.b;
        int i3 = j6Var.c;
        uiv0 uiv0Var = xiv0Var.f40966a;
        pfx pfxVarI = uiv0Var.i(519);
        pfx pfxVarI2 = uiv0Var.i(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) s88Var.c;
        int i4 = pfxVarI.b;
        int i5 = pfxVarI.c;
        int i6 = pfxVarI.f26926a;
        bottomSheetBehavior.x = i4;
        boolean z2 = true;
        boolean z3 = view.getLayoutDirection() == 1;
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z4 = bottomSheetBehavior.p;
        if (z4) {
            int iA = xiv0Var.a();
            bottomSheetBehavior.w = iA;
            paddingBottom = iA + i3;
        }
        if (bottomSheetBehavior.q) {
            paddingLeft = (z3 ? i2 : i) + i6;
        }
        if (bottomSheetBehavior.r) {
            if (!z3) {
                i = i2;
            }
            paddingRight = i + i5;
        }
        int i7 = paddingRight;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (!bottomSheetBehavior.t || marginLayoutParams.leftMargin == i6) {
            z = false;
        } else {
            marginLayoutParams.leftMargin = i6;
            z = true;
        }
        if (bottomSheetBehavior.u && marginLayoutParams.rightMargin != i5) {
            marginLayoutParams.rightMargin = i5;
            z = true;
        }
        if (bottomSheetBehavior.v) {
            int i8 = marginLayoutParams.topMargin;
            int i9 = pfxVarI.b;
            if (i8 != i9) {
                marginLayoutParams.topMargin = i9;
            } else {
                z2 = z;
            }
        } else {
            z2 = z;
        }
        if (z2) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), i7, paddingBottom);
        boolean z5 = s88Var.b;
        if (z5) {
            bottomSheetBehavior.n = pfxVarI2.d;
        }
        if (!z4 && !z5) {
            return xiv0Var;
        }
        bottomSheetBehavior.U();
        return xiv0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public Object m(long j, long j2, zje zjeVar) {
        omt0 omt0Var;
        Object g0g0Var;
        Object value;
        Object objA;
        aja ajaVar = (aja) this.c;
        if (zjeVar instanceof omt0) {
            omt0Var = (omt0) zjeVar;
            int i = omt0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                omt0Var.l = i - Integer.MIN_VALUE;
            } else {
                omt0Var = new omt0(this, zjeVar);
            }
        } else {
            omt0Var = new omt0(this, zjeVar);
        }
        omt0 omt0Var2 = omt0Var;
        Object objA2 = omt0Var2.j;
        wne wneVar = wne.f39444a;
        int i2 = omt0Var2.l;
        try {
            if (i2 == 0) {
                z1x.P(objA2);
                Object value2 = ajaVar.f964a.f30402a.getValue();
                bgs bgsVar = value2 instanceof bgs ? (bgs) value2 : null;
                if ((bgsVar != null ? bgsVar.d : null) == null) {
                    e0g0 e0g0Var = j0g0.b;
                    bwl0 bwl0Var = (bwl0) this.b;
                    omt0Var2.i = ajaVar;
                    omt0Var2.l = 1;
                    objA2 = bwl0Var.a(j, j2, omt0Var2);
                    if (objA2 == wneVar) {
                        return wneVar;
                    }
                }
                return Unit.f46060a;
            }
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ajaVar = omt0Var2.i;
            z1x.P(objA2);
            g0g0Var = (zvl0) objA2;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        zvl0 zvl0Var = (zvl0) (g0g0Var instanceof g0g0 ? null : g0g0Var);
        if (zvl0Var == null) {
            return Unit.f46060a;
        }
        ajaVar.getClass();
        rfs rfsVar = ajaVar.f964a;
        rfsVar.getClass();
        p7m0 p7m0Var = rfsVar.f30402a;
        do {
            value = p7m0Var.getValue();
            objA = (egs) value;
            if (objA instanceof bgs) {
                objA = bgs.a((bgs) objA, null, null, null, zvl0Var, null, null, false, 119);
            }
        } while (!p7m0Var.m(value, objA));
        return Unit.f46060a;
    }

    public Object n(sys0 sys0Var, s77 s77Var, String str, String str2, String str3, zje zjeVar) throws yxw {
        if (!((ort) this.c).f25751a.a()) {
            throw new yxw("The user is not authorized. History check will not complete");
        }
        boolean z = s77Var == s77.EVENTS && str2 == null;
        nc0 nc0Var = (nc0) this.b;
        int iOrdinal = s77Var.ordinal();
        if (iOrdinal == 1) {
            return nc0Var.t(sys0Var, s77Var, zjeVar);
        }
        if (iOrdinal == 2) {
            return nc0Var.f(sys0Var, s77Var, zjeVar);
        }
        if (iOrdinal != 5) {
            return iOrdinal != 6 ? nc0Var.m(s77Var, str2, str, z, str3, zjeVar) : nc0Var.p(sys0Var, s77Var, zjeVar);
        }
        return nc0Var.e(s77Var, str, str2, zjeVar);
    }

    public void o(long j, long j2, long j3, boolean z, boolean z2) {
        String str = z2 ? "widget_favor_list" : "widget_favor_empty";
        ((bn6) this.b).d(j, j2, j3, str, z);
        ((je) this.c).g(j, j2, j3, str, z);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f785a) {
            case 20:
                ((Map) ((fuj0) this.c).b).remove((TaskCompletionSource) this.b);
                break;
            default:
                RecaptchaActivity recaptchaActivity = (RecaptchaActivity) this.b;
                String str = (String) this.c;
                low0 low0Var = RecaptchaActivity.Y;
                if (recaptchaActivity.getPackageManager().resolveActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL), 0) == null) {
                    Log.e("RecaptchaActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
                    recaptchaActivity.u();
                } else {
                    List<ResolveInfo> listQueryIntentServices = recaptchaActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, (Uri) task.getResult());
                        intent.putExtra("com.android.browser.application_id", str);
                        intent.addFlags(1073741824);
                        intent.addFlags(268435456);
                        recaptchaActivity.startActivity(intent);
                    } else {
                        yzn0 yzn0VarM = new mii0((byte) 22).m();
                        Intent intent2 = (Intent) yzn0VarM.f43523a;
                        intent2.addFlags(1073741824);
                        intent2.addFlags(268435456);
                        intent2.setData((Uri) task.getResult());
                        recaptchaActivity.startActivity(intent2, (Bundle) yzn0VarM.b);
                    }
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public /* synthetic */ void onSuccess(Object obj) {
        ((TaskCompletionSource) this.b).setResult((AuthResult) obj);
        s88.y((Context) this.c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p(zje zjeVar, ynb0 ynb0Var, String str) {
        tyu0 tyu0Var;
        if (zjeVar instanceof tyu0) {
            tyu0Var = (tyu0) zjeVar;
            int i = tyu0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                tyu0Var.k = i - Integer.MIN_VALUE;
            } else {
                tyu0Var = new tyu0(this, zjeVar);
            }
        } else {
            tyu0Var = new tyu0(this, zjeVar);
        }
        Object objD = tyu0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = tyu0Var.k;
        if (i2 == 0) {
            z1x.P(objD);
            okt0 okt0Var = (okt0) this.b;
            String strA = ((btt0) this.c).a();
            iyu0 iyu0Var = new iyu0(str, ynb0Var.f42933a, ynb0Var.b);
            tyu0Var.k = 1;
            objD = ((qyu0) ((rbt0) okt0Var.b).invoke()).d(strA, iyu0Var, tyu0Var);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD);
        }
        oyu0 oyu0Var = (oyu0) ((dx5) objD).a();
        String str2 = oyu0Var.b;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = oyu0Var.f26075a;
        return new pyu0(str2, str3 != null ? str3 : "");
    }

    public void q(Fragment fragment, tn60 tn60Var, Function1 function1, Function1 function2) {
        fragment.getClass();
        if (tn60Var instanceof on60) {
            function2.invoke(tn60Var);
            return;
        }
        if (tn60Var.equals(pn60.f27271a)) {
            j120.X(fragment.q0());
            return;
        }
        if (tn60Var instanceof rn60) {
            rn60 rn60Var = (rn60) tn60Var;
            j120.P(fragment, new jv3(rn60Var.f30773a, rn60Var.b, fragment));
            return;
        }
        if (tn60Var.equals(sn60.f32478a)) {
            wdk0 wdk0Var = (wdk0) this.b;
            rek0 rek0Var = rek0.b;
            String string = fragment.o0().getResources().getString(R.string.get_balance_list_error);
            string.getClass();
            wdk0.k(wdk0Var, new xdk0(rek0Var, string, null, null, null, null, 124), fragment, null, null, false, null, 1020);
            return;
        }
        if (!(tn60Var instanceof qn60)) {
            t9f.b();
        } else {
            ua80.r(fragment, (ii) this.c, ((qn60) tn60Var).f29017a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object r(long j, ynb0 ynb0Var, zje zjeVar) {
        uyu0 uyu0Var;
        if (zjeVar instanceof uyu0) {
            uyu0Var = (uyu0) zjeVar;
            int i = uyu0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                uyu0Var.k = i - Integer.MIN_VALUE;
            } else {
                uyu0Var = new uyu0(this, zjeVar);
            }
        } else {
            uyu0Var = new uyu0(this, zjeVar);
        }
        Object objA = uyu0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = uyu0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            okt0 okt0Var = (okt0) this.b;
            String strA = ((btt0) this.c).a();
            lyu0 lyu0Var = new lyu0(j, ynb0Var.f42933a, ynb0Var.b);
            uyu0Var.k = 1;
            objA = ((qyu0) ((rbt0) okt0Var.b).invoke()).a(strA, lyu0Var, uyu0Var);
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
        oyu0 oyu0Var = (oyu0) ((dx5) objA).a();
        String str = oyu0Var.b;
        if (str == null) {
            str = "";
        }
        String str2 = oyu0Var.f26075a;
        return new pyu0(str, str2 != null ? str2 : "");
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Bundle bundle;
        return (task.isSuccessful() && (bundle = (Bundle) task.getResult()) != null && bundle.containsKey("google.messenger")) ? ((cig0) this.b).b((Bundle) this.c).onSuccessTask(haw0.d, kys0.b) : task;
    }

    @Override // a.ngw0
    /* JADX INFO: renamed from: zza */
    public void mo2zza(String str) {
        ((hcp0) this.b).a(msm0.v(str));
    }

    public /* synthetic */ afm0(Object obj, Object obj2, byte b) {
        this.f785a = b;
        this.b = obj;
        this.c = obj2;
    }

    public afm0(s88 s88Var, TaskCompletionSource taskCompletionSource, Context context) {
        this.f785a = (byte) 22;
        this.b = taskCompletionSource;
        this.c = context;
    }

    public afm0(fuj0 fuj0Var, TaskCompletionSource taskCompletionSource) {
        this.f785a = (byte) 20;
        this.b = taskCompletionSource;
        Objects.requireNonNull(fuj0Var);
        this.c = fuj0Var;
    }

    public afm0(nmt0 nmt0Var, hcp0 hcp0Var) {
        this.f785a = (byte) 21;
        this.b = hcp0Var;
        this.c = nmt0Var;
    }

    public afm0(w4x0 w4x0Var) {
        this.f785a = (byte) 26;
        this.c = w4x0Var;
    }

    public afm0(azj0 azj0Var) {
        this.f785a = (byte) 19;
        azj0Var.getClass();
        this.b = azj0Var;
        this.c = new jmv0(this, (byte) 16);
    }

    public afm0(bwl0 bwl0Var, aja ajaVar) {
        this.f785a = (byte) 13;
        bwl0Var.getClass();
        ajaVar.getClass();
        this.b = bwl0Var;
        this.c = ajaVar;
    }

    public /* synthetic */ afm0(byte b) {
        this.f785a = b;
    }

    public afm0(pmi0 pmi0Var, knf0 knf0Var, byte b) {
        this.f785a = (byte) 6;
        knf0Var.getClass();
        this.b = pmi0Var;
        this.c = knf0Var;
    }

    public afm0(knf0 knf0Var, pmi0 pmi0Var) {
        this.f785a = (byte) 2;
        knf0Var.getClass();
        this.b = pmi0Var;
        this.c = knf0Var;
    }

    public afm0(us00 us00Var, gii0 gii0Var) {
        this.f785a = (byte) 7;
        this.b = us00Var;
        this.c = new lkr0(gii0Var, (byte) 3);
    }

    public afm0(okt0 okt0Var, btt0 btt0Var) {
        this.f785a = (byte) 16;
        btt0Var.getClass();
        this.b = okt0Var;
        this.c = btt0Var;
    }

    public afm0(wdk0 wdk0Var, ii iiVar) {
        this.f785a = (byte) 10;
        wdk0Var.getClass();
        iiVar.getClass();
        this.b = wdk0Var;
        this.c = iiVar;
    }

    public afm0() {
        this.f785a = (byte) 18;
        List list = Collections.EMPTY_LIST;
        this.b = list;
        this.c = list;
    }

    @Override // a.zmh0
    public void b(coq0 coq0Var, huo huoVar, zrs0 zrs0Var) {
    }

    public afm0(xrs0 xrs0Var) {
        this.f785a = (byte) 9;
        this.c = xrs0Var;
        this.b = new q8b(new byte[4], 4);
    }
}
