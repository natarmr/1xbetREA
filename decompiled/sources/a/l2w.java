package a;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class l2w extends bnn0 implements Function2 {
    public boolean i;
    public boolean j;
    public List k;
    public ctf0 l;
    public sff0 m;
    public List n;
    public byte o;
    public final /* synthetic */ r2w p;
    public final /* synthetic */ d3w q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2w(r2w r2wVar, d3w d3wVar, yje yjeVar) {
        super(2, yjeVar);
        this.p = r2wVar;
        this.q = d3wVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new l2w(this.p, this.q, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l2w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0207  */
    /* JADX WARN: Code duplicated, block: B:128:0x0289  */
    /* JADX WARN: Code duplicated, block: B:133:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:135:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:138:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:141:0x02ef A[LOOP:3: B:136:0x02d1->B:141:0x02ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:145:0x0302  */
    /* JADX WARN: Code duplicated, block: B:146:0x0305  */
    /* JADX WARN: Code duplicated, block: B:148:0x0309  */
    /* JADX WARN: Code duplicated, block: B:151:0x0315  */
    /* JADX WARN: Code duplicated, block: B:152:0x0318  */
    /* JADX WARN: Code duplicated, block: B:155:0x0341  */
    /* JADX WARN: Code duplicated, block: B:158:0x038b  */
    /* JADX WARN: Code duplicated, block: B:160:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:164:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:172:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:178:0x040e  */
    /* JADX WARN: Code duplicated, block: B:181:0x0421 A[LOOP:4: B:176:0x0408->B:181:0x0421, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:185:0x0432  */
    /* JADX WARN: Code duplicated, block: B:186:0x0435  */
    /* JADX WARN: Code duplicated, block: B:188:0x0439  */
    /* JADX WARN: Code duplicated, block: B:189:0x043c  */
    /* JADX WARN: Code duplicated, block: B:192:0x0446  */
    /* JADX WARN: Code duplicated, block: B:195:0x0458 A[PHI: r15
  0x0458: PHI (r15v16 java.lang.String) = (r15v6 java.lang.String), (r15v19 java.lang.String) binds: [B:197:0x0462, B:194:0x044a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:196:0x045e  */
    /* JADX WARN: Code duplicated, block: B:199:0x0465  */
    /* JADX WARN: Code duplicated, block: B:203:0x0473  */
    /* JADX WARN: Code duplicated, block: B:204:0x0476 A[PHI: r15
  0x0476: PHI (r15v12 int) = (r15v7 int), (r15v8 int), (r15v9 int), (r15v10 int), (r15v11 int), (r15v14 int) binds: [B:200:0x046c, B:208:0x0486, B:207:0x0482, B:206:0x047e, B:205:0x047a, B:203:0x0473] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:205:0x047a  */
    /* JADX WARN: Code duplicated, block: B:206:0x047e  */
    /* JADX WARN: Code duplicated, block: B:207:0x0482  */
    /* JADX WARN: Code duplicated, block: B:208:0x0486  */
    /* JADX WARN: Code duplicated, block: B:231:0x04c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x046f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x02f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:236:0x02fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x0426 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x042c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ef  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        ctf0 ctf0Var;
        Object objB;
        boolean z;
        boolean z2;
        List list;
        sff0 sff0Var;
        List list2;
        Object objA;
        boolean z3;
        boolean z4;
        sff0 sff0Var2;
        ctf0 ctf0Var2;
        List list3;
        d3w d3wVar;
        boolean z5;
        boolean z6;
        boolean z7;
        String str;
        boolean z8;
        String str2;
        q4f q4fVar;
        Object g0g0Var;
        Bitmap bitmap;
        lsm0 lsm0Var;
        d3w d3wVar2;
        ArrayList arrayList;
        Iterator it;
        int i;
        Object next;
        int i2;
        su6 su6Var;
        Iterator it2;
        d3w d3wVar3;
        List list4;
        boolean z9;
        Object next2;
        ril0 ril0Var;
        String str3;
        boolean z10;
        mvn mvnVar;
        String strA;
        int length;
        String strL;
        String strR;
        String str4;
        boolean z11;
        boolean z12;
        double d;
        Iterator it3;
        boolean z13;
        double d2;
        Object next3;
        lok0 lok0Var;
        String str5;
        String str6;
        int iOrdinal;
        int i3;
        boolean z14;
        String strA2;
        String strF;
        Iterator it4;
        String str7;
        Object next4;
        wne wneVar = wne.f39444a;
        byte b = this.o;
        r2w r2wVar = this.p;
        if (b == 0) {
            z1x.P(obj);
            boolean z15 = r2wVar.p.f5239a.a().y;
            r9u r9uVar = r2wVar.w;
            ygp ygpVar = ygp.c;
            r9uVar.getClass();
            j1q0 j1q0Var = r9uVar.f30104a;
            j1q0Var.getClass();
            boolean z16 = j1q0Var.f15748a.d(ygpVar) && r2wVar.m != sys0.c;
            List listA = r2wVar.q.f20692a.a();
            ctf0Var = r2wVar.o;
            sff0 sff0Var3 = (sff0) r2wVar.z.getValue();
            b8u b8uVar = r2wVar.k;
            this.k = listA;
            this.l = ctf0Var;
            this.m = sff0Var3;
            this.i = z15;
            this.j = z16;
            this.o = (byte) 1;
            objB = ((zfo) b8uVar.f2175a).b(this);
            if (objB != wneVar) {
                boolean z17 = z16;
                z = z15;
                z2 = z17;
                list = listA;
                sff0Var = sff0Var3;
            }
            return wneVar;
        }
        if (b == 1) {
            z2 = this.j;
            z = this.i;
            sff0Var = this.m;
            ctf0Var = this.l;
            list = this.k;
            z1x.P(obj);
            objB = obj;
        } else {
            if (b != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z3 = this.j;
            z4 = this.i;
            List list5 = this.n;
            sff0Var2 = this.m;
            ctf0Var2 = this.l;
            list3 = this.k;
            z1x.P(obj);
            list2 = list5;
            objA = obj;
        }
        long j = ((m2c0) objA).S;
        boolean z18 = r2wVar.p.f5239a.a().T;
        uaq0 uaq0VarA = r2wVar.u.a();
        boolean z19 = r2wVar.x;
        d3wVar = this.q;
        d3wVar.getClass();
        list3.getClass();
        list2.getClass();
        ctf0Var2.getClass();
        sff0Var2.getClass();
        z5 = d3wVar.f;
        z6 = d3wVar.e;
        n3w n3wVar = d3wVar.f5424a;
        if (z5) {
            return f2w.f8834a;
        }
        z7 = d3wVar.d;
        if (!z7 || z6) {
            return new g2w(z7, z6);
        }
        String str8 = n3wVar.g;
        s77 s77Var = n3wVar.c;
        boolean z20 = false;
        q4f q4fVar2 = n3wVar.g1;
        List list6 = n3wVar.J1;
        gx7 gx7Var = sff0Var2.f32117a;
        mb90 mb90VarG = vvw.G(n3wVar, ctf0Var2, gx7Var.h);
        boolean z21 = z3;
        boolean z22 = z4;
        double d3 = n3wVar.m;
        double d4 = s77Var == s77.SALE ? d3 - (n3wVar.o - n3wVar.p1) : 0.0d;
        gm7 gm7Var = gx7Var.f12063a;
        double d5 = d4;
        boolean z23 = gm7Var.k;
        boolean z24 = (n3wVar.y <= n3wVar.A || s77Var == s77.TOTO || s77Var == s77.JACKPOT || s77Var == s77.AUTO || q4fVar2 == q4f.c || q4fVar2 == q4f.j || q4fVar2 == q4f.k || q4fVar2 == q4f.m || q4fVar2 == q4f.x) ? false : true;
        boolean z25 = z22 && n3wVar.K1 == an6.e && q4fVar2 == q4f.c;
        boolean z26 = n3wVar.t1 && d3 > 0.0d && n3wVar.G1 <= 0.0d && gm7Var.m;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it5 = list6.iterator();
        while (it5.hasNext()) {
            su6 su6Var2 = (su6) it5.next();
            Iterator it6 = list3.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    it4 = it5;
                    str7 = str8;
                    next4 = null;
                    break;
                }
                next4 = it6.next();
                it4 = it5;
                str7 = str8;
                if (((lok0) next4).f20396a == su6Var2.c) {
                    break;
                }
                it5 = it4;
                str8 = str7;
            }
            lok0 lok0Var2 = (lok0) next4;
            if (lok0Var2 != null) {
                linkedHashSet.add(lok0Var2);
            }
            it5 = it4;
            str8 = str7;
        }
        String str9 = str8;
        int size = linkedHashSet.size();
        if (size == 0) {
            str = "";
        } else {
            if (size != 1) {
                strF = ctf0Var2.f(R.string.top_events_tag_v2, Integer.valueOf(linkedHashSet.size()));
            } else {
                lok0 lok0Var3 = (lok0) CollectionsKt.V(linkedHashSet);
                strF = lok0Var3 != null ? lok0Var3.b : null;
                if (strF == null) {
                    str = "";
                }
            }
            str = strF;
        }
        boolean z27 = n3wVar.v1;
        String str10 = n3wVar.O1;
        if (StringsKt.W(str10)) {
            z8 = z27;
            str2 = "";
            q4fVar = q4fVar2;
            bitmap = null;
        } else {
            try {
                e0g0 e0g0Var = j0g0.b;
                int iD = ctf0Var2.d(R.dimen.size_180);
                uaq0.f35345a.getClass();
                int iB = ctf0.b(!s9m0.j(uaq0VarA) ? R.attr.uikitStaticWhite : R.attr.uikitStaticBlack, ctf0Var2);
                z8 = z27;
                try {
                    int iB2 = ctf0.b(R.attr.uikitStaticTransparent, ctf0Var2);
                    str2 = "";
                    try {
                        x23 x23Var = new x23(str10);
                        x23Var.f40148a = iD;
                        x23Var.b = iD;
                        q4fVar = q4fVar2;
                        try {
                            ((HashMap) x23Var.c).put(yvn.c, 0);
                            x23Var.e = new eld0(iB, iB2, (byte) 6);
                            g0g0Var = x23Var.b();
                        } catch (Throwable th) {
                            th = th;
                            e0g0 e0g0Var2 = j0g0.b;
                            g0g0Var = new g0g0(th);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        q4fVar = q4fVar2;
                        e0g0 e0g0Var3 = j0g0.b;
                        g0g0Var = new g0g0(th);
                        if (j0g0.a(g0g0Var) != null) {
                            g0g0Var = null;
                        }
                        bitmap = (Bitmap) g0g0Var;
                        lsm0Var = ctf0Var2.b;
                        d3wVar2 = d3wVar;
                        s47 s47Var = new s47(n3wVar, mb90VarG, d5, z23, z24, z25, z26, str, z8, g7x.R(list6, list2), j, z18, bitmap, ctf0Var2.h());
                        arrayList = new ArrayList(r3d.q(list6, 10));
                        it = list6.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            next = it.next();
                            i2 = i + 1;
                            if (i < 0) {
                                q3d.p();
                                throw null;
                            }
                            su6Var = (su6) next;
                            it2 = d3wVar2.c.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next2 = it2.next();
                                    d3wVar3 = d3wVar2;
                                    list4 = list6;
                                    z9 = z19;
                                    if (((ril0) next2).f30549a != su6Var.t) {
                                        z19 = z9;
                                        d3wVar2 = d3wVar3;
                                        list6 = list4;
                                    }
                                } else {
                                    d3wVar3 = d3wVar2;
                                    list4 = list6;
                                    z9 = z19;
                                    next2 = null;
                                }
                            }
                            ril0Var = (ril0) next2;
                            if (ril0Var != null) {
                                str3 = ril0Var.b;
                            } else {
                                str3 = null;
                            }
                            if (str3 == null) {
                                str3 = str2;
                            }
                            if (i == list4.size() - 1) {
                                z10 = true;
                            } else {
                                z10 = z20;
                            }
                            su6Var.getClass();
                            String str11 = su6Var.B;
                            String str12 = su6Var.x;
                            String str13 = su6Var.s;
                            mvnVar = su6Var.k;
                            s77Var.getClass();
                            str9.getClass();
                            Iterator it7 = it;
                            long j2 = su6Var.f32807a;
                            strA = su6Var.q1;
                            int i4 = su6Var.c;
                            length = str3.length();
                            strL = su6Var.b;
                            if (length > 0) {
                                strL = kng0.l(str3, ". ", strL);
                            }
                            String str14 = strL;
                            double d6 = su6Var.d;
                            String str15 = su6Var.e;
                            long j3 = su6Var.f;
                            boolean z28 = su6Var.g;
                            long j4 = su6Var.h;
                            long j5 = su6Var.i;
                            String str16 = su6Var.j;
                            boolean z29 = su6Var.l;
                            String str17 = su6Var.m;
                            long j6 = su6Var.n;
                            lc00 lc00VarB0 = x4d0.b0(j6, su6Var.o);
                            String str18 = su6Var.p;
                            long j7 = su6Var.q;
                            lc00 lc00VarB1 = x4d0.b0(j7, su6Var.r);
                            long j8 = su6Var.t;
                            strR = su6Var.u;
                            if (z21) {
                                strR = kotlin.text.c.r(strR, " \n", ua80.e(su6Var.w, " \n[Р :", "]: "), z20);
                            }
                            String str19 = strR;
                            int i5 = su6Var.v;
                            long j9 = su6Var.y;
                            boolean z30 = su6Var.p1;
                            boolean z31 = su6Var.z;
                            String str20 = su6Var.A;
                            str4 = su6Var.Y;
                            double d7 = su6Var.f1;
                            long j10 = su6Var.g1;
                            long j11 = su6Var.h1;
                            String str21 = su6Var.i1;
                            int i6 = su6Var.j1;
                            int i7 = su6Var.k1;
                            double d8 = su6Var.m1;
                            int i8 = su6Var.l1;
                            z11 = su6Var.Z;
                            if (str4.length() > 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            d = su6Var.n1;
                            it3 = list3.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    next3 = it3.next();
                                    z13 = z11;
                                    d2 = d;
                                    if (((lok0) next3).f20396a != su6Var.c) {
                                        z11 = z13;
                                        d = d2;
                                    }
                                } else {
                                    z13 = z11;
                                    d2 = d;
                                    next3 = null;
                                }
                            }
                            lok0Var = (lok0) next3;
                            if (lok0Var != null) {
                                str5 = lok0Var.b;
                            } else {
                                str5 = null;
                            }
                            if (str5 == null) {
                                str6 = str2;
                            } else {
                                str6 = str5;
                            }
                            String str22 = su6Var.o1;
                            boolean z32 = su6Var.s1;
                            if (mvnVar == mvn.h) {
                                if (strA.length() <= 0) {
                                    strA2 = strA;
                                    z14 = false;
                                } else {
                                    iOrdinal = mvnVar.ordinal();
                                    i3 = R.string.return1;
                                    switch (iOrdinal) {
                                        case 0:
                                            i3 = R.string.accepted;
                                            z14 = false;
                                            strA2 = lsm0Var.a(i3, Arrays.copyOf(new Object[0], 0));
                                            break;
                                        case 1:
                                            i3 = R.string.loosed;
                                            z14 = false;
                                            strA2 = lsm0Var.a(i3, Arrays.copyOf(new Object[0], 0));
                                            break;
                                        case 2:
                                        case 7:
                                            i3 = R.string.won;
                                            z14 = false;
                                            strA2 = lsm0Var.a(i3, Arrays.copyOf(new Object[0], 0));
                                            break;
                                        case 3:
                                        case 4:
                                            z14 = false;
                                            strA2 = lsm0Var.a(i3, Arrays.copyOf(new Object[0], 0));
                                            break;
                                        case 5:
                                            i3 = R.string.win_return_half;
                                            z14 = false;
                                            strA2 = lsm0Var.a(i3, Arrays.copyOf(new Object[0], 0));
                                            break;
                                        case 6:
                                            i3 = R.string.return_half;
                                            z14 = false;
                                            strA2 = lsm0Var.a(i3, Arrays.copyOf(new Object[0], 0));
                                            break;
                                        default:
                                            t9f.b();
                                            return null;
                                    }
                                }
                            } else if (strA.length() <= 0) {
                                strA2 = strA;
                                z14 = false;
                            } else {
                                iOrdinal = mvnVar.ordinal();
                                i3 = R.string.return1;
                                switch (iOrdinal) {
                                    case 0:
                                        i3 = R.string.accepted;
                                        z14 = false;
                                        strA2 = lsm0Var.a(i3, Arrays.copyOf(new Object[0], 0));
                                        break;
                                    case 1:
                                        i3 = R.string.loosed;
                                        z14 = false;
                                        strA2 = lsm0Var.a(i3, Arrays.copyOf(new Object[0], 0));
                                        break;
                                    case 2:
                                    case 7:
                                        i3 = R.string.won;
                                        z14 = false;
                                        strA2 = lsm0Var.a(i3, Arrays.copyOf(new Object[0], 0));
                                        break;
                                    case 3:
                                    case 4:
                                        z14 = false;
                                        strA2 = lsm0Var.a(i3, Arrays.copyOf(new Object[0], 0));
                                        break;
                                    case 5:
                                        i3 = R.string.win_return_half;
                                        z14 = false;
                                        strA2 = lsm0Var.a(i3, Arrays.copyOf(new Object[0], 0));
                                        break;
                                    case 6:
                                        i3 = R.string.return_half;
                                        z14 = false;
                                        strA2 = lsm0Var.a(i3, Arrays.copyOf(new Object[0], 0));
                                        break;
                                    default:
                                        t9f.b();
                                        return null;
                                }
                            }
                            arrayList.add(new uv6(j2, i4, str14, d6, str15, j3, z28, j4, j5, str16, mvnVar, z29, str17, j6, lc00VarB0, str18, j7, lc00VarB1, str13, j8, str19, i5, str12, j9, z30, g7x.R(kotlin.collections.a.c(su6Var), list2), z31, str20, str11, str4, d7, j10, j11, str21, i6, i7, d8, i8, strA2, su6Var.r1, s77Var, q4fVar, str9, z12, z13, z10, d2, str6, str22, z32, z9, ctf0Var2.h()));
                            z20 = z14;
                            i = i2;
                            z19 = z9;
                            d3wVar2 = d3wVar3;
                            list6 = list4;
                            it = it7;
                        }
                        return new h2w(s47Var, arrayList, new cxo0(n3wVar.z1, str9, n3wVar.l));
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str2 = "";
                    q4fVar = q4fVar2;
                    e0g0 e0g0Var4 = j0g0.b;
                    g0g0Var = new g0g0(th);
                    if (j0g0.a(g0g0Var) != null) {
                        g0g0Var = null;
                    }
                    bitmap = (Bitmap) g0g0Var;
                    lsm0Var = ctf0Var2.b;
                    d3wVar2 = d3wVar;
                    s47 s47Var2 = new s47(n3wVar, mb90VarG, d5, z23, z24, z25, z26, str, z8, g7x.R(list6, list2), j, z18, bitmap, ctf0Var2.h());
                    arrayList = new ArrayList(r3d.q(list6, 10));
                    it = list6.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        next = it.next();
                        i2 = i + 1;
                        if (i < 0) {
                            q3d.p();
                            throw null;
                        }
                        su6Var = (su6) next;
                        it2 = d3wVar2.c.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next2 = it2.next();
                                d3wVar3 = d3wVar2;
                                list4 = list6;
                                z9 = z19;
                                if (((ril0) next2).f30549a != su6Var.t) {
                                    z19 = z9;
                                    d3wVar2 = d3wVar3;
                                    list6 = list4;
                                }
                            } else {
                                d3wVar3 = d3wVar2;
                                list4 = list6;
                                z9 = z19;
                                next2 = null;
                            }
                        }
                        ril0Var = (ril0) next2;
                        if (ril0Var != null) {
                            str3 = ril0Var.b;
                        } else {
                            str3 = null;
                        }
                        if (str3 == null) {
                            str3 = str2;
                        }
                        if (i == list4.size() - 1) {
                            z10 = true;
                        } else {
                            z10 = z20;
                        }
                        su6Var.getClass();
                        String str110 = su6Var.B;
                        String str111 = su6Var.x;
                        String str112 = su6Var.s;
                        mvnVar = su6Var.k;
                        s77Var.getClass();
                        str9.getClass();
                        Iterator it8 = it;
                        long j12 = su6Var.f32807a;
                        strA = su6Var.q1;
                        int i9 = su6Var.c;
                        length = str3.length();
                        strL = su6Var.b;
                        if (length > 0) {
                            strL = kng0.l(str3, ". ", strL);
                        }
                        String str113 = strL;
                        double d9 = su6Var.d;
                        String str114 = su6Var.e;
                        long j13 = su6Var.f;
                        boolean z210 = su6Var.g;
                        long j14 = su6Var.h;
                        long j15 = su6Var.i;
                        String str115 = su6Var.j;
                        boolean z211 = su6Var.l;
                        String str116 = su6Var.m;
                        long j16 = su6Var.n;
                        lc00 lc00VarB2 = x4d0.b0(j16, su6Var.o);
                        String str117 = su6Var.p;
                        long j17 = su6Var.q;
                        lc00 lc00VarB3 = x4d0.b0(j17, su6Var.r);
                        long j18 = su6Var.t;
                        strR = su6Var.u;
                        if (z21) {
                            strR = kotlin.text.c.r(strR, " \n", ua80.e(su6Var.w, " \n[Р :", "]: "), z20);
                        }
                        String str118 = strR;
                        int i10 = su6Var.v;
                        long j19 = su6Var.y;
                        boolean z33 = su6Var.p1;
                        boolean z34 = su6Var.z;
                        String str23 = su6Var.A;
                        str4 = su6Var.Y;
                        double d10 = su6Var.f1;
                        long j110 = su6Var.g1;
                        long j111 = su6Var.h1;
                        String str24 = su6Var.i1;
                        int i11 = su6Var.j1;
                        int i12 = su6Var.k1;
                        double d11 = su6Var.m1;
                        int i13 = su6Var.l1;
                        z11 = su6Var.Z;
                        if (str4.length() > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        d = su6Var.n1;
                        it3 = list3.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next3 = it3.next();
                                z13 = z11;
                                d2 = d;
                                if (((lok0) next3).f20396a != su6Var.c) {
                                    z11 = z13;
                                    d = d2;
                                }
                            } else {
                                z13 = z11;
                                d2 = d;
                                next3 = null;
                            }
                        }
                        lok0Var = (lok0) next3;
                        if (lok0Var != null) {
                            str5 = lok0Var.b;
                        } else {
                            str5 = null;
                        }
                        if (str5 == null) {
                            str6 = str2;
                        } else {
                            str6 = str5;
                        }
                        String str25 = su6Var.o1;
                        boolean z35 = su6Var.s1;
                        if (mvnVar == mvn.h) {
                            if (strA.length() <= 0) {
                                strA2 = strA;
                                z14 = false;
                            } else {
                                iOrdinal = mvnVar.ordinal();
                                i3 = R.string.return1;
                                switch (iOrdinal) {
                                    case 0:
                                        i3 = R.string.accepted;
                                        z14 = false;
                                        strA2 = lsm0Var.a(i3, Arrays.copyOf(new Object[0], 0));
                                        break;
                                    case 1:
                                        i3 = R.string.loosed;
                                        z14 = false;
                                        strA2 = lsm0Var.a(i3, Arrays.copyOf(new Object[0], 0));
                                        break;
                                    case 2:
                                    case 7:
                                        i3 = R.string.won;
                                        z14 = false;
                                        strA2 = lsm0Var.a(i3, Arrays.copyOf(new Object[0], 0));
                                        break;
                                    case 3:
                                    case 4:
                                        z14 = false;
                                        strA2 = lsm0Var.a(i3, Arrays.copyOf(new Object[0], 0));
                                        break;
                                    case 5:
                                        i3 = R.string.win_return_half;
                                        z14 = false;
                                        strA2 = lsm0Var.a(i3, Arrays.copyOf(new Object[0], 0));
                                        break;
                                    case 6:
                                        i3 = R.string.return_half;
                                        z14 = false;
                                        strA2 = lsm0Var.a(i3, Arrays.copyOf(new Object[0], 0));
                                        break;
                                    default:
                                        t9f.b();
                                        return null;
                                }
                            }
                        } else if (strA.length() <= 0) {
                            strA2 = strA;
                            z14 = false;
                        } else {
                            iOrdinal = mvnVar.ordinal();
                            i3 = R.string.return1;
                            switch (iOrdinal) {
                                case 0:
                                    i3 = R.string.accepted;
                                    z14 = false;
                                    strA2 = lsm0Var.a(i3, Arrays.copyOf(new Object[0], 0));
                                    break;
                                case 1:
                                    i3 = R.string.loosed;
                                    z14 = false;
                                    strA2 = lsm0Var.a(i3, Arrays.copyOf(new Object[0], 0));
                                    break;
                                case 2:
                                case 7:
                                    i3 = R.string.won;
                                    z14 = false;
                                    strA2 = lsm0Var.a(i3, Arrays.copyOf(new Object[0], 0));
                                    break;
                                case 3:
                                case 4:
                                    z14 = false;
                                    strA2 = lsm0Var.a(i3, Arrays.copyOf(new Object[0], 0));
                                    break;
                                case 5:
                                    i3 = R.string.win_return_half;
                                    z14 = false;
                                    strA2 = lsm0Var.a(i3, Arrays.copyOf(new Object[0], 0));
                                    break;
                                case 6:
                                    i3 = R.string.return_half;
                                    z14 = false;
                                    strA2 = lsm0Var.a(i3, Arrays.copyOf(new Object[0], 0));
                                    break;
                                default:
                                    t9f.b();
                                    return null;
                            }
                        }
                        arrayList.add(new uv6(j12, i9, str113, d9, str114, j13, z210, j14, j15, str115, mvnVar, z211, str116, j16, lc00VarB2, str117, j17, lc00VarB3, str112, j18, str118, i10, str111, j19, z33, g7x.R(kotlin.collections.a.c(su6Var), list2), z34, str23, str110, str4, d10, j110, j111, str24, i11, i12, d11, i13, strA2, su6Var.r1, s77Var, q4fVar, str9, z12, z13, z10, d2, str6, str25, z35, z9, ctf0Var2.h()));
                        z20 = z14;
                        i = i2;
                        z19 = z9;
                        d3wVar2 = d3wVar3;
                        list6 = list4;
                        it = it8;
                    }
                    return new h2w(s47Var2, arrayList, new cxo0(n3wVar.z1, str9, n3wVar.l));
                }
            } catch (Throwable th4) {
                th = th4;
                z8 = z27;
            }
            if (j0g0.a(g0g0Var) != null) {
                g0g0Var = null;
            }
            bitmap = (Bitmap) g0g0Var;
        }
        lsm0Var = ctf0Var2.b;
        d3wVar2 = d3wVar;
        s47 s47Var3 = new s47(n3wVar, mb90VarG, d5, z23, z24, z25, z26, str, z8, g7x.R(list6, list2), j, z18, bitmap, ctf0Var2.h());
        arrayList = new ArrayList(r3d.q(list6, 10));
        it = list6.iterator();
        i = 0;
        while (it.hasNext()) {
            next = it.next();
            i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            su6Var = (su6) next;
            it2 = d3wVar2.c.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next2 = it2.next();
                    d3wVar3 = d3wVar2;
                    list4 = list6;
                    z9 = z19;
                    if (((ril0) next2).f30549a != su6Var.t) {
                        z19 = z9;
                        d3wVar2 = d3wVar3;
                        list6 = list4;
                    }
                } else {
                    d3wVar3 = d3wVar2;
                    list4 = list6;
                    z9 = z19;
                    next2 = null;
                }
            }
            ril0Var = (ril0) next2;
            if (ril0Var != null) {
                str3 = ril0Var.b;
            } else {
                str3 = null;
            }
            if (str3 == null) {
                str3 = str2;
            }
            if (i == list4.size() - 1) {
                z10 = true;
            } else {
                z10 = z20;
            }
            su6Var.getClass();
            String str119 = su6Var.B;
            String str1110 = su6Var.x;
            String str1111 = su6Var.s;
            mvnVar = su6Var.k;
            s77Var.getClass();
            str9.getClass();
            Iterator it9 = it;
            long j112 = su6Var.f32807a;
            strA = su6Var.q1;
            int i14 = su6Var.c;
            length = str3.length();
            strL = su6Var.b;
            if (length > 0) {
                strL = kng0.l(str3, ". ", strL);
            }
            String str1112 = strL;
            double d12 = su6Var.d;
            String str1113 = su6Var.e;
            long j113 = su6Var.f;
            boolean z212 = su6Var.g;
            long j114 = su6Var.h;
            long j115 = su6Var.i;
            String str1114 = su6Var.j;
            boolean z213 = su6Var.l;
            String str1115 = su6Var.m;
            long j116 = su6Var.n;
            lc00 lc00VarB4 = x4d0.b0(j116, su6Var.o);
            String str1116 = su6Var.p;
            long j117 = su6Var.q;
            lc00 lc00VarB5 = x4d0.b0(j117, su6Var.r);
            long j118 = su6Var.t;
            strR = su6Var.u;
            if (z21) {
                strR = kotlin.text.c.r(strR, " \n", ua80.e(su6Var.w, " \n[Р :", "]: "), z20);
            }
            String str1117 = strR;
            int i15 = su6Var.v;
            long j119 = su6Var.y;
            boolean z36 = su6Var.p1;
            boolean z37 = su6Var.z;
            String str26 = su6Var.A;
            str4 = su6Var.Y;
            double d13 = su6Var.f1;
            long j1110 = su6Var.g1;
            long j1111 = su6Var.h1;
            String str27 = su6Var.i1;
            int i16 = su6Var.j1;
            int i17 = su6Var.k1;
            double d14 = su6Var.m1;
            int i18 = su6Var.l1;
            z11 = su6Var.Z;
            if (str4.length() > 0 && str119.length() <= 0 && str1111.length() <= 0 && str1110.length() <= 0) {
                z12 = false;
            } else {
                z12 = true;
            }
            d = su6Var.n1;
            it3 = list3.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next3 = it3.next();
                    z13 = z11;
                    d2 = d;
                    if (((lok0) next3).f20396a != su6Var.c) {
                        z11 = z13;
                        d = d2;
                    }
                } else {
                    z13 = z11;
                    d2 = d;
                    next3 = null;
                }
            }
            lok0Var = (lok0) next3;
            if (lok0Var != null) {
                str5 = lok0Var.b;
            } else {
                str5 = null;
            }
            if (str5 == null) {
                str6 = str2;
            } else {
                str6 = str5;
            }
            String str28 = su6Var.o1;
            boolean z38 = su6Var.s1;
            if (mvnVar == mvn.h || !su6Var.p1) {
                if (strA.length() <= 0) {
                    iOrdinal = mvnVar.ordinal();
                    i3 = R.string.return1;
                    switch (iOrdinal) {
                        case 0:
                            i3 = R.string.accepted;
                            z14 = false;
                            strA2 = lsm0Var.a(i3, Arrays.copyOf(new Object[0], 0));
                            break;
                        case 1:
                            i3 = R.string.loosed;
                            z14 = false;
                            strA2 = lsm0Var.a(i3, Arrays.copyOf(new Object[0], 0));
                            break;
                        case 2:
                        case 7:
                            i3 = R.string.won;
                            z14 = false;
                            strA2 = lsm0Var.a(i3, Arrays.copyOf(new Object[0], 0));
                            break;
                        case 3:
                        case 4:
                            z14 = false;
                            strA2 = lsm0Var.a(i3, Arrays.copyOf(new Object[0], 0));
                            break;
                        case 5:
                            i3 = R.string.win_return_half;
                            z14 = false;
                            strA2 = lsm0Var.a(i3, Arrays.copyOf(new Object[0], 0));
                            break;
                        case 6:
                            i3 = R.string.return_half;
                            z14 = false;
                            strA2 = lsm0Var.a(i3, Arrays.copyOf(new Object[0], 0));
                            break;
                        default:
                            t9f.b();
                            return null;
                    }
                }
                arrayList.add(new uv6(j112, i14, str1112, d12, str1113, j113, z212, j114, j115, str1114, mvnVar, z213, str1115, j116, lc00VarB4, str1116, j117, lc00VarB5, str1111, j118, str1117, i15, str1110, j119, z36, g7x.R(kotlin.collections.a.c(su6Var), list2), z37, str26, str119, str4, d13, j1110, j1111, str27, i16, i17, d14, i18, strA2, su6Var.r1, s77Var, q4fVar, str9, z12, z13, z10, d2, str6, str28, z38, z9, ctf0Var2.h()));
                z20 = z14;
                i = i2;
                z19 = z9;
                d3wVar2 = d3wVar3;
                list6 = list4;
                it = it9;
            } else {
                strA = lsm0Var.a(R.string.opti_win, Arrays.copyOf(new Object[0], 0));
            }
            strA2 = strA;
            z14 = false;
            arrayList.add(new uv6(j112, i14, str1112, d12, str1113, j113, z212, j114, j115, str1114, mvnVar, z213, str1115, j116, lc00VarB4, str1116, j117, lc00VarB5, str1111, j118, str1117, i15, str1110, j119, z36, g7x.R(kotlin.collections.a.c(su6Var), list2), z37, str26, str119, str4, d13, j1110, j1111, str27, i16, i17, d14, i18, strA2, su6Var.r1, s77Var, q4fVar, str9, z12, z13, z10, d2, str6, str28, z38, z9, ctf0Var2.h()));
            z20 = z14;
            i = i2;
            z19 = z9;
            d3wVar2 = d3wVar3;
            list6 = list4;
            it = it9;
        }
        return new h2w(s47Var3, arrayList, new cxo0(n3wVar.z1, str9, n3wVar.l));
        list2 = (List) objB;
        rou rouVar = r2wVar.t;
        this.k = list;
        this.l = ctf0Var;
        this.m = sff0Var;
        this.n = list2;
        this.i = z;
        this.j = z2;
        this.o = (byte) 2;
        objA = rouVar.a(false, this);
        if (objA != wneVar) {
            z3 = z2;
            z4 = z;
            sff0Var2 = sff0Var;
            ctf0Var2 = ctf0Var;
            list3 = list;
            long j20 = ((m2c0) objA).S;
            boolean z110 = r2wVar.p.f5239a.a().T;
            uaq0 uaq0VarA2 = r2wVar.u.a();
            boolean z111 = r2wVar.x;
            d3wVar = this.q;
            d3wVar.getClass();
            list3.getClass();
            list2.getClass();
            ctf0Var2.getClass();
            sff0Var2.getClass();
            z5 = d3wVar.f;
            z6 = d3wVar.e;
            n3w n3wVar2 = d3wVar.f5424a;
            if (z5) {
                return f2w.f8834a;
            }
            z7 = d3wVar.d;
            if (z7) {
            }
            return new g2w(z7, z6);
        }
        return wneVar;
    }
}
