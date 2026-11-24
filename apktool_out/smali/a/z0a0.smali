.class public final La/z0a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ky90;
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public final synthetic a:Landroidx/media3/ui/PlayerControlView;


# direct methods
.method public constructor <init>(Landroidx/media3/ui/PlayerControlView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/z0a0;->a:Landroidx/media3/ui/PlayerControlView;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final h(La/jy90;)V
    .locals 4

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x5

    .line 3
    const/16 v2, 0xd

    .line 4
    .line 5
    filled-new-array {v0, v1, v2}, [I

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    invoke-virtual {p1, v3}, La/jy90;->a([I)Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    iget-object p0, p0, La/z0a0;->a:Landroidx/media3/ui/PlayerControlView;

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    sget-object v3, Landroidx/media3/ui/PlayerControlView;->i2:[F

    .line 18
    .line 19
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->q()V

    .line 20
    .line 21
    .line 22
    :cond_0
    const/4 v3, 0x7

    .line 23
    filled-new-array {v0, v1, v3, v2}, [I

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p1, v0}, La/jy90;->a([I)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    sget-object v0, Landroidx/media3/ui/PlayerControlView;->i2:[F

    .line 34
    .line 35
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->s()V

    .line 36
    .line 37
    .line 38
    :cond_1
    const/16 v0, 0x8

    .line 39
    .line 40
    filled-new-array {v0, v2}, [I

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {p1, v0}, La/jy90;->a([I)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    sget-object v0, Landroidx/media3/ui/PlayerControlView;->i2:[F

    .line 51
    .line 52
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->t()V

    .line 53
    .line 54
    .line 55
    :cond_2
    const/16 v0, 0x9

    .line 56
    .line 57
    filled-new-array {v0, v2}, [I

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {p1, v0}, La/jy90;->a([I)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    sget-object v0, Landroidx/media3/ui/PlayerControlView;->i2:[F

    .line 68
    .line 69
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->v()V

    .line 70
    .line 71
    .line 72
    :cond_3
    new-array v0, v3, [I

    .line 73
    .line 74
    fill-array-data v0, :array_0

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1, v0}, La/jy90;->a([I)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_4

    .line 82
    .line 83
    sget-object v0, Landroidx/media3/ui/PlayerControlView;->i2:[F

    .line 84
    .line 85
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->p()V

    .line 86
    .line 87
    .line 88
    :cond_4
    const/16 v0, 0xb

    .line 89
    .line 90
    const/4 v1, 0x0

    .line 91
    filled-new-array {v0, v1, v2}, [I

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {p1, v0}, La/jy90;->a([I)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_5

    .line 100
    .line 101
    sget-object v0, Landroidx/media3/ui/PlayerControlView;->i2:[F

    .line 102
    .line 103
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->w()V

    .line 104
    .line 105
    .line 106
    :cond_5
    const/16 v0, 0xc

    .line 107
    .line 108
    filled-new-array {v0, v2}, [I

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {p1, v0}, La/jy90;->a([I)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_6

    .line 117
    .line 118
    sget-object v0, Landroidx/media3/ui/PlayerControlView;->i2:[F

    .line 119
    .line 120
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->r()V

    .line 121
    .line 122
    .line 123
    :cond_6
    const/4 v0, 0x2

    .line 124
    filled-new-array {v0, v2}, [I

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {p1, v0}, La/jy90;->a([I)Z

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    if-eqz p1, :cond_7

    .line 133
    .line 134
    sget-object p1, Landroidx/media3/ui/PlayerControlView;->i2:[F

    .line 135
    .line 136
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->x()V

    .line 137
    .line 138
    .line 139
    :cond_7
    return-void

    .line 140
    nop

    .line 141
    :array_0
    .array-data 4
        0x8
        0x9
        0xb
        0x0
        0x10
        0x11
        0xd
    .end array-data
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 13

    .line 1
    iget-object p0, p0, La/z0a0;->a:Landroidx/media3/ui/PlayerControlView;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->g1:Landroid/widget/ImageView;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->l1:Landroid/view/View;

    .line 6
    .line 7
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->k1:Landroid/view/View;

    .line 8
    .line 9
    iget-object v3, p0, Landroidx/media3/ui/PlayerControlView;->j1:Landroid/view/View;

    .line 10
    .line 11
    iget-object v4, p0, Landroidx/media3/ui/PlayerControlView;->a:La/n1a0;

    .line 12
    .line 13
    iget-object v5, p0, Landroidx/media3/ui/PlayerControlView;->Q1:La/my90;

    .line 14
    .line 15
    if-nez v5, :cond_0

    .line 16
    .line 17
    goto/16 :goto_3

    .line 18
    .line 19
    :cond_0
    invoke-virtual {v4}, La/n1a0;->g()V

    .line 20
    .line 21
    .line 22
    iget-object v6, p0, Landroidx/media3/ui/PlayerControlView;->u:Landroid/widget/ImageView;

    .line 23
    .line 24
    const/16 v7, 0x9

    .line 25
    .line 26
    if-ne v6, p1, :cond_1

    .line 27
    .line 28
    check-cast v5, La/ulo;

    .line 29
    .line 30
    invoke-virtual {v5, v7}, La/ulo;->w(I)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_13

    .line 35
    .line 36
    invoke-virtual {v5}, La/ulo;->K()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    iget-object v6, p0, Landroidx/media3/ui/PlayerControlView;->t:Landroid/widget/ImageView;

    .line 41
    .line 42
    if-ne v6, p1, :cond_2

    .line 43
    .line 44
    check-cast v5, La/ulo;

    .line 45
    .line 46
    const/4 p0, 0x7

    .line 47
    invoke-virtual {v5, p0}, La/ulo;->w(I)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-eqz p0, :cond_13

    .line 52
    .line 53
    invoke-virtual {v5}, La/ulo;->L()V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_2
    iget-object v6, p0, Landroidx/media3/ui/PlayerControlView;->w:Landroid/view/View;

    .line 58
    .line 59
    const-wide/16 v8, 0x0

    .line 60
    .line 61
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    const/16 v12, 0xc

    .line 67
    .line 68
    if-ne v6, p1, :cond_4

    .line 69
    .line 70
    check-cast v5, La/ulo;

    .line 71
    .line 72
    invoke-virtual {v5}, La/ulo;->s()I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    const/4 p1, 0x4

    .line 77
    if-eq p0, p1, :cond_13

    .line 78
    .line 79
    invoke-virtual {v5, v12}, La/ulo;->w(I)Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    if-eqz p0, :cond_13

    .line 84
    .line 85
    invoke-virtual {v5}, La/ulo;->c0()V

    .line 86
    .line 87
    .line 88
    iget-short p0, v5, La/ulo;->k0:S

    .line 89
    .line 90
    int-to-long p0, p0

    .line 91
    invoke-virtual {v5}, La/ulo;->l()J

    .line 92
    .line 93
    .line 94
    move-result-wide v0

    .line 95
    add-long/2addr v0, p0

    .line 96
    invoke-virtual {v5}, La/ulo;->q()J

    .line 97
    .line 98
    .line 99
    move-result-wide p0

    .line 100
    cmp-long v2, p0, v10

    .line 101
    .line 102
    if-eqz v2, :cond_3

    .line 103
    .line 104
    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->min(JJ)J

    .line 105
    .line 106
    .line 107
    move-result-wide v0

    .line 108
    :cond_3
    invoke-static {v0, v1, v8, v9}, Ljava/lang/Math;->max(JJ)J

    .line 109
    .line 110
    .line 111
    move-result-wide p0

    .line 112
    invoke-virtual {v5, p0, p1}, La/ulo;->J(J)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :cond_4
    iget-object v6, p0, Landroidx/media3/ui/PlayerControlView;->x:Landroid/view/View;

    .line 117
    .line 118
    if-ne v6, p1, :cond_6

    .line 119
    .line 120
    check-cast v5, La/ulo;

    .line 121
    .line 122
    const/16 p0, 0xb

    .line 123
    .line 124
    invoke-virtual {v5, p0}, La/ulo;->w(I)Z

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    if-eqz p0, :cond_13

    .line 129
    .line 130
    invoke-virtual {v5}, La/ulo;->c0()V

    .line 131
    .line 132
    .line 133
    iget-short p0, v5, La/ulo;->j0:S

    .line 134
    .line 135
    int-to-long p0, p0

    .line 136
    neg-long p0, p0

    .line 137
    invoke-virtual {v5}, La/ulo;->l()J

    .line 138
    .line 139
    .line 140
    move-result-wide v0

    .line 141
    add-long/2addr v0, p0

    .line 142
    invoke-virtual {v5}, La/ulo;->q()J

    .line 143
    .line 144
    .line 145
    move-result-wide p0

    .line 146
    cmp-long v2, p0, v10

    .line 147
    .line 148
    if-eqz v2, :cond_5

    .line 149
    .line 150
    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->min(JJ)J

    .line 151
    .line 152
    .line 153
    move-result-wide v0

    .line 154
    :cond_5
    invoke-static {v0, v1, v8, v9}, Ljava/lang/Math;->max(JJ)J

    .line 155
    .line 156
    .line 157
    move-result-wide p0

    .line 158
    invoke-virtual {v5, p0, p1}, La/ulo;->J(J)V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :cond_6
    iget-object v6, p0, Landroidx/media3/ui/PlayerControlView;->v:Landroid/widget/ImageView;

    .line 163
    .line 164
    const/4 v8, 0x0

    .line 165
    const/4 v9, 0x1

    .line 166
    if-ne v6, p1, :cond_8

    .line 167
    .line 168
    iget-boolean p0, p0, Landroidx/media3/ui/PlayerControlView;->V1:Z

    .line 169
    .line 170
    invoke-static {v5, p0}, La/vtt0;->V(La/my90;Z)Z

    .line 171
    .line 172
    .line 173
    move-result p0

    .line 174
    if-eqz p0, :cond_7

    .line 175
    .line 176
    invoke-static {v5}, La/vtt0;->E(La/my90;)Z

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :cond_7
    check-cast v5, La/ulo;

    .line 181
    .line 182
    invoke-virtual {v5, v9}, La/ulo;->w(I)Z

    .line 183
    .line 184
    .line 185
    move-result p0

    .line 186
    if-eqz p0, :cond_13

    .line 187
    .line 188
    invoke-virtual {v5, v8}, La/ulo;->P(Z)V

    .line 189
    .line 190
    .line 191
    return-void

    .line 192
    :cond_8
    iget-object v6, p0, Landroidx/media3/ui/PlayerControlView;->A:Landroid/widget/ImageView;

    .line 193
    .line 194
    if-ne v6, p1, :cond_e

    .line 195
    .line 196
    check-cast v5, La/ulo;

    .line 197
    .line 198
    const/16 p1, 0xf

    .line 199
    .line 200
    invoke-virtual {v5, p1}, La/ulo;->w(I)Z

    .line 201
    .line 202
    .line 203
    move-result p1

    .line 204
    if-eqz p1, :cond_13

    .line 205
    .line 206
    invoke-virtual {v5}, La/ulo;->c0()V

    .line 207
    .line 208
    .line 209
    iget p1, v5, La/ulo;->H:I

    .line 210
    .line 211
    iget p0, p0, Landroidx/media3/ui/PlayerControlView;->b2:I

    .line 212
    .line 213
    move v0, v9

    .line 214
    :goto_0
    const/4 v1, 0x2

    .line 215
    if-gt v0, v1, :cond_d

    .line 216
    .line 217
    add-int v2, p1, v0

    .line 218
    .line 219
    rem-int/lit8 v2, v2, 0x3

    .line 220
    .line 221
    if-eqz v2, :cond_c

    .line 222
    .line 223
    if-eq v2, v9, :cond_a

    .line 224
    .line 225
    if-eq v2, v1, :cond_9

    .line 226
    .line 227
    goto :goto_1

    .line 228
    :cond_9
    and-int/lit8 v1, p0, 0x2

    .line 229
    .line 230
    if-eqz v1, :cond_b

    .line 231
    .line 232
    goto :goto_2

    .line 233
    :cond_a
    and-int/lit8 v1, p0, 0x1

    .line 234
    .line 235
    if-eqz v1, :cond_b

    .line 236
    .line 237
    goto :goto_2

    .line 238
    :cond_b
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 239
    .line 240
    goto :goto_0

    .line 241
    :cond_c
    :goto_2
    move p1, v2

    .line 242
    :cond_d
    invoke-virtual {v5, p1}, La/ulo;->Q(I)V

    .line 243
    .line 244
    .line 245
    return-void

    .line 246
    :cond_e
    iget-object v6, p0, Landroidx/media3/ui/PlayerControlView;->B:Landroid/widget/ImageView;

    .line 247
    .line 248
    if-ne v6, p1, :cond_f

    .line 249
    .line 250
    check-cast v5, La/ulo;

    .line 251
    .line 252
    const/16 p0, 0xe

    .line 253
    .line 254
    invoke-virtual {v5, p0}, La/ulo;->w(I)Z

    .line 255
    .line 256
    .line 257
    move-result p0

    .line 258
    if-eqz p0, :cond_13

    .line 259
    .line 260
    invoke-virtual {v5}, La/ulo;->c0()V

    .line 261
    .line 262
    .line 263
    iget-boolean p0, v5, La/ulo;->I:Z

    .line 264
    .line 265
    xor-int/2addr p0, v9

    .line 266
    iget-object p1, v5, La/ulo;->m:La/vg00;

    .line 267
    .line 268
    invoke-virtual {v5}, La/ulo;->c0()V

    .line 269
    .line 270
    .line 271
    iget-boolean v0, v5, La/ulo;->I:Z

    .line 272
    .line 273
    if-eq v0, p0, :cond_13

    .line 274
    .line 275
    iput-boolean p0, v5, La/ulo;->I:Z

    .line 276
    .line 277
    iget-object v0, v5, La/ulo;->l:La/dmo;

    .line 278
    .line 279
    iget-object v0, v0, La/dmo;->g:La/q9o0;

    .line 280
    .line 281
    invoke-virtual {v0, v12, p0, v8}, La/q9o0;->b(III)La/p9o0;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    invoke-virtual {v0}, La/p9o0;->b()V

    .line 286
    .line 287
    .line 288
    new-instance v0, La/mlo;

    .line 289
    .line 290
    invoke-direct {v0, v8, p0}, La/mlo;-><init>(BZ)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {p1, v7, v0}, La/vg00;->c(ILa/sg00;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {v5}, La/ulo;->Y()V

    .line 297
    .line 298
    .line 299
    invoke-virtual {p1}, La/vg00;->b()V

    .line 300
    .line 301
    .line 302
    return-void

    .line 303
    :cond_f
    if-ne v3, p1, :cond_10

    .line 304
    .line 305
    invoke-virtual {v4}, La/n1a0;->f()V

    .line 306
    .line 307
    .line 308
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView;->m:La/e1a0;

    .line 309
    .line 310
    invoke-virtual {p0, p1, v3}, Landroidx/media3/ui/PlayerControlView;->d(La/yge0;Landroid/view/View;)V

    .line 311
    .line 312
    .line 313
    return-void

    .line 314
    :cond_10
    if-ne v2, p1, :cond_11

    .line 315
    .line 316
    invoke-virtual {v4}, La/n1a0;->f()V

    .line 317
    .line 318
    .line 319
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView;->n:La/b1a0;

    .line 320
    .line 321
    invoke-virtual {p0, p1, v2}, Landroidx/media3/ui/PlayerControlView;->d(La/yge0;Landroid/view/View;)V

    .line 322
    .line 323
    .line 324
    return-void

    .line 325
    :cond_11
    if-ne v1, p1, :cond_12

    .line 326
    .line 327
    invoke-virtual {v4}, La/n1a0;->f()V

    .line 328
    .line 329
    .line 330
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView;->p:La/y0a0;

    .line 331
    .line 332
    invoke-virtual {p0, p1, v1}, Landroidx/media3/ui/PlayerControlView;->d(La/yge0;Landroid/view/View;)V

    .line 333
    .line 334
    .line 335
    return-void

    .line 336
    :cond_12
    if-ne v0, p1, :cond_13

    .line 337
    .line 338
    invoke-virtual {v4}, La/n1a0;->f()V

    .line 339
    .line 340
    .line 341
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView;->o:La/y0a0;

    .line 342
    .line 343
    invoke-virtual {p0, p1, v0}, Landroidx/media3/ui/PlayerControlView;->d(La/yge0;Landroid/view/View;)V

    .line 344
    .line 345
    .line 346
    :cond_13
    :goto_3
    return-void
.end method

.method public final onDismiss()V
    .locals 1

    .line 1
    iget-object p0, p0, La/z0a0;->a:Landroidx/media3/ui/PlayerControlView;

    .line 2
    .line 3
    iget-boolean v0, p0, Landroidx/media3/ui/PlayerControlView;->h2:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->a:La/n1a0;

    .line 8
    .line 9
    invoke-virtual {p0}, La/n1a0;->g()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method
