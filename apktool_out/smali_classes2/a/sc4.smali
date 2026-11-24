.class public abstract La/sc4;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(La/uu4;)Lorg/xplatform/login/core/presentation/model/AuthDataModel;
    .locals 7

    .line 1
    instance-of v0, p0, La/tu4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lorg/xplatform/login/core/presentation/model/AuthDataModel$User;

    .line 6
    .line 7
    check-cast p0, La/tu4;

    .line 8
    .line 9
    iget-object v1, p0, La/tu4;->a:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v2, p0, La/tu4;->b:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v3, p0, La/tu4;->c:Ljava/lang/String;

    .line 14
    .line 15
    iget-object p0, p0, La/tu4;->d:Ljava/lang/String;

    .line 16
    .line 17
    invoke-direct {v0, v1, v2, v3, p0}, Lorg/xplatform/login/core/presentation/model/AuthDataModel$User;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    instance-of v0, p0, La/su4;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    new-instance v1, Lorg/xplatform/login/core/presentation/model/AuthDataModel$Social;

    .line 26
    .line 27
    check-cast p0, La/su4;

    .line 28
    .line 29
    iget-object v3, p0, La/su4;->a:Ljava/lang/String;

    .line 30
    .line 31
    iget v2, p0, La/su4;->b:I

    .line 32
    .line 33
    iget-object v4, p0, La/su4;->c:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v5, p0, La/su4;->d:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v6, p0, La/su4;->e:Ljava/lang/String;

    .line 38
    .line 39
    invoke-direct/range {v1 .. v6}, Lorg/xplatform/login/core/presentation/model/AuthDataModel$Social;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object v1

    .line 43
    :cond_1
    instance-of v0, p0, La/ru4;

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    check-cast p0, La/ru4;

    .line 48
    .line 49
    iget-object p0, p0, La/ru4;->a:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    new-instance v0, Lorg/xplatform/login/core/presentation/model/AuthDataModel$Qr;

    .line 55
    .line 56
    invoke-direct {v0, p0}, Lorg/xplatform/login/core/presentation/model/AuthDataModel$Qr;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 61
    .line 62
    .line 63
    const/4 p0, 0x0

    .line 64
    return-object p0
.end method
