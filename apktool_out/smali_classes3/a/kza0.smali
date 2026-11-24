.class public final La/kza0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/mlr;

.field public final synthetic l:I

.field public final synthetic m:Ljava/lang/String;

.field public final synthetic n:Z

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/f1b0;La/mlr;ILjava/lang/String;ZLa/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/kza0;->i:B

    .line 19
    iput-object p1, p0, La/kza0;->o:Ljava/lang/Object;

    iput-object p2, p0, La/kza0;->k:La/mlr;

    iput p3, p0, La/kza0;->l:I

    iput-object p4, p0, La/kza0;->m:Ljava/lang/String;

    iput-boolean p5, p0, La/kza0;->n:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/sd60;La/mlr;IZLjava/lang/String;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/kza0;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/kza0;->o:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/kza0;->k:La/mlr;

    .line 7
    .line 8
    iput p3, p0, La/kza0;->l:I

    .line 9
    .line 10
    iput-boolean p4, p0, La/kza0;->n:Z

    .line 11
    .line 12
    iput-object p5, p0, La/kza0;->m:Ljava/lang/String;

    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 9

    .line 1
    iget-byte p1, p0, La/kza0;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/kza0;->o:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v1, La/kza0;

    .line 9
    .line 10
    move-object v2, v0

    .line 11
    check-cast v2, La/f1b0;

    .line 12
    .line 13
    iget-object v5, p0, La/kza0;->m:Ljava/lang/String;

    .line 14
    .line 15
    iget-boolean v6, p0, La/kza0;->n:Z

    .line 16
    .line 17
    iget-object v3, p0, La/kza0;->k:La/mlr;

    .line 18
    .line 19
    iget v4, p0, La/kza0;->l:I

    .line 20
    .line 21
    move-object v7, p2

    .line 22
    invoke-direct/range {v1 .. v7}, La/kza0;-><init>(La/f1b0;La/mlr;ILjava/lang/String;ZLa/yje;)V

    .line 23
    .line 24
    .line 25
    return-object v1

    .line 26
    :pswitch_0
    move-object v7, p2

    .line 27
    new-instance v2, La/kza0;

    .line 28
    .line 29
    move-object v3, v0

    .line 30
    check-cast v3, La/sd60;

    .line 31
    .line 32
    iget-boolean v6, p0, La/kza0;->n:Z

    .line 33
    .line 34
    move-object v8, v7

    .line 35
    iget-object v7, p0, La/kza0;->m:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v4, p0, La/kza0;->k:La/mlr;

    .line 38
    .line 39
    iget v5, p0, La/kza0;->l:I

    .line 40
    .line 41
    invoke-direct/range {v2 .. v8}, La/kza0;-><init>(La/sd60;La/mlr;IZLjava/lang/String;La/yje;)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/kza0;->i:B

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
    invoke-virtual {p0, p1, p2}, La/kza0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/kza0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/kza0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/kza0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/kza0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/kza0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/kza0;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iget-object v4, v0, La/kza0;->o:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object v8, v4

    .line 15
    check-cast v8, La/f1b0;

    .line 16
    .line 17
    sget-object v1, La/wne;->a:La/wne;

    .line 18
    .line 19
    iget-boolean v4, v0, La/kza0;->j:Z

    .line 20
    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    if-ne v4, v3, :cond_0

    .line 24
    .line 25
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object v2, v8, La/f1b0;->d0:La/ytt;

    .line 37
    .line 38
    sget-object v4, La/aue0;->d:La/aue0;

    .line 39
    .line 40
    iput-boolean v3, v0, La/kza0;->j:Z

    .line 41
    .line 42
    invoke-virtual {v2, v4, v0}, La/ytt;->a(La/aue0;La/yje;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-ne v2, v1, :cond_2

    .line 47
    .line 48
    move-object v5, v1

    .line 49
    goto :goto_1

    .line 50
    :cond_2
    :goto_0
    iget-object v1, v8, La/f1b0;->B:La/sd60;

    .line 51
    .line 52
    invoke-static {v8}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    new-instance v6, La/wma0;

    .line 57
    .line 58
    const/4 v12, 0x0

    .line 59
    const/16 v13, 0xf

    .line 60
    .line 61
    const/4 v7, 0x1

    .line 62
    const-class v9, La/f1b0;

    .line 63
    .line 64
    const-string v10, "handleBasicThrowable"

    .line 65
    .line 66
    const-string v11, "handleBasicThrowable(Ljava/lang/Throwable;)V"

    .line 67
    .line 68
    invoke-direct/range {v6 .. v13}, La/wma0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget-object v11, v0, La/kza0;->k:La/mlr;

    .line 75
    .line 76
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    iget-object v3, v1, La/sd60;->i:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v3, La/bby;

    .line 82
    .line 83
    if-eqz v3, :cond_3

    .line 84
    .line 85
    invoke-interface {v3, v5}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 86
    .line 87
    .line 88
    :cond_3
    new-instance v9, La/fs;

    .line 89
    .line 90
    const/4 v15, 0x0

    .line 91
    iget v12, v0, La/kza0;->l:I

    .line 92
    .line 93
    iget-boolean v13, v0, La/kza0;->n:Z

    .line 94
    .line 95
    iget-object v14, v0, La/kza0;->m:Ljava/lang/String;

    .line 96
    .line 97
    move-object v10, v1

    .line 98
    invoke-direct/range {v9 .. v15}, La/fs;-><init>(La/sd60;La/mlr;IZLjava/lang/String;La/yje;)V

    .line 99
    .line 100
    .line 101
    move-object v0, v10

    .line 102
    const/16 v14, 0xe

    .line 103
    .line 104
    const/4 v11, 0x0

    .line 105
    const/4 v12, 0x0

    .line 106
    move-object v10, v6

    .line 107
    move-object v13, v9

    .line 108
    move-object v9, v2

    .line 109
    invoke-static/range {v9 .. v14}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    iput-object v1, v0, La/sd60;->i:Ljava/lang/Object;

    .line 114
    .line 115
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    :goto_1
    return-object v5

    .line 118
    :pswitch_0
    move-object v7, v4

    .line 119
    check-cast v7, La/sd60;

    .line 120
    .line 121
    sget-object v1, La/wne;->a:La/wne;

    .line 122
    .line 123
    iget-boolean v4, v0, La/kza0;->j:Z

    .line 124
    .line 125
    if-eqz v4, :cond_5

    .line 126
    .line 127
    if-ne v4, v3, :cond_4

    .line 128
    .line 129
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_4
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    iget-object v2, v7, La/sd60;->g:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v2, La/ytt;

    .line 143
    .line 144
    sget-object v4, La/aue0;->d:La/aue0;

    .line 145
    .line 146
    iput-boolean v3, v0, La/kza0;->j:Z

    .line 147
    .line 148
    invoke-virtual {v2, v4, v0}, La/ytt;->a(La/aue0;La/yje;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    if-ne v2, v1, :cond_6

    .line 153
    .line 154
    move-object v5, v1

    .line 155
    goto :goto_3

    .line 156
    :cond_6
    :goto_2
    iget-object v1, v7, La/sd60;->b:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v1, La/oeg0;

    .line 159
    .line 160
    invoke-virtual {v1}, La/oeg0;->c()La/i1w0;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    new-instance v6, La/gc0;

    .line 165
    .line 166
    iget-object v8, v0, La/kza0;->k:La/mlr;

    .line 167
    .line 168
    iget v9, v0, La/kza0;->l:I

    .line 169
    .line 170
    iget-boolean v10, v0, La/kza0;->n:Z

    .line 171
    .line 172
    iget-object v11, v0, La/kza0;->m:Ljava/lang/String;

    .line 173
    .line 174
    invoke-direct/range {v6 .. v11}, La/gc0;-><init>(La/sd60;La/mlr;IZLjava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1, v6}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 178
    .line 179
    .line 180
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 181
    .line 182
    :goto_3
    return-object v5

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
