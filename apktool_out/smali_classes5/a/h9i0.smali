.class public final synthetic La/h9i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/m9i0;


# direct methods
.method public synthetic constructor <init>(La/m9i0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/h9i0;->a:B

    iput-object p1, p0, La/h9i0;->b:La/m9i0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/h9i0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/h9i0;->b:La/m9i0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/m9i0;->S1:La/eke0;

    .line 10
    .line 11
    invoke-virtual {p0}, La/m9i0;->G0()La/b1r;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v0, v0, La/b1r;->c:La/cxx;

    .line 16
    .line 17
    invoke-virtual {p0}, La/m9i0;->G0()La/b1r;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v1, v1, La/b1r;->j:La/cxx;

    .line 22
    .line 23
    invoke-virtual {p0}, La/m9i0;->G0()La/b1r;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iget-object v2, v2, La/b1r;->d:La/cxx;

    .line 28
    .line 29
    invoke-virtual {p0}, La/m9i0;->G0()La/b1r;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    iget-object p0, p0, La/b1r;->h:La/cxx;

    .line 34
    .line 35
    filled-new-array {v0, v1, v2, p0}, [La/cxx;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :pswitch_0
    new-instance v0, La/q0h0;

    .line 45
    .line 46
    iget-object p0, p0, La/m9i0;->M1:La/iti;

    .line 47
    .line 48
    if-eqz p0, :cond_0

    .line 49
    .line 50
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 51
    .line 52
    .line 53
    return-object v0

    .line 54
    :cond_0
    const-string p0, "viewModelFactory"

    .line 55
    .line 56
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw v1

    .line 60
    :pswitch_1
    sget-object v0, La/m9i0;->S1:La/eke0;

    .line 61
    .line 62
    invoke-virtual {p0}, La/m9i0;->H0()La/jai0;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    iget-object v0, p0, La/jai0;->h:La/p7m0;

    .line 67
    .line 68
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    move-object v3, v2

    .line 73
    check-cast v3, Ljava/lang/Boolean;

    .line 74
    .line 75
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 79
    .line 80
    invoke-virtual {v0, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-eqz v2, :cond_1

    .line 85
    .line 86
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    new-instance v4, La/dai0;

    .line 91
    .line 92
    const/4 v0, 0x0

    .line 93
    invoke-direct {v4, p0, v0}, La/dai0;-><init>(La/jai0;B)V

    .line 94
    .line 95
    .line 96
    new-instance v5, La/eai0;

    .line 97
    .line 98
    invoke-direct {v5, p0, v0}, La/eai0;-><init>(La/jai0;B)V

    .line 99
    .line 100
    .line 101
    new-instance v7, La/z8b0;

    .line 102
    .line 103
    const/16 v0, 0xe

    .line 104
    .line 105
    invoke-direct {v7, p0, v1, v0}, La/z8b0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 106
    .line 107
    .line 108
    const/16 v8, 0xc

    .line 109
    .line 110
    const/4 v6, 0x0

    .line 111
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 112
    .line 113
    .line 114
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    return-object p0

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
