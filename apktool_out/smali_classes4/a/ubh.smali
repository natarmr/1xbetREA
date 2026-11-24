.class public final La/ubh;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lorg/xplatform/cyber/game/core/betting/domain/model/RelatedParams;

.field public final b:Z

.field public final c:La/tbh;

.field public final d:Ljava/util/List;

.field public final e:Z

.field public final f:Z

.field public final g:La/v5l0;

.field public final h:Ljava/util/List;

.field public final i:La/wcb;


# direct methods
.method public constructor <init>(Lorg/xplatform/cyber/game/core/betting/domain/model/RelatedParams;ZLa/tbh;Ljava/util/List;ZZLa/v5l0;Ljava/util/List;La/wcb;)V
    .locals 0

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/ubh;->a:Lorg/xplatform/cyber/game/core/betting/domain/model/RelatedParams;

    .line 14
    .line 15
    iput-boolean p2, p0, La/ubh;->b:Z

    .line 16
    .line 17
    iput-object p3, p0, La/ubh;->c:La/tbh;

    .line 18
    .line 19
    iput-object p4, p0, La/ubh;->d:Ljava/util/List;

    .line 20
    .line 21
    iput-boolean p5, p0, La/ubh;->e:Z

    .line 22
    .line 23
    iput-boolean p6, p0, La/ubh;->f:Z

    .line 24
    .line 25
    iput-object p7, p0, La/ubh;->g:La/v5l0;

    .line 26
    .line 27
    iput-object p8, p0, La/ubh;->h:Ljava/util/List;

    .line 28
    .line 29
    iput-object p9, p0, La/ubh;->i:La/wcb;

    .line 30
    .line 31
    return-void
.end method

