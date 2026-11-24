.class public final synthetic La/hnk0;
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
    const-string v1, "androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate"

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    invoke-direct {v0, v1, p0, v2}, La/zna0;-><init>(Ljava/lang/String;La/pjt;I)V

    .line 13
    .line 14
    .line 15
    const-string v1, "keys"

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {v0, v1, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 19
    .line 20
    .line 21
    const-string v1, "values"

    .line 22
    .line 23
    invoke-virtual {v0, v1, v2}, La/zna0;->j(Ljava/lang/String;Z)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, La/hnk0;->descriptor:La/ugi0;

    .line 27
    .line 28
    iput-object p1, p0, La/hnk0;->a:La/jiy;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final childSerializers()[La/jiy;
    .locals 3

    .line 1
    sget-object v0, La/jnk0;->c:[La/a8z;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    new-array v1, v1, [La/jiy;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aget-object v0, v0, v2

    .line 8
    .line 9
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    aput-object v0, v1, v2

    .line 14
    .line 15
    new-instance v0, La/zw3;

    .line 16
    .line 17
    iget-object p0, p0, La/hnk0;->a:La/jiy;

    .line 18
    .line 19
    invoke-direct {v0, p0, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x1

    .line 23
    aput-object v0, v1, p0

    .line 24
    .line 25
    return-object v1
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, La/hnk0;->descriptor:La/ugi0;

    .line 2
    .line 3
    invoke-interface {p1, v0}, La/rkj;->a(La/ugi0;)La/bld;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget-object v1, La/jnk0;->c:[La/a8z;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    move v5, v2

    .line 13
    move v6, v3

    .line 14
    move-object v7, v4

    .line 15
    move-object v8, v7

    .line 16
    :goto_0
    if-eqz v5, :cond_3

    .line 17
    .line 18
    invoke-interface {p1, v0}, La/bld;->f(La/ugi0;)I

    .line 19
    .line 20
    .line 21
    move-result v9

    .line 22
    const/4 v10, -0x1

    .line 23
    if-eq v9, v10, :cond_2

    .line 24
    .line 25
    if-eqz v9, :cond_1

    .line 26
    .line 27
    if-ne v9, v2, :cond_0

    .line 28
    .line 29
    new-instance v9, La/zw3;

    .line 30
    .line 31
    iget-object v10, p0, La/hnk0;->a:La/jiy;

    .line 32
    .line 33
    invoke-direct {v9, v10, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 34
    .line 35
    .line 36
    invoke-interface {p1, v0, v2, v9, v8}, La/bld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v8

    .line 40
    check-cast v8, Ljava/util/List;

    .line 41
    .line 42
    or-int/lit8 v6, v6, 0x2

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-static {v9}, La/itt0;->c(I)V

    .line 46
    .line 47
    .line 48
    return-object v4

    .line 49
    :cond_1
    aget-object v9, v1, v3

    .line 50
    .line 51
    invoke-interface {v9}, La/a8z;->getValue()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v9

    .line 55
    check-cast v9, La/jiy;

    .line 56
    .line 57
    invoke-interface {p1, v0, v3, v9, v7}, La/bld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    check-cast v7, Ljava/util/List;

    .line 62
    .line 63
    or-int/lit8 v6, v6, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    move v5, v3

    .line 67
    goto :goto_0

    .line 68
    :cond_3
    invoke-interface {p1, v0}, La/bld;->c(La/ugi0;)V

    .line 69
    .line 70
    .line 71
    new-instance p0, La/jnk0;

    .line 72
    .line 73
    invoke-direct {p0, v6, v7, v8}, La/jnk0;-><init>(ILjava/util/List;Ljava/util/List;)V

    .line 74
    .line 75
    .line 76
    return-object p0
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    iget-object p0, p0, La/hnk0;->descriptor:La/ugi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p2, La/jnk0;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/hnk0;->descriptor:La/ugi0;

    .line 7
    .line 8
    invoke-interface {p1, v0}, La/bwn;->a(La/ugi0;)La/cld;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v1, La/jnk0;->c:[La/a8z;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    aget-object v1, v1, v2

    .line 16
    .line 17
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, La/jiy;

    .line 22
    .line 23
    iget-object v3, p2, La/jnk0;->a:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {p1, v0, v2, v1, v3}, La/cld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    new-instance v1, La/zw3;

    .line 29
    .line 30
    iget-object p0, p0, La/hnk0;->a:La/jiy;

    .line 31
    .line 32
    invoke-direct {v1, p0, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 33
    .line 34
    .line 35
    iget-object p0, p2, La/jnk0;->b:Ljava/util/List;

    .line 36
    .line 37
    const/4 p2, 0x1

    .line 38
    invoke-interface {p1, v0, p2, v1, p0}, La/cld;->m(La/ugi0;ILa/jiy;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-interface {p1, v0}, La/cld;->c(La/ugi0;)V

    .line 42
    .line 43
    .line 44
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
    iget-object p0, p0, La/hnk0;->a:La/jiy;

    .line 6
    .line 7
    aput-object p0, v0, v1

    .line 8
    .line 9
    return-object v0
.end method
