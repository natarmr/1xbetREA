.class public final La/ana0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/dna0;


# direct methods
.method public synthetic constructor <init>(La/dna0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ana0;->i:B

    iput-object p1, p0, La/ana0;->k:La/dna0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ana0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ana0;->k:La/dna0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/ana0;

    .line 9
    .line 10
    const/4 v1, 0x3

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/ana0;-><init>(La/dna0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/ana0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/ana0;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/ana0;-><init>(La/dna0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/ana0;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/ana0;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/ana0;-><init>(La/dna0;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/ana0;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/ana0;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/ana0;-><init>(La/dna0;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/ana0;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    nop

    .line 45
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
    iget-byte v0, p0, La/ana0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/uaq0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/ana0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ana0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ana0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/hdm0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/ana0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/ana0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/ana0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/ana0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/ana0;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/ana0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, Ljava/util/List;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/ana0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/ana0;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/ana0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ana0;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/ana0;->k:La/dna0;

    .line 6
    .line 7
    iget-object v0, v0, La/ana0;->j:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object v7, v0

    .line 13
    check-cast v7, La/uaq0;

    .line 14
    .line 15
    sget-object v0, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object v3, v2, La/dna0;->v:La/fhj;

    .line 21
    .line 22
    iget-object v4, v2, La/dna0;->o:Ljava/lang/String;

    .line 23
    .line 24
    iget-wide v5, v2, La/dna0;->p:J

    .line 25
    .line 26
    const-wide/16 v8, 0x0

    .line 27
    .line 28
    invoke-virtual/range {v3 .. v9}, La/fhj;->s(Ljava/lang/String;JLa/uaq0;J)La/nc5;

    .line 29
    .line 30
    .line 31
    move-result-object v12

    .line 32
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 33
    .line 34
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 35
    .line 36
    :cond_0
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-object v10, v0

    .line 44
    check-cast v10, La/pma0;

    .line 45
    .line 46
    const/16 v18, 0x0

    .line 47
    .line 48
    const/16 v19, 0x1fb

    .line 49
    .line 50
    const/4 v11, 0x0

    .line 51
    const/4 v13, 0x0

    .line 52
    const/4 v14, 0x0

    .line 53
    const/4 v15, 0x0

    .line 54
    const/16 v16, 0x0

    .line 55
    .line 56
    const/16 v17, 0x0

    .line 57
    .line 58
    invoke-static/range {v10 .. v19}, La/pma0;->a(La/pma0;La/hdm0;La/nc5;La/fja0;Ljava/util/List;IZZZI)La/pma0;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_0

    .line 67
    .line 68
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object v0

    .line 71
    :pswitch_0
    check-cast v0, La/hdm0;

    .line 72
    .line 73
    sget-object v1, La/wne;->a:La/wne;

    .line 74
    .line 75
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    instance-of v1, v0, La/gdm0;

    .line 79
    .line 80
    if-eqz v1, :cond_1

    .line 81
    .line 82
    move-object v3, v0

    .line 83
    check-cast v3, La/gdm0;

    .line 84
    .line 85
    iget-object v3, v3, La/gdm0;->b:La/odm0;

    .line 86
    .line 87
    invoke-interface {v3}, La/odm0;->a()La/bom0;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    instance-of v3, v3, La/znm0;

    .line 92
    .line 93
    if-nez v3, :cond_1

    .line 94
    .line 95
    iget-object v3, v2, La/dna0;->D:La/bby;

    .line 96
    .line 97
    if-nez v3, :cond_1

    .line 98
    .line 99
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    new-instance v10, La/yma0;

    .line 104
    .line 105
    const/4 v3, 0x0

    .line 106
    const/4 v5, 0x3

    .line 107
    invoke-direct {v10, v2, v3, v5}, La/yma0;-><init>(La/dna0;La/yje;B)V

    .line 108
    .line 109
    .line 110
    const/16 v11, 0x2c

    .line 111
    .line 112
    const-wide/16 v5, 0x1e

    .line 113
    .line 114
    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 115
    .line 116
    const/4 v8, 0x0

    .line 117
    const/4 v9, 0x0

    .line 118
    invoke-static/range {v4 .. v11}, La/sac;->f0(La/vne;JLjava/util/concurrent/TimeUnit;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    iput-object v3, v2, La/dna0;->D:La/bby;

    .line 123
    .line 124
    :cond_1
    if-eqz v1, :cond_3

    .line 125
    .line 126
    move-object v1, v0

    .line 127
    check-cast v1, La/gdm0;

    .line 128
    .line 129
    iget-object v1, v1, La/gdm0;->b:La/odm0;

    .line 130
    .line 131
    invoke-interface {v1}, La/odm0;->a()La/bom0;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    instance-of v9, v1, La/znm0;

    .line 136
    .line 137
    iget-object v10, v2, La/dna0;->v:La/fhj;

    .line 138
    .line 139
    iget-object v11, v2, La/dna0;->o:Ljava/lang/String;

    .line 140
    .line 141
    iget-wide v12, v2, La/dna0;->p:J

    .line 142
    .line 143
    iget-object v1, v2, La/dna0;->t:La/wyu;

    .line 144
    .line 145
    invoke-virtual {v1}, La/wyu;->a()La/uaq0;

    .line 146
    .line 147
    .line 148
    move-result-object v14

    .line 149
    const-wide/16 v15, 0x0

    .line 150
    .line 151
    invoke-virtual/range {v10 .. v16}, La/fhj;->s(Ljava/lang/String;JLa/uaq0;J)La/nc5;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    iget-object v1, v2, La/i3t0;->i:La/ocj;

    .line 156
    .line 157
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 158
    .line 159
    :cond_2
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    move-object v3, v2

    .line 167
    check-cast v3, La/pma0;

    .line 168
    .line 169
    move-object v4, v0

    .line 170
    check-cast v4, La/gdm0;

    .line 171
    .line 172
    const/4 v11, 0x0

    .line 173
    const/16 v12, 0x1b9

    .line 174
    .line 175
    const/4 v6, 0x0

    .line 176
    const/4 v7, 0x0

    .line 177
    const/4 v8, 0x0

    .line 178
    const/4 v10, 0x0

    .line 179
    invoke-static/range {v3 .. v12}, La/pma0;->a(La/pma0;La/hdm0;La/nc5;La/fja0;Ljava/util/List;IZZZI)La/pma0;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    if-eqz v2, :cond_2

    .line 188
    .line 189
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 190
    .line 191
    return-object v0

    .line 192
    :pswitch_1
    check-cast v0, Ljava/lang/Throwable;

    .line 193
    .line 194
    sget-object v1, La/wne;->a:La/wne;

    .line 195
    .line 196
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    sget v1, La/dna0;->E:I

    .line 200
    .line 201
    iget-object v1, v2, La/dna0;->y:La/duj;

    .line 202
    .line 203
    new-instance v3, La/lma0;

    .line 204
    .line 205
    const/4 v4, 0x1

    .line 206
    invoke-direct {v3, v2, v4}, La/lma0;-><init>(Ljava/lang/Object;B)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v1, v0, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 210
    .line 211
    .line 212
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 213
    .line 214
    return-object v0

    .line 215
    :pswitch_2
    move-object v7, v0

    .line 216
    check-cast v7, Ljava/util/List;

    .line 217
    .line 218
    sget-object v0, La/wne;->a:La/wne;

    .line 219
    .line 220
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    sget v0, La/dna0;->E:I

    .line 224
    .line 225
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 226
    .line 227
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 228
    .line 229
    :cond_4
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v1

    .line 233
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    move-object v3, v1

    .line 237
    check-cast v3, La/pma0;

    .line 238
    .line 239
    const/4 v11, 0x0

    .line 240
    const/16 v12, 0x1ef

    .line 241
    .line 242
    const/4 v4, 0x0

    .line 243
    const/4 v5, 0x0

    .line 244
    const/4 v6, 0x0

    .line 245
    const/4 v8, 0x0

    .line 246
    const/4 v9, 0x0

    .line 247
    const/4 v10, 0x0

    .line 248
    invoke-static/range {v3 .. v12}, La/pma0;->a(La/pma0;La/hdm0;La/nc5;La/fja0;Ljava/util/List;IZZZI)La/pma0;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    if-eqz v1, :cond_4

    .line 257
    .line 258
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 259
    .line 260
    return-object v0

    .line 261
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
