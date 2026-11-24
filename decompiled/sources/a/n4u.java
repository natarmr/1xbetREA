package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class n4u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22915a;
    public final Object b;

    public n4u(m4h m4hVar) {
        this.f22915a = (byte) 22;
        m4hVar.getClass();
        this.b = m4hVar;
    }

    public long a() {
        q7d0 q7d0Var = ((y6j0) this.b).f42100a;
        q7d0Var.getClass();
        return q7d0Var.a().getLong("DELETED_ACCOUNT_ID_KEY", 0L);
    }

    public a1t b() {
        return new a1t(i120.W(abp.d(((m0o0) this.b).b.c)), (byte) 14);
    }

    public t2y c() {
        String strA = ((ntu) this.b).a();
        return new t2y(ohs0.n(strA, "/static/img/android/games/promos/jackpot/jackpot_background_new.webp"), ohs0.n(strA, "/static/img/android/games/promos/jackpot/jackpot_board_new.webp"), ohs0.n(strA, "/static/img/android/games/promos/jackpot/jackpot_picture.webp"));
    }

    public xp90 d() {
        return ((p6t) this.b).b.f23010a.z();
    }

    public void e() {
        ((knf0) ((yk50) this.b).b).getClass();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v5 java.lang.Object, still in use, count: 2, list:
          (r0v5 java.lang.Object) from 0x003b: PHI (r0 I:??) = (r0v2 java.lang.Object), (r0v5 java.lang.Object) binds: [B:14:0x003a, B:22:0x003b] A[DONT_GENERATE, DONT_INLINE]
          (r0v5 java.lang.Object) from 0x0033: CHECK_CAST (a.rq60) (r0v5 java.lang.Object)
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
    public boolean f() {
        /*
            r4 = this;
            byte r0 = r4.f22915a
            r1 = 0
            java.lang.Object r4 = r4.b
            switch(r0) {
                case 11: goto L19;
                default: goto L8;
            }
        L8:
            a.dq00 r4 = (a.dq00) r4
            java.lang.Object r4 = r4.b
            a.nw20 r4 = (a.nw20) r4
            java.lang.Object r4 = r4.f24215a
            a.q7d0 r4 = (a.q7d0) r4
            java.lang.String r0 = "NOTIFICATION_LIGHT"
            boolean r4 = a.axq.z(r4, r0, r1)
            return r4
        L19:
            a.pbt r4 = (a.pbt) r4
            a.p2t r4 = r4.d
            java.util.List r4 = r4.a()
            if (r4 == 0) goto L44
            java.util.Iterator r4 = r4.iterator()
        L27:
            boolean r0 = r4.hasNext()
            r2 = 1
            if (r0 == 0) goto L3a
            java.lang.Object r0 = r4.next()
            r3 = r0
            a.rq60 r3 = (a.rq60) r3
            int r3 = r3.f30917a
            if (r3 != r2) goto L27
            goto L3b
        L3a:
            r0 = 0
        L3b:
            a.rq60 r0 = (a.rq60) r0
            if (r0 == 0) goto L44
            boolean r4 = r0.d
            if (r4 != r2) goto L44
            r1 = r2
        L44:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.n4u.f():boolean");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable g(String str, zje zjeVar) {
        l6u l6uVar;
        if (zjeVar instanceof l6u) {
            l6uVar = (l6u) zjeVar;
            int i = l6uVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                l6uVar.k = i - Integer.MIN_VALUE;
            } else {
                l6uVar = new l6u(this, zjeVar);
            }
        } else {
            l6uVar = new l6u(this, zjeVar);
        }
        Object objB = l6uVar.i;
        wne wneVar = wne.f39444a;
        int i2 = l6uVar.k;
        try {
            if (i2 == 0) {
                z1x.P(objB);
                dzg dzgVar = (dzg) this.b;
                l6uVar.k = 1;
                objB = dzgVar.b(str, l6uVar);
                if (objB == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objB);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : (Iterable) objB) {
                if (((v5l) obj).c.length() > 0) {
                    arrayList.add(obj);
                }
            }
            e0g0 e0g0Var = j0g0.b;
            return arrayList;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            e0g0 e0g0Var2 = j0g0.b;
            return new g0g0(e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(long j, zje zjeVar) {
        y9u y9uVar;
        if (zjeVar instanceof y9u) {
            y9uVar = (y9u) zjeVar;
            int i = y9uVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                y9uVar.k = i - Integer.MIN_VALUE;
            } else {
                y9uVar = new y9u(this, zjeVar);
            }
        } else {
            y9uVar = new y9u(this, zjeVar);
        }
        Object obj = y9uVar.i;
        wne wneVar = wne.f39444a;
        int i2 = y9uVar.k;
        if (i2 != 0) {
            if (i2 == 1) {
                z1x.P(obj);
                return ((j0g0) obj).f15681a;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        nmo nmoVar = (nmo) this.b;
        y9uVar.k = 1;
        Object objB = nmoVar.b(j, y9uVar);
        return objB == wneVar ? wneVar : objB;
    }

    public /* synthetic */ n4u(Object obj, byte b) {
        this.f22915a = b;
        this.b = obj;
    }

    public n4u(xvd0 xvd0Var) {
        this.f22915a = (byte) 29;
        xvd0Var.getClass();
        this.b = xvd0Var;
    }

    public n4u(edo edoVar) {
        this.f22915a = (byte) 4;
        edoVar.getClass();
        this.b = edoVar;
    }

    public n4u(pbt pbtVar) {
        this.f22915a = (byte) 11;
        pbtVar.getClass();
        this.b = pbtVar;
    }

    public n4u(pew pewVar) {
        this.f22915a = (byte) 15;
        pewVar.getClass();
        this.b = pewVar;
    }

    public n4u(k0q0 k0q0Var) {
        this.f22915a = (byte) 19;
        k0q0Var.getClass();
        this.b = k0q0Var;
    }

    public n4u(b6t b6tVar) {
        this.f22915a = (byte) 12;
        b6tVar.getClass();
        this.b = b6tVar;
    }
}
