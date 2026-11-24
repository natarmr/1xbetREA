package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mpg implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22179a;
    public final /* synthetic */ upg b;

    public /* synthetic */ mpg(upg upgVar, byte b) {
        this.f22179a = b;
        this.b = upgVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f22179a;
        upg upgVar = this.b;
        switch (b) {
            case 0:
                kwd kwdVar = upg.X1;
                ((uzg) upgVar.H0().d).a();
                return Unit.f46060a;
            case 1:
                nei neiVar = upgVar.K1;
                if (neiVar != null) {
                    return new q0h0(neiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                kwd kwdVar2 = upg.X1;
                opg opgVar = new opg(upgVar.H0());
                ppg ppgVar = new ppg(upgVar.H0());
                qpg qpgVar = new qpg(upgVar.H0());
                mhc mhcVar = new mhc(2, upgVar.H0(), vqg.class, "onChampInfoClick", "onChampInfoClick(JLjava/lang/String;)V", 0, (byte) 23);
                oye oyeVar = new oye(0, upgVar.H0(), vqg.class, "onDisciplineClick", "onDisciplineClick()V", 0, (byte) 21);
                rpg rpgVar = new rpg(upgVar.H0());
                z9f z9fVar = new z9f(upgVar, (byte) 5);
                final spg spgVar = new spg(upgVar.H0());
                x6f x6fVar = new x6f(1, upgVar.H0(), vqg.class, "onItemStatisticsTabClick", "onItemStatisticsTabClick(J)V", 0, (byte) 22);
                x6f x6fVar2 = new x6f(1, upgVar.H0(), vqg.class, "onItemStatisticsPlayerClick", "onItemStatisticsPlayerClick(J)V", 0, (byte) 17);
                x6f x6fVar3 = new x6f(1, upgVar.H0(), vqg.class, "onPlayerAbilitiesTabClick", "onPlayerAbilitiesTabClick(J)V", 0, (byte) 18);
                x6f x6fVar4 = new x6f(1, upgVar.H0(), vqg.class, "onBestHeroPlayerClick", "onBestHeroPlayerClick(Ljava/lang/String;)V", 0, (byte) 19);
                x6f x6fVar5 = new x6f(1, upgVar.H0(), vqg.class, "onTeamClick", "onTeamClick(J)V", 0, (byte) 20);
                x6f x6fVar6 = new x6f(1, upgVar.H0(), vqg.class, "onTeamFavoriteClick", "onTeamFavoriteClick(J)V", 0, (byte) 21);
                jpg jpgVar = new jpg(jpg.f);
                gbn gbnVar = new gbn(new f4m((byte) 1), new e9k(3, (byte) 14), new dc0(x6fVar5, oyeVar, mhcVar, x6fVar6, (byte) 28), zdh.A);
                dp dpVar = jpgVar.d;
                dpVar.b(gbnVar);
                final byte b2 = 0;
                dpVar.b(new gbn(new p1h((byte) 15), new pue(3, (byte) 24), new wgh(qpgVar, (byte) 0), zdh.g));
                dpVar.b(new gbn(new s3t((byte) 19), new pkv(3, (byte) 5), new umu((byte) 18), fvr.f1));
                dpVar.b(new gbn(new jfa0((byte) 0), new iv60(3, (byte) 16), new yr80(rpgVar, (byte) 12), xk60.s));
                dpVar.b(new gbn(new p1h((byte) 10), new pue(3, (byte) 19), new m7h((byte) 9), zdh.b));
                dpVar.b(new gbn(new p1h((byte) 11), new pue(3, (byte) 20), new hfg(opgVar, (byte) 17), zdh.c));
                dpVar.b(new gbn(new jyf((byte) 28), new pue(3, (byte) 12), new vlf((byte) 25), fpd.y));
                dpVar.b(new gbn(new jyf((byte) 29), new pue(3, (byte) 13), new Function1() { // from class: a.u0h
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b3 = b2;
                        final spg spgVar2 = spgVar;
                        final cp cpVar = (cp) obj;
                        cpVar.getClass();
                        switch (b3) {
                            case 0:
                                jth jthVar = (jth) cpVar.u;
                                jthVar.f17100a.setLayoutDirection(3);
                                ConstraintLayout constraintLayout = jthVar.f17100a;
                                constraintLayout.getClass();
                                final byte b4 = 0;
                                dyb.O(constraintLayout, new Function1() { // from class: a.v0h
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b5 = b4;
                                        cp cpVar2 = cpVar;
                                        spg spgVar3 = spgVar2;
                                        ((View) obj2).getClass();
                                        switch (b5) {
                                            case 0:
                                                spgVar3.a(((cov) cpVar2.u()).f4720a);
                                                break;
                                            default:
                                                spgVar3.a(((m4k0) cpVar2.u()).f21175a);
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new ok(cpVar, cpVar, (byte) 22));
                                break;
                            default:
                                qth qthVar = (qth) cpVar.u;
                                qthVar.f29299a.setLayoutDirection(3);
                                ConstraintLayout constraintLayout2 = qthVar.f29299a;
                                constraintLayout2.getClass();
                                final byte b5 = 1;
                                dyb.O(constraintLayout2, new Function1() { // from class: a.v0h
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b6 = b5;
                                        cp cpVar2 = cpVar;
                                        spg spgVar3 = spgVar2;
                                        ((View) obj2).getClass();
                                        switch (b6) {
                                            case 0:
                                                spgVar3.a(((cov) cpVar2.u()).f4720a);
                                                break;
                                            default:
                                                spgVar3.a(((m4k0) cpVar2.u()).f21175a);
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new ok(cpVar, cpVar, (byte) 24));
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, fpd.z));
                dpVar.b(new gbn(new p1h((byte) 9), new pue(3, (byte) 18), new m7h((byte) 8), fpd.f1));
                final byte b3 = 1;
                dpVar.b(new gbn(new p1h((byte) 8), new pue(3, (byte) 17), new Function1() { // from class: a.u0h
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        byte b4 = b3;
                        final spg spgVar2 = spgVar;
                        final cp cpVar = (cp) obj;
                        cpVar.getClass();
                        switch (b4) {
                            case 0:
                                jth jthVar = (jth) cpVar.u;
                                jthVar.f17100a.setLayoutDirection(3);
                                ConstraintLayout constraintLayout = jthVar.f17100a;
                                constraintLayout.getClass();
                                final byte b5 = 0;
                                dyb.O(constraintLayout, new Function1() { // from class: a.v0h
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b6 = b5;
                                        cp cpVar2 = cpVar;
                                        spg spgVar3 = spgVar2;
                                        ((View) obj2).getClass();
                                        switch (b6) {
                                            case 0:
                                                spgVar3.a(((cov) cpVar2.u()).f4720a);
                                                break;
                                            default:
                                                spgVar3.a(((m4k0) cpVar2.u()).f21175a);
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new ok(cpVar, cpVar, (byte) 22));
                                break;
                            default:
                                qth qthVar = (qth) cpVar.u;
                                qthVar.f29299a.setLayoutDirection(3);
                                ConstraintLayout constraintLayout2 = qthVar.f29299a;
                                constraintLayout2.getClass();
                                final byte b6 = 1;
                                dyb.O(constraintLayout2, new Function1() { // from class: a.v0h
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        byte b7 = b6;
                                        cp cpVar2 = cpVar;
                                        spg spgVar3 = spgVar2;
                                        ((View) obj2).getClass();
                                        switch (b7) {
                                            case 0:
                                                spgVar3.a(((cov) cpVar2.u()).f4720a);
                                                break;
                                            default:
                                                spgVar3.a(((m4k0) cpVar2.u()).f21175a);
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                cpVar.t(new ok(cpVar, cpVar, (byte) 24));
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, fpd.Z));
                dpVar.b(new gbn(new p1h((byte) 1), new pue(3, (byte) 15), new hfg(ppgVar, (byte) 11), fpd.B));
                dpVar.b(new gbn(new jyf((byte) 24), new pue(3, (byte) 11), new vlf((byte) 19), fpd.x));
                dpVar.b(new gbn(new p1h((byte) 7), new pue(3, (byte) 16), new m7h((byte) 7), fpd.Y));
                dpVar.b(new gbn(new p1h((byte) 13), new pue(3, (byte) 22), new m7h((byte) 11), zdh.e));
                dpVar.b(new gbn(new zgp0((byte) 4), new asj0(3, (byte) 26), new meo0((byte) 22), pfo0.e));
                dpVar.b(new gbn(new j2l((byte) 2), new e9k(3, (byte) 12), new n2l((byte) 15), zdh.y));
                dpVar.b(new gbn(new j2l((byte) 3), new e9k(3, (byte) 13), new n2l((byte) 16), zdh.z));
                dpVar.b(new gbn(new j2l((byte) 1), new e9k(3, (byte) 11), new n2l((byte) 3), zdh.x));
                dpVar.b(new gbn(new vtf0((byte) 18), new o5c0(3, (byte) 22), new wtf0((byte) 19), x4c0.y));
                dpVar.b(new gbn(new p1h((byte) 12), new pue(3, (byte) 21), new m7h((byte) 10), zdh.d));
                dpVar.b(new gbn(new v1x((byte) 19), new tvx(3, (byte) 1), new okw(x6fVar, x6fVar2, (byte) 13), btv.Z));
                dpVar.b(new gbn(new so90((byte) 29), new iv60(3, (byte) 15), new yr80(x6fVar3, (byte) 10), xk60.r));
                dpVar.b(new gbn(new ofo0((byte) 28), new asj0(3, (byte) 24), new meo0((byte) 20), pfo0.c));
                dpVar.b(new gbn(new gh5((byte) 9), new lq4(3, (byte) 6), new os5(x6fVar4, (byte) 6), zx3.p));
                dpVar.b(new gbn(new t4s((byte) 25), new atq(3, (byte) 24), new vls((byte) 0), fvr.r));
                dpVar.b(new gbn(new p1h((byte) 14), new pue(3, (byte) 23), new hfg(z9fVar, (byte) 18), zdh.f));
                dpVar.b(new gbn(new svj((byte) 29), new e9k(3, (byte) 9), new vbk((byte) 28), zdh.v));
                return jpgVar;
        }
    }
}
