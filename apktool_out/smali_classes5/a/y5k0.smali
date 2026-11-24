.class public final La/y5k0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/javax/sip/Dialog;

.field public final b:Landroid/javax/sip/ClientTransaction;

.field public final c:Landroid/javax/sip/SipListener;

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:I

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:I

.field public final k:Ljava/util/Map;

.field public final l:Ljava/lang/String;

.field public final m:Ljava/lang/String;

.field public final n:Ljava/lang/String;

.field public final o:Ljava/lang/String;

.field public final p:Ljava/lang/String;

.field public final q:Ljava/lang/String;

.field public final r:I

.field public final s:I

.field public final t:Z

.field public final u:Z


# direct methods
.method public constructor <init>(Landroid/javax/sip/Dialog;Landroid/javax/sip/ClientTransaction;Landroid/javax/sip/SipListener;ZZZILjava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZ)V
    .locals 0

    .line 1
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/y5k0;->a:Landroid/javax/sip/Dialog;

    .line 23
    .line 24
    iput-object p2, p0, La/y5k0;->b:Landroid/javax/sip/ClientTransaction;

    .line 25
    .line 26
    iput-object p3, p0, La/y5k0;->c:Landroid/javax/sip/SipListener;

    .line 27
    .line 28
    iput-boolean p4, p0, La/y5k0;->d:Z

    .line 29
    .line 30
    iput-boolean p5, p0, La/y5k0;->e:Z

    .line 31
    .line 32
    iput-boolean p6, p0, La/y5k0;->f:Z

    .line 33
    .line 34
    iput p7, p0, La/y5k0;->g:I

    .line 35
    .line 36
    iput-object p8, p0, La/y5k0;->h:Ljava/lang/String;

    .line 37
    .line 38
    iput-object p9, p0, La/y5k0;->i:Ljava/lang/String;

    .line 39
    .line 40
    iput p10, p0, La/y5k0;->j:I

    .line 41
    .line 42
    iput-object p11, p0, La/y5k0;->k:Ljava/util/Map;

    .line 43
    .line 44
    iput-object p12, p0, La/y5k0;->l:Ljava/lang/String;

    .line 45
    .line 46
    iput-object p13, p0, La/y5k0;->m:Ljava/lang/String;

    .line 47
    .line 48
    iput-object p14, p0, La/y5k0;->n:Ljava/lang/String;

    .line 49
    .line 50
    iput-object p15, p0, La/y5k0;->o:Ljava/lang/String;

    .line 51
    .line 52
    move-object/from16 p1, p16

    .line 53
    .line 54
    iput-object p1, p0, La/y5k0;->p:Ljava/lang/String;

    .line 55
    .line 56
    move-object/from16 p1, p17

    .line 57
    .line 58
    iput-object p1, p0, La/y5k0;->q:Ljava/lang/String;

    .line 59
    .line 60
    move/from16 p1, p18

    .line 61
    .line 62
    iput p1, p0, La/y5k0;->r:I

    .line 63
    .line 64
    move/from16 p1, p19

    .line 65
    .line 66
    iput p1, p0, La/y5k0;->s:I

    .line 67
    .line 68
    move/from16 p1, p20

    .line 69
    .line 70
    iput-boolean p1, p0, La/y5k0;->t:Z

    .line 71
    .line 72
    move/from16 p1, p21

    .line 73
    .line 74
    iput-boolean p1, p0, La/y5k0;->u:Z

    .line 75
    .line 76
    return-void
.end method

