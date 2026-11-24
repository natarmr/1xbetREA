.class public final La/y8m0;
.super La/dr30;
.source "SourceFile"


# static fields
.field public static final synthetic f:[La/iiy;


# instance fields
.field public final b:La/ffk;

.field public final c:Z

.field public final d:La/cu00;

.field public final e:La/cu00;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/y8m0;

    .line 4
    .line 5
    const-string v2, "functions"

    .line 6
    .line 7
    const-string v3, "getFunctions()Ljava/util/List;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/j0d0;

    .line 14
    .line 15
    const-string v3, "properties"

    .line 16
    .line 17
    const-string v5, "getProperties()Ljava/util/List;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    new-array v1, v1, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v1, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v1, v0

    .line 29
    .line 30
    sput-object v1, La/y8m0;->f:[La/iiy;

    .line 31
    .line 32
    return-void
.end method

.method public constructor <init>(La/eu00;La/ffk;Z)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, La/y8m0;->b:La/ffk;

    .line 8
    .line 9
    iput-boolean p3, p0, La/y8m0;->c:Z

    .line 10
    .line 11
    sget-object p2, La/slc;->a:La/slc;

    .line 12
    .line 13
    new-instance p2, La/x8m0;

    .line 14
    .line 15
    const/4 p3, 0x0

    .line 16
    invoke-direct {p2, p0, p3}, La/x8m0;-><init>(La/y8m0;B)V

    .line 17
    .line 18
    .line 19
    new-instance p3, La/cu00;

    .line 20
    .line 21
    invoke-direct {p3, p1, p2}, La/bu00;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 22
    .line 23
    .line 24
    iput-object p3, p0, La/y8m0;->d:La/cu00;

    .line 25
    .line 26
    new-instance p2, La/x8m0;

    .line 27
    .line 28
    const/4 p3, 0x1

    .line 29
    invoke-direct {p2, p0, p3}, La/x8m0;-><init>(La/y8m0;B)V

    .line 30
    .line 31
    .line 32
    new-instance p3, La/cu00;

    .line 33
    .line 34
    invoke-direct {p3, p1, p2}, La/bu00;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 35
    .line 36
    .line 37
    iput-object p3, p0, La/y8m0;->e:La/cu00;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final a(La/g950;La/ux50;)Ljava/util/Collection;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p2, La/y8m0;->f:[La/iiy;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    aget-object p2, p2, v0

    .line 8
    .line 9
    iget-object p0, p0, La/y8m0;->d:La/cu00;

    .line 10
    .line 11
    invoke-static {p0, p2}, La/yqm0;->s(La/r660;La/iiy;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Ljava/util/List;

    .line 16
    .line 17
    new-instance p2, La/mbk0;

    .line 18
    .line 19
    invoke-direct {p2}, La/mbk0;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    move-object v1, v0

    .line 37
    check-cast v1, La/fyj0;

    .line 38
    .line 39
    invoke-virtual {v1}, La/wjj;->getName()La/g950;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    invoke-virtual {p2, v0}, La/mbk0;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    return-object p2
.end method

.method public final b(La/cek;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    sget-object p2, La/y8m0;->f:[La/iiy;

    .line 6
    .line 7
    aget-object p1, p2, p1

    .line 8
    .line 9
    iget-object v0, p0, La/y8m0;->d:La/cu00;

    .line 10
    .line 11
    invoke-static {v0, p1}, La/yqm0;->s(La/r660;La/iiy;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ljava/util/List;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    aget-object p2, p2, v0

    .line 19
    .line 20
    iget-object p0, p0, La/y8m0;->e:La/cu00;

    .line 21
    .line 22
    invoke-static {p0, p2}, La/yqm0;->s(La/r660;La/iiy;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Ljava/util/List;

    .line 27
    .line 28
    invoke-static {p1, p0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public final d(La/g950;La/ux50;)La/foc;
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
    const/4 p0, 0x0

    .line 8
    return-object p0
.end method

.method public final f(La/g950;La/ux50;)Ljava/util/Collection;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p2, La/y8m0;->f:[La/iiy;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    aget-object p2, p2, v0

    .line 8
    .line 9
    iget-object p0, p0, La/y8m0;->e:La/cu00;

    .line 10
    .line 11
    invoke-static {p0, p2}, La/yqm0;->s(La/r660;La/iiy;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Ljava/util/List;

    .line 16
    .line 17
    new-instance p2, La/mbk0;

    .line 18
    .line 19
    invoke-direct {p2}, La/mbk0;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    move-object v1, v0

    .line 37
    check-cast v1, La/d0d0;

    .line 38
    .line 39
    invoke-interface {v1}, La/vjj;->getName()La/g950;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    invoke-virtual {p2, v0}, La/mbk0;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    return-object p2
.end method
