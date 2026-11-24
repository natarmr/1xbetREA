.class public final La/hd10;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/btt0;

.field public final b:La/knf0;

.field public final c:La/vby;

.field public final d:La/tpv;


# direct methods
.method public constructor <init>(La/btt0;La/knf0;La/vby;La/gii0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/hd10;->a:La/btt0;

    .line 17
    .line 18
    iput-object p2, p0, La/hd10;->b:La/knf0;

    .line 19
    .line 20
    iput-object p3, p0, La/hd10;->c:La/vby;

    .line 21
    .line 22
    new-instance p1, La/tpv;

    .line 23
    .line 24
    const/16 p2, 0x10

    .line 25
    .line 26
    invoke-direct {p1, p4, p2}, La/tpv;-><init>(La/gii0;B)V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, La/hd10;->d:La/tpv;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final a(JLjava/lang/String;Ljava/lang/String;La/lu0;La/zje;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p4

    .line 4
    .line 5
    move-object/from16 v2, p6

    .line 6
    .line 7
    instance-of v3, v2, La/gd10;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, La/gd10;

    .line 13
    .line 14
    iget v4, v3, La/gd10;->k:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, La/gd10;->k:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, La/gd10;

    .line 27
    .line 28
    invoke-direct {v3, v1, v2}, La/gd10;-><init>(La/hd10;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, La/gd10;->i:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v5, v3, La/gd10;->k:I

    .line 36
    .line 37
    const-string v6, ""

    .line 38
    .line 39
    const/4 v7, 0x1

    .line 40
    const/4 v8, 0x0

    .line 41
    if-eqz v5, :cond_2

    .line 42
    .line 43
    if-ne v5, v7, :cond_1

    .line 44
    .line 45
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto/16 :goto_3

    .line 49
    .line 50
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v8

    .line 56
    :cond_2
    invoke-static {v2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    const-string v2, "https://"

    .line 60
    .line 61
    const/4 v5, 0x0

    .line 62
    invoke-static {v0, v2, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 63
    .line 64
    .line 65
    move-result v9

    .line 66
    if-eqz v9, :cond_3

    .line 67
    .line 68
    invoke-static {v2, v0}, Lkotlin/text/StringsKt;->d0(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    :cond_3
    invoke-static {v0}, La/ttm0;->J(Ljava/lang/CharSequence;)C

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    invoke-static {v9}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v9

    .line 80
    const-string v10, "/"

    .line 81
    .line 82
    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    if-eqz v9, :cond_4

    .line 87
    .line 88
    invoke-static {v7, v0}, La/ttm0;->H(ILjava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    :cond_4
    const-string v9, "/slots"

    .line 93
    .line 94
    invoke-static {v2, v0, v9}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    iget-object v9, v1, La/hd10;->b:La/knf0;

    .line 99
    .line 100
    invoke-virtual {v9}, La/knf0;->c()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v11

    .line 104
    iget-object v0, v1, La/hd10;->d:La/tpv;

    .line 105
    .line 106
    invoke-virtual {v0}, La/tpv;->invoke()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    move-object v10, v0

    .line 111
    check-cast v10, La/jc10;

    .line 112
    .line 113
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 114
    .line 115
    iget-object v0, v1, La/hd10;->a:La/btt0;

    .line 116
    .line 117
    invoke-virtual {v0}, La/btt0;->a()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    goto :goto_1

    .line 122
    :catchall_0
    move-exception v0

    .line 123
    sget-object v12, La/j0g0;->b:La/e0g0;

    .line 124
    .line 125
    new-instance v12, La/g0g0;

    .line 126
    .line 127
    invoke-direct {v12, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 128
    .line 129
    .line 130
    move-object v0, v12

    .line 131
    :goto_1
    nop

    .line 132
    instance-of v12, v0, La/g0g0;

    .line 133
    .line 134
    if-eqz v12, :cond_5

    .line 135
    .line 136
    move-object v0, v6

    .line 137
    :cond_5
    check-cast v0, Ljava/lang/String;

    .line 138
    .line 139
    sget v12, Lokhttp3/RequestBody;->a:I

    .line 140
    .line 141
    invoke-static {v2, v11}, La/nsm0;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v12

    .line 145
    invoke-virtual {v9}, La/knf0;->a()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v13

    .line 149
    filled-new-array/range {p3 .. p3}, [Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    invoke-static {v2, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    const-string v9, "%s/"

    .line 158
    .line 159
    invoke-static {v9, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v16

    .line 163
    invoke-static/range {p5 .. p5}, La/jiq0;->w0(La/lu0;)La/ou0;

    .line 164
    .line 165
    .line 166
    move-result-object v18

    .line 167
    move-object v2, v10

    .line 168
    new-instance v10, La/ld10;

    .line 169
    .line 170
    new-instance v9, Ljava/lang/Integer;

    .line 171
    .line 172
    invoke-direct {v9, v5}, Ljava/lang/Integer;-><init>(I)V

    .line 173
    .line 174
    .line 175
    move-wide/from16 v14, p1

    .line 176
    .line 177
    move-object/from16 v17, v9

    .line 178
    .line 179
    invoke-direct/range {v10 .. v18}, La/ld10;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/Integer;La/ou0;)V

    .line 180
    .line 181
    .line 182
    iget-object v1, v1, La/hd10;->c:La/vby;

    .line 183
    .line 184
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    sget-object v5, La/ld10;->Companion:La/kd10;

    .line 188
    .line 189
    invoke-virtual {v5}, La/kd10;->serializer()La/jiy;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    check-cast v5, La/jiy;

    .line 194
    .line 195
    invoke-virtual {v1, v5, v10}, La/vby;->d(La/jiy;Ljava/lang/Object;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    sget-object v5, Lokhttp3/MediaType;->e:Lkotlin/text/Regex;

    .line 200
    .line 201
    const-string v5, "application/json; charset=utf-8"

    .line 202
    .line 203
    :try_start_1
    invoke-static {v5}, Lokhttp3/MediaType$Companion;->a(Ljava/lang/String;)Lokhttp3/MediaType;

    .line 204
    .line 205
    .line 206
    move-result-object v5
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    .line 207
    goto :goto_2

    .line 208
    :catch_0
    move-object v5, v8

    .line 209
    :goto_2
    invoke-static {v1, v5}, Lokhttp3/RequestBody$Companion;->a(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/RequestBody$Companion$toRequestBody$3;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    iput v7, v3, La/gd10;->k:I

    .line 214
    .line 215
    invoke-interface {v2, v0, v1, v3}, La/jc10;->a(Ljava/lang/String;Lokhttp3/RequestBody;La/yje;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    if-ne v2, v4, :cond_6

    .line 220
    .line 221
    return-object v4

    .line 222
    :cond_6
    :goto_3
    check-cast v2, La/od10;

    .line 223
    .line 224
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    iget-object v0, v2, La/od10;->d:Ljava/lang/Integer;

    .line 228
    .line 229
    if-eqz v0, :cond_8

    .line 230
    .line 231
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    if-lez v0, :cond_8

    .line 236
    .line 237
    new-instance v0, La/bii0;

    .line 238
    .line 239
    iget-object v1, v2, La/od10;->e:Ljava/lang/String;

    .line 240
    .line 241
    if-nez v1, :cond_7

    .line 242
    .line 243
    goto :goto_4

    .line 244
    :cond_7
    move-object v6, v1

    .line 245
    :goto_4
    invoke-direct {v0, v6}, La/zhi0;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    throw v0

    .line 249
    :cond_8
    new-instance v0, La/ed10;

    .line 250
    .line 251
    iget-object v1, v2, La/od10;->b:Ljava/lang/String;

    .line 252
    .line 253
    if-eqz v1, :cond_a

    .line 254
    .line 255
    iget-object v2, v2, La/od10;->c:Ljava/lang/String;

    .line 256
    .line 257
    if-nez v2, :cond_9

    .line 258
    .line 259
    goto :goto_5

    .line 260
    :cond_9
    move-object v6, v2

    .line 261
    :goto_5
    invoke-direct {v0, v1, v6}, La/ed10;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    return-object v0

    .line 265
    :cond_a
    invoke-static {v8}, La/jf4;->k(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    return-object v8
.end method
