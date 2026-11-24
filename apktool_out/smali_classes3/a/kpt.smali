.class public final La/kpt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/uqe;


# direct methods
.method public synthetic constructor <init>(La/uqe;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/kpt;->a:La/uqe;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(IILa/zje;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p3, La/cyt;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/cyt;

    .line 7
    .line 8
    iget v1, v0, La/cyt;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/cyt;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/cyt;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/cyt;-><init>(La/kpt;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/cyt;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/cyt;->l:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget p2, v0, La/cyt;->i:I

    .line 37
    .line 38
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iput p2, v0, La/cyt;->i:I

    .line 53
    .line 54
    iput v3, v0, La/cyt;->l:I

    .line 55
    .line 56
    iget-object p0, p0, La/kpt;->a:La/uqe;

    .line 57
    .line 58
    invoke-virtual {p0, p1, v0}, La/uqe;->c(ILa/zje;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p3

    .line 62
    if-ne p3, v1, :cond_3

    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_3
    :goto_1
    check-cast p3, Ljava/lang/Iterable;

    .line 66
    .line 67
    new-instance p0, Ljava/util/ArrayList;

    .line 68
    .line 69
    const/16 p1, 0xa

    .line 70
    .line 71
    invoke-static {p3, p1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 76
    .line 77
    .line 78
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object p3

    .line 82
    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, La/glt;

    .line 93
    .line 94
    sget-object v1, La/uue0;->c:La/uue0;

    .line 95
    .line 96
    invoke-static {v0, v1, p2}, La/x1x;->T(La/glt;La/uue0;I)La/rue0;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_4
    new-instance p2, Ljava/util/ArrayList;

    .line 105
    .line 106
    invoke-static {p0, p1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    if-eqz p1, :cond_6

    .line 122
    .line 123
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    check-cast p1, La/rue0;

    .line 128
    .line 129
    iget-boolean p3, p1, La/rue0;->c:Z

    .line 130
    .line 131
    if-eqz p3, :cond_5

    .line 132
    .line 133
    invoke-static {p1}, La/rue0;->a(La/rue0;)La/rue0;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    :cond_5
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_6
    new-instance p0, Ljava/util/ArrayList;

    .line 142
    .line 143
    invoke-direct {p0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    if-le p1, v3, :cond_7

    .line 151
    .line 152
    new-instance p1, La/vvt;

    .line 153
    .line 154
    const/4 p2, 0x4

    .line 155
    invoke-direct {p1, p2}, La/vvt;-><init>(B)V

    .line 156
    .line 157
    .line 158
    invoke-static {p1, p0}, La/v3d;->t(Ljava/util/Comparator;Ljava/util/List;)V

    .line 159
    .line 160
    .line 161
    :cond_7
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    if-le p1, v3, :cond_8

    .line 166
    .line 167
    new-instance p1, La/vvt;

    .line 168
    .line 169
    const/4 p2, 0x5

    .line 170
    invoke-direct {p1, p2}, La/vvt;-><init>(B)V

    .line 171
    .line 172
    .line 173
    invoke-static {p1, p0}, La/v3d;->t(Ljava/util/Comparator;Ljava/util/List;)V

    .line 174
    .line 175
    .line 176
    :cond_8
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    if-eqz p1, :cond_9

    .line 181
    .line 182
    goto/16 :goto_8

    .line 183
    .line 184
    :cond_9
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    :cond_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result p2

    .line 192
    if-eqz p2, :cond_11

    .line 193
    .line 194
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p2

    .line 198
    check-cast p2, La/rue0;

    .line 199
    .line 200
    iget-boolean p2, p2, La/rue0;->e:Z

    .line 201
    .line 202
    if-eqz p2, :cond_a

    .line 203
    .line 204
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    const/4 p2, 0x0

    .line 209
    move p3, p2

    .line 210
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    const/4 v1, -0x1

    .line 215
    if-eqz v0, :cond_c

    .line 216
    .line 217
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    check-cast v0, La/rue0;

    .line 222
    .line 223
    iget-boolean v0, v0, La/rue0;->e:Z

    .line 224
    .line 225
    if-eqz v0, :cond_b

    .line 226
    .line 227
    goto :goto_5

    .line 228
    :cond_b
    add-int/lit8 p3, p3, 0x1

    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_c
    move p3, v1

    .line 232
    :goto_5
    if-eq p3, v1, :cond_d

    .line 233
    .line 234
    new-instance v2, La/rue0;

    .line 235
    .line 236
    const/4 v8, 0x1

    .line 237
    const/16 v9, 0xcf

    .line 238
    .line 239
    const-wide/16 v3, 0x0

    .line 240
    .line 241
    const/4 v5, 0x0

    .line 242
    const/4 v6, 0x0

    .line 243
    const/4 v7, 0x0

    .line 244
    invoke-direct/range {v2 .. v9}, La/rue0;-><init>(JLjava/lang/String;ZLa/uue0;ZI)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {p0, p3, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    :cond_d
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 255
    .line 256
    .line 257
    move-result p3

    .line 258
    if-eqz p3, :cond_f

    .line 259
    .line 260
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object p3

    .line 264
    check-cast p3, La/rue0;

    .line 265
    .line 266
    iget-boolean p3, p3, La/rue0;->e:Z

    .line 267
    .line 268
    if-nez p3, :cond_e

    .line 269
    .line 270
    goto :goto_7

    .line 271
    :cond_e
    add-int/lit8 p2, p2, 0x1

    .line 272
    .line 273
    goto :goto_6

    .line 274
    :cond_f
    move p2, v1

    .line 275
    :goto_7
    if-eq p2, v1, :cond_10

    .line 276
    .line 277
    new-instance v2, La/rue0;

    .line 278
    .line 279
    const/4 v8, 0x0

    .line 280
    const/16 v9, 0xcf

    .line 281
    .line 282
    const-wide/16 v3, 0x0

    .line 283
    .line 284
    const/4 v5, 0x0

    .line 285
    const/4 v6, 0x0

    .line 286
    const/4 v7, 0x0

    .line 287
    invoke-direct/range {v2 .. v9}, La/rue0;-><init>(JLjava/lang/String;ZLa/uue0;ZI)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {p0, p2, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    :cond_10
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 294
    .line 295
    .line 296
    move-result-object p0

    .line 297
    :cond_11
    :goto_8
    return-object p0
.end method
