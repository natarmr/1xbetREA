package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.sportgame.categories_subgames.api.MarketsCategoriesParams;

/* JADX INFO: loaded from: classes.dex */
public final class uuz implements on00, lzp, huo, qe60 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void c(mm40 mm40Var, mm40 mm40Var2, Fragment fragment, MarketsCategoriesParams marketsCategoriesParams, Function1 function1, fet fetVar, int i) {
        mm40Var.getClass();
        function1.getClass();
        fetVar.e0(1366721631);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (objP == obj) {
            ComponentCallbacks2 componentCallbacks2I = vqd.i(fragment);
            af3 af3Var = componentCallbacks2I instanceof af3 ? (af3) componentCallbacks2I : null;
            if (af3Var != null) {
                o5d0 o5d0Var = (o5d0) af3Var.d().get(g430.class);
                ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                if (!(ze3Var instanceof g430)) {
                    ze3Var = null;
                }
                g430 g430Var = (g430) ze3Var;
                if (g430Var != null) {
                    Fragment fragment2 = fragment;
                    while (true) {
                        if (fragment2 == 0) {
                            jf4.n("Can't find feature provider!");
                            return;
                        }
                        if (fragment2 instanceof ocl0) {
                            i1w0 i1w0VarF = a4n0.f(fragment);
                            ti6 ti6Var = new ti6(fragment, (byte) 4);
                            i1w0VarF.getClass();
                            cad cadVar = g430Var.f10644a;
                            pcl0 pcl0VarU = ((ocl0) fragment2).u(ti6Var);
                            ctf0 ctf0Var = g430Var.b;
                            j6m0 j6m0Var = g430Var.c;
                            kl5 kl5Var = g430Var.d;
                            gl5 gl5Var = g430Var.e;
                            je jeVar = g430Var.f;
                            kt2 kt2Var = g430Var.g;
                            gst0 gst0Var = g430Var.h;
                            knf0 knf0Var = g430Var.i;
                            peg0 peg0Var = g430Var.j;
                            mj8 mj8Var = g430Var.k;
                            r9u r9uVar = g430Var.l;
                            pru pruVar = g430Var.m;
                            evz evzVar = g430Var.o;
                            sue sueVar = g430Var.n;
                            cl5 cl5Var = g430Var.p;
                            q7d0 q7d0Var = g430Var.q;
                            roq0 roq0Var = g430Var.r;
                            pcl0VarU.getClass();
                            sueVar.getClass();
                            ctf0Var.getClass();
                            kt2Var.getClass();
                            gst0Var.getClass();
                            knf0Var.getClass();
                            r9uVar.getClass();
                            q7d0Var.getClass();
                            Object fliVar = new fli(cadVar, pcl0VarU, sueVar, marketsCategoriesParams, ctf0Var, j6m0Var, kl5Var, gl5Var, jeVar, kt2Var, gst0Var, knf0Var, peg0Var, mj8Var, pruVar, i1w0VarF, evzVar, cl5Var, q7d0Var, roq0Var);
                            fetVar.o0(fliVar);
                            objP = fliVar;
                            break;
                        }
                        fragment2 = fragment2.y;
                    }
                }
            }
            jf4.n(b1j.i(g430.class, "Cannot create dependency "));
            return;
        }
        fli fliVar2 = (fli) objP;
        q0h0 q0h0Var = new q0h0((eli) fliVar2.t.get());
        sgy sgyVarB = sre0.f32672a.b(uz20.class);
        int i2 = uz20.R;
        k3t0 k3t0VarX = n4c.X(sgyVarB, null, q0h0Var, fetVar, 14);
        boolean zI = fetVar.i(k3t0VarX);
        Object objP2 = fetVar.P();
        byte b = 3;
        if (zI || objP2 == obj) {
            objP2 = new ebh(k3t0VarX, b);
            fetVar.o0(objP2);
        }
        fragment.C().u0("KEY_SUB_GAME_FILTER_MODEL_REQUEST", fragment, new sa4((Function1) objP2, (byte) 3));
        boolean zI2 = fetVar.i(fragment) | fetVar.i(fliVar2) | fetVar.i(k3t0VarX);
        Object objP3 = fetVar.P();
        if (zI2 || objP3 == obj) {
            objP3 = new k9v((Object) fragment, (Object) fliVar2, (Object) k3t0VarX, (byte) 24);
            fetVar.o0(objP3);
        }
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP3, fetVar);
        boolean zI3 = fetVar.i(k3t0VarX) | fetVar.i(fragment) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP4 = fetVar.P();
        if (zI3 || objP4 == obj) {
            Object p000Var = new p000(k3t0VarX, fragment, pz40VarF, null, (byte) 8);
            fetVar.o0(p000Var);
            objP4 = p000Var;
        }
        m0x0.t(fetVar, fragment, (Function2) objP4);
        i3t0 i3t0Var = (i3t0) k3t0VarX;
        pz40 pz40VarY = i3t0Var.y(fetVar);
        boolean zI4 = fetVar.i(i3t0Var);
        Object objP5 = fetVar.P();
        if (zI4 || objP5 == obj) {
            objP5 = new vi6(i3t0Var, (byte) 9);
            fetVar.o0(objP5);
        }
        d9x.h(mm40Var, pz40VarY, (Function1) objP5, u1c.M(-304375950, new s49(pz40VarY, fliVar2, mm40Var2, fragment, marketsCategoriesParams, function1, (byte) 7), fetVar), u1c.M(1243872741, new p0z((Object) fliVar2, (byte) 12), fetVar), fetVar, (i & 14) | 27648);
        fetVar.r(false);
    }

    public static zq20 d(int i, int i2) {
        if (i == 1) {
            return zq20.e;
        }
        if (i == 2) {
            return i2 % 2 == 0 ? zq20.b : zq20.d;
        }
        if (i != 3) {
            int i3 = i2 % i;
            if (i3 == 0) {
                return zq20.b;
            }
            return i3 == i - 1 ? zq20.d : zq20.c;
        }
        int i4 = i2 % i;
        if (i4 == 0) {
            return zq20.b;
        }
        return i4 == i - 1 ? zq20.d : zq20.c;
    }

    public static fk60 e(int i) {
        Object next;
        c0o c0oVar = fk60.g1;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        while (y2VarH.hasNext()) {
            next = y2VarH.next();
            if (((fk60) next).f9675a == i) {
                return (fk60) next;
            }
        }
        next = null;
        return (fk60) next;
    }

    public static String g(int i) {
        if (i == 1) {
            return "settings";
        }
        if (i == 3) {
            return "bet_constructor";
        }
        if (i == 5) {
            return "coupon";
        }
        if (i == 7) {
            return "cybersport";
        }
        if (i == 8) {
            return "event_screen";
        }
        switch (i) {
            case 12:
                return "insight";
            case 13:
                return "swipex";
            case 14:
                return "casino";
            case 15:
                return "slots";
            case 16:
                return "live";
            case 17:
                return "bonus";
            case 18:
                return "tournaments";
            default:
                return "";
        }
    }

    public static lc70 i(String str, boolean z) {
        lc70 lc70Var = new lc70();
        lc70Var.k2.x(lc70Var, lc70.o2[0], str);
        Bundle bundleU = lc70Var.g;
        if (bundleU == null) {
            bundleU = i120.U();
        }
        bundleU.putBoolean("OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_BUNDLE_DEMO_AVAILABLE", z);
        lc70Var.s0(bundleU);
        return lc70Var;
    }

    @Override // a.lzp
    public String a() {
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:31|17|18) */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        r1 = r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r1 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        r11.i = r12;
        r11.j = r3;
        r11.m = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (a.qcc.O(r3, r11) == r13) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        throw r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006e -> B:27:0x0071). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(java.io.FileOutputStream r12, a.zje r13) throws java.io.IOException {
        /*
            r11 = this;
            boolean r0 = r13 instanceof a.hw40
            if (r0 == 0) goto L13
            r0 = r13
            a.hw40 r0 = (a.hw40) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            a.hw40 r0 = new a.hw40
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r11 = r0.k
            a.wne r13 = a.wne.f39444a
            int r1 = r0.m
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2c
            long r3 = r0.j
            java.io.FileOutputStream r12 = r0.i
            a.z1x.P(r11)
            r11 = r0
            goto L71
        L2c:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r11)
            r11 = 0
            return r11
        L33:
            a.z1x.P(r11)
            r3 = 10
            r11 = r0
        L39:
            r0 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L76
            java.nio.channels.FileChannel r5 = r12.getChannel()     // Catch: java.io.IOException -> L54
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
            r6 = 0
            java.nio.channels.FileLock r0 = r5.lock(r6, r8, r10)     // Catch: java.io.IOException -> L54
            r0.getClass()     // Catch: java.io.IOException -> L54
            return r0
        L54:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L75
            java.lang.String r5 = "Resource deadlock would occur"
            r6 = 0
            boolean r1 = kotlin.text.StringsKt.O(r1, r5, r6)
            if (r1 != r2) goto L75
            r11.i = r12
            r11.j = r3
            r11.m = r2
            java.lang.Object r0 = a.qcc.O(r3, r11)
            if (r0 != r13) goto L71
            return r13
        L71:
            r0 = 2
            long r3 = r3 * r0
            goto L39
        L75:
            throw r0
        L76:
            java.nio.channels.FileChannel r5 = r12.getChannel()
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
            r6 = 0
            java.nio.channels.FileLock r11 = r5.lock(r6, r8, r10)
            r11.getClass()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a.uuz.h(java.io.FileOutputStream, a.zje):java.lang.Object");
    }

    @Override // a.huo
    public ncs0 q(int i, int i2) {
        return new pnk();
    }

    @Override // a.lzp
    public void closeLogFile() {
    }

    @Override // a.huo
    public void o() {
    }

    @Override // a.huo
    public void f(fvh0 fvh0Var) {
    }

    @Override // a.qe60
    public int n(int i) {
        return i;
    }

    @Override // a.qe60
    public int s(int i) {
        return i;
    }

    @Override // a.lzp
    public void b(long j, String str) {
    }
}
