package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: renamed from: a.for, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class Cfor extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ spr k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Cfor(spr sprVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = sprVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        spr sprVar = this.k;
        switch (b) {
            case 0:
                return new Cfor(sprVar, yjeVar, (byte) 0);
            case 1:
                return new Cfor(sprVar, yjeVar, (byte) 1);
            case 2:
                Cfor cfor = new Cfor(sprVar, yjeVar, (byte) 2);
                cfor.j = ((Boolean) obj).booleanValue();
                return cfor;
            case 3:
                Cfor cfor2 = new Cfor(sprVar, yjeVar, (byte) 3);
                cfor2.j = ((Boolean) obj).booleanValue();
                return cfor2;
            case 4:
                Cfor cfor3 = new Cfor(sprVar, yjeVar, (byte) 4);
                cfor3.j = ((Boolean) obj).booleanValue();
                return cfor3;
            case 5:
                Cfor cfor4 = new Cfor(sprVar, yjeVar, (byte) 5);
                cfor4.j = ((Boolean) obj).booleanValue();
                return cfor4;
            case 6:
                Cfor cfor5 = new Cfor(sprVar, yjeVar, (byte) 6);
                cfor5.j = ((Boolean) obj).booleanValue();
                return cfor5;
            case 7:
                return new Cfor(sprVar, yjeVar, (byte) 7);
            case 8:
                return new Cfor(sprVar, yjeVar, (byte) 8);
            case 9:
                return new Cfor(sprVar, yjeVar, (byte) 9);
            default:
                return new Cfor(sprVar, yjeVar, (byte) 10);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((Cfor) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((Cfor) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((Cfor) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((Cfor) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((Cfor) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return ((Cfor) create(bool4, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                return ((Cfor) create(bool5, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((Cfor) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((Cfor) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((Cfor) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((Cfor) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        byte b2 = 22;
        byte b3 = 2;
        byte b4 = 0;
        yje yjeVar = null;
        byte b5 = 1;
        spr sprVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    jru jruVar = sprVar.R;
                    long j = ((qnr) sprVar.D()).e;
                    this.j = true;
                    obj = jruVar.e(j, this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                hxk hxkVar = new hxk((String) obj, (byte) 13);
                int i = spr.j0;
                sprVar.H(hxkVar);
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    knr knrVar = new knr(R.string.game_screen_bet_builder_mode_unavailable);
                    int i2 = spr.j0;
                    sprVar.G(knrVar);
                    nvu nvuVar = sprVar.Z;
                    long j2 = ((qnr) sprVar.D()).f29044a;
                    this.j = true;
                    if (nvuVar.I(j2, this, false) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                sprVar.o.e("KEY_BET_BUILDER_AVAILABILITY", Boolean.valueOf(z3));
                return Unit.f46060a;
            case 3:
                boolean z4 = this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                int i3 = spr.j0;
                if (z4 != ((qnr) sprVar.D()).Y) {
                    sprVar.H(new jv1(z4, sprVar, b2));
                    sprVar.O();
                }
                return Unit.f46060a;
            case 4:
                boolean z5 = this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                obg obgVar = new obg((byte) 4, z5);
                int i4 = spr.j0;
                sprVar.H(obgVar);
                return Unit.f46060a;
            case 5:
                boolean z6 = this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                obg obgVar2 = new obg((byte) 5, z6);
                int i5 = spr.j0;
                sprVar.H(obgVar2);
                return Unit.f46060a;
            case 6:
                boolean z7 = this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                if (z7) {
                    int i6 = spr.j0;
                    sprVar.O();
                    sprVar.h0 = sac.T(dub.f0(sprVar.A.a(), new i89(sprVar.N.f15754a.f1372a.b, (byte) 22), ((ik6) sprVar.O.f25032a).f14910a.f13193a, new xo1(sprVar, yjeVar, b3)), jiu0.a(sprVar), dpr.h);
                } else {
                    int i7 = spr.j0;
                    c4m0 c4m0Var = sprVar.f0;
                    if (c4m0Var != null) {
                        c4m0Var.cancel(null);
                    }
                    c4m0 c4m0Var2 = sprVar.h0;
                    if (c4m0Var2 != null) {
                        c4m0Var2.cancel(null);
                    }
                    c4m0 c4m0Var3 = sprVar.e0;
                    if (c4m0Var3 != null) {
                        c4m0Var3.cancel(null);
                    }
                }
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    gmq gmqVarW = i120.W(sprVar.v.a());
                    gpr gprVar = new gpr(sprVar, b4);
                    this.j = true;
                    if (gmqVarW.c(gprVar, this) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    i89 i89VarA = ((n9s) sprVar.w.f40284a).a();
                    gpr gprVar2 = new gpr(sprVar, b5);
                    this.j = true;
                    if (i89VarA.c(gprVar2, this) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    fnq fnqVarA = sprVar.z.a();
                    gpr gprVar3 = new gpr(sprVar, b3);
                    this.j = true;
                    if (fnqVarA.c(gprVar3, this) == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar11 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    vpu vpuVar = sprVar.y;
                    this.j = true;
                    if (vpuVar.b(false, this) == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                nnr nnrVar = nnr.c;
                int i8 = spr.j0;
                sprVar.G(nnrVar);
                return Unit.f46060a;
        }
    }
}
