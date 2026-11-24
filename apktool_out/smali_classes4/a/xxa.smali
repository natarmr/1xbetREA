.class public final synthetic La/xxa;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/aya;


# direct methods
.method public synthetic constructor <init>(La/aya;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xxa;->a:B

    iput-object p1, p0, La/xxa;->b:La/aya;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/xxa;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, La/xxa;->b:La/aya;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/aya;->S1:La/bj5;

    .line 11
    .line 12
    new-instance v0, La/lza;

    .line 13
    .line 14
    new-instance v3, La/vra;

    .line 15
    .line 16
    invoke-virtual {p0}, La/aya;->I0()La/yya;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    const/4 v9, 0x0

    .line 21
    const/16 v10, 0xa

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    const-class v6, La/yya;

    .line 25
    .line 26
    const-string v7, "onGameChecked"

    .line 27
    .line 28
    const-string v8, "onGameChecked(Lorg/xplatform/onexuser/domain/entity/onexgame/configs/OneXGamesTypeCommon;)V"

    .line 29
    .line 30
    invoke-direct/range {v3 .. v10}, La/vra;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 31
    .line 32
    .line 33
    invoke-direct {v0}, La/qv5;-><init>()V

    .line 34
    .line 35
    .line 36
    new-instance p0, La/cr60;

    .line 37
    .line 38
    const/4 v1, 0x7

    .line 39
    invoke-direct {p0, v1}, La/cr60;-><init>(B)V

    .line 40
    .line 41
    .line 42
    new-instance v1, La/cd60;

    .line 43
    .line 44
    const/16 v4, 0x8

    .line 45
    .line 46
    invoke-direct {v1, v3, v4}, La/cd60;-><init>(Ljava/lang/Object;B)V

    .line 47
    .line 48
    .line 49
    new-instance v3, La/iv60;

    .line 50
    .line 51
    const/4 v4, 0x3

    .line 52
    invoke-direct {v3, v4, v2}, La/iv60;-><init>(IB)V

    .line 53
    .line 54
    .line 55
    sget-object v2, La/xk60;->c:La/xk60;

    .line 56
    .line 57
    new-instance v4, La/gbn;

    .line 58
    .line 59
    invoke-direct {v4, p0, v3, v1, v2}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 60
    .line 61
    .line 62
    iget-object p0, v0, La/zz3;->d:La/dp;

    .line 63
    .line 64
    invoke-virtual {p0, v4}, La/dp;->b(La/gbn;)V

    .line 65
    .line 66
    .line 67
    sget-object p0, La/iun;->a:La/iun;

    .line 68
    .line 69
    iput-object p0, v0, La/lza;->f:Ljava/util/List;

    .line 70
    .line 71
    return-object v0

    .line 72
    :pswitch_0
    sget-object v0, La/aya;->S1:La/bj5;

    .line 73
    .line 74
    new-instance v0, La/ry3;

    .line 75
    .line 76
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    iget-object p0, p0, La/aya;->M1:La/sbi;

    .line 81
    .line 82
    if-eqz p0, :cond_0

    .line 83
    .line 84
    invoke-direct {v0, v2, p0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 85
    .line 86
    .line 87
    return-object v0

    .line 88
    :cond_0
    const-string p0, "cashBackChoosingViewModelFactory"

    .line 89
    .line 90
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw v1

    .line 94
    :pswitch_1
    sget-object v0, La/aya;->S1:La/bj5;

    .line 95
    .line 96
    invoke-virtual {p0}, La/aya;->I0()La/yya;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    iget-object v0, p0, La/yya;->n:Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 103
    .line 104
    .line 105
    iget-object v3, p0, La/yya;->u:La/p7m0;

    .line 106
    .line 107
    :cond_1
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    move-object v4, p0

    .line 112
    check-cast v4, La/wya;

    .line 113
    .line 114
    iget-object v5, v4, La/wya;->a:Ljava/util/List;

    .line 115
    .line 116
    new-instance v6, Ljava/util/ArrayList;

    .line 117
    .line 118
    const/16 v7, 0xa

    .line 119
    .line 120
    invoke-static {v5, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 121
    .line 122
    .line 123
    move-result v7

    .line 124
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 125
    .line 126
    .line 127
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    if-eqz v7, :cond_2

    .line 136
    .line 137
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    check-cast v7, La/i1b;

    .line 142
    .line 143
    const/4 v8, 0x1

    .line 144
    invoke-static {v7, v8, v2}, La/i1b;->c(La/i1b;ZZ)La/i1b;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    const/4 v7, 0x4

    .line 157
    invoke-static {v4, v6, v5, v1, v7}, La/wya;->a(La/wya;Ljava/util/ArrayList;ILjava/lang/String;I)La/wya;

    .line 158
    .line 159
    .line 160
    move-result-object v4

    .line 161
    invoke-virtual {v3, p0, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result p0

    .line 165
    if-eqz p0, :cond_1

    .line 166
    .line 167
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    return-object p0

    .line 170
    :pswitch_2
    sget-object v0, La/aya;->S1:La/bj5;

    .line 171
    .line 172
    invoke-virtual {p0}, La/aya;->I0()La/yya;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    invoke-virtual {p0}, La/yya;->x()V

    .line 177
    .line 178
    .line 179
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 180
    .line 181
    return-object p0

    .line 182
    nop

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
