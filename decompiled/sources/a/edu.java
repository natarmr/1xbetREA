package a;

import java.io.IOException;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.statistic.rating.api.di.RatingStatisticScreenParams;

/* JADX INFO: loaded from: classes3.dex */
public final class edu implements z4n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7636a;
    public Object b;
    public Object c;

    public edu(gii0 gii0Var) {
        this.f7636a = (byte) 19;
        gii0Var.getClass();
        this.c = gii0Var;
        this.b = new bdv(this, (byte) 19);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003a A[Catch: IOException -> 0x006f, TryCatch #0 {IOException -> 0x006f, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x005b), top: B:30:0x0000 }] */
    public static edu q(String... strArr) {
        String str;
        try {
            qg9[] qg9VarArr = new qg9[strArr.length];
            f99 f99Var = new f99();
            for (int i = 0; i < strArr.length; i++) {
                String str2 = strArr[i];
                String[] strArr2 = ndy.e;
                f99Var.V(34);
                int length = str2.length();
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    char cCharAt = str2.charAt(i3);
                    if (cCharAt < 128) {
                        str = strArr2[cCharAt];
                        if (str != null) {
                            if (i2 < i3) {
                                f99Var.b0(i2, i3, str2);
                            }
                            f99Var.c0(str);
                            i2 = i3 + 1;
                        }
                    } else {
                        if (cCharAt == 8232) {
                            str = "\\u2028";
                        } else if (cCharAt == 8233) {
                            str = "\\u2029";
                        }
                        if (i2 < i3) {
                            f99Var.b0(i2, i3, str2);
                        }
                        f99Var.c0(str);
                        i2 = i3 + 1;
                    }
                }
                if (i2 < length) {
                    f99Var.b0(i2, length, str2);
                }
                f99Var.V(34);
                f99Var.readByte();
                qg9VarArr[i] = f99Var.q0(f99Var.b);
            }
            String[] strArr3 = (String[]) strArr.clone();
            int i4 = z680.d;
            return new edu((Object) strArr3, (Object) xvw.S(qg9VarArr), (byte) 24);
        } catch (IOException e) {
            c99.l(e);
            return null;
        }
    }

    @Override // a.z4n0
    public boolean a() {
        h390 h390Var;
        k7z k7zVarE = e();
        if (k7zVarE == null || (h390Var = k7zVarE.f) == null) {
            return true;
        }
        return h390Var.c();
    }

    @Override // a.z4n0
    public a5n0 apply() {
        r7z r7zVar = (r7z) this.c;
        k7z k7zVarE = e();
        if (k7zVarE != null) {
            r7zVar.b(k7zVarE, false);
        }
        return r7zVar.d(this.b);
    }

    @Override // a.z4n0
    public boolean b(uq uqVar) {
        k7z k7zVarE = e();
        h390 h390Var = k7zVarE != null ? k7zVarE.f : null;
        if (h390Var == null || h390Var.c()) {
            return true;
        }
        rfk0 rfk0VarJ = vdx.J();
        Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
        rfk0 rfk0VarW = vdx.W(rfk0VarJ);
        try {
            boolean zE = h390Var.e(uqVar);
            vdx.Y(rfk0VarJ, rfk0VarW, function1E);
            return zE;
        } catch (Throwable th) {
            try {
                k7zVarE.getClass();
                throw th;
            } catch (Throwable th2) {
                vdx.Y(rfk0VarJ, rfk0VarW, function1E);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(String str, zje zjeVar) {
        vlu vluVar;
        pek pekVar;
        if (zjeVar instanceof vlu) {
            vluVar = (vlu) zjeVar;
            int i = vluVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                vluVar.l = i - Integer.MIN_VALUE;
            } else {
                vluVar = new vlu(this, zjeVar);
            }
        } else {
            vluVar = new vlu(this, zjeVar);
        }
        Object obj = vluVar.j;
        wne wneVar = wne.f39444a;
        int i2 = vluVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            pek pekVar2 = (pek) this.b;
            ulu uluVar = (ulu) ((gii0) this.c).b(sre0.f32672a.b(ulu.class));
            vluVar.i = pekVar2;
            vluVar.l = 1;
            Object objA = uluVar.a(str, "application/vnd.xenvelop+json", vluVar);
            if (objA == wneVar) {
                return wneVar;
            }
            obj = objA;
            pekVar = pekVar2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pekVar = vluVar.i;
            z1x.P(obj);
        }
        ehk ehkVar = (ehk) ((dx5) obj).a();
        pekVar.getClass();
        String str2 = ehkVar.f7813a;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = ehkVar.b;
        return new bhk(str2, str3 != null ? str3 : "");
    }

    @Override // a.z4n0
    public void cancel() {
        k7z k7zVarE = e();
        if ((k7zVarE != null ? k7zVarE.f : null) != null) {
            ((r7z) this.c).h(this.b);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(2:4|(1:6)(1:7))(1:7)|8|102|(1:(1:(1:(5:13|14|15|88|(7:103|31|32|100|33|34|(2:36|86)(1:37))(1:(2:92|93)(1:94)))(2:16|17))(6:18|19|20|73|74|(7:103|31|32|100|33|34|(2:36|86)(1:37))(1:(2:92|93)(1:94))))(4:21|98|22|23))(4:27|28|29|(7:103|31|32|100|33|34|(2:36|86)(1:37))(1:(2:92|93)(1:94)))|105|38|(3:40|(4:43|(2:45|111)(1:110)|48|41)|109)(1:49)|(1:51)|52|114|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:103|31|32|100|33|34|(2:36|86)(1:37)) */
    /* JADX WARN: Code duplicated, block: B:103:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0165 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0120  */
    /* JADX WARN: Code duplicated, block: B:37:0x0123  */
    /* JADX WARN: Code duplicated, block: B:40:0x0140 A[Catch: all -> 0x015f, TryCatch #4 {all -> 0x015f, blocks: (B:38:0x0134, B:40:0x0140, B:41:0x0149, B:43:0x014f, B:45:0x015b, B:51:0x016b), top: B:105:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x014f A[Catch: all -> 0x015f, TryCatch #4 {all -> 0x015f, blocks: (B:38:0x0134, B:40:0x0140, B:41:0x0149, B:43:0x014f, B:45:0x015b, B:51:0x016b), top: B:105:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x015b A[Catch: all -> 0x015f, TryCatch #4 {all -> 0x015f, blocks: (B:38:0x0134, B:40:0x0140, B:41:0x0149, B:43:0x014f, B:45:0x015b, B:51:0x016b), top: B:105:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0167  */
    /* JADX WARN: Code duplicated, block: B:51:0x016b A[Catch: all -> 0x015f, TRY_LEAVE, TryCatch #4 {all -> 0x015f, blocks: (B:38:0x0134, B:40:0x0140, B:41:0x0149, B:43:0x014f, B:45:0x015b, B:51:0x016b), top: B:105:0x0134 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0184 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x0186 A[Catch: all -> 0x0249, TryCatch #2 {all -> 0x0249, blocks: (B:14:0x0045, B:52:0x016d, B:58:0x017e, B:61:0x0186, B:63:0x0190, B:67:0x019c, B:69:0x01a0, B:75:0x01cf, B:76:0x01dd, B:78:0x01e8, B:82:0x01f3, B:84:0x01f7, B:89:0x0223, B:90:0x0230, B:92:0x0240, B:93:0x0247, B:94:0x0248, B:19:0x007b, B:28:0x00dc), top: B:102:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0190 A[Catch: all -> 0x0249, TryCatch #2 {all -> 0x0249, blocks: (B:14:0x0045, B:52:0x016d, B:58:0x017e, B:61:0x0186, B:63:0x0190, B:67:0x019c, B:69:0x01a0, B:75:0x01cf, B:76:0x01dd, B:78:0x01e8, B:82:0x01f3, B:84:0x01f7, B:89:0x0223, B:90:0x0230, B:92:0x0240, B:93:0x0247, B:94:0x0248, B:19:0x007b, B:28:0x00dc), top: B:102:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0199  */
    /* JADX WARN: Code duplicated, block: B:66:0x019b  */
    /* JADX WARN: Code duplicated, block: B:69:0x01a0 A[Catch: all -> 0x0249, TryCatch #2 {all -> 0x0249, blocks: (B:14:0x0045, B:52:0x016d, B:58:0x017e, B:61:0x0186, B:63:0x0190, B:67:0x019c, B:69:0x01a0, B:75:0x01cf, B:76:0x01dd, B:78:0x01e8, B:82:0x01f3, B:84:0x01f7, B:89:0x0223, B:90:0x0230, B:92:0x0240, B:93:0x0247, B:94:0x0248, B:19:0x007b, B:28:0x00dc), top: B:102:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x01cf A[Catch: all -> 0x0249, TryCatch #2 {all -> 0x0249, blocks: (B:14:0x0045, B:52:0x016d, B:58:0x017e, B:61:0x0186, B:63:0x0190, B:67:0x019c, B:69:0x01a0, B:75:0x01cf, B:76:0x01dd, B:78:0x01e8, B:82:0x01f3, B:84:0x01f7, B:89:0x0223, B:90:0x0230, B:92:0x0240, B:93:0x0247, B:94:0x0248, B:19:0x007b, B:28:0x00dc), top: B:102:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01dd A[Catch: all -> 0x0249, TryCatch #2 {all -> 0x0249, blocks: (B:14:0x0045, B:52:0x016d, B:58:0x017e, B:61:0x0186, B:63:0x0190, B:67:0x019c, B:69:0x01a0, B:75:0x01cf, B:76:0x01dd, B:78:0x01e8, B:82:0x01f3, B:84:0x01f7, B:89:0x0223, B:90:0x0230, B:92:0x0240, B:93:0x0247, B:94:0x0248, B:19:0x007b, B:28:0x00dc), top: B:102:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01e8 A[Catch: all -> 0x0249, TryCatch #2 {all -> 0x0249, blocks: (B:14:0x0045, B:52:0x016d, B:58:0x017e, B:61:0x0186, B:63:0x0190, B:67:0x019c, B:69:0x01a0, B:75:0x01cf, B:76:0x01dd, B:78:0x01e8, B:82:0x01f3, B:84:0x01f7, B:89:0x0223, B:90:0x0230, B:92:0x0240, B:93:0x0247, B:94:0x0248, B:19:0x007b, B:28:0x00dc), top: B:102:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f7 A[Catch: all -> 0x0249, TryCatch #2 {all -> 0x0249, blocks: (B:14:0x0045, B:52:0x016d, B:58:0x017e, B:61:0x0186, B:63:0x0190, B:67:0x019c, B:69:0x01a0, B:75:0x01cf, B:76:0x01dd, B:78:0x01e8, B:82:0x01f3, B:84:0x01f7, B:89:0x0223, B:90:0x0230, B:92:0x0240, B:93:0x0247, B:94:0x0248, B:19:0x007b, B:28:0x00dc), top: B:102:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0219  */
    /* JADX WARN: Code duplicated, block: B:89:0x0223 A[Catch: all -> 0x0249, TryCatch #2 {all -> 0x0249, blocks: (B:14:0x0045, B:52:0x016d, B:58:0x017e, B:61:0x0186, B:63:0x0190, B:67:0x019c, B:69:0x01a0, B:75:0x01cf, B:76:0x01dd, B:78:0x01e8, B:82:0x01f3, B:84:0x01f7, B:89:0x0223, B:90:0x0230, B:92:0x0240, B:93:0x0247, B:94:0x0248, B:19:0x007b, B:28:0x00dc), top: B:102:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0230 A[Catch: all -> 0x0249, TryCatch #2 {all -> 0x0249, blocks: (B:14:0x0045, B:52:0x016d, B:58:0x017e, B:61:0x0186, B:63:0x0190, B:67:0x019c, B:69:0x01a0, B:75:0x01cf, B:76:0x01dd, B:78:0x01e8, B:82:0x01f3, B:84:0x01f7, B:89:0x0223, B:90:0x0230, B:92:0x0240, B:93:0x0247, B:94:0x0248, B:19:0x007b, B:28:0x00dc), top: B:102:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x023e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0240 A[Catch: all -> 0x0249, TryCatch #2 {all -> 0x0249, blocks: (B:14:0x0045, B:52:0x016d, B:58:0x017e, B:61:0x0186, B:63:0x0190, B:67:0x019c, B:69:0x01a0, B:75:0x01cf, B:76:0x01dd, B:78:0x01e8, B:82:0x01f3, B:84:0x01f7, B:89:0x0223, B:90:0x0230, B:92:0x0240, B:93:0x0247, B:94:0x0248, B:19:0x007b, B:28:0x00dc), top: B:102:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0248 A[Catch: all -> 0x0249, TRY_LEAVE, TryCatch #2 {all -> 0x0249, blocks: (B:14:0x0045, B:52:0x016d, B:58:0x017e, B:61:0x0186, B:63:0x0190, B:67:0x019c, B:69:0x01a0, B:75:0x01cf, B:76:0x01dd, B:78:0x01e8, B:82:0x01f3, B:84:0x01f7, B:89:0x0223, B:90:0x0230, B:92:0x0240, B:93:0x0247, B:94:0x0248, B:19:0x007b, B:28:0x00dc), top: B:102:0x0025 }] */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x015f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0160, code lost:
    
        r1 = r15;
        r15 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0171, code lost:
    
        r18 = r13;
        r13 = r0;
        r0 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0177, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0178, code lost:
    
        r14 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x017b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x017c, code lost:
    
        r14 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v18, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x0219 -> B:88:0x021d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0223 -> B:30:0x00ec). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable d(long r24, a.zje r26) {
        /*
            Method dump skipped, instruction units count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.edu.d(long, a.zje):java.io.Serializable");
    }

    public k7z e() {
        r7z r7zVar = (r7z) this.c;
        e7z e7zVar = (e7z) r7zVar.j.g(this.b);
        if (e7zVar != null) {
            return (k7z) r7zVar.f.g(e7zVar);
        }
        return null;
    }

    public synchronized Map f() {
        Map mapUnmodifiableMap;
        mapUnmodifiableMap = (Map) this.b;
        if (mapUnmodifiableMap == null) {
            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap((HashMap) this.c));
            this.b = mapUnmodifiableMap;
        }
        return mapUnmodifiableMap;
    }

    public aw20 g() {
        t730 t730VarN = ufx.N(((pru) this.b).a().h1);
        aw20 aw20Var = (aw20) ((v230) ((pyu) ((lsn) this.c).f20589a).f27815a).b.getValue();
        return aw20Var != null ? aw20.a(aw20Var, null, null, null, null, null, t730VarN, 31) : art.d(t730VarN);
    }

    public vsg0 h(Set set, sip sipVar, c3c0 c3c0Var, boolean z) {
        or30 or30Var;
        set.getClass();
        c3c0Var.getClass();
        cu cuVar = (cu) this.c;
        jvn jvnVarB = ((uzc) this.b).b();
        lnf0 lnf0VarD = ((knf0) cuVar.b).d();
        jo20 jo20Var = new jo20();
        qbt.a(jo20Var, jvnVarB);
        qbt.b(jo20Var, set);
        qbt.c(c3c0Var.f3668a, jo20Var);
        qbt.g(lnf0VarD.b, jo20Var);
        qbt.h(jo20Var);
        qbt.i(jo20Var, z);
        qbt.j(lnf0VarD.f20342a, jo20Var);
        qbt.l(jo20Var);
        qbt.o(jo20Var, c3c0Var.b, c3c0Var.c);
        qbt.p(jo20Var);
        jo20 jo20VarB = jo20Var.b();
        jmb jmbVar = (jmb) cuVar.d;
        int iOrdinal = sipVar.ordinal();
        if (iOrdinal == 0) {
            or30Var = jmbVar.b;
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return null;
            }
            or30Var = jmbVar.f16756a;
        }
        return gfx.R(or30Var, kpb.v(sipVar), null, new xg0(cuVar, sipVar, jo20VarB, null, (byte) 6), 252);
    }

    public Serializable i(String str, zje zjeVar) {
        if (str.length() != 0) {
            return str;
        }
        Serializable serializableB = ((nvu) this.c).B(((xr) this.b).i(), zjeVar);
        return serializableB == wne.f39444a ? serializableB : (String) serializableB;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public Object j(double d, long j, long j2, zje zjeVar) {
        r6v r6vVar;
        double d2;
        long j3;
        long j4;
        zyu0 zyu0Var;
        double d3;
        if (zjeVar instanceof r6v) {
            r6vVar = (r6v) zjeVar;
            int i = r6vVar.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                r6vVar.p = i - Integer.MIN_VALUE;
            } else {
                r6vVar = new r6v(this, zjeVar);
            }
        } else {
            r6vVar = new r6v(this, zjeVar);
        }
        r6v r6vVar2 = r6vVar;
        Object objW = r6vVar2.n;
        wne wneVar = wne.f39444a;
        int i2 = r6vVar2.p;
        if (i2 == 0) {
            z1x.P(objW);
            reu reuVar = (reu) this.c;
            r6vVar2.i = j;
            r6vVar2.j = j2;
            r6vVar2.k = d;
            r6vVar2.p = 1;
            objW = ((fuj0) reuVar.b).w(d, j, j2, r6vVar2);
            if (objW != wneVar) {
                d2 = d;
                j3 = j;
                j4 = j2;
            }
            return wneVar;
        }
        if (i2 == 1) {
            d2 = r6vVar2.k;
            j4 = r6vVar2.j;
            j3 = r6vVar2.i;
            z1x.P(objW);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d3 = r6vVar2.l;
            zyu0Var = r6vVar2.m;
            z1x.P(objW);
        }
        return new vyu0(d3, zyu0Var.c, (String) objW);
        zyu0 zyu0Var2 = (zyu0) objW;
        double d4 = zyu0Var2.f45222a;
        q0u q0uVar = (q0u) this.b;
        String str = zyu0Var2.b;
        r6vVar2.m = zyu0Var2;
        r6vVar2.i = j3;
        r6vVar2.j = j4;
        r6vVar2.k = d2;
        r6vVar2.l = d4;
        r6vVar2.p = 2;
        Object objA = q0uVar.a(str, r6vVar2);
        if (objA != wneVar) {
            objW = objA;
            zyu0Var = zyu0Var2;
            d3 = d4;
            return new vyu0(d3, zyu0Var.c, (String) objW);
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0067  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:39:0x009d  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ac A[DONT_INVERT, PHI: r4
  0x00ac: PHI (r4v6 java.lang.Boolean) = (r4v0 java.lang.Boolean), (r4v0 java.lang.Boolean), (r4v7 java.lang.Boolean) binds: [B:25:0x0065, B:38:0x009b, B:43:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v7 java.lang.Object, still in use, count: 2, list:
          (r1v7 java.lang.Object) from 0x0059: PHI (r1 I:??) = (r1v4 java.lang.Object), (r1v7 java.lang.Object) binds: [B:21:0x0058, B:72:0x0059] A[DONT_GENERATE, DONT_INLINE]
          (r1v7 java.lang.Object) from 0x0051: CHECK_CAST (a.hf6) (r1v7 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public java.lang.Object k(int r12, a.zje r13) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.edu.k(int, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object l(long j, Long l, int i, int i2, int i3, zje zjeVar) {
        x2v x2vVar;
        if (zjeVar instanceof x2v) {
            x2vVar = (x2v) zjeVar;
            int i4 = x2vVar.k;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                x2vVar.k = i4 - Integer.MIN_VALUE;
            } else {
                x2vVar = new x2v(this, zjeVar);
            }
        } else {
            x2vVar = new x2v(this, zjeVar);
        }
        Object objD0 = x2vVar.i;
        wne wneVar = wne.f39444a;
        int i5 = x2vVar.k;
        if (i5 == 0) {
            z1x.P(objD0);
            j9s0 j9s0Var = (j9s0) this.c;
            boolean zA = ((iqt) this.b).f15225a.a();
            x2vVar.k = 1;
            objD0 = qjj.d0(j9s0Var.f16155a.b, new i9s0(j9s0Var, i2, zA, j, i, l, i3, null), x2vVar);
            if (objD0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i5 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD0);
        }
        return ((d88) objD0).f5633a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object m(zje zjeVar) {
        xn00 xn00Var;
        String str;
        String str2;
        Object objA;
        String str3;
        String str4;
        zfo zfoVar = (zfo) this.b;
        if (zjeVar instanceof xn00) {
            xn00Var = (xn00) zjeVar;
            int i = xn00Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                xn00Var.m = i - Integer.MIN_VALUE;
            } else {
                xn00Var = new xn00(this, zjeVar);
            }
        } else {
            xn00Var = new xn00(this, zjeVar);
        }
        Object objA2 = xn00Var.k;
        wne wneVar = wne.f39444a;
        int i2 = xn00Var.m;
        if (i2 == 0) {
            z1x.P(objA2);
            xn00Var.m = 1;
            objA2 = zfoVar.a(1L, xn00Var);
            if (objA2 != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            z1x.P(objA2);
        } else {
            if (i2 == 2) {
                str = xn00Var.i;
                z1x.P(objA2);
                str2 = ((ueo) objA2).b;
                xn00Var.i = str;
                xn00Var.j = str2;
                xn00Var.m = 3;
                objA = zfoVar.a(3L, xn00Var);
                if (objA != wneVar) {
                    str3 = str2;
                    objA2 = objA;
                    str4 = str;
                }
                return wneVar;
            }
            if (i2 != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str3 = xn00Var.j;
            str4 = xn00Var.i;
            z1x.P(objA2);
        }
        String str5 = ((ueo) objA2).b;
        mii0 mii0Var = (mii0) this.c;
        brm0.B(str4, str3, str5);
        gs6 gs6Var = (gs6) mii0Var.c;
        gs6Var.getClass();
        gs6Var.g = new gio(str4, str3, str5);
        return Unit.f46060a;
        String str6 = ((ueo) objA2).b;
        xn00Var.i = str6;
        xn00Var.m = 2;
        Object objA3 = zfoVar.a(2L, xn00Var);
        if (objA3 != wneVar) {
            str = str6;
            objA2 = objA3;
            str2 = ((ueo) objA2).b;
            xn00Var.i = str;
            xn00Var.j = str2;
            xn00Var.m = 3;
            objA = zfoVar.a(3L, xn00Var);
            if (objA != wneVar) {
                str3 = str2;
                objA2 = objA;
                str4 = str;
                String str7 = ((ueo) objA2).b;
                mii0 mii0Var2 = (mii0) this.c;
                brm0.B(str4, str3, str7);
                gs6 gs6Var2 = (gs6) mii0Var2.c;
                gs6Var2.getClass();
                gs6Var2.g = new gio(str4, str3, str7);
                return Unit.f46060a;
            }
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(Integer num, zje zjeVar) {
        sfu sfuVar;
        b8u b8uVar;
        Long l;
        if (zjeVar instanceof sfu) {
            sfuVar = (sfu) zjeVar;
            int i = sfuVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                sfuVar.m = i - Integer.MIN_VALUE;
            } else {
                sfuVar = new sfu(this, zjeVar);
            }
        } else {
            sfuVar = new sfu(this, zjeVar);
        }
        Object obj = sfuVar.k;
        wne wneVar = wne.f39444a;
        int i2 = sfuVar.m;
        if (i2 == 0) {
            z1x.P(obj);
            b8u b8uVar2 = (b8u) this.b;
            khf0 khf0Var = (khf0) this.c;
            bm5 bm5Var = bm5.e;
            sfuVar.i = num;
            sfuVar.j = b8uVar2;
            sfuVar.m = 1;
            Serializable serializableG = khf0.G(khf0Var, bm5Var, sfuVar);
            if (serializableG != wneVar) {
                obj = serializableG;
                b8uVar = b8uVar2;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b8uVar = sfuVar.j;
        num = sfuVar.i;
        z1x.P(obj);
        long j = ((ql5) obj).f28916a;
        if (num != null) {
            int iIntValue = num.intValue();
            Calendar calendar = Calendar.getInstance();
            calendar.add(5, iIntValue);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            l = new Long(calendar.getTimeInMillis() / 1000);
        } else {
            l = null;
        }
        sfuVar.i = null;
        sfuVar.j = null;
        sfuVar.m = 2;
        Object objE = ((kki) b8uVar.f2175a).e(j, sfuVar, l);
        return objE == wneVar ? wneVar : objE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    public Object o(RatingStatisticScreenParams ratingStatisticScreenParams, int i, j6i0 j6i0Var, int i2, zje zjeVar) {
        equ equVar;
        int i3;
        byte b;
        if (zjeVar instanceof equ) {
            equVar = (equ) zjeVar;
            int i4 = equVar.n;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                equVar.n = i4 - Integer.MIN_VALUE;
            } else {
                equVar = new equ(this, zjeVar);
            }
        } else {
            equVar = new equ(this, zjeVar);
        }
        equ equVar2 = equVar;
        Object objQ = equVar2.l;
        wne wneVar = wne.f39444a;
        int i5 = equVar2.n;
        if (i5 == 0) {
            z1x.P(objQ);
            xsu xsuVar = (xsu) this.c;
            equVar2.j = i;
            equVar2.k = i2;
            equVar2.n = 1;
            objQ = ((z220) xsuVar.f41434a).q(ratingStatisticScreenParams, i, i2, i * i2, j6i0Var, equVar2);
            if (objQ != wneVar) {
                i3 = i;
                b = i2;
            }
        }
        if (i5 != 1) {
            if (i5 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            h8e0 h8e0Var = equVar2.i;
            z1x.P(objQ);
            return h8e0Var;
        }
        byte b2 = equVar2.k;
        i3 = equVar2.j;
        z1x.P(objQ);
        b = b2;
        h8e0 h8e0Var2 = (h8e0) objQ;
        uiu uiuVar = (uiu) this.b;
        equVar2.i = h8e0Var2;
        equVar2.j = i3;
        equVar2.k = b;
        equVar2.n = 2;
        r7e0 r7e0Var = (r7e0) uiuVar.f35749a.c;
        LinkedHashMap linkedHashMap = r7e0Var.f29971a;
        h8e0Var2.getClass();
        if (r7e0Var.b == null) {
            r7e0Var.b = h8e0Var2.e;
        }
        if (i3 == 0) {
            linkedHashMap.clear();
        }
        linkedHashMap.put(Integer.valueOf(i3), h8e0Var2);
        return Unit.f46060a == wneVar ? wneVar : h8e0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Object p(boolean z, long j, long j2, jvn jvnVar, zje zjeVar) {
        fwu fwuVar;
        y3v y3vVar;
        long j3;
        boolean z2;
        long j4;
        jvn jvnVar2;
        if (zjeVar instanceof fwu) {
            fwuVar = (fwu) zjeVar;
            int i = fwuVar.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                fwuVar.p = i - Integer.MIN_VALUE;
            } else {
                fwuVar = new fwu(this, zjeVar);
            }
        } else {
            fwuVar = new fwu(this, zjeVar);
        }
        fwu fwuVar2 = fwuVar;
        Object obj = fwuVar2.n;
        wne wneVar = wne.f39444a;
        int i2 = fwuVar2.p;
        if (i2 == 0) {
            z1x.P(obj);
            y3vVar = (y3v) this.c;
            x0u x0uVar = (x0u) this.b;
            fwuVar2.l = jvnVar;
            fwuVar2.m = y3vVar;
            fwuVar2.i = z;
            fwuVar2.j = j;
            j3 = j2;
            fwuVar2.k = j3;
            fwuVar2.p = 1;
            Object objC = x0uVar.c(fwuVar2);
            if (objC != wneVar) {
                z2 = z;
                j4 = j;
                jvnVar2 = jvnVar;
                obj = objC;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j5 = fwuVar2.k;
        long j6 = fwuVar2.j;
        boolean z3 = fwuVar2.i;
        y3vVar = fwuVar2.m;
        jvnVar2 = fwuVar2.l;
        z1x.P(obj);
        j3 = j5;
        j4 = j6;
        z2 = z3;
        int iIntValue = ((Number) obj).intValue();
        fwuVar2.l = null;
        fwuVar2.m = null;
        fwuVar2.i = z2;
        fwuVar2.j = j4;
        fwuVar2.k = j3;
        fwuVar2.p = 2;
        Serializable serializableI = y3vVar.i(iIntValue, j3, j4, z2, jvnVar2, fwuVar2);
        return serializableI == wneVar ? wneVar : serializableI;
    }

    public /* synthetic */ edu(Object obj, Object obj2, byte b) {
        this.f7636a = b;
        this.c = obj;
        this.b = obj2;
    }

    public edu(lsn lsnVar, art artVar, pru pruVar) {
        this.f7636a = (byte) 4;
        this.c = lsnVar;
        this.b = pruVar;
    }

    public /* synthetic */ edu(byte b) {
        this.f7636a = b;
    }

    public edu(gii0 gii0Var, pek pekVar) {
        this.f7636a = (byte) 5;
        gii0Var.getClass();
        this.c = gii0Var;
        this.b = pekVar;
    }

    public edu(j9s0 j9s0Var, iqt iqtVar) {
        this.f7636a = (byte) 15;
        j9s0Var.getClass();
        this.c = j9s0Var;
        this.b = iqtVar;
    }

    public edu(nr nrVar, uzc uzcVar) {
        this.f7636a = (byte) 1;
        uzcVar.getClass();
        this.c = nrVar;
        this.b = uzcVar;
    }

    public edu(mii0 mii0Var, zfo zfoVar) {
        this.f7636a = (byte) 28;
        zfoVar.getClass();
        this.c = mii0Var;
        this.b = zfoVar;
    }

    public edu(ani0 ani0Var, sjl0 sjl0Var) {
        this.f7636a = (byte) 10;
        sjl0Var.getClass();
        this.c = ani0Var;
        this.b = sjl0Var;
    }

    public edu(knf0 knf0Var, zri zriVar) {
        this.f7636a = (byte) 25;
        knf0Var.getClass();
        this.c = knf0Var;
        this.b = zriVar;
    }

    public edu(qgd qgdVar, gst0 gst0Var) {
        this.f7636a = (byte) 7;
        gst0Var.getClass();
        this.c = qgdVar;
        this.b = gst0Var;
    }

    public edu(gxu gxuVar, gst0 gst0Var) {
        this.f7636a = (byte) 9;
        gst0Var.getClass();
        this.c = gxuVar;
        this.b = gst0Var;
    }

    public edu() {
        this.f7636a = (byte) 20;
        this.c = new HashMap();
    }
}
