.class public final La/sig;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;

.field public final b:La/sip;

.field public final c:La/sff0;

.field public final d:Ljava/util/List;

.field public final e:Z

.field public final f:Z

.field public final g:La/wcb;

.field public final h:La/mig;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/util/List;

.field public final k:Z

.field public final l:Ljava/util/List;


# direct methods
.method public constructor <init>(Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;La/sip;La/sff0;Ljava/util/List;ZZLa/wcb;La/mig;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, La/sig;->a:Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;

    .line 20
    .line 21
    iput-object p2, p0, La/sig;->b:La/sip;

    .line 22
    .line 23
    iput-object p3, p0, La/sig;->c:La/sff0;

    .line 24
    .line 25
    iput-object p4, p0, La/sig;->d:Ljava/util/List;

    .line 26
    .line 27
    iput-boolean p5, p0, La/sig;->e:Z

    .line 28
    .line 29
    iput-boolean p6, p0, La/sig;->f:Z

    .line 30
    .line 31
    iput-object p7, p0, La/sig;->g:La/wcb;

    .line 32
    .line 33
    iput-object p8, p0, La/sig;->h:La/mig;

    .line 34
    .line 35
    iput-object p9, p0, La/sig;->i:Ljava/lang/String;

    .line 36
    .line 37
    iput-object p10, p0, La/sig;->j:Ljava/util/List;

    .line 38
    .line 39
    iput-boolean p11, p0, La/sig;->k:Z

    .line 40
    .line 41
    iput-object p12, p0, La/sig;->l:Ljava/util/List;

    .line 42
    .line 43
    return-void
.end method

.method public static a(La/sig;ZLa/wcb;La/mig;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;I)La/sig;
    .locals 13

    .line 1
    move/from16 v0, p8

    .line 2
    .line 3
    iget-object v1, p0, La/sig;->a:Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;

    .line 4
    .line 5
    iget-object v2, p0, La/sig;->b:La/sip;

    .line 6
    .line 7
    iget-object v3, p0, La/sig;->c:La/sff0;

    .line 8
    .line 9
    iget-object v4, p0, La/sig;->d:Ljava/util/List;

    .line 10
    .line 11
    iget-boolean v5, p0, La/sig;->e:Z

    .line 12
    .line 13
    and-int/lit8 v6, v0, 0x20

    .line 14
    .line 15
    if-eqz v6, :cond_0

    .line 16
    .line 17
    iget-boolean p1, p0, La/sig;->f:Z

    .line 18
    .line 19
    :cond_0
    move v6, p1

    .line 20
    and-int/lit8 p1, v0, 0x40

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    iget-object p1, p0, La/sig;->g:La/wcb;

    .line 25
    .line 26
    move-object v7, p1

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move-object v7, p2

    .line 29
    :goto_0
    and-int/lit16 p1, v0, 0x80

    .line 30
    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    iget-object p1, p0, La/sig;->h:La/mig;

    .line 34
    .line 35
    move-object v8, p1

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    move-object/from16 v8, p3

    .line 38
    .line 39
    :goto_1
    and-int/lit16 p1, v0, 0x100

    .line 40
    .line 41
    if-eqz p1, :cond_3

    .line 42
    .line 43
    iget-object p1, p0, La/sig;->i:Ljava/lang/String;

    .line 44
    .line 45
    move-object v9, p1

    .line 46
    goto :goto_2

    .line 47
    :cond_3
    move-object/from16 v9, p4

    .line 48
    .line 49
    :goto_2
    and-int/lit16 p1, v0, 0x200

    .line 50
    .line 51
    if-eqz p1, :cond_4

    .line 52
    .line 53
    iget-object p1, p0, La/sig;->j:Ljava/util/List;

    .line 54
    .line 55
    move-object v10, p1

    .line 56
    goto :goto_3

    .line 57
    :cond_4
    move-object/from16 v10, p5

    .line 58
    .line 59
    :goto_3
    and-int/lit16 p1, v0, 0x400

    .line 60
    .line 61
    if-eqz p1, :cond_5

    .line 62
    .line 63
    iget-boolean p1, p0, La/sig;->k:Z

    .line 64
    .line 65
    move v11, p1

    .line 66
    goto :goto_4

    .line 67
    :cond_5
    move/from16 v11, p6

    .line 68
    .line 69
    :goto_4
    and-int/lit16 p1, v0, 0x800

    .line 70
    .line 71
    if-eqz p1, :cond_6

    .line 72
    .line 73
    iget-object p1, p0, La/sig;->l:Ljava/util/List;

    .line 74
    .line 75
    move-object v12, p1

    .line 76
    goto :goto_5

    .line 77
    :cond_6
    move-object/from16 v12, p7

    .line 78
    .line 79
    :goto_5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    new-instance v0, La/sig;

    .line 104
    .line 105
    invoke-direct/range {v0 .. v12}, La/sig;-><init>(Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;La/sip;La/sff0;Ljava/util/List;ZZLa/wcb;La/mig;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;)V

    .line 106
    .line 107
    .line 108
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
    instance-of v0, p1, La/sig;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/sig;

    .line 12
    .line 13
    iget-object v0, p0, La/sig;->a:Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;

    .line 14
    .line 15
    iget-object v1, p1, La/sig;->a:Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;

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
    iget-object v0, p0, La/sig;->b:La/sip;

    .line 26
    .line 27
    iget-object v1, p1, La/sig;->b:La/sip;

    .line 28
    .line 29
    if-eq v0, v1, :cond_3

    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :cond_3
    iget-object v0, p0, La/sig;->c:La/sff0;

    .line 34
    .line 35
    iget-object v1, p1, La/sig;->c:La/sff0;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, La/sff0;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    iget-object v0, p0, La/sig;->d:Ljava/util/List;

    .line 45
    .line 46
    iget-object v1, p1, La/sig;->d:Ljava/util/List;

    .line 47
    .line 48
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_5

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_5
    iget-boolean v0, p0, La/sig;->e:Z

    .line 56
    .line 57
    iget-boolean v1, p1, La/sig;->e:Z

    .line 58
    .line 59
    if-eq v0, v1, :cond_6

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_6
    iget-boolean v0, p0, La/sig;->f:Z

    .line 63
    .line 64
    iget-boolean v1, p1, La/sig;->f:Z

    .line 65
    .line 66
    if-eq v0, v1, :cond_7

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_7
    iget-object v0, p0, La/sig;->g:La/wcb;

    .line 70
    .line 71
    iget-object v1, p1, La/sig;->g:La/wcb;

    .line 72
    .line 73
    invoke-virtual {v0, v1}, La/wcb;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_8

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_8
    iget-object v0, p0, La/sig;->h:La/mig;

    .line 81
    .line 82
    iget-object v1, p1, La/sig;->h:La/mig;

    .line 83
    .line 84
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-nez v0, :cond_9

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_9
    iget-object v0, p0, La/sig;->i:Ljava/lang/String;

    .line 92
    .line 93
    iget-object v1, p1, La/sig;->i:Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-nez v0, :cond_a

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_a
    iget-object v0, p0, La/sig;->j:Ljava/util/List;

    .line 103
    .line 104
    iget-object v1, p1, La/sig;->j:Ljava/util/List;

    .line 105
    .line 106
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-nez v0, :cond_b

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_b
    iget-boolean v0, p0, La/sig;->k:Z

    .line 114
    .line 115
    iget-boolean v1, p1, La/sig;->k:Z

    .line 116
    .line 117
    if-eq v0, v1, :cond_c

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_c
    iget-object p0, p0, La/sig;->l:Ljava/util/List;

    .line 121
    .line 122
    iget-object p1, p1, La/sig;->l:Ljava/util/List;

    .line 123
    .line 124
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    if-nez p0, :cond_d

    .line 129
    .line 130
    :goto_0
    const/4 p0, 0x0

    .line 131
    return p0

    .line 132
    :cond_d
    :goto_1
    const/4 p0, 0x1

    .line 133
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/sig;->a:Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;

    .line 2
    .line 3
    invoke-virtual {v0}, Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;->hashCode()I

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
    iget-object v2, p0, La/sig;->b:La/sip;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, La/sig;->c:La/sff0;

    .line 19
    .line 20
    invoke-static {v0, v2, v1}, La/cs0;->c(La/sff0;II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, La/sig;->d:Ljava/util/List;

    .line 25
    .line 26
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-boolean v2, p0, La/sig;->e:Z

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-boolean v2, p0, La/sig;->f:Z

    .line 37
    .line 38
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-object v2, p0, La/sig;->g:La/wcb;

    .line 43
    .line 44
    invoke-virtual {v2}, La/wcb;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    add-int/2addr v2, v0

    .line 49
    mul-int/2addr v2, v1

    .line 50
    iget-object v0, p0, La/sig;->h:La/mig;

    .line 51
    .line 52
    if-nez v0, :cond_0

    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {v0}, La/mig;->hashCode()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    :goto_0
    add-int/2addr v2, v0

    .line 61
    mul-int/2addr v2, v1

    .line 62
    iget-object v0, p0, La/sig;->i:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v2, v1, v0}, La/ua80;->b(IILjava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iget-object v2, p0, La/sig;->j:Ljava/util/List;

    .line 69
    .line 70
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iget-boolean v2, p0, La/sig;->k:Z

    .line 75
    .line 76
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iget-object p0, p0, La/sig;->l:Ljava/util/List;

    .line 81
    .line 82
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    add-int/2addr p0, v0

    .line 87
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "CyberChampsPageStateModel(params="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/sig;->a:Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", feedKind="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/sig;->b:La/sip;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", remoteConfig="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/sig;->c:La/sff0;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", specialEventList="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/sig;->d:Ljava/util/List;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", bettingDisabled="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v1, ", isConnected="

    .line 49
    .line 50
    const-string v2, ", champImagesHolder="

    .line 51
    .line 52
    iget-boolean v3, p0, La/sig;->e:Z

    .line 53
    .line 54
    iget-boolean v4, p0, La/sig;->f:Z

    .line 55
    .line 56
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, La/sig;->g:La/wcb;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v1, ", scenarioModel="

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget-object v1, p0, La/sig;->h:La/mig;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v1, ", searchQuery="

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v1, ", favoriteIds="

    .line 80
    .line 81
    const-string v2, ", isMultiselectEnabled="

    .line 82
    .line 83
    iget-object v3, p0, La/sig;->i:Ljava/lang/String;

    .line 84
    .line 85
    iget-object v4, p0, La/sig;->j:Ljava/util/List;

    .line 86
    .line 87
    invoke-static {v3, v1, v2, v0, v4}, La/cs0;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 88
    .line 89
    .line 90
    iget-boolean v1, p0, La/sig;->k:Z

    .line 91
    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v1, ", selectedChampIds="

    .line 96
    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    iget-object p0, p0, La/sig;->l:Ljava/util/List;

    .line 101
    .line 102
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string p0, ")"

    .line 106
    .line 107
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    return-object p0
.end method
