.class public final La/uq30;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final b:La/xq30;

.field public final c:La/z3;

.field public final d:I


# direct methods
.method public synthetic constructor <init>(La/xq30;La/z3;IB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/uq30;->a:B

    iput-object p1, p0, La/uq30;->b:La/xq30;

    iput-object p2, p0, La/uq30;->c:La/z3;

    iput p3, p0, La/uq30;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/uq30;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget v2, p0, La/uq30;->d:I

    .line 5
    .line 6
    iget-object v3, p0, La/uq30;->c:La/z3;

    .line 7
    .line 8
    iget-object p0, p0, La/uq30;->b:La/xq30;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, La/xq30;->a:La/g45;

    .line 14
    .line 15
    iget-object v4, v0, La/g45;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v4, La/vjj;

    .line 18
    .line 19
    invoke-virtual {p0, v4}, La/xq30;->a(La/vjj;)La/v0;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    iget-object v0, v0, La/g45;->a:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, La/f6i;

    .line 28
    .line 29
    iget-object v0, v0, La/f6i;->g:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, La/m83;

    .line 32
    .line 33
    invoke-interface {v0, p0, v3, v2}, La/w83;->d(La/v0;La/z3;I)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    :cond_0
    if-nez v1, :cond_1

    .line 38
    .line 39
    sget-object v1, La/iun;->a:La/iun;

    .line 40
    .line 41
    :cond_1
    return-object v1

    .line 42
    :pswitch_0
    iget-object v0, p0, La/xq30;->a:La/g45;

    .line 43
    .line 44
    iget-object v4, v0, La/g45;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v4, La/vjj;

    .line 47
    .line 48
    invoke-virtual {p0, v4}, La/xq30;->a(La/vjj;)La/v0;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    if-eqz p0, :cond_2

    .line 53
    .line 54
    iget-object v0, v0, La/g45;->a:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, La/f6i;

    .line 57
    .line 58
    iget-object v0, v0, La/f6i;->g:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, La/m83;

    .line 61
    .line 62
    invoke-interface {v0, p0, v3, v2}, La/w83;->l(La/v0;La/z3;I)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    :cond_2
    if-nez v1, :cond_3

    .line 71
    .line 72
    sget-object v1, La/iun;->a:La/iun;

    .line 73
    .line 74
    :cond_3
    return-object v1

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
