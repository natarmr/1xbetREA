.class public final La/fsj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ky90;
.implements La/bo30;
.implements La/ail;


# instance fields
.field public final a:La/l9o0;

.field public final b:La/amq0;

.field public final c:Landroidx/media3/common/Timeline$Window;

.field public final d:La/uii;

.field public final e:Landroid/util/SparseArray;

.field public f:La/vg00;

.field public g:La/my90;

.field public h:La/q9o0;

.field public i:Z


# direct methods
.method public constructor <init>(La/l9o0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/fsj;->a:La/l9o0;

    .line 8
    .line 9
    new-instance p1, La/vg00;

    .line 10
    .line 11
    invoke-static {}, La/vtt0;->u()Landroid/os/Looper;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-direct {p1, v0}, La/vg00;-><init>(Ljava/lang/Thread;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/fsj;->f:La/vg00;

    .line 23
    .line 24
    new-instance p1, La/amq0;

    .line 25
    .line 26
    invoke-direct {p1}, La/amq0;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, La/fsj;->b:La/amq0;

    .line 30
    .line 31
    new-instance v0, Landroidx/media3/common/Timeline$Window;

    .line 32
    .line 33
    invoke-direct {v0}, Landroidx/media3/common/Timeline$Window;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, La/fsj;->c:Landroidx/media3/common/Timeline$Window;

    .line 37
    .line 38
    new-instance v0, La/uii;

    .line 39
    .line 40
    invoke-direct {v0, p1}, La/uii;-><init>(La/amq0;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, La/fsj;->d:La/uii;

    .line 44
    .line 45
    new-instance p1, Landroid/util/SparseArray;

    .line 46
    .line 47
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, La/fsj;->e:Landroid/util/SparseArray;

    .line 51
    .line 52
    return-void
.end method


# virtual methods
.method public final A(La/jn30;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/fsj;->I()La/ft2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, La/csj;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1}, La/csj;-><init>(B)V

    .line 9
    .line 10
    .line 11
    const/16 v1, 0xe

    .line 12
    .line 13
    invoke-virtual {p0, p1, v1, v0}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final B(ILa/vn30;La/wn00;La/in30;Ljava/io/IOException;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, La/fsj;->L(ILa/vn30;)La/ft2;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    new-instance p1, La/z9f;

    .line 6
    .line 7
    invoke-direct/range {p1 .. p6}, La/z9f;-><init>(La/ft2;La/wn00;La/in30;Ljava/io/IOException;Z)V

    .line 8
    .line 9
    .line 10
    const/16 p3, 0x3eb

    .line 11
    .line 12
    invoke-virtual {p0, p2, p3, p1}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final C(La/dtf;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/fsj;->I()La/ft2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, La/t9f;

    .line 6
    .line 7
    const/16 v1, 0x17

    .line 8
    .line 9
    invoke-direct {v0, v1}, La/t9f;-><init>(B)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x1b

    .line 13
    .line 14
    invoke-virtual {p0, p1, v1, v0}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final D(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/fsj;->I()La/ft2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, La/t9f;

    .line 6
    .line 7
    const/16 v1, 0x14

    .line 8
    .line 9
    invoke-direct {v0, v1}, La/t9f;-><init>(B)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x8

    .line 13
    .line 14
    invoke-virtual {p0, p1, v1, v0}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final E(La/rds0;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/fsj;->I()La/ft2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, La/t9f;

    .line 6
    .line 7
    const/16 v1, 0x10

    .line 8
    .line 9
    invoke-direct {v0, v1}, La/t9f;-><init>(B)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    invoke-virtual {p0, p1, v1, v0}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final F(IZ)V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/fsj;->I()La/ft2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, La/t9f;

    .line 6
    .line 7
    const/16 v0, 0x8

    .line 8
    .line 9
    invoke-direct {p2, v0}, La/t9f;-><init>(B)V

    .line 10
    .line 11
    .line 12
    const/4 v0, -0x1

    .line 13
    invoke-virtual {p0, p1, v0, p2}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final G(La/dlo;)V
    .locals 3

    .line 1
    instance-of v0, p1, La/dlo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p1, La/dlo;->h:La/vn30;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v0}, La/fsj;->J(La/vn30;)La/ft2;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0}, La/fsj;->I()La/ft2;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    new-instance v1, La/z9f;

    .line 19
    .line 20
    const/16 v2, 0x8

    .line 21
    .line 22
    invoke-direct {v1, v0, p1, v2}, La/z9f;-><init>(La/ft2;Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    const/16 p1, 0xa

    .line 26
    .line 27
    invoke-virtual {p0, v0, p1, v1}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final H(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/fsj;->I()La/ft2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, La/t9f;

    .line 6
    .line 7
    const/16 v1, 0xa

    .line 8
    .line 9
    invoke-direct {v0, v1}, La/t9f;-><init>(B)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x7

    .line 13
    invoke-virtual {p0, p1, v1, v0}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final I()La/ft2;
    .locals 1

    .line 1
    iget-object v0, p0, La/fsj;->d:La/uii;

    .line 2
    .line 3
    iget-object v0, v0, La/uii;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/vn30;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, La/fsj;->J(La/vn30;)La/ft2;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final J(La/vn30;)La/ft2;
    .locals 3

    .line 1
    iget-object v0, p0, La/fsj;->g:La/my90;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    move-object v1, v0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v1, p0, La/fsj;->d:La/uii;

    .line 12
    .line 13
    iget-object v1, v1, La/uii;->c:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, La/wcf0;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, La/bmq0;

    .line 22
    .line 23
    :goto_0
    if-eqz p1, :cond_2

    .line 24
    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    iget-object v0, p1, La/vn30;->a:Ljava/lang/Object;

    .line 29
    .line 30
    iget-object v2, p0, La/fsj;->b:La/amq0;

    .line 31
    .line 32
    invoke-virtual {v1, v0, v2}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iget v0, v0, La/amq0;->c:I

    .line 37
    .line 38
    invoke-virtual {p0, v1, v0, p1}, La/fsj;->K(La/bmq0;ILa/vn30;)La/ft2;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_2
    :goto_1
    iget-object p1, p0, La/fsj;->g:La/my90;

    .line 44
    .line 45
    check-cast p1, La/ulo;

    .line 46
    .line 47
    invoke-virtual {p1}, La/ulo;->j()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    iget-object v1, p0, La/fsj;->g:La/my90;

    .line 52
    .line 53
    check-cast v1, La/ulo;

    .line 54
    .line 55
    invoke-virtual {v1}, La/ulo;->n()La/bmq0;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, La/bmq0;->o()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-ge p1, v2, :cond_3

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    sget-object v1, La/bmq0;->a:La/zlq0;

    .line 67
    .line 68
    :goto_2
    invoke-virtual {p0, v1, p1, v0}, La/fsj;->K(La/bmq0;ILa/vn30;)La/ft2;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0
.end method

.method public final K(La/bmq0;ILa/vn30;)La/ft2;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v3, p1

    .line 4
    .line 5
    move/from16 v4, p2

    .line 6
    .line 7
    invoke-virtual {v3}, La/bmq0;->p()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    move-object v5, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object/from16 v5, p3

    .line 17
    .line 18
    :goto_0
    iget-object v1, v0, La/fsj;->a:La/l9o0;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 24
    .line 25
    .line 26
    move-result-wide v1

    .line 27
    iget-object v6, v0, La/fsj;->g:La/my90;

    .line 28
    .line 29
    check-cast v6, La/ulo;

    .line 30
    .line 31
    invoke-virtual {v6}, La/ulo;->n()La/bmq0;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    invoke-virtual {v3, v6}, La/bmq0;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-eqz v6, :cond_1

    .line 40
    .line 41
    iget-object v6, v0, La/fsj;->g:La/my90;

    .line 42
    .line 43
    check-cast v6, La/ulo;

    .line 44
    .line 45
    invoke-virtual {v6}, La/ulo;->j()I

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-ne v4, v6, :cond_1

    .line 50
    .line 51
    const/4 v6, 0x1

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    const/4 v6, 0x0

    .line 54
    :goto_1
    const-wide/16 v7, 0x0

    .line 55
    .line 56
    if-eqz v5, :cond_3

    .line 57
    .line 58
    invoke-virtual {v5}, La/vn30;->c()Z

    .line 59
    .line 60
    .line 61
    move-result v9

    .line 62
    if-eqz v9, :cond_3

    .line 63
    .line 64
    if-eqz v6, :cond_2

    .line 65
    .line 66
    iget-object v6, v0, La/fsj;->g:La/my90;

    .line 67
    .line 68
    check-cast v6, La/ulo;

    .line 69
    .line 70
    invoke-virtual {v6}, La/ulo;->h()I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    iget v9, v5, La/vn30;->b:I

    .line 75
    .line 76
    if-ne v6, v9, :cond_2

    .line 77
    .line 78
    iget-object v6, v0, La/fsj;->g:La/my90;

    .line 79
    .line 80
    check-cast v6, La/ulo;

    .line 81
    .line 82
    invoke-virtual {v6}, La/ulo;->i()I

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    iget v9, v5, La/vn30;->c:I

    .line 87
    .line 88
    if-ne v6, v9, :cond_2

    .line 89
    .line 90
    iget-object v6, v0, La/fsj;->g:La/my90;

    .line 91
    .line 92
    check-cast v6, La/ulo;

    .line 93
    .line 94
    invoke-virtual {v6}, La/ulo;->l()J

    .line 95
    .line 96
    .line 97
    move-result-wide v7

    .line 98
    :cond_2
    :goto_2
    move-wide v6, v7

    .line 99
    goto :goto_3

    .line 100
    :cond_3
    if-eqz v6, :cond_4

    .line 101
    .line 102
    iget-object v6, v0, La/fsj;->g:La/my90;

    .line 103
    .line 104
    check-cast v6, La/ulo;

    .line 105
    .line 106
    invoke-virtual {v6}, La/ulo;->c0()V

    .line 107
    .line 108
    .line 109
    iget-object v7, v6, La/ulo;->n0:La/yx90;

    .line 110
    .line 111
    invoke-virtual {v6, v7}, La/ulo;->g(La/yx90;)J

    .line 112
    .line 113
    .line 114
    move-result-wide v7

    .line 115
    goto :goto_2

    .line 116
    :cond_4
    invoke-virtual {v3}, La/bmq0;->p()Z

    .line 117
    .line 118
    .line 119
    move-result v6

    .line 120
    if-eqz v6, :cond_5

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_5
    iget-object v6, v0, La/fsj;->c:Landroidx/media3/common/Timeline$Window;

    .line 124
    .line 125
    invoke-virtual {v3, v4, v6, v7, v8}, La/bmq0;->m(ILandroidx/media3/common/Timeline$Window;J)Landroidx/media3/common/Timeline$Window;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    iget-wide v6, v6, Landroidx/media3/common/Timeline$Window;->k:J

    .line 130
    .line 131
    invoke-static {v6, v7}, La/vtt0;->Y(J)J

    .line 132
    .line 133
    .line 134
    move-result-wide v7

    .line 135
    goto :goto_2

    .line 136
    :goto_3
    iget-object v8, v0, La/fsj;->d:La/uii;

    .line 137
    .line 138
    iget-object v8, v8, La/uii;->d:Ljava/lang/Object;

    .line 139
    .line 140
    move-object v10, v8

    .line 141
    check-cast v10, La/vn30;

    .line 142
    .line 143
    new-instance v8, La/ft2;

    .line 144
    .line 145
    iget-object v9, v0, La/fsj;->g:La/my90;

    .line 146
    .line 147
    check-cast v9, La/ulo;

    .line 148
    .line 149
    invoke-virtual {v9}, La/ulo;->n()La/bmq0;

    .line 150
    .line 151
    .line 152
    move-result-object v9

    .line 153
    iget-object v11, v0, La/fsj;->g:La/my90;

    .line 154
    .line 155
    check-cast v11, La/ulo;

    .line 156
    .line 157
    invoke-virtual {v11}, La/ulo;->j()I

    .line 158
    .line 159
    .line 160
    move-result v11

    .line 161
    iget-object v12, v0, La/fsj;->g:La/my90;

    .line 162
    .line 163
    check-cast v12, La/ulo;

    .line 164
    .line 165
    invoke-virtual {v12}, La/ulo;->l()J

    .line 166
    .line 167
    .line 168
    move-result-wide v12

    .line 169
    iget-object v0, v0, La/fsj;->g:La/my90;

    .line 170
    .line 171
    check-cast v0, La/ulo;

    .line 172
    .line 173
    invoke-virtual {v0}, La/ulo;->c0()V

    .line 174
    .line 175
    .line 176
    iget-object v0, v0, La/ulo;->n0:La/yx90;

    .line 177
    .line 178
    iget-wide v14, v0, La/yx90;->r:J

    .line 179
    .line 180
    invoke-static {v14, v15}, La/vtt0;->Y(J)J

    .line 181
    .line 182
    .line 183
    move-result-wide v14

    .line 184
    move-object v0, v8

    .line 185
    move-object v8, v9

    .line 186
    move v9, v11

    .line 187
    move-wide v11, v12

    .line 188
    move-wide v13, v14

    .line 189
    invoke-direct/range {v0 .. v14}, La/ft2;-><init>(JLa/bmq0;ILa/vn30;JLa/bmq0;ILa/vn30;JJ)V

    .line 190
    .line 191
    .line 192
    return-object v0
.end method

.method public final L(ILa/vn30;)La/ft2;
    .locals 1

    .line 1
    iget-object v0, p0, La/fsj;->g:La/my90;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, La/fsj;->d:La/uii;

    .line 9
    .line 10
    iget-object v0, v0, La/uii;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, La/wcf0;

    .line 13
    .line 14
    invoke-virtual {v0, p2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, La/bmq0;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0, p2}, La/fsj;->J(La/vn30;)La/ft2;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_0
    sget-object v0, La/bmq0;->a:La/zlq0;

    .line 28
    .line 29
    invoke-virtual {p0, v0, p1, p2}, La/fsj;->K(La/bmq0;ILa/vn30;)La/ft2;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_1
    iget-object p2, p0, La/fsj;->g:La/my90;

    .line 35
    .line 36
    check-cast p2, La/ulo;

    .line 37
    .line 38
    invoke-virtual {p2}, La/ulo;->n()La/bmq0;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-virtual {p2}, La/bmq0;->o()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-ge p1, v0, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    sget-object p2, La/bmq0;->a:La/zlq0;

    .line 50
    .line 51
    :goto_0
    const/4 v0, 0x0

    .line 52
    invoke-virtual {p0, p2, p1, v0}, La/fsj;->K(La/bmq0;ILa/vn30;)La/ft2;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0
.end method

.method public final M()La/ft2;
    .locals 1

    .line 1
    iget-object v0, p0, La/fsj;->d:La/uii;

    .line 2
    .line 3
    iget-object v0, v0, La/uii;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/vn30;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, La/fsj;->J(La/vn30;)La/ft2;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public final N(La/ft2;ILa/sg00;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/fsj;->e:Landroid/util/SparseArray;

    .line 2
    .line 3
    invoke-virtual {v0, p2, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/fsj;->f:La/vg00;

    .line 7
    .line 8
    invoke-virtual {p0, p2, p3}, La/vg00;->e(ILa/sg00;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final O(La/ulo;Landroid/os/Looper;)V
    .locals 10

    .line 1
    iget-object v0, p0, La/fsj;->g:La/my90;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, La/fsj;->d:La/uii;

    .line 8
    .line 9
    iget-object v0, v0, La/uii;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, La/b4x;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v0, v2

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    :goto_0
    move v0, v1

    .line 23
    :goto_1
    invoke-static {v0}, La/x0x;->K(Z)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, La/fsj;->g:La/my90;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    iget-object v3, p0, La/fsj;->a:La/l9o0;

    .line 33
    .line 34
    invoke-virtual {v3, p2, v0}, La/l9o0;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)La/q9o0;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iput-object v0, p0, La/fsj;->h:La/q9o0;

    .line 39
    .line 40
    iget-object v0, p0, La/fsj;->f:La/vg00;

    .line 41
    .line 42
    new-instance v8, La/uq;

    .line 43
    .line 44
    const/16 v3, 0xb

    .line 45
    .line 46
    invoke-direct {v8, p0, p1, v3}, La/uq;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 47
    .line 48
    .line 49
    iget-object v7, p0, La/fsj;->a:La/l9o0;

    .line 50
    .line 51
    if-nez v7, :cond_2

    .line 52
    .line 53
    move v1, v2

    .line 54
    :cond_2
    invoke-static {v1}, La/x0x;->K(Z)V

    .line 55
    .line 56
    .line 57
    new-instance v3, La/vg00;

    .line 58
    .line 59
    iget-object v4, v0, La/vg00;->d:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 60
    .line 61
    invoke-virtual {p2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    iget-boolean v9, v0, La/vg00;->i:Z

    .line 66
    .line 67
    move-object v5, p2

    .line 68
    invoke-direct/range {v3 .. v9}, La/vg00;-><init>(Ljava/util/concurrent/CopyOnWriteArraySet;Landroid/os/Looper;Ljava/lang/Thread;La/l9o0;La/tg00;Z)V

    .line 69
    .line 70
    .line 71
    iput-object v3, p0, La/fsj;->f:La/vg00;

    .line 72
    .line 73
    return-void
.end method

.method public final a(La/qfu0;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/fsj;->M()La/ft2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, La/esj;

    .line 6
    .line 7
    invoke-direct {v1, v0, p1}, La/esj;-><init>(La/ft2;La/qfu0;)V

    .line 8
    .line 9
    .line 10
    const/16 p1, 0x19

    .line 11
    .line 12
    invoke-virtual {p0, v0, p1, v1}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final b(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/fsj;->I()La/ft2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, La/t9f;

    .line 6
    .line 7
    const/16 v1, 0xc

    .line 8
    .line 9
    invoke-direct {v0, v1}, La/t9f;-><init>(B)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x6

    .line 13
    invoke-virtual {p0, p1, v1, v0}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final c(La/zx90;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/fsj;->I()La/ft2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, La/t9f;

    .line 6
    .line 7
    const/4 v1, 0x6

    .line 8
    invoke-direct {v0, v1}, La/t9f;-><init>(B)V

    .line 9
    .line 10
    .line 11
    const/16 v1, 0xc

    .line 12
    .line 13
    invoke-virtual {p0, p1, v1, v0}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final d(La/iy90;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/fsj;->I()La/ft2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, La/csj;

    .line 6
    .line 7
    const/16 v1, 0x15

    .line 8
    .line 9
    invoke-direct {v0, v1}, La/csj;-><init>(B)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0xd

    .line 13
    .line 14
    invoke-virtual {p0, p1, v1, v0}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final e(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/fsj;->M()La/ft2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, La/csj;

    .line 6
    .line 7
    const/4 v1, 0x6

    .line 8
    invoke-direct {v0, v1}, La/csj;-><init>(B)V

    .line 9
    .line 10
    .line 11
    const/16 v1, 0x15

    .line 12
    .line 13
    invoke-virtual {p0, p1, v1, v0}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final f(I)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/fsj;->I()La/ft2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, La/t9f;

    .line 6
    .line 7
    const/16 v1, 0x12

    .line 8
    .line 9
    invoke-direct {v0, v1}, La/t9f;-><init>(B)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x4

    .line 13
    invoke-virtual {p0, p1, v1, v0}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final g(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/fsj;->I()La/ft2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, La/csj;

    .line 6
    .line 7
    const/16 v1, 0xd

    .line 8
    .line 9
    invoke-direct {v0, v1}, La/csj;-><init>(B)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x9

    .line 13
    .line 14
    invoke-virtual {p0, p1, v1, v0}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final h(La/jy90;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final i(ILa/vn30;La/wn00;La/in30;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, La/fsj;->L(ILa/vn30;)La/ft2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, La/t9f;

    .line 6
    .line 7
    const/16 p3, 0x18

    .line 8
    .line 9
    invoke-direct {p2, p3}, La/t9f;-><init>(B)V

    .line 10
    .line 11
    .line 12
    const/16 p3, 0x3e8

    .line 13
    .line 14
    invoke-virtual {p0, p1, p3, p2}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final j(ILa/vn30;La/wn00;La/in30;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, La/fsj;->L(ILa/vn30;)La/ft2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, La/csj;

    .line 6
    .line 7
    const/4 p3, 0x2

    .line 8
    invoke-direct {p2, p3}, La/csj;-><init>(B)V

    .line 9
    .line 10
    .line 11
    const/16 p3, 0x3ea

    .line 12
    .line 13
    invoke-virtual {p0, p1, p3, p2}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final k(I)V
    .locals 5

    .line 1
    iget-object v0, p0, La/fsj;->g:La/my90;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, La/fsj;->d:La/uii;

    .line 7
    .line 8
    iget-object v2, v1, La/uii;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, La/b4x;

    .line 11
    .line 12
    iget-object v3, v1, La/uii;->e:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v3, La/vn30;

    .line 15
    .line 16
    iget-object v4, v1, La/uii;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v4, La/amq0;

    .line 19
    .line 20
    invoke-static {v0, v2, v3, v4}, La/uii;->g(La/my90;La/b4x;La/vn30;La/amq0;)La/vn30;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iput-object v2, v1, La/uii;->d:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, La/ulo;

    .line 27
    .line 28
    invoke-virtual {v0}, La/ulo;->n()La/bmq0;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v1, v0}, La/uii;->K(La/bmq0;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, La/fsj;->I()La/ft2;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    new-instance v1, La/csj;

    .line 40
    .line 41
    invoke-direct {v1, v0, p1}, La/csj;-><init>(La/ft2;I)V

    .line 42
    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    invoke-virtual {p0, v0, p1, v1}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final l()V
    .locals 0

    .line 1
    return-void
.end method

.method public final m(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/fsj;->M()La/ft2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, La/csj;

    .line 6
    .line 7
    const/16 v1, 0xf

    .line 8
    .line 9
    invoke-direct {v0, v1}, La/csj;-><init>(B)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x17

    .line 13
    .line 14
    invoke-virtual {p0, p1, v1, v0}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final n(Ljava/util/List;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/fsj;->I()La/ft2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, La/asj;

    .line 6
    .line 7
    invoke-direct {v1, v0, p1}, La/asj;-><init>(La/ft2;Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    const/16 p1, 0x1b

    .line 11
    .line 12
    invoke-virtual {p0, v0, p1, v1}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final o(Landroidx/media3/common/MediaItem;I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/fsj;->I()La/ft2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, La/csj;

    .line 6
    .line 7
    const/16 v0, 0x17

    .line 8
    .line 9
    invoke-direct {p2, v0}, La/csj;-><init>(B)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-virtual {p0, p1, v0, p2}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final p(ILa/vn30;La/in30;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, La/fsj;->L(ILa/vn30;)La/ft2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, La/uq;

    .line 6
    .line 7
    const/16 v0, 0xc

    .line 8
    .line 9
    invoke-direct {p2, p1, p3, v0}, La/uq;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 10
    .line 11
    .line 12
    const/16 p3, 0x3ec

    .line 13
    .line 14
    invoke-virtual {p0, p1, p3, p2}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final q(II)V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/fsj;->M()La/ft2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, La/t9f;

    .line 6
    .line 7
    const/16 v0, 0x16

    .line 8
    .line 9
    invoke-direct {p2, v0}, La/t9f;-><init>(B)V

    .line 10
    .line 11
    .line 12
    const/16 v0, 0x18

    .line 13
    .line 14
    invoke-virtual {p0, p1, v0, p2}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final r(ILa/vn30;La/wn00;La/in30;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, La/fsj;->L(ILa/vn30;)La/ft2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, La/csj;

    .line 6
    .line 7
    const/4 p3, 0x4

    .line 8
    invoke-direct {p2, p3}, La/csj;-><init>(B)V

    .line 9
    .line 10
    .line 11
    const/16 p3, 0x3e9

    .line 12
    .line 13
    invoke-virtual {p0, p1, p3, p2}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final s(La/scs0;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/fsj;->I()La/ft2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, La/csj;

    .line 6
    .line 7
    const/16 v1, 0xc

    .line 8
    .line 9
    invoke-direct {v0, v1}, La/csj;-><init>(B)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x13

    .line 13
    .line 14
    invoke-virtual {p0, p1, v1, v0}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final t(La/ed40;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/fsj;->I()La/ft2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, La/t9f;

    .line 6
    .line 7
    const/16 v1, 0x9

    .line 8
    .line 9
    invoke-direct {v0, v1}, La/t9f;-><init>(B)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x1c

    .line 13
    .line 14
    invoke-virtual {p0, p1, v1, v0}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final u(ILa/ly90;La/ly90;)V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, La/fsj;->i:Z

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, La/fsj;->g:La/my90;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, La/fsj;->d:La/uii;

    .line 13
    .line 14
    iget-object v2, v1, La/uii;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, La/b4x;

    .line 17
    .line 18
    iget-object v3, v1, La/uii;->e:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v3, La/vn30;

    .line 21
    .line 22
    iget-object v4, v1, La/uii;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v4, La/amq0;

    .line 25
    .line 26
    invoke-static {v0, v2, v3, v4}, La/uii;->g(La/my90;La/b4x;La/vn30;La/amq0;)La/vn30;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, v1, La/uii;->d:Ljava/lang/Object;

    .line 31
    .line 32
    invoke-virtual {p0}, La/fsj;->I()La/ft2;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v1, La/bsj;

    .line 37
    .line 38
    invoke-direct {v1, v0, p1, p2, p3}, La/bsj;-><init>(La/ft2;ILa/ly90;La/ly90;)V

    .line 39
    .line 40
    .line 41
    const/16 p1, 0xb

    .line 42
    .line 43
    invoke-virtual {p0, v0, p1, v1}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final v(La/dlo;)V
    .locals 2

    .line 1
    instance-of v0, p1, La/dlo;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p1, La/dlo;->h:La/vn30;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1}, La/fsj;->J(La/vn30;)La/ft2;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0}, La/fsj;->I()La/ft2;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :goto_0
    new-instance v0, La/t9f;

    .line 19
    .line 20
    const/16 v1, 0xd

    .line 21
    .line 22
    invoke-direct {v0, v1}, La/t9f;-><init>(B)V

    .line 23
    .line 24
    .line 25
    const/16 v1, 0xa

    .line 26
    .line 27
    invoke-virtual {p0, p1, v1, v0}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final w(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/fsj;->I()La/ft2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, La/csj;

    .line 6
    .line 7
    const/16 v1, 0x13

    .line 8
    .line 9
    invoke-direct {v0, v1}, La/csj;-><init>(B)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x3

    .line 13
    invoke-virtual {p0, p1, v1, v0}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final x(IZ)V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/fsj;->I()La/ft2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, La/t9f;

    .line 6
    .line 7
    const/16 v0, 0xe

    .line 8
    .line 9
    invoke-direct {p2, v0}, La/t9f;-><init>(B)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x5

    .line 13
    invoke-virtual {p0, p1, v0, p2}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final y(F)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/fsj;->M()La/ft2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, La/t9f;

    .line 6
    .line 7
    const/4 v1, 0x7

    .line 8
    invoke-direct {v0, v1}, La/t9f;-><init>(B)V

    .line 9
    .line 10
    .line 11
    const/16 v1, 0x16

    .line 12
    .line 13
    invoke-virtual {p0, p1, v1, v0}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final z(ILa/vn30;La/in30;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, La/fsj;->L(ILa/vn30;)La/ft2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, La/csj;

    .line 6
    .line 7
    const/16 p3, 0x9

    .line 8
    .line 9
    invoke-direct {p2, p3}, La/csj;-><init>(B)V

    .line 10
    .line 11
    .line 12
    const/16 p3, 0x3ed

    .line 13
    .line 14
    invoke-virtual {p0, p1, p3, p2}, La/fsj;->N(La/ft2;ILa/sg00;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
