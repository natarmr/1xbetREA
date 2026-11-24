.class public final La/c52;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Ljava/util/List;

.field public final c:Ljava/util/List;

.field public final d:Ljava/util/List;

.field public final e:La/wdj;

.field public final f:La/wdj;

.field public final g:Z

.field public final h:Z

.field public final i:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

.field public final j:Z

.field public final k:I


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;La/wdj;La/wdj;ZZLorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;ZI)V
    .locals 0

    .line 1
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/c52;->a:Ljava/util/List;

    .line 8
    .line 9
    iput-object p2, p0, La/c52;->b:Ljava/util/List;

    .line 10
    .line 11
    iput-object p3, p0, La/c52;->c:Ljava/util/List;

    .line 12
    .line 13
    iput-object p4, p0, La/c52;->d:Ljava/util/List;

    .line 14
    .line 15
    iput-object p5, p0, La/c52;->e:La/wdj;

    .line 16
    .line 17
    iput-object p6, p0, La/c52;->f:La/wdj;

    .line 18
    .line 19
    iput-boolean p7, p0, La/c52;->g:Z

    .line 20
    .line 21
    iput-boolean p8, p0, La/c52;->h:Z

    .line 22
    .line 23
    iput-object p9, p0, La/c52;->i:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 24
    .line 25
    iput-boolean p10, p0, La/c52;->j:Z

    .line 26
    .line 27
    iput p11, p0, La/c52;->k:I

    .line 28
    .line 29
    return-void
.end method

