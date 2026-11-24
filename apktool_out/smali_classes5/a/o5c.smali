.class public final La/o5c;
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

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;La/swp0;Ljava/util/List;Ljava/util/List;ILa/obk0;ZLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/o5c;->a:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p2, p0, La/o5c;->b:La/swp0;

    .line 13
    .line 14
    iput-object p3, p0, La/o5c;->c:Ljava/util/List;

    .line 15
    .line 16
    iput-object p4, p0, La/o5c;->d:Ljava/util/List;

    .line 17
    .line 18
    iput p5, p0, La/o5c;->e:I

    .line 19
    .line 20
    iput-object p6, p0, La/o5c;->f:La/obk0;

    .line 21
    .line 22
    iput-boolean p7, p0, La/o5c;->g:Z

    .line 23
    .line 24
    iput-object p8, p0, La/o5c;->h:Ljava/lang/String;

    .line 25
    .line 26
    iput-object p9, p0, La/o5c;->i:Ljava/lang/String;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final N()I
    .locals 0

    .line 1
    iget p0, p0, La/o5c;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public final P()La/obk0;
    .locals 0

    .line 1
    iget-object p0, p0, La/o5c;->f:La/obk0;

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
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/o5c;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/o5c;

    .line 10
    .line 11
    iget-object v0, p0, La/o5c;->a:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, La/o5c;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/o5c;->b:La/swp0;

    .line 23
    .line 24
    iget-object v1, p1, La/o5c;->b:La/swp0;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, La/swp0;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget-object v0, p0, La/o5c;->c:Ljava/util/List;

    .line 34
    .line 35
    iget-object v1, p1, La/o5c;->c:Ljava/util/List;

    .line 36
    .line 37
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/o5c;->d:Ljava/util/List;

    .line 45
    .line 46
    iget-object v1, p1, La/o5c;->d:Ljava/util/List;

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
    iget v0, p0, La/o5c;->e:I

    .line 56
    .line 57
    iget v1, p1, La/o5c;->e:I

    .line 58
    .line 59
    if-eq v0, v1, :cond_6

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_6
    iget-object v0, p0, La/o5c;->f:La/obk0;

    .line 63
    .line 64
    iget-object v1, p1, La/o5c;->f:La/obk0;

    .line 65
    .line 66
    if-eq v0, v1, :cond_7

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_7
    iget-boolean v0, p0, La/o5c;->g:Z

    .line 70
    .line 71
    iget-boolean v1, p1, La/o5c;->g:Z

    .line 72
    .line 73
    if-eq v0, v1, :cond_8

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_8
    iget-object v0, p0, La/o5c;->h:Ljava/lang/String;

    .line 77
    .line 78
    iget-object v1, p1, La/o5c;->h:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_9

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_9
    iget-object p0, p0, La/o5c;->i:Ljava/lang/String;

    .line 88
    .line 89
    iget-object p1, p1, La/o5c;->i:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    if-nez p0, :cond_a

    .line 96
    .line 97
    :goto_0
    const/4 p0, 0x0

    .line 98
    return p0

    .line 99
    :cond_a
    :goto_1
    const/4 p0, 0x1

    .line 100
    return p0
.end method

.method public final getPhoneNumber()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/o5c;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getToken()La/swp0;
    .locals 0

    .line 1
    iget-object p0, p0, La/o5c;->b:La/swp0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/o5c;->a:Ljava/lang/String;

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
    iget-object v2, p0, La/o5c;->b:La/swp0;

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
    iget-object v0, p0, La/o5c;->c:Ljava/util/List;

    .line 19
    .line 20
    invoke-static {v2, v1, v0}, La/dw9;->a(IILjava/util/List;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, La/o5c;->d:Ljava/util/List;

    .line 25
    .line 26
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget v2, p0, La/o5c;->e:I

    .line 31
    .line 32
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object v2, p0, La/o5c;->f:La/obk0;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    add-int/2addr v2, v0

    .line 43
    mul-int/2addr v2, v1

    .line 44
    iget-boolean v0, p0, La/o5c;->g:Z

    .line 45
    .line 46
    invoke-static {v2, v1, v0}, La/brm0;->e(IIZ)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-object v2, p0, La/o5c;->h:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-object p0, p0, La/o5c;->i:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    add-int/2addr p0, v0

    .line 63
    return p0
.end method

.method public final p()I
    .locals 0

    .line 1
    const/4 p0, 0x5

    .line 2
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "AddTwoFactorAuthConfirmation(phoneNumber="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/o5c;->a:Ljava/lang/String;

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
    iget-object v1, p0, La/o5c;->b:La/swp0;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", availableActivationTypeList="

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
    iget-object v3, p0, La/o5c;->c:Ljava/util/List;

    .line 33
    .line 34
    iget-object v4, p0, La/o5c;->d:Ljava/util/List;

    .line 35
    .line 36
    invoke-static {v1, v2, v0, v3, v4}, La/b1j;->y(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;Ljava/util/List;)V

    .line 37
    .line 38
    .line 39
    iget v1, p0, La/o5c;->e:I

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
    iget-object v1, p0, La/o5c;->f:La/obk0;

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
    const-string v1, ", resetHashResultKey="

    .line 60
    .line 61
    const-string v2, ", resetHashSecretKeyValue="

    .line 62
    .line 63
    iget-object v3, p0, La/o5c;->h:Ljava/lang/String;

    .line 64
    .line 65
    iget-boolean v4, p0, La/o5c;->g:Z

    .line 66
    .line 67
    invoke-static {v1, v3, v2, v0, v4}, La/f140;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 68
    .line 69
    .line 70
    const-string v1, ")"

    .line 71
    .line 72
    iget-object p0, p0, La/o5c;->i:Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {v0, p0, v1}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0
.end method

.method public final u()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/o5c;->g:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/o5c;->c:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method
