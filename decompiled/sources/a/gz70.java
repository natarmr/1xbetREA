package a;

import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class gz70 {
    public static c4m0 D;
    public static c4m0 E;
    public static hy70 F = fy70.f10348a;
    public final rjo A;
    public final nhf0 B;
    public final mne C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jcl f12168a;
    public final qv b;
    public final jcl c;
    public final opt d;
    public final opt e;
    public final iu f;
    public final vpc g;
    public final jcl h;
    public final frc i;
    public final opt j;
    public final opt k;
    public final frc l;
    public final f4v m;
    public final iu n;
    public final is o;
    public final is p;
    public final opt q;
    public final is r;
    public final f4v s;
    public final is t;
    public final iqt u;
    public final rou v;
    public final vpc w;
    public final is x;
    public final iu y;
    public final f4v z;

    public gz70(jcl jclVar, qv qvVar, jcl jclVar2, vpc vpcVar, opt optVar, opt optVar2, iu iuVar, vpc vpcVar2, jcl jclVar3, is isVar, frc frcVar, opt optVar3, opt optVar4, frc frcVar2, f4v f4vVar, iu iuVar2, is isVar2, is isVar3, opt optVar5, jcl jclVar4, is isVar4, f4v f4vVar2, is isVar5, iqt iqtVar, rou rouVar, vpc vpcVar3, is isVar6, iu iuVar3, f4v f4vVar3, rjo rjoVar, nhf0 nhf0Var, mne mneVar) {
        this.f12168a = jclVar;
        this.b = qvVar;
        this.c = jclVar2;
        this.d = optVar;
        this.e = optVar2;
        this.f = iuVar;
        this.g = vpcVar2;
        this.h = jclVar3;
        this.i = frcVar;
        this.j = optVar3;
        this.k = optVar4;
        this.l = frcVar2;
        this.m = f4vVar;
        this.n = iuVar2;
        this.o = isVar2;
        this.p = isVar3;
        this.q = optVar5;
        this.r = isVar4;
        this.s = f4vVar2;
        this.t = isVar5;
        this.u = iqtVar;
        this.v = rouVar;
        this.w = vpcVar3;
        this.x = isVar6;
        this.y = iuVar3;
        this.z = f4vVar3;
        this.A = rjoVar;
        this.B = nhf0Var;
        this.C = mneVar;
    }

    public static void d(qom0 qom0Var) {
        hy70 hy70Var = F;
        if (hy70Var instanceof gy70) {
            ((gy70) hy70Var).f12114a.o(null, qom0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e6 A[Catch: Exception -> 0x003b, TRY_LEAVE, TryCatch #0 {Exception -> 0x003b, blocks: (B:14:0x0036, B:21:0x0052, B:33:0x00b3, B:36:0x00e6, B:23:0x005d, B:29:0x006e, B:26:0x0064), top: B:45:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e8, code lost:
    
        if (r0 == r4) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(a.zje r18) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gz70.a(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(zje zjeVar) {
        ky70 ky70Var;
        if (zjeVar instanceof ky70) {
            ky70Var = (ky70) zjeVar;
            int i = ky70Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ky70Var.k = i - Integer.MIN_VALUE;
            } else {
                ky70Var = new ky70(this, zjeVar);
            }
        } else {
            ky70Var = new ky70(this, zjeVar);
        }
        Object objA = ky70Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ky70Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            if (!this.u.f15225a.a()) {
                q7d0 q7d0Var = ((i7e) this.r.f15281a.c).b;
                String string = q7d0Var.a().getString("PREF_KEY_UNAUTHORIZED_USER_ID", "");
                if (string == null || string.length() == 0) {
                    string = UUID.randomUUID().toString();
                    string.getClass();
                    q7d0Var.g("PREF_KEY_UNAUTHORIZED_USER_ID", string);
                }
                return new ey70(string, "", "");
            }
            ky70Var.k = 1;
            objA = this.v.a(false, ky70Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        m2c0 m2c0Var = (m2c0) objA;
        return new ey70(String.valueOf(m2c0Var.S), m2c0Var.Z, m2c0Var.C);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r5.g.c(r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(a.zje r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof a.oy70
            if (r0 == 0) goto L13
            r0 = r6
            a.oy70 r0 = (a.oy70) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.oy70 r0 = new a.oy70
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            a.z1x.P(r6)
            goto L4e
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L31:
            a.z1x.P(r6)
            goto L43
        L35:
            a.z1x.P(r6)
            r0.k = r4
            a.opt r6 = r5.q
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L43
            goto L4d
        L43:
            r0.k = r3
            a.vpc r5 = r5.g
            java.lang.Object r5 = r5.c(r0)
            if (r5 != r1) goto L4e
        L4d:
            return r1
        L4e:
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gz70.c(a.zje):java.lang.Object");
    }
}
