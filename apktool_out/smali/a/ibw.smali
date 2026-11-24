.class public final La/ibw;
.super La/nbw;
.source "SourceFile"


# instance fields
.field public final d:I

.field public final e:J

.field public final f:Z

.field public final g:Z

.field public final h:J

.field public final i:Z

.field public final j:I

.field public final k:J

.field public final l:I

.field public final m:J

.field public final n:J

.field public final o:Z

.field public final p:Z

.field public final q:Landroidx/media3/common/DrmInitData;

.field public final r:La/b4x;

.field public final s:La/b4x;

.field public final t:La/wcf0;

.field public final u:J

.field public final v:La/hbw;

.field public final w:La/b4x;

.field public final x:La/fbw;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/util/List;JZJZIJIJJZZZLandroidx/media3/common/DrmInitData;Ljava/util/List;Ljava/util/List;La/hbw;Ljava/util/Map;Ljava/util/List;La/fbw;)V
    .locals 4

    .line 1
    move/from16 v0, p18

    .line 2
    .line 3
    invoke-direct {p0, p2, p3, v0}, La/nbw;-><init>(Ljava/lang/String;Ljava/util/List;Z)V

    .line 4
    .line 5
    .line 6
    iput p1, p0, La/ibw;->d:I

    .line 7
    .line 8
    iput-wide p7, p0, La/ibw;->h:J

    .line 9
    .line 10
    iput-boolean p6, p0, La/ibw;->g:Z

    .line 11
    .line 12
    iput-boolean p9, p0, La/ibw;->i:Z

    .line 13
    .line 14
    iput p10, p0, La/ibw;->j:I

    .line 15
    .line 16
    move-wide p1, p11

    .line 17
    iput-wide p1, p0, La/ibw;->k:J

    .line 18
    .line 19
    move/from16 p1, p13

    .line 20
    .line 21
    iput p1, p0, La/ibw;->l:I

    .line 22
    .line 23
    move-wide/from16 p1, p14

    .line 24
    .line 25
    iput-wide p1, p0, La/ibw;->m:J

    .line 26
    .line 27
    move-wide/from16 p1, p16

    .line 28
    .line 29
    iput-wide p1, p0, La/ibw;->n:J

    .line 30
    .line 31
    move/from16 p1, p19

    .line 32
    .line 33
    iput-boolean p1, p0, La/ibw;->o:Z

    .line 34
    .line 35
    move/from16 p1, p20

    .line 36
    .line 37
    iput-boolean p1, p0, La/ibw;->p:Z

    .line 38
    .line 39
    move-object/from16 p1, p21

    .line 40
    .line 41
    iput-object p1, p0, La/ibw;->q:Landroidx/media3/common/DrmInitData;

    .line 42
    .line 43
    invoke-static/range {p22 .. p22}, La/b4x;->o(Ljava/util/Collection;)La/b4x;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, p0, La/ibw;->r:La/b4x;

    .line 48
    .line 49
    invoke-static/range {p23 .. p23}, La/b4x;->o(Ljava/util/Collection;)La/b4x;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    iput-object p1, p0, La/ibw;->s:La/b4x;

    .line 54
    .line 55
    invoke-static/range {p25 .. p25}, La/wcf0;->b(Ljava/util/Map;)La/wcf0;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, La/ibw;->t:La/wcf0;

    .line 60
    .line 61
    invoke-static/range {p26 .. p26}, La/b4x;->o(Ljava/util/Collection;)La/b4x;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iput-object p1, p0, La/ibw;->w:La/b4x;

    .line 66
    .line 67
    move-object/from16 p1, p27

    .line 68
    .line 69
    iput-object p1, p0, La/ibw;->x:La/fbw;

    .line 70
    .line 71
    invoke-interface/range {p23 .. p23}, Ljava/util/List;->isEmpty()Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    const-wide/16 p2, 0x0

    .line 76
    .line 77
    if-nez p1, :cond_0

    .line 78
    .line 79
    invoke-static/range {p23 .. p23}, La/g8x;->H(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    check-cast p1, La/dbw;

    .line 84
    .line 85
    iget-wide v0, p1, La/gbw;->e:J

    .line 86
    .line 87
    iget-wide v2, p1, La/gbw;->c:J

    .line 88
    .line 89
    add-long/2addr v0, v2

    .line 90
    iput-wide v0, p0, La/ibw;->u:J

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_0
    invoke-interface/range {p22 .. p22}, Ljava/util/List;->isEmpty()Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-nez p1, :cond_1

    .line 98
    .line 99
    invoke-static/range {p22 .. p22}, La/g8x;->H(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    check-cast p1, La/fbw;

    .line 104
    .line 105
    iget-wide v0, p1, La/gbw;->e:J

    .line 106
    .line 107
    iget-wide v2, p1, La/gbw;->c:J

    .line 108
    .line 109
    add-long/2addr v0, v2

    .line 110
    iput-wide v0, p0, La/ibw;->u:J

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_1
    iput-wide p2, p0, La/ibw;->u:J

    .line 114
    .line 115
    move-wide v0, p2

    .line 116
    :goto_0
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    cmp-long p1, p4, v2

    .line 122
    .line 123
    if-nez p1, :cond_2

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_2
    cmp-long p1, p4, p2

    .line 127
    .line 128
    if-ltz p1, :cond_3

    .line 129
    .line 130
    invoke-static {v0, v1, p4, p5}, Ljava/lang/Math;->min(JJ)J

    .line 131
    .line 132
    .line 133
    move-result-wide v2

    .line 134
    goto :goto_1

    .line 135
    :cond_3
    add-long/2addr v0, p4

    .line 136
    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 137
    .line 138
    .line 139
    move-result-wide v2

    .line 140
    :goto_1
    iput-wide v2, p0, La/ibw;->e:J

    .line 141
    .line 142
    cmp-long p1, p4, p2

    .line 143
    .line 144
    if-ltz p1, :cond_4

    .line 145
    .line 146
    const/4 p1, 0x1

    .line 147
    goto :goto_2

    .line 148
    :cond_4
    const/4 p1, 0x0

    .line 149
    :goto_2
    iput-boolean p1, p0, La/ibw;->f:Z

    .line 150
    .line 151
    move-object/from16 p1, p24

    .line 152
    .line 153
    iput-object p1, p0, La/ibw;->v:La/hbw;

    .line 154
    .line 155
    return-void
.end method
