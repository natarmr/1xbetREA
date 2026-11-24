.class public final La/q24;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:La/rcf0;

.field public static final f:La/q24;

.field public static final g:La/rcf0;

.field public static final h:La/wcf0;


# instance fields
.field public final a:Landroid/util/SparseArray;

.field public final b:I

.field public final c:La/b4x;

.field public final d:La/b4x;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, La/b4x;->t(Ljava/lang/Object;)La/rcf0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, La/q24;->e:La/rcf0;

    .line 12
    .line 13
    sget-object v1, La/rcf0;->e:La/rcf0;

    .line 14
    .line 15
    new-instance v2, La/q24;

    .line 16
    .line 17
    sget-object v3, La/p24;->d:La/p24;

    .line 18
    .line 19
    invoke-static {v3}, La/b4x;->t(Ljava/lang/Object;)La/rcf0;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-direct {v2, v3, v0, v1}, La/q24;-><init>(La/rcf0;La/b4x;Ljava/util/List;)V

    .line 24
    .line 25
    .line 26
    sput-object v2, La/q24;->f:La/q24;

    .line 27
    .line 28
    const/4 v0, 0x2

    .line 29
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const/4 v1, 0x5

    .line 34
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const/4 v2, 0x6

    .line 39
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    filled-new-array {v0, v1, v2}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const/4 v3, 0x3

    .line 48
    invoke-static {v3, v0}, La/h8x;->w(I[Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-static {v3, v0}, La/b4x;->k(I[Ljava/lang/Object;)La/rcf0;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, La/q24;->g:La/rcf0;

    .line 56
    .line 57
    new-instance v0, La/zz2;

    .line 58
    .line 59
    const/4 v3, 0x4

    .line 60
    invoke-direct {v0, v3}, La/zz2;-><init>(I)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1, v2}, La/zz2;->A(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    const/16 v1, 0x11

    .line 67
    .line 68
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v0, v1, v2}, La/zz2;->A(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    const/4 v1, 0x7

    .line 76
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    invoke-virtual {v0, v1, v2}, La/zz2;->A(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    const/16 v1, 0x1e

    .line 84
    .line 85
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    const/16 v3, 0xa

    .line 90
    .line 91
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object v3

    .line 95
    invoke-virtual {v0, v1, v3}, La/zz2;->A(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    const/16 v1, 0x12

    .line 99
    .line 100
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {v0, v1, v2}, La/zz2;->A(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    const/16 v1, 0x8

    .line 108
    .line 109
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {v0, v2, v1}, La/zz2;->A(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v1, v1}, La/zz2;->A(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    const/16 v2, 0xe

    .line 120
    .line 121
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-virtual {v0, v2, v1}, La/zz2;->A(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    const/4 v1, 0x1

    .line 129
    invoke-virtual {v0, v1}, La/zz2;->e(Z)La/wcf0;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    sput-object v0, La/q24;->h:La/wcf0;

    .line 134
    .line 135
    return-void
.end method

.method public constructor <init>(La/rcf0;La/b4x;Ljava/util/List;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/util/SparseArray;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/q24;->a:Landroid/util/SparseArray;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    move v1, v0

    .line 13
    :goto_0
    iget v2, p1, La/rcf0;->d:I

    .line 14
    .line 15
    if-ge v1, v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1, v1}, La/rcf0;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, La/p24;

    .line 22
    .line 23
    iget-object v3, p0, La/q24;->a:Landroid/util/SparseArray;

    .line 24
    .line 25
    iget v4, v2, La/p24;->a:I

    .line 26
    .line 27
    invoke-virtual {v3, v4, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move p1, v0

    .line 34
    :goto_1
    iget-object v1, p0, La/q24;->a:Landroid/util/SparseArray;

    .line 35
    .line 36
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-ge v0, v1, :cond_1

    .line 41
    .line 42
    iget-object v1, p0, La/q24;->a:Landroid/util/SparseArray;

    .line 43
    .line 44
    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, La/p24;

    .line 49
    .line 50
    iget v1, v1, La/p24;->b:I

    .line 51
    .line 52
    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    add-int/lit8 v0, v0, 0x1

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    iput p1, p0, La/q24;->b:I

    .line 60
    .line 61
    invoke-static {p2}, La/b4x;->o(Ljava/util/Collection;)La/b4x;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iput-object p1, p0, La/q24;->c:La/b4x;

    .line 66
    .line 67
    invoke-static {p3}, La/b4x;->o(Ljava/util/Collection;)La/b4x;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iput-object p1, p0, La/q24;->d:La/b4x;

    .line 72
    .line 73
    return-void
.end method

.method public static a([II)La/rcf0;
    .locals 4

    .line 1
    invoke-static {}, La/b4x;->l()La/u3x;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    new-array p0, v1, [I

    .line 9
    .line 10
    :cond_0
    :goto_0
    array-length v2, p0

    .line 11
    if-ge v1, v2, :cond_1

    .line 12
    .line 13
    aget v2, p0, v1

    .line 14
    .line 15
    new-instance v3, La/p24;

    .line 16
    .line 17
    invoke-direct {v3, v2, p1}, La/p24;-><init>(II)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v3}, La/r3x;->b(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    invoke-virtual {v0}, La/u3x;->g()La/rcf0;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public static b(Landroid/content/Context;Landroid/content/Intent;La/m24;Landroid/media/AudioDeviceInfo;Ljava/util/List;)La/q24;
    .locals 20

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    invoke-static/range {p0 .. p0}, La/b34;->g0(Landroid/content/Context;)Landroid/media/AudioManager;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    const/16 v5, 0x21

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    if-eqz p3, :cond_0

    .line 18
    .line 19
    move-object/from16 v7, p3

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 23
    .line 24
    const/4 v8, 0x0

    .line 25
    if-lt v7, v5, :cond_2

    .line 26
    .line 27
    invoke-virtual/range {p2 .. p2}, La/m24;->a()Landroid/media/AudioAttributes;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    invoke-static {v4, v7}, La/c7;->j(Landroid/media/AudioManager;Landroid/media/AudioAttributes;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v9

    .line 39
    if-eqz v9, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    check-cast v7, Landroid/media/AudioDeviceInfo;

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    :goto_0
    move-object v7, v8

    .line 50
    :goto_1
    const/16 v8, 0x1d

    .line 51
    .line 52
    const/4 v9, 0x4

    .line 53
    const/16 v10, 0xc

    .line 54
    .line 55
    const/16 v11, 0xa

    .line 56
    .line 57
    const/4 v12, 0x1

    .line 58
    if-eqz v7, :cond_27

    .line 59
    .line 60
    sget-object v13, La/nnk0;->a:La/rcf0;

    .line 61
    .line 62
    invoke-virtual {v7}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 63
    .line 64
    .line 65
    move-result v14

    .line 66
    invoke-static {v14}, La/bkb;->Y(I)Z

    .line 67
    .line 68
    .line 69
    move-result v14

    .line 70
    if-eqz v14, :cond_3

    .line 71
    .line 72
    :goto_2
    move/from16 v16, v6

    .line 73
    .line 74
    goto/16 :goto_d

    .line 75
    .line 76
    :cond_3
    invoke-virtual {v7}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 77
    .line 78
    .line 79
    move-result v14

    .line 80
    if-ne v14, v12, :cond_4

    .line 81
    .line 82
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v13

    .line 86
    invoke-static {v13}, La/b4x;->t(Ljava/lang/Object;)La/rcf0;

    .line 87
    .line 88
    .line 89
    move-result-object v13

    .line 90
    goto :goto_2

    .line 91
    :cond_4
    invoke-virtual {v7}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 92
    .line 93
    .line 94
    move-result v14

    .line 95
    if-ne v14, v2, :cond_6

    .line 96
    .line 97
    sget v14, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 98
    .line 99
    const/16 v15, 0x24

    .line 100
    .line 101
    if-lt v14, v15, :cond_5

    .line 102
    .line 103
    invoke-static {v7}, La/ob5;->b(Landroid/media/AudioDeviceInfo;)I

    .line 104
    .line 105
    .line 106
    move-result v14

    .line 107
    if-eqz v14, :cond_5

    .line 108
    .line 109
    if-eq v14, v12, :cond_5

    .line 110
    .line 111
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object v13

    .line 115
    invoke-static {v13}, La/b4x;->t(Ljava/lang/Object;)La/rcf0;

    .line 116
    .line 117
    .line 118
    move-result-object v13

    .line 119
    goto :goto_2

    .line 120
    :cond_5
    const-string v14, "SpeakerLayoutUtil"

    .line 121
    .line 122
    const-string v15, "Built-in speaker\'s getSpeakerLayoutChannelMask not usable, defaulting to stereo."

    .line 123
    .line 124
    invoke-static {v14, v15}, La/f1t0;->g0(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_6
    sget v14, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 129
    .line 130
    const/16 v15, 0x1f

    .line 131
    .line 132
    move/from16 v16, v6

    .line 133
    .line 134
    if-lt v14, v15, :cond_8

    .line 135
    .line 136
    invoke-virtual {v7}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    if-ne v6, v11, :cond_8

    .line 141
    .line 142
    invoke-static {v7}, La/nnk0;->a(Landroid/media/AudioDeviceInfo;)La/b4x;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    invoke-virtual {v6}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 147
    .line 148
    .line 149
    move-result v14

    .line 150
    if-nez v14, :cond_7

    .line 151
    .line 152
    :goto_3
    move-object v13, v6

    .line 153
    goto/16 :goto_d

    .line 154
    .line 155
    :cond_7
    invoke-static {v7}, La/tl50;->C(Landroid/media/AudioDeviceInfo;)Ljava/util/List;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    invoke-static {v6}, La/tke;->U(Ljava/util/List;)La/b4x;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    invoke-virtual {v6}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 164
    .line 165
    .line 166
    move-result v14

    .line 167
    if-nez v14, :cond_28

    .line 168
    .line 169
    :goto_4
    goto :goto_3

    .line 170
    :cond_8
    if-lt v14, v15, :cond_24

    .line 171
    .line 172
    invoke-virtual {v7}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 173
    .line 174
    .line 175
    move-result v6

    .line 176
    if-lt v14, v15, :cond_24

    .line 177
    .line 178
    if-ne v6, v8, :cond_24

    .line 179
    .line 180
    invoke-static {v7}, La/nnk0;->a(Landroid/media/AudioDeviceInfo;)La/b4x;

    .line 181
    .line 182
    .line 183
    move-result-object v6

    .line 184
    invoke-virtual {v6}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 185
    .line 186
    .line 187
    move-result v15

    .line 188
    if-nez v15, :cond_9

    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_9
    invoke-static {v7}, La/tl50;->C(Landroid/media/AudioDeviceInfo;)Ljava/util/List;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    const/16 v15, 0x22

    .line 196
    .line 197
    if-lt v14, v15, :cond_23

    .line 198
    .line 199
    if-lt v14, v15, :cond_22

    .line 200
    .line 201
    if-nez v6, :cond_a

    .line 202
    .line 203
    goto/16 :goto_a

    .line 204
    .line 205
    :cond_a
    new-instance v14, Ljava/util/ArrayList;

    .line 206
    .line 207
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 208
    .line 209
    .line 210
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 211
    .line 212
    .line 213
    move-result-object v17

    .line 214
    :goto_5
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    .line 215
    .line 216
    .line 217
    move-result v18

    .line 218
    if-eqz v18, :cond_21

    .line 219
    .line 220
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v18

    .line 224
    invoke-static/range {v18 .. v18}, La/ow2;->i(Ljava/lang/Object;)Landroid/media/AudioDescriptor;

    .line 225
    .line 226
    .line 227
    move-result-object v18

    .line 228
    invoke-static/range {v18 .. v18}, La/ow2;->c(Landroid/media/AudioDescriptor;)I

    .line 229
    .line 230
    .line 231
    move-result v11

    .line 232
    if-ne v11, v2, :cond_b

    .line 233
    .line 234
    invoke-static/range {v18 .. v18}, La/ow2;->v(Landroid/media/AudioDescriptor;)[B

    .line 235
    .line 236
    .line 237
    move-result-object v11

    .line 238
    array-length v8, v11

    .line 239
    const/4 v9, 0x3

    .line 240
    if-eq v8, v9, :cond_c

    .line 241
    .line 242
    new-instance v8, Ljava/lang/StringBuilder;

    .line 243
    .line 244
    const-string v9, "Invalid SADB length: "

    .line 245
    .line 246
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    array-length v9, v11

    .line 250
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v8

    .line 257
    const-string v9, "AudioDescriptorUtil"

    .line 258
    .line 259
    invoke-static {v9, v8}, La/f1t0;->g0(Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    :cond_b
    :goto_6
    const/16 v8, 0x1d

    .line 263
    .line 264
    const/4 v9, 0x4

    .line 265
    const/16 v11, 0xa

    .line 266
    .line 267
    goto :goto_5

    .line 268
    :cond_c
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 269
    .line 270
    if-lt v8, v15, :cond_20

    .line 271
    .line 272
    array-length v8, v11

    .line 273
    if-eq v8, v9, :cond_d

    .line 274
    .line 275
    goto/16 :goto_8

    .line 276
    .line 277
    :cond_d
    aget-byte v8, v11, v16

    .line 278
    .line 279
    and-int/lit8 v9, v8, 0x1

    .line 280
    .line 281
    if-eqz v9, :cond_e

    .line 282
    .line 283
    move v9, v10

    .line 284
    goto :goto_7

    .line 285
    :cond_e
    move/from16 v9, v16

    .line 286
    .line 287
    :goto_7
    and-int/lit8 v19, v8, 0x2

    .line 288
    .line 289
    if-eqz v19, :cond_f

    .line 290
    .line 291
    or-int/lit8 v9, v9, 0x20

    .line 292
    .line 293
    :cond_f
    and-int/lit8 v19, v8, 0x4

    .line 294
    .line 295
    if-eqz v19, :cond_10

    .line 296
    .line 297
    or-int/lit8 v9, v9, 0x10

    .line 298
    .line 299
    :cond_10
    and-int/lit8 v19, v8, 0x8

    .line 300
    .line 301
    if-eqz v19, :cond_11

    .line 302
    .line 303
    or-int/lit16 v9, v9, 0xc0

    .line 304
    .line 305
    :cond_11
    and-int/lit8 v19, v8, 0x10

    .line 306
    .line 307
    if-eqz v19, :cond_12

    .line 308
    .line 309
    or-int/lit16 v9, v9, 0x400

    .line 310
    .line 311
    :cond_12
    and-int/lit8 v19, v8, 0x20

    .line 312
    .line 313
    if-eqz v19, :cond_13

    .line 314
    .line 315
    or-int/lit16 v9, v9, 0x300

    .line 316
    .line 317
    :cond_13
    and-int/lit16 v8, v8, 0x80

    .line 318
    .line 319
    if-eqz v8, :cond_14

    .line 320
    .line 321
    const/high16 v8, 0xc000000

    .line 322
    .line 323
    or-int/2addr v9, v8

    .line 324
    :cond_14
    aget-byte v8, v11, v12

    .line 325
    .line 326
    and-int/lit8 v19, v8, 0x1

    .line 327
    .line 328
    if-eqz v19, :cond_15

    .line 329
    .line 330
    const v19, 0x14000

    .line 331
    .line 332
    .line 333
    or-int v9, v9, v19

    .line 334
    .line 335
    :cond_15
    and-int/lit8 v19, v8, 0x2

    .line 336
    .line 337
    if-eqz v19, :cond_16

    .line 338
    .line 339
    or-int/lit16 v9, v9, 0x2000

    .line 340
    .line 341
    :cond_16
    and-int/lit8 v19, v8, 0x4

    .line 342
    .line 343
    if-eqz v19, :cond_17

    .line 344
    .line 345
    const v19, 0x8000

    .line 346
    .line 347
    .line 348
    or-int v9, v9, v19

    .line 349
    .line 350
    :cond_17
    and-int/lit8 v19, v8, 0x8

    .line 351
    .line 352
    if-eqz v19, :cond_18

    .line 353
    .line 354
    or-int/lit16 v9, v9, 0x1800

    .line 355
    .line 356
    :cond_18
    and-int/lit8 v19, v8, 0x10

    .line 357
    .line 358
    if-eqz v19, :cond_19

    .line 359
    .line 360
    const/high16 v19, 0x2000000

    .line 361
    .line 362
    or-int v9, v9, v19

    .line 363
    .line 364
    :cond_19
    and-int/lit8 v19, v8, 0x20

    .line 365
    .line 366
    if-eqz v19, :cond_1a

    .line 367
    .line 368
    const/high16 v19, 0x40000

    .line 369
    .line 370
    or-int v9, v9, v19

    .line 371
    .line 372
    :cond_1a
    and-int/lit8 v19, v8, 0x40

    .line 373
    .line 374
    if-eqz v19, :cond_1b

    .line 375
    .line 376
    or-int/lit16 v9, v9, 0x1800

    .line 377
    .line 378
    :cond_1b
    and-int/lit16 v8, v8, 0x80

    .line 379
    .line 380
    if-eqz v8, :cond_1c

    .line 381
    .line 382
    const/high16 v8, 0x300000

    .line 383
    .line 384
    or-int/2addr v9, v8

    .line 385
    :cond_1c
    aget-byte v8, v11, v2

    .line 386
    .line 387
    and-int/lit8 v11, v8, 0x1

    .line 388
    .line 389
    if-eqz v11, :cond_1d

    .line 390
    .line 391
    const/high16 v11, 0xa0000

    .line 392
    .line 393
    or-int/2addr v9, v11

    .line 394
    :cond_1d
    and-int/lit8 v11, v8, 0x2

    .line 395
    .line 396
    if-eqz v11, :cond_1e

    .line 397
    .line 398
    const/high16 v11, 0x800000

    .line 399
    .line 400
    or-int/2addr v9, v11

    .line 401
    :cond_1e
    and-int/lit8 v8, v8, 0x4

    .line 402
    .line 403
    if-eqz v8, :cond_1f

    .line 404
    .line 405
    const/high16 v8, 0x1400000

    .line 406
    .line 407
    or-int/2addr v8, v9

    .line 408
    goto :goto_9

    .line 409
    :cond_1f
    move v8, v9

    .line 410
    goto :goto_9

    .line 411
    :cond_20
    :goto_8
    move/from16 v8, v16

    .line 412
    .line 413
    :goto_9
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 414
    .line 415
    .line 416
    move-result-object v8

    .line 417
    invoke-virtual {v14, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    goto/16 :goto_6

    .line 421
    .line 422
    :cond_21
    new-instance v8, La/l13;

    .line 423
    .line 424
    invoke-direct {v8, v12}, La/l13;-><init>(B)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v14, v8}, Ljava/util/ArrayList;->sort(Ljava/util/Comparator;)V

    .line 428
    .line 429
    .line 430
    invoke-static {v14}, La/b4x;->o(Ljava/util/Collection;)La/b4x;

    .line 431
    .line 432
    .line 433
    move-result-object v8

    .line 434
    goto :goto_b

    .line 435
    :cond_22
    :goto_a
    sget-object v8, La/b4x;->b:La/v3x;

    .line 436
    .line 437
    sget-object v8, La/rcf0;->e:La/rcf0;

    .line 438
    .line 439
    :goto_b
    invoke-virtual {v8}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 440
    .line 441
    .line 442
    move-result v9

    .line 443
    if-nez v9, :cond_23

    .line 444
    .line 445
    move-object v13, v8

    .line 446
    goto :goto_d

    .line 447
    :cond_23
    invoke-static {v6}, La/tke;->U(Ljava/util/List;)La/b4x;

    .line 448
    .line 449
    .line 450
    move-result-object v6

    .line 451
    invoke-virtual {v6}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 452
    .line 453
    .line 454
    move-result v8

    .line 455
    if-nez v8, :cond_28

    .line 456
    .line 457
    goto/16 :goto_4

    .line 458
    .line 459
    :cond_24
    if-lt v14, v15, :cond_28

    .line 460
    .line 461
    invoke-virtual {v7}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 462
    .line 463
    .line 464
    move-result v6

    .line 465
    const/16 v8, 0xb

    .line 466
    .line 467
    if-eq v6, v8, :cond_26

    .line 468
    .line 469
    if-ne v6, v10, :cond_25

    .line 470
    .line 471
    goto :goto_c

    .line 472
    :cond_25
    if-lt v14, v15, :cond_28

    .line 473
    .line 474
    const/16 v8, 0x16

    .line 475
    .line 476
    if-ne v6, v8, :cond_28

    .line 477
    .line 478
    :cond_26
    :goto_c
    invoke-static {v7}, La/nnk0;->a(Landroid/media/AudioDeviceInfo;)La/b4x;

    .line 479
    .line 480
    .line 481
    move-result-object v6

    .line 482
    invoke-virtual {v6}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 483
    .line 484
    .line 485
    move-result v8

    .line 486
    if-nez v8, :cond_28

    .line 487
    .line 488
    goto/16 :goto_3

    .line 489
    .line 490
    :cond_27
    move/from16 v16, v6

    .line 491
    .line 492
    sget-object v13, La/q24;->e:La/rcf0;

    .line 493
    .line 494
    :cond_28
    :goto_d
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 495
    .line 496
    sget-object v8, La/q24;->h:La/wcf0;

    .line 497
    .line 498
    const-string v9, "android.hardware.type.automotive"

    .line 499
    .line 500
    if-lt v6, v5, :cond_2f

    .line 501
    .line 502
    invoke-static/range {p0 .. p0}, La/vtt0;->L(Landroid/content/Context;)Z

    .line 503
    .line 504
    .line 505
    move-result v5

    .line 506
    if-nez v5, :cond_29

    .line 507
    .line 508
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 509
    .line 510
    .line 511
    move-result-object v5

    .line 512
    invoke-virtual {v5, v9}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 513
    .line 514
    .line 515
    move-result v5

    .line 516
    if-eqz v5, :cond_2f

    .line 517
    .line 518
    :cond_29
    invoke-virtual/range {p2 .. p2}, La/m24;->a()Landroid/media/AudioAttributes;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    invoke-static {v4, v0}, La/c7;->s(Landroid/media/AudioManager;Landroid/media/AudioAttributes;)Ljava/util/List;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    new-instance v2, La/q24;

    .line 527
    .line 528
    new-instance v4, Ljava/util/HashMap;

    .line 529
    .line 530
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 531
    .line 532
    .line 533
    new-instance v5, Ljava/util/HashSet;

    .line 534
    .line 535
    filled-new-array {v10}, [I

    .line 536
    .line 537
    .line 538
    move-result-object v6

    .line 539
    invoke-static {v6}, La/n6x;->o([I)Ljava/util/List;

    .line 540
    .line 541
    .line 542
    move-result-object v6

    .line 543
    invoke-direct {v5, v6}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 544
    .line 545
    .line 546
    invoke-virtual {v4, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move/from16 v6, v16

    .line 550
    .line 551
    :goto_e
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 552
    .line 553
    .line 554
    move-result v3

    .line 555
    if-ge v6, v3, :cond_2d

    .line 556
    .line 557
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v3

    .line 561
    invoke-static {v3}, La/ow2;->j(Ljava/lang/Object;)Landroid/media/AudioProfile;

    .line 562
    .line 563
    .line 564
    move-result-object v3

    .line 565
    invoke-static {v3}, La/ow2;->d(Landroid/media/AudioProfile;)I

    .line 566
    .line 567
    .line 568
    move-result v5

    .line 569
    if-ne v5, v12, :cond_2a

    .line 570
    .line 571
    goto :goto_f

    .line 572
    :cond_2a
    invoke-static {v3}, La/ow2;->y(Landroid/media/AudioProfile;)I

    .line 573
    .line 574
    .line 575
    move-result v5

    .line 576
    invoke-static {v5}, La/vtt0;->I(I)Z

    .line 577
    .line 578
    .line 579
    move-result v7

    .line 580
    if-nez v7, :cond_2b

    .line 581
    .line 582
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 583
    .line 584
    .line 585
    move-result-object v7

    .line 586
    invoke-virtual {v8, v7}, La/wcf0;->containsKey(Ljava/lang/Object;)Z

    .line 587
    .line 588
    .line 589
    move-result v7

    .line 590
    if-nez v7, :cond_2b

    .line 591
    .line 592
    goto :goto_f

    .line 593
    :cond_2b
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 594
    .line 595
    .line 596
    move-result-object v7

    .line 597
    invoke-virtual {v4, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 598
    .line 599
    .line 600
    move-result v7

    .line 601
    if-eqz v7, :cond_2c

    .line 602
    .line 603
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 604
    .line 605
    .line 606
    move-result-object v5

    .line 607
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object v5

    .line 611
    check-cast v5, Ljava/util/Set;

    .line 612
    .line 613
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 614
    .line 615
    .line 616
    check-cast v5, Ljava/util/Set;

    .line 617
    .line 618
    invoke-static {v3}, La/ow2;->w(Landroid/media/AudioProfile;)[I

    .line 619
    .line 620
    .line 621
    move-result-object v3

    .line 622
    invoke-static {v3}, La/n6x;->o([I)Ljava/util/List;

    .line 623
    .line 624
    .line 625
    move-result-object v3

    .line 626
    invoke-interface {v5, v3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 627
    .line 628
    .line 629
    goto :goto_f

    .line 630
    :cond_2c
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 631
    .line 632
    .line 633
    move-result-object v5

    .line 634
    new-instance v7, Ljava/util/HashSet;

    .line 635
    .line 636
    invoke-static {v3}, La/ow2;->w(Landroid/media/AudioProfile;)[I

    .line 637
    .line 638
    .line 639
    move-result-object v3

    .line 640
    invoke-static {v3}, La/n6x;->o([I)Ljava/util/List;

    .line 641
    .line 642
    .line 643
    move-result-object v3

    .line 644
    invoke-direct {v7, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 645
    .line 646
    .line 647
    invoke-virtual {v4, v5, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 648
    .line 649
    .line 650
    :goto_f
    add-int/lit8 v6, v6, 0x1

    .line 651
    .line 652
    goto :goto_e

    .line 653
    :cond_2d
    invoke-static {}, La/b4x;->l()La/u3x;

    .line 654
    .line 655
    .line 656
    move-result-object v0

    .line 657
    invoke-virtual {v4}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 658
    .line 659
    .line 660
    move-result-object v3

    .line 661
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 662
    .line 663
    .line 664
    move-result-object v3

    .line 665
    :goto_10
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 666
    .line 667
    .line 668
    move-result v4

    .line 669
    if-eqz v4, :cond_2e

    .line 670
    .line 671
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    move-result-object v4

    .line 675
    check-cast v4, Ljava/util/Map$Entry;

    .line 676
    .line 677
    new-instance v5, La/p24;

    .line 678
    .line 679
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 680
    .line 681
    .line 682
    move-result-object v6

    .line 683
    check-cast v6, Ljava/lang/Integer;

    .line 684
    .line 685
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 686
    .line 687
    .line 688
    move-result v6

    .line 689
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 690
    .line 691
    .line 692
    move-result-object v4

    .line 693
    check-cast v4, Ljava/util/Set;

    .line 694
    .line 695
    invoke-direct {v5, v6, v4}, La/p24;-><init>(ILjava/util/Set;)V

    .line 696
    .line 697
    .line 698
    invoke-virtual {v0, v5}, La/r3x;->b(Ljava/lang/Object;)V

    .line 699
    .line 700
    .line 701
    goto :goto_10

    .line 702
    :cond_2e
    invoke-virtual {v0}, La/u3x;->g()La/rcf0;

    .line 703
    .line 704
    .line 705
    move-result-object v0

    .line 706
    invoke-direct {v2, v0, v13, v1}, La/q24;-><init>(La/rcf0;La/b4x;Ljava/util/List;)V

    .line 707
    .line 708
    .line 709
    return-object v2

    .line 710
    :cond_2f
    if-nez v7, :cond_30

    .line 711
    .line 712
    invoke-virtual {v4, v2}, Landroid/media/AudioManager;->getDevices(I)[Landroid/media/AudioDeviceInfo;

    .line 713
    .line 714
    .line 715
    move-result-object v2

    .line 716
    goto :goto_11

    .line 717
    :cond_30
    new-array v2, v12, [Landroid/media/AudioDeviceInfo;

    .line 718
    .line 719
    aput-object v7, v2, v16

    .line 720
    .line 721
    :goto_11
    array-length v4, v2

    .line 722
    move/from16 v5, v16

    .line 723
    .line 724
    :goto_12
    if-ge v5, v4, :cond_32

    .line 725
    .line 726
    aget-object v6, v2, v5

    .line 727
    .line 728
    invoke-virtual {v6}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 729
    .line 730
    .line 731
    move-result v6

    .line 732
    invoke-static {v6}, La/bkb;->Y(I)Z

    .line 733
    .line 734
    .line 735
    move-result v6

    .line 736
    if-eqz v6, :cond_31

    .line 737
    .line 738
    new-instance v0, La/q24;

    .line 739
    .line 740
    sget-object v2, La/p24;->d:La/p24;

    .line 741
    .line 742
    invoke-static {v2}, La/b4x;->t(Ljava/lang/Object;)La/rcf0;

    .line 743
    .line 744
    .line 745
    move-result-object v2

    .line 746
    invoke-direct {v0, v2, v13, v1}, La/q24;-><init>(La/rcf0;La/b4x;Ljava/util/List;)V

    .line 747
    .line 748
    .line 749
    return-object v0

    .line 750
    :cond_31
    add-int/lit8 v5, v5, 0x1

    .line 751
    .line 752
    goto :goto_12

    .line 753
    :cond_32
    new-instance v2, La/e4x;

    .line 754
    .line 755
    const/4 v4, 0x4

    .line 756
    invoke-direct {v2, v4}, La/r3x;-><init>(I)V

    .line 757
    .line 758
    .line 759
    invoke-virtual {v2, v3}, La/r3x;->b(Ljava/lang/Object;)V

    .line 760
    .line 761
    .line 762
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 763
    .line 764
    const/16 v5, 0x1d

    .line 765
    .line 766
    if-lt v4, v5, :cond_37

    .line 767
    .line 768
    invoke-static/range {p0 .. p0}, La/vtt0;->L(Landroid/content/Context;)Z

    .line 769
    .line 770
    .line 771
    move-result v4

    .line 772
    if-nez v4, :cond_33

    .line 773
    .line 774
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 775
    .line 776
    .line 777
    move-result-object v4

    .line 778
    invoke-virtual {v4, v9}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 779
    .line 780
    .line 781
    move-result v4

    .line 782
    if-eqz v4, :cond_37

    .line 783
    .line 784
    :cond_33
    invoke-static {}, La/b4x;->l()La/u3x;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    invoke-virtual {v8}, La/wcf0;->f()La/f4x;

    .line 789
    .line 790
    .line 791
    move-result-object v4

    .line 792
    invoke-virtual {v4}, La/s3x;->j()La/eet0;

    .line 793
    .line 794
    .line 795
    move-result-object v4

    .line 796
    :cond_34
    :goto_13
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 797
    .line 798
    .line 799
    move-result v5

    .line 800
    if-eqz v5, :cond_36

    .line 801
    .line 802
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 803
    .line 804
    .line 805
    move-result-object v5

    .line 806
    check-cast v5, Ljava/lang/Integer;

    .line 807
    .line 808
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 809
    .line 810
    .line 811
    move-result v6

    .line 812
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 813
    .line 814
    invoke-static {v6}, La/vtt0;->o(I)I

    .line 815
    .line 816
    .line 817
    move-result v8

    .line 818
    if-ge v7, v8, :cond_35

    .line 819
    .line 820
    goto :goto_13

    .line 821
    :cond_35
    new-instance v7, Landroid/media/AudioFormat$Builder;

    .line 822
    .line 823
    invoke-direct {v7}, Landroid/media/AudioFormat$Builder;-><init>()V

    .line 824
    .line 825
    .line 826
    invoke-virtual {v7, v10}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    .line 827
    .line 828
    .line 829
    move-result-object v7

    .line 830
    invoke-virtual {v7, v6}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    .line 831
    .line 832
    .line 833
    move-result-object v6

    .line 834
    const v7, 0xbb80

    .line 835
    .line 836
    .line 837
    invoke-virtual {v6, v7}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    .line 838
    .line 839
    .line 840
    move-result-object v6

    .line 841
    invoke-virtual {v6}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    .line 842
    .line 843
    .line 844
    move-result-object v6

    .line 845
    invoke-virtual/range {p2 .. p2}, La/m24;->a()Landroid/media/AudioAttributes;

    .line 846
    .line 847
    .line 848
    move-result-object v7

    .line 849
    invoke-static {v6, v7}, La/kw2;->u(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)Z

    .line 850
    .line 851
    .line 852
    move-result v6

    .line 853
    if-eqz v6, :cond_34

    .line 854
    .line 855
    invoke-virtual {v0, v5}, La/r3x;->b(Ljava/lang/Object;)V

    .line 856
    .line 857
    .line 858
    goto :goto_13

    .line 859
    :cond_36
    invoke-virtual {v0, v3}, La/r3x;->b(Ljava/lang/Object;)V

    .line 860
    .line 861
    .line 862
    invoke-virtual {v0}, La/u3x;->g()La/rcf0;

    .line 863
    .line 864
    .line 865
    move-result-object v0

    .line 866
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 867
    .line 868
    .line 869
    invoke-virtual {v2, v0}, La/r3x;->c(Ljava/lang/Iterable;)V

    .line 870
    .line 871
    .line 872
    new-instance v0, La/q24;

    .line 873
    .line 874
    invoke-virtual {v2}, La/e4x;->g()La/f4x;

    .line 875
    .line 876
    .line 877
    move-result-object v2

    .line 878
    invoke-static {v2}, La/n6x;->m0(Ljava/util/Collection;)[I

    .line 879
    .line 880
    .line 881
    move-result-object v2

    .line 882
    const/16 v3, 0xa

    .line 883
    .line 884
    invoke-static {v2, v3}, La/q24;->a([II)La/rcf0;

    .line 885
    .line 886
    .line 887
    move-result-object v2

    .line 888
    invoke-direct {v0, v2, v13, v1}, La/q24;-><init>(La/rcf0;La/b4x;Ljava/util/List;)V

    .line 889
    .line 890
    .line 891
    return-object v0

    .line 892
    :cond_37
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 893
    .line 894
    .line 895
    move-result-object v3

    .line 896
    const-string v4, "use_external_surround_sound_flag"

    .line 897
    .line 898
    move/from16 v5, v16

    .line 899
    .line 900
    invoke-static {v3, v4, v5}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 901
    .line 902
    .line 903
    move-result v4

    .line 904
    if-ne v4, v12, :cond_38

    .line 905
    .line 906
    move v5, v12

    .line 907
    goto :goto_14

    .line 908
    :cond_38
    const/4 v5, 0x0

    .line 909
    :goto_14
    if-nez v5, :cond_3a

    .line 910
    .line 911
    sget-object v4, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 912
    .line 913
    const-string v6, "Amazon"

    .line 914
    .line 915
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 916
    .line 917
    .line 918
    move-result v6

    .line 919
    if-nez v6, :cond_3a

    .line 920
    .line 921
    const-string v6, "Xiaomi"

    .line 922
    .line 923
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 924
    .line 925
    .line 926
    move-result v4

    .line 927
    if-eqz v4, :cond_39

    .line 928
    .line 929
    goto :goto_15

    .line 930
    :cond_39
    const/4 v6, 0x0

    .line 931
    goto :goto_16

    .line 932
    :cond_3a
    :goto_15
    const-string v4, "external_surround_sound_enabled"

    .line 933
    .line 934
    const/4 v6, 0x0

    .line 935
    invoke-static {v3, v4, v6}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    .line 936
    .line 937
    .line 938
    move-result v3

    .line 939
    if-ne v3, v12, :cond_3b

    .line 940
    .line 941
    sget-object v3, La/q24;->g:La/rcf0;

    .line 942
    .line 943
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 944
    .line 945
    .line 946
    invoke-virtual {v2, v3}, La/r3x;->c(Ljava/lang/Iterable;)V

    .line 947
    .line 948
    .line 949
    :cond_3b
    :goto_16
    if-eqz v0, :cond_3d

    .line 950
    .line 951
    if-nez v5, :cond_3d

    .line 952
    .line 953
    const-string v3, "android.media.extra.AUDIO_PLUG_STATE"

    .line 954
    .line 955
    invoke-virtual {v0, v3, v6}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 956
    .line 957
    .line 958
    move-result v3

    .line 959
    if-ne v3, v12, :cond_3d

    .line 960
    .line 961
    const-string v3, "android.media.extra.ENCODINGS"

    .line 962
    .line 963
    invoke-virtual {v0, v3}, Landroid/content/Intent;->getIntArrayExtra(Ljava/lang/String;)[I

    .line 964
    .line 965
    .line 966
    move-result-object v3

    .line 967
    if-eqz v3, :cond_3c

    .line 968
    .line 969
    invoke-static {v3}, La/n6x;->o([I)Ljava/util/List;

    .line 970
    .line 971
    .line 972
    move-result-object v3

    .line 973
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 974
    .line 975
    .line 976
    invoke-virtual {v2, v3}, La/r3x;->c(Ljava/lang/Iterable;)V

    .line 977
    .line 978
    .line 979
    :cond_3c
    new-instance v3, La/q24;

    .line 980
    .line 981
    invoke-virtual {v2}, La/e4x;->g()La/f4x;

    .line 982
    .line 983
    .line 984
    move-result-object v2

    .line 985
    invoke-static {v2}, La/n6x;->m0(Ljava/util/Collection;)[I

    .line 986
    .line 987
    .line 988
    move-result-object v2

    .line 989
    const-string v4, "android.media.extra.MAX_CHANNEL_COUNT"

    .line 990
    .line 991
    const/16 v5, 0xa

    .line 992
    .line 993
    invoke-virtual {v0, v4, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 994
    .line 995
    .line 996
    move-result v0

    .line 997
    invoke-static {v2, v0}, La/q24;->a([II)La/rcf0;

    .line 998
    .line 999
    .line 1000
    move-result-object v0

    .line 1001
    invoke-direct {v3, v0, v13, v1}, La/q24;-><init>(La/rcf0;La/b4x;Ljava/util/List;)V

    .line 1002
    .line 1003
    .line 1004
    return-object v3

    .line 1005
    :cond_3d
    const/16 v5, 0xa

    .line 1006
    .line 1007
    new-instance v0, La/q24;

    .line 1008
    .line 1009
    invoke-virtual {v2}, La/e4x;->g()La/f4x;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v2

    .line 1013
    invoke-static {v2}, La/n6x;->m0(Ljava/util/Collection;)[I

    .line 1014
    .line 1015
    .line 1016
    move-result-object v2

    .line 1017
    invoke-static {v2, v5}, La/q24;->a([II)La/rcf0;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v2

    .line 1021
    invoke-direct {v0, v2, v13, v1}, La/q24;-><init>(La/rcf0;La/b4x;Ljava/util/List;)V

    .line 1022
    .line 1023
    .line 1024
    return-object v0
.end method


# virtual methods
.method public final c(Landroidx/media3/common/b;La/m24;)Landroid/util/Pair;
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 4
    .line 5
    iget v2, v0, Landroidx/media3/common/b;->K:I

    .line 6
    .line 7
    iget v3, v0, Landroidx/media3/common/b;->J:I

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v4, v0, Landroidx/media3/common/b;->l:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v1, v4}, La/mg40;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    sget-object v5, La/q24;->h:La/wcf0;

    .line 23
    .line 24
    invoke-virtual {v5, v4}, La/wcf0;->containsKey(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-nez v4, :cond_0

    .line 29
    .line 30
    goto/16 :goto_a

    .line 31
    .line 32
    :cond_0
    const/4 v4, 0x7

    .line 33
    const/4 v6, 0x6

    .line 34
    const/16 v7, 0x8

    .line 35
    .line 36
    const/16 v8, 0x12

    .line 37
    .line 38
    move-object/from16 v9, p0

    .line 39
    .line 40
    iget-object v9, v9, La/q24;->a:Landroid/util/SparseArray;

    .line 41
    .line 42
    if-ne v1, v8, :cond_1

    .line 43
    .line 44
    invoke-static {v9, v8}, La/vtt0;->k(Landroid/util/SparseArray;I)Z

    .line 45
    .line 46
    .line 47
    move-result v10

    .line 48
    if-nez v10, :cond_1

    .line 49
    .line 50
    move v1, v6

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    if-ne v1, v7, :cond_2

    .line 53
    .line 54
    invoke-static {v9, v7}, La/vtt0;->k(Landroid/util/SparseArray;I)Z

    .line 55
    .line 56
    .line 57
    move-result v10

    .line 58
    if-eqz v10, :cond_3

    .line 59
    .line 60
    :cond_2
    const/16 v10, 0x1e

    .line 61
    .line 62
    if-ne v1, v10, :cond_4

    .line 63
    .line 64
    invoke-static {v9, v10}, La/vtt0;->k(Landroid/util/SparseArray;I)Z

    .line 65
    .line 66
    .line 67
    move-result v10

    .line 68
    if-nez v10, :cond_4

    .line 69
    .line 70
    :cond_3
    move v1, v4

    .line 71
    :cond_4
    :goto_0
    invoke-static {v9, v1}, La/vtt0;->k(Landroid/util/SparseArray;I)Z

    .line 72
    .line 73
    .line 74
    move-result v10

    .line 75
    if-nez v10, :cond_5

    .line 76
    .line 77
    goto/16 :goto_a

    .line 78
    .line 79
    :cond_5
    invoke-virtual {v9, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v9

    .line 83
    check-cast v9, La/p24;

    .line 84
    .line 85
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    iget v10, v9, La/p24;->b:I

    .line 89
    .line 90
    iget-object v11, v9, La/p24;->c:La/f4x;

    .line 91
    .line 92
    const/4 v12, 0x1

    .line 93
    const/4 v13, 0x0

    .line 94
    const/16 v14, 0xa

    .line 95
    .line 96
    const/4 v15, -0x1

    .line 97
    if-eq v3, v15, :cond_d

    .line 98
    .line 99
    if-ne v1, v8, :cond_6

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_6
    iget-object v0, v0, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 103
    .line 104
    const-string v5, "audio/vnd.dts.uhd;profile=p2"

    .line 105
    .line 106
    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_7

    .line 111
    .line 112
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 113
    .line 114
    const/16 v5, 0x21

    .line 115
    .line 116
    if-ge v0, v5, :cond_7

    .line 117
    .line 118
    if-le v3, v14, :cond_c

    .line 119
    .line 120
    goto/16 :goto_a

    .line 121
    .line 122
    :cond_7
    sget-object v0, La/p24;->d:La/p24;

    .line 123
    .line 124
    if-nez v11, :cond_8

    .line 125
    .line 126
    if-gt v3, v10, :cond_b

    .line 127
    .line 128
    move v13, v12

    .line 129
    goto :goto_2

    .line 130
    :cond_8
    if-eq v2, v15, :cond_9

    .line 131
    .line 132
    move v0, v2

    .line 133
    goto :goto_1

    .line 134
    :cond_9
    invoke-static {v3}, La/vtt0;->p(I)I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    :goto_1
    if-nez v0, :cond_a

    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_a
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {v11, v0}, La/s3x;->contains(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v13

    .line 149
    :cond_b
    :goto_2
    if-nez v13, :cond_c

    .line 150
    .line 151
    goto/16 :goto_a

    .line 152
    .line 153
    :cond_c
    move v10, v3

    .line 154
    goto :goto_7

    .line 155
    :cond_d
    :goto_3
    iget v0, v0, Landroidx/media3/common/b;->L:I

    .line 156
    .line 157
    if-eq v0, v15, :cond_e

    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_e
    const v0, 0xbb80

    .line 161
    .line 162
    .line 163
    :goto_4
    iget v8, v9, La/p24;->a:I

    .line 164
    .line 165
    if-eqz v11, :cond_f

    .line 166
    .line 167
    goto :goto_7

    .line 168
    :cond_f
    sget v9, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 169
    .line 170
    const/16 v10, 0x1d

    .line 171
    .line 172
    if-lt v9, v10, :cond_13

    .line 173
    .line 174
    move v10, v14

    .line 175
    :goto_5
    if-lez v10, :cond_12

    .line 176
    .line 177
    invoke-static {v10}, La/vtt0;->p(I)I

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    if-nez v5, :cond_10

    .line 182
    .line 183
    goto :goto_6

    .line 184
    :cond_10
    new-instance v9, Landroid/media/AudioFormat$Builder;

    .line 185
    .line 186
    invoke-direct {v9}, Landroid/media/AudioFormat$Builder;-><init>()V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v9, v8}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    .line 190
    .line 191
    .line 192
    move-result-object v9

    .line 193
    invoke-virtual {v9, v0}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    .line 194
    .line 195
    .line 196
    move-result-object v9

    .line 197
    invoke-virtual {v9, v5}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    invoke-virtual {v5}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    invoke-virtual/range {p2 .. p2}, La/m24;->a()Landroid/media/AudioAttributes;

    .line 206
    .line 207
    .line 208
    move-result-object v9

    .line 209
    invoke-static {v5, v9}, La/kw2;->u(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)Z

    .line 210
    .line 211
    .line 212
    move-result v5

    .line 213
    if-eqz v5, :cond_11

    .line 214
    .line 215
    goto :goto_7

    .line 216
    :cond_11
    :goto_6
    add-int/lit8 v10, v10, -0x1

    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_12
    move v10, v13

    .line 220
    goto :goto_7

    .line 221
    :cond_13
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 226
    .line 227
    .line 228
    move-result-object v8

    .line 229
    invoke-virtual {v5, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    if-eqz v0, :cond_14

    .line 234
    .line 235
    move-object v8, v0

    .line 236
    :cond_14
    check-cast v8, Ljava/lang/Integer;

    .line 237
    .line 238
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 239
    .line 240
    .line 241
    move-result v10

    .line 242
    :goto_7
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 243
    .line 244
    const/16 v5, 0x1c

    .line 245
    .line 246
    if-gt v0, v5, :cond_16

    .line 247
    .line 248
    if-ne v10, v4, :cond_15

    .line 249
    .line 250
    move v6, v7

    .line 251
    goto :goto_8

    .line 252
    :cond_15
    const/4 v4, 0x3

    .line 253
    if-eq v10, v4, :cond_17

    .line 254
    .line 255
    const/4 v4, 0x4

    .line 256
    if-eq v10, v4, :cond_17

    .line 257
    .line 258
    const/4 v4, 0x5

    .line 259
    if-ne v10, v4, :cond_16

    .line 260
    .line 261
    goto :goto_8

    .line 262
    :cond_16
    move v6, v10

    .line 263
    :cond_17
    :goto_8
    sget-object v4, La/hn30;->a:Ljava/util/HashSet;

    .line 264
    .line 265
    const/16 v4, 0x1a

    .line 266
    .line 267
    if-gt v0, v4, :cond_18

    .line 268
    .line 269
    const-string v0, "fugu"

    .line 270
    .line 271
    sget-object v4, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    .line 272
    .line 273
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    if-eqz v0, :cond_18

    .line 278
    .line 279
    if-ne v6, v12, :cond_18

    .line 280
    .line 281
    const/4 v6, 0x2

    .line 282
    :cond_18
    if-eq v2, v15, :cond_19

    .line 283
    .line 284
    if-ne v3, v6, :cond_19

    .line 285
    .line 286
    goto :goto_9

    .line 287
    :cond_19
    invoke-static {v6}, La/vtt0;->p(I)I

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    :goto_9
    if-nez v2, :cond_1a

    .line 292
    .line 293
    :goto_a
    const/4 v0, 0x0

    .line 294
    return-object v0

    .line 295
    :cond_1a
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    invoke-static {v0, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    goto/16 :goto_3

    .line 5
    .line 6
    :cond_0
    instance-of v1, p1, La/q24;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    goto/16 :goto_4

    .line 12
    .line 13
    :cond_1
    check-cast p1, La/q24;

    .line 14
    .line 15
    iget-object v1, p1, La/q24;->a:Landroid/util/SparseArray;

    .line 16
    .line 17
    sget-object v3, La/vtt0;->a:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v3, p0, La/q24;->a:Landroid/util/SparseArray;

    .line 20
    .line 21
    if-nez v3, :cond_4

    .line 22
    .line 23
    if-nez v1, :cond_3

    .line 24
    .line 25
    :cond_2
    move v1, v0

    .line 26
    goto :goto_2

    .line 27
    :cond_3
    :goto_0
    move v1, v2

    .line 28
    goto :goto_2

    .line 29
    :cond_4
    if-nez v1, :cond_5

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_5
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 33
    .line 34
    const/16 v5, 0x1f

    .line 35
    .line 36
    if-lt v4, v5, :cond_6

    .line 37
    .line 38
    invoke-static {v3, v1}, La/tl50;->A(Landroid/util/SparseArray;Landroid/util/SparseArray;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    goto :goto_2

    .line 43
    :cond_6
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    if-eq v4, v5, :cond_7

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_7
    move v5, v2

    .line 55
    :goto_1
    if-ge v5, v4, :cond_2

    .line 56
    .line 57
    invoke-virtual {v3, v5}, Landroid/util/SparseArray;->keyAt(I)I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    invoke-virtual {v3, v5}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-virtual {v1, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    invoke-static {v7, v6}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    if-nez v6, :cond_8

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_8
    add-int/lit8 v5, v5, 0x1

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :goto_2
    if-eqz v1, :cond_9

    .line 80
    .line 81
    iget v1, p0, La/q24;->b:I

    .line 82
    .line 83
    iget v3, p1, La/q24;->b:I

    .line 84
    .line 85
    if-ne v1, v3, :cond_9

    .line 86
    .line 87
    iget-object v1, p0, La/q24;->c:La/b4x;

    .line 88
    .line 89
    iget-object v3, p1, La/q24;->c:La/b4x;

    .line 90
    .line 91
    invoke-static {v1, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_9

    .line 96
    .line 97
    iget-object p0, p0, La/q24;->d:La/b4x;

    .line 98
    .line 99
    iget-object p1, p1, La/q24;->d:La/b4x;

    .line 100
    .line 101
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    if-eqz p0, :cond_9

    .line 106
    .line 107
    :goto_3
    return v0

    .line 108
    :cond_9
    :goto_4
    return v2
.end method

.method public final hashCode()I
    .locals 6

    .line 1
    iget v0, p0, La/q24;->b:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    mul-int/2addr v0, v1

    .line 6
    sget-object v2, La/vtt0;->a:Ljava/lang/String;

    .line 7
    .line 8
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 9
    .line 10
    iget-object v3, p0, La/q24;->a:Landroid/util/SparseArray;

    .line 11
    .line 12
    if-lt v2, v1, :cond_0

    .line 13
    .line 14
    invoke-static {v3}, La/tl50;->b(Landroid/util/SparseArray;)I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    const/16 v2, 0x11

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    :goto_0
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-ge v4, v5, :cond_1

    .line 27
    .line 28
    mul-int/lit8 v2, v2, 0x1f

    .line 29
    .line 30
    invoke-virtual {v3, v4}, Landroid/util/SparseArray;->keyAt(I)I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    add-int/2addr v5, v2

    .line 35
    mul-int/2addr v5, v1

    .line 36
    invoke-virtual {v3, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-static {v2}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    add-int/2addr v2, v5

    .line 45
    add-int/lit8 v4, v4, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    :goto_1
    add-int/2addr v0, v2

    .line 49
    mul-int/2addr v0, v1

    .line 50
    iget-object v2, p0, La/q24;->c:La/b4x;

    .line 51
    .line 52
    invoke-static {v2}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    add-int/2addr v2, v0

    .line 57
    mul-int/2addr v2, v1

    .line 58
    iget-object p0, p0, La/q24;->d:La/b4x;

    .line 59
    .line 60
    invoke-static {p0}, Ljava/util/Objects;->hashCode(Ljava/lang/Object;)I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    add-int/2addr p0, v2

    .line 65
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "AudioCapabilities[maxChannelCount="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, La/q24;->b:I

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", audioProfiles="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/q24;->a:Landroid/util/SparseArray;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", speakerLayoutChannelMasks="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/q24;->c:La/b4x;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", spatializerChannelMasks="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, La/q24;->d:La/b4x;

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string p0, "]"

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method
