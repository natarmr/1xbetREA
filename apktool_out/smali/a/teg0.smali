.class public final La/teg0;
.super Landroid/view/OrientationEventListener;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/sbx0;Landroid/content/Context;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/teg0;->a:B

    .line 3
    .line 4
    iput-object p1, p0, La/teg0;->b:Ljava/lang/Object;

    .line 5
    .line 6
    const/4 p1, 0x3

    .line 7
    invoke-direct {p0, p2, p1}, Landroid/view/OrientationEventListener;-><init>(Landroid/content/Context;I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;La/veg0;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/teg0;->a:B

    iput-object p2, p0, La/teg0;->b:Ljava/lang/Object;

    .line 11
    invoke-direct {p0, p1}, Landroid/view/OrientationEventListener;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final onOrientationChanged(I)V
    .locals 7

    .line 1
    iget-byte v0, p0, La/teg0;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, -0x1

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_6

    .line 10
    .line 11
    :cond_0
    iget-object v1, p0, La/teg0;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, La/veg0;

    .line 14
    .line 15
    iget v2, v1, La/veg0;->d:I

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    const/4 v4, 0x2

    .line 19
    const/4 v5, 0x3

    .line 20
    const/4 v6, 0x0

    .line 21
    if-ne v2, v0, :cond_5

    .line 22
    .line 23
    const/16 v0, 0x2d

    .line 24
    .line 25
    if-ltz p1, :cond_2

    .line 26
    .line 27
    if-ge p1, v0, :cond_2

    .line 28
    .line 29
    :cond_1
    :goto_0
    move v3, v6

    .line 30
    goto :goto_4

    .line 31
    :cond_2
    const/16 v1, 0x87

    .line 32
    .line 33
    if-gt v0, p1, :cond_3

    .line 34
    .line 35
    if-ge p1, v1, :cond_3

    .line 36
    .line 37
    :goto_1
    move v3, v5

    .line 38
    goto :goto_4

    .line 39
    :cond_3
    const/16 v0, 0xe1

    .line 40
    .line 41
    if-gt v1, p1, :cond_4

    .line 42
    .line 43
    if-ge p1, v0, :cond_4

    .line 44
    .line 45
    :goto_2
    move v3, v4

    .line 46
    goto :goto_4

    .line 47
    :cond_4
    if-gt v0, p1, :cond_1

    .line 48
    .line 49
    const/16 v0, 0x13b

    .line 50
    .line 51
    if-ge p1, v0, :cond_1

    .line 52
    .line 53
    goto :goto_4

    .line 54
    :cond_5
    if-ltz p1, :cond_6

    .line 55
    .line 56
    const/16 v0, 0x28

    .line 57
    .line 58
    if-ge p1, v0, :cond_6

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_6
    const/16 v0, 0x140

    .line 62
    .line 63
    if-gt v0, p1, :cond_7

    .line 64
    .line 65
    const/16 v0, 0x168

    .line 66
    .line 67
    if-ge p1, v0, :cond_7

    .line 68
    .line 69
    :goto_3
    goto :goto_0

    .line 70
    :cond_7
    const/16 v0, 0x32

    .line 71
    .line 72
    if-gt v0, p1, :cond_8

    .line 73
    .line 74
    const/16 v0, 0x82

    .line 75
    .line 76
    if-ge p1, v0, :cond_8

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_8
    const/16 v0, 0x8c

    .line 80
    .line 81
    if-gt v0, p1, :cond_9

    .line 82
    .line 83
    const/16 v0, 0xdc

    .line 84
    .line 85
    if-ge p1, v0, :cond_9

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_9
    const/16 v0, 0xe6

    .line 89
    .line 90
    if-gt v0, p1, :cond_a

    .line 91
    .line 92
    const/16 v0, 0x136

    .line 93
    .line 94
    if-ge p1, v0, :cond_a

    .line 95
    .line 96
    goto :goto_4

    .line 97
    :cond_a
    iget v3, v1, La/veg0;->d:I

    .line 98
    .line 99
    :goto_4
    iget-object p0, p0, La/teg0;->b:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p0, La/veg0;

    .line 102
    .line 103
    iget p1, p0, La/veg0;->d:I

    .line 104
    .line 105
    if-eq p1, v3, :cond_b

    .line 106
    .line 107
    iput v3, p0, La/veg0;->d:I

    .line 108
    .line 109
    iget-object p1, p0, La/veg0;->a:Ljava/lang/Object;

    .line 110
    .line 111
    monitor-enter p1

    .line 112
    :try_start_0
    iget-object p0, p0, La/veg0;->c:Ljava/util/LinkedHashMap;

    .line 113
    .line 114
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    check-cast p0, Ljava/lang/Iterable;

    .line 119
    .line 120
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    monitor-exit p1

    .line 125
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result p1

    .line 133
    if-eqz p1, :cond_b

    .line 134
    .line 135
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    check-cast p1, La/ueg0;

    .line 140
    .line 141
    invoke-virtual {p1, v3}, La/ueg0;->a(I)V

    .line 142
    .line 143
    .line 144
    goto :goto_5

    .line 145
    :catchall_0
    move-exception p0

    .line 146
    monitor-exit p1

    .line 147
    throw p0

    .line 148
    :cond_b
    :goto_6
    return-void

    .line 149
    :pswitch_0
    iget-object p0, p0, La/teg0;->b:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast p0, La/sbx0;

    .line 152
    .line 153
    iget-object p1, p0, La/sbx0;->c:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast p1, Landroid/view/WindowManager;

    .line 156
    .line 157
    iget-object v0, p0, La/sbx0;->e:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v0, La/yk50;

    .line 160
    .line 161
    if-eqz p1, :cond_c

    .line 162
    .line 163
    if-eqz v0, :cond_c

    .line 164
    .line 165
    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-virtual {p1}, Landroid/view/Display;->getRotation()I

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    iget v1, p0, La/sbx0;->b:I

    .line 174
    .line 175
    if-eq p1, v1, :cond_c

    .line 176
    .line 177
    iput p1, p0, La/sbx0;->b:I

    .line 178
    .line 179
    iget-object p0, v0, La/yk50;->b:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast p0, Lcom/journeyapps/barcodescanner/BarcodeView;

    .line 182
    .line 183
    iget-object p0, p0, La/d2a;->c:Landroid/os/Handler;

    .line 184
    .line 185
    new-instance p1, La/w1;

    .line 186
    .line 187
    const/16 v1, 0x17

    .line 188
    .line 189
    invoke-direct {p1, v0, v1}, La/w1;-><init>(Ljava/lang/Object;B)V

    .line 190
    .line 191
    .line 192
    const-wide/16 v0, 0xfa

    .line 193
    .line 194
    invoke-virtual {p0, p1, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 195
    .line 196
    .line 197
    :cond_c
    return-void

    .line 198
    nop

    .line 199
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
