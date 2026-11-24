package a;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class d3e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bh9 f5398a;

    public d3e(bh9 bh9Var) {
        new ArrayList();
        this.f5398a = bh9Var != null ? bh9Var.clone() : new bh9(new char[0]);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:193:0x0369  */
    /* JADX WARN: Code duplicated, block: B:195:0x036d  */
    /* JADX WARN: Code duplicated, block: B:199:0x0381  */
    /* JADX WARN: Code duplicated, block: B:201:0x0385  */
    /* JADX WARN: Code duplicated, block: B:205:0x0399  */
    /* JADX WARN: Code duplicated, block: B:207:0x039d  */
    /* JADX WARN: Code duplicated, block: B:224:0x042c  */
    /* JADX WARN: Code duplicated, block: B:243:0x04af  */
    /* JADX WARN: Code duplicated, block: B:253:0x0520  */
    /* JADX WARN: Code duplicated, block: B:265:0x0561  */
    /* JADX WARN: Code duplicated, block: B:292:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:308:0x0639  */
    /* JADX WARN: Code duplicated, block: B:337:0x06de  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:360:0x0732  */
    /* JADX WARN: Code duplicated, block: B:410:0x07fa  */
    /* JADX WARN: Code duplicated, block: B:450:0x0874  */
    /* JADX WARN: Code duplicated, block: B:530:0x0a86  */
    /* JADX WARN: Code duplicated, block: B:656:0x0cb1  */
    /* JADX WARN: Code duplicated, block: B:741:0x0efe  */
    /* JADX WARN: Code duplicated, block: B:760:0x0f2d A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:7:0x0045  */
    /* JADX WARN: Code duplicated, block: B:832:0x03c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x01a0 A[PHI: r23
  0x01a0: PHI (r23v24 java.util.Iterator) = 
  (r23v10 java.util.Iterator)
  (r23v11 java.util.Iterator)
  (r23v12 java.util.Iterator)
  (r23v13 java.util.Iterator)
  (r23v14 java.util.Iterator)
  (r23v15 java.util.Iterator)
  (r23v16 java.util.Iterator)
  (r23v17 java.util.Iterator)
  (r23v18 java.util.Iterator)
  (r23v19 java.util.Iterator)
  (r23v20 java.util.Iterator)
  (r23v21 java.util.Iterator)
  (r23v22 java.util.Iterator)
  (r23v25 java.util.Iterator)
 binds: [B:149:0x0254, B:145:0x0247, B:141:0x023a, B:137:0x022d, B:133:0x0220, B:129:0x0213, B:125:0x0206, B:121:0x01f7, B:117:0x01e9, B:113:0x01d9, B:109:0x01c9, B:105:0x01bb, B:101:0x01ab, B:98:0x019e] A[DONT_GENERATE, DONT_INLINE]] */
    public final void a(f7m0 f7m0Var) throws ch9 {
        byte b;
        bh9 bh9Var;
        bh9 bh9Var2;
        String strC;
        bh9 bh9Var3;
        String strC2;
        String str;
        byte b2;
        String strC3;
        int iF;
        float f;
        float fV;
        float fV2;
        float fV3;
        nr nrVar;
        Iterator it;
        nr nrVar2;
        Iterator it2;
        float fS;
        float fG;
        float f2;
        float fG2;
        float fG3;
        float fS2;
        String strC4;
        Iterator it3;
        byte b3;
        nr nrVar3;
        String str2;
        String strC5;
        String strA;
        String strA2;
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        String strC6;
        String strA3;
        String strA4;
        float f3;
        float f4;
        float fV4;
        float fV5;
        Float fValueOf4;
        Float f5;
        Float fValueOf5;
        nr nrVar4;
        vg9 vg9Var;
        float fS3;
        float fG4;
        float f6;
        HashMap map;
        HashMap map2;
        HashMap map3;
        nr nrVar5 = new nr((byte) 12);
        nrVar5.b = new HashMap();
        nrVar5.c = new HashMap();
        nrVar5.d = new HashMap();
        bh9 bh9Var4 = this.f5398a;
        Iterator it4 = bh9Var4.E().iterator();
        while (it4.hasNext()) {
            String str3 = (String) it4.next();
            xg9 xg9VarO = bh9Var4.o(str3);
            str3.getClass();
            switch (str3) {
                case "Helpers":
                    b = 0;
                    break;
                case "Generate":
                    b = 1;
                    break;
                case "Variables":
                    b = 2;
                    break;
                default:
                    b = -1;
                    break;
            }
            String strB = null;
            switch (b) {
                case 0:
                    bh9Var = bh9Var4;
                    it4 = it4;
                    if (xg9VarO instanceof vg9) {
                        vg9 vg9Var2 = (vg9) xg9VarO;
                        for (int i = 0; i < vg9Var2.e.size(); i++) {
                            xg9 xg9VarM = vg9Var2.m(i);
                            if (xg9VarM instanceof vg9) {
                                vg9 vg9Var3 = (vg9) xg9VarM;
                                if (vg9Var3.e.size() > 1) {
                                    switch (vg9Var3.A(0)) {
                                        case "vGuideline":
                                            xg9 xg9VarM2 = vg9Var3.m(1);
                                            if (!(xg9VarM2 instanceof bh9) || (strC = (bh9Var2 = (bh9) xg9VarM2).C(ParameterNames.ID)) == null) {
                                                break;
                                            } else {
                                                bfb.j0(1, f7m0Var, strC, bh9Var2);
                                                break;
                                            }
                                            break;
                                        case "hChain":
                                            bfb.e0(0, f7m0Var, nrVar5, vg9Var3);
                                            break;
                                        case "vChain":
                                            bfb.e0(1, f7m0Var, nrVar5, vg9Var3);
                                            break;
                                        case "hGuideline":
                                            xg9 xg9VarM3 = vg9Var3.m(1);
                                            if ((xg9VarM3 instanceof bh9) && (strC2 = (bh9Var3 = (bh9) xg9VarM3).C(ParameterNames.ID)) != null) {
                                                bfb.j0(0, f7m0Var, strC2, bh9Var3);
                                            }
                                        default:
                                            break;
                                    }
                                }
                            }
                        }
                    }
                    break;
                case 1:
                    bh9Var = bh9Var4;
                    it4 = it4;
                    if (xg9VarO instanceof bh9) {
                        bh9 bh9Var5 = (bh9) xg9VarO;
                        for (String str4 : bh9Var5.E()) {
                            xg9 xg9VarO2 = bh9Var5.o(str4);
                            HashMap map4 = (HashMap) nrVar5.d;
                            ArrayList arrayList = map4.containsKey(str4) ? (ArrayList) map4.get(str4) : null;
                            if (arrayList != null && (xg9VarO2 instanceof bh9)) {
                                Iterator it5 = arrayList.iterator();
                                while (it5.hasNext()) {
                                    bfb.k0(f7m0Var, nrVar5, (String) it5.next(), (bh9) xg9VarO2);
                                }
                            }
                        }
                    }
                    break;
                case 2:
                    bh9Var = bh9Var4;
                    it4 = it4;
                    if (xg9VarO instanceof bh9) {
                        bh9 bh9Var6 = (bh9) xg9VarO;
                        for (String str5 : bh9Var6.E()) {
                            xg9 xg9VarO3 = bh9Var6.o(str5);
                            if (xg9VarO3 instanceof zg9) {
                                ((HashMap) nrVar5.b).put(str5, Integer.valueOf(xg9VarO3.f()));
                            } else if (xg9VarO3 instanceof bh9) {
                                bh9 bh9Var7 = (bh9) xg9VarO3;
                                if (bh9Var7.D(RemoteMessageConst.FROM) && bh9Var7.D(RemoteMessageConst.TO)) {
                                    float f7 = nrVar5.f(bh9Var7.o(RemoteMessageConst.FROM));
                                    float f8 = nrVar5.f(bh9Var7.o(RemoteMessageConst.TO));
                                    String strC7 = bh9Var7.C("prefix");
                                    String strC8 = bh9Var7.C("postfix");
                                    HashMap map5 = (HashMap) nrVar5.c;
                                    if (map5.containsKey(str5)) {
                                        map5.get(str5);
                                    }
                                    w3e w3eVar = new w3e();
                                    w3eVar.f38497a = false;
                                    w3eVar.d = 0.0f;
                                    if (strC7 == null) {
                                        strC7 = "";
                                    }
                                    w3eVar.b = strC7;
                                    if (strC8 == null) {
                                        strC8 = "";
                                    }
                                    w3eVar.c = strC8;
                                    w3eVar.e = f8;
                                    map5.put(str5, w3eVar);
                                    HashMap map6 = (HashMap) nrVar5.d;
                                    ArrayList arrayList2 = new ArrayList();
                                    int i2 = (int) f7;
                                    int i3 = (int) f8;
                                    int i4 = i2;
                                    while (i2 <= i3) {
                                        arrayList2.add(w3eVar.b + i4 + w3eVar.c);
                                        i4++;
                                        i2++;
                                    }
                                    map6.put(str5, arrayList2);
                                } else if (bh9Var7.D(RemoteMessageConst.FROM) && bh9Var7.D("step")) {
                                    float f9 = nrVar5.f(bh9Var7.o(RemoteMessageConst.FROM));
                                    float f10 = nrVar5.f(bh9Var7.o("step"));
                                    HashMap map7 = (HashMap) nrVar5.c;
                                    if (map7.containsKey(str5)) {
                                        map7.get(str5);
                                    }
                                    y3e y3eVar = new y3e();
                                    y3eVar.f41948a = f10;
                                    y3eVar.b = f9;
                                    map7.put(str5, y3eVar);
                                } else if (bh9Var7.D("ids")) {
                                    vg9 vg9VarP = bh9Var7.p("ids");
                                    ArrayList arrayList3 = new ArrayList();
                                    for (int i5 = 0; i5 < vg9VarP.e.size(); i5++) {
                                        arrayList3.add(vg9VarP.A(i5));
                                    }
                                    ((HashMap) nrVar5.d).put(str5, arrayList3);
                                } else if (bh9Var7.D("tag")) {
                                    String strB2 = bh9Var7.B("tag");
                                    HashMap map8 = f7m0Var.e;
                                    ((HashMap) nrVar5.d).put(str5, map8.containsKey(strB2) ? (ArrayList) map8.get(strB2) : null);
                                }
                            }
                        }
                    }
                    break;
                default:
                    if (!(xg9VarO instanceof bh9)) {
                        bh9Var = bh9Var4;
                        it4 = it4;
                        if (xg9VarO instanceof zg9) {
                            ((HashMap) nrVar5.b).put(str3, Integer.valueOf(xg9VarO.f()));
                        }
                        break;
                    } else {
                        bh9 bh9Var8 = (bh9) xg9VarO;
                        Iterator it6 = bh9Var8.E().iterator();
                        while (true) {
                            boolean zHasNext = it6.hasNext();
                            str = Payload.TYPE;
                            if (zHasNext) {
                                if (((String) it6.next()).equals(Payload.TYPE)) {
                                    strB = bh9Var8.B(Payload.TYPE);
                                }
                            }
                        }
                        String str6 = strB;
                        if (str6 == null) {
                            bh9Var = bh9Var4;
                            it4 = it4;
                            bfb.k0(f7m0Var, nrVar5, str3, bh9Var8);
                            break;
                        } else {
                            switch (str6) {
                                case "vGuideline":
                                    b2 = 0;
                                    break;
                                case "column":
                                    b2 = 1;
                                    break;
                                case "hChain":
                                    b2 = 2;
                                    break;
                                case "vChain":
                                    b2 = 3;
                                    break;
                                case "barrier":
                                    b2 = 4;
                                    break;
                                case "row":
                                    b2 = 5;
                                    break;
                                case "grid":
                                    b2 = 6;
                                    break;
                                case "hFlow":
                                    b2 = 7;
                                    break;
                                case "vFlow":
                                    b2 = 8;
                                    break;
                                case "hGuideline":
                                    b2 = 9;
                                    break;
                                default:
                                    b2 = -1;
                                    break;
                            }
                            String str7 = Separators.DOUBLE_QUOTE;
                            bh9Var = bh9Var4;
                            switch (b2) {
                                case 0:
                                    it4 = it4;
                                    bfb.j0(1, f7m0Var, str3, bh9Var8);
                                    break;
                                case 1:
                                case 5:
                                case 6:
                                    it4 = it4;
                                    k3e k3eVarC = f7m0Var.c(str3);
                                    vuo vuoVar = k3eVarC.c;
                                    if (vuoVar == null || !(vuoVar instanceof sgv)) {
                                        sgv sgvVar = new sgv(f7m0Var, str6.charAt(0) == 'r' ? 10 : str6.charAt(0) == 'c' ? 11 : 9);
                                        k3eVarC.c = sgvVar;
                                        k3eVarC.b(sgvVar.a());
                                    }
                                    sgv sgvVar2 = (sgv) k3eVarC.c;
                                    for (String str8 : bh9Var8.E()) {
                                        str8.getClass();
                                        switch (str8) {
                                            case "orientation":
                                                sgvVar2.t0 = bh9Var8.o(str8).f();
                                                break;
                                            case "padding":
                                                xg9 xg9VarO4 = bh9Var8.o(str8);
                                                if (xg9VarO4 instanceof vg9) {
                                                    vg9 vg9Var4 = (vg9) xg9VarO4;
                                                    if (vg9Var4.e.size() > 1) {
                                                        f = vg9Var4.v(0);
                                                        fV3 = vg9Var4.v(1);
                                                        if (vg9Var4.e.size() > 2) {
                                                            fV2 = vg9Var4.v(2);
                                                            try {
                                                                try {
                                                                    fV = ((vg9) xg9VarO4).v(3);
                                                                } catch (ArrayIndexOutOfBoundsException unused) {
                                                                    fV = 0.0f;
                                                                }
                                                            } catch (ArrayIndexOutOfBoundsException unused2) {
                                                            }
                                                        } else {
                                                            fV2 = f;
                                                            fV = fV3;
                                                        }
                                                    } else {
                                                        f = xg9VarO4.f();
                                                        fV = f;
                                                        fV2 = fV;
                                                        fV3 = fV2;
                                                    }
                                                } else {
                                                    f = xg9VarO4.f();
                                                    fV = f;
                                                    fV2 = fV;
                                                    fV3 = fV2;
                                                }
                                                sgvVar2.p0 = Math.round(f7m0Var.f9065a.g(f));
                                                sgvVar2.r0 = Math.round(f7m0Var.f9065a.g(fV3));
                                                sgvVar2.q0 = Math.round(f7m0Var.f9065a.g(fV2));
                                                sgvVar2.s0 = Math.round(f7m0Var.f9065a.g(fV));
                                                break;
                                            case "contains":
                                                vg9 vg9VarR = bh9Var8.r(str8);
                                                if (vg9VarR != null) {
                                                    for (int i6 = 0; i6 < vg9VarR.e.size(); i6++) {
                                                        sgvVar2.q(f7m0Var.c(vg9VarR.m(i6).c()));
                                                    }
                                                }
                                                break;
                                            case "hGap":
                                                sgvVar2.w0 = f7m0Var.f9065a.g(bh9Var8.o(str8).e());
                                                break;
                                            case "rows":
                                                int iF2 = bh9Var8.o(str8).f();
                                                if (iF2 > 0 && sgvVar2.m0 != 11) {
                                                    sgvVar2.u0 = iF2;
                                                }
                                                break;
                                            case "vGap":
                                                sgvVar2.x0 = f7m0Var.f9065a.g(bh9Var8.o(str8).e());
                                                break;
                                            case "flags":
                                                try {
                                                    xg9 xg9VarO5 = bh9Var8.o(str8);
                                                    if (xg9VarO5 instanceof zg9) {
                                                        iF = xg9VarO5.f();
                                                        strC3 = "";
                                                    } else {
                                                        strC3 = xg9VarO5.c();
                                                        iF = 0;
                                                    }
                                                } catch (Exception e) {
                                                    System.err.println("Error parsing grid flags " + e);
                                                    strC3 = "";
                                                }
                                                if (strC3.isEmpty()) {
                                                    sgvVar2.C0 = iF;
                                                } else {
                                                    sgvVar2.getClass();
                                                    if (!strC3.isEmpty()) {
                                                        String[] strArrSplit = strC3.split("\\|");
                                                        sgvVar2.C0 = 0;
                                                        for (String str9 : strArrSplit) {
                                                            String lowerCase = str9.toLowerCase();
                                                            lowerCase.getClass();
                                                            if (lowerCase.equals("subgridbycolrow")) {
                                                                sgvVar2.C0 |= 1;
                                                            } else if (lowerCase.equals("spansrespectwidgetorder")) {
                                                                sgvVar2.C0 |= 2;
                                                            }
                                                        }
                                                    }
                                                }
                                                break;
                                            case "skips":
                                                String strC9 = bh9Var8.o(str8).c();
                                                if (strC9.contains(Separators.COLON)) {
                                                    sgvVar2.B0 = strC9;
                                                }
                                                break;
                                            case "spans":
                                                String strC10 = bh9Var8.o(str8).c();
                                                if (strC10.contains(Separators.COLON)) {
                                                    sgvVar2.A0 = strC10;
                                                }
                                                break;
                                            case "rowWeights":
                                                String strC11 = bh9Var8.o(str8).c();
                                                if (strC11.contains(Separators.COMMA)) {
                                                    sgvVar2.y0 = strC11;
                                                }
                                                break;
                                            case "columns":
                                                int iF3 = bh9Var8.o(str8).f();
                                                if (iF3 > 0) {
                                                    if (sgvVar2.m0 != 10) {
                                                        sgvVar2.v0 = iF3;
                                                    }
                                                }
                                                break;
                                            case "columnWeights":
                                                String strC12 = bh9Var8.o(str8).c();
                                                if (strC12.contains(Separators.COMMA)) {
                                                    sgvVar2.z0 = strC12;
                                                }
                                                break;
                                            default:
                                                bfb.G(nrVar5, bh9Var8, f7m0Var.c(str3), f7m0Var, str8);
                                                break;
                                        }
                                    }
                                    break;
                                case 2:
                                case 3:
                                    nrVar = nrVar5;
                                    it4 = it4;
                                    String str10 = Separators.DOUBLE_QUOTE;
                                    mbb mbbVar = str6.charAt(0) == 'h' ? (zkw) f7m0Var.f(1) : (hcu0) f7m0Var.f(2);
                                    mbbVar.f17612a = str3;
                                    Iterator it7 = bh9Var8.E().iterator();
                                    while (it7.hasNext()) {
                                        String str11 = (String) it7.next();
                                        str11.getClass();
                                        switch (str11) {
                                            case "bottom":
                                            case "end":
                                            case "top":
                                            case "left":
                                            case "right":
                                            case "start":
                                                it = it7;
                                                nrVar2 = nrVar;
                                                bfb.g0(nrVar2, bh9Var8, mbbVar, f7m0Var, str11);
                                                nrVar = nrVar2;
                                                str10 = str10;
                                                it7 = it;
                                                break;
                                            case "contains":
                                                xg9 xg9VarO6 = bh9Var8.o(str11);
                                                if (xg9VarO6 instanceof vg9) {
                                                    vg9 vg9Var5 = (vg9) xg9VarO6;
                                                    if (vg9Var5.e.size() >= 1) {
                                                        int i7 = 0;
                                                        while (i7 < vg9Var5.e.size()) {
                                                            xg9 xg9VarM4 = vg9Var5.m(i7);
                                                            if (xg9VarM4 instanceof vg9) {
                                                                vg9 vg9Var6 = (vg9) xg9VarM4;
                                                                if (vg9Var6.e.size() > 0) {
                                                                    String strC13 = vg9Var6.m(0).c();
                                                                    int size = vg9Var6.e.size();
                                                                    it2 = it7;
                                                                    if (size != 2) {
                                                                        if (size == 3) {
                                                                            fS2 = vg9Var6.s(1);
                                                                            fG = f7m0Var.f9065a.g(vg9Var6.s(2));
                                                                            fG3 = fG;
                                                                        } else if (size == 4) {
                                                                            fS2 = vg9Var6.s(1);
                                                                            float fG5 = f7m0Var.f9065a.g(vg9Var6.s(2));
                                                                            fG = f7m0Var.f9065a.g(vg9Var6.s(3));
                                                                            fG3 = fG5;
                                                                        } else if (size != 6) {
                                                                            fG = Float.NaN;
                                                                            f2 = Float.NaN;
                                                                            fG2 = Float.NaN;
                                                                            fS = Float.NaN;
                                                                            fG3 = Float.NaN;
                                                                        } else {
                                                                            float fS4 = vg9Var6.s(1);
                                                                            fG3 = f7m0Var.f9065a.g(vg9Var6.s(2));
                                                                            float fG6 = f7m0Var.f9065a.g(vg9Var6.s(3));
                                                                            float fG7 = f7m0Var.f9065a.g(vg9Var6.s(4));
                                                                            fG2 = f7m0Var.f9065a.g(vg9Var6.s(5));
                                                                            fG = fG6;
                                                                            fS = fS4;
                                                                            f2 = fG7;
                                                                        }
                                                                        fS = fS2;
                                                                        f2 = Float.NaN;
                                                                        fG2 = Float.NaN;
                                                                    } else {
                                                                        fS = vg9Var6.s(1);
                                                                        fG = Float.NaN;
                                                                        f2 = Float.NaN;
                                                                        fG2 = Float.NaN;
                                                                        fG3 = Float.NaN;
                                                                    }
                                                                    mbbVar.q(strC13);
                                                                    String string = strC13.toString();
                                                                    if (!Float.isNaN(fS)) {
                                                                        mbbVar.p0.put(string, Float.valueOf(fS));
                                                                    }
                                                                    if (!Float.isNaN(fG3)) {
                                                                        mbbVar.q0.put(string, Float.valueOf(fG3));
                                                                    }
                                                                    if (!Float.isNaN(fG)) {
                                                                        mbbVar.r0.put(string, Float.valueOf(fG));
                                                                    }
                                                                    if (!Float.isNaN(f2)) {
                                                                        HashMap map9 = mbbVar.s0;
                                                                        if (map9 == null) {
                                                                            map9 = new HashMap();
                                                                            mbbVar.s0 = map9;
                                                                        }
                                                                        map9.put(string, Float.valueOf(f2));
                                                                    }
                                                                    if (!Float.isNaN(fG2)) {
                                                                        HashMap map10 = mbbVar.t0;
                                                                        if (map10 == null) {
                                                                            map10 = new HashMap();
                                                                            mbbVar.t0 = map10;
                                                                        }
                                                                        map10.put(string, Float.valueOf(fG2));
                                                                    }
                                                                } else {
                                                                    it2 = it7;
                                                                    i7 = i7;
                                                                }
                                                            } else {
                                                                it2 = it7;
                                                                i7 = i7;
                                                                mbbVar.q(xg9VarM4.c());
                                                            }
                                                            i7++;
                                                            it7 = it2;
                                                        }
                                                        it = it7;
                                                        nrVar2 = nrVar;
                                                        nrVar = nrVar2;
                                                        str10 = str10;
                                                        it7 = it;
                                                        break;
                                                    }
                                                }
                                                PrintStream printStream = System.err;
                                                StringBuilder sbT = brm0.t(str3, " contains should be an array \"");
                                                sbT.append(xg9VarO6.c());
                                                sbT.append(str10);
                                                printStream.println(sbT.toString());
                                                break;
                                            case "style":
                                                xg9 xg9VarO7 = bh9Var8.o(str11);
                                                if (xg9VarO7 instanceof vg9) {
                                                    vg9 vg9Var7 = (vg9) xg9VarO7;
                                                    if (vg9Var7.e.size() > 1) {
                                                        strC4 = vg9Var7.A(0);
                                                        mbbVar.o0 = vg9Var7.s(1);
                                                    } else {
                                                        strC4 = xg9VarO7.c();
                                                    }
                                                } else {
                                                    strC4 = xg9VarO7.c();
                                                }
                                                if (strC4.equals("packed")) {
                                                    mbbVar.u0 = d7m0.c;
                                                } else if (strC4.equals("spread_inside")) {
                                                    mbbVar.u0 = d7m0.b;
                                                } else {
                                                    mbbVar.u0 = d7m0.f5600a;
                                                }
                                                it = it7;
                                                nrVar2 = nrVar;
                                                nrVar = nrVar2;
                                                str10 = str10;
                                                it7 = it;
                                                break;
                                            default:
                                                it = it7;
                                                nrVar2 = nrVar;
                                                nrVar = nrVar2;
                                                str10 = str10;
                                                it7 = it;
                                                break;
                                        }
                                        nrVar5 = nrVar;
                                    }
                                    nrVar5 = nrVar;
                                    break;
                                case 4:
                                    nrVar = nrVar5;
                                    it4 = it4;
                                    boolean z = f7m0Var.b;
                                    k3e k3eVarC2 = f7m0Var.c(str3);
                                    vuo vuoVar2 = k3eVarC2.c;
                                    if (vuoVar2 == null || !(vuoVar2 instanceof av5)) {
                                        av5 av5Var = new av5(f7m0Var, 5);
                                        av5Var.o0 = 4;
                                        k3eVarC2.c = av5Var;
                                        k3eVarC2.b(av5Var.a());
                                    }
                                    av5 av5Var2 = (av5) k3eVarC2.c;
                                    for (String str12 : bh9Var8.E()) {
                                        str12.getClass();
                                        switch (str12) {
                                            case "margin":
                                                float fU = bh9Var8.u(str12);
                                                if (!Float.isNaN(fU)) {
                                                    av5Var2.l(Float.valueOf(f7m0Var.f9065a.g(fU)));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                                break;
                                            case "direction":
                                                switch (bh9Var8.B(str12)) {
                                                    case "bottom":
                                                        av5Var2.o0 = 6;
                                                        break;
                                                    case "end":
                                                        if (!z) {
                                                            av5Var2.o0 = 1;
                                                            break;
                                                        } else {
                                                            av5Var2.o0 = 2;
                                                            break;
                                                        }
                                                        break;
                                                    case "top":
                                                        av5Var2.o0 = 5;
                                                        break;
                                                    case "left":
                                                        av5Var2.o0 = 1;
                                                        break;
                                                    case "right":
                                                        av5Var2.o0 = 2;
                                                        break;
                                                    case "start":
                                                        if (!z) {
                                                            av5Var2.o0 = 2;
                                                            break;
                                                        } else {
                                                            av5Var2.o0 = 1;
                                                            break;
                                                        }
                                                        break;
                                                }
                                                break;
                                            case "contains":
                                                vg9 vg9VarR2 = bh9Var8.r(str12);
                                                if (vg9VarR2 == null) {
                                                    break;
                                                } else {
                                                    for (int i8 = 0; i8 < vg9VarR2.e.size(); i8++) {
                                                        av5Var2.q(f7m0Var.c(vg9VarR2.m(i8).c()));
                                                    }
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                    nrVar5 = nrVar;
                                    break;
                                case 7:
                                case 8:
                                    Float fValueOf6 = Float.valueOf(0.5f);
                                    boolean z2 = str6.charAt(0) == 'v';
                                    k3e k3eVarC3 = f7m0Var.c(str3);
                                    boolean z3 = z2;
                                    vuo vuoVar3 = k3eVarC3.c;
                                    if (vuoVar3 == null || !(vuoVar3 instanceof zoq)) {
                                        zoq zoqVar = z3 ? new zoq(f7m0Var, 8) : new zoq(f7m0Var, 7);
                                        k3eVarC3.c = zoqVar;
                                        k3eVarC3.b(zoqVar.a());
                                    } else {
                                        it4 = it4;
                                    }
                                    zoq zoqVar2 = (zoq) k3eVarC3.c;
                                    Iterator it8 = bh9Var8.E().iterator();
                                    while (true) {
                                        if (it8.hasNext()) {
                                            String str13 = (String) it8.next();
                                            str13.getClass();
                                            switch (str13.hashCode()) {
                                                case -1254185091:
                                                    it3 = it8;
                                                    if (str13.equals("hAlign")) {
                                                        b3 = 0;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1237307863:
                                                    it3 = it8;
                                                    if (str13.equals("hStyle")) {
                                                        b3 = 1;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -1198076529:
                                                    it3 = it8;
                                                    if (str13.equals("hFlowBias")) {
                                                        b3 = 2;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -853376977:
                                                    it3 = it8;
                                                    if (str13.equals("vAlign")) {
                                                        b3 = 3;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -836499749:
                                                    it3 = it8;
                                                    if (str13.equals("vStyle")) {
                                                        b3 = 4;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -806339567:
                                                    it3 = it8;
                                                    if (str13.equals("padding")) {
                                                        b3 = 5;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -732635235:
                                                    it3 = it8;
                                                    if (str13.equals("vFlowBias")) {
                                                        b3 = 6;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -567445985:
                                                    it3 = it8;
                                                    if (str13.equals("contains")) {
                                                        b3 = 7;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case -488900360:
                                                    it3 = it8;
                                                    if (str13.equals("maxElement")) {
                                                        b3 = 8;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 3169614:
                                                    it3 = it8;
                                                    if (str13.equals("hGap")) {
                                                        b3 = 9;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 3575610:
                                                    it3 = it8;
                                                    if (str13.equals(str)) {
                                                        b3 = 10;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 3586688:
                                                    it3 = it8;
                                                    if (str13.equals("vGap")) {
                                                        b3 = 11;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 3657802:
                                                    it3 = it8;
                                                    if (str13.equals("wrap")) {
                                                        b3 = 12;
                                                    } else {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                default:
                                                    it3 = it8;
                                                    b3 = -1;
                                                    break;
                                            }
                                            switch (b3) {
                                                case 0:
                                                    nrVar3 = nrVar5;
                                                    str2 = str;
                                                    str7 = str7;
                                                    String strC14 = bh9Var8.o(str13).c();
                                                    if (strC14.equals("end")) {
                                                        zoqVar2.A0 = (byte) 1;
                                                    } else if (strC14.equals("start")) {
                                                        zoqVar2.A0 = (byte) 0;
                                                    } else {
                                                        zoqVar2.A0 = (byte) 2;
                                                    }
                                                    it8 = it3;
                                                    str7 = str7;
                                                    str = str2;
                                                    nrVar5 = nrVar3;
                                                    break;
                                                case 1:
                                                    nrVar3 = nrVar5;
                                                    str2 = str;
                                                    str7 = str7;
                                                    xg9 xg9VarO8 = bh9Var8.o(str13);
                                                    if (xg9VarO8 instanceof vg9) {
                                                        vg9 vg9Var8 = (vg9) xg9VarO8;
                                                        if (vg9Var8.e.size() > 1) {
                                                            strA = vg9Var8.A(0);
                                                            strC5 = vg9Var8.A(1);
                                                            strA2 = vg9Var8.e.size() > 2 ? vg9Var8.A(2) : "";
                                                        } else {
                                                            strC5 = xg9VarO8.c();
                                                            strA = "";
                                                            strA2 = strA;
                                                        }
                                                    } else {
                                                        strC5 = xg9VarO8.c();
                                                        strA = "";
                                                        strA2 = strA;
                                                    }
                                                    if (!strC5.equals("")) {
                                                        zoqVar2.w0 = d7m0.a(strC5);
                                                    }
                                                    if (!strA.equals("")) {
                                                        zoqVar2.x0 = d7m0.a(strA);
                                                    }
                                                    if (!strA2.equals("")) {
                                                        zoqVar2.y0 = d7m0.a(strA2);
                                                    }
                                                    it8 = it3;
                                                    str7 = str7;
                                                    str = str2;
                                                    nrVar5 = nrVar3;
                                                    break;
                                                case 2:
                                                    nrVar3 = nrVar5;
                                                    str2 = str;
                                                    str7 = str7;
                                                    xg9 xg9VarO9 = bh9Var8.o(str13);
                                                    if (xg9VarO9 instanceof vg9) {
                                                        vg9 vg9Var9 = (vg9) xg9VarO9;
                                                        if (vg9Var9.e.size() > 1) {
                                                            fValueOf2 = Float.valueOf(vg9Var9.s(0));
                                                            fValueOf = Float.valueOf(vg9Var9.s(1));
                                                            fValueOf3 = vg9Var9.e.size() > 2 ? Float.valueOf(vg9Var9.s(2)) : fValueOf6;
                                                        } else {
                                                            fValueOf = Float.valueOf(xg9VarO9.e());
                                                            fValueOf2 = fValueOf6;
                                                            fValueOf3 = fValueOf2;
                                                        }
                                                    } else {
                                                        fValueOf = Float.valueOf(xg9VarO9.e());
                                                        fValueOf2 = fValueOf6;
                                                        fValueOf3 = fValueOf2;
                                                    }
                                                    try {
                                                        zoqVar2.h = fValueOf.floatValue();
                                                        if (fValueOf2.floatValue() != 0.5f) {
                                                            zoqVar2.L0 = fValueOf2.floatValue();
                                                        }
                                                        if (fValueOf3.floatValue() != 0.5f) {
                                                            zoqVar2.M0 = fValueOf3.floatValue();
                                                        }
                                                    } catch (NumberFormatException unused3) {
                                                    }
                                                    it8 = it3;
                                                    str7 = str7;
                                                    str = str2;
                                                    nrVar5 = nrVar3;
                                                    break;
                                                case 3:
                                                    nrVar3 = nrVar5;
                                                    str2 = str;
                                                    str7 = str7;
                                                    switch (bh9Var8.o(str13).c()) {
                                                        case "baseline":
                                                            zoqVar2.z0 = (byte) 3;
                                                            break;
                                                        case "bottom":
                                                            zoqVar2.z0 = (byte) 1;
                                                            break;
                                                        case "top":
                                                            zoqVar2.z0 = (byte) 0;
                                                            break;
                                                        default:
                                                            zoqVar2.z0 = (byte) 2;
                                                            break;
                                                    }
                                                    it8 = it3;
                                                    str7 = str7;
                                                    str = str2;
                                                    nrVar5 = nrVar3;
                                                    break;
                                                case 4:
                                                    nrVar3 = nrVar5;
                                                    str2 = str;
                                                    str7 = str7;
                                                    xg9 xg9VarO10 = bh9Var8.o(str13);
                                                    if (xg9VarO10 instanceof vg9) {
                                                        vg9 vg9Var10 = (vg9) xg9VarO10;
                                                        if (vg9Var10.e.size() > 1) {
                                                            strA3 = vg9Var10.A(0);
                                                            strC6 = vg9Var10.A(1);
                                                            strA4 = vg9Var10.e.size() > 2 ? vg9Var10.A(2) : "";
                                                        } else {
                                                            strC6 = xg9VarO10.c();
                                                            strA3 = "";
                                                            strA4 = strA3;
                                                        }
                                                    } else {
                                                        strC6 = xg9VarO10.c();
                                                        strA3 = "";
                                                        strA4 = strA3;
                                                    }
                                                    if (!strC6.equals("")) {
                                                        zoqVar2.t0 = d7m0.a(strC6);
                                                    }
                                                    if (!strA3.equals("")) {
                                                        zoqVar2.u0 = d7m0.a(strA3);
                                                    }
                                                    if (!strA4.equals("")) {
                                                        zoqVar2.v0 = d7m0.a(strA4);
                                                    }
                                                    it8 = it3;
                                                    str7 = str7;
                                                    str = str2;
                                                    nrVar5 = nrVar3;
                                                    break;
                                                case 5:
                                                    nrVar3 = nrVar5;
                                                    str2 = str;
                                                    xg9 xg9VarO11 = bh9Var8.o(str13);
                                                    if (xg9VarO11 instanceof vg9) {
                                                        vg9 vg9Var11 = (vg9) xg9VarO11;
                                                        if (vg9Var11.e.size() > 1) {
                                                            float fV6 = vg9Var11.v(0);
                                                            fV4 = vg9Var11.v(1);
                                                            if (vg9Var11.e.size() > 2) {
                                                                float fV7 = vg9Var11.v(2);
                                                                try {
                                                                    fV5 = ((vg9) xg9VarO11).v(3);
                                                                    f4 = fV7;
                                                                    f3 = fV6;
                                                                } catch (ArrayIndexOutOfBoundsException unused4) {
                                                                    f4 = fV7;
                                                                    f3 = fV6;
                                                                    fV5 = 0.0f;
                                                                }
                                                            } else {
                                                                fV5 = fV4;
                                                                f3 = fV6;
                                                                f4 = f3;
                                                            }
                                                        } else {
                                                            f3 = xg9VarO11.f();
                                                            f4 = f3;
                                                            fV4 = f4;
                                                            fV5 = fV4;
                                                        }
                                                    } else {
                                                        f3 = xg9VarO11.f();
                                                        f4 = f3;
                                                        fV4 = f4;
                                                        fV5 = fV4;
                                                    }
                                                    zoqVar2.D0 = Math.round(f7m0Var.f9065a.g(f3));
                                                    zoqVar2.F0 = Math.round(f7m0Var.f9065a.g(fV4));
                                                    zoqVar2.E0 = Math.round(f7m0Var.f9065a.g(f4));
                                                    zoqVar2.G0 = Math.round(f7m0Var.f9065a.g(fV5));
                                                    it8 = it3;
                                                    str7 = str7;
                                                    str = str2;
                                                    nrVar5 = nrVar3;
                                                    break;
                                                case 6:
                                                    nrVar3 = nrVar5;
                                                    str2 = str;
                                                    xg9 xg9VarO12 = bh9Var8.o(str13);
                                                    if (xg9VarO12 instanceof vg9) {
                                                        vg9 vg9Var12 = (vg9) xg9VarO12;
                                                        if (vg9Var12.e.size() > 1) {
                                                            Float fValueOf7 = Float.valueOf(vg9Var12.s(0));
                                                            fValueOf4 = Float.valueOf(vg9Var12.s(1));
                                                            fValueOf5 = vg9Var12.e.size() > 2 ? Float.valueOf(vg9Var12.s(2)) : fValueOf6;
                                                            f5 = fValueOf7;
                                                        } else {
                                                            fValueOf4 = Float.valueOf(xg9VarO12.e());
                                                            f5 = fValueOf6;
                                                            fValueOf5 = f5;
                                                        }
                                                    } else {
                                                        fValueOf4 = Float.valueOf(xg9VarO12.e());
                                                        f5 = fValueOf6;
                                                        fValueOf5 = f5;
                                                    }
                                                    try {
                                                        zoqVar2.i = fValueOf4.floatValue();
                                                        if (f5.floatValue() != 0.5f) {
                                                            zoqVar2.J0 = f5.floatValue();
                                                        }
                                                        if (fValueOf5.floatValue() != 0.5f) {
                                                            zoqVar2.K0 = fValueOf5.floatValue();
                                                        }
                                                    } catch (NumberFormatException unused5) {
                                                    }
                                                    str7 = str7;
                                                    it8 = it3;
                                                    str7 = str7;
                                                    str = str2;
                                                    nrVar5 = nrVar3;
                                                    break;
                                                case 7:
                                                    xg9 xg9VarO13 = bh9Var8.o(str13);
                                                    if (xg9VarO13 instanceof vg9) {
                                                        vg9 vg9Var13 = (vg9) xg9VarO13;
                                                        str2 = str;
                                                        if (vg9Var13.e.size() >= 1) {
                                                            int i9 = 0;
                                                            while (i9 < vg9Var13.e.size()) {
                                                                xg9 xg9VarM5 = vg9Var13.m(i9);
                                                                int i10 = i9;
                                                                if (xg9VarM5 instanceof vg9) {
                                                                    vg9 vg9Var14 = (vg9) xg9VarM5;
                                                                    if (vg9Var14.e.size() > 0) {
                                                                        String strC15 = vg9Var14.m(0).c();
                                                                        vg9Var = vg9Var13;
                                                                        int size2 = vg9Var14.e.size();
                                                                        nrVar4 = nrVar5;
                                                                        if (size2 != 2) {
                                                                            if (size2 == 3) {
                                                                                fS3 = vg9Var14.s(1);
                                                                                fG4 = f7m0Var.f9065a.g(vg9Var14.s(2));
                                                                            } else if (size2 != 4) {
                                                                                fG4 = Float.NaN;
                                                                                fS3 = Float.NaN;
                                                                                f6 = Float.NaN;
                                                                            } else {
                                                                                float fS5 = vg9Var14.s(1);
                                                                                float fG8 = f7m0Var.f9065a.g(vg9Var14.s(2));
                                                                                fG4 = f7m0Var.f9065a.g(vg9Var14.s(3));
                                                                                f6 = fG8;
                                                                                fS3 = fS5;
                                                                            }
                                                                            zoqVar2.q(strC15);
                                                                            if (!Float.isNaN(fS3)) {
                                                                                map3 = zoqVar2.p0;
                                                                                if (map3 == null) {
                                                                                    map3 = new HashMap();
                                                                                    zoqVar2.p0 = map3;
                                                                                }
                                                                                map3.put(strC15, Float.valueOf(fS3));
                                                                            }
                                                                            if (!Float.isNaN(f6)) {
                                                                                map2 = zoqVar2.q0;
                                                                                if (map2 == null) {
                                                                                    map2 = new HashMap();
                                                                                    zoqVar2.q0 = map2;
                                                                                }
                                                                                map2.put(strC15, Float.valueOf(f6));
                                                                            }
                                                                            if (Float.isNaN(fG4)) {
                                                                                map = zoqVar2.r0;
                                                                                if (map == null) {
                                                                                    map = new HashMap();
                                                                                    zoqVar2.r0 = map;
                                                                                }
                                                                                map.put(strC15, Float.valueOf(fG4));
                                                                            }
                                                                        } else {
                                                                            fS3 = vg9Var14.s(1);
                                                                            fG4 = Float.NaN;
                                                                        }
                                                                        f6 = fG4;
                                                                        zoqVar2.q(strC15);
                                                                        if (!Float.isNaN(fS3)) {
                                                                            map3 = zoqVar2.p0;
                                                                            if (map3 == null) {
                                                                                map3 = new HashMap();
                                                                                zoqVar2.p0 = map3;
                                                                            }
                                                                            map3.put(strC15, Float.valueOf(fS3));
                                                                        }
                                                                        if (!Float.isNaN(f6)) {
                                                                            map2 = zoqVar2.q0;
                                                                            if (map2 == null) {
                                                                                map2 = new HashMap();
                                                                                zoqVar2.q0 = map2;
                                                                            }
                                                                            map2.put(strC15, Float.valueOf(f6));
                                                                        }
                                                                        if (Float.isNaN(fG4)) {
                                                                            map = zoqVar2.r0;
                                                                            if (map == null) {
                                                                                map = new HashMap();
                                                                                zoqVar2.r0 = map;
                                                                            }
                                                                            map.put(strC15, Float.valueOf(fG4));
                                                                        }
                                                                    } else {
                                                                        nrVar4 = nrVar5;
                                                                        vg9Var = vg9Var13;
                                                                    }
                                                                } else {
                                                                    nrVar4 = nrVar5;
                                                                    vg9Var = vg9Var13;
                                                                    zoqVar2.q(xg9VarM5.c());
                                                                }
                                                                i9 = i10 + 1;
                                                                vg9Var13 = vg9Var;
                                                                nrVar5 = nrVar4;
                                                            }
                                                            nrVar3 = nrVar5;
                                                            str7 = str7;
                                                            it8 = it3;
                                                            str7 = str7;
                                                            str = str2;
                                                            nrVar5 = nrVar3;
                                                            break;
                                                        }
                                                    }
                                                    nrVar = nrVar5;
                                                    PrintStream printStream2 = System.err;
                                                    StringBuilder sbT2 = brm0.t(str3, " contains should be an array \"");
                                                    sbT2.append(xg9VarO13.c());
                                                    sbT2.append(str7);
                                                    printStream2.println(sbT2.toString());
                                                    break;
                                                case 8:
                                                    zoqVar2.H0 = bh9Var8.o(str13).f();
                                                    nrVar3 = nrVar5;
                                                    str2 = str;
                                                    str7 = str7;
                                                    it8 = it3;
                                                    str7 = str7;
                                                    str = str2;
                                                    nrVar5 = nrVar3;
                                                    break;
                                                case 9:
                                                    zoqVar2.C0 = bh9Var8.o(str13).f();
                                                    nrVar3 = nrVar5;
                                                    str2 = str;
                                                    str7 = str7;
                                                    it8 = it3;
                                                    str7 = str7;
                                                    str = str2;
                                                    nrVar5 = nrVar3;
                                                    break;
                                                case 10:
                                                    if (bh9Var8.o(str13).c().equals("hFlow")) {
                                                        zoqVar2.I0 = false;
                                                    } else {
                                                        zoqVar2.I0 = true;
                                                    }
                                                    nrVar3 = nrVar5;
                                                    str2 = str;
                                                    str7 = str7;
                                                    it8 = it3;
                                                    str7 = str7;
                                                    str = str2;
                                                    nrVar5 = nrVar3;
                                                    break;
                                                case 11:
                                                    zoqVar2.B0 = bh9Var8.o(str13).f();
                                                    nrVar3 = nrVar5;
                                                    str2 = str;
                                                    str7 = str7;
                                                    it8 = it3;
                                                    str7 = str7;
                                                    str = str2;
                                                    nrVar5 = nrVar3;
                                                    break;
                                                case 12:
                                                    String strC16 = bh9Var8.o(str13).c();
                                                    HashMap map11 = e7m0.f7333a;
                                                    zoqVar2.s0 = map11.containsKey(strC16) ? ((Integer) map11.get(strC16)).intValue() : -1;
                                                    nrVar3 = nrVar5;
                                                    str2 = str;
                                                    str7 = str7;
                                                    it8 = it3;
                                                    str7 = str7;
                                                    str = str2;
                                                    nrVar5 = nrVar3;
                                                    break;
                                                default:
                                                    bfb.G(nrVar5, bh9Var8, f7m0Var.c(str3), f7m0Var, str13);
                                                    nrVar3 = nrVar5;
                                                    str2 = str;
                                                    str7 = str7;
                                                    it8 = it3;
                                                    str7 = str7;
                                                    str = str2;
                                                    nrVar5 = nrVar3;
                                                    break;
                                            }
                                        } else {
                                            nrVar = nrVar5;
                                        }
                                        nrVar5 = nrVar;
                                        break;
                                    }
                                    break;
                                case 9:
                                    bfb.j0(0, f7m0Var, str3, bh9Var8);
                                default:
                                    it4 = it4;
                                    break;
                            }
                        }
                    }
                    break;
            }
            bh9Var4 = bh9Var;
            it4 = it4;
        }
    }

    public final bh9 b(u2e u2eVar) throws ch9 {
        String string = u2eVar.b.toString();
        bh9 bh9Var = this.f5398a;
        xg9 xg9VarZ = bh9Var.z(string);
        if ((xg9VarZ instanceof bh9 ? (bh9) xg9VarZ : null) == null) {
            bh9Var.F(string, new bh9(new char[0]));
        }
        xg9 xg9VarO = bh9Var.o(string);
        if (xg9VarO instanceof bh9) {
            return (bh9) xg9VarO;
        }
        StringBuilder sbT = kng0.t("no object found for key <", string, ">, found [");
        sbT.append(xg9VarO.g());
        sbT.append("] : ");
        sbT.append(xg9VarO);
        throw new ch9(sbT.toString(), bh9Var);
    }

    public final void c(u2e u2eVar, Function1 function1) {
        function1.invoke(new t2e(u2eVar.b, b(u2eVar)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3e)) {
            return false;
        }
        return this.f5398a.equals(((d3e) obj).f5398a);
    }

    public final int hashCode() {
        return this.f5398a.hashCode();
    }
}
