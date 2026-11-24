.class public final synthetic La/lzi0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/nzi0;


# direct methods
.method public synthetic constructor <init>(La/nzi0;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/lzi0;->a:B

    iput-object p1, p0, La/lzi0;->c:La/nzi0;

    iput-object p2, p0, La/lzi0;->b:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/nzi0;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/lzi0;->a:B

    iput-object p1, p0, La/lzi0;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/lzi0;->c:La/nzi0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/lzi0;->a:B

    .line 2
    .line 3
    const v1, 0x7f040b0b

    .line 4
    .line 5
    .line 6
    const v2, 0x7f131710

    .line 7
    .line 8
    .line 9
    const v3, 0x7f040afc

    .line 10
    .line 11
    .line 12
    const v4, 0x7f131708

    .line 13
    .line 14
    .line 15
    const v5, 0x7f0808f8

    .line 16
    .line 17
    .line 18
    const/4 v6, 0x1

    .line 19
    iget-object v7, p0, La/lzi0;->c:La/nzi0;

    .line 20
    .line 21
    iget-object p0, p0, La/lzi0;->b:Lkotlin/jvm/functions/Function1;

    .line 22
    .line 23
    packed-switch v0, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    check-cast p1, Landroid/view/View;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-interface {p0, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_0
    check-cast p1, La/lxx;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    iget-object v0, p1, La/lxx;->e:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 43
    .line 44
    iget-object v8, p1, La/lxx;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    new-instance v9, La/lzi0;

    .line 50
    .line 51
    const/4 v10, 0x3

    .line 52
    invoke-direct {v9, p0, v7, v10}, La/lzi0;-><init>(Lkotlin/jvm/functions/Function1;La/nzi0;B)V

    .line 53
    .line 54
    .line 55
    invoke-static {v0, v9}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 56
    .line 57
    .line 58
    iget-object p0, p1, La/lxx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 59
    .line 60
    invoke-virtual {p0, v5}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 61
    .line 62
    .line 63
    iget-object p0, p1, La/lxx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 64
    .line 65
    iget-object v0, v7, La/nzi0;->a:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v6}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitleVisible(Z)V

    .line 71
    .line 72
    .line 73
    iget-object v0, v7, La/nzi0;->b:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 76
    .line 77
    .line 78
    iget-boolean p0, v7, La/nzi0;->c:Z

    .line 79
    .line 80
    iget-object p1, p1, La/lxx;->d:Lorg/xplatform/uikit/components/cells/right/DsCellRightLabel;

    .line 81
    .line 82
    if-eqz p0, :cond_0

    .line 83
    .line 84
    invoke-virtual {p1, v4}, Lorg/xplatform/uikit/components/cells/right/DsCellRightLabel;->setText(I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-static {v3, p0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/cells/right/DsCellRightLabel;->setTextColor(I)V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_0
    invoke-virtual {p1, v2}, Lorg/xplatform/uikit/components/cells/right/DsCellRightLabel;->setText(I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-static {v1, p0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    invoke-virtual {p1, p0}, Lorg/xplatform/uikit/components/cells/right/DsCellRightLabel;->setTextColor(I)V

    .line 117
    .line 118
    .line 119
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    return-object p0

    .line 122
    :pswitch_1
    check-cast p1, Landroid/view/View;

    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-interface {p0, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object p0

    .line 133
    :pswitch_2
    check-cast p1, La/jxx;

    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    iget-object v0, p1, La/jxx;->e:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 139
    .line 140
    iget-object v8, p1, La/jxx;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    new-instance v9, La/lzi0;

    .line 146
    .line 147
    invoke-direct {v9, p0, v7, v6}, La/lzi0;-><init>(Lkotlin/jvm/functions/Function1;La/nzi0;B)V

    .line 148
    .line 149
    .line 150
    invoke-static {v0, v9}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 151
    .line 152
    .line 153
    iget-object p0, p1, La/jxx;->b:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 154
    .line 155
    invoke-virtual {p0, v5}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 156
    .line 157
    .line 158
    iget-object p0, p1, La/jxx;->c:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 159
    .line 160
    iget-object v0, v7, La/nzi0;->a:Ljava/lang/String;

    .line 161
    .line 162
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setTitle(Ljava/lang/CharSequence;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0, v6}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitleVisible(Z)V

    .line 166
    .line 167
    .line 168
    iget-object v0, v7, La/nzi0;->b:Ljava/lang/String;

    .line 169
    .line 170
    invoke-virtual {p0, v0}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 171
    .line 172
    .line 173
    iget-object p0, p1, La/jxx;->d:Lorg/xplatform/uikit/components/cells/right/DsCellRightLabel;

    .line 174
    .line 175
    const/4 p1, 0x0

    .line 176
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 177
    .line 178
    .line 179
    iget-boolean p1, v7, La/nzi0;->c:Z

    .line 180
    .line 181
    if-eqz p1, :cond_1

    .line 182
    .line 183
    invoke-virtual {p0, v4}, Lorg/xplatform/uikit/components/cells/right/DsCellRightLabel;->setText(I)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    invoke-static {v3, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 194
    .line 195
    .line 196
    move-result p1

    .line 197
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/cells/right/DsCellRightLabel;->setTextColor(I)V

    .line 198
    .line 199
    .line 200
    goto :goto_1

    .line 201
    :cond_1
    invoke-virtual {p0, v2}, Lorg/xplatform/uikit/components/cells/right/DsCellRightLabel;->setText(I)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    invoke-static {v1, p1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 212
    .line 213
    .line 214
    move-result p1

    .line 215
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/cells/right/DsCellRightLabel;->setTextColor(I)V

    .line 216
    .line 217
    .line 218
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 219
    .line 220
    return-object p0

    .line 221
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
