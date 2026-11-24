.class public final synthetic La/ahv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/bhv;


# direct methods
.method public synthetic constructor <init>(La/bhv;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ahv;->a:B

    iput-object p1, p0, La/ahv;->b:La/bhv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/ahv;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/ahv;->b:La/bhv;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget v0, La/bhv;->k2:I

    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const v0, 0x7f0d031e

    .line 20
    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-virtual {p0, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const v0, 0x7f0a0050

    .line 28
    .line 29
    .line 30
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTwoButtons;

    .line 35
    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    const v0, 0x7f0a0c84

    .line 39
    .line 40
    .line 41
    invoke-static {p0, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Landroidx/recyclerview/widget/RecyclerView;

    .line 46
    .line 47
    if-eqz v3, :cond_0

    .line 48
    .line 49
    new-instance v1, La/chv;

    .line 50
    .line 51
    check-cast p0, Landroid/widget/LinearLayout;

    .line 52
    .line 53
    invoke-direct {v1, p0, v2, v3}, La/chv;-><init>(Landroid/widget/LinearLayout;Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTwoButtons;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    const-string v0, "Missing required view with ID: "

    .line 66
    .line 67
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    :goto_0
    return-object v1

    .line 75
    :pswitch_0
    sget v0, La/bhv;->k2:I

    .line 76
    .line 77
    new-instance v0, La/mw40;

    .line 78
    .line 79
    new-instance v1, La/vft;

    .line 80
    .line 81
    iget-object p0, p0, La/bhv;->h2:La/kiu0;

    .line 82
    .line 83
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    move-object v3, p0

    .line 88
    check-cast v3, La/ghv;

    .line 89
    .line 90
    const/4 v7, 0x0

    .line 91
    const/16 v8, 0x9

    .line 92
    .line 93
    const/4 v2, 0x1

    .line 94
    const-class v4, La/ghv;

    .line 95
    .line 96
    const-string v5, "onFilterSelected"

    .line 97
    .line 98
    const-string v6, "onFilterSelected(I)V"

    .line 99
    .line 100
    invoke-direct/range {v1 .. v8}, La/vft;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 101
    .line 102
    .line 103
    invoke-direct {v0}, La/i26;-><init>()V

    .line 104
    .line 105
    .line 106
    iget-object p0, v0, La/i26;->e:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast p0, La/dp;

    .line 109
    .line 110
    new-instance v2, La/s3t;

    .line 111
    .line 112
    const/16 v3, 0xa

    .line 113
    .line 114
    invoke-direct {v2, v3}, La/s3t;-><init>(B)V

    .line 115
    .line 116
    .line 117
    new-instance v3, La/t3t;

    .line 118
    .line 119
    const/16 v4, 0x12

    .line 120
    .line 121
    invoke-direct {v3, v1, v4}, La/t3t;-><init>(Ljava/lang/Object;B)V

    .line 122
    .line 123
    .line 124
    new-instance v1, La/atq;

    .line 125
    .line 126
    const/4 v4, 0x3

    .line 127
    const/16 v5, 0x1d

    .line 128
    .line 129
    invoke-direct {v1, v4, v5}, La/atq;-><init>(IB)V

    .line 130
    .line 131
    .line 132
    sget-object v4, La/fvr;->y:La/fvr;

    .line 133
    .line 134
    new-instance v5, La/gbn;

    .line 135
    .line 136
    invoke-direct {v5, v2, v1, v3, v4}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0, v5}, La/dp;->b(La/gbn;)V

    .line 140
    .line 141
    .line 142
    return-object v0

    .line 143
    :pswitch_1
    iget-object p0, p0, La/bhv;->g2:La/fiu0;

    .line 144
    .line 145
    if-eqz p0, :cond_1

    .line 146
    .line 147
    return-object p0

    .line 148
    :cond_1
    const-string p0, "viewModelFactory"

    .line 149
    .line 150
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    throw v1

    .line 154
    nop

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
