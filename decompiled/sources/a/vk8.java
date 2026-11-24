package a;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.game.universal.impl.presentation.crystal.view.CrystalFieldView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vk8 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37562a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vk8(int i, fqm fqmVar, Function2 function2, pz40 pz40Var) {
        this.f37562a = (byte) 2;
        this.b = i;
        this.c = fqmVar;
        this.d = function2;
        this.e = pz40Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f37562a;
        Object obj = this.e;
        Object obj2 = this.d;
        int i = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                ((Function1) obj3).invoke(new vh8(i, ((gh8) ((jh8) obj2)).b, (String) obj));
                dyb.u0();
                return Boolean.TRUE;
            case 1:
                CrystalFieldView.c((egf) obj2, ((CrystalFieldView) obj3).d, (cgf) ((ArrayList) obj).get(i), 0L);
                return Unit.f46060a;
            case 2:
                Function2 function2 = (Function2) obj2;
                pz40 pz40Var = (pz40) obj;
                boolean z = i == ((fqm) obj3).c.size() - 1;
                if (z) {
                    pz40Var.setValue(Boolean.TRUE);
                }
                function2.invoke(Integer.valueOf(i), Boolean.valueOf(z));
                return Unit.f46060a;
            case 3:
                t33 t33Var = (t33) obj3;
                fav favVar = (fav) obj;
                float fFloatValue = ((Number) t33Var.d()).floatValue() != 5.5f ? ((Number) ((t33) obj2).d()).floatValue() * (i / 2) : 0.0f;
                return Float.valueOf(favVar == fav.f9228a ? (((Number) t33Var.d()).floatValue() * i) + fFloatValue : (((Number) t33Var.d()).floatValue() * i) - fFloatValue);
            case 4:
                return Float.valueOf((((Number) ((t33) obj).d()).floatValue() * i) - (((Number) ((t33) obj3).d()).floatValue() != 5.5f ? ((Number) ((t33) obj2).d()).floatValue() * i : 0.0f));
            default:
                xk80 xk80Var = (xk80) obj2;
                ((Function1) obj3).invoke(new ei60(i, xk80Var.k(), xk80Var.n(), (String) obj));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ vk8(Object obj, int i, Object obj2, Object obj3, byte b) {
        this.f37562a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ vk8(CrystalFieldView crystalFieldView, egf egfVar, ArrayList arrayList, int i) {
        this.f37562a = (byte) 1;
        this.c = crystalFieldView;
        this.d = egfVar;
        this.e = arrayList;
        this.b = i;
    }
}
