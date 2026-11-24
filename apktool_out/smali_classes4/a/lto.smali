.class public final La/lto;
.super La/c2;
.source "SourceFile"


# instance fields
.field public final synthetic c:La/qv5;

.field public final synthetic d:Ljava/util/List;


# direct methods
.method public constructor <init>(La/qv5;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/lto;->c:La/qv5;

    .line 2
    .line 3
    iput-object p2, p0, La/lto;->d:Ljava/util/List;

    .line 4
    .line 5
    const/16 p1, 0x8

    .line 6
    .line 7
    invoke-direct {p0, p1}, La/c2;-><init>(B)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final q(I)I
    .locals 1

    .line 1
    iget-object v0, p0, La/lto;->c:La/qv5;

    .line 2
    .line 3
    invoke-virtual {v0}, La/zz3;->z()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, La/p6t0;

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    sget-object v0, La/sre0;->a:La/tre0;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iget-object p0, p0, La/lto;->d:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {p0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    const/4 p0, 0x1

    .line 37
    return p0

    .line 38
    :cond_0
    const/4 p0, 0x2

    .line 39
    return p0
.end method
