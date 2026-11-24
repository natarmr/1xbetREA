package a;

import android.content.Context;
import android.javax.sip.SipProvider;
import android.preference.PreferenceManager;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.json.JSONObject;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class sd60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32018a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    public sd60(byte b) {
        this.f32018a = b;
        switch (b) {
            case 9:
                Boolean bool = Boolean.FALSE;
                this.b = androidx.compose.runtime.e.e(bool);
                this.c = androidx.compose.runtime.e.a(1.0f);
                this.d = androidx.compose.runtime.e.e(bool);
                this.e = androidx.compose.runtime.e.a(1.0f);
                this.f = androidx.compose.runtime.e.e(bool);
                this.g = androidx.compose.runtime.e.e(new ils0(ils0.b));
                this.h = androidx.compose.runtime.e.e(bool);
                this.i = androidx.compose.runtime.e.e(new y3d(y3d.f));
                break;
            case 14:
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
                this.f = null;
                this.g = null;
                this.h = null;
                break;
            default:
                raa0 raa0Var = new raa0((byte) 10);
                wez wezVar = wez.b;
                this.g = maz.a(wezVar, raa0Var);
                this.h = maz.a(wezVar, new raa0((byte) 11));
                this.i = new LinkedHashMap();
                break;
        }
    }

    public static double a(oln olnVar) {
        if (olnVar instanceof lln) {
            return ((lln) olnVar).f20255a.f6983a;
        }
        if (olnVar instanceof nln) {
            return ((nln) olnVar).f23736a.f6983a;
        }
        if (olnVar.equals(mln.f21999a)) {
            return 0.0d;
        }
        t9f.b();
        return 0.0d;
    }

    public static void k(JSONObject jSONObject, String str) {
        String str2 = str + jSONObject.toString();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str2, null);
        }
    }

    public static zas0 v(byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            mfx0 mfx0VarU = mfx0.u(byteArrayInputStream, dkw0.b);
            byteArrayInputStream.close();
            mfx0 mfx0VarE = fck0.m(mfx0VarU).E();
            hkw0 hkw0Var = (hkw0) mfx0VarE.h(5);
            hkw0Var.a(mfx0VarE);
            return new zas0(hkw0Var, (byte) 17);
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public String b() {
        ane0 ane0Var = (ane0) this.c;
        aoe0 aoe0VarA = ane0Var.a();
        String str = aoe0VarA.d;
        String strC = ane0Var.b.c("CUSTOM_REFERRAL_TAG", "");
        String strC2 = ((vwb0) this.d).c("referral_dl", "");
        String str2 = aoe0VarA.b;
        if ((str2 == null ? "" : str2).length() > 0) {
            return str2;
        }
        if ((str != null ? str : "").length() > 0) {
            return str;
        }
        if (strC.length() > 0) {
            return strC;
        }
        if (strC2.length() > 0) {
            return strC2;
        }
        return null;
    }

    public lwi0 c(int i) throws Throwable {
        lwi0 lwi0Var = null;
        try {
            if (!hne.b(2, i)) {
                JSONObject jSONObjectM = ((do20) this.e).m();
                if (jSONObjectM != null) {
                    lwi0 lwi0VarL = ((dpi0) this.d).l(jSONObjectM);
                    k(jSONObjectM, "Loaded cached settings: ");
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (hne.b(3, i) || lwi0VarL.c >= jCurrentTimeMillis) {
                        try {
                            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                                Log.v("FirebaseCrashlytics", "Returning cached settings.", null);
                            }
                            return lwi0VarL;
                        } catch (Exception e) {
                            lwi0Var = lwi0VarL;
                            e = e;
                            Log.e("FirebaseCrashlytics", "Failed to get cached settings", e);
                            return lwi0Var;
                        }
                    }
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Cached settings have expired.", null);
                        return null;
                    }
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "No cached settings data found.", null);
                }
            }
            return null;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public boolean d() {
        return ua80.x((vwb0) this.d, "IS_ORGANIC", false);
    }

    public lwi0 e() {
        return (lwi0) ((AtomicReference) this.h).get();
    }

    public String f() {
        String str = ((ane0) this.c).a().f1197a;
        if (str == null) {
            str = "";
        }
        return str.length() == 0 ? ((vwb0) this.d).c("referral_dl", "") : str;
    }

    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:88:0x0235  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:92:0x026f  */
    /* JADX WARN: Code duplicated, block: B:96:0x027d  */
    public Object g(long j, zje zjeVar) throws Throwable {
        hjt0 hjt0Var;
        v0f v0fVarD;
        double dDoubleValue;
        boolean z;
        Object obj;
        v0f v0fVar;
        hxu hxuVar;
        hru hruVar;
        double dA;
        Object objA;
        long j2;
        double d;
        boolean z2;
        boolean z3;
        double d2;
        hru hruVar2;
        wne wneVar;
        Object obj2;
        qvo0 qvo0Var;
        v0f v0fVar2;
        qvo0 qvo0Var2;
        long j3;
        Object objC;
        wne wneVar2;
        v0f v0fVar3;
        Object obj3;
        qvo0 qvo0Var3;
        boolean z4;
        boolean z5;
        double d3;
        double d4;
        double d5;
        long j4;
        int iIntValue;
        long j5;
        long j6;
        v0f v0fVar4;
        Object objA2;
        wne wneVar3;
        int i;
        double d6;
        hru hruVar3;
        qvo0 qvo0Var4;
        Object obj4;
        boolean z6;
        v0f v0fVar5;
        long j7;
        double d7;
        long j8;
        v0f v0fVar6;
        v0f v0fVar7;
        if (zjeVar instanceof hjt0) {
            hjt0Var = (hjt0) zjeVar;
            int i2 = hjt0Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hjt0Var.v = i2 - Integer.MIN_VALUE;
            } else {
                hjt0Var = new hjt0(this, zjeVar);
            }
        } else {
            hjt0Var = new hjt0(this, zjeVar);
        }
        hjt0 hjt0Var2 = hjt0Var;
        Object objC2 = hjt0Var2.t;
        wne wneVar4 = wne.f39444a;
        int i3 = hjt0Var2.v;
        if (i3 == 0) {
            z1x.P(objC2);
            v0fVarD = ((vqc) ((ocl) this.b).f25032a).d();
            double d8 = v0fVarD.e;
            oln olnVar = v0fVarD.m;
            q4f q4fVar = v0fVarD.b;
            Double dValueOf = Double.valueOf(d8);
            if (d8 <= 0.0d) {
                dValueOf = null;
            }
            dDoubleValue = dValueOf != null ? dValueOf.doubleValue() : v0fVarD.d;
            boolean z7 = v0fVarD.k && q4fVar == q4f.c;
            z = (((pq) this.h).f27394a.i().isEmpty() || q4fVar == q4f.f || q4fVar == q4f.j || q4fVar == q4f.k) ? false : true;
            if (z) {
                hruVar = (hru) this.c;
                if (z7) {
                    double d9 = v0fVarD.j;
                    Double dValueOf2 = Double.valueOf(d9);
                    if (d9 == 0.0d) {
                        dValueOf2 = null;
                    }
                    dA = m7x.p(dValueOf2 != null ? dValueOf2.doubleValue() : a(olnVar), 2);
                } else {
                    dA = a(olnVar);
                }
                nrt nrtVar = (nrt) this.d;
                hjt0Var2.k = v0fVarD;
                hjt0Var2.l = hruVar;
                hjt0Var2.i = j;
                hjt0Var2.n = dDoubleValue;
                hjt0Var2.q = z7;
                hjt0Var2.r = z;
                hjt0Var2.o = dDoubleValue;
                hjt0Var2.p = dA;
                hjt0Var2.v = 1;
                objA = nrt.a(nrtVar, j, hjt0Var2);
                if (objA == wneVar4) {
                    return wneVar4;
                }
                j2 = j;
                d = dA;
                boolean z8 = z7;
                z2 = z;
                z3 = z8;
                d2 = dDoubleValue;
            } else {
                obj = null;
                v0fVar = v0fVarD;
                hxuVar = hxu.h;
            }
            if (z) {
                ((vqc) ((ljf0) this.i).f20148a).l(v0f.a(v0fVar, null, 0.0d, null, 0.0d, null, null, 0.0d, false, hxuVar.f.b, null, 6143));
            }
            ugf0 ugf0Var = (ugf0) this.g;
            hxuVar.getClass();
            jnn jnnVar = (jnn) ((lrc) ugf0Var.f35622a).b;
            jnnVar.getClass();
            jnnVar.b.o(obj, hxuVar);
            return Unit.f46060a;
        }
        if (i3 == 1) {
            d = hjt0Var2.p;
            dDoubleValue = hjt0Var2.o;
            boolean z9 = hjt0Var2.r;
            z3 = hjt0Var2.q;
            d2 = hjt0Var2.n;
            j2 = hjt0Var2.i;
            hruVar = hjt0Var2.l;
            v0f v0fVar8 = hjt0Var2.k;
            z1x.P(objC2);
            objA = objC2;
            v0fVarD = v0fVar8;
            z2 = z9;
        } else if (i3 == 2) {
            long j9 = hjt0Var2.j;
            double d10 = hjt0Var2.p;
            double d11 = hjt0Var2.o;
            boolean z10 = hjt0Var2.r;
            boolean z11 = hjt0Var2.q;
            double d12 = hjt0Var2.n;
            long j10 = hjt0Var2.i;
            qvo0Var3 = hjt0Var2.m;
            hruVar2 = hjt0Var2.l;
            v0fVar3 = hjt0Var2.k;
            z1x.P(objC2);
            wneVar2 = wneVar4;
            j3 = j9;
            obj3 = objC2;
            j4 = j10;
            z4 = z10;
            z5 = z11;
            d4 = d12;
            d3 = d11;
            d5 = d10;
            wne wneVar5 = wneVar2;
            iIntValue = ((Number) obj3).intValue();
            rou rouVar = (rou) this.f;
            hjt0Var2.k = v0fVar3;
            hjt0Var2.l = hruVar2;
            hjt0Var2.m = qvo0Var3;
            hjt0Var2.i = j4;
            hjt0Var2.n = d4;
            hjt0Var2.q = z5;
            hjt0Var2.r = z4;
            hjt0Var2.o = d3;
            hjt0Var2.p = d5;
            j5 = j4;
            j6 = j3;
            hjt0Var2.j = j6;
            v0fVar4 = v0fVar3;
            hjt0Var2.s = iIntValue;
            hjt0Var2.v = 3;
            objA2 = rouVar.a(false, hjt0Var2);
            wneVar3 = wneVar5;
            if (objA2 == wneVar3) {
                return wneVar3;
            }
            double d13 = d5;
            i = iIntValue;
            d6 = d13;
            hruVar3 = hruVar2;
            qvo0Var4 = qvo0Var3;
            obj4 = objA2;
            z6 = z4;
            v0fVar5 = v0fVar4;
            j7 = j6;
            d7 = d3;
            j8 = j5;
            int i4 = ((m2c0) obj4).F;
            hjt0Var2.k = v0fVar5;
            v0fVar6 = v0fVar5;
            hjt0Var2.l = null;
            hjt0Var2.m = null;
            hjt0Var2.i = j8;
            hjt0Var2.n = d4;
            hjt0Var2.q = z5;
            hjt0Var2.r = z6;
            hjt0Var2.v = 4;
            obj = null;
            objC2 = hruVar3.c(d7, d6, i, i4, j7, hjt0Var2, qvo0Var4);
            if (objC2 == wneVar3) {
                return wneVar3;
            }
            v0fVar7 = v0fVar6;
        } else if (i3 == 3) {
            int i5 = hjt0Var2.s;
            long j11 = hjt0Var2.j;
            double d14 = hjt0Var2.p;
            double d15 = hjt0Var2.o;
            boolean z12 = hjt0Var2.r;
            z5 = hjt0Var2.q;
            d4 = hjt0Var2.n;
            d7 = d15;
            long j12 = hjt0Var2.i;
            qvo0 qvo0Var5 = hjt0Var2.m;
            hru hruVar4 = hjt0Var2.l;
            v0f v0fVar9 = hjt0Var2.k;
            z1x.P(objC2);
            i = i5;
            z6 = z12;
            wneVar3 = wneVar4;
            obj4 = objC2;
            v0fVar5 = v0fVar9;
            qvo0Var4 = qvo0Var5;
            j8 = j12;
            hruVar3 = hruVar4;
            j7 = j11;
            d6 = d14;
            int i6 = ((m2c0) obj4).F;
            hjt0Var2.k = v0fVar5;
            v0fVar6 = v0fVar5;
            hjt0Var2.l = null;
            hjt0Var2.m = null;
            hjt0Var2.i = j8;
            hjt0Var2.n = d4;
            hjt0Var2.q = z5;
            hjt0Var2.r = z6;
            hjt0Var2.v = 4;
            obj = null;
            objC2 = hruVar3.c(d7, d6, i, i6, j7, hjt0Var2, qvo0Var4);
            if (objC2 == wneVar3) {
                return wneVar3;
            }
            v0fVar7 = v0fVar6;
        } else {
            if (i3 != 4) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z6 = hjt0Var2.r;
            v0fVar7 = hjt0Var2.k;
            z1x.P(objC2);
            obj = null;
        }
        hxuVar = (hxu) objC2;
        z = z6;
        v0fVar = v0fVar7;
        if (z) {
            ((vqc) ((ljf0) this.i).f20148a).l(v0f.a(v0fVar, null, 0.0d, null, 0.0d, null, null, 0.0d, false, hxuVar.f.b, null, 6143));
        }
        ugf0 ugf0Var2 = (ugf0) this.g;
        hxuVar.getClass();
        jnn jnnVar2 = (jnn) ((lrc) ugf0Var2.f35622a).b;
        jnnVar2.getClass();
        jnnVar2.b.o(obj, hxuVar);
        return Unit.f46060a;
        double d16 = d;
        long j13 = ((ql5) objA).e;
        int iOrdinal = v0fVarD.b.ordinal();
        hru hruVar5 = hruVar;
        if (iOrdinal != 3) {
            hruVar2 = hruVar5;
            wneVar = wneVar4;
            if (iOrdinal != 5) {
                qvo0Var = qvo0.b;
            }
            x0u x0uVar = (x0u) this.e;
            hjt0Var2.k = v0fVarD;
            hjt0Var2.l = hruVar2;
            hjt0Var2.m = qvo0Var;
            hjt0Var2.i = j2;
            hjt0Var2.n = d2;
            hjt0Var2.q = z3;
            hjt0Var2.r = z2;
            hjt0Var2.o = dDoubleValue;
            v0fVar2 = v0fVarD;
            qvo0Var2 = qvo0Var;
            hjt0Var2.p = d16;
            hjt0Var2.j = j13;
            j3 = j13;
            hjt0Var2.v = 2;
            objC = x0uVar.c(hjt0Var2);
            wneVar2 = wneVar;
            if (objC == wneVar2) {
                return wneVar2;
            }
            v0fVar3 = v0fVar2;
            obj3 = objC;
            long j14 = j2;
            qvo0Var3 = qvo0Var2;
            z4 = z2;
            double d17 = dDoubleValue;
            z5 = z3;
            d3 = d17;
            d4 = d2;
            d5 = d16;
            j4 = j14;
            wne wneVar6 = wneVar2;
            iIntValue = ((Number) obj3).intValue();
            rou rouVar2 = (rou) this.f;
            hjt0Var2.k = v0fVar3;
            hjt0Var2.l = hruVar2;
            hjt0Var2.m = qvo0Var3;
            hjt0Var2.i = j4;
            hjt0Var2.n = d4;
            hjt0Var2.q = z5;
            hjt0Var2.r = z4;
            hjt0Var2.o = d3;
            hjt0Var2.p = d5;
            j5 = j4;
            j6 = j3;
            hjt0Var2.j = j6;
            v0fVar4 = v0fVar3;
            hjt0Var2.s = iIntValue;
            hjt0Var2.v = 3;
            objA2 = rouVar2.a(false, hjt0Var2);
            wneVar3 = wneVar6;
            if (objA2 == wneVar3) {
                return wneVar3;
            }
            double d18 = d5;
            i = iIntValue;
            d6 = d18;
            hruVar3 = hruVar2;
            qvo0Var4 = qvo0Var3;
            obj4 = objA2;
            z6 = z4;
            v0fVar5 = v0fVar4;
            j7 = j6;
            d7 = d3;
            j8 = j5;
            int i7 = ((m2c0) obj4).F;
            hjt0Var2.k = v0fVar5;
            v0fVar6 = v0fVar5;
            hjt0Var2.l = null;
            hjt0Var2.m = null;
            hjt0Var2.i = j8;
            hjt0Var2.n = d4;
            hjt0Var2.q = z5;
            hjt0Var2.r = z6;
            hjt0Var2.v = 4;
            obj = null;
            objC2 = hruVar3.c(d7, d6, i, i7, j7, hjt0Var2, qvo0Var4);
            if (objC2 == wneVar3) {
                return wneVar3;
            }
            v0fVar7 = v0fVar6;
            hxuVar = (hxu) objC2;
            z = z6;
            v0fVar = v0fVar7;
            if (z) {
                ((vqc) ((ljf0) this.i).f20148a).l(v0f.a(v0fVar, null, 0.0d, null, 0.0d, null, null, 0.0d, false, hxuVar.f.b, null, 6143));
            }
            ugf0 ugf0Var3 = (ugf0) this.g;
            hxuVar.getClass();
            jnn jnnVar3 = (jnn) ((lrc) ugf0Var3.f35622a).b;
            jnnVar3.getClass();
            jnnVar3.b.o(obj, hxuVar);
            return Unit.f46060a;
        }
        hruVar2 = hruVar5;
        wneVar = wneVar4;
        Iterator it = qvo0.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            Object next = it.next();
            Iterator it2 = it;
            qvo0 qvo0Var6 = (qvo0) next;
            byte b = v0fVarD.f.f26097a;
            Integer num = qvo0Var6.f29396a;
            if (num != null && b == num.intValue()) {
                obj2 = next;
                break;
            }
            it = it2;
        }
        qvo0Var = (qvo0) obj2;
        if (qvo0Var == null) {
            qvo0Var = qvo0.b;
        }
        x0u x0uVar2 = (x0u) this.e;
        hjt0Var2.k = v0fVarD;
        hjt0Var2.l = hruVar2;
        hjt0Var2.m = qvo0Var;
        hjt0Var2.i = j2;
        hjt0Var2.n = d2;
        hjt0Var2.q = z3;
        hjt0Var2.r = z2;
        hjt0Var2.o = dDoubleValue;
        v0fVar2 = v0fVarD;
        qvo0Var2 = qvo0Var;
        hjt0Var2.p = d16;
        hjt0Var2.j = j13;
        j3 = j13;
        hjt0Var2.v = 2;
        objC = x0uVar2.c(hjt0Var2);
        wneVar2 = wneVar;
        if (objC == wneVar2) {
            return wneVar2;
        }
        v0fVar3 = v0fVar2;
        obj3 = objC;
        long j15 = j2;
        qvo0Var3 = qvo0Var2;
        z4 = z2;
        double d19 = dDoubleValue;
        z5 = z3;
        d3 = d19;
        d4 = d2;
        d5 = d16;
        j4 = j15;
        wne wneVar7 = wneVar2;
        iIntValue = ((Number) obj3).intValue();
        rou rouVar3 = (rou) this.f;
        hjt0Var2.k = v0fVar3;
        hjt0Var2.l = hruVar2;
        hjt0Var2.m = qvo0Var3;
        hjt0Var2.i = j4;
        hjt0Var2.n = d4;
        hjt0Var2.q = z5;
        hjt0Var2.r = z4;
        hjt0Var2.o = d3;
        hjt0Var2.p = d5;
        j5 = j4;
        j6 = j3;
        hjt0Var2.j = j6;
        v0fVar4 = v0fVar3;
        hjt0Var2.s = iIntValue;
        hjt0Var2.v = 3;
        objA2 = rouVar3.a(false, hjt0Var2);
        wneVar3 = wneVar7;
        if (objA2 == wneVar3) {
            return wneVar3;
        }
        double d110 = d5;
        i = iIntValue;
        d6 = d110;
        hruVar3 = hruVar2;
        qvo0Var4 = qvo0Var3;
        obj4 = objA2;
        z6 = z4;
        v0fVar5 = v0fVar4;
        j7 = j6;
        d7 = d3;
        j8 = j5;
        int i8 = ((m2c0) obj4).F;
        hjt0Var2.k = v0fVar5;
        v0fVar6 = v0fVar5;
        hjt0Var2.l = null;
        hjt0Var2.m = null;
        hjt0Var2.i = j8;
        hjt0Var2.n = d4;
        hjt0Var2.q = z5;
        hjt0Var2.r = z6;
        hjt0Var2.v = 4;
        obj = null;
        objC2 = hruVar3.c(d7, d6, i, i8, j7, hjt0Var2, qvo0Var4);
        if (objC2 == wneVar3) {
            return wneVar3;
        }
        v0fVar7 = v0fVar6;
        hxuVar = (hxu) objC2;
        z = z6;
        v0fVar = v0fVar7;
        if (z) {
            ((vqc) ((ljf0) this.i).f20148a).l(v0f.a(v0fVar, null, 0.0d, null, 0.0d, null, null, 0.0d, false, hxuVar.f.b, null, 6143));
        }
        ugf0 ugf0Var4 = (ugf0) this.g;
        hxuVar.getClass();
        jnn jnnVar4 = (jnn) ((lrc) ugf0Var4.f35622a).b;
        jnnVar4.getClass();
        jnnVar4.b.o(obj, hxuVar);
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0101  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:73:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:75:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:82:0x020c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0217  */
    /* JADX WARN: Code duplicated, block: B:89:0x0247  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
    
        if (r0 == r6) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0189, code lost:
    
        if (r0 == r6) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(a.zje r31) {
        /*
            Method dump skipped, instruction units count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.sd60.h(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00aa, code lost:
    
        if (r9.f8256a.d(r10, r3, r4, r5, r6, r7) == r0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(java.lang.String r9, a.yje r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof a.vyb0
            if (r0 == 0) goto L14
            r0 = r10
            a.vyb0 r0 = (a.vyb0) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.k = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            a.vyb0 r0 = new a.vyb0
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r7.i
            a.wne r0 = a.wne.f39444a
            int r1 = r7.k
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L38
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2d
            a.z1x.P(r10)
            goto Lad
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            r8 = 0
            return r8
        L34:
            a.z1x.P(r10)
            goto L48
        L38:
            a.z1x.P(r10)
            java.lang.Object r10 = r8.b
            a.edu r10 = (a.edu) r10
            r7.k = r3
            java.io.Serializable r10 = r10.i(r9, r7)
            if (r10 != r0) goto L48
            goto Lac
        L48:
            r4 = r10
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r9 = r8.d
            a.nvu r9 = (a.nvu) r9
            r4.getClass()
            java.lang.Object r9 = r9.d
            a.iw20 r9 = (a.iw20) r9
            java.lang.Object r9 = r9.f15470a
            a.vwb0 r9 = (a.vwb0) r9
            java.lang.String r10 = "push_token"
            r9.h(r10, r4)
            int r9 = r4.length()
            if (r9 <= 0) goto Lb0
            java.lang.Object r9 = r8.i
            a.iqt r9 = (a.iqt) r9
            a.gst0 r9 = r9.f15225a
            boolean r9 = r9.a()
            if (r9 == 0) goto Lb0
            java.lang.Object r9 = r8.h
            a.eqx r9 = (a.eqx) r9
            java.lang.Object r10 = r8.f
            a.vpt r10 = (a.vpt) r10
            boolean r10 = r10.a()
            java.lang.Object r1 = r8.g
            a.upt r1 = (a.upt) r1
            a.dq00 r1 = r1.f36083a
            java.lang.Object r1 = r1.b
            a.nw20 r1 = (a.nw20) r1
            java.lang.Object r1 = r1.f24215a
            a.q7d0 r1 = (a.q7d0) r1
            java.lang.String r5 = "MARKETING_PUSH_TRACKING"
            boolean r3 = a.axq.z(r1, r5, r3)
            java.lang.Object r1 = r8.e
            a.xr r1 = (a.xr) r1
            a.rl40 r5 = r1.i()
            java.lang.Object r8 = r8.c
            a.iqi r8 = (a.iqi) r8
            java.lang.String r6 = r8.j()
            r7.k = r2
            a.b3c0 r1 = r9.f8256a
            r2 = r10
            java.io.Serializable r8 = r1.d(r2, r3, r4, r5, r6, r7)
            if (r8 != r0) goto Lad
        Lac:
            return r0
        Lad:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        Lb0:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.sd60.i(java.lang.String, a.yje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0096, code lost:
    
        if (m(r10, r9, r2, r0) == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(a.lk80 r9, a.zje r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof a.yj80
            if (r0 == 0) goto L13
            r0 = r10
            a.yj80 r0 = (a.yj80) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            a.yj80 r0 = new a.yj80
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.m
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            a.z1x.P(r10)
            goto L99
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r6
        L35:
            java.lang.Object r9 = r0.j
            a.lk80 r2 = r0.i
            a.z1x.P(r10)
            goto L7c
        L3d:
            a.lk80 r9 = r0.i
            a.z1x.P(r10)
            goto L51
        L43:
            a.z1x.P(r10)
            r0.i = r9
            r0.m = r5
            java.lang.Object r10 = r8.n(r9, r0)
            if (r10 != r1) goto L51
            goto L98
        L51:
            java.lang.Object r10 = r8.d
            a.xh20 r10 = (a.xh20) r10
            java.lang.Object r2 = r8.h
            a.p7m0 r2 = (a.p7m0) r2
            java.lang.Object r2 = r2.getValue()
            a.bm80 r2 = (a.bm80) r2
            java.util.List r2 = r2.a()
            java.lang.Object r10 = r10.invoke(r9, r2)
            java.lang.Object r2 = r8.e
            a.meq0 r2 = (a.meq0) r2
            r0.i = r9
            r0.j = r10
            r0.m = r4
            java.lang.Object r2 = r2.invoke(r10, r0)
            if (r2 != r1) goto L78
            goto L98
        L78:
            r7 = r2
            r2 = r9
            r9 = r10
            r10 = r7
        L7c:
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r4 = r8.f
            a.fup0 r4 = (a.fup0) r4
            java.lang.Object r9 = r4.invoke(r9, r10)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r0.i = r6
            r0.j = r6
            r0.m = r3
            java.lang.Object r8 = r8.m(r10, r9, r2, r0)
            if (r8 != r1) goto L99
        L98:
            return r1
        L99:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.sd60.j(a.lk80, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object l(Throwable th, lk80 lk80Var, zje zjeVar) {
        zj80 zj80Var;
        Throwable th2;
        k050 k050Var;
        Object value;
        if (zjeVar instanceof zj80) {
            zj80Var = (zj80) zjeVar;
            int i = zj80Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                zj80Var.n = i - Integer.MIN_VALUE;
            } else {
                zj80Var = new zj80(this, zjeVar);
            }
        } else {
            zj80Var = new zj80(this, zjeVar);
        }
        Object obj = zj80Var.l;
        wne wneVar = wne.f39444a;
        int i2 = zj80Var.n;
        if (i2 == 0) {
            z1x.P(obj);
            k050 k050Var2 = (k050) this.g;
            zj80Var.i = th;
            zj80Var.j = lk80Var;
            zj80Var.k = k050Var2;
            zj80Var.n = 1;
            if (k050Var2.d(zj80Var) == wneVar) {
                return wneVar;
            }
            th2 = th;
            k050Var = k050Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050Var = zj80Var.k;
            lk80Var = zj80Var.j;
            th2 = zj80Var.i;
            z1x.P(obj);
        }
        try {
            bby bbyVar = (bby) this.i;
            if (bbyVar != null && bbyVar.isActive()) {
                p7m0 p7m0Var = (p7m0) this.h;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, new sl80(((bm80) value).a(), th2, lk80Var)));
            }
            return Unit.f46060a;
        } finally {
            k050Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object m(List list, boolean z, lk80 lk80Var, zje zjeVar) {
        ak80 ak80Var;
        List list2;
        k050 k050Var;
        Object value;
        ArrayList arrayListN0;
        if (zjeVar instanceof ak80) {
            ak80Var = (ak80) zjeVar;
            int i = ak80Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                ak80Var.o = i - Integer.MIN_VALUE;
            } else {
                ak80Var = new ak80(this, zjeVar);
            }
        } else {
            ak80Var = new ak80(this, zjeVar);
        }
        Object obj = ak80Var.m;
        wne wneVar = wne.f39444a;
        int i2 = ak80Var.o;
        if (i2 == 0) {
            z1x.P(obj);
            k050 k050Var2 = (k050) this.g;
            ak80Var.i = list;
            ak80Var.j = lk80Var;
            ak80Var.k = k050Var2;
            ak80Var.l = z;
            ak80Var.o = 1;
            if (k050Var2.d(ak80Var) == wneVar) {
                return wneVar;
            }
            list2 = list;
            k050Var = k050Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = ak80Var.l;
            k050Var = ak80Var.k;
            lk80Var = ak80Var.j;
            list2 = ak80Var.i;
            z1x.P(obj);
        }
        try {
            bby bbyVar = (bby) this.i;
            if (bbyVar != null && bbyVar.isActive()) {
                p7m0 p7m0Var = (p7m0) this.h;
                do {
                    value = p7m0Var.getValue();
                    bm80 bm80Var = (bm80) value;
                    int iOrdinal = lk80Var.ordinal();
                    if (iOrdinal == 0 || iOrdinal == 1) {
                        arrayListN0 = CollectionsKt.N0(bm80Var.a());
                        arrayListN0.addAll(list2);
                    } else {
                        if (iOrdinal != 2) {
                            throw new m460();
                        }
                        arrayListN0 = CollectionsKt.N0(list2);
                    }
                } while (!p7m0Var.m(value, new vl80(arrayListN0, z)));
            }
            k050Var.c(null);
            return Unit.f46060a;
        } catch (Throwable th) {
            k050Var.c(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(lk80 lk80Var, zje zjeVar) {
        bk80 bk80Var;
        lk80 lk80Var2;
        k050 k050Var;
        Object value;
        if (zjeVar instanceof bk80) {
            bk80Var = (bk80) zjeVar;
            int i = bk80Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                bk80Var.m = i - Integer.MIN_VALUE;
            } else {
                bk80Var = new bk80(this, zjeVar);
            }
        } else {
            bk80Var = new bk80(this, zjeVar);
        }
        Object obj = bk80Var.k;
        wne wneVar = wne.f39444a;
        int i2 = bk80Var.m;
        if (i2 == 0) {
            z1x.P(obj);
            k050 k050Var2 = (k050) this.g;
            bk80Var.i = lk80Var;
            bk80Var.j = k050Var2;
            bk80Var.m = 1;
            if (k050Var2.d(bk80Var) == wneVar) {
                return wneVar;
            }
            lk80Var2 = lk80Var;
            k050Var = k050Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050Var = bk80Var.j;
            lk80Var2 = bk80Var.i;
            z1x.P(obj);
        }
        try {
            bby bbyVar = (bby) this.i;
            if (bbyVar != null && bbyVar.isActive()) {
                p7m0 p7m0Var = (p7m0) this.h;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, new yl80(((bm80) value).a(), lk80Var2)));
            }
            return Unit.f46060a;
        } finally {
            k050Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    public Object o(long j, String str, String str2, String str3, boolean z, zje zjeVar) {
        noe0 noe0Var;
        Object g0g0Var;
        knf0 knf0Var = (knf0) this.i;
        us3 us3Var = (us3) this.f;
        vwb0 vwb0Var = (vwb0) this.d;
        q7d0 q7d0Var = (q7d0) this.b;
        if (zjeVar instanceof noe0) {
            noe0Var = (noe0) zjeVar;
            int i = noe0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                noe0Var.k = i - Integer.MIN_VALUE;
            } else {
                noe0Var = new noe0(this, zjeVar);
            }
        } else {
            noe0Var = new noe0(this, zjeVar);
        }
        Object obj = noe0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = noe0Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            if (d() || axq.z(q7d0Var, "R_IS_SENT_STATUS", false)) {
                return Unit.f46060a;
            }
            String strF = f();
            String str4 = ((ane0) this.c).a().c;
            String str5 = str4;
            if (str4 == null) {
                str5 = "";
            }
            int length = str5.length();
            String strC = str5;
            if (length == 0) {
                strC = vwb0Var.c("post_back", "");
            }
            String str6 = (strF.length() <= 0 || !z) ? str3 : null;
            trm0 trm0Var = (trm0) this.h;
            us3Var.getClass();
            String string = us3Var.f36191a.getString(R.string.appsflyer_channel);
            string.getClass();
            String str7 = string.length() == 0 ? null : string;
            String strC2 = vwb0Var.c("APPS_FLYER_ID", "");
            knf0Var.getClass();
            Integer num = new Integer(1);
            Integer num2 = new Integer(22);
            Integer num3 = new Integer(3);
            Long l = new Long(j);
            try {
                e0g0 e0g0Var = j0g0.b;
                g0g0Var = new JSONObject(strC).getString("pb");
            } catch (Throwable th) {
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
            Object obj2 = strC;
            if (!(g0g0Var instanceof g0g0)) {
                obj2 = g0g0Var;
            }
            mb8 mb8Var = new mb8(str2, str7, strC2, strF, num, num2, num3, str, l, (String) obj2, str6);
            noe0Var.k = 1;
            if (((x8o0) ((jfm0) trm0Var.c).invoke()).a("Basic MXhiZXRtb2JpbGU6dUNwVFMxWVZQYjBoUEQ1Rnd3Mjg=", mb8Var, new lwf((byte) 0), noe0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        q7d0Var.d("R_IS_SENT_STATUS", true);
        return Unit.f46060a;
    }

    public boolean p() {
        String str = ((ane0) this.c).a().f1197a;
        if (str == null) {
            str = "";
        }
        return str.length() > 0;
    }

    public void q(int i, mlr mlrVar, String str, boolean z) {
        str.getClass();
        sac.V((sje) this.h, jza0.f17402a, null, null, new kza0(this, mlrVar, i, z, str, (yje) null), 14);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public Object r(long j, zos zosVar, boolean z, zje zjeVar) {
        rd60 rd60Var;
        boolean z2;
        long j2;
        zos zosVar2 = zosVar;
        if (zjeVar instanceof rd60) {
            rd60Var = (rd60) zjeVar;
            int i = rd60Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                rd60Var.n = i - Integer.MIN_VALUE;
            } else {
                rd60Var = new rd60(this, zjeVar);
            }
        } else {
            rd60Var = new rd60(this, zjeVar);
        }
        rd60 rd60Var2 = rd60Var;
        Object obj = rd60Var2.l;
        wne wneVar = wne.f39444a;
        int i2 = rd60Var2.n;
        boolean z3 = true;
        if (i2 == 0) {
            z1x.P(obj);
            nr nrVar = (nr) this.f;
            long j3 = zosVar2.f44730a;
            sip sipVar = zosVar2.b;
            long j4 = zosVar2.c;
            rd60Var2.j = zosVar2;
            rd60Var2.i = j;
            rd60Var2.k = z;
            rd60Var2.n = 1;
            Object objX = nrVar.x(j3, sipVar, j4, rd60Var2);
            if (objX == wneVar) {
                return wneVar;
            }
            z2 = z;
            obj = objX;
            j2 = j;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z4 = rd60Var2.k;
            long j5 = rd60Var2.i;
            zos zosVar3 = rd60Var2.j;
            z1x.P(obj);
            z2 = z4;
            zosVar2 = zosVar3;
            j2 = j5;
        }
        sgs sgsVar = (sgs) obj;
        ros rosVar = (ros) this.b;
        boolean zJ = ((j1q0) this.g).f15748a.j();
        if (!((yiu) this.h).a() && !((pru) this.i).a().O1) {
            z3 = false;
        }
        rosVar.getClass();
        zosVar2.getClass();
        sgsVar.getClass();
        lnf0 lnf0VarD = rosVar.c.d();
        sip sipVar2 = zosVar2.b;
        long j6 = zosVar2.c;
        sipVar2.getClass();
        long j7 = j2;
        return new j5u(gfx.R(new or30(), rosVar.a(zosVar2), null, new mos(rosVar, sgsVar, zosVar2, n7x.u(lnf0VarD, sgsVar, new zos(j7, sipVar2, j6), null), zJ, z2, z3, j7, null), 252), this, sgsVar, j7);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object s(zje zjeVar) throws Exception {
        lza0 lza0Var;
        wsf0 wsf0Var = (wsf0) this.f;
        if (zjeVar instanceof lza0) {
            lza0Var = (lza0) zjeVar;
            int i = lza0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                lza0Var.k = i - Integer.MIN_VALUE;
            } else {
                lza0Var = new lza0(this, zjeVar);
            }
        } else {
            lza0Var = new lza0(this, zjeVar);
        }
        Object objA = lza0Var.i;
        Object obj = wne.f39444a;
        int i2 = lza0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            khf0 khf0VarG = ((g45) wsf0Var.b).G();
            bm5 bm5Var = bm5.e;
            tl5 tl5Var = tl5.f34128a;
            lza0Var.k = 1;
            objA = khf0VarG.A(bm5Var, tl5Var, lza0Var);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        wsf0Var.s().l(bm5.e, (ql5) objA);
        return Unit.f46060a;
    }

    public Object t(mlr mlrVar, boolean z, int i, String str, pk0 pk0Var) {
        if (!z) {
            xr xrVar = (xr) this.d;
            Object objA = ((yr) xrVar.f41344a).f43098a.a(mlrVar, i, ((uyn) xrVar.b).g(str), pk0Var);
            wne wneVar = wne.f39444a;
            if (objA != wneVar) {
                objA = Unit.f46060a;
            }
            if (objA != wneVar) {
                objA = Unit.f46060a;
            }
            return objA == wneVar ? objA : Unit.f46060a;
        }
        kd30 kd30Var = (kd30) this.e;
        Object objQ = ((moc) kd30Var.f18086a).f22129a.q(mlrVar.f22006a, i, ((uyn) kd30Var.b).g(str), pk0Var);
        wne wneVar2 = wne.f39444a;
        if (objQ != wneVar2) {
            objQ = Unit.f46060a;
        }
        if (objQ != wneVar2) {
            objQ = Unit.f46060a;
        }
        return objQ == wneVar2 ? objQ : Unit.f46060a;
    }

    public synchronized ok50 u() {
        ok50 ok50Var;
        try {
            if (((String) this.c) == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            bfx0 bfx0Var = (bfx0) this.h;
            if (bfx0Var != null && ((w4p0) this.g) == null) {
                this.g = new w4p0((Object) ktt0.E(bfx0Var.c()), (byte) 23);
            }
            synchronized (ok50.c) {
                try {
                    Context context = (Context) this.b;
                    String str = (String) this.c;
                    String str2 = (String) this.d;
                    byte[] bArrT = null;
                    if (str != null) {
                        Context applicationContext = context.getApplicationContext();
                        try {
                            String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                            if (string != null) {
                                bArrT = zcm0.t(string);
                            }
                        } catch (ClassCastException | IllegalArgumentException unused) {
                            throw new CharConversionException(kng0.l("can't read keyset; the pref value ", str, " is not a valid hex string"));
                        }
                    } else {
                        jf4.o("keysetName cannot be null");
                    }
                    String str3 = (String) this.e;
                    if (bArrT == null) {
                        if (str3 != null) {
                            this.f = x();
                        }
                        w4p0 w4p0Var = (w4p0) this.g;
                        if (w4p0Var == null) {
                            throw new GeneralSecurityException("cannot read or generate keyset");
                        }
                        fck0 fck0VarL = fck0.l(w4p0Var);
                        fuj0 fuj0Var = new fuj0((Context) this.b, (String) this.c, (String) this.d);
                        g4x0 g4x0Var = (g4x0) this.f;
                        try {
                            if (g4x0Var != null) {
                                fck0VarL.y(fuj0Var, g4x0Var, new byte[0]);
                            } else {
                                fuj0Var.I(fck0VarL.E());
                            }
                            mfx0 mfx0VarE = fck0VarL.E();
                            hkw0 hkw0Var = (hkw0) mfx0VarE.h(5);
                            hkw0Var.a(mfx0VarE);
                            this.i = new zas0(hkw0Var, (byte) 17);
                        } catch (IOException e) {
                            throw new GeneralSecurityException(e);
                        }
                    } else if (str3 != null) {
                        this.i = w(bArrT);
                    } else {
                        this.i = v(bArrT);
                    }
                    ok50Var = new ok50(this);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return ok50Var;
    }

    public zas0 w(byte[] bArr) {
        try {
            this.f = i4x0.a((String) this.e);
            try {
                mfx0 mfx0VarE = fck0.k(new drm0(new ByteArrayInputStream(bArr)), (g4x0) this.f, new byte[0]).E();
                hkw0 hkw0Var = (hkw0) mfx0VarE.h(5);
                hkw0Var.a(mfx0VarE);
                return new zas0(hkw0Var, (byte) 17);
            } catch (IOException | GeneralSecurityException e) {
                try {
                    return v(bArr);
                } catch (IOException unused) {
                    throw e;
                }
            }
        } catch (GeneralSecurityException | ProviderException e2) {
            try {
                zas0 zas0VarV = v(bArr);
                Object obj = ok50.c;
                Log.w("ok50", "cannot use Android Keystore, it'll be disabled", e2);
                return zas0VarV;
            } catch (IOException unused2) {
                throw e2;
            }
        }
    }

    public g4x0 x() throws KeyStoreException {
        Object obj = ok50.c;
        try {
            boolean zB = i4x0.b((String) this.e);
            try {
                return i4x0.a((String) this.e);
            } catch (GeneralSecurityException | ProviderException e) {
                if (!zB) {
                    throw new KeyStoreException(kng0.l("the master key ", (String) this.e, " exists but is unusable"), e);
                }
                Object obj2 = ok50.c;
                Log.w("ok50", "cannot use Android Keystore, it'll be disabled", e);
                return null;
            }
        } catch (GeneralSecurityException | ProviderException e2) {
            Object obj3 = ok50.c;
            Log.w("ok50", "cannot use Android Keystore, it'll be disabled", e2);
            return null;
        }
    }

    public sd60(jt2 jt2Var, g090 g090Var, r6k0 r6k0Var, SipProvider sipProvider, String str, AtomicReference atomicReference, AtomicReference atomicReference2) {
        this.f32018a = (byte) 7;
        r6k0Var.getClass();
        jt2Var.getClass();
        str.getClass();
        this.b = atomicReference;
        this.c = atomicReference2;
        this.d = sipProvider;
        this.e = g090Var;
        this.f = jt2Var;
        this.g = str;
        this.h = new wti((byte) 4);
        this.i = new pox(r6k0Var);
    }

    public /* synthetic */ sd60(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, byte b) {
        this.f32018a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
        this.i = obj8;
    }

    public sd60(yl80 yl80Var, lne lneVar, bvc bvcVar, xh20 xh20Var, meq0 meq0Var, fup0 fup0Var) {
        this.f32018a = (byte) 1;
        lneVar.getClass();
        this.b = lneVar;
        this.c = bvcVar;
        this.d = xh20Var;
        this.e = meq0Var;
        this.f = fup0Var;
        this.g = new k050();
        this.h = q7m0.a(yl80Var);
        sac.V(bvcVar, null, null, lneVar, new s980(yl80Var, this, null, (byte) 1), 11);
    }

    public sd60(lrc lrcVar, fht0 fht0Var, nou nouVar, f3c f3cVar, khf0 khf0Var, ms2 ms2Var, pru pruVar, iqt iqtVar) {
        this.f32018a = (byte) 11;
        this.b = lrcVar;
        this.c = fht0Var;
        this.d = nouVar;
        this.e = f3cVar;
        this.f = khf0Var;
        this.g = ms2Var;
        this.i = pruVar;
        this.h = iqtVar;
    }

    public sd60(cad cadVar, oeg0 oeg0Var, jdk0 jdk0Var, xr xrVar, kd30 kd30Var, wsf0 wsf0Var, ytt yttVar) {
        this.f32018a = (byte) 3;
        oeg0Var.getClass();
        this.b = oeg0Var;
        this.c = jdk0Var;
        this.d = xrVar;
        this.e = kd30Var;
        this.f = wsf0Var;
        this.g = yttVar;
        dvj dvjVar = ((psc) cadVar.b).h().b;
        kin0 kin0VarE = qem0.e();
        dvjVar.getClass();
        this.h = d5c.a(kotlin.coroutines.e.c(dvjVar, kin0VarE));
    }

    public sd60(q7d0 q7d0Var, ane0 ane0Var, vwb0 vwb0Var, onv onvVar, us3 us3Var, gv3 gv3Var, trm0 trm0Var, knf0 knf0Var) {
        this.f32018a = (byte) 5;
        q7d0Var.getClass();
        ane0Var.getClass();
        vwb0Var.getClass();
        us3Var.getClass();
        gv3Var.getClass();
        knf0Var.getClass();
        this.b = q7d0Var;
        this.c = ane0Var;
        this.d = vwb0Var;
        this.e = onvVar;
        this.f = us3Var;
        this.g = gv3Var;
        this.h = trm0Var;
        this.i = knf0Var;
    }

    public sd60(ros rosVar, q530 q530Var, nmo nmoVar, cmt cmtVar, nr nrVar, j1q0 j1q0Var, yiu yiuVar, pru pruVar) {
        this.f32018a = (byte) 0;
        rosVar.getClass();
        q530Var.getClass();
        j1q0Var.getClass();
        this.b = rosVar;
        this.c = q530Var;
        this.d = nmoVar;
        this.e = cmtVar;
        this.f = nrVar;
        this.g = j1q0Var;
        this.h = yiuVar;
        this.i = pruVar;
    }

    public sd60(ctf0 ctf0Var, mne mneVar, duj dujVar, ojj ojjVar, m1e m1eVar, ii iiVar, wdk0 wdk0Var, s9m0 s9m0Var) {
        this.f32018a = (byte) 10;
        ctf0Var.getClass();
        m1eVar.getClass();
        iiVar.getClass();
        wdk0Var.getClass();
        this.b = ctf0Var;
        this.c = mneVar;
        this.d = dujVar;
        this.e = ojjVar;
        this.f = m1eVar;
        this.g = iiVar;
        this.h = wdk0Var;
        this.i = s9m0Var;
    }

    public sd60(ctf0 ctf0Var, mne mneVar, wdk0 wdk0Var, duj dujVar, bzu bzuVar, mii0 mii0Var, x20 x20Var, ywu ywuVar) {
        this.f32018a = (byte) 8;
        ctf0Var.getClass();
        wdk0Var.getClass();
        this.b = ctf0Var;
        this.c = mneVar;
        this.d = wdk0Var;
        this.e = dujVar;
        this.f = mii0Var;
        this.g = x20Var;
        this.h = ywuVar;
        this.i = ((o3c) bzuVar.b).k();
    }

    public sd60(Context context, z6j0 z6j0Var, j6m0 j6m0Var, dpi0 dpi0Var, do20 do20Var, fhn fhnVar, qaj qajVar) {
        this.f32018a = (byte) 6;
        AtomicReference atomicReference = new AtomicReference();
        this.h = atomicReference;
        this.i = new AtomicReference(new TaskCompletionSource());
        this.b = context;
        this.c = z6j0Var;
        this.d = dpi0Var;
        this.e = do20Var;
        this.f = fhnVar;
        this.g = qajVar;
        atomicReference.set(qud.b(j6m0Var));
    }
}
