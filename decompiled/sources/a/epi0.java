package a;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.perf.metrics.Counter;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.PerfSession;
import com.huawei.hms.api.ConnectionResult;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class epi0 implements glq, zf60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8190a;
    public Object b;

    public epi0(gii0 gii0Var, byte b) {
        this.f8190a = b;
        gii0Var.getClass();
        switch (b) {
            case 18:
                this.b = new enj0(gii0Var, (byte) 23);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                this.b = new enj0(gii0Var, (byte) 28);
                break;
            case 20:
                this.b = new lkr0(gii0Var, (byte) 6);
                break;
            case 21:
            default:
                this.b = new enj0(gii0Var, (byte) 11);
                break;
            case 22:
                this.b = new lkr0(gii0Var, (byte) 14);
                break;
        }
    }

    @Override // a.glq
    public float a(float f, long j) {
        long j2 = j / 1000000;
        rkq rkqVarC = ((yx3) this.b).c(f);
        long j3 = rkqVarC.c;
        return (((Math.signum(rkqVarC.f30660a) * gz2.a(j3 > 0 ? j2 / j3 : 1.0f).b) * rkqVarC.b) / j3) * 1000.0f;
    }

    @Override // a.glq
    public float b(float f, float f2, long j) {
        long j2 = j / 1000000;
        rkq rkqVarC = ((yx3) this.b).c(f2);
        long j3 = rkqVarC.c;
        return (Math.signum(rkqVarC.f30660a) * rkqVarC.b * gz2.a(j3 > 0 ? j2 / j3 : 1.0f).f10388a) + f;
    }

    public ibs0 c() {
        List listUnmodifiableList;
        fbs0 fbs0VarH = ibs0.H();
        fbs0VarH.p(((Trace) this.b).d);
        fbs0VarH.n(((Trace) this.b).k.f45671a);
        Trace trace = (Trace) this.b;
        fbs0VarH.o(trace.k.b(trace.l));
        for (Counter counter : ((Trace) this.b).e.values()) {
            fbs0VarH.m(counter.b.get(), counter.f45668a);
        }
        ArrayList arrayList = ((Trace) this.b).h;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fbs0VarH.j(new epi0(it.next(), (byte) 21).c());
            }
        }
        Map<String, String> attributes = ((Trace) this.b).getAttributes();
        fbs0VarH.i();
        ((ibs0) fbs0VarH.b).G().putAll(attributes);
        Trace trace2 = (Trace) this.b;
        synchronized (trace2.g) {
            try {
                ArrayList arrayList2 = new ArrayList();
                for (PerfSession perfSession : trace2.g) {
                    if (perfSession != null) {
                        arrayList2.add(perfSession);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            } catch (Throwable th) {
                throw th;
            }
        }
        rd90[] rd90VarArrB = PerfSession.b(listUnmodifiableList);
        if (rd90VarArrB != null) {
            List listAsList = Arrays.asList(rd90VarArrB);
            fbs0VarH.i();
            ((ibs0) fbs0VarH.b).r(listAsList);
        }
        return (ibs0) fbs0VarH.h();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:88|30|31|86|32|(1:35)) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:(1:(1:(3:13|14|15)(2:16|17))(3:18|19|20))(4:21|84|22|23)|90|36|37|79|(1:81)|82|83) */
    /* JADX WARN: Code duplicated, block: B:35:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:46:0x0135 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0137 A[Catch: all -> 0x01cf, TryCatch #4 {all -> 0x01cf, blocks: (B:14:0x0044, B:37:0x010b, B:44:0x012f, B:47:0x0137, B:49:0x0142, B:53:0x014c, B:55:0x0150, B:58:0x0170, B:60:0x017f, B:62:0x0185, B:66:0x018f, B:68:0x0193, B:71:0x01b3, B:72:0x01bb, B:74:0x01c6, B:75:0x01cd, B:76:0x01ce, B:19:0x0070, B:27:0x00ba), top: B:92:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0142 A[Catch: all -> 0x01cf, TryCatch #4 {all -> 0x01cf, blocks: (B:14:0x0044, B:37:0x010b, B:44:0x012f, B:47:0x0137, B:49:0x0142, B:53:0x014c, B:55:0x0150, B:58:0x0170, B:60:0x017f, B:62:0x0185, B:66:0x018f, B:68:0x0193, B:71:0x01b3, B:72:0x01bb, B:74:0x01c6, B:75:0x01cd, B:76:0x01ce, B:19:0x0070, B:27:0x00ba), top: B:92:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0149  */
    /* JADX WARN: Code duplicated, block: B:52:0x014b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0150 A[Catch: all -> 0x01cf, TryCatch #4 {all -> 0x01cf, blocks: (B:14:0x0044, B:37:0x010b, B:44:0x012f, B:47:0x0137, B:49:0x0142, B:53:0x014c, B:55:0x0150, B:58:0x0170, B:60:0x017f, B:62:0x0185, B:66:0x018f, B:68:0x0193, B:71:0x01b3, B:72:0x01bb, B:74:0x01c6, B:75:0x01cd, B:76:0x01ce, B:19:0x0070, B:27:0x00ba), top: B:92:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x016f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0170 A[Catch: all -> 0x01cf, TryCatch #4 {all -> 0x01cf, blocks: (B:14:0x0044, B:37:0x010b, B:44:0x012f, B:47:0x0137, B:49:0x0142, B:53:0x014c, B:55:0x0150, B:58:0x0170, B:60:0x017f, B:62:0x0185, B:66:0x018f, B:68:0x0193, B:71:0x01b3, B:72:0x01bb, B:74:0x01c6, B:75:0x01cd, B:76:0x01ce, B:19:0x0070, B:27:0x00ba), top: B:92:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x017f A[Catch: all -> 0x01cf, TryCatch #4 {all -> 0x01cf, blocks: (B:14:0x0044, B:37:0x010b, B:44:0x012f, B:47:0x0137, B:49:0x0142, B:53:0x014c, B:55:0x0150, B:58:0x0170, B:60:0x017f, B:62:0x0185, B:66:0x018f, B:68:0x0193, B:71:0x01b3, B:72:0x01bb, B:74:0x01c6, B:75:0x01cd, B:76:0x01ce, B:19:0x0070, B:27:0x00ba), top: B:92:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0185 A[Catch: all -> 0x01cf, TryCatch #4 {all -> 0x01cf, blocks: (B:14:0x0044, B:37:0x010b, B:44:0x012f, B:47:0x0137, B:49:0x0142, B:53:0x014c, B:55:0x0150, B:58:0x0170, B:60:0x017f, B:62:0x0185, B:66:0x018f, B:68:0x0193, B:71:0x01b3, B:72:0x01bb, B:74:0x01c6, B:75:0x01cd, B:76:0x01ce, B:19:0x0070, B:27:0x00ba), top: B:92:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x018c  */
    /* JADX WARN: Code duplicated, block: B:65:0x018e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0193 A[Catch: all -> 0x01cf, TryCatch #4 {all -> 0x01cf, blocks: (B:14:0x0044, B:37:0x010b, B:44:0x012f, B:47:0x0137, B:49:0x0142, B:53:0x014c, B:55:0x0150, B:58:0x0170, B:60:0x017f, B:62:0x0185, B:66:0x018f, B:68:0x0193, B:71:0x01b3, B:72:0x01bb, B:74:0x01c6, B:75:0x01cd, B:76:0x01ce, B:19:0x0070, B:27:0x00ba), top: B:92:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01b3 A[Catch: all -> 0x01cf, TryCatch #4 {all -> 0x01cf, blocks: (B:14:0x0044, B:37:0x010b, B:44:0x012f, B:47:0x0137, B:49:0x0142, B:53:0x014c, B:55:0x0150, B:58:0x0170, B:60:0x017f, B:62:0x0185, B:66:0x018f, B:68:0x0193, B:71:0x01b3, B:72:0x01bb, B:74:0x01c6, B:75:0x01cd, B:76:0x01ce, B:19:0x0070, B:27:0x00ba), top: B:92:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01bb A[Catch: all -> 0x01cf, TryCatch #4 {all -> 0x01cf, blocks: (B:14:0x0044, B:37:0x010b, B:44:0x012f, B:47:0x0137, B:49:0x0142, B:53:0x014c, B:55:0x0150, B:58:0x0170, B:60:0x017f, B:62:0x0185, B:66:0x018f, B:68:0x0193, B:71:0x01b3, B:72:0x01bb, B:74:0x01c6, B:75:0x01cd, B:76:0x01ce, B:19:0x0070, B:27:0x00ba), top: B:92:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x01c6 A[Catch: all -> 0x01cf, TryCatch #4 {all -> 0x01cf, blocks: (B:14:0x0044, B:37:0x010b, B:44:0x012f, B:47:0x0137, B:49:0x0142, B:53:0x014c, B:55:0x0150, B:58:0x0170, B:60:0x017f, B:62:0x0185, B:66:0x018f, B:68:0x0193, B:71:0x01b3, B:72:0x01bb, B:74:0x01c6, B:75:0x01cd, B:76:0x01ce, B:19:0x0070, B:27:0x00ba), top: B:92:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01ce A[Catch: all -> 0x01cf, TRY_LEAVE, TryCatch #4 {all -> 0x01cf, blocks: (B:14:0x0044, B:37:0x010b, B:44:0x012f, B:47:0x0137, B:49:0x0142, B:53:0x014c, B:55:0x0150, B:58:0x0170, B:60:0x017f, B:62:0x0185, B:66:0x018f, B:68:0x0193, B:71:0x01b3, B:72:0x01bb, B:74:0x01c6, B:75:0x01cd, B:76:0x01ce, B:19:0x0070, B:27:0x00ba), top: B:92:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0110, code lost:
    
        r17 = r13;
        r13 = r0;
        r0 = r11;
        r6 = r1;
        r1 = r15;
        r14 = r17;
        r17 = r9;
        r9 = r4;
        r10 = r5;
        r4 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0122, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0123, code lost:
    
        r14 = r13;
        r13 = r0;
        r0 = r12;
        r12 = r7;
        r7 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012b, code lost:
    
        r22 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01b0, code lost:
    
        if (a.qcc.P(r10, r12) == r3) goto L70;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0177 -> B:29:0x00cc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(long r23, a.zje r25, java.lang.String r26) {
        /*
            Method dump skipped, instruction units count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.epi0.d(long, a.zje, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(long j, zje zjeVar) {
        gns0 gns0Var;
        if (zjeVar instanceof gns0) {
            gns0Var = (gns0) zjeVar;
            int i = gns0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                gns0Var.k = i - Integer.MIN_VALUE;
            } else {
                gns0Var = new gns0(this, zjeVar);
            }
        } else {
            gns0Var = new gns0(this, zjeVar);
        }
        Object objA = gns0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = gns0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            dns0 dns0Var = (dns0) ((lkr0) this.b).invoke();
            gns0Var.k = 1;
            objA = dns0Var.a(j, gns0Var);
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

    public void f(trk0 trk0Var) {
        Object value;
        HashMap map;
        Object value2;
        HashMap map2;
        Object value3;
        HashMap map3;
        gl9 gl9Var = (gl9) ((ok50) this.b).f25390a;
        boolean z = trk0Var instanceof rrk0;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (z) {
            List<Pair> list = ((rrk0) trk0Var).f30989a;
            HashMap map4 = new HashMap();
            for (Pair pair : list) {
                Date date = new Date(timeUnit.toMillis(((tlq0) pair.b).f34159a));
                Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
                calendar.setTime(date);
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                Date time = calendar.getTime();
                time.getClass();
                gl9.b(map4, new Pair(Long.valueOf(((iel0) pair.f46059a).f14639a), time), false, true);
            }
            p7m0 p7m0Var = gl9Var.f11479a;
            do {
                value3 = p7m0Var.getValue();
                map3 = new HashMap();
                map3.putAll(map4);
            } while (!p7m0Var.m(value3, map3));
            return;
        }
        if (trk0Var instanceof qrk0) {
            List<Pair> list2 = ((qrk0) trk0Var).f29215a;
            HashMap map5 = new HashMap();
            for (Pair pair2 : list2) {
                Date date2 = new Date(((tlq0) pair2.b).f34159a);
                Calendar calendar2 = Calendar.getInstance(TimeZone.getDefault());
                calendar2.setTime(date2);
                calendar2.set(11, 0);
                calendar2.set(12, 0);
                calendar2.set(13, 0);
                calendar2.set(14, 0);
                Date time2 = calendar2.getTime();
                time2.getClass();
                gl9.b(map5, new Pair(Long.valueOf(((iel0) pair2.f46059a).f14639a), time2), false, false);
            }
            p7m0 p7m0Var2 = gl9Var.c;
            do {
                value2 = p7m0Var2.getValue();
                map2 = new HashMap();
                map2.putAll(map5);
            } while (!p7m0Var2.m(value2, map2));
            return;
        }
        if (!(trk0Var instanceof srk0)) {
            t9f.b();
            return;
        }
        List<Pair> list3 = ((srk0) trk0Var).f32681a;
        HashMap map6 = new HashMap();
        for (Pair pair3 : list3) {
            Date date3 = new Date(timeUnit.toMillis(((tlq0) pair3.b).f34159a));
            Calendar calendar3 = Calendar.getInstance(TimeZone.getDefault());
            calendar3.setTime(date3);
            calendar3.set(11, 0);
            calendar3.set(12, 0);
            calendar3.set(13, 0);
            calendar3.set(14, 0);
            Date time3 = calendar3.getTime();
            time3.getClass();
            gl9.b(map6, new Pair(Long.valueOf(((iel0) pair3.f46059a).f14639a), time3), true, false);
        }
        p7m0 p7m0Var3 = gl9Var.b;
        do {
            value = p7m0Var3.getValue();
            map = new HashMap();
            map.putAll(map6);
        } while (!p7m0Var3.m(value, map));
    }

    @Override // a.glq
    public float g() {
        return 0.0f;
    }

    @Override // a.glq
    public long h(float f) {
        return ((long) (Math.exp(((yx3) this.b).d(f) / (((double) skq.f32364a) - 1.0d)) * 1000.0d)) * 1000000;
    }

    @Override // a.glq
    public float i(float f, float f2) {
        yx3 yx3Var = (yx3) this.b;
        double d = yx3Var.d(f2);
        double d2 = skq.f32364a;
        return (Math.signum(f2) * ((float) (Math.exp((d2 / (d2 - 1.0d)) * d) * ((double) (yx3Var.f43402a * yx3Var.b))))) + f;
    }

    public void j(boolean z) {
        ((zoq0) ((dpi0) this.b).f6468a).f44728a = z;
    }

    public Uri k(File file, String str) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            Uri uriM = Build.VERSION.SDK_INT >= 29 ? m(fileInputStream, str) : n(fileInputStream, str);
            fileInputStream.close();
            return uriM;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                bkb.E(fileInputStream, th);
                throw th2;
            }
        }
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        Boolean boolValueOf;
        zfb zfbVar;
        RecyclerView recyclerView;
        byte b = this.f8190a;
        view.getClass();
        switch (b) {
            case 10:
                uiv0 uiv0Var = xiv0Var.f40966a;
                int i = uiv0Var.i(8).d;
                syl0 syl0Var = (syl0) this.b;
                syl0Var.R1 = i > 0;
                syl0Var.S1 = uiv0Var.i(1).b;
                int iMax = Math.max((i - uiv0Var.i(2).d) - syl0Var.G().getDimensionPixelSize(R.dimen.bottom_navigation_view_height), 0);
                boolean z = iMax > 0;
                int dimensionPixelSize = syl0Var.G().getDimensionPixelSize(R.dimen.space_24);
                int dimensionPixelSize2 = syl0Var.G().getDimensionPixelSize(R.dimen.space_40);
                if (!z) {
                    dimensionPixelSize2 = 0;
                }
                RecyclerView recyclerView2 = syl0Var.G0().g;
                recyclerView2.setPadding(recyclerView2.getPaddingLeft(), recyclerView2.getPaddingTop(), recyclerView2.getPaddingRight(), dimensionPixelSize + iMax + dimensionPixelSize2);
                jk3 jk3Var = syl0Var.Z1;
                if (jk3Var != null) {
                    boolValueOf = Boolean.valueOf(((FrameLayout) jk3Var.e).getVisibility() == 0);
                } else {
                    boolValueOf = null;
                }
                int dimensionPixelSize3 = syl0Var.G().getDimensionPixelSize(R.dimen.space_8);
                jk3 jk3Var2 = syl0Var.Z1;
                if (jk3Var2 != null) {
                    ((FrameLayout) jk3Var2.e).setVisibility(z ? 0 : 8);
                }
                jk3 jk3Var3 = syl0Var.Z1;
                if (jk3Var3 != null) {
                    FrameLayout frameLayout = (FrameLayout) jk3Var3.e;
                    frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), iMax + dimensionPixelSize3);
                }
                if (!Intrinsics.d(boolValueOf, Boolean.valueOf(z))) {
                    syl0Var.H0().x(new vzl0(z));
                }
                if (!z && (zfbVar = syl0Var.W1) != null && (recyclerView = zfbVar.l) != null) {
                    recyclerView.addOnLayoutChangeListener(new w23(recyclerView, (byte) 5));
                }
                if (!syl0Var.U1) {
                    syl0Var.N0(syl0Var.R1);
                    syl0Var.U1 = true;
                }
                return xiv0Var;
            default:
                uiv0 uiv0Var2 = xiv0Var.f40966a;
                int i2 = uiv0Var2.i(1).b;
                int i3 = uiv0Var2.i(2).d;
                View viewQ0 = ((ypn0) this.b).q0();
                viewQ0.setPadding(viewQ0.getPaddingLeft(), i2, viewQ0.getPaddingRight(), i3);
                return xiv0.b;
        }
    }

    public Uri m(FileInputStream fileInputStream, String str) throws IOException {
        Object g0g0Var;
        ContentResolver contentResolver = ((us00) this.b).getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", "image/*");
        contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
        contentValues.put("is_pending", (Integer) 1);
        Uri uriInsert = contentResolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
        if (uriInsert == null) {
            ohq.l("Failed to create MediaStore entry for ".concat(str));
            return null;
        }
        try {
            e0g0 e0g0Var = j0g0.b;
            o(fileInputStream, uriInsert);
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("is_pending", (Integer) 0);
            contentResolver.update(uriInsert, contentValues2, null, null);
            g0g0Var = uriInsert;
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (j0g0.a(g0g0Var) != null) {
            try {
                contentResolver.delete(uriInsert, null, null);
            } catch (Throwable unused) {
                e0g0 e0g0Var3 = j0g0.b;
            }
        }
        z1x.P(g0g0Var);
        return (Uri) g0g0Var;
    }

    public Uri n(FileInputStream fileInputStream, String str) {
        Object g0g0Var;
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        externalStoragePublicDirectory.mkdirs();
        File file = new File(externalStoragePublicDirectory, str);
        Uri uriC = FileProvider.c((us00) this.b, file, "org.xbet.client1.provider");
        try {
            e0g0 e0g0Var = j0g0.b;
            uriC.getClass();
            o(fileInputStream, uriC);
            g0g0Var = uriC;
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (j0g0.a(g0g0Var) != null) {
            file.delete();
        }
        z1x.P(g0g0Var);
        return (Uri) g0g0Var;
    }

    public void o(FileInputStream fileInputStream, Uri uri) throws IOException {
        OutputStream outputStreamOpenOutputStream = ((us00) this.b).getContentResolver().openOutputStream(uri);
        if (outputStreamOpenOutputStream == null) {
            itt0.j(uri, "Failed to open output stream for ");
            return;
        }
        try {
            wha0.J(fileInputStream, outputStreamOpenOutputStream, 8192);
            outputStreamOpenOutputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                bkb.E(outputStreamOpenOutputStream, th);
                throw th2;
            }
        }
    }

    public /* synthetic */ epi0(Object obj, byte b) {
        this.f8190a = b;
        this.b = obj;
    }

    public epi0(as20 as20Var) {
        this.f8190a = (byte) 24;
        as20Var.getClass();
        this.b = as20Var;
    }

    public epi0(eat0 eat0Var) {
        this.f8190a = (byte) 23;
        eat0Var.getClass();
        this.b = eat0Var;
    }

    public epi0(cad cadVar, j1q0 j1q0Var, g1q0 g1q0Var, bxi bxiVar, xaq0 xaq0Var, us00 us00Var, vwb0 vwb0Var, fjj fjjVar, vby vbyVar) {
        this.f8190a = (byte) 17;
        j1q0Var.getClass();
        g1q0Var.getClass();
        xaq0Var.getClass();
        vwb0Var.getClass();
        fjjVar.getClass();
        vbyVar.getClass();
        this.b = new xzp(bxiVar, j1q0Var, xaq0Var, us00Var, vwb0Var, g1q0Var, fjjVar);
    }

    public epi0(w6k w6kVar) {
        this.f8190a = (byte) 9;
        float f = wzk0.f40025a;
        yx3 yx3Var = new yx3();
        yx3Var.f43402a = f;
        float density = w6kVar.getDensity();
        float f2 = skq.f32364a;
        yx3Var.b = density * 386.0878f * 160.0f * 0.84f;
        this.b = yx3Var;
    }
}
