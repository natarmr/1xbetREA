.class public final La/zqv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ugi0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:La/ugi0;


# direct methods
.method public constructor <init>(Ljava/lang/String;La/ugi0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/zqv0;->a:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, La/zqv0;->b:La/ugi0;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/zqv0;->b:La/ugi0;

    .line 2
    .line 3
    invoke-interface {p0}, La/ugi0;->b()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final c(Ljava/lang/String;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/zqv0;->b:La/ugi0;

    .line 5
    .line 6
    invoke-interface {p0, p1}, La/ugi0;->c(Ljava/lang/String;)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method public final d()I
    .locals 0

    .line 1
    iget-object p0, p0, La/zqv0;->b:La/ugi0;

    .line 2
    .line 3
    invoke-interface {p0}, La/ugi0;->d()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final e(I)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/zqv0;->b:La/ugi0;

    .line 2
    .line 3
    invoke-interface {p0, p1}, La/ugi0;->e(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, La/zqv0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, La/zqv0;

    .line 10
    .line 11
    iget-object v0, p1, La/zqv0;->a:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p0, La/zqv0;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iget-object p0, p0, La/zqv0;->b:La/ugi0;

    .line 22
    .line 23
    iget-object p1, p1, La/zqv0;->b:La/ugi0;

    .line 24
    .line 25
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_2

    .line 30
    .line 31
    :goto_0
    const/4 p0, 0x1

    .line 32
    return p0

    .line 33
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 34
    return p0
.end method

.method public final f(I)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/zqv0;->b:La/ugi0;

    .line 2
    .line 3
    invoke-interface {p0, p1}, La/ugi0;->f(I)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final g(I)La/ugi0;
    .locals 0

    .line 1
    iget-object p0, p0, La/zqv0;->b:La/ugi0;

    .line 2
    .line 3
    invoke-interface {p0, p1}, La/ugi0;->g(I)La/ugi0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getAnnotations()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/zqv0;->b:La/ugi0;

    .line 2
    .line 3
    invoke-interface {p0}, La/ugi0;->getAnnotations()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final h()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/zqv0;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, La/zqv0;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object p0, p0, La/zqv0;->b:La/ugi0;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0
.end method

.method public final i(I)Z
    .locals 0

    .line 1
    iget-object p0, p0, La/zqv0;->b:La/ugi0;

    .line 2
    .line 3
    invoke-interface {p0, p1}, La/ugi0;->i(I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final isInline()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/zqv0;->b:La/ugi0;

    .line 2
    .line 3
    invoke-interface {p0}, La/ugi0;->isInline()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final l()La/c3x;
    .locals 0

    .line 1
    iget-object p0, p0, La/zqv0;->b:La/ugi0;

    .line 2
    .line 3
    invoke-interface {p0}, La/ugi0;->l()La/c3x;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, La/n2x;->R(La/ugi0;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
