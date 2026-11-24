.class public final La/rb6;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public i:Z

.field public final synthetic j:La/sb6;

.field public final synthetic k:La/sip;

.field public final synthetic l:La/jo20;

.field public final synthetic m:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;


# direct methods
.method public constructor <init>(La/sb6;La/sip;La/jo20;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/rb6;->j:La/sb6;

    .line 2
    .line 3
    iput-object p2, p0, La/rb6;->k:La/sip;

    .line 4
    .line 5
    iput-object p3, p0, La/rb6;->l:La/jo20;

    .line 6
    .line 7
    iput-object p4, p0, La/rb6;->m:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 6

    .line 1
    new-instance v0, La/rb6;

    .line 2
    .line 3
    iget-object v3, p0, La/rb6;->l:La/jo20;

    .line 4
    .line 5
    iget-object v4, p0, La/rb6;->m:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 6
    .line 7
    iget-object v1, p0, La/rb6;->j:La/sb6;

    .line 8
    .line 9
    iget-object v2, p0, La/rb6;->k:La/sip;

    .line 10
    .line 11
    move-object v5, p1

    .line 12
    invoke-direct/range {v0 .. v5}, La/rb6;-><init>(La/sb6;La/sip;La/jo20;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/yje;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/yje;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/rb6;->create(La/yje;)La/yje;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/rb6;

    .line 8
    .line 9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, La/rb6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    sget-object v1, La/wne;->a:La/wne;

    .line 4
    .line 5
    iget-boolean v2, v0, La/rb6;->i:Z

    .line 6
    .line 7
    iget-object v4, v0, La/rb6;->k:La/sip;

    .line 8
    .line 9
    const/4 v9, 0x1

    .line 10
    const/4 v10, 0x0

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    if-ne v2, v9, :cond_0

    .line 14
    .line 15
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    move-object/from16 v2, p1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v10

    .line 27
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object v2, v0, La/rb6;->j:La/sb6;

    .line 31
    .line 32
    iget-object v2, v2, La/sb6;->c:La/wsf0;

    .line 33
    .line 34
    iput-boolean v9, v0, La/rb6;->i:Z

    .line 35
    .line 36
    iget-object v3, v0, La/rb6;->l:La/jo20;

    .line 37
    .line 38
    invoke-virtual {v2, v4, v3, v0}, La/wsf0;->h(La/sip;La/jo20;La/zje;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    if-ne v2, v1, :cond_2

    .line 43
    .line 44
    return-object v1

    .line 45
    :cond_2
    :goto_0
    check-cast v2, Ljava/lang/Iterable;

    .line 46
    .line 47
    new-instance v1, Ljava/util/ArrayList;

    .line 48
    .line 49
    const/16 v3, 0xa

    .line 50
    .line 51
    invoke-static {v2, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 56
    .line 57
    .line 58
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_11

    .line 67
    .line 68
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    check-cast v3, La/f5h;

    .line 73
    .line 74
    sget-object v5, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 75
    .line 76
    iget-object v6, v0, La/rb6;->m:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 77
    .line 78
    invoke-virtual {v6, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    const-string v6, ""

    .line 83
    .line 84
    if-eqz v5, :cond_5

    .line 85
    .line 86
    iget-object v5, v3, La/f5h;->y:La/k2g;

    .line 87
    .line 88
    if-eqz v5, :cond_3

    .line 89
    .line 90
    iget-object v5, v5, La/k2g;->b:Ljava/lang/String;

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    move-object v5, v10

    .line 94
    :goto_2
    if-nez v5, :cond_4

    .line 95
    .line 96
    :goto_3
    move-object/from16 v16, v6

    .line 97
    .line 98
    goto :goto_5

    .line 99
    :cond_4
    move-object/from16 v16, v5

    .line 100
    .line 101
    goto :goto_5

    .line 102
    :cond_5
    iget-object v5, v3, La/f5h;->x:La/gdh;

    .line 103
    .line 104
    if-eqz v5, :cond_6

    .line 105
    .line 106
    iget-object v5, v5, La/gdh;->b:Ljava/lang/String;

    .line 107
    .line 108
    goto :goto_4

    .line 109
    :cond_6
    move-object v5, v10

    .line 110
    :goto_4
    if-nez v5, :cond_4

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :goto_5
    iget-object v5, v3, La/f5h;->z:La/e2g;

    .line 114
    .line 115
    iget-object v11, v3, La/f5h;->y:La/k2g;

    .line 116
    .line 117
    iget-object v12, v3, La/f5h;->x:La/gdh;

    .line 118
    .line 119
    if-eqz v5, :cond_7

    .line 120
    .line 121
    iget-object v5, v5, La/e2g;->c:Ljava/lang/String;

    .line 122
    .line 123
    goto :goto_6

    .line 124
    :cond_7
    move-object v5, v10

    .line 125
    :goto_6
    if-nez v5, :cond_8

    .line 126
    .line 127
    move-object v13, v6

    .line 128
    goto :goto_7

    .line 129
    :cond_8
    move-object v13, v5

    .line 130
    :goto_7
    const-wide/16 v14, -0x1

    .line 131
    .line 132
    if-eqz v12, :cond_9

    .line 133
    .line 134
    iget-object v5, v12, La/gdh;->a:Ljava/lang/Long;

    .line 135
    .line 136
    if-eqz v5, :cond_9

    .line 137
    .line 138
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 139
    .line 140
    .line 141
    move-result-wide v5

    .line 142
    goto :goto_8

    .line 143
    :cond_9
    move-wide v5, v14

    .line 144
    :goto_8
    if-eqz v11, :cond_a

    .line 145
    .line 146
    iget-object v7, v11, La/k2g;->a:Ljava/lang/Long;

    .line 147
    .line 148
    if-eqz v7, :cond_a

    .line 149
    .line 150
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 151
    .line 152
    .line 153
    move-result-wide v7

    .line 154
    goto :goto_9

    .line 155
    :cond_a
    move-wide v7, v14

    .line 156
    :goto_9
    invoke-static/range {v3 .. v8}, La/pzb;->E(La/f5h;La/sip;JJ)La/nas;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    if-eqz v12, :cond_b

    .line 161
    .line 162
    iget-object v5, v12, La/gdh;->a:Ljava/lang/Long;

    .line 163
    .line 164
    if-eqz v5, :cond_b

    .line 165
    .line 166
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 167
    .line 168
    .line 169
    move-result-wide v5

    .line 170
    goto :goto_a

    .line 171
    :cond_b
    move-wide v5, v14

    .line 172
    :goto_a
    if-eqz v11, :cond_c

    .line 173
    .line 174
    iget-object v7, v11, La/k2g;->a:Ljava/lang/Long;

    .line 175
    .line 176
    if-eqz v7, :cond_c

    .line 177
    .line 178
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 179
    .line 180
    .line 181
    move-result-wide v14

    .line 182
    :cond_c
    new-instance v7, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    sget-object v8, La/ujn;->h:Ljava/lang/String;

    .line 185
    .line 186
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    .line 190
    .line 191
    .line 192
    move-result v8

    .line 193
    const/4 v11, 0x0

    .line 194
    if-nez v8, :cond_d

    .line 195
    .line 196
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 197
    .line 198
    .line 199
    goto :goto_c

    .line 200
    :cond_d
    sget-object v8, La/ujn;->h:Ljava/lang/String;

    .line 201
    .line 202
    invoke-static {v13, v8, v11}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 203
    .line 204
    .line 205
    move-result v8

    .line 206
    if-nez v8, :cond_10

    .line 207
    .line 208
    const-string v8, "https://"

    .line 209
    .line 210
    invoke-static {v13, v8, v11}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 211
    .line 212
    .line 213
    move-result v8

    .line 214
    if-eqz v8, :cond_e

    .line 215
    .line 216
    goto :goto_b

    .line 217
    :cond_e
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->length()I

    .line 218
    .line 219
    .line 220
    move-result v8

    .line 221
    const/16 v12, 0x2f

    .line 222
    .line 223
    if-lez v8, :cond_f

    .line 224
    .line 225
    const-string v8, "/"

    .line 226
    .line 227
    invoke-static {v7, v8}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 228
    .line 229
    .line 230
    move-result v8

    .line 231
    if-nez v8, :cond_f

    .line 232
    .line 233
    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    :cond_f
    new-array v8, v9, [C

    .line 237
    .line 238
    aput-char v12, v8, v11

    .line 239
    .line 240
    invoke-static {v13, v8}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v8

    .line 244
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    goto :goto_c

    .line 248
    :cond_10
    :goto_b
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    :goto_c
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v17

    .line 258
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 259
    .line 260
    .line 261
    move-result-object v18

    .line 262
    new-instance v11, La/b4r0;

    .line 263
    .line 264
    move-wide v12, v5

    .line 265
    invoke-direct/range {v11 .. v18}, La/b4r0;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v1, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    goto/16 :goto_1

    .line 272
    .line 273
    :cond_11
    return-object v1
.end method
