.class public final La/sg20;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;

.field public final b:La/ky6;

.field public final c:La/ym5;

.field public final d:La/eo7;

.field public final e:La/qvj0;

.field public final f:La/ifc0;

.field public final g:La/ua20;

.field public final h:Z

.field public final i:Z

.field public final j:Z

.field public final k:I


# direct methods
.method public constructor <init>(Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;La/ky6;La/ym5;La/eo7;La/qvj0;La/ifc0;La/ua20;ZZZI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/sg20;->a:Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;

    .line 5
    .line 6
    iput-object p2, p0, La/sg20;->b:La/ky6;

    .line 7
    .line 8
    iput-object p3, p0, La/sg20;->c:La/ym5;

    .line 9
    .line 10
    iput-object p4, p0, La/sg20;->d:La/eo7;

    .line 11
    .line 12
    iput-object p5, p0, La/sg20;->e:La/qvj0;

    .line 13
    .line 14
    iput-object p6, p0, La/sg20;->f:La/ifc0;

    .line 15
    .line 16
    iput-object p7, p0, La/sg20;->g:La/ua20;

    .line 17
    .line 18
    iput-boolean p8, p0, La/sg20;->h:Z

    .line 19
    .line 20
    iput-boolean p9, p0, La/sg20;->i:Z

    .line 21
    .line 22
    iput-boolean p10, p0, La/sg20;->j:Z

    .line 23
    .line 24
    iput p11, p0, La/sg20;->k:I

    .line 25
    .line 26
    return-void
.end method

.method public static a(La/sg20;La/ky6;La/ym5;La/eo7;La/qvj0;La/ifc0;ZZZII)La/sg20;
    .locals 12

    .line 1
    move/from16 v0, p10

    .line 2
    .line 3
    iget-object v1, p0, La/sg20;->a:Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;

    .line 4
    .line 5
    and-int/lit8 v2, v0, 0x2

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, La/sg20;->b:La/ky6;

    .line 10
    .line 11
    :cond_0
    move-object v2, p1

    .line 12
    and-int/lit8 p1, v0, 0x4

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    iget-object p2, p0, La/sg20;->c:La/ym5;

    .line 17
    .line 18
    :cond_1
    move-object v3, p2

    .line 19
    and-int/lit8 p1, v0, 0x8

    .line 20
    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    iget-object p1, p0, La/sg20;->d:La/eo7;

    .line 24
    .line 25
    move-object v4, p1

    .line 26
    goto :goto_0

    .line 27
    :cond_2
    move-object v4, p3

    .line 28
    :goto_0
    and-int/lit8 p1, v0, 0x10

    .line 29
    .line 30
    if-eqz p1, :cond_3

    .line 31
    .line 32
    iget-object p1, p0, La/sg20;->e:La/qvj0;

    .line 33
    .line 34
    move-object v5, p1

    .line 35
    goto :goto_1

    .line 36
    :cond_3
    move-object/from16 v5, p4

    .line 37
    .line 38
    :goto_1
    and-int/lit8 p1, v0, 0x20

    .line 39
    .line 40
    if-eqz p1, :cond_4

    .line 41
    .line 42
    iget-object p1, p0, La/sg20;->f:La/ifc0;

    .line 43
    .line 44
    move-object v6, p1

    .line 45
    goto :goto_2

    .line 46
    :cond_4
    move-object/from16 v6, p5

    .line 47
    .line 48
    :goto_2
    iget-object v7, p0, La/sg20;->g:La/ua20;

    .line 49
    .line 50
    and-int/lit16 p1, v0, 0x80

    .line 51
    .line 52
    if-eqz p1, :cond_5

    .line 53
    .line 54
    iget-boolean p1, p0, La/sg20;->h:Z

    .line 55
    .line 56
    move v8, p1

    .line 57
    goto :goto_3

    .line 58
    :cond_5
    move/from16 v8, p6

    .line 59
    .line 60
    :goto_3
    and-int/lit16 p1, v0, 0x100

    .line 61
    .line 62
    if-eqz p1, :cond_6

    .line 63
    .line 64
    iget-boolean p1, p0, La/sg20;->i:Z

    .line 65
    .line 66
    move v9, p1

    .line 67
    goto :goto_4

    .line 68
    :cond_6
    move/from16 v9, p7

    .line 69
    .line 70
    :goto_4
    and-int/lit16 p1, v0, 0x200

    .line 71
    .line 72
    if-eqz p1, :cond_7

    .line 73
    .line 74
    iget-boolean p1, p0, La/sg20;->j:Z

    .line 75
    .line 76
    move v10, p1

    .line 77
    goto :goto_5

    .line 78
    :cond_7
    move/from16 v10, p8

    .line 79
    .line 80
    :goto_5
    and-int/lit16 p1, v0, 0x400

    .line 81
    .line 82
    if-eqz p1, :cond_8

    .line 83
    .line 84
    iget p1, p0, La/sg20;->k:I

    .line 85
    .line 86
    move v11, p1

    .line 87
    goto :goto_6

    .line 88
    :cond_8
    move/from16 v11, p9

    .line 89
    .line 90
    :goto_6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    new-instance v0, La/sg20;

    .line 97
    .line 98
    invoke-direct/range {v0 .. v11}, La/sg20;-><init>(Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;La/ky6;La/ym5;La/eo7;La/qvj0;La/ifc0;La/ua20;ZZZI)V

    .line 99
    .line 100
    .line 101
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
    instance-of v0, p1, La/sg20;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/sg20;

    .line 12
    .line 13
    iget-object v0, p0, La/sg20;->a:Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;

    .line 14
    .line 15
    iget-object v1, p1, La/sg20;->a:Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/sg20;->b:La/ky6;

    .line 25
    .line 26
    iget-object v1, p1, La/sg20;->b:La/ky6;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, La/ky6;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/sg20;->c:La/ym5;

    .line 36
    .line 37
    iget-object v1, p1, La/sg20;->c:La/ym5;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, La/ym5;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/sg20;->d:La/eo7;

    .line 47
    .line 48
    iget-object v1, p1, La/sg20;->d:La/eo7;

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
    iget-object v0, p0, La/sg20;->e:La/qvj0;

    .line 58
    .line 59
    iget-object v1, p1, La/sg20;->e:La/qvj0;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, La/qvj0;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/sg20;->f:La/ifc0;

    .line 69
    .line 70
    iget-object v1, p1, La/sg20;->f:La/ifc0;

    .line 71
    .line 72
    invoke-virtual {v0, v1}, La/ifc0;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/sg20;->g:La/ua20;

    .line 80
    .line 81
    iget-object v1, p1, La/sg20;->g:La/ua20;

    .line 82
    .line 83
    if-eq v0, v1, :cond_8

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_8
    iget-boolean v0, p0, La/sg20;->h:Z

    .line 87
    .line 88
    iget-boolean v1, p1, La/sg20;->h:Z

    .line 89
    .line 90
    if-eq v0, v1, :cond_9

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_9
    iget-boolean v0, p0, La/sg20;->i:Z

    .line 94
    .line 95
    iget-boolean v1, p1, La/sg20;->i:Z

    .line 96
    .line 97
    if-eq v0, v1, :cond_a

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_a
    iget-boolean v0, p0, La/sg20;->j:Z

    .line 101
    .line 102
    iget-boolean v1, p1, La/sg20;->j:Z

    .line 103
    .line 104
    if-eq v0, v1, :cond_b

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_b
    iget p0, p0, La/sg20;->k:I

    .line 108
    .line 109
    iget p1, p1, La/sg20;->k:I

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
    iget-object v0, p0, La/sg20;->a:Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->hashCode()I

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
    iget-object v2, p0, La/sg20;->b:La/ky6;

    .line 11
    .line 12
    invoke-virtual {v2}, La/ky6;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, La/sg20;->c:La/ym5;

    .line 19
    .line 20
    invoke-virtual {v0}, La/ym5;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    iget-object v2, p0, La/sg20;->d:La/eo7;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    add-int/2addr v2, v0

    .line 33
    mul-int/2addr v2, v1

    .line 34
    iget-object v0, p0, La/sg20;->e:La/qvj0;

    .line 35
    .line 36
    invoke-virtual {v0}, La/qvj0;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    add-int/2addr v0, v2

    .line 41
    mul-int/2addr v0, v1

    .line 42
    iget-object v2, p0, La/sg20;->f:La/ifc0;

    .line 43
    .line 44
    invoke-virtual {v2}, La/ifc0;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    add-int/2addr v2, v0

    .line 49
    mul-int/2addr v2, v1

    .line 50
    iget-object v0, p0, La/sg20;->g:La/ua20;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    add-int/2addr v0, v2

    .line 57
    mul-int/2addr v0, v1

    .line 58
    iget-boolean v2, p0, La/sg20;->h:Z

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-boolean v2, p0, La/sg20;->i:Z

    .line 65
    .line 66
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-boolean v2, p0, La/sg20;->j:Z

    .line 71
    .line 72
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget p0, p0, La/sg20;->k:I

    .line 77
    .line 78
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    add-int/2addr p0, v0

    .line 83
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "MakeBetStateModel(finBetInfoModel="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/sg20;->a:Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", betGameInfo="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/sg20;->b:La/ky6;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", balanceState="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/sg20;->c:La/ym5;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", betTypeStateModel="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/sg20;->d:La/eo7;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", simpleBetState="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, La/sg20;->e:La/qvj0;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", promoCodeState="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, La/sg20;->f:La/ifc0;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", styleType="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, La/sg20;->g:La/ua20;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v1, ", isTaxStatusInitialized="

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-boolean v1, p0, La/sg20;->h:Z

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v1, ", isTaxLoaded="

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v1, ", isAuthorized="

    .line 89
    .line 90
    const-string v2, ", tabsCount="

    .line 91
    .line 92
    iget-boolean v3, p0, La/sg20;->i:Z

    .line 93
    .line 94
    iget-boolean v4, p0, La/sg20;->j:Z

    .line 95
    .line 96
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 97
    .line 98
    .line 99
    const-string v1, ")"

    .line 100
    .line 101
    iget p0, p0, La/sg20;->k:I

    .line 102
    .line 103
    invoke-static {p0, v1, v0}, La/rz4;->j(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0
.end method
