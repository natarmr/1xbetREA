.class public final La/b6c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/d6c;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:La/swp0;

.field public final c:Ljava/util/List;

.field public final d:Ljava/util/List;

.field public final e:I

.field public final f:La/obk0;

.field public final g:Z

.field public final h:La/we50;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;La/swp0;Ljava/util/List;Ljava/util/List;ILa/obk0;ZLa/we50;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, La/b6c;->a:Ljava/lang/String;

    .line 26
    .line 27
    iput-object p2, p0, La/b6c;->b:La/swp0;

    .line 28
    .line 29
    iput-object p3, p0, La/b6c;->c:Ljava/util/List;

    .line 30
    .line 31
    iput-object p4, p0, La/b6c;->d:Ljava/util/List;

    .line 32
    .line 33
    iput p5, p0, La/b6c;->e:I

    .line 34
    .line 35
    iput-object p6, p0, La/b6c;->f:La/obk0;

    .line 36
    .line 37
    iput-boolean p7, p0, La/b6c;->g:Z

    .line 38
    .line 39
    iput-object p8, p0, La/b6c;->h:La/we50;

    .line 40
    .line 41
    iput-object p9, p0, La/b6c;->i:Ljava/lang/String;

    .line 42
    .line 43
    iput-object p10, p0, La/b6c;->j:Ljava/lang/String;

    .line 44
    .line 45
    iput-boolean p11, p0, La/b6c;->k:Z

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final N()I
    .locals 0

    .line 1
    iget p0, p0, La/b6c;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public final P()La/obk0;
    .locals 0

    .line 1
    iget-object p0, p0, La/b6c;->f:La/obk0;

    .line 2
    .line 3
    return-object p0
.end method

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
    instance-of v0, p1, La/b6c;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/b6c;

    .line 12
    .line 13
    iget-object v0, p0, La/b6c;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, La/b6c;->a:Ljava/lang/String;

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
    goto :goto_0

    .line 24
    :cond_2
    iget-object v0, p0, La/b6c;->b:La/swp0;

    .line 25
    .line 26
    iget-object v1, p1, La/b6c;->b:La/swp0;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, La/swp0;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/b6c;->c:Ljava/util/List;

    .line 36
    .line 37
    iget-object v1, p1, La/b6c;->c:Ljava/util/List;

    .line 38
    .line 39
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/b6c;->d:Ljava/util/List;

    .line 47
    .line 48
    iget-object v1, p1, La/b6c;->d:Ljava/util/List;

    .line 49
    .line 50
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget v0, p0, La/b6c;->e:I

    .line 58
    .line 59
    iget v1, p1, La/b6c;->e:I

    .line 60
    .line 61
    if-eq v0, v1, :cond_6

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_6
    iget-object v0, p0, La/b6c;->f:La/obk0;

    .line 65
    .line 66
    iget-object v1, p1, La/b6c;->f:La/obk0;

    .line 67
    .line 68
    if-eq v0, v1, :cond_7

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_7
    iget-boolean v0, p0, La/b6c;->g:Z

    .line 72
    .line 73
    iget-boolean v1, p1, La/b6c;->g:Z

    .line 74
    .line 75
    if-eq v0, v1, :cond_8

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_8
    iget-object v0, p0, La/b6c;->h:La/we50;

    .line 79
    .line 80
    iget-object v1, p1, La/b6c;->h:La/we50;

    .line 81
    .line 82
    if-eq v0, v1, :cond_9

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_9
    iget-object v0, p0, La/b6c;->i:Ljava/lang/String;

    .line 86
    .line 87
    iget-object v1, p1, La/b6c;->i:Ljava/lang/String;

    .line 88
    .line 89
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-nez v0, :cond_a

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_a
    iget-object v0, p0, La/b6c;->j:Ljava/lang/String;

    .line 97
    .line 98
    iget-object v1, p1, La/b6c;->j:Ljava/lang/String;

    .line 99
    .line 100
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-nez v0, :cond_b

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_b
    iget-boolean p0, p0, La/b6c;->k:Z

    .line 108
    .line 109
    iget-boolean p1, p1, La/b6c;->k:Z

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

.method public final getPhoneNumber()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/b6c;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getToken()La/swp0;
    .locals 0

    .line 1
    iget-object p0, p0, La/b6c;->b:La/swp0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/b6c;->a:Ljava/lang/String;

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
    iget-object v2, p0, La/b6c;->b:La/swp0;

    .line 11
    .line 12
    invoke-virtual {v2}, La/swp0;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    const/16 v0, 0x18

    .line 19
    .line 20
    invoke-static {v0, v2, v1}, La/twn;->a(III)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, La/b6c;->c:Ljava/util/List;

    .line 25
    .line 26
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v2, p0, La/b6c;->d:Ljava/util/List;

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget v2, p0, La/b6c;->e:I

    .line 37
    .line 38
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-object v2, p0, La/b6c;->f:La/obk0;

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    add-int/2addr v2, v0

    .line 49
    mul-int/2addr v2, v1

    .line 50
    iget-boolean v0, p0, La/b6c;->g:Z

    .line 51
    .line 52
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-object v2, p0, La/b6c;->h:La/we50;

    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    add-int/2addr v2, v0

    .line 63
    mul-int/2addr v2, v1

    .line 64
    iget-object v0, p0, La/b6c;->i:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v2, v1, v0}, La/ua80;->b(IILjava/lang/String;)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-object v2, p0, La/b6c;->j:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget-boolean p0, p0, La/b6c;->k:Z

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

.method public final p()I
    .locals 0

    .line 1
    const/16 p0, 0x18

    .line 2
    .line 3
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "RestoreConfirmation(phoneNumber="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/b6c;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", token="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/b6c;->b:La/swp0;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", confirmTypeAlias=24, availableActivationTypeList="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v1, ", availableRepeatActivationTypeList="

    .line 29
    .line 30
    const-string v2, ", smsTime="

    .line 31
    .line 32
    iget-object v3, p0, La/b6c;->c:Ljava/util/List;

    .line 33
    .line 34
    iget-object v4, p0, La/b6c;->d:Ljava/util/List;

    .line 35
    .line 36
    invoke-static {v1, v2, v0, v3, v4}, La/b1j;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Ljava/util/List;)V

    .line 37
    .line 38
    .line 39
    iget v1, p0, La/b6c;->e:I

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v1, ", currentActivationType="

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, La/b6c;->f:La/obk0;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v1, ", isRepeatFlow="

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-boolean v1, p0, La/b6c;->g:Z

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v1, ", navigation="

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    iget-object v1, p0, La/b6c;->h:La/we50;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string v1, ", countyCodeDigits="

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v1, ", phoneDigits="

    .line 80
    .line 81
    const-string v2, ", hasAuthenticator="

    .line 82
    .line 83
    iget-object v3, p0, La/b6c;->i:Ljava/lang/String;

    .line 84
    .line 85
    iget-object v4, p0, La/b6c;->j:Ljava/lang/String;

    .line 86
    .line 87
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    const-string v1, ")"

    .line 91
    .line 92
    iget-boolean p0, p0, La/b6c;->k:Z

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

.method public final u()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/b6c;->g:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/b6c;->c:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method
