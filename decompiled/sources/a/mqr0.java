package a;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mqr0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22238a;
    public final /* synthetic */ l7m0 b;

    public /* synthetic */ mqr0(l7m0 l7m0Var, byte b) {
        this.f22238a = b;
        this.b = l7m0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f22238a;
        l7m0 l7m0Var = this.b;
        switch (b) {
            case 0:
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                uag0Var.b(((Number) l7m0Var.getValue()).floatValue());
                break;
            case 1:
                uag0 uag0Var2 = (uag0) obj;
                uag0Var2.getClass();
                uag0Var2.b(((Number) l7m0Var.getValue()).floatValue());
                break;
            case 2:
                uag0 uag0Var3 = (uag0) obj;
                uag0Var3.getClass();
                uag0Var3.b(((Number) l7m0Var.getValue()).floatValue());
                break;
            case 3:
                uag0 uag0Var4 = (uag0) obj;
                uag0Var4.getClass();
                uag0Var4.b(((Number) l7m0Var.getValue()).floatValue());
                break;
            case 4:
                uag0 uag0Var5 = (uag0) obj;
                uag0Var5.getClass();
                uag0Var5.b(((Number) l7m0Var.getValue()).floatValue());
                break;
            case 5:
                fhl fhlVar = (fhl) obj;
                fhlVar.getClass();
                w03 w03VarA = z03.a();
                w03VarA.f(0.0f, Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) / 2.0f);
                w03VarA.e(Float.intBitsToFloat((int) (fhlVar.d() >> 32)) / 2.0f, Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)));
                w03VarA.e(Float.intBitsToFloat((int) (fhlVar.d() >> 32)), Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) / 2.0f);
                w03VarA.c();
                fhl.C0(fhlVar, w03VarA, y3d.c, ((Number) l7m0Var.getValue()).floatValue(), l0q.f19214a, 48);
                break;
            case 6:
                uag0 uag0Var6 = (uag0) obj;
                uag0Var6.getClass();
                uag0Var6.b(((Number) l7m0Var.getValue()).floatValue());
                break;
            case 7:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                float fFloatValue = ((Number) l7m0Var.getValue()).floatValue();
                zai0 zai0Var = cbi0.p;
                iiy iiyVar = cbi0.f4063a[13];
                Float fValueOf = Float.valueOf(fFloatValue);
                zai0Var.getClass();
                abi0Var.b(zai0Var, fValueOf);
                break;
            case 8:
                uag0 uag0Var7 = (uag0) obj;
                uag0Var7.getClass();
                uag0Var7.b(((Number) l7m0Var.getValue()).floatValue());
                break;
            case 9:
                abi0 abi0Var2 = (abi0) obj;
                abi0Var2.getClass();
                yai0.h(abi0Var2, ((Boolean) l7m0Var.getValue()).booleanValue() ? "Expanded" : "Collapsed");
                break;
            case 10:
                g7z g7zVar = (g7z) obj;
                g7zVar.getClass();
                g7zVar.a();
                float fW0 = g7zVar.w0(36.0f);
                Float fValueOf2 = Float.valueOf(0.0f);
                long j = y3d.f;
                Pair pair = new Pair(fValueOf2, new y3d(j));
                Object obj2 = ((Pair) l7m0Var.getValue()).f46059a;
                long j2 = y3d.b;
                fhl.r(g7zVar, yk5.h(new Pair[]{pair, new Pair(obj2, new y3d(j2))}, 0.0f, fW0, 8), 0L, 0L, 0.0f, null, null, 6, 62);
                Pair[] pairArr = {new Pair(Float.valueOf(1.0f - ((Number) ((Pair) l7m0Var.getValue()).b).floatValue()), new y3d(j2)), new Pair(Float.valueOf(1.0f), new y3d(j))};
                a6a a6aVar = g7zVar.f10839a;
                fhl.r(g7zVar, yk5.h(pairArr, Float.intBitsToFloat((int) (a6aVar.d() >> 32)) - fW0, Float.intBitsToFloat((int) (a6aVar.d() >> 32)), 8), 0L, 0L, 0.0f, null, null, 6, 62);
                break;
            default:
                fhl fhlVar2 = (fhl) obj;
                fhlVar2.getClass();
                fhl.E(fhlVar2, ((y3d) l7m0Var.getValue()).f41946a, Float.intBitsToFloat((int) (fhlVar2.d() >> 32)) / 3.0f, 0L, 0.0f, null, 124);
                break;
        }
        return Unit.f46060a;
    }
}
