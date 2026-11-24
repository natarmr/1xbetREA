.class public final synthetic La/u10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/f20;


# direct methods
.method public synthetic constructor <init>(La/f20;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/u10;->a:B

    iput-object p1, p0, La/u10;->b:La/f20;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/u10;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/u10;->b:La/f20;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Throwable;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, La/f20;->D:La/ra10;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, La/f20;->y(La/ra10;)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_0
    check-cast p1, La/k0w0;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    sget-object v0, La/mbu0;->b:La/svs0;

    .line 27
    .line 28
    iget v1, p0, La/f20;->b:I

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-static {v1}, La/svs0;->a(I)La/mbu0;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const/4 v1, 0x1

    .line 42
    if-eq v0, v1, :cond_5

    .line 43
    .line 44
    const/4 v1, 0x3

    .line 45
    if-eq v0, v1, :cond_4

    .line 46
    .line 47
    const/4 v1, 0x4

    .line 48
    if-eq v0, v1, :cond_3

    .line 49
    .line 50
    const/4 v1, 0x5

    .line 51
    if-eq v0, v1, :cond_2

    .line 52
    .line 53
    const/4 v1, 0x6

    .line 54
    if-eq v0, v1, :cond_1

    .line 55
    .line 56
    const/4 v1, 0x7

    .line 57
    if-eq v0, v1, :cond_0

    .line 58
    .line 59
    iget-object p0, p0, La/f20;->i:La/r46;

    .line 60
    .line 61
    invoke-virtual {p0}, La/r46;->a()Lorg/xplatform/verification/base/impl/navigation/BaseVerificationScreens$BaseVerificationFragmentScreen;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    iget-object p0, p0, La/f20;->k:La/j9i;

    .line 67
    .line 68
    iget-object p0, p0, La/j9i;->a:La/bbw0;

    .line 69
    .line 70
    iget-object p0, p0, La/bbw0;->b:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p0, La/clc;

    .line 73
    .line 74
    invoke-virtual {p0}, La/clc;->d()La/r46;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p0}, La/r46;->a()Lorg/xplatform/verification/base/impl/navigation/BaseVerificationScreens$BaseVerificationFragmentScreen;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    goto :goto_0

    .line 83
    :cond_1
    iget-object p0, p0, La/f20;->j:La/ljf0;

    .line 84
    .line 85
    iget-object p0, p0, La/ljf0;->a:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p0, La/bbw0;

    .line 88
    .line 89
    iget-object p0, p0, La/bbw0;->b:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast p0, La/clc;

    .line 92
    .line 93
    invoke-virtual {p0}, La/clc;->d()La/r46;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-virtual {p0}, La/r46;->a()Lorg/xplatform/verification/base/impl/navigation/BaseVerificationScreens$BaseVerificationFragmentScreen;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    goto :goto_0

    .line 102
    :cond_2
    iget-object p0, p0, La/f20;->l:La/y2m0;

    .line 103
    .line 104
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    new-instance p0, Lorg/xplatform/verification/sum_sub/impl/navigation/SumSubScreens$SumSubIframeFragmentScreen;

    .line 108
    .line 109
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_3
    iget-object p0, p0, La/f20;->n:La/xb5;

    .line 114
    .line 115
    iget-object p0, p0, La/xb5;->a:La/bbw0;

    .line 116
    .line 117
    iget-object p0, p0, La/bbw0;->b:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast p0, La/clc;

    .line 120
    .line 121
    invoke-virtual {p0}, La/clc;->d()La/r46;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-virtual {p0}, La/r46;->a()Lorg/xplatform/verification/base/impl/navigation/BaseVerificationScreens$BaseVerificationFragmentScreen;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    goto :goto_0

    .line 130
    :cond_4
    iget-object p0, p0, La/f20;->m:La/xuz;

    .line 131
    .line 132
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    new-instance p0, Lorg/xplatform/verification/nomapay/impl/navigation/NomaPayWebScreens$NomaPayFragmentScreen;

    .line 136
    .line 137
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 138
    .line 139
    .line 140
    goto :goto_0

    .line 141
    :cond_5
    iget-object p0, p0, La/f20;->h:La/l9u0;

    .line 142
    .line 143
    sget-object v0, La/mbu0;->b:La/svs0;

    .line 144
    .line 145
    new-instance v0, Lorg/xplatform/verification/options/impl/navigation/VerificationOptionsScreens$VerificationOptionsFragmentScreen;

    .line 146
    .line 147
    const/4 v1, -0x1

    .line 148
    iget-object p0, p0, La/l9u0;->a:La/r9u;

    .line 149
    .line 150
    invoke-direct {v0, v1, p0}, Lorg/xplatform/verification/options/impl/navigation/VerificationOptionsScreens$VerificationOptionsFragmentScreen;-><init>(ILa/r9u;)V

    .line 151
    .line 152
    .line 153
    move-object p0, v0

    .line 154
    :goto_0
    invoke-virtual {p1, p0}, La/k0w0;->k(La/m7h0;)V

    .line 155
    .line 156
    .line 157
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 158
    .line 159
    return-object p0

    .line 160
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 161
    .line 162
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    iget-object p1, p0, La/f20;->D:La/ra10;

    .line 166
    .line 167
    invoke-virtual {p0, p1}, La/f20;->y(La/ra10;)V

    .line 168
    .line 169
    .line 170
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 171
    .line 172
    return-object p0

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
