.class public final La/uz0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:Ljava/util/List;

.field public j:B

.field public final synthetic k:La/a01;

.field public final synthetic l:Z

.field public final synthetic m:Z

.field public final synthetic n:Z


# direct methods
.method public constructor <init>(La/a01;ZZZLa/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/uz0;->k:La/a01;

    .line 2
    .line 3
    iput-boolean p2, p0, La/uz0;->l:Z

    .line 4
    .line 5
    iput-boolean p3, p0, La/uz0;->m:Z

    .line 6
    .line 7
    iput-boolean p4, p0, La/uz0;->n:Z

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, La/bnn0;-><init>(ILa/yje;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 6

    .line 1
    new-instance v0, La/uz0;

    .line 2
    .line 3
    iget-boolean v3, p0, La/uz0;->m:Z

    .line 4
    .line 5
    iget-boolean v4, p0, La/uz0;->n:Z

    .line 6
    .line 7
    iget-object v1, p0, La/uz0;->k:La/a01;

    .line 8
    .line 9
    iget-boolean v2, p0, La/uz0;->l:Z

    .line 10
    .line 11
    move-object v5, p2

    .line 12
    invoke-direct/range {v0 .. v5}, La/uz0;-><init>(La/a01;ZZZLa/yje;)V

    .line 13
    .line 14
    .line 15
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
    invoke-virtual {p0, p1, p2}, La/uz0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/uz0;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/uz0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-object v8, p0, La/uz0;->k:La/a01;

    .line 2
    .line 3
    iget-object v9, v8, La/i3t0;->i:La/ocj;

    .line 4
    .line 5
    sget-object v10, La/wne;->a:La/wne;

    .line 6
    .line 7
    iget-byte v0, p0, La/uz0;->j:B

    .line 8
    .line 9
    const/4 v11, 0x2

    .line 10
    const/4 v12, 0x1

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    if-eq v0, v12, :cond_1

    .line 14
    .line 15
    if-ne v0, v11, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, La/uz0;->i:Ljava/util/List;

    .line 18
    .line 19
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    move-object v1, p1

    .line 23
    goto :goto_2

    .line 24
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    return-object v0

    .line 31
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    move-object v0, p1

    .line 35
    check-cast v0, La/j0g0;

    .line 36
    .line 37
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, v8, La/a01;->t:La/wdu;

    .line 44
    .line 45
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, La/hz0;

    .line 50
    .line 51
    iget-boolean v1, v1, La/hz0;->d:Z

    .line 52
    .line 53
    iput-byte v12, p0, La/uz0;->j:B

    .line 54
    .line 55
    const/4 v2, 0x1

    .line 56
    iget-boolean v3, p0, La/uz0;->l:Z

    .line 57
    .line 58
    const/16 v4, 0x8

    .line 59
    .line 60
    const/4 v5, 0x1

    .line 61
    iget-boolean v6, p0, La/uz0;->m:Z

    .line 62
    .line 63
    move-object v7, p0

    .line 64
    invoke-virtual/range {v0 .. v7}, La/wdu;->z(ZZZIZZLa/zje;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    if-ne v0, v10, :cond_3

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    :goto_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    check-cast v0, Ljava/util/List;

    .line 75
    .line 76
    iget-object v1, v8, La/a01;->p:La/ouu;

    .line 77
    .line 78
    iput-object v0, p0, La/uz0;->i:Ljava/util/List;

    .line 79
    .line 80
    iput-byte v11, p0, La/uz0;->j:B

    .line 81
    .line 82
    invoke-virtual {v1, p0}, La/ouu;->E(La/yje;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    if-ne v1, v10, :cond_4

    .line 87
    .line 88
    :goto_1
    return-object v10

    .line 89
    :cond_4
    :goto_2
    check-cast v1, Ljava/lang/Boolean;

    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_6

    .line 96
    .line 97
    sget v0, La/a01;->M:I

    .line 98
    .line 99
    iget-object v1, v9, La/ocj;->a:La/p7m0;

    .line 100
    .line 101
    :cond_5
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    move-object v2, v0

    .line 109
    check-cast v2, La/hz0;

    .line 110
    .line 111
    new-instance v4, La/k8h0;

    .line 112
    .line 113
    invoke-direct {v4, v12}, La/k8h0;-><init>(Z)V

    .line 114
    .line 115
    .line 116
    const/4 v9, 0x0

    .line 117
    const/16 v10, 0x3fd

    .line 118
    .line 119
    const/4 v3, 0x0

    .line 120
    const/4 v5, 0x0

    .line 121
    const/4 v6, 0x0

    .line 122
    const/4 v7, 0x0

    .line 123
    const/4 v8, 0x0

    .line 124
    invoke-static/range {v2 .. v10}, La/hz0;->a(La/hz0;Ljava/lang/String;La/g9h0;Ljava/lang/String;Ljava/util/List;ZILa/jo20;I)La/hz0;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_5

    .line 133
    .line 134
    goto/16 :goto_3

    .line 135
    .line 136
    :cond_6
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    if-eqz v1, :cond_8

    .line 141
    .line 142
    sget v0, La/a01;->M:I

    .line 143
    .line 144
    iget-object v1, v9, La/ocj;->a:La/p7m0;

    .line 145
    .line 146
    :cond_7
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    move-object v2, v0

    .line 154
    check-cast v2, La/hz0;

    .line 155
    .line 156
    const/4 v9, 0x0

    .line 157
    const/16 v10, 0x3fd

    .line 158
    .line 159
    const/4 v3, 0x0

    .line 160
    sget-object v4, La/g8h0;->a:La/g8h0;

    .line 161
    .line 162
    const/4 v5, 0x0

    .line 163
    const/4 v6, 0x0

    .line 164
    const/4 v7, 0x0

    .line 165
    const/4 v8, 0x0

    .line 166
    invoke-static/range {v2 .. v10}, La/hz0;->a(La/hz0;Ljava/lang/String;La/g9h0;Ljava/lang/String;Ljava/util/List;ZILa/jo20;I)La/hz0;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-eqz v0, :cond_7

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :cond_8
    sget v1, La/a01;->M:I

    .line 178
    .line 179
    iget-boolean v1, p0, La/uz0;->l:Z

    .line 180
    .line 181
    invoke-virtual {v8, v0, v12, v1}, La/a01;->M(Ljava/util/List;ZZ)La/a4x;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    iget-boolean v1, p0, La/uz0;->n:Z

    .line 186
    .line 187
    if-eqz v1, :cond_a

    .line 188
    .line 189
    iget-object v1, v9, La/ocj;->a:La/p7m0;

    .line 190
    .line 191
    :cond_9
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    move-object v3, v2

    .line 199
    check-cast v3, La/hz0;

    .line 200
    .line 201
    new-instance v5, La/e8h0;

    .line 202
    .line 203
    invoke-direct {v5, v0}, La/e8h0;-><init>(La/a4x;)V

    .line 204
    .line 205
    .line 206
    const/4 v10, 0x0

    .line 207
    const/16 v11, 0x3fd

    .line 208
    .line 209
    const/4 v4, 0x0

    .line 210
    const/4 v6, 0x0

    .line 211
    const/4 v7, 0x0

    .line 212
    const/4 v8, 0x0

    .line 213
    const/4 v9, 0x0

    .line 214
    invoke-static/range {v3 .. v11}, La/hz0;->a(La/hz0;Ljava/lang/String;La/g9h0;Ljava/lang/String;Ljava/util/List;ZILa/jo20;I)La/hz0;

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    if-eqz v2, :cond_9

    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_a
    iget-object v1, v9, La/ocj;->a:La/p7m0;

    .line 226
    .line 227
    :cond_b
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    move-object v3, v2

    .line 235
    check-cast v3, La/hz0;

    .line 236
    .line 237
    new-instance v5, La/i8h0;

    .line 238
    .line 239
    invoke-direct {v5, v0}, La/i8h0;-><init>(La/a4x;)V

    .line 240
    .line 241
    .line 242
    const/4 v10, 0x0

    .line 243
    const/16 v11, 0x3dd

    .line 244
    .line 245
    const/4 v4, 0x0

    .line 246
    const/4 v6, 0x0

    .line 247
    const/4 v7, 0x0

    .line 248
    const/4 v8, 0x1

    .line 249
    const/4 v9, 0x0

    .line 250
    invoke-static/range {v3 .. v11}, La/hz0;->a(La/hz0;Ljava/lang/String;La/g9h0;Ljava/lang/String;Ljava/util/List;ZILa/jo20;I)La/hz0;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v2

    .line 258
    if-eqz v2, :cond_b

    .line 259
    .line 260
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 261
    .line 262
    return-object v0
.end method
