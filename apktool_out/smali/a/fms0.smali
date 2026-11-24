.class public final La/fms0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/l0t0;


# instance fields
.field public final a:Ljava/util/HashMap;

.field public final b:Ljava/util/HashMap;

.field public final c:La/i0t0;

.field public d:La/fhn;

.field public e:F

.field public f:La/yls0;

.field public final g:La/viq;

.field public h:I

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public m:I

.field public n:Z


# direct methods
.method public constructor <init>(La/viq;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/fms0;->a:Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, La/fms0;->b:Ljava/util/HashMap;

    .line 17
    .line 18
    new-instance v0, La/i0t0;

    .line 19
    .line 20
    invoke-direct {v0}, La/i0t0;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, La/fms0;->c:La/i0t0;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput-object v0, p0, La/fms0;->d:La/fhn;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    iput v1, p0, La/fms0;->e:F

    .line 30
    .line 31
    iput-object v0, p0, La/fms0;->f:La/yls0;

    .line 32
    .line 33
    iput-object p1, p0, La/fms0;->g:La/viq;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/String;)La/ems0;
    .locals 8

    .line 1
    iget-object p1, p0, La/fms0;->b:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/ems0;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    new-instance v0, La/ems0;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    iput-boolean v1, v0, La/ems0;->e:Z

    .line 18
    .line 19
    new-instance v2, La/vjy;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-direct {v2, v3}, La/vjy;-><init>(B)V

    .line 23
    .line 24
    .line 25
    const/4 v2, -0x1

    .line 26
    iput v2, v0, La/ems0;->i:I

    .line 27
    .line 28
    new-instance v4, La/vdv0;

    .line 29
    .line 30
    invoke-direct {v4}, La/vdv0;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v4, v0, La/ems0;->a:La/vdv0;

    .line 34
    .line 35
    new-instance v5, La/vdv0;

    .line 36
    .line 37
    invoke-direct {v5}, La/vdv0;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v5, v0, La/ems0;->b:La/vdv0;

    .line 41
    .line 42
    new-instance v6, La/vdv0;

    .line 43
    .line 44
    invoke-direct {v6}, La/vdv0;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object v6, v0, La/ems0;->c:La/vdv0;

    .line 48
    .line 49
    new-instance v7, La/ywu;

    .line 50
    .line 51
    invoke-direct {v7, v4}, La/ywu;-><init>(La/vdv0;)V

    .line 52
    .line 53
    .line 54
    iput-object v7, v0, La/ems0;->f:La/ywu;

    .line 55
    .line 56
    new-instance v4, La/ywu;

    .line 57
    .line 58
    invoke-direct {v4, v5}, La/ywu;-><init>(La/vdv0;)V

    .line 59
    .line 60
    .line 61
    iput-object v4, v0, La/ems0;->g:La/ywu;

    .line 62
    .line 63
    new-instance v5, La/ywu;

    .line 64
    .line 65
    invoke-direct {v5, v6}, La/ywu;-><init>(La/vdv0;)V

    .line 66
    .line 67
    .line 68
    iput-object v5, v0, La/ems0;->h:La/ywu;

    .line 69
    .line 70
    new-instance v5, La/zr40;

    .line 71
    .line 72
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 73
    .line 74
    .line 75
    iput v3, v5, La/zr40;->b:I

    .line 76
    .line 77
    new-instance v3, La/qt40;

    .line 78
    .line 79
    invoke-direct {v3}, La/qt40;-><init>()V

    .line 80
    .line 81
    .line 82
    iput-object v3, v5, La/zr40;->c:La/qt40;

    .line 83
    .line 84
    new-instance v3, La/qt40;

    .line 85
    .line 86
    invoke-direct {v3}, La/qt40;-><init>()V

    .line 87
    .line 88
    .line 89
    iput-object v3, v5, La/zr40;->d:La/qt40;

    .line 90
    .line 91
    new-instance v3, La/bs40;

    .line 92
    .line 93
    invoke-direct {v3}, La/bs40;-><init>()V

    .line 94
    .line 95
    .line 96
    iput-object v3, v5, La/zr40;->e:La/bs40;

    .line 97
    .line 98
    new-instance v3, La/bs40;

    .line 99
    .line 100
    invoke-direct {v3}, La/bs40;-><init>()V

    .line 101
    .line 102
    .line 103
    iput-object v3, v5, La/zr40;->f:La/bs40;

    .line 104
    .line 105
    const/high16 v3, 0x7fc00000    # Float.NaN

    .line 106
    .line 107
    iput v3, v5, La/zr40;->i:F

    .line 108
    .line 109
    const/4 v6, 0x0

    .line 110
    iput v6, v5, La/zr40;->j:F

    .line 111
    .line 112
    const/high16 v6, 0x3f800000    # 1.0f

    .line 113
    .line 114
    iput v6, v5, La/zr40;->k:F

    .line 115
    .line 116
    const/4 v6, 0x4

    .line 117
    new-array v6, v6, [F

    .line 118
    .line 119
    iput-object v6, v5, La/zr40;->q:[F

    .line 120
    .line 121
    new-instance v6, Ljava/util/ArrayList;

    .line 122
    .line 123
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 124
    .line 125
    .line 126
    iput-object v6, v5, La/zr40;->r:Ljava/util/ArrayList;

    .line 127
    .line 128
    new-array v1, v1, [F

    .line 129
    .line 130
    iput-object v1, v5, La/zr40;->s:[F

    .line 131
    .line 132
    new-instance v1, Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 135
    .line 136
    .line 137
    iput-object v1, v5, La/zr40;->t:Ljava/util/ArrayList;

    .line 138
    .line 139
    iput v2, v5, La/zr40;->x:I

    .line 140
    .line 141
    iput v2, v5, La/zr40;->y:I

    .line 142
    .line 143
    iput v2, v5, La/zr40;->z:I

    .line 144
    .line 145
    iput v3, v5, La/zr40;->A:F

    .line 146
    .line 147
    const/4 v1, 0x0

    .line 148
    iput-object v1, v5, La/zr40;->B:La/nr00;

    .line 149
    .line 150
    iput-object v7, v5, La/zr40;->a:La/ywu;

    .line 151
    .line 152
    iput-object v5, v0, La/ems0;->d:La/zr40;

    .line 153
    .line 154
    invoke-virtual {v5, v7}, La/zr40;->j(La/ywu;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v5, v4}, La/zr40;->i(La/ywu;)V

    .line 158
    .line 159
    .line 160
    iget-object p0, p0, La/fms0;->c:La/i0t0;

    .line 161
    .line 162
    invoke-virtual {p0, v5}, La/i0t0;->d(La/l0t0;)V

    .line 163
    .line 164
    .line 165
    iget-object p0, v7, La/ywu;->b:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast p0, La/vdv0;

    .line 168
    .line 169
    iget-object p0, p0, La/vdv0;->s:La/i0t0;

    .line 170
    .line 171
    if-eqz p0, :cond_0

    .line 172
    .line 173
    invoke-virtual {p0, v5}, La/i0t0;->d(La/l0t0;)V

    .line 174
    .line 175
    .line 176
    :cond_0
    invoke-virtual {p1, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    :cond_1
    return-object v0
.end method

.method public final b(IFI)V
    .locals 4

    .line 1
    iget-boolean v0, p0, La/fms0;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, La/fms0;->h:I

    .line 6
    .line 7
    int-to-float v1, v0

    .line 8
    const/high16 v2, 0x3f000000    # 0.5f

    .line 9
    .line 10
    add-float/2addr v1, v2

    .line 11
    iget v3, p0, La/fms0;->j:I

    .line 12
    .line 13
    sub-int/2addr v3, v0

    .line 14
    int-to-float v0, v3

    .line 15
    mul-float/2addr v0, p2

    .line 16
    add-float/2addr v0, v1

    .line 17
    float-to-int v0, v0

    .line 18
    iput v0, p0, La/fms0;->l:I

    .line 19
    .line 20
    iget v0, p0, La/fms0;->i:I

    .line 21
    .line 22
    int-to-float v1, v0

    .line 23
    add-float/2addr v1, v2

    .line 24
    iget v2, p0, La/fms0;->k:I

    .line 25
    .line 26
    sub-int/2addr v2, v0

    .line 27
    int-to-float v0, v2

    .line 28
    mul-float/2addr v0, p2

    .line 29
    add-float/2addr v0, v1

    .line 30
    float-to-int v0, v0

    .line 31
    iput v0, p0, La/fms0;->m:I

    .line 32
    .line 33
    :cond_0
    iget-object v0, p0, La/fms0;->d:La/fhn;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    float-to-double v1, p2

    .line 38
    invoke-virtual {v0, v1, v2}, La/fhn;->d(D)D

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    double-to-float p2, v0

    .line 43
    :cond_1
    iget-object v0, p0, La/fms0;->b:Ljava/util/HashMap;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_2

    .line 58
    .line 59
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    check-cast v2, Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, La/ems0;

    .line 70
    .line 71
    invoke-virtual {v2, p1, p3, p2, p0}, La/ems0;->a(IIFLa/fms0;)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    return-void
.end method

.method public final c(II)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final d(FI)Z
    .locals 1

    .line 1
    const/16 v0, 0x2c2

    .line 2
    .line 3
    if-ne p2, v0, :cond_0

    .line 4
    .line 5
    iput p1, p0, La/fms0;->e:F

    .line 6
    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final e(ILjava/lang/String;)Z
    .locals 1

    .line 1
    const/16 v0, 0x2c1

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    invoke-static {p2}, La/fhn;->f(Ljava/lang/String;)La/fhn;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, p0, La/fms0;->d:La/fhn;

    .line 10
    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final f(La/l4e;I)V
    .locals 11

    .line 1
    iget-object v0, p1, La/k4e;->U:[La/j4e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v2, v0, v1

    .line 5
    .line 6
    const/4 v3, 0x1

    .line 7
    sget-object v4, La/j4e;->b:La/j4e;

    .line 8
    .line 9
    if-ne v2, v4, :cond_0

    .line 10
    .line 11
    move v2, v3

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v2, v1

    .line 14
    :goto_0
    iput-boolean v2, p0, La/fms0;->n:Z

    .line 15
    .line 16
    aget-object v0, v0, v3

    .line 17
    .line 18
    if-ne v0, v4, :cond_1

    .line 19
    .line 20
    move v0, v3

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v0, v1

    .line 23
    :goto_1
    or-int/2addr v0, v2

    .line 24
    iput-boolean v0, p0, La/fms0;->n:Z

    .line 25
    .line 26
    if-nez p2, :cond_2

    .line 27
    .line 28
    invoke-virtual {p1}, La/k4e;->s()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iput v0, p0, La/fms0;->h:I

    .line 33
    .line 34
    iput v0, p0, La/fms0;->l:I

    .line 35
    .line 36
    invoke-virtual {p1}, La/k4e;->m()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iput v0, p0, La/fms0;->i:I

    .line 41
    .line 42
    iput v0, p0, La/fms0;->m:I

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    invoke-virtual {p1}, La/k4e;->s()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iput v0, p0, La/fms0;->j:I

    .line 50
    .line 51
    invoke-virtual {p1}, La/k4e;->m()I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    iput v0, p0, La/fms0;->k:I

    .line 56
    .line 57
    :goto_2
    iget-object p1, p1, La/l4e;->u0:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    new-array v2, v0, [La/ems0;

    .line 64
    .line 65
    move v4, v1

    .line 66
    :goto_3
    if-ge v4, v0, :cond_7

    .line 67
    .line 68
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    check-cast v5, La/k4e;

    .line 73
    .line 74
    iget-object v6, v5, La/k4e;->k:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {p0, p2, v6}, La/fms0;->a(ILjava/lang/String;)La/ems0;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    iget-object v7, v6, La/ems0;->d:La/zr40;

    .line 81
    .line 82
    aput-object v6, v2, v4

    .line 83
    .line 84
    iget-object v8, v6, La/ems0;->d:La/zr40;

    .line 85
    .line 86
    iget-object v9, v6, La/ems0;->f:La/ywu;

    .line 87
    .line 88
    if-nez p2, :cond_4

    .line 89
    .line 90
    iget-object v10, v6, La/ems0;->a:La/vdv0;

    .line 91
    .line 92
    iput-object v5, v10, La/vdv0;->a:La/k4e;

    .line 93
    .line 94
    invoke-virtual {v10}, La/vdv0;->d()V

    .line 95
    .line 96
    .line 97
    iget-object v5, v9, La/ywu;->b:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v5, La/vdv0;

    .line 100
    .line 101
    iget-object v5, v5, La/vdv0;->s:La/i0t0;

    .line 102
    .line 103
    if-eqz v5, :cond_3

    .line 104
    .line 105
    invoke-virtual {v5, v9}, La/i0t0;->d(La/l0t0;)V

    .line 106
    .line 107
    .line 108
    :cond_3
    invoke-virtual {v8, v9}, La/zr40;->j(La/ywu;)V

    .line 109
    .line 110
    .line 111
    iput-boolean v3, v6, La/ems0;->e:Z

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_4
    if-ne p2, v3, :cond_5

    .line 115
    .line 116
    iget-object v9, v6, La/ems0;->b:La/vdv0;

    .line 117
    .line 118
    iput-object v5, v9, La/vdv0;->a:La/k4e;

    .line 119
    .line 120
    invoke-virtual {v9}, La/vdv0;->d()V

    .line 121
    .line 122
    .line 123
    iget-object v5, v6, La/ems0;->g:La/ywu;

    .line 124
    .line 125
    invoke-virtual {v8, v5}, La/zr40;->i(La/ywu;)V

    .line 126
    .line 127
    .line 128
    iput-boolean v3, v6, La/ems0;->e:Z

    .line 129
    .line 130
    :cond_5
    :goto_4
    iget-object v5, v7, La/zr40;->c:La/qt40;

    .line 131
    .line 132
    iget-object v5, v5, La/qt40;->j:Ljava/lang/String;

    .line 133
    .line 134
    if-eqz v5, :cond_6

    .line 135
    .line 136
    invoke-virtual {p0, p2, v5}, La/fms0;->a(ILjava/lang/String;)La/ems0;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    iget-object v5, v5, La/ems0;->d:La/zr40;

    .line 141
    .line 142
    iput-object v5, v7, La/zr40;->Y:La/zr40;

    .line 143
    .line 144
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 145
    .line 146
    goto :goto_3

    .line 147
    :cond_7
    iget p1, p0, La/fms0;->e:F

    .line 148
    .line 149
    const/4 p2, 0x0

    .line 150
    cmpl-float p2, p1, p2

    .line 151
    .line 152
    if-nez p2, :cond_8

    .line 153
    .line 154
    goto/16 :goto_9

    .line 155
    .line 156
    :cond_8
    float-to-double v4, p1

    .line 157
    const-wide/16 v6, 0x0

    .line 158
    .line 159
    cmpg-double p2, v4, v6

    .line 160
    .line 161
    if-gez p2, :cond_9

    .line 162
    .line 163
    move v1, v3

    .line 164
    :cond_9
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 165
    .line 166
    .line 167
    move-result p1

    .line 168
    iget-object p0, p0, La/fms0;->b:Ljava/util/HashMap;

    .line 169
    .line 170
    invoke-virtual {p0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    :cond_a
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    const/high16 v2, 0x3f800000    # 1.0f

    .line 183
    .line 184
    const v3, 0x7f7fffff    # Float.MAX_VALUE

    .line 185
    .line 186
    .line 187
    const v4, -0x800001

    .line 188
    .line 189
    .line 190
    if-eqz v0, :cond_f

    .line 191
    .line 192
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    check-cast v0, Ljava/lang/String;

    .line 197
    .line 198
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    check-cast v0, La/ems0;

    .line 203
    .line 204
    iget-object v0, v0, La/ems0;->d:La/zr40;

    .line 205
    .line 206
    iget v0, v0, La/zr40;->i:F

    .line 207
    .line 208
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-nez v0, :cond_a

    .line 213
    .line 214
    invoke-virtual {p0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 215
    .line 216
    .line 217
    move-result-object p2

    .line 218
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 219
    .line 220
    .line 221
    move-result-object p2

    .line 222
    :cond_b
    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    if-eqz v0, :cond_c

    .line 227
    .line 228
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    check-cast v0, Ljava/lang/String;

    .line 233
    .line 234
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    check-cast v0, La/ems0;

    .line 239
    .line 240
    iget-object v0, v0, La/ems0;->d:La/zr40;

    .line 241
    .line 242
    iget v0, v0, La/zr40;->i:F

    .line 243
    .line 244
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 245
    .line 246
    .line 247
    move-result v5

    .line 248
    if-nez v5, :cond_b

    .line 249
    .line 250
    invoke-static {v3, v0}, Ljava/lang/Math;->min(FF)F

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    invoke-static {v4, v0}, Ljava/lang/Math;->max(FF)F

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    move v4, v0

    .line 259
    goto :goto_5

    .line 260
    :cond_c
    invoke-virtual {p0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 261
    .line 262
    .line 263
    move-result-object p2

    .line 264
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 265
    .line 266
    .line 267
    move-result-object p2

    .line 268
    :cond_d
    :goto_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 269
    .line 270
    .line 271
    move-result v0

    .line 272
    if-eqz v0, :cond_12

    .line 273
    .line 274
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    check-cast v0, Ljava/lang/String;

    .line 279
    .line 280
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    check-cast v0, La/ems0;

    .line 285
    .line 286
    iget-object v0, v0, La/ems0;->d:La/zr40;

    .line 287
    .line 288
    iget v5, v0, La/zr40;->i:F

    .line 289
    .line 290
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 291
    .line 292
    .line 293
    move-result v6

    .line 294
    if-nez v6, :cond_d

    .line 295
    .line 296
    sub-float v6, v2, p1

    .line 297
    .line 298
    div-float v6, v2, v6

    .line 299
    .line 300
    sub-float v7, v5, v3

    .line 301
    .line 302
    mul-float/2addr v7, p1

    .line 303
    sub-float v8, v4, v3

    .line 304
    .line 305
    div-float/2addr v7, v8

    .line 306
    sub-float v7, p1, v7

    .line 307
    .line 308
    if-eqz v1, :cond_e

    .line 309
    .line 310
    sub-float v5, v4, v5

    .line 311
    .line 312
    div-float/2addr v5, v8

    .line 313
    mul-float/2addr v5, p1

    .line 314
    sub-float v7, p1, v5

    .line 315
    .line 316
    :cond_e
    iput v6, v0, La/zr40;->k:F

    .line 317
    .line 318
    iput v7, v0, La/zr40;->j:F

    .line 319
    .line 320
    goto :goto_6

    .line 321
    :cond_f
    invoke-virtual {p0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 322
    .line 323
    .line 324
    move-result-object p2

    .line 325
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 326
    .line 327
    .line 328
    move-result-object p2

    .line 329
    :goto_7
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    if-eqz v0, :cond_10

    .line 334
    .line 335
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    check-cast v0, Ljava/lang/String;

    .line 340
    .line 341
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    check-cast v0, La/ems0;

    .line 346
    .line 347
    iget-object v0, v0, La/ems0;->d:La/zr40;

    .line 348
    .line 349
    iget-object v0, v0, La/zr40;->d:La/qt40;

    .line 350
    .line 351
    iget v5, v0, La/qt40;->d:F

    .line 352
    .line 353
    iget v0, v0, La/qt40;->e:F

    .line 354
    .line 355
    add-float/2addr v5, v0

    .line 356
    invoke-static {v3, v5}, Ljava/lang/Math;->min(FF)F

    .line 357
    .line 358
    .line 359
    move-result v3

    .line 360
    invoke-static {v4, v5}, Ljava/lang/Math;->max(FF)F

    .line 361
    .line 362
    .line 363
    move-result v4

    .line 364
    goto :goto_7

    .line 365
    :cond_10
    invoke-virtual {p0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 366
    .line 367
    .line 368
    move-result-object p2

    .line 369
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 370
    .line 371
    .line 372
    move-result-object p2

    .line 373
    :goto_8
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 374
    .line 375
    .line 376
    move-result v0

    .line 377
    if-eqz v0, :cond_12

    .line 378
    .line 379
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    check-cast v0, Ljava/lang/String;

    .line 384
    .line 385
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    check-cast v0, La/ems0;

    .line 390
    .line 391
    iget-object v0, v0, La/ems0;->d:La/zr40;

    .line 392
    .line 393
    iget-object v5, v0, La/zr40;->d:La/qt40;

    .line 394
    .line 395
    iget v6, v5, La/qt40;->d:F

    .line 396
    .line 397
    iget v5, v5, La/qt40;->e:F

    .line 398
    .line 399
    add-float/2addr v6, v5

    .line 400
    sub-float v5, v6, v3

    .line 401
    .line 402
    mul-float/2addr v5, p1

    .line 403
    sub-float v7, v4, v3

    .line 404
    .line 405
    div-float/2addr v5, v7

    .line 406
    sub-float v5, p1, v5

    .line 407
    .line 408
    if-eqz v1, :cond_11

    .line 409
    .line 410
    sub-float v5, v4, v6

    .line 411
    .line 412
    div-float/2addr v5, v7

    .line 413
    mul-float/2addr v5, p1

    .line 414
    sub-float v5, p1, v5

    .line 415
    .line 416
    :cond_11
    sub-float v6, v2, p1

    .line 417
    .line 418
    div-float v6, v2, v6

    .line 419
    .line 420
    iput v6, v0, La/zr40;->k:F

    .line 421
    .line 422
    iput v5, v0, La/zr40;->j:F

    .line 423
    .line 424
    goto :goto_8

    .line 425
    :cond_12
    :goto_9
    return-void
.end method
