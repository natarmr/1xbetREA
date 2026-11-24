.class public final synthetic La/aw10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/dw10;


# direct methods
.method public synthetic constructor <init>(La/dw10;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/aw10;->a:B

    iput-object p1, p0, La/aw10;->b:La/dw10;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 13

    .line 1
    iget-byte p1, p0, La/aw10;->a:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iget-object p0, p0, La/aw10;->b:La/dw10;

    .line 5
    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object p1, La/dw10;->V1:La/uuz;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 16
    .line 17
    new-instance v2, Lkotlin/Pair;

    .line 18
    .line 19
    const-string v3, "REG_CLICK_REQUEST_KEY"

    .line 20
    .line 21
    invoke-direct {v2, v3, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {p1, v1, v3}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, La/dw10;->I0()La/cx10;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    invoke-static {v6}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    iget-object p1, v6, La/cx10;->f:La/mne;

    .line 44
    .line 45
    iget-object p1, p1, La/mne;->c:La/vs10;

    .line 46
    .line 47
    new-instance v4, La/pf10;

    .line 48
    .line 49
    const/4 v10, 0x0

    .line 50
    const/16 v11, 0x1d

    .line 51
    .line 52
    const/4 v5, 0x1

    .line 53
    const-class v7, La/cx10;

    .line 54
    .line 55
    const-string v8, "handleError"

    .line 56
    .line 57
    const-string v9, "handleError(Ljava/lang/Throwable;)V"

    .line 58
    .line 59
    invoke-direct/range {v4 .. v11}, La/pf10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 60
    .line 61
    .line 62
    new-instance v9, La/rx00;

    .line 63
    .line 64
    const/16 v1, 0xe

    .line 65
    .line 66
    invoke-direct {v9, v6, v1}, La/rx00;-><init>(Ljava/lang/Object;B)V

    .line 67
    .line 68
    .line 69
    new-instance v11, La/xw10;

    .line 70
    .line 71
    const/4 v1, 0x3

    .line 72
    invoke-direct {v11, v6, v0, v1}, La/xw10;-><init>(La/cx10;La/yje;B)V

    .line 73
    .line 74
    .line 75
    const/16 v12, 0x8

    .line 76
    .line 77
    move-object v7, p0

    .line 78
    move-object v10, p1

    .line 79
    move-object v8, v4

    .line 80
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :pswitch_0
    sget-object p1, La/dw10;->V1:La/uuz;

    .line 85
    .line 86
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 91
    .line 92
    new-instance v2, Lkotlin/Pair;

    .line 93
    .line 94
    const-string v3, "LOGIN_CLICK_REQUEST_KEY"

    .line 95
    .line 96
    invoke-direct {v2, v3, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {p1, v1, v3}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, La/dw10;->I0()La/cx10;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    invoke-static {v6}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    iget-object p1, v6, La/cx10;->f:La/mne;

    .line 119
    .line 120
    iget-object p1, p1, La/mne;->c:La/vs10;

    .line 121
    .line 122
    new-instance v4, La/pf10;

    .line 123
    .line 124
    const/4 v10, 0x0

    .line 125
    const/16 v11, 0x1c

    .line 126
    .line 127
    const/4 v5, 0x1

    .line 128
    const-class v7, La/cx10;

    .line 129
    .line 130
    const-string v8, "handleError"

    .line 131
    .line 132
    const-string v9, "handleError(Ljava/lang/Throwable;)V"

    .line 133
    .line 134
    invoke-direct/range {v4 .. v11}, La/pf10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 135
    .line 136
    .line 137
    new-instance v11, La/xw10;

    .line 138
    .line 139
    const/4 v1, 0x2

    .line 140
    invoke-direct {v11, v6, v0, v1}, La/xw10;-><init>(La/cx10;La/yje;B)V

    .line 141
    .line 142
    .line 143
    const/16 v12, 0xa

    .line 144
    .line 145
    const/4 v9, 0x0

    .line 146
    move-object v7, p0

    .line 147
    move-object v10, p1

    .line 148
    move-object v8, v4

    .line 149
    invoke-static/range {v7 .. v12}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 150
    .line 151
    .line 152
    return-void

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
