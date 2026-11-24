.class public final La/ciu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final b:La/pzu;


# direct methods
.method public synthetic constructor <init>(La/pzu;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ciu;->a:B

    iput-object p1, p0, La/ciu;->b:La/pzu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/zje;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/ciu;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/ciu;->b:La/pzu;

    .line 5
    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    const/high16 v5, -0x80000000

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    instance-of v0, p1, La/itu;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    move-object v0, p1

    .line 20
    check-cast v0, La/itu;

    .line 21
    .line 22
    iget v7, v0, La/itu;->k:I

    .line 23
    .line 24
    and-int v8, v7, v5

    .line 25
    .line 26
    if-eqz v8, :cond_0

    .line 27
    .line 28
    sub-int/2addr v7, v5

    .line 29
    iput v7, v0, La/itu;->k:I

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance v0, La/itu;

    .line 33
    .line 34
    invoke-direct {v0, p0, p1}, La/itu;-><init>(La/ciu;La/zje;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    iget-object p0, v0, La/itu;->i:Ljava/lang/Object;

    .line 38
    .line 39
    sget-object p1, La/wne;->a:La/wne;

    .line 40
    .line 41
    iget v5, v0, La/itu;->k:I

    .line 42
    .line 43
    if-eqz v5, :cond_2

    .line 44
    .line 45
    if-ne v5, v4, :cond_1

    .line 46
    .line 47
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iput v4, v0, La/itu;->k:I

    .line 59
    .line 60
    invoke-virtual {v2, v0}, La/pzu;->E(La/zje;)Ljava/io/Serializable;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    if-ne p0, p1, :cond_3

    .line 65
    .line 66
    move-object v6, p1

    .line 67
    goto :goto_2

    .line 68
    :cond_3
    :goto_1
    check-cast p0, Ljava/lang/Iterable;

    .line 69
    .line 70
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-eqz p1, :cond_5

    .line 79
    .line 80
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    move-object v0, p1

    .line 85
    check-cast v0, La/h85;

    .line 86
    .line 87
    iget-object v0, v0, La/h85;->b:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 88
    .line 89
    sget-object v2, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->m:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 90
    .line 91
    if-ne v0, v2, :cond_4

    .line 92
    .line 93
    move-object v6, p1

    .line 94
    :cond_5
    if-eqz v6, :cond_6

    .line 95
    .line 96
    move v1, v4

    .line 97
    :cond_6
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    :goto_2
    return-object v6

    .line 102
    :pswitch_0
    iget-object v0, v2, La/pzu;->b:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, La/dzz;

    .line 105
    .line 106
    instance-of v7, p1, La/xhu;

    .line 107
    .line 108
    if-eqz v7, :cond_7

    .line 109
    .line 110
    move-object v7, p1

    .line 111
    check-cast v7, La/xhu;

    .line 112
    .line 113
    iget v8, v7, La/xhu;->k:I

    .line 114
    .line 115
    and-int v9, v8, v5

    .line 116
    .line 117
    if-eqz v9, :cond_7

    .line 118
    .line 119
    sub-int/2addr v8, v5

    .line 120
    iput v8, v7, La/xhu;->k:I

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_7
    new-instance v7, La/xhu;

    .line 124
    .line 125
    invoke-direct {v7, p0, p1}, La/xhu;-><init>(La/ciu;La/zje;)V

    .line 126
    .line 127
    .line 128
    :goto_3
    iget-object p0, v7, La/xhu;->i:Ljava/lang/Object;

    .line 129
    .line 130
    sget-object p1, La/wne;->a:La/wne;

    .line 131
    .line 132
    iget v5, v7, La/xhu;->k:I

    .line 133
    .line 134
    if-eqz v5, :cond_9

    .line 135
    .line 136
    if-ne v5, v4, :cond_8

    .line 137
    .line 138
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_8
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    goto/16 :goto_6

    .line 146
    .line 147
    :cond_9
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    iput v4, v7, La/xhu;->k:I

    .line 151
    .line 152
    invoke-virtual {v2, v7}, La/pzu;->K(La/zje;)Ljava/io/Serializable;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    if-ne p0, p1, :cond_a

    .line 157
    .line 158
    move-object v6, p1

    .line 159
    goto :goto_6

    .line 160
    :cond_a
    :goto_4
    move-object p1, p0

    .line 161
    check-cast p1, Ljava/util/List;

    .line 162
    .line 163
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    :cond_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    if-eqz v3, :cond_c

    .line 172
    .line 173
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    move-object v5, v3

    .line 178
    check-cast v5, La/kzz;

    .line 179
    .line 180
    iget-object v7, v5, La/kzz;->a:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 181
    .line 182
    sget-object v8, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->o:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 183
    .line 184
    if-ne v7, v8, :cond_b

    .line 185
    .line 186
    iget-object v5, v5, La/kzz;->h:La/prz;

    .line 187
    .line 188
    sget-object v7, La/prz;->c:La/prz;

    .line 189
    .line 190
    if-ne v5, v7, :cond_b

    .line 191
    .line 192
    goto :goto_5

    .line 193
    :cond_c
    move-object v3, v6

    .line 194
    :goto_5
    check-cast v3, La/kzz;

    .line 195
    .line 196
    if-eqz v3, :cond_d

    .line 197
    .line 198
    sget-object v2, La/wen;->b:La/uen;

    .line 199
    .line 200
    iget-wide v2, v3, La/kzz;->g:J

    .line 201
    .line 202
    sget-object v5, La/bfn;->f:La/bfn;

    .line 203
    .line 204
    invoke-static {v2, v3, v5}, La/ibc;->w0(JLa/bfn;)J

    .line 205
    .line 206
    .line 207
    move-result-wide v2

    .line 208
    invoke-static {v2, v3}, La/wen;->e(J)J

    .line 209
    .line 210
    .line 211
    move-result-wide v2

    .line 212
    iput-wide v2, v0, La/dzz;->c:J

    .line 213
    .line 214
    :cond_d
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    :cond_e
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    if-eqz v2, :cond_10

    .line 223
    .line 224
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    move-object v3, v2

    .line 229
    check-cast v3, La/kzz;

    .line 230
    .line 231
    iget-object v5, v3, La/kzz;->a:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 232
    .line 233
    sget-object v7, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->j:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 234
    .line 235
    if-eq v5, v7, :cond_f

    .line 236
    .line 237
    sget-object v7, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->k:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 238
    .line 239
    if-eq v5, v7, :cond_f

    .line 240
    .line 241
    sget-object v7, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->l:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 242
    .line 243
    if-ne v5, v7, :cond_e

    .line 244
    .line 245
    :cond_f
    iget-object v5, v3, La/kzz;->h:La/prz;

    .line 246
    .line 247
    sget-object v7, La/prz;->d:La/prz;

    .line 248
    .line 249
    if-ne v5, v7, :cond_e

    .line 250
    .line 251
    iget-boolean v3, v3, La/kzz;->d:Z

    .line 252
    .line 253
    if-eqz v3, :cond_e

    .line 254
    .line 255
    move-object v6, v2

    .line 256
    :cond_10
    if-eqz v6, :cond_11

    .line 257
    .line 258
    move v1, v4

    .line 259
    :cond_11
    iput-boolean v1, v0, La/dzz;->b:Z

    .line 260
    .line 261
    move-object v6, p0

    .line 262
    :goto_6
    return-object v6

    .line 263
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
