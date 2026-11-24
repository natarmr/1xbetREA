package a;

import android.gov.nist.core.Separators;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class qxx extends guy implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pz40 f29509a;
    public final /* synthetic */ g3e b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ foa0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxx(pz40 pz40Var, g3e g3eVar, Function0 function0, boolean z, foa0 foa0Var) {
        super(2);
        this.f29509a = pz40Var;
        this.b = g3eVar;
        this.c = function0;
        this.d = z;
        this.e = foa0Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x023b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0240  */
    /* JADX WARN: Code duplicated, block: B:42:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:45:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:49:0x034c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0350  */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        cl5 cl5Var;
        cl5 cl5Var2;
        boolean zG;
        Object objP;
        cl5 cl5Var3;
        cl5 cl5Var4;
        boolean zG2;
        Object objP2;
        cl5 cl5Var5;
        boolean zG3;
        Object objP3;
        fet fetVar = (fet) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && fetVar.D()) {
            fetVar.X();
        } else {
            this.f29509a.setValue(Unit.f46060a);
            g3e g3eVar = this.b;
            g3eVar.getClass();
            g3eVar.g();
            fetVar.e0(-2088541870);
            g3e g3eVar2 = (g3e) g3eVar.f().b;
            u2e u2eVarE = g3eVar2.e();
            u2e u2eVarE2 = g3eVar2.e();
            u2e u2eVarE3 = g3eVar2.e();
            u2e u2eVarE4 = g3eVar2.e();
            u2e u2eVarE5 = g3eVar2.e();
            g3e g3eVar3 = (g3e) g3eVar.f().b;
            u2e u2eVarE6 = g3eVar3.e();
            u2e u2eVarE7 = g3eVar3.e();
            boolean zG4 = fetVar.g(u2eVarE) | fetVar.g(u2eVarE3);
            Object objP4 = fetVar.P();
            cl5 cl5Var6 = ukd.f35823a;
            if (zG4 || objP4 == cl5Var6) {
                objP4 = new e5n(u2eVarE, u2eVarE3, (byte) 1);
                fetVar.o0(objP4);
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = g3e.d(jm40Var, u2eVarE6, (Function1) objP4);
            zcl zclVar = qmk.f28987a;
            pz40 pz40Var = s6t0.f31722a;
            dn8 dn8VarH = j120.h(2.0f, s6t0.b().f33626a.getSeparator());
            qxw.o(fetVar, i120.T(mm40VarD, dn8VarH.f6356a, dn8VarH.b, vgg0.a(16.0f)));
            if (this.d) {
                fetVar.e0(-2087422275);
                fetVar.r(false);
            } else {
                fetVar.e0(-2087911424);
                mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 2.0f), 24.0f);
                boolean zG5 = fetVar.g(u2eVarE2) | fetVar.g(u2eVarE6);
                Object objP5 = fetVar.P();
                if (zG5 || objP5 == cl5Var6) {
                    objP5 = new e5n(u2eVarE2, u2eVarE6, (byte) 2);
                    fetVar.o0(objP5);
                }
                qxw.o(fetVar, i120.Q(g3e.d(mm40VarE, u2eVarE7, (Function1) objP5), s6t0.b().f33626a.getSeparator(), jd8.n));
                fetVar.r(false);
            }
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 6.0f, 4.0f, 6.0f, 1);
            boolean zG6 = fetVar.g(u2eVarE);
            Object objP6 = fetVar.P();
            if (zG6 || objP6 == cl5Var6) {
                objP6 = new iwx(u2eVarE, (byte) 4);
                fetVar.o0(objP6);
            }
            mm40 mm40VarD2 = g3e.d(mm40VarN, u2eVarE4, (Function1) objP6);
            foa0 foa0Var = this.e;
            v8q0.a(foa0Var.e, mm40VarD2, foa0Var.g, null, g1t0.a().f42262a.b, null, null, g1t0.a().f42262a.f, 0L, new f2q0(6), 0L, 2, false, 2, 0, null, null, fetVar, 0, 24960, 240488);
            boolean zG7 = fetVar.g(u2eVarE2);
            Object objP7 = fetVar.P();
            if (zG7) {
                cl5Var = cl5Var6;
            } else {
                cl5Var = cl5Var6;
                if (objP7 == cl5Var) {
                }
                mm40 mm40VarN2 = s5x0.N(g3e.d(jm40Var, u2eVarE, (Function1) objP7), 10.0f, 6.0f, 0.0f, 6.0f, 4);
                cl5Var2 = cl5Var;
                v8q0.a(foa0Var.f9874a, mm40VarN2, foa0Var.c, null, g1t0.a().f42262a.b, null, null, g1t0.a().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, 0, 0, 260968);
                zG = fetVar.g(u2eVarE);
                objP = fetVar.P();
                if (zG) {
                    cl5Var3 = cl5Var2;
                } else {
                    cl5Var3 = cl5Var2;
                    if (objP == cl5Var3) {
                    }
                    cl5Var4 = cl5Var3;
                    v8q0.a(Separators.COLON, s5x0.L(g3e.d(jm40Var, u2eVarE2, (Function1) objP), 4.0f, 0.0f, 2), s6t0.b().f33626a.getSecondary(), null, g1t0.a().f42262a.b, null, null, g1t0.a().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, 6, 0, 260968);
                    zG2 = fetVar.g(u2eVarE2);
                    objP2 = fetVar.P();
                    if (zG2) {
                        cl5Var5 = cl5Var4;
                    } else {
                        cl5Var5 = cl5Var4;
                        if (objP2 == cl5Var5) {
                        }
                        mm40 mm40VarN3 = s5x0.N(g3e.d(jm40Var, u2eVarE3, (Function1) objP2), 0.0f, 6.0f, 10.0f, 6.0f, 1);
                        cl5 cl5Var7 = cl5Var5;
                        v8q0.a(foa0Var.b, mm40VarN3, foa0Var.d, null, g1t0.a().f42262a.b, null, null, g1t0.a().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, 0, 0, 260968);
                        mm40 mm40VarN4 = s5x0.N(jm40Var, 4.0f, 6.0f, 0.0f, 6.0f, 4);
                        zG3 = fetVar.g(u2eVarE3);
                        objP3 = fetVar.P();
                        if (zG3 || objP3 == cl5Var7) {
                            objP3 = new iwx(u2eVarE3, (byte) 8);
                            fetVar.o0(objP3);
                        }
                        mm40 mm40VarD3 = g3e.d(mm40VarN4, u2eVarE5, (Function1) objP3);
                        v8q0.a(foa0Var.f, mm40VarD3, foa0Var.h, null, g1t0.a().f42262a.b, null, null, g1t0.a().f42262a.f, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, null, fetVar, 0, 24960, 240488);
                        fetVar.r(false);
                    }
                    objP2 = new iwx(u2eVarE2, (byte) 7);
                    fetVar.o0(objP2);
                    mm40 mm40VarN5 = s5x0.N(g3e.d(jm40Var, u2eVarE3, (Function1) objP2), 0.0f, 6.0f, 10.0f, 6.0f, 1);
                    cl5 cl5Var8 = cl5Var5;
                    v8q0.a(foa0Var.b, mm40VarN5, foa0Var.d, null, g1t0.a().f42262a.b, null, null, g1t0.a().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, 0, 0, 260968);
                    mm40 mm40VarN6 = s5x0.N(jm40Var, 4.0f, 6.0f, 0.0f, 6.0f, 4);
                    zG3 = fetVar.g(u2eVarE3);
                    objP3 = fetVar.P();
                    if (zG3) {
                        objP3 = new iwx(u2eVarE3, (byte) 8);
                        fetVar.o0(objP3);
                    } else {
                        objP3 = new iwx(u2eVarE3, (byte) 8);
                        fetVar.o0(objP3);
                    }
                    mm40 mm40VarD4 = g3e.d(mm40VarN6, u2eVarE5, (Function1) objP3);
                    v8q0.a(foa0Var.f, mm40VarD4, foa0Var.h, null, g1t0.a().f42262a.b, null, null, g1t0.a().f42262a.f, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, null, fetVar, 0, 24960, 240488);
                    fetVar.r(false);
                }
                objP = new iwx(u2eVarE, (byte) 6);
                fetVar.o0(objP);
                cl5Var4 = cl5Var3;
                v8q0.a(Separators.COLON, s5x0.L(g3e.d(jm40Var, u2eVarE2, (Function1) objP), 4.0f, 0.0f, 2), s6t0.b().f33626a.getSecondary(), null, g1t0.a().f42262a.b, null, null, g1t0.a().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, 6, 0, 260968);
                zG2 = fetVar.g(u2eVarE2);
                objP2 = fetVar.P();
                if (zG2) {
                    cl5Var5 = cl5Var4;
                    if (objP2 == cl5Var5) {
                    }
                    mm40 mm40VarN7 = s5x0.N(g3e.d(jm40Var, u2eVarE3, (Function1) objP2), 0.0f, 6.0f, 10.0f, 6.0f, 1);
                    cl5 cl5Var9 = cl5Var5;
                    v8q0.a(foa0Var.b, mm40VarN7, foa0Var.d, null, g1t0.a().f42262a.b, null, null, g1t0.a().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, 0, 0, 260968);
                    mm40 mm40VarN8 = s5x0.N(jm40Var, 4.0f, 6.0f, 0.0f, 6.0f, 4);
                    zG3 = fetVar.g(u2eVarE3);
                    objP3 = fetVar.P();
                    if (zG3) {
                        objP3 = new iwx(u2eVarE3, (byte) 8);
                        fetVar.o0(objP3);
                    } else {
                        objP3 = new iwx(u2eVarE3, (byte) 8);
                        fetVar.o0(objP3);
                    }
                    mm40 mm40VarD5 = g3e.d(mm40VarN8, u2eVarE5, (Function1) objP3);
                    v8q0.a(foa0Var.f, mm40VarD5, foa0Var.h, null, g1t0.a().f42262a.b, null, null, g1t0.a().f42262a.f, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, null, fetVar, 0, 24960, 240488);
                    fetVar.r(false);
                } else {
                    cl5Var5 = cl5Var4;
                }
                objP2 = new iwx(u2eVarE2, (byte) 7);
                fetVar.o0(objP2);
                mm40 mm40VarN9 = s5x0.N(g3e.d(jm40Var, u2eVarE3, (Function1) objP2), 0.0f, 6.0f, 10.0f, 6.0f, 1);
                cl5 cl5Var10 = cl5Var5;
                v8q0.a(foa0Var.b, mm40VarN9, foa0Var.d, null, g1t0.a().f42262a.b, null, null, g1t0.a().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, 0, 0, 260968);
                mm40 mm40VarN10 = s5x0.N(jm40Var, 4.0f, 6.0f, 0.0f, 6.0f, 4);
                zG3 = fetVar.g(u2eVarE3);
                objP3 = fetVar.P();
                if (zG3) {
                    objP3 = new iwx(u2eVarE3, (byte) 8);
                    fetVar.o0(objP3);
                } else {
                    objP3 = new iwx(u2eVarE3, (byte) 8);
                    fetVar.o0(objP3);
                }
                mm40 mm40VarD6 = g3e.d(mm40VarN10, u2eVarE5, (Function1) objP3);
                v8q0.a(foa0Var.f, mm40VarD6, foa0Var.h, null, g1t0.a().f42262a.b, null, null, g1t0.a().f42262a.f, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, null, fetVar, 0, 24960, 240488);
                fetVar.r(false);
            }
            objP7 = new iwx(u2eVarE2, (byte) 5);
            fetVar.o0(objP7);
            mm40 mm40VarN11 = s5x0.N(g3e.d(jm40Var, u2eVarE, (Function1) objP7), 10.0f, 6.0f, 0.0f, 6.0f, 4);
            cl5Var2 = cl5Var;
            v8q0.a(foa0Var.f9874a, mm40VarN11, foa0Var.c, null, g1t0.a().f42262a.b, null, null, g1t0.a().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, 0, 0, 260968);
            zG = fetVar.g(u2eVarE);
            objP = fetVar.P();
            if (zG) {
                cl5Var3 = cl5Var2;
                if (objP == cl5Var3) {
                }
                cl5Var4 = cl5Var3;
                v8q0.a(Separators.COLON, s5x0.L(g3e.d(jm40Var, u2eVarE2, (Function1) objP), 4.0f, 0.0f, 2), s6t0.b().f33626a.getSecondary(), null, g1t0.a().f42262a.b, null, null, g1t0.a().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, 6, 0, 260968);
                zG2 = fetVar.g(u2eVarE2);
                objP2 = fetVar.P();
                if (zG2) {
                    cl5Var5 = cl5Var4;
                    if (objP2 == cl5Var5) {
                    }
                    mm40 mm40VarN12 = s5x0.N(g3e.d(jm40Var, u2eVarE3, (Function1) objP2), 0.0f, 6.0f, 10.0f, 6.0f, 1);
                    cl5 cl5Var11 = cl5Var5;
                    v8q0.a(foa0Var.b, mm40VarN12, foa0Var.d, null, g1t0.a().f42262a.b, null, null, g1t0.a().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, 0, 0, 260968);
                    mm40 mm40VarN13 = s5x0.N(jm40Var, 4.0f, 6.0f, 0.0f, 6.0f, 4);
                    zG3 = fetVar.g(u2eVarE3);
                    objP3 = fetVar.P();
                    if (zG3) {
                        objP3 = new iwx(u2eVarE3, (byte) 8);
                        fetVar.o0(objP3);
                    } else {
                        objP3 = new iwx(u2eVarE3, (byte) 8);
                        fetVar.o0(objP3);
                    }
                    mm40 mm40VarD7 = g3e.d(mm40VarN13, u2eVarE5, (Function1) objP3);
                    v8q0.a(foa0Var.f, mm40VarD7, foa0Var.h, null, g1t0.a().f42262a.b, null, null, g1t0.a().f42262a.f, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, null, fetVar, 0, 24960, 240488);
                    fetVar.r(false);
                } else {
                    cl5Var5 = cl5Var4;
                }
                objP2 = new iwx(u2eVarE2, (byte) 7);
                fetVar.o0(objP2);
                mm40 mm40VarN14 = s5x0.N(g3e.d(jm40Var, u2eVarE3, (Function1) objP2), 0.0f, 6.0f, 10.0f, 6.0f, 1);
                cl5 cl5Var12 = cl5Var5;
                v8q0.a(foa0Var.b, mm40VarN14, foa0Var.d, null, g1t0.a().f42262a.b, null, null, g1t0.a().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, 0, 0, 260968);
                mm40 mm40VarN15 = s5x0.N(jm40Var, 4.0f, 6.0f, 0.0f, 6.0f, 4);
                zG3 = fetVar.g(u2eVarE3);
                objP3 = fetVar.P();
                if (zG3) {
                    objP3 = new iwx(u2eVarE3, (byte) 8);
                    fetVar.o0(objP3);
                } else {
                    objP3 = new iwx(u2eVarE3, (byte) 8);
                    fetVar.o0(objP3);
                }
                mm40 mm40VarD8 = g3e.d(mm40VarN15, u2eVarE5, (Function1) objP3);
                v8q0.a(foa0Var.f, mm40VarD8, foa0Var.h, null, g1t0.a().f42262a.b, null, null, g1t0.a().f42262a.f, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, null, fetVar, 0, 24960, 240488);
                fetVar.r(false);
            } else {
                cl5Var3 = cl5Var2;
            }
            objP = new iwx(u2eVarE, (byte) 6);
            fetVar.o0(objP);
            cl5Var4 = cl5Var3;
            v8q0.a(Separators.COLON, s5x0.L(g3e.d(jm40Var, u2eVarE2, (Function1) objP), 4.0f, 0.0f, 2), s6t0.b().f33626a.getSecondary(), null, g1t0.a().f42262a.b, null, null, g1t0.a().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, 6, 0, 260968);
            zG2 = fetVar.g(u2eVarE2);
            objP2 = fetVar.P();
            if (zG2) {
                cl5Var5 = cl5Var4;
                if (objP2 == cl5Var5) {
                }
                mm40 mm40VarN16 = s5x0.N(g3e.d(jm40Var, u2eVarE3, (Function1) objP2), 0.0f, 6.0f, 10.0f, 6.0f, 1);
                cl5 cl5Var13 = cl5Var5;
                v8q0.a(foa0Var.b, mm40VarN16, foa0Var.d, null, g1t0.a().f42262a.b, null, null, g1t0.a().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, 0, 0, 260968);
                mm40 mm40VarN17 = s5x0.N(jm40Var, 4.0f, 6.0f, 0.0f, 6.0f, 4);
                zG3 = fetVar.g(u2eVarE3);
                objP3 = fetVar.P();
                if (zG3) {
                    objP3 = new iwx(u2eVarE3, (byte) 8);
                    fetVar.o0(objP3);
                } else {
                    objP3 = new iwx(u2eVarE3, (byte) 8);
                    fetVar.o0(objP3);
                }
                mm40 mm40VarD9 = g3e.d(mm40VarN17, u2eVarE5, (Function1) objP3);
                v8q0.a(foa0Var.f, mm40VarD9, foa0Var.h, null, g1t0.a().f42262a.b, null, null, g1t0.a().f42262a.f, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, null, fetVar, 0, 24960, 240488);
                fetVar.r(false);
            } else {
                cl5Var5 = cl5Var4;
            }
            objP2 = new iwx(u2eVarE2, (byte) 7);
            fetVar.o0(objP2);
            mm40 mm40VarN18 = s5x0.N(g3e.d(jm40Var, u2eVarE3, (Function1) objP2), 0.0f, 6.0f, 10.0f, 6.0f, 1);
            cl5 cl5Var14 = cl5Var5;
            v8q0.a(foa0Var.b, mm40VarN18, foa0Var.d, null, g1t0.a().f42262a.b, null, null, g1t0.a().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, 0, 0, 260968);
            mm40 mm40VarN19 = s5x0.N(jm40Var, 4.0f, 6.0f, 0.0f, 6.0f, 4);
            zG3 = fetVar.g(u2eVarE3);
            objP3 = fetVar.P();
            if (zG3) {
                objP3 = new iwx(u2eVarE3, (byte) 8);
                fetVar.o0(objP3);
            } else {
                objP3 = new iwx(u2eVarE3, (byte) 8);
                fetVar.o0(objP3);
            }
            mm40 mm40VarD10 = g3e.d(mm40VarN19, u2eVarE5, (Function1) objP3);
            v8q0.a(foa0Var.f, mm40VarD10, foa0Var.h, null, g1t0.a().f42262a.b, null, null, g1t0.a().f42262a.f, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, null, fetVar, 0, 24960, 240488);
            fetVar.r(false);
        }
        return Unit.f46060a;
    }
}
