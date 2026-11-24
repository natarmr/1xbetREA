.class public final synthetic La/bi80;
.super La/xo;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic h:B


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/bi80;->h:B

    invoke-direct/range {p0 .. p6}, La/xo;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/bi80;->h:B

    .line 2
    .line 3
    iget-object p0, p0, La/xo;->a:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/pv40;

    .line 9
    .line 10
    iget-object v0, p0, La/pv40;->a:Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    iget-object v1, p0, La/pv40;->a:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    iget-object p0, p0, La/pv40;->d:La/pz40;

    .line 15
    .line 16
    move-object v2, p0

    .line 17
    check-cast v2, La/hgk0;

    .line 18
    .line 19
    invoke-virtual {v2}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v0, v2}, La/xp20;->d(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, La/u950;

    .line 28
    .line 29
    iget-object v0, v0, La/u950;->a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->size()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const/4 v2, 0x1

    .line 36
    if-le v0, v2, :cond_0

    .line 37
    .line 38
    move-object v0, p0

    .line 39
    check-cast v0, La/hgk0;

    .line 40
    .line 41
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v1, v0}, La/xp20;->d(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, La/u950;

    .line 50
    .line 51
    check-cast p0, La/hgk0;

    .line 52
    .line 53
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-static {v1, p0}, La/xp20;->d(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, La/u950;

    .line 62
    .line 63
    invoke-static {p0}, La/q3d;->i(Ljava/util/List;)I

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    invoke-virtual {v0, p0}, La/u950;->remove(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_0
    check-cast p0, La/di80;

    .line 74
    .line 75
    invoke-static {p0}, La/di80;->b(La/di80;)V

    .line 76
    .line 77
    .line 78
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_1
    check-cast p0, La/di80;

    .line 82
    .line 83
    invoke-static {p0}, La/di80;->b(La/di80;)V

    .line 84
    .line 85
    .line 86
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 87
    .line 88
    return-object p0

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
