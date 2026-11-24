.class public final La/pwq0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z

.field public final d:Z

.field public final e:Ljava/lang/String;

.field public final f:Ljava/util/List;

.field public final g:Z

.field public final h:Z

.field public final i:Z

.field public final j:Z

.field public final k:I

.field public final l:La/hao0;

.field public final m:Z


# direct methods
.method public constructor <init>(ZZZZLjava/lang/String;Ljava/util/List;ZZZZILa/hao0;Z)V
    .locals 0

    .line 1
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-boolean p1, p0, La/pwq0;->a:Z

    .line 8
    .line 9
    iput-boolean p2, p0, La/pwq0;->b:Z

    .line 10
    .line 11
    iput-boolean p3, p0, La/pwq0;->c:Z

    .line 12
    .line 13
    iput-boolean p4, p0, La/pwq0;->d:Z

    .line 14
    .line 15
    iput-object p5, p0, La/pwq0;->e:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p6, p0, La/pwq0;->f:Ljava/util/List;

    .line 18
    .line 19
    iput-boolean p7, p0, La/pwq0;->g:Z

    .line 20
    .line 21
    iput-boolean p8, p0, La/pwq0;->h:Z

    .line 22
    .line 23
    iput-boolean p9, p0, La/pwq0;->i:Z

    .line 24
    .line 25
    iput-boolean p10, p0, La/pwq0;->j:Z

    .line 26
    .line 27
    iput p11, p0, La/pwq0;->k:I

    .line 28
    .line 29
    iput-object p12, p0, La/pwq0;->l:La/hao0;

    .line 30
    .line 31
    iput-boolean p13, p0, La/pwq0;->m:Z

    .line 32
    .line 33
    return-void
.end method

