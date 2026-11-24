.class public final La/v550;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/d650;

.field public final synthetic l:La/t150;


# direct methods
.method public synthetic constructor <init>(La/d650;La/t150;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/v550;->i:B

    iput-object p1, p0, La/v550;->k:La/d650;

    iput-object p2, p0, La/v550;->l:La/t150;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte p1, p0, La/v550;->i:B

    .line 2
    .line 3
    iget-object v0, p0, La/v550;->l:La/t150;

    .line 4
    .line 5
    iget-object p0, p0, La/v550;->k:La/d650;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/v550;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-direct {p1, p0, v0, p2, v1}, La/v550;-><init>(La/d650;La/t150;La/yje;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/v550;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p1, p0, v0, p2, v1}, La/v550;-><init>(La/d650;La/t150;La/yje;B)V

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
    iget-byte v0, p0, La/v550;->i:B

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
    invoke-virtual {p0, p1, p2}, La/v550;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/v550;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/v550;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/v550;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/v550;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/v550;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 12

    .line 1
    iget-byte v0, p0, La/v550;->i:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "my_aggregator_banner"

    .line 5
    .line 6
    const/4 v3, 0x2

    .line 7
    const-string v4, "my_aggregator"

    .line 8
    .line 9
    iget-object v5, p0, La/v550;->l:La/t150;

    .line 10
    .line 11
    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    .line 12
    .line 13
    const/4 v7, 0x1

    .line 14
    iget-object v8, p0, La/v550;->k:La/d650;

    .line 15
    .line 16
    const/4 v9, 0x0

    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    sget-object v0, La/wne;->a:La/wne;

    .line 21
    .line 22
    iget-boolean v10, p0, La/v550;->j:Z

    .line 23
    .line 24
    if-eqz v10, :cond_1

    .line 25
    .line 26
    if-ne v10, v7, :cond_0

    .line 27
    .line 28
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    goto/16 :goto_3

    .line 36
    .line 37
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    sget p1, La/d650;->k1:I

    .line 41
    .line 42
    iget-object p1, v8, La/d650;->O:La/cmt;

    .line 43
    .line 44
    iget-object v6, v8, La/d650;->N:La/s64;

    .line 45
    .line 46
    iget-object v10, v8, La/d650;->J:La/u58;

    .line 47
    .line 48
    iget-boolean v11, v8, La/d650;->c1:Z

    .line 49
    .line 50
    if-nez v11, :cond_5

    .line 51
    .line 52
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-eqz v5, :cond_4

    .line 57
    .line 58
    if-eq v5, v7, :cond_3

    .line 59
    .line 60
    if-ne v5, v3, :cond_2

    .line 61
    .line 62
    invoke-virtual {v10, v2}, La/u58;->m(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    sget-object v2, La/y1p;->B:La/y1p;

    .line 66
    .line 67
    invoke-virtual {p1}, La/cmt;->g()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {v6, v2, p1}, La/s64;->d(La/y1p;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 76
    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_3
    invoke-virtual {v10, v9, v9, v4}, La/u58;->h(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    iget-object p1, v8, La/d650;->K:La/gg5;

    .line 83
    .line 84
    invoke-virtual {p1, v9, v9, v4}, La/gg5;->n(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_4
    invoke-virtual {v10, v4}, La/u58;->m(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    sget-object v2, La/y1p;->A:La/y1p;

    .line 92
    .line 93
    invoke-virtual {p1}, La/cmt;->g()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {v6, v2, p1}, La/s64;->d(La/y1p;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    :cond_5
    :goto_0
    iget-object p1, v8, La/d650;->s0:La/ytt;

    .line 101
    .line 102
    sget-object v2, La/aue0;->d:La/aue0;

    .line 103
    .line 104
    iput-boolean v7, p0, La/v550;->j:Z

    .line 105
    .line 106
    invoke-virtual {p1, v2, p0}, La/ytt;->a(La/aue0;La/yje;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    if-ne p0, v0, :cond_6

    .line 111
    .line 112
    move-object v9, v0

    .line 113
    goto :goto_3

    .line 114
    :cond_6
    :goto_1
    iget-object p0, v8, La/d650;->I:La/oeg0;

    .line 115
    .line 116
    invoke-virtual {p0}, La/oeg0;->c()La/i1w0;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    new-instance v0, La/c8d;

    .line 125
    .line 126
    sget-object v2, La/y7d;->a:La/v7d;

    .line 127
    .line 128
    sget-object v3, La/o0w0;->a:La/o0w0;

    .line 129
    .line 130
    invoke-direct {v0, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 131
    .line 132
    .line 133
    invoke-static {p1, v0, v0, p0, p1}, La/cs0;->h(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;)La/lc00;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-virtual {p1, v1}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    :goto_2
    move-object v0, p1

    .line 142
    check-cast v0, La/paw;

    .line 143
    .line 144
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-eqz v1, :cond_7

    .line 149
    .line 150
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    check-cast v0, La/oe50;

    .line 155
    .line 156
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 157
    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_7
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 161
    .line 162
    :goto_3
    return-object v9

    .line 163
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 164
    .line 165
    iget-boolean v10, p0, La/v550;->j:Z

    .line 166
    .line 167
    if-eqz v10, :cond_9

    .line 168
    .line 169
    if-ne v10, v7, :cond_8

    .line 170
    .line 171
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    goto :goto_5

    .line 175
    :cond_8
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    goto :goto_7

    .line 179
    :cond_9
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    iget-boolean p1, v8, La/d650;->c1:Z

    .line 183
    .line 184
    iget-object v6, v8, La/d650;->N:La/s64;

    .line 185
    .line 186
    iget-object v10, v8, La/d650;->J:La/u58;

    .line 187
    .line 188
    if-nez p1, :cond_c

    .line 189
    .line 190
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 191
    .line 192
    .line 193
    move-result p1

    .line 194
    if-eqz p1, :cond_b

    .line 195
    .line 196
    if-eq p1, v7, :cond_c

    .line 197
    .line 198
    if-ne p1, v3, :cond_a

    .line 199
    .line 200
    invoke-virtual {v10, v2}, La/u58;->l(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    sget-object p1, La/y1p;->b:La/y1p;

    .line 204
    .line 205
    invoke-virtual {v6, v2}, La/s64;->c(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 210
    .line 211
    .line 212
    goto :goto_7

    .line 213
    :cond_b
    invoke-virtual {v10, v4}, La/u58;->l(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    sget-object p1, La/y1p;->b:La/y1p;

    .line 217
    .line 218
    invoke-virtual {v6, v4}, La/s64;->c(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    :cond_c
    :goto_4
    iget-object p1, v8, La/d650;->s0:La/ytt;

    .line 222
    .line 223
    sget-object v2, La/aue0;->d:La/aue0;

    .line 224
    .line 225
    iput-boolean v7, p0, La/v550;->j:Z

    .line 226
    .line 227
    invoke-virtual {p1, v2, p0}, La/ytt;->a(La/aue0;La/yje;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    if-ne p0, v0, :cond_d

    .line 232
    .line 233
    move-object v9, v0

    .line 234
    goto :goto_7

    .line 235
    :cond_d
    :goto_5
    iget-object p0, v8, La/d650;->I:La/oeg0;

    .line 236
    .line 237
    invoke-virtual {p0}, La/oeg0;->c()La/i1w0;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    new-instance v0, La/c8d;

    .line 246
    .line 247
    sget-object v2, La/y7d;->a:La/v7d;

    .line 248
    .line 249
    sget-object v3, La/n0w0;->a:La/n0w0;

    .line 250
    .line 251
    invoke-direct {v0, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 252
    .line 253
    .line 254
    invoke-static {p1, v0, v0, p0, p1}, La/cs0;->h(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;)La/lc00;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    invoke-virtual {p1, v1}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    :goto_6
    move-object v0, p1

    .line 263
    check-cast v0, La/paw;

    .line 264
    .line 265
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    if-eqz v1, :cond_e

    .line 270
    .line 271
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    check-cast v0, La/oe50;

    .line 276
    .line 277
    invoke-virtual {p0, v0}, La/i1w0;->a(La/oe50;)V

    .line 278
    .line 279
    .line 280
    goto :goto_6

    .line 281
    :cond_e
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 282
    .line 283
    :goto_7
    return-object v9

    .line 284
    nop

    .line 285
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
