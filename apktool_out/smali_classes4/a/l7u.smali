.class public final La/l7u;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public i:Ljava/util/List;

.field public j:La/a6u;

.field public k:Ljava/util/Collection;

.field public l:Ljava/util/Iterator;

.field public m:Ljava/util/Collection;

.field public n:Z

.field public synthetic o:Ljava/util/List;

.field public synthetic p:Z

.field public synthetic q:Ljava/lang/String;

.field public final synthetic r:Ljava/util/List;

.field public final synthetic s:La/a6u;


# direct methods
.method public constructor <init>(Ljava/util/List;La/a6u;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/l7u;->r:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, La/l7u;->s:La/a6u;

    .line 4
    .line 5
    const/4 p1, 0x4

    .line 6
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-object v0, v5, La/l7u;->o:Ljava/util/List;

    .line 4
    .line 5
    iget-boolean v6, v5, La/l7u;->p:Z

    .line 6
    .line 7
    iget-object v1, v5, La/l7u;->q:Ljava/lang/String;

    .line 8
    .line 9
    sget-object v7, La/wne;->a:La/wne;

    .line 10
    .line 11
    iget-boolean v2, v5, La/l7u;->n:Z

    .line 12
    .line 13
    const/16 v8, 0xa

    .line 14
    .line 15
    const/4 v9, 0x1

    .line 16
    const/4 v10, 0x0

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    if-ne v2, v9, :cond_0

    .line 20
    .line 21
    iget-object v0, v5, La/l7u;->m:Ljava/util/Collection;

    .line 22
    .line 23
    check-cast v0, Ljava/util/Collection;

    .line 24
    .line 25
    iget-object v2, v5, La/l7u;->l:Ljava/util/Iterator;

    .line 26
    .line 27
    iget-object v3, v5, La/l7u;->k:Ljava/util/Collection;

    .line 28
    .line 29
    check-cast v3, Ljava/util/Collection;

    .line 30
    .line 31
    iget-object v4, v5, La/l7u;->j:La/a6u;

    .line 32
    .line 33
    iget-object v11, v5, La/l7u;->i:Ljava/util/List;

    .line 34
    .line 35
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    move-object v12, v1

    .line 39
    move-object v13, v2

    .line 40
    move-object v14, v4

    .line 41
    move/from16 v16, v9

    .line 42
    .line 43
    move-object v15, v11

    .line 44
    move-object v11, v0

    .line 45
    move-object/from16 v0, p1

    .line 46
    .line 47
    goto/16 :goto_3

    .line 48
    .line 49
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v10

    .line 55
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    new-instance v2, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    :cond_2
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-eqz v4, :cond_6

    .line 78
    .line 79
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    move-object v11, v4

    .line 84
    check-cast v11, La/d0t;

    .line 85
    .line 86
    iget-object v12, v11, La/d0t;->o:Ljava/lang/String;

    .line 87
    .line 88
    invoke-static {v12, v1, v9}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 89
    .line 90
    .line 91
    move-result v12

    .line 92
    if-ne v12, v9, :cond_3

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    iget-object v12, v11, La/d0t;->b:Ljava/lang/String;

    .line 96
    .line 97
    invoke-static {v12, v1, v9}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 98
    .line 99
    .line 100
    move-result v12

    .line 101
    if-ne v12, v9, :cond_4

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_4
    invoke-static {v11}, La/qzb;->c0(La/d0t;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v12

    .line 108
    invoke-static {v12, v1, v9}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 109
    .line 110
    .line 111
    move-result v12

    .line 112
    if-nez v12, :cond_5

    .line 113
    .line 114
    invoke-static {v11}, La/qzb;->r0(La/d0t;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v11

    .line 118
    invoke-static {v11, v1, v9}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 119
    .line 120
    .line 121
    move-result v11

    .line 122
    if-eqz v11, :cond_2

    .line 123
    .line 124
    :cond_5
    :goto_1
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_6
    new-instance v3, Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-static {v0, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 135
    .line 136
    .line 137
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    iget-object v4, v5, La/l7u;->s:La/a6u;

    .line 142
    .line 143
    move-object v13, v0

    .line 144
    move-object v12, v1

    .line 145
    move-object v15, v2

    .line 146
    move-object v14, v4

    .line 147
    :goto_2
    move-object v11, v3

    .line 148
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-eqz v0, :cond_8

    .line 153
    .line 154
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    check-cast v0, La/d0t;

    .line 159
    .line 160
    iget-object v1, v14, La/a6u;->b:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v1, La/j3c;

    .line 163
    .line 164
    move-object v3, v1

    .line 165
    iget-wide v1, v0, La/d0t;->v:J

    .line 166
    .line 167
    iget-wide v8, v0, La/d0t;->u:J

    .line 168
    .line 169
    iput-object v10, v5, La/l7u;->o:Ljava/util/List;

    .line 170
    .line 171
    iput-object v12, v5, La/l7u;->q:Ljava/lang/String;

    .line 172
    .line 173
    iput-object v15, v5, La/l7u;->i:Ljava/util/List;

    .line 174
    .line 175
    iput-object v14, v5, La/l7u;->j:La/a6u;

    .line 176
    .line 177
    move-object v0, v11

    .line 178
    check-cast v0, Ljava/util/Collection;

    .line 179
    .line 180
    iput-object v0, v5, La/l7u;->k:Ljava/util/Collection;

    .line 181
    .line 182
    iput-object v13, v5, La/l7u;->l:Ljava/util/Iterator;

    .line 183
    .line 184
    iput-object v0, v5, La/l7u;->m:Ljava/util/Collection;

    .line 185
    .line 186
    iput-boolean v6, v5, La/l7u;->p:Z

    .line 187
    .line 188
    const/4 v0, 0x1

    .line 189
    iput-boolean v0, v5, La/l7u;->n:Z

    .line 190
    .line 191
    move/from16 v16, v0

    .line 192
    .line 193
    move-object v0, v3

    .line 194
    move-wide v3, v8

    .line 195
    invoke-virtual/range {v0 .. v5}, La/j3c;->a(JJLa/yje;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    if-ne v0, v7, :cond_7

    .line 200
    .line 201
    return-object v7

    .line 202
    :cond_7
    move-object v3, v11

    .line 203
    :goto_3
    check-cast v0, La/ypl0;

    .line 204
    .line 205
    invoke-interface {v11, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move/from16 v9, v16

    .line 209
    .line 210
    const/16 v8, 0xa

    .line 211
    .line 212
    goto :goto_2

    .line 213
    :cond_8
    check-cast v11, Ljava/util/List;

    .line 214
    .line 215
    move v3, v6

    .line 216
    new-instance v6, Ljava/util/ArrayList;

    .line 217
    .line 218
    const/16 v0, 0xa

    .line 219
    .line 220
    invoke-static {v11, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    invoke-direct {v6, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 225
    .line 226
    .line 227
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 232
    .line 233
    .line 234
    move-result v1

    .line 235
    if-eqz v1, :cond_9

    .line 236
    .line 237
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    check-cast v1, La/ypl0;

    .line 242
    .line 243
    iget-object v1, v1, La/ypl0;->c:La/lel0;

    .line 244
    .line 245
    iget-object v1, v1, La/lel0;->j:Ljava/lang/String;

    .line 246
    .line 247
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    goto :goto_4

    .line 251
    :cond_9
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 252
    .line 253
    new-instance v1, La/m3o;

    .line 254
    .line 255
    iget-object v5, v5, La/l7u;->r:Ljava/util/List;

    .line 256
    .line 257
    move-object v4, v12

    .line 258
    move-object v2, v15

    .line 259
    invoke-direct/range {v1 .. v6}, La/m3o;-><init>(Ljava/util/List;ZLjava/lang/String;Ljava/util/List;Ljava/util/ArrayList;)V

    .line 260
    .line 261
    .line 262
    new-instance v0, La/j0g0;

    .line 263
    .line 264
    invoke-direct {v0, v1}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    return-object v0
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Boolean;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    check-cast p3, Ljava/lang/String;

    .line 10
    .line 11
    check-cast p4, La/yje;

    .line 12
    .line 13
    new-instance v0, La/l7u;

    .line 14
    .line 15
    iget-object v1, p0, La/l7u;->r:Ljava/util/List;

    .line 16
    .line 17
    iget-object p0, p0, La/l7u;->s:La/a6u;

    .line 18
    .line 19
    invoke-direct {v0, v1, p0, p4}, La/l7u;-><init>(Ljava/util/List;La/a6u;La/yje;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, v0, La/l7u;->o:Ljava/util/List;

    .line 23
    .line 24
    iput-boolean p2, v0, La/l7u;->p:Z

    .line 25
    .line 26
    iput-object p3, v0, La/l7u;->q:Ljava/lang/String;

    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    invoke-virtual {v0, p0}, La/l7u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method
