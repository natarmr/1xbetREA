.class public final La/vm10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ym10;


# instance fields
.field public final a:La/sd;

.field public final b:La/vo10;

.field public final c:Ljava/lang/String;

.field public final d:Z

.field public final e:La/wul;

.field public final f:La/wul;

.field public final g:Z

.field public final h:J

.field public final i:Ljava/lang/String;

.field public final j:La/wul;

.field public final k:Z

.field public final l:Z

.field public final m:Z


# direct methods
.method public constructor <init>(La/sd;La/vo10;Ljava/lang/String;ZLa/wul;La/wul;ZJLjava/lang/String;La/wul;ZZZ)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/vm10;->a:La/sd;

    .line 11
    .line 12
    iput-object p2, p0, La/vm10;->b:La/vo10;

    .line 13
    .line 14
    iput-object p3, p0, La/vm10;->c:Ljava/lang/String;

    .line 15
    .line 16
    iput-boolean p4, p0, La/vm10;->d:Z

    .line 17
    .line 18
    iput-object p5, p0, La/vm10;->e:La/wul;

    .line 19
    .line 20
    iput-object p6, p0, La/vm10;->f:La/wul;

    .line 21
    .line 22
    iput-boolean p7, p0, La/vm10;->g:Z

    .line 23
    .line 24
    iput-wide p8, p0, La/vm10;->h:J

    .line 25
    .line 26
    iput-object p10, p0, La/vm10;->i:Ljava/lang/String;

    .line 27
    .line 28
    iput-object p11, p0, La/vm10;->j:La/wul;

    .line 29
    .line 30
    iput-boolean p12, p0, La/vm10;->k:Z

    .line 31
    .line 32
    iput-boolean p13, p0, La/vm10;->l:Z

    .line 33
    .line 34
    iput-boolean p14, p0, La/vm10;->m:Z

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/vm10;->m:Z

    .line 2
    .line 3
    return p0
