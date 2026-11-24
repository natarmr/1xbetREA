.class public final La/s9z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pg80;


# instance fields
.field public final a:La/f7u;

.field public final b:La/zt00;


# direct methods
.method public constructor <init>(La/v7i;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/f7u;

    .line 5
    .line 6
    sget-object v1, La/jdk0;->f:La/jdk0;

    .line 7
    .line 8
    new-instance v2, La/obx;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-direct {v2, v3}, La/obx;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, p1, v1, v2}, La/f7u;-><init>(La/v7i;La/mzs0;La/a8z;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, La/s9z;->a:La/f7u;

    .line 18
    .line 19
    iget-object p1, p1, La/v7i;->i:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, La/eu00;

    .line 22
    .line 23
    new-instance v0, La/zt00;

    .line 24
    .line 25
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 26
    .line 27
    const/high16 v2, 0x3f800000    # 1.0f

    .line 28
    .line 29
    const/4 v3, 0x2

    .line 30
    const/4 v4, 0x3

    .line 31
    invoke-direct {v1, v4, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    .line 32
    .line 33
    .line 34
    new-instance v2, La/pnk0;

    .line 35
    .line 36
    const/16 v3, 0x13

    .line 37
    .line 38
    invoke-direct {v2, v3}, La/pnk0;-><init>(B)V

    .line 39
    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-direct {v0, p1, v1, v2, v3}, La/zt00;-><init>(La/eu00;Ljava/util/concurrent/ConcurrentHashMap;Lkotlin/jvm/functions/Function1;B)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, La/s9z;->b:La/zt00;

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final a(La/swq;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, La/s9z;->c(La/swq;)La/r9z;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-interface {p2, p0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final b(La/swq;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    return p0
.end method

.method public final c(La/swq;)La/r9z;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/wqe0;

    .line 5
    .line 6
    invoke-direct {v0, p1}, La/wqe0;-><init>(La/swq;)V

    .line 7
    .line 8
    .line 9
    new-instance v1, La/nsr;

    .line 10
    .line 11
    const/16 v2, 0x16

    .line 12
    .line 13
    invoke-direct {v1, p0, v0, v2}, La/nsr;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    new-instance v0, La/au00;

    .line 17
    .line 18
    invoke-direct {v0, p1, v1}, La/au00;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)V

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, La/s9z;->b:La/zt00;

    .line 22
    .line 23
    invoke-virtual {p0, v0}, La/xg;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    check-cast p0, La/r9z;

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_0
    const/4 p0, 0x3

    .line 33
    invoke-static {p0}, La/zt00;->a(I)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    throw p0
.end method

.method public final n(La/swq;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, La/s9z;->c(La/swq;)La/r9z;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/r9z;->l:La/xt00;

    .line 9
    .line 10
    invoke-virtual {p0}, La/cu00;->invoke()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Ljava/util/List;

    .line 15
    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    sget-object p0, La/iun;->a:La/iun;

    .line 19
    .line 20
    :cond_0
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "LazyJavaPackageFragmentProvider of module "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/s9z;->a:La/f7u;

    .line 9
    .line 10
    iget-object p0, p0, La/f7u;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, La/v7i;

    .line 13
    .line 14
    iget-object p0, p0, La/v7i;->j:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, La/zm40;

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method
