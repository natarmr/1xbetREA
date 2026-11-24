.class public final La/eek;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/sgy;
.implements La/yx40;


# instance fields
.field public final a:La/sgy;

.field public final b:La/wm40;

.field public final c:La/a8z;

.field public final d:La/a8z;


# direct methods
.method public constructor <init>(La/sgy;La/wm40;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/eek;->a:La/sgy;

    .line 5
    .line 6
    iput-object p2, p0, La/eek;->b:La/wm40;

    .line 7
    .line 8
    sget-object p1, La/wez;->a:La/wez;

    .line 9
    .line 10
    new-instance p2, La/dek;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-direct {p2, p0, v0}, La/dek;-><init>(La/eek;B)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    iput-object p2, p0, La/eek;->c:La/a8z;

    .line 21
    .line 22
    new-instance p2, La/dek;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-direct {p2, p0, v0}, La/dek;-><init>(La/eek;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {p1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, La/eek;->d:La/a8z;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final I()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/eek;->a:La/sgy;

    .line 2
    .line 3
    invoke-interface {p0}, La/sgy;->I()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final J()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/eek;->b:La/wm40;

    .line 2
    .line 3
    invoke-interface {p0}, La/vjj;->getName()La/g950;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, La/g950;->b()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    return-object p0
.end method

.method public final b()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/eek;->d:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/List;

    .line 8
    .line 9
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, La/yx40;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, La/yx40;

    .line 6
    .line 7
    invoke-interface {p1}, La/yx40;->w()La/sgy;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p0, p0, La/eek;->a:La/sgy;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public final g()Ljava/util/Collection;
    .locals 0

    .line 1
    iget-object p0, p0, La/eek;->a:La/sgy;

    .line 2
    .line 3
    invoke-interface {p0}, La/sgy;->g()Ljava/util/Collection;

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
    iget-object p0, p0, La/eek;->a:La/sgy;

    .line 2
    .line 3
    invoke-interface {p0}, La/pgy;->getAnnotations()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getTypeParameters()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/eek;->c:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/List;

    .line 8
    .line 9
    return-object p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, La/eek;->a:La/sgy;

    .line 2
    .line 3
    invoke-interface {p0}, La/sgy;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    mul-int/lit8 p0, p0, 0x1f

    .line 8
    .line 9
    return p0
.end method

.method public final i()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/eek;->a:La/sgy;

    .line 2
    .line 3
    invoke-interface {p0}, La/sgy;->i()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final l()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/eek;->a:La/sgy;

    .line 2
    .line 3
    invoke-interface {p0}, La/sgy;->l()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final r(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, La/eek;->a:La/sgy;

    .line 2
    .line 3
    invoke-interface {p0, p1}, La/sgy;->r(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final s()Ljava/util/Collection;
    .locals 0

    .line 1
    iget-object p0, p0, La/eek;->a:La/sgy;

    .line 2
    .line 3
    invoke-interface {p0}, La/sgy;->s()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "MutableCollectionKClass("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/eek;->a:La/sgy;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x29

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final v()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/eek;->b:La/wm40;

    .line 2
    .line 3
    invoke-static {p0}, La/rek;->g(La/vjj;)La/swq;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, La/swq;->a:La/twq;

    .line 8
    .line 9
    iget-object p0, p0, La/twq;->a:Ljava/lang/String;

    .line 10
    .line 11
    return-object p0
.end method

.method public final w()La/sgy;
    .locals 0

    .line 1
    iget-object p0, p0, La/eek;->a:La/sgy;

    .line 2
    .line 3
    return-object p0
.end method
