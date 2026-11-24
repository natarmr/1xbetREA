.class public final La/ybw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/iq00;
.implements La/lq00;
.implements La/hgi0;
.implements La/huo;
.implements La/gxg0;


# static fields
.field public static final A1:Ljava/util/Set;


# instance fields
.field public A:I

.field public B:I

.field public Y:Z

.field public Z:Z

.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:La/jru;

.field public final d:La/waw;

.field public final e:La/lhf0;

.field public final f:Landroidx/media3/common/b;

.field public f1:I

.field public final g:La/cil;

.field public g1:Landroidx/media3/common/b;

.field public final h:La/zhl;

.field public h1:Landroidx/media3/common/b;

.field public final i:La/x860;

.field public i1:Z

.field public final j:La/lhf0;

.field public j1:La/dcs0;

.field public final k:La/zhl;

.field public k1:Ljava/util/Set;

.field public final l:Z

.field public l1:[I

.field public final m:La/cgx0;

.field public m1:I

.field public final n:Ljava/util/ArrayList;

.field public n1:Z

.field public final o:Ljava/util/List;

.field public o1:[Z

.field public final p:La/vbw;

.field public p1:[Z

.field public final q:La/vbw;

.field public q1:J

.field public final r:Landroid/os/Handler;

.field public r1:J

.field public final s:Ljava/util/ArrayList;

.field public s1:Z

.field public final t:Ljava/util/Map;

.field public t1:Z

.field public u:La/yic;

.field public u1:Z

.field public v:[La/xbw;

.field public v1:J

.field public w:[I

.field public w1:Z

.field public final x:Ljava/util/HashSet;

.field public x1:J

.field public final y:Landroid/util/SparseIntArray;

.field public y1:Landroidx/media3/common/DrmInitData;

.field public z:La/wbw;

.field public z1:La/yaw;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const/4 v2, 0x2

    .line 9
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v3, 0x5

    .line 14
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    filled-new-array {v1, v2, v3}, [Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, La/ybw;->A1:Ljava/util/Set;

    .line 34
    .line 35
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILa/jru;La/waw;Ljava/util/Map;La/lhf0;JLandroidx/media3/common/b;La/cil;La/zhl;La/x860;La/zhl;ILa/gff0;)V
    .locals 1

    .line 1
    move-object/from16 v0, p15

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, La/ybw;->a:Ljava/lang/String;

    .line 7
    .line 8
    iput p2, p0, La/ybw;->b:I

    .line 9
    .line 10
    iput-object p3, p0, La/ybw;->c:La/jru;

    .line 11
    .line 12
    iput-object p4, p0, La/ybw;->d:La/waw;

    .line 13
    .line 14
    iput-object p5, p0, La/ybw;->t:Ljava/util/Map;

    .line 15
    .line 16
    iput-object p6, p0, La/ybw;->e:La/lhf0;

    .line 17
    .line 18
    iput-object p9, p0, La/ybw;->f:Landroidx/media3/common/b;

    .line 19
    .line 20
    iput-object p10, p0, La/ybw;->g:La/cil;

    .line 21
    .line 22
    iput-object p11, p0, La/ybw;->h:La/zhl;

    .line 23
    .line 24
    iput-object p12, p0, La/ybw;->i:La/x860;

    .line 25
    .line 26
    move-object p1, p13

    .line 27
    iput-object p1, p0, La/ybw;->k:La/zhl;

    .line 28
    .line 29
    move p1, p14

    .line 30
    iput-boolean p1, p0, La/ybw;->l:Z

    .line 31
    .line 32
    const/4 p1, 0x1

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    new-instance p2, La/lhf0;

    .line 36
    .line 37
    invoke-direct {p2, v0}, La/lhf0;-><init>(La/gff0;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    new-instance p2, La/lhf0;

    .line 42
    .line 43
    const-string p3, "Loader:HlsSampleStreamWrapper"

    .line 44
    .line 45
    invoke-direct {p2, p3, p1}, La/lhf0;-><init>(Ljava/lang/String;B)V

    .line 46
    .line 47
    .line 48
    :goto_0
    iput-object p2, p0, La/ybw;->j:La/lhf0;

    .line 49
    .line 50
    new-instance p2, La/cgx0;

    .line 51
    .line 52
    const/16 p3, 0x9

    .line 53
    .line 54
    const/4 p4, 0x0

    .line 55
    invoke-direct {p2, p3, p4}, La/cgx0;-><init>(BZ)V

    .line 56
    .line 57
    .line 58
    const/4 p3, 0x0

    .line 59
    iput-object p3, p2, La/cgx0;->c:Ljava/lang/Object;

    .line 60
    .line 61
    iput-boolean p4, p2, La/cgx0;->b:Z

    .line 62
    .line 63
    iput-object p3, p2, La/cgx0;->d:Ljava/lang/Object;

    .line 64
    .line 65
    iput-object p2, p0, La/ybw;->m:La/cgx0;

    .line 66
    .line 67
    new-array p2, p4, [I

    .line 68
    .line 69
    iput-object p2, p0, La/ybw;->w:[I

    .line 70
    .line 71
    new-instance p2, Ljava/util/HashSet;

    .line 72
    .line 73
    sget-object p5, La/ybw;->A1:Ljava/util/Set;

    .line 74
    .line 75
    invoke-interface {p5}, Ljava/util/Set;->size()I

    .line 76
    .line 77
    .line 78
    move-result p6

    .line 79
    invoke-direct {p2, p6}, Ljava/util/HashSet;-><init>(I)V

    .line 80
    .line 81
    .line 82
    iput-object p2, p0, La/ybw;->x:Ljava/util/HashSet;

    .line 83
    .line 84
    new-instance p2, Landroid/util/SparseIntArray;

    .line 85
    .line 86
    invoke-interface {p5}, Ljava/util/Set;->size()I

    .line 87
    .line 88
    .line 89
    move-result p5

    .line 90
    invoke-direct {p2, p5}, Landroid/util/SparseIntArray;-><init>(I)V

    .line 91
    .line 92
    .line 93
    iput-object p2, p0, La/ybw;->y:Landroid/util/SparseIntArray;

    .line 94
    .line 95
    new-array p2, p4, [La/xbw;

    .line 96
    .line 97
    iput-object p2, p0, La/ybw;->v:[La/xbw;

    .line 98
    .line 99
    new-array p2, p4, [Z

    .line 100
    .line 101
    iput-object p2, p0, La/ybw;->p1:[Z

    .line 102
    .line 103
    new-array p2, p4, [Z

    .line 104
    .line 105
    iput-object p2, p0, La/ybw;->o1:[Z

    .line 106
    .line 107
    new-instance p2, Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 110
    .line 111
    .line 112
    iput-object p2, p0, La/ybw;->n:Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-static {p2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    iput-object p2, p0, La/ybw;->o:Ljava/util/List;

    .line 119
    .line 120
    new-instance p2, Ljava/util/ArrayList;

    .line 121
    .line 122
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 123
    .line 124
    .line 125
    iput-object p2, p0, La/ybw;->s:Ljava/util/ArrayList;

    .line 126
    .line 127
    new-instance p2, La/vbw;

    .line 128
    .line 129
    invoke-direct {p2, p0, p4}, La/vbw;-><init>(La/ybw;B)V

    .line 130
    .line 131
    .line 132
    iput-object p2, p0, La/ybw;->p:La/vbw;

    .line 133
    .line 134
    new-instance p2, La/vbw;

    .line 135
    .line 136
    invoke-direct {p2, p0, p1}, La/vbw;-><init>(La/ybw;B)V

    .line 137
    .line 138
    .line 139
    iput-object p2, p0, La/ybw;->q:La/vbw;

    .line 140
    .line 141
    invoke-static {p3}, La/vtt0;->n(La/wm30;)Landroid/os/Handler;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    iput-object p1, p0, La/ybw;->r:Landroid/os/Handler;

    .line 146
    .line 147
    iput-wide p7, p0, La/ybw;->q1:J

    .line 148
    .line 149
    iput-wide p7, p0, La/ybw;->r1:J

    .line 150
    .line 151
    const-wide/high16 p1, -0x8000000000000000L

    .line 152
    .line 153
    iput-wide p1, p0, La/ybw;->v1:J

    .line 154
    .line 155
    return-void
.end method

.method public static B(Landroidx/media3/common/b;Landroidx/media3/common/b;Z)Landroidx/media3/common/b;
    .locals 7

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-object p1

    .line 4
    :cond_0
    iget-object v0, p0, Landroidx/media3/common/b;->l:Ljava/lang/String;

    .line 5
    .line 6
    iget-object v1, p1, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 7
    .line 8
    invoke-static {v1}, La/mg40;->h(Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    invoke-static {v2, v0}, La/vtt0;->r(ILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    const/4 v4, 0x1

    .line 17
    if-ne v3, v4, :cond_1

    .line 18
    .line 19
    invoke-static {v2, v0}, La/vtt0;->s(ILjava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, La/mg40;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-static {v0, v1}, La/mg40;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :goto_0
    invoke-virtual {p1}, Landroidx/media3/common/b;->a()La/awq;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    iget-object v5, p0, Landroidx/media3/common/b;->a:Ljava/lang/String;

    .line 37
    .line 38
    iput-object v5, v3, La/awq;->a:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v5, p0, Landroidx/media3/common/b;->b:Ljava/lang/String;

    .line 41
    .line 42
    iput-object v5, v3, La/awq;->b:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v5, p0, Landroidx/media3/common/b;->c:La/b4x;

    .line 45
    .line 46
    invoke-static {v5}, La/b4x;->o(Ljava/util/Collection;)La/b4x;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    iput-object v5, v3, La/awq;->c:La/b4x;

    .line 51
    .line 52
    iget-object v5, p0, Landroidx/media3/common/b;->d:Ljava/lang/String;

    .line 53
    .line 54
    iput-object v5, v3, La/awq;->d:Ljava/lang/String;

    .line 55
    .line 56
    iget v5, p0, Landroidx/media3/common/b;->e:I

    .line 57
    .line 58
    iput v5, v3, La/awq;->e:I

    .line 59
    .line 60
    iget v5, p0, Landroidx/media3/common/b;->f:I

    .line 61
    .line 62
    iput v5, v3, La/awq;->f:I

    .line 63
    .line 64
    const/4 v5, -0x1

    .line 65
    if-eqz p2, :cond_2

    .line 66
    .line 67
    iget v6, p0, Landroidx/media3/common/b;->i:I

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    move v6, v5

    .line 71
    :goto_1
    iput v6, v3, La/awq;->i:I

    .line 72
    .line 73
    if-eqz p2, :cond_3

    .line 74
    .line 75
    iget p2, p0, Landroidx/media3/common/b;->j:I

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    move p2, v5

    .line 79
    :goto_2
    iput p2, v3, La/awq;->j:I

    .line 80
    .line 81
    iput-object v0, v3, La/awq;->k:Ljava/lang/String;

    .line 82
    .line 83
    const/4 p2, 0x2

    .line 84
    if-ne v2, p2, :cond_4

    .line 85
    .line 86
    iget p2, p0, Landroidx/media3/common/b;->w:I

    .line 87
    .line 88
    iput p2, v3, La/awq;->v:I

    .line 89
    .line 90
    iget p2, p0, Landroidx/media3/common/b;->x:I

    .line 91
    .line 92
    iput p2, v3, La/awq;->w:I

    .line 93
    .line 94
    iget p2, p0, Landroidx/media3/common/b;->B:F

    .line 95
    .line 96
    invoke-virtual {v3, p2}, La/awq;->a(F)V

    .line 97
    .line 98
    .line 99
    :cond_4
    if-eqz v1, :cond_5

    .line 100
    .line 101
    invoke-static {v1}, La/mg40;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    iput-object p2, v3, La/awq;->o:Ljava/lang/String;

    .line 106
    .line 107
    :cond_5
    iget p2, p0, Landroidx/media3/common/b;->J:I

    .line 108
    .line 109
    if-eq p2, v5, :cond_6

    .line 110
    .line 111
    if-ne v2, v4, :cond_6

    .line 112
    .line 113
    iput p2, v3, La/awq;->I:I

    .line 114
    .line 115
    :cond_6
    iget-object p0, p0, Landroidx/media3/common/b;->m:La/ed40;

    .line 116
    .line 117
    if-eqz p0, :cond_8

    .line 118
    .line 119
    iget-object p1, p1, Landroidx/media3/common/b;->m:La/ed40;

    .line 120
    .line 121
    if-eqz p1, :cond_7

    .line 122
    .line 123
    invoke-virtual {p1, p0}, La/ed40;->b(La/ed40;)La/ed40;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    :cond_7
    iput-object p0, v3, La/awq;->l:La/ed40;

    .line 128
    .line 129
    :cond_8
    new-instance p0, Landroidx/media3/common/b;

    .line 130
    .line 131
    invoke-direct {p0, v3}, Landroidx/media3/common/b;-><init>(La/awq;)V

    .line 132
    .line 133
    .line 134
    return-object p0
.end method

.method public static E(I)I
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eq p0, v1, :cond_2

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    if-eq p0, v0, :cond_1

    .line 7
    .line 8
    if-eq p0, v2, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_0
    return v1

    .line 13
    :cond_1
    return v2

    .line 14
    :cond_2
    return v0
.end method

.method public static z(II)La/pnk;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Unmapped track with id "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string p0, " of type "

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const-string p1, "HlsSampleStreamWrapper"

    .line 24
    .line 25
    invoke-static {p1, p0}, La/f1t0;->g0(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    new-instance p0, La/pnk;

    .line 29
    .line 30
    invoke-direct {p0}, La/pnk;-><init>()V

    .line 31
    .line 32
    .line 33
    return-object p0
.end method


# virtual methods
.method public final A([La/ccs0;)La/dcs0;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    array-length v2, p1

    .line 4
    if-ge v1, v2, :cond_1

    .line 5
    .line 6
    aget-object v2, p1, v1

    .line 7
    .line 8
    iget v3, v2, La/ccs0;->a:I

    .line 9
    .line 10
    new-array v3, v3, [Landroidx/media3/common/b;

    .line 11
    .line 12
    move v4, v0

    .line 13
    :goto_1
    iget v5, v2, La/ccs0;->a:I

    .line 14
    .line 15
    if-ge v4, v5, :cond_0

    .line 16
    .line 17
    iget-object v5, v2, La/ccs0;->d:[Landroidx/media3/common/b;

    .line 18
    .line 19
    aget-object v5, v5, v4

    .line 20
    .line 21
    iget-object v6, p0, La/ybw;->g:La/cil;

    .line 22
    .line 23
    invoke-interface {v6, v5}, La/cil;->d(Landroidx/media3/common/b;)I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    invoke-virtual {v5}, Landroidx/media3/common/b;->a()La/awq;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    iput v6, v5, La/awq;->S:I

    .line 32
    .line 33
    new-instance v6, Landroidx/media3/common/b;

    .line 34
    .line 35
    invoke-direct {v6, v5}, Landroidx/media3/common/b;-><init>(La/awq;)V

    .line 36
    .line 37
    .line 38
    aput-object v6, v3, v4

    .line 39
    .line 40
    add-int/lit8 v4, v4, 0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_0
    new-instance v4, La/ccs0;

    .line 44
    .line 45
    iget-object v2, v2, La/ccs0;->b:Ljava/lang/String;

    .line 46
    .line 47
    invoke-direct {v4, v2, v3}, La/ccs0;-><init>(Ljava/lang/String;[Landroidx/media3/common/b;)V

    .line 48
    .line 49
    .line 50
    aput-object v4, p1, v1

    .line 51
    .line 52
    add-int/lit8 v1, v1, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    new-instance p0, La/dcs0;

    .line 56
    .line 57
    invoke-direct {p0, p1}, La/dcs0;-><init>([La/ccs0;)V

    .line 58
    .line 59
    .line 60
    return-object p0
.end method

.method public final C(I)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/ybw;->n:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v2, v0, La/ybw;->j:La/lhf0;

    .line 6
    .line 7
    invoke-virtual {v2}, La/lhf0;->C()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x1

    .line 12
    xor-int/2addr v2, v3

    .line 13
    invoke-static {v2}, La/x0x;->K(Z)V

    .line 14
    .line 15
    .line 16
    move/from16 v2, p1

    .line 17
    .line 18
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const/4 v5, -0x1

    .line 23
    if-ge v2, v4, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0, v2}, La/ybw;->y(I)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move v2, v5

    .line 36
    :goto_1
    if-ne v2, v5, :cond_2

    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    invoke-virtual {v0}, La/ybw;->D()La/yaw;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    iget-wide v4, v4, La/yic;->h:J

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    check-cast v6, La/yaw;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    sget-object v8, La/vtt0;->a:Ljava/lang/String;

    .line 56
    .line 57
    if-ltz v2, :cond_14

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    if-gt v7, v8, :cond_14

    .line 64
    .line 65
    if-gt v2, v7, :cond_14

    .line 66
    .line 67
    if-eq v2, v7, :cond_3

    .line 68
    .line 69
    invoke-virtual {v1, v2, v7}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-interface {v2}, Ljava/util/List;->clear()V

    .line 74
    .line 75
    .line 76
    :cond_3
    const/4 v7, 0x0

    .line 77
    :goto_2
    iget-object v8, v0, La/ybw;->v:[La/xbw;

    .line 78
    .line 79
    array-length v8, v8

    .line 80
    if-ge v7, v8, :cond_12

    .line 81
    .line 82
    invoke-virtual {v6, v7}, La/yaw;->e(I)I

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    iget-object v9, v0, La/ybw;->v:[La/xbw;

    .line 87
    .line 88
    aget-object v9, v9, v7

    .line 89
    .line 90
    iget-object v10, v9, La/hxg0;->a:La/exg0;

    .line 91
    .line 92
    invoke-virtual {v9, v8}, La/hxg0;->k(I)J

    .line 93
    .line 94
    .line 95
    move-result-wide v8

    .line 96
    iget v11, v10, La/exg0;->b:I

    .line 97
    .line 98
    iget-wide v12, v10, La/exg0;->g:J

    .line 99
    .line 100
    cmp-long v12, v8, v12

    .line 101
    .line 102
    if-gtz v12, :cond_4

    .line 103
    .line 104
    move v12, v3

    .line 105
    goto :goto_3

    .line 106
    :cond_4
    const/4 v12, 0x0

    .line 107
    :goto_3
    invoke-static {v12}, La/x0x;->A(Z)V

    .line 108
    .line 109
    .line 110
    iput-wide v8, v10, La/exg0;->g:J

    .line 111
    .line 112
    const-wide/16 v12, 0x0

    .line 113
    .line 114
    cmp-long v12, v8, v12

    .line 115
    .line 116
    const/4 v13, 0x0

    .line 117
    if-eqz v12, :cond_c

    .line 118
    .line 119
    iget-object v12, v10, La/exg0;->d:La/dr8;

    .line 120
    .line 121
    iget-wide v14, v12, La/dr8;->a:J

    .line 122
    .line 123
    cmp-long v8, v8, v14

    .line 124
    .line 125
    if-nez v8, :cond_5

    .line 126
    .line 127
    goto :goto_8

    .line 128
    :cond_5
    :goto_4
    iget-wide v8, v10, La/exg0;->g:J

    .line 129
    .line 130
    iget-wide v14, v12, La/dr8;->b:J

    .line 131
    .line 132
    cmp-long v8, v8, v14

    .line 133
    .line 134
    iget-object v9, v12, La/dr8;->d:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v9, La/dr8;

    .line 137
    .line 138
    if-lez v8, :cond_6

    .line 139
    .line 140
    move-object v12, v9

    .line 141
    goto :goto_4

    .line 142
    :cond_6
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    iget-object v8, v9, La/dr8;->c:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v8, La/o52;

    .line 148
    .line 149
    if-nez v8, :cond_7

    .line 150
    .line 151
    goto :goto_6

    .line 152
    :cond_7
    iget-object v8, v10, La/exg0;->a:La/lhf0;

    .line 153
    .line 154
    monitor-enter v8

    .line 155
    :try_start_0
    iget-object v14, v8, La/lhf0;->d:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v14, La/xvj;

    .line 158
    .line 159
    iget-object v14, v14, La/xvj;->c:La/hu5;

    .line 160
    .line 161
    invoke-virtual {v14, v9}, La/hu5;->U(La/dr8;)V

    .line 162
    .line 163
    .line 164
    move-object v14, v9

    .line 165
    :cond_8
    :goto_5
    if-eqz v14, :cond_a

    .line 166
    .line 167
    iget-object v15, v14, La/dr8;->c:Ljava/lang/Object;

    .line 168
    .line 169
    check-cast v15, La/o52;

    .line 170
    .line 171
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v8, v15}, La/lhf0;->G(La/o52;)V

    .line 175
    .line 176
    .line 177
    iget-object v14, v14, La/dr8;->d:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v14, La/dr8;

    .line 180
    .line 181
    if-eqz v14, :cond_9

    .line 182
    .line 183
    iget-object v15, v14, La/dr8;->c:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v15, La/o52;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 186
    .line 187
    if-nez v15, :cond_8

    .line 188
    .line 189
    :cond_9
    move-object v14, v13

    .line 190
    goto :goto_5

    .line 191
    :catchall_0
    move-exception v0

    .line 192
    goto :goto_7

    .line 193
    :cond_a
    monitor-exit v8

    .line 194
    iput-object v13, v9, La/dr8;->c:Ljava/lang/Object;

    .line 195
    .line 196
    iput-object v13, v9, La/dr8;->d:Ljava/lang/Object;

    .line 197
    .line 198
    :goto_6
    new-instance v8, La/dr8;

    .line 199
    .line 200
    iget-wide v13, v12, La/dr8;->b:J

    .line 201
    .line 202
    invoke-direct {v8, v13, v14, v11}, La/dr8;-><init>(JI)V

    .line 203
    .line 204
    .line 205
    iput-object v8, v12, La/dr8;->d:Ljava/lang/Object;

    .line 206
    .line 207
    iget-wide v13, v10, La/exg0;->g:J

    .line 208
    .line 209
    iget-wide v2, v12, La/dr8;->b:J

    .line 210
    .line 211
    cmp-long v2, v13, v2

    .line 212
    .line 213
    if-nez v2, :cond_b

    .line 214
    .line 215
    move-object v12, v8

    .line 216
    :cond_b
    iput-object v12, v10, La/exg0;->f:La/dr8;

    .line 217
    .line 218
    iget-object v2, v10, La/exg0;->e:La/dr8;

    .line 219
    .line 220
    if-ne v2, v9, :cond_11

    .line 221
    .line 222
    iput-object v8, v10, La/exg0;->e:La/dr8;

    .line 223
    .line 224
    goto :goto_b

    .line 225
    :goto_7
    :try_start_1
    monitor-exit v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 226
    throw v0

    .line 227
    :cond_c
    :goto_8
    iget-object v2, v10, La/exg0;->d:La/dr8;

    .line 228
    .line 229
    iget-object v3, v2, La/dr8;->c:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v3, La/o52;

    .line 232
    .line 233
    if-nez v3, :cond_d

    .line 234
    .line 235
    goto :goto_a

    .line 236
    :cond_d
    iget-object v3, v10, La/exg0;->a:La/lhf0;

    .line 237
    .line 238
    monitor-enter v3

    .line 239
    :try_start_2
    iget-object v8, v3, La/lhf0;->d:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v8, La/xvj;

    .line 242
    .line 243
    iget-object v8, v8, La/xvj;->c:La/hu5;

    .line 244
    .line 245
    invoke-virtual {v8, v2}, La/hu5;->U(La/dr8;)V

    .line 246
    .line 247
    .line 248
    move-object v8, v2

    .line 249
    :cond_e
    :goto_9
    if-eqz v8, :cond_10

    .line 250
    .line 251
    iget-object v9, v8, La/dr8;->c:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v9, La/o52;

    .line 254
    .line 255
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v3, v9}, La/lhf0;->G(La/o52;)V

    .line 259
    .line 260
    .line 261
    iget-object v8, v8, La/dr8;->d:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v8, La/dr8;

    .line 264
    .line 265
    if-eqz v8, :cond_f

    .line 266
    .line 267
    iget-object v9, v8, La/dr8;->c:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast v9, La/o52;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 270
    .line 271
    if-nez v9, :cond_e

    .line 272
    .line 273
    :cond_f
    move-object v8, v13

    .line 274
    goto :goto_9

    .line 275
    :catchall_1
    move-exception v0

    .line 276
    goto :goto_c

    .line 277
    :cond_10
    monitor-exit v3

    .line 278
    iput-object v13, v2, La/dr8;->c:Ljava/lang/Object;

    .line 279
    .line 280
    iput-object v13, v2, La/dr8;->d:Ljava/lang/Object;

    .line 281
    .line 282
    :goto_a
    new-instance v2, La/dr8;

    .line 283
    .line 284
    iget-wide v8, v10, La/exg0;->g:J

    .line 285
    .line 286
    invoke-direct {v2, v8, v9, v11}, La/dr8;-><init>(JI)V

    .line 287
    .line 288
    .line 289
    iput-object v2, v10, La/exg0;->d:La/dr8;

    .line 290
    .line 291
    iput-object v2, v10, La/exg0;->e:La/dr8;

    .line 292
    .line 293
    iput-object v2, v10, La/exg0;->f:La/dr8;

    .line 294
    .line 295
    :cond_11
    :goto_b
    add-int/lit8 v7, v7, 0x1

    .line 296
    .line 297
    const/4 v3, 0x1

    .line 298
    goto/16 :goto_2

    .line 299
    .line 300
    :goto_c
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 301
    throw v0

    .line 302
    :cond_12
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 303
    .line 304
    .line 305
    move-result v2

    .line 306
    if-eqz v2, :cond_13

    .line 307
    .line 308
    iget-wide v1, v0, La/ybw;->q1:J

    .line 309
    .line 310
    iget-wide v7, v6, La/yic;->g:J

    .line 311
    .line 312
    invoke-static {v1, v2, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 313
    .line 314
    .line 315
    move-result-wide v1

    .line 316
    iput-wide v1, v0, La/ybw;->r1:J

    .line 317
    .line 318
    :goto_d
    const/4 v1, 0x0

    .line 319
    goto :goto_e

    .line 320
    :cond_13
    invoke-static {v1}, La/g8x;->H(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v1

    .line 324
    check-cast v1, La/yaw;

    .line 325
    .line 326
    const/4 v15, 0x1

    .line 327
    iput-boolean v15, v1, La/yaw;->J:Z

    .line 328
    .line 329
    goto :goto_d

    .line 330
    :goto_e
    iput-boolean v1, v0, La/ybw;->u1:Z

    .line 331
    .line 332
    iget-object v1, v0, La/ybw;->k:La/zhl;

    .line 333
    .line 334
    iget v9, v0, La/ybw;->A:I

    .line 335
    .line 336
    iget-wide v2, v6, La/yic;->g:J

    .line 337
    .line 338
    new-instance v7, La/in30;

    .line 339
    .line 340
    invoke-static {v2, v3}, La/vtt0;->Y(J)J

    .line 341
    .line 342
    .line 343
    move-result-wide v13

    .line 344
    invoke-static {v4, v5}, La/vtt0;->Y(J)J

    .line 345
    .line 346
    .line 347
    move-result-wide v15

    .line 348
    const/4 v8, 0x1

    .line 349
    const/4 v10, 0x0

    .line 350
    const/4 v11, 0x3

    .line 351
    const/4 v12, 0x0

    .line 352
    invoke-direct/range {v7 .. v16}, La/in30;-><init>(IILandroidx/media3/common/b;ILjava/lang/Object;JJ)V

    .line 353
    .line 354
    .line 355
    iget-object v0, v1, La/zhl;->b:La/vn30;

    .line 356
    .line 357
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    new-instance v2, La/hi;

    .line 361
    .line 362
    const/16 v3, 0x9

    .line 363
    .line 364
    invoke-direct {v2, v1, v0, v7, v3}, La/hi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v1, v2}, La/zhl;->a(La/rbe;)V

    .line 368
    .line 369
    .line 370
    return-void

    .line 371
    :cond_14
    invoke-static {}, La/e9d0;->o()V

    .line 372
    .line 373
    .line 374
    return-void
.end method

.method public final D()La/yaw;
    .locals 1

    .line 1
    iget-object p0, p0, La/ybw;->n:Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-static {v0, p0}, La/dw9;->l(ILjava/util/ArrayList;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, La/yaw;

    .line 9
    .line 10
    return-object p0
.end method

.method public final F()Z
    .locals 4

    .line 1
    iget-wide v0, p0, La/ybw;->r1:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long p0, v0, v2

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0
.end method

.method public final G()V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, La/ybw;->i1:Z

    .line 4
    .line 5
    if-nez v1, :cond_1a

    .line 6
    .line 7
    iget-object v1, v0, La/ybw;->l1:[I

    .line 8
    .line 9
    if-nez v1, :cond_1a

    .line 10
    .line 11
    iget-boolean v1, v0, La/ybw;->Y:Z

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    goto/16 :goto_12

    .line 16
    .line 17
    :cond_0
    iget-object v1, v0, La/ybw;->v:[La/xbw;

    .line 18
    .line 19
    array-length v2, v1

    .line 20
    const/4 v3, 0x0

    .line 21
    move v4, v3

    .line 22
    :goto_0
    if-ge v4, v2, :cond_2

    .line 23
    .line 24
    aget-object v5, v1, v4

    .line 25
    .line 26
    invoke-virtual {v5}, La/hxg0;->r()Landroidx/media3/common/b;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    if-nez v5, :cond_1

    .line 31
    .line 32
    goto/16 :goto_12

    .line 33
    .line 34
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    iget-object v1, v0, La/ybw;->j1:La/dcs0;

    .line 38
    .line 39
    const/4 v2, 0x3

    .line 40
    const/4 v4, -0x1

    .line 41
    if-eqz v1, :cond_a

    .line 42
    .line 43
    iget v1, v1, La/dcs0;->a:I

    .line 44
    .line 45
    new-array v5, v1, [I

    .line 46
    .line 47
    iput-object v5, v0, La/ybw;->l1:[I

    .line 48
    .line 49
    invoke-static {v5, v4}, Ljava/util/Arrays;->fill([II)V

    .line 50
    .line 51
    .line 52
    move v4, v3

    .line 53
    :goto_1
    if-ge v4, v1, :cond_9

    .line 54
    .line 55
    move v5, v3

    .line 56
    :goto_2
    iget-object v6, v0, La/ybw;->v:[La/xbw;

    .line 57
    .line 58
    array-length v7, v6

    .line 59
    if-ge v5, v7, :cond_8

    .line 60
    .line 61
    aget-object v6, v6, v5

    .line 62
    .line 63
    invoke-virtual {v6}, La/hxg0;->r()Landroidx/media3/common/b;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    iget-object v7, v0, La/ybw;->j1:La/dcs0;

    .line 71
    .line 72
    invoke-virtual {v7, v4}, La/dcs0;->a(I)La/ccs0;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    iget-object v7, v7, La/ccs0;->d:[Landroidx/media3/common/b;

    .line 77
    .line 78
    aget-object v7, v7, v3

    .line 79
    .line 80
    iget-object v8, v6, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 81
    .line 82
    iget-object v9, v7, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {v8}, La/mg40;->h(Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    move-result v10

    .line 88
    if-eq v10, v2, :cond_3

    .line 89
    .line 90
    invoke-static {v9}, La/mg40;->h(Ljava/lang/String;)I

    .line 91
    .line 92
    .line 93
    move-result v6

    .line 94
    if-ne v10, v6, :cond_7

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_3
    invoke-static {v8, v9}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    if-nez v9, :cond_4

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_4
    const-string v9, "application/cea-608"

    .line 105
    .line 106
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    if-nez v9, :cond_5

    .line 111
    .line 112
    const-string v9, "application/cea-708"

    .line 113
    .line 114
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    if-eqz v8, :cond_6

    .line 119
    .line 120
    :cond_5
    iget v6, v6, Landroidx/media3/common/b;->P:I

    .line 121
    .line 122
    iget v7, v7, Landroidx/media3/common/b;->P:I

    .line 123
    .line 124
    if-ne v6, v7, :cond_7

    .line 125
    .line 126
    :cond_6
    :goto_3
    iget-object v6, v0, La/ybw;->l1:[I

    .line 127
    .line 128
    aput v5, v6, v4

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_7
    :goto_4
    add-int/lit8 v5, v5, 0x1

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_8
    :goto_5
    add-int/lit8 v4, v4, 0x1

    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_9
    iget-object v0, v0, La/ybw;->s:Ljava/util/ArrayList;

    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    if-eqz v1, :cond_1a

    .line 148
    .line 149
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    check-cast v1, La/ubw;

    .line 154
    .line 155
    invoke-virtual {v1}, La/ubw;->e()V

    .line 156
    .line 157
    .line 158
    goto :goto_6

    .line 159
    :cond_a
    iget-object v1, v0, La/ybw;->v:[La/xbw;

    .line 160
    .line 161
    array-length v1, v1

    .line 162
    const/4 v5, -0x2

    .line 163
    move v6, v3

    .line 164
    move v8, v4

    .line 165
    move v7, v5

    .line 166
    :goto_7
    const/4 v9, 0x1

    .line 167
    const/4 v10, 0x2

    .line 168
    if-ge v6, v1, :cond_10

    .line 169
    .line 170
    iget-object v11, v0, La/ybw;->v:[La/xbw;

    .line 171
    .line 172
    aget-object v11, v11, v6

    .line 173
    .line 174
    invoke-virtual {v11}, La/hxg0;->r()Landroidx/media3/common/b;

    .line 175
    .line 176
    .line 177
    move-result-object v11

    .line 178
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    iget-object v11, v11, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 182
    .line 183
    invoke-static {v11}, La/mg40;->m(Ljava/lang/String;)Z

    .line 184
    .line 185
    .line 186
    move-result v12

    .line 187
    if-eqz v12, :cond_b

    .line 188
    .line 189
    move v9, v10

    .line 190
    goto :goto_8

    .line 191
    :cond_b
    invoke-static {v11}, La/mg40;->i(Ljava/lang/String;)Z

    .line 192
    .line 193
    .line 194
    move-result v10

    .line 195
    if-eqz v10, :cond_c

    .line 196
    .line 197
    goto :goto_8

    .line 198
    :cond_c
    invoke-static {v11}, La/mg40;->l(Ljava/lang/String;)Z

    .line 199
    .line 200
    .line 201
    move-result v9

    .line 202
    if-eqz v9, :cond_d

    .line 203
    .line 204
    move v9, v2

    .line 205
    goto :goto_8

    .line 206
    :cond_d
    move v9, v5

    .line 207
    :goto_8
    invoke-static {v9}, La/ybw;->E(I)I

    .line 208
    .line 209
    .line 210
    move-result v10

    .line 211
    invoke-static {v7}, La/ybw;->E(I)I

    .line 212
    .line 213
    .line 214
    move-result v11

    .line 215
    if-le v10, v11, :cond_e

    .line 216
    .line 217
    move v8, v6

    .line 218
    move v7, v9

    .line 219
    goto :goto_9

    .line 220
    :cond_e
    if-ne v9, v7, :cond_f

    .line 221
    .line 222
    if-eq v8, v4, :cond_f

    .line 223
    .line 224
    move v8, v4

    .line 225
    :cond_f
    :goto_9
    add-int/lit8 v6, v6, 0x1

    .line 226
    .line 227
    goto :goto_7

    .line 228
    :cond_10
    iget-object v2, v0, La/ybw;->d:La/waw;

    .line 229
    .line 230
    iget-object v2, v2, La/waw;->i:La/ccs0;

    .line 231
    .line 232
    iget v5, v2, La/ccs0;->a:I

    .line 233
    .line 234
    iput v4, v0, La/ybw;->m1:I

    .line 235
    .line 236
    new-array v4, v1, [I

    .line 237
    .line 238
    iput-object v4, v0, La/ybw;->l1:[I

    .line 239
    .line 240
    move v4, v3

    .line 241
    :goto_a
    if-ge v4, v1, :cond_11

    .line 242
    .line 243
    iget-object v6, v0, La/ybw;->l1:[I

    .line 244
    .line 245
    aput v4, v6, v4

    .line 246
    .line 247
    add-int/lit8 v4, v4, 0x1

    .line 248
    .line 249
    goto :goto_a

    .line 250
    :cond_11
    new-array v4, v1, [La/ccs0;

    .line 251
    .line 252
    move v6, v3

    .line 253
    :goto_b
    if-ge v6, v1, :cond_18

    .line 254
    .line 255
    iget-object v11, v0, La/ybw;->v:[La/xbw;

    .line 256
    .line 257
    aget-object v11, v11, v6

    .line 258
    .line 259
    invoke-virtual {v11}, La/hxg0;->r()Landroidx/media3/common/b;

    .line 260
    .line 261
    .line 262
    move-result-object v11

    .line 263
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    iget-object v12, v0, La/ybw;->f:Landroidx/media3/common/b;

    .line 267
    .line 268
    iget-object v13, v0, La/ybw;->a:Ljava/lang/String;

    .line 269
    .line 270
    if-ne v6, v8, :cond_15

    .line 271
    .line 272
    new-array v14, v5, [Landroidx/media3/common/b;

    .line 273
    .line 274
    move v15, v3

    .line 275
    :goto_c
    if-ge v15, v5, :cond_14

    .line 276
    .line 277
    iget-object v3, v2, La/ccs0;->d:[Landroidx/media3/common/b;

    .line 278
    .line 279
    aget-object v3, v3, v15

    .line 280
    .line 281
    if-ne v7, v9, :cond_12

    .line 282
    .line 283
    if-eqz v12, :cond_12

    .line 284
    .line 285
    invoke-virtual {v3, v12}, Landroidx/media3/common/b;->d(Landroidx/media3/common/b;)Landroidx/media3/common/b;

    .line 286
    .line 287
    .line 288
    move-result-object v3

    .line 289
    :cond_12
    if-ne v5, v9, :cond_13

    .line 290
    .line 291
    invoke-virtual {v11, v3}, Landroidx/media3/common/b;->d(Landroidx/media3/common/b;)Landroidx/media3/common/b;

    .line 292
    .line 293
    .line 294
    move-result-object v3

    .line 295
    goto :goto_d

    .line 296
    :cond_13
    invoke-static {v3, v11, v9}, La/ybw;->B(Landroidx/media3/common/b;Landroidx/media3/common/b;Z)Landroidx/media3/common/b;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    :goto_d
    aput-object v3, v14, v15

    .line 301
    .line 302
    add-int/lit8 v15, v15, 0x1

    .line 303
    .line 304
    const/4 v3, 0x0

    .line 305
    goto :goto_c

    .line 306
    :cond_14
    new-instance v3, La/ccs0;

    .line 307
    .line 308
    invoke-direct {v3, v13, v14}, La/ccs0;-><init>(Ljava/lang/String;[Landroidx/media3/common/b;)V

    .line 309
    .line 310
    .line 311
    aput-object v3, v4, v6

    .line 312
    .line 313
    iput v6, v0, La/ybw;->m1:I

    .line 314
    .line 315
    const/4 v14, 0x0

    .line 316
    goto :goto_10

    .line 317
    :cond_15
    if-ne v7, v10, :cond_16

    .line 318
    .line 319
    iget-object v3, v11, Landroidx/media3/common/b;->p:Ljava/lang/String;

    .line 320
    .line 321
    invoke-static {v3}, La/mg40;->i(Ljava/lang/String;)Z

    .line 322
    .line 323
    .line 324
    move-result v3

    .line 325
    if-eqz v3, :cond_16

    .line 326
    .line 327
    goto :goto_e

    .line 328
    :cond_16
    const/4 v12, 0x0

    .line 329
    :goto_e
    const-string v3, ":muxed:"

    .line 330
    .line 331
    invoke-static {v13, v3}, La/brm0;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    move-result-object v3

    .line 335
    if-ge v6, v8, :cond_17

    .line 336
    .line 337
    move v14, v6

    .line 338
    goto :goto_f

    .line 339
    :cond_17
    add-int/lit8 v14, v6, -0x1

    .line 340
    .line 341
    :goto_f
    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v3

    .line 348
    const/4 v14, 0x0

    .line 349
    invoke-static {v12, v11, v14}, La/ybw;->B(Landroidx/media3/common/b;Landroidx/media3/common/b;Z)Landroidx/media3/common/b;

    .line 350
    .line 351
    .line 352
    move-result-object v11

    .line 353
    invoke-virtual {v11}, Landroidx/media3/common/b;->a()La/awq;

    .line 354
    .line 355
    .line 356
    move-result-object v11

    .line 357
    iput-object v13, v11, La/awq;->m:Ljava/lang/String;

    .line 358
    .line 359
    new-instance v12, Landroidx/media3/common/b;

    .line 360
    .line 361
    invoke-direct {v12, v11}, Landroidx/media3/common/b;-><init>(La/awq;)V

    .line 362
    .line 363
    .line 364
    new-instance v11, La/ccs0;

    .line 365
    .line 366
    filled-new-array {v12}, [Landroidx/media3/common/b;

    .line 367
    .line 368
    .line 369
    move-result-object v12

    .line 370
    invoke-direct {v11, v3, v12}, La/ccs0;-><init>(Ljava/lang/String;[Landroidx/media3/common/b;)V

    .line 371
    .line 372
    .line 373
    aput-object v11, v4, v6

    .line 374
    .line 375
    :goto_10
    add-int/lit8 v6, v6, 0x1

    .line 376
    .line 377
    move v3, v14

    .line 378
    goto :goto_b

    .line 379
    :cond_18
    move v14, v3

    .line 380
    invoke-virtual {v0, v4}, La/ybw;->A([La/ccs0;)La/dcs0;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    iput-object v1, v0, La/ybw;->j1:La/dcs0;

    .line 385
    .line 386
    iget-object v1, v0, La/ybw;->k1:Ljava/util/Set;

    .line 387
    .line 388
    if-nez v1, :cond_19

    .line 389
    .line 390
    move v3, v9

    .line 391
    goto :goto_11

    .line 392
    :cond_19
    move v3, v14

    .line 393
    :goto_11
    invoke-static {v3}, La/x0x;->K(Z)V

    .line 394
    .line 395
    .line 396
    sget-object v1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 397
    .line 398
    iput-object v1, v0, La/ybw;->k1:Ljava/util/Set;

    .line 399
    .line 400
    iput-boolean v9, v0, La/ybw;->Z:Z

    .line 401
    .line 402
    iget-object v0, v0, La/ybw;->c:La/jru;

    .line 403
    .line 404
    invoke-virtual {v0}, La/jru;->i()V

    .line 405
    .line 406
    .line 407
    :cond_1a
    :goto_12
    return-void
.end method

.method public final H()V
    .locals 3

    .line 1
    iget-object v0, p0, La/ybw;->j:La/lhf0;

    .line 2
    .line 3
    iget-object v1, v0, La/lhf0;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/io/IOException;

    .line 6
    .line 7
    if-nez v1, :cond_4

    .line 8
    .line 9
    iget-object v0, v0, La/lhf0;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, La/jq00;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget v1, v0, La/jq00;->a:I

    .line 16
    .line 17
    iget-object v2, v0, La/jq00;->e:Ljava/io/IOException;

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    iget v0, v0, La/jq00;->f:I

    .line 22
    .line 23
    if-gt v0, v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    throw v2

    .line 27
    :cond_1
    :goto_0
    iget-object p0, p0, La/ybw;->d:La/waw;

    .line 28
    .line 29
    iget-object v0, p0, La/waw;->o:La/lb6;

    .line 30
    .line 31
    if-nez v0, :cond_3

    .line 32
    .line 33
    iget-object v0, p0, La/waw;->p:Landroid/net/Uri;

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    iget-object v1, p0, La/waw;->q:Landroid/net/Uri;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    iget-object v0, p0, La/waw;->g:La/vuj;

    .line 46
    .line 47
    iget-object p0, p0, La/waw;->p:Landroid/net/Uri;

    .line 48
    .line 49
    invoke-virtual {v0, p0}, La/vuj;->j(Landroid/net/Uri;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    return-void

    .line 53
    :cond_3
    throw v0

    .line 54
    :cond_4
    throw v1
.end method

.method public final varargs I([La/ccs0;[I)V
    .locals 5

    .line 1
    invoke-virtual {p0, p1}, La/ybw;->A([La/ccs0;)La/dcs0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, La/ybw;->j1:La/dcs0;

    .line 6
    .line 7
    new-instance p1, Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, La/ybw;->k1:Ljava/util/Set;

    .line 13
    .line 14
    array-length p1, p2

    .line 15
    const/4 v0, 0x0

    .line 16
    move v1, v0

    .line 17
    :goto_0
    if-ge v1, p1, :cond_0

    .line 18
    .line 19
    aget v2, p2, v1

    .line 20
    .line 21
    iget-object v3, p0, La/ybw;->k1:Ljava/util/Set;

    .line 22
    .line 23
    iget-object v4, p0, La/ybw;->j1:La/dcs0;

    .line 24
    .line 25
    invoke-virtual {v4, v2}, La/dcs0;->a(I)La/ccs0;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iput v0, p0, La/ybw;->m1:I

    .line 36
    .line 37
    new-instance p1, La/wss;

    .line 38
    .line 39
    iget-object p2, p0, La/ybw;->c:La/jru;

    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    invoke-direct {p1, p2, v0}, La/wss;-><init>(Ljava/lang/Object;B)V

    .line 43
    .line 44
    .line 45
    iget-object p2, p0, La/ybw;->r:Landroid/os/Handler;

    .line 46
    .line 47
    invoke-virtual {p2, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 48
    .line 49
    .line 50
    iput-boolean v0, p0, La/ybw;->Z:Z

    .line 51
    .line 52
    return-void
.end method

.method public final J()V
    .locals 6

    .line 1
    iget-object v0, p0, La/ybw;->v:[La/xbw;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v3, v1, :cond_0

    .line 7
    .line 8
    aget-object v4, v0, v3

    .line 9
    .line 10
    iget-boolean v5, p0, La/ybw;->s1:Z

    .line 11
    .line 12
    invoke-virtual {v4, v5}, La/hxg0;->x(Z)V

    .line 13
    .line 14
    .line 15
    add-int/lit8 v3, v3, 0x1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iput-boolean v2, p0, La/ybw;->s1:Z

    .line 19
    .line 20
    return-void
.end method

.method public final K(ZJ)Z
    .locals 11

    .line 1
    iput-wide p2, p0, La/ybw;->q1:J

    .line 2
    .line 3
    invoke-virtual {p0}, La/ybw;->F()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iput-wide p2, p0, La/ybw;->r1:J

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    iget-object v0, p0, La/ybw;->d:La/waw;

    .line 14
    .line 15
    iget-boolean v0, v0, La/waw;->r:Z

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    iget-object v3, p0, La/ybw;->n:Ljava/util/ArrayList;

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    move v0, v4

    .line 24
    :goto_0
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-ge v0, v5, :cond_2

    .line 29
    .line 30
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    check-cast v5, La/yaw;

    .line 35
    .line 36
    iget-wide v6, v5, La/yic;->g:J

    .line 37
    .line 38
    cmp-long v6, v6, p2

    .line 39
    .line 40
    if-nez v6, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move-object v5, v2

    .line 47
    :goto_1
    iget-boolean v0, p0, La/ybw;->Y:Z

    .line 48
    .line 49
    if-eqz v0, :cond_8

    .line 50
    .line 51
    if-nez p1, :cond_8

    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-nez p1, :cond_8

    .line 58
    .line 59
    iget-object p1, p0, La/ybw;->v:[La/xbw;

    .line 60
    .line 61
    array-length p1, p1

    .line 62
    move v0, v4

    .line 63
    :goto_2
    if-ge v0, p1, :cond_7

    .line 64
    .line 65
    iget-object v6, p0, La/ybw;->v:[La/xbw;

    .line 66
    .line 67
    aget-object v6, v6, v0

    .line 68
    .line 69
    if-eqz v5, :cond_3

    .line 70
    .line 71
    invoke-virtual {v5, v0}, La/yaw;->e(I)I

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    invoke-virtual {v6, v7}, La/hxg0;->y(I)Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    goto :goto_5

    .line 80
    :cond_3
    invoke-virtual {p0}, La/ybw;->b()J

    .line 81
    .line 82
    .line 83
    move-result-wide v7

    .line 84
    const-wide/high16 v9, -0x8000000000000000L

    .line 85
    .line 86
    cmp-long v9, v7, v9

    .line 87
    .line 88
    if-eqz v9, :cond_5

    .line 89
    .line 90
    cmp-long v7, p2, v7

    .line 91
    .line 92
    if-gez v7, :cond_4

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_4
    move v7, v4

    .line 96
    goto :goto_4

    .line 97
    :cond_5
    :goto_3
    move v7, v1

    .line 98
    :goto_4
    invoke-virtual {v6, v7, p2, p3}, La/hxg0;->z(ZJ)Z

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    :goto_5
    if-nez v6, :cond_6

    .line 103
    .line 104
    iget-object v6, p0, La/ybw;->p1:[Z

    .line 105
    .line 106
    aget-boolean v6, v6, v0

    .line 107
    .line 108
    if-nez v6, :cond_8

    .line 109
    .line 110
    iget-boolean v6, p0, La/ybw;->n1:Z

    .line 111
    .line 112
    if-nez v6, :cond_6

    .line 113
    .line 114
    goto :goto_6

    .line 115
    :cond_6
    add-int/lit8 v0, v0, 0x1

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_7
    return v4

    .line 119
    :cond_8
    :goto_6
    iput-wide p2, p0, La/ybw;->r1:J

    .line 120
    .line 121
    iput-boolean v4, p0, La/ybw;->u1:Z

    .line 122
    .line 123
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 124
    .line 125
    .line 126
    iget-object p1, p0, La/ybw;->j:La/lhf0;

    .line 127
    .line 128
    invoke-virtual {p1}, La/lhf0;->C()Z

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    if-eqz p2, :cond_a

    .line 133
    .line 134
    iget-boolean p2, p0, La/ybw;->Y:Z

    .line 135
    .line 136
    if-eqz p2, :cond_9

    .line 137
    .line 138
    iget-object p0, p0, La/ybw;->v:[La/xbw;

    .line 139
    .line 140
    array-length p2, p0

    .line 141
    :goto_7
    if-ge v4, p2, :cond_9

    .line 142
    .line 143
    aget-object p3, p0, v4

    .line 144
    .line 145
    invoke-virtual {p3}, La/hxg0;->j()V

    .line 146
    .line 147
    .line 148
    add-int/lit8 v4, v4, 0x1

    .line 149
    .line 150
    goto :goto_7

    .line 151
    :cond_9
    invoke-virtual {p1}, La/lhf0;->a()V

    .line 152
    .line 153
    .line 154
    return v1

    .line 155
    :cond_a
    iput-object v2, p1, La/lhf0;->d:Ljava/lang/Object;

    .line 156
    .line 157
    invoke-virtual {p0}, La/ybw;->J()V

    .line 158
    .line 159
    .line 160
    return v1
.end method

.method public final a(La/kq00;JJI)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/yic;

    .line 6
    .line 7
    new-instance v2, La/vn00;

    .line 8
    .line 9
    iget-wide v3, v1, La/yic;->a:J

    .line 10
    .line 11
    iget-object v5, v1, La/yic;->b:La/mbj;

    .line 12
    .line 13
    move-wide/from16 v6, p2

    .line 14
    .line 15
    invoke-direct/range {v2 .. v7}, La/vn00;-><init>(JLa/mbj;J)V

    .line 16
    .line 17
    .line 18
    if-eqz p6, :cond_0

    .line 19
    .line 20
    iget-object v3, v1, La/yic;->i:La/enm0;

    .line 21
    .line 22
    iget-object v4, v3, La/enm0;->c:Landroid/net/Uri;

    .line 23
    .line 24
    iput-object v4, v2, La/vn00;->f:Ljava/lang/Object;

    .line 25
    .line 26
    iget-object v4, v3, La/enm0;->d:Ljava/util/Map;

    .line 27
    .line 28
    iput-object v4, v2, La/vn00;->g:Ljava/lang/Object;

    .line 29
    .line 30
    move-wide/from16 v4, p4

    .line 31
    .line 32
    iput-wide v4, v2, La/vn00;->c:J

    .line 33
    .line 34
    iget-wide v3, v3, La/enm0;->b:J

    .line 35
    .line 36
    iput-wide v3, v2, La/vn00;->d:J

    .line 37
    .line 38
    :cond_0
    new-instance v6, La/wn00;

    .line 39
    .line 40
    invoke-direct {v6, v2}, La/wn00;-><init>(La/vn00;)V

    .line 41
    .line 42
    .line 43
    iget-byte v7, v1, La/yic;->c:B

    .line 44
    .line 45
    iget-object v9, v1, La/yic;->d:Landroidx/media3/common/b;

    .line 46
    .line 47
    iget v10, v1, La/yic;->e:I

    .line 48
    .line 49
    iget-object v11, v1, La/yic;->f:Ljava/lang/Object;

    .line 50
    .line 51
    iget-wide v12, v1, La/yic;->g:J

    .line 52
    .line 53
    iget-wide v14, v1, La/yic;->h:J

    .line 54
    .line 55
    iget-object v5, v0, La/ybw;->k:La/zhl;

    .line 56
    .line 57
    iget v8, v0, La/ybw;->b:I

    .line 58
    .line 59
    move/from16 v16, p6

    .line 60
    .line 61
    invoke-virtual/range {v5 .. v16}, La/zhl;->f(La/wn00;IILandroidx/media3/common/b;ILjava/lang/Object;JJI)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final b()J
    .locals 2

    .line 1
    invoke-virtual {p0}, La/ybw;->F()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-wide v0, p0, La/ybw;->r1:J

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    iget-boolean v0, p0, La/ybw;->u1:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    const-wide/high16 v0, -0x8000000000000000L

    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_1
    invoke-virtual {p0}, La/ybw;->D()La/yaw;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    iget-wide v0, p0, La/yic;->h:J

    .line 22
    .line 23
    return-wide v0
.end method

.method public final e()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/ybw;->j:La/lhf0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/lhf0;->C()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final f(La/fvh0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final g(La/yq00;)Z
    .locals 69

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/ybw;->n:Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v2, v0, La/ybw;->m:La/cgx0;

    .line 6
    .line 7
    iget-object v3, v0, La/ybw;->j:La/lhf0;

    .line 8
    .line 9
    iget-boolean v4, v0, La/ybw;->u1:Z

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    if-nez v4, :cond_4a

    .line 13
    .line 14
    invoke-virtual {v3}, La/lhf0;->C()Z

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    if-nez v4, :cond_4a

    .line 19
    .line 20
    iget-object v4, v3, La/lhf0;->d:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v4, Ljava/io/IOException;

    .line 23
    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    return v5

    .line 27
    :cond_0
    invoke-virtual {v0}, La/ybw;->F()Z

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    if-eqz v4, :cond_2

    .line 37
    .line 38
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 39
    .line 40
    iget-wide v8, v0, La/ybw;->r1:J

    .line 41
    .line 42
    iget-object v10, v0, La/ybw;->v:[La/xbw;

    .line 43
    .line 44
    array-length v11, v10

    .line 45
    move v12, v5

    .line 46
    :goto_0
    if-ge v12, v11, :cond_1

    .line 47
    .line 48
    aget-object v13, v10, v12

    .line 49
    .line 50
    iget-wide v14, v0, La/ybw;->r1:J

    .line 51
    .line 52
    iput-wide v14, v13, La/hxg0;->t:J

    .line 53
    .line 54
    add-int/lit8 v12, v12, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    move-object v11, v4

    .line 58
    move-wide/from16 v16, v6

    .line 59
    .line 60
    move-wide v13, v8

    .line 61
    move-wide/from16 v27, v13

    .line 62
    .line 63
    goto :goto_5

    .line 64
    :cond_2
    iget-object v4, v0, La/ybw;->o:Ljava/util/List;

    .line 65
    .line 66
    invoke-virtual {v0}, La/ybw;->D()La/yaw;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    iget-boolean v9, v8, La/yaw;->H:Z

    .line 71
    .line 72
    iget-wide v10, v8, La/yic;->g:J

    .line 73
    .line 74
    if-eqz v9, :cond_5

    .line 75
    .line 76
    invoke-virtual {v8}, La/yaw;->f()Z

    .line 77
    .line 78
    .line 79
    move-result v9

    .line 80
    if-nez v9, :cond_3

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_3
    iget-wide v8, v8, La/yaw;->K:J

    .line 84
    .line 85
    cmp-long v12, v8, v6

    .line 86
    .line 87
    if-eqz v12, :cond_4

    .line 88
    .line 89
    add-long/2addr v10, v8

    .line 90
    goto :goto_1

    .line 91
    :cond_4
    move-wide v10, v6

    .line 92
    :goto_1
    move-wide v8, v10

    .line 93
    goto :goto_3

    .line 94
    :cond_5
    :goto_2
    iget-wide v8, v0, La/ybw;->q1:J

    .line 95
    .line 96
    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->max(JJ)J

    .line 97
    .line 98
    .line 99
    move-result-wide v8

    .line 100
    :goto_3
    iget-wide v10, v0, La/ybw;->q1:J

    .line 101
    .line 102
    iget-boolean v12, v0, La/ybw;->Y:Z

    .line 103
    .line 104
    if-eqz v12, :cond_6

    .line 105
    .line 106
    iget-object v12, v0, La/ybw;->v:[La/xbw;

    .line 107
    .line 108
    array-length v13, v12

    .line 109
    move v14, v5

    .line 110
    :goto_4
    if-ge v14, v13, :cond_6

    .line 111
    .line 112
    aget-object v15, v12, v14

    .line 113
    .line 114
    monitor-enter v15

    .line 115
    move-wide/from16 v16, v6

    .line 116
    .line 117
    :try_start_0
    iget-wide v6, v15, La/hxg0;->v:J

    .line 118
    .line 119
    iget v5, v15, La/hxg0;->s:I

    .line 120
    .line 121
    move-object/from16 v19, v4

    .line 122
    .line 123
    invoke-virtual {v15, v5}, La/hxg0;->n(I)J

    .line 124
    .line 125
    .line 126
    move-result-wide v4

    .line 127
    invoke-static {v6, v7, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 128
    .line 129
    .line 130
    move-result-wide v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    monitor-exit v15

    .line 132
    invoke-static {v10, v11, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 133
    .line 134
    .line 135
    move-result-wide v10

    .line 136
    add-int/lit8 v14, v14, 0x1

    .line 137
    .line 138
    move-wide/from16 v6, v16

    .line 139
    .line 140
    move-object/from16 v4, v19

    .line 141
    .line 142
    const/4 v5, 0x0

    .line 143
    goto :goto_4

    .line 144
    :catchall_0
    move-exception v0

    .line 145
    :try_start_1
    monitor-exit v15
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 146
    throw v0

    .line 147
    :cond_6
    move-object/from16 v19, v4

    .line 148
    .line 149
    move-wide/from16 v16, v6

    .line 150
    .line 151
    move-wide v13, v8

    .line 152
    move-wide/from16 v27, v10

    .line 153
    .line 154
    move-object/from16 v11, v19

    .line 155
    .line 156
    :goto_5
    const/4 v15, 0x0

    .line 157
    iput-object v15, v2, La/cgx0;->c:Ljava/lang/Object;

    .line 158
    .line 159
    const/4 v4, 0x0

    .line 160
    iput-boolean v4, v2, La/cgx0;->b:Z

    .line 161
    .line 162
    iput-object v15, v2, La/cgx0;->d:Ljava/lang/Object;

    .line 163
    .line 164
    iget-object v4, v0, La/ybw;->d:La/waw;

    .line 165
    .line 166
    iget-boolean v5, v0, La/ybw;->Z:Z

    .line 167
    .line 168
    if-nez v5, :cond_8

    .line 169
    .line 170
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 171
    .line 172
    .line 173
    move-result v5

    .line 174
    if-nez v5, :cond_7

    .line 175
    .line 176
    goto :goto_6

    .line 177
    :cond_7
    const/16 v29, 0x0

    .line 178
    .line 179
    goto :goto_7

    .line 180
    :cond_8
    :goto_6
    const/16 v29, 0x1

    .line 181
    .line 182
    :goto_7
    iget-object v5, v4, La/waw;->k:La/uyn;

    .line 183
    .line 184
    iget-object v7, v4, La/waw;->e:[La/tbw;

    .line 185
    .line 186
    iget-object v8, v4, La/waw;->g:La/vuj;

    .line 187
    .line 188
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    .line 189
    .line 190
    .line 191
    move-result v9

    .line 192
    if-eqz v9, :cond_9

    .line 193
    .line 194
    move-object v9, v15

    .line 195
    goto :goto_8

    .line 196
    :cond_9
    invoke-static {v11}, La/g8x;->H(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v9

    .line 200
    check-cast v9, La/yaw;

    .line 201
    .line 202
    :goto_8
    if-nez v9, :cond_a

    .line 203
    .line 204
    const/4 v6, -0x1

    .line 205
    :goto_9
    move-object/from16 v12, p1

    .line 206
    .line 207
    move-object/from16 v20, v11

    .line 208
    .line 209
    goto :goto_a

    .line 210
    :cond_a
    iget-object v12, v4, La/waw;->i:La/ccs0;

    .line 211
    .line 212
    iget-object v6, v9, La/yic;->d:Landroidx/media3/common/b;

    .line 213
    .line 214
    invoke-virtual {v12, v6}, La/ccs0;->a(Landroidx/media3/common/b;)I

    .line 215
    .line 216
    .line 217
    move-result v6

    .line 218
    goto :goto_9

    .line 219
    :goto_a
    iget-wide v10, v12, La/yq00;->a:J

    .line 220
    .line 221
    sub-long v22, v13, v10

    .line 222
    .line 223
    move-object v12, v7

    .line 224
    move-object/from16 v24, v8

    .line 225
    .line 226
    iget-wide v7, v4, La/waw;->t:J

    .line 227
    .line 228
    cmp-long v25, v7, v16

    .line 229
    .line 230
    if-eqz v25, :cond_b

    .line 231
    .line 232
    sub-long/2addr v7, v10

    .line 233
    goto :goto_b

    .line 234
    :cond_b
    move-wide/from16 v7, v16

    .line 235
    .line 236
    :goto_b
    if-eqz v9, :cond_d

    .line 237
    .line 238
    iget-boolean v15, v4, La/waw;->r:Z

    .line 239
    .line 240
    if-nez v15, :cond_d

    .line 241
    .line 242
    move-wide/from16 v25, v7

    .line 243
    .line 244
    iget-wide v7, v9, La/yic;->h:J

    .line 245
    .line 246
    move-wide/from16 v30, v7

    .line 247
    .line 248
    iget-wide v7, v9, La/yic;->g:J

    .line 249
    .line 250
    sub-long v7, v30, v7

    .line 251
    .line 252
    move-wide/from16 v30, v7

    .line 253
    .line 254
    sub-long v7, v22, v30

    .line 255
    .line 256
    move-wide/from16 v32, v10

    .line 257
    .line 258
    const-wide/16 v10, 0x0

    .line 259
    .line 260
    invoke-static {v10, v11, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 261
    .line 262
    .line 263
    move-result-wide v22

    .line 264
    cmp-long v7, v25, v16

    .line 265
    .line 266
    if-eqz v7, :cond_c

    .line 267
    .line 268
    sub-long v7, v25, v30

    .line 269
    .line 270
    invoke-static {v10, v11, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 271
    .line 272
    .line 273
    move-result-wide v7

    .line 274
    move-object v10, v12

    .line 275
    goto :goto_d

    .line 276
    :cond_c
    :goto_c
    move-object v10, v12

    .line 277
    move-wide/from16 v7, v25

    .line 278
    .line 279
    goto :goto_d

    .line 280
    :cond_d
    move-wide/from16 v25, v7

    .line 281
    .line 282
    move-wide/from16 v32, v10

    .line 283
    .line 284
    goto :goto_c

    .line 285
    :goto_d
    invoke-virtual {v4, v9, v13, v14}, La/waw;->b(La/yaw;J)[La/am30;

    .line 286
    .line 287
    .line 288
    move-result-object v12

    .line 289
    const/4 v11, -0x1

    .line 290
    if-eq v6, v11, :cond_e

    .line 291
    .line 292
    iget-object v15, v4, La/waw;->s:La/fmo;

    .line 293
    .line 294
    invoke-interface {v15, v6}, La/fmo;->l(I)I

    .line 295
    .line 296
    .line 297
    move-result v11

    .line 298
    move-object/from16 v25, v5

    .line 299
    .line 300
    move/from16 v26, v6

    .line 301
    .line 302
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 303
    .line 304
    .line 305
    move-result-wide v5

    .line 306
    invoke-interface {v15, v11, v5, v6}, La/fmo;->c(IJ)Z

    .line 307
    .line 308
    .line 309
    move-result v5

    .line 310
    if-eqz v5, :cond_f

    .line 311
    .line 312
    const/4 v15, 0x1

    .line 313
    :goto_e
    move-object v5, v4

    .line 314
    goto :goto_f

    .line 315
    :cond_e
    move-object/from16 v25, v5

    .line 316
    .line 317
    move/from16 v26, v6

    .line 318
    .line 319
    :cond_f
    const/4 v15, 0x0

    .line 320
    goto :goto_e

    .line 321
    :goto_f
    iget-object v4, v5, La/waw;->s:La/fmo;

    .line 322
    .line 323
    move-object/from16 v34, v1

    .line 324
    .line 325
    move-wide/from16 v30, v13

    .line 326
    .line 327
    move/from16 p1, v15

    .line 328
    .line 329
    move-object/from16 v11, v20

    .line 330
    .line 331
    move-object/from16 v15, v25

    .line 332
    .line 333
    move/from16 v13, v26

    .line 334
    .line 335
    const/4 v1, 0x1

    .line 336
    move-object v14, v5

    .line 337
    move-object/from16 v20, v9

    .line 338
    .line 339
    move-wide/from16 v5, v32

    .line 340
    .line 341
    move-object/from16 v33, v3

    .line 342
    .line 343
    move-object/from16 v32, v10

    .line 344
    .line 345
    move-object/from16 v3, v24

    .line 346
    .line 347
    move-wide v9, v7

    .line 348
    move-wide/from16 v7, v22

    .line 349
    .line 350
    invoke-interface/range {v4 .. v12}, La/fmo;->m(JJJLjava/util/List;[La/am30;)V

    .line 351
    .line 352
    .line 353
    iget-object v4, v14, La/waw;->s:La/fmo;

    .line 354
    .line 355
    invoke-interface {v4}, La/fmo;->q()I

    .line 356
    .line 357
    .line 358
    move-result v6

    .line 359
    if-eq v13, v6, :cond_10

    .line 360
    .line 361
    move/from16 v21, v1

    .line 362
    .line 363
    goto :goto_10

    .line 364
    :cond_10
    const/16 v21, 0x0

    .line 365
    .line 366
    :goto_10
    aget-object v4, v32, v6

    .line 367
    .line 368
    invoke-virtual {v4}, La/tbw;->b()Landroid/net/Uri;

    .line 369
    .line 370
    .line 371
    move-result-object v4

    .line 372
    iget-object v5, v14, La/waw;->h:La/xaw;

    .line 373
    .line 374
    if-eqz v5, :cond_11

    .line 375
    .line 376
    iget-boolean v5, v5, La/xaw;->k:Z

    .line 377
    .line 378
    if-eqz v5, :cond_11

    .line 379
    .line 380
    aget-object v5, v32, v6

    .line 381
    .line 382
    iget-object v5, v5, La/tbw;->d:Ljava/lang/String;

    .line 383
    .line 384
    move-object/from16 v67, v5

    .line 385
    .line 386
    goto :goto_11

    .line 387
    :cond_11
    const/16 v67, 0x0

    .line 388
    .line 389
    :goto_11
    invoke-virtual {v3, v4}, La/vuj;->h(Landroid/net/Uri;)Z

    .line 390
    .line 391
    .line 392
    move-result v5

    .line 393
    if-nez v5, :cond_12

    .line 394
    .line 395
    iput-object v4, v2, La/cgx0;->d:Ljava/lang/Object;

    .line 396
    .line 397
    iput-object v4, v14, La/waw;->q:Landroid/net/Uri;

    .line 398
    .line 399
    move-object v3, v2

    .line 400
    goto/16 :goto_32

    .line 401
    .line 402
    :cond_12
    invoke-virtual {v3, v1, v4}, La/vuj;->c(ZLandroid/net/Uri;)La/ibw;

    .line 403
    .line 404
    .line 405
    move-result-object v5

    .line 406
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    iget-boolean v7, v5, La/nbw;->c:Z

    .line 410
    .line 411
    iput-boolean v7, v14, La/waw;->r:Z

    .line 412
    .line 413
    iget-boolean v7, v5, La/ibw;->o:Z

    .line 414
    .line 415
    if-eqz v7, :cond_13

    .line 416
    .line 417
    move-wide/from16 v7, v16

    .line 418
    .line 419
    goto :goto_12

    .line 420
    :cond_13
    iget-wide v7, v5, La/ibw;->h:J

    .line 421
    .line 422
    iget-wide v9, v5, La/ibw;->u:J

    .line 423
    .line 424
    add-long/2addr v7, v9

    .line 425
    iget-wide v9, v3, La/vuj;->v:J

    .line 426
    .line 427
    sub-long/2addr v7, v9

    .line 428
    :goto_12
    iput-wide v7, v14, La/waw;->t:J

    .line 429
    .line 430
    iget-wide v7, v5, La/ibw;->h:J

    .line 431
    .line 432
    iget-wide v9, v3, La/vuj;->v:J

    .line 433
    .line 434
    sub-long v23, v7, v9

    .line 435
    .line 436
    move-object/from16 v22, v5

    .line 437
    .line 438
    move-object/from16 v19, v14

    .line 439
    .line 440
    move-wide/from16 v25, v30

    .line 441
    .line 442
    invoke-virtual/range {v19 .. v26}, La/waw;->e(La/yaw;ZLa/ibw;JJ)Landroid/util/Pair;

    .line 443
    .line 444
    .line 445
    move-result-object v5

    .line 446
    move-object/from16 v7, v22

    .line 447
    .line 448
    iget-object v8, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 449
    .line 450
    check-cast v8, Ljava/lang/Long;

    .line 451
    .line 452
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 453
    .line 454
    .line 455
    move-result-wide v8

    .line 456
    iget-object v5, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 457
    .line 458
    check-cast v5, Ljava/lang/Integer;

    .line 459
    .line 460
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 461
    .line 462
    .line 463
    move-result v5

    .line 464
    if-nez v21, :cond_15

    .line 465
    .line 466
    :cond_14
    :goto_13
    move-object/from16 v14, v19

    .line 467
    .line 468
    move-object/from16 v10, v20

    .line 469
    .line 470
    goto :goto_15

    .line 471
    :cond_15
    if-eqz p1, :cond_16

    .line 472
    .line 473
    goto :goto_13

    .line 474
    :cond_16
    if-nez v20, :cond_17

    .line 475
    .line 476
    goto :goto_13

    .line 477
    :cond_17
    iget-wide v10, v7, La/ibw;->k:J

    .line 478
    .line 479
    cmp-long v10, v8, v10

    .line 480
    .line 481
    if-gez v10, :cond_18

    .line 482
    .line 483
    goto :goto_14

    .line 484
    :cond_18
    invoke-static {v7, v8, v9, v5}, La/waw;->f(La/ibw;JI)La/vaw;

    .line 485
    .line 486
    .line 487
    move-result-object v10

    .line 488
    if-nez v10, :cond_19

    .line 489
    .line 490
    goto :goto_13

    .line 491
    :cond_19
    iget-object v10, v10, La/vaw;->a:La/gbw;

    .line 492
    .line 493
    iget-wide v10, v10, La/gbw;->e:J

    .line 494
    .line 495
    add-long v10, v23, v10

    .line 496
    .line 497
    cmp-long v10, v10, v27

    .line 498
    .line 499
    if-gez v10, :cond_14

    .line 500
    .line 501
    :goto_14
    aget-object v4, v32, v13

    .line 502
    .line 503
    invoke-virtual {v4}, La/tbw;->b()Landroid/net/Uri;

    .line 504
    .line 505
    .line 506
    move-result-object v4

    .line 507
    invoke-virtual {v3, v1, v4}, La/vuj;->c(ZLandroid/net/Uri;)La/ibw;

    .line 508
    .line 509
    .line 510
    move-result-object v5

    .line 511
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 512
    .line 513
    .line 514
    iget-wide v6, v5, La/ibw;->h:J

    .line 515
    .line 516
    iget-wide v8, v3, La/vuj;->v:J

    .line 517
    .line 518
    sub-long v23, v6, v8

    .line 519
    .line 520
    const/16 v21, 0x0

    .line 521
    .line 522
    move-object/from16 v22, v5

    .line 523
    .line 524
    invoke-virtual/range {v19 .. v26}, La/waw;->e(La/yaw;ZLa/ibw;JJ)Landroid/util/Pair;

    .line 525
    .line 526
    .line 527
    move-result-object v5

    .line 528
    move-object/from16 v14, v19

    .line 529
    .line 530
    move-object/from16 v10, v20

    .line 531
    .line 532
    iget-object v6, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 533
    .line 534
    check-cast v6, Ljava/lang/Long;

    .line 535
    .line 536
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 537
    .line 538
    .line 539
    move-result-wide v8

    .line 540
    iget-object v5, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 541
    .line 542
    check-cast v5, Ljava/lang/Integer;

    .line 543
    .line 544
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 545
    .line 546
    .line 547
    move-result v5

    .line 548
    move v6, v5

    .line 549
    move v7, v13

    .line 550
    move-object/from16 v5, v22

    .line 551
    .line 552
    goto :goto_16

    .line 553
    :goto_15
    move/from16 v68, v6

    .line 554
    .line 555
    move v6, v5

    .line 556
    move-object v5, v7

    .line 557
    move/from16 v7, v68

    .line 558
    .line 559
    :goto_16
    iget-object v11, v5, La/nbw;->a:Ljava/lang/String;

    .line 560
    .line 561
    iget-boolean v12, v5, La/nbw;->c:Z

    .line 562
    .line 563
    move-object/from16 v19, v2

    .line 564
    .line 565
    iget-wide v1, v5, La/ibw;->k:J

    .line 566
    .line 567
    move-wide/from16 v21, v1

    .line 568
    .line 569
    iget-object v1, v5, La/ibw;->r:La/b4x;

    .line 570
    .line 571
    if-eq v7, v13, :cond_1a

    .line 572
    .line 573
    const/4 v2, -0x1

    .line 574
    if-eq v13, v2, :cond_1a

    .line 575
    .line 576
    aget-object v2, v32, v13

    .line 577
    .line 578
    invoke-virtual {v2}, La/tbw;->b()Landroid/net/Uri;

    .line 579
    .line 580
    .line 581
    move-result-object v2

    .line 582
    iget-object v3, v3, La/vuj;->d:Ljava/util/HashMap;

    .line 583
    .line 584
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    move-result-object v3

    .line 588
    check-cast v3, La/uuj;

    .line 589
    .line 590
    if-eqz v3, :cond_1a

    .line 591
    .line 592
    iget-object v3, v3, La/uuj;->b:Ljava/util/HashMap;

    .line 593
    .line 594
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 595
    .line 596
    .line 597
    move-result v13

    .line 598
    invoke-static {v13}, La/x0x;->K(Z)V

    .line 599
    .line 600
    .line 601
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v2

    .line 605
    check-cast v2, La/tuj;

    .line 606
    .line 607
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 608
    .line 609
    .line 610
    const/4 v3, 0x0

    .line 611
    iput-boolean v3, v2, La/tuj;->l:Z

    .line 612
    .line 613
    :cond_1a
    cmp-long v2, v8, v21

    .line 614
    .line 615
    if-gez v2, :cond_1b

    .line 616
    .line 617
    new-instance v1, La/lb6;

    .line 618
    .line 619
    invoke-direct {v1}, Ljava/io/IOException;-><init>()V

    .line 620
    .line 621
    .line 622
    iput-object v1, v14, La/waw;->o:La/lb6;

    .line 623
    .line 624
    move-object/from16 v3, v19

    .line 625
    .line 626
    goto/16 :goto_32

    .line 627
    .line 628
    :cond_1b
    invoke-static {v5, v8, v9, v6}, La/waw;->f(La/ibw;JI)La/vaw;

    .line 629
    .line 630
    .line 631
    move-result-object v2

    .line 632
    if-nez v2, :cond_1f

    .line 633
    .line 634
    iget-boolean v2, v5, La/ibw;->o:Z

    .line 635
    .line 636
    if-nez v2, :cond_1c

    .line 637
    .line 638
    move-object/from16 v3, v19

    .line 639
    .line 640
    iput-object v4, v3, La/cgx0;->d:Ljava/lang/Object;

    .line 641
    .line 642
    iput-object v4, v14, La/waw;->q:Landroid/net/Uri;

    .line 643
    .line 644
    goto/16 :goto_32

    .line 645
    .line 646
    :cond_1c
    move-object/from16 v3, v19

    .line 647
    .line 648
    if-nez v29, :cond_1d

    .line 649
    .line 650
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 651
    .line 652
    .line 653
    move-result v2

    .line 654
    if-eqz v2, :cond_1e

    .line 655
    .line 656
    :cond_1d
    const/4 v1, 0x1

    .line 657
    goto :goto_17

    .line 658
    :cond_1e
    new-instance v2, La/vaw;

    .line 659
    .line 660
    invoke-static {v1}, La/g8x;->H(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    move-result-object v6

    .line 664
    check-cast v6, La/gbw;

    .line 665
    .line 666
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 667
    .line 668
    .line 669
    move-result v1

    .line 670
    int-to-long v8, v1

    .line 671
    add-long v8, v21, v8

    .line 672
    .line 673
    const-wide/16 v21, 0x1

    .line 674
    .line 675
    sub-long v8, v8, v21

    .line 676
    .line 677
    const/4 v1, -0x1

    .line 678
    invoke-direct {v2, v6, v8, v9, v1}, La/vaw;-><init>(La/gbw;JI)V

    .line 679
    .line 680
    .line 681
    goto :goto_18

    .line 682
    :goto_17
    iput-boolean v1, v3, La/cgx0;->b:Z

    .line 683
    .line 684
    goto/16 :goto_32

    .line 685
    .line 686
    :cond_1f
    move-object/from16 v3, v19

    .line 687
    .line 688
    :goto_18
    iget-boolean v1, v2, La/vaw;->d:Z

    .line 689
    .line 690
    iget-object v6, v2, La/vaw;->a:La/gbw;

    .line 691
    .line 692
    const/4 v8, 0x0

    .line 693
    iput-object v8, v14, La/waw;->q:Landroid/net/Uri;

    .line 694
    .line 695
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 696
    .line 697
    .line 698
    iget-object v8, v6, La/gbw;->b:La/fbw;

    .line 699
    .line 700
    move v9, v12

    .line 701
    iget-wide v12, v6, La/gbw;->e:J

    .line 702
    .line 703
    if-eqz v8, :cond_20

    .line 704
    .line 705
    iget-object v8, v8, La/gbw;->g:Ljava/lang/String;

    .line 706
    .line 707
    if-nez v8, :cond_21

    .line 708
    .line 709
    :cond_20
    move/from16 v19, v1

    .line 710
    .line 711
    goto :goto_1a

    .line 712
    :cond_21
    move/from16 v19, v1

    .line 713
    .line 714
    iget-object v1, v5, La/nbw;->a:Ljava/lang/String;

    .line 715
    .line 716
    invoke-static {v1, v8}, La/msm0;->p(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 717
    .line 718
    .line 719
    move-result-object v8

    .line 720
    :goto_19
    move/from16 p1, v9

    .line 721
    .line 722
    const/4 v1, 0x1

    .line 723
    goto :goto_1b

    .line 724
    :goto_1a
    const/4 v8, 0x0

    .line 725
    goto :goto_19

    .line 726
    :goto_1b
    invoke-virtual {v14, v8, v7, v1}, La/waw;->g(Landroid/net/Uri;IZ)La/saw;

    .line 727
    .line 728
    .line 729
    move-result-object v9

    .line 730
    iput-object v9, v3, La/cgx0;->c:Ljava/lang/Object;

    .line 731
    .line 732
    if-eqz v9, :cond_22

    .line 733
    .line 734
    goto/16 :goto_32

    .line 735
    .line 736
    :cond_22
    iget-object v1, v6, La/gbw;->g:Ljava/lang/String;

    .line 737
    .line 738
    if-nez v1, :cond_23

    .line 739
    .line 740
    const/4 v1, 0x0

    .line 741
    :goto_1c
    move-wide/from16 v21, v12

    .line 742
    .line 743
    const/4 v9, 0x0

    .line 744
    goto :goto_1d

    .line 745
    :cond_23
    iget-object v9, v5, La/nbw;->a:Ljava/lang/String;

    .line 746
    .line 747
    invoke-static {v9, v1}, La/msm0;->p(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 748
    .line 749
    .line 750
    move-result-object v1

    .line 751
    goto :goto_1c

    .line 752
    :goto_1d
    invoke-virtual {v14, v1, v7, v9}, La/waw;->g(Landroid/net/Uri;IZ)La/saw;

    .line 753
    .line 754
    .line 755
    move-result-object v12

    .line 756
    iput-object v12, v3, La/cgx0;->c:Ljava/lang/Object;

    .line 757
    .line 758
    if-eqz v12, :cond_24

    .line 759
    .line 760
    goto/16 :goto_32

    .line 761
    .line 762
    :cond_24
    instance-of v9, v6, La/dbw;

    .line 763
    .line 764
    if-eqz v9, :cond_27

    .line 765
    .line 766
    move-object v9, v6

    .line 767
    check-cast v9, La/dbw;

    .line 768
    .line 769
    iget-boolean v9, v9, La/dbw;->l:Z

    .line 770
    .line 771
    if-nez v9, :cond_26

    .line 772
    .line 773
    iget v9, v2, La/vaw;->c:I

    .line 774
    .line 775
    if-nez v9, :cond_25

    .line 776
    .line 777
    if-eqz p1, :cond_25

    .line 778
    .line 779
    goto :goto_1e

    .line 780
    :cond_25
    const/16 v65, 0x0

    .line 781
    .line 782
    goto :goto_1f

    .line 783
    :cond_26
    :goto_1e
    const/16 v65, 0x1

    .line 784
    .line 785
    goto :goto_1f

    .line 786
    :cond_27
    move/from16 v65, p1

    .line 787
    .line 788
    :goto_1f
    if-nez v10, :cond_29

    .line 789
    .line 790
    sget-object v9, La/yaw;->M:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 791
    .line 792
    :cond_28
    :goto_20
    const/16 v64, 0x0

    .line 793
    .line 794
    goto :goto_21

    .line 795
    :cond_29
    iget-object v9, v10, La/yaw;->m:Landroid/net/Uri;

    .line 796
    .line 797
    invoke-virtual {v4, v9}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 798
    .line 799
    .line 800
    move-result v9

    .line 801
    if-eqz v9, :cond_2a

    .line 802
    .line 803
    iget-boolean v9, v10, La/yaw;->H:Z

    .line 804
    .line 805
    if-eqz v9, :cond_2a

    .line 806
    .line 807
    goto :goto_20

    .line 808
    :cond_2a
    add-long v12, v23, v21

    .line 809
    .line 810
    if-eqz v65, :cond_2b

    .line 811
    .line 812
    cmp-long v9, v12, v25

    .line 813
    .line 814
    if-gez v9, :cond_28

    .line 815
    .line 816
    :cond_2b
    const/16 v64, 0x1

    .line 817
    .line 818
    :goto_21
    if-eqz v64, :cond_2c

    .line 819
    .line 820
    if-eqz v19, :cond_2c

    .line 821
    .line 822
    goto/16 :goto_32

    .line 823
    .line 824
    :cond_2c
    iget-object v9, v14, La/waw;->a:La/ruj;

    .line 825
    .line 826
    iget-object v12, v14, La/waw;->b:La/jbj;

    .line 827
    .line 828
    iget-object v13, v14, La/waw;->f:[Landroidx/media3/common/b;

    .line 829
    .line 830
    aget-object v39, v13, v7

    .line 831
    .line 832
    iget-object v7, v14, La/waw;->j:Ljava/util/List;

    .line 833
    .line 834
    iget-object v13, v14, La/waw;->s:La/fmo;

    .line 835
    .line 836
    invoke-interface {v13}, La/fmo;->s()I

    .line 837
    .line 838
    .line 839
    move-result v46

    .line 840
    iget-object v13, v14, La/waw;->s:La/fmo;

    .line 841
    .line 842
    invoke-interface {v13}, La/fmo;->j()Ljava/lang/Object;

    .line 843
    .line 844
    .line 845
    move-result-object v47

    .line 846
    iget-boolean v13, v14, La/waw;->m:Z

    .line 847
    .line 848
    move-object/from16 v45, v7

    .line 849
    .line 850
    iget-object v7, v14, La/waw;->d:La/owp0;

    .line 851
    .line 852
    if-nez v1, :cond_2d

    .line 853
    .line 854
    move-object/from16 v36, v9

    .line 855
    .line 856
    const/4 v1, 0x0

    .line 857
    goto :goto_22

    .line 858
    :cond_2d
    move-object/from16 v36, v9

    .line 859
    .line 860
    iget-object v9, v15, La/uyn;->a:Ljava/lang/Object;

    .line 861
    .line 862
    check-cast v9, La/icr;

    .line 863
    .line 864
    invoke-virtual {v9, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 865
    .line 866
    .line 867
    move-result-object v1

    .line 868
    check-cast v1, [B

    .line 869
    .line 870
    :goto_22
    if-nez v8, :cond_2e

    .line 871
    .line 872
    const/4 v8, 0x0

    .line 873
    goto :goto_23

    .line 874
    :cond_2e
    iget-object v9, v15, La/uyn;->a:Ljava/lang/Object;

    .line 875
    .line 876
    check-cast v9, La/icr;

    .line 877
    .line 878
    invoke-virtual {v9, v8}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 879
    .line 880
    .line 881
    move-result-object v8

    .line 882
    check-cast v8, [B

    .line 883
    .line 884
    :goto_23
    iget-object v9, v14, La/waw;->l:La/a4a0;

    .line 885
    .line 886
    sget-object v14, La/yaw;->M:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 887
    .line 888
    const-string v14, "The uri must be set."

    .line 889
    .line 890
    sget-object v52, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 891
    .line 892
    iget-object v15, v6, La/gbw;->a:Ljava/lang/String;

    .line 893
    .line 894
    invoke-static {v11, v15}, La/msm0;->p(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 895
    .line 896
    .line 897
    move-result-object v15

    .line 898
    move-object/from16 v26, v2

    .line 899
    .line 900
    move-object/from16 v25, v3

    .line 901
    .line 902
    iget-wide v2, v6, La/gbw;->i:J

    .line 903
    .line 904
    move-wide/from16 v53, v2

    .line 905
    .line 906
    iget-wide v2, v6, La/gbw;->j:J

    .line 907
    .line 908
    if-eqz v19, :cond_2f

    .line 909
    .line 910
    const/16 v27, 0x8

    .line 911
    .line 912
    move/from16 v57, v27

    .line 913
    .line 914
    goto :goto_24

    .line 915
    :cond_2f
    const/16 v57, 0x0

    .line 916
    .line 917
    :goto_24
    invoke-static {v15, v14}, La/x0x;->G(Ljava/lang/Object;Ljava/lang/String;)V

    .line 918
    .line 919
    .line 920
    new-instance v48, La/mbj;

    .line 921
    .line 922
    const/16 v50, 0x1

    .line 923
    .line 924
    const/16 v51, 0x0

    .line 925
    .line 926
    move-wide/from16 v55, v2

    .line 927
    .line 928
    move-object/from16 v49, v15

    .line 929
    .line 930
    invoke-direct/range {v48 .. v57}, La/mbj;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJI)V

    .line 931
    .line 932
    .line 933
    move-object/from16 v38, v48

    .line 934
    .line 935
    if-eqz v1, :cond_30

    .line 936
    .line 937
    const/16 v40, 0x1

    .line 938
    .line 939
    goto :goto_25

    .line 940
    :cond_30
    const/16 v40, 0x0

    .line 941
    .line 942
    :goto_25
    if-eqz v40, :cond_31

    .line 943
    .line 944
    iget-object v2, v6, La/gbw;->h:Ljava/lang/String;

    .line 945
    .line 946
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 947
    .line 948
    .line 949
    invoke-static {v2}, La/yaw;->d(Ljava/lang/String;)[B

    .line 950
    .line 951
    .line 952
    move-result-object v2

    .line 953
    goto :goto_26

    .line 954
    :cond_31
    const/4 v2, 0x0

    .line 955
    :goto_26
    if-eqz v1, :cond_32

    .line 956
    .line 957
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 958
    .line 959
    .line 960
    new-instance v3, La/g50;

    .line 961
    .line 962
    invoke-direct {v3, v12, v1, v2}, La/g50;-><init>(La/jbj;[B[B)V

    .line 963
    .line 964
    .line 965
    move-object/from16 v37, v3

    .line 966
    .line 967
    goto :goto_27

    .line 968
    :cond_32
    move-object/from16 v37, v12

    .line 969
    .line 970
    :goto_27
    iget-object v1, v6, La/gbw;->b:La/fbw;

    .line 971
    .line 972
    if-eqz v1, :cond_36

    .line 973
    .line 974
    if-eqz v8, :cond_33

    .line 975
    .line 976
    const/4 v2, 0x1

    .line 977
    goto :goto_28

    .line 978
    :cond_33
    const/4 v2, 0x0

    .line 979
    :goto_28
    if-eqz v2, :cond_34

    .line 980
    .line 981
    iget-object v3, v1, La/gbw;->h:Ljava/lang/String;

    .line 982
    .line 983
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 984
    .line 985
    .line 986
    invoke-static {v3}, La/yaw;->d(Ljava/lang/String;)[B

    .line 987
    .line 988
    .line 989
    move-result-object v3

    .line 990
    goto :goto_29

    .line 991
    :cond_34
    const/4 v3, 0x0

    .line 992
    :goto_29
    iget-object v15, v1, La/gbw;->a:Ljava/lang/String;

    .line 993
    .line 994
    invoke-static {v11, v15}, La/msm0;->p(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 995
    .line 996
    .line 997
    move-result-object v11

    .line 998
    move-object/from16 v66, v9

    .line 999
    .line 1000
    move-object/from16 p1, v10

    .line 1001
    .line 1002
    iget-wide v9, v1, La/gbw;->i:J

    .line 1003
    .line 1004
    move v15, v2

    .line 1005
    iget-wide v1, v1, La/gbw;->j:J

    .line 1006
    .line 1007
    invoke-static {v11, v14}, La/x0x;->G(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1008
    .line 1009
    .line 1010
    new-instance v48, La/mbj;

    .line 1011
    .line 1012
    const/16 v50, 0x1

    .line 1013
    .line 1014
    const/16 v51, 0x0

    .line 1015
    .line 1016
    const/16 v57, 0x0

    .line 1017
    .line 1018
    move-wide/from16 v55, v1

    .line 1019
    .line 1020
    move-wide/from16 v53, v9

    .line 1021
    .line 1022
    move-object/from16 v49, v11

    .line 1023
    .line 1024
    invoke-direct/range {v48 .. v57}, La/mbj;-><init>(Landroid/net/Uri;I[BLjava/util/Map;JJI)V

    .line 1025
    .line 1026
    .line 1027
    if-eqz v8, :cond_35

    .line 1028
    .line 1029
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1030
    .line 1031
    .line 1032
    new-instance v1, La/g50;

    .line 1033
    .line 1034
    invoke-direct {v1, v12, v8, v3}, La/g50;-><init>(La/jbj;[B[B)V

    .line 1035
    .line 1036
    .line 1037
    move-object v8, v1

    .line 1038
    goto :goto_2a

    .line 1039
    :cond_35
    move-object v8, v12

    .line 1040
    :goto_2a
    move-object/from16 v41, v8

    .line 1041
    .line 1042
    move/from16 v43, v15

    .line 1043
    .line 1044
    move-object/from16 v8, v48

    .line 1045
    .line 1046
    goto :goto_2b

    .line 1047
    :cond_36
    move-object/from16 v66, v9

    .line 1048
    .line 1049
    move-object/from16 p1, v10

    .line 1050
    .line 1051
    const/4 v8, 0x0

    .line 1052
    const/16 v41, 0x0

    .line 1053
    .line 1054
    const/16 v43, 0x0

    .line 1055
    .line 1056
    :goto_2b
    add-long v48, v23, v21

    .line 1057
    .line 1058
    iget-wide v1, v6, La/gbw;->c:J

    .line 1059
    .line 1060
    add-long v50, v48, v1

    .line 1061
    .line 1062
    iget v1, v5, La/ibw;->j:I

    .line 1063
    .line 1064
    iget v2, v6, La/gbw;->d:I

    .line 1065
    .line 1066
    add-int/2addr v1, v2

    .line 1067
    if-eqz p1, :cond_3b

    .line 1068
    .line 1069
    move-object/from16 v10, p1

    .line 1070
    .line 1071
    iget-object v2, v10, La/yaw;->q:La/mbj;

    .line 1072
    .line 1073
    if-eq v8, v2, :cond_38

    .line 1074
    .line 1075
    if-eqz v8, :cond_37

    .line 1076
    .line 1077
    if-eqz v2, :cond_37

    .line 1078
    .line 1079
    iget-object v3, v8, La/mbj;->a:Landroid/net/Uri;

    .line 1080
    .line 1081
    iget-object v5, v2, La/mbj;->a:Landroid/net/Uri;

    .line 1082
    .line 1083
    invoke-virtual {v3, v5}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 1084
    .line 1085
    .line 1086
    move-result v3

    .line 1087
    if-eqz v3, :cond_37

    .line 1088
    .line 1089
    iget-wide v11, v8, La/mbj;->e:J

    .line 1090
    .line 1091
    iget-wide v2, v2, La/mbj;->e:J

    .line 1092
    .line 1093
    cmp-long v2, v11, v2

    .line 1094
    .line 1095
    if-nez v2, :cond_37

    .line 1096
    .line 1097
    goto :goto_2c

    .line 1098
    :cond_37
    const/4 v2, 0x0

    .line 1099
    goto :goto_2d

    .line 1100
    :cond_38
    :goto_2c
    const/4 v2, 0x1

    .line 1101
    :goto_2d
    iget-object v3, v10, La/yaw;->m:Landroid/net/Uri;

    .line 1102
    .line 1103
    invoke-virtual {v4, v3}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 1104
    .line 1105
    .line 1106
    move-result v3

    .line 1107
    if-eqz v3, :cond_39

    .line 1108
    .line 1109
    iget-boolean v3, v10, La/yaw;->H:Z

    .line 1110
    .line 1111
    if-eqz v3, :cond_39

    .line 1112
    .line 1113
    const/4 v3, 0x1

    .line 1114
    goto :goto_2e

    .line 1115
    :cond_39
    const/4 v3, 0x0

    .line 1116
    :goto_2e
    iget-object v5, v10, La/yaw;->y:La/exw;

    .line 1117
    .line 1118
    iget-object v9, v10, La/yaw;->z:La/fq80;

    .line 1119
    .line 1120
    if-eqz v2, :cond_3a

    .line 1121
    .line 1122
    if-eqz v3, :cond_3a

    .line 1123
    .line 1124
    iget-boolean v2, v10, La/yaw;->J:Z

    .line 1125
    .line 1126
    if-nez v2, :cond_3a

    .line 1127
    .line 1128
    iget v2, v10, La/yaw;->l:I

    .line 1129
    .line 1130
    if-ne v2, v1, :cond_3a

    .line 1131
    .line 1132
    iget-object v15, v10, La/yaw;->C:La/td9;

    .line 1133
    .line 1134
    goto :goto_2f

    .line 1135
    :cond_3a
    const/4 v15, 0x0

    .line 1136
    :goto_2f
    move-object/from16 v61, v15

    .line 1137
    .line 1138
    :goto_30
    move-object/from16 v62, v5

    .line 1139
    .line 1140
    move-object/from16 v63, v9

    .line 1141
    .line 1142
    goto :goto_31

    .line 1143
    :cond_3b
    new-instance v5, La/exw;

    .line 1144
    .line 1145
    const/4 v2, 0x0

    .line 1146
    invoke-direct {v5, v2}, La/exw;-><init>(La/cxw;)V

    .line 1147
    .line 1148
    .line 1149
    new-instance v9, La/fq80;

    .line 1150
    .line 1151
    const/16 v3, 0xa

    .line 1152
    .line 1153
    invoke-direct {v9, v3}, La/fq80;-><init>(I)V

    .line 1154
    .line 1155
    .line 1156
    move-object/from16 v61, v2

    .line 1157
    .line 1158
    goto :goto_30

    .line 1159
    :goto_31
    new-instance v35, La/yaw;

    .line 1160
    .line 1161
    move-object/from16 v2, v26

    .line 1162
    .line 1163
    iget-wide v9, v2, La/vaw;->b:J

    .line 1164
    .line 1165
    iget v2, v2, La/vaw;->c:I

    .line 1166
    .line 1167
    const/16 v20, 0x1

    .line 1168
    .line 1169
    xor-int/lit8 v55, v19, 0x1

    .line 1170
    .line 1171
    iget-boolean v3, v6, La/gbw;->k:Z

    .line 1172
    .line 1173
    iget-object v5, v7, La/owp0;->b:Ljava/lang/Object;

    .line 1174
    .line 1175
    check-cast v5, Landroid/util/SparseArray;

    .line 1176
    .line 1177
    invoke-virtual {v5, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v7

    .line 1181
    check-cast v7, La/coq0;

    .line 1182
    .line 1183
    if-nez v7, :cond_3c

    .line 1184
    .line 1185
    new-instance v7, La/coq0;

    .line 1186
    .line 1187
    const-wide v11, 0x7ffffffffffffffeL

    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    invoke-direct {v7, v11, v12}, La/coq0;-><init>(J)V

    .line 1193
    .line 1194
    .line 1195
    invoke-virtual {v5, v1, v7}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 1196
    .line 1197
    .line 1198
    :cond_3c
    move-object/from16 v59, v7

    .line 1199
    .line 1200
    iget-object v5, v6, La/gbw;->f:Landroidx/media3/common/DrmInitData;

    .line 1201
    .line 1202
    move/from16 v56, v1

    .line 1203
    .line 1204
    move/from16 v54, v2

    .line 1205
    .line 1206
    move/from16 v57, v3

    .line 1207
    .line 1208
    move-object/from16 v44, v4

    .line 1209
    .line 1210
    move-object/from16 v60, v5

    .line 1211
    .line 1212
    move-object/from16 v42, v8

    .line 1213
    .line 1214
    move-wide/from16 v52, v9

    .line 1215
    .line 1216
    move/from16 v58, v13

    .line 1217
    .line 1218
    invoke-direct/range {v35 .. v67}, La/yaw;-><init>(La/ruj;La/jbj;La/mbj;Landroidx/media3/common/b;ZLa/jbj;La/mbj;ZLandroid/net/Uri;Ljava/util/List;ILjava/lang/Object;JJJIZIZZLa/coq0;Landroidx/media3/common/DrmInitData;La/td9;La/exw;La/fq80;ZZLa/a4a0;Ljava/lang/String;)V

    .line 1219
    .line 1220
    .line 1221
    move-object/from16 v3, v25

    .line 1222
    .line 1223
    move-object/from16 v1, v35

    .line 1224
    .line 1225
    iput-object v1, v3, La/cgx0;->c:Ljava/lang/Object;

    .line 1226
    .line 1227
    :goto_32
    iget-boolean v1, v3, La/cgx0;->b:Z

    .line 1228
    .line 1229
    iget-object v2, v3, La/cgx0;->c:Ljava/lang/Object;

    .line 1230
    .line 1231
    check-cast v2, La/yic;

    .line 1232
    .line 1233
    iget-object v3, v3, La/cgx0;->d:Ljava/lang/Object;

    .line 1234
    .line 1235
    check-cast v3, Landroid/net/Uri;

    .line 1236
    .line 1237
    if-eqz v2, :cond_3d

    .line 1238
    .line 1239
    iget-wide v4, v0, La/ybw;->v1:J

    .line 1240
    .line 1241
    const-wide/high16 v6, -0x8000000000000000L

    .line 1242
    .line 1243
    cmp-long v6, v4, v6

    .line 1244
    .line 1245
    if-eqz v6, :cond_3d

    .line 1246
    .line 1247
    iget-wide v6, v2, La/yic;->g:J

    .line 1248
    .line 1249
    cmp-long v4, v6, v4

    .line 1250
    .line 1251
    if-ltz v4, :cond_3d

    .line 1252
    .line 1253
    const/4 v4, 0x1

    .line 1254
    goto :goto_33

    .line 1255
    :cond_3d
    const/4 v4, 0x0

    .line 1256
    :goto_33
    if-nez v1, :cond_49

    .line 1257
    .line 1258
    if-eqz v4, :cond_3e

    .line 1259
    .line 1260
    move-wide/from16 v5, v16

    .line 1261
    .line 1262
    :goto_34
    const/4 v1, 0x1

    .line 1263
    goto/16 :goto_3a

    .line 1264
    .line 1265
    :cond_3e
    if-nez v2, :cond_40

    .line 1266
    .line 1267
    if-eqz v3, :cond_3f

    .line 1268
    .line 1269
    iget-object v0, v0, La/ybw;->c:La/jru;

    .line 1270
    .line 1271
    iget-object v0, v0, La/jru;->b:Ljava/lang/Object;

    .line 1272
    .line 1273
    check-cast v0, La/zaw;

    .line 1274
    .line 1275
    iget-object v0, v0, La/zaw;->b:La/vuj;

    .line 1276
    .line 1277
    iget-object v0, v0, La/vuj;->d:Ljava/util/HashMap;

    .line 1278
    .line 1279
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v0

    .line 1283
    check-cast v0, La/uuj;

    .line 1284
    .line 1285
    if-eqz v0, :cond_3f

    .line 1286
    .line 1287
    const/4 v1, 0x1

    .line 1288
    invoke-virtual {v0, v1, v3}, La/uuj;->e(ZLandroid/net/Uri;)V

    .line 1289
    .line 1290
    .line 1291
    const/16 v18, 0x0

    .line 1292
    .line 1293
    return v18

    .line 1294
    :cond_3f
    const/16 v18, 0x0

    .line 1295
    .line 1296
    goto/16 :goto_3b

    .line 1297
    .line 1298
    :cond_40
    instance-of v1, v2, La/yaw;

    .line 1299
    .line 1300
    if-eqz v1, :cond_48

    .line 1301
    .line 1302
    move-object v1, v2

    .line 1303
    check-cast v1, La/yaw;

    .line 1304
    .line 1305
    invoke-virtual/range {v34 .. v34}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1306
    .line 1307
    .line 1308
    move-result v3

    .line 1309
    if-eqz v3, :cond_42

    .line 1310
    .line 1311
    :cond_41
    move-object/from16 v4, v34

    .line 1312
    .line 1313
    goto :goto_37

    .line 1314
    :cond_42
    invoke-virtual {v0}, La/ybw;->D()La/yaw;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v3

    .line 1318
    invoke-virtual {v3}, La/yaw;->f()Z

    .line 1319
    .line 1320
    .line 1321
    move-result v3

    .line 1322
    if-nez v3, :cond_43

    .line 1323
    .line 1324
    invoke-virtual/range {v34 .. v34}, Ljava/util/ArrayList;->size()I

    .line 1325
    .line 1326
    .line 1327
    move-result v3

    .line 1328
    const/16 v20, 0x1

    .line 1329
    .line 1330
    add-int/lit8 v3, v3, -0x1

    .line 1331
    .line 1332
    invoke-virtual {v0, v3}, La/ybw;->C(I)V

    .line 1333
    .line 1334
    .line 1335
    goto :goto_35

    .line 1336
    :cond_43
    const/16 v20, 0x1

    .line 1337
    .line 1338
    :goto_35
    iget-boolean v3, v1, La/yaw;->n:Z

    .line 1339
    .line 1340
    if-eqz v3, :cond_41

    .line 1341
    .line 1342
    iget-boolean v3, v1, La/yaw;->L:Z

    .line 1343
    .line 1344
    if-eqz v3, :cond_41

    .line 1345
    .line 1346
    invoke-virtual/range {v34 .. v34}, Ljava/util/ArrayList;->size()I

    .line 1347
    .line 1348
    .line 1349
    move-result v3

    .line 1350
    add-int/lit8 v3, v3, -0x1

    .line 1351
    .line 1352
    :goto_36
    if-ltz v3, :cond_41

    .line 1353
    .line 1354
    move-object/from16 v4, v34

    .line 1355
    .line 1356
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1357
    .line 1358
    .line 1359
    move-result-object v5

    .line 1360
    check-cast v5, La/yaw;

    .line 1361
    .line 1362
    iget-wide v5, v5, La/yic;->g:J

    .line 1363
    .line 1364
    iget-wide v7, v1, La/yic;->g:J

    .line 1365
    .line 1366
    cmp-long v5, v5, v7

    .line 1367
    .line 1368
    if-gez v5, :cond_44

    .line 1369
    .line 1370
    goto :goto_37

    .line 1371
    :cond_44
    if-nez v5, :cond_45

    .line 1372
    .line 1373
    invoke-virtual {v0, v3}, La/ybw;->y(I)Z

    .line 1374
    .line 1375
    .line 1376
    move-result v5

    .line 1377
    if-eqz v5, :cond_45

    .line 1378
    .line 1379
    invoke-virtual {v0, v3}, La/ybw;->C(I)V

    .line 1380
    .line 1381
    .line 1382
    const/4 v3, 0x0

    .line 1383
    iput-boolean v3, v1, La/yaw;->L:Z

    .line 1384
    .line 1385
    goto :goto_37

    .line 1386
    :cond_45
    add-int/lit8 v3, v3, -0x1

    .line 1387
    .line 1388
    move-object/from16 v34, v4

    .line 1389
    .line 1390
    goto :goto_36

    .line 1391
    :goto_37
    iput-object v1, v0, La/ybw;->z1:La/yaw;

    .line 1392
    .line 1393
    iget-object v3, v1, La/yic;->d:Landroidx/media3/common/b;

    .line 1394
    .line 1395
    iput-object v3, v0, La/ybw;->g1:Landroidx/media3/common/b;

    .line 1396
    .line 1397
    move-wide/from16 v5, v16

    .line 1398
    .line 1399
    iput-wide v5, v0, La/ybw;->r1:J

    .line 1400
    .line 1401
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1402
    .line 1403
    .line 1404
    invoke-static {}, La/b4x;->l()La/u3x;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v3

    .line 1408
    iget-object v4, v0, La/ybw;->v:[La/xbw;

    .line 1409
    .line 1410
    array-length v5, v4

    .line 1411
    const/4 v6, 0x0

    .line 1412
    :goto_38
    if-ge v6, v5, :cond_46

    .line 1413
    .line 1414
    aget-object v7, v4, v6

    .line 1415
    .line 1416
    iget v8, v7, La/hxg0;->q:I

    .line 1417
    .line 1418
    iget v7, v7, La/hxg0;->p:I

    .line 1419
    .line 1420
    add-int/2addr v8, v7

    .line 1421
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1422
    .line 1423
    .line 1424
    move-result-object v7

    .line 1425
    invoke-virtual {v3, v7}, La/r3x;->b(Ljava/lang/Object;)V

    .line 1426
    .line 1427
    .line 1428
    add-int/lit8 v6, v6, 0x1

    .line 1429
    .line 1430
    goto :goto_38

    .line 1431
    :cond_46
    invoke-virtual {v3}, La/u3x;->g()La/rcf0;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v3

    .line 1435
    iput-object v0, v1, La/yaw;->D:La/ybw;

    .line 1436
    .line 1437
    iput-object v3, v1, La/yaw;->I:La/b4x;

    .line 1438
    .line 1439
    iget-object v3, v0, La/ybw;->v:[La/xbw;

    .line 1440
    .line 1441
    array-length v4, v3

    .line 1442
    const/4 v5, 0x0

    .line 1443
    :goto_39
    if-ge v5, v4, :cond_48

    .line 1444
    .line 1445
    aget-object v6, v3, v5

    .line 1446
    .line 1447
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1448
    .line 1449
    .line 1450
    iget v7, v1, La/yaw;->k:I

    .line 1451
    .line 1452
    int-to-long v7, v7

    .line 1453
    iput-wide v7, v6, La/hxg0;->F:J

    .line 1454
    .line 1455
    iget-boolean v7, v1, La/yaw;->L:Z

    .line 1456
    .line 1457
    if-eqz v7, :cond_47

    .line 1458
    .line 1459
    const/4 v7, 0x1

    .line 1460
    iput-boolean v7, v6, La/hxg0;->J:Z

    .line 1461
    .line 1462
    :cond_47
    add-int/lit8 v5, v5, 0x1

    .line 1463
    .line 1464
    goto :goto_39

    .line 1465
    :cond_48
    iput-object v2, v0, La/ybw;->u:La/yic;

    .line 1466
    .line 1467
    iget-object v1, v0, La/ybw;->i:La/x860;

    .line 1468
    .line 1469
    iget-byte v3, v2, La/yic;->c:B

    .line 1470
    .line 1471
    invoke-virtual {v1, v3}, La/x860;->e(I)I

    .line 1472
    .line 1473
    .line 1474
    move-result v1

    .line 1475
    move-object/from16 v3, v33

    .line 1476
    .line 1477
    invoke-virtual {v3, v2, v0, v1}, La/lhf0;->J(La/kq00;La/iq00;I)V

    .line 1478
    .line 1479
    .line 1480
    const/4 v1, 0x1

    .line 1481
    return v1

    .line 1482
    :cond_49
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    goto/16 :goto_34

    .line 1488
    .line 1489
    :goto_3a
    iput-wide v5, v0, La/ybw;->r1:J

    .line 1490
    .line 1491
    iput-boolean v1, v0, La/ybw;->u1:Z

    .line 1492
    .line 1493
    return v1

    .line 1494
    :cond_4a
    move/from16 v18, v5

    .line 1495
    .line 1496
    :goto_3b
    return v18
.end method

.method public final i()V
    .locals 5

    .line 1
    iget-object p0, p0, La/ybw;->v:[La/xbw;

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    if-ge v1, v0, :cond_1

    .line 6
    .line 7
    aget-object v2, p0, v1

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    invoke-virtual {v2, v3}, La/hxg0;->x(Z)V

    .line 11
    .line 12
    .line 13
    iget-object v3, v2, La/hxg0;->h:La/ivn;

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    iget-object v4, v2, La/hxg0;->e:La/zhl;

    .line 18
    .line 19
    invoke-virtual {v3, v4}, La/ivn;->m(La/zhl;)V

    .line 20
    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    iput-object v3, v2, La/hxg0;->h:La/ivn;

    .line 24
    .line 25
    iput-object v3, v2, La/hxg0;->g:Landroidx/media3/common/b;

    .line 26
    .line 27
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return-void
.end method

.method public final n(La/kq00;JJZ)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/yic;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    iput-object v2, v0, La/ybw;->u:La/yic;

    .line 9
    .line 10
    new-instance v3, La/vn00;

    .line 11
    .line 12
    iget-wide v4, v1, La/yic;->a:J

    .line 13
    .line 14
    iget-object v6, v1, La/yic;->b:La/mbj;

    .line 15
    .line 16
    move-wide/from16 v7, p2

    .line 17
    .line 18
    invoke-direct/range {v3 .. v8}, La/vn00;-><init>(JLa/mbj;J)V

    .line 19
    .line 20
    .line 21
    iget-object v2, v1, La/yic;->i:La/enm0;

    .line 22
    .line 23
    iget-object v4, v2, La/enm0;->c:Landroid/net/Uri;

    .line 24
    .line 25
    iput-object v4, v3, La/vn00;->f:Ljava/lang/Object;

    .line 26
    .line 27
    iget-object v4, v2, La/enm0;->d:Ljava/util/Map;

    .line 28
    .line 29
    iput-object v4, v3, La/vn00;->g:Ljava/lang/Object;

    .line 30
    .line 31
    move-wide/from16 v4, p4

    .line 32
    .line 33
    iput-wide v4, v3, La/vn00;->c:J

    .line 34
    .line 35
    iget-wide v4, v2, La/enm0;->b:J

    .line 36
    .line 37
    iput-wide v4, v3, La/vn00;->d:J

    .line 38
    .line 39
    new-instance v7, La/wn00;

    .line 40
    .line 41
    invoke-direct {v7, v3}, La/wn00;-><init>(La/vn00;)V

    .line 42
    .line 43
    .line 44
    iget-object v2, v0, La/ybw;->i:La/x860;

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-byte v8, v1, La/yic;->c:B

    .line 50
    .line 51
    iget-object v10, v1, La/yic;->d:Landroidx/media3/common/b;

    .line 52
    .line 53
    iget v11, v1, La/yic;->e:I

    .line 54
    .line 55
    iget-object v12, v1, La/yic;->f:Ljava/lang/Object;

    .line 56
    .line 57
    iget-wide v13, v1, La/yic;->g:J

    .line 58
    .line 59
    iget-wide v1, v1, La/yic;->h:J

    .line 60
    .line 61
    iget-object v6, v0, La/ybw;->k:La/zhl;

    .line 62
    .line 63
    iget v9, v0, La/ybw;->b:I

    .line 64
    .line 65
    move-wide v15, v1

    .line 66
    invoke-virtual/range {v6 .. v16}, La/zhl;->b(La/wn00;IILandroidx/media3/common/b;ILjava/lang/Object;JJ)V

    .line 67
    .line 68
    .line 69
    if-nez p6, :cond_2

    .line 70
    .line 71
    invoke-virtual {v0}, La/ybw;->F()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-nez v1, :cond_0

    .line 76
    .line 77
    iget v1, v0, La/ybw;->f1:I

    .line 78
    .line 79
    if-nez v1, :cond_1

    .line 80
    .line 81
    :cond_0
    invoke-virtual {v0}, La/ybw;->J()V

    .line 82
    .line 83
    .line 84
    :cond_1
    iget v1, v0, La/ybw;->f1:I

    .line 85
    .line 86
    if-lez v1, :cond_2

    .line 87
    .line 88
    iget-object v1, v0, La/ybw;->c:La/jru;

    .line 89
    .line 90
    invoke-virtual {v1, v0}, La/jru;->a(La/hgi0;)V

    .line 91
    .line 92
    .line 93
    :cond_2
    return-void
.end method

.method public final o()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, La/ybw;->w1:Z

    .line 3
    .line 4
    iget-object v0, p0, La/ybw;->r:Landroid/os/Handler;

    .line 5
    .line 6
    iget-object p0, p0, La/ybw;->q:La/vbw;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final q(II)La/ncs0;
    .locals 10

    .line 1
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, La/ybw;->A1:Ljava/util/Set;

    .line 6
    .line 7
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x0

    .line 12
    iget-object v3, p0, La/ybw;->x:Ljava/util/HashSet;

    .line 13
    .line 14
    iget-object v4, p0, La/ybw;->y:Landroid/util/SparseIntArray;

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-static {v0}, La/x0x;->A(Z)V

    .line 28
    .line 29
    .line 30
    const/4 v0, -0x1

    .line 31
    invoke-virtual {v4, p2, v0}, Landroid/util/SparseIntArray;->get(II)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-ne v1, v0, :cond_0

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v3, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    iget-object v0, p0, La/ybw;->w:[I

    .line 49
    .line 50
    aput p1, v0, v1

    .line 51
    .line 52
    :cond_1
    iget-object v0, p0, La/ybw;->w:[I

    .line 53
    .line 54
    aget v0, v0, v1

    .line 55
    .line 56
    if-ne v0, p1, :cond_2

    .line 57
    .line 58
    iget-object v0, p0, La/ybw;->v:[La/xbw;

    .line 59
    .line 60
    aget-object v5, v0, v1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    invoke-static {p1, p2}, La/ybw;->z(II)La/pnk;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    goto :goto_1

    .line 68
    :cond_3
    move v0, v2

    .line 69
    :goto_0
    iget-object v1, p0, La/ybw;->v:[La/xbw;

    .line 70
    .line 71
    array-length v6, v1

    .line 72
    if-ge v0, v6, :cond_5

    .line 73
    .line 74
    iget-object v6, p0, La/ybw;->w:[I

    .line 75
    .line 76
    aget v6, v6, v0

    .line 77
    .line 78
    if-ne v6, p1, :cond_4

    .line 79
    .line 80
    aget-object v5, v1, v0

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    add-int/lit8 v0, v0, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_5
    :goto_1
    if-nez v5, :cond_d

    .line 87
    .line 88
    iget-boolean v0, p0, La/ybw;->w1:Z

    .line 89
    .line 90
    if-eqz v0, :cond_6

    .line 91
    .line 92
    invoke-static {p1, p2}, La/ybw;->z(II)La/pnk;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :cond_6
    iget-object v0, p0, La/ybw;->v:[La/xbw;

    .line 98
    .line 99
    array-length v0, v0

    .line 100
    const/4 v1, 0x1

    .line 101
    if-eq p2, v1, :cond_7

    .line 102
    .line 103
    const/4 v5, 0x2

    .line 104
    if-ne p2, v5, :cond_8

    .line 105
    .line 106
    :cond_7
    move v2, v1

    .line 107
    :cond_8
    new-instance v5, La/xbw;

    .line 108
    .line 109
    iget-object v6, p0, La/ybw;->h:La/zhl;

    .line 110
    .line 111
    iget-object v7, p0, La/ybw;->t:Ljava/util/Map;

    .line 112
    .line 113
    iget-object v8, p0, La/ybw;->e:La/lhf0;

    .line 114
    .line 115
    iget-object v9, p0, La/ybw;->g:La/cil;

    .line 116
    .line 117
    invoke-direct {v5, v8, v9, v6, v7}, La/xbw;-><init>(La/lhf0;La/cil;La/zhl;Ljava/util/Map;)V

    .line 118
    .line 119
    .line 120
    iget-wide v6, p0, La/ybw;->q1:J

    .line 121
    .line 122
    iput-wide v6, v5, La/hxg0;->t:J

    .line 123
    .line 124
    if-eqz v2, :cond_9

    .line 125
    .line 126
    iget-object v6, p0, La/ybw;->y1:Landroidx/media3/common/DrmInitData;

    .line 127
    .line 128
    iput-object v6, v5, La/xbw;->L:Landroidx/media3/common/DrmInitData;

    .line 129
    .line 130
    iput-boolean v1, v5, La/hxg0;->C:Z

    .line 131
    .line 132
    :cond_9
    iget-wide v6, p0, La/ybw;->x1:J

    .line 133
    .line 134
    iget-wide v8, v5, La/hxg0;->I:J

    .line 135
    .line 136
    cmp-long v8, v8, v6

    .line 137
    .line 138
    if-eqz v8, :cond_a

    .line 139
    .line 140
    iput-wide v6, v5, La/hxg0;->I:J

    .line 141
    .line 142
    iput-boolean v1, v5, La/hxg0;->C:Z

    .line 143
    .line 144
    :cond_a
    iget-object v6, p0, La/ybw;->z1:La/yaw;

    .line 145
    .line 146
    if-eqz v6, :cond_b

    .line 147
    .line 148
    iget v6, v6, La/yaw;->k:I

    .line 149
    .line 150
    int-to-long v6, v6

    .line 151
    iput-wide v6, v5, La/hxg0;->F:J

    .line 152
    .line 153
    :cond_b
    iput-object p0, v5, La/hxg0;->f:La/gxg0;

    .line 154
    .line 155
    iget-object v6, p0, La/ybw;->w:[I

    .line 156
    .line 157
    add-int/lit8 v7, v0, 0x1

    .line 158
    .line 159
    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([II)[I

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    iput-object v6, p0, La/ybw;->w:[I

    .line 164
    .line 165
    aput p1, v6, v0

    .line 166
    .line 167
    iget-object p1, p0, La/ybw;->v:[La/xbw;

    .line 168
    .line 169
    sget-object v6, La/vtt0;->a:Ljava/lang/String;

    .line 170
    .line 171
    array-length v6, p1

    .line 172
    add-int/2addr v6, v1

    .line 173
    invoke-static {p1, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    array-length p1, p1

    .line 178
    aput-object v5, v1, p1

    .line 179
    .line 180
    check-cast v1, [La/xbw;

    .line 181
    .line 182
    iput-object v1, p0, La/ybw;->v:[La/xbw;

    .line 183
    .line 184
    iget-object p1, p0, La/ybw;->p1:[Z

    .line 185
    .line 186
    invoke-static {p1, v7}, Ljava/util/Arrays;->copyOf([ZI)[Z

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    iput-object p1, p0, La/ybw;->p1:[Z

    .line 191
    .line 192
    aput-boolean v2, p1, v0

    .line 193
    .line 194
    iget-boolean p1, p0, La/ybw;->n1:Z

    .line 195
    .line 196
    or-int/2addr p1, v2

    .line 197
    iput-boolean p1, p0, La/ybw;->n1:Z

    .line 198
    .line 199
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    invoke-virtual {v3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    invoke-virtual {v4, p2, v0}, Landroid/util/SparseIntArray;->append(II)V

    .line 207
    .line 208
    .line 209
    invoke-static {p2}, La/ybw;->E(I)I

    .line 210
    .line 211
    .line 212
    move-result p1

    .line 213
    iget v1, p0, La/ybw;->A:I

    .line 214
    .line 215
    invoke-static {v1}, La/ybw;->E(I)I

    .line 216
    .line 217
    .line 218
    move-result v1

    .line 219
    if-le p1, v1, :cond_c

    .line 220
    .line 221
    iput v0, p0, La/ybw;->B:I

    .line 222
    .line 223
    iput p2, p0, La/ybw;->A:I

    .line 224
    .line 225
    :cond_c
    iget-object p1, p0, La/ybw;->o1:[Z

    .line 226
    .line 227
    invoke-static {p1, v7}, Ljava/util/Arrays;->copyOf([ZI)[Z

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    iput-object p1, p0, La/ybw;->o1:[Z

    .line 232
    .line 233
    :cond_d
    const/4 p1, 0x5

    .line 234
    if-ne p2, p1, :cond_f

    .line 235
    .line 236
    iget-object p1, p0, La/ybw;->z:La/wbw;

    .line 237
    .line 238
    if-nez p1, :cond_e

    .line 239
    .line 240
    new-instance p1, La/wbw;

    .line 241
    .line 242
    iget-boolean p2, p0, La/ybw;->l:Z

    .line 243
    .line 244
    invoke-direct {p1, v5, p2}, La/wbw;-><init>(La/ncs0;I)V

    .line 245
    .line 246
    .line 247
    iput-object p1, p0, La/ybw;->z:La/wbw;

    .line 248
    .line 249
    :cond_e
    return-object p1

    .line 250
    :cond_f
    return-object v5
.end method

.method public final s()J
    .locals 7

    .line 1
    iget-object v0, p0, La/ybw;->n:Ljava/util/ArrayList;

    .line 2
    .line 3
    iget-boolean v1, p0, La/ybw;->u1:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const-wide/high16 v0, -0x8000000000000000L

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    invoke-virtual {p0}, La/ybw;->F()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget-wide v0, p0, La/ybw;->r1:J

    .line 17
    .line 18
    return-wide v0

    .line 19
    :cond_1
    iget-wide v1, p0, La/ybw;->q1:J

    .line 20
    .line 21
    invoke-virtual {p0}, La/ybw;->D()La/yaw;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    iget-boolean v4, v3, La/yaw;->H:Z

    .line 26
    .line 27
    if-eqz v4, :cond_2

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const/4 v4, 0x1

    .line 35
    if-le v3, v4, :cond_3

    .line 36
    .line 37
    const/4 v3, 0x2

    .line 38
    invoke-static {v3, v0}, La/dw9;->l(ILjava/util/ArrayList;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    move-object v3, v0

    .line 43
    check-cast v3, La/yaw;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    const/4 v3, 0x0

    .line 47
    :goto_0
    if-eqz v3, :cond_4

    .line 48
    .line 49
    iget-wide v3, v3, La/yic;->h:J

    .line 50
    .line 51
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 52
    .line 53
    .line 54
    move-result-wide v1

    .line 55
    :cond_4
    iget-boolean v0, p0, La/ybw;->Y:Z

    .line 56
    .line 57
    if-eqz v0, :cond_5

    .line 58
    .line 59
    iget-object p0, p0, La/ybw;->v:[La/xbw;

    .line 60
    .line 61
    array-length v0, p0

    .line 62
    const/4 v3, 0x0

    .line 63
    :goto_1
    if-ge v3, v0, :cond_5

    .line 64
    .line 65
    aget-object v4, p0, v3

    .line 66
    .line 67
    monitor-enter v4

    .line 68
    :try_start_0
    iget-wide v5, v4, La/hxg0;->w:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    monitor-exit v4

    .line 71
    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 72
    .line 73
    .line 74
    move-result-wide v1

    .line 75
    add-int/lit8 v3, v3, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :catchall_0
    move-exception p0

    .line 79
    :try_start_1
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    throw p0

    .line 81
    :cond_5
    return-wide v1
.end method

.method public final t()V
    .locals 1

    .line 1
    iget-object v0, p0, La/ybw;->r:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object p0, p0, La/ybw;->p:La/vbw;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final u(La/kq00;JJ)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/yic;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    iput-object v2, v0, La/ybw;->u:La/yic;

    .line 9
    .line 10
    instance-of v2, v1, La/saw;

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    move-object v2, v1

    .line 15
    check-cast v2, La/saw;

    .line 16
    .line 17
    iget-object v3, v2, La/saw;->j:[B

    .line 18
    .line 19
    iget-object v4, v0, La/ybw;->d:La/waw;

    .line 20
    .line 21
    iput-object v3, v4, La/waw;->n:[B

    .line 22
    .line 23
    iget-object v3, v4, La/waw;->k:La/uyn;

    .line 24
    .line 25
    iget-object v4, v2, La/yic;->b:La/mbj;

    .line 26
    .line 27
    iget-object v4, v4, La/mbj;->a:Landroid/net/Uri;

    .line 28
    .line 29
    iget-object v2, v2, La/saw;->l:[B

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object v3, v3, La/uyn;->a:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v3, La/icr;

    .line 37
    .line 38
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v3, v4, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, [B

    .line 46
    .line 47
    :cond_0
    new-instance v3, La/vn00;

    .line 48
    .line 49
    iget-wide v4, v1, La/yic;->a:J

    .line 50
    .line 51
    iget-object v6, v1, La/yic;->b:La/mbj;

    .line 52
    .line 53
    move-wide/from16 v7, p2

    .line 54
    .line 55
    invoke-direct/range {v3 .. v8}, La/vn00;-><init>(JLa/mbj;J)V

    .line 56
    .line 57
    .line 58
    iget-object v2, v1, La/yic;->i:La/enm0;

    .line 59
    .line 60
    iget-object v4, v2, La/enm0;->c:Landroid/net/Uri;

    .line 61
    .line 62
    iput-object v4, v3, La/vn00;->f:Ljava/lang/Object;

    .line 63
    .line 64
    iget-object v4, v2, La/enm0;->d:Ljava/util/Map;

    .line 65
    .line 66
    iput-object v4, v3, La/vn00;->g:Ljava/lang/Object;

    .line 67
    .line 68
    move-wide/from16 v4, p4

    .line 69
    .line 70
    iput-wide v4, v3, La/vn00;->c:J

    .line 71
    .line 72
    iget-wide v4, v2, La/enm0;->b:J

    .line 73
    .line 74
    iput-wide v4, v3, La/vn00;->d:J

    .line 75
    .line 76
    new-instance v7, La/wn00;

    .line 77
    .line 78
    invoke-direct {v7, v3}, La/wn00;-><init>(La/vn00;)V

    .line 79
    .line 80
    .line 81
    iget-object v2, v0, La/ybw;->i:La/x860;

    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    iget-byte v8, v1, La/yic;->c:B

    .line 87
    .line 88
    iget-object v10, v1, La/yic;->d:Landroidx/media3/common/b;

    .line 89
    .line 90
    iget v11, v1, La/yic;->e:I

    .line 91
    .line 92
    iget-object v12, v1, La/yic;->f:Ljava/lang/Object;

    .line 93
    .line 94
    iget-wide v13, v1, La/yic;->g:J

    .line 95
    .line 96
    iget-wide v1, v1, La/yic;->h:J

    .line 97
    .line 98
    iget-object v6, v0, La/ybw;->k:La/zhl;

    .line 99
    .line 100
    iget v9, v0, La/ybw;->b:I

    .line 101
    .line 102
    move-wide v15, v1

    .line 103
    invoke-virtual/range {v6 .. v16}, La/zhl;->c(La/wn00;IILandroidx/media3/common/b;ILjava/lang/Object;JJ)V

    .line 104
    .line 105
    .line 106
    iget-boolean v1, v0, La/ybw;->Z:Z

    .line 107
    .line 108
    if-nez v1, :cond_1

    .line 109
    .line 110
    new-instance v1, La/xq00;

    .line 111
    .line 112
    invoke-direct {v1}, La/xq00;-><init>()V

    .line 113
    .line 114
    .line 115
    iget-wide v2, v0, La/ybw;->q1:J

    .line 116
    .line 117
    iput-wide v2, v1, La/xq00;->a:J

    .line 118
    .line 119
    new-instance v2, La/yq00;

    .line 120
    .line 121
    invoke-direct {v2, v1}, La/yq00;-><init>(La/xq00;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, v2}, La/ybw;->g(La/yq00;)Z

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :cond_1
    iget-object v1, v0, La/ybw;->c:La/jru;

    .line 129
    .line 130
    invoke-virtual {v1, v0}, La/jru;->a(La/hgi0;)V

    .line 131
    .line 132
    .line 133
    return-void
.end method

.method public final v(J)V
    .locals 10

    .line 1
    iget-object v0, p0, La/ybw;->j:La/lhf0;

    .line 2
    .line 3
    iget-object v1, v0, La/lhf0;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/io/IOException;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p0}, La/ybw;->F()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    goto/16 :goto_5

    .line 17
    .line 18
    :cond_1
    invoke-virtual {v0}, La/lhf0;->C()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 v2, 0x0

    .line 23
    const-wide/high16 v3, -0x8000000000000000L

    .line 24
    .line 25
    iget-object v5, p0, La/ybw;->d:La/waw;

    .line 26
    .line 27
    iget-object v6, p0, La/ybw;->n:Ljava/util/ArrayList;

    .line 28
    .line 29
    iget-object v7, p0, La/ybw;->o:Ljava/util/List;

    .line 30
    .line 31
    const/4 v8, 0x1

    .line 32
    if-eqz v1, :cond_6

    .line 33
    .line 34
    iget-object v1, p0, La/ybw;->u:La/yic;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    instance-of v9, v1, La/yaw;

    .line 40
    .line 41
    if-eqz v9, :cond_2

    .line 42
    .line 43
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    sub-int/2addr v6, v8

    .line 48
    invoke-virtual {p0, v6}, La/ybw;->y(I)Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-nez v6, :cond_2

    .line 53
    .line 54
    goto/16 :goto_5

    .line 55
    .line 56
    :cond_2
    iget-wide v8, p0, La/ybw;->v1:J

    .line 57
    .line 58
    cmp-long p0, v8, v3

    .line 59
    .line 60
    if-eqz p0, :cond_3

    .line 61
    .line 62
    iget-wide v3, v1, La/yic;->g:J

    .line 63
    .line 64
    cmp-long p0, v3, v8

    .line 65
    .line 66
    if-gez p0, :cond_5

    .line 67
    .line 68
    :cond_3
    iget-object p0, v5, La/waw;->o:La/lb6;

    .line 69
    .line 70
    if-eqz p0, :cond_4

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_4
    iget-object p0, v5, La/waw;->s:La/fmo;

    .line 74
    .line 75
    invoke-interface {p0, p1, p2, v1, v7}, La/fmo;->t(JLa/yic;Ljava/util/List;)Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    :goto_0
    if-eqz v2, :cond_d

    .line 80
    .line 81
    :cond_5
    invoke-virtual {v0}, La/lhf0;->a()V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_6
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    :goto_1
    const/4 v1, 0x2

    .line 90
    if-lez v0, :cond_7

    .line 91
    .line 92
    add-int/lit8 v9, v0, -0x1

    .line 93
    .line 94
    invoke-interface {v7, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v9

    .line 98
    check-cast v9, La/yaw;

    .line 99
    .line 100
    invoke-virtual {v5, v9}, La/waw;->c(La/yaw;)I

    .line 101
    .line 102
    .line 103
    move-result v9

    .line 104
    if-ne v9, v1, :cond_7

    .line 105
    .line 106
    add-int/lit8 v0, v0, -0x1

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_7
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 110
    .line 111
    .line 112
    move-result v9

    .line 113
    if-ge v0, v9, :cond_8

    .line 114
    .line 115
    invoke-virtual {p0, v0}, La/ybw;->C(I)V

    .line 116
    .line 117
    .line 118
    :cond_8
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    iget-object v9, v5, La/waw;->o:La/lb6;

    .line 123
    .line 124
    if-nez v9, :cond_a

    .line 125
    .line 126
    iget-object v9, v5, La/waw;->s:La/fmo;

    .line 127
    .line 128
    invoke-interface {v9}, La/fmo;->length()I

    .line 129
    .line 130
    .line 131
    move-result v9

    .line 132
    if-ge v9, v1, :cond_9

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_9
    iget-object v1, v5, La/waw;->s:La/fmo;

    .line 136
    .line 137
    invoke-interface {v1, p1, p2, v7}, La/fmo;->p(JLjava/util/List;)I

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    goto :goto_3

    .line 142
    :cond_a
    :goto_2
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    :goto_3
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    iget-wide v0, p0, La/ybw;->v1:J

    .line 151
    .line 152
    cmp-long p2, v0, v3

    .line 153
    .line 154
    if-eqz p2, :cond_b

    .line 155
    .line 156
    :goto_4
    if-lez p1, :cond_b

    .line 157
    .line 158
    add-int/lit8 p2, p1, -0x1

    .line 159
    .line 160
    invoke-virtual {v6, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    check-cast p2, La/yaw;

    .line 165
    .line 166
    iget-wide v0, p2, La/yic;->g:J

    .line 167
    .line 168
    iget-wide v3, p0, La/ybw;->v1:J

    .line 169
    .line 170
    cmp-long p2, v0, v3

    .line 171
    .line 172
    if-ltz p2, :cond_b

    .line 173
    .line 174
    add-int/lit8 p1, p1, -0x1

    .line 175
    .line 176
    move v2, v8

    .line 177
    goto :goto_4

    .line 178
    :cond_b
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 179
    .line 180
    .line 181
    move-result p2

    .line 182
    if-ge p1, p2, :cond_c

    .line 183
    .line 184
    invoke-virtual {p0, p1}, La/ybw;->C(I)V

    .line 185
    .line 186
    .line 187
    :cond_c
    if-eqz v2, :cond_d

    .line 188
    .line 189
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    iput-wide p1, p0, La/ybw;->r1:J

    .line 195
    .line 196
    iput-boolean v8, p0, La/ybw;->u1:Z

    .line 197
    .line 198
    :cond_d
    :goto_5
    return-void
.end method

.method public final w(La/kq00;JJLjava/io/IOException;I)La/ejx;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v12, p6

    .line 4
    .line 5
    move-object/from16 v1, p1

    .line 6
    .line 7
    check-cast v1, La/yic;

    .line 8
    .line 9
    iget-object v2, v0, La/ybw;->d:La/waw;

    .line 10
    .line 11
    iget-object v3, v2, La/waw;->h:La/xaw;

    .line 12
    .line 13
    instance-of v4, v1, La/yaw;

    .line 14
    .line 15
    if-eqz v4, :cond_1

    .line 16
    .line 17
    move-object v5, v1

    .line 18
    check-cast v5, La/yaw;

    .line 19
    .line 20
    invoke-virtual {v5}, La/yaw;->f()Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-nez v5, :cond_1

    .line 25
    .line 26
    instance-of v5, v12, La/ptw;

    .line 27
    .line 28
    if-eqz v5, :cond_1

    .line 29
    .line 30
    move-object v5, v12

    .line 31
    check-cast v5, La/ptw;

    .line 32
    .line 33
    iget v5, v5, La/ptw;->c:I

    .line 34
    .line 35
    const/16 v6, 0x19a

    .line 36
    .line 37
    if-eq v5, v6, :cond_0

    .line 38
    .line 39
    const/16 v6, 0x194

    .line 40
    .line 41
    if-ne v5, v6, :cond_1

    .line 42
    .line 43
    :cond_0
    sget-object v0, La/lhf0;->e:La/ejx;

    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_1
    iget-object v5, v1, La/yic;->i:La/enm0;

    .line 47
    .line 48
    iget-wide v5, v5, La/enm0;->b:J

    .line 49
    .line 50
    new-instance v13, La/vn00;

    .line 51
    .line 52
    iget-wide v14, v1, La/yic;->a:J

    .line 53
    .line 54
    iget-object v7, v1, La/yic;->b:La/mbj;

    .line 55
    .line 56
    move-wide/from16 v17, p2

    .line 57
    .line 58
    move-object/from16 v16, v7

    .line 59
    .line 60
    invoke-direct/range {v13 .. v18}, La/vn00;-><init>(JLa/mbj;J)V

    .line 61
    .line 62
    .line 63
    iget-object v7, v1, La/yic;->i:La/enm0;

    .line 64
    .line 65
    iget-object v8, v7, La/enm0;->c:Landroid/net/Uri;

    .line 66
    .line 67
    iput-object v8, v13, La/vn00;->f:Ljava/lang/Object;

    .line 68
    .line 69
    iget-object v7, v7, La/enm0;->d:Ljava/util/Map;

    .line 70
    .line 71
    iput-object v7, v13, La/vn00;->g:Ljava/lang/Object;

    .line 72
    .line 73
    move-wide/from16 v7, p4

    .line 74
    .line 75
    iput-wide v7, v13, La/vn00;->c:J

    .line 76
    .line 77
    iput-wide v5, v13, La/vn00;->d:J

    .line 78
    .line 79
    new-instance v7, La/wn00;

    .line 80
    .line 81
    invoke-direct {v7, v13}, La/wn00;-><init>(La/vn00;)V

    .line 82
    .line 83
    .line 84
    iget-wide v8, v1, La/yic;->g:J

    .line 85
    .line 86
    invoke-static {v8, v9}, La/vtt0;->Y(J)J

    .line 87
    .line 88
    .line 89
    iget-wide v8, v1, La/yic;->h:J

    .line 90
    .line 91
    invoke-static {v8, v9}, La/vtt0;->Y(J)J

    .line 92
    .line 93
    .line 94
    new-instance v8, La/y78;

    .line 95
    .line 96
    const/4 v9, 0x7

    .line 97
    move/from16 v10, p7

    .line 98
    .line 99
    invoke-direct {v8, v12, v10, v9}, La/y78;-><init>(Ljava/lang/Object;IB)V

    .line 100
    .line 101
    .line 102
    instance-of v9, v1, La/yaw;

    .line 103
    .line 104
    const/4 v11, 0x1

    .line 105
    if-eqz v9, :cond_2

    .line 106
    .line 107
    move-object v13, v1

    .line 108
    check-cast v13, La/yaw;

    .line 109
    .line 110
    iget-object v13, v13, La/yaw;->m:Landroid/net/Uri;

    .line 111
    .line 112
    invoke-virtual {v2, v13}, La/waw;->a(Landroid/net/Uri;)La/dmk;

    .line 113
    .line 114
    .line 115
    move-result-object v13

    .line 116
    goto :goto_1

    .line 117
    :cond_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 118
    .line 119
    .line 120
    move-result-wide v13

    .line 121
    iget-object v15, v2, La/waw;->s:La/fmo;

    .line 122
    .line 123
    invoke-interface {v15}, La/fmo;->length()I

    .line 124
    .line 125
    .line 126
    move-result v20

    .line 127
    if-eqz v3, :cond_3

    .line 128
    .line 129
    iget-boolean v15, v3, La/xaw;->k:Z

    .line 130
    .line 131
    if-eqz v15, :cond_3

    .line 132
    .line 133
    move v15, v11

    .line 134
    goto :goto_0

    .line 135
    :cond_3
    const/4 v15, 0x0

    .line 136
    :goto_0
    new-instance v16, La/dmk;

    .line 137
    .line 138
    const/16 v19, 0x0

    .line 139
    .line 140
    invoke-virtual {v2, v15, v13, v14}, La/waw;->d(ZJ)I

    .line 141
    .line 142
    .line 143
    move-result v21

    .line 144
    const/16 v18, 0x1

    .line 145
    .line 146
    move/from16 v17, v15

    .line 147
    .line 148
    invoke-direct/range {v16 .. v21}, La/dmk;-><init>(ZIIII)V

    .line 149
    .line 150
    .line 151
    move-object/from16 v13, v16

    .line 152
    .line 153
    :goto_1
    iget-object v14, v0, La/ybw;->i:La/x860;

    .line 154
    .line 155
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-static {v13, v8}, La/x860;->c(La/dmk;La/y78;)La/un00;

    .line 159
    .line 160
    .line 161
    move-result-object v13

    .line 162
    if-nez v13, :cond_5

    .line 163
    .line 164
    move v15, v4

    .line 165
    move-wide/from16 v16, v5

    .line 166
    .line 167
    :cond_4
    :goto_2
    const/16 v18, 0x0

    .line 168
    .line 169
    goto/16 :goto_6

    .line 170
    .line 171
    :cond_5
    iget-byte v10, v13, La/un00;->a:B

    .line 172
    .line 173
    const/16 p2, 0x0

    .line 174
    .line 175
    if-eqz v3, :cond_6

    .line 176
    .line 177
    iget-boolean v15, v3, La/xaw;->k:Z

    .line 178
    .line 179
    if-eqz v15, :cond_6

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_6
    move-object/from16 v3, p2

    .line 183
    .line 184
    :goto_3
    iget v13, v13, La/un00;->b:I

    .line 185
    .line 186
    move v15, v4

    .line 187
    move-wide/from16 v16, v5

    .line 188
    .line 189
    int-to-long v4, v13

    .line 190
    if-eq v10, v11, :cond_a

    .line 191
    .line 192
    const/4 v3, 0x2

    .line 193
    if-ne v10, v3, :cond_9

    .line 194
    .line 195
    iget-object v3, v2, La/waw;->i:La/ccs0;

    .line 196
    .line 197
    iget-object v6, v1, La/yic;->d:Landroidx/media3/common/b;

    .line 198
    .line 199
    invoke-virtual {v3, v6}, La/ccs0;->a(Landroidx/media3/common/b;)I

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    const/4 v6, -0x1

    .line 204
    if-ne v3, v6, :cond_7

    .line 205
    .line 206
    :goto_4
    goto :goto_2

    .line 207
    :cond_7
    iget-object v9, v2, La/waw;->s:La/fmo;

    .line 208
    .line 209
    invoke-interface {v9, v3}, La/fmo;->l(I)I

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    if-ne v3, v6, :cond_8

    .line 214
    .line 215
    goto :goto_4

    .line 216
    :cond_8
    iget-object v2, v2, La/waw;->s:La/fmo;

    .line 217
    .line 218
    invoke-interface {v2, v3, v4, v5}, La/fmo;->h(IJ)Z

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    :goto_5
    move/from16 v18, v2

    .line 223
    .line 224
    goto :goto_6

    .line 225
    :cond_9
    const-string v0, "Invalid fallback selection type: "

    .line 226
    .line 227
    invoke-static {v10, v0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    return-object p2

    .line 235
    :cond_a
    if-eqz v3, :cond_b

    .line 236
    .line 237
    iget-object v2, v2, La/waw;->s:La/fmo;

    .line 238
    .line 239
    invoke-interface {v2}, La/fmo;->e()V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v3, v4, v5}, La/xaw;->a(J)Z

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    goto :goto_5

    .line 247
    :cond_b
    if-eqz v9, :cond_4

    .line 248
    .line 249
    move-object v3, v1

    .line 250
    check-cast v3, La/yaw;

    .line 251
    .line 252
    iget-object v2, v2, La/waw;->g:La/vuj;

    .line 253
    .line 254
    iget-object v3, v3, La/yaw;->m:Landroid/net/Uri;

    .line 255
    .line 256
    iget-object v2, v2, La/vuj;->d:Ljava/util/HashMap;

    .line 257
    .line 258
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    check-cast v2, La/uuj;

    .line 263
    .line 264
    if-eqz v2, :cond_c

    .line 265
    .line 266
    move-object/from16 v6, p2

    .line 267
    .line 268
    invoke-virtual {v2, v3, v4, v5, v6}, La/uuj;->a(Landroid/net/Uri;JLjava/lang/String;)Z

    .line 269
    .line 270
    .line 271
    move-result v2

    .line 272
    goto :goto_5

    .line 273
    :cond_c
    const/4 v2, 0x0

    .line 274
    goto :goto_5

    .line 275
    :goto_6
    if-eqz v18, :cond_10

    .line 276
    .line 277
    if-eqz v15, :cond_f

    .line 278
    .line 279
    const-wide/16 v2, 0x0

    .line 280
    .line 281
    cmp-long v2, v16, v2

    .line 282
    .line 283
    if-nez v2, :cond_f

    .line 284
    .line 285
    iget-object v2, v0, La/ybw;->n:Ljava/util/ArrayList;

    .line 286
    .line 287
    invoke-static {v11, v2}, La/hne;->k(ILjava/util/ArrayList;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v3

    .line 291
    check-cast v3, La/yaw;

    .line 292
    .line 293
    if-ne v3, v1, :cond_d

    .line 294
    .line 295
    move v3, v11

    .line 296
    goto :goto_7

    .line 297
    :cond_d
    const/4 v3, 0x0

    .line 298
    :goto_7
    invoke-static {v3}, La/x0x;->K(Z)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 302
    .line 303
    .line 304
    move-result v3

    .line 305
    if-eqz v3, :cond_e

    .line 306
    .line 307
    iget-wide v2, v0, La/ybw;->q1:J

    .line 308
    .line 309
    iput-wide v2, v0, La/ybw;->r1:J

    .line 310
    .line 311
    goto :goto_8

    .line 312
    :cond_e
    invoke-static {v2}, La/g8x;->H(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v2

    .line 316
    check-cast v2, La/yaw;

    .line 317
    .line 318
    iput-boolean v11, v2, La/yaw;->J:Z

    .line 319
    .line 320
    :cond_f
    :goto_8
    sget-object v2, La/lhf0;->f:La/ejx;

    .line 321
    .line 322
    const/4 v5, 0x0

    .line 323
    :goto_9
    move-object v14, v2

    .line 324
    goto :goto_a

    .line 325
    :cond_10
    invoke-virtual {v14, v8}, La/x860;->f(La/y78;)J

    .line 326
    .line 327
    .line 328
    move-result-wide v2

    .line 329
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    cmp-long v4, v2, v4

    .line 335
    .line 336
    if-eqz v4, :cond_11

    .line 337
    .line 338
    new-instance v4, La/ejx;

    .line 339
    .line 340
    const/4 v5, 0x0

    .line 341
    invoke-direct {v4, v5, v2, v3}, La/ejx;-><init>(IJ)V

    .line 342
    .line 343
    .line 344
    move-object v2, v4

    .line 345
    goto :goto_9

    .line 346
    :cond_11
    const/4 v5, 0x0

    .line 347
    sget-object v2, La/lhf0;->g:La/ejx;

    .line 348
    .line 349
    goto :goto_9

    .line 350
    :goto_a
    iget v2, v14, La/ejx;->a:I

    .line 351
    .line 352
    if-eqz v2, :cond_13

    .line 353
    .line 354
    if-ne v2, v11, :cond_12

    .line 355
    .line 356
    goto :goto_b

    .line 357
    :cond_12
    move v15, v5

    .line 358
    goto :goto_c

    .line 359
    :cond_13
    :goto_b
    move v15, v11

    .line 360
    :goto_c
    xor-int/lit8 v13, v15, 0x1

    .line 361
    .line 362
    iget-byte v3, v1, La/yic;->c:B

    .line 363
    .line 364
    iget-object v5, v1, La/yic;->d:Landroidx/media3/common/b;

    .line 365
    .line 366
    iget v6, v1, La/yic;->e:I

    .line 367
    .line 368
    move-object v2, v7

    .line 369
    iget-object v7, v1, La/yic;->f:Ljava/lang/Object;

    .line 370
    .line 371
    iget-wide v8, v1, La/yic;->g:J

    .line 372
    .line 373
    iget-wide v10, v1, La/yic;->h:J

    .line 374
    .line 375
    iget-object v1, v0, La/ybw;->k:La/zhl;

    .line 376
    .line 377
    iget v4, v0, La/ybw;->b:I

    .line 378
    .line 379
    invoke-virtual/range {v1 .. v13}, La/zhl;->d(La/wn00;IILandroidx/media3/common/b;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    .line 380
    .line 381
    .line 382
    if-nez v15, :cond_14

    .line 383
    .line 384
    const/4 v6, 0x0

    .line 385
    iput-object v6, v0, La/ybw;->u:La/yic;

    .line 386
    .line 387
    :cond_14
    if-eqz v18, :cond_16

    .line 388
    .line 389
    iget-boolean v1, v0, La/ybw;->Z:Z

    .line 390
    .line 391
    if-nez v1, :cond_15

    .line 392
    .line 393
    new-instance v1, La/xq00;

    .line 394
    .line 395
    invoke-direct {v1}, La/xq00;-><init>()V

    .line 396
    .line 397
    .line 398
    iget-wide v2, v0, La/ybw;->q1:J

    .line 399
    .line 400
    iput-wide v2, v1, La/xq00;->a:J

    .line 401
    .line 402
    new-instance v2, La/yq00;

    .line 403
    .line 404
    invoke-direct {v2, v1}, La/yq00;-><init>(La/xq00;)V

    .line 405
    .line 406
    .line 407
    invoke-virtual {v0, v2}, La/ybw;->g(La/yq00;)Z

    .line 408
    .line 409
    .line 410
    return-object v14

    .line 411
    :cond_15
    iget-object v1, v0, La/ybw;->c:La/jru;

    .line 412
    .line 413
    invoke-virtual {v1, v0}, La/jru;->a(La/hgi0;)V

    .line 414
    .line 415
    .line 416
    :cond_16
    return-object v14
.end method

.method public final x()V
    .locals 1

    .line 1
    iget-boolean v0, p0, La/ybw;->Z:Z

    .line 2
    .line 3
    invoke-static {v0}, La/x0x;->K(Z)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/ybw;->j1:La/dcs0;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, La/ybw;->k1:Ljava/util/Set;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final y(I)Z
    .locals 4

    .line 1
    move v0, p1

    .line 2
    :goto_0
    iget-object v1, p0, La/ybw;->n:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    const/4 v3, 0x0

    .line 9
    if-ge v0, v2, :cond_1

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, La/yaw;

    .line 16
    .line 17
    iget-boolean v1, v1, La/yaw;->L:Z

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    return v3

    .line 22
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, La/yaw;

    .line 30
    .line 31
    move v0, v3

    .line 32
    :goto_1
    iget-object v1, p0, La/ybw;->v:[La/xbw;

    .line 33
    .line 34
    array-length v1, v1

    .line 35
    if-ge v0, v1, :cond_3

    .line 36
    .line 37
    invoke-virtual {p1, v0}, La/yaw;->e(I)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    iget-object v2, p0, La/ybw;->v:[La/xbw;

    .line 42
    .line 43
    aget-object v2, v2, v0

    .line 44
    .line 45
    invoke-virtual {v2}, La/hxg0;->o()I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-le v2, v1, :cond_2

    .line 50
    .line 51
    return v3

    .line 52
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    const/4 p0, 0x1

    .line 56
    return p0
.end method
