.class public final La/lla0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/eme;

.field public final b:La/hdm0;

.field public final c:La/nc5;

.field public final d:Ljava/util/List;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/util/List;

.field public final g:I

.field public final h:La/hko0;

.field public final i:Z

.field public final j:Z

.field public final k:Z

.field public final l:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, La/hko0;->d:La/hko0;

    .line 2
    .line 3
    return-void
.end method

.method public constructor <init>(La/eme;La/hdm0;La/nc5;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ILa/hko0;ZZZZ)V
    .locals 0

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    iput-object p1, p0, La/lla0;->a:La/eme;

    .line 14
    .line 15
    iput-object p2, p0, La/lla0;->b:La/hdm0;

    .line 16
    .line 17
    iput-object p3, p0, La/lla0;->c:La/nc5;

    .line 18
    .line 19
    iput-object p4, p0, La/lla0;->d:Ljava/util/List;

    .line 20
    .line 21
    iput-object p5, p0, La/lla0;->e:Ljava/lang/String;

    .line 22
    .line 23
    iput-object p6, p0, La/lla0;->f:Ljava/util/List;

    .line 24
    .line 25
    iput p7, p0, La/lla0;->g:I

    .line 26
    .line 27
    iput-object p8, p0, La/lla0;->h:La/hko0;

    .line 28
    .line 29
    iput-boolean p9, p0, La/lla0;->i:Z

    .line 30
    .line 31
    iput-boolean p10, p0, La/lla0;->j:Z

    .line 32
    .line 33
    iput-boolean p11, p0, La/lla0;->k:Z

    .line 34
    .line 35
    iput-boolean p12, p0, La/lla0;->l:Z

    .line 36
    .line 37
    return-void
.end method

