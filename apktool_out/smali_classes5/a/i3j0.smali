.class public final synthetic La/i3j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/w5j0;

.field public final synthetic c:La/w5j0;


# direct methods
.method public synthetic constructor <init>(La/w5j0;La/w5j0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/i3j0;->a:B

    iput-object p1, p0, La/i3j0;->b:La/w5j0;

    iput-object p2, p0, La/i3j0;->c:La/w5j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/i3j0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/i3j0;->c:La/w5j0;

    .line 4
    .line 5
    iget-object p0, p0, La/i3j0;->b:La/w5j0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    move-object v4, p1

    .line 9
    check-cast v4, La/cp;

    .line 10
    .line 11
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v4, v2}, La/xhe0;->q(Z)V

    .line 18
    .line 19
    .line 20
    new-instance v5, La/j3j0;

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    invoke-direct {v5, v4, p0, p1}, La/j3j0;-><init>(La/cp;La/w5j0;B)V

    .line 24
    .line 25
    .line 26
    iget-object p0, v4, La/cp;->u:La/yfu0;

    .line 27
    .line 28
    check-cast p0, La/g4j0;

    .line 29
    .line 30
    iget-object p1, p0, La/g4j0;->c:La/dc3;

    .line 31
    .line 32
    iget-object p1, p1, La/dc3;->d:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, Lorg/xplatform/uikit/components/cells/right/DsCellRightLabel;

    .line 35
    .line 36
    invoke-virtual {p1, v2}, Landroid/view/View;->setClickable(Z)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, La/g4j0;->d:La/dc3;

    .line 40
    .line 41
    iget-object v0, p1, La/dc3;->d:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Lorg/xplatform/uikit/components/cells/right/DsCellRightLabel;

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Landroid/view/View;->setClickable(Z)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, La/g4j0;->e:La/dc3;

    .line 49
    .line 50
    iget-object v3, v0, La/dc3;->d:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v3, Lorg/xplatform/uikit/components/cells/right/DsCellRightLabel;

    .line 53
    .line 54
    invoke-virtual {v3, v2}, Landroid/view/View;->setClickable(Z)V

    .line 55
    .line 56
    .line 57
    iget-object v2, p0, La/g4j0;->c:La/dc3;

    .line 58
    .line 59
    iget-object v2, v2, La/dc3;->e:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v2, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 62
    .line 63
    sget-object v3, La/ymx;->d:La/ymx;

    .line 64
    .line 65
    new-instance v6, La/e2j0;

    .line 66
    .line 67
    const/4 v7, 0x5

    .line 68
    invoke-direct {v6, v1, v7}, La/e2j0;-><init>(La/w5j0;B)V

    .line 69
    .line 70
    .line 71
    invoke-static {v2, v3, v6}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 72
    .line 73
    .line 74
    iget-object p1, p1, La/dc3;->e:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p1, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 77
    .line 78
    new-instance v2, La/e2j0;

    .line 79
    .line 80
    const/4 v6, 0x6

    .line 81
    invoke-direct {v2, v1, v6}, La/e2j0;-><init>(La/w5j0;B)V

    .line 82
    .line 83
    .line 84
    invoke-static {p1, v3, v2}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 85
    .line 86
    .line 87
    iget-object p1, v0, La/dc3;->e:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p1, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 90
    .line 91
    new-instance v0, La/e2j0;

    .line 92
    .line 93
    const/4 v2, 0x7

    .line 94
    invoke-direct {v0, v1, v2}, La/e2j0;-><init>(La/w5j0;B)V

    .line 95
    .line 96
    .line 97
    invoke-static {p1, v3, v0}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 98
    .line 99
    .line 100
    new-instance v3, La/if6;

    .line 101
    .line 102
    const/16 v8, 0xb

    .line 103
    .line 104
    move-object v6, v4

    .line 105
    move-object v7, v5

    .line 106
    invoke-direct/range {v3 .. v8}, La/if6;-><init>(La/cp;Ljava/lang/Object;La/cp;Ljava/lang/Object;B)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v4, v3}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 110
    .line 111
    .line 112
    iget-object p0, p0, La/g4j0;->f:La/dc3;

    .line 113
    .line 114
    iget-object p0, p0, La/dc3;->e:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 117
    .line 118
    invoke-virtual {p0, v5}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 119
    .line 120
    .line 121
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 122
    .line 123
    return-object p0

    .line 124
    :pswitch_0
    invoke-virtual {v4, v2}, La/xhe0;->q(Z)V

    .line 125
    .line 126
    .line 127
    new-instance v5, La/j3j0;

    .line 128
    .line 129
    invoke-direct {v5, v4, p0, v2}, La/j3j0;-><init>(La/cp;La/w5j0;B)V

    .line 130
    .line 131
    .line 132
    new-instance v3, La/if6;

    .line 133
    .line 134
    const/16 v8, 0xa

    .line 135
    .line 136
    move-object v6, v4

    .line 137
    move-object v7, v5

    .line 138
    invoke-direct/range {v3 .. v8}, La/if6;-><init>(La/cp;Ljava/lang/Object;La/cp;Ljava/lang/Object;B)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v4, v3}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 142
    .line 143
    .line 144
    iget-object p0, v4, La/cp;->u:La/yfu0;

    .line 145
    .line 146
    check-cast p0, La/b3j0;

    .line 147
    .line 148
    iget-object p1, p0, La/b3j0;->c:La/dc3;

    .line 149
    .line 150
    iget-object p1, p1, La/dc3;->e:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast p1, Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 153
    .line 154
    invoke-virtual {p1, v5}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 155
    .line 156
    .line 157
    iget-object p0, p0, La/b3j0;->b:La/dc3;

    .line 158
    .line 159
    iget-object p1, p0, La/dc3;->d:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast p1, Lorg/xplatform/uikit/components/cells/right/DsCellRightLabel;

    .line 162
    .line 163
    invoke-virtual {p1, v2}, Landroid/view/View;->setClickable(Z)V

    .line 164
    .line 165
    .line 166
    iget-object p0, p0, La/dc3;->e:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast p0, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 169
    .line 170
    sget-object p1, La/ymx;->d:La/ymx;

    .line 171
    .line 172
    new-instance v0, La/e2j0;

    .line 173
    .line 174
    const/4 v2, 0x2

    .line 175
    invoke-direct {v0, v1, v2}, La/e2j0;-><init>(La/w5j0;B)V

    .line 176
    .line 177
    .line 178
    invoke-static {p0, p1, v0}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 179
    .line 180
    .line 181
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 182
    .line 183
    return-object p0

    .line 184
    nop

    .line 185
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
