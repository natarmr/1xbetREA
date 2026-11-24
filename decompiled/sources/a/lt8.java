package a;

import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lt8 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20619a;
    public final /* synthetic */ a4x b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ Object f;

    public /* synthetic */ lt8(a4x a4xVar, Object obj, float f, float f2, float f3, byte b) {
        this.f20619a = b;
        this.b = a4xVar;
        this.f = obj;
        this.c = f;
        this.d = f2;
        this.e = f3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f20619a;
        Object obj2 = this.f;
        switch (b) {
            case 0:
                g9q0 g9q0Var = (g9q0) obj2;
                pi9 pi9Var = (pi9) obj;
                pi9Var.getClass();
                a4x<kt8> a4xVar = this.b;
                int iA = wp20.a(r3d.q(a4xVar, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (kt8 kt8Var : a4xVar) {
                    linkedHashMap.put(kt8Var.f18850a, g9q0.b(g9q0Var, new j83(kt8Var.b), new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), 0, false, 0, 0L, null, null, null, 2044));
                    a4xVar = a4xVar;
                }
                return pi9Var.b(new lt8(a4xVar, linkedHashMap, this.c, this.d, this.e, (byte) 1));
            default:
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) obj2;
                g7z g7zVar = (g7z) obj;
                g7zVar.getClass();
                g7zVar.a();
                for (kt8 kt8Var2 : this.b) {
                    a9q0 a9q0Var = (a9q0) linkedHashMap2.get(kt8Var2.f18850a);
                    if (a9q0Var != null) {
                        float fW0 = g7zVar.w0(kt8Var2.f) + g7zVar.w0(kt8Var2.d);
                        v2n0.o(g7zVar, a9q0Var, StaticColors.INSTANCE.m123getWhite0d7_KjU(), (((long) Float.floatToRawIntBits(this.e)) << 32) | (((long) Float.floatToRawIntBits(mt8.f22359a[kt8Var2.f18850a.ordinal()] == 1 ? fW0 + this.c + this.d : fW0 - ((int) (a9q0Var.c & 4294967295L)))) & 4294967295L), 248);
                    }
                }
                return Unit.f46060a;
        }
    }
}
