package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class l750 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19540a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ha8 c;

    public /* synthetic */ l750(String str, ha8 ha8Var, byte b) {
        this.f19540a = b;
        this.b = str;
        this.c = ha8Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f19540a;
        ha8 ha8Var = this.c;
        String str = this.b;
        boolean z = false;
        switch (b) {
            case 0:
                p650 p650Var = (p650) obj2;
                ((oyg0) obj).getClass();
                p650Var.getClass();
                List<jge> list = p650Var.h;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (jge cgeVar : list) {
                    if (f140.w(cgeVar, str) && (cgeVar instanceof cge)) {
                        da8 da8Var = (da8) ha8Var;
                        cgeVar = new cge(da8.b(da8Var, rh10.a((rh10) da8Var.b, true, null, 2)));
                        z = true;
                    }
                    arrayList.add(cgeVar);
                }
                return z ? p650.a(p650Var, null, arrayList, null, false, 262015) : p650Var;
            case 1:
                p650 p650Var2 = (p650) obj2;
                ((oyg0) obj).getClass();
                p650Var2.getClass();
                List<jge> list2 = p650Var2.h;
                ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                boolean z2 = false;
                for (jge cgeVar2 : list2) {
                    if (f140.w(cgeVar2, str) && (cgeVar2 instanceof cge)) {
                        da8 da8Var2 = (da8) ha8Var;
                        cgeVar2 = new cge(da8.b(da8Var2, rh10.a((rh10) da8Var2.b, false, null, 2)));
                        z2 = true;
                    }
                    arrayList2.add(cgeVar2);
                }
                return z2 ? p650.a(p650Var2, null, arrayList2, null, false, 262015) : p650Var2;
            case 2:
                p650 p650Var3 = (p650) obj2;
                ((oyg0) obj).getClass();
                p650Var3.getClass();
                List<jge> list3 = p650Var3.h;
                ArrayList arrayList3 = new ArrayList(r3d.q(list3, 10));
                for (jge cgeVar3 : list3) {
                    if (f140.w(cgeVar3, str) && (cgeVar3 instanceof cge)) {
                        da8 da8Var3 = (da8) ha8Var;
                        cgeVar3 = new cge(da8.b(da8Var3, rh10.a((rh10) da8Var3.b, true, null, 2)));
                        z = true;
                    }
                    arrayList3.add(cgeVar3);
                }
                return z ? p650.a(p650Var3, null, arrayList3, null, false, 262015) : p650Var3;
            case 3:
                p650 p650Var4 = (p650) obj2;
                ((oyg0) obj).getClass();
                p650Var4.getClass();
                List<jge> list4 = p650Var4.h;
                ArrayList arrayList4 = new ArrayList(r3d.q(list4, 10));
                for (jge bgeVar : list4) {
                    if (f140.w(bgeVar, str) && (bgeVar instanceof bge)) {
                        bgeVar = new bge(ha8Var);
                        z = true;
                    }
                    arrayList4.add(bgeVar);
                }
                return z ? p650.a(p650Var4, null, arrayList4, null, false, 262015) : p650Var4;
            case 4:
                p650 p650Var5 = (p650) obj2;
                ((oyg0) obj).getClass();
                p650Var5.getClass();
                List<jge> list5 = p650Var5.h;
                ArrayList arrayList5 = new ArrayList(r3d.q(list5, 10));
                for (jge bgeVar2 : list5) {
                    if (f140.w(bgeVar2, str) && (bgeVar2 instanceof bge)) {
                        bgeVar2 = new bge(new aa8(ha8Var.a()));
                        z = true;
                    }
                    arrayList5.add(bgeVar2);
                }
                return z ? p650.a(p650Var5, null, arrayList5, null, false, 262015) : p650Var5;
            case 5:
                p650 p650Var6 = (p650) obj2;
                ((oyg0) obj).getClass();
                p650Var6.getClass();
                List<jge> list6 = p650Var6.h;
                ArrayList arrayList6 = new ArrayList(r3d.q(list6, 10));
                for (jge bgeVar3 : list6) {
                    if (f140.w(bgeVar3, str) && (bgeVar3 instanceof bge)) {
                        bgeVar3 = new bge(new aa8(ha8Var.a()));
                        z = true;
                    }
                    arrayList6.add(bgeVar3);
                }
                return z ? p650.a(p650Var6, null, arrayList6, null, false, 262015) : p650Var6;
            case 6:
                p650 p650Var7 = (p650) obj2;
                ((oyg0) obj).getClass();
                p650Var7.getClass();
                List<jge> list7 = p650Var7.h;
                ArrayList arrayList7 = new ArrayList(r3d.q(list7, 10));
                for (jge cgeVar4 : list7) {
                    if (f140.w(cgeVar4, str) && (cgeVar4 instanceof cge)) {
                        cgeVar4 = new cge(ha8Var);
                        z = true;
                    }
                    arrayList7.add(cgeVar4);
                }
                return z ? p650.a(p650Var7, null, arrayList7, null, false, 262015) : p650Var7;
            case 7:
                p650 p650Var8 = (p650) obj2;
                ((oyg0) obj).getClass();
                p650Var8.getClass();
                List<jge> list8 = p650Var8.h;
                ArrayList arrayList8 = new ArrayList(r3d.q(list8, 10));
                for (jge cgeVar5 : list8) {
                    if (f140.w(cgeVar5, str) && (cgeVar5 instanceof cge)) {
                        cgeVar5 = new cge(new aa8(ha8Var.a()));
                        z = true;
                    }
                    arrayList8.add(cgeVar5);
                }
                return z ? p650.a(p650Var8, null, arrayList8, null, false, 262015) : p650Var8;
            case 8:
                p650 p650Var9 = (p650) obj2;
                ((oyg0) obj).getClass();
                p650Var9.getClass();
                List<jge> list9 = p650Var9.h;
                ArrayList arrayList9 = new ArrayList(r3d.q(list9, 10));
                for (jge fgeVar : list9) {
                    if (f140.w(fgeVar, str) && (fgeVar instanceof fge)) {
                        fgeVar = new fge(ha8Var);
                        z = true;
                    }
                    arrayList9.add(fgeVar);
                }
                return z ? p650.a(p650Var9, null, arrayList9, null, false, 262015) : p650Var9;
            case 9:
                p650 p650Var10 = (p650) obj2;
                ((oyg0) obj).getClass();
                p650Var10.getClass();
                List<jge> list10 = p650Var10.h;
                ArrayList arrayList10 = new ArrayList(r3d.q(list10, 10));
                for (jge zfeVar : list10) {
                    if (f140.w(zfeVar, str) && (zfeVar instanceof zfe)) {
                        zfeVar = new zfe(new aa8(ha8Var.a()));
                        z = true;
                    }
                    arrayList10.add(zfeVar);
                }
                return z ? p650.a(p650Var10, null, arrayList10, null, false, 262015) : p650Var10;
            case 10:
                p650 p650Var11 = (p650) obj2;
                ((oyg0) obj).getClass();
                p650Var11.getClass();
                List<jge> list11 = p650Var11.h;
                ArrayList arrayList11 = new ArrayList(r3d.q(list11, 10));
                for (jge zfeVar2 : list11) {
                    if (f140.w(zfeVar2, str) && (zfeVar2 instanceof zfe)) {
                        zfeVar2 = new zfe(new y98(ha8Var.a()));
                        z = true;
                    }
                    arrayList11.add(zfeVar2);
                }
                return z ? p650.a(p650Var11, null, arrayList11, null, false, 262015) : p650Var11;
            default:
                p650 p650Var12 = (p650) obj2;
                ((oyg0) obj).getClass();
                p650Var12.getClass();
                List<jge> list12 = p650Var12.h;
                ArrayList arrayList12 = new ArrayList(r3d.q(list12, 10));
                for (jge ageVar : list12) {
                    if (f140.w(ageVar, str) && (ageVar instanceof age)) {
                        ageVar = new age(ha8Var);
                        z = true;
                    }
                    arrayList12.add(ageVar);
                }
                return z ? p650.a(p650Var12, null, arrayList12, null, false, 262015) : p650Var12;
        }
    }
}