.method public static a(La/pwq0;ZLjava/lang/String;Ljava/util/List;ZZZZILa/hao0;ZI)La/pwq0;
    .locals 14

    .line 1
    move/from16 v0, p11

    .line 2
    .line 3
    iget-boolean v1, p0, La/pwq0;->a:Z

    .line 4
    .line 5
    iget-boolean v2, p0, La/pwq0;->b:Z

    .line 6
    .line 7
    iget-boolean v3, p0, La/pwq0;->c:Z

    .line 8
    .line 9
    and-int/lit8 v4, v0, 0x8

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    iget-boolean v4, p0, La/pwq0;->d:Z

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v4, p1

    .line 17
    :goto_0
    and-int/lit8 v5, v0, 0x10

    .line 18
    .line 19
    if-eqz v5, :cond_1

    .line 20
    .line 21
    iget-object v5, p0, La/pwq0;->e:Ljava/lang/String;

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move-object/from16 v5, p2

    .line 25
    .line 26
    :goto_1
    and-int/lit8 v6, v0, 0x20

    .line 27
    .line 28
    if-eqz v6, :cond_2

    .line 29
    .line 30
    iget-object v6, p0, La/pwq0;->f:Ljava/util/List;

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_2
    move-object/from16 v6, p3

    .line 34
    .line 35
    :goto_2
    and-int/lit8 v7, v0, 0x40

    .line 36
    .line 37
    if-eqz v7, :cond_3

    .line 38
    .line 39
    iget-boolean v7, p0, La/pwq0;->g:Z

    .line 40
    .line 41
    goto :goto_3

    .line 42
    :cond_3
    move/from16 v7, p4

    .line 43
    .line 44
    :goto_3
    and-int/lit16 v8, v0, 0x80

    .line 45
    .line 46
    if-eqz v8, :cond_4

    .line 47
    .line 48
    iget-boolean v8, p0, La/pwq0;->h:Z

    .line 49
    .line 50
    goto :goto_4

    .line 51
    :cond_4
    move/from16 v8, p5

    .line 52
    .line 53
    :goto_4
    and-int/lit16 v9, v0, 0x100

    .line 54
    .line 55
    if-eqz v9, :cond_5

    .line 56
    .line 57
    iget-boolean v9, p0, La/pwq0;->i:Z

    .line 58
    .line 59
    goto :goto_5

    .line 60
    :cond_5
    move/from16 v9, p6

    .line 61
    .line 62
    :goto_5
    and-int/lit16 v10, v0, 0x200

    .line 63
    .line 64
    if-eqz v10, :cond_6

    .line 65
    .line 66
    iget-boolean v10, p0, La/pwq0;->j:Z

    .line 67
    .line 68
    goto :goto_6

    .line 69
    :cond_6
    move/from16 v10, p7

    .line 70
    .line 71
    :goto_6
    and-int/lit16 v11, v0, 0x400

    .line 72
    .line 73
    if-eqz v11, :cond_7

    .line 74
    .line 75
    iget v11, p0, La/pwq0;->k:I

    .line 76
    .line 77
    goto :goto_7

    .line 78
    :cond_7
    move/from16 v11, p8

    .line 79
    .line 80
    :goto_7
    and-int/lit16 v12, v0, 0x800

    .line 81
    .line 82
    if-eqz v12, :cond_8

    .line 83
    .line 84
    iget-object v12, p0, La/pwq0;->l:La/hao0;

    .line 85
    .line 86
    goto :goto_8

    .line 87
    :cond_8
    move-object/from16 v12, p9

    .line 88
    .line 89
    :goto_8
    and-int/lit16 v0, v0, 0x1000

    .line 90
    .line 91
    if-eqz v0, :cond_9

    .line 92
    .line 93
    iget-boolean v0, p0, La/pwq0;->m:Z

    .line 94
    .line 95
    move v13, v0

    .line 96
    goto :goto_9

    .line 97
    :cond_9
    move/from16 v13, p10

    .line 98
    .line 99
    :goto_9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    new-instance v0, La/pwq0;

    .line 109
    .line 110
    invoke-direct/range {v0 .. v13}, La/pwq0;-><init>(ZZZZLjava/lang/String;Ljava/util/List;ZZZZILa/hao0;Z)V

    .line 111
    .line 112
    .line 113
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
    instance-of v0, p1, La/pwq0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/pwq0;

    .line 12
    .line 13
    iget-boolean v0, p0, La/pwq0;->a:Z

    .line 14
    .line 15
    iget-boolean v1, p1, La/pwq0;->a:Z

    .line 16
    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :cond_2
    iget-boolean v0, p0, La/pwq0;->b:Z

    .line 22
    .line 23
    iget-boolean v1, p1, La/pwq0;->b:Z

    .line 24
    .line 25
    if-eq v0, v1, :cond_3

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_3
    iget-boolean v0, p0, La/pwq0;->c:Z

    .line 29
    .line 30
    iget-boolean v1, p1, La/pwq0;->c:Z

    .line 31
    .line 32
    if-eq v0, v1, :cond_4

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_4
    iget-boolean v0, p0, La/pwq0;->d:Z

    .line 36
    .line 37
    iget-boolean v1, p1, La/pwq0;->d:Z

    .line 38
    .line 39
    if-eq v0, v1, :cond_5

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_5
    iget-object v0, p0, La/pwq0;->e:Ljava/lang/String;

    .line 43
    .line 44
    iget-object v1, p1, La/pwq0;->e:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_6

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_6
    iget-object v0, p0, La/pwq0;->f:Ljava/util/List;

    .line 54
    .line 55
    iget-object v1, p1, La/pwq0;->f:Ljava/util/List;

    .line 56
    .line 57
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_7

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_7
    iget-boolean v0, p0, La/pwq0;->g:Z

    .line 65
    .line 66
    iget-boolean v1, p1, La/pwq0;->g:Z

    .line 67
    .line 68
    if-eq v0, v1, :cond_8

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_8
    iget-boolean v0, p0, La/pwq0;->h:Z

    .line 72
    .line 73
    iget-boolean v1, p1, La/pwq0;->h:Z

    .line 74
    .line 75
    if-eq v0, v1, :cond_9

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_9
    iget-boolean v0, p0, La/pwq0;->i:Z

    .line 79
    .line 80
    iget-boolean v1, p1, La/pwq0;->i:Z

    .line 81
    .line 82
    if-eq v0, v1, :cond_a

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_a
    iget-boolean v0, p0, La/pwq0;->j:Z

    .line 86
    .line 87
    iget-boolean v1, p1, La/pwq0;->j:Z

    .line 88
    .line 89
    if-eq v0, v1, :cond_b

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_b
    iget v0, p0, La/pwq0;->k:I

    .line 93
    .line 94
    iget v1, p1, La/pwq0;->k:I

    .line 95
    .line 96
    if-eq v0, v1, :cond_c

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_c
    iget-object v0, p0, La/pwq0;->l:La/hao0;

    .line 100
    .line 101
    iget-object v1, p1, La/pwq0;->l:La/hao0;

    .line 102
    .line 103
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-nez v0, :cond_d

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_d
    iget-boolean p0, p0, La/pwq0;->m:Z

    .line 111
    .line 112
    iget-boolean p1, p1, La/pwq0;->m:Z

    .line 113
    .line 114
    if-eq p0, p1, :cond_e

    .line 115
    .line 116
    :goto_0
    const/4 p0, 0x0

    .line 117
    return p0

    .line 118
    :cond_e
    :goto_1
    const/4 p0, 0x1

    .line 119
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, La/pwq0;->a:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

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
    iget-boolean v2, p0, La/pwq0;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, La/pwq0;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-boolean v2, p0, La/pwq0;->d:Z

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/pwq0;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/pwq0;->f:Ljava/util/List;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-boolean v2, p0, La/pwq0;->g:Z

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-boolean v2, p0, La/pwq0;->h:Z

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-boolean v2, p0, La/pwq0;->i:Z

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-boolean v2, p0, La/pwq0;->j:Z

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget v2, p0, La/pwq0;->k:I

    .line 65
    .line 66
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-object v2, p0, La/pwq0;->l:La/hao0;

    .line 71
    .line 72
    if-nez v2, :cond_0

    .line 73
    .line 74
    const/4 v2, 0x0

    .line 75
    goto :goto_0

    .line 76
    :cond_0
    invoke-virtual {v2}, La/hao0;->hashCode()I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    :goto_0
    add-int/2addr v0, v2

    .line 81
    mul-int/2addr v0, v1

    .line 82
    iget-boolean p0, p0, La/pwq0;->m:Z

    .line 83
    .line 84
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    add-int/2addr p0, v0

    .line 89
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", showMakeBetSettings="

    .line 2
    .line 3
    const-string v1, ", showRemoveCoupon="

    .line 4
    .line 5
    const-string v2, "ToolbarUiState(showChooseBetSystem="

    .line 6
    .line 7
    iget-boolean v3, p0, La/pwq0;->a:Z

    .line 8
    .line 9
    iget-boolean v4, p0, La/pwq0;->b:Z

    .line 10
    .line 11
    invoke-static {v2, v0, v1, v3, v4}, La/f140;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", authorized="

    .line 16
    .line 17
    const-string v2, ", title="

    .line 18
    .line 19
    iget-boolean v3, p0, La/pwq0;->c:Z

    .line 20
    .line 21
    iget-boolean v4, p0, La/pwq0;->d:Z

    .line 22
    .line 23
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", couponTypesUiModelList="

    .line 27
    .line 28
    const-string v2, ", canChooseCouponType="

    .line 29
    .line 30
    iget-object v3, p0, La/pwq0;->e:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v4, p0, La/pwq0;->f:Ljava/util/List;

    .line 33
    .line 34
    invoke-static {v3, v1, v2, v0, v4}, La/cs0;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 35
    .line 36
    .line 37
    const-string v1, ", hasActions="

    .line 38
    .line 39
    const-string v2, ", needToInflateMenu="

    .line 40
    .line 41
    iget-boolean v3, p0, La/pwq0;->g:Z

    .line 42
    .line 43
    iget-boolean v4, p0, La/pwq0;->h:Z

    .line 44
    .line 45
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 46
    .line 47
    .line 48
    const-string v1, ", iconTitleVisible="

    .line 49
    .line 50
    const-string v2, ", menuId="

    .line 51
    .line 52
    iget-boolean v3, p0, La/pwq0;->i:Z

    .line 53
    .line 54
    iget-boolean v4, p0, La/pwq0;->j:Z

    .line 55
    .line 56
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 57
    .line 58
    .line 59
    iget v1, p0, La/pwq0;->k:I

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v1, ", systemTypeUiModel="

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget-object v1, p0, La/pwq0;->l:La/hao0;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v1, ", hasCustomCouponTypeMenu="

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v1, ")"

    .line 80
    .line 81
    iget-boolean p0, p0, La/pwq0;->m:Z

    .line 82
    .line 83
    invoke-static {v0, p0, v1}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0
.end method
