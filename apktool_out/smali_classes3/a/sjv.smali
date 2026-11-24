.class public final La/sjv;
.super La/bnn0;

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/hzb0;

.field public j:La/v0;

.field public k:La/cyh;

.field public l:Ljava/util/Map;

.field public m:Ljava/util/Iterator;

.field public n:La/i7a;

.field public o:B

.field public final synthetic p:La/y6a;

.field public final synthetic q:La/hzb0;

.field public final synthetic r:La/v0;

.field public final synthetic s:La/cyh;

.field public final synthetic t:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(La/y6a;La/hzb0;La/v0;La/cyh;Ljava/util/LinkedHashMap;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/sjv;->p:La/y6a;

    .line 2
    .line 3
    iput-object p2, p0, La/sjv;->q:La/hzb0;

    .line 4
    .line 5
    iput-object p3, p0, La/sjv;->r:La/v0;

    .line 6
    .line 7
    iput-object p4, p0, La/sjv;->s:La/cyh;

    .line 8
    .line 9
    iput-object p5, p0, La/sjv;->t:Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    const/4 p1, 0x2

    .line 12
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 7

    .line 1
    new-instance v0, La/sjv;

    .line 2
    .line 3
    iget-object v4, p0, La/sjv;->s:La/cyh;

    .line 4
    .line 5
    iget-object v5, p0, La/sjv;->t:Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    iget-object v1, p0, La/sjv;->p:La/y6a;

    .line 8
    .line 9
    iget-object v2, p0, La/sjv;->q:La/hzb0;

    .line 10
    .line 11
    iget-object v3, p0, La/sjv;->r:La/v0;

    .line 12
    .line 13
    move-object v6, p2

    .line 14
    invoke-direct/range {v0 .. v6}, La/sjv;-><init>(La/y6a;La/hzb0;La/v0;La/cyh;Ljava/util/LinkedHashMap;La/yje;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/sjv;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/sjv;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/sjv;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    sget-object v0, La/wne;->a:La/wne;

    .line 2
    .line 3
    iget-byte v1, p0, La/sjv;->o:B

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    if-eq v1, v3, :cond_1

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    iget-object v1, p0, La/sjv;->n:La/i7a;

    .line 14
    .line 15
    iget-object v4, p0, La/sjv;->m:Ljava/util/Iterator;

    .line 16
    .line 17
    iget-object v5, p0, La/sjv;->l:Ljava/util/Map;

    .line 18
    .line 19
    check-cast v5, Ljava/util/Map;

    .line 20
    .line 21
    iget-object v6, p0, La/sjv;->k:La/cyh;

    .line 22
    .line 23
    iget-object v7, p0, La/sjv;->j:La/v0;

    .line 24
    .line 25
    iget-object v8, p0, La/sjv;->i:La/hzb0;

    .line 26
    .line 27
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto/16 :goto_4

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
    const/4 p0, 0x0

    .line 38
    return-object p0

    .line 39
    :cond_1
    iget-object v1, p0, La/sjv;->n:La/i7a;

    .line 40
    .line 41
    iget-object v4, p0, La/sjv;->m:Ljava/util/Iterator;

    .line 42
    .line 43
    iget-object v5, p0, La/sjv;->l:Ljava/util/Map;

    .line 44
    .line 45
    check-cast v5, Ljava/util/Map;

    .line 46
    .line 47
    iget-object v6, p0, La/sjv;->k:La/cyh;

    .line 48
    .line 49
    iget-object v7, p0, La/sjv;->j:La/v0;

    .line 50
    .line 51
    iget-object v8, p0, La/sjv;->i:La/hzb0;

    .line 52
    .line 53
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto/16 :goto_2

    .line 57
    .line 58
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iget-object p1, p0, La/sjv;->p:La/y6a;

    .line 62
    .line 63
    iget-object p1, p1, La/y6a;->b:Ljava/util/ArrayList;

    .line 64
    .line 65
    new-instance v1, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    :cond_3
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-eqz v4, :cond_4

    .line 79
    .line 80
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    move-object v5, v4

    .line 85
    check-cast v5, La/i7a;

    .line 86
    .line 87
    sget-object v6, La/m7a;->a:La/kl5;

    .line 88
    .line 89
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    sget-object v6, La/m7a;->b:Ljava/util/List;

    .line 93
    .line 94
    iget-object v5, v5, La/i7a;->d:La/m7a;

    .line 95
    .line 96
    invoke-interface {v6, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    if-eqz v5, :cond_3

    .line 101
    .line 102
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    iget-object v1, p0, La/sjv;->q:La/hzb0;

    .line 111
    .line 112
    iget-object v4, p0, La/sjv;->r:La/v0;

    .line 113
    .line 114
    iget-object v5, p0, La/sjv;->s:La/cyh;

    .line 115
    .line 116
    iget-object v6, p0, La/sjv;->t:Ljava/util/LinkedHashMap;

    .line 117
    .line 118
    :cond_5
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 119
    .line 120
    .line 121
    move-result v7

    .line 122
    if-eqz v7, :cond_a

    .line 123
    .line 124
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    check-cast v7, La/i7a;

    .line 129
    .line 130
    invoke-interface {p0}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 131
    .line 132
    .line 133
    move-result-object v8

    .line 134
    invoke-static {v8}, La/zvw;->X(Lkotlin/coroutines/CoroutineContext;)Z

    .line 135
    .line 136
    .line 137
    move-result v8

    .line 138
    if-eqz v8, :cond_5

    .line 139
    .line 140
    new-instance v8, La/d7a;

    .line 141
    .line 142
    iget-object v9, v4, La/v0;->c:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v9, Ljava/lang/String;

    .line 145
    .line 146
    invoke-direct {v8, v7, v9}, La/d7a;-><init>(La/i7a;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    iput-object v1, p0, La/sjv;->i:La/hzb0;

    .line 150
    .line 151
    iput-object v4, p0, La/sjv;->j:La/v0;

    .line 152
    .line 153
    iput-object v5, p0, La/sjv;->k:La/cyh;

    .line 154
    .line 155
    move-object v9, v6

    .line 156
    check-cast v9, Ljava/util/Map;

    .line 157
    .line 158
    iput-object v9, p0, La/sjv;->l:Ljava/util/Map;

    .line 159
    .line 160
    iput-object p1, p0, La/sjv;->m:Ljava/util/Iterator;

    .line 161
    .line 162
    iput-object v7, p0, La/sjv;->n:La/i7a;

    .line 163
    .line 164
    iput-byte v3, p0, La/sjv;->o:B

    .line 165
    .line 166
    iget-object v9, v1, La/hzb0;->e:La/q99;

    .line 167
    .line 168
    invoke-interface {v9, p0, v8}, La/jbi0;->m(La/yje;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v8

    .line 172
    if-ne v8, v0, :cond_6

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :cond_6
    move-object v8, v6

    .line 176
    move-object v6, v5

    .line 177
    move-object v5, v8

    .line 178
    move-object v8, v1

    .line 179
    move-object v1, v7

    .line 180
    move-object v7, v4

    .line 181
    move-object v4, p1

    .line 182
    :goto_2
    iget-object p1, v6, La/cyh;->b:La/b5w0;

    .line 183
    .line 184
    iget-object v9, v1, La/i7a;->d:La/m7a;

    .line 185
    .line 186
    iget-object p1, p1, La/b5w0;->a:La/j6w0;

    .line 187
    .line 188
    iget-object p1, p1, La/j6w0;->a:Ljava/util/LinkedHashMap;

    .line 189
    .line 190
    invoke-virtual {p1, v9}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v10

    .line 194
    check-cast v10, La/mz40;

    .line 195
    .line 196
    if-nez v10, :cond_7

    .line 197
    .line 198
    const/4 v10, 0x0

    .line 199
    sget-object v11, La/i99;->b:La/i99;

    .line 200
    .line 201
    invoke-static {v3, v10, v11, v2}, La/roj0;->b(IILa/i99;I)La/qoj0;

    .line 202
    .line 203
    .line 204
    move-result-object v10

    .line 205
    invoke-interface {p1, v9, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    :cond_7
    new-instance p1, La/mgo0;

    .line 209
    .line 210
    const/4 v9, 0x3

    .line 211
    invoke-direct {p1, v10, v9}, La/mgo0;-><init>(La/gmq;B)V

    .line 212
    .line 213
    .line 214
    iput-object v8, p0, La/sjv;->i:La/hzb0;

    .line 215
    .line 216
    iput-object v7, p0, La/sjv;->j:La/v0;

    .line 217
    .line 218
    iput-object v6, p0, La/sjv;->k:La/cyh;

    .line 219
    .line 220
    move-object v9, v5

    .line 221
    check-cast v9, Ljava/util/Map;

    .line 222
    .line 223
    iput-object v9, p0, La/sjv;->l:Ljava/util/Map;

    .line 224
    .line 225
    iput-object v4, p0, La/sjv;->m:Ljava/util/Iterator;

    .line 226
    .line 227
    iput-object v1, p0, La/sjv;->n:La/i7a;

    .line 228
    .line 229
    iput-byte v2, p0, La/sjv;->o:B

    .line 230
    .line 231
    invoke-static {p1, p0}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    if-ne p1, v0, :cond_8

    .line 236
    .line 237
    :goto_3
    return-object v0

    .line 238
    :cond_8
    :goto_4
    check-cast p1, Ljava/lang/String;

    .line 239
    .line 240
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 241
    .line 242
    .line 243
    move-result v9

    .line 244
    if-eqz v9, :cond_9

    .line 245
    .line 246
    invoke-interface {v5, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-object p1, v6

    .line 250
    move-object v6, v5

    .line 251
    move-object v5, p1

    .line 252
    move-object p1, v4

    .line 253
    move-object v4, v7

    .line 254
    move-object v1, v8

    .line 255
    goto/16 :goto_1

    .line 256
    .line 257
    :cond_9
    new-instance p0, La/k6a;

    .line 258
    .line 259
    new-instance p1, Ljava/lang/StringBuilder;

    .line 260
    .line 261
    const-string v0, "Captcha answer is empty for task: \'"

    .line 262
    .line 263
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    const-string v0, "\'"

    .line 270
    .line 271
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object p1

    .line 278
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    throw p0

    .line 282
    :cond_a
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 283
    .line 284
    return-object p0
.end method
