.class public final La/pwj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:La/dwj;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/pwj;->a:Landroid/content/Context;

    .line 5
    .line 6
    new-instance v0, La/dwj;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p1, v1}, La/dwj;-><init>(Landroid/content/Context;B)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, La/pwj;->b:La/dwj;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Handler;La/qlo;La/qlo;La/qlo;La/qlo;)[La/j16;
    .locals 10

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, La/vm30;

    .line 7
    .line 8
    iget-object v2, p0, La/pwj;->a:Landroid/content/Context;

    .line 9
    .line 10
    invoke-direct {v1, v2}, La/vm30;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    iget-object v5, p0, La/pwj;->b:La/dwj;

    .line 14
    .line 15
    iput-object v5, v1, La/vm30;->c:La/dwj;

    .line 16
    .line 17
    const/16 v3, 0x1388

    .line 18
    .line 19
    iput-short v3, v1, La/vm30;->d:S

    .line 20
    .line 21
    iput-object p1, v1, La/vm30;->e:Landroid/os/Handler;

    .line 22
    .line 23
    iput-object p2, v1, La/vm30;->f:La/qlo;

    .line 24
    .line 25
    const/16 p2, 0x32

    .line 26
    .line 27
    iput-byte p2, v1, La/vm30;->g:B

    .line 28
    .line 29
    iget-boolean p2, v1, La/vm30;->b:Z

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    xor-int/2addr p2, v3

    .line 33
    invoke-static {p2}, La/x0x;->K(Z)V

    .line 34
    .line 35
    .line 36
    iget-object p2, v1, La/vm30;->e:Landroid/os/Handler;

    .line 37
    .line 38
    const/4 v9, 0x0

    .line 39
    if-nez p2, :cond_0

    .line 40
    .line 41
    iget-object v4, v1, La/vm30;->f:La/qlo;

    .line 42
    .line 43
    if-eqz v4, :cond_1

    .line 44
    .line 45
    :cond_0
    if-eqz p2, :cond_2

    .line 46
    .line 47
    iget-object p2, v1, La/vm30;->f:La/qlo;

    .line 48
    .line 49
    if-eqz p2, :cond_2

    .line 50
    .line 51
    :cond_1
    move p2, v3

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    move p2, v9

    .line 54
    :goto_0
    invoke-static {p2}, La/x0x;->K(Z)V

    .line 55
    .line 56
    .line 57
    iput-boolean v3, v1, La/vm30;->b:Z

    .line 58
    .line 59
    new-instance p2, La/xm30;

    .line 60
    .line 61
    invoke-direct {p2, v1}, La/xm30;-><init>(La/vm30;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    new-instance p2, La/lsj;

    .line 68
    .line 69
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object v2, p2, La/lsj;->b:Ljava/lang/Object;

    .line 73
    .line 74
    sget-object v1, La/q24;->f:La/q24;

    .line 75
    .line 76
    iput-object v1, p2, La/lsj;->c:Ljava/lang/Object;

    .line 77
    .line 78
    iget-boolean v1, p2, La/lsj;->a:Z

    .line 79
    .line 80
    xor-int/2addr v1, v3

    .line 81
    invoke-static {v1}, La/x0x;->K(Z)V

    .line 82
    .line 83
    .line 84
    iput-boolean v3, p2, La/lsj;->a:Z

    .line 85
    .line 86
    iget-object v1, p2, La/lsj;->d:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v1, La/khf0;

    .line 89
    .line 90
    if-nez v1, :cond_3

    .line 91
    .line 92
    new-instance v1, La/khf0;

    .line 93
    .line 94
    new-array v4, v9, [La/u34;

    .line 95
    .line 96
    invoke-direct {v1, v4}, La/khf0;-><init>([La/u34;)V

    .line 97
    .line 98
    .line 99
    iput-object v1, p2, La/lsj;->d:Ljava/lang/Object;

    .line 100
    .line 101
    :cond_3
    iget-object v1, p2, La/lsj;->f:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v1, La/n44;

    .line 104
    .line 105
    iget-object v4, p2, La/lsj;->g:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v4, La/fhj;

    .line 108
    .line 109
    if-nez v1, :cond_9

    .line 110
    .line 111
    if-nez v4, :cond_4

    .line 112
    .line 113
    new-instance v1, La/fhj;

    .line 114
    .line 115
    invoke-direct {v1, v2, v3}, La/fhj;-><init>(Landroid/content/Context;B)V

    .line 116
    .line 117
    .line 118
    iput-object v1, p2, La/lsj;->g:Ljava/lang/Object;

    .line 119
    .line 120
    :cond_4
    iget-object v1, p2, La/lsj;->e:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v1, La/m2a;

    .line 123
    .line 124
    if-nez v1, :cond_5

    .line 125
    .line 126
    sget-object v1, La/m2a;->j:La/m2a;

    .line 127
    .line 128
    iput-object v1, p2, La/lsj;->e:Ljava/lang/Object;

    .line 129
    .line 130
    :cond_5
    new-instance v1, La/mii0;

    .line 131
    .line 132
    invoke-direct {v1, v2}, La/mii0;-><init>(Landroid/content/Context;)V

    .line 133
    .line 134
    .line 135
    if-eqz v2, :cond_6

    .line 136
    .line 137
    const/4 v4, 0x0

    .line 138
    goto :goto_1

    .line 139
    :cond_6
    iget-object v4, p2, La/lsj;->c:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v4, La/q24;

    .line 142
    .line 143
    :goto_1
    iget-object v6, v1, La/mii0;->b:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v6, Landroid/content/Context;

    .line 146
    .line 147
    if-nez v6, :cond_7

    .line 148
    .line 149
    iput-object v4, v1, La/mii0;->e:Ljava/lang/Object;

    .line 150
    .line 151
    :cond_7
    iget-object v4, p2, La/lsj;->g:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v4, La/fhj;

    .line 154
    .line 155
    iput-object v4, v1, La/mii0;->c:Ljava/lang/Object;

    .line 156
    .line 157
    iget-object v7, p2, La/lsj;->e:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v7, La/m2a;

    .line 160
    .line 161
    iput-object v7, v1, La/mii0;->d:Ljava/lang/Object;

    .line 162
    .line 163
    if-nez v4, :cond_8

    .line 164
    .line 165
    new-instance v4, La/fhj;

    .line 166
    .line 167
    invoke-direct {v4, v6, v3}, La/fhj;-><init>(Landroid/content/Context;B)V

    .line 168
    .line 169
    .line 170
    iput-object v4, v1, La/mii0;->c:Ljava/lang/Object;

    .line 171
    .line 172
    :cond_8
    new-instance v3, La/n44;

    .line 173
    .line 174
    invoke-direct {v3, v1}, La/n44;-><init>(La/mii0;)V

    .line 175
    .line 176
    .line 177
    iput-object v3, p2, La/lsj;->f:Ljava/lang/Object;

    .line 178
    .line 179
    goto :goto_4

    .line 180
    :cond_9
    if-nez v4, :cond_a

    .line 181
    .line 182
    move v1, v3

    .line 183
    goto :goto_2

    .line 184
    :cond_a
    move v1, v9

    .line 185
    :goto_2
    invoke-static {v1}, La/x0x;->K(Z)V

    .line 186
    .line 187
    .line 188
    iget-object v1, p2, La/lsj;->e:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v1, La/m2a;

    .line 191
    .line 192
    if-nez v1, :cond_b

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_b
    move v3, v9

    .line 196
    :goto_3
    invoke-static {v3}, La/x0x;->K(Z)V

    .line 197
    .line 198
    .line 199
    :goto_4
    new-instance v8, La/osj;

    .line 200
    .line 201
    invoke-direct {v8, p2}, La/osj;-><init>(La/lsj;)V

    .line 202
    .line 203
    .line 204
    new-instance v3, La/fm30;

    .line 205
    .line 206
    iget-object v4, p0, La/pwj;->a:Landroid/content/Context;

    .line 207
    .line 208
    move-object v6, p1

    .line 209
    move-object v7, p3

    .line 210
    invoke-direct/range {v3 .. v8}, La/fm30;-><init>(Landroid/content/Context;La/cm30;Landroid/os/Handler;La/qlo;La/osj;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    invoke-virtual {v6}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    new-instance p1, La/r9q0;

    .line 221
    .line 222
    invoke-direct {p1, p4, p0}, La/r9q0;-><init>(La/qlo;Landroid/os/Looper;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    invoke-virtual {v6}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    move p1, v9

    .line 233
    :goto_5
    const/4 p2, 0x4

    .line 234
    if-ge p1, p2, :cond_c

    .line 235
    .line 236
    new-instance p2, La/sd40;

    .line 237
    .line 238
    invoke-direct {p2, p5, p0}, La/sd40;-><init>(La/qlo;Landroid/os/Looper;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    add-int/lit8 p1, p1, 0x1

    .line 245
    .line 246
    goto :goto_5

    .line 247
    :cond_c
    new-instance p0, La/e1a;

    .line 248
    .line 249
    invoke-direct {p0}, La/e1a;-><init>()V

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    new-instance p0, La/j1x;

    .line 256
    .line 257
    new-instance p1, La/wsf0;

    .line 258
    .line 259
    invoke-direct {p1, v2}, La/wsf0;-><init>(Landroid/content/Context;)V

    .line 260
    .line 261
    .line 262
    invoke-direct {p0, p1}, La/j1x;-><init>(La/wsf0;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    new-array p0, v9, [La/j16;

    .line 269
    .line 270
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object p0

    .line 274
    check-cast p0, [La/j16;

    .line 275
    .line 276
    return-object p0
.end method
