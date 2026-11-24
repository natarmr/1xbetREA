.class public final La/syo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Z

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/util/List;

.field public final h:Ljava/lang/String;

.field public final i:La/dyo;

.field public final j:La/dyo;

.field public final k:La/yxo;


# direct methods
.method public constructor <init>(ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;La/dyo;La/dyo;La/yxo;)V
    .locals 0

    .line 1
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-boolean p1, p0, La/syo;->a:Z

    .line 8
    .line 9
    iput-boolean p2, p0, La/syo;->b:Z

    .line 10
    .line 11
    iput-boolean p3, p0, La/syo;->c:Z

    .line 12
    .line 13
    iput-object p4, p0, La/syo;->d:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p5, p0, La/syo;->e:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p6, p0, La/syo;->f:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p7, p0, La/syo;->g:Ljava/util/List;

    .line 20
    .line 21
    iput-object p8, p0, La/syo;->h:Ljava/lang/String;

    .line 22
    .line 23
    iput-object p9, p0, La/syo;->i:La/dyo;

    .line 24
    .line 25
    iput-object p10, p0, La/syo;->j:La/dyo;

    .line 26
    .line 27
    iput-object p11, p0, La/syo;->k:La/yxo;

    .line 28
    .line 29
    return-void
.end method

.method public static a(La/syo;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;La/dyo;La/dyo;La/yxo;I)La/syo;
    .locals 2

    .line 1
    and-int/lit8 v0, p11, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, La/syo;->a:Z

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    and-int/lit8 v1, p11, 0x2

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    iget-boolean p1, p0, La/syo;->b:Z

    .line 14
    .line 15
    :cond_1
    and-int/lit8 v1, p11, 0x4

    .line 16
    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    iget-boolean p2, p0, La/syo;->c:Z

    .line 20
    .line 21
    :cond_2
    and-int/lit8 v1, p11, 0x8

    .line 22
    .line 23
    if-eqz v1, :cond_3

    .line 24
    .line 25
    iget-object p3, p0, La/syo;->d:Ljava/lang/String;

    .line 26
    .line 27
    :cond_3
    and-int/lit8 v1, p11, 0x10

    .line 28
    .line 29
    if-eqz v1, :cond_4

    .line 30
    .line 31
    iget-object p4, p0, La/syo;->e:Ljava/lang/String;

    .line 32
    .line 33
    :cond_4
    and-int/lit8 v1, p11, 0x20

    .line 34
    .line 35
    if-eqz v1, :cond_5

    .line 36
    .line 37
    iget-object p5, p0, La/syo;->f:Ljava/lang/String;

    .line 38
    .line 39
    :cond_5
    and-int/lit8 v1, p11, 0x40

    .line 40
    .line 41
    if-eqz v1, :cond_6

    .line 42
    .line 43
    iget-object p6, p0, La/syo;->g:Ljava/util/List;

    .line 44
    .line 45
    :cond_6
    and-int/lit16 v1, p11, 0x80

    .line 46
    .line 47
    if-eqz v1, :cond_7

    .line 48
    .line 49
    iget-object p7, p0, La/syo;->h:Ljava/lang/String;

    .line 50
    .line 51
    :cond_7
    and-int/lit16 v1, p11, 0x100

    .line 52
    .line 53
    if-eqz v1, :cond_8

    .line 54
    .line 55
    iget-object p8, p0, La/syo;->i:La/dyo;

    .line 56
    .line 57
    :cond_8
    and-int/lit16 v1, p11, 0x200

    .line 58
    .line 59
    if-eqz v1, :cond_9

    .line 60
    .line 61
    iget-object p9, p0, La/syo;->j:La/dyo;

    .line 62
    .line 63
    :cond_9
    and-int/lit16 p11, p11, 0x400

    .line 64
    .line 65
    if-eqz p11, :cond_a

    .line 66
    .line 67
    iget-object p10, p0, La/syo;->k:La/yxo;

    .line 68
    .line 69
    :cond_a
    move-object p11, p10

    .line 70
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    new-instance p0, La/syo;

    .line 92
    .line 93
    move-object p10, p9

    .line 94
    move-object p9, p8

    .line 95
    move-object p8, p7

    .line 96
    move-object p7, p6

    .line 97
    move-object p6, p5

    .line 98
    move-object p5, p4

    .line 99
    move-object p4, p3

    .line 100
    move p3, p2

    .line 101
    move p2, p1

    .line 102
    move p1, v0

    .line 103
    invoke-direct/range {p0 .. p11}, La/syo;-><init>(ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;La/dyo;La/dyo;La/yxo;)V

    .line 104
    .line 105
    .line 106
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
    instance-of v0, p1, La/syo;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/syo;

    .line 12
    .line 13
    iget-boolean v0, p0, La/syo;->a:Z

    .line 14
    .line 15
    iget-boolean v1, p1, La/syo;->a:Z

    .line 16
    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_2
    iget-boolean v0, p0, La/syo;->b:Z

    .line 21
    .line 22
    iget-boolean v1, p1, La/syo;->b:Z

    .line 23
    .line 24
    if-eq v0, v1, :cond_3

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_3
    iget-boolean v0, p0, La/syo;->c:Z

    .line 28
    .line 29
    iget-boolean v1, p1, La/syo;->c:Z

    .line 30
    .line 31
    if-eq v0, v1, :cond_4

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_4
    iget-object v0, p0, La/syo;->d:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v1, p1, La/syo;->d:Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_5

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_5
    iget-object v0, p0, La/syo;->e:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v1, p1, La/syo;->e:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_6

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_6
    iget-object v0, p0, La/syo;->f:Ljava/lang/String;

    .line 57
    .line 58
    iget-object v1, p1, La/syo;->f:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_7

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_7
    iget-object v0, p0, La/syo;->g:Ljava/util/List;

    .line 68
    .line 69
    iget-object v1, p1, La/syo;->g:Ljava/util/List;

    .line 70
    .line 71
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_8

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_8
    iget-object v0, p0, La/syo;->h:Ljava/lang/String;

    .line 79
    .line 80
    iget-object v1, p1, La/syo;->h:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/syo;->i:La/dyo;

    .line 90
    .line 91
    iget-object v1, p1, La/syo;->i:La/dyo;

    .line 92
    .line 93
    if-eq v0, v1, :cond_a

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_a
    iget-object v0, p0, La/syo;->j:La/dyo;

    .line 97
    .line 98
    iget-object v1, p1, La/syo;->j:La/dyo;

    .line 99
    .line 100
    if-eq v0, v1, :cond_b

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_b
    iget-object p0, p0, La/syo;->k:La/yxo;

    .line 104
    .line 105
    iget-object p1, p1, La/syo;->k:La/yxo;

    .line 106
    .line 107
    if-eq p0, p1, :cond_c

    .line 108
    .line 109
    :goto_0
    const/4 p0, 0x0

    .line 110
    return p0

    .line 111
    :cond_c
    :goto_1
    const/4 p0, 0x1

    .line 112
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-boolean v0, p0, La/syo;->a:Z

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
    iget-boolean v2, p0, La/syo;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, La/syo;->c:Z

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/syo;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/syo;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/syo;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, La/syo;->g:Ljava/util/List;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, La/syo;->h:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, La/syo;->i:La/dyo;

    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    add-int/2addr v2, v0

    .line 59
    mul-int/2addr v2, v1

    .line 60
    iget-object v0, p0, La/syo;->j:La/dyo;

    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    add-int/2addr v0, v2

    .line 67
    mul-int/2addr v0, v1

    .line 68
    iget-object p0, p0, La/syo;->k:La/yxo;

    .line 69
    .line 70
    if-nez p0, :cond_0

    .line 71
    .line 72
    const/4 p0, 0x0

    .line 73
    goto :goto_0

    .line 74
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    :goto_0
    add-int/2addr v0, p0

    .line 79
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", isRequestInProgress="

    .line 2
    .line 3
    const-string v1, ", hasConnection="

    .line 4
    .line 5
    const-string v2, "FastChangePasswordScreenState(isInitialLoading="

    .line 6
    .line 7
    iget-boolean v3, p0, La/syo;->a:Z

    .line 8
    .line 9
    iget-boolean v4, p0, La/syo;->b:Z

    .line 10
    .line 11
    invoke-static {v2, v0, v1, v3, v4}, La/f140;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", oldPassword="

    .line 16
    .line 17
    const-string v2, ", password="

    .line 18
    .line 19
    iget-object v3, p0, La/syo;->d:Ljava/lang/String;

    .line 20
    .line 21
    iget-boolean v4, p0, La/syo;->c:Z

    .line 22
    .line 23
    invoke-static {v1, v3, v2, v0, v4}, La/f140;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", confirmPassword="

    .line 27
    .line 28
    const-string v2, ", passwordRequirements="

    .line 29
    .line 30
    iget-object v3, p0, La/syo;->e:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v4, p0, La/syo;->f:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v1, ", oldPasswordErrorMessage="

    .line 38
    .line 39
    const-string v2, ", newPasswordError="

    .line 40
    .line 41
    iget-object v3, p0, La/syo;->h:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v4, p0, La/syo;->g:Ljava/util/List;

    .line 44
    .line 45
    invoke-static {v1, v3, v2, v0, v4}, La/h97;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, La/syo;->i:La/dyo;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", repeatPasswordError="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, La/syo;->j:La/dyo;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", focusField="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object p0, p0, La/syo;->k:La/yxo;

    .line 69
    .line 70
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string p0, ")"

    .line 74
    .line 75
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0
.end method
