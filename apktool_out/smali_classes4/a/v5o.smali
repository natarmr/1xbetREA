.class public final synthetic La/v5o;
.super La/rer;
.source "SourceFile"

# interfaces
.implements La/xdr;


# static fields
.field public static final a:La/v5o;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/v5o;

    .line 2
    .line 3
    const-string v4, "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/cyber/game/universal/impl/databinding/SyntheticCyberPokerItemBinding;"

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v1, 0x3

    .line 7
    const-class v2, La/g1o0;

    .line 8
    .line 9
    const-string v3, "inflate"

    .line 10
    .line 11
    invoke-direct/range {v0 .. v5}, La/rer;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, La/v5o;->a:La/v5o;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, Landroid/view/LayoutInflater;

    .line 4
    .line 5
    move-object/from16 v1, p2

    .line 6
    .line 7
    check-cast v1, Landroid/view/ViewGroup;

    .line 8
    .line 9
    move-object/from16 v2, p3

    .line 10
    .line 11
    check-cast v2, Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const v3, 0x7f0d05bc

    .line 21
    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-virtual {v0, v3, v1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    const v1, 0x7f0a0388

    .line 34
    .line 35
    .line 36
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    move-object v5, v2

    .line 41
    check-cast v5, Landroid/widget/LinearLayout;

    .line 42
    .line 43
    if-eqz v5, :cond_1

    .line 44
    .line 45
    const v1, 0x7f0a057e

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    move-object v6, v2

    .line 53
    check-cast v6, Landroid/widget/LinearLayout;

    .line 54
    .line 55
    if-eqz v6, :cond_1

    .line 56
    .line 57
    const v1, 0x7f0a06b9

    .line 58
    .line 59
    .line 60
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, Landroidx/constraintlayout/widget/Guideline;

    .line 65
    .line 66
    if-eqz v2, :cond_1

    .line 67
    .line 68
    const v1, 0x7f0a0825

    .line 69
    .line 70
    .line 71
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast v2, Landroid/widget/ImageView;

    .line 76
    .line 77
    if-eqz v2, :cond_1

    .line 78
    .line 79
    const v1, 0x7f0a0848

    .line 80
    .line 81
    .line 82
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    move-object v7, v2

    .line 87
    check-cast v7, Landroid/widget/ImageView;

    .line 88
    .line 89
    if-eqz v7, :cond_1

    .line 90
    .line 91
    const v1, 0x7f0a084b

    .line 92
    .line 93
    .line 94
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    move-object v8, v2

    .line 99
    check-cast v8, Landroid/widget/ImageView;

    .line 100
    .line 101
    if-eqz v8, :cond_1

    .line 102
    .line 103
    const v1, 0x7f0a08a5

    .line 104
    .line 105
    .line 106
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    move-object v9, v2

    .line 111
    check-cast v9, Landroid/widget/ImageView;

    .line 112
    .line 113
    if-eqz v9, :cond_1

    .line 114
    .line 115
    const v1, 0x7f0a08ac

    .line 116
    .line 117
    .line 118
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    move-object v10, v2

    .line 123
    check-cast v10, Landroid/widget/ImageView;

    .line 124
    .line 125
    if-eqz v10, :cond_1

    .line 126
    .line 127
    const v1, 0x7f0a0a04

    .line 128
    .line 129
    .line 130
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    move-object v11, v2

    .line 135
    check-cast v11, Landroid/widget/TextView;

    .line 136
    .line 137
    if-eqz v11, :cond_1

    .line 138
    .line 139
    const v1, 0x7f0a0d14

    .line 140
    .line 141
    .line 142
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    move-object v12, v2

    .line 147
    check-cast v12, Landroid/widget/LinearLayout;

    .line 148
    .line 149
    if-eqz v12, :cond_1

    .line 150
    .line 151
    const v1, 0x7f0a0fcc

    .line 152
    .line 153
    .line 154
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    check-cast v2, Lorg/xplatform/uikit/components/timer/DsTimer;

    .line 159
    .line 160
    if-eqz v2, :cond_1

    .line 161
    .line 162
    const v1, 0x7f0a110c

    .line 163
    .line 164
    .line 165
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    move-object v13, v2

    .line 170
    check-cast v13, Landroid/widget/TextView;

    .line 171
    .line 172
    if-eqz v13, :cond_1

    .line 173
    .line 174
    const v1, 0x7f0a1110

    .line 175
    .line 176
    .line 177
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    move-object v14, v2

    .line 182
    check-cast v14, Landroid/widget/TextView;

    .line 183
    .line 184
    if-eqz v14, :cond_1

    .line 185
    .line 186
    const v1, 0x7f0a11f8

    .line 187
    .line 188
    .line 189
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    move-object v15, v2

    .line 194
    check-cast v15, Landroid/widget/TextView;

    .line 195
    .line 196
    if-eqz v15, :cond_1

    .line 197
    .line 198
    const v1, 0x7f0a11fc

    .line 199
    .line 200
    .line 201
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    move-object/from16 v16, v2

    .line 206
    .line 207
    check-cast v16, Landroid/widget/TextView;

    .line 208
    .line 209
    if-eqz v16, :cond_1

    .line 210
    .line 211
    new-instance v3, La/g1o0;

    .line 212
    .line 213
    move-object v4, v0

    .line 214
    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 215
    .line 216
    invoke-direct/range {v3 .. v16}, La/g1o0;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 217
    .line 218
    .line 219
    return-object v3

    .line 220
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    const-string v1, "Missing required view with ID: "

    .line 229
    .line 230
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    const/4 v0, 0x0

    .line 238
    return-object v0
.end method
