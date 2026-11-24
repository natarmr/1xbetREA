.class public final La/kul0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final p:La/mfn;

.field public static final q:La/mfn;

.field public static final r:La/mfn;

.field public static final s:La/mfn;

.field public static final t:La/mfn;

.field public static final u:La/mfn;


# instance fields
.field public a:F

.field public b:F

.field public c:Z

.field public final d:Ljava/lang/Object;

.field public final e:La/zjb;

.field public f:Z

.field public final g:F

.field public final h:F

.field public i:J

.field public j:F

.field public final k:Ljava/util/ArrayList;

.field public final l:Ljava/util/ArrayList;

.field public m:La/lul0;

.field public n:F

.field public o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/mfn;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, La/mfn;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, La/kul0;->p:La/mfn;

    .line 8
    .line 9
    new-instance v0, La/mfn;

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    invoke-direct {v0, v1}, La/mfn;-><init>(B)V

    .line 13
    .line 14
    .line 15
    sput-object v0, La/kul0;->q:La/mfn;

    .line 16
    .line 17
    new-instance v0, La/mfn;

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    invoke-direct {v0, v1}, La/mfn;-><init>(B)V

    .line 21
    .line 22
    .line 23
    sput-object v0, La/kul0;->r:La/mfn;

    .line 24
    .line 25
    new-instance v0, La/mfn;

    .line 26
    .line 27
    const/4 v1, 0x4

    .line 28
    invoke-direct {v0, v1}, La/mfn;-><init>(B)V

    .line 29
    .line 30
    .line 31
    sput-object v0, La/kul0;->s:La/mfn;

    .line 32
    .line 33
    new-instance v0, La/mfn;

    .line 34
    .line 35
    const/4 v1, 0x5

    .line 36
    invoke-direct {v0, v1}, La/mfn;-><init>(B)V

    .line 37
    .line 38
    .line 39
    sput-object v0, La/kul0;->t:La/mfn;

    .line 40
    .line 41
    new-instance v0, La/mfn;

    .line 42
    .line 43
    const/4 v1, 0x0

    .line 44
    invoke-direct {v0, v1}, La/mfn;-><init>(B)V

    .line 45
    .line 46
    .line 47
    sput-object v0, La/kul0;->u:La/mfn;

    .line 48
    .line 49
    return-void
.end method