.end method

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
    instance-of v0, p1, La/vm10;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/vm10;

    .line 12
    .line 13
    iget-object v0, p0, La/vm10;->a:La/sd;

    .line 14
    .line 15
    iget-object v1, p1, La/vm10;->a:La/sd;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, La/sd;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto/16 :goto_0

    .line 24
    .line 25
    :cond_2
    iget-object v0, p0, La/vm10;->b:La/vo10;

    .line 26
    .line 27
    iget-object v1, p1, La/vm10;->b:La/vo10;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, La/vo10;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    goto/16 :goto_0

    .line 36
    .line 37
    :cond_3
    iget-object v0, p0, La/vm10;->c:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v1, p1, La/vm10;->c:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_4

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_4
    iget-boolean v0, p0, La/vm10;->d:Z

    .line 49
    .line 50
    iget-boolean v1, p1, La/vm10;->d:Z

    .line 51
    .line 52
    if-eq v0, v1, :cond_5

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_5
    iget-object v0, p0, La/vm10;->e:La/wul;

    .line 56
    .line 57
    iget-object v1, p1, La/vm10;->e:La/wul;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, La/wul;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_6

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_6
    iget-object v0, p0, La/vm10;->f:La/wul;

    .line 67
    .line 68
    iget-object v1, p1, La/vm10;->f:La/wul;

    .line 69
    .line 70
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_7

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_7
    iget-boolean v0, p0, La/vm10;->g:Z

    .line 78
    .line 79
    iget-boolean v1, p1, La/vm10;->g:Z

    .line 80
    .line 81
    if-eq v0, v1, :cond_8

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_8
    iget-wide v0, p0, La/vm10;->h:J

    .line 85
    .line 86
    iget-wide v2, p1, La/vm10;->h:J

    .line 87
    .line 88
    cmp-long v0, v0, v2

    .line 89
    .line 90
    if-eqz v0, :cond_9

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_9
    iget-object v0, p0, La/vm10;->i:Ljava/lang/String;

    .line 94
    .line 95
    iget-object v1, p1, La/vm10;->i:Ljava/lang/String;

    .line 96
    .line 97
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-nez v0, :cond_a

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_a
    iget-object v0, p0, La/vm10;->j:La/wul;

    .line 105
    .line 106
    iget-object v1, p1, La/vm10;->j:La/wul;

    .line 107
    .line 108
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-nez v0, :cond_b

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_b
    iget-boolean v0, p0, La/vm10;->k:Z

    .line 116
    .line 117
    iget-boolean v1, p1, La/vm10;->k:Z

    .line 118
    .line 119
    if-eq v0, v1, :cond_c

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_c
    iget-boolean v0, p0, La/vm10;->l:Z

    .line 123
    .line 124
    iget-boolean v1, p1, La/vm10;->l:Z

    .line 125
    .line 126
    if-eq v0, v1, :cond_d

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_d
    iget-boolean p0, p0, La/vm10;->m:Z

    .line 130
    .line 131
    iget-boolean p1, p1, La/vm10;->m:Z

    .line 132
    .line 133
    if-eq p0, p1, :cond_e

    .line 134
    .line 135
    :goto_0
    const/4 p0, 0x0

    .line 136
    return p0

    .line 137
    :cond_e
    :goto_1
    const/4 p0, 0x1

    .line 138
    return p0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, La/vm10;->a:La/sd;

    .line 2
    .line 3
    invoke-virtual {v0}, La/sd;->hashCode()I

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
    iget-object v2, p0, La/vm10;->b:La/vo10;

    .line 11
    .line 12
    invoke-virtual {v2}, La/vo10;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, La/vm10;->c:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v2, v1, v0}, La/ua80;->b(IILjava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-boolean v2, p0, La/vm10;->d:Z

    .line 25
    .line 26
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v2, p0, La/vm10;->e:La/wul;

    .line 31
    .line 32
    invoke-static {v2, v0, v1}, La/i8i;->a(La/wul;II)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    const/4 v2, 0x0

    .line 37
    iget-object v3, p0, La/vm10;->f:La/wul;

    .line 38
    .line 39
    if-nez v3, :cond_0

    .line 40
    .line 41
    move v3, v2

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {v3}, La/wul;->hashCode()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    :goto_0
    add-int/2addr v0, v3

    .line 48
    mul-int/2addr v0, v1

    .line 49
    iget-boolean v3, p0, La/vm10;->g:Z

    .line 50
    .line 51
    invoke-static {v0, v1, v3}, La/brm0;->e(IIZ)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    iget-wide v3, p0, La/vm10;->h:J

    .line 56
    .line 57
    invoke-static {v0, v1, v3, v4}, La/rw2;->b(IIJ)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    iget-object v3, p0, La/vm10;->i:Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {v0, v1, v3}, La/ua80;->b(IILjava/lang/String;)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    iget-object v3, p0, La/vm10;->j:La/wul;

    .line 68
    .line 69
    if-nez v3, :cond_1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    invoke-virtual {v3}, La/wul;->hashCode()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    :goto_1
    add-int/2addr v0, v2

    .line 77
    mul-int/2addr v0, v1

    .line 78
    iget-boolean v2, p0, La/vm10;->k:Z

    .line 79
    .line 80
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iget-boolean v2, p0, La/vm10;->l:Z

    .line 85
    .line 86
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    iget-boolean p0, p0, La/vm10;->m:Z

    .line 91
    .line 92
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    add-int/2addr p0, v0

    .line 97
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Main(balance="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/vm10;->a:La/sd;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", wheel="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/vm10;->b:La/vo10;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", titleCaption="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", controlsVisible="

    .line 29
    .line 30
    const-string v2, ", spinButton="

    .line 31
    .line 32
    iget-object v3, p0, La/vm10;->c:Ljava/lang/String;

    .line 33
    .line 34
    iget-boolean v4, p0, La/vm10;->d:Z

    .line 35
    .line 36
    invoke-static {v3, v1, v2, v0, v4}, La/brm0;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, La/vm10;->e:La/wul;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, ", spinAllButton="

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, La/vm10;->f:La/wul;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, ", timerVisible="

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string v1, ", timerTargetMillis="

    .line 60
    .line 61
    iget-wide v2, p0, La/vm10;->h:J

    .line 62
    .line 63
    iget-boolean v4, p0, La/vm10;->g:Z

    .line 64
    .line 65
    invoke-static {v2, v3, v1, v0, v4}, La/rw2;->v(JLjava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 66
    .line 67
    .line 68
    const-string v1, ", freeSpinTimerLabel="

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    iget-object v1, p0, La/vm10;->i:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v1, ", bonusInfoButton="

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    iget-object v1, p0, La/vm10;->j:La/wul;

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v1, ", toolbarButtonsEnabled="

    .line 89
    .line 90
    const-string v2, ", backButtonEnabled="

    .line 91
    .line 92
    iget-boolean v3, p0, La/vm10;->k:Z

    .line 93
    .line 94
    iget-boolean v4, p0, La/vm10;->l:Z

    .line 95
    .line 96
    invoke-static {v1, v2, v0, v3, v4}, La/w6x;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 97
    .line 98
    .line 99
    const-string v1, ", networkAvailable="

    .line 100
    .line 101
    const-string v2, ")"

    .line 102
    .line 103
    iget-boolean p0, p0, La/vm10;->m:Z

    .line 104
    .line 105
    invoke-static {v0, v1, p0, v2}, La/f140;->n(Ljava/lang/StringBuilder;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0
.end method
