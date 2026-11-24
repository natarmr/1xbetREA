.class public final synthetic La/o9i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/t9i0;


# direct methods
.method public synthetic constructor <init>(La/t9i0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/o9i0;->a:B

    iput-object p1, p0, La/o9i0;->b:La/t9i0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/o9i0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/o9i0;->b:La/t9i0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/t9i0;->Q1:[La/iiy;

    .line 10
    .line 11
    invoke-virtual {p0}, La/t9i0;->G0()La/b1r;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v0, v0, La/b1r;->c:La/cxx;

    .line 16
    .line 17
    invoke-virtual {p0}, La/t9i0;->G0()La/b1r;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v1, v1, La/b1r;->d:La/cxx;

    .line 22
    .line 23
    invoke-virtual {p0}, La/t9i0;->G0()La/b1r;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iget-object v2, v2, La/b1r;->h:La/cxx;

    .line 28
    .line 29
    invoke-virtual {p0}, La/t9i0;->G0()La/b1r;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    iget-object v3, v3, La/b1r;->g:La/cxx;

    .line 34
    .line 35
    invoke-virtual {p0}, La/t9i0;->G0()La/b1r;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    iget-object p0, p0, La/b1r;->e:La/cxx;

    .line 40
    .line 41
    filled-new-array {v0, v1, v2, v3, p0}, [La/cxx;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :pswitch_0
    new-instance v0, La/q0h0;

    .line 51
    .line 52
    iget-object p0, p0, La/t9i0;->K1:La/kti;

    .line 53
    .line 54
    if-eqz p0, :cond_0

    .line 55
    .line 56
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 57
    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_0
    const-string p0, "viewModelFactory"

    .line 61
    .line 62
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw v1

    .line 66
    :pswitch_1
    sget-object v0, La/t9i0;->Q1:[La/iiy;

    .line 67
    .line 68
    invoke-virtual {p0}, La/t9i0;->H0()La/cai0;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    iget-object v0, p0, La/cai0;->g:La/p7m0;

    .line 73
    .line 74
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    move-object v3, v2

    .line 79
    check-cast v3, Ljava/lang/Boolean;

    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 85
    .line 86
    invoke-virtual {v0, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-eqz v2, :cond_1

    .line 91
    .line 92
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    new-instance v4, La/gwg0;

    .line 97
    .line 98
    const/16 v0, 0x1d

    .line 99
    .line 100
    invoke-direct {v4, p0, v0}, La/gwg0;-><init>(Ljava/lang/Object;B)V

    .line 101
    .line 102
    .line 103
    new-instance v5, La/a7g0;

    .line 104
    .line 105
    const/16 v0, 0x1b

    .line 106
    .line 107
    invoke-direct {v5, p0, v0}, La/a7g0;-><init>(Ljava/lang/Object;B)V

    .line 108
    .line 109
    .line 110
    new-instance v7, La/z8b0;

    .line 111
    .line 112
    const/16 v0, 0xd

    .line 113
    .line 114
    invoke-direct {v7, p0, v1, v0}, La/z8b0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 115
    .line 116
    .line 117
    const/16 v8, 0xc

    .line 118
    .line 119
    const/4 v6, 0x0

    .line 120
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 121
    .line 122
    .line 123
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    return-object p0

    .line 126
    nop

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
