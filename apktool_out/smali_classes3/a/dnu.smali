.class public final La/dnu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/j2u;

.field public final b:La/pmi;

.field public final c:La/epc;

.field public final d:La/kqc;

.field public final e:La/pru;


# direct methods
.method public constructor <init>(La/j2u;La/pmi;La/epc;La/kqc;La/pru;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/dnu;->a:La/j2u;

    .line 8
    .line 9
    iput-object p2, p0, La/dnu;->b:La/pmi;

    .line 10
    .line 11
    iput-object p3, p0, La/dnu;->c:La/epc;

    .line 12
    .line 13
    iput-object p4, p0, La/dnu;->d:La/kqc;

    .line 14
    .line 15
    iput-object p5, p0, La/dnu;->e:La/pru;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(La/zje;)Ljava/io/Serializable;
    .locals 10

    .line 1
    instance-of v0, p1, La/cnu;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/cnu;

    .line 7
    .line 8
    iget v1, v0, La/cnu;->m:I

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
    iput v1, v0, La/cnu;->m:I

    .line 18
    .line 19
    :goto_0
    move-object v7, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/cnu;

    .line 22
    .line 23
    invoke-direct {v0, p0, p1}, La/cnu;-><init>(La/dnu;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p1, v7, La/cnu;->k:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v7, La/cnu;->m:I

    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v3, 0x2

    .line 35
    const/4 v4, 0x1

    .line 36
    if-eqz v1, :cond_3

    .line 37
    .line 38
    if-eq v1, v4, :cond_2

    .line 39
    .line 40
    if-ne v1, v3, :cond_1

    .line 41
    .line 42
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto/16 :goto_4

    .line 46
    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v2

    .line 53
    :cond_2
    iget-object v1, v7, La/cnu;->j:Ljava/util/List;

    .line 54
    .line 55
    iget-object v4, v7, La/cnu;->i:La/j2u;

    .line 56
    .line 57
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    new-instance p1, Ljava/lang/Integer;

    .line 65
    .line 66
    const/16 v1, 0x72

    .line 67
    .line 68
    invoke-direct {p1, v1}, Ljava/lang/Integer;-><init>(I)V

    .line 69
    .line 70
    .line 71
    invoke-static {p1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    iget-object p1, p0, La/dnu;->a:La/j2u;

    .line 76
    .line 77
    iput-object p1, v7, La/cnu;->i:La/j2u;

    .line 78
    .line 79
    iput-object v1, v7, La/cnu;->j:Ljava/util/List;

    .line 80
    .line 81
    iput v4, v7, La/cnu;->m:I

    .line 82
    .line 83
    iget-object v4, p0, La/dnu;->b:La/pmi;

    .line 84
    .line 85
    invoke-virtual {v4, v7}, La/pmi;->x(La/yje;)Ljava/io/Serializable;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    if-ne v4, v0, :cond_4

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_4
    move-object v9, v4

    .line 93
    move-object v4, p1

    .line 94
    move-object p1, v9

    .line 95
    :goto_2
    check-cast p1, Ljava/lang/Number;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    iget-object v5, p0, La/dnu;->c:La/epc;

    .line 102
    .line 103
    invoke-virtual {v5}, La/epc;->a()La/hr4;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    iget-boolean v5, v5, La/hr4;->a:Z

    .line 108
    .line 109
    sget-object v6, La/sub0;->b:La/nh70;

    .line 110
    .line 111
    iget-object v8, p0, La/dnu;->d:La/kqc;

    .line 112
    .line 113
    invoke-virtual {v8}, La/kqc;->a()La/sub0;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-static {v8}, La/nh70;->j(La/sub0;)Z

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    iget-object p0, p0, La/dnu;->e:La/pru;

    .line 125
    .line 126
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    iget-object p0, p0, La/sff0;->d:La/q1w0;

    .line 131
    .line 132
    iget-boolean p0, p0, La/q1w0;->b:Z

    .line 133
    .line 134
    iput-object v2, v7, La/cnu;->i:La/j2u;

    .line 135
    .line 136
    iput-object v2, v7, La/cnu;->j:Ljava/util/List;

    .line 137
    .line 138
    iput v3, v7, La/cnu;->m:I

    .line 139
    .line 140
    move v3, p1

    .line 141
    move-object v2, v1

    .line 142
    move-object v1, v4

    .line 143
    move v4, v5

    .line 144
    move v5, v6

    .line 145
    move v6, p0

    .line 146
    invoke-virtual/range {v1 .. v7}, La/j2u;->a(Ljava/util/List;IZZZLa/zje;)Ljava/io/Serializable;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    if-ne p1, v0, :cond_5

    .line 151
    .line 152
    :goto_3
    return-object v0

    .line 153
    :cond_5
    :goto_4
    check-cast p1, Ljava/lang/Iterable;

    .line 154
    .line 155
    new-instance p0, Ljava/util/ArrayList;

    .line 156
    .line 157
    const/16 v0, 0xa

    .line 158
    .line 159
    invoke-static {p1, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 164
    .line 165
    .line 166
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-eqz v0, :cond_9

    .line 175
    .line 176
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    check-cast v0, La/uog;

    .line 181
    .line 182
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    iget-object v4, v0, La/uog;->l:Ljava/lang/String;

    .line 186
    .line 187
    iget-object v2, v0, La/uog;->b:Ljava/lang/String;

    .line 188
    .line 189
    iget-object v3, v0, La/uog;->c:Ljava/lang/String;

    .line 190
    .line 191
    iget-object v5, v0, La/uog;->d:Ljava/lang/String;

    .line 192
    .line 193
    iget-object v0, v0, La/uog;->j:Ljava/lang/String;

    .line 194
    .line 195
    const-string v1, "sid_"

    .line 196
    .line 197
    filled-new-array {v1}, [Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    const/4 v6, 0x0

    .line 202
    const/4 v7, 0x6

    .line 203
    invoke-static {v0, v1, v6, v7}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    check-cast v0, Ljava/lang/String;

    .line 212
    .line 213
    if-nez v0, :cond_6

    .line 214
    .line 215
    const-string v0, ""

    .line 216
    .line 217
    :cond_6
    const-string v1, "_"

    .line 218
    .line 219
    filled-new-array {v1}, [Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    invoke-static {v0, v1, v6, v7}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    new-instance v6, Ljava/util/ArrayList;

    .line 228
    .line 229
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 230
    .line 231
    .line 232
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    :cond_7
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 237
    .line 238
    .line 239
    move-result v1

    .line 240
    if-eqz v1, :cond_8

    .line 241
    .line 242
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    check-cast v1, Ljava/lang/String;

    .line 247
    .line 248
    invoke-static {v1}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    if-eqz v1, :cond_7

    .line 253
    .line 254
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    goto :goto_6

    .line 258
    :cond_8
    new-instance v1, Lorg/xplatform/banners/api/domain/models/PartnersTeamInfoBannerModel;

    .line 259
    .line 260
    invoke-direct/range {v1 .. v6}, Lorg/xplatform/banners/api/domain/models/PartnersTeamInfoBannerModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    goto :goto_5

    .line 267
    :cond_9
    return-object p0
.end method
