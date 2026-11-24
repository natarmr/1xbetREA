.class public abstract La/vu4;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lorg/xplatform/login/core/presentation/model/AuthDataModel;)La/uu4;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-eqz p0, :cond_2

    .line 5
    .line 6
    instance-of v0, p0, Lorg/xplatform/login/core/presentation/model/AuthDataModel$Social;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v1, La/su4;

    .line 11
    .line 12
    check-cast p0, Lorg/xplatform/login/core/presentation/model/AuthDataModel$Social;

    .line 13
    .line 14
    iget-object v3, p0, Lorg/xplatform/login/core/presentation/model/AuthDataModel$Social;->a:Ljava/lang/String;

    .line 15
    .line 16
    iget v2, p0, Lorg/xplatform/login/core/presentation/model/AuthDataModel$Social;->b:I

    .line 17
    .line 18
    iget-object v4, p0, Lorg/xplatform/login/core/presentation/model/AuthDataModel$Social;->c:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v5, p0, Lorg/xplatform/login/core/presentation/model/AuthDataModel$Social;->d:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v6, p0, Lorg/xplatform/login/core/presentation/model/AuthDataModel$Social;->e:Ljava/lang/String;

    .line 23
    .line 24
    invoke-direct/range {v1 .. v6}, La/su4;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-object v1

    .line 28
    :cond_0
    instance-of v0, p0, Lorg/xplatform/login/core/presentation/model/AuthDataModel$User;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    new-instance v0, La/tu4;

    .line 33
    .line 34
    check-cast p0, Lorg/xplatform/login/core/presentation/model/AuthDataModel$User;

    .line 35
    .line 36
    iget-object v1, p0, Lorg/xplatform/login/core/presentation/model/AuthDataModel$User;->a:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v2, p0, Lorg/xplatform/login/core/presentation/model/AuthDataModel$User;->b:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v3, p0, Lorg/xplatform/login/core/presentation/model/AuthDataModel$User;->c:Ljava/lang/String;

    .line 41
    .line 42
    iget-object p0, p0, Lorg/xplatform/login/core/presentation/model/AuthDataModel$User;->d:Ljava/lang/String;

    .line 43
    .line 44
    invoke-direct {v0, v1, v2, v3, p0}, La/tu4;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object v0

    .line 48
    :cond_1
    instance-of v0, p0, Lorg/xplatform/login/core/presentation/model/AuthDataModel$Qr;

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    check-cast p0, Lorg/xplatform/login/core/presentation/model/AuthDataModel$Qr;

    .line 53
    .line 54
    iget-object p0, p0, Lorg/xplatform/login/core/presentation/model/AuthDataModel$Qr;->a:Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    new-instance v0, La/ru4;

    .line 60
    .line 61
    invoke-direct {v0, p0}, La/ru4;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object v0

    .line 65
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 66
    .line 67
    .line 68
    const/4 p0, 0x0

    .line 69
    return-object p0
.end method