.method public static a(La/y5k0;Landroid/javax/sip/Dialog;Landroid/javax/sip/ClientTransaction;La/m6k0;ZILjava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZI)La/y5k0;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p19

    .line 4
    .line 5
    and-int/lit8 v2, v1, 0x1

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    iget-object v2, v0, La/y5k0;->a:Landroid/javax/sip/Dialog;

    .line 10
    .line 11
    move-object v4, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object/from16 v4, p1

    .line 14
    .line 15
    :goto_0
    and-int/lit8 v2, v1, 0x2

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iget-object v2, v0, La/y5k0;->b:Landroid/javax/sip/ClientTransaction;

    .line 20
    .line 21
    move-object v5, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move-object/from16 v5, p2

    .line 24
    .line 25
    :goto_1
    and-int/lit8 v2, v1, 0x4

    .line 26
    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    iget-object v2, v0, La/y5k0;->c:Landroid/javax/sip/SipListener;

    .line 30
    .line 31
    move-object v6, v2

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    move-object/from16 v6, p3

    .line 34
    .line 35
    :goto_2
    and-int/lit8 v2, v1, 0x8

    .line 36
    .line 37
    const/4 v3, 0x1

    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    iget-boolean v2, v0, La/y5k0;->d:Z

    .line 41
    .line 42
    move v7, v2

    .line 43
    goto :goto_3

    .line 44
    :cond_3
    move v7, v3

    .line 45
    :goto_3
    and-int/lit8 v2, v1, 0x10

    .line 46
    .line 47
    if-eqz v2, :cond_4

    .line 48
    .line 49
    iget-boolean v2, v0, La/y5k0;->e:Z

    .line 50
    .line 51
    move v8, v2

    .line 52
    goto :goto_4

    .line 53
    :cond_4
    move/from16 v8, p4

    .line 54
    .line 55
    :goto_4
    and-int/lit8 v2, v1, 0x20

    .line 56
    .line 57
    if-eqz v2, :cond_5

    .line 58
    .line 59
    iget-boolean v2, v0, La/y5k0;->f:Z

    .line 60
    .line 61
    move v9, v2

    .line 62
    goto :goto_5

    .line 63
    :cond_5
    move v9, v3

    .line 64
    :goto_5
    and-int/lit8 v2, v1, 0x40

    .line 65
    .line 66
    if-eqz v2, :cond_6

    .line 67
    .line 68
    iget v2, v0, La/y5k0;->g:I

    .line 69
    .line 70
    move v10, v2

    .line 71
    goto :goto_6

    .line 72
    :cond_6
    move/from16 v10, p5

    .line 73
    .line 74
    :goto_6
    and-int/lit16 v2, v1, 0x80

    .line 75
    .line 76
    if-eqz v2, :cond_7

    .line 77
    .line 78
    iget-object v2, v0, La/y5k0;->h:Ljava/lang/String;

    .line 79
    .line 80
    move-object v11, v2

    .line 81
    goto :goto_7

    .line 82
    :cond_7
    move-object/from16 v11, p6

    .line 83
    .line 84
    :goto_7
    and-int/lit16 v2, v1, 0x100

    .line 85
    .line 86
    if-eqz v2, :cond_8

    .line 87
    .line 88
    iget-object v2, v0, La/y5k0;->i:Ljava/lang/String;

    .line 89
    .line 90
    move-object v12, v2

    .line 91
    goto :goto_8

    .line 92
    :cond_8
    move-object/from16 v12, p7

    .line 93
    .line 94
    :goto_8
    and-int/lit16 v2, v1, 0x200

    .line 95
    .line 96
    if-eqz v2, :cond_9

    .line 97
    .line 98
    iget v2, v0, La/y5k0;->j:I

    .line 99
    .line 100
    move v13, v2

    .line 101
    goto :goto_9

    .line 102
    :cond_9
    move/from16 v13, p8

    .line 103
    .line 104
    :goto_9
    and-int/lit16 v2, v1, 0x400

    .line 105
    .line 106
    if-eqz v2, :cond_a

    .line 107
    .line 108
    iget-object v2, v0, La/y5k0;->k:Ljava/util/Map;

    .line 109
    .line 110
    move-object v14, v2

    .line 111
    goto :goto_a

    .line 112
    :cond_a
    move-object/from16 v14, p9

    .line 113
    .line 114
    :goto_a
    and-int/lit16 v2, v1, 0x800

    .line 115
    .line 116
    if-eqz v2, :cond_b

    .line 117
    .line 118
    iget-object v2, v0, La/y5k0;->l:Ljava/lang/String;

    .line 119
    .line 120
    move-object v15, v2

    .line 121
    goto :goto_b

    .line 122
    :cond_b
    move-object/from16 v15, p10

    .line 123
    .line 124
    :goto_b
    and-int/lit16 v2, v1, 0x1000

    .line 125
    .line 126
    if-eqz v2, :cond_c

    .line 127
    .line 128
    iget-object v2, v0, La/y5k0;->m:Ljava/lang/String;

    .line 129
    .line 130
    move-object/from16 v16, v2

    .line 131
    .line 132
    goto :goto_c

    .line 133
    :cond_c
    move-object/from16 v16, p11

    .line 134
    .line 135
    :goto_c
    and-int/lit16 v2, v1, 0x2000

    .line 136
    .line 137
    if-eqz v2, :cond_d

    .line 138
    .line 139
    iget-object v2, v0, La/y5k0;->n:Ljava/lang/String;

    .line 140
    .line 141
    move-object/from16 v17, v2

    .line 142
    .line 143
    goto :goto_d

    .line 144
    :cond_d
    move-object/from16 v17, p12

    .line 145
    .line 146
    :goto_d
    and-int/lit16 v2, v1, 0x4000

    .line 147
    .line 148
    if-eqz v2, :cond_e

    .line 149
    .line 150
    iget-object v2, v0, La/y5k0;->o:Ljava/lang/String;

    .line 151
    .line 152
    move-object/from16 v18, v2

    .line 153
    .line 154
    goto :goto_e

    .line 155
    :cond_e
    move-object/from16 v18, p13

    .line 156
    .line 157
    :goto_e
    const v2, 0x8000

    .line 158
    .line 159
    .line 160
    and-int/2addr v2, v1

    .line 161
    if-eqz v2, :cond_f

    .line 162
    .line 163
    iget-object v2, v0, La/y5k0;->p:Ljava/lang/String;

    .line 164
    .line 165
    move-object/from16 v19, v2

    .line 166
    .line 167
    goto :goto_f

    .line 168
    :cond_f
    move-object/from16 v19, p14

    .line 169
    .line 170
    :goto_f
    const/high16 v2, 0x10000

    .line 171
    .line 172
    and-int/2addr v2, v1

    .line 173
    if-eqz v2, :cond_10

    .line 174
    .line 175
    iget-object v2, v0, La/y5k0;->q:Ljava/lang/String;

    .line 176
    .line 177
    move-object/from16 v20, v2

    .line 178
    .line 179
    goto :goto_10

    .line 180
    :cond_10
    move-object/from16 v20, p15

    .line 181
    .line 182
    :goto_10
    const/high16 v2, 0x20000

    .line 183
    .line 184
    and-int/2addr v2, v1

    .line 185
    if-eqz v2, :cond_11

    .line 186
    .line 187
    iget v2, v0, La/y5k0;->r:I

    .line 188
    .line 189
    move/from16 v21, v2

    .line 190
    .line 191
    goto :goto_11

    .line 192
    :cond_11
    move/from16 v21, p16

    .line 193
    .line 194
    :goto_11
    const/high16 v2, 0x40000

    .line 195
    .line 196
    and-int/2addr v2, v1

    .line 197
    if-eqz v2, :cond_12

    .line 198
    .line 199
    iget v2, v0, La/y5k0;->s:I

    .line 200
    .line 201
    move/from16 v22, v2

    .line 202
    .line 203
    goto :goto_12

    .line 204
    :cond_12
    move/from16 v22, p17

    .line 205
    .line 206
    :goto_12
    const/high16 v2, 0x80000

    .line 207
    .line 208
    and-int/2addr v2, v1

    .line 209
    if-eqz v2, :cond_13

    .line 210
    .line 211
    iget-boolean v3, v0, La/y5k0;->t:Z

    .line 212
    .line 213
    :cond_13
    move/from16 v23, v3

    .line 214
    .line 215
    const/high16 v2, 0x100000

    .line 216
    .line 217
    and-int/2addr v1, v2

    .line 218
    if-eqz v1, :cond_14

    .line 219
    .line 220
    iget-boolean v1, v0, La/y5k0;->u:Z

    .line 221
    .line 222
    move/from16 v24, v1

    .line 223
    .line 224
    goto :goto_13

    .line 225
    :cond_14
    move/from16 v24, p18

    .line 226
    .line 227
    :goto_13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    new-instance v3, La/y5k0;

    .line 249
    .line 250
    invoke-direct/range {v3 .. v24}, La/y5k0;-><init>(Landroid/javax/sip/Dialog;Landroid/javax/sip/ClientTransaction;Landroid/javax/sip/SipListener;ZZZILjava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZ)V

    .line 251
    .line 252
    .line 253
    return-object v3
