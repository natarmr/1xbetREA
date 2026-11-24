package a;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class x43 extends guy implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f40246a;
    public final /* synthetic */ oms0 b;
    public final /* synthetic */ ed90 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ i53 e;
    public final /* synthetic */ SnapshotStateList f;
    public final /* synthetic */ ydr g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x43(Object obj, oms0 oms0Var, ed90 ed90Var, Function1 function1, i53 i53Var, SnapshotStateList snapshotStateList, ydr ydrVar) {
        super(2);
        this.f40246a = obj;
        this.b = oms0Var;
        this.c = ed90Var;
        this.d = function1;
        this.e = i53Var;
        this.f = snapshotStateList;
        this.g = ydrVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        lie lieVar;
        alo aloVar;
        fet fetVar = (fet) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            oms0 oms0Var = this.b;
            pz40 pz40Var = oms0Var.e;
            pz40 pz40Var2 = oms0Var.d;
            Object value = ((hgk0) pz40Var).getValue();
            Object obj3 = this.f40246a;
            boolean zH = fetVar.h(Intrinsics.d(obj3, value));
            Object objP = fetVar.P();
            Function1 function1 = this.d;
            ed90 ed90Var = this.c;
            cl5 cl5Var = ukd.f35823a;
            i53 i53Var = this.e;
            if (zH || objP == cl5Var) {
                if (!Intrinsics.d(obj3, ((hgk0) pz40Var).getValue()) || ed90Var == null) {
                    lieVar = (Intrinsics.d(obj3, oms0Var.f().d()) || Intrinsics.d(obj3, oms0Var.f().b())) ? (lie) function1.invoke(i53Var) : (lie) function1.invoke(new ed90(i53Var, oms0Var.f().d(), obj3));
                } else {
                    lieVar = (lie) function1.invoke(ed90Var);
                }
                objP = lieVar;
                fetVar.o0(objP);
            }
            lie lieVar2 = (lie) objP;
            hgk0 hgk0Var = (hgk0) pz40Var;
            boolean zH2 = fetVar.h(Intrinsics.d(oms0Var.f().b(), obj3)) | fetVar.h(Intrinsics.d(obj3, hgk0Var.getValue()));
            Object objP2 = fetVar.P();
            if (zH2 || objP2 == cl5Var) {
                if (Intrinsics.d(oms0Var.f().b(), obj3) || (Intrinsics.d(obj3, hgk0Var.getValue()) && ed90Var != null)) {
                    aloVar = alo.b;
                } else {
                    aloVar = (Intrinsics.d(obj3, oms0Var.f().d()) || Intrinsics.d(obj3, oms0Var.f().b())) ? ((lie) function1.invoke(i53Var)).b : ((lie) function1.invoke(new ed90(i53Var, obj3, oms0Var.f().d()))).b;
                }
                objP2 = aloVar;
                fetVar.o0(objP2);
            }
            alo aloVar2 = (alo) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = new d53(Intrinsics.d(obj3, ((hgk0) pz40Var2).getValue()));
                fetVar.o0(objP3);
            }
            d53 d53Var = (d53) objP3;
            pzn pznVar = lieVar2.f20099a;
            a3w0 a3w0Var = new a3w0(obj3, lieVar2.c.l());
            hgk0 hgk0Var2 = (hgk0) pz40Var2;
            ((hgk0) d53Var.b).setValue(Boolean.valueOf(Intrinsics.d(obj3, hgk0Var2.getValue())));
            ((hgk0) d53Var.c).setValue(Boolean.valueOf((!Intrinsics.d(obj3, hgk0Var.getValue()) || Intrinsics.d(obj3, hgk0Var2.getValue()) || Intrinsics.d(obj3, oms0Var.f25519a.y0())) ? false : true));
            mm40 mm40VarE = a3w0Var.e(d53Var);
            boolean zI = fetVar.i(obj3);
            Object objP4 = fetVar.P();
            if (zI || objP4 == cl5Var) {
                objP4 = new s43(obj3, (byte) 0);
                fetVar.o0(objP4);
            }
            Function1 function2 = (Function1) objP4;
            boolean zG = fetVar.g(aloVar2);
            Object objP5 = fetVar.P();
            if (zG || objP5 == cl5Var) {
                objP5 = new t43(aloVar2, (byte) 0);
                fetVar.o0(objP5);
            }
            b34.d(this.b, function2, mm40VarE, pznVar, aloVar2, (Function2) objP5, u1c.M(1831990167, new w43(obj3, this.f, i53Var, this.g, (byte) 0), fetVar), fetVar, 100663296);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }
}