.method public static a(La/c52;Ljava/util/List;Ljava/util/List;La/wdj;I)La/c52;
    .locals 12

    .line 1
    iget-object v1, p0, La/c52;->a:Ljava/util/List;

    .line 2
    .line 3
    and-int/lit8 v0, p4, 0x2

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, La/c52;->b:Ljava/util/List;

    .line 8
    .line 9
    :cond_0
    move-object v2, p1

    .line 10
    iget-object v3, p0, La/c52;->c:Ljava/util/List;

    .line 11
    .line 12
    and-int/lit8 p1, p4, 0x8

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    iget-object p2, p0, La/c52;->d:Ljava/util/List;

    .line 17
    .line 18
    :cond_1
    move-object v4, p2

    .line 19
    and-int/lit8 p1, p4, 0x10

    .line 20
    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    iget-object p3, p0, La/c52;->e:La/wdj;

    .line 24
    .line 25
    :cond_2
    move-object v5, p3

    .line 26
    iget-object v6, p0, La/c52;->f:La/wdj;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-boolean v7, p0, La/c52;->g:Z

    .line 32
    .line 33
    iget-boolean v8, p0, La/c52;->h:Z

    .line 34
    .line 35
    iget-object v9, p0, La/c52;->i:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 36
    .line 37
    iget-boolean v10, p0, La/c52;->j:Z

    .line 38
    .line 39
    iget v11, p0, La/c52;->k:I

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    new-instance v0, La/c52;

    .line 48
    .line 49
    invoke-direct/range {v0 .. v11}, La/c52;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;La/wdj;La/wdj;ZZLorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;ZI)V

    .line 50
    .line 51
    .line 52
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, La/c52;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/c52;

    .line 12
    .line 13
    iget-object v0, p0, La/c52;->a:Ljava/util/List;

    .line 14
    .line 15
    iget-object v1, p1, La/c52;->a:Ljava/util/List;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    iget-object v0, p0, La/c52;->b:Ljava/util/List;

    .line 25
    .line 26
    iget-object v1, p1, La/c52;->b:Ljava/util/List;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_3
    iget-object v0, p0, La/c52;->c:Ljava/util/List;

    .line 36
    .line 37
    iget-object v1, p1, La/c52;->c:Ljava/util/List;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/c52;->d:Ljava/util/List;

    .line 47
    .line 48
    iget-object v1, p1, La/c52;->d:Ljava/util/List;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/c52;->e:La/wdj;

    .line 58
    .line 59
    iget-object v1, p1, La/c52;->e:La/wdj;

    .line 60
    .line 61
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_6

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_6
    iget-object v0, p0, La/c52;->f:La/wdj;

    .line 69
    .line 70
    iget-object v1, p1, La/c52;->f:La/wdj;

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_7

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_7
    iget-boolean v0, p0, La/c52;->g:Z

    .line 80
    .line 81
    iget-boolean v1, p1, La/c52;->g:Z

    .line 82
    .line 83
    if-eq v0, v1, :cond_8

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_8
    iget-boolean v0, p0, La/c52;->h:Z

    .line 87
    .line 88
    iget-boolean v1, p1, La/c52;->h:Z

    .line 89
    .line 90
    if-eq v0, v1, :cond_9

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_9
    iget-object v0, p0, La/c52;->i:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 94
    .line 95
    iget-object v1, p1, La/c52;->i:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 96
    .line 97
    if-eq v0, v1, :cond_a

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_a
    iget-boolean v0, p0, La/c52;->j:Z

    .line 101
    .line 102
    iget-boolean v1, p1, La/c52;->j:Z

    .line 103
    .line 104
    if-eq v0, v1, :cond_b

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_b
    iget p0, p0, La/c52;->k:I

    .line 108
    .line 109
    iget p1, p1, La/c52;->k:I

    .line 110
    .line 111
    if-eq p0, p1, :cond_c

    .line 112
    .line 113
    :goto_0
    const/4 p0, 0x0

    .line 114
    return p0

    .line 115
    :cond_c
    :goto_1
    const/4 p0, 0x1

    .line 116
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/c52;->a:Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

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
    iget-object v2, p0, La/c52;->b:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/c52;->c:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/c52;->d:Ljava/util/List;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/c52;->e:La/wdj;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    add-int/2addr v2, v0

    .line 35
    mul-int/2addr v2, v1

    .line 36
    iget-object v0, p0, La/c52;->f:La/wdj;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    add-int/2addr v0, v2

    .line 43
    mul-int/2addr v0, v1

    .line 44
    const/4 v2, 0x0

    .line 45
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iget-boolean v2, p0, La/c52;->g:Z

    .line 50
    .line 51
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    iget-boolean v2, p0, La/c52;->h:Z

    .line 56
    .line 57
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    iget-object v2, p0, La/c52;->i:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    add-int/2addr v2, v0

    .line 68
    mul-int/2addr v2, v1

    .line 69
    iget-boolean v0, p0, La/c52;->j:Z

    .line 70
    .line 71
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    iget p0, p0, La/c52;->k:I

    .line 76
    .line 77
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    add-int/2addr p0, v0

    .line 82
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", selectedStatusModelList="

    .line 2
    .line 3
    const-string v1, ", defaultBetTypeModelList="

    .line 4
    .line 5
    const-string v2, "AllFiltersState(defaultStatusModelList="

    .line 6
    .line 7
    iget-object v3, p0, La/c52;->a:Ljava/util/List;

    .line 8
    .line 9
    iget-object v4, p0, La/c52;->b:Ljava/util/List;

    .line 10
    .line 11
    invoke-static {v2, v0, v3, v1, v4}, La/w6x;->t(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", selectedBetTypeModelList="

    .line 16
    .line 17
    const-string v2, ", selectedDatePeriod="

    .line 18
    .line 19
    iget-object v3, p0, La/c52;->c:Ljava/util/List;

    .line 20
    .line 21
    iget-object v4, p0, La/c52;->d:Ljava/util/List;

    .line 22
    .line 23
    invoke-static {v1, v2, v0, v3, v4}, La/b1j;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Ljava/util/List;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, La/c52;->e:La/wdj;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, ", defaultDatePeriod="

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, La/c52;->f:La/wdj;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, ", resetButtonEnabled=false, hasHistoryPeriodFilter="

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v1, ", hasHistoryToEmail="

    .line 47
    .line 48
    const-string v2, ", historyType="

    .line 49
    .line 50
    iget-boolean v3, p0, La/c52;->g:Z

    .line 51
    .line 52
    iget-boolean v4, p0, La/c52;->h:Z

    .line 53
    .line 54
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, La/c52;->i:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v1, ", isCalendarEnable="

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    iget-boolean v1, p0, La/c52;->j:Z

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v1, ", maxPeriod="

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v1, ")"

    .line 78
    .line 79
    iget p0, p0, La/c52;->k:I

    .line 80
    .line 81
    invoke-static {p0, v1, v0}, La/rz4;->j(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0
.end method
