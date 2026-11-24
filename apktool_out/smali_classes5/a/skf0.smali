.class public final La/skf0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/kmq;

.field public final synthetic l:Lkotlin/jvm/functions/Function1;

.field public final synthetic m:La/or30;

.field public final synthetic n:J

.field public final synthetic o:J

.field public final synthetic p:J

.field public final synthetic q:J

.field public final synthetic r:Z

.field public final synthetic s:Z

.field public final synthetic t:Lkotlin/jvm/functions/Function0;


# direct methods
.method public constructor <init>(La/kmq;Lkotlin/jvm/functions/Function1;La/or30;JJJJZZLkotlin/jvm/functions/Function0;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/skf0;->k:La/kmq;

    .line 2
    .line 3
    iput-object p2, p0, La/skf0;->l:Lkotlin/jvm/functions/Function1;

    .line 4
    .line 5
    iput-object p3, p0, La/skf0;->m:La/or30;

    .line 6
    .line 7
    iput-wide p4, p0, La/skf0;->n:J

    .line 8
    .line 9
    iput-wide p6, p0, La/skf0;->o:J

    .line 10
    .line 11
    iput-wide p8, p0, La/skf0;->p:J

    .line 12
    .line 13
    iput-wide p10, p0, La/skf0;->q:J

    .line 14
    .line 15
    iput-boolean p12, p0, La/skf0;->r:Z

    .line 16
    .line 17
    iput-boolean p13, p0, La/skf0;->s:Z

    .line 18
    .line 19
    iput-object p14, p0, La/skf0;->t:Lkotlin/jvm/functions/Function0;

    .line 20
    .line 21
    const/4 p1, 0x2

    .line 22
    invoke-direct {p0, p1, p15}, La/bnn0;-><init>(ILa/yje;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, La/skf0;

    .line 4
    .line 5
    iget-boolean v13, v0, La/skf0;->s:Z

    .line 6
    .line 7
    iget-object v14, v0, La/skf0;->t:Lkotlin/jvm/functions/Function0;

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    iget-object v1, v0, La/skf0;->k:La/kmq;

    .line 11
    .line 12
    move-object v3, v2

    .line 13
    iget-object v2, v0, La/skf0;->l:Lkotlin/jvm/functions/Function1;

    .line 14
    .line 15
    move-object v4, v3

    .line 16
    iget-object v3, v0, La/skf0;->m:La/or30;

    .line 17
    .line 18
    move-object v6, v4

    .line 19
    iget-wide v4, v0, La/skf0;->n:J

    .line 20
    .line 21
    move-object v8, v6

    .line 22
    iget-wide v6, v0, La/skf0;->o:J

    .line 23
    .line 24
    move-object v10, v8

    .line 25
    iget-wide v8, v0, La/skf0;->p:J

    .line 26
    .line 27
    move-object v12, v10

    .line 28
    iget-wide v10, v0, La/skf0;->q:J

    .line 29
    .line 30
    iget-boolean v0, v0, La/skf0;->r:Z

    .line 31
    .line 32
    move-object v15, v12

    .line 33
    move v12, v0

    .line 34
    move-object v0, v15

    .line 35
    move-object/from16 v15, p2

    .line 36
    .line 37
    invoke-direct/range {v0 .. v15}, La/skf0;-><init>(La/kmq;Lkotlin/jvm/functions/Function1;La/or30;JJJJZZLkotlin/jvm/functions/Function0;La/yje;)V

    .line 38
    .line 39
    .line 40
    move-object v2, v0

    .line 41
    move-object/from16 v0, p1

    .line 42
    .line 43
    iput-object v0, v2, La/skf0;->j:Ljava/lang/Object;

    .line 44
    .line 45
    return-object v2
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
    invoke-virtual {p0, p1, p2}, La/skf0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/skf0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/skf0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/skf0;->j:Ljava/lang/Object;

    .line 4
    .line 5
    move-object v3, v1

    .line 6
    check-cast v3, La/vne;

    .line 7
    .line 8
    sget-object v1, La/wne;->a:La/wne;

    .line 9
    .line 10
    iget-boolean v2, v0, La/skf0;->i:Z

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x1

    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    if-ne v2, v5, :cond_0

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object v4

    .line 28
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    new-instance v2, La/rkf0;

    .line 32
    .line 33
    iget-boolean v6, v0, La/skf0;->s:Z

    .line 34
    .line 35
    iget-object v7, v0, La/skf0;->t:Lkotlin/jvm/functions/Function0;

    .line 36
    .line 37
    move-object v8, v4

    .line 38
    iget-object v4, v0, La/skf0;->k:La/kmq;

    .line 39
    .line 40
    move v9, v5

    .line 41
    iget-object v5, v0, La/skf0;->l:Lkotlin/jvm/functions/Function1;

    .line 42
    .line 43
    move/from16 v16, v6

    .line 44
    .line 45
    iget-object v6, v0, La/skf0;->m:La/or30;

    .line 46
    .line 47
    move-object/from16 v17, v7

    .line 48
    .line 49
    move-object v10, v8

    .line 50
    iget-wide v7, v0, La/skf0;->n:J

    .line 51
    .line 52
    move v12, v9

    .line 53
    move-object v11, v10

    .line 54
    iget-wide v9, v0, La/skf0;->o:J

    .line 55
    .line 56
    move-object v13, v11

    .line 57
    move v14, v12

    .line 58
    iget-wide v11, v0, La/skf0;->p:J

    .line 59
    .line 60
    move-object v15, v13

    .line 61
    move/from16 v18, v14

    .line 62
    .line 63
    iget-wide v13, v0, La/skf0;->q:J

    .line 64
    .line 65
    move-object/from16 v19, v15

    .line 66
    .line 67
    iget-boolean v15, v0, La/skf0;->r:Z

    .line 68
    .line 69
    move-object/from16 v20, v1

    .line 70
    .line 71
    move-object/from16 v1, v19

    .line 72
    .line 73
    invoke-direct/range {v2 .. v17}, La/rkf0;-><init>(La/vne;La/kmq;Lkotlin/jvm/functions/Function1;La/or30;JJJJZZLkotlin/jvm/functions/Function0;)V

    .line 74
    .line 75
    .line 76
    iput-object v1, v0, La/skf0;->j:Ljava/lang/Object;

    .line 77
    .line 78
    const/4 v14, 0x1

    .line 79
    iput-boolean v14, v0, La/skf0;->i:Z

    .line 80
    .line 81
    invoke-virtual {v2, v0}, La/rkf0;->e(La/zje;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    move-object/from16 v1, v20

    .line 86
    .line 87
    if-ne v0, v1, :cond_2

    .line 88
    .line 89
    return-object v1

    .line 90
    :cond_2
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    return-object v0
.end method
