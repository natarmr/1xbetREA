.class public final La/aef0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;

.field public final b:Z

.field public final c:Z

.field public final d:La/v5l0;

.field public final e:I

.field public final f:Z

.field public final g:Z

.field public final h:Ljava/util/List;

.field public final i:La/wcb;

.field public final j:Z

.field public final k:Z


# direct methods
.method public constructor <init>(Ljava/util/List;ZZLa/v5l0;IZZLjava/util/List;La/wcb;ZZ)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    iput-object p1, p0, La/aef0;->a:Ljava/util/List;

    .line 11
    .line 12
    iput-boolean p2, p0, La/aef0;->b:Z

    .line 13
    .line 14
    iput-boolean p3, p0, La/aef0;->c:Z

    .line 15
    .line 16
    iput-object p4, p0, La/aef0;->d:La/v5l0;

    .line 17
    .line 18
    iput p5, p0, La/aef0;->e:I

    .line 19
    .line 20
    iput-boolean p6, p0, La/aef0;->f:Z

    .line 21
    .line 22
    iput-boolean p7, p0, La/aef0;->g:Z

    .line 23
    .line 24
    iput-object p8, p0, La/aef0;->h:Ljava/util/List;

    .line 25
    .line 26
    iput-object p9, p0, La/aef0;->i:La/wcb;

    .line 27
    .line 28
    iput-boolean p10, p0, La/aef0;->j:Z

    .line 29
    .line 30
    iput-boolean p11, p0, La/aef0;->k:Z

    .line 31
    .line 32
    return-void
.end method

