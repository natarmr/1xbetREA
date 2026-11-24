package a;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ncj implements wbj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final szp f23297a;
    public final ugf0 b;
    public final vne c;
    public final vsg0 d;
    public final k050 e;
    public int f;
    public c4m0 g;
    public final ocj h;
    public final pmi i;
    public final n0o0 j;
    public final n0o0 k;
    public final z220 l;

    public ncj(szp szpVar, List list, ugf0 ugf0Var, vne vneVar) {
        list.getClass();
        this.f23297a = szpVar;
        this.b = ugf0Var;
        this.c = vneVar;
        yje yjeVar = null;
        this.d = new vsg0(new ex1((Object) this, yjeVar, (byte) 29));
        this.e = new k050();
        this.h = new ocj();
        this.i = new pmi(this, list);
        final byte b = 0;
        this.j = maz.b(new Function0(this) { // from class: a.xbj
            public final /* synthetic */ ncj b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws IOException {
                byte b2 = b;
                ncj ncjVar = this.b;
                switch (b2) {
                    case 0:
                        szp szpVar2 = ncjVar.f23297a;
                        File canonicalFile = ((File) szpVar2.c.invoke()).getCanonicalFile();
                        synchronized (szp.e) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = szp.d;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            absolutePath.getClass();
                            linkedHashSet.add(absolutePath);
                        }
                        return new vzp(canonicalFile, szpVar2.f33081a, (mlx) szpVar2.b.invoke(canonicalFile), new xi9(canonicalFile, (byte) 1));
                    default:
                        return ((vzp) ncjVar.j.getValue()).c;
                }
            }
        });
        final byte b2 = 1;
        this.k = maz.b(new Function0(this) { // from class: a.xbj
            public final /* synthetic */ ncj b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() throws IOException {
                byte b3 = b2;
                ncj ncjVar = this.b;
                switch (b3) {
                    case 0:
                        szp szpVar2 = ncjVar.f23297a;
                        File canonicalFile = ((File) szpVar2.c.invoke()).getCanonicalFile();
                        synchronized (szp.e) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = szp.d;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            absolutePath.getClass();
                            linkedHashSet.add(absolutePath);
                        }
                        return new vzp(canonicalFile, szpVar2.f33081a, (mlx) szpVar2.b.invoke(canonicalFile), new xi9(canonicalFile, (byte) 1));
                    default:
                        return ((vzp) ncjVar.j.getValue()).c;
                }
            }
        });
        this.l = new z220(vneVar, new e3j(this, (byte) 4), new zuh((byte) 12), new b1f((Object) this, yjeVar, (byte) 20));
    }

    @Override // a.wbj
    public final Object a(Function2 function2, zje zjeVar) {
        ont0 ont0Var = (ont0) zjeVar.getContext().get(qek0.g);
        if (ont0Var != null) {
            ont0Var.a(this);
        }
        return qjj.d0(new ont0(ont0Var, this), new g8g((Object) this, (Object) function2, (yje) null, (byte) 24), zjeVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(zje zjeVar) {
        dcj dcjVar;
        k050 k050Var;
        if (zjeVar instanceof dcj) {
            dcjVar = (dcj) zjeVar;
            int i = dcjVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                dcjVar.l = i - Integer.MIN_VALUE;
            } else {
                dcjVar = new dcj(this, zjeVar);
            }
        } else {
            dcjVar = new dcj(this, zjeVar);
        }
        Object obj = dcjVar.j;
        wne wneVar = wne.f39444a;
        int i2 = dcjVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            k050 k050Var2 = this.e;
            dcjVar.i = k050Var2;
            dcjVar.l = 1;
            if (k050Var2.d(dcjVar) == wneVar) {
                return wneVar;
            }
            k050Var = k050Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050Var = dcjVar.i;
            z1x.P(obj);
        }
        try {
            int i3 = this.f - 1;
            this.f = i3;
            if (i3 == 0) {
                c4m0 c4m0Var = this.g;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                this.g = null;
            }
            return Unit.f46060a;
        } finally {
            k050Var.c(null);
        }
    }

    public final mlx c() {
        return (mlx) this.k.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(u340 u340Var, zje zjeVar) {
        ecj ecjVar;
        odd oddVar;
        if (zjeVar instanceof ecj) {
            ecjVar = (ecj) zjeVar;
            int i = ecjVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ecjVar.l = i - Integer.MIN_VALUE;
            } else {
                ecjVar = new ecj(this, zjeVar);
            }
        } else {
            ecjVar = new ecj(this, zjeVar);
        }
        Object g0g0Var = ecjVar.j;
        wne wneVar = wne.f39444a;
        int i2 = ecjVar.l;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(g0g0Var);
            odd oddVar2 = u340Var.b;
            try {
                e0g0 e0g0Var = j0g0.b;
                CoroutineContext coroutineContextPlus = u340Var.d.plus(ecjVar.getContext());
                fr9 fr9Var = new fr9(this, u340Var, yjeVar, (byte) 15);
                ecjVar.i = oddVar2;
                ecjVar.l = 1;
                Object objD0 = qjj.d0(coroutineContextPlus, fr9Var, ecjVar);
                if (objD0 == wneVar) {
                    return wneVar;
                }
                g0g0Var = objD0;
                oddVar = oddVar2;
            } catch (Throwable th) {
                th = th;
                oddVar = oddVar2;
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            oddVar = ecjVar.i;
            try {
                z1x.P(g0g0Var);
            } catch (Throwable th2) {
                th = th2;
                e0g0 e0g0Var3 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
        }
        e0g0 e0g0Var4 = j0g0.b;
        Throwable thA = j0g0.a(g0g0Var);
        if (thA == null) {
            oddVar.N(g0g0Var);
        } else {
            oddVar.b0(thA);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(zje zjeVar) {
        fcj fcjVar;
        k050 k050Var;
        if (zjeVar instanceof fcj) {
            fcjVar = (fcj) zjeVar;
            int i = fcjVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                fcjVar.l = i - Integer.MIN_VALUE;
            } else {
                fcjVar = new fcj(this, zjeVar);
            }
        } else {
            fcjVar = new fcj(this, zjeVar);
        }
        Object obj = fcjVar.j;
        wne wneVar = wne.f39444a;
        int i2 = fcjVar.l;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(obj);
            k050 k050Var2 = this.e;
            fcjVar.i = k050Var2;
            fcjVar.l = 1;
            if (k050Var2.d(fcjVar) == wneVar) {
                return wneVar;
            }
            k050Var = k050Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050Var = fcjVar.i;
            z1x.P(obj);
        }
        try {
            int i3 = this.f + 1;
            this.f = i3;
            if (i3 == 1) {
                this.g = qjj.W(this.c, null, null, new gcj(this, yjeVar, (byte) 0), 3);
            }
            return Unit.f46060a;
        } finally {
            k050Var.c(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
    
        if (r2.E(r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(a.zje r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof a.hcj
            if (r0 == 0) goto L13
            r0 = r7
            a.hcj r0 = (a.hcj) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.hcj r0 = new a.hcj
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2e
            int r0 = r0.i
            a.z1x.P(r7)     // Catch: java.lang.Throwable -> L2c
            goto L5c
        L2c:
            r7 = move-exception
            goto L63
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            r6 = 0
            return r6
        L35:
            a.z1x.P(r7)
            goto L49
        L39:
            a.z1x.P(r7)
            a.mlx r7 = r6.c()
            r0.l = r4
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L49
            goto L5b
        L49:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            a.pmi r2 = r6.i     // Catch: java.lang.Throwable -> L5f
            r0.i = r7     // Catch: java.lang.Throwable -> L5f
            r0.l = r3     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r6 = r2.E(r0)     // Catch: java.lang.Throwable -> L5f
            if (r6 != r1) goto L5c
        L5b:
            return r1
        L5c:
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        L5f:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L63:
            a.jae0 r1 = new a.jae0
            r1.<init>(r0, r7)
            a.ocj r6 = r6.h
            r6.b(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ncj.f(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
    
        if (r11 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a2, code lost:
    
        if (r11 == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(boolean r10, a.yje r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof a.icj
            if (r0 == 0) goto L13
            r0 = r11
            a.icj r0 = (a.icj) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            a.icj r0 = new a.icj
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.m
            a.ocj r3 = r9.h
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L43
            if (r2 == r6) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L31
            a.z1x.P(r11)
            goto La5
        L31:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            return r7
        L37:
            a.z1x.P(r11)
            goto L8d
        L3b:
            boolean r10 = r0.i
            a.g7m0 r2 = r0.j
            a.z1x.P(r11)
            goto L5f
        L43:
            a.z1x.P(r11)
            a.g7m0 r2 = r3.a()
            boolean r11 = r2 instanceof a.h7t0
            if (r11 != 0) goto Lb9
            a.mlx r11 = r9.c()
            r0.j = r2
            r0.i = r10
            r0.m = r6
            java.lang.Object r11 = r11.a(r0)
            if (r11 != r1) goto L5f
            goto La4
        L5f:
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            boolean r6 = r2 instanceof a.naj
            if (r6 == 0) goto L6f
            r8 = r2
            a.naj r8 = (a.naj) r8
            int r8 = r8.f10823a
            goto L70
        L6f:
            r8 = -1
        L70:
            if (r6 == 0) goto L75
            if (r11 != r8) goto L75
            return r2
        L75:
            if (r10 == 0) goto L90
            a.mlx r10 = r9.c()
            a.hr r11 = new a.hr
            r2 = 10
            r11.<init>(r9, r7, r2)
            r0.j = r7
            r0.m = r5
            java.lang.Object r11 = r10.b(r11, r0)
            if (r11 != r1) goto L8d
            goto La4
        L8d:
            kotlin.Pair r11 = (kotlin.Pair) r11
            goto La7
        L90:
            a.mlx r10 = r9.c()
            a.jcj r11 = new a.jcj
            r2 = 0
            r11.<init>(r9, r8, r7, r2)
            r0.j = r7
            r0.m = r4
            java.lang.Object r11 = r10.d(r11, r0)
            if (r11 != r1) goto La5
        La4:
            return r1
        La5:
            kotlin.Pair r11 = (kotlin.Pair) r11
        La7:
            java.lang.Object r9 = r11.f46059a
            a.g7m0 r9 = (a.g7m0) r9
            java.lang.Object r10 = r11.b
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lb8
            r3.b(r9)
        Lb8:
            return r9
        Lb9:
            java.lang.String r9 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            a.jf4.n(r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ncj.g(boolean, a.yje):java.lang.Object");
    }

    @Override // a.wbj
    public final gmq getData() {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x009c A[Catch: soe -> 0x005b, TryCatch #1 {soe -> 0x005b, blocks: (B:20:0x0056, B:55:0x00f4, B:25:0x0060, B:52:0x00d9, B:33:0x0075, B:41:0x009c, B:43:0x00a2, B:37:0x007f, B:49:0x00c9), top: B:81:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:64:0x0131 A[Catch: all -> 0x015c, TryCatch #2 {all -> 0x015c, blocks: (B:62:0x011f, B:64:0x0131, B:65:0x0136), top: B:82:0x011f }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0136 A[Catch: all -> 0x015c, TRY_LEAVE, TryCatch #2 {all -> 0x015c, blocks: (B:62:0x011f, B:64:0x0131, B:65:0x0136), top: B:82:0x011f }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0148  */
    /* JADX WARN: Code duplicated, block: B:71:0x0150  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object h(boolean z, zje zjeVar) {
        kcj kcjVar;
        mie0 mie0Var;
        soe soeVar;
        mie0 mie0Var2;
        kie0 kie0Var;
        Throwable th;
        soe soeVar2;
        am4 am4Var;
        Object objB;
        mie0 mie0Var3;
        kie0 kie0Var2;
        int iHashCode;
        Object objA;
        boolean z2;
        int i;
        Object obj;
        if (zjeVar instanceof kcj) {
            kcjVar = (kcj) zjeVar;
            int i2 = kcjVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kcjVar.p = i2 - Integer.MIN_VALUE;
            } else {
                kcjVar = new kcj(this, zjeVar);
            }
        } else {
            kcjVar = new kcj(this, zjeVar);
        }
        kcj kcjVar2 = kcjVar;
        Object objA2 = kcjVar2.n;
        wne wneVar = wne.f39444a;
        byte b = 1;
        yje yjeVar = null;
        try {
            switch (kcjVar2.p) {
                case 0:
                    z1x.P(objA2);
                    int i3 = 3;
                    if (z) {
                        kcjVar2.i = z;
                        kcjVar2.p = 1;
                        objA2 = ((vzp) this.j.getValue()).a(new y0g(i3, yjeVar, (byte) 11), kcjVar2);
                        if (objA2 != wneVar) {
                            if (objA2 != null) {
                                iHashCode = objA2.hashCode();
                            } else {
                                iHashCode = 0;
                            }
                            mlx mlxVarC = c();
                            kcjVar2.j = objA2;
                            kcjVar2.i = z;
                            kcjVar2.m = iHashCode;
                            kcjVar2.p = 2;
                            objA = mlxVarC.a(kcjVar2);
                            if (objA != wneVar) {
                                int i4 = iHashCode;
                                z2 = z;
                                i = i4;
                                obj = objA2;
                                objA2 = objA;
                                return new naj(i, ((Number) objA2).intValue(), obj);
                            }
                        }
                    } else {
                        mlx mlxVarC2 = c();
                        kcjVar2.i = z;
                        kcjVar2.p = 3;
                        objA2 = mlxVarC2.a(kcjVar2);
                        if (objA2 != wneVar) {
                            int iIntValue = ((Number) objA2).intValue();
                            mlx mlxVarC3 = c();
                            jcj jcjVar = new jcj(this, iIntValue, yjeVar, b);
                            kcjVar2.i = z;
                            kcjVar2.p = 4;
                            objA2 = mlxVarC3.d(jcjVar, kcjVar2);
                            if (objA2 == wneVar) {
                            }
                            return (naj) objA2;
                        }
                    }
                    return wneVar;
                case 1:
                    z = kcjVar2.i;
                    z1x.P(objA2);
                    if (objA2 != null) {
                        iHashCode = objA2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    mlx mlxVarC4 = c();
                    kcjVar2.j = objA2;
                    kcjVar2.i = z;
                    kcjVar2.m = iHashCode;
                    kcjVar2.p = 2;
                    objA = mlxVarC4.a(kcjVar2);
                    if (objA != wneVar) {
                        int i5 = iHashCode;
                        z2 = z;
                        i = i5;
                        obj = objA2;
                        objA2 = objA;
                        return new naj(i, ((Number) objA2).intValue(), obj);
                    }
                    return wneVar;
                case 2:
                    i = kcjVar2.m;
                    z2 = kcjVar2.i;
                    obj = kcjVar2.j;
                    try {
                        z1x.P(objA2);
                        return new naj(i, ((Number) objA2).intValue(), obj);
                    } catch (soe e) {
                        e = e;
                        z = z2;
                        mie0 mie0Var4 = new mie0();
                        kcjVar2.j = e;
                        kcjVar2.k = mie0Var4;
                        kcjVar2.l = mie0Var4;
                        kcjVar2.i = z;
                        kcjVar2.p = 5;
                        Object objInvoke = ((Function1) this.b.f35622a).invoke(e);
                        if (objInvoke != wneVar) {
                            mie0Var = mie0Var4;
                            soeVar = e;
                            objA2 = objInvoke;
                            mie0Var2 = mie0Var;
                            mie0Var2.f21842a = objA2;
                            kie0Var = new kie0();
                            try {
                                am4Var = new am4(mie0Var, this, kie0Var, yjeVar, (byte) 2);
                                kcjVar2.j = soeVar;
                                kcjVar2.k = mie0Var;
                                kcjVar2.l = kie0Var;
                                kcjVar2.p = 6;
                                if (z) {
                                    objB = am4Var.invoke(kcjVar2);
                                } else {
                                    objB = c().b(new pn(am4Var, yjeVar, (byte) 23), kcjVar2);
                                }
                                if (objB != wneVar) {
                                    mie0Var3 = mie0Var;
                                    kie0Var2 = kie0Var;
                                    Object obj2 = mie0Var3.f21842a;
                                    return new naj(obj2 != null ? obj2.hashCode() : 0, kie0Var2.f18333a, obj2);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                soeVar2 = soeVar;
                                tjo.a(soeVar2, th);
                                throw soeVar2;
                            }
                        }
                        return wneVar;
                    }
                case 3:
                    z = kcjVar2.i;
                    z1x.P(objA2);
                    int iIntValue2 = ((Number) objA2).intValue();
                    mlx mlxVarC5 = c();
                    jcj jcjVar2 = new jcj(this, iIntValue2, yjeVar, b);
                    kcjVar2.i = z;
                    kcjVar2.p = 4;
                    objA2 = mlxVarC5.d(jcjVar2, kcjVar2);
                    if (objA2 == wneVar) {
                        return wneVar;
                    }
                    return (naj) objA2;
                case 4:
                    boolean z3 = kcjVar2.i;
                    z1x.P(objA2);
                    return (naj) objA2;
                case 5:
                    z = kcjVar2.i;
                    mie0 mie0Var5 = (mie0) kcjVar2.l;
                    mie0 mie0Var6 = kcjVar2.k;
                    soe soeVar3 = (soe) kcjVar2.j;
                    z1x.P(objA2);
                    mie0Var = mie0Var6;
                    mie0Var2 = mie0Var5;
                    soeVar = soeVar3;
                    mie0Var2.f21842a = objA2;
                    kie0Var = new kie0();
                    am4Var = new am4(mie0Var, this, kie0Var, yjeVar, (byte) 2);
                    kcjVar2.j = soeVar;
                    kcjVar2.k = mie0Var;
                    kcjVar2.l = kie0Var;
                    kcjVar2.p = 6;
                    if (z) {
                        objB = am4Var.invoke(kcjVar2);
                    } else {
                        objB = c().b(new pn(am4Var, yjeVar, (byte) 23), kcjVar2);
                    }
                    if (objB != wneVar) {
                        mie0Var3 = mie0Var;
                        kie0Var2 = kie0Var;
                        Object obj3 = mie0Var3.f21842a;
                        return new naj(obj3 != null ? obj3.hashCode() : 0, kie0Var2.f18333a, obj3);
                    }
                    return wneVar;
                case 6:
                    kie0Var2 = (kie0) kcjVar2.l;
                    mie0Var3 = kcjVar2.k;
                    soeVar2 = (soe) kcjVar2.j;
                    try {
                        z1x.P(objA2);
                        Object obj4 = mie0Var3.f21842a;
                        return new naj(obj4 != null ? obj4.hashCode() : 0, kie0Var2.f18333a, obj4);
                    } catch (Throwable th3) {
                        th = th3;
                        tjo.a(soeVar2, th);
                        throw soeVar2;
                    }
                default:
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (soe e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(Object obj, boolean z, zje zjeVar) {
        lcj lcjVar;
        kie0 kie0Var;
        if (zjeVar instanceof lcj) {
            lcjVar = (lcj) zjeVar;
            int i = lcjVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                lcjVar.l = i - Integer.MIN_VALUE;
            } else {
                lcjVar = new lcj(this, zjeVar);
            }
        } else {
            lcjVar = new lcj(this, zjeVar);
        }
        Object obj2 = lcjVar.j;
        wne wneVar = wne.f39444a;
        int i2 = lcjVar.l;
        if (i2 == 0) {
            z1x.P(obj2);
            kie0 kie0Var2 = new kie0();
            vzp vzpVar = (vzp) this.j.getValue();
            mcj mcjVar = new mcj(kie0Var2, this, obj, z, null);
            lcjVar.i = kie0Var2;
            lcjVar.l = 1;
            if (vzpVar.b(mcjVar, lcjVar) == wneVar) {
                return wneVar;
            }
            kie0Var = kie0Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kie0Var = lcjVar.i;
            z1x.P(obj2);
        }
        return new Integer(kie0Var.f18333a);
    }
}
