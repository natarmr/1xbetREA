.class public final La/u5c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/v5c;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:La/swp0;

.field public final c:I

.field public final d:Ljava/util/List;

.field public final e:Ljava/util/List;

.field public final f:I

.field public final g:Lorg/xplatform/security/impl/navigation/ChangePhoneNumberScreen;

.field public final h:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;La/swp0;ILjava/util/List;Ljava/util/List;ILorg/xplatform/security/impl/navigation/ChangePhoneNumberScreen;Z)V
    .locals 1

    .line 1
    sget-object v0, La/obk0;->b:La/zie0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, La/u5c;->a:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p2, p0, La/u5c;->b:La/swp0;

    .line 18
    .line 19
    iput p3, p0, La/u5c;->c:I

    .line 20
    .line 21
    iput-object p4, p0, La/u5c;->d:Ljava/util/List;

    .line 22
    .line 23
    iput-object p5, p0, La/u5c;->e:Ljava/util/List;

    .line 24
    .line 25
    iput p6, p0, La/u5c;->f:I

    .line 26
    .line 27
    iput-object p7, p0, La/u5c;->g:Lorg/xplatform/security/impl/navigation/ChangePhoneNumberScreen;

    .line 28
    .line 29
    iput-boolean p8, p0, La/u5c;->h:Z

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final N()I
    .locals 0

    .line 1
    iget p0, p0, La/u5c;->f:I

    .line 2
    .line 3
    return p0
.end method

.method public final P()La/obk0;
    .locals 0

    .line 1
    sget-object p0, La/obk0;->c:La/obk0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/u5c;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/u5c;

    .line 11
    .line 12
    iget-object v0, p0, La/u5c;->a:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v2, p1, La/u5c;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/u5c;->b:La/swp0;

    .line 24
    .line 25
    iget-object v2, p1, La/u5c;->b:La/swp0;

    .line 26
    .line 27
    invoke-virtual {v0, v2}, La/swp0;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_3

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_3
    iget v0, p0, La/u5c;->c:I

    .line 35
    .line 36
    iget v2, p1, La/u5c;->c:I

    .line 37
    .line 38
    if-eq v0, v2, :cond_4

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_4
    iget-object v0, p0, La/u5c;->d:Ljava/util/List;

    .line 42
    .line 43
    iget-object v2, p1, La/u5c;->d:Ljava/util/List;

    .line 44
    .line 45
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_5

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_5
    iget-object v0, p0, La/u5c;->e:Ljava/util/List;

    .line 53
    .line 54
    iget-object v2, p1, La/u5c;->e:Ljava/util/List;

    .line 55
    .line 56
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_6

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_6
    iget v0, p0, La/u5c;->f:I

    .line 64
    .line 65
    iget v2, p1, La/u5c;->f:I

    .line 66
    .line 67
    if-eq v0, v2, :cond_7

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_7
    sget-object v0, La/obk0;->b:La/zie0;

    .line 71
    .line 72
    iget-object v0, p0, La/u5c;->g:Lorg/xplatform/security/impl/navigation/ChangePhoneNumberScreen;

    .line 73
    .line 74
    iget-object v2, p1, La/u5c;->g:Lorg/xplatform/security/impl/navigation/ChangePhoneNumberScreen;

    .line 75
    .line 76
    if-eq v0, v2, :cond_8

    .line 77
    .line 78
    return v1

    .line 79
    :cond_8
    iget-boolean p0, p0, La/u5c;->h:Z

    .line 80
    .line 81
    iget-boolean p1, p1, La/u5c;->h:Z

    .line 82
    .line 83
    if-eq p0, p1, :cond_9

    .line 84
    .line 85
    :goto_0
    return v1

    .line 86
    :cond_9
    :goto_1
    const/4 p0, 0x1

    .line 87
    return p0
.end method

.method public final getPhoneNumber()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/u5c;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getToken()La/swp0;
    .locals 0

    .line 1
    iget-object p0, p0, La/u5c;->b:La/swp0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/u5c;->a:Ljava/lang/String;

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
    iget-object v2, p0, La/u5c;->b:La/swp0;

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
    iget v0, p0, La/u5c;->c:I

    .line 19
    .line 20
    invoke-static {v0, v2, v1}, La/twn;->a(III)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v2, p0, La/u5c;->d:Ljava/util/List;

    .line 25
    .line 26
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-object v2, p0, La/u5c;->e:Ljava/util/List;

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget v2, p0, La/u5c;->f:I

    .line 37
    .line 38
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    sget-object v2, La/obk0;->c:La/obk0;

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
    iget-object v0, p0, La/u5c;->g:Lorg/xplatform/security/impl/navigation/ChangePhoneNumberScreen;

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
    iget-boolean p0, p0, La/u5c;->h:Z

    .line 59
    .line 60
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    add-int/2addr p0, v0

    .line 65
    return p0
.end method

.method public final i0()Lorg/xplatform/security/api/navigation/SecurityNavigationScreen;
    .locals 0

    .line 1
    iget-object p0, p0, La/u5c;->g:Lorg/xplatform/security/impl/navigation/ChangePhoneNumberScreen;

    .line 2
    .line 3
    return-object p0
.end method

.method public final p()I
    .locals 0

    .line 1
    iget p0, p0, La/u5c;->c:I

    .line 2
    .line 3
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    sget-object v0, La/obk0;->c:La/obk0;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "ConfirmNewPhoneNumberCode(phoneNumber="

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v2, p0, La/u5c;->a:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v2, ", token="

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v2, p0, La/u5c;->b:La/swp0;

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v2, ", confirmTypeAlias="

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v2, ", availableActivationTypeList="

    .line 31
    .line 32
    const-string v3, ", availableRepeatActivationTypeList="

    .line 33
    .line 34
    iget v4, p0, La/u5c;->c:I

    .line 35
    .line 36
    iget-object v5, p0, La/u5c;->d:Ljava/util/List;

    .line 37
    .line 38
    invoke-static {v4, v2, v3, v1, v5}, La/ohs0;->v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 39
    .line 40
    .line 41
    const-string v2, ", smsTime="

    .line 42
    .line 43
    const-string v3, ", currentActivationType="

    .line 44
    .line 45
    iget v4, p0, La/u5c;->f:I

    .line 46
    .line 47
    iget-object v5, p0, La/u5c;->e:Ljava/util/List;

    .line 48
    .line 49
    invoke-static {v4, v2, v3, v1, v5}, La/brm0;->v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v0, ", onTokenExpiredNavigationScreen="

    .line 56
    .line 57
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, La/u5c;->g:Lorg/xplatform/security/impl/navigation/ChangePhoneNumberScreen;

    .line 61
    .line 62
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v0, ", isRepeatFlow="

    .line 66
    .line 67
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v0, ")"

    .line 71
    .line 72
    iget-boolean p0, p0, La/u5c;->h:Z

    .line 73
    .line 74
    invoke-static {v1, p0, v0}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

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
    iget-boolean p0, p0, La/u5c;->h:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/u5c;->d:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method
