package a;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class tu3 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ boolean k;
    public Object l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu3(yuu yuuVar, String str, String str2, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 11;
        this.l = yuuVar;
        this.m = str;
        this.n = str2;
        this.k = z;
    }

    /* JADX WARN: Code duplicated, block: B:138:0x01b3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.ArrayList] */
    private final Object l(Object obj) {
        Object objA;
        boolean z;
        yuu yuuVar = (yuu) this.l;
        knf0 knf0Var = (knf0) yuuVar.d;
        wne wneVar = wne.f39444a;
        boolean z2 = this.j;
        ?? arrayList = 0;
        if (!z2) {
            z1x.P(obj);
            int iB = knf0Var.b();
            knf0Var.getClass();
            Map<String, Object> mapK = xp20.k(ofm0.o(iB, (String) this.m, knf0Var.c()), new Pair("sportId", (String) this.n));
            kd30 kd30Var = (kd30) yuuVar.c;
            this.j = true;
            objA = ((jvl0) ((goi0) kd30Var.b).invoke()).a(mapK, "application/vnd.xenvelop+json", this);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (!z2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            objA = obj;
        }
        lwl0 lwl0Var = ((jxl0) ((dx5) objA).a()).e;
        if (lwl0Var == null) {
            jf4.k(null);
            return null;
        }
        boolean z3 = this.k;
        String str = lwl0Var.f20770a;
        String str2 = str == null ? "" : str;
        String str3 = lwl0Var.b;
        String str4 = str3 == null ? "" : str3;
        String str5 = lwl0Var.c;
        String str6 = str5 == null ? "" : str5;
        String str7 = lwl0Var.d;
        String str8 = str7 == null ? "" : str7;
        String str9 = lwl0Var.e;
        String str10 = str9 == null ? "" : str9;
        String str11 = lwl0Var.f;
        String str12 = str11 == null ? "" : str11;
        String str13 = lwl0Var.g;
        String str14 = str13 == null ? "" : str13;
        String str15 = lwl0Var.h;
        String str16 = str15 == null ? "" : str15;
        String str17 = lwl0Var.i;
        String str18 = str17 == null ? "" : str17;
        String str19 = lwl0Var.j;
        String str20 = str19 == null ? "" : str19;
        String str21 = lwl0Var.k;
        String str22 = str21 == null ? "" : str21;
        String str23 = lwl0Var.l;
        String str24 = str23 == null ? "" : str23;
        String str25 = lwl0Var.m;
        String str26 = str25 == null ? "" : str25;
        String str27 = lwl0Var.n;
        String str28 = str27 == null ? "" : str27;
        String str29 = lwl0Var.o;
        String str30 = str29 == null ? "" : str29;
        String str31 = lwl0Var.p;
        String str32 = str31 == null ? "" : str31;
        String str33 = lwl0Var.q;
        String str34 = str33 == null ? "" : str33;
        String str35 = lwl0Var.r;
        String str36 = str35 == null ? "" : str35;
        String str37 = lwl0Var.s;
        String str38 = str37 == null ? "" : str37;
        List<sjc> list = lwl0Var.t;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
            for (sjc sjcVar : list) {
                sjcVar.getClass();
                String str39 = sjcVar.f32297a;
                String str40 = str39 == null ? "" : str39;
                String str41 = sjcVar.b;
                String str42 = str41 == null ? "" : str41;
                String str43 = sjcVar.c;
                String str44 = str43 == null ? "" : str43;
                String str45 = sjcVar.d;
                String str46 = str45 == null ? "" : str45;
                String str47 = sjcVar.e;
                arrayList2.add(new pjc(str40, str42, str44, str46, str47 == null ? "" : str47));
            }
            arrayList = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (((pjc) obj2).f27082a.length() > 0) {
                    arrayList.add(obj2);
                }
            }
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        ?? r27 = arrayList;
        List list2 = lwl0Var.u;
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        List list3 = list2;
        Boolean bool = lwl0Var.v;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        if (z3) {
            z = true;
        } else {
            Boolean bool2 = lwl0Var.w;
            if (bool2 != null ? bool2.booleanValue() : false) {
                z = true;
            } else {
                z = false;
            }
        }
        return new xvl0(str2, str4, str6, str8, str10, str12, str14, str16, str18, str20, str22, str24, str26, str28, str30, str32, str34, str36, str38, r27, list3, zBooleanValue, z);
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.n;
        switch (b) {
            case 0:
                tu3 tu3Var = new tu3((hie0) this.l, (zu3) this.m, (mie0) obj2, yjeVar);
                tu3Var.k = ((ka80) obj).f17953a;
                return tu3Var;
            case 1:
                return new tu3(this.l, this.m, this.k, obj2, yjeVar, (byte) 1);
            case 2:
                tu3 tu3Var2 = new tu3((p5a) this.m, yjeVar, (v7c) obj2, this.k);
                tu3Var2.l = obj;
                return tu3Var2;
            case 3:
                return new tu3(this.k, this.l, this.m, obj2, yjeVar, (byte) 3);
            case 4:
                tu3 tu3Var3 = new tu3(this.k, (pbt) obj2, yjeVar);
                tu3Var3.m = obj;
                return tu3Var3;
            case 5:
                return new tu3(this.k, this.l, this.m, obj2, yjeVar, (byte) 5);
            case 6:
                tu3 tu3Var4 = new tu3((t33) this.m, this.j, (t33) obj2, this.k, yjeVar);
                tu3Var4.l = obj;
                return tu3Var4;
            case 7:
                tu3 tu3Var5 = new tu3(this.m, this.k, obj2, yjeVar, (byte) 7);
                tu3Var5.l = obj;
                return tu3Var5;
            case 8:
                return new tu3((pzu) this.l, this.k, (uu4) this.m, (ynb0) obj2, yjeVar);
            case 9:
                return new tu3(this.l, this.m, this.k, obj2, yjeVar, (byte) 9);
            case 10:
                tu3 tu3Var6 = new tu3((w5z) this.m, (String) obj2, this.k, yjeVar);
                tu3Var6.l = obj;
                return tu3Var6;
            case 11:
                return new tu3((yuu) this.l, (String) this.m, (String) obj2, this.k, yjeVar);
            case 12:
                return new tu3(this.m, this.k, obj2, yjeVar, (byte) 12);
            default:
                tu3 tu3Var7 = new tu3((yqq0) obj2, this.k, yjeVar);
                tu3Var7.m = obj;
                return tu3Var7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                boolean z = ((ka80) obj).f17953a;
                tu3 tu3Var = new tu3((hie0) this.l, (zu3) this.m, (mie0) this.n, (yje) obj2);
                tu3Var.k = z;
                return tu3Var.invokeSuspend(Unit.f46060a);
            case 1:
                return ((tu3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((tu3) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((tu3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((tu3) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((tu3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((tu3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((tu3) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((tu3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((tu3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((tu3) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((tu3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((tu3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((tu3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:193:0x0699  */
    /* JADX WARN: Code duplicated, block: B:203:0x06b9  */
    /* JADX WARN: Code duplicated, block: B:364:0x0b30  */
    /* JADX WARN: Code duplicated, block: B:365:0x0b32  */
    /* JADX WARN: Code duplicated, block: B:367:0x0b3c  */
    /* JADX WARN: Code duplicated, block: B:369:0x0b41  */
    /* JADX WARN: Code duplicated, block: B:371:0x0b48  */
    /* JADX WARN: Code duplicated, block: B:373:0x0b4b  */
    /* JADX WARN: Code duplicated, block: B:374:0x0b54  */
    /* JADX WARN: Code duplicated, block: B:375:0x0b59  */
    /* JADX WARN: Code duplicated, block: B:376:0x0b62  */
    /* JADX WARN: Code duplicated, block: B:379:0x0b95  */
    /* JADX WARN: Code duplicated, block: B:382:0x0ba3  */
    /* JADX WARN: Code duplicated, block: B:479:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:485:0x02dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0155  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v70 java.lang.Object, still in use, count: 2, list:
          (r11v70 java.lang.Object) from 0x06b5: PHI (r11 I:??) = (r11v66 java.lang.Object), (r11v70 java.lang.Object) binds: [B:200:0x06b4, B:474:0x06b5] A[DONT_GENERATE, DONT_INLINE]
          (r11v70 java.lang.Object) from 0x06ad: CHECK_CAST (a.md80) (r11v70 java.lang.Object)
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
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r44) {
        /*
            Method dump skipped, instruction units count: 3410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.tu3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu3(p5a p5aVar, yje yjeVar, v7c v7cVar, boolean z) {
        super(2, yjeVar);
        this.i = (byte) 2;
        this.m = p5aVar;
        this.n = v7cVar;
        this.k = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu3(t33 t33Var, boolean z, t33 t33Var2, boolean z2, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 6;
        this.m = t33Var;
        this.j = z;
        this.n = t33Var2;
        this.k = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu3(pzu pzuVar, boolean z, uu4 uu4Var, ynb0 ynb0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 8;
        this.l = pzuVar;
        this.k = z;
        this.m = uu4Var;
        this.n = ynb0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu3(w5z w5zVar, String str, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 10;
        this.m = w5zVar;
        this.n = str;
        this.k = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu3(hie0 hie0Var, zu3 zu3Var, mie0 mie0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        this.l = hie0Var;
        this.m = zu3Var;
        this.n = mie0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu3(yqq0 yqq0Var, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 13;
        this.n = yqq0Var;
        this.k = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tu3(Object obj, Object obj2, boolean z, Object obj3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = obj2;
        this.k = z;
        this.n = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tu3(Object obj, boolean z, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
        this.k = z;
        this.n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu3(boolean z, pbt pbtVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 4;
        this.k = z;
        this.n = pbtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tu3(boolean z, Object obj, Object obj2, Object obj3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = z;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
    }
}
