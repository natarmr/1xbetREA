.class public final La/fnu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/dq00;


# direct methods
.method public synthetic constructor <init>(La/dq00;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/fnu;->a:La/dq00;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)La/nq90;
    .locals 2

    .line 1
    iget-object p0, p0, La/fnu;->a:La/dq00;

    .line 2
    .line 3
    iget-object p0, p0, La/dq00;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/yp90;

    .line 6
    .line 7
    iget-object p0, p0, La/yp90;->a:La/p7m0;

    .line 8
    .line 9
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Ljava/util/List;

    .line 14
    .line 15
    if-eqz p0, :cond_2

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    move-object v1, v0

    .line 32
    check-cast v1, La/nq90;

    .line 33
    .line 34
    invoke-interface {v1}, La/nq90;->getId()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-ne v1, p1, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    const/4 v0, 0x0

    .line 42
    :goto_0
    check-cast v0, La/nq90;

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    return-object v0

    .line 47
    :cond_2
    new-instance p0, La/c44;

    .line 48
    .line 49
    const/16 p1, 0x9

    .line 50
    .line 51
    invoke-direct {p0, p1}, La/c44;-><init>(B)V

    .line 52
    .line 53
    .line 54
    throw p0
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "+"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lkotlin/text/StringsKt;->d0(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object p0, p0, La/fnu;->a:La/dq00;

    .line 8
    .line 9
    iget-object p0, p0, La/dq00;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, La/imb;

    .line 12
    .line 13
    iget-object p0, p0, La/imb;->a:La/p7m0;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p0, v0, p1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/util/List;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    const/16 v1, 0xa

    .line 10
    .line 11
    invoke-static {p2, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, La/qkt;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget v3, v1, La/qkt;->a:I

    .line 38
    .line 39
    iget-boolean v11, v1, La/qkt;->g:Z

    .line 40
    .line 41
    iget-object v7, v1, La/qkt;->b:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v2, v1, La/qkt;->f:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {p1, v2}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    iget-wide v4, v1, La/qkt;->e:J

    .line 50
    .line 51
    iget-object v9, v1, La/qkt;->c:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v6, v1, La/qkt;->h:La/cm90;

    .line 54
    .line 55
    iget-object v10, v1, La/qkt;->d:Ljava/lang/String;

    .line 56
    .line 57
    new-instance v2, La/gq90;

    .line 58
    .line 59
    invoke-direct/range {v2 .. v11}, La/gq90;-><init>(IJLa/cm90;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    iget-object p0, p0, La/fnu;->a:La/dq00;

    .line 67
    .line 68
    invoke-virtual {p0, v0}, La/dq00;->k(Ljava/util/List;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method
