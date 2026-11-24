.class public final synthetic La/rik0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/tik0;


# direct methods
.method public synthetic constructor <init>(La/tik0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rik0;->a:B

    iput-object p1, p0, La/rik0;->b:La/tik0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/rik0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/rik0;->b:La/tik0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/tik0;->Q1:[La/iiy;

    .line 9
    .line 10
    invoke-virtual {p0}, La/tik0;->I0()La/cjk0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    iget-object p0, p0, La/cjk0;->g:La/i1w0;

    .line 15
    .line 16
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, La/c8d;

    .line 21
    .line 22
    sget-object v2, La/y7d;->a:La/v7d;

    .line 23
    .line 24
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 25
    .line 26
    invoke-direct {v1, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 27
    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-static {v0, v1, p0, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :goto_0
    move-object v1, v0

    .line 35
    check-cast v1, La/paw;

    .line 36
    .line 37
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_0

    .line 42
    .line 43
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, La/oe50;

    .line 48
    .line 49
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_0
    iget-object p0, p0, La/tik0;->L1:La/fiu0;

    .line 57
    .line 58
    if-eqz p0, :cond_1

    .line 59
    .line 60
    return-object p0

    .line 61
    :cond_1
    const-string p0, "viewModelFactory"

    .line 62
    .line 63
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const/4 p0, 0x0

    .line 67
    throw p0

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
