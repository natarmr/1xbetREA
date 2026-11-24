package a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.util.AndroidRuntimeException;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.recyclerview.widget.RecyclerView;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.RandomAccessFile;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class otp0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public otp0(k3t0 k3t0Var, pwu0 pwu0Var, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 10;
        lkz lkzVar = lkz.f20223a;
        this.j = k3t0Var;
        this.l = pwu0Var;
        this.k = pz40Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (a.bww.x(r5, r6, a.ro4.g0(0.0f, 0.0f, null, 7), r0) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        if (a.bww.T(r5, r6, r0) == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(a.xcz r5, a.ncz r6, boolean r7, a.zje r8) {
        /*
            boolean r0 = r8 instanceof a.thq0
            if (r0 == 0) goto L13
            r0 = r8
            a.thq0 r0 = (a.thq0) r0
            int r1 = r0.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.j = r1
            goto L18
        L13:
            a.thq0 r0 = new a.thq0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.j
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L35
            if (r2 == r3) goto L31
            if (r2 != r4) goto L2a
            a.z1x.P(r8)
            goto L63
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L31:
            a.z1x.P(r8)
            goto L57
        L35:
            a.z1x.P(r8)
            if (r6 != 0) goto L3d
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        L3d:
            a.mcz r8 = r5.j()
            int r8 = r8.n
            int r8 = r8 / r4
            int r2 = r6.p
            int r6 = r6.q
            int r6 = r6 / r4
            int r6 = r6 + r2
            int r6 = r6 - r8
            float r6 = (float) r6
            if (r7 == 0) goto L5a
            r0.j = r3
            java.lang.Object r5 = a.bww.y(r5, r6, r0)
            if (r5 != r1) goto L57
            goto L62
        L57:
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        L5a:
            r0.j = r4
            java.lang.Object r5 = a.bww.T(r5, r6, r0)
            if (r5 != r1) goto L63
        L62:
            return r1
        L63:
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.otp0.l(a.xcz, a.ncz, boolean, a.zje):java.lang.Object");
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        Object obj3 = this.l;
        switch (b) {
            case 0:
                otp0 otp0Var = new otp0(obj3, obj2, yjeVar, (byte) 0);
                otp0Var.j = obj;
                return otp0Var;
            case 1:
                otp0 otp0Var2 = new otp0(obj3, obj2, yjeVar, (byte) 1);
                otp0Var2.j = obj;
                return otp0Var2;
            case 2:
                return new otp0((a4x) this.j, (vne) obj3, (xcz) obj2, yjeVar, (byte) 2);
            case 3:
                otp0 otp0Var3 = new otp0(obj3, obj2, yjeVar, (byte) 3);
                otp0Var3.j = obj;
                return otp0Var3;
            case 4:
                otp0 otp0Var4 = new otp0(obj3, obj2, yjeVar, (byte) 4);
                otp0Var4.j = obj;
                return otp0Var4;
            case 5:
                return new otp0((a4x) this.j, (List) obj3, (cgk0) obj2, yjeVar, (byte) 5);
            case 6:
                otp0 otp0Var5 = new otp0(obj3, obj2, yjeVar, (byte) 6);
                otp0Var5.j = obj;
                return otp0Var5;
            case 7:
                otp0 otp0Var6 = new otp0(obj3, obj2, yjeVar, (byte) 7);
                otp0Var6.j = obj;
                return otp0Var6;
            case 8:
                return new otp0((y3v) this.j, (File) obj3, (hc5) obj2, yjeVar, (byte) 8);
            case 9:
                return new otp0((pz40) this.j, (d930) obj3, (jpu0) obj2, yjeVar, (byte) 9);
            case 10:
                lkz lkzVar = lkz.f20223a;
                return new otp0((k3t0) this.j, (pwu0) obj3, (pz40) obj2, yjeVar);
            case 11:
                lkz lkzVar2 = lkz.f20223a;
                return new otp0((k3t0) this.j, (ywu0) obj3, (pz40) obj2, yjeVar);
            default:
                otp0 otp0Var7 = new otp0(obj3, obj2, yjeVar, (byte) 12);
                otp0Var7.j = obj;
                return otp0Var7;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((otp0) create((hdm0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((otp0) create((hdm0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((otp0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((otp0) create((hdm0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((otp0) create((hdm0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((otp0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((otp0) create((hzb0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((otp0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((otp0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((otp0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((otp0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((otp0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((otp0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        Object value;
        Object g0g0Var;
        Iterable iterable;
        Network activeNetwork;
        ConnectivityManager connectivityManager;
        LinkProperties linkProperties;
        Object g0g0Var2;
        byte b = this.i;
        byte b2 = 4;
        int i = 2;
        int i2 = 0;
        byte b3 = 3;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        Object obj2 = this.k;
        Object obj3 = this.l;
        switch (b) {
            case 0:
                rtp0 rtp0Var = (rtp0) obj3;
                hdm0 hdm0Var = (hdm0) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean z7 = hdm0Var instanceof gdm0;
                if (z7 && !(((gdm0) hdm0Var).b.a() instanceof znm0) && rtp0Var.M == null) {
                    rtp0Var.M = sac.f0(jiu0.a(rtp0Var), 30L, TimeUnit.SECONDS, null, null, new ltp0(rtp0Var, z ? 1 : 0, b3), 44);
                }
                if (z7) {
                    boolean z8 = ((gdm0) hdm0Var).b.a() instanceof znm0;
                    nc5 nc5VarS = rtp0Var.q.s(rtp0Var.E, rtp0Var.F, rtp0Var.r.a(), 0L);
                    eme emeVar = (eme) obj2;
                    p7m0 p7m0Var = rtp0Var.i.f25029a;
                    while (true) {
                        Object value2 = p7m0Var.getValue();
                        value2.getClass();
                        boolean z9 = z8;
                        if (!p7m0Var.m(value2, gsp0.a((gsp0) value2, emeVar, (gdm0) hdm0Var, nc5VarS, null, false, false, false, z9, 120))) {
                            z8 = z9;
                        }
                    }
                }
                return Unit.f46060a;
            case 1:
                d4q0 d4q0Var = (d4q0) obj3;
                hdm0 hdm0Var2 = (hdm0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                boolean z10 = hdm0Var2 instanceof gdm0;
                if (z10 && !(((gdm0) hdm0Var2).b.a() instanceof znm0)) {
                    sac.f0(jiu0.a(d4q0Var), 30L, TimeUnit.SECONDS, null, null, new x3q0(d4q0Var, z2 ? 1 : 0, b3), 44);
                }
                if (z10) {
                    zdm0 zdm0VarX = aem0.x(hdm0Var2, (eme) obj2, d4q0Var.q);
                    p7m0 p7m0Var2 = d4q0Var.i.f25029a;
                    do {
                        value = p7m0Var2.getValue();
                        value.getClass();
                    } while (!p7m0Var2.m(value, s3q0.a((s3q0) value, ((gdm0) hdm0Var2).b.a() instanceof znm0, false, false, 0, null, zdm0VarX, null, 94)));
                    d4q0Var.M(false);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                Iterator it = ((a4x) this.j).iterator();
                int i3 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                    } else if (!((chq0) it.next()).a()) {
                        i3++;
                    }
                }
                qjj.W((vne) obj3, null, null, new jcc((xcz) obj2, i3 < 0 ? 0 : i3, z3 ? 1 : 0, (byte) 2), 3);
                return Unit.f46060a;
            case 3:
                ecr0 ecr0Var = (ecr0) obj3;
                hdm0 hdm0Var3 = (hdm0) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                boolean z11 = hdm0Var3 instanceof gdm0;
                if (z11 && !(((gdm0) hdm0Var3).b.a() instanceof znm0) && ecr0Var.D == null) {
                    ecr0Var.D = sac.f0(jiu0.a(ecr0Var), 30L, TimeUnit.SECONDS, null, null, new ybr0(ecr0Var, z4 ? 1 : 0, b2), 44);
                }
                if (z11) {
                    boolean z12 = ((gdm0) hdm0Var3).b.a() instanceof znm0;
                    nc5 nc5VarS2 = ecr0Var.x.s(ecr0Var.o, ecr0Var.p, ecr0Var.t.a(), 0L);
                    eme emeVar2 = (eme) obj2;
                    p7m0 p7m0Var3 = ecr0Var.i.f25029a;
                    while (true) {
                        Object value3 = p7m0Var3.getValue();
                        value3.getClass();
                        boolean z13 = z12;
                        if (!p7m0Var3.m(value3, tbr0.a((tbr0) value3, emeVar2, (gdm0) hdm0Var3, nc5VarS2, false, false, z13, null, 88))) {
                            z12 = z13;
                        }
                    }
                }
                return Unit.f46060a;
            case 4:
                scr0 scr0Var = (scr0) obj3;
                hdm0 hdm0Var4 = (hdm0) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                boolean z14 = hdm0Var4 instanceof gdm0;
                if (z14 && !(((gdm0) hdm0Var4).b.a() instanceof znm0) && scr0Var.D == null) {
                    scr0Var.D = sac.f0(jiu0.a(scr0Var), 30L, TimeUnit.SECONDS, null, null, new mcr0(scr0Var, z5 ? 1 : 0, b2), 44);
                }
                if (z14) {
                    boolean z15 = ((gdm0) hdm0Var4).b.a() instanceof znm0;
                    nc5 nc5VarS3 = scr0Var.x.s(scr0Var.o, scr0Var.p, scr0Var.t.a(), 0L);
                    eme emeVar3 = (eme) obj2;
                    p7m0 p7m0Var4 = scr0Var.i.f25029a;
                    while (true) {
                        Object value4 = p7m0Var4.getValue();
                        value4.getClass();
                        boolean z16 = z15;
                        if (!p7m0Var4.m(value4, gcr0.a((gcr0) value4, emeVar3, (gdm0) hdm0Var4, nc5VarS3, false, false, false, z16, null, 184))) {
                            z15 = z16;
                        }
                    }
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                a4x a4xVar = (a4x) this.j;
                cgk0 cgk0Var = (cgk0) obj2;
                if (a4xVar.size() > cgk0Var.l()) {
                    for (pz40 pz40Var : CollectionsKt.O((List) obj3, cgk0Var.l())) {
                        g43 g43Var = (g43) pz40Var.getValue();
                        pz40Var.setValue(new g43(1.0f, g43Var.b, g43Var.c));
                    }
                }
                cgk0Var.m(a4xVar.size());
                return Unit.f46060a;
            case 6:
                String[] strArr = (String[]) obj2;
                hzb0 hzb0Var = (hzb0) this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                Set set = pxs0.j;
                pxs0 pxs0Var = (pxs0) obj3;
                nk50 nk50Var = pxs0Var.e;
                jzk jzkVar = pxs0Var.b;
                azk azkVar = pxs0Var.f27769a;
                n0o0 n0o0Var = ((qf3) pxs0Var.f).f28609a.e;
                try {
                    e0g0 e0g0Var = j0g0.b;
                    ConnectivityManager connectivityManager2 = (ConnectivityManager) n0o0Var.getValue();
                    if (connectivityManager2 == null || (activeNetwork = connectivityManager2.getActiveNetwork()) == null || (connectivityManager = (ConnectivityManager) n0o0Var.getValue()) == null || (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) == null) {
                        iterable = xun.f41520a;
                    } else {
                        List<InetAddress> dnsServers = linkProperties.getDnsServers();
                        dnsServers.getClass();
                        ArrayList arrayList = new ArrayList();
                        Iterator<T> it2 = dnsServers.iterator();
                        while (it2.hasNext()) {
                            String hostAddress = ((InetAddress) it2.next()).getHostAddress();
                            if (hostAddress != null) {
                                arrayList.add(hostAddress);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj4 : arrayList) {
                            if (((String) obj4).length() > 0) {
                                arrayList2.add(obj4);
                            }
                        }
                        g0g0Var = CollectionsKt.P0(arrayList2);
                        xun xunVar = xun.f41520a;
                        e0g0 e0g0Var2 = j0g0.b;
                        boolean z17 = g0g0Var instanceof g0g0;
                        Object obj5 = g0g0Var;
                        if (z17) {
                            obj5 = xunVar;
                        }
                        iterable = (Set) obj5;
                    }
                } catch (Throwable th) {
                    e0g0 e0g0Var3 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                LinkedHashSet<String> linkedHashSetG = eui0.g(set, iterable);
                String[] strArr2 = {"https://dns.google.com/resolve?type=16", "https://cloudflare-dns.com/dns-query?ct=application/dns-json&type=TXT"};
                ArrayList arrayList3 = new ArrayList();
                for (String str : linkedHashSetG) {
                    ArrayList arrayList4 = new ArrayList(strArr.length);
                    int i4 = 0;
                    for (int length = strArr.length; i4 < length; length = length) {
                        int i5 = i4;
                        arrayList4.add(new qxs0(strArr[i5], str, azkVar, jzkVar, nk50Var));
                        i4 = i5 + 1;
                    }
                    w3d.u(arrayList3, arrayList4);
                }
                ArrayList arrayList5 = new ArrayList();
                int i6 = 0;
                while (i6 < i) {
                    String str2 = strArr2[i6];
                    ArrayList arrayList6 = new ArrayList(strArr.length);
                    for (int length2 = strArr.length; i2 < length2; length2 = length2) {
                        ArrayList arrayList7 = arrayList6;
                        nk50 nk50Var2 = nk50Var;
                        azk azkVar2 = azkVar;
                        jzk jzkVar2 = jzkVar;
                        qtw qtwVar = new qtw(str2, strArr[i2], jzkVar2, pxs0Var.c, azkVar2, nk50Var2);
                        jzkVar = jzkVar2;
                        azkVar = azkVar2;
                        nk50Var = nk50Var2;
                        arrayList7.add(qtwVar);
                        i2++;
                        arrayList6 = arrayList7;
                    }
                    w3d.u(arrayList5, arrayList6);
                    i6++;
                    i = 2;
                    i2 = 0;
                }
                for (wyk wykVar : CollectionsKt.q0(arrayList3, arrayList5)) {
                    rwj rwjVar = tvk.f34603a;
                    qjj.W(hzb0Var, dvj.c, null, new wbl0(wykVar, hzb0Var, z6 ? 1 : 0, (byte) 14), 2);
                }
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                sd5 sd5Var = (sd5) obj3;
                if (sd5Var.f32015a.length() == 0) {
                    return Unit.f46060a;
                }
                ExoPlayer exoPlayer = (ExoPlayer) obj2;
                try {
                    e0g0 e0g0Var4 = j0g0.b;
                    ulo uloVar = (ulo) exoPlayer;
                    uloVar.N(MediaItem.a(sd5Var.f32015a));
                    uloVar.E();
                    break;
                } catch (Throwable unused) {
                    e0g0 e0g0Var5 = j0g0.b;
                }
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                nqd nqdVar = (nqd) ((y3v) this.j).c;
                File file = (File) obj3;
                hc5 hc5Var = (hc5) obj2;
                file.getClass();
                byte[] bArr = new byte[8192];
                long jV = aac.V(file);
                if (jV > 0) {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        randomAccessFile.seek(jV);
                        randomAccessFile.read(bArr, 0, 8192);
                        randomAccessFile.close();
                        nqdVar.b = true;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            bkb.E(randomAccessFile, th2);
                            throw th3;
                        }
                    }
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(hc5Var.f12803a, 8192);
                try {
                    nqdVar.e(file, bufferedInputStream, bArr);
                    bufferedInputStream.close();
                    return Unit.f46060a;
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        bkb.E(bufferedInputStream, th4);
                        throw th5;
                    }
                }
            case 9:
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                RecyclerView recyclerView = (RecyclerView) ((pz40) this.j).getValue();
                if (recyclerView != null) {
                    ((d930) obj3).b(((jpu0) obj2).f16919a, recyclerView);
                }
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                gmq gmqVarC = ((i3t0) ((k3t0) this.j)).C();
                lkz lkzVar = lkz.f20223a;
                fau0 fau0Var = new fau0(2, (Function1) ((pz40) obj2).getValue(), knx.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 2);
                clz clzVarW = aac.W((pwu0) obj3);
                qjj.W(x0x.Q(clzVarW.x()), null, null, new npu0((i89) gmqVarC, clzVarW, fau0Var, (yje) null, (byte) 0), 3);
                return Unit.f46060a;
            case 11:
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                gmq gmqVarC2 = ((i3t0) ((k3t0) this.j)).C();
                lkz lkzVar2 = lkz.f20223a;
                fau0 fau0Var2 = new fau0(2, (Function1) ((pz40) obj2).getValue(), knx.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 3);
                clz clzVarW2 = aac.W((ywu0) obj3);
                qjj.W(x0x.Q(clzVarW2.x()), null, null, new npu0((i89) gmqVarC2, clzVarW2, fau0Var2, (yje) null, (char) 0), 3);
                return Unit.f46060a;
            default:
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                c5v0 c5v0Var = (c5v0) obj3;
                WebView webView = c5v0Var.d;
                if (webView != null) {
                    return webView;
                }
                Context context = (Context) obj2;
                try {
                    e0g0 e0g0Var6 = j0g0.b;
                    WebView webView2 = new WebView(context, null);
                    WebView.setWebContentsDebuggingEnabled(c5v0Var.f3792a);
                    WebSettings settings = webView2.getSettings();
                    settings.setJavaScriptEnabled(true);
                    settings.setDomStorageEnabled(true);
                    settings.setLoadWithOverviewMode(true);
                    settings.setUseWideViewPort(true);
                    settings.setAllowFileAccess(true);
                    webView2.setInitialScale(1);
                    webView2.setLayerType(2, null);
                    webView2.setWebChromeClient(new WebChromeClient());
                    webView2.setWebViewClient(new yd70(c5v0Var.e));
                    webView2.addJavascriptInterface(new ga70(c5v0Var.e, c5v0Var.c), "GPWebAppBridge");
                    webView2.setOnKeyListener(new eb90(webView2, (byte) 1));
                    c5v0Var.d = webView2;
                    g0g0Var2 = webView2;
                    break;
                } catch (Throwable th6) {
                    e0g0 e0g0Var7 = j0g0.b;
                    g0g0Var2 = new g0g0(th6);
                }
                Throwable thA = j0g0.a(g0g0Var2);
                if (thA != null && (thA instanceof AndroidRuntimeException)) {
                    c5v0Var.e.invoke(x670.f40348a);
                }
                return (WebView) (g0g0Var2 instanceof g0g0 ? null : g0g0Var2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public otp0(k3t0 k3t0Var, ywu0 ywu0Var, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 11;
        lkz lkzVar = lkz.f20223a;
        this.j = k3t0Var;
        this.l = ywu0Var;
        this.k = pz40Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ otp0(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.k = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ otp0(Object obj, Object obj2, Object obj3, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = obj;
        this.l = obj2;
        this.k = obj3;
    }
}
