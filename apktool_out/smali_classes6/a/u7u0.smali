.class public final synthetic La/u7u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/w7u0;


# direct methods
.method public synthetic constructor <init>(La/w7u0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/u7u0;->a:B

    iput-object p1, p0, La/u7u0;->b:La/w7u0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/u7u0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/u7u0;->b:La/w7u0;

    .line 4
    .line 5
    check-cast p1, Landroid/view/View;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/w7u0;->e2:La/svs0;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, La/yo8;->x0()V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_0
    sget-object v0, La/w7u0;->e2:La/svs0;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, La/w7u0;->d2:La/kiu0;

    .line 27
    .line 28
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, La/z7u0;

    .line 33
    .line 34
    iget-object p1, p0, La/z7u0;->b:La/i1w0;

    .line 35
    .line 36
    invoke-static {p1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v1, La/c8d;

    .line 41
    .line 42
    sget-object v2, La/y7d;->a:La/v7d;

    .line 43
    .line 44
    sget-object v3, La/p0w0;->a:La/p0w0;

    .line 45
    .line 46
    invoke-direct {v1, v2, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 47
    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    invoke-static {v0, v1, p1, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    :goto_0
    move-object v1, v0

    .line 55
    check-cast v1, La/paw;

    .line 56
    .line 57
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_0

    .line 62
    .line 63
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, La/oe50;

    .line 68
    .line 69
    invoke-virtual {p1, v1}, La/i1w0;->a(La/oe50;)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    new-instance v0, La/k0w0;

    .line 74
    .line 75
    invoke-direct {v0, p1}, La/k0w0;-><init>(La/i1w0;)V

    .line 76
    .line 77
    .line 78
    new-instance v1, Lorg/xplatform/verification/status/impl/navigation/VerificationStatusScreens$AdditionalVerificationStatusFragmentScreen;

    .line 79
    .line 80
    sget-object v3, La/mbu0;->b:La/svs0;

    .line 81
    .line 82
    iget-object p0, p0, La/z7u0;->c:La/r9u;

    .line 83
    .line 84
    invoke-direct {v1, v2, p0}, Lorg/xplatform/verification/status/impl/navigation/VerificationStatusScreens$AdditionalVerificationStatusFragmentScreen;-><init>(ILa/r9u;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v1}, La/k0w0;->m(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;)La/ikt0;

    .line 88
    .line 89
    .line 90
    iget-object p0, v0, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 91
    .line 92
    invoke-static {p1, p0, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    :goto_1
    move-object v0, p0

    .line 97
    check-cast v0, La/paw;

    .line 98
    .line 99
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_1

    .line 104
    .line 105
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, La/oe50;

    .line 110
    .line 111
    invoke-virtual {p1, v0}, La/i1w0;->a(La/oe50;)V

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    return-object p0

    .line 118
    nop

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
