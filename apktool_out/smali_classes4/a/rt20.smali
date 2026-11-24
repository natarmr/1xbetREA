.class public abstract La/rt20;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(IZ)La/qt20;
    .locals 1

    .line 1
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 2
    .line 3
    iget-byte v0, v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    new-instance p0, La/ot20;

    .line 8
    .line 9
    invoke-direct {p0, p1}, La/ot20;-><init>(Z)V

    .line 10
    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    sget-object p0, La/pt20;->a:La/pt20;

    .line 14
    .line 15
    return-object p0
.end method
