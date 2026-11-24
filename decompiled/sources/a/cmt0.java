package a;

import com.google.android.gms.internal.p000firebaseauthapi.zzaia;
import com.google.android.gms.internal.p000firebaseauthapi.zzajg;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class cmt0 implements ngw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f4625a;
    public Object b;
    public Object c;

    public /* synthetic */ cmt0(Object obj, Object obj2, Object obj3) {
        this.f4625a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r7 == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(a.zje r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof a.amt0
            if (r0 == 0) goto L13
            r0 = r7
            a.amt0 r0 = (a.amt0) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.amt0 r0 = new a.amt0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            a.z1x.P(r7)
            goto L58
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            r6 = 0
            return r6
        L31:
            a.z1x.P(r7)
            goto L45
        L35:
            a.z1x.P(r7)
            java.lang.Object r7 = r6.b
            a.ahu r7 = (a.ahu) r7
            r0.k = r4
            java.io.Serializable r7 = a.ahu.c(r7, r0)
            if (r7 != r1) goto L45
            goto L57
        L45:
            a.ql5 r7 = (a.ql5) r7
            java.lang.Object r6 = r6.c
            a.m0u r6 = (a.m0u) r6
            long r4 = r7.e
            r0.k = r3
            a.xr r6 = r6.f20973a
            java.lang.Object r7 = r6.c(r4, r0)
            if (r7 != r1) goto L58
        L57:
            return r1
        L58:
            a.xuf r7 = (a.xuf) r7
            double r6 = r7.i
            java.lang.Double r0 = new java.lang.Double
            r0.<init>(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.cmt0.a(a.zje):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:84|30|(1:33)|71) */
    /* JADX WARN: Code duplicated, block: B:33:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:36:0x0110 A[Catch: all -> 0x009a, TryCatch #1 {all -> 0x009a, blocks: (B:34:0x0100, B:36:0x0110, B:39:0x011d, B:22:0x0095), top: B:86:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0119  */
    /* JADX WARN: Code duplicated, block: B:39:0x011d A[Catch: all -> 0x009a, TRY_LEAVE, TryCatch #1 {all -> 0x009a, blocks: (B:34:0x0100, B:36:0x0110, B:39:0x011d, B:22:0x0095), top: B:86:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x012e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0130 A[Catch: all -> 0x01be, TryCatch #2 {all -> 0x01be, blocks: (B:14:0x0043, B:40:0x011f, B:78:0x01b5, B:79:0x01bc, B:80:0x01bd, B:44:0x0128, B:47:0x0130, B:48:0x0139, B:52:0x0143, B:54:0x0147, B:60:0x0168, B:61:0x0171, B:63:0x0179, B:67:0x0181, B:69:0x0185, B:74:0x01a4, B:76:0x01ac, B:19:0x006d, B:27:0x00af), top: B:88:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0139 A[Catch: all -> 0x01be, TryCatch #2 {all -> 0x01be, blocks: (B:14:0x0043, B:40:0x011f, B:78:0x01b5, B:79:0x01bc, B:80:0x01bd, B:44:0x0128, B:47:0x0130, B:48:0x0139, B:52:0x0143, B:54:0x0147, B:60:0x0168, B:61:0x0171, B:63:0x0179, B:67:0x0181, B:69:0x0185, B:74:0x01a4, B:76:0x01ac, B:19:0x006d, B:27:0x00af), top: B:88:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0140  */
    /* JADX WARN: Code duplicated, block: B:51:0x0142  */
    /* JADX WARN: Code duplicated, block: B:54:0x0147 A[Catch: all -> 0x01be, TryCatch #2 {all -> 0x01be, blocks: (B:14:0x0043, B:40:0x011f, B:78:0x01b5, B:79:0x01bc, B:80:0x01bd, B:44:0x0128, B:47:0x0130, B:48:0x0139, B:52:0x0143, B:54:0x0147, B:60:0x0168, B:61:0x0171, B:63:0x0179, B:67:0x0181, B:69:0x0185, B:74:0x01a4, B:76:0x01ac, B:19:0x006d, B:27:0x00af), top: B:88:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0162  */
    /* JADX WARN: Code duplicated, block: B:57:0x0163  */
    /* JADX WARN: Code duplicated, block: B:60:0x0168 A[Catch: all -> 0x01be, TryCatch #2 {all -> 0x01be, blocks: (B:14:0x0043, B:40:0x011f, B:78:0x01b5, B:79:0x01bc, B:80:0x01bd, B:44:0x0128, B:47:0x0130, B:48:0x0139, B:52:0x0143, B:54:0x0147, B:60:0x0168, B:61:0x0171, B:63:0x0179, B:67:0x0181, B:69:0x0185, B:74:0x01a4, B:76:0x01ac, B:19:0x006d, B:27:0x00af), top: B:88:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0171 A[Catch: all -> 0x01be, TryCatch #2 {all -> 0x01be, blocks: (B:14:0x0043, B:40:0x011f, B:78:0x01b5, B:79:0x01bc, B:80:0x01bd, B:44:0x0128, B:47:0x0130, B:48:0x0139, B:52:0x0143, B:54:0x0147, B:60:0x0168, B:61:0x0171, B:63:0x0179, B:67:0x0181, B:69:0x0185, B:74:0x01a4, B:76:0x01ac, B:19:0x006d, B:27:0x00af), top: B:88:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0179 A[Catch: all -> 0x01be, TryCatch #2 {all -> 0x01be, blocks: (B:14:0x0043, B:40:0x011f, B:78:0x01b5, B:79:0x01bc, B:80:0x01bd, B:44:0x0128, B:47:0x0130, B:48:0x0139, B:52:0x0143, B:54:0x0147, B:60:0x0168, B:61:0x0171, B:63:0x0179, B:67:0x0181, B:69:0x0185, B:74:0x01a4, B:76:0x01ac, B:19:0x006d, B:27:0x00af), top: B:88:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x017e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0180  */
    /* JADX WARN: Code duplicated, block: B:69:0x0185 A[Catch: all -> 0x01be, TryCatch #2 {all -> 0x01be, blocks: (B:14:0x0043, B:40:0x011f, B:78:0x01b5, B:79:0x01bc, B:80:0x01bd, B:44:0x0128, B:47:0x0130, B:48:0x0139, B:52:0x0143, B:54:0x0147, B:60:0x0168, B:61:0x0171, B:63:0x0179, B:67:0x0181, B:69:0x0185, B:74:0x01a4, B:76:0x01ac, B:19:0x006d, B:27:0x00af), top: B:88:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01a4 A[Catch: all -> 0x01be, TryCatch #2 {all -> 0x01be, blocks: (B:14:0x0043, B:40:0x011f, B:78:0x01b5, B:79:0x01bc, B:80:0x01bd, B:44:0x0128, B:47:0x0130, B:48:0x0139, B:52:0x0143, B:54:0x0147, B:60:0x0168, B:61:0x0171, B:63:0x0179, B:67:0x0181, B:69:0x0185, B:74:0x01a4, B:76:0x01ac, B:19:0x006d, B:27:0x00af), top: B:88:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ac A[Catch: all -> 0x01be, TryCatch #2 {all -> 0x01be, blocks: (B:14:0x0043, B:40:0x011f, B:78:0x01b5, B:79:0x01bc, B:80:0x01bd, B:44:0x0128, B:47:0x0130, B:48:0x0139, B:52:0x0143, B:54:0x0147, B:60:0x0168, B:61:0x0171, B:63:0x0179, B:67:0x0181, B:69:0x0185, B:74:0x01a4, B:76:0x01ac, B:19:0x006d, B:27:0x00af), top: B:88:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b5 A[Catch: all -> 0x01be, TryCatch #2 {all -> 0x01be, blocks: (B:14:0x0043, B:40:0x011f, B:78:0x01b5, B:79:0x01bc, B:80:0x01bd, B:44:0x0128, B:47:0x0130, B:48:0x0139, B:52:0x0143, B:54:0x0147, B:60:0x0168, B:61:0x0171, B:63:0x0179, B:67:0x0181, B:69:0x0185, B:74:0x01a4, B:76:0x01ac, B:19:0x006d, B:27:0x00af), top: B:88:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01bd A[Catch: all -> 0x01be, TRY_LEAVE, TryCatch #2 {all -> 0x01be, blocks: (B:14:0x0043, B:40:0x011f, B:78:0x01b5, B:79:0x01bc, B:80:0x01bd, B:44:0x0128, B:47:0x0130, B:48:0x0139, B:52:0x0143, B:54:0x0147, B:60:0x0168, B:61:0x0171, B:63:0x0179, B:67:0x0181, B:69:0x0185, B:74:0x01a4, B:76:0x01ac, B:19:0x006d, B:27:0x00af), top: B:88:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0123, code lost:
    
        r15 = r10;
        r10 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0126, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0130 -> B:29:0x00c0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0164 -> B:59:0x0165). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x01ac -> B:73:0x01a2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable b(java.lang.String r20, a.zje r21) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.cmt0.b(java.lang.String, a.zje):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(double d, zje zjeVar) {
        bmt0 bmt0Var;
        if (zjeVar instanceof bmt0) {
            bmt0Var = (bmt0) zjeVar;
            int i = bmt0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                bmt0Var.l = i - Integer.MIN_VALUE;
            } else {
                bmt0Var = new bmt0(this, zjeVar);
            }
        } else {
            bmt0Var = new bmt0(this, zjeVar);
        }
        Object objA = bmt0Var.j;
        Object obj = wne.f39444a;
        int i2 = bmt0Var.l;
        if (i2 == 0) {
            z1x.P(objA);
            bmt0Var.i = d;
            bmt0Var.l = 1;
            objA = a(bmt0Var);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d = bmt0Var.i;
            z1x.P(objA);
        }
        double dDoubleValue = ((Number) objA).doubleValue();
        if (d < dDoubleValue) {
            d = dDoubleValue;
        }
        ((fnd0) ((wpu) this.f4625a).f39559a.f24619a).f9831a.h("sum_string", String.valueOf(d));
        return Unit.f46060a;
    }

    public krw0 d() throws GeneralSecurityException {
        rkt0 rkt0Var;
        icw0 icw0VarB;
        mrw0 mrw0Var = (mrw0) this.f4625a;
        if (mrw0Var == null || (rkt0Var = (rkt0) this.b) == null) {
            hny.o("Cannot build without parameters and/or key material");
            return null;
        }
        if (mrw0Var.f22292a != ((icw0) rkt0Var.b).f14556a.length) {
            hny.o("Key size mismatch");
            return null;
        }
        if (mrw0Var.a() && ((Integer) this.c) == null) {
            hny.o("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (!((mrw0) this.f4625a).a() && ((Integer) this.c) != null) {
            hny.o("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        p50 p50Var = ((mrw0) this.f4625a).d;
        if (p50Var == p50.k) {
            icw0VarB = q6x0.f28222a;
        } else if (p50Var == p50.j) {
            icw0VarB = q6x0.a(((Integer) this.c).intValue());
        } else {
            if (p50Var != p50.i) {
                jf4.n("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(p50Var)));
                return null;
            }
            icw0VarB = q6x0.b(((Integer) this.c).intValue());
        }
        return new krw0((mrw0) this.f4625a, (rkt0) this.b, icw0VarB, (Integer) this.c);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00da  */
    /* JADX WARN: Code duplicated, block: B:57:0x004d A[EDGE_INSN: B:57:0x004d->B:55:0x004d BREAK  A[LOOP:1: B:25:0x006f->B:60:?], SYNTHETIC] */
    public void e(qdw0 qdw0Var, Set set, String str) {
        h5x0[] h5x0VarArr;
        if (!set.isEmpty() && !((AtomicBoolean) this.f4625a).getAndSet(true)) {
            if (gnw0.b == null) {
                synchronized (gnw0.class) {
                    try {
                        if (gnw0.b == null) {
                            gnw0.b = new gnw0((byte) 0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            gnw0.b.f11606a.add(0, new epw0((byte) 29));
        }
        final byte[] bArrM = qdw0Var.m();
        ((ConcurrentHashMap) this.b).compute(str, new BiFunction() { // from class: a.f5x0
            @Override // java.util.function.BiFunction
            public final /* synthetic */ Object apply(Object obj, Object obj2) {
                byte[] bArr = (byte[]) obj2;
                byte[] bArr2 = bArrM;
                return Arrays.equals(bArr, bArr2) ? bArr : bArr2;
            }
        });
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AtomicReference atomicReference = (AtomicReference) ((ConcurrentHashMap) this.c).putIfAbsent((String) it.next(), new AtomicReference(new h5x0(str, bArrM)));
            if (atomicReference != null) {
                while (true) {
                    Object obj = atomicReference.get();
                    if (obj instanceof h5x0) {
                        h5x0 h5x0Var = (h5x0) obj;
                        if (str.equals(h5x0Var.f12503a)) {
                            h5x0Var.a(bArrM);
                            break;
                        }
                        h5x0 h5x0Var2 = new h5x0(str, bArrM);
                        h5x0VarArr = str.compareTo(h5x0Var.f12503a) < 0 ? new h5x0[]{h5x0Var2, h5x0Var} : new h5x0[]{h5x0Var, h5x0Var2};
                        do {
                            if (atomicReference.compareAndSet(obj, h5x0VarArr)) {
                                break;
                            }
                        } while (atomicReference.get() == obj);
                    } else {
                        h5x0[] h5x0VarArr2 = (h5x0[]) obj;
                        int iBinarySearch = Arrays.binarySearch(h5x0VarArr2, str);
                        if (iBinarySearch >= 0) {
                            h5x0VarArr2[iBinarySearch].a(bArrM);
                            break;
                        }
                        int i = ~iBinarySearch;
                        int length = h5x0VarArr2.length;
                        int i2 = length + 1;
                        int i3 = length - i;
                        if (i3 == 0) {
                            h5x0VarArr = (h5x0[]) Arrays.copyOf(h5x0VarArr2, i2);
                        } else {
                            h5x0[] h5x0VarArr3 = new h5x0[i2];
                            System.arraycopy(h5x0VarArr2, 0, h5x0VarArr3, 0, i);
                            System.arraycopy(h5x0VarArr2, i, h5x0VarArr3, i + 1, i3);
                            h5x0VarArr = h5x0VarArr3;
                        }
                        h5x0VarArr[i] = new h5x0(str, bArrM);
                        do {
                            if (atomicReference.compareAndSet(obj, h5x0VarArr)) {
                                break;
                                break;
                            }
                        } while (atomicReference.get() == obj);
                    }
                }
            }
        }
    }

    public void f(vgx0 vgx0Var, Object obj, whx0 whx0Var) {
        bix0 bix0Var = (bix0) ((HashMap) this.f4625a).get(vgx0Var);
        if (bix0Var == null) {
            if (!vgx0Var.d || ((adw0) adw0.b.get()).f701a <= 20) {
                vgx0Var.b(obj, whx0Var);
                return;
            } else {
                whx0Var.a(obj, vgx0Var.f37405a);
                return;
            }
        }
        switch (bix0Var.f2678a) {
            case 0:
                break;
            default:
                if (vgx0Var.d && ((adw0) adw0.b.get()).f701a > 20) {
                    whx0Var.a(obj, vgx0Var.f37405a);
                } else {
                    vgx0Var.b(obj, whx0Var);
                }
                break;
        }
    }

    public void g(vgx0 vgx0Var, Iterator it, whx0 whx0Var) {
        dix0 dix0Var = (dix0) ((HashMap) this.b).get(vgx0Var);
        if (dix0Var != null) {
            dix0Var.a(vgx0Var, it, whx0Var);
            return;
        }
        dix0 dix0Var2 = (dix0) this.c;
        if (dix0Var2 != null && !((HashMap) this.f4625a).containsKey(vgx0Var)) {
            dix0Var2.a(vgx0Var, it, whx0Var);
        } else {
            while (it.hasNext()) {
                f(vgx0Var, it.next(), whx0Var);
            }
        }
    }

    @Override // a.ngw0
    public void h(xfw0 xfw0Var) {
        zzajg zzajgVar = (zzajg) this.f4625a;
        zzajgVar.o = true;
        String str = ((zzaia) xfw0Var).b;
        s0x.E(str);
        zzajgVar.b = str;
        ywq0 ywq0Var = (ywq0) ((nmt0) this.c).f23789a;
        hcp0 hcp0Var = (hcp0) this.b;
        l8w0 l8w0Var = new l8w0();
        l8w0Var.f19624a = hcp0Var;
        l8w0Var.b = this;
        l8w0Var.c = this;
        rfw0 rfw0Var = (rfw0) ywq0Var.f43384a;
        hhm0.G(rfw0Var.M("/verifyAssertion", (String) ywq0Var.f), zzajgVar, l8w0Var, new ljw0(), (fht0) rfw0Var.b);
    }

    @Override // a.ngw0
    /* JADX INFO: renamed from: zza */
    public void mo2zza(String str) {
        ((hcp0) this.b).a(msm0.v(str));
    }
}
