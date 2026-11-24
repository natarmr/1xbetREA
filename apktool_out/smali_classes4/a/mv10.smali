.class public final synthetic La/mv10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qv10;


# direct methods
.method public synthetic constructor <init>(La/qv10;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/mv10;->a:B

    iput-object p1, p0, La/mv10;->b:La/qv10;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/mv10;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/mv10;->b:La/qv10;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/qv10;->M1:La/kiu0;

    .line 9
    .line 10
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/rv10;

    .line 15
    .line 16
    iget-object p0, p0, La/rv10;->b:La/i1w0;

    .line 17
    .line 18
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, La/c8d;

    .line 23
    .line 24
    sget-object v2, La/y7d;->a:La/v7d;

    .line 25
    .line 26
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 27
    .line 28
    invoke-direct {v1, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 29
    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-static {v0, v1, p0, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :goto_0
    move-object v1, v0

    .line 37
    check-cast v1, La/paw;

    .line 38
    .line 39
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, La/oe50;

    .line 50
    .line 51
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_0
    new-instance v0, La/t0h0;

    .line 59
    .line 60
    iget-object v1, p0, La/qv10;->L1:La/m9i;

    .line 61
    .line 62
    if-eqz v1, :cond_1

    .line 63
    .line 64
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-direct {v0, v1, p0}, La/t0h0;-><init>(La/j0h0;La/i1w0;)V

    .line 69
    .line 70
    .line 71
    return-object v0

    .line 72
    :cond_1
    const-string p0, "viewModelFactory"

    .line 73
    .line 74
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const/4 p0, 0x0

    .line 78
    throw p0

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
