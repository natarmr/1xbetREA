.class public final La/r260;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kmq;

.field public final synthetic c:La/v360;


# direct methods
.method public synthetic constructor <init>(La/kmq;La/v360;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/r260;->a:B

    iput-object p1, p0, La/r260;->b:La/kmq;

    iput-object p2, p0, La/r260;->c:La/v360;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/r260;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/r260;->c:La/v360;

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    iget-object v3, p0, La/r260;->b:La/kmq;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    const/high16 v6, -0x80000000

    .line 13
    .line 14
    const/4 v7, 0x1

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    instance-of v0, p2, La/b360;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    move-object v0, p2

    .line 23
    check-cast v0, La/b360;

    .line 24
    .line 25
    iget v8, v0, La/b360;->j:I

    .line 26
    .line 27
    and-int v9, v8, v6

    .line 28
    .line 29
    if-eqz v9, :cond_0

    .line 30
    .line 31
    sub-int/2addr v8, v6

    .line 32
    iput v8, v0, La/b360;->j:I

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    new-instance v0, La/b360;

    .line 36
    .line 37
    invoke-direct {v0, p0, p2}, La/b360;-><init>(La/r260;La/yje;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    iget-object p0, v0, La/b360;->i:Ljava/lang/Object;

    .line 41
    .line 42
    sget-object p2, La/wne;->a:La/wne;

    .line 43
    .line 44
    iget v6, v0, La/b360;->j:I

    .line 45
    .line 46
    if-eqz v6, :cond_2

    .line 47
    .line 48
    if-ne v6, v7, :cond_1

    .line 49
    .line 50
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_3

    .line 54
    .line 55
    :cond_1
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    goto :goto_4

    .line 59
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    check-cast p1, Ljava/util/List;

    .line 63
    .line 64
    new-instance p0, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-eqz v4, :cond_5

    .line 78
    .line 79
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    move-object v5, v4

    .line 84
    check-cast v5, La/oxy;

    .line 85
    .line 86
    instance-of v6, v5, La/lxy;

    .line 87
    .line 88
    if-eqz v6, :cond_4

    .line 89
    .line 90
    check-cast v5, La/lxy;

    .line 91
    .line 92
    iget-object v5, v5, La/lxy;->b:La/nxy;

    .line 93
    .line 94
    iget-boolean v5, v5, La/nxy;->f:Z

    .line 95
    .line 96
    if-eqz v5, :cond_3

    .line 97
    .line 98
    :cond_4
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_5
    new-instance p1, Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-static {p0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_7

    .line 120
    .line 121
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    check-cast v2, La/oxy;

    .line 126
    .line 127
    iget-object v4, v1, La/v360;->J:La/n4u;

    .line 128
    .line 129
    invoke-virtual {v4}, La/n4u;->f()Z

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    if-eqz v4, :cond_6

    .line 134
    .line 135
    instance-of v4, v2, La/lxy;

    .line 136
    .line 137
    if-eqz v4, :cond_6

    .line 138
    .line 139
    check-cast v2, La/lxy;

    .line 140
    .line 141
    iget-object v4, v2, La/lxy;->b:La/nxy;

    .line 142
    .line 143
    invoke-static {v4}, La/nxy;->a(La/nxy;)La/nxy;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-static {v2, v4}, La/lxy;->b(La/lxy;La/nxy;)La/lxy;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    :cond_6
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_7
    iput v7, v0, La/b360;->j:I

    .line 156
    .line 157
    invoke-interface {v3, p1, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    if-ne p0, p2, :cond_8

    .line 162
    .line 163
    move-object v4, p2

    .line 164
    goto :goto_4

    .line 165
    :cond_8
    :goto_3
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 166
    .line 167
    :goto_4
    return-object v4

    .line 168
    :pswitch_0
    instance-of v0, p2, La/q260;

    .line 169
    .line 170
    if-eqz v0, :cond_9

    .line 171
    .line 172
    move-object v0, p2

    .line 173
    check-cast v0, La/q260;

    .line 174
    .line 175
    iget v8, v0, La/q260;->j:I

    .line 176
    .line 177
    and-int v9, v8, v6

    .line 178
    .line 179
    if-eqz v9, :cond_9

    .line 180
    .line 181
    sub-int/2addr v8, v6

    .line 182
    iput v8, v0, La/q260;->j:I

    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_9
    new-instance v0, La/q260;

    .line 186
    .line 187
    invoke-direct {v0, p0, p2}, La/q260;-><init>(La/r260;La/yje;)V

    .line 188
    .line 189
    .line 190
    :goto_5
    iget-object p0, v0, La/q260;->i:Ljava/lang/Object;

    .line 191
    .line 192
    sget-object p2, La/wne;->a:La/wne;

    .line 193
    .line 194
    iget v6, v0, La/q260;->j:I

    .line 195
    .line 196
    if-eqz v6, :cond_b

    .line 197
    .line 198
    if-ne v6, v7, :cond_a

    .line 199
    .line 200
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    goto :goto_7

    .line 204
    :cond_a
    invoke-static {v5}, La/jf4;->n(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    goto :goto_8

    .line 208
    :cond_b
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    check-cast p1, Lkotlin/Pair;

    .line 212
    .line 213
    iget-object p0, p1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast p0, Ljava/util/List;

    .line 216
    .line 217
    iget-object p1, p1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast p1, Ljava/util/List;

    .line 220
    .line 221
    iget-object v4, v1, La/v360;->p0:La/nn60;

    .line 222
    .line 223
    new-instance v5, Ljava/util/ArrayList;

    .line 224
    .line 225
    invoke-static {p0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 230
    .line 231
    .line 232
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    :goto_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 237
    .line 238
    .line 239
    move-result v2

    .line 240
    if-eqz v2, :cond_c

    .line 241
    .line 242
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    check-cast v2, La/i8p;

    .line 247
    .line 248
    iget-wide v8, v2, La/i8p;->a:J

    .line 249
    .line 250
    invoke-static {v8, v9, v5}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 251
    .line 252
    .line 253
    goto :goto_6

    .line 254
    :cond_c
    new-instance p0, La/xm60;

    .line 255
    .line 256
    invoke-direct {p0, v5}, La/xm60;-><init>(Ljava/util/ArrayList;)V

    .line 257
    .line 258
    .line 259
    new-array v2, v7, [La/en60;

    .line 260
    .line 261
    const/4 v5, 0x0

    .line 262
    aput-object p0, v2, v5

    .line 263
    .line 264
    invoke-static {v1, v4, v2}, La/i3t0;->B(La/i3t0;La/j3t0;[Ljava/lang/Object;)La/bby;

    .line 265
    .line 266
    .line 267
    iput v7, v0, La/q260;->j:I

    .line 268
    .line 269
    invoke-interface {v3, p1, v0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object p0

    .line 273
    if-ne p0, p2, :cond_d

    .line 274
    .line 275
    move-object v4, p2

    .line 276
    goto :goto_8

    .line 277
    :cond_d
    :goto_7
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 278
    .line 279
    :goto_8
    return-object v4

    .line 280
    nop

    .line 281
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
