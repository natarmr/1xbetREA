.class public final Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final synthetic p:I


# instance fields
.field public a:La/yag;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:La/n0o0;

.field public final g:La/n0o0;

.field public final h:La/n0o0;

.field public final i:La/n0o0;

.field public final j:La/n0o0;

.field public final k:F

.field public final l:I

.field public final m:Ljava/util/LinkedHashMap;

.field public final n:Ljava/util/LinkedHashMap;

.field public final o:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 221
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 220
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    and-int/2addr p3, v0

    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p3, 0x0

    .line 10
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    .line 12
    .line 13
    sget-object p2, La/yag;->d:La/yag;

    .line 14
    .line 15
    iput-object p2, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->a:La/yag;

    .line 16
    .line 17
    sget-object p2, La/j5d;->a:Landroid/util/TypedValue;

    .line 18
    .line 19
    const p2, 0x7f040ae3

    .line 20
    .line 21
    .line 22
    invoke-static {p1, p2, p3}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    iput p2, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->b:I

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    const v1, 0x7f070717

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    iput p2, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->c:I

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 42
    .line 43
    .line 44
    move-result-object p2

    .line 45
    const v1, 0x7f070722

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    iput p2, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->d:I

    .line 53
    .line 54
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    const v1, 0x7f07072d

    .line 59
    .line 60
    .line 61
    invoke-virtual {p2, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 62
    .line 63
    .line 64
    move-result p2

    .line 65
    iput p2, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->e:I

    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    const v1, 0x7f05000f

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    new-instance v1, La/j9g;

    .line 79
    .line 80
    invoke-direct {v1, p1, p0, p3}, La/j9g;-><init>(Landroid/content/Context;Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;B)V

    .line 81
    .line 82
    .line 83
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    iput-object v1, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->f:La/n0o0;

    .line 88
    .line 89
    new-instance v1, La/j9g;

    .line 90
    .line 91
    const/4 v2, 0x1

    .line 92
    invoke-direct {v1, p1, p0, v2}, La/j9g;-><init>(Landroid/content/Context;Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;B)V

    .line 93
    .line 94
    .line 95
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    iput-object v1, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->g:La/n0o0;

    .line 100
    .line 101
    new-instance v1, La/j9g;

    .line 102
    .line 103
    invoke-direct {v1, p1, p0, v0}, La/j9g;-><init>(Landroid/content/Context;Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;B)V

    .line 104
    .line 105
    .line 106
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    iput-object v1, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->h:La/n0o0;

    .line 111
    .line 112
    new-instance v1, La/k9g;

    .line 113
    .line 114
    invoke-direct {v1, p0, p3}, La/k9g;-><init>(Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;B)V

    .line 115
    .line 116
    .line 117
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 118
    .line 119
    .line 120
    move-result-object p3

    .line 121
    iput-object p3, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->i:La/n0o0;

    .line 122
    .line 123
    new-instance p3, La/k9g;

    .line 124
    .line 125
    invoke-direct {p3, p0, v2}, La/k9g;-><init>(Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;B)V

    .line 126
    .line 127
    .line 128
    invoke-static {p3}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 129
    .line 130
    .line 131
    move-result-object p3

    .line 132
    iput-object p3, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->j:La/n0o0;

    .line 133
    .line 134
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 135
    .line 136
    .line 137
    move-result-object p3

    .line 138
    if-eqz p2, :cond_1

    .line 139
    .line 140
    const v1, 0x7f07071f

    .line 141
    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_1
    const v1, 0x7f0706e0

    .line 145
    .line 146
    .line 147
    :goto_0
    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 148
    .line 149
    .line 150
    move-result p3

    .line 151
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    const v2, 0x7f0700ad

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimension(I)F

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    iput v1, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->k:F

    .line 163
    .line 164
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 173
    .line 174
    mul-int/2addr p3, v0

    .line 175
    sub-int/2addr v1, p3

    .line 176
    iput v1, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->l:I

    .line 177
    .line 178
    new-instance p3, Ljava/util/LinkedHashMap;

    .line 179
    .line 180
    invoke-direct {p3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 181
    .line 182
    .line 183
    iput-object p3, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->m:Ljava/util/LinkedHashMap;

    .line 184
    .line 185
    new-instance p3, Ljava/util/LinkedHashMap;

    .line 186
    .line 187
    invoke-direct {p3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 188
    .line 189
    .line 190
    iput-object p3, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->n:Ljava/util/LinkedHashMap;

    .line 191
    .line 192
    new-instance p3, Ljava/util/ArrayList;

    .line 193
    .line 194
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 195
    .line 196
    .line 197
    iput-object p3, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->o:Ljava/util/ArrayList;

    .line 198
    .line 199
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    if-eqz p2, :cond_2

    .line 204
    .line 205
    const p2, 0x7f070642

    .line 206
    .line 207
    .line 208
    goto :goto_1

    .line 209
    :cond_2
    const p2, 0x7f070641

    .line 210
    .line 211
    .line 212
    :goto_1
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 213
    .line 214
    .line 215
    move-result p1

    .line 216
    invoke-virtual {p0, p1}, Landroid/view/View;->setMinimumHeight(I)V

    .line 217
    .line 218
    .line 219
    return-void
.end method

.method public static final e(Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;)I
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->getEventViewHeight()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0}, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->getEventSpace()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    add-int/2addr v0, p0

    .line 10
    return v0
.end method

.method private final getDrawable()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 8
    .line 9
    .line 10
    iget v1, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->k:F

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 13
    .line 14
    .line 15
    iget p0, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->b:I

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method private final getEventSpace()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->h:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method private final getEventViewHeight()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->g:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method private final getImageSize()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->f:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method private final getMaxEventHeight()I
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->i:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method private final getTextSize()F
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->j:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method


# virtual methods
.method public final a(Landroid/view/ViewGroup;La/q9g;IZ)V
    .locals 4

    .line 1
    iget v0, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->c:I

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget p4, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->d:I

    .line 6
    .line 7
    add-int/2addr p4, v0

    .line 8
    invoke-direct {p0}, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->getEventSpace()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    sub-int/2addr p4, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move p4, v0

    .line 15
    :goto_0
    invoke-static {}, La/cy7;->c()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    iget v1, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->l:I

    .line 22
    .line 23
    int-to-float v1, v1

    .line 24
    iget v2, p2, La/q9g;->a:F

    .line 25
    .line 26
    sub-float/2addr v1, v2

    .line 27
    iget-wide v2, p2, La/q9g;->b:J

    .line 28
    .line 29
    long-to-float p2, v2

    .line 30
    sub-float/2addr v1, p2

    .line 31
    int-to-float p2, v0

    .line 32
    add-float/2addr v1, p2

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    iget p2, p2, La/q9g;->a:F

    .line 35
    .line 36
    int-to-float v0, v0

    .line 37
    add-float v1, p2, v0

    .line 38
    .line 39
    :goto_1
    invoke-direct {p0}, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->getEventViewHeight()I

    .line 40
    .line 41
    .line 42
    move-result p2

    .line 43
    invoke-direct {p0}, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->getEventSpace()I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    add-int/2addr p2, p0

    .line 48
    mul-int/2addr p2, p3

    .line 49
    add-int/2addr p2, p4

    .line 50
    int-to-float p0, p2

    .line 51
    invoke-virtual {p1, v1}, Landroid/view/View;->setX(F)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, p0}, Landroid/view/View;->setY(F)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final b(La/q9g;La/i9g;IILkotlin/jvm/functions/Function1;)V
    .locals 14

    .line 1
    move-object/from16 v3, p2

    .line 2
    .line 3
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v6, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->m:Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    invoke-virtual {v6, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, La/p9g;

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v1, v0, La/p9g;->b:La/i9g;

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    iget-object v1, v1, La/i9g;->b:Ljava/lang/String;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move-object v1, v7

    .line 26
    :goto_0
    iget-object v2, v3, La/i9g;->b:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    iget-object v1, v0, La/p9g;->b:La/i9g;

    .line 35
    .line 36
    iget-object v1, v1, La/i9g;->d:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v2, v3, La/i9g;->d:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    iget-object v1, v0, La/p9g;->a:La/q9g;

    .line 47
    .line 48
    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    const/4 v8, 0x0

    .line 56
    const/4 v9, 0x2

    .line 57
    if-nez v0, :cond_2

    .line 58
    .line 59
    invoke-virtual/range {p0 .. p1}, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->d(La/q9g;)La/m7g;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    iget-object v7, v1, La/m7g;->a:Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodEventItemView;

    .line 64
    .line 65
    invoke-virtual {p0, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 66
    .line 67
    .line 68
    move-object v0, p0

    .line 69
    move-object v2, p1

    .line 70
    move/from16 v4, p4

    .line 71
    .line 72
    move-object/from16 v5, p5

    .line 73
    .line 74
    invoke-virtual/range {v0 .. v5}, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->h(La/m7g;La/q9g;La/i9g;ILkotlin/jvm/functions/Function1;)V

    .line 75
    .line 76
    .line 77
    new-array p0, v9, [F

    .line 78
    .line 79
    fill-array-data p0, :array_0

    .line 80
    .line 81
    .line 82
    sget-object v0, Landroid/widget/FrameLayout;->ALPHA:Landroid/util/Property;

    .line 83
    .line 84
    invoke-static {v7, v0, p0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    new-instance v0, La/r9g;

    .line 92
    .line 93
    invoke-direct {v0, v1, v8}, La/r9g;-><init>(Ljava/lang/Object;B)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 97
    .line 98
    .line 99
    const-wide/16 v4, 0xc8

    .line 100
    .line 101
    invoke-virtual {p0, v4, v5}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Landroid/animation/ObjectAnimator;->start()V

    .line 105
    .line 106
    .line 107
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    new-instance v0, La/p9g;

    .line 112
    .line 113
    invoke-direct {v0, p1, v3, v1}, La/p9g;-><init>(La/q9g;La/i9g;La/m7g;)V

    .line 114
    .line 115
    .line 116
    invoke-interface {v6, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :cond_2
    iget-object v10, v0, La/p9g;->c:La/m7g;

    .line 121
    .line 122
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iget-object v11, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->n:Ljava/util/LinkedHashMap;

    .line 127
    .line 128
    invoke-virtual {v11, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    check-cast v0, La/m7g;

    .line 133
    .line 134
    if-eqz v0, :cond_4

    .line 135
    .line 136
    iget-object v4, v0, La/m7g;->a:Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodEventItemView;

    .line 137
    .line 138
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-direct {p0}, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->getEventViewHeight()I

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    iget-wide v12, p1, La/q9g;->b:J

    .line 146
    .line 147
    long-to-int v12, v12

    .line 148
    iget v13, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->c:I

    .line 149
    .line 150
    mul-int/2addr v13, v9

    .line 151
    sub-int/2addr v12, v13

    .line 152
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 153
    .line 154
    .line 155
    move-result-object v9

    .line 156
    if-eqz v9, :cond_3

    .line 157
    .line 158
    iput v12, v9, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 159
    .line 160
    iput v5, v9, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 161
    .line 162
    invoke-virtual {v4, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 163
    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_3
    const-string p0, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    .line 167
    .line 168
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    return-void

    .line 172
    :cond_4
    invoke-virtual/range {p0 .. p1}, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->d(La/q9g;)La/m7g;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    iget-object v4, v0, La/m7g;->a:Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodEventItemView;

    .line 177
    .line 178
    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 179
    .line 180
    .line 181
    :goto_1
    iget-object v9, v0, La/m7g;->a:Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodEventItemView;

    .line 182
    .line 183
    move-object v2, p1

    .line 184
    move/from16 v4, p4

    .line 185
    .line 186
    move-object/from16 v5, p5

    .line 187
    .line 188
    move-object v1, v0

    .line 189
    move-object v0, p0

    .line 190
    invoke-virtual/range {v0 .. v5}, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->h(La/m7g;La/q9g;La/i9g;ILkotlin/jvm/functions/Function1;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v9}, Landroid/view/View;->bringToFront()V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v9, v8}, Landroid/view/View;->setVisibility(I)V

    .line 197
    .line 198
    .line 199
    iget-object p0, v10, La/m7g;->a:Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodEventItemView;

    .line 200
    .line 201
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    const/16 v0, 0x8

    .line 205
    .line 206
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 207
    .line 208
    .line 209
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    new-instance v0, La/p9g;

    .line 214
    .line 215
    invoke-direct {v0, p1, v3, v1}, La/p9g;-><init>(La/q9g;La/i9g;La/m7g;)V

    .line 216
    .line 217
    .line 218
    invoke-interface {v6, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    invoke-interface {v11, p0, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    invoke-interface {v11, p0, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    return-void

    .line 236
    nop

    .line 237
    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final c(JJLjava/util/List;)La/q9g;
    .locals 9

    .line 1
    invoke-interface {p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_6

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 17
    .line 18
    iget-wide v3, v1, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;->a:J

    .line 19
    .line 20
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 31
    .line 32
    iget-wide v5, v1, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;->a:J

    .line 33
    .line 34
    cmp-long v1, v3, v5

    .line 35
    .line 36
    if-lez v1, :cond_0

    .line 37
    .line 38
    move-wide v3, v5

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-interface {p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_5

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 55
    .line 56
    iget-wide v1, v1, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;->b:J

    .line 57
    .line 58
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-eqz v5, :cond_3

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    check-cast v5, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 69
    .line 70
    iget-wide v5, v5, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;->b:J

    .line 71
    .line 72
    cmp-long v7, v1, v5

    .line 73
    .line 74
    if-gez v7, :cond_2

    .line 75
    .line 76
    move-wide v1, v5

    .line 77
    goto :goto_1

    .line 78
    :cond_3
    sub-long/2addr v3, p1

    .line 79
    sub-long/2addr v1, p1

    .line 80
    sub-long/2addr p3, p1

    .line 81
    invoke-interface {p5}, Ljava/util/List;->size()I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    iget p0, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->l:I

    .line 86
    .line 87
    int-to-double v5, p0

    .line 88
    long-to-double v7, p3

    .line 89
    div-double/2addr v5, v7

    .line 90
    long-to-double v3, v3

    .line 91
    mul-double/2addr v3, v5

    .line 92
    double-to-long v3, v3

    .line 93
    cmp-long p0, v1, p3

    .line 94
    .line 95
    if-lez p0, :cond_4

    .line 96
    .line 97
    move-wide v1, p3

    .line 98
    :cond_4
    long-to-double p2, v1

    .line 99
    mul-double/2addr v5, p2

    .line 100
    double-to-long p2, v5

    .line 101
    new-instance p0, La/q9g;

    .line 102
    .line 103
    long-to-float p4, v3

    .line 104
    sub-long/2addr p2, v3

    .line 105
    invoke-direct {p0, p4, p1, p2, p3}, La/q9g;-><init>(FIJ)V

    .line 106
    .line 107
    .line 108
    return-object p0

    .line 109
    :cond_5
    invoke-static {}, La/itt0;->a()V

    .line 110
    .line 111
    .line 112
    return-object v2

    .line 113
    :cond_6
    invoke-static {}, La/itt0;->a()V

    .line 114
    .line 115
    .line 116
    return-object v2
.end method

.method public final d(La/q9g;)La/m7g;
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const v1, 0x7f0d00ac

    .line 10
    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const v1, 0x7f0a0833

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Landroid/widget/ImageView;

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    const v1, 0x7f0a10f9

    .line 29
    .line 30
    .line 31
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Lorg/xplatform/cyber/calendar/impl/presentation/container/CalendarEventTextView;

    .line 36
    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    new-instance v1, La/m7g;

    .line 40
    .line 41
    check-cast v0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodEventItemView;

    .line 42
    .line 43
    invoke-direct {v1, v0, v2, v3}, La/m7g;-><init>(Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodEventItemView;Landroid/widget/ImageView;Lorg/xplatform/cyber/calendar/impl/presentation/container/CalendarEventTextView;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-direct {p0}, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->getEventViewHeight()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    iget-wide v3, p1, La/q9g;->b:J

    .line 54
    .line 55
    long-to-int p1, v3

    .line 56
    iget p0, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->c:I

    .line 57
    .line 58
    mul-int/lit8 p0, p0, 0x2

    .line 59
    .line 60
    sub-int/2addr p1, p0

    .line 61
    new-instance p0, Landroid/view/ViewGroup$LayoutParams;

    .line 62
    .line 63
    invoke-direct {p0, p1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 67
    .line 68
    .line 69
    return-object v1

    .line 70
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    const-string p1, "Missing required view with ID: "

    .line 79
    .line 80
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    const/4 p0, 0x0

    .line 88
    return-object p0
.end method

.method public final f(La/yag;La/t9g;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v7, v2, La/t9g;->a:Ljava/util/List;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iput-object v1, v0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->a:La/yag;

    .line 13
    .line 14
    iget-object v6, v0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->o:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    const/16 v13, 0x8

    .line 25
    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    check-cast v4, La/cag;

    .line 33
    .line 34
    iget-object v4, v4, La/cag;->a:Landroid/widget/LinearLayout;

    .line 35
    .line 36
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v4, v13}, Landroid/view/View;->setVisibility(I)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iget-object v14, v2, La/t9g;->b:Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_14

    .line 54
    .line 55
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    check-cast v3, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 60
    .line 61
    iget-wide v3, v3, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;->a:J

    .line 62
    .line 63
    :goto_1
    move-wide v8, v3

    .line 64
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_2

    .line 69
    .line 70
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    check-cast v3, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 75
    .line 76
    iget-wide v3, v3, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;->a:J

    .line 77
    .line 78
    cmp-long v5, v8, v3

    .line 79
    .line 80
    if-lez v5, :cond_1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-eqz v3, :cond_13

    .line 92
    .line 93
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    check-cast v3, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 98
    .line 99
    iget-wide v3, v3, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;->b:J

    .line 100
    .line 101
    :cond_3
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    if-eqz v5, :cond_4

    .line 106
    .line 107
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    check-cast v5, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 112
    .line 113
    iget-wide v10, v5, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;->b:J

    .line 114
    .line 115
    cmp-long v5, v3, v10

    .line 116
    .line 117
    if-gez v5, :cond_3

    .line 118
    .line 119
    move-wide v3, v10

    .line 120
    goto :goto_2

    .line 121
    :cond_4
    sget-object v2, La/yag;->d:La/yag;

    .line 122
    .line 123
    if-ne v1, v2, :cond_c

    .line 124
    .line 125
    new-instance v11, Ljava/util/ArrayList;

    .line 126
    .line 127
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 128
    .line 129
    .line 130
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object v12

    .line 134
    const/4 v2, 0x0

    .line 135
    :goto_3
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    if-eqz v5, :cond_b

    .line 140
    .line 141
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    check-cast v5, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 146
    .line 147
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 148
    .line 149
    .line 150
    move-result-object v16

    .line 151
    const/4 v13, 0x0

    .line 152
    :goto_4
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 153
    .line 154
    .line 155
    move-result v17

    .line 156
    if-eqz v17, :cond_6

    .line 157
    .line 158
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v17

    .line 162
    move-object/from16 v1, v17

    .line 163
    .line 164
    check-cast v1, La/i9g;

    .line 165
    .line 166
    move-object/from16 v25, v11

    .line 167
    .line 168
    iget-wide v10, v5, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;->a:J

    .line 169
    .line 170
    move-wide/from16 v26, v3

    .line 171
    .line 172
    move v4, v2

    .line 173
    iget-wide v2, v5, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;->b:J

    .line 174
    .line 175
    iget-object v1, v1, La/i9g;->e:Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;

    .line 176
    .line 177
    move-wide/from16 v19, v2

    .line 178
    .line 179
    iget-wide v2, v1, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;->a:J

    .line 180
    .line 181
    iget-wide v0, v1, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;->b:J

    .line 182
    .line 183
    move-wide/from16 v23, v0

    .line 184
    .line 185
    move-wide/from16 v21, v2

    .line 186
    .line 187
    move-wide/from16 v17, v10

    .line 188
    .line 189
    invoke-static/range {v17 .. v24}, La/fre0;->Z(JJJJ)Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-eqz v0, :cond_5

    .line 194
    .line 195
    add-int/lit8 v13, v13, 0x1

    .line 196
    .line 197
    :cond_5
    move-object/from16 v0, p0

    .line 198
    .line 199
    move v2, v4

    .line 200
    move-object/from16 v11, v25

    .line 201
    .line 202
    move-wide/from16 v3, v26

    .line 203
    .line 204
    goto :goto_4

    .line 205
    :cond_6
    move-wide/from16 v26, v3

    .line 206
    .line 207
    move-object/from16 v25, v11

    .line 208
    .line 209
    move v4, v2

    .line 210
    const/4 v10, 0x3

    .line 211
    if-le v13, v10, :cond_a

    .line 212
    .line 213
    move-object v0, v5

    .line 214
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    move-wide v1, v8

    .line 219
    const/4 v11, 0x0

    .line 220
    move-object v9, v0

    .line 221
    move v8, v4

    .line 222
    move-wide/from16 v3, v26

    .line 223
    .line 224
    move-object/from16 v0, p0

    .line 225
    .line 226
    invoke-virtual/range {v0 .. v5}, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->c(JJLjava/util/List;)La/q9g;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    iget-wide v3, v9, Lorg/xplatform/cyber/calendar/impl/presentation/common/model/CyberCalendarPeriodUiModel;->a:J

    .line 231
    .line 232
    invoke-static {v8, v6}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v16

    .line 236
    const/16 v17, 0x2

    .line 237
    .line 238
    move-object/from16 v15, v16

    .line 239
    .line 240
    check-cast v15, La/cag;

    .line 241
    .line 242
    iget-wide v10, v5, La/q9g;->b:J

    .line 243
    .line 244
    long-to-int v10, v10

    .line 245
    iget v11, v0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->c:I

    .line 246
    .line 247
    mul-int/lit8 v11, v11, 0x2

    .line 248
    .line 249
    sub-int/2addr v10, v11

    .line 250
    if-nez v15, :cond_8

    .line 251
    .line 252
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 253
    .line 254
    .line 255
    move-result-object v15

    .line 256
    invoke-static {v15}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 257
    .line 258
    .line 259
    move-result-object v15

    .line 260
    const v11, 0x7f0d00b2

    .line 261
    .line 262
    .line 263
    move-wide/from16 v19, v1

    .line 264
    .line 265
    const/4 v1, 0x0

    .line 266
    invoke-virtual {v15, v11, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    const v1, 0x7f0a1092

    .line 271
    .line 272
    .line 273
    invoke-static {v2, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 274
    .line 275
    .line 276
    move-result-object v11

    .line 277
    check-cast v11, Landroid/widget/TextView;

    .line 278
    .line 279
    if-eqz v11, :cond_7

    .line 280
    .line 281
    new-instance v15, La/cag;

    .line 282
    .line 283
    check-cast v2, Landroid/widget/LinearLayout;

    .line 284
    .line 285
    invoke-direct {v15, v2, v11}, La/cag;-><init>(Landroid/widget/LinearLayout;Landroid/widget/TextView;)V

    .line 286
    .line 287
    .line 288
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    .line 289
    .line 290
    const/4 v11, -0x2

    .line 291
    invoke-direct {v1, v10, v11}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v6, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    goto :goto_5

    .line 304
    :cond_7
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    const-string v1, "Missing required view with ID: "

    .line 313
    .line 314
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    return-void

    .line 322
    :cond_8
    move-wide/from16 v19, v1

    .line 323
    .line 324
    iget-object v1, v15, La/cag;->a:Landroid/widget/LinearLayout;

    .line 325
    .line 326
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    if-eqz v2, :cond_9

    .line 334
    .line 335
    iput v10, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 336
    .line 337
    const/4 v11, -0x2

    .line 338
    iput v11, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 339
    .line 340
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 341
    .line 342
    .line 343
    :goto_5
    iget-object v1, v15, La/cag;->a:Landroid/widget/LinearLayout;

    .line 344
    .line 345
    new-instance v2, La/l9g;

    .line 346
    .line 347
    move-object/from16 v10, p4

    .line 348
    .line 349
    invoke-direct {v2, v3, v4, v10}, La/l9g;-><init>(JLkotlin/jvm/functions/Function1;)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    add-int/lit8 v13, v13, -0x3

    .line 360
    .line 361
    invoke-static {v13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v3

    .line 365
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v3

    .line 369
    const v4, 0x7f13006c

    .line 370
    .line 371
    .line 372
    invoke-virtual {v2, v4, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    iget-object v3, v15, La/cag;->b:Landroid/widget/TextView;

    .line 380
    .line 381
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 382
    .line 383
    .line 384
    const/4 v11, 0x0

    .line 385
    invoke-virtual {v1, v11}, Landroid/view/View;->setVisibility(I)V

    .line 386
    .line 387
    .line 388
    const/4 v2, 0x1

    .line 389
    const/4 v3, 0x3

    .line 390
    invoke-virtual {v0, v1, v5, v3, v2}, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->a(Landroid/view/ViewGroup;La/q9g;IZ)V

    .line 391
    .line 392
    .line 393
    move-object/from16 v1, v25

    .line 394
    .line 395
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    add-int/lit8 v3, v8, 0x1

    .line 399
    .line 400
    goto :goto_6

    .line 401
    :cond_9
    const-string v0, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    .line 402
    .line 403
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 404
    .line 405
    .line 406
    return-void

    .line 407
    :cond_a
    const/4 v2, 0x1

    .line 408
    const/4 v11, 0x0

    .line 409
    const/16 v17, 0x2

    .line 410
    .line 411
    move-object/from16 v0, p0

    .line 412
    .line 413
    move-object/from16 v10, p4

    .line 414
    .line 415
    move-wide/from16 v19, v8

    .line 416
    .line 417
    move-object/from16 v1, v25

    .line 418
    .line 419
    move v8, v4

    .line 420
    move v3, v8

    .line 421
    :goto_6
    move-object v11, v1

    .line 422
    move v2, v3

    .line 423
    move-wide/from16 v8, v19

    .line 424
    .line 425
    move-wide/from16 v3, v26

    .line 426
    .line 427
    const/16 v13, 0x8

    .line 428
    .line 429
    goto/16 :goto_3

    .line 430
    .line 431
    :cond_b
    move-wide/from16 v26, v3

    .line 432
    .line 433
    move-wide/from16 v19, v8

    .line 434
    .line 435
    move-object v1, v11

    .line 436
    const/4 v2, 0x1

    .line 437
    const/16 v17, 0x2

    .line 438
    .line 439
    move-object v4, v1

    .line 440
    goto :goto_7

    .line 441
    :cond_c
    move-wide/from16 v26, v3

    .line 442
    .line 443
    move-wide/from16 v19, v8

    .line 444
    .line 445
    const/4 v2, 0x1

    .line 446
    const/16 v17, 0x2

    .line 447
    .line 448
    sget-object v11, La/iun;->a:La/iun;

    .line 449
    .line 450
    move-object v4, v11

    .line 451
    :goto_7
    new-instance v5, La/kie0;

    .line 452
    .line 453
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 454
    .line 455
    .line 456
    new-instance v3, Ljava/util/ArrayList;

    .line 457
    .line 458
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 459
    .line 460
    .line 461
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 462
    .line 463
    .line 464
    move-result v1

    .line 465
    div-int/lit8 v1, v1, 0x5

    .line 466
    .line 467
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 468
    .line 469
    .line 470
    move-result-object v6

    .line 471
    const/4 v13, 0x0

    .line 472
    if-lez v1, :cond_d

    .line 473
    .line 474
    goto :goto_8

    .line 475
    :cond_d
    move-object v6, v13

    .line 476
    :goto_8
    if-eqz v6, :cond_e

    .line 477
    .line 478
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 479
    .line 480
    .line 481
    move-result v10

    .line 482
    goto :goto_9

    .line 483
    :cond_e
    move v10, v2

    .line 484
    :goto_9
    invoke-static {v14, v10, v10}, Lkotlin/collections/CollectionsKt;->Q0(Ljava/lang/Iterable;II)Ljava/util/ArrayList;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    new-instance v0, La/s9g;

    .line 489
    .line 490
    const/4 v12, 0x0

    .line 491
    move-object/from16 v2, p0

    .line 492
    .line 493
    move-object/from16 v6, p3

    .line 494
    .line 495
    move-wide/from16 v8, v19

    .line 496
    .line 497
    move-wide/from16 v10, v26

    .line 498
    .line 499
    invoke-direct/range {v0 .. v12}, La/s9g;-><init>(Ljava/util/ArrayList;Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;Ljava/util/ArrayList;Ljava/util/List;La/kie0;Lkotlin/jvm/functions/Function1;Ljava/util/List;JJLa/yje;)V

    .line 500
    .line 501
    .line 502
    move-object v1, v0

    .line 503
    move-object v0, v2

    .line 504
    invoke-static {v0}, La/s7n0;->l(Landroid/view/View;)La/clz;

    .line 505
    .line 506
    .line 507
    move-result-object v2

    .line 508
    if-eqz v2, :cond_f

    .line 509
    .line 510
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 511
    .line 512
    .line 513
    move-result-object v2

    .line 514
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 515
    .line 516
    .line 517
    move-result-object v2

    .line 518
    sget-object v3, La/tvk;->a:La/rwj;

    .line 519
    .line 520
    sget-object v3, La/ys10;->a:La/vs10;

    .line 521
    .line 522
    new-instance v4, La/wbl0;

    .line 523
    .line 524
    const/16 v5, 0x11

    .line 525
    .line 526
    invoke-direct {v4, v1, v13, v5}, La/wbl0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 527
    .line 528
    .line 529
    move/from16 v1, v17

    .line 530
    .line 531
    invoke-static {v2, v3, v13, v4, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 532
    .line 533
    .line 534
    :cond_f
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 535
    .line 536
    .line 537
    move-result v1

    .line 538
    iget-object v2, v0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->m:Ljava/util/LinkedHashMap;

    .line 539
    .line 540
    invoke-interface {v2}, Ljava/util/Map;->size()I

    .line 541
    .line 542
    .line 543
    move-result v3

    .line 544
    if-le v3, v1, :cond_12

    .line 545
    .line 546
    invoke-interface {v2}, Ljava/util/Map;->size()I

    .line 547
    .line 548
    .line 549
    move-result v3

    .line 550
    if-gt v1, v3, :cond_12

    .line 551
    .line 552
    :goto_a
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 553
    .line 554
    .line 555
    move-result-object v4

    .line 556
    invoke-virtual {v2, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v4

    .line 560
    if-nez v4, :cond_10

    .line 561
    .line 562
    move-object v4, v13

    .line 563
    :cond_10
    check-cast v4, La/p9g;

    .line 564
    .line 565
    if-nez v4, :cond_11

    .line 566
    .line 567
    goto :goto_b

    .line 568
    :cond_11
    iget-object v4, v4, La/p9g;->c:La/m7g;

    .line 569
    .line 570
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 571
    .line 572
    .line 573
    move-result-object v5

    .line 574
    invoke-interface {v2, v5, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    iget-object v5, v0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->n:Ljava/util/LinkedHashMap;

    .line 578
    .line 579
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 580
    .line 581
    .line 582
    move-result-object v6

    .line 583
    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    iget-object v4, v4, La/m7g;->a:Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodEventItemView;

    .line 587
    .line 588
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 589
    .line 590
    .line 591
    const/16 v5, 0x8

    .line 592
    .line 593
    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    .line 594
    .line 595
    .line 596
    if-eq v1, v3, :cond_12

    .line 597
    .line 598
    add-int/lit8 v1, v1, 0x1

    .line 599
    .line 600
    goto :goto_a

    .line 601
    :cond_12
    :goto_b
    return-void

    .line 602
    :cond_13
    invoke-static {}, La/itt0;->a()V

    .line 603
    .line 604
    .line 605
    return-void

    .line 606
    :cond_14
    invoke-static {}, La/itt0;->a()V

    .line 607
    .line 608
    .line 609
    return-void
.end method

.method public final g(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->a:La/yag;

    .line 2
    .line 3
    sget-object v1, La/yag;->d:La/yag;

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->getMaxEventHeight()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    mul-int/2addr p1, v0

    .line 12
    iget v0, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->e:I

    .line 13
    .line 14
    add-int/2addr p1, v0

    .line 15
    invoke-virtual {p0, p1}, Landroid/view/View;->setMinimumHeight(I)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final h(La/m7g;La/q9g;La/i9g;ILkotlin/jvm/functions/Function1;)V
    .locals 9

    .line 1
    iget-object v0, p1, La/m7g;->a:Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodEventItemView;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v1, La/ymx;->h:La/ymx;

    .line 7
    .line 8
    new-instance v2, La/v4f;

    .line 9
    .line 10
    const/16 v3, 0xf

    .line 11
    .line 12
    invoke-direct {v2, p5, p3, v3}, La/v4f;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1, v2}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const/4 p5, 0x0

    .line 22
    invoke-virtual {p0, v0, p2, p4, p5}, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->a(Landroid/view/ViewGroup;La/q9g;IZ)V

    .line 23
    .line 24
    .line 25
    iget p2, p2, La/q9g;->c:I

    .line 26
    .line 27
    iget-object v1, p1, La/m7g;->b:Landroid/widget/ImageView;

    .line 28
    .line 29
    iget-object p1, p1, La/m7g;->c:Lorg/xplatform/cyber/calendar/impl/presentation/container/CalendarEventTextView;

    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 32
    .line 33
    .line 34
    move-result-object p4

    .line 35
    if-eqz p4, :cond_2

    .line 36
    .line 37
    invoke-direct {p0}, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->getImageSize()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    iput v2, p4, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 42
    .line 43
    invoke-direct {p0}, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->getImageSize()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    iput v2, p4, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 48
    .line 49
    invoke-virtual {v1, p4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 50
    .line 51
    .line 52
    sget-object p4, La/u0d;->a:Ljava/util/List;

    .line 53
    .line 54
    iget-object v2, p3, La/i9g;->b:Ljava/lang/String;

    .line 55
    .line 56
    iget v3, p3, La/i9g;->c:I

    .line 57
    .line 58
    const/4 v7, 0x0

    .line 59
    const/16 v8, 0x1fc

    .line 60
    .line 61
    const/4 v4, 0x0

    .line 62
    const/4 v5, 0x0

    .line 63
    const/4 v6, 0x0

    .line 64
    invoke-static/range {v1 .. v8}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 65
    .line 66
    .line 67
    invoke-direct {p0}, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 68
    .line 69
    .line 70
    move-result-object p4

    .line 71
    invoke-virtual {v0, p4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 72
    .line 73
    .line 74
    iget-object p4, p0, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->a:La/yag;

    .line 75
    .line 76
    sget-object v0, La/yag;->b:La/yag;

    .line 77
    .line 78
    if-ne p4, v0, :cond_0

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    const/4 p4, 0x1

    .line 82
    if-le p2, p4, :cond_1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    const/16 p5, 0x8

    .line 86
    .line 87
    :goto_0
    invoke-virtual {p1, p5}, Landroid/view/View;->setVisibility(I)V

    .line 88
    .line 89
    .line 90
    iget-object p2, p3, La/i9g;->d:Ljava/lang/String;

    .line 91
    .line 92
    invoke-direct {p0}, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->getTextSize()F

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    iput-object p2, p1, Lorg/xplatform/cyber/calendar/impl/presentation/container/CalendarEventTextView;->a:Ljava/lang/String;

    .line 97
    .line 98
    iget-object p2, p1, Lorg/xplatform/cyber/calendar/impl/presentation/container/CalendarEventTextView;->c:Landroid/text/TextPaint;

    .line 99
    .line 100
    invoke-virtual {p2, p0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :cond_2
    const-string p0, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    .line 108
    .line 109
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p0, 0x0

    return p0
.end method
