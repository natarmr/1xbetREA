.class public final synthetic La/rly;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:La/pz40;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;La/pz40;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/rly;->a:B

    iput-object p1, p0, La/rly;->b:Landroid/view/View;

    iput-object p2, p0, La/rly;->c:La/pz40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/rly;->a:B

    .line 2
    .line 3
    const/16 v1, 0x30

    .line 4
    .line 5
    const/16 v2, 0x10

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    iget-object v4, p0, La/rly;->c:La/pz40;

    .line 9
    .line 10
    iget-object v5, p0, La/rly;->b:Landroid/view/View;

    .line 11
    .line 12
    check-cast p1, La/lwk;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v5}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v10

    .line 24
    new-instance v8, La/hie0;

    .line 25
    .line 26
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    new-instance v9, La/jie0;

    .line 30
    .line 31
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    new-instance v6, La/mr3;

    .line 35
    .line 36
    const/4 v7, 0x2

    .line 37
    iget-object v11, p0, La/rly;->c:La/pz40;

    .line 38
    .line 39
    invoke-direct/range {v6 .. v11}, La/mr3;-><init>(BLa/hie0;La/jie0;Landroid/view/View;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move-object p0, v6

    .line 43
    new-instance v6, La/tr3;

    .line 44
    .line 45
    const/4 v7, 0x1

    .line 46
    invoke-direct/range {v6 .. v11}, La/tr3;-><init>(BLa/hie0;La/jie0;Landroid/view/View;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v10}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 54
    .line 55
    .line 56
    sget-object v0, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 57
    .line 58
    invoke-static {v10, v6}, La/div0;->a(Landroid/view/View;La/oyc;)V

    .line 59
    .line 60
    .line 61
    new-instance v0, La/u43;

    .line 62
    .line 63
    const/16 v1, 0xb

    .line 64
    .line 65
    invoke-direct {v0, p1, p0, v10, v1}, La/u43;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 66
    .line 67
    .line 68
    return-object v0

    .line 69
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    new-instance p0, La/mie0;

    .line 73
    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    instance-of v0, p1, La/agd;

    .line 82
    .line 83
    if-eqz v0, :cond_0

    .line 84
    .line 85
    move-object v3, p1

    .line 86
    check-cast v3, La/agd;

    .line 87
    .line 88
    :cond_0
    iput-object v3, p0, La/mie0;->a:Ljava/lang/Object;

    .line 89
    .line 90
    if-eqz v3, :cond_2

    .line 91
    .line 92
    invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->softInputMode:I

    .line 101
    .line 102
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-interface {v4, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 110
    .line 111
    const/16 v3, 0x1e

    .line 112
    .line 113
    if-ge v0, v3, :cond_1

    .line 114
    .line 115
    move v1, v2

    .line 116
    :cond_1
    invoke-virtual {p1, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 117
    .line 118
    .line 119
    :cond_2
    new-instance p1, La/as10;

    .line 120
    .line 121
    const/4 v0, 0x1

    .line 122
    invoke-direct {p1, p0, v4, v0}, La/as10;-><init>(La/mie0;La/pz40;B)V

    .line 123
    .line 124
    .line 125
    return-object p1

    .line 126
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    new-instance p0, La/mie0;

    .line 130
    .line 131
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    instance-of v0, p1, La/agd;

    .line 139
    .line 140
    if-eqz v0, :cond_3

    .line 141
    .line 142
    move-object v3, p1

    .line 143
    check-cast v3, La/agd;

    .line 144
    .line 145
    :cond_3
    iput-object v3, p0, La/mie0;->a:Ljava/lang/Object;

    .line 146
    .line 147
    if-eqz v3, :cond_5

    .line 148
    .line 149
    invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-virtual {p1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->softInputMode:I

    .line 158
    .line 159
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-interface {v4, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    invoke-static {}, La/a8k0;->A()Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-eqz v0, :cond_4

    .line 171
    .line 172
    move v1, v2

    .line 173
    :cond_4
    invoke-virtual {p1, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 174
    .line 175
    .line 176
    :cond_5
    new-instance p1, La/as10;

    .line 177
    .line 178
    const/4 v0, 0x0

    .line 179
    invoke-direct {p1, p0, v4, v0}, La/as10;-><init>(La/mie0;La/pz40;B)V

    .line 180
    .line 181
    .line 182
    return-object p1

    .line 183
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v5}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 191
    .line 192
    .line 193
    move-result-object p1

    .line 194
    new-instance v0, La/thq;

    .line 195
    .line 196
    const/4 v1, 0x2

    .line 197
    invoke-direct {v0, v1, p0, v4}, La/thq;-><init>(BLandroid/view/View;Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 201
    .line 202
    .line 203
    new-instance p0, La/pr0;

    .line 204
    .line 205
    const/16 v1, 0xc

    .line 206
    .line 207
    invoke-direct {p0, p1, v0, v1}, La/pr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 208
    .line 209
    .line 210
    return-object p0

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
