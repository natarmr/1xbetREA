.class public final La/lx30;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:La/ql5;

.field public final c:La/a5w;

.field public final d:Z

.field public final e:Ljava/util/List;

.field public final f:Z

.field public final g:Z

.field public final h:Ljava/util/List;

.field public final i:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

.field public final j:Z

.field public final k:Z

.field public final l:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;La/ql5;La/a5w;ZLjava/util/List;ZZLjava/util/List;Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;ZZZ)V
    .locals 0

    .line 1
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/lx30;->a:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p2, p0, La/lx30;->b:La/ql5;

    .line 13
    .line 14
    iput-object p3, p0, La/lx30;->c:La/a5w;

    .line 15
    .line 16
    iput-boolean p4, p0, La/lx30;->d:Z

    .line 17
    .line 18
    iput-object p5, p0, La/lx30;->e:Ljava/util/List;

    .line 19
    .line 20
    iput-boolean p6, p0, La/lx30;->f:Z

    .line 21
    .line 22
    iput-boolean p7, p0, La/lx30;->g:Z

    .line 23
    .line 24
    iput-object p8, p0, La/lx30;->h:Ljava/util/List;

    .line 25
    .line 26
    iput-object p9, p0, La/lx30;->i:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 27
    .line 28
    iput-boolean p10, p0, La/lx30;->j:Z

    .line 29
    .line 30
    iput-boolean p11, p0, La/lx30;->k:Z

    .line 31
    .line 32
    iput-boolean p12, p0, La/lx30;->l:Z

    .line 33
    .line 34
    return-void
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
    instance-of v0, p1, La/lx30;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/lx30;

    .line 12
    .line 13
    iget-object v0, p0, La/lx30;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, La/lx30;->a:Ljava/lang/String;

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
    iget-object v0, p0, La/lx30;->b:La/ql5;

    .line 25
    .line 26
    iget-object v1, p1, La/lx30;->b:La/ql5;

    .line 27
    .line 28
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/lx30;->c:La/a5w;

    .line 36
    .line 37
    iget-object v1, p1, La/lx30;->c:La/a5w;

    .line 38
    .line 39
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-boolean v0, p0, La/lx30;->d:Z

    .line 47
    .line 48
    iget-boolean v1, p1, La/lx30;->d:Z

    .line 49
    .line 50
    if-eq v0, v1, :cond_5

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_5
    iget-object v0, p0, La/lx30;->e:Ljava/util/List;

    .line 54
    .line 55
    iget-object v1, p1, La/lx30;->e:Ljava/util/List;

    .line 56
    .line 57
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_6

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_6
    iget-boolean v0, p0, La/lx30;->f:Z

    .line 65
    .line 66
    iget-boolean v1, p1, La/lx30;->f:Z

    .line 67
    .line 68
    if-eq v0, v1, :cond_7

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_7
    iget-boolean v0, p0, La/lx30;->g:Z

    .line 72
    .line 73
    iget-boolean v1, p1, La/lx30;->g:Z

    .line 74
    .line 75
    if-eq v0, v1, :cond_8

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_8
    iget-object v0, p0, La/lx30;->h:Ljava/util/List;

    .line 79
    .line 80
    iget-object v1, p1, La/lx30;->h:Ljava/util/List;

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
    iget-object v0, p0, La/lx30;->i:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 90
    .line 91
    iget-object v1, p1, La/lx30;->i:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 92
    .line 93
    if-eq v0, v1, :cond_a

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_a
    iget-boolean v0, p0, La/lx30;->j:Z

    .line 97
    .line 98
    iget-boolean v1, p1, La/lx30;->j:Z

    .line 99
    .line 100
    if-eq v0, v1, :cond_b

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_b
    iget-boolean v0, p0, La/lx30;->k:Z

    .line 104
    .line 105
    iget-boolean v1, p1, La/lx30;->k:Z

    .line 106
    .line 107
    if-eq v0, v1, :cond_c

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_c
    iget-boolean p0, p0, La/lx30;->l:Z

    .line 111
    .line 112
    iget-boolean p1, p1, La/lx30;->l:Z

    .line 113
    .line 114
    if-eq p0, p1, :cond_d

    .line 115
    .line 116
    :goto_0
    const/4 p0, 0x0

    .line 117
    return p0

    .line 118
    :cond_d
    :goto_1
    const/4 p0, 0x1

    .line 119
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/lx30;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

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
    const/4 v2, 0x0

    .line 11
    iget-object v3, p0, La/lx30;->b:La/ql5;

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    move v3, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v3}, La/ql5;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    :goto_0
    add-int/2addr v0, v3

    .line 22
    mul-int/2addr v0, v1

    .line 23
    iget-object v3, p0, La/lx30;->c:La/a5w;

    .line 24
    .line 25
    if-nez v3, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    :goto_1
    add-int/2addr v0, v2

    .line 33
    mul-int/2addr v0, v1

    .line 34
    iget-boolean v2, p0, La/lx30;->d:Z

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, La/lx30;->e:Ljava/util/List;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-boolean v2, p0, La/lx30;->f:Z

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-boolean v2, p0, La/lx30;->g:Z

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object v2, p0, La/lx30;->h:Ljava/util/List;

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object v2, p0, La/lx30;->i:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    add-int/2addr v2, v0

    .line 71
    mul-int/2addr v2, v1

    .line 72
    iget-boolean v0, p0, La/lx30;->j:Z

    .line 73
    .line 74
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iget-boolean v2, p0, La/lx30;->k:Z

    .line 79
    .line 80
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    iget-boolean p0, p0, La/lx30;->l:Z

    .line 85
    .line 86
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    add-int/2addr p0, v0

    .line 91
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "MenuBetHistoryState(betId="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/lx30;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", balanceModel="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/lx30;->b:La/ql5;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", historyModel="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/lx30;->c:La/a5w;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", marketGroupIdEnable="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-boolean v1, p0, La/lx30;->d:Z

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", eventModelList="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v1, ", showParsingNumber="

    .line 49
    .line 50
    const-string v2, ", hasBetSellPart="

    .line 51
    .line 52
    iget-object v3, p0, La/lx30;->e:Ljava/util/List;

    .line 53
    .line 54
    iget-boolean v4, p0, La/lx30;->f:Z

    .line 55
    .line 56
    invoke-static {v0, v1, v3, v2, v4}, La/rz4;->z(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    const-string v1, ", eventGroupsList="

    .line 60
    .line 61
    const-string v2, ", historyTypeModel="

    .line 62
    .line 63
    iget-object v3, p0, La/lx30;->h:Ljava/util/List;

    .line 64
    .line 65
    iget-boolean v4, p0, La/lx30;->g:Z

    .line 66
    .line 67
    invoke-static {v0, v1, v3, v2, v4}, La/vqd;->y(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V

    .line 68
    .line 69
    .line 70
    iget-object v1, p0, La/lx30;->i:Lorg/xplatform/bet_history/history/domain/model/HistoryTypeModel;

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v1, ", isNewEventParams="

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    iget-boolean v1, p0, La/lx30;->j:Z

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v1, ", logNewEventParams="

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v1, ", historySaleDsToggle="

    .line 91
    .line 92
    const-string v2, ")"

    .line 93
    .line 94
    iget-boolean v3, p0, La/lx30;->k:Z

    .line 95
    .line 96
    iget-boolean p0, p0, La/lx30;->l:Z

    .line 97
    .line 98
    invoke-static {v1, v2, v0, v3, p0}, La/ohs0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0
.end method
