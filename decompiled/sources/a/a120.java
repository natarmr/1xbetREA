package a;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class a120 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ f120 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a120(f120 f120Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = f120Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        f120 f120Var = this.k;
        switch (b) {
            case 0:
                return new a120(f120Var, yjeVar, (byte) 0);
            case 1:
                return new a120(f120Var, yjeVar, (byte) 1);
            case 2:
                return new a120(f120Var, yjeVar, (byte) 2);
            case 3:
                return new a120(f120Var, yjeVar, (byte) 3);
            case 4:
                return new a120(f120Var, yjeVar, (byte) 4);
            case 5:
                return new a120(f120Var, yjeVar, (byte) 5);
            case 6:
                return new a120(f120Var, yjeVar, (byte) 6);
            default:
                a120 a120Var = new a120(f120Var, yjeVar, (byte) 7);
                a120Var.j = ((Boolean) obj).booleanValue();
                return a120Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((a120) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((a120) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((a120) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((a120) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((a120) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((a120) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((a120) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((a120) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0136  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v4, types: [a.lnm] */
    /* JADX WARN: Type inference failed for: r22v3, types: [java.lang.Throwable] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objG;
        Object value;
        Object objJ;
        ufx vam0Var;
        Object value2;
        v020 v020Var;
        vim rimVar;
        boolean z;
        Object value3;
        Object objD0;
        byte b = this.i;
        f120 f120Var = this.k;
        ydm0 ydm0Var = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    x4u x4uVar = f120Var.O;
                    String str = f120Var.o;
                    this.j = true;
                    objG = ((wti) x4uVar.f40284a).g(this, str, false);
                    if (objG == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objG = obj;
                }
                ehm0 ehm0VarA = ehm0.a(((v020) f120Var.D()).n, false, 0, new xam0(new bvq((vuq) objG, ((v020) f120Var.D()).h.h, ((v020) f120Var.D()).h.i)), 7);
                p7m0 p7m0Var = f120Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, v020.a((v020) value, false, false, 0L, false, 0, null, null, null, null, null, null, ehm0VarA, null, null, null, null, null, null, null, null, 8380415)));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    jtj jtjVar = f120Var.L;
                    String str2 = ((v020) f120Var.D()).f;
                    this.j = true;
                    objJ = jtjVar.j(this, str2, false, false);
                    if (objJ == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objJ = obj;
                }
                List listE0 = CollectionsKt.E0(5, r3d.r(((Map) objJ).values()));
                ArrayList arrayList = new ArrayList(r3d.q(listE0, 10));
                int i = 0;
                for (Object obj2 : listE0) {
                    int i2 = i + 1;
                    if (i < 0) {
                        ?? r22 = ydm0Var;
                        q3d.p();
                        throw r22;
                    }
                    mas masVar = (mas) obj2;
                    String str3 = ((v020) f120Var.D()).h.h.f35586a;
                    int size = listE0.size() - 1;
                    masVar.getClass();
                    String str4 = masVar.c;
                    ufp0 ufp0Var = masVar.g;
                    str3.getClass();
                    b9a0 b9a0Var = masVar.f21474a;
                    b9a0 b9a0Var2 = masVar.d;
                    ydm0 ydm0Var2 = ydm0Var;
                    y6n y6nVar = Intrinsics.d(ufp0Var.f35586a, str3) ? y6n.f42107a : y6n.b;
                    ggm ggmVar = i == 0 ? size == 0 ? ggm.c : ggm.f11256a : i == size ? ggm.b : ggm.d;
                    b9a0 b9a0Var3 = b9a0.g;
                    boolean zD = Intrinsics.d(b9a0Var2, b9a0Var3);
                    String str5 = masVar.b;
                    String str6 = masVar.e;
                    if (zD) {
                        rimVar = new sim(str5, str6, str4, y6nVar, ggmVar, masVar.h);
                    } else {
                        rimVar = new rim(str5, str6, fxb.N(b9a0Var2), !Intrinsics.d(b9a0Var, b9a0Var3) ? fxb.N(b9a0Var) : ydm0Var2, str4, dub.p0(ufp0Var), y6nVar, ggmVar, masVar.h);
                    }
                    arrayList.add(rimVar);
                    i = i2;
                    ydm0Var = ydm0Var2;
                }
                if (arrayList.isEmpty()) {
                    int i3 = f120.p0;
                    vam0Var = new vam0(ocl.b(f120Var.e0, pb10.r1, pdm.c, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 988));
                } else {
                    vam0Var = new xam0(new was(dyb.r0(arrayList)));
                }
                ufx ufxVar = vam0Var;
                int i4 = f120.p0;
                p7m0 p7m0Var2 = f120Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    v020Var = (v020) value2;
                } while (!p7m0Var2.m(value2, v020.a(v020Var, false, false, 0L, false, 0, null, null, null, null, null, ehm0.a(v020Var.m, true, 0, ufxVar, 6), null, null, null, null, null, null, null, null, null, 8384511)));
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    jru jruVar = f120Var.M;
                    String str7 = f120Var.o;
                    n3q n3qVar = n3q.f22862a;
                    this.j = true;
                    Object objC = ((dgu) jruVar.b).C(str7, n3qVar, this);
                    if (objC != wneVar3) {
                        objC = Unit.f46060a;
                    }
                    if (objC == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i5 = f120.p0;
                zdm0 zdm0Var = ((v020) f120Var.D()).j;
                ydm0Var = zdm0Var instanceof ydm0 ? (ydm0) zdm0Var : null;
                if (ydm0Var == null) {
                    z = false;
                } else {
                    vdm0 vdm0Var = ydm0Var.b;
                    if (vdm0Var instanceof pdm0) {
                        z = ((pdm0) vdm0Var).b.f;
                    } else if (vdm0Var instanceof tdm0) {
                        z = ((tdm0) vdm0Var).c.f;
                    } else {
                        z = false;
                    }
                }
                h1z h1zVarN = f120Var.N(jam0.e, z);
                h1z h1zVarN2 = f120Var.N(jam0.f, z);
                h1z h1zVarN3 = f120Var.N(jam0.g, z);
                mdm mdmVarB = ocl.b(f120Var.e0, pb10.r1, pdm.c, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 988);
                ehm0 ehm0VarA2 = ehm0.a(((v020) f120Var.D()).r, false, 0, new xam0(new n1z(h1zVarN, mdmVarB)), 7);
                ehm0 ehm0VarA3 = ehm0.a(((v020) f120Var.D()).s, false, 0, new xam0(new n1z(h1zVarN2, mdmVarB)), 7);
                ehm0 ehm0VarA4 = ehm0.a(((v020) f120Var.D()).t, false, 0, new xam0(new n1z(h1zVarN3, mdmVarB)), 7);
                p7m0 p7m0Var3 = f120Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                } while (!p7m0Var3.m(value3, v020.a((v020) value3, false, false, 0L, false, 0, null, null, null, null, null, null, null, null, null, null, ehm0VarA2, ehm0VarA3, ehm0VarA4, null, null, 7471103)));
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    e1u e1uVar = f120Var.I;
                    String str8 = ((v020) f120Var.D()).f;
                    this.j = true;
                    ywu ywuVar = (ywu) e1uVar.b;
                    objD0 = qjj.d0(((mne) ywuVar.b).b, new bfm0(ywuVar, str8, false, null), this);
                    if (objD0 == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objD0 = obj;
                }
                b120 b120Var = new b120((l800) objD0, (byte) 0);
                int i6 = f120.p0;
                f120Var.H(b120Var);
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    bby bbyVar = f120Var.h0;
                    if (bbyVar != null) {
                        this.j = true;
                        if (zvw.H(bbyVar, this) == wneVar5) {
                            return wneVar5;
                        }
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z7 = this.j;
                if (!z7) {
                    z1x.P(obj);
                    zqu zquVar = f120Var.u;
                    String str9 = f120Var.o;
                    zquVar.getClass();
                    str9.getClass();
                    nfm0 nfm0Var = zquVar.f44824a;
                    nfm0Var.getClass();
                    ddm0 ddm0Var = nfm0Var.c;
                    ddm0Var.getClass();
                    zj2 zj2Var = new zj2(vtb.M(ddm0Var.c), ddm0Var, str9, (byte) 20);
                    cw10 cw10Var = new cw10(f120Var, (byte) 7);
                    this.j = true;
                    if (zj2Var.c(cw10Var, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    jwu jwuVar = f120Var.a0;
                    String str10 = f120Var.o;
                    this.j = true;
                    if (jwuVar.b(str10, this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                boolean z9 = this.j;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                if (z9) {
                    int i7 = f120.p0;
                    f120Var.W(false);
                }
                return Unit.f46060a;
        }
    }
}
