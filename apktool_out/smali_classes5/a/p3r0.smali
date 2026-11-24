.class public final synthetic La/p3r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pjt;


# static fields
.field public static final a:La/p3r0;

.field private static final descriptor:La/ugi0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/p3r0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/p3r0;->a:La/p3r0;

    .line 7
    .line 8
    new-instance v1, La/zna0;

    .line 9
    .line 10
    const-string v2, "org.xplatform.special_event.impl.top_players.data.models.TopEventResponse"

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    invoke-direct {v1, v2, v0, v3}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "tabs"

    .line 17
    .line 18
    const/4 v2, 0x1

    .line 19
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    const-string v0, "legends"

    .line 23
    .line 24
    invoke-virtual {v1, v0, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    sput-object v1, La/p3r0;->descriptor:La/ugi0;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 4

    .line 1
    sget-object p0, La/r3r0;->c:[La/a8z;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aget-object v1, p0, v0

    .line 5
    .line 6
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, La/jiy;

    .line 11
    .line 12
    invoke-static {v1}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x1

    .line 17
    aget-object p0, p0, v2

    .line 18
    .line 19
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, La/jiy;

    .line 24
    .line 25
    invoke-static {p0}, La/mrv;->j0(La/jiy;)La/jiy;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const/4 v3, 0x2

    .line 30
    new-array v3, v3, [La/jiy;

    .line 31
    .line 32
    aput-object v1, v3, v0

    .line 33
    .line 34
    aput-object p0, v3, v2

    .line 35
    .line 36
    return-object v3
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 10

    .line 1
    sget-object p0, La/p3r0;->descriptor:La/ugi0;

    .line 2
    .line 3
    invoke-interface {p1, p0}, La/rkj;->a(La/ugi0;)La/bld;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object v0, La/r3r0;->c:[La/a8z;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    move v4, v1

    .line 13
    move v5, v2

    .line 14
    move-object v6, v3

    .line 15
    move-object v7, v6

    .line 16
    :goto_0
    if-eqz v4, :cond_3

    .line 17
    .line 18
    invoke-interface {p1, p0}, La/bld;->f(La/ugi0;)I

    .line 19
    .line 20
    .line 21
    move-result v8

    .line 22
    const/4 v9, -0x1

    .line 23
    if-eq v8, v9, :cond_2

    .line 24
    .line 25
    if-eqz v8, :cond_1

    .line 26
    .line 27
    if-ne v8, v1, :cond_0

    .line 28
    .line 29
    aget-object v8, v0, v1

    .line 30
    .line 31
    invoke-interface {v8}, La/a8z;->getValue()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    check-cast v8, La/jiy;

    .line 36
    .line 37
    invoke-interface {p1, p0, v1, v8, v7}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    check-cast v7, Ljava/util/List;

    .line 42
    .line 43
    or-int/lit8 v5, v5, 0x2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    invoke-static {v8}, La/itt0;->c(I)V

    .line 47
    .line 48
    .line 49
    return-object v3

    .line 50
    :cond_1
    aget-object v8, v0, v2

    .line 51
    .line 52
    invoke-interface {v8}, La/a8z;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v8

    .line 56
    check-cast v8, La/jiy;

    .line 57
    .line 58
    invoke-interface {p1, p0, v2, v8, v6}, La/bld;->e(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    check-cast v6, Ljava/util/List;

    .line 63
    .line 64
    or-int/lit8 v5, v5, 0x1

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    move v4, v2

    .line 68
    goto :goto_0

    .line 69
    :cond_3
    invoke-interface {p1, p0}, La/bld;->c(La/ugi0;)V

    .line 70
    .line 71
    .line 72
    new-instance p0, La/r3r0;

    .line 73
    .line 74
    invoke-direct {p0, v5, v6, v7}, La/r3r0;-><init>(ILjava/util/List;Ljava/util/List;)V

    .line 75
    .line 76
    .line 77
    return-object p0
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    sget-object p0, La/p3r0;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p2, La/r3r0;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p2, La/r3r0;->b:Ljava/util/List;

    .line 7
    .line 8
    iget-object p2, p2, La/r3r0;->a:Ljava/util/List;

    .line 9
    .line 10
    sget-object v0, La/p3r0;->descriptor:La/ugi0;

    .line 11
    .line 12
    invoke-interface {p1, v0}, La/bwn;->a(La/ugi0;)La/cld;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    sget-object v1, La/r3r0;->c:[La/a8z;

    .line 17
    .line 18
    invoke-interface {p1, v0}, La/cld;->u(La/ugi0;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    if-eqz p2, :cond_1

    .line 26
    .line 27
    :goto_0
    const/4 v2, 0x0

    .line 28
    aget-object v3, v1, v2

    .line 29
    .line 30
    invoke-interface {v3}, La/a8z;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    check-cast v3, La/jiy;

    .line 35
    .line 36
    invoke-interface {p1, v0, v2, v3, p2}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-interface {p1, v0}, La/cld;->u(La/ugi0;)Z

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    if-eqz p2, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    if-eqz p0, :cond_3

    .line 47
    .line 48
    :goto_1
    const/4 p2, 0x1

    .line 49
    aget-object v1, v1, p2

    .line 50
    .line 51
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, La/jiy;

    .line 56
    .line 57
    invoke-interface {p1, v0, p2, v1, p0}, La/cld;->p(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :cond_3
    invoke-interface {p1, v0}, La/cld;->c(La/ugi0;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method
