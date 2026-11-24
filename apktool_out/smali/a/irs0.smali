.class public final La/irs0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:I

.field public k:I

.field public l:I

.field public m:B

.field public n:[Ljava/lang/Enum;

.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;

.field public r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;


# direct methods
.method public constructor <init>([La/ae60;La/krs0;La/ghs0;La/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/irs0;->i:B

    .line 15
    iput-object p1, p0, La/irs0;->q:Ljava/lang/Object;

    iput-object p2, p0, La/irs0;->r:Ljava/lang/Object;

    iput-object p3, p0, La/irs0;->s:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>([La/zd60;La/jrs0;La/fhs0;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/irs0;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/irs0;->o:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/irs0;->q:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, La/irs0;->s:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 p1, 0x2

    .line 11
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/irs0;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/irs0;->s:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v1, p0, La/irs0;->q:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/irs0;

    .line 11
    .line 12
    check-cast v1, [La/ae60;

    .line 13
    .line 14
    iget-object p0, p0, La/irs0;->r:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, La/krs0;

    .line 17
    .line 18
    check-cast v0, La/ghs0;

    .line 19
    .line 20
    invoke-direct {p1, v1, p0, v0, p2}, La/irs0;-><init>([La/ae60;La/krs0;La/ghs0;La/yje;)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    :pswitch_0
    new-instance p1, La/irs0;

    .line 25
    .line 26
    iget-object p0, p0, La/irs0;->o:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, [La/zd60;

    .line 29
    .line 30
    check-cast v1, La/jrs0;

    .line 31
    .line 32
    check-cast v0, La/fhs0;

    .line 33
    .line 34
    invoke-direct {p1, p0, v1, v0, p2}, La/irs0;-><init>([La/zd60;La/jrs0;La/fhs0;La/yje;)V

    .line 35
    .line 36
    .line 37
    return-object p1

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/irs0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/lva0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/irs0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/irs0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/irs0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/jz80;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/irs0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/irs0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/irs0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/irs0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/irs0;->s:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/irs0;->q:Ljava/lang/Object;

    .line 6
    .line 7
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v7, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    sget-object v0, La/wne;->a:La/wne;

    .line 17
    .line 18
    iget-byte v8, p0, La/irs0;->m:B

    .line 19
    .line 20
    if-eqz v8, :cond_2

    .line 21
    .line 22
    if-eq v8, v4, :cond_0

    .line 23
    .line 24
    if-ne v8, v5, :cond_1

    .line 25
    .line 26
    :cond_0
    iget v1, p0, La/irs0;->l:I

    .line 27
    .line 28
    iget v2, p0, La/irs0;->k:I

    .line 29
    .line 30
    iget v3, p0, La/irs0;->j:I

    .line 31
    .line 32
    iget-object v6, p0, La/irs0;->p:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v6, La/ghs0;

    .line 35
    .line 36
    iget-object v8, p0, La/irs0;->o:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v8, La/krs0;

    .line 39
    .line 40
    iget-object v9, p0, La/irs0;->n:[Ljava/lang/Enum;

    .line 41
    .line 42
    check-cast v9, [La/ae60;

    .line 43
    .line 44
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    goto/16 :goto_4

    .line 52
    .line 53
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    check-cast v2, [La/ae60;

    .line 57
    .line 58
    iget-object p1, p0, La/irs0;->r:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p1, La/krs0;

    .line 61
    .line 62
    check-cast v1, La/ghs0;

    .line 63
    .line 64
    array-length v3, v2

    .line 65
    move-object v8, p1

    .line 66
    move-object v9, v2

    .line 67
    move p1, v6

    .line 68
    move-object v2, v1

    .line 69
    move v1, v3

    .line 70
    :goto_0
    if-ge v6, v1, :cond_7

    .line 71
    .line 72
    aget-object v3, v9, v6

    .line 73
    .line 74
    add-int/lit8 v10, p1, 0x1

    .line 75
    .line 76
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_6

    .line 81
    .line 82
    if-eq v3, v4, :cond_5

    .line 83
    .line 84
    if-ne v3, v5, :cond_4

    .line 85
    .line 86
    iput-object v9, p0, La/irs0;->n:[Ljava/lang/Enum;

    .line 87
    .line 88
    iput-object v8, p0, La/irs0;->o:Ljava/lang/Object;

    .line 89
    .line 90
    iput-object v2, p0, La/irs0;->p:Ljava/lang/Object;

    .line 91
    .line 92
    iput v10, p0, La/irs0;->j:I

    .line 93
    .line 94
    iput v6, p0, La/irs0;->k:I

    .line 95
    .line 96
    iput v1, p0, La/irs0;->l:I

    .line 97
    .line 98
    iput-byte v5, p0, La/irs0;->m:B

    .line 99
    .line 100
    invoke-virtual {v8, v2, p1, p0}, La/krs0;->h(La/ghs0;ILa/zje;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    if-ne p1, v0, :cond_3

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_3
    move v3, v6

    .line 108
    move-object v6, v2

    .line 109
    move v2, v3

    .line 110
    move v3, v10

    .line 111
    :goto_1
    move-object p1, v6

    .line 112
    move v6, v2

    .line 113
    move-object v2, p1

    .line 114
    move p1, v3

    .line 115
    goto :goto_3

    .line 116
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 117
    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_5
    iput-object v9, p0, La/irs0;->n:[Ljava/lang/Enum;

    .line 121
    .line 122
    iput-object v8, p0, La/irs0;->o:Ljava/lang/Object;

    .line 123
    .line 124
    iput-object v2, p0, La/irs0;->p:Ljava/lang/Object;

    .line 125
    .line 126
    iput v10, p0, La/irs0;->j:I

    .line 127
    .line 128
    iput v6, p0, La/irs0;->k:I

    .line 129
    .line 130
    iput v1, p0, La/irs0;->l:I

    .line 131
    .line 132
    iput-byte v4, p0, La/irs0;->m:B

    .line 133
    .line 134
    invoke-virtual {v8, v2, p1, p0}, La/krs0;->g(La/ghs0;ILa/zje;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    if-ne p1, v0, :cond_3

    .line 139
    .line 140
    :goto_2
    move-object v7, v0

    .line 141
    goto :goto_4

    .line 142
    :cond_6
    move p1, v10

    .line 143
    :goto_3
    add-int/2addr v6, v4

    .line 144
    goto :goto_0

    .line 145
    :cond_7
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 146
    .line 147
    :goto_4
    return-object v7

    .line 148
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 149
    .line 150
    iget-byte v8, p0, La/irs0;->m:B

    .line 151
    .line 152
    if-eqz v8, :cond_a

    .line 153
    .line 154
    if-eq v8, v4, :cond_8

    .line 155
    .line 156
    if-ne v8, v5, :cond_9

    .line 157
    .line 158
    :cond_8
    iget v1, p0, La/irs0;->l:I

    .line 159
    .line 160
    iget v2, p0, La/irs0;->k:I

    .line 161
    .line 162
    iget v3, p0, La/irs0;->j:I

    .line 163
    .line 164
    iget-object v6, p0, La/irs0;->r:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v6, La/fhs0;

    .line 167
    .line 168
    iget-object v8, p0, La/irs0;->p:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v8, La/jrs0;

    .line 171
    .line 172
    iget-object v9, p0, La/irs0;->n:[Ljava/lang/Enum;

    .line 173
    .line 174
    check-cast v9, [La/zd60;

    .line 175
    .line 176
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    goto :goto_6

    .line 180
    :cond_9
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    goto/16 :goto_9

    .line 184
    .line 185
    :cond_a
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    iget-object p1, p0, La/irs0;->o:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast p1, [La/zd60;

    .line 191
    .line 192
    check-cast v2, La/jrs0;

    .line 193
    .line 194
    check-cast v1, La/fhs0;

    .line 195
    .line 196
    array-length v3, p1

    .line 197
    move-object v9, p1

    .line 198
    move-object v8, v2

    .line 199
    move p1, v6

    .line 200
    move-object v2, v1

    .line 201
    move v1, v3

    .line 202
    :goto_5
    if-ge v6, v1, :cond_f

    .line 203
    .line 204
    aget-object v3, v9, v6

    .line 205
    .line 206
    add-int/lit8 v10, p1, 0x1

    .line 207
    .line 208
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 209
    .line 210
    .line 211
    move-result v3

    .line 212
    if-eqz v3, :cond_e

    .line 213
    .line 214
    if-eq v3, v4, :cond_d

    .line 215
    .line 216
    if-ne v3, v5, :cond_c

    .line 217
    .line 218
    iput-object v9, p0, La/irs0;->n:[Ljava/lang/Enum;

    .line 219
    .line 220
    iput-object v8, p0, La/irs0;->p:Ljava/lang/Object;

    .line 221
    .line 222
    iput-object v2, p0, La/irs0;->r:Ljava/lang/Object;

    .line 223
    .line 224
    iput v10, p0, La/irs0;->j:I

    .line 225
    .line 226
    iput v6, p0, La/irs0;->k:I

    .line 227
    .line 228
    iput v1, p0, La/irs0;->l:I

    .line 229
    .line 230
    iput-byte v5, p0, La/irs0;->m:B

    .line 231
    .line 232
    invoke-virtual {v8, v2, p1, p0}, La/jrs0;->k(La/fhs0;ILa/zje;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object p1

    .line 236
    if-ne p1, v0, :cond_b

    .line 237
    .line 238
    goto :goto_7

    .line 239
    :cond_b
    move v3, v6

    .line 240
    move-object v6, v2

    .line 241
    move v2, v3

    .line 242
    move v3, v10

    .line 243
    :goto_6
    move-object p1, v6

    .line 244
    move v6, v2

    .line 245
    move-object v2, p1

    .line 246
    move p1, v3

    .line 247
    goto :goto_8

    .line 248
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 249
    .line 250
    .line 251
    goto :goto_9

    .line 252
    :cond_d
    iput-object v9, p0, La/irs0;->n:[Ljava/lang/Enum;

    .line 253
    .line 254
    iput-object v8, p0, La/irs0;->p:Ljava/lang/Object;

    .line 255
    .line 256
    iput-object v2, p0, La/irs0;->r:Ljava/lang/Object;

    .line 257
    .line 258
    iput v10, p0, La/irs0;->j:I

    .line 259
    .line 260
    iput v6, p0, La/irs0;->k:I

    .line 261
    .line 262
    iput v1, p0, La/irs0;->l:I

    .line 263
    .line 264
    iput-byte v4, p0, La/irs0;->m:B

    .line 265
    .line 266
    invoke-virtual {v8, v2, p1, p0}, La/jrs0;->j(La/fhs0;ILa/zje;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    if-ne p1, v0, :cond_b

    .line 271
    .line 272
    :goto_7
    move-object v7, v0

    .line 273
    goto :goto_9

    .line 274
    :cond_e
    move p1, v10

    .line 275
    :goto_8
    add-int/2addr v6, v4

    .line 276
    goto :goto_5

    .line 277
    :cond_f
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 278
    .line 279
    :goto_9
    return-object v7

    .line 280
    nop

    .line 281
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
