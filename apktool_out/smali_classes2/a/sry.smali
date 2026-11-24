.class public abstract La/sry;
.super La/pry;
.source "SourceFile"

# interfaces
.implements La/ger;
.implements La/zer;
.implements La/gre0;


# instance fields
.field public final c:La/ihy;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/Object;

.field public final f:La/a8z;

.field public final g:La/a8z;

.field public final h:La/a8z;

.field public final i:La/a8z;


# direct methods
.method public constructor <init>(La/ihy;Ljava/lang/String;Ljava/lang/Object;La/rgy;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p4}, La/ere0;-><init>(La/rgy;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/sry;->c:La/ihy;

    .line 14
    .line 15
    iput-object p2, p0, La/sry;->d:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p3, p0, La/sry;->e:Ljava/lang/Object;

    .line 18
    .line 19
    sget-object p1, La/wez;->a:La/wez;

    .line 20
    .line 21
    new-instance p2, La/rry;

    .line 22
    .line 23
    const/4 p3, 0x0

    .line 24
    invoke-direct {p2, p0, p3}, La/rry;-><init>(La/sry;B)V

    .line 25
    .line 26
    .line 27
    invoke-static {p1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    iput-object p2, p0, La/sry;->f:La/a8z;

    .line 32
    .line 33
    new-instance p2, La/rry;

    .line 34
    .line 35
    const/4 p3, 0x1

    .line 36
    invoke-direct {p2, p0, p3}, La/rry;-><init>(La/sry;B)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    iput-object p2, p0, La/sry;->g:La/a8z;

    .line 44
    .line 45
    new-instance p2, La/rry;

    .line 46
    .line 47
    const/4 p3, 0x2

    .line 48
    invoke-direct {p2, p0, p3}, La/rry;-><init>(La/sry;B)V

    .line 49
    .line 50
    .line 51
    invoke-static {p1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    iput-object p2, p0, La/sry;->h:La/a8z;

    .line 56
    .line 57
    new-instance p2, La/rry;

    .line 58
    .line 59
    const/4 p3, 0x3

    .line 60
    invoke-direct {p2, p0, p3}, La/rry;-><init>(La/sry;B)V

    .line 61
    .line 62
    .line 63
    invoke-static {p1, p2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iput-object p1, p0, La/sry;->i:La/a8z;

    .line 68
    .line 69
    return-void
.end method


# virtual methods
.method public A()La/fqy;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public abstract B()La/hfy;
.end method

.method public C()La/nzs0;
    .locals 0

    .line 1
    iget-object p0, p0, La/sry;->c:La/ihy;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    check-cast p0, La/xgy;

    .line 7
    .line 8
    iget-object p0, p0, La/xgy;->c:La/a8z;

    .line 9
    .line 10
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/vgy;

    .line 15
    .line 16
    invoke-virtual {p0}, La/vgy;->d()La/nzs0;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public abstract D()Ljava/util/List;
.end method

.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, La/ere0;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final G()La/bv9;
    .locals 0

    .line 1
    iget-object p0, p0, La/sry;->i:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/bv9;

    .line 8
    .line 9
    return-object p0
.end method

.method public final K()La/ihy;
    .locals 0

    .line 1
    iget-object p0, p0, La/sry;->c:La/ihy;

    .line 2
    .line 3
    return-object p0
.end method

.method public final L()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/sry;->e:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public final O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    filled-new-array {p1, p2, p3, p4, p5}, [Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, La/ere0;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final a()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/sry;->f:La/a8z;

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
    .locals 2

    .line 1
    invoke-static {p1}, La/xtt0;->b(Ljava/lang/Object;)La/gre0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object v0, p0, La/sry;->c:La/ihy;

    .line 9
    .line 10
    invoke-interface {p1}, La/dre0;->K()La/ihy;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-interface {p0}, La/qgy;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {p1}, La/qgy;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, La/sry;->d:Ljava/lang/String;

    .line 35
    .line 36
    invoke-interface {p1}, La/gre0;->getSignature()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    iget-object p0, p0, La/sry;->e:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-interface {p1}, La/dre0;->L()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-eqz p0, :cond_1

    .line 57
    .line 58
    const/4 p0, 0x1

    .line 59
    return p0

    .line 60
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 61
    return p0
.end method

.method public final f(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/fet;Ljava/lang/Integer;)Ljava/lang/Object;
    .locals 0

    .line 1
    filled-new-array/range {p1 .. p8}, [Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, La/ere0;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final findJavaDeclaration()Ljava/lang/reflect/GenericDeclaration;
    .locals 1

    .line 1
    iget-object v0, p0, La/sry;->c:La/ihy;

    .line 2
    .line 3
    iget-object p0, p0, La/sry;->d:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {v0, p0}, La/t9x;->E(La/ghy;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final getAnnotations()Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p0}, La/sry;->x()La/bv9;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, La/bv9;->b()Ljava/lang/reflect/Member;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    instance-of v0, p0, Ljava/lang/reflect/AnnotatedElement;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    check-cast p0, Ljava/lang/reflect/AnnotatedElement;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    :goto_0
    if-nez p0, :cond_1

    .line 18
    .line 19
    sget-object p0, La/iun;->a:La/iun;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_1
    invoke-interface {p0}, Ljava/lang/reflect/AnnotatedElement;->getAnnotations()[Ljava/lang/annotation/Annotation;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-static {p0}, La/tx3;->g0([Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, La/xtt0;->t(Ljava/util/List;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public final getArity()I
    .locals 0

    .line 1
    invoke-virtual {p0}, La/sry;->x()La/bv9;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {p0}, La/bv9;->a()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public final getParameters()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/sry;->g:La/a8z;

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

.method public final getSignature()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/sry;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTypeParameters()Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/sry;->C()La/nzs0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/nzs0;->a:Ljava/util/List;

    .line 6
    .line 7
    return-object p0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, La/sry;->c:La/ihy;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    invoke-interface {p0}, La/qgy;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/2addr v1, v0

    .line 18
    mul-int/lit8 v1, v1, 0x1f

    .line 19
    .line 20
    iget-object p0, p0, La/sry;->d:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    add-int/2addr p0, v1

    .line 27
    return p0
.end method

.method public final invoke()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    .line 10
    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p0, v0}, La/ere0;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, La/ere0;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 11
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, La/ere0;->call([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    filled-new-array {p1, p2, p3, p4}, [Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, La/ere0;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final n(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    filled-new-array/range {p1 .. p6}, [Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, La/ere0;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final p(Ljava/lang/reflect/Constructor;Z)La/sv9;
    .locals 3

    .line 1
    if-nez p2, :cond_3

    .line 2
    .line 3
    instance-of p2, p0, La/qry;

    .line 4
    .line 5
    if-eqz p2, :cond_3

    .line 6
    .line 7
    move-object p2, p0

    .line 8
    check-cast p2, La/qry;

    .line 9
    .line 10
    invoke-virtual {p2}, La/qry;->getVisibility()La/viy;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, La/viy;->d:La/viy;

    .line 15
    .line 16
    if-eq v0, v1, :cond_3

    .line 17
    .line 18
    iget-object v0, p2, La/sry;->c:La/ihy;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    check-cast v0, La/sgy;

    .line 24
    .line 25
    invoke-interface {v0}, La/sgy;->l()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_3

    .line 30
    .line 31
    invoke-virtual {p2}, La/sry;->getParameters()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    if-eqz p2, :cond_0

    .line 36
    .line 37
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    check-cast v0, La/hre0;

    .line 59
    .line 60
    invoke-virtual {v0}, La/hre0;->p()La/kiy;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {v0}, La/g7x;->G(La/kiy;)La/sgy;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-interface {v0}, La/sgy;->I()Z

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    if-eqz v1, :cond_1

    .line 73
    .line 74
    const-class v1, La/j0g0;

    .line 75
    .line 76
    sget-object v2, La/sre0;->a:La/tre0;

    .line 77
    .line 78
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-nez v0, :cond_1

    .line 87
    .line 88
    invoke-static {p0}, La/fre0;->W(La/dre0;)Z

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    if-eqz p2, :cond_2

    .line 93
    .line 94
    new-instance p2, La/cv9;

    .line 95
    .line 96
    invoke-static {p0}, La/fre0;->P(La/dre0;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-static {p1}, La/acb;->V(Ljava/lang/reflect/Constructor;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    invoke-direct {p2, p1, p0, v0}, La/cv9;-><init>(Ljava/lang/reflect/Constructor;Ljava/lang/Object;Z)V

    .line 105
    .line 106
    .line 107
    return-object p2

    .line 108
    :cond_2
    new-instance p0, La/dv9;

    .line 109
    .line 110
    invoke-static {p1}, La/acb;->V(Ljava/lang/reflect/Constructor;)Z

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    invoke-direct {p0, p1, p2}, La/dv9;-><init>(Ljava/lang/reflect/Constructor;Z)V

    .line 115
    .line 116
    .line 117
    return-object p0

    .line 118
    :cond_3
    :goto_0
    invoke-static {p0}, La/fre0;->W(La/dre0;)Z

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    if-eqz p2, :cond_4

    .line 123
    .line 124
    new-instance p2, La/ev9;

    .line 125
    .line 126
    invoke-static {p0}, La/fre0;->P(La/dre0;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-direct {p2, p1, p0}, La/ev9;-><init>(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    return-object p2

    .line 134
    :cond_4
    new-instance p0, La/fv9;

    .line 135
    .line 136
    invoke-direct {p0, p1}, La/fv9;-><init>(Ljava/lang/reflect/Constructor;)V

    .line 137
    .line 138
    .line 139
    return-object p0
.end method

.method public final q(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/fet;Ljava/lang/Integer;)Ljava/lang/Object;
    .locals 0

    .line 1
    filled-new-array/range {p1 .. p7}, [Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, La/ere0;->call([Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, La/rv00;->x(La/jhy;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final u(Ljava/lang/reflect/Method;Z)La/jv9;
    .locals 3

    .line 1
    invoke-static {p0}, La/fre0;->W(La/dre0;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    new-instance v0, La/qv9;

    .line 8
    .line 9
    iget-object v1, p0, La/sry;->c:La/ihy;

    .line 10
    .line 11
    instance-of v2, v1, La/zhy;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-static {p0}, La/fre0;->P(La/dre0;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {v0, p1, p2, p0}, La/qv9;-><init>(Ljava/lang/reflect/Method;ZLjava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string p2, "Only top-level functions are supported for now: "

    .line 26
    .line 27
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-interface {p0}, La/qgy;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    iget-object p0, p0, La/sry;->d:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {p1, p2, p0}, La/hny;->r(Ljava/lang/StringBuilder;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    return-object p0

    .line 44
    :cond_1
    new-instance p0, La/rv9;

    .line 45
    .line 46
    const/4 p2, 0x6

    .line 47
    const/4 v0, 0x2

    .line 48
    const/4 v1, 0x0

    .line 49
    invoke-direct {p0, v0, p2, p1, v1}, La/rv9;-><init>(BILjava/lang/reflect/Method;Z)V

    .line 50
    .line 51
    .line 52
    return-object p0
.end method

.method public final x()La/bv9;
    .locals 0

    .line 1
    iget-object p0, p0, La/sry;->h:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/bv9;

    .line 8
    .line 9
    return-object p0
.end method

.method public z()Ljava/util/List;
    .locals 0

    .line 1
    sget-object p0, La/iun;->a:La/iun;

    .line 2
    .line 3
    return-object p0
.end method
