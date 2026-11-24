.class public final La/yxt;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/mie0;

.field public j:La/mie0;

.field public k:Z

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:La/cmt;

.field public final synthetic n:Ljava/util/List;

.field public final synthetic o:J

.field public final synthetic p:J

.field public final synthetic q:I


# direct methods
.method public constructor <init>(La/cmt;Ljava/util/List;JJILa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/yxt;->m:La/cmt;

    .line 2
    .line 3
    iput-object p2, p0, La/yxt;->n:Ljava/util/List;

    .line 4
    .line 5
    iput-wide p3, p0, La/yxt;->o:J

    .line 6
    .line 7
    iput-wide p5, p0, La/yxt;->p:J

    .line 8
    .line 9
    iput p7, p0, La/yxt;->q:I

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p8}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 9

    .line 1
    new-instance v0, La/yxt;

    .line 2
    .line 3
    iget-wide v5, p0, La/yxt;->p:J

    .line 4
    .line 5
    iget v7, p0, La/yxt;->q:I

    .line 6
    .line 7
    iget-object v1, p0, La/yxt;->m:La/cmt;

    .line 8
    .line 9
    iget-object v2, p0, La/yxt;->n:Ljava/util/List;

    .line 10
    .line 11
    iget-wide v3, p0, La/yxt;->o:J

    .line 12
    .line 13
    move-object v8, p2

    .line 14
    invoke-direct/range {v0 .. v8}, La/yxt;-><init>(La/cmt;Ljava/util/List;JJILa/yje;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, La/yxt;->l:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, La/yxt;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/yxt;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/yxt;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/yxt;->l:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    check-cast v2, La/vne;

    .line 7
    .line 8
    sget-object v1, La/wne;->a:La/wne;

    .line 9
    .line 10
    iget-boolean v3, v0, La/yxt;->k:Z

    .line 11
    .line 12
    const/4 v8, 0x0

    .line 13
    const/4 v9, 0x1

    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    if-ne v3, v9, :cond_0

    .line 17
    .line 18
    iget-object v1, v0, La/yxt;->j:La/mie0;

    .line 19
    .line 20
    iget-object v0, v0, La/yxt;->i:La/mie0;

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v8

    .line 32
    :cond_1
    invoke-static/range {p1 .. p1}, La/ohs0;->j(Ljava/lang/Object;)La/mie0;

    .line 33
    .line 34
    .line 35
    move-result-object v11

    .line 36
    new-instance v3, La/mie0;

    .line 37
    .line 38
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-interface {v0}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    new-instance v6, La/cx2;

    .line 46
    .line 47
    const/4 v4, 0x2

    .line 48
    invoke-direct {v6, v3, v4}, La/cx2;-><init>(La/mie0;B)V

    .line 49
    .line 50
    .line 51
    new-instance v7, La/xxt;

    .line 52
    .line 53
    iget v4, v0, La/yxt;->q:I

    .line 54
    .line 55
    const/16 v19, 0x0

    .line 56
    .line 57
    iget-object v12, v0, La/yxt;->m:La/cmt;

    .line 58
    .line 59
    iget-object v13, v0, La/yxt;->n:Ljava/util/List;

    .line 60
    .line 61
    iget-wide v14, v0, La/yxt;->o:J

    .line 62
    .line 63
    iget-wide v9, v0, La/yxt;->p:J

    .line 64
    .line 65
    move/from16 v18, v4

    .line 66
    .line 67
    move-wide/from16 v16, v9

    .line 68
    .line 69
    move-object v10, v7

    .line 70
    invoke-direct/range {v10 .. v19}, La/xxt;-><init>(La/mie0;La/cmt;Ljava/util/List;JJILa/yje;)V

    .line 71
    .line 72
    .line 73
    move-object v4, v3

    .line 74
    const/4 v3, 0x1

    .line 75
    move-object v9, v4

    .line 76
    const-string v4, "GetChampsResultsUseCase"

    .line 77
    .line 78
    invoke-static/range {v2 .. v7}, La/sac;->W(La/vne;ZLjava/lang/String;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/bby;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    iput-object v8, v0, La/yxt;->l:Ljava/lang/Object;

    .line 83
    .line 84
    iput-object v11, v0, La/yxt;->i:La/mie0;

    .line 85
    .line 86
    iput-object v9, v0, La/yxt;->j:La/mie0;

    .line 87
    .line 88
    const/4 v3, 0x1

    .line 89
    iput-boolean v3, v0, La/yxt;->k:Z

    .line 90
    .line 91
    check-cast v2, La/pby;

    .line 92
    .line 93
    invoke-virtual {v2, v0}, La/pby;->join(La/yje;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    if-ne v0, v1, :cond_2

    .line 98
    .line 99
    return-object v1

    .line 100
    :cond_2
    move-object v1, v9

    .line 101
    move-object v0, v11

    .line 102
    :goto_0
    iget-object v1, v1, La/mie0;->a:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v1, Ljava/lang/Throwable;

    .line 105
    .line 106
    if-nez v1, :cond_4

    .line 107
    .line 108
    iget-object v0, v0, La/mie0;->a:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v0, Ljava/util/List;

    .line 111
    .line 112
    if-nez v0, :cond_3

    .line 113
    .line 114
    sget-object v0, La/iun;->a:La/iun;

    .line 115
    .line 116
    :cond_3
    return-object v0

    .line 117
    :cond_4
    throw v1
.end method
