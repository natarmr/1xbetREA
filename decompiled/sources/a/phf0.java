package a;

import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class phf0 implements nae0, n1x {
    public static final byte[] d = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f26994a;
    public Object b;
    public Object c;

    public phf0(l4e l4eVar) {
        this.f26994a = new ArrayList();
        this.b = new q96();
        this.c = l4eVar;
    }

    public static void b(phf0 phf0Var, sgy sgyVar, ugd ugdVar) {
        mmn mmnVar = new mmn((byte) 4);
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        LinkedHashMap linkedHashMap = (LinkedHashMap) phf0Var.b;
        if (linkedHashMap.containsKey(sgyVar)) {
            c99.s(kng0.l("An `entry` with the same `clazz` has already been added: ", sgyVar.J(), Separators.DOT));
        } else {
            linkedHashMap.put(sgyVar, new xzn(sgyVar, mmnVar, new yzn((Map) lunVar, (byte) 0), ugdVar));
        }
    }

    public void a(sgy sgyVar, Function1 function1, Function1 function2, ugd ugdVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        if (linkedHashMap.containsKey(sgyVar)) {
            c99.s(kng0.l("An `entry` with the same `clazz` has already been added: ", sgyVar.J(), Separators.DOT));
        } else {
            linkedHashMap.put(sgyVar, new xzn(sgyVar, function1, function2, ugdVar));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(vjt0 vjt0Var, zje zjeVar) throws Throwable {
        hdp hdpVar;
        Object g0g0Var;
        Integer num;
        if (zjeVar instanceof hdp) {
            hdpVar = (hdp) zjeVar;
            int i = hdpVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                hdpVar.k = i - Integer.MIN_VALUE;
            } else {
                hdpVar = new hdp(this, zjeVar);
            }
        } else {
            hdpVar = new hdp(this, zjeVar);
        }
        Object obj = hdpVar.i;
        wne wneVar = wne.f39444a;
        int i2 = hdpVar.k;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                e0g0 e0g0Var = j0g0.b;
                uyn uynVar = (uyn) this.f26994a;
                String strA = ((btt0) this.c).a();
                hdpVar.k = 1;
                Object objC = ((kdp) ((wgn) uynVar.f36498a).invoke()).c(strA, vjt0Var, hdpVar);
                if (objC != wneVar) {
                    objC = Unit.f46060a;
                }
                if (objC == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
            }
            g0g0Var = Unit.f46060a;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA == null) {
            return Unit.f46060a;
        }
        if (!(thA instanceof zhi0)) {
            throw thA;
        }
        zhi0 zhi0Var = (zhi0) thA;
        uhi0 uhi0Var = zhi0Var.d;
        int iIntValue = (uhi0Var == null || (num = uhi0Var.c) == null) ? zhi0Var.f44396a : num.intValue();
        if (iIntValue == 409) {
            throw new ozn0();
        }
        if (iIntValue != 422) {
            throw zhi0Var;
        }
        String message = zhi0Var.getMessage();
        if (message == null) {
            message = "";
        }
        throw new n7p(message);
    }

    public j50 d() throws GeneralSecurityException {
        iw20 iw20Var;
        sg9 sg9VarA;
        q50 q50Var = (q50) this.f26994a;
        if (q50Var == null || (iw20Var = (iw20) this.b) == null) {
            hny.o("Cannot build without parameters and/or key material");
            return null;
        }
        if (q50Var.b != ((sg9) iw20Var.f15470a).f32150a.length) {
            hny.o("Key size mismatch");
            return null;
        }
        p50 p50Var = q50Var.d;
        p50 p50Var2 = p50.f;
        if (p50Var != p50Var2 && ((Integer) this.c) == null) {
            hny.o("Cannot create key without ID requirement with parameters with ID requirement");
            return null;
        }
        if (p50Var == p50Var2 && ((Integer) this.c) != null) {
            hny.o("Cannot create key with ID requirement with parameters without ID requirement");
            return null;
        }
        if (p50Var == p50Var2) {
            sg9VarA = sg9.a(new byte[0]);
        } else if (p50Var == p50.e || p50Var == p50.d) {
            sg9VarA = sg9.a(ByteBuffer.allocate(5).put((byte) 0).putInt(((Integer) this.c).intValue()).array());
        } else {
            if (p50Var != p50.c) {
                hny.w(((q50) this.f26994a).d, "Unknown AesCmacParametersParameters.Variant: ");
                return null;
            }
            sg9VarA = sg9.a(ByteBuffer.allocate(5).put((byte) 1).putInt(((Integer) this.c).intValue()).array());
        }
        return new j50((q50) this.f26994a, sg9VarA);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:107|30|(1:32)(1:33)) */
    /* JADX WARN: Code duplicated, block: B:107:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cd A[Catch: all -> 0x00df, TRY_LEAVE, TryCatch #2 {all -> 0x00df, blocks: (B:30:0x009c, B:33:0x00cd), top: B:107:0x009c }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e9 A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:14:0x0040, B:36:0x00d3, B:74:0x016a, B:75:0x0171, B:76:0x0172, B:40:0x00e1, B:43:0x00e9, B:44:0x00f2, B:48:0x00fc, B:50:0x0100, B:55:0x011f, B:57:0x0129, B:59:0x012f, B:63:0x0137, B:65:0x013b, B:70:0x0158, B:72:0x0161, B:19:0x0062, B:27:0x008f), top: B:104:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00f2 A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:14:0x0040, B:36:0x00d3, B:74:0x016a, B:75:0x0171, B:76:0x0172, B:40:0x00e1, B:43:0x00e9, B:44:0x00f2, B:48:0x00fc, B:50:0x0100, B:55:0x011f, B:57:0x0129, B:59:0x012f, B:63:0x0137, B:65:0x013b, B:70:0x0158, B:72:0x0161, B:19:0x0062, B:27:0x008f), top: B:104:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:50:0x0100 A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:14:0x0040, B:36:0x00d3, B:74:0x016a, B:75:0x0171, B:76:0x0172, B:40:0x00e1, B:43:0x00e9, B:44:0x00f2, B:48:0x00fc, B:50:0x0100, B:55:0x011f, B:57:0x0129, B:59:0x012f, B:63:0x0137, B:65:0x013b, B:70:0x0158, B:72:0x0161, B:19:0x0062, B:27:0x008f), top: B:104:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x011a  */
    /* JADX WARN: Code duplicated, block: B:55:0x011f A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:14:0x0040, B:36:0x00d3, B:74:0x016a, B:75:0x0171, B:76:0x0172, B:40:0x00e1, B:43:0x00e9, B:44:0x00f2, B:48:0x00fc, B:50:0x0100, B:55:0x011f, B:57:0x0129, B:59:0x012f, B:63:0x0137, B:65:0x013b, B:70:0x0158, B:72:0x0161, B:19:0x0062, B:27:0x008f), top: B:104:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0129 A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:14:0x0040, B:36:0x00d3, B:74:0x016a, B:75:0x0171, B:76:0x0172, B:40:0x00e1, B:43:0x00e9, B:44:0x00f2, B:48:0x00fc, B:50:0x0100, B:55:0x011f, B:57:0x0129, B:59:0x012f, B:63:0x0137, B:65:0x013b, B:70:0x0158, B:72:0x0161, B:19:0x0062, B:27:0x008f), top: B:104:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x012f A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:14:0x0040, B:36:0x00d3, B:74:0x016a, B:75:0x0171, B:76:0x0172, B:40:0x00e1, B:43:0x00e9, B:44:0x00f2, B:48:0x00fc, B:50:0x0100, B:55:0x011f, B:57:0x0129, B:59:0x012f, B:63:0x0137, B:65:0x013b, B:70:0x0158, B:72:0x0161, B:19:0x0062, B:27:0x008f), top: B:104:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0134  */
    /* JADX WARN: Code duplicated, block: B:62:0x0136  */
    /* JADX WARN: Code duplicated, block: B:65:0x013b A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:14:0x0040, B:36:0x00d3, B:74:0x016a, B:75:0x0171, B:76:0x0172, B:40:0x00e1, B:43:0x00e9, B:44:0x00f2, B:48:0x00fc, B:50:0x0100, B:55:0x011f, B:57:0x0129, B:59:0x012f, B:63:0x0137, B:65:0x013b, B:70:0x0158, B:72:0x0161, B:19:0x0062, B:27:0x008f), top: B:104:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0158 A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:14:0x0040, B:36:0x00d3, B:74:0x016a, B:75:0x0171, B:76:0x0172, B:40:0x00e1, B:43:0x00e9, B:44:0x00f2, B:48:0x00fc, B:50:0x0100, B:55:0x011f, B:57:0x0129, B:59:0x012f, B:63:0x0137, B:65:0x013b, B:70:0x0158, B:72:0x0161, B:19:0x0062, B:27:0x008f), top: B:104:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x015e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0161 A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:14:0x0040, B:36:0x00d3, B:74:0x016a, B:75:0x0171, B:76:0x0172, B:40:0x00e1, B:43:0x00e9, B:44:0x00f2, B:48:0x00fc, B:50:0x0100, B:55:0x011f, B:57:0x0129, B:59:0x012f, B:63:0x0137, B:65:0x013b, B:70:0x0158, B:72:0x0161, B:19:0x0062, B:27:0x008f), top: B:104:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0168 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x016a A[Catch: all -> 0x0173, TryCatch #0 {all -> 0x0173, blocks: (B:14:0x0040, B:36:0x00d3, B:74:0x016a, B:75:0x0171, B:76:0x0172, B:40:0x00e1, B:43:0x00e9, B:44:0x00f2, B:48:0x00fc, B:50:0x0100, B:55:0x011f, B:57:0x0129, B:59:0x012f, B:63:0x0137, B:65:0x013b, B:70:0x0158, B:72:0x0161, B:19:0x0062, B:27:0x008f), top: B:104:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0172 A[Catch: all -> 0x0173, TRY_LEAVE, TryCatch #0 {all -> 0x0173, blocks: (B:14:0x0040, B:36:0x00d3, B:74:0x016a, B:75:0x0171, B:76:0x0172, B:40:0x00e1, B:43:0x00e9, B:44:0x00f2, B:48:0x00fc, B:50:0x0100, B:55:0x011f, B:57:0x0129, B:59:0x012f, B:63:0x0137, B:65:0x013b, B:70:0x0158, B:72:0x0161, B:19:0x0062, B:27:0x008f), top: B:104:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cf, code lost:
    
        if (r0 == r3) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d9, code lost:
    
        r18 = r8;
        r8 = r0;
        r0 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00df, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00e9 -> B:29:0x009a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x0161 -> B:69:0x0156). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(a.zje r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.phf0.e(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(vjt0 vjt0Var, zje zjeVar) throws Throwable {
        jdp jdpVar;
        Object g0g0Var;
        Integer num;
        Object value;
        Object iapVar;
        if (zjeVar instanceof jdp) {
            jdpVar = (jdp) zjeVar;
            int i = jdpVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                jdpVar.l = i - Integer.MIN_VALUE;
            } else {
                jdpVar = new jdp(this, zjeVar);
            }
        } else {
            jdpVar = new jdp(this, zjeVar);
        }
        Object obj = jdpVar.j;
        wne wneVar = wne.f39444a;
        int i2 = jdpVar.l;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                e0g0 e0g0Var = j0g0.b;
                uyn uynVar = (uyn) this.f26994a;
                String strA = ((btt0) this.c).a();
                jdpVar.i = vjt0Var;
                jdpVar.l = 1;
                Object objA = ((kdp) ((wgn) uynVar.f36498a).invoke()).a(strA, vjt0Var, jdpVar);
                if (objA != wneVar) {
                    objA = Unit.f46060a;
                }
                if (objA == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vjt0Var = jdpVar.i;
                z1x.P(obj);
            }
            g0g0Var = Unit.f46060a;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA != null) {
            if (!(thA instanceof zhi0)) {
                throw thA;
            }
            zhi0 zhi0Var = (zhi0) thA;
            uhi0 uhi0Var = zhi0Var.d;
            int iIntValue = (uhi0Var == null || (num = uhi0Var.c) == null) ? zhi0Var.f44396a : num.intValue();
            if (iIntValue == 409) {
                throw new ozn0();
            }
            if (iIntValue != 422) {
                throw zhi0Var;
            }
            String message = zhi0Var.getMessage();
            if (message == null) {
                message = "";
            }
            throw new n7p(message);
        }
        if (!(g0g0Var instanceof g0g0)) {
            abp abpVar = (abp) this.b;
            List listC = kotlin.collections.a.c(new Long(vjt0Var.f37547a));
            abpVar.getClass();
            listC.getClass();
            p7m0 p7m0Var = abpVar.c;
            do {
                value = p7m0Var.getValue();
                iapVar = (kap) value;
                if (iapVar instanceof iap) {
                    Iterable iterable = (Iterable) ((iap) iapVar).f14449a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : iterable) {
                        if (!listC.contains(Long.valueOf(((xcp) obj2).f40657a))) {
                            arrayList.add(obj2);
                        }
                    }
                    iapVar = new iap(arrayList);
                }
            } while (!p7m0Var.m(value, iapVar));
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r10 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        if (r10 == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable g(long r8, a.zje r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.phf0.g(long, a.zje, boolean):java.io.Serializable");
    }

    @Override // a.n1x
    public void h(o1x o1xVar, hhn0 hhn0Var) {
        ibk0 ibk0Var = (ibk0) this.b;
        dyw dywVar = hhn0Var.f13073a;
        Resources resources = ((ImageView) this.c).getContext().getResources();
        resources.getClass();
        ibk0Var.invoke(c3x.q(dywVar, resources));
    }

    public n4u i() {
        return new n4u(new ocl((crq) this.f26994a), (byte) 9);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(long j, zje zjeVar) {
        fk8 fk8Var;
        if (zjeVar instanceof fk8) {
            fk8Var = (fk8) zjeVar;
            int i = fk8Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                fk8Var.l = i - Integer.MIN_VALUE;
            } else {
                fk8Var = new fk8(this, zjeVar);
            }
        } else {
            fk8Var = new fk8(this, zjeVar);
        }
        Object objA = fk8Var.j;
        wne wneVar = wne.f39444a;
        int i2 = fk8Var.l;
        if (i2 == 0) {
            z1x.P(objA);
            h03 h03Var = (h03) this.f26994a;
            String strA = ((btt0) this.c).a();
            List<Long> listU = j > 0 ? cs0.u(j) : iun.f15405a;
            fk8Var.i = j;
            fk8Var.l = 1;
            objA = ((r3t) ((zm) h03Var.b).invoke()).a(strA, listU, fk8Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = fk8Var.i;
            z1x.P(objA);
        }
        List list = ((yk10) ((nz5) objA).a()).f42766a;
        if (list == null) {
            return iun.f15405a;
        }
        xr xrVar = (xr) this.b;
        if (j > 0) {
            ((LinkedHashMap) xrVar.b).put(Long.valueOf(j), list);
            return list;
        }
        xrVar.f41344a = list;
        return list;
    }

    @Override // a.n1x
    public void k(o1x o1xVar, r1o r1oVar) {
        ((ibk0) this.f26994a).invoke(r1oVar.c);
    }

    @Override // a.nae0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public String n(Fragment fragment, iiy iiyVar) {
        String str = (String) this.b;
        fragment.getClass();
        iiyVar.getClass();
        String str2 = (String) this.c;
        if (str2 != null) {
            return str2;
        }
        Bundle bundle = fragment.g;
        String string = bundle != null ? bundle.getString((String) this.f26994a, str) : null;
        this.c = string;
        return string == null ? str : string;
    }

    public i89 m() {
        return new i89(new p6d(((kc60) this.f26994a).a(), ((tg5) ((u4a) this.b).f35035a.b).d, new ko0((Object) this, (yje) null, (byte) 18), (byte) 1), (byte) 22);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:29:0x007c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    /* JADX WARN: Code duplicated, block: B:35:0x009c A[LOOP:0: B:33:0x0096->B:35:0x009c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ee A[LOOP:2: B:47:0x00e8->B:49:0x00ee, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x0110  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable o(zje zjeVar) {
        fmu fmuVar;
        List<f8b> list;
        List list2;
        uab uabVar;
        int i;
        ArrayList arrayList;
        ArrayList arrayListL;
        ArrayList arrayList2;
        int i2;
        ArrayList arrayList3;
        Iterator it;
        if (zjeVar instanceof fmu) {
            fmuVar = (fmu) zjeVar;
            int i3 = fmuVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fmuVar.l = i3 - Integer.MIN_VALUE;
            } else {
                fmuVar = new fmu(this, zjeVar);
            }
        } else {
            fmuVar = new fmu(this, zjeVar);
        }
        Object objA = fmuVar.j;
        wne wneVar = wne.f39444a;
        int i4 = fmuVar.l;
        a4b a4bVar = null;
        if (i4 == 0) {
            z1x.P(objA);
            String strA = ((ntu) this.b).a();
            jdu jduVar = (jdu) this.f26994a;
            fmuVar.l = 1;
            objA = jduVar.a(fmuVar, strA, false, true);
            if (objA != wneVar) {
            }
            return wneVar;
        }
        if (i4 == 1) {
            z1x.P(objA);
        } else {
            if (i4 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = fmuVar.i;
            z1x.P(objA);
        }
        list2 = (List) objA;
        uabVar = (uab) CollectionsKt.firstOrNull(list2);
        if (uabVar != null) {
            i = Integer.parseInt(uabVar.b);
        } else {
            i = 0;
        }
        if (list2.isEmpty()) {
            list2 = null;
        }
        if (list2 != null) {
            nek nekVar = y4t.c;
            int i5 = Integer.parseInt("160291");
            arrayList3 = new ArrayList(r3d.q(list2, 10));
            it = list2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((uab) it.next()).f35321a);
            }
            a4bVar = new a4b(i5, arrayList3);
        }
        nek nekVar2 = y4t.c;
        if (i == Integer.parseInt("160291")) {
            arrayList2 = new ArrayList();
            for (Object obj : list) {
                i2 = ((f8b) obj).f9097a;
                nek nekVar3 = y4t.c;
                if (i2 != Integer.parseInt("160291")) {
                    arrayList2.add(obj);
                }
            }
            list = arrayList2;
        }
        arrayList = new ArrayList(r3d.q(list, 10));
        for (f8b f8bVar : list) {
            arrayList.add(new c4b(f8bVar.f9097a, f8bVar.b));
        }
        arrayListL = q3d.l(new b4b(arrayList));
        if (a4bVar != null) {
            arrayListL.add(a4bVar);
        }
        return arrayListL;
        List list3 = (List) objA;
        khf0 khf0Var = (khf0) this.c;
        fmuVar.i = list3;
        fmuVar.l = 2;
        Object objE = khf0Var.E(fmuVar);
        if (objE != wneVar) {
            objA = objE;
            list = list3;
            list2 = (List) objA;
            uabVar = (uab) CollectionsKt.firstOrNull(list2);
            if (uabVar != null) {
                i = Integer.parseInt(uabVar.b);
            } else {
                i = 0;
            }
            if (list2.isEmpty()) {
                list2 = null;
            }
            if (list2 != null) {
                nek nekVar4 = y4t.c;
                int i6 = Integer.parseInt("160291");
                arrayList3 = new ArrayList(r3d.q(list2, 10));
                it = list2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((uab) it.next()).f35321a);
                }
                a4bVar = new a4b(i6, arrayList3);
            }
            nek nekVar5 = y4t.c;
            if (i == Integer.parseInt("160291")) {
                arrayList2 = new ArrayList();
                while (r9.hasNext()) {
                    i2 = ((f8b) obj).f9097a;
                    nek nekVar6 = y4t.c;
                    if (i2 != Integer.parseInt("160291")) {
                        arrayList2.add(obj);
                    }
                }
                list = arrayList2;
            }
            arrayList = new ArrayList(r3d.q(list, 10));
            while (r9.hasNext()) {
                arrayList.add(new c4b(f8bVar.f9097a, f8bVar.b));
            }
            arrayListL = q3d.l(new b4b(arrayList));
            if (a4bVar != null) {
                arrayListL.add(a4bVar);
            }
            return arrayListL;
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p(int i, zje zjeVar) {
        v4a v4aVar;
        if (zjeVar instanceof v4a) {
            v4aVar = (v4a) zjeVar;
            int i2 = v4aVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v4aVar.k = i2 - Integer.MIN_VALUE;
            } else {
                v4aVar = new v4a(this, zjeVar);
            }
        } else {
            v4aVar = new v4a(this, zjeVar);
        }
        Object objK = v4aVar.i;
        wne wneVar = wne.f39444a;
        int i3 = v4aVar.k;
        if (i3 == 0) {
            z1x.P(objK);
            edu eduVar = (edu) this.f26994a;
            v4aVar.k = 1;
            objK = eduVar.k(i, v4aVar);
            if (objK == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objK);
        }
        return Boolean.valueOf(((zlt0) this.c).k() && ((Boolean) objK).booleanValue() && ((pru) this.b).a().f32117a.f12063a.h);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:12|13|76|22|23|80|24|25|78|26|(1:29)|69) */
    /* JADX WARN: Code duplicated, block: B:29:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:58:0x0112  */
    /* JADX WARN: Code duplicated, block: B:59:0x0114  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00db, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00dc, code lost:
    
        r22 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00de, code lost:
    
        r8 = r10;
        r10 = r2;
        r2 = r4;
        r4 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e5, code lost:
    
        r22 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0141, code lost:
    
        if (a.qcc.O(3000, r1) == r3) goto L69;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0141 -> B:13:0x0038). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q(long r25, a.zje r27) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.phf0.q(long, a.zje):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|2|(2:4|(1:6)(1:7))(1:7)|8|(1:(1:(14:12|77|96|22|94|23|24|92|25|26|90|27|(1:30)|75)(2:13|14))(4:15|88|16|17))(13:21|96|22|94|23|24|92|25|26|90|27|(1:30)|75)|98|31|79|(1:81)(1:82)|83|(2:85|86)(1:100)|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(14:12|77|96|22|94|23|24|92|25|26|90|27|(1:30)|75) */
    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:46:0x0102  */
    /* JADX WARN: Code duplicated, block: B:51:0x0110  */
    /* JADX WARN: Code duplicated, block: B:54:0x0115  */
    /* JADX WARN: Code duplicated, block: B:64:0x012b  */
    /* JADX WARN: Code duplicated, block: B:65:0x012d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x017c  */
    /* JADX WARN: Code duplicated, block: B:82:0x017e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0183  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00df, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e0, code lost:
    
        r1 = r4;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e9, code lost:
    
        r19 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ee, code lost:
    
        r6 = r1;
        r1 = r4;
        r4 = r7;
        r15 = r12;
        r11 = r10;
        r10 = r13;
        r13 = r2;
        r2 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f9, code lost:
    
        r19 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fd, code lost:
    
        r7 = r9;
        r2 = r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [byte] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v6, types: [byte, int] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r6v10, types: [a.dn0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0165 -> B:77:0x016c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(long r21, java.util.List r23, int r24, a.zje r25) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.phf0.r(long, java.util.List, int, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0090  */
    /* JADX WARN: Code duplicated, block: B:27:0x0093  */
    /* JADX WARN: Code duplicated, block: B:31:0x009e  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object s(long j, boolean z, boolean z2, zje zjeVar) {
        vzt vztVar;
        Object objW;
        boolean z3;
        q4f q4fVar;
        boolean z4;
        boolean z5;
        List list;
        long jLongValue;
        q4f q4fVar2;
        boolean z6;
        llx llxVar;
        chf0 chf0Var = (chf0) this.b;
        if (zjeVar instanceof vzt) {
            vztVar = (vzt) zjeVar;
            int i = vztVar.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                vztVar.p = i - Integer.MIN_VALUE;
            } else {
                vztVar = new vzt(this, zjeVar);
            }
        } else {
            vztVar = new vzt(this, zjeVar);
        }
        Object obj = vztVar.n;
        wne wneVar = wne.f39444a;
        int i2 = vztVar.p;
        if (i2 == 0) {
            z1x.P(obj);
            q4f q4fVar3 = ((ave) ((g45) this.f26994a).c).f1521a;
            vztVar.l = q4fVar3;
            vztVar.i = j;
            vztVar.j = z;
            vztVar.k = z2;
            vztVar.p = 1;
            objW = chf0Var.w(vztVar);
            if (objW != wneVar) {
                z3 = z2;
                q4fVar = q4fVar3;
            }
            return wneVar;
        }
        if (i2 == 1) {
            boolean z7 = vztVar.k;
            z = vztVar.j;
            j = vztVar.i;
            q4f q4fVar4 = vztVar.l;
            z1x.P(obj);
            z3 = z7;
            q4fVar = q4fVar4;
            objW = obj;
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z4 = vztVar.k;
            z5 = vztVar.j;
            list = vztVar.m;
            q4fVar = vztVar.l;
            z1x.P(obj);
        }
        jLongValue = ((Number) obj).longValue();
        if (z4) {
            q4fVar2 = q4f.l;
        } else if (jLongValue <= 1 && !z5) {
            q4fVar2 = q4f.m;
        } else if (list.size() == 1) {
            q4fVar2 = q4f.c;
        } else if (q4fVar == q4f.c || list.size() <= 1) {
            q4fVar2 = q4fVar;
        } else {
            q4fVar2 = q4f.d;
        }
        z6 = q4fVar != q4fVar2;
        boolean zContains = q3d.j(q4f.g, q4f.h, q4f.m).contains(q4fVar2);
        if (!z6 && z4) {
            llxVar = llx.b;
        } else if (z6 && zContains && !((oif0) this.c).n().isEmpty()) {
            llxVar = llx.d;
        } else if (z6 || !zContains) {
            llxVar = llx.f20269a;
        } else {
            llxVar = llx.c;
        }
        return new fye(q4fVar2, llxVar);
        List list2 = (List) objW;
        vztVar.l = q4fVar;
        vztVar.m = list2;
        vztVar.i = j;
        vztVar.j = z;
        vztVar.k = z3;
        vztVar.p = 2;
        Object objE = chf0Var.E(j, vztVar);
        if (objE != wneVar) {
            boolean z8 = z3;
            obj = objE;
            z4 = z8;
            z5 = z;
            list = list2;
            jLongValue = ((Number) obj).longValue();
            if (z4) {
                q4fVar2 = q4f.l;
            } else if (jLongValue <= 1) {
                if (list.size() == 1) {
                    q4fVar2 = q4f.c;
                } else if (q4fVar == q4f.c) {
                    q4fVar2 = q4fVar;
                } else {
                    q4fVar2 = q4fVar;
                }
            } else if (list.size() == 1) {
                q4fVar2 = q4f.c;
            } else if (q4fVar == q4f.c) {
                q4fVar2 = q4fVar;
            } else {
                q4fVar2 = q4fVar;
            }
            if (q4fVar != q4fVar2) {
            }
            boolean zContains2 = q3d.j(q4f.g, q4f.h, q4f.m).contains(q4fVar2);
            if (!z6) {
                if (z6) {
                    if (z6) {
                        llxVar = llx.f20269a;
                    } else {
                        llxVar = llx.f20269a;
                    }
                } else if (z6) {
                    llxVar = llx.f20269a;
                } else {
                    llxVar = llx.f20269a;
                }
            } else if (z6) {
                if (z6) {
                    llxVar = llx.f20269a;
                } else {
                    llxVar = llx.f20269a;
                }
            } else if (z6) {
                llxVar = llx.f20269a;
            } else {
                llxVar = llx.f20269a;
            }
            return new fye(q4fVar2, llxVar);
        }
        return wneVar;
    }

    public Object t(tnp0 tnp0Var, yje yjeVar) {
        if (!((m1e) this.c).c()) {
            return Unit.f46060a;
        }
        yje yjeVar2 = null;
        Object objV = iom0.v(new gv60(this, tnp0Var, yjeVar2, (byte) 8), new hr(tnp0Var, this, yjeVar2, (byte) 26), new hhb0(this, yjeVar2, (byte) 6), new gvb0(this, tnp0Var, (byte) 22), new ir((Object) this, (Object) tnp0Var, yjeVar2, (byte) 27), phf0.class, yjeVar);
        return objV == wne.f39444a ? objV : Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object u(String str, zje zjeVar) {
        i5k i5kVar;
        if (zjeVar instanceof i5k) {
            i5kVar = (i5k) zjeVar;
            int i = i5kVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                i5kVar.l = i - Integer.MIN_VALUE;
            } else {
                i5kVar = new i5k(this, zjeVar);
            }
        } else {
            i5kVar = new i5k(this, zjeVar);
        }
        Object objG = i5kVar.j;
        Object obj = wne.f39444a;
        int i2 = i5kVar.l;
        if (i2 == 0) {
            z1x.P(objG);
            khf0 khf0Var = (khf0) this.b;
            bm5 bm5Var = bm5.c;
            i5kVar.i = str;
            i5kVar.l = 1;
            objG = khf0.G(khf0Var, bm5Var, i5kVar);
            if (objG != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(objG);
                return objG;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = i5kVar.i;
        z1x.P(objG);
        String str2 = str;
        ql5 ql5Var = (ql5) objG;
        ((ot) this.c).a(bm5.c, ql5Var);
        hsj hsjVar = (hsj) this.f26994a;
        long j = ql5Var.f28916a;
        i5kVar.i = null;
        i5kVar.l = 2;
        mii0 mii0Var = (mii0) hsjVar.f13586a;
        Object objD0 = qjj.d0(((mne) mii0Var.b).b, new x0f(mii0Var, ((gst0) hsjVar.b).f11847a.a().f18785a, j, str2, (yje) null), i5kVar);
        return objD0 == obj ? obj : objD0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:32:0x0085  */
    /* JADX WARN: Code duplicated, block: B:34:0x008d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object v(boolean z, zje zjeVar) {
        ssu ssuVar;
        m2c0 m2c0Var;
        jqt0 jqt0Var;
        zrt0 zrt0Var;
        if (zjeVar instanceof ssu) {
            ssuVar = (ssu) zjeVar;
            int i = ssuVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ssuVar.m = i - Integer.MIN_VALUE;
            } else {
                ssuVar = new ssu(this, zjeVar);
            }
        } else {
            ssuVar = new ssu(this, zjeVar);
        }
        Object objA = ssuVar.k;
        wne wneVar = wne.f39444a;
        int i2 = ssuVar.m;
        if (i2 == 0) {
            z1x.P(objA);
            rou rouVar = (rou) this.b;
            ssuVar.i = z;
            ssuVar.m = 1;
            objA = rouVar.a(z, ssuVar);
            if (objA != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            z = ssuVar.i;
            z1x.P(objA);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m2c0Var = ssuVar.j;
            z1x.P(objA);
        }
        wrh0 wrh0Var = (wrh0) objA;
        if (kotlin.text.c.r(m2c0Var.Z, Separators.DOT, "", false).length() == 0) {
            zrt0Var = zrt0.b;
        } else {
            jqt0Var = m2c0Var.k;
            if (jqt0Var == jqt0.e && jqt0Var != jqt0.d) {
                zrt0Var = zrt0.c;
            } else if (m2c0Var.c.length() > 0) {
                zrt0Var = zrt0.f44875a;
            } else {
                zrt0Var = zrt0.d;
            }
        }
        zrt0 zrt0Var2 = zrt0Var;
        zlt0 zlt0Var = (zlt0) this.f26994a;
        ((vlk) zlt0Var.b).f37628a.e("restrictEmail", m2c0Var.N);
        String str = m2c0Var.Z;
        wrh0Var.getClass();
        return new jph0(wrh0Var.f39643a, wrh0Var.b, wrh0Var.c, wrh0Var.d, zrt0Var2, str, wrh0Var.e, wrh0Var.f);
        m2c0 m2c0Var2 = (m2c0) objA;
        z220 z220Var = (z220) this.c;
        ssuVar.j = m2c0Var2;
        ssuVar.i = z;
        ssuVar.m = 2;
        Object objS = z220Var.s(z, ssuVar);
        if (objS != wneVar) {
            objA = objS;
            m2c0Var = m2c0Var2;
            wrh0 wrh0Var2 = (wrh0) objA;
            if (kotlin.text.c.r(m2c0Var.Z, Separators.DOT, "", false).length() == 0) {
                zrt0Var = zrt0.b;
            } else {
                jqt0Var = m2c0Var.k;
                if (jqt0Var == jqt0.e) {
                    if (m2c0Var.c.length() > 0) {
                        zrt0Var = zrt0.f44875a;
                    } else {
                        zrt0Var = zrt0.d;
                    }
                } else if (m2c0Var.c.length() > 0) {
                    zrt0Var = zrt0.f44875a;
                } else {
                    zrt0Var = zrt0.d;
                }
            }
            zrt0 zrt0Var3 = zrt0Var;
            zlt0 zlt0Var2 = (zlt0) this.f26994a;
            ((vlk) zlt0Var2.b).f37628a.e("restrictEmail", m2c0Var.N);
            String str2 = m2c0Var.Z;
            wrh0Var2.getClass();
            return new jph0(wrh0Var2.f39643a, wrh0Var2.b, wrh0Var2.c, wrh0Var2.d, zrt0Var3, str2, wrh0Var2.e, wrh0Var2.f);
        }
        return wneVar;
    }

    public boolean w(int i, r96 r96Var, k4e k4eVar) {
        q96 q96Var = (q96) this.b;
        j4e[] j4eVarArr = k4eVar.U;
        int[] iArr = k4eVar.u;
        q96Var.f28332a = j4eVarArr[0];
        q96Var.b = j4eVarArr[1];
        q96Var.c = k4eVar.s();
        q96Var.d = k4eVar.m();
        q96Var.i = false;
        q96Var.j = i;
        j4e j4eVar = q96Var.f28332a;
        j4e j4eVar2 = j4e.c;
        boolean z = j4eVar == j4eVar2;
        boolean z2 = q96Var.b == j4eVar2;
        boolean z3 = z && k4eVar.Y > 0.0f;
        boolean z4 = z2 && k4eVar.Y > 0.0f;
        j4e j4eVar3 = j4e.f15879a;
        if (z3 && iArr[0] == 4) {
            q96Var.f28332a = j4eVar3;
        }
        if (z4 && iArr[1] == 4) {
            q96Var.b = j4eVar3;
        }
        r96Var.b(k4eVar, q96Var);
        k4eVar.T(q96Var.e);
        k4eVar.O(q96Var.f);
        k4eVar.F = q96Var.h;
        k4eVar.K(q96Var.g);
        q96Var.j = 0;
        return q96Var.i;
    }

    public void x(Fragment fragment, iiy iiyVar, String str) {
        fragment.getClass();
        iiyVar.getClass();
        str.getClass();
        Bundle bundle = fragment.g;
        if (bundle == null) {
            bundle = new Bundle();
            fragment.s0(bundle);
        }
        bundle.putString((String) this.f26994a, str);
        this.c = str;
    }

    public void y(l4e l4eVar, int i, int i2, int i3) {
        int i4 = l4eVar.d0;
        int i5 = l4eVar.e0;
        l4eVar.d0 = 0;
        l4eVar.e0 = 0;
        l4eVar.T(i2);
        l4eVar.O(i3);
        if (i4 < 0) {
            l4eVar.d0 = 0;
        } else {
            l4eVar.d0 = i4;
        }
        if (i5 < 0) {
            l4eVar.e0 = 0;
        } else {
            l4eVar.e0 = i5;
        }
        l4e l4eVar2 = (l4e) this.c;
        l4eVar2.x0 = i;
        l4eVar2.a0();
    }

    public void z(l4e l4eVar) {
        ArrayList arrayList = (ArrayList) this.f26994a;
        arrayList.clear();
        int size = l4eVar.u0.size();
        for (int i = 0; i < size; i++) {
            k4e k4eVar = (k4e) l4eVar.u0.get(i);
            j4e[] j4eVarArr = k4eVar.U;
            j4e j4eVar = j4eVarArr[0];
            j4e j4eVar2 = j4e.c;
            if (j4eVar == j4eVar2 || j4eVarArr[1] == j4eVar2) {
                arrayList.add(k4eVar);
            }
        }
        l4eVar.w0.b = true;
    }

    public /* synthetic */ phf0(Object obj, Object obj2, Object obj3) {
        this.f26994a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public phf0(String str) {
        this.f26994a = str;
        this.b = "";
    }

    public phf0(String str, String str2) {
        this.f26994a = str;
        this.b = str2;
    }
}
