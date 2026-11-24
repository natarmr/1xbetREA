.class public final La/e880;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/n880;


# direct methods
.method public synthetic constructor <init>(La/n880;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/e880;->i:B

    iput-object p1, p0, La/e880;->k:La/n880;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/e880;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/e880;->k:La/n880;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/e880;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/e880;-><init>(La/n880;La/yje;B)V

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    iput-boolean p0, v0, La/e880;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/e880;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/e880;-><init>(La/n880;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :pswitch_1
    new-instance p1, La/e880;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-direct {p1, p0, p2, v0}, La/e880;-><init>(La/n880;La/yje;B)V

    .line 34
    .line 35
    .line 36
    return-object p1

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/e880;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    check-cast p2, La/yje;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, La/e880;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/e880;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/e880;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, La/vne;

    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/e880;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/e880;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/e880;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_1
    check-cast p1, La/vne;

    .line 44
    .line 45
    check-cast p2, La/yje;

    .line 46
    .line 47
    invoke-virtual {p0, p1, p2}, La/e880;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/e880;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/e880;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/e880;->i:B

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v4, v0, La/e880;->k:La/n880;

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-boolean v0, v0, La/e880;->j:Z

    .line 15
    .line 16
    sget-object v1, La/wne;->a:La/wne;

    .line 17
    .line 18
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-object v0, v4, La/n880;->I:La/bby;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-interface {v0}, La/bby;->isCancelled()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-ne v0, v5, :cond_0

    .line 32
    .line 33
    invoke-virtual {v4}, La/n880;->N()V

    .line 34
    .line 35
    .line 36
    :cond_0
    iget-object v0, v4, La/n880;->J:La/bby;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-interface {v0}, La/bby;->isCancelled()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-ne v0, v5, :cond_1

    .line 45
    .line 46
    invoke-virtual {v4}, La/n880;->M()V

    .line 47
    .line 48
    .line 49
    :cond_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    return-object v0

    .line 52
    :pswitch_0
    sget-object v1, La/wne;->a:La/wne;

    .line 53
    .line 54
    iget-boolean v6, v0, La/e880;->j:Z

    .line 55
    .line 56
    if-eqz v6, :cond_3

    .line 57
    .line 58
    if-ne v6, v5, :cond_2

    .line 59
    .line 60
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    move-object/from16 v0, p1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iget-object v2, v4, La/n880;->G:La/czt;

    .line 74
    .line 75
    iget-object v2, v2, La/czt;->a:La/fsd;

    .line 76
    .line 77
    invoke-virtual {v2}, La/fsd;->b()La/k0j0;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    iget-object v3, v4, La/n880;->x:La/es;

    .line 82
    .line 83
    iget-object v6, v2, La/k0j0;->b:Ljava/util/List;

    .line 84
    .line 85
    iget-object v2, v2, La/k0j0;->c:Ljava/util/List;

    .line 86
    .line 87
    iput-boolean v5, v0, La/e880;->j:Z

    .line 88
    .line 89
    invoke-virtual {v3, v6, v2, v0}, La/es;->p(Ljava/util/List;Ljava/util/List;La/zje;)Ljava/io/Serializable;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    if-ne v0, v1, :cond_4

    .line 94
    .line 95
    move-object v3, v1

    .line 96
    goto :goto_1

    .line 97
    :cond_4
    :goto_0
    check-cast v0, La/qkt;

    .line 98
    .line 99
    iget v1, v0, La/qkt;->a:I

    .line 100
    .line 101
    const/4 v2, -0x1

    .line 102
    if-eq v1, v2, :cond_5

    .line 103
    .line 104
    sget v1, La/n880;->L:I

    .line 105
    .line 106
    new-instance v1, La/rb4;

    .line 107
    .line 108
    const/4 v2, 0x3

    .line 109
    invoke-direct {v1, v0, v5, v2}, La/rb4;-><init>(La/qkt;ZB)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v4, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 113
    .line 114
    .line 115
    :cond_5
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    :goto_1
    return-object v3

    .line 118
    :pswitch_1
    sget-object v1, La/wne;->a:La/wne;

    .line 119
    .line 120
    iget-boolean v6, v0, La/e880;->j:Z

    .line 121
    .line 122
    if-eqz v6, :cond_7

    .line 123
    .line 124
    if-ne v6, v5, :cond_6

    .line 125
    .line 126
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    move-object/from16 v0, p1

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_6
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    iget-object v2, v4, La/n880;->A:La/ivn;

    .line 140
    .line 141
    iput-boolean v5, v0, La/e880;->j:Z

    .line 142
    .line 143
    iget-object v2, v2, La/ivn;->a:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v2, La/ju9;

    .line 146
    .line 147
    iget-object v6, v2, La/ju9;->c:La/mne;

    .line 148
    .line 149
    iget-object v6, v6, La/mne;->b:La/dvj;

    .line 150
    .line 151
    new-instance v7, La/hu9;

    .line 152
    .line 153
    invoke-direct {v7, v2, v3, v5}, La/hu9;-><init>(La/ju9;La/yje;B)V

    .line 154
    .line 155
    .line 156
    invoke-static {v6, v7, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    if-ne v0, v1, :cond_8

    .line 161
    .line 162
    move-object v3, v1

    .line 163
    goto :goto_3

    .line 164
    :cond_8
    :goto_2
    move-object v8, v0

    .line 165
    check-cast v8, Ljava/util/List;

    .line 166
    .line 167
    iget-object v0, v4, La/n880;->B:La/p4u;

    .line 168
    .line 169
    invoke-virtual {v0, v8}, La/p4u;->c(Ljava/util/List;)La/bt9;

    .line 170
    .line 171
    .line 172
    move-result-object v9

    .line 173
    iget-object v0, v4, La/i3t0;->i:La/ocj;

    .line 174
    .line 175
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 176
    .line 177
    :cond_9
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    move-object v5, v1

    .line 185
    check-cast v5, La/y780;

    .line 186
    .line 187
    const/16 v21, 0x0

    .line 188
    .line 189
    const v22, 0x2bff3

    .line 190
    .line 191
    .line 192
    const/4 v6, 0x0

    .line 193
    const/4 v7, 0x0

    .line 194
    const/4 v10, 0x0

    .line 195
    const/4 v11, 0x0

    .line 196
    const/4 v12, 0x0

    .line 197
    const/4 v13, 0x0

    .line 198
    const/4 v14, 0x0

    .line 199
    const/4 v15, 0x0

    .line 200
    const/16 v16, 0x0

    .line 201
    .line 202
    const/16 v17, 0x0

    .line 203
    .line 204
    const/16 v18, 0x0

    .line 205
    .line 206
    const/16 v19, 0x0

    .line 207
    .line 208
    const/16 v20, 0x0

    .line 209
    .line 210
    invoke-static/range {v5 .. v22}, La/y780;->a(La/y780;Ljava/lang/String;ILjava/util/List;La/bt9;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZZI)La/y780;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v1

    .line 218
    if-eqz v1, :cond_9

    .line 219
    .line 220
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 221
    .line 222
    :goto_3
    return-object v3

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
