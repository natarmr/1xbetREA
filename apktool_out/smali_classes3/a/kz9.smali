.class public final synthetic La/kz9;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final a:La/kz9;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/kz9;

    .line 2
    .line 3
    const-string v4, "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/camera/impl/databinding/CameraFragmentBinding;"

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    const-class v2, La/rz9;

    .line 8
    .line 9
    const-string v3, "inflate"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, La/rer;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/kz9;->a:La/kz9;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, Landroid/view/LayoutInflater;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const v1, 0x7f0d0075

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-virtual {v0, v1, v3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const v1, 0x7f0a00be

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    move-object v6, v2

    .line 25
    check-cast v6, Landroidx/appcompat/widget/AppCompatImageButton;

    .line 26
    .line 27
    if-eqz v6, :cond_0

    .line 28
    .line 29
    const v1, 0x7f0a00f4

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    move-object v7, v2

    .line 37
    check-cast v7, Landroidx/appcompat/widget/AppCompatImageButton;

    .line 38
    .line 39
    if-eqz v7, :cond_0

    .line 40
    .line 41
    const v1, 0x7f0a022c

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Landroid/widget/LinearLayout;

    .line 49
    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    const v1, 0x7f0a023b

    .line 53
    .line 54
    .line 55
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    move-object v8, v2

    .line 60
    check-cast v8, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 61
    .line 62
    if-eqz v8, :cond_0

    .line 63
    .line 64
    const v1, 0x7f0a023c

    .line 65
    .line 66
    .line 67
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    move-object v9, v2

    .line 72
    check-cast v9, Landroidx/camera/view/PreviewView;

    .line 73
    .line 74
    if-eqz v9, :cond_0

    .line 75
    .line 76
    move-object v5, v0

    .line 77
    check-cast v5, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 78
    .line 79
    const v1, 0x7f0a023f

    .line 80
    .line 81
    .line 82
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    move-object v10, v2

    .line 87
    check-cast v10, Landroidx/appcompat/widget/AppCompatImageButton;

    .line 88
    .line 89
    if-eqz v10, :cond_0

    .line 90
    .line 91
    const v1, 0x7f0a0245

    .line 92
    .line 93
    .line 94
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    move-object v11, v2

    .line 99
    check-cast v11, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 100
    .line 101
    if-eqz v11, :cond_0

    .line 102
    .line 103
    const v1, 0x7f0a0246

    .line 104
    .line 105
    .line 106
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    move-object v12, v2

    .line 111
    check-cast v12, Landroidx/appcompat/widget/AppCompatImageView;

    .line 112
    .line 113
    if-eqz v12, :cond_0

    .line 114
    .line 115
    const v1, 0x7f0a05f9

    .line 116
    .line 117
    .line 118
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    move-object v13, v2

    .line 123
    check-cast v13, Landroidx/appcompat/widget/AppCompatImageButton;

    .line 124
    .line 125
    if-eqz v13, :cond_0

    .line 126
    .line 127
    const v1, 0x7f0a0b82

    .line 128
    .line 129
    .line 130
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    move-object v14, v2

    .line 135
    check-cast v14, Landroidx/appcompat/widget/AppCompatImageView;

    .line 136
    .line 137
    if-eqz v14, :cond_0

    .line 138
    .line 139
    const v1, 0x7f0a0b85

    .line 140
    .line 141
    .line 142
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    check-cast v2, Landroid/widget/LinearLayout;

    .line 147
    .line 148
    if-eqz v2, :cond_0

    .line 149
    .line 150
    const v1, 0x7f0a0ec6

    .line 151
    .line 152
    .line 153
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    move-object v15, v2

    .line 158
    check-cast v15, Landroidx/appcompat/widget/AppCompatImageButton;

    .line 159
    .line 160
    if-eqz v15, :cond_0

    .line 161
    .line 162
    const v1, 0x7f0a0ef8

    .line 163
    .line 164
    .line 165
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    move-object/from16 v16, v2

    .line 170
    .line 171
    check-cast v16, Landroidx/appcompat/widget/AppCompatImageButton;

    .line 172
    .line 173
    if-eqz v16, :cond_0

    .line 174
    .line 175
    const v1, 0x7f0a0f1a

    .line 176
    .line 177
    .line 178
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    move-object/from16 v17, v2

    .line 183
    .line 184
    check-cast v17, Landroidx/appcompat/widget/AppCompatImageView;

    .line 185
    .line 186
    if-eqz v17, :cond_0

    .line 187
    .line 188
    const v1, 0x7f0a1479

    .line 189
    .line 190
    .line 191
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    move-object/from16 v18, v2

    .line 196
    .line 197
    check-cast v18, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;

    .line 198
    .line 199
    if-eqz v18, :cond_0

    .line 200
    .line 201
    new-instance v4, La/rz9;

    .line 202
    .line 203
    invoke-direct/range {v4 .. v18}, La/rz9;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/appcompat/widget/AppCompatImageButton;Landroidx/appcompat/widget/AppCompatImageButton;Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/camera/view/PreviewView;Landroidx/appcompat/widget/AppCompatImageButton;Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageButton;Landroidx/appcompat/widget/AppCompatImageView;Landroidx/appcompat/widget/AppCompatImageButton;Landroidx/appcompat/widget/AppCompatImageButton;Landroidx/appcompat/widget/AppCompatImageView;Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;)V

    .line 204
    .line 205
    .line 206
    return-object v4

    .line 207
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    const-string v1, "Missing required view with ID: "

    .line 216
    .line 217
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    return-object v3
.end method
