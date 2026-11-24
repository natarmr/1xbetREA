package a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.p000firebaseauthapi.zzaia;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.StringsKt;
import org.xplatform.bethistory.sale.presentation.SaleDataModel;

/* JADX INFO: loaded from: classes.dex */
public final class xzp implements lry, ngw0 {
    public static final int[] h = {1, 3, 7};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f41764a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public final Object g;

    public xzp(Context context) {
        String string;
        String str = ((x25) m2a.f1.n(context)).f40150a;
        this.f41764a = str;
        File filesDir = context.getFilesDir();
        this.b = filesDir;
        if (str.isEmpty()) {
            string = ".com.google.firebase.crashlytics.files.v1";
        } else {
            StringBuilder sb = new StringBuilder(".crashlytics.v3");
            sb.append(File.separator);
            sb.append(str.length() > 40 ? aad.W(str) : str.replaceAll("[^a-zA-Z0-9.]", BundleUtil.UNDERLINE_TAG));
            string = sb.toString();
        }
        File file = new File(filesDir, string);
        S(file);
        this.c = file;
        File file2 = new File(file, "open-sessions");
        S(file2);
        this.d = file2;
        File file3 = new File(file, "reports");
        S(file3);
        this.e = file3;
        File file4 = new File(file, "priority-reports");
        S(file4);
        this.f = file4;
        File file5 = new File(file, "native-reports");
        S(file5);
        this.g = file5;
    }

    public static String R(nu20 nu20Var) {
        return dw9.o(nu20Var.b, nu20Var.d);
    }

