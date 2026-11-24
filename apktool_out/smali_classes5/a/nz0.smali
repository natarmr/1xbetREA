.class public final La/nz0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/a01;

.field public final synthetic l:La/mlr;

.field public final synthetic m:J

.field public final synthetic n:I


# direct methods
.method public synthetic constructor <init>(La/a01;La/mlr;IJLa/yje;B)V
    .locals 0

    .line 17
    iput-byte p7, p0, La/nz0;->i:B

    iput-object p1, p0, La/nz0;->k:La/a01;

    iput-object p2, p0, La/nz0;->l:La/mlr;

    iput p3, p0, La/nz0;->n:I

    iput-wide p4, p0, La/nz0;->m:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/a01;La/mlr;JILa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/nz0;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/nz0;->k:La/a01;

    .line 5
    .line 6
    iput-object p2, p0, La/nz0;->l:La/mlr;

    .line 7
    .line 8
    iput-wide p3, p0, La/nz0;->m:J

    .line 9
    .line 10
    iput p5, p0, La/nz0;->n:I

    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 9

    .line 1
    iget-byte p1, p0, La/nz0;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/nz0;

    .line 7
    .line 8
    iget-wide v4, p0, La/nz0;->m:J

    .line 9
    .line 10
    const/4 v7, 0x2

    .line 11
    iget-object v1, p0, La/nz0;->k:La/a01;

    .line 12
    .line 13
    iget-object v2, p0, La/nz0;->l:La/mlr;

    .line 14
    .line 15
    iget v3, p0, La/nz0;->n:I

    .line 16
    .line 17
    move-object v6, p2

    .line 18
    invoke-direct/range {v0 .. v7}, La/nz0;-><init>(La/a01;La/mlr;IJLa/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    move-object v7, p2

    .line 23
    new-instance v1, La/nz0;

    .line 24
    .line 25
    iget-wide v4, p0, La/nz0;->m:J

    .line 26
    .line 27
    iget v6, p0, La/nz0;->n:I

    .line 28
    .line 29
    iget-object v2, p0, La/nz0;->k:La/a01;

    .line 30
    .line 31
    iget-object v3, p0, La/nz0;->l:La/mlr;

    .line 32
    .line 33
    invoke-direct/range {v1 .. v7}, La/nz0;-><init>(La/a01;La/mlr;JILa/yje;)V

    .line 34
    .line 35
    .line 36
    return-object v1

    .line 37
    :pswitch_1
    move-object v7, p2

    .line 38
    new-instance v1, La/nz0;

    .line 39
    .line 40
    iget-wide v5, p0, La/nz0;->m:J

    .line 41
    .line 42
    const/4 v8, 0x0

    .line 43
    iget-object v2, p0, La/nz0;->k:La/a01;

    .line 44
    .line 45
    iget-object v3, p0, La/nz0;->l:La/mlr;

    .line 46
    .line 47
    iget v4, p0, La/nz0;->n:I

    .line 48
    .line 49
    invoke-direct/range {v1 .. v8}, La/nz0;-><init>(La/a01;La/mlr;IJLa/yje;B)V

    .line 50
    .line 51
    .line 52
    return-object v1

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/nz0;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/nz0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/nz0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/nz0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/nz0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/nz0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/nz0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/nz0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/nz0;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/nz0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v4, p0

    .line 2
    .line 3
    iget-byte v0, v4, La/nz0;->i:B

    .line 4
    .line 5
    iget-wide v1, v4, La/nz0;->m:J

    .line 6
    .line 7
    iget-object v3, v4, La/nz0;->l:La/mlr;

    .line 8
    .line 9
    iget-object v5, v4, La/nz0;->k:La/a01;

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    const-string v7, "call to \'resume\' before \'invoke\' with coroutine"

    .line 13
    .line 14
    const/4 v8, 0x1

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    sget-object v9, La/wne;->a:La/wne;

    .line 19
    .line 20
    iget-boolean v0, v4, La/nz0;->j:Z

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    if-ne v0, v8, :cond_0

    .line 25
    .line 26
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, v5, La/a01;->y:La/zn00;

    .line 38
    .line 39
    iget-wide v6, v3, La/mlr;->a:J

    .line 40
    .line 41
    invoke-virtual {v5, v3, v1, v2}, La/a01;->O(La/mlr;J)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    iput-boolean v8, v4, La/nz0;->j:Z

    .line 46
    .line 47
    iget v1, v4, La/nz0;->n:I

    .line 48
    .line 49
    move-wide v2, v6

    .line 50
    invoke-virtual/range {v0 .. v5}, La/zn00;->N0(IJLa/bnn0;Ljava/lang/String;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-ne v0, v9, :cond_2

    .line 55
    .line 56
    move-object v6, v9

    .line 57
    goto :goto_1

    .line 58
    :cond_2
    :goto_0
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    :goto_1
    return-object v6

    .line 61
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 62
    .line 63
    iget-boolean v1, v4, La/nz0;->j:Z

    .line 64
    .line 65
    iget-object v10, v4, La/nz0;->k:La/a01;

    .line 66
    .line 67
    if-eqz v1, :cond_4

    .line 68
    .line 69
    if-ne v1, v8, :cond_3

    .line 70
    .line 71
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_4
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iget-object v1, v10, La/a01;->I:La/ytt;

    .line 83
    .line 84
    sget-object v2, La/aue0;->d:La/aue0;

    .line 85
    .line 86
    iput-boolean v8, v4, La/nz0;->j:Z

    .line 87
    .line 88
    invoke-virtual {v1, v2, v4}, La/ytt;->a(La/aue0;La/yje;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    if-ne v1, v0, :cond_5

    .line 93
    .line 94
    move-object v6, v0

    .line 95
    goto :goto_3

    .line 96
    :cond_5
    :goto_2
    iget-object v0, v10, La/a01;->q:La/i1w0;

    .line 97
    .line 98
    new-instance v9, La/zz0;

    .line 99
    .line 100
    const/4 v15, 0x0

    .line 101
    iget-object v11, v4, La/nz0;->l:La/mlr;

    .line 102
    .line 103
    iget-wide v12, v4, La/nz0;->m:J

    .line 104
    .line 105
    iget v14, v4, La/nz0;->n:I

    .line 106
    .line 107
    invoke-direct/range {v9 .. v15}, La/zz0;-><init>(Ljava/lang/Object;Ljava/io/Serializable;JIB)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v9}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 111
    .line 112
    .line 113
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    :goto_3
    return-object v6

    .line 116
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 117
    .line 118
    iget-boolean v9, v4, La/nz0;->j:Z

    .line 119
    .line 120
    if-eqz v9, :cond_7

    .line 121
    .line 122
    if-ne v9, v8, :cond_6

    .line 123
    .line 124
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    goto :goto_4

    .line 128
    :cond_6
    invoke-static {v7}, La/jf4;->n(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    iget-object v6, v5, La/a01;->x:La/xex;

    .line 136
    .line 137
    invoke-virtual {v5, v3, v1, v2}, La/a01;->O(La/mlr;J)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    iput-boolean v8, v4, La/nz0;->j:Z

    .line 142
    .line 143
    iget v2, v4, La/nz0;->n:I

    .line 144
    .line 145
    invoke-virtual {v6, v3, v2, v1, v4}, La/xex;->I(La/mlr;ILjava/lang/String;La/bnn0;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    if-ne v1, v0, :cond_8

    .line 150
    .line 151
    move-object v6, v0

    .line 152
    goto :goto_5

    .line 153
    :cond_8
    :goto_4
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 154
    .line 155
    :goto_5
    return-object v6

    .line 156
    nop

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
