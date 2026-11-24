.class public final La/x600;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/util/List;

.field public final synthetic l:La/wdu;

.field public final synthetic m:Z

.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:I

.field public final synthetic p:Z

.field public final synthetic q:J

.field public final synthetic r:J


# direct methods
.method public constructor <init>(Ljava/util/List;La/wdu;ZLjava/lang/String;IZJJLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/x600;->k:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, La/x600;->l:La/wdu;

    .line 4
    .line 5
    iput-boolean p3, p0, La/x600;->m:Z

    .line 6
    .line 7
    iput-object p4, p0, La/x600;->n:Ljava/lang/String;

    .line 8
    .line 9
    iput p5, p0, La/x600;->o:I

    .line 10
    .line 11
    iput-boolean p6, p0, La/x600;->p:Z

    .line 12
    .line 13
    iput-wide p7, p0, La/x600;->q:J

    .line 14
    .line 15
    iput-wide p9, p0, La/x600;->r:J

    .line 16
    .line 17
    const/4 p1, 0x2

    .line 18
    invoke-direct {p0, p1, p11}, La/bnn0;-><init>(ILa/yje;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 12

    .line 1
    new-instance v0, La/x600;

    .line 2
    .line 3
    iget-wide v7, p0, La/x600;->q:J

    .line 4
    .line 5
    iget-wide v9, p0, La/x600;->r:J

    .line 6
    .line 7
    iget-object v1, p0, La/x600;->k:Ljava/util/List;

    .line 8
    .line 9
    iget-object v2, p0, La/x600;->l:La/wdu;

    .line 10
    .line 11
    iget-boolean v3, p0, La/x600;->m:Z

    .line 12
    .line 13
    iget-object v4, p0, La/x600;->n:Ljava/lang/String;

    .line 14
    .line 15
    iget v5, p0, La/x600;->o:I

    .line 16
    .line 17
    iget-boolean v6, p0, La/x600;->p:Z

    .line 18
    .line 19
    move-object v11, p2

    .line 20
    invoke-direct/range {v0 .. v11}, La/x600;-><init>(Ljava/util/List;La/wdu;ZLjava/lang/String;IZJJLa/yje;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/x600;->j:Ljava/lang/Object;

    .line 24
    .line 25
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
    invoke-virtual {p0, p1, p2}, La/x600;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/x600;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/x600;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v11, v0, La/x600;->l:La/wdu;

    .line 4
    .line 5
    iget-object v1, v11, La/wdu;->f:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/knf0;

    .line 8
    .line 9
    iget-object v2, v0, La/x600;->j:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, La/kmq;

    .line 12
    .line 13
    sget-object v3, La/wne;->a:La/wne;

    .line 14
    .line 15
    iget-byte v4, v0, La/x600;->i:B

    .line 16
    .line 17
    const/4 v5, 0x2

    .line 18
    const/4 v6, 0x1

    .line 19
    const/4 v7, 0x0

    .line 20
    if-eqz v4, :cond_2

    .line 21
    .line 22
    if-eq v4, v6, :cond_1

    .line 23
    .line 24
    if-ne v4, v5, :cond_0

    .line 25
    .line 26
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto/16 :goto_3

    .line 30
    .line 31
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 32
    .line 33
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object v7

    .line 37
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    iget-object v4, v0, La/x600;->k:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-eqz v4, :cond_3

    .line 51
    .line 52
    sget-object v4, La/iun;->a:La/iun;

    .line 53
    .line 54
    iput-object v2, v0, La/x600;->j:Ljava/lang/Object;

    .line 55
    .line 56
    iput-byte v6, v0, La/x600;->i:B

    .line 57
    .line 58
    invoke-interface {v2, v4, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    if-ne v4, v3, :cond_3

    .line 63
    .line 64
    move-object v10, v3

    .line 65
    goto :goto_2

    .line 66
    :cond_3
    :goto_0
    move-object v4, v7

    .line 67
    invoke-virtual {v1}, La/knf0;->c()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    invoke-virtual {v1}, La/knf0;->b()I

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    iget-object v1, v11, La/wdu;->e:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v1, La/x2c0;

    .line 78
    .line 79
    invoke-virtual {v1}, La/x2c0;->a()La/m2c0;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    if-eqz v1, :cond_4

    .line 84
    .line 85
    iget-object v1, v1, La/m2c0;->c:Ljava/lang/String;

    .line 86
    .line 87
    invoke-static {v1}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    goto :goto_1

    .line 92
    :cond_4
    move-object v1, v4

    .line 93
    :goto_1
    new-instance v8, La/w600;

    .line 94
    .line 95
    iget-wide v13, v0, La/x600;->r:J

    .line 96
    .line 97
    const/4 v15, 0x0

    .line 98
    move-object v9, v2

    .line 99
    iget-boolean v2, v0, La/x600;->m:Z

    .line 100
    .line 101
    move-object v10, v3

    .line 102
    iget-object v3, v0, La/x600;->n:Ljava/lang/String;

    .line 103
    .line 104
    move-object v12, v4

    .line 105
    iget v4, v0, La/x600;->o:I

    .line 106
    .line 107
    move/from16 v16, v5

    .line 108
    .line 109
    move-object v5, v1

    .line 110
    move-object v1, v8

    .line 111
    iget-boolean v8, v0, La/x600;->p:Z

    .line 112
    .line 113
    move-object/from16 v17, v9

    .line 114
    .line 115
    move-object/from16 v18, v10

    .line 116
    .line 117
    iget-wide v9, v0, La/x600;->q:J

    .line 118
    .line 119
    move-object/from16 v19, v12

    .line 120
    .line 121
    iget-object v12, v0, La/x600;->k:Ljava/util/List;

    .line 122
    .line 123
    move-object/from16 v20, v17

    .line 124
    .line 125
    move-object/from16 v21, v18

    .line 126
    .line 127
    invoke-direct/range {v1 .. v15}, La/w600;-><init>(ZLjava/lang/String;ILjava/lang/Integer;ILjava/lang/String;ZJLa/wdu;Ljava/util/List;JLa/yje;)V

    .line 128
    .line 129
    .line 130
    const-wide/16 v2, 0x1e

    .line 131
    .line 132
    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 133
    .line 134
    invoke-static {v2, v3, v4, v1}, La/bkb;->h0(JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function2;)La/vsg0;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    const/4 v4, 0x0

    .line 139
    iput-object v4, v0, La/x600;->j:Ljava/lang/Object;

    .line 140
    .line 141
    const/4 v2, 0x2

    .line 142
    iput-byte v2, v0, La/x600;->i:B

    .line 143
    .line 144
    move-object/from16 v9, v20

    .line 145
    .line 146
    invoke-static {v9, v1, v0}, La/slb;->Q(La/kmq;La/gmq;La/yje;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    move-object/from16 v10, v21

    .line 151
    .line 152
    if-ne v0, v10, :cond_5

    .line 153
    .line 154
    :goto_2
    return-object v10

    .line 155
    :cond_5
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 156
    .line 157
    return-object v0
.end method