    public static synchronized void S(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                file.delete();
            }
            if (!file.mkdirs()) {
                Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static boolean T(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                T(file2);
            }
        }
        return file.delete();
    }

    public static List V(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    public static Object z(xzp xzpVar, jo20 jo20Var, String str, zje zjeVar) {
        return ((bx0) ((il1) xzpVar.d).invoke()).g(jo20Var, str, new fk9(false), zjeVar);
    }

    public Object A(long j, Integer num, String str, List list, List list2, String str2, int i, boolean z, int i2, int i3, boolean z2, String str3, zje zjeVar) {
        return ((bx0) ((il1) this.d).invoke()).f(gkb.f0(j, i, num, str, str3, i3, i2, z2, z, list, list2, str2), new fk9(false), zjeVar);
    }

    public rpt B() {
        return new rpt(new clc((fjj) this.g));
    }

    public r9u C() {
        return new r9u((j1q0) this.f41764a);
    }

    public abu D() {
        return new abu((b3c0) this.e, (gst0) this.f);
    }

    public bzu E() {
        return new bzu((qj9) ((n5d0) this.g).get());
    }

    public ljf0 F() {
        return new ljf0((g1q0) this.f);
    }

    public File G(String str, String str2) {
        File file = new File((File) this.d, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public pmi0 H() {
        return new pmi0(new clc((fjj) this.g));
    }

    public msu I() {
        return new msu((mne) this.c, (sjl0) this.d);
    }

    public hcp0 J() {
        return new hcp0((j1q0) this.f41764a, (xaq0) this.d, new j6m0(new y2m0((byte) 18), new s2m0(), (us3) ((bxi) ((bxi) this.e).b).b));
    }

    public nj50 K(xhe0 xhe0Var) {
        nj50 nj50Var = (nj50) ((IdentityHashMap) this.d).get(xhe0Var);
        if (nj50Var != null) {
            return nj50Var;
        }
        c99.n("Cannot find wrapper for ", xhe0Var, ", seems like it is not bound by this adapter: ", this);
        return null;
    }

    public reu L() {
        return new reu(new cih((q7d0) this.c, (byte) 2), (byte) 28);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object M(long j, kgz kgzVar, zje zjeVar) {
        kxt kxtVar;
        if (zjeVar instanceof kxt) {
            kxtVar = (kxt) zjeVar;
            int i = kxtVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                kxtVar.m = i - Integer.MIN_VALUE;
            } else {
                kxtVar = new kxt(this, zjeVar);
            }
        } else {
            kxtVar = new kxt(this, zjeVar);
        }
        kxt kxtVar2 = kxtVar;
        Object objA = kxtVar2.k;
        wne wneVar = wne.f39444a;
        int i2 = kxtVar2.m;
        if (i2 == 0) {
            z1x.P(objA);
            j3c j3cVar = (j3c) this.f41764a;
            kxtVar2.j = kgzVar;
            kxtVar2.i = j;
            kxtVar2.m = 1;
            objA = j3cVar.a(189L, -1L, kxtVar2);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = kxtVar2.i;
            kgzVar = kxtVar2.j;
            z1x.P(objA);
        }
        long j2 = j;
        ypl0 ypl0Var = (ypl0) objA;
        yje yjeVar = null;
        return dub.e0(new vsg0(new n1((Object) this, j2, yjeVar, (byte) 10)), t(j2, sip.c, ypl0Var), t(j2, sip.b, ypl0Var), new vsg0(new o3s((Object) this, (Object) kgzVar, yjeVar, (byte) 4)), new lxt(ypl0Var, yjeVar, (byte) 0));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x014c  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object N(m0k0 m0k0Var, zxj0 zxj0Var, gwe gweVar, zje zjeVar) {
        ykf0 ykf0Var;
        m0k0 m0k0Var2;
        boolean z;
        qu6 qu6Var;
        m0k0 m0k0Var3;
        long j;
        long j2;
        String strB;
        String str;
        String str2;
        String strA;
        Object objA;
        String str3;
        String str4;
        String str5;
        long j3;
        long j4;
        String str6;
        zxj0 zxj0Var2 = zxj0Var;
        if (zjeVar instanceof ykf0) {
            ykf0Var = (ykf0) zjeVar;
            int i = ykf0Var.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                ykf0Var.u = i - Integer.MIN_VALUE;
            } else {
                ykf0Var = new ykf0(this, zjeVar);
            }
        } else {
            ykf0Var = new ykf0(this, zjeVar);
        }
        Object obj = ykf0Var.s;
        wne wneVar = wne.f39444a;
        int i2 = ykf0Var.u;
        byte b = 1;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(obj);
            boolean zA = ((vn7) this.f41764a).f37705a.a();
            qu6 qu6VarA0 = o050.a0(m0k0Var, x8x.F(zxj0Var2, zA), gweVar, ((j9c) this.g).a(), null);
            h9c h9cVar = (h9c) this.d;
            long j5 = qu6VarA0.b;
            ykf0Var.i = m0k0Var;
            ykf0Var.j = zxj0Var2;
            ykf0Var.k = qu6VarA0;
            ykf0Var.p = zA;
            ykf0Var.u = 1;
            Object objT = h9cVar.f12667a.t(j5, ykf0Var);
            if (objT != wneVar) {
                m0k0Var2 = m0k0Var;
                z = zA;
                obj = objT;
                qu6Var = qu6VarA0;
            }
            return wneVar;
        }
        if (i2 == 1) {
            z = ykf0Var.p;
            qu6 qu6Var2 = ykf0Var.k;
            zxj0 zxj0Var3 = ykf0Var.j;
            m0k0Var2 = ykf0Var.i;
            z1x.P(obj);
            qu6Var = qu6Var2;
            zxj0Var2 = zxj0Var3;
        } else {
            if (i2 == 2) {
                z = ykf0Var.p;
                zxj0Var2 = ykf0Var.j;
                m0k0Var3 = ykf0Var.i;
                z1x.P(obj);
                ((ave) ((mpc) this.f).f22172a.c).b = 0L;
                j = m0k0Var3.f20959a;
                j2 = m0k0Var3.B;
                strB = m0k0Var3.b();
                str = zxj0Var2.e;
                str2 = zxj0Var2.c;
                strA = zxj0Var2.a(z);
                ik9 ik9Var = (ik9) this.c;
                ykf0Var.i = null;
                ykf0Var.j = null;
                ykf0Var.k = null;
                ykf0Var.l = strB;
                ykf0Var.m = str;
                ykf0Var.n = str2;
                ykf0Var.o = strA;
                ykf0Var.p = z;
                ykf0Var.q = j;
                ykf0Var.r = j2;
                ykf0Var.u = 3;
                objA = ik9Var.a(ykf0Var);
                if (objA != wneVar) {
                    str3 = strA;
                    str4 = strB;
                    str5 = str;
                    j3 = j;
                    j4 = j2;
                    str6 = str2;
                    obj = objA;
                }
                return wneVar;
            }
            if (i2 != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j6 = ykf0Var.r;
            long j7 = ykf0Var.q;
            String str7 = ykf0Var.o;
            String str8 = ykf0Var.n;
            String str9 = ykf0Var.m;
            String str10 = ykf0Var.l;
            z1x.P(obj);
            j4 = j6;
            str4 = str10;
            j3 = j7;
            str3 = str7;
            str6 = str8;
            str5 = str9;
        }
        return new vtd(j3, j4, str4, str5, str6, str3, ((Number) obj).doubleValue(), ((ppt) this.b).f27385a.t().f38290a);
        aot aotVar = (aot) this.e;
        qu6 qu6VarA = qu6.a(qu6Var, ((qu6) obj).f29333a, 0L, 0L, null, null, null, null, null, 0.0d, null, 0L, null, 0, null, -2);
        ykf0Var.i = m0k0Var2;
        ykf0Var.j = zxj0Var2;
        ykf0Var.k = null;
        ykf0Var.p = z;
        ykf0Var.u = 2;
        chf0 chf0Var = aotVar.f1218a;
        ou6 ou6Var = (ou6) chf0Var.c;
        pu6 pu6VarF0 = i120.f0(qu6VarA, (vby) chf0Var.b);
        ou6Var.getClass();
        Object objW0 = sj3.w0(ykf0Var, ou6Var.f25862a, new mu6(ou6Var, pu6VarF0, yjeVar, b), false, true);
        if (objW0 != wneVar) {
            objW0 = Unit.f46060a;
        }
        if (objW0 != wneVar) {
            objW0 = Unit.f46060a;
        }
        if (objW0 != wneVar) {
            objW0 = Unit.f46060a;
        }
        if (objW0 != wneVar) {
            m0k0Var3 = m0k0Var2;
            ((ave) ((mpc) this.f).f22172a.c).b = 0L;
            j = m0k0Var3.f20959a;
            j2 = m0k0Var3.B;
            strB = m0k0Var3.b();
            str = zxj0Var2.e;
            str2 = zxj0Var2.c;
            strA = zxj0Var2.a(z);
            ik9 ik9Var2 = (ik9) this.c;
            ykf0Var.i = null;
            ykf0Var.j = null;
            ykf0Var.k = null;
            ykf0Var.l = strB;
            ykf0Var.m = str;
            ykf0Var.n = str2;
            ykf0Var.o = strA;
            ykf0Var.p = z;
            ykf0Var.q = j;
            ykf0Var.r = j2;
            ykf0Var.u = 3;
            objA = ik9Var2.a(ykf0Var);
            if (objA != wneVar) {
                str3 = strA;
                str4 = strB;
                str5 = str;
                j3 = j;
                j4 = j2;
                str6 = str2;
                obj = objA;
                return new vtd(j3, j4, str4, str5, str6, str3, ((Number) obj).doubleValue(), ((ppt) this.b).f27385a.t().f38290a);
            }
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01f5, code lost:
    
        if (r0 == r1) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0214, code lost:
    
        if (r0 == r1) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x022c, code lost:
    
        if (r0 == r1) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [a.nmo] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [a.fht0] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Iterable, java.util.Collection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object O(java.util.List r27, long r28, long r30, a.q4f r32, int r33, boolean r34, a.zje r35) {
        /*
            Method dump skipped, instruction units count: 711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xzp.O(java.util.List, long, long, a.q4f, int, boolean, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object P(boolean z, zje zjeVar) {
        ac60 ac60Var;
        if (zjeVar instanceof ac60) {
            ac60Var = (ac60) zjeVar;
            int i = ac60Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ac60Var.k = i - Integer.MIN_VALUE;
            } else {
                ac60Var = new ac60(this, zjeVar);
            }
        } else {
            ac60Var = new ac60(this, zjeVar);
        }
        Object objX = ac60Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ac60Var.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objX);
            dgu dguVar = (dgu) this.f41764a;
            boolean z2 = ((pru) this.g).a().O1;
            ac60Var.k = 1;
            objX = dguVar.x(z, z2, ac60Var);
            if (objX == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objX);
        }
        return dub.e0((gmq) objX, ((ino) ((xfu) this.d).f40810a).f15084a.f27246a, ((h9c) this.b).a(), ((reu) this.c).a(), new lxt(this, yjeVar, (byte) 3));
    }

    /* JADX WARN: Code duplicated, block: B:109:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:112:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:114:0x03e0 A[Catch: all -> 0x0041, TRY_ENTER, TryCatch #1 {all -> 0x0041, blocks: (B:12:0x003c, B:135:0x04a3, B:17:0x0070, B:128:0x0437, B:131:0x0471, B:114:0x03e0, B:116:0x03e4), top: B:146:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x03e4 A[Catch: all -> 0x0041, TryCatch #1 {all -> 0x0041, blocks: (B:12:0x003c, B:135:0x04a3, B:17:0x0070, B:128:0x0437, B:131:0x0471, B:114:0x03e0, B:116:0x03e4), top: B:146:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x0418  */
    /* JADX WARN: Code duplicated, block: B:119:0x041a  */
    /* JADX WARN: Code duplicated, block: B:121:0x042c  */
    /* JADX WARN: Code duplicated, block: B:122:0x042e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0431  */
    /* JADX WARN: Code duplicated, block: B:125:0x0433  */
    /* JADX WARN: Code duplicated, block: B:127:0x0436  */
    /* JADX WARN: Code duplicated, block: B:130:0x045a  */
    /* JADX WARN: Code duplicated, block: B:134:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:140:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:162:0x01fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0200 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:43:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:46:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:58:0x0236  */
    /* JADX WARN: Code duplicated, block: B:60:0x0255  */
    /* JADX WARN: Code duplicated, block: B:61:0x0257  */
    /* JADX WARN: Code duplicated, block: B:63:0x025a  */
    /* JADX WARN: Code duplicated, block: B:64:0x025c  */
    /* JADX WARN: Code duplicated, block: B:66:0x025f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0262  */
    /* JADX WARN: Code duplicated, block: B:79:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    /* JADX WARN: Code duplicated, block: B:90:0x033f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v20 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v37 */
    public Object Q(boolean z, boolean z2, boolean z3, boolean z4, zje zjeVar) {
        iht0 iht0Var;
        Object g0g0Var;
        iun iunVar;
        boolean z5;
        Object obj;
        boolean z6;
        boolean z7;
        Object objB;
        boolean z8;
        boolean z9;
        List list;
        Object objB2;
        List list2;
        Object obj2;
        boolean z10;
        ?? r8;
        boolean z11;
        boolean z12;
        List list3;
        boolean zJ;
        int i;
        long j;
        boolean zA;
        List list4;
        List list5;
        ?? r12;
        long j2;
        boolean z13;
        List list6;
        boolean z14;
        boolean z15;
        Object objA;
        List list7;
        boolean z16;
        boolean z17;
        int i2;
        List list8;
        long j3;
        boolean z18;
        boolean z19;
        boolean z20;
        Object obj3;
        boolean z21;
        g45 g45Var;
        long j4;
        int i3;
        List list9;
        List list10;
        List list11;
        long j5;
        boolean z22;
        boolean z23;
        boolean z24;
        String str;
        boolean z25;
        boolean z26;
        int i4;
        int i5;
        List list12;
        long j6;
        boolean z27;
        boolean z28;
        ?? r2;
        boolean z29;
        boolean z30;
        boolean z31;
        ?? r4;
        boolean z32;
        List list13;
        boolean z33;
        int i6;
        boolean z34;
        long j7;
        iht0 iht0Var2;
        Object objA2;
        boolean z35;
        ?? r13;
        ?? r16;
        ?? r9;
        boolean z36;
        boolean z37;
        boolean z38;
        boolean z39;
        List list14;
        boolean z40;
        boolean z41;
        Object g0g0Var2;
        boolean z42;
        boolean z43;
        g45 g45Var2;
        List list15;
        boolean z44;
        int i7;
        int i8;
        List list16;
        long j8;
        long j9;
        boolean z45;
        boolean z46;
        String str2;
        boolean z47;
        boolean z48;
        boolean z49;
        Object objA3;
        boolean z50;
        boolean z51;
        int i9;
        long j10;
        int i10;
        boolean z52;
        int i11;
        int i12;
        int i13;
        ?? r14;
        iun iunVar2;
        boolean z53;
        Object obj4;
        boolean z54;
        ?? r3;
        Serializable serializableZ;
        boolean z55;
        boolean z56;
        b3c0 b3c0Var = (b3c0) this.g;
        gst0 gst0Var = (gst0) this.d;
        g45 g45Var3 = (g45) this.f41764a;
        lye lyeVar = (lye) g45Var3.f10647a;
        if (zjeVar instanceof iht0) {
            iht0Var = (iht0) zjeVar;
            int i14 = iht0Var.Y;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iht0Var.Y = i14 - Integer.MIN_VALUE;
            } else {
                iht0Var = new iht0(this, zjeVar);
            }
        } else {
            iht0Var = new iht0(this, zjeVar);
        }
        Object obj5 = iht0Var.A;
        wne wneVar = wne.f39444a;
        try {
            switch (iht0Var.Y) {
                case 0:
                    z1x.P(obj5);
                    zfo zfoVar = (zfo) this.b;
                    iht0Var.i = z;
                    z6 = z2;
                    iht0Var.j = z6;
                    iht0Var.k = z3;
                    z7 = z4;
                    iht0Var.l = z7;
                    iht0Var.Y = 1;
                    objB = zfoVar.b(iht0Var);
                    if (objB != wneVar) {
                        z8 = z;
                        z9 = z3;
                        list = (List) objB;
                        edo edoVar = (edo) this.c;
                        iht0Var.o = list;
                        iht0Var.i = z8;
                        iht0Var.j = z6;
                        iht0Var.k = z9;
                        iht0Var.l = z7;
                        iht0Var.Y = 2;
                        objB2 = edoVar.b(iht0Var);
                        if (objB2 != wneVar) {
                            boolean z57 = z7;
                            list2 = list;
                            obj2 = objB2;
                            z10 = z9;
                            r8 = z57;
                            z11 = z6;
                            z12 = z8;
                            list3 = (List) obj2;
                            zJ = ((j1q0) this.f).f15748a.j();
                            i = ((khf0) this.e).t().f38290a;
                            if (gst0Var.a() || !gst0Var.f()) {
                                j = -1;
                            } else {
                                j = gst0Var.f11847a.a().f18785a;
                            }
                            zA = gst0Var.a();
                            if (z12) {
                                try {
                                    e0g0 e0g0Var = j0g0.b;
                                    if (zA) {
                                        try {
                                            iht0Var.o = list2;
                                            iht0Var.p = list3;
                                            iht0Var.q = list3;
                                            iht0Var.r = list2;
                                            iht0Var.s = g45Var3;
                                            iht0Var.i = z12;
                                            iht0Var.j = z11;
                                            list6 = list3;
                                            z14 = z10;
                                            try {
                                                iht0Var.k = z14;
                                                iht0Var.l = r8;
                                                iht0Var.m = zJ;
                                                iht0Var.t = i;
                                                iht0Var.y = j;
                                                iht0Var.n = zA;
                                                iht0Var.u = r8;
                                                iht0Var.v = z14 ? 1 : 0;
                                                iht0Var.w = zJ ? 1 : 0;
                                                iht0Var.z = j;
                                                iht0Var.x = i;
                                                iht0Var.Y = 3;
                                                z10 = z14 ? 1 : 0;
                                                z15 = false;
                                                try {
                                                    objA = b3c0Var.a(false, iht0Var);
                                                    if (objA != wneVar) {
                                                        list7 = list6;
                                                        ?? r17 = r8;
                                                        z16 = r17 == true ? 1 : 0;
                                                        z17 = zJ ? 1 : 0;
                                                        i2 = i;
                                                        list8 = list2;
                                                        j3 = j;
                                                        z18 = z11;
                                                        z19 = z12;
                                                        z20 = z10 ? 1 : 0;
                                                        obj3 = objA;
                                                        z21 = zA;
                                                        g45Var = g45Var3;
                                                        j4 = j3;
                                                        i3 = z20 ? 1 : 0;
                                                        list9 = list7;
                                                        r9 = zJ;
                                                        r16 = r17;
                                                        if (r9 != 0) {
                                                            z36 = true;
                                                        } else {
                                                            z36 = z15;
                                                        }
                                                        if (i3 != 0) {
                                                            z37 = true;
                                                        } else {
                                                            z37 = z15;
                                                        }
                                                        if (r16 != 0) {
                                                            z38 = true;
                                                        } else {
                                                            z38 = z15;
                                                        }
                                                        try {
                                                            String str3 = ((m2c0) obj3).c;
                                                            list10 = list9;
                                                            list12 = list2;
                                                            i4 = i2;
                                                            list5 = list7;
                                                            j5 = j4;
                                                            z28 = z38;
                                                            str = str3;
                                                            list11 = list8;
                                                            i5 = i;
                                                            z25 = z21;
                                                            z26 = z36;
                                                            j6 = j3;
                                                            g45Var3 = g45Var3;
                                                            z32 = z17;
                                                            r4 = z16;
                                                            z24 = z37;
                                                            z23 = z20;
                                                            z27 = z19;
                                                            z22 = z18;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            wneVar = wneVar;
                                                            list2 = list8;
                                                            j2 = j3;
                                                            i = i2;
                                                            list5 = list7;
                                                            r12 = z16;
                                                            z11 = z18;
                                                            z12 = z19;
                                                            b3c0Var = b3c0Var;
                                                            g45Var3 = g45Var3;
                                                            iht0Var = iht0Var;
                                                            zA = z21;
                                                            z39 = z17;
                                                            z13 = z20;
                                                            list4 = null;
                                                            lyeVar = lyeVar;
                                                            e0g0 e0g0Var2 = j0g0.b;
                                                            g0g0Var2 = new g0g0(th);
                                                            list13 = list2;
                                                            z42 = z39;
                                                            r14 = r12;
                                                            iunVar2 = iun.f15405a;
                                                            z53 = g0g0Var2 instanceof g0g0;
                                                            obj4 = g0g0Var2;
                                                            if (z53) {
                                                                obj4 = iunVar2;
                                                            }
                                                            List list17 = (List) obj4;
                                                            list17.getClass();
                                                            lyeVar.getClass();
                                                            lyeVar = lyeVar;
                                                            ArrayList arrayList = lyeVar.e;
                                                            arrayList.clear();
                                                            arrayList.addAll(list17);
                                                            z29 = z42;
                                                            r2 = r14;
                                                            list2 = list13;
                                                            long j11 = j2;
                                                            z30 = z13;
                                                            j = j11;
                                                            z31 = zA;
                                                            z43 = z11;
                                                            if (z43) {
                                                                e0g0 e0g0Var3 = j0g0.b;
                                                                if (z31) {
                                                                    iht0Var.o = list4;
                                                                    iht0Var.p = list4;
                                                                    iht0Var.q = list5;
                                                                    iht0Var.r = list2;
                                                                    g45Var2 = g45Var3;
                                                                    iht0Var.s = g45Var2;
                                                                    iht0Var.i = z12;
                                                                    iht0Var.j = z43;
                                                                    iht0Var.k = z30;
                                                                    iht0Var.l = r2;
                                                                    iht0Var.m = z29;
                                                                    iht0Var.t = i;
                                                                    iht0Var.y = j;
                                                                    iht0Var.n = z31;
                                                                    iht0Var.u = r2 == true ? 1 : 0;
                                                                    iht0Var.v = z30 ? 1 : 0;
                                                                    iht0Var.w = z29 ? 1 : 0;
                                                                    iht0Var.z = j;
                                                                    iht0Var.x = i;
                                                                    iht0Var.Y = 5;
                                                                    z48 = r2 == true ? 1 : 0;
                                                                    z49 = false;
                                                                    objA3 = b3c0Var.a(false, iht0Var);
                                                                    if (objA3 == wneVar) {
                                                                        return wneVar;
                                                                    }
                                                                    z50 = z29 ? 1 : 0;
                                                                    z51 = z31;
                                                                    i9 = i;
                                                                    j10 = j;
                                                                    i10 = z48 ? 1 : 0;
                                                                    z52 = z43;
                                                                    i11 = z50 ? 1 : 0;
                                                                    i12 = z30 ? 1 : 0;
                                                                    i13 = i9;
                                                                    if (i11 != 0) {
                                                                        z55 = true;
                                                                    } else {
                                                                        z55 = z49;
                                                                    }
                                                                    if (i12 != 0) {
                                                                        z56 = true;
                                                                    } else {
                                                                        z56 = z49;
                                                                    }
                                                                    if (i10 != 0) {
                                                                        z49 = true;
                                                                    }
                                                                    boolean z58 = z12;
                                                                    z46 = z49;
                                                                    r3 = z48;
                                                                    str2 = ((m2c0) objA3).c;
                                                                    z45 = z58;
                                                                    i7 = i13;
                                                                    list15 = list5;
                                                                    z43 = z52;
                                                                    z44 = z56;
                                                                    list16 = list2;
                                                                    z54 = z50;
                                                                    i8 = i9;
                                                                    j8 = j10;
                                                                    j9 = j;
                                                                    z47 = z55;
                                                                    z31 = z51;
                                                                } else {
                                                                    boolean z59 = r2 == true ? 1 : 0;
                                                                    g45Var2 = g45Var3;
                                                                    list15 = list5;
                                                                    z44 = z30 ? 1 : 0;
                                                                    i7 = i;
                                                                    i8 = i7;
                                                                    list16 = list2;
                                                                    j8 = j;
                                                                    j9 = j8;
                                                                    z45 = z12;
                                                                    z46 = r2 == true ? 1 : 0;
                                                                    str2 = null;
                                                                    z47 = z29 ? 1 : 0;
                                                                    r3 = r2;
                                                                    z54 = z29;
                                                                }
                                                                iht0Var.o = null;
                                                                iht0Var.p = null;
                                                                iht0Var.q = null;
                                                                iht0Var.r = null;
                                                                iht0Var.s = null;
                                                                iht0Var.i = z45;
                                                                iht0Var.j = z43;
                                                                iht0Var.k = z30;
                                                                iht0Var.l = r3;
                                                                iht0Var.m = z54;
                                                                iht0Var.t = i8;
                                                                iht0Var.y = j8;
                                                                iht0Var.n = z31;
                                                                iht0Var.Y = 6;
                                                                long j12 = j9;
                                                                iht0 iht0Var3 = iht0Var;
                                                                serializableZ = g45Var2.z(i7, j12, list16, list15, z47, z44, z46, str2, iht0Var3);
                                                                if (serializableZ == wneVar) {
                                                                    return wneVar;
                                                                }
                                                                obj5 = serializableZ;
                                                                e0g0 e0g0Var4 = j0g0.b;
                                                                g0g0Var = (List) obj5;
                                                                iunVar = iun.f15405a;
                                                                z5 = g0g0Var instanceof g0g0;
                                                                obj = g0g0Var;
                                                                if (z5) {
                                                                    obj = iunVar;
                                                                }
                                                                List list18 = (List) obj;
                                                                list18.getClass();
                                                                lyeVar.getClass();
                                                                ArrayList arrayList2 = lyeVar.f;
                                                                arrayList2.clear();
                                                                arrayList2.addAll(list18);
                                                            }
                                                            return Unit.f46060a;
                                                        }
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    list5 = list6;
                                                    list4 = null;
                                                    long j13 = j;
                                                    r12 = r8;
                                                    j2 = j13;
                                                    z13 = z10;
                                                    z39 = zJ;
                                                    e0g0 e0g0Var5 = j0g0.b;
                                                    g0g0Var2 = new g0g0(th);
                                                    list13 = list2;
                                                    z42 = z39;
                                                    r14 = r12;
                                                    iunVar2 = iun.f15405a;
                                                    z53 = g0g0Var2 instanceof g0g0;
                                                    obj4 = g0g0Var2;
                                                    if (z53) {
                                                        obj4 = iunVar2;
                                                    }
                                                    List list19 = (List) obj4;
                                                    list19.getClass();
                                                    lyeVar.getClass();
                                                    lyeVar = lyeVar;
                                                    ArrayList arrayList3 = lyeVar.e;
                                                    arrayList3.clear();
                                                    arrayList3.addAll(list19);
                                                    z29 = z42;
                                                    r2 = r14;
                                                    list2 = list13;
                                                    long j14 = j2;
                                                    z30 = z13;
                                                    j = j14;
                                                    z31 = zA;
                                                    z43 = z11;
                                                    if (z43) {
                                                        e0g0 e0g0Var6 = j0g0.b;
                                                        if (z31) {
                                                            iht0Var.o = list4;
                                                            iht0Var.p = list4;
                                                            iht0Var.q = list5;
                                                            iht0Var.r = list2;
                                                            g45Var2 = g45Var3;
                                                            iht0Var.s = g45Var2;
                                                            iht0Var.i = z12;
                                                            iht0Var.j = z43;
                                                            iht0Var.k = z30;
                                                            iht0Var.l = r2;
                                                            iht0Var.m = z29;
                                                            iht0Var.t = i;
                                                            iht0Var.y = j;
                                                            iht0Var.n = z31;
                                                            iht0Var.u = r2 == true ? 1 : 0;
                                                            iht0Var.v = z30 ? 1 : 0;
                                                            iht0Var.w = z29 ? 1 : 0;
                                                            iht0Var.z = j;
                                                            iht0Var.x = i;
                                                            iht0Var.Y = 5;
                                                            z48 = r2 == true ? 1 : 0;
                                                            z49 = false;
                                                            objA3 = b3c0Var.a(false, iht0Var);
                                                            if (objA3 == wneVar) {
                                                                return wneVar;
                                                            }
                                                            z50 = z29 ? 1 : 0;
                                                            z51 = z31;
                                                            i9 = i;
                                                            j10 = j;
                                                            i10 = z48 ? 1 : 0;
                                                            z52 = z43;
                                                            i11 = z50 ? 1 : 0;
                                                            i12 = z30 ? 1 : 0;
                                                            i13 = i9;
                                                            if (i11 != 0) {
                                                                z55 = true;
                                                            } else {
                                                                z55 = z49;
                                                            }
                                                            if (i12 != 0) {
                                                                z56 = true;
                                                            } else {
                                                                z56 = z49;
                                                            }
                                                            if (i10 != 0) {
                                                                z49 = true;
                                                            }
                                                            boolean z510 = z12;
                                                            z46 = z49;
                                                            r3 = z48;
                                                            str2 = ((m2c0) objA3).c;
                                                            z45 = z510;
                                                            i7 = i13;
                                                            list15 = list5;
                                                            z43 = z52;
                                                            z44 = z56;
                                                            list16 = list2;
                                                            z54 = z50;
                                                            i8 = i9;
                                                            j8 = j10;
                                                            j9 = j;
                                                            z47 = z55;
                                                            z31 = z51;
                                                        } else {
                                                            boolean z511 = r2 == true ? 1 : 0;
                                                            g45Var2 = g45Var3;
                                                            list15 = list5;
                                                            z44 = z30 ? 1 : 0;
                                                            i7 = i;
                                                            i8 = i7;
                                                            list16 = list2;
                                                            j8 = j;
                                                            j9 = j8;
                                                            z45 = z12;
                                                            z46 = r2 == true ? 1 : 0;
                                                            str2 = null;
                                                            z47 = z29 ? 1 : 0;
                                                            r3 = r2;
                                                            z54 = z29;
                                                        }
                                                        iht0Var.o = null;
                                                        iht0Var.p = null;
                                                        iht0Var.q = null;
                                                        iht0Var.r = null;
                                                        iht0Var.s = null;
                                                        iht0Var.i = z45;
                                                        iht0Var.j = z43;
                                                        iht0Var.k = z30;
                                                        iht0Var.l = r3;
                                                        iht0Var.m = z54;
                                                        iht0Var.t = i8;
                                                        iht0Var.y = j8;
                                                        iht0Var.n = z31;
                                                        iht0Var.Y = 6;
                                                        long j15 = j9;
                                                        iht0 iht0Var4 = iht0Var;
                                                        serializableZ = g45Var2.z(i7, j15, list16, list15, z47, z44, z46, str2, iht0Var4);
                                                        if (serializableZ == wneVar) {
                                                            return wneVar;
                                                        }
                                                        obj5 = serializableZ;
                                                        e0g0 e0g0Var7 = j0g0.b;
                                                        g0g0Var = (List) obj5;
                                                        iunVar = iun.f15405a;
                                                        z5 = g0g0Var instanceof g0g0;
                                                        obj = g0g0Var;
                                                        if (z5) {
                                                            obj = iunVar;
                                                        }
                                                        List list110 = (List) obj;
                                                        list110.getClass();
                                                        lyeVar.getClass();
                                                        ArrayList arrayList4 = lyeVar.f;
                                                        arrayList4.clear();
                                                        arrayList4.addAll(list110);
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                z10 = z14 ? 1 : 0;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            list6 = list3;
                                        }
                                    } else {
                                        list10 = list3;
                                        g45Var = g45Var3;
                                        g45Var3 = g45Var;
                                        ?? r5 = r8;
                                        boolean z60 = zJ ? 1 : 0;
                                        list11 = list2;
                                        j5 = j;
                                        z22 = z11;
                                        z23 = z10;
                                        z24 = z23 ? 1 : 0;
                                        str = null;
                                        z25 = zA;
                                        z26 = z60 ? 1 : 0;
                                        i4 = i;
                                        i5 = i4;
                                        list12 = list11;
                                        j6 = j5;
                                        z27 = z12;
                                        list5 = list10;
                                        z28 = r5 == true ? 1 : 0;
                                        z32 = z60;
                                        r4 = r5;
                                    }
                                    try {
                                        iht0Var.o = list11;
                                        iht0Var.p = list5;
                                        list13 = list11;
                                        try {
                                            iht0Var.q = null;
                                            iht0Var.r = null;
                                            iht0Var.s = null;
                                            iht0Var.i = z27;
                                            iht0Var.j = z22;
                                            iht0Var.k = z23;
                                            iht0Var.l = r4;
                                            iht0Var.m = z32;
                                            iht0Var.t = i4;
                                            iht0Var.y = j6;
                                            iht0Var.n = z25;
                                            try {
                                                iht0Var.Y = 4;
                                                iht0Var2 = iht0Var;
                                                z34 = z27;
                                                wneVar = wneVar;
                                                list4 = null;
                                                List list20 = list12;
                                                z33 = z22;
                                                long j16 = j5;
                                                zA = z25;
                                                i6 = i4;
                                                int i15 = i5;
                                                boolean z61 = z24;
                                                j7 = j6;
                                                try {
                                                    objA2 = g45Var.A(i15, j16, list20, list10, z26, z61, z28, str, iht0Var2);
                                                    iht0Var = iht0Var2;
                                                    if (objA2 == wneVar) {
                                                        return wneVar;
                                                    }
                                                    z35 = z32 ? 1 : 0;
                                                    r13 = r4;
                                                    z13 = z23;
                                                    z11 = z33;
                                                    i = i6;
                                                    j2 = j7;
                                                    z12 = z34;
                                                    try {
                                                        e0g0 e0g0Var8 = j0g0.b;
                                                        g0g0Var2 = (List) objA2;
                                                        z42 = z35;
                                                        r14 = r13;
                                                    } catch (Throwable th5) {
                                                        th = th5;
                                                        z39 = z35 ? 1 : 0;
                                                        list2 = list13;
                                                        r12 = r13;
                                                        e0g0 e0g0Var9 = j0g0.b;
                                                        g0g0Var2 = new g0g0(th);
                                                        list13 = list2;
                                                        z42 = z39;
                                                        r14 = r12;
                                                    }
                                                    iunVar2 = iun.f15405a;
                                                    z53 = g0g0Var2 instanceof g0g0;
                                                    obj4 = g0g0Var2;
                                                    if (z53) {
                                                        obj4 = iunVar2;
                                                    }
                                                    List list111 = (List) obj4;
                                                    list111.getClass();
                                                    lyeVar.getClass();
                                                    lyeVar = lyeVar;
                                                    ArrayList arrayList5 = lyeVar.e;
                                                    arrayList5.clear();
                                                    arrayList5.addAll(list111);
                                                    z29 = z42;
                                                    r2 = r14;
                                                    list2 = list13;
                                                    long j17 = j2;
                                                    z30 = z13;
                                                    j = j17;
                                                    z31 = zA;
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    iht0Var = iht0Var2;
                                                    r12 = r4;
                                                    z13 = z23;
                                                    z11 = z33;
                                                    i = i6;
                                                    j2 = j7;
                                                    list2 = list13;
                                                    z12 = z34;
                                                    z39 = z32;
                                                    e0g0 e0g0Var10 = j0g0.b;
                                                    g0g0Var2 = new g0g0(th);
                                                    list13 = list2;
                                                    z42 = z39;
                                                    r14 = r12;
                                                    iunVar2 = iun.f15405a;
                                                    z53 = g0g0Var2 instanceof g0g0;
                                                    obj4 = g0g0Var2;
                                                    if (z53) {
                                                        obj4 = iunVar2;
                                                    }
                                                    List list112 = (List) obj4;
                                                    list112.getClass();
                                                    lyeVar.getClass();
                                                    lyeVar = lyeVar;
                                                    ArrayList arrayList6 = lyeVar.e;
                                                    arrayList6.clear();
                                                    arrayList6.addAll(list112);
                                                    z29 = z42;
                                                    r2 = r14;
                                                    list2 = list13;
                                                    long j18 = j2;
                                                    z30 = z13;
                                                    j = j18;
                                                    z31 = zA;
                                                    z43 = z11;
                                                    if (z43) {
                                                        e0g0 e0g0Var11 = j0g0.b;
                                                        if (z31) {
                                                            iht0Var.o = list4;
                                                            iht0Var.p = list4;
                                                            iht0Var.q = list5;
                                                            iht0Var.r = list2;
                                                            g45Var2 = g45Var3;
                                                            iht0Var.s = g45Var2;
                                                            iht0Var.i = z12;
                                                            iht0Var.j = z43;
                                                            iht0Var.k = z30;
                                                            iht0Var.l = r2;
                                                            iht0Var.m = z29;
                                                            iht0Var.t = i;
                                                            iht0Var.y = j;
                                                            iht0Var.n = z31;
                                                            iht0Var.u = r2 == true ? 1 : 0;
                                                            iht0Var.v = z30 ? 1 : 0;
                                                            iht0Var.w = z29 ? 1 : 0;
                                                            iht0Var.z = j;
                                                            iht0Var.x = i;
                                                            iht0Var.Y = 5;
                                                            z48 = r2 == true ? 1 : 0;
                                                            z49 = false;
                                                            objA3 = b3c0Var.a(false, iht0Var);
                                                            if (objA3 == wneVar) {
                                                                return wneVar;
                                                            }
                                                            z50 = z29 ? 1 : 0;
                                                            z51 = z31;
                                                            i9 = i;
                                                            j10 = j;
                                                            i10 = z48 ? 1 : 0;
                                                            z52 = z43;
                                                            i11 = z50 ? 1 : 0;
                                                            i12 = z30 ? 1 : 0;
                                                            i13 = i9;
                                                            if (i11 != 0) {
                                                                z55 = true;
                                                            } else {
                                                                z55 = z49;
                                                            }
                                                            if (i12 != 0) {
                                                                z56 = true;
                                                            } else {
                                                                z56 = z49;
                                                            }
                                                            if (i10 != 0) {
                                                                z49 = true;
                                                            }
                                                            boolean z512 = z12;
                                                            z46 = z49;
                                                            r3 = z48;
                                                            str2 = ((m2c0) objA3).c;
                                                            z45 = z512;
                                                            i7 = i13;
                                                            list15 = list5;
                                                            z43 = z52;
                                                            z44 = z56;
                                                            list16 = list2;
                                                            z54 = z50;
                                                            i8 = i9;
                                                            j8 = j10;
                                                            j9 = j;
                                                            z47 = z55;
                                                            z31 = z51;
                                                        } else {
                                                            boolean z513 = r2 == true ? 1 : 0;
                                                            g45Var2 = g45Var3;
                                                            list15 = list5;
                                                            z44 = z30 ? 1 : 0;
                                                            i7 = i;
                                                            i8 = i7;
                                                            list16 = list2;
                                                            j8 = j;
                                                            j9 = j8;
                                                            z45 = z12;
                                                            z46 = r2 == true ? 1 : 0;
                                                            str2 = null;
                                                            z47 = z29 ? 1 : 0;
                                                            r3 = r2;
                                                            z54 = z29;
                                                        }
                                                        iht0Var.o = null;
                                                        iht0Var.p = null;
                                                        iht0Var.q = null;
                                                        iht0Var.r = null;
                                                        iht0Var.s = null;
                                                        iht0Var.i = z45;
                                                        iht0Var.j = z43;
                                                        iht0Var.k = z30;
                                                        iht0Var.l = r3;
                                                        iht0Var.m = z54;
                                                        iht0Var.t = i8;
                                                        iht0Var.y = j8;
                                                        iht0Var.n = z31;
                                                        iht0Var.Y = 6;
                                                        long j19 = j9;
                                                        iht0 iht0Var5 = iht0Var;
                                                        serializableZ = g45Var2.z(i7, j19, list16, list15, z47, z44, z46, str2, iht0Var5);
                                                        if (serializableZ == wneVar) {
                                                            return wneVar;
                                                        }
                                                        obj5 = serializableZ;
                                                        e0g0 e0g0Var12 = j0g0.b;
                                                        g0g0Var = (List) obj5;
                                                        iunVar = iun.f15405a;
                                                        z5 = g0g0Var instanceof g0g0;
                                                        obj = g0g0Var;
                                                        if (z5) {
                                                            obj = iunVar;
                                                        }
                                                        List list113 = (List) obj;
                                                        list113.getClass();
                                                        lyeVar.getClass();
                                                        ArrayList arrayList7 = lyeVar.f;
                                                        arrayList7.clear();
                                                        arrayList7.addAll(list113);
                                                    }
                                                    return Unit.f46060a;
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                z33 = z22;
                                                zA = z25;
                                                i6 = i4;
                                                z34 = z27;
                                                wneVar = wneVar;
                                                iht0Var = iht0Var;
                                                j7 = j6;
                                                list4 = null;
                                                r12 = r4;
                                                z13 = z23;
                                                z11 = z33;
                                                i = i6;
                                                j2 = j7;
                                                list2 = list13;
                                                z12 = z34;
                                                z39 = z32;
                                                e0g0 e0g0Var13 = j0g0.b;
                                                g0g0Var2 = new g0g0(th);
                                                list13 = list2;
                                                z42 = z39;
                                                r14 = r12;
                                                iunVar2 = iun.f15405a;
                                                z53 = g0g0Var2 instanceof g0g0;
                                                obj4 = g0g0Var2;
                                                if (z53) {
                                                    obj4 = iunVar2;
                                                }
                                                List list114 = (List) obj4;
                                                list114.getClass();
                                                lyeVar.getClass();
                                                lyeVar = lyeVar;
                                                ArrayList arrayList8 = lyeVar.e;
                                                arrayList8.clear();
                                                arrayList8.addAll(list114);
                                                z29 = z42;
                                                r2 = r14;
                                                list2 = list13;
                                                long j110 = j2;
                                                z30 = z13;
                                                j = j110;
                                                z31 = zA;
                                                z43 = z11;
                                                if (z43) {
                                                    e0g0 e0g0Var14 = j0g0.b;
                                                    if (z31) {
                                                        iht0Var.o = list4;
                                                        iht0Var.p = list4;
                                                        iht0Var.q = list5;
                                                        iht0Var.r = list2;
                                                        g45Var2 = g45Var3;
                                                        iht0Var.s = g45Var2;
                                                        iht0Var.i = z12;
                                                        iht0Var.j = z43;
                                                        iht0Var.k = z30;
                                                        iht0Var.l = r2;
                                                        iht0Var.m = z29;
                                                        iht0Var.t = i;
                                                        iht0Var.y = j;
                                                        iht0Var.n = z31;
                                                        iht0Var.u = r2 == true ? 1 : 0;
                                                        iht0Var.v = z30 ? 1 : 0;
                                                        iht0Var.w = z29 ? 1 : 0;
                                                        iht0Var.z = j;
                                                        iht0Var.x = i;
                                                        iht0Var.Y = 5;
                                                        z48 = r2 == true ? 1 : 0;
                                                        z49 = false;
                                                        objA3 = b3c0Var.a(false, iht0Var);
                                                        if (objA3 == wneVar) {
                                                            return wneVar;
                                                        }
                                                        z50 = z29 ? 1 : 0;
                                                        z51 = z31;
                                                        i9 = i;
                                                        j10 = j;
                                                        i10 = z48 ? 1 : 0;
                                                        z52 = z43;
                                                        i11 = z50 ? 1 : 0;
                                                        i12 = z30 ? 1 : 0;
                                                        i13 = i9;
                                                        if (i11 != 0) {
                                                            z55 = true;
                                                        } else {
                                                            z55 = z49;
                                                        }
                                                        if (i12 != 0) {
                                                            z56 = true;
                                                        } else {
                                                            z56 = z49;
                                                        }
                                                        if (i10 != 0) {
                                                            z49 = true;
                                                        }
                                                        boolean z514 = z12;
                                                        z46 = z49;
                                                        r3 = z48;
                                                        str2 = ((m2c0) objA3).c;
                                                        z45 = z514;
                                                        i7 = i13;
                                                        list15 = list5;
                                                        z43 = z52;
                                                        z44 = z56;
                                                        list16 = list2;
                                                        z54 = z50;
                                                        i8 = i9;
                                                        j8 = j10;
                                                        j9 = j;
                                                        z47 = z55;
                                                        z31 = z51;
                                                    } else {
                                                        boolean z515 = r2 == true ? 1 : 0;
                                                        g45Var2 = g45Var3;
                                                        list15 = list5;
                                                        z44 = z30 ? 1 : 0;
                                                        i7 = i;
                                                        i8 = i7;
                                                        list16 = list2;
                                                        j8 = j;
                                                        j9 = j8;
                                                        z45 = z12;
                                                        z46 = r2 == true ? 1 : 0;
                                                        str2 = null;
                                                        z47 = z29 ? 1 : 0;
                                                        r3 = r2;
                                                        z54 = z29;
                                                    }
                                                    iht0Var.o = null;
                                                    iht0Var.p = null;
                                                    iht0Var.q = null;
                                                    iht0Var.r = null;
                                                    iht0Var.s = null;
                                                    iht0Var.i = z45;
                                                    iht0Var.j = z43;
                                                    iht0Var.k = z30;
                                                    iht0Var.l = r3;
                                                    iht0Var.m = z54;
                                                    iht0Var.t = i8;
                                                    iht0Var.y = j8;
                                                    iht0Var.n = z31;
                                                    iht0Var.Y = 6;
                                                    long j111 = j9;
                                                    iht0 iht0Var6 = iht0Var;
                                                    serializableZ = g45Var2.z(i7, j111, list16, list15, z47, z44, z46, str2, iht0Var6);
                                                    if (serializableZ == wneVar) {
                                                        return wneVar;
                                                    }
                                                    obj5 = serializableZ;
                                                    e0g0 e0g0Var15 = j0g0.b;
                                                    g0g0Var = (List) obj5;
                                                    iunVar = iun.f15405a;
                                                    z5 = g0g0Var instanceof g0g0;
                                                    obj = g0g0Var;
                                                    if (z5) {
                                                        obj = iunVar;
                                                    }
                                                    List list115 = (List) obj;
                                                    list115.getClass();
                                                    lyeVar.getClass();
                                                    ArrayList arrayList9 = lyeVar.f;
                                                    arrayList9.clear();
                                                    arrayList9.addAll(list115);
                                                }
                                                return Unit.f46060a;
                                            }
                                        } catch (Throwable th8) {
                                            th = th8;
                                            z33 = z22;
                                            zA = z25;
                                            i6 = i4;
                                            z34 = z27;
                                            iht0Var = iht0Var;
                                            list4 = null;
                                            wneVar = wneVar;
                                            j7 = j6;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        list13 = list11;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    list4 = null;
                                    list5 = list3;
                                }
                                break;
                            } else {
                                b3c0Var = b3c0Var;
                                g45Var3 = g45Var3;
                                wneVar = wneVar;
                                iht0Var = iht0Var;
                                list4 = null;
                                r2 = r8;
                                z29 = zJ ? 1 : 0;
                                z30 = z10;
                                z31 = zA;
                                list5 = list3;
                            }
                            z43 = z11;
                            if (z43) {
                                e0g0 e0g0Var16 = j0g0.b;
                                if (z31) {
                                    iht0Var.o = list4;
                                    iht0Var.p = list4;
                                    iht0Var.q = list5;
                                    iht0Var.r = list2;
                                    g45Var2 = g45Var3;
                                    iht0Var.s = g45Var2;
                                    iht0Var.i = z12;
                                    iht0Var.j = z43;
                                    iht0Var.k = z30;
                                    iht0Var.l = r2;
                                    iht0Var.m = z29;
                                    iht0Var.t = i;
                                    iht0Var.y = j;
                                    iht0Var.n = z31;
                                    iht0Var.u = r2 == true ? 1 : 0;
                                    iht0Var.v = z30 ? 1 : 0;
                                    iht0Var.w = z29 ? 1 : 0;
                                    iht0Var.z = j;
                                    iht0Var.x = i;
                                    iht0Var.Y = 5;
                                    z48 = r2 == true ? 1 : 0;
                                    z49 = false;
                                    objA3 = b3c0Var.a(false, iht0Var);
                                    if (objA3 == wneVar) {
                                        return wneVar;
                                    }
                                    z50 = z29 ? 1 : 0;
                                    z51 = z31;
                                    i9 = i;
                                    j10 = j;
                                    i10 = z48 ? 1 : 0;
                                    z52 = z43;
                                    i11 = z50 ? 1 : 0;
                                    i12 = z30 ? 1 : 0;
                                    i13 = i9;
                                    if (i11 != 0) {
                                        z55 = true;
                                    } else {
                                        z55 = z49;
                                    }
                                    if (i12 != 0) {
                                        z56 = true;
                                    } else {
                                        z56 = z49;
                                    }
                                    if (i10 != 0) {
                                        z49 = true;
                                    }
                                    boolean z516 = z12;
                                    z46 = z49;
                                    r3 = z48;
                                    str2 = ((m2c0) objA3).c;
                                    z45 = z516;
                                    i7 = i13;
                                    list15 = list5;
                                    z43 = z52;
                                    z44 = z56;
                                    list16 = list2;
                                    z54 = z50;
                                    i8 = i9;
                                    j8 = j10;
                                    j9 = j;
                                    z47 = z55;
                                    z31 = z51;
                                } else {
                                    boolean z517 = r2 == true ? 1 : 0;
                                    g45Var2 = g45Var3;
                                    list15 = list5;
                                    z44 = z30 ? 1 : 0;
                                    i7 = i;
                                    i8 = i7;
                                    list16 = list2;
                                    j8 = j;
                                    j9 = j8;
                                    z45 = z12;
                                    z46 = r2 == true ? 1 : 0;
                                    str2 = null;
                                    z47 = z29 ? 1 : 0;
                                    r3 = r2;
                                    z54 = z29;
                                }
                                iht0Var.o = null;
                                iht0Var.p = null;
                                iht0Var.q = null;
                                iht0Var.r = null;
                                iht0Var.s = null;
                                iht0Var.i = z45;
                                iht0Var.j = z43;
                                iht0Var.k = z30;
                                iht0Var.l = r3;
                                iht0Var.m = z54;
                                iht0Var.t = i8;
                                iht0Var.y = j8;
                                iht0Var.n = z31;
                                iht0Var.Y = 6;
                                long j112 = j9;
                                iht0 iht0Var7 = iht0Var;
                                serializableZ = g45Var2.z(i7, j112, list16, list15, z47, z44, z46, str2, iht0Var7);
                                if (serializableZ == wneVar) {
                                    return wneVar;
                                }
                                obj5 = serializableZ;
                                e0g0 e0g0Var17 = j0g0.b;
                                g0g0Var = (List) obj5;
                                iunVar = iun.f15405a;
                                z5 = g0g0Var instanceof g0g0;
                                obj = g0g0Var;
                                if (z5) {
                                    obj = iunVar;
                                }
                                List list116 = (List) obj;
                                list116.getClass();
                                lyeVar.getClass();
                                ArrayList arrayList10 = lyeVar.f;
                                arrayList10.clear();
                                arrayList10.addAll(list116);
                            }
                            return Unit.f46060a;
                        }
                    }
                    return wneVar;
                case 1:
                    boolean z62 = iht0Var.l;
                    z9 = iht0Var.k;
                    z6 = iht0Var.j;
                    z8 = iht0Var.i;
                    z1x.P(obj5);
                    z7 = z62;
                    objB = obj5;
                    list = (List) objB;
                    edo edoVar2 = (edo) this.c;
                    iht0Var.o = list;
                    iht0Var.i = z8;
                    iht0Var.j = z6;
                    iht0Var.k = z9;
                    iht0Var.l = z7;
                    iht0Var.Y = 2;
                    objB2 = edoVar2.b(iht0Var);
                    if (objB2 != wneVar) {
                        boolean z518 = z7;
                        list2 = list;
                        obj2 = objB2;
                        z10 = z9;
                        r8 = z518;
                        z11 = z6;
                        z12 = z8;
                        list3 = (List) obj2;
                        zJ = ((j1q0) this.f).f15748a.j();
                        i = ((khf0) this.e).t().f38290a;
                        if (gst0Var.a()) {
                            j = -1;
                        } else {
                            j = -1;
                        }
                        zA = gst0Var.a();
                        if (z12) {
                            e0g0 e0g0Var18 = j0g0.b;
                            if (zA) {
                                iht0Var.o = list2;
                                iht0Var.p = list3;
                                iht0Var.q = list3;
                                iht0Var.r = list2;
                                iht0Var.s = g45Var3;
                                iht0Var.i = z12;
                                iht0Var.j = z11;
                                list6 = list3;
                                z14 = z10;
                                iht0Var.k = z14;
                                iht0Var.l = r8;
                                iht0Var.m = zJ;
                                iht0Var.t = i;
                                iht0Var.y = j;
                                iht0Var.n = zA;
                                iht0Var.u = r8;
                                iht0Var.v = z14 ? 1 : 0;
                                iht0Var.w = zJ ? 1 : 0;
                                iht0Var.z = j;
                                iht0Var.x = i;
                                iht0Var.Y = 3;
                                z10 = z14 ? 1 : 0;
                                z15 = false;
                                objA = b3c0Var.a(false, iht0Var);
                                if (objA != wneVar) {
                                    list7 = list6;
                                    ?? r18 = r8;
                                    z16 = r18 == true ? 1 : 0;
                                    z17 = zJ ? 1 : 0;
                                    i2 = i;
                                    list8 = list2;
                                    j3 = j;
                                    z18 = z11;
                                    z19 = z12;
                                    z20 = z10 ? 1 : 0;
                                    obj3 = objA;
                                    z21 = zA;
                                    g45Var = g45Var3;
                                    j4 = j3;
                                    i3 = z20 ? 1 : 0;
                                    list9 = list7;
                                    r9 = zJ;
                                    r16 = r18;
                                    if (r9 != 0) {
                                        z36 = true;
                                    } else {
                                        z36 = z15;
                                    }
                                    if (i3 != 0) {
                                        z37 = true;
                                    } else {
                                        z37 = z15;
                                    }
                                    if (r16 != 0) {
                                        z38 = true;
                                    } else {
                                        z38 = z15;
                                    }
                                    String str4 = ((m2c0) obj3).c;
                                    list10 = list9;
                                    list12 = list2;
                                    i4 = i2;
                                    list5 = list7;
                                    j5 = j4;
                                    z28 = z38;
                                    str = str4;
                                    list11 = list8;
                                    i5 = i;
                                    z25 = z21;
                                    z26 = z36;
                                    j6 = j3;
                                    g45Var3 = g45Var3;
                                    z32 = z17;
                                    r4 = z16;
                                    z24 = z37;
                                    z23 = z20;
                                    z27 = z19;
                                    z22 = z18;
                                }
                            } else {
                                list10 = list3;
                                g45Var = g45Var3;
                                g45Var3 = g45Var;
                                ?? r6 = r8;
                                boolean z63 = zJ ? 1 : 0;
                                list11 = list2;
                                j5 = j;
                                z22 = z11;
                                z23 = z10;
                                z24 = z23 ? 1 : 0;
                                str = null;
                                z25 = zA;
                                z26 = z63 ? 1 : 0;
                                i4 = i;
                                i5 = i4;
                                list12 = list11;
                                j6 = j5;
                                z27 = z12;
                                list5 = list10;
                                z28 = r6 == true ? 1 : 0;
                                z32 = z63;
                                r4 = r6;
                            }
                            iht0Var.o = list11;
                            iht0Var.p = list5;
                            list13 = list11;
                            iht0Var.q = null;
                            iht0Var.r = null;
                            iht0Var.s = null;
                            iht0Var.i = z27;
                            iht0Var.j = z22;
                            iht0Var.k = z23;
                            iht0Var.l = r4;
                            iht0Var.m = z32;
                            iht0Var.t = i4;
                            iht0Var.y = j6;
                            iht0Var.n = z25;
                            iht0Var.Y = 4;
                            iht0Var2 = iht0Var;
                            z34 = z27;
                            wneVar = wneVar;
                            list4 = null;
                            List list21 = list12;
                            z33 = z22;
                            long j113 = j5;
                            zA = z25;
                            i6 = i4;
                            int i16 = i5;
                            boolean z64 = z24;
                            j7 = j6;
                            objA2 = g45Var.A(i16, j113, list21, list10, z26, z64, z28, str, iht0Var2);
                            iht0Var = iht0Var2;
                            if (objA2 == wneVar) {
                                return wneVar;
                            }
                            z35 = z32 ? 1 : 0;
                            r13 = r4;
                            z13 = z23;
                            z11 = z33;
                            i = i6;
                            j2 = j7;
                            z12 = z34;
                            e0g0 e0g0Var19 = j0g0.b;
                            g0g0Var2 = (List) objA2;
                            z42 = z35;
                            r14 = r13;
                            iunVar2 = iun.f15405a;
                            z53 = g0g0Var2 instanceof g0g0;
                            obj4 = g0g0Var2;
                            if (z53) {
                                obj4 = iunVar2;
                            }
                            List list117 = (List) obj4;
                            list117.getClass();
                            lyeVar.getClass();
                            lyeVar = lyeVar;
                            ArrayList arrayList11 = lyeVar.e;
                            arrayList11.clear();
                            arrayList11.addAll(list117);
                            z29 = z42;
                            r2 = r14;
                            list2 = list13;
                            long j114 = j2;
                            z30 = z13;
                            j = j114;
                            z31 = zA;
                        } else {
                            b3c0Var = b3c0Var;
                            g45Var3 = g45Var3;
                            wneVar = wneVar;
                            iht0Var = iht0Var;
                            list4 = null;
                            r2 = r8;
                            z29 = zJ ? 1 : 0;
                            z30 = z10;
                            z31 = zA;
                            list5 = list3;
                        }
                        z43 = z11;
                        if (z43) {
                            e0g0 e0g0Var110 = j0g0.b;
                            if (z31) {
                                iht0Var.o = list4;
                                iht0Var.p = list4;
                                iht0Var.q = list5;
                                iht0Var.r = list2;
                                g45Var2 = g45Var3;
                                iht0Var.s = g45Var2;
                                iht0Var.i = z12;
                                iht0Var.j = z43;
                                iht0Var.k = z30;
                                iht0Var.l = r2;
                                iht0Var.m = z29;
                                iht0Var.t = i;
                                iht0Var.y = j;
                                iht0Var.n = z31;
                                iht0Var.u = r2 == true ? 1 : 0;
                                iht0Var.v = z30 ? 1 : 0;
                                iht0Var.w = z29 ? 1 : 0;
                                iht0Var.z = j;
                                iht0Var.x = i;
                                iht0Var.Y = 5;
                                z48 = r2 == true ? 1 : 0;
                                z49 = false;
                                objA3 = b3c0Var.a(false, iht0Var);
                                if (objA3 == wneVar) {
                                    return wneVar;
                                }
                                z50 = z29 ? 1 : 0;
                                z51 = z31;
                                i9 = i;
                                j10 = j;
                                i10 = z48 ? 1 : 0;
                                z52 = z43;
                                i11 = z50 ? 1 : 0;
                                i12 = z30 ? 1 : 0;
                                i13 = i9;
                                if (i11 != 0) {
                                    z55 = true;
                                } else {
                                    z55 = z49;
                                }
                                if (i12 != 0) {
                                    z56 = true;
                                } else {
                                    z56 = z49;
                                }
                                if (i10 != 0) {
                                    z49 = true;
                                }
                                boolean z519 = z12;
                                z46 = z49;
                                r3 = z48;
                                str2 = ((m2c0) objA3).c;
                                z45 = z519;
                                i7 = i13;
                                list15 = list5;
                                z43 = z52;
                                z44 = z56;
                                list16 = list2;
                                z54 = z50;
                                i8 = i9;
                                j8 = j10;
                                j9 = j;
                                z47 = z55;
                                z31 = z51;
                            } else {
                                boolean z5110 = r2 == true ? 1 : 0;
                                g45Var2 = g45Var3;
                                list15 = list5;
                                z44 = z30 ? 1 : 0;
                                i7 = i;
                                i8 = i7;
                                list16 = list2;
                                j8 = j;
                                j9 = j8;
                                z45 = z12;
                                z46 = r2 == true ? 1 : 0;
                                str2 = null;
                                z47 = z29 ? 1 : 0;
                                r3 = r2;
                                z54 = z29;
                            }
                            iht0Var.o = null;
                            iht0Var.p = null;
                            iht0Var.q = null;
                            iht0Var.r = null;
                            iht0Var.s = null;
                            iht0Var.i = z45;
                            iht0Var.j = z43;
                            iht0Var.k = z30;
                            iht0Var.l = r3;
                            iht0Var.m = z54;
                            iht0Var.t = i8;
                            iht0Var.y = j8;
                            iht0Var.n = z31;
                            iht0Var.Y = 6;
                            long j115 = j9;
                            iht0 iht0Var8 = iht0Var;
                            serializableZ = g45Var2.z(i7, j115, list16, list15, z47, z44, z46, str2, iht0Var8);
                            if (serializableZ == wneVar) {
                                return wneVar;
                            }
                            obj5 = serializableZ;
                            e0g0 e0g0Var111 = j0g0.b;
                            g0g0Var = (List) obj5;
                            iunVar = iun.f15405a;
                            z5 = g0g0Var instanceof g0g0;
                            obj = g0g0Var;
                            if (z5) {
                                obj = iunVar;
                            }
                            List list118 = (List) obj;
                            list118.getClass();
                            lyeVar.getClass();
                            ArrayList arrayList12 = lyeVar.f;
                            arrayList12.clear();
                            arrayList12.addAll(list118);
                        }
                        return Unit.f46060a;
                    }
                    return wneVar;
                case 2:
                    boolean z65 = iht0Var.l;
                    boolean z66 = iht0Var.k;
                    z6 = iht0Var.j;
                    z8 = iht0Var.i;
                    list2 = iht0Var.o;
                    z1x.P(obj5);
                    z10 = z66;
                    r8 = z65;
                    obj2 = obj5;
                    z11 = z6;
                    z12 = z8;
                    list3 = (List) obj2;
                    zJ = ((j1q0) this.f).f15748a.j();
                    i = ((khf0) this.e).t().f38290a;
                    if (gst0Var.a()) {
                        j = -1;
                    } else {
                        j = -1;
                    }
                    zA = gst0Var.a();
                    if (z12) {
                        e0g0 e0g0Var112 = j0g0.b;
                        if (zA) {
                            iht0Var.o = list2;
                            iht0Var.p = list3;
                            iht0Var.q = list3;
                            iht0Var.r = list2;
                            iht0Var.s = g45Var3;
                            iht0Var.i = z12;
                            iht0Var.j = z11;
                            list6 = list3;
                            z14 = z10;
                            iht0Var.k = z14;
                            iht0Var.l = r8;
                            iht0Var.m = zJ;
                            iht0Var.t = i;
                            iht0Var.y = j;
                            iht0Var.n = zA;
                            iht0Var.u = r8;
                            iht0Var.v = z14 ? 1 : 0;
                            iht0Var.w = zJ ? 1 : 0;
                            iht0Var.z = j;
                            iht0Var.x = i;
                            iht0Var.Y = 3;
                            z10 = z14 ? 1 : 0;
                            z15 = false;
                            objA = b3c0Var.a(false, iht0Var);
                            if (objA != wneVar) {
                                list7 = list6;
                                ?? r19 = r8;
                                z16 = r19 == true ? 1 : 0;
                                z17 = zJ ? 1 : 0;
                                i2 = i;
                                list8 = list2;
                                j3 = j;
                                z18 = z11;
                                z19 = z12;
                                z20 = z10 ? 1 : 0;
                                obj3 = objA;
                                z21 = zA;
                                g45Var = g45Var3;
                                j4 = j3;
                                i3 = z20 ? 1 : 0;
                                list9 = list7;
                                r9 = zJ;
                                r16 = r19;
                                if (r9 != 0) {
                                    z36 = true;
                                } else {
                                    z36 = z15;
                                }
                                if (i3 != 0) {
                                    z37 = true;
                                } else {
                                    z37 = z15;
                                }
                                if (r16 != 0) {
                                    z38 = true;
                                } else {
                                    z38 = z15;
                                }
                                String str5 = ((m2c0) obj3).c;
                                list10 = list9;
                                list12 = list2;
                                i4 = i2;
                                list5 = list7;
                                j5 = j4;
                                z28 = z38;
                                str = str5;
                                list11 = list8;
                                i5 = i;
                                z25 = z21;
                                z26 = z36;
                                j6 = j3;
                                g45Var3 = g45Var3;
                                z32 = z17;
                                r4 = z16;
                                z24 = z37;
                                z23 = z20;
                                z27 = z19;
                                z22 = z18;
                            }
                            return wneVar;
                        }
                        list10 = list3;
                        g45Var = g45Var3;
                        g45Var3 = g45Var;
                        ?? r7 = r8;
                        boolean z67 = zJ ? 1 : 0;
                        list11 = list2;
                        j5 = j;
                        z22 = z11;
                        z23 = z10;
                        z24 = z23 ? 1 : 0;
                        str = null;
                        z25 = zA;
                        z26 = z67 ? 1 : 0;
                        i4 = i;
                        i5 = i4;
                        list12 = list11;
                        j6 = j5;
                        z27 = z12;
                        list5 = list10;
                        z28 = r7 == true ? 1 : 0;
                        z32 = z67;
                        r4 = r7;
                        iht0Var.o = list11;
                        iht0Var.p = list5;
                        list13 = list11;
                        iht0Var.q = null;
                        iht0Var.r = null;
                        iht0Var.s = null;
                        iht0Var.i = z27;
                        iht0Var.j = z22;
                        iht0Var.k = z23;
                        iht0Var.l = r4;
                        iht0Var.m = z32;
                        iht0Var.t = i4;
                        iht0Var.y = j6;
                        iht0Var.n = z25;
                        iht0Var.Y = 4;
                        iht0Var2 = iht0Var;
                        z34 = z27;
                        wneVar = wneVar;
                        list4 = null;
                        List list22 = list12;
                        z33 = z22;
                        long j116 = j5;
                        zA = z25;
                        i6 = i4;
                        int i17 = i5;
                        boolean z68 = z24;
                        j7 = j6;
                        objA2 = g45Var.A(i17, j116, list22, list10, z26, z68, z28, str, iht0Var2);
                        iht0Var = iht0Var2;
                        if (objA2 == wneVar) {
                            return wneVar;
                        }
                        z35 = z32 ? 1 : 0;
                        r13 = r4;
                        z13 = z23;
                        z11 = z33;
                        i = i6;
                        j2 = j7;
                        z12 = z34;
                        e0g0 e0g0Var113 = j0g0.b;
                        g0g0Var2 = (List) objA2;
                        z42 = z35;
                        r14 = r13;
                        iunVar2 = iun.f15405a;
                        z53 = g0g0Var2 instanceof g0g0;
                        obj4 = g0g0Var2;
                        if (z53) {
                            obj4 = iunVar2;
                        }
                        List list119 = (List) obj4;
                        list119.getClass();
                        lyeVar.getClass();
                        lyeVar = lyeVar;
                        ArrayList arrayList13 = lyeVar.e;
                        arrayList13.clear();
                        arrayList13.addAll(list119);
                        z29 = z42;
                        r2 = r14;
                        list2 = list13;
                        long j117 = j2;
                        z30 = z13;
                        j = j117;
                        z31 = zA;
                    } else {
                        b3c0Var = b3c0Var;
                        g45Var3 = g45Var3;
                        wneVar = wneVar;
                        iht0Var = iht0Var;
                        list4 = null;
                        r2 = r8;
                        z29 = zJ ? 1 : 0;
                        z30 = z10;
                        z31 = zA;
                        list5 = list3;
                    }
                    z43 = z11;
                    if (z43) {
                        e0g0 e0g0Var114 = j0g0.b;
                        if (z31) {
                            iht0Var.o = list4;
                            iht0Var.p = list4;
                            iht0Var.q = list5;
                            iht0Var.r = list2;
                            g45Var2 = g45Var3;
                            iht0Var.s = g45Var2;
                            iht0Var.i = z12;
                            iht0Var.j = z43;
                            iht0Var.k = z30;
                            iht0Var.l = r2;
                            iht0Var.m = z29;
                            iht0Var.t = i;
                            iht0Var.y = j;
                            iht0Var.n = z31;
                            iht0Var.u = r2 == true ? 1 : 0;
                            iht0Var.v = z30 ? 1 : 0;
                            iht0Var.w = z29 ? 1 : 0;
                            iht0Var.z = j;
                            iht0Var.x = i;
                            iht0Var.Y = 5;
                            z48 = r2 == true ? 1 : 0;
                            z49 = false;
                            objA3 = b3c0Var.a(false, iht0Var);
                            if (objA3 == wneVar) {
                                return wneVar;
                            }
                            z50 = z29 ? 1 : 0;
                            z51 = z31;
                            i9 = i;
                            j10 = j;
                            i10 = z48 ? 1 : 0;
                            z52 = z43;
                            i11 = z50 ? 1 : 0;
                            i12 = z30 ? 1 : 0;
                            i13 = i9;
                            if (i11 != 0) {
                                z55 = true;
                            } else {
                                z55 = z49;
                            }
                            if (i12 != 0) {
                                z56 = true;
                            } else {
                                z56 = z49;
                            }
                            if (i10 != 0) {
                                z49 = true;
                            }
                            boolean z5111 = z12;
                            z46 = z49;
                            r3 = z48;
                            str2 = ((m2c0) objA3).c;
                            z45 = z5111;
                            i7 = i13;
                            list15 = list5;
                            z43 = z52;
                            z44 = z56;
                            list16 = list2;
                            z54 = z50;
                            i8 = i9;
                            j8 = j10;
                            j9 = j;
                            z47 = z55;
                            z31 = z51;
                        } else {
                            boolean z5112 = r2 == true ? 1 : 0;
                            g45Var2 = g45Var3;
                            list15 = list5;
                            z44 = z30 ? 1 : 0;
                            i7 = i;
                            i8 = i7;
                            list16 = list2;
                            j8 = j;
                            j9 = j8;
                            z45 = z12;
                            z46 = r2 == true ? 1 : 0;
                            str2 = null;
                            z47 = z29 ? 1 : 0;
                            r3 = r2;
                            z54 = z29;
                        }
                        iht0Var.o = null;
                        iht0Var.p = null;
                        iht0Var.q = null;
                        iht0Var.r = null;
                        iht0Var.s = null;
                        iht0Var.i = z45;
                        iht0Var.j = z43;
                        iht0Var.k = z30;
                        iht0Var.l = r3;
                        iht0Var.m = z54;
                        iht0Var.t = i8;
                        iht0Var.y = j8;
                        iht0Var.n = z31;
                        iht0Var.Y = 6;
                        long j118 = j9;
                        iht0 iht0Var9 = iht0Var;
                        serializableZ = g45Var2.z(i7, j118, list16, list15, z47, z44, z46, str2, iht0Var9);
                        if (serializableZ == wneVar) {
                            return wneVar;
                        }
                        obj5 = serializableZ;
                        e0g0 e0g0Var115 = j0g0.b;
                        g0g0Var = (List) obj5;
                        iunVar = iun.f15405a;
                        z5 = g0g0Var instanceof g0g0;
                        obj = g0g0Var;
                        if (z5) {
                            obj = iunVar;
                        }
                        List list1110 = (List) obj;
                        list1110.getClass();
                        lyeVar.getClass();
                        ArrayList arrayList14 = lyeVar.f;
                        arrayList14.clear();
                        arrayList14.addAll(list1110);
                    }
                    return Unit.f46060a;
                case 3:
                    obj3 = obj5;
                    int i18 = iht0Var.x;
                    long j20 = iht0Var.z;
                    int i19 = iht0Var.w;
                    int i20 = iht0Var.v;
                    int i21 = iht0Var.u;
                    boolean z69 = iht0Var.n;
                    long j21 = iht0Var.y;
                    int i22 = iht0Var.t;
                    boolean z70 = iht0Var.m;
                    boolean z71 = iht0Var.l;
                    boolean z72 = iht0Var.k;
                    boolean z73 = iht0Var.j;
                    boolean z74 = iht0Var.i;
                    g45 g45Var4 = iht0Var.s;
                    List list23 = iht0Var.r;
                    List list24 = iht0Var.q;
                    list7 = iht0Var.p;
                    list14 = iht0Var.o;
                    try {
                        z1x.P(obj3);
                        z16 = z71;
                        z20 = z72;
                        z18 = z73;
                        r16 = i21;
                        z17 = z70;
                        z19 = z74;
                        i = i18;
                        i2 = i22;
                        j4 = j20;
                        r9 = i19;
                        list8 = list14;
                        z15 = false;
                        list9 = list24;
                        g45Var = g45Var4;
                        i3 = i20;
                        z21 = z69;
                        list2 = list23;
                        j3 = j21;
                        if (r9 != 0) {
                            z36 = true;
                        } else {
                            z36 = z15;
                        }
                        if (i3 != 0) {
                            z37 = true;
                        } else {
                            z37 = z15;
                        }
                        if (r16 != 0) {
                            z38 = true;
                        } else {
                            z38 = z15;
                        }
                        String str6 = ((m2c0) obj3).c;
                        list10 = list9;
                        list12 = list2;
                        i4 = i2;
                        list5 = list7;
                        j5 = j4;
                        z28 = z38;
                        str = str6;
                        list11 = list8;
                        i5 = i;
                        z25 = z21;
                        z26 = z36;
                        j6 = j3;
                        g45Var3 = g45Var3;
                        z32 = z17;
                        r4 = z16;
                        z24 = z37;
                        z23 = z20;
                        z27 = z19;
                        z22 = z18;
                        iht0Var.o = list11;
                        iht0Var.p = list5;
                        list13 = list11;
                        iht0Var.q = null;
                        iht0Var.r = null;
                        iht0Var.s = null;
                        iht0Var.i = z27;
                        iht0Var.j = z22;
                        iht0Var.k = z23;
                        iht0Var.l = r4;
                        iht0Var.m = z32;
                        iht0Var.t = i4;
                        iht0Var.y = j6;
                        iht0Var.n = z25;
                        iht0Var.Y = 4;
                        iht0Var2 = iht0Var;
                        z34 = z27;
                        wneVar = wneVar;
                        list4 = null;
                        List list25 = list12;
                        z33 = z22;
                        long j119 = j5;
                        zA = z25;
                        i6 = i4;
                        int i110 = i5;
                        boolean z610 = z24;
                        j7 = j6;
                        objA2 = g45Var.A(i110, j119, list25, list10, z26, z610, z28, str, iht0Var2);
                        iht0Var = iht0Var2;
                        if (objA2 == wneVar) {
                            return wneVar;
                        }
                        z35 = z32 ? 1 : 0;
                        r13 = r4;
                        z13 = z23;
                        z11 = z33;
                        i = i6;
                        j2 = j7;
                        z12 = z34;
                        e0g0 e0g0Var116 = j0g0.b;
                        g0g0Var2 = (List) objA2;
                        z42 = z35;
                        r14 = r13;
                        iunVar2 = iun.f15405a;
                        z53 = g0g0Var2 instanceof g0g0;
                        obj4 = g0g0Var2;
                        if (z53) {
                            obj4 = iunVar2;
                        }
                        List list1111 = (List) obj4;
                        list1111.getClass();
                        lyeVar.getClass();
                        lyeVar = lyeVar;
                        ArrayList arrayList15 = lyeVar.e;
                        arrayList15.clear();
                        arrayList15.addAll(list1111);
                        z29 = z42;
                        r2 = r14;
                        list2 = list13;
                        long j1110 = j2;
                        z30 = z13;
                        j = j1110;
                        z31 = zA;
                        z43 = z11;
                        if (z43) {
                            e0g0 e0g0Var117 = j0g0.b;
                            if (z31) {
                                iht0Var.o = list4;
                                iht0Var.p = list4;
                                iht0Var.q = list5;
                                iht0Var.r = list2;
                                g45Var2 = g45Var3;
                                iht0Var.s = g45Var2;
                                iht0Var.i = z12;
                                iht0Var.j = z43;
                                iht0Var.k = z30;
                                iht0Var.l = r2;
                                iht0Var.m = z29;
                                iht0Var.t = i;
                                iht0Var.y = j;
                                iht0Var.n = z31;
                                iht0Var.u = r2 == true ? 1 : 0;
                                iht0Var.v = z30 ? 1 : 0;
                                iht0Var.w = z29 ? 1 : 0;
                                iht0Var.z = j;
                                iht0Var.x = i;
                                iht0Var.Y = 5;
                                z48 = r2 == true ? 1 : 0;
                                z49 = false;
                                objA3 = b3c0Var.a(false, iht0Var);
                                if (objA3 == wneVar) {
                                    return wneVar;
                                }
                                z50 = z29 ? 1 : 0;
                                z51 = z31;
                                i9 = i;
                                j10 = j;
                                i10 = z48 ? 1 : 0;
                                z52 = z43;
                                i11 = z50 ? 1 : 0;
                                i12 = z30 ? 1 : 0;
                                i13 = i9;
                                if (i11 != 0) {
                                    z55 = true;
                                } else {
                                    z55 = z49;
                                }
                                if (i12 != 0) {
                                    z56 = true;
                                } else {
                                    z56 = z49;
                                }
                                if (i10 != 0) {
                                    z49 = true;
                                }
                                boolean z5113 = z12;
                                z46 = z49;
                                r3 = z48;
                                str2 = ((m2c0) objA3).c;
                                z45 = z5113;
                                i7 = i13;
                                list15 = list5;
                                z43 = z52;
                                z44 = z56;
                                list16 = list2;
                                z54 = z50;
                                i8 = i9;
                                j8 = j10;
                                j9 = j;
                                z47 = z55;
                                z31 = z51;
                            } else {
                                boolean z5114 = r2 == true ? 1 : 0;
                                g45Var2 = g45Var3;
                                list15 = list5;
                                z44 = z30 ? 1 : 0;
                                i7 = i;
                                i8 = i7;
                                list16 = list2;
                                j8 = j;
                                j9 = j8;
                                z45 = z12;
                                z46 = r2 == true ? 1 : 0;
                                str2 = null;
                                z47 = z29 ? 1 : 0;
                                r3 = r2;
                                z54 = z29;
                            }
                            iht0Var.o = null;
                            iht0Var.p = null;
                            iht0Var.q = null;
                            iht0Var.r = null;
                            iht0Var.s = null;
                            iht0Var.i = z45;
                            iht0Var.j = z43;
                            iht0Var.k = z30;
                            iht0Var.l = r3;
                            iht0Var.m = z54;
                            iht0Var.t = i8;
                            iht0Var.y = j8;
                            iht0Var.n = z31;
                            iht0Var.Y = 6;
                            long j1111 = j9;
                            iht0 iht0Var10 = iht0Var;
                            serializableZ = g45Var2.z(i7, j1111, list16, list15, z47, z44, z46, str2, iht0Var10);
                            if (serializableZ == wneVar) {
                                return wneVar;
                            }
                            obj5 = serializableZ;
                            e0g0 e0g0Var118 = j0g0.b;
                            g0g0Var = (List) obj5;
                            iunVar = iun.f15405a;
                            z5 = g0g0Var instanceof g0g0;
                            obj = g0g0Var;
                            if (z5) {
                                obj = iunVar;
                            }
                            List list1112 = (List) obj;
                            list1112.getClass();
                            lyeVar.getClass();
                            ArrayList arrayList16 = lyeVar.f;
                            arrayList16.clear();
                            arrayList16.addAll(list1112);
                        }
                        return Unit.f46060a;
                    } catch (Throwable th11) {
                        th = th11;
                        j2 = j21;
                        i = i22;
                        z40 = z70;
                        z12 = z74;
                        list5 = list7;
                        z41 = z71;
                        z13 = z72;
                        z11 = z73;
                        zA = z69;
                        list2 = list14;
                        wneVar = wneVar;
                        iht0Var = iht0Var;
                        list4 = null;
                        z39 = z40;
                        r12 = z41;
                        e0g0 e0g0Var119 = j0g0.b;
                        g0g0Var2 = new g0g0(th);
                        list13 = list2;
                        z42 = z39;
                        r14 = r12;
                        iunVar2 = iun.f15405a;
                        z53 = g0g0Var2 instanceof g0g0;
                        obj4 = g0g0Var2;
                        if (z53) {
                            obj4 = iunVar2;
                        }
                        List list1113 = (List) obj4;
                        list1113.getClass();
                        lyeVar.getClass();
                        lyeVar = lyeVar;
                        ArrayList arrayList17 = lyeVar.e;
                        arrayList17.clear();
                        arrayList17.addAll(list1113);
                        z29 = z42;
                        r2 = r14;
                        list2 = list13;
                        long j1112 = j2;
                        z30 = z13;
                        j = j1112;
                        z31 = zA;
                        z43 = z11;
                        if (z43) {
                            e0g0 e0g0Var1110 = j0g0.b;
                            if (z31) {
                                iht0Var.o = list4;
                                iht0Var.p = list4;
                                iht0Var.q = list5;
                                iht0Var.r = list2;
                                g45Var2 = g45Var3;
                                iht0Var.s = g45Var2;
                                iht0Var.i = z12;
                                iht0Var.j = z43;
                                iht0Var.k = z30;
                                iht0Var.l = r2;
                                iht0Var.m = z29;
                                iht0Var.t = i;
                                iht0Var.y = j;
                                iht0Var.n = z31;
                                iht0Var.u = r2 == true ? 1 : 0;
                                iht0Var.v = z30 ? 1 : 0;
                                iht0Var.w = z29 ? 1 : 0;
                                iht0Var.z = j;
                                iht0Var.x = i;
                                iht0Var.Y = 5;
                                z48 = r2 == true ? 1 : 0;
                                z49 = false;
                                objA3 = b3c0Var.a(false, iht0Var);
                                if (objA3 == wneVar) {
                                    return wneVar;
                                }
                                z50 = z29 ? 1 : 0;
                                z51 = z31;
                                i9 = i;
                                j10 = j;
                                i10 = z48 ? 1 : 0;
                                z52 = z43;
                                i11 = z50 ? 1 : 0;
                                i12 = z30 ? 1 : 0;
                                i13 = i9;
                                if (i11 != 0) {
                                    z55 = true;
                                } else {
                                    z55 = z49;
                                }
                                if (i12 != 0) {
                                    z56 = true;
                                } else {
                                    z56 = z49;
                                }
                                if (i10 != 0) {
                                    z49 = true;
                                }
                                boolean z5115 = z12;
                                z46 = z49;
                                r3 = z48;
                                str2 = ((m2c0) objA3).c;
                                z45 = z5115;
                                i7 = i13;
                                list15 = list5;
                                z43 = z52;
                                z44 = z56;
                                list16 = list2;
                                z54 = z50;
                                i8 = i9;
                                j8 = j10;
                                j9 = j;
                                z47 = z55;
                                z31 = z51;
                            } else {
                                boolean z5116 = r2 == true ? 1 : 0;
                                g45Var2 = g45Var3;
                                list15 = list5;
                                z44 = z30 ? 1 : 0;
                                i7 = i;
                                i8 = i7;
                                list16 = list2;
                                j8 = j;
                                j9 = j8;
                                z45 = z12;
                                z46 = r2 == true ? 1 : 0;
                                str2 = null;
                                z47 = z29 ? 1 : 0;
                                r3 = r2;
                                z54 = z29;
                            }
                            iht0Var.o = null;
                            iht0Var.p = null;
                            iht0Var.q = null;
                            iht0Var.r = null;
                            iht0Var.s = null;
                            iht0Var.i = z45;
                            iht0Var.j = z43;
                            iht0Var.k = z30;
                            iht0Var.l = r3;
                            iht0Var.m = z54;
                            iht0Var.t = i8;
                            iht0Var.y = j8;
                            iht0Var.n = z31;
                            iht0Var.Y = 6;
                            long j1113 = j9;
                            iht0 iht0Var11 = iht0Var;
                            serializableZ = g45Var2.z(i7, j1113, list16, list15, z47, z44, z46, str2, iht0Var11);
                            if (serializableZ == wneVar) {
                                return wneVar;
                            }
                            obj5 = serializableZ;
                            e0g0 e0g0Var1111 = j0g0.b;
                            g0g0Var = (List) obj5;
                            iunVar = iun.f15405a;
                            z5 = g0g0Var instanceof g0g0;
                            obj = g0g0Var;
                            if (z5) {
                                obj = iunVar;
                            }
                            List list1114 = (List) obj;
                            list1114.getClass();
                            lyeVar.getClass();
                            ArrayList arrayList18 = lyeVar.f;
                            arrayList18.clear();
                            arrayList18.addAll(list1114);
                        }
                        return Unit.f46060a;
                    }
                case 4:
                    boolean z75 = iht0Var.n;
                    j2 = iht0Var.y;
                    i = iht0Var.t;
                    boolean z76 = iht0Var.m;
                    boolean z77 = iht0Var.l;
                    z13 = iht0Var.k;
                    z11 = iht0Var.j;
                    z12 = iht0Var.i;
                    List list26 = iht0Var.p;
                    list14 = iht0Var.o;
                    try {
                        z1x.P(obj5);
                        list13 = list14;
                        b3c0Var = b3c0Var;
                        zA = z75;
                        g45Var3 = g45Var3;
                        lyeVar = lyeVar;
                        wneVar = wneVar;
                        objA2 = obj5;
                        list5 = list26;
                        iht0Var = iht0Var;
                        list4 = null;
                        z35 = z76;
                        r13 = z77;
                        e0g0 e0g0Var1112 = j0g0.b;
                        g0g0Var2 = (List) objA2;
                        z42 = z35;
                        r14 = r13;
                        break;
                    } catch (Throwable th12) {
                        th = th12;
                        zA = z75;
                        z40 = z76 ? 1 : 0;
                        list5 = list26;
                        z41 = z77;
                        list2 = list14;
                        wneVar = wneVar;
                        iht0Var = iht0Var;
                        list4 = null;
                        z39 = z40;
                        r12 = z41;
                        e0g0 e0g0Var1113 = j0g0.b;
                        g0g0Var2 = new g0g0(th);
                        list13 = list2;
                        z42 = z39;
                        r14 = r12;
                        iunVar2 = iun.f15405a;
                        z53 = g0g0Var2 instanceof g0g0;
                        obj4 = g0g0Var2;
                        if (z53) {
                            obj4 = iunVar2;
                        }
                        List list1115 = (List) obj4;
                        list1115.getClass();
                        lyeVar.getClass();
                        lyeVar = lyeVar;
                        ArrayList arrayList19 = lyeVar.e;
                        arrayList19.clear();
                        arrayList19.addAll(list1115);
                        z29 = z42;
                        r2 = r14;
                        list2 = list13;
                        long j1114 = j2;
                        z30 = z13;
                        j = j1114;
                        z31 = zA;
                        z43 = z11;
                        if (z43) {
                            e0g0 e0g0Var1114 = j0g0.b;
                            if (z31) {
                                iht0Var.o = list4;
                                iht0Var.p = list4;
                                iht0Var.q = list5;
                                iht0Var.r = list2;
                                g45Var2 = g45Var3;
                                iht0Var.s = g45Var2;
                                iht0Var.i = z12;
                                iht0Var.j = z43;
                                iht0Var.k = z30;
                                iht0Var.l = r2;
                                iht0Var.m = z29;
                                iht0Var.t = i;
                                iht0Var.y = j;
                                iht0Var.n = z31;
                                iht0Var.u = r2 == true ? 1 : 0;
                                iht0Var.v = z30 ? 1 : 0;
                                iht0Var.w = z29 ? 1 : 0;
                                iht0Var.z = j;
                                iht0Var.x = i;
                                iht0Var.Y = 5;
                                z48 = r2 == true ? 1 : 0;
                                z49 = false;
                                objA3 = b3c0Var.a(false, iht0Var);
                                if (objA3 == wneVar) {
                                    return wneVar;
                                }
                                z50 = z29 ? 1 : 0;
                                z51 = z31;
                                i9 = i;
                                j10 = j;
                                i10 = z48 ? 1 : 0;
                                z52 = z43;
                                i11 = z50 ? 1 : 0;
                                i12 = z30 ? 1 : 0;
                                i13 = i9;
                                if (i11 != 0) {
                                    z55 = true;
                                } else {
                                    z55 = z49;
                                }
                                if (i12 != 0) {
                                    z56 = true;
                                } else {
                                    z56 = z49;
                                }
                                if (i10 != 0) {
                                    z49 = true;
                                }
                                boolean z5117 = z12;
                                z46 = z49;
                                r3 = z48;
                                str2 = ((m2c0) objA3).c;
                                z45 = z5117;
                                i7 = i13;
                                list15 = list5;
                                z43 = z52;
                                z44 = z56;
                                list16 = list2;
                                z54 = z50;
                                i8 = i9;
                                j8 = j10;
                                j9 = j;
                                z47 = z55;
                                z31 = z51;
                            } else {
                                boolean z5118 = r2 == true ? 1 : 0;
                                g45Var2 = g45Var3;
                                list15 = list5;
                                z44 = z30 ? 1 : 0;
                                i7 = i;
                                i8 = i7;
                                list16 = list2;
                                j8 = j;
                                j9 = j8;
                                z45 = z12;
                                z46 = r2 == true ? 1 : 0;
                                str2 = null;
                                z47 = z29 ? 1 : 0;
                                r3 = r2;
                                z54 = z29;
                            }
                            iht0Var.o = null;
                            iht0Var.p = null;
                            iht0Var.q = null;
                            iht0Var.r = null;
                            iht0Var.s = null;
                            iht0Var.i = z45;
                            iht0Var.j = z43;
                            iht0Var.k = z30;
                            iht0Var.l = r3;
                            iht0Var.m = z54;
                            iht0Var.t = i8;
                            iht0Var.y = j8;
                            iht0Var.n = z31;
                            iht0Var.Y = 6;
                            long j1115 = j9;
                            iht0 iht0Var12 = iht0Var;
                            serializableZ = g45Var2.z(i7, j1115, list16, list15, z47, z44, z46, str2, iht0Var12);
                            if (serializableZ == wneVar) {
                                return wneVar;
                            }
                            obj5 = serializableZ;
                            e0g0 e0g0Var1115 = j0g0.b;
                            g0g0Var = (List) obj5;
                            iunVar = iun.f15405a;
                            z5 = g0g0Var instanceof g0g0;
                            obj = g0g0Var;
                            if (z5) {
                                obj = iunVar;
                            }
                            List list1116 = (List) obj;
                            list1116.getClass();
                            lyeVar.getClass();
                            ArrayList arrayList110 = lyeVar.f;
                            arrayList110.clear();
                            arrayList110.addAll(list1116);
                        }
                        return Unit.f46060a;
                    }
                    iunVar2 = iun.f15405a;
                    z53 = g0g0Var2 instanceof g0g0;
                    obj4 = g0g0Var2;
                    if (z53) {
                        obj4 = iunVar2;
                    }
                    List list1117 = (List) obj4;
                    list1117.getClass();
                    lyeVar.getClass();
                    lyeVar = lyeVar;
                    ArrayList arrayList111 = lyeVar.e;
                    arrayList111.clear();
                    arrayList111.addAll(list1117);
                    z29 = z42;
                    r2 = r14;
                    list2 = list13;
                    long j1116 = j2;
                    z30 = z13;
                    j = j1116;
                    z31 = zA;
                    z43 = z11;
                    if (z43) {
                        e0g0 e0g0Var1116 = j0g0.b;
                        if (z31) {
                            iht0Var.o = list4;
                            iht0Var.p = list4;
                            iht0Var.q = list5;
                            iht0Var.r = list2;
                            g45Var2 = g45Var3;
                            iht0Var.s = g45Var2;
                            iht0Var.i = z12;
                            iht0Var.j = z43;
                            iht0Var.k = z30;
                            iht0Var.l = r2;
                            iht0Var.m = z29;
                            iht0Var.t = i;
                            iht0Var.y = j;
                            iht0Var.n = z31;
                            iht0Var.u = r2 == true ? 1 : 0;
                            iht0Var.v = z30 ? 1 : 0;
                            iht0Var.w = z29 ? 1 : 0;
                            iht0Var.z = j;
                            iht0Var.x = i;
                            iht0Var.Y = 5;
                            z48 = r2 == true ? 1 : 0;
                            z49 = false;
                            objA3 = b3c0Var.a(false, iht0Var);
                            if (objA3 == wneVar) {
                                return wneVar;
                            }
                            z50 = z29 ? 1 : 0;
                            z51 = z31;
                            i9 = i;
                            j10 = j;
                            i10 = z48 ? 1 : 0;
                            z52 = z43;
                            i11 = z50 ? 1 : 0;
                            i12 = z30 ? 1 : 0;
                            i13 = i9;
                            if (i11 != 0) {
                                z55 = true;
                            } else {
                                z55 = z49;
                            }
                            if (i12 != 0) {
                                z56 = true;
                            } else {
                                z56 = z49;
                            }
                            if (i10 != 0) {
                                z49 = true;
                            }
                            boolean z5119 = z12;
                            z46 = z49;
                            r3 = z48;
                            str2 = ((m2c0) objA3).c;
                            z45 = z5119;
                            i7 = i13;
                            list15 = list5;
                            z43 = z52;
                            z44 = z56;
                            list16 = list2;
                            z54 = z50;
                            i8 = i9;
                            j8 = j10;
                            j9 = j;
                            z47 = z55;
                            z31 = z51;
                        } else {
                            boolean z51110 = r2 == true ? 1 : 0;
                            g45Var2 = g45Var3;
                            list15 = list5;
                            z44 = z30 ? 1 : 0;
                            i7 = i;
                            i8 = i7;
                            list16 = list2;
                            j8 = j;
                            j9 = j8;
                            z45 = z12;
                            z46 = r2 == true ? 1 : 0;
                            str2 = null;
                            z47 = z29 ? 1 : 0;
                            r3 = r2;
                            z54 = z29;
                        }
                        iht0Var.o = null;
                        iht0Var.p = null;
                        iht0Var.q = null;
                        iht0Var.r = null;
                        iht0Var.s = null;
                        iht0Var.i = z45;
                        iht0Var.j = z43;
                        iht0Var.k = z30;
                        iht0Var.l = r3;
                        iht0Var.m = z54;
                        iht0Var.t = i8;
                        iht0Var.y = j8;
                        iht0Var.n = z31;
                        iht0Var.Y = 6;
                        long j1117 = j9;
                        iht0 iht0Var13 = iht0Var;
                        serializableZ = g45Var2.z(i7, j1117, list16, list15, z47, z44, z46, str2, iht0Var13);
                        if (serializableZ == wneVar) {
                            return wneVar;
                        }
                        obj5 = serializableZ;
                        e0g0 e0g0Var1117 = j0g0.b;
                        g0g0Var = (List) obj5;
                        iunVar = iun.f15405a;
                        z5 = g0g0Var instanceof g0g0;
                        obj = g0g0Var;
                        if (z5) {
                            obj = iunVar;
                        }
                        List list1118 = (List) obj;
                        list1118.getClass();
                        lyeVar.getClass();
                        ArrayList arrayList112 = lyeVar.f;
                        arrayList112.clear();
                        arrayList112.addAll(list1118);
                    }
                    return Unit.f46060a;
                case 5:
                    int i23 = iht0Var.x;
                    long j22 = iht0Var.z;
                    int i24 = iht0Var.w;
                    int i25 = iht0Var.v;
                    int i26 = iht0Var.u;
                    boolean z78 = iht0Var.n;
                    long j23 = iht0Var.y;
                    int i27 = iht0Var.t;
                    boolean z79 = iht0Var.m;
                    boolean z80 = iht0Var.l;
                    boolean z81 = iht0Var.k;
                    boolean z82 = iht0Var.j;
                    boolean z83 = iht0Var.i;
                    g45 g45Var5 = iht0Var.s;
                    List list27 = iht0Var.r;
                    List list28 = iht0Var.q;
                    z1x.P(obj5);
                    iht0 iht0Var14 = iht0Var;
                    objA3 = obj5;
                    wneVar = wneVar;
                    iht0Var = iht0Var14;
                    i9 = i27;
                    list2 = list27;
                    z48 = z80;
                    z50 = z79;
                    i10 = i26;
                    z51 = z78;
                    j10 = j23;
                    z12 = z83;
                    g45Var2 = g45Var5;
                    j = j22;
                    i11 = i24;
                    i12 = i25;
                    z49 = false;
                    z30 = z81;
                    z52 = z82;
                    list5 = list28;
                    i13 = i23;
                    if (i11 != 0) {
                        z55 = true;
                    } else {
                        z55 = z49;
                    }
                    if (i12 != 0) {
                        z56 = true;
                    } else {
                        z56 = z49;
                    }
                    if (i10 != 0) {
                        z49 = true;
                    }
                    boolean z51111 = z12;
                    z46 = z49;
                    r3 = z48;
                    str2 = ((m2c0) objA3).c;
                    z45 = z51111;
                    i7 = i13;
                    list15 = list5;
                    z43 = z52;
                    z44 = z56;
                    list16 = list2;
                    z54 = z50;
                    i8 = i9;
                    j8 = j10;
                    j9 = j;
                    z47 = z55;
                    z31 = z51;
                    iht0Var.o = null;
                    iht0Var.p = null;
                    iht0Var.q = null;
                    iht0Var.r = null;
                    iht0Var.s = null;
                    iht0Var.i = z45;
                    iht0Var.j = z43;
                    iht0Var.k = z30;
                    iht0Var.l = r3;
                    iht0Var.m = z54;
                    iht0Var.t = i8;
                    iht0Var.y = j8;
                    iht0Var.n = z31;
                    iht0Var.Y = 6;
                    long j1118 = j9;
                    iht0 iht0Var15 = iht0Var;
                    serializableZ = g45Var2.z(i7, j1118, list16, list15, z47, z44, z46, str2, iht0Var15);
                    if (serializableZ == wneVar) {
                        return wneVar;
                    }
                    obj5 = serializableZ;
                    e0g0 e0g0Var1118 = j0g0.b;
                    g0g0Var = (List) obj5;
                    iunVar = iun.f15405a;
                    z5 = g0g0Var instanceof g0g0;
                    obj = g0g0Var;
                    if (z5) {
                        obj = iunVar;
                    }
                    List list1119 = (List) obj;
                    list1119.getClass();
                    lyeVar.getClass();
                    ArrayList arrayList113 = lyeVar.f;
                    arrayList113.clear();
                    arrayList113.addAll(list1119);
                    return Unit.f46060a;
                case 6:
                    z1x.P(obj5);
                    e0g0 e0g0Var1119 = j0g0.b;
                    g0g0Var = (List) obj5;
                    iunVar = iun.f15405a;
                    z5 = g0g0Var instanceof g0g0;
                    obj = g0g0Var;
                    if (z5) {
                        obj = iunVar;
                    }
                    List list11110 = (List) obj;
                    list11110.getClass();
                    lyeVar.getClass();
                    ArrayList arrayList114 = lyeVar.f;
                    arrayList114.clear();
                    arrayList114.addAll(list11110);
                    return Unit.f46060a;
                default:
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (Throwable th13) {
            e0g0 e0g0Var20 = j0g0.b;
            g0g0Var = new g0g0(th13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object U(String str, long j, int i, lu0 lu0Var, zje zjeVar) {
        ml1 ml1Var;
        if (zjeVar instanceof ml1) {
            ml1Var = (ml1) zjeVar;
            int i2 = ml1Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml1Var.k = i2 - Integer.MIN_VALUE;
            } else {
                ml1Var = new ml1(this, zjeVar);
            }
        } else {
            ml1Var = new ml1(this, zjeVar);
        }
        Object objC = ml1Var.i;
        wne wneVar = wne.f39444a;
        int i3 = ml1Var.k;
        if (i3 == 0) {
            z1x.P(objC);
            bx0 bx0Var = (bx0) ((il1) this.d).invoke();
            du0 du0Var = new du0(new Long(j), new Integer(i), lu0Var != null ? jiq0.w0(lu0Var) : null);
            ml1Var.k = 1;
            objC = bx0Var.c(str, du0Var, ml1Var);
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
        ((icp) objC).a();
        return Unit.f46060a;
    }

    public Object W(edy edyVar, String str, zje zjeVar) {
        return ((bx0) ((il1) this.d).invoke()).a(edyVar, str, zjeVar);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x030c, code lost:
    
        if (r16.l(r4, r11, r4, r5, 1357, r30, r8) == r9) goto L109;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object X(long r30, boolean r32, int r33, int r34, long r35, java.util.List r37, a.zje r38) {
        /*
            Method dump skipped, instruction units count: 919
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xzp.X(long, boolean, int, int, long, java.util.List, a.zje):java.lang.Object");
    }

    public ani0 Y() {
        qj9 qj9Var = (qj9) ((n5d0) this.g).get();
        qj9Var.getClass();
        ani0 ani0Var = new ani0();
        ani0Var.f1155a = qj9Var;
        return ani0Var;
    }

    @Override // a.lry
    public void a() {
        esg0 esg0Var = (esg0) this.c;
        qlc qlcVar = (qlc) this.e;
        HashMap map = (HashMap) this.b;
        boolean zA0 = false;
        if (qlcVar.equals(kxk0.b)) {
            Object obj = map.get(g950.e("value"));
            ehy ehyVar = obj instanceof ehy ? (ehy) obj : null;
            if (ehyVar != null) {
                Object obj2 = ehyVar.f29728a;
                chy chyVar = obj2 instanceof chy ? (chy) obj2 : null;
                if (chyVar != null) {
                    zA0 = esg0Var.a0(chyVar.f4385a.f34135a);
                }
            }
        }
        if (zA0 || esg0Var.a0(qlcVar)) {
            return;
        }
        ((List) this.f).add(new u83(((wm40) this.d).I(), map, (gmk0) this.g));
    }

    @Override // a.lry
    public void b(g950 g950Var, qlc qlcVar, g950 g950Var2) {
        ((HashMap) this.b).put(g950Var, new h0o(qlcVar, g950Var2));
    }

    @Override // a.lry
    public void c(g950 g950Var, Object obj) {
        r2e r2eVarG0 = jtv.G0((zm40) ((esg0) this.f41764a).c, obj);
        if (r2eVarG0 == null) {
            r2eVarG0 = new g2o("Unsupported annotation argument: " + g950Var);
        }
        ((HashMap) this.b).put(g950Var, r2eVarG0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(String str, long j, int i, lu0 lu0Var, zje zjeVar) {
        jl1 jl1Var;
        if (zjeVar instanceof jl1) {
            jl1Var = (jl1) zjeVar;
            int i2 = jl1Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jl1Var.k = i2 - Integer.MIN_VALUE;
            } else {
                jl1Var = new jl1(this, zjeVar);
            }
        } else {
            jl1Var = new jl1(this, zjeVar);
        }
        Object objN = jl1Var.i;
        wne wneVar = wne.f39444a;
        int i3 = jl1Var.k;
        if (i3 == 0) {
            z1x.P(objN);
            bx0 bx0Var = (bx0) ((il1) this.d).invoke();
            du0 du0Var = new du0(new Long(j), new Integer(i), lu0Var != null ? jiq0.w0(lu0Var) : null);
            jl1Var.k = 1;
            objN = bx0Var.n(str, du0Var, jl1Var);
            if (objN == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objN);
        }
        ((icp) objN).a();
        return Unit.f46060a;
    }

    public boolean e() {
        kvt kvtVar = (kvt) this.d;
        y9s y9sVar = y9s.c;
        w5z w5zVar = kvtVar.f18970a;
        return w5zVar.s(y9sVar).isEmpty() && w5zVar.s(y9s.d).isEmpty();
    }

    public void f() {
        int i;
        Iterator it = ((ArrayList) this.e).iterator();
        while (true) {
            if (!it.hasNext()) {
                i = 1;
                break;
            }
            nj50 nj50Var = (nj50) it.next();
            int i2 = nj50Var.c.c;
            i = 3;
            if (i2 == 3 || (i2 == 2 && nj50Var.e == 0)) {
                break;
            }
        }
        oqd oqdVar = (oqd) this.f41764a;
        if (i != oqdVar.c) {
            oqdVar.z(i);
        }
    }

    public void g(String str) {
        File file = new File((File) this.b, str);
        if (file.exists() && T(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    @Override // a.ngw0
    public void h(xfw0 xfw0Var) {
        String str = (String) this.c;
        String str2 = (String) this.f41764a;
        List list = (List) ((yhw0) xfw0Var).f42657a.f23789a;
        if (list == null || list.isEmpty()) {
            ((ngw0) this.b).mo2zza("No users.");
            return;
        }
        biw0 biw0Var = (biw0) list.get(0);
        owp0 owp0Var = biw0Var.f;
        List list2 = owp0Var != null ? (List) owp0Var.b : null;
        if (list2 != null && !list2.isEmpty()) {
            if (TextUtils.isEmpty(str2)) {
                ((niw0) list2.get(0)).e = str;
            } else {
                for (int i = 0; i < list2.size(); i++) {
                    if (((niw0) list2.get(i)).d.equals(str2)) {
                        ((niw0) list2.get(i)).e = str;
                        break;
                    }
                }
            }
        }
        biw0Var.j = ((Boolean) this.d).booleanValue();
        biw0Var.k = (com.google.firebase.auth.zzc) this.e;
        ((hcp0) this.f).d((zzaia) this.g, biw0Var);
    }

    @Override // a.lry
    public lry i(qlc qlcVar, g950 g950Var) {
        ArrayList arrayList = new ArrayList();
        xzp xzpVarC0 = ((esg0) this.f41764a).c0(qlcVar, gmk0.x0, arrayList);
        gr00 gr00Var = new gr00();
        gr00Var.b = xzpVarC0;
        gr00Var.c = this;
        gr00Var.e = g950Var;
        gr00Var.d = arrayList;
        gr00Var.f11760a = xzpVarC0;
        return gr00Var;
    }

    @Override // a.lry
    public mry j(g950 g950Var) {
        return new mii0((esg0) this.f41764a, g950Var, this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k(String str, c7p c7pVar, int i, zje zjeVar) {
        kl1 kl1Var;
        if (zjeVar instanceof kl1) {
            kl1Var = (kl1) zjeVar;
            int i2 = kl1Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kl1Var.k = i2 - Integer.MIN_VALUE;
            } else {
                kl1Var = new kl1(this, zjeVar);
            }
        } else {
            kl1Var = new kl1(this, zjeVar);
        }
        Object objI = kl1Var.i;
        wne wneVar = wne.f39444a;
        int i3 = kl1Var.k;
        if (i3 == 0) {
            z1x.P(objI);
            bx0 bx0Var = (bx0) ((il1) this.d).invoke();
            w6p w6pVar = new w6p(c7pVar, new Integer(i));
            kl1Var.k = 1;
            objI = bx0Var.i(str, w6pVar, kl1Var);
            if (objI == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objI);
        }
        ((icp) objI).a();
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object l(String str, String str2, zje zjeVar) {
        ll1 ll1Var;
        if (zjeVar instanceof ll1) {
            ll1Var = (ll1) zjeVar;
            int i = ll1Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ll1Var.k = i - Integer.MIN_VALUE;
            } else {
                ll1Var = new ll1(this, zjeVar);
            }
        } else {
            ll1Var = new ll1(this, zjeVar);
        }
        Object obj = ll1Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ll1Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            bx0 bx0Var = (bx0) ((il1) this.d).invoke();
            ll1Var.k = 1;
            if (bx0Var.d(str, str2, ll1Var) == wneVar) {
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

    public int m(nj50 nj50Var) {
        nj50 nj50Var2;
        Iterator it = ((ArrayList) this.e).iterator();
        int i = 0;
        while (it.hasNext() && (nj50Var2 = (nj50) it.next()) != nj50Var) {
            i += nj50Var2.e;
        }
        return i;
    }

    @Override // a.lry
    public void n(g950 g950Var, tlc tlcVar) {
        ((HashMap) this.b).put(g950Var, new ehy(new chy(tlcVar)));
    }

    public prc o() {
        return new prc((qj9) ((n5d0) this.g).get());
    }

    public u3u0 p(int i) {
        u3u0 u3u0Var = (u3u0) this.f;
        if (u3u0Var.b) {
            u3u0Var = new u3u0();
        } else {
            u3u0Var.b = true;
        }
        int i2 = i;
        for (nj50 nj50Var : (ArrayList) this.e) {
            int i3 = nj50Var.e;
            if (i3 > i2) {
                u3u0Var.c = nj50Var;
                u3u0Var.f35015a = i2;
                break;
            }
            i2 -= i3;
        }
        if (((nj50) u3u0Var.c) != null) {
            return u3u0Var;
        }
        jf4.o(twn.m(i, "Cannot find wrapper for "));
        return null;
    }

    public Object q(int i, int i2, int i3, int i4, String str, String str2, boolean z, String str3, Boolean bool, String str4, zje zjeVar) {
        wc0 wc0Var = (wc0) ((il1) this.e).invoke();
        m2c0 m2c0VarA = ((x2c0) this.b).a();
        Integer intOrNull = m2c0VarA != null ? StringsKt.toIntOrNull(m2c0VarA.c) : null;
        Boolean bool2 = z ? Boolean.TRUE : null;
        String str5 = str2.length() == 0 ? null : str2;
        Boolean bool3 = Boolean.TRUE;
        return wc0Var.a(i, 22, intOrNull, new Integer(i2), 1, new Integer(1357), bool2, new Integer(i4), new Integer(i3), str5, str, bool.equals(bool3) ? bool3 : null, str3, str4.length() == 0 ? null : str4, new fk9(false), zjeVar);
    }

    public pj9 r() {
        return new pj9((qj9) ((n5d0) this.g).get(), ((cih) ((vqc) this.b).b).a());
    }

    public qj9 s() {
        return (qj9) ((n5d0) this.g).get();
    }

    public dnq t(long j, sip sipVar, ypl0 ypl0Var) {
        yje yjeVar = null;
        byte b = 3;
        byte b2 = 5;
        return new dnq(aoq.c(aoq.c(new vsg0(new o3s(this, sipVar, yjeVar, b)), new gxt(null, this, j, sipVar, (byte) 0)), new fe0(yjeVar, ypl0Var, this, b2)), new rl2(b, yjeVar, b2), (byte) 1);
    }

    public vsc u() {
        return new vsc((qj9) ((n5d0) this.g).get(), (byte) 0);
    }

    public vsc v() {
        return new vsc((qj9) ((n5d0) this.g).get(), (byte) 1);
    }

    public dgk w() {
        return new dgk(new ivn(new zri((us00) this.b, (vwb0) this.c)));
    }

    public gmq x(sip sipVar, long j, long j2, boolean z) {
        if (j2 <= 0) {
            e0g0 e0g0Var = j0g0.b;
            return new eu4(new j0g0(iun.f15405a), (byte) 12);
        }
        yje yjeVar = null;
        return new dnq(new lsa(aoq.c(aoq.c(new vsg0(new o3s((Object) this, (Object) sipVar, yjeVar, (byte) 8)), new gyu(null, this, sipVar, j, j2)), new xpp(yjeVar, (Object) this, z, (byte) 9)), (byte) 4), new rl2(3, yjeVar, (byte) 24), (byte) 1);
    }

    public Object y(long j, int i, String str, String str2, boolean z, int i2, String str3, zje zjeVar) {
        m2c0 m2c0VarA = ((x2c0) this.b).a();
        Integer intOrNull = m2c0VarA != null ? StringsKt.toIntOrNull(m2c0VarA.c) : null;
        str2.getClass();
        LinkedHashMap linkedHashMapH = xp20.h(new Pair("limit", Integer.valueOf(i)), new Pair("skip", 0), new Pair("whence", 22), new Pair("fcountry", Integer.valueOf(i2)), new Pair("ref", 1), new Pair("lng", str3), new Pair("gr", 1357), new Pair("productSort", str));
        if (intOrNull != null) {
            linkedHashMapH.put("country", intOrNull);
        }
        if (j != nw80.t.getId()) {
            linkedHashMapH.put("partId", Long.valueOf(j));
        }
        if (!StringsKt.W(str2)) {
            linkedHashMapH.put("productNameSubstr", str2);
        }
        if (z) {
            linkedHashMapH.put("test", Boolean.valueOf(z));
        }
        return ((cq0) ((il1) this.c).invoke()).d(linkedHashMapH, new fk9(false), zjeVar);
    }

    @Override // a.ngw0
    /* JADX INFO: renamed from: zza */
    public void mo2zza(String str) {
        ((ngw0) this.b).mo2zza(str);
    }

    public xzp(nmt0 nmt0Var, ngw0 ngw0Var, String str, String str2, Boolean bool, com.google.firebase.auth.zzc zzcVar, hcp0 hcp0Var, zzaia zzaiaVar) {
        this.b = ngw0Var;
        this.f41764a = str;
        this.c = str2;
        this.d = bool;
        this.e = zzcVar;
        this.f = hcp0Var;
        this.g = zzaiaVar;
    }

    public xzp(g45 g45Var, zfo zfoVar, edo edoVar, gst0 gst0Var, khf0 khf0Var, j1q0 j1q0Var, b3c0 b3c0Var) {
        zfoVar.getClass();
        edoVar.getClass();
        gst0Var.getClass();
        j1q0Var.getClass();
        b3c0Var.getClass();
        this.f41764a = g45Var;
        this.b = zfoVar;
        this.c = edoVar;
        this.d = gst0Var;
        this.e = khf0Var;
        this.f = j1q0Var;
        this.g = b3c0Var;
    }

    public xzp(knf0 knf0Var, tgk tgkVar, uyn uynVar, us3 us3Var, ane0 ane0Var, ht2 ht2Var, fjj fjjVar) {
        knf0Var.getClass();
        tgkVar.getClass();
        us3Var.getClass();
        ane0Var.getClass();
        ht2Var.getClass();
        fjjVar.getClass();
        this.f41764a = knf0Var;
        this.b = tgkVar;
        this.c = uynVar;
        this.d = us3Var;
        this.e = ane0Var;
        this.f = ht2Var;
        this.g = fjjVar;
    }

    public xzp(hnu hnuVar, knf0 knf0Var, n530 n530Var, us3 us3Var, eio eioVar, he1 he1Var, vby vbyVar) {
        knf0Var.getClass();
        n530Var.getClass();
        us3Var.getClass();
        vbyVar.getClass();
        this.f41764a = hnuVar;
        this.b = knf0Var;
        this.c = n530Var;
        this.d = us3Var;
        this.e = eioVar;
        this.f = he1Var;
        this.g = vbyVar;
    }

    public xzp(xfu xfuVar, uzc uzcVar, ehf0 ehf0Var, pmi pmiVar, gst0 gst0Var, v7i v7iVar, pru pruVar) {
        gst0Var.getClass();
        this.f41764a = xfuVar;
        this.b = uzcVar;
        this.c = ehf0Var;
        this.d = pmiVar;
        this.e = gst0Var;
        this.f = v7iVar;
        this.g = maz.b(new b6u(pruVar, (byte) 4));
    }

    public xzp(pru pruVar, j3c j3cVar, rtu rtuVar, v7i v7iVar, edu eduVar, x4u x4uVar, g2v g2vVar) {
        this.f41764a = j3cVar;
        this.b = rtuVar;
        this.c = v7iVar;
        this.d = eduVar;
        this.e = x4uVar;
        this.f = g2vVar;
        this.g = maz.b(new hc0(pruVar, (byte) 27));
    }

    public xzp(gii0 gii0Var, x2c0 x2c0Var) {
        gii0Var.getClass();
        x2c0Var.getClass();
        this.f41764a = gii0Var;
        this.b = x2c0Var;
        this.c = new il1(this, (byte) 0);
        this.d = new il1(this, (byte) 1);
        this.e = new il1(this, (byte) 2);
        this.f = new il1(this, (byte) 3);
        this.g = new il1(this, (byte) 4);
    }

    public xzp(ctf0 ctf0Var, mne mneVar, wdk0 wdk0Var, rpt rptVar, svu svuVar, kt2 kt2Var, zr1 zr1Var) {
        ctf0Var.getClass();
        wdk0Var.getClass();
        kt2Var.getClass();
        this.f41764a = ctf0Var;
        this.b = mneVar;
        this.c = wdk0Var;
        this.d = rptVar;
        this.e = svuVar;
        this.f = kt2Var;
        this.g = zr1Var;
    }

    public xzp(jyz jyzVar, btt0 btt0Var, knf0 knf0Var, us00 us00Var, gii0 gii0Var) {
        this.f41764a = jyzVar;
        this.b = gii0Var;
        this.c = btt0Var;
        this.d = knf0Var;
        this.e = us00Var;
        byte b = 2;
        this.f = mbl.b(new gji(this, 1, b));
        this.g = mbl.b(new gji(this, 0, b));
    }

    public xzp(ctf0 ctf0Var, n3w n3wVar, Boolean bool, SaleDataModel saleDataModel, Double d, m1e m1eVar) {
        this.f41764a = ctf0Var;
        this.b = n3wVar;
        this.c = bool;
        this.d = saleDataModel;
        this.e = d;
        this.f = m1eVar;
        this.g = new fri(this, (byte) 18);
    }

    public xzp(mne mneVar, ctf0 ctf0Var, gii0 gii0Var, knf0 knf0Var, yvn0 yvn0Var, s31 s31Var, e41 e41Var) {
        ctf0Var.getClass();
        gii0Var.getClass();
        knf0Var.getClass();
        yvn0Var.getClass();
        this.f41764a = mneVar;
        this.b = ctf0Var;
        this.c = gii0Var;
        this.d = knf0Var;
        this.e = yvn0Var;
        this.f = s31Var;
        this.g = e41Var;
    }

    public /* synthetic */ xzp(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        this.f41764a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
        this.g = obj7;
    }

    public xzp(d1p d1pVar, String str, zg zgVar, pru pruVar, q7d0 q7d0Var, ctf0 ctf0Var) {
        this.f41764a = str;
        this.b = pruVar;
        this.c = q7d0Var;
        this.d = ctf0Var;
        this.e = zgVar;
        this.f = d1pVar;
        this.g = n0k0.a(new ugi(this, (byte) 26));
    }

    public xzp(oqd oqdVar, nqd nqdVar) {
        this.c = new ArrayList();
        this.d = new IdentityHashMap();
        this.e = new ArrayList();
        this.f = new u3u0();
        this.f41764a = oqdVar;
        if (nqdVar.b) {
            h8m0 h8m0Var = new h8m0();
            h8m0Var.f12634a = new SparseArray();
            h8m0Var.b = 0;
            this.b = h8m0Var;
        } else {
            ilp0 ilp0Var = new ilp0();
            ilp0Var.f14992a = new SparseArray();
            this.b = ilp0Var;
        }
        this.g = new dpi0((byte) 12);
    }

    public xzp(mne mneVar, vqc vqcVar, oj9 oj9Var, b3c0 b3c0Var, gst0 gst0Var, sjl0 sjl0Var) {
        this.f41764a = oj9Var;
        this.b = vqcVar;
        this.c = mneVar;
        this.d = sjl0Var;
        this.e = b3c0Var;
        this.f = gst0Var;
        this.g = mbl.b(new pai(this, (byte) 26));
    }

    public xzp(bxi bxiVar, j1q0 j1q0Var, xaq0 xaq0Var, us00 us00Var, vwb0 vwb0Var, g1q0 g1q0Var, fjj fjjVar) {
        this.f41764a = j1q0Var;
        this.b = us00Var;
        this.c = vwb0Var;
        this.d = xaq0Var;
        this.e = bxiVar;
        this.f = g1q0Var;
        this.g = fjjVar;
    }

    public xzp(esg0 esg0Var, wm40 wm40Var, qlc qlcVar, List list, gmk0 gmk0Var) {
        this.c = esg0Var;
        this.d = wm40Var;
        this.e = qlcVar;
        this.f = list;
        this.g = gmk0Var;
        this.f41764a = esg0Var;
        this.b = new HashMap();
    }
}
