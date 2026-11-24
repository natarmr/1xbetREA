.class public final La/v950;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jiy;


# instance fields
.field public final synthetic a:B

.field public final b:La/zqv0;

.field public final c:La/jiy;


# direct methods
.method public constructor <init>(La/jiy;B)V
    .locals 1

    .line 1
    iput-byte p2, p0, La/v950;->a:B

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p2, La/v950;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-direct {p2, p1, v0}, La/v950;-><init>(La/jiy;B)V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, La/v950;->c:La/jiy;

    .line 16
    .line 17
    const-string p1, "androidx.navigation3.runtime.NavBackStack"

    .line 18
    .line 19
    iget-object p2, p2, La/v950;->b:La/zqv0;

    .line 20
    .line 21
    invoke-static {p1, p2}, La/x2x;->o(Ljava/lang/String;La/ugi0;)La/zqv0;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, La/v950;->b:La/zqv0;

    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    new-instance p2, La/zw3;

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    invoke-direct {p2, p1, v0}, La/zw3;-><init>(La/jiy;B)V

    .line 38
    .line 39
    .line 40
    iput-object p2, p0, La/v950;->c:La/jiy;

    .line 41
    .line 42
    iget-object p1, p2, La/zw3;->c:La/ud00;

    .line 43
    .line 44
    check-cast p1, La/uw3;

    .line 45
    .line 46
    const-string p2, "androidx.compose.runtime.SnapshotStateList"

    .line 47
    .line 48
    invoke-static {p2, p1}, La/x2x;->o(Ljava/lang/String;La/ugi0;)La/zqv0;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, La/v950;->b:La/zqv0;

    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/v950;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/v950;->c:La/jiy;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/zw3;

    .line 9
    .line 10
    invoke-interface {p1, p0}, La/rkj;->w(La/jiy;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Ljava/util/List;

    .line 15
    .line 16
    new-instance p1, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 17
    .line 18
    invoke-direct {p1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p1, p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->addAll(Ljava/util/Collection;)Z

    .line 26
    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_0
    new-instance v0, La/u950;

    .line 30
    .line 31
    check-cast p0, La/v950;

    .line 32
    .line 33
    invoke-interface {p1, p0}, La/rkj;->w(La/jiy;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    check-cast p0, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 38
    .line 39
    invoke-direct {v0, p0}, La/u950;-><init>(Landroidx/compose/runtime/snapshots/SnapshotStateList;)V

    .line 40
    .line 41
    .line 42
    return-object v0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getDescriptor()La/ugi0;
    .locals 1

    .line 1
    iget-byte v0, p0, La/v950;->a:B

    iget-object p0, p0, La/v950;->b:La/zqv0;

    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-byte v0, p0, La/v950;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/v950;->c:La/jiy;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p2, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    check-cast p0, La/zw3;

    .line 14
    .line 15
    invoke-interface {p1, p0, p2}, La/bwn;->C(La/jiy;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    check-cast p2, La/u950;

    .line 20
    .line 21
    check-cast p0, La/v950;

    .line 22
    .line 23
    iget-object p2, p2, La/u950;->a:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 24
    .line 25
    invoke-interface {p1, p0, p2}, La/bwn;->C(La/jiy;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
