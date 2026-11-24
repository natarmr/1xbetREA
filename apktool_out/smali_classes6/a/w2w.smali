.class public final La/w2w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public final c:Z

.field public final d:Ljava/lang/String;

.field public final e:La/dx;

.field public final f:La/w2q;

.field public final g:La/ga50;

.field public final h:La/llm;

.field public final i:La/gmm;

.field public final j:La/tlm;

.field public final k:Ljava/lang/String;

.field public final l:Z

.field public final m:I

.field public final n:La/a4x;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZZLjava/lang/String;La/dx;La/w2q;La/ga50;La/llm;La/gmm;La/tlm;Ljava/lang/String;ZILa/a4x;)V
    .locals 0

    .line 1
    invoke-static {p14, p1, p11}, La/w6x;->x(La/a4x;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/w2w;->a:Ljava/lang/String;

    .line 8
    .line 9
    iput-boolean p2, p0, La/w2w;->b:Z

    .line 10
    .line 11
    iput-boolean p3, p0, La/w2w;->c:Z

    .line 12
    .line 13
    iput-object p4, p0, La/w2w;->d:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p5, p0, La/w2w;->e:La/dx;

    .line 16
    .line 17
    iput-object p6, p0, La/w2w;->f:La/w2q;

    .line 18
    .line 19
    iput-object p7, p0, La/w2w;->g:La/ga50;

    .line 20
    .line 21
    iput-object p8, p0, La/w2w;->h:La/llm;

    .line 22
    .line 23
    iput-object p9, p0, La/w2w;->i:La/gmm;

    .line 24
    .line 25
    iput-object p10, p0, La/w2w;->j:La/tlm;

    .line 26
    .line 27
    iput-object p11, p0, La/w2w;->k:Ljava/lang/String;

    .line 28
    .line 29
    iput-boolean p12, p0, La/w2w;->l:Z

    .line 30
    .line 31
    iput p13, p0, La/w2w;->m:I

    .line 32
    .line 33
    iput-object p14, p0, La/w2w;->n:La/a4x;

    .line 34
    .line 35
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
    instance-of v0, p1, La/w2w;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/w2w;

    .line 12
    .line 13
    iget-object v0, p0, La/w2w;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, La/w2w;->a:Ljava/lang/String;

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
    iget-boolean v0, p0, La/w2w;->b:Z

    .line 26
    .line 27
    iget-boolean v1, p1, La/w2w;->b:Z

    .line 28
    .line 29
    if-eq v0, v1, :cond_3

    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :cond_3
    iget-boolean v0, p0, La/w2w;->c:Z

    .line 34
    .line 35
    iget-boolean v1, p1, La/w2w;->c:Z

    .line 36
    .line 37
    if-eq v0, v1, :cond_4

    .line 38
    .line 39
    goto/16 :goto_0

    .line 40
    .line 41
    :cond_4
    iget-object v0, p0, La/w2w;->d:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v1, p1, La/w2w;->d:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_5

    .line 50
    .line 51
    goto/16 :goto_0

    .line 52
    .line 53
    :cond_5
    iget-object v0, p0, La/w2w;->e:La/dx;

    .line 54
    .line 55
    iget-object v1, p1, La/w2w;->e:La/dx;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, La/dx;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/w2w;->f:La/w2q;

    .line 65
    .line 66
    iget-object v1, p1, La/w2w;->f:La/w2q;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, La/w2q;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_7

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_7
    iget-object v0, p0, La/w2w;->g:La/ga50;

    .line 76
    .line 77
    iget-object v1, p1, La/w2w;->g:La/ga50;

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_8

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_8
    iget-object v0, p0, La/w2w;->h:La/llm;

    .line 87
    .line 88
    iget-object v1, p1, La/w2w;->h:La/llm;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-nez v0, :cond_9

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_9
    iget-object v0, p0, La/w2w;->i:La/gmm;

    .line 98
    .line 99
    iget-object v1, p1, La/w2w;->i:La/gmm;

    .line 100
    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-nez v0, :cond_a

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_a
    iget-object v0, p0, La/w2w;->j:La/tlm;

    .line 109
    .line 110
    iget-object v1, p1, La/w2w;->j:La/tlm;

    .line 111
    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-nez v0, :cond_b

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_b
    iget-object v0, p0, La/w2w;->k:Ljava/lang/String;

    .line 120
    .line 121
    iget-object v1, p1, La/w2w;->k:Ljava/lang/String;

    .line 122
    .line 123
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-nez v0, :cond_c

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_c
    iget-boolean v0, p0, La/w2w;->l:Z

    .line 131
    .line 132
    iget-boolean v1, p1, La/w2w;->l:Z

    .line 133
    .line 134
    if-eq v0, v1, :cond_d

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_d
    iget v0, p0, La/w2w;->m:I

    .line 138
    .line 139
    iget v1, p1, La/w2w;->m:I

    .line 140
    .line 141
    if-eq v0, v1, :cond_e

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_e
    iget-object p0, p0, La/w2w;->n:La/a4x;

    .line 145
    .line 146
    iget-object p1, p1, La/w2w;->n:La/a4x;

    .line 147
    .line 148
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result p0

    .line 152
    if-nez p0, :cond_f

    .line 153
    .line 154
    :goto_0
    const/4 p0, 0x0

    .line 155
    return p0

    .line 156
    :cond_f
    :goto_1
    const/4 p0, 0x1

    .line 157
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/w2w;->a:Ljava/lang/String;

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
    iget-boolean v2, p0, La/w2w;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, La/w2w;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/w2w;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/w2w;->e:La/dx;

    .line 29
    .line 30
    invoke-virtual {v2}, La/dx;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    add-int/2addr v2, v0

    .line 35
    mul-int/2addr v2, v1

    .line 36
    iget-object v0, p0, La/w2w;->f:La/w2q;

    .line 37
    .line 38
    invoke-virtual {v0}, La/w2q;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    add-int/2addr v0, v2

    .line 43
    mul-int/2addr v0, v1

    .line 44
    iget-object v2, p0, La/w2w;->g:La/ga50;

    .line 45
    .line 46
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    add-int/2addr v2, v0

    .line 51
    mul-int/2addr v2, v1

    .line 52
    iget-object v0, p0, La/w2w;->h:La/llm;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    add-int/2addr v0, v2

    .line 59
    mul-int/2addr v0, v1

    .line 60
    iget-object v2, p0, La/w2w;->i:La/gmm;

    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    add-int/2addr v2, v0

    .line 67
    mul-int/2addr v2, v1

    .line 68
    iget-object v0, p0, La/w2w;->j:La/tlm;

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    add-int/2addr v0, v2

    .line 75
    mul-int/2addr v0, v1

    .line 76
    iget-object v2, p0, La/w2w;->k:Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget-boolean v2, p0, La/w2w;->l:Z

    .line 83
    .line 84
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iget v2, p0, La/w2w;->m:I

    .line 89
    .line 90
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    iget-object p0, p0, La/w2w;->n:La/a4x;

    .line 95
    .line 96
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    add-int/2addr p0, v0

    .line 101
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", isAdditionalInfoShimmer="

    .line 2
    .line 3
    const-string v1, ", expandableState="

    .line 4
    .line 5
    const-string v2, "HistoryHeaderUiModel(historyTitle="

    .line 6
    .line 7
    iget-object v3, p0, La/w2w;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-boolean v4, p0, La/w2w;->b:Z

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, La/brm0;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", balanceTitle="

    .line 16
    .line 17
    const-string v2, ", additionalButtonsUiModel="

    .line 18
    .line 19
    iget-object v3, p0, La/w2w;->d:Ljava/lang/String;

    .line 20
    .line 21
    iget-boolean v4, p0, La/w2w;->c:Z

    .line 22
    .line 23
    invoke-static {v1, v3, v2, v0, v4}, La/f140;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, La/w2w;->e:La/dx;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, ", filterButtonUiModel="

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, La/w2w;->f:La/w2q;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v1, ", arrowNavBarMiddleOptions="

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, La/w2w;->g:La/ga50;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v1, ", arrowBackNavigationBarLeftStyle="

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, La/w2w;->h:La/llm;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v1, ", navigationBarRightStyle="

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, La/w2w;->i:La/gmm;

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v1, ", middleNavBarStyle="

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    iget-object v1, p0, La/w2w;->j:La/tlm;

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const-string v1, ", typeSubtitle="

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v1, ", chevronIsVisible="

    .line 87
    .line 88
    const-string v2, ", selectedTab="

    .line 89
    .line 90
    iget-object v3, p0, La/w2w;->k:Ljava/lang/String;

    .line 91
    .line 92
    iget-boolean v4, p0, La/w2w;->l:Z

    .line 93
    .line 94
    invoke-static {v3, v1, v2, v0, v4}, La/brm0;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 95
    .line 96
    .line 97
    iget v1, p0, La/w2w;->m:I

    .line 98
    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v1, ", historyTypeTabList="

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    iget-object p0, p0, La/w2w;->n:La/a4x;

    .line 108
    .line 109
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string p0, ")"

    .line 113
    .line 114
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    return-object p0
.end method
