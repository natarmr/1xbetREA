package a;

import java.lang.reflect.TypeVariable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class f9y implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9178a;
    public final h9y b;

    public /* synthetic */ f9y(h9y h9yVar, byte b) {
        this.f9178a = b;
        this.b = h9yVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f9178a;
        h9y h9yVar = this.b;
        switch (b) {
            case 0:
                TypeVariable[] typeParameters = h9yVar.c.j().getTypeParameters();
                TypeVariable[] typeParameters2 = h9yVar.B().getTypeParameters();
                typeParameters2.getClass();
                return (TypeVariable[]) qx3.r(typeParameters, typeParameters2);
            case 1:
                return ufx.x(h9yVar);
            default:
                return fre0.W(h9yVar) ? new ev9(h9yVar.B(), fre0.P(h9yVar)) : new fv9(h9yVar.B());
        }
    }
}
