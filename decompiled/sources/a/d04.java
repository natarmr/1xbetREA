package a;

import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class d04 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f5253a;
    public zxv b;
    public w6t0 c;
    public zi80 d;
    public final gxu e;
    public final rx3 f;
    public final lef0 g;
    public volatile boolean h;
    public volatile int i;
    public final p7m0 j;
    public final xae0 k;
    public final qoj0 l;
    public final /* synthetic */ byte m;
    public final /* synthetic */ Object n;

    public d04(CoroutineContext coroutineContext, fl80 fl80Var) {
        zi80 zi80Var;
        rh80 rh80Var;
        coroutineContext.getClass();
        this.f5253a = coroutineContext;
        this.c = new ml80();
        zi80 zi80Var2 = zi80.e;
        rh80 rh80Var2 = fl80Var != null ? (rh80) fl80Var.d.invoke() : null;
        if (rh80Var2 != null) {
            zi80Var = new zi80(rh80Var2);
        } else {
            zi80Var = zi80.e;
            zi80Var.getClass();
        }
        this.d = zi80Var;
        gxu gxuVar = new gxu();
        gxuVar.f12096a = new rx3();
        p7m0 p7m0VarA = q7m0.a(null);
        gxuVar.b = p7m0VarA;
        gxuVar.c = vtb.N(p7m0VarA);
        if (fl80Var != null && (rh80Var = (rh80) fl80Var.d.invoke()) != null) {
            gxuVar.w(rh80Var.e, rh80Var.f);
        }
        this.e = gxuVar;
        rx3 rx3Var = new rx3();
        this.f = rx3Var;
        this.g = new lef0((byte) 22);
        this.j = q7m0.a(Boolean.FALSE);
        this.k = (xae0) gxuVar.c;
        this.l = roj0.a(0, 64, i99.b);
        ((CopyOnWriteArrayList) rx3Var.b).add(new pl70(this, (byte) 9));
    }

    public final Object a(int i) {
        Object value;
        Object value2;
        p7m0 p7m0Var = this.j;
        do {
            value = p7m0Var.getValue();
            ((Boolean) value).getClass();
        } while (!p7m0Var.m(value, Boolean.TRUE));
        this.h = true;
        this.i = i;
        if (Build.ID != null && Log.isLoggable("Paging", 2)) {
            Log.v("Paging", "Accessing item index[" + i + ']', null);
        }
        zxv zxvVar = this.b;
        if (zxvVar != null) {
            zxvVar.k(this.d.a(i));
        }
        Object objB = this.d.b(i);
        p7m0 p7m0Var2 = this.j;
        do {
            value2 = p7m0Var2.getValue();
            ((Boolean) value2).getClass();
        } while (!p7m0Var2.m(value2, Boolean.FALSE));
        return objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0029  */
    public final Object b(List list, int i, int i2, boolean z, dp00 dp00Var, dp00 dp00Var2, zxv zxvVar, zje zjeVar) {
        nl80 nl80Var;
        zi80 zi80Var;
        zxv zxvVar2;
        dp00 dp00Var3;
        dp00 dp00Var4;
        List list2;
        boolean z2;
        zxv zxvVar3;
        zi80 zi80Var2;
        zxv zxvVar4;
        List list3;
        List list4;
        int i3 = i;
        int i4 = i2;
        if (zjeVar instanceof nl80) {
            nl80Var = (nl80) zjeVar;
            int i5 = nl80Var.u;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                nl80Var.u = i5 - Integer.MIN_VALUE;
            } else {
                nl80Var = new nl80(this, zjeVar);
            }
        } else {
            nl80Var = new nl80(this, zjeVar);
        }
        Object obj = nl80Var.s;
        Object obj2 = wne.f39444a;
        int i6 = nl80Var.u;
        if (i6 == 0) {
            z1x.P(obj);
            if (z && dp00Var == null) {
                jf4.o("Cannot dispatch LoadStates in PagingDataPresenter without source LoadStates set.");
                return null;
            }
            this.h = false;
            zi80 zi80Var3 = this.d;
            zxv zxvVar5 = this.b;
            zi80 zi80Var4 = new zi80(i3, i4, list);
            zi80 zi80Var5 = this.d;
            zi80Var5.getClass();
            this.d = zi80Var4;
            this.b = zxvVar;
            try {
                n7x ll80Var = new ll80(zi80Var4, zi80Var5);
                nl80Var.i = list;
                nl80Var.j = dp00Var;
                nl80Var.k = dp00Var2;
                nl80Var.l = zxvVar;
                nl80Var.m = zi80Var3;
                nl80Var.n = zxvVar5;
                nl80Var.o = zi80Var4;
                nl80Var.p = i3;
                nl80Var.q = i4;
                nl80Var.r = z;
                nl80Var.u = 1;
                if (c(ll80Var, nl80Var) == obj2) {
                    return obj2;
                }
                dp00Var3 = dp00Var;
                zxvVar2 = zxvVar5;
                dp00Var4 = dp00Var2;
                list2 = list;
                z2 = z;
                zxvVar3 = zxvVar;
                zi80Var = zi80Var3;
                zi80Var2 = zi80Var4;
            } catch (CancellationException e) {
                e = e;
                zi80Var = zi80Var3;
                zxvVar2 = zxvVar5;
                this.d = zi80Var;
                this.b = zxvVar2;
                throw e;
            }
        } else {
            if (i6 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = nl80Var.r;
            int i7 = nl80Var.q;
            int i8 = nl80Var.p;
            zi80Var2 = nl80Var.o;
            zxvVar2 = nl80Var.n;
            zi80Var = nl80Var.m;
            zxvVar3 = nl80Var.l;
            dp00Var4 = nl80Var.k;
            dp00Var3 = nl80Var.j;
            list2 = nl80Var.i;
            try {
                z1x.P(obj);
                i4 = i7;
                i3 = i8;
            } catch (CancellationException e2) {
                e = e2;
                this.d = zi80Var;
                this.b = zxvVar2;
                throw e;
            }
        }
        if (Build.ID != null && Log.isLoggable("Paging", 3)) {
            StringBuilder sb = new StringBuilder("Presenting data (\n                            |   first item: ");
            kls0 kls0Var = (kls0) CollectionsKt.firstOrNull(list2);
            sb.append((kls0Var == null || (list4 = kls0Var.b) == null) ? null : CollectionsKt.firstOrNull(list4));
            sb.append("\n                            |   last item: ");
            kls0 kls0Var2 = (kls0) CollectionsKt.f0(list2);
            sb.append((kls0Var2 == null || (list3 = kls0Var2.b) == null) ? null : CollectionsKt.f0(list3));
            sb.append("\n                            |   placeholdersBefore: ");
            sb.append(i3);
            sb.append("\n                            |   placeholdersAfter: ");
            sb.append(i4);
            sb.append("\n                            |   hintReceiver: ");
            sb.append(zxvVar3);
            sb.append("\n                            |   sourceLoadStates: ");
            sb.append(dp00Var3);
            sb.append("\n                        ");
            String string = sb.toString();
            if (dp00Var4 != null) {
                string = string + "|   mediatorLoadStates: " + dp00Var4 + '\n';
            }
            Log.d("Paging", ntm0.d(string.concat("|)")), null);
        }
        if (z2) {
            gxu gxuVar = this.e;
            dp00Var3.getClass();
            gxuVar.w(dp00Var3, dp00Var4);
        }
        if (zi80Var2.f() == 0 && (zxvVar4 = this.b) != null) {
            int i9 = zi80Var2.b / 2;
            zxvVar4.k(new umu0(i9, i9, zi80Var2.d(), zi80Var2.e()));
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0202  */
    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:52:0x0110  */
    /* JADX WARN: Code duplicated, block: B:53:0x0112  */
    /* JADX WARN: Code duplicated, block: B:55:0x0115  */
    /* JADX WARN: Code duplicated, block: B:56:0x0119 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x011b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0130  */
    /* JADX WARN: Code duplicated, block: B:64:0x014a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0160  */
    /* JADX WARN: Code duplicated, block: B:70:0x016c  */
    /* JADX WARN: Code duplicated, block: B:73:0x0173  */
    /* JADX WARN: Code duplicated, block: B:76:0x0179  */
    /* JADX WARN: Code duplicated, block: B:79:0x0184  */
    /* JADX WARN: Code duplicated, block: B:82:0x0190  */
    /* JADX WARN: Code duplicated, block: B:85:0x0196  */
    /* JADX WARN: Code duplicated, block: B:88:0x019c  */
    /* JADX WARN: Code duplicated, block: B:91:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d3  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object c(n7x n7xVar, zje zjeVar) {
        c04 c04Var;
        ll80 ll80Var;
        zi80 zi80Var;
        zi80 zi80Var2;
        fvt0 fvt0Var;
        amk amkVar;
        boolean z;
        int iMax;
        int i;
        int iMax2;
        int i2;
        int iF;
        int i3;
        int iF2;
        jmk jmkVar;
        int i4;
        int i5;
        int i6;
        int iF3;
        int i7;
        int iF4;
        jmk jmkVar2;
        int i8;
        int i9;
        int iF5;
        zi80 zi80Var3;
        int i10;
        int i11;
        int iE;
        int iA;
        int iMin;
        int i12;
        int i13;
        int iMin2;
        int i14;
        int i15;
        int i16;
        boolean z2;
        byte b = this.m;
        Object obj = this.n;
        switch (b) {
            case 0:
                f04 f04Var = (f04) obj;
                fvt0 fvt0Var2 = f04Var.b;
                if (zjeVar instanceof c04) {
                    c04Var = (c04) zjeVar;
                    int i17 = c04Var.m;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        c04Var.m = i17 - Integer.MIN_VALUE;
                    } else {
                        c04Var = new c04(this, zjeVar);
                    }
                } else {
                    c04Var = new c04(this, zjeVar);
                }
                Object objD0 = c04Var.k;
                wne wneVar = wne.f39444a;
                int i18 = c04Var.m;
                yje yjeVar = null;
                try {
                    if (i18 == 0) {
                        z1x.P(objD0);
                        if (n7xVar instanceof ll80) {
                            ll80Var = (ll80) n7xVar;
                            zi80 zi80Var4 = ll80Var.f20235a;
                            zi80 zi80Var5 = ll80Var.b;
                            if (zi80Var5.f() == 0) {
                                if (zi80Var4.f() > 0) {
                                    fvt0Var2.c(0, zi80Var4.f());
                                }
                            } else if (zi80Var4.f() != 0) {
                                f04Var.g.set(zi80Var5);
                                CoroutineContext coroutineContext = f04Var.d;
                                cm3 cm3Var = new cm3(ll80Var, f04Var, yjeVar, (byte) 3);
                                c04Var.i = f04Var;
                                c04Var.j = ll80Var;
                                c04Var.m = 1;
                                objD0 = qjj.d0(coroutineContext, cm3Var, c04Var);
                                if (objD0 == wneVar) {
                                    return wneVar;
                                }
                                tu90 tu90Var = (tu90) objD0;
                                f04Var.g.set(null);
                                zi80Var = ll80Var.b;
                                zi80Var2 = ll80Var.f20235a;
                                fvt0Var = f04Var.b;
                                zi80Var.getClass();
                                tu90Var.getClass();
                                amkVar = tu90Var.f34541a;
                                z = tu90Var.b;
                                if (z) {
                                    nf80 nf80Var = new nf80(zi80Var, zi80Var2, fvt0Var);
                                    amkVar.b(nf80Var);
                                    iMin = Math.min(zi80Var.c, nf80Var.c);
                                    i12 = zi80Var2.c - nf80Var.c;
                                    if (i12 > 0) {
                                        if (iMin > 0) {
                                            fvt0Var.f(0, iMin, jmk.c);
                                        }
                                        fvt0Var.c(0, i12);
                                    } else if (i12 < 0) {
                                        fvt0Var.d(0, -i12);
                                        i13 = iMin + i12;
                                        if (i13 > 0) {
                                            fvt0Var.f(0, i13, jmk.c);
                                        }
                                    }
                                    nf80Var.c = zi80Var2.c;
                                    iMin2 = Math.min(zi80Var.d, nf80Var.d);
                                    int i19 = zi80Var2.d;
                                    int i20 = nf80Var.d;
                                    i14 = i19 - i20;
                                    i15 = nf80Var.c + nf80Var.e + i20;
                                    i16 = i15 - iMin2;
                                    if (i16 != zi80Var.f() - iMin2) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (i14 > 0) {
                                        fvt0Var.c(i15, i14);
                                    } else if (i14 < 0) {
                                        fvt0Var.d(i15 + i14, -i14);
                                        iMin2 += i14;
                                    }
                                    if (iMin2 > 0) {
                                        fvt0Var.f(i16, iMin2, jmk.c);
                                    }
                                    nf80Var.d = zi80Var2.d;
                                } else {
                                    iMax = Math.max(zi80Var.c, zi80Var2.c);
                                    int iMin3 = Math.min(zi80Var.c + zi80Var.b, zi80Var2.c + zi80Var2.b);
                                    i = iMin3 - iMax;
                                    if (i > 0) {
                                        fvt0Var.d(iMax, i);
                                        fvt0Var.c(iMax, i);
                                    }
                                    int iMin4 = Math.min(iMax, iMin3);
                                    iMax2 = Math.max(iMax, iMin3);
                                    i2 = zi80Var.c;
                                    iF = zi80Var2.f();
                                    if (i2 > iF) {
                                        i2 = iF;
                                    }
                                    i3 = zi80Var.c + zi80Var.b;
                                    iF2 = zi80Var2.f();
                                    if (i3 > iF2) {
                                        i3 = iF2;
                                    }
                                    jmkVar = jmk.f16770a;
                                    i4 = iMin4 - i2;
                                    if (i4 > 0) {
                                        fvt0Var.f(i2, i4, jmkVar);
                                    }
                                    i5 = i3 - iMax2;
                                    if (i5 > 0) {
                                        fvt0Var.f(iMax2, i5, jmkVar);
                                    }
                                    i6 = zi80Var2.c;
                                    iF3 = zi80Var.f();
                                    if (i6 > iF3) {
                                        i6 = iF3;
                                    }
                                    i7 = zi80Var2.c + zi80Var2.b;
                                    iF4 = zi80Var.f();
                                    if (i7 > iF4) {
                                        i7 = iF4;
                                    }
                                    jmkVar2 = jmk.b;
                                    i8 = iMin4 - i6;
                                    if (i8 > 0) {
                                        fvt0Var.f(i6, i8, jmkVar2);
                                    }
                                    i9 = i7 - iMax2;
                                    if (i9 > 0) {
                                        fvt0Var.f(iMax2, i9, jmkVar2);
                                    }
                                    iF5 = zi80Var2.f() - zi80Var.f();
                                    if (iF5 > 0) {
                                        fvt0Var.c(zi80Var.f(), iF5);
                                    } else if (iF5 < 0) {
                                        fvt0Var.d(zi80Var.f() + iF5, -iF5);
                                    }
                                }
                                zi80Var3 = ll80Var.b;
                                i10 = f04Var.f;
                                zi80Var3.getClass();
                                if (z) {
                                    i11 = i10 - zi80Var3.c;
                                    int i21 = zi80Var3.b;
                                    if (i11 >= 0) {
                                        iE = l1e0.e(i10, l1e0.o(0, zi80Var2.f()));
                                    } else {
                                        iE = l1e0.e(i10, l1e0.o(0, zi80Var2.f()));
                                    }
                                } else {
                                    iE = l1e0.e(i10, l1e0.o(0, zi80Var2.f()));
                                }
                                f04Var.f = iE;
                                a(iE);
                            } else if (zi80Var5.f() > 0) {
                                fvt0Var2.d(0, zi80Var5.f());
                            }
                        } else if (n7xVar instanceof kl80) {
                            kl80 kl80Var = (kl80) n7xVar;
                            int i22 = kl80Var.c;
                            int size = kl80Var.f18474a.size();
                            int iMin5 = Math.min(i22, size);
                            int i23 = i22 - iMin5;
                            int i24 = size - iMin5;
                            if (iMin5 > 0) {
                                fvt0Var2.f(i23, iMin5, null);
                            }
                            if (i24 > 0) {
                                fvt0Var2.c(0, i24);
                            }
                            int i25 = (kl80Var.b - i22) + iMin5;
                            if (i25 > 0) {
                                fvt0Var2.c(0, i25);
                            } else if (i25 < 0) {
                                fvt0Var2.d(0, -i25);
                            }
                        } else if (n7xVar instanceof hl80) {
                            hl80 hl80Var = (hl80) n7xVar;
                            int i26 = hl80Var.f13245a;
                            int i27 = hl80Var.d;
                            int size2 = hl80Var.b.size();
                            int iMin6 = Math.min(i27, size2);
                            int i28 = size2 - iMin6;
                            int i29 = i26 + iMin6;
                            if (iMin6 > 0) {
                                fvt0Var2.f(i26, iMin6, null);
                            }
                            if (i28 > 0) {
                                fvt0Var2.c(i29, i28);
                            }
                            int i30 = hl80Var.c;
                            int i31 = (i30 - i27) + iMin6;
                            int i32 = i26 + size2 + i30;
                            if (i31 > 0) {
                                fvt0Var2.c(i32 - i31, i31);
                            } else if (i31 < 0) {
                                fvt0Var2.d(i32, -i31);
                            }
                        } else if (n7xVar instanceof jl80) {
                            jl80 jl80Var = (jl80) n7xVar;
                            int i33 = jl80Var.c;
                            int i34 = jl80Var.b;
                            int i35 = (i34 - jl80Var.f16703a) - i33;
                            if (i35 > 0) {
                                fvt0Var2.c(0, i35);
                            } else if (i35 < 0) {
                                fvt0Var2.d(0, -i35);
                            }
                            int iMax3 = Math.max(0, i33 + i35);
                            int i36 = i34 - iMax3;
                            if (i36 > 0) {
                                fvt0Var2.f(iMax3, i36, null);
                            }
                        } else {
                            if (!(n7xVar instanceof il80)) {
                                t9f.b();
                                return null;
                            }
                            il80 il80Var = (il80) n7xVar;
                            int i37 = il80Var.f14964a;
                            int i38 = il80Var.c;
                            int i39 = il80Var.d;
                            int i40 = (i38 - il80Var.b) - i39;
                            int i41 = i37 + i38;
                            if (i40 > 0) {
                                fvt0Var2.c(i41 - i40, i40);
                            } else if (i40 < 0) {
                                fvt0Var2.d(i41, -i40);
                            }
                            int iMin7 = (i38 - i39) + (i40 < 0 ? Math.min(i39, -i40) : 0);
                            if (iMin7 > 0) {
                                fvt0Var2.f(i37, iMin7, null);
                            }
                        }
                    } else {
                        if (i18 != 1) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ll80Var = c04Var.j;
                        f04Var = c04Var.i;
                        z1x.P(objD0);
                        tu90 tu90Var2 = (tu90) objD0;
                        f04Var.g.set(null);
                        zi80Var = ll80Var.b;
                        zi80Var2 = ll80Var.f20235a;
                        fvt0Var = f04Var.b;
                        zi80Var.getClass();
                        tu90Var2.getClass();
                        amkVar = tu90Var2.f34541a;
                        z = tu90Var2.b;
                        if (z) {
                            nf80 nf80Var2 = new nf80(zi80Var, zi80Var2, fvt0Var);
                            amkVar.b(nf80Var2);
                            iMin = Math.min(zi80Var.c, nf80Var2.c);
                            i12 = zi80Var2.c - nf80Var2.c;
                            if (i12 > 0) {
                                if (iMin > 0) {
                                    fvt0Var.f(0, iMin, jmk.c);
                                }
                                fvt0Var.c(0, i12);
                            } else if (i12 < 0) {
                                fvt0Var.d(0, -i12);
                                i13 = iMin + i12;
                                if (i13 > 0) {
                                    fvt0Var.f(0, i13, jmk.c);
                                }
                            }
                            nf80Var2.c = zi80Var2.c;
                            iMin2 = Math.min(zi80Var.d, nf80Var2.d);
                            int i110 = zi80Var2.d;
                            int i210 = nf80Var2.d;
                            i14 = i110 - i210;
                            i15 = nf80Var2.c + nf80Var2.e + i210;
                            i16 = i15 - iMin2;
                            if (i16 != zi80Var.f() - iMin2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (i14 > 0) {
                                fvt0Var.c(i15, i14);
                            } else if (i14 < 0) {
                                fvt0Var.d(i15 + i14, -i14);
                                iMin2 += i14;
                            }
                            if (iMin2 > 0 && z2) {
                                fvt0Var.f(i16, iMin2, jmk.c);
                            }
                            nf80Var2.d = zi80Var2.d;
                        } else {
                            iMax = Math.max(zi80Var.c, zi80Var2.c);
                            int iMin8 = Math.min(zi80Var.c + zi80Var.b, zi80Var2.c + zi80Var2.b);
                            i = iMin8 - iMax;
                            if (i > 0) {
                                fvt0Var.d(iMax, i);
                                fvt0Var.c(iMax, i);
                            }
                            int iMin9 = Math.min(iMax, iMin8);
                            iMax2 = Math.max(iMax, iMin8);
                            i2 = zi80Var.c;
                            iF = zi80Var2.f();
                            if (i2 > iF) {
                                i2 = iF;
                            }
                            i3 = zi80Var.c + zi80Var.b;
                            iF2 = zi80Var2.f();
                            if (i3 > iF2) {
                                i3 = iF2;
                            }
                            jmkVar = jmk.f16770a;
                            i4 = iMin9 - i2;
                            if (i4 > 0) {
                                fvt0Var.f(i2, i4, jmkVar);
                            }
                            i5 = i3 - iMax2;
                            if (i5 > 0) {
                                fvt0Var.f(iMax2, i5, jmkVar);
                            }
                            i6 = zi80Var2.c;
                            iF3 = zi80Var.f();
                            if (i6 > iF3) {
                                i6 = iF3;
                            }
                            i7 = zi80Var2.c + zi80Var2.b;
                            iF4 = zi80Var.f();
                            if (i7 > iF4) {
                                i7 = iF4;
                            }
                            jmkVar2 = jmk.b;
                            i8 = iMin9 - i6;
                            if (i8 > 0) {
                                fvt0Var.f(i6, i8, jmkVar2);
                            }
                            i9 = i7 - iMax2;
                            if (i9 > 0) {
                                fvt0Var.f(iMax2, i9, jmkVar2);
                            }
                            iF5 = zi80Var2.f() - zi80Var.f();
                            if (iF5 > 0) {
                                fvt0Var.c(zi80Var.f(), iF5);
                            } else if (iF5 < 0) {
                                fvt0Var.d(zi80Var.f() + iF5, -iF5);
                            }
                        }
                        zi80Var3 = ll80Var.b;
                        i10 = f04Var.f;
                        zi80Var3.getClass();
                        if (z) {
                            iE = l1e0.e(i10, l1e0.o(0, zi80Var2.f()));
                        } else {
                            i11 = i10 - zi80Var3.c;
                            int i211 = zi80Var3.b;
                            if (i11 >= 0 || i11 >= i211) {
                                iE = l1e0.e(i10, l1e0.o(0, zi80Var2.f()));
                            } else {
                                int i42 = 0;
                                while (true) {
                                    if (i42 < 30) {
                                        int i43 = ((i42 / 2) * (i42 % 2 == 1 ? -1 : 1)) + i11;
                                        if (i43 < 0 || i43 >= zi80Var3.b || (iA = amkVar.a(i43)) == -1) {
                                            i42++;
                                        } else {
                                            iE = zi80Var2.c + iA;
                                        }
                                    } else {
                                        iE = l1e0.e(i10, l1e0.o(0, zi80Var2.f()));
                                    }
                                }
                            }
                        }
                        f04Var.f = iE;
                        a(iE);
                    }
                    return Unit.f46060a;
                } catch (Throwable th) {
                    f04Var.g.set(null);
                    throw th;
                }
            default:
                hdz hdzVar = (hdz) obj;
                ((hgk0) hdzVar.d).setValue(hdzVar.c.d());
                return Unit.f46060a;
        }
    }

    public final txx d() {
        zi80 zi80Var = this.d;
        int i = zi80Var.c;
        int i2 = zi80Var.d;
        ArrayList arrayList = zi80Var.f44430a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            w3d.u(arrayList2, ((kls0) it.next()).b);
        }
        return new txx(arrayList2, i, i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d04(f04 f04Var, CoroutineContext coroutineContext) {
        this(coroutineContext, (fl80) null);
        this.m = (byte) 0;
        this.n = f04Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d04(hdz hdzVar, CoroutineContext coroutineContext, fl80 fl80Var) {
        this(coroutineContext, fl80Var);
        this.m = (byte) 1;
        this.n = hdzVar;
    }
}
