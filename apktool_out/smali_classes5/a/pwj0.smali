.class public final La/pwj0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:La/xxj0;

.field public final synthetic j:La/hxu;

.field public final synthetic k:Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

.field public final synthetic l:D

.field public final synthetic m:La/txu;

.field public final synthetic n:D


# direct methods
.method public constructor <init>(La/xxj0;La/hxu;Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;DLa/txu;DLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/pwj0;->i:La/xxj0;

    .line 2
    .line 3
    iput-object p2, p0, La/pwj0;->j:La/hxu;

    .line 4
    .line 5
    iput-object p3, p0, La/pwj0;->k:Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 6
    .line 7
    iput-wide p4, p0, La/pwj0;->l:D

    .line 8
    .line 9
    iput-object p6, p0, La/pwj0;->m:La/txu;

    .line 10
    .line 11
    iput-wide p7, p0, La/pwj0;->n:D

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p9}, La/bnn0;-><init>(ILa/yje;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 10

    .line 1
    new-instance v0, La/pwj0;

    .line 2
    .line 3
    iget-object v6, p0, La/pwj0;->m:La/txu;

    .line 4
    .line 5
    iget-wide v7, p0, La/pwj0;->n:D

    .line 6
    .line 7
    iget-object v1, p0, La/pwj0;->i:La/xxj0;

    .line 8
    .line 9
    iget-object v2, p0, La/pwj0;->j:La/hxu;

    .line 10
    .line 11
    iget-object v3, p0, La/pwj0;->k:Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 12
    .line 13
    iget-wide v4, p0, La/pwj0;->l:D

    .line 14
    .line 15
    move-object v9, p2

    .line 16
    invoke-direct/range {v0 .. v9}, La/pwj0;-><init>(La/xxj0;La/hxu;Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;DLa/txu;DLa/yje;)V

    .line 17
    .line 18
    .line 19
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
    invoke-virtual {p0, p1, p2}, La/pwj0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/pwj0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/pwj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-object v2, v0, La/pwj0;->i:La/xxj0;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v1, v0, La/pwj0;->k:Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 14
    .line 15
    iget-wide v3, v1, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->a:D

    .line 16
    .line 17
    iget-wide v5, v0, La/pwj0;->l:D

    .line 18
    .line 19
    iget-wide v7, v0, La/pwj0;->n:D

    .line 20
    .line 21
    invoke-virtual/range {v2 .. v8}, La/xxj0;->w(DDD)D

    .line 22
    .line 23
    .line 24
    move-result-wide v9

    .line 25
    iget-object v11, v1, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->f:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v14, v2, La/xxj0;->m:La/ctf0;

    .line 28
    .line 29
    iget-object v1, v2, La/xxj0;->o0:La/nwo0;

    .line 30
    .line 31
    iget-boolean v3, v1, La/nwo0;->a:Z

    .line 32
    .line 33
    iget-object v12, v0, La/pwj0;->j:La/hxu;

    .line 34
    .line 35
    if-nez v3, :cond_1

    .line 36
    .line 37
    iget-boolean v1, v1, La/nwo0;->b:Z

    .line 38
    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    sget-object v1, La/hxu;->h:La/hxu;

    .line 42
    .line 43
    invoke-static {v12, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-nez v1, :cond_0

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_0
    const/4 v1, 0x0

    .line 51
    :goto_0
    move v15, v1

    .line 52
    goto :goto_2

    .line 53
    :cond_1
    :goto_1
    const/4 v1, 0x1

    .line 54
    goto :goto_0

    .line 55
    :goto_2
    iget-object v1, v2, La/xxj0;->C0:La/p7m0;

    .line 56
    .line 57
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;

    .line 62
    .line 63
    iget-boolean v1, v1, Lorg/xplatform/make_bet/impl/presentation/model/StepInputUiModel;->q:Z

    .line 64
    .line 65
    iget-object v13, v0, La/pwj0;->m:La/txu;

    .line 66
    .line 67
    move/from16 v16, v1

    .line 68
    .line 69
    invoke-static/range {v9 .. v16}, La/ydx;->D(DLjava/lang/String;La/hxu;La/txu;La/ctf0;ZZ)La/ank0;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    new-instance v1, La/pnb0;

    .line 74
    .line 75
    invoke-direct {v1, v0}, La/pnb0;-><init>(La/ank0;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, v1}, La/xxj0;->P(La/qnb0;)V

    .line 79
    .line 80
    .line 81
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object v0
.end method
