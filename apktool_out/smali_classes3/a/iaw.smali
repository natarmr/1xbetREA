.class public final La/iaw;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/naw;

.field public final synthetic l:J

.field public final synthetic m:J


# direct methods
.method public synthetic constructor <init>(La/naw;JJLa/yje;B)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/iaw;->i:B

    iput-object p1, p0, La/iaw;->k:La/naw;

    iput-wide p2, p0, La/iaw;->l:J

    iput-wide p4, p0, La/iaw;->m:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 9

    .line 1
    iget-byte p1, p0, La/iaw;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, La/iaw;

    .line 7
    .line 8
    iget-wide v4, p0, La/iaw;->m:J

    .line 9
    .line 10
    const/4 v7, 0x1

    .line 11
    iget-object v1, p0, La/iaw;->k:La/naw;

    .line 12
    .line 13
    iget-wide v2, p0, La/iaw;->l:J

    .line 14
    .line 15
    move-object v6, p2

    .line 16
    invoke-direct/range {v0 .. v7}, La/iaw;-><init>(La/naw;JJLa/yje;B)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :pswitch_0
    move-object v6, p2

    .line 21
    new-instance v1, La/iaw;

    .line 22
    .line 23
    move-object v7, v6

    .line 24
    iget-wide v5, p0, La/iaw;->m:J

    .line 25
    .line 26
    const/4 v8, 0x0

    .line 27
    iget-object v2, p0, La/iaw;->k:La/naw;

    .line 28
    .line 29
    iget-wide v3, p0, La/iaw;->l:J

    .line 30
    .line 31
    invoke-direct/range {v1 .. v8}, La/iaw;-><init>(La/naw;JJLa/yje;B)V

    .line 32
    .line 33
    .line 34
    return-object v1

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/iaw;->i:B

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
    invoke-virtual {p0, p1, p2}, La/iaw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/iaw;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/iaw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/iaw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/iaw;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/iaw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 17

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, La/iaw;->i:B

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    iget-object v6, v5, La/iaw;->k:La/naw;

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v7, La/wne;->a:La/wne;

    .line 15
    .line 16
    iget-boolean v0, v5, La/iaw;->j:Z

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    if-ne v0, v3, :cond_0

    .line 21
    .line 22
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, v6, La/naw;->u:La/z220;

    .line 34
    .line 35
    iput-boolean v3, v5, La/iaw;->j:Z

    .line 36
    .line 37
    iget-wide v1, v5, La/iaw;->l:J

    .line 38
    .line 39
    iget-wide v3, v5, La/iaw;->m:J

    .line 40
    .line 41
    invoke-virtual/range {v0 .. v5}, La/z220;->B(JJLa/zje;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-ne v0, v7, :cond_2

    .line 46
    .line 47
    move-object v1, v7

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    :goto_0
    iget-object v0, v6, La/naw;->Z0:La/ol60;

    .line 50
    .line 51
    sget-object v1, La/j9w;->a:La/j9w;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, v6, La/naw;->W0:La/p7m0;

    .line 57
    .line 58
    :cond_3
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    move-object v2, v1

    .line 63
    check-cast v2, La/l9h0;

    .line 64
    .line 65
    const/4 v15, 0x0

    .line 66
    const/16 v16, 0x7ffe

    .line 67
    .line 68
    const/4 v3, 0x0

    .line 69
    const/4 v4, 0x0

    .line 70
    const/4 v5, 0x0

    .line 71
    const/4 v6, 0x0

    .line 72
    const/4 v7, 0x0

    .line 73
    const/4 v8, 0x0

    .line 74
    const/4 v9, 0x0

    .line 75
    const/4 v10, 0x0

    .line 76
    const/4 v11, 0x0

    .line 77
    const/4 v12, 0x0

    .line 78
    const/4 v13, 0x0

    .line 79
    const/4 v14, 0x0

    .line 80
    invoke-static/range {v2 .. v16}, La/l9h0;->a(La/l9h0;ZZZLa/s77;ZZZZZLorg/xplatform/ui_core/resources/UiText$ByRes;La/psd;ZZI)La/l9h0;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_3

    .line 89
    .line 90
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    :goto_1
    return-object v1

    .line 93
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 94
    .line 95
    iget-boolean v4, v5, La/iaw;->j:Z

    .line 96
    .line 97
    if-eqz v4, :cond_5

    .line 98
    .line 99
    if-ne v4, v3, :cond_4

    .line 100
    .line 101
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_4
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    iget-object v1, v6, La/naw;->s:La/lef0;

    .line 113
    .line 114
    iget-wide v7, v5, La/iaw;->l:J

    .line 115
    .line 116
    const-wide/16 v9, 0x3e8

    .line 117
    .line 118
    mul-long/2addr v7, v9

    .line 119
    iget-wide v11, v5, La/iaw;->m:J

    .line 120
    .line 121
    mul-long/2addr v11, v9

    .line 122
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 126
    .line 127
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    iget-object v1, v1, La/lef0;->a:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v1, La/l77;

    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    iget-object v2, v1, La/l77;->a:La/m0w;

    .line 138
    .line 139
    iput-wide v7, v2, La/m0w;->e:J

    .line 140
    .line 141
    iput-wide v11, v1, La/l77;->d:J

    .line 142
    .line 143
    iget-object v1, v6, La/naw;->r:La/dv3;

    .line 144
    .line 145
    sget-object v2, La/pdj;->b:La/pdj;

    .line 146
    .line 147
    iput-boolean v3, v5, La/iaw;->j:Z

    .line 148
    .line 149
    invoke-virtual {v1, v2, v5}, La/dv3;->a(La/pdj;La/bnn0;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    if-ne v1, v0, :cond_6

    .line 154
    .line 155
    move-object v1, v0

    .line 156
    goto :goto_3

    .line 157
    :cond_6
    :goto_2
    sget-object v0, La/naw;->d1:Ljava/util/List;

    .line 158
    .line 159
    invoke-virtual {v6}, La/naw;->P()V

    .line 160
    .line 161
    .line 162
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 163
    .line 164
    :goto_3
    return-object v1

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