.method public constructor <init>(La/hgn;)V
    .locals 4

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 102
    iput v0, p0, La/kul0;->a:F

    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 103
    iput v0, p0, La/kul0;->b:F

    const/4 v1, 0x0

    .line 104
    iput-boolean v1, p0, La/kul0;->c:Z

    .line 105
    iput-boolean v1, p0, La/kul0;->f:Z

    .line 106
    iput v0, p0, La/kul0;->g:F

    const v2, -0x800001

    .line 107
    iput v2, p0, La/kul0;->h:F

    const-wide/16 v2, 0x0

    .line 108
    iput-wide v2, p0, La/kul0;->i:J

    .line 109
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, La/kul0;->k:Ljava/util/ArrayList;

    .line 110
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, La/kul0;->l:Ljava/util/ArrayList;

    const/4 v2, 0x0

    .line 111
    iput-object v2, p0, La/kul0;->d:Ljava/lang/Object;

    .line 112
    new-instance v3, La/nfn;

    invoke-direct {v3, p1}, La/nfn;-><init>(La/hgn;)V

    iput-object v3, p0, La/kul0;->e:La/zjb;

    const/high16 p1, 0x3f800000    # 1.0f

    .line 113
    iput p1, p0, La/kul0;->j:F

    .line 114
    iput-object v2, p0, La/kul0;->m:La/lul0;

    .line 115
    iput v0, p0, La/kul0;->n:F

    .line 116
    iput-boolean v1, p0, La/kul0;->o:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;La/zjb;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, La/kul0;->a:F

    .line 6
    .line 7
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 8
    .line 9
    .line 10
    iput v0, p0, La/kul0;->b:F

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iput-boolean v1, p0, La/kul0;->c:Z

    .line 14
    .line 15
    iput-boolean v1, p0, La/kul0;->f:Z

    .line 16
    .line 17
    iput v0, p0, La/kul0;->g:F

    .line 18
    .line 19
    const v2, -0x800001

    .line 20
    .line 21
    .line 22
    iput v2, p0, La/kul0;->h:F

    .line 23
    .line 24
    const-wide/16 v2, 0x0

    .line 25
    .line 26
    iput-wide v2, p0, La/kul0;->i:J

    .line 27
    .line 28
    new-instance v2, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v2, p0, La/kul0;->k:Ljava/util/ArrayList;

    .line 34
    .line 35
    new-instance v2, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v2, p0, La/kul0;->l:Ljava/util/ArrayList;

    .line 41
    .line 42
    iput-object p1, p0, La/kul0;->d:Ljava/lang/Object;

    .line 43
    .line 44
    iput-object p2, p0, La/kul0;->e:La/zjb;

    .line 45
    .line 46
    sget-object p1, La/kul0;->r:La/mfn;

    .line 47
    .line 48
    if-eq p2, p1, :cond_4

    .line 49
    .line 50
    sget-object p1, La/kul0;->s:La/mfn;

    .line 51
    .line 52
    if-eq p2, p1, :cond_4

    .line 53
    .line 54
    sget-object p1, La/kul0;->t:La/mfn;

    .line 55
    .line 56
    if-ne p2, p1, :cond_0

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_0
    sget-object p1, La/kul0;->u:La/mfn;

    .line 60
    .line 61
    if-ne p2, p1, :cond_1

    .line 62
    .line 63
    const/high16 p1, 0x3b800000    # 0.00390625f

    .line 64
    .line 65
    iput p1, p0, La/kul0;->j:F

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_1
    sget-object p1, La/kul0;->p:La/mfn;

    .line 69
    .line 70
    if-eq p2, p1, :cond_3

    .line 71
    .line 72
    sget-object p1, La/kul0;->q:La/mfn;

    .line 73
    .line 74
    if-ne p2, p1, :cond_2

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    const/high16 p1, 0x3f800000    # 1.0f

    .line 78
    .line 79
    iput p1, p0, La/kul0;->j:F

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    :goto_0
    const p1, 0x3b03126f    # 0.002f

    .line 83
    .line 84
    .line 85
    iput p1, p0, La/kul0;->j:F

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    :goto_1
    const p1, 0x3dcccccd    # 0.1f

    .line 89
    .line 90
    .line 91
    iput p1, p0, La/kul0;->j:F

    .line 92
    .line 93
    :goto_2
    const/4 p1, 0x0

    .line 94
    iput-object p1, p0, La/kul0;->m:La/lul0;

    .line 95
    .line 96
    iput v0, p0, La/kul0;->n:F

    .line 97
    .line 98
    iput-boolean v1, p0, La/kul0;->o:Z

    .line 99
    .line 100
    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 6

    .line 1
    iget-boolean v0, p0, La/kul0;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iput p1, p0, La/kul0;->n:F

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, La/kul0;->m:La/lul0;

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    new-instance v0, La/lul0;

    .line 13
    .line 14
    invoke-direct {v0, p1}, La/lul0;-><init>(F)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, La/kul0;->m:La/lul0;

    .line 18
    .line 19
    :cond_1
    float-to-double v1, p1

    .line 20
    iput-wide v1, v0, La/lul0;->i:D

    .line 21
    .line 22
    double-to-float p1, v1

    .line 23
    float-to-double v1, p1

    .line 24
    iget p1, p0, La/kul0;->g:F

    .line 25
    .line 26
    float-to-double v3, p1

    .line 27
    cmpl-double v3, v1, v3

    .line 28
    .line 29
    if-gtz v3, :cond_9

    .line 30
    .line 31
    iget v3, p0, La/kul0;->h:F

    .line 32
    .line 33
    float-to-double v4, v3

    .line 34
    cmpg-double v1, v1, v4

    .line 35
    .line 36
    if-ltz v1, :cond_8

    .line 37
    .line 38
    iget v1, p0, La/kul0;->j:F

    .line 39
    .line 40
    const/high16 v2, 0x3f400000    # 0.75f

    .line 41
    .line 42
    mul-float/2addr v1, v2

    .line 43
    float-to-double v1, v1

    .line 44
    invoke-static {v1, v2}, Ljava/lang/Math;->abs(D)D

    .line 45
    .line 46
    .line 47
    move-result-wide v1

    .line 48
    iput-wide v1, v0, La/lul0;->d:D

    .line 49
    .line 50
    const-wide v4, 0x404f400000000000L    # 62.5

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    mul-double/2addr v1, v4

    .line 56
    iput-wide v1, v0, La/lul0;->e:D

    .line 57
    .line 58
    invoke-static {}, La/e73;->a()La/e73;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iget-object v0, v0, La/e73;->e:La/xex;

    .line 63
    .line 64
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    iget-object v0, v0, La/xex;->b:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Landroid/os/Looper;

    .line 71
    .line 72
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    if-ne v1, v0, :cond_7

    .line 77
    .line 78
    iget-boolean v0, p0, La/kul0;->f:Z

    .line 79
    .line 80
    if-nez v0, :cond_6

    .line 81
    .line 82
    if-nez v0, :cond_6

    .line 83
    .line 84
    const/4 v0, 0x1

    .line 85
    iput-boolean v0, p0, La/kul0;->f:Z

    .line 86
    .line 87
    iget-boolean v0, p0, La/kul0;->c:Z

    .line 88
    .line 89
    if-nez v0, :cond_2

    .line 90
    .line 91
    iget-object v0, p0, La/kul0;->e:La/zjb;

    .line 92
    .line 93
    iget-object v1, p0, La/kul0;->d:Ljava/lang/Object;

    .line 94
    .line 95
    invoke-virtual {v0, v1}, La/zjb;->I(Ljava/lang/Object;)F

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    iput v0, p0, La/kul0;->b:F

    .line 100
    .line 101
    :cond_2
    iget v0, p0, La/kul0;->b:F

    .line 102
    .line 103
    cmpl-float p1, v0, p1

    .line 104
    .line 105
    if-gtz p1, :cond_5

    .line 106
    .line 107
    cmpg-float p1, v0, v3

    .line 108
    .line 109
    if-ltz p1, :cond_5

    .line 110
    .line 111
    invoke-static {}, La/e73;->a()La/e73;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    iget-object v0, p1, La/e73;->b:Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    if-nez v1, :cond_4

    .line 122
    .line 123
    iget-object v1, p1, La/e73;->e:La/xex;

    .line 124
    .line 125
    iget-object v2, p1, La/e73;->d:La/w1;

    .line 126
    .line 127
    iget-object v1, v1, La/xex;->a:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v1, Landroid/view/Choreographer;

    .line 130
    .line 131
    new-instance v3, La/d73;

    .line 132
    .line 133
    const/4 v4, 0x0

    .line 134
    invoke-direct {v3, v2, v4}, La/d73;-><init>(Ljava/lang/Runnable;B)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, v3}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 138
    .line 139
    .line 140
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 141
    .line 142
    const/16 v2, 0x21

    .line 143
    .line 144
    if-lt v1, v2, :cond_4

    .line 145
    .line 146
    invoke-static {}, La/c7;->a()F

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    iput v1, p1, La/e73;->g:F

    .line 151
    .line 152
    iget-object v1, p1, La/e73;->h:La/c5k;

    .line 153
    .line 154
    if-nez v1, :cond_3

    .line 155
    .line 156
    new-instance v1, La/c5k;

    .line 157
    .line 158
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 159
    .line 160
    .line 161
    iput-object p1, v1, La/c5k;->b:Ljava/lang/Object;

    .line 162
    .line 163
    iput-object v1, p1, La/e73;->h:La/c5k;

    .line 164
    .line 165
    :cond_3
    iget-object p1, v1, La/c5k;->a:Ljava/lang/Object;

    .line 166
    .line 167
    check-cast p1, La/c73;

    .line 168
    .line 169
    if-nez p1, :cond_4

    .line 170
    .line 171
    new-instance p1, La/c73;

    .line 172
    .line 173
    invoke-direct {p1, v1}, La/c73;-><init>(La/c5k;)V

    .line 174
    .line 175
    .line 176
    iput-object p1, v1, La/c5k;->a:Ljava/lang/Object;

    .line 177
    .line 178
    invoke-static {p1}, La/c7;->v(La/c73;)Z

    .line 179
    .line 180
    .line 181
    :cond_4
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result p1

    .line 185
    if-nez p1, :cond_6

    .line 186
    .line 187
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :cond_5
    const-string p0, "Starting value need to be in between min value and max value"

    .line 192
    .line 193
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    :cond_6
    return-void

    .line 197
    :cond_7
    new-instance p0, Landroid/util/AndroidRuntimeException;

    .line 198
    .line 199
    const-string p1, "Animations may only be started on the same thread as the animation handler"

    .line 200
    .line 201
    invoke-direct {p0, p1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    throw p0

    .line 205
    :cond_8
    const-string p0, "Final position of the spring cannot be less than the min value."

    .line 206
    .line 207
    invoke-static {p0}, La/v4i0;->p(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    return-void

    .line 211
    :cond_9
    const-string p0, "Final position of the spring cannot be greater than the max value."

    .line 212
    .line 213
    invoke-static {p0}, La/v4i0;->p(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    return-void
.end method

.method public final b(F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, p1, v0

    .line 3
    .line 4
    if-lez v0, :cond_0

    .line 5
    .line 6
    iput p1, p0, La/kul0;->j:F

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-string p0, "Minimum visible change must be positive."

    .line 10
    .line 11
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final c(F)V
    .locals 2

    .line 1
    iget-object v0, p0, La/kul0;->e:La/zjb;

    .line 2
    .line 3
    iget-object v1, p0, La/kul0;->d:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, La/zjb;->M(Ljava/lang/Object;F)V

    .line 6
    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    :goto_0
    iget-object v0, p0, La/kul0;->l:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-ge p1, v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, La/ofn;

    .line 28
    .line 29
    iget v1, p0, La/kul0;->b:F

    .line 30
    .line 31
    invoke-interface {v0, v1}, La/ofn;->h(F)V

    .line 32
    .line 33
    .line 34
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    add-int/lit8 p0, p0, -0x1

    .line 42
    .line 43
    :goto_1
    if-ltz p0, :cond_3

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-nez p1, :cond_2

    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    :cond_2
    add-int/lit8 p0, p0, -0x1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    return-void
.end method

.method public final d()V
    .locals 4

    .line 1
    iget-object v0, p0, La/kul0;->m:La/lul0;

    .line 2
    .line 3
    iget-wide v0, v0, La/lul0;->b:D

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    cmpl-double v0, v0, v2

    .line 8
    .line 9
    if-lez v0, :cond_2

    .line 10
    .line 11
    invoke-static {}, La/e73;->a()La/e73;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v0, v0, La/e73;->e:La/xex;

    .line 16
    .line 17
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v0, v0, La/xex;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Landroid/os/Looper;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-ne v1, v0, :cond_1

    .line 30
    .line 31
    iget-boolean v0, p0, La/kul0;->f:Z

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    iput-boolean v0, p0, La/kul0;->o:Z

    .line 37
    .line 38
    :cond_0
    return-void

    .line 39
    :cond_1
    new-instance p0, Landroid/util/AndroidRuntimeException;

    .line 40
    .line 41
    const-string v0, "Animations may only be started on the same thread as the animation handler"

    .line 42
    .line 43
    invoke-direct {p0, v0}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p0

    .line 47
    :cond_2
    const-string p0, "Spring animations can only come to an end when there is damping"

    .line 48
    .line 49
    invoke-static {p0}, La/v4i0;->p(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method
