.class public final La/x6r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/fuo;


# static fields
.field public static final O:[B

.field public static final P:Landroidx/media3/common/b;


# instance fields
.field public A:J

.field public B:La/w6r;

.field public C:I

.field public D:I

.field public E:I

.field public F:Z

.field public G:Z

.field public H:La/huo;

.field public I:[La/ncs0;

.field public J:[La/ncs0;

.field public K:Z

.field public L:Z

.field public M:J

.field public N:J

.field public final a:La/jfn0;

.field public final b:I

.field public final c:Ljava/util/List;

.field public final d:Landroid/util/SparseArray;

.field public final e:La/fq80;

.field public final f:La/fq80;

.field public final g:La/fq80;

.field public final h:[B

.field public final i:La/fq80;

.field public final j:La/coq0;

.field public final k:La/iqi;

.field public final l:La/fq80;

.field public final m:Ljava/util/ArrayDeque;

.field public final n:Ljava/util/ArrayDeque;

.field public final o:La/fp;

.field public final p:La/ajc;

.field public q:La/rcf0;

.field public r:B

.field public s:I

.field public t:J

.field public u:I

.field public v:La/fq80;

.field public w:J

.field public x:I

.field public y:J

.field public z:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    fill-array-data v0, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v0, La/x6r;->O:[B

    .line 9
    .line 10
    new-instance v0, La/awq;

    .line 11
    .line 12
    invoke-direct {v0}, La/awq;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v1, "application/x-emsg"

    .line 16
    .line 17
    invoke-static {v1}, La/mg40;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iput-object v1, v0, La/awq;->o:Ljava/lang/String;

    .line 22
    .line 23
    new-instance v1, Landroidx/media3/common/b;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Landroidx/media3/common/b;-><init>(La/awq;)V

    .line 26
    .line 27
    .line 28
    sput-object v1, La/x6r;->P:Landroidx/media3/common/b;

    .line 29
    .line 30
    return-void

    .line 31
    :array_0
    .array-data 1
        -0x5et
        0x39t
        0x4ft
        0x52t
        0x5at
        -0x65t
        0x4ft
        0x14t
        -0x5et
        0x44t
        0x6ct
        0x42t
        0x7ct
        0x64t
        -0x73t
        -0xct
    .end array-data
.end method

.method public constructor <init>(La/jfn0;ILa/coq0;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/x6r;->a:La/jfn0;

    .line 5
    .line 6
    iput p2, p0, La/x6r;->b:I

    .line 7
    .line 8
    iput-object p3, p0, La/x6r;->j:La/coq0;

    .line 9
    .line 10
    invoke-static {p4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, La/x6r;->c:Ljava/util/List;

    .line 15
    .line 16
    new-instance p1, La/iqi;

    .line 17
    .line 18
    invoke-direct {p1}, La/iqi;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, La/x6r;->k:La/iqi;

    .line 22
    .line 23
    new-instance p1, La/fq80;

    .line 24
    .line 25
    const/16 p2, 0x10

    .line 26
    .line 27
    invoke-direct {p1, p2}, La/fq80;-><init>(I)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, La/x6r;->l:La/fq80;

    .line 31
    .line 32
    new-instance p1, La/fq80;

    .line 33
    .line 34
    sget-object p3, La/ntr;->j:[B

    .line 35
    .line 36
    invoke-direct {p1, p3}, La/fq80;-><init>([B)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, La/x6r;->e:La/fq80;

    .line 40
    .line 41
    new-instance p1, La/fq80;

    .line 42
    .line 43
    const/4 p3, 0x6

    .line 44
    invoke-direct {p1, p3}, La/fq80;-><init>(I)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, La/x6r;->f:La/fq80;

    .line 48
    .line 49
    new-instance p1, La/fq80;

    .line 50
    .line 51
    invoke-direct {p1}, La/fq80;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, La/x6r;->g:La/fq80;

    .line 55
    .line 56
    new-array p1, p2, [B

    .line 57
    .line 58
    iput-object p1, p0, La/x6r;->h:[B

    .line 59
    .line 60
    new-instance p2, La/fq80;

    .line 61
    .line 62
    invoke-direct {p2, p1}, La/fq80;-><init>([B)V

    .line 63
    .line 64
    .line 65
    iput-object p2, p0, La/x6r;->i:La/fq80;

    .line 66
    .line 67
    new-instance p1, Ljava/util/ArrayDeque;

    .line 68
    .line 69
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, La/x6r;->m:Ljava/util/ArrayDeque;

    .line 73
    .line 74
    new-instance p1, Ljava/util/ArrayDeque;

    .line 75
    .line 76
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 77
    .line 78
    .line 79
    iput-object p1, p0, La/x6r;->n:Ljava/util/ArrayDeque;

    .line 80
    .line 81
    new-instance p1, Landroid/util/SparseArray;

    .line 82
    .line 83
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 84
    .line 85
    .line 86
    iput-object p1, p0, La/x6r;->d:Landroid/util/SparseArray;

    .line 87
    .line 88
    sget-object p1, La/b4x;->b:La/v3x;

    .line 89
    .line 90
    sget-object p1, La/rcf0;->e:La/rcf0;

    .line 91
    .line 92
    iput-object p1, p0, La/x6r;->q:La/rcf0;

    .line 93
    .line 94
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    iput-wide p1, p0, La/x6r;->z:J

    .line 100
    .line 101
    iput-wide p1, p0, La/x6r;->y:J

    .line 102
    .line 103
    iput-wide p1, p0, La/x6r;->A:J

    .line 104
    .line 105
    sget-object p1, La/huo;->f0:La/sek;

    .line 106
    .line 107
    iput-object p1, p0, La/x6r;->H:La/huo;

    .line 108
    .line 109
    const/4 p1, 0x0

    .line 110
    new-array p2, p1, [La/ncs0;

    .line 111
    .line 112
    iput-object p2, p0, La/x6r;->I:[La/ncs0;

    .line 113
    .line 114
    new-array p2, p1, [La/ncs0;

    .line 115
    .line 116
    iput-object p2, p0, La/x6r;->J:[La/ncs0;

    .line 117
    .line 118
    new-instance p2, La/fp;

    .line 119
    .line 120
    new-instance p3, La/viq;

    .line 121
    .line 122
    const/4 p4, 0x2

    .line 123
    invoke-direct {p3, p0, p4}, La/viq;-><init>(Ljava/lang/Object;B)V

    .line 124
    .line 125
    .line 126
    invoke-direct {p2, p3}, La/fp;-><init>(La/ikf0;)V

    .line 127
    .line 128
    .line 129
    iput-object p2, p0, La/x6r;->o:La/fp;

    .line 130
    .line 131
    new-instance p2, La/ajc;

    .line 132
    .line 133
    invoke-direct {p2, p1}, La/ajc;-><init>(B)V

    .line 134
    .line 135
    .line 136
    iput-object p2, p0, La/x6r;->p:La/ajc;

    .line 137
    .line 138
    const-wide/16 p1, -0x1

    .line 139
    .line 140
    iput-wide p1, p0, La/x6r;->M:J

    .line 141
    .line 142
    iput-wide p1, p0, La/x6r;->N:J

    .line 143
    .line 144
    return-void
.end method

.method public static h(Ljava/util/ArrayList;)Landroidx/media3/common/DrmInitData;
    .locals 18

    .line 1
    invoke-virtual/range {p0 .. p0}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v2, 0x0

    .line 6
    move v3, v2

    .line 7
    const/4 v4, 0x0

    .line 8
    :goto_0
    if-ge v3, v0, :cond_b

    .line 9
    .line 10
    move-object/from16 v5, p0

    .line 11
    .line 12
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v6

    .line 16
    check-cast v6, La/fv40;

    .line 17
    .line 18
    iget v7, v6, La/syx;->b:I

    .line 19
    .line 20
    const v8, 0x70737368    # 3.013775E29f

    .line 21
    .line 22
    .line 23
    if-ne v7, v8, :cond_a

    .line 24
    .line 25
    if-nez v4, :cond_0

    .line 26
    .line 27
    new-instance v4, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    :cond_0
    iget-object v6, v6, La/fv40;->e:La/fq80;

    .line 33
    .line 34
    iget-object v6, v6, La/fq80;->a:[B

    .line 35
    .line 36
    new-instance v7, La/fq80;

    .line 37
    .line 38
    invoke-direct {v7, v6}, La/fq80;-><init>([B)V

    .line 39
    .line 40
    .line 41
    iget v9, v7, La/fq80;->c:I

    .line 42
    .line 43
    const/16 v10, 0x20

    .line 44
    .line 45
    if-ge v9, v10, :cond_1

    .line 46
    .line 47
    :goto_1
    const/4 v1, 0x0

    .line 48
    goto/16 :goto_4

    .line 49
    .line 50
    :cond_1
    invoke-virtual {v7, v2}, La/fq80;->M(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v7}, La/fq80;->a()I

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    invoke-virtual {v7}, La/fq80;->m()I

    .line 58
    .line 59
    .line 60
    move-result v10

    .line 61
    const-string v11, "PsshAtomUtil"

    .line 62
    .line 63
    if-eq v10, v9, :cond_2

    .line 64
    .line 65
    new-instance v7, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string v8, "Advertised atom size ("

    .line 68
    .line 69
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v8, ") does not match buffer size: "

    .line 76
    .line 77
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    invoke-static {v11, v7}, La/f1t0;->g0(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    invoke-virtual {v7}, La/fq80;->m()I

    .line 92
    .line 93
    .line 94
    move-result v9

    .line 95
    if-eq v9, v8, :cond_3

    .line 96
    .line 97
    const-string v7, "Atom type is not pssh: "

    .line 98
    .line 99
    invoke-static {v9, v7, v11}, La/rw2;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_3
    invoke-virtual {v7}, La/fq80;->m()I

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    invoke-static {v8}, La/hr8;->e(I)I

    .line 108
    .line 109
    .line 110
    move-result v8

    .line 111
    const/4 v9, 0x1

    .line 112
    if-le v8, v9, :cond_4

    .line 113
    .line 114
    const-string v7, "Unsupported pssh version: "

    .line 115
    .line 116
    invoke-static {v8, v7, v11}, La/rw2;->u(ILjava/lang/String;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_4
    new-instance v10, Ljava/util/UUID;

    .line 121
    .line 122
    invoke-virtual {v7}, La/fq80;->t()J

    .line 123
    .line 124
    .line 125
    move-result-wide v12

    .line 126
    invoke-virtual {v7}, La/fq80;->t()J

    .line 127
    .line 128
    .line 129
    move-result-wide v14

    .line 130
    invoke-direct {v10, v12, v13, v14, v15}, Ljava/util/UUID;-><init>(JJ)V

    .line 131
    .line 132
    .line 133
    if-ne v8, v9, :cond_6

    .line 134
    .line 135
    invoke-virtual {v7}, La/fq80;->D()I

    .line 136
    .line 137
    .line 138
    move-result v9

    .line 139
    new-array v12, v9, [Ljava/util/UUID;

    .line 140
    .line 141
    move v13, v2

    .line 142
    :goto_2
    if-ge v13, v9, :cond_5

    .line 143
    .line 144
    new-instance v14, Ljava/util/UUID;

    .line 145
    .line 146
    invoke-virtual {v7}, La/fq80;->t()J

    .line 147
    .line 148
    .line 149
    move-result-wide v1

    .line 150
    move-object/from16 v16, v12

    .line 151
    .line 152
    move/from16 v17, v13

    .line 153
    .line 154
    invoke-virtual {v7}, La/fq80;->t()J

    .line 155
    .line 156
    .line 157
    move-result-wide v12

    .line 158
    invoke-direct {v14, v1, v2, v12, v13}, Ljava/util/UUID;-><init>(JJ)V

    .line 159
    .line 160
    .line 161
    aput-object v14, v16, v17

    .line 162
    .line 163
    add-int/lit8 v13, v17, 0x1

    .line 164
    .line 165
    move-object/from16 v12, v16

    .line 166
    .line 167
    const/4 v2, 0x0

    .line 168
    goto :goto_2

    .line 169
    :cond_5
    move-object/from16 v16, v12

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_6
    const/4 v12, 0x0

    .line 173
    :goto_3
    invoke-virtual {v7}, La/fq80;->D()I

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    invoke-virtual {v7}, La/fq80;->a()I

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    if-eq v1, v2, :cond_7

    .line 182
    .line 183
    new-instance v7, Ljava/lang/StringBuilder;

    .line 184
    .line 185
    const-string v8, "Atom data size ("

    .line 186
    .line 187
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    const-string v1, ") does not match the bytes left: "

    .line 194
    .line 195
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-static {v11, v1}, La/f1t0;->g0(Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    goto/16 :goto_1

    .line 209
    .line 210
    :cond_7
    new-array v2, v1, [B

    .line 211
    .line 212
    const/4 v9, 0x0

    .line 213
    invoke-virtual {v7, v2, v9, v1}, La/fq80;->k([BII)V

    .line 214
    .line 215
    .line 216
    new-instance v1, La/pv00;

    .line 217
    .line 218
    invoke-direct {v1, v10, v8, v2, v12}, La/pv00;-><init>(Ljava/util/UUID;I[B[Ljava/util/UUID;)V

    .line 219
    .line 220
    .line 221
    :goto_4
    if-nez v1, :cond_8

    .line 222
    .line 223
    const/4 v1, 0x0

    .line 224
    goto :goto_5

    .line 225
    :cond_8
    iget-object v1, v1, La/pv00;->a:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v1, Ljava/util/UUID;

    .line 228
    .line 229
    :goto_5
    if-nez v1, :cond_9

    .line 230
    .line 231
    const-string v1, "FragmentedMp4Extractor"

    .line 232
    .line 233
    const-string v2, "Skipped pssh atom (failed to extract uuid)"

    .line 234
    .line 235
    invoke-static {v1, v2}, La/f1t0;->g0(Ljava/lang/String;Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    goto :goto_6

    .line 239
    :cond_9
    new-instance v2, Landroidx/media3/common/DrmInitData$SchemeData;

    .line 240
    .line 241
    const-string v7, "video/mp4"

    .line 242
    .line 243
    const/4 v15, 0x0

    .line 244
    invoke-direct {v2, v1, v15, v7, v6}, Landroidx/media3/common/DrmInitData$SchemeData;-><init>(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;[B)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    goto :goto_7

    .line 251
    :cond_a
    :goto_6
    const/4 v15, 0x0

    .line 252
    :goto_7
    add-int/lit8 v3, v3, 0x1

    .line 253
    .line 254
    const/4 v2, 0x0

    .line 255
    goto/16 :goto_0

    .line 256
    .line 257
    :cond_b
    const/4 v15, 0x0

    .line 258
    if-nez v4, :cond_c

    .line 259
    .line 260
    return-object v15

    .line 261
    :cond_c
    new-instance v0, Landroidx/media3/common/DrmInitData;

    .line 262
    .line 263
    const/4 v9, 0x0

    .line 264
    new-array v1, v9, [Landroidx/media3/common/DrmInitData$SchemeData;

    .line 265
    .line 266
    invoke-interface {v4, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    check-cast v1, [Landroidx/media3/common/DrmInitData$SchemeData;

    .line 271
    .line 272
    invoke-direct {v0, v15, v9, v1}, Landroidx/media3/common/DrmInitData;-><init>(Ljava/lang/String;Z[Landroidx/media3/common/DrmInitData$SchemeData;)V

    .line 273
    .line 274
    .line 275
    return-object v0
.end method

.method public static j(La/fq80;ILa/xbs0;)V
    .locals 5

    .line 1
    add-int/lit8 p1, p1, 0x8

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/fq80;->M(I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, La/fq80;->m()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    sget-object v0, La/hr8;->a:[B

    .line 11
    .line 12
    and-int/lit8 v0, p1, 0x1

    .line 13
    .line 14
    if-nez v0, :cond_3

    .line 15
    .line 16
    and-int/lit8 p1, p1, 0x2

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    const/4 v1, 0x1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    move p1, v1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move p1, v0

    .line 25
    :goto_0
    invoke-virtual {p0}, La/fq80;->D()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    iget-object p0, p2, La/xbs0;->l:[Z

    .line 32
    .line 33
    iget p1, p2, La/xbs0;->e:I

    .line 34
    .line 35
    invoke-static {p0, v0, p1, v0}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    iget v3, p2, La/xbs0;->e:I

    .line 40
    .line 41
    iget-object v4, p2, La/xbs0;->n:La/fq80;

    .line 42
    .line 43
    if-ne v2, v3, :cond_2

    .line 44
    .line 45
    iget-object v3, p2, La/xbs0;->l:[Z

    .line 46
    .line 47
    invoke-static {v3, v0, v2, p1}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, La/fq80;->a()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    invoke-virtual {v4, p1}, La/fq80;->J(I)V

    .line 55
    .line 56
    .line 57
    iput-boolean v1, p2, La/xbs0;->k:Z

    .line 58
    .line 59
    iput-boolean v1, p2, La/xbs0;->o:Z

    .line 60
    .line 61
    iget-object p1, v4, La/fq80;->a:[B

    .line 62
    .line 63
    iget v1, v4, La/fq80;->c:I

    .line 64
    .line 65
    invoke-virtual {p0, p1, v0, v1}, La/fq80;->k([BII)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4, v0}, La/fq80;->M(I)V

    .line 69
    .line 70
    .line 71
    iput-boolean v0, p2, La/xbs0;->o:Z

    .line 72
    .line 73
    return-void

    .line 74
    :cond_2
    const-string p0, "Senc sample count "

    .line 75
    .line 76
    const-string p1, " is different from fragment sample count"

    .line 77
    .line 78
    invoke-static {v2, p0, p1}, La/b1j;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    iget p1, p2, La/xbs0;->e:I

    .line 83
    .line 84
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    const/4 p1, 0x0

    .line 92
    invoke-static {p0, p1}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    throw p0

    .line 97
    :cond_3
    const-string p0, "Overriding TrackEncryptionBox parameters is unsupported."

    .line 98
    .line 99
    invoke-static {p0}, La/kq80;->e(Ljava/lang/String;)La/kq80;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    throw p0
.end method

.method public static k(JLa/fq80;)Landroid/util/Pair;
    .locals 22

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {v0, v1}, La/fq80;->M(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, La/fq80;->m()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-static {v1}, La/hr8;->e(I)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x4

    .line 17
    invoke-virtual {v0, v2}, La/fq80;->N(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, La/fq80;->B()J

    .line 21
    .line 22
    .line 23
    move-result-wide v7

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0}, La/fq80;->B()J

    .line 27
    .line 28
    .line 29
    move-result-wide v3

    .line 30
    invoke-virtual {v0}, La/fq80;->B()J

    .line 31
    .line 32
    .line 33
    move-result-wide v5

    .line 34
    :goto_0
    add-long v5, v5, p0

    .line 35
    .line 36
    move-wide v10, v5

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    invoke-virtual {v0}, La/fq80;->F()J

    .line 39
    .line 40
    .line 41
    move-result-wide v3

    .line 42
    invoke-virtual {v0}, La/fq80;->F()J

    .line 43
    .line 44
    .line 45
    move-result-wide v5

    .line 46
    goto :goto_0

    .line 47
    :goto_1
    sget-object v1, La/vtt0;->a:Ljava/lang/String;

    .line 48
    .line 49
    sget-object v9, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 50
    .line 51
    const-wide/32 v5, 0xf4240

    .line 52
    .line 53
    .line 54
    invoke-static/range {v3 .. v9}, La/vtt0;->T(JJJLjava/math/RoundingMode;)J

    .line 55
    .line 56
    .line 57
    move-result-wide v12

    .line 58
    const/4 v1, 0x2

    .line 59
    invoke-virtual {v0, v1}, La/fq80;->N(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, La/fq80;->G()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    new-array v14, v1, [I

    .line 67
    .line 68
    new-array v15, v1, [J

    .line 69
    .line 70
    new-array v5, v1, [J

    .line 71
    .line 72
    new-array v6, v1, [J

    .line 73
    .line 74
    const/4 v9, 0x0

    .line 75
    move-wide/from16 v16, v10

    .line 76
    .line 77
    move-wide/from16 v18, v12

    .line 78
    .line 79
    move v10, v9

    .line 80
    :goto_2
    if-ge v10, v1, :cond_2

    .line 81
    .line 82
    invoke-virtual {v0}, La/fq80;->m()I

    .line 83
    .line 84
    .line 85
    move-result v9

    .line 86
    const/high16 v11, -0x80000000

    .line 87
    .line 88
    and-int/2addr v11, v9

    .line 89
    if-nez v11, :cond_1

    .line 90
    .line 91
    invoke-virtual {v0}, La/fq80;->B()J

    .line 92
    .line 93
    .line 94
    move-result-wide v20

    .line 95
    const v11, 0x7fffffff

    .line 96
    .line 97
    .line 98
    and-int/2addr v9, v11

    .line 99
    aput v9, v14, v10

    .line 100
    .line 101
    aput-wide v16, v15, v10

    .line 102
    .line 103
    aput-wide v18, v6, v10

    .line 104
    .line 105
    add-long v3, v3, v20

    .line 106
    .line 107
    move-object v9, v5

    .line 108
    move-object v11, v6

    .line 109
    const-wide/32 v5, 0xf4240

    .line 110
    .line 111
    .line 112
    move-object/from16 v18, v9

    .line 113
    .line 114
    sget-object v9, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 115
    .line 116
    move-object v2, v11

    .line 117
    move-object/from16 v11, v18

    .line 118
    .line 119
    invoke-static/range {v3 .. v9}, La/vtt0;->T(JJJLjava/math/RoundingMode;)J

    .line 120
    .line 121
    .line 122
    move-result-wide v5

    .line 123
    aget-wide v19, v2, v10

    .line 124
    .line 125
    sub-long v19, v5, v19

    .line 126
    .line 127
    aput-wide v19, v11, v10

    .line 128
    .line 129
    const/4 v9, 0x4

    .line 130
    invoke-virtual {v0, v9}, La/fq80;->N(I)V

    .line 131
    .line 132
    .line 133
    aget v9, v14, v10

    .line 134
    .line 135
    move/from16 p0, v1

    .line 136
    .line 137
    int-to-long v0, v9

    .line 138
    add-long v16, v16, v0

    .line 139
    .line 140
    add-int/lit8 v10, v10, 0x1

    .line 141
    .line 142
    move/from16 v1, p0

    .line 143
    .line 144
    move-object/from16 v0, p2

    .line 145
    .line 146
    move-wide/from16 v18, v5

    .line 147
    .line 148
    move-object v5, v11

    .line 149
    move-object v6, v2

    .line 150
    const/4 v2, 0x4

    .line 151
    goto :goto_2

    .line 152
    :cond_1
    const-string v0, "Unhandled indirect reference"

    .line 153
    .line 154
    const/4 v1, 0x0

    .line 155
    invoke-static {v0, v1}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    throw v0

    .line 160
    :cond_2
    move-object v11, v5

    .line 161
    move-object v2, v6

    .line 162
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    new-instance v1, La/zic;

    .line 167
    .line 168
    invoke-direct {v1, v14, v15, v11, v2}, La/zic;-><init>([I[J[J[J)V

    .line 169
    .line 170
    .line 171
    invoke-static {v0, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    return-object v0
.end method


# virtual methods
.method public final a(La/guo;La/mtc;)I
    .locals 50

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    :goto_0
    move-object/from16 v2, p2

    .line 1
    :cond_0
    :goto_1
    iget-byte v3, v0, La/x6r;->r:B

    iget-object v6, v0, La/x6r;->m:Ljava/util/ArrayDeque;

    iget-object v15, v0, La/x6r;->o:La/fp;

    const-wide/32 v16, 0x7fffffff

    iget-object v7, v0, La/x6r;->p:La/ajc;

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x8

    iget v9, v0, La/x6r;->b:I

    const-wide/16 v22, 0x10

    iget-object v11, v0, La/x6r;->d:Landroid/util/SparseArray;

    const-wide/16 v24, 0x1

    iget-object v13, v0, La/x6r;->i:La/fq80;

    const/4 v14, 0x5

    const/4 v4, 0x2

    const/4 v8, 0x1

    if-eqz v3, :cond_66

    const-wide v29, -0x7fffffffffffffffL    # -4.9E-324

    const/16 v31, 0x0

    iget-object v5, v0, La/x6r;->n:Ljava/util/ArrayDeque;

    const/16 v32, 0x8

    const-string v12, "FragmentedMp4Extractor"

    iget-object v10, v0, La/x6r;->j:La/coq0;

    if-eq v3, v8, :cond_56

    if-eq v3, v4, :cond_51

    move/from16 v34, v4

    const/4 v4, 0x6

    if-eq v3, v14, :cond_4b

    if-eq v3, v4, :cond_30

    .line 2
    iget-object v3, v0, La/x6r;->B:La/w6r;

    if-nez v3, :cond_a

    .line 3
    invoke-virtual {v11}, Landroid/util/SparseArray;->size()I

    move-result v3

    move/from16 v36, v4

    move/from16 v35, v14

    move/from16 v14, v31

    const/4 v4, 0x0

    const-wide v26, 0x7fffffffffffffffL

    :goto_2
    if-ge v14, v3, :cond_5

    .line 4
    invoke-virtual {v11, v14}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v7, v16

    check-cast v7, La/w6r;

    move/from16 v38, v8

    .line 5
    iget-boolean v8, v7, La/w6r;->n:Z

    iget-object v6, v7, La/w6r;->b:La/xbs0;

    move/from16 v16, v3

    if-nez v8, :cond_1

    .line 6
    iget v3, v7, La/w6r;->f:I

    move/from16 v17, v8

    iget-object v8, v7, La/w6r;->d:La/ocs0;

    iget v8, v8, La/ocs0;->b:I

    if-eq v3, v8, :cond_4

    goto :goto_3

    :cond_1
    move/from16 v17, v8

    :goto_3
    if-eqz v17, :cond_2

    .line 7
    iget v3, v7, La/w6r;->h:I

    iget v8, v6, La/xbs0;->d:I

    if-ne v3, v8, :cond_2

    goto :goto_5

    :cond_2
    if-nez v17, :cond_3

    .line 8
    iget-object v3, v7, La/w6r;->d:La/ocs0;

    iget-object v3, v3, La/ocs0;->c:[J

    iget v6, v7, La/w6r;->f:I

    aget-wide v17, v3, v6

    goto :goto_4

    .line 9
    :cond_3
    iget-object v3, v6, La/xbs0;->f:[J

    iget v6, v7, La/w6r;->h:I

    aget-wide v17, v3, v6

    :goto_4
    cmp-long v3, v17, v26

    if-gez v3, :cond_4

    move-object v4, v7

    move-wide/from16 v26, v17

    :cond_4
    :goto_5
    add-int/lit8 v14, v14, 0x1

    move/from16 v3, v16

    move/from16 v8, v38

    goto :goto_2

    :cond_5
    move/from16 v38, v8

    if-nez v4, :cond_7

    .line 10
    iget-wide v3, v0, La/x6r;->w:J

    invoke-interface {v1}, La/guo;->getPosition()J

    move-result-wide v5

    sub-long/2addr v3, v5

    long-to-int v3, v3

    if-ltz v3, :cond_6

    .line 11
    invoke-interface {v1, v3}, La/guo;->m(I)V

    .line 12
    invoke-virtual {v0}, La/x6r;->g()V

    goto/16 :goto_1

    .line 13
    :cond_6
    const-string v0, "Offset to end of mdat was negative."

    const/4 v1, 0x0

    invoke-static {v0, v1}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    move-result-object v0

    throw v0

    .line 14
    :cond_7
    iget-boolean v2, v4, La/w6r;->n:Z

    if-nez v2, :cond_8

    .line 15
    iget-object v2, v4, La/w6r;->d:La/ocs0;

    iget-object v2, v2, La/ocs0;->c:[J

    iget v3, v4, La/w6r;->f:I

    aget-wide v6, v2, v3

    goto :goto_6

    .line 16
    :cond_8
    iget-object v2, v4, La/w6r;->b:La/xbs0;

    iget-object v2, v2, La/xbs0;->f:[J

    iget v3, v4, La/w6r;->h:I

    aget-wide v6, v2, v3

    .line 17
    :goto_6
    invoke-interface {v1}, La/guo;->getPosition()J

    move-result-wide v2

    sub-long/2addr v6, v2

    long-to-int v2, v6

    if-gez v2, :cond_9

    .line 18
    const-string v2, "Ignoring negative offset to sample data."

    invoke-static {v12, v2}, La/f1t0;->g0(Ljava/lang/String;Ljava/lang/String;)V

    move/from16 v2, v31

    .line 19
    :cond_9
    invoke-interface {v1, v2}, La/guo;->m(I)V

    .line 20
    iput-object v4, v0, La/x6r;->B:La/w6r;

    move-object v3, v4

    goto :goto_7

    :cond_a
    move/from16 v36, v4

    move/from16 v38, v8

    move/from16 v35, v14

    .line 21
    :goto_7
    iget-object v2, v3, La/w6r;->a:La/ncs0;

    iget-object v4, v3, La/w6r;->b:La/xbs0;

    iget-byte v6, v0, La/x6r;->r:B

    const-string v7, "video/hevc"

    const-string v8, "video/avc"

    const/4 v11, 0x3

    if-ne v6, v11, :cond_15

    .line 22
    iget-boolean v6, v3, La/w6r;->n:Z

    if-nez v6, :cond_b

    .line 23
    iget-object v6, v3, La/w6r;->d:La/ocs0;

    iget-object v6, v6, La/ocs0;->d:[I

    iget v11, v3, La/w6r;->f:I

    aget v6, v6, v11

    goto :goto_8

    .line 24
    :cond_b
    iget-object v6, v4, La/xbs0;->h:[I

    iget v11, v3, La/w6r;->f:I

    aget v6, v6, v11

    .line 25
    :goto_8
    iput v6, v0, La/x6r;->C:I

    .line 26
    iget-object v6, v3, La/w6r;->d:La/ocs0;

    iget-object v6, v6, La/ocs0;->a:La/lbs0;

    iget-object v6, v6, La/lbs0;->g:Landroidx/media3/common/b;

    .line 27
    iget-object v11, v6, Landroidx/media3/common/b;->p:Ljava/lang/String;

    invoke-static {v11, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_d

    and-int/lit8 v6, v9, 0x40

    if-eqz v6, :cond_c

    :goto_9
    move/from16 v6, v38

    goto :goto_a

    :cond_c
    move/from16 v6, v31

    goto :goto_a

    .line 28
    :cond_d
    iget-object v6, v6, Landroidx/media3/common/b;->p:Ljava/lang/String;

    invoke-static {v6, v7}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c

    and-int/lit16 v6, v9, 0x80

    if-eqz v6, :cond_c

    goto :goto_9

    :goto_a
    xor-int/lit8 v6, v6, 0x1

    .line 29
    iput-boolean v6, v0, La/x6r;->F:Z

    .line 30
    iget v6, v3, La/w6r;->f:I

    iget v9, v3, La/w6r;->i:I

    if-ge v6, v9, :cond_12

    .line 31
    iget v2, v0, La/x6r;->C:I

    invoke-interface {v1, v2}, La/guo;->m(I)V

    .line 32
    invoke-virtual {v3}, La/w6r;->b()La/vbs0;

    move-result-object v1

    if-nez v1, :cond_e

    goto :goto_b

    .line 33
    :cond_e
    iget-object v2, v4, La/xbs0;->n:La/fq80;

    .line 34
    iget-short v1, v1, La/vbs0;->d:S

    if-eqz v1, :cond_f

    .line 35
    invoke-virtual {v2, v1}, La/fq80;->N(I)V

    .line 36
    :cond_f
    iget v1, v3, La/w6r;->f:I

    .line 37
    iget-boolean v5, v4, La/xbs0;->k:Z

    if-eqz v5, :cond_10

    iget-object v4, v4, La/xbs0;->l:[Z

    aget-boolean v1, v4, v1

    if-eqz v1, :cond_10

    .line 38
    invoke-virtual {v2}, La/fq80;->G()I

    move-result v1

    mul-int/lit8 v1, v1, 0x6

    invoke-virtual {v2, v1}, La/fq80;->N(I)V

    .line 39
    :cond_10
    :goto_b
    invoke-virtual {v3}, La/w6r;->c()Z

    move-result v1

    if-nez v1, :cond_11

    const/4 v1, 0x0

    .line 40
    iput-object v1, v0, La/x6r;->B:La/w6r;

    :cond_11
    const/4 v11, 0x3

    .line 41
    iput-byte v11, v0, La/x6r;->r:B

    return v31

    .line 42
    :cond_12
    iget-object v6, v3, La/w6r;->d:La/ocs0;

    iget-object v6, v6, La/ocs0;->a:La/lbs0;

    iget-boolean v6, v6, La/lbs0;->h:Z

    move/from16 v9, v38

    if-ne v6, v9, :cond_13

    .line 43
    iget v6, v0, La/x6r;->C:I

    add-int/lit8 v6, v6, -0x8

    iput v6, v0, La/x6r;->C:I

    move/from16 v6, v32

    .line 44
    invoke-interface {v1, v6}, La/guo;->m(I)V

    .line 45
    :cond_13
    iget-object v6, v3, La/w6r;->d:La/ocs0;

    iget-object v6, v6, La/ocs0;->a:La/lbs0;

    iget-object v6, v6, La/lbs0;->g:Landroidx/media3/common/b;

    iget-object v6, v6, Landroidx/media3/common/b;->p:Ljava/lang/String;

    const-string v9, "audio/ac4"

    invoke-virtual {v9, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    .line 46
    iget v9, v0, La/x6r;->C:I

    if-eqz v6, :cond_14

    const/4 v6, 0x7

    .line 47
    invoke-virtual {v3, v9, v6}, La/w6r;->d(II)I

    move-result v9

    iput v9, v0, La/x6r;->D:I

    .line 48
    iget v9, v0, La/x6r;->C:I

    invoke-static {v9, v13}, La/b34;->f0(ILa/fq80;)V

    .line 49
    invoke-interface {v2, v6, v13}, La/ncs0;->a(ILa/fq80;)V

    .line 50
    iget v9, v0, La/x6r;->D:I

    add-int/2addr v9, v6

    iput v9, v0, La/x6r;->D:I

    move/from16 v6, v31

    goto :goto_c

    :cond_14
    move/from16 v6, v31

    .line 51
    invoke-virtual {v3, v9, v6}, La/w6r;->d(II)I

    move-result v9

    iput v9, v0, La/x6r;->D:I

    .line 52
    :goto_c
    iget v11, v0, La/x6r;->C:I

    add-int/2addr v11, v9

    iput v11, v0, La/x6r;->C:I

    const/4 v9, 0x4

    .line 53
    iput-byte v9, v0, La/x6r;->r:B

    .line 54
    iput v6, v0, La/x6r;->E:I

    .line 55
    :cond_15
    iget-object v6, v3, La/w6r;->d:La/ocs0;

    iget-object v9, v6, La/ocs0;->a:La/lbs0;

    .line 56
    iget-boolean v11, v3, La/w6r;->n:Z

    if-nez v11, :cond_16

    .line 57
    iget-object v4, v6, La/ocs0;->f:[J

    iget v6, v3, La/w6r;->f:I

    aget-wide v11, v4, v6

    goto :goto_d

    .line 58
    :cond_16
    iget v6, v3, La/w6r;->f:I

    .line 59
    iget-object v4, v4, La/xbs0;->i:[J

    .line 60
    aget-wide v11, v4, v6

    :goto_d
    if-eqz v10, :cond_17

    .line 61
    invoke-virtual {v10, v11, v12}, La/coq0;->a(J)J

    move-result-wide v11

    .line 62
    :cond_17
    iget v4, v9, La/lbs0;->k:I

    iget-object v6, v9, La/lbs0;->g:Landroidx/media3/common/b;

    if-eqz v4, :cond_26

    .line 63
    iget-object v9, v0, La/x6r;->f:La/fq80;

    iget-object v13, v9, La/fq80;->a:[B

    const/16 v31, 0x0

    .line 64
    aput-byte v31, v13, v31

    const/16 v38, 0x1

    .line 65
    aput-byte v31, v13, v38

    .line 66
    aput-byte v31, v13, v34

    rsub-int/lit8 v14, v4, 0x4

    move/from16 v16, v4

    .line 67
    :goto_e
    iget v4, v0, La/x6r;->D:I

    move-object/from16 v40, v5

    iget v5, v0, La/x6r;->C:I

    if-ge v4, v5, :cond_28

    .line 68
    iget v4, v0, La/x6r;->E:I

    if-nez v4, :cond_21

    .line 69
    iget-object v4, v0, La/x6r;->J:[La/ncs0;

    array-length v4, v4

    if-gtz v4, :cond_18

    iget-boolean v4, v0, La/x6r;->F:Z

    if-nez v4, :cond_19

    .line 70
    :cond_18
    invoke-static {v6}, La/ntr;->j0(Landroidx/media3/common/b;)I

    move-result v4

    add-int v5, v16, v4

    move/from16 p2, v4

    .line 71
    iget v4, v0, La/x6r;->C:I

    move/from16 v17, v4

    iget v4, v0, La/x6r;->D:I

    sub-int v4, v17, v4

    if-gt v5, v4, :cond_19

    move/from16 v4, p2

    goto :goto_f

    :cond_19
    const/4 v4, 0x0

    :goto_f
    add-int v5, v16, v4

    .line 72
    invoke-interface {v1, v13, v14, v5}, La/guo;->readFully([BII)V

    const/4 v5, 0x0

    .line 73
    invoke-virtual {v9, v5}, La/fq80;->M(I)V

    .line 74
    invoke-virtual {v9}, La/fq80;->m()I

    move-result v17

    if-ltz v17, :cond_20

    sub-int v5, v17, v4

    .line 75
    iput v5, v0, La/x6r;->E:I

    .line 76
    iget-object v5, v0, La/x6r;->e:La/fq80;

    move/from16 p2, v14

    const/4 v14, 0x0

    invoke-virtual {v5, v14}, La/fq80;->M(I)V

    const/4 v14, 0x4

    .line 77
    invoke-interface {v2, v14, v5}, La/ncs0;->a(ILa/fq80;)V

    .line 78
    iget v5, v0, La/x6r;->D:I

    add-int/2addr v5, v14

    iput v5, v0, La/x6r;->D:I

    .line 79
    iget v5, v0, La/x6r;->C:I

    add-int v5, v5, p2

    iput v5, v0, La/x6r;->C:I

    .line 80
    iget-object v5, v0, La/x6r;->J:[La/ncs0;

    array-length v5, v5

    if-lez v5, :cond_1e

    if-lez v4, :cond_1e

    .line 81
    invoke-static {v6}, La/ntr;->e0(Landroidx/media3/common/b;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_1a

    goto :goto_13

    .line 82
    :cond_1a
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v14

    sparse-switch v14, :sswitch_data_0

    :goto_10
    const/4 v5, -0x1

    goto :goto_11

    :sswitch_0
    const-string v14, "video/vvc"

    invoke-virtual {v5, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1b

    goto :goto_10

    :cond_1b
    move/from16 v5, v34

    goto :goto_11

    :sswitch_1
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1c

    goto :goto_10

    :cond_1c
    const/4 v5, 0x1

    goto :goto_11

    :sswitch_2
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1d

    goto :goto_10

    :cond_1d
    const/4 v5, 0x0

    :goto_11
    packed-switch v5, :pswitch_data_0

    goto :goto_13

    .line 83
    :pswitch_0
    aget-byte v5, v13, v35

    and-int/lit16 v5, v5, 0xf8

    const/16 v39, 0x3

    shr-int/lit8 v5, v5, 0x3

    const/16 v14, 0x17

    if-ne v5, v14, :cond_1e

    goto :goto_12

    :pswitch_1
    const/16 v37, 0x4

    .line 84
    aget-byte v5, v13, v37

    and-int/lit8 v5, v5, 0x1f

    move/from16 v14, v36

    if-ne v5, v14, :cond_1e

    goto :goto_12

    :pswitch_2
    const/16 v37, 0x4

    .line 85
    aget-byte v5, v13, v37

    and-int/lit8 v5, v5, 0x7e

    const/16 v38, 0x1

    shr-int/lit8 v5, v5, 0x1

    const/16 v14, 0x27

    if-ne v5, v14, :cond_1e

    :goto_12
    const/4 v5, 0x1

    goto :goto_14

    :cond_1e
    :goto_13
    const/4 v5, 0x0

    .line 86
    :goto_14
    iput-boolean v5, v0, La/x6r;->G:Z

    .line 87
    invoke-interface {v2, v4, v9}, La/ncs0;->a(ILa/fq80;)V

    .line 88
    iget v5, v0, La/x6r;->D:I

    add-int/2addr v5, v4

    iput v5, v0, La/x6r;->D:I

    if-lez v4, :cond_1f

    .line 89
    iget-boolean v5, v0, La/x6r;->F:Z

    if-nez v5, :cond_1f

    .line 90
    invoke-static {v13, v4, v6}, La/ntr;->g0([BILandroidx/media3/common/b;)Z

    move-result v4

    if-eqz v4, :cond_1f

    const/4 v4, 0x1

    .line 91
    iput-boolean v4, v0, La/x6r;->F:Z

    :cond_1f
    move/from16 v14, p2

    :goto_15
    move-object/from16 v5, v40

    const/16 v36, 0x6

    goto/16 :goto_e

    .line 92
    :cond_20
    const-string v0, "Invalid NAL length"

    const/4 v1, 0x0

    invoke-static {v0, v1}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    move-result-object v0

    throw v0

    :cond_21
    move/from16 p2, v14

    .line 93
    iget-boolean v5, v0, La/x6r;->G:Z

    if-eqz v5, :cond_25

    .line 94
    iget-object v5, v0, La/x6r;->g:La/fq80;

    invoke-virtual {v5, v4}, La/fq80;->J(I)V

    .line 95
    iget-object v4, v5, La/fq80;->a:[B

    .line 96
    iget v14, v0, La/x6r;->E:I

    move-object/from16 v17, v7

    const/4 v7, 0x0

    .line 97
    invoke-interface {v1, v4, v7, v14}, La/guo;->readFully([BII)V

    .line 98
    iget v4, v0, La/x6r;->E:I

    invoke-interface {v2, v4, v5}, La/ncs0;->a(ILa/fq80;)V

    .line 99
    iget v4, v0, La/x6r;->E:I

    .line 100
    iget-object v14, v5, La/fq80;->a:[B

    move/from16 v18, v4

    .line 101
    iget v4, v5, La/fq80;->c:I

    .line 102
    invoke-static {v14, v4}, La/ntr;->w0([BI)I

    move-result v4

    .line 103
    invoke-virtual {v5, v7}, La/fq80;->M(I)V

    .line 104
    invoke-virtual {v5, v4}, La/fq80;->L(I)V

    .line 105
    iget v4, v6, Landroidx/media3/common/b;->r:I

    const/4 v14, -0x1

    if-ne v4, v14, :cond_22

    .line 106
    iget v4, v15, La/fp;->b:I

    if-eqz v4, :cond_23

    .line 107
    invoke-virtual {v15, v7}, La/fp;->O(I)V

    goto :goto_16

    .line 108
    :cond_22
    iget v7, v15, La/fp;->b:I

    if-eq v7, v4, :cond_23

    .line 109
    invoke-virtual {v15, v4}, La/fp;->O(I)V

    .line 110
    :cond_23
    :goto_16
    invoke-virtual {v15, v11, v12, v5}, La/fp;->a(JLa/fq80;)V

    .line 111
    invoke-virtual {v3}, La/w6r;->a()I

    move-result v4

    const/16 v37, 0x4

    and-int/lit8 v4, v4, 0x4

    const/4 v14, 0x0

    if-eqz v4, :cond_24

    .line 112
    invoke-virtual {v15, v14}, La/fp;->v(I)V

    :cond_24
    move/from16 v4, v18

    goto :goto_17

    :cond_25
    move-object/from16 v17, v7

    const/4 v14, 0x0

    .line 113
    invoke-interface {v2, v1, v4, v14}, La/ncs0;->e(La/bbj;IZ)I

    move-result v4

    .line 114
    :goto_17
    iget v5, v0, La/x6r;->D:I

    add-int/2addr v5, v4

    iput v5, v0, La/x6r;->D:I

    .line 115
    iget v5, v0, La/x6r;->E:I

    sub-int/2addr v5, v4

    iput v5, v0, La/x6r;->E:I

    move/from16 v14, p2

    move-object/from16 v7, v17

    goto :goto_15

    :cond_26
    move-object/from16 v40, v5

    .line 116
    iget-object v4, v3, La/w6r;->l:Landroidx/media3/common/b;

    if-eqz v4, :cond_27

    .line 117
    iget-object v5, v6, Landroidx/media3/common/b;->p:Ljava/lang/String;

    invoke-static {v5}, La/hew0;->P(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_27

    .line 118
    iget v5, v0, La/x6r;->C:I

    .line 119
    iget-object v6, v3, La/w6r;->m:Landroidx/media3/common/b;

    .line 120
    invoke-static {v1, v5, v6}, La/hew0;->Z(La/guo;ILandroidx/media3/common/b;)Landroidx/media3/common/b;

    move-result-object v5

    .line 121
    iput-object v5, v3, La/w6r;->m:Landroidx/media3/common/b;

    .line 122
    invoke-virtual {v5}, Landroidx/media3/common/b;->a()La/awq;

    move-result-object v5

    iget-object v4, v4, Landroidx/media3/common/b;->t:Landroidx/media3/common/DrmInitData;

    .line 123
    iput-object v4, v5, La/awq;->s:Landroidx/media3/common/DrmInitData;

    .line 124
    invoke-static {v5, v2}, La/ohs0;->w(La/awq;La/ncs0;)V

    const/4 v4, 0x0

    .line 125
    iput-object v4, v3, La/w6r;->l:Landroidx/media3/common/b;

    .line 126
    :cond_27
    :goto_18
    iget v4, v0, La/x6r;->D:I

    iget v5, v0, La/x6r;->C:I

    if-ge v4, v5, :cond_28

    sub-int/2addr v5, v4

    const/4 v14, 0x0

    .line 127
    invoke-interface {v2, v1, v5, v14}, La/ncs0;->e(La/bbj;IZ)I

    move-result v4

    .line 128
    iget v5, v0, La/x6r;->D:I

    add-int/2addr v5, v4

    iput v5, v0, La/x6r;->D:I

    goto :goto_18

    .line 129
    :cond_28
    invoke-virtual {v3}, La/w6r;->a()I

    move-result v1

    .line 130
    iget-boolean v4, v0, La/x6r;->F:Z

    if-nez v4, :cond_29

    const/high16 v4, 0x4000000

    or-int/2addr v1, v4

    :cond_29
    move/from16 v19, v1

    .line 131
    invoke-virtual {v3}, La/w6r;->b()La/vbs0;

    move-result-object v1

    if-eqz v1, :cond_2a

    .line 132
    iget-object v1, v1, La/vbs0;->c:La/mcs0;

    move-object/from16 v22, v1

    goto :goto_19

    :cond_2a
    const/16 v22, 0x0

    .line 133
    :goto_19
    iget v1, v0, La/x6r;->C:I

    const/16 v21, 0x0

    move/from16 v20, v1

    move-object/from16 v16, v2

    move-wide/from16 v17, v11

    invoke-interface/range {v16 .. v22}, La/ncs0;->b(JIIILa/mcs0;)V

    .line 134
    :cond_2b
    invoke-virtual/range {v40 .. v40}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2e

    .line 135
    invoke-virtual/range {v40 .. v40}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/u6r;

    .line 136
    iget v2, v0, La/x6r;->x:I

    iget v4, v1, La/u6r;->c:I

    sub-int/2addr v2, v4

    iput v2, v0, La/x6r;->x:I

    .line 137
    iget-wide v4, v1, La/u6r;->a:J

    .line 138
    iget-boolean v2, v1, La/u6r;->b:Z

    if-eqz v2, :cond_2c

    add-long v4, v4, v17

    :cond_2c
    if-eqz v10, :cond_2d

    .line 139
    invoke-virtual {v10, v4, v5}, La/coq0;->a(J)J

    move-result-wide v4

    :cond_2d
    move-wide/from16 v20, v4

    .line 140
    iget-object v2, v0, La/x6r;->I:[La/ncs0;

    array-length v4, v2

    const/4 v5, 0x0

    :goto_1a
    if-ge v5, v4, :cond_2b

    aget-object v19, v2, v5

    .line 141
    iget v6, v1, La/u6r;->c:I

    iget v7, v0, La/x6r;->x:I

    const/16 v25, 0x0

    const/16 v22, 0x1

    move/from16 v23, v6

    move/from16 v24, v7

    invoke-interface/range {v19 .. v25}, La/ncs0;->b(JIIILa/mcs0;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_1a

    .line 142
    :cond_2e
    invoke-virtual {v3}, La/w6r;->c()Z

    move-result v1

    if-nez v1, :cond_2f

    const/4 v1, 0x0

    .line 143
    iput-object v1, v0, La/x6r;->B:La/w6r;

    :cond_2f
    const/4 v11, 0x3

    .line 144
    iput-byte v11, v0, La/x6r;->r:B

    const/4 v14, 0x0

    return v14

    :cond_30
    move/from16 v14, v31

    .line 145
    invoke-interface {v1}, La/guo;->getLength()J

    move-result-wide v3

    invoke-interface {v1}, La/guo;->getPosition()J

    move-result-wide v5

    sub-long/2addr v3, v5

    const/16 v6, 0x8

    .line 146
    invoke-virtual {v13, v6}, La/fq80;->J(I)V

    .line 147
    iget-object v5, v13, La/fq80;->a:[B

    const/4 v9, 0x1

    .line 148
    invoke-interface {v1, v5, v14, v6, v9}, La/guo;->b([BIIZ)Z

    move-result v5

    if-nez v5, :cond_31

    .line 149
    new-instance v3, La/ca5;

    iget-wide v4, v0, La/x6r;->z:J

    iget-wide v6, v0, La/x6r;->N:J

    invoke-direct {v3, v4, v5, v6, v7}, La/ca5;-><init>(JJ)V

    invoke-virtual {v0, v3, v2}, La/x6r;->i(La/fvh0;La/mtc;)V

    goto/16 :goto_2b

    .line 150
    :cond_31
    invoke-virtual {v13, v14}, La/fq80;->M(I)V

    .line 151
    invoke-virtual {v13}, La/fq80;->m()I

    move-result v5

    .line 152
    invoke-virtual {v13}, La/fq80;->m()I

    move-result v6

    const v7, 0x6d667261

    if-eq v6, v7, :cond_32

    .line 153
    new-instance v3, La/ca5;

    iget-wide v4, v0, La/x6r;->z:J

    iget-wide v6, v0, La/x6r;->N:J

    invoke-direct {v3, v4, v5, v6, v7}, La/ca5;-><init>(JJ)V

    invoke-virtual {v0, v3, v2}, La/x6r;->i(La/fvh0;La/mtc;)V

    goto/16 :goto_2b

    .line 154
    :cond_32
    new-instance v6, La/fq80;

    long-to-int v3, v3

    invoke-direct {v6, v3}, La/fq80;-><init>(I)V

    .line 155
    iget-object v4, v6, La/fq80;->a:[B

    const/4 v14, 0x0

    .line 156
    invoke-interface {v1, v4, v14, v3}, La/guo;->readFully([BII)V

    const/4 v9, 0x1

    if-ne v5, v9, :cond_33

    const/16 v3, 0x10

    goto :goto_1b

    :cond_33
    const/16 v3, 0x8

    .line 157
    :goto_1b
    invoke-virtual {v6, v3}, La/fq80;->M(I)V

    .line 158
    new-instance v3, Landroid/util/SparseArray;

    invoke-direct {v3}, Landroid/util/SparseArray;-><init>()V

    .line 159
    new-instance v4, Landroid/util/SparseArray;

    invoke-direct {v4}, Landroid/util/SparseArray;-><init>()V

    .line 160
    :goto_1c
    invoke-virtual {v6}, La/fq80;->a()I

    move-result v5

    const/16 v7, 0x8

    if-lt v5, v7, :cond_42

    .line 161
    iget v5, v6, La/fq80;->b:I

    .line 162
    invoke-virtual {v6}, La/fq80;->B()J

    move-result-wide v8

    .line 163
    invoke-virtual {v6}, La/fq80;->m()I

    move-result v10

    cmp-long v12, v8, v24

    if-nez v12, :cond_35

    .line 164
    invoke-virtual {v6}, La/fq80;->a()I

    move-result v8

    if-ge v8, v7, :cond_34

    goto/16 :goto_26

    .line 165
    :cond_34
    invoke-virtual {v6}, La/fq80;->t()J

    move-result-wide v8

    goto :goto_1d

    :cond_35
    cmp-long v7, v8, v18

    if-nez v7, :cond_36

    .line 166
    iget v7, v6, La/fq80;->c:I

    int-to-long v7, v7

    int-to-long v13, v5

    sub-long v8, v7, v13

    :cond_36
    :goto_1d
    if-nez v12, :cond_37

    const/16 v7, 0x10

    goto :goto_1e

    :cond_37
    const/16 v7, 0x8

    :goto_1e
    int-to-long v12, v7

    cmp-long v12, v8, v12

    if-ltz v12, :cond_42

    .line 167
    iget v12, v6, La/fq80;->c:I

    int-to-long v12, v12

    int-to-long v14, v5

    sub-long/2addr v12, v14

    cmp-long v5, v8, v12

    if-lez v5, :cond_38

    goto/16 :goto_26

    :cond_38
    const v5, 0x74667261

    if-ne v10, v5, :cond_41

    add-int/lit8 v7, v7, 0x10

    int-to-long v12, v7

    cmp-long v5, v8, v12

    if-gez v5, :cond_39

    add-long/2addr v14, v8

    long-to-int v5, v14

    .line 168
    invoke-virtual {v6, v5}, La/fq80;->M(I)V

    goto :goto_1c

    .line 169
    :cond_39
    invoke-virtual {v6}, La/fq80;->m()I

    move-result v5

    .line 170
    invoke-static {v5}, La/hr8;->e(I)I

    move-result v5

    .line 171
    invoke-virtual {v6}, La/fq80;->m()I

    move-result v7

    .line 172
    invoke-virtual {v11, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, La/w6r;

    if-nez v10, :cond_3a

    add-long/2addr v14, v8

    long-to-int v5, v14

    .line 173
    invoke-virtual {v6, v5}, La/fq80;->M(I)V

    goto :goto_1c

    .line 174
    :cond_3a
    iget-object v10, v10, La/w6r;->d:La/ocs0;

    iget-object v10, v10, La/ocs0;->a:La/lbs0;

    iget-wide v12, v10, La/lbs0;->c:J

    .line 175
    invoke-virtual {v6}, La/fq80;->m()I

    move-result v10

    shr-int/lit8 v16, v10, 0x4

    const/16 v39, 0x3

    and-int/lit8 v16, v16, 0x3

    shr-int/lit8 v17, v10, 0x2

    and-int/lit8 v17, v17, 0x3

    and-int/lit8 v10, v10, 0x3

    move-wide/from16 v26, v8

    .line 176
    invoke-virtual {v6}, La/fq80;->B()J

    move-result-wide v8

    move/from16 v33, v10

    const/4 v10, 0x1

    if-ne v5, v10, :cond_3b

    move-wide/from16 v35, v22

    :goto_1f
    move/from16 v38, v10

    goto :goto_20

    :cond_3b
    move-wide/from16 v35, v20

    goto :goto_1f

    :goto_20
    add-int/lit8 v10, v16, 0x1

    move-wide/from16 v44, v12

    int-to-long v12, v10

    add-long v35, v35, v12

    add-int/lit8 v12, v17, 0x1

    move-wide/from16 v16, v14

    int-to-long v13, v12

    add-long v35, v35, v13

    add-int/lit8 v13, v33, 0x1

    int-to-long v14, v13

    add-long v35, v35, v14

    mul-long v35, v35, v8

    .line 177
    invoke-virtual {v6}, La/fq80;->a()I

    move-result v14

    int-to-long v14, v14

    cmp-long v14, v35, v14

    if-lez v14, :cond_3c

    add-long v14, v16, v26

    long-to-int v5, v14

    .line 178
    invoke-virtual {v6, v5}, La/fq80;->M(I)V

    goto/16 :goto_1c

    :cond_3c
    long-to-int v8, v8

    .line 179
    new-array v9, v8, [J

    .line 180
    new-array v14, v8, [J

    const/4 v15, 0x0

    :goto_21
    if-ge v15, v8, :cond_40

    move/from16 v33, v8

    const/4 v8, 0x1

    if-ne v5, v8, :cond_3d

    .line 181
    invoke-virtual {v6}, La/fq80;->F()J

    move-result-wide v35

    :goto_22
    move-wide/from16 v40, v35

    goto :goto_23

    :cond_3d
    invoke-virtual {v6}, La/fq80;->B()J

    move-result-wide v35

    goto :goto_22

    :goto_23
    if-ne v5, v8, :cond_3e

    .line 182
    invoke-virtual {v6}, La/fq80;->F()J

    move-result-wide v35

    goto :goto_24

    :cond_3e
    invoke-virtual {v6}, La/fq80;->B()J

    move-result-wide v35

    :goto_24
    add-int v8, v10, v12

    add-int/2addr v8, v13

    .line 183
    invoke-virtual {v6, v8}, La/fq80;->N(I)V

    cmp-long v8, v44, v29

    if-eqz v8, :cond_3f

    const-wide/32 v42, 0xf4240

    .line 184
    sget-object v46, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    invoke-static/range {v40 .. v46}, La/vtt0;->T(JJJLjava/math/RoundingMode;)J

    move-result-wide v40

    .line 185
    :cond_3f
    aput-wide v40, v9, v15

    .line 186
    aput-wide v35, v14, v15

    add-int/lit8 v15, v15, 0x1

    move/from16 v8, v33

    goto :goto_21

    .line 187
    :cond_40
    invoke-virtual {v3, v7, v9}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 188
    invoke-virtual {v4, v7, v14}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_25

    :cond_41
    move-wide/from16 v26, v8

    move-wide/from16 v16, v14

    :goto_25
    add-long v14, v16, v26

    long-to-int v5, v14

    .line 189
    invoke-virtual {v6, v5}, La/fq80;->M(I)V

    goto/16 :goto_1c

    .line 190
    :cond_42
    :goto_26
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v5

    if-nez v5, :cond_43

    .line 191
    new-instance v3, La/ca5;

    iget-wide v4, v0, La/x6r;->z:J

    iget-wide v6, v0, La/x6r;->N:J

    invoke-direct {v3, v4, v5, v6, v7}, La/ca5;-><init>(JJ)V

    invoke-virtual {v0, v3, v2}, La/x6r;->i(La/fvh0;La/mtc;)V

    goto :goto_2b

    :cond_43
    const/4 v5, -0x1

    const/4 v6, -0x1

    const/4 v7, 0x0

    .line 192
    :goto_27
    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v8

    if-ge v7, v8, :cond_47

    .line 193
    invoke-virtual {v3, v7}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v8

    .line 194
    invoke-virtual {v11, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, La/w6r;

    if-nez v9, :cond_44

    const/4 v14, -0x1

    goto :goto_28

    .line 195
    :cond_44
    iget-object v9, v9, La/w6r;->d:La/ocs0;

    iget-object v9, v9, La/ocs0;->a:La/lbs0;

    iget v9, v9, La/lbs0;->b:I

    const/4 v14, -0x1

    if-ne v5, v14, :cond_45

    move/from16 v10, v34

    if-ne v9, v10, :cond_45

    move v5, v8

    goto :goto_28

    :cond_45
    if-ne v6, v14, :cond_46

    const/4 v10, 0x1

    if-ne v9, v10, :cond_46

    move v6, v8

    :cond_46
    :goto_28
    add-int/lit8 v7, v7, 0x1

    const/16 v34, 0x2

    goto :goto_27

    :cond_47
    const/4 v14, -0x1

    if-eq v5, v14, :cond_48

    :goto_29
    move/from16 v47, v5

    goto :goto_2a

    :cond_48
    if-eq v6, v14, :cond_49

    move/from16 v47, v6

    goto :goto_2a

    :cond_49
    const/4 v14, 0x0

    .line 196
    invoke-virtual {v3, v14}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v5

    goto :goto_29

    .line 197
    :goto_2a
    new-instance v40, La/v6r;

    iget-wide v5, v0, La/x6r;->z:J

    iget-wide v7, v0, La/x6r;->N:J

    move-object/from16 v41, v3

    move-object/from16 v42, v4

    move-wide/from16 v43, v5

    move-wide/from16 v45, v7

    .line 198
    invoke-direct/range {v40 .. v47}, La/v6r;-><init>(Landroid/util/SparseArray;Landroid/util/SparseArray;JJI)V

    move-object/from16 v3, v40

    .line 199
    invoke-virtual {v0, v3, v2}, La/x6r;->i(La/fvh0;La/mtc;)V

    .line 200
    :goto_2b
    iget-byte v3, v0, La/x6r;->r:B

    if-nez v3, :cond_0

    :cond_4a
    :goto_2c
    const/16 v38, 0x1

    goto/16 :goto_41

    :cond_4b
    const/16 v3, 0x10

    .line 201
    invoke-virtual {v13, v3}, La/fq80;->J(I)V

    .line 202
    iget-object v4, v13, La/fq80;->a:[B

    const/4 v9, 0x1

    const/4 v14, 0x0

    .line 203
    invoke-interface {v1, v4, v14, v3, v9}, La/guo;->h([BIIZ)Z

    move-result v4

    if-nez v4, :cond_4c

    .line 204
    new-instance v3, La/ca5;

    iget-wide v4, v0, La/x6r;->z:J

    iget-wide v6, v0, La/x6r;->N:J

    invoke-direct {v3, v4, v5, v6, v7}, La/ca5;-><init>(JJ)V

    invoke-virtual {v0, v3, v2}, La/x6r;->i(La/fvh0;La/mtc;)V

    goto :goto_2f

    .line 205
    :cond_4c
    invoke-virtual {v13, v14}, La/fq80;->M(I)V

    .line 206
    invoke-virtual {v13}, La/fq80;->m()I

    move-result v4

    .line 207
    invoke-virtual {v13}, La/fq80;->m()I

    move-result v5

    if-ne v4, v3, :cond_50

    const v3, 0x6d66726f

    if-eq v5, v3, :cond_4d

    goto :goto_2e

    :cond_4d
    const/4 v14, 0x4

    .line 208
    invoke-virtual {v13, v14}, La/fq80;->N(I)V

    .line 209
    invoke-virtual {v13}, La/fq80;->B()J

    move-result-wide v3

    .line 210
    invoke-interface {v1}, La/guo;->getLength()J

    move-result-wide v5

    sub-long/2addr v5, v3

    cmp-long v7, v3, v18

    if-lez v7, :cond_4f

    cmp-long v3, v3, v16

    if-gtz v3, :cond_4f

    cmp-long v3, v5, v18

    if-ltz v3, :cond_4f

    .line 211
    iget-wide v3, v0, La/x6r;->N:J

    cmp-long v3, v5, v3

    if-gez v3, :cond_4e

    goto :goto_2d

    .line 212
    :cond_4e
    iput-wide v5, v2, La/mtc;->a:J

    const/4 v14, 0x6

    .line 213
    iput-byte v14, v0, La/x6r;->r:B

    goto :goto_2f

    .line 214
    :cond_4f
    :goto_2d
    new-instance v3, La/ca5;

    iget-wide v4, v0, La/x6r;->z:J

    iget-wide v6, v0, La/x6r;->N:J

    invoke-direct {v3, v4, v5, v6, v7}, La/ca5;-><init>(JJ)V

    invoke-virtual {v0, v3, v2}, La/x6r;->i(La/fvh0;La/mtc;)V

    goto :goto_2f

    .line 215
    :cond_50
    :goto_2e
    new-instance v3, La/ca5;

    iget-wide v4, v0, La/x6r;->z:J

    iget-wide v6, v0, La/x6r;->N:J

    invoke-direct {v3, v4, v5, v6, v7}, La/ca5;-><init>(JJ)V

    invoke-virtual {v0, v3, v2}, La/x6r;->i(La/fvh0;La/mtc;)V

    .line 216
    :goto_2f
    iget-byte v3, v0, La/x6r;->r:B

    const/4 v14, 0x6

    if-eq v3, v14, :cond_4a

    if-nez v3, :cond_0

    goto :goto_2c

    .line 217
    :cond_51
    invoke-virtual {v11}, Landroid/util/SparseArray;->size()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide v6, 0x7fffffffffffffffL

    :goto_30
    if-ge v4, v3, :cond_53

    .line 218
    invoke-virtual {v11, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, La/w6r;

    iget-object v8, v8, La/w6r;->b:La/xbs0;

    .line 219
    iget-boolean v9, v8, La/xbs0;->o:Z

    if-eqz v9, :cond_52

    iget-wide v8, v8, La/xbs0;->c:J

    cmp-long v10, v8, v6

    if-gez v10, :cond_52

    .line 220
    invoke-virtual {v11, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La/w6r;

    move-wide v6, v8

    :cond_52
    add-int/lit8 v4, v4, 0x1

    goto :goto_30

    :cond_53
    if-nez v5, :cond_54

    const/4 v11, 0x3

    .line 221
    iput-byte v11, v0, La/x6r;->r:B

    goto/16 :goto_1

    .line 222
    :cond_54
    invoke-interface {v1}, La/guo;->getPosition()J

    move-result-wide v3

    sub-long/2addr v6, v3

    long-to-int v3, v6

    if-ltz v3, :cond_55

    .line 223
    invoke-interface {v1, v3}, La/guo;->m(I)V

    .line 224
    iget-object v3, v5, La/w6r;->b:La/xbs0;

    .line 225
    iget-object v4, v3, La/xbs0;->n:La/fq80;

    .line 226
    iget-object v5, v4, La/fq80;->a:[B

    .line 227
    iget v6, v4, La/fq80;->c:I

    const/4 v14, 0x0

    .line 228
    invoke-interface {v1, v5, v14, v6}, La/guo;->readFully([BII)V

    .line 229
    invoke-virtual {v4, v14}, La/fq80;->M(I)V

    .line 230
    iput-boolean v14, v3, La/xbs0;->o:Z

    goto/16 :goto_1

    .line 231
    :cond_55
    const-string v0, "Offset to encryption data was negative."

    const/4 v1, 0x0

    invoke-static {v0, v1}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    move-result-object v0

    throw v0

    :cond_56
    move-object/from16 v40, v5

    .line 232
    iget-wide v3, v0, La/x6r;->t:J

    iget v5, v0, La/x6r;->u:I

    int-to-long v13, v5

    sub-long/2addr v3, v13

    long-to-int v3, v3

    .line 233
    iget-object v4, v0, La/x6r;->v:La/fq80;

    if-eqz v4, :cond_65

    .line 234
    iget-object v5, v4, La/fq80;->a:[B

    const/16 v8, 0x8

    .line 235
    invoke-interface {v1, v5, v8, v3}, La/guo;->readFully([BII)V

    .line 236
    new-instance v3, La/fv40;

    iget v5, v0, La/x6r;->s:I

    invoke-direct {v3, v5, v4}, La/fv40;-><init>(ILa/fq80;)V

    .line 237
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_57

    .line 238
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/ev40;

    .line 239
    iget-object v4, v4, La/ev40;->f:Ljava/util/ArrayList;

    .line 240
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_37

    :cond_57
    const v3, 0x73696478

    if-ne v5, v3, :cond_5a

    .line 241
    invoke-interface {v1}, La/guo;->getPosition()J

    move-result-wide v5

    invoke-static {v5, v6, v4}, La/x6r;->k(JLa/fq80;)Landroid/util/Pair;

    move-result-object v3

    .line 242
    iget-object v4, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v4, La/zic;

    invoke-virtual {v7, v4}, La/ajc;->a(La/zic;)V

    iget-object v4, v7, La/ajc;->a:Ljava/util/LinkedHashMap;

    .line 243
    iget-object v5, v3, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    iput-wide v5, v0, La/x6r;->A:J

    .line 244
    iget-boolean v5, v0, La/x6r;->L:Z

    if-nez v5, :cond_59

    .line 245
    iget-object v5, v0, La/x6r;->H:La/huo;

    .line 246
    invoke-interface {v4}, Ljava/util/Map;->size()I

    move-result v6

    const/4 v10, 0x1

    if-ne v6, v10, :cond_58

    .line 247
    iget-object v3, v3, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v3, La/fvh0;

    goto :goto_31

    :cond_58
    invoke-virtual {v7}, La/ajc;->c()La/zic;

    move-result-object v3

    .line 248
    :goto_31
    invoke-interface {v5, v3}, La/huo;->f(La/fvh0;)V

    .line 249
    iput-boolean v10, v0, La/x6r;->K:Z

    goto :goto_32

    :cond_59
    const/4 v10, 0x1

    :goto_32
    and-int/lit16 v3, v9, 0x100

    if-eqz v3, :cond_64

    .line 250
    iget-boolean v3, v0, La/x6r;->L:Z

    if-nez v3, :cond_64

    .line 251
    invoke-interface {v4}, Ljava/util/Map;->size()I

    move-result v3

    if-le v3, v10, :cond_64

    .line 252
    invoke-interface {v1}, La/guo;->getPosition()J

    move-result-wide v3

    iput-wide v3, v0, La/x6r;->M:J

    goto/16 :goto_37

    :cond_5a
    const v3, 0x656d7367

    if-ne v5, v3, :cond_64

    .line 253
    iget-object v3, v0, La/x6r;->I:[La/ncs0;

    array-length v3, v3

    if-nez v3, :cond_5b

    goto/16 :goto_37

    :cond_5b
    const/16 v6, 0x8

    .line 254
    invoke-virtual {v4, v6}, La/fq80;->M(I)V

    .line 255
    invoke-virtual {v4}, La/fq80;->m()I

    move-result v3

    .line 256
    invoke-static {v3}, La/hr8;->e(I)I

    move-result v3

    if-eqz v3, :cond_5d

    const/4 v9, 0x1

    if-eq v3, v9, :cond_5c

    .line 257
    const-string v4, "Skipping unsupported emsg version: "

    .line 258
    invoke-static {v3, v4, v12}, La/rw2;->u(ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_37

    .line 259
    :cond_5c
    invoke-virtual {v4}, La/fq80;->B()J

    move-result-wide v17

    .line 260
    invoke-virtual {v4}, La/fq80;->F()J

    move-result-wide v13

    .line 261
    sget-object v19, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v15, 0xf4240

    invoke-static/range {v13 .. v19}, La/vtt0;->T(JJJLjava/math/RoundingMode;)J

    move-result-wide v5

    .line 262
    invoke-virtual {v4}, La/fq80;->B()J

    move-result-wide v13

    const-wide/16 v15, 0x3e8

    .line 263
    invoke-static/range {v13 .. v19}, La/vtt0;->T(JJJLjava/math/RoundingMode;)J

    move-result-wide v7

    .line 264
    invoke-virtual {v4}, La/fq80;->B()J

    move-result-wide v11

    .line 265
    invoke-virtual {v4}, La/fq80;->u()Ljava/lang/String;

    move-result-object v3

    .line 266
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    invoke-virtual {v4}, La/fq80;->u()Ljava/lang/String;

    move-result-object v9

    .line 268
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-wide v13, v11

    move-wide v11, v7

    move-wide/from16 v7, v29

    goto :goto_34

    .line 269
    :cond_5d
    invoke-virtual {v4}, La/fq80;->u()Ljava/lang/String;

    move-result-object v3

    .line 270
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    invoke-virtual {v4}, La/fq80;->u()Ljava/lang/String;

    move-result-object v9

    .line 272
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    invoke-virtual {v4}, La/fq80;->B()J

    move-result-wide v15

    .line 274
    invoke-virtual {v4}, La/fq80;->B()J

    move-result-wide v11

    .line 275
    sget-object v17, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    const-wide/32 v13, 0xf4240

    invoke-static/range {v11 .. v17}, La/vtt0;->T(JJJLjava/math/RoundingMode;)J

    move-result-wide v5

    .line 276
    iget-wide v7, v0, La/x6r;->A:J

    cmp-long v11, v7, v29

    if-eqz v11, :cond_5e

    add-long/2addr v7, v5

    goto :goto_33

    :cond_5e
    move-wide/from16 v7, v29

    .line 277
    :goto_33
    invoke-virtual {v4}, La/fq80;->B()J

    move-result-wide v11

    const-wide/16 v13, 0x3e8

    .line 278
    invoke-static/range {v11 .. v17}, La/vtt0;->T(JJJLjava/math/RoundingMode;)J

    move-result-wide v11

    .line 279
    invoke-virtual {v4}, La/fq80;->B()J

    move-result-wide v13

    move-wide/from16 v48, v7

    move-wide v7, v5

    move-wide/from16 v5, v48

    .line 280
    :goto_34
    invoke-virtual {v4}, La/fq80;->a()I

    move-result v15

    new-array v15, v15, [B

    .line 281
    invoke-virtual {v4}, La/fq80;->a()I

    move-result v2

    const/4 v1, 0x0

    invoke-virtual {v4, v15, v1, v2}, La/fq80;->k([BII)V

    .line 282
    new-instance v1, La/peo;

    .line 283
    new-instance v1, La/fq80;

    .line 284
    iget-object v2, v0, La/x6r;->k:La/iqi;

    iget-object v4, v2, La/iqi;->b:Ljava/lang/Object;

    check-cast v4, Ljava/io/DataOutputStream;

    .line 285
    iget-object v2, v2, La/iqi;->c:Ljava/lang/Object;

    check-cast v2, Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->reset()V

    .line 286
    :try_start_0
    invoke-virtual {v4, v3}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V

    const/4 v3, 0x0

    .line 287
    invoke-virtual {v4, v3}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 288
    invoke-virtual {v4, v9}, Ljava/io/DataOutputStream;->writeBytes(Ljava/lang/String;)V

    .line 289
    invoke-virtual {v4, v3}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 290
    invoke-virtual {v4, v11, v12}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 291
    invoke-virtual {v4, v13, v14}, Ljava/io/DataOutputStream;->writeLong(J)V

    .line 292
    invoke-virtual {v4, v15}, Ljava/io/OutputStream;->write([B)V

    .line 293
    invoke-virtual {v4}, Ljava/io/DataOutputStream;->flush()V

    .line 294
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 295
    invoke-direct {v1, v2}, La/fq80;-><init>([B)V

    .line 296
    invoke-virtual {v1}, La/fq80;->a()I

    move-result v15

    .line 297
    iget-object v2, v0, La/x6r;->I:[La/ncs0;

    array-length v3, v2

    const/4 v4, 0x0

    :goto_35
    if-ge v4, v3, :cond_5f

    aget-object v9, v2, v4

    const/4 v14, 0x0

    .line 298
    invoke-virtual {v1, v14}, La/fq80;->M(I)V

    .line 299
    invoke-interface {v9, v15, v1}, La/ncs0;->a(ILa/fq80;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_35

    :cond_5f
    cmp-long v1, v5, v29

    if-nez v1, :cond_60

    .line 300
    new-instance v1, La/u6r;

    const/4 v9, 0x1

    invoke-direct {v1, v15, v7, v8, v9}, La/u6r;-><init>(IJZ)V

    move-object/from16 v2, v40

    invoke-virtual {v2, v1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 301
    iget v1, v0, La/x6r;->x:I

    add-int/2addr v1, v15

    iput v1, v0, La/x6r;->x:I

    goto :goto_37

    :cond_60
    move-object/from16 v2, v40

    .line 302
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_61

    .line 303
    new-instance v1, La/u6r;

    const/4 v14, 0x0

    invoke-direct {v1, v15, v5, v6, v14}, La/u6r;-><init>(IJZ)V

    invoke-virtual {v2, v1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 304
    iget v1, v0, La/x6r;->x:I

    add-int/2addr v1, v15

    iput v1, v0, La/x6r;->x:I

    goto :goto_37

    :cond_61
    const/4 v14, 0x0

    if-eqz v10, :cond_62

    .line 305
    invoke-virtual {v10}, La/coq0;->e()Z

    move-result v1

    if-nez v1, :cond_62

    .line 306
    new-instance v1, La/u6r;

    invoke-direct {v1, v15, v5, v6, v14}, La/u6r;-><init>(IJZ)V

    invoke-virtual {v2, v1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 307
    iget v1, v0, La/x6r;->x:I

    add-int/2addr v1, v15

    iput v1, v0, La/x6r;->x:I

    goto :goto_37

    :cond_62
    if-eqz v10, :cond_63

    .line 308
    invoke-virtual {v10, v5, v6}, La/coq0;->a(J)J

    move-result-wide v5

    :cond_63
    move-wide v12, v5

    .line 309
    iget-object v1, v0, La/x6r;->I:[La/ncs0;

    array-length v2, v1

    const/4 v5, 0x0

    :goto_36
    if-ge v5, v2, :cond_64

    aget-object v11, v1, v5

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/4 v14, 0x1

    .line 310
    invoke-interface/range {v11 .. v17}, La/ncs0;->b(JIIILa/mcs0;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_36

    :catch_0
    move-exception v0

    .line 311
    invoke-static {v0}, La/ohq;->p(Ljava/lang/Throwable;)V

    const/16 v31, 0x0

    return v31

    :cond_64
    :goto_37
    move-object/from16 v1, p1

    goto :goto_38

    .line 312
    :cond_65
    invoke-interface {v1, v3}, La/guo;->m(I)V

    .line 313
    :goto_38
    invoke-interface {v1}, La/guo;->getPosition()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, La/x6r;->l(J)V

    goto/16 :goto_0

    :cond_66
    move/from16 v35, v14

    .line 314
    iget v2, v0, La/x6r;->u:I

    const-wide/16 v3, -0x1

    iget-object v5, v0, La/x6r;->l:La/fq80;

    if-nez v2, :cond_69

    .line 315
    iget-object v2, v5, La/fq80;->a:[B

    const/16 v8, 0x8

    const/4 v10, 0x1

    const/4 v14, 0x0

    .line 316
    invoke-interface {v1, v2, v14, v8, v10}, La/guo;->h([BIIZ)Z

    move-result v2

    if-nez v2, :cond_68

    .line 317
    iget-wide v1, v0, La/x6r;->M:J

    cmp-long v5, v1, v3

    if-eqz v5, :cond_67

    move-object/from16 v8, p2

    .line 318
    iput-wide v1, v8, La/mtc;->a:J

    .line 319
    iput-wide v3, v0, La/x6r;->M:J

    .line 320
    iget-object v1, v0, La/x6r;->H:La/huo;

    invoke-virtual {v7}, La/ajc;->c()La/zic;

    move-result-object v2

    invoke-interface {v1, v2}, La/huo;->f(La/fvh0;)V

    .line 321
    iput-boolean v10, v0, La/x6r;->L:Z

    return v10

    :cond_67
    const/4 v14, 0x0

    .line 322
    invoke-virtual {v15, v14}, La/fp;->v(I)V

    const/16 v28, -0x1

    return v28

    :cond_68
    move-object/from16 v8, p2

    const/16 v2, 0x8

    const/4 v14, 0x0

    .line 323
    iput v2, v0, La/x6r;->u:I

    .line 324
    invoke-virtual {v5, v14}, La/fq80;->M(I)V

    .line 325
    invoke-virtual {v5}, La/fq80;->B()J

    move-result-wide v14

    iput-wide v14, v0, La/x6r;->t:J

    .line 326
    invoke-virtual {v5}, La/fq80;->m()I

    move-result v2

    iput v2, v0, La/x6r;->s:I

    goto :goto_39

    :cond_69
    move-object/from16 v8, p2

    .line 327
    :goto_39
    iget-wide v14, v0, La/x6r;->t:J

    cmp-long v2, v14, v24

    if-nez v2, :cond_6b

    .line 328
    iget-object v2, v5, La/fq80;->a:[B

    const/16 v10, 0x8

    .line 329
    invoke-interface {v1, v2, v10, v10}, La/guo;->readFully([BII)V

    .line 330
    iget v2, v0, La/x6r;->u:I

    add-int/2addr v2, v10

    iput v2, v0, La/x6r;->u:I

    .line 331
    invoke-virtual {v5}, La/fq80;->F()J

    move-result-wide v14

    iput-wide v14, v0, La/x6r;->t:J

    :cond_6a
    move-wide/from16 v18, v3

    goto :goto_3a

    :cond_6b
    cmp-long v2, v14, v18

    if-nez v2, :cond_6a

    .line 332
    invoke-interface {v1}, La/guo;->getLength()J

    move-result-wide v14

    cmp-long v2, v14, v3

    if-nez v2, :cond_6c

    .line 333
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_6c

    .line 334
    invoke-virtual {v6}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/ev40;

    iget-wide v14, v2, La/ev40;->e:J

    :cond_6c
    cmp-long v2, v14, v3

    if-eqz v2, :cond_6a

    .line 335
    invoke-interface {v1}, La/guo;->getPosition()J

    move-result-wide v18

    sub-long v14, v14, v18

    iget v2, v0, La/x6r;->u:I

    move-wide/from16 v18, v3

    int-to-long v3, v2

    add-long/2addr v14, v3

    iput-wide v14, v0, La/x6r;->t:J

    .line 336
    :goto_3a
    iget-wide v2, v0, La/x6r;->t:J

    iget v4, v0, La/x6r;->u:I

    int-to-long v14, v4

    cmp-long v10, v2, v14

    if-gez v10, :cond_6e

    .line 337
    iget v2, v0, La/x6r;->s:I

    const v3, 0x66726565

    if-ne v2, v3, :cond_6d

    const/16 v2, 0x8

    if-ne v4, v2, :cond_6d

    .line 338
    iput-wide v14, v0, La/x6r;->t:J

    move-wide v2, v14

    move-wide/from16 v24, v2

    goto :goto_3b

    .line 339
    :cond_6d
    const-string v0, "Atom size less than header length (unsupported)."

    invoke-static {v0}, La/kq80;->e(Ljava/lang/String;)La/kq80;

    move-result-object v0

    throw v0

    :cond_6e
    move-wide/from16 v24, v14

    .line 340
    :goto_3b
    iget-wide v14, v0, La/x6r;->M:J

    cmp-long v4, v14, v18

    if-eqz v4, :cond_70

    .line 341
    iget v4, v0, La/x6r;->s:I

    const v6, 0x73696478

    if-ne v4, v6, :cond_6f

    long-to-int v2, v2

    .line 342
    invoke-virtual {v13, v2}, La/fq80;->J(I)V

    .line 343
    iget-object v2, v5, La/fq80;->a:[B

    iget-object v3, v13, La/fq80;->a:[B

    const/16 v6, 0x8

    const/4 v14, 0x0

    .line 344
    invoke-static {v2, v14, v3, v14, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 345
    iget-object v2, v13, La/fq80;->a:[B

    .line 346
    iget-wide v3, v0, La/x6r;->t:J

    iget v5, v0, La/x6r;->u:I

    int-to-long v9, v5

    sub-long/2addr v3, v9

    long-to-int v3, v3

    .line 347
    invoke-interface {v1, v2, v6, v3}, La/guo;->readFully([BII)V

    .line 348
    invoke-interface {v1}, La/guo;->i()J

    move-result-wide v2

    invoke-static {v2, v3, v13}, La/x6r;->k(JLa/fq80;)Landroid/util/Pair;

    move-result-object v2

    .line 349
    iget-object v2, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, La/zic;

    invoke-virtual {v7, v2}, La/ajc;->a(La/zic;)V

    goto :goto_3c

    :cond_6f
    sub-long v2, v2, v24

    long-to-int v2, v2

    const/4 v9, 0x1

    .line 350
    invoke-interface {v1, v2, v9}, La/guo;->a(IZ)Z

    .line 351
    :goto_3c
    invoke-virtual {v0}, La/x6r;->g()V

    goto/16 :goto_40

    .line 352
    :cond_70
    invoke-interface {v1}, La/guo;->getPosition()J

    move-result-wide v2

    iget v4, v0, La/x6r;->u:I

    int-to-long v14, v4

    sub-long/2addr v2, v14

    .line 353
    iget v4, v0, La/x6r;->s:I

    const v7, 0x6d646174

    const v10, 0x6d6f6f66

    if-eq v4, v10, :cond_71

    if-ne v4, v7, :cond_73

    .line 354
    :cond_71
    iget-boolean v4, v0, La/x6r;->K:Z

    if-nez v4, :cond_73

    .line 355
    invoke-interface {v1}, La/guo;->getLength()J

    move-result-wide v14

    cmp-long v4, v14, v18

    if-eqz v4, :cond_72

    iget-wide v14, v0, La/x6r;->N:J

    cmp-long v4, v14, v18

    if-nez v4, :cond_72

    and-int/lit16 v4, v9, 0x200

    if-eqz v4, :cond_72

    .line 356
    iput-wide v2, v0, La/x6r;->N:J

    .line 357
    invoke-interface {v1}, La/guo;->getLength()J

    move-result-wide v2

    sub-long v2, v2, v22

    iput-wide v2, v8, La/mtc;->a:J

    move/from16 v2, v35

    .line 358
    iput-byte v2, v0, La/x6r;->r:B

    goto/16 :goto_40

    .line 359
    :cond_72
    iget-object v4, v0, La/x6r;->H:La/huo;

    new-instance v9, La/ca5;

    iget-wide v14, v0, La/x6r;->z:J

    invoke-direct {v9, v14, v15, v2, v3}, La/ca5;-><init>(JJ)V

    invoke-interface {v4, v9}, La/huo;->f(La/fvh0;)V

    const/4 v9, 0x1

    .line 360
    iput-boolean v9, v0, La/x6r;->K:Z

    .line 361
    :cond_73
    iget v4, v0, La/x6r;->s:I

    if-ne v4, v10, :cond_74

    .line 362
    invoke-virtual {v11}, Landroid/util/SparseArray;->size()I

    move-result v4

    const/4 v9, 0x0

    :goto_3d
    if-ge v9, v4, :cond_74

    .line 363
    invoke-virtual {v11, v9}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, La/w6r;

    iget-object v12, v12, La/w6r;->b:La/xbs0;

    .line 364
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    iput-wide v2, v12, La/xbs0;->c:J

    .line 366
    iput-wide v2, v12, La/xbs0;->b:J

    add-int/lit8 v9, v9, 0x1

    goto :goto_3d

    .line 367
    :cond_74
    iget v4, v0, La/x6r;->s:I

    if-ne v4, v7, :cond_75

    const/4 v7, 0x0

    .line 368
    iput-object v7, v0, La/x6r;->B:La/w6r;

    .line 369
    iget-wide v4, v0, La/x6r;->t:J

    add-long/2addr v2, v4

    iput-wide v2, v0, La/x6r;->w:J

    const/4 v10, 0x2

    .line 370
    iput-byte v10, v0, La/x6r;->r:B

    goto/16 :goto_40

    :cond_75
    const v2, 0x6d6f6f76

    const v3, 0x6d657461

    if-eq v4, v2, :cond_7c

    const v2, 0x7472616b

    if-eq v4, v2, :cond_7c

    const v2, 0x6d646961

    if-eq v4, v2, :cond_7c

    const v2, 0x6d696e66

    if-eq v4, v2, :cond_7c

    const v2, 0x7374626c

    if-eq v4, v2, :cond_7c

    if-eq v4, v10, :cond_7c

    const v2, 0x74726166

    if-eq v4, v2, :cond_7c

    const v2, 0x6d766578

    if-eq v4, v2, :cond_7c

    const v2, 0x65647473

    if-eq v4, v2, :cond_7c

    if-ne v4, v3, :cond_76

    goto/16 :goto_3f

    :cond_76
    const v2, 0x68646c72    # 4.3148E24f

    if-eq v4, v2, :cond_79

    const v2, 0x6d646864

    if-eq v4, v2, :cond_79

    const v2, 0x6d766864

    if-eq v4, v2, :cond_79

    const v3, 0x73696478

    if-eq v4, v3, :cond_79

    const v2, 0x73747364

    if-eq v4, v2, :cond_79

    const v2, 0x73747473

    if-eq v4, v2, :cond_79

    const v2, 0x63747473

    if-eq v4, v2, :cond_79

    const v2, 0x73747363

    if-eq v4, v2, :cond_79

    const v2, 0x7374737a

    if-eq v4, v2, :cond_79

    const v2, 0x73747a32

    if-eq v4, v2, :cond_79

    const v2, 0x7374636f

    if-eq v4, v2, :cond_79

    const v2, 0x636f3634

    if-eq v4, v2, :cond_79

    const v2, 0x73747373

    if-eq v4, v2, :cond_79

    const v2, 0x74666474

    if-eq v4, v2, :cond_79

    const v2, 0x74666864

    if-eq v4, v2, :cond_79

    const v2, 0x746b6864

    if-eq v4, v2, :cond_79

    const v2, 0x74726578

    if-eq v4, v2, :cond_79

    const v2, 0x7472756e

    if-eq v4, v2, :cond_79

    const v2, 0x70737368    # 3.013775E29f

    if-eq v4, v2, :cond_79

    const v2, 0x7361697a

    if-eq v4, v2, :cond_79

    const v2, 0x7361696f

    if-eq v4, v2, :cond_79

    const v2, 0x73656e63

    if-eq v4, v2, :cond_79

    const v2, 0x75756964

    if-eq v4, v2, :cond_79

    const v2, 0x73626770

    if-eq v4, v2, :cond_79

    const v2, 0x73677064

    if-eq v4, v2, :cond_79

    const v2, 0x656c7374

    if-eq v4, v2, :cond_79

    const v2, 0x6d656864

    if-eq v4, v2, :cond_79

    const v3, 0x656d7367

    if-eq v4, v3, :cond_79

    const v2, 0x75647461

    if-eq v4, v2, :cond_79

    const v2, 0x6b657973

    if-eq v4, v2, :cond_79

    const v2, 0x696c7374

    if-ne v4, v2, :cond_77

    goto :goto_3e

    .line 371
    :cond_77
    iget-wide v2, v0, La/x6r;->t:J

    cmp-long v2, v2, v16

    if-gtz v2, :cond_78

    const/4 v4, 0x0

    .line 372
    iput-object v4, v0, La/x6r;->v:La/fq80;

    const/4 v9, 0x1

    .line 373
    iput-byte v9, v0, La/x6r;->r:B

    goto/16 :goto_40

    .line 374
    :cond_78
    const-string v0, "Skipping atom with length > 2147483647 (unsupported)."

    invoke-static {v0}, La/kq80;->e(Ljava/lang/String;)La/kq80;

    move-result-object v0

    throw v0

    .line 375
    :cond_79
    :goto_3e
    iget v2, v0, La/x6r;->u:I

    const/16 v6, 0x8

    if-ne v2, v6, :cond_7b

    .line 376
    iget-wide v2, v0, La/x6r;->t:J

    cmp-long v2, v2, v16

    if-gtz v2, :cond_7a

    .line 377
    new-instance v2, La/fq80;

    iget-wide v3, v0, La/x6r;->t:J

    long-to-int v3, v3

    invoke-direct {v2, v3}, La/fq80;-><init>(I)V

    .line 378
    iget-object v3, v5, La/fq80;->a:[B

    .line 379
    iget-object v4, v2, La/fq80;->a:[B

    const/4 v14, 0x0

    .line 380
    invoke-static {v3, v14, v4, v14, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 381
    iput-object v2, v0, La/x6r;->v:La/fq80;

    const/4 v9, 0x1

    .line 382
    iput-byte v9, v0, La/x6r;->r:B

    goto :goto_40

    .line 383
    :cond_7a
    const-string v0, "Leaf atom with length > 2147483647 (unsupported)."

    invoke-static {v0}, La/kq80;->e(Ljava/lang/String;)La/kq80;

    move-result-object v0

    throw v0

    .line 384
    :cond_7b
    const-string v0, "Leaf atom defines extended atom size (unsupported)."

    invoke-static {v0}, La/kq80;->e(Ljava/lang/String;)La/kq80;

    move-result-object v0

    throw v0

    .line 385
    :cond_7c
    :goto_3f
    invoke-interface {v1}, La/guo;->getPosition()J

    move-result-wide v4

    iget-wide v9, v0, La/x6r;->t:J

    add-long/2addr v4, v9

    sub-long v4, v4, v20

    .line 386
    iget v2, v0, La/x6r;->u:I

    int-to-long v11, v2

    cmp-long v2, v9, v11

    if-eqz v2, :cond_7d

    iget v2, v0, La/x6r;->s:I

    if-ne v2, v3, :cond_7d

    const/16 v2, 0x8

    .line 387
    invoke-virtual {v13, v2}, La/fq80;->J(I)V

    .line 388
    iget-object v3, v13, La/fq80;->a:[B

    const/4 v14, 0x0

    .line 389
    invoke-interface {v1, v3, v14, v2}, La/guo;->n([BII)V

    .line 390
    invoke-static {v13}, La/hr8;->a(La/fq80;)V

    .line 391
    iget v2, v13, La/fq80;->b:I

    .line 392
    invoke-interface {v1, v2}, La/guo;->m(I)V

    .line 393
    invoke-interface {v1}, La/guo;->g()V

    .line 394
    :cond_7d
    new-instance v2, La/ev40;

    iget v3, v0, La/x6r;->s:I

    invoke-direct {v2, v3, v4, v5}, La/ev40;-><init>(IJ)V

    invoke-virtual {v6, v2}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 395
    iget-wide v2, v0, La/x6r;->t:J

    iget v6, v0, La/x6r;->u:I

    int-to-long v6, v6

    cmp-long v2, v2, v6

    if-nez v2, :cond_7e

    .line 396
    invoke-virtual {v0, v4, v5}, La/x6r;->l(J)V

    goto :goto_40

    .line 397
    :cond_7e
    invoke-virtual {v0}, La/x6r;->g()V

    .line 398
    :goto_40
    iget-byte v2, v0, La/x6r;->r:B

    const/4 v3, 0x5

    if-ne v2, v3, :cond_7f

    goto/16 :goto_2c

    :goto_41
    return v38

    :cond_7f
    move-object v2, v8

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x63185e82 -> :sswitch_2
        0x4f62373a -> :sswitch_1
        0x4f62860f -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(JJ)V
    .locals 3

    .line 1
    iget-object p1, p0, La/x6r;->d:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/util/SparseArray;->size()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    const/4 v0, 0x0

    .line 8
    move v1, v0

    .line 9
    :goto_0
    if-ge v1, p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, La/w6r;

    .line 16
    .line 17
    invoke-virtual {v2}, La/w6r;->e()V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object p1, p0, La/x6r;->n:Ljava/util/ArrayDeque;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 26
    .line 27
    .line 28
    iput v0, p0, La/x6r;->x:I

    .line 29
    .line 30
    iget-object p1, p0, La/x6r;->o:La/fp;

    .line 31
    .line 32
    iget-object p1, p1, La/fp;->f:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, Ljava/util/PriorityQueue;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/util/PriorityQueue;->clear()V

    .line 37
    .line 38
    .line 39
    iput-wide p3, p0, La/x6r;->y:J

    .line 40
    .line 41
    iget-object p1, p0, La/x6r;->m:Ljava/util/ArrayDeque;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/util/ArrayDeque;->clear()V

    .line 44
    .line 45
    .line 46
    const-wide/16 p1, -0x1

    .line 47
    .line 48
    iput-wide p1, p0, La/x6r;->N:J

    .line 49
    .line 50
    invoke-virtual {p0}, La/x6r;->g()V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final c(La/guo;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p1, v0}, La/zgc;->O(La/guo;Z)La/qgk0;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, La/b4x;->t(Ljava/lang/Object;)La/rcf0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget-object v1, La/b4x;->b:La/v3x;

    .line 14
    .line 15
    sget-object v1, La/rcf0;->e:La/rcf0;

    .line 16
    .line 17
    :goto_0
    iput-object v1, p0, La/x6r;->q:La/rcf0;

    .line 18
    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    return v0

    .line 22
    :cond_1
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public final e(La/huo;)V
    .locals 6

    .line 1
    iget v0, p0, La/x6r;->b:I

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x20

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    new-instance v1, La/o24;

    .line 8
    .line 9
    iget-object v2, p0, La/x6r;->a:La/jfn0;

    .line 10
    .line 11
    invoke-direct {v1, p1, v2}, La/o24;-><init>(La/huo;La/jfn0;)V

    .line 12
    .line 13
    .line 14
    move-object p1, v1

    .line 15
    :cond_0
    iput-object p1, p0, La/x6r;->H:La/huo;

    .line 16
    .line 17
    invoke-virtual {p0}, La/x6r;->g()V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x2

    .line 21
    new-array p1, p1, [La/ncs0;

    .line 22
    .line 23
    iput-object p1, p0, La/x6r;->I:[La/ncs0;

    .line 24
    .line 25
    and-int/lit8 v0, v0, 0x4

    .line 26
    .line 27
    const/16 v1, 0x64

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget-object v0, p0, La/x6r;->H:La/huo;

    .line 33
    .line 34
    const/4 v3, 0x5

    .line 35
    invoke-interface {v0, v1, v3}, La/huo;->q(II)La/ncs0;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    aput-object v0, p1, v2

    .line 40
    .line 41
    const/4 p1, 0x1

    .line 42
    const/16 v1, 0x65

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move p1, v2

    .line 46
    :goto_0
    iget-object v0, p0, La/x6r;->I:[La/ncs0;

    .line 47
    .line 48
    invoke-static {p1, v0}, La/vtt0;->O(I[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, [La/ncs0;

    .line 53
    .line 54
    iput-object p1, p0, La/x6r;->I:[La/ncs0;

    .line 55
    .line 56
    array-length v0, p1

    .line 57
    move v3, v2

    .line 58
    :goto_1
    if-ge v3, v0, :cond_2

    .line 59
    .line 60
    aget-object v4, p1, v3

    .line 61
    .line 62
    sget-object v5, La/x6r;->P:Landroidx/media3/common/b;

    .line 63
    .line 64
    invoke-interface {v4, v5}, La/ncs0;->c(Landroidx/media3/common/b;)V

    .line 65
    .line 66
    .line 67
    add-int/lit8 v3, v3, 0x1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    iget-object p1, p0, La/x6r;->c:Ljava/util/List;

    .line 71
    .line 72
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    new-array v0, v0, [La/ncs0;

    .line 77
    .line 78
    iput-object v0, p0, La/x6r;->J:[La/ncs0;

    .line 79
    .line 80
    :goto_2
    iget-object v0, p0, La/x6r;->J:[La/ncs0;

    .line 81
    .line 82
    array-length v0, v0

    .line 83
    if-ge v2, v0, :cond_3

    .line 84
    .line 85
    iget-object v0, p0, La/x6r;->H:La/huo;

    .line 86
    .line 87
    add-int/lit8 v3, v1, 0x1

    .line 88
    .line 89
    const/4 v4, 0x3

    .line 90
    invoke-interface {v0, v1, v4}, La/huo;->q(II)La/ncs0;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    check-cast v1, Landroidx/media3/common/b;

    .line 99
    .line 100
    invoke-interface {v0, v1}, La/ncs0;->c(Landroidx/media3/common/b;)V

    .line 101
    .line 102
    .line 103
    iget-object v1, p0, La/x6r;->J:[La/ncs0;

    .line 104
    .line 105
    aput-object v0, v1, v2

    .line 106
    .line 107
    add-int/lit8 v2, v2, 0x1

    .line 108
    .line 109
    move v1, v3

    .line 110
    goto :goto_2

    .line 111
    :cond_3
    return-void
.end method

.method public final f()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/x6r;->q:La/rcf0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final g()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/x6r;->r:B

    .line 3
    .line 4
    iput v0, p0, La/x6r;->u:I

    .line 5
    .line 6
    return-void
.end method

.method public final i(La/fvh0;La/mtc;)V
    .locals 2

    .line 1
    iget-object v0, p0, La/x6r;->H:La/huo;

    .line 2
    .line 3
    invoke-interface {v0, p1}, La/huo;->f(La/fvh0;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, La/x6r;->K:Z

    .line 8
    .line 9
    iget-wide v0, p0, La/x6r;->N:J

    .line 10
    .line 11
    iput-wide v0, p2, La/mtc;->a:J

    .line 12
    .line 13
    invoke-virtual {p0}, La/x6r;->g()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final l(J)V
    .locals 55

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    :cond_0
    :goto_0
    iget-object v1, v0, La/x6r;->m:Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_66

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    check-cast v2, La/ev40;

    .line 16
    .line 17
    iget-wide v2, v2, La/ev40;->e:J

    .line 18
    .line 19
    cmp-long v2, v2, p1

    .line 20
    .line 21
    if-nez v2, :cond_66

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    move-object v3, v2

    .line 28
    check-cast v3, La/ev40;

    .line 29
    .line 30
    iget v2, v3, La/syx;->b:I

    .line 31
    .line 32
    iget-object v4, v3, La/ev40;->g:Ljava/util/ArrayList;

    .line 33
    .line 34
    iget-object v5, v3, La/ev40;->f:Ljava/util/ArrayList;

    .line 35
    .line 36
    const v6, 0x6d6f6f76

    .line 37
    .line 38
    .line 39
    const/4 v7, 0x0

    .line 40
    const/16 v9, 0xc

    .line 41
    .line 42
    iget-object v14, v0, La/x6r;->d:Landroid/util/SparseArray;

    .line 43
    .line 44
    iget v15, v0, La/x6r;->b:I

    .line 45
    .line 46
    if-ne v2, v6, :cond_15

    .line 47
    .line 48
    move-object v6, v7

    .line 49
    invoke-static {v5}, La/x6r;->h(Ljava/util/ArrayList;)Landroidx/media3/common/DrmInitData;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    const v1, 0x6d766578

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3, v1}, La/ev40;->v(I)La/ev40;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    new-instance v2, Landroid/util/SparseArray;

    .line 64
    .line 65
    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    .line 66
    .line 67
    .line 68
    iget-object v1, v1, La/ev40;->f:Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    const/4 v5, 0x0

    .line 75
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    :goto_1
    if-ge v5, v4, :cond_4

    .line 81
    .line 82
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v16

    .line 86
    move-object/from16 v6, v16

    .line 87
    .line 88
    check-cast v6, La/fv40;

    .line 89
    .line 90
    const/16 v16, 0x0

    .line 91
    .line 92
    iget v12, v6, La/syx;->b:I

    .line 93
    .line 94
    iget-object v6, v6, La/fv40;->e:La/fq80;

    .line 95
    .line 96
    const/16 v18, 0x1

    .line 97
    .line 98
    const v13, 0x74726578

    .line 99
    .line 100
    .line 101
    if-ne v12, v13, :cond_1

    .line 102
    .line 103
    invoke-virtual {v6, v9}, La/fq80;->M(I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v6}, La/fq80;->m()I

    .line 107
    .line 108
    .line 109
    move-result v12

    .line 110
    invoke-virtual {v6}, La/fq80;->m()I

    .line 111
    .line 112
    .line 113
    move-result v13

    .line 114
    add-int/lit8 v13, v13, -0x1

    .line 115
    .line 116
    invoke-virtual {v6}, La/fq80;->m()I

    .line 117
    .line 118
    .line 119
    move-result v9

    .line 120
    invoke-virtual {v6}, La/fq80;->m()I

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    invoke-virtual {v6}, La/fq80;->m()I

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object v12

    .line 132
    move-object/from16 v21, v1

    .line 133
    .line 134
    new-instance v1, La/qwj;

    .line 135
    .line 136
    invoke-direct {v1, v13, v9, v8, v6}, La/qwj;-><init>(IIII)V

    .line 137
    .line 138
    .line 139
    invoke-static {v12, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    iget-object v6, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v6, Ljava/lang/Integer;

    .line 146
    .line 147
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v1, La/qwj;

    .line 154
    .line 155
    invoke-virtual {v2, v6, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_1
    move-object/from16 v21, v1

    .line 160
    .line 161
    const v1, 0x6d656864

    .line 162
    .line 163
    .line 164
    if-ne v12, v1, :cond_3

    .line 165
    .line 166
    const/16 v1, 0x8

    .line 167
    .line 168
    invoke-virtual {v6, v1}, La/fq80;->M(I)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v6}, La/fq80;->m()I

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    invoke-static {v1}, La/hr8;->e(I)I

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    if-nez v1, :cond_2

    .line 180
    .line 181
    invoke-virtual {v6}, La/fq80;->B()J

    .line 182
    .line 183
    .line 184
    move-result-wide v8

    .line 185
    goto :goto_2

    .line 186
    :cond_2
    invoke-virtual {v6}, La/fq80;->F()J

    .line 187
    .line 188
    .line 189
    move-result-wide v8

    .line 190
    :goto_2
    move-wide v10, v8

    .line 191
    :cond_3
    :goto_3
    add-int/lit8 v5, v5, 0x1

    .line 192
    .line 193
    move-object/from16 v1, v21

    .line 194
    .line 195
    const/4 v6, 0x0

    .line 196
    const/16 v9, 0xc

    .line 197
    .line 198
    goto :goto_1

    .line 199
    :cond_4
    const/16 v16, 0x0

    .line 200
    .line 201
    const/16 v18, 0x1

    .line 202
    .line 203
    const v1, 0x6d657461

    .line 204
    .line 205
    .line 206
    invoke-virtual {v3, v1}, La/ev40;->v(I)La/ev40;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    if-eqz v1, :cond_5

    .line 211
    .line 212
    invoke-static {v1}, La/hr8;->f(La/ev40;)La/ed40;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    goto :goto_4

    .line 217
    :cond_5
    const/4 v1, 0x0

    .line 218
    :goto_4
    new-instance v4, La/met;

    .line 219
    .line 220
    invoke-direct {v4}, La/met;-><init>()V

    .line 221
    .line 222
    .line 223
    const v5, 0x75647461

    .line 224
    .line 225
    .line 226
    invoke-virtual {v3, v5}, La/ev40;->w(I)La/fv40;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    if-eqz v5, :cond_7

    .line 231
    .line 232
    and-int/lit16 v6, v15, 0x400

    .line 233
    .line 234
    if-eqz v6, :cond_6

    .line 235
    .line 236
    move/from16 v6, v18

    .line 237
    .line 238
    goto :goto_5

    .line 239
    :cond_6
    move/from16 v6, v16

    .line 240
    .line 241
    :goto_5
    invoke-static {v5, v6}, La/hr8;->k(La/fv40;Z)La/ed40;

    .line 242
    .line 243
    .line 244
    move-result-object v5

    .line 245
    invoke-virtual {v4, v5}, La/met;->b(La/ed40;)V

    .line 246
    .line 247
    .line 248
    move-object v12, v5

    .line 249
    goto :goto_6

    .line 250
    :cond_7
    const/4 v12, 0x0

    .line 251
    :goto_6
    new-instance v13, La/ed40;

    .line 252
    .line 253
    const v5, 0x6d766864

    .line 254
    .line 255
    .line 256
    invoke-virtual {v3, v5}, La/ev40;->w(I)La/fv40;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    iget-object v5, v5, La/fv40;->e:La/fq80;

    .line 264
    .line 265
    invoke-static {v5}, La/hr8;->g(La/fq80;)La/kv40;

    .line 266
    .line 267
    .line 268
    move-result-object v5

    .line 269
    move/from16 v6, v18

    .line 270
    .line 271
    new-array v8, v6, [La/cd40;

    .line 272
    .line 273
    aput-object v5, v8, v16

    .line 274
    .line 275
    invoke-direct {v13, v8}, La/ed40;-><init>([La/cd40;)V

    .line 276
    .line 277
    .line 278
    and-int/lit8 v5, v15, 0x10

    .line 279
    .line 280
    if-eqz v5, :cond_8

    .line 281
    .line 282
    const/4 v8, 0x1

    .line 283
    :goto_7
    move-wide v5, v10

    .line 284
    goto :goto_8

    .line 285
    :cond_8
    move/from16 v8, v16

    .line 286
    .line 287
    goto :goto_7

    .line 288
    :goto_8
    new-instance v10, La/t6r;

    .line 289
    .line 290
    move/from16 v9, v16

    .line 291
    .line 292
    invoke-direct {v10, v0, v9}, La/t6r;-><init>(La/fuo;B)V

    .line 293
    .line 294
    .line 295
    const/4 v11, 0x0

    .line 296
    const/4 v9, 0x0

    .line 297
    invoke-static/range {v3 .. v11}, La/hr8;->j(La/ev40;La/met;JLandroidx/media3/common/DrmInitData;ZZLa/tdr;Z)Ljava/util/ArrayList;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 302
    .line 303
    .line 304
    move-result v5

    .line 305
    invoke-virtual {v14}, Landroid/util/SparseArray;->size()I

    .line 306
    .line 307
    .line 308
    move-result v6

    .line 309
    if-nez v6, :cond_e

    .line 310
    .line 311
    invoke-static {v3}, La/d9x;->K(Ljava/util/ArrayList;)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v6

    .line 315
    const/4 v7, 0x0

    .line 316
    :goto_9
    if-ge v7, v5, :cond_d

    .line 317
    .line 318
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v8

    .line 322
    check-cast v8, La/ocs0;

    .line 323
    .line 324
    iget-object v9, v8, La/ocs0;->a:La/lbs0;

    .line 325
    .line 326
    iget-boolean v10, v9, La/lbs0;->m:Z

    .line 327
    .line 328
    iget v11, v9, La/lbs0;->a:I

    .line 329
    .line 330
    iget-object v15, v9, La/lbs0;->g:Landroidx/media3/common/b;

    .line 331
    .line 332
    move/from16 v17, v5

    .line 333
    .line 334
    move-object/from16 v19, v6

    .line 335
    .line 336
    iget-wide v5, v9, La/lbs0;->e:J

    .line 337
    .line 338
    iget v9, v9, La/lbs0;->b:I

    .line 339
    .line 340
    if-nez v10, :cond_9

    .line 341
    .line 342
    move-object/from16 v21, v3

    .line 343
    .line 344
    move/from16 v20, v7

    .line 345
    .line 346
    goto :goto_c

    .line 347
    :cond_9
    iget-object v10, v0, La/x6r;->H:La/huo;

    .line 348
    .line 349
    invoke-interface {v10, v7, v9}, La/huo;->q(II)La/ncs0;

    .line 350
    .line 351
    .line 352
    move-result-object v10

    .line 353
    invoke-interface {v10, v5, v6}, La/ncs0;->f(J)V

    .line 354
    .line 355
    .line 356
    move/from16 v20, v7

    .line 357
    .line 358
    invoke-virtual {v15}, Landroidx/media3/common/b;->a()La/awq;

    .line 359
    .line 360
    .line 361
    move-result-object v7

    .line 362
    move-object/from16 v21, v3

    .line 363
    .line 364
    invoke-static/range {v19 .. v19}, La/mg40;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v3

    .line 368
    iput-object v3, v7, La/awq;->n:Ljava/lang/String;

    .line 369
    .line 370
    const/4 v3, 0x1

    .line 371
    if-ne v9, v3, :cond_a

    .line 372
    .line 373
    iget v3, v4, La/met;->a:I

    .line 374
    .line 375
    move-wide/from16 v22, v5

    .line 376
    .line 377
    const/4 v5, -0x1

    .line 378
    if-eq v3, v5, :cond_b

    .line 379
    .line 380
    iget v6, v4, La/met;->b:I

    .line 381
    .line 382
    if-eq v6, v5, :cond_b

    .line 383
    .line 384
    iput v3, v7, La/awq;->M:I

    .line 385
    .line 386
    iput v6, v7, La/awq;->N:I

    .line 387
    .line 388
    goto :goto_a

    .line 389
    :cond_a
    move-wide/from16 v22, v5

    .line 390
    .line 391
    :cond_b
    :goto_a
    iget-object v3, v15, Landroidx/media3/common/b;->m:La/ed40;

    .line 392
    .line 393
    filled-new-array {v12, v13}, [La/ed40;

    .line 394
    .line 395
    .line 396
    move-result-object v5

    .line 397
    invoke-static {v9, v1, v7, v3, v5}, La/l7x;->Z(ILa/ed40;La/awq;La/ed40;[La/ed40;)V

    .line 398
    .line 399
    .line 400
    new-instance v3, La/w6r;

    .line 401
    .line 402
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 403
    .line 404
    .line 405
    move-result v5

    .line 406
    const/4 v6, 0x1

    .line 407
    if-ne v5, v6, :cond_c

    .line 408
    .line 409
    const/4 v9, 0x0

    .line 410
    invoke-virtual {v2, v9}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 411
    .line 412
    .line 413
    move-result-object v5

    .line 414
    check-cast v5, La/qwj;

    .line 415
    .line 416
    goto :goto_b

    .line 417
    :cond_c
    invoke-virtual {v2, v11}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v5

    .line 421
    check-cast v5, La/qwj;

    .line 422
    .line 423
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 424
    .line 425
    .line 426
    :goto_b
    new-instance v6, Landroidx/media3/common/b;

    .line 427
    .line 428
    invoke-direct {v6, v7}, Landroidx/media3/common/b;-><init>(La/awq;)V

    .line 429
    .line 430
    .line 431
    invoke-direct {v3, v10, v8, v5, v6}, La/w6r;-><init>(La/ncs0;La/ocs0;La/qwj;Landroidx/media3/common/b;)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v14, v11, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 435
    .line 436
    .line 437
    iget-wide v5, v0, La/x6r;->z:J

    .line 438
    .line 439
    move-wide/from16 v7, v22

    .line 440
    .line 441
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 442
    .line 443
    .line 444
    move-result-wide v5

    .line 445
    iput-wide v5, v0, La/x6r;->z:J

    .line 446
    .line 447
    :goto_c
    add-int/lit8 v7, v20, 0x1

    .line 448
    .line 449
    move/from16 v5, v17

    .line 450
    .line 451
    move-object/from16 v6, v19

    .line 452
    .line 453
    move-object/from16 v3, v21

    .line 454
    .line 455
    goto/16 :goto_9

    .line 456
    .line 457
    :cond_d
    iget-object v1, v0, La/x6r;->H:La/huo;

    .line 458
    .line 459
    invoke-interface {v1}, La/huo;->o()V

    .line 460
    .line 461
    .line 462
    goto/16 :goto_0

    .line 463
    .line 464
    :cond_e
    move-object/from16 v21, v3

    .line 465
    .line 466
    move v4, v5

    .line 467
    const/4 v1, 0x0

    .line 468
    const/4 v3, 0x0

    .line 469
    :goto_d
    if-ge v1, v4, :cond_10

    .line 470
    .line 471
    move-object/from16 v5, v21

    .line 472
    .line 473
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v6

    .line 477
    check-cast v6, La/ocs0;

    .line 478
    .line 479
    iget-object v6, v6, La/ocs0;->a:La/lbs0;

    .line 480
    .line 481
    iget-boolean v6, v6, La/lbs0;->m:Z

    .line 482
    .line 483
    if-eqz v6, :cond_f

    .line 484
    .line 485
    add-int/lit8 v3, v3, 0x1

    .line 486
    .line 487
    :cond_f
    add-int/lit8 v1, v1, 0x1

    .line 488
    .line 489
    move-object/from16 v21, v5

    .line 490
    .line 491
    goto :goto_d

    .line 492
    :cond_10
    move-object/from16 v5, v21

    .line 493
    .line 494
    invoke-virtual {v14}, Landroid/util/SparseArray;->size()I

    .line 495
    .line 496
    .line 497
    move-result v1

    .line 498
    if-ne v1, v3, :cond_11

    .line 499
    .line 500
    const/4 v1, 0x1

    .line 501
    goto :goto_e

    .line 502
    :cond_11
    const/4 v1, 0x0

    .line 503
    :goto_e
    invoke-static {v1}, La/x0x;->K(Z)V

    .line 504
    .line 505
    .line 506
    const/4 v1, 0x0

    .line 507
    :goto_f
    if-ge v1, v4, :cond_0

    .line 508
    .line 509
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v3

    .line 513
    check-cast v3, La/ocs0;

    .line 514
    .line 515
    iget-object v6, v3, La/ocs0;->a:La/lbs0;

    .line 516
    .line 517
    iget-boolean v7, v6, La/lbs0;->m:Z

    .line 518
    .line 519
    iget v6, v6, La/lbs0;->a:I

    .line 520
    .line 521
    if-nez v7, :cond_12

    .line 522
    .line 523
    goto :goto_11

    .line 524
    :cond_12
    invoke-virtual {v14, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v7

    .line 528
    check-cast v7, La/w6r;

    .line 529
    .line 530
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    .line 531
    .line 532
    .line 533
    move-result v8

    .line 534
    const/4 v9, 0x1

    .line 535
    if-ne v8, v9, :cond_13

    .line 536
    .line 537
    const/4 v9, 0x0

    .line 538
    invoke-virtual {v2, v9}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object v6

    .line 542
    check-cast v6, La/qwj;

    .line 543
    .line 544
    goto :goto_10

    .line 545
    :cond_13
    invoke-virtual {v2, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 546
    .line 547
    .line 548
    move-result-object v6

    .line 549
    check-cast v6, La/qwj;

    .line 550
    .line 551
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 552
    .line 553
    .line 554
    :goto_10
    iput-object v3, v7, La/w6r;->d:La/ocs0;

    .line 555
    .line 556
    iput-object v6, v7, La/w6r;->e:La/qwj;

    .line 557
    .line 558
    iget-object v3, v7, La/w6r;->l:Landroidx/media3/common/b;

    .line 559
    .line 560
    if-nez v3, :cond_14

    .line 561
    .line 562
    iget-object v3, v7, La/w6r;->a:La/ncs0;

    .line 563
    .line 564
    iget-object v6, v7, La/w6r;->m:Landroidx/media3/common/b;

    .line 565
    .line 566
    invoke-interface {v3, v6}, La/ncs0;->c(Landroidx/media3/common/b;)V

    .line 567
    .line 568
    .line 569
    :cond_14
    invoke-virtual {v7}, La/w6r;->e()V

    .line 570
    .line 571
    .line 572
    :goto_11
    add-int/lit8 v1, v1, 0x1

    .line 573
    .line 574
    goto :goto_f

    .line 575
    :cond_15
    const v6, 0x6d6f6f66

    .line 576
    .line 577
    .line 578
    if-ne v2, v6, :cond_65

    .line 579
    .line 580
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 581
    .line 582
    .line 583
    move-result v1

    .line 584
    const/4 v9, 0x0

    .line 585
    :goto_12
    if-ge v9, v1, :cond_5d

    .line 586
    .line 587
    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v2

    .line 591
    check-cast v2, La/ev40;

    .line 592
    .line 593
    iget v3, v2, La/syx;->b:I

    .line 594
    .line 595
    const v6, 0x74726166

    .line 596
    .line 597
    .line 598
    if-ne v3, v6, :cond_5c

    .line 599
    .line 600
    const v3, 0x74666864

    .line 601
    .line 602
    .line 603
    invoke-virtual {v2, v3}, La/ev40;->w(I)La/fv40;

    .line 604
    .line 605
    .line 606
    move-result-object v3

    .line 607
    iget-object v6, v2, La/ev40;->f:Ljava/util/ArrayList;

    .line 608
    .line 609
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 610
    .line 611
    .line 612
    iget-object v3, v3, La/fv40;->e:La/fq80;

    .line 613
    .line 614
    const/16 v7, 0x8

    .line 615
    .line 616
    invoke-virtual {v3, v7}, La/fq80;->M(I)V

    .line 617
    .line 618
    .line 619
    invoke-virtual {v3}, La/fq80;->m()I

    .line 620
    .line 621
    .line 622
    move-result v7

    .line 623
    sget-object v8, La/hr8;->a:[B

    .line 624
    .line 625
    invoke-virtual {v3}, La/fq80;->m()I

    .line 626
    .line 627
    .line 628
    move-result v8

    .line 629
    invoke-virtual {v14, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object v8

    .line 633
    check-cast v8, La/w6r;

    .line 634
    .line 635
    if-nez v8, :cond_16

    .line 636
    .line 637
    move/from16 v23, v1

    .line 638
    .line 639
    const/4 v8, 0x0

    .line 640
    const-wide v21, -0x7fffffffffffffffL    # -4.9E-324

    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    goto :goto_17

    .line 646
    :cond_16
    iget-object v12, v8, La/w6r;->b:La/xbs0;

    .line 647
    .line 648
    and-int/lit8 v13, v7, 0x1

    .line 649
    .line 650
    const-wide v21, -0x7fffffffffffffffL    # -4.9E-324

    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    if-eqz v13, :cond_17

    .line 656
    .line 657
    invoke-virtual {v3}, La/fq80;->F()J

    .line 658
    .line 659
    .line 660
    move-result-wide v10

    .line 661
    iput-wide v10, v12, La/xbs0;->b:J

    .line 662
    .line 663
    iput-wide v10, v12, La/xbs0;->c:J

    .line 664
    .line 665
    :cond_17
    iget-object v10, v8, La/w6r;->e:La/qwj;

    .line 666
    .line 667
    and-int/lit8 v11, v7, 0x2

    .line 668
    .line 669
    if-eqz v11, :cond_18

    .line 670
    .line 671
    invoke-virtual {v3}, La/fq80;->m()I

    .line 672
    .line 673
    .line 674
    move-result v11

    .line 675
    const/16 v18, 0x1

    .line 676
    .line 677
    add-int/lit8 v11, v11, -0x1

    .line 678
    .line 679
    goto :goto_13

    .line 680
    :cond_18
    iget v11, v10, La/qwj;->a:I

    .line 681
    .line 682
    :goto_13
    and-int/lit8 v13, v7, 0x8

    .line 683
    .line 684
    if-eqz v13, :cond_19

    .line 685
    .line 686
    invoke-virtual {v3}, La/fq80;->m()I

    .line 687
    .line 688
    .line 689
    move-result v13

    .line 690
    goto :goto_14

    .line 691
    :cond_19
    iget v13, v10, La/qwj;->b:I

    .line 692
    .line 693
    :goto_14
    and-int/lit8 v23, v7, 0x10

    .line 694
    .line 695
    if-eqz v23, :cond_1a

    .line 696
    .line 697
    invoke-virtual {v3}, La/fq80;->m()I

    .line 698
    .line 699
    .line 700
    move-result v23

    .line 701
    move/from16 v54, v23

    .line 702
    .line 703
    move/from16 v23, v1

    .line 704
    .line 705
    move/from16 v1, v54

    .line 706
    .line 707
    goto :goto_15

    .line 708
    :cond_1a
    move/from16 v23, v1

    .line 709
    .line 710
    iget v1, v10, La/qwj;->c:I

    .line 711
    .line 712
    :goto_15
    and-int/lit8 v7, v7, 0x20

    .line 713
    .line 714
    if-eqz v7, :cond_1b

    .line 715
    .line 716
    invoke-virtual {v3}, La/fq80;->m()I

    .line 717
    .line 718
    .line 719
    move-result v3

    .line 720
    goto :goto_16

    .line 721
    :cond_1b
    iget v3, v10, La/qwj;->d:I

    .line 722
    .line 723
    :goto_16
    new-instance v7, La/qwj;

    .line 724
    .line 725
    invoke-direct {v7, v11, v13, v1, v3}, La/qwj;-><init>(IIII)V

    .line 726
    .line 727
    .line 728
    iput-object v7, v12, La/xbs0;->a:La/qwj;

    .line 729
    .line 730
    :goto_17
    if-nez v8, :cond_1d

    .line 731
    .line 732
    move-object/from16 v24, v4

    .line 733
    .line 734
    move-object/from16 v32, v5

    .line 735
    .line 736
    move/from16 v33, v9

    .line 737
    .line 738
    const/4 v3, 0x0

    .line 739
    const/4 v9, 0x1

    .line 740
    const/16 v12, 0xc

    .line 741
    .line 742
    :cond_1c
    const/16 v7, 0x8

    .line 743
    .line 744
    const/4 v10, 0x0

    .line 745
    goto/16 :goto_41

    .line 746
    .line 747
    :cond_1d
    iget-object v1, v8, La/w6r;->b:La/xbs0;

    .line 748
    .line 749
    iget-wide v10, v1, La/xbs0;->p:J

    .line 750
    .line 751
    iget-boolean v3, v1, La/xbs0;->q:Z

    .line 752
    .line 753
    invoke-virtual {v8}, La/w6r;->e()V

    .line 754
    .line 755
    .line 756
    const/4 v7, 0x1

    .line 757
    iput-boolean v7, v8, La/w6r;->n:Z

    .line 758
    .line 759
    const v12, 0x74666474

    .line 760
    .line 761
    .line 762
    invoke-virtual {v2, v12}, La/ev40;->w(I)La/fv40;

    .line 763
    .line 764
    .line 765
    move-result-object v12

    .line 766
    if-eqz v12, :cond_1f

    .line 767
    .line 768
    and-int/lit8 v13, v15, 0x2

    .line 769
    .line 770
    if-nez v13, :cond_1f

    .line 771
    .line 772
    iget-object v3, v12, La/fv40;->e:La/fq80;

    .line 773
    .line 774
    const/16 v10, 0x8

    .line 775
    .line 776
    invoke-virtual {v3, v10}, La/fq80;->M(I)V

    .line 777
    .line 778
    .line 779
    invoke-virtual {v3}, La/fq80;->m()I

    .line 780
    .line 781
    .line 782
    move-result v10

    .line 783
    invoke-static {v10}, La/hr8;->e(I)I

    .line 784
    .line 785
    .line 786
    move-result v10

    .line 787
    if-ne v10, v7, :cond_1e

    .line 788
    .line 789
    invoke-virtual {v3}, La/fq80;->F()J

    .line 790
    .line 791
    .line 792
    move-result-wide v10

    .line 793
    goto :goto_18

    .line 794
    :cond_1e
    invoke-virtual {v3}, La/fq80;->B()J

    .line 795
    .line 796
    .line 797
    move-result-wide v10

    .line 798
    :goto_18
    iput-wide v10, v1, La/xbs0;->p:J

    .line 799
    .line 800
    iput-boolean v7, v1, La/xbs0;->q:Z

    .line 801
    .line 802
    goto :goto_19

    .line 803
    :cond_1f
    iput-wide v10, v1, La/xbs0;->p:J

    .line 804
    .line 805
    iput-boolean v3, v1, La/xbs0;->q:Z

    .line 806
    .line 807
    :goto_19
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 808
    .line 809
    .line 810
    move-result v3

    .line 811
    const/4 v7, 0x0

    .line 812
    const/4 v10, 0x0

    .line 813
    const/4 v11, 0x0

    .line 814
    :goto_1a
    const v12, 0x7472756e

    .line 815
    .line 816
    .line 817
    if-ge v7, v3, :cond_21

    .line 818
    .line 819
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 820
    .line 821
    .line 822
    move-result-object v13

    .line 823
    check-cast v13, La/fv40;

    .line 824
    .line 825
    move-object/from16 v24, v4

    .line 826
    .line 827
    iget v4, v13, La/syx;->b:I

    .line 828
    .line 829
    if-ne v4, v12, :cond_20

    .line 830
    .line 831
    iget-object v4, v13, La/fv40;->e:La/fq80;

    .line 832
    .line 833
    const/16 v12, 0xc

    .line 834
    .line 835
    invoke-virtual {v4, v12}, La/fq80;->M(I)V

    .line 836
    .line 837
    .line 838
    invoke-virtual {v4}, La/fq80;->D()I

    .line 839
    .line 840
    .line 841
    move-result v4

    .line 842
    if-lez v4, :cond_20

    .line 843
    .line 844
    add-int/2addr v11, v4

    .line 845
    add-int/lit8 v10, v10, 0x1

    .line 846
    .line 847
    :cond_20
    add-int/lit8 v7, v7, 0x1

    .line 848
    .line 849
    move-object/from16 v4, v24

    .line 850
    .line 851
    goto :goto_1a

    .line 852
    :cond_21
    move-object/from16 v24, v4

    .line 853
    .line 854
    const/4 v4, 0x0

    .line 855
    iput v4, v8, La/w6r;->h:I

    .line 856
    .line 857
    iput v4, v8, La/w6r;->g:I

    .line 858
    .line 859
    iput v4, v8, La/w6r;->f:I

    .line 860
    .line 861
    iput v10, v1, La/xbs0;->d:I

    .line 862
    .line 863
    iput v11, v1, La/xbs0;->e:I

    .line 864
    .line 865
    iget-object v4, v1, La/xbs0;->g:[I

    .line 866
    .line 867
    array-length v4, v4

    .line 868
    if-ge v4, v10, :cond_22

    .line 869
    .line 870
    new-array v4, v10, [J

    .line 871
    .line 872
    iput-object v4, v1, La/xbs0;->f:[J

    .line 873
    .line 874
    new-array v4, v10, [I

    .line 875
    .line 876
    iput-object v4, v1, La/xbs0;->g:[I

    .line 877
    .line 878
    :cond_22
    iget-object v4, v1, La/xbs0;->h:[I

    .line 879
    .line 880
    array-length v4, v4

    .line 881
    if-ge v4, v11, :cond_23

    .line 882
    .line 883
    mul-int/lit8 v11, v11, 0x7d

    .line 884
    .line 885
    div-int/lit8 v11, v11, 0x64

    .line 886
    .line 887
    new-array v4, v11, [I

    .line 888
    .line 889
    iput-object v4, v1, La/xbs0;->h:[I

    .line 890
    .line 891
    new-array v4, v11, [J

    .line 892
    .line 893
    iput-object v4, v1, La/xbs0;->i:[J

    .line 894
    .line 895
    new-array v4, v11, [Z

    .line 896
    .line 897
    iput-object v4, v1, La/xbs0;->j:[Z

    .line 898
    .line 899
    new-array v4, v11, [Z

    .line 900
    .line 901
    iput-object v4, v1, La/xbs0;->l:[Z

    .line 902
    .line 903
    :cond_23
    const/4 v4, 0x0

    .line 904
    const/4 v7, 0x0

    .line 905
    const/4 v10, 0x0

    .line 906
    :goto_1b
    const-wide/16 v25, 0x0

    .line 907
    .line 908
    if-ge v4, v3, :cond_3d

    .line 909
    .line 910
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 911
    .line 912
    .line 913
    move-result-object v27

    .line 914
    const/16 v28, 0x10

    .line 915
    .line 916
    move-object/from16 v11, v27

    .line 917
    .line 918
    check-cast v11, La/fv40;

    .line 919
    .line 920
    iget v13, v11, La/syx;->b:I

    .line 921
    .line 922
    if-ne v13, v12, :cond_3c

    .line 923
    .line 924
    add-int/lit8 v13, v7, 0x1

    .line 925
    .line 926
    iget-object v11, v11, La/fv40;->e:La/fq80;

    .line 927
    .line 928
    const/16 v12, 0x8

    .line 929
    .line 930
    invoke-virtual {v11, v12}, La/fq80;->M(I)V

    .line 931
    .line 932
    .line 933
    invoke-virtual {v11}, La/fq80;->m()I

    .line 934
    .line 935
    .line 936
    move-result v12

    .line 937
    sget-object v30, La/hr8;->a:[B

    .line 938
    .line 939
    move/from16 v30, v3

    .line 940
    .line 941
    iget-object v3, v8, La/w6r;->d:La/ocs0;

    .line 942
    .line 943
    iget-object v3, v3, La/ocs0;->a:La/lbs0;

    .line 944
    .line 945
    move/from16 v31, v4

    .line 946
    .line 947
    iget-object v4, v1, La/xbs0;->a:La/qwj;

    .line 948
    .line 949
    sget-object v32, La/vtt0;->a:Ljava/lang/String;

    .line 950
    .line 951
    move-object/from16 v32, v5

    .line 952
    .line 953
    iget-object v5, v1, La/xbs0;->g:[I

    .line 954
    .line 955
    invoke-virtual {v11}, La/fq80;->D()I

    .line 956
    .line 957
    .line 958
    move-result v33

    .line 959
    aput v33, v5, v7

    .line 960
    .line 961
    iget-object v5, v1, La/xbs0;->f:[J

    .line 962
    .line 963
    move/from16 v33, v9

    .line 964
    .line 965
    move/from16 v34, v10

    .line 966
    .line 967
    iget-wide v9, v1, La/xbs0;->b:J

    .line 968
    .line 969
    aput-wide v9, v5, v7

    .line 970
    .line 971
    and-int/lit8 v35, v12, 0x1

    .line 972
    .line 973
    if-eqz v35, :cond_24

    .line 974
    .line 975
    move-object/from16 v35, v5

    .line 976
    .line 977
    invoke-virtual {v11}, La/fq80;->m()I

    .line 978
    .line 979
    .line 980
    move-result v5

    .line 981
    move-wide/from16 v36, v9

    .line 982
    .line 983
    int-to-long v9, v5

    .line 984
    add-long v9, v36, v9

    .line 985
    .line 986
    aput-wide v9, v35, v7

    .line 987
    .line 988
    :cond_24
    and-int/lit8 v5, v12, 0x4

    .line 989
    .line 990
    if-eqz v5, :cond_25

    .line 991
    .line 992
    const/4 v5, 0x1

    .line 993
    goto :goto_1c

    .line 994
    :cond_25
    const/4 v5, 0x0

    .line 995
    :goto_1c
    iget v9, v4, La/qwj;->d:I

    .line 996
    .line 997
    if-eqz v5, :cond_26

    .line 998
    .line 999
    invoke-virtual {v11}, La/fq80;->m()I

    .line 1000
    .line 1001
    .line 1002
    move-result v9

    .line 1003
    :cond_26
    and-int/lit16 v10, v12, 0x100

    .line 1004
    .line 1005
    if-eqz v10, :cond_27

    .line 1006
    .line 1007
    const/4 v10, 0x1

    .line 1008
    goto :goto_1d

    .line 1009
    :cond_27
    const/4 v10, 0x0

    .line 1010
    :goto_1d
    move/from16 v35, v5

    .line 1011
    .line 1012
    and-int/lit16 v5, v12, 0x200

    .line 1013
    .line 1014
    if-eqz v5, :cond_28

    .line 1015
    .line 1016
    const/4 v5, 0x1

    .line 1017
    goto :goto_1e

    .line 1018
    :cond_28
    const/4 v5, 0x0

    .line 1019
    :goto_1e
    move/from16 v36, v5

    .line 1020
    .line 1021
    and-int/lit16 v5, v12, 0x400

    .line 1022
    .line 1023
    if-eqz v5, :cond_29

    .line 1024
    .line 1025
    const/4 v5, 0x1

    .line 1026
    goto :goto_1f

    .line 1027
    :cond_29
    const/4 v5, 0x0

    .line 1028
    :goto_1f
    and-int/lit16 v12, v12, 0x800

    .line 1029
    .line 1030
    if-eqz v12, :cond_2a

    .line 1031
    .line 1032
    const/4 v12, 0x1

    .line 1033
    :goto_20
    move/from16 v37, v5

    .line 1034
    .line 1035
    goto :goto_21

    .line 1036
    :cond_2a
    const/4 v12, 0x0

    .line 1037
    goto :goto_20

    .line 1038
    :goto_21
    iget-object v5, v3, La/lbs0;->i:La/c4x;

    .line 1039
    .line 1040
    move/from16 v38, v7

    .line 1041
    .line 1042
    iget-object v7, v3, La/lbs0;->j:La/c4x;

    .line 1043
    .line 1044
    if-eqz v5, :cond_2e

    .line 1045
    .line 1046
    move/from16 v39, v9

    .line 1047
    .line 1048
    iget v9, v5, La/c4x;->b:I

    .line 1049
    .line 1050
    move/from16 v40, v10

    .line 1051
    .line 1052
    const/4 v10, 0x1

    .line 1053
    if-ne v9, v10, :cond_2b

    .line 1054
    .line 1055
    if-nez v7, :cond_2c

    .line 1056
    .line 1057
    :cond_2b
    move-object/from16 v41, v6

    .line 1058
    .line 1059
    goto :goto_23

    .line 1060
    :cond_2c
    const/4 v9, 0x0

    .line 1061
    invoke-virtual {v5, v9}, La/c4x;->a(I)J

    .line 1062
    .line 1063
    .line 1064
    move-result-wide v41

    .line 1065
    cmp-long v10, v41, v25

    .line 1066
    .line 1067
    if-nez v10, :cond_2d

    .line 1068
    .line 1069
    move-object/from16 v41, v6

    .line 1070
    .line 1071
    goto :goto_22

    .line 1072
    :cond_2d
    invoke-virtual {v5, v9}, La/c4x;->a(I)J

    .line 1073
    .line 1074
    .line 1075
    move-result-wide v41

    .line 1076
    iget-wide v9, v3, La/lbs0;->d:J

    .line 1077
    .line 1078
    sget-object v47, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1079
    .line 1080
    const-wide/32 v43, 0xf4240

    .line 1081
    .line 1082
    .line 1083
    move-wide/from16 v45, v9

    .line 1084
    .line 1085
    invoke-static/range {v41 .. v47}, La/vtt0;->T(JJJLjava/math/RoundingMode;)J

    .line 1086
    .line 1087
    .line 1088
    move-result-wide v9

    .line 1089
    const/4 v5, 0x0

    .line 1090
    invoke-virtual {v7, v5}, La/c4x;->a(I)J

    .line 1091
    .line 1092
    .line 1093
    move-result-wide v43

    .line 1094
    const-wide/32 v45, 0xf4240

    .line 1095
    .line 1096
    .line 1097
    move-object/from16 v41, v6

    .line 1098
    .line 1099
    iget-wide v5, v3, La/lbs0;->c:J

    .line 1100
    .line 1101
    move-object/from16 v49, v47

    .line 1102
    .line 1103
    move-wide/from16 v47, v5

    .line 1104
    .line 1105
    invoke-static/range {v43 .. v49}, La/vtt0;->T(JJJLjava/math/RoundingMode;)J

    .line 1106
    .line 1107
    .line 1108
    move-result-wide v5

    .line 1109
    add-long/2addr v9, v5

    .line 1110
    iget-wide v5, v3, La/lbs0;->e:J

    .line 1111
    .line 1112
    cmp-long v5, v9, v5

    .line 1113
    .line 1114
    if-ltz v5, :cond_2f

    .line 1115
    .line 1116
    const/4 v9, 0x0

    .line 1117
    :goto_22
    invoke-virtual {v7, v9}, La/c4x;->a(I)J

    .line 1118
    .line 1119
    .line 1120
    move-result-wide v25

    .line 1121
    goto :goto_23

    .line 1122
    :cond_2e
    move-object/from16 v41, v6

    .line 1123
    .line 1124
    move/from16 v39, v9

    .line 1125
    .line 1126
    move/from16 v40, v10

    .line 1127
    .line 1128
    :cond_2f
    :goto_23
    iget-object v5, v1, La/xbs0;->h:[I

    .line 1129
    .line 1130
    iget-object v6, v1, La/xbs0;->i:[J

    .line 1131
    .line 1132
    iget-object v7, v1, La/xbs0;->j:[Z

    .line 1133
    .line 1134
    iget v9, v3, La/lbs0;->b:I

    .line 1135
    .line 1136
    const/4 v10, 0x2

    .line 1137
    if-ne v9, v10, :cond_30

    .line 1138
    .line 1139
    and-int/lit8 v9, v15, 0x1

    .line 1140
    .line 1141
    if-eqz v9, :cond_30

    .line 1142
    .line 1143
    const/4 v9, 0x1

    .line 1144
    goto :goto_24

    .line 1145
    :cond_30
    const/4 v9, 0x0

    .line 1146
    :goto_24
    iget-object v10, v1, La/xbs0;->g:[I

    .line 1147
    .line 1148
    aget v10, v10, v38

    .line 1149
    .line 1150
    add-int v10, v34, v10

    .line 1151
    .line 1152
    move-object/from16 v27, v5

    .line 1153
    .line 1154
    move-object/from16 v49, v6

    .line 1155
    .line 1156
    iget-wide v5, v3, La/lbs0;->c:J

    .line 1157
    .line 1158
    move-wide/from16 v46, v5

    .line 1159
    .line 1160
    iget-wide v5, v1, La/xbs0;->p:J

    .line 1161
    .line 1162
    move/from16 v3, v34

    .line 1163
    .line 1164
    :goto_25
    if-ge v3, v10, :cond_3b

    .line 1165
    .line 1166
    if-eqz v40, :cond_31

    .line 1167
    .line 1168
    invoke-virtual {v11}, La/fq80;->m()I

    .line 1169
    .line 1170
    .line 1171
    move-result v34

    .line 1172
    move/from16 v50, v34

    .line 1173
    .line 1174
    move/from16 v34, v3

    .line 1175
    .line 1176
    move/from16 v3, v50

    .line 1177
    .line 1178
    :goto_26
    move-object/from16 v50, v7

    .line 1179
    .line 1180
    goto :goto_27

    .line 1181
    :cond_31
    move/from16 v34, v3

    .line 1182
    .line 1183
    iget v3, v4, La/qwj;->b:I

    .line 1184
    .line 1185
    goto :goto_26

    .line 1186
    :goto_27
    const-string v7, "Unexpected negative value: "

    .line 1187
    .line 1188
    if-ltz v3, :cond_3a

    .line 1189
    .line 1190
    if-eqz v36, :cond_32

    .line 1191
    .line 1192
    invoke-virtual {v11}, La/fq80;->m()I

    .line 1193
    .line 1194
    .line 1195
    move-result v38

    .line 1196
    move/from16 v51, v9

    .line 1197
    .line 1198
    move/from16 v9, v38

    .line 1199
    .line 1200
    goto :goto_28

    .line 1201
    :cond_32
    move/from16 v51, v9

    .line 1202
    .line 1203
    iget v9, v4, La/qwj;->c:I

    .line 1204
    .line 1205
    :goto_28
    if-ltz v9, :cond_39

    .line 1206
    .line 1207
    if-eqz v37, :cond_33

    .line 1208
    .line 1209
    invoke-virtual {v11}, La/fq80;->m()I

    .line 1210
    .line 1211
    .line 1212
    move-result v7

    .line 1213
    goto :goto_29

    .line 1214
    :cond_33
    if-nez v34, :cond_34

    .line 1215
    .line 1216
    if-eqz v35, :cond_34

    .line 1217
    .line 1218
    move/from16 v7, v39

    .line 1219
    .line 1220
    goto :goto_29

    .line 1221
    :cond_34
    iget v7, v4, La/qwj;->d:I

    .line 1222
    .line 1223
    :goto_29
    if-eqz v12, :cond_35

    .line 1224
    .line 1225
    invoke-virtual {v11}, La/fq80;->m()I

    .line 1226
    .line 1227
    .line 1228
    move-result v38

    .line 1229
    move-object/from16 v52, v4

    .line 1230
    .line 1231
    move/from16 v4, v38

    .line 1232
    .line 1233
    move-object/from16 v53, v11

    .line 1234
    .line 1235
    move/from16 v38, v10

    .line 1236
    .line 1237
    goto :goto_2a

    .line 1238
    :cond_35
    move-object/from16 v52, v4

    .line 1239
    .line 1240
    const/4 v4, 0x0

    .line 1241
    move/from16 v38, v10

    .line 1242
    .line 1243
    move-object/from16 v53, v11

    .line 1244
    .line 1245
    :goto_2a
    int-to-long v10, v4

    .line 1246
    add-long/2addr v10, v5

    .line 1247
    sub-long v42, v10, v25

    .line 1248
    .line 1249
    const-wide/32 v44, 0xf4240

    .line 1250
    .line 1251
    .line 1252
    sget-object v48, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 1253
    .line 1254
    invoke-static/range {v42 .. v48}, La/vtt0;->T(JJJLjava/math/RoundingMode;)J

    .line 1255
    .line 1256
    .line 1257
    move-result-wide v10

    .line 1258
    aput-wide v10, v49, v34

    .line 1259
    .line 1260
    iget-boolean v4, v1, La/xbs0;->q:Z

    .line 1261
    .line 1262
    if-nez v4, :cond_36

    .line 1263
    .line 1264
    iget-object v4, v8, La/w6r;->d:La/ocs0;

    .line 1265
    .line 1266
    move-wide/from16 v42, v10

    .line 1267
    .line 1268
    iget-wide v10, v4, La/ocs0;->i:J

    .line 1269
    .line 1270
    add-long v10, v42, v10

    .line 1271
    .line 1272
    aput-wide v10, v49, v34

    .line 1273
    .line 1274
    :cond_36
    aput v9, v27, v34

    .line 1275
    .line 1276
    shr-int/lit8 v4, v7, 0x10

    .line 1277
    .line 1278
    const/16 v18, 0x1

    .line 1279
    .line 1280
    and-int/lit8 v4, v4, 0x1

    .line 1281
    .line 1282
    if-nez v4, :cond_38

    .line 1283
    .line 1284
    if-eqz v51, :cond_37

    .line 1285
    .line 1286
    if-nez v34, :cond_38

    .line 1287
    .line 1288
    :cond_37
    const/4 v4, 0x1

    .line 1289
    goto :goto_2b

    .line 1290
    :cond_38
    const/4 v4, 0x0

    .line 1291
    :goto_2b
    aput-boolean v4, v50, v34

    .line 1292
    .line 1293
    int-to-long v3, v3

    .line 1294
    add-long/2addr v5, v3

    .line 1295
    add-int/lit8 v3, v34, 0x1

    .line 1296
    .line 1297
    move/from16 v10, v38

    .line 1298
    .line 1299
    move-object/from16 v7, v50

    .line 1300
    .line 1301
    move/from16 v9, v51

    .line 1302
    .line 1303
    move-object/from16 v4, v52

    .line 1304
    .line 1305
    move-object/from16 v11, v53

    .line 1306
    .line 1307
    goto/16 :goto_25

    .line 1308
    .line 1309
    :cond_39
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1310
    .line 1311
    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1312
    .line 1313
    .line 1314
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1315
    .line 1316
    .line 1317
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v0

    .line 1321
    const/4 v6, 0x0

    .line 1322
    invoke-static {v0, v6}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v0

    .line 1326
    throw v0

    .line 1327
    :cond_3a
    const/4 v6, 0x0

    .line 1328
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1329
    .line 1330
    invoke-direct {v0, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1331
    .line 1332
    .line 1333
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1334
    .line 1335
    .line 1336
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v0

    .line 1340
    invoke-static {v0, v6}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v0

    .line 1344
    throw v0

    .line 1345
    :cond_3b
    move/from16 v38, v10

    .line 1346
    .line 1347
    iput-wide v5, v1, La/xbs0;->p:J

    .line 1348
    .line 1349
    move v7, v13

    .line 1350
    goto :goto_2c

    .line 1351
    :cond_3c
    move/from16 v30, v3

    .line 1352
    .line 1353
    move/from16 v31, v4

    .line 1354
    .line 1355
    move-object/from16 v32, v5

    .line 1356
    .line 1357
    move-object/from16 v41, v6

    .line 1358
    .line 1359
    move/from16 v38, v7

    .line 1360
    .line 1361
    move/from16 v33, v9

    .line 1362
    .line 1363
    move/from16 v34, v10

    .line 1364
    .line 1365
    :goto_2c
    add-int/lit8 v4, v31, 0x1

    .line 1366
    .line 1367
    move/from16 v3, v30

    .line 1368
    .line 1369
    move-object/from16 v5, v32

    .line 1370
    .line 1371
    move/from16 v9, v33

    .line 1372
    .line 1373
    move-object/from16 v6, v41

    .line 1374
    .line 1375
    const v12, 0x7472756e

    .line 1376
    .line 1377
    .line 1378
    goto/16 :goto_1b

    .line 1379
    .line 1380
    :cond_3d
    move-object/from16 v32, v5

    .line 1381
    .line 1382
    move-object/from16 v41, v6

    .line 1383
    .line 1384
    move/from16 v33, v9

    .line 1385
    .line 1386
    const/16 v28, 0x10

    .line 1387
    .line 1388
    iget-object v3, v8, La/w6r;->d:La/ocs0;

    .line 1389
    .line 1390
    iget-object v3, v3, La/ocs0;->a:La/lbs0;

    .line 1391
    .line 1392
    iget-object v4, v1, La/xbs0;->a:La/qwj;

    .line 1393
    .line 1394
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1395
    .line 1396
    .line 1397
    iget v4, v4, La/qwj;->a:I

    .line 1398
    .line 1399
    iget-object v3, v3, La/lbs0;->n:[La/vbs0;

    .line 1400
    .line 1401
    if-nez v3, :cond_3e

    .line 1402
    .line 1403
    const/4 v6, 0x0

    .line 1404
    goto :goto_2d

    .line 1405
    :cond_3e
    aget-object v3, v3, v4

    .line 1406
    .line 1407
    move-object v6, v3

    .line 1408
    :goto_2d
    const v3, 0x7361697a

    .line 1409
    .line 1410
    .line 1411
    invoke-virtual {v2, v3}, La/ev40;->w(I)La/fv40;

    .line 1412
    .line 1413
    .line 1414
    move-result-object v3

    .line 1415
    if-eqz v3, :cond_45

    .line 1416
    .line 1417
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1418
    .line 1419
    .line 1420
    iget-object v3, v3, La/fv40;->e:La/fq80;

    .line 1421
    .line 1422
    iget-short v4, v6, La/vbs0;->d:S

    .line 1423
    .line 1424
    const/16 v7, 0x8

    .line 1425
    .line 1426
    invoke-virtual {v3, v7}, La/fq80;->M(I)V

    .line 1427
    .line 1428
    .line 1429
    invoke-virtual {v3}, La/fq80;->m()I

    .line 1430
    .line 1431
    .line 1432
    move-result v5

    .line 1433
    sget-object v8, La/hr8;->a:[B

    .line 1434
    .line 1435
    const/4 v9, 0x1

    .line 1436
    and-int/2addr v5, v9

    .line 1437
    if-ne v5, v9, :cond_3f

    .line 1438
    .line 1439
    invoke-virtual {v3, v7}, La/fq80;->N(I)V

    .line 1440
    .line 1441
    .line 1442
    :cond_3f
    invoke-virtual {v3}, La/fq80;->z()I

    .line 1443
    .line 1444
    .line 1445
    move-result v5

    .line 1446
    invoke-virtual {v3}, La/fq80;->D()I

    .line 1447
    .line 1448
    .line 1449
    move-result v7

    .line 1450
    iget v8, v1, La/xbs0;->e:I

    .line 1451
    .line 1452
    if-gt v7, v8, :cond_44

    .line 1453
    .line 1454
    if-nez v5, :cond_42

    .line 1455
    .line 1456
    iget-object v5, v1, La/xbs0;->l:[Z

    .line 1457
    .line 1458
    const/4 v8, 0x0

    .line 1459
    const/4 v9, 0x0

    .line 1460
    :goto_2e
    if-ge v8, v7, :cond_41

    .line 1461
    .line 1462
    invoke-virtual {v3}, La/fq80;->z()I

    .line 1463
    .line 1464
    .line 1465
    move-result v10

    .line 1466
    add-int/2addr v9, v10

    .line 1467
    if-le v10, v4, :cond_40

    .line 1468
    .line 1469
    const/4 v10, 0x1

    .line 1470
    goto :goto_2f

    .line 1471
    :cond_40
    const/4 v10, 0x0

    .line 1472
    :goto_2f
    aput-boolean v10, v5, v8

    .line 1473
    .line 1474
    add-int/lit8 v8, v8, 0x1

    .line 1475
    .line 1476
    goto :goto_2e

    .line 1477
    :cond_41
    const/4 v5, 0x0

    .line 1478
    goto :goto_31

    .line 1479
    :cond_42
    if-le v5, v4, :cond_43

    .line 1480
    .line 1481
    const/4 v3, 0x1

    .line 1482
    goto :goto_30

    .line 1483
    :cond_43
    const/4 v3, 0x0

    .line 1484
    :goto_30
    mul-int v9, v5, v7

    .line 1485
    .line 1486
    iget-object v4, v1, La/xbs0;->l:[Z

    .line 1487
    .line 1488
    const/4 v5, 0x0

    .line 1489
    invoke-static {v4, v5, v7, v3}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 1490
    .line 1491
    .line 1492
    :goto_31
    iget-object v3, v1, La/xbs0;->l:[Z

    .line 1493
    .line 1494
    iget v4, v1, La/xbs0;->e:I

    .line 1495
    .line 1496
    invoke-static {v3, v7, v4, v5}, Ljava/util/Arrays;->fill([ZIIZ)V

    .line 1497
    .line 1498
    .line 1499
    if-lez v9, :cond_45

    .line 1500
    .line 1501
    iget-object v3, v1, La/xbs0;->n:La/fq80;

    .line 1502
    .line 1503
    invoke-virtual {v3, v9}, La/fq80;->J(I)V

    .line 1504
    .line 1505
    .line 1506
    const/4 v9, 0x1

    .line 1507
    iput-boolean v9, v1, La/xbs0;->k:Z

    .line 1508
    .line 1509
    iput-boolean v9, v1, La/xbs0;->o:Z

    .line 1510
    .line 1511
    goto :goto_32

    .line 1512
    :cond_44
    const-string v0, "Saiz sample count "

    .line 1513
    .line 1514
    const-string v2, " is greater than fragment sample count"

    .line 1515
    .line 1516
    invoke-static {v7, v0, v2}, La/b1j;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1517
    .line 1518
    .line 1519
    move-result-object v0

    .line 1520
    iget v1, v1, La/xbs0;->e:I

    .line 1521
    .line 1522
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1523
    .line 1524
    .line 1525
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v0

    .line 1529
    const/4 v6, 0x0

    .line 1530
    invoke-static {v0, v6}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    .line 1531
    .line 1532
    .line 1533
    move-result-object v0

    .line 1534
    throw v0

    .line 1535
    :cond_45
    :goto_32
    const v3, 0x7361696f

    .line 1536
    .line 1537
    .line 1538
    invoke-virtual {v2, v3}, La/ev40;->w(I)La/fv40;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v3

    .line 1542
    if-eqz v3, :cond_48

    .line 1543
    .line 1544
    iget-object v3, v3, La/fv40;->e:La/fq80;

    .line 1545
    .line 1546
    const/16 v7, 0x8

    .line 1547
    .line 1548
    invoke-virtual {v3, v7}, La/fq80;->M(I)V

    .line 1549
    .line 1550
    .line 1551
    invoke-virtual {v3}, La/fq80;->m()I

    .line 1552
    .line 1553
    .line 1554
    move-result v4

    .line 1555
    sget-object v5, La/hr8;->a:[B

    .line 1556
    .line 1557
    and-int/lit8 v5, v4, 0x1

    .line 1558
    .line 1559
    const/4 v9, 0x1

    .line 1560
    if-ne v5, v9, :cond_46

    .line 1561
    .line 1562
    invoke-virtual {v3, v7}, La/fq80;->N(I)V

    .line 1563
    .line 1564
    .line 1565
    :cond_46
    invoke-virtual {v3}, La/fq80;->D()I

    .line 1566
    .line 1567
    .line 1568
    move-result v5

    .line 1569
    if-ne v5, v9, :cond_49

    .line 1570
    .line 1571
    invoke-static {v4}, La/hr8;->e(I)I

    .line 1572
    .line 1573
    .line 1574
    move-result v4

    .line 1575
    iget-wide v7, v1, La/xbs0;->c:J

    .line 1576
    .line 1577
    if-nez v4, :cond_47

    .line 1578
    .line 1579
    invoke-virtual {v3}, La/fq80;->B()J

    .line 1580
    .line 1581
    .line 1582
    move-result-wide v3

    .line 1583
    goto :goto_33

    .line 1584
    :cond_47
    invoke-virtual {v3}, La/fq80;->F()J

    .line 1585
    .line 1586
    .line 1587
    move-result-wide v3

    .line 1588
    :goto_33
    add-long/2addr v7, v3

    .line 1589
    iput-wide v7, v1, La/xbs0;->c:J

    .line 1590
    .line 1591
    :cond_48
    const/4 v3, 0x0

    .line 1592
    goto :goto_34

    .line 1593
    :cond_49
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1594
    .line 1595
    const-string v1, "Unexpected saio entry count: "

    .line 1596
    .line 1597
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1598
    .line 1599
    .line 1600
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1601
    .line 1602
    .line 1603
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1604
    .line 1605
    .line 1606
    move-result-object v0

    .line 1607
    const/4 v3, 0x0

    .line 1608
    invoke-static {v0, v3}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    .line 1609
    .line 1610
    .line 1611
    move-result-object v0

    .line 1612
    throw v0

    .line 1613
    :goto_34
    const v4, 0x73656e63

    .line 1614
    .line 1615
    .line 1616
    invoke-virtual {v2, v4}, La/ev40;->w(I)La/fv40;

    .line 1617
    .line 1618
    .line 1619
    move-result-object v2

    .line 1620
    if-eqz v2, :cond_4a

    .line 1621
    .line 1622
    iget-object v2, v2, La/fv40;->e:La/fq80;

    .line 1623
    .line 1624
    const/4 v9, 0x0

    .line 1625
    invoke-static {v2, v9, v1}, La/x6r;->j(La/fq80;ILa/xbs0;)V

    .line 1626
    .line 1627
    .line 1628
    :cond_4a
    if-eqz v6, :cond_4b

    .line 1629
    .line 1630
    iget-object v6, v6, La/vbs0;->b:Ljava/lang/String;

    .line 1631
    .line 1632
    move-object/from16 v44, v6

    .line 1633
    .line 1634
    goto :goto_35

    .line 1635
    :cond_4b
    move-object/from16 v44, v3

    .line 1636
    .line 1637
    :goto_35
    move-object v2, v3

    .line 1638
    move-object v6, v2

    .line 1639
    const/4 v4, 0x0

    .line 1640
    :goto_36
    invoke-virtual/range {v41 .. v41}, Ljava/util/ArrayList;->size()I

    .line 1641
    .line 1642
    .line 1643
    move-result v5

    .line 1644
    if-ge v4, v5, :cond_4e

    .line 1645
    .line 1646
    move-object/from16 v5, v41

    .line 1647
    .line 1648
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1649
    .line 1650
    .line 1651
    move-result-object v7

    .line 1652
    check-cast v7, La/fv40;

    .line 1653
    .line 1654
    iget-object v8, v7, La/fv40;->e:La/fq80;

    .line 1655
    .line 1656
    iget v7, v7, La/syx;->b:I

    .line 1657
    .line 1658
    const v9, 0x73626770

    .line 1659
    .line 1660
    .line 1661
    const v10, 0x73656967

    .line 1662
    .line 1663
    .line 1664
    if-ne v7, v9, :cond_4c

    .line 1665
    .line 1666
    const/16 v12, 0xc

    .line 1667
    .line 1668
    invoke-virtual {v8, v12}, La/fq80;->M(I)V

    .line 1669
    .line 1670
    .line 1671
    invoke-virtual {v8}, La/fq80;->m()I

    .line 1672
    .line 1673
    .line 1674
    move-result v7

    .line 1675
    if-ne v7, v10, :cond_4d

    .line 1676
    .line 1677
    move-object v6, v8

    .line 1678
    goto :goto_37

    .line 1679
    :cond_4c
    const/16 v12, 0xc

    .line 1680
    .line 1681
    const v9, 0x73677064

    .line 1682
    .line 1683
    .line 1684
    if-ne v7, v9, :cond_4d

    .line 1685
    .line 1686
    invoke-virtual {v8, v12}, La/fq80;->M(I)V

    .line 1687
    .line 1688
    .line 1689
    invoke-virtual {v8}, La/fq80;->m()I

    .line 1690
    .line 1691
    .line 1692
    move-result v7

    .line 1693
    if-ne v7, v10, :cond_4d

    .line 1694
    .line 1695
    move-object v2, v8

    .line 1696
    :cond_4d
    :goto_37
    add-int/lit8 v4, v4, 0x1

    .line 1697
    .line 1698
    move-object/from16 v41, v5

    .line 1699
    .line 1700
    goto :goto_36

    .line 1701
    :cond_4e
    move-object/from16 v5, v41

    .line 1702
    .line 1703
    const/16 v12, 0xc

    .line 1704
    .line 1705
    if-eqz v6, :cond_4f

    .line 1706
    .line 1707
    if-nez v2, :cond_50

    .line 1708
    .line 1709
    :cond_4f
    :goto_38
    const/4 v9, 0x1

    .line 1710
    goto/16 :goto_3e

    .line 1711
    .line 1712
    :cond_50
    const/16 v7, 0x8

    .line 1713
    .line 1714
    invoke-virtual {v6, v7}, La/fq80;->M(I)V

    .line 1715
    .line 1716
    .line 1717
    invoke-virtual {v6}, La/fq80;->m()I

    .line 1718
    .line 1719
    .line 1720
    move-result v4

    .line 1721
    invoke-static {v4}, La/hr8;->e(I)I

    .line 1722
    .line 1723
    .line 1724
    move-result v4

    .line 1725
    const/4 v8, 0x4

    .line 1726
    invoke-virtual {v6, v8}, La/fq80;->N(I)V

    .line 1727
    .line 1728
    .line 1729
    const/4 v9, 0x1

    .line 1730
    if-ne v4, v9, :cond_51

    .line 1731
    .line 1732
    invoke-virtual {v6, v8}, La/fq80;->N(I)V

    .line 1733
    .line 1734
    .line 1735
    :cond_51
    invoke-virtual {v6}, La/fq80;->m()I

    .line 1736
    .line 1737
    .line 1738
    move-result v4

    .line 1739
    if-ne v4, v9, :cond_59

    .line 1740
    .line 1741
    invoke-virtual {v2, v7}, La/fq80;->M(I)V

    .line 1742
    .line 1743
    .line 1744
    invoke-virtual {v2}, La/fq80;->m()I

    .line 1745
    .line 1746
    .line 1747
    move-result v4

    .line 1748
    invoke-static {v4}, La/hr8;->e(I)I

    .line 1749
    .line 1750
    .line 1751
    move-result v4

    .line 1752
    invoke-virtual {v2, v8}, La/fq80;->N(I)V

    .line 1753
    .line 1754
    .line 1755
    if-lt v4, v9, :cond_52

    .line 1756
    .line 1757
    invoke-virtual {v2}, La/fq80;->B()J

    .line 1758
    .line 1759
    .line 1760
    move-result-wide v6

    .line 1761
    :goto_39
    const/4 v10, 0x2

    .line 1762
    goto :goto_3a

    .line 1763
    :cond_52
    move-wide/from16 v6, v25

    .line 1764
    .line 1765
    goto :goto_39

    .line 1766
    :goto_3a
    if-lt v4, v10, :cond_53

    .line 1767
    .line 1768
    invoke-virtual {v2, v8}, La/fq80;->N(I)V

    .line 1769
    .line 1770
    .line 1771
    :cond_53
    invoke-virtual {v2}, La/fq80;->B()J

    .line 1772
    .line 1773
    .line 1774
    move-result-wide v9

    .line 1775
    const-wide/16 v29, 0x1

    .line 1776
    .line 1777
    cmp-long v9, v9, v29

    .line 1778
    .line 1779
    if-nez v9, :cond_58

    .line 1780
    .line 1781
    const/4 v9, 0x1

    .line 1782
    if-lt v4, v9, :cond_54

    .line 1783
    .line 1784
    cmp-long v4, v6, v25

    .line 1785
    .line 1786
    if-nez v4, :cond_54

    .line 1787
    .line 1788
    invoke-virtual {v2, v8}, La/fq80;->N(I)V

    .line 1789
    .line 1790
    .line 1791
    :cond_54
    invoke-virtual {v2, v9}, La/fq80;->N(I)V

    .line 1792
    .line 1793
    .line 1794
    invoke-virtual {v2}, La/fq80;->z()I

    .line 1795
    .line 1796
    .line 1797
    move-result v4

    .line 1798
    and-int/lit16 v6, v4, 0xf0

    .line 1799
    .line 1800
    shr-int/lit8 v47, v6, 0x4

    .line 1801
    .line 1802
    and-int/lit8 v48, v4, 0xf

    .line 1803
    .line 1804
    invoke-virtual {v2}, La/fq80;->z()I

    .line 1805
    .line 1806
    .line 1807
    move-result v4

    .line 1808
    if-ne v4, v9, :cond_55

    .line 1809
    .line 1810
    const/16 v43, 0x1

    .line 1811
    .line 1812
    goto :goto_3b

    .line 1813
    :cond_55
    const/16 v43, 0x0

    .line 1814
    .line 1815
    :goto_3b
    if-nez v43, :cond_56

    .line 1816
    .line 1817
    goto :goto_38

    .line 1818
    :cond_56
    invoke-virtual {v2}, La/fq80;->z()I

    .line 1819
    .line 1820
    .line 1821
    move-result v45

    .line 1822
    move/from16 v4, v28

    .line 1823
    .line 1824
    new-array v6, v4, [B

    .line 1825
    .line 1826
    const/4 v9, 0x0

    .line 1827
    invoke-virtual {v2, v6, v9, v4}, La/fq80;->k([BII)V

    .line 1828
    .line 1829
    .line 1830
    if-nez v45, :cond_57

    .line 1831
    .line 1832
    invoke-virtual {v2}, La/fq80;->z()I

    .line 1833
    .line 1834
    .line 1835
    move-result v4

    .line 1836
    new-array v7, v4, [B

    .line 1837
    .line 1838
    invoke-virtual {v2, v7, v9, v4}, La/fq80;->k([BII)V

    .line 1839
    .line 1840
    .line 1841
    move-object/from16 v49, v7

    .line 1842
    .line 1843
    :goto_3c
    const/4 v9, 0x1

    .line 1844
    goto :goto_3d

    .line 1845
    :cond_57
    move-object/from16 v49, v3

    .line 1846
    .line 1847
    goto :goto_3c

    .line 1848
    :goto_3d
    iput-boolean v9, v1, La/xbs0;->k:Z

    .line 1849
    .line 1850
    new-instance v42, La/vbs0;

    .line 1851
    .line 1852
    move-object/from16 v46, v6

    .line 1853
    .line 1854
    invoke-direct/range {v42 .. v49}, La/vbs0;-><init>(ZLjava/lang/String;I[BII[B)V

    .line 1855
    .line 1856
    .line 1857
    move-object/from16 v2, v42

    .line 1858
    .line 1859
    iput-object v2, v1, La/xbs0;->m:La/vbs0;

    .line 1860
    .line 1861
    goto :goto_3e

    .line 1862
    :cond_58
    const-string v0, "Entry count in sgpd != 1 (unsupported)."

    .line 1863
    .line 1864
    invoke-static {v0}, La/kq80;->e(Ljava/lang/String;)La/kq80;

    .line 1865
    .line 1866
    .line 1867
    move-result-object v0

    .line 1868
    throw v0

    .line 1869
    :cond_59
    const-string v0, "Entry count in sbgp != 1 (unsupported)."

    .line 1870
    .line 1871
    invoke-static {v0}, La/kq80;->e(Ljava/lang/String;)La/kq80;

    .line 1872
    .line 1873
    .line 1874
    move-result-object v0

    .line 1875
    throw v0

    .line 1876
    :goto_3e
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 1877
    .line 1878
    .line 1879
    move-result v2

    .line 1880
    const/4 v4, 0x0

    .line 1881
    :goto_3f
    if-ge v4, v2, :cond_1c

    .line 1882
    .line 1883
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1884
    .line 1885
    .line 1886
    move-result-object v6

    .line 1887
    check-cast v6, La/fv40;

    .line 1888
    .line 1889
    iget v7, v6, La/syx;->b:I

    .line 1890
    .line 1891
    const v8, 0x75756964

    .line 1892
    .line 1893
    .line 1894
    if-ne v7, v8, :cond_5b

    .line 1895
    .line 1896
    iget-object v6, v6, La/fv40;->e:La/fq80;

    .line 1897
    .line 1898
    const/16 v7, 0x8

    .line 1899
    .line 1900
    invoke-virtual {v6, v7}, La/fq80;->M(I)V

    .line 1901
    .line 1902
    .line 1903
    iget-object v8, v0, La/x6r;->h:[B

    .line 1904
    .line 1905
    const/4 v10, 0x0

    .line 1906
    const/16 v11, 0x10

    .line 1907
    .line 1908
    invoke-virtual {v6, v8, v10, v11}, La/fq80;->k([BII)V

    .line 1909
    .line 1910
    .line 1911
    sget-object v13, La/x6r;->O:[B

    .line 1912
    .line 1913
    invoke-static {v8, v13}, Ljava/util/Arrays;->equals([B[B)Z

    .line 1914
    .line 1915
    .line 1916
    move-result v8

    .line 1917
    if-nez v8, :cond_5a

    .line 1918
    .line 1919
    goto :goto_40

    .line 1920
    :cond_5a
    invoke-static {v6, v11, v1}, La/x6r;->j(La/fq80;ILa/xbs0;)V

    .line 1921
    .line 1922
    .line 1923
    goto :goto_40

    .line 1924
    :cond_5b
    const/16 v7, 0x8

    .line 1925
    .line 1926
    const/4 v10, 0x0

    .line 1927
    const/16 v11, 0x10

    .line 1928
    .line 1929
    :goto_40
    add-int/lit8 v4, v4, 0x1

    .line 1930
    .line 1931
    goto :goto_3f

    .line 1932
    :cond_5c
    move/from16 v23, v1

    .line 1933
    .line 1934
    move-object/from16 v24, v4

    .line 1935
    .line 1936
    move-object/from16 v32, v5

    .line 1937
    .line 1938
    move/from16 v33, v9

    .line 1939
    .line 1940
    const/4 v3, 0x0

    .line 1941
    const/16 v7, 0x8

    .line 1942
    .line 1943
    const/4 v9, 0x1

    .line 1944
    const/4 v10, 0x0

    .line 1945
    const/16 v12, 0xc

    .line 1946
    .line 1947
    const-wide v21, -0x7fffffffffffffffL    # -4.9E-324

    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    :goto_41
    add-int/lit8 v1, v33, 0x1

    .line 1953
    .line 1954
    move v9, v1

    .line 1955
    move/from16 v1, v23

    .line 1956
    .line 1957
    move-object/from16 v4, v24

    .line 1958
    .line 1959
    move-object/from16 v5, v32

    .line 1960
    .line 1961
    goto/16 :goto_12

    .line 1962
    .line 1963
    :cond_5d
    move-object/from16 v32, v5

    .line 1964
    .line 1965
    const/4 v3, 0x0

    .line 1966
    const/4 v10, 0x0

    .line 1967
    const-wide v21, -0x7fffffffffffffffL    # -4.9E-324

    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    invoke-static/range {v32 .. v32}, La/x6r;->h(Ljava/util/ArrayList;)Landroidx/media3/common/DrmInitData;

    .line 1973
    .line 1974
    .line 1975
    move-result-object v1

    .line 1976
    if-eqz v1, :cond_61

    .line 1977
    .line 1978
    invoke-virtual {v14}, Landroid/util/SparseArray;->size()I

    .line 1979
    .line 1980
    .line 1981
    move-result v2

    .line 1982
    move v9, v10

    .line 1983
    :goto_42
    if-ge v9, v2, :cond_61

    .line 1984
    .line 1985
    invoke-virtual {v14, v9}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 1986
    .line 1987
    .line 1988
    move-result-object v4

    .line 1989
    check-cast v4, La/w6r;

    .line 1990
    .line 1991
    iget-object v5, v4, La/w6r;->d:La/ocs0;

    .line 1992
    .line 1993
    iget-object v5, v5, La/ocs0;->a:La/lbs0;

    .line 1994
    .line 1995
    iget-object v6, v4, La/w6r;->b:La/xbs0;

    .line 1996
    .line 1997
    iget-object v6, v6, La/xbs0;->a:La/qwj;

    .line 1998
    .line 1999
    sget-object v7, La/vtt0;->a:Ljava/lang/String;

    .line 2000
    .line 2001
    iget v6, v6, La/qwj;->a:I

    .line 2002
    .line 2003
    iget-object v5, v5, La/lbs0;->n:[La/vbs0;

    .line 2004
    .line 2005
    if-nez v5, :cond_5e

    .line 2006
    .line 2007
    move-object v6, v3

    .line 2008
    goto :goto_43

    .line 2009
    :cond_5e
    aget-object v6, v5, v6

    .line 2010
    .line 2011
    :goto_43
    if-eqz v6, :cond_5f

    .line 2012
    .line 2013
    iget-object v6, v6, La/vbs0;->b:Ljava/lang/String;

    .line 2014
    .line 2015
    goto :goto_44

    .line 2016
    :cond_5f
    move-object v6, v3

    .line 2017
    :goto_44
    invoke-virtual {v1, v6}, Landroidx/media3/common/DrmInitData;->a(Ljava/lang/String;)Landroidx/media3/common/DrmInitData;

    .line 2018
    .line 2019
    .line 2020
    move-result-object v5

    .line 2021
    iget-object v6, v4, La/w6r;->m:Landroidx/media3/common/b;

    .line 2022
    .line 2023
    invoke-virtual {v6}, Landroidx/media3/common/b;->a()La/awq;

    .line 2024
    .line 2025
    .line 2026
    move-result-object v6

    .line 2027
    iput-object v5, v6, La/awq;->s:Landroidx/media3/common/DrmInitData;

    .line 2028
    .line 2029
    new-instance v5, Landroidx/media3/common/b;

    .line 2030
    .line 2031
    invoke-direct {v5, v6}, Landroidx/media3/common/b;-><init>(La/awq;)V

    .line 2032
    .line 2033
    .line 2034
    iget-object v6, v4, La/w6r;->l:Landroidx/media3/common/b;

    .line 2035
    .line 2036
    if-eqz v6, :cond_60

    .line 2037
    .line 2038
    iput-object v5, v4, La/w6r;->l:Landroidx/media3/common/b;

    .line 2039
    .line 2040
    goto :goto_45

    .line 2041
    :cond_60
    iget-object v4, v4, La/w6r;->a:La/ncs0;

    .line 2042
    .line 2043
    invoke-interface {v4, v5}, La/ncs0;->c(Landroidx/media3/common/b;)V

    .line 2044
    .line 2045
    .line 2046
    :goto_45
    add-int/lit8 v9, v9, 0x1

    .line 2047
    .line 2048
    goto :goto_42

    .line 2049
    :cond_61
    iget-wide v1, v0, La/x6r;->y:J

    .line 2050
    .line 2051
    cmp-long v1, v1, v21

    .line 2052
    .line 2053
    if-eqz v1, :cond_0

    .line 2054
    .line 2055
    invoke-virtual {v14}, Landroid/util/SparseArray;->size()I

    .line 2056
    .line 2057
    .line 2058
    move-result v1

    .line 2059
    move v12, v10

    .line 2060
    :goto_46
    if-ge v12, v1, :cond_64

    .line 2061
    .line 2062
    invoke-virtual {v14, v12}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 2063
    .line 2064
    .line 2065
    move-result-object v2

    .line 2066
    check-cast v2, La/w6r;

    .line 2067
    .line 2068
    iget-wide v3, v0, La/x6r;->y:J

    .line 2069
    .line 2070
    iget v5, v2, La/w6r;->f:I

    .line 2071
    .line 2072
    :goto_47
    iget-object v6, v2, La/w6r;->b:La/xbs0;

    .line 2073
    .line 2074
    iget v7, v6, La/xbs0;->e:I

    .line 2075
    .line 2076
    if-ge v5, v7, :cond_63

    .line 2077
    .line 2078
    iget-object v7, v6, La/xbs0;->i:[J

    .line 2079
    .line 2080
    aget-wide v8, v7, v5

    .line 2081
    .line 2082
    cmp-long v7, v8, v3

    .line 2083
    .line 2084
    if-gtz v7, :cond_63

    .line 2085
    .line 2086
    iget-object v6, v6, La/xbs0;->j:[Z

    .line 2087
    .line 2088
    aget-boolean v6, v6, v5

    .line 2089
    .line 2090
    if-eqz v6, :cond_62

    .line 2091
    .line 2092
    iput v5, v2, La/w6r;->i:I

    .line 2093
    .line 2094
    :cond_62
    add-int/lit8 v5, v5, 0x1

    .line 2095
    .line 2096
    goto :goto_47

    .line 2097
    :cond_63
    add-int/lit8 v12, v12, 0x1

    .line 2098
    .line 2099
    goto :goto_46

    .line 2100
    :cond_64
    move-wide/from16 v2, v21

    .line 2101
    .line 2102
    iput-wide v2, v0, La/x6r;->y:J

    .line 2103
    .line 2104
    goto/16 :goto_0

    .line 2105
    .line 2106
    :cond_65
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 2107
    .line 2108
    .line 2109
    move-result v2

    .line 2110
    if-nez v2, :cond_0

    .line 2111
    .line 2112
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    .line 2113
    .line 2114
    .line 2115
    move-result-object v1

    .line 2116
    check-cast v1, La/ev40;

    .line 2117
    .line 2118
    iget-object v1, v1, La/ev40;->g:Ljava/util/ArrayList;

    .line 2119
    .line 2120
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2121
    .line 2122
    .line 2123
    goto/16 :goto_0

    .line 2124
    .line 2125
    :cond_66
    invoke-virtual {v0}, La/x6r;->g()V

    .line 2126
    .line 2127
    .line 2128
    return-void
.end method

.method public final release()V
    .locals 0

    .line 1
    return-void
.end method
