.class public final La/jvv0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/p7m0;

.field public b:La/gsv0;

.field public final c:La/gmq;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/gvv0;

    .line 5
    .line 6
    sget-object v1, La/lun;->a:La/lun;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v0, v1, v1, v2}, La/gvv0;-><init>(Ljava/util/Map;Ljava/util/Map;La/kvv0;)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, La/jvv0;->a:La/p7m0;

    .line 20
    .line 21
    new-instance v1, La/h2c;

    .line 22
    .line 23
    const/16 v2, 0x1a

    .line 24
    .line 25
    invoke-direct {v1, v0, v2}, La/h2c;-><init>(La/p7m0;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {v1}, La/i120;->W(La/gmq;)La/gmq;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iput-object v0, p0, La/jvv0;->c:La/gmq;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a(La/lwv0;Landroidx/fragment/app/Fragment;)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, La/ltt0;->v(Landroidx/fragment/app/Fragment;)La/kvv0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "XBottomSheetOwnerHolder.dropOwner"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, La/diu0;->u(Ljava/lang/String;)Ljava/lang/AutoCloseable;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    new-instance v2, La/gg60;

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    invoke-direct {v2, p0, v0, v3}, La/gg60;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1, v2}, La/diu0;->s(Ljava/lang/String;Ljava/lang/AutoCloseable;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    new-instance v1, La/fvv0;

    .line 26
    .line 27
    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->g()La/piu0;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-direct {v1, p2, v2}, La/fvv0;-><init>(Landroidx/fragment/app/Fragment;La/piu0;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    iget-object p2, p0, La/jvv0;->a:La/p7m0;

    .line 35
    .line 36
    invoke-virtual {p2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    move-object v3, v2

    .line 41
    check-cast v3, La/gvv0;

    .line 42
    .line 43
    iget-object v4, v3, La/gvv0;->a:Ljava/util/Map;

    .line 44
    .line 45
    new-instance v5, Lkotlin/Pair;

    .line 46
    .line 47
    invoke-direct {v5, p1, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v4, v5}, La/xp20;->k(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    iget-object v3, v3, La/gvv0;->b:Ljava/util/Map;

    .line 55
    .line 56
    new-instance v5, Lkotlin/Pair;

    .line 57
    .line 58
    invoke-direct {v5, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-static {v3, v5}, La/xp20;->k(Ljava/util/Map;Lkotlin/Pair;)Ljava/util/Map;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    new-instance v5, La/gvv0;

    .line 72
    .line 73
    invoke-direct {v5, v4, v3, v0}, La/gvv0;-><init>(Ljava/util/Map;Ljava/util/Map;La/kvv0;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p2, v2, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    if-eqz p2, :cond_1

    .line 81
    .line 82
    return-void
.end method
