package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.game.core.game_screen.presentation.bottomsheet.CyberBottomSheetParams;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oa2 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24909a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ int k;

    public /* synthetic */ oa2(xex xexVar, CyberBottomSheetParams cyberBottomSheetParams, i3m i3mVar, d9z d9zVar, l7m0 l7m0Var, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        this.f24909a = (byte) 2;
        this.b = xexVar;
        this.c = cyberBottomSheetParams;
        this.d = i3mVar;
        this.e = d9zVar;
        this.j = l7m0Var;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.k = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f24909a;
        int i = this.k;
        Object obj3 = this.j;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                bsr0.v((mm40) obj7, (e2d) obj6, (qdz) obj5, (a4x) obj4, this.f, this.g, this.h, this.i, (Function1) obj3, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                mrv.J((mm40) obj7, (e2d) obj6, (qdz) obj5, (a4x) obj4, this.f, this.g, this.h, this.i, (Function1) obj3, (fet) obj, iL2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                ((xex) obj7).l((CyberBottomSheetParams) obj6, (i3m) obj5, (d9z) obj4, (l7m0) obj3, this.f, this.g, this.h, this.i, (fet) obj, iL3);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ oa2(mm40 mm40Var, e2d e2dVar, qdz qdzVar, a4x a4xVar, boolean z, boolean z2, boolean z3, boolean z4, Function1 function1, int i, byte b) {
        this.f24909a = b;
        this.b = mm40Var;
        this.c = e2dVar;
        this.d = qdzVar;
        this.e = a4xVar;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = function1;
        this.k = i;
    }
}
