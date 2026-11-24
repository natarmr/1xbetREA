package a;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class oxt extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ kmq k;
    public /* synthetic */ Object[] l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oxt(int i, yje yjeVar, byte b) {
        super(i, yjeVar);
        this.i = b;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        kmq kmqVar = (kmq) obj;
        Object[] objArr = (Object[]) obj2;
        yje yjeVar = (yje) obj3;
        switch (this.i) {
            case 0:
                oxt oxtVar = new oxt(3, yjeVar, (byte) 0);
                oxtVar.k = kmqVar;
                oxtVar.l = objArr;
                return oxtVar.invokeSuspend(Unit.f46060a);
            case 1:
                oxt oxtVar2 = new oxt(3, yjeVar, (byte) 1);
                oxtVar2.k = kmqVar;
                oxtVar2.l = objArr;
                return oxtVar2.invokeSuspend(Unit.f46060a);
            case 2:
                oxt oxtVar3 = new oxt(3, yjeVar, (byte) 2);
                oxtVar3.k = kmqVar;
                oxtVar3.l = objArr;
                return oxtVar3.invokeSuspend(Unit.f46060a);
            case 3:
                oxt oxtVar4 = new oxt(3, yjeVar, (byte) 3);
                oxtVar4.k = kmqVar;
                oxtVar4.l = objArr;
                return oxtVar4.invokeSuspend(Unit.f46060a);
            case 4:
                oxt oxtVar5 = new oxt(3, yjeVar, (byte) 4);
                oxtVar5.k = kmqVar;
                oxtVar5.l = objArr;
                return oxtVar5.invokeSuspend(Unit.f46060a);
            default:
                oxt oxtVar6 = new oxt(3, yjeVar, (byte) 5);
                oxtVar6.k = kmqVar;
                oxtVar6.l = objArr;
                return oxtVar6.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        w4e w4eVar;
        int i = 0;
        w4e w4eVar2 = null;
        switch (this.i) {
            case 0:
                kmq kmqVar = this.k;
                Object[] objArr = this.l;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Map map = (Map) obj5;
                    List list = (List) obj4;
                    List list2 = (List) obj3;
                    List list3 = (List) obj2;
                    z9s z9sVar = new z9s(list3, list2, list, map, (Map) objArr[4], (List) objArr[5]);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (kmqVar.a(z9sVar, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                kmq kmqVar2 = this.k;
                Object[] objArr2 = this.l;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    Object obj6 = objArr2[0];
                    Object obj7 = objArr2[1];
                    Object obj8 = objArr2[2];
                    Object obj9 = objArr2[3];
                    Object obj10 = objArr2[4];
                    Object obj11 = objArr2[5];
                    Object obj12 = objArr2[6];
                    Object obj13 = objArr2[7];
                    Object obj14 = ((j0g0) objArr2[8]).f15681a;
                    Object obj15 = ((j0g0) obj13).f15681a;
                    Object obj16 = ((j0g0) obj12).f15681a;
                    Object obj17 = ((j0g0) obj11).f15681a;
                    Object obj18 = ((j0g0) obj10).f15681a;
                    Object obj19 = ((j0g0) obj9).f15681a;
                    Object obj20 = ((j0g0) obj8).f15681a;
                    jih jihVar = new jih(((j0g0) obj6).f15681a, ((j0g0) obj7).f15681a, obj20, obj19, obj18, obj17, obj16, obj15, obj14);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (kmqVar2.a(jihVar, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                kmq kmqVar3 = this.k;
                Object[] objArr3 = this.l;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    Object obj21 = objArr3[0];
                    Object obj22 = objArr3[1];
                    Object obj23 = objArr3[2];
                    Object obj24 = objArr3[3];
                    Map map2 = (Map) obj24;
                    List list4 = (List) obj23;
                    List list5 = (List) obj22;
                    List list6 = (List) obj21;
                    z9s z9sVar2 = new z9s(list6, list5, list4, map2, (Map) objArr3[4], (List) objArr3[5]);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (kmqVar3.a(z9sVar2, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                kmq kmqVar4 = this.k;
                Object[] objArr4 = this.l;
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    Object obj25 = objArr4[0];
                    Object obj26 = objArr4[1];
                    Object obj27 = objArr4[2];
                    List list7 = (List) obj27;
                    j060 j060Var = new j060(CollectionsKt.q0(list7, (List) objArr4[3]).size(), ((List) obj25).size(), ((List) obj26).size(), ((List) objArr4[4]).size(), ((List) objArr4[5]).size(), ((List) objArr4[6]).size(), ((List) objArr4[7]).size());
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (kmqVar4.a(j060Var, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                kmq kmqVar5 = this.k;
                Object[] objArr5 = this.l;
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    Object obj28 = objArr5[0];
                    Object obj29 = objArr5[1];
                    Object obj30 = objArr5[2];
                    Object obj31 = objArr5[3];
                    Object obj32 = objArr5[4];
                    nz50 nz50Var = (nz50) obj32;
                    nz50 nz50Var2 = (nz50) obj31;
                    nz50 nz50Var3 = (nz50) obj30;
                    nz50 nz50Var4 = (nz50) obj29;
                    nz50 nz50Var5 = (nz50) obj28;
                    rz50 rz50Var = new rz50(nz50Var, (nz50) objArr5[6], nz50Var5, nz50Var4, nz50Var3, nz50Var2, (nz50) objArr5[5], new kz50(iun.f15405a));
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (kmqVar5.a(rz50Var, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    kmq kmqVar6 = this.k;
                    w4e[] w4eVarArr = (w4e[]) this.l;
                    int length = w4eVarArr.length;
                    while (true) {
                        w4eVar = u4e.f35042a;
                        if (i < length) {
                            w4e w4eVar3 = w4eVarArr[i];
                            if (Intrinsics.d(w4eVar3, w4eVar)) {
                                i++;
                            } else {
                                w4eVar2 = w4eVar3;
                            }
                        }
                    }
                    if (w4eVar2 != null) {
                        w4eVar = w4eVar2;
                    }
                    this.j = true;
                    if (kmqVar6.a(w4eVar, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
