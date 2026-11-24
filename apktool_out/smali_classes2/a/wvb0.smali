.class public abstract La/wvb0;
.super La/o3d;
.source "SourceFile"


# instance fields
.field public final b:La/vvb0;


# direct methods
.method public constructor <init>(La/jiy;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, La/o3d;-><init>(La/jiy;)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/vvb0;

    .line 8
    .line 9
    invoke-interface {p1}, La/jiy;->getDescriptor()La/ugi0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-direct {v0, p1}, La/vvb0;-><init>(La/ugi0;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, La/wvb0;->b:La/vvb0;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, La/wvb0;->j()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, La/v1;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/uvb0;

    .line 10
    .line 11
    return-object p0
.end method

.method public final c(Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string p1, "This method lead to boxing and must not be used, use writeContents instead"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/v1;->e(La/rkj;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    iget-object p0, p0, La/wvb0;->b:La/vvb0;

    .line 2
    .line 3
    return-object p0
.end method

.method public j()Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    new-array p0, p0, [Z

    .line 3
    .line 4
    return-object p0
.end method

.method public k(La/cld;Ljava/lang/Object;I)V
    .locals 3

    .line 1
    check-cast p2, [Z

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-ge v0, p3, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, La/wvb0;->b:La/vvb0;

    .line 13
    .line 14
    aget-boolean v2, p2, v0

    .line 15
    .line 16
    invoke-interface {p1, v1, v0, v2}, La/cld;->x(La/ugi0;IZ)V

    .line 17
    .line 18
    .line 19
    add-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p2}, La/v1;->d(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, La/wvb0;->b:La/vvb0;

    .line 6
    .line 7
    invoke-interface {p1, v1}, La/bwn;->a(La/ugi0;)La/cld;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, p1, p2, v0}, La/wvb0;->k(La/cld;Ljava/lang/Object;I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p1, v1}, La/cld;->c(La/ugi0;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