.method public static a(La/lla0;La/hdm0;La/nc5;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ILa/hko0;ZZZZI)La/lla0;
    .locals 2

    .line 1
    move-object v0, p1

    .line 2
    iget-object p1, p0, La/lla0;->a:La/eme;

    .line 3
    .line 4
    and-int/lit8 v1, p12, 0x2

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, La/lla0;->b:La/hdm0;

    .line 9
    .line 10
    :cond_0
    and-int/lit8 v1, p12, 0x4

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    iget-object p2, p0, La/lla0;->c:La/nc5;

    .line 15
    .line 16
    :cond_1
    and-int/lit8 v1, p12, 0x8

    .line 17
    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    iget-object p3, p0, La/lla0;->d:Ljava/util/List;

    .line 21
    .line 22
    :cond_2
    and-int/lit8 v1, p12, 0x10

    .line 23
    .line 24
    if-eqz v1, :cond_3

    .line 25
    .line 26
    iget-object p4, p0, La/lla0;->e:Ljava/lang/String;

    .line 27
    .line 28
    :cond_3
    and-int/lit8 v1, p12, 0x20

    .line 29
    .line 30
    if-eqz v1, :cond_4

    .line 31
    .line 32
    iget-object p5, p0, La/lla0;->f:Ljava/util/List;

    .line 33
    .line 34
    :cond_4
    and-int/lit8 v1, p12, 0x40

    .line 35
    .line 36
    if-eqz v1, :cond_5

    .line 37
    .line 38
    iget p6, p0, La/lla0;->g:I

    .line 39
    .line 40
    :cond_5
    and-int/lit16 v1, p12, 0x80

    .line 41
    .line 42
    if-eqz v1, :cond_6

    .line 43
    .line 44
    iget-object p7, p0, La/lla0;->h:La/hko0;

    .line 45
    .line 46
    :cond_6
    and-int/lit16 v1, p12, 0x100

    .line 47
    .line 48
    if-eqz v1, :cond_7

    .line 49
    .line 50
    iget-boolean p8, p0, La/lla0;->i:Z

    .line 51
    .line 52
    :cond_7
    and-int/lit16 v1, p12, 0x200

    .line 53
    .line 54
    if-eqz v1, :cond_8

    .line 55
    .line 56
    iget-boolean p9, p0, La/lla0;->j:Z

    .line 57
    .line 58
    :cond_8
    and-int/lit16 v1, p12, 0x400

    .line 59
    .line 60
    if-eqz v1, :cond_9

    .line 61
    .line 62
    iget-boolean p10, p0, La/lla0;->k:Z

    .line 63
    .line 64
    :cond_9
    and-int/lit16 p12, p12, 0x800

    .line 65
    .line 66
    if-eqz p12, :cond_a

    .line 67
    .line 68
    iget-boolean p11, p0, La/lla0;->l:Z

    .line 69
    .line 70
    :cond_a
    move p12, p11

    .line 71
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    new-instance p0, La/lla0;

    .line 90
    .line 91
    move p11, p10

    .line 92
    move p10, p9

    .line 93
    move p9, p8

    .line 94
    move-object p8, p7

    .line 95
    move p7, p6

    .line 96
    move-object p6, p5

    .line 97
    move-object p5, p4

    .line 98
    move-object p4, p3

    .line 99
    move-object p3, p2

    .line 100
    move-object p2, v0

    .line 101
    invoke-direct/range {p0 .. p12}, La/lla0;-><init>(La/eme;La/hdm0;La/nc5;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ILa/hko0;ZZZZ)V

    .line 102
    .line 103
    .line 104
    return-object p0
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
    instance-of v0, p1, La/lla0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/lla0;

    .line 12
    .line 13
    iget-object v0, p0, La/lla0;->a:La/eme;

    .line 14
    .line 15
    iget-object v1, p1, La/lla0;->a:La/eme;

    .line 16
    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :cond_2
    iget-object v0, p0, La/lla0;->b:La/hdm0;

    .line 22
    .line 23
    iget-object v1, p1, La/lla0;->b:La/hdm0;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_3

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_3
    iget-object v0, p0, La/lla0;->c:La/nc5;

    .line 33
    .line 34
    iget-object v1, p1, La/lla0;->c:La/nc5;

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/lla0;->d:Ljava/util/List;

    .line 44
    .line 45
    iget-object v1, p1, La/lla0;->d:Ljava/util/List;

    .line 46
    .line 47
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_5

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_5
    iget-object v0, p0, La/lla0;->e:Ljava/lang/String;

    .line 55
    .line 56
    iget-object v1, p1, La/lla0;->e:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_6

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_6
    iget-object v0, p0, La/lla0;->f:Ljava/util/List;

    .line 66
    .line 67
    iget-object v1, p1, La/lla0;->f:Ljava/util/List;

    .line 68
    .line 69
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_7

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_7
    iget v0, p0, La/lla0;->g:I

    .line 77
    .line 78
    iget v1, p1, La/lla0;->g:I

    .line 79
    .line 80
    if-eq v0, v1, :cond_8

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_8
    iget-object v0, p0, La/lla0;->h:La/hko0;

    .line 84
    .line 85
    iget-object v1, p1, La/lla0;->h:La/hko0;

    .line 86
    .line 87
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-nez v0, :cond_9

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_9
    iget-boolean v0, p0, La/lla0;->i:Z

    .line 95
    .line 96
    iget-boolean v1, p1, La/lla0;->i:Z

    .line 97
    .line 98
    if-eq v0, v1, :cond_a

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_a
    iget-boolean v0, p0, La/lla0;->j:Z

    .line 102
    .line 103
    iget-boolean v1, p1, La/lla0;->j:Z

    .line 104
    .line 105
    if-eq v0, v1, :cond_b

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_b
    iget-boolean v0, p0, La/lla0;->k:Z

    .line 109
    .line 110
    iget-boolean v1, p1, La/lla0;->k:Z

    .line 111
    .line 112
    if-eq v0, v1, :cond_c

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_c
    iget-boolean p0, p0, La/lla0;->l:Z

    .line 116
    .line 117
    iget-boolean p1, p1, La/lla0;->l:Z

    .line 118
    .line 119
    if-eq p0, p1, :cond_d

    .line 120
    .line 121
    :goto_0
    const/4 p0, 0x0

    .line 122
    return p0

    .line 123
    :cond_d
    :goto_1
    const/4 p0, 0x1

    .line 124
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/lla0;->a:La/eme;

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
    iget-object v2, p0, La/lla0;->b:La/hdm0;

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
    iget-object v0, p0, La/lla0;->c:La/nc5;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    add-int/2addr v0, v2

    .line 25
    mul-int/2addr v0, v1

    .line 26
    iget-object v2, p0, La/lla0;->d:Ljava/util/List;

    .line 27
    .line 28
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object v2, p0, La/lla0;->e:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-object v2, p0, La/lla0;->f:Ljava/util/List;

    .line 39
    .line 40
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget v2, p0, La/lla0;->g:I

    .line 45
    .line 46
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-object v2, p0, La/lla0;->h:La/hko0;

    .line 51
    .line 52
    invoke-virtual {v2}, La/hko0;->hashCode()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    add-int/2addr v2, v0

    .line 57
    mul-int/2addr v2, v1

    .line 58
    iget-boolean v0, p0, La/lla0;->i:Z

    .line 59
    .line 60
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-boolean v2, p0, La/lla0;->j:Z

    .line 65
    .line 66
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-boolean v2, p0, La/lla0;->k:Z

    .line 71
    .line 72
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget-boolean p0, p0, La/lla0;->l:Z

    .line 77
    .line 78
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

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
    const-string v1, "PlayersStatisticsCricketState(coreHeaderModel="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/lla0;->a:La/eme;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", statisticHeaderModel="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/lla0;->b:La/hdm0;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", backgroundHeaderModel="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, La/lla0;->c:La/nc5;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", teams="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, La/lla0;->d:Ljava/util/List;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", currentTeamId="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v1, ", innings="

    .line 49
    .line 50
    const-string v2, ", currentInning="

    .line 51
    .line 52
    iget-object v3, p0, La/lla0;->e:Ljava/lang/String;

    .line 53
    .line 54
    iget-object v4, p0, La/lla0;->f:Ljava/util/List;

    .line 55
    .line 56
    invoke-static {v3, v1, v2, v0, v4}, La/cs0;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 57
    .line 58
    .line 59
    iget v1, p0, La/lla0;->g:I

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v1, ", table="

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget-object v1, p0, La/lla0;->h:La/hko0;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v1, ", hasFilters="

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v1, ", isLive="

    .line 80
    .line 81
    const-string v2, ", isLoading="

    .line 82
    .line 83
    iget-boolean v3, p0, La/lla0;->i:Z

    .line 84
    .line 85
    iget-boolean v4, p0, La/lla0;->j:Z

    .line 86
    .line 87
    invoke-static {v1, v2, v0, v3, v4}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 88
    .line 89
    .line 90
    const-string v1, ", isError="

    .line 91
    .line 92
    const-string v2, ")"

    .line 93
    .line 94
    iget-boolean v3, p0, La/lla0;->k:Z

    .line 95
    .line 96
    iget-boolean p0, p0, La/lla0;->l:Z

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
