.class public final La/bi90;
.super La/d5;
.source "SourceFile"

# interfaces
.implements La/g4x;


# static fields
.field public static final e:La/bi90;


# instance fields
.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:La/dh90;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/bi90;

    .line 2
    .line 3
    sget-object v1, La/ujn;->k:La/ujn;

    .line 4
    .line 5
    sget-object v2, La/dh90;->f:La/dh90;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1, v1, v2}, La/bi90;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/dh90;)V

    .line 11
    .line 12
    .line 13
    sput-object v0, La/bi90;->e:La/bi90;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Object;La/dh90;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/bi90;->b:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/bi90;->c:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, La/bi90;->d:La/dh90;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b()I
    .locals 0

    .line 1
    iget-object p0, p0, La/bi90;->d:La/dh90;

    .line 2
    .line 3
    iget p0, p0, La/dh90;->e:I

    .line 4
    .line 5
    return p0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, La/bi90;->d:La/dh90;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/dh90;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final e(Ljava/util/Collection;)La/bi90;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    new-instance v0, La/di90;

    .line 12
    .line 13
    invoke-direct {v0, p0}, La/di90;-><init>(La/bi90;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, La/di90;->e()La/bi90;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    iget-object v0, p0, La/bi90;->d:La/dh90;

    .line 2
    .line 3
    iget-object v1, v0, La/dh90;->d:La/nqs0;

    .line 4
    .line 5
    if-ne p1, p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    instance-of v2, p1, Ljava/util/Set;

    .line 10
    .line 11
    if-nez v2, :cond_1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    iget v0, v0, La/dh90;->e:I

    .line 15
    .line 16
    move-object v2, p1

    .line 17
    check-cast v2, Ljava/util/Set;

    .line 18
    .line 19
    invoke-interface {v2}, Ljava/util/Set;->size()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eq v0, v3, :cond_2

    .line 24
    .line 25
    :goto_0
    const/4 p0, 0x0

    .line 26
    return p0

    .line 27
    :cond_2
    instance-of v0, v2, La/bi90;

    .line 28
    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    check-cast p1, La/bi90;

    .line 32
    .line 33
    iget-object p0, p1, La/bi90;->d:La/dh90;

    .line 34
    .line 35
    iget-object p0, p0, La/dh90;->d:La/nqs0;

    .line 36
    .line 37
    new-instance p1, La/ch90;

    .line 38
    .line 39
    const/16 v0, 0x10

    .line 40
    .line 41
    invoke-direct {p1, v0}, La/ch90;-><init>(B)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, p0, p1}, La/nqs0;->g(La/nqs0;Lkotlin/jvm/functions/Function2;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    return p0

    .line 49
    :cond_3
    instance-of v0, v2, La/di90;

    .line 50
    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    check-cast p1, La/di90;

    .line 54
    .line 55
    iget-object p0, p1, La/di90;->d:La/gh90;

    .line 56
    .line 57
    iget-object p0, p0, La/gh90;->c:La/nqs0;

    .line 58
    .line 59
    new-instance p1, La/ch90;

    .line 60
    .line 61
    const/16 v0, 0x11

    .line 62
    .line 63
    invoke-direct {p1, v0}, La/ch90;-><init>(B)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, p0, p1}, La/nqs0;->g(La/nqs0;Lkotlin/jvm/functions/Function2;)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    return p0

    .line 71
    :cond_4
    invoke-super {p0, p1}, La/d5;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    return p0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    .line 1
    new-instance v0, La/ai90;

    .line 2
    .line 3
    iget-object v1, p0, La/bi90;->d:La/dh90;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object p0, p0, La/bi90;->b:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-direct {v0, p0, v1, v2}, La/ai90;-><init>(Ljava/lang/Object;Ljava/util/Map;B)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
