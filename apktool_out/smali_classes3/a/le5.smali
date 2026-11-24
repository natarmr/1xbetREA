.class public final synthetic La/le5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lorg/xplatform/background_video/impl/presentation/BackgroundVideoService;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/background_video/impl/presentation/BackgroundVideoService;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/le5;->a:B

    iput-object p1, p0, La/le5;->b:Lorg/xplatform/background_video/impl/presentation/BackgroundVideoService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    .line 1
    iget-byte v0, p0, La/le5;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/le5;->b:Lorg/xplatform/background_video/impl/presentation/BackgroundVideoService;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lorg/xplatform/background_video/impl/presentation/BackgroundVideoService;->b:La/n0o0;

    .line 9
    .line 10
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/k9i;

    .line 15
    .line 16
    new-instance v0, La/ze5;

    .line 17
    .line 18
    new-instance v1, La/b5v;

    .line 19
    .line 20
    invoke-virtual {p0}, La/k9i;->a()La/xex;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {p0}, La/k9i;->b()La/xex;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-direct {v1, v2, v3}, La/b5v;-><init>(La/xex;La/xex;)V

    .line 29
    .line 30
    .line 31
    new-instance v2, La/nw20;

    .line 32
    .line 33
    invoke-virtual {p0}, La/k9i;->a()La/xex;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {p0}, La/k9i;->b()La/xex;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-direct {v2, v3, v4}, La/nw20;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    new-instance v3, La/j910;

    .line 45
    .line 46
    invoke-virtual {p0}, La/k9i;->a()La/xex;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    invoke-virtual {p0}, La/k9i;->b()La/xex;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    const/16 v6, 0x15

    .line 55
    .line 56
    invoke-direct {v3, v4, v5, v6}, La/j910;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 57
    .line 58
    .line 59
    new-instance v4, La/u8u;

    .line 60
    .line 61
    invoke-virtual {p0}, La/k9i;->a()La/xex;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-virtual {p0}, La/k9i;->b()La/xex;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    const/16 v7, 0xa

    .line 70
    .line 71
    invoke-direct {v4, v5, v6, v7}, La/u8u;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 72
    .line 73
    .line 74
    new-instance v5, La/b5v;

    .line 75
    .line 76
    invoke-virtual {p0}, La/k9i;->a()La/xex;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    invoke-virtual {p0}, La/k9i;->b()La/xex;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    invoke-direct {v5, v6, v8}, La/b5v;-><init>(La/xex;La/xex;)V

    .line 85
    .line 86
    .line 87
    new-instance v6, La/g090;

    .line 88
    .line 89
    invoke-virtual {p0}, La/k9i;->a()La/xex;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    invoke-virtual {p0}, La/k9i;->b()La/xex;

    .line 94
    .line 95
    .line 96
    move-result-object v9

    .line 97
    invoke-direct {v6, v8, v9}, La/g090;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    move v8, v7

    .line 101
    new-instance v7, La/cad;

    .line 102
    .line 103
    new-instance v9, La/y3v;

    .line 104
    .line 105
    new-instance v10, La/vqc;

    .line 106
    .line 107
    iget-object v11, p0, La/k9i;->d:La/azj0;

    .line 108
    .line 109
    invoke-direct {v10, v11}, La/vqc;-><init>(La/azj0;)V

    .line 110
    .line 111
    .line 112
    new-instance v12, La/nqd;

    .line 113
    .line 114
    const/16 v13, 0xb

    .line 115
    .line 116
    invoke-direct {v12, v13}, La/nqd;-><init>(B)V

    .line 117
    .line 118
    .line 119
    iget-object p0, p0, La/k9i;->a:La/cad;

    .line 120
    .line 121
    iget-object p0, p0, La/cad;->b:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast p0, La/psc;

    .line 124
    .line 125
    invoke-virtual {p0}, La/psc;->h()La/mne;

    .line 126
    .line 127
    .line 128
    move-result-object v13

    .line 129
    invoke-static {v13}, La/x1x;->x(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    const/16 v14, 0x1d

    .line 133
    .line 134
    invoke-direct {v9, v10, v12, v13, v14}, La/y3v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 135
    .line 136
    .line 137
    const/16 v10, 0x10

    .line 138
    .line 139
    invoke-direct {v7, v9, v10}, La/cad;-><init>(Ljava/lang/Object;B)V

    .line 140
    .line 141
    .line 142
    move v9, v8

    .line 143
    new-instance v8, La/ocl;

    .line 144
    .line 145
    new-instance v10, La/y3v;

    .line 146
    .line 147
    new-instance v12, La/lrc;

    .line 148
    .line 149
    invoke-direct {v12, v11}, La/lrc;-><init>(La/azj0;)V

    .line 150
    .line 151
    .line 152
    new-instance v11, La/nqd;

    .line 153
    .line 154
    invoke-direct {v11, v9}, La/nqd;-><init>(B)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0}, La/psc;->h()La/mne;

    .line 158
    .line 159
    .line 160
    move-result-object v9

    .line 161
    invoke-static {v9}, La/x1x;->x(Ljava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    const/4 v13, 0x3

    .line 165
    invoke-direct {v10, v12, v11, v9, v13}, La/y3v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 166
    .line 167
    .line 168
    invoke-direct {v8, v10}, La/ocl;-><init>(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0}, La/psc;->h()La/mne;

    .line 172
    .line 173
    .line 174
    move-result-object v9

    .line 175
    invoke-static {v9}, La/x1x;->x(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    invoke-direct/range {v0 .. v9}, La/ze5;-><init>(La/b5v;La/nw20;La/j910;La/u8u;La/b5v;La/g090;La/cad;La/ocl;La/mne;)V

    .line 179
    .line 180
    .line 181
    return-object v0

    .line 182
    :pswitch_0
    sget v0, Lorg/xplatform/background_video/impl/presentation/BackgroundVideoService;->d:I

    .line 183
    .line 184
    invoke-virtual {p0}, Landroid/app/Service;->getApplication()Landroid/app/Application;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    instance-of v0, p0, La/af3;

    .line 192
    .line 193
    const/4 v1, 0x0

    .line 194
    if-eqz v0, :cond_0

    .line 195
    .line 196
    check-cast p0, La/af3;

    .line 197
    .line 198
    goto :goto_0

    .line 199
    :cond_0
    move-object p0, v1

    .line 200
    :goto_0
    const-class v0, La/id5;

    .line 201
    .line 202
    if-eqz p0, :cond_3

    .line 203
    .line 204
    invoke-interface {p0}, La/af3;->d()La/wcf0;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    invoke-virtual {p0, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    check-cast p0, La/o5d0;

    .line 213
    .line 214
    if-eqz p0, :cond_1

    .line 215
    .line 216
    invoke-interface {p0}, La/o5d0;->get()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    check-cast p0, La/ze3;

    .line 221
    .line 222
    goto :goto_1

    .line 223
    :cond_1
    move-object p0, v1

    .line 224
    :goto_1
    instance-of v2, p0, La/id5;

    .line 225
    .line 226
    if-nez v2, :cond_2

    .line 227
    .line 228
    move-object p0, v1

    .line 229
    :cond_2
    check-cast p0, La/id5;

    .line 230
    .line 231
    if-eqz p0, :cond_3

    .line 232
    .line 233
    iget-object v0, p0, La/id5;->a:La/cad;

    .line 234
    .line 235
    iget-object v1, p0, La/id5;->b:La/azj0;

    .line 236
    .line 237
    iget-object v2, p0, La/id5;->c:La/vwb0;

    .line 238
    .line 239
    iget-object v3, p0, La/id5;->d:La/ie5;

    .line 240
    .line 241
    iget-object p0, p0, La/id5;->e:La/ie5;

    .line 242
    .line 243
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    new-instance v2, La/k9i;

    .line 256
    .line 257
    invoke-direct {v2, v0, v1, v3, p0}, La/k9i;-><init>(La/cad;La/azj0;La/ie5;La/ie5;)V

    .line 258
    .line 259
    .line 260
    move-object v1, v2

    .line 261
    goto :goto_2

    .line 262
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 263
    .line 264
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    :goto_2
    return-object v1

    .line 272
    nop

    .line 273
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
