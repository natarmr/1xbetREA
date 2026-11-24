package a;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class k9z implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17937a;
    public final l9z b;

    public /* synthetic */ k9z(l9z l9zVar, byte b) {
        this.f17937a = b;
        this.b = l9zVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f17937a;
        l9z l9zVar = this.b;
        switch (b) {
            case 0:
                if (rek.f(l9zVar) == null) {
                    return null;
                }
                Object obj = l9zVar.g.b;
                return null;
            case 1:
                mqe0 mqe0Var = l9zVar.h;
                ArrayList<are0> typeParameters = mqe0Var.getTypeParameters();
                ArrayList arrayList = new ArrayList(r3d.q(typeParameters, 10));
                for (are0 are0Var : typeParameters) {
                    hzs0 hzs0VarC = ((mzs0) l9zVar.j.c).c(are0Var);
                    if (hzs0VarC == null) {
                        throw new AssertionError("Parameter " + are0Var + " surely belongs to class " + mqe0Var + ", so it must be resolved");
                    }
                    arrayList.add(hzs0VarC);
                }
                return arrayList;
            default:
                return nsm0.o(l9zVar);
        }
    }
}
