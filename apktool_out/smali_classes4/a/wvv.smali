.class public final synthetic La/wvv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/wvv;->a:B

    iput-object p1, p0, La/wvv;->b:Ljava/util/List;

    iput-object p2, p0, La/wvv;->c:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/wvv;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/wvv;->c:Ljava/util/List;

    .line 5
    .line 6
    iget-object p0, p0, La/wvv;->b:Ljava/util/List;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, La/ou90;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    move v3, v1

    .line 20
    :goto_0
    if-ge v3, v0, :cond_0

    .line 21
    .line 22
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    check-cast v4, Lkotlin/Pair;

    .line 27
    .line 28
    iget-object v5, v4, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v5, La/pu90;

    .line 31
    .line 32
    iget-object v4, v4, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v4, La/ikx;

    .line 35
    .line 36
    iget-wide v6, v4, La/ikx;->a:J

    .line 37
    .line 38
    invoke-static {p1, v5, v6, v7}, La/ou90;->j(La/ou90;La/pu90;J)V

    .line 39
    .line 40
    .line 41
    add-int/lit8 v3, v3, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    if-eqz v2, :cond_2

    .line 45
    .line 46
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    :goto_1
    if-ge v1, p0, :cond_2

    .line 51
    .line 52
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, Lkotlin/Pair;

    .line 57
    .line 58
    iget-object v3, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v3, La/pu90;

    .line 61
    .line 62
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 65
    .line 66
    if-eqz v0, :cond_1

    .line 67
    .line 68
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, La/ikx;

    .line 73
    .line 74
    iget-wide v4, v0, La/ikx;->a:J

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_1
    const-wide/16 v4, 0x0

    .line 78
    .line 79
    :goto_2
    invoke-static {p1, v3, v4, v5}, La/ou90;->j(La/ou90;La/pu90;J)V

    .line 80
    .line 81
    .line 82
    add-int/lit8 v1, v1, 0x1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    return-object p0

    .line 88
    :pswitch_0
    check-cast p1, Ljava/lang/Long;

    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 91
    .line 92
    .line 93
    move-result-wide v3

    .line 94
    sget-object p1, La/x510;->b:La/x510;

    .line 95
    .line 96
    const-wide/16 v5, 0x1

    .line 97
    .line 98
    cmp-long p1, v3, v5

    .line 99
    .line 100
    const/4 v0, 0x1

    .line 101
    if-nez p1, :cond_7

    .line 102
    .line 103
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-nez p1, :cond_d

    .line 108
    .line 109
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    if-nez p1, :cond_d

    .line 114
    .line 115
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    const/4 v3, -0x1

    .line 120
    if-eqz p1, :cond_3

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :cond_3
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    if-eqz p1, :cond_4

    .line 132
    .line 133
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    check-cast p1, La/r010;

    .line 138
    .line 139
    iget-object v4, p1, La/r010;->j:La/q010;

    .line 140
    .line 141
    iget v5, v4, La/q010;->b:I

    .line 142
    .line 143
    if-eq v5, v3, :cond_d

    .line 144
    .line 145
    iget v5, v4, La/q010;->a:I

    .line 146
    .line 147
    if-eq v5, v3, :cond_d

    .line 148
    .line 149
    iget v5, v4, La/q010;->c:I

    .line 150
    .line 151
    if-eq v5, v3, :cond_d

    .line 152
    .line 153
    iget v4, v4, La/q010;->d:I

    .line 154
    .line 155
    if-eq v4, v3, :cond_d

    .line 156
    .line 157
    iget p1, p1, La/r010;->b:I

    .line 158
    .line 159
    if-eq p1, v3, :cond_d

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_4
    :goto_4
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 163
    .line 164
    .line 165
    move-result p0

    .line 166
    if-eqz p0, :cond_5

    .line 167
    .line 168
    goto :goto_6

    .line 169
    :cond_5
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    if-eqz p1, :cond_6

    .line 178
    .line 179
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    check-cast p1, La/r010;

    .line 184
    .line 185
    iget-object v2, p1, La/r010;->j:La/q010;

    .line 186
    .line 187
    iget v4, v2, La/q010;->b:I

    .line 188
    .line 189
    if-eq v4, v3, :cond_d

    .line 190
    .line 191
    iget v4, v2, La/q010;->a:I

    .line 192
    .line 193
    if-eq v4, v3, :cond_d

    .line 194
    .line 195
    iget v4, v2, La/q010;->c:I

    .line 196
    .line 197
    if-eq v4, v3, :cond_d

    .line 198
    .line 199
    iget v2, v2, La/q010;->d:I

    .line 200
    .line 201
    if-eq v2, v3, :cond_d

    .line 202
    .line 203
    iget p1, p1, La/r010;->b:I

    .line 204
    .line 205
    if-eq p1, v3, :cond_d

    .line 206
    .line 207
    goto :goto_5

    .line 208
    :cond_6
    :goto_6
    move v1, v0

    .line 209
    goto :goto_8

    .line 210
    :cond_7
    const-wide/16 v5, 0x2

    .line 211
    .line 212
    cmp-long p1, v3, v5

    .line 213
    .line 214
    if-nez p1, :cond_d

    .line 215
    .line 216
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 217
    .line 218
    .line 219
    move-result p1

    .line 220
    if-nez p1, :cond_d

    .line 221
    .line 222
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 223
    .line 224
    .line 225
    move-result p1

    .line 226
    if-nez p1, :cond_d

    .line 227
    .line 228
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 229
    .line 230
    .line 231
    move-result p1

    .line 232
    if-eqz p1, :cond_8

    .line 233
    .line 234
    goto :goto_7

    .line 235
    :cond_8
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    :cond_9
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 240
    .line 241
    .line 242
    move-result p1

    .line 243
    if-eqz p1, :cond_a

    .line 244
    .line 245
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object p1

    .line 249
    check-cast p1, La/r010;

    .line 250
    .line 251
    iget-object p1, p1, La/r010;->i:Ljava/util/List;

    .line 252
    .line 253
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 254
    .line 255
    .line 256
    move-result p1

    .line 257
    if-eqz p1, :cond_9

    .line 258
    .line 259
    goto :goto_8

    .line 260
    :cond_a
    :goto_7
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 261
    .line 262
    .line 263
    move-result p0

    .line 264
    if-eqz p0, :cond_b

    .line 265
    .line 266
    goto :goto_6

    .line 267
    :cond_b
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 268
    .line 269
    .line 270
    move-result-object p0

    .line 271
    :cond_c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 272
    .line 273
    .line 274
    move-result p1

    .line 275
    if-eqz p1, :cond_6

    .line 276
    .line 277
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    check-cast p1, La/r010;

    .line 282
    .line 283
    iget-object p1, p1, La/r010;->i:Ljava/util/List;

    .line 284
    .line 285
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 286
    .line 287
    .line 288
    move-result p1

    .line 289
    if-eqz p1, :cond_c

    .line 290
    .line 291
    :cond_d
    :goto_8
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 292
    .line 293
    .line 294
    move-result-object p0

    .line 295
    return-object p0

    .line 296
    nop

    .line 297
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
