.class public abstract La/b6g0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lkotlin/text/Regex;

.field public static final b:Lkotlin/text/Regex;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkotlin/text/Regex;

    .line 2
    .line 3
    const-string v1, "\\(\\s*([^)]*?)\\s*\\)"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/b6g0;->a:Lkotlin/text/Regex;

    .line 9
    .line 10
    new-instance v0, Lkotlin/text/Regex;

    .line 11
    .line 12
    const-string v1, "[,\\.;:!?\u2026\\s]+$"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, La/b6g0;->b:Lkotlin/text/Regex;

    .line 18
    .line 19
    return-void
.end method

.method public static final a(Ljava/util/Map;)Ljava/util/HashMap;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/util/Map$Entry;

    .line 25
    .line 26
    sget-object v2, La/w1w;->a:La/gst;

    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-static {v3}, La/gst;->d(Ljava/lang/String;)La/w1w;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    if-eqz v2, :cond_0

    .line 42
    .line 43
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    return-object v0
.end method

.method public static final b(La/tbt;)Ljava/lang/String;
    .locals 8

    .line 1
    iget-object v0, p0, La/tbt;->m:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, La/tbt;->n:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, La/tbt;->l:Ljava/lang/String;

    .line 6
    .line 7
    const/4 v2, 0x6

    .line 8
    sget-object v3, La/b6g0;->b:Lkotlin/text/Regex;

    .line 9
    .line 10
    sget-object v4, La/b6g0;->a:Lkotlin/text/Regex;

    .line 11
    .line 12
    const-string v5, ""

    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v4, v0}, Lkotlin/text/Regex;->a(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v7

    .line 21
    if-nez v7, :cond_0

    .line 22
    .line 23
    invoke-virtual {v3, v0, v5}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v7, La/wtf0;

    .line 29
    .line 30
    invoke-direct {v7, v2}, La/wtf0;-><init>(B)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v4, v0, v7}, Lkotlin/text/Regex;->h(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move-object v0, v6

    .line 39
    :goto_0
    if-eqz p0, :cond_3

    .line 40
    .line 41
    invoke-virtual {v4, p0}, Lkotlin/text/Regex;->a(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    if-nez v6, :cond_2

    .line 46
    .line 47
    invoke-virtual {v3, p0, v5}, Lkotlin/text/Regex;->replace(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    :goto_1
    move-object v6, v2

    .line 52
    goto :goto_2

    .line 53
    :cond_2
    new-instance v3, La/wtf0;

    .line 54
    .line 55
    invoke-direct {v3, v2}, La/wtf0;-><init>(B)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4, p0, v3}, Lkotlin/text/Regex;->h(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    goto :goto_1

    .line 63
    :cond_3
    :goto_2
    if-eqz v0, :cond_5

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-nez v2, :cond_4

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_4
    const-string p0, " ("

    .line 73
    .line 74
    const-string v2, ")"

    .line 75
    .line 76
    invoke-static {v6, p0, v0, v2}, La/kng0;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    goto :goto_4

    .line 81
    :cond_5
    :goto_3
    if-eqz p0, :cond_6

    .line 82
    .line 83
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_7

    .line 88
    .line 89
    :cond_6
    move-object p0, v5

    .line 90
    :cond_7
    :goto_4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-nez v0, :cond_9

    .line 95
    .line 96
    if-nez v1, :cond_8

    .line 97
    .line 98
    return-object v5

    .line 99
    :cond_8
    return-object v1

    .line 100
    :cond_9
    if-eqz v1, :cond_b

    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-nez v0, :cond_a

    .line 107
    .line 108
    goto :goto_5

    .line 109
    :cond_a
    const-string v0, "\n"

    .line 110
    .line 111
    invoke-static {p0, v0, v1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    :cond_b
    :goto_5
    return-object p0
.end method

.method public static final c(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLa/v1w;)La/a2w;
    .locals 6

    .line 1
    new-instance v0, La/a2w;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const-string p0, ""

    .line 6
    .line 7
    :cond_0
    move-object v1, p0

    .line 8
    sget-object v5, La/v1w;->c:La/v1w;

    .line 9
    .line 10
    if-ne p4, v5, :cond_1

    .line 11
    .line 12
    if-nez p1, :cond_2

    .line 13
    .line 14
    :cond_1
    sget-object p1, La/iun;->a:La/iun;

    .line 15
    .line 16
    :cond_2
    move-object v2, p1

    .line 17
    if-nez p2, :cond_3

    .line 18
    .line 19
    sget-object p2, La/iun;->a:La/iun;

    .line 20
    .line 21
    :cond_3
    move-object v3, p2

    .line 22
    move v4, p3

    .line 23
    invoke-direct/range {v0 .. v5}, La/a2w;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLa/v1w;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public static final d(La/tbt;)La/d2w;
    .locals 52

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, La/tbt;->k:Ljava/util/List;

    .line 7
    .line 8
    iget-object v2, v0, La/tbt;->g:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v3, v0, La/tbt;->q:Ljava/lang/Integer;

    .line 11
    .line 12
    iget-object v4, v0, La/tbt;->s:Ljava/lang/Long;

    .line 13
    .line 14
    iget-object v5, v0, La/tbt;->w:Ljava/lang/Integer;

    .line 15
    .line 16
    iget-object v6, v0, La/tbt;->e:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v7, v0, La/tbt;->d:Ljava/lang/Long;

    .line 19
    .line 20
    iget-object v8, v0, La/tbt;->u:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v9, v0, La/tbt;->v:Ljava/lang/Boolean;

    .line 23
    .line 24
    iget-object v10, v0, La/tbt;->j:Ljava/util/List;

    .line 25
    .line 26
    iget-object v11, v0, La/tbt;->h:Ljava/util/List;

    .line 27
    .line 28
    iget-object v12, v0, La/tbt;->r:Ljava/util/List;

    .line 29
    .line 30
    iget-object v13, v0, La/tbt;->o:Ljava/util/List;

    .line 31
    .line 32
    iget-object v14, v0, La/tbt;->t:Ljava/util/HashMap;

    .line 33
    .line 34
    iget-object v15, v0, La/tbt;->c:Ljava/lang/String;

    .line 35
    .line 36
    move-object/from16 v16, v3

    .line 37
    .line 38
    iget-object v3, v0, La/tbt;->b:Ljava/lang/Long;

    .line 39
    .line 40
    move-object/from16 v17, v3

    .line 41
    .line 42
    iget-object v3, v0, La/tbt;->p:Ljava/lang/Long;

    .line 43
    .line 44
    move-object/from16 v18, v3

    .line 45
    .line 46
    iget-object v3, v0, La/tbt;->i:Ljava/util/List;

    .line 47
    .line 48
    move-object/from16 v19, v4

    .line 49
    .line 50
    iget-object v4, v0, La/tbt;->f:Ljava/lang/String;

    .line 51
    .line 52
    move-object/from16 v20, v5

    .line 53
    .line 54
    iget-object v5, v0, La/tbt;->a:Ljava/lang/Long;

    .line 55
    .line 56
    const-string v21, ""

    .line 57
    .line 58
    const-wide/16 v22, 0x0

    .line 59
    .line 60
    const/16 v24, 0x0

    .line 61
    .line 62
    if-eqz v2, :cond_0

    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 65
    .line 66
    .line 67
    move-result v25

    .line 68
    if-nez v25, :cond_1

    .line 69
    .line 70
    :cond_0
    move-object/from16 v25, v5

    .line 71
    .line 72
    move-object/from16 v26, v6

    .line 73
    .line 74
    goto/16 :goto_13

    .line 75
    .line 76
    :cond_1
    if-eqz v3, :cond_2

    .line 77
    .line 78
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 79
    .line 80
    .line 81
    move-result v25

    .line 82
    move/from16 v26, v25

    .line 83
    .line 84
    move-object/from16 v25, v5

    .line 85
    .line 86
    move/from16 v5, v26

    .line 87
    .line 88
    :goto_0
    move-object/from16 v26, v6

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    move-object/from16 v25, v5

    .line 92
    .line 93
    move/from16 v5, v24

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :goto_1
    const/4 v6, 0x1

    .line 97
    if-le v5, v6, :cond_f

    .line 98
    .line 99
    if-eqz v25, :cond_2a

    .line 100
    .line 101
    if-eqz v15, :cond_2a

    .line 102
    .line 103
    if-eqz v17, :cond_2a

    .line 104
    .line 105
    if-nez v18, :cond_3

    .line 106
    .line 107
    goto/16 :goto_19

    .line 108
    .line 109
    :cond_3
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Long;->longValue()J

    .line 110
    .line 111
    .line 112
    move-result-wide v28

    .line 113
    iget-object v5, v0, La/tbt;->c:Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Long;->longValue()J

    .line 116
    .line 117
    .line 118
    move-result-wide v32

    .line 119
    if-eqz v20, :cond_4

    .line 120
    .line 121
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Integer;->intValue()I

    .line 122
    .line 123
    .line 124
    move-result v6

    .line 125
    move/from16 v34, v6

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_4
    move/from16 v34, v24

    .line 129
    .line 130
    :goto_2
    if-nez v26, :cond_5

    .line 131
    .line 132
    move-object/from16 v35, v21

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :cond_5
    move-object/from16 v35, v26

    .line 136
    .line 137
    :goto_3
    if-eqz v7, :cond_6

    .line 138
    .line 139
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 140
    .line 141
    .line 142
    move-result-wide v6

    .line 143
    move-wide/from16 v36, v6

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_6
    move-wide/from16 v36, v22

    .line 147
    .line 148
    :goto_4
    if-eqz v14, :cond_7

    .line 149
    .line 150
    goto :goto_5

    .line 151
    :cond_7
    sget-object v14, La/lun;->a:La/lun;

    .line 152
    .line 153
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    :goto_5
    invoke-static {v14}, La/b6g0;->a(Ljava/util/Map;)Ljava/util/HashMap;

    .line 157
    .line 158
    .line 159
    move-result-object v40

    .line 160
    invoke-static {v0}, La/b6g0;->b(La/tbt;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v41

    .line 164
    if-nez v13, :cond_8

    .line 165
    .line 166
    sget-object v13, La/iun;->a:La/iun;

    .line 167
    .line 168
    :cond_8
    move-object/from16 v42, v13

    .line 169
    .line 170
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Long;->longValue()J

    .line 171
    .line 172
    .line 173
    move-result-wide v43

    .line 174
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Long;->longValue()J

    .line 175
    .line 176
    .line 177
    move-result-wide v6

    .line 178
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Long;->longValue()J

    .line 179
    .line 180
    .line 181
    move-result-wide v13

    .line 182
    invoke-static {v6, v7, v13, v14, v12}, La/q5x;->a0(JJLjava/util/List;)Ljava/util/List;

    .line 183
    .line 184
    .line 185
    move-result-object v45

    .line 186
    if-eqz v9, :cond_9

    .line 187
    .line 188
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    goto :goto_6

    .line 193
    :cond_9
    move/from16 v0, v24

    .line 194
    .line 195
    :goto_6
    if-eqz v9, :cond_a

    .line 196
    .line 197
    sget-object v6, La/v1w;->a:La/v1w;

    .line 198
    .line 199
    goto :goto_7

    .line 200
    :cond_a
    sget-object v6, La/v1w;->c:La/v1w;

    .line 201
    .line 202
    :goto_7
    invoke-static {v4, v11, v10, v0, v6}, La/b6g0;->c(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLa/v1w;)La/a2w;

    .line 203
    .line 204
    .line 205
    move-result-object v46

    .line 206
    if-eqz v9, :cond_b

    .line 207
    .line 208
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 209
    .line 210
    .line 211
    move-result v24

    .line 212
    :cond_b
    move/from16 v0, v24

    .line 213
    .line 214
    if-eqz v9, :cond_c

    .line 215
    .line 216
    sget-object v4, La/v1w;->b:La/v1w;

    .line 217
    .line 218
    goto :goto_8

    .line 219
    :cond_c
    sget-object v4, La/v1w;->c:La/v1w;

    .line 220
    .line 221
    :goto_8
    invoke-static {v2, v3, v1, v0, v4}, La/b6g0;->c(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLa/v1w;)La/a2w;

    .line 222
    .line 223
    .line 224
    move-result-object v47

    .line 225
    if-nez v8, :cond_d

    .line 226
    .line 227
    move-object/from16 v48, v21

    .line 228
    .line 229
    goto :goto_9

    .line 230
    :cond_d
    move-object/from16 v48, v8

    .line 231
    .line 232
    :goto_9
    if-eqz v19, :cond_e

    .line 233
    .line 234
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Long;->longValue()J

    .line 235
    .line 236
    .line 237
    move-result-wide v22

    .line 238
    :cond_e
    move-wide/from16 v38, v22

    .line 239
    .line 240
    new-instance v27, La/x1w;

    .line 241
    .line 242
    const-string v49, ""

    .line 243
    .line 244
    const-string v50, ""

    .line 245
    .line 246
    const-string v31, " VS "

    .line 247
    .line 248
    move-object/from16 v30, v5

    .line 249
    .line 250
    invoke-direct/range {v27 .. v50}, La/x1w;-><init>(JLjava/lang/String;Ljava/lang/String;JILjava/lang/String;JJLjava/util/HashMap;Ljava/lang/String;Ljava/util/List;JLjava/util/List;La/a2w;La/a2w;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    return-object v27

    .line 254
    :cond_f
    if-eqz v4, :cond_2a

    .line 255
    .line 256
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 257
    .line 258
    .line 259
    move-result v5

    .line 260
    if-nez v5, :cond_10

    .line 261
    .line 262
    goto/16 :goto_19

    .line 263
    .line 264
    :cond_10
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 265
    .line 266
    .line 267
    move-result v5

    .line 268
    if-nez v5, :cond_11

    .line 269
    .line 270
    goto/16 :goto_19

    .line 271
    .line 272
    :cond_11
    if-eqz v25, :cond_2a

    .line 273
    .line 274
    if-eqz v15, :cond_2a

    .line 275
    .line 276
    if-eqz v17, :cond_2a

    .line 277
    .line 278
    if-nez v18, :cond_12

    .line 279
    .line 280
    goto/16 :goto_19

    .line 281
    .line 282
    :cond_12
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Long;->longValue()J

    .line 283
    .line 284
    .line 285
    move-result-wide v28

    .line 286
    iget-object v5, v0, La/tbt;->c:Ljava/lang/String;

    .line 287
    .line 288
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Long;->longValue()J

    .line 289
    .line 290
    .line 291
    move-result-wide v32

    .line 292
    if-eqz v20, :cond_13

    .line 293
    .line 294
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Integer;->intValue()I

    .line 295
    .line 296
    .line 297
    move-result v6

    .line 298
    move/from16 v34, v6

    .line 299
    .line 300
    goto :goto_a

    .line 301
    :cond_13
    move/from16 v34, v24

    .line 302
    .line 303
    :goto_a
    if-nez v26, :cond_14

    .line 304
    .line 305
    move-object/from16 v35, v21

    .line 306
    .line 307
    goto :goto_b

    .line 308
    :cond_14
    move-object/from16 v35, v26

    .line 309
    .line 310
    :goto_b
    if-eqz v7, :cond_15

    .line 311
    .line 312
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 313
    .line 314
    .line 315
    move-result-wide v6

    .line 316
    move-wide/from16 v36, v6

    .line 317
    .line 318
    goto :goto_c

    .line 319
    :cond_15
    move-wide/from16 v36, v22

    .line 320
    .line 321
    :goto_c
    if-eqz v14, :cond_16

    .line 322
    .line 323
    goto :goto_d

    .line 324
    :cond_16
    sget-object v14, La/lun;->a:La/lun;

    .line 325
    .line 326
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    :goto_d
    invoke-static {v14}, La/b6g0;->a(Ljava/util/Map;)Ljava/util/HashMap;

    .line 330
    .line 331
    .line 332
    move-result-object v40

    .line 333
    invoke-static {v0}, La/b6g0;->b(La/tbt;)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v41

    .line 337
    if-nez v13, :cond_17

    .line 338
    .line 339
    sget-object v13, La/iun;->a:La/iun;

    .line 340
    .line 341
    :cond_17
    move-object/from16 v42, v13

    .line 342
    .line 343
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Long;->longValue()J

    .line 344
    .line 345
    .line 346
    move-result-wide v43

    .line 347
    if-eqz v16, :cond_18

    .line 348
    .line 349
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    .line 350
    .line 351
    .line 352
    move-result v0

    .line 353
    move/from16 v45, v0

    .line 354
    .line 355
    goto :goto_e

    .line 356
    :cond_18
    move/from16 v45, v24

    .line 357
    .line 358
    :goto_e
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Long;->longValue()J

    .line 359
    .line 360
    .line 361
    move-result-wide v6

    .line 362
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Long;->longValue()J

    .line 363
    .line 364
    .line 365
    move-result-wide v13

    .line 366
    invoke-static {v6, v7, v13, v14, v12}, La/q5x;->a0(JJLjava/util/List;)Ljava/util/List;

    .line 367
    .line 368
    .line 369
    move-result-object v46

    .line 370
    if-eqz v9, :cond_19

    .line 371
    .line 372
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 373
    .line 374
    .line 375
    move-result v0

    .line 376
    goto :goto_f

    .line 377
    :cond_19
    move/from16 v0, v24

    .line 378
    .line 379
    :goto_f
    if-eqz v9, :cond_1a

    .line 380
    .line 381
    sget-object v6, La/v1w;->a:La/v1w;

    .line 382
    .line 383
    goto :goto_10

    .line 384
    :cond_1a
    sget-object v6, La/v1w;->c:La/v1w;

    .line 385
    .line 386
    :goto_10
    invoke-static {v4, v11, v10, v0, v6}, La/b6g0;->c(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLa/v1w;)La/a2w;

    .line 387
    .line 388
    .line 389
    move-result-object v47

    .line 390
    if-eqz v9, :cond_1b

    .line 391
    .line 392
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 393
    .line 394
    .line 395
    move-result v24

    .line 396
    :cond_1b
    move/from16 v0, v24

    .line 397
    .line 398
    if-eqz v9, :cond_1c

    .line 399
    .line 400
    sget-object v4, La/v1w;->b:La/v1w;

    .line 401
    .line 402
    goto :goto_11

    .line 403
    :cond_1c
    sget-object v4, La/v1w;->c:La/v1w;

    .line 404
    .line 405
    :goto_11
    invoke-static {v2, v3, v1, v0, v4}, La/b6g0;->c(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLa/v1w;)La/a2w;

    .line 406
    .line 407
    .line 408
    move-result-object v48

    .line 409
    if-eqz v19, :cond_1d

    .line 410
    .line 411
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Long;->longValue()J

    .line 412
    .line 413
    .line 414
    move-result-wide v22

    .line 415
    :cond_1d
    move-wide/from16 v38, v22

    .line 416
    .line 417
    if-nez v8, :cond_1e

    .line 418
    .line 419
    move-object/from16 v49, v21

    .line 420
    .line 421
    goto :goto_12

    .line 422
    :cond_1e
    move-object/from16 v49, v8

    .line 423
    .line 424
    :goto_12
    new-instance v27, La/c2w;

    .line 425
    .line 426
    const-string v50, ""

    .line 427
    .line 428
    const-string v51, ""

    .line 429
    .line 430
    const-string v31, " VS "

    .line 431
    .line 432
    move-object/from16 v30, v5

    .line 433
    .line 434
    invoke-direct/range {v27 .. v51}, La/c2w;-><init>(JLjava/lang/String;Ljava/lang/String;JILjava/lang/String;JJLjava/util/HashMap;Ljava/lang/String;Ljava/util/List;JILjava/util/List;La/a2w;La/a2w;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 435
    .line 436
    .line 437
    return-object v27

    .line 438
    :goto_13
    if-eqz v25, :cond_2a

    .line 439
    .line 440
    if-eqz v15, :cond_2a

    .line 441
    .line 442
    if-eqz v17, :cond_2a

    .line 443
    .line 444
    if-nez v18, :cond_1f

    .line 445
    .line 446
    goto/16 :goto_19

    .line 447
    .line 448
    :cond_1f
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Long;->longValue()J

    .line 449
    .line 450
    .line 451
    move-result-wide v1

    .line 452
    iget-object v3, v0, La/tbt;->c:Ljava/lang/String;

    .line 453
    .line 454
    if-eqz v14, :cond_20

    .line 455
    .line 456
    goto :goto_14

    .line 457
    :cond_20
    sget-object v14, La/lun;->a:La/lun;

    .line 458
    .line 459
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 460
    .line 461
    .line 462
    :goto_14
    invoke-static {v14}, La/b6g0;->a(Ljava/util/Map;)Ljava/util/HashMap;

    .line 463
    .line 464
    .line 465
    move-result-object v5

    .line 466
    move-object v14, v13

    .line 467
    move-object v13, v5

    .line 468
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Long;->longValue()J

    .line 469
    .line 470
    .line 471
    move-result-wide v5

    .line 472
    iget-object v0, v0, La/tbt;->n:Ljava/lang/String;

    .line 473
    .line 474
    if-nez v0, :cond_21

    .line 475
    .line 476
    move-object/from16 v0, v21

    .line 477
    .line 478
    :cond_21
    if-nez v14, :cond_22

    .line 479
    .line 480
    sget-object v14, La/iun;->a:La/iun;

    .line 481
    .line 482
    :cond_22
    move-object v15, v14

    .line 483
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Long;->longValue()J

    .line 484
    .line 485
    .line 486
    move-result-wide v27

    .line 487
    if-eqz v16, :cond_23

    .line 488
    .line 489
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    .line 490
    .line 491
    .line 492
    move-result v14

    .line 493
    move/from16 v18, v14

    .line 494
    .line 495
    move-wide/from16 v29, v1

    .line 496
    .line 497
    move-object v14, v0

    .line 498
    goto :goto_15

    .line 499
    :cond_23
    move/from16 v18, v24

    .line 500
    .line 501
    move-object v14, v0

    .line 502
    move-wide/from16 v29, v1

    .line 503
    .line 504
    :goto_15
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Long;->longValue()J

    .line 505
    .line 506
    .line 507
    move-result-wide v0

    .line 508
    move-object/from16 v16, v3

    .line 509
    .line 510
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Long;->longValue()J

    .line 511
    .line 512
    .line 513
    move-result-wide v2

    .line 514
    invoke-static {v0, v1, v2, v3, v12}, La/q5x;->a0(JJLjava/util/List;)Ljava/util/List;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    if-eqz v9, :cond_24

    .line 519
    .line 520
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 521
    .line 522
    .line 523
    move-result v1

    .line 524
    goto :goto_16

    .line 525
    :cond_24
    move/from16 v1, v24

    .line 526
    .line 527
    :goto_16
    sget-object v2, La/v1w;->c:La/v1w;

    .line 528
    .line 529
    invoke-static {v4, v11, v10, v1, v2}, La/b6g0;->c(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLa/v1w;)La/a2w;

    .line 530
    .line 531
    .line 532
    move-result-object v1

    .line 533
    if-nez v8, :cond_25

    .line 534
    .line 535
    move-object/from16 v8, v21

    .line 536
    .line 537
    :cond_25
    if-eqz v7, :cond_26

    .line 538
    .line 539
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 540
    .line 541
    .line 542
    move-result-wide v2

    .line 543
    goto :goto_17

    .line 544
    :cond_26
    move-wide/from16 v2, v22

    .line 545
    .line 546
    :goto_17
    if-nez v26, :cond_27

    .line 547
    .line 548
    move-object/from16 v10, v21

    .line 549
    .line 550
    goto :goto_18

    .line 551
    :cond_27
    move-object/from16 v10, v26

    .line 552
    .line 553
    :goto_18
    if-eqz v20, :cond_28

    .line 554
    .line 555
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Integer;->intValue()I

    .line 556
    .line 557
    .line 558
    move-result v24

    .line 559
    :cond_28
    move/from16 v7, v24

    .line 560
    .line 561
    if-eqz v19, :cond_29

    .line 562
    .line 563
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Long;->longValue()J

    .line 564
    .line 565
    .line 566
    move-result-wide v22

    .line 567
    :cond_29
    move-object/from16 v19, v0

    .line 568
    .line 569
    move-wide/from16 v11, v22

    .line 570
    .line 571
    new-instance v0, La/y1w;

    .line 572
    .line 573
    const-string v4, " VS "

    .line 574
    .line 575
    move-object/from16 v20, v1

    .line 576
    .line 577
    move-object/from16 v21, v8

    .line 578
    .line 579
    move-wide v8, v2

    .line 580
    move-object/from16 v3, v16

    .line 581
    .line 582
    move-wide/from16 v16, v27

    .line 583
    .line 584
    move-wide/from16 v1, v29

    .line 585
    .line 586
    invoke-direct/range {v0 .. v21}, La/y1w;-><init>(JLjava/lang/String;Ljava/lang/String;JIJLjava/lang/String;JLjava/util/HashMap;Ljava/lang/String;Ljava/util/List;JILjava/util/List;La/a2w;Ljava/lang/String;)V

    .line 587
    .line 588
    .line 589
    return-object v0

    .line 590
    :cond_2a
    :goto_19
    const/4 v0, 0x0

    .line 591
    return-object v0
.end method
