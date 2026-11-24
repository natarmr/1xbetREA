.class public final La/huj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/iuo;


# static fields
.field public static final e:[I

.field public static final f:La/iqi;

.field public static final g:La/iqi;


# instance fields
.field public a:La/rcf0;

.field public b:La/kwd;

.field public c:Z

.field public d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/16 v0, 0x15

    .line 2
    .line 3
    new-array v0, v0, [I

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, La/huj;->e:[I

    .line 9
    .line 10
    new-instance v0, La/iqi;

    .line 11
    .line 12
    new-instance v1, La/csj;

    .line 13
    .line 14
    const/16 v2, 0x18

    .line 15
    .line 16
    invoke-direct {v1, v2}, La/csj;-><init>(B)V

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v1}, La/iqi;-><init>(La/csj;)V

    .line 20
    .line 21
    .line 22
    sput-object v0, La/huj;->f:La/iqi;

    .line 23
    .line 24
    new-instance v0, La/iqi;

    .line 25
    .line 26
    new-instance v1, La/csj;

    .line 27
    .line 28
    const/16 v2, 0x19

    .line 29
    .line 30
    invoke-direct {v1, v2}, La/csj;-><init>(B)V

    .line 31
    .line 32
    .line 33
    invoke-direct {v0, v1}, La/iqi;-><init>(La/csj;)V

    .line 34
    .line 35
    .line 36
    sput-object v0, La/huj;->g:La/iqi;

    .line 37
    .line 38
    return-void

    .line 39
    :array_0
    .array-data 4
        0x5
        0x4
        0xc
        0x8
        0x3
        0xa
        0x9
        0xb
        0x6
        0x2
        0x0
        0x1
        0x7
        0x10
        0xf
        0xe
        0x11
        0x12
        0x13
        0x14
        0x15
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/kwd;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/huj;->b:La/kwd;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(ILjava/util/ArrayList;)V
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    goto :goto_0

    .line 7
    :pswitch_1
    new-instance p0, La/ga5;

    .line 8
    .line 9
    invoke-direct {p0, v1}, La/ga5;-><init>(B)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_2
    new-instance p1, La/xuv;

    .line 17
    .line 18
    iget-boolean p0, p0, La/huj;->d:Z

    .line 19
    .line 20
    invoke-direct {p1, p0, v1}, La/xuv;-><init>(IB)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_3
    new-instance p0, La/ab8;

    .line 28
    .line 29
    invoke-direct {p0, v1}, La/ab8;-><init>(B)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_4
    new-instance p0, La/ga5;

    .line 37
    .line 38
    invoke-direct {p0, v0}, La/ga5;-><init>(B)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_5
    new-instance p0, La/ab8;

    .line 46
    .line 47
    invoke-direct {p0, v0}, La/ab8;-><init>(B)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_6
    new-instance p1, La/da5;

    .line 55
    .line 56
    iget-object p0, p0, La/huj;->b:La/kwd;

    .line 57
    .line 58
    invoke-direct {p1, v1, p0}, La/da5;-><init>(ILa/kwd;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_7
    sget-object p0, La/huj;->g:La/iqi;

    .line 66
    .line 67
    new-array p1, v1, [Ljava/lang/Object;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/iqi;->b([Ljava/lang/Object;)La/fuo;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    if-eqz p0, :cond_0

    .line 74
    .line 75
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    :cond_0
    :goto_0
    return-void

    .line 79
    :pswitch_8
    new-instance p1, La/xuv;

    .line 80
    .line 81
    iget-boolean p0, p0, La/huj;->c:Z

    .line 82
    .line 83
    invoke-direct {p1, p0, v0}, La/xuv;-><init>(IB)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :pswitch_9
    new-instance p0, La/a1v0;

    .line 91
    .line 92
    invoke-direct {p0}, La/a1v0;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :pswitch_a
    iget-object p1, p0, La/huj;->a:La/rcf0;

    .line 100
    .line 101
    if-nez p1, :cond_1

    .line 102
    .line 103
    sget-object p1, La/b4x;->b:La/v3x;

    .line 104
    .line 105
    sget-object p1, La/rcf0;->e:La/rcf0;

    .line 106
    .line 107
    iput-object p1, p0, La/huj;->a:La/rcf0;

    .line 108
    .line 109
    :cond_1
    new-instance v2, La/xrs0;

    .line 110
    .line 111
    iget-object v5, p0, La/huj;->b:La/kwd;

    .line 112
    .line 113
    new-instance v6, La/coq0;

    .line 114
    .line 115
    const-wide/16 v3, 0x0

    .line 116
    .line 117
    invoke-direct {v6, v3, v4}, La/coq0;-><init>(J)V

    .line 118
    .line 119
    .line 120
    new-instance v7, La/tyj;

    .line 121
    .line 122
    iget-object p0, p0, La/huj;->a:La/rcf0;

    .line 123
    .line 124
    invoke-direct {v7, v1, p0}, La/tyj;-><init>(ILjava/util/List;)V

    .line 125
    .line 126
    .line 127
    const/4 v3, 0x1

    .line 128
    const/4 v4, 0x0

    .line 129
    invoke-direct/range {v2 .. v7}, La/xrs0;-><init>(IILa/jfn0;La/coq0;La/tyj;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :pswitch_b
    new-instance p0, La/n7d0;

    .line 137
    .line 138
    invoke-direct {p0}, La/n7d0;-><init>()V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :pswitch_c
    new-instance p0, La/bf60;

    .line 146
    .line 147
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :pswitch_d
    new-instance p1, La/x6r;

    .line 155
    .line 156
    iget-object v0, p0, La/huj;->b:La/kwd;

    .line 157
    .line 158
    sget-object v1, La/b4x;->b:La/v3x;

    .line 159
    .line 160
    sget-object v1, La/rcf0;->e:La/rcf0;

    .line 161
    .line 162
    const/16 v2, 0x2c0

    .line 163
    .line 164
    const/4 v3, 0x0

    .line 165
    invoke-direct {p1, v0, v2, v3, v1}, La/x6r;-><init>(La/jfn0;ILa/coq0;Ljava/util/List;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    new-instance p1, La/iv40;

    .line 172
    .line 173
    iget-object p0, p0, La/huj;->b:La/kwd;

    .line 174
    .line 175
    const/16 v0, 0xa0

    .line 176
    .line 177
    invoke-direct {p1, p0, v0}, La/iv40;-><init>(La/jfn0;I)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    return-void

    .line 184
    :pswitch_e
    new-instance p0, La/av40;

    .line 185
    .line 186
    invoke-direct {p0, v1}, La/av40;-><init>(I)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    return-void

    .line 193
    :pswitch_f
    new-instance p1, La/cj30;

    .line 194
    .line 195
    iget-object p0, p0, La/huj;->b:La/kwd;

    .line 196
    .line 197
    invoke-direct {p1, p0, v1}, La/cj30;-><init>(La/jfn0;I)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    return-void

    .line 204
    :pswitch_10
    new-instance p0, La/gpq;

    .line 205
    .line 206
    invoke-direct {p0}, La/gpq;-><init>()V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    return-void

    .line 213
    :pswitch_11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    sget-object p1, La/huj;->f:La/iqi;

    .line 222
    .line 223
    invoke-virtual {p1, p0}, La/iqi;->b([Ljava/lang/Object;)La/fuo;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    if-eqz p0, :cond_2

    .line 228
    .line 229
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    return-void

    .line 233
    :cond_2
    new-instance p0, La/yiq;

    .line 234
    .line 235
    invoke-direct {p0}, La/yiq;-><init>()V

    .line 236
    .line 237
    .line 238
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    return-void

    .line 242
    :pswitch_12
    new-instance p0, La/qp2;

    .line 243
    .line 244
    invoke-direct {p0}, La/qp2;-><init>()V

    .line 245
    .line 246
    .line 247
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    return-void

    .line 251
    :pswitch_13
    new-instance p0, La/y20;

    .line 252
    .line 253
    invoke-direct {p0, v1}, La/y20;-><init>(I)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    return-void

    .line 260
    :pswitch_14
    new-instance p0, La/h6;

    .line 261
    .line 262
    invoke-direct {p0}, La/h6;-><init>()V

    .line 263
    .line 264
    .line 265
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    return-void

    .line 269
    :pswitch_15
    new-instance p0, La/f6;

    .line 270
    .line 271
    invoke-direct {p0}, La/f6;-><init>()V

    .line 272
    .line 273
    .line 274
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    return-void

    .line 278
    nop

    .line 279
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public final declared-synchronized d(Landroid/net/Uri;Ljava/util/Map;)[La/fuo;
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    sget-object v1, La/huj;->e:[I

    .line 5
    .line 6
    const/16 v2, 0x15

    .line 7
    .line 8
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 9
    .line 10
    .line 11
    const-string v3, "Content-Type"

    .line 12
    .line 13
    invoke-interface {p2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    check-cast p2, Ljava/util/List;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz p2, :cond_1

    .line 21
    .line 22
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    check-cast p2, Ljava/lang/String;

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    :goto_0
    const/4 p2, 0x0

    .line 37
    :goto_1
    invoke-static {p2}, La/fbc;->M(Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    const/4 v4, -0x1

    .line 42
    if-eq p2, v4, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0, p2, v0}, La/huj;->a(ILjava/util/ArrayList;)V

    .line 45
    .line 46
    .line 47
    goto :goto_2

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto :goto_4

    .line 50
    :cond_2
    :goto_2
    invoke-static {p1}, La/fbc;->N(Landroid/net/Uri;)I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eq p1, v4, :cond_3

    .line 55
    .line 56
    if-eq p1, p2, :cond_3

    .line 57
    .line 58
    invoke-virtual {p0, p1, v0}, La/huj;->a(ILjava/util/ArrayList;)V

    .line 59
    .line 60
    .line 61
    :cond_3
    move v4, v3

    .line 62
    :goto_3
    if-ge v4, v2, :cond_5

    .line 63
    .line 64
    aget v5, v1, v4

    .line 65
    .line 66
    if-eq v5, p2, :cond_4

    .line 67
    .line 68
    if-eq v5, p1, :cond_4

    .line 69
    .line 70
    invoke-virtual {p0, v5, v0}, La/huj;->a(ILjava/util/ArrayList;)V

    .line 71
    .line 72
    .line 73
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_5
    new-array p1, v3, [La/fuo;

    .line 77
    .line 78
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, [La/fuo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    .line 84
    monitor-exit p0

    .line 85
    return-object p1

    .line 86
    :goto_4
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 87
    throw p1
.end method

.method public final declared-synchronized f()[La/fuo;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 3
    .line 4
    new-instance v1, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0, v1}, La/huj;->d(Landroid/net/Uri;Ljava/util/Map;)[La/fuo;

    .line 10
    .line 11
    .line 12
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    monitor-exit p0

    .line 14
    return-object v0

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    throw v0
.end method
