package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class nmo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f23782a;

    public nmo(gii0 gii0Var, byte b) {
        gii0Var.getClass();
        switch (b) {
            case 6:
                this.f23782a = new wgn(gii0Var, (byte) 16);
                break;
            case 7:
                this.f23782a = new wgn(gii0Var, (byte) 25);
                break;
            default:
                this.f23782a = new wgn(gii0Var, (byte) 14);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(long j, zje zjeVar) {
        hos hosVar;
        if (zjeVar instanceof hos) {
            hosVar = (hos) zjeVar;
            int i = hosVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                hosVar.k = i - Integer.MIN_VALUE;
            } else {
                hosVar = new hos(this, zjeVar);
            }
        } else {
            hosVar = new hos(this, zjeVar);
        }
        Object objB = hosVar.i;
        wne wneVar = wne.f39444a;
        int i2 = hosVar.k;
        if (i2 == 0) {
            z1x.P(objB);
            aqr aqrVar = (aqr) ((wgn) this.f23782a).invoke();
            hosVar.k = 1;
            objB = aqrVar.b(j, hosVar);
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
        return ((dx5) objB).a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:78|30|(1:33)|65) */
    /* JADX WARN: Code duplicated, block: B:33:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:41:0x0113 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0115 A[Catch: all -> 0x01ad, TryCatch #2 {all -> 0x01ad, blocks: (B:14:0x0042, B:35:0x0101, B:70:0x01a4, B:71:0x01ab, B:72:0x01ac, B:39:0x010d, B:42:0x0115, B:43:0x011d, B:47:0x0127, B:49:0x012b, B:53:0x014c, B:55:0x0158, B:57:0x0160, B:61:0x016a, B:63:0x016e, B:66:0x018c, B:68:0x0199, B:19:0x006c, B:27:0x00ad), top: B:80:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x011d A[Catch: all -> 0x01ad, TryCatch #2 {all -> 0x01ad, blocks: (B:14:0x0042, B:35:0x0101, B:70:0x01a4, B:71:0x01ab, B:72:0x01ac, B:39:0x010d, B:42:0x0115, B:43:0x011d, B:47:0x0127, B:49:0x012b, B:53:0x014c, B:55:0x0158, B:57:0x0160, B:61:0x016a, B:63:0x016e, B:66:0x018c, B:68:0x0199, B:19:0x006c, B:27:0x00ad), top: B:80:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0124  */
    /* JADX WARN: Code duplicated, block: B:46:0x0126  */
    /* JADX WARN: Code duplicated, block: B:49:0x012b A[Catch: all -> 0x01ad, TryCatch #2 {all -> 0x01ad, blocks: (B:14:0x0042, B:35:0x0101, B:70:0x01a4, B:71:0x01ab, B:72:0x01ac, B:39:0x010d, B:42:0x0115, B:43:0x011d, B:47:0x0127, B:49:0x012b, B:53:0x014c, B:55:0x0158, B:57:0x0160, B:61:0x016a, B:63:0x016e, B:66:0x018c, B:68:0x0199, B:19:0x006c, B:27:0x00ad), top: B:80:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0148  */
    /* JADX WARN: Code duplicated, block: B:53:0x014c A[Catch: all -> 0x01ad, TryCatch #2 {all -> 0x01ad, blocks: (B:14:0x0042, B:35:0x0101, B:70:0x01a4, B:71:0x01ab, B:72:0x01ac, B:39:0x010d, B:42:0x0115, B:43:0x011d, B:47:0x0127, B:49:0x012b, B:53:0x014c, B:55:0x0158, B:57:0x0160, B:61:0x016a, B:63:0x016e, B:66:0x018c, B:68:0x0199, B:19:0x006c, B:27:0x00ad), top: B:80:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0155  */
    /* JADX WARN: Code duplicated, block: B:55:0x0158 A[Catch: all -> 0x01ad, TryCatch #2 {all -> 0x01ad, blocks: (B:14:0x0042, B:35:0x0101, B:70:0x01a4, B:71:0x01ab, B:72:0x01ac, B:39:0x010d, B:42:0x0115, B:43:0x011d, B:47:0x0127, B:49:0x012b, B:53:0x014c, B:55:0x0158, B:57:0x0160, B:61:0x016a, B:63:0x016e, B:66:0x018c, B:68:0x0199, B:19:0x006c, B:27:0x00ad), top: B:80:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0160 A[Catch: all -> 0x01ad, TryCatch #2 {all -> 0x01ad, blocks: (B:14:0x0042, B:35:0x0101, B:70:0x01a4, B:71:0x01ab, B:72:0x01ac, B:39:0x010d, B:42:0x0115, B:43:0x011d, B:47:0x0127, B:49:0x012b, B:53:0x014c, B:55:0x0158, B:57:0x0160, B:61:0x016a, B:63:0x016e, B:66:0x018c, B:68:0x0199, B:19:0x006c, B:27:0x00ad), top: B:80:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0167  */
    /* JADX WARN: Code duplicated, block: B:60:0x0169  */
    /* JADX WARN: Code duplicated, block: B:63:0x016e A[Catch: all -> 0x01ad, TryCatch #2 {all -> 0x01ad, blocks: (B:14:0x0042, B:35:0x0101, B:70:0x01a4, B:71:0x01ab, B:72:0x01ac, B:39:0x010d, B:42:0x0115, B:43:0x011d, B:47:0x0127, B:49:0x012b, B:53:0x014c, B:55:0x0158, B:57:0x0160, B:61:0x016a, B:63:0x016e, B:66:0x018c, B:68:0x0199, B:19:0x006c, B:27:0x00ad), top: B:80:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x018c A[Catch: all -> 0x01ad, TryCatch #2 {all -> 0x01ad, blocks: (B:14:0x0042, B:35:0x0101, B:70:0x01a4, B:71:0x01ab, B:72:0x01ac, B:39:0x010d, B:42:0x0115, B:43:0x011d, B:47:0x0127, B:49:0x012b, B:53:0x014c, B:55:0x0158, B:57:0x0160, B:61:0x016a, B:63:0x016e, B:66:0x018c, B:68:0x0199, B:19:0x006c, B:27:0x00ad), top: B:80:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0195  */
    /* JADX WARN: Code duplicated, block: B:68:0x0199 A[Catch: all -> 0x01ad, TryCatch #2 {all -> 0x01ad, blocks: (B:14:0x0042, B:35:0x0101, B:70:0x01a4, B:71:0x01ab, B:72:0x01ac, B:39:0x010d, B:42:0x0115, B:43:0x011d, B:47:0x0127, B:49:0x012b, B:53:0x014c, B:55:0x0158, B:57:0x0160, B:61:0x016a, B:63:0x016e, B:66:0x018c, B:68:0x0199, B:19:0x006c, B:27:0x00ad), top: B:80:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x01a4 A[Catch: all -> 0x01ad, TryCatch #2 {all -> 0x01ad, blocks: (B:14:0x0042, B:35:0x0101, B:70:0x01a4, B:71:0x01ab, B:72:0x01ac, B:39:0x010d, B:42:0x0115, B:43:0x011d, B:47:0x0127, B:49:0x012b, B:53:0x014c, B:55:0x0158, B:57:0x0160, B:61:0x016a, B:63:0x016e, B:66:0x018c, B:68:0x0199, B:19:0x006c, B:27:0x00ad), top: B:80:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01ac A[Catch: all -> 0x01ad, TRY_LEAVE, TryCatch #2 {all -> 0x01ad, blocks: (B:14:0x0042, B:35:0x0101, B:70:0x01a4, B:71:0x01ab, B:72:0x01ac, B:39:0x010d, B:42:0x0115, B:43:0x011d, B:47:0x0127, B:49:0x012b, B:53:0x014c, B:55:0x0158, B:57:0x0160, B:61:0x016a, B:63:0x016e, B:66:0x018c, B:68:0x0199, B:19:0x006c, B:27:0x00ad), top: B:80:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0105, code lost:
    
        r18 = r12;
        r12 = r0;
        r0 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0115 -> B:29:0x00bc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0199 -> B:52:0x0149). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(long r23, a.zje r25) {
        /*
            Method dump skipped, instruction units count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nmo.b(long, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        if (r10 == r13) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        if (r10 == r13) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0094, code lost:
    
        if (r10 == r13) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a6, code lost:
    
        if (r10 == r13) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(long r11, a.zje r13, a.sip r14, a.jo20 r15) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f23782a
            a.wgn r0 = (a.wgn) r0
            boolean r1 = r13 instanceof a.ios
            if (r1 == 0) goto L17
            r1 = r13
            a.ios r1 = (a.ios) r1
            int r2 = r1.k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.k = r2
            goto L1c
        L17:
            a.ios r1 = new a.ios
            r1.<init>(r10, r13)
        L1c:
            java.lang.Object r10 = r1.i
            a.wne r13 = a.wne.f39444a
            int r2 = r1.k
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L48
            if (r2 == r7) goto L44
            if (r2 == r6) goto L40
            if (r2 == r5) goto L3c
            if (r2 != r4) goto L36
            a.z1x.P(r10)
            goto La9
        L36:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r10)
            return r3
        L3c:
            a.z1x.P(r10)
            goto L97
        L40:
            a.z1x.P(r10)
            goto L7f
        L44:
            a.z1x.P(r10)
            goto L6d
        L48:
            a.z1x.P(r10)
            r8 = 189(0xbd, double:9.34E-322)
            int r10 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r10 != 0) goto L53
            r10 = r7
            goto L54
        L53:
            r10 = 0
        L54:
            int r11 = r14.ordinal()
            if (r11 == 0) goto L86
            if (r11 != r7) goto L82
            if (r10 == 0) goto L70
            java.lang.Object r10 = r0.invoke()
            a.aqr r10 = (a.aqr) r10
            r1.k = r7
            java.lang.Object r10 = r10.c(r15, r1)
            if (r10 != r13) goto L6d
            goto La8
        L6d:
            a.dx5 r10 = (a.dx5) r10
            goto Lab
        L70:
            java.lang.Object r10 = r0.invoke()
            a.aqr r10 = (a.aqr) r10
            r1.k = r6
            java.lang.Object r10 = r10.d(r15, r1)
            if (r10 != r13) goto L7f
            goto La8
        L7f:
            a.dx5 r10 = (a.dx5) r10
            goto Lab
        L82:
            a.t9f.b()
            return r3
        L86:
            if (r10 == 0) goto L9a
            java.lang.Object r10 = r0.invoke()
            a.aqr r10 = (a.aqr) r10
            r1.k = r5
            java.lang.Object r10 = r10.a(r15, r1)
            if (r10 != r13) goto L97
            goto La8
        L97:
            a.dx5 r10 = (a.dx5) r10
            goto Lab
        L9a:
            java.lang.Object r10 = r0.invoke()
            a.aqr r10 = (a.aqr) r10
            r1.k = r4
            java.lang.Object r10 = r10.e(r15, r1)
            if (r10 != r13) goto La9
        La8:
            return r13
        La9:
            a.dx5 r10 = (a.dx5) r10
        Lab:
            java.lang.Object r10 = r10.a()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nmo.c(long, a.zje, a.sip, a.jo20):java.lang.Object");
    }

    public int d(int i) {
        Iterator it = ((oe6) ((r7v) this.f23782a).f29996a).f25109a.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (((q88) it.next()).f28287a == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public vv6 e(List list) {
        ArrayList arrayListU = twn.u(list);
        ArrayList arrayList = new ArrayList();
        List listN = ((oif0) this.f23782a).n();
        ArrayList<hf6> arrayList2 = new ArrayList();
        for (Object obj : listN) {
            if (!((hf6) obj).c.isEmpty()) {
                arrayList2.add(obj);
            }
        }
        int i = 0;
        for (hf6 hf6Var : arrayList2) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList<qu6> arrayList4 = new ArrayList();
            for (Object obj2 : list) {
                if (hf6Var.c.contains(Long.valueOf(((qu6) obj2).f29333a))) {
                    arrayList4.add(obj2);
                }
            }
            for (qu6 qu6Var : arrayList4) {
                arrayList3.add(Integer.valueOf(i));
                arrayList.add(qu6Var);
                i++;
            }
            arrayListU.add(arrayList3);
        }
        return new vv6(arrayList, arrayListU);
    }

    public k5i0 f(String str) {
        Object next;
        str.getClass();
        Iterator it = ((eja0) ((z220) this.f23782a).d).c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((k5i0) next).b.equals(str));
        k5i0 k5i0Var = (k5i0) next;
        return k5i0Var == null ? k5i0.c : k5i0Var;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:39:0x0102  */
    /* JADX WARN: Code duplicated, block: B:41:0x010a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0121  */
    /* JADX WARN: Code duplicated, block: B:47:0x0139  */
    /* JADX WARN: Code duplicated, block: B:50:0x015f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0165  */
    /* JADX WARN: Code duplicated, block: B:59:0x0194  */
    /* JADX WARN: Code duplicated, block: B:62:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x01bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:77:0x01de  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:90:0x0200  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [a.yje, java.lang.Object, java.lang.String, java.util.LinkedHashMap] */
    public Object g(zje zjeVar) {
        hrt hrtVar;
        String str;
        ne5 ne5Var;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        LinkedHashMap linkedHashMap;
        xex xexVar;
        Object objD0;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        Object objD1;
        xex xexVar2 = (xex) this.f23782a;
        mne mneVar = (mne) xexVar2.f40764a;
        if (zjeVar instanceof hrt) {
            hrtVar = (hrt) zjeVar;
            int i = hrtVar.s;
            if ((i & Integer.MIN_VALUE) != 0) {
                hrtVar.s = i - Integer.MIN_VALUE;
            } else {
                hrtVar = new hrt(this, zjeVar);
            }
        } else {
            hrtVar = new hrt(this, zjeVar);
        }
        Object objD2 = hrtVar.q;
        wne wneVar = wne.f39444a;
        int i2 = hrtVar.s;
        byte b = 1;
        ?? r11 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (i2 == 0) {
            z1x.P(objD2);
            hrtVar.s = 1;
            objD2 = qjj.d0(mneVar.b, new je5(xexVar2, objArr == true ? 1 : 0, (byte) 0), hrtVar);
            if (objD2 != wneVar) {
            }
            return wneVar;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        LinkedHashMap linkedHashMap2 = hrtVar.p;
                        str2 = hrtVar.o;
                        str4 = hrtVar.n;
                        str3 = hrtVar.m;
                        str = hrtVar.l;
                        str6 = hrtVar.k;
                        str5 = hrtVar.j;
                        ne5Var = hrtVar.i;
                        z1x.P(objD2);
                        xexVar = xexVar2;
                        linkedHashMap = linkedHashMap2;
                    } else if (i2 != 5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                ne5 ne5Var2 = hrtVar.i;
                z1x.P(objD2);
                return ne5Var2;
            }
            String str24 = hrtVar.o;
            String str25 = hrtVar.n;
            String str26 = hrtVar.m;
            String str27 = hrtVar.l;
            String str28 = hrtVar.k;
            String str29 = hrtVar.j;
            ne5 ne5Var3 = hrtVar.i;
            z1x.P(objD2);
            str2 = str24;
            str4 = str25;
            str3 = str26;
            str = str27;
            str6 = str28;
            str5 = str29;
            ne5Var = ne5Var3;
            ne5 ne5Var4 = (ne5) objD2;
            str7 = ne5Var4.f23367a;
            str8 = ne5Var4.b;
            str9 = ne5Var4.c;
            str10 = ne5Var4.d;
            str11 = ne5Var4.e;
            str12 = ne5Var4.f;
            linkedHashMap = new LinkedHashMap();
            if (str5 != null) {
            }
            if (str6 != null) {
            }
            if (str != null) {
            }
            if (str3 != null) {
            }
            if (str4 != null) {
            }
            if (str2 != null) {
            }
            if (!CollectionsKt.S(linkedHashMap.values()).isEmpty()) {
                if (linkedHashMap.keySet().size() == CollectionsKt.S(linkedHashMap.values()).size()) {
                    hrtVar.i = ne5Var;
                    hrtVar.j = null;
                    hrtVar.k = null;
                    hrtVar.l = null;
                    hrtVar.m = null;
                    hrtVar.n = null;
                    hrtVar.o = null;
                    hrtVar.p = null;
                    hrtVar.s = 3;
                    objD0 = qjj.d0(mneVar.b, new je5(xexVar2, null, (byte) 3), hrtVar);
                    wneVar = wneVar;
                    if (objD0 != wneVar) {
                        objD0 = Unit.f46060a;
                    }
                    if (objD0 == wneVar) {
                    }
                } else {
                    wneVar = wneVar;
                    xexVar = xexVar2;
                    hrtVar.i = ne5Var;
                    hrtVar.j = str5;
                    hrtVar.k = str6;
                    hrtVar.l = str;
                    hrtVar.m = str3;
                    hrtVar.n = str4;
                    hrtVar.o = str2;
                    hrtVar.p = linkedHashMap;
                    hrtVar.s = 4;
                    r11 = 0;
                    objD2 = qjj.d0(mneVar.b, new je5(xexVar, 0 == true ? 1 : 0, (byte) 2), hrtVar);
                    if (objD2 != wneVar) {
                    }
                }
                return wneVar;
            }
            return ne5Var;
        }
        z1x.P(objD2);
        if (((Boolean) objD2).booleanValue()) {
            hrtVar.i = ne5Var;
            hrtVar.j = r11;
            hrtVar.k = r11;
            hrtVar.l = r11;
            hrtVar.m = r11;
            hrtVar.n = r11;
            hrtVar.o = r11;
            hrtVar.p = r11;
            hrtVar.s = 5;
            objD1 = qjj.d0(mneVar.b, new je5(xexVar, r11, (byte) 3), hrtVar);
            if (objD1 != wneVar) {
                objD1 = Unit.f46060a;
            }
            if (objD1 != wneVar) {
                return wneVar;
            }
            return ne5Var;
        }
        str13 = (String) linkedHashMap.getOrDefault(str5, r11);
        if (str13 == null) {
            str14 = str5;
        } else {
            str14 = str13;
        }
        str15 = (String) linkedHashMap.getOrDefault(str6, r11);
        if (str15 == null) {
            str16 = str6;
        } else {
            str16 = str15;
        }
        str17 = (String) linkedHashMap.getOrDefault(str, r11);
        if (str17 == null) {
            str18 = str;
        } else {
            str18 = str17;
        }
        str19 = (String) linkedHashMap.getOrDefault(str3, r11);
        if (str19 == null) {
            str20 = str3;
        } else {
            str20 = str19;
        }
        str21 = (String) linkedHashMap.getOrDefault(str4, r11);
        if (str21 != null) {
            str4 = str21;
        }
        str22 = (String) linkedHashMap.getOrDefault(str2, r11);
        if (str22 == null) {
            str23 = str2;
        } else {
            str23 = str22;
        }
        return new ne5(str14, str16, str18, str20, str4, str23);
        ne5 ne5Var5 = (ne5) objD2;
        String str30 = ne5Var5.f23367a;
        String str31 = ne5Var5.b;
        str = ne5Var5.c;
        String str32 = ne5Var5.d;
        String str33 = ne5Var5.e;
        String str34 = ne5Var5.f;
        hrtVar.i = ne5Var5;
        hrtVar.j = str30;
        hrtVar.k = str31;
        hrtVar.l = str;
        hrtVar.m = str32;
        hrtVar.n = str33;
        hrtVar.o = str34;
        hrtVar.s = 2;
        Object objD3 = qjj.d0(mneVar.b, new je5(xexVar2, objArr2 == true ? 1 : 0, b), hrtVar);
        if (objD3 != wneVar) {
            ne5Var = ne5Var5;
            objD2 = objD3;
            str2 = str34;
            str3 = str32;
            str4 = str33;
            str5 = str30;
            str6 = str31;
            ne5 ne5Var6 = (ne5) objD2;
            str7 = ne5Var6.f23367a;
            str8 = ne5Var6.b;
            str9 = ne5Var6.c;
            str10 = ne5Var6.d;
            str11 = ne5Var6.e;
            str12 = ne5Var6.f;
            linkedHashMap = new LinkedHashMap();
            if (str5 != null) {
            }
            if (str6 != null) {
            }
            if (str != null) {
            }
            if (str3 != null) {
            }
            if (str4 != null) {
            }
            if (str2 != null) {
            }
            if (!CollectionsKt.S(linkedHashMap.values()).isEmpty()) {
                if (linkedHashMap.keySet().size() == CollectionsKt.S(linkedHashMap.values()).size()) {
                    hrtVar.i = ne5Var;
                    hrtVar.j = null;
                    hrtVar.k = null;
                    hrtVar.l = null;
                    hrtVar.m = null;
                    hrtVar.n = null;
                    hrtVar.o = null;
                    hrtVar.p = null;
                    hrtVar.s = 3;
                    objD0 = qjj.d0(mneVar.b, new je5(xexVar2, null, (byte) 3), hrtVar);
                    wneVar = wneVar;
                    if (objD0 != wneVar) {
                        objD0 = Unit.f46060a;
                    }
                    if (objD0 == wneVar) {
                    }
                } else {
                    wneVar = wneVar;
                    xexVar = xexVar2;
                    hrtVar.i = ne5Var;
                    hrtVar.j = str5;
                    hrtVar.k = str6;
                    hrtVar.l = str;
                    hrtVar.m = str3;
                    hrtVar.n = str4;
                    hrtVar.o = str2;
                    hrtVar.p = linkedHashMap;
                    hrtVar.s = 4;
                    r11 = 0;
                    objD2 = qjj.d0(mneVar.b, new je5(xexVar, 0 == true ? 1 : 0, (byte) 2), hrtVar);
                    if (objD2 != wneVar) {
                        if (((Boolean) objD2).booleanValue()) {
                            str13 = (String) linkedHashMap.getOrDefault(str5, r11);
                            if (str13 == null) {
                                str14 = str5;
                            } else {
                                str14 = str13;
                            }
                            str15 = (String) linkedHashMap.getOrDefault(str6, r11);
                            if (str15 == null) {
                                str16 = str6;
                            } else {
                                str16 = str15;
                            }
                            str17 = (String) linkedHashMap.getOrDefault(str, r11);
                            if (str17 == null) {
                                str18 = str;
                            } else {
                                str18 = str17;
                            }
                            str19 = (String) linkedHashMap.getOrDefault(str3, r11);
                            if (str19 == null) {
                                str20 = str3;
                            } else {
                                str20 = str19;
                            }
                            str21 = (String) linkedHashMap.getOrDefault(str4, r11);
                            if (str21 != null) {
                                str4 = str21;
                            }
                            str22 = (String) linkedHashMap.getOrDefault(str2, r11);
                            if (str22 == null) {
                                str23 = str2;
                            } else {
                                str23 = str22;
                            }
                            return new ne5(str14, str16, str18, str20, str4, str23);
                        }
                        hrtVar.i = ne5Var;
                        hrtVar.j = r11;
                        hrtVar.k = r11;
                        hrtVar.l = r11;
                        hrtVar.m = r11;
                        hrtVar.n = r11;
                        hrtVar.o = r11;
                        hrtVar.p = r11;
                        hrtVar.s = 5;
                        objD1 = qjj.d0(mneVar.b, new je5(xexVar, r11, (byte) 3), hrtVar);
                        if (objD1 != wneVar) {
                            objD1 = Unit.f46060a;
                        }
                        if (objD1 != wneVar) {
                            return ne5Var;
                        }
                    }
                }
            }
            return ne5Var;
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Object h(boolean z, boolean z2, String str, boolean z3, String str2, int i, zje zjeVar) {
        zpt zptVar;
        esg0 esg0Var;
        Object objR;
        esg0 esg0Var2 = (esg0) this.f23782a;
        if (zjeVar instanceof zpt) {
            zptVar = (zpt) zjeVar;
            int i2 = zptVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zptVar.p = i2 - Integer.MIN_VALUE;
            } else {
                zptVar = new zpt(this, zjeVar);
            }
        } else {
            zptVar = new zpt(this, zjeVar);
        }
        zpt zptVar2 = zptVar;
        Object obj = zptVar2.n;
        wne wneVar = wne.f39444a;
        int i3 = zptVar2.p;
        byte b = 1;
        yje yjeVar = null;
        if (i3 == 0) {
            z1x.P(obj);
            zptVar2.i = z;
            zptVar2.j = z2;
            zptVar2.k = z3;
            zptVar2.m = i;
            zptVar2.p = 1;
            esg0Var = esg0Var2;
            objR = esg0Var.R(z, z2, str, z3, str2, i, zptVar2);
            if (objR != wneVar) {
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gm3 gm3Var = zptVar2.l;
            z1x.P(obj);
            return gm3Var;
        }
        i = zptVar2.m;
        z3 = zptVar2.k;
        z2 = zptVar2.j;
        z = zptVar2.i;
        z1x.P(obj);
        objR = obj;
        esg0Var = esg0Var2;
        gm3 gm3Var2 = (gm3) objR;
        String str3 = gm3Var2.c;
        zptVar2.l = gm3Var2;
        zptVar2.i = z;
        zptVar2.j = z2;
        zptVar2.k = z3;
        zptVar2.m = i;
        zptVar2.p = 2;
        Object objD0 = qjj.d0(((mne) esg0Var.f).b, new cm3(esg0Var, str3, yjeVar, b), zptVar2);
        if (objD0 != wneVar) {
            objD0 = Unit.f46060a;
        }
        return objD0 == wneVar ? wneVar : gm3Var2;
    }

    public nmo(cu5 cu5Var) {
        cu5Var.getClass();
        this.f23782a = cu5Var;
    }

    public nmo(ik6 ik6Var) {
        ik6Var.getClass();
        this.f23782a = ik6Var;
    }

    public nmo(hoo hooVar) {
        hooVar.getClass();
        this.f23782a = hooVar;
    }

    public nmo(t2g t2gVar) {
        t2gVar.getClass();
        this.f23782a = t2gVar;
    }

    public nmo(zkg zkgVar) {
        zkgVar.getClass();
        this.f23782a = zkgVar;
    }

    public nmo(q530 q530Var) {
        q530Var.getClass();
        this.f23782a = q530Var;
    }

    public /* synthetic */ nmo(Object obj) {
        this.f23782a = obj;
    }

    public nmo(cad cadVar, gii0 gii0Var, knf0 knf0Var, j1q0 j1q0Var) {
        gii0Var.getClass();
        knf0Var.getClass();
        j1q0Var.getClass();
        this.f23782a = new chf0((Object) gii0Var, (Object) knf0Var, (byte) 27);
    }
}
