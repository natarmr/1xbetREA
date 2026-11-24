.class public final La/loo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kmq;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(La/kmq;Ljava/lang/String;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/loo;->a:B

    iput-object p1, p0, La/loo;->b:La/kmq;

    iput-object p2, p0, La/loo;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/loo;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/loo;->c:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, La/loo;->b:La/kmq;

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
    instance-of v0, p2, La/dl00;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    move-object v0, p2

    .line 21
    check-cast v0, La/dl00;

    .line 22
    .line 23
    iget v7, v0, La/dl00;->j:I

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
    iput v7, v0, La/dl00;->j:I

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance v0, La/dl00;

    .line 34
    .line 35
    invoke-direct {v0, p0, p2}, La/dl00;-><init>(La/loo;La/yje;)V

    .line 36
    .line 37
    .line 38
    :goto_0
    iget-object p0, v0, La/dl00;->i:Ljava/lang/Object;

    .line 39
    .line 40
    sget-object p2, La/wne;->a:La/wne;

    .line 41
    .line 42
    iget v5, v0, La/dl00;->j:I

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
    check-cast p1, Ljava/util/List;

    .line 60
    .line 61
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 62
    .line 63
    new-instance p0, La/fcg;

    .line 64
    .line 65
    invoke-direct {p0, p1, v1}, La/fcg;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    new-instance p1, La/j0g0;

    .line 69
    .line 70
    invoke-direct {p1, p0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iput v6, v0, La/dl00;->j:I

    .line 74
    .line 75
    invoke-interface {v2, p1, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    if-ne p0, p2, :cond_3

    .line 80
    .line 81
    move-object v3, p2

    .line 82
    goto :goto_2

    .line 83
    :cond_3
    :goto_1
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    :goto_2
    return-object v3

    .line 86
    :pswitch_0
    instance-of v0, p2, La/l3v;

    .line 87
    .line 88
    if-eqz v0, :cond_4

    .line 89
    .line 90
    move-object v0, p2

    .line 91
    check-cast v0, La/l3v;

    .line 92
    .line 93
    iget v7, v0, La/l3v;->j:I

    .line 94
    .line 95
    and-int v8, v7, v5

    .line 96
    .line 97
    if-eqz v8, :cond_4

    .line 98
    .line 99
    sub-int/2addr v7, v5

    .line 100
    iput v7, v0, La/l3v;->j:I

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_4
    new-instance v0, La/l3v;

    .line 104
    .line 105
    invoke-direct {v0, p0, p2}, La/l3v;-><init>(La/loo;La/yje;)V

    .line 106
    .line 107
    .line 108
    :goto_3
    iget-object p0, v0, La/l3v;->i:Ljava/lang/Object;

    .line 109
    .line 110
    sget-object p2, La/wne;->a:La/wne;

    .line 111
    .line 112
    iget v5, v0, La/l3v;->j:I

    .line 113
    .line 114
    if-eqz v5, :cond_6

    .line 115
    .line 116
    if-ne v5, v6, :cond_5

    .line 117
    .line 118
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_5
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_6
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    check-cast p1, Ljava/util/List;

    .line 130
    .line 131
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 132
    .line 133
    new-instance p0, La/fcg;

    .line 134
    .line 135
    invoke-direct {p0, p1, v1}, La/fcg;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    new-instance p1, La/j0g0;

    .line 139
    .line 140
    invoke-direct {p1, p0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    iput v6, v0, La/l3v;->j:I

    .line 144
    .line 145
    invoke-interface {v2, p1, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    if-ne p0, p2, :cond_7

    .line 150
    .line 151
    move-object v3, p2

    .line 152
    goto :goto_5

    .line 153
    :cond_7
    :goto_4
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 154
    .line 155
    :goto_5
    return-object v3

    .line 156
    :pswitch_1
    instance-of v0, p2, La/ixt;

    .line 157
    .line 158
    if-eqz v0, :cond_8

    .line 159
    .line 160
    move-object v0, p2

    .line 161
    check-cast v0, La/ixt;

    .line 162
    .line 163
    iget v7, v0, La/ixt;->j:I

    .line 164
    .line 165
    and-int v8, v7, v5

    .line 166
    .line 167
    if-eqz v8, :cond_8

    .line 168
    .line 169
    sub-int/2addr v7, v5

    .line 170
    iput v7, v0, La/ixt;->j:I

    .line 171
    .line 172
    goto :goto_6

    .line 173
    :cond_8
    new-instance v0, La/ixt;

    .line 174
    .line 175
    invoke-direct {v0, p0, p2}, La/ixt;-><init>(La/loo;La/yje;)V

    .line 176
    .line 177
    .line 178
    :goto_6
    iget-object p0, v0, La/ixt;->i:Ljava/lang/Object;

    .line 179
    .line 180
    sget-object p2, La/wne;->a:La/wne;

    .line 181
    .line 182
    iget v5, v0, La/ixt;->j:I

    .line 183
    .line 184
    if-eqz v5, :cond_a

    .line 185
    .line 186
    if-ne v5, v6, :cond_9

    .line 187
    .line 188
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    goto :goto_7

    .line 192
    :cond_9
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    goto :goto_8

    .line 196
    :cond_a
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    check-cast p1, Ljava/util/List;

    .line 200
    .line 201
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 202
    .line 203
    new-instance p0, La/ubb;

    .line 204
    .line 205
    invoke-direct {p0, p1, v1}, La/ubb;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    new-instance p1, La/j0g0;

    .line 209
    .line 210
    invoke-direct {p1, p0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    iput v6, v0, La/ixt;->j:I

    .line 214
    .line 215
    invoke-interface {v2, p1, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    if-ne p0, p2, :cond_b

    .line 220
    .line 221
    move-object v3, p2

    .line 222
    goto :goto_8

    .line 223
    :cond_b
    :goto_7
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 224
    .line 225
    :goto_8
    return-object v3

    .line 226
    :pswitch_2
    instance-of v0, p2, La/koo;

    .line 227
    .line 228
    if-eqz v0, :cond_c

    .line 229
    .line 230
    move-object v0, p2

    .line 231
    check-cast v0, La/koo;

    .line 232
    .line 233
    iget v7, v0, La/koo;->j:I

    .line 234
    .line 235
    and-int v8, v7, v5

    .line 236
    .line 237
    if-eqz v8, :cond_c

    .line 238
    .line 239
    sub-int/2addr v7, v5

    .line 240
    iput v7, v0, La/koo;->j:I

    .line 241
    .line 242
    goto :goto_9

    .line 243
    :cond_c
    new-instance v0, La/koo;

    .line 244
    .line 245
    invoke-direct {v0, p0, p2}, La/koo;-><init>(La/loo;La/yje;)V

    .line 246
    .line 247
    .line 248
    :goto_9
    iget-object p0, v0, La/koo;->i:Ljava/lang/Object;

    .line 249
    .line 250
    sget-object p2, La/wne;->a:La/wne;

    .line 251
    .line 252
    iget v5, v0, La/koo;->j:I

    .line 253
    .line 254
    if-eqz v5, :cond_e

    .line 255
    .line 256
    if-ne v5, v6, :cond_d

    .line 257
    .line 258
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    goto :goto_a

    .line 262
    :cond_d
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    goto :goto_b

    .line 266
    :cond_e
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    check-cast p1, Ljava/util/Map;

    .line 270
    .line 271
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object p0

    .line 275
    check-cast p0, Ljava/util/Map;

    .line 276
    .line 277
    if-nez p0, :cond_f

    .line 278
    .line 279
    sget-object p0, La/lun;->a:La/lun;

    .line 280
    .line 281
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    :cond_f
    iput v6, v0, La/koo;->j:I

    .line 285
    .line 286
    invoke-interface {v2, p0, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object p0

    .line 290
    if-ne p0, p2, :cond_10

    .line 291
    .line 292
    move-object v3, p2

    .line 293
    goto :goto_b

    .line 294
    :cond_10
    :goto_a
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 295
    .line 296
    :goto_b
    return-object v3

    .line 297
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
