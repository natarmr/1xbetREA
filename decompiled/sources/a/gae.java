package a;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class gae extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ aa40 j;
    public final /* synthetic */ o4v0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gae(aa40 aa40Var, o4v0 o4v0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = aa40Var;
        this.k = o4v0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        o4v0 o4v0Var = this.k;
        aa40 aa40Var = this.j;
        switch (b) {
            case 0:
                return new gae(aa40Var, o4v0Var, yjeVar, (byte) 0);
            case 1:
                return new gae(aa40Var, o4v0Var, yjeVar, (byte) 1);
            case 2:
                return new gae(aa40Var, o4v0Var, yjeVar, (byte) 2);
            case 3:
                return new gae(aa40Var, o4v0Var, yjeVar, (byte) 3);
            case 4:
                return new gae(aa40Var, o4v0Var, yjeVar, (byte) 4);
            case 5:
                return new gae(aa40Var, o4v0Var, yjeVar, (byte) 5);
            case 6:
                return new gae(aa40Var, o4v0Var, yjeVar, (byte) 6);
            case 7:
                return new gae(aa40Var, o4v0Var, yjeVar, (byte) 7);
            default:
                return new gae(aa40Var, o4v0Var, yjeVar, (byte) 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
        }
        return ((gae) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws IOException {
        byte b = this.i;
        o4v0 o4v0Var = this.k;
        aa40 aa40Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                aa40Var.b(aa40Var.f.d(g4v0.Companion.serializer(oun.INSTANCE.serializer()), o4v0Var));
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                aa40Var.b(aa40Var.f.d(g4v0.Companion.serializer(edy.Companion.serializer()), o4v0Var));
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                aa40Var.b(aa40Var.f.d(g4v0.Companion.serializer(oun.INSTANCE.serializer()), o4v0Var));
                break;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                aa40Var.b(aa40Var.f.d(g4v0.Companion.serializer(edy.Companion.serializer()), o4v0Var));
                break;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                aa40Var.b(aa40Var.f.d(g4v0.Companion.serializer(edy.Companion.serializer()), o4v0Var));
                break;
            case 5:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                aa40Var.b(aa40Var.f.d(g4v0.Companion.serializer(edy.Companion.serializer()), o4v0Var));
                break;
            case 6:
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                aa40Var.b(aa40Var.f.d(g4v0.Companion.serializer(oun.INSTANCE.serializer()), o4v0Var));
                break;
            case 7:
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                aa40Var.b(aa40Var.f.d(g4v0.Companion.serializer(dfi0.Companion.serializer()), o4v0Var));
                break;
            default:
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                aa40Var.b(aa40Var.f.d(g4v0.Companion.serializer(edy.Companion.serializer()), o4v0Var));
                break;
        }
        return Unit.f46060a;
    }
}
