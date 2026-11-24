package a;

import android.content.res.Resources;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KTypeProjection;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class kh10 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18267a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public kh10(String str, l7m0 l7m0Var, l7m0 l7m0Var2, String str2) {
        this.f18267a = (byte) 0;
        this.b = str;
        this.d = l7m0Var;
        this.e = l7m0Var2;
        this.c = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        v2 v2VarY;
        byte b = this.f18267a;
        pcy pcyVar = e7z.u1;
        cl5 cl5Var = ukd.f35823a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.b;
        byte b2 = 1;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                shd shdVar = gqw0.v;
                shd shdVar2 = gqw0.y;
                shd shdVar3 = gqw0.w;
                shd shdVar4 = gqw0.x;
                String str = (String) obj5;
                fet fetVar = (fet) obj;
                int iIntValue = ((Number) obj2).intValue();
                l7m0 l7m0Var = (l7m0) obj4;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int length = str.length();
                    jm40 jm40Var = jm40.b;
                    if (length != 0 && ((Number) l7m0Var.getValue()).floatValue() >= 0.5f) {
                        fetVar.e0(667539817);
                        n0q n0qVar = o7k0.c;
                        boolean zG = fetVar.g(l7m0Var);
                        Object objP = fetVar.P();
                        if (zG || objP == cl5Var) {
                            objP = new eb3(l7m0Var, (byte) 9);
                            fetVar.o0(objP);
                        }
                        mm40 mm40VarT = i4w0.T(n0qVar, (Function1) objP);
                        zcl zclVar = qmk.f28987a;
                        String str2 = (String) obj6;
                        x5d x5dVarA = w5d.a(new qw3(2.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.n, fetVar, 48);
                        int iHashCode = Long.hashCode(fetVar.T);
                        bh90 bh90VarM = fetVar.m();
                        mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarT);
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(pcyVar);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, x5dVarA, shdVar4);
                        jpm0.o(fetVar, bh90VarM, shdVar3);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode), shdVar2);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC0, shdVar);
                        mm40 mm40VarW = o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3);
                        pz40 pz40Var = s6t0.f31722a;
                        v8q0.a(str2, mm40VarW, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 48, 24960, 109560);
                        v8q0.a(str, jm40Var, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.u(), fetVar, 48, 24960, 109560);
                        fetVar.r(true);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(666333607);
                        n0q n0qVar2 = o7k0.c;
                        boolean zG2 = fetVar.g(l7m0Var);
                        Object objP2 = fetVar.P();
                        if (zG2 || objP2 == cl5Var) {
                            objP2 = new eb3(l7m0Var, (byte) 8);
                            fetVar.o0(objP2);
                        }
                        mm40 mm40VarT2 = i4w0.T(n0qVar2, (Function1) objP2);
                        l7m0 l7m0Var2 = (l7m0) obj3;
                        String str3 = (String) obj6;
                        tj30 tj30VarC = zq8.c(gqw0.e, false);
                        int iHashCode2 = Long.hashCode(fetVar.T);
                        bh90 bh90VarM2 = fetVar.m();
                        mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarT2);
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(pcyVar);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, tj30VarC, shdVar4);
                        jpm0.o(fetVar, bh90VarM2, shdVar3);
                        jpm0.o(fetVar, Integer.valueOf(iHashCode2), shdVar2);
                        jpm0.n(fetVar);
                        jpm0.o(fetVar, mm40VarC1, shdVar);
                        long j = ((y3d) l7m0Var2.getValue()).f41946a;
                        pz40 pz40Var2 = s6t0.f31722a;
                        v8q0.a(str3, jm40Var, j, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.u, null, j1t0.b, 0L, null, 0, 0, qmk.H, 16646109), fetVar, 48, 24960, 109560);
                        fetVar.r(true);
                        fetVar.r(false);
                    }
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                ClassLoader classLoader = (ClassLoader) obj5;
                nzs0 nzs0Var = (nzs0) obj6;
                Function0 function0 = (Function0) obj4;
                mie0 mie0Var = (mie0) obj3;
                int iIntValue2 = ((Number) obj).intValue();
                iqy iqyVar = (iqy) obj2;
                iqyVar.getClass();
                if (iqyVar.equals(iqy.c)) {
                    KTypeProjection.c.getClass();
                    return KTypeProjection.d;
                }
                fqy fqyVar = iqyVar.b;
                if (fqyVar != null) {
                    v2VarY = jwb.Y(fqyVar, classLoader, nzs0Var, true, function0 == null ? null : new tfe(new svc(mie0Var, (byte) 27), iIntValue2, b2));
                } else {
                    v2VarY = null;
                }
                kqy kqyVar = iqyVar.f15233a;
                return new KTypeProjection(v2VarY, kqyVar != null ? jwb.a0(kqyVar) : null);
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                Function0 function1 = (Function0) obj6;
                if (fetVar2.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    qt20 qt20Var = ((psk) obj5).e;
                    if (qt20Var instanceof ot20) {
                        fetVar2.e0(-1535471022);
                        boolean z = ((ot20) qt20Var).f25811a;
                        int i = z ? R.drawable.ic_glyph_extended : R.drawable.ic_glyph_compressed_inactive;
                        Resources resources = (Resources) fetVar2.k(dy2.c);
                        zcl zclVar2 = qmk.f28987a;
                        jm40 jm40Var2 = jm40.b;
                        mm40 mm40VarN = o7k0.n(jm40Var2, 56.0f);
                        boolean zG3 = fetVar2.g(function1);
                        Object objP3 = fetVar2.P();
                        if (zG3 || objP3 == cl5Var) {
                            objP3 = new lfk(function1, (byte) 3);
                            fetVar2.o0(objP3);
                        }
                        mm40 mm40VarE0 = o2e.e0(feb.O(mm40VarN, (Function0) objP3), "ICON_FOCUS__ITEM_BOX");
                        l7m0 l7m0Var3 = (l7m0) obj4;
                        l7m0 l7m0Var4 = (l7m0) obj3;
                        tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                        int iHashCode3 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM3 = fetVar2.m();
                        mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarE0);
                        mkd.c0.getClass();
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(pcyVar);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, tj30VarC2, gqw0.x);
                        jpm0.o(fetVar2, bh90VarM3, gqw0.w);
                        jpm0.o(fetVar2, Integer.valueOf(iHashCode3), gqw0.y);
                        jpm0.n(fetVar2);
                        jpm0.o(fetVar2, mm40VarC2, gqw0.v);
                        pm80 pm80VarF = a8k0.F(z ? R.drawable.ic_glyph_extended : R.drawable.ic_glyph_compressed_inactive, 0, fetVar2);
                        long j2 = ((y3d) l7m0Var3.getValue()).f41946a;
                        mm40 mm40VarJ = s5x0.J(i120.Q(o7k0.n(lgb.J(jm40Var2, vgg0.f37379a), 36.0f), ((y3d) l7m0Var4.getValue()).f41946a, jd8.n), 6.0f);
                        boolean zE = fetVar2.e(i);
                        Object objP4 = fetVar2.P();
                        if (zE || objP4 == cl5Var) {
                            objP4 = new yrk(i);
                            fetVar2.o0(objP4);
                        }
                        dww.c(pm80VarF, null, o2e.e0(pai0.a(mm40VarJ, false, (Function1) objP4), "ICON_FOCUS_ITEM_ICON" + resources.getResourceEntryName(i)), j2, fetVar2, 56, 0);
                        fetVar2.r(true);
                        fetVar2.r(false);
                    } else {
                        if (!qt20Var.equals(pt20.f27543a)) {
                            throw b1j.f(-742272172, fetVar2, false);
                        }
                        fetVar2.e0(-1533296093);
                        fetVar2.r(false);
                    }
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ kh10(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.f18267a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
