.class public final La/bzj0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public final c:La/ank0;

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field public final j:Lorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;

.field public final k:Z

.field public final l:Z

.field public final m:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLa/ank0;ZZZZZZLorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;ZZLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/bzj0;->a:Ljava/lang/String;

    .line 8
    .line 9
    iput-boolean p2, p0, La/bzj0;->b:Z

    .line 10
    .line 11
    iput-object p3, p0, La/bzj0;->c:La/ank0;

    .line 12
    .line 13
    iput-boolean p4, p0, La/bzj0;->d:Z

    .line 14
    .line 15
    iput-boolean p5, p0, La/bzj0;->e:Z

    .line 16
    .line 17
    iput-boolean p6, p0, La/bzj0;->f:Z

    .line 18
    .line 19
    iput-boolean p7, p0, La/bzj0;->g:Z

    .line 20
    .line 21
    iput-boolean p8, p0, La/bzj0;->h:Z

    .line 22
    .line 23
    iput-boolean p9, p0, La/bzj0;->i:Z

    .line 24
    .line 25
    iput-object p10, p0, La/bzj0;->j:Lorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;

    .line 26
    .line 27
    iput-boolean p11, p0, La/bzj0;->k:Z

    .line 28
    .line 29
    iput-boolean p12, p0, La/bzj0;->l:Z

    .line 30
    .line 31
    iput-object p13, p0, La/bzj0;->m:Ljava/lang/String;

    .line 32
    .line 33
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
    instance-of v0, p1, La/bzj0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/bzj0;

    .line 12
    .line 13
    iget-object v0, p0, La/bzj0;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, La/bzj0;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-boolean v0, p0, La/bzj0;->b:Z

    .line 26
    .line 27
    iget-boolean v1, p1, La/bzj0;->b:Z

    .line 28
    .line 29
    if-eq v0, v1, :cond_3

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_3
    iget-object v0, p0, La/bzj0;->c:La/ank0;

    .line 33
    .line 34
    iget-object v1, p1, La/bzj0;->c:La/ank0;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, La/ank0;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_4

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_4
    iget-boolean v0, p0, La/bzj0;->d:Z

    .line 44
    .line 45
    iget-boolean v1, p1, La/bzj0;->d:Z

    .line 46
    .line 47
    if-eq v0, v1, :cond_5

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_5
    iget-boolean v0, p0, La/bzj0;->e:Z

    .line 51
    .line 52
    iget-boolean v1, p1, La/bzj0;->e:Z

    .line 53
    .line 54
    if-eq v0, v1, :cond_6

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_6
    iget-boolean v0, p0, La/bzj0;->f:Z

    .line 58
    .line 59
    iget-boolean v1, p1, La/bzj0;->f:Z

    .line 60
    .line 61
    if-eq v0, v1, :cond_7

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_7
    iget-boolean v0, p0, La/bzj0;->g:Z

    .line 65
    .line 66
    iget-boolean v1, p1, La/bzj0;->g:Z

    .line 67
    .line 68
    if-eq v0, v1, :cond_8

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_8
    iget-boolean v0, p0, La/bzj0;->h:Z

    .line 72
    .line 73
    iget-boolean v1, p1, La/bzj0;->h:Z

    .line 74
    .line 75
    if-eq v0, v1, :cond_9

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_9
    iget-boolean v0, p0, La/bzj0;->i:Z

    .line 79
    .line 80
    iget-boolean v1, p1, La/bzj0;->i:Z

    .line 81
    .line 82
    if-eq v0, v1, :cond_a

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_a
    iget-object v0, p0, La/bzj0;->j:Lorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;

    .line 86
    .line 87
    iget-object v1, p1, La/bzj0;->j:Lorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;

    .line 88
    .line 89
    invoke-virtual {v0, v1}, Lorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-nez v0, :cond_b

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_b
    iget-boolean v0, p0, La/bzj0;->k:Z

    .line 97
    .line 98
    iget-boolean v1, p1, La/bzj0;->k:Z

    .line 99
    .line 100
    if-eq v0, v1, :cond_c

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_c
    iget-boolean v0, p0, La/bzj0;->l:Z

    .line 104
    .line 105
    iget-boolean v1, p1, La/bzj0;->l:Z

    .line 106
    .line 107
    if-eq v0, v1, :cond_d

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_d
    iget-object p0, p0, La/bzj0;->m:Ljava/lang/String;

    .line 111
    .line 112
    iget-object p1, p1, La/bzj0;->m:Ljava/lang/String;

    .line 113
    .line 114
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    if-nez p0, :cond_e

    .line 119
    .line 120
    :goto_0
    const/4 p0, 0x0

    .line 121
    return p0

    .line 122
    :cond_e
    :goto_1
    const/4 p0, 0x1

    .line 123
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/bzj0;->a:Ljava/lang/String;

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
    iget-boolean v2, p0, La/bzj0;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/bzj0;->c:La/ank0;

    .line 17
    .line 18
    iget-object v2, v2, La/ank0;->a:Ljava/util/List;

    .line 19
    .line 20
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-boolean v2, p0, La/bzj0;->d:Z

    .line 25
    .line 26
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-boolean v2, p0, La/bzj0;->e:Z

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-boolean v2, p0, La/bzj0;->f:Z

    .line 37
    .line 38
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-boolean v2, p0, La/bzj0;->g:Z

    .line 43
    .line 44
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-boolean v2, p0, La/bzj0;->h:Z

    .line 49
    .line 50
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget-boolean v2, p0, La/bzj0;->i:Z

    .line 55
    .line 56
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget-object v2, p0, La/bzj0;->j:Lorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;

    .line 61
    .line 62
    invoke-virtual {v2}, Lorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;->hashCode()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    add-int/2addr v2, v0

    .line 67
    mul-int/2addr v2, v1

    .line 68
    iget-boolean v0, p0, La/bzj0;->k:Z

    .line 69
    .line 70
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iget-boolean v2, p0, La/bzj0;->l:Z

    .line 75
    .line 76
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iget-object p0, p0, La/bzj0;->m:Ljava/lang/String;

    .line 81
    .line 82
    if-nez p0, :cond_0

    .line 83
    .line 84
    const/4 p0, 0x0

    .line 85
    goto :goto_0

    .line 86
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    :goto_0
    add-int/2addr v0, p0

    .line 91
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", isUserInput="

    .line 2
    .line 3
    const-string v1, ", limitsText="

    .line 4
    .line 5
    const-string v2, "SimpleStepInputState(currentValueText="

    .line 6
    .line 7
    iget-object v3, p0, La/bzj0;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-boolean v4, p0, La/bzj0;->b:Z

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, La/brm0;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, La/bzj0;->c:La/ank0;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", isStepControlsVisible="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-boolean v1, p0, La/bzj0;->d:Z

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", isStepUpEnabled="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, ", isStepDownEnabled="

    .line 36
    .line 37
    const-string v2, ", isActionButtonEnabled="

    .line 38
    .line 39
    iget-boolean v3, p0, La/bzj0;->e:Z

    .line 40
    .line 41
    iget-boolean v4, p0, La/bzj0;->f:Z

    .line 42
    .line 43
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 44
    .line 45
    .line 46
    const-string v1, ", isEditFieldEnabled="

    .line 47
    .line 48
    const-string v2, ", isVipBet="

    .line 49
    .line 50
    iget-boolean v3, p0, La/bzj0;->g:Z

    .line 51
    .line 52
    iget-boolean v4, p0, La/bzj0;->h:Z

    .line 53
    .line 54
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 55
    .line 56
    .line 57
    iget-boolean v1, p0, La/bzj0;->i:Z

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v1, ", autoMaxUiModel="

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, La/bzj0;->j:Lorg/xplatform/make_bet/impl/presentation/model/AutoMaxUiModel;

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v1, ", showError="

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v1, ", isLoading="

    .line 78
    .line 79
    const-string v2, ", eachWayBadge="

    .line 80
    .line 81
    iget-boolean v3, p0, La/bzj0;->k:Z

    .line 82
    .line 83
    iget-boolean v4, p0, La/bzj0;->l:Z

    .line 84
    .line 85
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 86
    .line 87
    .line 88
    const-string v1, ")"

    .line 89
    .line 90
    iget-object p0, p0, La/bzj0;->m:Ljava/lang/String;

    .line 91
    .line 92
    invoke-static {v0, p0, v1}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0
.end method
