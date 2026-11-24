.class public final La/l21;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:I

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/ebq;ILjava/util/List;La/yje;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/l21;->i:B

    .line 18
    iput-object p1, p0, La/l21;->l:Ljava/lang/Object;

    iput p2, p0, La/l21;->j:I

    iput-object p3, p0, La/l21;->m:Ljava/lang/Object;

    invoke-direct {p0, v0, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/l7m0;Lkotlin/jvm/functions/Function1;La/kwj;ILa/yje;)V
    .locals 1

    const/4 v0, 0x3

    iput-byte v0, p0, La/l21;->i:B

    .line 19
    iput-object p1, p0, La/l21;->k:Ljava/lang/Object;

    iput-object p2, p0, La/l21;->l:Ljava/lang/Object;

    iput-object p3, p0, La/l21;->m:Ljava/lang/Object;

    iput p4, p0, La/l21;->j:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/n21;La/nw80;ILjava/lang/String;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/l21;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/l21;->k:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/l21;->l:Ljava/lang/Object;

    .line 7
    .line 8
    iput p3, p0, La/l21;->j:I

    .line 9
    .line 10
    iput-object p4, p0, La/l21;->m:Ljava/lang/Object;

    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(La/r8q;Ljava/util/List;ILa/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/l21;->i:B

    .line 17
    iput-object p1, p0, La/l21;->l:Ljava/lang/Object;

    iput-object p2, p0, La/l21;->m:Ljava/lang/Object;

    iput p3, p0, La/l21;->j:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 11

    .line 1
    iget-byte v0, p0, La/l21;->i:B

    .line 2
    .line 3
    iget v1, p0, La/l21;->j:I

    .line 4
    .line 5
    iget-object v2, p0, La/l21;->m:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/l21;->l:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v4, La/l21;

    .line 13
    .line 14
    iget-object p1, p0, La/l21;->k:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v5, p1

    .line 17
    check-cast v5, La/l7m0;

    .line 18
    .line 19
    move-object v6, v3

    .line 20
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 21
    .line 22
    move-object v7, v2

    .line 23
    check-cast v7, La/kwj;

    .line 24
    .line 25
    iget v8, p0, La/l21;->j:I

    .line 26
    .line 27
    move-object v9, p2

    .line 28
    invoke-direct/range {v4 .. v9}, La/l21;-><init>(La/l7m0;Lkotlin/jvm/functions/Function1;La/kwj;ILa/yje;)V

    .line 29
    .line 30
    .line 31
    return-object v4

    .line 32
    :pswitch_0
    move-object v9, p2

    .line 33
    new-instance p0, La/l21;

    .line 34
    .line 35
    check-cast v3, La/ebq;

    .line 36
    .line 37
    check-cast v2, Ljava/util/List;

    .line 38
    .line 39
    invoke-direct {p0, v3, v1, v2, v9}, La/l21;-><init>(La/ebq;ILjava/util/List;La/yje;)V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, La/l21;->k:Ljava/lang/Object;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_1
    move-object v9, p2

    .line 46
    new-instance p0, La/l21;

    .line 47
    .line 48
    check-cast v3, La/r8q;

    .line 49
    .line 50
    check-cast v2, Ljava/util/List;

    .line 51
    .line 52
    invoke-direct {p0, v3, v2, v1, v9}, La/l21;-><init>(La/r8q;Ljava/util/List;ILa/yje;)V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, La/l21;->k:Ljava/lang/Object;

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_2
    move-object v9, p2

    .line 59
    new-instance v5, La/l21;

    .line 60
    .line 61
    iget-object p1, p0, La/l21;->k:Ljava/lang/Object;

    .line 62
    .line 63
    move-object v6, p1

    .line 64
    check-cast v6, La/n21;

    .line 65
    .line 66
    move-object v7, v3

    .line 67
    check-cast v7, La/nw80;

    .line 68
    .line 69
    iget v8, p0, La/l21;->j:I

    .line 70
    .line 71
    check-cast v2, Ljava/lang/String;

    .line 72
    .line 73
    move-object v10, v9

    .line 74
    move-object v9, v2

    .line 75
    invoke-direct/range {v5 .. v10}, La/l21;-><init>(La/n21;La/nw80;ILjava/lang/String;La/yje;)V

    .line 76
    .line 77
    .line 78
    return-object v5

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/l21;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/l21;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/l21;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/l21;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/obq;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/l21;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/l21;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/l21;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/obq;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/l21;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/l21;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/l21;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/vne;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/l21;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/l21;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/l21;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/l21;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget v4, v0, La/l21;->j:I

    .line 7
    .line 8
    iget-object v5, v0, La/l21;->m:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v6, v0, La/l21;->l:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v1, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, La/l21;->k:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, La/l7m0;

    .line 23
    .line 24
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    instance-of v0, v0, La/nel;

    .line 29
    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 33
    .line 34
    check-cast v5, La/kwj;

    .line 35
    .line 36
    invoke-virtual {v5}, La/xk80;->k()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v4, :cond_0

    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    rem-int/2addr v0, v4

    .line 45
    add-int/2addr v0, v4

    .line 46
    rem-int v3, v0, v4

    .line 47
    .line 48
    :goto_0
    new-instance v0, Ljava/lang/Integer;

    .line 49
    .line 50
    invoke-direct {v0, v3}, Ljava/lang/Integer;-><init>(I)V

    .line 51
    .line 52
    .line 53
    invoke-interface {v6, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    :cond_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object v0

    .line 59
    :pswitch_0
    iget-object v0, v0, La/l21;->k:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, La/obq;

    .line 62
    .line 63
    sget-object v1, La/wne;->a:La/wne;

    .line 64
    .line 65
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    move-object v1, v6

    .line 69
    check-cast v1, La/ebq;

    .line 70
    .line 71
    iget-object v3, v1, La/ebq;->E:La/yuu;

    .line 72
    .line 73
    iget-object v6, v0, La/obq;->a:La/xbq;

    .line 74
    .line 75
    sget-object v7, La/ocq;->a:La/ocq;

    .line 76
    .line 77
    invoke-virtual {v3, v6, v7}, La/yuu;->t(La/xbq;La/ocq;)V

    .line 78
    .line 79
    .line 80
    iget-object v3, v1, La/ebq;->A:La/neu;

    .line 81
    .line 82
    iget-object v12, v0, La/obq;->b:La/kcq;

    .line 83
    .line 84
    iget-object v0, v12, La/kcq;->b:Ljava/util/List;

    .line 85
    .line 86
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->t0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    iget v6, v12, La/kcq;->a:F

    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    iget-object v3, v3, La/neu;->a:La/h7q;

    .line 99
    .line 100
    iget-object v3, v3, La/h7q;->c:La/q6q;

    .line 101
    .line 102
    iput v6, v3, La/q6q;->b:F

    .line 103
    .line 104
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    iget-object v3, v3, La/q6q;->d:La/p7m0;

    .line 108
    .line 109
    invoke-virtual {v3, v2, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    iget-object v0, v1, La/ebq;->C:La/c5k;

    .line 113
    .line 114
    invoke-virtual {v0}, La/c5k;->n()La/eb8;

    .line 115
    .line 116
    .line 117
    move-result-object v11

    .line 118
    iget-object v0, v1, La/ebq;->D:La/gr00;

    .line 119
    .line 120
    invoke-virtual {v0}, La/gr00;->x()La/cev;

    .line 121
    .line 122
    .line 123
    move-result-object v13

    .line 124
    move-object v7, v5

    .line 125
    check-cast v7, Ljava/util/List;

    .line 126
    .line 127
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 128
    .line 129
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 130
    .line 131
    :cond_2
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    move-object v6, v2

    .line 139
    check-cast v6, La/oaq;

    .line 140
    .line 141
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 142
    .line 143
    .line 144
    move-result-object v9

    .line 145
    const/16 v18, 0x0

    .line 146
    .line 147
    const/16 v19, 0xe0a

    .line 148
    .line 149
    const/4 v8, 0x0

    .line 150
    const/4 v10, 0x0

    .line 151
    const/4 v14, 0x0

    .line 152
    const/4 v15, 0x0

    .line 153
    const/16 v16, 0x0

    .line 154
    .line 155
    const/16 v17, 0x0

    .line 156
    .line 157
    invoke-static/range {v6 .. v19}, La/oaq;->a(La/oaq;Ljava/util/List;ZLjava/lang/Integer;La/g9q;La/eb8;La/kcq;La/cev;ZZILa/wbq;ZI)La/oaq;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-virtual {v0, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    if-eqz v2, :cond_2

    .line 166
    .line 167
    iget-object v0, v1, La/ebq;->o:La/vzg0;

    .line 168
    .line 169
    new-instance v1, Ljava/lang/Integer;

    .line 170
    .line 171
    invoke-direct {v1, v4}, Ljava/lang/Integer;-><init>(I)V

    .line 172
    .line 173
    .line 174
    const-string v2, "INSTRUMENT_ID_KEY"

    .line 175
    .line 176
    invoke-virtual {v0, v2, v1}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 180
    .line 181
    return-object v0

    .line 182
    :pswitch_1
    iget-object v0, v0, La/l21;->k:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v0, La/obq;

    .line 185
    .line 186
    sget-object v1, La/wne;->a:La/wne;

    .line 187
    .line 188
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    check-cast v6, La/r8q;

    .line 192
    .line 193
    iget-object v1, v6, La/r8q;->s:La/yuu;

    .line 194
    .line 195
    iget-object v7, v0, La/obq;->a:La/xbq;

    .line 196
    .line 197
    sget-object v8, La/r8q;->Y:La/ocq;

    .line 198
    .line 199
    invoke-virtual {v1, v7, v8}, La/yuu;->t(La/xbq;La/ocq;)V

    .line 200
    .line 201
    .line 202
    iget-object v1, v6, La/r8q;->o:La/neu;

    .line 203
    .line 204
    iget-object v0, v0, La/obq;->b:La/kcq;

    .line 205
    .line 206
    iget-object v1, v1, La/neu;->a:La/h7q;

    .line 207
    .line 208
    iget v8, v0, La/kcq;->a:F

    .line 209
    .line 210
    iget-object v9, v1, La/h7q;->c:La/q6q;

    .line 211
    .line 212
    iput v8, v9, La/q6q;->b:F

    .line 213
    .line 214
    iget-object v8, v0, La/kcq;->b:Ljava/util/List;

    .line 215
    .line 216
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    iget-object v1, v1, La/h7q;->c:La/q6q;

    .line 220
    .line 221
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    iget-object v1, v1, La/q6q;->d:La/p7m0;

    .line 225
    .line 226
    invoke-virtual {v1, v2, v8}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    check-cast v5, Ljava/util/List;

    .line 230
    .line 231
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 232
    .line 233
    .line 234
    move-result-object v1

    .line 235
    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 236
    .line 237
    .line 238
    move-result v8

    .line 239
    if-eqz v8, :cond_4

    .line 240
    .line 241
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v8

    .line 245
    move-object v9, v8

    .line 246
    check-cast v9, Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;

    .line 247
    .line 248
    iget v9, v9, Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;->a:I

    .line 249
    .line 250
    if-ne v9, v4, :cond_3

    .line 251
    .line 252
    goto :goto_1

    .line 253
    :cond_4
    move-object v8, v2

    .line 254
    :goto_1
    check-cast v8, Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;

    .line 255
    .line 256
    if-eqz v8, :cond_5

    .line 257
    .line 258
    iget v1, v8, Lorg/xplatform/feature/fin_bet/impl/presentation/model/FinInstrumentUIModel;->c:I

    .line 259
    .line 260
    move/from16 v19, v1

    .line 261
    .line 262
    goto :goto_2

    .line 263
    :cond_5
    const/16 v19, 0x0

    .line 264
    .line 265
    :goto_2
    iget-object v1, v6, La/r8q;->q:La/c5k;

    .line 266
    .line 267
    invoke-virtual {v1}, La/c5k;->n()La/eb8;

    .line 268
    .line 269
    .line 270
    move-result-object v1

    .line 271
    iget-object v4, v6, La/r8q;->r:La/gr00;

    .line 272
    .line 273
    invoke-virtual {v4}, La/gr00;->x()La/cev;

    .line 274
    .line 275
    .line 276
    move-result-object v4

    .line 277
    iget-object v9, v1, La/eb8;->a:Ljava/util/List;

    .line 278
    .line 279
    iget v8, v1, La/eb8;->b:F

    .line 280
    .line 281
    iget v10, v4, La/cev;->a:F

    .line 282
    .line 283
    sub-float v11, v8, v10

    .line 284
    .line 285
    div-float/2addr v11, v10

    .line 286
    const/high16 v10, 0x42c80000    # 100.0f

    .line 287
    .line 288
    mul-float v12, v11, v10

    .line 289
    .line 290
    iget-wide v10, v4, La/cev;->c:J

    .line 291
    .line 292
    const-wide/16 v21, 0x0

    .line 293
    .line 294
    cmp-long v13, v10, v21

    .line 295
    .line 296
    if-gez v13, :cond_6

    .line 297
    .line 298
    iget-wide v10, v4, La/cev;->b:J

    .line 299
    .line 300
    :cond_6
    const-wide/16 v14, 0x3e8

    .line 301
    .line 302
    mul-long/2addr v10, v14

    .line 303
    move v15, v13

    .line 304
    iget-wide v13, v1, La/eb8;->c:D

    .line 305
    .line 306
    iget-wide v2, v1, La/eb8;->d:D

    .line 307
    .line 308
    move-wide/from16 v16, v2

    .line 309
    .line 310
    iget v2, v7, La/xbq;->g:F

    .line 311
    .line 312
    const/4 v3, 0x1

    .line 313
    if-gez v15, :cond_7

    .line 314
    .line 315
    move/from16 v20, v3

    .line 316
    .line 317
    :goto_3
    move/from16 v18, v8

    .line 318
    .line 319
    goto :goto_4

    .line 320
    :cond_7
    const/16 v20, 0x0

    .line 321
    .line 322
    goto :goto_3

    .line 323
    :goto_4
    new-instance v8, La/ib8;

    .line 324
    .line 325
    move-wide/from16 v15, v16

    .line 326
    .line 327
    move/from16 v17, v2

    .line 328
    .line 329
    invoke-direct/range {v8 .. v20}, La/ib8;-><init>(Ljava/util/List;JFDDFFIZ)V

    .line 330
    .line 331
    .line 332
    iget-object v2, v6, La/r8q;->u:La/dyt;

    .line 333
    .line 334
    invoke-virtual {v2}, La/dyt;->a()J

    .line 335
    .line 336
    .line 337
    move-result-wide v9

    .line 338
    iget-wide v11, v7, La/xbq;->c:J

    .line 339
    .line 340
    cmp-long v2, v9, v21

    .line 341
    .line 342
    if-eqz v2, :cond_9

    .line 343
    .line 344
    cmp-long v2, v9, v11

    .line 345
    .line 346
    if-gez v2, :cond_8

    .line 347
    .line 348
    goto :goto_5

    .line 349
    :cond_8
    const/16 v31, 0x0

    .line 350
    .line 351
    goto :goto_6

    .line 352
    :cond_9
    :goto_5
    move/from16 v31, v3

    .line 353
    .line 354
    :goto_6
    iget-object v2, v6, La/r8q;->k:La/ctf0;

    .line 355
    .line 356
    invoke-virtual {v2}, La/ctf0;->h()Z

    .line 357
    .line 358
    .line 359
    move-result v33

    .line 360
    iget-object v2, v4, La/cev;->g:Ljava/util/List;

    .line 361
    .line 362
    iget-wide v9, v1, La/eb8;->c:D

    .line 363
    .line 364
    iget-wide v13, v1, La/eb8;->d:D

    .line 365
    .line 366
    iget-object v1, v0, La/kcq;->b:Ljava/util/List;

    .line 367
    .line 368
    iget-object v7, v4, La/cev;->e:Ljava/util/List;

    .line 369
    .line 370
    iget v4, v4, La/cev;->f:I

    .line 371
    .line 372
    iget-object v0, v0, La/kcq;->c:La/gcq;

    .line 373
    .line 374
    iget v15, v0, La/gcq;->a:I

    .line 375
    .line 376
    if-nez v15, :cond_a

    .line 377
    .line 378
    iget-object v0, v0, La/gcq;->b:Ljava/lang/String;

    .line 379
    .line 380
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 381
    .line 382
    .line 383
    move-result v0

    .line 384
    if-nez v0, :cond_a

    .line 385
    .line 386
    const/16 v32, 0x0

    .line 387
    .line 388
    goto :goto_8

    .line 389
    :cond_a
    const/16 v0, 0x5dc

    .line 390
    .line 391
    if-lt v15, v0, :cond_b

    .line 392
    .line 393
    const/16 v0, 0x1e

    .line 394
    .line 395
    :goto_7
    move/from16 v32, v0

    .line 396
    .line 397
    goto :goto_8

    .line 398
    :cond_b
    const/16 v0, 0x3c

    .line 399
    .line 400
    goto :goto_7

    .line 401
    :goto_8
    new-instance v23, La/zwb;

    .line 402
    .line 403
    move-object/from16 v24, v1

    .line 404
    .line 405
    move-object/from16 v34, v2

    .line 406
    .line 407
    move/from16 v25, v4

    .line 408
    .line 409
    move-object/from16 v30, v7

    .line 410
    .line 411
    move-wide/from16 v26, v9

    .line 412
    .line 413
    move-wide/from16 v28, v13

    .line 414
    .line 415
    invoke-direct/range {v23 .. v34}, La/zwb;-><init>(Ljava/util/List;IDDLjava/util/List;ZIZLjava/util/List;)V

    .line 416
    .line 417
    .line 418
    move-object/from16 v0, v23

    .line 419
    .line 420
    if-eqz v31, :cond_c

    .line 421
    .line 422
    iget-object v1, v6, La/r8q;->p:La/w4p0;

    .line 423
    .line 424
    iget-object v1, v1, La/w4p0;->b:Ljava/lang/Object;

    .line 425
    .line 426
    check-cast v1, La/h7q;

    .line 427
    .line 428
    iget-object v1, v1, La/h7q;->c:La/q6q;

    .line 429
    .line 430
    iput-wide v11, v1, La/q6q;->c:J

    .line 431
    .line 432
    :cond_c
    invoke-virtual {v6}, La/r8q;->A()V

    .line 433
    .line 434
    .line 435
    iget-object v1, v6, La/r8q;->Q:La/p7m0;

    .line 436
    .line 437
    new-instance v2, La/i8q;

    .line 438
    .line 439
    invoke-direct {v2, v0, v8}, La/i8q;-><init>(La/zwb;La/ib8;)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 443
    .line 444
    .line 445
    const/4 v0, 0x0

    .line 446
    invoke-virtual {v1, v0, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 447
    .line 448
    .line 449
    iget-object v1, v6, La/r8q;->U:La/p7m0;

    .line 450
    .line 451
    invoke-virtual {v6}, La/r8q;->x()La/l7q;

    .line 452
    .line 453
    .line 454
    move-result-object v2

    .line 455
    const/4 v4, 0x0

    .line 456
    invoke-static {v2, v4, v5, v3}, La/l7q;->a(La/l7q;ZLjava/util/List;I)La/l7q;

    .line 457
    .line 458
    .line 459
    move-result-object v2

    .line 460
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v1, v0, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 464
    .line 465
    .line 466
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 467
    .line 468
    return-object v0

    .line 469
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 470
    .line 471
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 472
    .line 473
    .line 474
    iget-object v0, v0, La/l21;->k:Ljava/lang/Object;

    .line 475
    .line 476
    check-cast v0, La/n21;

    .line 477
    .line 478
    iget-object v0, v0, La/n21;->q:La/oeg0;

    .line 479
    .line 480
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    check-cast v6, La/nw80;

    .line 485
    .line 486
    move-object v12, v5

    .line 487
    check-cast v12, Ljava/lang/String;

    .line 488
    .line 489
    invoke-static {v0, v0}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 490
    .line 491
    .line 492
    move-result-object v1

    .line 493
    new-instance v7, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorPublisherGamesFragmentScreen;

    .line 494
    .line 495
    invoke-virtual {v6}, La/nw80;->getId()J

    .line 496
    .line 497
    .line 498
    move-result-wide v8

    .line 499
    int-to-long v10, v4

    .line 500
    sget-object v14, La/rj1;->b:La/rj1;

    .line 501
    .line 502
    const/4 v13, 0x1

    .line 503
    invoke-direct/range {v7 .. v14}, Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorPublisherGamesFragmentScreen;-><init>(JJLjava/lang/String;ZLa/rj1;)V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v1, v7}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 507
    .line 508
    .line 509
    iget-object v1, v1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 510
    .line 511
    const/4 v4, 0x0

    .line 512
    invoke-static {v0, v1, v4}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 513
    .line 514
    .line 515
    move-result-object v1

    .line 516
    :goto_9
    move-object v2, v1

    .line 517
    check-cast v2, La/paw;

    .line 518
    .line 519
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 520
    .line 521
    .line 522
    move-result v3

    .line 523
    if-eqz v3, :cond_d

    .line 524
    .line 525
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v2

    .line 529
    check-cast v2, La/oe50;

    .line 530
    .line 531
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 532
    .line 533
    .line 534
    goto :goto_9

    .line 535
    :cond_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 536
    .line 537
    return-object v0

    .line 538
    nop

    .line 539
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
