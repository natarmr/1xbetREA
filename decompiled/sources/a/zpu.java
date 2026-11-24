package a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class zpu implements fjx, hlc, n1x, z4n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44777a;
    public final Object b;
    public Object c;

    public zpu(gii0 gii0Var, byte b) {
        this.f44777a = b;
        switch (b) {
            case 10:
                gii0Var.getClass();
                this.b = gii0Var;
                this.c = new bdv(this, (byte) 25);
                break;
            case 21:
                this.b = gii0Var;
                this.c = new rx00(this, (byte) 12);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                gii0Var.getClass();
                this.b = gii0Var;
                this.c = new np30(this, (byte) 21);
                break;
            default:
                gii0Var.getClass();
                this.b = gii0Var;
                this.c = new bdv(this, (byte) 16);
                break;
        }
    }

    public static ArrayList f(va20 va20Var, gx3 gx3Var) {
        Object obj = gx3Var.get(va20Var);
        if (obj == null) {
            obj = lun.f20680a;
            obj.getClass();
        }
        Map map = (Map) obj;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(((wa20) entry.getKey()).a(((Boolean) entry.getValue()).booleanValue()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((String) obj2).length() > 0) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    @Override // a.z4n0
    public boolean a() {
        return true;
    }

    @Override // a.z4n0
    public a5n0 apply() {
        return ((r7z) this.b).d(this.c);
    }

    @Override // a.z4n0
    public boolean b(uq uqVar) {
        return true;
    }

    public void c(String str, PrintWriter printWriter) {
        rq00 rq00Var = (rq00) this.c;
        if (rq00Var.b.c <= 0) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Loaders:");
        String strConcat = str.concat("    ");
        int i = 0;
        while (true) {
            gnk0 gnk0Var = rq00Var.b;
            if (i >= gnk0Var.c) {
                return;
            }
            pq00 pq00Var = (pq00) gnk0Var.d(i);
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(rq00Var.b.b(i));
            printWriter.print(": ");
            printWriter.println(pq00Var.toString());
            printWriter.print(strConcat);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(strConcat);
            printWriter.print("mLoader=");
            printWriter.println(pq00Var.l);
            saw0 saw0Var = pq00Var.l;
            String strConcat2 = strConcat.concat("  ");
            saw0Var.getClass();
            printWriter.print(strConcat2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mListener=");
            printWriter.println(saw0Var.f31903a);
            if (saw0Var.b || saw0Var.e) {
                printWriter.print(strConcat2);
                printWriter.print("mStarted=");
                printWriter.print(saw0Var.b);
                printWriter.print(" mContentChanged=");
                printWriter.print(saw0Var.e);
                printWriter.print(" mProcessingChange=");
                printWriter.println(false);
            }
            if (saw0Var.c || saw0Var.d) {
                printWriter.print(strConcat2);
                printWriter.print("mAbandoned=");
                printWriter.print(saw0Var.c);
                printWriter.print(" mReset=");
                printWriter.println(saw0Var.d);
            }
            if (saw0Var.g != null) {
                printWriter.print(strConcat2);
                printWriter.print("mTask=");
                printWriter.print(saw0Var.g);
                printWriter.print(" waiting=");
                saw0Var.g.getClass();
                printWriter.println(false);
            }
            if (saw0Var.h != null) {
                printWriter.print(strConcat2);
                printWriter.print("mCancellingTask=");
                printWriter.print(saw0Var.h);
                printWriter.print(" waiting=");
                saw0Var.h.getClass();
                printWriter.println(false);
            }
            if (pq00Var.n != null) {
                printWriter.print(strConcat);
                printWriter.print("mCallbacks=");
                printWriter.println(pq00Var.n);
                qq00 qq00Var = pq00Var.n;
                String strConcat3 = strConcat.concat("  ");
                qq00Var.getClass();
                printWriter.print(strConcat3);
                printWriter.print("mDeliveredData=");
                printWriter.println(qq00Var.b);
            }
            printWriter.print(strConcat);
            printWriter.print("mData=");
            saw0 saw0Var2 = pq00Var.l;
            Object objD = pq00Var.d();
            saw0Var2.getClass();
            StringBuilder sb = new StringBuilder(64);
            if (objD == null) {
                sb.append("null");
            } else {
                Class<?> cls = objD.getClass();
                sb.append(cls.getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(cls)));
                sb.append("}");
            }
            printWriter.println(sb.toString());
            printWriter.print(strConcat);
            printWriter.print("mStarted=");
            printWriter.println(pq00Var.c > 0);
            i++;
        }
    }

    @Override // a.hlc
    public glc d(qlc qlcVar) {
        qlcVar.getClass();
        yox yoxVar = (yox) this.b;
        jfk jfkVar = (jfk) this.c;
        ((lwf) jfkVar.c().c).getClass();
        jre0 jre0VarU = c9x.u(yoxVar, qlcVar, vd40.g);
        if (jre0VarU == null) {
            return null;
        }
        bqe0.a(jre0VarU.f16999a).equals(qlcVar);
        return jfkVar.g(jre0VarU);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:112|47|(7:50|51|(2:54|52)|104|56|100|101)|90) */
    /* JADX WARN: Code duplicated, block: B:112:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:50:0x0127  */
    /* JADX WARN: Code duplicated, block: B:54:0x0154 A[Catch: all -> 0x00a5, LOOP:0: B:52:0x014e->B:54:0x0154, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x00a5, blocks: (B:51:0x0137, B:52:0x014e, B:54:0x0154, B:26:0x00a0), top: B:102:0x00a0 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0172 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0174 A[Catch: all -> 0x017d, TryCatch #6 {all -> 0x017d, blocks: (B:94:0x0202, B:95:0x0209, B:96:0x020a, B:61:0x016c, B:64:0x0174, B:69:0x0180, B:73:0x018a, B:75:0x018e, B:78:0x01ae, B:80:0x01b9, B:82:0x01c1, B:86:0x01cb, B:88:0x01cf, B:91:0x01ef, B:92:0x01f8), top: B:114:0x016c }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0180 A[Catch: all -> 0x017d, TryCatch #6 {all -> 0x017d, blocks: (B:94:0x0202, B:95:0x0209, B:96:0x020a, B:61:0x016c, B:64:0x0174, B:69:0x0180, B:73:0x018a, B:75:0x018e, B:78:0x01ae, B:80:0x01b9, B:82:0x01c1, B:86:0x01cb, B:88:0x01cf, B:91:0x01ef, B:92:0x01f8), top: B:114:0x016c }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0187  */
    /* JADX WARN: Code duplicated, block: B:72:0x0189  */
    /* JADX WARN: Code duplicated, block: B:75:0x018e A[Catch: all -> 0x017d, TryCatch #6 {all -> 0x017d, blocks: (B:94:0x0202, B:95:0x0209, B:96:0x020a, B:61:0x016c, B:64:0x0174, B:69:0x0180, B:73:0x018a, B:75:0x018e, B:78:0x01ae, B:80:0x01b9, B:82:0x01c1, B:86:0x01cb, B:88:0x01cf, B:91:0x01ef, B:92:0x01f8), top: B:114:0x016c }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ae A[Catch: all -> 0x017d, TryCatch #6 {all -> 0x017d, blocks: (B:94:0x0202, B:95:0x0209, B:96:0x020a, B:61:0x016c, B:64:0x0174, B:69:0x0180, B:73:0x018a, B:75:0x018e, B:78:0x01ae, B:80:0x01b9, B:82:0x01c1, B:86:0x01cb, B:88:0x01cf, B:91:0x01ef, B:92:0x01f8), top: B:114:0x016c }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b9 A[Catch: all -> 0x017d, TryCatch #6 {all -> 0x017d, blocks: (B:94:0x0202, B:95:0x0209, B:96:0x020a, B:61:0x016c, B:64:0x0174, B:69:0x0180, B:73:0x018a, B:75:0x018e, B:78:0x01ae, B:80:0x01b9, B:82:0x01c1, B:86:0x01cb, B:88:0x01cf, B:91:0x01ef, B:92:0x01f8), top: B:114:0x016c }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01c1 A[Catch: all -> 0x017d, TryCatch #6 {all -> 0x017d, blocks: (B:94:0x0202, B:95:0x0209, B:96:0x020a, B:61:0x016c, B:64:0x0174, B:69:0x0180, B:73:0x018a, B:75:0x018e, B:78:0x01ae, B:80:0x01b9, B:82:0x01c1, B:86:0x01cb, B:88:0x01cf, B:91:0x01ef, B:92:0x01f8), top: B:114:0x016c }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:88:0x01cf A[Catch: all -> 0x017d, TryCatch #6 {all -> 0x017d, blocks: (B:94:0x0202, B:95:0x0209, B:96:0x020a, B:61:0x016c, B:64:0x0174, B:69:0x0180, B:73:0x018a, B:75:0x018e, B:78:0x01ae, B:80:0x01b9, B:82:0x01c1, B:86:0x01cb, B:88:0x01cf, B:91:0x01ef, B:92:0x01f8), top: B:114:0x016c }] */
    /* JADX WARN: Code duplicated, block: B:91:0x01ef A[Catch: all -> 0x017d, TryCatch #6 {all -> 0x017d, blocks: (B:94:0x0202, B:95:0x0209, B:96:0x020a, B:61:0x016c, B:64:0x0174, B:69:0x0180, B:73:0x018a, B:75:0x018e, B:78:0x01ae, B:80:0x01b9, B:82:0x01c1, B:86:0x01cb, B:88:0x01cf, B:91:0x01ef, B:92:0x01f8), top: B:114:0x016c }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01f8 A[Catch: all -> 0x017d, TryCatch #6 {all -> 0x017d, blocks: (B:94:0x0202, B:95:0x0209, B:96:0x020a, B:61:0x016c, B:64:0x0174, B:69:0x0180, B:73:0x018a, B:75:0x018e, B:78:0x01ae, B:80:0x01b9, B:82:0x01c1, B:86:0x01cb, B:88:0x01cf, B:91:0x01ef, B:92:0x01f8), top: B:114:0x016c }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0200 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0202 A[Catch: all -> 0x017d, TryCatch #6 {all -> 0x017d, blocks: (B:94:0x0202, B:95:0x0209, B:96:0x020a, B:61:0x016c, B:64:0x0174, B:69:0x0180, B:73:0x018a, B:75:0x018e, B:78:0x01ae, B:80:0x01b9, B:82:0x01c1, B:86:0x01cb, B:88:0x01cf, B:91:0x01ef, B:92:0x01f8), top: B:114:0x016c }] */
    /* JADX WARN: Code duplicated, block: B:96:0x020a A[Catch: all -> 0x017d, TRY_LEAVE, TryCatch #6 {all -> 0x017d, blocks: (B:94:0x0202, B:95:0x0209, B:96:0x020a, B:61:0x016c, B:64:0x0174, B:69:0x0180, B:73:0x018a, B:75:0x018e, B:78:0x01ae, B:80:0x01b9, B:82:0x01c1, B:86:0x01cb, B:88:0x01cf, B:91:0x01ef, B:92:0x01f8), top: B:114:0x016c }] */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x016b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ec, code lost:
    
        if (a.qcc.P(r10, r7) == r3) goto L90;
     */
    /* JADX WARN: Path cross not found for [B:12:0x002c, B:20:0x0061], limit reached: 112 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x01b6 -> B:66:0x017a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(java.lang.String r21, a.zje r22) {
        /*
            Method dump skipped, instruction units count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zpu.e(java.lang.String, a.zje):java.lang.Object");
    }

    public utb g() {
        return aoq.c(((ort) this.c).a(), new za60((yje) null, (Object) this, (byte) 2));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:13|14|90|29|(8:32|25|86|33|34|84|35|(1:38))|77) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:32|25|86|33|34|84|35|(1:38)) */
    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:53:0x0107  */
    /* JADX WARN: Code duplicated, block: B:56:0x010c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0122  */
    /* JADX WARN: Code duplicated, block: B:67:0x0124  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x0165  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e1, code lost:
    
        r10 = r11;
        r12 = r1;
        r1 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e7, code lost:
    
        r17 = r1;
        r1 = r13;
        r13 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ec, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ed, code lost:
    
        r18 = r13;
        r13 = r1;
        r1 = r4;
        r4 = r18;
        r18 = r12;
        r12 = r2;
        r2 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0105, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0114, code lost:
    
        if ((r0 instanceof a.zhi0) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0116, code lost:
    
        r14 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011b, code lost:
    
        if (r14.f != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0122, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0124, code lost:
    
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x012a, code lost:
    
        if (a.hic.C(r0) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x012d, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x012e, code lost:
    
        if (r2 > 3) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0133, code lost:
    
        java.lang.System.out.println((java.lang.Object) a.b1j.g(r2, "error (", "): ", r0));
        r1.j = r13;
        r1.k = r12;
        r1.l = null;
        r1.i = r10;
        r1.m = r4;
        r1.n = r2;
        r1.q = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0154, code lost:
    
        if (a.qcc.O(3000, r1) == r3) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0157, code lost:
    
        r1 = a.j0g0.b;
        r0 = new a.g0g0(r0);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0154 -> B:14:0x003e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(long r21, a.zje r23, java.lang.Long r24) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zpu.i(long, a.zje, java.lang.Long):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:37:0x008c  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        if (r14 == r0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(a.zje r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zpu.j(a.zje):java.lang.Object");
    }

    @Override // a.n1x
    public void k(o1x o1xVar, r1o r1oVar) {
        if (((Drawable) this.b) == null) {
            ((fxy) this.c).l.setVisibility(8);
        }
    }

    public boolean l() {
        Context contextO0;
        androidx.fragment.app.e eVarC;
        List listP;
        kxq kxqVar;
        List listP2;
        byte b = this.f44777a;
        Object obj = this.b;
        switch (b) {
            case 12:
                if (!((tgk) ((rrc) this.c).b).g()) {
                    jvq jvqVar = (jvq) obj;
                    WeakReference weakReference = jvqVar.b;
                    Fragment fragment = null;
                    Fragment fragment2 = (weakReference == null || (kxqVar = (kxq) weakReference.get()) == null || (listP2 = kxqVar.r().c.p()) == null) ? null : (Fragment) CollectionsKt.f0(listP2);
                    if (fragment2 != null && (eVarC = fragment2.C()) != null && (listP = eVarC.c.p()) != null) {
                        fragment = (Fragment) CollectionsKt.f0(listP);
                    }
                    if (fragment == null || !fragment.S()) {
                        contextO0 = (fragment2 == null || !fragment2.S()) ? jvqVar.f17216a : fragment2.o0();
                    } else {
                        contextO0 = fragment.o0();
                    }
                    if (new nhf0(new o58(contextO0, (byte) 0)).d(255) == 0) {
                        return true;
                    }
                }
                return false;
            default:
                q7d0 q7d0Var = (q7d0) obj;
                return ((pru) this.c).a().w0 && q7d0Var.a().getBoolean("FIRST_REGISTRATION_SUCCESS", false) && !q7d0Var.a().getBoolean("KZ_GREETING_SHOWED", false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r8 == r0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(int r9, long r10, a.zje r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof a.h3v
            if (r0 == 0) goto L14
            r0 = r12
            a.h3v r0 = (a.h3v) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.m = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            a.h3v r0 = new a.h3v
            r0.<init>(r8, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.k
            a.wne r0 = a.wne.f39444a
            int r1 = r6.m
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L41
            if (r1 == r3) goto L37
            if (r1 != r2) goto L30
            a.z1x.P(r12)
            a.j0g0 r12 = (a.j0g0) r12
            java.lang.Object r8 = r12.f15681a
            goto L6f
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            r8 = 0
            return r8
        L37:
            byte r9 = r6.j
            long r10 = r6.i
            a.z1x.P(r12)
        L3e:
            r3 = r9
            r4 = r10
            goto L55
        L41:
            a.z1x.P(r12)
            java.lang.Object r12 = r8.c
            a.pmi r12 = (a.pmi) r12
            r6.i = r10
            r6.j = r9
            r6.m = r3
            java.io.Serializable r12 = r12.x(r6)
            if (r12 != r0) goto L3e
            goto L6e
        L55:
            java.lang.Number r12 = (java.lang.Number) r12
            int r9 = r12.intValue()
            java.lang.Object r8 = r8.b
            r1 = r8
            a.svu r1 = (a.svu) r1
            r6.i = r4
            r6.j = r3
            r6.m = r2
            r7 = 0
            r2 = r9
            java.lang.Object r8 = r1.m(r2, r3, r4, r6, r7)
            if (r8 != r0) goto L6f
        L6e:
            return r0
        L6f:
            a.e0g0 r9 = a.j0g0.b
            boolean r9 = r8 instanceof a.g0g0
            if (r9 != 0) goto L84
            a.vdg r8 = (a.vdg) r8     // Catch: java.lang.Throwable -> L7a
            java.util.ArrayList r8 = r8.f37230a     // Catch: java.lang.Throwable -> L7a
            return r8
        L7a:
            r0 = move-exception
            r8 = r0
            a.e0g0 r9 = a.j0g0.b
            a.g0g0 r9 = new a.g0g0
            r9.<init>(r8)
            return r9
        L84:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.zpu.m(int, long, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object n(int i, zje zjeVar, String str, String str2) {
        at70 at70Var;
        if (zjeVar instanceof at70) {
            at70Var = (at70) zjeVar;
            int i2 = at70Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                at70Var.k = i2 - Integer.MIN_VALUE;
            } else {
                at70Var = new at70(this, zjeVar);
            }
        } else {
            at70Var = new at70(this, zjeVar);
        }
        at70 at70Var2 = at70Var;
        Object obj = at70Var2.i;
        wne wneVar = wne.f39444a;
        int i3 = at70Var2.k;
        if (i3 != 0) {
            if (i3 == 1) {
                z1x.P(obj);
                return ((j0g0) obj).f15681a;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        Object obj2 = ((ql) this.c).f28911a.f25430a.get();
        obj2.getClass();
        pl plVar = (pl) obj2;
        ps70 ps70Var = (ps70) this.b;
        String str3 = plVar.f27158a;
        String str4 = !StringsKt.W(str3) ? str3 : null;
        String str5 = plVar.b;
        String str6 = !StringsKt.W(str5) ? str5 : null;
        at70Var2.k = 1;
        Object objB = ps70Var.b(str, i, str2, str4, str6, at70Var2);
        return objB == wneVar ? wneVar : objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object o(zje zjeVar) {
        xx00 xx00Var;
        if (zjeVar instanceof xx00) {
            xx00Var = (xx00) zjeVar;
            int i = xx00Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                xx00Var.k = i - Integer.MIN_VALUE;
            } else {
                xx00Var = new xx00(this, zjeVar);
            }
        } else {
            xx00Var = new xx00(this, zjeVar);
        }
        Object obj = xx00Var.i;
        wne wneVar = wne.f39444a;
        int i2 = xx00Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            jru jruVar = (jru) this.b;
            String strA = ((btt0) this.c).a();
            xx00Var.k = 1;
            if (((px00) ((tpv) jruVar.b).invoke()).a(strA, 1.0f, xx00Var) == wneVar) {
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

    @Override // a.fjx
    public bjx toInstant() {
        throw new w4x(((String) this.b) + " when parsing an Instant from \"" + ny9.d0(64, (String) this.c) + '\"');
    }

    public String toString() {
        switch (this.f44777a) {
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                StringBuilder sb = new StringBuilder(128);
                sb.append("LoaderManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                Class<?> cls = ((clz) this.b).getClass();
                sb.append(cls.getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(cls)));
                sb.append("}}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // a.z4n0
    public void cancel() {
    }

    @Override // a.n1x
    public void h(o1x o1xVar, hhn0 hhn0Var) {
    }

    public zpu(kt2 kt2Var) {
        this.f44777a = (byte) 22;
        kt2Var.getClass();
        this.b = kt2Var;
        this.c = iun.f15405a;
    }

    public zpu(jru jruVar, btt0 btt0Var) {
        this.f44777a = (byte) 20;
        btt0Var.getClass();
        this.b = jruVar;
        this.c = btt0Var;
    }

    public zpu(ps70 ps70Var, ql qlVar) {
        this.f44777a = (byte) 29;
        ps70Var.getClass();
        qlVar.getClass();
        this.b = ps70Var;
        this.c = qlVar;
    }

    public zpu(q7d0 q7d0Var, pru pruVar) {
        this.f44777a = (byte) 13;
        q7d0Var.getClass();
        this.b = q7d0Var;
        this.c = pruVar;
    }

    public zpu(pmi pmiVar, svu svuVar) {
        this.f44777a = (byte) 7;
        this.c = pmiVar;
        this.b = svuVar;
    }

    public zpu(zas0 zas0Var, fsd fsdVar) {
        this.f44777a = (byte) 8;
        fsdVar.getClass();
        this.b = zas0Var;
        this.c = fsdVar;
    }

    public /* synthetic */ zpu(Object obj, Object obj2, byte b) {
        this.f44777a = b;
        this.b = obj;
        this.c = obj2;
    }

    public zpu(lbu lbuVar, lgz lgzVar) {
        this.f44777a = (byte) 17;
        lgzVar.getClass();
        this.b = lbuVar;
        this.c = lgzVar;
    }

    public zpu(q7d0 q7d0Var, zoq0 zoq0Var) {
        this.f44777a = (byte) 28;
        q7d0Var.getClass();
        zoq0Var.getClass();
        this.b = q7d0Var;
        this.c = zoq0Var;
    }

    public zpu(clz clzVar, piu0 piu0Var) {
        this.f44777a = (byte) 19;
        this.b = clzVar;
        piu0Var.getClass();
        vbf vbfVar = vbf.b;
        vbfVar.getClass();
        h0q0 h0q0Var = new h0q0(piu0Var, rq00.d, vbfVar);
        sgy sgyVarB = sre0.f32672a.b(rq00.class);
        String strT = ny9.T(sgyVarB);
        if (strT != null) {
            this.c = (rq00) h0q0Var.t(sgyVarB, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strT));
        } else {
            jf4.o("Local and anonymous classes can not be ViewModels");
            throw null;
        }
    }

    public zpu(rcf0 rcf0Var, int[] iArr) {
        this.f44777a = (byte) 25;
        this.b = b4x.o(rcf0Var);
        this.c = iArr;
    }
}
