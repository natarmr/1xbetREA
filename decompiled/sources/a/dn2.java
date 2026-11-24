package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class dn2 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6347a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ dn2(l7m0 l7m0Var, Function1 function1, byte b) {
        this.f6347a = b;
        this.b = l7m0Var;
        this.c = function1;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        byte b = this.f6347a;
        l7m0 l7m0Var = this.b;
        Function1 function1 = this.c;
        switch (b) {
            case 0:
                ((Boolean) obj).getClass();
                function1.invoke(new sm2(((Boolean) l7m0Var.getValue()).booleanValue()));
                break;
            case 1:
                int iIntValue = ((Number) obj).intValue();
                if (iIntValue != ((wtz) l7m0Var.getValue()).d) {
                    function1.invoke(new tsz(iIntValue));
                }
                break;
            case 2:
                int iIntValue2 = ((Number) obj).intValue();
                if (iIntValue2 != ((jvz) l7m0Var.getValue()).d) {
                    function1.invoke(new suz(iIntValue2));
                }
                break;
            case 3:
                int iIntValue3 = ((Number) obj).intValue();
                if (iIntValue3 != ((xwz) l7m0Var.getValue()).c) {
                    function1.invoke(new bwz(iIntValue3));
                }
                break;
            case 4:
                int iIntValue4 = ((Number) obj).intValue();
                if (iIntValue4 != ((uyz) l7m0Var.getValue()).d && !((uyz) l7m0Var.getValue()).c) {
                    function1.invoke(new lxz(iIntValue4));
                }
                break;
            case 5:
                int iIntValue5 = ((Number) obj).intValue();
                if (iIntValue5 != ((h100) l7m0Var.getValue()).d) {
                    function1.invoke(new xzz(iIntValue5));
                }
                break;
            case 6:
                int iIntValue6 = ((Number) obj).intValue();
                if (iIntValue6 != ((r400) l7m0Var.getValue()).c) {
                    function1.invoke(new w300(iIntValue6));
                }
                break;
            case 7:
                function1.invoke(new s670(((Boolean) obj).booleanValue(), (int) ((tly) l7m0Var.getValue()).b));
                break;
            default:
                ((Boolean) obj).getClass();
                function1.invoke(new zb80(((Boolean) l7m0Var.getValue()).booleanValue()));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ dn2(Function1 function1, l7m0 l7m0Var, byte b) {
        this.f6347a = b;
        this.c = function1;
        this.b = l7m0Var;
    }
}
