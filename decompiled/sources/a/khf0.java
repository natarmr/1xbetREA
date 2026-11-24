package a;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.view.View;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.Fragment;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class khf0 implements zf60, nae0, b4w0 {
    public static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18289a;
    public Object b;
    public Object c;
    public Object d;

    public khf0(r68 r68Var) throws bwq {
        int i;
        short s;
        this.f18289a = (byte) 6;
        int i2 = r68Var.b;
        if (i2 < 8 || i2 > 144 || (i = i2 & 1) != 0) {
            throw bwq.a();
        }
        int i3 = r68Var.f29923a;
        tbu0[] tbu0VarArr = tbu0.h;
        if (i != 0 || (i3 & 1) != 0) {
            throw bwq.a();
        }
        tbu0[] tbu0VarArr2 = tbu0.h;
        for (int i4 = 0; i4 < 48; i4++) {
            tbu0 tbu0Var = tbu0VarArr2[i4];
            short s2 = tbu0Var.b;
            if (s2 == i2 && (s = tbu0Var.c) == i3) {
                this.d = tbu0Var;
                if (r68Var.b != s2) {
                    jf4.o("Dimension of bitMatrix must match the version size");
                    throw null;
                }
                byte b = tbu0Var.d;
                byte b2 = tbu0Var.e;
                int i5 = s2 / b;
                int i6 = s / b2;
                r68 r68Var2 = new r68(i6 * b2, i5 * b);
                for (int i7 = 0; i7 < i5; i7++) {
                    int i8 = i7 * b;
                    for (int i9 = 0; i9 < i6; i9++) {
                        int i10 = i9 * b2;
                        for (int i11 = 0; i11 < b; i11++) {
                            int i12 = ((b + 2) * i7) + 1 + i11;
                            int i13 = i8 + i11;
                            for (int i14 = 0; i14 < b2; i14++) {
                                if (r68Var.b(((b2 + 2) * i9) + 1 + i14, i12)) {
                                    r68Var2.h(i10 + i14, i13);
                                }
                            }
                        }
                    }
                }
                this.b = r68Var2;
                this.c = new r68(r68Var2.f29923a, r68Var2.b);
                return;
            }
        }
        throw bwq.a();
    }

    public static /* synthetic */ Serializable G(khf0 khf0Var, bm5 bm5Var, yje yjeVar) {
        return khf0Var.A(bm5Var, tl5.c, yjeVar);
    }

    public static boolean y(gis gisVar) {
        Object obj = null;
        if (gisVar != null) {
            for (Object obj2 : gisVar.f11364a) {
                mz60 mz60Var = (mz60) obj2;
                mz60Var.getClass();
                if ((mz60Var.e || !mz60Var.f || x1x.D(mz60Var.b) == s470.LUCKY_WHEEL.a()) ? false : true) {
                    obj = obj2;
                    break;
                }
            }
            obj = (mz60) obj;
        }
        return obj != null;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ae A[Catch: Exception -> 0x0041, TryCatch #2 {Exception -> 0x0041, blocks: (B:17:0x003d, B:42:0x00a2, B:43:0x00a8, B:45:0x00ae, B:49:0x00bd, B:52:0x00c2, B:53:0x00c7), top: B:71:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c2 A[Catch: Exception -> 0x0041, TryCatch #2 {Exception -> 0x0041, blocks: (B:17:0x003d, B:42:0x00a2, B:43:0x00a8, B:45:0x00ae, B:49:0x00bd, B:52:0x00c2, B:53:0x00c7), top: B:71:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        if (r15 == r2) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00df, code lost:
    
        if (r15 == r2) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable A(a.bm5 r13, a.tl5 r14, a.yje r15) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.khf0.A(a.bm5, a.tl5, a.yje):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Serializable B(uaq0 uaq0Var, zje zjeVar) {
        wlu wluVar;
        sff0 sff0Var;
        uaq0 uaq0Var2;
        int i;
        if (zjeVar instanceof wlu) {
            wluVar = (wlu) zjeVar;
            int i2 = wluVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wluVar.m = i2 - Integer.MIN_VALUE;
            } else {
                wluVar = new wlu(this, zjeVar);
            }
        } else {
            wluVar = new wlu(this, zjeVar);
        }
        Object obj = wluVar.k;
        wne wneVar = wne.f39444a;
        int i3 = wluVar.m;
        Serializable serializable = null;
        boolean z = false;
        if (i3 == 0) {
            z1x.P(obj);
            sff0 sff0VarA = ((pru) this.d).a();
            rou rouVar = (rou) this.c;
            wluVar.i = uaq0Var;
            wluVar.j = sff0VarA;
            wluVar.m = 1;
            Object objA = rouVar.a(false, wluVar);
            if (objA == wneVar) {
                return wneVar;
            }
            sff0Var = sff0VarA;
            obj = objA;
            uaq0Var2 = uaq0Var;
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sff0Var = wluVar.j;
            uaq0Var2 = wluVar.i;
            z1x.P(obj);
        }
        boolean z2 = ((m2c0) obj).o0;
        boolean z3 = sff0Var.l.n;
        boolean z4 = sff0Var.b.f13233a.d;
        f4u f4uVar = (f4u) this.b;
        boolean z5 = z2 && z3;
        uaq0Var2.getClass();
        dq00 dq00Var = (dq00) f4uVar.b;
        c350 c350Var = c350.f3657a;
        c350 c350Var2 = z5 ? c350Var : null;
        d350 d350Var = d350.f5386a;
        d350 d350Var2 = (z5 && z4) ? d350Var : null;
        b350 b350Var = b350.f1886a;
        b350 b350Var2 = (z5 || !z4) ? null : b350Var;
        int i4 = 3;
        List listZ = tx3.z(new e350[]{c350Var2, d350Var2, b350Var2});
        ArrayList arrayList = new ArrayList(r3d.q(listZ, 10));
        for (e350 e350Var : (ArrayList) listZ) {
            boolean zO = StringsKt.O(((knf0) dq00Var.c).c(), "ru", z);
            e350Var.getClass();
            if (e350Var.equals(c350Var)) {
                i = 1;
            } else if (e350Var.equals(d350Var)) {
                i = 2;
            } else {
                if (!e350Var.equals(b350Var)) {
                    Serializable serializable2 = serializable;
                    t9f.b();
                    return serializable2;
                }
                i = i4;
            }
            String str = zO ? "/ru/" : "/en/";
            uaq0.f35345a.getClass();
            String str2 = "_l";
            if (!s9m0.j(uaq0Var2)) {
                if (s9m0.i(uaq0Var2)) {
                    str2 = "_d";
                } else if (s9m0.k(uaq0Var2)) {
                    str2 = "_n";
                }
            }
            Serializable serializable3 = serializable;
            arrayList.add(new a350(e350Var, "static/img/android/instructions/onboarding_casino/my_casino" + str + i + str2 + ".png"));
            serializable = serializable3;
            i4 = 3;
            z = false;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d A[PHI: r9 r11 r14
  0x004d: PHI (r9v2 long) = (r9v0 long), (r9v3 long), (r9v3 long) binds: [B:21:0x004b, B:27:0x006a, B:28:0x006c] A[DONT_GENERATE, DONT_INLINE]
  0x004d: PHI (r11v3 long) = (r11v0 long), (r11v4 long), (r11v4 long) binds: [B:21:0x004b, B:27:0x006a, B:28:0x006c] A[DONT_GENERATE, DONT_INLINE]
  0x004d: PHI (r14v2 boolean) = (r14v0 boolean), (r14v3 boolean), (r14v3 boolean) binds: [B:21:0x004b, B:27:0x006a, B:28:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:34:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0085  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r0 == r1) goto L33;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x0085, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object C(long r9, long r11, a.zje r13, boolean r14) {
        /*
            r8 = this;
            boolean r0 = r13 instanceof a.w7u
            if (r0 == 0) goto L14
            r0 = r13
            a.w7u r0 = (a.w7u) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.n = r1
        L12:
            r13 = r0
            goto L1a
        L14:
            a.w7u r0 = new a.w7u
            r0.<init>(r8, r13)
            goto L12
        L1a:
            java.lang.Object r0 = r13.l
            a.wne r1 = a.wne.f39444a
            int r2 = r13.n
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2d
            a.z1x.P(r0)
            return r0
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            r8 = 0
            return r8
        L34:
            boolean r14 = r13.k
            long r11 = r13.j
            long r9 = r13.i
            a.z1x.P(r0)
            goto L64
        L3e:
            a.z1x.P(r0)
            r6 = 40
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 != 0) goto L4f
            r6 = 0
            int r0 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r0 <= 0) goto L6f
        L4d:
            r3 = r5
            goto L6f
        L4f:
            java.lang.Object r0 = r8.c
            a.bbw0 r0 = (a.bbw0) r0
            a.iun r2 = a.iun.f15405a
            r13.i = r9
            r13.j = r11
            r13.k = r14
            r13.n = r5
            java.lang.Object r0 = r0.p(r9, r13, r2)
            if (r0 != r1) goto L64
            goto L83
        L64:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L4d
            if (r14 == 0) goto L6f
            goto L4d
        L6f:
            if (r3 == 0) goto L85
            java.lang.Object r8 = r8.b
            a.iqi r8 = (a.iqi) r8
            r13.i = r9
            r13.j = r11
            r13.k = r14
            r13.n = r4
            java.lang.Object r8 = r8.e(r9, r11, r13)
            if (r8 != r1) goto L84
        L83:
            return r1
        L84:
            return r8
        L85:
            java.lang.Object r8 = r8.d
            a.ntu r8 = (a.ntu) r8
            java.lang.String r8 = r8.a()
            r8.getClass()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r8)
            java.lang.String r8 = "/static/svg/sports_v3/monochrome/"
            r11.append(r8)
            r11.append(r9)
            java.lang.String r8 = ".svg"
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.khf0.C(long, long, a.zje, boolean):java.lang.Object");
    }

    public Object D(sgb sgbVar, zje zjeVar) {
        if (!((m1e) this.d).c()) {
            return Unit.f46060a;
        }
        yje yjeVar = null;
        Object objV = iom0.v(new gv60(this, sgbVar, yjeVar, (byte) 7), new hr(sgbVar, this, yjeVar, (byte) 25), new hhb0(this, yjeVar, (byte) 4), new gvb0(this, sgbVar, (byte) 21), new ir((Object) this, (Object) sgbVar, yjeVar, (byte) 26), khf0.class, zjeVar);
        return objV == wne.f39444a ? objV : Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:112:0x0208  */
    /* JADX WARN: Code duplicated, block: B:114:0x020c  */
    /* JADX WARN: Code duplicated, block: B:116:0x020f  */
    /* JADX WARN: Code duplicated, block: B:122:0x021e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0232  */
    /* JADX WARN: Code duplicated, block: B:147:0x01ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x0201 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:? A[LOOP:2: B:105:0x01e5->B:162:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0144  */
    /* JADX WARN: Code duplicated, block: B:70:0x0150  */
    /* JADX WARN: Code duplicated, block: B:86:0x018d  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:99:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v30, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r12v31, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r12v35, types: [java.util.ArrayList] */
    public Object E(zje zjeVar) {
        smt smtVar;
        long jB;
        wwt wwtVar;
        n0o0 n0o0Var;
        mz60 mz60Var;
        gis gisVar;
        String str;
        gis gisVar2;
        String str2;
        ?? arrayList;
        String str3;
        String str4;
        Iterator it;
        Object next;
        pbv pbvVar;
        gis gisVar3;
        String str5;
        String str6;
        gis gisVar4;
        List list;
        Iterator it2;
        pbv pbvVar2;
        Object objC = null;
        final byte b = 1;
        switch (this.f18289a) {
            case 21:
                if (zjeVar instanceof smt) {
                    smtVar = (smt) zjeVar;
                    int i = smtVar.k;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        smtVar.k = i - Integer.MIN_VALUE;
                    } else {
                        smtVar = new smt(this, zjeVar);
                    }
                } else {
                    smtVar = new smt(this, zjeVar);
                }
                Object objG = smtVar.i;
                Object obj = wne.f39444a;
                int i2 = smtVar.k;
                if (i2 == 0) {
                    z1x.P(objG);
                    jB = ((p4u) this.b).b();
                    if (jB == 0) {
                        if (((gqt) this.c).f11749a.a()) {
                            khf0 khf0Var = (khf0) this.d;
                            bm5 bm5Var = bm5.i;
                            smtVar.k = 1;
                            objG = G(khf0Var, bm5Var, smtVar);
                            if (objG == obj) {
                                return obj;
                            }
                        } else {
                            jB = 0;
                        }
                    }
                    return new Long(jB);
                }
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objG);
                jB = ((ql5) objG).f28916a;
                return new Long(jB);
            default:
                if (zjeVar instanceof wwt) {
                    wwtVar = (wwt) zjeVar;
                    int i3 = wwtVar.l;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        wwtVar.l = i3 - Integer.MIN_VALUE;
                    } else {
                        wwtVar = new wwt(this, zjeVar);
                    }
                } else {
                    wwtVar = new wwt(this, zjeVar);
                }
                Object objV = wwtVar.j;
                wne wneVar = wne.f39444a;
                int i4 = wwtVar.l;
                final byte b2 = 2;
                String str7 = "";
                if (i4 == 0) {
                    z1x.P(objV);
                    nr nrVar = (nr) this.c;
                    wwtVar.l = 1;
                    objV = nrVar.v(wwtVar);
                    if (objV != wneVar) {
                    }
                    return wneVar;
                }
                if (i4 == 1) {
                    z1x.P(objV);
                } else {
                    if (i4 != 2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    n0o0Var = wwtVar.i;
                    z1x.P(objV);
                }
                it = ((Iterable) objV).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        pbvVar2 = (pbv) next;
                        if (!pbvVar2.p || !pbvVar2.q || x1x.D(pbvVar2.e) == s470.LUCKY_WHEEL.a()) {
                        }
                    } else {
                        next = null;
                    }
                }
                pbvVar = (pbv) next;
                if (pbvVar != null) {
                    mz60 mz60Var2 = new mz60(pbvVar, ((ntu) this.b).a());
                    for (Object obj2 : (List) n0o0Var.getValue()) {
                        gisVar4 = (gis) obj2;
                        list = pbvVar.b;
                        if (list != null || !list.isEmpty()) {
                            it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    continue;
                                } else if (Intrinsics.d(String.valueOf(((Number) it2.next()).intValue()), gisVar4.b)) {
                                    objC = obj2;
                                    gisVar3 = (gis) objC;
                                    if (gisVar3 != null || (str5 = gisVar3.b) == null) {
                                        str5 = "";
                                    }
                                    if (gisVar3 != null && (str6 = gisVar3.c) != null) {
                                        str7 = str6;
                                    }
                                    objC = kotlin.collections.a.c(new uab(mz60Var2, str5, str7));
                                }
                            }
                        }
                    }
                    gisVar3 = (gis) objC;
                    if (gisVar3 != null) {
                        str5 = "";
                    } else {
                        str5 = "";
                    }
                    if (gisVar3 != null) {
                        str7 = str6;
                    }
                    objC = kotlin.collections.a.c(new uab(mz60Var2, str5, str7));
                }
                if (objC == null) {
                    return iun.f15405a;
                }
                return objC;
                final List list2 = (List) objV;
                final byte b3 = 0;
                n0o0 n0o0VarB = maz.b(new Function0() { // from class: a.vwt
                    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean z;
                        byte b4 = b3;
                        Object obj3 = null;
                        byte b5 = 26;
                        byte b6 = 25;
                        khf0 khf0Var2 = this;
                        List list3 = list2;
                        switch (b4) {
                            case 0:
                                khf0Var2.getClass();
                                vls vlsVar = new vls(b6);
                                for (Object obj4 : list3) {
                                    if (((Boolean) vlsVar.invoke(obj4)).booleanValue()) {
                                        obj3 = obj4;
                                        return (gis) obj3;
                                    }
                                }
                                return (gis) obj3;
                            case 1:
                                khf0Var2.getClass();
                                vls vlsVar2 = new vls(b5);
                                for (Object obj5 : list3) {
                                    if (((Boolean) vlsVar2.invoke(obj5)).booleanValue()) {
                                        obj3 = obj5;
                                        return (gis) obj3;
                                    }
                                }
                                return (gis) obj3;
                            default:
                                khf0Var2.getClass();
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj6 : list3) {
                                    gis gisVar5 = (gis) obj6;
                                    gisVar5.getClass();
                                    if (((Boolean) new vls(b6).invoke(gisVar5)).booleanValue() || ((Boolean) new vls(b5).invoke(gisVar5)).booleanValue()) {
                                        z = false;
                                    } else {
                                        String str8 = gisVar5.b;
                                        str8.getClass();
                                        if (str8.length() == 0) {
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                    }
                                    if (z) {
                                        arrayList2.add(obj6);
                                    }
                                }
                                return arrayList2;
                        }
                    }
                });
                n0o0 n0o0VarB2 = maz.b(new Function0() { // from class: a.vwt
                    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean z;
                        byte b4 = b;
                        Object obj3 = null;
                        byte b5 = 26;
                        byte b6 = 25;
                        khf0 khf0Var2 = this;
                        List list3 = list2;
                        switch (b4) {
                            case 0:
                                khf0Var2.getClass();
                                vls vlsVar = new vls(b6);
                                for (Object obj4 : list3) {
                                    if (((Boolean) vlsVar.invoke(obj4)).booleanValue()) {
                                        obj3 = obj4;
                                        return (gis) obj3;
                                    }
                                }
                                return (gis) obj3;
                            case 1:
                                khf0Var2.getClass();
                                vls vlsVar2 = new vls(b5);
                                for (Object obj5 : list3) {
                                    if (((Boolean) vlsVar2.invoke(obj5)).booleanValue()) {
                                        obj3 = obj5;
                                        return (gis) obj3;
                                    }
                                }
                                return (gis) obj3;
                            default:
                                khf0Var2.getClass();
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj6 : list3) {
                                    gis gisVar5 = (gis) obj6;
                                    gisVar5.getClass();
                                    if (((Boolean) new vls(b6).invoke(gisVar5)).booleanValue() || ((Boolean) new vls(b5).invoke(gisVar5)).booleanValue()) {
                                        z = false;
                                    } else {
                                        String str8 = gisVar5.b;
                                        str8.getClass();
                                        if (str8.length() == 0) {
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                    }
                                    if (z) {
                                        arrayList2.add(obj6);
                                    }
                                }
                                return arrayList2;
                        }
                    }
                });
                n0o0 n0o0VarB3 = maz.b(new Function0() { // from class: a.vwt
                    /* JADX WARN: Code duplicated, block: B:15:0x005a  */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        boolean z;
                        byte b4 = b2;
                        Object obj3 = null;
                        byte b5 = 26;
                        byte b6 = 25;
                        khf0 khf0Var2 = this;
                        List list3 = list2;
                        switch (b4) {
                            case 0:
                                khf0Var2.getClass();
                                vls vlsVar = new vls(b6);
                                for (Object obj4 : list3) {
                                    if (((Boolean) vlsVar.invoke(obj4)).booleanValue()) {
                                        obj3 = obj4;
                                        return (gis) obj3;
                                    }
                                }
                                return (gis) obj3;
                            case 1:
                                khf0Var2.getClass();
                                vls vlsVar2 = new vls(b5);
                                for (Object obj5 : list3) {
                                    if (((Boolean) vlsVar2.invoke(obj5)).booleanValue()) {
                                        obj3 = obj5;
                                        return (gis) obj3;
                                    }
                                }
                                return (gis) obj3;
                            default:
                                khf0Var2.getClass();
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj6 : list3) {
                                    gis gisVar5 = (gis) obj6;
                                    gisVar5.getClass();
                                    if (((Boolean) new vls(b6).invoke(gisVar5)).booleanValue() || ((Boolean) new vls(b5).invoke(gisVar5)).booleanValue()) {
                                        z = false;
                                    } else {
                                        String str8 = gisVar5.b;
                                        str8.getClass();
                                        if (str8.length() == 0) {
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                    }
                                    if (z) {
                                        arrayList2.add(obj6);
                                    }
                                }
                                return arrayList2;
                        }
                    }
                });
                if (y((gis) n0o0VarB.getValue())) {
                    gis gisVar5 = (gis) n0o0VarB.getValue();
                    if (gisVar5 != null) {
                        List list3 = gisVar5.f11364a;
                        arrayList = new ArrayList();
                        for (Object obj3 : list3) {
                            mz60 mz60Var3 = (mz60) obj3;
                            mz60Var3.getClass();
                            if (!mz60Var3.e && mz60Var3.f && x1x.D(mz60Var3.b) != s470.LUCKY_WHEEL.a()) {
                                arrayList.add(obj3);
                            }
                        }
                    } else {
                        arrayList = iun.f15405a;
                    }
                    ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                    for (mz60 mz60Var4 : arrayList) {
                        gis gisVar6 = (gis) n0o0VarB.getValue();
                        if (gisVar6 == null || (str3 = gisVar6.b) == null) {
                            str3 = "";
                        }
                        gis gisVar7 = (gis) n0o0VarB.getValue();
                        if (gisVar7 == null || (str4 = gisVar7.c) == null) {
                            str4 = "";
                        }
                        arrayList2.add(new uab(mz60Var4, str3, str4));
                    }
                    return arrayList2;
                }
                if (y((gis) n0o0VarB2.getValue())) {
                    gis gisVar8 = (gis) n0o0VarB2.getValue();
                    if (gisVar8 != null) {
                        for (Object obj4 : gisVar8.f11364a) {
                            mz60 mz60Var5 = (mz60) obj4;
                            mz60Var5.getClass();
                            if (!mz60Var5.e && mz60Var5.f && x1x.D(mz60Var5.b) != s470.LUCKY_WHEEL.a()) {
                                objC = obj4;
                                mz60Var = (mz60) objC;
                                if (mz60Var != null) {
                                    gisVar = (gis) n0o0VarB2.getValue();
                                    if (gisVar != null || (str = gisVar.b) == null) {
                                        str = "";
                                    }
                                    gisVar2 = (gis) n0o0VarB2.getValue();
                                    if (gisVar2 != null && (str2 = gisVar2.c) != null) {
                                        str7 = str2;
                                    }
                                    return kotlin.collections.a.c(new uab(mz60Var, str, str7));
                                }
                            }
                        }
                        mz60Var = (mz60) objC;
                        if (mz60Var != null) {
                            gisVar = (gis) n0o0VarB2.getValue();
                            if (gisVar != null) {
                                str = "";
                            } else {
                                str = "";
                            }
                            gisVar2 = (gis) n0o0VarB2.getValue();
                            if (gisVar2 != null) {
                                str7 = str2;
                            }
                            return kotlin.collections.a.c(new uab(mz60Var, str, str7));
                        }
                    }
                    return iun.f15405a;
                }
                lbu lbuVar = (lbu) this.d;
                wwtVar.i = n0o0VarB3;
                wwtVar.l = 2;
                Serializable serializableK = lbu.k(lbuVar, 0, wwtVar, 3);
                if (serializableK != wneVar) {
                    n0o0Var = n0o0VarB3;
                    objV = serializableK;
                    it = ((Iterable) objV).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            pbvVar2 = (pbv) next;
                            if (!pbvVar2.p) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    pbvVar = (pbv) next;
                    if (pbvVar != null) {
                        mz60 mz60Var6 = new mz60(pbvVar, ((ntu) this.b).a());
                        while (r11.hasNext()) {
                            gisVar4 = (gis) obj2;
                            list = pbvVar.b;
                            if (list != null) {
                            }
                            it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    continue;
                                } else if (Intrinsics.d(String.valueOf(((Number) it2.next()).intValue()), gisVar4.b)) {
                                    objC = obj2;
                                    gisVar3 = (gis) objC;
                                    if (gisVar3 != null) {
                                        str5 = "";
                                    } else {
                                        str5 = "";
                                    }
                                    if (gisVar3 != null) {
                                        str7 = str6;
                                    }
                                    objC = kotlin.collections.a.c(new uab(mz60Var6, str5, str7));
                                }
                            }
                        }
                        gisVar3 = (gis) objC;
                        if (gisVar3 != null) {
                            str5 = "";
                        } else {
                            str5 = "";
                        }
                        if (gisVar3 != null) {
                            str7 = str6;
                        }
                        objC = kotlin.collections.a.c(new uab(mz60Var6, str5, str7));
                    }
                    if (objC == null) {
                        return iun.f15405a;
                    }
                    return objC;
                }
                return wneVar;
        }
    }

    public boolean F() {
        return (((ztt) this.c).a().f4905a.f3145a.b() && (((b6s) ((a7q) this.b).f384a).f2070a.f332a == hg8.f13005a) && (((vcu) this.d).a() == vrs.f37917a)) ? false : true;
    }

    public boolean H(int i, int i2, int i3, int i4) {
        if (i < 0) {
            i += i3;
            i2 += 4 - ((i3 + 4) & 7);
        }
        if (i2 < 0) {
            i2 += i4;
            i += 4 - ((i4 + 4) & 7);
        }
        if (i >= i3) {
            i -= i3;
        }
        ((r68) this.c).h(i2, i);
        return ((r68) this.b).b(i2, i);
    }

    public int I(int i, int i2, int i3, int i4) {
        int i5 = i - 2;
        int i6 = i2 - 2;
        int i7 = (H(i5, i6, i3, i4) ? 1 : 0) << 1;
        int i8 = i2 - 1;
        if (H(i5, i8, i3, i4)) {
            i7 |= 1;
        }
        int i9 = i7 << 1;
        int i10 = i - 1;
        if (H(i10, i6, i3, i4)) {
            i9 |= 1;
        }
        int i11 = i9 << 1;
        if (H(i10, i8, i3, i4)) {
            i11 |= 1;
        }
        int i12 = i11 << 1;
        if (H(i10, i2, i3, i4)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (H(i, i6, i3, i4)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (H(i, i8, i3, i4)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        return H(i, i2, i3, i4) ? i15 | 1 : i15;
    }

    public void J(Fragment fragment, iiy iiyVar, Parcelable parcelable) {
        fragment.getClass();
        iiyVar.getClass();
        parcelable.getClass();
        Bundle bundle = fragment.g;
        if (bundle == null) {
            bundle = new Bundle();
            fragment.s0(bundle);
        }
        bundle.putParcelable((String) this.b, parcelable);
        this.d = parcelable;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(String str, fr frVar, zje zjeVar) throws Throwable {
        u5p u5pVar;
        Object g0g0Var;
        Integer num;
        if (zjeVar instanceof u5p) {
            u5pVar = (u5p) zjeVar;
            int i = u5pVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                u5pVar.k = i - Integer.MIN_VALUE;
            } else {
                u5pVar = new u5p(this, zjeVar);
            }
        } else {
            u5pVar = new u5p(this, zjeVar);
        }
        Object obj = u5pVar.i;
        wne wneVar = wne.f39444a;
        int i2 = u5pVar.k;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                e0g0 e0g0Var = j0g0.b;
                a1d a1dVar = (a1d) this.b;
                u5pVar.k = 1;
                Object objC = ((x5p) ((wgn) a1dVar.b).invoke()).c(str, frVar, u5pVar);
                if (objC != wneVar) {
                    objC = Unit.f46060a;
                }
                if (objC == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
            g0g0Var = Unit.f46060a;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA == null) {
            return Unit.f46060a;
        }
        if (!(thA instanceof zhi0)) {
            throw thA;
        }
        zhi0 zhi0Var = (zhi0) thA;
        uhi0 uhi0Var = zhi0Var.d;
        int iIntValue = (uhi0Var == null || (num = uhi0Var.c) == null) ? zhi0Var.f44396a : num.intValue();
        if (iIntValue == 409) {
            throw new ozn0();
        }
        if (iIntValue != 422) {
            throw zhi0Var;
        }
        String message = zhi0Var.getMessage();
        if (message == null) {
            message = "";
        }
        throw new n7p(message);
    }

    @Override // a.b4w0
    public jzj b(float f, pot0 pot0Var) {
        pot0Var.getClass();
        Rect rect = (Rect) this.d;
        if (Math.abs(f) < ((double) Math.ulp(Math.abs(f))) * 2.0d) {
            if (l8x.j0()) {
                Log.w("CXCP", "ZoomCompat: Invalid zoom ratio of 0.0f passed in, defaulting to 1.0f");
            }
            f = 1.0f;
        }
        float fWidth = rect.width() / f;
        float fHeight = rect.height() / f;
        float fWidth2 = (rect.width() - fWidth) / 2.0f;
        float fHeight2 = (rect.height() - fHeight) / 2.0f;
        Rect rect2 = new Rect((int) fWidth2, (int) fHeight2, (int) (fWidth2 + fWidth), (int) (fHeight2 + fHeight));
        this.c = rect2;
        return pot0.c(pot0Var, wp20.b(new Pair(CaptureRequest.SCALER_CROP_REGION, rect2)));
    }

    @Override // a.b4w0
    public float c() {
        c1a c1aVar = ((l1a) this.b).b;
        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM;
        key.getClass();
        Object objValueOf = Float.valueOf(1.0f);
        ow9 ow9Var = (ow9) c1aVar;
        ow9Var.getClass();
        Object objC = ow9Var.c(key);
        if (objC != null) {
            objValueOf = objC;
        }
        Float f = (Float) objValueOf;
        float fFloatValue = f.floatValue();
        if (Math.abs(fFloatValue) >= ((double) Math.ulp(Math.abs(fFloatValue))) * 2.0d) {
            return f.floatValue();
        }
        if (l8x.j0()) {
            Log.w("CXCP", "Invalid max zoom ratio of " + f + " detected, defaulting to 1.0f");
        }
        return 1.0f;
    }

    public qog0 d() {
        String[] strArr = (String[]) this.b;
        if (strArr == null) {
            jf4.o("The permissions names are necessary.");
            return null;
        }
        ugf0 ugf0Var = (ugf0) this.c;
        if (ugf0Var == null) {
            jf4.o("A runtime handler is necessary to request the permissions.");
            return null;
        }
        androidx.fragment.app.e eVar = (androidx.fragment.app.e) ugf0Var.f35622a;
        Fragment fragmentJ = eVar.J("KPermissionsFragment");
        s2g0 s2g0Var = fragmentJ instanceof s2g0 ? (s2g0) fragmentJ : null;
        if (s2g0Var == null) {
            s2g0Var = new s2g0();
            zb5 zb5Var = new zb5(eVar);
            zb5Var.k(0, s2g0Var, "KPermissionsFragment", 1);
            zb5Var.g(true, true);
        }
        return new qog0((Activity) this.d, strArr, s2g0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(int i, zje zjeVar, ynb0 ynb0Var) {
        iqn iqnVar;
        if (zjeVar instanceof iqn) {
            iqnVar = (iqn) zjeVar;
            int i2 = iqnVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iqnVar.k = i2 - Integer.MIN_VALUE;
            } else {
                iqnVar = new iqn(this, zjeVar);
            }
        } else {
            iqnVar = new iqn(this, zjeVar);
        }
        Object obj = iqnVar.i;
        wne wneVar = wne.f39444a;
        int i3 = iqnVar.k;
        if (i3 == 0) {
            z1x.P(obj);
            cad cadVar = (cad) this.d;
            String strA = ((btt0) this.c).a();
            String strA2 = ((knf0) this.b).a();
            wqn wqnVar = new wqn(new drn(i), ynb0Var.b, ynb0Var.f42933a);
            iqnVar.k = 1;
            if (((ppn) ((wgn) cadVar.b).invoke()).b(strA, strA2, wqnVar, iqnVar) == wneVar) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object f(zje zjeVar, ynb0 ynb0Var, String str) {
        jqn jqnVar;
        fqn fqnVar;
        List list;
        Object next;
        knf0 knf0Var = (knf0) this.b;
        if (zjeVar instanceof jqn) {
            jqnVar = (jqn) zjeVar;
            int i = jqnVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                jqnVar.k = i - Integer.MIN_VALUE;
            } else {
                jqnVar = new jqn(this, zjeVar);
            }
        } else {
            jqnVar = new jqn(this, zjeVar);
        }
        Object objA = jqnVar.i;
        wne wneVar = wne.f39444a;
        int i2 = jqnVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            cad cadVar = (cad) this.d;
            String strA = ((btt0) this.c).a();
            String strA2 = knf0Var.a();
            pqn pqnVar = new pqn(new wpn(str), ynb0Var.b, ynb0Var.f42933a, knf0Var.c());
            jqnVar.k = 1;
            objA = ((ppn) ((wgn) cadVar.b).invoke()).a(strA, strA2, pqnVar, jqnVar);
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
        bqn bqnVar = ((sqn) ((q16) objA).a()).c;
        if (bqnVar == null || (list = bqnVar.f3039a) == null) {
            fqnVar = null;
        } else {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.d(((fqn) next).b, "Login"));
            fqnVar = (fqn) next;
        }
        boolean z = (bqnVar != null ? bqnVar.f3039a : null) == null;
        String str2 = fqnVar != null ? fqnVar.f9984a : null;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = fqnVar != null ? fqnVar.b : null;
        return new ypb(z, str2, str3 != null ? str3 : "");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object g(ynb0 ynb0Var, int i, int i2, int i3, int i4, int i5, zje zjeVar) {
        kqn kqnVar;
        if (zjeVar instanceof kqn) {
            kqnVar = (kqn) zjeVar;
            int i6 = kqnVar.k;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                kqnVar.k = i6 - Integer.MIN_VALUE;
            } else {
                kqnVar = new kqn(this, zjeVar);
            }
        } else {
            kqnVar = new kqn(this, zjeVar);
        }
        Object obj = kqnVar.i;
        wne wneVar = wne.f39444a;
        int i7 = kqnVar.k;
        if (i7 == 0) {
            z1x.P(obj);
            cad cadVar = (cad) this.d;
            String strA = ((btt0) this.c).a();
            String strA2 = ((knf0) this.b).a();
            wqn wqnVar = new wqn(new grn(i, i2, i3, i4, i5), ynb0Var.b, ynb0Var.f42933a);
            kqnVar.k = 1;
            if (((ppn) ((wgn) cadVar.b).invoke()).b(strA, strA2, wqnVar, kqnVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i7 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(int i, zje zjeVar, ynb0 ynb0Var) {
        lqn lqnVar;
        if (zjeVar instanceof lqn) {
            lqnVar = (lqn) zjeVar;
            int i2 = lqnVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lqnVar.k = i2 - Integer.MIN_VALUE;
            } else {
                lqnVar = new lqn(this, zjeVar);
            }
        } else {
            lqnVar = new lqn(this, zjeVar);
        }
        Object obj = lqnVar.i;
        wne wneVar = wne.f39444a;
        int i3 = lqnVar.k;
        if (i3 == 0) {
            z1x.P(obj);
            cad cadVar = (cad) this.d;
            String strA = ((btt0) this.c).a();
            String strA2 = ((knf0) this.b).a();
            wqn wqnVar = new wqn(new zqn(i), ynb0Var.b, ynb0Var.f42933a);
            lqnVar.k = 1;
            if (((ppn) ((wgn) cadVar.b).invoke()).b(strA, strA2, wqnVar, lqnVar) == wneVar) {
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

    @Override // a.b4w0
    public jzj i(pot0 pot0Var) {
        pot0Var.getClass();
        List listC = kotlin.collections.a.c(CaptureRequest.SCALER_CROP_REGION);
        oot0 oot0Var = oot0.f25610a;
        return pot0Var.j(listC);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:107|30|(1:32)(1:33)) */
    /* JADX WARN: Code duplicated, block: B:107:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cd A[Catch: all -> 0x00df, TRY_LEAVE, TryCatch #2 {all -> 0x00df, blocks: (B:30:0x009c, B:33:0x00cd), top: B:107:0x009c }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e9 A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:14:0x0040, B:36:0x00d3, B:74:0x016a, B:75:0x0171, B:76:0x0172, B:40:0x00e1, B:43:0x00e9, B:44:0x00f2, B:48:0x00fc, B:50:0x0100, B:55:0x011f, B:57:0x0129, B:59:0x012f, B:63:0x0137, B:65:0x013b, B:70:0x0158, B:72:0x0161, B:19:0x0062, B:27:0x008f), top: B:104:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f2 A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:14:0x0040, B:36:0x00d3, B:74:0x016a, B:75:0x0171, B:76:0x0172, B:40:0x00e1, B:43:0x00e9, B:44:0x00f2, B:48:0x00fc, B:50:0x0100, B:55:0x011f, B:57:0x0129, B:59:0x012f, B:63:0x0137, B:65:0x013b, B:70:0x0158, B:72:0x0161, B:19:0x0062, B:27:0x008f), top: B:104:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:50:0x0100 A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:14:0x0040, B:36:0x00d3, B:74:0x016a, B:75:0x0171, B:76:0x0172, B:40:0x00e1, B:43:0x00e9, B:44:0x00f2, B:48:0x00fc, B:50:0x0100, B:55:0x011f, B:57:0x0129, B:59:0x012f, B:63:0x0137, B:65:0x013b, B:70:0x0158, B:72:0x0161, B:19:0x0062, B:27:0x008f), top: B:104:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x011a  */
    /* JADX WARN: Code duplicated, block: B:55:0x011f A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:14:0x0040, B:36:0x00d3, B:74:0x016a, B:75:0x0171, B:76:0x0172, B:40:0x00e1, B:43:0x00e9, B:44:0x00f2, B:48:0x00fc, B:50:0x0100, B:55:0x011f, B:57:0x0129, B:59:0x012f, B:63:0x0137, B:65:0x013b, B:70:0x0158, B:72:0x0161, B:19:0x0062, B:27:0x008f), top: B:104:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0129 A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:14:0x0040, B:36:0x00d3, B:74:0x016a, B:75:0x0171, B:76:0x0172, B:40:0x00e1, B:43:0x00e9, B:44:0x00f2, B:48:0x00fc, B:50:0x0100, B:55:0x011f, B:57:0x0129, B:59:0x012f, B:63:0x0137, B:65:0x013b, B:70:0x0158, B:72:0x0161, B:19:0x0062, B:27:0x008f), top: B:104:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x012f A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:14:0x0040, B:36:0x00d3, B:74:0x016a, B:75:0x0171, B:76:0x0172, B:40:0x00e1, B:43:0x00e9, B:44:0x00f2, B:48:0x00fc, B:50:0x0100, B:55:0x011f, B:57:0x0129, B:59:0x012f, B:63:0x0137, B:65:0x013b, B:70:0x0158, B:72:0x0161, B:19:0x0062, B:27:0x008f), top: B:104:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0134  */
    /* JADX WARN: Code duplicated, block: B:62:0x0136  */
    /* JADX WARN: Code duplicated, block: B:65:0x013b A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:14:0x0040, B:36:0x00d3, B:74:0x016a, B:75:0x0171, B:76:0x0172, B:40:0x00e1, B:43:0x00e9, B:44:0x00f2, B:48:0x00fc, B:50:0x0100, B:55:0x011f, B:57:0x0129, B:59:0x012f, B:63:0x0137, B:65:0x013b, B:70:0x0158, B:72:0x0161, B:19:0x0062, B:27:0x008f), top: B:104:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0158 A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:14:0x0040, B:36:0x00d3, B:74:0x016a, B:75:0x0171, B:76:0x0172, B:40:0x00e1, B:43:0x00e9, B:44:0x00f2, B:48:0x00fc, B:50:0x0100, B:55:0x011f, B:57:0x0129, B:59:0x012f, B:63:0x0137, B:65:0x013b, B:70:0x0158, B:72:0x0161, B:19:0x0062, B:27:0x008f), top: B:104:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x015e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0161 A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:14:0x0040, B:36:0x00d3, B:74:0x016a, B:75:0x0171, B:76:0x0172, B:40:0x00e1, B:43:0x00e9, B:44:0x00f2, B:48:0x00fc, B:50:0x0100, B:55:0x011f, B:57:0x0129, B:59:0x012f, B:63:0x0137, B:65:0x013b, B:70:0x0158, B:72:0x0161, B:19:0x0062, B:27:0x008f), top: B:104:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0168 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x016a A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:14:0x0040, B:36:0x00d3, B:74:0x016a, B:75:0x0171, B:76:0x0172, B:40:0x00e1, B:43:0x00e9, B:44:0x00f2, B:48:0x00fc, B:50:0x0100, B:55:0x011f, B:57:0x0129, B:59:0x012f, B:63:0x0137, B:65:0x013b, B:70:0x0158, B:72:0x0161, B:19:0x0062, B:27:0x008f), top: B:104:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0172 A[Catch: all -> 0x0173, TRY_LEAVE, TryCatch #0 {all -> 0x0173, blocks: (B:14:0x0040, B:36:0x00d3, B:74:0x016a, B:75:0x0171, B:76:0x0172, B:40:0x00e1, B:43:0x00e9, B:44:0x00f2, B:48:0x00fc, B:50:0x0100, B:55:0x011f, B:57:0x0129, B:59:0x012f, B:63:0x0137, B:65:0x013b, B:70:0x0158, B:72:0x0161, B:19:0x0062, B:27:0x008f), top: B:104:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cf, code lost:
    
        if (r0 == r3) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d9, code lost:
    
        r18 = r8;
        r8 = r0;
        r0 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00df, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00e9 -> B:29:0x009a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0161 -> B:69:0x0156). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(a.zje r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.khf0.j(a.zje):java.lang.Object");
    }

    @Override // a.b4w0
    public float k() {
        return 1.0f;
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        view.getClass();
        View view2 = (View) this.b;
        view2.onApplyWindowInsets(xiv0Var.g());
        nw5 nw5Var = (nw5) this.c;
        View view3 = (View) this.d;
        view3.post(new pb90(view3, xiv0Var, view2, nw5Var, (byte) 1));
        return xiv0.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object m(String str, x4k x4kVar, zje zjeVar) throws Throwable {
        w5p w5pVar;
        Object g0g0Var;
        Object value;
        Object iapVar;
        Integer num;
        if (zjeVar instanceof w5p) {
            w5pVar = (w5p) zjeVar;
            int i = w5pVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                w5pVar.l = i - Integer.MIN_VALUE;
            } else {
                w5pVar = new w5p(this, zjeVar);
            }
        } else {
            w5pVar = new w5p(this, zjeVar);
        }
        Object obj = w5pVar.j;
        wne wneVar = wne.f39444a;
        int i2 = w5pVar.l;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                e0g0 e0g0Var = j0g0.b;
                a1d a1dVar = (a1d) this.b;
                w5pVar.i = x4kVar;
                w5pVar.l = 1;
                Object objA = ((x5p) ((wgn) a1dVar.b).invoke()).a(str, x4kVar, w5pVar);
                if (objA != wneVar) {
                    objA = Unit.f46060a;
                }
                if (objA == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                x4kVar = w5pVar.i;
                z1x.P(obj);
            }
            g0g0Var = Unit.f46060a;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA == null) {
            return Unit.f46060a;
        }
        abp abpVar = (abp) this.c;
        List listC = kotlin.collections.a.c(new Long(x4kVar.f40268a));
        abpVar.getClass();
        listC.getClass();
        p7m0 p7m0Var = abpVar.d;
        do {
            value = p7m0Var.getValue();
            iapVar = (kap) value;
            if (iapVar instanceof iap) {
                Iterable iterable = (Iterable) ((iap) iapVar).f14449a;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : iterable) {
                    if (!listC.contains(Long.valueOf(((i5p) obj2).f14203a))) {
                        arrayList.add(obj2);
                    }
                }
                iapVar = new iap(arrayList);
            }
        } while (!p7m0Var.m(value, iapVar));
        if (!(thA instanceof zhi0)) {
            throw thA;
        }
        zhi0 zhi0Var = (zhi0) thA;
        uhi0 uhi0Var = zhi0Var.d;
        int iIntValue = (uhi0Var == null || (num = uhi0Var.c) == null) ? zhi0Var.f44396a : num.intValue();
        if (iIntValue == 409) {
            throw new ozn0();
        }
        if (iIntValue != 422) {
            throw zhi0Var;
        }
        String message = zhi0Var.getMessage();
        if (message == null) {
            message = "";
        }
        throw new n7p(message);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v5 */
    public Object o(hqn hqnVar, ynb0 ynb0Var, m2c0 m2c0Var, zje zjeVar) {
        mqn mqnVar;
        String strF;
        String strF2;
        List<fqn> list;
        knf0 knf0Var = (knf0) this.b;
        if (zjeVar instanceof mqn) {
            mqnVar = (mqn) zjeVar;
            int i = mqnVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                mqnVar.k = i - Integer.MIN_VALUE;
            } else {
                mqnVar = new mqn(this, zjeVar);
            }
        } else {
            mqnVar = new mqn(this, zjeVar);
        }
        Object objA = mqnVar.i;
        wne wneVar = wne.f39444a;
        int i2 = mqnVar.k;
        ?? arrayList = 0;
        arrayList = 0;
        if (i2 == 0) {
            z1x.P(objA);
            hqnVar.getClass();
            m2c0Var.getClass();
            String str = m2c0Var.U.length() == 0 ? hqnVar.f13492a : "";
            String str2 = m2c0Var.V.length() == 0 ? hqnVar.b : "";
            String str3 = m2c0Var.f21050a.length() == 0 ? hqnVar.c : "";
            Long l = hqnVar.d;
            if (m2c0Var.b.length() != 0 || l == null) {
                strF = "";
            } else {
                rdj rdjVar = rdj.f30294a;
                ynq0 ynq0Var = new ynq0(l.longValue());
                sdj sdjVar = sdj.UNIQUE_10;
                Locale locale = Locale.US;
                locale.getClass();
                strF = rdj.f(ynq0Var, sdjVar, locale, 16);
            }
            String str4 = m2c0Var.t.length() == 0 ? hqnVar.e : "";
            int i3 = hqnVar.g;
            if (m2c0Var.g > 0 || i3 < 0) {
                i3 = 0;
            }
            Integer numValueOf = Integer.valueOf(i3);
            int i4 = hqnVar.f;
            Integer intOrNull = StringsKt.toIntOrNull(m2c0Var.c);
            int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
            if (i4 <= 0) {
                i4 = iIntValue < 0 ? 0 : iIntValue;
            }
            Integer numValueOf2 = Integer.valueOf(i4);
            int i5 = hqnVar.h;
            if (m2c0Var.d > 0 || i5 < 0) {
                i5 = 0;
            }
            Integer numValueOf3 = Integer.valueOf(i5);
            int i6 = hqnVar.i;
            if (m2c0Var.F > 0 || i6 < 0) {
                i6 = 0;
            }
            Integer numValueOf4 = Integer.valueOf(i6);
            String str5 = m2c0Var.w.length() == 0 ? hqnVar.j : "";
            String str6 = m2c0Var.x.length() == 0 ? hqnVar.k : "";
            Long l2 = hqnVar.l;
            if (m2c0Var.y.length() != 0 || l2 == null) {
                strF2 = "";
            } else {
                rdj rdjVar2 = rdj.f30294a;
                ynq0 ynq0Var2 = new ynq0(l2.longValue());
                sdj sdjVar2 = sdj.UNIQUE_10;
                Locale locale2 = Locale.US;
                locale2.getClass();
                strF2 = rdj.f(ynq0Var2, sdjVar2, locale2, 16);
            }
            String str7 = m2c0Var.z.length() == 0 ? hqnVar.m : "";
            String str8 = m2c0Var.u.length() == 0 ? hqnVar.n : "";
            String str9 = m2c0Var.H.length() == 0 ? hqnVar.o : "";
            String str10 = m2c0Var.d0.length() == 0 ? hqnVar.p : "";
            int i7 = hqnVar.q;
            if (m2c0Var.s > 0 || i7 < 0) {
                i7 = 0;
            }
            tpn tpnVar = new tpn(str, str2, str3, strF, str4, numValueOf, numValueOf2, numValueOf3, numValueOf4, str5, str6, strF2, str7, str8, str9, str10, Integer.valueOf(i7));
            cad cadVar = (cad) this.d;
            String strA = ((btt0) this.c).a();
            String strA2 = knf0Var.a();
            pqn pqnVar = new pqn(tpnVar, ynb0Var.b, ynb0Var.f42933a, knf0Var.c());
            mqnVar.k = 1;
            objA = ((ppn) ((wgn) cadVar.b).invoke()).a(strA, strA2, pqnVar, mqnVar);
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
        sqn sqnVar = (sqn) ((q16) objA).a();
        String str11 = sqnVar.f32637a;
        if (str11 == null) {
            str11 = "";
        }
        Integer num = sqnVar.b;
        int iIntValue2 = num != null ? num.intValue() : 0;
        bqn bqnVar = sqnVar.c;
        if (bqnVar != null && (list = bqnVar.f3039a) != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (fqn fqnVar : list) {
                fqnVar.getClass();
                String str12 = fqnVar.f9984a;
                if (str12 == null) {
                    str12 = "";
                }
                String str13 = fqnVar.b;
                if (str13 == null) {
                    str13 = "";
                }
                arrayList.add(new cqn(str12, str13));
            }
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        return new gqn(str11, iIntValue2, new ypn(arrayList));
    }

    public Object p(int i, zje zjeVar, String str, boolean z) {
        m2c0 m2c0VarA = ((x2c0) this.c).a();
        String str2 = m2c0VarA != null ? m2c0VarA.c : null;
        if (str2 == null) {
            str2 = "";
        }
        LinkedHashMap linkedHashMapH = xp20.h(new Pair("fcountry", Integer.valueOf(i)), new Pair("lng", str), new Pair("ref", 1), new Pair("gr", 1357), new Pair("whence", 22));
        if (str2.length() > 0) {
            linkedHashMapH.put("country", str2);
        }
        if (z) {
            linkedHashMapH.put("test", Boolean.valueOf(z));
        }
        return ((cq0) ((nc) this.d).invoke()).b(linkedHashMapH, new fk9(false), zjeVar);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0167  */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    public Serializable q(List list, zje zjeVar) {
        zcb zcbVar;
        Throwable th;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        Object g0g0Var;
        LinkedHashMap linkedHashMap3;
        Pair pair;
        String str;
        Object next;
        xcb xcbVar = (xcb) this.d;
        if (zjeVar instanceof zcb) {
            zcbVar = (zcb) zjeVar;
            int i = zcbVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                zcbVar.m = i - Integer.MIN_VALUE;
            } else {
                zcbVar = new zcb(this, zjeVar);
            }
        } else {
            zcbVar = new zcb(this, zjeVar);
        }
        zcb zcbVar2 = zcbVar;
        Object objA = zcbVar2.k;
        wne wneVar = wne.f39444a;
        int i2 = zcbVar2.m;
        if (i2 == 0) {
            z1x.P(objA);
            xcbVar.getClass();
            list.getClass();
            ConcurrentHashMap concurrentHashMap = xcbVar.f40637a;
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                if (list.contains(Long.valueOf(((Number) entry.getKey()).longValue()))) {
                    linkedHashMap4.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (!linkedHashMap4.containsKey(new Long(((Number) obj).longValue()))) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                for (Map.Entry entry2 : linkedHashMap4.entrySet()) {
                    if (((String) entry2.getValue()).length() > 0) {
                        linkedHashMap5.put(entry2.getKey(), entry2.getValue());
                    }
                }
                return linkedHashMap5;
            }
            lnf0 lnf0VarD = ((knf0) this.b).d();
            try {
                e0g0 e0g0Var = j0g0.b;
                try {
                    xex xexVar = (xex) this.c;
                    int i3 = lnf0VarD.b;
                    zcbVar2.i = linkedHashMap4;
                    zcbVar2.j = arrayList2;
                    zcbVar2.m = 1;
                    objA = xexVar.A(1, 1357, i3, 22, arrayList2, zcbVar2);
                    if (objA == wneVar) {
                        return wneVar;
                    }
                    arrayList = arrayList2;
                    linkedHashMap2 = linkedHashMap4;
                } catch (Throwable th2) {
                    th = th2;
                    arrayList = arrayList2;
                    linkedHashMap = linkedHashMap4;
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                    linkedHashMap3 = linkedHashMap;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = zcbVar2.j;
            linkedHashMap2 = zcbVar2.i;
            try {
                z1x.P(objA);
                linkedHashMap2 = linkedHashMap2;
            } catch (Throwable th4) {
                th = th4;
                linkedHashMap = linkedHashMap2;
                e0g0 e0g0Var3 = j0g0.b;
                g0g0Var = new g0g0(th);
                linkedHashMap3 = linkedHashMap;
            }
        }
        g0g0Var = (List) objA;
        e0g0 e0g0Var4 = j0g0.b;
        linkedHashMap3 = linkedHashMap2;
        if (!(g0g0Var instanceof g0g0)) {
            List list2 = (List) g0g0Var;
            ArrayList arrayListU = twn.u(list2);
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                cdb cdbVar = (cdb) it.next();
                Long l = cdbVar.f4153a;
                if (l != null) {
                    List list3 = cdbVar.b;
                    if (list3 != null) {
                        Iterator it2 = list3.iterator();
                        do {
                            if (!it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                        } while (!Intrinsics.d(((mcb) next).f21542a, "champIcon"));
                        mcb mcbVar = (mcb) next;
                        if (mcbVar != null) {
                            str = mcbVar.b;
                        } else {
                            str = null;
                        }
                    } else {
                        str = null;
                    }
                    pair = new Pair(l, str != null ? str : "");
                } else {
                    pair = null;
                }
                if (pair != null) {
                    arrayListU.add(pair);
                }
            }
            Map mapM = xp20.m(arrayListU);
            int iA = wp20.a(r3d.q(arrayList, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap6 = new LinkedHashMap(iA);
            for (Object obj2 : arrayList) {
                String str2 = (String) mapM.get(new Long(((Number) obj2).longValue()));
                if (str2 == null) {
                    str2 = "";
                }
                linkedHashMap6.put(obj2, str2);
            }
            xcbVar.getClass();
            xcbVar.f40637a.putAll(linkedHashMap6);
            g0g0Var = xp20.j(linkedHashMap6, linkedHashMap3);
        }
        Object obj3 = linkedHashMap3;
        if (!(g0g0Var instanceof g0g0)) {
            obj3 = g0g0Var;
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        for (Map.Entry entry3 : ((Map) obj3).entrySet()) {
            if (((String) entry3.getValue()).length() > 0) {
                linkedHashMap7.put(entry3.getKey(), entry3.getValue());
            }
        }
        return linkedHashMap7;
    }

    @Override // a.b4w0
    public Rect r() {
        Rect rect = (Rect) this.c;
        return rect == null ? (Rect) this.d : rect;
    }

    public String s(long j) {
        String str = (String) ((ave) this.c).j.get(Long.valueOf(j));
        return str == null ? "" : str;
    }

    public vzc t() {
        Object next;
        q7d0 q7d0Var = (q7d0) this.d;
        vzc[] vzcVarArr = vzc.b;
        int iC = ua80.c(q7d0Var, "COEF_TYPE_ID", 3);
        Iterator it = vzc.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((vzc) next).f38290a != iC);
        vzc vzcVar = (vzc) next;
        if (vzcVar != null) {
            return vzcVar;
        }
        throw new ss3();
    }

    public rs00 u() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((j6m0) this.d)) {
            try {
                rs00 rs00Var = (rs00) this.c;
                if (rs00Var != null && localeList == ((LocaleList) this.b)) {
                    return rs00Var;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new qs00(localeList.get(i)));
                }
                rs00 rs00Var2 = new rs00(arrayList);
                this.b = localeList;
                this.c = rs00Var2;
                return rs00Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:45|136|46|127|47|48|125|49|50|(1:53)) */
    /* JADX WARN: Can't wrap try/catch for region: R(12:(1:(1:(3:13|14|15)(2:18|19))(4:20|21|22|94))(4:23|129|24|25)|134|54|55|122|56|(2:59|57)|140|62|(2:131|63)|119|120) */
    /* JADX WARN: Can't wrap try/catch for region: R(13:(1:(1:(3:13|14|15)(2:18|19))(4:20|21|22|94))(4:23|129|24|25)|134|54|55|122|56|(2:59|57)|140|62|131|63|119|120) */
    /* JADX WARN: Code duplicated, block: B:100:0x0251  */
    /* JADX WARN: Code duplicated, block: B:103:0x0256 A[Catch: all -> 0x01f2, TryCatch #0 {all -> 0x01f2, blocks: (B:76:0x01e2, B:79:0x01ea, B:83:0x01f5, B:87:0x0201, B:89:0x0205, B:93:0x0230, B:95:0x0240, B:97:0x0246, B:101:0x0252, B:103:0x0256, B:107:0x0283, B:109:0x0294), top: B:121:0x01e2 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x027f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0283 A[Catch: all -> 0x01f2, TryCatch #0 {all -> 0x01f2, blocks: (B:76:0x01e2, B:79:0x01ea, B:83:0x01f5, B:87:0x0201, B:89:0x0205, B:93:0x0230, B:95:0x0240, B:97:0x0246, B:101:0x0252, B:103:0x0256, B:107:0x0283, B:109:0x0294), top: B:121:0x01e2 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0294 A[Catch: all -> 0x01f2, TRY_LEAVE, TryCatch #0 {all -> 0x01f2, blocks: (B:76:0x01e2, B:79:0x01ea, B:83:0x01f5, B:87:0x0201, B:89:0x0205, B:93:0x0230, B:95:0x0240, B:97:0x0246, B:101:0x0252, B:103:0x0256, B:107:0x0283, B:109:0x0294), top: B:121:0x01e2 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:113:0x02a4 A[Catch: all -> 0x02ac, TRY_ENTER, TryCatch #7 {all -> 0x02ac, blocks: (B:113:0x02a4, B:114:0x02ab, B:117:0x02b0), top: B:133:0x02a2 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x02b0 A[Catch: all -> 0x02ac, TRY_LEAVE, TryCatch #7 {all -> 0x02ac, blocks: (B:113:0x02a4, B:114:0x02ab, B:117:0x02b0), top: B:133:0x02a2 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0136  */
    /* JADX WARN: Code duplicated, block: B:53:0x016e  */
    /* JADX WARN: Code duplicated, block: B:59:0x019d A[Catch: all -> 0x01b3, LOOP:0: B:57:0x0197->B:59:0x019d, LOOP_END, TryCatch #1 {all -> 0x01b3, blocks: (B:56:0x018c, B:57:0x0197, B:59:0x019d, B:62:0x01bf), top: B:122:0x018c }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x01ea A[Catch: all -> 0x01f2, TryCatch #0 {all -> 0x01f2, blocks: (B:76:0x01e2, B:79:0x01ea, B:83:0x01f5, B:87:0x0201, B:89:0x0205, B:93:0x0230, B:95:0x0240, B:97:0x0246, B:101:0x0252, B:103:0x0256, B:107:0x0283, B:109:0x0294), top: B:121:0x01e2 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f5 A[Catch: all -> 0x01f2, TryCatch #0 {all -> 0x01f2, blocks: (B:76:0x01e2, B:79:0x01ea, B:83:0x01f5, B:87:0x0201, B:89:0x0205, B:93:0x0230, B:95:0x0240, B:97:0x0246, B:101:0x0252, B:103:0x0256, B:107:0x0283, B:109:0x0294), top: B:121:0x01e2 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:86:0x0200  */
    /* JADX WARN: Code duplicated, block: B:89:0x0205 A[Catch: all -> 0x01f2, TryCatch #0 {all -> 0x01f2, blocks: (B:76:0x01e2, B:79:0x01ea, B:83:0x01f5, B:87:0x0201, B:89:0x0205, B:93:0x0230, B:95:0x0240, B:97:0x0246, B:101:0x0252, B:103:0x0256, B:107:0x0283, B:109:0x0294), top: B:121:0x01e2 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x022d  */
    /* JADX WARN: Code duplicated, block: B:92:0x022e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0230 A[Catch: all -> 0x01f2, TryCatch #0 {all -> 0x01f2, blocks: (B:76:0x01e2, B:79:0x01ea, B:83:0x01f5, B:87:0x0201, B:89:0x0205, B:93:0x0230, B:95:0x0240, B:97:0x0246, B:101:0x0252, B:103:0x0256, B:107:0x0283, B:109:0x0294), top: B:121:0x01e2 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0240 A[Catch: all -> 0x01f2, TryCatch #0 {all -> 0x01f2, blocks: (B:76:0x01e2, B:79:0x01ea, B:83:0x01f5, B:87:0x0201, B:89:0x0205, B:93:0x0230, B:95:0x0240, B:97:0x0246, B:101:0x0252, B:103:0x0256, B:107:0x0283, B:109:0x0294), top: B:121:0x01e2 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0246 A[Catch: all -> 0x01f2, TryCatch #0 {all -> 0x01f2, blocks: (B:76:0x01e2, B:79:0x01ea, B:83:0x01f5, B:87:0x0201, B:89:0x0205, B:93:0x0230, B:95:0x0240, B:97:0x0246, B:101:0x0252, B:103:0x0256, B:107:0x0283, B:109:0x0294), top: B:121:0x01e2 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x024f  */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01b3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01b4, code lost:
    
        r1 = r14;
        r2 = r15;
        r15 = r16;
        r14 = r11;
        r18 = r5;
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01cd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01d1, code lost:
    
        r2 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01d4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01d5, code lost:
    
        r3 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01d8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d9, code lost:
    
        r3 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01de, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01df, code lost:
    
        r23 = r2;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x023c -> B:44:0x0134). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object v(long r24, a.zje r26, java.lang.String r27) {
        /*
            Method dump skipped, instruction units count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.khf0.v(long, a.zje, java.lang.String):java.lang.Object");
    }

    @Override // a.nae0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Parcelable n(Fragment fragment, iiy iiyVar) {
        fragment.getClass();
        iiyVar.getClass();
        Parcelable parcelable = (Parcelable) this.d;
        if (parcelable != null) {
            return parcelable;
        }
        Bundle bundle = fragment.g;
        Parcelable parcelable2 = bundle != null ? bundle.getParcelable((String) this.b) : null;
        this.d = parcelable2;
        if (parcelable2 != null) {
            return parcelable2;
        }
        Parcelable parcelable3 = (Parcelable) this.c;
        if (parcelable3 != null) {
            return parcelable3;
        }
        jf4.o("Returning value can not be null. Please, specify non null default value");
        return null;
    }

    public boolean x() {
        vzw vzwVar;
        IconCompat iconCompat;
        if (((pyu) this.d).a("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = (FirebaseMessagingService) this.c;
        boolean z = false;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        if (runningAppProcessInfo.importance != 100) {
                            break;
                        }
                        return false;
                    }
                }
            }
        }
        String strF = ((pyu) this.d).f("gcm.n.image");
        if (TextUtils.isEmpty(strF)) {
            vzwVar = null;
        } else {
            try {
                vzwVar = new vzw(new URL(strF));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + strF);
                vzwVar = null;
            }
        }
        if (vzwVar != null) {
            ExecutorService executorService = (ExecutorService) this.b;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            vzwVar.b = executorService.submit(new llo(vzwVar, taskCompletionSource, (byte) 10));
            vzwVar.c = taskCompletionSource.getTask();
        }
        xex xexVarA = w9d.a((FirebaseMessagingService) this.c, (pyu) this.d);
        g760 g760Var = (g760) xexVarA.f40764a;
        if (vzwVar != null) {
            try {
                Task task = vzwVar.c;
                s0x.H(task);
                Bitmap bitmap = (Bitmap) Tasks.await(task, 5L, TimeUnit.SECONDS);
                g760Var.d(bitmap);
                e760 e760Var = new e760((byte) 7, z);
                if (bitmap == null) {
                    iconCompat = null;
                } else {
                    iconCompat = new IconCompat(1);
                    iconCompat.b = bitmap;
                }
                e760Var.c = iconCompat;
                e760Var.d = null;
                e760Var.e = true;
                g760Var.f(e760Var);
            } catch (InterruptedException unused2) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                vzwVar.close();
                Thread.currentThread().interrupt();
            } catch (ExecutionException e2) {
                Log.w("FirebaseMessaging", "Failed to download image: " + e2.getCause());
            } catch (TimeoutException unused3) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                vzwVar.close();
            }
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) ((FirebaseMessagingService) this.c).getSystemService(RemoteMessageConst.NOTIFICATION)).notify((String) xexVarA.b, 0, ((g760) xexVarA.f40764a).a());
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00da A[LOOP:0: B:36:0x00d4->B:38:0x00da, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable z(int i, zje zjeVar, List list) {
        iou iouVar;
        LinkedHashMap linkedHashMap;
        if (zjeVar instanceof iou) {
            iouVar = (iou) zjeVar;
            int i2 = iouVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iouVar.k = i2 - Integer.MIN_VALUE;
            } else {
                iouVar = new iou(this, zjeVar);
            }
        } else {
            iouVar = new iou(this, zjeVar);
        }
        Object objJ = iouVar.i;
        wne wneVar = wne.f39444a;
        int i3 = iouVar.k;
        if (i3 == 0) {
            z1x.P(objJ);
            jou jouVar = new jou(list, this, i, ((ntu) this.c).a(), ((pru) this.d).a(), null);
            iouVar.k = 1;
            objJ = d5c.J(iouVar, jouVar);
            if (objJ == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objJ);
        }
        Map map = (Map) objJ;
        Collection collectionValues = map.values();
        if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
            linkedHashMap = new LinkedHashMap(wp20.a(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                Object obj = ((j0g0) entry.getValue()).f15681a;
                z1x.P(obj);
                linkedHashMap.put(key, (List) obj);
            }
        } else {
            Iterator it = collectionValues.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashMap = new LinkedHashMap(wp20.a(map.size()));
                    while (r12.hasNext()) {
                        Object key2 = entry.getKey();
                        Object obj2 = ((j0g0) entry.getValue()).f15681a;
                        z1x.P(obj2);
                        linkedHashMap.put(key2, (List) obj2);
                    }
                } else if (!(((j0g0) it.next()).f15681a instanceof g0g0)) {
                    linkedHashMap = new LinkedHashMap(wp20.a(map.size()));
                    for (Map.Entry entry2 : map.entrySet()) {
                        Object key3 = entry2.getKey();
                        Object obj3 = ((j0g0) entry2.getValue()).f15681a;
                        if (j0g0.a(obj3) != null) {
                            obj3 = iun.f15405a;
                        }
                        linkedHashMap.put(key3, (List) obj3);
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            arrayList.add(new nza0((vh0) entry3.getKey(), fza0.c, (List) entry3.getValue()));
        }
        return arrayList;
    }

    public khf0(art artVar, iqi iqiVar, bbw0 bbw0Var, ntu ntuVar) {
        this.f18289a = (byte) 25;
        this.b = iqiVar;
        this.c = bbw0Var;
        this.d = ntuVar;
    }

    public khf0(Activity activity) {
        this.f18289a = (byte) 12;
        this.d = activity;
    }

    public khf0(knf0 knf0Var, xex xexVar, xcb xcbVar) {
        this.f18289a = (byte) 9;
        knf0Var.getClass();
        xcbVar.getClass();
        this.b = knf0Var;
        this.c = xexVar;
        this.d = xcbVar;
    }

    public khf0(m0o0 m0o0Var, khf0 khf0Var, m1e m1eVar) {
        this.f18289a = (byte) 0;
        m1eVar.getClass();
        this.b = m0o0Var;
        this.c = khf0Var;
        this.d = m1eVar;
    }

    public khf0(Parcelable parcelable, String str) {
        this.f18289a = (byte) 7;
        this.b = str;
        this.c = parcelable;
    }

    public khf0(String str) {
        this.f18289a = (byte) 7;
        this.b = str;
        this.c = null;
    }

    public khf0(m1e m1eVar, dn0 dn0Var, mne mneVar) {
        this.f18289a = (byte) 2;
        m1eVar.getClass();
        dn0Var.getClass();
        this.d = m1eVar;
        this.b = dn0Var;
        this.c = mneVar;
    }

    public khf0(gii0 gii0Var, x2c0 x2c0Var) {
        this.f18289a = (byte) 3;
        gii0Var.getClass();
        x2c0Var.getClass();
        this.b = gii0Var;
        this.c = x2c0Var;
        this.d = new nc((Object) this, (byte) 10);
    }

    public khf0(xex xexVar, yk50 yk50Var, vby vbyVar) {
        this.f18289a = (byte) 8;
        vbyVar.getClass();
        this.b = xexVar;
        this.c = yk50Var;
        this.d = vbyVar;
    }

    public khf0(sb6 sb6Var, uzc uzcVar, gst0 gst0Var) {
        this.f18289a = (byte) 22;
        gst0Var.getClass();
        this.b = sb6Var;
        this.c = uzcVar;
        this.d = gst0Var;
    }

    public khf0(a1d a1dVar, abp abpVar, btt0 btt0Var) {
        this.f18289a = (byte) 19;
        abpVar.getClass();
        btt0Var.getClass();
        this.b = a1dVar;
        this.c = abpVar;
        this.d = btt0Var;
    }

    public khf0(mne mneVar, nmo nmoVar, knf0 knf0Var) {
        this.f18289a = (byte) 20;
        knf0Var.getClass();
        this.b = mneVar;
        this.c = nmoVar;
        this.d = knf0Var;
    }

    public khf0(lye lyeVar, ave aveVar, q7d0 q7d0Var) {
        this.f18289a = (byte) 11;
        lyeVar.getClass();
        aveVar.getClass();
        q7d0Var.getClass();
        this.b = lyeVar;
        this.c = aveVar;
        this.d = q7d0Var;
    }

    public khf0(p6t p6tVar, gst0 gst0Var, viu viuVar) {
        this.f18289a = (byte) 26;
        p6tVar.getClass();
        gst0Var.getClass();
        this.b = p6tVar;
        this.c = gst0Var;
        this.d = viuVar;
    }

    public khf0(a7q a7qVar, ztt zttVar, vcu vcuVar) {
        this.f18289a = (byte) 10;
        zttVar.getClass();
        vcuVar.getClass();
        this.b = a7qVar;
        this.c = zttVar;
        this.d = vcuVar;
    }

    public khf0(knf0 knf0Var, btt0 btt0Var, cad cadVar) {
        this.f18289a = (byte) 18;
        knf0Var.getClass();
        btt0Var.getClass();
        this.b = knf0Var;
        this.c = btt0Var;
        this.d = cadVar;
    }

    public khf0(Drawable.Callback callback, String str, Map map) {
        this.f18289a = (byte) 1;
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.c = str.concat(Separators.SLASH);
        } else {
            this.c = str;
        }
        this.d = map;
        if (!(callback instanceof View)) {
            this.b = null;
        } else {
            this.b = ((View) callback).getContext().getApplicationContext();
        }
    }

    public khf0() {
        this.f18289a = (byte) 4;
        this.d = new j6m0((byte) 9);
    }

    public /* synthetic */ khf0(Object obj, Object obj2, Object obj3, byte b) {
        this.f18289a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public khf0(FirebaseMessagingService firebaseMessagingService, pyu pyuVar, ExecutorService executorService) {
        this.f18289a = (byte) 17;
        this.b = executorService;
        this.c = firebaseMessagingService;
        this.d = pyuVar;
    }

    public khf0(cad cadVar, ii iiVar, Size size) {
        this.f18289a = (byte) 14;
        this.b = cadVar;
        this.c = size;
        this.d = n0k0.a(new pai(this, (byte) 5));
    }

    public khf0(mne mneVar, azj0 azj0Var, vby vbyVar) {
        this.f18289a = (byte) 15;
        this.b = azj0Var;
        this.c = mneVar;
        this.d = vbyVar;
    }

    public khf0(l1a l1aVar) {
        this.f18289a = (byte) 13;
        this.b = l1aVar;
        c1a c1aVar = l1aVar.b;
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        key.getClass();
        Object objC = ((ow9) c1aVar).c(key);
        objC.getClass();
        this.d = (Rect) objC;
    }

    public khf0(u34[] u34VarArr) {
        this.f18289a = (byte) 16;
        muj0 muj0Var = new muj0();
        muj0Var.m = 0;
        muj0Var.o = 0;
        muj0Var.p = 0;
        byte[] bArr = vtt0.b;
        muj0Var.n = bArr;
        muj0Var.q = bArr;
        zkk0 zkk0Var = new zkk0();
        zkk0Var.b = 1.0f;
        zkk0Var.c = 1.0f;
        q34 q34Var = q34.e;
        zkk0Var.d = q34Var;
        zkk0Var.e = q34Var;
        zkk0Var.f = q34Var;
        zkk0Var.g = q34Var;
        ByteBuffer byteBuffer = u34.f34978a;
        zkk0Var.j = byteBuffer;
        zkk0Var.k = byteBuffer;
        u34[] u34VarArr2 = new u34[u34VarArr.length + 2];
        this.b = u34VarArr2;
        System.arraycopy(u34VarArr, 0, u34VarArr2, 0, u34VarArr.length);
        this.c = muj0Var;
        this.d = zkk0Var;
        u34VarArr2[u34VarArr.length] = muj0Var;
        u34VarArr2[u34VarArr.length + 1] = zkk0Var;
    }
}
