.class public final synthetic La/jx5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# instance fields
.field public final synthetic a:La/jiy;

.field private final descriptor:La/ugi0;


# direct methods
.method public constructor <init>(La/jiy;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/zna0;

    .line 8
    .line 9
    const-string v1, "org.xplatform.app_start.impl.data.model.response.BaseDictionaryResponse"

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-direct {v0, v1, p0, v2}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 13
    .line 14
    .line 15
    const-string v1, "data"

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/jx5;->descriptor:La/ugi0;

    .line 21
    .line 22
    iput-object p1, p0, La/jx5;->a:La/jiy;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 2

    .line 1
    sget-object v0, La/nx5;->Companion:La/mx5;

    .line 2
    .line 3
    iget-object p0, p0, La/jx5;->a:La/jiy;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, La/mx5;->serializer(La/jiy;)La/jiy;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 v0, 0x1

    .line 14
    new-array v0, v0, [La/jiy;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    aput-object p0, v0, v1

    .line 18
    .line 19
    return-object v0
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, La/jx5;->descriptor:La/ugi0;

    .line 2
    .line 3
    invoke-interface {p1, v0}, La/rkj;->a(La/ugi0;)La/bld;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    move v4, v1

    .line 11
    move v5, v2

    .line 12
    move-object v6, v3

    .line 13
    :goto_0
    if-eqz v4, :cond_2

    .line 14
    .line 15
    invoke-interface {p1, v0}, La/bld;->f(La/ugi0;)I

    .line 16
    .line 17
    .line 18
    move-result v7

    .line 19
    const/4 v8, -0x1

    .line 20
    if-eq v7, v8, :cond_1

    .line 21
    .line 22
    if-nez v7, :cond_0

    .line 23
    .line 24
    sget-object v5, La/nx5;->Companion:La/mx5;

    .line 25
    .line 26
    iget-object v7, p0, La/jx5;->a:La/jiy;

    .line 27
    .line 28
    invoke-virtual {v5, v7}, La/mx5;->serializer(La/jiy;)La/jiy;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    check-cast v5, La/jiy;

    .line 33
    .line 34
    invoke-interface {p1, v0, v2, v5, v6}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    move-object v6, v5

    .line 39
    check-cast v6, La/nx5;

    .line 40
    .line 41
    move v5, v1

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-static {v7}, La/itt0;->c(I)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_1
    move v4, v2

    .line 48
    goto :goto_0

    .line 49
    :cond_2
    invoke-interface {p1, v0}, La/bld;->c(La/ugi0;)V

    .line 50
    .line 51
    .line 52
    new-instance p0, La/ox5;

    .line 53
    .line 54
    invoke-direct {p0, v5, v6}, La/ox5;-><init>(ILa/nx5;)V

    .line 55
    .line 56
    .line 57
    return-object p0
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    iget-object p0, p0, La/jx5;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p2, La/ox5;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p2, p2, La/ox5;->a:La/nx5;

    .line 7
    .line 8
    iget-object v0, p0, La/jx5;->descriptor:La/ugi0;

    .line 9
    .line 10
    invoke-interface {p1, v0}, La/bwn;->a(La/ugi0;)La/cld;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p1, v0}, La/cld;->u(La/ugi0;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    if-eqz p2, :cond_1

    .line 22
    .line 23
    :goto_0
    sget-object v1, La/nx5;->Companion:La/mx5;

    .line 24
    .line 25
    iget-object p0, p0, La/jx5;->a:La/jiy;

    .line 26
    .line 27
    invoke-virtual {v1, p0}, La/mx5;->serializer(La/jiy;)La/jiy;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/jiy;

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    invoke-interface {p1, v0, v1, p0, p2}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-interface {p1, v0}, La/cld;->c(La/ugi0;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final typeParametersSerializers()[La/jiy;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v0, v0, [La/jiy;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iget-object p0, p0, La/jx5;->a:La/jiy;

    .line 6
    .line 7
    aput-object p0, v0, v1

    .line 8
    .line 9
    return-object v0
.end method
