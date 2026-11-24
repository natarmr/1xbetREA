.class public final La/rhq0;
.super La/v46;
.source "SourceFile"


# instance fields
.field public final A:La/dc3;

.field public final u:Landroid/view/View;

.field public final v:La/ygq0;

.field public final w:La/cym0;

.field public final x:La/cym0;

.field public final y:Lkotlin/Pair;

.field public final z:La/cym0;


# direct methods
.method public constructor <init>(Landroid/view/View;La/ygq0;La/cym0;La/cym0;Lkotlin/Pair;La/cym0;)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/rhq0;->u:Landroid/view/View;

    .line 8
    .line 9
    iput-object p2, p0, La/rhq0;->v:La/ygq0;

    .line 10
    .line 11
    iput-object p3, p0, La/rhq0;->w:La/cym0;

    .line 12
    .line 13
    iput-object p4, p0, La/rhq0;->x:La/cym0;

    .line 14
    .line 15
    iput-object p5, p0, La/rhq0;->y:Lkotlin/Pair;

    .line 16
    .line 17
    iput-object p6, p0, La/rhq0;->z:La/cym0;

    .line 18
    .line 19
    const p2, 0x7f0a03ec

    .line 20
    .line 21
    .line 22
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    move-object v2, p3

    .line 27
    check-cast v2, Landroid/widget/TextView;

    .line 28
    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    const p2, 0x7f0a0f1d

    .line 32
    .line 33
    .line 34
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    check-cast p3, Landroid/widget/TextView;

    .line 39
    .line 40
    if-eqz p3, :cond_0

    .line 41
    .line 42
    const p2, 0x7f0a1306

    .line 43
    .line 44
    .line 45
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object p3

    .line 49
    move-object v3, p3

    .line 50
    check-cast v3, Landroid/widget/TextView;

    .line 51
    .line 52
    if-eqz v3, :cond_0

    .line 53
    .line 54
    const p2, 0x7f0a1307

    .line 55
    .line 56
    .line 57
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    move-object v4, p3

    .line 62
    check-cast v4, Landroid/widget/TextView;

    .line 63
    .line 64
    if-eqz v4, :cond_0

    .line 65
    .line 66
    new-instance v0, La/dc3;

    .line 67
    .line 68
    move-object v1, p1

    .line 69
    check-cast v1, Landroid/widget/LinearLayout;

    .line 70
    .line 71
    const/4 v5, 0x2

    .line 72
    invoke-direct/range {v0 .. v5}, La/dc3;-><init>(Landroid/view/ViewGroup;Landroid/widget/TextView;Landroid/view/View;Landroid/view/View;B)V

    .line 73
    .line 74
    .line 75
    iput-object v0, p0, La/rhq0;->A:La/dc3;

    .line 76
    .line 77
    return-void

    .line 78
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    const-string p1, "Missing required view with ID: "

    .line 87
    .line 88
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    const/4 p0, 0x0

    .line 96
    throw p0
.end method


