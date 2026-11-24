.class public final La/kf4;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public final a()Lorg/xplatform/core/navigation/authorization/screen/Authorization$Login$Dialog;
    .locals 3

    .line 1
    new-instance p0, Lorg/xplatform/core/navigation/authorization/screen/Authorization$Login$Dialog;

    .line 2
    .line 3
    sget-object v0, La/ze4;->g2:La/qek0;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    sget-object v0, La/ze4;->i2:Ljava/lang/String;

    .line 9
    .line 10
    new-instance v1, La/jf4;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v1, v2}, La/jf4;-><init>(B)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v0, v1}, Lorg/xplatform/core/navigation/authorization/screen/Authorization$Login$Dialog;-><init>(Ljava/lang/String;La/jf4;)V

    .line 17
    .line 18
    .line 19
    return-object p0
.end method
