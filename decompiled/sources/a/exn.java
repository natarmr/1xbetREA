package a;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class exn implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8586a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public exn(int i, Function0 function0, pz40 pz40Var) {
        this.b = i;
        this.c = function0;
        this.d = pz40Var;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        mnq mnqVar;
        byte b = this.f8586a;
        Object obj2 = this.d;
        int i = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                mcz mczVar = (mcz) obj;
                ncz nczVar = (ncz) CollectionsKt.f0(mczVar.l);
                if ((nczVar != null ? nczVar.f23317a : -1) >= mczVar.o - i && ((Boolean) ((pz40) obj2).getValue()).booleanValue()) {
                    ((Function0) obj3).invoke();
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof mnq) {
                    mnqVar = (mnq) yjeVar;
                    int i2 = mnqVar.k;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        mnqVar.k = i2 - Integer.MIN_VALUE;
                    } else {
                        mnqVar = new mnq(this, yjeVar);
                    }
                } else {
                    mnqVar = new mnq(this, yjeVar);
                }
                Object obj4 = mnqVar.i;
                wne wneVar = wne.f39444a;
                int i3 = mnqVar.k;
                if (i3 == 0) {
                    z1x.P(obj4);
                    kie0 kie0Var = (kie0) obj3;
                    int i4 = kie0Var.f18333a;
                    if (i4 >= i) {
                        mnqVar.k = 1;
                        if (((kmq) obj2).a(obj, mnqVar) == wneVar) {
                            return wneVar;
                        }
                    } else {
                        kie0Var.f18333a = i4 + 1;
                    }
                } else {
                    if (i3 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj4);
                }
                return Unit.f46060a;
        }
    }

    public exn(kie0 kie0Var, int i, kmq kmqVar) {
        this.c = kie0Var;
        this.b = i;
        this.d = kmqVar;
    }
}