.method public static a(La/ubh;Lorg/xplatform/cyber/game/core/betting/domain/model/RelatedParams;ZLa/tbh;Ljava/util/List;ZZLa/v5l0;Ljava/util/List;La/wcb;I)La/ubh;
    .locals 10

    .line 1
    move/from16 v0, p10

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, La/ubh;->a:Lorg/xplatform/cyber/game/core/betting/domain/model/RelatedParams;

    .line 8
    .line 9
    :cond_0
    move-object v1, p1

    .line 10
    and-int/lit8 p1, v0, 0x2

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget-boolean p2, p0, La/ubh;->b:Z

    .line 15
    .line 16
    :cond_1
    move v2, p2

    .line 17
    and-int/lit8 p1, v0, 0x4

    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    iget-object p3, p0, La/ubh;->c:La/tbh;

    .line 22
    .line 23
    :cond_2
    move-object v3, p3

    .line 24
    and-int/lit8 p1, v0, 0x8

    .line 25
    .line 26
    if-eqz p1, :cond_3

    .line 27
    .line 28
    iget-object p4, p0, La/ubh;->d:Ljava/util/List;

    .line 29
    .line 30
    :cond_3
    move-object v4, p4

    .line 31
    and-int/lit8 p1, v0, 0x10

    .line 32
    .line 33
    if-eqz p1, :cond_4

    .line 34
    .line 35
    iget-boolean p5, p0, La/ubh;->e:Z

    .line 36
    .line 37
    :cond_4
    move v5, p5

    .line 38
    and-int/lit8 p1, v0, 0x20

    .line 39
    .line 40
    if-eqz p1, :cond_5

    .line 41
    .line 42
    iget-boolean p1, p0, La/ubh;->f:Z

    .line 43
    .line 44
    move v6, p1

    .line 45
    goto :goto_0

    .line 46
    :cond_5
    move/from16 v6, p6

    .line 47
    .line 48
    :goto_0
    and-int/lit8 p1, v0, 0x40

    .line 49
    .line 50
    if-eqz p1, :cond_6

    .line 51
    .line 52
    iget-object p1, p0, La/ubh;->g:La/v5l0;

    .line 53
    .line 54
    move-object v7, p1

    .line 55
    goto :goto_1

    .line 56
    :cond_6
    move-object/from16 v7, p7

    .line 57
    .line 58
    :goto_1
    and-int/lit16 p1, v0, 0x80

    .line 59
    .line 60
    if-eqz p1, :cond_7

    .line 61
    .line 62
    iget-object p1, p0, La/ubh;->h:Ljava/util/List;

    .line 63
    .line 64
    move-object v8, p1

    .line 65
    goto :goto_2

    .line 66
    :cond_7
    move-object/from16 v8, p8

    .line 67
    .line 68
    :goto_2
    and-int/lit16 p1, v0, 0x100

    .line 69
    .line 70
    if-eqz p1, :cond_8

    .line 71
    .line 72
    iget-object p1, p0, La/ubh;->i:La/wcb;

    .line 73
    .line 74
    move-object v9, p1

    .line 75
    goto :goto_3

    .line 76
    :cond_8
    move-object/from16 v9, p9

    .line 77
    .line 78
    :goto_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    new-instance v0, La/ubh;

    .line 94
    .line 95
    invoke-direct/range {v0 .. v9}, La/ubh;-><init>(Lorg/xplatform/cyber/game/core/betting/domain/model/RelatedParams;ZLa/tbh;Ljava/util/List;ZZLa/v5l0;Ljava/util/List;La/wcb;)V

    .line 96
    .line 97
    .line 98
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/ubh;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/ubh;

    .line 10
    .line 11
    iget-object v0, p0, La/ubh;->a:Lorg/xplatform/cyber/game/core/betting/domain/model/RelatedParams;

    .line 12
    .line 13
    iget-object v1, p1, La/ubh;->a:Lorg/xplatform/cyber/game/core/betting/domain/model/RelatedParams;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-boolean v0, p0, La/ubh;->b:Z

    .line 23
    .line 24
    iget-boolean v1, p1, La/ubh;->b:Z

    .line 25
    .line 26
    if-eq v0, v1, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget-object v0, p0, La/ubh;->c:La/tbh;

    .line 30
    .line 31
    iget-object v1, p1, La/ubh;->c:La/tbh;

    .line 32
    .line 33
    if-eq v0, v1, :cond_4

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_4
    iget-object v0, p0, La/ubh;->d:Ljava/util/List;

    .line 37
    .line 38
    iget-object v1, p1, La/ubh;->d:Ljava/util/List;

    .line 39
    .line 40
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_5

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_5
    iget-boolean v0, p0, La/ubh;->e:Z

    .line 48
    .line 49
    iget-boolean v1, p1, La/ubh;->e:Z

    .line 50
    .line 51
    if-eq v0, v1, :cond_6

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_6
    iget-boolean v0, p0, La/ubh;->f:Z

    .line 55
    .line 56
    iget-boolean v1, p1, La/ubh;->f:Z

    .line 57
    .line 58
    if-eq v0, v1, :cond_7

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_7
    iget-object v0, p0, La/ubh;->g:La/v5l0;

    .line 62
    .line 63
    iget-object v1, p1, La/ubh;->g:La/v5l0;

    .line 64
    .line 65
    if-eq v0, v1, :cond_8

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_8
    iget-object v0, p0, La/ubh;->h:Ljava/util/List;

    .line 69
    .line 70
    iget-object v1, p1, La/ubh;->h:Ljava/util/List;

    .line 71
    .line 72
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_9

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_9
    iget-object p0, p0, La/ubh;->i:La/wcb;

    .line 80
    .line 81
    iget-object p1, p1, La/ubh;->i:La/wcb;

    .line 82
    .line 83
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    if-nez p0, :cond_a

    .line 88
    .line 89
    :goto_0
    const/4 p0, 0x0

    .line 90
    return p0

    .line 91
    :cond_a
    :goto_1
    const/4 p0, 0x1

    .line 92
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, La/ubh;->a:Lorg/xplatform/cyber/game/core/betting/domain/model/RelatedParams;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    move v1, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v1}, Lorg/xplatform/cyber/game/core/betting/domain/model/RelatedParams;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    :goto_0
    const/16 v2, 0x1f

    .line 13
    .line 14
    mul-int/2addr v1, v2

    .line 15
    iget-boolean v3, p0, La/ubh;->b:Z

    .line 16
    .line 17
    invoke-static {v1, v2, v3}, La/brm0;->e(IIZ)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget-object v3, p0, La/ubh;->c:La/tbh;

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    add-int/2addr v3, v1

    .line 28
    mul-int/2addr v3, v2

    .line 29
    iget-object v1, p0, La/ubh;->d:Ljava/util/List;

    .line 30
    .line 31
    invoke-static {v3, v2, v1}, La/dw9;->a(IILjava/util/List;)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    iget-boolean v3, p0, La/ubh;->e:Z

    .line 36
    .line 37
    invoke-static {v1, v2, v3}, La/brm0;->e(IIZ)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    iget-boolean v3, p0, La/ubh;->f:Z

    .line 42
    .line 43
    invoke-static {v1, v2, v3}, La/brm0;->e(IIZ)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    iget-object v3, p0, La/ubh;->g:La/v5l0;

    .line 48
    .line 49
    invoke-static {v3, v1, v2}, La/axq;->c(La/v5l0;II)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    iget-object v3, p0, La/ubh;->h:Ljava/util/List;

    .line 54
    .line 55
    invoke-static {v1, v2, v3}, La/dw9;->a(IILjava/util/List;)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    iget-object p0, p0, La/ubh;->i:La/wcb;

    .line 60
    .line 61
    if-nez p0, :cond_1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    invoke-virtual {p0}, La/wcb;->hashCode()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    :goto_1
    add-int/2addr v1, v0

    .line 69
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "CyberRelatedGamesState(params="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/ubh;->a:Lorg/xplatform/cyber/game/core/betting/domain/model/RelatedParams;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", pollingActive="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, La/ubh;->b:Z

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", loadingState="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/ubh;->c:La/tbh;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", games="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/ubh;->d:Ljava/util/List;

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
    const-string v1, ", hasStream="

    .line 49
    .line 50
    const-string v2, ", sportEventCardStyle="

    .line 51
    .line 52
    iget-boolean v3, p0, La/ubh;->e:Z

    .line 53
    .line 54
    iget-boolean v4, p0, La/ubh;->f:Z

    .line 55
    .line 56
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, La/ubh;->g:La/v5l0;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v1, ", specialEventInfo="

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget-object v1, p0, La/ubh;->h:Ljava/util/List;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v1, ", champImagesHolder="

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    iget-object p0, p0, La/ubh;->i:La/wcb;

    .line 80
    .line 81
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string p0, ")"

    .line 85
    .line 86
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0
.end method
