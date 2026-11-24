.class public final La/owv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/i2h0;


# instance fields
.field public final a:La/nwv0;

.field public final b:Lkotlin/jvm/functions/Function1;

.field public final c:La/kvv0;

.field public final d:La/wzu0;


# direct methods
.method public constructor <init>(La/nwv0;Lkotlin/jvm/functions/Function1;La/kvv0;La/wzu0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/owv0;->a:La/nwv0;

    .line 5
    .line 6
    iput-object p2, p0, La/owv0;->b:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    iput-object p3, p0, La/owv0;->c:La/kvv0;

    .line 9
    .line 10
    iput-object p4, p0, La/owv0;->d:La/wzu0;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(La/o470;Ljava/util/List;)La/y1h0;
    .locals 8

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    move-object v2, p1

    .line 9
    check-cast v2, La/ob50;

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, v2, La/ob50;->b:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v1, v2, La/ob50;->c:Ljava/util/Map;

    .line 18
    .line 19
    const-string v3, "XBottomSheetMetadataKey"

    .line 20
    .line 21
    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    move-object v1, p1

    .line 28
    :cond_1
    check-cast v1, La/lwv0;

    .line 29
    .line 30
    if-nez v1, :cond_2

    .line 31
    .line 32
    :goto_0
    return-object p1

    .line 33
    :cond_2
    iget-object p1, p0, La/owv0;->b:Lkotlin/jvm/functions/Function1;

    .line 34
    .line 35
    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    iget-object v3, p0, La/owv0;->c:La/kvv0;

    .line 40
    .line 41
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-nez p1, :cond_3

    .line 46
    .line 47
    new-instance p0, La/guv0;

    .line 48
    .line 49
    invoke-direct {p0, v0}, La/guv0;-><init>(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    iget-object v6, p0, La/owv0;->a:La/nwv0;

    .line 57
    .line 58
    iget-object p1, v6, La/nwv0;->a:Ljava/util/LinkedHashMap;

    .line 59
    .line 60
    invoke-virtual {p1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    check-cast v3, La/mwv0;

    .line 65
    .line 66
    if-eqz v3, :cond_4

    .line 67
    .line 68
    :goto_1
    move-object v5, v3

    .line 69
    goto :goto_2

    .line 70
    :cond_4
    new-instance v3, La/mwv0;

    .line 71
    .line 72
    invoke-direct {v3}, La/mwv0;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-interface {p1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    iget-object p1, v6, La/nwv0;->b:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 79
    .line 80
    invoke-virtual {p1, v3}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :goto_2
    new-instance v7, La/ugu0;

    .line 85
    .line 86
    const/16 p1, 0x9

    .line 87
    .line 88
    iget-object p0, p0, La/owv0;->d:La/wzu0;

    .line 89
    .line 90
    invoke-direct {v7, p0, v1, p1}, La/ugu0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 91
    .line 92
    .line 93
    const/4 p0, 0x1

    .line 94
    invoke-static {p0, p2}, Lkotlin/collections/CollectionsKt;->P(ILjava/util/List;)Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    new-instance v0, La/txv0;

    .line 99
    .line 100
    iget-object v1, v2, La/ob50;->b:Ljava/lang/Object;

    .line 101
    .line 102
    move-object v4, v3

    .line 103
    invoke-direct/range {v0 .. v7}, La/txv0;-><init>(Ljava/lang/Object;La/ob50;Ljava/util/List;Ljava/util/List;La/mwv0;La/nwv0;Lkotlin/jvm/functions/Function0;)V

    .line 104
    .line 105
    .line 106
    return-object v0
.end method
