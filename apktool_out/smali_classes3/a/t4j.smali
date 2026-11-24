.class public final La/t4j;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/cr;


# direct methods
.method public synthetic constructor <init>(La/cr;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/t4j;->i:B

    iput-object p1, p0, La/t4j;->k:La/cr;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 1

    .line 1
    iget-byte p1, p0, La/t4j;->i:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, La/t4j;

    .line 7
    .line 8
    iget-object p0, p0, La/t4j;->k:La/cr;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {p1, p0, p2, v0}, La/t4j;-><init>(La/cr;La/yje;B)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :pswitch_0
    new-instance p1, La/t4j;

    .line 16
    .line 17
    iget-object p0, p0, La/t4j;->k:La/cr;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-direct {p1, p0, p2, v0}, La/t4j;-><init>(La/cr;La/yje;B)V

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
    iget-byte v0, p0, La/t4j;->i:B

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
    invoke-virtual {p0, p1, p2}, La/t4j;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/t4j;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/t4j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/t4j;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/t4j;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/t4j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 11

    .line 1
    iget-byte v0, p0, La/t4j;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/wne;->a:La/wne;

    .line 11
    .line 12
    iget-boolean v4, p0, La/t4j;->j:Z

    .line 13
    .line 14
    iget-object v6, p0, La/t4j;->k:La/cr;

    .line 15
    .line 16
    if-eqz v4, :cond_1

    .line 17
    .line 18
    if-ne v4, v2, :cond_0

    .line 19
    .line 20
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    goto/16 :goto_4

    .line 28
    .line 29
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, v6, La/cr;->f:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, La/cu;

    .line 35
    .line 36
    iput-boolean v2, p0, La/t4j;->j:Z

    .line 37
    .line 38
    invoke-virtual {p1, p0}, La/cu;->l(La/zje;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-ne p1, v0, :cond_2

    .line 43
    .line 44
    move-object v3, v0

    .line 45
    goto/16 :goto_4

    .line 46
    .line 47
    :cond_2
    :goto_0
    move-object v7, p1

    .line 48
    check-cast v7, La/n85;

    .line 49
    .line 50
    if-eqz v7, :cond_6

    .line 51
    .line 52
    iget-object p0, v7, La/n85;->k:La/huo0;

    .line 53
    .line 54
    instance-of p1, p0, La/aet;

    .line 55
    .line 56
    if-eqz p1, :cond_3

    .line 57
    .line 58
    move-object v3, p0

    .line 59
    check-cast v3, La/aet;

    .line 60
    .line 61
    :cond_3
    if-eqz v3, :cond_4

    .line 62
    .line 63
    invoke-virtual {v3}, La/aet;->a()La/mzb0;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    if-eqz p0, :cond_4

    .line 68
    .line 69
    iget-wide p0, p0, La/mzb0;->a:J

    .line 70
    .line 71
    :goto_1
    move-wide v8, p0

    .line 72
    goto :goto_2

    .line 73
    :cond_4
    const-wide/16 p0, 0x0

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :goto_2
    iget-object p0, v6, La/cr;->c:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast p0, La/us00;

    .line 79
    .line 80
    const p1, 0x7f130660

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    iget-object p1, v6, La/cr;->i:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p1, La/jvq;

    .line 93
    .line 94
    iget-object p1, p1, La/jvq;->b:Ljava/lang/ref/WeakReference;

    .line 95
    .line 96
    if-eqz p1, :cond_5

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    check-cast p1, La/kxq;

    .line 103
    .line 104
    if-eqz p1, :cond_5

    .line 105
    .line 106
    iget-object p1, p1, La/zfd;->a:La/glz;

    .line 107
    .line 108
    if-eqz p1, :cond_5

    .line 109
    .line 110
    iget-object p1, p1, La/glz;->i:La/lkz;

    .line 111
    .line 112
    if-eqz p1, :cond_5

    .line 113
    .line 114
    sget-object v0, La/lkz;->d:La/lkz;

    .line 115
    .line 116
    invoke-virtual {p1, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-ltz p1, :cond_5

    .line 121
    .line 122
    iget-object p1, v6, La/cr;->k:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast p1, La/b4j;

    .line 125
    .line 126
    iget-object p1, p1, La/b4j;->a:La/kt2;

    .line 127
    .line 128
    const-string v0, "dchallenge_alert_rush_view"

    .line 129
    .line 130
    invoke-interface {p1, v0}, La/kt2;->c(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    iget-object p1, v6, La/cr;->m:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast p1, La/je;

    .line 136
    .line 137
    iget-object p1, p1, La/je;->a:La/s1p;

    .line 138
    .line 139
    const-wide/16 v0, 0x2ac2

    .line 140
    .line 141
    sget-object v2, La/xun;->a:La/xun;

    .line 142
    .line 143
    invoke-virtual {p1, v2, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 144
    .line 145
    .line 146
    sget-object p1, La/wtq;->a:La/wtq;

    .line 147
    .line 148
    sget-object v0, La/wtq;->c:La/wtq;

    .line 149
    .line 150
    filled-new-array {p1, v0}, [La/wtq;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-static {p1}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    new-instance v5, La/pe1;

    .line 159
    .line 160
    const/4 v10, 0x4

    .line 161
    invoke-direct/range {v5 .. v10}, La/pe1;-><init>(Ljava/lang/Object;Ljava/lang/Object;JB)V

    .line 162
    .line 163
    .line 164
    const v0, 0x7f130655

    .line 165
    .line 166
    .line 167
    invoke-static {v6, p0, v0, p1, v5}, La/cr;->g(La/cr;Ljava/lang/String;ILjava/util/Set;Lkotlin/jvm/functions/Function0;)V

    .line 168
    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_5
    iget-object p1, v7, La/n85;->h:La/sba0;

    .line 172
    .line 173
    new-instance v0, Ljava/lang/Long;

    .line 174
    .line 175
    invoke-direct {v0, v8, v9}, Ljava/lang/Long;-><init>(J)V

    .line 176
    .line 177
    .line 178
    sget-object v1, La/sr00;->g:La/sr00;

    .line 179
    .line 180
    invoke-virtual {v6, p0, p1, v0, v1}, La/cr;->f(Ljava/lang/String;La/sba0;Ljava/lang/Long;La/sr00;)V

    .line 181
    .line 182
    .line 183
    :cond_6
    :goto_3
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 184
    .line 185
    :goto_4
    return-object v3

    .line 186
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 187
    .line 188
    iget-boolean v4, p0, La/t4j;->j:Z

    .line 189
    .line 190
    iget-object v5, p0, La/t4j;->k:La/cr;

    .line 191
    .line 192
    if-eqz v4, :cond_8

    .line 193
    .line 194
    if-ne v4, v2, :cond_7

    .line 195
    .line 196
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_7
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    goto/16 :goto_7

    .line 204
    .line 205
    :cond_8
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    iget-object p1, v5, La/cr;->e:Ljava/lang/Object;

    .line 209
    .line 210
    check-cast p1, La/nr;

    .line 211
    .line 212
    iput-boolean v2, p0, La/t4j;->j:Z

    .line 213
    .line 214
    invoke-virtual {p1, p0}, La/nr;->v(La/zje;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    if-ne p1, v0, :cond_9

    .line 219
    .line 220
    move-object v3, v0

    .line 221
    goto :goto_7

    .line 222
    :cond_9
    :goto_5
    check-cast p1, Ljava/lang/Boolean;

    .line 223
    .line 224
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 225
    .line 226
    .line 227
    move-result p0

    .line 228
    if-eqz p0, :cond_b

    .line 229
    .line 230
    iget-object p0, v5, La/cr;->c:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast p0, La/us00;

    .line 233
    .line 234
    const p1, 0x7f130651

    .line 235
    .line 236
    .line 237
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    iget-object p1, v5, La/cr;->i:Ljava/lang/Object;

    .line 245
    .line 246
    check-cast p1, La/jvq;

    .line 247
    .line 248
    iget-object p1, p1, La/jvq;->b:Ljava/lang/ref/WeakReference;

    .line 249
    .line 250
    if-eqz p1, :cond_a

    .line 251
    .line 252
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    check-cast p1, La/kxq;

    .line 257
    .line 258
    if-eqz p1, :cond_a

    .line 259
    .line 260
    iget-object p1, p1, La/zfd;->a:La/glz;

    .line 261
    .line 262
    if-eqz p1, :cond_a

    .line 263
    .line 264
    iget-object p1, p1, La/glz;->i:La/lkz;

    .line 265
    .line 266
    if-eqz p1, :cond_a

    .line 267
    .line 268
    sget-object v0, La/lkz;->d:La/lkz;

    .line 269
    .line 270
    invoke-virtual {p1, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 271
    .line 272
    .line 273
    move-result p1

    .line 274
    if-ltz p1, :cond_a

    .line 275
    .line 276
    iget-object p1, v5, La/cr;->k:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast p1, La/b4j;

    .line 279
    .line 280
    iget-object p1, p1, La/b4j;->a:La/kt2;

    .line 281
    .line 282
    const-string v0, "dchallenge_alert_view"

    .line 283
    .line 284
    invoke-interface {p1, v0}, La/kt2;->c(Ljava/lang/String;)V

    .line 285
    .line 286
    .line 287
    iget-object p1, v5, La/cr;->m:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast p1, La/je;

    .line 290
    .line 291
    iget-object p1, p1, La/je;->a:La/s1p;

    .line 292
    .line 293
    const-wide/16 v0, 0x2abe

    .line 294
    .line 295
    sget-object v2, La/xun;->a:La/xun;

    .line 296
    .line 297
    invoke-virtual {p1, v2, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 298
    .line 299
    .line 300
    sget-object p1, La/wtq;->b:La/wtq;

    .line 301
    .line 302
    sget-object v0, La/wtq;->c:La/wtq;

    .line 303
    .line 304
    filled-new-array {p1, v0}, [La/wtq;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    invoke-static {p1}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    new-instance v0, La/e8g;

    .line 313
    .line 314
    const/16 v1, 0x19

    .line 315
    .line 316
    invoke-direct {v0, v5, v1}, La/e8g;-><init>(Ljava/lang/Object;B)V

    .line 317
    .line 318
    .line 319
    const v1, 0x7f13064c

    .line 320
    .line 321
    .line 322
    invoke-static {v5, p0, v1, p1, v0}, La/cr;->g(La/cr;Ljava/lang/String;ILjava/util/Set;Lkotlin/jvm/functions/Function0;)V

    .line 323
    .line 324
    .line 325
    goto :goto_6

    .line 326
    :cond_a
    sget-object p1, La/sr00;->f:La/sr00;

    .line 327
    .line 328
    invoke-virtual {v5, p0, v3, v3, p1}, La/cr;->f(Ljava/lang/String;La/sba0;Ljava/lang/Long;La/sr00;)V

    .line 329
    .line 330
    .line 331
    :cond_b
    :goto_6
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 332
    .line 333
    :goto_7
    return-object v3

    .line 334
    nop

    .line 335
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
