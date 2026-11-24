package a;

import kotlin.Unit;
import org.xplatform.uikit.compose.color.IndividualColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ghl0 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11307a = 0;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ l7m0 d;
    public final /* synthetic */ l7m0 e;
    public final /* synthetic */ l7m0 f;
    public final /* synthetic */ l7m0 g;
    public final /* synthetic */ l7m0 h;
    public final /* synthetic */ tsl i;
    public final /* synthetic */ l7m0 j;
    public final /* synthetic */ usl k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ d1m o;
    public final /* synthetic */ s1m p;
    public final /* synthetic */ m1m q;

    public /* synthetic */ ghl0(l7m0 l7m0Var, nf5 nf5Var, l7m0 l7m0Var2, l7m0 l7m0Var3, pil0 pil0Var, re80 re80Var, l7m0 l7m0Var4, c1m c1mVar, l7m0 l7m0Var5, r1m r1mVar, l7m0 l7m0Var6, l1m l1mVar, l7m0 l7m0Var7, tsl tslVar, l7m0 l7m0Var8, usl uslVar) {
        this.b = l7m0Var;
        this.l = nf5Var;
        this.c = l7m0Var2;
        this.d = l7m0Var3;
        this.m = pil0Var;
        this.n = re80Var;
        this.e = l7m0Var4;
        this.o = c1mVar;
        this.f = l7m0Var5;
        this.p = r1mVar;
        this.g = l7m0Var6;
        this.q = l1mVar;
        this.h = l7m0Var7;
        this.i = tslVar;
        this.j = l7m0Var8;
        this.k = uslVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f11307a;
        m1m m1mVar = this.q;
        s1m s1mVar = this.p;
        d1m d1mVar = this.o;
        Object obj4 = this.n;
        Object obj5 = this.m;
        Object obj6 = this.l;
        l7m0 l7m0Var = this.b;
        jm40 jm40Var = jm40.b;
        switch (b) {
            case 0:
                bil0 bil0Var = (bil0) obj6;
                g1m g1mVar = (g1m) obj5;
                s0q s0qVar = (s0q) obj4;
                z0m z0mVar = (z0m) d1mVar;
                n1m n1mVar = (n1m) s1mVar;
                h1m h1mVar = (h1m) m1mVar;
                ir8 ir8Var = (ir8) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ir8Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(ir8Var) ? 4 : 2;
                }
                int i = iIntValue;
                if (fetVar.U(i & 1, (i & 19) != 18)) {
                    zcl zclVar = qmk.f28987a;
                    l7m0 l7m0Var2 = this.c;
                    l7m0 l7m0Var3 = this.d;
                    int i2 = i & 14;
                    tfx.d(ir8Var, 6.0f, 6.0f, 4.0f, u1c.M(-873373213, new ajw((Object) l7m0Var2, (Object) bil0Var, (Object) s0qVar, (Object) l7m0Var3, (Object) this.e, (byte) 27), fetVar), fetVar, i2 | 24576, 0);
                    if (((Boolean) l7m0Var.getValue()).booleanValue()) {
                        fetVar.e0(350443451);
                        boolean zG = fetVar.g(bil0Var.c);
                        Object objP = fetVar.P();
                        if (zG || objP == ukd.f35823a) {
                            objP = ffb0.Q(jm40Var, -2.0f, -4.0f);
                            fetVar.o0(objP);
                        }
                        agc.p((mm40) objP, g1mVar, fetVar, 0, 0);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(351111346);
                        fetVar.r(false);
                    }
                    h8x.c(ir8Var, u1c.M(332463406, new i9x(l7m0Var3, z0mVar, this.f, n1mVar, this.g, h1mVar, this.h, this.i, this.j, this.k, (byte) 2), fetVar), fetVar, i2 | 48);
                } else {
                    fetVar.X();
                }
                break;
            default:
                nf5 nf5Var = (nf5) obj6;
                pil0 pil0Var = (pil0) obj5;
                re80 re80Var = (re80) obj4;
                c1m c1mVar = (c1m) d1mVar;
                r1m r1mVar = (r1m) s1mVar;
                l1m l1mVar = (l1m) m1mVar;
                ir8 ir8Var2 = (ir8) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ir8Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(ir8Var2) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    l7m0 l7m0Var4 = this.d;
                    l7m0 l7m0Var5 = this.c;
                    ugd ugdVarM = u1c.M(-245786590, new ajw((Object) l7m0Var4, (Object) pil0Var, (Object) re80Var, (Object) l7m0Var5, (Object) this.e, (byte) 29), fetVar2);
                    int i3 = iIntValue2 & 14;
                    tfx.d(ir8Var2, 0.0f, 0.0f, 0.0f, ugdVarM, fetVar2, i3 | 24576, 7);
                    if (((Boolean) l7m0Var.getValue()).booleanValue()) {
                        fetVar2.e0(-1210095128);
                        zcl zclVar2 = qmk.f28987a;
                        thb.f(ffb0.R(jm40Var, 0.0f, -4.0f, 1), nf5Var, fetVar2, 0, 0);
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(-1209930797);
                        fetVar2.r(false);
                    }
                    r8x.c(ir8Var2, u1c.M(-1012429843, new i9x(l7m0Var5, c1mVar, this.f, r1mVar, this.g, l1mVar, this.h, this.i, this.j, this.k, (byte) 4), fetVar2), fetVar2, i3 | 48);
                    if (l7m0Var5.getValue() == k0d.c) {
                        fetVar2.e0(-1209042771);
                        mm40 mm40VarB = ir8Var2.b(jm40Var, gqw0.b);
                        zcl zclVar3 = qmk.f28987a;
                        zq8.a(0, fetVar2, i120.Q(o7k0.e(o7k0.s(mm40VarB, 16.0f), 2.0f), ((IndividualColors) fetVar2.k(j7x.f16059a)).getCoefHigher(), vgg0.c(0.0f, 0.0f, 2.0f, 2.0f, 3)));
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(-1208575725);
                        fetVar2.r(false);
                    }
                    if (l7m0Var5.getValue() == k0d.d) {
                        fetVar2.e0(-1208494319);
                        mm40 mm40VarB2 = ir8Var2.b(jm40Var, gqw0.h);
                        zcl zclVar4 = qmk.f28987a;
                        zq8.a(0, fetVar2, i120.Q(o7k0.e(o7k0.s(mm40VarB2, 16.0f), 2.0f), ((IndividualColors) fetVar2.k(j7x.f16059a)).getCoefLower(), vgg0.c(2.0f, 2.0f, 0.0f, 0.0f, 12)));
                        fetVar2.r(false);
                    } else {
                        fetVar2.e0(-1208031117);
                        fetVar2.r(false);
                    }
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ ghl0(l7m0 l7m0Var, bil0 bil0Var, g1m g1mVar, l7m0 l7m0Var2, s0q s0qVar, l7m0 l7m0Var3, l7m0 l7m0Var4, z0m z0mVar, l7m0 l7m0Var5, n1m n1mVar, l7m0 l7m0Var6, h1m h1mVar, l7m0 l7m0Var7, tsl tslVar, l7m0 l7m0Var8, usl uslVar) {
        this.b = l7m0Var;
        this.l = bil0Var;
        this.m = g1mVar;
        this.c = l7m0Var2;
        this.n = s0qVar;
        this.d = l7m0Var3;
        this.e = l7m0Var4;
        this.o = z0mVar;
        this.f = l7m0Var5;
        this.p = n1mVar;
        this.g = l7m0Var6;
        this.q = h1mVar;
        this.h = l7m0Var7;
        this.i = tslVar;
        this.j = l7m0Var8;
        this.k = uslVar;
    }
}
