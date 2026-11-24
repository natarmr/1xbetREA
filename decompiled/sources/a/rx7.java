package a;

import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rx7 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31250a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rx7(float f, fqj0 fqj0Var, int i) {
        this.f31250a = (byte) 8;
        this.b = f;
        this.c = fqj0Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0100 A[PHI: r8
  0x0100: PHI (r8v8 a.ypj0) = (r8v6 a.ypj0), (r8v9 a.ypj0), (r8v10 a.ypj0), (r8v11 a.ypj0), (r8v12 a.ypj0), (r8v13 a.ypj0), (r8v14 a.ypj0) binds: [B:53:0x013a, B:44:0x011f, B:47:0x0128, B:50:0x0131, B:34:0x00fe, B:37:0x0108, B:40:0x0111] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ypj0 ypj0Var;
        byte b = this.f31250a;
        Object obj3 = this.c;
        float f = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                bsr0.r((k9q) obj3, f, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 1:
                xpj0 xpj0Var = (xpj0) obj3;
                float fH = p4e.h(((p4e) obj2).f26347a);
                float f2 = (int) (((qkx) obj).f28908a & 4294967295L);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (!xpj0Var.f41272a) {
                    linkedHashMap.put(ypj0.c, Float.valueOf(fH - f));
                }
                if (f2 != f) {
                    linkedHashMap.put(ypj0.b, Float.valueOf(Math.max(fH - f2, 0.0f)));
                }
                if (!xpj0Var.c) {
                    linkedHashMap.put(ypj0.f43033a, Float.valueOf(fH));
                }
                no20 no20Var = new no20(linkedHashMap);
                ypj0 ypj0Var2 = (ypj0) ((zbk) xpj0Var.e.k).getValue();
                int iOrdinal = ypj0Var2.ordinal();
                if (iOrdinal == 0) {
                    ypj0Var = ypj0.f43033a;
                    if (linkedHashMap.containsKey(ypj0Var)) {
                        ypj0Var2 = ypj0Var;
                    }
                } else if (iOrdinal == 1) {
                    ypj0Var = ypj0.b;
                    if (linkedHashMap.containsKey(ypj0Var)) {
                        ypj0Var2 = ypj0Var;
                    } else {
                        ypj0Var = ypj0.c;
                        if (linkedHashMap.containsKey(ypj0Var)) {
                            ypj0Var2 = ypj0Var;
                        } else {
                            ypj0Var = ypj0.f43033a;
                            if (linkedHashMap.containsKey(ypj0Var)) {
                                ypj0Var2 = ypj0Var;
                            }
                        }
                    }
                } else {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return null;
                    }
                    ypj0Var = ypj0.c;
                    if (linkedHashMap.containsKey(ypj0Var)) {
                        ypj0Var2 = ypj0Var;
                    } else {
                        ypj0Var = ypj0.b;
                        if (linkedHashMap.containsKey(ypj0Var)) {
                            ypj0Var2 = ypj0Var;
                        } else {
                            ypj0Var = ypj0.f43033a;
                            if (linkedHashMap.containsKey(ypj0Var)) {
                                ypj0Var2 = ypj0Var;
                            }
                        }
                    }
                }
                return new Pair(no20Var, ypj0Var2);
            case 2:
                ((Integer) obj2).getClass();
                dub.Y((q7m) obj3, f, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                x9x.c((di40) obj3, f, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 4:
                ((Integer) obj2).getClass();
                x9x.k((ji40) obj3, f, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 5:
                ((Integer) obj2).getClass();
                k7x.o((r30) obj3, f, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 6:
                ((Integer) obj2).getClass();
                ljg0.a((mjg0) obj3, f, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 7:
                ((Integer) obj2).getClass();
                pzw.f((mch0) obj3, f, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                q5x.d(f, (fqj0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ rx7(byte b, float f, int i, Object obj) {
        this.f31250a = b;
        this.c = obj;
        this.b = f;
    }

    public /* synthetic */ rx7(xpj0 xpj0Var, float f) {
        this.f31250a = (byte) 1;
        this.c = xpj0Var;
        this.b = f;
    }
}
