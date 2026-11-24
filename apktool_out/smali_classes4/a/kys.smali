.class public final La/kys;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kmq;

.field public final synthetic c:La/yys;


# direct methods
.method public synthetic constructor <init>(La/kmq;La/yys;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/kys;->a:B

    iput-object p1, p0, La/kys;->b:La/kmq;

    iput-object p2, p0, La/kys;->c:La/yys;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/kys;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/kys;->c:La/yys;

    .line 4
    .line 5
    iget-object v2, p0, La/kys;->b:La/kmq;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 9
    .line 10
    const/high16 v5, -0x80000000

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    instance-of v0, p2, La/rys;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    move-object v0, p2

    .line 21
    check-cast v0, La/rys;

    .line 22
    .line 23
    iget v7, v0, La/rys;->j:I

    .line 24
    .line 25
    and-int v8, v7, v5

    .line 26
    .line 27
    if-eqz v8, :cond_0

    .line 28
    .line 29
    sub-int/2addr v7, v5

    .line 30
    iput v7, v0, La/rys;->j:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance v0, La/rys;

    .line 34
    .line 35
    invoke-direct {v0, p0, p2}, La/rys;-><init>(La/kys;La/yje;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object p0, v0, La/rys;->i:Ljava/lang/Object;

    .line 39
    .line 40
    sget-object p2, La/wne;->a:La/wne;

    .line 41
    .line 42
    iget v5, v0, La/rys;->j:I

    .line 43
    .line 44
    if-eqz v5, :cond_2

    .line 45
    .line 46
    if-ne v5, v6, :cond_1

    .line 47
    .line 48
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    move-object p0, p1

    .line 60
    check-cast p0, Ljava/lang/Boolean;

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-eqz p0, :cond_3

    .line 67
    .line 68
    iget-object p0, v1, La/yys;->B:La/p7m0;

    .line 69
    .line 70
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, La/ixs;

    .line 75
    .line 76
    iget-object p0, p0, La/ixs;->m:Ljava/lang/Throwable;

    .line 77
    .line 78
    if-nez p0, :cond_3

    .line 79
    .line 80
    iput v6, v0, La/rys;->j:I

    .line 81
    .line 82
    invoke-interface {v2, p1, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    if-ne p0, p2, :cond_3

    .line 87
    .line 88
    move-object v3, p2

    .line 89
    goto :goto_2

    .line 90
    :cond_3
    :goto_1
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    :goto_2
    return-object v3

    .line 93
    :pswitch_0
    instance-of v0, p2, La/jys;

    .line 94
    .line 95
    if-eqz v0, :cond_4

    .line 96
    .line 97
    move-object v0, p2

    .line 98
    check-cast v0, La/jys;

    .line 99
    .line 100
    iget v7, v0, La/jys;->j:I

    .line 101
    .line 102
    and-int v8, v7, v5

    .line 103
    .line 104
    if-eqz v8, :cond_4

    .line 105
    .line 106
    sub-int/2addr v7, v5

    .line 107
    iput v7, v0, La/jys;->j:I

    .line 108
    .line 109
    goto :goto_3

    .line 110
    :cond_4
    new-instance v0, La/jys;

    .line 111
    .line 112
    invoke-direct {v0, p0, p2}, La/jys;-><init>(La/kys;La/yje;)V

    .line 113
    .line 114
    .line 115
    :goto_3
    iget-object p0, v0, La/jys;->i:Ljava/lang/Object;

    .line 116
    .line 117
    sget-object p2, La/wne;->a:La/wne;

    .line 118
    .line 119
    iget v5, v0, La/jys;->j:I

    .line 120
    .line 121
    if-eqz v5, :cond_6

    .line 122
    .line 123
    if-ne v5, v6, :cond_5

    .line 124
    .line 125
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    goto/16 :goto_8

    .line 129
    .line 130
    :cond_5
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    goto/16 :goto_9

    .line 134
    .line 135
    :cond_6
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    check-cast p1, La/ixs;

    .line 139
    .line 140
    iget-object p0, v1, La/yys;->q:La/ctf0;

    .line 141
    .line 142
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    iget-boolean v1, p1, La/ixs;->l:Z

    .line 149
    .line 150
    iget-boolean v3, p1, La/ixs;->h:Z

    .line 151
    .line 152
    iget-boolean v4, p1, La/ixs;->f:Z

    .line 153
    .line 154
    iget-object v5, p1, La/ixs;->j:La/hl90;

    .line 155
    .line 156
    sget-object v7, La/oxs;->a:La/oxs;

    .line 157
    .line 158
    if-eqz v1, :cond_7

    .line 159
    .line 160
    if-nez v5, :cond_7

    .line 161
    .line 162
    goto/16 :goto_7

    .line 163
    .line 164
    :cond_7
    iget-object v1, p1, La/ixs;->m:Ljava/lang/Throwable;

    .line 165
    .line 166
    instance-of v8, v1, La/lws;

    .line 167
    .line 168
    const/4 v9, 0x0

    .line 169
    if-nez v8, :cond_11

    .line 170
    .line 171
    instance-of v8, v1, La/fpd0;

    .line 172
    .line 173
    if-eqz v8, :cond_8

    .line 174
    .line 175
    goto/16 :goto_6

    .line 176
    .line 177
    :cond_8
    instance-of v8, v1, La/kws;

    .line 178
    .line 179
    if-eqz v8, :cond_9

    .line 180
    .line 181
    new-array p1, v9, [Ljava/lang/Object;

    .line 182
    .line 183
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 184
    .line 185
    invoke-static {p1, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    const v1, 0x7f1307be

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0, v1, p1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    new-instance v7, La/lxs;

    .line 197
    .line 198
    invoke-direct {v7, p0}, La/lxs;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    goto/16 :goto_7

    .line 202
    .line 203
    :cond_9
    if-eqz v1, :cond_b

    .line 204
    .line 205
    instance-of p1, v1, La/hxs;

    .line 206
    .line 207
    if-eqz p1, :cond_a

    .line 208
    .line 209
    check-cast v1, La/hxs;

    .line 210
    .line 211
    iget-object p0, v1, La/hxs;->a:Ljava/lang/String;

    .line 212
    .line 213
    goto :goto_4

    .line 214
    :cond_a
    new-array p1, v9, [Ljava/lang/Object;

    .line 215
    .line 216
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 217
    .line 218
    invoke-static {p1, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    const v1, 0x7f1316fc

    .line 223
    .line 224
    .line 225
    invoke-virtual {p0, v1, p1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    :goto_4
    new-instance v7, La/nxs;

    .line 230
    .line 231
    invoke-direct {v7, p0}, La/nxs;-><init>(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    goto :goto_7

    .line 235
    :cond_b
    iget-boolean p0, p1, La/ixs;->n:Z

    .line 236
    .line 237
    if-eqz p0, :cond_f

    .line 238
    .line 239
    iget-boolean p0, p1, La/ixs;->k:Z

    .line 240
    .line 241
    if-eqz p0, :cond_f

    .line 242
    .line 243
    if-nez v5, :cond_c

    .line 244
    .line 245
    const/4 p0, -0x1

    .line 246
    goto :goto_5

    .line 247
    :cond_c
    sget-object p0, La/uxs;->a:[I

    .line 248
    .line 249
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 250
    .line 251
    .line 252
    move-result p1

    .line 253
    aget p0, p0, p1

    .line 254
    .line 255
    :goto_5
    if-eq p0, v6, :cond_e

    .line 256
    .line 257
    const/4 p1, 0x2

    .line 258
    if-eq p0, p1, :cond_d

    .line 259
    .line 260
    goto :goto_7

    .line 261
    :cond_d
    sget-object v7, La/pxs;->a:La/pxs;

    .line 262
    .line 263
    goto :goto_7

    .line 264
    :cond_e
    sget-object v7, La/qxs;->a:La/qxs;

    .line 265
    .line 266
    goto :goto_7

    .line 267
    :cond_f
    iget-boolean p0, p1, La/ixs;->g:Z

    .line 268
    .line 269
    if-nez p0, :cond_10

    .line 270
    .line 271
    if-eqz v4, :cond_10

    .line 272
    .line 273
    new-instance v7, La/sxs;

    .line 274
    .line 275
    iget-object p0, p1, La/ixs;->e:Ljava/lang/String;

    .line 276
    .line 277
    invoke-direct {v7, p0, v3}, La/sxs;-><init>(Ljava/lang/String;Z)V

    .line 278
    .line 279
    .line 280
    goto :goto_7

    .line 281
    :cond_10
    new-instance v7, La/rxs;

    .line 282
    .line 283
    iget-boolean p0, p1, La/ixs;->i:Z

    .line 284
    .line 285
    invoke-direct {v7, v4, v3, p0}, La/rxs;-><init>(ZZZ)V

    .line 286
    .line 287
    .line 288
    goto :goto_7

    .line 289
    :cond_11
    :goto_6
    new-array p1, v9, [Ljava/lang/Object;

    .line 290
    .line 291
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 292
    .line 293
    invoke-static {p1, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    const v1, 0x7f131799

    .line 298
    .line 299
    .line 300
    invoke-virtual {p0, v1, p1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object p0

    .line 304
    new-instance v7, La/mxs;

    .line 305
    .line 306
    invoke-direct {v7, p0}, La/mxs;-><init>(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    :goto_7
    iput v6, v0, La/jys;->j:I

    .line 310
    .line 311
    invoke-interface {v2, v7, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    if-ne p0, p2, :cond_12

    .line 316
    .line 317
    move-object v3, p2

    .line 318
    goto :goto_9

    .line 319
    :cond_12
    :goto_8
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 320
    .line 321
    :goto_9
    return-object v3

    .line 322
    nop

    .line 323
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
