.class public final synthetic La/n23;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Runnable;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/n23;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/n23;->b:I

    iput-object p2, p0, La/n23;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/material/datepicker/i;Lcom/google/android/material/datepicker/MaterialCalendarGridView;I)V
    .locals 0

    .line 1
    const/16 p1, 0xb

    iput-byte p1, p0, La/n23;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/n23;->c:Ljava/lang/Object;

    iput p3, p0, La/n23;->b:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;IB)V
    .locals 0

    .line 3
    iput-byte p3, p0, La/n23;->a:B

    iput-object p1, p0, La/n23;->c:Ljava/lang/Object;

    iput p2, p0, La/n23;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-byte v0, p0, La/n23;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget v2, p0, La/n23;->b:I

    .line 5
    .line 6
    iget-object p0, p0, La/n23;->c:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, La/x3w0;

    .line 12
    .line 13
    iget-object p0, p0, La/x3w0;->c:La/ca6;

    .line 14
    .line 15
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p0, v0}, La/ca6;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    check-cast p0, Landroidx/viewpager2/widget/ViewPager2;

    .line 24
    .line 25
    sget-object v0, La/jho0;->R1:La/y2m0;

    .line 26
    .line 27
    invoke-virtual {p0, v2}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(I)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_1
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 32
    .line 33
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->B0(I)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_2
    check-cast p0, Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->hasFocus()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->a()Lcom/google/android/material/datepicker/h;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const/4 v3, -0x1

    .line 52
    if-ne v2, v1, :cond_0

    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/google/android/material/datepicker/h;->f()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    add-int/2addr v2, v1

    .line 59
    invoke-virtual {v0, v2}, Lcom/google/android/material/datepicker/h;->b(I)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-ne v1, v3, :cond_1

    .line 64
    .line 65
    invoke-virtual {v0}, Lcom/google/android/material/datepicker/h;->f()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    goto :goto_0

    .line 70
    :cond_0
    invoke-virtual {v0}, Lcom/google/android/material/datepicker/h;->c()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    sub-int/2addr v2, v1

    .line 75
    invoke-virtual {v0, v2}, Lcom/google/android/material/datepicker/h;->a(I)I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-ne v1, v3, :cond_1

    .line 80
    .line 81
    invoke-virtual {v0}, Lcom/google/android/material/datepicker/h;->c()I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    :cond_1
    :goto_0
    invoke-virtual {p0, v1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->setSelection(I)V

    .line 86
    .line 87
    .line 88
    :cond_2
    return-void

    .line 89
    :pswitch_3
    check-cast p0, Lcom/google/android/material/button/MaterialButton;

    .line 90
    .line 91
    sget-object v0, Lcom/google/android/material/button/MaterialButton;->r1:[I

    .line 92
    .line 93
    invoke-virtual {p0, v2}, Lcom/google/android/material/button/MaterialButton;->setIconSize(I)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :pswitch_4
    check-cast p0, La/a720;

    .line 98
    .line 99
    iget-object p0, p0, La/a720;->u2:Landroidx/viewpager2/widget/ViewPager2;

    .line 100
    .line 101
    if-eqz p0, :cond_3

    .line 102
    .line 103
    invoke-virtual {p0, v2}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(I)V

    .line 104
    .line 105
    .line 106
    :cond_3
    return-void

    .line 107
    :pswitch_5
    check-cast p0, Lorg/xplatform/cyber/game/universal/impl/presentation/killerjoker/KillerJokerView;

    .line 108
    .line 109
    invoke-static {p0, v2}, Lorg/xplatform/cyber/game/universal/impl/presentation/killerjoker/KillerJokerView;->f(Lorg/xplatform/cyber/game/universal/impl/presentation/killerjoker/KillerJokerView;I)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :pswitch_6
    check-cast p0, Lorg/xplatform/uikit/components/page_control/DsPageControl;

    .line 114
    .line 115
    sget v0, Lorg/xplatform/uikit/components/page_control/DsPageControl;->y2:I

    .line 116
    .line 117
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->B0(I)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :pswitch_7
    check-cast p0, La/lyl;

    .line 122
    .line 123
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->B0(I)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :pswitch_8
    check-cast p0, La/wx9;

    .line 128
    .line 129
    iget-object p0, p0, La/wx9;->b:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast p0, La/esg0;

    .line 132
    .line 133
    iget-object p0, p0, La/esg0;->a:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast p0, La/dzb0;

    .line 136
    .line 137
    if-eqz p0, :cond_4

    .line 138
    .line 139
    invoke-virtual {p0, v2}, La/dzb0;->a(I)V

    .line 140
    .line 141
    .line 142
    :cond_4
    return-void

    .line 143
    :pswitch_9
    check-cast p0, La/vx9;

    .line 144
    .line 145
    invoke-virtual {p0, v2}, La/vx9;->a(I)V

    .line 146
    .line 147
    .line 148
    return-void

    .line 149
    :pswitch_a
    check-cast p0, La/xex;

    .line 150
    .line 151
    iget-object p0, p0, La/xex;->b:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast p0, La/qlo;

    .line 154
    .line 155
    sget-object v0, La/vtt0;->a:Ljava/lang/String;

    .line 156
    .line 157
    iget-object p0, p0, La/qlo;->a:La/ulo;

    .line 158
    .line 159
    iget-object p0, p0, La/ulo;->C:La/fp;

    .line 160
    .line 161
    new-instance v0, La/plo;

    .line 162
    .line 163
    invoke-direct {v0, v2}, La/plo;-><init>(I)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    iget-object v4, p0, La/fp;->d:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast v4, La/q9o0;

    .line 176
    .line 177
    iget-object v4, v4, La/q9o0;->a:Landroid/os/Handler;

    .line 178
    .line 179
    invoke-virtual {v4}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    if-ne v3, v4, :cond_5

    .line 184
    .line 185
    move v3, v1

    .line 186
    goto :goto_1

    .line 187
    :cond_5
    const/4 v3, 0x0

    .line 188
    :goto_1
    invoke-static {v3}, La/x0x;->K(Z)V

    .line 189
    .line 190
    .line 191
    iget v3, p0, La/fp;->b:I

    .line 192
    .line 193
    add-int/2addr v3, v1

    .line 194
    iput v3, p0, La/fp;->b:I

    .line 195
    .line 196
    new-instance v1, La/fy2;

    .line 197
    .line 198
    const/16 v3, 0xb

    .line 199
    .line 200
    invoke-direct {v1, p0, v0, v3}, La/fy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0, v1}, La/fp;->M(Ljava/lang/Runnable;)V

    .line 204
    .line 205
    .line 206
    iget-object v0, p0, La/fp;->f:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast v0, Ljava/lang/Integer;

    .line 209
    .line 210
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-virtual {p0, v0}, La/fp;->W(Ljava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    return-void

    .line 218
    :pswitch_b
    check-cast p0, La/z24;

    .line 219
    .line 220
    iget-object p0, p0, La/z24;->b:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    .line 221
    .line 222
    invoke-interface {p0, v2}, Landroid/media/AudioManager$OnAudioFocusChangeListener;->onAudioFocusChange(I)V

    .line 223
    .line 224
    .line 225
    return-void

    .line 226
    :pswitch_c
    check-cast p0, Ljava/util/function/IntConsumer;

    .line 227
    .line 228
    invoke-interface {p0, v2}, Ljava/util/function/IntConsumer;->accept(I)V

    .line 229
    .line 230
    .line 231
    return-void

    .line 232
    :pswitch_d
    check-cast p0, Ljava/lang/Runnable;

    .line 233
    .line 234
    invoke-static {v2}, Landroid/os/Process;->setThreadPriority(I)V

    .line 235
    .line 236
    .line 237
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 238
    .line 239
    .line 240
    return-void

    .line 241
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
