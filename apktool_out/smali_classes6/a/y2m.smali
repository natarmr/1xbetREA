.class public final La/y2m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/a3m;


# instance fields
.field public final a:J

.field public final b:Ljava/lang/String;

.field public final c:La/n0x;

.field public final d:La/m0x;

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:I

.field public final k:J

.field public final l:La/o0x;


# direct methods
.method public constructor <init>(JLjava/lang/String;La/n0x;La/m0x;ZZZLjava/lang/String;Ljava/lang/String;IJLa/o0x;I)V
    .locals 1

    .line 1
    move/from16 v0, p15

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0x800

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object v0, p14

    .line 10
    :goto_0
    invoke-static {p3, p9, p10}, La/brm0;->B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-wide p1, p0, La/y2m;->a:J

    .line 17
    .line 18
    iput-object p3, p0, La/y2m;->b:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p4, p0, La/y2m;->c:La/n0x;

    .line 21
    .line 22
    iput-object p5, p0, La/y2m;->d:La/m0x;

    .line 23
    .line 24
    iput-boolean p6, p0, La/y2m;->e:Z

    .line 25
    .line 26
    iput-boolean p7, p0, La/y2m;->f:Z

    .line 27
    .line 28
    iput-boolean p8, p0, La/y2m;->g:Z

    .line 29
    .line 30
    iput-object p9, p0, La/y2m;->h:Ljava/lang/String;

    .line 31
    .line 32
    iput-object p10, p0, La/y2m;->i:Ljava/lang/String;

    .line 33
    .line 34
    iput p11, p0, La/y2m;->j:I

    .line 35
    .line 36
    iput-wide p12, p0, La/y2m;->k:J

    .line 37
    .line 38
    iput-object v0, p0, La/y2m;->l:La/o0x;

    .line 39
    .line 40
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, La/y2m;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/y2m;

    .line 12
    .line 13
    iget-wide v0, p0, La/y2m;->a:J

    .line 14
    .line 15
    iget-wide v2, p1, La/y2m;->a:J

    .line 16
    .line 17
    cmp-long v0, v0, v2

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    goto/16 :goto_0

    .line 22
    .line 23
    :cond_2
    iget-object v0, p0, La/y2m;->b:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v1, p1, La/y2m;->b:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_3

    .line 32
    .line 33
    goto/16 :goto_0

    .line 34
    .line 35
    :cond_3
    iget-object v0, p0, La/y2m;->c:La/n0x;

    .line 36
    .line 37
    iget-object v1, p1, La/y2m;->c:La/n0x;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, La/n0x;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_4

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_4
    iget-object v0, p0, La/y2m;->d:La/m0x;

    .line 47
    .line 48
    iget-object v1, p1, La/y2m;->d:La/m0x;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, La/m0x;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_5

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_5
    iget-boolean v0, p0, La/y2m;->e:Z

    .line 58
    .line 59
    iget-boolean v1, p1, La/y2m;->e:Z

    .line 60
    .line 61
    if-eq v0, v1, :cond_6

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_6
    iget-boolean v0, p0, La/y2m;->f:Z

    .line 65
    .line 66
    iget-boolean v1, p1, La/y2m;->f:Z

    .line 67
    .line 68
    if-eq v0, v1, :cond_7

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_7
    iget-boolean v0, p0, La/y2m;->g:Z

    .line 72
    .line 73
    iget-boolean v1, p1, La/y2m;->g:Z

    .line 74
    .line 75
    if-eq v0, v1, :cond_8

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_8
    iget-object v0, p0, La/y2m;->h:Ljava/lang/String;

    .line 79
    .line 80
    iget-object v1, p1, La/y2m;->h:Ljava/lang/String;

    .line 81
    .line 82
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-nez v0, :cond_9

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_9
    iget-object v0, p0, La/y2m;->i:Ljava/lang/String;

    .line 90
    .line 91
    iget-object v1, p1, La/y2m;->i:Ljava/lang/String;

    .line 92
    .line 93
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-nez v0, :cond_a

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_a
    iget v0, p0, La/y2m;->j:I

    .line 101
    .line 102
    iget v1, p1, La/y2m;->j:I

    .line 103
    .line 104
    if-eq v0, v1, :cond_b

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_b
    iget-wide v0, p0, La/y2m;->k:J

    .line 108
    .line 109
    iget-wide v2, p1, La/y2m;->k:J

    .line 110
    .line 111
    cmp-long v0, v0, v2

    .line 112
    .line 113
    if-eqz v0, :cond_c

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_c
    iget-object p0, p0, La/y2m;->l:La/o0x;

    .line 117
    .line 118
    iget-object p1, p1, La/y2m;->l:La/o0x;

    .line 119
    .line 120
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    if-nez p0, :cond_d

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_d
    const p0, 0x3f666666    # 0.9f

    .line 128
    .line 129
    .line 130
    invoke-static {p0, p0}, Ljava/lang/Float;->compare(FF)I

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    if-eqz p0, :cond_e

    .line 135
    .line 136
    :goto_0
    const/4 p0, 0x0

    .line 137
    return p0

    .line 138
    :cond_e
    :goto_1
    const/4 p0, 0x1

    .line 139
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/y2m;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, La/y2m;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/y2m;->c:La/n0x;

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/f140;->f(La/n0x;II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/y2m;->d:La/m0x;

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La/cs0;->a(La/m0x;II)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-boolean v2, p0, La/y2m;->e:Z

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-boolean v2, p0, La/y2m;->f:Z

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-boolean v2, p0, La/y2m;->g:Z

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, La/y2m;->h:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, La/y2m;->i:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget v2, p0, La/y2m;->j:I

    .line 59
    .line 60
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-wide v2, p0, La/y2m;->k:J

    .line 65
    .line 66
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-object p0, p0, La/y2m;->l:La/o0x;

    .line 71
    .line 72
    if-nez p0, :cond_0

    .line 73
    .line 74
    const/4 p0, 0x0

    .line 75
    goto :goto_0

    .line 76
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    :goto_0
    add-int/2addr v0, p0

    .line 81
    mul-int/2addr v0, v1

    .line 82
    const p0, 0x3f666666    # 0.9f

    .line 83
    .line 84
    .line 85
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    add-int/2addr p0, v0

    .line 90
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "Content(champId="

    .line 2
    .line 3
    const-string v1, ", title="

    .line 4
    .line 5
    iget-wide v2, p0, La/y2m;->a:J

    .line 6
    .line 7
    iget-object v4, p0, La/y2m;->b:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v2, v3, v0, v1, v4}, La/axq;->o(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, ", champImage="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/y2m;->c:La/n0x;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", champPlaceholder="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/y2m;->d:La/m0x;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", favorite="

    .line 34
    .line 35
    const-string v2, ", liveButtonVisible="

    .line 36
    .line 37
    iget-boolean v3, p0, La/y2m;->e:Z

    .line 38
    .line 39
    iget-boolean v4, p0, La/y2m;->f:Z

    .line 40
    .line 41
    invoke-static {v1, v2, v0, v3, v4}, La/w6x;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 42
    .line 43
    .line 44
    const-string v1, ", lineButtonVisible="

    .line 45
    .line 46
    const-string v2, ", liveCount="

    .line 47
    .line 48
    iget-object v3, p0, La/y2m;->h:Ljava/lang/String;

    .line 49
    .line 50
    iget-boolean v4, p0, La/y2m;->g:Z

    .line 51
    .line 52
    invoke-static {v1, v2, v3, v0, v4}, La/hne;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 53
    .line 54
    .line 55
    const-string v1, ", lineCount="

    .line 56
    .line 57
    const-string v2, ", globalChampId="

    .line 58
    .line 59
    iget v3, p0, La/y2m;->j:I

    .line 60
    .line 61
    iget-object v4, p0, La/y2m;->i:Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {v3, v1, v4, v2, v0}, La/axq;->s(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 64
    .line 65
    .line 66
    const-string v1, ", subSportId="

    .line 67
    .line 68
    const-string v2, ", disciplineIcon="

    .line 69
    .line 70
    iget-wide v3, p0, La/y2m;->k:J

    .line 71
    .line 72
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 73
    .line 74
    .line 75
    iget-object p0, p0, La/y2m;->l:La/o0x;

    .line 76
    .line 77
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string p0, ", widthRatio=0.9)"

    .line 81
    .line 82
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0
.end method
