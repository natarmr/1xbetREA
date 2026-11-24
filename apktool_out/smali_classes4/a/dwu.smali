.class public final La/dwu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ram0;


# direct methods
.method public constructor <init>(La/ram0;)V
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
    iput-object p1, p0, La/dwu;->a:La/ram0;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;La/dam0;)La/zj2;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/mie0;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, La/dwu;->a:La/ram0;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/ram0;->a:La/qam0;

    .line 15
    .line 16
    iget-object v1, p0, La/qam0;->c:Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    invoke-virtual {v1, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    sget-object v2, La/xun;->a:La/xun;

    .line 25
    .line 26
    invoke-static {v2}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {v1, p2, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    :cond_0
    check-cast v2, La/qz40;

    .line 34
    .line 35
    invoke-virtual {p0, p2}, La/qam0;->b(La/dam0;)Ljava/util/Set;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    move-object p2, v2

    .line 40
    check-cast p2, La/p7m0;

    .line 41
    .line 42
    invoke-virtual {p2, p0}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    new-instance p0, La/zj2;

    .line 46
    .line 47
    const/16 p2, 0xd

    .line 48
    .line 49
    invoke-direct {p0, v2, p1, v0, p2}, La/zj2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 50
    .line 51
    .line 52
    return-object p0
.end method
