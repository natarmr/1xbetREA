package a;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.prophylaxis.impl.prophylaxis.presentation.ProphylaxisAlarmReceiver;

/* JADX INFO: loaded from: classes5.dex */
public final class kpb0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public Object k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kpb0(skb0 skb0Var, xcz xczVar, List list, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 23;
        this.l = skb0Var;
        this.m = xczVar;
        this.k = list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r1.a(r8, r7) == r2) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object G(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.m
            a.ltr0 r0 = (a.ltr0) r0
            java.lang.Object r1 = r7.l
            a.kmq r1 = (a.kmq) r1
            a.wne r2 = a.wne.f39444a
            byte r3 = r7.j
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L27
            if (r3 == r5) goto L1f
            if (r3 != r4) goto L19
            a.z1x.P(r8)
            goto L52
        L19:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r6
        L1f:
            java.lang.Object r1 = r7.k
            a.kmq r1 = (a.kmq) r1
            a.z1x.P(r8)
            goto L3b
        L27:
            a.z1x.P(r8)
            a.khf0 r8 = r0.r
            a.bm5 r3 = a.bm5.l
            r7.l = r6
            r7.k = r1
            r7.j = r5
            java.io.Serializable r8 = a.khf0.G(r8, r3, r7)
            if (r8 != r2) goto L3b
            goto L51
        L3b:
            r3 = r8
            a.ql5 r3 = (a.ql5) r3
            a.ot r0 = r0.D
            a.bm5 r5 = a.bm5.l
            r0.a(r5, r3)
            r7.l = r6
            r7.k = r6
            r7.j = r4
            java.lang.Object r7 = r1.a(r8, r7)
            if (r7 != r2) goto L52
        L51:
            return r2
        L52:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kpb0.G(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0080  */
    private final Object H(Object obj) {
        List list;
        Object objB;
        List list2;
        Serializable serializableA;
        List list3;
        List list4;
        ql5 ql5Var;
        p7m0 p7m0Var;
        Object value;
        wfs0 wfs0Var = (wfs0) this.m;
        wne wneVar = wne.f39444a;
        byte b = this.j;
        if (b == 0) {
            z1x.P(obj);
            a5w a5wVar = ((ifs0) wfs0Var.D()).c;
            List listC = a5wVar != null ? kotlin.collections.a.c(a5wVar) : iun.f15405a;
            z7u z7uVar = wfs0Var.s;
            this.j = (byte) 1;
            obj = z7uVar.a(listC, this);
            if (obj != wneVar) {
            }
            return wneVar;
        }
        if (b == 1) {
            z1x.P(obj);
        } else {
            if (b == 2) {
                List list5 = (List) this.k;
                z1x.P(obj);
                objB = obj;
                list = list5;
                list2 = (List) objB;
                nrt nrtVar = wfs0Var.t;
                long j = Long.parseLong(wfs0Var.p);
                this.k = list;
                this.l = list2;
                this.j = (byte) 3;
                serializableA = nrt.a(nrtVar, j, this);
                if (serializableA != wneVar) {
                    list3 = list;
                    list4 = list2;
                    obj = serializableA;
                }
                return wneVar;
            }
            if (b != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list6 = (List) this.l;
            List list7 = (List) this.k;
            z1x.P(obj);
            list3 = list7;
            list4 = list6;
        }
        ql5Var = (ql5) obj;
        int i = wfs0.A;
        p7m0Var = wfs0Var.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
        } while (!p7m0Var.m(value, ifs0.a((ifs0) value, false, null, ql5Var, false, list3, list4, null, 311)));
        return Unit.f46060a;
        list = (List) obj;
        b8u b8uVar = wfs0Var.r;
        this.k = list;
        this.j = (byte) 2;
        objB = ((zfo) b8uVar.f2175a).b(this);
        if (objB != wneVar) {
            list2 = (List) objB;
            nrt nrtVar2 = wfs0Var.t;
            long j2 = Long.parseLong(wfs0Var.p);
            this.k = list;
            this.l = list2;
            this.j = (byte) 3;
            serializableA = nrt.a(nrtVar2, j2, this);
            if (serializableA != wneVar) {
                list3 = list;
                list4 = list2;
                obj = serializableA;
                ql5Var = (ql5) obj;
                int i2 = wfs0.A;
                p7m0Var = wfs0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, ifs0.a((ifs0) value, false, null, ql5Var, false, list3, list4, null, 311)));
                return Unit.f46060a;
            }
        }
        return wneVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c4, code lost:
    
        if (r1.i("", r16) == r11) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object I(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kpb0.I(java.lang.Object):java.lang.Object");
    }

    private final Object J(Object obj) {
        Object objD0;
        og00 og00Var = (og00) this.l;
        nqv0 nqv0Var = (nqv0) this.k;
        ppv0 ppv0Var = nqv0Var.f23975a;
        Object obj2 = wne.f39444a;
        byte b = this.j;
        if (b == 0) {
            z1x.P(obj);
            Context context = nqv0Var.b;
            wov0 wov0Var = (wov0) this.m;
            fpv0 fpv0Var = nqv0Var.d;
            this.j = (byte) 1;
            String str = vov0.f37784a;
            if (!ppv0Var.q || Build.VERSION.SDK_INT >= 31) {
                objD0 = Unit.f46060a;
            } else {
                vox voxVar = fpv0Var.e;
                voxVar.getClass();
                objD0 = qjj.d0(obb.Y(voxVar), new pnd0(og00Var, ppv0Var, wov0Var, context, null, (byte) 22), this);
                if (objD0 != obj2) {
                    objD0 = Unit.f46060a;
                }
            }
            if (objD0 != obj2) {
            }
        }
        if (b != 1) {
            if (b == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        String str2 = oqv0.f25709a;
        wv00.f().a(str2, "Starting work for " + ppv0Var.c);
        wu9 wu9VarB = og00Var.b();
        this.j = (byte) 2;
        Object objA = oqv0.a(wu9VarB, og00Var, this);
        return objA == obj2 ? obj2 : objA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (r0.c(r1, r7) == r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (a.qjj.d0(r1, r3, r7) == r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object l(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.m
            a.gmq r0 = (a.gmq) r0
            java.lang.Object r1 = r7.l
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
            a.wne r2 = a.wne.f39444a
            byte r3 = r7.j
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L20
            if (r3 == r6) goto L1c
            if (r3 != r5) goto L16
            goto L1c
        L16:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r4
        L1c:
            a.z1x.P(r8)
            goto L4b
        L20:
            a.z1x.P(r8)
            java.lang.Object r8 = r7.k
            a.gzb0 r8 = (a.gzb0) r8
            kotlin.coroutines.g r3 = kotlin.coroutines.g.f46065a
            boolean r3 = kotlin.jvm.internal.Intrinsics.d(r1, r3)
            if (r3 == 0) goto L3d
            a.mmq r1 = new a.mmq
            r1.<init>(r8, r5)
            r7.j = r6
            java.lang.Object r7 = r0.c(r1, r7)
            if (r7 != r2) goto L4b
            goto L4a
        L3d:
            a.nmq r3 = new a.nmq
            r3.<init>(r0, r8, r4, r6)
            r7.j = r5
            java.lang.Object r7 = a.qjj.d0(r1, r3, r7)
            if (r7 != r2) goto L4b
        L4a:
            return r2
        L4b:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kpb0.l(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (a.qcc.O(1000, r10) == r2) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.k
            a.cjk0 r0 = (a.cjk0) r0
            a.p7m0 r1 = r0.n
            a.wne r2 = a.wne.f39444a
            byte r3 = r10.j
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L21
            if (r3 == r5) goto L1d
            if (r3 != r4) goto L17
            a.z1x.P(r11)
            goto L67
        L17:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r10)
            return r6
        L1d:
            a.z1x.P(r11)
            goto L48
        L21:
            a.z1x.P(r11)
            a.yk50 r11 = r0.c
            java.lang.Object r3 = r10.l
            a.su4 r3 = (a.su4) r3
            java.lang.Object r7 = r10.m
            a.ghk0 r7 = (a.ghk0) r7
            int r7 = r7.f11305a
            a.v8d r8 = r0.k
            r9 = 13
            if (r7 != r9) goto L39
            java.lang.String r7 = r8.m
            goto L3b
        L39:
            java.lang.String r7 = r8.k
        L3b:
            r10.j = r5
            java.lang.Object r11 = r11.b
            a.fuj0 r11 = (a.fuj0) r11
            java.lang.Object r11 = r11.i(r3, r7, r10)
            if (r11 != r2) goto L48
            goto L66
        L48:
            a.pt r11 = (a.pt) r11
            boolean r3 = r11.f27538a
            if (r3 != 0) goto L5c
            a.xik0 r10 = new a.xik0
            java.lang.String r11 = r11.b
            r10.<init>(r11)
            r1.getClass()
            r1.o(r6, r10)
            goto L72
        L5c:
            r10.j = r4
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r10 = a.qcc.O(r3, r10)
            if (r10 != r2) goto L67
        L66:
            return r2
        L67:
            r0.x()
            r1.getClass()
            a.yik0 r10 = a.yik0.f42696a
            r1.o(r6, r10)
        L72:
            a.p7m0 r10 = r0.m
        L74:
            java.lang.Object r11 = r10.getValue()
            r0 = r11
            a.pik0 r0 = (a.pik0) r0
            a.nik0 r0 = new a.nik0
            r1 = 0
            r0.<init>(r1)
            boolean r11 = r10.m(r11, r0)
            if (r11 == 0) goto L74
            kotlin.Unit r10 = kotlin.Unit.f46060a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kpb0.m(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
    
        if (r6.c(r0, r5) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r6.w(r0, r5) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.m
            a.npn r0 = (a.npn) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r5.j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1c
            if (r2 == r4) goto L18
            if (r2 != r3) goto L11
            goto L18
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L18:
            a.z1x.P(r6)
            goto L41
        L1c:
            a.z1x.P(r6)
            java.lang.Object r6 = r5.k
            a.kxv r6 = (a.kxv) r6
            boolean r6 = r6.j
            java.lang.Object r2 = r5.l
            a.zco0 r2 = (a.zco0) r2
            if (r6 == 0) goto L36
            a.nv20 r6 = r2.b0
            r5.j = r4
            java.lang.Object r5 = r6.c(r0, r5)
            if (r5 != r1) goto L41
            goto L40
        L36:
            a.fvt0 r6 = r2.a0
            r5.j = r3
            java.lang.Object r5 = r6.w(r0, r5)
            if (r5 != r1) goto L41
        L40:
            return r1
        L41:
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kpb0.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r6.invoke(r1, r5) == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r6) {
        /*
            r5 = this;
            a.wne r0 = a.wne.f39444a
            byte r1 = r5.j
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L17
            if (r1 != r3) goto L11
            a.z1x.P(r6)
            goto L45
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            return r2
        L17:
            java.lang.Object r1 = r5.k
            a.vne r1 = (a.vne) r1
            a.z1x.P(r6)
            goto L36
        L1f:
            a.z1x.P(r6)
            java.lang.Object r6 = r5.k
            r1 = r6
            a.vne r1 = (a.vne) r1
            java.lang.Object r6 = r5.l
            a.bby r6 = (a.bby) r6
            r5.k = r1
            r5.j = r4
            java.lang.Object r6 = r6.join(r5)
            if (r6 != r0) goto L36
            goto L44
        L36:
            java.lang.Object r6 = r5.m
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r5.k = r2
            r5.j = r3
            java.lang.Object r5 = r6.invoke(r1, r5)
            if (r5 != r0) goto L45
        L44:
            return r0
        L45:
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kpb0.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r0.a(r7, r6) == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = r6.l
            a.kmq r0 = (a.kmq) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r6.j
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L23
            if (r2 == r4) goto L1b
            if (r2 != r3) goto L15
            a.z1x.P(r7)
            goto L4c
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r5
        L1b:
            java.lang.Object r0 = r6.k
            a.kmq r0 = (a.kmq) r0
            a.z1x.P(r7)
            goto L3f
        L23:
            a.z1x.P(r7)
            java.lang.Object r7 = r6.m
            a.urp0 r7 = (a.urp0) r7
            a.hnu r2 = r7.l
            int r7 = r7.d
            r6.l = r5
            r6.k = r0
            r6.j = r4
            java.lang.Object r2 = r2.f13365a
            a.iqp0 r2 = (a.iqp0) r2
            java.lang.Object r7 = r2.a(r7, r6)
            if (r7 != r1) goto L3f
            goto L4b
        L3f:
            r6.l = r5
            r6.k = r5
            r6.j = r3
            java.lang.Object r6 = r0.a(r7, r6)
            if (r6 != r1) goto L4c
        L4b:
            return r1
        L4c:
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kpb0.s(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        if (r8.invoke(r7) == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object t(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.Object r0 = r7.l
            a.j5q0 r0 = (a.j5q0) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r7.j
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L33
            if (r2 == r6) goto L2f
            if (r2 == r5) goto L29
            if (r2 == r4) goto L25
            if (r2 == r3) goto L1d
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            r7 = 0
            return r7
        L1d:
            java.lang.Object r7 = r7.k
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            a.z1x.P(r8)
            goto L70
        L25:
            a.z1x.P(r8)
            goto L5d
        L29:
            a.z1x.P(r8)     // Catch: java.lang.Throwable -> L2d
            goto L50
        L2d:
            r8 = move-exception
            goto L60
        L2f:
            a.z1x.P(r8)     // Catch: java.lang.Throwable -> L2d
            goto L43
        L33:
            a.z1x.P(r8)
            a.bu r8 = r0.r     // Catch: java.lang.Throwable -> L2d
            if (r8 == 0) goto L43
            r7.j = r6     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r8 = r8.invoke(r7)     // Catch: java.lang.Throwable -> L2d
            if (r8 != r1) goto L43
            goto L6e
        L43:
            java.lang.Object r8 = r7.m     // Catch: java.lang.Throwable -> L2d
            a.d5q0 r8 = (a.d5q0) r8     // Catch: java.lang.Throwable -> L2d
            r7.j = r5     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r8 = r8.a(r0, r7)     // Catch: java.lang.Throwable -> L2d
            if (r8 != r1) goto L50
            goto L6e
        L50:
            a.f7q0 r8 = r0.s
            if (r8 == 0) goto L5d
            r7.j = r4
            java.lang.Object r7 = r8.invoke(r7)
            if (r7 != r1) goto L5d
            goto L6e
        L5d:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        L60:
            a.f7q0 r0 = r0.s
            if (r0 == 0) goto L71
            r7.k = r8
            r7.j = r3
            java.lang.Object r7 = r0.invoke(r7)
            if (r7 != r1) goto L6f
        L6e:
            return r1
        L6f:
            r7 = r8
        L70:
            r8 = r7
        L71:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kpb0.t(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006e A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:7:0x0019, B:25:0x0068, B:27:0x006e, B:29:0x0074, B:31:0x0084, B:33:0x008a, B:35:0x009e, B:37:0x00a5, B:40:0x00b8, B:41:0x00bd, B:42:0x00be, B:43:0x00c3, B:44:0x00c4, B:45:0x00c9, B:46:0x00ca, B:47:0x00cf), top: B:59:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0074 A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:7:0x0019, B:25:0x0068, B:27:0x006e, B:29:0x0074, B:31:0x0084, B:33:0x008a, B:35:0x009e, B:37:0x00a5, B:40:0x00b8, B:41:0x00bd, B:42:0x00be, B:43:0x00c3, B:44:0x00c4, B:45:0x00c9, B:46:0x00ca, B:47:0x00cf), top: B:59:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0084 A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:7:0x0019, B:25:0x0068, B:27:0x006e, B:29:0x0074, B:31:0x0084, B:33:0x008a, B:35:0x009e, B:37:0x00a5, B:40:0x00b8, B:41:0x00bd, B:42:0x00be, B:43:0x00c3, B:44:0x00c4, B:45:0x00c9, B:46:0x00ca, B:47:0x00cf), top: B:59:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x008a A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:7:0x0019, B:25:0x0068, B:27:0x006e, B:29:0x0074, B:31:0x0084, B:33:0x008a, B:35:0x009e, B:37:0x00a5, B:40:0x00b8, B:41:0x00bd, B:42:0x00be, B:43:0x00c3, B:44:0x00c4, B:45:0x00c9, B:46:0x00ca, B:47:0x00cf), top: B:59:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x009e A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:7:0x0019, B:25:0x0068, B:27:0x006e, B:29:0x0074, B:31:0x0084, B:33:0x008a, B:35:0x009e, B:37:0x00a5, B:40:0x00b8, B:41:0x00bd, B:42:0x00be, B:43:0x00c3, B:44:0x00c4, B:45:0x00c9, B:46:0x00ca, B:47:0x00cf), top: B:59:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b8 A[Catch: all -> 0x001d, TRY_ENTER, TryCatch #2 {all -> 0x001d, blocks: (B:7:0x0019, B:25:0x0068, B:27:0x006e, B:29:0x0074, B:31:0x0084, B:33:0x008a, B:35:0x009e, B:37:0x00a5, B:40:0x00b8, B:41:0x00bd, B:42:0x00be, B:43:0x00c3, B:44:0x00c4, B:45:0x00c9, B:46:0x00ca, B:47:0x00cf), top: B:59:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00be A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:7:0x0019, B:25:0x0068, B:27:0x006e, B:29:0x0074, B:31:0x0084, B:33:0x008a, B:35:0x009e, B:37:0x00a5, B:40:0x00b8, B:41:0x00bd, B:42:0x00be, B:43:0x00c3, B:44:0x00c4, B:45:0x00c9, B:46:0x00ca, B:47:0x00cf), top: B:59:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c4 A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:7:0x0019, B:25:0x0068, B:27:0x006e, B:29:0x0074, B:31:0x0084, B:33:0x008a, B:35:0x009e, B:37:0x00a5, B:40:0x00b8, B:41:0x00bd, B:42:0x00be, B:43:0x00c3, B:44:0x00c4, B:45:0x00c9, B:46:0x00ca, B:47:0x00cf), top: B:59:0x0019 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ca A[Catch: all -> 0x001d, TryCatch #2 {all -> 0x001d, blocks: (B:7:0x0019, B:25:0x0068, B:27:0x006e, B:29:0x0074, B:31:0x0084, B:33:0x008a, B:35:0x009e, B:37:0x00a5, B:40:0x00b8, B:41:0x00bd, B:42:0x00be, B:43:0x00c3, B:44:0x00c4, B:45:0x00c9, B:46:0x00ca, B:47:0x00cf), top: B:59:0x0019 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x0074, please report this as an issue */
    private final Object x(Object obj) throws Throwable {
        jvq0 jvq0Var;
        i050 i050Var;
        i050 i050Var2;
        jvq0 jvq0Var2;
        fse0 fse0Var;
        String str;
        String str2;
        String str3;
        Long l;
        long jLongValue;
        wne wneVar = wne.f39444a;
        byte b = this.j;
        try {
            try {
                if (b == 0) {
                    z1x.P(obj);
                    jvq0Var = (jvq0) this.m;
                    i050Var = jvq0Var.d;
                    this.k = i050Var;
                    this.l = jvq0Var;
                    this.j = (byte) 1;
                    if (i050Var.d(this) != wneVar) {
                    }
                    return wneVar;
                }
                if (b != 1) {
                    if (b != 2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jvq0Var2 = (jvq0) this.l;
                    i050Var2 = (i050) this.k;
                    try {
                        z1x.P(obj);
                        fse0Var = (fse0) obj;
                        str = fse0Var.c;
                        if (str != null) {
                            throw new ff5(null);
                        }
                        if (str.length() != 0) {
                            throw new ff5(null);
                        }
                        str2 = "Bearer " + ((Object) str);
                        str3 = fse0Var.b;
                        if (str3 != null) {
                            throw new ff5(null);
                        }
                        if (str3.length() != 0) {
                            throw new ff5(null);
                        }
                        btt0 btt0Var = jvq0Var2.b;
                        vwb0 vwb0Var = btt0Var.f3200a;
                        btt0Var.b(str2);
                        vwb0Var.h("refresh_token", str3);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        l = fse0Var.f10060a;
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        vwb0Var.g("TOKEN_EXPIRE_TIME", timeUnit.toMillis(jLongValue) + jCurrentTimeMillis);
                        vwb0Var.g("TOKEN_REFRESH_TIME", jCurrentTimeMillis);
                        i050Var2.c(null);
                        return str2;
                    } catch (Throwable th) {
                        th = th;
                        i050Var2.c(null);
                        throw th;
                    }
                }
                jvq0 jvq0Var3 = (jvq0) this.l;
                i050 i050Var3 = (i050) this.k;
                z1x.P(obj);
                jvq0Var = jvq0Var3;
                i050Var = i050Var3;
                String strC = jvq0Var.b.f3200a.c("refresh_token", "");
                if (strC.length() == 0) {
                    throw new fpd0("REFRESH_TOKEN_EMPTY");
                }
                this.k = i050Var;
                this.l = jvq0Var;
                this.j = (byte) 2;
                Object objA = jvq0Var.a(strC, this);
                if (objA != wneVar) {
                    jvq0Var2 = jvq0Var;
                    obj = objA;
                    i050Var2 = i050Var;
                    fse0Var = (fse0) obj;
                    str = fse0Var.c;
                    if (str != null) {
                        throw new ff5(null);
                    }
                    if (str.length() != 0) {
                        throw new ff5(null);
                    }
                    str2 = "Bearer " + ((Object) str);
                    str3 = fse0Var.b;
                    if (str3 != null) {
                        throw new ff5(null);
                    }
                    if (str3.length() != 0) {
                        throw new ff5(null);
                    }
                    btt0 btt0Var2 = jvq0Var2.b;
                    vwb0 vwb0Var2 = btt0Var2.f3200a;
                    btt0Var2.b(str2);
                    vwb0Var2.h("refresh_token", str3);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    TimeUnit timeUnit2 = TimeUnit.SECONDS;
                    l = fse0Var.f10060a;
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    vwb0Var2.g("TOKEN_EXPIRE_TIME", timeUnit2.toMillis(jLongValue) + jCurrentTimeMillis2);
                    vwb0Var2.g("TOKEN_REFRESH_TIME", jCurrentTimeMillis2);
                    i050Var2.c(null);
                    return str2;
                }
                return wneVar;
            } catch (Throwable th2) {
                th = th2;
                i050Var2 = i050Var;
                i050Var2.c(null);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
    
        if (r0.f(r2, 0, r7) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
    
        if (r0.f(0, 0, r7) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006e, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object y(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.m
            a.xcz r0 = (a.xcz) r0
            a.wne r1 = a.wne.f39444a
            byte r2 = r7.j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1b
            if (r2 == r4) goto L10
            if (r2 != r3) goto L14
        L10:
            a.z1x.P(r8)
            goto L6f
        L14:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            r7 = 0
            return r7
        L1b:
            a.z1x.P(r8)
            java.lang.Object r8 = r7.l
            a.skb0 r8 = (a.skb0) r8
            r2 = -1
            if (r8 != 0) goto L27
            r8 = r2
            goto L2f
        L27:
            int[] r5 = a.kdr0.f18119a
            int r8 = r8.ordinal()
            r8 = r5[r8]
        L2f:
            r5 = 0
            if (r8 == r4) goto L64
            if (r8 == r3) goto L38
            r4 = 3
            if (r8 == r4) goto L38
            goto L6f
        L38:
            java.lang.Object r8 = r7.k
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r8 = r8.iterator()
            r4 = r5
        L41:
            boolean r6 = r8.hasNext()
            if (r6 == 0) goto L56
            java.lang.Object r6 = r8.next()
            a.p6t0 r6 = (a.p6t0) r6
            boolean r6 = r6 instanceof a.ecb0
            if (r6 == 0) goto L53
            r2 = r4
            goto L56
        L53:
            int r4 = r4 + 1
            goto L41
        L56:
            if (r2 >= 0) goto L59
            r2 = r5
        L59:
            r7.j = r3
            a.v0h0 r8 = a.xcz.y
            java.lang.Object r7 = r0.f(r2, r5, r7)
            if (r7 != r1) goto L6f
            goto L6e
        L64:
            r7.j = r4
            a.v0h0 r8 = a.xcz.y
            java.lang.Object r7 = r0.f(r5, r5, r7)
            if (r7 != r1) goto L6f
        L6e:
            return r1
        L6f:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kpb0.y(java.lang.Object):java.lang.Object");
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                return new kpb0((lpb0) obj2, yjeVar, (byte) 0);
            case 1:
                return new kpb0((orb0) obj2, yjeVar, (byte) 1);
            case 2:
                return new kpb0((ProphylaxisAlarmReceiver) this.k, (Application) this.l, (Context) obj2, yjeVar, (byte) 2);
            case 3:
                kpb0 kpb0Var = new kpb0(this.l, obj2, yjeVar, (byte) 3);
                kpb0Var.k = obj;
                return kpb0Var;
            case 4:
                return new kpb0((eze0) obj2, yjeVar, (byte) 4);
            case 5:
                kpb0 kpb0Var2 = new kpb0(this.l, obj2, yjeVar, (byte) 5);
                kpb0Var2.k = obj;
                return kpb0Var2;
            case 6:
                return new kpb0((x5f0) obj2, yjeVar, (byte) 6);
            case 7:
                return new kpb0((rv2) this.k, (xcz) this.l, (pkk0) obj2, yjeVar, (byte) 7);
            case 8:
                kpb0 kpb0Var3 = new kpb0(this.l, obj2, yjeVar, (byte) 8);
                kpb0Var3.k = obj;
                return kpb0Var3;
            case 9:
                return new kpb0((ocf0) obj2, yjeVar, (byte) 9);
            case 10:
                return new kpb0((wuf0) obj2, yjeVar, (byte) 10);
            case 11:
                return new kpb0((g1i0) obj2, yjeVar, (byte) 11);
            case 12:
                kpb0 kpb0Var4 = new kpb0((p1i0) obj2, yjeVar, (byte) 12);
                kpb0Var4.l = obj;
                return kpb0Var4;
            case 13:
                return new kpb0((xxj0) obj2, yjeVar, (byte) 13);
            case 14:
                kpb0 kpb0Var5 = new kpb0((xxj0) obj2, yjeVar, (byte) 14);
                kpb0Var5.l = obj;
                return kpb0Var5;
            case 15:
                kpb0 kpb0Var6 = new kpb0(this.l, obj2, yjeVar, (byte) 15);
                kpb0Var6.k = obj;
                return kpb0Var6;
            case 16:
                kpb0 kpb0Var7 = new kpb0(this.l, obj2, yjeVar, (byte) 16);
                kpb0Var7.k = obj;
                return kpb0Var7;
            case 17:
                return new kpb0((cjk0) this.k, (su4) this.l, (ghk0) obj2, yjeVar, (byte) 17);
            case 18:
                return new kpb0((kxv) this.k, (zco0) this.l, (npn) obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                kpb0 kpb0Var8 = new kpb0(this.l, obj2, yjeVar, (byte) 19);
                kpb0Var8.k = obj;
                return kpb0Var8;
            case 20:
                kpb0 kpb0Var9 = new kpb0((urp0) obj2, yjeVar, (byte) 20);
                kpb0Var9.l = obj;
                return kpb0Var9;
            case 21:
                return new kpb0(this.l, obj2, yjeVar, (byte) 21);
            case 22:
                return new kpb0((jvq0) obj2, yjeVar, (byte) 22);
            case 23:
                return new kpb0((skb0) this.l, (xcz) obj2, (List) this.k, yjeVar);
            case 24:
                kpb0 kpb0Var10 = new kpb0((ltr0) obj2, yjeVar, (byte) 24);
                kpb0Var10.l = obj;
                return kpb0Var10;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new kpb0((wfs0) obj2, yjeVar, (byte) 25);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                kpb0 kpb0Var11 = new kpb0((xqt0) obj2, yjeVar, (byte) 26);
                kpb0Var11.l = obj;
                return kpb0Var11;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new kpb0((nqv0) this.k, (og00) this.l, (wov0) obj2, yjeVar, (byte) 27);
            default:
                return new kpb0(this.l, obj2, yjeVar, (byte) 28);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((kpb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((kpb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((kpb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((kpb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((kpb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((kpb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((kpb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((kpb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((kpb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((kpb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((kpb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((kpb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((kpb0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((kpb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((kpb0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((kpb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((kpb0) create((gzb0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((kpb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((kpb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((kpb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((kpb0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((kpb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((kpb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((kpb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((kpb0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((kpb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((kpb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((kpb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((kpb0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:153:0x0309  */
    /* JADX WARN: Code duplicated, block: B:154:0x030c  */
    /* JADX WARN: Code duplicated, block: B:263:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:332:0x0735  */
    /* JADX WARN: Code duplicated, block: B:383:0x0865  */
    /* JADX WARN: Code duplicated, block: B:459:0x0a07  */
    /* JADX WARN: Code duplicated, block: B:487:0x0a97  */
    /* JADX WARN: Code duplicated, block: B:522:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:559:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01e4, code lost:
    
        if (r1 == r2) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x025e, code lost:
    
        if (r0.a(r3, r40) == r2) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if (r2.e.m(r40, r3) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x048f, code lost:
    
        if (kotlin.Unit.f46060a == r2) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0537, code lost:
    
        if (a.qjj.d0(r3, r4, r40) == r2) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0593, code lost:
    
        if (r0 == r3) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x05fe, code lost:
    
        if (r1.f(0, 0, r40) == r0) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x06af, code lost:
    
        if (a.qjj.d0(r3, r4, r40) == r2) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x070d, code lost:
    
        if (r0 == r3) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x07e1, code lost:
    
        if (a.qjj.d0(r3, r4, r40) == r2) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x083d, code lost:
    
        if (r0 == r3) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x092d, code lost:
    
        if (r0 == r3) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x0a14, code lost:
    
        if (r0.a(r1, r40) == r6) goto L462;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0115, code lost:
    
        if (r2.F(r4, r40) == r3) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0184, code lost:
    
        if (r0.a(r3, r40) == r2) goto L94;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kpb0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kpb0(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kpb0(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kpb0(Object obj, Object obj2, Object obj3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
    }
}
