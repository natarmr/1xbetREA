.class public final La/j370;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public i:Z

.field public j:Z

.field public k:B

.field public final synthetic l:La/k370;


# direct methods
.method public constructor <init>(La/k370;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/j370;->l:La/k370;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 1

    .line 1
    new-instance v0, La/j370;

    .line 2
    .line 3
    iget-object p0, p0, La/j370;->l:La/k370;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, La/j370;-><init>(La/k370;La/yje;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/yje;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/j370;->create(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/j370;

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/j370;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, La/j370;->l:La/k370;

    .line 2
    .line 3
    iget-object v1, v0, La/k370;->j:La/jqc;

    .line 4
    .line 5
    sget-object v2, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-byte v3, p0, La/j370;->k:B

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x5

    .line 11
    const/4 v6, 0x4

    .line 12
    const/4 v7, 0x3

    .line 13
    const/4 v8, 0x2

    .line 14
    const/4 v9, 0x1

    .line 15
    if-eqz v3, :cond_5

    .line 16
    .line 17
    if-eq v3, v9, :cond_4

    .line 18
    .line 19
    if-eq v3, v8, :cond_3

    .line 20
    .line 21
    if-eq v3, v7, :cond_2

    .line 22
    .line 23
    if-eq v3, v6, :cond_1

    .line 24
    .line 25
    if-ne v3, v5, :cond_0

    .line 26
    .line 27
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_6

    .line 31
    .line 32
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 33
    .line 34
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-object v4

    .line 38
    :cond_1
    iget-boolean v1, p0, La/j370;->j:Z

    .line 39
    .line 40
    iget-boolean v3, p0, La/j370;->i:Z

    .line 41
    .line 42
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_4

    .line 46
    .line 47
    :cond_2
    iget-boolean v3, p0, La/j370;->j:Z

    .line 48
    .line 49
    iget-boolean v4, p0, La/j370;->i:Z

    .line 50
    .line 51
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_3

    .line 55
    .line 56
    :cond_3
    iget-boolean v3, p0, La/j370;->j:Z

    .line 57
    .line 58
    iget-boolean v4, p0, La/j370;->i:Z

    .line 59
    .line 60
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_4
    iget-boolean v3, p0, La/j370;->i:Z

    .line 65
    .line 66
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_5
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, La/k370;->H()V

    .line 74
    .line 75
    .line 76
    iget-object p1, v0, La/k370;->e:La/wtt;

    .line 77
    .line 78
    invoke-virtual {p1}, La/wtt;->a()Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    iput-boolean v3, p0, La/j370;->i:Z

    .line 83
    .line 84
    iput-byte v9, p0, La/j370;->k:B

    .line 85
    .line 86
    invoke-virtual {v1, p0}, La/jqc;->a(La/zje;)Ljava/io/Serializable;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-ne p1, v2, :cond_6

    .line 91
    .line 92
    goto/16 :goto_5

    .line 93
    .line 94
    :cond_6
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-eqz v3, :cond_9

    .line 101
    .line 102
    if-nez p1, :cond_9

    .line 103
    .line 104
    iget-object v10, v0, La/k370;->p:La/p7m0;

    .line 105
    .line 106
    :cond_7
    invoke-virtual {v10}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    move-object p1, p0

    .line 111
    check-cast p1, La/b370;

    .line 112
    .line 113
    if-nez p1, :cond_8

    .line 114
    .line 115
    new-instance p1, La/b370;

    .line 116
    .line 117
    sget-object v0, La/kat;->a:La/kat;

    .line 118
    .line 119
    invoke-direct {p1, v0, v0}, La/b370;-><init>(La/pat;La/pat;)V

    .line 120
    .line 121
    .line 122
    :cond_8
    sget-object v0, La/lat;->a:La/lat;

    .line 123
    .line 124
    invoke-static {p1, v4, v0, v9}, La/b370;->b(La/b370;La/pat;La/pat;I)La/b370;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-virtual {v10, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    if-eqz p0, :cond_7

    .line 133
    .line 134
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 135
    .line 136
    return-object p0

    .line 137
    :cond_9
    iget-object v4, v0, La/k370;->m:La/nvu;

    .line 138
    .line 139
    iput-boolean v3, p0, La/j370;->i:Z

    .line 140
    .line 141
    iput-boolean p1, p0, La/j370;->j:Z

    .line 142
    .line 143
    iput-byte v8, p0, La/j370;->k:B

    .line 144
    .line 145
    invoke-virtual {v4, p0}, La/nvu;->K(La/zje;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    if-ne v4, v2, :cond_a

    .line 150
    .line 151
    goto :goto_5

    .line 152
    :cond_a
    move v11, v3

    .line 153
    move v3, p1

    .line 154
    move-object p1, v4

    .line 155
    move v4, v11

    .line 156
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 157
    .line 158
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    if-eqz p1, :cond_c

    .line 163
    .line 164
    iget-object p1, v0, La/k370;->b:La/cyu;

    .line 165
    .line 166
    iput-boolean v4, p0, La/j370;->i:Z

    .line 167
    .line 168
    iput-boolean v3, p0, La/j370;->j:Z

    .line 169
    .line 170
    iput-byte v7, p0, La/j370;->k:B

    .line 171
    .line 172
    iget-object v8, p1, La/cyu;->a:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v8, La/dhu;

    .line 175
    .line 176
    iget-object v9, p1, La/cyu;->b:Ljava/lang/Object;

    .line 177
    .line 178
    check-cast v9, La/ntu;

    .line 179
    .line 180
    invoke-virtual {v9}, La/ntu;->a()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v9

    .line 184
    iget-object p1, p1, La/cyu;->c:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast p1, La/k9c;

    .line 187
    .line 188
    invoke-virtual {p1}, La/k9c;->a()Z

    .line 189
    .line 190
    .line 191
    move-result p1

    .line 192
    invoke-virtual {v8, p0, v9, p1}, La/dhu;->a(La/zje;Ljava/lang/String;Z)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    if-ne p1, v2, :cond_b

    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_b
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 200
    .line 201
    :goto_2
    if-ne p1, v2, :cond_c

    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_c
    :goto_3
    iput-boolean v4, p0, La/j370;->i:Z

    .line 205
    .line 206
    iput-boolean v3, p0, La/j370;->j:Z

    .line 207
    .line 208
    iput-byte v6, p0, La/j370;->k:B

    .line 209
    .line 210
    invoke-virtual {v1, p0}, La/jqc;->a(La/zje;)Ljava/io/Serializable;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    if-ne p1, v2, :cond_d

    .line 215
    .line 216
    goto :goto_5

    .line 217
    :cond_d
    move v1, v3

    .line 218
    move v3, v4

    .line 219
    :goto_4
    check-cast p1, Ljava/lang/Boolean;

    .line 220
    .line 221
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 222
    .line 223
    .line 224
    move-result p1

    .line 225
    if-eqz p1, :cond_f

    .line 226
    .line 227
    iget-object p1, v0, La/k370;->k:La/lbu;

    .line 228
    .line 229
    iput-boolean v3, p0, La/j370;->i:Z

    .line 230
    .line 231
    iput-boolean v1, p0, La/j370;->j:Z

    .line 232
    .line 233
    iput-byte v5, p0, La/j370;->k:B

    .line 234
    .line 235
    const/4 v1, 0x0

    .line 236
    invoke-static {p1, v1, p0, v7}, La/lbu;->k(La/lbu;ILa/yje;I)Ljava/io/Serializable;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    if-ne p1, v2, :cond_e

    .line 241
    .line 242
    :goto_5
    return-object v2

    .line 243
    :cond_e
    :goto_6
    check-cast p1, Ljava/util/List;

    .line 244
    .line 245
    goto :goto_7

    .line 246
    :cond_f
    sget-object p1, La/iun;->a:La/iun;

    .line 247
    .line 248
    :goto_7
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 249
    .line 250
    .line 251
    move-result p0

    .line 252
    if-nez p0, :cond_13

    .line 253
    .line 254
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 255
    .line 256
    .line 257
    move-result p0

    .line 258
    if-eqz p0, :cond_10

    .line 259
    .line 260
    goto :goto_8

    .line 261
    :cond_10
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 262
    .line 263
    .line 264
    move-result-object p0

    .line 265
    :cond_11
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 266
    .line 267
    .line 268
    move-result p1

    .line 269
    if-eqz p1, :cond_12

    .line 270
    .line 271
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    check-cast p1, La/pbv;

    .line 276
    .line 277
    iget-boolean p1, p1, La/pbv;->p:Z

    .line 278
    .line 279
    if-nez p1, :cond_11

    .line 280
    .line 281
    goto :goto_9

    .line 282
    :cond_12
    :goto_8
    invoke-virtual {v0}, La/k370;->J()V

    .line 283
    .line 284
    .line 285
    goto :goto_a

    .line 286
    :cond_13
    :goto_9
    invoke-virtual {v0}, La/k370;->I()V

    .line 287
    .line 288
    .line 289
    :goto_a
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 290
    .line 291
    return-object p0
.end method
