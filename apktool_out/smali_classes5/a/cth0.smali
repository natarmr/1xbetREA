.class public final La/cth0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/dth0;


# instance fields
.field public final a:La/ssh0;

.field public final b:Z

.field public final c:I

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:I

.field public final g:Z

.field public final h:Z

.field public final i:La/i8m0;

.field public final j:Z

.field public final k:Z


# direct methods
.method public constructor <init>(La/ssh0;ZILjava/lang/String;Ljava/lang/String;IZZLa/i8m0;ZZ)V
    .locals 0

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/cth0;->a:La/ssh0;

    .line 8
    .line 9
    iput-boolean p2, p0, La/cth0;->b:Z

    .line 10
    .line 11
    iput p3, p0, La/cth0;->c:I

    .line 12
    .line 13
    iput-object p4, p0, La/cth0;->d:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p5, p0, La/cth0;->e:Ljava/lang/String;

    .line 16
    .line 17
    iput p6, p0, La/cth0;->f:I

    .line 18
    .line 19
    iput-boolean p7, p0, La/cth0;->g:Z

    .line 20
    .line 21
    iput-boolean p8, p0, La/cth0;->h:Z

    .line 22
    .line 23
    iput-object p9, p0, La/cth0;->i:La/i8m0;

    .line 24
    .line 25
    iput-boolean p10, p0, La/cth0;->j:Z

    .line 26
    .line 27
    iput-boolean p11, p0, La/cth0;->k:Z

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, La/cth0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, La/cth0;

    .line 10
    .line 11
    iget-object v0, p0, La/cth0;->a:La/ssh0;

    .line 12
    .line 13
    iget-object v1, p1, La/cth0;->a:La/ssh0;

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_2
    iget-boolean v0, p0, La/cth0;->b:Z

    .line 19
    .line 20
    iget-boolean v1, p1, La/cth0;->b:Z

    .line 21
    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_3
    iget v0, p0, La/cth0;->c:I

    .line 26
    .line 27
    iget v1, p1, La/cth0;->c:I

    .line 28
    .line 29
    if-eq v0, v1, :cond_4

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_4
    iget-object v0, p0, La/cth0;->d:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v1, p1, La/cth0;->d:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_5

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_5
    iget-object v0, p0, La/cth0;->e:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v1, p1, La/cth0;->e:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_6

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_6
    iget v0, p0, La/cth0;->f:I

    .line 55
    .line 56
    iget v1, p1, La/cth0;->f:I

    .line 57
    .line 58
    if-eq v0, v1, :cond_7

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_7
    iget-boolean v0, p0, La/cth0;->g:Z

    .line 62
    .line 63
    iget-boolean v1, p1, La/cth0;->g:Z

    .line 64
    .line 65
    if-ne v0, v1, :cond_a

    .line 66
    .line 67
    iget-boolean v0, p0, La/cth0;->h:Z

    .line 68
    .line 69
    iget-boolean v1, p1, La/cth0;->h:Z

    .line 70
    .line 71
    if-ne v0, v1, :cond_a

    .line 72
    .line 73
    iget-object v0, p0, La/cth0;->i:La/i8m0;

    .line 74
    .line 75
    iget-object v1, p1, La/cth0;->i:La/i8m0;

    .line 76
    .line 77
    if-ne v0, v1, :cond_a

    .line 78
    .line 79
    iget-boolean v0, p0, La/cth0;->j:Z

    .line 80
    .line 81
    iget-boolean v1, p1, La/cth0;->j:Z

    .line 82
    .line 83
    if-eq v0, v1, :cond_8

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_8
    iget-boolean p0, p0, La/cth0;->k:Z

    .line 87
    .line 88
    iget-boolean p1, p1, La/cth0;->k:Z

    .line 89
    .line 90
    if-eq p0, p1, :cond_9

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_9
    :goto_0
    const/4 p0, 0x1

    .line 94
    return p0

    .line 95
    :cond_a
    :goto_1
    const/4 p0, 0x0

    .line 96
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/cth0;->a:La/ssh0;

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
    iget-boolean v2, p0, La/cth0;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, La/cth0;->c:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/cth0;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/cth0;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget v2, p0, La/cth0;->f:I

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-boolean v2, p0, La/cth0;->g:Z

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-boolean v2, p0, La/cth0;->h:Z

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, La/cth0;->i:La/i8m0;

    .line 53
    .line 54
    invoke-static {v2, v0, v1}, La/w6x;->g(La/i8m0;II)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-boolean v2, p0, La/cth0;->j:Z

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-boolean p0, p0, La/cth0;->k:Z

    .line 65
    .line 66
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    add-int/2addr p0, v0

    .line 71
    return p0
.end method

