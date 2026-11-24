.class public final synthetic La/ym70;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final a:La/ym70;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ym70;

    .line 2
    .line 3
    const-string v4, "bind(Landroid/view/View;)Lorg/xplatform/core/databinding/OnexGameHolderFragmentBinding;"

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    const-class v2, La/zk70;

    .line 8
    .line 9
    const-string v3, "bind"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, La/rer;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/ym70;->a:La/ym70;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    check-cast p1, Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const p0, 0x7f0a00fc

    .line 7
    .line 8
    .line 9
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    move-object v3, v0

    .line 14
    check-cast v3, Landroidx/appcompat/widget/AppCompatImageView;

    .line 15
    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    const p0, 0x7f0a064e

    .line 19
    .line 20
    .line 21
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Landroid/widget/FrameLayout;

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    move-object v2, p1

    .line 30
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 31
    .line 32
    const p0, 0x7f0a0680

    .line 33
    .line 34
    .line 35
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Landroid/widget/ImageView;

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    const p0, 0x7f0a0681

    .line 44
    .line 45
    .line 46
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Landroid/widget/ImageView;

    .line 51
    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    const p0, 0x7f0a06c4

    .line 55
    .line 56
    .line 57
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    check-cast p0, Landroidx/constraintlayout/widget/Guideline;

    .line 62
    .line 63
    const p0, 0x7f0a07d2

    .line 64
    .line 65
    .line 66
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    move-object v5, v0

    .line 71
    check-cast v5, Landroid/widget/FrameLayout;

    .line 72
    .line 73
    if-eqz v5, :cond_0

    .line 74
    .line 75
    const p0, 0x7f0a07d3

    .line 76
    .line 77
    .line 78
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    move-object v6, v0

    .line 83
    check-cast v6, Landroid/widget/TextView;

    .line 84
    .line 85
    if-eqz v6, :cond_0

    .line 86
    .line 87
    const p0, 0x7f0a0ad2

    .line 88
    .line 89
    .line 90
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Landroid/widget/FrameLayout;

    .line 95
    .line 96
    if-eqz v0, :cond_0

    .line 97
    .line 98
    const p0, 0x7f0a0ad4

    .line 99
    .line 100
    .line 101
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    move-object v7, v0

    .line 106
    check-cast v7, Landroid/widget/FrameLayout;

    .line 107
    .line 108
    if-eqz v7, :cond_0

    .line 109
    .line 110
    const p0, 0x7f0a0ad5

    .line 111
    .line 112
    .line 113
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    move-object v8, v0

    .line 118
    check-cast v8, Landroid/widget/FrameLayout;

    .line 119
    .line 120
    if-eqz v8, :cond_0

    .line 121
    .line 122
    const p0, 0x7f0a0ad6

    .line 123
    .line 124
    .line 125
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    move-object v9, v0

    .line 130
    check-cast v9, Landroid/widget/FrameLayout;

    .line 131
    .line 132
    if-eqz v9, :cond_0

    .line 133
    .line 134
    const p0, 0x7f0a0ad7

    .line 135
    .line 136
    .line 137
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    check-cast v0, Landroid/widget/FrameLayout;

    .line 142
    .line 143
    if-eqz v0, :cond_0

    .line 144
    .line 145
    const p0, 0x7f0a0ad9

    .line 146
    .line 147
    .line 148
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    move-object v10, v0

    .line 153
    check-cast v10, Landroid/widget/FrameLayout;

    .line 154
    .line 155
    if-eqz v10, :cond_0

    .line 156
    .line 157
    const p0, 0x7f0a13ab

    .line 158
    .line 159
    .line 160
    invoke-static {p1, p0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    move-object v11, v0

    .line 165
    check-cast v11, Lorg/xplatform/core/presentation/views/tax_message/TaxMessageView;

    .line 166
    .line 167
    if-eqz v11, :cond_0

    .line 168
    .line 169
    new-instance v1, La/zk70;

    .line 170
    .line 171
    move-object v4, v2

    .line 172
    invoke-direct/range {v1 .. v11}, La/zk70;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/FrameLayout;Landroid/widget/TextView;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Lorg/xplatform/core/presentation/views/tax_message/TaxMessageView;)V

    .line 173
    .line 174
    .line 175
    return-object v1

    .line 176
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-virtual {p1, p0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    const-string p1, "Missing required view with ID: "

    .line 185
    .line 186
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    const/4 p0, 0x0

    .line 194
    return-object p0
.end method