.end method

.method public static b()La/y5k0;
    .locals 22

    .line 1
    sget-object v11, La/lun;->a:La/lun;

    .line 2
    .line 3
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, La/y5k0;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x0

    .line 15
    const-string v8, ""

    .line 16
    .line 17
    const-string v9, ""

    .line 18
    .line 19
    const/4 v10, 0x0

    .line 20
    const-string v12, ""

    .line 21
    .line 22
    const-string v13, ""

    .line 23
    .line 24
    const-string v14, ""

    .line 25
    .line 26
    const/4 v15, 0x0

    .line 27
    const/16 v16, 0x0

    .line 28
    .line 29
    const/16 v17, 0x0

    .line 30
    .line 31
    const/16 v18, 0x0

    .line 32
    .line 33
    const/16 v19, -0x1

    .line 34
    .line 35
    const/16 v20, 0x0

    .line 36
    .line 37
    const/16 v21, 0x0

    .line 38
    .line 39
    invoke-direct/range {v0 .. v21}, La/y5k0;-><init>(Landroid/javax/sip/Dialog;Landroid/javax/sip/ClientTransaction;Landroid/javax/sip/SipListener;ZZZILjava/lang/String;Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZZ)V

    .line 40
    .line 41
    .line 42
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/y5k0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, La/y5k0;

    .line 12
    .line 13
    iget-object v1, p0, La/y5k0;->a:Landroid/javax/sip/Dialog;

    .line 14
    .line 15
    iget-object v3, p1, La/y5k0;->a:Landroid/javax/sip/Dialog;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, La/y5k0;->b:Landroid/javax/sip/ClientTransaction;

    .line 25
    .line 26
    iget-object v3, p1, La/y5k0;->b:Landroid/javax/sip/ClientTransaction;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, La/y5k0;->c:Landroid/javax/sip/SipListener;

    .line 36
    .line 37
    iget-object v3, p1, La/y5k0;->c:Landroid/javax/sip/SipListener;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-boolean v1, p0, La/y5k0;->d:Z

    .line 47
    .line 48
    iget-boolean v3, p1, La/y5k0;->d:Z

    .line 49
    .line 50
    if-eq v1, v3, :cond_5

    .line 51
    .line 52
    return v2

    .line 53
    :cond_5
    iget-boolean v1, p0, La/y5k0;->e:Z

    .line 54
    .line 55
    iget-boolean v3, p1, La/y5k0;->e:Z

    .line 56
    .line 57
    if-eq v1, v3, :cond_6

    .line 58
    .line 59
    return v2

    .line 60
    :cond_6
    iget-boolean v1, p0, La/y5k0;->f:Z

    .line 61
    .line 62
    iget-boolean v3, p1, La/y5k0;->f:Z

    .line 63
    .line 64
    if-eq v1, v3, :cond_7

    .line 65
    .line 66
    return v2

    .line 67
    :cond_7
    iget v1, p0, La/y5k0;->g:I

    .line 68
    .line 69
    iget v3, p1, La/y5k0;->g:I

    .line 70
    .line 71
    if-eq v1, v3, :cond_8

    .line 72
    .line 73
    return v2

    .line 74
    :cond_8
    iget-object v1, p0, La/y5k0;->h:Ljava/lang/String;

    .line 75
    .line 76
    iget-object v3, p1, La/y5k0;->h:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-nez v1, :cond_9

    .line 83
    .line 84
    return v2

    .line 85
    :cond_9
    iget-object v1, p0, La/y5k0;->i:Ljava/lang/String;

    .line 86
    .line 87
    iget-object v3, p1, La/y5k0;->i:Ljava/lang/String;

    .line 88
    .line 89
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_a

    .line 94
    .line 95
    return v2

    .line 96
    :cond_a
    iget v1, p0, La/y5k0;->j:I

    .line 97
    .line 98
    iget v3, p1, La/y5k0;->j:I

    .line 99
    .line 100
    if-eq v1, v3, :cond_b

    .line 101
    .line 102
    return v2

    .line 103
    :cond_b
    iget-object v1, p0, La/y5k0;->k:Ljava/util/Map;

    .line 104
    .line 105
    iget-object v3, p1, La/y5k0;->k:Ljava/util/Map;

    .line 106
    .line 107
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-nez v1, :cond_c

    .line 112
    .line 113
    return v2

    .line 114
    :cond_c
    iget-object v1, p0, La/y5k0;->l:Ljava/lang/String;

    .line 115
    .line 116
    iget-object v3, p1, La/y5k0;->l:Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-nez v1, :cond_d

    .line 123
    .line 124
    return v2

    .line 125
    :cond_d
    iget-object v1, p0, La/y5k0;->m:Ljava/lang/String;

    .line 126
    .line 127
    iget-object v3, p1, La/y5k0;->m:Ljava/lang/String;

    .line 128
    .line 129
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-nez v1, :cond_e

    .line 134
    .line 135
    return v2

    .line 136
    :cond_e
    iget-object v1, p0, La/y5k0;->n:Ljava/lang/String;

    .line 137
    .line 138
    iget-object v3, p1, La/y5k0;->n:Ljava/lang/String;

    .line 139
    .line 140
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-nez v1, :cond_f

    .line 145
    .line 146
    return v2

    .line 147
    :cond_f
    iget-object v1, p0, La/y5k0;->o:Ljava/lang/String;

    .line 148
    .line 149
    iget-object v3, p1, La/y5k0;->o:Ljava/lang/String;

    .line 150
    .line 151
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-nez v1, :cond_10

    .line 156
    .line 157
    return v2

    .line 158
    :cond_10
    iget-object v1, p0, La/y5k0;->p:Ljava/lang/String;

    .line 159
    .line 160
    iget-object v3, p1, La/y5k0;->p:Ljava/lang/String;

    .line 161
    .line 162
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    if-nez v1, :cond_11

    .line 167
    .line 168
    return v2

    .line 169
    :cond_11
    iget-object v1, p0, La/y5k0;->q:Ljava/lang/String;

    .line 170
    .line 171
    iget-object v3, p1, La/y5k0;->q:Ljava/lang/String;

    .line 172
    .line 173
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v1

    .line 177
    if-nez v1, :cond_12

    .line 178
    .line 179
    return v2

    .line 180
    :cond_12
    iget v1, p0, La/y5k0;->r:I

    .line 181
    .line 182
    iget v3, p1, La/y5k0;->r:I

    .line 183
    .line 184
    if-eq v1, v3, :cond_13

    .line 185
    .line 186
    return v2

    .line 187
    :cond_13
    iget v1, p0, La/y5k0;->s:I

    .line 188
    .line 189
    iget v3, p1, La/y5k0;->s:I

    .line 190
    .line 191
    if-eq v1, v3, :cond_14

    .line 192
    .line 193
    return v2

    .line 194
    :cond_14
    iget-boolean v1, p0, La/y5k0;->t:Z

    .line 195
    .line 196
    iget-boolean v3, p1, La/y5k0;->t:Z

    .line 197
    .line 198
    if-eq v1, v3, :cond_15

    .line 199
    .line 200
    return v2

    .line 201
    :cond_15
    iget-boolean p0, p0, La/y5k0;->u:Z

    .line 202
    .line 203
    iget-boolean p1, p1, La/y5k0;->u:Z

    .line 204
    .line 205
    if-eq p0, p1, :cond_16

    .line 206
    .line 207
    return v2

    .line 208
    :cond_16
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, La/y5k0;->a:Landroid/javax/sip/Dialog;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    move v1, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    :goto_0
    const/16 v2, 0x1f

    .line 13
    .line 14
    mul-int/2addr v1, v2

    .line 15
    iget-object v3, p0, La/y5k0;->b:Landroid/javax/sip/ClientTransaction;

    .line 16
    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    move v3, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    :goto_1
    add-int/2addr v1, v3

    .line 26
    mul-int/2addr v1, v2

    .line 27
    iget-object v3, p0, La/y5k0;->c:Landroid/javax/sip/SipListener;

    .line 28
    .line 29
    if-nez v3, :cond_2

    .line 30
    .line 31
    move v3, v0

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    :goto_2
    add-int/2addr v1, v3

    .line 38
    mul-int/2addr v1, v2

    .line 39
    iget-boolean v3, p0, La/y5k0;->d:Z

    .line 40
    .line 41
    invoke-static {v1, v2, v3}, La/brm0;->e(IIZ)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    iget-boolean v3, p0, La/y5k0;->e:Z

    .line 46
    .line 47
    invoke-static {v1, v2, v3}, La/brm0;->e(IIZ)I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    iget-boolean v3, p0, La/y5k0;->f:Z

    .line 52
    .line 53
    invoke-static {v1, v2, v3}, La/brm0;->e(IIZ)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    iget v3, p0, La/y5k0;->g:I

    .line 58
    .line 59
    invoke-static {v3, v1, v2}, La/twn;->a(III)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    iget-object v3, p0, La/y5k0;->h:Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v1, v2, v3}, La/ua80;->b(IILjava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    iget-object v3, p0, La/y5k0;->i:Ljava/lang/String;

    .line 70
    .line 71
    invoke-static {v1, v2, v3}, La/ua80;->b(IILjava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    iget v3, p0, La/y5k0;->j:I

    .line 76
    .line 77
    invoke-static {v3, v1, v2}, La/twn;->a(III)I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    iget-object v3, p0, La/y5k0;->k:Ljava/util/Map;

    .line 82
    .line 83
    invoke-static {v3, v1, v2}, La/ohs0;->f(Ljava/util/Map;II)I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    iget-object v3, p0, La/y5k0;->l:Ljava/lang/String;

    .line 88
    .line 89
    invoke-static {v1, v2, v3}, La/ua80;->b(IILjava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    iget-object v3, p0, La/y5k0;->m:Ljava/lang/String;

    .line 94
    .line 95
    invoke-static {v1, v2, v3}, La/ua80;->b(IILjava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    iget-object v3, p0, La/y5k0;->n:Ljava/lang/String;

    .line 100
    .line 101
    invoke-static {v1, v2, v3}, La/ua80;->b(IILjava/lang/String;)I

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    iget-object v3, p0, La/y5k0;->o:Ljava/lang/String;

    .line 106
    .line 107
    if-nez v3, :cond_3

    .line 108
    .line 109
    move v3, v0

    .line 110
    goto :goto_3

    .line 111
    :cond_3
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    :goto_3
    add-int/2addr v1, v3

    .line 116
    mul-int/2addr v1, v2

    .line 117
    iget-object v3, p0, La/y5k0;->p:Ljava/lang/String;

    .line 118
    .line 119
    if-nez v3, :cond_4

    .line 120
    .line 121
    move v3, v0

    .line 122
    goto :goto_4

    .line 123
    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    :goto_4
    add-int/2addr v1, v3

    .line 128
    mul-int/2addr v1, v2

    .line 129
    iget-object v3, p0, La/y5k0;->q:Ljava/lang/String;

    .line 130
    .line 131
    if-nez v3, :cond_5

    .line 132
    .line 133
    goto :goto_5

    .line 134
    :cond_5
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    :goto_5
    add-int/2addr v1, v0

    .line 139
    mul-int/2addr v1, v2

    .line 140
    iget v0, p0, La/y5k0;->r:I

    .line 141
    .line 142
    invoke-static {v0, v1, v2}, La/twn;->a(III)I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    iget v1, p0, La/y5k0;->s:I

    .line 147
    .line 148
    invoke-static {v1, v0, v2}, La/twn;->a(III)I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    iget-boolean v1, p0, La/y5k0;->t:Z

    .line 153
    .line 154
    invoke-static {v0, v2, v1}, La/brm0;->e(IIZ)I

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    iget-boolean p0, p0, La/y5k0;->u:Z

    .line 159
    .line 160
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 161
    .line 162
    .line 163
    move-result p0

    .line 164
    add-int/2addr p0, v0

    .line 165
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "SipCallState(dialog="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/y5k0;->a:Landroid/javax/sip/Dialog;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", inviteClientTransaction="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/y5k0;->b:Landroid/javax/sip/ClientTransaction;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", currentListener="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/y5k0;->c:Landroid/javax/sip/SipListener;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", inCall="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-boolean v1, p0, La/y5k0;->d:Z

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", authRetryInProgress="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v1, ", callEstablished="

    .line 49
    .line 50
    const-string v2, ", retransmissionCount="

    .line 51
    .line 52
    iget-boolean v3, p0, La/y5k0;->e:Z

    .line 53
    .line 54
    iget-boolean v4, p0, La/y5k0;->f:Z

    .line 55
    .line 56
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 57
    .line 58
    .line 59
    const-string v1, ", currentCalleeAddress="

    .line 60
    .line 61
    const-string v2, ", currentLocalIp="

    .line 62
    .line 63
    iget v3, p0, La/y5k0;->g:I

    .line 64
    .line 65
    iget-object v4, p0, La/y5k0;->h:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v3, v1, v4, v2, v0}, La/kng0;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 68
    .line 69
    .line 70
    const-string v1, ", currentRtpPort="

    .line 71
    .line 72
    const-string v2, ", currentExtraHeaders="

    .line 73
    .line 74
    iget v3, p0, La/y5k0;->j:I

    .line 75
    .line 76
    iget-object v4, p0, La/y5k0;->i:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v3, v4, v1, v2, v0}, La/twn;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 79
    .line 80
    .line 81
    iget-object v1, p0, La/y5k0;->k:Ljava/util/Map;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v1, ", currentCallId="

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    iget-object v1, p0, La/y5k0;->l:Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const-string v1, ", currentFromTag="

    .line 97
    .line 98
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string v1, ", username="

    .line 102
    .line 103
    const-string v2, ", domain="

    .line 104
    .line 105
    iget-object v3, p0, La/y5k0;->m:Ljava/lang/String;

    .line 106
    .line 107
    iget-object v4, p0, La/y5k0;->n:Ljava/lang/String;

    .line 108
    .line 109
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    const-string v1, ", displayName="

    .line 113
    .line 114
    const-string v2, ", remoteIp="

    .line 115
    .line 116
    iget-object v3, p0, La/y5k0;->o:Ljava/lang/String;

    .line 117
    .line 118
    iget-object v4, p0, La/y5k0;->p:Ljava/lang/String;

    .line 119
    .line 120
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    const-string v1, ", remoteRtpPort="

    .line 124
    .line 125
    const-string v2, ", selectedPayloadType="

    .line 126
    .line 127
    iget v3, p0, La/y5k0;->r:I

    .line 128
    .line 129
    iget-object v4, p0, La/y5k0;->q:Ljava/lang/String;

    .line 130
    .line 131
    invoke-static {v3, v4, v1, v2, v0}, La/twn;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 132
    .line 133
    .line 134
    const-string v1, ", callEndedReported="

    .line 135
    .line 136
    const-string v2, ", reInviteInFlight="

    .line 137
    .line 138
    iget v3, p0, La/y5k0;->s:I

    .line 139
    .line 140
    iget-boolean v4, p0, La/y5k0;->t:Z

    .line 141
    .line 142
    invoke-static {v3, v1, v2, v0, v4}, La/brm0;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 143
    .line 144
    .line 145
    const-string v1, ")"

    .line 146
    .line 147
    iget-boolean p0, p0, La/y5k0;->u:Z

    .line 148
    .line 149
    invoke-static {v0, p0, v1}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    return-object p0
.end method
