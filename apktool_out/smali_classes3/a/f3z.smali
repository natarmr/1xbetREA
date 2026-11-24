.class public final La/f3z;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/kzj;

.field public j:Ljava/lang/Object;

.field public k:B

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:La/ieu;

.field public final synthetic n:J

.field public final synthetic o:Z

.field public final synthetic p:La/are;

.field public final synthetic q:Ljava/util/List;

.field public final synthetic r:J


# direct methods
.method public constructor <init>(JJLa/yje;La/are;La/ieu;Ljava/util/List;Z)V
    .locals 0

    .line 1
    iput-object p7, p0, La/f3z;->m:La/ieu;

    .line 2
    .line 3
    iput-wide p1, p0, La/f3z;->n:J

    .line 4
    .line 5
    iput-boolean p9, p0, La/f3z;->o:Z

    .line 6
    .line 7
    iput-object p6, p0, La/f3z;->p:La/are;

    .line 8
    .line 9
    iput-object p8, p0, La/f3z;->q:Ljava/util/List;

    .line 10
    .line 11
    iput-wide p3, p0, La/f3z;->r:J

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 10

    .line 1
    new-instance v0, La/f3z;

    .line 2
    .line 3
    iget-object v8, p0, La/f3z;->q:Ljava/util/List;

    .line 4
    .line 5
    iget-wide v3, p0, La/f3z;->r:J

    .line 6
    .line 7
    iget-wide v1, p0, La/f3z;->n:J

    .line 8
    .line 9
    iget-object v6, p0, La/f3z;->p:La/are;

    .line 10
    .line 11
    iget-object v7, p0, La/f3z;->m:La/ieu;

    .line 12
    .line 13
    iget-boolean v9, p0, La/f3z;->o:Z

    .line 14
    .line 15
    move-object v5, p2

    .line 16
    invoke-direct/range {v0 .. v9}, La/f3z;-><init>(JJLa/yje;La/are;La/ieu;Ljava/util/List;Z)V

    .line 17
    .line 18
    .line 19
    iput-object p1, v0, La/f3z;->l:Ljava/lang/Object;

    .line 20
    .line 21
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
    invoke-virtual {p0, p1, p2}, La/f3z;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/f3z;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/f3z;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/f3z;->l:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/vne;

    .line 6
    .line 7
    sget-object v2, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-byte v3, v0, La/f3z;->k:B

    .line 10
    .line 11
    const/4 v4, 0x2

    .line 12
    const/4 v5, 0x1

    .line 13
    const/4 v6, 0x0

    .line 14
    if-eqz v3, :cond_2

    .line 15
    .line 16
    if-eq v3, v5, :cond_1

    .line 17
    .line 18
    if-ne v3, v4, :cond_0

    .line 19
    .line 20
    iget-object v0, v0, La/f3z;->j:Ljava/lang/Object;

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 27
    .line 28
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v6

    .line 32
    :cond_1
    iget-object v1, v0, La/f3z;->i:La/kzj;

    .line 33
    .line 34
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    move-object/from16 v3, p1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    new-instance v7, La/lv1;

    .line 44
    .line 45
    const/4 v13, 0x0

    .line 46
    const/4 v14, 0x3

    .line 47
    iget-object v8, v0, La/f3z;->m:La/ieu;

    .line 48
    .line 49
    iget-wide v9, v0, La/f3z;->n:J

    .line 50
    .line 51
    iget-boolean v11, v0, La/f3z;->o:Z

    .line 52
    .line 53
    iget-object v12, v0, La/f3z;->p:La/are;

    .line 54
    .line 55
    invoke-direct/range {v7 .. v14}, La/lv1;-><init>(Ljava/lang/Object;JZLjava/lang/Object;La/yje;B)V

    .line 56
    .line 57
    .line 58
    move-object/from16 v22, v8

    .line 59
    .line 60
    const/4 v3, 0x3

    .line 61
    invoke-static {v1, v6, v7, v3}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    new-instance v15, La/e3z;

    .line 66
    .line 67
    iget-object v8, v0, La/f3z;->p:La/are;

    .line 68
    .line 69
    const/16 v20, 0x0

    .line 70
    .line 71
    iget-wide v9, v0, La/f3z;->n:J

    .line 72
    .line 73
    iget-wide v11, v0, La/f3z;->r:J

    .line 74
    .line 75
    iget-object v13, v0, La/f3z;->q:Ljava/util/List;

    .line 76
    .line 77
    iget-boolean v14, v0, La/f3z;->o:Z

    .line 78
    .line 79
    move-object/from16 v21, v8

    .line 80
    .line 81
    move-wide/from16 v16, v9

    .line 82
    .line 83
    move-wide/from16 v18, v11

    .line 84
    .line 85
    move-object/from16 v23, v13

    .line 86
    .line 87
    move/from16 v24, v14

    .line 88
    .line 89
    invoke-direct/range {v15 .. v24}, La/e3z;-><init>(JJLa/yje;La/are;La/ieu;Ljava/util/List;Z)V

    .line 90
    .line 91
    .line 92
    invoke-static {v1, v6, v15, v3}, La/qjj;->M(La/vne;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/kzj;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    iput-object v6, v0, La/f3z;->l:Ljava/lang/Object;

    .line 97
    .line 98
    iput-object v1, v0, La/f3z;->i:La/kzj;

    .line 99
    .line 100
    iput-byte v5, v0, La/f3z;->k:B

    .line 101
    .line 102
    invoke-virtual {v7, v0}, La/pby;->q(La/yje;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    if-ne v3, v2, :cond_3

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    :goto_0
    check-cast v3, La/j0g0;

    .line 110
    .line 111
    iget-object v3, v3, La/j0g0;->a:Ljava/lang/Object;

    .line 112
    .line 113
    iput-object v6, v0, La/f3z;->l:Ljava/lang/Object;

    .line 114
    .line 115
    iput-object v6, v0, La/f3z;->i:La/kzj;

    .line 116
    .line 117
    iput-object v3, v0, La/f3z;->j:Ljava/lang/Object;

    .line 118
    .line 119
    iput-byte v4, v0, La/f3z;->k:B

    .line 120
    .line 121
    invoke-interface {v1, v0}, La/jzj;->await(La/yje;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    if-ne v0, v2, :cond_4

    .line 126
    .line 127
    :goto_1
    return-object v2

    .line 128
    :cond_4
    move-object v0, v3

    .line 129
    :goto_2
    new-instance v1, La/j0g0;

    .line 130
    .line 131
    invoke-direct {v1, v0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    return-object v1
.end method
