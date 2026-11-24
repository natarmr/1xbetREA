.class public final La/u750;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/p850;

.field public final synthetic l:La/t150;


# direct methods
.method public synthetic constructor <init>(La/p850;La/t150;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/u750;->i:B

    iput-object p1, p0, La/u750;->k:La/p850;

    iput-object p2, p0, La/u750;->l:La/t150;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/u750;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/u750;->l:La/t150;

    .line 4
    .line 5
    iget-object p0, p0, La/u750;->k:La/p850;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/u750;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/u750;-><init>(La/p850;La/t150;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/u750;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/u750;-><init>(La/p850;La/t150;La/yje;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/u750;->i:B

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
    invoke-virtual {p0, p1, p2}, La/u750;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/u750;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/u750;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/u750;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/u750;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/u750;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 14

    .line 1
    iget-byte v0, p0, La/u750;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "my_aggregator_banner"

    .line 5
    .line 6
    const/4 v3, 0x2

    .line 7
    iget-object v4, p0, La/u750;->l:La/t150;

    .line 8
    .line 9
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    iget-object v6, p0, La/u750;->k:La/p850;

    .line 12
    .line 13
    const/4 v7, 0x1

    .line 14
    const-string v8, "my_aggregator"

    .line 15
    .line 16
    const/4 v9, 0x0

    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    iget-object v0, v6, La/p850;->m0:La/cmt;

    .line 21
    .line 22
    iget-object v10, v6, La/p850;->V:La/s64;

    .line 23
    .line 24
    iget-object v11, v6, La/p850;->U:La/u58;

    .line 25
    .line 26
    sget-object v12, La/wne;->a:La/wne;

    .line 27
    .line 28
    iget-boolean v13, p0, La/u750;->j:Z

    .line 29
    .line 30
    if-eqz v13, :cond_1

    .line 31
    .line 32
    if-ne v13, v7, :cond_0

    .line 33
    .line 34
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    goto/16 :goto_3

    .line 42
    .line 43
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    check-cast p1, La/p650;

    .line 51
    .line 52
    iget-object p1, p1, La/p650;->a:La/mi0;

    .line 53
    .line 54
    sget-object v5, La/mi0;->b:La/mi0;

    .line 55
    .line 56
    if-ne p1, v5, :cond_5

    .line 57
    .line 58
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_4

    .line 63
    .line 64
    if-eq p1, v7, :cond_3

    .line 65
    .line 66
    if-ne p1, v3, :cond_2

    .line 67
    .line 68
    invoke-virtual {v11, v2}, La/u58;->m(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sget-object p1, La/y1p;->B:La/y1p;

    .line 72
    .line 73
    invoke-virtual {v0}, La/cmt;->g()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v10, p1, v0}, La/s64;->d(La/y1p;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 82
    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_3
    invoke-virtual {v11, v9, v9, v8}, La/u58;->h(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    iget-object p1, v6, La/p850;->X:La/gg5;

    .line 89
    .line 90
    invoke-virtual {p1, v9, v9, v8}, La/gg5;->n(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_4
    invoke-virtual {v11, v8}, La/u58;->m(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    sget-object p1, La/y1p;->A:La/y1p;

    .line 98
    .line 99
    invoke-virtual {v0}, La/cmt;->g()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {v10, p1, v0}, La/s64;->d(La/y1p;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    :cond_5
    :goto_0
    iget-object p1, v6, La/p850;->N:La/ytt;

    .line 107
    .line 108
    sget-object v0, La/aue0;->d:La/aue0;

    .line 109
    .line 110
    iput-boolean v7, p0, La/u750;->j:Z

    .line 111
    .line 112
    invoke-virtual {p1, v0, p0}, La/ytt;->a(La/aue0;La/yje;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    if-ne p0, v12, :cond_6

    .line 117
    .line 118
    move-object v9, v12

    .line 119
    goto :goto_3

    .line 120
    :cond_6
    :goto_1
    iget-object p0, v6, La/p850;->o:La/oeg0;

    .line 121
    .line 122
    invoke-virtual {p0}, La/oeg0;->c()La/i1w0;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    new-instance v0, La/c8d;

    .line 131
    .line 132
    sget-object v2, La/y7d;->a:La/v7d;

    .line 133
    .line 134
    sget-object v3, La/o0w0;->a:La/o0w0;

    .line 135
    .line 136
    invoke-direct {v0, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 137
    .line 138
    .line 139
    invoke-static {p1, v0, v0, p0, p1}, La/cs0;->h(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;)La/lc00;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-virtual {p1, v1}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    :goto_2
    move-object v0, p1

    .line 148
    check-cast v0, La/paw;

    .line 149
    .line 150
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    if-eqz v1, :cond_7

    .line 155
    .line 156
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    check-cast v0, La/oe50;

    .line 161
    .line 162
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 163
    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_7
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 167
    .line 168
    :goto_3
    return-object v9

    .line 169
    :pswitch_0
    iget-object v0, v6, La/p850;->V:La/s64;

    .line 170
    .line 171
    iget-object v10, v6, La/p850;->U:La/u58;

    .line 172
    .line 173
    sget-object v11, La/wne;->a:La/wne;

    .line 174
    .line 175
    iget-boolean v12, p0, La/u750;->j:Z

    .line 176
    .line 177
    if-eqz v12, :cond_9

    .line 178
    .line 179
    if-ne v12, v7, :cond_8

    .line 180
    .line 181
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_8
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    goto :goto_7

    .line 189
    :cond_9
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    check-cast p1, La/p650;

    .line 197
    .line 198
    iget-object p1, p1, La/p650;->a:La/mi0;

    .line 199
    .line 200
    sget-object v5, La/mi0;->b:La/mi0;

    .line 201
    .line 202
    if-ne p1, v5, :cond_c

    .line 203
    .line 204
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 205
    .line 206
    .line 207
    move-result p1

    .line 208
    if-eqz p1, :cond_b

    .line 209
    .line 210
    if-eq p1, v3, :cond_a

    .line 211
    .line 212
    goto :goto_4

    .line 213
    :cond_a
    invoke-virtual {v10, v2}, La/u58;->l(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    sget-object p1, La/y1p;->b:La/y1p;

    .line 217
    .line 218
    invoke-virtual {v0, v2}, La/s64;->c(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    goto :goto_4

    .line 222
    :cond_b
    invoke-virtual {v10, v8}, La/u58;->l(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    sget-object p1, La/y1p;->b:La/y1p;

    .line 226
    .line 227
    invoke-virtual {v0, v8}, La/s64;->c(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    :cond_c
    :goto_4
    iget-object p1, v6, La/p850;->N:La/ytt;

    .line 231
    .line 232
    sget-object v0, La/aue0;->d:La/aue0;

    .line 233
    .line 234
    iput-boolean v7, p0, La/u750;->j:Z

    .line 235
    .line 236
    invoke-virtual {p1, v0, p0}, La/ytt;->a(La/aue0;La/yje;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    if-ne p0, v11, :cond_d

    .line 241
    .line 242
    move-object v9, v11

    .line 243
    goto :goto_7

    .line 244
    :cond_d
    :goto_5
    iget-object p0, v6, La/p850;->o:La/oeg0;

    .line 245
    .line 246
    invoke-virtual {p0}, La/oeg0;->c()La/i1w0;

    .line 247
    .line 248
    .line 249
    move-result-object p0

    .line 250
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    new-instance v0, La/c8d;

    .line 255
    .line 256
    sget-object v2, La/y7d;->a:La/v7d;

    .line 257
    .line 258
    sget-object v3, La/n0w0;->a:La/n0w0;

    .line 259
    .line 260
    invoke-direct {v0, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 261
    .line 262
    .line 263
    invoke-static {p1, v0, v0, p0, p1}, La/cs0;->h(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;)La/lc00;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    invoke-virtual {p1, v1}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    :goto_6
    move-object v0, p1

    .line 272
    check-cast v0, La/paw;

    .line 273
    .line 274
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 275
    .line 276
    .line 277
    move-result v1

    .line 278
    if-eqz v1, :cond_e

    .line 279
    .line 280
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    check-cast v0, La/oe50;

    .line 285
    .line 286
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 287
    .line 288
    .line 289
    goto :goto_6

    .line 290
    :cond_e
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 291
    .line 292
    :goto_7
    return-object v9

    .line 293
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
