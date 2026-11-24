.class public final synthetic La/qtc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/stc;


# direct methods
.method public synthetic constructor <init>(La/stc;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/qtc;->a:B

    iput-object p1, p0, La/qtc;->b:La/stc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/qtc;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/qtc;->b:La/stc;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/stc;->Q1:[La/iiy;

    .line 9
    .line 10
    iget-object p0, p0, La/stc;->O1:La/kiu0;

    .line 11
    .line 12
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, La/wtc;

    .line 17
    .line 18
    iget-object p0, p0, La/wtc;->c:La/i1w0;

    .line 19
    .line 20
    invoke-static {p0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, La/c8d;

    .line 25
    .line 26
    sget-object v2, La/y7d;->a:La/v7d;

    .line 27
    .line 28
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 29
    .line 30
    invoke-direct {v1, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 31
    .line 32
    .line 33
    const/4 v2, 0x0

    .line 34
    invoke-static {v0, v1, p0, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :goto_0
    move-object v1, v0

    .line 39
    check-cast v1, La/paw;

    .line 40
    .line 41
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, La/oe50;

    .line 52
    .line 53
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_0
    sget-object v0, La/stc;->Q1:[La/iiy;

    .line 61
    .line 62
    new-instance v0, La/k1q0;

    .line 63
    .line 64
    new-instance v1, La/enc;

    .line 65
    .line 66
    iget-object p0, p0, La/stc;->O1:La/kiu0;

    .line 67
    .line 68
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    move-object v3, p0

    .line 73
    check-cast v3, La/wtc;

    .line 74
    .line 75
    const/4 v7, 0x0

    .line 76
    const/16 v8, 0x9

    .line 77
    .line 78
    const/4 v2, 0x1

    .line 79
    const-class v4, La/wtc;

    .line 80
    .line 81
    const-string v5, "onItemClick"

    .line 82
    .line 83
    const-string v6, "onItemClick(Lorg/xplatform/feature/office/test_section/impl/presentation/models/TestSectionUiModel;)V"

    .line 84
    .line 85
    invoke-direct/range {v1 .. v8}, La/enc;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 86
    .line 87
    .line 88
    invoke-direct {v0, v1}, La/k1q0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 89
    .line 90
    .line 91
    return-object v0

    .line 92
    :pswitch_1
    iget-object p0, p0, La/stc;->L1:La/fiu0;

    .line 93
    .line 94
    if-eqz p0, :cond_1

    .line 95
    .line 96
    return-object p0

    .line 97
    :cond_1
    const-string p0, "viewModelFactory"

    .line 98
    .line 99
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    const/4 p0, 0x0

    .line 103
    throw p0

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
