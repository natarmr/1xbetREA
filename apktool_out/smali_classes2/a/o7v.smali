.class public abstract La/o7v;
.super La/dr30;
.source "SourceFile"


# static fields
.field public static final synthetic d:[La/iiy;


# instance fields
.field public final b:La/h1;

.field public final c:La/cu00;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/o7v;

    .line 4
    .line 5
    const-string v2, "allDescriptors"

    .line 6
    .line 7
    const-string v3, "getAllDescriptors()Ljava/util/List;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/o7v;->d:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(La/eu00;La/h1;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, La/o7v;->b:La/h1;

    .line 8
    .line 9
    new-instance p2, La/t7t;

    .line 10
    .line 11
    const/4 v0, 0x7

    .line 12
    invoke-direct {p2, p0, v0}, La/t7t;-><init>(Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    new-instance v0, La/cu00;

    .line 16
    .line 17
    invoke-direct {v0, p1, p2}, La/bu00;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/o7v;->c:La/cu00;

    .line 21
    .line 22
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
    sget-object p2, La/o7v;->d:[La/iiy;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    aget-object p2, p2, v0

    .line 8
    .line 9
    iget-object p0, p0, La/o7v;->c:La/cu00;

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
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    sget-object p0, La/iun;->a:La/iun;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_0
    new-instance p2, La/mbk0;

    .line 27
    .line 28
    invoke-direct {p2}, La/mbk0;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    instance-of v1, v0, La/fyj0;

    .line 46
    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    move-object v1, v0

    .line 50
    check-cast v1, La/fyj0;

    .line 51
    .line 52
    invoke-virtual {v1}, La/wjj;->getName()La/g950;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    invoke-virtual {p2, v0}, La/mbk0;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    return-object p2
.end method

.method public final b(La/cek;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p2, La/cek;->n:La/cek;

    .line 5
    .line 6
    iget p2, p2, La/cek;->b:I

    .line 7
    .line 8
    invoke-virtual {p1, p2}, La/cek;->a(I)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    sget-object p0, La/iun;->a:La/iun;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    sget-object p1, La/o7v;->d:[La/iiy;

    .line 18
    .line 19
    const/4 p2, 0x0

    .line 20
    aget-object p1, p1, p2

    .line 21
    .line 22
    iget-object p0, p0, La/o7v;->c:La/cu00;

    .line 23
    .line 24
    invoke-static {p0, p1}, La/yqm0;->s(La/r660;La/iiy;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Ljava/util/List;

    .line 29
    .line 30
    return-object p0
.end method

.method public final f(La/g950;La/ux50;)Ljava/util/Collection;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p2, La/o7v;->d:[La/iiy;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    aget-object p2, p2, v0

    .line 8
    .line 9
    iget-object p0, p0, La/o7v;->c:La/cu00;

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
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    sget-object p0, La/iun;->a:La/iun;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_0
    new-instance p2, La/mbk0;

    .line 27
    .line 28
    invoke-direct {p2}, La/mbk0;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    instance-of v1, v0, La/d0d0;

    .line 46
    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    move-object v1, v0

    .line 50
    check-cast v1, La/d0d0;

    .line 51
    .line 52
    invoke-interface {v1}, La/vjj;->getName()La/g950;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    invoke-virtual {p2, v0}, La/mbk0;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    return-object p2
.end method

.method public h()Ljava/util/List;
    .locals 12

    .line 1
    sget-object v0, La/tuc;->e:La/g950;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    sget-object v2, La/gmk0;->x0:La/gne0;

    .line 5
    .line 6
    iget-object p0, p0, La/o7v;->b:La/h1;

    .line 7
    .line 8
    invoke-static {p0, v0, v1, v2}, La/fyj0;->z1(La/vjj;La/g950;ILa/gmk0;)La/fyj0;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    invoke-virtual {p0}, La/h1;->f0()La/c8z;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    sget-object v6, La/iun;->a:La/iun;

    .line 17
    .line 18
    invoke-static {p0}, La/rek;->i(La/vjj;)La/ym40;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {p0}, La/ym40;->c()La/ary;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, La/ary;->e()La/kzj0;

    .line 27
    .line 28
    .line 29
    move-result-object v9

    .line 30
    sget-object v10, La/gm40;->d:La/gm40;

    .line 31
    .line 32
    sget-object v11, La/uek;->c:La/tek;

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    move-object v7, v6

    .line 36
    move-object v8, v6

    .line 37
    invoke-virtual/range {v3 .. v11}, La/fyj0;->B1(La/c8z;La/c8z;Ljava/util/List;Ljava/util/List;Ljava/util/List;La/wsy;La/gm40;La/tek;)La/fyj0;

    .line 38
    .line 39
    .line 40
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method
