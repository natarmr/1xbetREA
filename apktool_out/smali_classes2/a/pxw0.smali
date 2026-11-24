.class public final La/pxw0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lcom/google/android/gms/measurement/internal/zzr;

.field public final synthetic c:La/oyw0;


# direct methods
.method public synthetic constructor <init>(La/oyw0;Lcom/google/android/gms/measurement/internal/zzr;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/pxw0;->a:B

    iput-object p2, p0, La/pxw0;->b:Lcom/google/android/gms/measurement/internal/zzr;

    iput-object p1, p0, La/pxw0;->c:La/oyw0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget-byte v0, p0, La/pxw0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/pxw0;->b:Lcom/google/android/gms/measurement/internal/zzr;

    .line 4
    .line 5
    iget-object p0, p0, La/pxw0;->c:La/oyw0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/oyw0;->a:La/m6x0;

    .line 11
    .line 12
    invoke-virtual {p0}, La/m6x0;->V()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v1}, La/m6x0;->m0(Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    iget-object p0, p0, La/oyw0;->a:La/m6x0;

    .line 20
    .line 21
    invoke-virtual {p0}, La/m6x0;->V()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, La/m6x0;->J()La/fxw0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, La/fxw0;->m1()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, La/m6x0;->l0()V

    .line 32
    .line 33
    .line 34
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzr;->a:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0}, La/s0x;->E(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v1}, La/m6x0;->m0(Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v1}, La/m6x0;->n0(Lcom/google/android/gms/measurement/internal/zzr;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :pswitch_1
    iget-object p0, p0, La/oyw0;->a:La/m6x0;

    .line 47
    .line 48
    invoke-virtual {p0}, La/m6x0;->V()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, La/m6x0;->J()La/fxw0;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, La/fxw0;->m1()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, La/m6x0;->l0()V

    .line 59
    .line 60
    .line 61
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzr;->a:Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {v0}, La/s0x;->E(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v1}, La/m6x0;->c0(Lcom/google/android/gms/measurement/internal/zzr;)La/hvw0;

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :pswitch_2
    iget-object p0, p0, La/oyw0;->a:La/m6x0;

    .line 71
    .line 72
    invoke-virtual {p0}, La/m6x0;->V()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, La/m6x0;->J()La/fxw0;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v0}, La/fxw0;->m1()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, La/m6x0;->l0()V

    .line 83
    .line 84
    .line 85
    invoke-static {v1}, La/s0x;->H(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    iget-object v0, v1, Lcom/google/android/gms/measurement/internal/zzr;->a:Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {v0}, La/s0x;->E(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, La/m6x0;->e0()La/bkw0;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    sget-object v3, La/btw0;->y0:La/atw0;

    .line 98
    .line 99
    const/4 v4, 0x0

    .line 100
    invoke-virtual {v2, v4, v3}, La/bkw0;->x1(Ljava/lang/String;La/atw0;)Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    const/4 v3, 0x0

    .line 105
    if-eqz v2, :cond_0

    .line 106
    .line 107
    invoke-virtual {p0}, La/m6x0;->S()La/lwf;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 115
    .line 116
    .line 117
    move-result-wide v5

    .line 118
    invoke-virtual {p0}, La/m6x0;->e0()La/bkw0;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    sget-object v7, La/btw0;->h0:La/atw0;

    .line 123
    .line 124
    invoke-virtual {v2, v4, v7}, La/bkw0;->v1(Ljava/lang/String;La/atw0;)I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    invoke-virtual {p0}, La/m6x0;->e0()La/bkw0;

    .line 129
    .line 130
    .line 131
    sget-object v7, La/btw0;->e:La/atw0;

    .line 132
    .line 133
    invoke-virtual {v7, v4}, La/atw0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    check-cast v7, Ljava/lang/Long;

    .line 138
    .line 139
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 140
    .line 141
    .line 142
    move-result-wide v7

    .line 143
    sub-long/2addr v5, v7

    .line 144
    :goto_0
    if-ge v3, v2, :cond_1

    .line 145
    .line 146
    invoke-virtual {p0, v5, v6, v4}, La/m6x0;->F(JLjava/lang/String;)Z

    .line 147
    .line 148
    .line 149
    move-result v7

    .line 150
    if-eqz v7, :cond_1

    .line 151
    .line 152
    add-int/lit8 v3, v3, 0x1

    .line 153
    .line 154
    goto :goto_0

    .line 155
    :cond_0
    invoke-virtual {p0}, La/m6x0;->e0()La/bkw0;

    .line 156
    .line 157
    .line 158
    sget-object v2, La/btw0;->l:La/atw0;

    .line 159
    .line 160
    invoke-virtual {v2, v4}, La/atw0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v2

    .line 164
    check-cast v2, Ljava/lang/Integer;

    .line 165
    .line 166
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 167
    .line 168
    .line 169
    move-result v2

    .line 170
    int-to-long v5, v2

    .line 171
    :goto_1
    int-to-long v7, v3

    .line 172
    cmp-long v2, v7, v5

    .line 173
    .line 174
    if-gez v2, :cond_1

    .line 175
    .line 176
    const-wide/16 v7, 0x0

    .line 177
    .line 178
    invoke-virtual {p0, v7, v8, v0}, La/m6x0;->F(JLjava/lang/String;)Z

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    if-eqz v2, :cond_1

    .line 183
    .line 184
    add-int/lit8 v3, v3, 0x1

    .line 185
    .line 186
    goto :goto_1

    .line 187
    :cond_1
    invoke-virtual {p0}, La/m6x0;->e0()La/bkw0;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    sget-object v3, La/btw0;->z0:La/atw0;

    .line 192
    .line 193
    invoke-virtual {v2, v4, v3}, La/bkw0;->x1(Ljava/lang/String;La/atw0;)Z

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    if-eqz v2, :cond_2

    .line 198
    .line 199
    invoke-virtual {p0}, La/m6x0;->J()La/fxw0;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    invoke-virtual {v2}, La/fxw0;->m1()V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p0}, La/m6x0;->E()V

    .line 207
    .line 208
    .line 209
    :cond_2
    iget-object v2, p0, La/m6x0;->j:La/x5x0;

    .line 210
    .line 211
    iget v1, v1, Lcom/google/android/gms/measurement/internal/zzr;->f1:I

    .line 212
    .line 213
    invoke-static {v1}, La/esw0;->g(I)I

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    invoke-virtual {v2}, La/p4;->m1()V

    .line 218
    .line 219
    .line 220
    const/4 v3, 0x2

    .line 221
    if-ne v1, v3, :cond_3

    .line 222
    .line 223
    invoke-static {v0}, La/x5x0;->p1(Ljava/lang/String;)Z

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    if-nez v1, :cond_3

    .line 228
    .line 229
    iget-object v1, v2, La/k5x0;->c:La/m6x0;

    .line 230
    .line 231
    iget-object v1, v1, La/m6x0;->a:La/uww0;

    .line 232
    .line 233
    invoke-static {v1}, La/m6x0;->T(La/u5x0;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v1, v0}, La/uww0;->y1(Ljava/lang/String;)La/duw0;

    .line 237
    .line 238
    .line 239
    move-result-object v1

    .line 240
    if-eqz v1, :cond_3

    .line 241
    .line 242
    invoke-virtual {v1}, La/duw0;->F()Z

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    if-eqz v2, :cond_3

    .line 247
    .line 248
    invoke-virtual {v1}, La/duw0;->G()La/wuw0;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    invoke-virtual {v1}, La/wuw0;->s()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 257
    .line 258
    .line 259
    move-result v1

    .line 260
    if-nez v1, :cond_3

    .line 261
    .line 262
    invoke-virtual {p0}, La/m6x0;->r()La/uuw0;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    iget-object v1, v1, La/uuw0;->o:La/quw0;

    .line 267
    .line 268
    const-string v2, "[sgtm] Going background, trigger client side upload. appId"

    .line 269
    .line 270
    invoke-virtual {v1, v0, v2}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {p0}, La/m6x0;->S()La/lwf;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 281
    .line 282
    .line 283
    move-result-wide v1

    .line 284
    invoke-virtual {p0, v1, v2, v0}, La/m6x0;->m(JLjava/lang/String;)V

    .line 285
    .line 286
    .line 287
    :cond_3
    return-void

    .line 288
    nop

    .line 289
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
