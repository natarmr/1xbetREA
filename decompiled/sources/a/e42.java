package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class e42 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ org.xplatform.special_event.impl.alleventsgames.presentation.f k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e42(org.xplatform.special_event.impl.alleventsgames.presentation.f fVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = fVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        org.xplatform.special_event.impl.alleventsgames.presentation.f fVar = this.k;
        switch (b) {
            case 0:
                e42 e42Var = new e42(fVar, yjeVar, (byte) 0);
                e42Var.j = obj;
                return e42Var;
            case 1:
                e42 e42Var2 = new e42(fVar, yjeVar, (byte) 1);
                e42Var2.j = obj;
                return e42Var2;
            case 2:
                e42 e42Var3 = new e42(fVar, yjeVar, (byte) 2);
                e42Var3.j = obj;
                return e42Var3;
            default:
                e42 e42Var4 = new e42(fVar, yjeVar, (byte) 3);
                e42Var4.j = obj;
                return e42Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((e42) create((dqk0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((e42) create((dqk0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((e42) create((dqk0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((e42) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        final byte b2 = 1;
        final byte b3 = 2;
        final byte b4 = 0;
        final org.xplatform.special_event.impl.alleventsgames.presentation.f fVar = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                s32 s32Var = new s32(fVar, (byte) 1);
                Function0 function0 = new Function0() { // from class: a.d42
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b5 = b4;
                        org.xplatform.special_event.impl.alleventsgames.presentation.f fVar2 = fVar;
                        switch (b5) {
                            case 0:
                                u32 u32Var = new u32(m32.b, iun.f15405a, xun.f41520a);
                                int i = org.xplatform.special_event.impl.alleventsgames.presentation.f.Q;
                                fVar2.R(u32Var);
                                break;
                            case 1:
                                v32 v32Var = new v32(m32.b, iun.f15405a);
                                int i2 = org.xplatform.special_event.impl.alleventsgames.presentation.f.Q;
                                fVar2.R(v32Var);
                                break;
                            default:
                                w32 w32Var = new w32(m32.b, iun.f15405a);
                                int i3 = org.xplatform.special_event.impl.alleventsgames.presentation.f.Q;
                                fVar2.R(w32Var);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                int i = org.xplatform.special_event.impl.alleventsgames.presentation.f.Q;
                fVar.P((dqk0) obj2, s32Var, function0);
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                s32 s32Var2 = new s32(fVar, (byte) 2);
                Function0 function1 = new Function0() { // from class: a.d42
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b5 = b2;
                        org.xplatform.special_event.impl.alleventsgames.presentation.f fVar2 = fVar;
                        switch (b5) {
                            case 0:
                                u32 u32Var = new u32(m32.b, iun.f15405a, xun.f41520a);
                                int i2 = org.xplatform.special_event.impl.alleventsgames.presentation.f.Q;
                                fVar2.R(u32Var);
                                break;
                            case 1:
                                v32 v32Var = new v32(m32.b, iun.f15405a);
                                int i3 = org.xplatform.special_event.impl.alleventsgames.presentation.f.Q;
                                fVar2.R(v32Var);
                                break;
                            default:
                                w32 w32Var = new w32(m32.b, iun.f15405a);
                                int i4 = org.xplatform.special_event.impl.alleventsgames.presentation.f.Q;
                                fVar2.R(w32Var);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                int i2 = org.xplatform.special_event.impl.alleventsgames.presentation.f.Q;
                fVar.P((dqk0) obj2, s32Var2, function1);
                fVar.Q();
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                s32 s32Var3 = new s32(fVar, (byte) 3);
                Function0 function2 = new Function0() { // from class: a.d42
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b5 = b3;
                        org.xplatform.special_event.impl.alleventsgames.presentation.f fVar2 = fVar;
                        switch (b5) {
                            case 0:
                                u32 u32Var = new u32(m32.b, iun.f15405a, xun.f41520a);
                                int i3 = org.xplatform.special_event.impl.alleventsgames.presentation.f.Q;
                                fVar2.R(u32Var);
                                break;
                            case 1:
                                v32 v32Var = new v32(m32.b, iun.f15405a);
                                int i4 = org.xplatform.special_event.impl.alleventsgames.presentation.f.Q;
                                fVar2.R(v32Var);
                                break;
                            default:
                                w32 w32Var = new w32(m32.b, iun.f15405a);
                                int i5 = org.xplatform.special_event.impl.alleventsgames.presentation.f.Q;
                                fVar2.R(w32Var);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                int i3 = org.xplatform.special_event.impl.alleventsgames.presentation.f.Q;
                fVar.P((dqk0) obj2, s32Var3, function2);
                fVar.Q();
                break;
            default:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                fVar.r.b((Throwable) obj2, new f42(fVar, (byte) 0));
                break;
        }
        return Unit.f46060a;
    }
}