.method public static a(La/aef0;Ljava/util/List;ZLa/wcb;I)La/aef0;
    .locals 12

    .line 1
    move/from16 v0, p4

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, La/aef0;->a:Ljava/util/List;

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
    iget-boolean p1, p0, La/aef0;->b:Z

    .line 15
    .line 16
    :goto_0
    move v2, p1

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    const/4 p1, 0x0

    .line 19
    goto :goto_0

    .line 20
    :goto_1
    and-int/lit8 p1, v0, 0x4

    .line 21
    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    iget-boolean p1, p0, La/aef0;->c:Z

    .line 25
    .line 26
    move v3, p1

    .line 27
    goto :goto_2

    .line 28
    :cond_2
    move v3, p2

    .line 29
    :goto_2
    iget-object v4, p0, La/aef0;->d:La/v5l0;

    .line 30
    .line 31
    iget v5, p0, La/aef0;->e:I

    .line 32
    .line 33
    iget-boolean v6, p0, La/aef0;->f:Z

    .line 34
    .line 35
    iget-boolean v7, p0, La/aef0;->g:Z

    .line 36
    .line 37
    iget-object v8, p0, La/aef0;->h:Ljava/util/List;

    .line 38
    .line 39
    and-int/lit16 p1, v0, 0x100

    .line 40
    .line 41
    if-eqz p1, :cond_3

    .line 42
    .line 43
    iget-object p1, p0, La/aef0;->i:La/wcb;

    .line 44
    .line 45
    move-object v9, p1

    .line 46
    goto :goto_3

    .line 47
    :cond_3
    move-object v9, p3

    .line 48
    :goto_3
    iget-boolean v10, p0, La/aef0;->j:Z

    .line 49
    .line 50
    iget-boolean v11, p0, La/aef0;->k:Z

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    new-instance v0, La/aef0;

    .line 62
    .line 63
    invoke-direct/range {v0 .. v11}, La/aef0;-><init>(Ljava/util/List;ZZLa/v5l0;IZZLjava/util/List;La/wcb;ZZ)V

    .line 64
    .line 65
    .line 66
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
    instance-of v0, p1, La/aef0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/aef0;

    .line 11
    .line 12
    iget-object v0, p0, La/aef0;->a:Ljava/util/List;

    .line 13
    .line 14
    iget-object v1, p1, La/aef0;->a:Ljava/util/List;

    .line 15
    .line 16
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    iget-boolean v0, p0, La/aef0;->b:Z

    .line 24
    .line 25
    iget-boolean v1, p1, La/aef0;->b:Z

    .line 26
    .line 27
    if-eq v0, v1, :cond_3

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_3
    iget-boolean v0, p0, La/aef0;->c:Z

    .line 31
    .line 32
    iget-boolean v1, p1, La/aef0;->c:Z

    .line 33
    .line 34
    if-eq v0, v1, :cond_4

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_4
    iget-object v0, p0, La/aef0;->d:La/v5l0;

    .line 38
    .line 39
    iget-object v1, p1, La/aef0;->d:La/v5l0;

    .line 40
    .line 41
    if-eq v0, v1, :cond_5

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_5
    iget v0, p0, La/aef0;->e:I

    .line 45
    .line 46
    iget v1, p1, La/aef0;->e:I

    .line 47
    .line 48
    if-eq v0, v1, :cond_6

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_6
    iget-boolean v0, p0, La/aef0;->f:Z

    .line 52
    .line 53
    iget-boolean v1, p1, La/aef0;->f:Z

    .line 54
    .line 55
    if-eq v0, v1, :cond_7

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_7
    iget-boolean v0, p0, La/aef0;->g:Z

    .line 59
    .line 60
    iget-boolean v1, p1, La/aef0;->g:Z

    .line 61
    .line 62
    if-eq v0, v1, :cond_8

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_8
    iget-object v0, p0, La/aef0;->h:Ljava/util/List;

    .line 66
    .line 67
    iget-object v1, p1, La/aef0;->h:Ljava/util/List;

    .line 68
    .line 69
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_9

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_9
    iget-object v0, p0, La/aef0;->i:La/wcb;

    .line 77
    .line 78
    iget-object v1, p1, La/aef0;->i:La/wcb;

    .line 79
    .line 80
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_a

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_a
    iget-boolean v0, p0, La/aef0;->j:Z

    .line 88
    .line 89
    iget-boolean v1, p1, La/aef0;->j:Z

    .line 90
    .line 91
    if-eq v0, v1, :cond_b

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_b
    iget-boolean p0, p0, La/aef0;->k:Z

    .line 95
    .line 96
    iget-boolean p1, p1, La/aef0;->k:Z

    .line 97
    .line 98
    if-eq p0, p1, :cond_c

    .line 99
    .line 100
    :goto_0
    const/4 p0, 0x0

    .line 101
    return p0

    .line 102
    :cond_c
    :goto_1
    const/4 p0, 0x1

    .line 103
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/aef0;->a:Ljava/util/List;

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
    iget-boolean v2, p0, La/aef0;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, La/aef0;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/aef0;->d:La/v5l0;

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La/axq;->c(La/v5l0;II)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, La/aef0;->e:I

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-boolean v2, p0, La/aef0;->f:Z

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-boolean v2, p0, La/aef0;->g:Z

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, La/aef0;->h:Ljava/util/List;

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, La/aef0;->i:La/wcb;

    .line 53
    .line 54
    if-nez v2, :cond_0

    .line 55
    .line 56
    const/4 v2, 0x0

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    invoke-virtual {v2}, La/wcb;->hashCode()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    :goto_0
    add-int/2addr v0, v2

    .line 63
    mul-int/2addr v0, v1

    .line 64
    iget-boolean v2, p0, La/aef0;->j:Z

    .line 65
    .line 66
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-boolean p0, p0, La/aef0;->k:Z

    .line 71
    .line 72
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    add-int/2addr p0, v0

    .line 77
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "RelatedGamesListState(relatedGamesItems="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/aef0;->a:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", isLoading="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, La/aef0;->b:Z

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", isError="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-boolean v1, p0, La/aef0;->c:Z

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", sportEventCardStyle="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/aef0;->d:La/v5l0;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", lottieType="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v1, ", hasStream="

    .line 49
    .line 50
    const-string v2, ", bettingDisabled="

    .line 51
    .line 52
    iget v3, p0, La/aef0;->e:I

    .line 53
    .line 54
    iget-boolean v4, p0, La/aef0;->f:Z

    .line 55
    .line 56
    invoke-static {v3, v1, v2, v0, v4}, La/brm0;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 57
    .line 58
    .line 59
    const-string v1, ", specialEventInfo="

    .line 60
    .line 61
    const-string v2, ", champImagesHolder="

    .line 62
    .line 63
    iget-object v3, p0, La/aef0;->h:Ljava/util/List;

    .line 64
    .line 65
    iget-boolean v4, p0, La/aef0;->g:Z

    .line 66
    .line 67
    invoke-static {v0, v1, v3, v2, v4}, La/vqd;->y(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V

    .line 68
    .line 69
    .line 70
    iget-object v1, p0, La/aef0;->i:La/wcb;

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
    iget-boolean v1, p0, La/aef0;->j:Z

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v1, ", rtlSupport="

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string v1, ")"

    .line 91
    .line 92
    iget-boolean p0, p0, La/aef0;->k:Z

    .line 93
    .line 94
    invoke-static {v0, p0, v1}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0
.end method
