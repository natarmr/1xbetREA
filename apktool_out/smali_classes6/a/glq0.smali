.class public final synthetic La/glq0;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final a:La/glq0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/glq0;

    .line 2
    .line 3
    const-string v4, "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/themesettings/impl/databinding/BottomSheetTimePickerBinding;"

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    const-class v2, La/iq8;

    .line 8
    .line 9
    const-string v3, "inflate"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, La/rer;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/glq0;->a:La/glq0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    check-cast p1, Landroid/view/LayoutInflater;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const p0, 0x7f0d0070

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {p1, p0, v1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const p1, 0x7f0a0450

    .line 16
    .line 17
    .line 18
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v2, "Missing required view with ID: "

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    const p1, 0x7f0a045f

    .line 27
    .line 28
    .line 29
    invoke-static {v0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    if-eqz v5, :cond_0

    .line 34
    .line 35
    const p1, 0x7f0a0460

    .line 36
    .line 37
    .line 38
    invoke-static {v0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    if-eqz v6, :cond_0

    .line 43
    .line 44
    const p1, 0x7f0a071e

    .line 45
    .line 46
    .line 47
    invoke-static {v0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    move-object v7, v3

    .line 52
    check-cast v7, Landroid/widget/NumberPicker;

    .line 53
    .line 54
    if-eqz v7, :cond_0

    .line 55
    .line 56
    const p1, 0x7f0a0972

    .line 57
    .line 58
    .line 59
    invoke-static {v0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    check-cast v3, Landroid/widget/LinearLayout;

    .line 64
    .line 65
    if-eqz v3, :cond_0

    .line 66
    .line 67
    const p1, 0x7f0a0a46

    .line 68
    .line 69
    .line 70
    invoke-static {v0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    move-object v8, v3

    .line 75
    check-cast v8, Landroid/widget/NumberPicker;

    .line 76
    .line 77
    if-eqz v8, :cond_0

    .line 78
    .line 79
    move-object v4, v0

    .line 80
    check-cast v4, Lorg/xplatform/themesettings/impl/presentation/timepicker/DisallowInterceptView;

    .line 81
    .line 82
    const p1, 0x7f0a0fc4

    .line 83
    .line 84
    .line 85
    invoke-static {v0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    move-object v9, v3

    .line 90
    check-cast v9, Landroid/widget/NumberPicker;

    .line 91
    .line 92
    if-eqz v9, :cond_0

    .line 93
    .line 94
    const p1, 0x7f0a12e7    # 1.835316E38f

    .line 95
    .line 96
    .line 97
    invoke-static {v0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    check-cast v3, Landroid/widget/TextView;

    .line 102
    .line 103
    if-eqz v3, :cond_0

    .line 104
    .line 105
    const p1, 0x7f0a1422

    .line 106
    .line 107
    .line 108
    invoke-static {v0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 109
    .line 110
    .line 111
    move-result-object v10

    .line 112
    if-eqz v10, :cond_0

    .line 113
    .line 114
    new-instance v3, La/iab;

    .line 115
    .line 116
    const/4 v11, 0x7

    .line 117
    invoke-direct/range {v3 .. v11}, La/iab;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;B)V

    .line 118
    .line 119
    .line 120
    const p1, 0x7f0a0fc1

    .line 121
    .line 122
    .line 123
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    check-cast v0, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTwoButtons;

    .line 128
    .line 129
    if-eqz v0, :cond_1

    .line 130
    .line 131
    check-cast p0, Landroid/widget/LinearLayout;

    .line 132
    .line 133
    new-instance p1, La/iq8;

    .line 134
    .line 135
    invoke-direct {p1, p0, v3, v0}, La/iq8;-><init>(Landroid/widget/LinearLayout;La/iab;Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTwoButtons;)V

    .line 136
    .line 137
    .line 138
    return-object p1

    .line 139
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    return-object v1

    .line 155
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    return-object v1
.end method
