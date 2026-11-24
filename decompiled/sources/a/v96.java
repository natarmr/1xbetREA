package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class v96 implements d5q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ugd f37019a;
    public final g050 b = new g050();
    public final pz40 c = androidx.compose.runtime.e.e(null);

    public v96(ugd ugdVar) {
        this.f37019a = ugdVar;
    }

    @Override // a.d5q0
    public final Object a(v4q0 v4q0Var, bnn0 bnn0Var) {
        Object objA = g050.a(this.b, new za(this, new u96(v4q0Var), null, (byte) 23), bnn0Var);
        return objA == wne.f39444a ? objA : Unit.f46060a;
    }

    public final void b(final int i, fet fetVar, final Function0 function0) {
        fet fetVar2;
        final Function0 function1;
        fetVar.g0(723898654);
        int i2 = (fetVar.g(this) ? 32 : 16) | i;
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            u96 u96Var = (u96) ((hgk0) this.c).getValue();
            if (u96Var == null) {
                yfe0 yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2(this, function0, i, b) { // from class: a.t96

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ byte f33546a;
                        public final /* synthetic */ v96 b;
                        public final /* synthetic */ Function0 c;

                        {
                            this.f33546a = b;
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b3 = this.f33546a;
                            fet fetVar3 = (fet) obj;
                            ((Integer) obj2).getClass();
                            switch (b3) {
                                case 0:
                                    this.b.b(x8x.L(7), fetVar3, this.c);
                                    break;
                                default:
                                    this.b.b(x8x.L(7), fetVar3, this.c);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    return;
                }
                return;
            }
            fetVar2 = fetVar;
            function1 = function0;
            this.f37019a.O(u96Var, u96Var.f35268a, function1, fetVar2, 384);
        } else {
            fetVar2 = fetVar;
            function1 = function0;
            fetVar2.X();
        }
        yfe0 yfe0VarU2 = fetVar2.u();
        if (yfe0VarU2 != null) {
            yfe0VarU2.d = new Function2(this, function1, i, b2) { // from class: a.t96

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ byte f33546a;
                public final /* synthetic */ v96 b;
                public final /* synthetic */ Function0 c;

                {
                    this.f33546a = b2;
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = this.f33546a;
                    fet fetVar3 = (fet) obj;
                    ((Integer) obj2).getClass();
                    switch (b3) {
                        case 0:
                            this.b.b(x8x.L(7), fetVar3, this.c);
                            break;
                        default:
                            this.b.b(x8x.L(7), fetVar3, this.c);
                            break;
                    }
                    return Unit.f46060a;
                }
            };
        }
    }
}
