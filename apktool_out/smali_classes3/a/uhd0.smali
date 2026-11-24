.class public final synthetic La/uhd0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xhd0;


# direct methods
.method public synthetic constructor <init>(La/xhd0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/uhd0;->a:B

    iput-object p1, p0, La/uhd0;->b:La/xhd0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/uhd0;->a:B

    .line 2
    .line 3
    sget-object v1, La/did0;->a:La/did0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, La/uhd0;->b:La/xhd0;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object p0, La/xhd0;->S1:La/fl70;

    .line 12
    .line 13
    invoke-virtual {v3}, La/xhd0;->H0()La/jid0;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, La/jid0;->w()V

    .line 18
    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_0
    sget-object p0, La/xhd0;->S1:La/fl70;

    .line 24
    .line 25
    new-instance p0, La/ry3;

    .line 26
    .line 27
    invoke-static {v3}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v1, v3, La/xhd0;->K1:La/pqi;

    .line 32
    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    invoke-direct {p0, v0, v1}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 36
    .line 37
    .line 38
    return-object p0

    .line 39
    :cond_0
    const-string p0, "viewModelFactory"

    .line 40
    .line 41
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v2

    .line 45
    :pswitch_1
    sget-object p0, La/xhd0;->S1:La/fl70;

    .line 46
    .line 47
    invoke-virtual {v3}, La/xhd0;->H0()La/jid0;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p0}, La/jid0;->w()V

    .line 52
    .line 53
    .line 54
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_2
    sget-object p0, La/xhd0;->S1:La/fl70;

    .line 58
    .line 59
    invoke-virtual {v3}, La/xhd0;->H0()La/jid0;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p0}, La/jid0;->w()V

    .line 64
    .line 65
    .line 66
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_3
    iget-object p0, p0, La/uhd0;->b:La/xhd0;

    .line 70
    .line 71
    iget-object v0, p0, La/xhd0;->M1:La/wdk0;

    .line 72
    .line 73
    if-eqz v0, :cond_1

    .line 74
    .line 75
    new-instance v1, La/xdk0;

    .line 76
    .line 77
    sget-object v4, La/rek0;->b:La/rek0;

    .line 78
    .line 79
    const v2, 0x7f130dca

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    const/4 v9, 0x0

    .line 90
    const/16 v10, 0x7c

    .line 91
    .line 92
    const/4 v6, 0x0

    .line 93
    const/4 v7, 0x0

    .line 94
    const/4 v8, 0x0

    .line 95
    move-object v3, v1

    .line 96
    invoke-direct/range {v3 .. v10}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 97
    .line 98
    .line 99
    const/16 v7, 0x3fc

    .line 100
    .line 101
    const/4 v3, 0x0

    .line 102
    const/4 v4, 0x0

    .line 103
    const/4 v5, 0x0

    .line 104
    move-object v2, p0

    .line 105
    invoke-static/range {v0 .. v7}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 106
    .line 107
    .line 108
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 109
    .line 110
    return-object p0

    .line 111
    :cond_1
    const-string p0, "snackbarManager"

    .line 112
    .line 113
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v2

    .line 117
    :pswitch_4
    sget-object p0, La/xhd0;->S1:La/fl70;

    .line 118
    .line 119
    invoke-virtual {v3}, La/xhd0;->H0()La/jid0;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-virtual {p0}, La/jid0;->x()V

    .line 124
    .line 125
    .line 126
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    return-object p0

    .line 129
    :pswitch_5
    sget-object p0, La/xhd0;->S1:La/fl70;

    .line 130
    .line 131
    invoke-virtual {v3}, La/xhd0;->H0()La/jid0;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-virtual {p0, v1}, La/jid0;->y(La/hid0;)V

    .line 136
    .line 137
    .line 138
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 139
    .line 140
    return-object p0

    .line 141
    :pswitch_6
    sget-object p0, La/xhd0;->S1:La/fl70;

    .line 142
    .line 143
    invoke-virtual {v3}, La/xhd0;->H0()La/jid0;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-virtual {p0, v1}, La/jid0;->y(La/hid0;)V

    .line 148
    .line 149
    .line 150
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 151
    .line 152
    return-object p0

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
