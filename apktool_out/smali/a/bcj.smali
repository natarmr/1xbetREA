.class public final La/bcj;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public i:Ljava/lang/Object;

.field public j:Ljava/io/Serializable;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;

.field public m:Ljava/util/Iterator;

.field public n:I

.field public o:B

.field public final synthetic p:La/ncj;

.field public final synthetic q:La/pmi;


# direct methods
.method public constructor <init>(La/ncj;La/pmi;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/bcj;->p:La/ncj;

    .line 2
    .line 3
    iput-object p2, p0, La/bcj;->q:La/pmi;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 2

    .line 1
    new-instance v0, La/bcj;

    .line 2
    .line 3
    iget-object v1, p0, La/bcj;->p:La/ncj;

    .line 4
    .line 5
    iget-object p0, p0, La/bcj;->q:La/pmi;

    .line 6
    .line 7
    invoke-direct {v0, v1, p0, p1}, La/bcj;-><init>(La/ncj;La/pmi;La/yje;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/yje;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/bcj;->create(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/bcj;

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/bcj;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-byte v1, p0, La/bcj;->o:B

    .line 4
    .line 5
    iget-object v2, p0, La/bcj;->q:La/pmi;

    .line 6
    .line 7
    const/4 v3, 0x4

    .line 8
    const/4 v4, 0x3

    .line 9
    const/4 v5, 0x2

    .line 10
    iget-object v6, p0, La/bcj;->p:La/ncj;

    .line 11
    .line 12
    const/4 v7, 0x1

    .line 13
    const/4 v8, 0x0

    .line 14
    if-eqz v1, :cond_4

    .line 15
    .line 16
    if-eq v1, v7, :cond_3

    .line 17
    .line 18
    if-eq v1, v5, :cond_2

    .line 19
    .line 20
    if-eq v1, v4, :cond_1

    .line 21
    .line 22
    if-ne v1, v3, :cond_0

    .line 23
    .line 24
    iget v0, p0, La/bcj;->n:I

    .line 25
    .line 26
    iget-object p0, p0, La/bcj;->i:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    goto/16 :goto_6

    .line 32
    .line 33
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 34
    .line 35
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object v8

    .line 39
    :cond_1
    iget-object v1, p0, La/bcj;->k:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, La/i050;

    .line 42
    .line 43
    iget-object v2, p0, La/bcj;->j:Ljava/io/Serializable;

    .line 44
    .line 45
    check-cast v2, La/mie0;

    .line 46
    .line 47
    iget-object v4, p0, La/bcj;->i:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v4, La/hie0;

    .line 50
    .line 51
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_3

    .line 55
    .line 56
    :cond_2
    iget-object v1, p0, La/bcj;->m:Ljava/util/Iterator;

    .line 57
    .line 58
    iget-object v9, p0, La/bcj;->l:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v9, La/acj;

    .line 61
    .line 62
    iget-object v10, p0, La/bcj;->k:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v10, La/mie0;

    .line 65
    .line 66
    iget-object v11, p0, La/bcj;->j:Ljava/io/Serializable;

    .line 67
    .line 68
    check-cast v11, La/hie0;

    .line 69
    .line 70
    iget-object v12, p0, La/bcj;->i:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v12, La/i050;

    .line 73
    .line 74
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    iget-object v1, p0, La/bcj;->l:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v1, La/mie0;

    .line 81
    .line 82
    iget-object v9, p0, La/bcj;->k:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v9, La/mie0;

    .line 85
    .line 86
    iget-object v10, p0, La/bcj;->j:Ljava/io/Serializable;

    .line 87
    .line 88
    check-cast v10, La/hie0;

    .line 89
    .line 90
    iget-object v11, p0, La/bcj;->i:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v11, La/i050;

    .line 93
    .line 94
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_4
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    new-instance v11, La/k050;

    .line 102
    .line 103
    invoke-direct {v11}, La/k050;-><init>()V

    .line 104
    .line 105
    .line 106
    new-instance v10, La/hie0;

    .line 107
    .line 108
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 109
    .line 110
    .line 111
    new-instance v1, La/mie0;

    .line 112
    .line 113
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 114
    .line 115
    .line 116
    iput-object v11, p0, La/bcj;->i:Ljava/lang/Object;

    .line 117
    .line 118
    iput-object v10, p0, La/bcj;->j:Ljava/io/Serializable;

    .line 119
    .line 120
    iput-object v1, p0, La/bcj;->k:Ljava/lang/Object;

    .line 121
    .line 122
    iput-object v1, p0, La/bcj;->l:Ljava/lang/Object;

    .line 123
    .line 124
    iput-byte v7, p0, La/bcj;->o:B

    .line 125
    .line 126
    invoke-virtual {v6, v7, p0}, La/ncj;->h(ZLa/zje;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    if-ne p1, v0, :cond_5

    .line 131
    .line 132
    goto/16 :goto_5

    .line 133
    .line 134
    :cond_5
    move-object v9, v1

    .line 135
    :goto_0
    check-cast p1, La/naj;

    .line 136
    .line 137
    iget-object p1, p1, La/naj;->b:Ljava/lang/Object;

    .line 138
    .line 139
    iput-object p1, v1, La/mie0;->a:Ljava/lang/Object;

    .line 140
    .line 141
    new-instance p1, La/acj;

    .line 142
    .line 143
    invoke-direct {p1, v11, v10, v9, v6}, La/acj;-><init>(La/i050;La/hie0;La/mie0;La/ncj;)V

    .line 144
    .line 145
    .line 146
    iget-object v1, v2, La/pmi;->d:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v1, Ljava/util/List;

    .line 149
    .line 150
    if-eqz v1, :cond_8

    .line 151
    .line 152
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    move-object v12, v11

    .line 157
    move-object v11, v10

    .line 158
    move-object v10, v9

    .line 159
    move-object v9, p1

    .line 160
    :cond_6
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    if-eqz p1, :cond_7

    .line 165
    .line 166
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    check-cast p1, Lkotlin/jvm/functions/Function2;

    .line 171
    .line 172
    iput-object v12, p0, La/bcj;->i:Ljava/lang/Object;

    .line 173
    .line 174
    iput-object v11, p0, La/bcj;->j:Ljava/io/Serializable;

    .line 175
    .line 176
    iput-object v10, p0, La/bcj;->k:Ljava/lang/Object;

    .line 177
    .line 178
    iput-object v9, p0, La/bcj;->l:Ljava/lang/Object;

    .line 179
    .line 180
    iput-object v1, p0, La/bcj;->m:Ljava/util/Iterator;

    .line 181
    .line 182
    iput-byte v5, p0, La/bcj;->o:B

    .line 183
    .line 184
    invoke-interface {p1, v9, p0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    if-ne p1, v0, :cond_6

    .line 189
    .line 190
    goto :goto_5

    .line 191
    :cond_7
    move-object v9, v10

    .line 192
    move-object v10, v11

    .line 193
    move-object v1, v12

    .line 194
    goto :goto_2

    .line 195
    :cond_8
    move-object v1, v11

    .line 196
    :goto_2
    iput-object v8, v2, La/pmi;->d:Ljava/lang/Object;

    .line 197
    .line 198
    iput-object v10, p0, La/bcj;->i:Ljava/lang/Object;

    .line 199
    .line 200
    iput-object v9, p0, La/bcj;->j:Ljava/io/Serializable;

    .line 201
    .line 202
    iput-object v1, p0, La/bcj;->k:Ljava/lang/Object;

    .line 203
    .line 204
    iput-object v8, p0, La/bcj;->l:Ljava/lang/Object;

    .line 205
    .line 206
    iput-object v8, p0, La/bcj;->m:Ljava/util/Iterator;

    .line 207
    .line 208
    iput-byte v4, p0, La/bcj;->o:B

    .line 209
    .line 210
    invoke-interface {v1, p0}, La/i050;->d(La/yje;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    if-ne p1, v0, :cond_9

    .line 215
    .line 216
    goto :goto_5

    .line 217
    :cond_9
    move-object v2, v9

    .line 218
    move-object v4, v10

    .line 219
    :goto_3
    :try_start_0
    iput-boolean v7, v4, La/hie0;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 220
    .line 221
    invoke-interface {v1, v8}, La/i050;->c(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    iget-object p1, v2, La/mie0;->a:Ljava/lang/Object;

    .line 225
    .line 226
    if-eqz p1, :cond_a

    .line 227
    .line 228
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 229
    .line 230
    .line 231
    move-result v1

    .line 232
    goto :goto_4

    .line 233
    :cond_a
    const/4 v1, 0x0

    .line 234
    :goto_4
    invoke-virtual {v6}, La/ncj;->c()La/mlx;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    iput-object p1, p0, La/bcj;->i:Ljava/lang/Object;

    .line 239
    .line 240
    iput-object v8, p0, La/bcj;->j:Ljava/io/Serializable;

    .line 241
    .line 242
    iput-object v8, p0, La/bcj;->k:Ljava/lang/Object;

    .line 243
    .line 244
    iput v1, p0, La/bcj;->n:I

    .line 245
    .line 246
    iput-byte v3, p0, La/bcj;->o:B

    .line 247
    .line 248
    invoke-interface {v2, p0}, La/mlx;->a(La/zje;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    if-ne p0, v0, :cond_b

    .line 253
    .line 254
    :goto_5
    return-object v0

    .line 255
    :cond_b
    move-object v0, p1

    .line 256
    move-object p1, p0

    .line 257
    move-object p0, v0

    .line 258
    move v0, v1

    .line 259
    :goto_6
    check-cast p1, Ljava/lang/Number;

    .line 260
    .line 261
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 262
    .line 263
    .line 264
    move-result p1

    .line 265
    new-instance v1, La/naj;

    .line 266
    .line 267
    invoke-direct {v1, v0, p1, p0}, La/naj;-><init>(IILjava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    return-object v1

    .line 271
    :catchall_0
    move-exception p0

    .line 272
    invoke-interface {v1, v8}, La/i050;->c(Ljava/lang/Object;)V

    .line 273
    .line 274
    .line 275
    throw p0
.end method
