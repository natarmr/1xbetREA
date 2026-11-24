.class public final La/iwr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Landroid/view/ViewGroup;

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Landroid/view/ViewGroup;IIB)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/iwr0;->a:B

    iput-object p1, p0, La/iwr0;->b:Landroid/view/View;

    iput-object p2, p0, La/iwr0;->c:Landroid/view/ViewGroup;

    iput p3, p0, La/iwr0;->d:I

    iput p4, p0, La/iwr0;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget-byte v0, p0, La/iwr0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget v2, p0, La/iwr0;->e:I

    .line 5
    .line 6
    iget v3, p0, La/iwr0;->d:I

    .line 7
    .line 8
    iget-object v4, p0, La/iwr0;->c:Landroid/view/ViewGroup;

    .line 9
    .line 10
    iget-object p0, p0, La/iwr0;->b:Landroid/view/View;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    new-instance v0, Landroid/graphics/Rect;

    .line 16
    .line 17
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v4, p0, v0}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 24
    .line 25
    .line 26
    iget v5, v0, Landroid/graphics/Rect;->left:I

    .line 27
    .line 28
    sub-int/2addr v5, v3

    .line 29
    iput v5, v0, Landroid/graphics/Rect;->left:I

    .line 30
    .line 31
    iget v5, v0, Landroid/graphics/Rect;->right:I

    .line 32
    .line 33
    add-int/2addr v5, v3

    .line 34
    iput v5, v0, Landroid/graphics/Rect;->right:I

    .line 35
    .line 36
    iget v3, v0, Landroid/graphics/Rect;->top:I

    .line 37
    .line 38
    sub-int/2addr v3, v2

    .line 39
    iput v3, v0, Landroid/graphics/Rect;->top:I

    .line 40
    .line 41
    iget v3, v0, Landroid/graphics/Rect;->bottom:I

    .line 42
    .line 43
    add-int/2addr v3, v2

    .line 44
    iput v3, v0, Landroid/graphics/Rect;->bottom:I

    .line 45
    .line 46
    invoke-virtual {v4}, Landroid/view/View;->getTouchDelegate()Landroid/view/TouchDelegate;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    instance-of v3, v2, La/lld;

    .line 51
    .line 52
    if-eqz v3, :cond_0

    .line 53
    .line 54
    move-object v1, v2

    .line 55
    check-cast v1, La/lld;

    .line 56
    .line 57
    :cond_0
    if-nez v1, :cond_1

    .line 58
    .line 59
    new-instance v1, La/lld;

    .line 60
    .line 61
    invoke-direct {v1, v4}, La/lld;-><init>(Landroid/view/View;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4, v1}, Landroid/view/View;->setTouchDelegate(Landroid/view/TouchDelegate;)V

    .line 65
    .line 66
    .line 67
    :cond_1
    new-instance v2, Landroid/view/TouchDelegate;

    .line 68
    .line 69
    invoke-direct {v2, v0, p0}, Landroid/view/TouchDelegate;-><init>(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 70
    .line 71
    .line 72
    iget-object v0, v1, La/lld;->a:Ljava/util/LinkedHashMap;

    .line 73
    .line 74
    invoke-interface {v0, p0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :pswitch_0
    new-instance v0, Landroid/graphics/Rect;

    .line 79
    .line 80
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v0}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4, p0, v0}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    invoke-virtual {v5, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-virtual {v5, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    iget v5, v0, Landroid/graphics/Rect;->right:I

    .line 106
    .line 107
    iget v6, v0, Landroid/graphics/Rect;->left:I

    .line 108
    .line 109
    sub-int v7, v5, v6

    .line 110
    .line 111
    iget v8, v0, Landroid/graphics/Rect;->bottom:I

    .line 112
    .line 113
    iget v9, v0, Landroid/graphics/Rect;->top:I

    .line 114
    .line 115
    sub-int v10, v8, v9

    .line 116
    .line 117
    if-le v2, v10, :cond_2

    .line 118
    .line 119
    sub-int/2addr v2, v10

    .line 120
    div-int/lit8 v10, v2, 0x2

    .line 121
    .line 122
    sub-int/2addr v9, v10

    .line 123
    iput v9, v0, Landroid/graphics/Rect;->top:I

    .line 124
    .line 125
    sub-int/2addr v2, v10

    .line 126
    add-int/2addr v2, v8

    .line 127
    iput v2, v0, Landroid/graphics/Rect;->bottom:I

    .line 128
    .line 129
    :cond_2
    if-le v3, v7, :cond_3

    .line 130
    .line 131
    sub-int/2addr v3, v7

    .line 132
    div-int/lit8 v2, v3, 0x2

    .line 133
    .line 134
    sub-int/2addr v6, v2

    .line 135
    iput v6, v0, Landroid/graphics/Rect;->left:I

    .line 136
    .line 137
    sub-int/2addr v3, v2

    .line 138
    add-int/2addr v3, v5

    .line 139
    iput v3, v0, Landroid/graphics/Rect;->right:I

    .line 140
    .line 141
    :cond_3
    invoke-virtual {v4}, Landroid/view/View;->getTouchDelegate()Landroid/view/TouchDelegate;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    instance-of v3, v2, La/lld;

    .line 146
    .line 147
    if-eqz v3, :cond_4

    .line 148
    .line 149
    move-object v1, v2

    .line 150
    check-cast v1, La/lld;

    .line 151
    .line 152
    :cond_4
    if-nez v1, :cond_5

    .line 153
    .line 154
    new-instance v1, La/lld;

    .line 155
    .line 156
    invoke-direct {v1, v4}, La/lld;-><init>(Landroid/view/View;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v4, v1}, Landroid/view/View;->setTouchDelegate(Landroid/view/TouchDelegate;)V

    .line 160
    .line 161
    .line 162
    :cond_5
    new-instance v2, Landroid/view/TouchDelegate;

    .line 163
    .line 164
    invoke-direct {v2, v0, p0}, Landroid/view/TouchDelegate;-><init>(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 165
    .line 166
    .line 167
    iget-object v0, v1, La/lld;->a:Ljava/util/LinkedHashMap;

    .line 168
    .line 169
    invoke-interface {v0, p0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
