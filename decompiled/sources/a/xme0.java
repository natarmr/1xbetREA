package a;

/* JADX INFO: loaded from: classes2.dex */
public final class xme0 extends mb00 {
    public final /* synthetic */ byte c;
    public final Object d;

    public /* synthetic */ xme0(Object obj, byte b) {
        this.c = b;
        this.d = obj;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    /* JADX WARN: Code duplicated, block: B:21:0x006e  */
    /* JADX WARN: Code duplicated, block: B:24:0x007c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0094  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:40:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v6 java.lang.Object, still in use, count: 2, list:
          (r2v6 java.lang.Object) from 0x0044: PHI (r2 I:??) = (r2v1 java.lang.Object), (r2v6 java.lang.Object) binds: [B:14:0x0043, B:38:0x0044] A[DONT_GENERATE, DONT_INLINE]
          (r2v6 java.lang.Object) from 0x0036: CHECK_CAST (a.j) (r2v6 java.lang.Object)
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
    @Override // a.mb00
    public final a.lb00 b(a.j r6, java.lang.String r7) {
        /*
            r5 = this;
            byte r0 = r5.c
            r1 = 0
            java.lang.Object r5 = r5.d
            r6.getClass()
            switch(r0) {
                case 0: goto L23;
                default: goto Lb;
            }
        Lb:
            a.mb00 r5 = (a.mb00) r5
            a.lb00 r5 = r5.b(r6, r7)
            if (r5 == 0) goto L22
            java.lang.CharSequence r6 = r5.b
            java.lang.CharSequence r6 = a.y1w0.a(r6)
            a.j r7 = r5.f19733a
            java.lang.CharSequence r5 = r5.c
            a.lb00 r1 = new a.lb00
            r1.<init>(r7, r6, r5)
        L22:
            return r1
        L23:
            java.util.List r0 = r6.a()
            java.util.Iterator r0 = r0.iterator()
        L2b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r0.next()
            r3 = r2
            a.j r3 = (a.j) r3
            a.ar20 r3 = r3.f15657a
            a.ar20 r4 = a.wb.z
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r3, r4)
            if (r3 == 0) goto L2b
            goto L44
        L43:
            r2 = r1
        L44:
            a.j r2 = (a.j) r2
            if (r2 != 0) goto L49
            goto Lac
        L49:
            a.pb00 r5 = (a.pb00) r5
            java.lang.CharSequence r7 = a.dwi0.N(r2, r7)
            r7.getClass()
            java.util.HashMap r5 = r5.f26681a
            kotlin.text.Regex r0 = a.pb00.b
            java.lang.String r3 = " "
            java.lang.String r7 = r0.replace(r7, r3)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toLowerCase(r0)
            r7.getClass()
            java.lang.Object r5 = r5.get(r7)
            a.ob00 r5 = (a.ob00) r5
            if (r5 != 0) goto L6e
            goto Lac
        L6e:
            java.util.List r6 = r6.a()
            java.util.Iterator r6 = r6.iterator()
        L76:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L8e
            java.lang.Object r7 = r6.next()
            r0 = r7
            a.j r0 = (a.j) r0
            a.ar20 r0 = r0.f15657a
            a.ar20 r3 = a.wb.C
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r3)
            if (r0 == 0) goto L76
            goto L8f
        L8e:
            r7 = r1
        L8f:
            a.j r7 = (a.j) r7
            if (r7 != 0) goto L94
            goto L95
        L94:
            r2 = r7
        L95:
            java.util.Map r6 = a.tzn.f34812a
            java.lang.String r6 = r5.b
            r7 = 1
            java.lang.String r6 = a.tzn.a(r6, r7, r7)
            java.lang.CharSequence r5 = r5.c
            if (r5 == 0) goto La6
            java.lang.String r1 = a.tzn.a(r5, r7, r7)
        La6:
            a.lb00 r5 = new a.lb00
            r5.<init>(r2, r6, r1)
            r1 = r5
        Lac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xme0.b(a.j, java.lang.String):a.lb00");
    }

    @Override // a.mb00
    public void d(htw htwVar, String str, j jVar, lb00 lb00Var) {
        switch (this.c) {
            case 1:
                jVar.getClass();
                ((mb00) this.d).d(htwVar, str, jVar, lb00Var);
                break;
            default:
                super.d(htwVar, str, jVar, lb00Var);
                break;
        }
    }
}
