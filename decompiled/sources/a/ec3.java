package a;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.promotions.news.impl.navigation.PromotionsNewsScreenFactoryImpl$getNewsCatalogTypeScreen$1;
import org.xplatform.uikit.components.chips.DsChip;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ec3 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7547a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ec3(Object obj, int i, Object obj2, Object obj3, byte b) {
        this.f7547a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f7547a;
        byte b2 = 0;
        byte b3 = 1;
        int i = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                kie0 kie0Var = (kie0) obj3;
                ViewGroup viewGroup = (ViewGroup) obj2;
                Float f = (Float) obj;
                float fFloatValue = f.floatValue();
                Function1 function1 = (Function1) ((do20) obj4).f6397a;
                if (function1 != null) {
                    function1.invoke(f);
                }
                int i2 = (int) ((fFloatValue - 1.0f) * i);
                kie0Var.f18333a = i2;
                do20.q(viewGroup, i2);
                return Unit.f46060a;
            case 1:
                fp5 fp5Var = (fp5) obj3;
                xhe0 xhe0Var = (xhe0) obj2;
                ((View) obj).getClass();
                xdr xdrVar = ((jp5) obj4).g;
                if (xdrVar != null) {
                    fp5Var.getClass();
                    Integer numValueOf = Integer.valueOf(i);
                    KeyEvent.Callback callback = xhe0Var.f40887a;
                    gr5 gr5Var = callback instanceof gr5 ? (gr5) callback : null;
                    xdrVar.F(fp5Var, numValueOf, gr5Var != null ? gr5Var.getLoadedImageUrl() : null);
                }
                return Unit.f46060a;
            case 2:
                a4x a4xVar = (a4x) obj4;
                Function1 function2 = (Function1) obj2;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                hcz.e(hczVar, null, null, new ugd(568813454, true, new y26((fop0) obj3, i, function2, b3)), 3);
                hczVar.f(a4xVar.size(), new at7(new nk7((byte) 3), a4xVar, b2), new b8(a4xVar, (byte) 27), new ugd(802480018, true, new vb(a4xVar, function2, (byte) 11)));
                return Unit.f46060a;
            case 3:
                List list = (List) obj3;
                pz40 pz40Var = (pz40) obj2;
                ou90 ou90Var = (ou90) obj;
                ou90Var.getClass();
                float fL = ((f3d) obj4).f8856a.l();
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    pu90 pu90Var = (pu90) list.get(i3);
                    Object objN = pu90Var.n();
                    p6z p6zVar = objN instanceof p6z ? (p6z) objN : null;
                    Object objG0 = p6zVar != null ? p6zVar.g0() : null;
                    if (Intrinsics.d(objG0, "BACKGROUND_KEY")) {
                        ou90Var.m(pu90Var, 0, 0, 0.0f);
                    } else if (Intrinsics.d(objG0, "STATIC_HEADER_KEY")) {
                        ou90Var.m(pu90Var, 0, wzb.b(pz40Var), 0.0f);
                    } else if (Intrinsics.d(objG0, "COLLAPSING_HEADER_KEY")) {
                        ou90Var.m(pu90Var, 0, wzb.b(pz40Var) - si30.b(fL), 0.0f);
                    } else if (Intrinsics.d(objG0, "ANIMATED_CONTENT_KEY")) {
                        ou90Var.m(pu90Var, 0, (wzb.b(pz40Var) + i) - si30.b(fL), 1.0f);
                    } else if (Intrinsics.d(objG0, "TOOLBAR_KEY")) {
                        ou90Var.m(pu90Var, 0, 0, 1.0f);
                    }
                }
                return Unit.f46060a;
            case 4:
                nkx nkxVar = (nkx) obj3;
                ry40 ry40Var = (ry40) obj2;
                if (obj == ((zbk) obj4)) {
                    jf4.n("A derived state calculation cannot read itself");
                    return null;
                }
                if (obj instanceof b8m0) {
                    int i4 = nkxVar.f23702a - i;
                    int iD = ry40Var.d(obj);
                    ry40Var.g(Math.min(i4, iD >= 0 ? ry40Var.c[iD] : Integer.MAX_VALUE), obj);
                }
                return Unit.f46060a;
            case 5:
                yyl yylVar = (yyl) obj4;
                DsChip dsChip = (DsChip) obj3;
                mxl mxlVar = (mxl) obj2;
                ((View) obj).getClass();
                int iOrdinal = yylVar.e.ordinal();
                if (iOrdinal == 0) {
                    int childCount = yylVar.getChildCount();
                    for (int i5 = 0; i5 < childCount; i5++) {
                        View childAt = yylVar.getChildAt(i5);
                        if ((childAt instanceof DsChip) && childAt != dsChip) {
                            ((DsChip) childAt).setSelected(false);
                        }
                    }
                    boolean z = !dsChip.isSelected();
                    dsChip.setSelected(z);
                    Function2 function3 = yylVar.g;
                    if (function3 != null) {
                        function3.invoke(mxl.a(mxlVar, z), Integer.valueOf(i));
                    }
                } else if (iOrdinal == 1) {
                    boolean z2 = !dsChip.isSelected();
                    dsChip.setSelected(z2);
                    Function2 function4 = yylVar.g;
                    if (function4 != null) {
                        function4.invoke(mxl.a(mxlVar, z2), Integer.valueOf(i));
                    }
                } else {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return null;
                    }
                    Function2 function5 = yylVar.g;
                    if (function5 != null) {
                        function5.invoke(mxlVar, Integer.valueOf(i));
                    }
                }
                return Unit.f46060a;
            case 6:
                xk80 xk80Var = (xk80) obj4;
                k6z k6zVar = (k6z) obj3;
                t33 t33Var = (t33) obj2;
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                float fL2 = xk80Var.l() + (xk80Var.k() - i);
                float f2 = k6zVar == k6z.b ? -1.0f : 1.0f;
                float fFloatValue2 = ((Number) t33Var.d()).floatValue();
                float f3 = (0.100000024f * fFloatValue2) + 0.9f;
                uag0Var.H(Float.intBitsToFloat((int) (uag0Var.r >> 32)) * fL2 * f2);
                uag0Var.w(f3);
                uag0Var.y(f3);
                uag0Var.b(fFloatValue2);
                return Unit.f46060a;
            case 7:
                u4s u4sVar = (u4s) obj3;
                n4s n4sVar = (n4s) obj2;
                ((View) obj).getClass();
                xdr xdrVar2 = ((o4s) obj4).h;
                if (xdrVar2 != null) {
                    u4sVar.getClass();
                    xdrVar2.F(u4sVar, Integer.valueOf(i), n4sVar.u.getLoadedPictureUrl());
                }
                return Unit.f46060a;
            case 8:
                pu90 pu90Var2 = (pu90) obj4;
                pu90 pu90Var3 = (pu90) obj3;
                pu90 pu90Var4 = (pu90) obj2;
                ou90 ou90Var2 = (ou90) obj;
                ou90Var2.getClass();
                if (pu90Var2 != null) {
                    ou90Var2.m(pu90Var2, 0, 0, 0.0f);
                }
                if (pu90Var3 != null) {
                    ou90Var2.m(pu90Var3, 0, 0, 0.0f);
                }
                if (pu90Var4 != null) {
                    ou90Var2.m(pu90Var4, 0, i - pu90Var4.b, 0.0f);
                }
                return Unit.f46060a;
            case 9:
                ylw ylwVar = (ylw) obj4;
                vj30 vj30Var = (vj30) obj3;
                pu90 pu90Var5 = (pu90) obj2;
                ou90 ou90Var3 = (ou90) obj;
                int i6 = ylwVar.c;
                d7q0 d7q0Var = ylwVar.b;
                nls0 nls0Var = ylwVar.d;
                b9q0 b9q0Var = (b9q0) ylwVar.e.invoke();
                d7q0Var.a(ma80.b, yum0.g(ou90Var3, i6, nls0Var, b9q0Var != null ? b9q0Var.f2224a : null, vj30Var.getLayoutDirection() == k6z.b, pu90Var5.f27604a), i, pu90Var5.f27604a);
                ou90Var3.m(pu90Var5, Math.round(-d7q0Var.f5606a.l()), 0, 0.0f);
                return Unit.f46060a;
            case 10:
                String str = (String) obj3;
                mvc mvcVar = (mvc) obj2;
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                ((ip50) obj4).v.getClass();
                str.getClass();
                mvcVar.getClass();
                k0w0Var.h(new PromotionsNewsScreenFactoryImpl$getNewsCatalogTypeScreen$1(i, str, mvcVar));
                return Unit.f46060a;
            case 11:
                String str2 = (String) obj3;
                mvc mvcVar2 = (mvc) obj2;
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                ((xp50) obj4).v.getClass();
                str2.getClass();
                mvcVar2.getClass();
                k0w0Var2.h(new PromotionsNewsScreenFactoryImpl$getNewsCatalogTypeScreen$1(i, str2, mvcVar2));
                return Unit.f46060a;
            case 12:
                String str3 = (String) obj3;
                mvc mvcVar3 = (mvc) obj2;
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                ((gt50) obj4).v.getClass();
                str3.getClass();
                mvcVar3.getClass();
                k0w0Var3.h(new PromotionsNewsScreenFactoryImpl$getNewsCatalogTypeScreen$1(i, str3, mvcVar3));
                return Unit.f46060a;
            case 13:
                mlr mlrVar = (mlr) obj3;
                String str4 = (String) obj2;
                jdk0 jdk0Var = ((v3b0) obj4).L;
                long j = mlrVar.f22006a;
                String str5 = mlrVar.f;
                long j2 = mlrVar.c;
                boolean z3 = mlrVar.l;
                long j3 = mlrVar.b;
                boolean z4 = mlrVar.m;
                boolean z5 = mlrVar.n;
                jdk0Var.getClass();
                c8d c8dVar = (c8d) ((k0w0) obj).h(jdk0.f(j, str5, j2, z3, j3, z4, false, this.b, z5, false, false, str4, true)).f14945a;
                bjk bjkVar = cfx0.o;
                c8dVar.f3908a = new v7d(!mlrVar.n, bjkVar, bjkVar);
                return Unit.f46060a;
            default:
                xk80 xk80Var2 = (xk80) obj4;
                l7m0 l7m0Var = (l7m0) obj3;
                l7m0 l7m0Var2 = (l7m0) obj2;
                uag0 uag0Var2 = (uag0) obj;
                uag0Var2.getClass();
                uag0Var2.H(Float.intBitsToFloat((int) (uag0Var2.r >> 32)) * (xk80Var2.l() + (xk80Var2.k() - i)));
                uag0Var2.w(((Number) l7m0Var.getValue()).floatValue() == 0.0f ? 0.9f : ((Number) l7m0Var.getValue()).floatValue());
                uag0Var2.y(((Number) l7m0Var.getValue()).floatValue() != 0.0f ? ((Number) l7m0Var.getValue()).floatValue() : 0.9f);
                uag0Var2.b(((Number) l7m0Var2.getValue()).floatValue());
                return Unit.f46060a;
        }
    }

    public /* synthetic */ ec3(Object obj, Object obj2, int i, Object obj3, byte b) {
        this.f7547a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
    }

    public /* synthetic */ ec3(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.f7547a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }
}
