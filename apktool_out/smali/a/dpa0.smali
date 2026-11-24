.class public final La/dpa0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J

.field public final d:Z

.field public final e:F

.field public final f:J

.field public final g:J

.field public final h:Z

.field public final i:I

.field public final j:J

.field public final k:F

.field public final l:J

.field public final m:Ljava/util/ArrayList;

.field public final n:J

.field public o:Z

.field public p:Z

.field public q:La/dpa0;


# direct methods
.method public constructor <init>(JJJZFJJZILjava/util/ArrayList;JFJJ)V
    .locals 21

    const/4 v14, 0x0

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    move-wide/from16 v5, p5

    move/from16 v7, p7

    move/from16 v8, p8

    move-wide/from16 v9, p9

    move-wide/from16 v11, p11

    move/from16 v13, p13

    move/from16 v15, p14

    move-wide/from16 v16, p16

    move/from16 v18, p18

    move-wide/from16 v19, p19

    .line 44
    invoke-direct/range {v0 .. v20}, La/dpa0;-><init>(JJJZFJJZZIJFJ)V

    move-object/from16 v1, p15

    .line 45
    iput-object v1, v0, La/dpa0;->m:Ljava/util/ArrayList;

    move-wide/from16 v1, p21

    .line 46
    iput-wide v1, v0, La/dpa0;->n:J

    return-void
.end method

.method public constructor <init>(JJJZFJJZZIJFJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, La/dpa0;->a:J

    .line 5
    .line 6
    iput-wide p3, p0, La/dpa0;->b:J

    .line 7
    .line 8
    iput-wide p5, p0, La/dpa0;->c:J

    .line 9
    .line 10
    iput-boolean p7, p0, La/dpa0;->d:Z

    .line 11
    .line 12
    iput p8, p0, La/dpa0;->e:F

    .line 13
    .line 14
    iput-wide p9, p0, La/dpa0;->f:J

    .line 15
    .line 16
    iput-wide p11, p0, La/dpa0;->g:J

    .line 17
    .line 18
    iput-boolean p13, p0, La/dpa0;->h:Z

    .line 19
    .line 20
    move p1, p15

    .line 21
    iput p1, p0, La/dpa0;->i:I

    .line 22
    .line 23
    move-wide/from16 p1, p16

    .line 24
    .line 25
    iput-wide p1, p0, La/dpa0;->j:J

    .line 26
    .line 27
    move/from16 p1, p18

    .line 28
    .line 29
    iput p1, p0, La/dpa0;->k:F

    .line 30
    .line 31
    move-wide/from16 p1, p19

    .line 32
    .line 33
    iput-wide p1, p0, La/dpa0;->l:J

    .line 34
    .line 35
    const-wide/16 p1, 0x0

    .line 36
    .line 37
    iput-wide p1, p0, La/dpa0;->n:J

    .line 38
    .line 39
    iput-boolean p14, p0, La/dpa0;->o:Z

    .line 40
    .line 41
    iput-boolean p14, p0, La/dpa0;->p:Z

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget-object v0, p0, La/dpa0;->q:La/dpa0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, La/dpa0;->o:Z

    .line 7
    .line 8
    iput-boolean v0, p0, La/dpa0;->p:Z

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, La/dpa0;->a()V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public final b()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/dpa0;->m:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    sget-object p0, La/iun;->a:La/iun;

    .line 6
    .line 7
    :cond_0
    return-object p0
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-object v0, p0, La/dpa0;->q:La/dpa0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, La/dpa0;->c()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    iget-boolean v0, p0, La/dpa0;->o:Z

    .line 11
    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    iget-boolean p0, p0, La/dpa0;->p:Z

    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 p0, 0x0

    .line 20
    return p0

    .line 21
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 22
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 12

    .line 1
    iget-wide v0, p0, La/dpa0;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/b5x;->h0(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, La/dpa0;->c:J

    .line 8
    .line 9
    invoke-static {v1, v2}, La/ne60;->h(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-wide v2, p0, La/dpa0;->g:J

    .line 14
    .line 15
    invoke-static {v2, v3}, La/ne60;->h(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {p0}, La/dpa0;->c()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    iget v4, p0, La/dpa0;->i:I

    .line 24
    .line 25
    invoke-static {v4}, La/lpa0;->a(I)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {p0}, La/dpa0;->b()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    iget-wide v6, p0, La/dpa0;->j:J

    .line 34
    .line 35
    invoke-static {v6, v7}, La/ne60;->h(J)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    iget-wide v7, p0, La/dpa0;->l:J

    .line 40
    .line 41
    invoke-static {v7, v8}, La/ne60;->h(J)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    const-string v8, "PointerInputChange(id="

    .line 46
    .line 47
    const-string v9, ", uptimeMillis="

    .line 48
    .line 49
    iget-wide v10, p0, La/dpa0;->b:J

    .line 50
    .line 51
    invoke-static {v10, v11, v8, v0, v9}, La/f140;->o(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    const-string v8, ", position="

    .line 56
    .line 57
    const-string v9, ", pressed="

    .line 58
    .line 59
    iget-boolean v10, p0, La/dpa0;->d:Z

    .line 60
    .line 61
    invoke-static {v8, v1, v9, v0, v10}, La/w6x;->z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 62
    .line 63
    .line 64
    const-string v1, ", pressure="

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget v1, p0, La/dpa0;->e:F

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v1, ", previousUptimeMillis="

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v1, ", previousPosition="

    .line 80
    .line 81
    iget-wide v8, p0, La/dpa0;->f:J

    .line 82
    .line 83
    invoke-static {v0, v8, v9, v1, v2}, La/kng0;->z(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    const-string v1, ", previousPressed="

    .line 87
    .line 88
    const-string v2, ", isConsumed="

    .line 89
    .line 90
    iget-boolean v8, p0, La/dpa0;->h:Z

    .line 91
    .line 92
    invoke-static {v1, v2, v0, v8, v3}, La/w6x;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 93
    .line 94
    .line 95
    const-string v1, ", type="

    .line 96
    .line 97
    const-string v2, ", historical="

    .line 98
    .line 99
    invoke-static {v1, v4, v2, v0, v5}, La/ua80;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 100
    .line 101
    .line 102
    const-string v1, ", scrollDelta="

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string v1, ", scaleFactor="

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    iget p0, p0, La/dpa0;->k:F

    .line 116
    .line 117
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string p0, ", panOffset="

    .line 121
    .line 122
    const-string v1, ")"

    .line 123
    .line 124
    invoke-static {v0, p0, v7, v1}, La/rw2;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    return-object p0
.end method
