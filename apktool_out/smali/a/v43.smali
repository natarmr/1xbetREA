.class public final La/v43;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/v43;->a:B

    iput-object p1, p0, La/v43;->b:Ljava/lang/Object;

    iput-object p2, p0, La/v43;->c:Ljava/lang/Object;

    iput-object p3, p0, La/v43;->d:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/v43;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/v43;->d:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/v43;->c:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object p0, p0, La/v43;->b:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, La/ou90;

    .line 13
    .line 14
    check-cast p0, La/ot40;

    .line 15
    .line 16
    check-cast v2, Ljava/util/List;

    .line 17
    .line 18
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 19
    .line 20
    invoke-virtual {p0, p1, v2, v1}, La/bk30;->e(La/ou90;Ljava/util/List;Ljava/util/LinkedHashMap;)V

    .line 21
    .line 22
    .line 23
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, La/lwk;

    .line 27
    .line 28
    check-cast p0, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 29
    .line 30
    check-cast v1, La/i53;

    .line 31
    .line 32
    new-instance p1, La/u43;

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    invoke-direct {p1, p0, v2, v1, v0}, La/u43;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 36
    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
