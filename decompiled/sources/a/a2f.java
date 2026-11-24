package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class a2f extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ Function1 j;
    public boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a2f(Function1 function1, boolean z, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = function1;
        this.k = z;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Function1 function1 = this.j;
        switch (b) {
            case 0:
                return new a2f(function1, this.k, yjeVar, (byte) 0);
            case 1:
                return new a2f(function1, this.k, yjeVar, (byte) 1);
            case 2:
                return new a2f(function1, yjeVar, (byte) 2);
            case 3:
                a2f a2fVar = new a2f(function1, yjeVar, (byte) 3);
                a2fVar.k = ((Boolean) obj).booleanValue();
                return a2fVar;
            case 4:
                return new a2f(function1, this.k, yjeVar, (byte) 4);
            case 5:
                return new a2f(function1, this.k, yjeVar, (byte) 5);
            case 6:
                return new a2f(function1, yjeVar, (byte) 6);
            case 7:
                return new a2f(function1, yjeVar, (byte) 7);
            case 8:
                return new a2f(function1, yjeVar, (byte) 8);
            case 9:
                return new a2f(function1, yjeVar, (byte) 9);
            case 10:
                return new a2f(function1, yjeVar, (byte) 10);
            case 11:
                return new a2f(function1, yjeVar, (byte) 11);
            case 12:
                return new a2f(function1, yjeVar, (byte) 12);
            default:
                return new a2f(function1, yjeVar, (byte) 13);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((a2f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((a2f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((a2f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((a2f) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((a2f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((a2f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((a2f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((a2f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((a2f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((a2f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((a2f) create(Integer.valueOf(((Number) obj).intValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((a2f) create(Integer.valueOf(((Number) obj).intValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((a2f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((a2f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        Function1 function1 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                function1.invoke(new s1f(this.k));
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                function1.invoke(Boolean.valueOf(this.k));
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z = this.k;
                if (!z) {
                    z1x.P(obj);
                    this.k = true;
                    if (function1.invoke(this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                boolean z2 = this.k;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                function1.invoke(new k2f0(z2));
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                function1.invoke(new ucn0(this.k));
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                function1.invoke(new wdn0(this.k));
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z3 = this.k;
                if (!z3) {
                    z1x.P(obj);
                    this.k = true;
                    if (function1.invoke(this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z4 = this.k;
                if (!z4) {
                    z1x.P(obj);
                    this.k = true;
                    if (function1.invoke(this) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                boolean z5 = this.k;
                if (!z5) {
                    z1x.P(obj);
                    this.k = true;
                    Object objInvoke = function1.invoke(this);
                    return objInvoke == wneVar9 ? wneVar9 : objInvoke;
                }
                if (z5) {
                    z1x.P(obj);
                    return obj;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 9:
                wne wneVar10 = wne.f39444a;
                boolean z6 = this.k;
                if (!z6) {
                    z1x.P(obj);
                    this.k = true;
                    if (function1.invoke(this) == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                boolean z7 = this.k;
                if (!z7) {
                    z1x.P(obj);
                    this.k = true;
                    if (function1.invoke(this) == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z7) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 11:
                wne wneVar12 = wne.f39444a;
                boolean z8 = this.k;
                if (!z8) {
                    z1x.P(obj);
                    this.k = true;
                    if (function1.invoke(this) == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 12:
                wne wneVar13 = wne.f39444a;
                boolean z9 = this.k;
                if (!z9) {
                    z1x.P(obj);
                    this.k = true;
                    Object objInvoke2 = function1.invoke(this);
                    return objInvoke2 == wneVar13 ? wneVar13 : objInvoke2;
                }
                if (z9) {
                    z1x.P(obj);
                    return obj;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                wne wneVar14 = wne.f39444a;
                boolean z10 = this.k;
                if (!z10) {
                    z1x.P(obj);
                    this.k = true;
                    if (function1.invoke(this) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a2f(Function1 function1, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = function1;
    }
}
