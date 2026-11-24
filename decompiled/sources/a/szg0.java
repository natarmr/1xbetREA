package a;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class szg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qaj f33071a;

    static {
        qaj qajVar = new qaj();
        k0h0 k0h0Var = k0h0.f17467a;
        tre0 tre0Var = sre0.f32672a;
        qajVar.Z(tre0Var.b(Bundle.class), k0h0Var);
        qajVar.G(tre0Var.b(qz40.class), new awg0((byte) 7));
        qaj qajVarB = qajVar.b();
        qaj qajVar2 = new qaj();
        qajVar2.Z(tre0Var.b(Size.class), t7k0.f33472a);
        qajVar2.Z(tre0Var.b(SizeF.class), n7k0.f23046a);
        qajVar2.G(tre0Var.b(SparseArray.class), new awg0((byte) 8));
        qaj qajVarB2 = qajVar2.b();
        qaj qajVar3 = qhi0.f28741a;
        qaj qajVar4 = new qaj();
        qajVarB.c(qajVar4);
        qajVarB2.c(qajVar4);
        f33071a = qajVar4.b();
    }

    public static rzg0 a(Function1 function1) {
        rzg0 rzg0Var = rzg0.b;
        rzg0Var.getClass();
        qzg0 qzg0Var = new qzg0();
        qzg0Var.f29576a = rzg0Var.f31359a;
        function1.invoke(qzg0Var);
        qaj qajVar = qzg0Var.f29576a;
        qaj qajVar2 = qhi0.f28741a;
        qaj qajVar3 = f33071a;
        qajVar3.getClass();
        qajVar.getClass();
        qaj qajVar4 = new qaj();
        qajVar3.c(qajVar4);
        qajVar.c(new ugf0(qajVar4));
        return new rzg0(qajVar4.b());
    }
}
