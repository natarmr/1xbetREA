.class public final La/jzv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/rzv0;


# direct methods
.method public synthetic constructor <init>(La/rzv0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/jzv0;->a:B

    iput-object p1, p0, La/jzv0;->b:La/rzv0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte p2, p0, La/jzv0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/jzv0;->b:La/rzv0;

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    sget p1, La/rzv0;->D:I

    .line 17
    .line 18
    invoke-virtual {p0}, La/rzv0;->O()V

    .line 19
    .line 20
    .line 21
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_0
    move-object v1, p1

    .line 25
    check-cast v1, Ljava/lang/String;

    .line 26
    .line 27
    iget-object p2, p0, La/i3t0;->f:La/oyg0;

    .line 28
    .line 29
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 30
    .line 31
    sget v0, La/rzv0;->D:I

    .line 32
    .line 33
    iget-object v0, p0, La/rzv0;->w:La/pru;

    .line 34
    .line 35
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iget-boolean v0, v0, La/sff0;->W1:Z

    .line 40
    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    iget-object v8, p1, La/ocj;->a:La/p7m0;

    .line 44
    .line 45
    :cond_1
    invoke-virtual {v8}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-object v0, p0

    .line 53
    check-cast v0, La/bzv0;

    .line 54
    .line 55
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    const/4 v6, 0x0

    .line 59
    const/16 v7, 0x3e

    .line 60
    .line 61
    const/4 v2, 0x0

    .line 62
    const/4 v3, 0x0

    .line 63
    const/4 v4, 0x0

    .line 64
    const/4 v5, 0x0

    .line 65
    invoke-static/range {v0 .. v7}, La/bzv0;->a(La/bzv0;Ljava/lang/String;La/h9p;La/qdt;ZLjava/util/List;ZI)La/bzv0;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {v8, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-eqz p0, :cond_1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    const/4 v2, 0x2

    .line 81
    if-lt v0, v2, :cond_4

    .line 82
    .line 83
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    check-cast p1, La/bzv0;

    .line 88
    .line 89
    iget-boolean p1, p1, La/bzv0;->d:Z

    .line 90
    .line 91
    if-eqz p1, :cond_3

    .line 92
    .line 93
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    check-cast p1, La/bzv0;

    .line 98
    .line 99
    iget-object p1, p1, La/bzv0;->a:Ljava/lang/String;

    .line 100
    .line 101
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-eqz p1, :cond_3

    .line 106
    .line 107
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    check-cast p1, La/bzv0;

    .line 112
    .line 113
    iget-object p1, p1, La/bzv0;->e:Ljava/util/List;

    .line 114
    .line 115
    if-eqz p1, :cond_3

    .line 116
    .line 117
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    check-cast p1, La/bzv0;

    .line 122
    .line 123
    iget-boolean p1, p1, La/bzv0;->f:Z

    .line 124
    .line 125
    if-nez p1, :cond_3

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_3
    invoke-virtual {p0, v1}, La/rzv0;->P(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    goto :goto_0

    .line 132
    :cond_4
    iget-object p0, p0, La/rzv0;->z:La/bby;

    .line 133
    .line 134
    invoke-static {p0}, La/e3c;->n(La/bby;)V

    .line 135
    .line 136
    .line 137
    iget-object v8, p1, La/ocj;->a:La/p7m0;

    .line 138
    .line 139
    :cond_5
    invoke-virtual {v8}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    move-object v0, p0

    .line 147
    check-cast v0, La/bzv0;

    .line 148
    .line 149
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    const/4 v6, 0x0

    .line 153
    const/4 v7, 0x6

    .line 154
    const/4 v2, 0x0

    .line 155
    const/4 v3, 0x0

    .line 156
    const/4 v4, 0x0

    .line 157
    const/4 v5, 0x0

    .line 158
    invoke-static/range {v0 .. v7}, La/bzv0;->a(La/bzv0;Ljava/lang/String;La/h9p;La/qdt;ZLjava/util/List;ZI)La/bzv0;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    invoke-virtual {v8, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result p0

    .line 166
    if-eqz p0, :cond_5

    .line 167
    .line 168
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 169
    .line 170
    return-object p0

    .line 171
    :pswitch_1
    check-cast p1, Ljava/util/List;

    .line 172
    .line 173
    iget-object p2, p0, La/rzv0;->t:La/nn60;

    .line 174
    .line 175
    new-instance v0, Ljava/util/ArrayList;

    .line 176
    .line 177
    const/16 v1, 0xa

    .line 178
    .line 179
    invoke-static {p1, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 180
    .line 181
    .line 182
    move-result v1

    .line 183
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 184
    .line 185
    .line 186
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    if-eqz v2, :cond_6

    .line 195
    .line 196
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    check-cast v2, La/i8p;

    .line 201
    .line 202
    iget-wide v2, v2, La/i8p;->a:J

    .line 203
    .line 204
    invoke-static {v2, v3, v0}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 205
    .line 206
    .line 207
    goto :goto_1

    .line 208
    :cond_6
    new-instance v1, La/xm60;

    .line 209
    .line 210
    invoke-direct {v1, v0}, La/xm60;-><init>(Ljava/util/ArrayList;)V

    .line 211
    .line 212
    .line 213
    const/4 v0, 0x1

    .line 214
    new-array v0, v0, [La/en60;

    .line 215
    .line 216
    const/4 v2, 0x0

    .line 217
    aput-object v1, v0, v2

    .line 218
    .line 219
    invoke-static {p0, p2, v0}, La/i3t0;->B(La/i3t0;La/j3t0;[Ljava/lang/Object;)La/bby;

    .line 220
    .line 221
    .line 222
    iget-object p2, p0, La/i3t0;->i:La/ocj;

    .line 223
    .line 224
    iget-object p2, p2, La/ocj;->a:La/p7m0;

    .line 225
    .line 226
    :cond_7
    invoke-virtual {p2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 234
    .line 235
    move-object v2, v0

    .line 236
    check-cast v2, La/bzv0;

    .line 237
    .line 238
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    new-instance v4, La/e9p;

    .line 242
    .line 243
    invoke-direct {v4, p1}, La/e9p;-><init>(Ljava/util/List;)V

    .line 244
    .line 245
    .line 246
    const/4 v8, 0x0

    .line 247
    const/16 v9, 0x3d

    .line 248
    .line 249
    const/4 v3, 0x0

    .line 250
    const/4 v5, 0x0

    .line 251
    const/4 v6, 0x0

    .line 252
    const/4 v7, 0x0

    .line 253
    invoke-static/range {v2 .. v9}, La/bzv0;->a(La/bzv0;Ljava/lang/String;La/h9p;La/qdt;ZLjava/util/List;ZI)La/bzv0;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    invoke-virtual {p2, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    if-eqz v0, :cond_7

    .line 262
    .line 263
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 264
    .line 265
    return-object p0

    .line 266
    nop

    .line 267
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