.method public final o(La/p6t0;La/p6t0;)Ljava/util/Collection;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    instance-of p0, p1, La/cth0;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    instance-of p0, p2, La/cth0;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    new-instance p0, Ljava/util/LinkedHashSet;

    .line 16
    .line 17
    invoke-direct {p0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 18
    .line 19
    .line 20
    check-cast p1, La/cth0;

    .line 21
    .line 22
    iget-boolean v0, p1, La/cth0;->g:Z

    .line 23
    .line 24
    new-instance v1, La/xsh0;

    .line 25
    .line 26
    invoke-direct {v1, v0}, La/xsh0;-><init>(Z)V

    .line 27
    .line 28
    .line 29
    check-cast p2, La/cth0;

    .line 30
    .line 31
    iget-boolean v0, p2, La/cth0;->g:Z

    .line 32
    .line 33
    new-instance v2, La/xsh0;

    .line 34
    .line 35
    invoke-direct {v2, v0}, La/xsh0;-><init>(Z)V

    .line 36
    .line 37
    .line 38
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p1, La/cth0;->e:Ljava/lang/String;

    .line 42
    .line 43
    new-instance v1, La/ysh0;

    .line 44
    .line 45
    invoke-direct {v1, v0}, La/ysh0;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p2, La/cth0;->e:Ljava/lang/String;

    .line 49
    .line 50
    new-instance v2, La/ysh0;

    .line 51
    .line 52
    invoke-direct {v2, v0}, La/ysh0;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iget-object v0, p1, La/cth0;->i:La/i8m0;

    .line 59
    .line 60
    new-instance v1, La/ath0;

    .line 61
    .line 62
    invoke-direct {v1, v0}, La/ath0;-><init>(La/i8m0;)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p2, La/cth0;->i:La/i8m0;

    .line 66
    .line 67
    new-instance v2, La/ath0;

    .line 68
    .line 69
    invoke-direct {v2, v0}, La/ath0;-><init>(La/i8m0;)V

    .line 70
    .line 71
    .line 72
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    iget-boolean p1, p1, La/cth0;->h:Z

    .line 76
    .line 77
    new-instance v0, La/zsh0;

    .line 78
    .line 79
    invoke-direct {v0, p1}, La/zsh0;-><init>(Z)V

    .line 80
    .line 81
    .line 82
    iget-boolean p1, p2, La/cth0;->h:Z

    .line 83
    .line 84
    new-instance p2, La/zsh0;

    .line 85
    .line 86
    invoke-direct {p2, p1}, La/zsh0;-><init>(Z)V

    .line 87
    .line 88
    .line 89
    invoke-static {p0, v0, p2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-nez p1, :cond_0

    .line 97
    .line 98
    return-object p0

    .line 99
    :cond_0
    const/4 p0, 0x0

    .line 100
    return-object p0
.end method

.method public final s()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/cth0;->b:Z

    .line 2
    .line 3
    return p0
.end method

.method public final t()La/ssh0;
    .locals 0

    .line 1
    iget-object p0, p0, La/cth0;->a:La/ssh0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 10

    .line 1
    const-string v0, "Description(value="

    .line 2
    .line 3
    iget-object v1, p0, La/cth0;->e:Ljava/lang/String;

    .line 4
    .line 5
    const-string v2, ")"

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-boolean v1, p0, La/cth0;->g:Z

    .line 12
    .line 13
    const-string v3, "Checked(value="

    .line 14
    .line 15
    invoke-static {v3, v2, v1}, Lc;->d(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-boolean v3, p0, La/cth0;->h:Z

    .line 20
    .line 21
    const-string v4, "Enabled(value="

    .line 22
    .line 23
    invoke-static {v4, v2, v3}, Lc;->d(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    new-instance v4, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v5, "Status(value="

    .line 30
    .line 31
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object v5, p0, La/cth0;->i:La/i8m0;

    .line 35
    .line 36
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    new-instance v5, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v6, "SimpleSwitch(settingType="

    .line 49
    .line 50
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object v6, p0, La/cth0;->a:La/ssh0;

    .line 54
    .line 55
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v6, ", settingAchieved="

    .line 59
    .line 60
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    iget-boolean v6, p0, La/cth0;->b:Z

    .line 64
    .line 65
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v6, ", settingTypeIconId="

    .line 69
    .line 70
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v6, ", title="

    .line 74
    .line 75
    const-string v7, ", description="

    .line 76
    .line 77
    iget v8, p0, La/cth0;->c:I

    .line 78
    .line 79
    iget-object v9, p0, La/cth0;->d:Ljava/lang/String;

    .line 80
    .line 81
    invoke-static {v8, v6, v9, v7, v5}, La/kng0;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 82
    .line 83
    .line 84
    const-string v6, ", descriptionColor="

    .line 85
    .line 86
    const-string v7, ", checked="

    .line 87
    .line 88
    iget v8, p0, La/cth0;->f:I

    .line 89
    .line 90
    invoke-static {v8, v0, v6, v7, v5}, La/twn;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 91
    .line 92
    .line 93
    const-string v0, ", checkEnable="

    .line 94
    .line 95
    const-string v6, ", status="

    .line 96
    .line 97
    invoke-static {v5, v1, v0, v3, v6}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    const-string v0, ", isFirst="

    .line 101
    .line 102
    const-string v1, ", isLast="

    .line 103
    .line 104
    iget-boolean v3, p0, La/cth0;->j:Z

    .line 105
    .line 106
    invoke-static {v4, v0, v1, v5, v3}, La/brm0;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 107
    .line 108
    .line 109
    iget-boolean p0, p0, La/cth0;->k:Z

    .line 110
    .line 111
    invoke-static {v5, p0, v2}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0
.end method