# virtual methods
.method public final t(Ljava/lang/Object;)V
    .locals 21

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    check-cast v0, La/ygq0;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v8, v2, La/rhq0;->A:La/dc3;

    .line 11
    .line 12
    iget-object v1, v8, La/dc3;->e:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Landroid/widget/TextView;

    .line 15
    .line 16
    iget-object v3, v8, La/dc3;->d:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v9, v3

    .line 19
    check-cast v9, Landroid/widget/TextView;

    .line 20
    .line 21
    iget-object v3, v8, La/dc3;->c:Landroid/view/View;

    .line 22
    .line 23
    move-object v10, v3

    .line 24
    check-cast v10, Landroid/widget/TextView;

    .line 25
    .line 26
    iget-object v3, v2, La/rhq0;->v:La/ygq0;

    .line 27
    .line 28
    const/4 v11, 0x0

    .line 29
    iget-object v12, v2, La/rhq0;->u:Landroid/view/View;

    .line 30
    .line 31
    if-ne v3, v0, :cond_0

    .line 32
    .line 33
    sget-object v0, La/j5d;->a:Landroid/util/TypedValue;

    .line 34
    .line 35
    invoke-virtual {v12}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    const v3, 0x7f040afc

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v3, v11}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    sget-object v0, La/j5d;->a:Landroid/util/TypedValue;

    .line 51
    .line 52
    invoke-virtual {v12}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    const v3, 0x7f040b72

    .line 60
    .line 61
    .line 62
    invoke-static {v0, v3, v11}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    :goto_0
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 67
    .line 68
    .line 69
    iget-object v0, v2, La/rhq0;->y:Lkotlin/Pair;

    .line 70
    .line 71
    iget-object v13, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 72
    .line 73
    iget-object v14, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 74
    .line 75
    move-object v0, v13

    .line 76
    check-cast v0, La/ynq0;

    .line 77
    .line 78
    iget-wide v0, v0, La/ynq0;->a:J

    .line 79
    .line 80
    const-wide/16 v15, -0x1

    .line 81
    .line 82
    cmp-long v0, v0, v15

    .line 83
    .line 84
    if-eqz v0, :cond_1

    .line 85
    .line 86
    sget-object v0, La/rdj;->a:La/rdj;

    .line 87
    .line 88
    invoke-virtual {v12}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-static {v0}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    .line 93
    .line 94
    .line 95
    move-result v17

    .line 96
    move-object v0, v13

    .line 97
    check-cast v0, La/ynq0;

    .line 98
    .line 99
    iget-wide v3, v0, La/ynq0;->a:J

    .line 100
    .line 101
    move-object v1, v0

    .line 102
    new-instance v0, La/fup0;

    .line 103
    .line 104
    const/4 v6, 0x0

    .line 105
    const/4 v7, 0x3

    .line 106
    move-object v3, v1

    .line 107
    const/4 v1, 0x2

    .line 108
    move-object v4, v3

    .line 109
    const-class v3, La/rhq0;

    .line 110
    .line 111
    move-object v5, v4

    .line 112
    const-string v4, "selectDatePattern"

    .line 113
    .line 114
    move-object/from16 v18, v5

    .line 115
    .line 116
    const-string v5, "selectDatePattern(Ljava/util/Calendar;Ljava/util/Calendar;)Lorg/xplatform/ui_core/format/DateTimePattern;"

    .line 117
    .line 118
    move-wide/from16 v19, v15

    .line 119
    .line 120
    move-object/from16 v15, v18

    .line 121
    .line 122
    invoke-direct/range {v0 .. v7}, La/fup0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 123
    .line 124
    .line 125
    invoke-static/range {v17 .. v17}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-static {v15, v1, v0}, La/rdj;->i(La/aoq0;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_1
    move-wide/from16 v19, v15

    .line 138
    .line 139
    :goto_1
    check-cast v14, La/ynq0;

    .line 140
    .line 141
    iget-wide v0, v14, La/ynq0;->a:J

    .line 142
    .line 143
    cmp-long v0, v0, v19

    .line 144
    .line 145
    if-eqz v0, :cond_2

    .line 146
    .line 147
    sget-object v0, La/rdj;->a:La/rdj;

    .line 148
    .line 149
    invoke-virtual {v12}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-static {v0}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    .line 154
    .line 155
    .line 156
    move-result v12

    .line 157
    iget-wide v0, v14, La/ynq0;->a:J

    .line 158
    .line 159
    new-instance v0, La/fup0;

    .line 160
    .line 161
    const/4 v6, 0x0

    .line 162
    const/4 v7, 0x4

    .line 163
    const/4 v1, 0x2

    .line 164
    const-class v3, La/rhq0;

    .line 165
    .line 166
    const-string v4, "selectDatePattern"

    .line 167
    .line 168
    const-string v5, "selectDatePattern(Ljava/util/Calendar;Ljava/util/Calendar;)Lorg/xplatform/ui_core/format/DateTimePattern;"

    .line 169
    .line 170
    move-object/from16 v2, p0

    .line 171
    .line 172
    invoke-direct/range {v0 .. v7}, La/fup0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 173
    .line 174
    .line 175
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    invoke-static {v14, v1, v0}, La/rdj;->i(La/aoq0;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 184
    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_2
    move-object/from16 v2, p0

    .line 188
    .line 189
    :goto_2
    new-instance v0, La/qhq0;

    .line 190
    .line 191
    invoke-direct {v0, v2, v11}, La/qhq0;-><init>(La/rhq0;B)V

    .line 192
    .line 193
    .line 194
    invoke-static {v9, v0}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 195
    .line 196
    .line 197
    check-cast v13, La/ynq0;

    .line 198
    .line 199
    iget-wide v0, v13, La/ynq0;->a:J

    .line 200
    .line 201
    cmp-long v0, v0, v19

    .line 202
    .line 203
    const/4 v1, 0x1

    .line 204
    if-eqz v0, :cond_3

    .line 205
    .line 206
    move v11, v1

    .line 207
    :cond_3
    invoke-virtual {v10, v11}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 208
    .line 209
    .line 210
    new-instance v0, La/qhq0;

    .line 211
    .line 212
    invoke-direct {v0, v2, v1}, La/qhq0;-><init>(La/rhq0;B)V

    .line 213
    .line 214
    .line 215
    invoke-static {v10, v0}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 216
    .line 217
    .line 218
    iget-object v0, v8, La/dc3;->e:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v0, Landroid/widget/TextView;

    .line 221
    .line 222
    new-instance v1, La/qhq0;

    .line 223
    .line 224
    const/4 v3, 0x2

    .line 225
    invoke-direct {v1, v2, v3}, La/qhq0;-><init>(La/rhq0;B)V

    .line 226
    .line 227
    .line 228
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 229
    .line 230
    .line 231
    return-void
.end method
