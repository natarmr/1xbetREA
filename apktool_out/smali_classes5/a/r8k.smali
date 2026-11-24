.class public final synthetic La/r8k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/u8k;


# direct methods
.method public synthetic constructor <init>(La/u8k;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/r8k;->a:B

    iput-object p1, p0, La/r8k;->b:La/u8k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/r8k;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/r8k;->b:La/u8k;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/u8k;->Q1:La/kwd;

    .line 10
    .line 11
    iget-object v0, p0, La/u8k;->N1:La/kiu0;

    .line 12
    .line 13
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, La/pak;

    .line 18
    .line 19
    invoke-virtual {p0}, La/u8k;->G0()La/z0r;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-object v2, v2, La/z0r;->c:Landroidx/appcompat/widget/AppCompatEditText;

    .line 24
    .line 25
    invoke-virtual {v2}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-static {v2}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 v2, -0x1

    .line 45
    :goto_0
    iget-object v3, p0, La/u8k;->P1:La/khf0;

    .line 46
    .line 47
    sget-object v4, La/u8k;->R1:[La/iiy;

    .line 48
    .line 49
    const/4 v5, 0x1

    .line 50
    aget-object v4, v4, v5

    .line 51
    .line 52
    invoke-virtual {v3, p0, v4}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, Lorg/xplatform/responsible_game/impl/presentation/limits/deposit_limit/gambling_exam/models/DepositLimitScreenParams;

    .line 57
    .line 58
    iget v3, p0, Lorg/xplatform/responsible_game/impl/presentation/limits/deposit_limit/gambling_exam/models/DepositLimitScreenParams;->a:I

    .line 59
    .line 60
    iget-object v4, v0, La/pak;->f:La/p7m0;

    .line 61
    .line 62
    :cond_1
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    move-object v5, p0

    .line 67
    check-cast v5, Ljava/lang/Boolean;

    .line 68
    .line 69
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-virtual {v4, p0, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-eqz p0, :cond_1

    .line 79
    .line 80
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    new-instance v6, La/e3j;

    .line 85
    .line 86
    const/16 p0, 0xd

    .line 87
    .line 88
    invoke-direct {v6, v0, p0}, La/e3j;-><init>(Ljava/lang/Object;B)V

    .line 89
    .line 90
    .line 91
    new-instance v7, La/ucj;

    .line 92
    .line 93
    const/16 p0, 0xa

    .line 94
    .line 95
    invoke-direct {v7, v0, p0}, La/ucj;-><init>(Ljava/lang/Object;B)V

    .line 96
    .line 97
    .line 98
    new-instance v9, La/oak;

    .line 99
    .line 100
    invoke-direct {v9, v0, v2, v3, v1}, La/oak;-><init>(La/pak;IILa/yje;)V

    .line 101
    .line 102
    .line 103
    const/16 v10, 0xc

    .line 104
    .line 105
    const/4 v8, 0x0

    .line 106
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 107
    .line 108
    .line 109
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    return-object p0

    .line 112
    :pswitch_0
    sget-object v0, La/u8k;->Q1:La/kwd;

    .line 113
    .line 114
    new-instance v0, La/ry3;

    .line 115
    .line 116
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    iget-object p0, p0, La/u8k;->K1:La/gfi;

    .line 121
    .line 122
    if-eqz p0, :cond_2

    .line 123
    .line 124
    invoke-direct {v0, v2, p0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 125
    .line 126
    .line 127
    return-object v0

    .line 128
    :cond_2
    const-string p0, "viewModelFactory"

    .line 129
    .line 130
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw v1

    .line 134
    nop

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
