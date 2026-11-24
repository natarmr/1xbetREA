.class public final La/mzo0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Z

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/n660;

.field public final synthetic l:Z

.field public final synthetic m:La/jvn;

.field public final synthetic n:J

.field public final synthetic o:Z

.field public final synthetic p:J

.field public final synthetic q:J


# direct methods
.method public constructor <init>(La/n660;ZLa/jvn;JZJJLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/mzo0;->k:La/n660;

    .line 2
    .line 3
    iput-boolean p2, p0, La/mzo0;->l:Z

    .line 4
    .line 5
    iput-object p3, p0, La/mzo0;->m:La/jvn;

    .line 6
    .line 7
    iput-wide p4, p0, La/mzo0;->n:J

    .line 8
    .line 9
    iput-boolean p6, p0, La/mzo0;->o:Z

    .line 10
    .line 11
    iput-wide p7, p0, La/mzo0;->p:J

    .line 12
    .line 13
    iput-wide p9, p0, La/mzo0;->q:J

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p11}, La/bnn0;-><init>(ILa/yje;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 12

    .line 1
    new-instance v0, La/mzo0;

    .line 2
    .line 3
    iget-wide v7, p0, La/mzo0;->p:J

    .line 4
    .line 5
    iget-wide v9, p0, La/mzo0;->q:J

    .line 6
    .line 7
    iget-object v1, p0, La/mzo0;->k:La/n660;

    .line 8
    .line 9
    iget-boolean v2, p0, La/mzo0;->l:Z

    .line 10
    .line 11
    iget-object v3, p0, La/mzo0;->m:La/jvn;

    .line 12
    .line 13
    iget-wide v4, p0, La/mzo0;->n:J

    .line 14
    .line 15
    iget-boolean v6, p0, La/mzo0;->o:Z

    .line 16
    .line 17
    move-object v11, p2

    .line 18
    invoke-direct/range {v0 .. v11}, La/mzo0;-><init>(La/n660;ZLa/jvn;JZJJLa/yje;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v0, La/mzo0;->j:Ljava/lang/Object;

    .line 22
    .line 23
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/kmq;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/mzo0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/mzo0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/mzo0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v11, v0, La/mzo0;->k:La/n660;

    .line 4
    .line 5
    iget-object v1, v11, La/n660;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/knf0;

    .line 8
    .line 9
    iget-object v2, v0, La/mzo0;->j:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, La/kmq;

    .line 12
    .line 13
    sget-object v3, La/wne;->a:La/wne;

    .line 14
    .line 15
    iget-boolean v4, v0, La/mzo0;->i:Z

    .line 16
    .line 17
    const/4 v5, 0x1

    .line 18
    const/4 v6, 0x0

    .line 19
    if-eqz v4, :cond_1

    .line 20
    .line 21
    if-ne v4, v5, :cond_0

    .line 22
    .line 23
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto/16 :goto_3

    .line 27
    .line 28
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 29
    .line 30
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-object v6

    .line 34
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    move v4, v5

    .line 38
    invoke-virtual {v1}, La/knf0;->c()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    invoke-virtual {v1}, La/knf0;->b()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    iget-object v7, v11, La/n660;->d:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v7, La/x2c0;

    .line 49
    .line 50
    invoke-virtual {v7}, La/x2c0;->a()La/m2c0;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    if-eqz v7, :cond_2

    .line 55
    .line 56
    iget-object v7, v7, La/m2c0;->c:Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {v7}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    goto :goto_0

    .line 63
    :cond_2
    move-object v7, v6

    .line 64
    :goto_0
    sget-object v8, La/sip;->a:La/bek;

    .line 65
    .line 66
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget-boolean v8, v0, La/mzo0;->l:Z

    .line 70
    .line 71
    invoke-static {v8}, La/bek;->f(Z)La/sip;

    .line 72
    .line 73
    .line 74
    move-result-object v12

    .line 75
    iget-boolean v13, v0, La/mzo0;->l:Z

    .line 76
    .line 77
    if-eqz v13, :cond_3

    .line 78
    .line 79
    const-wide/16 v8, 0x8

    .line 80
    .line 81
    :goto_1
    move v10, v4

    .line 82
    move v4, v1

    .line 83
    goto :goto_2

    .line 84
    :cond_3
    const-wide/16 v8, 0x1e

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :goto_2
    new-instance v1, La/lzo0;

    .line 88
    .line 89
    iget-wide v14, v0, La/mzo0;->q:J

    .line 90
    .line 91
    const/16 v16, 0x0

    .line 92
    .line 93
    move-object/from16 v17, v2

    .line 94
    .line 95
    iget-object v2, v0, La/mzo0;->m:La/jvn;

    .line 96
    .line 97
    move-object/from16 v18, v3

    .line 98
    .line 99
    move-object/from16 v19, v6

    .line 100
    .line 101
    move-object v3, v7

    .line 102
    iget-wide v6, v0, La/mzo0;->n:J

    .line 103
    .line 104
    move-wide/from16 v20, v8

    .line 105
    .line 106
    iget-boolean v8, v0, La/mzo0;->o:Z

    .line 107
    .line 108
    move/from16 v22, v10

    .line 109
    .line 110
    iget-wide v9, v0, La/mzo0;->p:J

    .line 111
    .line 112
    move-object/from16 v23, v17

    .line 113
    .line 114
    move-object/from16 v24, v18

    .line 115
    .line 116
    move-wide/from16 v25, v20

    .line 117
    .line 118
    invoke-direct/range {v1 .. v16}, La/lzo0;-><init>(La/jvn;Ljava/lang/Integer;ILjava/lang/String;JZJLa/n660;La/sip;ZJLa/yje;)V

    .line 119
    .line 120
    .line 121
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 122
    .line 123
    move-wide/from16 v8, v25

    .line 124
    .line 125
    invoke-static {v8, v9, v2, v1}, La/bkb;->h0(JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function2;)La/vsg0;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    const/4 v2, 0x0

    .line 130
    iput-object v2, v0, La/mzo0;->j:Ljava/lang/Object;

    .line 131
    .line 132
    const/4 v4, 0x1

    .line 133
    iput-boolean v4, v0, La/mzo0;->i:Z

    .line 134
    .line 135
    move-object/from16 v2, v23

    .line 136
    .line 137
    invoke-static {v2, v1, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    move-object/from16 v1, v24

    .line 142
    .line 143
    if-ne v0, v1, :cond_4

    .line 144
    .line 145
    return-object v1

    .line 146
    :cond_4
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    return-object v0
.end method
