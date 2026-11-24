.class public final La/vx4;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:La/fy4;

.field public final synthetic j:La/hxu;

.field public final synthetic k:Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

.field public final synthetic l:Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;

.field public final synthetic m:D


# direct methods
.method public constructor <init>(La/fy4;La/hxu;Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;DLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/vx4;->i:La/fy4;

    .line 2
    .line 3
    iput-object p2, p0, La/vx4;->j:La/hxu;

    .line 4
    .line 5
    iput-object p3, p0, La/vx4;->k:Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 6
    .line 7
    iput-object p4, p0, La/vx4;->l:Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;

    .line 8
    .line 9
    iput-wide p5, p0, La/vx4;->m:D

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p7}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 8

    .line 1
    new-instance v0, La/vx4;

    .line 2
    .line 3
    iget-object v4, p0, La/vx4;->l:Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;

    .line 4
    .line 5
    iget-wide v5, p0, La/vx4;->m:D

    .line 6
    .line 7
    iget-object v1, p0, La/vx4;->i:La/fy4;

    .line 8
    .line 9
    iget-object v2, p0, La/vx4;->j:La/hxu;

    .line 10
    .line 11
    iget-object v3, p0, La/vx4;->k:Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 12
    .line 13
    move-object v7, p2

    .line 14
    invoke-direct/range {v0 .. v7}, La/vx4;-><init>(La/fy4;La/hxu;Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;DLa/yje;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/vx4;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/vx4;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/vx4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/wne;->a:La/wne;

    .line 4
    .line 5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, v0, La/vx4;->l:Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;

    .line 9
    .line 10
    iget-object v1, v1, Lorg/xplatform/make_bet/impl/presentation/model/CoefStepInputUiModel;->a:Ljava/math/BigDecimal;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/math/BigDecimal;->doubleValue()D

    .line 13
    .line 14
    .line 15
    move-result-wide v5

    .line 16
    iget-wide v7, v0, La/vx4;->m:D

    .line 17
    .line 18
    iget-object v1, v0, La/vx4;->k:Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 19
    .line 20
    iget-wide v3, v1, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->a:D

    .line 21
    .line 22
    iget-object v2, v0, La/vx4;->i:La/fy4;

    .line 23
    .line 24
    invoke-virtual/range {v2 .. v8}, La/fy4;->x(DDD)D

    .line 25
    .line 26
    .line 27
    move-result-wide v9

    .line 28
    iget-object v11, v1, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->f:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v14, v2, La/fy4;->l:La/ctf0;

    .line 31
    .line 32
    iget-object v1, v2, La/fy4;->W:La/nwo0;

    .line 33
    .line 34
    iget-boolean v15, v1, La/nwo0;->a:Z

    .line 35
    .line 36
    const/16 v16, 0x0

    .line 37
    .line 38
    iget-object v12, v0, La/vx4;->j:La/hxu;

    .line 39
    .line 40
    const/4 v13, 0x0

    .line 41
    invoke-static/range {v9 .. v16}, La/ydx;->D(DLjava/lang/String;La/hxu;La/txu;La/ctf0;ZZ)La/ank0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    new-instance v1, La/pnb0;

    .line 46
    .line 47
    invoke-direct {v1, v0}, La/pnb0;-><init>(La/ank0;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, v2, La/fy4;->h0:La/p7m0;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    const/4 v2, 0x0

    .line 56
    invoke-virtual {v0, v2, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object v0
.end method
