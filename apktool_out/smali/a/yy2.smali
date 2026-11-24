.class public final La/yy2;
.super La/zzf0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic j:B

.field public k:B

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/yy2;->j:B

    iput-object p1, p0, La/yy2;->m:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/zzf0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/yy2;->j:B

    .line 2
    .line 3
    iget-object p0, p0, La/yy2;->m:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/yy2;

    .line 9
    .line 10
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {v0, p0, p2, v1}, La/yy2;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 14
    .line 15
    .line 16
    iput-object p1, v0, La/yy2;->l:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_0
    new-instance v0, La/yy2;

    .line 20
    .line 21
    check-cast p0, La/az2;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-direct {v0, p0, p2, v1}, La/yy2;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 25
    .line 26
    .line 27
    iput-object p1, v0, La/yy2;->l:Ljava/lang/Object;

    .line 28
    .line 29
    return-object v0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/yy2;->j:B

    .line 2
    .line 3
    check-cast p1, La/inn0;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/yy2;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/yy2;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/yy2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/yy2;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/yy2;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/yy2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 13

    .line 1
    iget-byte v0, p0, La/yy2;->j:B

    .line 2
    .line 3
    iget-object v1, p0, La/yy2;->m:Ljava/lang/Object;

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    sget-object v0, La/wne;->a:La/wne;

    .line 14
    .line 15
    iget-byte v6, p0, La/yy2;->k:B

    .line 16
    .line 17
    if-eqz v6, :cond_2

    .line 18
    .line 19
    if-eq v6, v3, :cond_1

    .line 20
    .line 21
    if-ne v6, v4, :cond_0

    .line 22
    .line 23
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    goto :goto_3

    .line 31
    :cond_1
    iget-object v2, p0, La/yy2;->l:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v2, La/inn0;

    .line 34
    .line 35
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iget-object p1, p0, La/yy2;->l:Ljava/lang/Object;

    .line 43
    .line 44
    move-object v2, p1

    .line 45
    check-cast v2, La/inn0;

    .line 46
    .line 47
    iput-object v2, p0, La/yy2;->l:Ljava/lang/Object;

    .line 48
    .line 49
    iput-byte v3, p0, La/yy2;->k:B

    .line 50
    .line 51
    invoke-static {v2, p0}, La/d7x;->r(La/inn0;La/zw5;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    if-ne p1, v0, :cond_3

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    :goto_0
    check-cast p1, La/dpa0;

    .line 59
    .line 60
    invoke-virtual {p1}, La/dpa0;->a()V

    .line 61
    .line 62
    .line 63
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 64
    .line 65
    iget-wide v6, p1, La/dpa0;->c:J

    .line 66
    .line 67
    new-instance p1, La/ne60;

    .line 68
    .line 69
    invoke-direct {p1, v6, v7}, La/ne60;-><init>(J)V

    .line 70
    .line 71
    .line 72
    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    iput-object v5, p0, La/yy2;->l:Ljava/lang/Object;

    .line 76
    .line 77
    iput-byte v4, p0, La/yy2;->k:B

    .line 78
    .line 79
    sget-object p1, La/tto0;->a:La/bk9;

    .line 80
    .line 81
    sget-object p1, La/xoa0;->b:La/xoa0;

    .line 82
    .line 83
    invoke-static {v2, p1, p0}, La/tto0;->i(La/inn0;La/xoa0;La/zw5;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    if-ne p1, v0, :cond_4

    .line 88
    .line 89
    :goto_1
    move-object v5, v0

    .line 90
    goto :goto_3

    .line 91
    :cond_4
    :goto_2
    check-cast p1, La/dpa0;

    .line 92
    .line 93
    if-eqz p1, :cond_5

    .line 94
    .line 95
    invoke-virtual {p1}, La/dpa0;->a()V

    .line 96
    .line 97
    .line 98
    :cond_5
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    :goto_3
    return-object v5

    .line 101
    :pswitch_0
    check-cast v1, La/az2;

    .line 102
    .line 103
    sget-object v0, La/wne;->a:La/wne;

    .line 104
    .line 105
    iget-byte v6, p0, La/yy2;->k:B

    .line 106
    .line 107
    const/4 v7, 0x0

    .line 108
    if-eqz v6, :cond_8

    .line 109
    .line 110
    if-eq v6, v3, :cond_7

    .line 111
    .line 112
    if-ne v6, v4, :cond_6

    .line 113
    .line 114
    iget-object v2, p0, La/yy2;->l:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v2, La/inn0;

    .line 117
    .line 118
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_6
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    goto/16 :goto_a

    .line 126
    .line 127
    :cond_7
    iget-object v2, p0, La/yy2;->l:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v2, La/inn0;

    .line 130
    .line 131
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    iget-object p1, p0, La/yy2;->l:Ljava/lang/Object;

    .line 139
    .line 140
    move-object v2, p1

    .line 141
    check-cast v2, La/inn0;

    .line 142
    .line 143
    iput-object v2, p0, La/yy2;->l:Ljava/lang/Object;

    .line 144
    .line 145
    iput-byte v3, p0, La/yy2;->k:B

    .line 146
    .line 147
    invoke-static {v2, v7, p0, v4}, La/tto0;->b(La/inn0;ZLa/yje;I)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    if-ne p1, v0, :cond_9

    .line 152
    .line 153
    goto :goto_5

    .line 154
    :cond_9
    :goto_4
    check-cast p1, La/dpa0;

    .line 155
    .line 156
    iget-wide v8, p1, La/dpa0;->a:J

    .line 157
    .line 158
    iput-wide v8, v1, La/az2;->h:J

    .line 159
    .line 160
    iget-wide v8, p1, La/dpa0;->c:J

    .line 161
    .line 162
    iput-wide v8, v1, La/az2;->b:J

    .line 163
    .line 164
    :cond_a
    iput-object v2, p0, La/yy2;->l:Ljava/lang/Object;

    .line 165
    .line 166
    iput-byte v4, p0, La/yy2;->k:B

    .line 167
    .line 168
    sget-object p1, La/xoa0;->b:La/xoa0;

    .line 169
    .line 170
    invoke-virtual {v2, p1, p0}, La/inn0;->a(La/xoa0;La/yje;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    if-ne p1, v0, :cond_b

    .line 175
    .line 176
    :goto_5
    move-object v5, v0

    .line 177
    goto :goto_a

    .line 178
    :cond_b
    :goto_6
    check-cast p1, La/woa0;

    .line 179
    .line 180
    iget-object p1, p1, La/woa0;->a:Ljava/util/List;

    .line 181
    .line 182
    new-instance v3, Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 185
    .line 186
    .line 187
    move-result v6

    .line 188
    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 189
    .line 190
    .line 191
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 192
    .line 193
    .line 194
    move-result v6

    .line 195
    move v8, v7

    .line 196
    :goto_7
    if-ge v8, v6, :cond_d

    .line 197
    .line 198
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v9

    .line 202
    move-object v10, v9

    .line 203
    check-cast v10, La/dpa0;

    .line 204
    .line 205
    iget-boolean v10, v10, La/dpa0;->d:Z

    .line 206
    .line 207
    if-eqz v10, :cond_c

    .line 208
    .line 209
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    :cond_c
    add-int/lit8 v8, v8, 0x1

    .line 213
    .line 214
    goto :goto_7

    .line 215
    :cond_d
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 216
    .line 217
    .line 218
    move-result p1

    .line 219
    move v6, v7

    .line 220
    :goto_8
    if-ge v6, p1, :cond_f

    .line 221
    .line 222
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v8

    .line 226
    move-object v9, v8

    .line 227
    check-cast v9, La/dpa0;

    .line 228
    .line 229
    iget-wide v9, v9, La/dpa0;->a:J

    .line 230
    .line 231
    iget-wide v11, v1, La/az2;->h:J

    .line 232
    .line 233
    invoke-static {v9, v10, v11, v12}, La/b5x;->I(JJ)Z

    .line 234
    .line 235
    .line 236
    move-result v9

    .line 237
    if-eqz v9, :cond_e

    .line 238
    .line 239
    goto :goto_9

    .line 240
    :cond_e
    add-int/lit8 v6, v6, 0x1

    .line 241
    .line 242
    goto :goto_8

    .line 243
    :cond_f
    move-object v8, v5

    .line 244
    :goto_9
    check-cast v8, La/dpa0;

    .line 245
    .line 246
    if-nez v8, :cond_10

    .line 247
    .line 248
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    move-object v8, p1

    .line 253
    check-cast v8, La/dpa0;

    .line 254
    .line 255
    :cond_10
    if-eqz v8, :cond_11

    .line 256
    .line 257
    iget-wide v9, v8, La/dpa0;->a:J

    .line 258
    .line 259
    iput-wide v9, v1, La/az2;->h:J

    .line 260
    .line 261
    iget-wide v8, v8, La/dpa0;->c:J

    .line 262
    .line 263
    iput-wide v8, v1, La/az2;->b:J

    .line 264
    .line 265
    :cond_11
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 266
    .line 267
    .line 268
    move-result p1

    .line 269
    if-eqz p1, :cond_a

    .line 270
    .line 271
    const-wide/16 p0, -0x1

    .line 272
    .line 273
    iput-wide p0, v1, La/az2;->h:J

    .line 274
    .line 275
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 276
    .line 277
    :goto_a
    return-object v5

    .line 278
    nop

    .line 279
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
