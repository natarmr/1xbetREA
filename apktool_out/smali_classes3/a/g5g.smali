.class public final La/g5g;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/g5g;->a:B

    iput-object p1, p0, La/g5g;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-byte v0, p0, La/g5g;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onDoubleTap(Landroid/view/MotionEvent;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 1

    .line 1
    iget-byte v0, p0, La/g5g;->a:B

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onDown(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0

    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x1

    return p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 7

    .line 1
    iget-byte v0, p0, La/g5g;->a:B

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const/high16 v2, 0x43960000    # 300.0f

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v5, p0, La/g5g;->b:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v6, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    :goto_0
    sub-float/2addr p0, p1

    .line 38
    cmpl-float p1, p4, v6

    .line 39
    .line 40
    if-lez p1, :cond_1

    .line 41
    .line 42
    const/high16 p1, 0x44480000    # 800.0f

    .line 43
    .line 44
    cmpl-float p1, p4, p1

    .line 45
    .line 46
    if-lez p1, :cond_1

    .line 47
    .line 48
    const/high16 p1, 0x42480000    # 50.0f

    .line 49
    .line 50
    cmpl-float p0, p0, p1

    .line 51
    .line 52
    if-lez p0, :cond_1

    .line 53
    .line 54
    check-cast v5, La/rrm;

    .line 55
    .line 56
    const/4 p0, 0x3

    .line 57
    invoke-virtual {v5, p0}, La/g46;->a(I)V

    .line 58
    .line 59
    .line 60
    move v3, v4

    .line 61
    :cond_1
    return v3

    .line 62
    :pswitch_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-eqz p1, :cond_2

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    goto :goto_1

    .line 76
    :cond_2
    move p1, v6

    .line 77
    :goto_1
    sub-float/2addr p0, p1

    .line 78
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    cmpl-float p1, p1, v2

    .line 83
    .line 84
    if-lez p1, :cond_4

    .line 85
    .line 86
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    cmpl-float p1, p1, v2

    .line 91
    .line 92
    if-lez p1, :cond_4

    .line 93
    .line 94
    cmpl-float p0, p0, v6

    .line 95
    .line 96
    check-cast v5, La/k5g;

    .line 97
    .line 98
    iget-object p1, v5, La/k5g;->b:La/n5g;

    .line 99
    .line 100
    if-lez p0, :cond_3

    .line 101
    .line 102
    sget-object p0, La/n5g;->S1:La/qud;

    .line 103
    .line 104
    invoke-virtual {p1}, La/n5g;->I0()La/h6g;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {p0, v1}, La/h6g;->z(I)V

    .line 109
    .line 110
    .line 111
    :goto_2
    move v3, v4

    .line 112
    goto :goto_3

    .line 113
    :cond_3
    sget-object p0, La/n5g;->S1:La/qud;

    .line 114
    .line 115
    invoke-virtual {p1}, La/n5g;->I0()La/h6g;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-virtual {p0, v4}, La/h6g;->z(I)V

    .line 120
    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_4
    :goto_3
    return v3

    .line 124
    :pswitch_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    if-nez p1, :cond_5

    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_5
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 135
    .line 136
    .line 137
    move-result p4

    .line 138
    sub-float/2addr p0, p4

    .line 139
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 140
    .line 141
    .line 142
    move-result p2

    .line 143
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    sub-float/2addr p2, p1

    .line 148
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 153
    .line 154
    .line 155
    move-result p2

    .line 156
    cmpl-float p1, p1, p2

    .line 157
    .line 158
    if-lez p1, :cond_8

    .line 159
    .line 160
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 161
    .line 162
    .line 163
    move-result p1

    .line 164
    cmpl-float p1, p1, v2

    .line 165
    .line 166
    if-lez p1, :cond_8

    .line 167
    .line 168
    cmpl-float p0, p0, v6

    .line 169
    .line 170
    check-cast v5, Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDayFlingRecyclerView;

    .line 171
    .line 172
    iget-object p1, v5, Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDayFlingRecyclerView;->p2:La/h5g;

    .line 173
    .line 174
    if-lez p0, :cond_7

    .line 175
    .line 176
    if-eqz p1, :cond_6

    .line 177
    .line 178
    check-cast p1, La/a1d;

    .line 179
    .line 180
    iget-object p0, p1, La/a1d;->b:Ljava/lang/Object;

    .line 181
    .line 182
    check-cast p0, La/n5g;

    .line 183
    .line 184
    sget-object p1, La/n5g;->S1:La/qud;

    .line 185
    .line 186
    invoke-virtual {p0}, La/n5g;->I0()La/h6g;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    invoke-virtual {p0, v1}, La/h6g;->z(I)V

    .line 191
    .line 192
    .line 193
    :cond_6
    :goto_4
    move v3, v4

    .line 194
    goto :goto_5

    .line 195
    :cond_7
    if-eqz p1, :cond_6

    .line 196
    .line 197
    check-cast p1, La/a1d;

    .line 198
    .line 199
    iget-object p0, p1, La/a1d;->b:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast p0, La/n5g;

    .line 202
    .line 203
    sget-object p1, La/n5g;->S1:La/qud;

    .line 204
    .line 205
    invoke-virtual {p0}, La/n5g;->I0()La/h6g;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    invoke-virtual {p0, v4}, La/h6g;->z(I)V

    .line 210
    .line 211
    .line 212
    goto :goto_4

    .line 213
    :cond_8
    :goto_5
    return v3

    .line 214
    nop

    .line 215
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/g5g;->a:B

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-super/range {p0 .. p1}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onSingleTapUp(Landroid/view/MotionEvent;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0

    .line 13
    :pswitch_0
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, La/g5g;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDayFlingRecyclerView;

    .line 19
    .line 20
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-virtual {v0, v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->J(FF)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    invoke-static {v1}, Landroidx/recyclerview/widget/RecyclerView;->U(Landroid/view/View;)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    const/4 v2, -0x1

    .line 39
    if-eq v1, v2, :cond_2

    .line 40
    .line 41
    iget-object v0, v0, Lorg/xplatform/cyber/calendar/impl/presentation/content/day/CyberCalendarDayFlingRecyclerView;->p2:La/h5g;

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    check-cast v0, La/a1d;

    .line 46
    .line 47
    iget-object v0, v0, La/a1d;->b:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, La/n5g;

    .line 50
    .line 51
    sget-object v3, La/n5g;->S1:La/qud;

    .line 52
    .line 53
    invoke-virtual {v0}, La/n5g;->H0()La/e5g;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    iget-object v3, v3, La/zz3;->e:La/yz3;

    .line 58
    .line 59
    iget-object v3, v3, La/yz3;->f:Ljava/util/List;

    .line 60
    .line 61
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    instance-of v3, v1, La/w5g;

    .line 66
    .line 67
    if-eqz v3, :cond_0

    .line 68
    .line 69
    check-cast v1, La/w5g;

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    const/4 v1, 0x0

    .line 73
    :goto_0
    if-eqz v1, :cond_1

    .line 74
    .line 75
    const-class v3, La/v4g;

    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-virtual {v4, v3}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    if-nez v4, :cond_1

    .line 90
    .line 91
    sget-object v4, La/v4g;->l2:La/kud;

    .line 92
    .line 93
    new-instance v5, Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;

    .line 94
    .line 95
    iget-object v6, v1, La/w5g;->c:Ljava/lang/String;

    .line 96
    .line 97
    iget-object v7, v1, La/w5g;->b:La/l7g;

    .line 98
    .line 99
    iget-object v8, v7, La/l7g;->a:Ljava/lang/String;

    .line 100
    .line 101
    move-object v9, v8

    .line 102
    iget-object v8, v7, La/l7g;->b:Ljava/lang/String;

    .line 103
    .line 104
    move-object v10, v9

    .line 105
    iget-object v9, v7, La/l7g;->c:Ljava/lang/String;

    .line 106
    .line 107
    move-object v11, v10

    .line 108
    iget-object v10, v7, La/l7g;->d:Ljava/lang/String;

    .line 109
    .line 110
    move-object v12, v11

    .line 111
    iget-object v11, v7, La/l7g;->e:Ljava/lang/String;

    .line 112
    .line 113
    move-object v14, v12

    .line 114
    iget-wide v12, v7, La/l7g;->f:J

    .line 115
    .line 116
    move-object/from16 p1, v3

    .line 117
    .line 118
    const/16 p0, 0x1

    .line 119
    .line 120
    iget-wide v2, v7, La/l7g;->g:J

    .line 121
    .line 122
    move-wide v15, v2

    .line 123
    iget-wide v1, v1, La/w5g;->a:J

    .line 124
    .line 125
    move-object v7, v14

    .line 126
    move-wide v14, v15

    .line 127
    move-wide/from16 v16, v1

    .line 128
    .line 129
    invoke-direct/range {v5 .. v17}, Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJ)V

    .line 130
    .line 131
    .line 132
    iget-object v1, v0, La/n5g;->R1:La/khf0;

    .line 133
    .line 134
    sget-object v2, La/n5g;->U1:[La/iiy;

    .line 135
    .line 136
    aget-object v2, v2, p0

    .line 137
    .line 138
    invoke-virtual {v1, v0, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    check-cast v1, Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;

    .line 143
    .line 144
    iget-boolean v1, v1, Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;->d:Z

    .line 145
    .line 146
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-static {v5, v1}, La/kud;->f(Lorg/xplatform/cyber/calendar/impl/presentation/container/champinfo/CyberCalendarChampInfoParams;Z)La/v4g;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    move-object/from16 v2, p1

    .line 158
    .line 159
    invoke-virtual {v1, v0, v2}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    goto :goto_1

    .line 163
    :cond_1
    const/16 p0, 0x1

    .line 164
    .line 165
    :goto_1
    move/from16 v2, p0

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_2
    const/4 v2, 0x0

    .line 169
    :goto_2
    return v2

    .line 170
    nop

    .line 171
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
