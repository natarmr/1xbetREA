.class public final synthetic La/gb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vhj0;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/vhj0;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/gb;->a:B

    iput-object p1, p0, La/gb;->b:La/vhj0;

    iput-object p2, p0, La/gb;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/vhj0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/gb;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/gb;->c:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/gb;->b:La/vhj0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/gb;->a:B

    .line 2
    .line 3
    const v1, 0x7f08083d

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v4, p0, La/gb;->c:Lkotlin/jvm/functions/Function1;

    .line 9
    .line 10
    iget-object p0, p0, La/gb;->b:La/vhj0;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, Landroid/view/View;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-interface {v4, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_0
    check-cast p1, La/lxx;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object v0, p1, La/lxx;->e:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 35
    .line 36
    iget-object v5, p1, La/lxx;->d:Lorg/xplatform/uikit/components/cells/right/DsCellRightLabel;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    sget-object v6, La/ymx;->d:La/ymx;

    .line 42
    .line 43
    new-instance v7, La/gb;

    .line 44
    .line 45
    const/4 v8, 0x4

    .line 46
    invoke-direct {v7, p0, v4, v8}, La/gb;-><init>(La/vhj0;Lkotlin/jvm/functions/Function1;B)V

    .line 47
    .line 48
    .line 49
    invoke-static {v0, v6, v7}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 50
    .line 51
    .line 52
    iget-object v4, p1, La/lxx;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 53
    .line 54
    iget-boolean v6, p0, La/vhj0;->c:Z

    .line 55
    .line 56
    invoke-virtual {v4, v6}, La/tw5;->setFirst(Z)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4, v3}, La/tw5;->setLast(Z)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v2}, La/tw5;->setAllowClickWhenDisabled(Z)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v2}, La/tw5;->setEnabled(Z)V

    .line 66
    .line 67
    .line 68
    iget-object v0, p1, La/lxx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 71
    .line 72
    .line 73
    iget-object p1, p1, La/lxx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 74
    .line 75
    iget-object v0, p0, La/vhj0;->a:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 78
    .line 79
    .line 80
    iget-object p0, p0, La/vhj0;->b:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-lez v0, :cond_0

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_0
    move v2, v3

    .line 90
    :goto_0
    invoke-virtual {p1, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitleVisible(Z)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 94
    .line 95
    .line 96
    const/16 p0, 0x8

    .line 97
    .line 98
    invoke-virtual {v5, p0}, Landroid/view/View;->setVisibility(I)V

    .line 99
    .line 100
    .line 101
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    return-object p0

    .line 104
    :pswitch_1
    check-cast p1, Landroid/view/View;

    .line 105
    .line 106
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-interface {v4, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    return-object p0

    .line 118
    :pswitch_2
    check-cast p1, La/ixx;

    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    iget-object v0, p1, La/ixx;->d:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 124
    .line 125
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    sget-object v5, La/ymx;->d:La/ymx;

    .line 129
    .line 130
    new-instance v6, La/gb;

    .line 131
    .line 132
    const/4 v7, 0x2

    .line 133
    invoke-direct {v6, p0, v4, v7}, La/gb;-><init>(La/vhj0;Lkotlin/jvm/functions/Function1;B)V

    .line 134
    .line 135
    .line 136
    invoke-static {v0, v5, v6}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 137
    .line 138
    .line 139
    iget-object v4, p1, La/ixx;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 140
    .line 141
    iget-boolean v5, p0, La/vhj0;->c:Z

    .line 142
    .line 143
    invoke-virtual {v4, v5}, La/tw5;->setFirst(Z)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v4, v3}, La/tw5;->setLast(Z)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, v2}, La/tw5;->setAllowClickWhenDisabled(Z)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v2}, La/tw5;->setEnabled(Z)V

    .line 153
    .line 154
    .line 155
    iget-object v0, p1, La/ixx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 156
    .line 157
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 158
    .line 159
    .line 160
    iget-object p1, p1, La/ixx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 161
    .line 162
    iget-object v0, p0, La/vhj0;->a:Ljava/lang/String;

    .line 163
    .line 164
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 165
    .line 166
    .line 167
    iget-object p0, p0, La/vhj0;->b:Ljava/lang/String;

    .line 168
    .line 169
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 170
    .line 171
    .line 172
    move-result v0

    .line 173
    if-lez v0, :cond_1

    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_1
    move v2, v3

    .line 177
    :goto_1
    invoke-virtual {p1, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitleVisible(Z)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 181
    .line 182
    .line 183
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 184
    .line 185
    return-object p0

    .line 186
    :pswitch_3
    check-cast p1, La/hej0;

    .line 187
    .line 188
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    new-instance p1, La/oyi0;

    .line 192
    .line 193
    invoke-direct {p1, p0}, La/oyi0;-><init>(La/hej0;)V

    .line 194
    .line 195
    .line 196
    invoke-interface {v4, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 200
    .line 201
    return-object p0

    .line 202
    nop

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
