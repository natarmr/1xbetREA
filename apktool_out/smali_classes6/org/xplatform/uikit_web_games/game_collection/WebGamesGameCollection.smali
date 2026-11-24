.class public final Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;
.super Lorg/xplatform/uikit/components/views/OptimizedScrollRecyclerView;
.source "SourceFile"


# static fields
.field public static final synthetic o2:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 160
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 159
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    and-int/lit8 v3, p3, 0x2

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v4

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object/from16 v3, p2

    .line 14
    .line 15
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const v5, 0x7f0403f5

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v1, v3, v5}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    const v7, 0x7f07072d

    .line 29
    .line 30
    .line 31
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    sget-object v8, La/dqd0;->a:[I

    .line 36
    .line 37
    const/4 v9, 0x0

    .line 38
    invoke-virtual {v1, v3, v8, v5, v9}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-virtual {v3, v2, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    sget-object v5, La/g5s;->l:La/c0o;

    .line 47
    .line 48
    invoke-virtual {v5, v2}, La/c0o;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    check-cast v2, La/g5s;

    .line 53
    .line 54
    const/4 v5, 0x3

    .line 55
    invoke-virtual {v3, v5, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    const/4 v10, 0x4

    .line 60
    invoke-virtual {v3, v10, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 61
    .line 62
    .line 63
    move-result v10

    .line 64
    invoke-virtual {v3, v9, v9}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 65
    .line 66
    .line 67
    move-result v11

    .line 68
    const/4 v12, 0x1

    .line 69
    invoke-virtual {v3, v12, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 70
    .line 71
    .line 72
    move-result v15

    .line 73
    new-instance v6, La/o4s;

    .line 74
    .line 75
    if-nez v8, :cond_2

    .line 76
    .line 77
    if-nez v10, :cond_2

    .line 78
    .line 79
    :cond_1
    move v8, v9

    .line 80
    goto :goto_1

    .line 81
    :cond_2
    if-eqz v8, :cond_1

    .line 82
    .line 83
    :goto_1
    if-nez v10, :cond_3

    .line 84
    .line 85
    const v10, 0x7f0807c2

    .line 86
    .line 87
    .line 88
    :cond_3
    invoke-static {v1, v2, v8, v10}, La/lmc;->G(Landroid/content/Context;La/g5s;II)La/o0x;

    .line 89
    .line 90
    .line 91
    move-result-object v8

    .line 92
    invoke-direct {v6, v2, v8, v4}, La/o4s;-><init>(La/g5s;La/o0x;La/xdr;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v6}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 96
    .line 97
    .line 98
    sget-object v4, La/t2v0;->a:[I

    .line 99
    .line 100
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    aget v2, v4, v2

    .line 105
    .line 106
    if-ne v2, v12, :cond_4

    .line 107
    .line 108
    new-instance v2, Lorg/xplatform/uikit/utils/recycerview/CenterSingleLayoutManager;

    .line 109
    .line 110
    invoke-direct {v2, v1, v9, v9}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_4
    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 115
    .line 116
    invoke-direct {v2, v1, v9, v9}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    .line 117
    .line 118
    .line 119
    :goto_2
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v12}, Landroid/view/View;->setClipToOutline(Z)V

    .line 123
    .line 124
    .line 125
    new-instance v1, La/pyl0;

    .line 126
    .line 127
    invoke-direct {v1, v11, v5}, La/pyl0;-><init>(IB)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v1}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 134
    .line 135
    .line 136
    new-instance v13, La/pmk0;

    .line 137
    .line 138
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-virtual {v1, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 143
    .line 144
    .line 145
    move-result v14

    .line 146
    const/16 v17, 0x0

    .line 147
    .line 148
    const/16 v18, 0x14

    .line 149
    .line 150
    const/16 v16, 0x0

    .line 151
    .line 152
    invoke-direct/range {v13 .. v18}, La/pmk0;-><init>(IIIII)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, v13}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 156
    .line 157
    .line 158
    return-void
.end method


# virtual methods
.method public final setOnItemClickListener(La/xdr;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/xdr;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    check-cast p0, La/o4s;

    .line 12
    .line 13
    iput-object p1, p0, La/o4s;->h:La/xdr;

    .line 14
    .line 15
    return-void
.end method
