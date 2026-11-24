package a;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ly8 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ ty8 k;
    public final /* synthetic */ long l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ly8(ty8 ty8Var, long j, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ty8Var;
        this.l = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new ly8(this.k, this.l, yjeVar, (byte) 0);
            default:
                return new ly8(this.k, this.l, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((ly8) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005a  */
    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0073  */
    /* JADX WARN: Code duplicated, block: B:23:0x0077  */
    /* JADX WARN: Code duplicated, block: B:25:0x0084  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:29:0x00db  */
    /* JADX WARN: Code duplicated, block: B:32:0x0116  */
    /* JADX WARN: Code duplicated, block: B:33:0x0119  */
    /* JADX WARN: Code duplicated, block: B:35:0x011d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0120  */
    /* JADX WARN: Code duplicated, block: B:41:0x018d  */
    /* JADX WARN: Code duplicated, block: B:58:0x01de  */
    /* JADX WARN: Code duplicated, block: B:59:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:61:0x020f  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        mlr mlrVar;
        boolean zContains;
        short s;
        String strP;
        Integer num;
        int iIntValue;
        mlr mlrVar2;
        int i;
        boolean zN;
        long j;
        wne wneVar;
        boolean z;
        short s2;
        long j2;
        long j3;
        String str;
        pw70 pw70Var;
        short s3;
        boolean z2;
        String strP2;
        byte b = this.i;
        int i2 = -1;
        long j4 = this.l;
        ty8 ty8Var = this.k;
        switch (b) {
            case 0:
                int i3 = 0;
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    Iterator it = ((yx8) ty8Var.D()).f43408a.c.iterator();
                    while (it.hasNext()) {
                        if (((mlr) it.next()).f22006a == j4) {
                            i2 = i3;
                            mlrVar = (mlr) CollectionsKt.W(i2, ((yx8) ty8Var.D()).f43408a.c);
                            if (mlrVar == null) {
                                return Unit.f46060a;
                            }
                            zContains = ((yx8) ty8Var.D()).f43408a.d.contains(new Long(j4));
                            s = ty8Var.p.e;
                            strP = ty8Var.P(i2);
                            this.j = true;
                            if (ty8Var.B.m(mlrVar, !zContains, s, strP, this) == wneVar2) {
                                return wneVar2;
                            }
                        } else {
                            i3++;
                        }
                    }
                    mlrVar = (mlr) CollectionsKt.W(i2, ((yx8) ty8Var.D()).f43408a.c);
                    if (mlrVar == null) {
                        return Unit.f46060a;
                    }
                    zContains = ((yx8) ty8Var.D()).f43408a.d.contains(new Long(j4));
                    s = ty8Var.p.e;
                    strP = ty8Var.P(i2);
                    this.j = true;
                    if (ty8Var.B.m(mlrVar, !zContains, s, strP, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                uc0 uc0Var = ty8Var.p;
                u58 u58Var = ty8Var.w;
                wne wneVar3 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    Iterator it2 = ((yx8) ty8Var.D()).f43408a.c.iterator();
                    int i4 = 0;
                    while (it2.hasNext()) {
                        if (((mlr) it2.next()).f22006a == j4) {
                            i2 = i4;
                            Integer num2 = new Integer(i2);
                            num = num2.intValue() >= 0 ? num2 : null;
                            if (num != null) {
                                return Unit.f46060a;
                            }
                            iIntValue = num.intValue();
                            mlrVar2 = (mlr) CollectionsKt.W(iIntValue, ((yx8) ty8Var.D()).f43408a.c);
                            if (mlrVar2 == null) {
                                return Unit.f46060a;
                            }
                            i = iIntValue + 1;
                            zN = ty8Var.N();
                            j = this.l;
                            if (zN) {
                                wneVar = wneVar3;
                                u58Var.f35083a.a("game_aggregator_call", u58.a(u58Var, j, "brand_live", Long.valueOf(uc0Var.e), Long.valueOf(uc0Var.b), Integer.valueOf(i), null, 32));
                                j3 = j;
                            } else {
                                wneVar = wneVar3;
                                z = uc0Var.i;
                                s2 = uc0Var.e;
                                j2 = uc0Var.b;
                                if (z) {
                                    j3 = j;
                                    u58Var.f35083a.a("game_aggregator_call", u58.a(u58Var, j3, "search_aggregator_providers", Integer.valueOf(s2), Long.valueOf(j2), Integer.valueOf(i), null, 32));
                                } else {
                                    j3 = j;
                                    u58Var.f35083a.a("game_aggregator_call", u58.a(u58Var, j3, "menu_aggregator_providers", Integer.valueOf(s2), Long.valueOf(j2), Integer.valueOf(i), null, 32));
                                }
                            }
                            h97.x("game_id", Long.valueOf(j3), u58Var.f35083a, "provbrand_prov_game");
                            ix0 ix0Var = ty8Var.A;
                            int i5 = (int) j3;
                            short s4 = uc0Var.e;
                            int i6 = (int) uc0Var.b;
                            if (ty8Var.N()) {
                                str = "brand_live";
                            } else if (uc0Var.i) {
                                str = "search_aggregator_providers";
                            } else {
                                str = "menu_aggregator_providers";
                            }
                            ix0Var.getClass();
                            s1p s1pVar = ix0Var.f15516a;
                            yni0 yni0Var = new yni0();
                            yni0Var.add(new i1p(i5, (byte) 2));
                            yni0Var.add(new i1p(s4, (byte) 0));
                            yni0Var.add(new i1p(i, (byte) 1));
                            yni0Var.add(new h1p(i6, (byte) 0));
                            yni0Var.add(new j1p(str, (byte) 0));
                            s1pVar.a(cui0.a(yni0Var), 3019L);
                            h97.r(j3, ty8Var.z.f1455a, 10962L);
                            pw70Var = ty8Var.t;
                            s3 = uc0Var.e;
                            z2 = !uc0Var.i;
                            strP2 = ty8Var.P(iIntValue);
                            this.j = true;
                            if (pw70.b(pw70Var, mlrVar2, strP2, s3, false, z2, this, 34) == wneVar) {
                                return wneVar;
                            }
                        } else {
                            i4++;
                        }
                    }
                    Integer num3 = new Integer(i2);
                    if (num3.intValue() >= 0) {
                    }
                    if (num != null) {
                        return Unit.f46060a;
                    }
                    iIntValue = num.intValue();
                    mlrVar2 = (mlr) CollectionsKt.W(iIntValue, ((yx8) ty8Var.D()).f43408a.c);
                    if (mlrVar2 == null) {
                        return Unit.f46060a;
                    }
                    i = iIntValue + 1;
                    zN = ty8Var.N();
                    j = this.l;
                    if (zN) {
                        wneVar = wneVar3;
                        u58Var.f35083a.a("game_aggregator_call", u58.a(u58Var, j, "brand_live", Long.valueOf(uc0Var.e), Long.valueOf(uc0Var.b), Integer.valueOf(i), null, 32));
                        j3 = j;
                    } else {
                        wneVar = wneVar3;
                        z = uc0Var.i;
                        s2 = uc0Var.e;
                        j2 = uc0Var.b;
                        if (z) {
                            j3 = j;
                            u58Var.f35083a.a("game_aggregator_call", u58.a(u58Var, j3, "search_aggregator_providers", Integer.valueOf(s2), Long.valueOf(j2), Integer.valueOf(i), null, 32));
                        } else {
                            j3 = j;
                            u58Var.f35083a.a("game_aggregator_call", u58.a(u58Var, j3, "menu_aggregator_providers", Integer.valueOf(s2), Long.valueOf(j2), Integer.valueOf(i), null, 32));
                        }
                    }
                    h97.x("game_id", Long.valueOf(j3), u58Var.f35083a, "provbrand_prov_game");
                    ix0 ix0Var2 = ty8Var.A;
                    int i7 = (int) j3;
                    short s5 = uc0Var.e;
                    int i8 = (int) uc0Var.b;
                    if (ty8Var.N()) {
                        str = "brand_live";
                    } else if (uc0Var.i) {
                        str = "search_aggregator_providers";
                    } else {
                        str = "menu_aggregator_providers";
                    }
                    ix0Var2.getClass();
                    s1p s1pVar2 = ix0Var2.f15516a;
                    yni0 yni0Var2 = new yni0();
                    yni0Var2.add(new i1p(i7, (byte) 2));
                    yni0Var2.add(new i1p(s5, (byte) 0));
                    yni0Var2.add(new i1p(i, (byte) 1));
                    yni0Var2.add(new h1p(i8, (byte) 0));
                    yni0Var2.add(new j1p(str, (byte) 0));
                    s1pVar2.a(cui0.a(yni0Var2), 3019L);
                    h97.r(j3, ty8Var.z.f1455a, 10962L);
                    pw70Var = ty8Var.t;
                    s3 = uc0Var.e;
                    z2 = !uc0Var.i;
                    strP2 = ty8Var.P(iIntValue);
                    this.j = true;
                    if (pw70.b(pw70Var, mlrVar2, strP2, s3, false, z2, this, 34) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
